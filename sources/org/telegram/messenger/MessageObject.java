package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.URLSpan;
import android.util.Base64;
import android.view.View;
import java.io.BufferedReader;
import java.io.File;
import java.io.StringReader;
import java.net.URLEncoder;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.k21;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.xz0;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ej0;
import org.telegram.ui.gu0;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class MessageObject {
    public static final int ENTITIES_ALL = 0;
    public static final int ENTITIES_ONLY_HASHTAGS = 1;
    private static final int LINES_PER_BLOCK = 10;
    private static final int LINES_PER_BLOCK_WITH_EMOJI = 5;
    private static final int MESSAGE_ID_EPHEMERAL_BITS_MASK = 1610612736;
    private static final int MESSAGE_ID_RESERVED_BITS_MASK = 1879048192;
    public static final int MESSAGE_SEND_STATE_EDITING = 3;
    public static final int MESSAGE_SEND_STATE_SENDING = 1;
    public static final int MESSAGE_SEND_STATE_SEND_ERROR = 2;
    public static final int MESSAGE_SEND_STATE_SENT = 0;
    public static final int POSITION_FLAG_BOTTOM = 8;
    public static final int POSITION_FLAG_LEFT = 1;
    public static final int POSITION_FLAG_RIGHT = 2;
    public static final int POSITION_FLAG_TOP = 4;
    public static final int SUGGESTION_FLAG_EDIT_MEDIA = 8;
    public static final int SUGGESTION_FLAG_EDIT_PRCIE = 1;
    public static final int SUGGESTION_FLAG_EDIT_TEXT = 4;
    public static final int SUGGESTION_FLAG_EDIT_TIME = 2;
    public static final int TYPE_ACTION_PHOTO = 11;
    public static final int TYPE_ACTION_WALLPAPER = 22;
    public static final int TYPE_ANIMATED_STICKER = 15;
    public static final int TYPE_ARTICLE = 36;
    public static final int TYPE_COMMUNITY_CHANGED = 37;
    public static final int TYPE_CONTACT = 12;
    public static final int TYPE_DATE = 10;
    public static final int TYPE_EMOJIS = 19;
    public static final int TYPE_EXTENDED_MEDIA_PREVIEW = 20;
    public static final int TYPE_FILE = 9;
    public static final int TYPE_GEO = 4;
    public static final int TYPE_GIF = 8;
    public static final int TYPE_GIFT_OFFER = 33;
    public static final int TYPE_GIFT_OFFER_REJECTED = 34;
    public static final int TYPE_GIFT_PREMIUM = 18;
    public static final int TYPE_GIFT_PREMIUM_CHANNEL = 25;
    public static final int TYPE_GIFT_STARS = 30;
    public static final int TYPE_GIFT_THEME_UPDATE = 31;
    public static final int TYPE_GIVEAWAY = 26;
    public static final int TYPE_GIVEAWAY_RESULTS = 28;
    public static final int TYPE_JOINED_CHANNEL = 27;
    public static final int TYPE_LOADING = 6;
    public static final int TYPE_MUSIC = 14;
    public static final int TYPE_PAID_MEDIA = 29;
    public static final int TYPE_PHONE_CALL = 16;
    public static final int TYPE_PHOTO = 1;
    public static final int TYPE_POLL = 17;
    public static final int TYPE_ROUND_VIDEO = 5;
    public static final int TYPE_SHARING_OFFER = 35;
    public static final int TYPE_STICKER = 13;
    public static final int TYPE_STORY = 23;
    public static final int TYPE_STORY_MENTION = 24;
    public static final int TYPE_SUGGEST_BIRTHDAY = 32;
    public static final int TYPE_SUGGEST_PHOTO = 21;
    public static final int TYPE_TEXT = 0;
    public static final int TYPE_UNSUPPORTED = 38;
    public static final int TYPE_VIDEO = 3;
    public static final int TYPE_VOICE = 2;
    private static CharSequence channelSpan;
    static final String[] excludeWords = {" vs. ", " vs ", " versus ", " ft. ", " ft ", " featuring ", " feat. ", " feat ", " presents ", " pres. ", " pres ", " and ", " & ", " . "};
    private static CharSequence groupSpan;
    public static Pattern instagramUrlPattern;
    private static Pattern loginCodePattern;
    public static Pattern urlPattern;
    private static CharSequence[] userSpan;
    public static Pattern videoTimeUrlPattern;
    public long actionDeleteGroupEventId;
    public boolean animateComments;
    public int animatedEmojiCount;
    public boolean attachPathExists;
    public double attributeDuration;
    public Bitmap audioCover;
    public int audioPlayerDuration;
    public float audioProgress;
    public int audioProgressMs;
    public int audioProgressSec;
    public StringBuilder botButtonsLayout;
    public float bufferedProgress;
    public boolean business;
    private Integer cachedApproximateHeight;
    public Boolean cachedIsSupergroup;
    public k61 cachedQuality;
    public Float cachedSavedTimestamp;
    private Integer cachedStartsTimestamp;
    private Integer cachedTextHeight;
    public boolean cancelEditing;
    public CharSequence caption;
    private boolean captionSummarized;
    private boolean captionTranslated;
    private boolean channelJoined;
    public boolean channelJoinedExpanded;
    public ArrayList<TLRPC.PollAnswer> checkedVotes;
    public int contentType;
    public int currentAccount;
    public TLRPC.TL_channelAdminLogEvent currentEvent;
    public Drawable customAvatarDrawable;
    public String customName;
    public String customReplyName;
    public String dateKey;
    public int dateKeyInt;
    public boolean deleted;
    public boolean deletedByThanos;
    public TLRPC.Document documentToPollAddOption;
    public boolean drawServiceWithDefaultTypeface;
    public CharSequence editingMessage;
    public ArrayList<TLRPC.MessageEntity> editingMessageEntities;
    public boolean editingMessageSearchWebPage;
    public TLRPC.Document emojiAnimatedSticker;
    public String emojiAnimatedStickerColor;
    public Long emojiAnimatedStickerId;
    private boolean emojiAnimatedStickerLoading;
    public TLRPC.VideoSize emojiMarkup;
    public int emojiOnlyCount;
    public long eventId;
    public boolean expandedExplanation;
    public HashSet<Integer> expandedQuotes;
    public long extendedMediaLastCheckTime;
    public boolean factCheckExpanded;
    private CharSequence factCheckText;
    public boolean flickerLoading;
    public boolean forceAvatar;
    public boolean forceExpired;
    public boolean forcePlayEffect;
    public float forceSeekTo;
    public boolean forceShowPollResults;
    public boolean forceUpdate;
    private float generatedWithDensity;
    private float generatedWithFontSize;
    private int generatedWithMinSize;
    public float gifState;
    public boolean hadAnimationNotReadyLoading;
    public boolean hasCode;
    public boolean hasCodeAtBottom;
    public boolean hasCodeAtTop;
    public boolean hasQuote;
    public boolean hasQuoteAtBottom;
    public boolean hasRtl;
    public boolean hasSingleCode;
    public boolean hasSingleQuote;
    private boolean hasUnwrappedEmoji;
    public boolean hasWideCode;
    public boolean hideSendersName;
    public k61 highestQuality;
    public ArrayList<String> highlightedWords;
    private BotInlineKeyboard.Source inlineKeyboardSource;
    public boolean isBotPendingDraft;
    public boolean isDateObject;
    public boolean isDownloadingFile;
    private Boolean isEmbedVideoCached;
    public boolean isLiveStoryPush;
    public boolean isMediaSpoilersRevealed;
    public boolean isMediaSpoilersRevealedInSharedMedia;
    public boolean isOauthPush;
    public Boolean isOutOwnerCached;
    public boolean isPlayingExplanationObject;
    public boolean isPrimaryGroupMessage;
    public boolean isReactionPush;
    public boolean isRepostPreview;
    public boolean isRepostVideoPreview;
    public boolean isRestrictedMessage;
    private int isRoundVideoCached;
    public boolean isSaved;
    public boolean isSavedFiltered;
    public Boolean isSensitiveCached;
    public boolean isSpoilersRevealed;
    public boolean isStoryMentionPush;
    public boolean isStoryPush;
    public boolean isStoryPushHidden;
    public boolean isStoryReactionPush;
    public boolean isTopicMainMessage;
    public boolean isVideoConversionObject;
    public Object lastGeoWebFileLoaded;
    public Object lastGeoWebFileSet;
    public int lastLineWidth;
    private boolean layoutCreated;
    public CharSequence linkDescription;
    public long loadedFileSize;
    public boolean loadingCancelled;
    public boolean localChannel;
    public boolean localEdit;
    public long localGroupId;
    public String localName;
    public long localSentGroupId;
    public boolean localSupergroup;
    public int localType;
    public String localUserName;
    public boolean mediaExists;
    public ImageLocation mediaSmallThumb;
    public ImageLocation mediaThumb;
    public TLRPC.Message messageOwner;
    public CharSequence messageText;
    public CharSequence messageTextForReply;
    public CharSequence messageTextShort;
    public CharSequence messageTrimmedToHighlight;
    public boolean messageTrimmedToHighlightCut;
    public String monthKey;
    public boolean notime;
    public boolean openedInViewer;
    public int overrideLinkColor;
    public long overrideLinkEmoji;
    public TLRPC.TL_peerColorCollectible overrideLinkPeerColor;
    public jh.j6 parentStoriesList;
    public int parentWidth;
    public SvgHelper.SvgDrawable pathThumb;
    public ArrayList<TLRPC.PhotoSize> photoThumbs;
    public ArrayList<TLRPC.PhotoSize> photoThumbs2;
    public TLObject photoThumbsObject;
    public TLObject photoThumbsObject2;
    public boolean playedGiftAnimation;
    public long pollLastCheckTime;
    public ArrayList<Integer> pollMediaMapping;
    public boolean pollVisibleOnScreen;
    public boolean preview;
    public boolean previewForward;
    public String previousAttachPath;
    public TLRPC.MessageMedia previousMedia;
    public String previousMessage;
    public ArrayList<TLRPC.MessageEntity> previousMessageEntities;
    public boolean putInDownloadsStore;
    public TLRPC.Document qualityToSave;
    public String quick_reply_shortcut;
    public CharSequence quizExplanation;
    private byte[] randomWaveform;
    public boolean reactionsChanged;
    public long reactionsLastCheckTime;
    public int realDate;
    public MessageObject replyMessageObject;
    public boolean replyTextEllipsized;
    public boolean replyTextRevealed;
    public TLRPC.TL_forumTopic replyToForumTopic;
    public boolean resendAsIs;
    public boolean revealingMediaSpoilers;
    public boolean richCheckboxEcho;
    public RichMessageLayout richLayout;
    public int richMessageMediaType;
    public boolean scheduled;
    public boolean scheduledSent;
    public int searchType;
    private CharSequence secretOnceSpan;
    private CharSequence secretPlaySpan;
    public SendAnimationData sendAnimationData;
    public TLRPC.Peer sendAsPeer;
    public boolean sendPreview;
    public MediaController.PhotoEntry sendPreviewEntry;
    public boolean sentHighQuality;
    public boolean settingAvatar;
    public boolean shouldRemoveVideoEditedInfo;
    public boolean sideMenuEnabled;
    private boolean spoiledLoginCode;
    public String sponsoredAdditionalInfo;
    public String sponsoredButtonText;
    public boolean sponsoredCanReport;
    public TLRPC.PeerColor sponsoredColor;
    public byte[] sponsoredId;
    public String sponsoredInfo;
    public TLRPC.MessageMedia sponsoredMedia;
    public TLRPC.Photo sponsoredPhoto;
    public boolean sponsoredRecommended;
    public String sponsoredTitle;
    public String sponsoredUrl;
    public int stableId;
    public TL_stories.StoryItem storyItem;
    private TLRPC.WebPage storyMentionWebpage;
    public BitmapDrawable strippedThumb;
    public boolean summarized;
    public ArrayList<TextLayoutBlock> textLayoutBlocks;
    public int textWidth;
    public float textXOffset;
    public k61 thumbQuality;
    public Drawable[] topicIconDrawable;
    public int totalAnimatedEmojiCount;
    public boolean translated;
    public int type;
    public jh.r6 uploadingStory;
    public boolean useCustomPhoto;
    public CharSequence vCardData;
    public VideoEditedInfo videoEditedInfo;
    public ArrayList<i61> videoQualities;
    private Boolean videoQualitiesCached;
    public boolean viewsReloaded;
    public int wantedBotKeyboardWidth;
    public boolean wasJustSent;
    public boolean wasUnread;
    public ArrayList<TLRPC.MessageEntity> webPageDescriptionEntities;
    public CharSequence youtubeDescription;

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public static class GroupedMessagePosition {
        public float aspectRatio;
        public boolean edge;
        public int flags;
        public boolean last;
        public float left;
        public int leftSpanOffset;
        public byte maxX;
        public byte maxY;
        public byte minX;
        public byte minY;
        public float ph;
        public int photoHeight;
        public int photoWidth;
        public int pw;
        public float[] siblingHeights;
        public int spanSize;
        public float top;

        public void set(int i10, int i11, int i12, int i13, int i14, float f10, int i15) {
            this.minX = (byte) i10;
            this.maxX = (byte) i11;
            this.minY = (byte) i12;
            this.maxY = (byte) i13;
            this.pw = i14;
            this.spanSize = i14;
            this.ph = f10;
            this.flags = (byte) i15;
        }
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public static class SendAnimationData {
        public float currentScale;
        public float currentX;
        public float currentY;
        public org.telegram.ui.Cells.r1 fromParams;
        public boolean fromPreview;
        public float height;
        public float progress;
        public float timeAlpha;
        public float width;
        public float x;
        public float y;
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public static class TextLayoutBlock implements ej0 {
        public static final int FLAG_NOT_RTL = 2;
        public static final int FLAG_RTL = 1;
        public int charactersEnd;
        public int charactersOffset;
        public boolean code;
        public org.telegram.ui.Components.nc collapsedBounce;
        public int collapsedHeight;
        public Drawable copyIcon;
        public int copyIconColor;
        public Drawable copySelector;
        public int copySelectorColor;
        public Paint copySeparator;
        public pz0 copyText;
        public byte directionFlags;
        public boolean first;
        public boolean hasCodeCopyButton;
        public int height;
        public int heightByOffset;
        public int index;
        public String language;
        public int languageHeight;
        public pz0 languageLayout;
        public boolean last;
        public float maxRight;
        public MessageObject messageObject;
        public int originalWidth;
        public int padBottom;
        public int padTop;
        public boolean quote;
        public boolean quoteCollapse;
        public int start;
        public StaticLayout textLayout;
        public AtomicReference<Layout> spoilersPatchedTextLayout = new AtomicReference<>();
        public List<eh.k> spoilers = new ArrayList();

        private static String capitalizeFirst(String str) {
            return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        }

        public static String capitalizeLanguage(String str) {
            if (str == null) {
                return null;
            }
            String replaceAll = str.toLowerCase().replaceAll("\\W|lang$", "");
            replaceAll.getClass();
            switch (replaceAll) {
                case "actionscript":
                    return "ActionScript";
                case "aspnet":
                    return "ASP.NET";
                case "bbcode":
                    return "BBCode";
                case "csharp":
                case "cs":
                    return "C#";
                case "fsharp":
                    return "F#";
                case "matlab":
                case "r":
                case "tl":
                case "asm":
                case "css":
                case "csv":
                case "ini":
                case "jsx":
                case "php":
                case "qml":
                case "sql":
                case "tsx":
                case "xml":
                case "yml":
                case "glsl":
                case "hlsl":
                case "html":
                case "http":
                case "json":
                case "less":
                case "nasm":
                case "sass":
                case "scss":
                case "wasm":
                case "yaml":
                case "cobol":
                case "json5":
                case "jsonp":
                    return str.toUpperCase();
                case "python":
                case "py":
                    return "Python";
                case "typescript":
                case "ts":
                    return "TypeScript";
                case "js":
                case "javascript":
                    return "JavaScript";
                case "md":
                case "markdown":
                    return "Markdown";
                case "rb":
                case "ruby":
                    return "Ruby";
                case "cpp":
                    return "C++";
                case "tlb":
                case "tl-b":
                    return "TL-B";
                case "func":
                    return "FunC";
                case "objc":
                case "objectivec":
                    return "Objective-C";
                case "vbnet":
                    return "VB.NET";
                case "autohotkey":
                    return "AutoHotKey";
                case "visual-basic":
                    return "Visual Basic";
                case "gdscript":
                    return "GDScript";
                default:
                    return capitalizeFirst(str);
            }
        }

        public float collapsed(org.telegram.ui.Cells.r1 r1Var) {
            boolean collapsed;
            if (r1Var.e3) {
                HashSet hashSet = r1Var.d3;
                collapsed = true;
                if (hashSet != null && hashSet.contains(Integer.valueOf(this.index))) {
                    collapsed = false;
                }
            } else {
                collapsed = collapsed();
            }
            return AndroidUtilities.lerp(collapsed ? 1.0f : 0.0f, collapsed() ? 1.0f : 0.0f, r1Var.K1);
        }

        public void drawCopyCodeButton(Canvas canvas, RectF rectF, int i10, int i11, float f10) {
            if (this.hasCodeCopyButton) {
                int l1 = org.telegram.ui.ActionBar.g6.l1(0.1f, i10);
                if (this.copySelectorColor != l1) {
                    Drawable drawable = this.copySelector;
                    this.copySelectorColor = l1;
                    org.telegram.ui.ActionBar.g6.B1(drawable, l1, true);
                }
                this.copySelector.setBounds(AndroidUtilities.dp(3.0f) + ((int) rectF.left), (int) (rectF.bottom - AndroidUtilities.dp(38.0f)), (int) rectF.right, (int) rectF.bottom);
                int i12 = (int) (255.0f * f10);
                this.copySelector.setAlpha(i12);
                if (this.copySelector.getCallback() != null) {
                    this.copySelector.draw(canvas);
                }
                this.copySeparator.setColor(i0.b.k(i11, 38));
                canvas.drawRect(rectF.left + AndroidUtilities.dp(10.0f), (rectF.bottom - AndroidUtilities.dp(38.0f)) - AndroidUtilities.getShadowHeight(), rectF.right - AndroidUtilities.dp(6.66f), rectF.bottom - AndroidUtilities.dp(38.0f), this.copySeparator);
                float centerX = rectF.centerX() - (Math.min(rectF.width() - AndroidUtilities.dp(12.0f), ((this.copyIcon.getIntrinsicWidth() * 0.8f) + AndroidUtilities.dp(5.0f)) + this.copyText.c) / 2.0f);
                float dp = rectF.bottom - (AndroidUtilities.dp(38.0f) / 2.0f);
                if (this.copyIconColor != i10) {
                    Drawable drawable2 = this.copyIcon;
                    this.copyIconColor = i10;
                    drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
                this.copyIcon.setAlpha(i12);
                this.copyIcon.setBounds((int) centerX, (int) (dp - ((r2.getIntrinsicHeight() * 0.8f) / 2.0f)), (int) ((this.copyIcon.getIntrinsicWidth() * 0.8f) + centerX), (int) a9.p.d(this.copyIcon.getIntrinsicHeight(), 0.8f, 2.0f, dp));
                this.copyIcon.draw(canvas);
                pz0 pz0Var = this.copyText;
                pz0Var.p = AndroidUtilities.dp(12.0f) + ((int) (r1 - ((this.copyIcon.getIntrinsicWidth() * 0.8f) + AndroidUtilities.dp(5.0f))));
                pz0Var.c((this.copyIcon.getIntrinsicWidth() * 0.8f) + AndroidUtilities.dp(5.0f) + centerX, dp, f10, i10, canvas);
            }
        }

        @Override // org.telegram.ui.ej0
        public Layout getLayout() {
            return this.textLayout;
        }

        @Override // org.telegram.ui.ej0
        public View getParentView() {
            return null;
        }

        public int height() {
            return (this.quoteCollapse && collapsed()) ? this.collapsedHeight : this.height;
        }

        public int heightCollapsed() {
            return this.quoteCollapse ? this.collapsedHeight : this.height;
        }

        public boolean isRtl() {
            byte b10 = this.directionFlags;
            return (b10 & 1) != 0 && (b10 & 2) == 0;
        }

        public void layoutCode(String str, int i10, boolean z10) {
            boolean z11 = i10 >= 75 && !z10;
            this.hasCodeCopyButton = z11;
            if (z11) {
                this.copyText = new pz0(LocaleController.getString(R.string.CopyCode).toUpperCase(), SharedConfig.fontSize - 3, AndroidUtilities.bold());
                Drawable mutate = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_copy).mutate();
                this.copyIcon = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(this.copyIconColor, PorterDuff.Mode.SRC_IN));
                this.copySelector = org.telegram.ui.ActionBar.g6.a0(this.copySelectorColor, 0, 0, Math.min(5, SharedConfig.bubbleRadius), 0);
                this.copySeparator = new Paint(1);
            }
            if (TextUtils.isEmpty(str)) {
                this.language = null;
                this.languageLayout = null;
            } else {
                this.language = str;
                pz0 pz0Var = new pz0(capitalizeLanguage(str), (SharedConfig.fontSize - 1) - (CodeHighlighting.getTextSizeDecrement(i10) / 2), AndroidUtilities.bold());
                this.languageLayout = pz0Var;
                this.languageHeight = AndroidUtilities.dp(4.0f) + ((int) (pz0Var.a.getTextSize() * 1.714f));
            }
        }

        public float textYOffset(ArrayList<TextLayoutBlock> arrayList) {
            TextLayoutBlock textLayoutBlock;
            if (arrayList == null) {
                return 0.0f;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size() && (textLayoutBlock = arrayList.get(i11)) != this; i11++) {
                i10 += textLayoutBlock.height() + textLayoutBlock.padTop + textLayoutBlock.padBottom;
            }
            return i10;
        }

        public int height(org.telegram.ui.Cells.r1 r1Var) {
            return !this.quoteCollapse ? this.height : AndroidUtilities.lerp(this.height, this.collapsedHeight, collapsed(r1Var));
        }

        public boolean collapsed() {
            HashSet<Integer> hashSet;
            MessageObject messageObject = this.messageObject;
            return messageObject == null || (hashSet = messageObject.expandedQuotes) == null || !hashSet.contains(Integer.valueOf(this.index));
        }

        public float textYOffset(ArrayList<TextLayoutBlock> arrayList, org.telegram.ui.Cells.r1 r1Var) {
            TextLayoutBlock textLayoutBlock;
            if (arrayList == null) {
                return 0.0f;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size() && (textLayoutBlock = arrayList.get(i11)) != this; i11++) {
                i10 += textLayoutBlock.height(r1Var) + textLayoutBlock.padTop + textLayoutBlock.padBottom;
            }
            return i10;
        }
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public static class VCardData {
        private String company;
        private ArrayList<String> emails = new ArrayList<>();
        private ArrayList<String> phones = new ArrayList<>();

        public static CharSequence parse(String str) {
            CharSequence charSequence;
            byte[] decodeQuotedPrintable;
            try {
                BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
                int i10 = 0;
                boolean z10 = false;
                VCardData vCardData = null;
                String str2 = null;
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (!readLine.startsWith("PHOTO")) {
                        if (readLine.indexOf(58) >= 0) {
                            if (readLine.startsWith("BEGIN:VCARD")) {
                                vCardData = new VCardData();
                            } else if (readLine.startsWith("END:VCARD") && vCardData != null) {
                                z10 = true;
                            }
                        }
                        if (str2 != null) {
                            readLine = str2 + readLine;
                            str2 = null;
                        }
                        if (readLine.contains("=QUOTED-PRINTABLE") && readLine.endsWith("=")) {
                            str2 = readLine.substring(i10, readLine.length() - 1);
                        } else {
                            int indexOf = readLine.indexOf(":");
                            String[] strArr = indexOf >= 0 ? new String[]{readLine.substring(i10, indexOf), readLine.substring(indexOf + 1).trim()} : new String[]{readLine.trim()};
                            if (strArr.length >= 2 && vCardData != null) {
                                if (strArr[i10].startsWith("ORG")) {
                                    String[] split = strArr[i10].split(";");
                                    int length = split.length;
                                    int i11 = 0;
                                    String str3 = null;
                                    String str4 = null;
                                    while (i11 < length) {
                                        String[] split2 = split[i11].split("=");
                                        charSequence = null;
                                        try {
                                            if (split2.length == 2) {
                                                if (split2[i10].equals("CHARSET")) {
                                                    str4 = split2[1];
                                                } else if (split2[0].equals("ENCODING")) {
                                                    str3 = split2[1];
                                                }
                                            }
                                            i11++;
                                            i10 = 0;
                                        } catch (Throwable unused) {
                                            return charSequence;
                                        }
                                    }
                                    vCardData.company = strArr[1];
                                    if (str3 != null && str3.equalsIgnoreCase("QUOTED-PRINTABLE") && (decodeQuotedPrintable = AndroidUtilities.decodeQuotedPrintable(AndroidUtilities.getStringBytes(vCardData.company))) != null && decodeQuotedPrintable.length != 0) {
                                        vCardData.company = new String(decodeQuotedPrintable, str4);
                                    }
                                    vCardData.company = vCardData.company.replace(';', ' ');
                                } else if (strArr[0].startsWith("TEL")) {
                                    if (strArr[1].length() > 0) {
                                        vCardData.phones.add(strArr[1]);
                                    }
                                } else if (strArr[0].startsWith("EMAIL")) {
                                    String str5 = strArr[1];
                                    if (str5.length() > 0) {
                                        vCardData.emails.add(str5);
                                    }
                                }
                            }
                            i10 = 0;
                        }
                    }
                    return charSequence;
                }
                charSequence = null;
                try {
                    bufferedReader.close();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                if (!z10) {
                    return null;
                }
                StringBuilder sb2 = new StringBuilder();
                for (int i12 = 0; i12 < vCardData.phones.size(); i12++) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    String str6 = vCardData.phones.get(i12);
                    if (!str6.contains("#") && !str6.contains("*")) {
                        sb2.append(oe.b.c().b(str6));
                    }
                    sb2.append(str6);
                }
                for (int i13 = 0; i13 < vCardData.emails.size(); i13++) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(oe.b.c().b(vCardData.emails.get(i13)));
                }
                if (!TextUtils.isEmpty(vCardData.company)) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(vCardData.company);
                }
                return sb2;
            } catch (Throwable unused2) {
                return null;
            }
        }
    }

    public MessageObject(int i10, TL_stories.StoryItem storyItem) {
        this.type = MediaDataController.MAX_STYLE_RUNS_COUNT;
        this.forceSeekTo = -1.0f;
        this.actionDeleteGroupEventId = -1L;
        this.overrideLinkColor = -1;
        this.overrideLinkEmoji = -1L;
        this.messageTrimmedToHighlightCut = true;
        this.topicIconDrawable = new Drawable[1];
        this.spoiledLoginCode = false;
        this.translated = false;
        this.summarized = false;
        this.currentAccount = i10;
        this.storyItem = storyItem;
        if (storyItem != null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            this.messageOwner = tL_message;
            tL_message.id = storyItem.messageId;
            tL_message.realId = storyItem.id;
            tL_message.date = storyItem.date;
            tL_message.dialog_id = storyItem.dialogId;
            tL_message.message = storyItem.caption;
            tL_message.entities = storyItem.entities;
            tL_message.media = storyItem.media;
            tL_message.attachPath = storyItem.attachPath;
        }
        this.photoThumbs = new ArrayList<>();
        this.photoThumbs2 = new ArrayList<>();
    }

    private boolean addEntitiesToText(CharSequence charSequence, boolean z10) {
        return addEntitiesToText(charSequence, false, z10);
    }

    public static void addLinks(boolean z10, CharSequence charSequence) {
        addLinks(z10, charSequence, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ef A[Catch: Exception -> 0x0253, TryCatch #0 {Exception -> 0x0253, blocks: (B:8:0x0012, B:10:0x0016, B:11:0x001e, B:12:0x004a, B:17:0x0050, B:18:0x0054, B:22:0x005e, B:25:0x0072, B:29:0x0084, B:30:0x0086, B:39:0x00a6, B:46:0x0237, B:48:0x0241, B:50:0x0244, B:51:0x0249, B:55:0x00d0, B:58:0x00f5, B:59:0x0116, B:60:0x0137, B:63:0x013f, B:65:0x0156, B:67:0x0162, B:68:0x016b, B:74:0x00a0, B:76:0x0177, B:79:0x01b8, B:83:0x01cb, B:86:0x01da, B:88:0x01e4, B:91:0x01ea, B:93:0x01ef, B:98:0x01ff, B:100:0x0231, B:101:0x0219, B:110:0x0025, B:112:0x0029, B:113:0x0031, B:114:0x0038, B:116:0x003c, B:117:0x0044), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void addUrlsByPattern(boolean z10, CharSequence charSequence, boolean z11, int i10, int i11, boolean z12) {
        Matcher matcher;
        char c10;
        int i12;
        String str;
        URLSpan[] uRLSpanArr;
        int i13;
        r41 r41Var;
        Object[] objArr;
        r41 o41Var;
        if (charSequence == null) {
            return;
        }
        int i14 = 3;
        int i15 = 1;
        try {
            if (i10 == 3 || i10 == 4) {
                if (videoTimeUrlPattern == null) {
                    videoTimeUrlPattern = Pattern.compile("\\b(?:(\\d{1,2}):)?(\\d{1,3}):([0-5][0-9])\\b(?: - |)([^\\n]*)");
                }
                matcher = videoTimeUrlPattern.matcher(charSequence);
            } else if (i10 == 1) {
                if (instagramUrlPattern == null) {
                    instagramUrlPattern = Pattern.compile("(^|\\s|\\()@[a-zA-Z\\d_.]{1,32}|(^|\\s|\\()#[\\w.]+");
                }
                matcher = instagramUrlPattern.matcher(charSequence);
            } else {
                if (urlPattern == null) {
                    urlPattern = Pattern.compile("(^|\\s)/[a-zA-Z@\\d_]{1,255}|(^|\\s|\\()@[a-zA-Z\\d_]{1,32}|(^|\\s|\\()#[^0-9][\\w.]+(@[^0-9][\\w.]+)?|(^|\\s|\\()\\$[^0-9][\\w.]+(@[^0-9][\\w.]+)?|(^|\\s)\\$[A-Z]{3,8}([ ,.]|$)");
                }
                matcher = urlPattern.matcher(charSequence);
            }
            if (charSequence instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence;
                int i16 = 0;
                while (matcher.find() && i16 < 100) {
                    int start = matcher.start();
                    int end = matcher.end();
                    r41 r41Var2 = null;
                    if (i10 == i14 || i10 == 4) {
                        c10 = 0;
                        matcher.groupCount();
                        int start2 = matcher.start(i15);
                        int end2 = matcher.end(i15);
                        int start3 = matcher.start(2);
                        int end3 = matcher.end(2);
                        int start4 = matcher.start(i14);
                        int end4 = matcher.end(i14);
                        int start5 = matcher.start(4);
                        i12 = i16;
                        int end5 = matcher.end(4);
                        int intValue = Utilities.parseInt(charSequence.subSequence(start3, end3)).intValue();
                        int intValue2 = Utilities.parseInt(charSequence.subSequence(start4, end4)).intValue();
                        int intValue3 = (start2 < 0 || end2 < 0) ? -1 : Utilities.parseInt(charSequence.subSequence(start2, end2)).intValue();
                        if (start5 >= 0 && end5 >= 0) {
                            str = charSequence.subSequence(start5, end5).toString();
                            if (start5 < 0 || end5 >= 0) {
                                end = end4;
                            }
                            uRLSpanArr = (URLSpan[]) spannable.getSpans(start, end, URLSpan.class);
                            if (uRLSpanArr != null || uRLSpanArr.length <= 0) {
                                i13 = (intValue * 60) + intValue2;
                                if (intValue3 > 0) {
                                    i13 += intValue3 * 3600;
                                }
                                if (i13 <= i11) {
                                    if (i10 == 3) {
                                        r41Var = new r41("video?" + i13, (xz0) null);
                                    } else {
                                        r41Var = new r41("audio?" + i13, (xz0) null);
                                    }
                                    r41Var2 = r41Var;
                                    r41Var2.d = str;
                                    if (r41Var2 != null) {
                                        if (z12 && (objArr = (ClickableSpan[]) spannable.getSpans(start, end, ClickableSpan.class)) != null && objArr.length > 0) {
                                            spannable.removeSpan(objArr[c10]);
                                        }
                                        spannable.setSpan(r41Var2, start, end, 0);
                                        i16 = i12 + 1;
                                        i14 = 3;
                                        i15 = 1;
                                    }
                                }
                            }
                            i16 = i12;
                            i14 = 3;
                            i15 = 1;
                        }
                        str = null;
                        if (start5 < 0) {
                        }
                        end = end4;
                        uRLSpanArr = (URLSpan[]) spannable.getSpans(start, end, URLSpan.class);
                        if (uRLSpanArr != null) {
                        }
                        i13 = (intValue * 60) + intValue2;
                        if (intValue3 > 0) {
                        }
                        if (i13 <= i11) {
                        }
                        i16 = i12;
                        i14 = 3;
                        i15 = 1;
                    } else {
                        char charAt = charSequence.charAt(start);
                        c10 = 0;
                        if (i10 != 0) {
                            if (charAt != '@' && charAt != '#') {
                                start++;
                            }
                            charAt = charSequence.charAt(start);
                            if (charAt != '@' && charAt != '#') {
                                i12 = i16;
                                i16 = i12;
                                i14 = 3;
                                i15 = 1;
                            }
                        } else if (charAt != '@' && charAt != '#' && charAt != '/' && charAt != '$') {
                            start++;
                        }
                        if (i10 == i15) {
                            if (charAt == '@') {
                                o41Var = new r41("https://instagram.com/" + charSequence.subSequence(start + 1, end).toString(), (xz0) null);
                            } else {
                                o41Var = new r41("https://www.instagram.com/explore/tags/" + charSequence.subSequence(start + 1, end).toString(), (xz0) null);
                            }
                        } else if (i10 == 2) {
                            if (charAt == '@') {
                                o41Var = new r41("https://twitter.com/" + charSequence.subSequence(start + 1, end).toString(), (xz0) null);
                            } else {
                                o41Var = new r41("https://twitter.com/hashtag/" + charSequence.subSequence(start + 1, end).toString(), (xz0) null);
                            }
                        } else if (charSequence.charAt(start) != '/') {
                            String charSequence2 = charSequence.subSequence(start, end).toString();
                            if (charSequence2 != null) {
                                charSequence2 = charSequence2.replaceAll("∕|⁄|%E2%81%84|%E2%88%95", "/");
                            }
                            i12 = i16;
                            r41Var2 = new r41(charSequence2, (xz0) null);
                            if (r41Var2 != null) {
                            }
                        } else if (z11) {
                            o41Var = new o41(charSequence.subSequence(start, end).toString(), z10 ? 1 : 0, null);
                            r41Var2 = o41Var;
                            i12 = i16;
                            if (r41Var2 != null) {
                            }
                        } else {
                            i12 = i16;
                            if (r41Var2 != null) {
                            }
                        }
                        r41Var2 = o41Var;
                        i12 = i16;
                        if (r41Var2 != null) {
                        }
                    }
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    private boolean allowsBigEmoji() {
        TLRPC.Peer peer;
        if (!SharedConfig.allowBigEmoji) {
            return false;
        }
        TLRPC.Message message = this.messageOwner;
        if (message != null && (peer = message.peer_id) != null && (peer.channel_id != 0 || peer.chat_id != 0)) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            TLRPC.Peer peer2 = this.messageOwner.peer_id;
            long j10 = peer2.channel_id;
            if (j10 == 0) {
                j10 = peer2.chat_id;
            }
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if ((chat == null || !chat.gigagroup) && ChatObject.isActionBanned(chat, 8) && !ChatObject.hasAdminRights(chat)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r8.messageOwner.send_state == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (r8.messageOwner.id >= 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean applyEntities() {
        generateLinkDescription();
        spoilLoginCode();
        boolean z10 = false;
        if (!(this.messageOwner.send_state != 0 ? false : !getEntities().isEmpty())) {
            if (this.eventId == 0) {
                TLRPC.Message message = this.messageOwner;
                if (!(message instanceof TLRPC.TL_message_old)) {
                    if (!(message instanceof TLRPC.TL_message_old2)) {
                        if (!(message instanceof TLRPC.TL_message_old3)) {
                            if (!(message instanceof TLRPC.TL_message_old4)) {
                                if (!(message instanceof TLRPC.TL_messageForwarded_old)) {
                                    if (!(message instanceof TLRPC.TL_messageForwarded_old2)) {
                                        if (!(message instanceof TLRPC.TL_message_secret)) {
                                            if (!(getMedia(message) instanceof TLRPC.TL_messageMediaInvoice)) {
                                                if (isOut()) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            z10 = true;
        }
        if (z10) {
            addLinks(isOutOwner(), this.messageText, true, true);
        } else {
            addPhoneLinks(this.messageText);
        }
        if (isYouTubeVideo()) {
            addUrlsByPattern(isOutOwner(), this.messageText, false, 3, ConnectionsManager.DEFAULT_DATACENTER_ID, false);
        } else {
            applyTimestampsHighlightForReplyMsg();
        }
        if (!(this.messageText instanceof Spannable)) {
            this.messageText = new SpannableStringBuilder(this.messageText);
        }
        return addEntitiesToText(this.messageText, z10);
    }

    public static boolean canAutoplayAnimatedSticker(TLRPC.Document document) {
        return (isAnimatedStickerDocument(document, true) || isVideoStickerDocument(document)) && LiteMode.isEnabled(1);
    }

    public static boolean canCreateStripedThubms() {
        return SharedConfig.getDevicePerformanceClass() == 2;
    }

    public static boolean canShowVotersList(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults;
        if (tL_messageMediaPoll != null && (pollResults = tL_messageMediaPoll.results) != null && !pollResults.results.isEmpty()) {
            TLRPC.Poll poll = tL_messageMediaPoll.poll;
            if (poll.public_voters) {
                if (poll.closed || poll.creator) {
                    return true;
                }
                if (isVoted(tL_messageMediaPoll) && !tL_messageMediaPoll.poll.hide_results_until_close) {
                    return true;
                }
            }
        }
        return false;
    }

    public static CharSequence channelSpan() {
        if (channelSpan == null) {
            channelSpan = new SpannableStringBuilder("c");
            cq cqVar = new cq(R.drawable.msg_folders_channels, 0);
            cqVar.setScale(0.7f, 0.7f);
            ((SpannableStringBuilder) channelSpan).setSpan(cqVar, 0, 1, 33);
        }
        return channelSpan;
    }

    private void checkEmojiOnly(int[] iArr) {
        checkEmojiOnly(iArr == null ? null : Integer.valueOf(iArr[0]));
    }

    public static SpannableStringBuilder checkboxSpan(boolean z10) {
        return span(z10 ? "✅" : "☑️", z10 ? R.drawable.iv_checkbox_on : R.drawable.iv_checkbox_off);
    }

    public static boolean containsUrls(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() >= 2 && charSequence.length() <= 20480) {
            int length = charSequence.length();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            char c10 = 0;
            while (i10 < length) {
                char charAt = charSequence.charAt(i10);
                if (charAt >= '0' && charAt <= '9') {
                    i11++;
                    if (i11 >= 6) {
                        return true;
                    }
                    i12 = 0;
                    i13 = 0;
                } else if (charAt == ' ' || i11 <= 0) {
                    i11 = 0;
                }
                if ((charAt != '@' && charAt != '#' && charAt != '/' && charAt != '$') || i10 != 0) {
                    if (i10 != 0) {
                        int i14 = i10 - 1;
                        if (charSequence.charAt(i14) != ' ') {
                            if (charSequence.charAt(i14) == '\n') {
                            }
                        }
                    }
                    if (charAt == ':') {
                        if (i12 == 0) {
                            i12 = 1;
                        }
                        i12 = 0;
                    } else if (charAt != '/') {
                        if (charAt == '.') {
                            if (i13 == 0 && c10 != ' ') {
                                i13++;
                            }
                        } else if (charAt != ' ' && c10 == '.' && i13 == 1) {
                            return true;
                        }
                        i13 = 0;
                    } else {
                        if (i12 == 2) {
                            return true;
                        }
                        if (i12 == 1) {
                            i12++;
                        }
                        i12 = 0;
                    }
                    i10++;
                    c10 = charAt;
                }
                return true;
            }
        }
        return false;
    }

    private void createDateArray(int i10, TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent, ArrayList<MessageObject> arrayList, HashMap<String, ArrayList<MessageObject>> hashMap, boolean z10) {
        if (hashMap.get(this.dateKey) == null) {
            hashMap.put(this.dateKey, new ArrayList<>());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = LocaleController.formatDateChat(tL_channelAdminLogEvent.date);
            tL_message.id = 0;
            tL_message.date = tL_channelAdminLogEvent.date;
            MessageObject messageObject = new MessageObject(i10, tL_message, false, false);
            messageObject.type = 10;
            messageObject.contentType = 1;
            messageObject.isDateObject = true;
            if (z10) {
                arrayList.add(0, messageObject);
            } else {
                arrayList.add(messageObject);
            }
        }
    }

    private void createPathThumb() {
        TLRPC.Document document = getDocument();
        if (document == null) {
            return;
        }
        this.pathThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.lc, 1.0f);
    }

    public static void cutIntoRanges(CharSequence charSequence, ArrayList<TextRange> arrayList) {
        String str;
        int i10;
        if (charSequence == null) {
            return;
        }
        if (!(charSequence instanceof Spanned)) {
            arrayList.add(new TextRange(0, charSequence.length()));
            return;
        }
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        Spanned spanned = (Spanned) charSequence;
        gi0[] gi0VarArr = (gi0[]) spanned.getSpans(0, spanned.length(), gi0.class);
        int i11 = 0;
        while (true) {
            if (i11 >= gi0VarArr.length) {
                break;
            }
            gi0 gi0Var = gi0VarArr[i11];
            gi0Var.a.b = false;
            int spanStart = spanned.getSpanStart(gi0Var);
            int spanEnd = spanned.getSpanEnd(gi0VarArr[i11]);
            treeSet.add(Integer.valueOf(spanStart));
            hashMap.put(Integer.valueOf(spanStart), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanStart)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue() : 0) | (gi0VarArr[i11].a.e ? 16 : 1)));
            treeSet.add(Integer.valueOf(spanEnd));
            hashMap.put(Integer.valueOf(spanEnd), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue() : 0) | 2));
            i11++;
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            if (intValue >= 0 && intValue < spanned.length() && hashMap.containsKey(num)) {
                int intValue2 = ((Integer) hashMap.get(num)).intValue();
                if ((intValue2 & 17) != 0 && (intValue2 & 2) != 0 && spanned.charAt(intValue) != '\n' && (intValue - 1 <= 0 || spanned.charAt(i10) != '\n')) {
                    it.remove();
                    hashMap.remove(num);
                }
            }
        }
        CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) spanned.getSpans(0, spanned.length(), CodeHighlighting.Span.class);
        for (int i12 = 0; i12 < spanArr.length; i12++) {
            int spanStart2 = spanned.getSpanStart(spanArr[i12]);
            int spanEnd2 = spanned.getSpanEnd(spanArr[i12]);
            treeSet.add(Integer.valueOf(spanStart2));
            hashMap.put(Integer.valueOf(spanStart2), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanStart2)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart2))).intValue() : 0) | 4));
            treeSet.add(Integer.valueOf(spanEnd2));
            hashMap.put(Integer.valueOf(spanEnd2), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd2)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd2))).intValue() : 0) | 8));
        }
        Iterator it2 = treeSet.iterator();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        boolean z10 = false;
        while (it2.hasNext()) {
            Integer num2 = (Integer) it2.next();
            int intValue3 = num2.intValue();
            int intValue4 = ((Integer) hashMap.get(num2)).intValue();
            if (i16 != intValue3) {
                int i17 = intValue3 - 1;
                if (i17 >= 0 && i17 < charSequence.length() && charSequence.charAt(i17) == '\n') {
                    intValue3--;
                }
                int i18 = intValue3;
                if ((intValue4 & 8) == 0 || i15 >= spanArr.length) {
                    str = null;
                } else {
                    str = spanArr[i15].lng;
                    i15++;
                }
                int i19 = i15;
                arrayList.add(new TextRange(i16, i18, i13 > 0, i14 > 0, z10, str));
                i16 = i18 + 1;
                if (i16 >= charSequence.length() || charSequence.charAt(i18) != '\n') {
                    i16 = i18;
                }
                i15 = i19;
            }
            if ((intValue4 & 2) != 0) {
                i13--;
            }
            if ((intValue4 & 1) != 0 || (intValue4 & 16) != 0) {
                i13++;
                z10 = (intValue4 & 16) != 0;
            }
            if ((intValue4 & 8) != 0) {
                i14--;
            }
            if ((intValue4 & 4) != 0) {
                i14++;
            }
        }
        if (i16 < charSequence.length()) {
            arrayList.add(new TextRange(i16, charSequence.length(), i13 > 0, i14 > 0, z10, null));
        }
    }

    public static int ephemeralMessageIdPack(int i10) {
        return (i10 & (-1879048193)) | MESSAGE_ID_EPHEMERAL_BITS_MASK;
    }

    public static int ephemeralMessageIdUnpack(int i10) {
        return isEphemeralMessageId(i10) ? i10 & (-1879048193) : i10;
    }

    public static boolean expandedQuotesEquals(HashSet<Integer> hashSet, HashSet<Integer> hashSet2) {
        if (hashSet == null && hashSet2 == null) {
            return true;
        }
        return (hashSet == null ? 0 : hashSet.size()) == (hashSet2 == null ? 0 : hashSet2.size()) && hashSet != null && hashSet.equals(hashSet2);
    }

    public static String findAnimatedEmojiEmoticon(TLRPC.Document document) {
        return findAnimatedEmojiEmoticon(document, "😀");
    }

    public static TLRPC.Document findAudio(TL_iv.RichMessage richMessage) {
        if (richMessage == null) {
            return null;
        }
        return findAudio(richMessage.blocks, richMessage);
    }

    public static TLRPC.Photo findPhoto(TL_iv.RichMessage richMessage) {
        if (richMessage == null) {
            return null;
        }
        return findPhoto(richMessage.blocks, richMessage);
    }

    public static TLRPC.PollAnswer findPollItem(MessageObject messageObject, byte[] bArr) {
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        TLRPC.Poll poll;
        TLRPC.MessageMedia media = getMedia(messageObject);
        if ((media instanceof TLRPC.TL_messageMediaPoll) && (poll = (tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media).poll) != null && poll.answers != null) {
            for (int i10 = 0; i10 < tL_messageMediaPoll.poll.answers.size(); i10++) {
                TLRPC.PollAnswer pollAnswer = tL_messageMediaPoll.poll.answers.get(i10);
                if (Arrays.equals(pollAnswer.option, bArr)) {
                    return pollAnswer;
                }
            }
        }
        return null;
    }

    public static int findQuoteStart(String str, String str2, int i10) {
        if (str == null || str2 == null) {
            return -1;
        }
        if (i10 == -1) {
            return str.indexOf(str2);
        }
        if (str2.length() + i10 < str.length() && str.startsWith(str2, i10)) {
            return i10;
        }
        int indexOf = str.indexOf(str2, i10);
        int lastIndexOf = str.lastIndexOf(str2, i10);
        return (indexOf != -1 && (lastIndexOf == -1 || indexOf - i10 < i10 - lastIndexOf)) ? indexOf : lastIndexOf;
    }

    public static ArrayList<String> findStickerEmoticons(TLRPC.Document document, Integer num) {
        if (document == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeSticker)) {
                if (num != null) {
                    TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(num.intValue()).getStickerSet(documentAttribute.stickerset, true);
                    if (stickerSet != null && stickerSet.packs != null) {
                        for (int i11 = 0; i11 < stickerSet.packs.size(); i11++) {
                            TLRPC.TL_stickerPack tL_stickerPack = stickerSet.packs.get(i11);
                            if (tL_stickerPack.documents.contains(Long.valueOf(document.id)) && Emoji.getEmojiDrawable(tL_stickerPack.emoticon) != null) {
                                arrayList.add(tL_stickerPack.emoticon);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return arrayList;
                    }
                }
                if (!TextUtils.isEmpty(documentAttribute.alt) && Emoji.getEmojiDrawable(documentAttribute.alt) != null) {
                    arrayList.add(documentAttribute.alt);
                    return arrayList;
                }
            }
        }
        return null;
    }

    public static TLRPC.TodoItem findTodoItem(MessageObject messageObject, int i10) {
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo;
        TLRPC.TodoList todoList;
        TLRPC.MessageMedia media = getMedia(messageObject);
        if ((media instanceof TLRPC.TL_messageMediaToDo) && (todoList = (tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) media).todo) != null && todoList.list != null) {
            for (int i11 = 0; i11 < tL_messageMediaToDo.todo.list.size(); i11++) {
                TLRPC.TodoItem todoItem = tL_messageMediaToDo.todo.list.get(i11);
                if (todoItem.id == i10) {
                    return todoItem;
                }
            }
        }
        return null;
    }

    public static TLRPC.Document findVideo(TL_iv.RichMessage richMessage) {
        if (richMessage == null) {
            return null;
        }
        return findVideo(richMessage.blocks, richMessage);
    }

    public static void fixMessagePeer(ArrayList<TLRPC.Message> arrayList, long j10) {
        if (arrayList == null || arrayList.isEmpty() || j10 == 0) {
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.Message message = arrayList.get(i10);
            if (message instanceof TLRPC.TL_messageEmpty) {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                message.peer_id = tL_peerChannel;
                tL_peerChannel.channel_id = j10;
            }
        }
    }

    public static CharSequence formatRichBlock(TL_iv.PageBlock pageBlock, boolean z10, boolean z11, int i10, SpannableStringBuilder spannableStringBuilder, TL_iv.RichMessage richMessage) {
        TLRPC.Document document;
        int i11;
        if ((pageBlock instanceof TL_iv.pageBlockTitle) || (pageBlock instanceof TL_iv.pageBlockHeader) || (pageBlock instanceof TL_iv.pageBlockSubheader) || (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote)) {
            formatRichText(pageBlock.text, z10, z11, i10, spannableStringBuilder, 1);
            return spannableStringBuilder;
        }
        if ((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockFooter) || (pageBlock instanceof TL_iv.pageBlockKicker)) {
            formatRichText(pageBlock.text, z10, z11, i10, spannableStringBuilder, 0);
            return spannableStringBuilder;
        }
        int i12 = 0;
        if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
            TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
            while (i12 < pageblockblockquoteblocks.blocks.size()) {
                if (i12 > 0) {
                    spannableStringBuilder.append("  ");
                }
                formatRichBlock(pageblockblockquoteblocks.blocks.get(i12), z10, z11, i10, spannableStringBuilder, richMessage);
                if (spannableStringBuilder.length() >= i10) {
                    spannableStringBuilder.delete(i10, spannableStringBuilder.length());
                    spannableStringBuilder.append("…");
                    return spannableStringBuilder;
                }
                i12++;
            }
        } else {
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                formatRichText(((TL_iv.pageBlockDetails) pageBlock).title, z10, z11, i10, spannableStringBuilder, 0);
                return spannableStringBuilder;
            }
            if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
                formatRichText(((TL_iv.pageBlockAuthorDate) pageBlock).author, z10, z11, i10, spannableStringBuilder, 0);
                return spannableStringBuilder;
            }
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                spannableStringBuilder.append((CharSequence) span("fx", R.drawable.iv_formula)).append(" ").append((CharSequence) LocaleController.getString(R.string.AccDescrIVFormula));
                return spannableStringBuilder;
            }
            if (pageBlock instanceof TL_iv.pageBlockMap) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Map));
                TL_iv.PageCaption pageCaption = pageBlock.caption;
                if (pageCaption != null && !(pageCaption.text instanceof TL_iv.textEmpty)) {
                    spannableStringBuilder.append("  ");
                    formatRichText(pageBlock.caption.text, z10, z11, i10, spannableStringBuilder, 0);
                    return spannableStringBuilder;
                }
            } else {
                if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                    formatRichText(pageBlock.text, z10, z11, i10, spannableStringBuilder, 4);
                    return spannableStringBuilder;
                }
                SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                if (pageBlock instanceof TL_iv.pageBlockList) {
                    TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                    for (int i13 = 0; i13 < pageblocklist.items.size(); i13++) {
                        if (i13 > 0) {
                            spannableStringBuilder2.append("  ");
                        }
                        TL_iv.PageListItem pageListItem = pageblocklist.items.get(i13);
                        if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                            TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                            if (tL_pageListItemText.checkbox) {
                                spannableStringBuilder2.append((CharSequence) checkboxSpan(tL_pageListItemText.checked)).append(" ");
                            } else {
                                spannableStringBuilder2.append("• ");
                            }
                            i11 = i10;
                            formatRichText(tL_pageListItemText.text, z10, z11, i11, spannableStringBuilder2, 0);
                        } else {
                            if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                                TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = (TL_iv.TL_pageListItemBlocks) pageListItem;
                                if (tL_pageListItemBlocks.checkbox) {
                                    spannableStringBuilder2.append((CharSequence) checkboxSpan(tL_pageListItemBlocks.checked)).append(" ");
                                } else {
                                    spannableStringBuilder2.append("• ");
                                }
                                for (int i14 = 0; i14 < tL_pageListItemBlocks.blocks.size(); i14++) {
                                    if (i14 > 0) {
                                        spannableStringBuilder2.append("  ");
                                    }
                                    formatRichBlock(tL_pageListItemBlocks.blocks.get(i14), z10, z11, i10, spannableStringBuilder2, richMessage);
                                    if (spannableStringBuilder2.length() >= i10) {
                                        spannableStringBuilder2.delete(i10, spannableStringBuilder2.length());
                                        spannableStringBuilder2.append("…");
                                        return spannableStringBuilder2;
                                    }
                                }
                            }
                            i11 = i10;
                        }
                        if (spannableStringBuilder2.length() >= i11) {
                            spannableStringBuilder2.delete(i11, spannableStringBuilder2.length());
                            spannableStringBuilder2.append("…");
                            return spannableStringBuilder2;
                        }
                    }
                } else {
                    int i15 = i10;
                    if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                        TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
                        for (int i16 = 0; i16 < pageblockorderedlist.items.size(); i16++) {
                            if (i16 > 0) {
                                spannableStringBuilder2.append("  ");
                            }
                            TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i16);
                            if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                                TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = (TL_iv.TL_pageListOrderedItemText) pageListOrderedItem;
                                spannableStringBuilder2.append((CharSequence) tL_pageListOrderedItemText.num);
                                spannableStringBuilder2.append(". ");
                                if (tL_pageListOrderedItemText.checkbox) {
                                    spannableStringBuilder2.append((CharSequence) checkboxSpan(tL_pageListOrderedItemText.checked)).append(" ");
                                }
                                formatRichText(tL_pageListOrderedItemText.text, z10, z11, i15, spannableStringBuilder2, 0);
                            } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                                TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = (TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem;
                                spannableStringBuilder2.append((CharSequence) tL_pageListOrderedItemBlocks.num);
                                spannableStringBuilder2.append(". ");
                                if (tL_pageListOrderedItemBlocks.checkbox) {
                                    spannableStringBuilder2.append((CharSequence) checkboxSpan(tL_pageListOrderedItemBlocks.checked)).append(" ");
                                }
                                for (int i17 = 0; i17 < tL_pageListOrderedItemBlocks.blocks.size(); i17++) {
                                    if (i17 > 0) {
                                        spannableStringBuilder2.append("  ");
                                    }
                                    formatRichBlock(tL_pageListOrderedItemBlocks.blocks.get(i17), z10, z11, i10, spannableStringBuilder2, richMessage);
                                    if (spannableStringBuilder2.length() >= i10) {
                                        spannableStringBuilder2.delete(i10, spannableStringBuilder2.length());
                                        spannableStringBuilder2.append("…");
                                        return spannableStringBuilder2;
                                    }
                                }
                            }
                            i15 = i10;
                            if (spannableStringBuilder2.length() >= i15) {
                                spannableStringBuilder2.delete(i15, spannableStringBuilder2.length());
                                spannableStringBuilder2.append("…");
                                return spannableStringBuilder2;
                            }
                        }
                    } else {
                        if (pageBlock instanceof TL_iv.pageBlockTable) {
                            spannableStringBuilder2.append((CharSequence) span("⊞", R.drawable.iv_preview_table)).append(" ");
                            TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
                            if (richText == null || (richText instanceof TL_iv.textEmpty)) {
                                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.AccDescrIVTable));
                                return spannableStringBuilder2;
                            }
                            formatRichText(richText, z10, z11, i15, spannableStringBuilder2, 0);
                            return spannableStringBuilder2;
                        }
                        if (pageBlock instanceof TL_iv.pageBlockAudio) {
                            TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
                            while (true) {
                                if (i12 >= richMessage.documents.size()) {
                                    document = null;
                                    break;
                                }
                                if (richMessage.documents.get(i12).id == pageblockaudio.audio_id) {
                                    document = richMessage.documents.get(i12);
                                    break;
                                }
                                i12++;
                            }
                            if (document != null) {
                                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeAudio.class);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = (TLRPC.TL_documentAttributeFilename) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeFilename.class);
                                if (tL_documentAttributeAudio != null) {
                                    if (!TextUtils.isEmpty(tL_documentAttributeAudio.title) && !TextUtils.isEmpty(tL_documentAttributeAudio.performer)) {
                                        spannableStringBuilder2.append((CharSequence) span("🎵", R.drawable.iv_audio_preview)).append(" ").append((CharSequence) tL_documentAttributeAudio.performer).append(" – ").append((CharSequence) tL_documentAttributeAudio.title);
                                        return spannableStringBuilder2;
                                    }
                                    if (!TextUtils.isEmpty(tL_documentAttributeAudio.title)) {
                                        spannableStringBuilder2.append((CharSequence) span("🎵", R.drawable.iv_audio_preview)).append(" ").append((CharSequence) tL_documentAttributeAudio.title);
                                        return spannableStringBuilder2;
                                    }
                                    if (tL_documentAttributeFilename != null && tL_documentAttributeFilename.file_name != null) {
                                        spannableStringBuilder2.append((CharSequence) span("🎵", R.drawable.iv_audio_preview)).append(" ").append((CharSequence) tL_documentAttributeFilename.file_name);
                                        return spannableStringBuilder2;
                                    }
                                } else if (tL_documentAttributeFilename != null && tL_documentAttributeFilename.file_name != null) {
                                    spannableStringBuilder2.append((CharSequence) span("🎵", R.drawable.iv_audio_preview)).append(" ").append((CharSequence) tL_documentAttributeFilename.file_name);
                                    return spannableStringBuilder2;
                                }
                            }
                        } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
                            TLRPC.Document findDocument = AndroidUtilities.findDocument(richMessage.documents, ((TL_iv.pageBlockDocument) pageBlock).document_id);
                            if (findDocument != null) {
                                String documentFileName = FileLoader.getDocumentFileName(findDocument);
                                SpannableStringBuilder append = spannableStringBuilder2.append((CharSequence) span("📎", R.drawable.msg_filled_data_files)).append(" ");
                                if (TextUtils.isEmpty(documentFileName)) {
                                    documentFileName = LocaleController.getString(R.string.AttachDocument);
                                }
                                append.append((CharSequence) documentFileName);
                                return spannableStringBuilder2;
                            }
                        } else {
                            if (pageBlock instanceof TL_iv.pageBlockCover) {
                                formatRichBlock(((TL_iv.pageBlockCover) pageBlock).cover, z10, z11, i10, spannableStringBuilder2, richMessage);
                                return spannableStringBuilder2;
                            }
                            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.AttachPhoto));
                                return spannableStringBuilder2;
                            }
                            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.AttachVideo));
                                return spannableStringBuilder2;
                            }
                            if (pageBlock instanceof TL_iv.pageBlockCollage) {
                                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.AccDescrCollage));
                                return spannableStringBuilder2;
                            }
                            if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.AccDescrIVSlideshow));
                                return spannableStringBuilder2;
                            }
                            if (pageBlock instanceof TL_iv.pageBlockUnsupported) {
                                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.UnsupportedAttachment));
                                return spannableStringBuilder2;
                            }
                            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                                TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                                while (i12 < pageblockbuttonrow.buttons.size()) {
                                    if (i12 > 0) {
                                        spannableStringBuilder2.append("  ");
                                    }
                                    formatRichText(pageblockbuttonrow.buttons.get(i12).text, z10, z11, i10, spannableStringBuilder2, 0);
                                    i12++;
                                    spannableStringBuilder2 = spannableStringBuilder;
                                }
                            }
                        }
                    }
                }
            }
        }
        return spannableStringBuilder;
    }

    public static CharSequence formatRichMessage(TL_iv.RichMessage richMessage, boolean z10) {
        return formatRichMessage(richMessage, z10, false, 1024);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0163 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CharSequence formatRichText(TL_iv.RichText richText, boolean z10, boolean z11, int i10, SpannableStringBuilder spannableStringBuilder, int i11) {
        SpannableStringBuilder spannableStringBuilder2;
        int i12;
        if (richText == null) {
            return spannableStringBuilder;
        }
        int length = spannableStringBuilder.length();
        if (richText instanceof TL_iv.textPlain) {
            spannableStringBuilder.append((CharSequence) ((TL_iv.textPlain) richText).text);
        } else {
            if (!(richText instanceof TL_iv.textButton)) {
                spannableStringBuilder2 = spannableStringBuilder;
                if (richText instanceof TL_iv.textBold) {
                    formatRichText(richText.text, z10, z11, i10, spannableStringBuilder2, i11 | 1);
                } else if (richText instanceof TL_iv.textItalic) {
                    formatRichText(richText.text, z10, z11, i10, spannableStringBuilder2, i11 | 2);
                } else if (richText instanceof TL_iv.textUnderline) {
                    formatRichText(richText.text, z10, z11, i10, spannableStringBuilder2, i11 | 16);
                } else if (richText instanceof TL_iv.textStrike) {
                    formatRichText(richText.text, z10, z11, i10, spannableStringBuilder2, i11 | 8);
                } else if (richText instanceof TL_iv.textFixed) {
                    formatRichText(richText.text, z10, z11, i10, spannableStringBuilder2, i11 | 4);
                } else {
                    if (!(richText instanceof TL_iv.textSpoiler)) {
                        if (richText instanceof TL_iv.textUrl) {
                            i12 = i11;
                            formatRichText(richText.text, z10, z11, i10, spannableStringBuilder2, i12);
                            if (spannableStringBuilder2.length() > length) {
                                xz0 xz0Var = new xz0();
                                xz0Var.a = i12;
                                spannableStringBuilder2.setSpan(new p41(richText.url, xz0Var), length, spannableStringBuilder2.length(), 33);
                            }
                        } else {
                            i12 = i11;
                            if (richText instanceof TL_iv.textEmail) {
                                formatRichText(richText.text, z10, z11, i10, spannableStringBuilder2, i12);
                                if (spannableStringBuilder2.length() > length) {
                                    xz0 xz0Var2 = new xz0();
                                    xz0Var2.a = i12;
                                    spannableStringBuilder2.setSpan(new t41("mailto:" + richText.email, xz0Var2), length, spannableStringBuilder2.length(), 33);
                                }
                            } else if (richText instanceof TL_iv.textMath) {
                                spannableStringBuilder2.append((CharSequence) span("fx", R.drawable.iv_formula)).append(" ").append((CharSequence) LocaleController.getString(R.string.AccDescrIVFormula));
                            } else if (richText instanceof TL_iv.textPhone) {
                                formatRichText(richText.text, z10, z11, i10, spannableStringBuilder2, i12);
                                if (spannableStringBuilder2.length() > length) {
                                    TL_iv.textPhone textphone = (TL_iv.textPhone) richText;
                                    String d = oe.b.d(textphone.phone, false);
                                    if (textphone.phone.startsWith("+")) {
                                        d = s3.c.e("+", d);
                                    }
                                    xz0 xz0Var3 = new xz0();
                                    xz0Var3.a = i12;
                                    spannableStringBuilder2.setSpan(new r41(s3.c.e("tel:", d), xz0Var3), length, spannableStringBuilder2.length(), 33);
                                }
                            } else if (richText instanceof TL_iv.textConcat) {
                                ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
                                int size = arrayList.size();
                                int i13 = 0;
                                while (i13 < size) {
                                    TL_iv.RichText richText2 = arrayList.get(i13);
                                    i13++;
                                    formatRichText(richText2, z10, z11, i10, spannableStringBuilder2, i12);
                                    if (spannableStringBuilder2.length() >= i10) {
                                        spannableStringBuilder2.delete(i10, spannableStringBuilder2.length());
                                        spannableStringBuilder2.append("…");
                                        return spannableStringBuilder2;
                                    }
                                }
                            }
                        }
                        if (spannableStringBuilder2.length() > length && i12 != 0) {
                            xz0 xz0Var4 = new xz0();
                            xz0Var4.a = i12;
                            spannableStringBuilder2.setSpan(new yz0(xz0Var4, 0), length, spannableStringBuilder2.length(), 33);
                        }
                        return spannableStringBuilder2;
                    }
                    formatRichText(richText.text, z10, z11, i10, spannableStringBuilder2, i11 | 256);
                }
                i12 = i11;
                if (spannableStringBuilder2.length() > length) {
                    xz0 xz0Var42 = new xz0();
                    xz0Var42.a = i12;
                    spannableStringBuilder2.setSpan(new yz0(xz0Var42, 0), length, spannableStringBuilder2.length(), 33);
                }
                return spannableStringBuilder2;
            }
            formatRichText(richText.text, z10, z11, i10, spannableStringBuilder, i11);
        }
        spannableStringBuilder2 = spannableStringBuilder;
        i12 = i11;
        if (spannableStringBuilder2.length() > length) {
        }
        return spannableStringBuilder2;
    }

    private CharSequence formatTaskTitle(TLRPC.TodoItem todoItem) {
        CharSequence formatTextWithEntities = formatTextWithEntities(todoItem.title, isOutOwner());
        if (!(formatTextWithEntities instanceof Spannable)) {
            formatTextWithEntities = new SpannableStringBuilder(formatTextWithEntities);
        }
        ((Spannable) formatTextWithEntities).setSpan(new r41("task?" + todoItem.id, 0), 0, formatTextWithEntities.length(), 33);
        return formatTextWithEntities;
    }

    public static CharSequence formatTextWithEntities(TLRPC.TL_textWithEntities tL_textWithEntities) {
        return formatTextWithEntities(tL_textWithEntities, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private CharSequence getActionSuggestionApprovalText(String str, String str2) {
        TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval;
        boolean z10;
        boolean z11;
        TLRPC.Message message;
        TLRPC.Message message2 = this.messageOwner;
        if (message2 != null) {
            TLRPC.MessageAction messageAction = message2.action;
            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                if (tL_messageActionSuggestedPostApproval != null) {
                    return null;
                }
                MessageSuggestionParams of2 = MessageSuggestionParams.of(tL_messageActionSuggestedPostApproval);
                boolean canManageMonoForum = ChatObject.canManageMonoForum(this.currentAccount, DialogObject.getPeerDialogId(this.messageOwner.peer_id));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i10 = 0;
                if (tL_messageActionSuggestedPostApproval.balance_too_low) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestionAgreementNotEnoughStars, str2)));
                    return spannableStringBuilder;
                }
                if (tL_messageActionSuggestedPostApproval.rejected) {
                    MessageObject messageObject = this.replyMessageObject;
                    if (messageObject == null || (message = messageObject.messageOwner) == null) {
                        z10 = false;
                        z11 = true;
                    } else {
                        long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
                        z11 = peerDialogId == DialogObject.getPeerDialogId(this.replyMessageObject.messageOwner.saved_peer_id);
                        z10 = peerDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
                    }
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(TextUtils.isEmpty(tL_messageActionSuggestedPostApproval.reject_comment) ? z10 ? R.string.SuggestionAgreementDeclinedYou : R.string.SuggestionAgreementDeclinedThis : z10 ? R.string.SuggestionAgreementDeclinedYouComment : R.string.SuggestionAgreementDeclinedThisComment, z11 ? str : str2)));
                    if (!TextUtils.isEmpty(tL_messageActionSuggestedPostApproval.reject_comment)) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.8f), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append('\"');
                        spannableStringBuilder.append((CharSequence) tL_messageActionSuggestedPostApproval.reject_comment);
                        spannableStringBuilder.append('\"');
                        spannableStringBuilder.setSpan(new vt(217, i10), length, spannableStringBuilder.length(), 33);
                        return spannableStringBuilder;
                    }
                } else {
                    int i11 = (int) MessagesController.getInstance(this.currentAccount).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                    int i12 = tL_messageActionSuggestedPostApproval.schedule_date;
                    if (i12 > 0) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(tL_messageActionSuggestedPostApproval.schedule_date > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() ? canManageMonoForum ? R.string.SuggestionAgreementReachedAdmin1 : R.string.SuggestionAgreementReachedUser1 : canManageMonoForum ? R.string.SuggestionAgreementReachedAdmin1PastSimple : R.string.SuggestionAgreementReachedUser1PastSimple, str, LocaleController.formatDateTime(i12, true))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(canManageMonoForum ? R.string.SuggestionAgreementReachedAdmin1PresentPerfect : R.string.SuggestionAgreementReachedUser1PresentPerfect, str)));
                    }
                    hf.a aVar = of2.amount;
                    if (aVar != null && !aVar.k()) {
                        hf.a aVar2 = of2.amount;
                        hf.b bVar = aVar2.a;
                        hf.b bVar2 = hf.b.b;
                        boolean z12 = bVar == bVar2;
                        String formatString = canManageMonoForum ? LocaleController.formatString(R.string.SuggestionAgreementReachedAdmin2, str2, aVar2.b()) : LocaleController.formatString(R.string.SuggestionAgreementReachedUser2, aVar2.b());
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6f), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) hh.oa.S0(AndroidUtilities.replaceTags(formatString), of2.amount.a == bVar2));
                        int i13 = z12 ? canManageMonoForum ? R.string.SuggestionAgreementReachedAdmin3TON : R.string.SuggestionAgreementReachedUser3TON : canManageMonoForum ? R.string.SuggestionAgreementReachedAdmin3Stars : R.string.SuggestionAgreementReachedUser3Stars;
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6f), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i13, str, Integer.valueOf(i11))));
                        int i14 = z12 ? canManageMonoForum ? R.string.SuggestionAgreementReachedAdmin4TON : R.string.SuggestionAgreementReachedUser4TON : canManageMonoForum ? R.string.SuggestionAgreementReachedAdmin4Stars : R.string.SuggestionAgreementReachedUser4Stars;
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6f), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i14, str, Integer.valueOf(i11))));
                    }
                }
                return spannableStringBuilder;
            }
        }
        tL_messageActionSuggestedPostApproval = null;
        if (tL_messageActionSuggestedPostApproval != null) {
        }
    }

    private TLRPC.Chat getChat(AbstractMap<Long, TLRPC.Chat> abstractMap, a0.h hVar, long j10) {
        TLRPC.Chat chat = abstractMap != null ? abstractMap.get(Long.valueOf(j10)) : hVar != null ? (TLRPC.Chat) hVar.f(j10) : null;
        return chat == null ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10)) : chat;
    }

    public static int getCompletionsCount(TLRPC.TL_messageMediaToDo tL_messageMediaToDo) {
        TLRPC.TodoList todoList;
        if (tL_messageMediaToDo == null || (todoList = tL_messageMediaToDo.todo) == null || todoList.list == null) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < tL_messageMediaToDo.completions.size(); i11++) {
            TLRPC.TodoCompletion todoCompletion = tL_messageMediaToDo.completions.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 >= tL_messageMediaToDo.todo.list.size()) {
                    break;
                }
                if (tL_messageMediaToDo.todo.list.get(i12).id == todoCompletion.id) {
                    i10++;
                    break;
                }
                i12++;
            }
        }
        return i10;
    }

    public static double getDocumentDuration(TLRPC.Document document) {
        if (document == null) {
            return 0.0d;
        }
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return documentAttribute.duration;
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                return documentAttribute.duration;
            }
        }
        return 0.0d;
    }

    public static TLRPC.VideoSize getDocumentVideoThumb(TLRPC.Document document) {
        if (document == null || document.video_thumbs.isEmpty()) {
            return null;
        }
        return document.video_thumbs.get(0);
    }

    private TLRPC.Document getDocumentWithId(TLRPC.WebPage webPage, long j10) {
        if (webPage != null && webPage.cached_page != null) {
            TLRPC.Document document = webPage.document;
            if (document != null && document.id == j10) {
                return document;
            }
            for (int i10 = 0; i10 < webPage.cached_page.documents.size(); i10++) {
                TLRPC.Document document2 = webPage.cached_page.documents.get(i10);
                if (document2.id == j10) {
                    return document2;
                }
            }
        }
        return null;
    }

    public static String getEmoji(TLRPC.Document document) {
        if (document == null) {
            return "😀";
        }
        TLRPC.TL_documentAttributeCustomEmoji tL_documentAttributeCustomEmoji = (TLRPC.TL_documentAttributeCustomEmoji) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeCustomEmoji.class);
        if (tL_documentAttributeCustomEmoji != null && !TextUtils.isEmpty(tL_documentAttributeCustomEmoji.alt)) {
            return tL_documentAttributeCustomEmoji.alt;
        }
        TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = (TLRPC.TL_documentAttributeSticker) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeSticker.class);
        return (tL_documentAttributeSticker == null || TextUtils.isEmpty(tL_documentAttributeSticker.alt)) ? "😀" : tL_documentAttributeSticker.alt;
    }

    private static int getForumFlags(TLRPC.Chat chat, TLRPC.User user) {
        return h7.a8.b(h7.a8.b(h7.a8.b(0, 1, ChatObject.isForum(chat)), 4, ChatObject.isMonoForum(chat)), 8, UserObject.isBotForum(user));
    }

    public static long getFromChatId(TLRPC.Message message) {
        return getPeerId(message.from_id);
    }

    public static int getInlineResultDuration(TLRPC.BotInlineResult botInlineResult) {
        int webDocumentDuration = (int) getWebDocumentDuration(botInlineResult.content);
        return webDocumentDuration == 0 ? (int) getWebDocumentDuration(botInlineResult.thumb) : webDocumentDuration;
    }

    public static int[] getInlineResultWidthAndHeight(TLRPC.BotInlineResult botInlineResult) {
        int[] webDocumentWidthAndHeight = getWebDocumentWidthAndHeight(botInlineResult.content);
        if (webDocumentWidthAndHeight != null) {
            return webDocumentWidthAndHeight;
        }
        int[] webDocumentWidthAndHeight2 = getWebDocumentWidthAndHeight(botInlineResult.thumb);
        return webDocumentWidthAndHeight2 == null ? new int[]{0, 0} : webDocumentWidthAndHeight2;
    }

    public static TLRPC.InputStickerSet getInputStickerSet(TLRPC.Message message) {
        TLRPC.Document document = getDocument(message);
        if (document != null) {
            return getInputStickerSet(document);
        }
        return null;
    }

    public static TLRPC.MessageMedia getMedia(MessageObject messageObject) {
        TLRPC.Message message;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return null;
        }
        TLRPC.MessageMedia messageMedia = messageObject.sponsoredMedia;
        return messageMedia != null ? messageMedia : getMedia(message);
    }

    public static long getMediaSize(TLRPC.MessageMedia messageMedia) {
        TLRPC.WebPage webPage;
        TLRPC.Document document = (!(messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (webPage = messageMedia.webpage) == null) ? messageMedia instanceof TLRPC.TL_messageMediaGame ? messageMedia.game.document : messageMedia != null ? messageMedia.document : null : webPage.document;
        if (document != null) {
            return document.size;
        }
        return 0L;
    }

    private MessageObject getMessageObjectForBlock(TLRPC.WebPage webPage, TL_iv.PageBlock pageBlock) {
        TLRPC.TL_message tL_message;
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TLRPC.Photo photoWithId = getPhotoWithId(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
            if (photoWithId != webPage.photo) {
                tL_message = new TLRPC.TL_message();
                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
                tL_message.media = tL_messageMediaPhoto;
                tL_messageMediaPhoto.photo = photoWithId;
                tL_message.message = "";
                tL_message.realId = getId();
                tL_message.id = Utilities.random.nextInt();
                TLRPC.Message message = this.messageOwner;
                tL_message.date = message.date;
                tL_message.peer_id = message.peer_id;
                tL_message.out = message.out;
                tL_message.from_id = message.from_id;
                return new MessageObject(this.currentAccount, tL_message, false, true);
            }
            return this;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            if (getDocumentWithId(webPage, pageblockvideo.video_id) != webPage.document) {
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message2.media = tL_messageMediaDocument;
                tL_messageMediaDocument.document = getDocumentWithId(webPage, pageblockvideo.video_id);
                tL_message = tL_message2;
            }
            return this;
        }
        tL_message = null;
        tL_message.message = "";
        tL_message.realId = getId();
        tL_message.id = Utilities.random.nextInt();
        TLRPC.Message message2 = this.messageOwner;
        tL_message.date = message2.date;
        tL_message.peer_id = message2.peer_id;
        tL_message.out = message2.out;
        tL_message.from_id = message2.from_id;
        return new MessageObject(this.currentAccount, tL_message, false, true);
    }

    public static long getMessageSize(TLRPC.Message message) {
        return getMediaSize(getMedia(message));
    }

    public static long getObjectPeerId(TLObject tLObject) {
        if (tLObject == null) {
            return 0L;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return -((TLRPC.Chat) tLObject).id;
        }
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).id;
        }
        return 0L;
    }

    private int getParentWidth() {
        int i10;
        if (this.preview && (i10 = this.parentWidth) > 0) {
            return i10;
        }
        if (AndroidUtilities.isTablet()) {
            return AndroidUtilities.getMinTabletSide();
        }
        Point point = AndroidUtilities.displaySize;
        int i11 = point.x;
        return i11 > point.y ? i11 - AndroidUtilities.dp(50.0f) : i11;
    }

    public static long getPeerId(TLRPC.Peer peer) {
        long j10;
        if (peer == null) {
            return 0L;
        }
        if (peer instanceof TLRPC.TL_peerChat) {
            j10 = peer.chat_id;
        } else {
            if (!(peer instanceof TLRPC.TL_peerChannel)) {
                return peer.user_id;
            }
            j10 = peer.channel_id;
        }
        return -j10;
    }

    public static String getPeerObjectName(TLObject tLObject) {
        return tLObject instanceof TLRPC.User ? UserObject.getUserName((TLRPC.User) tLObject) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : "DELETED";
    }

    private TLRPC.Photo getPhotoWithId(TLRPC.WebPage webPage, long j10) {
        if (webPage != null && webPage.cached_page != null) {
            TLRPC.Photo photo = webPage.photo;
            if (photo != null && photo.id == j10) {
                return photo;
            }
            for (int i10 = 0; i10 < webPage.cached_page.photos.size(); i10++) {
                TLRPC.Photo photo2 = webPage.cached_page.photos.get(i10);
                if (photo2.id == j10) {
                    return photo2;
                }
            }
        }
        return null;
    }

    public static TLRPC.PollAnswerVoters getPollResult(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, byte[] bArr) {
        TLRPC.PollResults pollResults;
        if (tL_messageMediaPoll != null && (pollResults = tL_messageMediaPoll.results) != null && !pollResults.results.isEmpty()) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i10);
                if (Arrays.equals(pollAnswerVoters.option, bArr)) {
                    return pollAnswerVoters;
                }
            }
        }
        return null;
    }

    public static int getQuickReplyId(TLRPC.Message message) {
        if (message == null) {
            return 0;
        }
        if ((message.flags & TLObject.FLAG_30) != 0) {
            return message.quick_reply_shortcut_id;
        }
        TLRPC.InputQuickReplyShortcut inputQuickReplyShortcut = message.quick_reply_shortcut;
        if (inputQuickReplyShortcut instanceof TLRPC.TL_inputQuickReplyShortcutId) {
            return ((TLRPC.TL_inputQuickReplyShortcutId) inputQuickReplyShortcut).shortcut_id;
        }
        return 0;
    }

    public static String getQuickReplyName(TLRPC.Message message) {
        if (message == null) {
            return null;
        }
        TLRPC.InputQuickReplyShortcut inputQuickReplyShortcut = message.quick_reply_shortcut;
        if (inputQuickReplyShortcut instanceof TLRPC.TL_inputQuickReplyShortcut) {
            return ((TLRPC.TL_inputQuickReplyShortcut) inputQuickReplyShortcut).shortcut;
        }
        return null;
    }

    public static long getReplyToDialogId(TLRPC.Message message) {
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        if (messageReplyHeader == null) {
            return 0L;
        }
        TLRPC.Peer peer = messageReplyHeader.reply_to_peer_id;
        return peer != null ? getPeerId(peer) : getDialogId(message);
    }

    public static TLRPC.Peer getSavedDialogPeer(long j10, TLRPC.Message message) {
        TLRPC.Peer peer;
        TLRPC.Peer peer2;
        TLRPC.Peer peer3 = message.saved_peer_id;
        if (peer3 != null) {
            return peer3;
        }
        TLRPC.Peer peer4 = message.peer_id;
        if (peer4 == null || peer4.user_id != j10 || (peer = message.from_id) == null || peer.user_id != j10) {
            return null;
        }
        TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
        if (messageFwdHeader != null && (peer2 = messageFwdHeader.saved_from_peer) != null) {
            return peer2;
        }
        if (messageFwdHeader != null && messageFwdHeader.from_id != null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = j10;
            return tL_peerUser;
        }
        if (messageFwdHeader != null) {
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            tL_peerUser2.user_id = UserObject.ANONYMOUS;
            return tL_peerUser2;
        }
        TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
        tL_peerUser3.user_id = j10;
        return tL_peerUser3;
    }

    public static long getStakedDiceWinAmount(TLRPC.TL_messageMediaDice tL_messageMediaDice) {
        TLRPC.TL_messages_emojiGameOutcome tL_messages_emojiGameOutcome = tL_messageMediaDice.game_outcome;
        if (tL_messages_emojiGameOutcome == null) {
            return 0L;
        }
        long j10 = tL_messages_emojiGameOutcome.ton_amount;
        return j10 > 0 ? j10 : -tL_messages_emojiGameOutcome.stake_ton_amount;
    }

    public static long getStickerSetId(TLRPC.Document document) {
        if (document == null) {
            return -1L;
        }
        for (int i10 = 0; i10 < document.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty) {
                    return -1L;
                }
                return inputStickerSet.id;
            }
        }
        return -1L;
    }

    public static String getStickerSetName(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        for (int i10 = 0; i10 < document.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty) {
                    return null;
                }
                return inputStickerSet.short_name;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private CharSequence getStringFrom(TLRPC.ChatReactions chatReactions) {
        String str;
        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
            return LocaleController.getString(R.string.AllReactions);
        }
        if (!(chatReactions instanceof TLRPC.TL_chatReactionsSome)) {
            return LocaleController.getString(R.string.NoReactions);
        }
        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i10 = 0; i10 < tL_chatReactionsSome.reactions.size(); i10++) {
            if (i10 != 0) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            TLRPC.Reaction reaction = tL_chatReactionsSome.reactions.get(i10);
            if (reaction instanceof TLRPC.TL_reactionEmoji) {
                str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("d");
                spannableStringBuilder2.setSpan(new org.telegram.ui.Components.t5(((TLRPC.TL_reactionCustomEmoji) reaction).document_id, (Paint.FontMetricsInt) null), 0, 1, 0);
                str = spannableStringBuilder2;
            } else {
                str = "";
            }
            spannableStringBuilder.append(Emoji.replaceEmoji(str, null, false));
        }
        return spannableStringBuilder;
    }

    private static long getTopicId(MessageObject messageObject) {
        if (messageObject == null) {
            return 0L;
        }
        return getTopicId(messageObject.currentAccount, messageObject.messageOwner, false);
    }

    public static int getUnreadFlags(TLRPC.Message message) {
        int i10 = !message.unread ? 1 : 0;
        return !message.media_unread ? i10 | 2 : i10;
    }

    private TLRPC.User getUser(AbstractMap<Long, TLRPC.User> abstractMap, a0.h hVar, long j10) {
        TLRPC.User user = abstractMap != null ? abstractMap.get(Long.valueOf(j10)) : hVar != null ? (TLRPC.User) hVar.f(j10) : null;
        return user == null ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)) : user;
    }

    private String getUserName(TLObject tLObject, ArrayList<TLRPC.MessageEntity> arrayList, int i10) {
        String str;
        String publicUsername;
        long j10;
        String str2;
        String str3;
        long j11;
        if (tLObject == null) {
            str2 = "";
            str3 = null;
            j11 = 0;
        } else {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                str = user.deleted ? LocaleController.getString(R.string.HiddenName) : ContactsController.formatName(user.first_name, user.last_name);
                publicUsername = UserObject.getPublicUsername(user);
                j10 = user.id;
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                str = chat.title;
                publicUsername = ChatObject.getPublicUsername(chat);
                j10 = -chat.id;
            }
            str2 = str;
            str3 = publicUsername;
            j11 = j10;
        }
        if (i10 >= 0) {
            TLRPC.TL_messageEntityMentionName tL_messageEntityMentionName = new TLRPC.TL_messageEntityMentionName();
            tL_messageEntityMentionName.user_id = j11;
            tL_messageEntityMentionName.offset = i10;
            tL_messageEntityMentionName.length = str2.length();
            arrayList.add(tL_messageEntityMentionName);
        }
        if (TextUtils.isEmpty(str3)) {
            return str2;
        }
        if (i10 >= 0) {
            TLRPC.TL_messageEntityMentionName tL_messageEntityMentionName2 = new TLRPC.TL_messageEntityMentionName();
            tL_messageEntityMentionName2.user_id = j11;
            tL_messageEntityMentionName2.offset = str2.length() + i10 + 2;
            tL_messageEntityMentionName2.length = str3.length() + 1;
            arrayList.add(tL_messageEntityMentionName2);
        }
        return String.format("%1$s (@%2$s)", str2, str3);
    }

    private String getUsernamesString(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return LocaleController.getString(R.string.UsernameEmpty).toLowerCase();
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            sb2.append("@");
            sb2.append(arrayList.get(i10));
            if (i10 < arrayList.size() - 1) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    public static String getVideoCodec(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return ((TLRPC.TL_documentAttributeVideo) documentAttribute).video_codec;
            }
        }
        return null;
    }

    public static int getVideoHeight(TLRPC.Document document) {
        if (document == null) {
            return 0;
        }
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return documentAttribute.h;
            }
        }
        return 0;
    }

    public static int getVideoWidth(TLRPC.Document document) {
        if (document == null) {
            return 0;
        }
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return documentAttribute.w;
            }
        }
        return 0;
    }

    public static double getWebDocumentDuration(TLRPC.WebDocument webDocument) {
        if (webDocument == null) {
            return 0.0d;
        }
        int size = webDocument.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = webDocument.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return documentAttribute.duration;
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                return documentAttribute.duration;
            }
        }
        return 0.0d;
    }

    public static int[] getWebDocumentWidthAndHeight(TLRPC.WebDocument webDocument) {
        if (webDocument == null) {
            return null;
        }
        int size = webDocument.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = webDocument.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                return new int[]{documentAttribute.w, documentAttribute.h};
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return new int[]{documentAttribute.w, documentAttribute.h};
            }
        }
        return null;
    }

    public static CharSequence groupSpan() {
        if (groupSpan == null) {
            groupSpan = new SpannableStringBuilder(ImageLoader.AUTOPLAY_FILTER);
            cq cqVar = new cq(R.drawable.msg_folders_groups, 0);
            cqVar.setScale(0.7f, 0.7f);
            ((SpannableStringBuilder) groupSpan).setSpan(cqVar, 0, 1, 33);
        }
        return groupSpan;
    }

    private void handleFoundWords(ArrayList<String> arrayList, String[] strArr, boolean z10) {
        handleFoundWords(arrayList, strArr, z10, true);
    }

    private boolean hasNonEmojiEntities() {
        TLRPC.Message message = this.messageOwner;
        if (message != null && message.entities != null) {
            for (int i10 = 0; i10 < this.messageOwner.entities.size(); i10++) {
                if (!(this.messageOwner.entities.get(i10) instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasUnreadReactions(TLRPC.Message message) {
        if (message == null) {
            return false;
        }
        return hasUnreadReactions(message.reactions);
    }

    public static boolean isAnimatedEmoji(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAnimatedStickerDocument(TLRPC.Document document) {
        return document != null && document.mime_type.equals("video/webm");
    }

    public static boolean isAnimatedStickerMessage(TLRPC.Message message) {
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(message.dialog_id);
        if ((!isEncryptedDialog || message.stickerVerified == 1) && getMedia(message) != null) {
            if (isAnimatedStickerDocument(getMedia(message).document, !isEncryptedDialog || message.out)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAnyKindOfStickerOrEmoji(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isBlueBlock(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockTable) || (pageBlock instanceof TL_iv.pageBlockMath) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow);
    }

    public static boolean isCompleted(MessageObject messageObject, int i10) {
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo;
        TLRPC.TodoList todoList;
        TLRPC.MessageMedia media = getMedia(messageObject);
        if (!(media instanceof TLRPC.TL_messageMediaToDo) || (todoList = (tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) media).todo) == null || todoList.list == null) {
            return false;
        }
        return isCompleted(tL_messageMediaToDo, i10);
    }

    public static boolean isDocumentHasAttachedStickers(TLRPC.Document document) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                if (document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeHasStickers) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isDocumentHasThumb(TLRPC.Document document) {
        if (document != null && !document.thumbs.isEmpty()) {
            int size = document.thumbs.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.PhotoSize photoSize = document.thumbs.get(i10);
                if (photoSize != null && !(photoSize instanceof TLRPC.TL_photoSizeEmpty) && (!(photoSize.location instanceof TLRPC.TL_fileLocationUnavailable) || photoSize.bytes != null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isEphemeralMessageId(int i10) {
        return (i10 & MESSAGE_ID_RESERVED_BITS_MASK) == MESSAGE_ID_EPHEMERAL_BITS_MASK;
    }

    public static boolean isExtendedVideo(TLRPC.MessageExtendedMedia messageExtendedMedia) {
        if (!(messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia)) {
            return (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) && (((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).flags & 4) != 0;
        }
        TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
        return (messageMedia instanceof TLRPC.TL_messageMediaDocument) && isVideoDocument(messageMedia.document);
    }

    public static boolean isForwardedMessage(TLRPC.Message message) {
        return ((message.flags & 4) == 0 || message.fwd_from == null) ? false : true;
    }

    public static boolean isFreeEmoji(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                return ((TLRPC.TL_documentAttributeCustomEmoji) documentAttribute).free;
            }
        }
        return false;
    }

    public static boolean isGameMessage(TLRPC.Message message) {
        return getMedia(message) instanceof TLRPC.TL_messageMediaGame;
    }

    public static boolean isGifDocument(WebFile webFile) {
        if (webFile != null) {
            return webFile.mime_type.equals("image/gif") || isNewGifDocument(webFile);
        }
        return false;
    }

    public static boolean isGifMessage(TLRPC.Message message) {
        if (getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return isGifDocument(getMedia(message).webpage.document);
        }
        if (getMedia(message) != null) {
            if (isGifDocument(getMedia(message).document, message.grouped_id != 0)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isImageWebDocument(WebFile webFile) {
        return (webFile == null || isGifDocument(webFile) || !webFile.mime_type.startsWith("image/")) ? false : true;
    }

    public static boolean isInvoiceMessage(TLRPC.Message message) {
        return getMedia(message) instanceof TLRPC.TL_messageMediaInvoice;
    }

    public static boolean isLiveLocationMessage(TLRPC.Message message) {
        return getMedia(message) instanceof TLRPC.TL_messageMediaGeoLive;
    }

    public static boolean isLocationMessage(TLRPC.Message message) {
        return (getMedia(message) instanceof TLRPC.TL_messageMediaGeo) || (getMedia(message) instanceof TLRPC.TL_messageMediaGeoLive) || (getMedia(message) instanceof TLRPC.TL_messageMediaVenue);
    }

    public static boolean isMaskDocument(TLRPC.Document document) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && documentAttribute.mask) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isMaskMessage(TLRPC.Message message) {
        return getMedia(message) != null && isMaskDocument(getMedia(message).document);
    }

    public static boolean isMusicDocument(TLRPC.Document document) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                if (document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeAudio) {
                    return !r2.voice;
                }
            }
            if (!TextUtils.isEmpty(document.mime_type)) {
                String lowerCase = document.mime_type.toLowerCase();
                if (lowerCase.equals("audio/flac") || lowerCase.equals("audio/ogg") || lowerCase.equals("audio/opus") || lowerCase.equals("audio/x-opus+ogg") || (lowerCase.equals("application/octet-stream") && FileLoader.getDocumentFileName(document).endsWith(".opus"))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isMusicMessage(TLRPC.Message message) {
        return getMedia(message) instanceof TLRPC.TL_messageMediaWebPage ? isMusicDocument(getMedia(message).webpage.document) : getMedia(message) != null && isMusicDocument(getMedia(message).document);
    }

    public static boolean isNewGifDocument(WebFile webFile) {
        if (webFile != null && "video/mp4".equals(webFile.mime_type)) {
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < webFile.attributes.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = webFile.attributes.get(i12);
                if (!(documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) && (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    i10 = documentAttribute.w;
                    i11 = documentAttribute.h;
                }
            }
            if (i10 <= 1280 && i11 <= 1280) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNewGifMessage(TLRPC.Message message) {
        return getMedia(message) instanceof TLRPC.TL_messageMediaWebPage ? isNewGifDocument(getMedia(message).webpage.document) : getMedia(message) != null && isNewGifDocument(getMedia(message).document);
    }

    public static boolean isPaidVideo(TLRPC.MessageMedia messageMedia) {
        return (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) && messageMedia.extended_media.size() == 1 && isExtendedVideo(messageMedia.extended_media.get(0));
    }

    public static boolean isPhoto(TLRPC.Message message) {
        TLRPC.MessageAction messageAction;
        TLRPC.Photo photo;
        TL_iv.RichMessage richMessage;
        return (message == null || (richMessage = message.rich_message) == null) ? getMedia(message) instanceof TLRPC.TL_messageMediaWebPage ? (getMedia(message).webpage.photo instanceof TLRPC.TL_photo) && !(getMedia(message).webpage.document instanceof TLRPC.TL_document) : (message == null || (messageAction = message.action) == null || (photo = messageAction.photo) == null) ? getMedia(message) instanceof TLRPC.TL_messageMediaPhoto : photo instanceof TLRPC.TL_photo : findPhoto(richMessage) != null;
    }

    public static boolean isPremiumEmojiPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        if ((tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) && tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
            for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                if (!isFreeEmoji(tL_messages_stickerSet.documents.get(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isPremiumSticker(TLRPC.Document document) {
        if (document != null && document.thumbs != null) {
            for (int i10 = 0; i10 < document.video_thumbs.size(); i10++) {
                if ("f".equals(document.video_thumbs.get(i10).type)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isQuickReply(TLRPC.Message message) {
        if (message != null) {
            return ((message.flags & TLObject.FLAG_30) == 0 && message.quick_reply_shortcut == null) ? false : true;
        }
        return false;
    }

    public static boolean isRoundVideoDocument(TLRPC.Document document) {
        if (document != null && "video/mp4".equals(document.mime_type)) {
            boolean z10 = false;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < document.attributes.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    i10 = documentAttribute.w;
                    i11 = documentAttribute.h;
                    z10 = documentAttribute.round_message;
                }
            }
            if (z10 && i10 <= 1280 && i11 <= 1280) {
                return true;
            }
        }
        return false;
    }

    public static boolean isRoundVideoMessage(TLRPC.Message message) {
        return (!(getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) || getMedia(message).webpage == null) ? getMedia(message) != null && isRoundVideoDocument(getMedia(message).document) : isRoundVideoDocument(getMedia(message).webpage.document);
    }

    public static boolean isSecretMedia(TLRPC.Message message) {
        return message instanceof TLRPC.TL_message_secret ? ((getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || isRoundVideoMessage(message) || isVideoMessage(message)) && getMedia(message).ttl_seconds != 0 : (message instanceof TLRPC.TL_message) && ((getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || (getMedia(message) instanceof TLRPC.TL_messageMediaDocument)) && getMedia(message).ttl_seconds != 0;
    }

    public static boolean isSecretPhotoOrVideo(TLRPC.Message message) {
        int i10;
        return message instanceof TLRPC.TL_message_secret ? ((getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || isRoundVideoMessage(message) || isVideoMessage(message)) && (i10 = message.ttl) > 0 && i10 <= 60 : (message instanceof TLRPC.TL_message) && ((getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || (getMedia(message) instanceof TLRPC.TL_messageMediaDocument)) && getMedia(message).ttl_seconds != 0;
    }

    public static boolean isStaticStickerDocument(TLRPC.Document document) {
        return document != null && document.mime_type.equals("image/webp");
    }

    public static boolean isStickerDocument(TLRPC.Document document) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                if (document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeSticker) {
                    return "image/webp".equals(document.mime_type) || "video/webm".equals(document.mime_type);
                }
            }
        }
        return false;
    }

    public static boolean isStickerHasSet(TLRPC.Document document) {
        TLRPC.InputStickerSet inputStickerSet;
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isStickerMessage(TLRPC.Message message) {
        return getMedia(message) != null && isStickerDocument(getMedia(message).document);
    }

    public static boolean isSystemSignUp(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        TLRPC.Message message = messageObject.messageOwner;
        return (message instanceof TLRPC.TL_messageService) && (((TLRPC.TL_messageService) message).action instanceof TLRPC.TL_messageActionContactSignUp);
    }

    public static boolean isTextColorEmoji(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        getInputStickerSet(document);
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                if ((inputStickerSet instanceof TLRPC.TL_inputStickerSetID) && inputStickerSet.id == 1269403972611866647L) {
                    return true;
                }
                return ((TLRPC.TL_documentAttributeCustomEmoji) documentAttribute).text_color;
            }
        }
        return false;
    }

    public static boolean isTextColorSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
            if (stickerSet.text_color) {
                return true;
            }
            ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
            if (arrayList != null && !arrayList.isEmpty()) {
                return isTextColorEmoji(tL_messages_stickerSet.documents.get(0));
            }
        }
        return false;
    }

    public static boolean isTopicActionMessage(MessageObject messageObject) {
        TLRPC.Message message;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        return (messageAction instanceof TLRPC.TL_messageActionTopicCreate) || (messageAction instanceof TLRPC.TL_messageActionTopicEdit);
    }

    public static boolean isV(String str) {
        if (str == null) {
            return true;
        }
        switch (str.toLowerCase().hashCode()) {
            case -1535907675:
            case -1422950858:
            case -1253501876:
            case -907685685:
            case -788047292:
            case -338481545:
            case 3106:
            case 3184:
            case 3215:
            case 3401:
            case 3479:
            case 3494:
            case 3580:
            case 3581:
            case 3593:
            case 3632:
            case 3669:
            case 3756:
            case 3804:
            case 96400:
            case 96586:
            case 96796:
            case 96801:
            case 96894:
            case 97013:
            case 97300:
            case 97301:
            case 97543:
            case 98437:
            case 98472:
            case 98618:
            case 98689:
            case 98719:
            case 98789:
            case 98808:
            case 98819:
            case 99338:
            case 99351:
            case 99548:
            case 99556:
            case 99582:
            case 99640:
            case 99752:
            case 100208:
            case 100511:
            case 100542:
            case 100730:
            case 100882:
            case 100958:
            case 101460:
            case 101671:
            case 101854:
            case 102556:
            case 102572:
            case 103404:
            case 103438:
            case 103637:
            case 103649:
            case 104074:
            case 104269:
            case 104417:
            case 104430:
            case 104435:
            case 104474:
            case 104479:
            case 104582:
            case 104587:
            case 104987:
            case 105532:
            case 105543:
            case 105551:
            case 106202:
            case 106496:
            case 107141:
            case 107305:
            case 107932:
            case 107988:
            case 107989:
            case 108341:
            case 108382:
            case 108413:
            case 108419:
            case 108426:
            case 108430:
            case 108570:
            case 109824:
            case 109860:
            case 110754:
            case 110801:
            case 110834:
            case 110883:
            case 110968:
            case 110989:
            case 111052:
            case 111220:
            case 111265:
            case 111269:
            case 111390:
            case 111420:
            case 111482:
            case 111494:
            case 112185:
            case 112712:
            case 112788:
            case 112862:
            case 113115:
            case 113132:
            case 113291:
            case 113698:
            case 113700:
            case 113837:
            case 113854:
            case 114101:
            case 114130:
            case 114276:
            case 114381:
            case 114809:
            case 114922:
            case 114970:
            case 115161:
            case 115312:
            case 115639:
            case 116079:
            case 116537:
            case 116551:
            case 116609:
            case 117218:
            case 117537:
            case 117840:
            case 117938:
            case 118023:
            case 118026:
            case 118028:
            case 118439:
            case 118783:
            case 118807:
            case 118939:
            case 120703:
            case 3003834:
            case 3016404:
            case 3088960:
            case 3213227:
            case 3271912:
            case 3358271:
            case 3444044:
            case 3446979:
            case 3447940:
            case 3524225:
            case 3524692:
            case 3526257:
            case 3682393:
            case 35379135:
            case 114035747:
                break;
        }
        return true;
    }

    public static boolean isVideoDocument(TLRPC.Document document) {
        int lastIndexOf;
        if (document == null) {
            return false;
        }
        String str = null;
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        for (int i12 = 0; i12 < document.attributes.size(); i12++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                if (documentAttribute.round_message) {
                    return false;
                }
                i10 = documentAttribute.w;
                i11 = documentAttribute.h;
                z11 = true;
            } else if (documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) {
                z10 = true;
            } else if (documentAttribute instanceof TLRPC.TL_documentAttributeFilename) {
                str = documentAttribute.file_name;
            }
        }
        if (str != null && (lastIndexOf = str.lastIndexOf(".")) >= 0 && isV(str.substring(lastIndexOf + 1))) {
            return false;
        }
        if (z10 && (i10 > 1280 || i11 > 1280)) {
            z10 = false;
        }
        if (SharedConfig.streamMkv && !z11 && "video/x-matroska".equals(document.mime_type)) {
            z11 = true;
        }
        return z11 && !z10;
    }

    public static boolean isVideoMessage(TLRPC.Message message) {
        TL_iv.RichMessage richMessage;
        if (message != null && (richMessage = message.rich_message) != null) {
            return isVideoDocument(findVideo(richMessage));
        }
        if (getMedia(message) == null || !isVideoSticker(getMedia(message).document)) {
            return getMedia(message) instanceof TLRPC.TL_messageMediaWebPage ? isVideoDocument(getMedia(message).webpage.document) : getMedia(message) != null && isVideoDocument(getMedia(message).document);
        }
        return false;
    }

    public static boolean isVideoSticker(TLRPC.Document document) {
        return document != null && isVideoStickerDocument(document);
    }

    public static boolean isVideoStickerDocument(TLRPC.Document document) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                    return "video/webm".equals(document.mime_type);
                }
            }
        }
        return false;
    }

    public static boolean isVideoWebDocument(WebFile webFile) {
        return webFile != null && webFile.mime_type.startsWith("video/");
    }

    public static boolean isVoiceDocument(TLRPC.Document document) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    return documentAttribute.voice;
                }
            }
        }
        return false;
    }

    public static boolean isVoiceMessage(TLRPC.Message message) {
        return getMedia(message) instanceof TLRPC.TL_messageMediaWebPage ? isVoiceDocument(getMedia(message).webpage.document) : getMedia(message) != null && isVoiceDocument(getMedia(message).document);
    }

    public static boolean isVoiceWebDocument(WebFile webFile) {
        return webFile != null && webFile.mime_type.equals("audio/ogg");
    }

    public static boolean isVoteResultsIsNotEmpty(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults;
        if (tL_messageMediaPoll != null && (pollResults = tL_messageMediaPoll.results) != null && !pollResults.results.isEmpty()) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_messageMediaPoll.results.results.get(i10).voters > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isVoted(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults;
        if (tL_messageMediaPoll != null && (pollResults = tL_messageMediaPoll.results) != null && !pollResults.results.isEmpty()) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_messageMediaPoll.results.results.get(i10).chosen) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isWebM(TLRPC.Document document) {
        return document != null && "video/webm".equals(document.mime_type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$addEntitiesToText$2(TLRPC.MessageEntity messageEntity, TLRPC.MessageEntity messageEntity2) {
        int i10 = messageEntity.offset;
        int i11 = messageEntity2.offset;
        if (i10 > i11) {
            return 1;
        }
        return i10 < i11 ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$handleFoundWords$3(String str, String str2) {
        return str2.length() - str.length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadAnimatedEmojiDocument$0(TLRPC.Document document) {
        this.emojiAnimatedSticker = document;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.animatedEmojiDocumentLoaded, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadAnimatedEmojiDocument$1(TLRPC.Document document) {
        AndroidUtilities.runOnUIThread(new d2(22, this, document));
    }

    public static StaticLayout makeStaticLayout(CharSequence charSequence, TextPaint textPaint, int i10, float f10, float f11, boolean z10) {
        return makeStaticLayout(charSequence, textPaint, i10, f10, f11, z10, Layout.Alignment.ALIGN_NORMAL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
    
        if (r2.signature_profiles != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0060, code lost:
    
        if (getDialogId() == org.telegram.messenger.UserObject.VERIFY) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean needDrawAvatarInternal() {
        TLRPC.Message message;
        boolean z10;
        TLRPC.MessageFwdHeader messageFwdHeader;
        if (this.isRepostPreview || this.isSaved || this.forceAvatar || this.customAvatarDrawable != null || (((message = this.messageOwner) != null && message.guestchat_via_from != null) || this.searchType != 0)) {
            return true;
        }
        if (getDialogId() < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-getDialogId()));
            if (isEphemeral() && ChatObject.isChannelAndNotMegaGroup(chat)) {
                return false;
            }
            if (chat != null) {
            }
            z10 = false;
        }
        return !isSponsored() && ((isFromChat() && isFromUser()) || isFromGroup() || z10 || this.eventId != 0 || !((messageFwdHeader = this.messageOwner.fwd_from) == null || messageFwdHeader.saved_from_peer == null));
    }

    public static void normalizeFlags(TLRPC.Message message) {
        TLRPC.Peer peer = message.from_id;
        if (peer == null) {
            message.flags &= -257;
        }
        if (peer == null) {
            message.flags &= -5;
        }
        if (message.reply_to == null) {
            message.flags &= -9;
        }
        if (message.media == null) {
            message.flags &= -513;
        }
        if (message.reply_markup == null) {
            message.flags &= -65;
        }
        if (message.replies == null) {
            message.flags &= -8388609;
        }
        if (message.reactions == null) {
            message.flags &= -1048577;
        }
    }

    public static CharSequence peerNameWithIcon(int i10, TLRPC.Peer peer) {
        return peerNameWithIcon(i10, peer, !(peer instanceof TLRPC.TL_peerUser));
    }

    public static boolean peersEqual(TLRPC.InputPeer inputPeer, TLRPC.InputPeer inputPeer2) {
        if (inputPeer == null && inputPeer2 == null) {
            return true;
        }
        if (inputPeer != null && inputPeer2 != null) {
            if ((inputPeer instanceof TLRPC.TL_inputPeerChat) && (inputPeer2 instanceof TLRPC.TL_inputPeerChat)) {
                return inputPeer.chat_id == inputPeer2.chat_id;
            }
            if ((inputPeer instanceof TLRPC.TL_inputPeerChannel) && (inputPeer2 instanceof TLRPC.TL_inputPeerChannel)) {
                return inputPeer.channel_id == inputPeer2.channel_id;
            }
            if ((inputPeer instanceof TLRPC.TL_inputPeerUser) && (inputPeer2 instanceof TLRPC.TL_inputPeerUser)) {
                return inputPeer.user_id == inputPeer2.user_id;
            }
            if ((inputPeer instanceof TLRPC.TL_inputPeerSelf) && (inputPeer2 instanceof TLRPC.TL_inputPeerSelf)) {
                return true;
            }
        }
        return false;
    }

    public static TLRPC.TL_textWithEntities removeLinks(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
        tL_textWithEntities2.text = tL_textWithEntities.text;
        for (int i10 = 0; i10 < tL_textWithEntities.entities.size(); i10++) {
            TLRPC.MessageEntity messageEntity = tL_textWithEntities.entities.get(i10);
            if (!(messageEntity instanceof TLRPC.TL_messageEntityUrl) && !(messageEntity instanceof TLRPC.TL_messageEntityTextUrl)) {
                tL_textWithEntities2.entities.add(messageEntity);
            }
        }
        return tL_textWithEntities2;
    }

    public static void setUnreadFlags(TLRPC.Message message, int i10) {
        message.unread = (i10 & 1) == 0;
        message.media_unread = (i10 & 2) == 0;
    }

    public static boolean shouldEncryptPhotoOrVideo(int i10, TLRPC.Message message) {
        int i11;
        if ((message == null || message.media == null || !((isVoiceDocument(getDocument(message)) || isRoundVideoMessage(message)) && message.media.ttl_seconds == Integer.MAX_VALUE)) && !(getMedia(message) instanceof TLRPC.TL_messageMediaPaidMedia)) {
            return message instanceof TLRPC.TL_message_secret ? ((getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || isVideoMessage(message)) && (i11 = message.ttl) > 0 && i11 <= 60 : ((getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || (getMedia(message) instanceof TLRPC.TL_messageMediaDocument)) && getMedia(message).ttl_seconds != 0;
        }
        return true;
    }

    public static SpannableStringBuilder span(String str, int i10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new cq(i10, 0), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static void toggleTodo(int i10, long j10, TLRPC.TL_messageMediaToDo tL_messageMediaToDo, int i11, boolean z10, int i12) {
        int i13 = 0;
        while (i13 < tL_messageMediaToDo.completions.size()) {
            if (tL_messageMediaToDo.completions.get(i13).id == i11) {
                tL_messageMediaToDo.completions.remove(i13);
                if (tL_messageMediaToDo.completions.isEmpty()) {
                    tL_messageMediaToDo.flags &= -2;
                }
                i13--;
            }
            i13++;
        }
        if (z10) {
            TLRPC.TL_todoCompletion tL_todoCompletion = new TLRPC.TL_todoCompletion();
            tL_todoCompletion.id = i11;
            tL_todoCompletion.completed_by = MessagesController.getInstance(i10).getPeer(j10);
            tL_todoCompletion.date = i12;
            tL_messageMediaToDo.flags |= 1;
            tL_messageMediaToDo.completions.add(tL_todoCompletion);
        }
    }

    private static void updatePhotoSizeLocations(ArrayList<TLRPC.PhotoSize> arrayList, List<TLRPC.PhotoSize> list) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.PhotoSize photoSize = arrayList.get(i10);
            if (photoSize != null) {
                int size2 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size2) {
                        TLRPC.PhotoSize photoSize2 = list.get(i11);
                        if (!(photoSize2 instanceof TLRPC.TL_photoSizeEmpty) && !(photoSize2 instanceof TLRPC.TL_photoCachedSize) && photoSize2 != null && photoSize2.type.equals(photoSize.type)) {
                            photoSize.location = photoSize2.location;
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
    }

    public static void updatePollResults(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollResults pollResults) {
        TLRPC.Poll poll;
        ArrayList<TLRPC.PollAnswerVoters> arrayList;
        ArrayList arrayList2;
        byte[] bArr;
        ArrayList<TLRPC.PollAnswerVoters> arrayList3;
        if (tL_messageMediaPoll == null || pollResults == null) {
            return;
        }
        if ((pollResults.flags & 2) != 0) {
            if (!pollResults.min || (arrayList3 = tL_messageMediaPoll.results.results) == null) {
                arrayList2 = null;
                bArr = null;
            } else {
                int size = arrayList3.size();
                arrayList2 = null;
                bArr = null;
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i10);
                    if (pollAnswerVoters.chosen) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(pollAnswerVoters.option);
                    }
                    if (pollAnswerVoters.correct) {
                        bArr = pollAnswerVoters.option;
                    }
                }
            }
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            ArrayList<TLRPC.PollAnswerVoters> arrayList4 = pollResults.results;
            pollResults2.results = arrayList4;
            if (arrayList2 != null || bArr != null) {
                int size2 = arrayList4.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    TLRPC.PollAnswerVoters pollAnswerVoters2 = tL_messageMediaPoll.results.results.get(i11);
                    if (arrayList2 != null) {
                        int size3 = arrayList2.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size3) {
                                break;
                            }
                            if (Arrays.equals(pollAnswerVoters2.option, (byte[]) arrayList2.get(i12))) {
                                pollAnswerVoters2.chosen = true;
                                arrayList2.remove(i12);
                                break;
                            }
                            i12++;
                        }
                        if (arrayList2.isEmpty()) {
                            arrayList2 = null;
                        }
                    }
                    if (bArr != null && Arrays.equals(pollAnswerVoters2.option, bArr)) {
                        pollAnswerVoters2.correct = true;
                        bArr = null;
                    }
                    if (arrayList2 == null && bArr == null) {
                        break;
                    }
                }
            }
            TLRPC.PollResults pollResults3 = tL_messageMediaPoll.results;
            pollResults3.flags = 2 | pollResults3.flags;
        } else if (!pollResults.min && (poll = tL_messageMediaPoll.poll) != null && poll.hide_results_until_close && ((arrayList = pollResults.results) == null || arrayList.isEmpty())) {
            tL_messageMediaPoll.results.results = new ArrayList<>();
            TLRPC.PollResults pollResults4 = tL_messageMediaPoll.results;
            pollResults4.flags = h7.a8.b(pollResults4.flags, 2, false);
        }
        if ((pollResults.flags & 4) != 0) {
            TLRPC.PollResults pollResults5 = tL_messageMediaPoll.results;
            pollResults5.total_voters = pollResults.total_voters;
            pollResults5.flags |= 4;
        }
        if ((pollResults.flags & 8) != 0) {
            TLRPC.PollResults pollResults6 = tL_messageMediaPoll.results;
            pollResults6.recent_voters = pollResults.recent_voters;
            pollResults6.flags |= 8;
        }
        if ((pollResults.flags & 16) != 0) {
            TLRPC.PollResults pollResults7 = tL_messageMediaPoll.results;
            pollResults7.solution = pollResults.solution;
            pollResults7.solution_entities = pollResults.solution_entities;
            pollResults7.flags |= 16;
        }
        if (pollResults.min) {
            return;
        }
        TLRPC.PollResults pollResults8 = tL_messageMediaPoll.results;
        pollResults8.has_unread_votes = pollResults.has_unread_votes;
        pollResults8.can_view_stats = pollResults.can_view_stats;
    }

    public static void updateReactions(TLRPC.Message message, TLRPC.TL_messageReactions tL_messageReactions) {
        if (message == null || tL_messageReactions == null) {
            return;
        }
        TLRPC.TL_messageReactions tL_messageReactions2 = message.reactions;
        if (tL_messageReactions2 != null) {
            int size = tL_messageReactions2.results.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.ReactionCount reactionCount = message.reactions.results.get(i10);
                int size2 = tL_messageReactions.results.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    TLRPC.ReactionCount reactionCount2 = tL_messageReactions.results.get(i11);
                    if (ig.r0.g(reactionCount.reaction, reactionCount2.reaction)) {
                        if (!z10 && tL_messageReactions.min && reactionCount.chosen) {
                            reactionCount2.chosen = true;
                            z10 = true;
                        }
                        reactionCount2.lastDrawnPosition = reactionCount.lastDrawnPosition;
                    }
                }
                if (reactionCount.chosen) {
                    z10 = true;
                }
            }
        }
        message.reactions = tL_messageReactions;
        message.flags |= 1048576;
    }

    public static CharSequence userSpan() {
        return userSpan(0);
    }

    public void addPaidReactions(int i10, boolean z10, long j10) {
        TLRPC.Message message = this.messageOwner;
        if (message.reactions == null) {
            message.reactions = new TLRPC.TL_messageReactions();
            TLRPC.Message message2 = this.messageOwner;
            message2.reactions.reactions_as_tags = getDialogId(message2) == UserConfig.getInstance(this.currentAccount).getClientUserId();
            this.messageOwner.reactions.can_see_list = isFromGroup() || isFromUser();
        }
        addPaidReactions(this.currentAccount, this.messageOwner.reactions, i10, j10, z10);
    }

    public void applyMediaExistanceFlags(int i10) {
        if (i10 == -1) {
            checkMediaExistance();
        } else {
            this.attachPathExists = (i10 & 1) != 0;
            this.mediaExists = (i10 & 2) != 0;
        }
    }

    public void applyNewText() {
        this.translated = false;
        this.summarized = false;
        applyNewText(this.messageOwner.message);
    }

    public void applyQuickReply(String str, int i10) {
        TLRPC.Message message = this.messageOwner;
        if (message == null) {
            return;
        }
        if (i10 != 0) {
            message.flags |= TLObject.FLAG_30;
            message.quick_reply_shortcut_id = i10;
            TLRPC.TL_inputQuickReplyShortcutId tL_inputQuickReplyShortcutId = new TLRPC.TL_inputQuickReplyShortcutId();
            tL_inputQuickReplyShortcutId.shortcut_id = i10;
            this.messageOwner.quick_reply_shortcut = tL_inputQuickReplyShortcutId;
            return;
        }
        if (str != null) {
            TLRPC.TL_inputQuickReplyShortcut tL_inputQuickReplyShortcut = new TLRPC.TL_inputQuickReplyShortcut();
            tL_inputQuickReplyShortcut.shortcut = str;
            this.messageOwner.quick_reply_shortcut = tL_inputQuickReplyShortcut;
        } else {
            message.flags &= -1073741825;
            message.quick_reply_shortcut_id = 0;
            message.quick_reply_shortcut = null;
        }
    }

    public void applyTimestampsHighlightForReplyMsg() {
        applyTimestampsHighlightForReplyMsg(this.messageText);
    }

    public boolean areTags() {
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.Message message = this.messageOwner;
        if (message == null || (tL_messageReactions = message.reactions) == null) {
            return false;
        }
        return tL_messageReactions.reactions_as_tags;
    }

    public boolean canAppendToTodo() {
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (!(media instanceof TLRPC.TL_messageMediaToDo) || isForwarded()) {
            return false;
        }
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) media;
        if (tL_messageMediaToDo.todo.list.size() >= MessagesController.getInstance(this.currentAccount).todoItemsMax) {
            return false;
        }
        if (isOutOwner()) {
            return true;
        }
        TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
        return todoList.others_can_complete && todoList.others_can_append;
    }

    public boolean canBeSensitive() {
        if (this.messageOwner == null) {
            return false;
        }
        int i10 = this.type;
        return ((i10 != 1 && i10 != 3 && i10 != 9 && i10 != 8 && i10 != 5) || this.sendPreview || this.isRepostPreview || isOutOwner() || this.messageOwner.send_state != 0) ? false : true;
    }

    public boolean canCompleteTodo() {
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if ((media instanceof TLRPC.TL_messageMediaToDo) && !isForwarded()) {
            return isOutOwner() || ((TLRPC.TL_messageMediaToDo) media).todo.others_can_complete;
        }
        return false;
    }

    public boolean canDeleteMessage(boolean z10, TLRPC.Chat chat) {
        TLRPC.Message message;
        if (isStory() && (message = this.messageOwner) != null && message.dialog_id == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            return true;
        }
        return (this.eventId == 0 && this.sponsoredId == null && canDeleteMessage(this.currentAccount, z10, this.messageOwner, chat)) || isEphemeral();
    }

    public boolean canEditMedia() {
        if (!isSecretMedia() && !isEphemeralAndNotWelcome()) {
            if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) {
                return true;
            }
            if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument) {
                return (isVoice() || isSticker() || isAnimatedSticker() || isRoundVideo()) ? false : true;
            }
            if (isMediaEmpty()) {
                return true;
            }
        }
        return false;
    }

    public boolean canEditMessage(TLRPC.Chat chat) {
        return !isEphemeralAndNotWelcome() && canEditMessage(this.currentAccount, this.messageOwner, chat, this.scheduled);
    }

    public boolean canEditMessageAnytime(TLRPC.Chat chat) {
        return canEditMessageAnytime(this.currentAccount, this.messageOwner, chat);
    }

    public boolean canEditMessageScheduleTime(TLRPC.Chat chat) {
        return canEditMessageScheduleTime(this.currentAccount, this.messageOwner, chat);
    }

    public boolean canForwardMessage() {
        int i10;
        return (isQuickReply() || (i10 = this.type) == 30 || i10 == 31 || i10 == 32 || i10 == 33 || i10 == 35 || i10 == 37 || (this.messageOwner instanceof TLRPC.TL_message_secret) || needDrawBluredPreview() || isLiveLocation() || this.type == 16 || isSponsored() || this.messageOwner.noforwards) ? false : true;
    }

    public boolean canPreviewDocument() {
        return canPreviewDocument(getDocument());
    }

    public boolean canSetReaction() {
        if (isEphemeral()) {
            return false;
        }
        TLRPC.Message message = this.messageOwner;
        if (message instanceof TLRPC.TL_messageService) {
            return message.reactions_are_possible;
        }
        return true;
    }

    public boolean canStreamVideo() {
        if (hasVideoQualities()) {
            return true;
        }
        TLRPC.Document document = getDocument();
        if (document != null && !(document instanceof TLRPC.TL_documentEncrypted)) {
            if (SharedConfig.streamAllVideo) {
                return true;
            }
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    return documentAttribute.supports_streaming;
                }
            }
            if (SharedConfig.streamMkv && "video/x-matroska".equals(document.mime_type)) {
                return true;
            }
        }
        return false;
    }

    public boolean canUnvote() {
        if (this.type != 17) {
            return false;
        }
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (media instanceof TLRPC.TL_messageMediaPoll) {
            return canUnvote((TLRPC.TL_messageMediaPoll) media);
        }
        return false;
    }

    public boolean canViewThread() {
        if (this.messageOwner.action != null) {
            return false;
        }
        if (hasReplies()) {
            return true;
        }
        MessageObject messageObject = this.replyMessageObject;
        return ((messageObject == null || messageObject.messageOwner.replies == null) && getReplyTopMsgId() == 0) ? false : true;
    }

    public void checkBigAnimatedEmoji() {
        org.telegram.ui.Components.t5[] t5VarArr;
        int i10;
        this.emojiAnimatedSticker = null;
        this.emojiAnimatedStickerId = null;
        if (this.emojiOnlyCount == 1 && !(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && !(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaInvoice) && ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaEmpty) || getMedia(this.messageOwner) == null)) {
            TLRPC.Message message = this.messageOwner;
            if (message.grouped_id == 0) {
                if (message.entities.isEmpty()) {
                    CharSequence charSequence = this.messageText;
                    int indexOf = TextUtils.indexOf(charSequence, "🏻");
                    if (indexOf >= 0) {
                        this.emojiAnimatedStickerColor = "_c1";
                        charSequence = charSequence.subSequence(0, indexOf);
                    } else {
                        indexOf = TextUtils.indexOf(charSequence, "🏼");
                        if (indexOf >= 0) {
                            this.emojiAnimatedStickerColor = "_c2";
                            charSequence = charSequence.subSequence(0, indexOf);
                        } else {
                            indexOf = TextUtils.indexOf(charSequence, "🏽");
                            if (indexOf >= 0) {
                                this.emojiAnimatedStickerColor = "_c3";
                                charSequence = charSequence.subSequence(0, indexOf);
                            } else {
                                indexOf = TextUtils.indexOf(charSequence, "🏾");
                                if (indexOf >= 0) {
                                    this.emojiAnimatedStickerColor = "_c4";
                                    charSequence = charSequence.subSequence(0, indexOf);
                                } else {
                                    indexOf = TextUtils.indexOf(charSequence, "🏿");
                                    if (indexOf >= 0) {
                                        this.emojiAnimatedStickerColor = "_c5";
                                        charSequence = charSequence.subSequence(0, indexOf);
                                    } else {
                                        this.emojiAnimatedStickerColor = "";
                                    }
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(this.emojiAnimatedStickerColor) && (i10 = indexOf + 2) < this.messageText.length()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(charSequence.toString());
                        CharSequence charSequence2 = this.messageText;
                        sb2.append(charSequence2.subSequence(i10, charSequence2.length()).toString());
                        charSequence = sb2.toString();
                    }
                    if (TextUtils.isEmpty(this.emojiAnimatedStickerColor) || EmojiData.emojiColoredMap.contains(charSequence.toString())) {
                        this.emojiAnimatedSticker = MediaDataController.getInstance(this.currentAccount).getEmojiAnimatedSticker(charSequence);
                    }
                } else if (this.messageOwner.entities.size() == 1 && (this.messageOwner.entities.get(0) instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                    try {
                        Long valueOf = Long.valueOf(((TLRPC.TL_messageEntityCustomEmoji) this.messageOwner.entities.get(0)).document_id);
                        this.emojiAnimatedStickerId = valueOf;
                        TLRPC.Document f10 = org.telegram.ui.Components.k5.f(this.currentAccount, valueOf.longValue());
                        this.emojiAnimatedSticker = f10;
                        if (f10 == null) {
                            CharSequence charSequence3 = this.messageText;
                            if ((charSequence3 instanceof Spanned) && (t5VarArr = (org.telegram.ui.Components.t5[]) ((Spanned) charSequence3).getSpans(0, charSequence3.length(), org.telegram.ui.Components.t5.class)) != null && t5VarArr.length == 1) {
                                this.emojiAnimatedSticker = t5VarArr[0].document;
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (this.emojiAnimatedSticker == null && this.emojiAnimatedStickerId == null) {
            generateLayout(null);
            return;
        }
        if (isSticker()) {
            this.type = 13;
        } else if (isAnimatedSticker()) {
            this.type = 15;
        } else {
            this.type = MediaDataController.MAX_STYLE_RUNS_COUNT;
        }
    }

    public boolean checkLayout() {
        CharSequence charSequence;
        int i10 = this.type;
        if ((i10 == 0 || i10 == 19 || i10 == 36) && this.messageOwner.peer_id != null && (charSequence = this.messageText) != null && (charSequence.length() != 0 || this.isBotPendingDraft)) {
            if (this.layoutCreated) {
                int minTabletSide = AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() : AndroidUtilities.displaySize.x;
                TextPaint textPaint = org.telegram.ui.ActionBar.g6.o2;
                float textSize = textPaint != null ? textPaint.getTextSize() : 0.0f;
                if (Math.abs(this.generatedWithMinSize - minTabletSide) > AndroidUtilities.dp(52.0f) || this.generatedWithDensity != AndroidUtilities.density || this.generatedWithFontSize != textSize) {
                    this.layoutCreated = false;
                }
            }
            if (!this.layoutCreated) {
                this.layoutCreated = true;
                TLRPC.User user = isFromUser() ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.from_id.user_id)) : null;
                TextPaint textPaint2 = getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame ? org.telegram.ui.ActionBar.g6.x2 : org.telegram.ui.ActionBar.g6.o2;
                int[] iArr = allowsBigEmoji() ? new int[1] : null;
                CharSequence replaceEmoji = Emoji.replaceEmoji(this.messageText, textPaint2.getFontMetricsInt(), false, iArr);
                this.messageText = replaceEmoji;
                Spannable replaceAnimatedEmoji = replaceAnimatedEmoji(replaceEmoji, textPaint2.getFontMetricsInt());
                this.messageText = replaceAnimatedEmoji;
                if (iArr != null && iArr[0] > 1) {
                    replaceEmojiToLottieFrame(replaceAnimatedEmoji, iArr);
                }
                checkEmojiOnly(iArr);
                checkBigAnimatedEmoji();
                setType();
                generateLayout(user);
                if (this.caption != null) {
                    this.caption = null;
                    generateCaption();
                }
                return true;
            }
        }
        return false;
    }

    public void checkMediaExistance() {
        checkMediaExistance(true);
    }

    public void copyStableParams(MessageObject messageObject) {
        ArrayList<TextLayoutBlock> arrayList;
        TLRPC.MessageMedia messageMedia;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        TLRPC.TL_messageReactions tL_messageReactions;
        this.stableId = messageObject.stableId;
        TLRPC.Message message = this.messageOwner;
        message.premiumEffectWasPlayed = messageObject.messageOwner.premiumEffectWasPlayed;
        this.forcePlayEffect = messageObject.forcePlayEffect;
        this.wasJustSent = messageObject.wasJustSent;
        TLRPC.TL_messageReactions tL_messageReactions2 = message.reactions;
        int i10 = 0;
        if (tL_messageReactions2 != null && (arrayList2 = tL_messageReactions2.results) != null && !arrayList2.isEmpty() && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
            for (int i11 = 0; i11 < this.messageOwner.reactions.results.size(); i11++) {
                TLRPC.ReactionCount reactionCount = this.messageOwner.reactions.results.get(i11);
                for (int i12 = 0; i12 < messageObject.messageOwner.reactions.results.size(); i12++) {
                    TLRPC.ReactionCount reactionCount2 = messageObject.messageOwner.reactions.results.get(i12);
                    if (ig.r0.g(reactionCount.reaction, reactionCount2.reaction)) {
                        reactionCount.lastDrawnPosition = reactionCount2.lastDrawnPosition;
                    }
                }
            }
        }
        boolean z10 = messageObject.isSpoilersRevealed;
        this.isSpoilersRevealed = z10;
        TLRPC.Message message2 = this.messageOwner;
        TLRPC.Message message3 = messageObject.messageOwner;
        message2.replyStory = message3.replyStory;
        TLRPC.MessageMedia messageMedia2 = message2.media;
        if (messageMedia2 != null && (messageMedia = message3.media) != null) {
            messageMedia2.storyItem = messageMedia.storyItem;
        }
        if (!z10 || (arrayList = this.textLayoutBlocks) == null) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            TextLayoutBlock textLayoutBlock = arrayList.get(i10);
            i10++;
            textLayoutBlock.spoilers.clear();
        }
    }

    public void createMediaThumbs() {
        TLRPC.MessageMedia messageMedia;
        if (isStoryMedia()) {
            TL_stories.StoryItem storyItem = getMedia(this.messageOwner).storyItem;
            if (storyItem == null || (messageMedia = storyItem.media) == null) {
                return;
            }
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50);
                this.mediaThumb = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true), document);
                this.mediaSmallThumb = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                return;
            } else {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, 50);
                this.mediaThumb = ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, 320, false, closestPhotoSizeWithSize2, true), this.photoThumbsObject);
                this.mediaSmallThumb = ImageLocation.getForObject(closestPhotoSizeWithSize2, this.photoThumbsObject);
                return;
            }
        }
        if (isVideo()) {
            TLRPC.Document document2 = getDocument();
            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, 50);
            this.mediaThumb = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, 320), document2);
            this.mediaSmallThumb = ImageLocation.getForDocument(closestPhotoSizeWithSize3, document2);
            return;
        }
        if (!(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) || getMedia(this.messageOwner).photo == null || this.photoThumbs.isEmpty()) {
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, 50);
        this.mediaThumb = ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, 320, false, closestPhotoSizeWithSize4, false), this.photoThumbsObject);
        this.mediaSmallThumb = ImageLocation.getForObject(closestPhotoSizeWithSize4, this.photoThumbsObject);
    }

    public void createMessageSendInfo() {
        createMessageSendInfo(false);
    }

    public void createStrippedThumb() {
        if (this.photoThumbs != null) {
            if ((canCreateStripedThubms() || hasExtendedMediaPreview()) && this.strippedThumb == null) {
                try {
                    String str = isRoundVideo() ? "br" : "b";
                    int size = this.photoThumbs.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.PhotoSize photoSize = this.photoThumbs.get(i10);
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            this.strippedThumb = new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, str));
                            return;
                        }
                    }
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
        }
    }

    public boolean didSpoilLoginCode() {
        return this.spoiledLoginCode;
    }

    public boolean doesPaidReactionExist() {
        TLRPC.Message message = this.messageOwner;
        if (message.reactions == null) {
            message.reactions = new TLRPC.TL_messageReactions();
            TLRPC.Message message2 = this.messageOwner;
            message2.reactions.reactions_as_tags = getDialogId(message2) == UserConfig.getInstance(this.currentAccount).getClientUserId();
            this.messageOwner.reactions.can_see_list = isFromGroup() || isFromUser();
        }
        for (int i10 = 0; i10 < this.messageOwner.reactions.results.size(); i10++) {
            if (this.messageOwner.reactions.results.get(i10).reaction instanceof TLRPC.TL_reactionPaid) {
                return true;
            }
        }
        return false;
    }

    public boolean ensurePaidReactionsExist(boolean z10) {
        TLRPC.Message message = this.messageOwner;
        if (message.reactions == null) {
            message.reactions = new TLRPC.TL_messageReactions();
            TLRPC.Message message2 = this.messageOwner;
            message2.reactions.reactions_as_tags = getDialogId(message2) == UserConfig.getInstance(this.currentAccount).getClientUserId();
            this.messageOwner.reactions.can_see_list = isFromGroup() || isFromUser();
        }
        TLRPC.ReactionCount reactionCount = null;
        for (int i10 = 0; i10 < this.messageOwner.reactions.results.size(); i10++) {
            if (this.messageOwner.reactions.results.get(i10).reaction instanceof TLRPC.TL_reactionPaid) {
                reactionCount = this.messageOwner.reactions.results.get(i10);
            }
        }
        if (reactionCount != null) {
            return false;
        }
        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
        tL_reactionCount.reaction = new TLRPC.TL_reactionPaid();
        tL_reactionCount.count = 1;
        tL_reactionCount.chosen = z10;
        this.messageOwner.reactions.results.add(0, tL_reactionCount);
        return true;
    }

    public boolean equals(MessageObject messageObject) {
        return messageObject != null && getId() == messageObject.getId() && getDialogId() == messageObject.getDialogId();
    }

    public void expandChannelRecommendations(boolean z10) {
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        String str = "c" + getDialogId() + "_rec";
        this.channelJoinedExpanded = z10;
        edit.putBoolean(str, z10).apply();
    }

    public void generateCaption() {
        boolean z10;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        TL_stories.StoryItem storyItem;
        boolean z11;
        if (isRoundVideo()) {
            return;
        }
        if (this.caption != null) {
            if (this.translated) {
                TLRPC.Message message = this.messageOwner;
                if (message.translatedText != null || (this.summarized && message.translatedSummaryText != null)) {
                    z11 = true;
                    if (z11 == this.captionTranslated && this.summarized == this.captionSummarized) {
                        return;
                    }
                }
            }
            z11 = false;
            if (z11 == this.captionTranslated) {
                return;
            }
        }
        TLRPC.Message message2 = this.messageOwner;
        String str = message2.message;
        ArrayList<TLRPC.MessageEntity> arrayList = message2.entities;
        if (this.type == 23) {
            TLRPC.MessageMedia messageMedia = message2.media;
            if (messageMedia != null && (storyItem = messageMedia.storyItem) != null) {
                str = storyItem.caption;
                arrayList = storyItem.entities;
                z10 = true;
                TLRPC.Message message3 = this.messageOwner;
                tL_textWithEntities = message3.translatedSummaryText;
                if (tL_textWithEntities == null && this.summarized && this.translated) {
                    this.captionSummarized = true;
                    this.captionTranslated = true;
                    str = tL_textWithEntities.text;
                    arrayList = tL_textWithEntities.entities;
                } else {
                    tL_textWithEntities2 = message3.summaryText;
                    if (tL_textWithEntities2 == null && this.summarized) {
                        this.captionSummarized = true;
                        this.captionTranslated = false;
                        str = tL_textWithEntities2.text;
                        arrayList = tL_textWithEntities2.entities;
                    } else {
                        tL_textWithEntities3 = message3.translatedText;
                        if (tL_textWithEntities3 == null && this.translated) {
                            this.captionSummarized = false;
                            this.captionTranslated = true;
                            str = tL_textWithEntities3.text;
                            arrayList = tL_textWithEntities3.entities;
                        } else {
                            this.captionSummarized = false;
                            this.captionTranslated = false;
                        }
                    }
                }
                if (!isMediaEmpty() || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame) || TextUtils.isEmpty(str)) {
                    return;
                }
                CharSequence replaceEmoji = Emoji.replaceEmoji(str, org.telegram.ui.ActionBar.g6.o2.getFontMetricsInt(), false);
                this.caption = replaceEmoji;
                this.caption = replaceAnimatedEmoji(replaceEmoji, arrayList, org.telegram.ui.ActionBar.g6.o2.getFontMetricsInt(), false);
                boolean z12 = z10 || (!(this.messageOwner.send_state != 0 ? false : arrayList.isEmpty() ^ true) && (this.eventId != 0 || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto_old) || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto_layer68) || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto_layer74) || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument_old) || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument_layer68) || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument_layer74) || ((isOut() && this.messageOwner.send_state != 0) || this.messageOwner.id < 0)));
                if (z12) {
                    if (containsUrls(this.caption)) {
                        try {
                            AndroidUtilities.addLinksSafe((Spannable) this.caption, 5, false, true);
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                    }
                    addUrlsByPattern(isOutOwner(), this.caption, true, 0, 0, true);
                }
                addEntitiesToText(this.caption, z12);
                this.caption = v00.a(this.caption, true);
                if (isVideo()) {
                    addUrlsByPattern(isOutOwner(), this.caption, true, 3, (int) getDuration(), false);
                } else if (isMusic() || isVoice()) {
                    addUrlsByPattern(isOutOwner(), this.caption, true, 4, (int) getDuration(), false);
                }
                applyTimestampsHighlightForReplyMsg(this.caption);
                return;
            }
            arrayList = new ArrayList<>();
            str = "";
        } else if (hasExtendedMedia()) {
            TLRPC.Message message4 = this.messageOwner;
            str = message4.media.description;
            message4.message = str;
        }
        z10 = false;
        TLRPC.Message message32 = this.messageOwner;
        tL_textWithEntities = message32.translatedSummaryText;
        if (tL_textWithEntities == null) {
        }
        tL_textWithEntities2 = message32.summaryText;
        if (tL_textWithEntities2 == null) {
        }
        tL_textWithEntities3 = message32.translatedText;
        if (tL_textWithEntities3 == null) {
        }
        this.captionSummarized = false;
        this.captionTranslated = false;
        if (isMediaEmpty()) {
        }
    }

    public void generateExplanation() {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.PollResults pollResults;
        if (this.type != 17) {
            return;
        }
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (!(media instanceof TLRPC.TL_messageMediaPoll) || (pollResults = ((TLRPC.TL_messageMediaPoll) media).results) == null) {
            str = null;
            arrayList = null;
        } else {
            str = pollResults.solution;
            arrayList = pollResults.solution_entities;
        }
        if (str == null) {
            this.quizExplanation = null;
            return;
        }
        CharSequence replaceEmoji = Emoji.replaceEmoji(str, org.telegram.ui.ActionBar.g6.b3.getFontMetricsInt(), false);
        this.quizExplanation = replaceEmoji;
        Spannable replaceAnimatedEmoji = replaceAnimatedEmoji(replaceEmoji, arrayList, org.telegram.ui.ActionBar.g6.b3.getFontMetricsInt(), false);
        this.quizExplanation = replaceAnimatedEmoji;
        addEntitiesToText(replaceAnimatedEmoji, arrayList, isOutOwner(), true, false, false);
    }

    public void generateGameMessageText(TLRPC.User user) {
        if (user == null && isFromUser()) {
            user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.from_id.user_id));
        }
        MessageObject messageObject = this.replyMessageObject;
        TLRPC.TL_game tL_game = (messageObject == null || getMedia(messageObject) == null || getMedia(this.replyMessageObject).game == null) ? null : getMedia(this.replyMessageObject).game;
        if (tL_game == null) {
            if (user == null || user.id != UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                this.messageText = replaceWithLink(LocaleController.formatString("ActionUserScored", R.string.ActionUserScored, LocaleController.formatPluralString("Points", this.messageOwner.action.score, new Object[0])), "un1", user);
                return;
            } else {
                this.messageText = LocaleController.formatString("ActionYouScored", R.string.ActionYouScored, LocaleController.formatPluralString("Points", this.messageOwner.action.score, new Object[0]));
                return;
            }
        }
        if (user == null || user.id != UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            this.messageText = replaceWithLink(LocaleController.formatString("ActionUserScoredInGame", R.string.ActionUserScoredInGame, LocaleController.formatPluralString("Points", this.messageOwner.action.score, new Object[0])), "un1", user);
        } else {
            this.messageText = LocaleController.formatString("ActionYouScoredInGame", R.string.ActionYouScoredInGame, LocaleController.formatPluralString("Points", this.messageOwner.action.score, new Object[0]));
        }
        this.messageText = replaceWithLink(this.messageText, "un2", tL_game);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:274|(3:275|276|277)|278|(1:280)(15:311|(1:313)|282|283|284|(1:286)(1:308)|287|288|(2:290|(6:292|(3:295|296|(4:298|299|300|301))|305|299|300|301))(1:307)|306|(3:295|296|(0))|305|299|300|301)|281|282|283|284|(0)(0)|287|288|(0)(0)|306|(0)|305|299|300|301) */
    /* JADX WARN: Can't wrap try/catch for region: R(48:157|(1:159)|160|(1:162)(1:428)|163|(1:165)(1:427)|166|(1:168)|(1:170)|(1:426)(1:175)|176|(1:425)(1:183)|184|(2:186|(2:(1:408)|409)(1:189))(2:410|(7:412|(1:414)(1:424)|415|(1:417)(1:423)|418|(1:420)(1:422)|421))|190|(3:192|(1:194)(1:(1:404)(1:405))|195)(1:406)|196|(1:198)(2:399|(1:401)(29:402|200|(6:202|(1:375)(8:208|(1:210)(1:374)|211|212|(1:214)(1:373)|215|(1:217)(1:372)|218)|219|220|(2:222|(1:(2:225|(1:227))(1:228))(1:229))|230)(3:376|(2:378|379)(8:380|381|382|(1:393)(1:386)|387|388|(1:390)(1:392)|391)|344)|231|232|233|(1:237)|238|239|240|241|(1:243)(18:361|(1:363)|245|246|(1:248)|249|(1:251)|252|(3:254|(7:256|257|258|259|260|262|263)|269)|270|(6:272|(20:274|275|276|277|278|(1:280)(15:311|(1:313)|282|283|284|(1:286)(1:308)|287|288|(2:290|(6:292|(3:295|296|(4:298|299|300|301))|305|299|300|301))(1:307)|306|(3:295|296|(0))|305|299|300|301)|281|282|283|284|(0)(0)|287|288|(0)(0)|306|(0)|305|299|300|301)|316|317|(1:(1:320))(2:(1:346)|347)|321)(3:348|(5:350|(1:352)(1:359)|353|(1:355)(1:358)|356)(1:360)|357)|322|(3:324|(1:326)(1:328)|327)|329|(5:333|(1:335)(4:339|(1:341)|337|338)|336|337|338)|342|343|344)|244|245|246|(0)|249|(0)|252|(0)|270|(0)(0)|322|(0)|329|(6:331|333|(0)(0)|336|337|338)|342|343|344))|199|200|(0)(0)|231|232|233|(2:235|237)|238|239|240|241|(0)(0)|244|245|246|(0)|249|(0)|252|(0)|270|(0)(0)|322|(0)|329|(0)|342|343|344|155) */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0633, code lost:
    
        r6 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0591, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0592, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
        r0 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x057b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x057f, code lost:
    
        if (r4 == 0) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0581, code lost:
    
        r35.textXOffset = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0584, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
        r8 = 0.0f;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0278 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x067d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void generateLayout(TLRPC.User user) {
        int dp;
        float f10;
        float f11;
        float f12;
        CharSequence charSequence;
        int i10;
        int dp2;
        boolean z10;
        ArrayList arrayList;
        StaticLayout staticLayout;
        int i11;
        int i12;
        int i13;
        boolean z11;
        TextPaint textPaint;
        int i14;
        int dp3;
        boolean z12;
        CharSequence charSequence2;
        TextPaint textPaint2;
        ArrayList arrayList2;
        int lineCount;
        int dp4;
        int ceil;
        int i15;
        int ceil2;
        int i16;
        int i17;
        pz0 pz0Var;
        int dp5;
        float f13;
        int dp6;
        int i18;
        float f14;
        float f15;
        boolean z13;
        int i19;
        boolean z14;
        int i20;
        float lineLeft;
        View view;
        int i21 = this.type;
        if (i21 == 36) {
            int maxMessageTextWidth = getMaxMessageTextWidth();
            RichMessageLayout richMessageLayout = this.richLayout;
            if (richMessageLayout == null || (this.messageOwner != null && richMessageLayout.needsUpdate(getDisplayRichMessage(), maxMessageTextWidth))) {
                RichMessageLayout richMessageLayout2 = this.richLayout;
                this.richLayout = new RichMessageLayout(this, maxMessageTextWidth, richMessageLayout2);
                if (richMessageLayout2 == null || (view = richMessageLayout2.view) == null) {
                    return;
                }
                richMessageLayout2.detach(view);
                return;
            }
            return;
        }
        if ((i21 != 0 && i21 != 19 && i21 != 24) || this.messageOwner.peer_id == null) {
            return;
        }
        if (TextUtils.isEmpty(this.messageText) && !this.isBotPendingDraft) {
            return;
        }
        applyEntities();
        TLRPC.Message message = this.messageOwner;
        boolean z15 = false;
        boolean z16 = message != null && message.noforwards;
        if (!z16) {
            z16 = MessagesController.getInstance(this.currentAccount).isPeerNoForwards(getDialogId());
        }
        boolean z17 = z16;
        this.textLayoutBlocks = new ArrayList<>();
        this.textWidth = 0;
        CharSequence charSequence3 = this.messageText;
        this.hasCode = (charSequence3 instanceof Spanned) && ((CodeHighlighting.Span[]) ((Spanned) charSequence3).getSpans(0, charSequence3.length(), CodeHighlighting.Span.class)).length > 0;
        CharSequence charSequence4 = this.messageText;
        this.hasQuote = (charSequence4 instanceof Spanned) && ((gi0[]) ((Spanned) charSequence4).getSpans(0, charSequence4.length(), gi0.class)).length > 0;
        this.hasSingleQuote = false;
        this.hasSingleCode = false;
        CharSequence a2 = v00.a(this.messageText, true);
        this.messageText = a2;
        if (a2 instanceof Spanned) {
            Spanned spanned = (Spanned) a2;
            hi0[] hi0VarArr = (hi0[]) spanned.getSpans(0, spanned.length(), hi0.class);
            for (hi0 hi0Var : hi0VarArr) {
                hi0Var.b = false;
            }
            this.hasSingleQuote = hi0VarArr.length == 1 && spanned.getSpanStart(hi0VarArr[0]) == 0 && spanned.getSpanEnd(hi0VarArr[0]) == spanned.length();
            CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) spanned.getSpans(0, spanned.length(), CodeHighlighting.Span.class);
            this.hasSingleCode = spanArr.length == 1 && spanned.getSpanStart(spanArr[0]) == 0 && spanned.getSpanEnd(spanArr[0]) == spanned.length();
        }
        if (this.isBotPendingDraft) {
            this.messageText = BotForumHelper.applyTypingAnimationSpan(this.messageText);
        }
        int maxMessageTextWidth2 = getMaxMessageTextWidth();
        try {
            if (!this.hasSingleQuote) {
                if (this.hasSingleCode) {
                    dp = AndroidUtilities.dp(15.0f);
                }
                int i22 = maxMessageTextWidth2;
                TextPaint textPaint3 = !(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame) ? org.telegram.ui.ActionBar.g6.x2 : org.telegram.ui.ActionBar.g6.o2;
                CharSequence charSequence5 = this.messageText;
                StaticLayout makeStaticLayout = makeStaticLayout(charSequence5, textPaint3, i22, 1.0f, this.totalAnimatedEmojiCount < 4 ? -1.0f : 0.0f, this.emojiOnlyCount <= 0);
                if (this.isRepostPreview) {
                    int i23 = this.type != 0 ? hasValidGroupId() ? 7 : 12 : 22;
                    if (isWebpage()) {
                        i23 -= 8;
                    }
                    if (makeStaticLayout.getLineCount() > i23) {
                        String string = LocaleController.getString(R.string.ReadMore);
                        f10 = 32.0f;
                        f11 = 15.0f;
                        int ceil3 = (int) Math.ceil(textPaint3.measureText("… " + string) + AndroidUtilities.dp(1.0f));
                        float f16 = 0.0f;
                        for (int i24 = 0; i24 < i23; i24++) {
                            f16 = Math.max(f16, makeStaticLayout.getLineRight(i24));
                        }
                        int i25 = i23 - 1;
                        int lineStart = makeStaticLayout.getLineStart(i25);
                        int lineEnd = makeStaticLayout.getLineEnd(i25) - 1;
                        while (true) {
                            if (lineEnd < lineStart) {
                                f12 = 0.0f;
                                break;
                            }
                            f12 = 0.0f;
                            if (makeStaticLayout.getPrimaryHorizontal(lineEnd) < f16 - ceil3) {
                                break;
                            } else {
                                lineEnd--;
                            }
                        }
                        while (lineEnd >= lineStart && !Character.isWhitespace(charSequence5.charAt(lineEnd))) {
                            lineEnd--;
                        }
                        SpannableStringBuilder append = new SpannableStringBuilder(charSequence5.subSequence(0, lineEnd)).append((CharSequence) "… ").append((CharSequence) string);
                        append.setSpan(new CharacterStyle() { // from class: org.telegram.messenger.MessageObject.2
                            @Override // android.text.style.CharacterStyle
                            public void updateDrawState(TextPaint textPaint4) {
                                textPaint4.setColor(org.telegram.ui.ActionBar.g6.o2.linkColor);
                            }
                        }, append.length() - string.length(), append.length(), 33);
                        try {
                            makeStaticLayout = makeStaticLayout(append, textPaint3, i22, 1.0f, this.totalAnimatedEmojiCount >= 4 ? -1.0f : 0.0f, this.emojiOnlyCount > 0);
                            charSequence = append;
                            if (this.hasSingleQuote) {
                                dp2 = AndroidUtilities.dp(f10);
                            } else {
                                if (!this.hasSingleCode) {
                                    i10 = i22;
                                    int lineCount2 = makeStaticLayout.getLineCount();
                                    int i26 = this.totalAnimatedEmojiCount;
                                    int i27 = i26 < 50 ? 5 : 10;
                                    z10 = Build.VERSION.SDK_INT < 24 && i26 < 50;
                                    int ceil4 = !z10 ? 1 : (int) Math.ceil(lineCount2 / i27);
                                    arrayList = new ArrayList();
                                    if (!(charSequence instanceof Spanned) && (this.hasQuote || this.hasCode)) {
                                        cutIntoRanges(charSequence, arrayList);
                                    } else {
                                        if (!z10 || ceil4 == 1) {
                                            staticLayout = makeStaticLayout;
                                            z15 = false;
                                            arrayList.add(new TextRange(0, staticLayout.getText().length()));
                                            int size = arrayList.size();
                                            this.hasCodeAtTop = z15;
                                            this.hasCodeAtBottom = z15;
                                            this.hasQuoteAtBottom = z15;
                                            this.hasSingleQuote = z15;
                                            this.hasSingleCode = z15;
                                            i13 = 0;
                                            CharSequence charSequence6 = charSequence;
                                            while (i13 < arrayList.size()) {
                                                TextLayoutBlock textLayoutBlock = new TextLayoutBlock();
                                                TextRange textRange = (TextRange) arrayList.get(i13);
                                                textLayoutBlock.code = textRange.code;
                                                textLayoutBlock.quote = textRange.quote;
                                                boolean z18 = textRange.collapse;
                                                textLayoutBlock.quoteCollapse = z18;
                                                if (z18) {
                                                    textLayoutBlock.messageObject = this;
                                                }
                                                textLayoutBlock.index = i13;
                                                textLayoutBlock.start = textRange.start;
                                                textLayoutBlock.first = i13 == 0;
                                                boolean z19 = i13 == arrayList.size() + (-1);
                                                textLayoutBlock.last = z19;
                                                boolean z20 = textLayoutBlock.first;
                                                if (z20) {
                                                    this.hasCodeAtTop = textLayoutBlock.code;
                                                }
                                                if (z19) {
                                                    this.hasQuoteAtBottom = textLayoutBlock.quote;
                                                    this.hasCodeAtBottom = textLayoutBlock.code;
                                                }
                                                this.hasSingleQuote = z20 && z19 && textLayoutBlock.quote;
                                                this.hasSingleCode = z20 && z19 && !textLayoutBlock.quote && textLayoutBlock.code;
                                                if (textLayoutBlock.quote) {
                                                    if (z20 && z19) {
                                                        int dp7 = AndroidUtilities.dp(6.0f);
                                                        textLayoutBlock.padBottom = dp7;
                                                        textLayoutBlock.padTop = dp7;
                                                    } else {
                                                        textLayoutBlock.padTop = AndroidUtilities.dp(z20 ? 8.0f : 6.0f);
                                                        textLayoutBlock.padBottom = AndroidUtilities.dp(7.0f);
                                                    }
                                                } else if (textLayoutBlock.code) {
                                                    textLayoutBlock.layoutCode(textRange.language, textRange.end - textRange.start, z17);
                                                    textLayoutBlock.padTop = AndroidUtilities.dp(4.0f) + textLayoutBlock.languageHeight + (textLayoutBlock.first ? 0 : AndroidUtilities.dp(5.0f));
                                                    textLayoutBlock.padBottom = AndroidUtilities.dp(4.0f) + (textLayoutBlock.last ? 0 : AndroidUtilities.dp(7.0f)) + (textLayoutBlock.hasCodeCopyButton ? AndroidUtilities.dp(38.0f) : 0);
                                                }
                                                if (textLayoutBlock.code) {
                                                    int i28 = textRange.end - textRange.start;
                                                    textPaint = i28 > 220 ? org.telegram.ui.ActionBar.g6.r2 : i28 > 80 ? org.telegram.ui.ActionBar.g6.q2 : org.telegram.ui.ActionBar.g6.p2;
                                                } else {
                                                    textPaint = textPaint3;
                                                }
                                                CharSequence subSequence = charSequence6.subSequence(textRange.start, textRange.end);
                                                if (textLayoutBlock.quote) {
                                                    dp3 = AndroidUtilities.dp(24.0f);
                                                } else if (textLayoutBlock.code) {
                                                    dp3 = AndroidUtilities.dp(f11);
                                                } else {
                                                    i14 = i10;
                                                    if (size != 1) {
                                                        if (textLayoutBlock.code && !textLayoutBlock.quote && (staticLayout.getText() instanceof Spannable)) {
                                                            SpannableString highlighted = !TextUtils.isEmpty(textRange.language) ? CodeHighlighting.getHighlighted(subSequence.toString(), textRange.language) : new SpannableString(subSequence.toString());
                                                            textLayoutBlock.originalWidth = i14;
                                                            staticLayout = makeStaticLayout(highlighted, textPaint, i14, 1.0f, this.totalAnimatedEmojiCount >= 4 ? -1.0f : 0.0f, this.emojiOnlyCount > 0);
                                                            i22 = i14;
                                                        } else {
                                                            textLayoutBlock.originalWidth = i22;
                                                        }
                                                        StaticLayout staticLayout2 = staticLayout;
                                                        textLayoutBlock.textLayout = staticLayout2;
                                                        textLayoutBlock.charactersOffset = 0;
                                                        textLayoutBlock.charactersEnd = staticLayout2.getText().length();
                                                        textLayoutBlock.height = staticLayout2.getHeight();
                                                        textLayoutBlock.collapsedHeight = (int) Math.min(textPaint3.getTextSize() * 1.4f * 3.0f, textLayoutBlock.height);
                                                        int i29 = this.emojiOnlyCount;
                                                        if (i29 != 0) {
                                                            if (i29 == 1) {
                                                                textLayoutBlock.padTop -= AndroidUtilities.dp(5.3f);
                                                            } else if (i29 == 2) {
                                                                textLayoutBlock.padTop -= AndroidUtilities.dp(4.5f);
                                                            } else if (i29 == 3) {
                                                                textLayoutBlock.padTop -= AndroidUtilities.dp(4.2f);
                                                            }
                                                        }
                                                        staticLayout = staticLayout2;
                                                    } else {
                                                        int i30 = textRange.start;
                                                        int i31 = textRange.end;
                                                        if (i31 < i30) {
                                                            z12 = z17;
                                                            charSequence2 = charSequence6;
                                                            textPaint2 = textPaint3;
                                                            arrayList2 = arrayList;
                                                        } else {
                                                            textLayoutBlock.charactersOffset = i30;
                                                            textLayoutBlock.charactersEnd = i31;
                                                            try {
                                                                SpannableString valueOf = (!textLayoutBlock.code || textLayoutBlock.quote) ? SpannableString.valueOf(subSequence) : CodeHighlighting.getHighlighted(subSequence.toString(), textRange.language);
                                                                textLayoutBlock.originalWidth = i14;
                                                                StaticLayout makeStaticLayout2 = makeStaticLayout(valueOf, textPaint, i14, 1.0f, this.totalAnimatedEmojiCount >= 4 ? -1.0f : 0.0f, false);
                                                                textLayoutBlock.textLayout = makeStaticLayout2;
                                                                textLayoutBlock.height = makeStaticLayout2.getHeight();
                                                                textLayoutBlock.collapsedHeight = (int) Math.min(textPaint3.getTextSize() * 1.4f * 3.0f, textLayoutBlock.height);
                                                            } catch (Exception e9) {
                                                                z12 = z17;
                                                                charSequence2 = charSequence6;
                                                                textPaint2 = textPaint3;
                                                                arrayList2 = arrayList;
                                                                FileLog.e(e9);
                                                            }
                                                        }
                                                        i13++;
                                                        textPaint3 = textPaint2;
                                                        charSequence6 = charSequence2;
                                                        z17 = z12;
                                                        arrayList = arrayList2;
                                                    }
                                                    this.textLayoutBlocks.add(textLayoutBlock);
                                                    lineCount = textLayoutBlock.textLayout.getLineCount();
                                                    lineLeft = textLayoutBlock.textLayout.getLineLeft(lineCount - 1);
                                                    if (i13 == 0 && lineLeft >= f12) {
                                                        this.textXOffset = lineLeft;
                                                    }
                                                    float f17 = lineLeft;
                                                    float f18 = textLayoutBlock.textLayout.getLineWidth(lineCount - 1);
                                                    if (textLayoutBlock.quote) {
                                                        if (textLayoutBlock.code) {
                                                            dp4 = AndroidUtilities.dp(f11);
                                                        }
                                                        ArrayList arrayList3 = arrayList;
                                                        ceil = (int) Math.ceil(f18);
                                                        if (ceil > i10 + 80) {
                                                            ceil = i10;
                                                        }
                                                        i15 = size - 1;
                                                        if (i13 == i15) {
                                                            this.lastLineWidth = ceil;
                                                        }
                                                        float f19 = ceil;
                                                        charSequence2 = charSequence6;
                                                        textPaint2 = textPaint3;
                                                        ceil2 = (int) Math.ceil(Math.max(0.0f, f17) + f19);
                                                        if (textLayoutBlock.quote) {
                                                            textLayoutBlock.maxRight = 0.0f;
                                                            int i32 = 0;
                                                            while (i32 < lineCount) {
                                                                try {
                                                                    i20 = ceil;
                                                                    try {
                                                                        textLayoutBlock.maxRight = Math.max(textLayoutBlock.maxRight, textLayoutBlock.textLayout.getLineRight(i32));
                                                                    } catch (Exception unused) {
                                                                        textLayoutBlock.maxRight = this.textWidth;
                                                                        i32++;
                                                                        ceil = i20;
                                                                    }
                                                                } catch (Exception unused2) {
                                                                    i20 = ceil;
                                                                }
                                                                i32++;
                                                                ceil = i20;
                                                            }
                                                        }
                                                        int i33 = ceil;
                                                        if (lineCount > 1) {
                                                            z12 = z17;
                                                            int i34 = ceil2;
                                                            int i35 = i33;
                                                            int i36 = 0;
                                                            float f20 = 0.0f;
                                                            float f21 = 0.0f;
                                                            boolean z21 = false;
                                                            while (i36 < lineCount) {
                                                                int i37 = lineCount;
                                                                try {
                                                                    f13 = textLayoutBlock.textLayout.getLineWidth(i36);
                                                                } catch (Exception unused3) {
                                                                    f13 = 0.0f;
                                                                }
                                                                if (textLayoutBlock.quote) {
                                                                    dp6 = AndroidUtilities.dp(f10);
                                                                } else {
                                                                    if (textLayoutBlock.code) {
                                                                        dp6 = AndroidUtilities.dp(f11);
                                                                    }
                                                                    float f22 = textLayoutBlock.textLayout.getLineLeft(i36);
                                                                    float f23 = f22;
                                                                    if (f13 <= i10 + 20) {
                                                                        f15 = i10;
                                                                        i18 = i22;
                                                                        f14 = 0.0f;
                                                                    } else {
                                                                        i18 = i22;
                                                                        f14 = f23;
                                                                        f15 = f13;
                                                                    }
                                                                    ArrayList arrayList4 = arrayList3;
                                                                    if (f14 > 0.0f) {
                                                                        z13 = z21;
                                                                        if (textLayoutBlock.textLayout.getParagraphDirection(i36) != -1) {
                                                                            textLayoutBlock.directionFlags = (byte) (textLayoutBlock.directionFlags | 2);
                                                                            i19 = 1;
                                                                            if (!z13 && f14 == 0.0f) {
                                                                                try {
                                                                                } catch (Exception unused4) {
                                                                                    z21 = true;
                                                                                }
                                                                                if (textLayoutBlock.textLayout.getParagraphDirection(i36) == i19) {
                                                                                    z14 = true;
                                                                                    z21 = z14;
                                                                                    float max = Math.max(f21, f15);
                                                                                    float f24 = f14 + f15;
                                                                                    f20 = Math.max(f20, f24);
                                                                                    i35 = Math.max(i35, (int) Math.ceil(f15));
                                                                                    i34 = Math.max(i34, (int) Math.ceil(f24));
                                                                                    i36++;
                                                                                    f21 = max;
                                                                                    lineCount = i37;
                                                                                    i22 = i18;
                                                                                    arrayList3 = arrayList4;
                                                                                }
                                                                            }
                                                                            z14 = z13;
                                                                            z21 = z14;
                                                                            float max2 = Math.max(f21, f15);
                                                                            float f242 = f14 + f15;
                                                                            f20 = Math.max(f20, f242);
                                                                            i35 = Math.max(i35, (int) Math.ceil(f15));
                                                                            i34 = Math.max(i34, (int) Math.ceil(f242));
                                                                            i36++;
                                                                            f21 = max2;
                                                                            lineCount = i37;
                                                                            i22 = i18;
                                                                            arrayList3 = arrayList4;
                                                                        }
                                                                    } else {
                                                                        z13 = z21;
                                                                    }
                                                                    this.textXOffset = Math.min(this.textXOffset, f14);
                                                                    i19 = 1;
                                                                    textLayoutBlock.directionFlags = (byte) (textLayoutBlock.directionFlags | 1);
                                                                    this.hasRtl = true;
                                                                    if (!z13) {
                                                                        if (textLayoutBlock.textLayout.getParagraphDirection(i36) == i19) {
                                                                        }
                                                                    }
                                                                    z14 = z13;
                                                                    z21 = z14;
                                                                    float max22 = Math.max(f21, f15);
                                                                    float f2422 = f14 + f15;
                                                                    f20 = Math.max(f20, f2422);
                                                                    i35 = Math.max(i35, (int) Math.ceil(f15));
                                                                    i34 = Math.max(i34, (int) Math.ceil(f2422));
                                                                    i36++;
                                                                    f21 = max22;
                                                                    lineCount = i37;
                                                                    i22 = i18;
                                                                    arrayList3 = arrayList4;
                                                                }
                                                                f13 += dp6;
                                                                float f222 = textLayoutBlock.textLayout.getLineLeft(i36);
                                                                float f232 = f222;
                                                                if (f13 <= i10 + 20) {
                                                                }
                                                                ArrayList arrayList42 = arrayList3;
                                                                if (f14 > 0.0f) {
                                                                }
                                                                this.textXOffset = Math.min(this.textXOffset, f14);
                                                                i19 = 1;
                                                                textLayoutBlock.directionFlags = (byte) (textLayoutBlock.directionFlags | 1);
                                                                this.hasRtl = true;
                                                                if (!z13) {
                                                                }
                                                                z14 = z13;
                                                                z21 = z14;
                                                                float max222 = Math.max(f21, f15);
                                                                float f24222 = f14 + f15;
                                                                f20 = Math.max(f20, f24222);
                                                                i35 = Math.max(i35, (int) Math.ceil(f15));
                                                                i34 = Math.max(i34, (int) Math.ceil(f24222));
                                                                i36++;
                                                                f21 = max222;
                                                                lineCount = i37;
                                                                i22 = i18;
                                                                arrayList3 = arrayList42;
                                                            }
                                                            i16 = i22;
                                                            arrayList2 = arrayList3;
                                                            if (!z21) {
                                                                if (i13 == i15) {
                                                                    this.lastLineWidth = i35;
                                                                }
                                                                f20 = f21;
                                                            } else if (i13 == i15) {
                                                                this.lastLineWidth = ceil2;
                                                            }
                                                            this.textWidth = Math.max(this.textWidth, (int) Math.ceil(f20));
                                                            ceil2 = i34;
                                                            f12 = 0.0f;
                                                        } else {
                                                            z12 = z17;
                                                            i16 = i22;
                                                            arrayList2 = arrayList3;
                                                            f12 = 0.0f;
                                                            if (f17 > 0.0f) {
                                                                float min = Math.min(this.textXOffset, f17);
                                                                this.textXOffset = min;
                                                                i17 = min == 0.0f ? (int) (f19 + f17) : i33;
                                                                this.hasRtl = size != 1;
                                                                textLayoutBlock.directionFlags = (byte) (textLayoutBlock.directionFlags | 1);
                                                            } else {
                                                                textLayoutBlock.directionFlags = (byte) (textLayoutBlock.directionFlags | 2);
                                                                i17 = i33;
                                                            }
                                                            this.textWidth = Math.max(this.textWidth, Math.min(i10, i17));
                                                        }
                                                        pz0Var = textLayoutBlock.languageLayout;
                                                        if (pz0Var != null) {
                                                            this.textWidth = (int) Math.max(this.textWidth, Math.min(pz0Var.c + AndroidUtilities.dp(f11), textLayoutBlock.textLayout == null ? 0.0f : r6.getWidth()));
                                                        }
                                                        textLayoutBlock.spoilers.clear();
                                                        if (!this.isSpoilersRevealed && !this.spoiledLoginCode) {
                                                            if (textLayoutBlock.quote) {
                                                                if (textLayoutBlock.code) {
                                                                    dp5 = AndroidUtilities.dp(f11);
                                                                }
                                                                eh.k.b(null, textLayoutBlock.textLayout, -1, ceil2, null, textLayoutBlock.spoilers);
                                                            } else {
                                                                dp5 = AndroidUtilities.dp(f10);
                                                            }
                                                            ceil2 -= dp5;
                                                            eh.k.b(null, textLayoutBlock.textLayout, -1, ceil2, null, textLayoutBlock.spoilers);
                                                        }
                                                        i22 = i16;
                                                        i13++;
                                                        textPaint3 = textPaint2;
                                                        charSequence6 = charSequence2;
                                                        z17 = z12;
                                                        arrayList = arrayList2;
                                                    } else {
                                                        dp4 = AndroidUtilities.dp(f10);
                                                    }
                                                    f18 += dp4;
                                                    ArrayList arrayList32 = arrayList;
                                                    ceil = (int) Math.ceil(f18);
                                                    if (ceil > i10 + 80) {
                                                    }
                                                    i15 = size - 1;
                                                    if (i13 == i15) {
                                                    }
                                                    float f192 = ceil;
                                                    charSequence2 = charSequence6;
                                                    textPaint2 = textPaint3;
                                                    ceil2 = (int) Math.ceil(Math.max(0.0f, f17) + f192);
                                                    if (textLayoutBlock.quote) {
                                                    }
                                                    int i332 = ceil;
                                                    if (lineCount > 1) {
                                                    }
                                                    pz0Var = textLayoutBlock.languageLayout;
                                                    if (pz0Var != null) {
                                                    }
                                                    textLayoutBlock.spoilers.clear();
                                                    if (!this.isSpoilersRevealed) {
                                                        if (textLayoutBlock.quote) {
                                                        }
                                                        ceil2 -= dp5;
                                                        eh.k.b(null, textLayoutBlock.textLayout, -1, ceil2, null, textLayoutBlock.spoilers);
                                                    }
                                                    i22 = i16;
                                                    i13++;
                                                    textPaint3 = textPaint2;
                                                    charSequence6 = charSequence2;
                                                    z17 = z12;
                                                    arrayList = arrayList2;
                                                }
                                                i14 = i10 - dp3;
                                                if (size != 1) {
                                                }
                                                this.textLayoutBlocks.add(textLayoutBlock);
                                                lineCount = textLayoutBlock.textLayout.getLineCount();
                                                lineLeft = textLayoutBlock.textLayout.getLineLeft(lineCount - 1);
                                                if (i13 == 0) {
                                                    this.textXOffset = lineLeft;
                                                }
                                                float f172 = lineLeft;
                                                float f182 = textLayoutBlock.textLayout.getLineWidth(lineCount - 1);
                                                if (textLayoutBlock.quote) {
                                                }
                                                f182 += dp4;
                                                ArrayList arrayList322 = arrayList;
                                                ceil = (int) Math.ceil(f182);
                                                if (ceil > i10 + 80) {
                                                }
                                                i15 = size - 1;
                                                if (i13 == i15) {
                                                }
                                                float f1922 = ceil;
                                                charSequence2 = charSequence6;
                                                textPaint2 = textPaint3;
                                                ceil2 = (int) Math.ceil(Math.max(0.0f, f172) + f1922);
                                                if (textLayoutBlock.quote) {
                                                }
                                                int i3322 = ceil;
                                                if (lineCount > 1) {
                                                }
                                                pz0Var = textLayoutBlock.languageLayout;
                                                if (pz0Var != null) {
                                                }
                                                textLayoutBlock.spoilers.clear();
                                                if (!this.isSpoilersRevealed) {
                                                }
                                                i22 = i16;
                                                i13++;
                                                textPaint3 = textPaint2;
                                                charSequence6 = charSequence2;
                                                z17 = z12;
                                                arrayList = arrayList2;
                                            }
                                            if (this.hasCode) {
                                                if (this.textWidth > this.generatedWithMinSize - AndroidUtilities.dp(80 + ((!needDrawAvatarInternal() || isOutOwner() || this.messageOwner.isThreadMessage) ? 0 : 52))) {
                                                    z11 = true;
                                                    this.hasWideCode = z11;
                                                    this.factCheckText = null;
                                                    return;
                                                }
                                            }
                                            z11 = false;
                                            this.hasWideCode = z11;
                                            this.factCheckText = null;
                                            return;
                                        }
                                        int i38 = 0;
                                        int i39 = 0;
                                        while (i38 < ceil4) {
                                            int min2 = z10 ? lineCount2 : Math.min(i27, lineCount2 - i39);
                                            int lineStart2 = makeStaticLayout.getLineStart(i39);
                                            int i40 = min2 + i39;
                                            int i41 = lineCount2;
                                            int lineEnd2 = makeStaticLayout.getLineEnd(i40 - 1);
                                            StaticLayout staticLayout3 = makeStaticLayout;
                                            int i42 = lineEnd2 - 1;
                                            if (i42 >= 0) {
                                                i11 = lineEnd2;
                                                if (i42 < staticLayout3.getText().length()) {
                                                    if (staticLayout3.getText().charAt(i42) == '\n') {
                                                        i12 = i11 - 1;
                                                        if (i12 >= lineStart2) {
                                                            arrayList.add(new TextRange(lineStart2, i12));
                                                            i39 = i40;
                                                        }
                                                        i38++;
                                                        lineCount2 = i41;
                                                        makeStaticLayout = staticLayout3;
                                                        z15 = false;
                                                    }
                                                    i12 = i11;
                                                    if (i12 >= lineStart2) {
                                                    }
                                                    i38++;
                                                    lineCount2 = i41;
                                                    makeStaticLayout = staticLayout3;
                                                    z15 = false;
                                                }
                                            } else {
                                                i11 = lineEnd2;
                                            }
                                            i12 = i11;
                                            if (i12 >= lineStart2) {
                                            }
                                            i38++;
                                            lineCount2 = i41;
                                            makeStaticLayout = staticLayout3;
                                            z15 = false;
                                        }
                                    }
                                    staticLayout = makeStaticLayout;
                                    int size2 = arrayList.size();
                                    this.hasCodeAtTop = z15;
                                    this.hasCodeAtBottom = z15;
                                    this.hasQuoteAtBottom = z15;
                                    this.hasSingleQuote = z15;
                                    this.hasSingleCode = z15;
                                    i13 = 0;
                                    CharSequence charSequence62 = charSequence;
                                    while (i13 < arrayList.size()) {
                                    }
                                    if (this.hasCode) {
                                    }
                                    z11 = false;
                                    this.hasWideCode = z11;
                                    this.factCheckText = null;
                                    return;
                                }
                                dp2 = AndroidUtilities.dp(f11);
                            }
                            i10 = dp2 + i22;
                            int lineCount22 = makeStaticLayout.getLineCount();
                            int i262 = this.totalAnimatedEmojiCount;
                            if (i262 < 50) {
                            }
                            if (Build.VERSION.SDK_INT < 24) {
                            }
                            if (!z10) {
                            }
                            arrayList = new ArrayList();
                            if (!(charSequence instanceof Spanned)) {
                            }
                            if (z10) {
                            }
                            staticLayout = makeStaticLayout;
                            z15 = false;
                            arrayList.add(new TextRange(0, staticLayout.getText().length()));
                            int size22 = arrayList.size();
                            this.hasCodeAtTop = z15;
                            this.hasCodeAtBottom = z15;
                            this.hasQuoteAtBottom = z15;
                            this.hasSingleQuote = z15;
                            this.hasSingleCode = z15;
                            i13 = 0;
                            CharSequence charSequence622 = charSequence;
                            while (i13 < arrayList.size()) {
                            }
                            if (this.hasCode) {
                            }
                            z11 = false;
                            this.hasWideCode = z11;
                            this.factCheckText = null;
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    }
                }
                f10 = 32.0f;
                f11 = 15.0f;
                f12 = 0.0f;
                charSequence = charSequence5;
                if (this.hasSingleQuote) {
                }
                i10 = dp2 + i22;
                int lineCount222 = makeStaticLayout.getLineCount();
                int i2622 = this.totalAnimatedEmojiCount;
                if (i2622 < 50) {
                }
                if (Build.VERSION.SDK_INT < 24) {
                }
                if (!z10) {
                }
                arrayList = new ArrayList();
                if (!(charSequence instanceof Spanned)) {
                }
                if (z10) {
                }
                staticLayout = makeStaticLayout;
                z15 = false;
                arrayList.add(new TextRange(0, staticLayout.getText().length()));
                int size222 = arrayList.size();
                this.hasCodeAtTop = z15;
                this.hasCodeAtBottom = z15;
                this.hasQuoteAtBottom = z15;
                this.hasSingleQuote = z15;
                this.hasSingleCode = z15;
                i13 = 0;
                CharSequence charSequence6222 = charSequence;
                while (i13 < arrayList.size()) {
                }
                if (this.hasCode) {
                }
                z11 = false;
                this.hasWideCode = z11;
                this.factCheckText = null;
                return;
            }
            dp = AndroidUtilities.dp(32.0f);
            StaticLayout makeStaticLayout3 = makeStaticLayout(charSequence5, textPaint3, i22, 1.0f, this.totalAnimatedEmojiCount < 4 ? -1.0f : 0.0f, this.emojiOnlyCount <= 0);
            if (this.isRepostPreview) {
            }
            f10 = 32.0f;
            f11 = 15.0f;
            f12 = 0.0f;
            charSequence = charSequence5;
            if (this.hasSingleQuote) {
            }
            i10 = dp2 + i22;
            int lineCount2222 = makeStaticLayout3.getLineCount();
            int i26222 = this.totalAnimatedEmojiCount;
            if (i26222 < 50) {
            }
            if (Build.VERSION.SDK_INT < 24) {
            }
            if (!z10) {
            }
            arrayList = new ArrayList();
            if (!(charSequence instanceof Spanned)) {
            }
            if (z10) {
            }
            staticLayout = makeStaticLayout3;
            z15 = false;
            arrayList.add(new TextRange(0, staticLayout.getText().length()));
            int size2222 = arrayList.size();
            this.hasCodeAtTop = z15;
            this.hasCodeAtBottom = z15;
            this.hasQuoteAtBottom = z15;
            this.hasSingleQuote = z15;
            this.hasSingleCode = z15;
            i13 = 0;
            CharSequence charSequence62222 = charSequence;
            while (i13 < arrayList.size()) {
            }
            if (this.hasCode) {
            }
            z11 = false;
            this.hasWideCode = z11;
            this.factCheckText = null;
            return;
        } catch (Exception e11) {
            FileLog.e(e11);
            return;
        }
        maxMessageTextWidth2 -= dp;
        int i222 = maxMessageTextWidth2;
        TextPaint textPaint32 = !(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame) ? org.telegram.ui.ActionBar.g6.x2 : org.telegram.ui.ActionBar.g6.o2;
        CharSequence charSequence52 = this.messageText;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void generateLinkDescription() {
        boolean z10;
        int i10;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TL_stories.StoryItem storyItem;
        if (this.linkDescription != null) {
            return;
        }
        TLRPC.WebPage webPage = this.storyMentionWebpage;
        if (webPage == null) {
            webPage = getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage ? ((TLRPC.TL_messageMediaWebPage) getMedia(this.messageOwner)).webpage : null;
        }
        if (webPage != null) {
            for (int i11 = 0; i11 < webPage.attributes.size(); i11++) {
                TLRPC.WebPageAttribute webPageAttribute = webPage.attributes.get(i11);
                if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem) != null && storyItem.caption != null) {
                    this.linkDescription = new SpannableStringBuilder(tL_webPageAttributeStory.storyItem.caption);
                    this.webPageDescriptionEntities = tL_webPageAttributeStory.storyItem.entities;
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (this.linkDescription == null) {
            if ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && (getMedia(this.messageOwner).webpage instanceof TLRPC.TL_webPage) && getMedia(this.messageOwner).webpage.description != null) {
                this.linkDescription = Spannable.Factory.getInstance().newSpannable(getMedia(this.messageOwner).webpage.description);
                String str = getMedia(this.messageOwner).webpage.site_name;
                if (str != null) {
                    str = str.toLowerCase();
                }
                i10 = "instagram".equals(str) ? 1 : "twitter".equals(str) ? 2 : 0;
                if (TextUtils.isEmpty(this.linkDescription)) {
                    if (containsUrls(this.linkDescription)) {
                        try {
                            AndroidUtilities.addLinksSafe((Spannable) this.linkDescription, 1, false, true);
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                    }
                    CharSequence replaceEmoji = Emoji.replaceEmoji(this.linkDescription, org.telegram.ui.ActionBar.g6.o2.getFontMetricsInt(), false);
                    this.linkDescription = replaceEmoji;
                    ArrayList<TLRPC.MessageEntity> arrayList = this.webPageDescriptionEntities;
                    if (arrayList != null) {
                        addEntitiesToText(replaceEmoji, arrayList, isOut(), z10, false, !z10);
                        replaceAnimatedEmoji(this.linkDescription, this.webPageDescriptionEntities, org.telegram.ui.ActionBar.g6.o2.getFontMetricsInt());
                    }
                    if (i10 != 0) {
                        if (!(this.linkDescription instanceof Spannable)) {
                            this.linkDescription = new SpannableStringBuilder(this.linkDescription);
                        }
                        addUrlsByPattern(isOutOwner(), this.linkDescription, false, i10, 0, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame) && getMedia(this.messageOwner).game.description != null) {
                this.linkDescription = Spannable.Factory.getInstance().newSpannable(getMedia(this.messageOwner).game.description);
            } else if ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaInvoice) && getMedia(this.messageOwner).description != null) {
                this.linkDescription = Spannable.Factory.getInstance().newSpannable(getMedia(this.messageOwner).description);
            }
        }
        i10 = 0;
        if (TextUtils.isEmpty(this.linkDescription)) {
        }
    }

    public void generatePaymentSentMessageText(TLRPC.User user, boolean z10) {
        String str;
        if (user == null) {
            user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(getDialogId()));
        }
        String firstName = user != null ? UserObject.getFirstName(user) : "";
        try {
            if ("XTR".equals(this.messageOwner.action.currency)) {
                str = "XTR " + this.messageOwner.action.total_amount;
            } else {
                LocaleController localeController = LocaleController.getInstance();
                TLRPC.MessageAction messageAction = this.messageOwner.action;
                str = localeController.formatCurrencyString(messageAction.total_amount, messageAction.currency);
            }
        } catch (Exception e9) {
            FileLog.e(e9);
            str = "<error>";
        }
        MessageObject messageObject = this.replyMessageObject;
        if (messageObject == null || !(getMedia(messageObject) instanceof TLRPC.TL_messageMediaInvoice)) {
            TLRPC.MessageAction messageAction2 = this.messageOwner.action;
            int i10 = messageAction2.subscription_until_date;
            if (i10 != 0) {
                if (z10) {
                    this.messageText = LocaleController.formatString(R.string.PaymentSuccessfullyPaidMeNoItemSubscription, firstName, str, LocaleController.formatDateTime(i10, false));
                } else {
                    this.messageText = LocaleController.formatString(R.string.PaymentSuccessfullyPaidSubscriptionNoItem, str, firstName, LocaleController.formatDateTime(i10, false));
                }
            } else if (!messageAction2.recurring_init || z10) {
                this.messageText = LocaleController.formatString(R.string.PaymentSuccessfullyPaidNoItem, str, firstName);
            } else {
                this.messageText = LocaleController.formatString(R.string.PaymentSuccessfullyPaidNoItemRecurrent, str, firstName);
            }
        } else {
            TLRPC.MessageAction messageAction3 = this.messageOwner.action;
            if (messageAction3.subscription_until_date != 0) {
                if (z10) {
                    this.messageText = LocaleController.formatString(R.string.PaymentSuccessfullyPaidMeSubscription, firstName, str, getMedia(this.replyMessageObject).title, LocaleController.formatDateTime(this.messageOwner.action.subscription_until_date, false));
                } else {
                    this.messageText = LocaleController.formatString(R.string.PaymentSuccessfullyPaidSubscription, str, firstName, getMedia(this.replyMessageObject).title, LocaleController.formatDateTime(this.messageOwner.action.subscription_until_date, false));
                }
            } else if (!messageAction3.recurring_init || z10) {
                this.messageText = LocaleController.formatString(R.string.PaymentSuccessfullyPaid, str, firstName, getMedia(this.replyMessageObject).title);
            } else {
                this.messageText = LocaleController.formatString(R.string.PaymentSuccessfullyPaidRecurrent, str, firstName, getMedia(this.replyMessageObject).title);
            }
        }
        this.messageText = hh.oa.Q0(this.messageText);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r9v1, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r9v10, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r9v7, types: [org.telegram.tgnet.TLRPC$Chat] */
    public void generatePinMessageText(TLRPC.User user, TLRPC.Chat chat) {
        boolean z10;
        if (user == null && chat == 0) {
            if (isFromUser()) {
                user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.from_id.user_id));
            }
            if (user == null) {
                TLRPC.Peer peer = this.messageOwner.peer_id;
                if (peer instanceof TLRPC.TL_peerChannel) {
                    chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.peer_id.channel_id));
                } else if (peer instanceof TLRPC.TL_peerChat) {
                    chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.peer_id.chat_id));
                }
            }
        }
        MessageObject messageObject = this.replyMessageObject;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (!(message instanceof TLRPC.TL_messageEmpty) && !(message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                if (messageObject.isMusic()) {
                    String string = LocaleController.getString(R.string.ActionPinnedMusic);
                    if (user == null) {
                        user = chat;
                    }
                    this.messageText = replaceWithLink(string, "un1", user);
                    return;
                }
                if (this.replyMessageObject.isVideo()) {
                    String string2 = LocaleController.getString(R.string.ActionPinnedVideo);
                    if (user == null) {
                        user = chat;
                    }
                    this.messageText = replaceWithLink(string2, "un1", user);
                    return;
                }
                if (this.replyMessageObject.isGif()) {
                    String string3 = LocaleController.getString(R.string.ActionPinnedGif);
                    if (user == null) {
                        user = chat;
                    }
                    this.messageText = replaceWithLink(string3, "un1", user);
                    return;
                }
                if (this.replyMessageObject.isVoice()) {
                    String string4 = LocaleController.getString(R.string.ActionPinnedVoice);
                    if (user == null) {
                        user = chat;
                    }
                    this.messageText = replaceWithLink(string4, "un1", user);
                    return;
                }
                if (this.replyMessageObject.isRoundVideo()) {
                    String string5 = LocaleController.getString(R.string.ActionPinnedRound);
                    if (user == null) {
                        user = chat;
                    }
                    this.messageText = replaceWithLink(string5, "un1", user);
                    return;
                }
                if ((this.replyMessageObject.isSticker() || this.replyMessageObject.isAnimatedSticker()) && !this.replyMessageObject.isAnimatedEmoji()) {
                    String string6 = LocaleController.getString(R.string.ActionPinnedSticker);
                    if (user == null) {
                        user = chat;
                    }
                    this.messageText = replaceWithLink(string6, "un1", user);
                    return;
                }
                if (getMedia(this.replyMessageObject) instanceof TLRPC.TL_messageMediaDocument) {
                    String string7 = LocaleController.getString(R.string.ActionPinnedFile);
                    if (user == null) {
                        user = chat;
                    }
                    this.messageText = replaceWithLink(string7, "un1", user);
                    return;
                }
                if (getMedia(this.replyMessageObject) instanceof TLRPC.TL_messageMediaGeo) {
                    String string8 = LocaleController.getString(R.string.ActionPinnedGeo);
                    if (user == null) {
                        user = chat;
                    }
                    this.messageText = replaceWithLink(string8, "un1", user);
                    return;
                }
                if (getMedia(this.replyMessageObject) instanceof TLRPC.TL_messageMediaGeoLive) {
                    String string9 = LocaleController.getString(R.string.ActionPinnedGeoLive);
                    if (user == null) {
                        user = chat;
                    }
                    this.messageText = replaceWithLink(string9, "un1", user);
                    return;
                }
                if (getMedia(this.replyMessageObject) instanceof TLRPC.TL_messageMediaContact) {
                    String string10 = LocaleController.getString(R.string.ActionPinnedContact);
                    if (user == null) {
                        user = chat;
                    }
                    this.messageText = replaceWithLink(string10, "un1", user);
                    return;
                }
                if (getMedia(this.replyMessageObject) instanceof TLRPC.TL_messageMediaPoll) {
                    if (((TLRPC.TL_messageMediaPoll) getMedia(this.replyMessageObject)).poll.quiz) {
                        String string11 = LocaleController.getString(R.string.ActionPinnedQuiz);
                        if (user == null) {
                            user = chat;
                        }
                        this.messageText = replaceWithLink(string11, "un1", user);
                        return;
                    }
                    String string12 = LocaleController.getString(R.string.ActionPinnedPoll);
                    if (user == null) {
                        user = chat;
                    }
                    this.messageText = replaceWithLink(string12, "un1", user);
                    return;
                }
                if (getMedia(this.replyMessageObject) instanceof TLRPC.TL_messageMediaPhoto) {
                    String string13 = LocaleController.getString(R.string.ActionPinnedPhoto);
                    if (user == null) {
                        user = chat;
                    }
                    this.messageText = replaceWithLink(string13, "un1", user);
                    return;
                }
                if (getMedia(this.replyMessageObject) instanceof TLRPC.TL_messageMediaPaidMedia) {
                    this.messageText = LocaleController.formatPluralString("NotificationPinnedPaidMedia", (int) ((TLRPC.TL_messageMediaPaidMedia) getMedia(this.replyMessageObject)).stars_amount, chat != 0 ? chat.title : UserObject.getUserName(user));
                    return;
                }
                if (getMedia(this.replyMessageObject) instanceof TLRPC.TL_messageMediaGame) {
                    String formatString = LocaleController.formatString("ActionPinnedGame", R.string.ActionPinnedGame, "🎮 " + getMedia(this.replyMessageObject).game.title);
                    if (user == null) {
                        user = chat;
                    }
                    CharSequence replaceWithLink = replaceWithLink(formatString, "un1", user);
                    this.messageText = replaceWithLink;
                    this.messageText = Emoji.replaceEmoji(replaceWithLink, org.telegram.ui.ActionBar.g6.o2.getFontMetricsInt(), false);
                    return;
                }
                CharSequence charSequence = this.replyMessageObject.messageText;
                if (charSequence == null || charSequence.length() <= 0) {
                    String string14 = LocaleController.getString(R.string.ActionPinnedNoText);
                    if (user == null) {
                        user = chat;
                    }
                    this.messageText = replaceWithLink(string14, "un1", user);
                    return;
                }
                CharSequence cloneSpans = org.telegram.ui.Components.t5.cloneSpans(this.replyMessageObject.messageText);
                if (cloneSpans.length() > 20) {
                    cloneSpans = cloneSpans.subSequence(0, 20);
                    z10 = true;
                } else {
                    z10 = false;
                }
                CharSequence replaceEmoji = Emoji.replaceEmoji(cloneSpans, org.telegram.ui.ActionBar.g6.o2.getFontMetricsInt(), true);
                MessageObject messageObject2 = this.replyMessageObject;
                if (messageObject2 != null && messageObject2.messageOwner != null) {
                    replaceEmoji = messageObject2.replaceAnimatedEmoji(replaceEmoji, org.telegram.ui.ActionBar.g6.o2.getFontMetricsInt());
                }
                MediaDataController.addTextStyleRuns(this.replyMessageObject, (Spannable) replaceEmoji);
                if (z10) {
                    if (replaceEmoji instanceof SpannableStringBuilder) {
                        ((SpannableStringBuilder) replaceEmoji).append((CharSequence) "...");
                    } else if (replaceEmoji != null) {
                        replaceEmoji = new SpannableStringBuilder(replaceEmoji).append((CharSequence) "...");
                    }
                }
                SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.ActionPinnedText), replaceEmoji);
                if (user == null) {
                    user = chat;
                }
                this.messageText = replaceWithLink(formatSpannable, "un1", user);
                return;
            }
        }
        String string15 = LocaleController.getString(R.string.ActionPinnedNoText);
        if (user == null) {
            user = chat;
        }
        this.messageText = replaceWithLink(string15, "un1", user);
    }

    public void generateThumbs(boolean z10) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        ArrayList<TLRPC.PhotoSize> arrayList3;
        TL_iv.RichMessage richMessage;
        ArrayList<TLRPC.PhotoSize> arrayList4;
        ArrayList<TLRPC.PhotoSize> arrayList5;
        ArrayList<TLRPC.PhotoSize> arrayList6;
        ArrayList<TLRPC.PhotoSize> arrayList7;
        ArrayList<TLRPC.PhotoSize> arrayList8;
        ArrayList<TLRPC.PhotoSize> arrayList9;
        ArrayList<TLRPC.PhotoSize> arrayList10;
        ArrayList<TLRPC.PhotoSize> arrayList11;
        if (hasExtendedMediaPreview()) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) this.messageOwner.media.extended_media.get(0);
            if (z10) {
                updatePhotoSizeLocations(this.photoThumbs, Collections.singletonList(tL_messageExtendedMediaPreview.thumb));
            } else {
                this.photoThumbs = new ArrayList<>(Collections.singletonList(tL_messageExtendedMediaPreview.thumb));
            }
            this.photoThumbsObject = this.messageOwner;
            if (this.strippedThumb == null) {
                createStrippedThumb();
                return;
            }
            return;
        }
        TLRPC.Message message = this.messageOwner;
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) {
                TLRPC.Photo photo = messageAction.photo;
                if (z10) {
                    ArrayList<TLRPC.PhotoSize> arrayList12 = this.photoThumbs;
                    if (arrayList12 != null && !arrayList12.isEmpty()) {
                        for (int i10 = 0; i10 < this.photoThumbs.size(); i10++) {
                            TLRPC.PhotoSize photoSize = this.photoThumbs.get(i10);
                            int i11 = 0;
                            while (true) {
                                if (i11 < photo.sizes.size()) {
                                    TLRPC.PhotoSize photoSize2 = photo.sizes.get(i11);
                                    if (!(photoSize2 instanceof TLRPC.TL_photoSizeEmpty) && photoSize2.type.equals(photoSize.type)) {
                                        photoSize.location = photoSize2.location;
                                        break;
                                    }
                                    i11++;
                                }
                            }
                        }
                    }
                } else {
                    this.photoThumbs = new ArrayList<>(photo.sizes);
                }
                if (photo.dc_id != 0 && (arrayList11 = this.photoThumbs) != null) {
                    int size = arrayList11.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        TLRPC.FileLocation fileLocation = this.photoThumbs.get(i12).location;
                        if (fileLocation != null) {
                            fileLocation.dc_id = photo.dc_id;
                            fileLocation.file_reference = photo.file_reference;
                        }
                    }
                }
                this.photoThumbsObject = this.messageOwner.action.photo;
                return;
            }
            return;
        }
        if (this.emojiAnimatedSticker != null || this.emojiAnimatedStickerId != null) {
            if (TextUtils.isEmpty(this.emojiAnimatedStickerColor) && isDocumentHasThumb(this.emojiAnimatedSticker)) {
                if (!z10 || (arrayList = this.photoThumbs) == null) {
                    ArrayList<TLRPC.PhotoSize> arrayList13 = new ArrayList<>();
                    this.photoThumbs = arrayList13;
                    arrayList13.addAll(this.emojiAnimatedSticker.thumbs);
                } else if (!arrayList.isEmpty()) {
                    updatePhotoSizeLocations(this.photoThumbs, this.emojiAnimatedSticker.thumbs);
                }
                this.photoThumbsObject = this.emojiAnimatedSticker;
                return;
            }
            return;
        }
        if (getMedia(message) == null || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaEmpty)) {
            TLRPC.Message message2 = this.messageOwner;
            if (message2 != null && (richMessage = message2.rich_message) != null) {
                TLRPC.Document findVideo = findVideo(richMessage);
                TLRPC.Photo findPhoto = findPhoto(this.messageOwner.rich_message);
                if (findVideo != null) {
                    if (isDocumentHasThumb(findVideo)) {
                        if (z10) {
                            ArrayList<TLRPC.PhotoSize> arrayList14 = this.photoThumbs;
                            if (arrayList14 != null && !arrayList14.isEmpty()) {
                                updatePhotoSizeLocations(this.photoThumbs, findVideo.thumbs);
                            }
                        } else {
                            ArrayList<TLRPC.PhotoSize> arrayList15 = new ArrayList<>();
                            this.photoThumbs = arrayList15;
                            arrayList15.addAll(findVideo.thumbs);
                        }
                        this.photoThumbsObject = findVideo;
                        return;
                    }
                    return;
                }
                if (findPhoto != null) {
                    if (!z10 || (arrayList4 = this.photoThumbs) == null) {
                        this.photoThumbs = new ArrayList<>(findPhoto.sizes);
                    } else if (!arrayList4.isEmpty()) {
                        updatePhotoSizeLocations(this.photoThumbs, findPhoto.sizes);
                    }
                    this.photoThumbsObject = findPhoto;
                    if (this.strippedThumb == null) {
                        createStrippedThumb();
                        return;
                    }
                    return;
                }
                return;
            }
            TLRPC.MessageMedia messageMedia = this.sponsoredMedia;
            if (messageMedia == null) {
                if (this.sponsoredPhoto != null) {
                    if (!z10 || (arrayList2 = this.photoThumbs) == null) {
                        this.photoThumbs = new ArrayList<>(this.sponsoredPhoto.sizes);
                    } else if (!arrayList2.isEmpty()) {
                        updatePhotoSizeLocations(this.photoThumbs, this.sponsoredPhoto.sizes);
                    }
                    this.photoThumbsObject = this.sponsoredPhoto;
                    if (this.strippedThumb == null) {
                        createStrippedThumb();
                        return;
                    }
                    return;
                }
                return;
            }
            TLRPC.Photo photo2 = messageMedia.photo;
            TLRPC.Document document = messageMedia.document;
            if (photo2 != null) {
                if (!z10 || (arrayList3 = this.photoThumbs) == null) {
                    this.photoThumbs = new ArrayList<>(photo2.sizes);
                } else if (!arrayList3.isEmpty()) {
                    updatePhotoSizeLocations(this.photoThumbs, photo2.sizes);
                }
                this.photoThumbsObject = photo2;
                return;
            }
            if (document == null || !isDocumentHasThumb(document)) {
                return;
            }
            if (z10) {
                ArrayList<TLRPC.PhotoSize> arrayList16 = this.photoThumbs;
                if (arrayList16 != null && !arrayList16.isEmpty()) {
                    updatePhotoSizeLocations(this.photoThumbs, document.thumbs);
                }
            } else {
                ArrayList<TLRPC.PhotoSize> arrayList17 = new ArrayList<>();
                this.photoThumbs = arrayList17;
                arrayList17.addAll(document.thumbs);
            }
            this.photoThumbsObject = document;
            return;
        }
        if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) {
            TLRPC.Photo photo3 = getMedia(this.messageOwner).photo;
            if (z10 && ((arrayList10 = this.photoThumbs) == null || arrayList10.size() == photo3.sizes.size())) {
                ArrayList<TLRPC.PhotoSize> arrayList18 = this.photoThumbs;
                if (arrayList18 != null && !arrayList18.isEmpty()) {
                    for (int i13 = 0; i13 < this.photoThumbs.size(); i13++) {
                        TLRPC.PhotoSize photoSize3 = this.photoThumbs.get(i13);
                        if (photoSize3 != null) {
                            int i14 = 0;
                            while (true) {
                                if (i14 >= photo3.sizes.size()) {
                                    break;
                                }
                                TLRPC.PhotoSize photoSize4 = photo3.sizes.get(i14);
                                if (photoSize4 != null && !(photoSize4 instanceof TLRPC.TL_photoSizeEmpty)) {
                                    if (photoSize4.type.equals(photoSize3.type)) {
                                        photoSize3.location = photoSize4.location;
                                        break;
                                    } else if ("s".equals(photoSize3.type) && (photoSize4 instanceof TLRPC.TL_photoStrippedSize)) {
                                        this.photoThumbs.set(i13, photoSize4);
                                        break;
                                    }
                                }
                                i14++;
                            }
                        }
                    }
                }
            } else {
                this.photoThumbs = new ArrayList<>(photo3.sizes);
            }
            this.photoThumbsObject = getMedia(this.messageOwner).photo;
            return;
        }
        if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Photo photo4 = ((TLRPC.TL_messageMediaDocument) getMedia(this.messageOwner)).video_cover;
            if (photo4 == null) {
                TLRPC.Document document2 = getDocument();
                if (isDocumentHasThumb(document2)) {
                    if (!z10 || (arrayList8 = this.photoThumbs) == null) {
                        ArrayList<TLRPC.PhotoSize> arrayList19 = new ArrayList<>();
                        this.photoThumbs = arrayList19;
                        arrayList19.addAll(document2.thumbs);
                    } else if (!arrayList8.isEmpty()) {
                        updatePhotoSizeLocations(this.photoThumbs, document2.thumbs);
                    }
                    this.photoThumbsObject = document2;
                    return;
                }
                return;
            }
            if (z10 && ((arrayList9 = this.photoThumbs) == null || arrayList9.size() == photo4.sizes.size())) {
                ArrayList<TLRPC.PhotoSize> arrayList20 = this.photoThumbs;
                if (arrayList20 != null && !arrayList20.isEmpty()) {
                    for (int i15 = 0; i15 < this.photoThumbs.size(); i15++) {
                        TLRPC.PhotoSize photoSize5 = this.photoThumbs.get(i15);
                        if (photoSize5 != null) {
                            int i16 = 0;
                            while (true) {
                                if (i16 >= photo4.sizes.size()) {
                                    break;
                                }
                                TLRPC.PhotoSize photoSize6 = photo4.sizes.get(i16);
                                if (photoSize6 != null && !(photoSize6 instanceof TLRPC.TL_photoSizeEmpty)) {
                                    if (photoSize6.type.equals(photoSize5.type)) {
                                        photoSize5.location = photoSize6.location;
                                        break;
                                    } else if ("s".equals(photoSize5.type) && (photoSize6 instanceof TLRPC.TL_photoStrippedSize)) {
                                        this.photoThumbs.set(i15, photoSize6);
                                        break;
                                    }
                                }
                                i16++;
                            }
                        }
                    }
                }
            } else {
                this.photoThumbs = new ArrayList<>(photo4.sizes);
            }
            this.photoThumbsObject = photo4;
            return;
        }
        if (!(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame)) {
            if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) {
                TLRPC.Photo photo5 = getMedia(this.messageOwner).webpage.photo;
                TLRPC.Document document3 = getMedia(this.messageOwner).webpage.document;
                if (photo5 != null) {
                    if (!z10 || (arrayList5 = this.photoThumbs) == null) {
                        this.photoThumbs = new ArrayList<>(photo5.sizes);
                    } else if (!arrayList5.isEmpty()) {
                        updatePhotoSizeLocations(this.photoThumbs, photo5.sizes);
                    }
                    this.photoThumbsObject = photo5;
                    return;
                }
                if (document3 == null || !isDocumentHasThumb(document3)) {
                    return;
                }
                if (z10) {
                    ArrayList<TLRPC.PhotoSize> arrayList21 = this.photoThumbs;
                    if (arrayList21 != null && !arrayList21.isEmpty()) {
                        updatePhotoSizeLocations(this.photoThumbs, document3.thumbs);
                    }
                } else {
                    ArrayList<TLRPC.PhotoSize> arrayList22 = new ArrayList<>();
                    this.photoThumbs = arrayList22;
                    arrayList22.addAll(document3.thumbs);
                }
                this.photoThumbsObject = document3;
                return;
            }
            return;
        }
        TLRPC.Document document4 = getMedia(this.messageOwner).game.document;
        if (document4 != null && isDocumentHasThumb(document4)) {
            if (z10) {
                ArrayList<TLRPC.PhotoSize> arrayList23 = this.photoThumbs;
                if (arrayList23 != null && !arrayList23.isEmpty()) {
                    updatePhotoSizeLocations(this.photoThumbs, document4.thumbs);
                }
            } else {
                ArrayList<TLRPC.PhotoSize> arrayList24 = new ArrayList<>();
                this.photoThumbs = arrayList24;
                arrayList24.addAll(document4.thumbs);
            }
            this.photoThumbsObject = document4;
        }
        TLRPC.Photo photo6 = getMedia(this.messageOwner).game.photo;
        if (photo6 != null) {
            if (!z10 || (arrayList7 = this.photoThumbs2) == null) {
                this.photoThumbs2 = new ArrayList<>(photo6.sizes);
            } else if (!arrayList7.isEmpty()) {
                updatePhotoSizeLocations(this.photoThumbs2, photo6.sizes);
            }
            this.photoThumbsObject2 = photo6;
        }
        if (this.photoThumbs != null || (arrayList6 = this.photoThumbs2) == null) {
            return;
        }
        this.photoThumbs = arrayList6;
        this.photoThumbs2 = null;
        this.photoThumbsObject = this.photoThumbsObject2;
        this.photoThumbsObject2 = null;
    }

    public int getApproximateHeight() {
        return getApproximateHeight(false);
    }

    public int getApproximateHeightCached() {
        Integer num = this.cachedApproximateHeight;
        if (num != null) {
            return num.intValue();
        }
        int approximateHeight = getApproximateHeight(true);
        this.cachedApproximateHeight = Integer.valueOf(approximateHeight);
        return approximateHeight;
    }

    public String getArtworkUrl(boolean z10) {
        return getArtworkUrl(getDocument(), z10);
    }

    public long getChannelId() {
        return getChannelId(this.messageOwner);
    }

    public long getChatId() {
        TLRPC.Peer peer = this.messageOwner.peer_id;
        if (peer instanceof TLRPC.TL_peerChat) {
            return peer.chat_id;
        }
        if (peer instanceof TLRPC.TL_peerChannel) {
            return peer.channel_id;
        }
        return 0L;
    }

    public int getChatMode() {
        if (this.scheduled) {
            return 1;
        }
        if (isWelcomeMessage()) {
            return 9;
        }
        return isQuickReply() ? 5 : 0;
    }

    public ArrayList<ig.q0> getChoosenReactions() {
        ArrayList<ig.q0> arrayList = new ArrayList<>();
        if (this.messageOwner.reactions != null) {
            for (int i10 = 0; i10 < this.messageOwner.reactions.results.size(); i10++) {
                if (this.messageOwner.reactions.results.get(i10).chosen) {
                    arrayList.add(ig.q0.d(this.messageOwner.reactions.results.get(i10).reaction));
                }
            }
        }
        return arrayList;
    }

    public long getDialogId() {
        return getDialogId(this.messageOwner);
    }

    public String getDiceEmoji() {
        if (!isDice()) {
            return null;
        }
        TLRPC.TL_messageMediaDice tL_messageMediaDice = (TLRPC.TL_messageMediaDice) getMedia(this.messageOwner);
        return TextUtils.isEmpty(tL_messageMediaDice.emoticon) ? "🎲" : tL_messageMediaDice.emoticon.replace("️", "");
    }

    public int getDiceValue() {
        if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDice) {
            return ((TLRPC.TL_messageMediaDice) getMedia(this.messageOwner)).value;
        }
        return -1;
    }

    public TL_iv.RichMessage getDisplayRichMessage() {
        TL_iv.RichMessage richMessage;
        TLRPC.Message message = this.messageOwner;
        if (message == null) {
            return null;
        }
        return (!this.translated || (richMessage = message.translatedRichMessage) == null) ? message.rich_message : richMessage;
    }

    public TLRPC.Document getDocument() {
        k61 k61Var;
        TLRPC.Document document = this.emojiAnimatedSticker;
        return document != null ? document : (!hasVideoQualities() || (k61Var = this.highestQuality) == null) ? getDocument(this.messageOwner) : k61Var.g;
    }

    public TLRPC.Document getDocumentFast() {
        TLRPC.Document document = this.emojiAnimatedSticker;
        return document != null ? document : getDocument(this.messageOwner);
    }

    public String getDocumentName() {
        return FileLoader.getDocumentFileName(getDocument());
    }

    public double getDuration() {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        double d = this.attributeDuration;
        if (d > 0.0d) {
            return d;
        }
        TLRPC.Document document = getDocument();
        if (document == null && this.type == 23 && (storyItem = getMedia(this.messageOwner).storyItem) != null && (messageMedia = storyItem.media) != null) {
            document = messageMedia.document;
        }
        if (document == null) {
            return 0.0d;
        }
        int i10 = this.audioPlayerDuration;
        if (i10 > 0) {
            return i10;
        }
        for (int i11 = 0; i11 < document.attributes.size(); i11++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                double d10 = documentAttribute.duration;
                this.attributeDuration = d10;
                return d10;
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                double d11 = documentAttribute.duration;
                this.attributeDuration = d11;
                return d11;
            }
        }
        return this.audioPlayerDuration;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0090, code lost:
    
        if (r2.id != r4.id) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:
    
        r6 = r6 | 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a4, code lost:
    
        r0 = r0.document;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a6, code lost:
    
        if (r0 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a8, code lost:
    
        r2 = r1.document;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00aa, code lost:
    
        if (r2 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b2, code lost:
    
        if (r0.id == r2.id) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        return r6 | 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c6, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b7, code lost:
    
        if (r0 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b9, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00be, code lost:
    
        if (r1.document != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c0, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c1, code lost:
    
        if (r0 == r3) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c5, code lost:
    
        return r6 | 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00bb, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a1, code lost:
    
        if ((r2 == null) != (r1.photo == null)) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getEditedSuggestionFlags() {
        TLRPC.SuggestedPost suggestedPost;
        TLRPC.SuggestedPost suggestedPost2;
        MessageObject messageObject = this.replyMessageObject;
        TLRPC.Message message = messageObject != null ? messageObject.messageOwner : null;
        TLRPC.Message message2 = this.messageOwner;
        if (message == null || (suggestedPost = message.suggested_post) == null || message2 == null || (suggestedPost2 = message2.suggested_post) == null) {
            return 0;
        }
        TL_stars.StarsAmount starsAmount = suggestedPost.price;
        TL_stars.StarsAmount starsAmount2 = suggestedPost2.price;
        hf.a l10 = hf.a.l(starsAmount);
        hf.a l11 = hf.a.l(starsAmount2);
        int i10 = ((l10 != l11 && (l10 == null || l11 == null || l10.a != l11.a || l10.b != l11.b)) ? 0 : 1) ^ 1;
        if (suggestedPost.schedule_date != suggestedPost2.schedule_date) {
            i10 |= 2;
        }
        if (!TextUtils.equals(this.messageText, this.replyMessageObject.messageText)) {
            i10 |= 4;
        }
        if (!TextUtils.equals(this.caption, this.replyMessageObject.caption)) {
            i10 |= 4;
        }
        TLRPC.MessageMedia messageMedia = message.media;
        TLRPC.MessageMedia messageMedia2 = message2.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaEmpty) {
            messageMedia = null;
        }
        TLRPC.MessageMedia messageMedia3 = messageMedia2 instanceof TLRPC.TL_messageMediaEmpty ? null : messageMedia2;
        if (messageMedia == null || messageMedia3 == null) {
            return (messageMedia == null) != (messageMedia3 == null) ? i10 | 8 : i10;
        }
        if (messageMedia.getClass() != messageMedia3.getClass()) {
            return i10 | 8;
        }
        TLRPC.Photo photo = messageMedia.photo;
        if (photo == null || (r4 = messageMedia3.photo) == null) {
        }
    }

    public TLRPC.TL_availableEffect getEffect() {
        TLRPC.Message message = this.messageOwner;
        if (message == null || (message.flags2 & 4) == 0) {
            return null;
        }
        return MessagesController.getInstance(this.currentAccount).getEffect(this.messageOwner.effect);
    }

    public long getEffectId() {
        TLRPC.Message message = this.messageOwner;
        if (message == null || (message.flags2 & 4) == 0) {
            return 0L;
        }
        return message.effect;
    }

    public int getEmojiOnlyCount() {
        return this.emojiOnlyCount;
    }

    public ArrayList<TLRPC.MessageEntity> getEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message = this.messageOwner;
        if (message == null) {
            return null;
        }
        if (this.summarized) {
            if (this.translated && (tL_textWithEntities = message.translatedSummaryText) != null) {
                return tL_textWithEntities.entities;
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = message.summaryText;
            if (tL_textWithEntities2 != null) {
                return tL_textWithEntities2.entities;
            }
            return null;
        }
        if (!this.translated) {
            return message.entities;
        }
        if (message.voiceTranscriptionOpen) {
            TLRPC.TL_textWithEntities tL_textWithEntities3 = message.translatedVoiceTranscription;
            if (tL_textWithEntities3 != null) {
                return tL_textWithEntities3.entities;
            }
            return null;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities4 = message.translatedText;
        if (tL_textWithEntities4 != null) {
            return tL_textWithEntities4.entities;
        }
        return null;
    }

    public int getEphemeralId() {
        if (isEphemeral()) {
            return ephemeralMessageIdUnpack(this.messageOwner.id);
        }
        return 0;
    }

    public long getEphemeralReceiverBotId() {
        TLRPC.Message message = this.messageOwner;
        if (message != null) {
            return message.ephemeralReceiverBotId;
        }
        return 0L;
    }

    public String getExtension() {
        String fileName = getFileName();
        int lastIndexOf = fileName.lastIndexOf(46);
        String substring = lastIndexOf != -1 ? fileName.substring(lastIndexOf + 1) : null;
        if (substring == null || substring.length() == 0) {
            substring = getDocument().mime_type;
        }
        if (substring == null) {
            substring = "";
        }
        return substring.toUpperCase();
    }

    public TLRPC.TL_factCheck getFactCheck() {
        return FactCheckController.getInstance(this.currentAccount).getFactCheck(this);
    }

    public CharSequence getFactCheckText() {
        if (!isFactCheckable()) {
            return null;
        }
        TLRPC.TL_factCheck factCheck = getFactCheck();
        if (factCheck == null || factCheck.text == null) {
            this.factCheckText = null;
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(factCheck.text.text);
        addEntitiesToText(spannableStringBuilder, factCheck.text.entities, isOutOwner(), false, false, false);
        this.factCheckText = spannableStringBuilder;
        return spannableStringBuilder;
    }

    public String getFileName() {
        return getDocument() != null ? getFileName(getDocument()) : getFileName(this.messageOwner);
    }

    public String getFileNameFast() {
        return getDocumentFast() != null ? getFileName(getDocumentFast()) : getFileName(this.messageOwner);
    }

    public Long getForwardedFromId() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Message message = this.messageOwner;
        if (message == null || (messageFwdHeader = message.fwd_from) == null || (peer = messageFwdHeader.from_id) == null) {
            return null;
        }
        return Long.valueOf(DialogObject.getPeerDialogId(peer));
    }

    public TLObject getForwardedFromPeerObject() {
        Long forwardedFromId = getForwardedFromId();
        if (forwardedFromId == null) {
            return null;
        }
        return MessagesController.getInstance(this.currentAccount).getUserOrChat(forwardedFromId.longValue());
    }

    public String getForwardedName() {
        TLRPC.MessageFwdHeader messageFwdHeader = this.messageOwner.fwd_from;
        if (messageFwdHeader == null) {
            return null;
        }
        TLRPC.Peer peer = messageFwdHeader.from_id;
        if (peer instanceof TLRPC.TL_peerChannel) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.fwd_from.from_id.channel_id));
            if (chat != null) {
                return chat.title;
            }
            return null;
        }
        if (peer instanceof TLRPC.TL_peerChat) {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.fwd_from.from_id.chat_id));
            if (chat2 != null) {
                return chat2.title;
            }
            return null;
        }
        if (peer instanceof TLRPC.TL_peerUser) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.fwd_from.from_id.user_id));
            if (user != null) {
                return UserObject.getUserName(user);
            }
            return null;
        }
        String str = messageFwdHeader.from_name;
        if (str != null) {
            return str;
        }
        return null;
    }

    public TLRPC.Peer getFromPeer() {
        TLRPC.Message message = this.messageOwner;
        if (message != null) {
            return message.from_id;
        }
        return null;
    }

    public TLObject getFromPeerObject() {
        TLRPC.Message message = this.messageOwner;
        if (message == null) {
            return null;
        }
        TLRPC.Peer peer = message.from_id;
        if ((peer instanceof TLRPC.TL_peerChannel_layer131) || (peer instanceof TLRPC.TL_peerChannel)) {
            return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.from_id.channel_id));
        }
        if ((peer instanceof TLRPC.TL_peerUser_layer131) || (peer instanceof TLRPC.TL_peerUser)) {
            return MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.from_id.user_id));
        }
        if ((peer instanceof TLRPC.TL_peerChat_layer131) || (peer instanceof TLRPC.TL_peerChat)) {
            return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.from_id.chat_id));
        }
        return null;
    }

    public long getGroupId() {
        long j10 = this.localGroupId;
        return j10 != 0 ? j10 : getGroupIdForUse();
    }

    public long getGroupIdForUse() {
        long j10 = this.localSentGroupId;
        return j10 != 0 ? j10 : this.messageOwner.grouped_id;
    }

    public int getId() {
        TLRPC.Message message = this.messageOwner;
        int i10 = message.ephemeralAnchorMsgId;
        return i10 != 0 ? i10 : message.id;
    }

    public BotInlineKeyboard.Source getInlineBotButtons() {
        return this.inlineKeyboardSource;
    }

    public int getLastLineWidth() {
        RichMessageLayout richMessageLayout = this.richLayout;
        return richMessageLayout != null ? richMessageLayout.getLastLineWidth() : this.lastLineWidth;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getMaxMessageTextWidth() {
        int dp;
        Uri parse;
        String lastPathSegment;
        int dp2;
        int dp3;
        if (!AndroidUtilities.isTablet() || this.eventId == 0) {
            this.generatedWithMinSize = getParentWidth();
        } else {
            this.generatedWithMinSize = AndroidUtilities.dp(530.0f);
        }
        this.generatedWithDensity = AndroidUtilities.density;
        TextPaint textPaint = org.telegram.ui.ActionBar.g6.o2;
        this.generatedWithFontSize = textPaint != null ? textPaint.getTextSize() : 0.0f;
        if (this.hasCode && !this.isSaved) {
            dp = this.generatedWithMinSize - AndroidUtilities.dp(60.0f);
            if (this.sideMenuEnabled) {
                dp3 = AndroidUtilities.dp(64.0f);
            } else if (needDrawAvatarInternal() && !isOutOwner() && !this.messageOwner.isThreadMessage) {
                dp3 = AndroidUtilities.dp(52.0f);
            }
            dp -= dp3;
        } else if ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && getMedia(this.messageOwner).webpage != null && "telegram_background".equals(getMedia(this.messageOwner).webpage.type)) {
            try {
                parse = Uri.parse(getMedia(this.messageOwner).webpage.url);
                lastPathSegment = parse.getLastPathSegment();
            } catch (Exception unused) {
            }
            if (parse.getQueryParameter("bg_color") != null) {
                dp = AndroidUtilities.dp(220.0f);
            } else {
                if (lastPathSegment.length() == 6 || (lastPathSegment.length() == 13 && lastPathSegment.charAt(6) == '-')) {
                    dp = AndroidUtilities.dp(200.0f);
                }
                dp = 0;
            }
        } else {
            if (isAndroidTheme()) {
                dp = AndroidUtilities.dp(200.0f);
            }
            dp = 0;
        }
        if (dp == 0) {
            boolean needDrawAvatarInternal = needDrawAvatarInternal();
            int dp4 = this.generatedWithMinSize - AndroidUtilities.dp(this.type == 36 ? 40.0f : 80.0f);
            if (this.sideMenuEnabled) {
                dp2 = AndroidUtilities.dp(64.0f);
            } else {
                if (needDrawAvatarInternal && !isOutOwner() && !this.messageOwner.isThreadMessage) {
                    dp2 = AndroidUtilities.dp(52.0f);
                }
                if (needDrawShareButton() && (this.isSaved || !isOutOwner())) {
                    dp4 -= AndroidUtilities.dp((this.isSaved || !isOutOwner()) ? 14.0f : 40.0f);
                }
                dp = dp4;
                if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame) {
                    dp -= AndroidUtilities.dp(10.0f);
                }
            }
            dp4 -= dp2;
            if (needDrawShareButton()) {
                dp4 -= AndroidUtilities.dp((this.isSaved || !isOutOwner()) ? 14.0f : 40.0f);
            }
            dp = dp4;
            if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame) {
            }
        }
        int i10 = this.emojiOnlyCount;
        if (i10 < 1) {
            return dp;
        }
        int i11 = this.totalAnimatedEmojiCount;
        if (i11 <= 100) {
            return i10 - i11 < (SharedConfig.getDevicePerformanceClass() < 2 ? 50 : 100) ? (hasValidReplyMessageObject() || isForwarded()) ? Math.min(dp, (int) (this.generatedWithMinSize * 0.65f)) : dp : dp;
        }
        return dp;
    }

    public int getMediaExistanceFlags() {
        boolean z10 = this.attachPathExists;
        return this.mediaExists ? (z10 ? 1 : 0) | 2 : z10 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0195, code lost:
    
        if (r0 != null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0199, code lost:
    
        if (r8.ttl_seconds == 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0104, code lost:
    
        if (isVideoDocument(r4.document) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0106, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0114, code lost:
    
        if ((((org.telegram.tgnet.TLRPC.TL_messageExtendedMediaPreview) r5).flags & 4) != 0) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CharSequence getMediaTitle(TLRPC.MessageMedia messageMedia) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        String publicUsername;
        if (messageMedia instanceof TLRPC.TL_messageMediaGiveaway) {
            return LocaleController.getString(R.string.BoostingGiveaway);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults) {
            return LocaleController.getString(R.string.BoostingGiveawayResults);
        }
        String str = null;
        if (messageMedia instanceof TLRPC.TL_messageMediaStory) {
            if (!messageMedia.via_mention) {
                return LocaleController.getString(R.string.ForwardedStory);
            }
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageMedia.user_id));
            if (user != null && (publicUsername = UserObject.getPublicUsername(user)) != null) {
                StringBuilder sb2 = new StringBuilder();
                i0.a.z(sb2, MessagesController.getInstance(this.currentAccount).linkPrefix, "/", publicUsername, "/s/");
                sb2.append(messageMedia.id);
                str = sb2.toString();
            }
            if (str == null) {
                return "";
            }
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new t41("https://".concat(str), new xz0()), 0, spannableString.length(), 33);
            return spannableString;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaDice) {
            return getDiceEmoji((TLRPC.TL_messageMediaDice) messageMedia);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
            return ((TLRPC.TL_messageMediaPoll) messageMedia).poll.quiz ? LocaleController.getString(R.string.QuizPoll) : LocaleController.getString(R.string.Poll);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            return (todoList == null || (tL_textWithEntities = todoList.title) == null || tL_textWithEntities.text.isEmpty()) ? LocaleController.getString(R.string.MessageTodo) : LocaleController.formatSpannable(R.string.MessageTodoName, formatTextWithEntities(tL_messageMediaToDo.todo.title, isOutOwner()));
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            int size = tL_messageMediaPaidMedia.extended_media.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i10);
                if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                    TLRPC.MessageMedia messageMedia2 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                    }
                    z10 = false;
                } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                }
                if (z10) {
                    break;
                }
            }
            return hh.oa.Q0(LocaleController.formatString(R.string.AttachPaidMedia, size == 1 ? LocaleController.getString(z10 ? R.string.AttachVideo : R.string.AttachPhoto) : LocaleController.formatPluralString(z10 ? "Media" : "Photos", size, new Object[0])));
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            return (messageMedia.ttl_seconds == 0 || (this.messageOwner instanceof TLRPC.TL_message_secret)) ? getGroupId() != 0 ? LocaleController.getString(R.string.Album) : isLivePhoto() ? LocaleController.getString(R.string.AttachLivePhoto) : LocaleController.getString(R.string.AttachPhoto) : LocaleController.getString(R.string.AttachDestructingPhoto);
        }
        if (messageMedia != null) {
            if (!isVideoDocument(messageMedia.document)) {
                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.Document document = messageMedia.document;
                    if (!(document instanceof TLRPC.TL_documentEmpty)) {
                    }
                }
            }
            return (messageMedia.ttl_seconds == 0 || (this.messageOwner instanceof TLRPC.TL_message_secret)) ? LocaleController.getString(R.string.AttachVideo) : messageMedia.voice ? LocaleController.getString(R.string.AttachVoiceExpired) : messageMedia.round ? LocaleController.getString(R.string.AttachRoundExpired) : LocaleController.getString(R.string.AttachDestructingVideo);
        }
        if (messageMedia != null && isVoiceDocument(messageMedia.document)) {
            return LocaleController.getString(R.string.AttachAudio);
        }
        if (messageMedia != null && isRoundVideoDocument(messageMedia.document)) {
            return LocaleController.getString(R.string.AttachRound);
        }
        if ((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
            return LocaleController.getString(R.string.AttachLocation);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaGeoLive) {
            return LocaleController.getString(R.string.AttachLiveLocation);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaContact) {
            return LocaleController.getString(R.string.AttachContact);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
            return this.messageOwner.message;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
            return messageMedia.description;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported) {
            return LocaleController.getString(R.string.UnsupportedMedia2);
        }
        if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument)) {
            return null;
        }
        if (isStickerDocument(messageMedia.document) || isAnimatedStickerDocument(messageMedia.document, true)) {
            String stickerChar = getStickerChar();
            return (stickerChar == null || stickerChar.length() <= 0) ? LocaleController.getString(R.string.AttachSticker) : a9.p.w(stickerChar, " ", LocaleController.getString(R.string.AttachSticker));
        }
        if (isMusic()) {
            return LocaleController.getString(R.string.AttachMusic);
        }
        if (isGif()) {
            return LocaleController.getString(R.string.AttachGif);
        }
        String documentFileName = FileLoader.getDocumentFileName(messageMedia.document);
        return !TextUtils.isEmpty(documentFileName) ? documentFileName : LocaleController.getString(R.string.AttachDocument);
    }

    public int getMediaType() {
        if (isVideo()) {
            return 2;
        }
        if (isVoice()) {
            return 1;
        }
        if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument) {
            return 3;
        }
        return getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto ? 0 : 4;
    }

    public CharSequence getMessageTextToTranslate(GroupedMessages groupedMessages, int[] iArr) {
        if (this.translated || this.isRestrictedMessage) {
            return null;
        }
        if (this.summarized) {
            return this.messageText;
        }
        int i10 = this.type;
        if (i10 == 19 || i10 == 15 || i10 == 13) {
            return null;
        }
        CharSequence B8 = rn.B8(this, groupedMessages, iArr);
        if (B8 == null && isPoll()) {
            try {
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) this.messageOwner.media).poll;
                StringBuilder sb2 = new StringBuilder(poll.question.text);
                sb2.append("\n");
                ArrayList<TLRPC.PollAnswer> arrayList = poll.answers;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    TLRPC.PollAnswer pollAnswer = arrayList.get(i11);
                    i11++;
                    sb2.append("\n🔘 ");
                    TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                    sb2.append(tL_textWithEntities == null ? "" : tL_textWithEntities.text);
                }
                B8 = sb2.toString();
            } catch (Exception unused) {
            }
        }
        if (B8 == null && isMediaEmpty(this.messageOwner)) {
            B8 = rn.D8(this, false, 0L);
        }
        if (B8 == null || !Emoji.fullyConsistsOfEmojis(B8)) {
            return B8;
        }
        return null;
    }

    public String getMimeType() {
        TLRPC.Document document = getDocument();
        if (document != null) {
            return document.mime_type;
        }
        if (!(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaInvoice)) {
            return getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto ? "image/jpeg" : (!(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) || getMedia(this.messageOwner).webpage.photo == null) ? "" : "image/jpeg";
        }
        TLRPC.WebDocument webDocument = ((TLRPC.TL_messageMediaInvoice) getMedia(this.messageOwner)).webPhoto;
        return webDocument != null ? webDocument.mime_type : "";
    }

    public long getMonoForumTopicId() {
        return getMonoForumTopicId(this.messageOwner);
    }

    public String getMusicAuthor() {
        return getMusicAuthor(true);
    }

    public String getMusicTitle() {
        return getMusicTitle(true);
    }

    public Long getMyPaidReactionPeer() {
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        TLRPC.Message message = this.messageOwner;
        if (message == null || (tL_messageReactions = message.reactions) == null || (arrayList = tL_messageReactions.top_reactors) == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.MessageReactor messageReactor = arrayList.get(i10);
            i10++;
            TLRPC.MessageReactor messageReactor2 = messageReactor;
            if (messageReactor2 != null && messageReactor2.my) {
                if (messageReactor2.anonymous) {
                    return Long.valueOf(UserObject.ANONYMOUS);
                }
                TLRPC.Peer peer = messageReactor2.peer_id;
                if (peer != null) {
                    return Long.valueOf(DialogObject.getPeerDialogId(peer));
                }
            }
        }
        return null;
    }

    public TLObject getPeerObject() {
        TLRPC.Message message = this.messageOwner;
        if (message == null) {
            return null;
        }
        TLRPC.Peer peer = message.peer_id;
        if ((peer instanceof TLRPC.TL_peerChannel_layer131) || (peer instanceof TLRPC.TL_peerChannel)) {
            return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.peer_id.channel_id));
        }
        if ((peer instanceof TLRPC.TL_peerUser_layer131) || (peer instanceof TLRPC.TL_peerUser)) {
            return MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.peer_id.user_id));
        }
        if ((peer instanceof TLRPC.TL_peerChat_layer131) || (peer instanceof TLRPC.TL_peerChat)) {
            return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.peer_id.chat_id));
        }
        return null;
    }

    public TLRPC.Photo getPhoto() {
        return getPhoto(this.messageOwner);
    }

    public long getPollHash() {
        TLRPC.Message message = this.messageOwner;
        if (message != null && this.type == 17) {
            TLRPC.MessageMedia media = getMedia(message);
            if (media instanceof TLRPC.TL_messageMediaPoll) {
                return ((TLRPC.TL_messageMediaPoll) media).poll.hash;
            }
        }
        return 0L;
    }

    public long getPollId() {
        if (this.type != 17) {
            return 0L;
        }
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (media instanceof TLRPC.TL_messageMediaPoll) {
            return ((TLRPC.TL_messageMediaPoll) media).poll.id;
        }
        return 0L;
    }

    public TLRPC.VideoSize getPremiumStickerAnimation() {
        return getPremiumStickerAnimation(getDocument());
    }

    public float getProgress() {
        return 0.0f;
    }

    public String getQuickReplyDisplayName() {
        String quickReplyName = getQuickReplyName();
        if (quickReplyName != null) {
            return quickReplyName;
        }
        qf.p1 c10 = qf.q1.f(this.currentAccount).c(getQuickReplyId());
        return c10 != null ? c10.b : "";
    }

    public TLRPC.MessagePeerReaction getRandomUnreadReaction() {
        ArrayList<TLRPC.MessagePeerReaction> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions = this.messageOwner.reactions;
        if (tL_messageReactions == null || (arrayList = tL_messageReactions.recent_reactions) == null || arrayList.isEmpty()) {
            return null;
        }
        return this.messageOwner.reactions.recent_reactions.get(0);
    }

    public int getRealId() {
        TLRPC.Message message = this.messageOwner;
        int i10 = message.realId;
        return i10 != 0 ? i10 : message.id;
    }

    public int getRepliesCount() {
        TLRPC.MessageReplies messageReplies = this.messageOwner.replies;
        if (messageReplies != null) {
            return messageReplies.replies;
        }
        return 0;
    }

    public int getReplyAnyMsgId() {
        TLRPC.MessageReplyHeader messageReplyHeader = this.messageOwner.reply_to;
        if (messageReplyHeader == null) {
            return 0;
        }
        int i10 = messageReplyHeader.reply_to_top_id;
        return i10 != 0 ? i10 : messageReplyHeader.reply_to_msg_id;
    }

    public int getReplyMsgId() {
        TLRPC.MessageReplyHeader messageReplyHeader = this.messageOwner.reply_to;
        if (messageReplyHeader != null) {
            return messageReplyHeader.reply_to_msg_id;
        }
        return 0;
    }

    public CharSequence getReplyQuoteNameWithIcon() {
        CharSequence charSequence;
        CharSequence append;
        TLRPC.Message message = this.messageOwner;
        if (message == null) {
            return "";
        }
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        CharSequence charSequence2 = null;
        if (messageReplyHeader != null) {
            if (messageReplyHeader.reply_from != null) {
                TLRPC.Peer peer = messageReplyHeader.reply_to_peer_id;
                boolean z10 = peer == null || DialogObject.getPeerDialogId(peer) != getDialogId();
                TLRPC.MessageFwdHeader messageFwdHeader = this.messageOwner.reply_to.reply_from;
                TLRPC.Peer peer2 = messageFwdHeader.from_id;
                if (peer2 == null) {
                    TLRPC.Peer peer3 = messageFwdHeader.saved_from_peer;
                    if (peer3 != null) {
                        if (peer3 instanceof TLRPC.TL_peerUser) {
                            append = peerNameWithIcon(this.currentAccount, peer3, z10);
                        } else {
                            charSequence = peerNameWithIcon(this.currentAccount, peer3, z10);
                        }
                    } else if (!TextUtils.isEmpty(messageFwdHeader.from_name)) {
                        append = z10 ? new SpannableStringBuilder(userSpan()).append((CharSequence) " ").append((CharSequence) this.messageOwner.reply_to.reply_from.from_name) : new SpannableStringBuilder(this.messageOwner.reply_to.reply_from.from_name);
                    }
                    charSequence2 = append;
                    charSequence = null;
                } else if (peer2 instanceof TLRPC.TL_peerUser) {
                    append = peerNameWithIcon(this.currentAccount, peer2, z10);
                    charSequence2 = append;
                    charSequence = null;
                } else {
                    charSequence = peerNameWithIcon(this.currentAccount, peer2, z10);
                }
            }
            charSequence = null;
        } else if (DialogObject.isChatDialog(getDialogId())) {
            charSequence = peerNameWithIcon(this.currentAccount, getDialogId());
        } else {
            append = peerNameWithIcon(this.currentAccount, getDialogId());
            charSequence2 = append;
            charSequence = null;
        }
        TLRPC.Peer peer4 = this.messageOwner.reply_to.reply_to_peer_id;
        if (peer4 != null && DialogObject.getPeerDialogId(peer4) != getDialogId()) {
            TLRPC.Peer peer5 = this.messageOwner.reply_to.reply_to_peer_id;
            if (peer5 instanceof TLRPC.TL_peerUser) {
                charSequence2 = peerNameWithIcon(this.currentAccount, peer5, true);
            } else {
                charSequence = peerNameWithIcon(this.currentAccount, peer5);
            }
        }
        MessageObject messageObject = this.replyMessageObject;
        if (messageObject != null) {
            if (DialogObject.isChatDialog(messageObject.getSenderId())) {
                if (charSequence == null) {
                    charSequence = peerNameWithIcon(this.currentAccount, this.replyMessageObject.getSenderId());
                }
            } else if (charSequence2 == null) {
                charSequence2 = peerNameWithIcon(this.currentAccount, this.replyMessageObject.getSenderId());
            }
        }
        return (charSequence == null || charSequence2 == null) ? charSequence != null ? charSequence : charSequence2 != null ? charSequence2 : LocaleController.getString(R.string.Loading) : new SpannableStringBuilder(charSequence2).append((CharSequence) " ").append(charSequence);
    }

    public int getReplyTopMsgId() {
        TLRPC.MessageReplyHeader messageReplyHeader = this.messageOwner.reply_to;
        if (messageReplyHeader != null) {
            return messageReplyHeader.reply_to_top_id;
        }
        return 0;
    }

    public long getSavedDialogId() {
        return getSavedDialogId(UserConfig.getInstance(this.currentAccount).getClientUserId(), this.messageOwner);
    }

    public int getSecretTimeLeft() {
        TLRPC.Message message = this.messageOwner;
        int i10 = message.ttl;
        int i11 = message.destroyTime;
        return i11 != 0 ? Math.max(0, i11 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) : i10;
    }

    public CharSequence getSecretTimeString() {
        String str;
        if (!isSecretMedia()) {
            return null;
        }
        if (this.messageOwner.ttl == Integer.MAX_VALUE) {
            if (this.secretOnceSpan == null) {
                this.secretOnceSpan = new SpannableString("v");
                cq cqVar = new cq(R.drawable.mini_viewonce, 0);
                cqVar.setTranslateX(-AndroidUtilities.dp(3.0f));
                cqVar.setWidth(AndroidUtilities.dp(13.0f));
                CharSequence charSequence = this.secretOnceSpan;
                ((Spannable) charSequence).setSpan(cqVar, 0, charSequence.length(), 33);
            }
            return TextUtils.concat(this.secretOnceSpan, "1");
        }
        int secretTimeLeft = getSecretTimeLeft();
        if (secretTimeLeft < 60) {
            str = s3.c.d(secretTimeLeft, "s");
        } else {
            str = (secretTimeLeft / 60) + "m";
        }
        if (this.secretPlaySpan == null) {
            this.secretPlaySpan = new SpannableString("p");
            cq cqVar2 = new cq(R.drawable.play_mini_video, 0);
            cqVar2.setTranslateX(AndroidUtilities.dp(1.0f));
            cqVar2.setWidth(AndroidUtilities.dp(13.0f));
            CharSequence charSequence2 = this.secretPlaySpan;
            ((Spannable) charSequence2).setSpan(cqVar2, 0, charSequence2.length(), 33);
        }
        return TextUtils.concat(this.secretPlaySpan, str);
    }

    public long getSenderId() {
        TLRPC.Peer peer;
        TLRPC.Message message = this.messageOwner;
        TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
        if (messageFwdHeader == null || (peer = messageFwdHeader.saved_from_peer) == null) {
            TLRPC.Peer peer2 = message.from_id;
            if (peer2 instanceof TLRPC.TL_peerUser) {
                return peer2.user_id;
            }
            if (peer2 instanceof TLRPC.TL_peerChannel) {
                return -peer2.channel_id;
            }
            if (peer2 instanceof TLRPC.TL_peerChat) {
                return -peer2.chat_id;
            }
            if (message.post) {
                return message.peer_id.channel_id;
            }
        } else {
            long j10 = peer.user_id;
            if (j10 != 0) {
                TLRPC.Peer peer3 = messageFwdHeader.from_id;
                return peer3 instanceof TLRPC.TL_peerUser ? peer3.user_id : j10;
            }
            if (peer.channel_id != 0) {
                if (isSavedFromMegagroup()) {
                    TLRPC.Peer peer4 = this.messageOwner.fwd_from.from_id;
                    if (peer4 instanceof TLRPC.TL_peerUser) {
                        return peer4.user_id;
                    }
                }
                TLRPC.MessageFwdHeader messageFwdHeader2 = this.messageOwner.fwd_from;
                TLRPC.Peer peer5 = messageFwdHeader2.from_id;
                return peer5 instanceof TLRPC.TL_peerChannel ? -peer5.channel_id : peer5 instanceof TLRPC.TL_peerChat ? -peer5.chat_id : -messageFwdHeader2.saved_from_peer.channel_id;
            }
            long j11 = peer.chat_id;
            if (j11 != 0) {
                TLRPC.Peer peer6 = messageFwdHeader.from_id;
                return peer6 instanceof TLRPC.TL_peerUser ? peer6.user_id : peer6 instanceof TLRPC.TL_peerChannel ? -peer6.channel_id : peer6 instanceof TLRPC.TL_peerChat ? -peer6.chat_id : -j11;
            }
        }
        return 0L;
    }

    public long getSize() {
        k61 k61Var = this.highestQuality;
        if (k61Var != null) {
            return k61Var.g.size;
        }
        k61 k61Var2 = this.thumbQuality;
        if (k61Var2 != null) {
            return k61Var2.g.size;
        }
        k61 k61Var3 = this.cachedQuality;
        return k61Var3 != null ? k61Var3.g.size : getMessageSize(this.messageOwner);
    }

    public long getStakedDiceAmount() {
        TLRPC.TL_messages_emojiGameOutcome tL_messages_emojiGameOutcome;
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (!(media instanceof TLRPC.TL_messageMediaDice) || (tL_messages_emojiGameOutcome = ((TLRPC.TL_messageMediaDice) media).game_outcome) == null) {
            return 0L;
        }
        return tL_messages_emojiGameOutcome.stake_ton_amount;
    }

    public String getStickerChar() {
        TLRPC.Document document = getDocument();
        if (document == null) {
            return null;
        }
        ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.DocumentAttribute documentAttribute = arrayList.get(i10);
            i10++;
            TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) {
                return documentAttribute2.alt;
            }
        }
        return null;
    }

    public String getStickerEmoji() {
        TLRPC.Document document = getDocument();
        if (document == null) {
            return null;
        }
        for (int i10 = 0; i10 < document.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                String str = documentAttribute.alt;
                if (str != null && str.length() > 0) {
                    return documentAttribute.alt;
                }
                return null;
            }
        }
        return null;
    }

    public TLRPC.WebPage getStoryMentionWebpage() {
        if (!isStoryMention()) {
            return null;
        }
        TLRPC.WebPage webPage = this.storyMentionWebpage;
        if (webPage != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
        tL_webPage.type = "telegram_story";
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = new TLRPC.TL_webPageAttributeStory();
        tL_webPageAttributeStory.id = this.messageOwner.media.id;
        tL_webPageAttributeStory.peer = MessagesController.getInstance(this.currentAccount).getPeer(this.messageOwner.media.user_id);
        TL_stories.StoryItem storyItem = this.messageOwner.media.storyItem;
        if (storyItem != null) {
            tL_webPageAttributeStory.flags |= 1;
            tL_webPageAttributeStory.storyItem = storyItem;
        }
        tL_webPage.attributes.add(tL_webPageAttributeStory);
        this.storyMentionWebpage = tL_webPage;
        return tL_webPage;
    }

    public TextPaint getTextPaint() {
        if (this.emojiOnlyCount < 1 || this.messageOwner == null || hasNonEmojiEntities()) {
            return org.telegram.ui.ActionBar.g6.o2;
        }
        int i10 = this.emojiOnlyCount;
        int i11 = this.animatedEmojiCount;
        boolean z10 = i10 == i11;
        switch (Math.max(i10, i11)) {
            case 0:
            case 1:
            case 2:
                TextPaint[] textPaintArr = org.telegram.ui.ActionBar.g6.y2;
                return z10 ? textPaintArr[0] : textPaintArr[2];
            case 3:
                TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.g6.y2;
                return z10 ? textPaintArr2[1] : textPaintArr2[3];
            case 4:
                TextPaint[] textPaintArr3 = org.telegram.ui.ActionBar.g6.y2;
                return z10 ? textPaintArr3[2] : textPaintArr3[4];
            case 5:
                TextPaint[] textPaintArr4 = org.telegram.ui.ActionBar.g6.y2;
                return z10 ? textPaintArr4[3] : textPaintArr4[5];
            case 6:
                TextPaint[] textPaintArr5 = org.telegram.ui.ActionBar.g6.y2;
                return z10 ? textPaintArr5[4] : textPaintArr5[5];
            default:
                return org.telegram.ui.ActionBar.g6.y2[5];
        }
    }

    public TLRPC.Photo getVideoCover() {
        TLRPC.WebPage webPage;
        TLRPC.MessageMedia media = getMedia(this);
        if (media instanceof TLRPC.TL_messageMediaDocument) {
            return ((TLRPC.TL_messageMediaDocument) media).video_cover;
        }
        if (media == null || (webPage = media.webpage) == null || !webPage.video_cover_photo) {
            return null;
        }
        return webPage.photo;
    }

    public float getVideoSavedProgress() {
        float f10 = 0.0f;
        if (this.cachedSavedTimestamp != null) {
            Drawable[] drawableArr = PhotoViewer.P8;
            int duration = (int) getDuration();
            String fileNameFast = isEmbedVideo() ? this.messageOwner.media.webpage.url : getFileNameFast();
            if (!TextUtils.isEmpty(fileNameFast) && duration >= 10) {
                gu0 gu0Var = (gu0) PhotoViewer.R8.get(fileNameFast);
                if (this.forceSeekTo < 0.0f && gu0Var != null) {
                    float f11 = gu0Var.a;
                    if (f11 > 0.0f && f11 < 0.999f) {
                        return f11;
                    }
                }
            }
            return 0.0f;
        }
        Drawable[] drawableArr2 = PhotoViewer.P8;
        int duration2 = (int) getDuration();
        String fileNameFast2 = isEmbedVideo() ? this.messageOwner.media.webpage.url : getFileNameFast();
        if (!TextUtils.isEmpty(fileNameFast2)) {
            if (duration2 >= 10) {
                gu0 gu0Var2 = (gu0) PhotoViewer.R8.get(fileNameFast2);
                if (this.forceSeekTo < 0.0f && gu0Var2 != null) {
                    float f12 = gu0Var2.a;
                    if (f12 > 0.0f && f12 < 0.999f) {
                        f10 = f12;
                    }
                }
            }
            if (duration2 >= 120 && this.forceSeekTo < 0.0f) {
                float f13 = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).getFloat(fileNameFast2, -1.0f);
                if (f13 > 0.0f && f13 < 0.999f) {
                    f10 = f13;
                }
            }
        }
        this.cachedSavedTimestamp = Float.valueOf(f10);
        return f10;
    }

    public int getVideoStartsTimestamp() {
        String str;
        Integer num = this.cachedStartsTimestamp;
        if (num != null) {
            return num.intValue();
        }
        if (!isVideo()) {
            this.cachedStartsTimestamp = -1;
            return -1;
        }
        TLRPC.MessageMedia media = getMedia(this);
        int i10 = media.video_timestamp;
        if (i10 != 0) {
            return i10;
        }
        TLRPC.WebPage webPage = media.webpage;
        if (webPage != null && (str = webPage.url) != null) {
            try {
                int W = LaunchActivity.W(Uri.parse(str));
                this.cachedStartsTimestamp = Integer.valueOf(W);
                return W;
            } catch (Exception unused) {
            }
        }
        this.cachedStartsTimestamp = -1;
        return -1;
    }

    public CharSequence getVoiceTranscription() {
        String str;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message = this.messageOwner;
        if (message == null || (str = message.voiceTranscription) == null) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            String str2 = (!this.translated || (tL_textWithEntities = this.messageOwner.translatedVoiceTranscription) == null) ? this.messageOwner.voiceTranscription : tL_textWithEntities.text;
            return !TextUtils.isEmpty(str2) ? Emoji.replaceEmoji(str2, org.telegram.ui.ActionBar.g6.o2.getFontMetricsInt(), false) : str2;
        }
        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.NoWordsRecognized));
        spannableString.setSpan(new CharacterStyle() { // from class: org.telegram.messenger.MessageObject.1
            @Override // android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                textPaint.setTextSize(textPaint.getTextSize() * 0.8f);
                textPaint.setColor(org.telegram.ui.ActionBar.g6.T2.getColor());
            }
        }, 0, spannableString.length(), 33);
        return spannableString;
    }

    public byte[] getWaveform() {
        if (getDocument() == null) {
            return null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getDocument().attributes.size(); i11++) {
            TLRPC.DocumentAttribute documentAttribute = getDocument().attributes.get(i11);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                byte[] bArr = documentAttribute.waveform;
                if (bArr == null || bArr.length == 0) {
                    MediaController.getInstance().generateWaveform(this);
                }
                return documentAttribute.waveform;
            }
        }
        if (!isRoundVideo()) {
            return null;
        }
        if (this.randomWaveform == null) {
            this.randomWaveform = new byte[120];
            while (true) {
                byte[] bArr2 = this.randomWaveform;
                if (i10 >= bArr2.length) {
                    break;
                }
                bArr2[i10] = (byte) (Math.random() * 255.0d);
                i10++;
            }
        }
        return this.randomWaveform;
    }

    public ArrayList<MessageObject> getWebPagePhotos(ArrayList<MessageObject> arrayList, ArrayList<TL_iv.PageBlock> arrayList2) {
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (getMedia(this.messageOwner) != null && getMedia(this.messageOwner).webpage != null && (page = (webPage = getMedia(this.messageOwner).webpage).cached_page) != null) {
            if (arrayList2 == null) {
                arrayList2 = page.blocks;
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TL_iv.PageBlock pageBlock = arrayList2.get(i10);
                if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                    TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                    for (int i11 = 0; i11 < pageblockslideshow.items.size(); i11++) {
                        arrayList.add(getMessageObjectForBlock(webPage, pageblockslideshow.items.get(i11)));
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                    TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                    for (int i12 = 0; i12 < pageblockcollage.items.size(); i12++) {
                        arrayList.add(getMessageObjectForBlock(webPage, pageblockcollage.items.get(i12)));
                    }
                }
            }
        }
        return arrayList;
    }

    public boolean hasAttachedStickers() {
        if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) {
            return getMedia(this.messageOwner).photo != null && getMedia(this.messageOwner).photo.has_stickers;
        }
        if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument) {
            return isDocumentHasAttachedStickers(getMedia(this.messageOwner).document);
        }
        return false;
    }

    public boolean hasChosenReaction(ig.q0 q0Var) {
        if (hasReactions() && q0Var != null) {
            for (int i10 = 0; i10 < this.messageOwner.reactions.results.size(); i10++) {
                TLRPC.ReactionCount reactionCount = this.messageOwner.reactions.results.get(i10);
                if (q0Var.f(reactionCount.reaction)) {
                    return reactionCount.chosen;
                }
            }
        }
        return false;
    }

    public boolean hasEntitiesFromServer() {
        TLRPC.Message message = this.messageOwner;
        if (message == null || message.entities == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.messageOwner.entities.size(); i10++) {
            TLRPC.MessageEntity messageEntity = this.messageOwner.entities.get(i10);
            if ((messageEntity instanceof TLRPC.TL_messageEntityPhone) || (messageEntity instanceof TLRPC.TL_messageEntityBankCard)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasExtendedMedia() {
        TLRPC.MessageMedia messageMedia = this.messageOwner.media;
        return (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) || messageMedia.extended_media.isEmpty()) ? false : true;
    }

    public boolean hasExtendedMediaPreview() {
        TLRPC.MessageMedia messageMedia = this.messageOwner.media;
        return (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) || messageMedia.extended_media.isEmpty() || !(this.messageOwner.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview)) ? false : true;
    }

    public boolean hasHighlightedWords() {
        ArrayList<String> arrayList = this.highlightedWords;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public boolean hasInlineBotButtons() {
        TLRPC.Message message;
        if (this.isRestrictedMessage || this.isRepostPreview || (message = this.messageOwner) == null) {
            return false;
        }
        TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
        return ((replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty()) || getInlineBotButtons() != null;
    }

    public boolean hasLinkMediaToMakeSmall() {
        boolean z10 = !this.isRestrictedMessage && (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && (getMedia(this.messageOwner).webpage instanceof TLRPC.TL_webPage);
        TLRPC.WebPage webPage = z10 ? getMedia(this.messageOwner).webpage : null;
        String str = webPage != null ? webPage.type : null;
        return z10 && !isGiveawayOrGiveawayResults() && webPage != null && (webPage.photo != null || isVideoDocument(webPage.document)) && !((TextUtils.isEmpty(webPage.description) && TextUtils.isEmpty(webPage.title)) || isSponsored() || "telegram_megagroup".equals(str) || "telegram_background".equals(str) || "telegram_voicechat".equals(str) || "telegram_videochat".equals(str) || "telegram_livestream".equals(str) || "telegram_user".equals(str) || "telegram_story".equals(str) || "telegram_channel_boost".equals(str) || "telegram_group_boost".equals(str) || "telegram_chat".equals(str));
    }

    public boolean hasMediaSpoilers() {
        TLRPC.MessageMedia messageMedia;
        return (!this.isRepostPreview && (((messageMedia = this.messageOwner.media) != null && messageMedia.spoiler) || needDrawBluredPreview())) || isHiddenSensitive();
    }

    public boolean hasPaidMediaPreview() {
        TLRPC.MessageMedia messageMedia = this.messageOwner.media;
        return messageMedia != null && (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) && !messageMedia.extended_media.isEmpty() && (this.messageOwner.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview);
    }

    public boolean hasReaction(ig.q0 q0Var) {
        if (hasReactions() && q0Var != null) {
            for (int i10 = 0; i10 < this.messageOwner.reactions.results.size(); i10++) {
                if (q0Var.f(this.messageOwner.reactions.results.get(i10).reaction)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasReactions() {
        TLRPC.TL_messageReactions tL_messageReactions = this.messageOwner.reactions;
        return (tL_messageReactions == null || tL_messageReactions.results.isEmpty()) ? false : true;
    }

    public boolean hasReplies() {
        TLRPC.MessageReplies messageReplies = this.messageOwner.replies;
        return messageReplies != null && messageReplies.replies > 0;
    }

    public boolean hasRevealedExtendedMedia() {
        TLRPC.MessageMedia messageMedia = this.messageOwner.media;
        return (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) || messageMedia.extended_media.isEmpty() || !(this.messageOwner.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMedia)) ? false : true;
    }

    public boolean hasSuggestionInlineButtons() {
        TLRPC.SuggestedPost suggestedPost;
        TLRPC.Message message = this.messageOwner;
        boolean z10 = (message == null || (suggestedPost = message.suggested_post) == null || suggestedPost.rejected || suggestedPost.accepted || isSendError() || isSending()) ? false : true;
        if (z10) {
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            long peerDialogId = DialogObject.getPeerDialogId(this.messageOwner.saved_peer_id);
            long peerDialogId2 = DialogObject.getPeerDialogId(this.messageOwner.from_id);
            boolean z11 = clientUserId == peerDialogId;
            boolean z12 = peerDialogId == peerDialogId2;
            if ((z11 && z12) || (!z11 && !z12)) {
                return false;
            }
        }
        return z10;
    }

    public boolean hasValidGroupId() {
        int i10;
        if (getGroupId() == 0) {
            return false;
        }
        ArrayList<TLRPC.PhotoSize> arrayList = this.photoThumbs;
        return !(arrayList == null || arrayList.isEmpty()) || (i10 = this.type) == 3 || i10 == 1 || isMusic() || isDocument();
    }

    public boolean hasValidGroupIdFast() {
        int i10;
        if (getGroupId() == 0) {
            return false;
        }
        ArrayList<TLRPC.PhotoSize> arrayList = this.photoThumbs;
        return !(arrayList == null || arrayList.isEmpty()) || (i10 = this.type) == 3 || i10 == 1 || i10 == 14 || i10 == 9;
    }

    public boolean hasValidReplyMessageObject() {
        MessageObject messageObject;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.Message message = this.messageOwner;
        if ((message == null || (messageReplyHeader = message.reply_to) == null || !messageReplyHeader.forum_topic || messageReplyHeader.reply_to_msg_id != messageReplyHeader.reply_to_top_id) && (messageObject = this.replyMessageObject) != null) {
            TLRPC.Message message2 = messageObject.messageOwner;
            if (!(message2 instanceof TLRPC.TL_messageEmpty)) {
                TLRPC.MessageAction messageAction = message2.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionHistoryClear) && !(messageAction instanceof TLRPC.TL_messageActionTopicCreate)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasVideoCover() {
        return getVideoCover() != null;
    }

    public boolean hasVideoQualities() {
        return hasVideoQualities(true);
    }

    public boolean hasVoteResults() {
        if (this.type != 17) {
            return false;
        }
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (media instanceof TLRPC.TL_messageMediaPoll) {
            return isVoteResultsIsNotEmpty((TLRPC.TL_messageMediaPoll) media);
        }
        return false;
    }

    public boolean isAlbumSingle() {
        return getMedia(this) instanceof TLRPC.TL_messageMediaPaidMedia;
    }

    public boolean isAndroidTheme() {
        if (getMedia(this.messageOwner) != null && getMedia(this.messageOwner).webpage != null && !getMedia(this.messageOwner).webpage.attributes.isEmpty()) {
            int size = getMedia(this.messageOwner).webpage.attributes.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.WebPageAttribute webPageAttribute = getMedia(this.messageOwner).webpage.attributes.get(i10);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeTheme) {
                    TLRPC.TL_webPageAttributeTheme tL_webPageAttributeTheme = (TLRPC.TL_webPageAttributeTheme) webPageAttribute;
                    ArrayList<TLRPC.Document> arrayList = tL_webPageAttributeTheme.documents;
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if ("application/x-tgtheme-android".equals(arrayList.get(i11).mime_type)) {
                            return true;
                        }
                    }
                    if (tL_webPageAttributeTheme.settings != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isAnimatedAnimatedEmoji() {
        return isAnimatedEmoji() && isAnimatedEmoji(getDocument());
    }

    public boolean isAnimatedEmojiStickerSingle() {
        return this.emojiAnimatedStickerId != null;
    }

    public boolean isAnimatedEmojiStickers() {
        return this.type == 19;
    }

    public boolean isAnimatedSticker() {
        int i10 = this.type;
        if (i10 != 1000) {
            return i10 == 15;
        }
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(getDialogId());
        if (isEncryptedDialog && this.messageOwner.stickerVerified != 1) {
            return false;
        }
        if (this.emojiAnimatedStickerId == null || this.emojiAnimatedSticker != null) {
            return isAnimatedStickerDocument(getDocument(), (this.emojiAnimatedSticker == null && isEncryptedDialog && !isOut()) ? false : true);
        }
        return true;
    }

    public boolean isAnyGift() {
        int i10 = this.type;
        return i10 == 30 || i10 == 18 || i10 == 25;
    }

    public boolean isAnyKindOfSticker() {
        int i10 = this.type;
        return i10 == 13 || i10 == 15 || i10 == 19;
    }

    public boolean isBotPreview() {
        return this.storyItem instanceof jh.a6;
    }

    public boolean isComments() {
        TLRPC.MessageReplies messageReplies = this.messageOwner.replies;
        return messageReplies != null && messageReplies.comments;
    }

    public boolean isConferenceCall() {
        return this.messageOwner.action instanceof TLRPC.TL_messageActionConferenceCall;
    }

    public boolean isContentUnread() {
        return this.messageOwner.media_unread;
    }

    public boolean isCurrentWallpaper() {
        TLRPC.Message message;
        TLRPC.MessageAction messageAction;
        TLRPC.UserFull userFull;
        TLRPC.WallPaper wallPaper;
        return (!isWallpaperAction() || (message = this.messageOwner) == null || (messageAction = message.action) == null || messageAction.wallpaper == null || (userFull = MessagesController.getInstance(this.currentAccount).getUserFull(getDialogId())) == null || (wallPaper = userFull.wallpaper) == null || !userFull.wallpaper_overridden || this.messageOwner.action.wallpaper.id != wallPaper.id) ? false : true;
    }

    public boolean isDice() {
        return getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDice;
    }

    public boolean isDocument() {
        return (getDocument() == null || isVideo() || isMusic() || isVoice() || isAnyKindOfSticker()) ? false : true;
    }

    public boolean isEdited() {
        TLRPC.Message message = this.messageOwner;
        return (message == null || (message.flags & 32768) == 0 || message.edit_date == 0 || message.edit_hide) ? false : true;
    }

    public boolean isEditedSuggestionOffer() {
        TLRPC.Message message;
        MessageObject messageObject = this.replyMessageObject;
        return (messageObject == null || messageObject.messageOwner == null || (message = this.messageOwner) == null || message.suggested_post == null) ? false : true;
    }

    public boolean isEditing() {
        TLRPC.Message message = this.messageOwner;
        return message.send_state == 3 && message.id > 0;
    }

    public boolean isEditingMedia() {
        return getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto ? getMedia(this.messageOwner).photo.id == 0 : (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument) && getMedia(this.messageOwner).document.dc_id == 0;
    }

    public boolean isEmbedVideo() {
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        TLRPC.MessageMedia messageMedia2;
        Boolean bool = this.isEmbedVideoCached;
        boolean z10 = false;
        if (bool != null) {
            TLRPC.Message message = this.messageOwner;
            return (message == null || (messageMedia2 = message.media) == null || messageMedia2.webpage == null || !bool.booleanValue()) ? false : true;
        }
        TLRPC.Message message2 = this.messageOwner;
        if (message2 != null && (messageMedia = message2.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(i81.e(webPage.url))) {
            z10 = true;
        }
        this.isEmbedVideoCached = Boolean.valueOf(z10);
        return z10;
    }

    public boolean isEphemeral() {
        return isEphemeral(this.messageOwner);
    }

    public boolean isEphemeralAndNotWelcome() {
        return isEphemeralAndNotWelcome(this.messageOwner);
    }

    public boolean isExpiredLiveLocation(int i10) {
        TLRPC.Message message = this.messageOwner;
        return message.date + getMedia(message).period <= i10;
    }

    public boolean isExpiredStory() {
        int i10 = this.type;
        return (i10 == 23 || i10 == 24) && (this.messageOwner.media.storyItem instanceof TL_stories.TL_storyItemDeleted);
    }

    public boolean isFactCheckable() {
        if (getId() < 0 || isSponsored()) {
            return false;
        }
        int i10 = this.type;
        return i10 == 0 || i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8 || i10 == 9;
    }

    public boolean isFcmMessage() {
        return this.localType != 0;
    }

    public boolean isForwarded() {
        return isForwardedMessage(this.messageOwner);
    }

    public boolean isForwardedChannelPost() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Message message = this.messageOwner;
        TLRPC.Peer peer = message.from_id;
        if (!(peer instanceof TLRPC.TL_peerChannel) || (messageFwdHeader = message.fwd_from) == null || messageFwdHeader.channel_post == 0) {
            return false;
        }
        TLRPC.Peer peer2 = messageFwdHeader.saved_from_peer;
        return (peer2 instanceof TLRPC.TL_peerChannel) && peer.channel_id == peer2.channel_id;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isFromChannel() {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        TLRPC.Peer peer2 = this.messageOwner.peer_id;
        TLRPC.Chat chat2 = null;
        if (peer2 != null) {
            long j10 = peer2.channel_id;
            if (j10 != 0) {
                chat = getChat(null, null, j10);
                if (!(this.messageOwner.peer_id instanceof TLRPC.TL_peerChannel) && ChatObject.isChannelAndNotMegaGroup(chat)) {
                    return true;
                }
                peer = this.messageOwner.from_id;
                if (peer != null) {
                    long j11 = peer.channel_id;
                    if (j11 != 0) {
                        chat2 = getChat(null, null, j11);
                    }
                }
                return (this.messageOwner.from_id instanceof TLRPC.TL_peerChannel) && ChatObject.isChannelAndNotMegaGroup(chat2);
            }
        }
        chat = null;
        if (!(this.messageOwner.peer_id instanceof TLRPC.TL_peerChannel)) {
        }
        peer = this.messageOwner.from_id;
        if (peer != null) {
        }
        if (this.messageOwner.from_id instanceof TLRPC.TL_peerChannel) {
            return false;
        }
    }

    public boolean isFromChat() {
        TLRPC.Peer peer;
        if (getDialogId() == UserConfig.getInstance(this.currentAccount).clientUserId) {
            return true;
        }
        TLRPC.Peer peer2 = this.messageOwner.peer_id;
        TLRPC.Chat chat = null;
        if (peer2 != null) {
            long j10 = peer2.channel_id;
            if (j10 != 0) {
                chat = getChat(null, null, j10);
            }
        }
        if (!(ChatObject.isChannel(chat) && chat.megagroup) && ((peer = this.messageOwner.peer_id) == null || peer.chat_id == 0)) {
            return (peer == null || peer.channel_id == 0 || chat == null || !chat.megagroup) ? false : true;
        }
        return true;
    }

    public boolean isFromGroup() {
        TLRPC.Message message = this.messageOwner;
        if (message == null) {
            return false;
        }
        TLRPC.Peer peer = message.peer_id;
        TLRPC.Chat chat = null;
        if (peer != null) {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                chat = getChat(null, null, j10);
            }
        }
        return (this.messageOwner.from_id instanceof TLRPC.TL_peerChannel) && ChatObject.isChannel(chat) && chat.megagroup;
    }

    public boolean isFromUser() {
        TLRPC.Message message = this.messageOwner;
        return (message.from_id instanceof TLRPC.TL_peerUser) && !message.post;
    }

    public boolean isGame() {
        return isGameMessage(this.messageOwner);
    }

    public boolean isGif() {
        return isGifMessage(this.messageOwner);
    }

    public boolean isGiveaway() {
        return this.type == 26;
    }

    public boolean isGiveawayOrGiveawayResults() {
        return isGiveaway() || isGiveawayResults();
    }

    public boolean isGiveawayResults() {
        return this.type == 28;
    }

    public boolean isHiddenSensitive() {
        return isSensitive() && !MessagesController.getInstance(this.currentAccount).showSensitiveContent();
    }

    public boolean isImportedForward() {
        TLRPC.MessageFwdHeader messageFwdHeader = this.messageOwner.fwd_from;
        return messageFwdHeader != null && messageFwdHeader.imported;
    }

    public boolean isInvoice() {
        return isInvoiceMessage(this.messageOwner);
    }

    public boolean isLinkMediaSmall() {
        TLRPC.WebPage webPage = (!this.isRestrictedMessage && (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && (getMedia(this.messageOwner).webpage instanceof TLRPC.TL_webPage)) ? getMedia(this.messageOwner).webpage : null;
        String str = webPage != null ? webPage.type : null;
        if (webPage != null && TextUtils.isEmpty(webPage.description) && TextUtils.isEmpty(webPage.title)) {
            return false;
        }
        return "app".equals(str) || "profile".equals(str) || "article".equals(str) || "telegram_bot".equals(str) || "telegram_user".equals(str) || "telegram_channel".equals(str) || "telegram_megagroup".equals(str) || "telegram_voicechat".equals(str) || "telegram_videochat".equals(str) || "telegram_livestream".equals(str) || "telegram_channel_boost".equals(str) || "telegram_group_boost".equals(str) || "telegram_chat".equals(str);
    }

    public boolean isLinkedToChat(long j10) {
        TLRPC.MessageReplies messageReplies = this.messageOwner.replies;
        if (messageReplies != null) {
            return j10 == 0 || messageReplies.channel_id == j10;
        }
        return false;
    }

    public boolean isLiveLocation() {
        return isLiveLocationMessage(this.messageOwner);
    }

    public boolean isLivePhoto() {
        TLRPC.MessageMedia media = getMedia(this);
        return media != null && media.live_photo;
    }

    public boolean isLocation() {
        return isLocationMessage(this.messageOwner);
    }

    public boolean isMask() {
        return isMaskMessage(this.messageOwner);
    }

    public boolean isMediaEmpty() {
        return isMediaEmpty(this.messageOwner);
    }

    public boolean isMediaEmptyWebpage() {
        return isMediaEmptyWebpage(this.messageOwner);
    }

    public boolean isMusic() {
        return (!isMusicMessage(this.messageOwner) || isVideo() || isRoundVideo()) ? false : true;
    }

    public boolean isNewGif() {
        return getMedia(this.messageOwner) != null && isNewGifDocument(getDocument());
    }

    public boolean isOut() {
        return this.messageOwner.out;
    }

    public boolean isOutOwner() {
        boolean z10 = true;
        if (this.previewForward) {
            return true;
        }
        Boolean bool = this.isOutOwnerCached;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (isWelcomeMessage() && !isWelcomeAnchored()) {
            this.isOutOwnerCached = Boolean.FALSE;
            return false;
        }
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        if (this.isSaved || getDialogId() == clientUserId) {
            TLRPC.MessageFwdHeader messageFwdHeader = this.messageOwner.fwd_from;
            if (messageFwdHeader == null) {
                this.isOutOwnerCached = Boolean.TRUE;
                return true;
            }
            TLRPC.Peer peer = messageFwdHeader.from_id;
            if ((peer == null || peer.user_id != clientUserId) && !messageFwdHeader.saved_out) {
                z10 = false;
            }
            this.isOutOwnerCached = Boolean.valueOf(z10);
            return z10;
        }
        TLRPC.Peer peer2 = this.messageOwner.peer_id;
        TLRPC.Chat chat = null;
        if (peer2 != null) {
            long j10 = peer2.channel_id;
            if (j10 != 0) {
                chat = getChat(null, null, j10);
            }
        }
        TLRPC.Message message = this.messageOwner;
        if (message.out) {
            TLRPC.Peer peer3 = message.from_id;
            if ((peer3 instanceof TLRPC.TL_peerUser) || ((peer3 instanceof TLRPC.TL_peerChannel) && !ChatObject.isChannelAndNotMegaGroup(chat))) {
                TLRPC.Message message2 = this.messageOwner;
                if (!message2.post) {
                    TLRPC.MessageFwdHeader messageFwdHeader2 = message2.fwd_from;
                    if (messageFwdHeader2 == null) {
                        this.isOutOwnerCached = Boolean.TRUE;
                        return true;
                    }
                    TLRPC.Peer peer4 = messageFwdHeader2.saved_from_peer;
                    if (peer4 != null && peer4.user_id != clientUserId) {
                        z10 = false;
                    }
                    this.isOutOwnerCached = Boolean.valueOf(z10);
                    return z10;
                }
            }
        }
        this.isOutOwnerCached = Boolean.FALSE;
        return false;
    }

    public boolean isPaid() {
        TLRPC.Message message = this.messageOwner;
        return message != null && message.paid_message_stars > 0;
    }

    public boolean isPaidReactionChosen() {
        if (this.messageOwner.reactions == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.messageOwner.reactions.results.size(); i10++) {
            if (this.messageOwner.reactions.results.get(i10).reaction instanceof TLRPC.TL_reactionPaid) {
                return this.messageOwner.reactions.results.get(i10).chosen;
            }
        }
        return false;
    }

    public boolean isPaidSuggestedPost() {
        TLRPC.Message message = this.messageOwner;
        if (message != null) {
            return message.paid_suggested_post_stars || message.paid_suggested_post_ton;
        }
        return false;
    }

    public boolean isPaidSuggestedPostProtected() {
        if (isPaidSuggestedPost()) {
            return ((long) (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.messageOwner.date)) < MessagesController.getInstance(this.currentAccount).config.starsSuggestedPostAgeMin.get(TimeUnit.SECONDS);
        }
        return false;
    }

    public boolean isPoll() {
        return this.type == 17 && (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPoll);
    }

    public boolean isPollClosed() {
        if (this.type != 17) {
            return false;
        }
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (media instanceof TLRPC.TL_messageMediaPoll) {
            return ((TLRPC.TL_messageMediaPoll) media).poll.closed;
        }
        return false;
    }

    public boolean isPrivateForward() {
        TLRPC.MessageFwdHeader messageFwdHeader = this.messageOwner.fwd_from;
        return (messageFwdHeader == null || TextUtils.isEmpty(messageFwdHeader.from_name)) ? false : true;
    }

    public boolean isPublicPoll() {
        if (this.type != 17) {
            return false;
        }
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (media instanceof TLRPC.TL_messageMediaPoll) {
            return ((TLRPC.TL_messageMediaPoll) media).poll.public_voters;
        }
        return false;
    }

    public boolean isQuiz() {
        if (this.type != 17) {
            return false;
        }
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (media instanceof TLRPC.TL_messageMediaPoll) {
            return ((TLRPC.TL_messageMediaPoll) media).poll.quiz;
        }
        return false;
    }

    public boolean isReactionsAvailable() {
        return (isEditing() || isSponsored() || !isSent() || isEphemeral() || isExpiredStory() || !canSetReaction()) ? false : true;
    }

    public boolean isReply() {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        MessageObject messageObject = this.replyMessageObject;
        if ((messageObject == null || !(messageObject.messageOwner instanceof TLRPC.TL_messageEmpty)) && (messageReplyHeader = (message = this.messageOwner).reply_to) != null) {
            return ((messageReplyHeader.reply_to_msg_id == 0 && messageReplyHeader.reply_to_random_id == 0) || (message.flags & 8) == 0) ? false : true;
        }
        return false;
    }

    public boolean isReplyToStory() {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        MessageObject messageObject = this.replyMessageObject;
        return ((messageObject != null && (messageObject.messageOwner instanceof TLRPC.TL_messageEmpty)) || (messageReplyHeader = (message = this.messageOwner).reply_to) == null || messageReplyHeader.story_id == 0 || (message.flags & 8) == 0) ? false : true;
    }

    public boolean isRoundOnce() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        return isRoundVideo() && (message = this.messageOwner) != null && (messageMedia = message.media) != null && messageMedia.ttl_seconds == Integer.MAX_VALUE;
    }

    public boolean isRoundVideo() {
        if (this.isRoundVideoCached == 0) {
            this.isRoundVideoCached = (this.type == 5 || isRoundVideoMessage(this.messageOwner)) ? 1 : 2;
        }
        return this.isRoundVideoCached == 1;
    }

    public boolean isSavedFromMegagroup() {
        TLRPC.Peer peer;
        TLRPC.MessageFwdHeader messageFwdHeader = this.messageOwner.fwd_from;
        if (messageFwdHeader == null || (peer = messageFwdHeader.saved_from_peer) == null || peer.channel_id == 0) {
            return false;
        }
        return ChatObject.isMegagroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.fwd_from.saved_from_peer.channel_id)));
    }

    public boolean isSecret() {
        return this.messageOwner instanceof TLRPC.TL_message_secret;
    }

    public boolean isSendError() {
        TLRPC.Message message = this.messageOwner;
        if (message.send_state == 2 && message.id < 0) {
            return true;
        }
        if (!this.scheduled || message.id <= 0) {
            return false;
        }
        return message.date < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - (this.messageOwner.video_processing_pending ? 300 : 60);
    }

    public boolean isSending() {
        TLRPC.Message message = this.messageOwner;
        return message.send_state == 1 && message.id < 0;
    }

    public boolean isSensitive() {
        TLRPC.Chat chat;
        Boolean bool = this.isSensitiveCached;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.messageOwner == null || !canBeSensitive()) {
            return false;
        }
        if (!this.messageOwner.restriction_reason.isEmpty()) {
            for (int i10 = 0; i10 < this.messageOwner.restriction_reason.size(); i10++) {
                TLRPC.RestrictionReason restrictionReason = this.messageOwner.restriction_reason.get(i10);
                if ("sensitive".equals(restrictionReason.reason) && ("all".equals(restrictionReason.platform) || (("android".equals(restrictionReason.platform) && ((!ApplicationLoader.isStandaloneBuild() && !BuildVars.isBetaApp()) || BuildVars.DEBUG_PRIVATE_VERSION)) || "android-all".equals(restrictionReason.platform)))) {
                    this.isSensitiveCached = Boolean.TRUE;
                    return true;
                }
            }
        }
        if (getDialogId() < 0 && (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-getDialogId()))) != null && chat.restriction_reason != null) {
            for (int i11 = 0; i11 < chat.restriction_reason.size(); i11++) {
                TLRPC.RestrictionReason restrictionReason2 = chat.restriction_reason.get(i11);
                if ("sensitive".equals(restrictionReason2.reason) && ("all".equals(restrictionReason2.platform) || (("android".equals(restrictionReason2.platform) && ((!ApplicationLoader.isStandaloneBuild() && !BuildVars.isBetaApp()) || BuildVars.DEBUG_PRIVATE_VERSION)) || "android-all".equals(restrictionReason2.platform)))) {
                    this.isSensitiveCached = Boolean.TRUE;
                    return true;
                }
            }
        }
        this.isSensitiveCached = Boolean.FALSE;
        return false;
    }

    public boolean isSent() {
        TLRPC.Message message = this.messageOwner;
        return message.send_state == 0 || message.id > 0;
    }

    public boolean isSponsored() {
        return this.sponsoredId != null;
    }

    public boolean isStakeableDice() {
        TLRPC.TL_messageMediaDice tL_messageMediaDice = (TLRPC.TL_messageMediaDice) getMedia(this.messageOwner, TLRPC.TL_messageMediaDice.class);
        return tL_messageMediaDice != null && TextUtils.equals("🎲", tL_messageMediaDice.emoticon);
    }

    public boolean isStakedDice() {
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        return (media instanceof TLRPC.TL_messageMediaDice) && ((TLRPC.TL_messageMediaDice) media).game_outcome != null;
    }

    public boolean isStarGiftAction() {
        TLRPC.Message message = this.messageOwner;
        if (message == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        return (messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique);
    }

    public boolean isSticker() {
        int i10 = this.type;
        return i10 != 1000 ? i10 == 13 : isStickerDocument(getDocument()) || isVideoSticker(getDocument());
    }

    public boolean isStory() {
        return this.storyItem != null;
    }

    public boolean isStoryMedia() {
        TLRPC.Message message = this.messageOwner;
        return message != null && (message.media instanceof TLRPC.TL_messageMediaStory);
    }

    public boolean isStoryMention() {
        return this.type == 24 && !isExpiredStory();
    }

    public boolean isSupergroup() {
        if (this.localSupergroup) {
            return true;
        }
        Boolean bool = this.cachedIsSupergroup;
        if (bool != null) {
            return bool.booleanValue();
        }
        TLRPC.Peer peer = this.messageOwner.peer_id;
        if (peer != null) {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                TLRPC.Chat chat = getChat(null, null, j10);
                if (chat == null) {
                    return false;
                }
                boolean z10 = chat.megagroup;
                this.cachedIsSupergroup = Boolean.valueOf(z10);
                return z10;
            }
        }
        this.cachedIsSupergroup = Boolean.FALSE;
        return false;
    }

    public boolean isTheme() {
        return (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && getMedia(this.messageOwner).webpage != null && "telegram_theme".equals(getMedia(this.messageOwner).webpage.type);
    }

    public boolean isTodo() {
        return this.type == 17 && (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaToDo);
    }

    public boolean isUnread() {
        TLRPC.Message message = this.messageOwner;
        return message != null && message.unread;
    }

    public boolean isUnsupported() {
        return getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaUnsupported;
    }

    public boolean isVideo() {
        return isVideoMessage(this.messageOwner);
    }

    public boolean isVideoAvatar() {
        TLRPC.Photo photo;
        TLRPC.MessageAction messageAction = this.messageOwner.action;
        return (messageAction == null || (photo = messageAction.photo) == null || photo.video_sizes.isEmpty()) ? false : true;
    }

    public boolean isVideoCall() {
        TLRPC.MessageAction messageAction = this.messageOwner.action;
        if ((messageAction instanceof TLRPC.TL_messageActionPhoneCall) && messageAction.video) {
            return true;
        }
        return (messageAction instanceof TLRPC.TL_messageActionConferenceCall) && messageAction.video;
    }

    public boolean isVideoStory() {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (media == null || (storyItem = media.storyItem) == null || (messageMedia = storyItem.media) == null) {
            return false;
        }
        return isVideoDocument(messageMedia.document);
    }

    public boolean isVoice() {
        return isVoiceMessage(this.messageOwner);
    }

    public boolean isVoiceOnce() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        return isVoice() && (message = this.messageOwner) != null && (messageMedia = message.media) != null && messageMedia.ttl_seconds == Integer.MAX_VALUE;
    }

    public boolean isVoiceTranscriptionOpen() {
        if (this.messageOwner == null) {
            return false;
        }
        if (!isVoice() && (!isRoundVideo() || !k21.l(this))) {
            return false;
        }
        TLRPC.Message message = this.messageOwner;
        if (!message.voiceTranscriptionOpen || message.voiceTranscription == null) {
            return false;
        }
        return message.voiceTranscriptionFinal || k21.k(this);
    }

    public boolean isVotedButResultsHiddenUntilClose() {
        if (this.type != 17) {
            return false;
        }
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (media instanceof TLRPC.TL_messageMediaPoll) {
            return isVotedButResultsHiddenUntilClose((TLRPC.TL_messageMediaPoll) media);
        }
        return false;
    }

    public boolean isWallpaper() {
        return (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && getMedia(this.messageOwner).webpage != null && "telegram_background".equals(getMedia(this.messageOwner).webpage.type);
    }

    public boolean isWallpaperAction() {
        if (this.type == 22) {
            return true;
        }
        TLRPC.Message message = this.messageOwner;
        return message != null && (message.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper);
    }

    public boolean isWallpaperForBoth() {
        TLRPC.Message message;
        if (!isWallpaperAction() || (message = this.messageOwner) == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        return (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) && ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).for_both;
    }

    public boolean isWebpage() {
        return getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage;
    }

    public boolean isWebpageDocument() {
        return (!(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) || getMedia(this.messageOwner).webpage.document == null || isGifDocument(getMedia(this.messageOwner).webpage.document)) ? false : true;
    }

    public boolean isWelcomeAnchored() {
        return isWelcomeAnchored(this.messageOwner);
    }

    public boolean isWelcomeMessage() {
        return isWelcomeMessage(this.messageOwner);
    }

    public boolean isYouTubeVideo() {
        return (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && getMedia(this.messageOwner).webpage != null && !TextUtils.isEmpty(getMedia(this.messageOwner).webpage.embed_url) && "YouTube".equals(getMedia(this.messageOwner).webpage.site_name);
    }

    public void loadAnimatedEmojiDocument() {
        if (this.emojiAnimatedSticker != null || this.emojiAnimatedStickerId == null || this.emojiAnimatedStickerLoading) {
            return;
        }
        this.emojiAnimatedStickerLoading = true;
        org.telegram.ui.Components.k5.h(this.currentAccount).b(this.emojiAnimatedStickerId.longValue(), new org.telegram.ui.Components.h5() { // from class: org.telegram.messenger.s9
            @Override // org.telegram.ui.Components.h5
            public final void a(TLRPC.Document document) {
                MessageObject.this.lambda$loadAnimatedEmojiDocument$1(document);
            }
        });
    }

    public void markPollVotesAsRead() {
        TLRPC.Message message = this.messageOwner;
        if (message != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                ((TLRPC.TL_messageMediaPoll) messageMedia).results.has_unread_votes = false;
            }
        }
    }

    public void markReactionsAsRead() {
        TLRPC.TL_messageReactions tL_messageReactions = this.messageOwner.reactions;
        if (tL_messageReactions == null || tL_messageReactions.recent_reactions == null) {
            return;
        }
        boolean z10 = false;
        for (int i10 = 0; i10 < this.messageOwner.reactions.recent_reactions.size(); i10++) {
            if (this.messageOwner.reactions.recent_reactions.get(i10).unread) {
                this.messageOwner.reactions.recent_reactions.get(i10).unread = false;
                z10 = true;
            }
        }
        if (z10) {
            MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            TLRPC.Message message = this.messageOwner;
            messagesStorage.markMessageReactionsAsRead(message.dialog_id, getTopicId(this.currentAccount, message), this.messageOwner.id);
        }
    }

    public void measureInlineBotButtons() {
        TLRPC.TL_messageReactions tL_messageReactions;
        CharSequence replaceEmoji;
        if (this.isRestrictedMessage) {
            return;
        }
        this.wantedBotKeyboardWidth = 0;
        this.inlineKeyboardSource = null;
        BotInlineKeyboard.Builder builder = new BotInlineKeyboard.Builder();
        TLRPC.Message message = this.messageOwner;
        if (message != null) {
            TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
            if ((replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows != null) {
                builder.addBotKeyboard((TLRPC.TL_replyInlineMarkup) replyMarkup);
            }
        }
        if (hasSuggestionInlineButtons()) {
            builder.addSeparator();
            builder.addSuggestionKeyboard();
        }
        if (builder.isNotEmpty()) {
            this.inlineKeyboardSource = builder.build();
        }
        BotInlineKeyboard.Source source = this.inlineKeyboardSource;
        if ((source != null && !hasExtendedMedia()) || ((tL_messageReactions = this.messageOwner.reactions) != null && !tL_messageReactions.results.isEmpty())) {
            org.telegram.ui.ActionBar.g6.O();
            StringBuilder sb2 = this.botButtonsLayout;
            if (sb2 == null) {
                this.botButtonsLayout = new StringBuilder();
            } else {
                sb2.setLength(0);
            }
        }
        if (source == null || hasExtendedMedia()) {
            return;
        }
        for (int i10 = 0; i10 < source.getRowsCount(); i10++) {
            int columnsCount = source.getColumnsCount(i10);
            int i11 = 0;
            for (int i12 = 0; i12 < columnsCount; i12++) {
                BotInlineKeyboard.Button button = source.getButton(i10, i12);
                StringBuilder sb3 = this.botButtonsLayout;
                sb3.append(i10);
                sb3.append(i12);
                if ((button instanceof BotInlineKeyboard.ButtonBot) && hf.c.c(((BotInlineKeyboard.ButtonBot) button).button, TL_keyboard.TL_inlineButtonTypeBuy.class) && (getMedia(this.messageOwner).flags & 4) != 0) {
                    replaceEmoji = LocaleController.getString(R.string.PaymentReceipt);
                } else {
                    String text = button.getText();
                    if (text == null) {
                        text = "";
                    }
                    replaceEmoji = Emoji.replaceEmoji(text, org.telegram.ui.ActionBar.g6.w2.getFontMetricsInt(), false);
                }
                StaticLayout staticLayout = new StaticLayout(replaceEmoji, org.telegram.ui.ActionBar.g6.w2, AndroidUtilities.dp(2000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (staticLayout.getLineCount() > 0) {
                    float lineWidth = staticLayout.getLineWidth(0);
                    float lineLeft = staticLayout.getLineLeft(0);
                    if (lineLeft < lineWidth) {
                        lineWidth -= lineLeft;
                    }
                    if (button.getIconRes() != 0) {
                        lineWidth += AndroidUtilities.dp(36.0f);
                    }
                    if (button.getIconEmoji() != 0) {
                        lineWidth += AndroidUtilities.dp(36.0f);
                    }
                    i11 = y1.b(4.0f, (int) Math.ceil(lineWidth), i11);
                }
            }
            this.wantedBotKeyboardWidth = Math.max(this.wantedBotKeyboardWidth, ((columnsCount - 1) * AndroidUtilities.dp(5.0f)) + ((AndroidUtilities.dp(12.0f) + i11) * columnsCount));
        }
    }

    public float measureVoiceTranscriptionHeight() {
        if (getVoiceTranscription() == null) {
            return 0.0f;
        }
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(needDrawAvatar() ? 147.0f : 95.0f);
        return (Build.VERSION.SDK_INT >= 24 ? StaticLayout.Builder.obtain(r1, 0, r1.length(), org.telegram.ui.ActionBar.g6.o2, dp).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build() : new StaticLayout(r1, org.telegram.ui.ActionBar.g6.o2, dp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false)).getHeight();
    }

    public boolean mediaExists() {
        k61 k61Var;
        return (!hasVideoQualities() || (k61Var = this.highestQuality) == null) ? this.mediaExists : k61Var.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r0.signature_profiles != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x005f, code lost:
    
        if (getDialogId() == org.telegram.messenger.UserObject.VERIFY) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean needDrawAvatar() {
        boolean z10;
        TLRPC.MessageFwdHeader messageFwdHeader;
        if (this.type == 27) {
            return false;
        }
        if (this.isRepostPreview || this.isSaved || this.forceAvatar || this.customAvatarDrawable != null || this.searchType != 0) {
            return true;
        }
        if (getDialogId() < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-getDialogId()));
            if (isEphemeral() && ChatObject.isChannelAndNotMegaGroup(chat)) {
                return false;
            }
            if (chat != null) {
            }
            z10 = false;
        }
        return !isSponsored() && (isFromUser() || isFromGroup() || z10 || this.eventId != 0 || !((messageFwdHeader = this.messageOwner.fwd_from) == null || messageFwdHeader.saved_from_peer == null));
    }

    public boolean needDrawBluredPreview() {
        if (this.isRepostPreview) {
            return false;
        }
        if (hasExtendedMediaPreview()) {
            return true;
        }
        TLRPC.Message message = this.messageOwner;
        if (!(message instanceof TLRPC.TL_message_secret)) {
            return (message instanceof TLRPC.TL_message) && getMedia(message) != null && getMedia(this.messageOwner).ttl_seconds != 0 && ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument));
        }
        int max = Math.max(message.ttl, getMedia(message).ttl_seconds);
        return max > 0 && ((((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) || isVideo() || isGif()) && max <= 60) || isRoundVideo());
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0097, code lost:
    
        if (r1.channel_id == r0.channel_id) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean needDrawForwarded() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        if (this.type == 23 && !isExpiredStory()) {
            return true;
        }
        if (getDialogId() == UserObject.VERIFY) {
            return false;
        }
        if (!this.isSaved) {
            if (((this.messageOwner.flags & 4) != 0 || (getMedia(this) instanceof TLRPC.TL_messageMediaPaidMedia)) && (messageFwdHeader = this.messageOwner.fwd_from) != null && !messageFwdHeader.imported) {
                TLRPC.Peer peer = messageFwdHeader.saved_from_peer;
                if (peer != null) {
                    TLRPC.Peer peer2 = messageFwdHeader.from_id;
                    if (peer2 instanceof TLRPC.TL_peerChannel) {
                    }
                }
                if (UserConfig.getInstance(this.currentAccount).getClientUserId() != getDialogId()) {
                    return true;
                }
            }
            return false;
        }
        TLRPC.Message message = this.messageOwner;
        if (message != null && message.fwd_from != null) {
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            long savedDialogId = getSavedDialogId(clientUserId, this.messageOwner);
            long peerDialogId = DialogObject.getPeerDialogId(this.messageOwner.fwd_from.saved_from_peer);
            if (peerDialogId >= 0) {
                peerDialogId = DialogObject.getPeerDialogId(this.messageOwner.fwd_from.from_id);
            }
            if (peerDialogId == 0) {
                return savedDialogId >= 0 && savedDialogId != UserObject.ANONYMOUS;
            }
            if (savedDialogId != peerDialogId && peerDialogId != clientUserId) {
                return true;
            }
        }
        return false;
    }

    public boolean needDrawShareButton() {
        int i10;
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        if (this.isRepostPreview || this.sideMenuEnabled || getDialogId() == UserObject.VERIFY) {
            return false;
        }
        if (this.isSaved) {
            long j10 = UserConfig.getInstance(this.currentAccount).clientUserId;
            long savedDialogId = getSavedDialogId(j10, this.messageOwner);
            if (savedDialogId == j10 || savedDialogId == UserObject.ANONYMOUS || (message = this.messageOwner) == null || (messageFwdHeader = message.fwd_from) == null) {
                return false;
            }
            return (messageFwdHeader.from_id == null && messageFwdHeader.saved_from_id == null) ? false : true;
        }
        if (this.type == 27 || isSponsored() || this.hasCode || this.preview || this.scheduled || this.eventId != 0) {
            return false;
        }
        if (this.searchType == 2) {
            return true;
        }
        TLRPC.Message message2 = this.messageOwner;
        if (message2.noforwards) {
            return false;
        }
        if (message2.fwd_from != null && !isOutOwner() && this.messageOwner.fwd_from.saved_from_peer != null && getDialogId() == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            return true;
        }
        int i11 = this.type;
        if (i11 != 13 && i11 != 15 && i11 != 19) {
            TLRPC.MessageFwdHeader messageFwdHeader2 = this.messageOwner.fwd_from;
            if (messageFwdHeader2 != null && (messageFwdHeader2.from_id instanceof TLRPC.TL_peerChannel) && !isOutOwner()) {
                return true;
            }
            if (isFromUser()) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.from_id.user_id));
                if (user != null && user.bot && ("reviews_bot".equals(UserObject.getPublicUsername(user)) || "ReviewInsightsBot".equals(UserObject.getPublicUsername(user)))) {
                    return true;
                }
                if ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaEmpty) || getMedia(this.messageOwner) == null || ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && !(getMedia(this.messageOwner).webpage instanceof TLRPC.TL_webPage))) {
                    return false;
                }
                if (user != null && user.bot && !hasExtendedMedia()) {
                    return true;
                }
                if (!isOut()) {
                    if ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame) || (((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaInvoice) && !hasExtendedMedia()) || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage))) {
                        return true;
                    }
                    TLRPC.Peer peer = this.messageOwner.peer_id;
                    TLRPC.Chat chat = null;
                    if (peer != null) {
                        long j11 = peer.channel_id;
                        if (j11 != 0) {
                            chat = getChat(null, null, j11);
                        }
                    }
                    return ChatObject.isChannel(chat) && chat.megagroup && ChatObject.isPublic(chat) && !(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaContact) && !(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGeo);
                }
            } else {
                TLRPC.Message message3 = this.messageOwner;
                if ((message3.from_id instanceof TLRPC.TL_peerChannel) || message3.post) {
                    if ((getMedia(message3) instanceof TLRPC.TL_messageMediaWebPage) && !isOutOwner()) {
                        return true;
                    }
                    if (isSupergroup()) {
                        return false;
                    }
                    TLRPC.Message message4 = this.messageOwner;
                    if (message4.peer_id.channel_id != 0 && ((message4.via_bot_id == 0 && message4.reply_to == null) || ((i10 = this.type) != 13 && i10 != 15))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean needResendWhenEdit() {
        return (!ChatObject.isMonoForum(this.currentAccount, getDialogId()) || getFromChatId() == UserConfig.getInstance(this.currentAccount).getClientUserId() || isOutOwner()) ? false : true;
    }

    public MessageSuggestionParams obtainSuggestionOffer() {
        TLRPC.Message message = this.messageOwner;
        if (message == null) {
            return null;
        }
        TLRPC.SuggestedPost suggestedPost = message.suggested_post;
        if (suggestedPost != null) {
            return MessageSuggestionParams.of(suggestedPost);
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
            return MessageSuggestionParams.of((TLRPC.TL_messageActionSuggestedPostApproval) messageAction);
        }
        return null;
    }

    public MessageSuggestionParams obtainSuggestionOfferFromReply() {
        MessageObject messageObject = this.replyMessageObject;
        if (messageObject != null) {
            return messageObject.obtainSuggestionOffer();
        }
        return null;
    }

    public boolean probablyRingtone() {
        if (!isVoiceOnce() && getDocument() != null && cf.d.i.contains(getDocument().mime_type) && getDocument().size < MessagesController.getInstance(this.currentAccount).ringtoneSizeMax * 2) {
            for (int i10 = 0; i10 < getDocument().attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = getDocument().attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && documentAttribute.duration < 5.0d) {
                    return true;
                }
            }
        }
        return false;
    }

    public Spannable replaceAnimatedEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        return replaceAnimatedEmoji(charSequence, getEntities(), fontMetricsInt, false);
    }

    public void replaceEmojiToLottieFrame(CharSequence charSequence, int[] iArr) {
        boolean z10;
        CharSequence charSequence2;
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannable.getSpans(0, spannable.length(), Emoji.EmojiSpan.class);
            org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.t5.class);
            if (emojiSpanArr != null) {
                if (((iArr == null ? 0 : iArr[0]) - emojiSpanArr.length) - (t5VarArr == null ? 0 : t5VarArr.length) > 0) {
                    return;
                }
                for (int i10 = 0; i10 < emojiSpanArr.length; i10++) {
                    String str = emojiSpanArr[i10].emoji;
                    if (Emoji.endsWithRightArrow(str)) {
                        z10 = true;
                        charSequence2 = str.subSequence(0, str.length() - 2);
                    } else {
                        z10 = false;
                        charSequence2 = str;
                    }
                    TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(this.currentAccount).getEmojiAnimatedSticker(charSequence2);
                    if (emojiAnimatedSticker != null) {
                        int spanStart = spannable.getSpanStart(emojiSpanArr[i10]);
                        int spanEnd = spannable.getSpanEnd(emojiSpanArr[i10]);
                        spannable.removeSpan(emojiSpanArr[i10]);
                        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(emojiAnimatedSticker, emojiSpanArr[i10].fontMetrics);
                        t5Var.standard = true;
                        t5Var.invert = z10;
                        spannable.setSpan(t5Var, spanStart, spanEnd, 33);
                    }
                }
            }
        }
    }

    public CharSequence replaceWithLink(CharSequence charSequence, String str, ArrayList<Long> arrayList, AbstractMap<Long, TLRPC.User> abstractMap, a0.h hVar) {
        if (TextUtils.indexOf(charSequence, str) < 0) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User user = abstractMap != null ? abstractMap.get(arrayList.get(i10)) : hVar != null ? (TLRPC.User) hVar.f(arrayList.get(i10).longValue()) : null;
            if (user == null) {
                user = MessagesController.getInstance(this.currentAccount).getUser(arrayList.get(i10));
            }
            if (user != null) {
                String userName = UserObject.getUserName(user);
                int length = spannableStringBuilder.length();
                if (spannableStringBuilder.length() != 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                spannableStringBuilder.append((CharSequence) userName);
                spannableStringBuilder.setSpan(new s41("" + user.id), length, userName.length() + length, 33);
            }
        }
        return TextUtils.replace(charSequence, new String[]{str}, new CharSequence[]{spannableStringBuilder});
    }

    public void resetLayout() {
        this.layoutCreated = false;
    }

    public void resetPlayingProgress() {
        this.audioProgress = 0.0f;
        this.audioProgressSec = 0;
        this.bufferedProgress = 0.0f;
    }

    public boolean selectReaction(ig.q0 q0Var, boolean z10, boolean z11) {
        int i10;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.Message message = this.messageOwner;
        if (message.reactions == null) {
            message.reactions = new TLRPC.TL_messageReactions();
            TLRPC.Message message2 = this.messageOwner;
            message2.reactions.reactions_as_tags = getDialogId(message2) == UserConfig.getInstance(this.currentAccount).getClientUserId();
            this.messageOwner.reactions.can_see_list = isFromGroup() || isFromUser();
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.ReactionCount reactionCount = null;
        int i11 = 0;
        for (int i12 = 0; i12 < this.messageOwner.reactions.results.size(); i12++) {
            TLRPC.ReactionCount reactionCount2 = this.messageOwner.reactions.results.get(i12);
            if (reactionCount2.chosen && !(reactionCount2.reaction instanceof TLRPC.TL_reactionPaid)) {
                arrayList.add(reactionCount2);
                int i13 = reactionCount2.chosen_order;
                if (i13 > i11) {
                    i11 = i13;
                }
            }
            TLRPC.Reaction reaction = this.messageOwner.reactions.results.get(i12).reaction;
            if (reaction instanceof TLRPC.TL_reactionEmoji) {
                String str = q0Var.f;
                if (str != null) {
                    if (((TLRPC.TL_reactionEmoji) reaction).emoticon.equals(str)) {
                        reactionCount = this.messageOwner.reactions.results.get(i12);
                    }
                }
            }
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j10 = q0Var.g;
                if (j10 != 0 && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == j10) {
                    reactionCount = this.messageOwner.reactions.results.get(i12);
                }
            }
        }
        if (!arrayList.isEmpty() && arrayList.contains(reactionCount) && z10) {
            return true;
        }
        int maxUserReactionsCount = MessagesController.getInstance(this.currentAccount).getMaxUserReactionsCount();
        if (!arrayList.isEmpty() && arrayList.contains(reactionCount)) {
            if (reactionCount != null) {
                reactionCount.chosen = false;
                int i14 = reactionCount.count - 1;
                reactionCount.count = i14;
                if (i14 <= 0) {
                    this.messageOwner.reactions.results.remove(reactionCount);
                }
            }
            if (this.messageOwner.reactions.can_see_list) {
                int i15 = 0;
                while (i15 < this.messageOwner.reactions.recent_reactions.size()) {
                    if (getPeerId(this.messageOwner.reactions.recent_reactions.get(i15).peer_id) == UserConfig.getInstance(this.currentAccount).getClientUserId() && ig.s0.c(this.messageOwner.reactions.recent_reactions.get(i15).reaction, q0Var)) {
                        this.messageOwner.reactions.recent_reactions.remove(i15);
                        i15--;
                    }
                    i15++;
                }
            }
            this.reactionsChanged = true;
            return false;
        }
        while (!arrayList.isEmpty() && arrayList.size() >= maxUserReactionsCount) {
            int i16 = 0;
            for (int i17 = 1; i17 < arrayList.size(); i17++) {
                if (!(((TLRPC.ReactionCount) arrayList.get(i17)).reaction instanceof TLRPC.TL_reactionPaid) && ((TLRPC.ReactionCount) arrayList.get(i17)).chosen_order < ((TLRPC.ReactionCount) arrayList.get(i16)).chosen_order) {
                    i16 = i17;
                }
            }
            TLRPC.ReactionCount reactionCount3 = (TLRPC.ReactionCount) arrayList.get(i16);
            reactionCount3.chosen = false;
            int i18 = reactionCount3.count - 1;
            reactionCount3.count = i18;
            if (i18 <= 0) {
                this.messageOwner.reactions.results.remove(reactionCount3);
            }
            arrayList.remove(reactionCount3);
            if (this.messageOwner.reactions.can_see_list) {
                int i19 = 0;
                while (i19 < this.messageOwner.reactions.recent_reactions.size()) {
                    if (getPeerId(this.messageOwner.reactions.recent_reactions.get(i19).peer_id) == UserConfig.getInstance(this.currentAccount).getClientUserId() && ig.s0.c(this.messageOwner.reactions.recent_reactions.get(i19).reaction, q0Var)) {
                        this.messageOwner.reactions.recent_reactions.remove(i19);
                        i19--;
                    }
                    i19++;
                }
            }
        }
        if (reactionCount == null) {
            int chatMaxUniqReactions = MessagesController.getInstance(this.currentAccount).getChatMaxUniqReactions(getDialogId());
            TLRPC.Message message3 = this.messageOwner;
            if (message3 == null || (tL_messageReactions = message3.reactions) == null) {
                i10 = 0;
            } else {
                ArrayList<TLRPC.ReactionCount> arrayList2 = tL_messageReactions.results;
                int size = arrayList2.size();
                i10 = 0;
                int i20 = 0;
                while (i20 < size) {
                    TLRPC.ReactionCount reactionCount4 = arrayList2.get(i20);
                    i20++;
                    if (!(reactionCount4.reaction instanceof TLRPC.TL_reactionPaid)) {
                        i10++;
                    }
                }
            }
            if (i10 + 1 > chatMaxUniqReactions) {
                return false;
            }
            reactionCount = new TLRPC.TL_reactionCount();
            reactionCount.reaction = q0Var.g();
            this.messageOwner.reactions.results.add(reactionCount);
        }
        reactionCount.chosen = true;
        reactionCount.count++;
        reactionCount.chosen_order = i11 + 1;
        TLRPC.Message message4 = this.messageOwner;
        if (message4.reactions.can_see_list || (message4.dialog_id > 0 && maxUserReactionsCount > 1)) {
            TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
            TLRPC.Message message5 = this.messageOwner;
            if (!message5.isThreadMessage || message5.fwd_from == null) {
                tL_messagePeerReaction.peer_id = MessagesController.getInstance(this.currentAccount).getSendAsSelectedPeer(getDialogId());
            } else {
                tL_messagePeerReaction.peer_id = MessagesController.getInstance(this.currentAccount).getSendAsSelectedPeer(getFromChatId());
            }
            this.messageOwner.reactions.recent_reactions.add(0, tL_messagePeerReaction);
            if (q0Var.f != null) {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                tL_messagePeerReaction.reaction = tL_reactionEmoji;
                tL_reactionEmoji.emoticon = q0Var.f;
            } else {
                TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                tL_messagePeerReaction.reaction = tL_reactionCustomEmoji;
                tL_reactionCustomEmoji.document_id = q0Var.g;
            }
        }
        this.reactionsChanged = true;
        return true;
    }

    public void setContentIsRead() {
        this.messageOwner.media_unread = false;
    }

    public void setIsRead() {
        this.messageOwner.unread = false;
    }

    public void setMyPaidReactionDialogId(long j10) {
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        TLRPC.Message message = this.messageOwner;
        if (message == null || (tL_messageReactions = message.reactions) == null || (arrayList = tL_messageReactions.top_reactors) == null) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.MessageReactor messageReactor = arrayList.get(i10);
            i10++;
            TLRPC.MessageReactor messageReactor2 = messageReactor;
            if (messageReactor2 != null && messageReactor2.my) {
                boolean z10 = j10 == UserObject.ANONYMOUS;
                messageReactor2.anonymous = z10;
                if (z10) {
                    messageReactor2.flags &= -9;
                    messageReactor2.peer_id = null;
                } else {
                    messageReactor2.flags |= 8;
                    messageReactor2.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(j10);
                }
            }
        }
    }

    public void setQuery(String str) {
        setQuery(str, true);
    }

    public void setType() {
        int i10;
        int i11 = this.type;
        this.type = MediaDataController.MAX_STYLE_RUNS_COUNT;
        this.isRoundVideoCached = 0;
        if (isSponsored()) {
            this.type = 0;
        } else {
            if (this.channelJoined) {
                this.contentType = 0;
                this.type = 27;
                this.channelJoinedExpanded = MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("c" + getDialogId() + "_rec", true);
            } else {
                TLRPC.Message message = this.messageOwner;
                if (!(message instanceof TLRPC.TL_message) && !(message instanceof TLRPC.TL_messageForwarded_old2)) {
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = this.currentEvent;
                    if (tL_channelAdminLogEvent != null) {
                        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                            TLRPC.TL_channelAdminLogEventActionChangeWallpaper tL_channelAdminLogEventActionChangeWallpaper = (TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction;
                            this.contentType = 1;
                            TLRPC.WallPaper wallPaper = tL_channelAdminLogEventActionChangeWallpaper.new_value;
                            if ((wallPaper instanceof TLRPC.TL_wallPaperNoFile) && wallPaper.id == 0 && wallPaper.settings == null) {
                                this.type = 10;
                            } else {
                                this.type = 22;
                                ArrayList<TLRPC.PhotoSize> arrayList = new ArrayList<>();
                                this.photoThumbs = arrayList;
                                TLRPC.Document document = tL_channelAdminLogEventActionChangeWallpaper.new_value.document;
                                if (document != null) {
                                    arrayList.addAll(document.thumbs);
                                    this.photoThumbsObject = tL_channelAdminLogEventActionChangeWallpaper.new_value.document;
                                }
                            }
                        }
                    }
                    if (message instanceof TLRPC.TL_messageService) {
                        TLRPC.MessageAction messageAction = message.action;
                        if ((messageAction instanceof TLRPC.TL_messageActionChangeCreator) || (messageAction instanceof TLRPC.TL_messageActionNewCreatorPending) || (messageAction instanceof TLRPC.TL_messageActionManagedBotCreated)) {
                            this.contentType = 1;
                            this.type = 10;
                        } else if (messageAction instanceof TLRPC.TL_messageActionSetSameChatWallPaper) {
                            this.contentType = 1;
                            this.type = 10;
                        } else if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                            this.contentType = 1;
                            this.type = 22;
                            TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) messageAction;
                            ArrayList<TLRPC.PhotoSize> arrayList2 = new ArrayList<>();
                            this.photoThumbs = arrayList2;
                            TLRPC.Document document2 = tL_messageActionSetChatWallPaper.wallpaper.document;
                            if (document2 != null) {
                                arrayList2.addAll(document2.thumbs);
                                this.photoThumbsObject = tL_messageActionSetChatWallPaper.wallpaper.document;
                            }
                        } else if (messageAction instanceof TLRPC.TL_messageActionSuggestProfilePhoto) {
                            this.contentType = 1;
                            this.type = 21;
                            ArrayList<TLRPC.PhotoSize> arrayList3 = new ArrayList<>();
                            this.photoThumbs = arrayList3;
                            arrayList3.addAll(this.messageOwner.action.photo.sizes);
                            this.photoThumbsObject = this.messageOwner.action.photo;
                        } else if (messageAction instanceof TLRPC.TL_messageActionLoginUnknownLocation) {
                            this.type = 0;
                        } else if ((messageAction instanceof TLRPC.TL_messageActionGiftCode) && ((TLRPC.TL_messageActionGiftCode) messageAction).boost_peer != null) {
                            this.contentType = 1;
                            this.type = 25;
                        } else if ((messageAction instanceof TLRPC.TL_messageActionGiftPremium) || (messageAction instanceof TLRPC.TL_messageActionGiftCode)) {
                            this.contentType = 1;
                            this.type = 18;
                        } else if ((messageAction instanceof TLRPC.TL_messageActionGiftStars) || (messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionPrizeStars) || (((messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) && ((TLRPC.TL_messageActionStarGiftUnique) messageAction).refunded) || (messageAction instanceof TLRPC.TL_messageActionGiftTon))) {
                            this.contentType = 1;
                            this.type = 30;
                        } else if ((messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) || (messageAction instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                            this.contentType = 1;
                            this.type = 11;
                        } else if (messageAction instanceof TLRPC.TL_messageEncryptedAction) {
                            TLRPC.DecryptedMessageAction decryptedMessageAction = messageAction.encryptedAction;
                            if ((decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) || (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) {
                                this.contentType = 1;
                                this.type = 10;
                            } else {
                                this.contentType = -1;
                                this.type = -1;
                            }
                        } else if (messageAction instanceof TLRPC.TL_messageActionHistoryClear) {
                            this.contentType = -1;
                            this.type = -1;
                        } else if ((messageAction instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
                            this.type = 16;
                        } else if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && (((TLRPC.TL_messageActionSetChatTheme) messageAction).theme instanceof TLRPC.TL_chatThemeUniqueGift)) {
                            this.type = 31;
                            this.contentType = 1;
                        } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                            this.type = 33;
                            this.contentType = 1;
                        } else if ((messageAction instanceof TLRPC.TL_messageActionChangeCommunity) && ((TLRPC.TL_messageActionChangeCommunity) messageAction).community_id != 0) {
                            this.type = 37;
                            this.contentType = 1;
                        } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftPurchaseOfferDeclined) {
                            this.type = 34;
                            this.contentType = 1;
                        } else if (messageAction instanceof TLRPC.TL_messageActionSuggestBirthday) {
                            this.type = 32;
                            this.contentType = 1;
                        } else if (messageAction instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                            this.type = 35;
                            this.contentType = 1;
                        } else {
                            this.contentType = 1;
                            this.type = 10;
                        }
                    }
                } else if (getMedia(message) instanceof TLRPC.TL_messageMediaUnsupported) {
                    this.contentType = 10;
                    this.type = 38;
                } else if (this.isRestrictedMessage) {
                    this.type = 0;
                } else {
                    TLRPC.Message message2 = this.messageOwner;
                    if (message2.rich_message != null) {
                        this.type = 36;
                    } else if (this.emojiAnimatedSticker == null && this.emojiAnimatedStickerId == null) {
                        if (message2.media instanceof TLRPC.TL_messageMediaPaidMedia) {
                            this.type = 29;
                        } else if (isMediaEmpty(false) && !isDice() && !isSponsored() && this.emojiOnlyCount >= 1 && !this.hasUnwrappedEmoji && this.messageOwner != null && !hasNonEmojiEntities()) {
                            this.type = 19;
                        } else if (isMediaEmpty()) {
                            this.type = 0;
                            if (TextUtils.isEmpty(this.messageText) && this.eventId == 0) {
                                this.messageText = "";
                            }
                        } else if (hasExtendedMediaPreview()) {
                            this.type = 20;
                        } else if (getMedia(this.messageOwner).ttl_seconds != 0 && ((getMedia(this.messageOwner).photo instanceof TLRPC.TL_photoEmpty) || (getDocument() instanceof TLRPC.TL_documentEmpty) || (((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument) && getDocument() == null) || this.forceExpired))) {
                            this.contentType = 1;
                            this.type = 10;
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGiveaway) {
                            this.type = 26;
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGiveawayResults) {
                            this.type = 28;
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDice) {
                            this.type = 15;
                            if (getMedia(this.messageOwner).document == null) {
                                getMedia(this.messageOwner).document = new TLRPC.TL_document();
                                getMedia(this.messageOwner).document.file_reference = new byte[0];
                                getMedia(this.messageOwner).document.mime_type = "application/x-tgsdice";
                                getMedia(this.messageOwner).document.dc_id = TLObject.FLAG_31;
                                getMedia(this.messageOwner).document.id = -2147483648L;
                                TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                                tL_documentAttributeImageSize.w = 512;
                                tL_documentAttributeImageSize.h = 512;
                                getMedia(this.messageOwner).document.attributes.add(tL_documentAttributeImageSize);
                            }
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) {
                            this.type = isVideo() ? 3 : 1;
                        } else if ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGeo) || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaVenue) || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGeoLive)) {
                            this.type = 4;
                        } else if (isRoundVideo()) {
                            this.type = 5;
                        } else if (isVideo()) {
                            this.type = 3;
                        } else if (isVoice()) {
                            this.type = 2;
                        } else if (isMusic()) {
                            this.type = 14;
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaContact) {
                            this.type = 12;
                        } else if ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPoll) || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaToDo)) {
                            this.type = 17;
                            this.checkedVotes = new ArrayList<>();
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaUnsupported) {
                            this.type = 0;
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument) {
                            TLRPC.Document document3 = getDocument();
                            if (document3 == null || document3.mime_type == null) {
                                this.type = 9;
                            } else if (isGifDocument(document3, hasValidGroupId())) {
                                this.type = 8;
                            } else if (isSticker()) {
                                this.type = 13;
                            } else if (isAnimatedSticker()) {
                                this.type = 15;
                            } else {
                                this.type = 9;
                            }
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame) {
                            this.type = 0;
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaInvoice) {
                            this.type = 0;
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaStory) {
                            int i12 = getMedia(this.messageOwner).via_mention ? 24 : 23;
                            this.type = i12;
                            if (i12 == 24) {
                                this.contentType = 1;
                            }
                        }
                    } else if (isSticker()) {
                        this.type = 13;
                    } else {
                        this.type = 15;
                    }
                }
            }
        }
        if (i11 == 1000 || i11 == (i10 = this.type) || i10 == 19) {
            return;
        }
        updateMessageText(MessagesController.getInstance(this.currentAccount).getUsers(), MessagesController.getInstance(this.currentAccount).getChats(), null, null);
        generateThumbs(false);
    }

    public boolean shouldAnimateSending() {
        if (!this.wasJustSent) {
            return false;
        }
        if (this.type == 5 || isVoice()) {
            return true;
        }
        if (!isAnyKindOfSticker() || this.sendAnimationData == null) {
            return (this.messageText == null || this.sendAnimationData == null) ? false : true;
        }
        return true;
    }

    public boolean shouldDrawReactions() {
        return !this.isRepostPreview;
    }

    public boolean shouldDrawReactionsInLayout() {
        return true;
    }

    public boolean shouldDrawWithoutBackground() {
        if (isSponsored()) {
            return false;
        }
        int i10 = this.type;
        return i10 == 13 || i10 == 15 || i10 == 5 || i10 == 19 || isExpiredStory();
    }

    public void spoilLoginCode() {
        TLRPC.Message message;
        if (this.spoiledLoginCode || this.messageText == null || (message = this.messageOwner) == null || message.entities == null) {
            return;
        }
        TLRPC.Peer peer = message.from_id;
        if (peer instanceof TLRPC.TL_peerUser) {
            long j10 = peer.user_id;
            if (j10 == 777000 || j10 == UserObject.VERIFY) {
                if (loginCodePattern == null) {
                    loginCodePattern = Pattern.compile("[\\d\\-]{5,8}");
                }
                try {
                    Matcher matcher = loginCodePattern.matcher(this.messageText);
                    if (matcher.find()) {
                        TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = new TLRPC.TL_messageEntitySpoiler();
                        tL_messageEntitySpoiler.offset = matcher.start();
                        tL_messageEntitySpoiler.length = matcher.end() - tL_messageEntitySpoiler.offset;
                        this.messageOwner.entities.add(tL_messageEntitySpoiler);
                    }
                } catch (Exception e9) {
                    FileLog.e((Throwable) e9, false);
                }
                this.spoiledLoginCode = true;
            }
        }
    }

    public int textHeight() {
        RichMessageLayout richMessageLayout = this.richLayout;
        if (richMessageLayout != null) {
            return richMessageLayout.getHeight();
        }
        if (this.textLayoutBlocks == null) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.textLayoutBlocks.size(); i11++) {
            i10 += this.textLayoutBlocks.get(i11).height() + this.textLayoutBlocks.get(i11).padTop + this.textLayoutBlocks.get(i11).padBottom;
        }
        return i10;
    }

    public int textHeightCached() {
        RichMessageLayout richMessageLayout = this.richLayout;
        if (richMessageLayout != null) {
            return richMessageLayout.getHeight();
        }
        Integer num = this.cachedTextHeight;
        if (num != null) {
            return num.intValue();
        }
        if (this.textLayoutBlocks == null) {
            this.cachedTextHeight = 0;
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.textLayoutBlocks.size(); i11++) {
            i10 += this.textLayoutBlocks.get(i11).heightCollapsed() + this.textLayoutBlocks.get(i11).padTop + this.textLayoutBlocks.get(i11).padBottom;
        }
        this.cachedTextHeight = Integer.valueOf(i10);
        return i10;
    }

    public void toggleChannelRecommendations() {
        expandChannelRecommendations(!this.channelJoinedExpanded);
    }

    public void updateMessageText() {
        updateMessageText(MessagesController.getInstance(this.currentAccount).getUsers(), MessagesController.getInstance(this.currentAccount).getChats(), null, null);
    }

    public void updateQualitiesCached(boolean z10) {
        ArrayList<i61> arrayList = this.videoQualities;
        if (arrayList == null) {
            this.cachedQuality = null;
            hasVideoQualities(z10);
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            i61 i61Var = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = i61Var.d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList2.get(i11);
                i11++;
                ((k61) obj).e(z10);
            }
        }
        this.highestQuality = m61.w(this.videoQualities);
        this.thumbQuality = m61.x(this.videoQualities);
        this.cachedQuality = m61.l(this.videoQualities);
    }

    public boolean updateSideMenuEnabled(boolean z10) {
        if (this.sideMenuEnabled == z10) {
            return false;
        }
        this.sideMenuEnabled = z10;
        generateLayout(null);
        return true;
    }

    public boolean updateTranslation() {
        return updateTranslation(false);
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public static class GroupedMessages {
        public boolean captionAbove;
        public MessageObject captionMessage;
        public long groupId;
        public boolean hasCaption;
        public boolean hasSibling;
        public boolean isDocuments;
        public boolean reversed;
        public ArrayList<MessageObject> messages = new ArrayList<>();
        public ArrayList<GroupedMessagePosition> posArray = new ArrayList<>();
        public HashMap<MessageObject, GroupedMessagePosition> positions = new HashMap<>();
        public a0.h positionsArray = new a0.h();
        public int cachedWidthForCaption = -1;
        private int maxSizeWidth = 800;
        public final TransitionParams transitionParams = new TransitionParams();

        /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
        public static class TransitionParams {
            public boolean backgroundChangeBounds;
            public int bottom;
            public float captionEnterProgress = 1.0f;
            public org.telegram.ui.Cells.s1 cell;
            public boolean drawBackgroundForDeletedItems;
            public boolean drawCaptionLayout;
            public boolean isNewGroup;
            public int left;
            public float offsetBottom;
            public float offsetLeft;
            public float offsetRight;
            public float offsetTop;
            public boolean pinnedBotton;
            public boolean pinnedTop;
            public int right;
            public int top;

            public void reset() {
                this.captionEnterProgress = 1.0f;
                this.offsetBottom = 0.0f;
                this.offsetTop = 0.0f;
                this.offsetRight = 0.0f;
                this.offsetLeft = 0.0f;
                this.backgroundChangeBounds = false;
            }
        }

        private float multiHeight(float[] fArr, int i10, int i11) {
            float f10 = 0.0f;
            while (i10 < i11) {
                f10 += fArr[i10];
                i10++;
            }
            return this.maxSizeWidth / f10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:318:0x07e2, code lost:
        
            if (r6[2] > r6[3]) goto L247;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
        
            if ((org.telegram.messenger.MessageObject.getMedia(r13.messageOwner) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) == false) goto L41;
         */
        /* JADX WARN: Removed duplicated region for block: B:113:0x08a1  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:307:0x07f7  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x014b  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0067  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void calculate() {
            int i10;
            int i11;
            int i12;
            int i13;
            float f10;
            int i14;
            float f11;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            float f12;
            int i22;
            int i23;
            byte b10;
            boolean z10;
            MessageObject messageObject;
            TLRPC.Message message;
            float f13;
            float f14;
            this.posArray.clear();
            this.positions.clear();
            this.positionsArray.b();
            this.captionMessage = null;
            this.maxSizeWidth = 800;
            int size = this.messages.size();
            boolean z11 = true;
            if (size == 1) {
                this.captionMessage = this.messages.get(0);
                return;
            }
            if (size < 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            this.hasSibling = false;
            this.hasCaption = false;
            this.captionAbove = false;
            int i24 = this.reversed ? size - 1 : 0;
            boolean z12 = false;
            float f15 = 1.0f;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = true;
            while (true) {
                if (this.reversed) {
                    if (i24 < 0) {
                        break;
                    }
                    messageObject = this.messages.get(i24);
                    if (i24 == (!this.reversed ? size - 1 : 0)) {
                        messageObject.isOutOwnerCached = null;
                        z14 = messageObject.isOutOwner();
                        if (!z14) {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            TLRPC.MessageFwdHeader messageFwdHeader = message2.fwd_from;
                            if (messageFwdHeader == null || messageFwdHeader.saved_from_peer == null) {
                                if (message2.from_id instanceof TLRPC.TL_peerUser) {
                                    TLRPC.Peer peer = message2.peer_id;
                                    if (peer.channel_id == 0) {
                                        if (peer.chat_id == 0) {
                                            if (!(MessageObject.getMedia(message2) instanceof TLRPC.TL_messageMediaGame)) {
                                            }
                                        }
                                    }
                                }
                            }
                            z12 = true;
                            if (!messageObject.isMusic() || messageObject.isDocument()) {
                                this.isDocuments = z11;
                            }
                        }
                        z12 = false;
                        if (!messageObject.isMusic()) {
                        }
                        this.isDocuments = z11;
                    }
                    message = messageObject.messageOwner;
                    if (message != null && message.invert_media) {
                        this.captionAbove = z11;
                    }
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                    GroupedMessagePosition groupedMessagePosition = new GroupedMessagePosition();
                    groupedMessagePosition.last = this.reversed ? i24 == size + (-1) : i24 == 0;
                    f13 = closestPhotoSizeWithSize != null ? 1.0f : closestPhotoSizeWithSize.w / closestPhotoSizeWithSize.h;
                    groupedMessagePosition.aspectRatio = f13;
                    if (f13 <= 1.2f) {
                        sb2.append("w");
                    } else if (f13 < 0.8f) {
                        sb2.append("n");
                    } else {
                        sb2.append("q");
                    }
                    f14 = groupedMessagePosition.aspectRatio;
                    f15 += f14;
                    if (f14 > 2.0f) {
                        z13 = true;
                    }
                    this.positions.put(messageObject, groupedMessagePosition);
                    this.positionsArray.k(groupedMessagePosition, messageObject.getId());
                    this.posArray.add(groupedMessagePosition);
                    if (messageObject.caption != null) {
                        if (z15 && this.captionMessage == null) {
                            this.captionMessage = messageObject;
                            z15 = false;
                        } else if (!this.isDocuments) {
                            this.captionMessage = null;
                        }
                        this.hasCaption = true;
                    }
                    i24 = !this.reversed ? i24 - 1 : i24 + 1;
                    z11 = true;
                } else {
                    if (i24 >= size) {
                        break;
                    }
                    messageObject = this.messages.get(i24);
                    if (i24 == (!this.reversed ? size - 1 : 0)) {
                    }
                    message = messageObject.messageOwner;
                    if (message != null) {
                        this.captionAbove = z11;
                    }
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                    GroupedMessagePosition groupedMessagePosition2 = new GroupedMessagePosition();
                    groupedMessagePosition2.last = this.reversed ? i24 == size + (-1) : i24 == 0;
                    if (closestPhotoSizeWithSize2 != null) {
                    }
                    groupedMessagePosition2.aspectRatio = f13;
                    if (f13 <= 1.2f) {
                    }
                    f14 = groupedMessagePosition2.aspectRatio;
                    f15 += f14;
                    if (f14 > 2.0f) {
                    }
                    this.positions.put(messageObject, groupedMessagePosition2);
                    this.positionsArray.k(groupedMessagePosition2, messageObject.getId());
                    this.posArray.add(groupedMessagePosition2);
                    if (messageObject.caption != null) {
                    }
                    if (!this.reversed) {
                    }
                    z11 = true;
                }
            }
            if (this.isDocuments) {
                for (int i25 = 0; i25 < size; i25++) {
                    GroupedMessagePosition groupedMessagePosition3 = this.posArray.get(i25);
                    groupedMessagePosition3.flags = 3;
                    if (i25 == 0) {
                        groupedMessagePosition3.flags = 3 | 4;
                        b10 = 0;
                        groupedMessagePosition3.last = false;
                        z10 = true;
                    } else {
                        b10 = 0;
                        if (i25 == size - 1) {
                            groupedMessagePosition3.flags = 3 | 8;
                            z10 = true;
                            groupedMessagePosition3.last = true;
                        } else {
                            z10 = true;
                            groupedMessagePosition3.last = false;
                        }
                    }
                    groupedMessagePosition3.edge = z10;
                    groupedMessagePosition3.aspectRatio = 1.0f;
                    groupedMessagePosition3.minX = b10;
                    groupedMessagePosition3.maxX = b10;
                    byte b11 = (byte) i25;
                    groupedMessagePosition3.minY = b11;
                    groupedMessagePosition3.maxY = b11;
                    groupedMessagePosition3.spanSize = MediaDataController.MAX_STYLE_RUNS_COUNT;
                    groupedMessagePosition3.pw = this.maxSizeWidth;
                    groupedMessagePosition3.ph = 100.0f;
                }
                return;
            }
            if (z12) {
                this.maxSizeWidth -= 50;
                i10 = MediaDataController.MAX_LINKS_COUNT;
            } else {
                i10 = 200;
            }
            int dp = AndroidUtilities.dp(120.0f);
            float dp2 = AndroidUtilities.dp(120.0f);
            Point point = AndroidUtilities.displaySize;
            int min = (int) (dp2 / (Math.min(point.x, point.y) / this.maxSizeWidth));
            float dp3 = AndroidUtilities.dp(40.0f);
            Point point2 = AndroidUtilities.displaySize;
            float min2 = Math.min(point2.x, point2.y);
            int i26 = this.maxSizeWidth;
            int i27 = (int) (dp3 / (min2 / i26));
            float f16 = i26 / 814.0f;
            float f17 = f15 / size;
            float dp4 = AndroidUtilities.dp(100.0f) / 814.0f;
            if (size != 1) {
                if (z13 || !(size == 2 || size == 3 || size == 4)) {
                    int size2 = this.posArray.size();
                    float[] fArr = new float[size2];
                    for (int i28 = 0; i28 < size; i28++) {
                        if (f17 > 1.1f) {
                            fArr[i28] = Math.max(1.0f, this.posArray.get(i28).aspectRatio);
                        } else {
                            fArr[i28] = Math.min(1.0f, this.posArray.get(i28).aspectRatio);
                        }
                        fArr[i28] = Math.max(0.66667f, Math.min(1.7f, fArr[i28]));
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i29 = 1; i29 < size2; i29++) {
                        int i30 = size2 - i29;
                        if (i29 <= 3 && i30 <= 3) {
                            arrayList.add(new MessageGroupedLayoutAttempt(i29, i30, multiHeight(fArr, 0, i29), multiHeight(fArr, i29, size2)));
                        }
                    }
                    int i31 = 1;
                    while (i31 < size2 - 1) {
                        int i32 = 1;
                        while (true) {
                            int i33 = size2 - i31;
                            if (i32 < i33) {
                                int i34 = i33 - i32;
                                if (i31 <= 3) {
                                    if (i32 <= (f17 < 0.85f ? 4 : 3) && i34 <= 3) {
                                        int i35 = i31 + i32;
                                        i18 = i31;
                                        i19 = i32;
                                        arrayList.add(new MessageGroupedLayoutAttempt(i18, i19, i34, multiHeight(fArr, 0, i31), multiHeight(fArr, i31, i35), multiHeight(fArr, i35, size2)));
                                        i32 = i19 + 1;
                                        i31 = i18;
                                    }
                                }
                                i18 = i31;
                                i19 = i32;
                                i32 = i19 + 1;
                                i31 = i18;
                            }
                        }
                        i31++;
                    }
                    int i36 = 1;
                    while (i36 < size2 - 2) {
                        int i37 = 1;
                        while (true) {
                            int i38 = size2 - i36;
                            if (i37 < i38) {
                                int i39 = 1;
                                while (true) {
                                    int i40 = i38 - i37;
                                    if (i39 < i40) {
                                        int i41 = i40 - i39;
                                        if (i36 > 3 || i37 > 3 || i39 > 3 || i41 > 3) {
                                            i15 = i36;
                                            i16 = i37;
                                            i17 = i39;
                                        } else {
                                            int i42 = i36 + i37;
                                            int i43 = i42 + i39;
                                            i15 = i36;
                                            i16 = i37;
                                            i17 = i39;
                                            arrayList.add(new MessageGroupedLayoutAttempt(i15, i16, i17, i41, multiHeight(fArr, 0, i36), multiHeight(fArr, i36, i42), multiHeight(fArr, i42, i43), multiHeight(fArr, i43, size2)));
                                        }
                                        i39 = i17 + 1;
                                        i36 = i15;
                                        i37 = i16;
                                    }
                                }
                                i37++;
                            }
                        }
                        i36++;
                    }
                    float f18 = (this.maxSizeWidth / 3) * 4;
                    int i44 = 0;
                    MessageGroupedLayoutAttempt messageGroupedLayoutAttempt = null;
                    float f19 = 0.0f;
                    while (i44 < arrayList.size()) {
                        MessageGroupedLayoutAttempt messageGroupedLayoutAttempt2 = (MessageGroupedLayoutAttempt) arrayList.get(i44);
                        int i45 = 0;
                        float f20 = Float.MAX_VALUE;
                        float f21 = 0.0f;
                        while (true) {
                            float[] fArr2 = messageGroupedLayoutAttempt2.heights;
                            f10 = f18;
                            if (i45 >= fArr2.length) {
                                break;
                            }
                            float f22 = fArr2[i45];
                            f21 += f22;
                            if (f22 < f20) {
                                f20 = f22;
                            }
                            i45++;
                            f18 = f10;
                        }
                        float abs = Math.abs(f21 - f10);
                        int[] iArr = messageGroupedLayoutAttempt2.lineCounts;
                        if (iArr.length > 1) {
                            int i46 = iArr[0];
                            int i47 = iArr[1];
                            if (i46 <= i47) {
                                i14 = i10;
                                if (iArr.length <= 2 || i47 <= iArr[2]) {
                                    if (iArr.length > 3) {
                                    }
                                }
                            } else {
                                i14 = i10;
                            }
                            f11 = abs * 1.2f;
                            if (f20 < min) {
                                f11 *= 1.5f;
                            }
                            if (messageGroupedLayoutAttempt != null || f11 < f19) {
                                f19 = f11;
                                messageGroupedLayoutAttempt = messageGroupedLayoutAttempt2;
                            }
                            i44++;
                            f18 = f10;
                            i10 = i14;
                        } else {
                            i14 = i10;
                        }
                        f11 = abs;
                        if (f20 < min) {
                        }
                        if (messageGroupedLayoutAttempt != null) {
                        }
                        f19 = f11;
                        messageGroupedLayoutAttempt = messageGroupedLayoutAttempt2;
                        i44++;
                        f18 = f10;
                        i10 = i14;
                    }
                    i11 = i10;
                    if (messageGroupedLayoutAttempt == null) {
                        return;
                    }
                    int i48 = 0;
                    i12 = 0;
                    int i49 = 0;
                    while (true) {
                        int[] iArr2 = messageGroupedLayoutAttempt.lineCounts;
                        if (i49 >= iArr2.length) {
                            break;
                        }
                        int i50 = iArr2[i49];
                        float f23 = messageGroupedLayoutAttempt.heights[i49];
                        int i51 = this.maxSizeWidth;
                        int i52 = i50 - 1;
                        i12 = Math.max(i12, i52);
                        int i53 = i51;
                        int i54 = 0;
                        GroupedMessagePosition groupedMessagePosition4 = null;
                        while (i54 < i50) {
                            int i55 = (int) (fArr[i48] * f23);
                            i53 -= i55;
                            int i56 = i12;
                            GroupedMessagePosition groupedMessagePosition5 = this.posArray.get(i48);
                            int i57 = i49 == 0 ? 4 : 0;
                            int i58 = i48;
                            if (i49 == messageGroupedLayoutAttempt.lineCounts.length - 1) {
                                i57 |= 8;
                            }
                            if (i54 == 0) {
                                i57 |= 1;
                                if (z14) {
                                    groupedMessagePosition4 = groupedMessagePosition5;
                                }
                            }
                            if (i54 == i52) {
                                i57 |= 2;
                                if (!z14) {
                                    i13 = i57;
                                    groupedMessagePosition4 = groupedMessagePosition5;
                                    int i59 = i54;
                                    groupedMessagePosition5.set(i59, i54, i49, i49, i55, Math.max(dp4, f23 / 814.0f), i13);
                                    i48 = i58 + 1;
                                    i54 = i59 + 1;
                                    i12 = i56;
                                }
                            }
                            i13 = i57;
                            int i592 = i54;
                            groupedMessagePosition5.set(i592, i54, i49, i49, i55, Math.max(dp4, f23 / 814.0f), i13);
                            i48 = i58 + 1;
                            i54 = i592 + 1;
                            i12 = i56;
                        }
                        groupedMessagePosition4.pw += i53;
                        groupedMessagePosition4.spanSize += i53;
                        i49++;
                        i48 = i48;
                    }
                } else if (size == 2) {
                    GroupedMessagePosition groupedMessagePosition6 = this.posArray.get(0);
                    GroupedMessagePosition groupedMessagePosition7 = this.posArray.get(1);
                    String sb3 = sb2.toString();
                    if (sb3.equals("ww")) {
                        i21 = min;
                        f12 = 0.4f;
                        if (f17 > f16 * 1.4d) {
                            float f24 = groupedMessagePosition6.aspectRatio;
                            float f25 = groupedMessagePosition7.aspectRatio;
                            if (f24 - f25 < 0.2d) {
                                int i60 = this.maxSizeWidth;
                                float round = Math.round(Math.min(i60 / f24, Math.min(i60 / f25, 407.0f))) / 814.0f;
                                groupedMessagePosition6.set(0, 0, 0, 0, this.maxSizeWidth, round, 7);
                                groupedMessagePosition7.set(0, 0, 1, 1, this.maxSizeWidth, round, 11);
                                i20 = 0;
                                i11 = i10;
                                i12 = i20;
                            }
                        }
                    } else {
                        i21 = min;
                        f12 = 0.4f;
                    }
                    if (sb3.equals("ww") || sb3.equals("qq")) {
                        int i61 = this.maxSizeWidth / 2;
                        float f26 = i61;
                        float round2 = Math.round(Math.min(f26 / groupedMessagePosition6.aspectRatio, Math.min(f26 / groupedMessagePosition7.aspectRatio, 814.0f))) / 814.0f;
                        groupedMessagePosition6.set(0, 0, 0, 0, i61, round2, 13);
                        groupedMessagePosition7.set(1, 1, 0, 0, i61, round2, 14);
                    } else {
                        int i62 = this.maxSizeWidth;
                        float f27 = groupedMessagePosition6.aspectRatio;
                        int max = (int) Math.max(i62 * f12, Math.round((i62 / f27) / ((1.0f / groupedMessagePosition7.aspectRatio) + (1.0f / f27))));
                        int i63 = this.maxSizeWidth - max;
                        int i64 = i21;
                        if (i63 < i64) {
                            max -= i64 - i63;
                            i22 = i64;
                        } else {
                            i22 = i63;
                        }
                        float min3 = Math.min(814.0f, Math.round(Math.min(i22 / groupedMessagePosition6.aspectRatio, max / groupedMessagePosition7.aspectRatio))) / 814.0f;
                        groupedMessagePosition6.set(0, 0, 0, 0, i22, min3, 13);
                        groupedMessagePosition7.set(1, 1, 0, 0, max, min3, 14);
                    }
                    i20 = 1;
                    i11 = i10;
                    i12 = i20;
                } else if (size == 3) {
                    GroupedMessagePosition groupedMessagePosition8 = this.posArray.get(0);
                    GroupedMessagePosition groupedMessagePosition9 = this.posArray.get(1);
                    GroupedMessagePosition groupedMessagePosition10 = this.posArray.get(2);
                    if (sb2.charAt(0) == 'n') {
                        float f28 = groupedMessagePosition9.aspectRatio;
                        float min4 = Math.min(407.0f, Math.round((this.maxSizeWidth * f28) / (groupedMessagePosition10.aspectRatio + f28)));
                        int max2 = (int) Math.max(min, Math.min(this.maxSizeWidth * 0.5f, Math.round(Math.min(groupedMessagePosition10.aspectRatio * min4, groupedMessagePosition9.aspectRatio * r14))));
                        int round3 = Math.round(Math.min((groupedMessagePosition8.aspectRatio * 814.0f) + i27, this.maxSizeWidth - max2));
                        groupedMessagePosition8.set(0, 0, 0, 1, round3, 1.0f, 13);
                        float f29 = (814.0f - min4) / 814.0f;
                        groupedMessagePosition9.set(1, 1, 0, 0, max2, f29, 6);
                        float f30 = min4 / 814.0f;
                        groupedMessagePosition10.set(0, 1, 1, 1, max2, f30, 10);
                        int i65 = this.maxSizeWidth;
                        groupedMessagePosition10.spanSize = i65;
                        groupedMessagePosition8.siblingHeights = new float[]{f30, f29};
                        if (z14) {
                            groupedMessagePosition8.spanSize = i65 - max2;
                        } else {
                            groupedMessagePosition9.spanSize = i65 - round3;
                            groupedMessagePosition10.leftSpanOffset = round3;
                        }
                        this.hasSibling = true;
                    } else {
                        float round4 = Math.round(Math.min(this.maxSizeWidth / groupedMessagePosition8.aspectRatio, 537.24005f)) / 814.0f;
                        groupedMessagePosition8.set(0, 1, 0, 0, this.maxSizeWidth, round4, 7);
                        int i66 = this.maxSizeWidth / 2;
                        float f31 = i66;
                        float min5 = Math.min(814.0f - round4, Math.round(Math.min(f31 / groupedMessagePosition9.aspectRatio, f31 / groupedMessagePosition10.aspectRatio))) / 814.0f;
                        float f32 = min5 < dp4 ? dp4 : min5;
                        groupedMessagePosition9.set(0, 0, 1, 1, i66, f32, 9);
                        groupedMessagePosition10.set(1, 1, 1, 1, i66, f32, 10);
                    }
                    i11 = i10;
                    i12 = 1;
                } else {
                    GroupedMessagePosition groupedMessagePosition11 = this.posArray.get(0);
                    GroupedMessagePosition groupedMessagePosition12 = this.posArray.get(1);
                    GroupedMessagePosition groupedMessagePosition13 = this.posArray.get(2);
                    GroupedMessagePosition groupedMessagePosition14 = this.posArray.get(3);
                    if (sb2.charAt(0) == 'w') {
                        float round5 = Math.round(Math.min(this.maxSizeWidth / groupedMessagePosition11.aspectRatio, 537.24005f)) / 814.0f;
                        groupedMessagePosition11.set(0, 2, 0, 0, this.maxSizeWidth, round5, 7);
                        float round6 = Math.round(this.maxSizeWidth / ((groupedMessagePosition12.aspectRatio + groupedMessagePosition13.aspectRatio) + groupedMessagePosition14.aspectRatio));
                        float f33 = min;
                        int max3 = (int) Math.max(f33, Math.min(this.maxSizeWidth * 0.4f, groupedMessagePosition12.aspectRatio * round6));
                        int max4 = (int) Math.max(Math.max(f33, this.maxSizeWidth * 0.33f), groupedMessagePosition14.aspectRatio * round6);
                        int i67 = (this.maxSizeWidth - max3) - max4;
                        if (i67 < AndroidUtilities.dp(58.0f)) {
                            int dp5 = AndroidUtilities.dp(58.0f) - i67;
                            i67 = AndroidUtilities.dp(58.0f);
                            int i68 = dp5 / 2;
                            max3 -= i68;
                            max4 -= dp5 - i68;
                        }
                        int i69 = max3;
                        float min6 = Math.min(814.0f - round5, round6) / 814.0f;
                        float f34 = min6 < dp4 ? dp4 : min6;
                        groupedMessagePosition12.set(0, 0, 1, 1, i69, f34, 9);
                        groupedMessagePosition13.set(1, 1, 1, 1, i67, f34, 8);
                        groupedMessagePosition14.set(2, 2, 1, 1, max4, f34, 10);
                        i20 = 2;
                        i11 = i10;
                        i12 = i20;
                    } else {
                        int max5 = Math.max(min, Math.round(814.0f / ((1.0f / groupedMessagePosition14.aspectRatio) + ((1.0f / groupedMessagePosition13.aspectRatio) + (1.0f / groupedMessagePosition12.aspectRatio)))));
                        float f35 = dp;
                        float f36 = max5;
                        float min7 = Math.min(0.33f, Math.max(f35, f36 / groupedMessagePosition12.aspectRatio) / 814.0f);
                        float min8 = Math.min(0.33f, Math.max(f35, f36 / groupedMessagePosition13.aspectRatio) / 814.0f);
                        float f37 = (1.0f - min7) - min8;
                        int round7 = Math.round(Math.min((groupedMessagePosition11.aspectRatio * 814.0f) + i27, this.maxSizeWidth - max5));
                        groupedMessagePosition11.set(0, 0, 0, 2, round7, min7 + min8 + f37, 13);
                        groupedMessagePosition12.set(1, 1, 0, 0, max5, min7, 6);
                        groupedMessagePosition13.set(0, 1, 1, 1, max5, min8, 2);
                        groupedMessagePosition13.spanSize = this.maxSizeWidth;
                        groupedMessagePosition14.set(0, 1, 2, 2, max5, f37, 10);
                        int i70 = this.maxSizeWidth;
                        groupedMessagePosition14.spanSize = i70;
                        if (z14) {
                            groupedMessagePosition11.spanSize = i70 - max5;
                        } else {
                            groupedMessagePosition12.spanSize = i70 - round7;
                            groupedMessagePosition13.leftSpanOffset = round7;
                            groupedMessagePosition14.leftSpanOffset = round7;
                        }
                        groupedMessagePosition11.siblingHeights = new float[]{min7, min8, f37};
                        this.hasSibling = true;
                        i20 = 1;
                        i11 = i10;
                        i12 = i20;
                    }
                }
                for (i23 = 0; i23 < size; i23++) {
                    GroupedMessagePosition groupedMessagePosition15 = this.posArray.get(i23);
                    if (z14) {
                        if (groupedMessagePosition15.minX == 0) {
                            groupedMessagePosition15.spanSize += i11;
                        }
                        if ((groupedMessagePosition15.flags & 2) != 0) {
                            groupedMessagePosition15.edge = true;
                        }
                    } else {
                        if (groupedMessagePosition15.maxX == i12 || (groupedMessagePosition15.flags & 2) != 0) {
                            groupedMessagePosition15.spanSize += i11;
                        }
                        if ((groupedMessagePosition15.flags & 1) != 0) {
                            groupedMessagePosition15.edge = true;
                        }
                    }
                    MessageObject messageObject2 = this.messages.get(i23);
                    if (!z14 && messageObject2.needDrawAvatarInternal()) {
                        if (groupedMessagePosition15.edge) {
                            int i71 = groupedMessagePosition15.spanSize;
                            if (i71 != 1000) {
                                groupedMessagePosition15.spanSize = i71 + 108;
                            }
                            groupedMessagePosition15.pw += 108;
                        } else {
                            if ((groupedMessagePosition15.flags & 2) != 0) {
                                int i72 = groupedMessagePosition15.spanSize;
                                if (i72 != 1000) {
                                    groupedMessagePosition15.spanSize = i72 - 108;
                                } else {
                                    int i73 = groupedMessagePosition15.leftSpanOffset;
                                    if (i73 != 0) {
                                        groupedMessagePosition15.leftSpanOffset = i73 + 108;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            GroupedMessagePosition groupedMessagePosition16 = this.posArray.get(0);
            int i74 = this.maxSizeWidth;
            float f38 = groupedMessagePosition16.aspectRatio;
            groupedMessagePosition16.set(0, 0, 0, 0, this.maxSizeWidth, Math.round(Math.min(i74 / f38, Math.min(i74 / f38, 407.0f))) / 814.0f, 15);
            i11 = i10;
            i12 = 0;
            while (i23 < size) {
            }
        }

        public boolean contains(int i10) {
            if (this.messages == null) {
                return false;
            }
            for (int i11 = 0; i11 < this.messages.size(); i11++) {
                MessageObject messageObject = this.messages.get(i11);
                if (messageObject != null && messageObject.getId() == i10) {
                    return true;
                }
            }
            return false;
        }

        public MessageObject findCaptionMessageObject() {
            if (!this.messages.isEmpty() && this.positions.isEmpty()) {
                calculate();
            }
            MessageObject messageObject = null;
            for (int i10 = 0; i10 < this.messages.size(); i10++) {
                MessageObject messageObject2 = this.messages.get(i10);
                if (!TextUtils.isEmpty(messageObject2.caption)) {
                    if (messageObject != null) {
                        return null;
                    }
                    messageObject = messageObject2;
                }
            }
            return messageObject;
        }

        public MessageObject findMessageWithFlags(int i10) {
            if (!this.messages.isEmpty() && this.positions.isEmpty()) {
                calculate();
            }
            for (int i11 = 0; i11 < this.messages.size(); i11++) {
                MessageObject messageObject = this.messages.get(i11);
                GroupedMessagePosition groupedMessagePosition = this.positions.get(messageObject);
                if (groupedMessagePosition != null && (groupedMessagePosition.flags & i10) == i10) {
                    return messageObject;
                }
            }
            return null;
        }

        public MessageObject findPrimaryMessageObject() {
            return findMessageWithFlags(this.reversed ? 10 : 5);
        }

        public int getMaxEditDate() {
            TLRPC.Message message;
            int i10 = 0;
            for (int i11 = 0; i11 < this.messages.size(); i11++) {
                MessageObject messageObject = this.messages.get(i11);
                if (messageObject != null && (message = messageObject.messageOwner) != null) {
                    i10 = Math.max(i10, message.edit_date);
                }
            }
            return i10;
        }

        public GroupedMessagePosition getPosition(MessageObject messageObject) {
            if (messageObject == null) {
                return null;
            }
            GroupedMessagePosition groupedMessagePosition = this.positions.get(messageObject);
            return groupedMessagePosition == null ? (GroupedMessagePosition) this.positionsArray.f(messageObject.getId()) : groupedMessagePosition;
        }

        /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
        public static class MessageGroupedLayoutAttempt {
            public float[] heights;
            public int[] lineCounts;

            public MessageGroupedLayoutAttempt(int i10, int i11, float f10, float f11) {
                this.lineCounts = new int[]{i10, i11};
                this.heights = new float[]{f10, f11};
            }

            public MessageGroupedLayoutAttempt(int i10, int i11, int i12, float f10, float f11, float f12) {
                this.lineCounts = new int[]{i10, i11, i12};
                this.heights = new float[]{f10, f11, f12};
            }

            public MessageGroupedLayoutAttempt(int i10, int i11, int i12, int i13, float f10, float f11, float f12, float f13) {
                this.lineCounts = new int[]{i10, i11, i12, i13};
                this.heights = new float[]{f10, f11, f12, f13};
            }
        }
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public static class TextLayoutBlocks {
        public boolean hasCode;
        public boolean hasCodeAtBottom;
        public boolean hasCodeAtTop;
        public boolean hasQuote;
        public boolean hasQuoteAtBottom;
        public boolean hasRtl;
        public boolean hasSingleCode;
        public boolean hasSingleQuote;
        public int lastLineWidth;
        public final CharSequence text;
        public final ArrayList<TextLayoutBlock> textLayoutBlocks = new ArrayList<>();
        public int textWidth;
        public float textXOffset;

        /* JADX WARN: Can't wrap try/catch for region: R(17:198|(3:199|200|201)|202|(1:204)(13:233|(1:235)|206|207|208|(1:210)(1:230)|211|212|(1:229)(1:216)|(3:219|220|(1:222))|227|228|226)|205|206|207|208|(0)(0)|211|212|(1:214)|229|(3:219|220|(0))|227|228|226) */
        /* JADX WARN: Can't wrap try/catch for region: R(44:104|(1:106)|107|(1:109)(1:342)|110|(1:112)(1:341)|113|(1:115)|(1:117)|(1:340)(1:122)|123|(2:125|(2:(1:323)|324)(1:128))(2:325|(7:327|(1:329)(1:339)|330|(1:332)(1:338)|333|(1:335)(1:337)|336))|129|(3:131|(1:133)(2:317|(1:319)(1:320))|134)(1:321)|135|(1:137)(1:(1:315)(27:316|139|(3:141|(1:294)(4:147|(1:149)(1:293)|150|151)|152)(3:295|(2:297|298)(6:299|300|301|(1:308)(1:305)|306|307)|268)|153|(1:159)|160|161|162|(1:166)|167|168|169|170|(1:172)|173|(1:175)|176|(3:178|(7:180|181|182|183|184|186|187)|193)|194|(6:196|(19:198|199|200|201|202|(1:204)(13:233|(1:235)|206|207|208|(1:210)(1:230)|211|212|(1:229)(1:216)|(3:219|220|(1:222))|227|228|226)|205|206|207|208|(0)(0)|211|212|(1:214)|229|(3:219|220|(0))|227|228|226)|238|239|(1:(1:242))(2:(1:270)|271)|243)(3:272|(5:274|(1:276)(1:283)|277|(1:279)(1:282)|280)(1:284)|281)|244|(3:246|(1:248)(1:250)|249)|251|(5:257|(1:259)(4:263|(1:265)|261|262)|260|261|262)|266|267|268))|138|139|(0)(0)|153|(3:155|157|159)|160|161|162|(2:164|166)|167|168|169|170|(0)|173|(0)|176|(0)|194|(0)(0)|244|(0)|251|(7:253|255|257|(0)(0)|260|261|262)|266|267|268|102) */
        /* JADX WARN: Code restructure failed: missing block: B:232:0x052b, code lost:
        
            r7 = 0.0f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:286:0x049e, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:287:0x049f, code lost:
        
            org.telegram.messenger.FileLog.e(r0);
            r0 = 0.0f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:289:0x0488, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:290:0x048c, code lost:
        
            if (r8 == 0) goto L244;
         */
        /* JADX WARN: Code restructure failed: missing block: B:291:0x048e, code lost:
        
            r32.textXOffset = 0.0f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:292:0x0491, code lost:
        
            org.telegram.messenger.FileLog.e(r0);
            r13 = 0.0f;
         */
        /* JADX WARN: Removed duplicated region for block: B:104:0x0259  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x0352  */
        /* JADX WARN: Removed duplicated region for block: B:172:0x04ad  */
        /* JADX WARN: Removed duplicated region for block: B:175:0x04b2  */
        /* JADX WARN: Removed duplicated region for block: B:178:0x04cc  */
        /* JADX WARN: Removed duplicated region for block: B:196:0x04f4  */
        /* JADX WARN: Removed duplicated region for block: B:210:0x0536  */
        /* JADX WARN: Removed duplicated region for block: B:222:0x057b  */
        /* JADX WARN: Removed duplicated region for block: B:230:0x053d  */
        /* JADX WARN: Removed duplicated region for block: B:246:0x0615  */
        /* JADX WARN: Removed duplicated region for block: B:259:0x0648  */
        /* JADX WARN: Removed duplicated region for block: B:263:0x0650  */
        /* JADX WARN: Removed duplicated region for block: B:272:0x05d1  */
        /* JADX WARN: Removed duplicated region for block: B:295:0x03c7  */
        /* JADX WARN: Removed duplicated region for block: B:347:0x020a  */
        /* JADX WARN: Removed duplicated region for block: B:359:0x01ea  */
        /* JADX WARN: Removed duplicated region for block: B:360:0x01e3  */
        /* JADX WARN: Removed duplicated region for block: B:361:0x01cd  */
        /* JADX WARN: Removed duplicated region for block: B:372:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x010e  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01c7  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x01e1  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01e8  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01fc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public TextLayoutBlocks(MessageObject messageObject, CharSequence charSequence, TextPaint textPaint, int i10) {
            int i11;
            int dp;
            StaticLayout makeStaticLayout;
            float f10;
            float f11;
            float f12;
            CharSequence charSequence2;
            int i12;
            int dp2;
            boolean z10;
            ArrayList arrayList;
            int i13;
            TextPaint textPaint2;
            int i14;
            int dp3;
            CharSequence charSequence3;
            boolean z11;
            ArrayList arrayList2;
            int lineCount;
            int i15;
            int ceil;
            StaticLayout staticLayout;
            int i16;
            int i17;
            pz0 pz0Var;
            int dp4;
            float f13;
            int i18;
            float f14;
            float f15;
            boolean z12;
            int i19;
            boolean z13;
            int dp5;
            int i20;
            float lineLeft;
            int i21;
            TLRPC.Message message;
            MessageObject messageObject2 = messageObject;
            CharSequence charSequence4 = charSequence;
            this.text = charSequence4;
            int i22 = 0;
            this.textWidth = 0;
            boolean z14 = (messageObject2 == null || (message = messageObject2.messageOwner) == null || !message.noforwards) ? false : true;
            if (messageObject2 != null && !z14) {
                z14 = MessagesController.getInstance(messageObject2.currentAccount).isPeerNoForwards(messageObject2.getDialogId());
            }
            boolean z15 = z14;
            boolean z16 = charSequence4 instanceof Spanned;
            this.hasCode = z16 && ((CodeHighlighting.Span[]) ((Spanned) charSequence4).getSpans(0, charSequence4.length(), CodeHighlighting.Span.class)).length > 0;
            this.hasQuote = z16 && ((gi0[]) ((Spanned) charSequence4).getSpans(0, charSequence4.length(), gi0.class)).length > 0;
            this.hasSingleQuote = false;
            this.hasSingleCode = false;
            if (z16) {
                Spanned spanned = (Spanned) charSequence4;
                hi0[] hi0VarArr = (hi0[]) spanned.getSpans(0, spanned.length(), hi0.class);
                for (hi0 hi0Var : hi0VarArr) {
                    hi0Var.b = false;
                }
                this.hasSingleQuote = hi0VarArr.length == 1 && spanned.getSpanStart(hi0VarArr[0]) == 0 && spanned.getSpanEnd(hi0VarArr[0]) == spanned.length();
                CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) spanned.getSpans(0, spanned.length(), CodeHighlighting.Span.class);
                this.hasSingleCode = spanArr.length == 1 && spanned.getSpanStart(spanArr[0]) == 0 && spanned.getSpanEnd(spanArr[0]) == spanned.length();
            }
            try {
                if (this.hasSingleQuote) {
                    dp = AndroidUtilities.dp(32.0f);
                } else {
                    if (!this.hasSingleCode) {
                        i11 = i10;
                        makeStaticLayout = MessageObject.makeStaticLayout(charSequence4, textPaint, i11, 1.0f, 0.0f, false);
                        if (messageObject2 != null && messageObject2.isRepostPreview) {
                            i21 = messageObject2.type == 0 ? messageObject2.hasValidGroupId() ? 7 : 12 : 22;
                            i21 = messageObject2.isWebpage() ? i21 - 8 : i21;
                            if (makeStaticLayout.getLineCount() > i21) {
                                String string = LocaleController.getString(R.string.ReadMore);
                                f12 = 32.0f;
                                f10 = 0.0f;
                                int ceil2 = (int) Math.ceil(textPaint.measureText("… " + string) + AndroidUtilities.dp(1.0f));
                                float f16 = 0.0f;
                                for (int i23 = 0; i23 < i21; i23++) {
                                    f16 = Math.max(f16, makeStaticLayout.getLineRight(i23));
                                }
                                f11 = 15.0f;
                                int i24 = i21 - 1;
                                int lineStart = makeStaticLayout.getLineStart(i24);
                                int lineEnd = makeStaticLayout.getLineEnd(i24) - 1;
                                while (lineEnd >= lineStart && makeStaticLayout.getPrimaryHorizontal(lineEnd) >= f16 - ceil2) {
                                    lineEnd--;
                                }
                                while (lineEnd >= lineStart && !Character.isWhitespace(charSequence4.charAt(lineEnd))) {
                                    lineEnd--;
                                }
                                SpannableStringBuilder append = new SpannableStringBuilder(charSequence4.subSequence(0, lineEnd)).append((CharSequence) "… ").append((CharSequence) string);
                                append.setSpan(new CharacterStyle() { // from class: org.telegram.messenger.MessageObject.TextLayoutBlocks.1
                                    @Override // android.text.style.CharacterStyle
                                    public void updateDrawState(TextPaint textPaint3) {
                                        textPaint3.setColor(org.telegram.ui.ActionBar.g6.o2.linkColor);
                                    }
                                }, append.length() - string.length(), append.length(), 33);
                                try {
                                    makeStaticLayout = MessageObject.makeStaticLayout(append, textPaint, i11, 1.0f, 0.0f, false);
                                    charSequence2 = append;
                                    if (this.hasSingleQuote) {
                                        dp2 = AndroidUtilities.dp(f12);
                                    } else {
                                        if (!this.hasSingleCode) {
                                            i12 = i11;
                                            int lineCount2 = makeStaticLayout.getLineCount();
                                            z10 = Build.VERSION.SDK_INT < 24;
                                            int i25 = 10;
                                            int ceil3 = !z10 ? 1 : (int) Math.ceil(lineCount2 / 10);
                                            arrayList = new ArrayList();
                                            if (!(charSequence2 instanceof Spanned) && (this.hasQuote || this.hasCode)) {
                                                MessageObject.cutIntoRanges(charSequence2, arrayList);
                                            } else if (!z10 || ceil3 == 1) {
                                                arrayList.add(new TextRange(0, makeStaticLayout.getText().length()));
                                            } else {
                                                int i26 = 0;
                                                int i27 = 0;
                                                while (i26 < ceil3) {
                                                    int min = Math.min(i25, lineCount2 - i27);
                                                    int lineStart2 = makeStaticLayout.getLineStart(i27);
                                                    int i28 = min + i27;
                                                    int lineEnd2 = makeStaticLayout.getLineEnd(i28 - 1);
                                                    if (lineEnd2 >= lineStart2) {
                                                        arrayList.add(new TextRange(lineStart2, lineEnd2));
                                                        i27 = i28;
                                                    }
                                                    i26++;
                                                    i25 = 10;
                                                }
                                            }
                                            int size = arrayList.size();
                                            this.hasCodeAtTop = false;
                                            this.hasCodeAtBottom = false;
                                            this.hasQuoteAtBottom = false;
                                            this.hasSingleQuote = false;
                                            int i29 = i11;
                                            i13 = 0;
                                            StaticLayout staticLayout2 = makeStaticLayout;
                                            CharSequence charSequence5 = charSequence2;
                                            while (i13 < arrayList.size()) {
                                                TextLayoutBlock textLayoutBlock = new TextLayoutBlock();
                                                TextRange textRange = (TextRange) arrayList.get(i13);
                                                textLayoutBlock.code = textRange.code;
                                                textLayoutBlock.quote = textRange.quote;
                                                boolean z17 = textRange.collapse;
                                                textLayoutBlock.quoteCollapse = z17;
                                                if (z17) {
                                                    textLayoutBlock.messageObject = messageObject2;
                                                }
                                                textLayoutBlock.index = i13;
                                                textLayoutBlock.start = textRange.start;
                                                textLayoutBlock.first = i13 == 0;
                                                boolean z18 = i13 == arrayList.size() + (-1);
                                                textLayoutBlock.last = z18;
                                                boolean z19 = textLayoutBlock.first;
                                                if (z19) {
                                                    this.hasCodeAtTop = textLayoutBlock.code;
                                                }
                                                if (z18) {
                                                    this.hasQuoteAtBottom = textLayoutBlock.quote;
                                                    this.hasCodeAtBottom = textLayoutBlock.code;
                                                }
                                                this.hasSingleQuote = z19 && z18 && textLayoutBlock.quote;
                                                if (textLayoutBlock.quote) {
                                                    if (z19 && z18) {
                                                        int dp6 = AndroidUtilities.dp(6.0f);
                                                        textLayoutBlock.padBottom = dp6;
                                                        textLayoutBlock.padTop = dp6;
                                                    } else {
                                                        textLayoutBlock.padTop = AndroidUtilities.dp(z19 ? 8.0f : 6.0f);
                                                        textLayoutBlock.padBottom = AndroidUtilities.dp(7.0f);
                                                    }
                                                } else if (textLayoutBlock.code) {
                                                    textLayoutBlock.layoutCode(textRange.language, textRange.end - textRange.start, z15);
                                                    textLayoutBlock.padTop = AndroidUtilities.dp(4.0f) + textLayoutBlock.languageHeight + (textLayoutBlock.first ? 0 : AndroidUtilities.dp(5.0f));
                                                    textLayoutBlock.padBottom = AndroidUtilities.dp(4.0f) + (textLayoutBlock.last ? 0 : AndroidUtilities.dp(7.0f)) + (textLayoutBlock.hasCodeCopyButton ? AndroidUtilities.dp(38.0f) : 0);
                                                }
                                                boolean z20 = textLayoutBlock.code;
                                                if (z20) {
                                                    int i30 = textRange.end - textRange.start;
                                                    textPaint2 = i30 > 220 ? org.telegram.ui.ActionBar.g6.r2 : i30 > 80 ? org.telegram.ui.ActionBar.g6.q2 : org.telegram.ui.ActionBar.g6.p2;
                                                } else {
                                                    textPaint2 = textPaint;
                                                }
                                                if (textLayoutBlock.quote) {
                                                    dp3 = AndroidUtilities.dp(f12);
                                                } else if (z20) {
                                                    dp3 = AndroidUtilities.dp(f11);
                                                } else {
                                                    i14 = i12;
                                                    if (size != 1) {
                                                        if (textLayoutBlock.code && !textLayoutBlock.quote && (staticLayout2.getText() instanceof Spannable)) {
                                                            SpannableString highlighted = !TextUtils.isEmpty(textRange.language) ? CodeHighlighting.getHighlighted(charSequence5.subSequence(textRange.start, textRange.end).toString(), textRange.language) : new SpannableString(charSequence5.subSequence(textRange.start, textRange.end));
                                                            textLayoutBlock.originalWidth = i14;
                                                            staticLayout2 = MessageObject.makeStaticLayout(highlighted, textPaint2, i14, 1.0f, 0.0f, false);
                                                            i29 = i14;
                                                        } else {
                                                            textLayoutBlock.originalWidth = i29;
                                                        }
                                                        textLayoutBlock.textLayout = staticLayout2;
                                                        textLayoutBlock.charactersOffset = i22;
                                                        textLayoutBlock.charactersEnd = staticLayout2.getText().length();
                                                        textLayoutBlock.height = staticLayout2.getHeight();
                                                        textLayoutBlock.collapsedHeight = (int) Math.min(textPaint.getTextSize() * 1.4f * 3.0f, textLayoutBlock.height);
                                                    } else {
                                                        int i31 = textRange.start;
                                                        int i32 = textRange.end;
                                                        if (i32 < i31) {
                                                            charSequence3 = charSequence5;
                                                            z11 = z15;
                                                            arrayList2 = arrayList;
                                                        } else {
                                                            textLayoutBlock.charactersOffset = i31;
                                                            textLayoutBlock.charactersEnd = i32;
                                                            try {
                                                                SpannableString valueOf = (!textLayoutBlock.code || textLayoutBlock.quote) ? SpannableString.valueOf(charSequence5.subSequence(i31, i32)) : CodeHighlighting.getHighlighted(charSequence5.subSequence(i31, i32).toString(), textRange.language);
                                                                textLayoutBlock.originalWidth = i14;
                                                                StaticLayout makeStaticLayout2 = MessageObject.makeStaticLayout(valueOf, textPaint2, i14, 1.0f, 0.0f, false);
                                                                textLayoutBlock.textLayout = makeStaticLayout2;
                                                                textLayoutBlock.height = makeStaticLayout2.getHeight();
                                                                textLayoutBlock.collapsedHeight = (int) Math.min(textPaint.getTextSize() * 1.4f * 3.0f, textLayoutBlock.height);
                                                            } catch (Exception e9) {
                                                                charSequence3 = charSequence5;
                                                                z11 = z15;
                                                                arrayList2 = arrayList;
                                                                FileLog.e(e9);
                                                            }
                                                        }
                                                        i13++;
                                                        arrayList = arrayList2;
                                                        charSequence5 = charSequence3;
                                                        z15 = z11;
                                                        f10 = 0.0f;
                                                        i22 = 0;
                                                    }
                                                    if (textLayoutBlock.code && (textLayoutBlock.textLayout.getText() instanceof Spannable) && TextUtils.isEmpty(textRange.language)) {
                                                        CodeHighlighting.highlight((Spannable) textLayoutBlock.textLayout.getText(), 0, textLayoutBlock.textLayout.getText().length(), textRange.language, 0, null, true);
                                                    }
                                                    this.textLayoutBlocks.add(textLayoutBlock);
                                                    lineCount = textLayoutBlock.textLayout.getLineCount();
                                                    lineLeft = textLayoutBlock.textLayout.getLineLeft(lineCount - 1);
                                                    if (i13 == 0 && lineLeft >= f10) {
                                                        this.textXOffset = lineLeft;
                                                    }
                                                    float f17 = lineLeft;
                                                    float f18 = textLayoutBlock.textLayout.getLineWidth(lineCount - 1);
                                                    int ceil4 = (int) Math.ceil(f18);
                                                    ceil4 = ceil4 > i12 + 80 ? i12 : ceil4;
                                                    i15 = size - 1;
                                                    if (i13 == i15) {
                                                        this.lastLineWidth = ceil4;
                                                    }
                                                    float f19 = ceil4;
                                                    charSequence3 = charSequence5;
                                                    z11 = z15;
                                                    arrayList2 = arrayList;
                                                    ceil = (int) Math.ceil(Math.max(0.0f, f17) + f19);
                                                    if (textLayoutBlock.quote) {
                                                        textLayoutBlock.maxRight = 0.0f;
                                                        int i33 = 0;
                                                        while (i33 < lineCount) {
                                                            try {
                                                                i20 = ceil4;
                                                                try {
                                                                    textLayoutBlock.maxRight = Math.max(textLayoutBlock.maxRight, textLayoutBlock.textLayout.getLineRight(i33));
                                                                } catch (Exception unused) {
                                                                    textLayoutBlock.maxRight = this.textWidth;
                                                                    i33++;
                                                                    ceil4 = i20;
                                                                }
                                                            } catch (Exception unused2) {
                                                                i20 = ceil4;
                                                            }
                                                            i33++;
                                                            ceil4 = i20;
                                                        }
                                                    }
                                                    int i34 = ceil4;
                                                    if (lineCount <= 1) {
                                                        staticLayout = staticLayout2;
                                                        int i35 = i34;
                                                        boolean z21 = false;
                                                        float f20 = 0.0f;
                                                        float f21 = 0.0f;
                                                        int i36 = 0;
                                                        int i37 = ceil;
                                                        while (i36 < lineCount) {
                                                            int i38 = i29;
                                                            try {
                                                                f13 = textLayoutBlock.textLayout.getLineWidth(i36);
                                                            } catch (Exception unused3) {
                                                                f13 = 0.0f;
                                                            }
                                                            if (textLayoutBlock.quote) {
                                                                dp5 = AndroidUtilities.dp(f12);
                                                            } else {
                                                                dp5 = textLayoutBlock.code ? AndroidUtilities.dp(f11) : dp5;
                                                                float f22 = textLayoutBlock.textLayout.getLineLeft(i36);
                                                                float f23 = f22;
                                                                if (f13 <= i12 + 20) {
                                                                    f15 = i12;
                                                                    i18 = lineCount;
                                                                    f14 = 0.0f;
                                                                } else {
                                                                    i18 = lineCount;
                                                                    f14 = f23;
                                                                    f15 = f13;
                                                                }
                                                                z12 = z21;
                                                                if (f14 <= 0.0f || textLayoutBlock.textLayout.getParagraphDirection(i36) == -1) {
                                                                    this.textXOffset = Math.min(this.textXOffset, f14);
                                                                    i19 = 1;
                                                                    textLayoutBlock.directionFlags = (byte) (textLayoutBlock.directionFlags | 1);
                                                                    this.hasRtl = true;
                                                                } else {
                                                                    textLayoutBlock.directionFlags = (byte) (textLayoutBlock.directionFlags | 2);
                                                                    i19 = 1;
                                                                }
                                                                if (!z12 && f14 == 0.0f) {
                                                                    try {
                                                                        if (textLayoutBlock.textLayout.getParagraphDirection(i36) == i19) {
                                                                            z12 = true;
                                                                        }
                                                                    } catch (Exception unused4) {
                                                                        z13 = true;
                                                                    }
                                                                }
                                                                z13 = z12;
                                                                float max = Math.max(f20, f15);
                                                                float f24 = f14 + f15;
                                                                f21 = Math.max(f21, f24);
                                                                i35 = Math.max(i35, (int) Math.ceil(f15));
                                                                i37 = Math.max(i37, (int) Math.ceil(f24));
                                                                i36++;
                                                                z21 = z13;
                                                                f20 = max;
                                                                i29 = i38;
                                                                lineCount = i18;
                                                            }
                                                            f13 += dp5;
                                                            float f222 = textLayoutBlock.textLayout.getLineLeft(i36);
                                                            float f232 = f222;
                                                            if (f13 <= i12 + 20) {
                                                            }
                                                            z12 = z21;
                                                            if (f14 <= 0.0f) {
                                                            }
                                                            this.textXOffset = Math.min(this.textXOffset, f14);
                                                            i19 = 1;
                                                            textLayoutBlock.directionFlags = (byte) (textLayoutBlock.directionFlags | 1);
                                                            this.hasRtl = true;
                                                            if (!z12) {
                                                                if (textLayoutBlock.textLayout.getParagraphDirection(i36) == i19) {
                                                                }
                                                            }
                                                            z13 = z12;
                                                            float max2 = Math.max(f20, f15);
                                                            float f242 = f14 + f15;
                                                            f21 = Math.max(f21, f242);
                                                            i35 = Math.max(i35, (int) Math.ceil(f15));
                                                            i37 = Math.max(i37, (int) Math.ceil(f242));
                                                            i36++;
                                                            z21 = z13;
                                                            f20 = max2;
                                                            i29 = i38;
                                                            lineCount = i18;
                                                        }
                                                        i16 = i29;
                                                        if (!z21) {
                                                            if (i13 == i15) {
                                                                this.lastLineWidth = i35;
                                                            }
                                                            f21 = f20;
                                                        } else if (i13 == i15) {
                                                            this.lastLineWidth = ceil;
                                                        }
                                                        this.textWidth = Math.max(this.textWidth, (int) Math.ceil(f21));
                                                        ceil = i37;
                                                    } else {
                                                        staticLayout = staticLayout2;
                                                        i16 = i29;
                                                        if (f17 > 0.0f) {
                                                            float min2 = Math.min(this.textXOffset, f17);
                                                            this.textXOffset = min2;
                                                            i17 = min2 == 0.0f ? (int) (f19 + f17) : i34;
                                                            this.hasRtl = size != 1;
                                                            textLayoutBlock.directionFlags = (byte) (textLayoutBlock.directionFlags | 1);
                                                        } else {
                                                            textLayoutBlock.directionFlags = (byte) (textLayoutBlock.directionFlags | 2);
                                                            i17 = i34;
                                                        }
                                                        this.textWidth = Math.max(this.textWidth, Math.min(i12, i17));
                                                    }
                                                    pz0Var = textLayoutBlock.languageLayout;
                                                    if (pz0Var != null) {
                                                        this.textWidth = (int) Math.max(this.textWidth, Math.min(pz0Var.c + AndroidUtilities.dp(f11), textLayoutBlock.textLayout == null ? 0.0f : r5.getWidth()));
                                                    }
                                                    messageObject2 = messageObject;
                                                    if (messageObject != null && !messageObject2.isSpoilersRevealed && !messageObject2.spoiledLoginCode) {
                                                        if (textLayoutBlock.quote) {
                                                            dp4 = textLayoutBlock.code ? AndroidUtilities.dp(f11) : dp4;
                                                            eh.k.b(null, textLayoutBlock.textLayout, -1, ceil, null, textLayoutBlock.spoilers);
                                                        } else {
                                                            dp4 = AndroidUtilities.dp(f12);
                                                        }
                                                        ceil -= dp4;
                                                        eh.k.b(null, textLayoutBlock.textLayout, -1, ceil, null, textLayoutBlock.spoilers);
                                                    }
                                                    staticLayout2 = staticLayout;
                                                    i29 = i16;
                                                    i13++;
                                                    arrayList = arrayList2;
                                                    charSequence5 = charSequence3;
                                                    z15 = z11;
                                                    f10 = 0.0f;
                                                    i22 = 0;
                                                }
                                                i14 = i12 - dp3;
                                                if (size != 1) {
                                                }
                                                if (textLayoutBlock.code) {
                                                    CodeHighlighting.highlight((Spannable) textLayoutBlock.textLayout.getText(), 0, textLayoutBlock.textLayout.getText().length(), textRange.language, 0, null, true);
                                                }
                                                this.textLayoutBlocks.add(textLayoutBlock);
                                                lineCount = textLayoutBlock.textLayout.getLineCount();
                                                lineLeft = textLayoutBlock.textLayout.getLineLeft(lineCount - 1);
                                                if (i13 == 0) {
                                                    this.textXOffset = lineLeft;
                                                }
                                                float f172 = lineLeft;
                                                float f182 = textLayoutBlock.textLayout.getLineWidth(lineCount - 1);
                                                int ceil42 = (int) Math.ceil(f182);
                                                if (ceil42 > i12 + 80) {
                                                }
                                                i15 = size - 1;
                                                if (i13 == i15) {
                                                }
                                                float f192 = ceil42;
                                                charSequence3 = charSequence5;
                                                z11 = z15;
                                                arrayList2 = arrayList;
                                                ceil = (int) Math.ceil(Math.max(0.0f, f172) + f192);
                                                if (textLayoutBlock.quote) {
                                                }
                                                int i342 = ceil42;
                                                if (lineCount <= 1) {
                                                }
                                                pz0Var = textLayoutBlock.languageLayout;
                                                if (pz0Var != null) {
                                                }
                                                messageObject2 = messageObject;
                                                if (messageObject != null) {
                                                    if (textLayoutBlock.quote) {
                                                    }
                                                    ceil -= dp4;
                                                    eh.k.b(null, textLayoutBlock.textLayout, -1, ceil, null, textLayoutBlock.spoilers);
                                                }
                                                staticLayout2 = staticLayout;
                                                i29 = i16;
                                                i13++;
                                                arrayList = arrayList2;
                                                charSequence5 = charSequence3;
                                                z15 = z11;
                                                f10 = 0.0f;
                                                i22 = 0;
                                            }
                                            return;
                                        }
                                        dp2 = AndroidUtilities.dp(f11);
                                    }
                                    i12 = dp2 + i11;
                                    int lineCount22 = makeStaticLayout.getLineCount();
                                    if (Build.VERSION.SDK_INT < 24) {
                                    }
                                    int i252 = 10;
                                    if (!z10) {
                                    }
                                    arrayList = new ArrayList();
                                    if (!(charSequence2 instanceof Spanned)) {
                                    }
                                    if (z10) {
                                    }
                                    arrayList.add(new TextRange(0, makeStaticLayout.getText().length()));
                                    int size2 = arrayList.size();
                                    this.hasCodeAtTop = false;
                                    this.hasCodeAtBottom = false;
                                    this.hasQuoteAtBottom = false;
                                    this.hasSingleQuote = false;
                                    int i292 = i11;
                                    i13 = 0;
                                    StaticLayout staticLayout22 = makeStaticLayout;
                                    CharSequence charSequence52 = charSequence2;
                                    while (i13 < arrayList.size()) {
                                    }
                                    return;
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                    return;
                                }
                            }
                        }
                        f10 = 0.0f;
                        f11 = 15.0f;
                        f12 = 32.0f;
                        charSequence2 = charSequence4;
                        if (this.hasSingleQuote) {
                        }
                        i12 = dp2 + i11;
                        int lineCount222 = makeStaticLayout.getLineCount();
                        if (Build.VERSION.SDK_INT < 24) {
                        }
                        int i2522 = 10;
                        if (!z10) {
                        }
                        arrayList = new ArrayList();
                        if (!(charSequence2 instanceof Spanned)) {
                        }
                        if (z10) {
                        }
                        arrayList.add(new TextRange(0, makeStaticLayout.getText().length()));
                        int size22 = arrayList.size();
                        this.hasCodeAtTop = false;
                        this.hasCodeAtBottom = false;
                        this.hasQuoteAtBottom = false;
                        this.hasSingleQuote = false;
                        int i2922 = i11;
                        i13 = 0;
                        StaticLayout staticLayout222 = makeStaticLayout;
                        CharSequence charSequence522 = charSequence2;
                        while (i13 < arrayList.size()) {
                        }
                        return;
                    }
                    dp = AndroidUtilities.dp(15.0f);
                }
                makeStaticLayout = MessageObject.makeStaticLayout(charSequence4, textPaint, i11, 1.0f, 0.0f, false);
                if (messageObject2 != null) {
                    if (messageObject2.type == 0) {
                    }
                    if (messageObject2.isWebpage()) {
                    }
                    if (makeStaticLayout.getLineCount() > i21) {
                    }
                }
                f10 = 0.0f;
                f11 = 15.0f;
                f12 = 32.0f;
                charSequence2 = charSequence4;
                if (this.hasSingleQuote) {
                }
                i12 = dp2 + i11;
                int lineCount2222 = makeStaticLayout.getLineCount();
                if (Build.VERSION.SDK_INT < 24) {
                }
                int i25222 = 10;
                if (!z10) {
                }
                arrayList = new ArrayList();
                if (!(charSequence2 instanceof Spanned)) {
                }
                if (z10) {
                }
                arrayList.add(new TextRange(0, makeStaticLayout.getText().length()));
                int size222 = arrayList.size();
                this.hasCodeAtTop = false;
                this.hasCodeAtBottom = false;
                this.hasQuoteAtBottom = false;
                this.hasSingleQuote = false;
                int i29222 = i11;
                i13 = 0;
                StaticLayout staticLayout2222 = makeStaticLayout;
                CharSequence charSequence5222 = charSequence2;
                while (i13 < arrayList.size()) {
                }
                return;
            } catch (Exception e11) {
                FileLog.e(e11);
                return;
            }
            i11 = i10 - dp;
        }

        public void bounceFrom(TextLayoutBlocks textLayoutBlocks) {
            if (textLayoutBlocks == null) {
                return;
            }
            for (int i10 = 0; i10 < Math.min(this.textLayoutBlocks.size(), textLayoutBlocks.textLayoutBlocks.size()); i10++) {
                this.textLayoutBlocks.get(i10).collapsedBounce = textLayoutBlocks.textLayoutBlocks.get(i10).collapsedBounce;
            }
        }

        public int textHeight() {
            int i10 = 0;
            for (int i11 = 0; i11 < this.textLayoutBlocks.size(); i11++) {
                i10 += this.textLayoutBlocks.get(i11).height() + this.textLayoutBlocks.get(i11).padTop + this.textLayoutBlocks.get(i11).padBottom;
            }
            return i10;
        }

        public int textHeight(org.telegram.ui.Cells.r1 r1Var) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.textLayoutBlocks.size(); i11++) {
                i10 += this.textLayoutBlocks.get(i11).height(r1Var) + this.textLayoutBlocks.get(i11).padTop + this.textLayoutBlocks.get(i11).padBottom;
            }
            return i10;
        }
    }

    public static void addLinks(boolean z10, CharSequence charSequence, boolean z11, boolean z12) {
        addLinks(z10, charSequence, z11, z12, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x014c, code lost:
    
        if (r12.user_id == org.telegram.messenger.UserConfig.getInstance(r10).getClientUserId()) goto L121;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean canEditMessage(int i10, TLRPC.Message message, TLRPC.Chat chat, boolean z10) {
        TLRPC.MessageAction messageAction;
        TLRPC.MessageMedia media;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights3;
        if (z10 && message.date < ConnectionsManager.getInstance(i10).getCurrentTime() - 60) {
            return false;
        }
        if ((chat == null || ((!chat.left && !chat.kicked) || (chat.megagroup && chat.has_link))) && message != null && message.peer_id != null && (((messageAction = message.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty)) && !isForwardedMessage(message) && message.via_bot_id == 0 && message.id >= 0 && (((media = getMedia(message)) == null || message.rich_message != null || (!isRoundVideoDocument(media.document) && !isStickerDocument(media.document) && !isAnimatedStickerDocument(media.document, true) && !isLocationMessage(message))) && !message.paid_suggested_post_stars && !message.paid_suggested_post_ton))) {
            TLRPC.Peer peer = message.from_id;
            if (peer instanceof TLRPC.TL_peerUser) {
                long j10 = peer.user_id;
                if (j10 == message.peer_id.user_id && j10 == UserConfig.getInstance(i10).getClientUserId() && !isLiveLocationMessage(message) && !(media instanceof TLRPC.TL_messageMediaContact)) {
                    return true;
                }
            }
            if (chat == null && message.peer_id.channel_id != 0 && (chat = MessagesController.getInstance(i10).getChat(Long.valueOf(message.peer_id.channel_id))) == null) {
                return false;
            }
            if (media != null && message.rich_message == null && !(media instanceof TLRPC.TL_messageMediaEmpty) && !(media instanceof TLRPC.TL_messageMediaPhoto) && !(media instanceof TLRPC.TL_messageMediaDocument) && !(media instanceof TLRPC.TL_messageMediaWebPage) && !(media instanceof TLRPC.TL_messageMediaPaidMedia) && !(media instanceof TLRPC.TL_messageMediaToDo)) {
                return false;
            }
            if (ChatObject.isChannel(chat) && !chat.megagroup && (chat.creator || ((tL_chatAdminRights3 = chat.admin_rights) != null && tL_chatAdminRights3.edit_messages))) {
                return true;
            }
            if (message.out && chat != null && chat.megagroup && (chat.creator || (((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.pin_messages) || ((tL_chatBannedRights = chat.default_banned_rights) != null && !tL_chatBannedRights.pin_messages)))) {
                return true;
            }
            if (!z10 && Math.abs(message.date - ConnectionsManager.getInstance(i10).getCurrentTime()) > MessagesController.getInstance(i10).maxEditTime) {
                return false;
            }
            if (message.peer_id.channel_id == 0) {
                if (!message.out) {
                    TLRPC.Peer peer2 = message.from_id;
                    if (peer2 instanceof TLRPC.TL_peerUser) {
                    }
                }
                return message.rich_message != null || (media instanceof TLRPC.TL_messageMediaPhoto) || !(!(media instanceof TLRPC.TL_messageMediaDocument) || isStickerMessage(message) || isAnimatedStickerMessage(message)) || (media instanceof TLRPC.TL_messageMediaEmpty) || (media instanceof TLRPC.TL_messageMediaWebPage) || (media instanceof TLRPC.TL_messageMediaPaidMedia) || (media instanceof TLRPC.TL_messageMediaToDo) || media == null;
            }
            if (((chat != null && chat.megagroup && message.out) || (chat != null && !chat.megagroup && ((chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && (tL_chatAdminRights.edit_messages || (message.out && tL_chatAdminRights.post_messages)))) && message.post))) && (message.rich_message != null || (media instanceof TLRPC.TL_messageMediaPhoto) || (((media instanceof TLRPC.TL_messageMediaDocument) && !isStickerMessage(message) && !isAnimatedStickerMessage(message)) || (media instanceof TLRPC.TL_messageMediaEmpty) || (media instanceof TLRPC.TL_messageMediaWebPage) || (media instanceof TLRPC.TL_messageMediaPaidMedia) || (media instanceof TLRPC.TL_messageMediaToDo) || media == null))) {
                return true;
            }
        }
        return false;
    }

    public static boolean canEditMessageAnytime(int i10, TLRPC.Message message, TLRPC.Chat chat) {
        TLRPC.MessageAction messageAction;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        if (message != null && message.peer_id != null && ((getMedia(message) == null || (!isRoundVideoDocument(getMedia(message).document) && !isStickerDocument(getMedia(message).document) && !isAnimatedStickerDocument(getMedia(message).document, true))) && (((messageAction = message.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty)) && !isForwardedMessage(message) && message.via_bot_id == 0 && message.id >= 0))) {
            TLRPC.Peer peer = message.from_id;
            if (peer instanceof TLRPC.TL_peerUser) {
                long j10 = peer.user_id;
                if (j10 == message.peer_id.user_id && j10 == UserConfig.getInstance(i10).getClientUserId() && !isLiveLocationMessage(message)) {
                    return true;
                }
            }
            if (chat == null && message.peer_id.channel_id != 0 && (chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(message.peer_id.channel_id))) == null) {
                return false;
            }
            if (ChatObject.isChannel(chat) && !chat.megagroup && (chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.edit_messages))) {
                return true;
            }
            if (message.out && chat != null && chat.megagroup && (chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.pin_messages) || ((tL_chatBannedRights = chat.default_banned_rights) != null && !tL_chatBannedRights.pin_messages)))) {
                return true;
            }
        }
        return false;
    }

    public static boolean canEditMessageScheduleTime(int i10, TLRPC.Message message, TLRPC.Chat chat) {
        if (message.video_processing_pending) {
            return false;
        }
        if (chat == null && message.peer_id.channel_id != 0 && (chat = MessagesController.getInstance(i10).getChat(Long.valueOf(message.peer_id.channel_id))) == null) {
            return false;
        }
        if (!ChatObject.isChannel(chat) || chat.megagroup || chat.creator) {
            return true;
        }
        TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
        return tL_chatAdminRights != null && (tL_chatAdminRights.edit_messages || message.out);
    }

    public static boolean canPreviewDocument(TLRPC.Document document) {
        String str;
        if (document != null && (str = document.mime_type) != null) {
            if ((isDocumentHasThumb(document) && (str.equalsIgnoreCase("image/png") || str.equalsIgnoreCase("image/jpg") || str.equalsIgnoreCase("image/jpeg"))) || (Build.VERSION.SDK_INT >= 26 && str.equalsIgnoreCase("image/heic"))) {
                for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                        TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = (TLRPC.TL_documentAttributeImageSize) documentAttribute;
                        return tL_documentAttributeImageSize.w < 6000 && tL_documentAttributeImageSize.h < 6000;
                    }
                }
            } else if (BuildVars.DEBUG_PRIVATE_VERSION) {
                String documentFileName = FileLoader.getDocumentFileName(document);
                if ((documentFileName.startsWith("tg_secret_sticker") && documentFileName.endsWith("json")) || documentFileName.endsWith(".svg")) {
                    return true;
                }
            }
        }
        return false;
    }

    private void checkEmojiOnly(Integer num) {
        TextPaint textPaint;
        if (num == null || num.intValue() < 1 || this.messageOwner == null || hasNonEmojiEntities()) {
            CharSequence charSequence = this.messageText;
            org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.t5.class);
            if (t5VarArr == null || t5VarArr.length <= 0) {
                this.totalAnimatedEmojiCount = 0;
                return;
            }
            this.totalAnimatedEmojiCount = t5VarArr.length;
            for (int i10 = 0; i10 < t5VarArr.length; i10++) {
                t5VarArr[i10].replaceFontMetrics(org.telegram.ui.ActionBar.g6.o2.getFontMetricsInt(), (int) (org.telegram.ui.ActionBar.g6.o2.getTextSize() + AndroidUtilities.dp(4.0f)), -1);
                t5VarArr[i10].full = false;
            }
            return;
        }
        CharSequence charSequence2 = this.messageText;
        Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) ((Spannable) charSequence2).getSpans(0, charSequence2.length(), Emoji.EmojiSpan.class);
        CharSequence charSequence3 = this.messageText;
        org.telegram.ui.Components.t5[] t5VarArr2 = (org.telegram.ui.Components.t5[]) ((Spannable) charSequence3).getSpans(0, charSequence3.length(), org.telegram.ui.Components.t5.class);
        this.emojiOnlyCount = Math.max(num.intValue(), (emojiSpanArr == null ? 0 : emojiSpanArr.length) + (t5VarArr2 == null ? 0 : t5VarArr2.length));
        this.totalAnimatedEmojiCount = t5VarArr2 == null ? 0 : t5VarArr2.length;
        this.animatedEmojiCount = 0;
        if (t5VarArr2 != null) {
            for (org.telegram.ui.Components.t5 t5Var : t5VarArr2) {
                if (!t5Var.standard) {
                    this.animatedEmojiCount++;
                }
            }
        }
        int i11 = this.emojiOnlyCount;
        boolean z10 = (i11 - (emojiSpanArr == null ? 0 : emojiSpanArr.length)) - (t5VarArr2 == null ? 0 : t5VarArr2.length) > 0;
        this.hasUnwrappedEmoji = z10;
        if (i11 == 0 || z10) {
            if (t5VarArr2 == null || t5VarArr2.length <= 0) {
                return;
            }
            for (int i12 = 0; i12 < t5VarArr2.length; i12++) {
                t5VarArr2[i12].replaceFontMetrics(org.telegram.ui.ActionBar.g6.o2.getFontMetricsInt(), (int) (org.telegram.ui.ActionBar.g6.o2.getTextSize() + AndroidUtilities.dp(4.0f)), -1);
                t5VarArr2[i12].full = false;
            }
            return;
        }
        int i13 = this.animatedEmojiCount;
        boolean z11 = i11 == i13;
        int i14 = 2;
        switch (Math.max(i11, i13)) {
            case 0:
            case 1:
            case 2:
                TextPaint[] textPaintArr = org.telegram.ui.ActionBar.g6.y2;
                textPaint = z11 ? textPaintArr[0] : textPaintArr[2];
                i14 = 1;
                break;
            case 3:
                TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.g6.y2;
                textPaint = z11 ? textPaintArr2[1] : textPaintArr2[3];
                i14 = 1;
                break;
            case 4:
                TextPaint[] textPaintArr3 = org.telegram.ui.ActionBar.g6.y2;
                textPaint = z11 ? textPaintArr3[2] : textPaintArr3[4];
                i14 = 1;
                break;
            case 5:
                TextPaint[] textPaintArr4 = org.telegram.ui.ActionBar.g6.y2;
                if (z11) {
                    textPaint = textPaintArr4[3];
                    break;
                } else {
                    textPaint = textPaintArr4[5];
                    break;
                }
            case 6:
                TextPaint[] textPaintArr5 = org.telegram.ui.ActionBar.g6.y2;
                if (z11) {
                    textPaint = textPaintArr5[4];
                    break;
                } else {
                    textPaint = textPaintArr5[5];
                    break;
                }
            default:
                int i15 = this.emojiOnlyCount > 9 ? 0 : -1;
                textPaint = org.telegram.ui.ActionBar.g6.y2[5];
                i14 = i15;
                break;
        }
        int textSize = (int) (textPaint.getTextSize() + AndroidUtilities.dp(4.0f));
        if (emojiSpanArr != null && emojiSpanArr.length > 0) {
            for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                emojiSpan.replaceFontMetrics(textPaint.getFontMetricsInt(), textSize);
            }
        }
        if (t5VarArr2 == null || t5VarArr2.length <= 0) {
            return;
        }
        for (int i16 = 0; i16 < t5VarArr2.length; i16++) {
            t5VarArr2[i16].replaceFontMetrics(textPaint.getFontMetricsInt(), textSize, i14);
            t5VarArr2[i16].full = true;
        }
    }

    public static String findAnimatedEmojiEmoticon(TLRPC.Document document, String str) {
        return findAnimatedEmojiEmoticon(document, str, null);
    }

    public static TLRPC.Document findAudio(ArrayList<TL_iv.PageBlock> arrayList, TL_iv.RichMessage richMessage) {
        if (arrayList != null && richMessage != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_iv.PageBlock pageBlock = arrayList.get(i10);
                i10++;
                TL_iv.PageBlock pageBlock2 = pageBlock;
                if (pageBlock2 instanceof TL_iv.pageBlockAudio) {
                    return AndroidUtilities.findDocument(richMessage.documents, ((TL_iv.pageBlockAudio) pageBlock2).audio_id);
                }
                if (pageBlock2 instanceof TL_iv.pageBlockCollage) {
                    return findAudio(((TL_iv.pageBlockCollage) pageBlock2).items, richMessage);
                }
                if (pageBlock2 instanceof TL_iv.pageBlockSlideshow) {
                    return findAudio(((TL_iv.pageBlockSlideshow) pageBlock2).items, richMessage);
                }
            }
        }
        return null;
    }

    public static TLRPC.Photo findPhoto(ArrayList<TL_iv.PageBlock> arrayList, TL_iv.RichMessage richMessage) {
        if (arrayList != null && richMessage != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_iv.PageBlock pageBlock = arrayList.get(i10);
                i10++;
                TL_iv.PageBlock pageBlock2 = pageBlock;
                if (pageBlock2 instanceof TL_iv.pageBlockPhoto) {
                    return AndroidUtilities.findPhoto(richMessage.photos, ((TL_iv.pageBlockPhoto) pageBlock2).photo_id);
                }
                if (pageBlock2 instanceof TL_iv.pageBlockCollage) {
                    return findPhoto(((TL_iv.pageBlockCollage) pageBlock2).items, richMessage);
                }
                if (pageBlock2 instanceof TL_iv.pageBlockSlideshow) {
                    return findPhoto(((TL_iv.pageBlockSlideshow) pageBlock2).items, richMessage);
                }
            }
        }
        return null;
    }

    public static TLRPC.Document findVideo(ArrayList<TL_iv.PageBlock> arrayList, TL_iv.RichMessage richMessage) {
        if (arrayList != null && richMessage != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_iv.PageBlock pageBlock = arrayList.get(i10);
                i10++;
                TL_iv.PageBlock pageBlock2 = pageBlock;
                if (pageBlock2 instanceof TL_iv.pageBlockVideo) {
                    return AndroidUtilities.findDocument(richMessage.documents, ((TL_iv.pageBlockVideo) pageBlock2).video_id);
                }
                if (pageBlock2 instanceof TL_iv.pageBlockCollage) {
                    return findVideo(((TL_iv.pageBlockCollage) pageBlock2).items, richMessage);
                }
                if (pageBlock2 instanceof TL_iv.pageBlockSlideshow) {
                    return findVideo(((TL_iv.pageBlockSlideshow) pageBlock2).items, richMessage);
                }
            }
        }
        return null;
    }

    public static CharSequence formatRichMessage(TL_iv.RichMessage richMessage, boolean z10, boolean z11, int i10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (richMessage != null) {
            int i11 = 0;
            while (i11 < richMessage.blocks.size()) {
                TL_iv.PageBlock pageBlock = richMessage.blocks.get(i11);
                if (i11 > 0) {
                    spannableStringBuilder.append((CharSequence) "  ");
                }
                TL_iv.RichMessage richMessage2 = richMessage;
                boolean z12 = z10;
                boolean z13 = z11;
                int i12 = i10;
                formatRichBlock(pageBlock, z12, z13, i12, spannableStringBuilder, richMessage2);
                if (spannableStringBuilder.length() >= i12) {
                    spannableStringBuilder.delete(i12, spannableStringBuilder.length());
                    spannableStringBuilder.append((CharSequence) "…");
                    return spannableStringBuilder;
                }
                i11++;
                z10 = z12;
                z11 = z13;
                i10 = i12;
                richMessage = richMessage2;
            }
        }
        return spannableStringBuilder;
    }

    public static CharSequence formatTextWithEntities(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        org.telegram.ui.ActionBar.g6.N();
        TextPaint textPaint = org.telegram.ui.ActionBar.g6.s2;
        if (textPaint == null) {
            textPaint = new TextPaint(1);
            textPaint.setTypeface(AndroidUtilities.bold());
            textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        }
        return formatTextWithEntities(tL_textWithEntities, z10, textPaint);
    }

    public static String getArtworkUrl(TLRPC.Document document, boolean z10) {
        if (document == null || "audio/ogg".equals(document.mime_type)) {
            return null;
        }
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                if (documentAttribute.voice) {
                    return null;
                }
                String str = documentAttribute.performer;
                String str2 = documentAttribute.title;
                if (!TextUtils.isEmpty(str)) {
                    int i11 = 0;
                    while (true) {
                        String[] strArr = excludeWords;
                        if (i11 >= strArr.length) {
                            break;
                        }
                        str = str.replace(strArr[i11], " ");
                        i11++;
                    }
                }
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    return null;
                }
                try {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("athumb://itunes.apple.com/search?term=");
                    sb2.append(URLEncoder.encode(str + " - " + str2, "UTF-8"));
                    sb2.append("&entity=song&limit=4");
                    sb2.append(z10 ? "&s=1" : "");
                    return sb2.toString();
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return null;
    }

    public static long getChannelId(TLRPC.Message message) {
        TLRPC.Peer peer = message.peer_id;
        if (peer != null) {
            return peer.channel_id;
        }
        return 0L;
    }

    public static long getDialogId(TLRPC.Message message) {
        TLRPC.Peer peer;
        if (message.dialog_id == 0 && (peer = message.peer_id) != null) {
            long j10 = peer.chat_id;
            if (j10 != 0) {
                message.dialog_id = -j10;
            } else {
                long j11 = peer.channel_id;
                if (j11 != 0) {
                    message.dialog_id = -j11;
                } else if (message.from_id == null || isOut(message) || message.guestchat_via_from != null) {
                    message.dialog_id = message.peer_id.user_id;
                } else {
                    message.dialog_id = message.from_id.user_id;
                }
            }
        }
        return message.dialog_id;
    }

    public static long getMonoForumTopicId(TLRPC.Message message) {
        TLRPC.Peer peer;
        if (message == null || (peer = message.saved_peer_id) == null) {
            return 0L;
        }
        long j10 = peer.chat_id;
        if (j10 != 0) {
            return -j10;
        }
        long j11 = peer.channel_id;
        return j11 != 0 ? -j11 : peer.user_id;
    }

    public static TLRPC.Photo getPhoto(TLRPC.Message message) {
        TL_iv.RichMessage richMessage;
        if (message != null && (richMessage = message.rich_message) != null) {
            return findPhoto(richMessage);
        }
        if (getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return getMedia(message).webpage.photo;
        }
        if (getMedia(message) != null) {
            return getMedia(message).photo;
        }
        return null;
    }

    public static TLRPC.VideoSize getPremiumStickerAnimation(TLRPC.Document document) {
        if (document != null && document.thumbs != null) {
            for (int i10 = 0; i10 < document.video_thumbs.size(); i10++) {
                if ("f".equals(document.video_thumbs.get(i10).type)) {
                    return document.video_thumbs.get(i10);
                }
            }
        }
        return null;
    }

    public static long getSavedDialogId(long j10, TLRPC.Message message) {
        TLRPC.Peer peer;
        TLRPC.Peer peer2 = message.saved_peer_id;
        if (peer2 == null) {
            if (message.from_id.user_id != j10) {
                return 0L;
            }
            TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
            return (messageFwdHeader == null || (peer = messageFwdHeader.saved_from_peer) == null) ? ((messageFwdHeader == null || messageFwdHeader.from_id == null) && messageFwdHeader != null) ? UserObject.ANONYMOUS : j10 : DialogObject.getPeerDialogId(peer);
        }
        long j11 = peer2.chat_id;
        if (j11 != 0) {
            return -j11;
        }
        long j12 = peer2.channel_id;
        return j12 != 0 ? -j12 : peer2.user_id;
    }

    private static long getTopicId(int i10, TLRPC.Message message) {
        return getTopicId(i10, message, false);
    }

    private void handleFoundWords(ArrayList<String> arrayList, String[] strArr, boolean z10, boolean z11) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        boolean z12;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z13 = false;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= strArr.length) {
                    break;
                }
                if (arrayList.get(i10).contains(strArr[i11])) {
                    z13 = true;
                    break;
                }
                i11++;
            }
            if (z13) {
                break;
            }
        }
        if (z13) {
            int i12 = 0;
            while (i12 < arrayList.size()) {
                int i13 = 0;
                while (true) {
                    if (i13 >= strArr.length) {
                        z12 = false;
                        break;
                    } else {
                        if (arrayList.get(i12).contains(strArr[i13])) {
                            z12 = true;
                            break;
                        }
                        i13++;
                    }
                }
                if (!z12) {
                    arrayList.remove(i12);
                    i12--;
                }
                i12++;
            }
            if (arrayList.size() > 0) {
                Collections.sort(arrayList, new q(13));
                String str = arrayList.get(0);
                arrayList.clear();
                arrayList.add(str);
            }
        }
        this.highlightedWords = arrayList;
        if (this.messageOwner.message != null) {
            applyEntities();
            CharSequence replaceMultipleCharSequence = AndroidUtilities.replaceMultipleCharSequence("\n", !TextUtils.isEmpty(this.caption) ? this.caption : this.messageText, " ");
            if (z10 && (message = this.messageOwner) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.quote_text != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.messageOwner.reply_to.quote_text);
                addEntitiesToText(spannableStringBuilder, this.messageOwner.reply_to.quote_entities, isOutOwner(), false, false, false);
                SpannableString spannableString = new SpannableString("q ");
                cq cqVar = new cq(R.drawable.mini_quote, 0);
                cqVar.setOverrideColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
                spannableString.setSpan(cqVar, 0, 1, 33);
                replaceMultipleCharSequence = new SpannableStringBuilder(spannableString).append((CharSequence) spannableStringBuilder).append('\n').append(replaceMultipleCharSequence);
            }
            String charSequence = replaceMultipleCharSequence.toString();
            int length = charSequence.length();
            int indexOf = charSequence.toLowerCase().indexOf(arrayList.get(0));
            if (indexOf < 0) {
                indexOf = 0;
            }
            if (length > 120 && z11) {
                float f10 = 120;
                int max = Math.max(0, indexOf - ((int) (0.1f * f10)));
                replaceMultipleCharSequence = replaceMultipleCharSequence.subSequence(max, Math.min(length, (indexOf - max) + indexOf + ((int) (f10 * 0.9f))));
            }
            this.messageTrimmedToHighlight = replaceMultipleCharSequence;
            this.messageTrimmedToHighlightCut = z11;
        }
    }

    public static boolean hasUnreadReactions(TLRPC.TL_messageReactions tL_messageReactions) {
        if (tL_messageReactions == null) {
            return false;
        }
        for (int i10 = 0; i10 < tL_messageReactions.recent_reactions.size(); i10++) {
            if (tL_messageReactions.recent_reactions.get(i10).unread) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAnimatedStickerDocument(TLRPC.Document document, boolean z10) {
        if (document != null && (("application/x-tgsticker".equals(document.mime_type) && !document.thumbs.isEmpty()) || "application/x-tgsdice".equals(document.mime_type))) {
            if (z10) {
                return true;
            }
            int size = document.attributes.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    return documentAttribute.stickerset instanceof TLRPC.TL_inputStickerSetShortName;
                }
                if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isContentUnread(TLRPC.Message message) {
        return message.media_unread;
    }

    public static boolean isEphemeral(TLRPC.Message message) {
        if (message != null) {
            return isEphemeralMessageId(message.id) || message.ephemeralReceiverBotId != 0;
        }
        return false;
    }

    public static boolean isEphemeralAndNotWelcome(TLRPC.Message message) {
        return isEphemeral(message) && !isWelcomeMessage(message);
    }

    public static boolean isGifDocument(TLRPC.Document document) {
        return isGifDocument(document, false);
    }

    public static boolean isMediaEmptyWebpage(TLRPC.Message message) {
        return message == null || getMedia(message) == null || (getMedia(message) instanceof TLRPC.TL_messageMediaEmpty);
    }

    public static boolean isOut(TLRPC.Message message) {
        return message.out;
    }

    public static boolean isUnread(TLRPC.Message message) {
        return message.unread;
    }

    public static boolean isWelcomeAnchored(TLRPC.Message message) {
        return isEphemeral(message) && message.ephemeralAnchorMsgId != 0;
    }

    public static boolean isWelcomeMessage(TLRPC.Message message) {
        if (isEphemeral(message)) {
            return message.ephemeralReceiverBotId == -1 || message.ephemeralAnchorMsgId != 0;
        }
        return false;
    }

    public static StaticLayout makeStaticLayout(CharSequence charSequence, TextPaint textPaint, int i10, float f10, float f11, boolean z10, Layout.Alignment alignment) {
        int i11 = i10 <= 0 ? 1 : i10;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 24) {
            return new StaticLayout(charSequence, textPaint, i11, alignment, f10, f11, false);
        }
        StaticLayout.Builder alignment2 = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i11).setLineSpacing(f11, f10).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(alignment);
        if (z10) {
            alignment2.setIncludePad(false);
        }
        if (i12 >= 28) {
            alignment2.setUseLineSpacingFromFallbacks(false);
        }
        StaticLayout build = alignment2.build();
        for (int i13 = 0; i13 < build.getLineCount(); i13++) {
            if (build.getLineRight(i13) > i11) {
                StaticLayout.Builder alignment3 = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i11).setLineSpacing(f11, f10).setBreakStrategy(0).setHyphenationFrequency(0).setAlignment(alignment);
                if (z10) {
                    alignment3.setIncludePad(false);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    alignment3.setUseLineSpacingFromFallbacks(false);
                }
                return alignment3.build();
            }
        }
        return build;
    }

    public static CharSequence peerNameWithIcon(int i10, TLRPC.Peer peer, boolean z10) {
        TLRPC.Chat chat;
        if (peer instanceof TLRPC.TL_peerUser) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peer.user_id));
            return user != null ? z10 ? new SpannableStringBuilder(userSpan()).append((CharSequence) " ").append((CharSequence) UserObject.getUserName(user)) : UserObject.getUserName(user) : "";
        }
        if (peer instanceof TLRPC.TL_peerChat) {
            TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(peer.chat_id));
            if (chat2 == null) {
                return "";
            }
            if (z10) {
                return new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat2) ? channelSpan() : groupSpan()).append((CharSequence) " ").append((CharSequence) chat2.title);
            }
            return chat2.title;
        }
        if (!(peer instanceof TLRPC.TL_peerChannel) || (chat = MessagesController.getInstance(i10).getChat(Long.valueOf(peer.channel_id))) == null) {
            return "";
        }
        if (z10) {
            return new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat) ? channelSpan() : groupSpan()).append((CharSequence) " ").append((CharSequence) chat.title);
        }
        return chat.title;
    }

    public static Spannable replaceAnimatedEmoji(CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, Paint.FontMetricsInt fontMetricsInt) {
        return replaceAnimatedEmoji(charSequence, arrayList, fontMetricsInt, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:1369:0x2334  */
    /* JADX WARN: Removed duplicated region for block: B:1387:0x23a1  */
    /* JADX WARN: Removed duplicated region for block: B:1389:0x23a4  */
    /* JADX WARN: Removed duplicated region for block: B:1446:0x2544 A[LOOP:4: B:1436:0x250b->B:1446:0x2544, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:1447:0x2542 A[EDGE_INSN: B:1447:0x2542->B:1448:0x2542 BREAK  A[LOOP:4: B:1436:0x250b->B:1446:0x2544], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1566:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0942  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x099a  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0c08  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x27b6  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x10c6  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x10e0  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x113a  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x114e  */
    /* JADX WARN: Removed duplicated region for block: B:692:0x1194  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x119e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:783:0x139a  */
    /* JADX WARN: Removed duplicated region for block: B:803:0x143d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void updateMessageText(AbstractMap<Long, TLRPC.User> abstractMap, AbstractMap<Long, TLRPC.Chat> abstractMap2, a0.h hVar, a0.h hVar2) {
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.Message message;
        String str;
        char c10;
        String formatPluralString;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        String str2;
        String publicUsername;
        boolean isChannelAndNotMegaGroup;
        TLRPC.Chat chat2;
        TLRPC.TodoItem todoItem;
        String publicUsername2;
        String str3;
        TLRPC.Chat chat3;
        String str4;
        TLRPC.Chat chat4;
        long j10;
        boolean z10;
        String str5;
        int i10;
        TLObject tLObject;
        TLRPC.Chat chat5;
        TLRPC.Chat chat6;
        TLRPC.Chat chat7;
        ArrayList<TLRPC.VideoSize> arrayList;
        int i11;
        String str6;
        TLObject tLObject2;
        String str7;
        int indexOf;
        TLRPC.Peer peer;
        TLRPC.Chat chat8;
        TLRPC.TL_messageActionGiveawayResults tL_messageActionGiveawayResults;
        TLRPC.Chat chat9;
        String str8;
        boolean z11;
        TLRPC.Chat chat10;
        hf.a aVar;
        hf.a aVar2;
        TLRPC.Chat chat11;
        TLRPC.User chat12;
        String formatPluralString2;
        TLRPC.Peer peer2 = this.messageOwner.from_id;
        if (peer2 instanceof TLRPC.TL_peerUser) {
            user = getUser(abstractMap, hVar, peer2.user_id);
        } else {
            if (peer2 instanceof TLRPC.TL_peerChannel) {
                chat = getChat(abstractMap2, hVar2, peer2.channel_id);
                user = null;
                TLObject tLObject3 = user == null ? user : chat;
                this.drawServiceWithDefaultTypeface = false;
                this.channelJoined = false;
                message = this.messageOwner;
                if (message instanceof TLRPC.TL_messageService) {
                    str = "";
                    TLRPC.Chat chat13 = chat;
                    this.isRestrictedMessage = false;
                    String restrictionReason = MessagesController.getInstance(this.currentAccount).getRestrictionReason(this.messageOwner.restriction_reason);
                    if (TextUtils.isEmpty(restrictionReason)) {
                        TL_iv.RichMessage richMessage = this.messageOwner.rich_message;
                        if (richMessage != null) {
                            CharSequence formatRichMessage = formatRichMessage(richMessage, isOutOwner());
                            this.messageText = formatRichMessage;
                            this.messageText = AndroidUtilities.replaceNewLines(formatRichMessage);
                        } else if (isMediaEmpty() || isSponsored()) {
                            String str9 = this.messageOwner.message;
                            if (str9 != null) {
                                try {
                                    if (str9.length() > 200) {
                                        this.messageText = AndroidUtilities.BAD_CHARS_MESSAGE_LONG_PATTERN.matcher(this.messageOwner.message).replaceAll("\u200c");
                                    } else {
                                        this.messageText = AndroidUtilities.BAD_CHARS_MESSAGE_PATTERN.matcher(this.messageOwner.message).replaceAll("\u200c");
                                    }
                                } catch (Throwable unused) {
                                    this.messageText = this.messageOwner.message;
                                }
                            } else {
                                this.messageText = str9;
                            }
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGiveaway) {
                            TLRPC.MessageFwdHeader messageFwdHeader = this.messageOwner.fwd_from;
                            if (messageFwdHeader != null) {
                                TLRPC.Peer peer3 = messageFwdHeader.from_id;
                                if (peer3 instanceof TLRPC.TL_peerChannel) {
                                    isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(getChat(abstractMap2, hVar2, peer3.channel_id));
                                    this.messageText = LocaleController.getString(!isChannelAndNotMegaGroup ? R.string.BoostingGiveawayChannelStarted : R.string.BoostingGiveawayGroupStarted);
                                }
                            }
                            isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat13);
                            this.messageText = LocaleController.getString(!isChannelAndNotMegaGroup ? R.string.BoostingGiveawayChannelStarted : R.string.BoostingGiveawayGroupStarted);
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGiveawayResults) {
                            this.messageText = LocaleController.getString(R.string.BoostingGiveawayResults);
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaStory) {
                            if (getMedia(this.messageOwner).via_mention) {
                                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(getMedia(this.messageOwner).user_id));
                                if (user2 == null || (publicUsername = UserObject.getPublicUsername(user2)) == null) {
                                    str2 = null;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    i0.a.z(sb2, MessagesController.getInstance(this.currentAccount).linkPrefix, "/", publicUsername, "/s/");
                                    sb2.append(getMedia(this.messageOwner).id);
                                    str2 = sb2.toString();
                                }
                                if (str2 != null) {
                                    SpannableString spannableString = new SpannableString(str2);
                                    this.messageText = spannableString;
                                    spannableString.setSpan(new t41("https://".concat(str2), new xz0()), 0, this.messageText.length(), 33);
                                } else {
                                    this.messageText = str;
                                }
                            } else {
                                this.messageText = LocaleController.getString(R.string.ForwardedStory);
                            }
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDice) {
                            this.messageText = getDiceEmoji();
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPoll) {
                            if (((TLRPC.TL_messageMediaPoll) getMedia(this.messageOwner)).poll.quiz) {
                                this.messageText = LocaleController.getString(R.string.QuizPoll);
                            } else {
                                this.messageText = LocaleController.getString(R.string.Poll);
                            }
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaToDo) {
                            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) getMedia(this.messageOwner);
                            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
                            if (todoList == null || (tL_textWithEntities = todoList.title) == null || tL_textWithEntities.text.isEmpty()) {
                                this.messageText = LocaleController.getString(R.string.MessageTodo);
                            } else {
                                this.messageText = LocaleController.formatSpannable(R.string.MessageTodoName, formatTextWithEntities(tL_messageMediaToDo.todo.title, isOutOwner()));
                            }
                        } else if (isVoiceOnce()) {
                            this.messageText = LocaleController.getString(R.string.AttachOnceAudio);
                        } else if (isRoundOnce()) {
                            this.messageText = LocaleController.getString(R.string.AttachOnceRound);
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPaidMedia) {
                            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) getMedia(this.messageOwner);
                            int size = tL_messageMediaPaidMedia.extended_media.size();
                            boolean z12 = false;
                            for (int i12 = 0; i12 < size; i12++) {
                                TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i12);
                                if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                    TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                                    z12 = (messageMedia instanceof TLRPC.TL_messageMediaDocument) && isVideoDocument(messageMedia.document);
                                } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                                    z12 = (((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).flags & 4) != 0;
                                    if (!z12) {
                                        break;
                                    }
                                }
                                if (!z12) {
                                }
                            }
                            if (size == 1) {
                                formatPluralString = LocaleController.getString(z12 ? R.string.AttachVideo : R.string.AttachPhoto);
                                c10 = 0;
                            } else {
                                c10 = 0;
                                formatPluralString = LocaleController.formatPluralString(z12 ? "Media" : "Photos", size, new Object[0]);
                            }
                            this.messageText = formatPluralString;
                            int i13 = R.string.AttachPaidMedia;
                            Object[] objArr = new Object[1];
                            objArr[c10] = formatPluralString;
                            this.messageText = hh.oa.Q0(LocaleController.formatString(i13, objArr));
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) {
                            if (getMedia(this.messageOwner).ttl_seconds != 0 && !(this.messageOwner instanceof TLRPC.TL_message_secret)) {
                                this.messageText = LocaleController.getString(R.string.AttachDestructingPhoto);
                            } else if (getGroupId() != 0) {
                                this.messageText = LocaleController.getString(R.string.Album);
                            } else if (isLivePhoto()) {
                                this.messageText = LocaleController.getString(R.string.AttachLivePhoto);
                            } else {
                                this.messageText = LocaleController.getString(R.string.AttachPhoto);
                            }
                        } else if (isVideo() || ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument) && (((getDocument() instanceof TLRPC.TL_documentEmpty) || getDocument() == null) && getMedia(this.messageOwner).ttl_seconds != 0))) {
                            if (getMedia(this.messageOwner).ttl_seconds != 0) {
                                TLRPC.Message message2 = this.messageOwner;
                                if (!(message2 instanceof TLRPC.TL_message_secret)) {
                                    if (getMedia(message2).voice) {
                                        this.messageText = LocaleController.getString(R.string.AttachVoiceExpired);
                                    } else if (getMedia(this.messageOwner).round) {
                                        this.messageText = LocaleController.getString(R.string.AttachRoundExpired);
                                    } else {
                                        this.messageText = LocaleController.getString(R.string.AttachDestructingVideo);
                                    }
                                }
                            }
                            this.messageText = LocaleController.getString(R.string.AttachVideo);
                        } else if (isVoice()) {
                            this.messageText = LocaleController.getString(R.string.AttachAudio);
                        } else if (isRoundVideo()) {
                            this.messageText = LocaleController.getString(R.string.AttachRound);
                        } else if ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGeo) || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaVenue)) {
                            this.messageText = LocaleController.getString(R.string.AttachLocation);
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGeoLive) {
                            this.messageText = LocaleController.getString(R.string.AttachLiveLocation);
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaContact) {
                            this.messageText = LocaleController.getString(R.string.AttachContact);
                            if (!TextUtils.isEmpty(getMedia(this.messageOwner).vcard)) {
                                this.vCardData = VCardData.parse(getMedia(this.messageOwner).vcard);
                            }
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame) {
                            this.messageText = this.messageOwner.message;
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaInvoice) {
                            this.messageText = getMedia(this.messageOwner).description;
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaUnsupported) {
                            this.messageText = LocaleController.getString(R.string.UnsupportedMedia2);
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument) {
                            if (isSticker() || isAnimatedStickerDocument(getDocument(), true)) {
                                String stickerChar = getStickerChar();
                                if (stickerChar == null || stickerChar.length() <= 0) {
                                    this.messageText = LocaleController.getString(R.string.AttachSticker);
                                } else {
                                    this.messageText = a9.p.w(stickerChar, " ", LocaleController.getString(R.string.AttachSticker));
                                }
                            } else if (isMusic()) {
                                this.messageText = LocaleController.getString(R.string.AttachMusic);
                            } else if (isGif()) {
                                this.messageText = LocaleController.getString(R.string.AttachGif);
                            } else {
                                String documentFileName = FileLoader.getDocumentFileName(getDocument());
                                if (TextUtils.isEmpty(documentFileName)) {
                                    this.messageText = LocaleController.getString(R.string.AttachDocument);
                                } else {
                                    this.messageText = documentFileName;
                                }
                            }
                        }
                    } else {
                        this.messageText = restrictionReason;
                        this.isRestrictedMessage = true;
                    }
                } else {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction != null) {
                        String str10 = "un2";
                        if (messageAction instanceof TLRPC.TL_messageActionNewCreatorPending) {
                            TLRPC.User user3 = getUser(abstractMap, hVar, ((TLRPC.TL_messageActionNewCreatorPending) messageAction).new_creator_id);
                            String string = LocaleController.getString(R.string.ActionNewCreatorPending);
                            this.messageText = string;
                            CharSequence replaceWithLink = replaceWithLink(string, "un1", user3);
                            this.messageText = replaceWithLink;
                            this.messageText = replaceWithLink(replaceWithLink, "un2", tLObject3);
                        } else if (messageAction instanceof TLRPC.TL_messageActionChangeCreator) {
                            TLRPC.User user4 = getUser(abstractMap, hVar, ((TLRPC.TL_messageActionChangeCreator) messageAction).new_creator_id);
                            String string2 = LocaleController.getString(R.string.ActionChangeCreator);
                            this.messageText = string2;
                            CharSequence replaceWithLink2 = replaceWithLink(string2, "un1", tLObject3);
                            this.messageText = replaceWithLink2;
                            this.messageText = replaceWithLink(replaceWithLink2, "un2", user4);
                        } else if (messageAction instanceof TLRPC.TL_messageActionManagedBotCreated) {
                            TLRPC.User user5 = getUser(abstractMap, hVar, ((TLRPC.TL_messageActionManagedBotCreated) messageAction).bot_id);
                            TLRPC.User user6 = getUser(abstractMap, hVar, this.messageOwner.peer_id.user_id);
                            String string3 = LocaleController.getString(R.string.ActionManagedBotCreated);
                            this.messageText = string3;
                            CharSequence replaceWithLink3 = replaceWithLink(string3, "un1", user5);
                            this.messageText = replaceWithLink3;
                            this.messageText = replaceWithLink(replaceWithLink3, "un2", user6);
                        } else if (messageAction instanceof TLRPC.TL_messageActionSetSameChatWallPaper) {
                            this.contentType = 1;
                            this.type = 10;
                            TLRPC.TL_messageActionSetSameChatWallPaper tL_messageActionSetSameChatWallPaper = (TLRPC.TL_messageActionSetSameChatWallPaper) messageAction;
                            TLRPC.User user7 = getUser(abstractMap, hVar, isOutOwner() ? 0L : getDialogId());
                            ArrayList<TLRPC.PhotoSize> arrayList2 = new ArrayList<>();
                            this.photoThumbs = arrayList2;
                            TLRPC.Document document = tL_messageActionSetSameChatWallPaper.wallpaper.document;
                            if (document != null) {
                                arrayList2.addAll(document.thumbs);
                                this.photoThumbsObject = tL_messageActionSetSameChatWallPaper.wallpaper.document;
                            }
                            if (user7 != null) {
                                if (user7.id == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                    this.messageText = LocaleController.formatString(R.string.ActionSetSameWallpaperForThisChatSelf, new Object[0]);
                                } else {
                                    this.messageText = LocaleController.formatString(R.string.ActionSetSameWallpaperForThisChat, user7.first_name);
                                }
                            } else if (chat != null) {
                                this.messageText = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.ActionSetWallpaperForThisChannel : R.string.ActionSetWallpaperForThisGroup);
                            } else if (user != null) {
                                this.messageText = LocaleController.formatString(R.string.ActionSetWallpaperForThisGroupByUser, UserObject.getFirstName(user));
                            }
                        } else if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                            this.contentType = 1;
                            TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) messageAction;
                            this.type = 22;
                            ArrayList<TLRPC.PhotoSize> arrayList3 = new ArrayList<>();
                            this.photoThumbs = arrayList3;
                            TLRPC.Document document2 = tL_messageActionSetChatWallPaper.wallpaper.document;
                            if (document2 != null) {
                                arrayList3.addAll(document2.thumbs);
                                this.photoThumbsObject = tL_messageActionSetChatWallPaper.wallpaper.document;
                            }
                            TLRPC.User user8 = getUser(abstractMap, hVar, isOutOwner() ? 0L : getDialogId());
                            TLRPC.User user9 = getUser(abstractMap, hVar, getDialogId());
                            if (user8 != null) {
                                if (user8.id != UserConfig.getInstance(this.currentAccount).clientUserId) {
                                    SpannableString spannableString2 = new SpannableString(UserObject.getFirstName(user8));
                                    spannableString2.setSpan(new k41(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
                                    if (tL_messageActionSetChatWallPaper.same) {
                                        this.type = 10;
                                        this.messageText = LocaleController.getString(R.string.ActionSetSameWallpaperForThisChat);
                                    } else if (tL_messageActionSetChatWallPaper.for_both) {
                                        this.messageText = LocaleController.getString(R.string.ActionSetWallpaperForThisChatBoth);
                                    } else {
                                        this.messageText = LocaleController.getString(R.string.ActionSetWallpaperForThisChat);
                                    }
                                    this.messageText = AndroidUtilities.replaceCharSequence("%s", this.messageText, spannableString2);
                                } else if (tL_messageActionSetChatWallPaper.same) {
                                    this.type = 10;
                                    this.messageText = LocaleController.formatString(R.string.ActionSetSameWallpaperForThisChatSelf, new Object[0]);
                                } else if (!tL_messageActionSetChatWallPaper.for_both || user9 == null) {
                                    this.messageText = LocaleController.getString(R.string.ActionSetWallpaperForThisChatSelf);
                                } else {
                                    this.messageText = LocaleController.getString(R.string.ActionSetWallpaperForThisChatSelfBoth);
                                    SpannableString spannableString3 = new SpannableString(UserObject.getFirstName(user9));
                                    spannableString3.setSpan(new k41(AndroidUtilities.bold()), 0, spannableString3.length(), 33);
                                    this.messageText = AndroidUtilities.replaceCharSequence("%s", this.messageText, spannableString3);
                                }
                            } else if (chat != null) {
                                this.messageText = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.ActionSetWallpaperForThisChannel : R.string.ActionSetWallpaperForThisGroup);
                            } else if (user != null) {
                                this.messageText = LocaleController.formatString(R.string.ActionSetWallpaperForThisGroupByUser, UserObject.getFirstName(user));
                            }
                        } else if (messageAction instanceof TLRPC.TL_messageActionGroupCallScheduled) {
                            TLRPC.TL_messageActionGroupCallScheduled tL_messageActionGroupCallScheduled = (TLRPC.TL_messageActionGroupCallScheduled) messageAction;
                            if ((message.peer_id instanceof TLRPC.TL_peerChat) || isSupergroup()) {
                                this.messageText = LocaleController.formatString(R.string.ActionGroupCallScheduled, LocaleController.formatStartsTime(tL_messageActionGroupCallScheduled.schedule_date, 3, false));
                            } else {
                                this.messageText = LocaleController.formatString(R.string.ActionChannelCallScheduled, LocaleController.formatStartsTime(tL_messageActionGroupCallScheduled.schedule_date, 3, false));
                            }
                        } else if (messageAction instanceof TLRPC.TL_messageActionGroupCall) {
                            int i14 = messageAction.duration;
                            if (i14 != 0) {
                                int i15 = i14 / 86400;
                                if (i15 > 0) {
                                    formatPluralString2 = LocaleController.formatPluralString("Days", i15, new Object[0]);
                                } else {
                                    int i16 = i14 / 3600;
                                    if (i16 > 0) {
                                        formatPluralString2 = LocaleController.formatPluralString("Hours", i16, new Object[0]);
                                    } else {
                                        int i17 = i14 / 60;
                                        formatPluralString2 = i17 > 0 ? LocaleController.formatPluralString("Minutes", i17, new Object[0]) : LocaleController.formatPluralString("Seconds", i14, new Object[0]);
                                    }
                                }
                                if (!(this.messageOwner.peer_id instanceof TLRPC.TL_peerChat) && !isSupergroup()) {
                                    this.messageText = LocaleController.formatString(R.string.ActionChannelCallEnded, formatPluralString2);
                                } else if (isOut()) {
                                    this.messageText = LocaleController.formatString(R.string.ActionGroupCallEndedByYou, formatPluralString2);
                                } else {
                                    this.messageText = replaceWithLink(LocaleController.formatString(R.string.ActionGroupCallEndedBy, formatPluralString2), "un1", tLObject3);
                                }
                            } else if (!(message.peer_id instanceof TLRPC.TL_peerChat) && !isSupergroup()) {
                                this.messageText = LocaleController.getString(R.string.ActionChannelCallJustStarted);
                            } else if (isOut()) {
                                this.messageText = LocaleController.getString(R.string.ActionGroupCallStartedByYou);
                            } else {
                                this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionGroupCallStarted), "un1", tLObject3);
                            }
                        } else if (messageAction instanceof TLRPC.TL_messageActionInviteToGroupCall) {
                            long j11 = messageAction.user_id;
                            if (j11 == 0 && messageAction.users.size() == 1) {
                                j11 = this.messageOwner.action.users.get(0).longValue();
                            }
                            if (j11 != 0) {
                                TLRPC.User user10 = getUser(abstractMap, hVar, j11);
                                if (isOut()) {
                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionGroupCallYouInvited), "un2", user10);
                                } else if (j11 == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionGroupCallInvitedYou), "un1", tLObject3);
                                } else {
                                    CharSequence replaceWithLink4 = replaceWithLink(LocaleController.getString(R.string.ActionGroupCallInvited), "un2", user10);
                                    this.messageText = replaceWithLink4;
                                    this.messageText = replaceWithLink(replaceWithLink4, "un1", tLObject3);
                                }
                            } else if (isOut()) {
                                this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionGroupCallYouInvited), "un2", this.messageOwner.action.users, abstractMap, hVar);
                            } else {
                                CharSequence replaceWithLink5 = replaceWithLink(LocaleController.getString(R.string.ActionGroupCallInvited), "un2", this.messageOwner.action.users, abstractMap, hVar);
                                this.messageText = replaceWithLink5;
                                this.messageText = replaceWithLink(replaceWithLink5, "un1", tLObject3);
                            }
                        } else if (messageAction instanceof TLRPC.TL_messageActionGeoProximityReached) {
                            TLRPC.TL_messageActionGeoProximityReached tL_messageActionGeoProximityReached = (TLRPC.TL_messageActionGeoProximityReached) messageAction;
                            long peerId = getPeerId(tL_messageActionGeoProximityReached.from_id);
                            if (peerId > 0) {
                                chat12 = getUser(abstractMap, hVar, peerId);
                            } else {
                                tL_messageActionGeoProximityReached = tL_messageActionGeoProximityReached;
                                chat12 = getChat(abstractMap2, hVar2, -peerId);
                            }
                            long peerId2 = getPeerId(tL_messageActionGeoProximityReached.to_id);
                            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                            if (peerId2 == clientUserId) {
                                this.messageText = replaceWithLink(LocaleController.formatString(R.string.ActionUserWithinRadius, LocaleController.formatDistance(tL_messageActionGeoProximityReached.distance, 2)), "un1", chat12);
                            } else {
                                TLObject user11 = peerId2 > 0 ? getUser(abstractMap, hVar, peerId2) : getChat(abstractMap2, hVar2, -peerId2);
                                if (peerId == clientUserId) {
                                    this.messageText = replaceWithLink(LocaleController.formatString(R.string.ActionUserWithinYouRadius, LocaleController.formatDistance(tL_messageActionGeoProximityReached.distance, 2)), "un1", user11);
                                } else {
                                    CharSequence replaceWithLink6 = replaceWithLink(LocaleController.formatString(R.string.ActionUserWithinOtherRadius, LocaleController.formatDistance(tL_messageActionGeoProximityReached.distance, 2)), "un2", user11);
                                    this.messageText = replaceWithLink6;
                                    this.messageText = replaceWithLink(replaceWithLink6, "un1", chat12);
                                }
                            }
                        } else if (messageAction instanceof TLRPC.TL_messageActionCustomAction) {
                            this.messageText = messageAction.message;
                        } else if (messageAction instanceof TLRPC.TL_messageActionChatCreate) {
                            if (isOut()) {
                                this.messageText = LocaleController.getString(R.string.ActionYouCreateGroup);
                            } else {
                                this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionCreateGroup), "un1", tLObject3);
                            }
                        } else if (messageAction instanceof TLRPC.TL_messageActionChatDeleteUser) {
                            if (isFromUser()) {
                                TLRPC.Message message3 = this.messageOwner;
                                if (message3.action.user_id == message3.from_id.user_id) {
                                    if (isOut()) {
                                        this.messageText = LocaleController.getString(R.string.ActionYouLeftUser);
                                    } else {
                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionLeftUser), "un1", tLObject3);
                                    }
                                }
                            }
                            TLRPC.User user12 = getUser(abstractMap, hVar, this.messageOwner.action.user_id);
                            if (isOut()) {
                                this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionYouKickUser), "un2", user12);
                            } else if (this.messageOwner.action.user_id == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                                this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionKickUserYou), "un1", tLObject3);
                            } else {
                                CharSequence replaceWithLink7 = replaceWithLink(LocaleController.getString(R.string.ActionKickUser), "un2", user12);
                                this.messageText = replaceWithLink7;
                                this.messageText = replaceWithLink(replaceWithLink7, "un1", tLObject3);
                            }
                        } else if (messageAction instanceof TLRPC.TL_messageActionPaymentRefunded) {
                            TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded = (TLRPC.TL_messageActionPaymentRefunded) messageAction;
                            long peerDialogId = DialogObject.getPeerDialogId(tL_messageActionPaymentRefunded.peer);
                            TLObject user13 = peerDialogId >= 0 ? getUser(abstractMap, hVar, peerDialogId) : getChat(abstractMap2, hVar2, -peerDialogId);
                            int i18 = R.string.ActionRefunded;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(tL_messageActionPaymentRefunded.currency);
                            sb3.append(" ");
                            this.messageText = hh.oa.Q0(replaceWithLink(LocaleController.formatString(i18, i0.a.m(tL_messageActionPaymentRefunded.total_amount, ',', sb3)), "un1", user13));
                        } else {
                            boolean g10 = hf.d.g(messageAction, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class);
                            hf.b bVar = hf.b.b;
                            if (g10) {
                                String h = wf.c.h(this.currentAccount, DialogObject.getPeerDialogId(this.messageOwner.peer_id));
                                if (h == null) {
                                    TLRPC.Chat chat14 = getChat(abstractMap2, hVar2, -DialogObject.getPeerDialogId(this.messageOwner.peer_id));
                                    if (chat14 != null) {
                                        long j12 = chat14.linked_monoforum_id;
                                        if (j12 != 0 && (chat11 = getChat(abstractMap2, hVar2, j12)) != null) {
                                            chat14 = chat11;
                                        }
                                    }
                                    h = DialogObject.getDialogTitle(chat14);
                                }
                                String name = DialogObject.getName(getUser(abstractMap, hVar, DialogObject.getPeerDialogId(this.messageOwner.saved_peer_id)));
                                MessageSuggestionParams obtainSuggestionOfferFromReply = obtainSuggestionOfferFromReply();
                                TLRPC.MessageAction messageAction2 = this.messageOwner.action;
                                if (messageAction2 instanceof TLRPC.TL_messageActionSuggestedPostRefund) {
                                    boolean z13 = ((TLRPC.TL_messageActionSuggestedPostRefund) messageAction2).payer_initiated;
                                    if (obtainSuggestionOfferFromReply == null || (aVar2 = obtainSuggestionOfferFromReply.amount) == null) {
                                        this.messageText = LocaleController.formatString(z13 ? R.string.SuggestedOfferRefundByUserAmountUnknown : R.string.SuggestedOfferRefundByAdminAmountUnknown, name, h);
                                    } else {
                                        this.messageText = hh.oa.S0(LocaleController.formatString(z13 ? R.string.SuggestedOfferRefundByUserAmountF : R.string.SuggestedOfferRefundByAdminAmountF, name, h, aVar2.b()), aVar2.a == bVar);
                                    }
                                } else if (messageAction2 instanceof TLRPC.TL_messageActionSuggestedPostSuccess) {
                                    if (obtainSuggestionOfferFromReply == null || (aVar = obtainSuggestionOfferFromReply.amount) == null) {
                                        this.messageText = LocaleController.formatString(R.string.SuggestedOfferCompleteAmountUnknown, h);
                                    } else {
                                        this.messageText = hh.oa.S0(LocaleController.formatString(R.string.SuggestedOfferCompleteAmountF, h, aVar.b()), aVar.a == bVar);
                                    }
                                }
                            } else {
                                TLRPC.Message message4 = this.messageOwner;
                                TLRPC.MessageAction messageAction3 = message4.action;
                                TLRPC.Chat chat15 = chat;
                                if (messageAction3 instanceof TLRPC.TL_messageActionChatAddUser) {
                                    long j13 = messageAction3.user_id;
                                    if (j13 == 0 && messageAction3.users.size() == 1) {
                                        j13 = this.messageOwner.action.users.get(0).longValue();
                                    }
                                    if (j13 != 0) {
                                        TLRPC.User user14 = getUser(abstractMap, hVar, j13);
                                        long j14 = this.messageOwner.peer_id.channel_id;
                                        TLRPC.Chat chat16 = j14 != 0 ? getChat(abstractMap2, hVar2, j14) : null;
                                        TLRPC.Peer peer4 = this.messageOwner.from_id;
                                        if (peer4 == null || j13 != peer4.user_id) {
                                            if (isOut()) {
                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionYouAddUser), "un2", user14);
                                            } else if (j13 != UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                                                CharSequence replaceWithLink8 = replaceWithLink(LocaleController.getString(R.string.ActionAddUser), "un2", user14);
                                                this.messageText = replaceWithLink8;
                                                this.messageText = replaceWithLink(replaceWithLink8, "un1", tLObject3);
                                            } else if (this.messageOwner.peer_id.channel_id == 0) {
                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionAddUserYou), "un1", tLObject3);
                                            } else if (chat16 == null || !chat16.megagroup) {
                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.ChannelAddedBy), "un1", tLObject3);
                                            } else {
                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.MegaAddedBy), "un1", tLObject3);
                                            }
                                        } else if (ChatObject.isChannel(chat16) && !chat16.megagroup) {
                                            this.channelJoined = true;
                                            this.messageText = LocaleController.getString(R.string.ChannelJoined);
                                        } else if (this.messageOwner.peer_id.channel_id != 0) {
                                            if (j13 == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                                                this.messageText = LocaleController.getString(R.string.ChannelMegaJoined);
                                            } else {
                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionAddUserSelfMega), "un1", tLObject3);
                                            }
                                        } else if (isOut()) {
                                            this.messageText = LocaleController.getString(R.string.ActionAddUserSelfYou);
                                        } else {
                                            this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionAddUserSelf), "un1", tLObject3);
                                        }
                                    } else if (isOut()) {
                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionYouAddUser), "un2", this.messageOwner.action.users, abstractMap, hVar);
                                    } else {
                                        CharSequence replaceWithLink9 = replaceWithLink(LocaleController.getString(R.string.ActionAddUser), "un2", this.messageOwner.action.users, abstractMap, hVar);
                                        this.messageText = replaceWithLink9;
                                        this.messageText = replaceWithLink(replaceWithLink9, "un1", tLObject3);
                                    }
                                } else if (messageAction3 instanceof TLRPC.TL_messageActionChatJoinedViaCommunity) {
                                    TLRPC.Chat chat17 = getChat(abstractMap2, hVar2, ((TLRPC.TL_messageActionChatJoinedViaCommunity) messageAction3).community_id);
                                    boolean isChannelAndNotMegaGroup2 = ChatObject.isChannelAndNotMegaGroup(getChat(abstractMap2, hVar2, -DialogObject.getPeerDialogId(this.messageOwner.peer_id)));
                                    if (isOut()) {
                                        this.messageText = replaceWithLink(LocaleController.getString(isChannelAndNotMegaGroup2 ? R.string.ActionJoinedFromCommunityYouChannel : R.string.ActionJoinedFromCommunityYou), "un1", chat17);
                                    } else {
                                        CharSequence replaceWithLink10 = replaceWithLink(LocaleController.getString(R.string.ActionJoinedFromCommunityUser), "un1", chat17);
                                        this.messageText = replaceWithLink10;
                                        this.messageText = replaceWithLink(replaceWithLink10, "un2", tLObject3);
                                    }
                                } else if (messageAction3 instanceof TLRPC.TL_messageActionChatJoinedByLink) {
                                    if (isOut()) {
                                        this.messageText = LocaleController.getString(R.string.ActionInviteYou);
                                    } else {
                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionInviteUser), "un1", tLObject3);
                                    }
                                } else if (messageAction3 instanceof TLRPC.TL_messageActionGiveawayLaunch) {
                                    TLRPC.TL_messageActionGiveawayLaunch tL_messageActionGiveawayLaunch = (TLRPC.TL_messageActionGiveawayLaunch) messageAction3;
                                    TLRPC.Peer peer5 = message4.peer_id;
                                    if (peer5 != null) {
                                        long j15 = peer5.channel_id;
                                        if (j15 != 0) {
                                            chat10 = getChat(abstractMap2, hVar2, j15);
                                            boolean isChannelAndNotMegaGroup3 = ChatObject.isChannelAndNotMegaGroup(chat10);
                                            if ((tL_messageActionGiveawayLaunch.flags & 1) == 0) {
                                                this.messageText = LocaleController.formatPluralStringComma(isChannelAndNotMegaGroup3 ? "BoostingStarsGiveawayJustStarted" : "BoostingStarsGiveawayJustStartedGroup", (int) tL_messageActionGiveawayLaunch.stars, chat10 != null ? chat10.title : "");
                                            } else {
                                                this.messageText = LocaleController.formatString(isChannelAndNotMegaGroup3 ? R.string.BoostingGiveawayJustStarted : R.string.BoostingGiveawayJustStartedGroup, chat10 != null ? chat10.title : "");
                                            }
                                        }
                                    }
                                    chat10 = null;
                                    boolean isChannelAndNotMegaGroup32 = ChatObject.isChannelAndNotMegaGroup(chat10);
                                    if ((tL_messageActionGiveawayLaunch.flags & 1) == 0) {
                                    }
                                } else if (messageAction3 instanceof TLRPC.TL_messageActionBoostApply) {
                                    TLRPC.Peer peer6 = message4.peer_id;
                                    if (peer6 != null) {
                                        long j16 = peer6.channel_id;
                                        if (j16 != 0) {
                                            chat9 = getChat(abstractMap2, hVar2, j16);
                                            boolean isChannelAndNotMegaGroup4 = ChatObject.isChannelAndNotMegaGroup(chat9);
                                            TLRPC.TL_messageActionBoostApply tL_messageActionBoostApply = (TLRPC.TL_messageActionBoostApply) this.messageOwner.action;
                                            if (tLObject3 instanceof TLRPC.User) {
                                                str8 = tLObject3 instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject3).title : "";
                                                z11 = false;
                                            } else {
                                                TLRPC.User user15 = (TLRPC.User) tLObject3;
                                                z11 = UserObject.isUserSelf(user15);
                                                str8 = UserObject.getFirstName(user15);
                                            }
                                            if (z11) {
                                                int i19 = tL_messageActionBoostApply.boosts;
                                                if (i19 <= 1) {
                                                    this.messageText = LocaleController.formatString(isChannelAndNotMegaGroup4 ? R.string.BoostingBoostsChannelByUserServiceMsg : R.string.BoostingBoostsGroupByUserServiceMsg, str8);
                                                } else {
                                                    this.messageText = LocaleController.formatPluralString(isChannelAndNotMegaGroup4 ? "BoostingBoostsChannelByUserServiceMsgCount" : "BoostingBoostsGroupByUserServiceMsgCount", i19, str8);
                                                }
                                            } else {
                                                int i20 = tL_messageActionBoostApply.boosts;
                                                if (i20 <= 1) {
                                                    this.messageText = LocaleController.getString(isChannelAndNotMegaGroup4 ? R.string.BoostingBoostsChannelByYouServiceMsg : R.string.BoostingBoostsGroupByYouServiceMsg);
                                                } else {
                                                    this.messageText = LocaleController.formatPluralString(isChannelAndNotMegaGroup4 ? "BoostingBoostsChannelByYouServiceMsgCount" : "BoostingBoostsGroupByYouServiceMsgCount", i20, new Object[0]);
                                                }
                                            }
                                        }
                                    }
                                    chat9 = null;
                                    boolean isChannelAndNotMegaGroup42 = ChatObject.isChannelAndNotMegaGroup(chat9);
                                    TLRPC.TL_messageActionBoostApply tL_messageActionBoostApply2 = (TLRPC.TL_messageActionBoostApply) this.messageOwner.action;
                                    if (tLObject3 instanceof TLRPC.User) {
                                    }
                                    if (z11) {
                                    }
                                } else if (messageAction3 instanceof TLRPC.TL_messageActionGiveawayResults) {
                                    TLRPC.Peer peer7 = message4.peer_id;
                                    if (peer7 != null) {
                                        long j17 = peer7.channel_id;
                                        if (j17 != 0) {
                                            chat8 = getChat(abstractMap2, hVar2, j17);
                                            boolean isChannelAndNotMegaGroup5 = ChatObject.isChannelAndNotMegaGroup(chat8);
                                            tL_messageActionGiveawayResults = (TLRPC.TL_messageActionGiveawayResults) this.messageOwner.action;
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                            if (tL_messageActionGiveawayResults.stars) {
                                                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("BoostingGiveawayServiceWinnersSelected", tL_messageActionGiveawayResults.winners_count, new Object[0]));
                                                if (tL_messageActionGiveawayResults.unclaimed_count > 0) {
                                                    spannableStringBuilder.append((CharSequence) "\n");
                                                    spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString(isChannelAndNotMegaGroup5 ? "BoostingGiveawayServiceUndistributed" : "BoostingGiveawayServiceUndistributedGroup", tL_messageActionGiveawayResults.unclaimed_count, new Object[0]));
                                                }
                                            } else {
                                                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("BoostingStarsGiveawayServiceWinnersSelected", tL_messageActionGiveawayResults.winners_count));
                                                if (tL_messageActionGiveawayResults.unclaimed_count > 0) {
                                                    spannableStringBuilder.append((CharSequence) "\n");
                                                    spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString(isChannelAndNotMegaGroup5 ? "BoostingStarsGiveawayServiceUndistributed" : "BoostingStarsGiveawayServiceUndistributedGroup", tL_messageActionGiveawayResults.unclaimed_count, new Object[0]));
                                                }
                                            }
                                            this.messageText = spannableStringBuilder;
                                        }
                                    }
                                    chat8 = null;
                                    boolean isChannelAndNotMegaGroup52 = ChatObject.isChannelAndNotMegaGroup(chat8);
                                    tL_messageActionGiveawayResults = (TLRPC.TL_messageActionGiveawayResults) this.messageOwner.action;
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                    if (tL_messageActionGiveawayResults.stars) {
                                    }
                                    this.messageText = spannableStringBuilder2;
                                } else if (messageAction3 instanceof TLRPC.TL_messageActionPrizeStars) {
                                    TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) messageAction3;
                                    this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("ActionStarGiveawayPrize", (int) tL_messageActionPrizeStars.stars)), "un1", getChat(abstractMap2, hVar2, -DialogObject.getPeerDialogId(tL_messageActionPrizeStars.boost_peer)));
                                } else if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction3;
                                    if (tL_messageActionStarGift.prepaid_upgrade) {
                                        i11 = (int) tL_messageActionStarGift.upgrade_stars;
                                    } else {
                                        TL_stars.StarGift starGift = tL_messageActionStarGift.gift;
                                        i11 = starGift != null ? (int) starGift.stars : 0;
                                        if (!tL_messageActionStarGift.upgrade_separate) {
                                            i11 += (int) tL_messageActionStarGift.upgrade_stars;
                                        }
                                    }
                                    TLRPC.Peer peer8 = tL_messageActionStarGift.peer;
                                    boolean z14 = peer8 != null && DialogObject.getPeerDialogId(peer8) < 0;
                                    TLRPC.User user16 = getUser(abstractMap, hVar, this.messageOwner.peer_id.user_id);
                                    if (tL_messageActionStarGift.prepaid_upgrade || (peer = tL_messageActionStarGift.from_id) == null) {
                                        str6 = "un2";
                                    } else {
                                        str6 = "un2";
                                        long peerDialogId2 = DialogObject.getPeerDialogId(peer);
                                        tLObject3 = peerDialogId2 >= 0 ? getUser(abstractMap, hVar, peerDialogId2) : getChat(abstractMap2, hVar2, -peerDialogId2);
                                    }
                                    TLRPC.Peer peer9 = tL_messageActionStarGift.peer;
                                    if (peer9 != null) {
                                        long peerDialogId3 = DialogObject.getPeerDialogId(peer9);
                                        tLObject2 = peerDialogId3 >= 0 ? getUser(abstractMap, hVar, peerDialogId3) : getChat(abstractMap2, hVar2, -peerDialogId3);
                                    } else {
                                        tLObject2 = null;
                                    }
                                    if (tL_messageActionStarGift.prepaid_upgrade) {
                                        if ((tLObject3 instanceof TLRPC.User) && ((TLRPC.User) tLObject3).self && !tL_messageActionStarGift.forceIn) {
                                            this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionPrepaidGiftOutbound)), "un1", user16);
                                        } else {
                                            this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionPrepaidGiftInbound)), "un1", tLObject3);
                                        }
                                    } else if (UserObject.isService(getDialogId()) && tL_messageActionStarGift.from_id == null) {
                                        this.messageText = AndroidUtilities.replaceTags(LocaleController.getString(tL_messageActionStarGift.auction_acquired ? R.string.ActionGiftAuctionSelf : R.string.ActionGiftSomeone));
                                        this.messageTextShort = LocaleController.getString(R.string.ActionStarGift);
                                    } else {
                                        if (z14) {
                                            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("ActionGiftChannel", i11));
                                            this.messageText = replaceTags;
                                            CharSequence replaceWithLink11 = replaceWithLink(replaceTags, "un1", tLObject3);
                                            this.messageText = replaceWithLink11;
                                            str7 = str6;
                                            this.messageText = replaceWithLink(replaceWithLink11, str7, tLObject2);
                                            this.messageTextShort = LocaleController.getString(R.string.ActionStarGift);
                                        } else {
                                            str7 = str6;
                                            if (UserObject.isUserSelf(user16)) {
                                                this.messageText = AndroidUtilities.replaceTags(LocaleController.getString(tL_messageActionStarGift.auction_acquired ? R.string.ActionGiftAuctionSelf : R.string.ActionGiftSelf));
                                                this.messageTextShort = LocaleController.getString(R.string.ActionStarGift);
                                            } else {
                                                boolean z15 = tLObject3 instanceof TLRPC.User;
                                                if (z15 && ((TLRPC.User) tLObject3).self && !tL_messageActionStarGift.forceIn) {
                                                    this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionGiftOutbound)), "un1", user16);
                                                    TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageActionStarGift.message;
                                                    if (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) {
                                                        this.messageTextShort = LocaleController.getString(R.string.ActionStarGift);
                                                    } else {
                                                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(tL_messageActionStarGift.message.text);
                                                        addEntitiesToText(spannableStringBuilder3, tL_messageActionStarGift.message.entities, isOutOwner(), false, false, false);
                                                        this.messageTextShort = spannableStringBuilder3;
                                                    }
                                                } else if (z15 && UserObject.isService(((TLRPC.User) tLObject3).id)) {
                                                    this.messageText = TextUtils.replace(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionGiftInbound)), new String[]{"un1"}, new CharSequence[]{LocaleController.getString(R.string.StarsTransactionUnknown)});
                                                } else {
                                                    this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionGiftInbound)), "un1", tLObject3);
                                                    TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageActionStarGift.message;
                                                    if (tL_textWithEntities3 == null || TextUtils.isEmpty(tL_textWithEntities3.text)) {
                                                        this.messageTextShort = LocaleController.getString(R.string.ActionStarGift);
                                                    } else {
                                                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(tL_messageActionStarGift.message.text);
                                                        addEntitiesToText(spannableStringBuilder4, tL_messageActionStarGift.message.entities, isOutOwner(), false, false, false);
                                                        this.messageTextShort = spannableStringBuilder4;
                                                    }
                                                }
                                            }
                                        }
                                        indexOf = this.messageText.toString().indexOf(str7);
                                        if (indexOf != -1) {
                                            this.messageText = SpannableStringBuilder.valueOf(this.messageText).replace(indexOf, indexOf + 3, (CharSequence) LocaleController.formatPluralStringComma("Gift2StarsCount", i11));
                                        }
                                    }
                                    str7 = str6;
                                    indexOf = this.messageText.toString().indexOf(str7);
                                    if (indexOf != -1) {
                                    }
                                } else if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                                    TLRPC.User user17 = getUser(abstractMap, hVar, getDialogId());
                                    TL_stars.StarsAmount starsAmount = tL_messageActionStarGiftUnique.resale_amount;
                                    if (starsAmount != null) {
                                        hf.a m10 = hf.a.m(starsAmount);
                                        long dialogId = getDialogId();
                                        TLRPC.Peer peer10 = tL_messageActionStarGiftUnique.from_id;
                                        if (peer10 != null) {
                                            dialogId = DialogObject.getPeerDialogId(peer10);
                                        }
                                        TLObject user18 = dialogId >= 0 ? getUser(abstractMap, hVar, dialogId) : getChat(abstractMap2, hVar2, -dialogId);
                                        if (tL_messageActionStarGiftUnique.craft) {
                                            this.messageText = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionUniqueGiftCrafted));
                                        } else {
                                            TLRPC.Peer peer11 = tL_messageActionStarGiftUnique.peer;
                                            if (peer11 != null) {
                                                long peerDialogId4 = DialogObject.getPeerDialogId(peer11);
                                                TLObject user19 = peerDialogId4 >= 0 ? getUser(abstractMap, hVar, peerDialogId4) : getChat(abstractMap2, hVar2, -peerDialogId4);
                                                if (m10.a == bVar) {
                                                    this.messageText = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.ActionUniqueGiftResaleServiceTON, m10.d()));
                                                } else {
                                                    this.messageText = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("ActionUniqueGiftResaleService", (int) m10.a()));
                                                }
                                                CharSequence replaceWithLink12 = replaceWithLink(this.messageText, "un1", user18);
                                                this.messageText = replaceWithLink12;
                                                this.messageText = replaceWithLink(replaceWithLink12, "un2", user19);
                                            } else {
                                                if (tL_messageActionStarGiftUnique.from_offer) {
                                                    if (m10.a == bVar) {
                                                        this.messageText = AndroidUtilities.replaceTags(LocaleController.formatString(isOutOwner() ? R.string.ActionUniqueGiftResaleSoldOutboundTON : R.string.ActionUniqueGiftResaleOutboundTON, m10.d()));
                                                    } else {
                                                        this.messageText = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(isOutOwner() ? "ActionUniqueGiftResaleSoldOutbound" : "ActionUniqueGiftResaleOutbound", (int) m10.a()));
                                                    }
                                                } else if (m10.a == bVar) {
                                                    this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.formatString(isOutOwner() ? R.string.ActionUniqueGiftResaleOutboundTON : R.string.ActionUniqueGiftResaleInboundTON, m10.d())), "un1", user18);
                                                } else {
                                                    this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(isOutOwner() ? "ActionUniqueGiftResaleOutbound" : "ActionUniqueGiftResaleInbound", (int) m10.a())), "un1", user18);
                                                }
                                            }
                                        }
                                    } else if (tL_messageActionStarGiftUnique.upgrade) {
                                        TLRPC.Peer peer12 = tL_messageActionStarGiftUnique.peer;
                                        if (peer12 != null) {
                                            long peerDialogId5 = DialogObject.getPeerDialogId(peer12);
                                            this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionUniqueGiftUpgradeInboundChannel)), "un1", peerDialogId5 >= 0 ? getUser(abstractMap, hVar, peerDialogId5) : getChat(abstractMap2, hVar2, -peerDialogId5));
                                        } else if (UserObject.isUserSelf(user17)) {
                                            this.messageText = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionUniqueGiftUpgradeSelf));
                                        } else {
                                            this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.getString(isOutOwner() ? R.string.ActionUniqueGiftUpgradeOutbound : R.string.ActionUniqueGiftUpgradeInbound)), "un1", user17);
                                        }
                                    } else {
                                        long dialogId2 = getDialogId();
                                        TLRPC.Peer peer13 = tL_messageActionStarGiftUnique.from_id;
                                        if (peer13 != null) {
                                            dialogId2 = DialogObject.getPeerDialogId(peer13);
                                        }
                                        TLObject user20 = dialogId2 >= 0 ? getUser(abstractMap, hVar, dialogId2) : getChat(abstractMap2, hVar2, -dialogId2);
                                        if (tL_messageActionStarGiftUnique.craft) {
                                            this.messageText = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionUniqueGiftCrafted));
                                        } else {
                                            TLRPC.Peer peer14 = tL_messageActionStarGiftUnique.peer;
                                            if (peer14 != null) {
                                                long peerDialogId6 = DialogObject.getPeerDialogId(peer14);
                                                TLObject user21 = peerDialogId6 >= 0 ? getUser(abstractMap, hVar, peerDialogId6) : getChat(abstractMap2, hVar2, -peerDialogId6);
                                                SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionUniqueGiftTransferService));
                                                this.messageText = replaceTags2;
                                                CharSequence replaceWithLink13 = replaceWithLink(replaceTags2, "un1", user20);
                                                this.messageText = replaceWithLink13;
                                                this.messageText = replaceWithLink(replaceWithLink13, "un2", user21);
                                            } else if (tL_messageActionStarGiftUnique.assigned) {
                                                StringBuilder sb4 = new StringBuilder();
                                                sb4.append(tL_messageActionStarGiftUnique.gift.title);
                                                sb4.append(" #");
                                                this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.ActionUniqueGiftTransferOutboundAssigned, i0.a.m(tL_messageActionStarGiftUnique.gift.num, ',', sb4))), "un1", user20);
                                            } else {
                                                this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.getString(isOutOwner() ? R.string.ActionUniqueGiftTransferOutbound : R.string.ActionUniqueGiftTransferInbound)), "un1", user20);
                                            }
                                        }
                                    }
                                } else {
                                    if (messageAction3 instanceof TLRPC.TL_messageActionGiftStars) {
                                        boolean z16 = tLObject3 instanceof TLRPC.User;
                                        if (z16 && ((TLRPC.User) tLObject3).self) {
                                            this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionGiftOutbound)), "un1", getUser(abstractMap, hVar, message4.peer_id.user_id));
                                        } else if (z16 && UserObject.isService(((TLRPC.User) tLObject3).id)) {
                                            this.messageText = TextUtils.replace(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionGiftInbound)), new String[]{"un1"}, new CharSequence[]{LocaleController.getString(R.string.StarsTransactionUnknown)});
                                        } else {
                                            this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionGiftInbound)), "un1", tLObject3);
                                        }
                                        int indexOf2 = this.messageText.toString().indexOf("un2");
                                        if (indexOf2 != -1) {
                                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(this.messageText);
                                            BillingController billingController = BillingController.getInstance();
                                            TLRPC.MessageAction messageAction4 = this.messageOwner.action;
                                            String formatCurrency = billingController.formatCurrency(messageAction4.amount, messageAction4.currency);
                                            if ((this.messageOwner.action.flags & 1) != 0) {
                                                formatCurrency = String.format("%.2f", Double.valueOf(Math.pow(10.0d, -9.0d) * this.messageOwner.action.cryptoAmount)) + " " + this.messageOwner.action.cryptoCurrency + " (~ " + ((Object) formatCurrency) + ")";
                                            }
                                            this.messageText = valueOf.replace(indexOf2, indexOf2 + 3, (CharSequence) formatCurrency);
                                        }
                                    } else if ((messageAction3 instanceof TLRPC.TL_messageActionGiftCode) && ((TLRPC.TL_messageActionGiftCode) messageAction3).boost_peer != null) {
                                        this.messageText = LocaleController.getString(R.string.BoostingReceivedGiftNoName);
                                    } else if (hf.d.g(messageAction3, TLRPC.TL_messageActionGiftPremium.class, TLRPC.TL_messageActionGiftCode.class, TLRPC.TL_messageActionGiftTon.class)) {
                                        if ((tLObject3 instanceof TLRPC.User) && ((TLRPC.User) tLObject3).self) {
                                            this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionGiftOutbound)), "un1", getUser(abstractMap, hVar, this.messageOwner.peer_id.user_id));
                                        } else if (this.messageOwner.action instanceof TLRPC.TL_messageActionGiftTon) {
                                            this.messageText = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionGiftTonInbound));
                                        } else {
                                            this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionGiftInbound)), "un1", tLObject3);
                                        }
                                        int indexOf3 = this.messageText.toString().indexOf("un2");
                                        if (indexOf3 != -1) {
                                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(this.messageText);
                                            BillingController billingController2 = BillingController.getInstance();
                                            TLRPC.MessageAction messageAction5 = this.messageOwner.action;
                                            String formatCurrency2 = billingController2.formatCurrency(messageAction5.amount, messageAction5.currency);
                                            if ((this.messageOwner.action.flags & 1) != 0) {
                                                formatCurrency2 = String.format("%.2f", Double.valueOf(Math.pow(10.0d, -9.0d) * this.messageOwner.action.cryptoAmount)) + " " + this.messageOwner.action.cryptoCurrency + " (~ " + ((Object) formatCurrency2) + ")";
                                            }
                                            this.messageText = valueOf2.replace(indexOf3, indexOf3 + 3, (CharSequence) formatCurrency2);
                                        }
                                        this.messageText = hh.oa.Q0(this.messageText);
                                    } else {
                                        TLRPC.Message message5 = this.messageOwner;
                                        TLRPC.MessageAction messageAction6 = message5.action;
                                        if (messageAction6 instanceof TLRPC.TL_messageActionSuggestBirthday) {
                                            if (isOutOwner()) {
                                                this.messageText = LocaleController.getString(R.string.ActionYouSuggestBirthday);
                                            } else {
                                                this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionSuggestBirthday)), "un1", tLObject3);
                                            }
                                        } else if (messageAction6 instanceof TLRPC.TL_messageActionSuggestProfilePhoto) {
                                            TLRPC.Photo photo = messageAction6.photo;
                                            if (photo == null || (arrayList = photo.video_sizes) == null || arrayList.isEmpty()) {
                                                this.messageText = LocaleController.getString(R.string.ActionSuggestPhotoShort);
                                            } else {
                                                this.messageText = LocaleController.getString(R.string.ActionSuggestVideoShort);
                                            }
                                        } else if (messageAction6 instanceof TLRPC.TL_messageActionChatEditPhoto) {
                                            TLRPC.Peer peer15 = message5.peer_id;
                                            if (peer15 != null) {
                                                long j18 = peer15.channel_id;
                                                if (j18 != 0) {
                                                    chat7 = getChat(abstractMap2, hVar2, j18);
                                                    if (ChatObject.isChannel(chat7) || chat7.megagroup) {
                                                        if (isOut()) {
                                                            if (isVideoAvatar()) {
                                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionChangedVideo), "un1", tLObject3);
                                                            } else {
                                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionChangedPhoto), "un1", tLObject3);
                                                            }
                                                        } else if (isVideoAvatar()) {
                                                            this.messageText = LocaleController.getString(R.string.ActionYouChangedVideo);
                                                        } else {
                                                            this.messageText = LocaleController.getString(R.string.ActionYouChangedPhoto);
                                                        }
                                                    } else if (isVideoAvatar()) {
                                                        this.messageText = LocaleController.getString(R.string.ActionChannelChangedVideo);
                                                    } else {
                                                        this.messageText = LocaleController.getString(R.string.ActionChannelChangedPhoto);
                                                    }
                                                }
                                            }
                                            chat7 = null;
                                            if (ChatObject.isChannel(chat7)) {
                                            }
                                            if (isOut()) {
                                            }
                                        } else if (messageAction6 instanceof TLRPC.TL_messageActionChatEditTitle) {
                                            TLRPC.Peer peer16 = message5.peer_id;
                                            if (peer16 != null) {
                                                long j19 = peer16.channel_id;
                                                if (j19 != 0) {
                                                    chat6 = getChat(abstractMap2, hVar2, j19);
                                                    if (!ChatObject.isChannel(chat6) && !chat6.megagroup) {
                                                        this.messageText = LocaleController.getString(R.string.ActionChannelChangedTitle).replace("un2", this.messageOwner.action.title);
                                                    } else if (isOut()) {
                                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionChangedTitle).replace("un2", this.messageOwner.action.title), "un1", tLObject3);
                                                    } else {
                                                        this.messageText = LocaleController.getString(R.string.ActionYouChangedTitle).replace("un2", this.messageOwner.action.title);
                                                    }
                                                }
                                            }
                                            chat6 = null;
                                            if (!ChatObject.isChannel(chat6)) {
                                            }
                                            if (isOut()) {
                                            }
                                        } else if (messageAction6 instanceof TLRPC.TL_messageActionChatDeletePhoto) {
                                            TLRPC.Peer peer17 = message5.peer_id;
                                            if (peer17 != null) {
                                                long j20 = peer17.channel_id;
                                                if (j20 != 0) {
                                                    chat5 = getChat(abstractMap2, hVar2, j20);
                                                    if (!ChatObject.isChannel(chat5) && !chat5.megagroup) {
                                                        this.messageText = LocaleController.getString(R.string.ActionChannelRemovedPhoto);
                                                    } else if (isOut()) {
                                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionRemovedPhoto), "un1", tLObject3);
                                                    } else {
                                                        this.messageText = LocaleController.getString(R.string.ActionYouRemovedPhoto);
                                                    }
                                                }
                                            }
                                            chat5 = null;
                                            if (!ChatObject.isChannel(chat5)) {
                                            }
                                            if (isOut()) {
                                            }
                                        } else if (messageAction6 instanceof TLRPC.TL_messageActionTTLChange) {
                                            if (messageAction6.ttl != 0) {
                                                if (isOut()) {
                                                    this.messageText = LocaleController.formatString(R.string.MessageLifetimeChangedOutgoing, LocaleController.formatTTLString(this.messageOwner.action.ttl));
                                                } else {
                                                    this.messageText = LocaleController.formatString(R.string.MessageLifetimeChanged, UserObject.getFirstName(user), LocaleController.formatTTLString(this.messageOwner.action.ttl));
                                                }
                                            } else if (isOut()) {
                                                this.messageText = LocaleController.getString(R.string.MessageLifetimeYouRemoved);
                                            } else {
                                                this.messageText = LocaleController.formatString(R.string.MessageLifetimeRemoved, UserObject.getFirstName(user));
                                            }
                                        } else if (messageAction6 instanceof TLRPC.TL_messageActionRequestedPeer) {
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList<TLRPC.Peer> arrayList5 = ((TLRPC.TL_messageActionRequestedPeer) this.messageOwner.action).peers;
                                            int size2 = arrayList5.size();
                                            int i21 = 0;
                                            int i22 = 0;
                                            int i23 = 0;
                                            int i24 = 0;
                                            while (i24 < size2) {
                                                TLRPC.Peer peer18 = arrayList5.get(i24);
                                                i24++;
                                                TLRPC.Peer peer19 = peer18;
                                                ArrayList<TLRPC.Peer> arrayList6 = arrayList5;
                                                boolean z17 = peer19 instanceof TLRPC.TL_peerUser;
                                                if (z17) {
                                                    z10 = z17;
                                                    str5 = str10;
                                                    i10 = size2;
                                                    tLObject = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peer19.user_id));
                                                    if (tLObject == null) {
                                                        tLObject = getUser(abstractMap, hVar, peer19.user_id);
                                                    }
                                                } else {
                                                    z10 = z17;
                                                    str5 = str10;
                                                    i10 = size2;
                                                    if (peer19 instanceof TLRPC.TL_peerChat) {
                                                        tLObject = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(peer19.chat_id));
                                                        if (tLObject == null) {
                                                            tLObject = getChat(abstractMap2, hVar2, peer19.chat_id);
                                                        }
                                                    } else if (peer19 instanceof TLRPC.TL_peerChannel) {
                                                        tLObject = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(peer19.channel_id));
                                                        if (tLObject == null) {
                                                            tLObject = getChat(abstractMap2, hVar2, peer19.channel_id);
                                                        }
                                                    } else {
                                                        tLObject = null;
                                                    }
                                                }
                                                if (z10) {
                                                    i21++;
                                                } else if (peer19 instanceof TLRPC.TL_peerChat) {
                                                    i23++;
                                                } else {
                                                    i22++;
                                                }
                                                if (tLObject != null) {
                                                    arrayList4.add(tLObject);
                                                }
                                                arrayList5 = arrayList6;
                                                size2 = i10;
                                                str10 = str5;
                                            }
                                            String str11 = str10;
                                            if (i21 > 0 && i21 != arrayList4.size()) {
                                                this.messageText = LocaleController.getPluralString("ActionRequestedPeerUserPlural", i21);
                                            } else if (i22 > 0 && i22 != arrayList4.size()) {
                                                this.messageText = LocaleController.getPluralString("ActionRequestedPeerChannelPlural", i22);
                                            } else if (i23 <= 0 || i23 == arrayList4.size()) {
                                                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                                for (int i25 = 0; i25 < arrayList4.size(); i25++) {
                                                    spannableStringBuilder5.append(replaceWithLink("un1", "un1", (TLObject) arrayList4.get(i25)));
                                                    if (i25 < arrayList4.size() - 1) {
                                                        spannableStringBuilder5.append((CharSequence) ", ");
                                                    }
                                                }
                                                this.messageText = AndroidUtilities.replaceCharSequence("un1", LocaleController.getString(R.string.ActionRequestedPeer), spannableStringBuilder5);
                                            } else {
                                                this.messageText = LocaleController.getPluralString("ActionRequestedPeerChatPlural", i23);
                                            }
                                            TLRPC.User user22 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(getDialogId()));
                                            if (user22 == null) {
                                                user22 = getUser(abstractMap, hVar, getDialogId());
                                            }
                                            this.messageText = replaceWithLink(this.messageText, str11, user22);
                                        } else if (messageAction6 instanceof TLRPC.TL_messageActionSetMessagesTTL) {
                                            TLRPC.TL_messageActionSetMessagesTTL tL_messageActionSetMessagesTTL = (TLRPC.TL_messageActionSetMessagesTTL) messageAction6;
                                            TLRPC.Peer peer20 = message5.peer_id;
                                            if (peer20 != null) {
                                                long j21 = peer20.channel_id;
                                                if (j21 != 0) {
                                                    chat4 = getChat(abstractMap2, hVar2, j21);
                                                    if (chat4 != null || chat4.megagroup) {
                                                        j10 = tL_messageActionSetMessagesTTL.auto_setting_from;
                                                        if (j10 == 0) {
                                                            this.drawServiceWithDefaultTypeface = true;
                                                            if (j10 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                                                this.messageText = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AutoDeleteGlobalActionFromYou, LocaleController.formatTTLString(tL_messageActionSetMessagesTTL.period)));
                                                            } else {
                                                                TLRPC.Chat chat18 = hVar != null ? (TLObject) hVar.f(tL_messageActionSetMessagesTTL.auto_setting_from) : null;
                                                                if (chat18 == null && abstractMap != null) {
                                                                    chat18 = abstractMap.get(Long.valueOf(tL_messageActionSetMessagesTTL.auto_setting_from));
                                                                }
                                                                if (chat18 == null && abstractMap2 != null) {
                                                                    chat18 = abstractMap2.get(Long.valueOf(tL_messageActionSetMessagesTTL.auto_setting_from));
                                                                }
                                                                if (chat18 == null) {
                                                                    chat18 = tL_messageActionSetMessagesTTL.auto_setting_from > 0 ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_messageActionSetMessagesTTL.auto_setting_from)) : MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-tL_messageActionSetMessagesTTL.auto_setting_from));
                                                                }
                                                                if (chat18 != null) {
                                                                    tLObject3 = chat18;
                                                                }
                                                                this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AutoDeleteGlobalAction, LocaleController.formatTTLString(tL_messageActionSetMessagesTTL.period))), "un1", tLObject3);
                                                            }
                                                        } else if (tL_messageActionSetMessagesTTL.period != 0) {
                                                            if (isOut()) {
                                                                this.messageText = LocaleController.formatString(R.string.ActionTTLYouChanged, LocaleController.formatTTLString(tL_messageActionSetMessagesTTL.period));
                                                            } else {
                                                                this.messageText = replaceWithLink(LocaleController.formatString(R.string.ActionTTLChanged, LocaleController.formatTTLString(tL_messageActionSetMessagesTTL.period)), "un1", tLObject3);
                                                            }
                                                        } else if (isOut()) {
                                                            this.messageText = LocaleController.getString(R.string.ActionTTLYouDisabled);
                                                        } else {
                                                            this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionTTLDisabled), "un1", tLObject3);
                                                        }
                                                    } else {
                                                        int i26 = tL_messageActionSetMessagesTTL.period;
                                                        if (i26 != 0) {
                                                            this.messageText = LocaleController.formatString(R.string.ActionTTLChannelChanged, LocaleController.formatTTLString(i26));
                                                        } else {
                                                            this.messageText = LocaleController.getString(R.string.ActionTTLChannelDisabled);
                                                        }
                                                    }
                                                }
                                            }
                                            chat4 = null;
                                            if (chat4 != null) {
                                            }
                                            j10 = tL_messageActionSetMessagesTTL.auto_setting_from;
                                            if (j10 == 0) {
                                            }
                                        } else if (messageAction6 instanceof TLRPC.TL_messageActionLoginUnknownLocation) {
                                            long j22 = message5.date * 1000;
                                            if (LocaleController.getInstance().getFormatterDay() == null || LocaleController.getInstance().getFormatterYear() == null) {
                                                str = "";
                                                str4 = str + this.messageOwner.date;
                                            } else {
                                                str4 = LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(j22), LocaleController.getInstance().getFormatterDay().format(j22));
                                                str = "";
                                            }
                                            TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                                            if (currentUser == null) {
                                                currentUser = getUser(abstractMap, hVar, this.messageOwner.peer_id.user_id);
                                            }
                                            String firstName = currentUser != null ? UserObject.getFirstName(currentUser) : str;
                                            int i27 = R.string.NotificationUnrecognizedDevice;
                                            TLRPC.MessageAction messageAction7 = this.messageOwner.action;
                                            this.messageText = LocaleController.formatString(i27, firstName, str4, messageAction7.title, messageAction7.address);
                                        } else {
                                            str = "";
                                            if ((messageAction6 instanceof TLRPC.TL_messageActionUserJoined) || (messageAction6 instanceof TLRPC.TL_messageActionContactSignUp)) {
                                                this.messageText = LocaleController.formatString(R.string.NotificationContactJoined, UserObject.getUserName(user));
                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                                                this.messageText = LocaleController.formatString(R.string.NotificationContactNewPhoto, UserObject.getUserName(user));
                                            } else if (messageAction6 instanceof TLRPC.TL_messageEncryptedAction) {
                                                TLRPC.DecryptedMessageAction decryptedMessageAction = messageAction6.encryptedAction;
                                                if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) {
                                                    if (isOut()) {
                                                        this.messageText = LocaleController.getString(R.string.ActionTakeScreenshootYou);
                                                    } else {
                                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionTakeScreenshoot), "un1", tLObject3);
                                                    }
                                                } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) {
                                                    TLRPC.TL_decryptedMessageActionSetMessageTTL tL_decryptedMessageActionSetMessageTTL = (TLRPC.TL_decryptedMessageActionSetMessageTTL) decryptedMessageAction;
                                                    if (tL_decryptedMessageActionSetMessageTTL.ttl_seconds != 0) {
                                                        if (isOut()) {
                                                            this.messageText = LocaleController.formatString(R.string.MessageLifetimeChangedOutgoing, LocaleController.formatTTLString(tL_decryptedMessageActionSetMessageTTL.ttl_seconds));
                                                        } else {
                                                            this.messageText = LocaleController.formatString(R.string.MessageLifetimeChanged, UserObject.getFirstName(user), LocaleController.formatTTLString(tL_decryptedMessageActionSetMessageTTL.ttl_seconds));
                                                        }
                                                    } else if (isOut()) {
                                                        this.messageText = LocaleController.getString(R.string.MessageLifetimeYouRemoved);
                                                    } else {
                                                        this.messageText = LocaleController.formatString(R.string.MessageLifetimeRemoved, UserObject.getFirstName(user));
                                                    }
                                                }
                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionScreenshotTaken) {
                                                if (isOut()) {
                                                    this.messageText = LocaleController.getString(R.string.ActionTakeScreenshootYou);
                                                } else {
                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionTakeScreenshoot), "un1", tLObject3);
                                                }
                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionCreatedBroadcastList) {
                                                this.messageText = LocaleController.getString(R.string.YouCreatedBroadcastList);
                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionChannelCreate) {
                                                TLRPC.Peer peer21 = message5.peer_id;
                                                if (peer21 != null) {
                                                    long j23 = peer21.channel_id;
                                                    if (j23 != 0) {
                                                        chat3 = getChat(abstractMap2, hVar2, j23);
                                                        if (ChatObject.isChannel(chat3) || !chat3.megagroup) {
                                                            this.messageText = LocaleController.getString(R.string.ActionCreateChannel);
                                                        } else {
                                                            this.messageText = LocaleController.getString(R.string.ActionCreateMega);
                                                        }
                                                    }
                                                }
                                                chat3 = null;
                                                if (ChatObject.isChannel(chat3)) {
                                                }
                                                this.messageText = LocaleController.getString(R.string.ActionCreateChannel);
                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionChatMigrateTo) {
                                                this.messageText = LocaleController.getString(R.string.ActionMigrateFromGroup);
                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionChannelMigrateFrom) {
                                                this.messageText = LocaleController.getString(R.string.ActionMigrateFromGroup);
                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionPinMessage) {
                                                generatePinMessageText(user, user == null ? getChat(abstractMap2, hVar2, message5.peer_id.channel_id) : null);
                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionHistoryClear) {
                                                this.messageText = LocaleController.getString(R.string.HistoryCleared);
                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionTopicCreate) {
                                                this.messageText = LocaleController.getString(R.string.TopicCreated);
                                                TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = (TLRPC.TL_messageActionTopicCreate) this.messageOwner.action;
                                                TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                                                tL_forumTopic.icon_emoji_id = tL_messageActionTopicCreate.icon_emoji_id;
                                                tL_forumTopic.title = tL_messageActionTopicCreate.title;
                                                tL_forumTopic.icon_color = tL_messageActionTopicCreate.icon_color;
                                                this.messageTextShort = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.TopicWasCreatedAction), wf.c.j(tL_forumTopic, null, null));
                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionTopicEdit) {
                                                TLRPC.TL_messageActionTopicEdit tL_messageActionTopicEdit = (TLRPC.TL_messageActionTopicEdit) messageAction6;
                                                if (user != null) {
                                                    str3 = ContactsController.formatName(user.first_name, user.last_name);
                                                } else if (chat15 != null) {
                                                    str3 = chat15.title;
                                                    user = chat15;
                                                } else {
                                                    str3 = null;
                                                    user = null;
                                                }
                                                String trim = str3 != null ? str3.trim() : "DELETED";
                                                TLRPC.MessageAction messageAction8 = this.messageOwner.action;
                                                int i28 = messageAction8.flags;
                                                if ((i28 & 8) > 0) {
                                                    if (((TLRPC.TL_messageActionTopicEdit) messageAction8).hidden) {
                                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.TopicHidden2), "%s", user);
                                                        this.messageTextShort = LocaleController.getString(R.string.TopicHidden);
                                                    } else {
                                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.TopicShown2), "%s", user);
                                                        this.messageTextShort = LocaleController.getString(R.string.TopicShown);
                                                    }
                                                } else if ((i28 & 4) <= 0) {
                                                    int i29 = i28 & 2;
                                                    if (i29 != 0 && (i28 & 1) != 0) {
                                                        TLRPC.TL_forumTopic tL_forumTopic2 = new TLRPC.TL_forumTopic();
                                                        tL_forumTopic2.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                                        tL_forumTopic2.title = tL_messageActionTopicEdit.title;
                                                        tL_forumTopic2.icon_color = wf.a.k[0];
                                                        CharSequence j24 = wf.c.j(tL_forumTopic2, null, this.topicIconDrawable);
                                                        this.messageText = AndroidUtilities.replaceCharSequence("%2$s", AndroidUtilities.replaceCharSequence("%1$s", LocaleController.getString(R.string.TopicChangeIconAndTitleTo), trim), j24);
                                                        this.messageTextShort = LocaleController.getString(R.string.TopicRenamed);
                                                        this.messageTextForReply = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.TopicChangeIconAndTitleToInReply), j24);
                                                    } else if (i29 != 0) {
                                                        TLRPC.TL_forumTopic tL_forumTopic3 = new TLRPC.TL_forumTopic();
                                                        tL_forumTopic3.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                                        tL_forumTopic3.title = str;
                                                        tL_forumTopic3.icon_color = wf.a.k[0];
                                                        CharSequence j25 = wf.c.j(tL_forumTopic3, null, this.topicIconDrawable);
                                                        this.messageText = AndroidUtilities.replaceCharSequence("%2$s", AndroidUtilities.replaceCharSequence("%1$s", LocaleController.getString(R.string.TopicIconChangedTo), trim), j25);
                                                        this.messageTextShort = LocaleController.getString(R.string.TopicIconChanged);
                                                        this.messageTextForReply = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.TopicIconChangedToInReply), j25);
                                                    } else if ((i28 & 1) != 0) {
                                                        this.messageText = AndroidUtilities.replaceCharSequence("%2$s", AndroidUtilities.replaceCharSequence("%1$s", LocaleController.getString(R.string.TopicRenamedTo), trim), tL_messageActionTopicEdit.title);
                                                        this.messageTextShort = LocaleController.getString(R.string.TopicRenamed);
                                                        this.messageTextForReply = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.TopicRenamedToInReply), tL_messageActionTopicEdit.title);
                                                    }
                                                } else if (((TLRPC.TL_messageActionTopicEdit) messageAction8).closed) {
                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.TopicClosed2), "%s", user);
                                                    this.messageTextShort = LocaleController.getString(R.string.TopicClosed);
                                                } else {
                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.TopicRestarted2), "%s", user);
                                                    this.messageTextShort = LocaleController.getString(R.string.TopicRestarted);
                                                }
                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionGameScore) {
                                                generateGameMessageText(user);
                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionConferenceCall) {
                                                TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction6;
                                                if (isOutOwner()) {
                                                    this.messageText = LocaleController.getString(R.string.ConferenceCallOutgoing);
                                                } else if (tL_messageActionConferenceCall.missed) {
                                                    this.messageText = LocaleController.getString(R.string.ConferenceCallMissed);
                                                } else {
                                                    this.messageText = LocaleController.getString(R.string.ConferenceCallIncoming);
                                                }
                                                int i30 = tL_messageActionConferenceCall.duration;
                                                if (i30 > 0) {
                                                    String formatCallDuration = LocaleController.formatCallDuration(i30);
                                                    String formatString = LocaleController.formatString(R.string.CallMessageWithDuration, this.messageText, formatCallDuration);
                                                    this.messageText = formatString;
                                                    String str12 = formatString.toString();
                                                    int indexOf4 = str12.indexOf(formatCallDuration);
                                                    if (indexOf4 != -1) {
                                                        SpannableString spannableString4 = new SpannableString(this.messageText);
                                                        int length = formatCallDuration.length() + indexOf4;
                                                        if (indexOf4 > 0 && str12.charAt(indexOf4 - 1) == '(') {
                                                            indexOf4--;
                                                        }
                                                        if (length < str12.length() && str12.charAt(length) == ')') {
                                                            length++;
                                                        }
                                                        spannableString4.setSpan(new k41(Typeface.DEFAULT), indexOf4, length, 0);
                                                        this.messageText = spannableString4;
                                                    }
                                                }
                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionPhoneCall) {
                                                TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall = (TLRPC.TL_messageActionPhoneCall) messageAction6;
                                                boolean z18 = tL_messageActionPhoneCall.reason instanceof TLRPC.TL_phoneCallDiscardReasonMissed;
                                                if (isFromUser() && this.messageOwner.from_id.user_id == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                                                    if (z18) {
                                                        if (tL_messageActionPhoneCall.video) {
                                                            this.messageText = LocaleController.getString(R.string.CallMessageVideoOutgoingMissed);
                                                        } else {
                                                            this.messageText = LocaleController.getString(R.string.CallMessageOutgoingMissed);
                                                        }
                                                    } else if (tL_messageActionPhoneCall.video) {
                                                        this.messageText = LocaleController.getString(R.string.CallMessageVideoOutgoing);
                                                    } else {
                                                        this.messageText = LocaleController.getString(R.string.CallMessageOutgoing);
                                                    }
                                                } else if (z18) {
                                                    if (tL_messageActionPhoneCall.video) {
                                                        this.messageText = LocaleController.getString(R.string.CallMessageVideoIncomingMissed);
                                                    } else {
                                                        this.messageText = LocaleController.getString(R.string.CallMessageIncomingMissed);
                                                    }
                                                } else if (tL_messageActionPhoneCall.reason instanceof TLRPC.TL_phoneCallDiscardReasonBusy) {
                                                    if (tL_messageActionPhoneCall.video) {
                                                        this.messageText = LocaleController.getString(R.string.CallMessageVideoIncomingDeclined);
                                                    } else {
                                                        this.messageText = LocaleController.getString(R.string.CallMessageIncomingDeclined);
                                                    }
                                                } else if (tL_messageActionPhoneCall.video) {
                                                    this.messageText = LocaleController.getString(R.string.CallMessageVideoIncoming);
                                                } else {
                                                    this.messageText = LocaleController.getString(R.string.CallMessageIncoming);
                                                }
                                                int i31 = tL_messageActionPhoneCall.duration;
                                                if (i31 > 0) {
                                                    String formatCallDuration2 = LocaleController.formatCallDuration(i31);
                                                    String formatString2 = LocaleController.formatString(R.string.CallMessageWithDuration, this.messageText, formatCallDuration2);
                                                    this.messageText = formatString2;
                                                    String str13 = formatString2.toString();
                                                    int indexOf5 = str13.indexOf(formatCallDuration2);
                                                    if (indexOf5 != -1) {
                                                        SpannableString spannableString5 = new SpannableString(this.messageText);
                                                        int length2 = formatCallDuration2.length() + indexOf5;
                                                        if (indexOf5 > 0 && str13.charAt(indexOf5 - 1) == '(') {
                                                            indexOf5--;
                                                        }
                                                        if (length2 < str13.length() && str13.charAt(length2) == ')') {
                                                            length2++;
                                                        }
                                                        spannableString5.setSpan(new k41(Typeface.DEFAULT), indexOf5, length2, 0);
                                                        this.messageText = spannableString5;
                                                    }
                                                }
                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionPaymentSent) {
                                                generatePaymentSentMessageText(getUser(abstractMap, hVar, getDialogId()), false);
                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionPaymentSentMe) {
                                                generatePaymentSentMessageText(getUser(abstractMap, hVar, getDialogId()), true);
                                            } else {
                                                boolean z19 = messageAction6 instanceof TLRPC.TL_messageActionBotAllowed;
                                                if (z19) {
                                                    TLRPC.TL_messageActionBotAllowed tL_messageActionBotAllowed = (TLRPC.TL_messageActionBotAllowed) messageAction6;
                                                    String str14 = tL_messageActionBotAllowed.domain;
                                                    TLRPC.BotApp botApp = tL_messageActionBotAllowed.app;
                                                    if (tL_messageActionBotAllowed.from_request) {
                                                        this.messageText = LocaleController.getString(R.string.ActionBotAllowedWebapp);
                                                    } else if (botApp != null) {
                                                        String str15 = botApp.title;
                                                        if (str15 == null) {
                                                            str15 = str;
                                                        }
                                                        String string4 = LocaleController.getString(R.string.ActionBotAllowedApp);
                                                        int indexOf6 = string4.indexOf("%1$s");
                                                        SpannableString spannableString6 = new SpannableString(String.format(string4, str15));
                                                        TLRPC.User user23 = getUser(abstractMap, hVar, getDialogId());
                                                        if (indexOf6 >= 0 && user23 != null && (publicUsername2 = UserObject.getPublicUsername(user23)) != null) {
                                                            StringBuilder sb5 = new StringBuilder("https://");
                                                            i0.a.z(sb5, MessagesController.getInstance(this.currentAccount).linkPrefix, "/", publicUsername2, "/");
                                                            sb5.append(botApp.short_name);
                                                            spannableString6.setSpan(new s41(sb5.toString()), indexOf6, str15.length() + indexOf6, 33);
                                                        }
                                                        this.messageText = spannableString6;
                                                    } else {
                                                        if (str14 == null) {
                                                            str14 = str;
                                                        }
                                                        String string5 = LocaleController.getString(R.string.ActionBotAllowed);
                                                        int indexOf7 = string5.indexOf("%1$s");
                                                        SpannableString spannableString7 = new SpannableString(String.format(string5, str14));
                                                        if (indexOf7 >= 0 && !TextUtils.isEmpty(str14)) {
                                                            spannableString7.setSpan(new s41("http://".concat(str14)), indexOf7, str14.length() + indexOf7, 33);
                                                        }
                                                        this.messageText = spannableString7;
                                                    }
                                                } else if ((messageAction6 instanceof TLRPC.TL_messageActionAttachMenuBotAllowed) || (z19 && ((TLRPC.TL_messageActionBotAllowed) messageAction6).attach_menu)) {
                                                    this.messageText = LocaleController.getString(R.string.ActionAttachMenuBotAllowed);
                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionSecureValuesSent) {
                                                    TLRPC.TL_messageActionSecureValuesSent tL_messageActionSecureValuesSent = (TLRPC.TL_messageActionSecureValuesSent) messageAction6;
                                                    StringBuilder sb6 = new StringBuilder();
                                                    int size3 = tL_messageActionSecureValuesSent.types.size();
                                                    for (int i32 = 0; i32 < size3; i32++) {
                                                        TLRPC.SecureValueType secureValueType = tL_messageActionSecureValuesSent.types.get(i32);
                                                        if (sb6.length() > 0) {
                                                            sb6.append(", ");
                                                        }
                                                        if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
                                                            sb6.append(LocaleController.getString(R.string.ActionBotDocumentPhone));
                                                        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
                                                            sb6.append(LocaleController.getString(R.string.ActionBotDocumentEmail));
                                                        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                                                            sb6.append(LocaleController.getString(R.string.ActionBotDocumentAddress));
                                                        } else if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                                                            sb6.append(LocaleController.getString(R.string.ActionBotDocumentIdentity));
                                                        } else if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
                                                            sb6.append(LocaleController.getString(R.string.ActionBotDocumentPassport));
                                                        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                                            sb6.append(LocaleController.getString(R.string.ActionBotDocumentDriverLicence));
                                                        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                                            sb6.append(LocaleController.getString(R.string.ActionBotDocumentIdentityCard));
                                                        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                                                            sb6.append(LocaleController.getString(R.string.ActionBotDocumentUtilityBill));
                                                        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
                                                            sb6.append(LocaleController.getString(R.string.ActionBotDocumentBankStatement));
                                                        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                                                            sb6.append(LocaleController.getString(R.string.ActionBotDocumentRentalAgreement));
                                                        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                                            sb6.append(LocaleController.getString(R.string.ActionBotDocumentInternalPassport));
                                                        } else if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                                                            sb6.append(LocaleController.getString(R.string.ActionBotDocumentPassportRegistration));
                                                        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                                                            sb6.append(LocaleController.getString(R.string.ActionBotDocumentTemporaryRegistration));
                                                        }
                                                    }
                                                    TLRPC.Peer peer22 = this.messageOwner.peer_id;
                                                    this.messageText = LocaleController.formatString(R.string.ActionBotDocuments, UserObject.getFirstName(peer22 != null ? getUser(abstractMap, hVar, peer22.user_id) : null), sb6.toString());
                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionWebViewDataSent) {
                                                    this.messageText = LocaleController.formatString(R.string.ActionBotWebViewData, ((TLRPC.TL_messageActionWebViewDataSent) messageAction6).text);
                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionSetChatTheme) {
                                                    TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction6).theme;
                                                    CharSequence f10 = hf.d.f(chatTheme);
                                                    if (f10 != null && (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift)) {
                                                        CharSequence spannableStringBuilder6 = new SpannableStringBuilder(f10);
                                                        hf.d.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
                                                        f10 = spannableStringBuilder6;
                                                    }
                                                    String firstName2 = UserObject.getFirstName(user);
                                                    boolean z20 = user == null && chat15 != null;
                                                    if (z20) {
                                                        firstName2 = chat15.title;
                                                    }
                                                    boolean isUserSelf = UserObject.isUserSelf(user);
                                                    if (TextUtils.isEmpty(f10)) {
                                                        this.messageText = isUserSelf ? LocaleController.formatSpannable(R.string.ChatThemeDisabledYou, new Object[0]) : LocaleController.formatSpannable(z20 ? R.string.ChannelThemeDisabled : R.string.ChatThemeDisabled, firstName2, f10);
                                                    } else {
                                                        this.messageText = isUserSelf ? LocaleController.formatSpannable(R.string.ChatThemeChangedYou, f10) : LocaleController.formatSpannable(z20 ? R.string.ChannelThemeChangedTo : R.string.ChatThemeChangedTo, firstName2, f10);
                                                    }
                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionChatJoinedByRequest) {
                                                    if (UserObject.isUserSelf(user)) {
                                                        this.messageText = ChatObject.isChannelAndNotMegaGroup(this.messageOwner.peer_id.channel_id, this.currentAccount) ? LocaleController.getString(R.string.RequestToJoinChannelApproved) : LocaleController.getString(R.string.RequestToJoinGroupApproved);
                                                    } else {
                                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.UserAcceptedToGroupAction), "un1", tLObject3);
                                                    }
                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionPaidMessagesPrice) {
                                                    TLRPC.TL_messageActionPaidMessagesPrice tL_messageActionPaidMessagesPrice = (TLRPC.TL_messageActionPaidMessagesPrice) messageAction6;
                                                    if (ChatObject.isChannel(chat15) && chat15 != null && chat15.broadcast) {
                                                        if ((tL_messageActionPaidMessagesPrice.flags & 1) != 0) {
                                                            long j26 = tL_messageActionPaidMessagesPrice.stars;
                                                            if (j26 > 0) {
                                                                this.messageText = replaceWithLink(LocaleController.formatPluralStringComma("PostSuggestionsPriceUpdated", (int) j26), "un1", tLObject3);
                                                            } else {
                                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.PostSuggestionsEnabledUpdated), "un1", tLObject3);
                                                            }
                                                        } else {
                                                            this.messageText = replaceWithLink(LocaleController.getString(R.string.PostSuggestionsDisabledUpdated), "un1", tLObject3);
                                                        }
                                                    } else if (isOutOwner()) {
                                                        this.messageText = LocaleController.formatPluralStringComma("PaidMessagesPriceUpdatedOut", (int) tL_messageActionPaidMessagesPrice.stars);
                                                    } else {
                                                        this.messageText = replaceWithLink(LocaleController.formatPluralStringComma("PaidMessagesPriceUpdated", (int) tL_messageActionPaidMessagesPrice.stars), "un1", tLObject3);
                                                    }
                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionPaidMessagesRefunded) {
                                                    TLRPC.TL_messageActionPaidMessagesRefunded tL_messageActionPaidMessagesRefunded = (TLRPC.TL_messageActionPaidMessagesRefunded) messageAction6;
                                                    if (isOutOwner()) {
                                                        TLRPC.Message message6 = this.messageOwner;
                                                        TLRPC.Peer peer23 = message6.saved_peer_id;
                                                        this.messageText = replaceWithLink(LocaleController.formatPluralStringComma("PaidMessagesRefundedOut", (int) tL_messageActionPaidMessagesRefunded.stars), "un1", peer23 != null ? getUser(abstractMap, hVar, DialogObject.getPeerDialogId(peer23)) : getUser(abstractMap, hVar, DialogObject.getPeerDialogId(message6.peer_id)));
                                                    } else {
                                                        this.messageText = replaceWithLink(LocaleController.formatPluralStringComma("PaidMessagesRefunded", (int) tL_messageActionPaidMessagesRefunded.stars), "un1", tLObject3);
                                                    }
                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionTodoCompletions) {
                                                    TLRPC.TL_messageActionTodoCompletions tL_messageActionTodoCompletions = (TLRPC.TL_messageActionTodoCompletions) messageAction6;
                                                    boolean isEmpty = tL_messageActionTodoCompletions.completed.isEmpty();
                                                    int intValue = !tL_messageActionTodoCompletions.completed.isEmpty() ? tL_messageActionTodoCompletions.completed.get(0).intValue() : !tL_messageActionTodoCompletions.incompleted.isEmpty() ? tL_messageActionTodoCompletions.incompleted.get(0).intValue() : 0;
                                                    MessageObject messageObject = this.replyMessageObject;
                                                    if (messageObject != null && (getMedia(messageObject.messageOwner) instanceof TLRPC.TL_messageMediaToDo)) {
                                                        TLRPC.TL_messageMediaToDo tL_messageMediaToDo2 = (TLRPC.TL_messageMediaToDo) getMedia(this.replyMessageObject.messageOwner);
                                                        for (int i33 = 0; i33 < tL_messageMediaToDo2.todo.list.size(); i33++) {
                                                            TLRPC.TodoItem todoItem2 = tL_messageMediaToDo2.todo.list.get(i33);
                                                            if (todoItem2.id == intValue) {
                                                                todoItem = todoItem2;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    todoItem = null;
                                                    if (todoItem != null) {
                                                        org.telegram.ui.ActionBar.g6.N();
                                                        CharSequence formatTaskTitle = formatTaskTitle(todoItem);
                                                        if (isOutOwner()) {
                                                            this.messageText = LocaleController.formatSpannable(!isEmpty ? R.string.TodoTaskCompletedOut : R.string.TodoTaskNotCompletedOut, formatTaskTitle);
                                                        } else {
                                                            this.messageText = replaceWithLink(LocaleController.formatSpannable(!isEmpty ? R.string.TodoTaskCompleted : R.string.TodoTaskNotCompleted, formatTaskTitle), "un1", tLObject3);
                                                        }
                                                    } else if (isOutOwner()) {
                                                        this.messageText = LocaleController.getString(!isEmpty ? R.string.TodoTaskCompletedOutUnknown : R.string.TodoTaskNotCompletedOutUnknown);
                                                    } else {
                                                        this.messageText = replaceWithLink(LocaleController.getString(!isEmpty ? R.string.TodoTaskCompletedUnknown : R.string.TodoTaskNotCompletedUnknown), "un1", tLObject3);
                                                    }
                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                                                    TLRPC.TL_messageActionTodoAppendTasks tL_messageActionTodoAppendTasks = (TLRPC.TL_messageActionTodoAppendTasks) messageAction6;
                                                    if (isOutOwner()) {
                                                        if (tL_messageActionTodoAppendTasks.list.size() == 1) {
                                                            this.messageText = LocaleController.formatSpannable(R.string.TodoAddedOneTaskOut, formatTaskTitle(tL_messageActionTodoAppendTasks.list.get(0)));
                                                        } else if (tL_messageActionTodoAppendTasks.list.size() == 2) {
                                                            this.messageText = LocaleController.formatSpannable(R.string.TodoAddedTwoTaskOut, formatTaskTitle(tL_messageActionTodoAppendTasks.list.get(0)), formatTaskTitle(tL_messageActionTodoAppendTasks.list.get(1)));
                                                        } else if (tL_messageActionTodoAppendTasks.list.size() == 3) {
                                                            this.messageText = LocaleController.formatSpannable(R.string.TodoAddedThreeTaskOut, formatTaskTitle(tL_messageActionTodoAppendTasks.list.get(0)), formatTaskTitle(tL_messageActionTodoAppendTasks.list.get(1)), formatTaskTitle(tL_messageActionTodoAppendTasks.list.get(2)));
                                                        } else if (tL_messageActionTodoAppendTasks.list.size() >= 4) {
                                                            this.messageText = LocaleController.formatPluralSpannable("TodoAddedMoreTasksOut", tL_messageActionTodoAppendTasks.list.size() - 3, formatTaskTitle(tL_messageActionTodoAppendTasks.list.get(0)), formatTaskTitle(tL_messageActionTodoAppendTasks.list.get(1)), formatTaskTitle(tL_messageActionTodoAppendTasks.list.get(2)));
                                                        }
                                                    } else if (tL_messageActionTodoAppendTasks.list.size() == 1) {
                                                        this.messageText = replaceWithLink(LocaleController.formatSpannable(R.string.TodoAddedOneTask, formatTaskTitle(tL_messageActionTodoAppendTasks.list.get(0))), "un1", tLObject3);
                                                    } else if (tL_messageActionTodoAppendTasks.list.size() == 2) {
                                                        this.messageText = replaceWithLink(LocaleController.formatSpannable(R.string.TodoAddedTwoTask, formatTaskTitle(tL_messageActionTodoAppendTasks.list.get(0)), formatTaskTitle(tL_messageActionTodoAppendTasks.list.get(1))), "un1", tLObject3);
                                                    } else if (tL_messageActionTodoAppendTasks.list.size() == 3) {
                                                        this.messageText = replaceWithLink(LocaleController.formatSpannable(R.string.TodoAddedThreeTask, formatTaskTitle(tL_messageActionTodoAppendTasks.list.get(0)), formatTaskTitle(tL_messageActionTodoAppendTasks.list.get(1)), formatTaskTitle(tL_messageActionTodoAppendTasks.list.get(2))), "un1", tLObject3);
                                                    } else if (tL_messageActionTodoAppendTasks.list.size() >= 4) {
                                                        this.messageText = replaceWithLink(LocaleController.formatPluralSpannable("TodoAddedMoreTasks", tL_messageActionTodoAppendTasks.list.size() - 3, formatTaskTitle(tL_messageActionTodoAppendTasks.list.get(0)), formatTaskTitle(tL_messageActionTodoAppendTasks.list.get(1)), formatTaskTitle(tL_messageActionTodoAppendTasks.list.get(2))), "un1", tLObject3);
                                                    }
                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                                                    String h10 = wf.c.h(this.currentAccount, DialogObject.getPeerDialogId(message5.peer_id));
                                                    if (h10 == null) {
                                                        TLRPC.Chat chat19 = getChat(abstractMap2, hVar2, -DialogObject.getPeerDialogId(this.messageOwner.peer_id));
                                                        if (chat19 != null) {
                                                            long j27 = chat19.linked_monoforum_id;
                                                            if (j27 != 0 && (chat2 = getChat(abstractMap2, hVar2, j27)) != null) {
                                                                chat19 = chat2;
                                                            }
                                                        }
                                                        h10 = DialogObject.getDialogTitle(chat19);
                                                    }
                                                    this.messageText = getActionSuggestionApprovalText(h10, DialogObject.getName(getUser(abstractMap, hVar, DialogObject.getPeerDialogId(this.messageOwner.saved_peer_id))));
                                                } else {
                                                    boolean z21 = messageAction6 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer;
                                                    hf.b bVar2 = hf.b.a;
                                                    if (z21) {
                                                        TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction6;
                                                        hf.a m11 = hf.a.m(tL_messageActionStarGiftPurchaseOffer.price);
                                                        StringBuilder sb7 = new StringBuilder();
                                                        sb7.append(tL_messageActionStarGiftPurchaseOffer.gift.title);
                                                        sb7.append(" #");
                                                        String m12 = i0.a.m(tL_messageActionStarGiftPurchaseOffer.gift.num, ',', sb7);
                                                        String shortName = DialogObject.getShortName(getUser(abstractMap, hVar, DialogObject.getPeerDialogId(this.messageOwner.peer_id)));
                                                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                                                        spannableStringBuilder7.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(m11.a == bVar2 ? isOut() ? R.string.GiftOfferOfferedTextStarsOut : R.string.GiftOfferOfferedTextStars2 : isOut() ? R.string.GiftOfferOfferedTextTONOut : R.string.GiftOfferOfferedTextTON2, shortName, m11.d(), m12)));
                                                        this.messageText = spannableStringBuilder7;
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionChangeCommunity) {
                                                        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) messageAction6;
                                                        long peerDialogId7 = DialogObject.getPeerDialogId(message5.peer_id);
                                                        long peerDialogId8 = DialogObject.getPeerDialogId(this.messageOwner.from_id);
                                                        boolean z22 = peerDialogId7 < 0 && ChatObject.isChannelAndNotMegaGroup(getChat(abstractMap2, hVar2, -peerDialogId7));
                                                        boolean z23 = peerDialogId7 > 0;
                                                        String shortName2 = DialogObject.getShortName(getChat(abstractMap2, hVar2, tL_messageActionChangeCommunity.community_id));
                                                        String shortName3 = peerDialogId8 > 0 ? DialogObject.getShortName(getUser(abstractMap, hVar, peerDialogId8)) : DialogObject.getShortName(getChat(abstractMap2, hVar2, -peerDialogId8));
                                                        SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
                                                        spannableStringBuilder8.append((CharSequence) oh.r0.a(this, shortName2, shortName3, z22, z23));
                                                        this.messageText = spannableStringBuilder8;
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionStarGiftPurchaseOfferDeclined) {
                                                        TLRPC.TL_messageActionStarGiftPurchaseOfferDeclined tL_messageActionStarGiftPurchaseOfferDeclined = (TLRPC.TL_messageActionStarGiftPurchaseOfferDeclined) messageAction6;
                                                        hf.a m13 = hf.a.m(tL_messageActionStarGiftPurchaseOfferDeclined.price);
                                                        StringBuilder sb8 = new StringBuilder();
                                                        sb8.append(tL_messageActionStarGiftPurchaseOfferDeclined.gift.title);
                                                        sb8.append(" #");
                                                        String m14 = i0.a.m(tL_messageActionStarGiftPurchaseOfferDeclined.gift.num, ',', sb8);
                                                        String shortName4 = DialogObject.getShortName(getUser(abstractMap, hVar, DialogObject.getPeerDialogId(this.messageOwner.peer_id)));
                                                        String d = m13.d();
                                                        hf.b bVar3 = m13.a;
                                                        this.messageText = AndroidUtilities.replaceTags(LocaleController.formatString(tL_messageActionStarGiftPurchaseOfferDeclined.expired ? bVar3 == bVar2 ? isOut() ? R.string.GiftOfferOfferedTextStarsExpiredOut : R.string.GiftOfferOfferedTextStarsExpired : isOut() ? R.string.GiftOfferOfferedTextTONExpiredOut : R.string.GiftOfferOfferedTextTONExpired : bVar3 == bVar2 ? isOut() ? R.string.GiftOfferOfferedTextStarsRejectedOut : R.string.GiftOfferOfferedTextStarsRejected : isOut() ? R.string.GiftOfferOfferedTextTONRejectedOut : R.string.GiftOfferOfferedTextTONRejected, shortName4, d, m14));
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionPollAppendAnswer) {
                                                        TLRPC.TL_messageActionPollAppendAnswer tL_messageActionPollAppendAnswer = (TLRPC.TL_messageActionPollAppendAnswer) messageAction6;
                                                        if (isOut()) {
                                                            this.messageText = LocaleController.formatSpannable(R.string.PollAddingActionYou, formatTextWithEntities(tL_messageActionPollAppendAnswer.answer.text, isOutOwner()));
                                                        } else {
                                                            this.messageText = LocaleController.formatSpannable(R.string.PollAddingActionOther, DialogObject.getShortName(getUser(abstractMap, hVar, DialogObject.getPeerDialogId(this.messageOwner.from_id))), formatTextWithEntities(tL_messageActionPollAppendAnswer.answer.text, isOutOwner()));
                                                        }
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionPollDeleteAnswer) {
                                                        TLRPC.TL_messageActionPollDeleteAnswer tL_messageActionPollDeleteAnswer = (TLRPC.TL_messageActionPollDeleteAnswer) messageAction6;
                                                        if (isOut()) {
                                                            this.messageText = LocaleController.formatSpannable(R.string.PollRemovedActionYou, formatTextWithEntities(tL_messageActionPollDeleteAnswer.answer.text, isOutOwner()));
                                                        } else {
                                                            this.messageText = LocaleController.formatSpannable(R.string.PollRemovedActionOther, DialogObject.getShortName(getUser(abstractMap, hVar, DialogObject.getPeerDialogId(this.messageOwner.from_id))), formatTextWithEntities(tL_messageActionPollDeleteAnswer.answer.text, isOutOwner()));
                                                        }
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionNoForwardsToggle) {
                                                        TLRPC.TL_messageActionNoForwardsToggle tL_messageActionNoForwardsToggle = (TLRPC.TL_messageActionNoForwardsToggle) messageAction6;
                                                        boolean z24 = tL_messageActionNoForwardsToggle.new_value;
                                                        if (z24 == tL_messageActionNoForwardsToggle.prev_value) {
                                                            this.messageText = LocaleController.getString(z24 ? R.string.DisableSharingActionStillDisabled : R.string.DisableSharingActionStillEnabled);
                                                        } else if (isOut()) {
                                                            this.messageText = LocaleController.getString(tL_messageActionNoForwardsToggle.new_value ? R.string.DisableSharingActionYou : R.string.EnableSharingActionYou);
                                                        } else {
                                                            this.messageText = LocaleController.formatString(tL_messageActionNoForwardsToggle.new_value ? R.string.DisableSharingActionOther : R.string.EnableSharingActionOther, DialogObject.getShortName(getUser(abstractMap, hVar, DialogObject.getPeerDialogId(this.messageOwner.peer_id))));
                                                        }
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                                        String shortName5 = DialogObject.getShortName(getUser(abstractMap, hVar, DialogObject.getPeerDialogId(message5.peer_id)));
                                                        if (((TLRPC.TL_messageActionNoForwardsRequest) messageAction6).new_value) {
                                                            this.messageText = isOut() ? LocaleController.getString(R.string.SharingOfferDisableHeaderShortYou) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferDisableHeaderShortOther, shortName5));
                                                        } else {
                                                            this.messageText = isOut() ? LocaleController.getString(R.string.SharingOfferEnableHeaderShortYou) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferEnableHeaderShortOther, shortName5));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    str = "";
                                }
                            }
                        }
                    }
                    str = "";
                }
                if (this.messageText == null) {
                    this.messageText = str;
                }
                this.isEmbedVideoCached = null;
                this.cachedStartsTimestamp = null;
                this.cachedSavedTimestamp = null;
            }
            user = null;
        }
        chat = null;
        if (user == null) {
        }
        this.drawServiceWithDefaultTypeface = false;
        this.channelJoined = false;
        message = this.messageOwner;
        if (message instanceof TLRPC.TL_messageService) {
        }
        if (this.messageText == null) {
        }
        this.isEmbedVideoCached = null;
        this.cachedStartsTimestamp = null;
        this.cachedSavedTimestamp = null;
    }

    public static CharSequence userSpan(int i10) {
        if (userSpan == null) {
            userSpan = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = userSpan;
        if (charSequenceArr[i10] == null) {
            charSequenceArr[i10] = new SpannableStringBuilder("u");
            cq cqVar = new cq(R.drawable.mini_reply_user, 0);
            cqVar.spaceScaleX = 0.9f;
            if (i10 == 0) {
                cqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
            }
            ((SpannableStringBuilder) userSpan[i10]).setSpan(cqVar, 0, 1, 33);
        }
        return userSpan[i10];
    }

    public boolean addEntitiesToText(CharSequence charSequence, boolean z10, boolean z11) {
        if (charSequence == null) {
            return false;
        }
        if (!this.isRestrictedMessage && !(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaUnsupported)) {
            return addEntitiesToText(charSequence, getEntities(), isOutOwner(), true, z10, z11);
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityItalic tL_messageEntityItalic = new TLRPC.TL_messageEntityItalic();
        tL_messageEntityItalic.offset = 0;
        tL_messageEntityItalic.length = charSequence.length();
        arrayList.add(tL_messageEntityItalic);
        return addEntitiesToText(charSequence, arrayList, isOutOwner(), true, z10, z11);
    }

    public void applyTimestampsHighlightForReplyMsg(CharSequence charSequence) {
        TLRPC.Message message;
        MessageObject messageObject = this.replyMessageObject;
        if (messageObject == null) {
            return;
        }
        if (messageObject.isYouTubeVideo()) {
            addUrlsByPattern(isOutOwner(), charSequence, false, 3, ConnectionsManager.DEFAULT_DATACENTER_ID, false);
            return;
        }
        if (messageObject.isVideo()) {
            addUrlsByPattern(isOutOwner(), charSequence, false, 3, (int) messageObject.getDuration(), false);
            return;
        }
        if (messageObject.isMusic() || messageObject.isVoice()) {
            addUrlsByPattern(isOutOwner(), charSequence, false, 4, (int) messageObject.getDuration(), false);
        }
        if (charSequence != this.messageText || (message = this.messageOwner) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        if ((messageAction instanceof TLRPC.TL_messageActionTodoCompletions) || (messageAction instanceof TLRPC.TL_messageActionTodoAppendTasks)) {
            updateMessageText();
        }
    }

    public void checkMediaExistance(boolean z10) {
        int i10;
        this.attachPathExists = false;
        this.mediaExists = false;
        int i11 = this.type;
        if (i11 == 20) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) this.messageOwner.media.extended_media.get(0);
            if (tL_messageExtendedMediaPreview.thumb != null) {
                File pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(tL_messageExtendedMediaPreview.thumb, z10);
                if (!this.mediaExists) {
                    this.mediaExists = pathToAttach.exists() || (tL_messageExtendedMediaPreview.thumb instanceof TLRPC.TL_photoStrippedSize);
                }
            }
        } else if (i11 == 1 && FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, AndroidUtilities.getPhotoSize(true)) != null) {
            File pathToMessage = FileLoader.getInstance(this.currentAccount).getPathToMessage(this.messageOwner, z10);
            if (needDrawBluredPreview()) {
                this.mediaExists = new File(pathToMessage.getAbsolutePath() + ".enc").exists();
            }
            if (!this.mediaExists) {
                this.mediaExists = pathToMessage.exists();
            }
        }
        if ((!this.mediaExists && this.type == 8) || (i10 = this.type) == 3 || i10 == 9 || i10 == 2 || i10 == 14 || i10 == 5) {
            String str = this.messageOwner.attachPath;
            if (str != null && str.length() > 0) {
                this.attachPathExists = new File(this.messageOwner.attachPath).exists();
            }
            if (!this.attachPathExists) {
                File pathToMessage2 = FileLoader.getInstance(this.currentAccount).getPathToMessage(this.messageOwner, z10);
                if ((this.type == 3 && needDrawBluredPreview()) || isVoiceOnce() || isRoundOnce()) {
                    this.mediaExists = new File(pathToMessage2.getAbsolutePath() + ".enc").exists();
                }
                if (!this.mediaExists) {
                    this.mediaExists = pathToMessage2.exists();
                }
            }
        }
        if (!this.mediaExists) {
            TLRPC.Document document = getDocument();
            if (document == null) {
                int i12 = this.type;
                if (i12 == 0) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, AndroidUtilities.getPhotoSize());
                    if (closestPhotoSizeWithSize == null) {
                        return;
                    } else {
                        this.mediaExists = FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, null, true, z10).exists();
                    }
                } else if (i12 == 11) {
                    TLRPC.Photo photo = this.messageOwner.action.photo;
                    if (photo == null || photo.video_sizes.isEmpty()) {
                        return;
                    } else {
                        this.mediaExists = FileLoader.getInstance(this.currentAccount).getPathToAttach(photo.video_sizes.get(0), null, true, z10).exists();
                    }
                }
            } else if (isWallpaper()) {
                this.mediaExists = FileLoader.getInstance(this.currentAccount).getPathToAttach(document, null, true, z10).exists();
            } else {
                this.mediaExists = FileLoader.getInstance(this.currentAccount).getPathToAttach(document, null, false, z10).exists();
            }
        }
        updateQualitiesCached(z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
    
        if (isVideoDocument(r3.document) != false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void createMessageSendInfo(boolean z10) {
        String str;
        int parseInt;
        TLRPC.MessageMedia f10;
        VideoEditedInfo videoEditedInfo = this.videoEditedInfo;
        boolean z11 = true;
        boolean z12 = videoEditedInfo != null && videoEditedInfo.notReadyYet;
        TLRPC.Message message = this.messageOwner;
        if (message.message != null) {
            if ((message.id < 0 || isEditing()) && this.messageOwner.params != null) {
                TLRPC.MessageMedia media = getMedia(this);
                boolean z13 = z10 || isVideo() || isNewGif() || isRoundVideo() || isVideoSticker() || isPaidVideo(media);
                if (!z13 && (media instanceof TLRPC.TL_messageMediaPoll)) {
                    String str2 = this.messageOwner.params.get("pollMediaIndex");
                    if (str2 != null) {
                        try {
                            parseInt = Integer.parseInt(str2);
                        } catch (Throwable unused) {
                        }
                        f10 = zg.f.f((TLRPC.TL_messageMediaPoll) media, parseInt);
                        if (f10 != null) {
                        }
                    }
                    parseInt = -1;
                    f10 = zg.f.f((TLRPC.TL_messageMediaPoll) media, parseInt);
                    if (f10 != null) {
                    }
                }
                z11 = z13;
                String str3 = this.messageOwner.params.get("ve");
                if (str3 != null && z11) {
                    VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                    this.videoEditedInfo = videoEditedInfo2;
                    if (videoEditedInfo2.parseString(str3)) {
                        this.videoEditedInfo.roundVideo = isRoundVideo();
                        this.videoEditedInfo.notReadyYet = z12;
                    } else {
                        this.videoEditedInfo = null;
                    }
                }
                TLRPC.Message message2 = this.messageOwner;
                if (message2.send_state != 3 || (str = message2.params.get("prevMedia")) == null) {
                    return;
                }
                SerializedData serializedData = new SerializedData(Base64.decode(str, 0));
                this.previousMedia = TLRPC.MessageMedia.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                this.previousMessage = serializedData.readString(false);
                this.previousAttachPath = serializedData.readString(false);
                int readInt32 = serializedData.readInt32(false);
                this.previousMessageEntities = new ArrayList<>(readInt32);
                for (int i10 = 0; i10 < readInt32; i10++) {
                    this.previousMessageEntities.add(TLRPC.MessageEntity.TLdeserialize(serializedData, serializedData.readInt32(false), false));
                }
                serializedData.cleanup();
            }
        }
    }

    public int getApproximateHeight(boolean z10) {
        int i10;
        int min;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int min2;
        int textHeightCached;
        int dp;
        int i11 = this.type;
        int i12 = 0;
        if (i11 == 0) {
            int textHeightCached2 = z10 ? textHeightCached() : textHeight();
            if ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && (getMedia(this.messageOwner).webpage instanceof TLRPC.TL_webPage)) {
                i12 = AndroidUtilities.dp(100.0f);
            }
            textHeightCached = textHeightCached2 + i12;
            if (!isReply()) {
                return textHeightCached;
            }
            dp = AndroidUtilities.dp(42.0f);
        } else {
            if (i11 == 20) {
                return AndroidUtilities.getPhotoSize();
            }
            if (i11 == 2) {
                return AndroidUtilities.dp(72.0f);
            }
            if (i11 == 12) {
                return AndroidUtilities.dp(71.0f);
            }
            if (i11 == 9) {
                return AndroidUtilities.dp(100.0f);
            }
            if (i11 == 4) {
                return AndroidUtilities.dp(114.0f);
            }
            if (i11 == 14) {
                return AndroidUtilities.dp(82.0f);
            }
            if (i11 == 10 || i11 == 35 || i11 == 33 || i11 == 34) {
                return AndroidUtilities.dp(30.0f);
            }
            if (i11 == 11 || i11 == 18 || i11 == 31 || i11 == 30 || i11 == 25 || i11 == 21) {
                return AndroidUtilities.dp(50.0f);
            }
            if (i11 == 32) {
                return AndroidUtilities.dp(234.0f);
            }
            if (i11 == 5) {
                return AndroidUtilities.roundMessageSize;
            }
            if (i11 != 19) {
                if (i11 == 13 || i11 == 15) {
                    float f10 = AndroidUtilities.displaySize.y * 0.4f;
                    float minTabletSide = (AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() : AndroidUtilities.displaySize.x) * 0.5f;
                    TLRPC.Document document = getDocument();
                    if (document != null) {
                        int size = document.attributes.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i13);
                            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                i12 = documentAttribute.w;
                                i10 = documentAttribute.h;
                                break;
                            }
                        }
                    }
                    i10 = 0;
                    if (i12 == 0) {
                        i10 = (int) f10;
                        i12 = AndroidUtilities.dp(100.0f) + i10;
                    }
                    float f11 = i10;
                    if (f11 > f10) {
                        i12 = (int) ((f10 / f11) * i12);
                        i10 = (int) f10;
                    }
                    float f12 = i12;
                    if (f12 > minTabletSide) {
                        i10 = (int) ((minTabletSide / f12) * i10);
                    }
                    return AndroidUtilities.dp(14.0f) + i10;
                }
                if (AndroidUtilities.isTablet()) {
                    min = AndroidUtilities.getMinTabletSide();
                } else {
                    Point point = AndroidUtilities.displaySize;
                    min = Math.min(point.x, point.y);
                }
                int i14 = (int) (min * 0.7f);
                int dp2 = AndroidUtilities.dp(100.0f) + i14;
                if (i14 > AndroidUtilities.getPhotoSize()) {
                    i14 = AndroidUtilities.getPhotoSize();
                }
                if (dp2 > AndroidUtilities.getPhotoSize()) {
                    dp2 = AndroidUtilities.getPhotoSize();
                }
                if (z10) {
                    ArrayList<TLRPC.PhotoSize> arrayList = this.photoThumbs;
                    closestPhotoSizeWithSize = (arrayList == null || arrayList.isEmpty()) ? null : this.photoThumbs.get(0);
                } else {
                    closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, AndroidUtilities.getPhotoSize());
                }
                if (closestPhotoSizeWithSize != null) {
                    int i15 = (int) (closestPhotoSizeWithSize.h / (closestPhotoSizeWithSize.w / i14));
                    if (i15 == 0) {
                        i15 = AndroidUtilities.dp(100.0f);
                    }
                    if (i15 <= dp2) {
                        dp2 = i15 < AndroidUtilities.dp(120.0f) ? AndroidUtilities.dp(120.0f) : i15;
                    }
                    if (!z10 && needDrawBluredPreview()) {
                        if (AndroidUtilities.isTablet()) {
                            min2 = AndroidUtilities.getMinTabletSide();
                        } else {
                            Point point2 = AndroidUtilities.displaySize;
                            min2 = Math.min(point2.x, point2.y);
                        }
                        dp2 = (int) (min2 * 0.5f);
                    }
                }
                return AndroidUtilities.dp(14.0f) + dp2;
            }
            textHeightCached = z10 ? textHeightCached() : textHeight();
            dp = AndroidUtilities.dp(30.0f);
        }
        return dp + textHeightCached;
    }

    public long getFromChatId() {
        return getFromChatId(this.messageOwner);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x003b, code lost:
    
        if (r3.round_message != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0153 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getMusicAuthor(boolean z10) {
        TLRPC.User user;
        TLRPC.Chat chat;
        String str;
        TLRPC.Document document = getDocument();
        if (document != null) {
            boolean z11 = false;
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if (!(documentAttribute instanceof TLRPC.TL_documentAttributeAudio)) {
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    }
                    if (!z11) {
                        TLRPC.User user2 = null;
                        if (!z10) {
                            return null;
                        }
                        if (!isOutOwner()) {
                            TLRPC.MessageFwdHeader messageFwdHeader = this.messageOwner.fwd_from;
                            if (messageFwdHeader != null) {
                                TLRPC.Peer peer = messageFwdHeader.from_id;
                                if ((peer instanceof TLRPC.TL_peerUser) && peer.user_id == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                                }
                            }
                            TLRPC.Message message = this.messageOwner;
                            TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
                            if (messageFwdHeader2 != null && (messageFwdHeader2.from_id instanceof TLRPC.TL_peerChannel)) {
                                chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.fwd_from.from_id.channel_id));
                            } else if (messageFwdHeader2 == null || !(messageFwdHeader2.from_id instanceof TLRPC.TL_peerChat)) {
                                if (messageFwdHeader2 != null && (messageFwdHeader2.from_id instanceof TLRPC.TL_peerUser)) {
                                    user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.fwd_from.from_id.user_id));
                                } else {
                                    if (messageFwdHeader2 != null && (str = messageFwdHeader2.from_name) != null) {
                                        return str;
                                    }
                                    TLRPC.Peer peer2 = message.from_id;
                                    if (peer2 instanceof TLRPC.TL_peerChat) {
                                        chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.from_id.chat_id));
                                    } else if (peer2 instanceof TLRPC.TL_peerChannel) {
                                        chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.from_id.channel_id));
                                    } else if (peer2 != null || message.peer_id.channel_id == 0) {
                                        user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.from_id.user_id));
                                    } else {
                                        chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.peer_id.channel_id));
                                    }
                                }
                                TLRPC.User user3 = user;
                                chat = null;
                                user2 = user3;
                            } else {
                                chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.fwd_from.from_id.chat_id));
                            }
                            if (user2 != null) {
                                return UserObject.getUserName(user2);
                            }
                            if (chat != null) {
                                return chat.title;
                            }
                        }
                        return LocaleController.getString(R.string.FromYou);
                    }
                } else if (!documentAttribute.voice) {
                    String str2 = documentAttribute.performer;
                    return (TextUtils.isEmpty(str2) && z10) ? LocaleController.getString(R.string.AudioUnknownArtist) : str2;
                }
                z11 = true;
                if (!z11) {
                }
            }
        }
        return LocaleController.getString(R.string.AudioUnknownArtist);
    }

    public String getMusicTitle(boolean z10) {
        TLRPC.Document document = getDocument();
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    if (documentAttribute.voice) {
                        if (z10) {
                            return LocaleController.formatDateAudio(this.messageOwner.date, true);
                        }
                        return null;
                    }
                    String str = documentAttribute.title;
                    if (str != null && str.length() != 0) {
                        return str;
                    }
                    String documentFileName = FileLoader.getDocumentFileName(document);
                    return (TextUtils.isEmpty(documentFileName) && z10) ? LocaleController.getString(R.string.AudioUnknownTitle) : documentFileName;
                }
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.round_message) {
                    if (!isQuickReply()) {
                        return LocaleController.formatDateAudio(this.messageOwner.date, true);
                    }
                    return LocaleController.formatString(R.string.BusinessInReplies, "/" + getQuickReplyDisplayName());
                }
            }
            String documentFileName2 = FileLoader.getDocumentFileName(document);
            if (!TextUtils.isEmpty(documentFileName2)) {
                return documentFileName2;
            }
        }
        return LocaleController.getString(R.string.AudioUnknownTitle);
    }

    public int getReplyTopMsgId(boolean z10) {
        TLRPC.MessageReplyHeader messageReplyHeader = this.messageOwner.reply_to;
        if (messageReplyHeader == null) {
            return 0;
        }
        if (z10 && (messageReplyHeader.flags & 2) > 0 && messageReplyHeader.reply_to_top_id == 0) {
            return 1;
        }
        return messageReplyHeader.reply_to_top_id;
    }

    public boolean hasVideoQualities(boolean z10) {
        TLRPC.MessageMedia messageMedia;
        if (this.videoQualitiesCached == null) {
            try {
                TLRPC.Message message = this.messageOwner;
                if (message != null && (messageMedia = message.media) != null && messageMedia.document != null && !messageMedia.alt_documents.isEmpty()) {
                    int i10 = this.currentAccount;
                    TLRPC.Message message2 = this.messageOwner;
                    TLRPC.MessageMedia messageMedia2 = message2 != null ? message2.media : null;
                    int i11 = m61.f0;
                    ArrayList<i61> arrayList = !(messageMedia2 instanceof TLRPC.TL_messageMediaDocument) ? new ArrayList<>() : m61.t(i10, messageMedia2.document, messageMedia2.alt_documents, 0, z10);
                    this.videoQualities = arrayList;
                    this.videoQualitiesCached = Boolean.valueOf(arrayList.size() > 1);
                    this.highestQuality = m61.w(this.videoQualities);
                    this.thumbQuality = m61.x(this.videoQualities);
                    this.cachedQuality = m61.l(this.videoQualities);
                }
                this.videoQualitiesCached = Boolean.FALSE;
                return false;
            } catch (Exception e9) {
                FileLog.e(e9);
                this.videoQualitiesCached = Boolean.FALSE;
            }
        }
        return this.videoQualitiesCached.booleanValue();
    }

    public boolean isMediaEmpty(boolean z10) {
        return isMediaEmpty(this.messageOwner, z10);
    }

    public boolean isQuickReply() {
        return isQuickReply(this.messageOwner);
    }

    public boolean isVideoSticker() {
        return getDocument() != null && isVideoStickerDocument(getDocument());
    }

    public void setQuery(String str, boolean z10) {
        String str2;
        int indexOf;
        if (TextUtils.isEmpty(str)) {
            this.highlightedWords = null;
            this.messageTrimmedToHighlight = null;
            this.messageTrimmedToHighlightCut = true;
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        String lowerCase = str.trim().toLowerCase();
        String[] split = lowerCase.split("[^\\p{L}#$]+");
        ArrayList arrayList2 = new ArrayList();
        TLRPC.MessageReplyHeader messageReplyHeader = this.messageOwner.reply_to;
        if (messageReplyHeader != null && !TextUtils.isEmpty(messageReplyHeader.quote_text)) {
            String lowerCase2 = this.messageOwner.reply_to.quote_text.trim().toLowerCase();
            if (lowerCase2.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
                handleFoundWords(arrayList, split, true, z10);
                return;
            }
            arrayList2.addAll(Arrays.asList(lowerCase2.split("[^\\p{L}#$]+")));
        }
        if (!TextUtils.isEmpty(this.messageOwner.message)) {
            String lowerCase3 = this.messageOwner.message.trim().toLowerCase();
            if (lowerCase3.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
                handleFoundWords(arrayList, split, false, z10);
                return;
            }
            arrayList2.addAll(Arrays.asList(lowerCase3.split("[^\\p{L}#$]+")));
        }
        if (getDocument() != null) {
            String lowerCase4 = FileLoader.getDocumentFileName(getDocument()).toLowerCase();
            if (lowerCase4.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
            }
            arrayList2.addAll(Arrays.asList(lowerCase4.split("[^\\p{L}#$]+")));
        }
        if ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && (getMedia(this.messageOwner).webpage instanceof TLRPC.TL_webPage)) {
            TLRPC.WebPage webPage = getMedia(this.messageOwner).webpage;
            String str3 = webPage.title;
            if (str3 == null) {
                str3 = webPage.site_name;
            }
            if (str3 != null) {
                String lowerCase5 = str3.toLowerCase();
                if (lowerCase5.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                    arrayList.add(lowerCase);
                }
                arrayList2.addAll(Arrays.asList(lowerCase5.split("[^\\p{L}#$]+")));
            }
        }
        String musicAuthor = getMusicAuthor();
        if (musicAuthor != null) {
            String lowerCase6 = musicAuthor.toLowerCase();
            if (lowerCase6.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
            }
            arrayList2.addAll(Arrays.asList(lowerCase6.split("[^\\p{L}#$]+")));
        }
        for (String str4 : split) {
            if (str4.length() >= 2) {
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    if (!arrayList.contains(arrayList2.get(i10)) && (indexOf = (str2 = (String) arrayList2.get(i10)).indexOf(str4.charAt(0))) >= 0) {
                        int max = Math.max(str4.length(), str2.length());
                        if (indexOf != 0) {
                            str2 = str2.substring(indexOf);
                        }
                        int min = Math.min(str4.length(), str2.length());
                        int i11 = 0;
                        for (int i12 = 0; i12 < min && str2.charAt(i12) == str4.charAt(i12); i12++) {
                            i11++;
                        }
                        if (i11 / max >= 0.5d) {
                            arrayList.add((String) arrayList2.get(i10));
                        }
                    }
                }
            }
        }
        handleFoundWords(arrayList, split, false, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00df, code lost:
    
        if (r4.translatedRichMessage == null) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean updateTranslation(boolean z10) {
        MessageObject messageObject = this.replyMessageObject;
        boolean z11 = (messageObject == null || messageObject == this || !messageObject.updateTranslation(z10)) ? false : true;
        TranslateController translateController = MessagesController.getInstance(this.currentAccount).getTranslateController();
        TLRPC.Message message = this.messageOwner;
        TLRPC.TL_textWithEntities tL_textWithEntities = message != null ? message.voiceTranscriptionOpen ? message.translatedVoiceTranscription : message.translatedText : null;
        TLRPC.TL_textWithEntities tL_textWithEntities2 = (message == null || !message.summarizedOpen) ? null : message.summaryText;
        TLRPC.TL_textWithEntities tL_textWithEntities3 = (message == null || !message.summarizedOpen) ? null : message.translatedSummaryText;
        if (tL_textWithEntities3 != null && message != null && message.summarizedOpen && TranslateController.isSummarizable(this) && TranslateController.isTranslatable(this) && translateController.isTranslatingDialog(getDialogId()) && !translateController.isTranslateDialogHidden(getDialogId()) && TextUtils.equals(translateController.getDialogTranslateTo(getDialogId()), this.messageOwner.translatedSummaryLanguage)) {
            if (this.summarized && this.translated) {
                return z11;
            }
            this.summarized = true;
            this.translated = true;
            applyNewText(tL_textWithEntities3.text);
            generateCaption();
            return true;
        }
        TLRPC.Message message2 = this.messageOwner;
        if (message2 != null && message2.summarizedOpen && TranslateController.isSummarizable(this) && tL_textWithEntities2 != null) {
            if (this.summarized && !this.translated) {
                return z11;
            }
            this.summarized = true;
            this.translated = false;
            applyNewText(tL_textWithEntities2.text);
            generateCaption();
            return true;
        }
        if (this.messageOwner != null && TranslateController.isTranslatable(this) && translateController.isTranslatingDialog(getDialogId()) && !translateController.isTranslateDialogHidden(getDialogId())) {
            if (tL_textWithEntities == null) {
                TLRPC.Message message3 = this.messageOwner;
                if (message3.translatedPoll == null) {
                }
            }
            if (TextUtils.equals(translateController.getDialogTranslateTo(getDialogId()), this.messageOwner.translatedToLanguage)) {
                if (this.translated && !this.summarized) {
                    return z11;
                }
                this.translated = true;
                this.summarized = false;
                if (this.type == 36) {
                    generateLayout(null);
                } else if (tL_textWithEntities != null) {
                    applyNewText(tL_textWithEntities.text);
                    generateCaption();
                }
                return true;
            }
        }
        TLRPC.Message message4 = this.messageOwner;
        if (message4 == null || !(z10 || this.translated || this.summarized)) {
            return z11;
        }
        this.translated = false;
        this.summarized = false;
        if (this.type == 36) {
            generateLayout(null);
        } else {
            applyNewText(message4.message);
            generateCaption();
        }
        return true;
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public static class TextRange {
        public boolean code;
        public boolean collapse;
        public int end;
        public String language;
        public boolean quote;
        public int start;

        public TextRange(int i10, int i11) {
            this.start = i10;
            this.end = i11;
        }

        public TextRange(int i10, int i11, boolean z10, boolean z11, boolean z12, String str) {
            this.start = i10;
            this.end = i11;
            this.quote = z10;
            this.code = z11;
            this.collapse = z10 && z12;
            this.language = str;
        }
    }

    public static void addLinks(boolean z10, CharSequence charSequence, boolean z11, boolean z12, boolean z13) {
        if ((charSequence instanceof Spannable) && containsUrls(charSequence)) {
            try {
                AndroidUtilities.addLinksSafe((Spannable) charSequence, 1, z13, false);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            addPhoneLinks(charSequence);
            addUrlsByPattern(z10, charSequence, z11, 0, 0, z12);
        }
    }

    public static boolean canDeleteMessage(int i10, boolean z10, TLRPC.Message message, TLRPC.Chat chat) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        TLRPC.Peer peer;
        if (message == null) {
            return false;
        }
        if (ChatObject.isChannelAndNotMegaGroup(chat) && (message.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) {
            return false;
        }
        if (message.id < 0) {
            return true;
        }
        if (chat == null && (peer = message.peer_id) != null && peer.channel_id != 0) {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(message.peer_id.channel_id));
        }
        if (!ChatObject.isChannel(chat)) {
            return z10 || isOut(message) || !ChatObject.isChannel(chat);
        }
        if (z10 && !chat.megagroup) {
            return chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && (tL_chatAdminRights2.delete_messages || message.out));
        }
        boolean z11 = message.out;
        return (z11 && (message instanceof TLRPC.TL_messageService)) ? message.id != 1 && ChatObject.canUserDoAdminAction(chat, 13) : z10 || (message.id != 1 && (chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && (tL_chatAdminRights.delete_messages || (z11 && (chat.megagroup || tL_chatAdminRights.post_messages)))) || (chat.megagroup && z11))));
    }

    public static String findAnimatedEmojiEmoticon(TLRPC.Document document, String str, Integer num) {
        if (document != null) {
            int size = document.attributes.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeSticker)) {
                    if (num != null) {
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(num.intValue()).getStickerSet(documentAttribute.stickerset, true);
                        StringBuilder sb2 = new StringBuilder("");
                        if (stickerSet != null && stickerSet.packs != null) {
                            for (int i11 = 0; i11 < stickerSet.packs.size(); i11++) {
                                TLRPC.TL_stickerPack tL_stickerPack = stickerSet.packs.get(i11);
                                if (tL_stickerPack.documents.contains(Long.valueOf(document.id))) {
                                    sb2.append(tL_stickerPack.emoticon);
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(sb2)) {
                            return sb2.toString();
                        }
                    }
                    return documentAttribute.alt;
                }
            }
        }
        return str;
    }

    public static TLRPC.InputStickerSet getInputStickerSet(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty) {
                    return null;
                }
                return inputStickerSet;
            }
        }
        return null;
    }

    public static boolean isGifDocument(TLRPC.Document document, boolean z10) {
        String str;
        if (document == null || (str = document.mime_type) == null) {
            return false;
        }
        return (str.equals("image/gif") && !z10) || isNewGifDocument(document);
    }

    public static boolean isMediaEmpty(TLRPC.Message message) {
        return isMediaEmpty(message, true);
    }

    public static Spannable replaceAnimatedEmoji(CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, Paint.FontMetricsInt fontMetricsInt, boolean z10) {
        return replaceAnimatedEmoji(charSequence, arrayList, fontMetricsInt, z10, 1.2f, 0);
    }

    public String getQuickReplyName() {
        return getQuickReplyName(this.messageOwner);
    }

    public long getTopicId() {
        return getTopicId(this.currentAccount, this.messageOwner, getForumFlags(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-getDialogId())), MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(getDialogId()))));
    }

    public static String getFileName(TLRPC.Message message) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        if (getMedia(message) instanceof TLRPC.TL_messageMediaDocument) {
            return getFileName(getDocument(message));
        }
        if (getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) {
            ArrayList<TLRPC.PhotoSize> arrayList = getMedia(message).photo.sizes;
            if (arrayList.size() > 0 && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize())) != null) {
                return FileLoader.getAttachFileName(closestPhotoSizeWithSize);
            }
            return "";
        }
        if ((getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) && getMedia(message).webpage != null) {
            return getFileName(getMedia(message).webpage.document);
        }
        return "";
    }

    public static TLRPC.MessageMedia getMedia(TLRPC.Message message) {
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) && !messageMedia.extended_media.isEmpty() && (message.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMedia)) {
            return ((TLRPC.TL_messageExtendedMedia) message.media.extended_media.get(0)).media;
        }
        return message.media;
    }

    public static boolean isMediaEmpty(TLRPC.Message message, boolean z10) {
        if (message == null || getMedia(message) == null || (getMedia(message) instanceof TLRPC.TL_messageMediaEmpty)) {
            return true;
        }
        return z10 && (getMedia(message) instanceof TLRPC.TL_messageMediaWebPage);
    }

    public static Spannable replaceAnimatedEmoji(CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, Paint.FontMetricsInt fontMetricsInt, boolean z10, float f10, int i10) {
        Emoji.EmojiSpan emojiSpan;
        org.telegram.ui.Components.t5 t5Var;
        Emoji.EmojiSpan emojiSpan2;
        Emoji.EmojiSpan emojiSpan3 = null;
        if (charSequence == null) {
            return null;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        if (arrayList != null) {
            int i11 = (SharedConfig.getDevicePerformanceClass() >= 2 ? 100 : 50) - i10;
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannableString.getSpans(0, spannableString.length(), Emoji.EmojiSpan.class);
            int i12 = 0;
            while (i12 < arrayList.size() && i11 > 0) {
                TLRPC.MessageEntity messageEntity = arrayList.get(i12);
                if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                    int i13 = 0;
                    while (i13 < emojiSpanArr.length) {
                        Emoji.EmojiSpan emojiSpan4 = emojiSpanArr[i13];
                        if (emojiSpan4 != null) {
                            int spanStart = spannableString.getSpanStart(emojiSpan4);
                            int spanEnd = spannableString.getSpanEnd(emojiSpan4);
                            int i14 = tL_messageEntityCustomEmoji.offset;
                            emojiSpan2 = emojiSpan3;
                            if (AndroidUtilities.intersect1d(i14, tL_messageEntityCustomEmoji.length + i14, spanStart, spanEnd)) {
                                spannableString.removeSpan(emojiSpan4);
                                emojiSpanArr[i13] = emojiSpan2;
                            }
                        } else {
                            emojiSpan2 = emojiSpan3;
                        }
                        i13++;
                        emojiSpan3 = emojiSpan2;
                    }
                    emojiSpan = emojiSpan3;
                    if (messageEntity.offset + messageEntity.length <= spannableString.length()) {
                        int i15 = messageEntity.offset;
                        org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spannableString.getSpans(i15, messageEntity.length + i15, org.telegram.ui.Components.t5.class);
                        if (t5VarArr != null && t5VarArr.length > 0) {
                            for (org.telegram.ui.Components.t5 t5Var2 : t5VarArr) {
                                spannableString.removeSpan(t5Var2);
                            }
                        }
                        if (tL_messageEntityCustomEmoji.document != null) {
                            t5Var = new org.telegram.ui.Components.t5(tL_messageEntityCustomEmoji.document, f10, fontMetricsInt);
                        } else {
                            t5Var = new org.telegram.ui.Components.t5(tL_messageEntityCustomEmoji.document_id, f10, fontMetricsInt);
                        }
                        t5Var.top = z10;
                        int i16 = messageEntity.offset;
                        spannableString.setSpan(t5Var, i16, messageEntity.length + i16, 33);
                        i11--;
                        i12++;
                        emojiSpan3 = emojiSpan;
                    }
                } else {
                    emojiSpan = emojiSpan3;
                }
                i12++;
                emojiSpan3 = emojiSpan;
            }
        }
        return spannableString;
    }

    public void applyNewText(CharSequence charSequence) {
        TextPaint textPaint;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        TLRPC.User user = isFromUser() ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.from_id.user_id)) : null;
        this.messageText = charSequence;
        ArrayList<TLRPC.MessageEntity> entities = getEntities();
        if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame) {
            textPaint = org.telegram.ui.ActionBar.g6.x2;
        } else {
            textPaint = org.telegram.ui.ActionBar.g6.o2;
        }
        int[] iArr = allowsBigEmoji() ? new int[1] : null;
        CharSequence replaceEmoji = Emoji.replaceEmoji(this.messageText, textPaint.getFontMetricsInt(), false, iArr);
        this.messageText = replaceEmoji;
        Spannable replaceAnimatedEmoji = replaceAnimatedEmoji(replaceEmoji, entities, textPaint.getFontMetricsInt());
        this.messageText = replaceAnimatedEmoji;
        if (iArr != null && iArr[0] > 1) {
            replaceEmojiToLottieFrame(replaceAnimatedEmoji, iArr);
        }
        checkEmojiOnly(iArr);
        generateLayout(user);
        setType();
    }

    public long getStakedDiceWinAmount() {
        TLRPC.TL_messages_emojiGameOutcome tL_messages_emojiGameOutcome;
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (!(media instanceof TLRPC.TL_messageMediaDice) || (tL_messages_emojiGameOutcome = ((TLRPC.TL_messageMediaDice) media).game_outcome) == null) {
            return 0L;
        }
        long j10 = tL_messages_emojiGameOutcome.ton_amount;
        return j10 > 0 ? j10 : -tL_messages_emojiGameOutcome.stake_ton_amount;
    }

    public boolean isAnimatedEmoji() {
        return (this.emojiAnimatedSticker == null && this.emojiAnimatedStickerId == null) ? false : true;
    }

    public boolean isPremiumSticker() {
        if (getMedia(this.messageOwner) == null || !getMedia(this.messageOwner).nopremium) {
            return isPremiumSticker(getDocument());
        }
        return false;
    }

    public static boolean canUnvote(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults;
        if (tL_messageMediaPoll != null && (pollResults = tL_messageMediaPoll.results) != null && !pollResults.results.isEmpty() && !tL_messageMediaPoll.poll.revoting_disabled) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_messageMediaPoll.results.results.get(i10).chosen) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long getChatId(TLRPC.Message message) {
        if (message == null) {
            return 0L;
        }
        TLRPC.Peer peer = message.peer_id;
        if (peer instanceof TLRPC.TL_peerChat) {
            return peer.chat_id;
        }
        if (peer instanceof TLRPC.TL_peerChannel) {
            return peer.channel_id;
        }
        return 0L;
    }

    public static TLRPC.Document getDocument(TLRPC.Message message) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TL_iv.RichMessage richMessage;
        if (message != null && (richMessage = message.rich_message) != null) {
            return findVideo(richMessage);
        }
        if (getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return getMedia(message).webpage.document;
        }
        if (getMedia(message) instanceof TLRPC.TL_messageMediaGame) {
            return getMedia(message).game.document;
        }
        if (getMedia(message) instanceof TLRPC.TL_messageMediaStory) {
            TL_stories.StoryItem storyItem = ((TLRPC.TL_messageMediaStory) getMedia(message)).storyItem;
            if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                return document;
            }
        } else if (getMedia(message) instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) getMedia(message);
            if (tL_messageMediaPaidMedia.extended_media.size() == 1 && (tL_messageMediaPaidMedia.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMedia)) {
                return ((TLRPC.TL_messageExtendedMedia) tL_messageMediaPaidMedia.extended_media.get(0)).media.document;
            }
        }
        if (getMedia(message) != null) {
            return getMedia(message).document;
        }
        return null;
    }

    public static int getQuickReplyId(int i10, TLRPC.Message message) {
        qf.p1 d;
        if (message == null) {
            return 0;
        }
        if ((message.flags & TLObject.FLAG_30) != 0) {
            return message.quick_reply_shortcut_id;
        }
        TLRPC.InputQuickReplyShortcut inputQuickReplyShortcut = message.quick_reply_shortcut;
        if (inputQuickReplyShortcut instanceof TLRPC.TL_inputQuickReplyShortcutId) {
            return ((TLRPC.TL_inputQuickReplyShortcutId) inputQuickReplyShortcut).shortcut_id;
        }
        String quickReplyName = getQuickReplyName(message);
        if (quickReplyName == null || (d = qf.q1.f(i10).d(quickReplyName)) == null) {
            return 0;
        }
        return d.a;
    }

    public static boolean isPremiumEmojiPack(TLRPC.StickerSetCovered stickerSetCovered) {
        TLRPC.StickerSet stickerSet;
        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && !stickerSet.emojis) {
            return false;
        }
        ArrayList<TLRPC.Document> arrayList = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
        if (stickerSetCovered != null && arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!isFreeEmoji(arrayList.get(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isVotedButResultsHiddenUntilClose(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        if (tL_messageMediaPoll == null) {
            return false;
        }
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        return !poll.closed && poll.hide_results_until_close && isVoted(tL_messageMediaPoll) && !isVoteResultsIsNotEmpty(tL_messageMediaPoll);
    }

    public boolean isSecretMedia() {
        int i10;
        TLRPC.Message message = this.messageOwner;
        return message instanceof TLRPC.TL_message_secret ? (((getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || isGif()) && (i10 = this.messageOwner.ttl) > 0 && i10 <= 60) || isVoice() || isRoundVideo() || isVideo() : (message instanceof TLRPC.TL_message) && getMedia(message) != null && getMedia(this.messageOwner).ttl_seconds != 0 && ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument));
    }

    public boolean isVoted() {
        if (this.type != 17) {
            return false;
        }
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (media instanceof TLRPC.TL_messageMediaPoll) {
            return isVoted((TLRPC.TL_messageMediaPoll) media);
        }
        return false;
    }

    public int textHeight(org.telegram.ui.Cells.r1 r1Var) {
        if (this.textLayoutBlocks == null) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.textLayoutBlocks.size(); i11++) {
            i10 += this.textLayoutBlocks.get(i11).height(r1Var) + this.textLayoutBlocks.get(i11).padTop + this.textLayoutBlocks.get(i11).padBottom;
        }
        return i10;
    }

    public static void addPaidReactions(int i10, TLRPC.MessageReactions messageReactions, int i11, long j10, boolean z10) {
        TLRPC.MessageReactor messageReactor = null;
        TLRPC.ReactionCount reactionCount = null;
        for (int i12 = 0; i12 < messageReactions.results.size(); i12++) {
            if (messageReactions.results.get(i12).reaction instanceof TLRPC.TL_reactionPaid) {
                reactionCount = messageReactions.results.get(i12);
            }
        }
        int i13 = 0;
        while (true) {
            if (i13 >= messageReactions.top_reactors.size()) {
                break;
            }
            if (messageReactions.top_reactors.get(i13).my) {
                messageReactor = messageReactions.top_reactors.get(i13);
                break;
            }
            i13++;
        }
        if (reactionCount == null && i11 > 0) {
            reactionCount = new TLRPC.TL_reactionCount();
            reactionCount.reaction = new TLRPC.TL_reactionPaid();
            messageReactions.results.add(0, reactionCount);
        }
        if (reactionCount != null) {
            reactionCount.chosen = z10;
            int max = Math.max(0, reactionCount.count + i11);
            reactionCount.count = max;
            if (max <= 0) {
                messageReactions.results.remove(reactionCount);
            }
        }
        if (messageReactor == null && i11 > 0) {
            messageReactor = new TLRPC.TL_messageReactor();
            messageReactor.my = true;
            messageReactions.top_reactors.add(messageReactor);
        }
        if (messageReactor != null) {
            messageReactor.count = Math.max(0, messageReactor.count + i11);
            messageReactor.anonymous = j10 == UserObject.ANONYMOUS;
            if (j10 != 0 && j10 != UserObject.ANONYMOUS) {
                messageReactor.peer_id = MessagesController.getInstance(i10).getPeer(j10);
            } else {
                messageReactor.peer_id = MessagesController.getInstance(i10).getPeer(UserConfig.getInstance(i10).getClientUserId());
            }
            if (messageReactor.count <= 0) {
                messageReactions.top_reactors.remove(messageReactor);
            }
        }
    }

    public static long getTopicId(int i10, TLRPC.Message message, int i11) {
        long topicId = getTopicId(i10, message, h7.a8.a(i11, 1), h7.a8.a(i11, 4));
        if (topicId == 0 && h7.a8.a(i11, 8)) {
            return -1L;
        }
        return topicId;
    }

    public static boolean isCompleted(TLRPC.TL_messageMediaToDo tL_messageMediaToDo, int i10) {
        for (int i11 = 0; i11 < tL_messageMediaToDo.completions.size(); i11++) {
            if (tL_messageMediaToDo.completions.get(i11).id == i10) {
                return true;
            }
        }
        return false;
    }

    public String getDiceEmoji(TLRPC.TL_messageMediaDice tL_messageMediaDice) {
        if (tL_messageMediaDice == null) {
            return null;
        }
        if (TextUtils.isEmpty(tL_messageMediaDice.emoticon)) {
            return "🎲";
        }
        return tL_messageMediaDice.emoticon.replace("️", "");
    }

    public boolean shouldEncryptPhotoOrVideo() {
        return shouldEncryptPhotoOrVideo(this.currentAccount, this.messageOwner);
    }

    public TLRPC.InputStickerSet getInputStickerSet() {
        return getInputStickerSet(this.messageOwner);
    }

    public static CharSequence formatTextWithEntities(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, TextPaint textPaint) {
        return formatTextWithEntities(tL_textWithEntities, z10, false, textPaint);
    }

    public static boolean isNewGifDocument(TLRPC.Document document) {
        if (document != null && "video/mp4".equals(document.mime_type)) {
            boolean z10 = false;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < document.attributes.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) {
                    z10 = true;
                } else if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    i10 = documentAttribute.w;
                    i11 = documentAttribute.h;
                }
            }
            if (z10 && i10 <= 1280 && i11 <= 1280) {
                return true;
            }
        }
        return false;
    }

    public static boolean peersEqual(TLRPC.InputPeer inputPeer, TLRPC.Peer peer) {
        if (inputPeer == null && peer == null) {
            return true;
        }
        if (inputPeer != null && peer != null) {
            if ((inputPeer instanceof TLRPC.TL_inputPeerChat) && (peer instanceof TLRPC.TL_peerChat)) {
                return inputPeer.chat_id == peer.chat_id;
            }
            if ((inputPeer instanceof TLRPC.TL_inputPeerChannel) && (peer instanceof TLRPC.TL_peerChannel)) {
                return inputPeer.channel_id == peer.channel_id;
            }
            if ((inputPeer instanceof TLRPC.TL_inputPeerUser) && (peer instanceof TLRPC.TL_peerUser) && inputPeer.user_id == peer.user_id) {
                return true;
            }
        }
        return false;
    }

    public boolean isPhoto() {
        return isPhoto(this.messageOwner);
    }

    public static CharSequence formatTextWithEntities(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, boolean z11, TextPaint textPaint) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
        addEntitiesToText(spannableStringBuilder, tL_textWithEntities.entities, z10, false, z11, false);
        return replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint.getFontMetricsInt());
    }

    public static <T extends TLRPC.MessageMedia> T getMedia(TLRPC.Message message, Class<T> cls) {
        TLRPC.MessageMedia media = getMedia(message);
        if (cls.isInstance(media)) {
            return cls.cast(media);
        }
        return null;
    }

    public static Long getMyPaidReactionPeer(TLRPC.MessageReactions messageReactions) {
        ArrayList<TLRPC.MessageReactor> arrayList;
        if (messageReactions == null || (arrayList = messageReactions.top_reactors) == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.MessageReactor messageReactor = arrayList.get(i10);
            i10++;
            TLRPC.MessageReactor messageReactor2 = messageReactor;
            if (messageReactor2 != null && messageReactor2.my) {
                if (messageReactor2.anonymous) {
                    return Long.valueOf(UserObject.ANONYMOUS);
                }
                TLRPC.Peer peer = messageReactor2.peer_id;
                if (peer != null) {
                    return Long.valueOf(DialogObject.getPeerDialogId(peer));
                }
            }
        }
        return null;
    }

    public static boolean addEntitiesToText(CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, boolean z10, boolean z11, boolean z12, boolean z13) {
        return addEntitiesToText(charSequence, arrayList, z10, z11, z12, z13, 0);
    }

    @Deprecated
    public static long getTopicId(int i10, TLRPC.Message message, boolean z10) {
        return getTopicId(i10, message, z10, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x01d3, code lost:
    
        if (r8.contains("domain=telegrampassport") == false) goto L158;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean addEntitiesToText(CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, boolean z10, boolean z11, boolean z12, boolean z13, int i10) {
        int i11;
        String str;
        CharSequence charSequence2;
        Spannable spannable;
        byte b10;
        int i12;
        boolean z14;
        int i13;
        int i14;
        String str2;
        int size;
        int i15;
        int i16;
        if (!(charSequence instanceof Spannable)) {
            return false;
        }
        CharSequence a2 = v00.a(charSequence, false);
        Spannable spannable2 = (Spannable) a2;
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable2.getSpans(0, a2.length(), URLSpan.class);
        boolean z15 = uRLSpanArr != null && uRLSpanArr.length > 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            byte b11 = z12 ? (byte) 2 : z10 ? (byte) 1 : (byte) 0;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(arrayList);
            Collections.sort(arrayList3, new q(14));
            int size2 = arrayList3.size();
            int i17 = 0;
            while (i17 < size2) {
                TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList3.get(i17);
                if (messageEntity.length > 0 && (i14 = messageEntity.offset) >= 0 && i14 < a2.length()) {
                    if (messageEntity.offset + messageEntity.length > a2.length()) {
                        messageEntity.length = a2.length() - messageEntity.offset;
                    }
                    if ((!z13 || (messageEntity instanceof TLRPC.TL_messageEntityBold) || (messageEntity instanceof TLRPC.TL_messageEntityItalic) || (messageEntity instanceof TLRPC.TL_messageEntityStrike) || (messageEntity instanceof TLRPC.TL_messageEntityUnderline) || (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) || (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) || (messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityPre) || (messageEntity instanceof TLRPC.TL_messageEntityMentionName) || (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) || (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) || (messageEntity instanceof TLRPC.TL_messageEntityDiffInsert) || (messageEntity instanceof TLRPC.TL_messageEntityDiffReplace) || (messageEntity instanceof TLRPC.TL_messageEntityDiffDelete)) && uRLSpanArr != null && uRLSpanArr.length > 0) {
                        for (int i18 = 0; i18 < uRLSpanArr.length; i18++) {
                            URLSpan uRLSpan = uRLSpanArr[i18];
                            if (uRLSpan != null) {
                                int spanStart = spannable2.getSpanStart(uRLSpan);
                                int spanEnd = spannable2.getSpanEnd(uRLSpanArr[i18]);
                                int i19 = messageEntity.offset;
                                if ((i19 <= spanStart && messageEntity.length + i19 >= spanStart) || (i19 <= spanEnd && i19 + messageEntity.length >= spanEnd)) {
                                    spannable2.removeSpan(uRLSpanArr[i18]);
                                    uRLSpanArr[i18] = null;
                                }
                            }
                        }
                    }
                    if ((i10 != 1 || (messageEntity instanceof TLRPC.TL_messageEntityHashtag)) && !(messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) && !(messageEntity instanceof TLRPC.TL_messageEntityBlockquote) && !(messageEntity instanceof TLRPC.TL_messageEntityPre) && !(messageEntity instanceof TLRPC.TL_messageEntityDiffReplace)) {
                        xz0 xz0Var = new xz0();
                        int i20 = messageEntity.offset;
                        xz0Var.b = i20;
                        xz0Var.c = i20 + messageEntity.length;
                        if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                            xz0Var.a = 256;
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                            xz0Var.a = 8;
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityDiffDelete) {
                            xz0Var.a = 8192;
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                            xz0Var.a = 16;
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                            xz0Var.a = 1;
                        } else {
                            if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                xz0Var.a = 2;
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                                xz0Var.a = 4;
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityDiffInsert) {
                                xz0Var.a = 4096;
                            } else {
                                if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                                    if (z11) {
                                        xz0Var.a = 64;
                                        xz0Var.d = messageEntity;
                                    }
                                } else if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                    if (z11) {
                                        xz0Var.a = 64;
                                        xz0Var.d = messageEntity;
                                    }
                                } else if (!z13 || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate)) {
                                    if (((messageEntity instanceof TLRPC.TL_messageEntityUrl) || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl)) && (str2 = messageEntity.url) != null) {
                                        try {
                                            String lowerCase = str2.toLowerCase();
                                            if (!lowerCase.startsWith("tg:passport")) {
                                                if (!lowerCase.startsWith("tg://passport")) {
                                                    if (!lowerCase.startsWith("tg:secureid")) {
                                                        if (lowerCase.contains("resolve")) {
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    if (!(messageEntity instanceof TLRPC.TL_messageEntityMention) || z11) {
                                        xz0Var.a = 128;
                                        xz0Var.d = messageEntity;
                                        if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                            xz0Var.a = 1152;
                                        }
                                    }
                                }
                                i17++;
                                size2 = i13;
                            }
                            size = arrayList2.size();
                            i15 = 0;
                            while (i15 < size) {
                                xz0 xz0Var2 = (xz0) arrayList2.get(i15);
                                if ((xz0Var2.a & 256) == 0 || xz0Var.b < xz0Var2.b || xz0Var.c > xz0Var2.c) {
                                    int i21 = xz0Var.b;
                                    int i22 = xz0Var2.b;
                                    if (i21 > i22) {
                                        int i23 = xz0Var2.c;
                                        if (i21 < i23) {
                                            if (xz0Var.c < i23) {
                                                xz0 xz0Var3 = new xz0(xz0Var);
                                                xz0Var3.b(xz0Var2);
                                                arrayList2.add(i15 + 1, xz0Var3);
                                                xz0 xz0Var4 = new xz0(xz0Var2);
                                                xz0Var4.b = xz0Var.c;
                                                i15 += 2;
                                                size += 2;
                                                arrayList2.add(i15, xz0Var4);
                                            } else {
                                                xz0 xz0Var5 = new xz0(xz0Var);
                                                xz0Var5.b(xz0Var2);
                                                xz0Var5.c = xz0Var2.c;
                                                i15++;
                                                size++;
                                                arrayList2.add(i15, xz0Var5);
                                            }
                                            int i24 = xz0Var.b;
                                            xz0Var.b = xz0Var2.c;
                                            xz0Var2.c = i24;
                                        }
                                    } else {
                                        int i25 = xz0Var.c;
                                        if (i22 < i25) {
                                            i16 = size2;
                                            int i26 = xz0Var2.c;
                                            if (i25 == i26) {
                                                xz0Var2.b(xz0Var);
                                            } else if (i25 < i26) {
                                                xz0 xz0Var6 = new xz0(xz0Var2);
                                                xz0Var6.b(xz0Var);
                                                xz0Var6.c = xz0Var.c;
                                                i15++;
                                                size++;
                                                arrayList2.add(i15, xz0Var6);
                                                xz0Var2.b = xz0Var.c;
                                            } else {
                                                xz0 xz0Var7 = new xz0(xz0Var);
                                                xz0Var7.b = xz0Var2.c;
                                                i15++;
                                                size++;
                                                arrayList2.add(i15, xz0Var7);
                                                xz0Var2.b(xz0Var);
                                            }
                                            xz0Var.c = i22;
                                            i15++;
                                            size2 = i16;
                                        }
                                    }
                                }
                                i16 = size2;
                                i15++;
                                size2 = i16;
                            }
                            i13 = size2;
                            if (xz0Var.b >= xz0Var.c) {
                                arrayList2.add(xz0Var);
                            }
                            i17++;
                            size2 = i13;
                        }
                        size = arrayList2.size();
                        i15 = 0;
                        while (i15 < size) {
                        }
                        i13 = size2;
                        if (xz0Var.b >= xz0Var.c) {
                        }
                        i17++;
                        size2 = i13;
                    }
                }
                i13 = size2;
                i17++;
                size2 = i13;
            }
            int min = Math.min(MediaDataController.MAX_STYLE_RUNS_COUNT, arrayList2.size());
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            while (i27 < min) {
                xz0 xz0Var8 = (xz0) arrayList2.get(i27);
                if (i10 != 1 || (xz0Var8.d instanceof TLRPC.TL_messageEntityHashtag)) {
                    TLRPC.MessageEntity messageEntity2 = xz0Var8.d;
                    if (messageEntity2 != null) {
                        int i30 = messageEntity2.offset;
                        str = TextUtils.substring(a2, i30, messageEntity2.length + i30);
                    } else {
                        str = null;
                    }
                    TLRPC.MessageEntity messageEntity3 = xz0Var8.d;
                    if (!(messageEntity3 instanceof TLRPC.TL_messageEntityBotCommand)) {
                        if ((messageEntity3 instanceof TLRPC.TL_messageEntityHashtag) || (messageEntity3 instanceof TLRPC.TL_messageEntityMention)) {
                            charSequence2 = a2;
                            spannable = spannable2;
                            b10 = b11;
                            i12 = MediaDataController.MAX_LINKS_COUNT;
                        } else if (messageEntity3 instanceof TLRPC.TL_messageEntityCashtag) {
                            charSequence2 = a2;
                            spannable = spannable2;
                            b10 = b11;
                            i12 = MediaDataController.MAX_LINKS_COUNT;
                        } else if (!(messageEntity3 instanceof TLRPC.TL_messageEntityEmail)) {
                            charSequence2 = a2;
                            if (messageEntity3 instanceof TLRPC.TL_messageEntityUrl) {
                                if (i28 < 250) {
                                    i28++;
                                    if (!str.toLowerCase().contains("://")) {
                                        boolean z16 = org.telegram.ui.web.z0.I0;
                                        str = (org.telegram.ui.web.z0.o(Uri.parse(str)) ? "tonsite://" : "http://").concat(str);
                                    }
                                    if (str != null) {
                                        str = str.replaceAll("∕|⁄|%E2%81%84|%E2%88%95", "/");
                                    }
                                    if (we.e.j(str)) {
                                        spannable = spannable2;
                                        b10 = b11;
                                        z15 = true;
                                        i27++;
                                        spannable2 = spannable;
                                        b11 = b10;
                                        a2 = charSequence2;
                                    } else {
                                        spannable2.setSpan(new p41(str, xz0Var8), xz0Var8.b, xz0Var8.c, 33);
                                        spannable = spannable2;
                                        b10 = b11;
                                        z14 = false;
                                        z15 = true;
                                        if (!z14) {
                                        }
                                        i27++;
                                        spannable2 = spannable;
                                        b11 = b10;
                                        a2 = charSequence2;
                                    }
                                }
                                spannable = spannable2;
                                b10 = b11;
                                i27++;
                                spannable2 = spannable;
                                b11 = b10;
                                a2 = charSequence2;
                            } else if (messageEntity3 instanceof TLRPC.TL_messageEntityFormattedDate) {
                                if (i28 < 250) {
                                    i28++;
                                    spannable2.setSpan(new v00(str, xz0Var8, (TLRPC.TL_messageEntityFormattedDate) xz0Var8.d), xz0Var8.b, xz0Var8.c, 33);
                                    spannable = spannable2;
                                    b10 = b11;
                                    z14 = false;
                                    if (!z14) {
                                    }
                                    i27++;
                                    spannable2 = spannable;
                                    b11 = b10;
                                    a2 = charSequence2;
                                }
                                spannable = spannable2;
                                b10 = b11;
                                i27++;
                                spannable2 = spannable;
                                b11 = b10;
                                a2 = charSequence2;
                            } else {
                                if (messageEntity3 instanceof TLRPC.TL_messageEntityBankCard) {
                                    spannable2.setSpan(new r41(s3.c.e("card:", str), xz0Var8), xz0Var8.b, xz0Var8.c, 33);
                                } else if (messageEntity3 instanceof TLRPC.TL_messageEntityPhone) {
                                    String d = oe.b.d(str, false);
                                    if (str.startsWith("+")) {
                                        d = s3.c.e("+", d);
                                    }
                                    spannable2.setSpan(new r41(s3.c.e("tel:", d), xz0Var8), xz0Var8.b, xz0Var8.c, 33);
                                } else if (messageEntity3 instanceof TLRPC.TL_messageEntityTextUrl) {
                                    if (i28 < 250) {
                                        i28++;
                                        String str3 = messageEntity3.url;
                                        if (str3 != null) {
                                            str3 = str3.replaceAll("∕|⁄|%E2%81%84|%E2%88%95", "/");
                                        }
                                        if (we.e.j(str3)) {
                                            spannable = spannable2;
                                            b10 = b11;
                                            i27++;
                                            spannable2 = spannable;
                                            b11 = b10;
                                            a2 = charSequence2;
                                        } else {
                                            spannable2.setSpan(new t41(str3, xz0Var8), xz0Var8.b, xz0Var8.c, 33);
                                            spannable = spannable2;
                                            b10 = b11;
                                            z14 = false;
                                            if (!z14) {
                                            }
                                            i27++;
                                            spannable2 = spannable;
                                            b11 = b10;
                                            a2 = charSequence2;
                                        }
                                    }
                                    spannable = spannable2;
                                    b10 = b11;
                                    i27++;
                                    spannable2 = spannable;
                                    b11 = b10;
                                    a2 = charSequence2;
                                } else {
                                    if (messageEntity3 instanceof TLRPC.TL_messageEntityMentionName) {
                                        spannable2.setSpan(new u41("" + ((TLRPC.TL_messageEntityMentionName) xz0Var8.d).user_id, b11, xz0Var8), xz0Var8.b, xz0Var8.c, 33);
                                    } else if (messageEntity3 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                        spannable2.setSpan(new u41("" + ((TLRPC.TL_inputMessageEntityMentionName) xz0Var8.d).user_id.user_id, b11, xz0Var8), xz0Var8.b, xz0Var8.c, 33);
                                    } else if ((xz0Var8.a & 4) != 0) {
                                        Spannable spannable3 = spannable2;
                                        byte b12 = b11;
                                        spannable = spannable3;
                                        b10 = b12;
                                        spannable.setSpan(new q41(spannable3, xz0Var8.b, xz0Var8.c, b12, xz0Var8), xz0Var8.b, xz0Var8.c, 33);
                                        z14 = false;
                                        if (!z14) {
                                        }
                                        i27++;
                                        spannable2 = spannable;
                                        b11 = b10;
                                        a2 = charSequence2;
                                    } else {
                                        spannable = spannable2;
                                        b10 = b11;
                                        spannable.setSpan(new yz0(xz0Var8, 0), xz0Var8.b, xz0Var8.c, 33);
                                        z14 = true;
                                        if (!z14) {
                                        }
                                        i27++;
                                        spannable2 = spannable;
                                        b11 = b10;
                                        a2 = charSequence2;
                                    }
                                    spannable = spannable2;
                                    b10 = b11;
                                    z14 = false;
                                    if (!z14) {
                                    }
                                    i27++;
                                    spannable2 = spannable;
                                    b11 = b10;
                                    a2 = charSequence2;
                                }
                                spannable = spannable2;
                                b10 = b11;
                                z14 = false;
                                z15 = true;
                                if (!z14) {
                                }
                                i27++;
                                spannable2 = spannable;
                                b11 = b10;
                                a2 = charSequence2;
                            }
                        } else if (i28 < 250) {
                            i28++;
                            spannable2.setSpan(new t41(s3.c.e("mailto:", str), xz0Var8), xz0Var8.b, xz0Var8.c, 33);
                            charSequence2 = a2;
                            spannable = spannable2;
                            b10 = b11;
                            z14 = false;
                            if (!z14) {
                            }
                            i27++;
                            spannable2 = spannable;
                            b11 = b10;
                            a2 = charSequence2;
                        }
                        if (i28 < i12) {
                            i28++;
                            spannable.setSpan(new r41(str, xz0Var8), xz0Var8.b, xz0Var8.c, 33);
                            z14 = false;
                            if (!z14) {
                            }
                        }
                        i27++;
                        spannable2 = spannable;
                        b11 = b10;
                        a2 = charSequence2;
                    } else if (i28 < 250) {
                        i28++;
                        spannable2.setSpan(new o41(str, b11, xz0Var8), xz0Var8.b, xz0Var8.c, 33);
                        charSequence2 = a2;
                        spannable = spannable2;
                        b10 = b11;
                        z14 = false;
                        if (!z14) {
                            if ((xz0Var8.a & 256) != 0 && i29 < 100) {
                                i29++;
                                spannable.setSpan(new yz0(xz0Var8, 0), xz0Var8.b, xz0Var8.c, 33);
                                i27++;
                                spannable2 = spannable;
                                b11 = b10;
                                a2 = charSequence2;
                            }
                            i27++;
                            spannable2 = spannable;
                            b11 = b10;
                            a2 = charSequence2;
                        }
                        i27++;
                        spannable2 = spannable;
                        b11 = b10;
                        a2 = charSequence2;
                    }
                }
                charSequence2 = a2;
                spannable = spannable2;
                b10 = b11;
                i27++;
                spannable2 = spannable;
                b11 = b10;
                a2 = charSequence2;
            }
            CharSequence charSequence3 = a2;
            Spannable spannable4 = spannable2;
            int i31 = 0;
            int size3 = arrayList3.size();
            for (int i32 = 0; i32 < size3; i32++) {
                TLRPC.MessageEntity messageEntity4 = (TLRPC.MessageEntity) arrayList3.get(i32);
                if (messageEntity4.length > 0 && (i11 = messageEntity4.offset) >= 0 && i11 < charSequence3.length()) {
                    if (messageEntity4.offset + messageEntity4.length > charSequence3.length()) {
                        messageEntity4.length = charSequence3.length() - messageEntity4.offset;
                    }
                    if (messageEntity4 instanceof TLRPC.TL_messageEntityBlockquote) {
                        int i33 = messageEntity4.offset;
                        hi0.b(spannable4, i33, messageEntity4.length + i33, messageEntity4.collapsed);
                    } else {
                        if (messageEntity4 instanceof TLRPC.TL_messageEntityPre) {
                            if (i31 < 50) {
                                i31++;
                                int i34 = messageEntity4.offset;
                                int i35 = messageEntity4.length + i34;
                                spannable4.setSpan(new CodeHighlighting.Span(true, 0, null, messageEntity4.language, spannable4.subSequence(i34, i35).toString()), i34, i35, 33);
                            }
                        } else if (messageEntity4 instanceof TLRPC.TL_messageEntityDiffReplace) {
                            int i36 = messageEntity4.offset;
                            spannable4.setSpan(new lv0(), i36, messageEntity4.length + i36, 33);
                        }
                    }
                }
            }
        }
        return z15;
    }

    @Deprecated
    private static long getTopicId(int i10, TLRPC.Message message, boolean z10, boolean z11) {
        int i11;
        long clientUserId = UserConfig.getInstance(i10).getClientUserId();
        if (z11) {
            return getMonoForumTopicId(message);
        }
        if ((message.flags & TLObject.FLAG_30) != 0 && DialogObject.getPeerDialogId(message.peer_id) == clientUserId) {
            i11 = message.quick_reply_shortcut_id;
        } else {
            if (!z10 && i10 >= 0 && DialogObject.getPeerDialogId(message.peer_id) == clientUserId) {
                return getSavedDialogId(clientUserId, message);
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionTopicCreate) {
                i11 = message.id;
            } else {
                TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
                if (messageReplyHeader == null || !messageReplyHeader.forum_topic) {
                    return z10 ? 1L : 0L;
                }
                if ((message instanceof TLRPC.TL_messageService) && !(messageAction instanceof TLRPC.TL_messageActionPinMessage)) {
                    int i12 = messageReplyHeader.reply_to_msg_id;
                    if (i12 == 0) {
                        i12 = messageReplyHeader.reply_to_top_id;
                    }
                    return i12;
                }
                int i13 = messageReplyHeader.reply_to_top_id;
                if (i13 == 0) {
                    i13 = messageReplyHeader.reply_to_msg_id;
                }
                return i13;
            }
        }
        return i11;
    }

    public int getQuickReplyId() {
        return getQuickReplyId(this.messageOwner);
    }

    public static String getFileName(TLRPC.Document document) {
        return FileLoader.getAttachFileName(document);
    }

    public static boolean peersEqual(TLRPC.Peer peer, TLRPC.Peer peer2) {
        if (peer == null && peer2 == null) {
            return true;
        }
        if (peer != null && peer2 != null) {
            if ((peer instanceof TLRPC.TL_peerChat) && (peer2 instanceof TLRPC.TL_peerChat)) {
                return peer.chat_id == peer2.chat_id;
            }
            if ((peer instanceof TLRPC.TL_peerChannel) && (peer2 instanceof TLRPC.TL_peerChannel)) {
                return peer.channel_id == peer2.channel_id;
            }
            if ((peer instanceof TLRPC.TL_peerUser) && (peer2 instanceof TLRPC.TL_peerUser) && peer.user_id == peer2.user_id) {
                return true;
            }
        }
        return false;
    }

    public static CharSequence replaceWithLink(CharSequence charSequence, String str, CharSequence charSequence2) {
        return TextUtils.indexOf(charSequence, str) >= 0 ? TextUtils.replace(charSequence, new String[]{str}, new CharSequence[]{charSequence2}) : charSequence;
    }

    public static String getFileName(TLRPC.MessageMedia messageMedia) {
        TLRPC.WebPage webPage;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            return FileLoader.getAttachFileName(messageMedia.document);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            ArrayList<TLRPC.PhotoSize> arrayList = messageMedia.photo.sizes;
            if (arrayList.size() > 0 && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize())) != null) {
                return FileLoader.getAttachFileName(closestPhotoSizeWithSize);
            }
            return "";
        }
        if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null) {
            return FileLoader.getAttachFileName(webPage.document);
        }
        return "";
    }

    public static CharSequence peerNameWithIcon(int i10, long j10) {
        return peerNameWithIcon(i10, j10, false);
    }

    public static CharSequence peerNameWithIcon(int i10, long j10, boolean z10) {
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            if (user != null) {
                return AndroidUtilities.removeDiacritics(UserObject.getUserName(user));
            }
            return "";
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        if (chat != null) {
            return new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat) ? channelSpan() : groupSpan()).append((CharSequence) " ").append((CharSequence) AndroidUtilities.removeDiacritics(chat.title));
        }
        return "";
    }

    public static CharSequence replaceWithLink(CharSequence charSequence, String str, TLObject tLObject) {
        String str2;
        CharSequence charSequence2;
        String str3;
        TLObject tLObject2;
        int indexOf = TextUtils.indexOf(charSequence, str);
        if (indexOf < 0) {
            return charSequence;
        }
        TLObject tLObject3 = null;
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            charSequence2 = UserObject.getUserName(user).replace('\n', ' ');
            str2 = "" + user.id;
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            charSequence2 = chat.title.replace('\n', ' ');
            str2 = "" + (-chat.id);
        } else if (tLObject instanceof TLRPC.TL_game) {
            charSequence2 = ((TLRPC.TL_game) tLObject).title.replace('\n', ' ');
            str2 = "game";
        } else {
            if (tLObject instanceof TLRPC.TL_chatInviteExported) {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject;
                charSequence2 = tL_chatInviteExported.link.replace('\n', ' ');
                str3 = "invite";
                tLObject2 = tL_chatInviteExported;
            } else if (tLObject instanceof TLRPC.ForumTopic) {
                charSequence2 = wf.c.j((TLRPC.ForumTopic) tLObject, null, null);
                str3 = "topic";
                tLObject2 = tLObject;
            } else {
                str2 = "0";
                charSequence2 = "";
            }
            String str4 = str3;
            tLObject3 = tLObject2;
            str2 = str4;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(TextUtils.replace(charSequence, new String[]{str}, new CharSequence[]{charSequence2}));
        s41 s41Var = new s41(s3.c.e("", str2));
        s41Var.c = tLObject3;
        spannableStringBuilder.setSpan(s41Var, indexOf, charSequence2.length() + indexOf, 33);
        return spannableStringBuilder;
    }

    public static boolean peersEqual(TLRPC.Chat chat, TLRPC.Peer peer) {
        if (chat == null && peer == null) {
            return true;
        }
        if (chat != null && peer != null) {
            if (ChatObject.isChannel(chat) && (peer instanceof TLRPC.TL_peerChannel)) {
                return chat.id == peer.channel_id;
            }
            if (!ChatObject.isChannel(chat) && (peer instanceof TLRPC.TL_peerChat) && chat.id == peer.chat_id) {
                return true;
            }
        }
        return false;
    }

    public static String getMusicTitle(TLRPC.Document document, boolean z10) {
        if (document == null) {
            return LocaleController.getString(R.string.AudioUnknownTitle);
        }
        for (int i10 = 0; i10 < document.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                String str = documentAttribute.title;
                if (str != null && !str.isEmpty()) {
                    return str;
                }
                String documentFileName = FileLoader.getDocumentFileName(document);
                return (TextUtils.isEmpty(documentFileName) && z10) ? LocaleController.getString(R.string.AudioUnknownTitle) : documentFileName;
            }
        }
        String documentFileName2 = FileLoader.getDocumentFileName(document);
        return !TextUtils.isEmpty(documentFileName2) ? documentFileName2 : LocaleController.getString(R.string.AudioUnknownTitle);
    }

    public void checkForScam() {
    }

    @Deprecated
    public void generateSuggestionApprovalMessageText() {
    }

    public MessageObject(int i10, TLRPC.Message message, String str, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.type = MediaDataController.MAX_STYLE_RUNS_COUNT;
        this.forceSeekTo = -1.0f;
        this.actionDeleteGroupEventId = -1L;
        this.overrideLinkColor = -1;
        this.overrideLinkEmoji = -1L;
        this.messageTrimmedToHighlightCut = true;
        this.topicIconDrawable = new Drawable[1];
        this.spoiledLoginCode = false;
        this.translated = false;
        this.summarized = false;
        this.localType = z10 ? 2 : 1;
        this.currentAccount = i10;
        this.localName = str2;
        this.localUserName = str3;
        this.messageText = str;
        this.messageOwner = message;
        this.localChannel = z11;
        this.localSupergroup = z12;
        this.localEdit = z13;
    }

    public static void addPhoneLinks(CharSequence charSequence) {
    }

    public static String getMusicAuthor(TLRPC.Document document, boolean z10) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && !documentAttribute.voice) {
                    String str = documentAttribute.performer;
                    return (TextUtils.isEmpty(str) && z10) ? LocaleController.getString(R.string.AudioUnknownArtist) : str;
                }
            }
        }
        return LocaleController.getString(R.string.AudioUnknownArtist);
    }

    public MessageObject(int i10, TLRPC.Message message, AbstractMap<Long, TLRPC.User> abstractMap, boolean z10, boolean z11) {
        this(i10, message, abstractMap, (AbstractMap<Long, TLRPC.Chat>) null, z10, z11);
    }

    public MessageObject(int i10, TLRPC.Message message, a0.h hVar, boolean z10, boolean z11) {
        this(i10, message, hVar, (a0.h) null, z10, z11);
    }

    public MessageObject(int i10, TLRPC.Message message, boolean z10, boolean z11) {
        this(i10, message, null, null, null, null, null, z10, z11, 0L);
    }

    public MessageObject(int i10, TLRPC.Message message, MessageObject messageObject, boolean z10, boolean z11) {
        this(i10, message, messageObject, null, null, null, null, z10, z11, 0L);
    }

    public MessageObject(int i10, TLRPC.Message message, AbstractMap<Long, TLRPC.User> abstractMap, AbstractMap<Long, TLRPC.Chat> abstractMap2, boolean z10, boolean z11) {
        this(i10, message, abstractMap, abstractMap2, z10, z11, 0L);
    }

    public MessageObject(int i10, TLRPC.Message message, a0.h hVar, a0.h hVar2, boolean z10, boolean z11) {
        this(i10, message, null, null, null, hVar, hVar2, z10, z11, 0L, false, false, false);
    }

    public MessageObject(int i10, TLRPC.Message message, a0.h hVar, a0.h hVar2, boolean z10, boolean z11, boolean z12) {
        this(i10, message, null, null, null, hVar, hVar2, z10, z11, 0L, false, false, z12);
    }

    public MessageObject(int i10, TLRPC.Message message, AbstractMap<Long, TLRPC.User> abstractMap, AbstractMap<Long, TLRPC.Chat> abstractMap2, boolean z10, boolean z11, long j10) {
        this(i10, message, null, abstractMap, abstractMap2, null, null, z10, z11, j10);
    }

    public MessageObject(int i10, TLRPC.Message message, MessageObject messageObject, AbstractMap<Long, TLRPC.User> abstractMap, AbstractMap<Long, TLRPC.Chat> abstractMap2, a0.h hVar, a0.h hVar2, boolean z10, boolean z11, long j10) {
        this(i10, message, messageObject, abstractMap, abstractMap2, hVar, hVar2, z10, z11, j10, false, false, false);
    }

    public MessageObject(int i10, TLRPC.Message message, MessageObject messageObject, AbstractMap<Long, TLRPC.User> abstractMap, AbstractMap<Long, TLRPC.Chat> abstractMap2, a0.h hVar, a0.h hVar2, boolean z10, boolean z11, long j10, boolean z12, boolean z13, boolean z14) {
        this(i10, message, messageObject, abstractMap, abstractMap2, hVar, hVar2, z10, z11, j10, z12, z13, z14, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v3 */
    public MessageObject(int i10, TLRPC.Message message, MessageObject messageObject, AbstractMap<Long, TLRPC.User> abstractMap, AbstractMap<Long, TLRPC.Chat> abstractMap2, a0.h hVar, a0.h hVar2, boolean z10, boolean z11, long j10, boolean z12, boolean z13, boolean z14, int i11) {
        AbstractMap<Long, TLRPC.User> abstractMap3;
        a0.h hVar3;
        ?? r15;
        TextPaint textPaint;
        this.type = MediaDataController.MAX_STYLE_RUNS_COUNT;
        this.forceSeekTo = -1.0f;
        this.actionDeleteGroupEventId = -1L;
        this.overrideLinkColor = -1;
        this.overrideLinkEmoji = -1L;
        this.messageTrimmedToHighlightCut = true;
        this.topicIconDrawable = new Drawable[1];
        this.spoiledLoginCode = false;
        this.translated = false;
        this.summarized = false;
        org.telegram.ui.ActionBar.g6.O();
        this.isRepostPreview = z12;
        this.isRepostVideoPreview = z13;
        this.isSaved = z14 || getDialogId(message) == UserConfig.getInstance(i10).getClientUserId();
        this.searchType = i11;
        this.currentAccount = i10;
        this.messageOwner = message;
        this.replyMessageObject = messageObject;
        this.eventId = j10;
        this.wasUnread = !message.out && message.unread;
        TLRPC.Message message2 = message.replyMessage;
        if (message2 != null) {
            abstractMap3 = abstractMap;
            hVar3 = hVar;
            r15 = 0;
            this.replyMessageObject = new MessageObject(i10, message2, null, abstractMap3, abstractMap2, hVar3, hVar2, false, z11, j10);
        } else {
            abstractMap3 = abstractMap;
            hVar3 = hVar;
            r15 = 0;
        }
        TLRPC.Peer peer = message.from_id;
        if (peer instanceof TLRPC.TL_peerUser) {
            getUser(abstractMap3, hVar3, peer.user_id);
        }
        updateMessageText(abstractMap3, abstractMap2, hVar3, hVar2);
        setType();
        if (z10) {
            updateTranslation(r15);
        }
        measureInlineBotButtons();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(this.messageOwner.date * 1000);
        int i12 = gregorianCalendar.get(6);
        int i13 = gregorianCalendar.get(1);
        int i14 = gregorianCalendar.get(2);
        Integer valueOf = Integer.valueOf(i13);
        Integer valueOf2 = Integer.valueOf(i14);
        Integer valueOf3 = Integer.valueOf(i12);
        Object[] objArr = new Object[3];
        objArr[r15] = valueOf;
        objArr[1] = valueOf2;
        objArr[2] = valueOf3;
        this.dateKey = String.format("%d_%02d_%02d", objArr);
        this.dateKeyInt = (i12 * MediaController.VIDEO_BITRATE_480) + (i14 * 10000) + i13;
        Integer valueOf4 = Integer.valueOf(i13);
        Integer valueOf5 = Integer.valueOf(i14);
        Object[] objArr2 = new Object[2];
        objArr2[r15] = valueOf4;
        objArr2[1] = valueOf5;
        this.monthKey = String.format("%d_%02d", objArr2);
        createMessageSendInfo();
        generateCaption();
        if (z10) {
            if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame) {
                textPaint = org.telegram.ui.ActionBar.g6.x2;
            } else {
                textPaint = org.telegram.ui.ActionBar.g6.o2;
            }
            int[] iArr = allowsBigEmoji() ? new int[1] : null;
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.messageText, textPaint.getFontMetricsInt(), (boolean) r15, iArr);
            this.messageText = replaceEmoji;
            Spannable replaceAnimatedEmoji = replaceAnimatedEmoji(replaceEmoji, textPaint.getFontMetricsInt());
            this.messageText = replaceAnimatedEmoji;
            if (iArr != null && iArr[r15] > 1) {
                replaceEmojiToLottieFrame(replaceAnimatedEmoji, iArr);
            }
            checkEmojiOnly(iArr);
            checkBigAnimatedEmoji();
            setType();
            createPathThumb();
        }
        this.layoutCreated = z10;
        generateThumbs(r15);
        if (z11) {
            checkMediaExistance();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0275, code lost:
    
        if ((r11.new_participant instanceof org.telegram.tgnet.TLRPC.TL_channelParticipant) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x04b4, code lost:
    
        if (r4.until_date != r14.until_date) goto L196;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x1dda  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x1e2b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x1e2e  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0535 A[LOOP:0: B:252:0x04f0->B:267:0x0535, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0550 A[EDGE_INSN: B:268:0x0550->B:269:0x0550 BREAK  A[LOOP:0: B:252:0x04f0->B:267:0x0535], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x1ec5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x1ed4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x1ee8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x1ef6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x1f01  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0c7e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x1f39  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0cbf  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0d62  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x0c8b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x1f05  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x1ef9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x1ed9  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x1eba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MessageObject(int i10, TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent, ArrayList<MessageObject> arrayList, HashMap<String, ArrayList<MessageObject>> hashMap, TLRPC.Chat chat, int[] iArr, boolean z10) {
        String str;
        TLRPC.ChannelParticipant channelParticipant;
        TLRPC.ChannelParticipant channelParticipant2;
        TLRPC.User user;
        String string;
        TLRPC.Chat chat2;
        StringBuilder sb2;
        String str2;
        SpannableString spannableString;
        SpannableString spannableString2;
        SpannableString spannableString3;
        boolean z11;
        SpannableString spannableString4;
        int i11;
        String string2;
        TLRPC.Message message;
        char c10;
        String formatPluralString;
        TLObject chat3;
        TLObject chat4;
        TLObject chat5;
        char c11;
        String formatPluralString2;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        TLRPC.Message message2;
        ArrayList<TLRPC.MessageEntity> arrayList3;
        TLRPC.WebPage webPage;
        ArrayList<TLRPC.MessageEntity> arrayList4;
        TLRPC.Message message3;
        boolean z12;
        boolean z13;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        TLRPC.Peer peer;
        TLRPC.Message message4;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLObject chat6;
        TLRPC.User user2;
        String string3;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        StringBuilder sb3;
        boolean z14;
        int i12;
        String formatPluralString3;
        int i13;
        boolean z15;
        TLObject chat7;
        ArrayList<MessageObject> arrayList5;
        int[] iArr2;
        TextPaint textPaint;
        int[] iArr3;
        Spannable replaceAnimatedEmoji;
        int i14;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
        this.type = MediaDataController.MAX_STYLE_RUNS_COUNT;
        this.forceSeekTo = -1.0f;
        this.actionDeleteGroupEventId = -1L;
        this.overrideLinkColor = -1;
        this.overrideLinkEmoji = -1L;
        this.messageTrimmedToHighlightCut = true;
        this.topicIconDrawable = new Drawable[1];
        this.spoiledLoginCode = false;
        this.translated = false;
        this.summarized = false;
        this.currentEvent = tL_channelAdminLogEvent2;
        this.currentAccount = i10;
        TLRPC.User user3 = tL_channelAdminLogEvent2.user_id > 0 ? MessagesController.getInstance(i10).getUser(Long.valueOf(tL_channelAdminLogEvent2.user_id)) : null;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(tL_channelAdminLogEvent2.date * 1000);
        int i15 = gregorianCalendar.get(6);
        int i16 = gregorianCalendar.get(1);
        int i17 = gregorianCalendar.get(2);
        this.dateKey = String.format("%d_%02d_%02d", Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i15));
        this.dateKeyInt = (i15 * 100000) + (i17 * MediaDataController.MAX_STYLE_RUNS_COUNT) + i16;
        this.monthKey = String.format("%d_%02d", Integer.valueOf(i16), Integer.valueOf(i17));
        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
        tL_peerChannel.channel_id = chat.id;
        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeTitle) {
            String str3 = ((TLRPC.TL_channelAdminLogEventActionChangeTitle) channelAdminLogEventAction).new_value;
            if (chat.megagroup) {
                this.messageText = replaceWithLink(LocaleController.formatString("EventLogEditedGroupTitle", R.string.EventLogEditedGroupTitle, str3), "un1", user3);
            } else {
                this.messageText = replaceWithLink(LocaleController.formatString("EventLogEditedChannelTitle", R.string.EventLogEditedChannelTitle, str3), "un1", user3);
            }
        } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangePhoto) {
            TLRPC.TL_channelAdminLogEventActionChangePhoto tL_channelAdminLogEventActionChangePhoto = (TLRPC.TL_channelAdminLogEventActionChangePhoto) channelAdminLogEventAction;
            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
            this.messageOwner = tL_messageService;
            if (tL_channelAdminLogEventActionChangePhoto.new_photo instanceof TLRPC.TL_photoEmpty) {
                tL_messageService.action = new TLRPC.TL_messageActionChatDeletePhoto();
                if (chat.megagroup) {
                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogRemovedWGroupPhoto), "un1", user3);
                } else {
                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogRemovedChannelPhoto), "un1", user3);
                }
            } else {
                tL_messageService.action = new TLRPC.TL_messageActionChatEditPhoto();
                this.messageOwner.action.photo = tL_channelAdminLogEventActionChangePhoto.new_photo;
                if (chat.megagroup) {
                    if (isVideoAvatar()) {
                        this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogEditedGroupVideo), "un1", user3);
                    } else {
                        this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogEditedGroupPhoto), "un1", user3);
                    }
                } else if (isVideoAvatar()) {
                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogEditedChannelVideo), "un1", user3);
                } else {
                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogEditedChannelPhoto), "un1", user3);
                }
            }
        } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoin) {
            if (chat.megagroup) {
                this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogGroupJoined), "un1", user3);
            } else {
                this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogChannelJoined), "un1", user3);
            }
        } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantLeave) {
            TLRPC.TL_messageService tL_messageService2 = new TLRPC.TL_messageService();
            this.messageOwner = tL_messageService2;
            tL_messageService2.action = new TLRPC.TL_messageActionChatDeleteUser();
            this.messageOwner.action.user_id = tL_channelAdminLogEvent2.user_id;
            if (chat.megagroup) {
                this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogLeftGroup), "un1", user3);
            } else {
                this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogLeftChannel), "un1", user3);
            }
        } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantInvite) {
            TLRPC.TL_messageService tL_messageService3 = new TLRPC.TL_messageService();
            this.messageOwner = tL_messageService3;
            tL_messageService3.action = new TLRPC.TL_messageActionChatAddUser();
            long peerId = getPeerId(((TLRPC.TL_channelAdminLogEventActionParticipantInvite) channelAdminLogEventAction).participant.peer);
            if (peerId > 0) {
                chat7 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId));
            } else {
                chat7 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
            }
            TLRPC.Peer peer2 = this.messageOwner.from_id;
            if ((peer2 instanceof TLRPC.TL_peerUser) && peerId == peer2.user_id) {
                if (chat.megagroup) {
                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogGroupJoined), "un1", user3);
                } else {
                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogChannelJoined), "un1", user3);
                }
            } else {
                CharSequence replaceWithLink = replaceWithLink(LocaleController.getString(R.string.EventLogAdded), "un2", chat7);
                this.messageText = replaceWithLink;
                this.messageText = replaceWithLink(replaceWithLink, "un1", user3);
            }
        } else {
            boolean z16 = channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin;
            if (!z16) {
                boolean z17 = channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleBan;
                if (z17) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleBan tL_channelAdminLogEventActionParticipantToggleBan = (TLRPC.TL_channelAdminLogEventActionParticipantToggleBan) channelAdminLogEventAction;
                    if (tL_channelAdminLogEventActionParticipantToggleBan.prev_participant instanceof TLRPC.TL_channelParticipantAdmin) {
                    }
                }
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDefaultBannedRights) {
                    TLRPC.TL_channelAdminLogEventActionDefaultBannedRights tL_channelAdminLogEventActionDefaultBannedRights = (TLRPC.TL_channelAdminLogEventActionDefaultBannedRights) channelAdminLogEventAction;
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    this.messageOwner = tL_message;
                    tL_message.realId = -1;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = tL_channelAdminLogEventActionDefaultBannedRights.prev_banned_rights;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = tL_channelAdminLogEventActionDefaultBannedRights.new_banned_rights;
                    StringBuilder sb4 = new StringBuilder(LocaleController.getString(R.string.EventLogDefaultPermissions));
                    tL_chatBannedRights2 = tL_chatBannedRights2 == null ? new TLRPC.TL_chatBannedRights() : tL_chatBannedRights2;
                    tL_chatBannedRights3 = tL_chatBannedRights3 == null ? new TLRPC.TL_chatBannedRights() : tL_chatBannedRights3;
                    if (tL_chatBannedRights2.send_messages != tL_chatBannedRights3.send_messages) {
                        sb4.append("\n\n");
                        sb4.append(!tL_chatBannedRights3.send_messages ? '+' : '-');
                        sb4.append(' ');
                        sb4.append(LocaleController.getString(R.string.EventLogRestrictedSendMessages));
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (tL_chatBannedRights2.send_stickers != tL_chatBannedRights3.send_stickers || tL_chatBannedRights2.send_inline != tL_chatBannedRights3.send_inline || tL_chatBannedRights2.send_gifs != tL_chatBannedRights3.send_gifs || tL_chatBannedRights2.send_games != tL_chatBannedRights3.send_games) {
                        if (!z15) {
                            sb4.append('\n');
                            z15 = true;
                        }
                        sb4.append('\n');
                        sb4.append(!tL_chatBannedRights3.send_stickers ? '+' : '-');
                        sb4.append(' ');
                        sb4.append(LocaleController.getString(R.string.EventLogRestrictedSendStickers));
                    }
                    if (tL_chatBannedRights2.send_media != tL_chatBannedRights3.send_media) {
                        if (!z15) {
                            sb4.append('\n');
                            z15 = true;
                        }
                        sb4.append('\n');
                        sb4.append(!tL_chatBannedRights3.send_media ? '+' : '-');
                        sb4.append(' ');
                        sb4.append(LocaleController.getString(R.string.EventLogRestrictedSendMedia));
                    }
                    if (tL_chatBannedRights2.send_polls != tL_chatBannedRights3.send_polls) {
                        if (!z15) {
                            sb4.append('\n');
                            z15 = true;
                        }
                        sb4.append('\n');
                        sb4.append(!tL_chatBannedRights3.send_polls ? '+' : '-');
                        sb4.append(' ');
                        sb4.append(LocaleController.getString(R.string.EventLogRestrictedSendPolls));
                    }
                    if (tL_chatBannedRights2.embed_links != tL_chatBannedRights3.embed_links) {
                        if (!z15) {
                            sb4.append('\n');
                            z15 = true;
                        }
                        sb4.append('\n');
                        sb4.append(!tL_chatBannedRights3.embed_links ? '+' : '-');
                        sb4.append(' ');
                        sb4.append(LocaleController.getString(R.string.EventLogRestrictedSendEmbed));
                    }
                    if (tL_chatBannedRights2.change_info != tL_chatBannedRights3.change_info) {
                        if (!z15) {
                            sb4.append('\n');
                            z15 = true;
                        }
                        sb4.append('\n');
                        sb4.append(!tL_chatBannedRights3.change_info ? '+' : '-');
                        sb4.append(' ');
                        sb4.append(LocaleController.getString(R.string.EventLogRestrictedChangeInfo));
                    }
                    if (tL_chatBannedRights2.invite_users != tL_chatBannedRights3.invite_users) {
                        if (!z15) {
                            sb4.append('\n');
                            z15 = true;
                        }
                        sb4.append('\n');
                        sb4.append(!tL_chatBannedRights3.invite_users ? '+' : '-');
                        sb4.append(' ');
                        sb4.append(LocaleController.getString(R.string.EventLogRestrictedInviteUsers));
                    }
                    if (tL_chatBannedRights2.pin_messages != tL_chatBannedRights3.pin_messages) {
                        if (!z15) {
                            sb4.append('\n');
                        }
                        sb4.append('\n');
                        sb4.append(!tL_chatBannedRights3.pin_messages ? '+' : '-');
                        sb4.append(' ');
                        sb4.append(LocaleController.getString(R.string.EventLogRestrictedPinMessages));
                    }
                    if (tL_chatBannedRights2.edit_rank != tL_chatBannedRights3.edit_rank) {
                        if (!z15) {
                            sb4.append('\n');
                        }
                        sb4.append('\n');
                        sb4.append(!tL_chatBannedRights3.edit_rank ? '+' : '-');
                        sb4.append(' ');
                        sb4.append(LocaleController.getString(R.string.EventLogRestrictedEditRank));
                    }
                    if (tL_chatBannedRights2.send_reactions != tL_chatBannedRights3.send_reactions) {
                        if (!z15) {
                            sb4.append('\n');
                        }
                        sb4.append('\n');
                        sb4.append(!tL_chatBannedRights3.send_reactions ? '+' : '-');
                        sb4.append(' ');
                        sb4.append(LocaleController.getString(R.string.EventLogRestrictedSendReactions));
                    }
                    this.messageText = sb4.toString();
                } else {
                    if (z17) {
                        TLRPC.TL_channelAdminLogEventActionParticipantToggleBan tL_channelAdminLogEventActionParticipantToggleBan2 = (TLRPC.TL_channelAdminLogEventActionParticipantToggleBan) channelAdminLogEventAction;
                        TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                        this.messageOwner = tL_message2;
                        tL_message2.realId = -1;
                        long peerId2 = getPeerId(tL_channelAdminLogEventActionParticipantToggleBan2.prev_participant.peer);
                        if (peerId2 > 0) {
                            chat6 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId2));
                        } else {
                            chat6 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId2));
                        }
                        TLRPC.TL_chatBannedRights tL_chatBannedRights4 = tL_channelAdminLogEventActionParticipantToggleBan2.prev_participant.banned_rights;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights5 = tL_channelAdminLogEventActionParticipantToggleBan2.new_participant.banned_rights;
                        if (chat.megagroup) {
                            if (tL_chatBannedRights5 != null && tL_chatBannedRights5.view_messages) {
                                if (tL_chatBannedRights4 != null) {
                                }
                            }
                            if (tL_chatBannedRights5 != null && !AndroidUtilities.isBannedForever(tL_chatBannedRights5)) {
                                sb3 = new StringBuilder();
                                tL_chatBannedRights = tL_chatBannedRights4;
                                int i18 = tL_chatBannedRights5.until_date - tL_channelAdminLogEvent2.date;
                                int i19 = ((i18 / 60) / 60) / 24;
                                int i20 = i18 - (i19 * 86400);
                                int i21 = (i20 / 60) / 60;
                                str = "";
                                int i22 = (i20 - (i21 * 3600)) / 60;
                                int i23 = 0;
                                int i24 = 0;
                                while (true) {
                                    if (i23 >= 3) {
                                        user2 = user3;
                                        break;
                                    }
                                    if (i23 == 0) {
                                        user2 = user3;
                                        if (i19 != 0) {
                                            formatPluralString3 = LocaleController.formatPluralString("Days", i19, new Object[0]);
                                            i12 = i24 + 1;
                                            i13 = i12;
                                            if (formatPluralString3 != null) {
                                                if (sb3.length() > 0) {
                                                    sb3.append(", ");
                                                }
                                                sb3.append(formatPluralString3);
                                            }
                                            if (i13 == 2) {
                                                break;
                                            }
                                            i23++;
                                            i24 = i13;
                                            user3 = user2;
                                        }
                                        i13 = i24;
                                        formatPluralString3 = null;
                                        if (formatPluralString3 != null) {
                                        }
                                        if (i13 == 2) {
                                        }
                                    } else {
                                        user2 = user3;
                                        if (i23 == 1) {
                                            if (i21 != 0) {
                                                formatPluralString3 = LocaleController.formatPluralString("Hours", i21, new Object[0]);
                                                i12 = i24 + 1;
                                                i13 = i12;
                                                if (formatPluralString3 != null) {
                                                }
                                                if (i13 == 2) {
                                                }
                                            }
                                        } else if (i22 != 0) {
                                            i12 = i24 + 1;
                                            formatPluralString3 = LocaleController.formatPluralString("Minutes", i22, new Object[0]);
                                            i13 = i12;
                                            if (formatPluralString3 != null) {
                                            }
                                            if (i13 == 2) {
                                            }
                                        }
                                        i13 = i24;
                                        formatPluralString3 = null;
                                        if (formatPluralString3 != null) {
                                        }
                                        if (i13 == 2) {
                                        }
                                    }
                                }
                            } else {
                                user2 = user3;
                                str = "";
                                tL_chatBannedRights = tL_chatBannedRights4;
                                sb3 = new StringBuilder(LocaleController.getString(R.string.UserRestrictionsUntilForever));
                            }
                            String string4 = LocaleController.getString(R.string.EventLogRestrictedUntil);
                            StringBuilder sb5 = new StringBuilder(String.format(string4, getUserName(chat6, this.messageOwner.entities, string4.indexOf("%1$s")), sb3.toString()));
                            TLRPC.TL_chatBannedRights tL_chatBannedRights6 = tL_chatBannedRights == null ? new TLRPC.TL_chatBannedRights() : tL_chatBannedRights;
                            tL_chatBannedRights5 = tL_chatBannedRights5 == null ? new TLRPC.TL_chatBannedRights() : tL_chatBannedRights5;
                            if (tL_chatBannedRights6.view_messages != tL_chatBannedRights5.view_messages) {
                                sb5.append("\n\n");
                                sb5.append(!tL_chatBannedRights5.view_messages ? '+' : '-');
                                sb5.append(' ');
                                sb5.append(LocaleController.getString(R.string.EventLogRestrictedReadMessages));
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (tL_chatBannedRights6.send_messages != tL_chatBannedRights5.send_messages) {
                                if (!z14) {
                                    sb5.append('\n');
                                    z14 = true;
                                }
                                sb5.append('\n');
                                sb5.append(!tL_chatBannedRights5.send_messages ? '+' : '-');
                                sb5.append(' ');
                                sb5.append(LocaleController.getString(R.string.EventLogRestrictedSendMessages));
                            }
                            if (tL_chatBannedRights6.send_stickers != tL_chatBannedRights5.send_stickers || tL_chatBannedRights6.send_inline != tL_chatBannedRights5.send_inline || tL_chatBannedRights6.send_gifs != tL_chatBannedRights5.send_gifs || tL_chatBannedRights6.send_games != tL_chatBannedRights5.send_games) {
                                if (!z14) {
                                    sb5.append('\n');
                                    z14 = true;
                                }
                                sb5.append('\n');
                                sb5.append(!tL_chatBannedRights5.send_stickers ? '+' : '-');
                                sb5.append(' ');
                                sb5.append(LocaleController.getString(R.string.EventLogRestrictedSendStickers));
                            }
                            if (tL_chatBannedRights6.send_media != tL_chatBannedRights5.send_media) {
                                if (!z14) {
                                    sb5.append('\n');
                                    z14 = true;
                                }
                                sb5.append('\n');
                                sb5.append(!tL_chatBannedRights5.send_media ? '+' : '-');
                                sb5.append(' ');
                                sb5.append(LocaleController.getString(R.string.EventLogRestrictedSendMedia));
                            }
                            if (tL_chatBannedRights6.send_polls != tL_chatBannedRights5.send_polls) {
                                if (!z14) {
                                    sb5.append('\n');
                                    z14 = true;
                                }
                                sb5.append('\n');
                                sb5.append(!tL_chatBannedRights5.send_polls ? '+' : '-');
                                sb5.append(' ');
                                sb5.append(LocaleController.getString(R.string.EventLogRestrictedSendPolls));
                            }
                            if (tL_chatBannedRights6.embed_links != tL_chatBannedRights5.embed_links) {
                                if (!z14) {
                                    sb5.append('\n');
                                    z14 = true;
                                }
                                sb5.append('\n');
                                sb5.append(!tL_chatBannedRights5.embed_links ? '+' : '-');
                                sb5.append(' ');
                                sb5.append(LocaleController.getString(R.string.EventLogRestrictedSendEmbed));
                            }
                            if (tL_chatBannedRights6.change_info != tL_chatBannedRights5.change_info) {
                                if (!z14) {
                                    sb5.append('\n');
                                    z14 = true;
                                }
                                sb5.append('\n');
                                sb5.append(!tL_chatBannedRights5.change_info ? '+' : '-');
                                sb5.append(' ');
                                sb5.append(LocaleController.getString(R.string.EventLogRestrictedChangeInfo));
                            }
                            if (tL_chatBannedRights6.invite_users != tL_chatBannedRights5.invite_users) {
                                if (!z14) {
                                    sb5.append('\n');
                                    z14 = true;
                                }
                                sb5.append('\n');
                                sb5.append(!tL_chatBannedRights5.invite_users ? '+' : '-');
                                sb5.append(' ');
                                sb5.append(LocaleController.getString(R.string.EventLogRestrictedInviteUsers));
                            }
                            if (tL_chatBannedRights6.pin_messages != tL_chatBannedRights5.pin_messages) {
                                if (!z14) {
                                    sb5.append('\n');
                                }
                                sb5.append('\n');
                                sb5.append(!tL_chatBannedRights5.pin_messages ? '+' : '-');
                                sb5.append(' ');
                                sb5.append(LocaleController.getString(R.string.EventLogRestrictedPinMessages));
                            }
                            if (tL_chatBannedRights6.edit_rank != tL_chatBannedRights5.edit_rank) {
                                if (!z14) {
                                    sb5.append('\n');
                                }
                                sb5.append('\n');
                                sb5.append(!tL_chatBannedRights5.edit_rank ? '+' : '-');
                                sb5.append(' ');
                                sb5.append(LocaleController.getString(R.string.EventLogRestrictedEditRank));
                            }
                            if (tL_chatBannedRights6.send_reactions != tL_chatBannedRights5.send_reactions) {
                                if (!z14) {
                                    sb5.append('\n');
                                }
                                sb5.append('\n');
                                sb5.append(!tL_chatBannedRights5.send_reactions ? '+' : '-');
                                sb5.append(' ');
                                sb5.append(LocaleController.getString(R.string.EventLogRestrictedSendReactions));
                            }
                            this.messageText = sb5.toString();
                            tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                            chat2 = chat;
                            user3 = user2;
                        }
                        user2 = user3;
                        str = "";
                        if (tL_chatBannedRights5 != null && (tL_chatBannedRights4 == null || tL_chatBannedRights5.view_messages)) {
                            string3 = LocaleController.getString(R.string.EventLogChannelRestricted);
                        } else {
                            string3 = LocaleController.getString(R.string.EventLogChannelUnrestricted);
                        }
                        this.messageText = String.format(string3, getUserName(chat6, this.messageOwner.entities, string3.indexOf("%1$s")));
                        tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                        chat2 = chat;
                        user3 = user2;
                    } else {
                        TLRPC.User user4 = user3;
                        str = "";
                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionUpdatePinned) {
                            TLRPC.TL_channelAdminLogEventActionUpdatePinned tL_channelAdminLogEventActionUpdatePinned = (TLRPC.TL_channelAdminLogEventActionUpdatePinned) channelAdminLogEventAction;
                            message4 = tL_channelAdminLogEventActionUpdatePinned.message;
                            user3 = user4;
                            if (user4 != null && user3.id == 136817688 && (messageFwdHeader = message4.fwd_from) != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerChannel)) {
                                TLRPC.Chat chat8 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(tL_channelAdminLogEventActionUpdatePinned.message.fwd_from.from_id.channel_id));
                                TLRPC.Message message5 = tL_channelAdminLogEventActionUpdatePinned.message;
                                if (!(message5 instanceof TLRPC.TL_messageEmpty) && message5.pinned) {
                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogPinnedMessages), "un1", chat8);
                                } else {
                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogUnpinnedMessages), "un1", chat8);
                                }
                            } else if (!(message4 instanceof TLRPC.TL_messageEmpty) && message4.pinned) {
                                this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogPinnedMessages), "un1", user3);
                            } else {
                                this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogUnpinnedMessages), "un1", user3);
                            }
                        } else {
                            user3 = user4;
                            if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionStopPoll) {
                                message4 = ((TLRPC.TL_channelAdminLogEventActionStopPoll) channelAdminLogEventAction).message;
                                if ((getMedia(message4) instanceof TLRPC.TL_messageMediaPoll) && ((TLRPC.TL_messageMediaPoll) getMedia(message4)).poll.quiz) {
                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogStopQuiz), "un1", user3);
                                } else {
                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogStopPoll), "un1", user3);
                                }
                            } else {
                                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleSignatures) {
                                    if (((TLRPC.TL_channelAdminLogEventActionToggleSignatures) channelAdminLogEventAction).new_value) {
                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogToggledSignaturesOn), "un1", user3);
                                    } else {
                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogToggledSignaturesOff), "un1", user3);
                                    }
                                } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantSubExtend) {
                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogSubExtend), "un1", user3);
                                } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleSignatureProfiles) {
                                    if (((TLRPC.TL_channelAdminLogEventActionToggleSignatureProfiles) channelAdminLogEventAction).value) {
                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogToggledSignaturesProfilesOn), "un1", user3);
                                    } else {
                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogToggledSignaturesProfilesOff), "un1", user3);
                                    }
                                } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleInvites) {
                                    if (((TLRPC.TL_channelAdminLogEventActionToggleInvites) channelAdminLogEventAction).new_value) {
                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogToggledInvitesOn), "un1", user3);
                                    } else {
                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogToggledInvitesOff), "un1", user3);
                                    }
                                } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                                    message4 = ((TLRPC.TL_channelAdminLogEventActionDeleteMessage) channelAdminLogEventAction).message;
                                    if (user3 != null && user3.id == MessagesController.getInstance(this.currentAccount).telegramAntispamUserId) {
                                        this.messageText = LocaleController.getString(R.string.EventLogDeletedMessages).replace("un1", UserObject.getUserName(user3));
                                    } else {
                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogDeletedMessages), "un1", user3);
                                    }
                                } else {
                                    if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeLinkedChat) {
                                        TLRPC.TL_channelAdminLogEventActionChangeLinkedChat tL_channelAdminLogEventActionChangeLinkedChat = (TLRPC.TL_channelAdminLogEventActionChangeLinkedChat) channelAdminLogEventAction;
                                        long j10 = tL_channelAdminLogEventActionChangeLinkedChat.new_value;
                                        long j11 = tL_channelAdminLogEventActionChangeLinkedChat.prev_value;
                                        chat2 = chat;
                                        if (chat2.megagroup) {
                                            if (j10 == 0) {
                                                TLRPC.Chat chat9 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j11));
                                                CharSequence replaceWithLink2 = replaceWithLink(LocaleController.getString(R.string.EventLogRemovedLinkedChannel), "un1", user3);
                                                this.messageText = replaceWithLink2;
                                                this.messageText = replaceWithLink(replaceWithLink2, "un2", chat9);
                                            } else {
                                                TLRPC.Chat chat10 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
                                                CharSequence replaceWithLink3 = replaceWithLink(LocaleController.getString(R.string.EventLogChangedLinkedChannel), "un1", user3);
                                                this.messageText = replaceWithLink3;
                                                this.messageText = replaceWithLink(replaceWithLink3, "un2", chat10);
                                            }
                                        } else if (j10 == 0) {
                                            TLRPC.Chat chat11 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j11));
                                            CharSequence replaceWithLink4 = replaceWithLink(LocaleController.getString(R.string.EventLogRemovedLinkedGroup), "un1", user3);
                                            this.messageText = replaceWithLink4;
                                            this.messageText = replaceWithLink(replaceWithLink4, "un2", chat11);
                                        } else {
                                            TLRPC.Chat chat12 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
                                            CharSequence replaceWithLink5 = replaceWithLink(LocaleController.getString(R.string.EventLogChangedLinkedGroup), "un1", user3);
                                            this.messageText = replaceWithLink5;
                                            this.messageText = replaceWithLink(replaceWithLink5, "un2", chat12);
                                        }
                                    } else {
                                        chat2 = chat;
                                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionTogglePreHistoryHidden) {
                                            if (((TLRPC.TL_channelAdminLogEventActionTogglePreHistoryHidden) channelAdminLogEventAction).new_value) {
                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogToggledInvitesHistoryOff), "un1", user3);
                                            } else {
                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogToggledInvitesHistoryOn), "un1", user3);
                                            }
                                        } else {
                                            if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeAbout) {
                                                this.messageText = replaceWithLink(LocaleController.getString(chat2.megagroup ? R.string.EventLogEditedGroupDescription : R.string.EventLogEditedChannelDescription), "un1", user3);
                                                message = new TLRPC.TL_message();
                                                message.out = false;
                                                message.unread = false;
                                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                                message.from_id = tL_peerUser;
                                                tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                                tL_peerUser.user_id = tL_channelAdminLogEvent2.user_id;
                                                message.peer_id = tL_peerChannel;
                                                message.date = tL_channelAdminLogEvent2.date;
                                                TLRPC.TL_channelAdminLogEventActionChangeAbout tL_channelAdminLogEventActionChangeAbout = (TLRPC.TL_channelAdminLogEventActionChangeAbout) tL_channelAdminLogEvent2.action;
                                                message.message = tL_channelAdminLogEventActionChangeAbout.new_value;
                                                if (!TextUtils.isEmpty(tL_channelAdminLogEventActionChangeAbout.prev_value)) {
                                                    TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                                                    message.media = tL_messageMediaWebPage;
                                                    tL_messageMediaWebPage.webpage = new TLRPC.TL_webPage();
                                                    TLRPC.WebPage webPage2 = message.media.webpage;
                                                    webPage2.flags = 10;
                                                    str2 = str;
                                                    webPage2.display_url = str2;
                                                    webPage2.url = str2;
                                                    webPage2.site_name = LocaleController.getString(R.string.EventLogPreviousGroupDescription);
                                                    message.media.webpage.description = ((TLRPC.TL_channelAdminLogEventActionChangeAbout) tL_channelAdminLogEvent2.action).prev_value;
                                                } else {
                                                    str2 = str;
                                                    message.media = new TLRPC.TL_messageMediaEmpty();
                                                }
                                            } else {
                                                tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                                str2 = str;
                                                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeTheme) {
                                                    this.messageText = replaceWithLink(LocaleController.getString(chat2.megagroup ? R.string.EventLogEditedGroupTheme : R.string.EventLogEditedChannelTheme), "un1", user3);
                                                    message = new TLRPC.TL_message();
                                                    message.out = false;
                                                    message.unread = false;
                                                    TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                                                    message.from_id = tL_peerUser2;
                                                    tL_peerUser2.user_id = tL_channelAdminLogEvent2.user_id;
                                                    message.peer_id = tL_peerChannel;
                                                    message.date = tL_channelAdminLogEvent2.date;
                                                    TLRPC.TL_channelAdminLogEventActionChangeTheme tL_channelAdminLogEventActionChangeTheme = (TLRPC.TL_channelAdminLogEventActionChangeTheme) tL_channelAdminLogEvent2.action;
                                                    message.message = tL_channelAdminLogEventActionChangeTheme.new_value;
                                                    if (!TextUtils.isEmpty(tL_channelAdminLogEventActionChangeTheme.prev_value)) {
                                                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage2 = new TLRPC.TL_messageMediaWebPage();
                                                        message.media = tL_messageMediaWebPage2;
                                                        tL_messageMediaWebPage2.webpage = new TLRPC.TL_webPage();
                                                        TLRPC.WebPage webPage3 = message.media.webpage;
                                                        webPage3.flags = 10;
                                                        webPage3.display_url = str2;
                                                        webPage3.url = str2;
                                                        webPage3.site_name = LocaleController.getString(R.string.EventLogPreviousGroupTheme);
                                                        message.media.webpage.description = ((TLRPC.TL_channelAdminLogEventActionChangeTheme) tL_channelAdminLogEvent2.action).prev_value;
                                                    } else {
                                                        message.media = new TLRPC.TL_messageMediaEmpty();
                                                    }
                                                } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeUsername) {
                                                    String str4 = ((TLRPC.TL_channelAdminLogEventActionChangeUsername) channelAdminLogEventAction).new_value;
                                                    if (TextUtils.isEmpty(str4)) {
                                                        this.messageText = replaceWithLink(LocaleController.getString(chat2.megagroup ? R.string.EventLogRemovedGroupLink : R.string.EventLogRemovedChannelLink), "un1", user3);
                                                    } else {
                                                        this.messageText = replaceWithLink(LocaleController.getString(chat2.megagroup ? R.string.EventLogChangedGroupLink : R.string.EventLogChangedChannelLink), "un1", user3);
                                                    }
                                                    message = new TLRPC.TL_message();
                                                    message.out = false;
                                                    message.unread = false;
                                                    TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                                                    message.from_id = tL_peerUser3;
                                                    tL_peerUser3.user_id = tL_channelAdminLogEvent2.user_id;
                                                    message.peer_id = tL_peerChannel;
                                                    message.date = tL_channelAdminLogEvent2.date;
                                                    if (!TextUtils.isEmpty(str4)) {
                                                        message.message = a9.p.n(MessagesController.getInstance(this.currentAccount).linkPrefix, "/", str4, new StringBuilder("https://"));
                                                    } else {
                                                        message.message = str2;
                                                    }
                                                    TLRPC.TL_messageEntityUrl tL_messageEntityUrl = new TLRPC.TL_messageEntityUrl();
                                                    tL_messageEntityUrl.offset = 0;
                                                    tL_messageEntityUrl.length = message.message.length();
                                                    message.entities.add(tL_messageEntityUrl);
                                                    if (!TextUtils.isEmpty(((TLRPC.TL_channelAdminLogEventActionChangeUsername) tL_channelAdminLogEvent2.action).prev_value)) {
                                                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage3 = new TLRPC.TL_messageMediaWebPage();
                                                        message.media = tL_messageMediaWebPage3;
                                                        tL_messageMediaWebPage3.webpage = new TLRPC.TL_webPage();
                                                        TLRPC.WebPage webPage4 = message.media.webpage;
                                                        webPage4.flags = 10;
                                                        webPage4.display_url = str2;
                                                        webPage4.url = str2;
                                                        webPage4.site_name = LocaleController.getString(R.string.EventLogPreviousLink);
                                                        message.media.webpage.description = "https://" + MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ((TLRPC.TL_channelAdminLogEventActionChangeUsername) tL_channelAdminLogEvent2.action).prev_value;
                                                    } else {
                                                        message.media = new TLRPC.TL_messageMediaEmpty();
                                                    }
                                                } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionEditMessage) {
                                                    TLRPC.Message tL_message3 = new TLRPC.TL_message();
                                                    tL_message3.out = false;
                                                    tL_message3.unread = false;
                                                    tL_message3.peer_id = tL_peerChannel;
                                                    tL_message3.date = tL_channelAdminLogEvent2.date;
                                                    TLRPC.TL_channelAdminLogEventActionEditMessage tL_channelAdminLogEventActionEditMessage = (TLRPC.TL_channelAdminLogEventActionEditMessage) tL_channelAdminLogEvent2.action;
                                                    TLRPC.Message message6 = tL_channelAdminLogEventActionEditMessage.new_message;
                                                    TLRPC.Message message7 = tL_channelAdminLogEventActionEditMessage.prev_message;
                                                    if (message7 != null) {
                                                        tL_message3.reply_to = message7.reply_to;
                                                        tL_message3.id = message7.id;
                                                    } else if (message6 != null) {
                                                        tL_message3.reply_to = message6.reply_to;
                                                        tL_message3.id = message6.id;
                                                    }
                                                    if (message6 != null && (peer = message6.from_id) != null) {
                                                        tL_message3.from_id = peer;
                                                    } else {
                                                        TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
                                                        tL_message3.from_id = tL_peerUser4;
                                                        tL_peerUser4.user_id = tL_channelAdminLogEvent2.user_id;
                                                    }
                                                    if (getMedia(message6) != null && !(getMedia(message6) instanceof TLRPC.TL_messageMediaEmpty) && !(getMedia(message6) instanceof TLRPC.TL_messageMediaWebPage)) {
                                                        boolean equals = TextUtils.equals(message6.message, message7.message);
                                                        TLRPC.MessageMedia media = getMedia(message6);
                                                        TLRPC.MessageMedia media2 = getMedia(message7);
                                                        if (media2 == null) {
                                                            z12 = true;
                                                        } else if (media.getClass() == media2.getClass() && (((photo = media.photo) == null || (photo2 = media2.photo) == null || photo.id == photo2.id) && (media.document == null || media2.document == null || getMedia(message6).document.id == media2.document.id))) {
                                                            z12 = false;
                                                        } else {
                                                            z12 = false;
                                                            z13 = true;
                                                            if (!z12) {
                                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogAddedMedia), "un1", user3);
                                                            } else if (z13 && !equals) {
                                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogEditedMediaCaption), "un1", user3);
                                                            } else if (!equals) {
                                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogEditedCaption), "un1", user3);
                                                            } else {
                                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogEditedMedia), "un1", user3);
                                                            }
                                                            TLRPC.MessageMedia media3 = getMedia(message6);
                                                            tL_message3.media = media3;
                                                            if (!equals) {
                                                                media3.webpage = new TLRPC.TL_webPage();
                                                                tL_message3.media.webpage.site_name = LocaleController.getString(R.string.EventLogOriginalCaption);
                                                                if (TextUtils.isEmpty(message7.message)) {
                                                                    tL_message3.media.webpage.description = LocaleController.getString(R.string.EventLogOriginalCaptionEmpty);
                                                                } else {
                                                                    tL_message3.media.webpage.description = message7.message;
                                                                    arrayList2 = message7.entities;
                                                                }
                                                            }
                                                            arrayList2 = null;
                                                        }
                                                        z13 = false;
                                                        if (!z12) {
                                                        }
                                                        TLRPC.MessageMedia media32 = getMedia(message6);
                                                        tL_message3.media = media32;
                                                        if (!equals) {
                                                        }
                                                        arrayList2 = null;
                                                    } else {
                                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogEditedMessages), "un1", user3);
                                                        if (message6.action instanceof TLRPC.TL_messageActionGroupCall) {
                                                            message6.media = new TLRPC.TL_messageMediaEmpty();
                                                            message2 = message6;
                                                        } else {
                                                            tL_message3.message = message6.message;
                                                            tL_message3.entities = message6.entities;
                                                            TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage4 = new TLRPC.TL_messageMediaWebPage();
                                                            tL_message3.media = tL_messageMediaWebPage4;
                                                            tL_messageMediaWebPage4.webpage = new TLRPC.TL_webPage();
                                                            tL_message3.media.webpage.site_name = LocaleController.getString(R.string.EventLogOriginalMessages);
                                                            if (TextUtils.isEmpty(message7.message)) {
                                                                tL_message3.media.webpage.description = LocaleController.getString(R.string.EventLogOriginalCaptionEmpty);
                                                                message2 = tL_message3;
                                                            } else {
                                                                tL_message3.media.webpage.description = message7.message;
                                                                arrayList2 = message7.entities;
                                                            }
                                                        }
                                                        arrayList3 = null;
                                                        message2.reply_markup = message6.reply_markup;
                                                        webPage = message2.media.webpage;
                                                        if (webPage != null) {
                                                            webPage.flags = 10;
                                                            webPage.display_url = str2;
                                                            webPage.url = str2;
                                                        }
                                                        chat2 = chat;
                                                        arrayList4 = arrayList3;
                                                        message3 = message2;
                                                        str = str2;
                                                        if (this.messageOwner == null) {
                                                            this.messageOwner = new TLRPC.TL_messageService();
                                                        }
                                                        this.messageOwner.message = this.messageText.toString();
                                                        this.messageOwner.from_id = new TLRPC.TL_peerUser();
                                                        TLRPC.Message message8 = this.messageOwner;
                                                        message8.from_id.user_id = tL_channelAdminLogEvent2.user_id;
                                                        message8.date = tL_channelAdminLogEvent2.date;
                                                        int i25 = iArr[0];
                                                        iArr[0] = i25 + 1;
                                                        message8.id = i25;
                                                        this.eventId = tL_channelAdminLogEvent2.id;
                                                        message8.out = false;
                                                        message8.peer_id = new TLRPC.TL_peerChannel();
                                                        TLRPC.Message message9 = this.messageOwner;
                                                        message9.peer_id.channel_id = chat2.id;
                                                        message9.unread = false;
                                                        MediaController mediaController = MediaController.getInstance();
                                                        this.isOutOwnerCached = null;
                                                        message3 = message3 instanceof TLRPC.TL_messageEmpty ? null : message3;
                                                        if (message3 != null) {
                                                            message3.out = false;
                                                            message3.realId = message3.id;
                                                            int i26 = iArr[0];
                                                            iArr[0] = i26 + 1;
                                                            message3.id = i26;
                                                            message3.flags &= -32769;
                                                            message3.dialog_id = -chat2.id;
                                                            if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                                                                i14 = message3.date;
                                                                message3.date = tL_channelAdminLogEvent2.date;
                                                            } else {
                                                                i14 = 0;
                                                            }
                                                            MessageObject messageObject = new MessageObject(this.currentAccount, message3, (AbstractMap<Long, TLRPC.User>) null, (AbstractMap<Long, TLRPC.Chat>) null, true, true, this.eventId);
                                                            messageObject.realDate = i14;
                                                            messageObject.currentEvent = tL_channelAdminLogEvent2;
                                                            if (messageObject.contentType >= 0) {
                                                                if (mediaController.isPlayingMessage(messageObject)) {
                                                                    MessageObject playingMessageObject = mediaController.getPlayingMessageObject();
                                                                    messageObject.audioProgress = playingMessageObject.audioProgress;
                                                                    messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
                                                                }
                                                                arrayList5 = arrayList;
                                                                createDateArray(this.currentAccount, tL_channelAdminLogEvent2, arrayList5, hashMap, z10);
                                                                if (z10) {
                                                                    arrayList5.add(0, messageObject);
                                                                } else {
                                                                    arrayList5.add(arrayList5.size() - 1, messageObject);
                                                                }
                                                            } else {
                                                                arrayList5 = arrayList;
                                                                this.contentType = -1;
                                                            }
                                                            if (arrayList4 != null) {
                                                                messageObject.webPageDescriptionEntities = arrayList4;
                                                                iArr2 = null;
                                                                messageObject.linkDescription = null;
                                                                messageObject.generateLinkDescription();
                                                                if ((tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) && this.contentType >= 0) {
                                                                    createDateArray(this.currentAccount, tL_channelAdminLogEvent2, arrayList5, hashMap, z10);
                                                                    if (!z10) {
                                                                        arrayList5.add(0, this);
                                                                    } else {
                                                                        arrayList5.add(arrayList5.size() - 1, this);
                                                                    }
                                                                    if (this.messageText == null) {
                                                                        this.messageText = str;
                                                                    }
                                                                    if (!(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame)) {
                                                                        textPaint = org.telegram.ui.ActionBar.g6.x2;
                                                                    } else {
                                                                        textPaint = org.telegram.ui.ActionBar.g6.o2;
                                                                    }
                                                                    iArr3 = !allowsBigEmoji() ? new int[1] : iArr2;
                                                                    CharSequence replaceEmoji = Emoji.replaceEmoji(this.messageText, textPaint.getFontMetricsInt(), false, iArr3);
                                                                    this.messageText = replaceEmoji;
                                                                    replaceAnimatedEmoji = replaceAnimatedEmoji(replaceEmoji, textPaint.getFontMetricsInt());
                                                                    this.messageText = replaceAnimatedEmoji;
                                                                    if (iArr3 != null && iArr3[0] > 1) {
                                                                        replaceEmojiToLottieFrame(replaceAnimatedEmoji, iArr3);
                                                                    }
                                                                    checkEmojiOnly(iArr3);
                                                                    setType();
                                                                    measureInlineBotButtons();
                                                                    generateCaption();
                                                                    if (mediaController.isPlayingMessage(this)) {
                                                                        MessageObject playingMessageObject2 = mediaController.getPlayingMessageObject();
                                                                        this.audioProgress = playingMessageObject2.audioProgress;
                                                                        this.audioProgressSec = playingMessageObject2.audioProgressSec;
                                                                    }
                                                                    generateLayout(user3);
                                                                    this.layoutCreated = true;
                                                                    generateThumbs(false);
                                                                    checkMediaExistance();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                        } else {
                                                            arrayList5 = arrayList;
                                                        }
                                                        iArr2 = null;
                                                        if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                                                            return;
                                                        }
                                                        createDateArray(this.currentAccount, tL_channelAdminLogEvent2, arrayList5, hashMap, z10);
                                                        if (!z10) {
                                                        }
                                                        if (this.messageText == null) {
                                                        }
                                                        if (!(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame)) {
                                                        }
                                                        if (!allowsBigEmoji()) {
                                                        }
                                                        CharSequence replaceEmoji2 = Emoji.replaceEmoji(this.messageText, textPaint.getFontMetricsInt(), false, iArr3);
                                                        this.messageText = replaceEmoji2;
                                                        replaceAnimatedEmoji = replaceAnimatedEmoji(replaceEmoji2, textPaint.getFontMetricsInt());
                                                        this.messageText = replaceAnimatedEmoji;
                                                        if (iArr3 != null) {
                                                            replaceEmojiToLottieFrame(replaceAnimatedEmoji, iArr3);
                                                        }
                                                        checkEmojiOnly(iArr3);
                                                        setType();
                                                        measureInlineBotButtons();
                                                        generateCaption();
                                                        if (mediaController.isPlayingMessage(this)) {
                                                        }
                                                        generateLayout(user3);
                                                        this.layoutCreated = true;
                                                        generateThumbs(false);
                                                        checkMediaExistance();
                                                        return;
                                                    }
                                                    ArrayList<TLRPC.MessageEntity> arrayList6 = arrayList2;
                                                    message2 = tL_message3;
                                                    arrayList3 = arrayList6;
                                                    message2.reply_markup = message6.reply_markup;
                                                    webPage = message2.media.webpage;
                                                    if (webPage != null) {
                                                    }
                                                    chat2 = chat;
                                                    arrayList4 = arrayList3;
                                                    message3 = message2;
                                                    str = str2;
                                                    if (this.messageOwner == null) {
                                                    }
                                                    this.messageOwner.message = this.messageText.toString();
                                                    this.messageOwner.from_id = new TLRPC.TL_peerUser();
                                                    TLRPC.Message message82 = this.messageOwner;
                                                    message82.from_id.user_id = tL_channelAdminLogEvent2.user_id;
                                                    message82.date = tL_channelAdminLogEvent2.date;
                                                    int i252 = iArr[0];
                                                    iArr[0] = i252 + 1;
                                                    message82.id = i252;
                                                    this.eventId = tL_channelAdminLogEvent2.id;
                                                    message82.out = false;
                                                    message82.peer_id = new TLRPC.TL_peerChannel();
                                                    TLRPC.Message message92 = this.messageOwner;
                                                    message92.peer_id.channel_id = chat2.id;
                                                    message92.unread = false;
                                                    MediaController mediaController2 = MediaController.getInstance();
                                                    this.isOutOwnerCached = null;
                                                    if (message3 instanceof TLRPC.TL_messageEmpty) {
                                                    }
                                                    if (message3 != null) {
                                                    }
                                                    iArr2 = null;
                                                    if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                                                    }
                                                } else {
                                                    if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeEmojiStickerSet) {
                                                        TLRPC.InputStickerSet inputStickerSet = ((TLRPC.TL_channelAdminLogEventActionChangeEmojiStickerSet) channelAdminLogEventAction).new_stickerset;
                                                        if (inputStickerSet != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                                                            this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogChangedEmojiPack), "un1", user3);
                                                        } else {
                                                            this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogRemovedEmojiPack), "un1", user3);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeStickerSet) {
                                                        TLRPC.InputStickerSet inputStickerSet2 = ((TLRPC.TL_channelAdminLogEventActionChangeStickerSet) channelAdminLogEventAction).new_stickerset;
                                                        if (inputStickerSet2 != null && !(inputStickerSet2 instanceof TLRPC.TL_inputStickerSetEmpty)) {
                                                            this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogChangedStickersSet), "un1", user3);
                                                        } else {
                                                            this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogRemovedStickersSet), "un1", user3);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeLocation) {
                                                        TLRPC.ChannelLocation channelLocation = ((TLRPC.TL_channelAdminLogEventActionChangeLocation) channelAdminLogEventAction).new_value;
                                                        if (channelLocation instanceof TLRPC.TL_channelLocationEmpty) {
                                                            this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogRemovedLocation), "un1", user3);
                                                        } else {
                                                            this.messageText = replaceWithLink(LocaleController.formatString("EventLogChangedLocation", R.string.EventLogChangedLocation, ((TLRPC.TL_channelLocation) channelLocation).address), "un1", user3);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleSlowMode) {
                                                        int i27 = ((TLRPC.TL_channelAdminLogEventActionToggleSlowMode) channelAdminLogEventAction).new_value;
                                                        if (i27 == 0) {
                                                            this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogToggledSlowmodeOff), "un1", user3);
                                                        } else {
                                                            if (i27 < 60) {
                                                                c11 = 0;
                                                                formatPluralString2 = LocaleController.formatPluralString("Seconds", i27, new Object[0]);
                                                            } else {
                                                                c11 = 0;
                                                                if (i27 < 3600) {
                                                                    formatPluralString2 = LocaleController.formatPluralString("Minutes", i27 / 60, new Object[0]);
                                                                } else {
                                                                    formatPluralString2 = LocaleController.formatPluralString("Hours", (i27 / 60) / 60, new Object[0]);
                                                                }
                                                            }
                                                            int i28 = R.string.EventLogToggledSlowmodeOn;
                                                            Object[] objArr = new Object[1];
                                                            objArr[c11] = formatPluralString2;
                                                            this.messageText = replaceWithLink(LocaleController.formatString(i28, objArr), "un1", user3);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleAutotranslation) {
                                                        this.messageText = replaceWithLink(LocaleController.getString(((TLRPC.TL_channelAdminLogEventActionToggleAutotranslation) channelAdminLogEventAction).new_value ? R.string.EventLogToggledAutotranslationOn : R.string.EventLogToggledAutotranslationOff), "un1", user3);
                                                    } else {
                                                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionStartGroupCall) {
                                                            chat2 = chat;
                                                            if (ChatObject.isChannel(chat) && (!chat2.megagroup || chat2.gigagroup)) {
                                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogStartedLiveStream), "un1", user3);
                                                            } else {
                                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogStartedVoiceChat), "un1", user3);
                                                            }
                                                        } else {
                                                            chat2 = chat;
                                                            if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDiscardGroupCall) {
                                                                if (ChatObject.isChannel(chat2) && (!chat2.megagroup || chat2.gigagroup)) {
                                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogEndedLiveStream), "un1", user3);
                                                                } else {
                                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogEndedVoiceChat), "un1", user3);
                                                                }
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantMute) {
                                                                long peerId3 = getPeerId(((TLRPC.TL_channelAdminLogEventActionParticipantMute) channelAdminLogEventAction).participant.peer);
                                                                if (peerId3 > 0) {
                                                                    chat5 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId3));
                                                                } else {
                                                                    chat5 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId3));
                                                                }
                                                                CharSequence replaceWithLink6 = replaceWithLink(LocaleController.getString(R.string.EventLogVoiceChatMuted), "un1", user3);
                                                                this.messageText = replaceWithLink6;
                                                                this.messageText = replaceWithLink(replaceWithLink6, "un2", chat5);
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantUnmute) {
                                                                long peerId4 = getPeerId(((TLRPC.TL_channelAdminLogEventActionParticipantUnmute) channelAdminLogEventAction).participant.peer);
                                                                if (peerId4 > 0) {
                                                                    chat4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId4));
                                                                } else {
                                                                    chat4 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId4));
                                                                }
                                                                CharSequence replaceWithLink7 = replaceWithLink(LocaleController.getString(R.string.EventLogVoiceChatUnmuted), "un1", user3);
                                                                this.messageText = replaceWithLink7;
                                                                this.messageText = replaceWithLink(replaceWithLink7, "un2", chat4);
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleGroupCallSetting) {
                                                                if (((TLRPC.TL_channelAdminLogEventActionToggleGroupCallSetting) channelAdminLogEventAction).join_muted) {
                                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogVoiceChatNotAllowedToSpeak), "un1", user3);
                                                                } else {
                                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogVoiceChatAllowedToSpeak), "un1", user3);
                                                                }
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) {
                                                                TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite tL_channelAdminLogEventActionParticipantJoinByInvite = (TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) channelAdminLogEventAction;
                                                                if (tL_channelAdminLogEventActionParticipantJoinByInvite.via_chatlist) {
                                                                    this.messageText = replaceWithLink(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat2) ? R.string.ActionInviteChannelUserFolder : R.string.ActionInviteUserFolder), "un1", user3);
                                                                } else {
                                                                    this.messageText = replaceWithLink(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat2) ? R.string.ActionInviteChannelUser : R.string.ActionInviteUser), "un1", user3);
                                                                }
                                                                TLRPC.TL_chatInviteExported tL_chatInviteExported = tL_channelAdminLogEventActionParticipantJoinByInvite.invite;
                                                                if (tL_chatInviteExported != null && !TextUtils.isEmpty(tL_chatInviteExported.link)) {
                                                                    this.messageText = TextUtils.concat(this.messageText, " ", tL_channelAdminLogEventActionParticipantJoinByInvite.invite.link);
                                                                }
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleNoForwards) {
                                                                TLRPC.TL_channelAdminLogEventActionToggleNoForwards tL_channelAdminLogEventActionToggleNoForwards = (TLRPC.TL_channelAdminLogEventActionToggleNoForwards) channelAdminLogEventAction;
                                                                boolean z18 = ChatObject.isChannel(chat2) && !chat2.megagroup;
                                                                if (tL_channelAdminLogEventActionToggleNoForwards.new_value) {
                                                                    if (z18) {
                                                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionForwardsRestrictedChannel), "un1", user3);
                                                                    } else {
                                                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionForwardsRestrictedGroup), "un1", user3);
                                                                    }
                                                                } else if (z18) {
                                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionForwardsEnabledChannel), "un1", user3);
                                                                } else {
                                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionForwardsEnabledGroup), "un1", user3);
                                                                }
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionExportedInviteDelete) {
                                                                CharSequence replaceWithLink8 = replaceWithLink(LocaleController.formatString(R.string.ActionDeletedInviteLinkClickable, new Object[0]), "un1", user3);
                                                                this.messageText = replaceWithLink8;
                                                                this.messageText = replaceWithLink(replaceWithLink8, "un2", ((TLRPC.TL_channelAdminLogEventActionExportedInviteDelete) channelAdminLogEventAction).invite);
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke) {
                                                                TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = (TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke) channelAdminLogEventAction;
                                                                CharSequence replaceWithLink9 = replaceWithLink(LocaleController.formatString(R.string.ActionRevokedInviteLinkClickable, tL_channelAdminLogEventActionExportedInviteRevoke.invite.link), "un1", user3);
                                                                this.messageText = replaceWithLink9;
                                                                this.messageText = replaceWithLink(replaceWithLink9, "un2", tL_channelAdminLogEventActionExportedInviteRevoke.invite);
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionExportedInviteEdit) {
                                                                TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = (TLRPC.TL_channelAdminLogEventActionExportedInviteEdit) channelAdminLogEventAction;
                                                                String str5 = tL_channelAdminLogEventActionExportedInviteEdit.prev_invite.link;
                                                                if (str5 != null && str5.equals(tL_channelAdminLogEventActionExportedInviteEdit.new_invite.link)) {
                                                                    this.messageText = replaceWithLink(LocaleController.formatString(R.string.ActionEditedInviteLinkToSameClickable, new Object[0]), "un1", user3);
                                                                } else {
                                                                    this.messageText = replaceWithLink(LocaleController.formatString(R.string.ActionEditedInviteLinkClickable, new Object[0]), "un1", user3);
                                                                }
                                                                CharSequence replaceWithLink10 = replaceWithLink(this.messageText, "un2", tL_channelAdminLogEventActionExportedInviteEdit.prev_invite);
                                                                this.messageText = replaceWithLink10;
                                                                this.messageText = replaceWithLink(replaceWithLink10, "un3", tL_channelAdminLogEventActionExportedInviteEdit.new_invite);
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantVolume) {
                                                                long peerId5 = getPeerId(((TLRPC.TL_channelAdminLogEventActionParticipantVolume) channelAdminLogEventAction).participant.peer);
                                                                if (peerId5 > 0) {
                                                                    chat3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId5));
                                                                } else {
                                                                    chat3 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId5));
                                                                }
                                                                double participantVolume = ChatObject.getParticipantVolume(r4.participant) / 100.0d;
                                                                CharSequence replaceWithLink11 = replaceWithLink(LocaleController.formatString("ActionVolumeChanged", R.string.ActionVolumeChanged, Integer.valueOf((int) (participantVolume > 0.0d ? Math.max(participantVolume, 1.0d) : 0.0d))), "un1", user3);
                                                                this.messageText = replaceWithLink11;
                                                                this.messageText = replaceWithLink(replaceWithLink11, "un2", chat3);
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL) {
                                                                TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL tL_channelAdminLogEventActionChangeHistoryTTL = (TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL) channelAdminLogEventAction;
                                                                if (!chat2.megagroup) {
                                                                    int i29 = tL_channelAdminLogEventActionChangeHistoryTTL.new_value;
                                                                    if (i29 != 0) {
                                                                        this.messageText = LocaleController.formatString("ActionTTLChannelChanged", R.string.ActionTTLChannelChanged, LocaleController.formatTTLString(i29));
                                                                    } else {
                                                                        this.messageText = LocaleController.getString(R.string.ActionTTLChannelDisabled);
                                                                    }
                                                                } else {
                                                                    int i30 = tL_channelAdminLogEventActionChangeHistoryTTL.new_value;
                                                                    if (i30 == 0) {
                                                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionTTLDisabled), "un1", user3);
                                                                    } else {
                                                                        if (i30 > 86400) {
                                                                            c10 = 0;
                                                                            formatPluralString = LocaleController.formatPluralString("Days", i30 / 86400, new Object[0]);
                                                                        } else {
                                                                            c10 = 0;
                                                                            if (i30 >= 3600) {
                                                                                formatPluralString = LocaleController.formatPluralString("Hours", i30 / 3600, new Object[0]);
                                                                            } else if (i30 >= 60) {
                                                                                formatPluralString = LocaleController.formatPluralString("Minutes", i30 / 60, new Object[0]);
                                                                            } else {
                                                                                formatPluralString = LocaleController.formatPluralString("Seconds", i30, new Object[0]);
                                                                            }
                                                                        }
                                                                        int i31 = R.string.ActionTTLChanged;
                                                                        Object[] objArr2 = new Object[1];
                                                                        objArr2[c10] = formatPluralString;
                                                                        this.messageText = replaceWithLink(LocaleController.formatString(i31, objArr2), "un1", user3);
                                                                    }
                                                                }
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest) {
                                                                TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest tL_channelAdminLogEventActionParticipantJoinByRequest = (TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest) channelAdminLogEventAction;
                                                                TLRPC.ExportedChatInvite exportedChatInvite = tL_channelAdminLogEventActionParticipantJoinByRequest.invite;
                                                                if (((exportedChatInvite instanceof TLRPC.TL_chatInviteExported) && "https://t.me/+PublicChat".equals(((TLRPC.TL_chatInviteExported) exportedChatInvite).link)) || (tL_channelAdminLogEventActionParticipantJoinByRequest.invite instanceof TLRPC.TL_chatInvitePublicJoinRequests)) {
                                                                    CharSequence replaceWithLink12 = replaceWithLink(LocaleController.getString(R.string.JoinedViaRequestApproved), "un1", user3);
                                                                    this.messageText = replaceWithLink12;
                                                                    this.messageText = replaceWithLink(replaceWithLink12, "un2", MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_channelAdminLogEventActionParticipantJoinByRequest.approved_by)));
                                                                } else {
                                                                    CharSequence replaceWithLink13 = replaceWithLink(LocaleController.getString(R.string.JoinedViaInviteLinkApproved), "un1", user3);
                                                                    this.messageText = replaceWithLink13;
                                                                    CharSequence replaceWithLink14 = replaceWithLink(replaceWithLink13, "un2", tL_channelAdminLogEventActionParticipantJoinByRequest.invite);
                                                                    this.messageText = replaceWithLink14;
                                                                    this.messageText = replaceWithLink(replaceWithLink14, "un3", MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_channelAdminLogEventActionParticipantJoinByRequest.approved_by)));
                                                                }
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionSendMessage) {
                                                                message = ((TLRPC.TL_channelAdminLogEventActionSendMessage) channelAdminLogEventAction).message;
                                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogSendMessages), "un1", user3);
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantEditRank) {
                                                                TLRPC.TL_channelAdminLogEventActionParticipantEditRank tL_channelAdminLogEventActionParticipantEditRank = (TLRPC.TL_channelAdminLogEventActionParticipantEditRank) channelAdminLogEventAction;
                                                                if (tL_channelAdminLogEventActionParticipantEditRank.user_id == tL_channelAdminLogEvent2.user_id) {
                                                                    if (!TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.prev_rank) && !TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.new_rank)) {
                                                                        String formatString = LocaleController.formatString(R.string.EventLogRankSelfEdit, tL_channelAdminLogEventActionParticipantEditRank.prev_rank, tL_channelAdminLogEventActionParticipantEditRank.new_rank);
                                                                        this.messageText = formatString;
                                                                        this.messageText = replaceWithLink(formatString, "un1", user3);
                                                                    } else if (TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.prev_rank) && !TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.new_rank)) {
                                                                        String formatString2 = LocaleController.formatString(R.string.EventLogRankSelfAdd, tL_channelAdminLogEventActionParticipantEditRank.new_rank);
                                                                        this.messageText = formatString2;
                                                                        this.messageText = replaceWithLink(formatString2, "un1", user3);
                                                                    } else {
                                                                        String formatString3 = LocaleController.formatString(R.string.EventLogRankSelfRemove, tL_channelAdminLogEventActionParticipantEditRank.prev_rank);
                                                                        this.messageText = formatString3;
                                                                        this.messageText = replaceWithLink(formatString3, "un1", user3);
                                                                    }
                                                                } else {
                                                                    TLRPC.User user5 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_channelAdminLogEventActionParticipantEditRank.user_id));
                                                                    if (!TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.prev_rank) && !TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.new_rank)) {
                                                                        String formatString4 = LocaleController.formatString(R.string.EventLogRankEdit, tL_channelAdminLogEventActionParticipantEditRank.prev_rank, tL_channelAdminLogEventActionParticipantEditRank.new_rank);
                                                                        this.messageText = formatString4;
                                                                        CharSequence replaceWithLink15 = replaceWithLink(formatString4, "un1", user3);
                                                                        this.messageText = replaceWithLink15;
                                                                        this.messageText = replaceWithLink(replaceWithLink15, "un2", user5);
                                                                    } else if (TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.prev_rank) && !TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.new_rank)) {
                                                                        String formatString5 = LocaleController.formatString(R.string.EventLogRankAdd, tL_channelAdminLogEventActionParticipantEditRank.new_rank);
                                                                        this.messageText = formatString5;
                                                                        CharSequence replaceWithLink16 = replaceWithLink(formatString5, "un1", user3);
                                                                        this.messageText = replaceWithLink16;
                                                                        this.messageText = replaceWithLink(replaceWithLink16, "un2", user5);
                                                                    } else {
                                                                        String formatString6 = LocaleController.formatString(R.string.EventLogRankRemove, tL_channelAdminLogEventActionParticipantEditRank.prev_rank);
                                                                        this.messageText = formatString6;
                                                                        CharSequence replaceWithLink17 = replaceWithLink(formatString6, "un1", user3);
                                                                        this.messageText = replaceWithLink17;
                                                                        this.messageText = replaceWithLink(replaceWithLink17, "un2", user5);
                                                                    }
                                                                }
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeAvailableReactions) {
                                                                TLRPC.TL_channelAdminLogEventActionChangeAvailableReactions tL_channelAdminLogEventActionChangeAvailableReactions = (TLRPC.TL_channelAdminLogEventActionChangeAvailableReactions) channelAdminLogEventAction;
                                                                boolean z19 = (tL_channelAdminLogEventActionChangeAvailableReactions.prev_value instanceof TLRPC.TL_chatReactionsSome) && (tL_channelAdminLogEventActionChangeAvailableReactions.new_value instanceof TLRPC.TL_chatReactionsSome);
                                                                CharSequence stringFrom = getStringFrom(tL_channelAdminLogEventActionChangeAvailableReactions.new_value);
                                                                if (z19) {
                                                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replaceWithLink(LocaleController.formatString(R.string.ActionReactionsChangedList, "**new**"), "un1", user3));
                                                                    int indexOf = spannableStringBuilder.toString().indexOf("**new**");
                                                                    if (indexOf > 0) {
                                                                        spannableStringBuilder.replace(indexOf, indexOf + 7, stringFrom);
                                                                    }
                                                                    this.messageText = spannableStringBuilder;
                                                                } else {
                                                                    CharSequence stringFrom2 = getStringFrom(tL_channelAdminLogEventActionChangeAvailableReactions.prev_value);
                                                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(replaceWithLink(LocaleController.formatString(R.string.ActionReactionsChanged, "**old**", "**new**"), "un1", user3));
                                                                    int indexOf2 = spannableStringBuilder2.toString().indexOf("**old**");
                                                                    if (indexOf2 > 0) {
                                                                        spannableStringBuilder2.replace(indexOf2, indexOf2 + 7, stringFrom2);
                                                                    }
                                                                    int indexOf3 = spannableStringBuilder2.toString().indexOf("**new**");
                                                                    if (indexOf3 > 0) {
                                                                        spannableStringBuilder2.replace(indexOf3, indexOf3 + 7, stringFrom);
                                                                    }
                                                                    this.messageText = spannableStringBuilder2;
                                                                }
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeUsernames) {
                                                                TLRPC.TL_channelAdminLogEventActionChangeUsernames tL_channelAdminLogEventActionChangeUsernames = (TLRPC.TL_channelAdminLogEventActionChangeUsernames) channelAdminLogEventAction;
                                                                ArrayList<String> arrayList7 = tL_channelAdminLogEventActionChangeUsernames.prev_value;
                                                                ArrayList<String> arrayList8 = tL_channelAdminLogEventActionChangeUsernames.new_value;
                                                                this.messageText = null;
                                                                if (arrayList7 != null && arrayList8 != null) {
                                                                    if (arrayList8.size() + 1 == arrayList7.size()) {
                                                                        int i32 = 0;
                                                                        String str6 = null;
                                                                        while (true) {
                                                                            if (i32 >= arrayList7.size()) {
                                                                                break;
                                                                            }
                                                                            String str7 = arrayList7.get(i32);
                                                                            if (!arrayList8.contains(str7)) {
                                                                                if (str6 != null) {
                                                                                    str6 = null;
                                                                                    break;
                                                                                }
                                                                                str6 = str7;
                                                                            }
                                                                            i32++;
                                                                        }
                                                                        if (str6 != null) {
                                                                            this.messageText = replaceWithLink(LocaleController.formatString("EventLogDeactivatedUsername", R.string.EventLogDeactivatedUsername, "@".concat(str6)), "un1", user3);
                                                                        }
                                                                    } else if (arrayList7.size() + 1 == arrayList8.size()) {
                                                                        int i33 = 0;
                                                                        String str8 = null;
                                                                        while (true) {
                                                                            if (i33 >= arrayList8.size()) {
                                                                                break;
                                                                            }
                                                                            String str9 = arrayList8.get(i33);
                                                                            if (!arrayList7.contains(str9)) {
                                                                                if (str8 != null) {
                                                                                    str8 = null;
                                                                                    break;
                                                                                }
                                                                                str8 = str9;
                                                                            }
                                                                            i33++;
                                                                        }
                                                                        if (str8 != null) {
                                                                            this.messageText = replaceWithLink(LocaleController.formatString("EventLogActivatedUsername", R.string.EventLogActivatedUsername, "@".concat(str8)), "un1", user3);
                                                                        }
                                                                    }
                                                                }
                                                                if (this.messageText == null) {
                                                                    this.messageText = replaceWithLink(LocaleController.formatString("EventLogChangeUsernames", R.string.EventLogChangeUsernames, getUsernamesString(arrayList7), getUsernamesString(arrayList8)), "un1", user3);
                                                                }
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleForum) {
                                                                if (((TLRPC.TL_channelAdminLogEventActionToggleForum) channelAdminLogEventAction).new_value) {
                                                                    this.messageText = replaceWithLink(LocaleController.formatString("EventLogSwitchToForum", R.string.EventLogSwitchToForum, new Object[0]), "un1", user3);
                                                                } else {
                                                                    this.messageText = replaceWithLink(LocaleController.formatString("EventLogSwitchToGroup", R.string.EventLogSwitchToGroup, new Object[0]), "un1", user3);
                                                                }
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionCreateTopic) {
                                                                CharSequence replaceWithLink18 = replaceWithLink(LocaleController.formatString("EventLogCreateTopic", R.string.EventLogCreateTopic, new Object[0]), "un1", user3);
                                                                this.messageText = replaceWithLink18;
                                                                this.messageText = replaceWithLink(replaceWithLink18, "un2", ((TLRPC.TL_channelAdminLogEventActionCreateTopic) channelAdminLogEventAction).topic);
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionEditTopic) {
                                                                TLRPC.TL_channelAdminLogEventActionEditTopic tL_channelAdminLogEventActionEditTopic = (TLRPC.TL_channelAdminLogEventActionEditTopic) channelAdminLogEventAction;
                                                                TLRPC.ForumTopic forumTopic = tL_channelAdminLogEventActionEditTopic.prev_topic;
                                                                boolean z20 = forumTopic instanceof TLRPC.TL_forumTopic;
                                                                if (z20) {
                                                                    TLRPC.ForumTopic forumTopic2 = tL_channelAdminLogEventActionEditTopic.new_topic;
                                                                    if (forumTopic2 instanceof TLRPC.TL_forumTopic) {
                                                                        boolean z21 = ((TLRPC.TL_forumTopic) forumTopic).hidden;
                                                                        boolean z22 = ((TLRPC.TL_forumTopic) forumTopic2).hidden;
                                                                        if (z21 != z22) {
                                                                            this.messageText = replaceWithLink(LocaleController.getString(z22 ? R.string.TopicHidden2 : R.string.TopicShown2), "%s", user3);
                                                                        }
                                                                    }
                                                                }
                                                                if (z20) {
                                                                    TLRPC.ForumTopic forumTopic3 = tL_channelAdminLogEventActionEditTopic.new_topic;
                                                                    if (forumTopic3 instanceof TLRPC.TL_forumTopic) {
                                                                        boolean z23 = ((TLRPC.TL_forumTopic) forumTopic).closed;
                                                                        boolean z24 = ((TLRPC.TL_forumTopic) forumTopic3).closed;
                                                                        if (z23 != z24) {
                                                                            if (z24) {
                                                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogClosedTopic), "%s", user3);
                                                                            } else {
                                                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogReopenedTopic), "%s", user3);
                                                                            }
                                                                            this.messageText = replaceWithLink(this.messageText, "un2", tL_channelAdminLogEventActionEditTopic.new_topic);
                                                                        }
                                                                    }
                                                                }
                                                                CharSequence replaceWithLink19 = replaceWithLink(LocaleController.getString(R.string.EventLogEditTopic), "un1", user3);
                                                                this.messageText = replaceWithLink19;
                                                                CharSequence replaceWithLink20 = replaceWithLink(replaceWithLink19, "un2", tL_channelAdminLogEventActionEditTopic.prev_topic);
                                                                this.messageText = replaceWithLink20;
                                                                this.messageText = replaceWithLink(replaceWithLink20, "un3", tL_channelAdminLogEventActionEditTopic.new_topic);
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteTopic) {
                                                                CharSequence replaceWithLink21 = replaceWithLink(LocaleController.getString(R.string.EventLogDeleteTopic), "un1", user3);
                                                                this.messageText = replaceWithLink21;
                                                                this.messageText = replaceWithLink(replaceWithLink21, "un2", ((TLRPC.TL_channelAdminLogEventActionDeleteTopic) channelAdminLogEventAction).topic);
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionPinTopic) {
                                                                TLRPC.TL_channelAdminLogEventActionPinTopic tL_channelAdminLogEventActionPinTopic = (TLRPC.TL_channelAdminLogEventActionPinTopic) channelAdminLogEventAction;
                                                                TLRPC.ForumTopic forumTopic4 = tL_channelAdminLogEventActionPinTopic.new_topic;
                                                                if ((forumTopic4 instanceof TLRPC.TL_forumTopic) && ((TLRPC.TL_forumTopic) forumTopic4).pinned) {
                                                                    CharSequence replaceWithLink22 = replaceWithLink(LocaleController.formatString("EventLogPinTopic", R.string.EventLogPinTopic, new Object[0]), "un1", user3);
                                                                    this.messageText = replaceWithLink22;
                                                                    this.messageText = replaceWithLink(replaceWithLink22, "un2", tL_channelAdminLogEventActionPinTopic.new_topic);
                                                                } else {
                                                                    CharSequence replaceWithLink23 = replaceWithLink(LocaleController.formatString("EventLogUnpinTopic", R.string.EventLogUnpinTopic, new Object[0]), "un1", user3);
                                                                    this.messageText = replaceWithLink23;
                                                                    this.messageText = replaceWithLink(replaceWithLink23, "un2", tL_channelAdminLogEventActionPinTopic.new_topic);
                                                                }
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleAntiSpam) {
                                                                if (((TLRPC.TL_channelAdminLogEventActionToggleAntiSpam) channelAdminLogEventAction).new_value) {
                                                                    string2 = LocaleController.getString(R.string.EventLogEnabledAntiSpam);
                                                                } else {
                                                                    string2 = LocaleController.getString(R.string.EventLogDisabledAntiSpam);
                                                                }
                                                                this.messageText = replaceWithLink(string2, "un1", user3);
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeColor) {
                                                                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat2);
                                                                TLRPC.TL_channelAdminLogEventActionChangeColor tL_channelAdminLogEventActionChangeColor = (TLRPC.TL_channelAdminLogEventActionChangeColor) tL_channelAdminLogEvent2.action;
                                                                int i34 = isChannelAndNotMegaGroup ? R.string.EventLogChangedColor : R.string.EventLogChangedColorGroup;
                                                                int i35 = tL_channelAdminLogEventActionChangeColor.prev_value;
                                                                int[][] iArr4 = org.telegram.ui.Components.y8.C;
                                                                this.messageText = replaceWithLink(LocaleController.formatString(i34, LocaleController.getString(new int[]{R.string.ColorRed, R.string.ColorOrange, R.string.ColorViolet, R.string.ColorGreen, R.string.ColorCyan, R.string.ColorBlue, R.string.ColorPink}[i35 % 7]).toLowerCase(), LocaleController.getString(new int[]{R.string.ColorRed, R.string.ColorOrange, R.string.ColorViolet, R.string.ColorGreen, R.string.ColorCyan, R.string.ColorBlue, R.string.ColorPink}[tL_channelAdminLogEventActionChangeColor.new_value % 7]).toLowerCase()), "un1", user3);
                                                            } else {
                                                                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangePeerColor) {
                                                                    boolean isChannelAndNotMegaGroup2 = ChatObject.isChannelAndNotMegaGroup(chat2);
                                                                    TLRPC.TL_channelAdminLogEventActionChangePeerColor tL_channelAdminLogEventActionChangePeerColor = (TLRPC.TL_channelAdminLogEventActionChangePeerColor) tL_channelAdminLogEvent2.action;
                                                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(isChannelAndNotMegaGroup2 ? R.string.EventLogChangedPeerColorIcon : R.string.EventLogChangedPeerColorIconGroup));
                                                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                                                    if ((tL_channelAdminLogEventActionChangePeerColor.prev_value.flags & 1) != 0) {
                                                                        spannableStringBuilder4.append((CharSequence) "c");
                                                                        str = str2;
                                                                        jz0 jz0Var = new jz0(false, this.currentAccount, tL_channelAdminLogEventActionChangePeerColor.prev_value.color);
                                                                        jz0Var.a(AndroidUtilities.dp(18.0f));
                                                                        spannableStringBuilder4.setSpan(jz0Var, spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                                                                    } else {
                                                                        str = str2;
                                                                    }
                                                                    if ((tL_channelAdminLogEventActionChangePeerColor.prev_value.flags & 2) != 0) {
                                                                        if (spannableStringBuilder4.length() > 0) {
                                                                            spannableStringBuilder4.append((CharSequence) ", ");
                                                                        }
                                                                        spannableStringBuilder4.append((CharSequence) "e");
                                                                        spannableStringBuilder4.setSpan(new org.telegram.ui.Components.t5(tL_channelAdminLogEventActionChangePeerColor.prev_value.background_emoji_id, org.telegram.ui.ActionBar.g6.s2.getFontMetricsInt()), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                                                                    }
                                                                    if (spannableStringBuilder4.length() == 0) {
                                                                        spannableStringBuilder4.append((CharSequence) LocaleController.getString(R.string.EventLogEmojiNone));
                                                                    }
                                                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                                                    if ((tL_channelAdminLogEventActionChangePeerColor.new_value.flags & 1) != 0) {
                                                                        spannableStringBuilder5.append((CharSequence) "c");
                                                                        jz0 jz0Var2 = new jz0(false, this.currentAccount, tL_channelAdminLogEventActionChangePeerColor.new_value.color);
                                                                        jz0Var2.a(AndroidUtilities.dp(18.0f));
                                                                        spannableStringBuilder5.setSpan(jz0Var2, spannableStringBuilder5.length() - 1, spannableStringBuilder5.length(), 33);
                                                                    }
                                                                    if ((tL_channelAdminLogEventActionChangePeerColor.new_value.flags & 2) != 0) {
                                                                        if (spannableStringBuilder5.length() > 0) {
                                                                            spannableStringBuilder5.append((CharSequence) ", ");
                                                                        }
                                                                        spannableStringBuilder5.append((CharSequence) "e");
                                                                        spannableStringBuilder5.setSpan(new org.telegram.ui.Components.t5(tL_channelAdminLogEventActionChangePeerColor.new_value.background_emoji_id, org.telegram.ui.ActionBar.g6.s2.getFontMetricsInt()), spannableStringBuilder5.length() - 1, spannableStringBuilder5.length(), 33);
                                                                    }
                                                                    if (spannableStringBuilder5.length() == 0) {
                                                                        spannableStringBuilder5.append((CharSequence) LocaleController.getString(R.string.EventLogEmojiNone));
                                                                    }
                                                                    this.messageText = replaceWithLink(AndroidUtilities.replaceCharSequence("%2$s", AndroidUtilities.replaceCharSequence("%1$s", spannableStringBuilder3, spannableStringBuilder4), spannableStringBuilder5), "un1", user3);
                                                                } else {
                                                                    str = str2;
                                                                    if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeProfilePeerColor) {
                                                                        boolean isChannelAndNotMegaGroup3 = ChatObject.isChannelAndNotMegaGroup(chat);
                                                                        TLRPC.TL_channelAdminLogEventActionChangeProfilePeerColor tL_channelAdminLogEventActionChangeProfilePeerColor = (TLRPC.TL_channelAdminLogEventActionChangeProfilePeerColor) tL_channelAdminLogEvent2.action;
                                                                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(LocaleController.getString(isChannelAndNotMegaGroup3 ? R.string.EventLogChangedProfileColorIcon : R.string.EventLogChangedProfileColorIconGroup));
                                                                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                                                                        if ((tL_channelAdminLogEventActionChangeProfilePeerColor.prev_value.flags & 1) != 0) {
                                                                            spannableStringBuilder7.append((CharSequence) "c");
                                                                            jz0 jz0Var3 = new jz0(true, this.currentAccount, tL_channelAdminLogEventActionChangeProfilePeerColor.prev_value.color);
                                                                            jz0Var3.a(AndroidUtilities.dp(18.0f));
                                                                            spannableStringBuilder7.setSpan(jz0Var3, spannableStringBuilder7.length() - 1, spannableStringBuilder7.length(), 33);
                                                                        }
                                                                        if ((tL_channelAdminLogEventActionChangeProfilePeerColor.prev_value.flags & 2) != 0) {
                                                                            if (spannableStringBuilder7.length() > 0) {
                                                                                spannableStringBuilder7.append((CharSequence) ", ");
                                                                            }
                                                                            spannableStringBuilder7.append((CharSequence) "e");
                                                                            spannableStringBuilder7.setSpan(new org.telegram.ui.Components.t5(tL_channelAdminLogEventActionChangeProfilePeerColor.prev_value.background_emoji_id, org.telegram.ui.ActionBar.g6.s2.getFontMetricsInt()), spannableStringBuilder7.length() - 1, spannableStringBuilder7.length(), 33);
                                                                        }
                                                                        if (spannableStringBuilder7.length() == 0) {
                                                                            spannableStringBuilder7.append((CharSequence) LocaleController.getString(R.string.EventLogEmojiNone));
                                                                        }
                                                                        SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
                                                                        if ((tL_channelAdminLogEventActionChangeProfilePeerColor.new_value.flags & 1) != 0) {
                                                                            spannableStringBuilder8.append((CharSequence) "c");
                                                                            jz0 jz0Var4 = new jz0(true, this.currentAccount, tL_channelAdminLogEventActionChangeProfilePeerColor.new_value.color);
                                                                            jz0Var4.a(AndroidUtilities.dp(18.0f));
                                                                            spannableStringBuilder8.setSpan(jz0Var4, spannableStringBuilder8.length() - 1, spannableStringBuilder8.length(), 33);
                                                                        }
                                                                        if ((tL_channelAdminLogEventActionChangeProfilePeerColor.new_value.flags & 2) != 0) {
                                                                            if (spannableStringBuilder8.length() > 0) {
                                                                                spannableStringBuilder8.append((CharSequence) ", ");
                                                                            }
                                                                            spannableStringBuilder8.append((CharSequence) "e");
                                                                            spannableStringBuilder8.setSpan(new org.telegram.ui.Components.t5(tL_channelAdminLogEventActionChangeProfilePeerColor.new_value.background_emoji_id, org.telegram.ui.ActionBar.g6.s2.getFontMetricsInt()), spannableStringBuilder8.length() - 1, spannableStringBuilder8.length(), 33);
                                                                        }
                                                                        if (spannableStringBuilder8.length() == 0) {
                                                                            spannableStringBuilder8.append((CharSequence) LocaleController.getString(R.string.EventLogEmojiNone));
                                                                        }
                                                                        this.messageText = replaceWithLink(AndroidUtilities.replaceCharSequence("%2$s", AndroidUtilities.replaceCharSequence("%1$s", spannableStringBuilder6, spannableStringBuilder7), spannableStringBuilder8), "un1", user3);
                                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeEmojiStatus) {
                                                                        boolean isChannelAndNotMegaGroup4 = ChatObject.isChannelAndNotMegaGroup(chat);
                                                                        TLRPC.TL_channelAdminLogEventActionChangeEmojiStatus tL_channelAdminLogEventActionChangeEmojiStatus = (TLRPC.TL_channelAdminLogEventActionChangeEmojiStatus) tL_channelAdminLogEvent2.action;
                                                                        if (tL_channelAdminLogEventActionChangeEmojiStatus.prev_value instanceof TLRPC.TL_emojiStatusEmpty) {
                                                                            spannableString3 = new SpannableString(LocaleController.getString(R.string.EventLogEmojiNone));
                                                                            z11 = true;
                                                                        } else {
                                                                            spannableString3 = new SpannableString("e");
                                                                            spannableString3.setSpan(new org.telegram.ui.Components.t5(DialogObject.getEmojiStatusDocumentId(tL_channelAdminLogEventActionChangeEmojiStatus.prev_value), org.telegram.ui.ActionBar.g6.s2.getFontMetricsInt()), 0, 1, 33);
                                                                            z11 = false;
                                                                        }
                                                                        int emojiStatusUntil = DialogObject.getEmojiStatusUntil(tL_channelAdminLogEventActionChangeEmojiStatus.new_value);
                                                                        if (tL_channelAdminLogEventActionChangeEmojiStatus.new_value instanceof TLRPC.TL_emojiStatusEmpty) {
                                                                            spannableString4 = new SpannableString(LocaleController.getString(R.string.EventLogEmojiNone));
                                                                        } else {
                                                                            SpannableString spannableString5 = new SpannableString("e");
                                                                            spannableString5.setSpan(new org.telegram.ui.Components.t5(DialogObject.getEmojiStatusDocumentId(tL_channelAdminLogEventActionChangeEmojiStatus.new_value), org.telegram.ui.ActionBar.g6.s2.getFontMetricsInt()), 0, 1, 33);
                                                                            spannableString4 = spannableString5;
                                                                        }
                                                                        if (z11) {
                                                                            if (emojiStatusUntil != 0) {
                                                                                i11 = isChannelAndNotMegaGroup4 ? R.string.EventLogChangedEmojiStatusFor : R.string.EventLogChangedEmojiStatusForGroup;
                                                                            } else {
                                                                                i11 = isChannelAndNotMegaGroup4 ? R.string.EventLogChangedEmojiStatus : R.string.EventLogChangedEmojiStatusGroup;
                                                                            }
                                                                        } else if (emojiStatusUntil != 0) {
                                                                            i11 = isChannelAndNotMegaGroup4 ? R.string.EventLogChangedEmojiStatusFromFor : R.string.EventLogChangedEmojiStatusFromForGroup;
                                                                        } else {
                                                                            i11 = isChannelAndNotMegaGroup4 ? R.string.EventLogChangedEmojiStatusFrom : R.string.EventLogChangedEmojiStatusFromGroup;
                                                                        }
                                                                        SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence("%2$s", AndroidUtilities.replaceCharSequence("%1$s", new SpannableStringBuilder(LocaleController.getString(i11)), spannableString3), spannableString4);
                                                                        this.messageText = replaceWithLink(emojiStatusUntil != 0 ? AndroidUtilities.replaceCharSequence("%3$s", replaceCharSequence, LocaleController.formatTTLString((int) ((emojiStatusUntil - tL_channelAdminLogEvent2.date) * 1.05f))) : replaceCharSequence, "un1", user3);
                                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                                                                        TLRPC.TL_channelAdminLogEventActionChangeWallpaper tL_channelAdminLogEventActionChangeWallpaper = (TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction;
                                                                        boolean isChannelAndNotMegaGroup5 = ChatObject.isChannelAndNotMegaGroup(chat);
                                                                        TLRPC.WallPaper wallPaper = tL_channelAdminLogEventActionChangeWallpaper.new_value;
                                                                        if ((wallPaper instanceof TLRPC.TL_wallPaperNoFile) && wallPaper.id == 0 && wallPaper.settings == null) {
                                                                            this.messageText = replaceWithLink(LocaleController.getString(isChannelAndNotMegaGroup5 ? R.string.EventLogRemovedWallpaper : R.string.EventLogRemovedWallpaperGroup), "un1", user3);
                                                                        } else {
                                                                            ArrayList<TLRPC.PhotoSize> arrayList9 = new ArrayList<>();
                                                                            this.photoThumbs = arrayList9;
                                                                            TLRPC.Document document = tL_channelAdminLogEventActionChangeWallpaper.new_value.document;
                                                                            if (document != null) {
                                                                                arrayList9.addAll(document.thumbs);
                                                                                this.photoThumbsObject = tL_channelAdminLogEventActionChangeWallpaper.new_value.document;
                                                                            }
                                                                            this.messageText = replaceWithLink(LocaleController.getString(isChannelAndNotMegaGroup5 ? R.string.EventLogChangedWallpaper : R.string.EventLogChangedWallpaperGroup), "un1", user3);
                                                                        }
                                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeBackgroundEmoji) {
                                                                        boolean isChannelAndNotMegaGroup6 = ChatObject.isChannelAndNotMegaGroup(chat);
                                                                        TLRPC.TL_channelAdminLogEventActionChangeBackgroundEmoji tL_channelAdminLogEventActionChangeBackgroundEmoji = (TLRPC.TL_channelAdminLogEventActionChangeBackgroundEmoji) tL_channelAdminLogEvent2.action;
                                                                        this.messageText = replaceWithLink(LocaleController.getString(isChannelAndNotMegaGroup6 ? R.string.EventLogChangedEmoji : R.string.EventLogChangedEmojiGroup), "un1", user3);
                                                                        if (tL_channelAdminLogEventActionChangeBackgroundEmoji.prev_value == 0) {
                                                                            spannableString = new SpannableString(LocaleController.getString(R.string.EventLogEmojiNone));
                                                                        } else {
                                                                            spannableString = new SpannableString("e");
                                                                            spannableString.setSpan(new org.telegram.ui.Components.t5(tL_channelAdminLogEventActionChangeBackgroundEmoji.prev_value, org.telegram.ui.ActionBar.g6.s2.getFontMetricsInt()), 0, 1, 33);
                                                                        }
                                                                        this.messageText = AndroidUtilities.replaceCharSequence("%1$s", this.messageText, spannableString);
                                                                        if (tL_channelAdminLogEventActionChangeBackgroundEmoji.new_value == 0) {
                                                                            spannableString2 = new SpannableString(LocaleController.getString(R.string.EventLogEmojiNone));
                                                                        } else {
                                                                            spannableString2 = new SpannableString("e");
                                                                            spannableString2.setSpan(new org.telegram.ui.Components.t5(tL_channelAdminLogEventActionChangeBackgroundEmoji.new_value, org.telegram.ui.ActionBar.g6.s2.getFontMetricsInt()), 0, 1, 33);
                                                                        }
                                                                        this.messageText = AndroidUtilities.replaceCharSequence("%2$s", this.messageText, spannableString2);
                                                                    } else {
                                                                        this.messageText = "unsupported " + tL_channelAdminLogEvent2.action;
                                                                    }
                                                                }
                                                                chat2 = chat;
                                                            }
                                                        }
                                                        str = str2;
                                                    }
                                                    chat2 = chat;
                                                    str = str2;
                                                }
                                            }
                                            message3 = message;
                                            str = str2;
                                            arrayList4 = null;
                                            if (this.messageOwner == null) {
                                            }
                                            this.messageOwner.message = this.messageText.toString();
                                            this.messageOwner.from_id = new TLRPC.TL_peerUser();
                                            TLRPC.Message message822 = this.messageOwner;
                                            message822.from_id.user_id = tL_channelAdminLogEvent2.user_id;
                                            message822.date = tL_channelAdminLogEvent2.date;
                                            int i2522 = iArr[0];
                                            iArr[0] = i2522 + 1;
                                            message822.id = i2522;
                                            this.eventId = tL_channelAdminLogEvent2.id;
                                            message822.out = false;
                                            message822.peer_id = new TLRPC.TL_peerChannel();
                                            TLRPC.Message message922 = this.messageOwner;
                                            message922.peer_id.channel_id = chat2.id;
                                            message922.unread = false;
                                            MediaController mediaController22 = MediaController.getInstance();
                                            this.isOutOwnerCached = null;
                                            if (message3 instanceof TLRPC.TL_messageEmpty) {
                                            }
                                            if (message3 != null) {
                                            }
                                            iArr2 = null;
                                            if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                                            }
                                        }
                                    }
                                    tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                }
                                tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                chat2 = chat;
                            }
                        }
                        tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                        chat2 = chat;
                        message3 = message4;
                        arrayList4 = null;
                        if (this.messageOwner == null) {
                        }
                        this.messageOwner.message = this.messageText.toString();
                        this.messageOwner.from_id = new TLRPC.TL_peerUser();
                        TLRPC.Message message8222 = this.messageOwner;
                        message8222.from_id.user_id = tL_channelAdminLogEvent2.user_id;
                        message8222.date = tL_channelAdminLogEvent2.date;
                        int i25222 = iArr[0];
                        iArr[0] = i25222 + 1;
                        message8222.id = i25222;
                        this.eventId = tL_channelAdminLogEvent2.id;
                        message8222.out = false;
                        message8222.peer_id = new TLRPC.TL_peerChannel();
                        TLRPC.Message message9222 = this.messageOwner;
                        message9222.peer_id.channel_id = chat2.id;
                        message9222.unread = false;
                        MediaController mediaController222 = MediaController.getInstance();
                        this.isOutOwnerCached = null;
                        if (message3 instanceof TLRPC.TL_messageEmpty) {
                        }
                        if (message3 != null) {
                        }
                        iArr2 = null;
                        if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                        }
                    }
                    message3 = null;
                    arrayList4 = null;
                    if (this.messageOwner == null) {
                    }
                    this.messageOwner.message = this.messageText.toString();
                    this.messageOwner.from_id = new TLRPC.TL_peerUser();
                    TLRPC.Message message82222 = this.messageOwner;
                    message82222.from_id.user_id = tL_channelAdminLogEvent2.user_id;
                    message82222.date = tL_channelAdminLogEvent2.date;
                    int i252222 = iArr[0];
                    iArr[0] = i252222 + 1;
                    message82222.id = i252222;
                    this.eventId = tL_channelAdminLogEvent2.id;
                    message82222.out = false;
                    message82222.peer_id = new TLRPC.TL_peerChannel();
                    TLRPC.Message message92222 = this.messageOwner;
                    message92222.peer_id.channel_id = chat2.id;
                    message92222.unread = false;
                    MediaController mediaController2222 = MediaController.getInstance();
                    this.isOutOwnerCached = null;
                    if (message3 instanceof TLRPC.TL_messageEmpty) {
                    }
                    if (message3 != null) {
                    }
                    iArr2 = null;
                    if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                    }
                }
            }
            str = "";
            if (z16) {
                TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                channelParticipant = tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant;
                channelParticipant2 = tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant;
            } else {
                TLRPC.TL_channelAdminLogEventActionParticipantToggleBan tL_channelAdminLogEventActionParticipantToggleBan3 = (TLRPC.TL_channelAdminLogEventActionParticipantToggleBan) channelAdminLogEventAction;
                channelParticipant = tL_channelAdminLogEventActionParticipantToggleBan3.prev_participant;
                channelParticipant2 = tL_channelAdminLogEventActionParticipantToggleBan3.new_participant;
            }
            TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
            this.messageOwner = tL_message4;
            tL_message4.realId = -1;
            long peerId6 = getPeerId(channelParticipant.peer);
            if (peerId6 > 0) {
                user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId6));
            } else {
                user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(-peerId6));
            }
            if (!(channelParticipant instanceof TLRPC.TL_channelParticipantCreator) && (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator)) {
                String string5 = LocaleController.getString(R.string.EventLogChangedOwnership);
                sb2 = new StringBuilder(String.format(string5, getUserName(user, this.messageOwner.entities, string5.indexOf("%1$s"))));
                chat2 = chat;
            } else {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = channelParticipant.admin_rights;
                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                tL_chatAdminRights = tL_chatAdminRights == null ? new TLRPC.TL_chatAdminRights() : tL_chatAdminRights;
                tL_chatAdminRights2 = tL_chatAdminRights2 == null ? new TLRPC.TL_chatAdminRights() : tL_chatAdminRights2;
                if (tL_chatAdminRights2.other) {
                    string = LocaleController.getString(R.string.EventLogPromotedNoRights);
                } else {
                    string = LocaleController.getString(R.string.EventLogPromoted);
                }
                StringBuilder sb6 = new StringBuilder(String.format(string, getUserName(user, this.messageOwner.entities, string.indexOf("%1$s"))));
                sb6.append("\n");
                if (!TextUtils.equals(channelParticipant.rank, channelParticipant2.rank)) {
                    if (TextUtils.isEmpty(channelParticipant2.rank)) {
                        sb6.append("\n- ");
                        sb6.append(LocaleController.getString(R.string.EventLogPromotedRemovedTitle));
                    } else {
                        sb6.append("\n+ ");
                        sb6.append(LocaleController.formatString("EventLogPromotedTitle", R.string.EventLogPromotedTitle, channelParticipant2.rank));
                    }
                }
                if (tL_chatAdminRights.change_info != tL_chatAdminRights2.change_info) {
                    sb6.append('\n');
                    sb6.append(tL_chatAdminRights2.change_info ? '+' : '-');
                    sb6.append(' ');
                    chat2 = chat;
                    sb6.append(LocaleController.getString(chat2.megagroup ? R.string.EventLogPromotedChangeGroupInfo : R.string.EventLogPromotedChangeChannelInfo));
                } else {
                    chat2 = chat;
                }
                if (!chat2.megagroup) {
                    if (tL_chatAdminRights.post_messages != tL_chatAdminRights2.post_messages) {
                        sb6.append('\n');
                        sb6.append(tL_chatAdminRights2.post_messages ? '+' : '-');
                        sb6.append(' ');
                        sb6.append(LocaleController.getString(R.string.EventLogPromotedPostMessages));
                    }
                    if (tL_chatAdminRights.edit_messages != tL_chatAdminRights2.edit_messages) {
                        sb6.append('\n');
                        sb6.append(tL_chatAdminRights2.edit_messages ? '+' : '-');
                        sb6.append(' ');
                        sb6.append(LocaleController.getString(R.string.EventLogPromotedEditMessages));
                    }
                }
                if (tL_chatAdminRights.post_stories != tL_chatAdminRights2.post_stories) {
                    sb6.append('\n');
                    sb6.append(tL_chatAdminRights2.post_stories ? '+' : '-');
                    sb6.append(' ');
                    sb6.append(LocaleController.getString(R.string.EventLogPromotedPostStories));
                }
                if (tL_chatAdminRights.edit_stories != tL_chatAdminRights2.edit_stories) {
                    sb6.append('\n');
                    sb6.append(tL_chatAdminRights2.edit_stories ? '+' : '-');
                    sb6.append(' ');
                    sb6.append(LocaleController.getString(R.string.EventLogPromotedEditStories));
                }
                if (tL_chatAdminRights.delete_stories != tL_chatAdminRights2.delete_stories) {
                    sb6.append('\n');
                    sb6.append(tL_chatAdminRights2.delete_stories ? '+' : '-');
                    sb6.append(' ');
                    sb6.append(LocaleController.getString(R.string.EventLogPromotedDeleteStories));
                }
                if (tL_chatAdminRights.delete_messages != tL_chatAdminRights2.delete_messages) {
                    sb6.append('\n');
                    sb6.append(tL_chatAdminRights2.delete_messages ? '+' : '-');
                    sb6.append(' ');
                    sb6.append(LocaleController.getString(R.string.EventLogPromotedDeleteMessages));
                }
                if (tL_chatAdminRights.add_admins != tL_chatAdminRights2.add_admins) {
                    sb6.append('\n');
                    sb6.append(tL_chatAdminRights2.add_admins ? '+' : '-');
                    sb6.append(' ');
                    sb6.append(LocaleController.getString(R.string.EventLogPromotedAddAdmins));
                }
                if (tL_chatAdminRights.anonymous != tL_chatAdminRights2.anonymous) {
                    sb6.append('\n');
                    sb6.append(tL_chatAdminRights2.anonymous ? '+' : '-');
                    sb6.append(' ');
                    sb6.append(LocaleController.getString(R.string.EventLogPromotedSendAnonymously));
                }
                if (chat2.megagroup) {
                    if (tL_chatAdminRights.ban_users != tL_chatAdminRights2.ban_users) {
                        sb6.append('\n');
                        sb6.append(tL_chatAdminRights2.ban_users ? '+' : '-');
                        sb6.append(' ');
                        sb6.append(LocaleController.getString(R.string.EventLogPromotedBanUsers));
                    }
                    if (tL_chatAdminRights.manage_call != tL_chatAdminRights2.manage_call) {
                        sb6.append('\n');
                        sb6.append(tL_chatAdminRights2.manage_call ? '+' : '-');
                        sb6.append(' ');
                        sb6.append(LocaleController.getString(R.string.EventLogPromotedManageCall));
                    }
                }
                if (tL_chatAdminRights.invite_users != tL_chatAdminRights2.invite_users) {
                    sb6.append('\n');
                    sb6.append(tL_chatAdminRights2.invite_users ? '+' : '-');
                    sb6.append(' ');
                    sb6.append(LocaleController.getString(R.string.EventLogPromotedAddUsers));
                }
                if (chat2.megagroup) {
                    if (tL_chatAdminRights.pin_messages != tL_chatAdminRights2.pin_messages) {
                        sb6.append('\n');
                        sb6.append(tL_chatAdminRights2.pin_messages ? '+' : '-');
                        sb6.append(' ');
                        sb6.append(LocaleController.getString(R.string.EventLogPromotedPinMessages));
                    }
                    if (tL_chatAdminRights.manage_ranks != tL_chatAdminRights2.manage_ranks) {
                        sb6.append('\n');
                        sb6.append(tL_chatAdminRights2.manage_ranks ? '+' : '-');
                        sb6.append(' ');
                        sb6.append(LocaleController.getString(R.string.EventLogPromotedEditRanks));
                    }
                    if (tL_chatAdminRights.manage_topics != tL_chatAdminRights2.manage_topics) {
                        sb6.append('\n');
                        sb6.append(tL_chatAdminRights2.manage_topics ? '+' : '-');
                        sb6.append(' ');
                        sb6.append(LocaleController.getString(R.string.EventLogPromotedManageTopics));
                    }
                }
                if (tL_chatAdminRights.manage_direct_messages != tL_chatAdminRights2.manage_direct_messages) {
                    sb6.append('\n');
                    sb6.append(tL_chatAdminRights2.manage_direct_messages ? '+' : '-');
                    sb6.append(' ');
                    sb6.append(LocaleController.getString(R.string.EventLogPromotedManageDirect));
                }
                if (tL_chatAdminRights.manage_welcome_messages != tL_chatAdminRights2.manage_welcome_messages) {
                    sb6.append('\n');
                    sb6.append(tL_chatAdminRights2.manage_welcome_messages ? '+' : '-');
                    sb6.append(' ');
                    sb6.append(LocaleController.getString(R.string.EventLogPromotedManageWelcomeMessages));
                }
                sb2 = sb6;
            }
            this.messageText = sb2.toString();
            message3 = null;
            arrayList4 = null;
            if (this.messageOwner == null) {
            }
            this.messageOwner.message = this.messageText.toString();
            this.messageOwner.from_id = new TLRPC.TL_peerUser();
            TLRPC.Message message822222 = this.messageOwner;
            message822222.from_id.user_id = tL_channelAdminLogEvent2.user_id;
            message822222.date = tL_channelAdminLogEvent2.date;
            int i2522222 = iArr[0];
            iArr[0] = i2522222 + 1;
            message822222.id = i2522222;
            this.eventId = tL_channelAdminLogEvent2.id;
            message822222.out = false;
            message822222.peer_id = new TLRPC.TL_peerChannel();
            TLRPC.Message message922222 = this.messageOwner;
            message922222.peer_id.channel_id = chat2.id;
            message922222.unread = false;
            MediaController mediaController22222 = MediaController.getInstance();
            this.isOutOwnerCached = null;
            if (message3 instanceof TLRPC.TL_messageEmpty) {
            }
            if (message3 != null) {
            }
            iArr2 = null;
            if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
            }
        }
        str = "";
        chat2 = chat;
        message3 = null;
        arrayList4 = null;
        if (this.messageOwner == null) {
        }
        this.messageOwner.message = this.messageText.toString();
        this.messageOwner.from_id = new TLRPC.TL_peerUser();
        TLRPC.Message message8222222 = this.messageOwner;
        message8222222.from_id.user_id = tL_channelAdminLogEvent2.user_id;
        message8222222.date = tL_channelAdminLogEvent2.date;
        int i25222222 = iArr[0];
        iArr[0] = i25222222 + 1;
        message8222222.id = i25222222;
        this.eventId = tL_channelAdminLogEvent2.id;
        message8222222.out = false;
        message8222222.peer_id = new TLRPC.TL_peerChannel();
        TLRPC.Message message9222222 = this.messageOwner;
        message9222222.peer_id.channel_id = chat2.id;
        message9222222.unread = false;
        MediaController mediaController222222 = MediaController.getInstance();
        this.isOutOwnerCached = null;
        if (message3 instanceof TLRPC.TL_messageEmpty) {
        }
        if (message3 != null) {
        }
        iArr2 = null;
        if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
        }
    }
}
