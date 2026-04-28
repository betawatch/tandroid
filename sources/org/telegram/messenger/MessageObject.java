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
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.StringReader;
import java.net.URLEncoder;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
import me.vkryl.core.BitwiseUtils;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.ringtone.RingtoneDataStore;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.EllipsizeSpanAnimator;
import org.telegram.ui.Components.FormattedDateSpan;
import org.telegram.ui.Components.Forum.ForumBubbleDrawable;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.QuoteSpan;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.Reactions.ReactionsUtils;
import org.telegram.ui.Components.SquigglyLinesSpan;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.TranscribeButton;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.URLSpanBotCommand;
import org.telegram.ui.Components.URLSpanBrowser;
import org.telegram.ui.Components.URLSpanMono;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.URLSpanNoUnderlineBold;
import org.telegram.ui.Components.URLSpanReplacement;
import org.telegram.ui.Components.URLSpanUserMention;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Components.WebPlayerView;
import org.telegram.ui.Components.poll.PollAttachedMediaPack;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PeerColorActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.web.BotWebViewContainer;

/* loaded from: classes3.dex */
public class MessageObject {
    public static final int ENTITIES_ALL = 0;
    public static final int ENTITIES_ONLY_HASHTAGS = 1;
    private static final int LINES_PER_BLOCK = 10;
    private static final int LINES_PER_BLOCK_WITH_EMOJI = 5;
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
    public VideoPlayer.VideoUri cachedQuality;
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
    public VideoPlayer.VideoUri highestQuality;
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
    public StoriesController.StoriesList parentStoriesList;
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
    public VideoPlayer.VideoUri thumbQuality;
    public Drawable[] topicIconDrawable;
    public int totalAnimatedEmojiCount;
    public boolean translated;
    public int type;
    public StoriesController.UploadingStory uploadingStory;
    public boolean useCustomPhoto;
    public CharSequence vCardData;
    public VideoEditedInfo videoEditedInfo;
    public ArrayList<VideoPlayer.Quality> videoQualities;
    private Boolean videoQualitiesCached;
    public boolean viewsReloaded;
    public int wantedBotKeyboardWidth;
    public boolean wasJustSent;
    public boolean wasUnread;
    public ArrayList<TLRPC.MessageEntity> webPageDescriptionEntities;
    public CharSequence youtubeDescription;

    public static class SendAnimationData {
        public float currentScale;
        public float currentX;
        public float currentY;
        public ChatMessageCell.TransitionParams fromParams;
        public boolean fromPreview;
        public float height;
        public float progress;
        public float timeAlpha;
        public float width;
        public float x;
        public float y;
    }

    public static void addPhoneLinks(CharSequence charSequence) {
    }

    public void checkForScam() {
    }

    @Deprecated
    public void generateSuggestionApprovalMessageText() {
    }

    public float getProgress() {
        return 0.0f;
    }

    public boolean shouldDrawReactionsInLayout() {
        return true;
    }

    public int getChatMode() {
        if (this.scheduled) {
            return 1;
        }
        return isQuickReply() ? 5 : 0;
    }

    public static boolean hasUnreadReactions(TLRPC.Message message) {
        if (message == null) {
            return false;
        }
        return hasUnreadReactions(message.reactions);
    }

    public static boolean hasUnreadReactions(TLRPC.TL_messageReactions tL_messageReactions) {
        if (tL_messageReactions == null) {
            return false;
        }
        for (int i = 0; i < tL_messageReactions.recent_reactions.size(); i++) {
            if (tL_messageReactions.recent_reactions.get(i).unread) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPremiumSticker(TLRPC.Document document) {
        if (document != null && document.thumbs != null) {
            for (int i = 0; i < document.video_thumbs.size(); i++) {
                if ("f".equals(document.video_thumbs.get(i).type)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static long getTopicId(MessageObject messageObject) {
        if (messageObject == null) {
            return 0L;
        }
        return getTopicId(messageObject.currentAccount, messageObject.messageOwner, false);
    }

    private static long getTopicId(int i, TLRPC.Message message) {
        return getTopicId(i, message, false);
    }

    public long getMonoForumTopicId() {
        return getMonoForumTopicId(this.messageOwner);
    }

    public static long getMonoForumTopicId(TLRPC.Message message) {
        TLRPC.Peer peer;
        if (message == null || (peer = message.saved_peer_id) == null) {
            return 0L;
        }
        long j = peer.chat_id;
        if (j != 0) {
            return -j;
        }
        long j2 = peer.channel_id;
        return j2 != 0 ? -j2 : peer.user_id;
    }

    public long getTopicId() {
        return getTopicId(this.currentAccount, this.messageOwner, getForumFlags(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-getDialogId())), MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(getDialogId()))));
    }

    private static int getForumFlags(TLRPC.Chat chat, TLRPC.User user) {
        return BitwiseUtils.setFlag(BitwiseUtils.setFlag(BitwiseUtils.setFlag(0, 1, ChatObject.isForum(chat)), 4, ChatObject.isMonoForum(chat)), 8, UserObject.isBotForum(user));
    }

    public static long getTopicId(int i, TLRPC.Message message, int i2) {
        long topicId = getTopicId(i, message, BitwiseUtils.hasFlag(i2, 1), BitwiseUtils.hasFlag(i2, 4));
        if (topicId == 0 && BitwiseUtils.hasFlag(i2, 8)) {
            return -1L;
        }
        return topicId;
    }

    @Deprecated
    public static long getTopicId(int i, TLRPC.Message message, boolean z) {
        return getTopicId(i, message, z, false);
    }

    @Deprecated
    private static long getTopicId(int i, TLRPC.Message message, boolean z, boolean z2) {
        int i2;
        long clientUserId = UserConfig.getInstance(i).getClientUserId();
        if (z2) {
            return getMonoForumTopicId(message);
        }
        if ((message.flags & TLObject.FLAG_30) != 0 && DialogObject.getPeerDialogId(message.peer_id) == clientUserId) {
            i2 = message.quick_reply_shortcut_id;
        } else {
            if (!z && i >= 0 && DialogObject.getPeerDialogId(message.peer_id) == clientUserId) {
                return getSavedDialogId(clientUserId, message);
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionTopicCreate) {
                i2 = message.id;
            } else {
                TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
                if (messageReplyHeader == null || !messageReplyHeader.forum_topic) {
                    return z ? 1L : 0L;
                }
                if ((message instanceof TLRPC.TL_messageService) && !(messageAction instanceof TLRPC.TL_messageActionPinMessage)) {
                    int i3 = messageReplyHeader.reply_to_msg_id;
                    if (i3 == 0) {
                        i3 = messageReplyHeader.reply_to_top_id;
                    }
                    return i3;
                }
                int i4 = messageReplyHeader.reply_to_top_id;
                if (i4 == 0) {
                    i4 = messageReplyHeader.reply_to_msg_id;
                }
                return i4;
            }
        }
        return i2;
    }

    public static boolean isTopicActionMessage(MessageObject messageObject) {
        TLRPC.Message message;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        return (messageAction instanceof TLRPC.TL_messageActionTopicCreate) || (messageAction instanceof TLRPC.TL_messageActionTopicEdit);
    }

    public static boolean canCreateStripedThubms() {
        return SharedConfig.getDevicePerformanceClass() == 2;
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

    public static double getDocumentDuration(TLRPC.Document document) {
        if (document == null) {
            return 0.0d;
        }
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return documentAttribute.duration;
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                return documentAttribute.duration;
            }
        }
        return 0.0d;
    }

    public static int getVideoWidth(TLRPC.Document document) {
        if (document == null) {
            return 0;
        }
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return documentAttribute.w;
            }
        }
        return 0;
    }

    public static int getVideoHeight(TLRPC.Document document) {
        if (document == null) {
            return 0;
        }
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return documentAttribute.h;
            }
        }
        return 0;
    }

    public static String getVideoCodec(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return ((TLRPC.TL_documentAttributeVideo) documentAttribute).video_codec;
            }
        }
        return null;
    }

    public boolean isWallpaperAction() {
        TLRPC.Message message;
        return this.type == 22 || ((message = this.messageOwner) != null && (message.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper));
    }

    public boolean isWallpaperForBoth() {
        TLRPC.Message message;
        if (isWallpaperAction() && (message = this.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if ((messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) && ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).for_both) {
                return true;
            }
        }
        return false;
    }

    public boolean isCurrentWallpaper() {
        TLRPC.Message message;
        TLRPC.MessageAction messageAction;
        TLRPC.UserFull userFull;
        TLRPC.WallPaper wallPaper;
        return (!isWallpaperAction() || (message = this.messageOwner) == null || (messageAction = message.action) == null || messageAction.wallpaper == null || (userFull = MessagesController.getInstance(this.currentAccount).getUserFull(getDialogId())) == null || (wallPaper = userFull.wallpaper) == null || !userFull.wallpaper_overridden || this.messageOwner.action.wallpaper.id != wallPaper.id) ? false : true;
    }

    public int getEmojiOnlyCount() {
        return this.emojiOnlyCount;
    }

    public boolean hasMediaSpoilers() {
        TLRPC.MessageMedia messageMedia;
        return (!this.isRepostPreview && (((messageMedia = this.messageOwner.media) != null && messageMedia.spoiler) || needDrawBluredPreview())) || isHiddenSensitive();
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
            for (int i = 0; i < this.messageOwner.restriction_reason.size(); i++) {
                TLRPC.RestrictionReason restrictionReason = this.messageOwner.restriction_reason.get(i);
                if ("sensitive".equals(restrictionReason.reason) && ("all".equals(restrictionReason.platform) || (("android".equals(restrictionReason.platform) && ((!ApplicationLoader.isStandaloneBuild() && !BuildVars.isBetaApp()) || BuildVars.DEBUG_PRIVATE_VERSION)) || "android-all".equals(restrictionReason.platform)))) {
                    this.isSensitiveCached = Boolean.TRUE;
                    return true;
                }
            }
        }
        if (getDialogId() < 0 && (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-getDialogId()))) != null && chat.restriction_reason != null) {
            for (int i2 = 0; i2 < chat.restriction_reason.size(); i2++) {
                TLRPC.RestrictionReason restrictionReason2 = chat.restriction_reason.get(i2);
                if ("sensitive".equals(restrictionReason2.reason) && ("all".equals(restrictionReason2.platform) || (("android".equals(restrictionReason2.platform) && ((!ApplicationLoader.isStandaloneBuild() && !BuildVars.isBetaApp()) || BuildVars.DEBUG_PRIVATE_VERSION)) || "android-all".equals(restrictionReason2.platform)))) {
                    this.isSensitiveCached = Boolean.TRUE;
                    return true;
                }
            }
        }
        this.isSensitiveCached = Boolean.FALSE;
        return false;
    }

    public boolean isHiddenSensitive() {
        return isSensitive() && !MessagesController.getInstance(this.currentAccount).showSensitiveContent();
    }

    public boolean canBeSensitive() {
        int i;
        return (this.messageOwner == null || ((i = this.type) != 1 && i != 3 && i != 9 && i != 8 && i != 5) || this.sendPreview || this.isRepostPreview || isOutOwner() || this.messageOwner.send_state != 0) ? false : true;
    }

    public boolean shouldDrawReactions() {
        return !this.isRepostPreview;
    }

    public TLRPC.MessagePeerReaction getRandomUnreadReaction() {
        ArrayList<TLRPC.MessagePeerReaction> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions = this.messageOwner.reactions;
        if (tL_messageReactions == null || (arrayList = tL_messageReactions.recent_reactions) == null || arrayList.isEmpty()) {
            return null;
        }
        return this.messageOwner.reactions.recent_reactions.get(0);
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
        boolean z = false;
        for (int i = 0; i < this.messageOwner.reactions.recent_reactions.size(); i++) {
            if (this.messageOwner.reactions.recent_reactions.get(i).unread) {
                this.messageOwner.reactions.recent_reactions.get(i).unread = false;
                z = true;
            }
        }
        if (z) {
            MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            TLRPC.Message message = this.messageOwner;
            messagesStorage.markMessageReactionsAsRead(message.dialog_id, getTopicId(this.currentAccount, message), this.messageOwner.id);
        }
    }

    public boolean isPremiumSticker() {
        if (getMedia(this.messageOwner) == null || !getMedia(this.messageOwner).nopremium) {
            return isPremiumSticker(getDocument());
        }
        return false;
    }

    public TLRPC.VideoSize getPremiumStickerAnimation() {
        return getPremiumStickerAnimation(getDocument());
    }

    public static TLRPC.VideoSize getPremiumStickerAnimation(TLRPC.Document document) {
        if (document != null && document.thumbs != null) {
            for (int i = 0; i < document.video_thumbs.size(); i++) {
                if ("f".equals(document.video_thumbs.get(i).type)) {
                    return document.video_thumbs.get(i);
                }
            }
        }
        return null;
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
        if (tL_messageReactions2 != null && (arrayList2 = tL_messageReactions2.results) != null && !arrayList2.isEmpty() && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
            for (int i = 0; i < this.messageOwner.reactions.results.size(); i++) {
                TLRPC.ReactionCount reactionCount = this.messageOwner.reactions.results.get(i);
                for (int i2 = 0; i2 < messageObject.messageOwner.reactions.results.size(); i2++) {
                    TLRPC.ReactionCount reactionCount2 = messageObject.messageOwner.reactions.results.get(i2);
                    if (ReactionsLayoutInBubble.equalsTLReaction(reactionCount.reaction, reactionCount2.reaction)) {
                        reactionCount.lastDrawnPosition = reactionCount2.lastDrawnPosition;
                    }
                }
            }
        }
        boolean z = messageObject.isSpoilersRevealed;
        this.isSpoilersRevealed = z;
        TLRPC.Message message2 = this.messageOwner;
        TLRPC.Message message3 = messageObject.messageOwner;
        message2.replyStory = message3.replyStory;
        TLRPC.MessageMedia messageMedia2 = message2.media;
        if (messageMedia2 != null && (messageMedia = message3.media) != null) {
            messageMedia2.storyItem = messageMedia.storyItem;
        }
        if (!z || (arrayList = this.textLayoutBlocks) == null) {
            return;
        }
        Iterator<TextLayoutBlock> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().spoilers.clear();
        }
    }

    public ArrayList<ReactionsLayoutInBubble.VisibleReaction> getChoosenReactions() {
        ArrayList<ReactionsLayoutInBubble.VisibleReaction> arrayList = new ArrayList<>();
        if (this.messageOwner.reactions == null) {
            return arrayList;
        }
        for (int i = 0; i < this.messageOwner.reactions.results.size(); i++) {
            if (this.messageOwner.reactions.results.get(i).chosen) {
                arrayList.add(ReactionsLayoutInBubble.VisibleReaction.fromTL(this.messageOwner.reactions.results.get(i).reaction));
            }
        }
        return arrayList;
    }

    public boolean isReplyToStory() {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        MessageObject messageObject = this.replyMessageObject;
        return ((messageObject != null && (messageObject.messageOwner instanceof TLRPC.TL_messageEmpty)) || (messageReplyHeader = (message = this.messageOwner).reply_to) == null || messageReplyHeader.story_id == 0 || (message.flags & 8) == 0) ? false : true;
    }

    public boolean isUnsupported() {
        return getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaUnsupported;
    }

    public boolean isExpiredStory() {
        int i = this.type;
        return (i == 23 || i == 24) && (this.messageOwner.media.storyItem instanceof TL_stories.TL_storyItemDeleted);
    }

    public static class VCardData {
        private String company;
        private ArrayList<String> emails = new ArrayList<>();
        private ArrayList<String> phones = new ArrayList<>();

        public static CharSequence parse(String str) {
            String[] strArr;
            byte[] decodeQuotedPrintable;
            try {
                BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
                boolean z = false;
                VCardData vCardData = null;
                String str2 = null;
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (!readLine.startsWith("PHOTO")) {
                            if (readLine.indexOf(58) >= 0) {
                                if (readLine.startsWith("BEGIN:VCARD")) {
                                    vCardData = new VCardData();
                                } else if (readLine.startsWith("END:VCARD") && vCardData != null) {
                                    z = true;
                                }
                            }
                            if (str2 != null) {
                                readLine = str2 + readLine;
                                str2 = null;
                            }
                            if (readLine.contains("=QUOTED-PRINTABLE") && readLine.endsWith("=")) {
                                str2 = readLine.substring(0, readLine.length() - 1);
                            } else {
                                int indexOf = readLine.indexOf(":");
                                if (indexOf >= 0) {
                                    strArr = new String[]{readLine.substring(0, indexOf), readLine.substring(indexOf + 1).trim()};
                                } else {
                                    strArr = new String[]{readLine.trim()};
                                }
                                int i = 2;
                                if (strArr.length >= 2 && vCardData != null) {
                                    if (strArr[0].startsWith("ORG")) {
                                        String[] split = strArr[0].split(";");
                                        int length = split.length;
                                        int i2 = 0;
                                        String str3 = null;
                                        String str4 = null;
                                        while (i2 < length) {
                                            String[] split2 = split[i2].split("=");
                                            if (split2.length == i) {
                                                if (split2[0].equals("CHARSET")) {
                                                    str4 = split2[1];
                                                } else if (split2[0].equals("ENCODING")) {
                                                    str3 = split2[1];
                                                }
                                            }
                                            i2++;
                                            i = 2;
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
                            }
                        }
                    } else {
                        try {
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                }
                bufferedReader.close();
                if (!z) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < vCardData.phones.size(); i3++) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    String str6 = vCardData.phones.get(i3);
                    if (!str6.contains("#") && !str6.contains("*")) {
                        sb.append(PhoneFormat.getInstance().format(str6));
                    }
                    sb.append(str6);
                }
                for (int i4 = 0; i4 < vCardData.emails.size(); i4++) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(PhoneFormat.getInstance().format(vCardData.emails.get(i4)));
                }
                if (!TextUtils.isEmpty(vCardData.company)) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(vCardData.company);
                }
                return sb;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static boolean expandedQuotesEquals(HashSet<Integer> hashSet, HashSet<Integer> hashSet2) {
        if (hashSet == null && hashSet2 == null) {
            return true;
        }
        return (hashSet == null ? 0 : hashSet.size()) == (hashSet2 == null ? 0 : hashSet2.size()) && hashSet != null && hashSet.equals(hashSet2);
    }

    public static class TextLayoutBlock {
        public static final int FLAG_NOT_RTL = 2;
        public static final int FLAG_RTL = 1;
        public int charactersEnd;
        public int charactersOffset;
        public boolean code;
        public ButtonBounce collapsedBounce;
        public int collapsedHeight;
        public Drawable copyIcon;
        public int copyIconColor;
        public Drawable copySelector;
        public int copySelectorColor;
        public Paint copySeparator;
        public Text copyText;
        public byte directionFlags;
        public boolean first;
        public boolean hasCodeCopyButton;
        public int height;
        public int heightByOffset;
        public int index;
        public String language;
        public int languageHeight;
        public Text languageLayout;
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
        public List<SpoilerEffect> spoilers = new ArrayList();

        public int heightCollapsed() {
            return this.quoteCollapse ? this.collapsedHeight : this.height;
        }

        public int height() {
            return (this.quoteCollapse && collapsed()) ? this.collapsedHeight : this.height;
        }

        public int height(ChatMessageCell.TransitionParams transitionParams) {
            if (!this.quoteCollapse) {
                return this.height;
            }
            return AndroidUtilities.lerp(this.height, this.collapsedHeight, collapsed(transitionParams));
        }

        public float collapsed(ChatMessageCell.TransitionParams transitionParams) {
            boolean collapsed;
            if (transitionParams.animateExpandedQuotes) {
                HashSet hashSet = transitionParams.animateExpandedQuotesFrom;
                collapsed = hashSet == null || !hashSet.contains(Integer.valueOf(this.index));
            } else {
                collapsed = collapsed();
            }
            return AndroidUtilities.lerp(collapsed ? 1.0f : 0.0f, collapsed() ? 1.0f : 0.0f, transitionParams.animateChangeProgress);
        }

        public boolean collapsed() {
            HashSet<Integer> hashSet;
            MessageObject messageObject = this.messageObject;
            return messageObject == null || (hashSet = messageObject.expandedQuotes) == null || !hashSet.contains(Integer.valueOf(this.index));
        }

        public float textYOffset(ArrayList<TextLayoutBlock> arrayList) {
            TextLayoutBlock textLayoutBlock;
            if (arrayList == null) {
                return 0.0f;
            }
            int i = 0;
            for (int i2 = 0; i2 < arrayList.size() && (textLayoutBlock = arrayList.get(i2)) != this; i2++) {
                i += textLayoutBlock.padTop + textLayoutBlock.height() + textLayoutBlock.padBottom;
            }
            return i;
        }

        public float textYOffset(ArrayList<TextLayoutBlock> arrayList, ChatMessageCell.TransitionParams transitionParams) {
            TextLayoutBlock textLayoutBlock;
            if (arrayList == null) {
                return 0.0f;
            }
            int i = 0;
            for (int i2 = 0; i2 < arrayList.size() && (textLayoutBlock = arrayList.get(i2)) != this; i2++) {
                i += textLayoutBlock.padTop + textLayoutBlock.height(transitionParams) + textLayoutBlock.padBottom;
            }
            return i;
        }

        public void layoutCode(String str, int i, boolean z) {
            boolean z2 = i >= 75 && !z;
            this.hasCodeCopyButton = z2;
            if (z2) {
                this.copyText = new Text(LocaleController.getString(R.string.CopyCode).toUpperCase(), SharedConfig.fontSize - 3, AndroidUtilities.bold());
                Drawable mutate = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_copy).mutate();
                this.copyIcon = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(this.copyIconColor, PorterDuff.Mode.SRC_IN));
                this.copySelector = Theme.createRadSelectorDrawable(this.copySelectorColor, 0, 0, Math.min(5, SharedConfig.bubbleRadius), 0);
                this.copySeparator = new Paint(1);
            }
            if (TextUtils.isEmpty(str)) {
                this.language = null;
                this.languageLayout = null;
            } else {
                this.language = str;
                Text text = new Text(capitalizeLanguage(str), (SharedConfig.fontSize - 1) - (CodeHighlighting.getTextSizeDecrement(i) / 2), AndroidUtilities.bold());
                this.languageLayout = text;
                this.languageHeight = ((int) (text.getTextSize() * 1.714f)) + AndroidUtilities.dp(4.0f);
            }
        }

        public void drawCopyCodeButton(Canvas canvas, RectF rectF, int i, int i2, float f) {
            if (this.hasCodeCopyButton) {
                int multAlpha = Theme.multAlpha(i, 0.1f);
                if (this.copySelectorColor != multAlpha) {
                    Drawable drawable = this.copySelector;
                    this.copySelectorColor = multAlpha;
                    Theme.setSelectorDrawableColor(drawable, multAlpha, true);
                }
                this.copySelector.setBounds(((int) rectF.left) + AndroidUtilities.dp(3.0f), (int) (rectF.bottom - AndroidUtilities.dp(38.0f)), (int) rectF.right, (int) rectF.bottom);
                int i3 = (int) (255.0f * f);
                this.copySelector.setAlpha(i3);
                if (this.copySelector.getCallback() != null) {
                    this.copySelector.draw(canvas);
                }
                this.copySeparator.setColor(ColorUtils.setAlphaComponent(i2, 38));
                canvas.drawRect(AndroidUtilities.dp(10.0f) + rectF.left, (rectF.bottom - AndroidUtilities.dp(38.0f)) - AndroidUtilities.getShadowHeight(), rectF.right - AndroidUtilities.dp(6.66f), rectF.bottom - AndroidUtilities.dp(38.0f), this.copySeparator);
                float centerX = rectF.centerX() - (Math.min(rectF.width() - AndroidUtilities.dp(12.0f), ((this.copyIcon.getIntrinsicWidth() * 0.8f) + AndroidUtilities.dp(5.0f)) + this.copyText.getCurrentWidth()) / 2.0f);
                float dp = rectF.bottom - (AndroidUtilities.dp(38.0f) / 2.0f);
                if (this.copyIconColor != i) {
                    Drawable drawable2 = this.copyIcon;
                    this.copyIconColor = i;
                    drawable2.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                }
                this.copyIcon.setAlpha(i3);
                this.copyIcon.setBounds((int) centerX, (int) (dp - ((r10.getIntrinsicHeight() * 0.8f) / 2.0f)), (int) ((this.copyIcon.getIntrinsicWidth() * 0.8f) + centerX), (int) (((this.copyIcon.getIntrinsicHeight() * 0.8f) / 2.0f) + dp));
                this.copyIcon.draw(canvas);
                this.copyText.ellipsize(((int) (r1 - ((this.copyIcon.getIntrinsicWidth() * 0.8f) + AndroidUtilities.dp(5.0f)))) + AndroidUtilities.dp(12.0f)).draw(canvas, centerX + (this.copyIcon.getIntrinsicWidth() * 0.8f) + AndroidUtilities.dp(5.0f), dp, i, f);
            }
        }

        private static String capitalizeLanguage(String str) {
            if (str == null) {
                return null;
            }
            String replaceAll = str.toLowerCase().replaceAll("\\W|lang$", "");
            replaceAll.hashCode();
            switch (replaceAll) {
                case "actionscript":
                    return "ActionScript";
                case "aspnet":
                    return "ASP.NET";
                case "csharp":
                case "cs":
                    return "C#";
                case "docker":
                case "dockerfile":
                case "kotlin":
                case "pascal":
                case "arduino":
                case "c":
                case "go":
                case "lua":
                case "dart":
                case "fift":
                case "java":
                case "rust":
                case "swift":
                    return capitalizeFirst(str);
                case "python":
                case "py":
                    return "Python";
                case "typescript":
                case "ts":
                    return "TypeScript";
                case "r":
                case "tl":
                case "asm":
                case "css":
                case "csv":
                case "ini":
                case "jsx":
                case "php":
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
                case "scss":
                case "wasm":
                case "yaml":
                case "cobol":
                case "json5":
                    return str.toUpperCase();
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
                case "autohotkey":
                    return "AutoHotKey";
                default:
                    return str;
            }
        }

        private static String capitalizeFirst(String str) {
            return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        }

        public boolean isRtl() {
            byte b = this.directionFlags;
            return (b & 1) != 0 && (b & 2) == 0;
        }
    }

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

        public void set(int i, int i2, int i3, int i4, int i5, float f, int i6) {
            this.minX = (byte) i;
            this.maxX = (byte) i2;
            this.minY = (byte) i3;
            this.maxY = (byte) i4;
            this.pw = i5;
            this.spanSize = i5;
            this.ph = f;
            this.flags = (byte) i6;
        }
    }

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
        public LongSparseArray positionsArray = new LongSparseArray();
        public int cachedWidthForCaption = -1;
        private int maxSizeWidth = 800;
        public final TransitionParams transitionParams = new TransitionParams();

        public GroupedMessagePosition getPosition(MessageObject messageObject) {
            if (messageObject == null) {
                return null;
            }
            GroupedMessagePosition groupedMessagePosition = this.positions.get(messageObject);
            return groupedMessagePosition == null ? (GroupedMessagePosition) this.positionsArray.get(messageObject.getId()) : groupedMessagePosition;
        }

        private static class MessageGroupedLayoutAttempt {
            public float[] heights;
            public int[] lineCounts;

            public MessageGroupedLayoutAttempt(int i, int i2, float f, float f2) {
                this.lineCounts = new int[]{i, i2};
                this.heights = new float[]{f, f2};
            }

            public MessageGroupedLayoutAttempt(int i, int i2, int i3, float f, float f2, float f3) {
                this.lineCounts = new int[]{i, i2, i3};
                this.heights = new float[]{f, f2, f3};
            }

            public MessageGroupedLayoutAttempt(int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
                this.lineCounts = new int[]{i, i2, i3, i4};
                this.heights = new float[]{f, f2, f3, f4};
            }
        }

        private float multiHeight(float[] fArr, int i, int i2) {
            float f = 0.0f;
            while (i < i2) {
                f += fArr[i];
                i++;
            }
            return this.maxSizeWidth / f;
        }

        /* JADX WARN: Code restructure failed: missing block: B:302:0x07b3, code lost:
        
            if (r15[2] > r15[3]) goto L251;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x00ac, code lost:
        
            if ((org.telegram.messenger.MessageObject.getMedia(r15.messageOwner) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) == false) goto L44;
         */
        /* JADX WARN: Removed duplicated region for block: B:119:0x086d  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0153  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x006b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void calculate() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            MessageObject messageObject;
            int i7;
            TLRPC.Message message;
            float f;
            float f2;
            Boolean bool;
            this.posArray.clear();
            this.positions.clear();
            this.positionsArray.clear();
            Boolean bool2 = null;
            this.captionMessage = null;
            this.maxSizeWidth = 800;
            int size = this.messages.size();
            if (size == 1) {
                this.captionMessage = this.messages.get(0);
                return;
            }
            if (size < 1) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            this.hasSibling = false;
            this.hasCaption = false;
            this.captionAbove = false;
            int i8 = this.reversed ? size - 1 : 0;
            boolean z = false;
            float f3 = 1.0f;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = true;
            while (true) {
                if (this.reversed) {
                    if (i8 < 0) {
                        break;
                    }
                    messageObject = this.messages.get(i8);
                    if (i8 != (!this.reversed ? size - 1 : 0)) {
                        messageObject.isOutOwnerCached = bool2;
                        z3 = messageObject.isOutOwner();
                        if (!z3) {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            TLRPC.MessageFwdHeader messageFwdHeader = message2.fwd_from;
                            if (messageFwdHeader != null && messageFwdHeader.saved_from_peer != null) {
                                i7 = size;
                            } else if (message2.from_id instanceof TLRPC.TL_peerUser) {
                                TLRPC.Peer peer = message2.peer_id;
                                i7 = size;
                                if (peer.channel_id == 0) {
                                    if (peer.chat_id == 0) {
                                        if (!(MessageObject.getMedia(message2) instanceof TLRPC.TL_messageMediaGame)) {
                                        }
                                    }
                                }
                            }
                            z = true;
                            if (!messageObject.isMusic() || messageObject.isDocument()) {
                                this.isDocuments = true;
                            }
                        }
                        i7 = size;
                        z = false;
                        if (!messageObject.isMusic()) {
                        }
                        this.isDocuments = true;
                    } else {
                        i7 = size;
                    }
                    message = messageObject.messageOwner;
                    if (message != null && message.invert_media) {
                        this.captionAbove = true;
                    }
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                    GroupedMessagePosition groupedMessagePosition = new GroupedMessagePosition();
                    groupedMessagePosition.last = this.reversed ? i8 == i7 + (-1) : i8 == 0;
                    f = closestPhotoSizeWithSize != null ? 1.0f : closestPhotoSizeWithSize.w / closestPhotoSizeWithSize.h;
                    groupedMessagePosition.aspectRatio = f;
                    if (f <= 1.2f) {
                        sb.append("w");
                    } else if (f < 0.8f) {
                        sb.append("n");
                    } else {
                        sb.append("q");
                    }
                    f2 = groupedMessagePosition.aspectRatio;
                    f3 += f2;
                    if (f2 > 2.0f) {
                        z2 = true;
                    }
                    this.positions.put(messageObject, groupedMessagePosition);
                    boolean z5 = z;
                    this.positionsArray.put(messageObject.getId(), groupedMessagePosition);
                    this.posArray.add(groupedMessagePosition);
                    if (messageObject.caption == null) {
                        if (z4 && this.captionMessage == null) {
                            this.captionMessage = messageObject;
                            bool = null;
                            z4 = false;
                        } else if (this.isDocuments) {
                            bool = null;
                        } else {
                            bool = null;
                            this.captionMessage = null;
                        }
                        this.hasCaption = true;
                    } else {
                        bool = null;
                    }
                    i8 = !this.reversed ? i8 - 1 : i8 + 1;
                    bool2 = bool;
                    size = i7;
                    z = z5;
                } else {
                    if (i8 >= size) {
                        break;
                    }
                    messageObject = this.messages.get(i8);
                    if (i8 != (!this.reversed ? size - 1 : 0)) {
                    }
                    message = messageObject.messageOwner;
                    if (message != null) {
                        this.captionAbove = true;
                    }
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                    GroupedMessagePosition groupedMessagePosition2 = new GroupedMessagePosition();
                    groupedMessagePosition2.last = this.reversed ? i8 == i7 + (-1) : i8 == 0;
                    if (closestPhotoSizeWithSize2 != null) {
                    }
                    groupedMessagePosition2.aspectRatio = f;
                    if (f <= 1.2f) {
                    }
                    f2 = groupedMessagePosition2.aspectRatio;
                    f3 += f2;
                    if (f2 > 2.0f) {
                    }
                    this.positions.put(messageObject, groupedMessagePosition2);
                    boolean z52 = z;
                    this.positionsArray.put(messageObject.getId(), groupedMessagePosition2);
                    this.posArray.add(groupedMessagePosition2);
                    if (messageObject.caption == null) {
                    }
                    if (!this.reversed) {
                    }
                    bool2 = bool;
                    size = i7;
                    z = z52;
                }
            }
            int i9 = size;
            if (this.isDocuments) {
                for (int i10 = 0; i10 < i9; i10++) {
                    GroupedMessagePosition groupedMessagePosition3 = this.posArray.get(i10);
                    groupedMessagePosition3.flags = 3;
                    if (i10 == 0) {
                        groupedMessagePosition3.flags = 7;
                        groupedMessagePosition3.last = false;
                    } else if (i10 == i9 - 1) {
                        groupedMessagePosition3.flags = 11;
                        groupedMessagePosition3.last = true;
                    } else {
                        groupedMessagePosition3.last = false;
                    }
                    groupedMessagePosition3.edge = true;
                    groupedMessagePosition3.aspectRatio = 1.0f;
                    groupedMessagePosition3.minX = (byte) 0;
                    groupedMessagePosition3.maxX = (byte) 0;
                    byte b = (byte) i10;
                    groupedMessagePosition3.minY = b;
                    groupedMessagePosition3.maxY = b;
                    groupedMessagePosition3.spanSize = MediaDataController.MAX_STYLE_RUNS_COUNT;
                    groupedMessagePosition3.pw = this.maxSizeWidth;
                    groupedMessagePosition3.ph = 100.0f;
                }
                return;
            }
            if (z) {
                this.maxSizeWidth -= 50;
                i = 250;
            } else {
                i = NotificationCenter.dialogPhotosUpdate;
            }
            int dp = AndroidUtilities.dp(120.0f);
            float dp2 = AndroidUtilities.dp(120.0f);
            Point point = AndroidUtilities.displaySize;
            int min = (int) (dp2 / (Math.min(point.x, point.y) / this.maxSizeWidth));
            float dp3 = AndroidUtilities.dp(40.0f);
            Point point2 = AndroidUtilities.displaySize;
            float min2 = Math.min(point2.x, point2.y);
            float f4 = this.maxSizeWidth;
            int i11 = (int) (dp3 / (min2 / f4));
            float f5 = f4 / 814.0f;
            float f6 = f3 / i9;
            float dp4 = AndroidUtilities.dp(100.0f) / 814.0f;
            if (i9 != 1) {
                if (z2 || !(i9 == 2 || i9 == 3 || i9 == 4)) {
                    int size2 = this.posArray.size();
                    float[] fArr = new float[size2];
                    for (int i12 = 0; i12 < i9; i12++) {
                        if (f6 > 1.1f) {
                            fArr[i12] = Math.max(1.0f, this.posArray.get(i12).aspectRatio);
                        } else {
                            fArr[i12] = Math.min(1.0f, this.posArray.get(i12).aspectRatio);
                        }
                        fArr[i12] = Math.max(0.66667f, Math.min(1.7f, fArr[i12]));
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i13 = 1; i13 < size2; i13++) {
                        int i14 = size2 - i13;
                        if (i13 <= 3 && i14 <= 3) {
                            arrayList.add(new MessageGroupedLayoutAttempt(i13, i14, multiHeight(fArr, 0, i13), multiHeight(fArr, i13, size2)));
                        }
                    }
                    for (int i15 = 1; i15 < size2 - 1; i15++) {
                        int i16 = 1;
                        while (true) {
                            int i17 = size2 - i15;
                            if (i16 < i17) {
                                int i18 = i17 - i16;
                                if (i15 <= 3) {
                                    if (i16 <= (f6 < 0.85f ? 4 : 3) && i18 <= 3) {
                                        int i19 = i15 + i16;
                                        arrayList.add(new MessageGroupedLayoutAttempt(i15, i16, i18, multiHeight(fArr, 0, i15), multiHeight(fArr, i15, i19), multiHeight(fArr, i19, size2)));
                                    }
                                }
                                i16++;
                            }
                        }
                    }
                    for (int i20 = 1; i20 < size2 - 2; i20++) {
                        int i21 = 1;
                        while (true) {
                            int i22 = size2 - i20;
                            if (i21 < i22) {
                                int i23 = 1;
                                while (true) {
                                    int i24 = i22 - i21;
                                    if (i23 < i24) {
                                        int i25 = i24 - i23;
                                        if (i20 > 3 || i21 > 3 || i23 > 3 || i25 > 3) {
                                            i4 = i22;
                                        } else {
                                            int i26 = i20 + i21;
                                            i4 = i22;
                                            int i27 = i26 + i23;
                                            arrayList.add(new MessageGroupedLayoutAttempt(i20, i21, i23, i25, multiHeight(fArr, 0, i20), multiHeight(fArr, i20, i26), multiHeight(fArr, i26, i27), multiHeight(fArr, i27, size2)));
                                        }
                                        i23++;
                                        i22 = i4;
                                    }
                                }
                                i21++;
                            }
                        }
                    }
                    float f7 = (this.maxSizeWidth / 3) * 4;
                    int i28 = 0;
                    MessageGroupedLayoutAttempt messageGroupedLayoutAttempt = null;
                    float f8 = 0.0f;
                    while (i28 < arrayList.size()) {
                        MessageGroupedLayoutAttempt messageGroupedLayoutAttempt2 = (MessageGroupedLayoutAttempt) arrayList.get(i28);
                        int i29 = 0;
                        float f9 = Float.MAX_VALUE;
                        float f10 = 0.0f;
                        while (true) {
                            float[] fArr2 = messageGroupedLayoutAttempt2.heights;
                            if (i29 >= fArr2.length) {
                                break;
                            }
                            float f11 = fArr2[i29];
                            f10 += f11;
                            if (f11 < f9) {
                                f9 = f11;
                            }
                            i29++;
                        }
                        float abs = Math.abs(f10 - f7);
                        int[] iArr = messageGroupedLayoutAttempt2.lineCounts;
                        float f12 = f7;
                        ArrayList arrayList2 = arrayList;
                        if (iArr.length > 1) {
                            int i30 = iArr[0];
                            int i31 = iArr[1];
                            if (i30 <= i31 && (iArr.length <= 2 || i31 <= iArr[2])) {
                                if (iArr.length > 3) {
                                }
                            }
                            abs *= 1.2f;
                        }
                        if (f9 < min) {
                            abs *= 1.5f;
                        }
                        if (messageGroupedLayoutAttempt == null || abs < f8) {
                            f8 = abs;
                            messageGroupedLayoutAttempt = messageGroupedLayoutAttempt2;
                        }
                        i28++;
                        f7 = f12;
                        arrayList = arrayList2;
                    }
                    if (messageGroupedLayoutAttempt == null) {
                        return;
                    }
                    int i32 = 0;
                    int i33 = 0;
                    int i34 = 0;
                    while (true) {
                        int[] iArr2 = messageGroupedLayoutAttempt.lineCounts;
                        if (i33 >= iArr2.length) {
                            break;
                        }
                        int i35 = iArr2[i33];
                        float f13 = messageGroupedLayoutAttempt.heights[i33];
                        int i36 = this.maxSizeWidth;
                        int i37 = i35 - 1;
                        int max = Math.max(i34, i37);
                        int i38 = i36;
                        int i39 = 0;
                        GroupedMessagePosition groupedMessagePosition4 = null;
                        while (i39 < i35) {
                            float[] fArr3 = fArr;
                            int i40 = (int) (fArr[i32] * f13);
                            i38 -= i40;
                            int i41 = max;
                            GroupedMessagePosition groupedMessagePosition5 = this.posArray.get(i32);
                            int i42 = i35;
                            int i43 = i33 == 0 ? 4 : 0;
                            if (i33 == messageGroupedLayoutAttempt.lineCounts.length - 1) {
                                i43 |= 8;
                            }
                            if (i39 == 0) {
                                i43 |= 1;
                                if (z3) {
                                    groupedMessagePosition4 = groupedMessagePosition5;
                                }
                            }
                            if (i39 == i37) {
                                i43 |= 2;
                                if (!z3) {
                                    i3 = i43;
                                    groupedMessagePosition4 = groupedMessagePosition5;
                                    groupedMessagePosition5.set(i39, i39, i33, i33, i40, Math.max(dp4, f13 / 814.0f), i3);
                                    i32++;
                                    i39++;
                                    max = i41;
                                    fArr = fArr3;
                                    i35 = i42;
                                }
                            }
                            i3 = i43;
                            groupedMessagePosition5.set(i39, i39, i33, i33, i40, Math.max(dp4, f13 / 814.0f), i3);
                            i32++;
                            i39++;
                            max = i41;
                            fArr = fArr3;
                            i35 = i42;
                        }
                        groupedMessagePosition4.pw += i38;
                        groupedMessagePosition4.spanSize += i38;
                        i33++;
                        i34 = max;
                        fArr = fArr;
                    }
                    i2 = i34;
                } else {
                    if (i9 == 2) {
                        GroupedMessagePosition groupedMessagePosition6 = this.posArray.get(0);
                        GroupedMessagePosition groupedMessagePosition7 = this.posArray.get(1);
                        String sb2 = sb.toString();
                        if (sb2.equals("ww") && f6 > f5 * 1.4d) {
                            float f14 = groupedMessagePosition6.aspectRatio;
                            float f15 = groupedMessagePosition7.aspectRatio;
                            if (f14 - f15 < 0.2d) {
                                float f16 = this.maxSizeWidth;
                                float round = Math.round(Math.min(f16 / f14, Math.min(f16 / f15, 407.0f))) / 814.0f;
                                groupedMessagePosition6.set(0, 0, 0, 0, this.maxSizeWidth, round, 7);
                                groupedMessagePosition7.set(0, 0, 1, 1, this.maxSizeWidth, round, 11);
                            }
                        }
                        if (sb2.equals("ww") || sb2.equals("qq")) {
                            int i44 = this.maxSizeWidth / 2;
                            float f17 = i44;
                            float round2 = Math.round(Math.min(f17 / groupedMessagePosition6.aspectRatio, Math.min(f17 / groupedMessagePosition7.aspectRatio, 814.0f))) / 814.0f;
                            groupedMessagePosition6.set(0, 0, 0, 0, i44, round2, 13);
                            groupedMessagePosition7.set(1, 1, 0, 0, i44, round2, 14);
                        } else {
                            float f18 = this.maxSizeWidth;
                            float f19 = groupedMessagePosition6.aspectRatio;
                            int max2 = (int) Math.max(0.4f * f18, Math.round((f18 / f19) / ((1.0f / f19) + (1.0f / groupedMessagePosition7.aspectRatio))));
                            int i45 = this.maxSizeWidth - max2;
                            if (i45 < min) {
                                max2 -= min - i45;
                            } else {
                                min = i45;
                            }
                            float min3 = Math.min(814.0f, Math.round(Math.min(min / groupedMessagePosition6.aspectRatio, max2 / groupedMessagePosition7.aspectRatio))) / 814.0f;
                            groupedMessagePosition6.set(0, 0, 0, 0, min, min3, 13);
                            groupedMessagePosition7.set(1, 1, 0, 0, max2, min3, 14);
                        }
                    } else if (i9 == 3) {
                        GroupedMessagePosition groupedMessagePosition8 = this.posArray.get(0);
                        GroupedMessagePosition groupedMessagePosition9 = this.posArray.get(1);
                        GroupedMessagePosition groupedMessagePosition10 = this.posArray.get(2);
                        if (sb.charAt(0) == 'n') {
                            float f20 = groupedMessagePosition9.aspectRatio;
                            float min4 = Math.min(407.0f, Math.round((this.maxSizeWidth * f20) / (groupedMessagePosition10.aspectRatio + f20)));
                            int max3 = (int) Math.max(min, Math.min(this.maxSizeWidth * 0.5f, Math.round(Math.min(groupedMessagePosition10.aspectRatio * min4, groupedMessagePosition9.aspectRatio * r10))));
                            int round3 = Math.round(Math.min((groupedMessagePosition8.aspectRatio * 814.0f) + i11, this.maxSizeWidth - max3));
                            groupedMessagePosition8.set(0, 0, 0, 1, round3, 1.0f, 13);
                            float f21 = (814.0f - min4) / 814.0f;
                            groupedMessagePosition9.set(1, 1, 0, 0, max3, f21, 6);
                            float f22 = min4 / 814.0f;
                            groupedMessagePosition10.set(0, 1, 1, 1, max3, f22, 10);
                            int i46 = this.maxSizeWidth;
                            groupedMessagePosition10.spanSize = i46;
                            groupedMessagePosition8.siblingHeights = new float[]{f22, f21};
                            if (z3) {
                                groupedMessagePosition8.spanSize = i46 - max3;
                            } else {
                                groupedMessagePosition9.spanSize = i46 - round3;
                                groupedMessagePosition10.leftSpanOffset = round3;
                            }
                            this.hasSibling = true;
                        } else {
                            float round4 = Math.round(Math.min(this.maxSizeWidth / groupedMessagePosition8.aspectRatio, 537.24005f)) / 814.0f;
                            groupedMessagePosition8.set(0, 1, 0, 0, this.maxSizeWidth, round4, 7);
                            int i47 = this.maxSizeWidth / 2;
                            float f23 = 814.0f - round4;
                            float f24 = i47;
                            float min5 = Math.min(f23, Math.round(Math.min(f24 / groupedMessagePosition9.aspectRatio, f24 / groupedMessagePosition10.aspectRatio))) / 814.0f;
                            if (min5 >= dp4) {
                                dp4 = min5;
                            }
                            float f25 = dp4;
                            groupedMessagePosition9.set(0, 0, 1, 1, i47, f25, 9);
                            groupedMessagePosition10.set(1, 1, 1, 1, i47, f25, 10);
                        }
                    } else {
                        GroupedMessagePosition groupedMessagePosition11 = this.posArray.get(0);
                        GroupedMessagePosition groupedMessagePosition12 = this.posArray.get(1);
                        GroupedMessagePosition groupedMessagePosition13 = this.posArray.get(2);
                        GroupedMessagePosition groupedMessagePosition14 = this.posArray.get(3);
                        if (sb.charAt(0) == 'w') {
                            float round5 = Math.round(Math.min(this.maxSizeWidth / groupedMessagePosition11.aspectRatio, 537.24005f)) / 814.0f;
                            groupedMessagePosition11.set(0, 2, 0, 0, this.maxSizeWidth, round5, 7);
                            float round6 = Math.round(this.maxSizeWidth / ((groupedMessagePosition12.aspectRatio + groupedMessagePosition13.aspectRatio) + groupedMessagePosition14.aspectRatio));
                            float f26 = min;
                            int max4 = (int) Math.max(f26, Math.min(this.maxSizeWidth * 0.4f, groupedMessagePosition12.aspectRatio * round6));
                            int max5 = (int) Math.max(Math.max(f26, this.maxSizeWidth * 0.33f), groupedMessagePosition14.aspectRatio * round6);
                            int i48 = (this.maxSizeWidth - max4) - max5;
                            if (i48 < AndroidUtilities.dp(58.0f)) {
                                int dp5 = AndroidUtilities.dp(58.0f) - i48;
                                i48 = AndroidUtilities.dp(58.0f);
                                int i49 = dp5 / 2;
                                max4 -= i49;
                                max5 -= dp5 - i49;
                            }
                            int i50 = max4;
                            float min6 = Math.min(814.0f - round5, round6) / 814.0f;
                            if (min6 >= dp4) {
                                dp4 = min6;
                            }
                            float f27 = dp4;
                            groupedMessagePosition12.set(0, 0, 1, 1, i50, f27, 9);
                            groupedMessagePosition13.set(1, 1, 1, 1, i48, f27, 8);
                            groupedMessagePosition14.set(2, 2, 1, 1, max5, f27, 10);
                            i2 = 2;
                        } else {
                            int max6 = Math.max(min, Math.round(814.0f / (((1.0f / groupedMessagePosition12.aspectRatio) + (1.0f / groupedMessagePosition13.aspectRatio)) + (1.0f / groupedMessagePosition14.aspectRatio))));
                            float f28 = dp;
                            float f29 = max6;
                            float min7 = Math.min(0.33f, Math.max(f28, f29 / groupedMessagePosition12.aspectRatio) / 814.0f);
                            float min8 = Math.min(0.33f, Math.max(f28, f29 / groupedMessagePosition13.aspectRatio) / 814.0f);
                            float f30 = (1.0f - min7) - min8;
                            int round7 = Math.round(Math.min((groupedMessagePosition11.aspectRatio * 814.0f) + i11, this.maxSizeWidth - max6));
                            groupedMessagePosition11.set(0, 0, 0, 2, round7, min7 + min8 + f30, 13);
                            groupedMessagePosition12.set(1, 1, 0, 0, max6, min7, 6);
                            groupedMessagePosition13.set(0, 1, 1, 1, max6, min8, 2);
                            groupedMessagePosition13.spanSize = this.maxSizeWidth;
                            groupedMessagePosition14.set(0, 1, 2, 2, max6, f30, 10);
                            int i51 = this.maxSizeWidth;
                            groupedMessagePosition14.spanSize = i51;
                            if (z3) {
                                groupedMessagePosition11.spanSize = i51 - max6;
                            } else {
                                groupedMessagePosition12.spanSize = i51 - round7;
                                groupedMessagePosition13.leftSpanOffset = round7;
                                groupedMessagePosition14.leftSpanOffset = round7;
                            }
                            groupedMessagePosition11.siblingHeights = new float[]{min7, min8, f30};
                            this.hasSibling = true;
                        }
                    }
                    i2 = 1;
                }
                i5 = 0;
                while (i5 < i9) {
                    GroupedMessagePosition groupedMessagePosition15 = this.posArray.get(i5);
                    if (z3) {
                        if (groupedMessagePosition15.minX == 0) {
                            groupedMessagePosition15.spanSize += i;
                        }
                        if ((groupedMessagePosition15.flags & 2) != 0) {
                            groupedMessagePosition15.edge = true;
                        }
                    } else {
                        if (groupedMessagePosition15.maxX == i2 || (groupedMessagePosition15.flags & 2) != 0) {
                            groupedMessagePosition15.spanSize += i;
                        }
                        if ((groupedMessagePosition15.flags & 1) != 0) {
                            groupedMessagePosition15.edge = true;
                        }
                    }
                    MessageObject messageObject2 = this.messages.get(i5);
                    if (!z3 && messageObject2.needDrawAvatarInternal()) {
                        if (groupedMessagePosition15.edge) {
                            int i52 = groupedMessagePosition15.spanSize;
                            if (i52 != 1000) {
                                groupedMessagePosition15.spanSize = i52 + 108;
                            }
                            groupedMessagePosition15.pw += 108;
                            i6 = 1;
                            i5 += i6;
                        } else if ((groupedMessagePosition15.flags & 2) != 0) {
                            int i53 = groupedMessagePosition15.spanSize;
                            if (i53 != 1000) {
                                groupedMessagePosition15.spanSize = i53 - 108;
                            } else {
                                int i54 = groupedMessagePosition15.leftSpanOffset;
                                if (i54 != 0) {
                                    groupedMessagePosition15.leftSpanOffset = i54 + 108;
                                }
                            }
                            i6 = 1;
                            i5 += i6;
                        }
                    }
                    i6 = 1;
                    i5 += i6;
                }
            }
            GroupedMessagePosition groupedMessagePosition16 = this.posArray.get(0);
            float f31 = this.maxSizeWidth / groupedMessagePosition16.aspectRatio;
            groupedMessagePosition16.set(0, 0, 0, 0, this.maxSizeWidth, Math.round(Math.min(f31, Math.min(f31, 407.0f))) / 814.0f, 15);
            i2 = 0;
            i5 = 0;
            while (i5 < i9) {
            }
        }

        public MessageObject findPrimaryMessageObject() {
            return findMessageWithFlags(this.reversed ? 10 : 5);
        }

        public MessageObject findCaptionMessageObject() {
            if (!this.messages.isEmpty() && this.positions.isEmpty()) {
                calculate();
            }
            MessageObject messageObject = null;
            for (int i = 0; i < this.messages.size(); i++) {
                MessageObject messageObject2 = this.messages.get(i);
                if (!TextUtils.isEmpty(messageObject2.caption)) {
                    if (messageObject != null) {
                        return null;
                    }
                    messageObject = messageObject2;
                }
            }
            return messageObject;
        }

        public MessageObject findMessageWithFlags(int i) {
            if (!this.messages.isEmpty() && this.positions.isEmpty()) {
                calculate();
            }
            for (int i2 = 0; i2 < this.messages.size(); i2++) {
                MessageObject messageObject = this.messages.get(i2);
                GroupedMessagePosition groupedMessagePosition = this.positions.get(messageObject);
                if (groupedMessagePosition != null && (groupedMessagePosition.flags & i) == i) {
                    return messageObject;
                }
            }
            return null;
        }

        public static class TransitionParams {
            public boolean backgroundChangeBounds;
            public int bottom;
            public float captionEnterProgress = 1.0f;
            public ChatMessageCell cell;
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

        public boolean contains(int i) {
            if (this.messages == null) {
                return false;
            }
            for (int i2 = 0; i2 < this.messages.size(); i2++) {
                MessageObject messageObject = this.messages.get(i2);
                if (messageObject != null && messageObject.getId() == i) {
                    return true;
                }
            }
            return false;
        }
    }

    public MessageObject(int i, TL_stories.StoryItem storyItem) {
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
        this.currentAccount = i;
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

    public MessageObject(int i, TLRPC.Message message, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
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
        this.localType = z ? 2 : 1;
        this.currentAccount = i;
        this.localName = str2;
        this.localUserName = str3;
        this.messageText = str;
        this.messageOwner = message;
        this.localChannel = z2;
        this.localSupergroup = z3;
        this.localEdit = z4;
    }

    public MessageObject(int i, TLRPC.Message message, AbstractMap<Long, TLRPC.User> abstractMap, boolean z, boolean z2) {
        this(i, message, abstractMap, (AbstractMap<Long, TLRPC.Chat>) null, z, z2);
    }

    public MessageObject(int i, TLRPC.Message message, LongSparseArray longSparseArray, boolean z, boolean z2) {
        this(i, message, longSparseArray, (LongSparseArray) null, z, z2);
    }

    public MessageObject(int i, TLRPC.Message message, boolean z, boolean z2) {
        this(i, message, null, null, null, null, null, z, z2, 0L);
    }

    public MessageObject(int i, TLRPC.Message message, MessageObject messageObject, boolean z, boolean z2) {
        this(i, message, messageObject, null, null, null, null, z, z2, 0L);
    }

    public MessageObject(int i, TLRPC.Message message, AbstractMap<Long, TLRPC.User> abstractMap, AbstractMap<Long, TLRPC.Chat> abstractMap2, boolean z, boolean z2) {
        this(i, message, abstractMap, abstractMap2, z, z2, 0L);
    }

    public MessageObject(int i, TLRPC.Message message, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, boolean z, boolean z2) {
        this(i, message, null, null, null, longSparseArray, longSparseArray2, z, z2, 0L, false, false, false);
    }

    public MessageObject(int i, TLRPC.Message message, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, boolean z, boolean z2, boolean z3) {
        this(i, message, null, null, null, longSparseArray, longSparseArray2, z, z2, 0L, false, false, z3);
    }

    public MessageObject(int i, TLRPC.Message message, AbstractMap<Long, TLRPC.User> abstractMap, AbstractMap<Long, TLRPC.Chat> abstractMap2, boolean z, boolean z2, long j) {
        this(i, message, null, abstractMap, abstractMap2, null, null, z, z2, j);
    }

    public MessageObject(int i, TLRPC.Message message, MessageObject messageObject, AbstractMap<Long, TLRPC.User> abstractMap, AbstractMap<Long, TLRPC.Chat> abstractMap2, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, boolean z, boolean z2, long j) {
        this(i, message, messageObject, abstractMap, abstractMap2, longSparseArray, longSparseArray2, z, z2, j, false, false, false);
    }

    public MessageObject(int i, TLRPC.Message message, MessageObject messageObject, AbstractMap<Long, TLRPC.User> abstractMap, AbstractMap<Long, TLRPC.Chat> abstractMap2, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, boolean z, boolean z2, long j, boolean z3, boolean z4, boolean z5) {
        this(i, message, messageObject, abstractMap, abstractMap2, longSparseArray, longSparseArray2, z, z2, j, z3, z4, z5, 0);
    }

    public MessageObject(int i, TLRPC.Message message, MessageObject messageObject, AbstractMap<Long, TLRPC.User> abstractMap, AbstractMap<Long, TLRPC.Chat> abstractMap2, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, boolean z, boolean z2, long j, boolean z3, boolean z4, boolean z5, int i2) {
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
        Theme.createCommonMessageResources();
        this.isRepostPreview = z3;
        this.isRepostVideoPreview = z4;
        this.isSaved = z5 || getDialogId(message) == UserConfig.getInstance(i).getClientUserId();
        this.searchType = i2;
        this.currentAccount = i;
        this.messageOwner = message;
        this.replyMessageObject = messageObject;
        this.eventId = j;
        this.wasUnread = !message.out && message.unread;
        TLRPC.Message message2 = message.replyMessage;
        if (message2 != null) {
            this.replyMessageObject = new MessageObject(i, message2, null, abstractMap, abstractMap2, longSparseArray, longSparseArray2, false, z2, j);
        }
        TLRPC.Peer peer = message.from_id;
        if (peer instanceof TLRPC.TL_peerUser) {
            getUser(abstractMap, longSparseArray, peer.user_id);
        }
        updateMessageText(abstractMap, abstractMap2, longSparseArray, longSparseArray2);
        setType();
        if (z) {
            updateTranslation(false);
        }
        measureInlineBotButtons();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(this.messageOwner.date * 1000);
        int i3 = gregorianCalendar.get(6);
        int i4 = gregorianCalendar.get(1);
        int i5 = gregorianCalendar.get(2);
        this.dateKey = String.format("%d_%02d_%02d", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i3));
        this.dateKeyInt = (i5 * 10000) + i4 + (i3 * MediaController.VIDEO_BITRATE_480);
        this.monthKey = String.format("%d_%02d", Integer.valueOf(i4), Integer.valueOf(i5));
        createMessageSendInfo();
        generateCaption();
        if (z) {
            if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame) {
                textPaint = Theme.chat_msgGameTextPaint;
            } else {
                textPaint = Theme.chat_msgTextPaint;
            }
            int[] iArr = allowsBigEmoji() ? new int[1] : null;
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.messageText, textPaint.getFontMetricsInt(), false, iArr);
            this.messageText = replaceEmoji;
            Spannable replaceAnimatedEmoji = replaceAnimatedEmoji(replaceEmoji, textPaint.getFontMetricsInt());
            this.messageText = replaceAnimatedEmoji;
            if (iArr != null && iArr[0] > 1) {
                replaceEmojiToLottieFrame(replaceAnimatedEmoji, iArr);
            }
            checkEmojiOnly(iArr);
            checkBigAnimatedEmoji();
            setType();
            createPathThumb();
        }
        this.layoutCreated = z;
        generateThumbs(false);
        if (z2) {
            checkMediaExistance();
        }
    }

    protected void checkBigAnimatedEmoji() {
        AnimatedEmojiSpan[] animatedEmojiSpanArr;
        int i;
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
                    if (!TextUtils.isEmpty(this.emojiAnimatedStickerColor) && (i = indexOf + 2) < this.messageText.length()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(charSequence.toString());
                        CharSequence charSequence2 = this.messageText;
                        sb.append(charSequence2.subSequence(i, charSequence2.length()).toString());
                        charSequence = sb.toString();
                    }
                    if (TextUtils.isEmpty(this.emojiAnimatedStickerColor) || EmojiData.emojiColoredMap.contains(charSequence.toString())) {
                        this.emojiAnimatedSticker = MediaDataController.getInstance(this.currentAccount).getEmojiAnimatedSticker(charSequence);
                    }
                } else if (this.messageOwner.entities.size() == 1 && (this.messageOwner.entities.get(0) instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                    try {
                        long j = ((TLRPC.TL_messageEntityCustomEmoji) this.messageOwner.entities.get(0)).document_id;
                        this.emojiAnimatedStickerId = Long.valueOf(j);
                        TLRPC.Document findDocument = AnimatedEmojiDrawable.findDocument(this.currentAccount, j);
                        this.emojiAnimatedSticker = findDocument;
                        if (findDocument == null) {
                            CharSequence charSequence3 = this.messageText;
                            if ((charSequence3 instanceof Spanned) && (animatedEmojiSpanArr = (AnimatedEmojiSpan[]) ((Spanned) charSequence3).getSpans(0, charSequence3.length(), AnimatedEmojiSpan.class)) != null && animatedEmojiSpanArr.length == 1) {
                                this.emojiAnimatedSticker = animatedEmojiSpanArr[0].document;
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

    private void createPathThumb() {
        TLRPC.Document document = getDocument();
        if (document == null) {
            return;
        }
        this.pathThumb = DocumentObject.getSvgThumb(document, Theme.key_chat_serviceBackground, 1.0f);
    }

    public void createStrippedThumb() {
        if (this.photoThumbs != null) {
            if ((canCreateStripedThubms() || hasExtendedMediaPreview()) && this.strippedThumb == null) {
                try {
                    String str = isRoundVideo() ? "br" : "b";
                    int size = this.photoThumbs.size();
                    for (int i = 0; i < size; i++) {
                        TLRPC.PhotoSize photoSize = this.photoThumbs.get(i);
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

    private void createDateArray(int i, TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent, ArrayList<MessageObject> arrayList, HashMap<String, ArrayList<MessageObject>> hashMap, boolean z) {
        if (hashMap.get(this.dateKey) == null) {
            hashMap.put(this.dateKey, new ArrayList<>());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = LocaleController.formatDateChat(tL_channelAdminLogEvent.date);
            tL_message.id = 0;
            tL_message.date = tL_channelAdminLogEvent.date;
            MessageObject messageObject = new MessageObject(i, tL_message, false, false);
            messageObject.type = 10;
            messageObject.contentType = 1;
            messageObject.isDateObject = true;
            if (z) {
                arrayList.add(0, messageObject);
            } else {
                arrayList.add(messageObject);
            }
        }
    }

    private void checkEmojiOnly(int[] iArr) {
        checkEmojiOnly(iArr == null ? null : Integer.valueOf(iArr[0]));
    }

    private void checkEmojiOnly(Integer num) {
        TextPaint textPaint;
        if (num != null && num.intValue() >= 1 && this.messageOwner != null && !hasNonEmojiEntities()) {
            CharSequence charSequence = this.messageText;
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), Emoji.EmojiSpan.class);
            CharSequence charSequence2 = this.messageText;
            AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) ((Spannable) charSequence2).getSpans(0, charSequence2.length(), AnimatedEmojiSpan.class);
            this.emojiOnlyCount = Math.max(num.intValue(), (emojiSpanArr == null ? 0 : emojiSpanArr.length) + (animatedEmojiSpanArr == null ? 0 : animatedEmojiSpanArr.length));
            this.totalAnimatedEmojiCount = animatedEmojiSpanArr == null ? 0 : animatedEmojiSpanArr.length;
            this.animatedEmojiCount = 0;
            if (animatedEmojiSpanArr != null) {
                for (AnimatedEmojiSpan animatedEmojiSpan : animatedEmojiSpanArr) {
                    if (!animatedEmojiSpan.standard) {
                        this.animatedEmojiCount++;
                    }
                }
            }
            int i = this.emojiOnlyCount;
            boolean z = (i - (emojiSpanArr == null ? 0 : emojiSpanArr.length)) - (animatedEmojiSpanArr == null ? 0 : animatedEmojiSpanArr.length) > 0;
            this.hasUnwrappedEmoji = z;
            if (i == 0 || z) {
                if (animatedEmojiSpanArr == null || animatedEmojiSpanArr.length <= 0) {
                    return;
                }
                for (int i2 = 0; i2 < animatedEmojiSpanArr.length; i2++) {
                    animatedEmojiSpanArr[i2].replaceFontMetrics(Theme.chat_msgTextPaint.getFontMetricsInt(), (int) (Theme.chat_msgTextPaint.getTextSize() + AndroidUtilities.dp(4.0f)), -1);
                    animatedEmojiSpanArr[i2].full = false;
                }
                return;
            }
            int i3 = this.animatedEmojiCount;
            boolean z2 = i == i3;
            int i4 = 2;
            switch (Math.max(i, i3)) {
                case 0:
                case 1:
                case 2:
                    textPaint = z2 ? Theme.chat_msgTextPaintEmoji[0] : Theme.chat_msgTextPaintEmoji[2];
                    i4 = 1;
                    break;
                case 3:
                    textPaint = z2 ? Theme.chat_msgTextPaintEmoji[1] : Theme.chat_msgTextPaintEmoji[3];
                    i4 = 1;
                    break;
                case 4:
                    textPaint = z2 ? Theme.chat_msgTextPaintEmoji[2] : Theme.chat_msgTextPaintEmoji[4];
                    i4 = 1;
                    break;
                case 5:
                    if (z2) {
                        textPaint = Theme.chat_msgTextPaintEmoji[3];
                        break;
                    } else {
                        textPaint = Theme.chat_msgTextPaintEmoji[5];
                        break;
                    }
                case 6:
                    if (z2) {
                        textPaint = Theme.chat_msgTextPaintEmoji[4];
                        break;
                    } else {
                        textPaint = Theme.chat_msgTextPaintEmoji[5];
                        break;
                    }
                default:
                    int i5 = this.emojiOnlyCount > 9 ? 0 : -1;
                    textPaint = Theme.chat_msgTextPaintEmoji[5];
                    i4 = i5;
                    break;
            }
            int textSize = (int) (textPaint.getTextSize() + AndroidUtilities.dp(4.0f));
            if (emojiSpanArr != null && emojiSpanArr.length > 0) {
                for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                    emojiSpan.replaceFontMetrics(textPaint.getFontMetricsInt(), textSize);
                }
            }
            if (animatedEmojiSpanArr == null || animatedEmojiSpanArr.length <= 0) {
                return;
            }
            for (int i6 = 0; i6 < animatedEmojiSpanArr.length; i6++) {
                animatedEmojiSpanArr[i6].replaceFontMetrics(textPaint.getFontMetricsInt(), textSize, i4);
                animatedEmojiSpanArr[i6].full = true;
            }
            return;
        }
        CharSequence charSequence3 = this.messageText;
        AnimatedEmojiSpan[] animatedEmojiSpanArr2 = (AnimatedEmojiSpan[]) ((Spannable) charSequence3).getSpans(0, charSequence3.length(), AnimatedEmojiSpan.class);
        if (animatedEmojiSpanArr2 != null && animatedEmojiSpanArr2.length > 0) {
            this.totalAnimatedEmojiCount = animatedEmojiSpanArr2.length;
            for (int i7 = 0; i7 < animatedEmojiSpanArr2.length; i7++) {
                animatedEmojiSpanArr2[i7].replaceFontMetrics(Theme.chat_msgTextPaint.getFontMetricsInt(), (int) (Theme.chat_msgTextPaint.getTextSize() + AndroidUtilities.dp(4.0f)), -1);
                animatedEmojiSpanArr2[i7].full = false;
            }
            return;
        }
        this.totalAnimatedEmojiCount = 0;
    }

    public TextPaint getTextPaint() {
        if (this.emojiOnlyCount >= 1 && this.messageOwner != null && !hasNonEmojiEntities()) {
            int i = this.emojiOnlyCount;
            int i2 = this.animatedEmojiCount;
            boolean z = i == i2;
            switch (Math.max(i, i2)) {
                case 0:
                case 1:
                case 2:
                    if (!z) {
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (!z) {
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (!z) {
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (!z) {
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (!z) {
                        break;
                    } else {
                        break;
                    }
            }
            return Theme.chat_msgTextPaintEmoji[5];
        }
        return Theme.chat_msgTextPaint;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x02a7, code lost:
    
        if ((r3.new_participant instanceof org.telegram.tgnet.TLRPC.TL_channelParticipant) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:741:0x0ccb, code lost:
    
        if (r10.id == r12.id) goto L520;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x1e0f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x1e61  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x1e66  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x1efc A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x1efd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x1f12  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x1f24  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x1f32  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x1f3d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x1f74  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x1f35  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x1f17  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x1ef3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x1e63  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x0cf1  */
    /* JADX WARN: Removed duplicated region for block: B:718:0x0d32  */
    /* JADX WARN: Removed duplicated region for block: B:724:0x0dce  */
    /* JADX WARN: Removed duplicated region for block: B:726:0x0dd9  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x0cfe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MessageObject(int i, TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent, ArrayList<MessageObject> arrayList, HashMap<String, ArrayList<MessageObject>> hashMap, TLRPC.Chat chat, int[] iArr, boolean z) {
        TLRPC.User user;
        boolean z2;
        String str;
        TLRPC.ChannelParticipant channelParticipant;
        TLRPC.ChannelParticipant channelParticipant2;
        TLRPC.User user2;
        String string;
        TLRPC.Chat chat2;
        StringBuilder sb;
        String str2;
        TLRPC.Chat chat3;
        String str3;
        SpannableString spannableString;
        SpannableString spannableString2;
        SpannableString spannableString3;
        boolean z3;
        SpannableString spannableString4;
        int i2;
        String str4;
        String string2;
        TLRPC.Message message;
        char c;
        String formatPluralString;
        TLObject chat4;
        TLObject chat5;
        TLObject chat6;
        char c2;
        String formatPluralString2;
        String str5;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        TLRPC.WebPage webPage;
        String str6;
        ArrayList<TLRPC.MessageEntity> arrayList3;
        boolean z4;
        boolean z5;
        TLRPC.Peer peer;
        String str7;
        String str8;
        TLRPC.Message message2;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLObject chat7;
        TLRPC.User user3;
        String string3;
        StringBuilder sb2;
        boolean z6;
        char c3;
        int i3;
        String formatPluralString3;
        int i4;
        int i5;
        boolean z7;
        TLObject chat8;
        TLRPC.Message message3;
        ArrayList<MessageObject> arrayList4;
        int[] iArr2;
        TextPaint textPaint;
        Spannable replaceAnimatedEmoji;
        int i6;
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
        this.currentAccount = i;
        TLRPC.User user4 = tL_channelAdminLogEvent2.user_id > 0 ? MessagesController.getInstance(i).getUser(Long.valueOf(tL_channelAdminLogEvent2.user_id)) : null;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        TLRPC.User user5 = user4;
        gregorianCalendar.setTimeInMillis(tL_channelAdminLogEvent2.date * 1000);
        int i7 = gregorianCalendar.get(6);
        int i8 = gregorianCalendar.get(1);
        int i9 = gregorianCalendar.get(2);
        this.dateKey = String.format("%d_%02d_%02d", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i7));
        this.dateKeyInt = (i9 * MediaDataController.MAX_STYLE_RUNS_COUNT) + i8 + (i7 * 100000);
        this.monthKey = String.format("%d_%02d", Integer.valueOf(i8), Integer.valueOf(i9));
        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
        tL_peerChannel.channel_id = chat.id;
        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeTitle) {
            String str9 = ((TLRPC.TL_channelAdminLogEventActionChangeTitle) channelAdminLogEventAction).new_value;
            if (chat.megagroup) {
                user = user5;
                this.messageText = replaceWithLink(LocaleController.formatString("EventLogEditedGroupTitle", R.string.EventLogEditedGroupTitle, str9), "un1", user);
            } else {
                user = user5;
                this.messageText = replaceWithLink(LocaleController.formatString("EventLogEditedChannelTitle", R.string.EventLogEditedChannelTitle, str9), "un1", user);
            }
        } else {
            user = user5;
            if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangePhoto) {
                TLRPC.TL_channelAdminLogEventActionChangePhoto tL_channelAdminLogEventActionChangePhoto = (TLRPC.TL_channelAdminLogEventActionChangePhoto) channelAdminLogEventAction;
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                this.messageOwner = tL_messageService;
                if (tL_channelAdminLogEventActionChangePhoto.new_photo instanceof TLRPC.TL_photoEmpty) {
                    tL_messageService.action = new TLRPC.TL_messageActionChatDeletePhoto();
                    if (chat.megagroup) {
                        this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogRemovedWGroupPhoto), "un1", user);
                    } else {
                        this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogRemovedChannelPhoto), "un1", user);
                    }
                } else {
                    tL_messageService.action = new TLRPC.TL_messageActionChatEditPhoto();
                    this.messageOwner.action.photo = tL_channelAdminLogEventActionChangePhoto.new_photo;
                    if (chat.megagroup) {
                        if (isVideoAvatar()) {
                            this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogEditedGroupVideo), "un1", user);
                        } else {
                            this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogEditedGroupPhoto), "un1", user);
                        }
                    } else if (isVideoAvatar()) {
                        this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogEditedChannelVideo), "un1", user);
                    } else {
                        this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogEditedChannelPhoto), "un1", user);
                    }
                }
            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoin) {
                if (chat.megagroup) {
                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogGroupJoined), "un1", user);
                } else {
                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogChannelJoined), "un1", user);
                }
            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantLeave) {
                TLRPC.TL_messageService tL_messageService2 = new TLRPC.TL_messageService();
                this.messageOwner = tL_messageService2;
                tL_messageService2.action = new TLRPC.TL_messageActionChatDeleteUser();
                this.messageOwner.action.user_id = tL_channelAdminLogEvent2.user_id;
                if (chat.megagroup) {
                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogLeftGroup), "un1", user);
                } else {
                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogLeftChannel), "un1", user);
                }
            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantInvite) {
                TLRPC.TL_messageService tL_messageService3 = new TLRPC.TL_messageService();
                this.messageOwner = tL_messageService3;
                tL_messageService3.action = new TLRPC.TL_messageActionChatAddUser();
                long peerId = getPeerId(((TLRPC.TL_channelAdminLogEventActionParticipantInvite) channelAdminLogEventAction).participant.peer);
                if (peerId > 0) {
                    chat8 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId));
                } else {
                    chat8 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
                }
                TLRPC.Peer peer2 = this.messageOwner.from_id;
                if ((peer2 instanceof TLRPC.TL_peerUser) && peerId == peer2.user_id) {
                    if (chat.megagroup) {
                        this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogGroupJoined), "un1", user);
                    } else {
                        this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogChannelJoined), "un1", user);
                    }
                } else {
                    CharSequence replaceWithLink = replaceWithLink(LocaleController.getString(R.string.EventLogAdded), "un2", chat8);
                    this.messageText = replaceWithLink;
                    this.messageText = replaceWithLink(replaceWithLink, "un1", user);
                }
            } else {
                boolean z8 = channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin;
                if (z8) {
                    z2 = z8;
                } else {
                    boolean z9 = channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleBan;
                    if (z9) {
                        z2 = z8;
                        TLRPC.TL_channelAdminLogEventActionParticipantToggleBan tL_channelAdminLogEventActionParticipantToggleBan = (TLRPC.TL_channelAdminLogEventActionParticipantToggleBan) channelAdminLogEventAction;
                        str2 = "https://";
                        if (tL_channelAdminLogEventActionParticipantToggleBan.prev_participant instanceof TLRPC.TL_channelParticipantAdmin) {
                        }
                    } else {
                        str2 = "https://";
                    }
                    if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDefaultBannedRights) {
                        TLRPC.TL_channelAdminLogEventActionDefaultBannedRights tL_channelAdminLogEventActionDefaultBannedRights = (TLRPC.TL_channelAdminLogEventActionDefaultBannedRights) channelAdminLogEventAction;
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        this.messageOwner = tL_message;
                        tL_message.realId = -1;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = tL_channelAdminLogEventActionDefaultBannedRights.prev_banned_rights;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights2 = tL_channelAdminLogEventActionDefaultBannedRights.new_banned_rights;
                        StringBuilder sb3 = new StringBuilder(LocaleController.getString(R.string.EventLogDefaultPermissions));
                        tL_chatBannedRights = tL_chatBannedRights == null ? new TLRPC.TL_chatBannedRights() : tL_chatBannedRights;
                        tL_chatBannedRights2 = tL_chatBannedRights2 == null ? new TLRPC.TL_chatBannedRights() : tL_chatBannedRights2;
                        if (tL_chatBannedRights.send_messages != tL_chatBannedRights2.send_messages) {
                            sb3.append('\n');
                            sb3.append('\n');
                            sb3.append(!tL_chatBannedRights2.send_messages ? '+' : '-');
                            sb3.append(' ');
                            sb3.append(LocaleController.getString(R.string.EventLogRestrictedSendMessages));
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (tL_chatBannedRights.send_stickers != tL_chatBannedRights2.send_stickers || tL_chatBannedRights.send_inline != tL_chatBannedRights2.send_inline || tL_chatBannedRights.send_gifs != tL_chatBannedRights2.send_gifs || tL_chatBannedRights.send_games != tL_chatBannedRights2.send_games) {
                            if (!z7) {
                                sb3.append('\n');
                                z7 = true;
                            }
                            sb3.append('\n');
                            sb3.append(!tL_chatBannedRights2.send_stickers ? '+' : '-');
                            sb3.append(' ');
                            sb3.append(LocaleController.getString(R.string.EventLogRestrictedSendStickers));
                        }
                        if (tL_chatBannedRights.send_media != tL_chatBannedRights2.send_media) {
                            if (!z7) {
                                sb3.append('\n');
                                z7 = true;
                            }
                            sb3.append('\n');
                            sb3.append(!tL_chatBannedRights2.send_media ? '+' : '-');
                            sb3.append(' ');
                            sb3.append(LocaleController.getString(R.string.EventLogRestrictedSendMedia));
                        }
                        if (tL_chatBannedRights.send_polls != tL_chatBannedRights2.send_polls) {
                            if (!z7) {
                                sb3.append('\n');
                                z7 = true;
                            }
                            sb3.append('\n');
                            sb3.append(!tL_chatBannedRights2.send_polls ? '+' : '-');
                            sb3.append(' ');
                            sb3.append(LocaleController.getString(R.string.EventLogRestrictedSendPolls));
                        }
                        if (tL_chatBannedRights.embed_links != tL_chatBannedRights2.embed_links) {
                            if (!z7) {
                                sb3.append('\n');
                                z7 = true;
                            }
                            sb3.append('\n');
                            sb3.append(!tL_chatBannedRights2.embed_links ? '+' : '-');
                            sb3.append(' ');
                            sb3.append(LocaleController.getString(R.string.EventLogRestrictedSendEmbed));
                        }
                        if (tL_chatBannedRights.change_info != tL_chatBannedRights2.change_info) {
                            if (!z7) {
                                sb3.append('\n');
                                z7 = true;
                            }
                            sb3.append('\n');
                            sb3.append(!tL_chatBannedRights2.change_info ? '+' : '-');
                            sb3.append(' ');
                            sb3.append(LocaleController.getString(R.string.EventLogRestrictedChangeInfo));
                        }
                        if (tL_chatBannedRights.invite_users != tL_chatBannedRights2.invite_users) {
                            if (!z7) {
                                sb3.append('\n');
                                z7 = true;
                            }
                            sb3.append('\n');
                            sb3.append(!tL_chatBannedRights2.invite_users ? '+' : '-');
                            sb3.append(' ');
                            sb3.append(LocaleController.getString(R.string.EventLogRestrictedInviteUsers));
                        }
                        if (tL_chatBannedRights.pin_messages != tL_chatBannedRights2.pin_messages) {
                            if (!z7) {
                                sb3.append('\n');
                            }
                            sb3.append('\n');
                            sb3.append(!tL_chatBannedRights2.pin_messages ? '+' : '-');
                            sb3.append(' ');
                            sb3.append(LocaleController.getString(R.string.EventLogRestrictedPinMessages));
                        }
                        if (tL_chatBannedRights.edit_rank != tL_chatBannedRights2.edit_rank) {
                            if (!z7) {
                                sb3.append('\n');
                            }
                            sb3.append('\n');
                            sb3.append(!tL_chatBannedRights2.edit_rank ? '+' : '-');
                            sb3.append(' ');
                            sb3.append(LocaleController.getString(R.string.EventLogRestrictedEditRank));
                        }
                        if (tL_chatBannedRights.send_reactions != tL_chatBannedRights2.send_reactions) {
                            if (!z7) {
                                sb3.append('\n');
                            }
                            sb3.append('\n');
                            sb3.append(!tL_chatBannedRights2.send_reactions ? '+' : '-');
                            sb3.append(' ');
                            sb3.append(LocaleController.getString(R.string.EventLogRestrictedSendReactions));
                        }
                        this.messageText = sb3.toString();
                    } else {
                        if (z9) {
                            TLRPC.TL_channelAdminLogEventActionParticipantToggleBan tL_channelAdminLogEventActionParticipantToggleBan2 = (TLRPC.TL_channelAdminLogEventActionParticipantToggleBan) channelAdminLogEventAction;
                            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                            this.messageOwner = tL_message2;
                            tL_message2.realId = -1;
                            long peerId2 = getPeerId(tL_channelAdminLogEventActionParticipantToggleBan2.prev_participant.peer);
                            if (peerId2 > 0) {
                                chat7 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId2));
                            } else {
                                chat7 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId2));
                            }
                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = tL_channelAdminLogEventActionParticipantToggleBan2.prev_participant.banned_rights;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights4 = tL_channelAdminLogEventActionParticipantToggleBan2.new_participant.banned_rights;
                            if (chat.megagroup && (tL_chatBannedRights4 == null || !tL_chatBannedRights4.view_messages || (tL_chatBannedRights3 != null && tL_chatBannedRights4.until_date != tL_chatBannedRights3.until_date))) {
                                if (tL_chatBannedRights4 != null && !AndroidUtilities.isBannedForever(tL_chatBannedRights4)) {
                                    sb2 = new StringBuilder();
                                    int i10 = tL_chatBannedRights4.until_date - tL_channelAdminLogEvent2.date;
                                    int i11 = ((i10 / 60) / 60) / 24;
                                    int i12 = i10 - (86400 * i11);
                                    str = "";
                                    int i13 = (i12 / 60) / 60;
                                    int i14 = (i12 - (i13 * 3600)) / 60;
                                    int i15 = 3;
                                    int i16 = 0;
                                    int i17 = 0;
                                    while (true) {
                                        if (i16 >= i15) {
                                            user3 = user;
                                            break;
                                        }
                                        if (i16 == 0) {
                                            user3 = user;
                                            if (i11 != 0) {
                                                formatPluralString3 = LocaleController.formatPluralString("Days", i11, new Object[0]);
                                                i4 = i17 + 1;
                                                i3 = i11;
                                                i5 = i4;
                                            } else {
                                                i3 = i11;
                                                i5 = i17;
                                                formatPluralString3 = null;
                                            }
                                        } else {
                                            user3 = user;
                                            if (i16 == 1) {
                                                i3 = i11;
                                                if (i13 != 0) {
                                                    i4 = i17 + 1;
                                                    formatPluralString3 = LocaleController.formatPluralString("Hours", i13, new Object[0]);
                                                    i5 = i4;
                                                }
                                                i5 = i17;
                                                formatPluralString3 = null;
                                            } else {
                                                i3 = i11;
                                                if (i14 != 0) {
                                                    formatPluralString3 = LocaleController.formatPluralString("Minutes", i14, new Object[0]);
                                                    i4 = i17 + 1;
                                                    i5 = i4;
                                                }
                                                i5 = i17;
                                                formatPluralString3 = null;
                                            }
                                        }
                                        if (formatPluralString3 != null) {
                                            if (sb2.length() > 0) {
                                                sb2.append(", ");
                                            }
                                            sb2.append(formatPluralString3);
                                        }
                                        if (i5 == 2) {
                                            break;
                                        }
                                        i16++;
                                        i17 = i5;
                                        i11 = i3;
                                        user = user3;
                                        i15 = 3;
                                    }
                                } else {
                                    user3 = user;
                                    str = "";
                                    sb2 = new StringBuilder(LocaleController.getString(R.string.UserRestrictionsUntilForever));
                                }
                                String string4 = LocaleController.getString(R.string.EventLogRestrictedUntil);
                                StringBuilder sb4 = new StringBuilder(String.format(string4, getUserName(chat7, this.messageOwner.entities, string4.indexOf("%1$s")), sb2.toString()));
                                tL_chatBannedRights3 = tL_chatBannedRights3 == null ? new TLRPC.TL_chatBannedRights() : tL_chatBannedRights3;
                                tL_chatBannedRights4 = tL_chatBannedRights4 == null ? new TLRPC.TL_chatBannedRights() : tL_chatBannedRights4;
                                if (tL_chatBannedRights3.view_messages != tL_chatBannedRights4.view_messages) {
                                    sb4.append('\n');
                                    sb4.append('\n');
                                    sb4.append(!tL_chatBannedRights4.view_messages ? '+' : '-');
                                    sb4.append(' ');
                                    sb4.append(LocaleController.getString(R.string.EventLogRestrictedReadMessages));
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (tL_chatBannedRights3.send_messages != tL_chatBannedRights4.send_messages) {
                                    if (!z6) {
                                        sb4.append('\n');
                                        z6 = true;
                                    }
                                    sb4.append('\n');
                                    sb4.append(!tL_chatBannedRights4.send_messages ? '+' : '-');
                                    sb4.append(' ');
                                    sb4.append(LocaleController.getString(R.string.EventLogRestrictedSendMessages));
                                }
                                if (tL_chatBannedRights3.send_stickers != tL_chatBannedRights4.send_stickers || tL_chatBannedRights3.send_inline != tL_chatBannedRights4.send_inline || tL_chatBannedRights3.send_gifs != tL_chatBannedRights4.send_gifs || tL_chatBannedRights3.send_games != tL_chatBannedRights4.send_games) {
                                    if (!z6) {
                                        sb4.append('\n');
                                        z6 = true;
                                    }
                                    sb4.append('\n');
                                    sb4.append(!tL_chatBannedRights4.send_stickers ? '+' : '-');
                                    sb4.append(' ');
                                    sb4.append(LocaleController.getString(R.string.EventLogRestrictedSendStickers));
                                }
                                if (tL_chatBannedRights3.send_media != tL_chatBannedRights4.send_media) {
                                    if (!z6) {
                                        sb4.append('\n');
                                        z6 = true;
                                    }
                                    sb4.append('\n');
                                    sb4.append(!tL_chatBannedRights4.send_media ? '+' : '-');
                                    sb4.append(' ');
                                    sb4.append(LocaleController.getString(R.string.EventLogRestrictedSendMedia));
                                }
                                if (tL_chatBannedRights3.send_polls != tL_chatBannedRights4.send_polls) {
                                    if (!z6) {
                                        sb4.append('\n');
                                        z6 = true;
                                    }
                                    sb4.append('\n');
                                    sb4.append(!tL_chatBannedRights4.send_polls ? '+' : '-');
                                    sb4.append(' ');
                                    sb4.append(LocaleController.getString(R.string.EventLogRestrictedSendPolls));
                                }
                                if (tL_chatBannedRights3.embed_links != tL_chatBannedRights4.embed_links) {
                                    if (!z6) {
                                        sb4.append('\n');
                                        z6 = true;
                                    }
                                    sb4.append('\n');
                                    sb4.append(!tL_chatBannedRights4.embed_links ? '+' : '-');
                                    sb4.append(' ');
                                    sb4.append(LocaleController.getString(R.string.EventLogRestrictedSendEmbed));
                                }
                                if (tL_chatBannedRights3.change_info != tL_chatBannedRights4.change_info) {
                                    if (!z6) {
                                        sb4.append('\n');
                                        z6 = true;
                                    }
                                    sb4.append('\n');
                                    sb4.append(!tL_chatBannedRights4.change_info ? '+' : '-');
                                    sb4.append(' ');
                                    sb4.append(LocaleController.getString(R.string.EventLogRestrictedChangeInfo));
                                }
                                if (tL_chatBannedRights3.invite_users != tL_chatBannedRights4.invite_users) {
                                    if (!z6) {
                                        sb4.append('\n');
                                        z6 = true;
                                    }
                                    sb4.append('\n');
                                    sb4.append(!tL_chatBannedRights4.invite_users ? '+' : '-');
                                    sb4.append(' ');
                                    sb4.append(LocaleController.getString(R.string.EventLogRestrictedInviteUsers));
                                }
                                if (tL_chatBannedRights3.pin_messages != tL_chatBannedRights4.pin_messages) {
                                    if (!z6) {
                                        sb4.append('\n');
                                    }
                                    sb4.append('\n');
                                    sb4.append(!tL_chatBannedRights4.pin_messages ? '+' : '-');
                                    sb4.append(' ');
                                    sb4.append(LocaleController.getString(R.string.EventLogRestrictedPinMessages));
                                }
                                if (tL_chatBannedRights3.edit_rank != tL_chatBannedRights4.edit_rank) {
                                    if (!z6) {
                                        sb4.append('\n');
                                    }
                                    sb4.append('\n');
                                    sb4.append(!tL_chatBannedRights4.edit_rank ? '+' : '-');
                                    sb4.append(' ');
                                    sb4.append(LocaleController.getString(R.string.EventLogRestrictedEditRank));
                                }
                                if (tL_chatBannedRights3.send_reactions != tL_chatBannedRights4.send_reactions) {
                                    if (z6) {
                                        c3 = '\n';
                                    } else {
                                        c3 = '\n';
                                        sb4.append('\n');
                                    }
                                    sb4.append(c3);
                                    sb4.append(!tL_chatBannedRights4.send_reactions ? '+' : '-');
                                    sb4.append(' ');
                                    sb4.append(LocaleController.getString(R.string.EventLogRestrictedSendReactions));
                                }
                                this.messageText = sb4.toString();
                            } else {
                                user3 = user;
                                str = "";
                                if (tL_chatBannedRights4 != null && (tL_chatBannedRights3 == null || tL_chatBannedRights4.view_messages)) {
                                    string3 = LocaleController.getString(R.string.EventLogChannelRestricted);
                                } else {
                                    string3 = LocaleController.getString(R.string.EventLogChannelUnrestricted);
                                }
                                this.messageText = String.format(string3, getUserName(chat7, this.messageOwner.entities, string3.indexOf("%1$s")));
                            }
                            tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                            chat2 = chat;
                            user = user3;
                        } else {
                            str = "";
                            if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionUpdatePinned) {
                                TLRPC.TL_channelAdminLogEventActionUpdatePinned tL_channelAdminLogEventActionUpdatePinned = (TLRPC.TL_channelAdminLogEventActionUpdatePinned) channelAdminLogEventAction;
                                message2 = tL_channelAdminLogEventActionUpdatePinned.message;
                                user = user;
                                if (user != null && user.id == 136817688 && (messageFwdHeader = message2.fwd_from) != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerChannel)) {
                                    TLRPC.Chat chat9 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(tL_channelAdminLogEventActionUpdatePinned.message.fwd_from.from_id.channel_id));
                                    TLRPC.Message message4 = tL_channelAdminLogEventActionUpdatePinned.message;
                                    if ((message4 instanceof TLRPC.TL_messageEmpty) || !message4.pinned) {
                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogUnpinnedMessages), "un1", chat9);
                                    } else {
                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogPinnedMessages), "un1", chat9);
                                    }
                                } else if ((message2 instanceof TLRPC.TL_messageEmpty) || !message2.pinned) {
                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogUnpinnedMessages), "un1", user);
                                } else {
                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogPinnedMessages), "un1", user);
                                }
                            } else {
                                user = user;
                                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionStopPoll) {
                                    message2 = ((TLRPC.TL_channelAdminLogEventActionStopPoll) channelAdminLogEventAction).message;
                                    if ((getMedia(message2) instanceof TLRPC.TL_messageMediaPoll) && ((TLRPC.TL_messageMediaPoll) getMedia(message2)).poll.quiz) {
                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogStopQuiz), "un1", user);
                                    } else {
                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogStopPoll), "un1", user);
                                    }
                                } else {
                                    if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleSignatures) {
                                        if (((TLRPC.TL_channelAdminLogEventActionToggleSignatures) channelAdminLogEventAction).new_value) {
                                            this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogToggledSignaturesOn), "un1", user);
                                        } else {
                                            this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogToggledSignaturesOff), "un1", user);
                                        }
                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantSubExtend) {
                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogSubExtend), "un1", user);
                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleSignatureProfiles) {
                                        if (((TLRPC.TL_channelAdminLogEventActionToggleSignatureProfiles) channelAdminLogEventAction).value) {
                                            this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogToggledSignaturesProfilesOn), "un1", user);
                                        } else {
                                            this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogToggledSignaturesProfilesOff), "un1", user);
                                        }
                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleInvites) {
                                        if (((TLRPC.TL_channelAdminLogEventActionToggleInvites) channelAdminLogEventAction).new_value) {
                                            this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogToggledInvitesOn), "un1", user);
                                        } else {
                                            this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogToggledInvitesOff), "un1", user);
                                        }
                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                                        message2 = ((TLRPC.TL_channelAdminLogEventActionDeleteMessage) channelAdminLogEventAction).message;
                                        if (user != null && user.id == MessagesController.getInstance(this.currentAccount).telegramAntispamUserId) {
                                            this.messageText = LocaleController.getString(R.string.EventLogDeletedMessages).replace("un1", UserObject.getUserName(user));
                                        } else {
                                            this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogDeletedMessages), "un1", user);
                                        }
                                    } else {
                                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeLinkedChat) {
                                            TLRPC.TL_channelAdminLogEventActionChangeLinkedChat tL_channelAdminLogEventActionChangeLinkedChat = (TLRPC.TL_channelAdminLogEventActionChangeLinkedChat) channelAdminLogEventAction;
                                            long j = tL_channelAdminLogEventActionChangeLinkedChat.new_value;
                                            long j2 = tL_channelAdminLogEventActionChangeLinkedChat.prev_value;
                                            chat3 = chat;
                                            if (chat3.megagroup) {
                                                if (j == 0) {
                                                    TLRPC.Chat chat10 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j2));
                                                    CharSequence replaceWithLink2 = replaceWithLink(LocaleController.getString(R.string.EventLogRemovedLinkedChannel), "un1", user);
                                                    this.messageText = replaceWithLink2;
                                                    this.messageText = replaceWithLink(replaceWithLink2, "un2", chat10);
                                                } else {
                                                    TLRPC.Chat chat11 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
                                                    CharSequence replaceWithLink3 = replaceWithLink(LocaleController.getString(R.string.EventLogChangedLinkedChannel), "un1", user);
                                                    this.messageText = replaceWithLink3;
                                                    this.messageText = replaceWithLink(replaceWithLink3, "un2", chat11);
                                                }
                                            } else if (j == 0) {
                                                TLRPC.Chat chat12 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j2));
                                                CharSequence replaceWithLink4 = replaceWithLink(LocaleController.getString(R.string.EventLogRemovedLinkedGroup), "un1", user);
                                                this.messageText = replaceWithLink4;
                                                this.messageText = replaceWithLink(replaceWithLink4, "un2", chat12);
                                            } else {
                                                TLRPC.Chat chat13 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
                                                CharSequence replaceWithLink5 = replaceWithLink(LocaleController.getString(R.string.EventLogChangedLinkedGroup), "un1", user);
                                                this.messageText = replaceWithLink5;
                                                this.messageText = replaceWithLink(replaceWithLink5, "un2", chat13);
                                            }
                                        } else {
                                            chat3 = chat;
                                            if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionTogglePreHistoryHidden) {
                                                if (((TLRPC.TL_channelAdminLogEventActionTogglePreHistoryHidden) channelAdminLogEventAction).new_value) {
                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogToggledInvitesHistoryOff), "un1", user);
                                                } else {
                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogToggledInvitesHistoryOn), "un1", user);
                                                }
                                            } else {
                                                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeAbout) {
                                                    this.messageText = replaceWithLink(LocaleController.getString(chat3.megagroup ? R.string.EventLogEditedGroupDescription : R.string.EventLogEditedChannelDescription), "un1", user);
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
                                                        str3 = str;
                                                        webPage2.display_url = str3;
                                                        webPage2.url = str3;
                                                        webPage2.site_name = LocaleController.getString(R.string.EventLogPreviousGroupDescription);
                                                        message.media.webpage.description = ((TLRPC.TL_channelAdminLogEventActionChangeAbout) tL_channelAdminLogEvent2.action).prev_value;
                                                    } else {
                                                        str3 = str;
                                                        message.media = new TLRPC.TL_messageMediaEmpty();
                                                    }
                                                } else {
                                                    tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                                    str3 = str;
                                                    if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeTheme) {
                                                        this.messageText = replaceWithLink(LocaleController.getString(chat3.megagroup ? R.string.EventLogEditedGroupTheme : R.string.EventLogEditedChannelTheme), "un1", user);
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
                                                            webPage3.display_url = str3;
                                                            webPage3.url = str3;
                                                            webPage3.site_name = LocaleController.getString(R.string.EventLogPreviousGroupTheme);
                                                            message.media.webpage.description = ((TLRPC.TL_channelAdminLogEventActionChangeTheme) tL_channelAdminLogEvent2.action).prev_value;
                                                        } else {
                                                            message.media = new TLRPC.TL_messageMediaEmpty();
                                                        }
                                                    } else {
                                                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeUsername) {
                                                            String str10 = ((TLRPC.TL_channelAdminLogEventActionChangeUsername) channelAdminLogEventAction).new_value;
                                                            if (TextUtils.isEmpty(str10)) {
                                                                this.messageText = replaceWithLink(LocaleController.getString(chat3.megagroup ? R.string.EventLogRemovedGroupLink : R.string.EventLogRemovedChannelLink), "un1", user);
                                                            } else {
                                                                this.messageText = replaceWithLink(LocaleController.getString(chat3.megagroup ? R.string.EventLogChangedGroupLink : R.string.EventLogChangedChannelLink), "un1", user);
                                                            }
                                                            TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                                                            tL_message3.out = false;
                                                            tL_message3.unread = false;
                                                            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                                                            tL_message3.from_id = tL_peerUser3;
                                                            tL_peerUser3.user_id = tL_channelAdminLogEvent2.user_id;
                                                            tL_message3.peer_id = tL_peerChannel;
                                                            tL_message3.date = tL_channelAdminLogEvent2.date;
                                                            if (!TextUtils.isEmpty(str10)) {
                                                                StringBuilder sb5 = new StringBuilder();
                                                                str8 = str2;
                                                                sb5.append(str8);
                                                                sb5.append(MessagesController.getInstance(this.currentAccount).linkPrefix);
                                                                str7 = "/";
                                                                sb5.append(str7);
                                                                sb5.append(str10);
                                                                tL_message3.message = sb5.toString();
                                                            } else {
                                                                str7 = "/";
                                                                str8 = str2;
                                                                tL_message3.message = str3;
                                                            }
                                                            TLRPC.TL_messageEntityUrl tL_messageEntityUrl = new TLRPC.TL_messageEntityUrl();
                                                            tL_messageEntityUrl.offset = 0;
                                                            tL_messageEntityUrl.length = tL_message3.message.length();
                                                            tL_message3.entities.add(tL_messageEntityUrl);
                                                            if (!TextUtils.isEmpty(((TLRPC.TL_channelAdminLogEventActionChangeUsername) tL_channelAdminLogEvent2.action).prev_value)) {
                                                                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage3 = new TLRPC.TL_messageMediaWebPage();
                                                                tL_message3.media = tL_messageMediaWebPage3;
                                                                tL_messageMediaWebPage3.webpage = new TLRPC.TL_webPage();
                                                                TLRPC.WebPage webPage4 = tL_message3.media.webpage;
                                                                webPage4.flags = 10;
                                                                webPage4.display_url = str3;
                                                                webPage4.url = str3;
                                                                webPage4.site_name = LocaleController.getString(R.string.EventLogPreviousLink);
                                                                tL_message3.media.webpage.description = str8 + MessagesController.getInstance(this.currentAccount).linkPrefix + str7 + ((TLRPC.TL_channelAdminLogEventActionChangeUsername) tL_channelAdminLogEvent2.action).prev_value;
                                                            } else {
                                                                tL_message3.media = new TLRPC.TL_messageMediaEmpty();
                                                            }
                                                            chat2 = chat3;
                                                            message2 = tL_message3;
                                                            str = str3;
                                                            arrayList3 = null;
                                                            if (this.messageOwner == null) {
                                                                this.messageOwner = new TLRPC.TL_messageService();
                                                            }
                                                            this.messageOwner.message = this.messageText.toString();
                                                            this.messageOwner.from_id = new TLRPC.TL_peerUser();
                                                            TLRPC.Message message5 = this.messageOwner;
                                                            message5.from_id.user_id = tL_channelAdminLogEvent2.user_id;
                                                            message5.date = tL_channelAdminLogEvent2.date;
                                                            int i18 = iArr[0];
                                                            iArr[0] = i18 + 1;
                                                            message5.id = i18;
                                                            this.eventId = tL_channelAdminLogEvent2.id;
                                                            message5.out = false;
                                                            message5.peer_id = new TLRPC.TL_peerChannel();
                                                            TLRPC.Message message6 = this.messageOwner;
                                                            message6.peer_id.channel_id = chat2.id;
                                                            message6.unread = false;
                                                            MediaController mediaController = MediaController.getInstance();
                                                            this.isOutOwnerCached = null;
                                                            message3 = message2 instanceof TLRPC.TL_messageEmpty ? null : message2;
                                                            if (message3 != null) {
                                                                message3.out = false;
                                                                message3.realId = message3.id;
                                                                int i19 = iArr[0];
                                                                iArr[0] = i19 + 1;
                                                                message3.id = i19;
                                                                message3.flags &= -32769;
                                                                message3.dialog_id = -chat2.id;
                                                                if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                                                                    i6 = message3.date;
                                                                    message3.date = tL_channelAdminLogEvent2.date;
                                                                } else {
                                                                    i6 = 0;
                                                                }
                                                                MessageObject messageObject = new MessageObject(this.currentAccount, message3, (AbstractMap<Long, TLRPC.User>) null, (AbstractMap<Long, TLRPC.Chat>) null, true, true, this.eventId);
                                                                messageObject.realDate = i6;
                                                                messageObject.currentEvent = tL_channelAdminLogEvent2;
                                                                if (messageObject.contentType >= 0) {
                                                                    if (mediaController.isPlayingMessage(messageObject)) {
                                                                        MessageObject playingMessageObject = mediaController.getPlayingMessageObject();
                                                                        messageObject.audioProgress = playingMessageObject.audioProgress;
                                                                        messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
                                                                    }
                                                                    createDateArray(this.currentAccount, tL_channelAdminLogEvent, arrayList, hashMap, z);
                                                                    if (z) {
                                                                        arrayList4 = arrayList;
                                                                        arrayList4.add(0, messageObject);
                                                                    } else {
                                                                        arrayList4 = arrayList;
                                                                        arrayList4.add(arrayList.size() - 1, messageObject);
                                                                    }
                                                                } else {
                                                                    arrayList4 = arrayList;
                                                                    this.contentType = -1;
                                                                }
                                                                if (arrayList3 != null) {
                                                                    messageObject.webPageDescriptionEntities = arrayList3;
                                                                    iArr2 = null;
                                                                    messageObject.linkDescription = null;
                                                                    messageObject.generateLinkDescription();
                                                                    if ((tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) && this.contentType >= 0) {
                                                                        createDateArray(this.currentAccount, tL_channelAdminLogEvent, arrayList, hashMap, z);
                                                                        if (!z) {
                                                                            arrayList4.add(0, this);
                                                                        } else {
                                                                            arrayList4.add(arrayList.size() - 1, this);
                                                                        }
                                                                        if (this.messageText == null) {
                                                                            this.messageText = str;
                                                                        }
                                                                        if (!(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame)) {
                                                                            textPaint = Theme.chat_msgGameTextPaint;
                                                                        } else {
                                                                            textPaint = Theme.chat_msgTextPaint;
                                                                        }
                                                                        iArr2 = allowsBigEmoji() ? new int[1] : iArr2;
                                                                        CharSequence replaceEmoji = Emoji.replaceEmoji(this.messageText, textPaint.getFontMetricsInt(), false, iArr2);
                                                                        this.messageText = replaceEmoji;
                                                                        replaceAnimatedEmoji = replaceAnimatedEmoji(replaceEmoji, textPaint.getFontMetricsInt());
                                                                        this.messageText = replaceAnimatedEmoji;
                                                                        if (iArr2 != null && iArr2[0] > 1) {
                                                                            replaceEmojiToLottieFrame(replaceAnimatedEmoji, iArr2);
                                                                        }
                                                                        checkEmojiOnly(iArr2);
                                                                        setType();
                                                                        measureInlineBotButtons();
                                                                        generateCaption();
                                                                        if (mediaController.isPlayingMessage(this)) {
                                                                            MessageObject playingMessageObject2 = mediaController.getPlayingMessageObject();
                                                                            this.audioProgress = playingMessageObject2.audioProgress;
                                                                            this.audioProgressSec = playingMessageObject2.audioProgressSec;
                                                                        }
                                                                        generateLayout(user);
                                                                        this.layoutCreated = true;
                                                                        generateThumbs(false);
                                                                        checkMediaExistance();
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                            } else {
                                                                arrayList4 = arrayList;
                                                            }
                                                            iArr2 = null;
                                                            if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                                                                return;
                                                            }
                                                            createDateArray(this.currentAccount, tL_channelAdminLogEvent, arrayList, hashMap, z);
                                                            if (!z) {
                                                            }
                                                            if (this.messageText == null) {
                                                            }
                                                            if (!(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame)) {
                                                            }
                                                            if (allowsBigEmoji()) {
                                                            }
                                                            CharSequence replaceEmoji2 = Emoji.replaceEmoji(this.messageText, textPaint.getFontMetricsInt(), false, iArr2);
                                                            this.messageText = replaceEmoji2;
                                                            replaceAnimatedEmoji = replaceAnimatedEmoji(replaceEmoji2, textPaint.getFontMetricsInt());
                                                            this.messageText = replaceAnimatedEmoji;
                                                            if (iArr2 != null) {
                                                                replaceEmojiToLottieFrame(replaceAnimatedEmoji, iArr2);
                                                            }
                                                            checkEmojiOnly(iArr2);
                                                            setType();
                                                            measureInlineBotButtons();
                                                            generateCaption();
                                                            if (mediaController.isPlayingMessage(this)) {
                                                            }
                                                            generateLayout(user);
                                                            this.layoutCreated = true;
                                                            generateThumbs(false);
                                                            checkMediaExistance();
                                                            return;
                                                        }
                                                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionEditMessage) {
                                                            message = new TLRPC.TL_message();
                                                            message.out = false;
                                                            message.unread = false;
                                                            message.peer_id = tL_peerChannel;
                                                            message.date = tL_channelAdminLogEvent2.date;
                                                            TLRPC.TL_channelAdminLogEventActionEditMessage tL_channelAdminLogEventActionEditMessage = (TLRPC.TL_channelAdminLogEventActionEditMessage) tL_channelAdminLogEvent2.action;
                                                            TLRPC.Message message7 = tL_channelAdminLogEventActionEditMessage.new_message;
                                                            TLRPC.Message message8 = tL_channelAdminLogEventActionEditMessage.prev_message;
                                                            if (message8 != null) {
                                                                message.reply_to = message8.reply_to;
                                                                message.id = message8.id;
                                                            } else if (message7 != null) {
                                                                message.reply_to = message7.reply_to;
                                                                message.id = message7.id;
                                                            }
                                                            if (message7 != null && (peer = message7.from_id) != null) {
                                                                message.from_id = peer;
                                                            } else {
                                                                TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
                                                                message.from_id = tL_peerUser4;
                                                                tL_peerUser4.user_id = tL_channelAdminLogEvent2.user_id;
                                                            }
                                                            if (getMedia(message7) != null && !(getMedia(message7) instanceof TLRPC.TL_messageMediaEmpty) && !(getMedia(message7) instanceof TLRPC.TL_messageMediaWebPage)) {
                                                                boolean equals = TextUtils.equals(message7.message, message8.message);
                                                                TLRPC.MessageMedia media = getMedia(message7);
                                                                TLRPC.MessageMedia media2 = getMedia(message8);
                                                                if (media2 == null) {
                                                                    str5 = str3;
                                                                } else {
                                                                    if (media.getClass() == media2.getClass()) {
                                                                        TLRPC.Photo photo = media.photo;
                                                                        if (photo == null || (r12 = media2.photo) == null) {
                                                                            str5 = str3;
                                                                        } else {
                                                                            str5 = str3;
                                                                        }
                                                                        z4 = (media.document == null || media2.document == null || getMedia(message7).document.id == media2.document.id) ? false : true;
                                                                    } else {
                                                                        str5 = str3;
                                                                    }
                                                                    z4 = false;
                                                                    z5 = true;
                                                                    if (!z4) {
                                                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogAddedMedia), "un1", user);
                                                                    } else if (z5 && !equals) {
                                                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogEditedMediaCaption), "un1", user);
                                                                    } else if (!equals) {
                                                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogEditedCaption), "un1", user);
                                                                    } else {
                                                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogEditedMedia), "un1", user);
                                                                    }
                                                                    TLRPC.MessageMedia media3 = getMedia(message7);
                                                                    message.media = media3;
                                                                    if (!equals) {
                                                                        media3.webpage = new TLRPC.TL_webPage();
                                                                        message.media.webpage.site_name = LocaleController.getString(R.string.EventLogOriginalCaption);
                                                                        if (TextUtils.isEmpty(message8.message)) {
                                                                            message.media.webpage.description = LocaleController.getString(R.string.EventLogOriginalCaptionEmpty);
                                                                        } else {
                                                                            message.media.webpage.description = message8.message;
                                                                            arrayList2 = message8.entities;
                                                                            message.reply_markup = message7.reply_markup;
                                                                            webPage = message.media.webpage;
                                                                            if (webPage != null) {
                                                                            }
                                                                            arrayList3 = arrayList2;
                                                                            str = str6;
                                                                            TLRPC.Message message9 = message;
                                                                            chat2 = chat3;
                                                                            message2 = message9;
                                                                        }
                                                                    }
                                                                    arrayList2 = null;
                                                                    message.reply_markup = message7.reply_markup;
                                                                    webPage = message.media.webpage;
                                                                    if (webPage != null) {
                                                                    }
                                                                    arrayList3 = arrayList2;
                                                                    str = str6;
                                                                    TLRPC.Message message92 = message;
                                                                    chat2 = chat3;
                                                                    message2 = message92;
                                                                }
                                                                z5 = false;
                                                                if (!z4) {
                                                                }
                                                                TLRPC.MessageMedia media32 = getMedia(message7);
                                                                message.media = media32;
                                                                if (!equals) {
                                                                }
                                                                arrayList2 = null;
                                                                message.reply_markup = message7.reply_markup;
                                                                webPage = message.media.webpage;
                                                                if (webPage != null) {
                                                                }
                                                                arrayList3 = arrayList2;
                                                                str = str6;
                                                                TLRPC.Message message922 = message;
                                                                chat2 = chat3;
                                                                message2 = message922;
                                                            } else {
                                                                str5 = str3;
                                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogEditedMessages), "un1", user);
                                                                if (message7.action instanceof TLRPC.TL_messageActionGroupCall) {
                                                                    message7.media = new TLRPC.TL_messageMediaEmpty();
                                                                    message = message7;
                                                                } else {
                                                                    message.message = message7.message;
                                                                    message.entities = message7.entities;
                                                                    TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage4 = new TLRPC.TL_messageMediaWebPage();
                                                                    message.media = tL_messageMediaWebPage4;
                                                                    tL_messageMediaWebPage4.webpage = new TLRPC.TL_webPage();
                                                                    message.media.webpage.site_name = LocaleController.getString(R.string.EventLogOriginalMessages);
                                                                    if (TextUtils.isEmpty(message8.message)) {
                                                                        message.media.webpage.description = LocaleController.getString(R.string.EventLogOriginalCaptionEmpty);
                                                                    } else {
                                                                        message.media.webpage.description = message8.message;
                                                                        arrayList2 = message8.entities;
                                                                        message.reply_markup = message7.reply_markup;
                                                                        webPage = message.media.webpage;
                                                                        if (webPage != null) {
                                                                            webPage.flags = 10;
                                                                            str6 = str5;
                                                                            webPage.display_url = str6;
                                                                            webPage.url = str6;
                                                                        } else {
                                                                            str6 = str5;
                                                                        }
                                                                        arrayList3 = arrayList2;
                                                                        str = str6;
                                                                        TLRPC.Message message9222 = message;
                                                                        chat2 = chat3;
                                                                        message2 = message9222;
                                                                    }
                                                                }
                                                                arrayList2 = null;
                                                                message.reply_markup = message7.reply_markup;
                                                                webPage = message.media.webpage;
                                                                if (webPage != null) {
                                                                }
                                                                arrayList3 = arrayList2;
                                                                str = str6;
                                                                TLRPC.Message message92222 = message;
                                                                chat2 = chat3;
                                                                message2 = message92222;
                                                            }
                                                            if (this.messageOwner == null) {
                                                            }
                                                            this.messageOwner.message = this.messageText.toString();
                                                            this.messageOwner.from_id = new TLRPC.TL_peerUser();
                                                            TLRPC.Message message52 = this.messageOwner;
                                                            message52.from_id.user_id = tL_channelAdminLogEvent2.user_id;
                                                            message52.date = tL_channelAdminLogEvent2.date;
                                                            int i182 = iArr[0];
                                                            iArr[0] = i182 + 1;
                                                            message52.id = i182;
                                                            this.eventId = tL_channelAdminLogEvent2.id;
                                                            message52.out = false;
                                                            message52.peer_id = new TLRPC.TL_peerChannel();
                                                            TLRPC.Message message62 = this.messageOwner;
                                                            message62.peer_id.channel_id = chat2.id;
                                                            message62.unread = false;
                                                            MediaController mediaController2 = MediaController.getInstance();
                                                            this.isOutOwnerCached = null;
                                                            if (message2 instanceof TLRPC.TL_messageEmpty) {
                                                            }
                                                            if (message3 != null) {
                                                            }
                                                            iArr2 = null;
                                                            if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                                                            }
                                                        } else {
                                                            if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeEmojiStickerSet) {
                                                                TLRPC.InputStickerSet inputStickerSet = ((TLRPC.TL_channelAdminLogEventActionChangeEmojiStickerSet) channelAdminLogEventAction).new_stickerset;
                                                                if (inputStickerSet == null || (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogRemovedEmojiPack), "un1", user);
                                                                } else {
                                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogChangedEmojiPack), "un1", user);
                                                                }
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeStickerSet) {
                                                                TLRPC.InputStickerSet inputStickerSet2 = ((TLRPC.TL_channelAdminLogEventActionChangeStickerSet) channelAdminLogEventAction).new_stickerset;
                                                                if (inputStickerSet2 == null || (inputStickerSet2 instanceof TLRPC.TL_inputStickerSetEmpty)) {
                                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogRemovedStickersSet), "un1", user);
                                                                } else {
                                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogChangedStickersSet), "un1", user);
                                                                }
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeLocation) {
                                                                TLRPC.ChannelLocation channelLocation = ((TLRPC.TL_channelAdminLogEventActionChangeLocation) channelAdminLogEventAction).new_value;
                                                                if (channelLocation instanceof TLRPC.TL_channelLocationEmpty) {
                                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogRemovedLocation), "un1", user);
                                                                } else {
                                                                    this.messageText = replaceWithLink(LocaleController.formatString("EventLogChangedLocation", R.string.EventLogChangedLocation, ((TLRPC.TL_channelLocation) channelLocation).address), "un1", user);
                                                                }
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleSlowMode) {
                                                                int i20 = ((TLRPC.TL_channelAdminLogEventActionToggleSlowMode) channelAdminLogEventAction).new_value;
                                                                if (i20 == 0) {
                                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogToggledSlowmodeOff), "un1", user);
                                                                } else {
                                                                    if (i20 < 60) {
                                                                        c2 = 0;
                                                                        formatPluralString2 = LocaleController.formatPluralString("Seconds", i20, new Object[0]);
                                                                    } else {
                                                                        c2 = 0;
                                                                        if (i20 < 3600) {
                                                                            formatPluralString2 = LocaleController.formatPluralString("Minutes", i20 / 60, new Object[0]);
                                                                        } else {
                                                                            formatPluralString2 = LocaleController.formatPluralString("Hours", (i20 / 60) / 60, new Object[0]);
                                                                        }
                                                                    }
                                                                    int i21 = R.string.EventLogToggledSlowmodeOn;
                                                                    Object[] objArr = new Object[1];
                                                                    objArr[c2] = formatPluralString2;
                                                                    this.messageText = replaceWithLink(LocaleController.formatString(i21, objArr), "un1", user);
                                                                }
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleAutotranslation) {
                                                                this.messageText = replaceWithLink(LocaleController.getString(((TLRPC.TL_channelAdminLogEventActionToggleAutotranslation) channelAdminLogEventAction).new_value ? R.string.EventLogToggledAutotranslationOn : R.string.EventLogToggledAutotranslationOff), "un1", user);
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionStartGroupCall) {
                                                                if (ChatObject.isChannel(chat) && (!chat3.megagroup || chat3.gigagroup)) {
                                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogStartedLiveStream), "un1", user);
                                                                } else {
                                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogStartedVoiceChat), "un1", user);
                                                                }
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDiscardGroupCall) {
                                                                if (ChatObject.isChannel(chat) && (!chat3.megagroup || chat3.gigagroup)) {
                                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogEndedLiveStream), "un1", user);
                                                                } else {
                                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogEndedVoiceChat), "un1", user);
                                                                }
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantMute) {
                                                                long peerId3 = getPeerId(((TLRPC.TL_channelAdminLogEventActionParticipantMute) channelAdminLogEventAction).participant.peer);
                                                                if (peerId3 > 0) {
                                                                    chat6 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId3));
                                                                } else {
                                                                    chat6 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId3));
                                                                }
                                                                CharSequence replaceWithLink6 = replaceWithLink(LocaleController.getString(R.string.EventLogVoiceChatMuted), "un1", user);
                                                                this.messageText = replaceWithLink6;
                                                                this.messageText = replaceWithLink(replaceWithLink6, "un2", chat6);
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantUnmute) {
                                                                long peerId4 = getPeerId(((TLRPC.TL_channelAdminLogEventActionParticipantUnmute) channelAdminLogEventAction).participant.peer);
                                                                if (peerId4 > 0) {
                                                                    chat5 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId4));
                                                                } else {
                                                                    chat5 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId4));
                                                                }
                                                                CharSequence replaceWithLink7 = replaceWithLink(LocaleController.getString(R.string.EventLogVoiceChatUnmuted), "un1", user);
                                                                this.messageText = replaceWithLink7;
                                                                this.messageText = replaceWithLink(replaceWithLink7, "un2", chat5);
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleGroupCallSetting) {
                                                                if (((TLRPC.TL_channelAdminLogEventActionToggleGroupCallSetting) channelAdminLogEventAction).join_muted) {
                                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogVoiceChatNotAllowedToSpeak), "un1", user);
                                                                } else {
                                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogVoiceChatAllowedToSpeak), "un1", user);
                                                                }
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) {
                                                                TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite tL_channelAdminLogEventActionParticipantJoinByInvite = (TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) channelAdminLogEventAction;
                                                                if (tL_channelAdminLogEventActionParticipantJoinByInvite.via_chatlist) {
                                                                    this.messageText = replaceWithLink(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.ActionInviteChannelUserFolder : R.string.ActionInviteUserFolder), "un1", user);
                                                                } else {
                                                                    this.messageText = replaceWithLink(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.ActionInviteChannelUser : R.string.ActionInviteUser), "un1", user);
                                                                }
                                                                TLRPC.TL_chatInviteExported tL_chatInviteExported = tL_channelAdminLogEventActionParticipantJoinByInvite.invite;
                                                                if (tL_chatInviteExported != null && !TextUtils.isEmpty(tL_chatInviteExported.link)) {
                                                                    this.messageText = TextUtils.concat(this.messageText, " ", tL_channelAdminLogEventActionParticipantJoinByInvite.invite.link);
                                                                }
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleNoForwards) {
                                                                TLRPC.TL_channelAdminLogEventActionToggleNoForwards tL_channelAdminLogEventActionToggleNoForwards = (TLRPC.TL_channelAdminLogEventActionToggleNoForwards) channelAdminLogEventAction;
                                                                boolean z10 = ChatObject.isChannel(chat) && !chat3.megagroup;
                                                                if (tL_channelAdminLogEventActionToggleNoForwards.new_value) {
                                                                    if (z10) {
                                                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionForwardsRestrictedChannel), "un1", user);
                                                                    } else {
                                                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionForwardsRestrictedGroup), "un1", user);
                                                                    }
                                                                } else if (z10) {
                                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionForwardsEnabledChannel), "un1", user);
                                                                } else {
                                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionForwardsEnabledGroup), "un1", user);
                                                                }
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionExportedInviteDelete) {
                                                                CharSequence replaceWithLink8 = replaceWithLink(LocaleController.formatString(R.string.ActionDeletedInviteLinkClickable, new Object[0]), "un1", user);
                                                                this.messageText = replaceWithLink8;
                                                                this.messageText = replaceWithLink(replaceWithLink8, "un2", ((TLRPC.TL_channelAdminLogEventActionExportedInviteDelete) channelAdminLogEventAction).invite);
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke) {
                                                                TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = (TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke) channelAdminLogEventAction;
                                                                CharSequence replaceWithLink9 = replaceWithLink(LocaleController.formatString(R.string.ActionRevokedInviteLinkClickable, tL_channelAdminLogEventActionExportedInviteRevoke.invite.link), "un1", user);
                                                                this.messageText = replaceWithLink9;
                                                                this.messageText = replaceWithLink(replaceWithLink9, "un2", tL_channelAdminLogEventActionExportedInviteRevoke.invite);
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionExportedInviteEdit) {
                                                                TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = (TLRPC.TL_channelAdminLogEventActionExportedInviteEdit) channelAdminLogEventAction;
                                                                String str11 = tL_channelAdminLogEventActionExportedInviteEdit.prev_invite.link;
                                                                if (str11 != null && str11.equals(tL_channelAdminLogEventActionExportedInviteEdit.new_invite.link)) {
                                                                    this.messageText = replaceWithLink(LocaleController.formatString(R.string.ActionEditedInviteLinkToSameClickable, new Object[0]), "un1", user);
                                                                } else {
                                                                    this.messageText = replaceWithLink(LocaleController.formatString(R.string.ActionEditedInviteLinkClickable, new Object[0]), "un1", user);
                                                                }
                                                                CharSequence replaceWithLink10 = replaceWithLink(this.messageText, "un2", tL_channelAdminLogEventActionExportedInviteEdit.prev_invite);
                                                                this.messageText = replaceWithLink10;
                                                                this.messageText = replaceWithLink(replaceWithLink10, "un3", tL_channelAdminLogEventActionExportedInviteEdit.new_invite);
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantVolume) {
                                                                long peerId5 = getPeerId(((TLRPC.TL_channelAdminLogEventActionParticipantVolume) channelAdminLogEventAction).participant.peer);
                                                                if (peerId5 > 0) {
                                                                    chat4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId5));
                                                                } else {
                                                                    chat4 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId5));
                                                                }
                                                                double participantVolume = ChatObject.getParticipantVolume(r8.participant) / 100.0d;
                                                                CharSequence replaceWithLink11 = replaceWithLink(LocaleController.formatString("ActionVolumeChanged", R.string.ActionVolumeChanged, Integer.valueOf((int) (participantVolume > 0.0d ? Math.max(participantVolume, 1.0d) : 0.0d))), "un1", user);
                                                                this.messageText = replaceWithLink11;
                                                                this.messageText = replaceWithLink(replaceWithLink11, "un2", chat4);
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL) {
                                                                TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL tL_channelAdminLogEventActionChangeHistoryTTL = (TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL) channelAdminLogEventAction;
                                                                if (!chat3.megagroup) {
                                                                    int i22 = tL_channelAdminLogEventActionChangeHistoryTTL.new_value;
                                                                    if (i22 != 0) {
                                                                        this.messageText = LocaleController.formatString("ActionTTLChannelChanged", R.string.ActionTTLChannelChanged, LocaleController.formatTTLString(i22));
                                                                    } else {
                                                                        this.messageText = LocaleController.getString(R.string.ActionTTLChannelDisabled);
                                                                    }
                                                                } else {
                                                                    int i23 = tL_channelAdminLogEventActionChangeHistoryTTL.new_value;
                                                                    if (i23 == 0) {
                                                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionTTLDisabled), "un1", user);
                                                                    } else {
                                                                        if (i23 > 86400) {
                                                                            c = 0;
                                                                            formatPluralString = LocaleController.formatPluralString("Days", i23 / 86400, new Object[0]);
                                                                        } else {
                                                                            c = 0;
                                                                            if (i23 >= 3600) {
                                                                                formatPluralString = LocaleController.formatPluralString("Hours", i23 / 3600, new Object[0]);
                                                                            } else if (i23 >= 60) {
                                                                                formatPluralString = LocaleController.formatPluralString("Minutes", i23 / 60, new Object[0]);
                                                                            } else {
                                                                                formatPluralString = LocaleController.formatPluralString("Seconds", i23, new Object[0]);
                                                                            }
                                                                        }
                                                                        int i24 = R.string.ActionTTLChanged;
                                                                        Object[] objArr2 = new Object[1];
                                                                        objArr2[c] = formatPluralString;
                                                                        this.messageText = replaceWithLink(LocaleController.formatString(i24, objArr2), "un1", user);
                                                                    }
                                                                }
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest) {
                                                                TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest tL_channelAdminLogEventActionParticipantJoinByRequest = (TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest) channelAdminLogEventAction;
                                                                TLRPC.ExportedChatInvite exportedChatInvite = tL_channelAdminLogEventActionParticipantJoinByRequest.invite;
                                                                if (((exportedChatInvite instanceof TLRPC.TL_chatInviteExported) && "https://t.me/+PublicChat".equals(((TLRPC.TL_chatInviteExported) exportedChatInvite).link)) || (tL_channelAdminLogEventActionParticipantJoinByRequest.invite instanceof TLRPC.TL_chatInvitePublicJoinRequests)) {
                                                                    CharSequence replaceWithLink12 = replaceWithLink(LocaleController.getString(R.string.JoinedViaRequestApproved), "un1", user);
                                                                    this.messageText = replaceWithLink12;
                                                                    this.messageText = replaceWithLink(replaceWithLink12, "un2", MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_channelAdminLogEventActionParticipantJoinByRequest.approved_by)));
                                                                } else {
                                                                    CharSequence replaceWithLink13 = replaceWithLink(LocaleController.getString(R.string.JoinedViaInviteLinkApproved), "un1", user);
                                                                    this.messageText = replaceWithLink13;
                                                                    CharSequence replaceWithLink14 = replaceWithLink(replaceWithLink13, "un2", tL_channelAdminLogEventActionParticipantJoinByRequest.invite);
                                                                    this.messageText = replaceWithLink14;
                                                                    this.messageText = replaceWithLink(replaceWithLink14, "un3", MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_channelAdminLogEventActionParticipantJoinByRequest.approved_by)));
                                                                }
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionSendMessage) {
                                                                message = ((TLRPC.TL_channelAdminLogEventActionSendMessage) channelAdminLogEventAction).message;
                                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogSendMessages), "un1", user);
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantEditRank) {
                                                                TLRPC.TL_channelAdminLogEventActionParticipantEditRank tL_channelAdminLogEventActionParticipantEditRank = (TLRPC.TL_channelAdminLogEventActionParticipantEditRank) channelAdminLogEventAction;
                                                                if (tL_channelAdminLogEventActionParticipantEditRank.user_id == tL_channelAdminLogEvent2.user_id) {
                                                                    if (!TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.prev_rank) && !TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.new_rank)) {
                                                                        String formatString = LocaleController.formatString(R.string.EventLogRankSelfEdit, tL_channelAdminLogEventActionParticipantEditRank.prev_rank, tL_channelAdminLogEventActionParticipantEditRank.new_rank);
                                                                        this.messageText = formatString;
                                                                        this.messageText = replaceWithLink(formatString, "un1", user);
                                                                    } else if (TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.prev_rank) && !TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.new_rank)) {
                                                                        String formatString2 = LocaleController.formatString(R.string.EventLogRankSelfAdd, tL_channelAdminLogEventActionParticipantEditRank.new_rank);
                                                                        this.messageText = formatString2;
                                                                        this.messageText = replaceWithLink(formatString2, "un1", user);
                                                                    } else {
                                                                        String formatString3 = LocaleController.formatString(R.string.EventLogRankSelfRemove, tL_channelAdminLogEventActionParticipantEditRank.prev_rank);
                                                                        this.messageText = formatString3;
                                                                        this.messageText = replaceWithLink(formatString3, "un1", user);
                                                                    }
                                                                } else {
                                                                    TLRPC.User user6 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_channelAdminLogEventActionParticipantEditRank.user_id));
                                                                    if (!TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.prev_rank) && !TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.new_rank)) {
                                                                        String formatString4 = LocaleController.formatString(R.string.EventLogRankEdit, tL_channelAdminLogEventActionParticipantEditRank.prev_rank, tL_channelAdminLogEventActionParticipantEditRank.new_rank);
                                                                        this.messageText = formatString4;
                                                                        CharSequence replaceWithLink15 = replaceWithLink(formatString4, "un1", user);
                                                                        this.messageText = replaceWithLink15;
                                                                        this.messageText = replaceWithLink(replaceWithLink15, "un2", user6);
                                                                    } else if (TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.prev_rank) && !TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.new_rank)) {
                                                                        String formatString5 = LocaleController.formatString(R.string.EventLogRankAdd, tL_channelAdminLogEventActionParticipantEditRank.new_rank);
                                                                        this.messageText = formatString5;
                                                                        CharSequence replaceWithLink16 = replaceWithLink(formatString5, "un1", user);
                                                                        this.messageText = replaceWithLink16;
                                                                        this.messageText = replaceWithLink(replaceWithLink16, "un2", user6);
                                                                    } else {
                                                                        String formatString6 = LocaleController.formatString(R.string.EventLogRankRemove, tL_channelAdminLogEventActionParticipantEditRank.prev_rank);
                                                                        this.messageText = formatString6;
                                                                        CharSequence replaceWithLink17 = replaceWithLink(formatString6, "un1", user);
                                                                        this.messageText = replaceWithLink17;
                                                                        this.messageText = replaceWithLink(replaceWithLink17, "un2", user6);
                                                                    }
                                                                }
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeAvailableReactions) {
                                                                TLRPC.TL_channelAdminLogEventActionChangeAvailableReactions tL_channelAdminLogEventActionChangeAvailableReactions = (TLRPC.TL_channelAdminLogEventActionChangeAvailableReactions) channelAdminLogEventAction;
                                                                boolean z11 = (tL_channelAdminLogEventActionChangeAvailableReactions.prev_value instanceof TLRPC.TL_chatReactionsSome) && (tL_channelAdminLogEventActionChangeAvailableReactions.new_value instanceof TLRPC.TL_chatReactionsSome);
                                                                CharSequence stringFrom = getStringFrom(tL_channelAdminLogEventActionChangeAvailableReactions.new_value);
                                                                if (z11) {
                                                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replaceWithLink(LocaleController.formatString(R.string.ActionReactionsChangedList, "**new**"), "un1", user));
                                                                    int indexOf = spannableStringBuilder.toString().indexOf("**new**");
                                                                    if (indexOf > 0) {
                                                                        spannableStringBuilder.replace(indexOf, indexOf + 7, stringFrom);
                                                                    }
                                                                    this.messageText = spannableStringBuilder;
                                                                } else {
                                                                    CharSequence stringFrom2 = getStringFrom(tL_channelAdminLogEventActionChangeAvailableReactions.prev_value);
                                                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(replaceWithLink(LocaleController.formatString(R.string.ActionReactionsChanged, "**old**", "**new**"), "un1", user));
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
                                                                ArrayList<String> arrayList5 = tL_channelAdminLogEventActionChangeUsernames.prev_value;
                                                                ArrayList<String> arrayList6 = tL_channelAdminLogEventActionChangeUsernames.new_value;
                                                                this.messageText = null;
                                                                if (arrayList5 != null && arrayList6 != null) {
                                                                    if (arrayList6.size() + 1 == arrayList5.size()) {
                                                                        int i25 = 0;
                                                                        String str12 = null;
                                                                        while (true) {
                                                                            if (i25 >= arrayList5.size()) {
                                                                                break;
                                                                            }
                                                                            String str13 = arrayList5.get(i25);
                                                                            if (!arrayList6.contains(str13)) {
                                                                                if (str12 != null) {
                                                                                    str12 = null;
                                                                                    break;
                                                                                }
                                                                                str12 = str13;
                                                                            }
                                                                            i25++;
                                                                        }
                                                                        if (str12 != null) {
                                                                            this.messageText = replaceWithLink(LocaleController.formatString("EventLogDeactivatedUsername", R.string.EventLogDeactivatedUsername, "@" + str12), "un1", user);
                                                                        }
                                                                    } else if (arrayList5.size() + 1 == arrayList6.size()) {
                                                                        int i26 = 0;
                                                                        String str14 = null;
                                                                        while (true) {
                                                                            if (i26 >= arrayList6.size()) {
                                                                                break;
                                                                            }
                                                                            String str15 = arrayList6.get(i26);
                                                                            if (!arrayList5.contains(str15)) {
                                                                                if (str14 != null) {
                                                                                    str14 = null;
                                                                                    break;
                                                                                }
                                                                                str14 = str15;
                                                                            }
                                                                            i26++;
                                                                        }
                                                                        if (str14 != null) {
                                                                            this.messageText = replaceWithLink(LocaleController.formatString("EventLogActivatedUsername", R.string.EventLogActivatedUsername, "@" + str14), "un1", user);
                                                                        }
                                                                    }
                                                                }
                                                                if (this.messageText == null) {
                                                                    this.messageText = replaceWithLink(LocaleController.formatString("EventLogChangeUsernames", R.string.EventLogChangeUsernames, getUsernamesString(arrayList5), getUsernamesString(arrayList6)), "un1", user);
                                                                }
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleForum) {
                                                                if (((TLRPC.TL_channelAdminLogEventActionToggleForum) channelAdminLogEventAction).new_value) {
                                                                    this.messageText = replaceWithLink(LocaleController.formatString("EventLogSwitchToForum", R.string.EventLogSwitchToForum, new Object[0]), "un1", user);
                                                                } else {
                                                                    this.messageText = replaceWithLink(LocaleController.formatString("EventLogSwitchToGroup", R.string.EventLogSwitchToGroup, new Object[0]), "un1", user);
                                                                }
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionCreateTopic) {
                                                                CharSequence replaceWithLink18 = replaceWithLink(LocaleController.formatString("EventLogCreateTopic", R.string.EventLogCreateTopic, new Object[0]), "un1", user);
                                                                this.messageText = replaceWithLink18;
                                                                this.messageText = replaceWithLink(replaceWithLink18, "un2", ((TLRPC.TL_channelAdminLogEventActionCreateTopic) channelAdminLogEventAction).topic);
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionEditTopic) {
                                                                TLRPC.TL_channelAdminLogEventActionEditTopic tL_channelAdminLogEventActionEditTopic = (TLRPC.TL_channelAdminLogEventActionEditTopic) channelAdminLogEventAction;
                                                                TLRPC.ForumTopic forumTopic = tL_channelAdminLogEventActionEditTopic.prev_topic;
                                                                boolean z12 = forumTopic instanceof TLRPC.TL_forumTopic;
                                                                if (z12) {
                                                                    TLRPC.ForumTopic forumTopic2 = tL_channelAdminLogEventActionEditTopic.new_topic;
                                                                    if (forumTopic2 instanceof TLRPC.TL_forumTopic) {
                                                                        boolean z13 = ((TLRPC.TL_forumTopic) forumTopic).hidden;
                                                                        boolean z14 = ((TLRPC.TL_forumTopic) forumTopic2).hidden;
                                                                        if (z13 != z14) {
                                                                            this.messageText = replaceWithLink(LocaleController.getString(z14 ? R.string.TopicHidden2 : R.string.TopicShown2), "%s", user);
                                                                        }
                                                                    }
                                                                }
                                                                if (z12) {
                                                                    TLRPC.ForumTopic forumTopic3 = tL_channelAdminLogEventActionEditTopic.new_topic;
                                                                    if (forumTopic3 instanceof TLRPC.TL_forumTopic) {
                                                                        boolean z15 = ((TLRPC.TL_forumTopic) forumTopic).closed;
                                                                        boolean z16 = ((TLRPC.TL_forumTopic) forumTopic3).closed;
                                                                        if (z15 != z16) {
                                                                            if (z16) {
                                                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogClosedTopic), "%s", user);
                                                                            } else {
                                                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.EventLogReopenedTopic), "%s", user);
                                                                            }
                                                                            this.messageText = replaceWithLink(this.messageText, "un2", tL_channelAdminLogEventActionEditTopic.new_topic);
                                                                        }
                                                                    }
                                                                }
                                                                CharSequence replaceWithLink19 = replaceWithLink(LocaleController.getString(R.string.EventLogEditTopic), "un1", user);
                                                                this.messageText = replaceWithLink19;
                                                                CharSequence replaceWithLink20 = replaceWithLink(replaceWithLink19, "un2", tL_channelAdminLogEventActionEditTopic.prev_topic);
                                                                this.messageText = replaceWithLink20;
                                                                this.messageText = replaceWithLink(replaceWithLink20, "un3", tL_channelAdminLogEventActionEditTopic.new_topic);
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteTopic) {
                                                                CharSequence replaceWithLink21 = replaceWithLink(LocaleController.getString(R.string.EventLogDeleteTopic), "un1", user);
                                                                this.messageText = replaceWithLink21;
                                                                this.messageText = replaceWithLink(replaceWithLink21, "un2", ((TLRPC.TL_channelAdminLogEventActionDeleteTopic) channelAdminLogEventAction).topic);
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionPinTopic) {
                                                                TLRPC.TL_channelAdminLogEventActionPinTopic tL_channelAdminLogEventActionPinTopic = (TLRPC.TL_channelAdminLogEventActionPinTopic) channelAdminLogEventAction;
                                                                TLRPC.ForumTopic forumTopic4 = tL_channelAdminLogEventActionPinTopic.new_topic;
                                                                if ((forumTopic4 instanceof TLRPC.TL_forumTopic) && ((TLRPC.TL_forumTopic) forumTopic4).pinned) {
                                                                    CharSequence replaceWithLink22 = replaceWithLink(LocaleController.formatString("EventLogPinTopic", R.string.EventLogPinTopic, new Object[0]), "un1", user);
                                                                    this.messageText = replaceWithLink22;
                                                                    this.messageText = replaceWithLink(replaceWithLink22, "un2", tL_channelAdminLogEventActionPinTopic.new_topic);
                                                                } else {
                                                                    CharSequence replaceWithLink23 = replaceWithLink(LocaleController.formatString("EventLogUnpinTopic", R.string.EventLogUnpinTopic, new Object[0]), "un1", user);
                                                                    this.messageText = replaceWithLink23;
                                                                    this.messageText = replaceWithLink(replaceWithLink23, "un2", tL_channelAdminLogEventActionPinTopic.new_topic);
                                                                }
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleAntiSpam) {
                                                                if (((TLRPC.TL_channelAdminLogEventActionToggleAntiSpam) channelAdminLogEventAction).new_value) {
                                                                    string2 = LocaleController.getString(R.string.EventLogEnabledAntiSpam);
                                                                } else {
                                                                    string2 = LocaleController.getString(R.string.EventLogDisabledAntiSpam);
                                                                }
                                                                this.messageText = replaceWithLink(string2, "un1", user);
                                                            } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeColor) {
                                                                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                                                                TLRPC.TL_channelAdminLogEventActionChangeColor tL_channelAdminLogEventActionChangeColor = (TLRPC.TL_channelAdminLogEventActionChangeColor) tL_channelAdminLogEvent2.action;
                                                                this.messageText = replaceWithLink(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.EventLogChangedColor : R.string.EventLogChangedColorGroup, AvatarDrawable.colorName(tL_channelAdminLogEventActionChangeColor.prev_value).toLowerCase(), AvatarDrawable.colorName(tL_channelAdminLogEventActionChangeColor.new_value).toLowerCase()), "un1", user);
                                                            } else {
                                                                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangePeerColor) {
                                                                    boolean isChannelAndNotMegaGroup2 = ChatObject.isChannelAndNotMegaGroup(chat);
                                                                    TLRPC.TL_channelAdminLogEventActionChangePeerColor tL_channelAdminLogEventActionChangePeerColor = (TLRPC.TL_channelAdminLogEventActionChangePeerColor) tL_channelAdminLogEvent2.action;
                                                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(isChannelAndNotMegaGroup2 ? R.string.EventLogChangedPeerColorIcon : R.string.EventLogChangedPeerColorIconGroup));
                                                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                                                    if ((tL_channelAdminLogEventActionChangePeerColor.prev_value.flags & 1) != 0) {
                                                                        spannableStringBuilder4.append((CharSequence) "c");
                                                                        str = str3;
                                                                        spannableStringBuilder4.setSpan(new PeerColorActivity.PeerColorSpan(false, this.currentAccount, tL_channelAdminLogEventActionChangePeerColor.prev_value.color).setSize(AndroidUtilities.dp(18.0f)), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                                                                    } else {
                                                                        str = str3;
                                                                    }
                                                                    if ((tL_channelAdminLogEventActionChangePeerColor.prev_value.flags & 2) != 0) {
                                                                        if (spannableStringBuilder4.length() > 0) {
                                                                            spannableStringBuilder4.append((CharSequence) ", ");
                                                                        }
                                                                        spannableStringBuilder4.append((CharSequence) "e");
                                                                        str4 = "un1";
                                                                        spannableStringBuilder4.setSpan(new AnimatedEmojiSpan(tL_channelAdminLogEventActionChangePeerColor.prev_value.background_emoji_id, Theme.chat_actionTextPaint.getFontMetricsInt()), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                                                                    } else {
                                                                        str4 = "un1";
                                                                    }
                                                                    if (spannableStringBuilder4.length() == 0) {
                                                                        spannableStringBuilder4.append((CharSequence) LocaleController.getString(R.string.EventLogEmojiNone));
                                                                    }
                                                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                                                    if ((tL_channelAdminLogEventActionChangePeerColor.new_value.flags & 1) != 0) {
                                                                        spannableStringBuilder5.append((CharSequence) "c");
                                                                        spannableStringBuilder5.setSpan(new PeerColorActivity.PeerColorSpan(false, this.currentAccount, tL_channelAdminLogEventActionChangePeerColor.new_value.color).setSize(AndroidUtilities.dp(18.0f)), spannableStringBuilder5.length() - 1, spannableStringBuilder5.length(), 33);
                                                                    }
                                                                    if ((tL_channelAdminLogEventActionChangePeerColor.new_value.flags & 2) != 0) {
                                                                        if (spannableStringBuilder5.length() > 0) {
                                                                            spannableStringBuilder5.append((CharSequence) ", ");
                                                                        }
                                                                        spannableStringBuilder5.append((CharSequence) "e");
                                                                        spannableStringBuilder5.setSpan(new AnimatedEmojiSpan(tL_channelAdminLogEventActionChangePeerColor.new_value.background_emoji_id, Theme.chat_actionTextPaint.getFontMetricsInt()), spannableStringBuilder5.length() - 1, spannableStringBuilder5.length(), 33);
                                                                    }
                                                                    if (spannableStringBuilder5.length() == 0) {
                                                                        spannableStringBuilder5.append((CharSequence) LocaleController.getString(R.string.EventLogEmojiNone));
                                                                    }
                                                                    this.messageText = replaceWithLink(AndroidUtilities.replaceCharSequence("%2$s", AndroidUtilities.replaceCharSequence("%1$s", spannableStringBuilder3, spannableStringBuilder4), spannableStringBuilder5), str4, user);
                                                                } else {
                                                                    str = str3;
                                                                    if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeProfilePeerColor) {
                                                                        boolean isChannelAndNotMegaGroup3 = ChatObject.isChannelAndNotMegaGroup(chat);
                                                                        TLRPC.TL_channelAdminLogEventActionChangeProfilePeerColor tL_channelAdminLogEventActionChangeProfilePeerColor = (TLRPC.TL_channelAdminLogEventActionChangeProfilePeerColor) tL_channelAdminLogEvent2.action;
                                                                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(LocaleController.getString(isChannelAndNotMegaGroup3 ? R.string.EventLogChangedProfileColorIcon : R.string.EventLogChangedProfileColorIconGroup));
                                                                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                                                                        if ((tL_channelAdminLogEventActionChangeProfilePeerColor.prev_value.flags & 1) != 0) {
                                                                            spannableStringBuilder7.append((CharSequence) "c");
                                                                            spannableStringBuilder7.setSpan(new PeerColorActivity.PeerColorSpan(true, this.currentAccount, tL_channelAdminLogEventActionChangeProfilePeerColor.prev_value.color).setSize(AndroidUtilities.dp(18.0f)), spannableStringBuilder7.length() - 1, spannableStringBuilder7.length(), 33);
                                                                        }
                                                                        if ((tL_channelAdminLogEventActionChangeProfilePeerColor.prev_value.flags & 2) != 0) {
                                                                            if (spannableStringBuilder7.length() > 0) {
                                                                                spannableStringBuilder7.append((CharSequence) ", ");
                                                                            }
                                                                            spannableStringBuilder7.append((CharSequence) "e");
                                                                            spannableStringBuilder7.setSpan(new AnimatedEmojiSpan(tL_channelAdminLogEventActionChangeProfilePeerColor.prev_value.background_emoji_id, Theme.chat_actionTextPaint.getFontMetricsInt()), spannableStringBuilder7.length() - 1, spannableStringBuilder7.length(), 33);
                                                                        }
                                                                        if (spannableStringBuilder7.length() == 0) {
                                                                            spannableStringBuilder7.append((CharSequence) LocaleController.getString(R.string.EventLogEmojiNone));
                                                                        }
                                                                        SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
                                                                        if ((tL_channelAdminLogEventActionChangeProfilePeerColor.new_value.flags & 1) != 0) {
                                                                            spannableStringBuilder8.append((CharSequence) "c");
                                                                            spannableStringBuilder8.setSpan(new PeerColorActivity.PeerColorSpan(true, this.currentAccount, tL_channelAdminLogEventActionChangeProfilePeerColor.new_value.color).setSize(AndroidUtilities.dp(18.0f)), spannableStringBuilder8.length() - 1, spannableStringBuilder8.length(), 33);
                                                                        }
                                                                        if ((tL_channelAdminLogEventActionChangeProfilePeerColor.new_value.flags & 2) != 0) {
                                                                            if (spannableStringBuilder8.length() > 0) {
                                                                                spannableStringBuilder8.append((CharSequence) ", ");
                                                                            }
                                                                            spannableStringBuilder8.append((CharSequence) "e");
                                                                            spannableStringBuilder8.setSpan(new AnimatedEmojiSpan(tL_channelAdminLogEventActionChangeProfilePeerColor.new_value.background_emoji_id, Theme.chat_actionTextPaint.getFontMetricsInt()), spannableStringBuilder8.length() - 1, spannableStringBuilder8.length(), 33);
                                                                        }
                                                                        if (spannableStringBuilder8.length() == 0) {
                                                                            spannableStringBuilder8.append((CharSequence) LocaleController.getString(R.string.EventLogEmojiNone));
                                                                        }
                                                                        this.messageText = replaceWithLink(AndroidUtilities.replaceCharSequence("%2$s", AndroidUtilities.replaceCharSequence("%1$s", spannableStringBuilder6, spannableStringBuilder7), spannableStringBuilder8), "un1", user);
                                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeEmojiStatus) {
                                                                        boolean isChannelAndNotMegaGroup4 = ChatObject.isChannelAndNotMegaGroup(chat);
                                                                        TLRPC.TL_channelAdminLogEventActionChangeEmojiStatus tL_channelAdminLogEventActionChangeEmojiStatus = (TLRPC.TL_channelAdminLogEventActionChangeEmojiStatus) tL_channelAdminLogEvent2.action;
                                                                        if (tL_channelAdminLogEventActionChangeEmojiStatus.prev_value instanceof TLRPC.TL_emojiStatusEmpty) {
                                                                            spannableString3 = new SpannableString(LocaleController.getString(R.string.EventLogEmojiNone));
                                                                            z3 = true;
                                                                        } else {
                                                                            spannableString3 = new SpannableString("e");
                                                                            spannableString3.setSpan(new AnimatedEmojiSpan(DialogObject.getEmojiStatusDocumentId(tL_channelAdminLogEventActionChangeEmojiStatus.prev_value), Theme.chat_actionTextPaint.getFontMetricsInt()), 0, 1, 33);
                                                                            z3 = false;
                                                                        }
                                                                        int emojiStatusUntil = DialogObject.getEmojiStatusUntil(tL_channelAdminLogEventActionChangeEmojiStatus.new_value);
                                                                        if (tL_channelAdminLogEventActionChangeEmojiStatus.new_value instanceof TLRPC.TL_emojiStatusEmpty) {
                                                                            spannableString4 = new SpannableString(LocaleController.getString(R.string.EventLogEmojiNone));
                                                                        } else {
                                                                            SpannableString spannableString5 = new SpannableString("e");
                                                                            spannableString5.setSpan(new AnimatedEmojiSpan(DialogObject.getEmojiStatusDocumentId(tL_channelAdminLogEventActionChangeEmojiStatus.new_value), Theme.chat_actionTextPaint.getFontMetricsInt()), 0, 1, 33);
                                                                            spannableString4 = spannableString5;
                                                                        }
                                                                        if (z3) {
                                                                            if (emojiStatusUntil != 0) {
                                                                                i2 = isChannelAndNotMegaGroup4 ? R.string.EventLogChangedEmojiStatusFor : R.string.EventLogChangedEmojiStatusForGroup;
                                                                            } else {
                                                                                i2 = isChannelAndNotMegaGroup4 ? R.string.EventLogChangedEmojiStatus : R.string.EventLogChangedEmojiStatusGroup;
                                                                            }
                                                                        } else if (emojiStatusUntil != 0) {
                                                                            i2 = isChannelAndNotMegaGroup4 ? R.string.EventLogChangedEmojiStatusFromFor : R.string.EventLogChangedEmojiStatusFromForGroup;
                                                                        } else {
                                                                            i2 = isChannelAndNotMegaGroup4 ? R.string.EventLogChangedEmojiStatusFrom : R.string.EventLogChangedEmojiStatusFromGroup;
                                                                        }
                                                                        SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence("%2$s", AndroidUtilities.replaceCharSequence("%1$s", new SpannableStringBuilder(LocaleController.getString(i2)), spannableString3), spannableString4);
                                                                        this.messageText = replaceWithLink(emojiStatusUntil != 0 ? AndroidUtilities.replaceCharSequence("%3$s", replaceCharSequence, LocaleController.formatTTLString((int) ((emojiStatusUntil - tL_channelAdminLogEvent2.date) * 1.05f))) : replaceCharSequence, "un1", user);
                                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                                                                        TLRPC.TL_channelAdminLogEventActionChangeWallpaper tL_channelAdminLogEventActionChangeWallpaper = (TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction;
                                                                        boolean isChannelAndNotMegaGroup5 = ChatObject.isChannelAndNotMegaGroup(chat);
                                                                        TLRPC.WallPaper wallPaper = tL_channelAdminLogEventActionChangeWallpaper.new_value;
                                                                        if ((wallPaper instanceof TLRPC.TL_wallPaperNoFile) && wallPaper.id == 0 && wallPaper.settings == null) {
                                                                            this.messageText = replaceWithLink(LocaleController.getString(isChannelAndNotMegaGroup5 ? R.string.EventLogRemovedWallpaper : R.string.EventLogRemovedWallpaperGroup), "un1", user);
                                                                        } else {
                                                                            ArrayList<TLRPC.PhotoSize> arrayList7 = new ArrayList<>();
                                                                            this.photoThumbs = arrayList7;
                                                                            TLRPC.Document document = tL_channelAdminLogEventActionChangeWallpaper.new_value.document;
                                                                            if (document != null) {
                                                                                arrayList7.addAll(document.thumbs);
                                                                                this.photoThumbsObject = tL_channelAdminLogEventActionChangeWallpaper.new_value.document;
                                                                            }
                                                                            this.messageText = replaceWithLink(LocaleController.getString(isChannelAndNotMegaGroup5 ? R.string.EventLogChangedWallpaper : R.string.EventLogChangedWallpaperGroup), "un1", user);
                                                                        }
                                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeBackgroundEmoji) {
                                                                        boolean isChannelAndNotMegaGroup6 = ChatObject.isChannelAndNotMegaGroup(chat);
                                                                        TLRPC.TL_channelAdminLogEventActionChangeBackgroundEmoji tL_channelAdminLogEventActionChangeBackgroundEmoji = (TLRPC.TL_channelAdminLogEventActionChangeBackgroundEmoji) tL_channelAdminLogEvent2.action;
                                                                        this.messageText = replaceWithLink(LocaleController.getString(isChannelAndNotMegaGroup6 ? R.string.EventLogChangedEmoji : R.string.EventLogChangedEmojiGroup), "un1", user);
                                                                        if (tL_channelAdminLogEventActionChangeBackgroundEmoji.prev_value == 0) {
                                                                            spannableString = new SpannableString(LocaleController.getString(R.string.EventLogEmojiNone));
                                                                        } else {
                                                                            spannableString = new SpannableString("e");
                                                                            spannableString.setSpan(new AnimatedEmojiSpan(tL_channelAdminLogEventActionChangeBackgroundEmoji.prev_value, Theme.chat_actionTextPaint.getFontMetricsInt()), 0, 1, 33);
                                                                        }
                                                                        this.messageText = AndroidUtilities.replaceCharSequence("%1$s", this.messageText, spannableString);
                                                                        if (tL_channelAdminLogEventActionChangeBackgroundEmoji.new_value == 0) {
                                                                            spannableString2 = new SpannableString(LocaleController.getString(R.string.EventLogEmojiNone));
                                                                        } else {
                                                                            spannableString2 = new SpannableString("e");
                                                                            spannableString2.setSpan(new AnimatedEmojiSpan(tL_channelAdminLogEventActionChangeBackgroundEmoji.new_value, Theme.chat_actionTextPaint.getFontMetricsInt()), 0, 1, 33);
                                                                        }
                                                                        this.messageText = AndroidUtilities.replaceCharSequence("%2$s", this.messageText, spannableString2);
                                                                    } else {
                                                                        this.messageText = "unsupported " + tL_channelAdminLogEvent2.action;
                                                                    }
                                                                }
                                                                chat2 = chat;
                                                            }
                                                            chat2 = chat3;
                                                            str = str3;
                                                        }
                                                    }
                                                }
                                                str = str3;
                                                arrayList3 = null;
                                                TLRPC.Message message922222 = message;
                                                chat2 = chat3;
                                                message2 = message922222;
                                                if (this.messageOwner == null) {
                                                }
                                                this.messageOwner.message = this.messageText.toString();
                                                this.messageOwner.from_id = new TLRPC.TL_peerUser();
                                                TLRPC.Message message522 = this.messageOwner;
                                                message522.from_id.user_id = tL_channelAdminLogEvent2.user_id;
                                                message522.date = tL_channelAdminLogEvent2.date;
                                                int i1822 = iArr[0];
                                                iArr[0] = i1822 + 1;
                                                message522.id = i1822;
                                                this.eventId = tL_channelAdminLogEvent2.id;
                                                message522.out = false;
                                                message522.peer_id = new TLRPC.TL_peerChannel();
                                                TLRPC.Message message622 = this.messageOwner;
                                                message622.peer_id.channel_id = chat2.id;
                                                message622.unread = false;
                                                MediaController mediaController22 = MediaController.getInstance();
                                                this.isOutOwnerCached = null;
                                                if (message2 instanceof TLRPC.TL_messageEmpty) {
                                                }
                                                if (message3 != null) {
                                                }
                                                iArr2 = null;
                                                if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                                                }
                                            }
                                        }
                                        tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                        chat2 = chat3;
                                    }
                                    tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                    chat2 = chat;
                                }
                            }
                            tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                            chat2 = chat;
                            arrayList3 = null;
                            if (this.messageOwner == null) {
                            }
                            this.messageOwner.message = this.messageText.toString();
                            this.messageOwner.from_id = new TLRPC.TL_peerUser();
                            TLRPC.Message message5222 = this.messageOwner;
                            message5222.from_id.user_id = tL_channelAdminLogEvent2.user_id;
                            message5222.date = tL_channelAdminLogEvent2.date;
                            int i18222 = iArr[0];
                            iArr[0] = i18222 + 1;
                            message5222.id = i18222;
                            this.eventId = tL_channelAdminLogEvent2.id;
                            message5222.out = false;
                            message5222.peer_id = new TLRPC.TL_peerChannel();
                            TLRPC.Message message6222 = this.messageOwner;
                            message6222.peer_id.channel_id = chat2.id;
                            message6222.unread = false;
                            MediaController mediaController222 = MediaController.getInstance();
                            this.isOutOwnerCached = null;
                            if (message2 instanceof TLRPC.TL_messageEmpty) {
                            }
                            if (message3 != null) {
                            }
                            iArr2 = null;
                            if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                            }
                        }
                        message2 = null;
                        arrayList3 = null;
                        if (this.messageOwner == null) {
                        }
                        this.messageOwner.message = this.messageText.toString();
                        this.messageOwner.from_id = new TLRPC.TL_peerUser();
                        TLRPC.Message message52222 = this.messageOwner;
                        message52222.from_id.user_id = tL_channelAdminLogEvent2.user_id;
                        message52222.date = tL_channelAdminLogEvent2.date;
                        int i182222 = iArr[0];
                        iArr[0] = i182222 + 1;
                        message52222.id = i182222;
                        this.eventId = tL_channelAdminLogEvent2.id;
                        message52222.out = false;
                        message52222.peer_id = new TLRPC.TL_peerChannel();
                        TLRPC.Message message62222 = this.messageOwner;
                        message62222.peer_id.channel_id = chat2.id;
                        message62222.unread = false;
                        MediaController mediaController2222 = MediaController.getInstance();
                        this.isOutOwnerCached = null;
                        if (message2 instanceof TLRPC.TL_messageEmpty) {
                        }
                        if (message3 != null) {
                        }
                        iArr2 = null;
                        if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                        }
                    }
                }
                str = "";
                if (z2) {
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
                    user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId6));
                } else {
                    user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(-peerId6));
                }
                if (!(channelParticipant instanceof TLRPC.TL_channelParticipantCreator) && (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator)) {
                    String string5 = LocaleController.getString(R.string.EventLogChangedOwnership);
                    sb = new StringBuilder(String.format(string5, getUserName(user2, this.messageOwner.entities, string5.indexOf("%1$s"))));
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
                    StringBuilder sb6 = new StringBuilder(String.format(string, getUserName(user2, this.messageOwner.entities, string.indexOf("%1$s"))));
                    sb6.append("\n");
                    if (!TextUtils.equals(channelParticipant.rank, channelParticipant2.rank)) {
                        if (TextUtils.isEmpty(channelParticipant2.rank)) {
                            sb6.append('\n');
                            sb6.append('-');
                            sb6.append(' ');
                            sb6.append(LocaleController.getString(R.string.EventLogPromotedRemovedTitle));
                        } else {
                            sb6.append('\n');
                            sb6.append('+');
                            sb6.append(' ');
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
                    sb = sb6;
                }
                this.messageText = sb.toString();
                message2 = null;
                arrayList3 = null;
                if (this.messageOwner == null) {
                }
                this.messageOwner.message = this.messageText.toString();
                this.messageOwner.from_id = new TLRPC.TL_peerUser();
                TLRPC.Message message522222 = this.messageOwner;
                message522222.from_id.user_id = tL_channelAdminLogEvent2.user_id;
                message522222.date = tL_channelAdminLogEvent2.date;
                int i1822222 = iArr[0];
                iArr[0] = i1822222 + 1;
                message522222.id = i1822222;
                this.eventId = tL_channelAdminLogEvent2.id;
                message522222.out = false;
                message522222.peer_id = new TLRPC.TL_peerChannel();
                TLRPC.Message message622222 = this.messageOwner;
                message622222.peer_id.channel_id = chat2.id;
                message622222.unread = false;
                MediaController mediaController22222 = MediaController.getInstance();
                this.isOutOwnerCached = null;
                if (message2 instanceof TLRPC.TL_messageEmpty) {
                }
                if (message3 != null) {
                }
                iArr2 = null;
                if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                }
            }
        }
        chat2 = chat;
        str = "";
        message2 = null;
        arrayList3 = null;
        if (this.messageOwner == null) {
        }
        this.messageOwner.message = this.messageText.toString();
        this.messageOwner.from_id = new TLRPC.TL_peerUser();
        TLRPC.Message message5222222 = this.messageOwner;
        message5222222.from_id.user_id = tL_channelAdminLogEvent2.user_id;
        message5222222.date = tL_channelAdminLogEvent2.date;
        int i18222222 = iArr[0];
        iArr[0] = i18222222 + 1;
        message5222222.id = i18222222;
        this.eventId = tL_channelAdminLogEvent2.id;
        message5222222.out = false;
        message5222222.peer_id = new TLRPC.TL_peerChannel();
        TLRPC.Message message6222222 = this.messageOwner;
        message6222222.peer_id.channel_id = chat2.id;
        message6222222.unread = false;
        MediaController mediaController222222 = MediaController.getInstance();
        this.isOutOwnerCached = null;
        if (message2 instanceof TLRPC.TL_messageEmpty) {
        }
        if (message3 != null) {
        }
        iArr2 = null;
        if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
        }
    }

    public void spoilLoginCode() {
        TLRPC.Message message;
        if (this.spoiledLoginCode || this.messageText == null || (message = this.messageOwner) == null || message.entities == null) {
            return;
        }
        TLRPC.Peer peer = message.from_id;
        if (peer instanceof TLRPC.TL_peerUser) {
            long j = peer.user_id;
            if (j == 777000 || j == UserObject.VERIFY) {
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
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                }
                this.spoiledLoginCode = true;
            }
        }
    }

    public boolean didSpoilLoginCode() {
        return this.spoiledLoginCode;
    }

    private CharSequence getStringFrom(TLRPC.ChatReactions chatReactions) {
        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
            return LocaleController.getString(R.string.AllReactions);
        }
        if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i = 0; i < tL_chatReactionsSome.reactions.size(); i++) {
                if (i != 0) {
                    spannableStringBuilder.append((CharSequence) " ");
                }
                spannableStringBuilder.append(Emoji.replaceEmoji(ReactionsUtils.reactionToCharSequence(tL_chatReactionsSome.reactions.get(i)), null, false));
            }
            return spannableStringBuilder;
        }
        return LocaleController.getString(R.string.NoReactions);
    }

    private String getUsernamesString(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return LocaleController.getString(R.string.UsernameEmpty).toLowerCase();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append("@");
            sb.append(arrayList.get(i));
            if (i < arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    private String getUserName(TLObject tLObject, ArrayList<TLRPC.MessageEntity> arrayList, int i) {
        String str;
        String publicUsername;
        long j;
        String str2;
        String str3;
        long j2;
        if (tLObject == null) {
            str2 = "";
            str3 = null;
            j2 = 0;
        } else {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (user.deleted) {
                    str = LocaleController.getString(R.string.HiddenName);
                } else {
                    str = ContactsController.formatName(user.first_name, user.last_name);
                }
                publicUsername = UserObject.getPublicUsername(user);
                j = user.id;
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                str = chat.title;
                publicUsername = ChatObject.getPublicUsername(chat);
                j = -chat.id;
            }
            str2 = str;
            str3 = publicUsername;
            j2 = j;
        }
        if (i >= 0) {
            TLRPC.TL_messageEntityMentionName tL_messageEntityMentionName = new TLRPC.TL_messageEntityMentionName();
            tL_messageEntityMentionName.user_id = j2;
            tL_messageEntityMentionName.offset = i;
            tL_messageEntityMentionName.length = str2.length();
            arrayList.add(tL_messageEntityMentionName);
        }
        if (TextUtils.isEmpty(str3)) {
            return str2;
        }
        if (i >= 0) {
            TLRPC.TL_messageEntityMentionName tL_messageEntityMentionName2 = new TLRPC.TL_messageEntityMentionName();
            tL_messageEntityMentionName2.user_id = j2;
            tL_messageEntityMentionName2.offset = i + str2.length() + 2;
            tL_messageEntityMentionName2.length = str3.length() + 1;
            arrayList.add(tL_messageEntityMentionName2);
        }
        return String.format("%1$s (@%2$s)", str2, str3);
    }

    public boolean updateTranslation() {
        return updateTranslation(false);
    }

    public boolean updateTranslation(boolean z) {
        MessageObject messageObject = this.replyMessageObject;
        boolean z2 = (messageObject == null || messageObject == this || !messageObject.updateTranslation(z)) ? false : true;
        TranslateController translateController = MessagesController.getInstance(this.currentAccount).getTranslateController();
        TLRPC.Message message = this.messageOwner;
        TLRPC.TL_textWithEntities tL_textWithEntities = null;
        TLRPC.TL_textWithEntities tL_textWithEntities2 = message != null ? message.voiceTranscriptionOpen ? message.translatedVoiceTranscription : message.translatedText : null;
        TLRPC.TL_textWithEntities tL_textWithEntities3 = (message == null || !message.summarizedOpen) ? null : message.summaryText;
        if (message != null && message.summarizedOpen) {
            tL_textWithEntities = message.translatedSummaryText;
        }
        if (tL_textWithEntities != null && message != null && message.summarizedOpen && TranslateController.isSummarizable(this) && TranslateController.isTranslatable(this) && translateController.isTranslatingDialog(getDialogId()) && !translateController.isTranslateDialogHidden(getDialogId()) && TextUtils.equals(translateController.getDialogTranslateTo(getDialogId()), this.messageOwner.translatedSummaryLanguage)) {
            if (this.summarized && this.translated) {
                return z2;
            }
            this.summarized = true;
            this.translated = true;
            applyNewText(tL_textWithEntities.text);
            generateCaption();
            return true;
        }
        TLRPC.Message message2 = this.messageOwner;
        if (message2 != null && message2.summarizedOpen && TranslateController.isSummarizable(this) && tL_textWithEntities3 != null) {
            if (this.summarized && !this.translated) {
                return z2;
            }
            this.summarized = true;
            this.translated = false;
            applyNewText(tL_textWithEntities3.text);
            generateCaption();
            return true;
        }
        if (this.messageOwner != null && TranslateController.isTranslatable(this) && translateController.isTranslatingDialog(getDialogId()) && !translateController.isTranslateDialogHidden(getDialogId()) && ((tL_textWithEntities2 != null || this.messageOwner.translatedPoll != null) && TextUtils.equals(translateController.getDialogTranslateTo(getDialogId()), this.messageOwner.translatedToLanguage))) {
            if (this.translated && !this.summarized) {
                return z2;
            }
            this.translated = true;
            this.summarized = false;
            if (tL_textWithEntities2 != null) {
                applyNewText(tL_textWithEntities2.text);
                generateCaption();
            }
            return true;
        }
        TLRPC.Message message3 = this.messageOwner;
        if (message3 == null || !(z || this.translated || this.summarized)) {
            return z2;
        }
        this.translated = false;
        this.summarized = false;
        applyNewText(message3.message);
        generateCaption();
        return true;
    }

    public void applyNewText() {
        this.translated = false;
        this.summarized = false;
        applyNewText(this.messageOwner.message);
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
            textPaint = Theme.chat_msgGameTextPaint;
        } else {
            textPaint = Theme.chat_msgTextPaint;
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

    private boolean allowsBigEmoji() {
        TLRPC.Peer peer;
        if (!SharedConfig.allowBigEmoji) {
            return false;
        }
        TLRPC.Message message = this.messageOwner;
        if (message == null || (peer = message.peer_id) == null || (peer.channel_id == 0 && peer.chat_id == 0)) {
            return true;
        }
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        TLRPC.Peer peer2 = this.messageOwner.peer_id;
        long j = peer2.channel_id;
        if (j == 0) {
            j = peer2.chat_id;
        }
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j));
        return (chat != null && chat.gigagroup) || !ChatObject.isActionBanned(chat, 8) || ChatObject.hasAdminRights(chat);
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

    public boolean hasValidReplyMessageObject() {
        MessageObject messageObject;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.Message message = this.messageOwner;
        if ((message != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.forum_topic && messageReplyHeader.reply_to_msg_id == messageReplyHeader.reply_to_top_id) || (messageObject = this.replyMessageObject) == null) {
            return false;
        }
        TLRPC.Message message2 = messageObject.messageOwner;
        if (message2 instanceof TLRPC.TL_messageEmpty) {
            return false;
        }
        TLRPC.MessageAction messageAction = message2.action;
        return ((messageAction instanceof TLRPC.TL_messageActionHistoryClear) || (messageAction instanceof TLRPC.TL_messageActionTopicCreate)) ? false : true;
    }

    public void generatePaymentSentMessageText(TLRPC.User user, boolean z) {
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
        } catch (Exception e) {
            FileLog.e(e);
            str = "<error>";
        }
        MessageObject messageObject = this.replyMessageObject;
        if (messageObject != null && (getMedia(messageObject) instanceof TLRPC.TL_messageMediaInvoice)) {
            TLRPC.MessageAction messageAction2 = this.messageOwner.action;
            if (messageAction2.subscription_until_date != 0) {
                if (z) {
                    this.messageText = LocaleController.formatString(R.string.PaymentSuccessfullyPaidMeSubscription, firstName, str, getMedia(this.replyMessageObject).title, LocaleController.formatDateTime(this.messageOwner.action.subscription_until_date, false));
                } else {
                    this.messageText = LocaleController.formatString(R.string.PaymentSuccessfullyPaidSubscription, str, firstName, getMedia(this.replyMessageObject).title, LocaleController.formatDateTime(this.messageOwner.action.subscription_until_date, false));
                }
            } else if (!messageAction2.recurring_init || z) {
                this.messageText = LocaleController.formatString(R.string.PaymentSuccessfullyPaid, str, firstName, getMedia(this.replyMessageObject).title);
            } else {
                this.messageText = LocaleController.formatString(R.string.PaymentSuccessfullyPaidRecurrent, str, firstName, getMedia(this.replyMessageObject).title);
            }
        } else {
            TLRPC.MessageAction messageAction3 = this.messageOwner.action;
            int i = messageAction3.subscription_until_date;
            if (i != 0) {
                if (z) {
                    this.messageText = LocaleController.formatString(R.string.PaymentSuccessfullyPaidMeNoItemSubscription, firstName, str, LocaleController.formatDateTime(i, false));
                } else {
                    this.messageText = LocaleController.formatString(R.string.PaymentSuccessfullyPaidSubscriptionNoItem, str, firstName, LocaleController.formatDateTime(i, false));
                }
            } else if (!messageAction3.recurring_init || z) {
                this.messageText = LocaleController.formatString(R.string.PaymentSuccessfullyPaidNoItem, str, firstName);
            } else {
                this.messageText = LocaleController.formatString(R.string.PaymentSuccessfullyPaidNoItemRecurrent, str, firstName);
            }
        }
        this.messageText = StarsIntroActivity.replaceStars(this.messageText);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r9v1, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r9v10, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r9v7, types: [org.telegram.tgnet.TLRPC$Chat] */
    public void generatePinMessageText(TLRPC.User user, TLRPC.Chat chat) {
        boolean z;
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
                    this.messageText = Emoji.replaceEmoji(replaceWithLink, Theme.chat_msgTextPaint.getFontMetricsInt(), false);
                    return;
                }
                CharSequence charSequence = this.replyMessageObject.messageText;
                if (charSequence != null && charSequence.length() > 0) {
                    CharSequence cloneSpans = AnimatedEmojiSpan.cloneSpans(this.replyMessageObject.messageText);
                    if (cloneSpans.length() > 20) {
                        cloneSpans = cloneSpans.subSequence(0, 20);
                        z = true;
                    } else {
                        z = false;
                    }
                    CharSequence replaceEmoji = Emoji.replaceEmoji(cloneSpans, Theme.chat_msgTextPaint.getFontMetricsInt(), true);
                    MessageObject messageObject2 = this.replyMessageObject;
                    if (messageObject2 != null && messageObject2.messageOwner != null) {
                        replaceEmoji = messageObject2.replaceAnimatedEmoji(replaceEmoji, Theme.chat_msgTextPaint.getFontMetricsInt());
                    }
                    MediaDataController.addTextStyleRuns(this.replyMessageObject, (Spannable) replaceEmoji);
                    if (z) {
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
                String string14 = LocaleController.getString(R.string.ActionPinnedNoText);
                if (user == null) {
                    user = chat;
                }
                this.messageText = replaceWithLink(string14, "un1", user);
                return;
            }
        }
        String string15 = LocaleController.getString(R.string.ActionPinnedNoText);
        if (user == null) {
            user = chat;
        }
        this.messageText = replaceWithLink(string15, "un1", user);
    }

    public static void updateReactions(TLRPC.Message message, TLRPC.TL_messageReactions tL_messageReactions) {
        if (message == null || tL_messageReactions == null) {
            return;
        }
        TLRPC.TL_messageReactions tL_messageReactions2 = message.reactions;
        if (tL_messageReactions2 != null) {
            int size = tL_messageReactions2.results.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                TLRPC.ReactionCount reactionCount = message.reactions.results.get(i);
                int size2 = tL_messageReactions.results.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    TLRPC.ReactionCount reactionCount2 = tL_messageReactions.results.get(i2);
                    if (ReactionsLayoutInBubble.equalsTLReaction(reactionCount.reaction, reactionCount2.reaction)) {
                        if (!z && tL_messageReactions.min && reactionCount.chosen) {
                            reactionCount2.chosen = true;
                            z = true;
                        }
                        reactionCount2.lastDrawnPosition = reactionCount.lastDrawnPosition;
                    }
                }
                if (reactionCount.chosen) {
                    z = true;
                }
            }
        }
        message.reactions = tL_messageReactions;
        message.flags |= 1048576;
    }

    public boolean hasReactions() {
        TLRPC.TL_messageReactions tL_messageReactions = this.messageOwner.reactions;
        return (tL_messageReactions == null || tL_messageReactions.results.isEmpty()) ? false : true;
    }

    public boolean hasReaction(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        if (hasReactions() && visibleReaction != null) {
            for (int i = 0; i < this.messageOwner.reactions.results.size(); i++) {
                if (visibleReaction.isSame(this.messageOwner.reactions.results.get(i).reaction)) {
                    return true;
                }
            }
        }
        return false;
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
                for (int i = 0; i < size; i++) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i);
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
                for (int i2 = 0; i2 < size2; i2++) {
                    TLRPC.PollAnswerVoters pollAnswerVoters2 = tL_messageMediaPoll.results.results.get(i2);
                    if (arrayList2 != null) {
                        int size3 = arrayList2.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size3) {
                                break;
                            }
                            if (Arrays.equals(pollAnswerVoters2.option, (byte[]) arrayList2.get(i3))) {
                                pollAnswerVoters2.chosen = true;
                                arrayList2.remove(i3);
                                break;
                            }
                            i3++;
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
            pollResults4.flags = BitwiseUtils.setFlag(pollResults4.flags, 2, false);
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

    public void loadAnimatedEmojiDocument() {
        if (this.emojiAnimatedSticker != null || this.emojiAnimatedStickerId == null || this.emojiAnimatedStickerLoading) {
            return;
        }
        this.emojiAnimatedStickerLoading = true;
        AnimatedEmojiDrawable.getDocumentFetcher(this.currentAccount).fetchDocument(this.emojiAnimatedStickerId.longValue(), new AnimatedEmojiDrawable.ReceivedDocument() { // from class: org.telegram.messenger.MessageObject$$ExternalSyntheticLambda10
            @Override // org.telegram.ui.Components.AnimatedEmojiDrawable.ReceivedDocument
            public final void run(TLRPC.Document document) {
                MessageObject.this.lambda$loadAnimatedEmojiDocument$1(document);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadAnimatedEmojiDocument$1(final TLRPC.Document document) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MessageObject$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                MessageObject.this.lambda$loadAnimatedEmojiDocument$0(document);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadAnimatedEmojiDocument$0(TLRPC.Document document) {
        this.emojiAnimatedSticker = document;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.animatedEmojiDocumentLoaded, this);
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

    public boolean isPoll() {
        return this.type == 17 && (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPoll);
    }

    public boolean isTodo() {
        return this.type == 17 && (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaToDo);
    }

    public boolean canCompleteTodo() {
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if ((media instanceof TLRPC.TL_messageMediaToDo) && !isForwarded()) {
            return isOutOwner() || ((TLRPC.TL_messageMediaToDo) media).todo.others_can_complete;
        }
        return false;
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
        if (!isOutOwner()) {
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            if (!todoList.others_can_complete || !todoList.others_can_append) {
                return false;
            }
        }
        return true;
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

    public static boolean canUnvote(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults;
        if (tL_messageMediaPoll != null && (pollResults = tL_messageMediaPoll.results) != null && !pollResults.results.isEmpty() && !tL_messageMediaPoll.poll.revoting_disabled) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i = 0; i < size; i++) {
                if (tL_messageMediaPoll.results.results.get(i).chosen) {
                    return true;
                }
            }
        }
        return false;
    }

    public static TLRPC.PollAnswerVoters getPollResult(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, byte[] bArr) {
        TLRPC.PollResults pollResults;
        if (tL_messageMediaPoll != null && (pollResults = tL_messageMediaPoll.results) != null && !pollResults.results.isEmpty()) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i = 0; i < size; i++) {
                TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i);
                if (Arrays.equals(pollAnswerVoters.option, bArr)) {
                    return pollAnswerVoters;
                }
            }
        }
        return null;
    }

    public static boolean canShowVotersList(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults;
        if (tL_messageMediaPoll == null || (pollResults = tL_messageMediaPoll.results) == null || pollResults.results.isEmpty()) {
            return false;
        }
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        if (poll.public_voters) {
            return poll.closed || poll.creator || (isVoted(tL_messageMediaPoll) && !tL_messageMediaPoll.poll.hide_results_until_close);
        }
        return false;
    }

    public static boolean isVoted(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults;
        if (tL_messageMediaPoll != null && (pollResults = tL_messageMediaPoll.results) != null && !pollResults.results.isEmpty()) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i = 0; i < size; i++) {
                if (tL_messageMediaPoll.results.results.get(i).chosen) {
                    return true;
                }
            }
        }
        return false;
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

    public static boolean isVotedButResultsHiddenUntilClose(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        if (tL_messageMediaPoll != null) {
            TLRPC.Poll poll = tL_messageMediaPoll.poll;
            if (!poll.closed && poll.hide_results_until_close && isVoted(tL_messageMediaPoll) && !isVoteResultsIsNotEmpty(tL_messageMediaPoll)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isVoteResultsIsNotEmpty(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults;
        if (tL_messageMediaPoll != null && (pollResults = tL_messageMediaPoll.results) != null && !pollResults.results.isEmpty()) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i = 0; i < size; i++) {
                if (tL_messageMediaPoll.results.results.get(i).voters > 0) {
                    return true;
                }
            }
        }
        return false;
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

    public boolean isSponsored() {
        return this.sponsoredId != null;
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

    private TLRPC.Photo getPhotoWithId(TLRPC.WebPage webPage, long j) {
        if (webPage != null && webPage.cached_page != null) {
            TLRPC.Photo photo = webPage.photo;
            if (photo != null && photo.id == j) {
                return photo;
            }
            for (int i = 0; i < webPage.cached_page.photos.size(); i++) {
                TLRPC.Photo photo2 = webPage.cached_page.photos.get(i);
                if (photo2.id == j) {
                    return photo2;
                }
            }
        }
        return null;
    }

    private TLRPC.Document getDocumentWithId(TLRPC.WebPage webPage, long j) {
        if (webPage != null && webPage.cached_page != null) {
            TLRPC.Document document = webPage.document;
            if (document != null && document.id == j) {
                return document;
            }
            for (int i = 0; i < webPage.cached_page.documents.size(); i++) {
                TLRPC.Document document2 = webPage.cached_page.documents.get(i);
                if (document2.id == j) {
                    return document2;
                }
            }
        }
        return null;
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
            long j = peer.channel_id;
            if (j != 0) {
                TLRPC.Chat chat = getChat(null, null, j);
                if (chat == null) {
                    return false;
                }
                boolean z = chat.megagroup;
                this.cachedIsSupergroup = Boolean.valueOf(z);
                return z;
            }
        }
        this.cachedIsSupergroup = Boolean.FALSE;
        return false;
    }

    private MessageObject getMessageObjectForBlock(TLRPC.WebPage webPage, TLRPC.PageBlock pageBlock) {
        TLRPC.TL_message tL_message;
        if (pageBlock instanceof TLRPC.TL_pageBlockPhoto) {
            TLRPC.Photo photoWithId = getPhotoWithId(webPage, ((TLRPC.TL_pageBlockPhoto) pageBlock).photo_id);
            if (photoWithId == webPage.photo) {
                return this;
            }
            tL_message = new TLRPC.TL_message();
            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
            tL_message.media = tL_messageMediaPhoto;
            tL_messageMediaPhoto.photo = photoWithId;
        } else if (pageBlock instanceof TLRPC.TL_pageBlockVideo) {
            TLRPC.TL_pageBlockVideo tL_pageBlockVideo = (TLRPC.TL_pageBlockVideo) pageBlock;
            if (getDocumentWithId(webPage, tL_pageBlockVideo.video_id) == webPage.document) {
                return this;
            }
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message2.media = tL_messageMediaDocument;
            tL_messageMediaDocument.document = getDocumentWithId(webPage, tL_pageBlockVideo.video_id);
            tL_message = tL_message2;
        } else {
            tL_message = null;
        }
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

    public ArrayList<MessageObject> getWebPagePhotos(ArrayList<MessageObject> arrayList, ArrayList<TLRPC.PageBlock> arrayList2) {
        TLRPC.WebPage webPage;
        TLRPC.Page page;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (getMedia(this.messageOwner) == null || getMedia(this.messageOwner).webpage == null || (page = (webPage = getMedia(this.messageOwner).webpage).cached_page) == null) {
            return arrayList;
        }
        if (arrayList2 == null) {
            arrayList2 = page.blocks;
        }
        for (int i = 0; i < arrayList2.size(); i++) {
            TLRPC.PageBlock pageBlock = arrayList2.get(i);
            if (pageBlock instanceof TLRPC.TL_pageBlockSlideshow) {
                TLRPC.TL_pageBlockSlideshow tL_pageBlockSlideshow = (TLRPC.TL_pageBlockSlideshow) pageBlock;
                for (int i2 = 0; i2 < tL_pageBlockSlideshow.items.size(); i2++) {
                    arrayList.add(getMessageObjectForBlock(webPage, tL_pageBlockSlideshow.items.get(i2)));
                }
            } else if (pageBlock instanceof TLRPC.TL_pageBlockCollage) {
                TLRPC.TL_pageBlockCollage tL_pageBlockCollage = (TLRPC.TL_pageBlockCollage) pageBlock;
                for (int i3 = 0; i3 < tL_pageBlockCollage.items.size(); i3++) {
                    arrayList.add(getMessageObjectForBlock(webPage, tL_pageBlockCollage.items.get(i3)));
                }
            }
        }
        return arrayList;
    }

    public void createMessageSendInfo() {
        createMessageSendInfo(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0073, code lost:
    
        if (isVideoDocument(r3.document) != false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void createMessageSendInfo(boolean z) {
        String str;
        int parseInt;
        TLRPC.MessageMedia media;
        VideoEditedInfo videoEditedInfo = this.videoEditedInfo;
        boolean z2 = true;
        boolean z3 = videoEditedInfo != null && videoEditedInfo.notReadyYet;
        TLRPC.Message message = this.messageOwner;
        if (message.message != null) {
            if ((message.id < 0 || isEditing()) && this.messageOwner.params != null) {
                TLRPC.MessageMedia media2 = getMedia(this);
                boolean z4 = z || isVideo() || isNewGif() || isRoundVideo() || isVideoSticker() || isPaidVideo(media2);
                if (!z4 && (media2 instanceof TLRPC.TL_messageMediaPoll)) {
                    String str2 = this.messageOwner.params.get("pollMediaIndex");
                    if (str2 != null) {
                        try {
                            parseInt = Integer.parseInt(str2);
                        } catch (Throwable unused) {
                        }
                        media = PollAttachedMediaPack.getMedia((TLRPC.TL_messageMediaPoll) media2, parseInt);
                        if (media != null) {
                        }
                    }
                    parseInt = -1;
                    media = PollAttachedMediaPack.getMedia((TLRPC.TL_messageMediaPoll) media2, parseInt);
                    if (media != null) {
                    }
                }
                z2 = z4;
                String str3 = this.messageOwner.params.get("ve");
                if (str3 != null && z2) {
                    VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                    this.videoEditedInfo = videoEditedInfo2;
                    if (!videoEditedInfo2.parseString(str3)) {
                        this.videoEditedInfo = null;
                    } else {
                        this.videoEditedInfo.roundVideo = isRoundVideo();
                        this.videoEditedInfo.notReadyYet = z3;
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
                for (int i = 0; i < readInt32; i++) {
                    this.previousMessageEntities.add(TLRPC.MessageEntity.TLdeserialize(serializedData, serializedData.readInt32(false), false));
                }
                serializedData.cleanup();
            }
        }
    }

    public static boolean isPaidVideo(TLRPC.MessageMedia messageMedia) {
        return (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) && messageMedia.extended_media.size() == 1 && isExtendedVideo(messageMedia.extended_media.get(0));
    }

    public static boolean isExtendedVideo(TLRPC.MessageExtendedMedia messageExtendedMedia) {
        if (!(messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia)) {
            return (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) && (((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).flags & 4) != 0;
        }
        TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
        return (messageMedia instanceof TLRPC.TL_messageMediaDocument) && isVideoDocument(messageMedia.document);
    }

    public boolean hasSuggestionInlineButtons() {
        TLRPC.SuggestedPost suggestedPost;
        TLRPC.Message message = this.messageOwner;
        boolean z = (message == null || (suggestedPost = message.suggested_post) == null || suggestedPost.rejected || suggestedPost.accepted || isSendError() || isSending()) ? false : true;
        if (z) {
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            long peerDialogId = DialogObject.getPeerDialogId(this.messageOwner.saved_peer_id);
            long peerDialogId2 = DialogObject.getPeerDialogId(this.messageOwner.from_id);
            boolean z2 = clientUserId == peerDialogId;
            boolean z3 = peerDialogId == peerDialogId2;
            if (z2 && z3) {
                return false;
            }
            if (!z2 && !z3) {
                return false;
            }
        }
        return z;
    }

    public BotInlineKeyboard.Source getInlineBotButtons() {
        return this.inlineKeyboardSource;
    }

    public boolean hasInlineBotButtons() {
        TLRPC.Message message;
        if (!this.isRestrictedMessage && !this.isRepostPreview && (message = this.messageOwner) != null) {
            TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
            if (((replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !replyMarkup.rows.isEmpty()) || getInlineBotButtons() != null) {
                return true;
            }
        }
        return false;
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
            if ((replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && replyMarkup.rows != null) {
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
            Theme.createCommonMessageResources();
            StringBuilder sb = this.botButtonsLayout;
            if (sb == null) {
                this.botButtonsLayout = new StringBuilder();
            } else {
                sb.setLength(0);
            }
        }
        if (source == null || hasExtendedMedia()) {
            return;
        }
        for (int i = 0; i < source.getRowsCount(); i++) {
            int columnsCount = source.getColumnsCount(i);
            int i2 = 0;
            for (int i3 = 0; i3 < columnsCount; i3++) {
                BotInlineKeyboard.Button button = source.getButton(i, i3);
                StringBuilder sb2 = this.botButtonsLayout;
                sb2.append(i);
                sb2.append(i3);
                if ((button instanceof BotInlineKeyboard.ButtonBot) && (((BotInlineKeyboard.ButtonBot) button).button instanceof TLRPC.TL_keyboardButtonBuy) && (getMedia(this.messageOwner).flags & 4) != 0) {
                    replaceEmoji = LocaleController.getString(R.string.PaymentReceipt);
                } else {
                    String text = button.getText();
                    if (text == null) {
                        text = "";
                    }
                    replaceEmoji = Emoji.replaceEmoji(text, Theme.chat_msgBotButtonPaint.getFontMetricsInt(), false);
                }
                StaticLayout staticLayout = new StaticLayout(replaceEmoji, Theme.chat_msgBotButtonPaint, AndroidUtilities.dp(2000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
                    i2 = Math.max(i2, ((int) Math.ceil(lineWidth)) + AndroidUtilities.dp(4.0f));
                }
            }
            this.wantedBotKeyboardWidth = Math.max(this.wantedBotKeyboardWidth, ((i2 + AndroidUtilities.dp(12.0f)) * columnsCount) + (AndroidUtilities.dp(5.0f) * (columnsCount - 1)));
        }
    }

    public boolean isVideoAvatar() {
        TLRPC.Photo photo;
        TLRPC.MessageAction messageAction = this.messageOwner.action;
        return (messageAction == null || (photo = messageAction.photo) == null || photo.video_sizes.isEmpty()) ? false : true;
    }

    public boolean isFcmMessage() {
        return this.localType != 0;
    }

    private TLRPC.User getUser(AbstractMap<Long, TLRPC.User> abstractMap, LongSparseArray longSparseArray, long j) {
        TLRPC.User user;
        if (abstractMap != null) {
            user = abstractMap.get(Long.valueOf(j));
        } else {
            user = longSparseArray != null ? (TLRPC.User) longSparseArray.get(j) : null;
        }
        return user == null ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j)) : user;
    }

    private TLRPC.Chat getChat(AbstractMap<Long, TLRPC.Chat> abstractMap, LongSparseArray longSparseArray, long j) {
        TLRPC.Chat chat;
        if (abstractMap != null) {
            chat = abstractMap.get(Long.valueOf(j));
        } else {
            chat = longSparseArray != null ? (TLRPC.Chat) longSparseArray.get(j) : null;
        }
        return chat == null ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j)) : chat;
    }

    public void updateMessageText() {
        updateMessageText(MessagesController.getInstance(this.currentAccount).getUsers(), MessagesController.getInstance(this.currentAccount).getChats(), null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:1428:0x248b, code lost:
    
        if ((((org.telegram.tgnet.TLRPC.TL_messageExtendedMediaPreview) r5).flags & 4) != 0) goto L1408;
     */
    /* JADX WARN: Removed duplicated region for block: B:1335:0x228c  */
    /* JADX WARN: Removed duplicated region for block: B:1350:0x22e2  */
    /* JADX WARN: Removed duplicated region for block: B:1352:0x22e5  */
    /* JADX WARN: Removed duplicated region for block: B:1528:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x2714  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0914  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x08df  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0990  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x107d  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x1097  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x10f1  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x1105  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x114b  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x1155  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:776:0x1348  */
    /* JADX WARN: Removed duplicated region for block: B:796:0x13e9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void updateMessageText(AbstractMap<Long, TLRPC.User> abstractMap, AbstractMap<Long, TLRPC.Chat> abstractMap2, LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        String str;
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.Message message;
        String str2;
        char c;
        String formatPluralString;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        String publicUsername;
        boolean isChannelAndNotMegaGroup;
        String str3;
        int i;
        int i2;
        TLRPC.Chat chat2;
        TLRPC.TodoItem todoItem;
        TLRPC.User user2;
        String string;
        CharSequence formatSpannable;
        CharSequence formatSpannable2;
        String publicUsername2;
        String str4;
        TLRPC.Chat chat3;
        String str5;
        TLRPC.Chat chat4;
        String sb;
        TLRPC.Chat chat5;
        long j;
        String str6;
        TLObject tLObject;
        TLRPC.Chat chat6;
        TLRPC.Chat chat7;
        TLRPC.Chat chat8;
        ArrayList<TLRPC.VideoSize> arrayList;
        TLObject chat9;
        TLObject chat10;
        TLObject chat11;
        TLObject chat12;
        TLObject chat13;
        int i3;
        TLObject tLObject2;
        TLRPC.Peer peer;
        TLRPC.Chat chat14;
        TLRPC.TL_messageActionGiveawayResults tL_messageActionGiveawayResults;
        TLRPC.Chat chat15;
        String str7;
        boolean z;
        TLRPC.Chat chat16;
        AmountUtils$Amount amountUtils$Amount;
        int i4;
        AmountUtils$Amount amountUtils$Amount2;
        TLRPC.Chat chat17;
        TLObject chat18;
        TLObject chat19;
        TLObject chat20;
        String formatPluralString2;
        TLRPC.Peer peer2 = this.messageOwner.from_id;
        if (peer2 instanceof TLRPC.TL_peerUser) {
            str = ", ";
            user = getUser(abstractMap, longSparseArray, peer2.user_id);
        } else {
            str = ", ";
            if (peer2 instanceof TLRPC.TL_peerChannel) {
                chat = getChat(abstractMap2, longSparseArray2, peer2.channel_id);
                user = null;
                TLObject tLObject3 = user == null ? user : chat;
                this.drawServiceWithDefaultTypeface = false;
                this.channelJoined = false;
                message = this.messageOwner;
                if (!(message instanceof TLRPC.TL_messageService)) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction != null) {
                        String str8 = str;
                        String str9 = "un1";
                        if (messageAction instanceof TLRPC.TL_messageActionNewCreatorPending) {
                            TLRPC.User user3 = getUser(abstractMap, longSparseArray, ((TLRPC.TL_messageActionNewCreatorPending) messageAction).new_creator_id);
                            String string2 = LocaleController.getString(R.string.ActionNewCreatorPending);
                            this.messageText = string2;
                            CharSequence replaceWithLink = replaceWithLink(string2, "un1", user3);
                            this.messageText = replaceWithLink;
                            this.messageText = replaceWithLink(replaceWithLink, "un2", tLObject3);
                        } else if (messageAction instanceof TLRPC.TL_messageActionChangeCreator) {
                            TLRPC.User user4 = getUser(abstractMap, longSparseArray, ((TLRPC.TL_messageActionChangeCreator) messageAction).new_creator_id);
                            String string3 = LocaleController.getString(R.string.ActionChangeCreator);
                            this.messageText = string3;
                            CharSequence replaceWithLink2 = replaceWithLink(string3, "un1", tLObject3);
                            this.messageText = replaceWithLink2;
                            this.messageText = replaceWithLink(replaceWithLink2, "un2", user4);
                        } else if (messageAction instanceof TLRPC.TL_messageActionManagedBotCreated) {
                            TLRPC.User user5 = getUser(abstractMap, longSparseArray, ((TLRPC.TL_messageActionManagedBotCreated) messageAction).bot_id);
                            TLRPC.User user6 = getUser(abstractMap, longSparseArray, this.messageOwner.peer_id.user_id);
                            String string4 = LocaleController.getString(R.string.ActionManagedBotCreated);
                            this.messageText = string4;
                            CharSequence replaceWithLink3 = replaceWithLink(string4, "un1", user5);
                            this.messageText = replaceWithLink3;
                            this.messageText = replaceWithLink(replaceWithLink3, "un2", user6);
                        } else if (messageAction instanceof TLRPC.TL_messageActionSetSameChatWallPaper) {
                            this.contentType = 1;
                            this.type = 10;
                            TLRPC.TL_messageActionSetSameChatWallPaper tL_messageActionSetSameChatWallPaper = (TLRPC.TL_messageActionSetSameChatWallPaper) messageAction;
                            TLRPC.User user7 = getUser(abstractMap, longSparseArray, isOutOwner() ? 0L : getDialogId());
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
                            TLRPC.User user8 = getUser(abstractMap, longSparseArray, isOutOwner() ? 0L : getDialogId());
                            TLRPC.User user9 = getUser(abstractMap, longSparseArray, getDialogId());
                            if (user8 != null) {
                                if (user8.id == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                    if (tL_messageActionSetChatWallPaper.same) {
                                        this.type = 10;
                                        this.messageText = LocaleController.formatString(R.string.ActionSetSameWallpaperForThisChatSelf, new Object[0]);
                                    } else if (tL_messageActionSetChatWallPaper.for_both && user9 != null) {
                                        this.messageText = LocaleController.getString(R.string.ActionSetWallpaperForThisChatSelfBoth);
                                        SpannableString spannableString = new SpannableString(UserObject.getFirstName(user9));
                                        spannableString.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                                        this.messageText = AndroidUtilities.replaceCharSequence("%s", this.messageText, spannableString);
                                    } else {
                                        this.messageText = LocaleController.getString(R.string.ActionSetWallpaperForThisChatSelf);
                                    }
                                } else {
                                    SpannableString spannableString2 = new SpannableString(UserObject.getFirstName(user8));
                                    spannableString2.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
                                    if (tL_messageActionSetChatWallPaper.same) {
                                        this.type = 10;
                                        this.messageText = LocaleController.getString(R.string.ActionSetSameWallpaperForThisChat);
                                    } else if (tL_messageActionSetChatWallPaper.for_both) {
                                        this.messageText = LocaleController.getString(R.string.ActionSetWallpaperForThisChatBoth);
                                    } else {
                                        this.messageText = LocaleController.getString(R.string.ActionSetWallpaperForThisChat);
                                    }
                                    this.messageText = AndroidUtilities.replaceCharSequence("%s", this.messageText, spannableString2);
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
                            int i5 = messageAction.duration;
                            if (i5 != 0) {
                                int i6 = i5 / 86400;
                                if (i6 > 0) {
                                    formatPluralString2 = LocaleController.formatPluralString("Days", i6, new Object[0]);
                                } else {
                                    int i7 = i5 / 3600;
                                    if (i7 > 0) {
                                        formatPluralString2 = LocaleController.formatPluralString("Hours", i7, new Object[0]);
                                    } else {
                                        int i8 = i5 / 60;
                                        if (i8 > 0) {
                                            formatPluralString2 = LocaleController.formatPluralString("Minutes", i8, new Object[0]);
                                        } else {
                                            formatPluralString2 = LocaleController.formatPluralString("Seconds", i5, new Object[0]);
                                        }
                                    }
                                }
                                if (!(this.messageOwner.peer_id instanceof TLRPC.TL_peerChat) && !isSupergroup()) {
                                    this.messageText = LocaleController.formatString(R.string.ActionChannelCallEnded, formatPluralString2);
                                } else if (isOut()) {
                                    this.messageText = LocaleController.formatString(R.string.ActionGroupCallEndedByYou, formatPluralString2);
                                } else {
                                    this.messageText = replaceWithLink(LocaleController.formatString(R.string.ActionGroupCallEndedBy, formatPluralString2), "un1", tLObject3);
                                }
                            } else if ((message.peer_id instanceof TLRPC.TL_peerChat) || isSupergroup()) {
                                if (isOut()) {
                                    this.messageText = LocaleController.getString(R.string.ActionGroupCallStartedByYou);
                                } else {
                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionGroupCallStarted), "un1", tLObject3);
                                }
                            } else {
                                this.messageText = LocaleController.getString(R.string.ActionChannelCallJustStarted);
                            }
                        } else {
                            if (messageAction instanceof TLRPC.TL_messageActionInviteToGroupCall) {
                                long j2 = messageAction.user_id;
                                if (j2 == 0 && messageAction.users.size() == 1) {
                                    j2 = this.messageOwner.action.users.get(0).longValue();
                                }
                                if (j2 != 0) {
                                    TLRPC.User user10 = getUser(abstractMap, longSparseArray, j2);
                                    if (isOut()) {
                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionGroupCallYouInvited), "un2", user10);
                                    } else if (j2 == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionGroupCallInvitedYou), "un1", tLObject3);
                                    } else {
                                        CharSequence replaceWithLink4 = replaceWithLink(LocaleController.getString(R.string.ActionGroupCallInvited), "un2", user10);
                                        this.messageText = replaceWithLink4;
                                        this.messageText = replaceWithLink(replaceWithLink4, "un1", tLObject3);
                                    }
                                } else if (isOut()) {
                                    str3 = "";
                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionGroupCallYouInvited), "un2", this.messageOwner.action.users, abstractMap, longSparseArray);
                                } else {
                                    str3 = "";
                                    CharSequence replaceWithLink5 = replaceWithLink(LocaleController.getString(R.string.ActionGroupCallInvited), "un2", this.messageOwner.action.users, abstractMap, longSparseArray);
                                    this.messageText = replaceWithLink5;
                                    this.messageText = replaceWithLink(replaceWithLink5, "un1", tLObject3);
                                }
                            } else {
                                str3 = "";
                                if (messageAction instanceof TLRPC.TL_messageActionGeoProximityReached) {
                                    TLRPC.TL_messageActionGeoProximityReached tL_messageActionGeoProximityReached = (TLRPC.TL_messageActionGeoProximityReached) messageAction;
                                    long peerId = getPeerId(tL_messageActionGeoProximityReached.from_id);
                                    if (peerId > 0) {
                                        chat19 = getUser(abstractMap, longSparseArray, peerId);
                                    } else {
                                        chat19 = getChat(abstractMap2, longSparseArray2, -peerId);
                                    }
                                    long peerId2 = getPeerId(tL_messageActionGeoProximityReached.to_id);
                                    long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                                    if (peerId2 == clientUserId) {
                                        this.messageText = replaceWithLink(LocaleController.formatString(R.string.ActionUserWithinRadius, LocaleController.formatDistance(tL_messageActionGeoProximityReached.distance, 2)), "un1", chat19);
                                    } else {
                                        if (peerId2 > 0) {
                                            chat20 = getUser(abstractMap, longSparseArray, peerId2);
                                        } else {
                                            chat20 = getChat(abstractMap2, longSparseArray2, -peerId2);
                                        }
                                        if (peerId == clientUserId) {
                                            this.messageText = replaceWithLink(LocaleController.formatString(R.string.ActionUserWithinYouRadius, LocaleController.formatDistance(tL_messageActionGeoProximityReached.distance, 2)), "un1", chat20);
                                        } else {
                                            CharSequence replaceWithLink6 = replaceWithLink(LocaleController.formatString(R.string.ActionUserWithinOtherRadius, LocaleController.formatDistance(tL_messageActionGeoProximityReached.distance, 2)), "un2", chat20);
                                            this.messageText = replaceWithLink6;
                                            this.messageText = replaceWithLink(replaceWithLink6, "un1", chat19);
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
                                        TLRPC.Message message2 = this.messageOwner;
                                        if (message2.action.user_id == message2.from_id.user_id) {
                                            if (isOut()) {
                                                this.messageText = LocaleController.getString(R.string.ActionYouLeftUser);
                                            } else {
                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionLeftUser), "un1", tLObject3);
                                            }
                                        }
                                    }
                                    TLRPC.User user11 = getUser(abstractMap, longSparseArray, this.messageOwner.action.user_id);
                                    if (isOut()) {
                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionYouKickUser), "un2", user11);
                                    } else if (this.messageOwner.action.user_id == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionKickUserYou), "un1", tLObject3);
                                    } else {
                                        CharSequence replaceWithLink7 = replaceWithLink(LocaleController.getString(R.string.ActionKickUser), "un2", user11);
                                        this.messageText = replaceWithLink7;
                                        this.messageText = replaceWithLink(replaceWithLink7, "un1", tLObject3);
                                    }
                                } else {
                                    TLRPC.Chat chat21 = chat;
                                    if (messageAction instanceof TLRPC.TL_messageActionPaymentRefunded) {
                                        TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded = (TLRPC.TL_messageActionPaymentRefunded) messageAction;
                                        long peerDialogId = DialogObject.getPeerDialogId(tL_messageActionPaymentRefunded.peer);
                                        if (peerDialogId >= 0) {
                                            chat18 = getUser(abstractMap, longSparseArray, peerDialogId);
                                        } else {
                                            chat18 = getChat(abstractMap2, longSparseArray2, -peerDialogId);
                                        }
                                        this.messageText = StarsIntroActivity.replaceStars(replaceWithLink(LocaleController.formatString(R.string.ActionRefunded, tL_messageActionPaymentRefunded.currency + " " + LocaleController.formatNumber(tL_messageActionPaymentRefunded.total_amount, ',')), "un1", chat18));
                                    } else if (TlUtils.isInstance(messageAction, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                                        String monoForumTitle = ForumUtilities.getMonoForumTitle(this.currentAccount, DialogObject.getPeerDialogId(this.messageOwner.peer_id), true);
                                        if (monoForumTitle == null) {
                                            TLRPC.Chat chat22 = getChat(abstractMap2, longSparseArray2, -DialogObject.getPeerDialogId(this.messageOwner.peer_id));
                                            if (chat22 != null) {
                                                long j3 = chat22.linked_monoforum_id;
                                                if (j3 != 0 && (chat17 = getChat(abstractMap2, longSparseArray2, j3)) != null) {
                                                    chat22 = chat17;
                                                }
                                            }
                                            monoForumTitle = DialogObject.getDialogTitle(chat22);
                                        }
                                        String name = DialogObject.getName(getUser(abstractMap, longSparseArray, DialogObject.getPeerDialogId(this.messageOwner.saved_peer_id)));
                                        MessageSuggestionParams obtainSuggestionOfferFromReply = obtainSuggestionOfferFromReply();
                                        TLRPC.MessageAction messageAction2 = this.messageOwner.action;
                                        if (messageAction2 instanceof TLRPC.TL_messageActionSuggestedPostRefund) {
                                            boolean z2 = ((TLRPC.TL_messageActionSuggestedPostRefund) messageAction2).payer_initiated;
                                            if (obtainSuggestionOfferFromReply == null || (amountUtils$Amount2 = obtainSuggestionOfferFromReply.amount) == null) {
                                                if (z2) {
                                                    i4 = R.string.SuggestedOfferRefundByUserAmountUnknown;
                                                } else {
                                                    i4 = R.string.SuggestedOfferRefundByAdminAmountUnknown;
                                                }
                                                this.messageText = LocaleController.formatString(i4, name, monoForumTitle);
                                            } else {
                                                this.messageText = StarsIntroActivity.replaceStars(amountUtils$Amount2.currency == AmountUtils$Currency.TON, LocaleController.formatString(z2 ? R.string.SuggestedOfferRefundByUserAmountF : R.string.SuggestedOfferRefundByAdminAmountF, name, monoForumTitle, amountUtils$Amount2.asDecimalString()));
                                            }
                                        } else if (messageAction2 instanceof TLRPC.TL_messageActionSuggestedPostSuccess) {
                                            if (obtainSuggestionOfferFromReply == null || (amountUtils$Amount = obtainSuggestionOfferFromReply.amount) == null) {
                                                this.messageText = LocaleController.formatString(R.string.SuggestedOfferCompleteAmountUnknown, monoForumTitle);
                                            } else {
                                                this.messageText = StarsIntroActivity.replaceStars(amountUtils$Amount.currency == AmountUtils$Currency.TON, LocaleController.formatString(R.string.SuggestedOfferCompleteAmountF, monoForumTitle, amountUtils$Amount.asDecimalString()));
                                            }
                                        }
                                    } else {
                                        TLRPC.Message message3 = this.messageOwner;
                                        TLRPC.MessageAction messageAction3 = message3.action;
                                        if (messageAction3 instanceof TLRPC.TL_messageActionChatAddUser) {
                                            long j4 = messageAction3.user_id;
                                            if (j4 == 0 && messageAction3.users.size() == 1) {
                                                j4 = this.messageOwner.action.users.get(0).longValue();
                                            }
                                            if (j4 != 0) {
                                                TLRPC.User user12 = getUser(abstractMap, longSparseArray, j4);
                                                long j5 = this.messageOwner.peer_id.channel_id;
                                                TLRPC.Chat chat23 = j5 != 0 ? getChat(abstractMap2, longSparseArray2, j5) : null;
                                                TLRPC.Peer peer3 = this.messageOwner.from_id;
                                                if (peer3 != null && j4 == peer3.user_id) {
                                                    if (ChatObject.isChannel(chat23) && !chat23.megagroup) {
                                                        this.channelJoined = true;
                                                        this.messageText = LocaleController.getString(R.string.ChannelJoined);
                                                    } else if (this.messageOwner.peer_id.channel_id != 0) {
                                                        if (j4 == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
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
                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionYouAddUser), "un2", user12);
                                                } else if (j4 != UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                                                    CharSequence replaceWithLink8 = replaceWithLink(LocaleController.getString(R.string.ActionAddUser), "un2", user12);
                                                    this.messageText = replaceWithLink8;
                                                    this.messageText = replaceWithLink(replaceWithLink8, "un1", tLObject3);
                                                } else if (this.messageOwner.peer_id.channel_id != 0) {
                                                    if (chat23 != null && chat23.megagroup) {
                                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.MegaAddedBy), "un1", tLObject3);
                                                    } else {
                                                        this.messageText = replaceWithLink(LocaleController.getString(R.string.ChannelAddedBy), "un1", tLObject3);
                                                    }
                                                } else {
                                                    this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionAddUserYou), "un1", tLObject3);
                                                }
                                            } else if (isOut()) {
                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionYouAddUser), "un2", this.messageOwner.action.users, abstractMap, longSparseArray);
                                            } else {
                                                CharSequence replaceWithLink9 = replaceWithLink(LocaleController.getString(R.string.ActionAddUser), "un2", this.messageOwner.action.users, abstractMap, longSparseArray);
                                                this.messageText = replaceWithLink9;
                                                this.messageText = replaceWithLink(replaceWithLink9, "un1", tLObject3);
                                            }
                                        } else if (messageAction3 instanceof TLRPC.TL_messageActionChatJoinedByLink) {
                                            if (isOut()) {
                                                this.messageText = LocaleController.getString(R.string.ActionInviteYou);
                                            } else {
                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionInviteUser), "un1", tLObject3);
                                            }
                                        } else if (messageAction3 instanceof TLRPC.TL_messageActionGiveawayLaunch) {
                                            TLRPC.TL_messageActionGiveawayLaunch tL_messageActionGiveawayLaunch = (TLRPC.TL_messageActionGiveawayLaunch) messageAction3;
                                            TLRPC.Peer peer4 = message3.peer_id;
                                            if (peer4 != null) {
                                                long j6 = peer4.channel_id;
                                                if (j6 != 0) {
                                                    chat16 = getChat(abstractMap2, longSparseArray2, j6);
                                                    boolean isChannelAndNotMegaGroup2 = ChatObject.isChannelAndNotMegaGroup(chat16);
                                                    if ((tL_messageActionGiveawayLaunch.flags & 1) == 0) {
                                                        this.messageText = LocaleController.formatPluralStringComma(isChannelAndNotMegaGroup2 ? "BoostingStarsGiveawayJustStarted" : "BoostingStarsGiveawayJustStartedGroup", (int) tL_messageActionGiveawayLaunch.stars, chat16 != null ? chat16.title : str3);
                                                    } else {
                                                        this.messageText = LocaleController.formatString(isChannelAndNotMegaGroup2 ? R.string.BoostingGiveawayJustStarted : R.string.BoostingGiveawayJustStartedGroup, chat16 != null ? chat16.title : str3);
                                                    }
                                                }
                                            }
                                            chat16 = null;
                                            boolean isChannelAndNotMegaGroup22 = ChatObject.isChannelAndNotMegaGroup(chat16);
                                            if ((tL_messageActionGiveawayLaunch.flags & 1) == 0) {
                                            }
                                        } else if (messageAction3 instanceof TLRPC.TL_messageActionBoostApply) {
                                            TLRPC.Peer peer5 = message3.peer_id;
                                            if (peer5 != null) {
                                                long j7 = peer5.channel_id;
                                                if (j7 != 0) {
                                                    chat15 = getChat(abstractMap2, longSparseArray2, j7);
                                                    boolean isChannelAndNotMegaGroup3 = ChatObject.isChannelAndNotMegaGroup(chat15);
                                                    TLRPC.TL_messageActionBoostApply tL_messageActionBoostApply = (TLRPC.TL_messageActionBoostApply) this.messageOwner.action;
                                                    if (!(tLObject3 instanceof TLRPC.User)) {
                                                        TLRPC.User user13 = (TLRPC.User) tLObject3;
                                                        z = UserObject.isUserSelf(user13);
                                                        str7 = UserObject.getFirstName(user13);
                                                    } else {
                                                        str7 = tLObject3 instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject3).title : str3;
                                                        z = false;
                                                    }
                                                    if (!z) {
                                                        int i9 = tL_messageActionBoostApply.boosts;
                                                        if (i9 <= 1) {
                                                            this.messageText = LocaleController.getString(isChannelAndNotMegaGroup3 ? R.string.BoostingBoostsChannelByYouServiceMsg : R.string.BoostingBoostsGroupByYouServiceMsg);
                                                        } else {
                                                            this.messageText = LocaleController.formatPluralString(isChannelAndNotMegaGroup3 ? "BoostingBoostsChannelByYouServiceMsgCount" : "BoostingBoostsGroupByYouServiceMsgCount", i9, new Object[0]);
                                                        }
                                                    } else {
                                                        int i10 = tL_messageActionBoostApply.boosts;
                                                        if (i10 <= 1) {
                                                            this.messageText = LocaleController.formatString(isChannelAndNotMegaGroup3 ? R.string.BoostingBoostsChannelByUserServiceMsg : R.string.BoostingBoostsGroupByUserServiceMsg, str7);
                                                        } else {
                                                            this.messageText = LocaleController.formatPluralString(isChannelAndNotMegaGroup3 ? "BoostingBoostsChannelByUserServiceMsgCount" : "BoostingBoostsGroupByUserServiceMsgCount", i10, str7);
                                                        }
                                                    }
                                                }
                                            }
                                            chat15 = null;
                                            boolean isChannelAndNotMegaGroup32 = ChatObject.isChannelAndNotMegaGroup(chat15);
                                            TLRPC.TL_messageActionBoostApply tL_messageActionBoostApply2 = (TLRPC.TL_messageActionBoostApply) this.messageOwner.action;
                                            if (!(tLObject3 instanceof TLRPC.User)) {
                                            }
                                            if (!z) {
                                            }
                                        } else if (messageAction3 instanceof TLRPC.TL_messageActionGiveawayResults) {
                                            TLRPC.Peer peer6 = message3.peer_id;
                                            if (peer6 != null) {
                                                long j8 = peer6.channel_id;
                                                if (j8 != 0) {
                                                    chat14 = getChat(abstractMap2, longSparseArray2, j8);
                                                    boolean isChannelAndNotMegaGroup4 = ChatObject.isChannelAndNotMegaGroup(chat14);
                                                    tL_messageActionGiveawayResults = (TLRPC.TL_messageActionGiveawayResults) this.messageOwner.action;
                                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                                    if (!tL_messageActionGiveawayResults.stars) {
                                                        spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("BoostingStarsGiveawayServiceWinnersSelected", tL_messageActionGiveawayResults.winners_count));
                                                        if (tL_messageActionGiveawayResults.unclaimed_count > 0) {
                                                            spannableStringBuilder.append((CharSequence) "\n");
                                                            spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString(isChannelAndNotMegaGroup4 ? "BoostingStarsGiveawayServiceUndistributed" : "BoostingStarsGiveawayServiceUndistributedGroup", tL_messageActionGiveawayResults.unclaimed_count, new Object[0]));
                                                        }
                                                    } else {
                                                        spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("BoostingGiveawayServiceWinnersSelected", tL_messageActionGiveawayResults.winners_count, new Object[0]));
                                                        if (tL_messageActionGiveawayResults.unclaimed_count > 0) {
                                                            spannableStringBuilder.append((CharSequence) "\n");
                                                            spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString(isChannelAndNotMegaGroup4 ? "BoostingGiveawayServiceUndistributed" : "BoostingGiveawayServiceUndistributedGroup", tL_messageActionGiveawayResults.unclaimed_count, new Object[0]));
                                                        }
                                                    }
                                                    this.messageText = spannableStringBuilder;
                                                }
                                            }
                                            chat14 = null;
                                            boolean isChannelAndNotMegaGroup42 = ChatObject.isChannelAndNotMegaGroup(chat14);
                                            tL_messageActionGiveawayResults = (TLRPC.TL_messageActionGiveawayResults) this.messageOwner.action;
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                            if (!tL_messageActionGiveawayResults.stars) {
                                            }
                                            this.messageText = spannableStringBuilder2;
                                        } else if (messageAction3 instanceof TLRPC.TL_messageActionPrizeStars) {
                                            TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) messageAction3;
                                            this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("ActionStarGiveawayPrize", (int) tL_messageActionPrizeStars.stars)), "un1", getChat(abstractMap2, longSparseArray2, -DialogObject.getPeerDialogId(tL_messageActionPrizeStars.boost_peer)));
                                        } else if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction3;
                                            if (tL_messageActionStarGift.prepaid_upgrade) {
                                                i3 = (int) tL_messageActionStarGift.upgrade_stars;
                                            } else {
                                                TL_stars.StarGift starGift = tL_messageActionStarGift.gift;
                                                i3 = starGift != null ? (int) starGift.stars : 0;
                                                if (!tL_messageActionStarGift.upgrade_separate) {
                                                    i3 += (int) tL_messageActionStarGift.upgrade_stars;
                                                }
                                            }
                                            TLRPC.Peer peer7 = tL_messageActionStarGift.peer;
                                            boolean z3 = peer7 != null && DialogObject.getPeerDialogId(peer7) < 0;
                                            TLRPC.User user14 = getUser(abstractMap, longSparseArray, this.messageOwner.peer_id.user_id);
                                            if (!tL_messageActionStarGift.prepaid_upgrade && (peer = tL_messageActionStarGift.from_id) != null) {
                                                long peerDialogId2 = DialogObject.getPeerDialogId(peer);
                                                if (peerDialogId2 >= 0) {
                                                    tLObject3 = getUser(abstractMap, longSparseArray, peerDialogId2);
                                                } else {
                                                    tLObject3 = getChat(abstractMap2, longSparseArray2, -peerDialogId2);
                                                }
                                            }
                                            TLRPC.Peer peer8 = tL_messageActionStarGift.peer;
                                            if (peer8 != null) {
                                                long peerDialogId3 = DialogObject.getPeerDialogId(peer8);
                                                if (peerDialogId3 >= 0) {
                                                    tLObject2 = getUser(abstractMap, longSparseArray, peerDialogId3);
                                                } else {
                                                    tLObject2 = getChat(abstractMap2, longSparseArray2, -peerDialogId3);
                                                }
                                            } else {
                                                tLObject2 = null;
                                            }
                                            if (tL_messageActionStarGift.prepaid_upgrade) {
                                                if ((tLObject3 instanceof TLRPC.User) && ((TLRPC.User) tLObject3).self && !tL_messageActionStarGift.forceIn) {
                                                    this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionPrepaidGiftOutbound)), "un1", user14);
                                                } else {
                                                    this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionPrepaidGiftInbound)), "un1", tLObject3);
                                                }
                                            } else if (UserObject.isService(getDialogId()) && tL_messageActionStarGift.from_id == null) {
                                                this.messageText = AndroidUtilities.replaceTags(LocaleController.getString(tL_messageActionStarGift.auction_acquired ? R.string.ActionGiftAuctionSelf : R.string.ActionGiftSomeone));
                                                this.messageTextShort = LocaleController.getString(R.string.ActionStarGift);
                                            } else if (z3) {
                                                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("ActionGiftChannel", i3));
                                                this.messageText = replaceTags;
                                                CharSequence replaceWithLink10 = replaceWithLink(replaceTags, "un1", tLObject3);
                                                this.messageText = replaceWithLink10;
                                                this.messageText = replaceWithLink(replaceWithLink10, "un2", tLObject2);
                                                this.messageTextShort = LocaleController.getString(R.string.ActionStarGift);
                                            } else if (UserObject.isUserSelf(user14)) {
                                                this.messageText = AndroidUtilities.replaceTags(LocaleController.getString(tL_messageActionStarGift.auction_acquired ? R.string.ActionGiftAuctionSelf : R.string.ActionGiftSelf));
                                                this.messageTextShort = LocaleController.getString(R.string.ActionStarGift);
                                            } else {
                                                boolean z4 = tLObject3 instanceof TLRPC.User;
                                                if (z4 && ((TLRPC.User) tLObject3).self && !tL_messageActionStarGift.forceIn) {
                                                    this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionGiftOutbound)), "un1", user14);
                                                    TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageActionStarGift.message;
                                                    if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text)) {
                                                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(tL_messageActionStarGift.message.text);
                                                        addEntitiesToText(spannableStringBuilder3, tL_messageActionStarGift.message.entities, isOutOwner(), false, false, false);
                                                        this.messageTextShort = spannableStringBuilder3;
                                                    } else {
                                                        this.messageTextShort = LocaleController.getString(R.string.ActionStarGift);
                                                    }
                                                } else if (z4 && UserObject.isService(((TLRPC.User) tLObject3).id)) {
                                                    this.messageText = TextUtils.replace(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionGiftInbound)), new String[]{"un1"}, new CharSequence[]{LocaleController.getString(R.string.StarsTransactionUnknown)});
                                                } else {
                                                    this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionGiftInbound)), "un1", tLObject3);
                                                    TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageActionStarGift.message;
                                                    if (tL_textWithEntities3 != null && !TextUtils.isEmpty(tL_textWithEntities3.text)) {
                                                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(tL_messageActionStarGift.message.text);
                                                        addEntitiesToText(spannableStringBuilder4, tL_messageActionStarGift.message.entities, isOutOwner(), false, false, false);
                                                        this.messageTextShort = spannableStringBuilder4;
                                                    } else {
                                                        this.messageTextShort = LocaleController.getString(R.string.ActionStarGift);
                                                    }
                                                }
                                            }
                                            int indexOf = this.messageText.toString().indexOf("un2");
                                            if (indexOf != -1) {
                                                this.messageText = SpannableStringBuilder.valueOf(this.messageText).replace(indexOf, indexOf + 3, (CharSequence) LocaleController.formatPluralStringComma("Gift2StarsCount", i3));
                                            }
                                        } else if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                                            TLRPC.User user15 = getUser(abstractMap, longSparseArray, getDialogId());
                                            TL_stars.StarsAmount starsAmount = tL_messageActionStarGiftUnique.resale_amount;
                                            if (starsAmount != null) {
                                                AmountUtils$Amount ofSafe = AmountUtils$Amount.ofSafe(starsAmount);
                                                long dialogId = getDialogId();
                                                TLRPC.Peer peer9 = tL_messageActionStarGiftUnique.from_id;
                                                if (peer9 != null) {
                                                    dialogId = DialogObject.getPeerDialogId(peer9);
                                                }
                                                if (dialogId >= 0) {
                                                    chat12 = getUser(abstractMap, longSparseArray, dialogId);
                                                } else {
                                                    chat12 = getChat(abstractMap2, longSparseArray2, -dialogId);
                                                }
                                                if (tL_messageActionStarGiftUnique.craft) {
                                                    this.messageText = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionUniqueGiftCrafted));
                                                } else {
                                                    TLRPC.Peer peer10 = tL_messageActionStarGiftUnique.peer;
                                                    if (peer10 != null) {
                                                        long peerDialogId4 = DialogObject.getPeerDialogId(peer10);
                                                        if (peerDialogId4 >= 0) {
                                                            chat13 = getUser(abstractMap, longSparseArray, peerDialogId4);
                                                        } else {
                                                            chat13 = getChat(abstractMap2, longSparseArray2, -peerDialogId4);
                                                        }
                                                        if (ofSafe.currency == AmountUtils$Currency.TON) {
                                                            this.messageText = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.ActionUniqueGiftResaleServiceTON, ofSafe.asFormatString()));
                                                        } else {
                                                            this.messageText = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("ActionUniqueGiftResaleService", (int) ofSafe.asDecimal()));
                                                        }
                                                        CharSequence replaceWithLink11 = replaceWithLink(this.messageText, "un1", chat12);
                                                        this.messageText = replaceWithLink11;
                                                        this.messageText = replaceWithLink(replaceWithLink11, "un2", chat13);
                                                    } else {
                                                        if (tL_messageActionStarGiftUnique.from_offer) {
                                                            if (ofSafe.currency == AmountUtils$Currency.TON) {
                                                                this.messageText = AndroidUtilities.replaceTags(LocaleController.formatString(isOutOwner() ? R.string.ActionUniqueGiftResaleSoldOutboundTON : R.string.ActionUniqueGiftResaleOutboundTON, ofSafe.asFormatString()));
                                                            } else {
                                                                this.messageText = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(isOutOwner() ? "ActionUniqueGiftResaleSoldOutbound" : "ActionUniqueGiftResaleOutbound", (int) ofSafe.asDecimal()));
                                                            }
                                                        } else if (ofSafe.currency == AmountUtils$Currency.TON) {
                                                            this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.formatString(isOutOwner() ? R.string.ActionUniqueGiftResaleOutboundTON : R.string.ActionUniqueGiftResaleInboundTON, ofSafe.asFormatString())), "un1", chat12);
                                                        } else {
                                                            this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(isOutOwner() ? "ActionUniqueGiftResaleOutbound" : "ActionUniqueGiftResaleInbound", (int) ofSafe.asDecimal())), "un1", chat12);
                                                        }
                                                    }
                                                }
                                            } else if (tL_messageActionStarGiftUnique.upgrade) {
                                                TLRPC.Peer peer11 = tL_messageActionStarGiftUnique.peer;
                                                if (peer11 != null) {
                                                    long peerDialogId5 = DialogObject.getPeerDialogId(peer11);
                                                    if (peerDialogId5 >= 0) {
                                                        chat11 = getUser(abstractMap, longSparseArray, peerDialogId5);
                                                    } else {
                                                        chat11 = getChat(abstractMap2, longSparseArray2, -peerDialogId5);
                                                    }
                                                    this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionUniqueGiftUpgradeInboundChannel)), "un1", chat11);
                                                } else if (UserObject.isUserSelf(user15)) {
                                                    this.messageText = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionUniqueGiftUpgradeSelf));
                                                } else {
                                                    this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.getString(isOutOwner() ? R.string.ActionUniqueGiftUpgradeOutbound : R.string.ActionUniqueGiftUpgradeInbound)), "un1", user15);
                                                }
                                            } else {
                                                long dialogId2 = getDialogId();
                                                TLRPC.Peer peer12 = tL_messageActionStarGiftUnique.from_id;
                                                if (peer12 != null) {
                                                    dialogId2 = DialogObject.getPeerDialogId(peer12);
                                                }
                                                if (dialogId2 >= 0) {
                                                    chat9 = getUser(abstractMap, longSparseArray, dialogId2);
                                                } else {
                                                    chat9 = getChat(abstractMap2, longSparseArray2, -dialogId2);
                                                }
                                                if (tL_messageActionStarGiftUnique.craft) {
                                                    this.messageText = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionUniqueGiftCrafted));
                                                } else {
                                                    TLRPC.Peer peer13 = tL_messageActionStarGiftUnique.peer;
                                                    if (peer13 != null) {
                                                        long peerDialogId6 = DialogObject.getPeerDialogId(peer13);
                                                        if (peerDialogId6 >= 0) {
                                                            chat10 = getUser(abstractMap, longSparseArray, peerDialogId6);
                                                        } else {
                                                            chat10 = getChat(abstractMap2, longSparseArray2, -peerDialogId6);
                                                        }
                                                        SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionUniqueGiftTransferService));
                                                        this.messageText = replaceTags2;
                                                        CharSequence replaceWithLink12 = replaceWithLink(replaceTags2, "un1", chat9);
                                                        this.messageText = replaceWithLink12;
                                                        this.messageText = replaceWithLink(replaceWithLink12, "un2", chat10);
                                                    } else if (tL_messageActionStarGiftUnique.assigned) {
                                                        this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.ActionUniqueGiftTransferOutboundAssigned, tL_messageActionStarGiftUnique.gift.title + " #" + LocaleController.formatNumber(tL_messageActionStarGiftUnique.gift.num, ','))), "un1", chat9);
                                                    } else {
                                                        this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.getString(isOutOwner() ? R.string.ActionUniqueGiftTransferOutbound : R.string.ActionUniqueGiftTransferInbound)), "un1", chat9);
                                                    }
                                                }
                                            }
                                        } else if (messageAction3 instanceof TLRPC.TL_messageActionGiftStars) {
                                            boolean z5 = tLObject3 instanceof TLRPC.User;
                                            if (z5 && ((TLRPC.User) tLObject3).self) {
                                                this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionGiftOutbound)), "un1", getUser(abstractMap, longSparseArray, message3.peer_id.user_id));
                                            } else if (z5 && UserObject.isService(((TLRPC.User) tLObject3).id)) {
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
                                                    formatCurrency = String.format("%.2f", Double.valueOf(this.messageOwner.action.cryptoAmount * Math.pow(10.0d, -9.0d))) + " " + this.messageOwner.action.cryptoCurrency + " (~ " + ((Object) formatCurrency) + ")";
                                                }
                                                this.messageText = valueOf.replace(indexOf2, indexOf2 + 3, (CharSequence) formatCurrency);
                                            }
                                        } else if (!(messageAction3 instanceof TLRPC.TL_messageActionGiftCode) || ((TLRPC.TL_messageActionGiftCode) messageAction3).boost_peer == null) {
                                            if (TlUtils.isInstance(messageAction3, TLRPC.TL_messageActionGiftPremium.class, TLRPC.TL_messageActionGiftCode.class, TLRPC.TL_messageActionGiftTon.class)) {
                                                if ((tLObject3 instanceof TLRPC.User) && ((TLRPC.User) tLObject3).self) {
                                                    this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionGiftOutbound)), "un1", getUser(abstractMap, longSparseArray, this.messageOwner.peer_id.user_id));
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
                                                        formatCurrency2 = String.format("%.2f", Double.valueOf(this.messageOwner.action.cryptoAmount * Math.pow(10.0d, -9.0d))) + " " + this.messageOwner.action.cryptoCurrency + " (~ " + ((Object) formatCurrency2) + ")";
                                                    }
                                                    this.messageText = valueOf2.replace(indexOf3, indexOf3 + 3, (CharSequence) formatCurrency2);
                                                }
                                                this.messageText = StarsIntroActivity.replaceStars(this.messageText);
                                            } else {
                                                TLRPC.Message message4 = this.messageOwner;
                                                TLRPC.MessageAction messageAction6 = message4.action;
                                                if (messageAction6 instanceof TLRPC.TL_messageActionSuggestBirthday) {
                                                    if (isOutOwner()) {
                                                        this.messageText = LocaleController.getString(R.string.ActionYouSuggestBirthday);
                                                    } else {
                                                        this.messageText = replaceWithLink(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ActionSuggestBirthday)), "un1", tLObject3);
                                                    }
                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionSuggestProfilePhoto) {
                                                    TLRPC.Photo photo = messageAction6.photo;
                                                    if (photo != null && (arrayList = photo.video_sizes) != null && !arrayList.isEmpty()) {
                                                        this.messageText = LocaleController.getString(R.string.ActionSuggestVideoShort);
                                                    } else {
                                                        this.messageText = LocaleController.getString(R.string.ActionSuggestPhotoShort);
                                                    }
                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionChatEditPhoto) {
                                                    TLRPC.Peer peer14 = message4.peer_id;
                                                    if (peer14 != null) {
                                                        long j9 = peer14.channel_id;
                                                        if (j9 != 0) {
                                                            chat8 = getChat(abstractMap2, longSparseArray2, j9);
                                                            if (!ChatObject.isChannel(chat8) && !chat8.megagroup) {
                                                                if (isVideoAvatar()) {
                                                                    this.messageText = LocaleController.getString(R.string.ActionChannelChangedVideo);
                                                                } else {
                                                                    this.messageText = LocaleController.getString(R.string.ActionChannelChangedPhoto);
                                                                }
                                                            } else if (!isOut()) {
                                                                if (isVideoAvatar()) {
                                                                    this.messageText = LocaleController.getString(R.string.ActionYouChangedVideo);
                                                                } else {
                                                                    this.messageText = LocaleController.getString(R.string.ActionYouChangedPhoto);
                                                                }
                                                            } else if (isVideoAvatar()) {
                                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionChangedVideo), "un1", tLObject3);
                                                            } else {
                                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionChangedPhoto), "un1", tLObject3);
                                                            }
                                                        }
                                                    }
                                                    chat8 = null;
                                                    if (!ChatObject.isChannel(chat8)) {
                                                    }
                                                    if (!isOut()) {
                                                    }
                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionChatEditTitle) {
                                                    TLRPC.Peer peer15 = message4.peer_id;
                                                    if (peer15 != null) {
                                                        long j10 = peer15.channel_id;
                                                        if (j10 != 0) {
                                                            chat7 = getChat(abstractMap2, longSparseArray2, j10);
                                                            if (!ChatObject.isChannel(chat7) && !chat7.megagroup) {
                                                                this.messageText = LocaleController.getString(R.string.ActionChannelChangedTitle).replace("un2", this.messageOwner.action.title);
                                                            } else if (!isOut()) {
                                                                this.messageText = LocaleController.getString(R.string.ActionYouChangedTitle).replace("un2", this.messageOwner.action.title);
                                                            } else {
                                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionChangedTitle).replace("un2", this.messageOwner.action.title), "un1", tLObject3);
                                                            }
                                                        }
                                                    }
                                                    chat7 = null;
                                                    if (!ChatObject.isChannel(chat7)) {
                                                    }
                                                    if (!isOut()) {
                                                    }
                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionChatDeletePhoto) {
                                                    TLRPC.Peer peer16 = message4.peer_id;
                                                    if (peer16 != null) {
                                                        long j11 = peer16.channel_id;
                                                        if (j11 != 0) {
                                                            chat6 = getChat(abstractMap2, longSparseArray2, j11);
                                                            if (!ChatObject.isChannel(chat6) && !chat6.megagroup) {
                                                                this.messageText = LocaleController.getString(R.string.ActionChannelRemovedPhoto);
                                                            } else if (!isOut()) {
                                                                this.messageText = LocaleController.getString(R.string.ActionYouRemovedPhoto);
                                                            } else {
                                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.ActionRemovedPhoto), "un1", tLObject3);
                                                            }
                                                        }
                                                    }
                                                    chat6 = null;
                                                    if (!ChatObject.isChannel(chat6)) {
                                                    }
                                                    if (!isOut()) {
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
                                                    Iterator<TLRPC.Peer> it = ((TLRPC.TL_messageActionRequestedPeer) this.messageOwner.action).peers.iterator();
                                                    int i11 = 0;
                                                    int i12 = 0;
                                                    int i13 = 0;
                                                    while (it.hasNext()) {
                                                        TLRPC.Peer next = it.next();
                                                        boolean z6 = next instanceof TLRPC.TL_peerUser;
                                                        if (z6) {
                                                            str6 = str9;
                                                            Iterator<TLRPC.Peer> it2 = it;
                                                            tLObject = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(next.user_id));
                                                            if (tLObject == null) {
                                                                tLObject = getUser(abstractMap, longSparseArray, next.user_id);
                                                            }
                                                            it = it2;
                                                        } else {
                                                            str6 = str9;
                                                            Iterator<TLRPC.Peer> it3 = it;
                                                            if (next instanceof TLRPC.TL_peerChat) {
                                                                it = it3;
                                                                tLObject = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(next.chat_id));
                                                                if (tLObject == null) {
                                                                    tLObject = getChat(abstractMap2, longSparseArray2, next.chat_id);
                                                                }
                                                            } else {
                                                                it = it3;
                                                                if (next instanceof TLRPC.TL_peerChannel) {
                                                                    tLObject = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(next.channel_id));
                                                                    if (tLObject == null) {
                                                                        tLObject = getChat(abstractMap2, longSparseArray2, next.channel_id);
                                                                    }
                                                                } else {
                                                                    tLObject = null;
                                                                }
                                                            }
                                                        }
                                                        if (z6) {
                                                            i11++;
                                                        } else if (next instanceof TLRPC.TL_peerChat) {
                                                            i13++;
                                                        } else {
                                                            i12++;
                                                        }
                                                        if (tLObject != null) {
                                                            arrayList4.add(tLObject);
                                                        }
                                                        str9 = str6;
                                                    }
                                                    String str10 = str9;
                                                    if (i11 > 0 && i11 != arrayList4.size()) {
                                                        this.messageText = LocaleController.getPluralString("ActionRequestedPeerUserPlural", i11);
                                                    } else if (i12 > 0 && i12 != arrayList4.size()) {
                                                        this.messageText = LocaleController.getPluralString("ActionRequestedPeerChannelPlural", i12);
                                                    } else if (i13 > 0 && i13 != arrayList4.size()) {
                                                        this.messageText = LocaleController.getPluralString("ActionRequestedPeerChatPlural", i13);
                                                    } else {
                                                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                                        int i14 = 0;
                                                        while (i14 < arrayList4.size()) {
                                                            String str11 = str10;
                                                            spannableStringBuilder5.append(replaceWithLink(str11, str11, (TLObject) arrayList4.get(i14)));
                                                            String str12 = str8;
                                                            if (i14 < arrayList4.size() - 1) {
                                                                spannableStringBuilder5.append((CharSequence) str12);
                                                            }
                                                            i14++;
                                                            str10 = str11;
                                                            str8 = str12;
                                                        }
                                                        this.messageText = AndroidUtilities.replaceCharSequence(str10, LocaleController.getString(R.string.ActionRequestedPeer), spannableStringBuilder5);
                                                    }
                                                    TLRPC.User user16 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(getDialogId()));
                                                    if (user16 == null) {
                                                        user16 = getUser(abstractMap, longSparseArray, getDialogId());
                                                    }
                                                    this.messageText = replaceWithLink(this.messageText, "un2", user16);
                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionSetMessagesTTL) {
                                                    TLRPC.TL_messageActionSetMessagesTTL tL_messageActionSetMessagesTTL = (TLRPC.TL_messageActionSetMessagesTTL) messageAction6;
                                                    TLRPC.Peer peer17 = message4.peer_id;
                                                    if (peer17 != null) {
                                                        long j12 = peer17.channel_id;
                                                        if (j12 != 0) {
                                                            chat5 = getChat(abstractMap2, longSparseArray2, j12);
                                                            if (chat5 == null && !chat5.megagroup) {
                                                                int i15 = tL_messageActionSetMessagesTTL.period;
                                                                if (i15 != 0) {
                                                                    this.messageText = LocaleController.formatString(R.string.ActionTTLChannelChanged, LocaleController.formatTTLString(i15));
                                                                } else {
                                                                    this.messageText = LocaleController.getString(R.string.ActionTTLChannelDisabled);
                                                                }
                                                            } else {
                                                                j = tL_messageActionSetMessagesTTL.auto_setting_from;
                                                                if (j == 0) {
                                                                    this.drawServiceWithDefaultTypeface = true;
                                                                    if (j == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                                                        this.messageText = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AutoDeleteGlobalActionFromYou, LocaleController.formatTTLString(tL_messageActionSetMessagesTTL.period)));
                                                                    } else {
                                                                        TLRPC.Chat chat24 = longSparseArray != null ? (TLObject) longSparseArray.get(tL_messageActionSetMessagesTTL.auto_setting_from) : null;
                                                                        if (chat24 == null && abstractMap != null) {
                                                                            chat24 = abstractMap.get(Long.valueOf(tL_messageActionSetMessagesTTL.auto_setting_from));
                                                                        }
                                                                        if (chat24 == null && abstractMap2 != null) {
                                                                            chat24 = abstractMap2.get(Long.valueOf(tL_messageActionSetMessagesTTL.auto_setting_from));
                                                                        }
                                                                        if (chat24 == null) {
                                                                            if (tL_messageActionSetMessagesTTL.auto_setting_from > 0) {
                                                                                chat24 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_messageActionSetMessagesTTL.auto_setting_from));
                                                                            } else {
                                                                                chat24 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-tL_messageActionSetMessagesTTL.auto_setting_from));
                                                                            }
                                                                        }
                                                                        if (chat24 != null) {
                                                                            tLObject3 = chat24;
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
                                                            }
                                                        }
                                                    }
                                                    chat5 = null;
                                                    if (chat5 == null) {
                                                    }
                                                    j = tL_messageActionSetMessagesTTL.auto_setting_from;
                                                    if (j == 0) {
                                                    }
                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionLoginUnknownLocation) {
                                                    long j13 = message4.date * 1000;
                                                    if (LocaleController.getInstance().getFormatterDay() != null && LocaleController.getInstance().getFormatterYear() != null) {
                                                        sb = LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(j13), LocaleController.getInstance().getFormatterDay().format(j13));
                                                        str2 = str3;
                                                    } else {
                                                        StringBuilder sb2 = new StringBuilder();
                                                        str2 = str3;
                                                        sb2.append(str2);
                                                        sb2.append(this.messageOwner.date);
                                                        sb = sb2.toString();
                                                    }
                                                    TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                                                    if (currentUser == null) {
                                                        currentUser = getUser(abstractMap, longSparseArray, this.messageOwner.peer_id.user_id);
                                                    }
                                                    String firstName = currentUser != null ? UserObject.getFirstName(currentUser) : str2;
                                                    int i16 = R.string.NotificationUnrecognizedDevice;
                                                    TLRPC.MessageAction messageAction7 = this.messageOwner.action;
                                                    this.messageText = LocaleController.formatString(i16, firstName, sb, messageAction7.title, messageAction7.address);
                                                } else {
                                                    str2 = str3;
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
                                                        TLRPC.Peer peer18 = message4.peer_id;
                                                        if (peer18 != null) {
                                                            long j14 = peer18.channel_id;
                                                            if (j14 != 0) {
                                                                chat4 = getChat(abstractMap2, longSparseArray2, j14);
                                                                if (!ChatObject.isChannel(chat4) && chat4.megagroup) {
                                                                    this.messageText = LocaleController.getString(R.string.ActionCreateMega);
                                                                } else {
                                                                    this.messageText = LocaleController.getString(R.string.ActionCreateChannel);
                                                                }
                                                            }
                                                        }
                                                        chat4 = null;
                                                        if (!ChatObject.isChannel(chat4)) {
                                                        }
                                                        this.messageText = LocaleController.getString(R.string.ActionCreateChannel);
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionChatMigrateTo) {
                                                        this.messageText = LocaleController.getString(R.string.ActionMigrateFromGroup);
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionChannelMigrateFrom) {
                                                        this.messageText = LocaleController.getString(R.string.ActionMigrateFromGroup);
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionPinMessage) {
                                                        generatePinMessageText(user, user == null ? getChat(abstractMap2, longSparseArray2, message4.peer_id.channel_id) : null);
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionHistoryClear) {
                                                        this.messageText = LocaleController.getString(R.string.HistoryCleared);
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionTopicCreate) {
                                                        this.messageText = LocaleController.getString(R.string.TopicCreated);
                                                        TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = (TLRPC.TL_messageActionTopicCreate) this.messageOwner.action;
                                                        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                                                        tL_forumTopic.icon_emoji_id = tL_messageActionTopicCreate.icon_emoji_id;
                                                        tL_forumTopic.title = tL_messageActionTopicCreate.title;
                                                        tL_forumTopic.icon_color = tL_messageActionTopicCreate.icon_color;
                                                        this.messageTextShort = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.TopicWasCreatedAction), ForumUtilities.getTopicSpannedName(tL_forumTopic, null, false));
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionTopicEdit) {
                                                        TLRPC.TL_messageActionTopicEdit tL_messageActionTopicEdit = (TLRPC.TL_messageActionTopicEdit) messageAction6;
                                                        if (user != null) {
                                                            str4 = ContactsController.formatName(user.first_name, user.last_name);
                                                            chat3 = user;
                                                        } else if (chat21 != null) {
                                                            chat3 = chat21;
                                                            str4 = chat3.title;
                                                        } else {
                                                            str4 = null;
                                                            chat3 = null;
                                                        }
                                                        if (str4 != null) {
                                                            str5 = str4.trim();
                                                        } else {
                                                            str5 = "DELETED";
                                                        }
                                                        TLRPC.MessageAction messageAction8 = this.messageOwner.action;
                                                        int i17 = messageAction8.flags;
                                                        if ((i17 & 8) > 0) {
                                                            if (((TLRPC.TL_messageActionTopicEdit) messageAction8).hidden) {
                                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.TopicHidden2), "%s", chat3);
                                                                this.messageTextShort = LocaleController.getString(R.string.TopicHidden);
                                                            } else {
                                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.TopicShown2), "%s", chat3);
                                                                this.messageTextShort = LocaleController.getString(R.string.TopicShown);
                                                            }
                                                        } else if ((4 & i17) <= 0) {
                                                            int i18 = 2 & i17;
                                                            if (i18 != 0 && (i17 & 1) != 0) {
                                                                TLRPC.TL_forumTopic tL_forumTopic2 = new TLRPC.TL_forumTopic();
                                                                tL_forumTopic2.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                                                tL_forumTopic2.title = tL_messageActionTopicEdit.title;
                                                                tL_forumTopic2.icon_color = ForumBubbleDrawable.serverSupportedColor[0];
                                                                CharSequence topicSpannedName = ForumUtilities.getTopicSpannedName(tL_forumTopic2, null, this.topicIconDrawable, false);
                                                                this.messageText = AndroidUtilities.replaceCharSequence("%2$s", AndroidUtilities.replaceCharSequence("%1$s", LocaleController.getString(R.string.TopicChangeIconAndTitleTo), str5), topicSpannedName);
                                                                this.messageTextShort = LocaleController.getString(R.string.TopicRenamed);
                                                                this.messageTextForReply = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.TopicChangeIconAndTitleToInReply), topicSpannedName);
                                                            } else if (i18 != 0) {
                                                                TLRPC.TL_forumTopic tL_forumTopic3 = new TLRPC.TL_forumTopic();
                                                                tL_forumTopic3.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                                                tL_forumTopic3.title = str2;
                                                                tL_forumTopic3.icon_color = ForumBubbleDrawable.serverSupportedColor[0];
                                                                CharSequence topicSpannedName2 = ForumUtilities.getTopicSpannedName(tL_forumTopic3, null, this.topicIconDrawable, false);
                                                                this.messageText = AndroidUtilities.replaceCharSequence("%2$s", AndroidUtilities.replaceCharSequence("%1$s", LocaleController.getString(R.string.TopicIconChangedTo), str5), topicSpannedName2);
                                                                this.messageTextShort = LocaleController.getString(R.string.TopicIconChanged);
                                                                this.messageTextForReply = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.TopicIconChangedToInReply), topicSpannedName2);
                                                            } else if ((1 & i17) != 0) {
                                                                this.messageText = AndroidUtilities.replaceCharSequence("%2$s", AndroidUtilities.replaceCharSequence("%1$s", LocaleController.getString(R.string.TopicRenamedTo), str5), tL_messageActionTopicEdit.title);
                                                                this.messageTextShort = LocaleController.getString(R.string.TopicRenamed);
                                                                this.messageTextForReply = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.TopicRenamedToInReply), tL_messageActionTopicEdit.title);
                                                            }
                                                        } else if (((TLRPC.TL_messageActionTopicEdit) messageAction8).closed) {
                                                            this.messageText = replaceWithLink(LocaleController.getString(R.string.TopicClosed2), "%s", chat3);
                                                            this.messageTextShort = LocaleController.getString(R.string.TopicClosed);
                                                        } else {
                                                            this.messageText = replaceWithLink(LocaleController.getString(R.string.TopicRestarted2), "%s", chat3);
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
                                                        int i19 = tL_messageActionConferenceCall.duration;
                                                        if (i19 > 0) {
                                                            String formatCallDuration = LocaleController.formatCallDuration(i19);
                                                            String formatString = LocaleController.formatString(R.string.CallMessageWithDuration, this.messageText, formatCallDuration);
                                                            this.messageText = formatString;
                                                            String charSequence = formatString.toString();
                                                            int indexOf4 = charSequence.indexOf(formatCallDuration);
                                                            if (indexOf4 != -1) {
                                                                SpannableString spannableString3 = new SpannableString(this.messageText);
                                                                int length = formatCallDuration.length() + indexOf4;
                                                                if (indexOf4 > 0 && charSequence.charAt(indexOf4 - 1) == '(') {
                                                                    indexOf4--;
                                                                }
                                                                if (length < charSequence.length() && charSequence.charAt(length) == ')') {
                                                                    length++;
                                                                }
                                                                spannableString3.setSpan(new TypefaceSpan(Typeface.DEFAULT), indexOf4, length, 0);
                                                                this.messageText = spannableString3;
                                                            }
                                                        }
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionPhoneCall) {
                                                        TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall = (TLRPC.TL_messageActionPhoneCall) messageAction6;
                                                        boolean z7 = tL_messageActionPhoneCall.reason instanceof TLRPC.TL_phoneCallDiscardReasonMissed;
                                                        if (isFromUser() && this.messageOwner.from_id.user_id == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                                                            if (z7) {
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
                                                        } else if (z7) {
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
                                                        int i20 = tL_messageActionPhoneCall.duration;
                                                        if (i20 > 0) {
                                                            String formatCallDuration2 = LocaleController.formatCallDuration(i20);
                                                            String formatString2 = LocaleController.formatString(R.string.CallMessageWithDuration, this.messageText, formatCallDuration2);
                                                            this.messageText = formatString2;
                                                            String charSequence2 = formatString2.toString();
                                                            int indexOf5 = charSequence2.indexOf(formatCallDuration2);
                                                            if (indexOf5 != -1) {
                                                                SpannableString spannableString4 = new SpannableString(this.messageText);
                                                                int length2 = formatCallDuration2.length() + indexOf5;
                                                                if (indexOf5 > 0 && charSequence2.charAt(indexOf5 - 1) == '(') {
                                                                    indexOf5--;
                                                                }
                                                                if (length2 < charSequence2.length() && charSequence2.charAt(length2) == ')') {
                                                                    length2++;
                                                                }
                                                                spannableString4.setSpan(new TypefaceSpan(Typeface.DEFAULT), indexOf5, length2, 0);
                                                                this.messageText = spannableString4;
                                                            }
                                                        }
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionPaymentSent) {
                                                        generatePaymentSentMessageText(getUser(abstractMap, longSparseArray, getDialogId()), false);
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionPaymentSentMe) {
                                                        generatePaymentSentMessageText(getUser(abstractMap, longSparseArray, getDialogId()), true);
                                                    } else {
                                                        boolean z8 = messageAction6 instanceof TLRPC.TL_messageActionBotAllowed;
                                                        if (z8) {
                                                            TLRPC.TL_messageActionBotAllowed tL_messageActionBotAllowed = (TLRPC.TL_messageActionBotAllowed) messageAction6;
                                                            String str13 = tL_messageActionBotAllowed.domain;
                                                            TLRPC.BotApp botApp = tL_messageActionBotAllowed.app;
                                                            if (tL_messageActionBotAllowed.from_request) {
                                                                this.messageText = LocaleController.getString(R.string.ActionBotAllowedWebapp);
                                                            } else if (botApp != null) {
                                                                String str14 = botApp.title;
                                                                if (str14 == null) {
                                                                    str14 = str2;
                                                                }
                                                                String string5 = LocaleController.getString(R.string.ActionBotAllowedApp);
                                                                int indexOf6 = string5.indexOf("%1$s");
                                                                SpannableString spannableString5 = new SpannableString(String.format(string5, str14));
                                                                TLRPC.User user17 = getUser(abstractMap, longSparseArray, getDialogId());
                                                                if (indexOf6 >= 0 && user17 != null && (publicUsername2 = UserObject.getPublicUsername(user17)) != null) {
                                                                    spannableString5.setSpan(new URLSpanNoUnderlineBold("https://" + MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + publicUsername2 + "/" + botApp.short_name), indexOf6, str14.length() + indexOf6, 33);
                                                                }
                                                                this.messageText = spannableString5;
                                                            } else {
                                                                if (str13 == null) {
                                                                    str13 = str2;
                                                                }
                                                                String string6 = LocaleController.getString(R.string.ActionBotAllowed);
                                                                int indexOf7 = string6.indexOf("%1$s");
                                                                SpannableString spannableString6 = new SpannableString(String.format(string6, str13));
                                                                if (indexOf7 >= 0 && !TextUtils.isEmpty(str13)) {
                                                                    spannableString6.setSpan(new URLSpanNoUnderlineBold("http://" + str13), indexOf7, str13.length() + indexOf7, 33);
                                                                }
                                                                this.messageText = spannableString6;
                                                            }
                                                        } else if ((messageAction6 instanceof TLRPC.TL_messageActionAttachMenuBotAllowed) || (z8 && ((TLRPC.TL_messageActionBotAllowed) messageAction6).attach_menu)) {
                                                            this.messageText = LocaleController.getString(R.string.ActionAttachMenuBotAllowed);
                                                        } else if (messageAction6 instanceof TLRPC.TL_messageActionSecureValuesSent) {
                                                            TLRPC.TL_messageActionSecureValuesSent tL_messageActionSecureValuesSent = (TLRPC.TL_messageActionSecureValuesSent) messageAction6;
                                                            StringBuilder sb3 = new StringBuilder();
                                                            int size = tL_messageActionSecureValuesSent.types.size();
                                                            for (int i21 = 0; i21 < size; i21++) {
                                                                TLRPC.SecureValueType secureValueType = tL_messageActionSecureValuesSent.types.get(i21);
                                                                if (sb3.length() > 0) {
                                                                    sb3.append(str8);
                                                                }
                                                                if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
                                                                    sb3.append(LocaleController.getString(R.string.ActionBotDocumentPhone));
                                                                } else if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
                                                                    sb3.append(LocaleController.getString(R.string.ActionBotDocumentEmail));
                                                                } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                                                                    sb3.append(LocaleController.getString(R.string.ActionBotDocumentAddress));
                                                                } else if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                                                                    sb3.append(LocaleController.getString(R.string.ActionBotDocumentIdentity));
                                                                } else if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
                                                                    sb3.append(LocaleController.getString(R.string.ActionBotDocumentPassport));
                                                                } else if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                                                    sb3.append(LocaleController.getString(R.string.ActionBotDocumentDriverLicence));
                                                                } else if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                                                    sb3.append(LocaleController.getString(R.string.ActionBotDocumentIdentityCard));
                                                                } else if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                                                                    sb3.append(LocaleController.getString(R.string.ActionBotDocumentUtilityBill));
                                                                } else if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
                                                                    sb3.append(LocaleController.getString(R.string.ActionBotDocumentBankStatement));
                                                                } else if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                                                                    sb3.append(LocaleController.getString(R.string.ActionBotDocumentRentalAgreement));
                                                                } else if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                                                    sb3.append(LocaleController.getString(R.string.ActionBotDocumentInternalPassport));
                                                                } else if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                                                                    sb3.append(LocaleController.getString(R.string.ActionBotDocumentPassportRegistration));
                                                                } else if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                                                                    sb3.append(LocaleController.getString(R.string.ActionBotDocumentTemporaryRegistration));
                                                                }
                                                            }
                                                            TLRPC.Peer peer19 = this.messageOwner.peer_id;
                                                            this.messageText = LocaleController.formatString(R.string.ActionBotDocuments, UserObject.getFirstName(peer19 != null ? getUser(abstractMap, longSparseArray, peer19.user_id) : null), sb3.toString());
                                                        } else if (messageAction6 instanceof TLRPC.TL_messageActionWebViewDataSent) {
                                                            this.messageText = LocaleController.formatString(R.string.ActionBotWebViewData, ((TLRPC.TL_messageActionWebViewDataSent) messageAction6).text);
                                                        } else if (messageAction6 instanceof TLRPC.TL_messageActionSetChatTheme) {
                                                            TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction6).theme;
                                                            CharSequence themeEmoticonOrGiftTitle = TlUtils.getThemeEmoticonOrGiftTitle(chatTheme);
                                                            if (themeEmoticonOrGiftTitle != null && (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift)) {
                                                                CharSequence spannableStringBuilder6 = new SpannableStringBuilder(themeEmoticonOrGiftTitle);
                                                                TlUtils.getGiftDocument(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
                                                                themeEmoticonOrGiftTitle = spannableStringBuilder6;
                                                            }
                                                            String firstName2 = UserObject.getFirstName(user);
                                                            boolean z9 = user == null && chat21 != null;
                                                            if (z9) {
                                                                firstName2 = chat21.title;
                                                            }
                                                            boolean isUserSelf = UserObject.isUserSelf(user);
                                                            if (TextUtils.isEmpty(themeEmoticonOrGiftTitle)) {
                                                                if (isUserSelf) {
                                                                    formatSpannable2 = LocaleController.formatSpannable(R.string.ChatThemeDisabledYou, new Object[0]);
                                                                } else {
                                                                    formatSpannable2 = LocaleController.formatSpannable(z9 ? R.string.ChannelThemeDisabled : R.string.ChatThemeDisabled, firstName2, themeEmoticonOrGiftTitle);
                                                                }
                                                                this.messageText = formatSpannable2;
                                                            } else {
                                                                if (isUserSelf) {
                                                                    formatSpannable = LocaleController.formatSpannable(R.string.ChatThemeChangedYou, themeEmoticonOrGiftTitle);
                                                                } else {
                                                                    formatSpannable = LocaleController.formatSpannable(z9 ? R.string.ChannelThemeChangedTo : R.string.ChatThemeChangedTo, firstName2, themeEmoticonOrGiftTitle);
                                                                }
                                                                this.messageText = formatSpannable;
                                                            }
                                                        } else if (messageAction6 instanceof TLRPC.TL_messageActionChatJoinedByRequest) {
                                                            if (UserObject.isUserSelf(user)) {
                                                                if (ChatObject.isChannelAndNotMegaGroup(this.messageOwner.peer_id.channel_id, this.currentAccount)) {
                                                                    string = LocaleController.getString(R.string.RequestToJoinChannelApproved);
                                                                } else {
                                                                    string = LocaleController.getString(R.string.RequestToJoinGroupApproved);
                                                                }
                                                                this.messageText = string;
                                                            } else {
                                                                this.messageText = replaceWithLink(LocaleController.getString(R.string.UserAcceptedToGroupAction), "un1", tLObject3);
                                                            }
                                                        } else if (messageAction6 instanceof TLRPC.TL_messageActionPaidMessagesPrice) {
                                                            TLRPC.TL_messageActionPaidMessagesPrice tL_messageActionPaidMessagesPrice = (TLRPC.TL_messageActionPaidMessagesPrice) messageAction6;
                                                            if (ChatObject.isChannel(chat21) && chat21 != null && chat21.broadcast) {
                                                                if ((tL_messageActionPaidMessagesPrice.flags & 1) != 0) {
                                                                    long j15 = tL_messageActionPaidMessagesPrice.stars;
                                                                    if (j15 > 0) {
                                                                        this.messageText = replaceWithLink(LocaleController.formatPluralStringComma("PostSuggestionsPriceUpdated", (int) j15), "un1", tLObject3);
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
                                                                TLRPC.Message message5 = this.messageOwner;
                                                                TLRPC.Peer peer20 = message5.saved_peer_id;
                                                                if (peer20 != null) {
                                                                    user2 = getUser(abstractMap, longSparseArray, DialogObject.getPeerDialogId(peer20));
                                                                } else {
                                                                    user2 = getUser(abstractMap, longSparseArray, DialogObject.getPeerDialogId(message5.peer_id));
                                                                }
                                                                this.messageText = replaceWithLink(LocaleController.formatPluralStringComma("PaidMessagesRefundedOut", (int) tL_messageActionPaidMessagesRefunded.stars), "un1", user2);
                                                            } else {
                                                                this.messageText = replaceWithLink(LocaleController.formatPluralStringComma("PaidMessagesRefunded", (int) tL_messageActionPaidMessagesRefunded.stars), "un1", tLObject3);
                                                            }
                                                        } else if (messageAction6 instanceof TLRPC.TL_messageActionTodoCompletions) {
                                                            TLRPC.TL_messageActionTodoCompletions tL_messageActionTodoCompletions = (TLRPC.TL_messageActionTodoCompletions) messageAction6;
                                                            boolean isEmpty = tL_messageActionTodoCompletions.completed.isEmpty();
                                                            int intValue = !tL_messageActionTodoCompletions.completed.isEmpty() ? tL_messageActionTodoCompletions.completed.get(0).intValue() : !tL_messageActionTodoCompletions.incompleted.isEmpty() ? tL_messageActionTodoCompletions.incompleted.get(0).intValue() : 0;
                                                            MessageObject messageObject = this.replyMessageObject;
                                                            if (messageObject != null && (getMedia(messageObject.messageOwner) instanceof TLRPC.TL_messageMediaToDo)) {
                                                                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) getMedia(this.replyMessageObject.messageOwner);
                                                                for (int i22 = 0; i22 < tL_messageMediaToDo.todo.list.size(); i22++) {
                                                                    TLRPC.TodoItem todoItem2 = tL_messageMediaToDo.todo.list.get(i22);
                                                                    if (todoItem2.id == intValue) {
                                                                        todoItem = todoItem2;
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            todoItem = null;
                                                            if (todoItem == null) {
                                                                if (isOutOwner()) {
                                                                    this.messageText = LocaleController.getString(!isEmpty ? R.string.TodoTaskCompletedOutUnknown : R.string.TodoTaskNotCompletedOutUnknown);
                                                                } else {
                                                                    this.messageText = replaceWithLink(LocaleController.getString(!isEmpty ? R.string.TodoTaskCompletedUnknown : R.string.TodoTaskNotCompletedUnknown), "un1", tLObject3);
                                                                }
                                                            } else {
                                                                Theme.createCommonChatResources();
                                                                CharSequence formatTaskTitle = formatTaskTitle(todoItem);
                                                                if (isOutOwner()) {
                                                                    this.messageText = LocaleController.formatSpannable(!isEmpty ? R.string.TodoTaskCompletedOut : R.string.TodoTaskNotCompletedOut, formatTaskTitle);
                                                                } else {
                                                                    this.messageText = replaceWithLink(LocaleController.formatSpannable(!isEmpty ? R.string.TodoTaskCompleted : R.string.TodoTaskNotCompleted, formatTaskTitle), "un1", tLObject3);
                                                                }
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
                                                            String monoForumTitle2 = ForumUtilities.getMonoForumTitle(this.currentAccount, DialogObject.getPeerDialogId(message4.peer_id), true);
                                                            if (monoForumTitle2 == null) {
                                                                TLRPC.Chat chat25 = getChat(abstractMap2, longSparseArray2, -DialogObject.getPeerDialogId(this.messageOwner.peer_id));
                                                                if (chat25 != null) {
                                                                    long j16 = chat25.linked_monoforum_id;
                                                                    if (j16 != 0 && (chat2 = getChat(abstractMap2, longSparseArray2, j16)) != null) {
                                                                        chat25 = chat2;
                                                                    }
                                                                }
                                                                monoForumTitle2 = DialogObject.getDialogTitle(chat25);
                                                            }
                                                            this.messageText = getActionSuggestionApprovalText(monoForumTitle2, DialogObject.getName(getUser(abstractMap, longSparseArray, DialogObject.getPeerDialogId(this.messageOwner.saved_peer_id))));
                                                        } else if (messageAction6 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                                            TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction6;
                                                            AmountUtils$Amount ofSafe2 = AmountUtils$Amount.ofSafe(tL_messageActionStarGiftPurchaseOffer.price);
                                                            String str15 = tL_messageActionStarGiftPurchaseOffer.gift.title + " #" + LocaleController.formatNumber(tL_messageActionStarGiftPurchaseOffer.gift.num, ',');
                                                            String shortName = DialogObject.getShortName(getUser(abstractMap, longSparseArray, DialogObject.getPeerDialogId(this.messageOwner.peer_id)));
                                                            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                                                            if (ofSafe2.currency == AmountUtils$Currency.STARS) {
                                                                i2 = isOut() ? R.string.GiftOfferOfferedTextStarsOut : R.string.GiftOfferOfferedTextStars2;
                                                            } else {
                                                                i2 = isOut() ? R.string.GiftOfferOfferedTextTONOut : R.string.GiftOfferOfferedTextTON2;
                                                            }
                                                            spannableStringBuilder7.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i2, shortName, ofSafe2.asFormatString(), str15)));
                                                            this.messageText = spannableStringBuilder7;
                                                        } else if (messageAction6 instanceof TLRPC.TL_messageActionStarGiftPurchaseOfferDeclined) {
                                                            TLRPC.TL_messageActionStarGiftPurchaseOfferDeclined tL_messageActionStarGiftPurchaseOfferDeclined = (TLRPC.TL_messageActionStarGiftPurchaseOfferDeclined) messageAction6;
                                                            AmountUtils$Amount ofSafe3 = AmountUtils$Amount.ofSafe(tL_messageActionStarGiftPurchaseOfferDeclined.price);
                                                            String str16 = tL_messageActionStarGiftPurchaseOfferDeclined.gift.title + " #" + LocaleController.formatNumber(tL_messageActionStarGiftPurchaseOfferDeclined.gift.num, ',');
                                                            String shortName2 = DialogObject.getShortName(getUser(abstractMap, longSparseArray, DialogObject.getPeerDialogId(this.messageOwner.peer_id)));
                                                            String asFormatString = ofSafe3.asFormatString();
                                                            if (tL_messageActionStarGiftPurchaseOfferDeclined.expired) {
                                                                if (ofSafe3.currency == AmountUtils$Currency.STARS) {
                                                                    i = isOut() ? R.string.GiftOfferOfferedTextStarsExpiredOut : R.string.GiftOfferOfferedTextStarsExpired;
                                                                } else {
                                                                    i = isOut() ? R.string.GiftOfferOfferedTextTONExpiredOut : R.string.GiftOfferOfferedTextTONExpired;
                                                                }
                                                            } else if (ofSafe3.currency == AmountUtils$Currency.STARS) {
                                                                i = isOut() ? R.string.GiftOfferOfferedTextStarsRejectedOut : R.string.GiftOfferOfferedTextStarsRejected;
                                                            } else {
                                                                i = isOut() ? R.string.GiftOfferOfferedTextTONRejectedOut : R.string.GiftOfferOfferedTextTONRejected;
                                                            }
                                                            this.messageText = AndroidUtilities.replaceTags(LocaleController.formatString(i, shortName2, asFormatString, str16));
                                                        } else if (messageAction6 instanceof TLRPC.TL_messageActionPollAppendAnswer) {
                                                            TLRPC.TL_messageActionPollAppendAnswer tL_messageActionPollAppendAnswer = (TLRPC.TL_messageActionPollAppendAnswer) messageAction6;
                                                            if (isOut()) {
                                                                this.messageText = LocaleController.formatSpannable(R.string.PollAddingActionYou, formatTextWithEntities(tL_messageActionPollAppendAnswer.answer.text, isOutOwner()));
                                                            } else {
                                                                this.messageText = LocaleController.formatSpannable(R.string.PollAddingActionOther, DialogObject.getShortName(getUser(abstractMap, longSparseArray, DialogObject.getPeerDialogId(this.messageOwner.from_id))), formatTextWithEntities(tL_messageActionPollAppendAnswer.answer.text, isOutOwner()));
                                                            }
                                                        } else if (messageAction6 instanceof TLRPC.TL_messageActionPollDeleteAnswer) {
                                                            TLRPC.TL_messageActionPollDeleteAnswer tL_messageActionPollDeleteAnswer = (TLRPC.TL_messageActionPollDeleteAnswer) messageAction6;
                                                            if (isOut()) {
                                                                this.messageText = LocaleController.formatSpannable(R.string.PollRemovedActionYou, formatTextWithEntities(tL_messageActionPollDeleteAnswer.answer.text, isOutOwner()));
                                                            } else {
                                                                this.messageText = LocaleController.formatSpannable(R.string.PollRemovedActionOther, DialogObject.getShortName(getUser(abstractMap, longSparseArray, DialogObject.getPeerDialogId(this.messageOwner.from_id))), formatTextWithEntities(tL_messageActionPollDeleteAnswer.answer.text, isOutOwner()));
                                                            }
                                                        } else if (messageAction6 instanceof TLRPC.TL_messageActionNoForwardsToggle) {
                                                            TLRPC.TL_messageActionNoForwardsToggle tL_messageActionNoForwardsToggle = (TLRPC.TL_messageActionNoForwardsToggle) messageAction6;
                                                            boolean z10 = tL_messageActionNoForwardsToggle.new_value;
                                                            if (z10 == tL_messageActionNoForwardsToggle.prev_value) {
                                                                this.messageText = LocaleController.getString(z10 ? R.string.DisableSharingActionStillDisabled : R.string.DisableSharingActionStillEnabled);
                                                            } else if (isOut()) {
                                                                this.messageText = LocaleController.getString(tL_messageActionNoForwardsToggle.new_value ? R.string.DisableSharingActionYou : R.string.EnableSharingActionYou);
                                                            } else {
                                                                this.messageText = LocaleController.formatString(tL_messageActionNoForwardsToggle.new_value ? R.string.DisableSharingActionOther : R.string.EnableSharingActionOther, DialogObject.getShortName(getUser(abstractMap, longSparseArray, DialogObject.getPeerDialogId(this.messageOwner.peer_id))));
                                                            }
                                                        } else if (messageAction6 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                                            String shortName3 = DialogObject.getShortName(getUser(abstractMap, longSparseArray, DialogObject.getPeerDialogId(message4.peer_id)));
                                                            if (((TLRPC.TL_messageActionNoForwardsRequest) messageAction6).new_value) {
                                                                this.messageText = isOut() ? LocaleController.getString(R.string.SharingOfferDisableHeaderShortYou) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferDisableHeaderShortOther, shortName3));
                                                            } else {
                                                                this.messageText = isOut() ? LocaleController.getString(R.string.SharingOfferEnableHeaderShortYou) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferEnableHeaderShortOther, shortName3));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            str2 = str3;
                                        } else {
                                            this.messageText = LocaleController.getString(R.string.BoostingReceivedGiftNoName);
                                        }
                                    }
                                }
                            }
                            str2 = str3;
                        }
                        str2 = "";
                    } else {
                        str2 = "";
                    }
                } else {
                    TLRPC.Chat chat26 = chat;
                    str2 = "";
                    this.isRestrictedMessage = false;
                    String restrictionReason = MessagesController.getInstance(this.currentAccount).getRestrictionReason(this.messageOwner.restriction_reason);
                    if (!TextUtils.isEmpty(restrictionReason)) {
                        this.messageText = restrictionReason;
                        this.isRestrictedMessage = true;
                    } else if (!isMediaEmpty() && !isSponsored()) {
                        if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGiveaway) {
                            TLRPC.MessageFwdHeader messageFwdHeader = this.messageOwner.fwd_from;
                            if (messageFwdHeader != null) {
                                TLRPC.Peer peer21 = messageFwdHeader.from_id;
                                if (peer21 instanceof TLRPC.TL_peerChannel) {
                                    isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(getChat(abstractMap2, longSparseArray2, peer21.channel_id));
                                    this.messageText = LocaleController.getString(!isChannelAndNotMegaGroup ? R.string.BoostingGiveawayChannelStarted : R.string.BoostingGiveawayGroupStarted);
                                }
                            }
                            isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat26);
                            this.messageText = LocaleController.getString(!isChannelAndNotMegaGroup ? R.string.BoostingGiveawayChannelStarted : R.string.BoostingGiveawayGroupStarted);
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGiveawayResults) {
                            this.messageText = LocaleController.getString(R.string.BoostingGiveawayResults);
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaStory) {
                            if (getMedia(this.messageOwner).via_mention) {
                                TLRPC.User user18 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(getMedia(this.messageOwner).user_id));
                                String str17 = (user18 == null || (publicUsername = UserObject.getPublicUsername(user18)) == null) ? null : MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + publicUsername + "/s/" + getMedia(this.messageOwner).id;
                                if (str17 != null) {
                                    SpannableString spannableString7 = new SpannableString(str17);
                                    this.messageText = spannableString7;
                                    spannableString7.setSpan(new URLSpanReplacement("https://" + str17, new TextStyleSpan.TextStyleRun()), 0, this.messageText.length(), 33);
                                } else {
                                    this.messageText = str2;
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
                            TLRPC.TL_messageMediaToDo tL_messageMediaToDo2 = (TLRPC.TL_messageMediaToDo) getMedia(this.messageOwner);
                            TLRPC.TodoList todoList = tL_messageMediaToDo2.todo;
                            if (todoList == null || (tL_textWithEntities = todoList.title) == null || tL_textWithEntities.text.isEmpty()) {
                                this.messageText = LocaleController.getString(R.string.MessageTodo);
                            } else {
                                this.messageText = LocaleController.formatSpannable(R.string.MessageTodoName, formatTextWithEntities(tL_messageMediaToDo2.todo.title, isOutOwner()));
                            }
                        } else if (isVoiceOnce()) {
                            this.messageText = LocaleController.getString(R.string.AttachOnceAudio);
                        } else if (isRoundOnce()) {
                            this.messageText = LocaleController.getString(R.string.AttachOnceRound);
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPaidMedia) {
                            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) getMedia(this.messageOwner);
                            int size2 = tL_messageMediaPaidMedia.extended_media.size();
                            boolean z11 = false;
                            for (int i23 = 0; i23 < size2; i23++) {
                                TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i23);
                                if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                    TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                                    z11 = (messageMedia instanceof TLRPC.TL_messageMediaDocument) && isVideoDocument(messageMedia.document);
                                } else if (!(messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview)) {
                                }
                                if (z11) {
                                    break;
                                }
                            }
                            if (size2 == 1) {
                                formatPluralString = LocaleController.getString(z11 ? R.string.AttachVideo : R.string.AttachPhoto);
                                c = 0;
                            } else {
                                c = 0;
                                formatPluralString = LocaleController.formatPluralString(z11 ? "Media" : "Photos", size2, new Object[0]);
                            }
                            this.messageText = formatPluralString;
                            int i24 = R.string.AttachPaidMedia;
                            Object[] objArr = new Object[1];
                            objArr[c] = formatPluralString;
                            this.messageText = StarsIntroActivity.replaceStars(LocaleController.formatString(i24, objArr));
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
                                TLRPC.Message message6 = this.messageOwner;
                                if (!(message6 instanceof TLRPC.TL_message_secret)) {
                                    if (getMedia(message6).voice) {
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
                                    this.messageText = String.format("%s %s", stickerChar, LocaleController.getString(R.string.AttachSticker));
                                }
                            } else if (isMusic()) {
                                this.messageText = LocaleController.getString(R.string.AttachMusic);
                            } else if (isGif()) {
                                this.messageText = LocaleController.getString(R.string.AttachGif);
                            } else {
                                String documentFileName = FileLoader.getDocumentFileName(getDocument());
                                if (!TextUtils.isEmpty(documentFileName)) {
                                    this.messageText = documentFileName;
                                } else {
                                    this.messageText = LocaleController.getString(R.string.AttachDocument);
                                }
                            }
                        }
                    } else {
                        String str18 = this.messageOwner.message;
                        if (str18 != null) {
                            try {
                                if (str18.length() > 200) {
                                    this.messageText = AndroidUtilities.BAD_CHARS_MESSAGE_LONG_PATTERN.matcher(this.messageOwner.message).replaceAll("\u200c");
                                } else {
                                    this.messageText = AndroidUtilities.BAD_CHARS_MESSAGE_PATTERN.matcher(this.messageOwner.message).replaceAll("\u200c");
                                }
                            } catch (Throwable unused) {
                                this.messageText = this.messageOwner.message;
                            }
                        } else {
                            this.messageText = str18;
                        }
                    }
                }
                if (this.messageText == null) {
                    this.messageText = str2;
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
        if (!(message instanceof TLRPC.TL_messageService)) {
        }
        if (this.messageText == null) {
        }
        this.isEmbedVideoCached = null;
        this.cachedStartsTimestamp = null;
        this.cachedSavedTimestamp = null;
    }

    private CharSequence formatTaskTitle(TLRPC.TodoItem todoItem) {
        CharSequence formatTextWithEntities = formatTextWithEntities(todoItem.title, isOutOwner());
        if (!(formatTextWithEntities instanceof Spannable)) {
            formatTextWithEntities = new SpannableStringBuilder(formatTextWithEntities);
        }
        ((Spannable) formatTextWithEntities).setSpan(new URLSpanNoUnderline("task?" + todoItem.id, true), 0, formatTextWithEntities.length(), 33);
        return formatTextWithEntities;
    }

    public static CharSequence formatTextWithEntities(TLRPC.TL_textWithEntities tL_textWithEntities) {
        return formatTextWithEntities(tL_textWithEntities, false);
    }

    public static CharSequence formatTextWithEntities(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z) {
        Theme.createCommonChatResources();
        TextPaint textPaint = Theme.chat_actionTextPaint;
        if (textPaint == null) {
            textPaint = new TextPaint(1);
            textPaint.setTypeface(AndroidUtilities.bold());
            textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        }
        return formatTextWithEntities(tL_textWithEntities, z, textPaint);
    }

    public static CharSequence formatTextWithEntities(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, TextPaint textPaint) {
        return formatTextWithEntities(tL_textWithEntities, z, false, textPaint);
    }

    public static CharSequence formatTextWithEntities(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, boolean z2, TextPaint textPaint) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
        addEntitiesToText(spannableStringBuilder, tL_textWithEntities.entities, z, false, z2, false);
        return replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint.getFontMetricsInt());
    }

    public static TLRPC.TL_textWithEntities removeLinks(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
        tL_textWithEntities2.text = tL_textWithEntities.text;
        for (int i = 0; i < tL_textWithEntities.entities.size(); i++) {
            TLRPC.MessageEntity messageEntity = tL_textWithEntities.entities.get(i);
            if (!(messageEntity instanceof TLRPC.TL_messageEntityUrl) && !(messageEntity instanceof TLRPC.TL_messageEntityTextUrl)) {
                tL_textWithEntities2.entities.add(messageEntity);
            }
        }
        return tL_textWithEntities2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a7, code lost:
    
        if (r2 != null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01ab, code lost:
    
        if (r8.ttl_seconds == 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0118, code lost:
    
        if (isVideoDocument(r4.document) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0127, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0125, code lost:
    
        if ((((org.telegram.tgnet.TLRPC.TL_messageExtendedMediaPreview) r5).flags & 4) != 0) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CharSequence getMediaTitle(TLRPC.MessageMedia messageMedia) {
        String formatPluralString;
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
            if (messageMedia.via_mention) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageMedia.user_id));
                if (user != null && (publicUsername = UserObject.getPublicUsername(user)) != null) {
                    str = MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + publicUsername + "/s/" + messageMedia.id;
                }
                if (str != null) {
                    SpannableString spannableString = new SpannableString(str);
                    spannableString.setSpan(new URLSpanReplacement("https://" + str, new TextStyleSpan.TextStyleRun()), 0, spannableString.length(), 33);
                    return spannableString;
                }
                return "";
            }
            return LocaleController.getString(R.string.ForwardedStory);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaDice) {
            return getDiceEmoji((TLRPC.TL_messageMediaDice) messageMedia);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
            if (((TLRPC.TL_messageMediaPoll) messageMedia).poll.quiz) {
                return LocaleController.getString(R.string.QuizPoll);
            }
            return LocaleController.getString(R.string.Poll);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            return (todoList == null || (tL_textWithEntities = todoList.title) == null || tL_textWithEntities.text.isEmpty()) ? LocaleController.getString(R.string.MessageTodo) : LocaleController.formatSpannable(R.string.MessageTodoName, formatTextWithEntities(tL_messageMediaToDo.todo.title, isOutOwner()));
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            int size = tL_messageMediaPaidMedia.extended_media.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i);
                if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                    TLRPC.MessageMedia messageMedia2 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                    }
                    z = false;
                } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                }
                if (z) {
                    break;
                }
            }
            if (size == 1) {
                formatPluralString = LocaleController.getString(z ? R.string.AttachVideo : R.string.AttachPhoto);
            } else {
                formatPluralString = LocaleController.formatPluralString(z ? "Media" : "Photos", size, new Object[0]);
            }
            return StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.AttachPaidMedia, formatPluralString));
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            if (messageMedia.ttl_seconds != 0 && !(this.messageOwner instanceof TLRPC.TL_message_secret)) {
                return LocaleController.getString(R.string.AttachDestructingPhoto);
            }
            if (getGroupId() != 0) {
                return LocaleController.getString(R.string.Album);
            }
            if (isLivePhoto()) {
                return LocaleController.getString(R.string.AttachLivePhoto);
            }
            return LocaleController.getString(R.string.AttachPhoto);
        }
        if (messageMedia != null) {
            if (!isVideoDocument(messageMedia.document)) {
                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.Document document = messageMedia.document;
                    if (!(document instanceof TLRPC.TL_documentEmpty)) {
                    }
                }
            }
            if (messageMedia.ttl_seconds != 0 && !(this.messageOwner instanceof TLRPC.TL_message_secret)) {
                if (messageMedia.voice) {
                    return LocaleController.getString(R.string.AttachVoiceExpired);
                }
                if (messageMedia.round) {
                    return LocaleController.getString(R.string.AttachRoundExpired);
                }
                return LocaleController.getString(R.string.AttachDestructingVideo);
            }
            return LocaleController.getString(R.string.AttachVideo);
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
            return (stickerChar == null || stickerChar.length() <= 0) ? LocaleController.getString(R.string.AttachSticker) : String.format("%s %s", stickerChar, LocaleController.getString(R.string.AttachSticker));
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

    public static TLRPC.MessageMedia getMedia(MessageObject messageObject) {
        TLRPC.Message message;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return null;
        }
        TLRPC.MessageMedia messageMedia = messageObject.sponsoredMedia;
        return messageMedia != null ? messageMedia : getMedia(message);
    }

    public static TLRPC.MessageMedia getMedia(TLRPC.Message message) {
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) && !messageMedia.extended_media.isEmpty() && (message.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMedia)) {
            return ((TLRPC.TL_messageExtendedMedia) message.media.extended_media.get(0)).media;
        }
        return message.media;
    }

    public static <T extends TLRPC.MessageMedia> T getMedia(TLRPC.Message message, Class<T> cls) {
        TLRPC.MessageMedia media = getMedia(message);
        if (cls.isInstance(media)) {
            return cls.cast(media);
        }
        return null;
    }

    public boolean hasRevealedExtendedMedia() {
        TLRPC.MessageMedia messageMedia = this.messageOwner.media;
        return (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) || messageMedia.extended_media.isEmpty() || !(this.messageOwner.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMedia)) ? false : true;
    }

    public boolean hasExtendedMedia() {
        TLRPC.MessageMedia messageMedia = this.messageOwner.media;
        return (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) || messageMedia.extended_media.isEmpty()) ? false : true;
    }

    public boolean hasPaidMediaPreview() {
        TLRPC.MessageMedia messageMedia = this.messageOwner.media;
        return messageMedia != null && (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) && !messageMedia.extended_media.isEmpty() && (this.messageOwner.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview);
    }

    public boolean hasExtendedMediaPreview() {
        TLRPC.MessageMedia messageMedia = this.messageOwner.media;
        return (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) || messageMedia.extended_media.isEmpty() || !(this.messageOwner.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview)) ? false : true;
    }

    private boolean hasNonEmojiEntities() {
        TLRPC.Message message = this.messageOwner;
        if (message != null && message.entities != null) {
            for (int i = 0; i < this.messageOwner.entities.size(); i++) {
                if (!(this.messageOwner.entities.get(i) instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setType() {
        int i;
        int i2 = this.type;
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
                if ((message instanceof TLRPC.TL_message) || (message instanceof TLRPC.TL_messageForwarded_old2)) {
                    if (this.isRestrictedMessage) {
                        this.type = 0;
                    } else if (this.emojiAnimatedSticker != null || this.emojiAnimatedStickerId != null) {
                        if (isSticker()) {
                            this.type = 13;
                        } else {
                            this.type = 15;
                        }
                    } else if (message.media instanceof TLRPC.TL_messageMediaPaidMedia) {
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
                        TLRPC.Document document = getDocument();
                        if (document != null && document.mime_type != null) {
                            if (isGifDocument(document, hasValidGroupId())) {
                                this.type = 8;
                            } else if (isSticker()) {
                                this.type = 13;
                            } else if (isAnimatedSticker()) {
                                this.type = 15;
                            } else {
                                this.type = 9;
                            }
                        } else {
                            this.type = 9;
                        }
                    } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame) {
                        this.type = 0;
                    } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaInvoice) {
                        this.type = 0;
                    } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaStory) {
                        int i3 = getMedia(this.messageOwner).via_mention ? 24 : 23;
                        this.type = i3;
                        if (i3 == 24) {
                            this.contentType = 1;
                        }
                    }
                } else {
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
                                TLRPC.Document document2 = tL_channelAdminLogEventActionChangeWallpaper.new_value.document;
                                if (document2 != null) {
                                    arrayList.addAll(document2.thumbs);
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
                            TLRPC.Document document3 = tL_messageActionSetChatWallPaper.wallpaper.document;
                            if (document3 != null) {
                                arrayList2.addAll(document3.thumbs);
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
                        } else {
                            boolean z = messageAction instanceof TLRPC.TL_messageActionGiftCode;
                            if (z && ((TLRPC.TL_messageActionGiftCode) messageAction).boost_peer != null) {
                                this.contentType = 1;
                                this.type = 25;
                            } else if ((messageAction instanceof TLRPC.TL_messageActionGiftPremium) || z) {
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
                    }
                }
            }
        }
        if (i2 == 1000 || i2 == (i = this.type) || i == 19) {
            return;
        }
        updateMessageText(MessagesController.getInstance(this.currentAccount).getUsers(), MessagesController.getInstance(this.currentAccount).getChats(), null, null);
        generateThumbs(false);
    }

    public boolean checkLayout() {
        CharSequence charSequence;
        TextPaint textPaint;
        int i = this.type;
        if ((i == 0 || i == 19) && this.messageOwner.peer_id != null && (charSequence = this.messageText) != null && (charSequence.length() != 0 || this.isBotPendingDraft)) {
            if (this.layoutCreated) {
                if (Math.abs(this.generatedWithMinSize - (AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() : AndroidUtilities.displaySize.x)) > AndroidUtilities.dp(52.0f) || this.generatedWithDensity != AndroidUtilities.density) {
                    this.layoutCreated = false;
                }
            }
            if (!this.layoutCreated) {
                this.layoutCreated = true;
                if (isFromUser()) {
                    MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.from_id.user_id));
                }
                if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame) {
                    textPaint = Theme.chat_msgGameTextPaint;
                } else {
                    textPaint = Theme.chat_msgTextPaint;
                }
                int[] iArr = allowsBigEmoji() ? new int[1] : null;
                CharSequence replaceEmoji = Emoji.replaceEmoji(this.messageText, textPaint.getFontMetricsInt(), false, iArr);
                this.messageText = replaceEmoji;
                Spannable replaceAnimatedEmoji = replaceAnimatedEmoji(replaceEmoji, textPaint.getFontMetricsInt());
                this.messageText = replaceAnimatedEmoji;
                if (iArr != null && iArr[0] > 1) {
                    replaceEmojiToLottieFrame(replaceAnimatedEmoji, iArr);
                }
                checkEmojiOnly(iArr);
                checkBigAnimatedEmoji();
                setType();
                return true;
            }
        }
        return false;
    }

    public void resetLayout() {
        this.layoutCreated = false;
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
        if (webDocument != null) {
            return webDocument.mime_type;
        }
        return "";
    }

    public boolean canPreviewDocument() {
        return canPreviewDocument(getDocument());
    }

    public static boolean isAnimatedStickerDocument(TLRPC.Document document) {
        return document != null && document.mime_type.equals("video/webm");
    }

    public static boolean isStaticStickerDocument(TLRPC.Document document) {
        return document != null && document.mime_type.equals("image/webp");
    }

    public static boolean isGifDocument(WebFile webFile) {
        return webFile != null && (webFile.mime_type.equals("image/gif") || isNewGifDocument(webFile));
    }

    public static boolean isGifDocument(TLRPC.Document document) {
        return isGifDocument(document, false);
    }

    public static boolean isGifDocument(TLRPC.Document document, boolean z) {
        String str;
        return (document == null || (str = document.mime_type) == null || ((!str.equals("image/gif") || z) && !isNewGifDocument(document))) ? false : true;
    }

    public static boolean isDocumentHasThumb(TLRPC.Document document) {
        if (document != null && !document.thumbs.isEmpty()) {
            int size = document.thumbs.size();
            for (int i = 0; i < size; i++) {
                TLRPC.PhotoSize photoSize = document.thumbs.get(i);
                if (photoSize != null && !(photoSize instanceof TLRPC.TL_photoSizeEmpty) && (!(photoSize.location instanceof TLRPC.TL_fileLocationUnavailable) || photoSize.bytes != null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean canPreviewDocument(TLRPC.Document document) {
        String str;
        if (document != null && (str = document.mime_type) != null) {
            if ((isDocumentHasThumb(document) && (str.equalsIgnoreCase("image/png") || str.equalsIgnoreCase("image/jpg") || str.equalsIgnoreCase("image/jpeg"))) || (Build.VERSION.SDK_INT >= 26 && str.equalsIgnoreCase("image/heic"))) {
                for (int i = 0; i < document.attributes.size(); i++) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
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

    public static boolean isRoundVideoDocument(TLRPC.Document document) {
        if (document != null && "video/mp4".equals(document.mime_type)) {
            boolean z = false;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < document.attributes.size(); i3++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    i = documentAttribute.w;
                    i2 = documentAttribute.h;
                    z = documentAttribute.round_message;
                }
            }
            if (z && i <= 1280 && i2 <= 1280) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNewGifDocument(WebFile webFile) {
        if (webFile != null && "video/mp4".equals(webFile.mime_type)) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < webFile.attributes.size(); i3++) {
                TLRPC.DocumentAttribute documentAttribute = webFile.attributes.get(i3);
                if (!(documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) && (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    i = documentAttribute.w;
                    i2 = documentAttribute.h;
                }
            }
            if (i <= 1280 && i2 <= 1280) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNewGifDocument(TLRPC.Document document) {
        if (document != null && "video/mp4".equals(document.mime_type)) {
            boolean z = false;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < document.attributes.size(); i3++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) {
                    z = true;
                } else if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    i = documentAttribute.w;
                    i2 = documentAttribute.h;
                }
            }
            if (z && i <= 1280 && i2 <= 1280) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSystemSignUp(MessageObject messageObject) {
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if ((message instanceof TLRPC.TL_messageService) && (((TLRPC.TL_messageService) message).action instanceof TLRPC.TL_messageActionContactSignUp)) {
                return true;
            }
        }
        return false;
    }

    public void generateThumbs(boolean z) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        ArrayList<TLRPC.PhotoSize> arrayList3;
        ArrayList<TLRPC.PhotoSize> arrayList4;
        ArrayList<TLRPC.PhotoSize> arrayList5;
        ArrayList<TLRPC.PhotoSize> arrayList6;
        ArrayList<TLRPC.PhotoSize> arrayList7;
        ArrayList<TLRPC.PhotoSize> arrayList8;
        ArrayList<TLRPC.PhotoSize> arrayList9;
        ArrayList<TLRPC.PhotoSize> arrayList10;
        if (hasExtendedMediaPreview()) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) this.messageOwner.media.extended_media.get(0);
            if (!z) {
                this.photoThumbs = new ArrayList<>(Collections.singletonList(tL_messageExtendedMediaPreview.thumb));
            } else {
                updatePhotoSizeLocations(this.photoThumbs, Collections.singletonList(tL_messageExtendedMediaPreview.thumb));
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
                if (!z) {
                    this.photoThumbs = new ArrayList<>(photo.sizes);
                } else {
                    ArrayList<TLRPC.PhotoSize> arrayList11 = this.photoThumbs;
                    if (arrayList11 != null && !arrayList11.isEmpty()) {
                        for (int i = 0; i < this.photoThumbs.size(); i++) {
                            TLRPC.PhotoSize photoSize = this.photoThumbs.get(i);
                            int i2 = 0;
                            while (true) {
                                if (i2 < photo.sizes.size()) {
                                    TLRPC.PhotoSize photoSize2 = photo.sizes.get(i2);
                                    if (!(photoSize2 instanceof TLRPC.TL_photoSizeEmpty) && photoSize2.type.equals(photoSize.type)) {
                                        photoSize.location = photoSize2.location;
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        }
                    }
                }
                if (photo.dc_id != 0 && (arrayList10 = this.photoThumbs) != null) {
                    int size = arrayList10.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        TLRPC.FileLocation fileLocation = this.photoThumbs.get(i3).location;
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
                if (!z || (arrayList = this.photoThumbs) == null) {
                    ArrayList<TLRPC.PhotoSize> arrayList12 = new ArrayList<>();
                    this.photoThumbs = arrayList12;
                    arrayList12.addAll(this.emojiAnimatedSticker.thumbs);
                } else if (!arrayList.isEmpty()) {
                    updatePhotoSizeLocations(this.photoThumbs, this.emojiAnimatedSticker.thumbs);
                }
                this.photoThumbsObject = this.emojiAnimatedSticker;
                return;
            }
            return;
        }
        if (getMedia(message) != null && !(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaEmpty)) {
            if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) {
                TLRPC.Photo photo2 = getMedia(this.messageOwner).photo;
                if (!z || ((arrayList9 = this.photoThumbs) != null && arrayList9.size() != photo2.sizes.size())) {
                    this.photoThumbs = new ArrayList<>(photo2.sizes);
                } else {
                    ArrayList<TLRPC.PhotoSize> arrayList13 = this.photoThumbs;
                    if (arrayList13 != null && !arrayList13.isEmpty()) {
                        for (int i4 = 0; i4 < this.photoThumbs.size(); i4++) {
                            TLRPC.PhotoSize photoSize3 = this.photoThumbs.get(i4);
                            if (photoSize3 != null) {
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= photo2.sizes.size()) {
                                        break;
                                    }
                                    TLRPC.PhotoSize photoSize4 = photo2.sizes.get(i5);
                                    if (photoSize4 != null && !(photoSize4 instanceof TLRPC.TL_photoSizeEmpty)) {
                                        if (photoSize4.type.equals(photoSize3.type)) {
                                            photoSize3.location = photoSize4.location;
                                            break;
                                        } else if ("s".equals(photoSize3.type) && (photoSize4 instanceof TLRPC.TL_photoStrippedSize)) {
                                            this.photoThumbs.set(i4, photoSize4);
                                            break;
                                        }
                                    }
                                    i5++;
                                }
                            }
                        }
                    }
                }
                this.photoThumbsObject = getMedia(this.messageOwner).photo;
                return;
            }
            if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument) {
                TLRPC.Photo photo3 = ((TLRPC.TL_messageMediaDocument) getMedia(this.messageOwner)).video_cover;
                if (photo3 != null) {
                    if (!z || ((arrayList8 = this.photoThumbs) != null && arrayList8.size() != photo3.sizes.size())) {
                        this.photoThumbs = new ArrayList<>(photo3.sizes);
                    } else {
                        ArrayList<TLRPC.PhotoSize> arrayList14 = this.photoThumbs;
                        if (arrayList14 != null && !arrayList14.isEmpty()) {
                            for (int i6 = 0; i6 < this.photoThumbs.size(); i6++) {
                                TLRPC.PhotoSize photoSize5 = this.photoThumbs.get(i6);
                                if (photoSize5 != null) {
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 >= photo3.sizes.size()) {
                                            break;
                                        }
                                        TLRPC.PhotoSize photoSize6 = photo3.sizes.get(i7);
                                        if (photoSize6 != null && !(photoSize6 instanceof TLRPC.TL_photoSizeEmpty)) {
                                            if (photoSize6.type.equals(photoSize5.type)) {
                                                photoSize5.location = photoSize6.location;
                                                break;
                                            } else if ("s".equals(photoSize5.type) && (photoSize6 instanceof TLRPC.TL_photoStrippedSize)) {
                                                this.photoThumbs.set(i6, photoSize6);
                                                break;
                                            }
                                        }
                                        i7++;
                                    }
                                }
                            }
                        }
                    }
                    this.photoThumbsObject = photo3;
                    return;
                }
                TLRPC.Document document = getDocument();
                if (isDocumentHasThumb(document)) {
                    if (!z || (arrayList7 = this.photoThumbs) == null) {
                        ArrayList<TLRPC.PhotoSize> arrayList15 = new ArrayList<>();
                        this.photoThumbs = arrayList15;
                        arrayList15.addAll(document.thumbs);
                    } else if (!arrayList7.isEmpty()) {
                        updatePhotoSizeLocations(this.photoThumbs, document.thumbs);
                    }
                    this.photoThumbsObject = document;
                    return;
                }
                return;
            }
            if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame) {
                TLRPC.Document document2 = getMedia(this.messageOwner).game.document;
                if (document2 != null && isDocumentHasThumb(document2)) {
                    if (!z) {
                        ArrayList<TLRPC.PhotoSize> arrayList16 = new ArrayList<>();
                        this.photoThumbs = arrayList16;
                        arrayList16.addAll(document2.thumbs);
                    } else {
                        ArrayList<TLRPC.PhotoSize> arrayList17 = this.photoThumbs;
                        if (arrayList17 != null && !arrayList17.isEmpty()) {
                            updatePhotoSizeLocations(this.photoThumbs, document2.thumbs);
                        }
                    }
                    this.photoThumbsObject = document2;
                }
                TLRPC.Photo photo4 = getMedia(this.messageOwner).game.photo;
                if (photo4 != null) {
                    if (!z || (arrayList6 = this.photoThumbs2) == null) {
                        this.photoThumbs2 = new ArrayList<>(photo4.sizes);
                    } else if (!arrayList6.isEmpty()) {
                        updatePhotoSizeLocations(this.photoThumbs2, photo4.sizes);
                    }
                    this.photoThumbsObject2 = photo4;
                }
                if (this.photoThumbs != null || (arrayList5 = this.photoThumbs2) == null) {
                    return;
                }
                this.photoThumbs = arrayList5;
                this.photoThumbs2 = null;
                this.photoThumbsObject = this.photoThumbsObject2;
                this.photoThumbsObject2 = null;
                return;
            }
            if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) {
                TLRPC.Photo photo5 = getMedia(this.messageOwner).webpage.photo;
                TLRPC.Document document3 = getMedia(this.messageOwner).webpage.document;
                if (photo5 != null) {
                    if (!z || (arrayList4 = this.photoThumbs) == null) {
                        this.photoThumbs = new ArrayList<>(photo5.sizes);
                    } else if (!arrayList4.isEmpty()) {
                        updatePhotoSizeLocations(this.photoThumbs, photo5.sizes);
                    }
                    this.photoThumbsObject = photo5;
                    return;
                }
                if (document3 == null || !isDocumentHasThumb(document3)) {
                    return;
                }
                if (!z) {
                    ArrayList<TLRPC.PhotoSize> arrayList18 = new ArrayList<>();
                    this.photoThumbs = arrayList18;
                    arrayList18.addAll(document3.thumbs);
                } else {
                    ArrayList<TLRPC.PhotoSize> arrayList19 = this.photoThumbs;
                    if (arrayList19 != null && !arrayList19.isEmpty()) {
                        updatePhotoSizeLocations(this.photoThumbs, document3.thumbs);
                    }
                }
                this.photoThumbsObject = document3;
                return;
            }
            return;
        }
        TLRPC.MessageMedia messageMedia = this.sponsoredMedia;
        if (messageMedia != null) {
            TLRPC.Photo photo6 = messageMedia.photo;
            TLRPC.Document document4 = messageMedia.document;
            if (photo6 != null) {
                if (!z || (arrayList3 = this.photoThumbs) == null) {
                    this.photoThumbs = new ArrayList<>(photo6.sizes);
                } else if (!arrayList3.isEmpty()) {
                    updatePhotoSizeLocations(this.photoThumbs, photo6.sizes);
                }
                this.photoThumbsObject = photo6;
                return;
            }
            if (document4 == null || !isDocumentHasThumb(document4)) {
                return;
            }
            if (!z) {
                ArrayList<TLRPC.PhotoSize> arrayList20 = new ArrayList<>();
                this.photoThumbs = arrayList20;
                arrayList20.addAll(document4.thumbs);
            } else {
                ArrayList<TLRPC.PhotoSize> arrayList21 = this.photoThumbs;
                if (arrayList21 != null && !arrayList21.isEmpty()) {
                    updatePhotoSizeLocations(this.photoThumbs, document4.thumbs);
                }
            }
            this.photoThumbsObject = document4;
            return;
        }
        if (this.sponsoredPhoto != null) {
            if (!z || (arrayList2 = this.photoThumbs) == null) {
                this.photoThumbs = new ArrayList<>(this.sponsoredPhoto.sizes);
            } else if (!arrayList2.isEmpty()) {
                updatePhotoSizeLocations(this.photoThumbs, this.sponsoredPhoto.sizes);
            }
            this.photoThumbsObject = this.sponsoredPhoto;
            if (this.strippedThumb == null) {
                createStrippedThumb();
            }
        }
    }

    private static void updatePhotoSizeLocations(ArrayList<TLRPC.PhotoSize> arrayList, List<TLRPC.PhotoSize> list) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC.PhotoSize photoSize = arrayList.get(i);
            if (photoSize != null) {
                int size2 = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        TLRPC.PhotoSize photoSize2 = list.get(i2);
                        if (!(photoSize2 instanceof TLRPC.TL_photoSizeEmpty) && !(photoSize2 instanceof TLRPC.TL_photoCachedSize) && photoSize2 != null && photoSize2.type.equals(photoSize.type)) {
                            photoSize.location = photoSize2.location;
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
    }

    public CharSequence replaceWithLink(CharSequence charSequence, String str, ArrayList<Long> arrayList, AbstractMap<Long, TLRPC.User> abstractMap, LongSparseArray longSparseArray) {
        TLRPC.User user;
        if (TextUtils.indexOf(charSequence, str) < 0) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        for (int i = 0; i < arrayList.size(); i++) {
            if (abstractMap != null) {
                user = abstractMap.get(arrayList.get(i));
            } else {
                user = longSparseArray != null ? (TLRPC.User) longSparseArray.get(arrayList.get(i).longValue()) : null;
            }
            if (user == null) {
                user = MessagesController.getInstance(this.currentAccount).getUser(arrayList.get(i));
            }
            if (user != null) {
                String userName = UserObject.getUserName(user);
                int length = spannableStringBuilder.length();
                if (spannableStringBuilder.length() != 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                spannableStringBuilder.append((CharSequence) userName);
                spannableStringBuilder.setSpan(new URLSpanNoUnderlineBold("" + user.id), length, userName.length() + length, 33);
            }
        }
        return TextUtils.replace(charSequence, new String[]{str}, new CharSequence[]{spannableStringBuilder});
    }

    public static CharSequence replaceWithLink(CharSequence charSequence, String str, CharSequence charSequence2) {
        return TextUtils.indexOf(charSequence, str) >= 0 ? TextUtils.replace(charSequence, new String[]{str}, new CharSequence[]{charSequence2}) : charSequence;
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
                charSequence2 = ForumUtilities.getTopicSpannedName((TLRPC.ForumTopic) tLObject, null, false);
                str3 = "topic";
                tLObject2 = tLObject;
            } else {
                str2 = "0";
                charSequence2 = "";
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(TextUtils.replace(charSequence, new String[]{str}, new CharSequence[]{charSequence2}));
            URLSpanNoUnderlineBold uRLSpanNoUnderlineBold = new URLSpanNoUnderlineBold("" + str3);
            uRLSpanNoUnderlineBold.setObject(tLObject2);
            spannableStringBuilder.setSpan(uRLSpanNoUnderlineBold, indexOf, charSequence2.length() + indexOf, 33);
            return spannableStringBuilder;
        }
        str3 = str2;
        tLObject2 = null;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.replace(charSequence, new String[]{str}, new CharSequence[]{charSequence2}));
        URLSpanNoUnderlineBold uRLSpanNoUnderlineBold2 = new URLSpanNoUnderlineBold("" + str3);
        uRLSpanNoUnderlineBold2.setObject(tLObject2);
        spannableStringBuilder2.setSpan(uRLSpanNoUnderlineBold2, indexOf, charSequence2.length() + indexOf, 33);
        return spannableStringBuilder2;
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

    public String getFileName() {
        if (getDocument() != null) {
            return getFileName(getDocument());
        }
        return getFileName(this.messageOwner);
    }

    public String getFileNameFast() {
        if (getDocumentFast() != null) {
            return getFileName(getDocumentFast());
        }
        return getFileName(this.messageOwner);
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

    public static String getFileName(TLRPC.Document document) {
        return FileLoader.getAttachFileName(document);
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

    public static boolean containsUrls(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() >= 2 && charSequence.length() <= 20480) {
            int length = charSequence.length();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            char c = 0;
            while (i < length) {
                char charAt = charSequence.charAt(i);
                if (charAt >= '0' && charAt <= '9') {
                    i2++;
                    if (i2 >= 6) {
                        return true;
                    }
                    i3 = 0;
                    i4 = 0;
                } else if (charAt == ' ' || i2 <= 0) {
                    i2 = 0;
                }
                if ((charAt != '@' && charAt != '#' && charAt != '/' && charAt != '$') || i != 0) {
                    if (i != 0) {
                        int i5 = i - 1;
                        if (charSequence.charAt(i5) != ' ') {
                            if (charSequence.charAt(i5) == '\n') {
                            }
                        }
                    }
                    if (charAt == ':') {
                        if (i3 == 0) {
                            i3 = 1;
                        }
                        i3 = 0;
                    } else if (charAt != '/') {
                        if (charAt == '.') {
                            if (i4 == 0 && c != ' ') {
                                i4++;
                            }
                        } else if (charAt != ' ' && c == '.' && i4 == 1) {
                            return true;
                        }
                        i4 = 0;
                    } else {
                        if (i3 == 2) {
                            return true;
                        }
                        if (i3 == 1) {
                            i3++;
                        }
                        i3 = 0;
                    }
                    i++;
                    c = charAt;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void generateLinkDescription() {
        boolean z;
        int i;
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
            for (int i2 = 0; i2 < webPage.attributes.size(); i2++) {
                TLRPC.WebPageAttribute webPageAttribute = webPage.attributes.get(i2);
                if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem) != null && storyItem.caption != null) {
                    this.linkDescription = new SpannableStringBuilder(tL_webPageAttributeStory.storyItem.caption);
                    this.webPageDescriptionEntities = tL_webPageAttributeStory.storyItem.entities;
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (this.linkDescription == null) {
            if ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && (getMedia(this.messageOwner).webpage instanceof TLRPC.TL_webPage) && getMedia(this.messageOwner).webpage.description != null) {
                this.linkDescription = Spannable.Factory.getInstance().newSpannable(getMedia(this.messageOwner).webpage.description);
                String str = getMedia(this.messageOwner).webpage.site_name;
                if (str != null) {
                    str = str.toLowerCase();
                }
                if ("instagram".equals(str)) {
                    i = 1;
                } else if ("twitter".equals(str)) {
                    i = 2;
                }
                if (TextUtils.isEmpty(this.linkDescription)) {
                    if (containsUrls(this.linkDescription)) {
                        try {
                            AndroidUtilities.addLinksSafe((Spannable) this.linkDescription, 1, false, true);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    CharSequence replaceEmoji = Emoji.replaceEmoji(this.linkDescription, Theme.chat_msgTextPaint.getFontMetricsInt(), false);
                    this.linkDescription = replaceEmoji;
                    ArrayList<TLRPC.MessageEntity> arrayList = this.webPageDescriptionEntities;
                    if (arrayList != null) {
                        addEntitiesToText(replaceEmoji, arrayList, isOut(), z, false, !z);
                        replaceAnimatedEmoji(this.linkDescription, this.webPageDescriptionEntities, Theme.chat_msgTextPaint.getFontMetricsInt());
                    }
                    if (i != 0) {
                        if (!(this.linkDescription instanceof Spannable)) {
                            this.linkDescription = new SpannableStringBuilder(this.linkDescription);
                        }
                        addUrlsByPattern(isOutOwner(), this.linkDescription, false, i, 0, false);
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
        i = 0;
        if (TextUtils.isEmpty(this.linkDescription)) {
        }
    }

    public CharSequence getVoiceTranscription() {
        String str;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message = this.messageOwner;
        if (message == null || (str = message.voiceTranscription) == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.NoWordsRecognized));
            spannableString.setSpan(new CharacterStyle() { // from class: org.telegram.messenger.MessageObject.1
                @Override // android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    textPaint.setTextSize(textPaint.getTextSize() * 0.8f);
                    textPaint.setColor(Theme.chat_timePaint.getColor());
                }
            }, 0, spannableString.length(), 33);
            return spannableString;
        }
        String str2 = (!this.translated || (tL_textWithEntities = this.messageOwner.translatedVoiceTranscription) == null) ? this.messageOwner.voiceTranscription : tL_textWithEntities.text;
        return !TextUtils.isEmpty(str2) ? Emoji.replaceEmoji(str2, Theme.chat_msgTextPaint.getFontMetricsInt(), false) : str2;
    }

    public float measureVoiceTranscriptionHeight() {
        StaticLayout staticLayout;
        StaticLayout.Builder obtain;
        StaticLayout.Builder breakStrategy;
        StaticLayout.Builder hyphenationFrequency;
        StaticLayout.Builder alignment;
        CharSequence voiceTranscription = getVoiceTranscription();
        if (voiceTranscription == null) {
            return 0.0f;
        }
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(needDrawAvatar() ? 147.0f : 95.0f);
        if (Build.VERSION.SDK_INT >= 24) {
            obtain = StaticLayout.Builder.obtain(voiceTranscription, 0, voiceTranscription.length(), Theme.chat_msgTextPaint, dp);
            breakStrategy = obtain.setBreakStrategy(1);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(0);
            alignment = hyphenationFrequency.setAlignment(Layout.Alignment.ALIGN_NORMAL);
            staticLayout = alignment.build();
        } else {
            staticLayout = new StaticLayout(voiceTranscription, Theme.chat_msgTextPaint, dp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        return staticLayout.getHeight();
    }

    public boolean isVoiceTranscriptionOpen() {
        if (this.messageOwner != null && (isVoice() || (isRoundVideo() && TranscribeButton.isVideoTranscriptionOpen(this)))) {
            TLRPC.Message message = this.messageOwner;
            if (message.voiceTranscriptionOpen && message.voiceTranscription != null && (message.voiceTranscriptionFinal || TranscribeButton.isTranscribing(this))) {
                return true;
            }
        }
        return false;
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
        if (str != null) {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, Theme.chat_explanationTextPaint.getFontMetricsInt(), false);
            this.quizExplanation = replaceEmoji;
            Spannable replaceAnimatedEmoji = replaceAnimatedEmoji(replaceEmoji, arrayList, Theme.chat_explanationTextPaint.getFontMetricsInt(), false);
            this.quizExplanation = replaceAnimatedEmoji;
            addEntitiesToText(replaceAnimatedEmoji, arrayList, isOutOwner(), true, false, false);
            return;
        }
        this.quizExplanation = null;
    }

    public void generateCaption() {
        boolean z;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        TL_stories.StoryItem storyItem;
        boolean z2;
        if (isRoundVideo()) {
            return;
        }
        if (this.caption != null) {
            if (this.translated) {
                TLRPC.Message message = this.messageOwner;
                if (message.translatedText != null || (this.summarized && message.translatedSummaryText != null)) {
                    z2 = true;
                    if (z2 == this.captionTranslated && this.summarized == this.captionSummarized) {
                        return;
                    }
                }
            }
            z2 = false;
            if (z2 == this.captionTranslated) {
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
                z = true;
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
                CharSequence replaceEmoji = Emoji.replaceEmoji(str, Theme.chat_msgTextPaint.getFontMetricsInt(), false);
                this.caption = replaceEmoji;
                this.caption = replaceAnimatedEmoji(replaceEmoji, arrayList, Theme.chat_msgTextPaint.getFontMetricsInt(), false);
                boolean z3 = z || (!(this.messageOwner.send_state != 0 ? false : arrayList.isEmpty() ^ true) && (this.eventId != 0 || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto_old) || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto_layer68) || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto_layer74) || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument_old) || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument_layer68) || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument_layer74) || ((isOut() && this.messageOwner.send_state != 0) || this.messageOwner.id < 0)));
                if (z3) {
                    if (containsUrls(this.caption)) {
                        try {
                            AndroidUtilities.addLinksSafe((Spannable) this.caption, 5, false, true);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    addUrlsByPattern(isOutOwner(), this.caption, true, 0, 0, true);
                }
                addEntitiesToText(this.caption, z3);
                this.caption = FormattedDateSpan.applyFormatedDateEntities(this.caption);
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
        z = false;
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e2 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:10:0x0011, B:12:0x0015, B:13:0x0021, B:14:0x004d, B:17:0x0052, B:18:0x0056, B:22:0x0060, B:25:0x0071, B:29:0x0081, B:30:0x0083, B:40:0x00a3, B:46:0x022c, B:48:0x0236, B:50:0x0239, B:51:0x023f, B:56:0x00ca, B:59:0x00ef, B:60:0x0110, B:61:0x0131, B:64:0x0139, B:66:0x0152, B:68:0x015e, B:69:0x0167, B:75:0x009d, B:77:0x0171, B:80:0x01b2, B:84:0x01c5, B:89:0x01d8, B:91:0x01e2, B:94:0x01e7, B:96:0x01ec, B:102:0x01f8, B:103:0x0226, B:104:0x0210, B:113:0x0028, B:115:0x002c, B:116:0x0034, B:117:0x003b, B:119:0x003f, B:120:0x0047), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ec A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:10:0x0011, B:12:0x0015, B:13:0x0021, B:14:0x004d, B:17:0x0052, B:18:0x0056, B:22:0x0060, B:25:0x0071, B:29:0x0081, B:30:0x0083, B:40:0x00a3, B:46:0x022c, B:48:0x0236, B:50:0x0239, B:51:0x023f, B:56:0x00ca, B:59:0x00ef, B:60:0x0110, B:61:0x0131, B:64:0x0139, B:66:0x0152, B:68:0x015e, B:69:0x0167, B:75:0x009d, B:77:0x0171, B:80:0x01b2, B:84:0x01c5, B:89:0x01d8, B:91:0x01e2, B:94:0x01e7, B:96:0x01ec, B:102:0x01f8, B:103:0x0226, B:104:0x0210, B:113:0x0028, B:115:0x002c, B:116:0x0034, B:117:0x003b, B:119:0x003f, B:120:0x0047), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void addUrlsByPattern(boolean z, CharSequence charSequence, boolean z2, int i, int i2, boolean z3) {
        Matcher matcher;
        String str;
        URLSpan[] uRLSpanArr;
        int i3;
        URLSpanNoUnderline uRLSpanNoUnderline;
        Object[] objArr;
        if (charSequence == null) {
            return;
        }
        int i4 = 3;
        int i5 = 1;
        try {
            if (i == 3 || i == 4) {
                if (videoTimeUrlPattern == null) {
                    videoTimeUrlPattern = Pattern.compile("\\b(?:(\\d{1,2}):)?(\\d{1,3}):([0-5][0-9])\\b(?: - |)([^\\n]*)");
                }
                matcher = videoTimeUrlPattern.matcher(charSequence);
            } else if (i == 1) {
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
                int i6 = 0;
                while (matcher.find() && i6 < 100) {
                    int start = matcher.start();
                    int end = matcher.end();
                    if (i == i4 || i == 4) {
                        matcher.groupCount();
                        int start2 = matcher.start(i5);
                        int end2 = matcher.end(i5);
                        int start3 = matcher.start(2);
                        int end3 = matcher.end(2);
                        int start4 = matcher.start(i4);
                        int end4 = matcher.end(i4);
                        int start5 = matcher.start(4);
                        int end5 = matcher.end(4);
                        int intValue = Utilities.parseInt(charSequence.subSequence(start3, end3)).intValue();
                        int intValue2 = Utilities.parseInt(charSequence.subSequence(start4, end4)).intValue();
                        int intValue3 = (start2 < 0 || end2 < 0) ? -1 : Utilities.parseInt(charSequence.subSequence(start2, end2)).intValue();
                        if (start5 >= 0 && end5 >= 0) {
                            str = charSequence.subSequence(start5, end5).toString();
                            if (start5 < 0 && end5 < 0) {
                                end = end;
                                uRLSpanArr = (URLSpan[]) spannable.getSpans(start, end, URLSpan.class);
                                if (uRLSpanArr != null || uRLSpanArr.length <= 0) {
                                    i3 = intValue2 + (intValue * 60);
                                    if (intValue3 > 0) {
                                        i3 += intValue3 * 3600;
                                    }
                                    if (i3 <= i2) {
                                        i4 = 3;
                                        i5 = 1;
                                    } else {
                                        if (i == 3) {
                                            uRLSpanNoUnderline = new URLSpanNoUnderline("video?" + i3);
                                        } else {
                                            uRLSpanNoUnderline = new URLSpanNoUnderline("audio?" + i3);
                                        }
                                        uRLSpanNoUnderline.label = str;
                                        if (uRLSpanNoUnderline != null) {
                                            if (z3 && (objArr = (ClickableSpan[]) spannable.getSpans(start, end, ClickableSpan.class)) != null && objArr.length > 0) {
                                                spannable.removeSpan(objArr[0]);
                                            }
                                            spannable.setSpan(uRLSpanNoUnderline, start, end, 0);
                                            i6++;
                                        }
                                        i4 = 3;
                                        i5 = 1;
                                    }
                                } else {
                                    i4 = 3;
                                    i5 = 1;
                                }
                            }
                            end = end4;
                            uRLSpanArr = (URLSpan[]) spannable.getSpans(start, end, URLSpan.class);
                            if (uRLSpanArr != null) {
                            }
                            i3 = intValue2 + (intValue * 60);
                            if (intValue3 > 0) {
                            }
                            if (i3 <= i2) {
                            }
                        }
                        str = null;
                        if (start5 < 0) {
                            end = end;
                            uRLSpanArr = (URLSpan[]) spannable.getSpans(start, end, URLSpan.class);
                            if (uRLSpanArr != null) {
                            }
                            i3 = intValue2 + (intValue * 60);
                            if (intValue3 > 0) {
                            }
                            if (i3 <= i2) {
                            }
                        }
                        end = end4;
                        uRLSpanArr = (URLSpan[]) spannable.getSpans(start, end, URLSpan.class);
                        if (uRLSpanArr != null) {
                        }
                        i3 = intValue2 + (intValue * 60);
                        if (intValue3 > 0) {
                        }
                        if (i3 <= i2) {
                        }
                    } else {
                        char charAt = charSequence.charAt(start);
                        if (i != 0) {
                            if (charAt != '@' && charAt != '#') {
                                start++;
                            }
                            charAt = charSequence.charAt(start);
                            if (charAt != '@' && charAt != '#') {
                                i4 = 3;
                                i5 = 1;
                            }
                        } else if (charAt != '@' && charAt != '#' && charAt != '/' && charAt != '$') {
                            start++;
                        }
                        if (i == i5) {
                            if (charAt == '@') {
                                uRLSpanNoUnderline = new URLSpanNoUnderline("https://instagram.com/" + charSequence.subSequence(start + 1, end).toString());
                            } else {
                                uRLSpanNoUnderline = new URLSpanNoUnderline("https://www.instagram.com/explore/tags/" + charSequence.subSequence(start + 1, end).toString());
                            }
                        } else if (i == 2) {
                            if (charAt == '@') {
                                uRLSpanNoUnderline = new URLSpanNoUnderline("https://twitter.com/" + charSequence.subSequence(start + 1, end).toString());
                            } else {
                                uRLSpanNoUnderline = new URLSpanNoUnderline("https://twitter.com/hashtag/" + charSequence.subSequence(start + 1, end).toString());
                            }
                        } else if (charSequence.charAt(start) != '/') {
                            String charSequence2 = charSequence.subSequence(start, end).toString();
                            if (charSequence2 != null) {
                                charSequence2 = charSequence2.replaceAll("∕|⁄|%E2%81%84|%E2%88%95", "/");
                            }
                            uRLSpanNoUnderline = new URLSpanNoUnderline(charSequence2);
                            if (uRLSpanNoUnderline != null) {
                            }
                            i4 = 3;
                            i5 = 1;
                        } else if (z2) {
                            uRLSpanNoUnderline = new URLSpanBotCommand(charSequence.subSequence(start, end).toString(), z ? 1 : 0);
                            if (uRLSpanNoUnderline != null) {
                            }
                            i4 = 3;
                            i5 = 1;
                        } else {
                            uRLSpanNoUnderline = null;
                            if (uRLSpanNoUnderline != null) {
                            }
                            i4 = 3;
                            i5 = 1;
                        }
                        if (uRLSpanNoUnderline != null) {
                        }
                        i4 = 3;
                        i5 = 1;
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static int[] getWebDocumentWidthAndHeight(TLRPC.WebDocument webDocument) {
        if (webDocument == null) {
            return null;
        }
        int size = webDocument.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = webDocument.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                return new int[]{documentAttribute.w, documentAttribute.h};
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return new int[]{documentAttribute.w, documentAttribute.h};
            }
        }
        return null;
    }

    public static double getWebDocumentDuration(TLRPC.WebDocument webDocument) {
        if (webDocument == null) {
            return 0.0d;
        }
        int size = webDocument.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = webDocument.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return documentAttribute.duration;
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                return documentAttribute.duration;
            }
        }
        return 0.0d;
    }

    public static int[] getInlineResultWidthAndHeight(TLRPC.BotInlineResult botInlineResult) {
        int[] webDocumentWidthAndHeight = getWebDocumentWidthAndHeight(botInlineResult.content);
        if (webDocumentWidthAndHeight != null) {
            return webDocumentWidthAndHeight;
        }
        int[] webDocumentWidthAndHeight2 = getWebDocumentWidthAndHeight(botInlineResult.thumb);
        return webDocumentWidthAndHeight2 == null ? new int[]{0, 0} : webDocumentWidthAndHeight2;
    }

    public static int getInlineResultDuration(TLRPC.BotInlineResult botInlineResult) {
        int webDocumentDuration = (int) getWebDocumentDuration(botInlineResult.content);
        return webDocumentDuration == 0 ? (int) getWebDocumentDuration(botInlineResult.thumb) : webDocumentDuration;
    }

    public boolean hasValidGroupId() {
        ArrayList<TLRPC.PhotoSize> arrayList;
        int i;
        return getGroupId() != 0 && (!((arrayList = this.photoThumbs) == null || arrayList.isEmpty()) || (i = this.type) == 3 || i == 1 || isMusic() || isDocument());
    }

    public boolean hasValidGroupIdFast() {
        ArrayList<TLRPC.PhotoSize> arrayList;
        int i;
        return getGroupId() != 0 && (!((arrayList = this.photoThumbs) == null || arrayList.isEmpty()) || (i = this.type) == 3 || i == 1 || i == 14 || i == 9);
    }

    public long getGroupIdForUse() {
        long j = this.localSentGroupId;
        return j != 0 ? j : this.messageOwner.grouped_id;
    }

    public long getGroupId() {
        long j = this.localGroupId;
        return j != 0 ? j : getGroupIdForUse();
    }

    public static void addLinks(boolean z, CharSequence charSequence) {
        addLinks(z, charSequence, true, false);
    }

    public static void addLinks(boolean z, CharSequence charSequence, boolean z2, boolean z3) {
        addLinks(z, charSequence, z2, z3, false);
    }

    public static void addLinks(boolean z, CharSequence charSequence, boolean z2, boolean z3, boolean z4) {
        if ((charSequence instanceof Spannable) && containsUrls(charSequence)) {
            try {
                AndroidUtilities.addLinksSafe((Spannable) charSequence, 1, z4, false);
            } catch (Exception e) {
                FileLog.e(e);
            }
            addPhoneLinks(charSequence);
            addUrlsByPattern(z, charSequence, z2, 0, 0, z3);
        }
    }

    public void resetPlayingProgress() {
        this.audioProgress = 0.0f;
        this.audioProgressSec = 0;
        this.bufferedProgress = 0.0f;
    }

    private boolean addEntitiesToText(CharSequence charSequence, boolean z) {
        return addEntitiesToText(charSequence, false, z);
    }

    public boolean addEntitiesToText(CharSequence charSequence, boolean z, boolean z2) {
        if (charSequence == null) {
            return false;
        }
        if (this.isRestrictedMessage || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaUnsupported)) {
            ArrayList arrayList = new ArrayList();
            TLRPC.TL_messageEntityItalic tL_messageEntityItalic = new TLRPC.TL_messageEntityItalic();
            tL_messageEntityItalic.offset = 0;
            tL_messageEntityItalic.length = charSequence.length();
            arrayList.add(tL_messageEntityItalic);
            return addEntitiesToText(charSequence, arrayList, isOutOwner(), true, z, z2);
        }
        return addEntitiesToText(charSequence, getEntities(), isOutOwner(), true, z, z2);
    }

    public void replaceEmojiToLottieFrame(CharSequence charSequence, int[] iArr) {
        boolean z;
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannable.getSpans(0, spannable.length(), Emoji.EmojiSpan.class);
            AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spannable.getSpans(0, spannable.length(), AnimatedEmojiSpan.class);
            if (emojiSpanArr != null) {
                if (((iArr == null ? 0 : iArr[0]) - emojiSpanArr.length) - (animatedEmojiSpanArr == null ? 0 : animatedEmojiSpanArr.length) > 0) {
                    return;
                }
                for (int i = 0; i < emojiSpanArr.length; i++) {
                    CharSequence charSequence2 = emojiSpanArr[i].emoji;
                    if (Emoji.endsWithRightArrow(charSequence2)) {
                        charSequence2 = charSequence2.subSequence(0, charSequence2.length() - 2);
                        z = true;
                    } else {
                        z = false;
                    }
                    TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(this.currentAccount).getEmojiAnimatedSticker(charSequence2);
                    if (emojiAnimatedSticker != null) {
                        int spanStart = spannable.getSpanStart(emojiSpanArr[i]);
                        int spanEnd = spannable.getSpanEnd(emojiSpanArr[i]);
                        spannable.removeSpan(emojiSpanArr[i]);
                        AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(emojiAnimatedSticker, emojiSpanArr[i].fontMetrics);
                        animatedEmojiSpan.standard = true;
                        animatedEmojiSpan.invert = z;
                        spannable.setSpan(animatedEmojiSpan, spanStart, spanEnd, 33);
                    }
                }
            }
        }
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
        if (this.translated) {
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
        return message.entities;
    }

    public Spannable replaceAnimatedEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        return replaceAnimatedEmoji(charSequence, getEntities(), fontMetricsInt, false);
    }

    public static Spannable replaceAnimatedEmoji(CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, Paint.FontMetricsInt fontMetricsInt) {
        return replaceAnimatedEmoji(charSequence, arrayList, fontMetricsInt, false);
    }

    public static Spannable replaceAnimatedEmoji(CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, Paint.FontMetricsInt fontMetricsInt, boolean z) {
        return replaceAnimatedEmoji(charSequence, arrayList, fontMetricsInt, z, 1.2f, 0);
    }

    public static Spannable replaceAnimatedEmoji(CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, Paint.FontMetricsInt fontMetricsInt, boolean z, float f, int i) {
        AnimatedEmojiSpan animatedEmojiSpan;
        if (charSequence == null) {
            return null;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        if (arrayList == null) {
            return spannableString;
        }
        int i2 = (SharedConfig.getDevicePerformanceClass() >= 2 ? 100 : 50) - i;
        Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannableString.getSpans(0, spannableString.length(), Emoji.EmojiSpan.class);
        for (int i3 = 0; i3 < arrayList.size() && i2 > 0; i3++) {
            TLRPC.MessageEntity messageEntity = arrayList.get(i3);
            if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                for (int i4 = 0; i4 < emojiSpanArr.length; i4++) {
                    Emoji.EmojiSpan emojiSpan = emojiSpanArr[i4];
                    if (emojiSpan != null) {
                        int spanStart = spannableString.getSpanStart(emojiSpan);
                        int spanEnd = spannableString.getSpanEnd(emojiSpan);
                        int i5 = tL_messageEntityCustomEmoji.offset;
                        if (AndroidUtilities.intersect1d(i5, tL_messageEntityCustomEmoji.length + i5, spanStart, spanEnd)) {
                            spannableString.removeSpan(emojiSpan);
                            emojiSpanArr[i4] = null;
                        }
                    }
                }
                if (messageEntity.offset + messageEntity.length <= spannableString.length()) {
                    int i6 = messageEntity.offset;
                    AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spannableString.getSpans(i6, messageEntity.length + i6, AnimatedEmojiSpan.class);
                    if (animatedEmojiSpanArr != null && animatedEmojiSpanArr.length > 0) {
                        for (AnimatedEmojiSpan animatedEmojiSpan2 : animatedEmojiSpanArr) {
                            spannableString.removeSpan(animatedEmojiSpan2);
                        }
                    }
                    if (tL_messageEntityCustomEmoji.document != null) {
                        animatedEmojiSpan = new AnimatedEmojiSpan(tL_messageEntityCustomEmoji.document, f, fontMetricsInt);
                    } else {
                        animatedEmojiSpan = new AnimatedEmojiSpan(tL_messageEntityCustomEmoji.document_id, f, fontMetricsInt);
                    }
                    animatedEmojiSpan.top = z;
                    int i7 = messageEntity.offset;
                    spannableString.setSpan(animatedEmojiSpan, i7, messageEntity.length + i7, 33);
                    i2--;
                }
            }
        }
        return spannableString;
    }

    public static boolean addEntitiesToText(CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, boolean z, boolean z2, boolean z3, boolean z4) {
        return addEntitiesToText(charSequence, arrayList, z, z2, z3, z4, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean addEntitiesToText(CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        int i2;
        String str;
        int i3;
        int i4;
        boolean z5;
        int i5;
        int i6;
        int size;
        int i7;
        int i8;
        if (!(charSequence instanceof Spannable)) {
            return false;
        }
        CharSequence restoreFormatedDateEntities = FormattedDateSpan.restoreFormatedDateEntities(charSequence);
        Spannable spannable = (Spannable) restoreFormatedDateEntities;
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, restoreFormatedDateEntities.length(), URLSpan.class);
        boolean z6 = uRLSpanArr != null && uRLSpanArr.length > 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            byte b = z3 ? (byte) 2 : z ? (byte) 1 : (byte) 0;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(arrayList);
            Collections.sort(arrayList3, new Comparator() { // from class: org.telegram.messenger.MessageObject$$ExternalSyntheticLambda11
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int lambda$addEntitiesToText$2;
                    lambda$addEntitiesToText$2 = MessageObject.lambda$addEntitiesToText$2((TLRPC.MessageEntity) obj, (TLRPC.MessageEntity) obj2);
                    return lambda$addEntitiesToText$2;
                }
            });
            int size2 = arrayList3.size();
            int i9 = 0;
            while (i9 < size2) {
                TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList3.get(i9);
                if (messageEntity.length > 0 && (i6 = messageEntity.offset) >= 0 && i6 < restoreFormatedDateEntities.length()) {
                    if (messageEntity.offset + messageEntity.length > restoreFormatedDateEntities.length()) {
                        messageEntity.length = restoreFormatedDateEntities.length() - messageEntity.offset;
                    }
                    if ((!z4 || (messageEntity instanceof TLRPC.TL_messageEntityBold) || (messageEntity instanceof TLRPC.TL_messageEntityItalic) || (messageEntity instanceof TLRPC.TL_messageEntityStrike) || (messageEntity instanceof TLRPC.TL_messageEntityUnderline) || (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) || (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) || (messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityPre) || (messageEntity instanceof TLRPC.TL_messageEntityMentionName) || (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) || (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) || (messageEntity instanceof TLRPC.TL_messageEntityDiffInsert) || (messageEntity instanceof TLRPC.TL_messageEntityDiffReplace) || (messageEntity instanceof TLRPC.TL_messageEntityDiffDelete)) && uRLSpanArr != null && uRLSpanArr.length > 0) {
                        for (int i10 = 0; i10 < uRLSpanArr.length; i10++) {
                            URLSpan uRLSpan = uRLSpanArr[i10];
                            if (uRLSpan != null) {
                                int spanStart = spannable.getSpanStart(uRLSpan);
                                int spanEnd = spannable.getSpanEnd(uRLSpanArr[i10]);
                                int i11 = messageEntity.offset;
                                if ((i11 <= spanStart && messageEntity.length + i11 >= spanStart) || (i11 <= spanEnd && i11 + messageEntity.length >= spanEnd)) {
                                    spannable.removeSpan(uRLSpanArr[i10]);
                                    uRLSpanArr[i10] = null;
                                }
                            }
                        }
                    }
                    if ((i != 1 || (messageEntity instanceof TLRPC.TL_messageEntityHashtag)) && !(messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) && !(messageEntity instanceof TLRPC.TL_messageEntityBlockquote) && !(messageEntity instanceof TLRPC.TL_messageEntityPre) && !(messageEntity instanceof TLRPC.TL_messageEntityDiffReplace)) {
                        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                        int i12 = messageEntity.offset;
                        textStyleRun.start = i12;
                        textStyleRun.end = i12 + messageEntity.length;
                        if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                            textStyleRun.flags = 256;
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                            textStyleRun.flags = 8;
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityDiffDelete) {
                            textStyleRun.flags = 8192;
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                            textStyleRun.flags = 16;
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                            textStyleRun.flags = 1;
                        } else {
                            if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                textStyleRun.flags = 2;
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                                textStyleRun.flags = 4;
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityDiffInsert) {
                                textStyleRun.flags = 4096;
                            } else {
                                if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                                    if (z2) {
                                        textStyleRun.flags = 64;
                                        textStyleRun.urlEntity = messageEntity;
                                    }
                                } else if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                    if (z2) {
                                        textStyleRun.flags = 64;
                                        textStyleRun.urlEntity = messageEntity;
                                    }
                                } else if ((!z4 || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate)) && (((!(messageEntity instanceof TLRPC.TL_messageEntityUrl) && !(messageEntity instanceof TLRPC.TL_messageEntityTextUrl)) || !Browser.isPassportUrl(messageEntity.url)) && (!(messageEntity instanceof TLRPC.TL_messageEntityMention) || z2))) {
                                    textStyleRun.flags = 128;
                                    textStyleRun.urlEntity = messageEntity;
                                    if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                        textStyleRun.flags = 1152;
                                    }
                                }
                                i9++;
                                size2 = i5;
                            }
                            size = arrayList2.size();
                            i7 = 0;
                            while (i7 < size) {
                                TextStyleSpan.TextStyleRun textStyleRun2 = (TextStyleSpan.TextStyleRun) arrayList2.get(i7);
                                if ((textStyleRun2.flags & 256) == 0 || textStyleRun.start < textStyleRun2.start || textStyleRun.end > textStyleRun2.end) {
                                    int i13 = textStyleRun.start;
                                    int i14 = textStyleRun2.start;
                                    if (i13 > i14) {
                                        int i15 = textStyleRun2.end;
                                        if (i13 < i15) {
                                            if (textStyleRun.end < i15) {
                                                TextStyleSpan.TextStyleRun textStyleRun3 = new TextStyleSpan.TextStyleRun(textStyleRun);
                                                textStyleRun3.merge(textStyleRun2);
                                                arrayList2.add(i7 + 1, textStyleRun3);
                                                TextStyleSpan.TextStyleRun textStyleRun4 = new TextStyleSpan.TextStyleRun(textStyleRun2);
                                                textStyleRun4.start = textStyleRun.end;
                                                i7 += 2;
                                                size += 2;
                                                arrayList2.add(i7, textStyleRun4);
                                            } else {
                                                TextStyleSpan.TextStyleRun textStyleRun5 = new TextStyleSpan.TextStyleRun(textStyleRun);
                                                textStyleRun5.merge(textStyleRun2);
                                                textStyleRun5.end = textStyleRun2.end;
                                                i7++;
                                                size++;
                                                arrayList2.add(i7, textStyleRun5);
                                            }
                                            int i16 = textStyleRun.start;
                                            textStyleRun.start = textStyleRun2.end;
                                            textStyleRun2.end = i16;
                                        }
                                    } else {
                                        int i17 = textStyleRun.end;
                                        if (i14 < i17) {
                                            i8 = size2;
                                            int i18 = textStyleRun2.end;
                                            if (i17 == i18) {
                                                textStyleRun2.merge(textStyleRun);
                                            } else if (i17 < i18) {
                                                TextStyleSpan.TextStyleRun textStyleRun6 = new TextStyleSpan.TextStyleRun(textStyleRun2);
                                                textStyleRun6.merge(textStyleRun);
                                                textStyleRun6.end = textStyleRun.end;
                                                i7++;
                                                size++;
                                                arrayList2.add(i7, textStyleRun6);
                                                textStyleRun2.start = textStyleRun.end;
                                            } else {
                                                TextStyleSpan.TextStyleRun textStyleRun7 = new TextStyleSpan.TextStyleRun(textStyleRun);
                                                textStyleRun7.start = textStyleRun2.end;
                                                i7++;
                                                size++;
                                                arrayList2.add(i7, textStyleRun7);
                                                textStyleRun2.merge(textStyleRun);
                                            }
                                            textStyleRun.end = i14;
                                            i7++;
                                            size2 = i8;
                                        }
                                    }
                                }
                                i8 = size2;
                                i7++;
                                size2 = i8;
                            }
                            i5 = size2;
                            if (textStyleRun.start >= textStyleRun.end) {
                                arrayList2.add(textStyleRun);
                            }
                            i9++;
                            size2 = i5;
                        }
                        size = arrayList2.size();
                        i7 = 0;
                        while (i7 < size) {
                        }
                        i5 = size2;
                        if (textStyleRun.start >= textStyleRun.end) {
                        }
                        i9++;
                        size2 = i5;
                    }
                }
                i5 = size2;
                i9++;
                size2 = i5;
            }
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            for (int min = Math.min(MediaDataController.MAX_STYLE_RUNS_COUNT, arrayList2.size()); i19 < min; min = i3) {
                TextStyleSpan.TextStyleRun textStyleRun8 = (TextStyleSpan.TextStyleRun) arrayList2.get(i19);
                if (i != 1 || (textStyleRun8.urlEntity instanceof TLRPC.TL_messageEntityHashtag)) {
                    TLRPC.MessageEntity messageEntity2 = textStyleRun8.urlEntity;
                    if (messageEntity2 != null) {
                        int i22 = messageEntity2.offset;
                        str = TextUtils.substring(restoreFormatedDateEntities, i22, messageEntity2.length + i22);
                    } else {
                        str = null;
                    }
                    TLRPC.MessageEntity messageEntity3 = textStyleRun8.urlEntity;
                    if (!(messageEntity3 instanceof TLRPC.TL_messageEntityBotCommand)) {
                        if ((messageEntity3 instanceof TLRPC.TL_messageEntityHashtag) || (messageEntity3 instanceof TLRPC.TL_messageEntityMention)) {
                            i3 = min;
                            i4 = 250;
                        } else if (messageEntity3 instanceof TLRPC.TL_messageEntityCashtag) {
                            i3 = min;
                            i4 = 250;
                        } else if (!(messageEntity3 instanceof TLRPC.TL_messageEntityEmail)) {
                            i3 = min;
                            if (messageEntity3 instanceof TLRPC.TL_messageEntityUrl) {
                                if (i20 < 250) {
                                    i20++;
                                    if (!str.toLowerCase().contains("://")) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(BotWebViewContainer.isTonsite(str) ? "tonsite://" : "http://");
                                        sb.append(str);
                                        str = sb.toString();
                                    }
                                    if (str != null) {
                                        str = str.replaceAll("∕|⁄|%E2%81%84|%E2%88%95", "/");
                                    }
                                    if (Browser.isTonsitePunycode(str)) {
                                        z6 = true;
                                        i19++;
                                    } else {
                                        spannable.setSpan(new URLSpanBrowser(str, textStyleRun8), textStyleRun8.start, textStyleRun8.end, 33);
                                        z5 = false;
                                        z6 = true;
                                    }
                                }
                                i19++;
                            } else if (messageEntity3 instanceof TLRPC.TL_messageEntityFormattedDate) {
                                if (i20 < 250) {
                                    i20++;
                                    spannable.setSpan(new FormattedDateSpan(str, textStyleRun8, (TLRPC.TL_messageEntityFormattedDate) textStyleRun8.urlEntity), textStyleRun8.start, textStyleRun8.end, 33);
                                    z5 = false;
                                }
                                i19++;
                            } else {
                                if (messageEntity3 instanceof TLRPC.TL_messageEntityBankCard) {
                                    spannable.setSpan(new URLSpanNoUnderline("card:" + str, textStyleRun8), textStyleRun8.start, textStyleRun8.end, 33);
                                } else if (messageEntity3 instanceof TLRPC.TL_messageEntityPhone) {
                                    String stripExceptNumbers = PhoneFormat.stripExceptNumbers(str);
                                    if (str.startsWith("+")) {
                                        stripExceptNumbers = "+" + stripExceptNumbers;
                                    }
                                    spannable.setSpan(new URLSpanNoUnderline("tel:" + stripExceptNumbers, textStyleRun8), textStyleRun8.start, textStyleRun8.end, 33);
                                } else if (messageEntity3 instanceof TLRPC.TL_messageEntityTextUrl) {
                                    if (i20 < 250) {
                                        i20++;
                                        String str2 = messageEntity3.url;
                                        if (str2 != null) {
                                            str2 = str2.replaceAll("∕|⁄|%E2%81%84|%E2%88%95", "/");
                                        }
                                        if (Browser.isTonsitePunycode(str2)) {
                                            i19++;
                                        } else {
                                            spannable.setSpan(new URLSpanReplacement(str2, textStyleRun8), textStyleRun8.start, textStyleRun8.end, 33);
                                            z5 = false;
                                        }
                                    }
                                    i19++;
                                } else {
                                    if (messageEntity3 instanceof TLRPC.TL_messageEntityMentionName) {
                                        spannable.setSpan(new URLSpanUserMention("" + ((TLRPC.TL_messageEntityMentionName) textStyleRun8.urlEntity).user_id, b, textStyleRun8), textStyleRun8.start, textStyleRun8.end, 33);
                                    } else if (messageEntity3 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                        spannable.setSpan(new URLSpanUserMention("" + ((TLRPC.TL_inputMessageEntityMentionName) textStyleRun8.urlEntity).user_id.user_id, b, textStyleRun8), textStyleRun8.start, textStyleRun8.end, 33);
                                    } else if ((textStyleRun8.flags & 4) != 0) {
                                        spannable.setSpan(new URLSpanMono(spannable, textStyleRun8.start, textStyleRun8.end, b, textStyleRun8), textStyleRun8.start, textStyleRun8.end, 33);
                                        z5 = false;
                                    } else {
                                        spannable.setSpan(new TextStyleSpan(textStyleRun8), textStyleRun8.start, textStyleRun8.end, 33);
                                        z5 = true;
                                    }
                                    z5 = false;
                                }
                                z5 = false;
                                z6 = true;
                            }
                            if (!z5) {
                            }
                            i19++;
                        } else if (i20 < 250) {
                            i20++;
                            spannable.setSpan(new URLSpanReplacement("mailto:" + str, textStyleRun8), textStyleRun8.start, textStyleRun8.end, 33);
                            i3 = min;
                            z5 = false;
                            if (!z5) {
                            }
                            i19++;
                        }
                        if (i20 < i4) {
                            i20++;
                            spannable.setSpan(new URLSpanNoUnderline(str, textStyleRun8), textStyleRun8.start, textStyleRun8.end, 33);
                            z5 = false;
                            if (!z5) {
                            }
                        }
                        i19++;
                    } else if (i20 < 250) {
                        i20++;
                        spannable.setSpan(new URLSpanBotCommand(str, b, textStyleRun8), textStyleRun8.start, textStyleRun8.end, 33);
                        i3 = min;
                        z5 = false;
                        if (!z5) {
                            if ((textStyleRun8.flags & 256) != 0 && i21 < 100) {
                                i21++;
                                spannable.setSpan(new TextStyleSpan(textStyleRun8), textStyleRun8.start, textStyleRun8.end, 33);
                            }
                            i19++;
                        }
                        i19++;
                    }
                }
                i3 = min;
                i19++;
            }
            int size3 = arrayList3.size();
            int i23 = 0;
            for (int i24 = 0; i24 < size3; i24++) {
                TLRPC.MessageEntity messageEntity4 = (TLRPC.MessageEntity) arrayList3.get(i24);
                if (messageEntity4.length > 0 && (i2 = messageEntity4.offset) >= 0 && i2 < restoreFormatedDateEntities.length()) {
                    if (messageEntity4.offset + messageEntity4.length > restoreFormatedDateEntities.length()) {
                        messageEntity4.length = restoreFormatedDateEntities.length() - messageEntity4.offset;
                    }
                    if (messageEntity4 instanceof TLRPC.TL_messageEntityBlockquote) {
                        int i25 = messageEntity4.offset;
                        QuoteSpan.putQuote(spannable, i25, messageEntity4.length + i25, messageEntity4.collapsed);
                    } else {
                        if (messageEntity4 instanceof TLRPC.TL_messageEntityPre) {
                            if (i23 < 50) {
                                i23++;
                                int i26 = messageEntity4.offset;
                                int i27 = messageEntity4.length + i26;
                                spannable.setSpan(new CodeHighlighting.Span(true, 0, null, messageEntity4.language, spannable.subSequence(i26, i27).toString()), i26, i27, 33);
                            }
                        } else if (messageEntity4 instanceof TLRPC.TL_messageEntityDiffReplace) {
                            int i28 = messageEntity4.offset;
                            spannable.setSpan(new SquigglyLinesSpan(), i28, messageEntity4.length + i28, 33);
                        }
                    }
                }
            }
        }
        return z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$addEntitiesToText$2(TLRPC.MessageEntity messageEntity, TLRPC.MessageEntity messageEntity2) {
        int i = messageEntity.offset;
        int i2 = messageEntity2.offset;
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    public boolean needDrawShareButton() {
        int i;
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        if (this.isRepostPreview || this.sideMenuEnabled || getDialogId() == UserObject.VERIFY) {
            return false;
        }
        if (this.isSaved) {
            long j = UserConfig.getInstance(this.currentAccount).clientUserId;
            long savedDialogId = getSavedDialogId(j, this.messageOwner);
            if (savedDialogId == j || savedDialogId == UserObject.ANONYMOUS || (message = this.messageOwner) == null || (messageFwdHeader = message.fwd_from) == null) {
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
        int i2 = this.type;
        if (i2 != 13 && i2 != 15 && i2 != 19) {
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
                        long j2 = peer.channel_id;
                        if (j2 != 0) {
                            chat = getChat(null, null, j2);
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
                    if (message4.peer_id.channel_id != 0 && ((message4.via_bot_id == 0 && message4.reply_to == null) || ((i = this.type) != 13 && i != 15))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isYouTubeVideo() {
        return (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && getMedia(this.messageOwner).webpage != null && !TextUtils.isEmpty(getMedia(this.messageOwner).webpage.embed_url) && "YouTube".equals(getMedia(this.messageOwner).webpage.site_name);
    }

    public boolean isEmbedVideo() {
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        TLRPC.MessageMedia messageMedia2;
        Boolean bool = this.isEmbedVideoCached;
        boolean z = false;
        if (bool != null) {
            TLRPC.Message message = this.messageOwner;
            return (message == null || (messageMedia2 = message.media) == null || messageMedia2.webpage == null || !bool.booleanValue()) ? false : true;
        }
        TLRPC.Message message2 = this.messageOwner;
        if (message2 != null && (messageMedia = message2.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(WebPlayerView.getYouTubeVideoId(webPage.url))) {
            z = true;
        }
        this.isEmbedVideoCached = Boolean.valueOf(z);
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getMaxMessageTextWidth() {
        int dp;
        Uri parse;
        String lastPathSegment;
        int dp2;
        int dp3;
        if (AndroidUtilities.isTablet() && this.eventId != 0) {
            this.generatedWithMinSize = AndroidUtilities.dp(530.0f);
        } else {
            this.generatedWithMinSize = AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() : getParentWidth();
        }
        this.generatedWithDensity = AndroidUtilities.density;
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
            dp = this.generatedWithMinSize - AndroidUtilities.dp(80.0f);
            if (this.sideMenuEnabled) {
                dp2 = AndroidUtilities.dp(64.0f);
            } else {
                if (needDrawAvatarInternal() && !isOutOwner() && !this.messageOwner.isThreadMessage) {
                    dp2 = AndroidUtilities.dp(52.0f);
                }
                if (needDrawShareButton() && (this.isSaved || !isOutOwner())) {
                    dp -= AndroidUtilities.dp((this.isSaved || !isOutOwner()) ? 14.0f : 40.0f);
                }
                if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame) {
                    dp -= AndroidUtilities.dp(10.0f);
                }
            }
            dp -= dp2;
            if (needDrawShareButton()) {
                dp -= AndroidUtilities.dp((this.isSaved || !isOutOwner()) ? 14.0f : 40.0f);
            }
            if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame) {
            }
        }
        int i = this.emojiOnlyCount;
        if (i < 1) {
            return dp;
        }
        int i2 = this.totalAnimatedEmojiCount;
        if (i2 <= 100) {
            return i - i2 < (SharedConfig.getDevicePerformanceClass() < 2 ? 50 : 100) ? (hasValidReplyMessageObject() || isForwarded()) ? Math.min(dp, (int) (this.generatedWithMinSize * 0.65f)) : dp : dp;
        }
        return dp;
    }

    public boolean updateSideMenuEnabled(boolean z) {
        if (this.sideMenuEnabled == z) {
            return false;
        }
        this.sideMenuEnabled = z;
        generateLayout(null);
        return true;
    }

    public void applyTimestampsHighlightForReplyMsg() {
        applyTimestampsHighlightForReplyMsg(this.messageText);
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
        boolean z = false;
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
            z = true;
        }
        if (z) {
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
        return addEntitiesToText(this.messageText, z);
    }

    public static StaticLayout makeStaticLayout(CharSequence charSequence, TextPaint textPaint, int i, float f, float f2, boolean z) {
        StaticLayout.Builder obtain;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder breakStrategy;
        StaticLayout.Builder hyphenationFrequency;
        StaticLayout.Builder alignment;
        StaticLayout build;
        StaticLayout.Builder obtain2;
        StaticLayout.Builder lineSpacing2;
        StaticLayout.Builder breakStrategy2;
        StaticLayout.Builder hyphenationFrequency2;
        StaticLayout.Builder alignment2;
        StaticLayout build2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            lineSpacing = obtain.setLineSpacing(f2, f);
            breakStrategy = lineSpacing.setBreakStrategy(1);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(0);
            alignment = hyphenationFrequency.setAlignment(Layout.Alignment.ALIGN_NORMAL);
            if (z) {
                alignment.setIncludePad(false);
                if (i2 >= 28) {
                    alignment.setUseLineSpacingFromFallbacks(false);
                }
            }
            build = alignment.build();
            for (int i3 = 0; i3 < build.getLineCount(); i3++) {
                if (build.getLineRight(i3) > i) {
                    obtain2 = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
                    lineSpacing2 = obtain2.setLineSpacing(f2, f);
                    breakStrategy2 = lineSpacing2.setBreakStrategy(0);
                    hyphenationFrequency2 = breakStrategy2.setHyphenationFrequency(0);
                    alignment2 = hyphenationFrequency2.setAlignment(Layout.Alignment.ALIGN_NORMAL);
                    if (z) {
                        alignment2.setIncludePad(false);
                        if (Build.VERSION.SDK_INT >= 28) {
                            alignment2.setUseLineSpacingFromFallbacks(false);
                        }
                    }
                    build2 = alignment2.build();
                    return build2;
                }
            }
            return build;
        }
        return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, f, f2, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:267|(3:268|269|270)|271|(1:273)(11:302|(1:304)|275|276|277|(1:279)|280|(2:282|(3:284|(5:287|288|(1:293)|290|291)|292))(1:299)|298|(1:297)(5:287|288|(0)|290|291)|292)|274|275|276|277|(0)|280|(0)(0)|298|(0)(0)|292) */
    /* JADX WARN: Can't wrap try/catch for region: R(48:146|(1:148)|149|(1:151)(1:418)|152|(1:154)(1:417)|155|(1:157)|(1:159)|(1:416)(1:164)|165|(1:415)(1:172)|173|(2:175|(2:(1:398)|399)(1:178))(2:400|(7:402|(1:404)(1:414)|405|(1:407)(1:413)|408|(1:410)(1:412)|411))|179|(3:181|(1:183)(1:(1:394)(1:395))|184)(1:396)|185|(1:187)(2:389|(1:391)(1:392))|188|(5:190|(1:365)(8:196|(1:198)(1:364)|199|200|(1:202)(1:363)|203|(1:205)(1:362)|206)|207|(2:209|(2:211|(2:213|(1:215))(1:216))(1:217))|218)(3:366|(2:368|369)(8:370|371|372|(1:383)(1:376)|377|378|(1:380)(1:382)|381)|331)|219|220|221|222|(2:226|227)|358|233|234|235|(1:237)(17:352|(1:354)|239|(1:241)|242|(1:244)|245|(3:247|(7:249|250|251|252|253|255|256)|262)|263|(6:265|(16:267|268|269|270|271|(1:273)(11:302|(1:304)|275|276|277|(1:279)|280|(2:282|(3:284|(5:287|288|(1:293)|290|291)|292))(1:299)|298|(1:297)(5:287|288|(0)|290|291)|292)|274|275|276|277|(0)|280|(0)(0)|298|(0)(0)|292)|307|308|(2:(1:311)|312)(1:(1:338))|313)(3:339|(5:341|(1:343)(1:350)|344|(1:346)(1:349)|347)(1:351)|348)|314|(3:316|(1:318)(1:320)|319)|321|(1:336)(3:325|(1:327)(3:332|(1:334)|335)|328)|329|330|331)|238|239|(0)|242|(0)|245|(0)|263|(0)(0)|314|(0)|321|(1:323)|336|329|330|331|144) */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0619, code lost:
    
        r13 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x056d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x056e, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
        r0 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x055a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x055b, code lost:
    
        r11 = 0.0f;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0247 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0653 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x065e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x065e A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void generateLayout(TLRPC.User user) {
        int dp;
        TextPaint textPaint;
        CharSequence charSequence;
        int i;
        int dp2;
        boolean z;
        ArrayList arrayList;
        int i2;
        boolean z2;
        int i3;
        int i4;
        boolean z3;
        TextPaint textPaint2;
        int dp3;
        boolean z4;
        TextPaint textPaint3;
        ArrayList arrayList2;
        CharSequence charSequence2;
        SpannableString valueOf;
        float f;
        float dp4;
        int ceil;
        int i5;
        StaticLayout staticLayout;
        int i6;
        Text text;
        int i7;
        ArrayList arrayList3;
        float f2;
        CharSequence charSequence3;
        int dp5;
        float f3;
        int i8;
        int i9;
        int i10;
        SpannableString spannableString;
        TextPaint textPaint4;
        int i11;
        int i12 = this.type;
        if ((i12 != 0 && i12 != 19 && i12 != 24) || this.messageOwner.peer_id == null) {
            return;
        }
        if (TextUtils.isEmpty(this.messageText) && !this.isBotPendingDraft) {
            return;
        }
        applyEntities();
        TLRPC.Message message = this.messageOwner;
        boolean z5 = message != null && message.noforwards;
        if (!z5) {
            z5 = MessagesController.getInstance(this.currentAccount).isPeerNoForwards(getDialogId());
        }
        boolean z6 = z5;
        this.textLayoutBlocks = new ArrayList<>();
        this.textWidth = 0;
        CharSequence charSequence4 = this.messageText;
        this.hasCode = (charSequence4 instanceof Spanned) && ((CodeHighlighting.Span[]) ((Spanned) charSequence4).getSpans(0, charSequence4.length(), CodeHighlighting.Span.class)).length > 0;
        CharSequence charSequence5 = this.messageText;
        this.hasQuote = (charSequence5 instanceof Spanned) && ((QuoteSpan.QuoteStyleSpan[]) ((Spanned) charSequence5).getSpans(0, charSequence5.length(), QuoteSpan.QuoteStyleSpan.class)).length > 0;
        this.hasSingleQuote = false;
        this.hasSingleCode = false;
        CharSequence applyFormatedDateEntities = FormattedDateSpan.applyFormatedDateEntities(this.messageText);
        this.messageText = applyFormatedDateEntities;
        if (applyFormatedDateEntities instanceof Spanned) {
            Spanned spanned = (Spanned) applyFormatedDateEntities;
            QuoteSpan[] quoteSpanArr = (QuoteSpan[]) spanned.getSpans(0, spanned.length(), QuoteSpan.class);
            for (QuoteSpan quoteSpan : quoteSpanArr) {
                quoteSpan.adaptLineHeight = false;
            }
            this.hasSingleQuote = quoteSpanArr.length == 1 && spanned.getSpanStart(quoteSpanArr[0]) == 0 && spanned.getSpanEnd(quoteSpanArr[0]) == spanned.length();
            CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) spanned.getSpans(0, spanned.length(), CodeHighlighting.Span.class);
            this.hasSingleCode = spanArr.length == 1 && spanned.getSpanStart(spanArr[0]) == 0 && spanned.getSpanEnd(spanArr[0]) == spanned.length();
        }
        if (this.isBotPendingDraft) {
            this.messageText = BotForumHelper.applyTypingAnimationSpan(this.messageText);
        }
        int maxMessageTextWidth = getMaxMessageTextWidth();
        try {
            if (this.hasSingleQuote) {
                dp = AndroidUtilities.dp(32.0f);
            } else {
                if (this.hasSingleCode) {
                    dp = AndroidUtilities.dp(15.0f);
                }
                if (!(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame)) {
                    textPaint = Theme.chat_msgGameTextPaint;
                } else {
                    textPaint = Theme.chat_msgTextPaint;
                }
                CharSequence charSequence6 = this.messageText;
                StaticLayout makeStaticLayout = makeStaticLayout(charSequence6, textPaint, maxMessageTextWidth, 1.0f, this.totalAnimatedEmojiCount < 4 ? -1.0f : 0.0f, this.emojiOnlyCount <= 0);
                charSequence = charSequence6;
                if (this.isRepostPreview) {
                    if (this.type != 0) {
                        i11 = hasValidGroupId() ? 7 : 12;
                    } else {
                        i11 = 22;
                    }
                    if (isWebpage()) {
                        i11 -= 8;
                    }
                    charSequence = charSequence6;
                    if (makeStaticLayout.getLineCount() > i11) {
                        String string = LocaleController.getString(R.string.ReadMore);
                        int ceil2 = (int) Math.ceil(textPaint.measureText("… " + string) + AndroidUtilities.dp(1.0f));
                        float f4 = 0.0f;
                        for (int i13 = 0; i13 < i11; i13++) {
                            f4 = Math.max(f4, makeStaticLayout.getLineRight(i13));
                        }
                        int i14 = i11 - 1;
                        int lineStart = makeStaticLayout.getLineStart(i14);
                        int lineEnd = makeStaticLayout.getLineEnd(i14) - 1;
                        while (lineEnd >= lineStart && makeStaticLayout.getPrimaryHorizontal(lineEnd) >= f4 - ceil2) {
                            lineEnd--;
                        }
                        while (lineEnd >= lineStart && !Character.isWhitespace(charSequence6.charAt(lineEnd))) {
                            lineEnd--;
                        }
                        SpannableStringBuilder append = new SpannableStringBuilder(charSequence6.subSequence(0, lineEnd)).append((CharSequence) "… ").append((CharSequence) string);
                        append.setSpan(new CharacterStyle() { // from class: org.telegram.messenger.MessageObject.2
                            @Override // android.text.style.CharacterStyle
                            public void updateDrawState(TextPaint textPaint5) {
                                textPaint5.setColor(Theme.chat_msgTextPaint.linkColor);
                            }
                        }, append.length() - string.length(), append.length(), 33);
                        try {
                            makeStaticLayout = makeStaticLayout(append, textPaint, maxMessageTextWidth, 1.0f, this.totalAnimatedEmojiCount >= 4 ? -1.0f : 0.0f, this.emojiOnlyCount > 0);
                            charSequence = append;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                }
                if (!this.hasSingleQuote) {
                    dp2 = AndroidUtilities.dp(32.0f);
                } else if (this.hasSingleCode) {
                    dp2 = AndroidUtilities.dp(15.0f);
                } else {
                    i = maxMessageTextWidth;
                    int lineCount = makeStaticLayout.getLineCount();
                    int i15 = this.totalAnimatedEmojiCount;
                    int i16 = i15 >= 50 ? 5 : 10;
                    z = Build.VERSION.SDK_INT < 24 && i15 < 50;
                    int ceil3 = z ? 1 : (int) Math.ceil(lineCount / i16);
                    arrayList = new ArrayList();
                    if (!(charSequence instanceof Spanned) && (this.hasQuote || this.hasCode)) {
                        cutIntoRanges(charSequence, arrayList);
                    } else {
                        if (!z || ceil3 == 1) {
                            i2 = maxMessageTextWidth;
                            z2 = false;
                            arrayList.add(new TextRange(0, makeStaticLayout.getText().length()));
                            int size = arrayList.size();
                            this.hasCodeAtTop = z2;
                            this.hasCodeAtBottom = z2;
                            this.hasQuoteAtBottom = z2;
                            this.hasSingleQuote = z2;
                            this.hasSingleCode = z2;
                            int i17 = i2;
                            i4 = 0;
                            CharSequence charSequence7 = charSequence;
                            while (i4 < arrayList.size()) {
                                TextLayoutBlock textLayoutBlock = new TextLayoutBlock();
                                TextRange textRange = (TextRange) arrayList.get(i4);
                                textLayoutBlock.code = textRange.code;
                                textLayoutBlock.quote = textRange.quote;
                                boolean z7 = textRange.collapse;
                                textLayoutBlock.quoteCollapse = z7;
                                if (z7) {
                                    textLayoutBlock.messageObject = this;
                                }
                                textLayoutBlock.index = i4;
                                textLayoutBlock.start = textRange.start;
                                textLayoutBlock.first = i4 == 0;
                                boolean z8 = i4 == arrayList.size() - 1;
                                textLayoutBlock.last = z8;
                                boolean z9 = textLayoutBlock.first;
                                if (z9) {
                                    this.hasCodeAtTop = textLayoutBlock.code;
                                }
                                if (z8) {
                                    this.hasQuoteAtBottom = textLayoutBlock.quote;
                                    this.hasCodeAtBottom = textLayoutBlock.code;
                                }
                                this.hasSingleQuote = z9 && z8 && textLayoutBlock.quote;
                                this.hasSingleCode = z9 && z8 && !textLayoutBlock.quote && textLayoutBlock.code;
                                if (textLayoutBlock.quote) {
                                    if (z9 && z8) {
                                        int dp6 = AndroidUtilities.dp(6.0f);
                                        textLayoutBlock.padBottom = dp6;
                                        textLayoutBlock.padTop = dp6;
                                    } else {
                                        textLayoutBlock.padTop = AndroidUtilities.dp(z9 ? 8.0f : 6.0f);
                                        textLayoutBlock.padBottom = AndroidUtilities.dp(7.0f);
                                    }
                                } else if (textLayoutBlock.code) {
                                    textLayoutBlock.layoutCode(textRange.language, textRange.end - textRange.start, z6);
                                    textLayoutBlock.padTop = AndroidUtilities.dp(4.0f) + textLayoutBlock.languageHeight + (textLayoutBlock.first ? 0 : AndroidUtilities.dp(5.0f));
                                    textLayoutBlock.padBottom = AndroidUtilities.dp(4.0f) + (textLayoutBlock.last ? 0 : AndroidUtilities.dp(7.0f)) + (textLayoutBlock.hasCodeCopyButton ? AndroidUtilities.dp(38.0f) : 0);
                                }
                                if (textLayoutBlock.code) {
                                    int i18 = textRange.end - textRange.start;
                                    if (i18 > 220) {
                                        textPaint4 = Theme.chat_msgTextCode3Paint;
                                    } else if (i18 > 80) {
                                        textPaint4 = Theme.chat_msgTextCode2Paint;
                                    } else {
                                        textPaint4 = Theme.chat_msgTextCodePaint;
                                    }
                                    textPaint2 = textPaint4;
                                } else {
                                    textPaint2 = textPaint;
                                }
                                CharSequence subSequence = charSequence7.subSequence(textRange.start, textRange.end);
                                if (textLayoutBlock.quote) {
                                    dp3 = i - AndroidUtilities.dp(24.0f);
                                } else {
                                    dp3 = textLayoutBlock.code ? i - AndroidUtilities.dp(15.0f) : i;
                                }
                                if (size == 1) {
                                    if (textLayoutBlock.code && !textLayoutBlock.quote && (makeStaticLayout.getText() instanceof Spannable)) {
                                        if (!TextUtils.isEmpty(textRange.language)) {
                                            spannableString = CodeHighlighting.getHighlighted(subSequence.toString(), textRange.language);
                                        } else {
                                            spannableString = new SpannableString(subSequence.toString());
                                        }
                                        SpannableString spannableString2 = spannableString;
                                        textLayoutBlock.originalWidth = dp3;
                                        makeStaticLayout = makeStaticLayout(spannableString2, textPaint2, dp3, 1.0f, this.totalAnimatedEmojiCount >= 4 ? -1.0f : 0.0f, this.emojiOnlyCount > 0);
                                        i17 = dp3;
                                    } else {
                                        textLayoutBlock.originalWidth = i17;
                                    }
                                    textLayoutBlock.textLayout = makeStaticLayout;
                                    textLayoutBlock.charactersOffset = 0;
                                    textLayoutBlock.charactersEnd = makeStaticLayout.getText().length();
                                    textLayoutBlock.height = makeStaticLayout.getHeight();
                                    textLayoutBlock.collapsedHeight = (int) Math.min(textPaint.getTextSize() * 1.4f * 3.0f, textLayoutBlock.height);
                                    int i19 = this.emojiOnlyCount;
                                    if (i19 != 0) {
                                        if (i19 == 1) {
                                            textLayoutBlock.padTop -= AndroidUtilities.dp(5.3f);
                                        } else if (i19 == 2) {
                                            textLayoutBlock.padTop -= AndroidUtilities.dp(4.5f);
                                        } else if (i19 == 3) {
                                            textLayoutBlock.padTop -= AndroidUtilities.dp(4.2f);
                                        }
                                    }
                                } else {
                                    int i20 = textRange.start;
                                    int i21 = textRange.end;
                                    if (i21 < i20) {
                                        z4 = z6;
                                        textPaint3 = textPaint;
                                        arrayList2 = arrayList;
                                        charSequence2 = charSequence7;
                                    } else {
                                        textLayoutBlock.charactersOffset = i20;
                                        textLayoutBlock.charactersEnd = i21;
                                        try {
                                            if (textLayoutBlock.code && !textLayoutBlock.quote) {
                                                valueOf = CodeHighlighting.getHighlighted(subSequence.toString(), textRange.language);
                                            } else {
                                                valueOf = SpannableString.valueOf(subSequence);
                                            }
                                            SpannableString spannableString3 = valueOf;
                                            textLayoutBlock.originalWidth = dp3;
                                            StaticLayout makeStaticLayout2 = makeStaticLayout(spannableString3, textPaint2, dp3, 1.0f, this.totalAnimatedEmojiCount >= 4 ? -1.0f : 0.0f, false);
                                            textLayoutBlock.textLayout = makeStaticLayout2;
                                            textLayoutBlock.height = makeStaticLayout2.getHeight();
                                            textLayoutBlock.collapsedHeight = (int) Math.min(textPaint.getTextSize() * 1.4f * 3.0f, textLayoutBlock.height);
                                        } catch (Exception e2) {
                                            z4 = z6;
                                            textPaint3 = textPaint;
                                            arrayList2 = arrayList;
                                            charSequence2 = charSequence7;
                                            FileLog.e(e2);
                                        }
                                    }
                                    i4++;
                                    z6 = z4;
                                    textPaint = textPaint3;
                                    arrayList = arrayList2;
                                    charSequence7 = charSequence2;
                                }
                                this.textLayoutBlocks.add(textLayoutBlock);
                                int lineCount2 = textLayoutBlock.textLayout.getLineCount();
                                float lineLeft = textLayoutBlock.textLayout.getLineLeft(lineCount2 - 1);
                                float f5 = 0.0f;
                                if (i4 == 0 && lineLeft >= 0.0f) {
                                    try {
                                        this.textXOffset = lineLeft;
                                    } catch (Exception e3) {
                                        e = e3;
                                        if (i4 == 0) {
                                            this.textXOffset = f5;
                                        }
                                        FileLog.e(e);
                                        f = 0.0f;
                                        float f6 = textLayoutBlock.textLayout.getLineWidth(lineCount2 - 1);
                                        if (!textLayoutBlock.quote) {
                                        }
                                        f6 += dp4;
                                        ceil = (int) Math.ceil(f6);
                                        if (ceil > i + 80) {
                                        }
                                        i5 = size - 1;
                                        if (i4 == i5) {
                                        }
                                        float f7 = ceil;
                                        int i22 = i17;
                                        z4 = z6;
                                        textPaint3 = textPaint;
                                        int ceil4 = (int) Math.ceil(f7 + Math.max(0.0f, f));
                                        if (textLayoutBlock.quote) {
                                        }
                                        int i23 = ceil;
                                        if (lineCount2 > 1) {
                                        }
                                        text = textLayoutBlock.languageLayout;
                                        if (text != null) {
                                        }
                                        textLayoutBlock.spoilers.clear();
                                        if (this.isSpoilersRevealed) {
                                        }
                                        i17 = i22;
                                        makeStaticLayout = staticLayout;
                                        i4++;
                                        z6 = z4;
                                        textPaint = textPaint3;
                                        arrayList = arrayList2;
                                        charSequence7 = charSequence2;
                                    }
                                }
                                f = lineLeft;
                                float f62 = textLayoutBlock.textLayout.getLineWidth(lineCount2 - 1);
                                if (!textLayoutBlock.quote) {
                                    dp4 = AndroidUtilities.dp(32.0f);
                                } else {
                                    if (textLayoutBlock.code) {
                                        dp4 = AndroidUtilities.dp(15.0f);
                                    }
                                    ceil = (int) Math.ceil(f62);
                                    if (ceil > i + 80) {
                                        ceil = i;
                                    }
                                    i5 = size - 1;
                                    if (i4 == i5) {
                                        this.lastLineWidth = ceil;
                                    }
                                    float f72 = ceil;
                                    int i222 = i17;
                                    z4 = z6;
                                    textPaint3 = textPaint;
                                    int ceil42 = (int) Math.ceil(f72 + Math.max(0.0f, f));
                                    if (textLayoutBlock.quote) {
                                        textLayoutBlock.maxRight = 0.0f;
                                        int i24 = 0;
                                        while (i24 < lineCount2) {
                                            try {
                                                i10 = ceil;
                                                try {
                                                    textLayoutBlock.maxRight = Math.max(textLayoutBlock.maxRight, textLayoutBlock.textLayout.getLineRight(i24));
                                                } catch (Exception unused) {
                                                    textLayoutBlock.maxRight = this.textWidth;
                                                    i24++;
                                                    ceil = i10;
                                                }
                                            } catch (Exception unused2) {
                                                i10 = ceil;
                                            }
                                            i24++;
                                            ceil = i10;
                                        }
                                    }
                                    int i232 = ceil;
                                    if (lineCount2 > 1) {
                                        staticLayout = makeStaticLayout;
                                        int i25 = i232;
                                        int i26 = 0;
                                        float f8 = 0.0f;
                                        float f9 = 0.0f;
                                        boolean z10 = false;
                                        int i27 = ceil42;
                                        CharSequence charSequence8 = charSequence7;
                                        while (i26 < lineCount2) {
                                            int i28 = lineCount2;
                                            try {
                                                f2 = textLayoutBlock.textLayout.getLineWidth(i26);
                                                arrayList3 = arrayList;
                                            } catch (Exception unused3) {
                                                arrayList3 = arrayList;
                                                f2 = 0.0f;
                                            }
                                            if (textLayoutBlock.quote) {
                                                charSequence3 = charSequence8;
                                                dp5 = AndroidUtilities.dp(32.0f);
                                            } else {
                                                charSequence3 = charSequence8;
                                                if (textLayoutBlock.code) {
                                                    dp5 = AndroidUtilities.dp(15.0f);
                                                }
                                                f3 = textLayoutBlock.textLayout.getLineLeft(i26);
                                                if (f2 > i + 20) {
                                                    f2 = i;
                                                    f3 = 0.0f;
                                                }
                                                if (f3 > 0.0f) {
                                                    i8 = i;
                                                    if (textLayoutBlock.textLayout.getParagraphDirection(i26) != -1) {
                                                        textLayoutBlock.directionFlags = (byte) (textLayoutBlock.directionFlags | 2);
                                                        i9 = 1;
                                                        if (z10 && f3 == 0.0f) {
                                                            try {
                                                                if (textLayoutBlock.textLayout.getParagraphDirection(i26) != i9) {
                                                                }
                                                            } catch (Exception unused4) {
                                                            }
                                                            z10 = true;
                                                        }
                                                        f8 = Math.max(f8, f2);
                                                        float f10 = f3 + f2;
                                                        f9 = Math.max(f9, f10);
                                                        i25 = Math.max(i25, (int) Math.ceil(f2));
                                                        i27 = Math.max(i27, (int) Math.ceil(f10));
                                                        i26++;
                                                        lineCount2 = i28;
                                                        arrayList = arrayList3;
                                                        charSequence8 = charSequence3;
                                                        i = i8;
                                                    }
                                                } else {
                                                    i8 = i;
                                                }
                                                this.textXOffset = Math.min(this.textXOffset, f3);
                                                i9 = 1;
                                                textLayoutBlock.directionFlags = (byte) (textLayoutBlock.directionFlags | 1);
                                                this.hasRtl = true;
                                                if (z10) {
                                                    if (textLayoutBlock.textLayout.getParagraphDirection(i26) != i9) {
                                                    }
                                                    z10 = true;
                                                }
                                                f8 = Math.max(f8, f2);
                                                float f102 = f3 + f2;
                                                f9 = Math.max(f9, f102);
                                                i25 = Math.max(i25, (int) Math.ceil(f2));
                                                i27 = Math.max(i27, (int) Math.ceil(f102));
                                                i26++;
                                                lineCount2 = i28;
                                                arrayList = arrayList3;
                                                charSequence8 = charSequence3;
                                                i = i8;
                                            }
                                            f2 += dp5;
                                            f3 = textLayoutBlock.textLayout.getLineLeft(i26);
                                            if (f2 > i + 20) {
                                            }
                                            if (f3 > 0.0f) {
                                            }
                                            this.textXOffset = Math.min(this.textXOffset, f3);
                                            i9 = 1;
                                            textLayoutBlock.directionFlags = (byte) (textLayoutBlock.directionFlags | 1);
                                            this.hasRtl = true;
                                            if (z10) {
                                            }
                                            f8 = Math.max(f8, f2);
                                            float f1022 = f3 + f2;
                                            f9 = Math.max(f9, f1022);
                                            i25 = Math.max(i25, (int) Math.ceil(f2));
                                            i27 = Math.max(i27, (int) Math.ceil(f1022));
                                            i26++;
                                            lineCount2 = i28;
                                            arrayList = arrayList3;
                                            charSequence8 = charSequence3;
                                            i = i8;
                                        }
                                        int i29 = i;
                                        arrayList2 = arrayList;
                                        charSequence2 = charSequence8;
                                        if (z10) {
                                            if (i4 == i5) {
                                                this.lastLineWidth = ceil42;
                                            }
                                            f8 = f9;
                                        } else if (i4 == i5) {
                                            this.lastLineWidth = i25;
                                        }
                                        this.textWidth = Math.max(this.textWidth, (int) Math.ceil(f8));
                                        ceil42 = i27;
                                        i = i29;
                                    } else {
                                        int i30 = i;
                                        staticLayout = makeStaticLayout;
                                        arrayList2 = arrayList;
                                        charSequence2 = charSequence7;
                                        if (f > 0.0f) {
                                            float min = Math.min(this.textXOffset, f);
                                            this.textXOffset = min;
                                            i6 = min == 0.0f ? (int) (f72 + f) : i232;
                                            this.hasRtl = size != 1;
                                            textLayoutBlock.directionFlags = (byte) (textLayoutBlock.directionFlags | 1);
                                        } else {
                                            textLayoutBlock.directionFlags = (byte) (textLayoutBlock.directionFlags | 2);
                                            i6 = i232;
                                        }
                                        i = i30;
                                        this.textWidth = Math.max(this.textWidth, Math.min(i, i6));
                                    }
                                    text = textLayoutBlock.languageLayout;
                                    if (text != null) {
                                        this.textWidth = (int) Math.max(this.textWidth, Math.min(text.getCurrentWidth() + AndroidUtilities.dp(15.0f), textLayoutBlock.textLayout == null ? 0.0f : r8.getWidth()));
                                    }
                                    textLayoutBlock.spoilers.clear();
                                    if (this.isSpoilersRevealed && !this.spoiledLoginCode) {
                                        if (textLayoutBlock.quote) {
                                            i7 = ceil42 - AndroidUtilities.dp(32.0f);
                                        } else {
                                            if (textLayoutBlock.code) {
                                                ceil42 -= AndroidUtilities.dp(15.0f);
                                            }
                                            i7 = ceil42;
                                        }
                                        SpoilerEffect.addSpoilers(null, textLayoutBlock.textLayout, -1, i7, null, textLayoutBlock.spoilers);
                                    }
                                    i17 = i222;
                                    makeStaticLayout = staticLayout;
                                    i4++;
                                    z6 = z4;
                                    textPaint = textPaint3;
                                    arrayList = arrayList2;
                                    charSequence7 = charSequence2;
                                }
                                f62 += dp4;
                                ceil = (int) Math.ceil(f62);
                                if (ceil > i + 80) {
                                }
                                i5 = size - 1;
                                if (i4 == i5) {
                                }
                                float f722 = ceil;
                                int i2222 = i17;
                                z4 = z6;
                                textPaint3 = textPaint;
                                int ceil422 = (int) Math.ceil(f722 + Math.max(0.0f, f));
                                if (textLayoutBlock.quote) {
                                }
                                int i2322 = ceil;
                                if (lineCount2 > 1) {
                                }
                                text = textLayoutBlock.languageLayout;
                                if (text != null) {
                                }
                                textLayoutBlock.spoilers.clear();
                                if (this.isSpoilersRevealed) {
                                }
                                i17 = i2222;
                                makeStaticLayout = staticLayout;
                                i4++;
                                z6 = z4;
                                textPaint = textPaint3;
                                arrayList = arrayList2;
                                charSequence7 = charSequence2;
                            }
                            if (this.hasCode) {
                                if (this.textWidth > this.generatedWithMinSize - AndroidUtilities.dp(80 + ((!needDrawAvatarInternal() || isOutOwner() || this.messageOwner.isThreadMessage) ? 0 : 52))) {
                                    z3 = true;
                                    this.hasWideCode = z3;
                                    this.factCheckText = null;
                                    return;
                                }
                            }
                            z3 = false;
                            this.hasWideCode = z3;
                            this.factCheckText = null;
                            return;
                        }
                        int i31 = 0;
                        int i32 = 0;
                        while (i32 < ceil3) {
                            int min2 = z ? lineCount : Math.min(i16, lineCount - i31);
                            int lineStart2 = makeStaticLayout.getLineStart(i31);
                            int i33 = min2 + i31;
                            int i34 = maxMessageTextWidth;
                            int lineEnd2 = makeStaticLayout.getLineEnd(i33 - 1);
                            int i35 = i31;
                            int i36 = lineEnd2 - 1;
                            if (i36 >= 0) {
                                i3 = lineCount;
                                if (i36 < makeStaticLayout.getText().length()) {
                                    if (makeStaticLayout.getText().charAt(i36) == '\n') {
                                        lineEnd2--;
                                    }
                                    if (lineEnd2 >= lineStart2) {
                                        i31 = i35;
                                    } else {
                                        arrayList.add(new TextRange(lineStart2, lineEnd2));
                                        i31 = i33;
                                    }
                                    i32++;
                                    maxMessageTextWidth = i34;
                                    lineCount = i3;
                                }
                            } else {
                                i3 = lineCount;
                            }
                            if (lineEnd2 >= lineStart2) {
                            }
                            i32++;
                            maxMessageTextWidth = i34;
                            lineCount = i3;
                        }
                    }
                    i2 = maxMessageTextWidth;
                    z2 = false;
                    int size2 = arrayList.size();
                    this.hasCodeAtTop = z2;
                    this.hasCodeAtBottom = z2;
                    this.hasQuoteAtBottom = z2;
                    this.hasSingleQuote = z2;
                    this.hasSingleCode = z2;
                    int i172 = i2;
                    i4 = 0;
                    CharSequence charSequence72 = charSequence;
                    while (i4 < arrayList.size()) {
                    }
                    if (this.hasCode) {
                    }
                    z3 = false;
                    this.hasWideCode = z3;
                    this.factCheckText = null;
                    return;
                }
                i = dp2 + maxMessageTextWidth;
                int lineCount3 = makeStaticLayout.getLineCount();
                int i152 = this.totalAnimatedEmojiCount;
                if (i152 >= 50) {
                }
                if (Build.VERSION.SDK_INT < 24) {
                }
                if (z) {
                }
                arrayList = new ArrayList();
                if (!(charSequence instanceof Spanned)) {
                }
                if (z) {
                }
                i2 = maxMessageTextWidth;
                z2 = false;
                arrayList.add(new TextRange(0, makeStaticLayout.getText().length()));
                int size22 = arrayList.size();
                this.hasCodeAtTop = z2;
                this.hasCodeAtBottom = z2;
                this.hasQuoteAtBottom = z2;
                this.hasSingleQuote = z2;
                this.hasSingleCode = z2;
                int i1722 = i2;
                i4 = 0;
                CharSequence charSequence722 = charSequence;
                while (i4 < arrayList.size()) {
                }
                if (this.hasCode) {
                }
                z3 = false;
                this.hasWideCode = z3;
                this.factCheckText = null;
                return;
            }
            StaticLayout makeStaticLayout3 = makeStaticLayout(charSequence6, textPaint, maxMessageTextWidth, 1.0f, this.totalAnimatedEmojiCount < 4 ? -1.0f : 0.0f, this.emojiOnlyCount <= 0);
            charSequence = charSequence6;
            if (this.isRepostPreview) {
            }
            if (!this.hasSingleQuote) {
            }
            i = dp2 + maxMessageTextWidth;
            int lineCount32 = makeStaticLayout3.getLineCount();
            int i1522 = this.totalAnimatedEmojiCount;
            if (i1522 >= 50) {
            }
            if (Build.VERSION.SDK_INT < 24) {
            }
            if (z) {
            }
            arrayList = new ArrayList();
            if (!(charSequence instanceof Spanned)) {
            }
            if (z) {
            }
            i2 = maxMessageTextWidth;
            z2 = false;
            arrayList.add(new TextRange(0, makeStaticLayout3.getText().length()));
            int size222 = arrayList.size();
            this.hasCodeAtTop = z2;
            this.hasCodeAtBottom = z2;
            this.hasQuoteAtBottom = z2;
            this.hasSingleQuote = z2;
            this.hasSingleCode = z2;
            int i17222 = i2;
            i4 = 0;
            CharSequence charSequence7222 = charSequence;
            while (i4 < arrayList.size()) {
            }
            if (this.hasCode) {
            }
            z3 = false;
            this.hasWideCode = z3;
            this.factCheckText = null;
            return;
        } catch (Exception e4) {
            FileLog.e(e4);
            return;
        }
        maxMessageTextWidth -= dp;
        if (!(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame)) {
        }
        CharSequence charSequence62 = this.messageText;
    }

    public int textHeightCached() {
        Integer num = this.cachedTextHeight;
        if (num != null) {
            return num.intValue();
        }
        if (this.textLayoutBlocks == null) {
            this.cachedTextHeight = 0;
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.textLayoutBlocks.size(); i2++) {
            i += this.textLayoutBlocks.get(i2).padTop + this.textLayoutBlocks.get(i2).heightCollapsed() + this.textLayoutBlocks.get(i2).padBottom;
        }
        this.cachedTextHeight = Integer.valueOf(i);
        return i;
    }

    public int textHeight() {
        if (this.textLayoutBlocks == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.textLayoutBlocks.size(); i2++) {
            i += this.textLayoutBlocks.get(i2).padTop + this.textLayoutBlocks.get(i2).height() + this.textLayoutBlocks.get(i2).padBottom;
        }
        return i;
    }

    public int textHeight(ChatMessageCell.TransitionParams transitionParams) {
        if (this.textLayoutBlocks == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.textLayoutBlocks.size(); i2++) {
            i += this.textLayoutBlocks.get(i2).padTop + this.textLayoutBlocks.get(i2).height(transitionParams) + this.textLayoutBlocks.get(i2).padBottom;
        }
        return i;
    }

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

        public int textHeight() {
            int i = 0;
            for (int i2 = 0; i2 < this.textLayoutBlocks.size(); i2++) {
                i += this.textLayoutBlocks.get(i2).padTop + this.textLayoutBlocks.get(i2).height() + this.textLayoutBlocks.get(i2).padBottom;
            }
            return i;
        }

        public int textHeight(ChatMessageCell.TransitionParams transitionParams) {
            int i = 0;
            for (int i2 = 0; i2 < this.textLayoutBlocks.size(); i2++) {
                i += this.textLayoutBlocks.get(i2).padTop + this.textLayoutBlocks.get(i2).height(transitionParams) + this.textLayoutBlocks.get(i2).padBottom;
            }
            return i;
        }

        public void bounceFrom(TextLayoutBlocks textLayoutBlocks) {
            if (textLayoutBlocks == null) {
                return;
            }
            for (int i = 0; i < Math.min(this.textLayoutBlocks.size(), textLayoutBlocks.textLayoutBlocks.size()); i++) {
                this.textLayoutBlocks.get(i).collapsedBounce = textLayoutBlocks.textLayoutBlocks.get(i).collapsedBounce;
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(14:206|(3:207|208|209)|210|(1:212)(11:241|(1:243)|214|215|216|(1:218)|219|(2:221|(3:223|(5:226|227|(1:232)|229|230)|231))(1:238)|237|(1:236)(5:226|227|(0)|229|230)|231)|213|214|215|216|(0)|219|(0)(0)|237|(0)(0)|231) */
        /* JADX WARN: Can't wrap try/catch for region: R(43:113|(1:115)|116|(1:118)(1:350)|119|(1:121)(1:349)|122|(1:124)|(1:126)|(1:348)(1:131)|132|(2:134|(2:(1:331)|332)(1:137))(2:333|(7:335|(1:337)(1:347)|338|(1:340)(1:346)|341|(1:343)(1:345)|344))|138|(3:140|(1:142)(2:325|(1:327)(1:328))|143)(1:329)|144|(1:146)(1:(1:323)(1:324))|147|(3:149|(1:302)(4:155|(1:157)(1:301)|158|159)|160)(3:303|(2:305|306)(6:307|308|309|(1:316)(1:313)|314|315)|272)|161|(1:167)|168|169|170|(1:174)|175|176|177|178|(1:180)|181|(1:183)|184|(3:186|(7:188|189|190|191|192|194|195)|201)|202|(6:204|(16:206|207|208|209|210|(1:212)(11:241|(1:243)|214|215|216|(1:218)|219|(2:221|(3:223|(5:226|227|(1:232)|229|230)|231))(1:238)|237|(1:236)(5:226|227|(0)|229|230)|231)|213|214|215|216|(0)|219|(0)(0)|237|(0)(0)|231)|246|247|(2:(1:250)|251)(1:(1:279))|252)(3:280|(5:282|(1:284)(1:291)|285|(1:287)(1:290)|288)(1:292)|289)|253|(3:255|(1:257)(1:259)|258)|260|(1:277)(3:266|(1:268)(3:273|(1:275)|276)|269)|270|271|272|111) */
        /* JADX WARN: Code restructure failed: missing block: B:240:0x0549, code lost:
        
            r2 = 0.0f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:294:0x04b9, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:295:0x04ba, code lost:
        
            org.telegram.messenger.FileLog.e(r0);
            r0 = 0.0f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:297:0x04a3, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:298:0x04a7, code lost:
        
            if (r8 == 0) goto L241;
         */
        /* JADX WARN: Code restructure failed: missing block: B:299:0x04a9, code lost:
        
            r31.textXOffset = 0.0f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:300:0x04ac, code lost:
        
            org.telegram.messenger.FileLog.e(r0);
            r12 = 0.0f;
         */
        /* JADX WARN: Removed duplicated region for block: B:102:0x01f0  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0262  */
        /* JADX WARN: Removed duplicated region for block: B:218:0x0552  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x0559  */
        /* JADX WARN: Removed duplicated region for block: B:225:0x0583 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:232:0x058e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:236:0x058e A[ADDED_TO_REGION, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:238:0x056e  */
        /* JADX WARN: Removed duplicated region for block: B:366:0x01f2  */
        /* JADX WARN: Removed duplicated region for block: B:367:0x01eb  */
        /* JADX WARN: Removed duplicated region for block: B:368:0x01d0  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01c9  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01e9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public TextLayoutBlocks(MessageObject messageObject, CharSequence charSequence, TextPaint textPaint, int i) {
            int i2;
            int dp;
            StaticLayout staticLayout;
            CharSequence charSequence2;
            int dp2;
            boolean z;
            ArrayList arrayList;
            int i3;
            TextPaint textPaint2;
            int dp3;
            CharSequence charSequence3;
            int i4;
            ArrayList arrayList2;
            boolean z2;
            MessageObject messageObject2;
            SpannableString valueOf;
            int i5;
            int dp4;
            boolean z3;
            float f;
            float f2;
            int i6;
            int i7;
            float dp5;
            int i8;
            SpannableString spannableString;
            TextPaint textPaint3;
            int i9;
            TLRPC.Message message;
            MessageObject messageObject3 = messageObject;
            CharSequence charSequence4 = charSequence;
            this.text = charSequence4;
            this.textWidth = 0;
            boolean z4 = (messageObject3 == null || (message = messageObject3.messageOwner) == null || !message.noforwards) ? false : true;
            if (messageObject3 != null && !z4) {
                z4 = MessagesController.getInstance(messageObject3.currentAccount).isPeerNoForwards(messageObject.getDialogId());
            }
            boolean z5 = z4;
            boolean z6 = charSequence4 instanceof Spanned;
            this.hasCode = z6 && ((CodeHighlighting.Span[]) ((Spanned) charSequence4).getSpans(0, charSequence.length(), CodeHighlighting.Span.class)).length > 0;
            this.hasQuote = z6 && ((QuoteSpan.QuoteStyleSpan[]) ((Spanned) charSequence4).getSpans(0, charSequence.length(), QuoteSpan.QuoteStyleSpan.class)).length > 0;
            this.hasSingleQuote = false;
            this.hasSingleCode = false;
            if (z6) {
                Spanned spanned = (Spanned) charSequence4;
                QuoteSpan[] quoteSpanArr = (QuoteSpan[]) spanned.getSpans(0, spanned.length(), QuoteSpan.class);
                for (QuoteSpan quoteSpan : quoteSpanArr) {
                    quoteSpan.adaptLineHeight = false;
                }
                this.hasSingleQuote = quoteSpanArr.length == 1 && spanned.getSpanStart(quoteSpanArr[0]) == 0 && spanned.getSpanEnd(quoteSpanArr[0]) == spanned.length();
                CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) spanned.getSpans(0, spanned.length(), CodeHighlighting.Span.class);
                this.hasSingleCode = spanArr.length == 1 && spanned.getSpanStart(spanArr[0]) == 0 && spanned.getSpanEnd(spanArr[0]) == spanned.length();
            }
            float f3 = 32.0f;
            try {
                if (this.hasSingleQuote) {
                    dp = AndroidUtilities.dp(32.0f);
                } else if (this.hasSingleCode) {
                    dp = AndroidUtilities.dp(15.0f);
                } else {
                    i2 = i;
                    StaticLayout makeStaticLayout = MessageObject.makeStaticLayout(charSequence, textPaint, i2, 1.0f, 0.0f, false);
                    CharSequence charSequence5 = charSequence4;
                    if (messageObject3 != null) {
                        charSequence5 = charSequence4;
                        if (messageObject3.isRepostPreview) {
                            if (messageObject3.type != 0) {
                                i9 = messageObject.hasValidGroupId() ? 7 : 12;
                            } else {
                                i9 = 22;
                            }
                            i9 = messageObject.isWebpage() ? i9 - 8 : i9;
                            charSequence5 = charSequence4;
                            if (makeStaticLayout.getLineCount() > i9) {
                                String string = LocaleController.getString(R.string.ReadMore);
                                int ceil = (int) Math.ceil(textPaint.measureText("… " + string) + AndroidUtilities.dp(1.0f));
                                float f4 = 0.0f;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    f4 = Math.max(f4, makeStaticLayout.getLineRight(i10));
                                }
                                int i11 = i9 - 1;
                                int lineStart = makeStaticLayout.getLineStart(i11);
                                int lineEnd = makeStaticLayout.getLineEnd(i11) - 1;
                                while (lineEnd >= lineStart && makeStaticLayout.getPrimaryHorizontal(lineEnd) >= f4 - ceil) {
                                    lineEnd--;
                                }
                                while (lineEnd >= lineStart && !Character.isWhitespace(charSequence4.charAt(lineEnd))) {
                                    lineEnd--;
                                }
                                SpannableStringBuilder append = new SpannableStringBuilder(charSequence4.subSequence(0, lineEnd)).append((CharSequence) "… ").append((CharSequence) string);
                                append.setSpan(new CharacterStyle() { // from class: org.telegram.messenger.MessageObject.TextLayoutBlocks.1
                                    @Override // android.text.style.CharacterStyle
                                    public void updateDrawState(TextPaint textPaint4) {
                                        textPaint4.setColor(Theme.chat_msgTextPaint.linkColor);
                                    }
                                }, append.length() - string.length(), append.length(), 33);
                                try {
                                    makeStaticLayout = MessageObject.makeStaticLayout(append, textPaint, i2, 1.0f, 0.0f, false);
                                    charSequence5 = append;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                        }
                    }
                    staticLayout = makeStaticLayout;
                    charSequence2 = charSequence5;
                    if (!this.hasSingleQuote) {
                        dp2 = i2 + AndroidUtilities.dp(32.0f);
                    } else {
                        dp2 = this.hasSingleCode ? i2 + AndroidUtilities.dp(15.0f) : i2;
                    }
                    int lineCount = staticLayout.getLineCount();
                    z = Build.VERSION.SDK_INT < 24;
                    int i12 = 10;
                    int ceil2 = !z ? 1 : (int) Math.ceil(lineCount / 10);
                    arrayList = new ArrayList();
                    if (!(charSequence2 instanceof Spanned) && (this.hasQuote || this.hasCode)) {
                        MessageObject.cutIntoRanges(charSequence2, arrayList);
                    } else if (!z || ceil2 == 1) {
                        arrayList.add(new TextRange(0, staticLayout.getText().length()));
                    } else {
                        int i13 = 0;
                        int i14 = 0;
                        while (i13 < ceil2) {
                            int min = Math.min(i12, lineCount - i14);
                            int lineStart2 = staticLayout.getLineStart(i14);
                            int i15 = min + i14;
                            int lineEnd2 = staticLayout.getLineEnd(i15 - 1);
                            if (lineEnd2 >= lineStart2) {
                                arrayList.add(new TextRange(lineStart2, lineEnd2));
                                i14 = i15;
                            }
                            i13++;
                            i12 = 10;
                        }
                    }
                    int size = arrayList.size();
                    this.hasCodeAtTop = false;
                    this.hasCodeAtBottom = false;
                    this.hasQuoteAtBottom = false;
                    this.hasSingleQuote = false;
                    StaticLayout staticLayout2 = staticLayout;
                    int i16 = i2;
                    i3 = 0;
                    while (i3 < arrayList.size()) {
                        TextLayoutBlock textLayoutBlock = new TextLayoutBlock();
                        TextRange textRange = (TextRange) arrayList.get(i3);
                        textLayoutBlock.code = textRange.code;
                        textLayoutBlock.quote = textRange.quote;
                        boolean z7 = textRange.collapse;
                        textLayoutBlock.quoteCollapse = z7;
                        if (z7) {
                            textLayoutBlock.messageObject = messageObject3;
                        }
                        textLayoutBlock.index = i3;
                        textLayoutBlock.start = textRange.start;
                        textLayoutBlock.first = i3 == 0;
                        boolean z8 = i3 == arrayList.size() - 1;
                        textLayoutBlock.last = z8;
                        boolean z9 = textLayoutBlock.first;
                        if (z9) {
                            this.hasCodeAtTop = textLayoutBlock.code;
                        }
                        if (z8) {
                            this.hasQuoteAtBottom = textLayoutBlock.quote;
                            this.hasCodeAtBottom = textLayoutBlock.code;
                        }
                        this.hasSingleQuote = z9 && z8 && textLayoutBlock.quote;
                        if (textLayoutBlock.quote) {
                            if (z9 && z8) {
                                int dp6 = AndroidUtilities.dp(6.0f);
                                textLayoutBlock.padBottom = dp6;
                                textLayoutBlock.padTop = dp6;
                            } else {
                                textLayoutBlock.padTop = AndroidUtilities.dp(z9 ? 8.0f : 6.0f);
                                textLayoutBlock.padBottom = AndroidUtilities.dp(7.0f);
                            }
                        } else if (textLayoutBlock.code) {
                            textLayoutBlock.layoutCode(textRange.language, textRange.end - textRange.start, z5);
                            textLayoutBlock.padTop = AndroidUtilities.dp(4.0f) + textLayoutBlock.languageHeight + (textLayoutBlock.first ? 0 : AndroidUtilities.dp(5.0f));
                            textLayoutBlock.padBottom = AndroidUtilities.dp(4.0f) + (textLayoutBlock.last ? 0 : AndroidUtilities.dp(7.0f)) + (textLayoutBlock.hasCodeCopyButton ? AndroidUtilities.dp(38.0f) : 0);
                        }
                        boolean z10 = textLayoutBlock.code;
                        if (z10) {
                            int i17 = textRange.end - textRange.start;
                            if (i17 > 220) {
                                textPaint3 = Theme.chat_msgTextCode3Paint;
                            } else if (i17 > 80) {
                                textPaint3 = Theme.chat_msgTextCode2Paint;
                            } else {
                                textPaint3 = Theme.chat_msgTextCodePaint;
                            }
                            textPaint2 = textPaint3;
                        } else {
                            textPaint2 = textPaint;
                        }
                        if (textLayoutBlock.quote) {
                            dp3 = dp2 - AndroidUtilities.dp(f3);
                        } else {
                            dp3 = z10 ? dp2 - AndroidUtilities.dp(15.0f) : dp2;
                        }
                        if (size == 1) {
                            if (textLayoutBlock.code && !textLayoutBlock.quote && (staticLayout2.getText() instanceof Spannable)) {
                                if (!TextUtils.isEmpty(textRange.language)) {
                                    spannableString = CodeHighlighting.getHighlighted(charSequence2.subSequence(textRange.start, textRange.end).toString(), textRange.language);
                                } else {
                                    spannableString = new SpannableString(charSequence2.subSequence(textRange.start, textRange.end));
                                }
                                SpannableString spannableString2 = spannableString;
                                textLayoutBlock.originalWidth = dp3;
                                staticLayout2 = MessageObject.makeStaticLayout(spannableString2, textPaint2, dp3, 1.0f, 0.0f, false);
                                i16 = dp3;
                            } else {
                                textLayoutBlock.originalWidth = i16;
                            }
                            textLayoutBlock.textLayout = staticLayout2;
                            textLayoutBlock.charactersOffset = 0;
                            textLayoutBlock.charactersEnd = staticLayout2.getText().length();
                            textLayoutBlock.height = staticLayout2.getHeight();
                            textLayoutBlock.collapsedHeight = (int) Math.min(textPaint.getTextSize() * 1.4f * 3.0f, textLayoutBlock.height);
                        } else {
                            int i18 = textRange.start;
                            int i19 = textRange.end;
                            if (i19 < i18) {
                                charSequence3 = charSequence2;
                                i4 = dp2;
                                arrayList2 = arrayList;
                                z2 = z5;
                                messageObject2 = messageObject3;
                            } else {
                                textLayoutBlock.charactersOffset = i18;
                                textLayoutBlock.charactersEnd = i19;
                                try {
                                    if (textLayoutBlock.code && !textLayoutBlock.quote) {
                                        valueOf = CodeHighlighting.getHighlighted(charSequence2.subSequence(i18, i19).toString(), textRange.language);
                                    } else {
                                        valueOf = SpannableString.valueOf(charSequence2.subSequence(i18, i19));
                                    }
                                    SpannableString spannableString3 = valueOf;
                                    textLayoutBlock.originalWidth = dp3;
                                    StaticLayout makeStaticLayout2 = MessageObject.makeStaticLayout(spannableString3, textPaint2, dp3, 1.0f, 0.0f, false);
                                    textLayoutBlock.textLayout = makeStaticLayout2;
                                    textLayoutBlock.height = makeStaticLayout2.getHeight();
                                    textLayoutBlock.collapsedHeight = (int) Math.min(textPaint.getTextSize() * 1.4f * 3.0f, textLayoutBlock.height);
                                } catch (Exception e2) {
                                    charSequence3 = charSequence2;
                                    i4 = dp2;
                                    arrayList2 = arrayList;
                                    z2 = z5;
                                    messageObject2 = messageObject3;
                                    FileLog.e(e2);
                                }
                            }
                            i3++;
                            dp2 = i4;
                            messageObject3 = messageObject2;
                            charSequence2 = charSequence3;
                            arrayList = arrayList2;
                            z5 = z2;
                            f3 = 32.0f;
                        }
                        if (textLayoutBlock.code && (textLayoutBlock.textLayout.getText() instanceof Spannable) && TextUtils.isEmpty(textRange.language)) {
                            CodeHighlighting.highlight((Spannable) textLayoutBlock.textLayout.getText(), 0, textLayoutBlock.textLayout.getText().length(), textRange.language, 0, null, true);
                        }
                        this.textLayoutBlocks.add(textLayoutBlock);
                        int lineCount2 = textLayoutBlock.textLayout.getLineCount();
                        float lineLeft = textLayoutBlock.textLayout.getLineLeft(lineCount2 - 1);
                        if (i3 == 0 && lineLeft >= 0.0f) {
                            this.textXOffset = lineLeft;
                        }
                        float f5 = lineLeft;
                        float f6 = textLayoutBlock.textLayout.getLineWidth(lineCount2 - 1);
                        int ceil3 = (int) Math.ceil(f6);
                        ceil3 = ceil3 > dp2 + 80 ? dp2 : ceil3;
                        int i20 = size - 1;
                        if (i3 == i20) {
                            this.lastLineWidth = ceil3;
                        }
                        float f7 = ceil3;
                        charSequence3 = charSequence2;
                        StaticLayout staticLayout3 = staticLayout2;
                        int i21 = i16;
                        int ceil4 = (int) Math.ceil(f7 + Math.max(0.0f, f5));
                        if (textLayoutBlock.quote) {
                            textLayoutBlock.maxRight = 0.0f;
                            int i22 = 0;
                            while (i22 < lineCount2) {
                                try {
                                    i8 = ceil3;
                                    try {
                                        textLayoutBlock.maxRight = Math.max(textLayoutBlock.maxRight, textLayoutBlock.textLayout.getLineRight(i22));
                                    } catch (Exception unused) {
                                        textLayoutBlock.maxRight = this.textWidth;
                                        i22++;
                                        ceil3 = i8;
                                    }
                                } catch (Exception unused2) {
                                    i8 = ceil3;
                                }
                                i22++;
                                ceil3 = i8;
                            }
                        }
                        int i23 = ceil3;
                        if (lineCount2 > 1) {
                            arrayList2 = arrayList;
                            int i24 = i23;
                            boolean z11 = false;
                            float f8 = 0.0f;
                            float f9 = 0.0f;
                            int i25 = 0;
                            int i26 = ceil4;
                            while (i25 < lineCount2) {
                                int i27 = lineCount2;
                                try {
                                    f = textLayoutBlock.textLayout.getLineWidth(i25);
                                    z3 = z5;
                                } catch (Exception unused3) {
                                    z3 = z5;
                                    f = 0.0f;
                                }
                                if (textLayoutBlock.quote) {
                                    dp5 = AndroidUtilities.dp(32.0f);
                                } else {
                                    dp5 = textLayoutBlock.code ? AndroidUtilities.dp(15.0f) : dp5;
                                    f2 = textLayoutBlock.textLayout.getLineLeft(i25);
                                    if (f > dp2 + 20) {
                                        f = dp2;
                                        f2 = 0.0f;
                                    }
                                    if (f2 > 0.0f) {
                                        i6 = dp2;
                                        if (textLayoutBlock.textLayout.getParagraphDirection(i25) != -1) {
                                            textLayoutBlock.directionFlags = (byte) (textLayoutBlock.directionFlags | 2);
                                            i7 = 1;
                                            if (z11 && f2 == 0.0f) {
                                                try {
                                                    if (textLayoutBlock.textLayout.getParagraphDirection(i25) != i7) {
                                                    }
                                                } catch (Exception unused4) {
                                                }
                                                z11 = true;
                                            }
                                            f9 = Math.max(f9, f);
                                            float f10 = f2 + f;
                                            float max = Math.max(f8, f10);
                                            i24 = Math.max(i24, (int) Math.ceil(f));
                                            i26 = Math.max(i26, (int) Math.ceil(f10));
                                            i25++;
                                            z11 = z11;
                                            f8 = max;
                                            lineCount2 = i27;
                                            z5 = z3;
                                            dp2 = i6;
                                        }
                                    } else {
                                        i6 = dp2;
                                    }
                                    this.textXOffset = Math.min(this.textXOffset, f2);
                                    i7 = 1;
                                    textLayoutBlock.directionFlags = (byte) (textLayoutBlock.directionFlags | 1);
                                    this.hasRtl = true;
                                    if (z11) {
                                        if (textLayoutBlock.textLayout.getParagraphDirection(i25) != i7) {
                                        }
                                        z11 = true;
                                    }
                                    f9 = Math.max(f9, f);
                                    float f102 = f2 + f;
                                    float max2 = Math.max(f8, f102);
                                    i24 = Math.max(i24, (int) Math.ceil(f));
                                    i26 = Math.max(i26, (int) Math.ceil(f102));
                                    i25++;
                                    z11 = z11;
                                    f8 = max2;
                                    lineCount2 = i27;
                                    z5 = z3;
                                    dp2 = i6;
                                }
                                f += dp5;
                                f2 = textLayoutBlock.textLayout.getLineLeft(i25);
                                if (f > dp2 + 20) {
                                }
                                if (f2 > 0.0f) {
                                }
                                this.textXOffset = Math.min(this.textXOffset, f2);
                                i7 = 1;
                                textLayoutBlock.directionFlags = (byte) (textLayoutBlock.directionFlags | 1);
                                this.hasRtl = true;
                                if (z11) {
                                }
                                f9 = Math.max(f9, f);
                                float f1022 = f2 + f;
                                float max22 = Math.max(f8, f1022);
                                i24 = Math.max(i24, (int) Math.ceil(f));
                                i26 = Math.max(i26, (int) Math.ceil(f1022));
                                i25++;
                                z11 = z11;
                                f8 = max22;
                                lineCount2 = i27;
                                z5 = z3;
                                dp2 = i6;
                            }
                            int i28 = dp2;
                            z2 = z5;
                            if (z11) {
                                if (i3 == i20) {
                                    this.lastLineWidth = ceil4;
                                }
                                f9 = f8;
                            } else if (i3 == i20) {
                                this.lastLineWidth = i24;
                            }
                            this.textWidth = Math.max(this.textWidth, (int) Math.ceil(f9));
                            ceil4 = i26;
                            i4 = i28;
                        } else {
                            int i29 = dp2;
                            arrayList2 = arrayList;
                            z2 = z5;
                            if (f5 > 0.0f) {
                                float min2 = Math.min(this.textXOffset, f5);
                                this.textXOffset = min2;
                                i5 = min2 == 0.0f ? (int) (f7 + f5) : i23;
                                this.hasRtl = size != 1;
                                textLayoutBlock.directionFlags = (byte) (textLayoutBlock.directionFlags | 1);
                            } else {
                                textLayoutBlock.directionFlags = (byte) (textLayoutBlock.directionFlags | 2);
                                i5 = i23;
                            }
                            i4 = i29;
                            this.textWidth = Math.max(this.textWidth, Math.min(i4, i5));
                        }
                        Text text = textLayoutBlock.languageLayout;
                        if (text != null) {
                            this.textWidth = (int) Math.max(this.textWidth, Math.min(text.getCurrentWidth() + AndroidUtilities.dp(15.0f), textLayoutBlock.textLayout == null ? 0.0f : r7.getWidth()));
                        }
                        messageObject2 = messageObject;
                        if (messageObject2 != null && !messageObject2.isSpoilersRevealed && !messageObject.spoiledLoginCode) {
                            if (textLayoutBlock.quote) {
                                dp4 = ceil4 - AndroidUtilities.dp(32.0f);
                            } else {
                                dp4 = textLayoutBlock.code ? ceil4 - AndroidUtilities.dp(15.0f) : ceil4;
                            }
                            SpoilerEffect.addSpoilers(null, textLayoutBlock.textLayout, -1, dp4, null, textLayoutBlock.spoilers);
                        }
                        staticLayout2 = staticLayout3;
                        i16 = i21;
                        i3++;
                        dp2 = i4;
                        messageObject3 = messageObject2;
                        charSequence2 = charSequence3;
                        arrayList = arrayList2;
                        z5 = z2;
                        f3 = 32.0f;
                    }
                    return;
                }
                StaticLayout makeStaticLayout3 = MessageObject.makeStaticLayout(charSequence, textPaint, i2, 1.0f, 0.0f, false);
                CharSequence charSequence52 = charSequence4;
                if (messageObject3 != null) {
                }
                staticLayout = makeStaticLayout3;
                charSequence2 = charSequence52;
                if (!this.hasSingleQuote) {
                }
                int lineCount3 = staticLayout.getLineCount();
                if (Build.VERSION.SDK_INT < 24) {
                }
                int i122 = 10;
                if (!z) {
                }
                arrayList = new ArrayList();
                if (!(charSequence2 instanceof Spanned)) {
                }
                if (z) {
                }
                arrayList.add(new TextRange(0, staticLayout.getText().length()));
                int size2 = arrayList.size();
                this.hasCodeAtTop = false;
                this.hasCodeAtBottom = false;
                this.hasQuoteAtBottom = false;
                this.hasSingleQuote = false;
                StaticLayout staticLayout22 = staticLayout;
                int i162 = i2;
                i3 = 0;
                while (i3 < arrayList.size()) {
                }
                return;
            } catch (Exception e3) {
                FileLog.e(e3);
                return;
            }
            i2 = i - dp;
        }
    }

    public boolean isOut() {
        return this.messageOwner.out;
    }

    public boolean isOutOwner() {
        boolean z = true;
        if (this.previewForward) {
            return true;
        }
        Boolean bool = this.isOutOwnerCached;
        if (bool != null) {
            return bool.booleanValue();
        }
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        if (this.isSaved || getDialogId() == clientUserId) {
            TLRPC.MessageFwdHeader messageFwdHeader = this.messageOwner.fwd_from;
            if (messageFwdHeader != null) {
                TLRPC.Peer peer = messageFwdHeader.from_id;
                if ((peer == null || peer.user_id != clientUserId) && !messageFwdHeader.saved_out) {
                    z = false;
                }
                this.isOutOwnerCached = Boolean.valueOf(z);
                return z;
            }
            this.isOutOwnerCached = Boolean.TRUE;
            return true;
        }
        TLRPC.Peer peer2 = this.messageOwner.peer_id;
        TLRPC.Chat chat = null;
        if (peer2 != null) {
            long j = peer2.channel_id;
            if (j != 0) {
                chat = getChat(null, null, j);
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
                        z = false;
                    }
                    this.isOutOwnerCached = Boolean.valueOf(z);
                    return z;
                }
            }
        }
        this.isOutOwnerCached = Boolean.FALSE;
        return false;
    }

    public boolean needDrawAvatar() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Chat chat;
        if (this.type == 27) {
            return false;
        }
        if (this.isRepostPreview || this.isSaved || this.forceAvatar || this.customAvatarDrawable != null || this.searchType != 0) {
            return true;
        }
        boolean z = getDialogId() >= 0 ? getDialogId() == UserObject.VERIFY : !((chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-getDialogId()))) == null || !chat.signature_profiles);
        if (isSponsored()) {
            return false;
        }
        return isFromUser() || isFromGroup() || z || this.eventId != 0 || !((messageFwdHeader = this.messageOwner.fwd_from) == null || messageFwdHeader.saved_from_peer == null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean needDrawAvatarInternal() {
        TLRPC.Chat chat;
        if (this.isRepostPreview || this.isSaved || this.forceAvatar || this.customAvatarDrawable != null) {
            return true;
        }
        TLRPC.Message message = this.messageOwner;
        if ((message != null && message.guestchat_via_from != null) || this.searchType != 0) {
            return true;
        }
        boolean z = getDialogId() >= 0 ? getDialogId() == UserObject.VERIFY : !((chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-getDialogId()))) == null || !chat.signature_profiles);
        if (!isSponsored()) {
            if ((isFromChat() && isFromUser()) || isFromGroup() || z || this.eventId != 0) {
                return true;
            }
            TLRPC.MessageFwdHeader messageFwdHeader = this.messageOwner.fwd_from;
            if (messageFwdHeader != null && messageFwdHeader.saved_from_peer != null) {
                return true;
            }
        }
        return false;
    }

    public boolean isFromChat() {
        TLRPC.Peer peer;
        if (getDialogId() == UserConfig.getInstance(this.currentAccount).clientUserId) {
            return true;
        }
        TLRPC.Peer peer2 = this.messageOwner.peer_id;
        TLRPC.Chat chat = null;
        if (peer2 != null) {
            long j = peer2.channel_id;
            if (j != 0) {
                chat = getChat(null, null, j);
            }
        }
        if (!(ChatObject.isChannel(chat) && chat.megagroup) && ((peer = this.messageOwner.peer_id) == null || peer.chat_id == 0)) {
            return (peer == null || peer.channel_id == 0 || chat == null || !chat.megagroup) ? false : true;
        }
        return true;
    }

    public static long getFromChatId(TLRPC.Message message) {
        return getPeerId(message.from_id);
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

    public static long getPeerId(TLRPC.Peer peer) {
        long j;
        if (peer == null) {
            return 0L;
        }
        if (peer instanceof TLRPC.TL_peerChat) {
            j = peer.chat_id;
        } else if (peer instanceof TLRPC.TL_peerChannel) {
            j = peer.channel_id;
        } else {
            return peer.user_id;
        }
        return -j;
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

    public static boolean peersEqual(TLRPC.InputPeer inputPeer, TLRPC.Peer peer) {
        if (inputPeer == null && peer == null) {
            return true;
        }
        if (inputPeer != null && peer != null) {
            return ((inputPeer instanceof TLRPC.TL_inputPeerChat) && (peer instanceof TLRPC.TL_peerChat)) ? inputPeer.chat_id == peer.chat_id : ((inputPeer instanceof TLRPC.TL_inputPeerChannel) && (peer instanceof TLRPC.TL_peerChannel)) ? inputPeer.channel_id == peer.channel_id : (inputPeer instanceof TLRPC.TL_inputPeerUser) && (peer instanceof TLRPC.TL_peerUser) && inputPeer.user_id == peer.user_id;
        }
        return false;
    }

    public static boolean peersEqual(TLRPC.Peer peer, TLRPC.Peer peer2) {
        if (peer == null && peer2 == null) {
            return true;
        }
        if (peer != null && peer2 != null) {
            return ((peer instanceof TLRPC.TL_peerChat) && (peer2 instanceof TLRPC.TL_peerChat)) ? peer.chat_id == peer2.chat_id : ((peer instanceof TLRPC.TL_peerChannel) && (peer2 instanceof TLRPC.TL_peerChannel)) ? peer.channel_id == peer2.channel_id : (peer instanceof TLRPC.TL_peerUser) && (peer2 instanceof TLRPC.TL_peerUser) && peer.user_id == peer2.user_id;
        }
        return false;
    }

    public static boolean peersEqual(TLRPC.Chat chat, TLRPC.Peer peer) {
        if (chat == null && peer == null) {
            return true;
        }
        if (chat != null && peer != null) {
            return (ChatObject.isChannel(chat) && (peer instanceof TLRPC.TL_peerChannel)) ? chat.id == peer.channel_id : !ChatObject.isChannel(chat) && (peer instanceof TLRPC.TL_peerChat) && chat.id == peer.chat_id;
        }
        return false;
    }

    public long getFromChatId() {
        return getFromChatId(this.messageOwner);
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

    public static String getPeerObjectName(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return UserObject.getUserName((TLRPC.User) tLObject);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).title;
        }
        return "DELETED";
    }

    public boolean isFromUser() {
        TLRPC.Message message = this.messageOwner;
        return (message.from_id instanceof TLRPC.TL_peerUser) && !message.post;
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
            long j = peer2.channel_id;
            if (j != 0) {
                chat = getChat(null, null, j);
                if (!(this.messageOwner.peer_id instanceof TLRPC.TL_peerChannel) && ChatObject.isChannelAndNotMegaGroup(chat)) {
                    return true;
                }
                peer = this.messageOwner.from_id;
                if (peer != null) {
                    long j2 = peer.channel_id;
                    if (j2 != 0) {
                        chat2 = getChat(null, null, j2);
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

    public boolean isFromGroup() {
        TLRPC.Message message = this.messageOwner;
        if (message == null) {
            return false;
        }
        TLRPC.Peer peer = message.peer_id;
        TLRPC.Chat chat = null;
        if (peer != null) {
            long j = peer.channel_id;
            if (j != 0) {
                chat = getChat(null, null, j);
            }
        }
        return (this.messageOwner.from_id instanceof TLRPC.TL_peerChannel) && ChatObject.isChannel(chat) && chat.megagroup;
    }

    public boolean isForwardedChannelPost() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Message message = this.messageOwner;
        TLRPC.Peer peer = message.from_id;
        if ((peer instanceof TLRPC.TL_peerChannel) && (messageFwdHeader = message.fwd_from) != null && messageFwdHeader.channel_post != 0) {
            TLRPC.Peer peer2 = messageFwdHeader.saved_from_peer;
            if ((peer2 instanceof TLRPC.TL_peerChannel) && peer.channel_id == peer2.channel_id) {
                return true;
            }
        }
        return false;
    }

    public boolean isUnread() {
        TLRPC.Message message = this.messageOwner;
        return message != null && message.unread;
    }

    public boolean isEdited() {
        TLRPC.Message message = this.messageOwner;
        return (message == null || (message.flags & 32768) == 0 || message.edit_date == 0 || message.edit_hide) ? false : true;
    }

    public boolean isContentUnread() {
        return this.messageOwner.media_unread;
    }

    public void setIsRead() {
        this.messageOwner.unread = false;
    }

    public static int getUnreadFlags(TLRPC.Message message) {
        int i = !message.unread ? 1 : 0;
        return !message.media_unread ? i | 2 : i;
    }

    public void setContentIsRead() {
        this.messageOwner.media_unread = false;
    }

    public int getId() {
        return this.messageOwner.id;
    }

    public int getRealId() {
        TLRPC.Message message = this.messageOwner;
        int i = message.realId;
        return i != 0 ? i : message.id;
    }

    public static long getMessageSize(TLRPC.Message message) {
        return getMediaSize(getMedia(message));
    }

    public static long getMediaSize(TLRPC.MessageMedia messageMedia) {
        TLRPC.Document document;
        TLRPC.WebPage webPage;
        if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null) {
            document = webPage.document;
        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
            document = messageMedia.game.document;
        } else {
            document = messageMedia != null ? messageMedia.document : null;
        }
        if (document != null) {
            return document.size;
        }
        return 0L;
    }

    public long getSize() {
        VideoPlayer.VideoUri videoUri = this.highestQuality;
        if (videoUri != null) {
            return videoUri.document.size;
        }
        VideoPlayer.VideoUri videoUri2 = this.thumbQuality;
        if (videoUri2 != null) {
            return videoUri2.document.size;
        }
        VideoPlayer.VideoUri videoUri3 = this.cachedQuality;
        if (videoUri3 != null) {
            return videoUri3.document.size;
        }
        return getMessageSize(this.messageOwner);
    }

    public static void fixMessagePeer(ArrayList<TLRPC.Message> arrayList, long j) {
        if (arrayList == null || arrayList.isEmpty() || j == 0) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.Message message = arrayList.get(i);
            if (message instanceof TLRPC.TL_messageEmpty) {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                message.peer_id = tL_peerChannel;
                tL_peerChannel.channel_id = j;
            }
        }
    }

    public long getChannelId() {
        return getChannelId(this.messageOwner);
    }

    public static long getChannelId(TLRPC.Message message) {
        TLRPC.Peer peer = message.peer_id;
        if (peer != null) {
            return peer.channel_id;
        }
        return 0L;
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

    public static boolean shouldEncryptPhotoOrVideo(int i, TLRPC.Message message) {
        int i2;
        if ((message == null || message.media == null || !((isVoiceDocument(getDocument(message)) || isRoundVideoMessage(message)) && message.media.ttl_seconds == Integer.MAX_VALUE)) && !(getMedia(message) instanceof TLRPC.TL_messageMediaPaidMedia)) {
            return message instanceof TLRPC.TL_message_secret ? ((getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || isVideoMessage(message)) && (i2 = message.ttl) > 0 && i2 <= 60 : ((getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || (getMedia(message) instanceof TLRPC.TL_messageMediaDocument)) && getMedia(message).ttl_seconds != 0;
        }
        return true;
    }

    public boolean shouldEncryptPhotoOrVideo() {
        return shouldEncryptPhotoOrVideo(this.currentAccount, this.messageOwner);
    }

    public static boolean isSecretPhotoOrVideo(TLRPC.Message message) {
        int i;
        if (message instanceof TLRPC.TL_message_secret) {
            return ((getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || isRoundVideoMessage(message) || isVideoMessage(message)) && (i = message.ttl) > 0 && i <= 60;
        }
        if (message instanceof TLRPC.TL_message) {
            return ((getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || (getMedia(message) instanceof TLRPC.TL_messageMediaDocument)) && getMedia(message).ttl_seconds != 0;
        }
        return false;
    }

    public static boolean isSecretMedia(TLRPC.Message message) {
        if (message instanceof TLRPC.TL_message_secret) {
            return ((getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || isRoundVideoMessage(message) || isVideoMessage(message)) && getMedia(message).ttl_seconds != 0;
        }
        if (message instanceof TLRPC.TL_message) {
            return ((getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || (getMedia(message) instanceof TLRPC.TL_messageMediaDocument)) && getMedia(message).ttl_seconds != 0;
        }
        return false;
    }

    public boolean needDrawBluredPreview() {
        if (this.isRepostPreview) {
            return false;
        }
        if (hasExtendedMediaPreview()) {
            return true;
        }
        TLRPC.Message message = this.messageOwner;
        if (message instanceof TLRPC.TL_message_secret) {
            int max = Math.max(message.ttl, getMedia(message).ttl_seconds);
            if (max > 0) {
                return (((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) || isVideo() || isGif()) && max <= 60) || isRoundVideo();
            }
            return false;
        }
        if (!(message instanceof TLRPC.TL_message) || getMedia(message) == null || getMedia(this.messageOwner).ttl_seconds == 0) {
            return false;
        }
        return (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument);
    }

    public boolean isSecret() {
        return this.messageOwner instanceof TLRPC.TL_message_secret;
    }

    public boolean isSecretMedia() {
        int i;
        TLRPC.Message message = this.messageOwner;
        return message instanceof TLRPC.TL_message_secret ? (((getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || isGif()) && (i = this.messageOwner.ttl) > 0 && i <= 60) || isVoice() || isRoundVideo() || isVideo() : (message instanceof TLRPC.TL_message) && getMedia(message) != null && getMedia(this.messageOwner).ttl_seconds != 0 && ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument));
    }

    public static void setUnreadFlags(TLRPC.Message message, int i) {
        message.unread = (i & 1) == 0;
        message.media_unread = (i & 2) == 0;
    }

    public static boolean isUnread(TLRPC.Message message) {
        return message.unread;
    }

    public static boolean isContentUnread(TLRPC.Message message) {
        return message.media_unread;
    }

    public boolean isSavedFromMegagroup() {
        TLRPC.Peer peer;
        TLRPC.MessageFwdHeader messageFwdHeader = this.messageOwner.fwd_from;
        if (messageFwdHeader == null || (peer = messageFwdHeader.saved_from_peer) == null || peer.channel_id == 0) {
            return false;
        }
        return ChatObject.isMegagroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.fwd_from.saved_from_peer.channel_id)));
    }

    public static boolean isOut(TLRPC.Message message) {
        return message.out;
    }

    public long getDialogId() {
        return getDialogId(this.messageOwner);
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
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
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

    public static long getDialogId(TLRPC.Message message) {
        TLRPC.Peer peer;
        if (message.dialog_id == 0 && (peer = message.peer_id) != null) {
            long j = peer.chat_id;
            if (j != 0) {
                message.dialog_id = -j;
            } else {
                long j2 = peer.channel_id;
                if (j2 != 0) {
                    message.dialog_id = -j2;
                } else if (message.from_id == null || isOut(message) || message.guestchat_via_from != null) {
                    message.dialog_id = message.peer_id.user_id;
                } else {
                    message.dialog_id = message.from_id.user_id;
                }
            }
        }
        return message.dialog_id;
    }

    public long getSavedDialogId() {
        return getSavedDialogId(UserConfig.getInstance(this.currentAccount).getClientUserId(), this.messageOwner);
    }

    public static long getSavedDialogId(long j, TLRPC.Message message) {
        TLRPC.Peer peer;
        TLRPC.Peer peer2 = message.saved_peer_id;
        if (peer2 != null) {
            long j2 = peer2.chat_id;
            if (j2 != 0) {
                return -j2;
            }
            long j3 = peer2.channel_id;
            return j3 != 0 ? -j3 : peer2.user_id;
        }
        if (message.from_id.user_id != j) {
            return 0L;
        }
        TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
        if (messageFwdHeader == null || (peer = messageFwdHeader.saved_from_peer) == null) {
            return ((messageFwdHeader == null || messageFwdHeader.from_id == null) && messageFwdHeader != null) ? UserObject.ANONYMOUS : j;
        }
        return DialogObject.getPeerDialogId(peer);
    }

    public static TLRPC.Peer getSavedDialogPeer(long j, TLRPC.Message message) {
        TLRPC.Peer peer;
        TLRPC.Peer peer2;
        TLRPC.Peer peer3 = message.saved_peer_id;
        if (peer3 != null) {
            return peer3;
        }
        TLRPC.Peer peer4 = message.peer_id;
        if (peer4 == null || peer4.user_id != j || (peer = message.from_id) == null || peer.user_id != j) {
            return null;
        }
        TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
        if (messageFwdHeader != null && (peer2 = messageFwdHeader.saved_from_peer) != null) {
            return peer2;
        }
        if (messageFwdHeader != null && messageFwdHeader.from_id != null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = j;
            return tL_peerUser;
        }
        if (messageFwdHeader != null) {
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            tL_peerUser2.user_id = UserObject.ANONYMOUS;
            return tL_peerUser2;
        }
        TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
        tL_peerUser3.user_id = j;
        return tL_peerUser3;
    }

    public boolean canSetReaction() {
        TLRPC.Message message = this.messageOwner;
        if (message instanceof TLRPC.TL_messageService) {
            return message.reactions_are_possible;
        }
        return true;
    }

    public boolean isSending() {
        TLRPC.Message message = this.messageOwner;
        return message.send_state == 1 && message.id < 0;
    }

    public boolean isEditing() {
        TLRPC.Message message = this.messageOwner;
        return message.send_state == 3 && message.id > 0;
    }

    public boolean isEditingMedia() {
        return getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto ? getMedia(this.messageOwner).photo.id == 0 : (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument) && getMedia(this.messageOwner).document.dc_id == 0;
    }

    public boolean isSendError() {
        TLRPC.Message message = this.messageOwner;
        if (message.send_state != 2 || message.id >= 0) {
            if (this.scheduled && message.id > 0) {
                if (message.date < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - (this.messageOwner.video_processing_pending ? NotificationCenter.onDatabaseOpened : 60)) {
                }
            }
            return false;
        }
        return true;
    }

    public boolean isSent() {
        TLRPC.Message message = this.messageOwner;
        return message.send_state == 0 || message.id > 0;
    }

    public int getSecretTimeLeft() {
        TLRPC.Message message = this.messageOwner;
        int i = message.ttl;
        int i2 = message.destroyTime;
        return i2 != 0 ? Math.max(0, i2 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) : i;
    }

    public CharSequence getSecretTimeString() {
        String str;
        if (!isSecretMedia()) {
            return null;
        }
        if (this.messageOwner.ttl == Integer.MAX_VALUE) {
            if (this.secretOnceSpan == null) {
                this.secretOnceSpan = new SpannableString("v");
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_viewonce);
                coloredImageSpan.setTranslateX(-AndroidUtilities.dp(3.0f));
                coloredImageSpan.setWidth(AndroidUtilities.dp(13.0f));
                CharSequence charSequence = this.secretOnceSpan;
                ((Spannable) charSequence).setSpan(coloredImageSpan, 0, charSequence.length(), 33);
            }
            return TextUtils.concat(this.secretOnceSpan, "1");
        }
        int secretTimeLeft = getSecretTimeLeft();
        if (secretTimeLeft < 60) {
            str = secretTimeLeft + "s";
        } else {
            str = (secretTimeLeft / 60) + "m";
        }
        if (this.secretPlaySpan == null) {
            this.secretPlaySpan = new SpannableString("p");
            ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.play_mini_video);
            coloredImageSpan2.setTranslateX(AndroidUtilities.dp(1.0f));
            coloredImageSpan2.setWidth(AndroidUtilities.dp(13.0f));
            CharSequence charSequence2 = this.secretPlaySpan;
            ((Spannable) charSequence2).setSpan(coloredImageSpan2, 0, charSequence2.length(), 33);
        }
        return TextUtils.concat(this.secretPlaySpan, str);
    }

    public String getDocumentName() {
        return FileLoader.getDocumentFileName(getDocument());
    }

    public static boolean isWebM(TLRPC.Document document) {
        return document != null && "video/webm".equals(document.mime_type);
    }

    public static boolean isVideoSticker(TLRPC.Document document) {
        return document != null && isVideoStickerDocument(document);
    }

    public boolean isVideoSticker() {
        return getDocument() != null && isVideoStickerDocument(getDocument());
    }

    public static boolean isStickerDocument(TLRPC.Document document) {
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                if (document.attributes.get(i) instanceof TLRPC.TL_documentAttributeSticker) {
                    return "image/webp".equals(document.mime_type) || "video/webm".equals(document.mime_type);
                }
            }
        }
        return false;
    }

    public static boolean isVideoStickerDocument(TLRPC.Document document) {
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                    return "video/webm".equals(document.mime_type);
                }
            }
        }
        return false;
    }

    public static boolean isStickerHasSet(TLRPC.Document document) {
        TLRPC.InputStickerSet inputStickerSet;
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isAnimatedStickerDocument(TLRPC.Document document, boolean z) {
        if (document != null && (("application/x-tgsticker".equals(document.mime_type) && !document.thumbs.isEmpty()) || "application/x-tgsdice".equals(document.mime_type))) {
            if (z) {
                return true;
            }
            int size = document.attributes.size();
            for (int i = 0; i < size; i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
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

    public static boolean isAnyKindOfStickerOrEmoji(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                return true;
            }
        }
        return false;
    }

    public static boolean canAutoplayAnimatedSticker(TLRPC.Document document) {
        return (isAnimatedStickerDocument(document, true) || isVideoStickerDocument(document)) && LiteMode.isEnabled(1);
    }

    public static boolean isMaskDocument(TLRPC.Document document) {
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && documentAttribute.mask) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isVoiceDocument(TLRPC.Document document) {
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    return documentAttribute.voice;
                }
            }
        }
        return false;
    }

    public static boolean isVoiceWebDocument(WebFile webFile) {
        return webFile != null && webFile.mime_type.equals("audio/ogg");
    }

    public static boolean isImageWebDocument(WebFile webFile) {
        return (webFile == null || isGifDocument(webFile) || !webFile.mime_type.startsWith("image/")) ? false : true;
    }

    public static boolean isVideoWebDocument(WebFile webFile) {
        return webFile != null && webFile.mime_type.startsWith("video/");
    }

    public static boolean isMusicDocument(TLRPC.Document document) {
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                if (document.attributes.get(i) instanceof TLRPC.TL_documentAttributeAudio) {
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

    public static TLRPC.VideoSize getDocumentVideoThumb(TLRPC.Document document) {
        if (document == null || document.video_thumbs.isEmpty()) {
            return null;
        }
        return document.video_thumbs.get(0);
    }

    public static boolean isVideoDocument(TLRPC.Document document) {
        int lastIndexOf;
        if (document == null) {
            return false;
        }
        String str = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        for (int i3 = 0; i3 < document.attributes.size(); i3++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                if (documentAttribute.round_message) {
                    return false;
                }
                i = documentAttribute.w;
                i2 = documentAttribute.h;
                z2 = true;
            } else if (documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) {
                z = true;
            } else if (documentAttribute instanceof TLRPC.TL_documentAttributeFilename) {
                str = documentAttribute.file_name;
            }
        }
        if (str != null && (lastIndexOf = str.lastIndexOf(".")) >= 0 && isV(str.substring(lastIndexOf + 1))) {
            return false;
        }
        if (z && (i > 1280 || i2 > 1280)) {
            z = false;
        }
        if (SharedConfig.streamMkv && !z2 && "video/x-matroska".equals(document.mime_type)) {
            z2 = true;
        }
        return z2 && !z;
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

    public TLRPC.Document getDocument() {
        VideoPlayer.VideoUri videoUri;
        TLRPC.Document document = this.emojiAnimatedSticker;
        if (document != null) {
            return document;
        }
        if (hasVideoQualities() && (videoUri = this.highestQuality) != null) {
            return videoUri.document;
        }
        return getDocument(this.messageOwner);
    }

    public TLRPC.Document getDocumentFast() {
        TLRPC.Document document = this.emojiAnimatedSticker;
        return document != null ? document : getDocument(this.messageOwner);
    }

    public static TLRPC.Document getDocument(TLRPC.Message message) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
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

    public static TLRPC.Photo getPhoto(TLRPC.Message message) {
        if (getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return getMedia(message).webpage.photo;
        }
        if (getMedia(message) != null) {
            return getMedia(message).photo;
        }
        return null;
    }

    public static boolean isStickerMessage(TLRPC.Message message) {
        return getMedia(message) != null && isStickerDocument(getMedia(message).document);
    }

    public static boolean isAnimatedStickerMessage(TLRPC.Message message) {
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(message.dialog_id);
        if ((!isEncryptedDialog || message.stickerVerified == 1) && getMedia(message) != null) {
            return isAnimatedStickerDocument(getMedia(message).document, !isEncryptedDialog || message.out);
        }
        return false;
    }

    public static boolean isLocationMessage(TLRPC.Message message) {
        return (getMedia(message) instanceof TLRPC.TL_messageMediaGeo) || (getMedia(message) instanceof TLRPC.TL_messageMediaGeoLive) || (getMedia(message) instanceof TLRPC.TL_messageMediaVenue);
    }

    public static boolean isMaskMessage(TLRPC.Message message) {
        return getMedia(message) != null && isMaskDocument(getMedia(message).document);
    }

    public static boolean isMusicMessage(TLRPC.Message message) {
        if (getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return isMusicDocument(getMedia(message).webpage.document);
        }
        return getMedia(message) != null && isMusicDocument(getMedia(message).document);
    }

    public static boolean isGifMessage(TLRPC.Message message) {
        if (getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return isGifDocument(getMedia(message).webpage.document);
        }
        if (getMedia(message) != null) {
            return isGifDocument(getMedia(message).document, (message.grouped_id > 0L ? 1 : (message.grouped_id == 0L ? 0 : -1)) != 0);
        }
        return false;
    }

    public static boolean isRoundVideoMessage(TLRPC.Message message) {
        if (!(getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) || getMedia(message).webpage == null) {
            return getMedia(message) != null && isRoundVideoDocument(getMedia(message).document);
        }
        return isRoundVideoDocument(getMedia(message).webpage.document);
    }

    public static boolean isPhoto(TLRPC.Message message) {
        TLRPC.MessageAction messageAction;
        TLRPC.Photo photo;
        if (getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return (getMedia(message).webpage.photo instanceof TLRPC.TL_photo) && !(getMedia(message).webpage.document instanceof TLRPC.TL_document);
        }
        if (message != null && (messageAction = message.action) != null && (photo = messageAction.photo) != null) {
            return photo instanceof TLRPC.TL_photo;
        }
        return getMedia(message) instanceof TLRPC.TL_messageMediaPhoto;
    }

    public static boolean isVoiceMessage(TLRPC.Message message) {
        if (getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return isVoiceDocument(getMedia(message).webpage.document);
        }
        return getMedia(message) != null && isVoiceDocument(getMedia(message).document);
    }

    public static boolean isNewGifMessage(TLRPC.Message message) {
        if (getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return isNewGifDocument(getMedia(message).webpage.document);
        }
        return getMedia(message) != null && isNewGifDocument(getMedia(message).document);
    }

    public static boolean isLiveLocationMessage(TLRPC.Message message) {
        return getMedia(message) instanceof TLRPC.TL_messageMediaGeoLive;
    }

    public static boolean isVideoMessage(TLRPC.Message message) {
        if (getMedia(message) != null && isVideoSticker(getMedia(message).document)) {
            return false;
        }
        if (getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return isVideoDocument(getMedia(message).webpage.document);
        }
        return getMedia(message) != null && isVideoDocument(getMedia(message).document);
    }

    public static boolean isGameMessage(TLRPC.Message message) {
        return getMedia(message) instanceof TLRPC.TL_messageMediaGame;
    }

    public static boolean isInvoiceMessage(TLRPC.Message message) {
        return getMedia(message) instanceof TLRPC.TL_messageMediaInvoice;
    }

    public static TLRPC.InputStickerSet getInputStickerSet(TLRPC.Message message) {
        TLRPC.Document document = getDocument(message);
        if (document != null) {
            return getInputStickerSet(document);
        }
        return null;
    }

    public static TLRPC.InputStickerSet getInputStickerSet(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
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

    public static String findAnimatedEmojiEmoticon(TLRPC.Document document) {
        return findAnimatedEmojiEmoticon(document, "😀");
    }

    public static String findAnimatedEmojiEmoticon(TLRPC.Document document, String str) {
        return findAnimatedEmojiEmoticon(document, str, null);
    }

    public static String findAnimatedEmojiEmoticon(TLRPC.Document document, String str, Integer num) {
        if (document == null) {
            return str;
        }
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeSticker)) {
                if (num != null) {
                    TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(num.intValue()).getStickerSet(documentAttribute.stickerset, true);
                    StringBuilder sb = new StringBuilder("");
                    if (stickerSet != null && stickerSet.packs != null) {
                        for (int i2 = 0; i2 < stickerSet.packs.size(); i2++) {
                            TLRPC.TL_stickerPack tL_stickerPack = stickerSet.packs.get(i2);
                            if (tL_stickerPack.documents.contains(Long.valueOf(document.id))) {
                                sb.append(tL_stickerPack.emoticon);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(sb)) {
                        return sb.toString();
                    }
                }
                return documentAttribute.alt;
            }
        }
        return str;
    }

    public static ArrayList<String> findStickerEmoticons(TLRPC.Document document, Integer num) {
        if (document == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeSticker)) {
                if (num != null) {
                    TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(num.intValue()).getStickerSet(documentAttribute.stickerset, true);
                    if (stickerSet != null && stickerSet.packs != null) {
                        for (int i2 = 0; i2 < stickerSet.packs.size(); i2++) {
                            TLRPC.TL_stickerPack tL_stickerPack = stickerSet.packs.get(i2);
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

    public static boolean isAnimatedEmoji(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            if (document.attributes.get(i) instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                return true;
            }
        }
        return false;
    }

    public static boolean isFreeEmoji(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                return ((TLRPC.TL_documentAttributeCustomEmoji) documentAttribute).free;
            }
        }
        return false;
    }

    public static boolean isTextColorEmoji(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        getInputStickerSet(document);
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
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

    public static boolean isPremiumEmojiPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        if ((tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) && tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
            for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                if (!isFreeEmoji(tL_messages_stickerSet.documents.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isPremiumEmojiPack(TLRPC.StickerSetCovered stickerSetCovered) {
        TLRPC.StickerSet stickerSet;
        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && !stickerSet.emojis) {
            return false;
        }
        ArrayList<TLRPC.Document> arrayList = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
        if (stickerSetCovered != null && arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (!isFreeEmoji(arrayList.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long getStickerSetId(TLRPC.Document document) {
        if (document == null) {
            return -1L;
        }
        for (int i = 0; i < document.attributes.size(); i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
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
        for (int i = 0; i < document.attributes.size(); i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
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

    public String getStickerChar() {
        TLRPC.Document document = getDocument();
        if (document == null) {
            return null;
        }
        Iterator<TLRPC.DocumentAttribute> it = document.attributes.iterator();
        while (it.hasNext()) {
            TLRPC.DocumentAttribute next = it.next();
            if (next instanceof TLRPC.TL_documentAttributeSticker) {
                return next.alt;
            }
        }
        return null;
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

    public int getApproximateHeight(boolean z) {
        int i;
        int i2;
        int dp;
        int min;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int min2;
        int i3 = this.type;
        int i4 = 0;
        if (i3 == 0) {
            int textHeightCached = z ? textHeightCached() : textHeight();
            if ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && (getMedia(this.messageOwner).webpage instanceof TLRPC.TL_webPage)) {
                i4 = AndroidUtilities.dp(100.0f);
            }
            int i5 = textHeightCached + i4;
            return isReply() ? i5 + AndroidUtilities.dp(42.0f) : i5;
        }
        if (i3 == 20) {
            return AndroidUtilities.getPhotoSize();
        }
        if (i3 == 2) {
            return AndroidUtilities.dp(72.0f);
        }
        if (i3 == 12) {
            return AndroidUtilities.dp(71.0f);
        }
        if (i3 == 9) {
            return AndroidUtilities.dp(100.0f);
        }
        if (i3 == 4) {
            return AndroidUtilities.dp(114.0f);
        }
        if (i3 == 14) {
            return AndroidUtilities.dp(82.0f);
        }
        if (i3 == 10 || i3 == 35 || i3 == 33 || i3 == 34) {
            return AndroidUtilities.dp(30.0f);
        }
        if (i3 == 11 || i3 == 18 || i3 == 31 || i3 == 30 || i3 == 25 || i3 == 21) {
            return AndroidUtilities.dp(50.0f);
        }
        if (i3 == 32) {
            return AndroidUtilities.dp(234.0f);
        }
        if (i3 == 5) {
            return AndroidUtilities.roundMessageSize;
        }
        if (i3 == 19) {
            return (z ? textHeightCached() : textHeight()) + AndroidUtilities.dp(30.0f);
        }
        if (i3 == 13 || i3 == 15) {
            float f = AndroidUtilities.displaySize.y * 0.4f;
            if (AndroidUtilities.isTablet()) {
                i = AndroidUtilities.getMinTabletSide();
            } else {
                i = AndroidUtilities.displaySize.x;
            }
            float f2 = i * 0.5f;
            TLRPC.Document document = getDocument();
            if (document != null) {
                int size = document.attributes.size();
                for (int i6 = 0; i6 < size; i6++) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i6);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                        i4 = documentAttribute.w;
                        i2 = documentAttribute.h;
                        break;
                    }
                }
            }
            i2 = 0;
            if (i4 == 0) {
                i2 = (int) f;
                i4 = AndroidUtilities.dp(100.0f) + i2;
            }
            float f3 = i2;
            if (f3 > f) {
                i4 = (int) (i4 * (f / f3));
                i2 = (int) f;
            }
            float f4 = i4;
            if (f4 > f2) {
                i2 = (int) (i2 * (f2 / f4));
            }
            dp = AndroidUtilities.dp(14.0f);
        } else {
            if (AndroidUtilities.isTablet()) {
                min = AndroidUtilities.getMinTabletSide();
            } else {
                Point point = AndroidUtilities.displaySize;
                min = Math.min(point.x, point.y);
            }
            int i7 = (int) (min * 0.7f);
            i2 = AndroidUtilities.dp(100.0f) + i7;
            if (i7 > AndroidUtilities.getPhotoSize()) {
                i7 = AndroidUtilities.getPhotoSize();
            }
            if (i2 > AndroidUtilities.getPhotoSize()) {
                i2 = AndroidUtilities.getPhotoSize();
            }
            if (z) {
                ArrayList<TLRPC.PhotoSize> arrayList = this.photoThumbs;
                closestPhotoSizeWithSize = (arrayList == null || arrayList.isEmpty()) ? null : this.photoThumbs.get(0);
            } else {
                closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, AndroidUtilities.getPhotoSize());
            }
            if (closestPhotoSizeWithSize != null) {
                int i8 = (int) (closestPhotoSizeWithSize.h / (closestPhotoSizeWithSize.w / i7));
                if (i8 == 0) {
                    i8 = AndroidUtilities.dp(100.0f);
                }
                if (i8 <= i2) {
                    i2 = i8 < AndroidUtilities.dp(120.0f) ? AndroidUtilities.dp(120.0f) : i8;
                }
                if (!z && needDrawBluredPreview()) {
                    if (AndroidUtilities.isTablet()) {
                        min2 = AndroidUtilities.getMinTabletSide();
                    } else {
                        Point point2 = AndroidUtilities.displaySize;
                        min2 = Math.min(point2.x, point2.y);
                    }
                    i2 = (int) (min2 * 0.5f);
                }
            }
            dp = AndroidUtilities.dp(14.0f);
        }
        return i2 + dp;
    }

    private int getParentWidth() {
        int i;
        return (!this.preview || (i = this.parentWidth) <= 0) ? AndroidUtilities.displaySize.x : i;
    }

    public String getStickerEmoji() {
        TLRPC.Document document = getDocument();
        if (document == null) {
            return null;
        }
        for (int i = 0; i < document.attributes.size(); i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                String str = documentAttribute.alt;
                if (str == null || str.length() <= 0) {
                    return null;
                }
                return documentAttribute.alt;
            }
        }
        return null;
    }

    public boolean isConferenceCall() {
        return this.messageOwner.action instanceof TLRPC.TL_messageActionConferenceCall;
    }

    public boolean isVideoCall() {
        TLRPC.MessageAction messageAction = this.messageOwner.action;
        return ((messageAction instanceof TLRPC.TL_messageActionPhoneCall) && messageAction.video) || ((messageAction instanceof TLRPC.TL_messageActionConferenceCall) && messageAction.video);
    }

    public boolean isAnimatedEmoji() {
        return (this.emojiAnimatedSticker == null && this.emojiAnimatedStickerId == null) ? false : true;
    }

    public boolean isAnimatedAnimatedEmoji() {
        return isAnimatedEmoji() && isAnimatedEmoji(getDocument());
    }

    public boolean isDice() {
        return getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDice;
    }

    public boolean isStakedDice() {
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        return (media instanceof TLRPC.TL_messageMediaDice) && ((TLRPC.TL_messageMediaDice) media).game_outcome != null;
    }

    public static long getStakedDiceWinAmount(TLRPC.TL_messageMediaDice tL_messageMediaDice) {
        TLRPC.TL_messages_emojiGameOutcome tL_messages_emojiGameOutcome = tL_messageMediaDice.game_outcome;
        if (tL_messages_emojiGameOutcome == null) {
            return 0L;
        }
        long j = tL_messages_emojiGameOutcome.ton_amount;
        return j > 0 ? j : -tL_messages_emojiGameOutcome.stake_ton_amount;
    }

    public long getStakedDiceWinAmount() {
        TLRPC.TL_messages_emojiGameOutcome tL_messages_emojiGameOutcome;
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (!(media instanceof TLRPC.TL_messageMediaDice) || (tL_messages_emojiGameOutcome = ((TLRPC.TL_messageMediaDice) media).game_outcome) == null) {
            return 0L;
        }
        long j = tL_messages_emojiGameOutcome.ton_amount;
        return j > 0 ? j : -tL_messages_emojiGameOutcome.stake_ton_amount;
    }

    public long getStakedDiceAmount() {
        TLRPC.TL_messages_emojiGameOutcome tL_messages_emojiGameOutcome;
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (!(media instanceof TLRPC.TL_messageMediaDice) || (tL_messages_emojiGameOutcome = ((TLRPC.TL_messageMediaDice) media).game_outcome) == null) {
            return 0L;
        }
        return tL_messages_emojiGameOutcome.stake_ton_amount;
    }

    public String getDiceEmoji() {
        if (!isDice()) {
            return null;
        }
        TLRPC.TL_messageMediaDice tL_messageMediaDice = (TLRPC.TL_messageMediaDice) getMedia(this.messageOwner);
        if (TextUtils.isEmpty(tL_messageMediaDice.emoticon)) {
            return "🎲";
        }
        return tL_messageMediaDice.emoticon.replace("️", "");
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

    public int getDiceValue() {
        if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDice) {
            return ((TLRPC.TL_messageMediaDice) getMedia(this.messageOwner)).value;
        }
        return -1;
    }

    public boolean isSticker() {
        int i = this.type;
        return i != 1000 ? i == 13 : isStickerDocument(getDocument()) || isVideoSticker(getDocument());
    }

    public boolean isAnimatedSticker() {
        int i = this.type;
        if (i != 1000) {
            return i == 15;
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

    public boolean isAnyKindOfSticker() {
        int i = this.type;
        return i == 13 || i == 15 || i == 19;
    }

    public boolean shouldDrawWithoutBackground() {
        int i;
        return !isSponsored() && ((i = this.type) == 13 || i == 15 || i == 5 || i == 19 || isExpiredStory());
    }

    public boolean isAnimatedEmojiStickers() {
        return this.type == 19;
    }

    public boolean isAnimatedEmojiStickerSingle() {
        return this.emojiAnimatedStickerId != null;
    }

    public boolean isLocation() {
        return isLocationMessage(this.messageOwner);
    }

    public boolean isMask() {
        return isMaskMessage(this.messageOwner);
    }

    public boolean isMusic() {
        return (!isMusicMessage(this.messageOwner) || isVideo() || isRoundVideo()) ? false : true;
    }

    public boolean isDocument() {
        return (getDocument() == null || isVideo() || isMusic() || isVoice() || isAnyKindOfSticker()) ? false : true;
    }

    public boolean isVoice() {
        return isVoiceMessage(this.messageOwner);
    }

    public boolean isVoiceOnce() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        return isVoice() && (message = this.messageOwner) != null && (messageMedia = message.media) != null && messageMedia.ttl_seconds == Integer.MAX_VALUE;
    }

    public boolean isRoundOnce() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        return isRoundVideo() && (message = this.messageOwner) != null && (messageMedia = message.media) != null && messageMedia.ttl_seconds == Integer.MAX_VALUE;
    }

    public boolean isVideo() {
        return isVideoMessage(this.messageOwner);
    }

    public boolean isLivePhoto() {
        TLRPC.MessageMedia media = getMedia(this);
        return media != null && media.live_photo;
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

    public boolean isPhoto() {
        return isPhoto(this.messageOwner);
    }

    public boolean isStoryMedia() {
        TLRPC.Message message = this.messageOwner;
        return message != null && (message.media instanceof TLRPC.TL_messageMediaStory);
    }

    public boolean isLiveLocation() {
        return isLiveLocationMessage(this.messageOwner);
    }

    public boolean isExpiredLiveLocation(int i) {
        TLRPC.Message message = this.messageOwner;
        return message.date + getMedia(message).period <= i;
    }

    public boolean isGame() {
        return isGameMessage(this.messageOwner);
    }

    public boolean isInvoice() {
        return isInvoiceMessage(this.messageOwner);
    }

    public boolean isRoundVideo() {
        if (this.isRoundVideoCached == 0) {
            this.isRoundVideoCached = (this.type == 5 || isRoundVideoMessage(this.messageOwner)) ? 1 : 2;
        }
        return this.isRoundVideoCached == 1;
    }

    public boolean shouldAnimateSending() {
        return this.wasJustSent && (this.type == 5 || isVoice() || ((isAnyKindOfSticker() && this.sendAnimationData != null) || !(this.messageText == null || this.sendAnimationData == null)));
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

    public static boolean isDocumentHasAttachedStickers(TLRPC.Document document) {
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                if (document.attributes.get(i) instanceof TLRPC.TL_documentAttributeHasStickers) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isGif() {
        return isGifMessage(this.messageOwner);
    }

    public boolean isWebpageDocument() {
        return (!(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) || getMedia(this.messageOwner).webpage.document == null || isGifDocument(getMedia(this.messageOwner).webpage.document)) ? false : true;
    }

    public boolean isWebpage() {
        return getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage;
    }

    public boolean isNewGif() {
        return getMedia(this.messageOwner) != null && isNewGifDocument(getDocument());
    }

    public boolean isAndroidTheme() {
        if (getMedia(this.messageOwner) != null && getMedia(this.messageOwner).webpage != null && !getMedia(this.messageOwner).webpage.attributes.isEmpty()) {
            int size = getMedia(this.messageOwner).webpage.attributes.size();
            for (int i = 0; i < size; i++) {
                TLRPC.WebPageAttribute webPageAttribute = getMedia(this.messageOwner).webpage.attributes.get(i);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeTheme) {
                    TLRPC.TL_webPageAttributeTheme tL_webPageAttributeTheme = (TLRPC.TL_webPageAttributeTheme) webPageAttribute;
                    ArrayList<TLRPC.Document> arrayList = tL_webPageAttributeTheme.documents;
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        if ("application/x-tgtheme-android".equals(arrayList.get(i2).mime_type)) {
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

    public String getMusicTitle() {
        return getMusicTitle(true);
    }

    public String getMusicTitle(boolean z) {
        TLRPC.Document document = getDocument();
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    if (documentAttribute.voice) {
                        if (z) {
                            return LocaleController.formatDateAudio(this.messageOwner.date, true);
                        }
                        return null;
                    }
                    String str = documentAttribute.title;
                    if (str != null && str.length() != 0) {
                        return str;
                    }
                    String documentFileName = FileLoader.getDocumentFileName(document);
                    return (TextUtils.isEmpty(documentFileName) && z) ? LocaleController.getString(R.string.AudioUnknownTitle) : documentFileName;
                }
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.round_message) {
                    if (isQuickReply()) {
                        return LocaleController.formatString(R.string.BusinessInReplies, "/" + getQuickReplyDisplayName());
                    }
                    return LocaleController.formatDateAudio(this.messageOwner.date, true);
                }
            }
            String documentFileName2 = FileLoader.getDocumentFileName(document);
            if (!TextUtils.isEmpty(documentFileName2)) {
                return documentFileName2;
            }
        }
        return LocaleController.getString(R.string.AudioUnknownTitle);
    }

    public static String getMusicTitle(TLRPC.Document document, boolean z) {
        if (document == null) {
            return LocaleController.getString(R.string.AudioUnknownTitle);
        }
        for (int i = 0; i < document.attributes.size(); i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                String str = documentAttribute.title;
                if (str != null && !str.isEmpty()) {
                    return str;
                }
                String documentFileName = FileLoader.getDocumentFileName(document);
                return (TextUtils.isEmpty(documentFileName) && z) ? LocaleController.getString(R.string.AudioUnknownTitle) : documentFileName;
            }
        }
        String documentFileName2 = FileLoader.getDocumentFileName(document);
        return !TextUtils.isEmpty(documentFileName2) ? documentFileName2 : LocaleController.getString(R.string.AudioUnknownTitle);
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
        int i = this.audioPlayerDuration;
        if (i > 0) {
            return i;
        }
        for (int i2 = 0; i2 < document.attributes.size(); i2++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i2);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                double d2 = documentAttribute.duration;
                this.attributeDuration = d2;
                return d2;
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                double d3 = documentAttribute.duration;
                this.attributeDuration = d3;
                return d3;
            }
        }
        return this.audioPlayerDuration;
    }

    public String getArtworkUrl(boolean z) {
        return getArtworkUrl(getDocument(), z);
    }

    public static String getArtworkUrl(TLRPC.Document document, boolean z) {
        if (document == null || "audio/ogg".equals(document.mime_type)) {
            return null;
        }
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                if (documentAttribute.voice) {
                    return null;
                }
                String str = documentAttribute.performer;
                String str2 = documentAttribute.title;
                if (!TextUtils.isEmpty(str)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = excludeWords;
                        if (i2 >= strArr.length) {
                            break;
                        }
                        str = str.replace(strArr[i2], " ");
                        i2++;
                    }
                }
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    return null;
                }
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("athumb://itunes.apple.com/search?term=");
                    sb.append(URLEncoder.encode(str + " - " + str2, "UTF-8"));
                    sb.append("&entity=song&limit=4");
                    sb.append(z ? "&s=1" : "");
                    return sb.toString();
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return null;
    }

    public String getMusicAuthor() {
        return getMusicAuthor(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0038, code lost:
    
        if (r3.round_message != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0150 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getMusicAuthor(boolean z) {
        TLRPC.User user;
        TLRPC.Chat chat;
        String str;
        TLRPC.Document document = getDocument();
        if (document != null) {
            boolean z2 = false;
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    if (!documentAttribute.voice) {
                        String str2 = documentAttribute.performer;
                        return (TextUtils.isEmpty(str2) && z) ? LocaleController.getString(R.string.AudioUnknownArtist) : str2;
                    }
                } else {
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    }
                    if (!z2) {
                        TLRPC.User user2 = null;
                        if (!z) {
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
                            } else if (messageFwdHeader2 != null && (messageFwdHeader2.from_id instanceof TLRPC.TL_peerChat)) {
                                chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.fwd_from.from_id.chat_id));
                            } else {
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
                                    } else if (peer2 == null && message.peer_id.channel_id != 0) {
                                        chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.peer_id.channel_id));
                                    } else {
                                        user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.from_id.user_id));
                                    }
                                }
                                TLRPC.User user3 = user;
                                chat = null;
                                user2 = user3;
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
                }
                z2 = true;
                if (!z2) {
                }
            }
        }
        return LocaleController.getString(R.string.AudioUnknownArtist);
    }

    public static String getMusicAuthor(TLRPC.Document document, boolean z) {
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && !documentAttribute.voice) {
                    String str = documentAttribute.performer;
                    return (TextUtils.isEmpty(str) && z) ? LocaleController.getString(R.string.AudioUnknownArtist) : str;
                }
            }
        }
        return LocaleController.getString(R.string.AudioUnknownArtist);
    }

    public TLRPC.InputStickerSet getInputStickerSet() {
        return getInputStickerSet(this.messageOwner);
    }

    public boolean isForwarded() {
        return isForwardedMessage(this.messageOwner);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009a, code lost:
    
        if (r1.channel_id == r0.channel_id) goto L54;
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
        if (this.isSaved) {
            TLRPC.Message message = this.messageOwner;
            if (message == null || message.fwd_from == null) {
                return false;
            }
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            long savedDialogId = getSavedDialogId(clientUserId, this.messageOwner);
            long peerDialogId = DialogObject.getPeerDialogId(this.messageOwner.fwd_from.saved_from_peer);
            if (peerDialogId >= 0) {
                peerDialogId = DialogObject.getPeerDialogId(this.messageOwner.fwd_from.from_id);
            }
            return peerDialogId == 0 ? savedDialogId >= 0 && savedDialogId != UserObject.ANONYMOUS : (savedDialogId == peerDialogId || peerDialogId == clientUserId) ? false : true;
        }
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

    public static boolean isForwardedMessage(TLRPC.Message message) {
        return ((message.flags & 4) == 0 || message.fwd_from == null) ? false : true;
    }

    public boolean isReply() {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        MessageObject messageObject = this.replyMessageObject;
        return ((messageObject != null && (messageObject.messageOwner instanceof TLRPC.TL_messageEmpty)) || (messageReplyHeader = (message = this.messageOwner).reply_to) == null || (messageReplyHeader.reply_to_msg_id == 0 && messageReplyHeader.reply_to_random_id == 0) || (message.flags & 8) == 0) ? false : true;
    }

    public boolean isMediaEmpty() {
        return isMediaEmpty(this.messageOwner);
    }

    public boolean isMediaEmpty(boolean z) {
        return isMediaEmpty(this.messageOwner, z);
    }

    public boolean isMediaEmptyWebpage() {
        return isMediaEmptyWebpage(this.messageOwner);
    }

    public static boolean isMediaEmpty(TLRPC.Message message) {
        return isMediaEmpty(message, true);
    }

    public static boolean isMediaEmpty(TLRPC.Message message, boolean z) {
        return message == null || getMedia(message) == null || (getMedia(message) instanceof TLRPC.TL_messageMediaEmpty) || (z && (getMedia(message) instanceof TLRPC.TL_messageMediaWebPage));
    }

    public static boolean isMediaEmptyWebpage(TLRPC.Message message) {
        return message == null || getMedia(message) == null || (getMedia(message) instanceof TLRPC.TL_messageMediaEmpty);
    }

    public boolean hasReplies() {
        TLRPC.MessageReplies messageReplies = this.messageOwner.replies;
        return messageReplies != null && messageReplies.replies > 0;
    }

    public boolean canViewThread() {
        MessageObject messageObject;
        if (this.messageOwner.action != null) {
            return false;
        }
        return hasReplies() || !(((messageObject = this.replyMessageObject) == null || messageObject.messageOwner.replies == null) && getReplyTopMsgId() == 0);
    }

    public boolean isComments() {
        TLRPC.MessageReplies messageReplies = this.messageOwner.replies;
        return messageReplies != null && messageReplies.comments;
    }

    public boolean isLinkedToChat(long j) {
        TLRPC.MessageReplies messageReplies = this.messageOwner.replies;
        return messageReplies != null && (j == 0 || messageReplies.channel_id == j);
    }

    public int getRepliesCount() {
        TLRPC.MessageReplies messageReplies = this.messageOwner.replies;
        if (messageReplies != null) {
            return messageReplies.replies;
        }
        return 0;
    }

    public boolean canEditMessage(TLRPC.Chat chat) {
        return canEditMessage(this.currentAccount, this.messageOwner, chat, this.scheduled);
    }

    public boolean canEditMessageScheduleTime(TLRPC.Chat chat) {
        return canEditMessageScheduleTime(this.currentAccount, this.messageOwner, chat);
    }

    public boolean canForwardMessage() {
        int i;
        return (isQuickReply() || (i = this.type) == 30 || i == 31 || i == 32 || i == 33 || i == 35 || (this.messageOwner instanceof TLRPC.TL_message_secret) || needDrawBluredPreview() || isLiveLocation() || this.type == 16 || isSponsored() || this.messageOwner.noforwards) ? false : true;
    }

    public boolean canEditMedia() {
        if (isSecretMedia()) {
            return false;
        }
        if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) {
            return true;
        }
        return getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument ? (isVoice() || isSticker() || isAnimatedSticker() || isRoundVideo()) ? false : true : isMediaEmpty();
    }

    public boolean canEditMessageAnytime(TLRPC.Chat chat) {
        return canEditMessageAnytime(this.currentAccount, this.messageOwner, chat);
    }

    public static boolean canEditMessageAnytime(int i, TLRPC.Message message, TLRPC.Chat chat) {
        TLRPC.MessageAction messageAction;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        if (message != null && message.peer_id != null && ((getMedia(message) == null || (!isRoundVideoDocument(getMedia(message).document) && !isStickerDocument(getMedia(message).document) && !isAnimatedStickerDocument(getMedia(message).document, true))) && (((messageAction = message.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty)) && !isForwardedMessage(message) && message.via_bot_id == 0 && message.id >= 0))) {
            TLRPC.Peer peer = message.from_id;
            if (peer instanceof TLRPC.TL_peerUser) {
                long j = peer.user_id;
                if (j == message.peer_id.user_id && j == UserConfig.getInstance(i).getClientUserId() && !isLiveLocationMessage(message)) {
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

    public static boolean canEditMessageScheduleTime(int i, TLRPC.Message message, TLRPC.Chat chat) {
        if (message.video_processing_pending) {
            return false;
        }
        if (chat == null && message.peer_id.channel_id != 0 && (chat = MessagesController.getInstance(i).getChat(Long.valueOf(message.peer_id.channel_id))) == null) {
            return false;
        }
        if (!ChatObject.isChannel(chat) || chat.megagroup || chat.creator) {
            return true;
        }
        TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
        return tL_chatAdminRights != null && (tL_chatAdminRights.edit_messages || message.out);
    }

    public static boolean canEditMessage(int i, TLRPC.Message message, TLRPC.Chat chat, boolean z) {
        TLRPC.MessageAction messageAction;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights3;
        if (z && message.date < ConnectionsManager.getInstance(i).getCurrentTime() - 60) {
            return false;
        }
        if (chat != null && ((chat.left || chat.kicked) && (!chat.megagroup || !chat.has_link))) {
            return false;
        }
        TLRPC.MessageMedia media = getMedia(message);
        if (message != null && message.peer_id != null && ((media == null || (!isRoundVideoDocument(media.document) && !isStickerDocument(media.document) && !isAnimatedStickerDocument(media.document, true) && !isLocationMessage(message))) && (((messageAction = message.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty)) && !isForwardedMessage(message) && message.via_bot_id == 0 && message.id >= 0 && !message.paid_suggested_post_stars && !message.paid_suggested_post_ton))) {
            TLRPC.Peer peer = message.from_id;
            if (peer instanceof TLRPC.TL_peerUser) {
                long j = peer.user_id;
                if (j == message.peer_id.user_id && j == UserConfig.getInstance(i).getClientUserId() && !isLiveLocationMessage(message) && !(media instanceof TLRPC.TL_messageMediaContact)) {
                    return true;
                }
            }
            if (chat == null && message.peer_id.channel_id != 0 && (chat = MessagesController.getInstance(i).getChat(Long.valueOf(message.peer_id.channel_id))) == null) {
                return false;
            }
            if (media != null && !(media instanceof TLRPC.TL_messageMediaEmpty) && !(media instanceof TLRPC.TL_messageMediaPhoto) && !(media instanceof TLRPC.TL_messageMediaDocument) && !(media instanceof TLRPC.TL_messageMediaWebPage) && !(media instanceof TLRPC.TL_messageMediaPaidMedia) && !(media instanceof TLRPC.TL_messageMediaToDo)) {
                return false;
            }
            if (ChatObject.isChannel(chat) && !chat.megagroup && (chat.creator || ((tL_chatAdminRights3 = chat.admin_rights) != null && tL_chatAdminRights3.edit_messages))) {
                return true;
            }
            if (message.out && chat != null && chat.megagroup && (chat.creator || (((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.pin_messages) || ((tL_chatBannedRights = chat.default_banned_rights) != null && !tL_chatBannedRights.pin_messages)))) {
                return true;
            }
            if (!z && Math.abs(message.date - ConnectionsManager.getInstance(i).getCurrentTime()) > MessagesController.getInstance(i).maxEditTime) {
                return false;
            }
            if (message.peer_id.channel_id == 0) {
                if (!message.out) {
                    TLRPC.Peer peer2 = message.from_id;
                    if (!(peer2 instanceof TLRPC.TL_peerUser) || peer2.user_id != UserConfig.getInstance(i).getClientUserId()) {
                        return false;
                    }
                }
                return (media instanceof TLRPC.TL_messageMediaPhoto) || !(!(media instanceof TLRPC.TL_messageMediaDocument) || isStickerMessage(message) || isAnimatedStickerMessage(message)) || (media instanceof TLRPC.TL_messageMediaEmpty) || (media instanceof TLRPC.TL_messageMediaWebPage) || (media instanceof TLRPC.TL_messageMediaPaidMedia) || (media instanceof TLRPC.TL_messageMediaToDo) || media == null;
            }
            if (((chat != null && chat.megagroup && message.out) || (chat != null && !chat.megagroup && ((chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && (tL_chatAdminRights.edit_messages || (message.out && tL_chatAdminRights.post_messages)))) && message.post))) && ((media instanceof TLRPC.TL_messageMediaPhoto) || (((media instanceof TLRPC.TL_messageMediaDocument) && !isStickerMessage(message) && !isAnimatedStickerMessage(message)) || (media instanceof TLRPC.TL_messageMediaEmpty) || (media instanceof TLRPC.TL_messageMediaWebPage) || (media instanceof TLRPC.TL_messageMediaPaidMedia) || (media instanceof TLRPC.TL_messageMediaToDo) || media == null))) {
                return true;
            }
        }
        return false;
    }

    public boolean canDeleteMessage(boolean z, TLRPC.Chat chat) {
        TLRPC.Message message;
        return (isStory() && (message = this.messageOwner) != null && message.dialog_id == UserConfig.getInstance(this.currentAccount).getClientUserId()) || (this.eventId == 0 && this.sponsoredId == null && canDeleteMessage(this.currentAccount, z, this.messageOwner, chat));
    }

    public static boolean canDeleteMessage(int i, boolean z, TLRPC.Message message, TLRPC.Chat chat) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
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
            chat = MessagesController.getInstance(i).getChat(Long.valueOf(message.peer_id.channel_id));
        }
        if (!ChatObject.isChannel(chat)) {
            return z || isOut(message) || !ChatObject.isChannel(chat);
        }
        if (z && !chat.megagroup) {
            if (!chat.creator) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = chat.admin_rights;
                if (tL_chatAdminRights2 == null) {
                    return false;
                }
                if (!tL_chatAdminRights2.delete_messages && !message.out) {
                    return false;
                }
            }
            return true;
        }
        boolean z2 = message.out;
        if (z2 && (message instanceof TLRPC.TL_messageService)) {
            return message.id != 1 && ChatObject.canUserDoAdminAction(chat, 13);
        }
        if (!z) {
            if (message.id == 1) {
                return false;
            }
            if (!chat.creator && (((tL_chatAdminRights = chat.admin_rights) == null || (!tL_chatAdminRights.delete_messages && (!z2 || (!chat.megagroup && !tL_chatAdminRights.post_messages)))) && (!chat.megagroup || !z2))) {
                return false;
            }
        }
        return true;
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

    public int getReplyMsgId() {
        TLRPC.MessageReplyHeader messageReplyHeader = this.messageOwner.reply_to;
        if (messageReplyHeader != null) {
            return messageReplyHeader.reply_to_msg_id;
        }
        return 0;
    }

    public int getReplyTopMsgId() {
        TLRPC.MessageReplyHeader messageReplyHeader = this.messageOwner.reply_to;
        if (messageReplyHeader != null) {
            return messageReplyHeader.reply_to_top_id;
        }
        return 0;
    }

    public int getReplyTopMsgId(boolean z) {
        TLRPC.MessageReplyHeader messageReplyHeader = this.messageOwner.reply_to;
        if (messageReplyHeader == null) {
            return 0;
        }
        if (z && (messageReplyHeader.flags & 2) > 0 && messageReplyHeader.reply_to_top_id == 0) {
            return 1;
        }
        return messageReplyHeader.reply_to_top_id;
    }

    public static long getReplyToDialogId(TLRPC.Message message) {
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        if (messageReplyHeader == null) {
            return 0L;
        }
        TLRPC.Peer peer = messageReplyHeader.reply_to_peer_id;
        if (peer != null) {
            return getPeerId(peer);
        }
        return getDialogId(message);
    }

    public int getReplyAnyMsgId() {
        TLRPC.MessageReplyHeader messageReplyHeader = this.messageOwner.reply_to;
        if (messageReplyHeader == null) {
            return 0;
        }
        int i = messageReplyHeader.reply_to_top_id;
        return i != 0 ? i : messageReplyHeader.reply_to_msg_id;
    }

    public boolean isPrivateForward() {
        TLRPC.MessageFwdHeader messageFwdHeader = this.messageOwner.fwd_from;
        return (messageFwdHeader == null || TextUtils.isEmpty(messageFwdHeader.from_name)) ? false : true;
    }

    public boolean isImportedForward() {
        TLRPC.MessageFwdHeader messageFwdHeader = this.messageOwner.fwd_from;
        return messageFwdHeader != null && messageFwdHeader.imported;
    }

    public long getSenderId() {
        TLRPC.Peer peer;
        TLRPC.Message message = this.messageOwner;
        TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
        if (messageFwdHeader != null && (peer = messageFwdHeader.saved_from_peer) != null) {
            long j = peer.user_id;
            if (j != 0) {
                TLRPC.Peer peer2 = messageFwdHeader.from_id;
                return peer2 instanceof TLRPC.TL_peerUser ? peer2.user_id : j;
            }
            if (peer.channel_id != 0) {
                if (isSavedFromMegagroup()) {
                    TLRPC.Peer peer3 = this.messageOwner.fwd_from.from_id;
                    if (peer3 instanceof TLRPC.TL_peerUser) {
                        return peer3.user_id;
                    }
                }
                TLRPC.MessageFwdHeader messageFwdHeader2 = this.messageOwner.fwd_from;
                TLRPC.Peer peer4 = messageFwdHeader2.from_id;
                if (peer4 instanceof TLRPC.TL_peerChannel) {
                    return -peer4.channel_id;
                }
                if (peer4 instanceof TLRPC.TL_peerChat) {
                    return -peer4.chat_id;
                }
                return -messageFwdHeader2.saved_from_peer.channel_id;
            }
            long j2 = peer.chat_id;
            if (j2 != 0) {
                TLRPC.Peer peer5 = messageFwdHeader.from_id;
                if (peer5 instanceof TLRPC.TL_peerUser) {
                    return peer5.user_id;
                }
                if (peer5 instanceof TLRPC.TL_peerChannel) {
                    return -peer5.channel_id;
                }
                return peer5 instanceof TLRPC.TL_peerChat ? -peer5.chat_id : -j2;
            }
        } else {
            TLRPC.Peer peer6 = message.from_id;
            if (peer6 instanceof TLRPC.TL_peerUser) {
                return peer6.user_id;
            }
            if (peer6 instanceof TLRPC.TL_peerChannel) {
                return -peer6.channel_id;
            }
            if (peer6 instanceof TLRPC.TL_peerChat) {
                return -peer6.chat_id;
            }
            if (message.post) {
                return message.peer_id.channel_id;
            }
        }
        return 0L;
    }

    public boolean isWallpaper() {
        return (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && getMedia(this.messageOwner).webpage != null && "telegram_background".equals(getMedia(this.messageOwner).webpage.type);
    }

    public boolean isTheme() {
        return (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && getMedia(this.messageOwner).webpage != null && "telegram_theme".equals(getMedia(this.messageOwner).webpage.type);
    }

    public int getMediaExistanceFlags() {
        boolean z = this.attachPathExists;
        return this.mediaExists ? (z ? 1 : 0) | 2 : z ? 1 : 0;
    }

    public void applyMediaExistanceFlags(int i) {
        if (i == -1) {
            checkMediaExistance();
        } else {
            this.attachPathExists = (i & 1) != 0;
            this.mediaExists = (i & 2) != 0;
        }
    }

    public void checkMediaExistance() {
        checkMediaExistance(true);
    }

    public void checkMediaExistance(boolean z) {
        int i;
        this.attachPathExists = false;
        this.mediaExists = false;
        int i2 = this.type;
        if (i2 == 20) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) this.messageOwner.media.extended_media.get(0);
            if (tL_messageExtendedMediaPreview.thumb != null) {
                File pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(tL_messageExtendedMediaPreview.thumb, z);
                if (!this.mediaExists) {
                    this.mediaExists = pathToAttach.exists() || (tL_messageExtendedMediaPreview.thumb instanceof TLRPC.TL_photoStrippedSize);
                }
            }
        } else if (i2 == 1 && FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, AndroidUtilities.getPhotoSize(true)) != null) {
            File pathToMessage = FileLoader.getInstance(this.currentAccount).getPathToMessage(this.messageOwner, z);
            if (needDrawBluredPreview()) {
                this.mediaExists = new File(pathToMessage.getAbsolutePath() + ".enc").exists();
            }
            if (!this.mediaExists) {
                this.mediaExists = pathToMessage.exists();
            }
        }
        if ((!this.mediaExists && this.type == 8) || (i = this.type) == 3 || i == 9 || i == 2 || i == 14 || i == 5) {
            String str = this.messageOwner.attachPath;
            if (str != null && str.length() > 0) {
                this.attachPathExists = new File(this.messageOwner.attachPath).exists();
            }
            if (!this.attachPathExists) {
                File pathToMessage2 = FileLoader.getInstance(this.currentAccount).getPathToMessage(this.messageOwner, z);
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
            if (document != null) {
                if (isWallpaper()) {
                    this.mediaExists = FileLoader.getInstance(this.currentAccount).getPathToAttach(document, null, true, z).exists();
                } else {
                    this.mediaExists = FileLoader.getInstance(this.currentAccount).getPathToAttach(document, null, false, z).exists();
                }
            } else {
                int i3 = this.type;
                if (i3 == 0) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, AndroidUtilities.getPhotoSize());
                    if (closestPhotoSizeWithSize == null) {
                        return;
                    } else {
                        this.mediaExists = FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, null, true, z).exists();
                    }
                } else if (i3 == 11) {
                    TLRPC.Photo photo = this.messageOwner.action.photo;
                    if (photo == null || photo.video_sizes.isEmpty()) {
                        return;
                    } else {
                        this.mediaExists = FileLoader.getInstance(this.currentAccount).getPathToAttach(photo.video_sizes.get(0), null, true, z).exists();
                    }
                }
            }
        }
        updateQualitiesCached(z);
    }

    public void setQuery(String str) {
        setQuery(str, true);
    }

    public void setQuery(String str, boolean z) {
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
                handleFoundWords(arrayList, split, true, z);
                return;
            }
            arrayList2.addAll(Arrays.asList(lowerCase2.split("[^\\p{L}#$]+")));
        }
        if (!TextUtils.isEmpty(this.messageOwner.message)) {
            String lowerCase3 = this.messageOwner.message.trim().toLowerCase();
            if (lowerCase3.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
                handleFoundWords(arrayList, split, false, z);
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
                for (int i = 0; i < arrayList2.size(); i++) {
                    if (!arrayList.contains(arrayList2.get(i)) && (indexOf = (str2 = (String) arrayList2.get(i)).indexOf(str4.charAt(0))) >= 0) {
                        int max = Math.max(str4.length(), str2.length());
                        if (indexOf != 0) {
                            str2 = str2.substring(indexOf);
                        }
                        int min = Math.min(str4.length(), str2.length());
                        int i2 = 0;
                        for (int i3 = 0; i3 < min && str2.charAt(i3) == str4.charAt(i3); i3++) {
                            i2++;
                        }
                        if (i2 / max >= 0.5d) {
                            arrayList.add((String) arrayList2.get(i));
                        }
                    }
                }
            }
        }
        handleFoundWords(arrayList, split, false, z);
    }

    private void handleFoundWords(ArrayList<String> arrayList, String[] strArr, boolean z) {
        handleFoundWords(arrayList, strArr, z, true);
    }

    private void handleFoundWords(ArrayList<String> arrayList, String[] strArr, boolean z, boolean z2) {
        CharSequence charSequence;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        boolean z3;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z4 = false;
        for (int i = 0; i < arrayList.size(); i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= strArr.length) {
                    break;
                }
                if (arrayList.get(i).contains(strArr[i2])) {
                    z4 = true;
                    break;
                }
                i2++;
            }
            if (z4) {
                break;
            }
        }
        if (z4) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                int i4 = 0;
                while (true) {
                    if (i4 >= strArr.length) {
                        z3 = false;
                        break;
                    } else {
                        if (arrayList.get(i3).contains(strArr[i4])) {
                            z3 = true;
                            break;
                        }
                        i4++;
                    }
                }
                if (!z3) {
                    arrayList.remove(i3);
                    i3--;
                }
                i3++;
            }
            if (arrayList.size() > 0) {
                Collections.sort(arrayList, new Comparator() { // from class: org.telegram.messenger.MessageObject$$ExternalSyntheticLambda9
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int lambda$handleFoundWords$3;
                        lambda$handleFoundWords$3 = MessageObject.lambda$handleFoundWords$3((String) obj, (String) obj2);
                        return lambda$handleFoundWords$3;
                    }
                });
                String str = arrayList.get(0);
                arrayList.clear();
                arrayList.add(str);
            }
        }
        this.highlightedWords = arrayList;
        if (this.messageOwner.message != null) {
            applyEntities();
            if (!TextUtils.isEmpty(this.caption)) {
                charSequence = this.caption;
            } else {
                charSequence = this.messageText;
            }
            CharSequence replaceMultipleCharSequence = AndroidUtilities.replaceMultipleCharSequence("\n", charSequence, " ");
            if (z && (message = this.messageOwner) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.quote_text != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.messageOwner.reply_to.quote_text);
                addEntitiesToText(spannableStringBuilder, this.messageOwner.reply_to.quote_entities, isOutOwner(), false, false, false);
                SpannableString spannableString = new SpannableString("q ");
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_quote);
                coloredImageSpan.setOverrideColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4));
                spannableString.setSpan(coloredImageSpan, 0, 1, 33);
                replaceMultipleCharSequence = new SpannableStringBuilder(spannableString).append((CharSequence) spannableStringBuilder).append('\n').append(replaceMultipleCharSequence);
            }
            String charSequence2 = replaceMultipleCharSequence.toString();
            int length = charSequence2.length();
            int indexOf = charSequence2.toLowerCase().indexOf(arrayList.get(0));
            if (indexOf < 0) {
                indexOf = 0;
            }
            if (length > 120 && z2) {
                float f = 120;
                int max = Math.max(0, indexOf - ((int) (0.1f * f)));
                replaceMultipleCharSequence = replaceMultipleCharSequence.subSequence(max, Math.min(length, (indexOf - max) + indexOf + ((int) (f * 0.9f))));
            }
            this.messageTrimmedToHighlight = replaceMultipleCharSequence;
            this.messageTrimmedToHighlightCut = z2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$handleFoundWords$3(String str, String str2) {
        return str2.length() - str.length();
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
                this.mediaThumb = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, NotificationCenter.wallpaperSettedToUser, false, null, true), document);
                this.mediaSmallThumb = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                return;
            } else {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, 50);
                this.mediaThumb = ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, NotificationCenter.wallpaperSettedToUser, false, closestPhotoSizeWithSize2, true), this.photoThumbsObject);
                this.mediaSmallThumb = ImageLocation.getForObject(closestPhotoSizeWithSize2, this.photoThumbsObject);
                return;
            }
        }
        if (isVideo()) {
            TLRPC.Document document2 = getDocument();
            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, 50);
            this.mediaThumb = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, NotificationCenter.wallpaperSettedToUser), document2);
            this.mediaSmallThumb = ImageLocation.getForDocument(closestPhotoSizeWithSize3, document2);
            return;
        }
        if (!(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) || getMedia(this.messageOwner).photo == null || this.photoThumbs.isEmpty()) {
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, 50);
        this.mediaThumb = ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, NotificationCenter.wallpaperSettedToUser, false, closestPhotoSizeWithSize4, false), this.photoThumbsObject);
        this.mediaSmallThumb = ImageLocation.getForObject(closestPhotoSizeWithSize4, this.photoThumbsObject);
    }

    public boolean hasHighlightedWords() {
        ArrayList<String> arrayList = this.highlightedWords;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public boolean equals(MessageObject messageObject) {
        return messageObject != null && getId() == messageObject.getId() && getDialogId() == messageObject.getDialogId();
    }

    public boolean isReactionsAvailable() {
        return (isEditing() || isSponsored() || !isSent() || isExpiredStory() || !canSetReaction()) ? false : true;
    }

    public boolean isPaidReactionChosen() {
        if (this.messageOwner.reactions == null) {
            return false;
        }
        for (int i = 0; i < this.messageOwner.reactions.results.size(); i++) {
            if (this.messageOwner.reactions.results.get(i).reaction instanceof TLRPC.TL_reactionPaid) {
                return this.messageOwner.reactions.results.get(i).chosen;
            }
        }
        return false;
    }

    public void addPaidReactions(int i, boolean z, long j) {
        TLRPC.Message message = this.messageOwner;
        if (message.reactions == null) {
            message.reactions = new TLRPC.TL_messageReactions();
            TLRPC.Message message2 = this.messageOwner;
            message2.reactions.reactions_as_tags = getDialogId(message2) == UserConfig.getInstance(this.currentAccount).getClientUserId();
            this.messageOwner.reactions.can_see_list = isFromGroup() || isFromUser();
        }
        addPaidReactions(this.currentAccount, this.messageOwner.reactions, i, j, z);
    }

    public Long getMyPaidReactionPeer() {
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        TLRPC.Message message = this.messageOwner;
        if (message == null || (tL_messageReactions = message.reactions) == null || (arrayList = tL_messageReactions.top_reactors) == null) {
            return null;
        }
        Iterator<TLRPC.MessageReactor> it = arrayList.iterator();
        while (it.hasNext()) {
            TLRPC.MessageReactor next = it.next();
            if (next != null && next.my) {
                if (next.anonymous) {
                    return Long.valueOf(UserObject.ANONYMOUS);
                }
                TLRPC.Peer peer = next.peer_id;
                if (peer != null) {
                    return Long.valueOf(DialogObject.getPeerDialogId(peer));
                }
            }
        }
        return null;
    }

    public static Long getMyPaidReactionPeer(TLRPC.MessageReactions messageReactions) {
        ArrayList<TLRPC.MessageReactor> arrayList;
        if (messageReactions == null || (arrayList = messageReactions.top_reactors) == null) {
            return null;
        }
        Iterator<TLRPC.MessageReactor> it = arrayList.iterator();
        while (it.hasNext()) {
            TLRPC.MessageReactor next = it.next();
            if (next != null && next.my) {
                if (next.anonymous) {
                    return Long.valueOf(UserObject.ANONYMOUS);
                }
                TLRPC.Peer peer = next.peer_id;
                if (peer != null) {
                    return Long.valueOf(DialogObject.getPeerDialogId(peer));
                }
            }
        }
        return null;
    }

    public void setMyPaidReactionDialogId(long j) {
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        TLRPC.Message message = this.messageOwner;
        if (message == null || (tL_messageReactions = message.reactions) == null || (arrayList = tL_messageReactions.top_reactors) == null) {
            return;
        }
        Iterator<TLRPC.MessageReactor> it = arrayList.iterator();
        while (it.hasNext()) {
            TLRPC.MessageReactor next = it.next();
            if (next != null && next.my) {
                boolean z = j == UserObject.ANONYMOUS;
                next.anonymous = z;
                if (z) {
                    next.flags &= -9;
                    next.peer_id = null;
                } else {
                    next.flags |= 8;
                    next.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(j);
                }
            }
        }
    }

    public boolean doesPaidReactionExist() {
        TLRPC.Message message = this.messageOwner;
        if (message.reactions == null) {
            message.reactions = new TLRPC.TL_messageReactions();
            TLRPC.Message message2 = this.messageOwner;
            message2.reactions.reactions_as_tags = getDialogId(message2) == UserConfig.getInstance(this.currentAccount).getClientUserId();
            this.messageOwner.reactions.can_see_list = isFromGroup() || isFromUser();
        }
        for (int i = 0; i < this.messageOwner.reactions.results.size(); i++) {
            if (this.messageOwner.reactions.results.get(i).reaction instanceof TLRPC.TL_reactionPaid) {
                return true;
            }
        }
        return false;
    }

    public boolean ensurePaidReactionsExist(boolean z) {
        TLRPC.Message message = this.messageOwner;
        if (message.reactions == null) {
            message.reactions = new TLRPC.TL_messageReactions();
            TLRPC.Message message2 = this.messageOwner;
            message2.reactions.reactions_as_tags = getDialogId(message2) == UserConfig.getInstance(this.currentAccount).getClientUserId();
            this.messageOwner.reactions.can_see_list = isFromGroup() || isFromUser();
        }
        TLRPC.ReactionCount reactionCount = null;
        for (int i = 0; i < this.messageOwner.reactions.results.size(); i++) {
            if (this.messageOwner.reactions.results.get(i).reaction instanceof TLRPC.TL_reactionPaid) {
                reactionCount = this.messageOwner.reactions.results.get(i);
            }
        }
        if (reactionCount != null) {
            return false;
        }
        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
        tL_reactionCount.reaction = new TLRPC.TL_reactionPaid();
        tL_reactionCount.count = 1;
        tL_reactionCount.chosen = z;
        this.messageOwner.reactions.results.add(0, tL_reactionCount);
        return true;
    }

    public static void addPaidReactions(int i, TLRPC.MessageReactions messageReactions, int i2, long j, boolean z) {
        TLRPC.MessageReactor messageReactor = null;
        TLRPC.ReactionCount reactionCount = null;
        for (int i3 = 0; i3 < messageReactions.results.size(); i3++) {
            if (messageReactions.results.get(i3).reaction instanceof TLRPC.TL_reactionPaid) {
                reactionCount = messageReactions.results.get(i3);
            }
        }
        int i4 = 0;
        while (true) {
            if (i4 >= messageReactions.top_reactors.size()) {
                break;
            }
            if (messageReactions.top_reactors.get(i4).my) {
                messageReactor = messageReactions.top_reactors.get(i4);
                break;
            }
            i4++;
        }
        if (reactionCount == null && i2 > 0) {
            reactionCount = new TLRPC.TL_reactionCount();
            reactionCount.reaction = new TLRPC.TL_reactionPaid();
            messageReactions.results.add(0, reactionCount);
        }
        if (reactionCount != null) {
            reactionCount.chosen = z;
            int max = Math.max(0, reactionCount.count + i2);
            reactionCount.count = max;
            if (max <= 0) {
                messageReactions.results.remove(reactionCount);
            }
        }
        if (messageReactor == null && i2 > 0) {
            messageReactor = new TLRPC.TL_messageReactor();
            messageReactor.my = true;
            messageReactions.top_reactors.add(messageReactor);
        }
        if (messageReactor != null) {
            messageReactor.count = Math.max(0, messageReactor.count + i2);
            messageReactor.anonymous = j == UserObject.ANONYMOUS;
            if (j == 0 || j == UserObject.ANONYMOUS) {
                messageReactor.peer_id = MessagesController.getInstance(i).getPeer(UserConfig.getInstance(i).getClientUserId());
            } else {
                messageReactor.peer_id = MessagesController.getInstance(i).getPeer(j);
            }
            if (messageReactor.count <= 0) {
                messageReactions.top_reactors.remove(messageReactor);
            }
        }
    }

    public boolean selectReaction(ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
        int i;
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
        int i2 = 0;
        for (int i3 = 0; i3 < this.messageOwner.reactions.results.size(); i3++) {
            TLRPC.ReactionCount reactionCount2 = this.messageOwner.reactions.results.get(i3);
            if (reactionCount2.chosen && !(reactionCount2.reaction instanceof TLRPC.TL_reactionPaid)) {
                arrayList.add(reactionCount2);
                int i4 = reactionCount2.chosen_order;
                if (i4 > i2) {
                    i2 = i4;
                }
            }
            TLRPC.Reaction reaction = this.messageOwner.reactions.results.get(i3).reaction;
            if (reaction instanceof TLRPC.TL_reactionEmoji) {
                String str = visibleReaction.emojicon;
                if (str != null) {
                    if (((TLRPC.TL_reactionEmoji) reaction).emoticon.equals(str)) {
                        reactionCount = this.messageOwner.reactions.results.get(i3);
                    }
                }
            }
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j = visibleReaction.documentId;
                if (j != 0 && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == j) {
                    reactionCount = this.messageOwner.reactions.results.get(i3);
                }
            }
        }
        if (!arrayList.isEmpty() && arrayList.contains(reactionCount) && z) {
            return true;
        }
        int maxUserReactionsCount = MessagesController.getInstance(this.currentAccount).getMaxUserReactionsCount();
        if (!arrayList.isEmpty() && arrayList.contains(reactionCount)) {
            if (reactionCount != null) {
                reactionCount.chosen = false;
                int i5 = reactionCount.count - 1;
                reactionCount.count = i5;
                if (i5 <= 0) {
                    this.messageOwner.reactions.results.remove(reactionCount);
                }
            }
            if (this.messageOwner.reactions.can_see_list) {
                int i6 = 0;
                while (i6 < this.messageOwner.reactions.recent_reactions.size()) {
                    if (getPeerId(this.messageOwner.reactions.recent_reactions.get(i6).peer_id) == UserConfig.getInstance(this.currentAccount).getClientUserId() && ReactionsUtils.compare(this.messageOwner.reactions.recent_reactions.get(i6).reaction, visibleReaction)) {
                        this.messageOwner.reactions.recent_reactions.remove(i6);
                        i6--;
                    }
                    i6++;
                }
            }
            this.reactionsChanged = true;
            return false;
        }
        while (!arrayList.isEmpty() && arrayList.size() >= maxUserReactionsCount) {
            int i7 = 0;
            for (int i8 = 1; i8 < arrayList.size(); i8++) {
                if (!(((TLRPC.ReactionCount) arrayList.get(i8)).reaction instanceof TLRPC.TL_reactionPaid) && ((TLRPC.ReactionCount) arrayList.get(i8)).chosen_order < ((TLRPC.ReactionCount) arrayList.get(i7)).chosen_order) {
                    i7 = i8;
                }
            }
            TLRPC.ReactionCount reactionCount3 = (TLRPC.ReactionCount) arrayList.get(i7);
            reactionCount3.chosen = false;
            int i9 = reactionCount3.count - 1;
            reactionCount3.count = i9;
            if (i9 <= 0) {
                this.messageOwner.reactions.results.remove(reactionCount3);
            }
            arrayList.remove(reactionCount3);
            if (this.messageOwner.reactions.can_see_list) {
                int i10 = 0;
                while (i10 < this.messageOwner.reactions.recent_reactions.size()) {
                    if (getPeerId(this.messageOwner.reactions.recent_reactions.get(i10).peer_id) == UserConfig.getInstance(this.currentAccount).getClientUserId() && ReactionsUtils.compare(this.messageOwner.reactions.recent_reactions.get(i10).reaction, visibleReaction)) {
                        this.messageOwner.reactions.recent_reactions.remove(i10);
                        i10--;
                    }
                    i10++;
                }
            }
        }
        if (reactionCount == null) {
            int chatMaxUniqReactions = MessagesController.getInstance(this.currentAccount).getChatMaxUniqReactions(getDialogId());
            TLRPC.Message message3 = this.messageOwner;
            if (message3 == null || (tL_messageReactions = message3.reactions) == null) {
                i = 0;
            } else {
                Iterator<TLRPC.ReactionCount> it = tL_messageReactions.results.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!(it.next().reaction instanceof TLRPC.TL_reactionPaid)) {
                        i++;
                    }
                }
            }
            if (i + 1 > chatMaxUniqReactions) {
                return false;
            }
            reactionCount = new TLRPC.TL_reactionCount();
            reactionCount.reaction = visibleReaction.toTLReaction();
            this.messageOwner.reactions.results.add(reactionCount);
        }
        reactionCount.chosen = true;
        reactionCount.count++;
        reactionCount.chosen_order = i2 + 1;
        TLRPC.Message message4 = this.messageOwner;
        if (message4.reactions.can_see_list || (message4.dialog_id > 0 && maxUserReactionsCount > 1)) {
            TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
            TLRPC.Message message5 = this.messageOwner;
            if (message5.isThreadMessage && message5.fwd_from != null) {
                tL_messagePeerReaction.peer_id = MessagesController.getInstance(this.currentAccount).getSendAsSelectedPeer(getFromChatId());
            } else {
                tL_messagePeerReaction.peer_id = MessagesController.getInstance(this.currentAccount).getSendAsSelectedPeer(getDialogId());
            }
            this.messageOwner.reactions.recent_reactions.add(0, tL_messagePeerReaction);
            if (visibleReaction.emojicon != null) {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                tL_messagePeerReaction.reaction = tL_reactionEmoji;
                tL_reactionEmoji.emoticon = visibleReaction.emojicon;
            } else {
                TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                tL_messagePeerReaction.reaction = tL_reactionCustomEmoji;
                tL_reactionCustomEmoji.document_id = visibleReaction.documentId;
            }
        }
        this.reactionsChanged = true;
        return true;
    }

    public boolean probablyRingtone() {
        if (!isVoiceOnce() && getDocument() != null && RingtoneDataStore.ringtoneSupportedMimeType.contains(getDocument().mime_type) && getDocument().size < MessagesController.getInstance(this.currentAccount).ringtoneSizeMax * 2) {
            for (int i = 0; i < getDocument().attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = getDocument().attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && documentAttribute.duration < 5.0d) {
                    return true;
                }
            }
        }
        return false;
    }

    public byte[] getWaveform() {
        if (getDocument() == null) {
            return null;
        }
        int i = 0;
        for (int i2 = 0; i2 < getDocument().attributes.size(); i2++) {
            TLRPC.DocumentAttribute documentAttribute = getDocument().attributes.get(i2);
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
                if (i >= bArr2.length) {
                    break;
                }
                bArr2[i] = (byte) (Math.random() * 255.0d);
                i++;
            }
        }
        return this.randomWaveform;
    }

    public boolean isStory() {
        return this.storyItem != null;
    }

    public boolean isBotPreview() {
        return this.storyItem instanceof StoriesController.BotPreview;
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

    public boolean isStoryMention() {
        return this.type == 24 && !isExpiredStory();
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

    public boolean isAnyGift() {
        int i = this.type;
        return i == 30 || i == 18 || i == 25;
    }

    public static CharSequence userSpan() {
        return userSpan(0);
    }

    public static CharSequence userSpan(int i) {
        if (userSpan == null) {
            userSpan = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = userSpan;
        if (charSequenceArr[i] == null) {
            charSequenceArr[i] = new SpannableStringBuilder("u");
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_reply_user);
            coloredImageSpan.spaceScaleX = 0.9f;
            if (i == 0) {
                coloredImageSpan.translate(0.0f, AndroidUtilities.dp(1.0f));
            }
            ((SpannableStringBuilder) userSpan[i]).setSpan(coloredImageSpan, 0, 1, 33);
        }
        return userSpan[i];
    }

    public static CharSequence groupSpan() {
        if (groupSpan == null) {
            groupSpan = new SpannableStringBuilder(ImageLoader.AUTOPLAY_FILTER);
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_folders_groups);
            coloredImageSpan.setScale(0.7f, 0.7f);
            ((SpannableStringBuilder) groupSpan).setSpan(coloredImageSpan, 0, 1, 33);
        }
        return groupSpan;
    }

    public static CharSequence channelSpan() {
        if (channelSpan == null) {
            channelSpan = new SpannableStringBuilder("c");
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_folders_channels);
            coloredImageSpan.setScale(0.7f, 0.7f);
            ((SpannableStringBuilder) channelSpan).setSpan(coloredImageSpan, 0, 1, 33);
        }
        return channelSpan;
    }

    public static CharSequence peerNameWithIcon(int i, TLRPC.Peer peer) {
        return peerNameWithIcon(i, peer, !(peer instanceof TLRPC.TL_peerUser));
    }

    public static CharSequence peerNameWithIcon(int i, TLRPC.Peer peer, boolean z) {
        TLRPC.Chat chat;
        if (peer instanceof TLRPC.TL_peerUser) {
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(peer.user_id));
            if (user == null) {
                return "";
            }
            if (z) {
                return new SpannableStringBuilder(userSpan()).append((CharSequence) " ").append((CharSequence) UserObject.getUserName(user));
            }
            return UserObject.getUserName(user);
        }
        if (peer instanceof TLRPC.TL_peerChat) {
            TLRPC.Chat chat2 = MessagesController.getInstance(i).getChat(Long.valueOf(peer.chat_id));
            if (chat2 == null) {
                return "";
            }
            if (z) {
                return new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat2) ? channelSpan() : groupSpan()).append((CharSequence) " ").append((CharSequence) chat2.title);
            }
            return chat2.title;
        }
        if (!(peer instanceof TLRPC.TL_peerChannel) || (chat = MessagesController.getInstance(i).getChat(Long.valueOf(peer.channel_id))) == null) {
            return "";
        }
        if (z) {
            return new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat) ? channelSpan() : groupSpan()).append((CharSequence) " ").append((CharSequence) chat.title);
        }
        return chat.title;
    }

    public static CharSequence peerNameWithIcon(int i, long j) {
        return peerNameWithIcon(i, j, false);
    }

    public static CharSequence peerNameWithIcon(int i, long j, boolean z) {
        if (j >= 0) {
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
            if (user != null) {
                return AndroidUtilities.removeDiacritics(UserObject.getUserName(user));
            }
            return "";
        }
        TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
        if (chat != null) {
            return new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat) ? channelSpan() : groupSpan()).append((CharSequence) " ").append((CharSequence) AndroidUtilities.removeDiacritics(chat.title));
        }
        return "";
    }

    public CharSequence getReplyQuoteNameWithIcon() {
        CharSequence charSequence;
        CharSequence spannableStringBuilder;
        TLRPC.Message message = this.messageOwner;
        if (message == null) {
            return "";
        }
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        CharSequence charSequence2 = null;
        if (messageReplyHeader == null) {
            if (DialogObject.isChatDialog(getDialogId())) {
                charSequence = peerNameWithIcon(this.currentAccount, getDialogId());
            } else {
                spannableStringBuilder = peerNameWithIcon(this.currentAccount, getDialogId());
                charSequence2 = spannableStringBuilder;
                charSequence = null;
            }
        } else {
            if (messageReplyHeader.reply_from != null) {
                TLRPC.Peer peer = messageReplyHeader.reply_to_peer_id;
                boolean z = peer == null || DialogObject.getPeerDialogId(peer) != getDialogId();
                TLRPC.MessageFwdHeader messageFwdHeader = this.messageOwner.reply_to.reply_from;
                TLRPC.Peer peer2 = messageFwdHeader.from_id;
                if (peer2 != null) {
                    if (peer2 instanceof TLRPC.TL_peerUser) {
                        spannableStringBuilder = peerNameWithIcon(this.currentAccount, peer2, z);
                        charSequence2 = spannableStringBuilder;
                        charSequence = null;
                    } else {
                        charSequence = peerNameWithIcon(this.currentAccount, peer2, z);
                    }
                } else {
                    TLRPC.Peer peer3 = messageFwdHeader.saved_from_peer;
                    if (peer3 != null) {
                        if (peer3 instanceof TLRPC.TL_peerUser) {
                            spannableStringBuilder = peerNameWithIcon(this.currentAccount, peer3, z);
                        } else {
                            charSequence = peerNameWithIcon(this.currentAccount, peer3, z);
                        }
                    } else if (!TextUtils.isEmpty(messageFwdHeader.from_name)) {
                        if (z) {
                            spannableStringBuilder = new SpannableStringBuilder(userSpan()).append((CharSequence) " ").append((CharSequence) this.messageOwner.reply_to.reply_from.from_name);
                        } else {
                            spannableStringBuilder = new SpannableStringBuilder(this.messageOwner.reply_to.reply_from.from_name);
                        }
                    }
                    charSequence2 = spannableStringBuilder;
                    charSequence = null;
                }
            }
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
        if (charSequence == null || charSequence2 == null) {
            return charSequence != null ? charSequence : charSequence2 != null ? charSequence2 : LocaleController.getString(R.string.Loading);
        }
        return new SpannableStringBuilder(charSequence2).append((CharSequence) " ").append(charSequence);
    }

    public boolean hasLinkMediaToMakeSmall() {
        boolean z = !this.isRestrictedMessage && (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && (getMedia(this.messageOwner).webpage instanceof TLRPC.TL_webPage);
        TLRPC.WebPage webPage = z ? getMedia(this.messageOwner).webpage : null;
        String str = webPage != null ? webPage.type : null;
        if (!z || isGiveawayOrGiveawayResults() || webPage == null) {
            return false;
        }
        if (webPage.photo != null || isVideoDocument(webPage.document)) {
            return ((TextUtils.isEmpty(webPage.description) && TextUtils.isEmpty(webPage.title)) || isSponsored() || "telegram_megagroup".equals(str) || "telegram_background".equals(str) || "telegram_voicechat".equals(str) || "telegram_videochat".equals(str) || "telegram_livestream".equals(str) || "telegram_user".equals(str) || "telegram_story".equals(str) || "telegram_channel_boost".equals(str) || "telegram_group_boost".equals(str) || "telegram_chat".equals(str)) ? false : true;
        }
        return false;
    }

    public boolean isLinkMediaSmall() {
        TLRPC.WebPage webPage = (!this.isRestrictedMessage && (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && (getMedia(this.messageOwner).webpage instanceof TLRPC.TL_webPage)) ? getMedia(this.messageOwner).webpage : null;
        String str = webPage != null ? webPage.type : null;
        return !(webPage != null && TextUtils.isEmpty(webPage.description) && TextUtils.isEmpty(webPage.title)) && ("app".equals(str) || "profile".equals(str) || "article".equals(str) || "telegram_bot".equals(str) || "telegram_user".equals(str) || "telegram_channel".equals(str) || "telegram_megagroup".equals(str) || "telegram_voicechat".equals(str) || "telegram_videochat".equals(str) || "telegram_livestream".equals(str) || "telegram_channel_boost".equals(str) || "telegram_group_boost".equals(str) || "telegram_chat".equals(str));
    }

    public static class TextRange {
        public boolean code;
        public boolean collapse;
        public int end;
        public String language;
        public boolean quote;
        public int start;

        public TextRange(int i, int i2) {
            this.start = i;
            this.end = i2;
        }

        public TextRange(int i, int i2, boolean z, boolean z2, boolean z3, String str) {
            this.start = i;
            this.end = i2;
            this.quote = z;
            this.code = z2;
            this.collapse = z && z3;
            this.language = str;
        }
    }

    public static void cutIntoRanges(CharSequence charSequence, ArrayList<TextRange> arrayList) {
        String str;
        int i;
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
        QuoteSpan.QuoteStyleSpan[] quoteStyleSpanArr = (QuoteSpan.QuoteStyleSpan[]) spanned.getSpans(0, spanned.length(), QuoteSpan.QuoteStyleSpan.class);
        for (int i2 = 0; i2 < quoteStyleSpanArr.length; i2++) {
            QuoteSpan.QuoteStyleSpan quoteStyleSpan = quoteStyleSpanArr[i2];
            quoteStyleSpan.span.adaptLineHeight = false;
            int spanStart = spanned.getSpanStart(quoteStyleSpan);
            int spanEnd = spanned.getSpanEnd(quoteStyleSpanArr[i2]);
            treeSet.add(Integer.valueOf(spanStart));
            hashMap.put(Integer.valueOf(spanStart), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanStart)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue() : 0) | (quoteStyleSpanArr[i2].span.isCollapsing ? 16 : 1)));
            treeSet.add(Integer.valueOf(spanEnd));
            hashMap.put(Integer.valueOf(spanEnd), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue() : 0) | 2));
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            if (intValue >= 0 && intValue < spanned.length() && hashMap.containsKey(num)) {
                int intValue2 = ((Integer) hashMap.get(num)).intValue();
                if ((intValue2 & 17) != 0 && (intValue2 & 2) != 0 && spanned.charAt(intValue) != '\n' && (intValue - 1 <= 0 || spanned.charAt(i) != '\n')) {
                    it.remove();
                    hashMap.remove(num);
                }
            }
        }
        CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) spanned.getSpans(0, spanned.length(), CodeHighlighting.Span.class);
        for (int i3 = 0; i3 < spanArr.length; i3++) {
            int spanStart2 = spanned.getSpanStart(spanArr[i3]);
            int spanEnd2 = spanned.getSpanEnd(spanArr[i3]);
            treeSet.add(Integer.valueOf(spanStart2));
            hashMap.put(Integer.valueOf(spanStart2), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanStart2)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart2))).intValue() : 0) | 4));
            treeSet.add(Integer.valueOf(spanEnd2));
            hashMap.put(Integer.valueOf(spanEnd2), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd2)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd2))).intValue() : 0) | 8));
        }
        Iterator it2 = treeSet.iterator();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (it2.hasNext()) {
            Integer num2 = (Integer) it2.next();
            int intValue3 = num2.intValue();
            int intValue4 = ((Integer) hashMap.get(num2)).intValue();
            if (i6 != intValue3) {
                int i8 = intValue3 - 1;
                if (i8 >= 0 && i8 < charSequence.length() && charSequence.charAt(i8) == '\n') {
                    intValue3--;
                }
                int i9 = intValue3;
                if ((intValue4 & 8) == 0 || i5 >= spanArr.length) {
                    str = null;
                } else {
                    str = spanArr[i5].lng;
                    i5++;
                }
                int i10 = i5;
                arrayList.add(new TextRange(i6, i9, i4 > 0, i7 > 0, z, str));
                i6 = i9 + 1;
                if (i6 >= charSequence.length() || charSequence.charAt(i9) != '\n') {
                    i6 = i9;
                }
                i5 = i10;
            }
            if ((intValue4 & 2) != 0) {
                i4--;
            }
            if ((intValue4 & 1) != 0 || (intValue4 & 16) != 0) {
                i4++;
                z = (intValue4 & 16) != 0;
            }
            if ((intValue4 & 8) != 0) {
                i7--;
            }
            if ((intValue4 & 4) != 0) {
                i7++;
            }
        }
        if (i6 < charSequence.length()) {
            arrayList.add(new TextRange(i6, charSequence.length(), i4 > 0, i7 > 0, z, null));
        }
    }

    public void toggleChannelRecommendations() {
        expandChannelRecommendations(!this.channelJoinedExpanded);
    }

    public void expandChannelRecommendations(boolean z) {
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        String str = "c" + getDialogId() + "_rec";
        this.channelJoinedExpanded = z;
        edit.putBoolean(str, z).apply();
    }

    public static int findQuoteStart(String str, String str2, int i) {
        if (str == null || str2 == null) {
            return -1;
        }
        if (i == -1) {
            return str.indexOf(str2);
        }
        if (str2.length() + i < str.length() && str.startsWith(str2, i)) {
            return i;
        }
        int indexOf = str.indexOf(str2, i);
        int lastIndexOf = str.lastIndexOf(str2, i);
        return indexOf == -1 ? lastIndexOf : (lastIndexOf != -1 && indexOf - i >= i - lastIndexOf) ? lastIndexOf : indexOf;
    }

    public void applyQuickReply(String str, int i) {
        TLRPC.Message message = this.messageOwner;
        if (message == null) {
            return;
        }
        if (i != 0) {
            message.flags |= TLObject.FLAG_30;
            message.quick_reply_shortcut_id = i;
            TLRPC.TL_inputQuickReplyShortcutId tL_inputQuickReplyShortcutId = new TLRPC.TL_inputQuickReplyShortcutId();
            tL_inputQuickReplyShortcutId.shortcut_id = i;
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

    public static int getQuickReplyId(int i, TLRPC.Message message) {
        QuickRepliesController.QuickReply findReply;
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
        if (quickReplyName == null || (findReply = QuickRepliesController.getInstance(i).findReply(quickReplyName)) == null) {
            return 0;
        }
        return findReply.id;
    }

    public int getQuickReplyId() {
        return getQuickReplyId(this.messageOwner);
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

    public String getQuickReplyName() {
        return getQuickReplyName(this.messageOwner);
    }

    public String getQuickReplyDisplayName() {
        String quickReplyName = getQuickReplyName();
        if (quickReplyName != null) {
            return quickReplyName;
        }
        QuickRepliesController.QuickReply findReply = QuickRepliesController.getInstance(this.currentAccount).findReply(getQuickReplyId());
        if (findReply != null) {
            return findReply.name;
        }
        return "";
    }

    public static boolean isQuickReply(TLRPC.Message message) {
        return (message == null || ((message.flags & TLObject.FLAG_30) == 0 && message.quick_reply_shortcut == null)) ? false : true;
    }

    public boolean isQuickReply() {
        return isQuickReply(this.messageOwner);
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

    public boolean isFactCheckable() {
        int i;
        return getId() >= 0 && !isSponsored() && ((i = this.type) == 0 || i == 2 || i == 1 || i == 3 || i == 8 || i == 9);
    }

    public boolean hasEntitiesFromServer() {
        TLRPC.Message message = this.messageOwner;
        if (message == null || message.entities == null) {
            return false;
        }
        for (int i = 0; i < this.messageOwner.entities.size(); i++) {
            TLRPC.MessageEntity messageEntity = this.messageOwner.entities.get(i);
            if ((messageEntity instanceof TLRPC.TL_messageEntityPhone) || (messageEntity instanceof TLRPC.TL_messageEntityBankCard)) {
                return true;
            }
        }
        return false;
    }

    public boolean isAlbumSingle() {
        return getMedia(this) instanceof TLRPC.TL_messageMediaPaidMedia;
    }

    public boolean hasVideoQualities() {
        return hasVideoQualities(true);
    }

    public boolean hasVideoQualities(boolean z) {
        TLRPC.MessageMedia messageMedia;
        if (this.videoQualitiesCached == null) {
            try {
                TLRPC.Message message = this.messageOwner;
                boolean z2 = false;
                if (message != null && (messageMedia = message.media) != null && messageMedia.document != null && !messageMedia.alt_documents.isEmpty()) {
                    int i = this.currentAccount;
                    TLRPC.Message message2 = this.messageOwner;
                    ArrayList<VideoPlayer.Quality> qualities = VideoPlayer.getQualities(i, message2 != null ? message2.media : null, z);
                    this.videoQualities = qualities;
                    if (qualities != null && qualities.size() > 1) {
                        z2 = true;
                    }
                    this.videoQualitiesCached = Boolean.valueOf(z2);
                    this.highestQuality = VideoPlayer.getQualityForPlayer(this.videoQualities);
                    this.thumbQuality = VideoPlayer.getQualityForThumb(this.videoQualities);
                    this.cachedQuality = VideoPlayer.getCachedQuality(this.videoQualities);
                }
                this.videoQualitiesCached = Boolean.FALSE;
                return false;
            } catch (Exception e) {
                FileLog.e(e);
                this.videoQualitiesCached = Boolean.FALSE;
            }
        }
        return this.videoQualitiesCached.booleanValue();
    }

    public boolean isStarGiftAction() {
        TLRPC.Message message = this.messageOwner;
        if (message != null) {
            TLRPC.MessageAction messageAction = message.action;
            if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return true;
            }
        }
        return false;
    }

    public boolean mediaExists() {
        VideoPlayer.VideoUri videoUri;
        if (hasVideoQualities() && (videoUri = this.highestQuality) != null) {
            return videoUri.isCached();
        }
        return this.mediaExists;
    }

    public void updateQualitiesCached(boolean z) {
        ArrayList<VideoPlayer.Quality> arrayList = this.videoQualities;
        if (arrayList == null) {
            this.cachedQuality = null;
            hasVideoQualities(z);
            return;
        }
        Iterator<VideoPlayer.Quality> it = arrayList.iterator();
        while (it.hasNext()) {
            Iterator it2 = it.next().uris.iterator();
            while (it2.hasNext()) {
                ((VideoPlayer.VideoUri) it2.next()).updateCached(z);
            }
        }
        this.highestQuality = VideoPlayer.getQualityForPlayer(this.videoQualities);
        this.thumbQuality = VideoPlayer.getQualityForThumb(this.videoQualities);
        this.cachedQuality = VideoPlayer.getCachedQuality(this.videoQualities);
    }

    public boolean areTags() {
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.Message message = this.messageOwner;
        if (message == null || (tL_messageReactions = message.reactions) == null) {
            return false;
        }
        return tL_messageReactions.reactions_as_tags;
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
        int i = media.video_timestamp;
        if (i != 0) {
            return i;
        }
        TLRPC.WebPage webPage = media.webpage;
        if (webPage != null && (str = webPage.url) != null) {
            try {
                int timestampFromLink = LaunchActivity.getTimestampFromLink(Uri.parse(str));
                this.cachedStartsTimestamp = Integer.valueOf(timestampFromLink);
                return timestampFromLink;
            } catch (Exception unused) {
            }
        }
        this.cachedStartsTimestamp = -1;
        return -1;
    }

    public float getVideoSavedProgress() {
        if (this.cachedSavedTimestamp != null) {
            return PhotoViewer.getSavedProgressFast(this);
        }
        float savedProgress = PhotoViewer.getSavedProgress(this);
        this.cachedSavedTimestamp = Float.valueOf(savedProgress);
        return savedProgress;
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

    public boolean hasVideoCover() {
        return getVideoCover() != null;
    }

    public boolean isPaid() {
        TLRPC.Message message = this.messageOwner;
        return message != null && message.paid_message_stars > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private CharSequence getActionSuggestionApprovalText(String str, String str2) {
        TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval;
        int i;
        String formatString;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        int i5;
        TLRPC.Message message;
        TLRPC.Message message2 = this.messageOwner;
        if (message2 != null) {
            TLRPC.MessageAction messageAction = message2.action;
            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                if (tL_messageActionSuggestedPostApproval != null) {
                    return null;
                }
                MessageSuggestionParams of = MessageSuggestionParams.of(tL_messageActionSuggestedPostApproval);
                boolean canManageMonoForum = ChatObject.canManageMonoForum(this.currentAccount, DialogObject.getPeerDialogId(this.messageOwner.peer_id));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (tL_messageActionSuggestedPostApproval.balance_too_low) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestionAgreementNotEnoughStars, str2)));
                } else if (tL_messageActionSuggestedPostApproval.rejected) {
                    MessageObject messageObject = this.replyMessageObject;
                    if (messageObject == null || (message = messageObject.messageOwner) == null) {
                        z = true;
                    } else {
                        long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
                        z = peerDialogId == DialogObject.getPeerDialogId(this.replyMessageObject.messageOwner.saved_peer_id);
                        if (peerDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                            z2 = true;
                            if (!TextUtils.isEmpty(tL_messageActionSuggestedPostApproval.reject_comment)) {
                                i5 = z2 ? R.string.SuggestionAgreementDeclinedYou : R.string.SuggestionAgreementDeclinedThis;
                            } else {
                                i5 = z2 ? R.string.SuggestionAgreementDeclinedYouComment : R.string.SuggestionAgreementDeclinedThisComment;
                            }
                            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i5, !z ? str : str2)));
                            if (!TextUtils.isEmpty(tL_messageActionSuggestedPostApproval.reject_comment)) {
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.8f), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                int length = spannableStringBuilder.length();
                                spannableStringBuilder.append('\"');
                                spannableStringBuilder.append((CharSequence) tL_messageActionSuggestedPostApproval.reject_comment);
                                spannableStringBuilder.append('\"');
                                spannableStringBuilder.setSpan(new EllipsizeSpanAnimator.TextAlphaSpan(NotificationCenter.availableEffectsUpdate), length, spannableStringBuilder.length(), 33);
                            }
                        }
                    }
                    z2 = false;
                    if (!TextUtils.isEmpty(tL_messageActionSuggestedPostApproval.reject_comment)) {
                    }
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i5, !z ? str : str2)));
                    if (!TextUtils.isEmpty(tL_messageActionSuggestedPostApproval.reject_comment)) {
                    }
                } else {
                    int i6 = (int) MessagesController.getInstance(this.currentAccount).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                    int i7 = tL_messageActionSuggestedPostApproval.schedule_date;
                    if (i7 > 0) {
                        String formatDateTime = LocaleController.formatDateTime(i7, true);
                        if (tL_messageActionSuggestedPostApproval.schedule_date > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                            if (canManageMonoForum) {
                                i4 = R.string.SuggestionAgreementReachedAdmin1;
                            } else {
                                i4 = R.string.SuggestionAgreementReachedUser1;
                            }
                        } else if (canManageMonoForum) {
                            i4 = R.string.SuggestionAgreementReachedAdmin1PastSimple;
                        } else {
                            i4 = R.string.SuggestionAgreementReachedUser1PastSimple;
                        }
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i4, str, formatDateTime)));
                    } else {
                        if (canManageMonoForum) {
                            i = R.string.SuggestionAgreementReachedAdmin1PresentPerfect;
                        } else {
                            i = R.string.SuggestionAgreementReachedUser1PresentPerfect;
                        }
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i, str)));
                    }
                    AmountUtils$Amount amountUtils$Amount = of.amount;
                    if (amountUtils$Amount != null && !amountUtils$Amount.isZero()) {
                        AmountUtils$Amount amountUtils$Amount2 = of.amount;
                        AmountUtils$Currency amountUtils$Currency = amountUtils$Amount2.currency;
                        AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.TON;
                        boolean z3 = amountUtils$Currency == amountUtils$Currency2;
                        if (canManageMonoForum) {
                            formatString = LocaleController.formatString(R.string.SuggestionAgreementReachedAdmin2, str2, amountUtils$Amount2.asDecimalString());
                        } else {
                            formatString = LocaleController.formatString(R.string.SuggestionAgreementReachedUser2, amountUtils$Amount2.asDecimalString());
                        }
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6f), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) StarsIntroActivity.replaceStars(of.amount.currency == amountUtils$Currency2, AndroidUtilities.replaceTags(formatString)));
                        if (z3) {
                            if (canManageMonoForum) {
                                i2 = R.string.SuggestionAgreementReachedAdmin3TON;
                            } else {
                                i2 = R.string.SuggestionAgreementReachedUser3TON;
                            }
                        } else if (canManageMonoForum) {
                            i2 = R.string.SuggestionAgreementReachedAdmin3Stars;
                        } else {
                            i2 = R.string.SuggestionAgreementReachedUser3Stars;
                        }
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6f), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i2, str, Integer.valueOf(i6))));
                        if (z3) {
                            if (canManageMonoForum) {
                                i3 = R.string.SuggestionAgreementReachedAdmin4TON;
                            } else {
                                i3 = R.string.SuggestionAgreementReachedUser4TON;
                            }
                        } else if (canManageMonoForum) {
                            i3 = R.string.SuggestionAgreementReachedAdmin4Stars;
                        } else {
                            i3 = R.string.SuggestionAgreementReachedUser4Stars;
                        }
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6f), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i3, str, Integer.valueOf(i6))));
                    }
                }
                return spannableStringBuilder;
            }
        }
        tL_messageActionSuggestedPostApproval = null;
        if (tL_messageActionSuggestedPostApproval != null) {
        }
    }

    public static TLRPC.PollAnswer findPollItem(MessageObject messageObject, byte[] bArr) {
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        TLRPC.Poll poll;
        TLRPC.MessageMedia media = getMedia(messageObject);
        if ((media instanceof TLRPC.TL_messageMediaPoll) && (poll = (tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media).poll) != null && poll.answers != null) {
            for (int i = 0; i < tL_messageMediaPoll.poll.answers.size(); i++) {
                TLRPC.PollAnswer pollAnswer = tL_messageMediaPoll.poll.answers.get(i);
                if (Arrays.equals(pollAnswer.option, bArr)) {
                    return pollAnswer;
                }
            }
        }
        return null;
    }

    public static TLRPC.TodoItem findTodoItem(MessageObject messageObject, int i) {
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo;
        TLRPC.TodoList todoList;
        TLRPC.MessageMedia media = getMedia(messageObject);
        if ((media instanceof TLRPC.TL_messageMediaToDo) && (todoList = (tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) media).todo) != null && todoList.list != null) {
            for (int i2 = 0; i2 < tL_messageMediaToDo.todo.list.size(); i2++) {
                TLRPC.TodoItem todoItem = tL_messageMediaToDo.todo.list.get(i2);
                if (todoItem.id == i) {
                    return todoItem;
                }
            }
        }
        return null;
    }

    public static boolean isCompleted(MessageObject messageObject, int i) {
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo;
        TLRPC.TodoList todoList;
        TLRPC.MessageMedia media = getMedia(messageObject);
        if (!(media instanceof TLRPC.TL_messageMediaToDo) || (todoList = (tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) media).todo) == null || todoList.list == null) {
            return false;
        }
        return isCompleted(tL_messageMediaToDo, i);
    }

    public static boolean isCompleted(TLRPC.TL_messageMediaToDo tL_messageMediaToDo, int i) {
        for (int i2 = 0; i2 < tL_messageMediaToDo.completions.size(); i2++) {
            if (tL_messageMediaToDo.completions.get(i2).id == i) {
                return true;
            }
        }
        return false;
    }

    public static void toggleTodo(int i, long j, TLRPC.TL_messageMediaToDo tL_messageMediaToDo, int i2, boolean z, int i3) {
        int i4 = 0;
        while (i4 < tL_messageMediaToDo.completions.size()) {
            if (tL_messageMediaToDo.completions.get(i4).id == i2) {
                tL_messageMediaToDo.completions.remove(i4);
                if (tL_messageMediaToDo.completions.isEmpty()) {
                    tL_messageMediaToDo.flags &= -2;
                }
                i4--;
            }
            i4++;
        }
        if (z) {
            TLRPC.TL_todoCompletion tL_todoCompletion = new TLRPC.TL_todoCompletion();
            tL_todoCompletion.id = i2;
            tL_todoCompletion.completed_by = MessagesController.getInstance(i).getPeer(j);
            tL_todoCompletion.date = i3;
            tL_messageMediaToDo.flags |= 1;
            tL_messageMediaToDo.completions.add(tL_todoCompletion);
        }
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

    public boolean isPaidSuggestedPost() {
        TLRPC.Message message = this.messageOwner;
        return message != null && (message.paid_suggested_post_stars || message.paid_suggested_post_ton);
    }

    public boolean isPaidSuggestedPostProtected() {
        if (isPaidSuggestedPost()) {
            return ((long) (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.messageOwner.date)) < MessagesController.getInstance(this.currentAccount).config.starsSuggestedPostAgeMin.get(TimeUnit.SECONDS);
        }
        return false;
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

    public boolean isEditedSuggestionOffer() {
        TLRPC.Message message;
        MessageObject messageObject = this.replyMessageObject;
        return (messageObject == null || messageObject.messageOwner == null || (message = this.messageOwner) == null || message.suggested_post == null) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        if (r2.id != r4.id) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        r0 = r0.document;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        if (r0 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
    
        r2 = r1.document;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008c, code lost:
    
        if (r2 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
    
        if (r0.id == r2.id) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0097, code lost:
    
        if (r0 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0099, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009e, code lost:
    
        if (r1.document != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a0, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a1, code lost:
    
        if (r0 == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009b, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0084, code lost:
    
        r6 = r6 | 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0082, code lost:
    
        if ((r2 == null) != (r1.photo == null)) goto L49;
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
        int i = !AmountUtils$Amount.equals(suggestedPost.price, suggestedPost2.price) ? 1 : 0;
        if (suggestedPost.schedule_date != suggestedPost2.schedule_date) {
            i |= 2;
        }
        if (!TextUtils.equals(this.messageText, this.replyMessageObject.messageText)) {
            i |= 4;
        }
        if (!TextUtils.equals(this.caption, this.replyMessageObject.caption)) {
            i |= 4;
        }
        TLRPC.MessageMedia messageMedia = message.media;
        TLRPC.MessageMedia messageMedia2 = message2.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaEmpty) {
            messageMedia = null;
        }
        TLRPC.MessageMedia messageMedia3 = messageMedia2 instanceof TLRPC.TL_messageMediaEmpty ? null : messageMedia2;
        if (messageMedia == null || messageMedia3 == null) {
            if ((messageMedia == null) == (messageMedia3 == null)) {
                return i;
            }
        } else if (messageMedia.getClass() == messageMedia3.getClass()) {
            TLRPC.Photo photo = messageMedia.photo;
            if (photo == null || (r4 = messageMedia3.photo) == null) {
            }
        }
        return i | 8;
    }

    public CharSequence getMessageTextToTranslate(GroupedMessages groupedMessages, int[] iArr) {
        if (this.translated || this.isRestrictedMessage) {
            return null;
        }
        if (this.summarized) {
            return this.messageText;
        }
        int i = this.type;
        if (i == 19 || i == 15 || i == 13) {
            return null;
        }
        CharSequence messageCaption = ChatActivity.getMessageCaption(this, groupedMessages, iArr);
        if (messageCaption == null && isPoll()) {
            try {
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) this.messageOwner.media).poll;
                StringBuilder sb = new StringBuilder(poll.question.text);
                sb.append("\n");
                Iterator<TLRPC.PollAnswer> it = poll.answers.iterator();
                while (it.hasNext()) {
                    TLRPC.PollAnswer next = it.next();
                    sb.append("\n🔘 ");
                    TLRPC.TL_textWithEntities tL_textWithEntities = next.text;
                    sb.append(tL_textWithEntities == null ? "" : tL_textWithEntities.text);
                }
                messageCaption = sb.toString();
            } catch (Exception unused) {
            }
        }
        if (messageCaption == null && isMediaEmpty(this.messageOwner)) {
            messageCaption = ChatActivity.getMessageContent(this, 0L, false);
        }
        if (messageCaption == null || !Emoji.fullyConsistsOfEmojis(messageCaption)) {
            return messageCaption;
        }
        return null;
    }

    public boolean needResendWhenEdit() {
        return (!ChatObject.isMonoForum(this.currentAccount, getDialogId()) || getFromChatId() == UserConfig.getInstance(this.currentAccount).getClientUserId() || isOutOwner()) ? false : true;
    }

    public static int getCompletionsCount(TLRPC.TL_messageMediaToDo tL_messageMediaToDo) {
        TLRPC.TodoList todoList;
        if (tL_messageMediaToDo == null || (todoList = tL_messageMediaToDo.todo) == null || todoList.list == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < tL_messageMediaToDo.completions.size(); i2++) {
            TLRPC.TodoCompletion todoCompletion = tL_messageMediaToDo.completions.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 >= tL_messageMediaToDo.todo.list.size()) {
                    break;
                }
                if (tL_messageMediaToDo.todo.list.get(i3).id == todoCompletion.id) {
                    i++;
                    break;
                }
                i3++;
            }
        }
        return i;
    }
}
