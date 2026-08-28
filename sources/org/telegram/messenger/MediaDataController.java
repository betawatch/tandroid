package org.telegram.messenger;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.util.Pair;
import android.util.SparseArray;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import of.r;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.Timer;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.if0;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.vz0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wu;
import org.telegram.ui.Components.wz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class MediaDataController extends BaseController {
    public static final String ATTACH_MENU_BOT_ANIMATED_ICON_KEY = "android_animated";
    public static final String ATTACH_MENU_BOT_ANIMATED_ICON_KEY_2 = "android_active_animated";
    public static final String ATTACH_MENU_BOT_COLOR_DARK_ICON = "dark_icon";
    public static final String ATTACH_MENU_BOT_COLOR_DARK_TEXT = "dark_text";
    public static final String ATTACH_MENU_BOT_COLOR_LIGHT_ICON = "light_icon";
    public static final String ATTACH_MENU_BOT_COLOR_LIGHT_TEXT = "light_text";
    public static final String ATTACH_MENU_BOT_PLACEHOLDER_STATIC_KEY = "placeholder_static";
    public static final String ATTACH_MENU_BOT_SIDE_MENU = "android_side_menu_static";
    public static final String ATTACH_MENU_BOT_SIDE_MENU_ICON_KEY = "android_side_menu_static";
    public static final String ATTACH_MENU_BOT_STATIC_ICON_KEY = "default_static";
    public static final int MAX_LINKS_COUNT = 250;
    public static final int MAX_STYLE_RUNS_COUNT = 1000;
    public static final int MEDIA_AUDIO = 2;
    public static final int MEDIA_FILE = 1;
    public static final int MEDIA_GIF = 5;
    public static final int MEDIA_MUSIC = 4;
    public static final int MEDIA_PHOTOS_ONLY = 6;
    public static final int MEDIA_PHOTOVIDEO = 0;
    public static final int MEDIA_POLL = 8;
    public static final int MEDIA_TYPES_COUNT = 9;
    public static final int MEDIA_URL = 3;
    public static final int MEDIA_VIDEOS_ONLY = 7;
    public static int SHORTCUT_TYPE_ATTACHED_BOT = 0;
    public static int SHORTCUT_TYPE_USER_OR_CHAT = 0;
    private static final int TOP_PEER_TYPE_BOT_GUEST = 3;
    private static final int TOP_PEER_TYPE_BOT_INLINE = 1;
    public static final int TYPE_EMOJI = 4;
    public static final int TYPE_EMOJIPACKS = 5;
    public static final int TYPE_FAVE = 2;
    public static final int TYPE_FEATURED = 3;
    public static final int TYPE_FEATURED_EMOJIPACKS = 6;
    public static final int TYPE_GREETINGS = 3;
    public static final int TYPE_IMAGE = 0;
    public static final int TYPE_MASK = 1;
    public static final int TYPE_PREMIUM_STICKERS = 7;
    private static RectF bitmapRect;
    private static Comparator<TLRPC.MessageEntity> entityComparator;
    private static Paint erasePaint;
    private static Paint roundPaint;
    private static Path roundPath;
    private HashMap<String, ArrayList<TLRPC.Document>> allStickers;
    private HashMap<String, ArrayList<TLRPC.Document>> allStickersFeatured;
    private int[] archivedStickersCount;
    private TLRPC.TL_attachMenuBots attachMenuBots;
    private a0.h botDialogKeyboards;
    private HashMap<String, TL_bots.BotInfo> botInfos;
    private HashMap<MessagesStorage.TopicKey, TLRPC.Message> botKeyboards;
    private a0.h botKeyboardsByMids;
    private boolean cleanedupStickerSetCache;
    private HashMap<String, Boolean> currentFetchingEmoji;
    public final ArrayList<bp> defaultEmojiThemes;
    private ArrayList<MessageObject> deletedFromResultMessages;
    private a0.h diceEmojiStickerSetsById;
    private HashMap<String, TLRPC.TL_messages_stickerSet> diceStickerSetsByEmoji;
    private String doubleTapReaction;
    private a0.h draftMessages;
    private SharedPreferences draftPreferences;
    public a0.h draftVoices;
    private boolean draftVoicesLoaded;
    private a0.h drafts;
    private a0.h draftsFolderIds;
    private ArrayList<TLRPC.EmojiStatus>[] emojiStatuses;
    private Long[] emojiStatusesFetchDate;
    private boolean[] emojiStatusesFetching;
    private boolean[] emojiStatusesFromCacheFetched;
    private long[] emojiStatusesHash;
    private List<TLRPC.TL_availableReaction> enabledReactionsList;
    private ArrayList<TLRPC.StickerSetCovered>[] featuredStickerSets;
    private a0.h[] featuredStickerSetsById;
    private boolean[] featuredStickersLoaded;
    private HashSet<String> fetchedEmoji;
    private TLRPC.Document greetingsSticker;
    public TLRPC.TL_emojiList groupAvatarConstructorDefault;
    private a0.h groupStickerSets;
    public ArrayList<TLRPC.TL_topPeer> guestBots;
    public ArrayList<TLRPC.TL_topPeer> hints;
    private boolean inTransaction;
    public ArrayList<TLRPC.TL_topPeer> inlineBots;
    private ArrayList<Long> installedForceStickerSetsById;
    private a0.h installedStickerSetsById;
    private boolean isLoadingMenuBots;
    private boolean isLoadingPremiumPromo;
    private boolean isLoadingReactions;
    private long lastDialogId;
    private int lastGuid;
    private long lastMergeDialogId;
    private hg.r0 lastReaction;
    private long lastReplyMessageId;
    private int lastReqId;
    private int lastReturnedNum;
    private TLRPC.Chat lastSearchChat;
    private String lastSearchQuery;
    private TLRPC.User lastSearchUser;
    private int[] loadDate;
    private int[] loadFeaturedDate;
    private long[] loadFeaturedHash;
    public boolean loadFeaturedPremium;
    private long[] loadHash;
    boolean loaded;
    private boolean loadedPredirectedSearchLocal;
    boolean loadedRecentReactions;
    boolean loadedSavedReactions;
    boolean loading;
    private boolean loadingDefaultTopicIcons;
    private HashSet<String> loadingDiceStickerSets;
    private boolean loadingDrafts;
    private boolean[] loadingFeaturedStickers;
    private boolean loadingGenericAnimations;
    private boolean loadingMoreSearchMessages;
    private a0.h loadingPinnedMessages;
    private boolean loadingPremiumGiftStickers;
    private boolean loadingPremiumTonStickers;
    private boolean loadingRecentGifs;
    boolean loadingRecentReactions;
    private boolean[] loadingRecentStickers;
    boolean loadingSavedReactions;
    private boolean loadingSearchLocal;
    private final HashMap<SearchStickersKey, Integer> loadingSearchStickersKeys;
    private final HashMap<String, ArrayList<Utilities.Callback2<Boolean, TLRPC.TL_messages_stickerSet>>> loadingStickerSets;
    private final HashSet<String> loadingStickerSetsKeys;
    private boolean[] loadingStickers;
    private int menuBotsUpdateDate;
    private long menuBotsUpdateHash;
    private boolean menuBotsUpdatedLocal;
    private int mergeReqId;
    private int messagesLocalSearchCount;
    private int[] messagesSearchCount;
    private boolean[] messagesSearchEndReached;
    public final ArrayList<TLRPC.Document> premiumPreviewStickers;
    private TLRPC.TL_help_premiumPromo premiumPromo;
    private int premiumPromoUpdateDate;
    boolean previewStickersLoading;
    public TLRPC.TL_emojiList profileAvatarConstructorDefault;
    private boolean reactionsCacheGenerated;
    private List<TLRPC.TL_availableReaction> reactionsList;
    private HashMap<String, TLRPC.TL_availableReaction> reactionsMap;
    private int reactionsUpdateDate;
    private int reactionsUpdateHash;
    private ArrayList<Long>[] readingStickerSets;
    private ArrayList<TLRPC.Document> recentGifs;
    private boolean recentGifsLoaded;
    ArrayList<TLRPC.Reaction> recentReactions;
    private ArrayList<TLRPC.Document>[] recentStickers;
    private boolean[] recentStickersLoaded;
    private a0.h removingStickerSetsUndos;
    public TLRPC.TL_emojiList replyIconsDefault;
    private int reqId;
    public TLRPC.TL_emojiList restrictedStatusEmojis;
    public final bf.d ringtoneDataStore;
    public HashMap<String, bf.e> ringtoneUploaderHashMap;
    ArrayList<TLRPC.Reaction> savedReactions;
    private Runnable[] scheduledLoadStickers;
    public ArrayList<MessageObject> searchLocalResultMessages;
    public ArrayList<MessageObject> searchResultMessages;
    public ArrayList<MessageObject> searchServerResultMessages;
    private SparseArray<MessageObject>[] searchServerResultMessagesMap;
    private final android.util.LruCache<SearchStickersKey, SearchStickersResult> searchStickerResults;
    public final HashMap<String, Utilities.Callback<Boolean>> shortcutCallbacks;
    private TLRPC.TL_messages_stickerSet stickerSetDefaultChannelStatuses;
    private TLRPC.TL_messages_stickerSet stickerSetDefaultStatuses;
    private ArrayList<TLRPC.TL_messages_stickerSet>[] stickerSets;
    private a0.h stickerSetsById;
    private ConcurrentHashMap<String, TLRPC.TL_messages_stickerSet> stickerSetsByName;
    private a0.h stickersByEmoji;
    private a0.h[] stickersByIds;
    private boolean[] stickersLoaded;
    ArrayList<TLRPC.Reaction> topReactions;
    private boolean triedLoadingEmojipacks;
    private ArrayList<Long> uninstalledForceStickerSetsById;
    private ArrayList<Long>[] unreadStickerSets;
    private HashMap<String, ArrayList<TLRPC.Message>> verifyingMessages;
    public ArrayList<TLRPC.TL_topPeer> webapps;
    private static Pattern BOLD_PATTERN = Pattern.compile("\\*\\*(.+?)\\*\\*");
    private static Pattern ITALIC_PATTERN = Pattern.compile("__(.+?)__");
    private static Pattern SPOILER_PATTERN = Pattern.compile("\\|\\|(.+?)\\|\\|");
    private static Pattern STRIKE_PATTERN = Pattern.compile("~~(.+?)~~");
    public static String SHORTCUT_CATEGORY = "org.telegram.messenger.SHORTCUT_SHARE";
    private static volatile MediaDataController[] Instance = new MediaDataController[4];
    private static final Object[] lockObjects = new Object[4];

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public class 1 implements Runnable {
        final /* synthetic */ int val$classGuid;
        final /* synthetic */ int val$count;
        final /* synthetic */ int val$fromCache;
        final /* synthetic */ boolean val$isChannel;
        final /* synthetic */ int val$max_id;
        final /* synthetic */ int val$min_id;
        final /* synthetic */ int val$requestIndex;
        final /* synthetic */ hg.r0 val$tag;
        final /* synthetic */ long val$topicId;
        final /* synthetic */ int val$type;
        final /* synthetic */ long val$uid;

        public 1(int i9, long j10, int i10, long j11, int i11, hg.r0 r0Var, int i12, int i13, int i14, boolean z10, int i15) {
            this.val$count = i9;
            this.val$uid = j10;
            this.val$min_id = i10;
            this.val$topicId = j11;
            this.val$type = i11;
            this.val$tag = r0Var;
            this.val$max_id = i12;
            this.val$classGuid = i13;
            this.val$fromCache = i14;
            this.val$isChannel = z10;
            this.val$requestIndex = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0(Runnable runnable, int i9) {
            MediaDataController.this.getMessagesStorage().completeTaskForGuid(runnable, i9);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v23 */
        /* JADX WARN: Type inference failed for: r4v24 */
        /* JADX WARN: Type inference failed for: r4v29 */
        /* JADX WARN: Type inference failed for: r4v30 */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v53 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v8, types: [org.telegram.messenger.MediaDataController$1] */
        @Override // java.lang.Runnable
        public void run() {
            p4 p4Var;
            long j10;
            ArrayList arrayList;
            SQLiteDatabase sQLiteDatabase;
            SQLiteCursor queryFinalized;
            boolean z10;
            boolean z11;
            TLRPC.TL_messages_messages tL_messages_messages;
            ArrayList<Long> arrayList2;
            long j11;
            ArrayList arrayList3;
            String str;
            String str2;
            int i9;
            boolean z12;
            String str3;
            ?? r42;
            String str4;
            String str5;
            String str6;
            int i10;
            int i11;
            SQLiteCursor queryFinalized2;
            boolean z13;
            String str7;
            String str8;
            String str9;
            int i12;
            SQLiteCursor queryFinalized3;
            int i13;
            String str10;
            String str11;
            String str12;
            int i14;
            SQLiteCursor queryFinalized4;
            int i15;
            SQLiteDatabase sQLiteDatabase2;
            1 r43;
            int i16;
            SQLiteCursor queryFinalized5;
            int i17;
            int intValue;
            int i18;
            1 r12 = this;
            long clientUserId = MediaDataController.this.getUserConfig().getClientUserId();
            TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
            boolean z14 = false;
            try {
                try {
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    ArrayList arrayList5 = new ArrayList();
                    int i19 = r12.val$count + 1;
                    SQLiteDatabase database = MediaDataController.this.getMessagesStorage().getDatabase();
                    TLRPC.TL_messages_messages tL_messages_messages3 = tL_messages_messages2;
                    try {
                        ArrayList<Long> arrayList6 = arrayList4;
                        if (DialogObject.isEncryptedDialog(r12.val$uid)) {
                            j10 = clientUserId;
                            arrayList = arrayList5;
                            sQLiteDatabase = database;
                            long j12 = r12.val$topicId;
                            if (j12 != 0) {
                                int i20 = r12.val$max_id;
                                if (i20 != 0) {
                                    Locale locale = Locale.US;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + r12.val$uid + " AND m.topic_id = " + j12 + " AND m.mid > " + i20 + " AND type = " + r12.val$type + " ORDER BY m.mid ASC LIMIT " + i19, new Object[0]);
                                } else {
                                    int i21 = r12.val$min_id;
                                    if (i21 != 0) {
                                        Locale locale2 = Locale.US;
                                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + r12.val$uid + " AND m.topic_id = " + j12 + " AND m.mid < " + i21 + " AND type = " + r12.val$type + " ORDER BY m.mid DESC LIMIT " + i19, new Object[0]);
                                    } else {
                                        Locale locale3 = Locale.US;
                                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + r12.val$uid + " AND m.topic_id = " + j12 + " AND type = " + r12.val$type + " ORDER BY m.mid ASC LIMIT " + i19, new Object[0]);
                                    }
                                }
                            } else {
                                int i22 = r12.val$max_id;
                                if (i22 != 0) {
                                    Locale locale4 = Locale.US;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + r12.val$uid + " AND m.mid > " + i22 + " AND type = " + r12.val$type + " ORDER BY m.mid ASC LIMIT " + i19, new Object[0]);
                                } else {
                                    int i23 = r12.val$min_id;
                                    if (i23 != 0) {
                                        Locale locale5 = Locale.US;
                                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + r12.val$uid + " AND m.mid < " + i23 + " AND type = " + r12.val$type + " ORDER BY m.mid DESC LIMIT " + i19, new Object[0]);
                                    } else {
                                        Locale locale6 = Locale.US;
                                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + r12.val$uid + " AND type = " + r12.val$type + " ORDER BY m.mid ASC LIMIT " + i19, new Object[0]);
                                    }
                                }
                            }
                            z10 = false;
                            z11 = true;
                        } else {
                            if (r12.val$min_id == 0) {
                                j10 = clientUserId;
                                long j13 = r12.val$topicId;
                                arrayList = arrayList5;
                                if (j13 != 0) {
                                    Locale locale7 = Locale.US;
                                    str = "SELECT max(end) FROM media_holes_topics WHERE uid = ";
                                    str2 = "t.tag = ";
                                    i9 = i19;
                                    queryFinalized5 = database.queryFinalized("SELECT start FROM media_holes_topics WHERE uid = " + r12.val$uid + " AND topic_id = " + j13 + " AND type = " + r12.val$type + " AND start IN (0, 1)", new Object[0]);
                                    i16 = 0;
                                } else {
                                    str = "SELECT max(end) FROM media_holes_topics WHERE uid = ";
                                    str2 = "t.tag = ";
                                    i9 = i19;
                                    Locale locale8 = Locale.US;
                                    i16 = 0;
                                    queryFinalized5 = database.queryFinalized("SELECT start FROM media_holes_v2 WHERE uid = " + r12.val$uid + " AND type = " + r12.val$type + " AND start IN (0, 1)", new Object[0]);
                                }
                                if (!queryFinalized5.next()) {
                                    queryFinalized5.dispose();
                                    long j14 = r12.val$topicId;
                                    if (j14 != 0) {
                                        Locale locale9 = Locale.US;
                                        queryFinalized5 = database.queryFinalized("SELECT min(mid) FROM media_topics WHERE uid = " + r12.val$uid + " AND topic_id = " + j14 + " AND type = " + r12.val$type + " AND mid > 0", new Object[0]);
                                        i17 = 0;
                                    } else {
                                        Locale locale10 = Locale.US;
                                        i17 = 0;
                                        queryFinalized5 = database.queryFinalized("SELECT min(mid) FROM media_v4 WHERE uid = " + r12.val$uid + " AND type = " + r12.val$type + " AND mid > 0", new Object[0]);
                                    }
                                    if (queryFinalized5.next() && (intValue = queryFinalized5.intValue(i17)) != 0) {
                                        SQLitePreparedStatement executeFast = r12.val$topicId != 0 ? database.executeFast("REPLACE INTO media_holes_topics VALUES(?, ?, ?, ?, ?)") : database.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                                        executeFast.requery();
                                        executeFast.bindLong(1, r12.val$uid);
                                        long j15 = r12.val$topicId;
                                        if (j15 != 0) {
                                            executeFast.bindLong(2, j15);
                                            i18 = 3;
                                        } else {
                                            i18 = 2;
                                        }
                                        executeFast.bindInteger(i18, r12.val$type);
                                        executeFast.bindInteger(i18 + 1, 0);
                                        executeFast.bindInteger(i18 + 2, intValue);
                                        executeFast.step();
                                        executeFast.dispose();
                                    }
                                } else if (queryFinalized5.intValue(i16) == 1) {
                                    z12 = true;
                                    queryFinalized5.dispose();
                                }
                                z12 = false;
                                queryFinalized5.dispose();
                            } else {
                                str = "SELECT max(end) FROM media_holes_topics WHERE uid = ";
                                str2 = "t.tag = ";
                                j10 = clientUserId;
                                arrayList = arrayList5;
                                i9 = i19;
                                z12 = false;
                            }
                            hg.r0 r0Var = r12.val$tag;
                            if (r0Var != null) {
                                long hashCode = !TextUtils.isEmpty(r0Var.f) ? r12.val$tag.f.hashCode() : r12.val$tag.g;
                                str3 = "INNER JOIN tag_message_id t ON m.mid = t.mid";
                                r42 = str2 + hashCode + " AND";
                            } else {
                                str3 = "";
                                r42 = "";
                            }
                            int i24 = r12.val$max_id;
                            z11 = z12;
                            try {
                                try {
                                    if (i24 != 0) {
                                        try {
                                            long j16 = r12.val$topicId;
                                            if (j16 != 0) {
                                                Locale locale11 = Locale.US;
                                                str12 = " WHERE ";
                                                str11 = " AND m.topic_id = ";
                                                str10 = r42;
                                                queryFinalized4 = database.queryFinalized("SELECT start, end FROM media_holes_topics WHERE uid = " + r12.val$uid + " AND topic_id = " + j16 + " AND type = " + r12.val$type + " AND start <= " + i24 + " ORDER BY end DESC LIMIT 1", new Object[0]);
                                                i14 = 0;
                                            } else {
                                                str10 = r42;
                                                str11 = " AND m.topic_id = ";
                                                str12 = " WHERE ";
                                                Locale locale12 = Locale.US;
                                                try {
                                                    i14 = 0;
                                                    queryFinalized4 = database.queryFinalized("SELECT start, end FROM media_holes_v2 WHERE uid = " + r12.val$uid + " AND type = " + r12.val$type + " AND start <= " + i24 + " ORDER BY end DESC LIMIT 1", new Object[0]);
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    r42 = r12;
                                                    r12 = r42;
                                                    tL_messages_messages2 = tL_messages_messages3;
                                                    tL_messages_messages2.messages.clear();
                                                    tL_messages_messages2.chats.clear();
                                                    tL_messages_messages2.users.clear();
                                                    FileLog.e(e);
                                                    p4Var = new p4(r12, r12, r12.val$classGuid, 1);
                                                    AndroidUtilities.runOnUIThread(p4Var);
                                                    MediaDataController.this.processLoadedMedia(tL_messages_messages2, r12.val$uid, r12.val$count, r12.val$max_id, r12.val$min_id, r12.val$type, r12.val$topicId, r12.val$fromCache, r12.val$classGuid, r12.val$isChannel, z14, r12.val$requestIndex);
                                                } catch (Throwable th) {
                                                    th = th;
                                                    r42 = r12;
                                                    r12 = r42;
                                                    tL_messages_messages2 = tL_messages_messages3;
                                                    AndroidUtilities.runOnUIThread(new p4(r12, r12, r12.val$classGuid, 1));
                                                    MediaDataController.this.processLoadedMedia(tL_messages_messages2, r12.val$uid, r12.val$count, r12.val$max_id, r12.val$min_id, r12.val$type, r12.val$topicId, r12.val$fromCache, r12.val$classGuid, r12.val$isChannel, false, r12.val$requestIndex);
                                                    throw th;
                                                }
                                            }
                                            if (queryFinalized4.next()) {
                                                queryFinalized4.intValue(i14);
                                                i15 = queryFinalized4.intValue(1);
                                            } else {
                                                i15 = 0;
                                            }
                                            queryFinalized4.dispose();
                                            long j17 = r12.val$topicId;
                                            if (j17 == 0) {
                                                sQLiteDatabase2 = database;
                                                int i25 = i9;
                                                String str13 = str12;
                                                String str14 = str10;
                                                if (i15 > 1) {
                                                    Locale locale13 = Locale.US;
                                                    queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + str13 + str14 + " m.uid = " + this.val$uid + " AND m.mid > 0 AND m.mid < " + this.val$max_id + " AND m.mid >= " + i15 + " AND m.type = " + this.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i25, new Object[0]);
                                                    z11 = false;
                                                    r43 = this;
                                                    r12 = r43;
                                                    sQLiteDatabase = sQLiteDatabase2;
                                                } else {
                                                    try {
                                                        Locale locale14 = Locale.US;
                                                        r43 = this;
                                                        sQLiteDatabase2 = sQLiteDatabase2;
                                                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + str13 + str14 + " m.uid = " + r43.val$uid + " AND m.mid > 0 AND m.mid < " + r43.val$max_id + " AND m.type = " + r43.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i25, new Object[0]);
                                                        r12 = r43;
                                                        sQLiteDatabase = sQLiteDatabase2;
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        r42 = this;
                                                        r12 = r42;
                                                        tL_messages_messages2 = tL_messages_messages3;
                                                        tL_messages_messages2.messages.clear();
                                                        tL_messages_messages2.chats.clear();
                                                        tL_messages_messages2.users.clear();
                                                        FileLog.e(e);
                                                        p4Var = new p4(r12, r12, r12.val$classGuid, 1);
                                                        AndroidUtilities.runOnUIThread(p4Var);
                                                        MediaDataController.this.processLoadedMedia(tL_messages_messages2, r12.val$uid, r12.val$count, r12.val$max_id, r12.val$min_id, r12.val$type, r12.val$topicId, r12.val$fromCache, r12.val$classGuid, r12.val$isChannel, z14, r12.val$requestIndex);
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        r42 = this;
                                                        r12 = r42;
                                                        tL_messages_messages2 = tL_messages_messages3;
                                                        AndroidUtilities.runOnUIThread(new p4(r12, r12, r12.val$classGuid, 1));
                                                        MediaDataController.this.processLoadedMedia(tL_messages_messages2, r12.val$uid, r12.val$count, r12.val$max_id, r12.val$min_id, r12.val$type, r12.val$topicId, r12.val$fromCache, r12.val$classGuid, r12.val$isChannel, false, r12.val$requestIndex);
                                                        throw th;
                                                    }
                                                }
                                            } else if (i15 > 1) {
                                                Locale locale15 = Locale.US;
                                                queryFinalized = database.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + str12 + str10 + " m.uid = " + r12.val$uid + str11 + j17 + " AND m.mid > 0 AND m.mid < " + r12.val$max_id + " AND m.mid >= " + i15 + " AND m.type = " + r12.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i9, new Object[0]);
                                                r43 = r12;
                                                sQLiteDatabase2 = database;
                                                z11 = false;
                                                r12 = r43;
                                                sQLiteDatabase = sQLiteDatabase2;
                                            } else {
                                                String str15 = str12;
                                                String str16 = str11;
                                                String str17 = str10;
                                                Locale locale16 = Locale.US;
                                                sQLiteDatabase2 = database;
                                                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + str15 + str17 + " m.uid = " + r12.val$uid + str16 + j17 + " AND m.mid > 0 AND m.mid < " + r12.val$max_id + " AND m.type = " + r12.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i9, new Object[0]);
                                                r43 = this;
                                                r12 = r43;
                                                sQLiteDatabase = sQLiteDatabase2;
                                            }
                                            z10 = z13;
                                        } catch (Exception e12) {
                                            e = e12;
                                            tL_messages_messages2 = tL_messages_messages3;
                                            tL_messages_messages2.messages.clear();
                                            tL_messages_messages2.chats.clear();
                                            tL_messages_messages2.users.clear();
                                            FileLog.e(e);
                                            p4Var = new p4(r12, r12, r12.val$classGuid, 1);
                                            AndroidUtilities.runOnUIThread(p4Var);
                                            MediaDataController.this.processLoadedMedia(tL_messages_messages2, r12.val$uid, r12.val$count, r12.val$max_id, r12.val$min_id, r12.val$type, r12.val$topicId, r12.val$fromCache, r12.val$classGuid, r12.val$isChannel, z14, r12.val$requestIndex);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            tL_messages_messages2 = tL_messages_messages3;
                                            AndroidUtilities.runOnUIThread(new p4(r12, r12, r12.val$classGuid, 1));
                                            MediaDataController.this.processLoadedMedia(tL_messages_messages2, r12.val$uid, r12.val$count, r12.val$max_id, r12.val$min_id, r12.val$type, r12.val$topicId, r12.val$fromCache, r12.val$classGuid, r12.val$isChannel, false, r12.val$requestIndex);
                                            throw th;
                                        }
                                    } else {
                                        SQLiteDatabase sQLiteDatabase3 = database;
                                        String str18 = r42;
                                        int i26 = i9;
                                        r42 = r12;
                                        int i27 = r42.val$min_id;
                                        if (i27 != 0) {
                                            long j18 = r42.val$topicId;
                                            if (j18 != 0) {
                                                Locale locale17 = Locale.US;
                                                str9 = str18;
                                                str7 = " m.uid = ";
                                                str8 = " WHERE ";
                                                queryFinalized3 = sQLiteDatabase3.queryFinalized("SELECT start, end FROM media_holes_topics WHERE uid = " + r42.val$uid + " AND topic_id = " + j18 + " AND type = " + r42.val$type + " AND end >= " + i27 + " ORDER BY end ASC LIMIT 1", new Object[0]);
                                                i12 = 0;
                                            } else {
                                                str7 = " m.uid = ";
                                                str8 = " WHERE ";
                                                str9 = str18;
                                                Locale locale18 = Locale.US;
                                                try {
                                                    i12 = 0;
                                                    queryFinalized3 = sQLiteDatabase3.queryFinalized("SELECT start, end FROM media_holes_v2 WHERE uid = " + r42.val$uid + " AND type = " + r42.val$type + " AND end >= " + i27 + " ORDER BY end ASC LIMIT 1", new Object[0]);
                                                } catch (Exception e13) {
                                                    e = e13;
                                                    r12 = r42;
                                                    tL_messages_messages2 = tL_messages_messages3;
                                                    tL_messages_messages2.messages.clear();
                                                    tL_messages_messages2.chats.clear();
                                                    tL_messages_messages2.users.clear();
                                                    FileLog.e(e);
                                                    p4Var = new p4(r12, r12, r12.val$classGuid, 1);
                                                    AndroidUtilities.runOnUIThread(p4Var);
                                                    MediaDataController.this.processLoadedMedia(tL_messages_messages2, r12.val$uid, r12.val$count, r12.val$max_id, r12.val$min_id, r12.val$type, r12.val$topicId, r12.val$fromCache, r12.val$classGuid, r12.val$isChannel, z14, r12.val$requestIndex);
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    r12 = r42;
                                                    tL_messages_messages2 = tL_messages_messages3;
                                                    AndroidUtilities.runOnUIThread(new p4(r12, r12, r12.val$classGuid, 1));
                                                    MediaDataController.this.processLoadedMedia(tL_messages_messages2, r12.val$uid, r12.val$count, r12.val$max_id, r12.val$min_id, r12.val$type, r12.val$topicId, r12.val$fromCache, r12.val$classGuid, r12.val$isChannel, false, r12.val$requestIndex);
                                                    throw th;
                                                }
                                            }
                                            if (queryFinalized3.next()) {
                                                i13 = queryFinalized3.intValue(i12);
                                                queryFinalized3.intValue(1);
                                            } else {
                                                i13 = 0;
                                            }
                                            queryFinalized3.dispose();
                                            long j19 = r42.val$topicId;
                                            if (j19 != 0) {
                                                if (i13 > 1) {
                                                    Locale locale19 = Locale.US;
                                                    queryFinalized = sQLiteDatabase3.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + str8 + str9 + str7 + r42.val$uid + " AND m.topic_id = " + j19 + " AND m.mid > 0 AND m.mid >= " + r42.val$min_id + " AND m.mid <= " + i13 + " AND m.type = " + r42.val$type + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i26, new Object[0]);
                                                    r12 = r42;
                                                } else {
                                                    String str19 = str7;
                                                    String str20 = str8;
                                                    String str21 = str9;
                                                    Locale locale20 = Locale.US;
                                                    sQLiteDatabase3 = sQLiteDatabase3;
                                                    queryFinalized = sQLiteDatabase3.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + str20 + str21 + str19 + r42.val$uid + " AND m.topic_id = " + j19 + " AND m.mid > 0 AND m.mid >= " + r42.val$min_id + " AND m.type = " + r42.val$type + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i26, new Object[0]);
                                                    z11 = true;
                                                    r12 = this;
                                                }
                                                sQLiteDatabase = sQLiteDatabase3;
                                            } else {
                                                String str22 = str7;
                                                String str23 = str8;
                                                String str24 = str9;
                                                if (i13 > 1) {
                                                    Locale locale21 = Locale.US;
                                                    sQLiteDatabase = sQLiteDatabase3;
                                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + str23 + str24 + str22 + this.val$uid + " AND m.mid > 0 AND m.mid >= " + this.val$min_id + " AND m.mid <= " + i13 + " AND m.type = " + this.val$type + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i26, new Object[0]);
                                                    r12 = this;
                                                } else {
                                                    sQLiteDatabase = sQLiteDatabase3;
                                                    Locale locale22 = Locale.US;
                                                    r12 = this;
                                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + str23 + str24 + str22 + r12.val$uid + " AND m.mid > 0 AND m.mid >= " + r12.val$min_id + " AND m.type = " + r12.val$type + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i26, new Object[0]);
                                                    z11 = true;
                                                }
                                            }
                                            z13 = true;
                                        } else {
                                            r12 = r42;
                                            sQLiteDatabase = sQLiteDatabase3;
                                            long j20 = r12.val$topicId;
                                            if (j20 != 0) {
                                                Locale locale23 = Locale.US;
                                                str4 = " m.uid = ";
                                                str5 = "SELECT m.data, m.mid FROM media_v4 m ";
                                                i10 = i26;
                                                str6 = " AND m.type = ";
                                                queryFinalized2 = sQLiteDatabase.queryFinalized(str + r12.val$uid + " AND topic_id = " + j20 + " AND type = " + r12.val$type, new Object[0]);
                                                i11 = 0;
                                            } else {
                                                str4 = " m.uid = ";
                                                str5 = "SELECT m.data, m.mid FROM media_v4 m ";
                                                str6 = " AND m.type = ";
                                                i10 = i26;
                                                Locale locale24 = Locale.US;
                                                i11 = 0;
                                                queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT max(end) FROM media_holes_v2 WHERE uid = " + r12.val$uid + " AND type = " + r12.val$type, new Object[0]);
                                            }
                                            int intValue2 = queryFinalized2.next() ? queryFinalized2.intValue(i11) : 0;
                                            queryFinalized2.dispose();
                                            long j21 = r12.val$topicId;
                                            if (j21 == 0) {
                                                int i28 = i10;
                                                String str25 = str6;
                                                String str26 = str4;
                                                if (intValue2 > 1) {
                                                    Locale locale25 = Locale.US;
                                                    r12 = this;
                                                    queryFinalized = sQLiteDatabase.queryFinalized(str5 + str3 + " WHERE " + str18 + str26 + r12.val$uid + " AND m.mid >= " + intValue2 + str25 + r12.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i28, new Object[0]);
                                                } else {
                                                    r12 = this;
                                                    Locale locale26 = Locale.US;
                                                    queryFinalized = sQLiteDatabase.queryFinalized(str5 + str3 + " WHERE " + str18 + str26 + r12.val$uid + " AND m.mid > 0 AND m.type = " + r12.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i28, new Object[0]);
                                                }
                                            } else if (intValue2 > 1) {
                                                Locale locale27 = Locale.US;
                                                queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str18 + str4 + r12.val$uid + " AND m.topic_id = " + j21 + " AND m.mid >= " + intValue2 + str6 + r12.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i10, new Object[0]);
                                            } else {
                                                int i29 = i10;
                                                String str27 = str4;
                                                Locale locale28 = Locale.US;
                                                queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str18 + str27 + r12.val$uid + " AND m.topic_id = " + j21 + " AND m.mid > 0 AND m.type = " + r12.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i29, new Object[0]);
                                                z13 = false;
                                                r12 = this;
                                            }
                                        }
                                        z10 = z13;
                                    }
                                    z13 = false;
                                    z10 = z13;
                                } catch (Exception e14) {
                                    e = e14;
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } catch (Exception e15) {
                                e = e15;
                                r12 = this;
                            } catch (Throwable th6) {
                                th = th6;
                                r12 = this;
                            }
                        }
                        Object obj = null;
                        HashSet hashSet = r12.val$tag != null ? new HashSet() : null;
                        while (queryFinalized.next()) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                j11 = j10;
                                TLdeserialize.readAttachPath(byteBufferValue, j11);
                                byteBufferValue.reuse();
                                TLdeserialize.id = queryFinalized.intValue(1);
                                long j22 = r12.val$uid;
                                TLdeserialize.dialog_id = j22;
                                if (DialogObject.isEncryptedDialog(j22)) {
                                    TLdeserialize.random_id = queryFinalized.longValue(2);
                                }
                                long j23 = TLdeserialize.grouped_id;
                                if (j23 != 0 && hashSet != null) {
                                    hashSet.add(Long.valueOf(j23));
                                }
                                if (z10) {
                                    tL_messages_messages = tL_messages_messages3;
                                    tL_messages_messages.messages.add(0, TLdeserialize);
                                } else {
                                    tL_messages_messages = tL_messages_messages3;
                                    tL_messages_messages.messages.add(TLdeserialize);
                                }
                                arrayList2 = arrayList6;
                                arrayList3 = arrayList;
                                MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize, arrayList2, arrayList3, null);
                            } else {
                                tL_messages_messages = tL_messages_messages3;
                                arrayList2 = arrayList6;
                                j11 = j10;
                                arrayList3 = arrayList;
                            }
                            arrayList6 = arrayList2;
                            arrayList = arrayList3;
                            j10 = j11;
                            tL_messages_messages3 = tL_messages_messages;
                        }
                        tL_messages_messages2 = tL_messages_messages3;
                        ArrayList<Long> arrayList7 = arrayList6;
                        long j24 = j10;
                        ArrayList arrayList8 = arrayList;
                        queryFinalized.dispose();
                        if (r12.val$tag != null && !hashSet.isEmpty()) {
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                Long l10 = (Long) it.next();
                                long longValue = l10.longValue();
                                int i30 = 0;
                                while (true) {
                                    if (i30 >= tL_messages_messages2.messages.size()) {
                                        i30 = -1;
                                        break;
                                    } else if (tL_messages_messages2.messages.get(i30).grouped_id == longValue) {
                                        break;
                                    } else {
                                        i30++;
                                    }
                                }
                                if (i30 >= 0) {
                                    SQLiteCursor queryFinalized6 = sQLiteDatabase.queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? AND group_id = ? ORDER BY mid DESC", Long.valueOf(r12.val$uid), l10);
                                    ArrayList arrayList9 = new ArrayList();
                                    while (queryFinalized6.next()) {
                                        int intValue3 = queryFinalized6.intValue(1);
                                        NativeByteBuffer byteBufferValue2 = queryFinalized6.byteBufferValue(0);
                                        if (byteBufferValue2 != null) {
                                            TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                            TLdeserialize2.readAttachPath(byteBufferValue2, j24);
                                            byteBufferValue2.reuse();
                                            TLdeserialize2.id = intValue3;
                                            TLdeserialize2.dialog_id = r12.val$uid;
                                            arrayList9.add(TLdeserialize2);
                                            MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize2, arrayList7, arrayList8, null);
                                            obj = null;
                                        }
                                    }
                                    Object obj2 = obj;
                                    if (z10) {
                                        Collections.reverse(arrayList9);
                                    }
                                    tL_messages_messages2.messages.remove(i30);
                                    tL_messages_messages2.messages.addAll(i30, arrayList9);
                                    queryFinalized6.dispose();
                                    obj = obj2;
                                }
                            }
                        }
                        if (!arrayList7.isEmpty()) {
                            MediaDataController.this.getMessagesStorage().getUsersInternal(arrayList7, tL_messages_messages2.users);
                        }
                        if (!arrayList8.isEmpty()) {
                            MediaDataController.this.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList8), tL_messages_messages2.chats);
                        }
                        if (tL_messages_messages2.messages.size() <= r12.val$count || r12.val$min_id != 0) {
                            z14 = r12.val$min_id != 0 ? false : z11;
                        } else {
                            tL_messages_messages2.messages.remove(r0.size() - 1);
                        }
                        p4Var = new p4(r12, r12, r12.val$classGuid, 1);
                    } catch (Exception e16) {
                        e = e16;
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            } catch (Exception e17) {
                e = e17;
            }
            AndroidUtilities.runOnUIThread(p4Var);
            MediaDataController.this.processLoadedMedia(tL_messages_messages2, r12.val$uid, r12.val$count, r12.val$max_id, r12.val$min_id, r12.val$type, r12.val$topicId, r12.val$fromCache, r12.val$classGuid, r12.val$isChannel, z14, r12.val$requestIndex);
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public class 2 implements Runnable {
        final /* synthetic */ ArrayList val$previewItems;

        public 2(ArrayList arrayList) {
            this.val$previewItems = arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0(ArrayList arrayList) {
            MediaDataController.this.defaultEmojiThemes.clear();
            MediaDataController.this.defaultEmojiThemes.addAll(arrayList);
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i9 = 0; i9 < this.val$previewItems.size(); i9++) {
                if (this.val$previewItems.get(i9) != null && ((bp) this.val$previewItems.get(i9)).a != null) {
                    ((bp) this.val$previewItems.get(i9)).a.n(0);
                }
            }
            AndroidUtilities.runOnUIThread(new c3(8, this, this.val$previewItems));
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public class 3 implements Runnable {
        final /* synthetic */ int val$currentAccount;
        final /* synthetic */ ArrayList val$previewItems;

        public 3(ArrayList arrayList, int i9) {
            this.val$previewItems = arrayList;
            this.val$currentAccount = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0(ArrayList arrayList) {
            MediaDataController.this.defaultEmojiThemes.clear();
            MediaDataController.this.defaultEmojiThemes.addAll(arrayList);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiPreviewThemesChanged, new Object[0]);
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i9 = 0; i9 < this.val$previewItems.size(); i9++) {
                ((bp) this.val$previewItems.get(i9)).a.n(this.val$currentAccount);
            }
            AndroidUtilities.runOnUIThread(new c3(9, this, this.val$previewItems));
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class DraftVoice {
        public long id;
        public boolean once;
        public String path;
        public short[] recordSamples;
        public long recordTimeCount;
        public long samplesCount;
        public int writedFrame;
        public float left = 0.0f;
        public float right = 1.0f;

        public static DraftVoice fromString(String str) {
            if (str == null) {
                return null;
            }
            try {
                if (!str.startsWith("@")) {
                    return null;
                }
                boolean z10 = true;
                String[] split = str.substring(1).split("\n");
                if (split.length < 6) {
                    return null;
                }
                DraftVoice draftVoice = new DraftVoice();
                int i9 = 0;
                draftVoice.path = split[0];
                draftVoice.samplesCount = Long.parseLong(split[1]);
                draftVoice.writedFrame = Integer.parseInt(split[2]);
                draftVoice.recordTimeCount = Long.parseLong(split[3]);
                if (split[4].contains(";")) {
                    String[] split2 = split[4].split(";");
                    draftVoice.once = Integer.parseInt(split2[0]) != 0;
                    draftVoice.left = Float.parseFloat(split2[1]);
                    draftVoice.right = Float.parseFloat(split2[2]);
                } else {
                    if (Integer.parseInt(split[4]) == 0) {
                        z10 = false;
                    }
                    draftVoice.once = z10;
                    draftVoice.left = 0.0f;
                    draftVoice.right = 1.0f;
                }
                int length = split.length - 5;
                String[] strArr = new String[length];
                for (int i10 = 0; i10 < length; i10++) {
                    strArr[i10] = split[i10 + 5];
                }
                String join = TextUtils.join("\n", strArr);
                draftVoice.recordSamples = new short[join.length()];
                while (true) {
                    short[] sArr = draftVoice.recordSamples;
                    if (i9 >= sArr.length) {
                        return draftVoice;
                    }
                    sArr[i9] = (short) join.charAt(i9);
                    i9++;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                return null;
            }
        }

        public static DraftVoice of(MediaController mediaController, String str, boolean z10, float f10, float f11) {
            if (mediaController.recordingAudio == null) {
                return null;
            }
            DraftVoice draftVoice = new DraftVoice();
            draftVoice.path = str;
            draftVoice.samplesCount = mediaController.samplesCount;
            draftVoice.writedFrame = mediaController.writtenFrame;
            draftVoice.recordTimeCount = mediaController.recordTimeCount;
            draftVoice.id = mediaController.recordingAudio.id;
            draftVoice.recordSamples = mediaController.recordSamples;
            draftVoice.once = z10;
            draftVoice.left = f10;
            draftVoice.right = f11;
            return draftVoice;
        }

        public String toString() {
            char[] cArr = new char[this.recordSamples.length];
            int i9 = 0;
            while (true) {
                short[] sArr = this.recordSamples;
                if (i9 >= sArr.length) {
                    return "@" + this.path + "\n" + this.samplesCount + "\n" + this.writedFrame + "\n" + this.recordTimeCount + "\n" + (this.once ? 1 : 0) + ";" + this.left + ";" + this.right + "\n" + new String(cArr);
                }
                cArr[i9] = (char) sArr[i9];
                i9++;
            }
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class KeywordResult {
        public String emoji;
        public String keyword;

        public KeywordResult() {
        }

        public KeywordResult(String str, String str2) {
            this.emoji = str;
            this.keyword = str2;
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public interface KeywordResultCallback {
        void run(ArrayList<KeywordResult> arrayList, String str);
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class SearchStickersKey {
        public final boolean emojis;
        public final String lang_code;
        public final String q;

        public SearchStickersKey(boolean z10, String str, String str2) {
            this.emojis = z10;
            this.lang_code = str;
            this.q = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                SearchStickersKey searchStickersKey = (SearchStickersKey) obj;
                if (this.emojis == searchStickersKey.emojis && Objects.equals(this.lang_code, searchStickersKey.lang_code) && Objects.equals(this.q, searchStickersKey.q)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(this.emojis), this.lang_code, this.q);
        }
    }

    static {
        for (int i9 = 0; i9 < 4; i9++) {
            lockObjects[i9] = new Object();
        }
        SHORTCUT_TYPE_USER_OR_CHAT = 0;
        SHORTCUT_TYPE_ATTACHED_BOT = 1;
        entityComparator = new q(8);
    }

    public MediaDataController(int i9) {
        super(i9);
        String key;
        long longValue;
        SerializedData serializedData;
        boolean z10;
        this.attachMenuBots = new TLRPC.TL_attachMenuBots();
        this.reactionsList = new ArrayList();
        this.enabledReactionsList = new ArrayList();
        this.reactionsMap = new HashMap<>();
        this.stickerSets = new ArrayList[]{new ArrayList<>(), new ArrayList<>(), new ArrayList<>(0), new ArrayList<>(), new ArrayList<>(), new ArrayList<>()};
        this.stickersByIds = new a0.h[]{new a0.h(), new a0.h(), new a0.h(), new a0.h(), new a0.h(), new a0.h()};
        this.stickerSetsById = new a0.h();
        this.installedStickerSetsById = new a0.h();
        this.installedForceStickerSetsById = new ArrayList<>();
        this.uninstalledForceStickerSetsById = new ArrayList<>();
        this.groupStickerSets = new a0.h();
        this.stickerSetsByName = new ConcurrentHashMap<>(100, 1.0f, 1);
        this.stickerSetDefaultStatuses = null;
        this.stickerSetDefaultChannelStatuses = null;
        this.diceStickerSetsByEmoji = new HashMap<>();
        this.diceEmojiStickerSetsById = new a0.h();
        this.loadingDiceStickerSets = new HashSet<>();
        this.removingStickerSetsUndos = new a0.h();
        this.scheduledLoadStickers = new Runnable[7];
        this.loadingStickers = new boolean[7];
        this.stickersLoaded = new boolean[7];
        this.loadHash = new long[7];
        this.loadDate = new int[7];
        this.ringtoneUploaderHashMap = new HashMap<>();
        this.verifyingMessages = new HashMap<>();
        this.archivedStickersCount = new int[7];
        this.stickersByEmoji = new a0.h();
        this.allStickers = new HashMap<>();
        this.allStickersFeatured = new HashMap<>();
        this.recentStickers = new ArrayList[]{new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>()};
        this.loadingRecentStickers = new boolean[9];
        this.recentStickersLoaded = new boolean[9];
        this.recentGifs = new ArrayList<>();
        this.loadFeaturedHash = new long[2];
        this.loadFeaturedDate = new int[2];
        this.featuredStickerSets = new ArrayList[]{new ArrayList<>(), new ArrayList<>()};
        this.featuredStickerSetsById = new a0.h[]{new a0.h(), new a0.h()};
        this.unreadStickerSets = new ArrayList[]{new ArrayList<>(), new ArrayList<>()};
        this.readingStickerSets = new ArrayList[]{new ArrayList<>(), new ArrayList<>()};
        this.loadingFeaturedStickers = new boolean[2];
        this.featuredStickersLoaded = new boolean[2];
        this.defaultEmojiThemes = new ArrayList<>();
        this.premiumPreviewStickers = new ArrayList<>();
        this.emojiStatusesHash = new long[4];
        this.emojiStatuses = new ArrayList[4];
        this.emojiStatusesFetchDate = new Long[4];
        this.emojiStatusesFromCacheFetched = new boolean[4];
        this.emojiStatusesFetching = new boolean[4];
        this.loadingStickerSetsKeys = new HashSet<>();
        this.loadingStickerSets = new HashMap<>();
        this.messagesSearchCount = new int[]{0, 0};
        this.messagesSearchEndReached = new boolean[]{false, false};
        this.searchResultMessages = new ArrayList<>();
        this.searchServerResultMessages = new ArrayList<>();
        this.searchLocalResultMessages = new ArrayList<>();
        this.searchServerResultMessagesMap = new SparseArray[]{new SparseArray<>(), new SparseArray<>()};
        this.deletedFromResultMessages = new ArrayList<>();
        this.hints = new ArrayList<>();
        this.inlineBots = new ArrayList<>();
        this.guestBots = new ArrayList<>();
        this.webapps = new ArrayList<>();
        this.shortcutCallbacks = new HashMap<>();
        this.loadingPinnedMessages = new a0.h();
        this.draftsFolderIds = new a0.h();
        this.drafts = new a0.h();
        this.draftMessages = new a0.h();
        this.botInfos = new HashMap<>();
        this.botDialogKeyboards = new a0.h();
        this.botKeyboards = new HashMap<>();
        this.botKeyboardsByMids = new a0.h();
        this.currentFetchingEmoji = new HashMap<>();
        this.fetchedEmoji = new HashSet<>();
        this.triedLoadingEmojipacks = false;
        this.recentReactions = new ArrayList<>();
        this.topReactions = new ArrayList<>();
        this.savedReactions = new ArrayList<>();
        this.draftVoicesLoaded = false;
        this.draftVoices = new a0.h();
        this.loadingSearchStickersKeys = new HashMap<>();
        this.searchStickerResults = new android.util.LruCache<>(25);
        if (this.currentAccount == 0) {
            this.draftPreferences = ApplicationLoader.applicationContext.getSharedPreferences("drafts", 0);
        } else {
            this.draftPreferences = ApplicationLoader.applicationContext.getSharedPreferences("drafts" + this.currentAccount, 0);
        }
        ArrayList<TLRPC.Message> arrayList = new ArrayList<>();
        for (Map.Entry<String, ?> entry : this.draftPreferences.getAll().entrySet()) {
            try {
                key = entry.getKey();
                longValue = Utilities.parseLong(key).longValue();
                serializedData = new SerializedData(Utilities.hexToBytes((String) entry.getValue()));
            } catch (Exception unused) {
            }
            if (key.startsWith("r_")) {
                z10 = false;
            } else {
                z10 = key.startsWith("rt_");
                if (!z10) {
                    TLRPC.DraftMessage TLdeserialize = TLRPC.DraftMessage.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    if (TLdeserialize != null) {
                        a0.h hVar = (a0.h) this.drafts.f(longValue);
                        if (hVar == null) {
                            hVar = new a0.h();
                            this.drafts.k(hVar, longValue);
                        }
                        hVar.k(TLdeserialize, key.startsWith("t_") ? Utilities.parseLong(key.substring(key.lastIndexOf(95) + 1)).longValue() : 0L);
                    }
                    serializedData.cleanup();
                }
            }
            TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            if (TLdeserialize2 != null) {
                TLdeserialize2.readAttachPath(serializedData, getUserConfig().clientUserId);
                a0.h hVar2 = (a0.h) this.draftMessages.f(longValue);
                if (hVar2 == null) {
                    hVar2 = new a0.h();
                    this.draftMessages.k(hVar2, longValue);
                }
                hVar2.k(TLdeserialize2, z10 ? Utilities.parseInt((CharSequence) key.substring(key.lastIndexOf(95) + 1)).intValue() : 0);
                if (TLdeserialize2.reply_to != null) {
                    arrayList.add(TLdeserialize2);
                }
            }
            serializedData.cleanup();
        }
        loadRepliesOfDraftReplies(arrayList);
        loadStickersByEmojiOrName(AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME, false, true);
        loadEmojiThemes();
        loadRecentAndTopReactions(false);
        loadAvatarConstructor(false);
        loadAvatarConstructor(true);
        this.ringtoneDataStore = new bf.d(this.currentAccount);
        this.menuBotsUpdateDate = getMessagesController().getMainSettings().getInt("menuBotsUpdateDate", 0);
    }

    public static void addAnimatedEmojiSpans(ArrayList<TLRPC.MessageEntity> arrayList, CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        if (!(charSequence instanceof Spannable) || arrayList == null) {
            return;
        }
        Spannable spannable = (Spannable) charSequence;
        for (org.telegram.ui.Components.t5 t5Var : (org.telegram.ui.Components.t5[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.t5.class)) {
            if (t5Var != null) {
                spannable.removeSpan(t5Var);
            }
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            TLRPC.MessageEntity messageEntity = arrayList.get(i9);
            if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                int i10 = messageEntity.offset;
                int i11 = messageEntity.length + i10;
                if (i10 < i11 && i11 <= spannable.length()) {
                    spannable.setSpan(tL_messageEntityCustomEmoji.document != null ? new org.telegram.ui.Components.t5(tL_messageEntityCustomEmoji.document, fontMetricsInt) : new org.telegram.ui.Components.t5(tL_messageEntityCustomEmoji.document_id, fontMetricsInt), i10, i11, 33);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void addStyleToText(wz0 wz0Var, int i9, int i10, Spannable spannable, boolean z10) {
        vz0 vz0Var;
        int i11;
        try {
            int i12 = i9;
            int i13 = i10;
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannable.getSpans(i12, i13, CharacterStyle.class);
            if (characterStyleArr != null && characterStyleArr.length > 0) {
                int i14 = 0;
                int i15 = 0;
                while (i15 < characterStyleArr.length) {
                    CharacterStyle characterStyle = characterStyleArr[i15];
                    vz0 vz0Var2 = wz0Var != null ? wz0Var.b : new vz0();
                    if (characterStyle instanceof wz0) {
                        vz0Var = ((wz0) characterStyle).b;
                    } else if (characterStyle instanceof r41) {
                        vz0Var = ((r41) characterStyle).a;
                        if (vz0Var == null) {
                            vz0Var = new vz0();
                        }
                    } else {
                        i15++;
                        i14 = 0;
                    }
                    if (vz0Var != null) {
                        int spanStart = spannable.getSpanStart(characterStyle);
                        int spanEnd = spannable.getSpanEnd(characterStyle);
                        spannable.removeSpan(characterStyle);
                        if (spanStart <= i12 || i13 <= spanEnd) {
                            if (spanStart <= i12) {
                                if (spanStart != i12) {
                                    spannable.setSpan(createNewSpan(characterStyle, vz0Var, null, z10), spanStart, i12, 33);
                                }
                                if (spanEnd > i12) {
                                    if (wz0Var != null) {
                                        spannable.setSpan(createNewSpan(characterStyle, vz0Var, vz0Var2, z10), i12, Math.min(spanEnd, i13), 33);
                                    }
                                    i11 = spanEnd;
                                    if (spanEnd >= i13) {
                                        if (spanEnd != i13) {
                                            spannable.setSpan(createNewSpan(characterStyle, vz0Var, null, z10), i13, spanEnd, 33);
                                        }
                                        if (i13 > spanStart && spanEnd <= i12) {
                                            if (wz0Var != null) {
                                                spannable.setSpan(createNewSpan(characterStyle, vz0Var, vz0Var2, z10), spanStart, Math.min(spanEnd, i13), 33);
                                            }
                                            i12 = i11;
                                        }
                                    }
                                    i12 = i11;
                                }
                            }
                            i11 = i12;
                            if (spanEnd >= i13) {
                            }
                            i12 = i11;
                        } else {
                            spannable.setSpan(createNewSpan(characterStyle, vz0Var, vz0Var2, z10), spanStart, spanEnd, 33);
                            if (wz0Var != null) {
                                spannable.setSpan(new wz0(new vz0(vz0Var2), i14), spanEnd, i13, 33);
                            }
                        }
                        i13 = spanStart;
                    }
                    i15++;
                    i14 = 0;
                }
            }
            if (wz0Var == null || i12 >= i13 || i12 >= spannable.length()) {
                return;
            }
            spannable.setSpan(wz0Var, i12, Math.min(spannable.length(), i13), 33);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static void addTextStyleRuns(MessageObject messageObject, Spannable spannable) {
        addTextStyleRuns(messageObject.messageOwner.entities, messageObject.messageText, spannable, -1);
    }

    private ArrayList<MessageObject> broadcastPinnedMessage(ArrayList<TLRPC.Message> arrayList, ArrayList<TLRPC.User> arrayList2, ArrayList<TLRPC.Chat> arrayList3, boolean z10, boolean z11) {
        if (arrayList.isEmpty()) {
            return null;
        }
        a0.h hVar = new a0.h();
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            TLRPC.User user = arrayList2.get(i9);
            hVar.k(user, user.id);
        }
        a0.h hVar2 = new a0.h();
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            TLRPC.Chat chat = arrayList3.get(i10);
            hVar2.k(chat, chat.id);
        }
        ArrayList<MessageObject> arrayList4 = new ArrayList<>();
        if (!z11) {
            AndroidUtilities.runOnUIThread(new of.u0(this, arrayList2, z10, arrayList3, arrayList, arrayList4, hVar, hVar2));
            return null;
        }
        AndroidUtilities.runOnUIThread(new mj(this, arrayList2, z10, arrayList3, 9));
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            TLRPC.Message message = arrayList.get(i12);
            if ((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaDocument) || (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                i11++;
            }
            a0.h hVar3 = hVar2;
            int i13 = i11;
            arrayList4.add(new MessageObject(this.currentAccount, message, hVar, hVar3, false, i13 < 30));
            i12++;
            hVar2 = hVar3;
            i11 = i13;
        }
        return arrayList4;
    }

    private void broadcastReplyMessages(ArrayList<TLRPC.Message> arrayList, a0.h hVar, ArrayList<TLRPC.User> arrayList2, ArrayList<TLRPC.Chat> arrayList3, long j10, boolean z10) {
        a0.h hVar2 = new a0.h();
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            TLRPC.User user = arrayList2.get(i9);
            hVar2.k(user, user.id);
        }
        a0.h hVar3 = new a0.h();
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            TLRPC.Chat chat = arrayList3.get(i10);
            hVar3.k(chat, chat.id);
        }
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList4.add(new MessageObject(this.currentAccount, arrayList.get(i11), hVar2, hVar3, false, false));
        }
        AndroidUtilities.runOnUIThread(new nk(this, arrayList2, z10, arrayList3, arrayList4, hVar, j10));
    }

    public static long calcDocumentsHash(ArrayList<TLRPC.Document> arrayList) {
        return calcDocumentsHash(arrayList, 200);
    }

    private long calcFeaturedStickersHash(boolean z10, ArrayList<TLRPC.StickerSetCovered> arrayList) {
        long j10 = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                TLRPC.StickerSet stickerSet = arrayList.get(i9).set;
                if (!stickerSet.archived) {
                    j10 = calcHash(j10, stickerSet.id);
                    if (this.unreadStickerSets[z10 ? 1 : 0].contains(Long.valueOf(stickerSet.id))) {
                        j10 = calcHash(j10, 1L);
                    }
                }
            }
        }
        return j10;
    }

    public static long calcHash(long j10, long j11) {
        long j12 = j10 ^ (j10 >>> 21);
        long j13 = j12 ^ (j12 << 35);
        return (j13 ^ (j13 >>> 4)) + j11;
    }

    private static long calcStickersHash(ArrayList<TLRPC.TL_messages_stickerSet> arrayList) {
        long j10 = 0;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (arrayList.get(i9) != null) {
                if (!arrayList.get(i9).set.archived) {
                    j10 = calcHash(j10, r3.hash);
                }
            }
        }
        return j10;
    }

    public static boolean canAddMessageToMedia(TLRPC.Message message) {
        boolean z10 = message instanceof TLRPC.TL_message_secret;
        if (!z10 || (!((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || MessageObject.isVideoMessage(message) || MessageObject.isGifMessage(message)) || MessageObject.getMedia(message).ttl_seconds == 0 || MessageObject.getMedia(message).ttl_seconds > 60)) {
            return (z10 || !(message instanceof TLRPC.TL_message) || (!((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaDocument)) || MessageObject.getMedia(message).ttl_seconds == 0)) && getMediaType(message) != -1;
        }
        return false;
    }

    public static boolean canShowAttachMenuBot(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLObject tLObject) {
        TLRPC.User user = tLObject instanceof TLRPC.User ? (TLRPC.User) tLObject : null;
        TLRPC.Chat chat = tLObject instanceof TLRPC.Chat ? (TLRPC.Chat) tLObject : null;
        ArrayList<TLRPC.AttachMenuPeerType> arrayList = tL_attachMenuBot.peer_types;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            TLRPC.AttachMenuPeerType attachMenuPeerType = arrayList.get(i9);
            i9++;
            TLRPC.AttachMenuPeerType attachMenuPeerType2 = attachMenuPeerType;
            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeSameBotPM) && user != null && user.bot && user.id == tL_attachMenuBot.bot_id) {
                return true;
            }
            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBotPM) && user != null && user.bot && user.id != tL_attachMenuBot.bot_id) {
                return true;
            }
            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypePM) && user != null && !user.bot) {
                return true;
            }
            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeChat) && chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                return true;
            }
            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBroadcast) && chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                return true;
            }
        }
        return false;
    }

    public static boolean canShowAttachMenuBotForTarget(TLRPC.TL_attachMenuBot tL_attachMenuBot, String str) {
        ArrayList<TLRPC.AttachMenuPeerType> arrayList = tL_attachMenuBot.peer_types;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            TLRPC.AttachMenuPeerType attachMenuPeerType = arrayList.get(i9);
            i9++;
            TLRPC.AttachMenuPeerType attachMenuPeerType2 = attachMenuPeerType;
            if (((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeSameBotPM) || (attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBotPM)) && str.equals("bots")) {
                return true;
            }
            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBroadcast) && str.equals("channels")) {
                return true;
            }
            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeChat) && str.equals("groups")) {
                return true;
            }
            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypePM) && str.equals("users")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean checkInclusion(int i9, List<TLRPC.MessageEntity> list, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.MessageEntity messageEntity = list.get(i10);
                int i11 = messageEntity.offset;
                if (z10) {
                    if (i11 >= i9) {
                        continue;
                    }
                    if (messageEntity.offset + messageEntity.length <= i9) {
                        return true;
                    }
                } else {
                    if (i11 > i9) {
                        continue;
                    }
                    if (messageEntity.offset + messageEntity.length <= i9) {
                    }
                }
            }
        }
        return false;
    }

    private static boolean checkIntersection(int i9, int i10, List<TLRPC.MessageEntity> list) {
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.MessageEntity messageEntity = list.get(i11);
                int i12 = messageEntity.offset;
                if (i12 > i9 && i12 + messageEntity.length <= i10) {
                    return true;
                }
            }
        }
        return false;
    }

    private void cleanupStickerSetCache() {
        if (this.cleanedupStickerSetCache) {
            return;
        }
        this.cleanedupStickerSetCache = true;
        getMessagesStorage().getStorageQueue().postRunnable(new g7(this, 8));
    }

    private Intent createIntrnalAttachedBotShortcutIntent(long j10) {
        if (j10 != 0 && canCreateAttachedMenuBotShortcut(j10)) {
            Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) OpenAttachedMenuBotReceiver.class);
            if (DialogObject.isUserDialog(j10)) {
                intent.putExtra("botId", j10);
                intent.putExtra("currentAccount", this.currentAccount);
                intent.setAction(OpenAttachedMenuBotReceiver.ACTION + j10);
                intent.addFlags(67108864);
                return intent;
            }
        }
        return null;
    }

    private Intent createIntrnalShortcutIntent(long j10) {
        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) OpenChatReceiver.class);
        if (DialogObject.isEncryptedDialog(j10)) {
            int encryptedChatId = DialogObject.getEncryptedChatId(j10);
            intent.putExtra("encId", encryptedChatId);
            if (getMessagesController().getEncryptedChat(Integer.valueOf(encryptedChatId)) == null) {
                return null;
            }
        } else if (DialogObject.isUserDialog(j10)) {
            intent.putExtra("userId", j10);
        } else {
            if (!DialogObject.isChatDialog(j10)) {
                return null;
            }
            intent.putExtra("chatId", -j10);
        }
        intent.putExtra("currentAccount", this.currentAccount);
        intent.setAction("com.tmessages.openchat" + j10);
        intent.addFlags(67108864);
        return intent;
    }

    private static CharacterStyle createNewSpan(CharacterStyle characterStyle, vz0 vz0Var, vz0 vz0Var2, boolean z10) {
        vz0 vz0Var3 = new vz0(vz0Var);
        if (vz0Var2 != null) {
            if (z10) {
                vz0Var3.b(vz0Var2);
            } else {
                vz0Var3.a = vz0Var2.a;
                vz0Var3.d = vz0Var2.d;
            }
        }
        if (characterStyle instanceof wz0) {
            return new wz0(vz0Var3, 0);
        }
        if (characterStyle instanceof r41) {
            return new r41(((r41) characterStyle).getURL(), vz0Var3);
        }
        return null;
    }

    private void deletePeer(long j10, int i9) {
        getMessagesStorage().getStorageQueue().postRunnable(new gh.e9(this, j10, i9, 4));
    }

    public static boolean entitiesEqual(TLRPC.MessageEntity messageEntity, TLRPC.MessageEntity messageEntity2) {
        if (messageEntity.getClass() != messageEntity2.getClass() || messageEntity.offset != messageEntity2.offset || messageEntity.length != messageEntity2.length || !TextUtils.equals(messageEntity.url, messageEntity2.url) || !TextUtils.equals(messageEntity.language, messageEntity2.language)) {
            return false;
        }
        if ((messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) && ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id != ((TLRPC.TL_inputMessageEntityMentionName) messageEntity2).user_id) {
            return false;
        }
        if (!(messageEntity instanceof TLRPC.TL_messageEntityMentionName) || ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id == ((TLRPC.TL_messageEntityMentionName) messageEntity2).user_id) {
            return !(messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) || ((TLRPC.TL_messageEntityCustomEmoji) messageEntity).document_id == ((TLRPC.TL_messageEntityCustomEmoji) messageEntity2).document_id;
        }
        return false;
    }

    private void fetchStickerSetInternal(TLRPC.InputStickerSet inputStickerSet, Utilities.Callback2<Boolean, TLRPC.TL_messages_stickerSet> callback2) {
        if (callback2 == null) {
            return;
        }
        String inputSetKey = inputSetKey(inputStickerSet);
        ArrayList<Utilities.Callback2<Boolean, TLRPC.TL_messages_stickerSet>> arrayList = this.loadingStickerSets.get(inputSetKey);
        if (arrayList != null && arrayList.size() > 0) {
            arrayList.add(callback2);
            return;
        }
        if (arrayList == null) {
            HashMap<String, ArrayList<Utilities.Callback2<Boolean, TLRPC.TL_messages_stickerSet>>> hashMap = this.loadingStickerSets;
            ArrayList<Utilities.Callback2<Boolean, TLRPC.TL_messages_stickerSet>> arrayList2 = new ArrayList<>();
            hashMap.put(inputSetKey, arrayList2);
            arrayList = arrayList2;
        }
        arrayList.add(callback2);
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = inputStickerSet;
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new y6(this, inputSetKey, 1));
    }

    public static TLRPC.TL_attachMenuBotIcon getAnimatedAttachMenuBotIcon(TLRPC.TL_attachMenuBot tL_attachMenuBot, boolean z10) {
        ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList.get(i9);
            i9++;
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = tL_attachMenuBotIcon;
            if (tL_attachMenuBotIcon2.name.equals(z10 ? ATTACH_MENU_BOT_ANIMATED_ICON_KEY_2 : ATTACH_MENU_BOT_ANIMATED_ICON_KEY)) {
                return tL_attachMenuBotIcon2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x006f A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private TLRPC.TL_messages_stickerSet getCachedStickerSetInternal(long j10, Integer num) {
        SQLiteCursor sQLiteCursor;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        NativeByteBuffer nativeByteBuffer = null;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            sQLiteCursor = getMessagesStorage().getDatabase().queryFinalized("SELECT data, hash FROM stickersets2 WHERE id = ? LIMIT 1", Long.valueOf(j10));
            try {
                if (!sQLiteCursor.next() || sQLiteCursor.isNull(0)) {
                    tL_messages_stickerSet = null;
                } else {
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        try {
                            tL_messages_stickerSet = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        } catch (Throwable th2) {
                            th = th2;
                            tL_messages_stickerSet = null;
                        }
                        try {
                            int intValue = sQLiteCursor.intValue(1);
                            if (num != null && num.intValue() != 0) {
                                if (num.intValue() != intValue) {
                                    byteBufferValue.reuse();
                                    sQLiteCursor.dispose();
                                    return null;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            nativeByteBuffer = byteBufferValue;
                            try {
                                FileLog.e(th);
                                return tL_messages_stickerSet;
                            } finally {
                                if (nativeByteBuffer != null) {
                                    nativeByteBuffer.reuse();
                                }
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                            }
                        }
                    } else {
                        tL_messages_stickerSet = null;
                    }
                    nativeByteBuffer = byteBufferValue;
                }
                if (nativeByteBuffer != null) {
                    nativeByteBuffer.reuse();
                }
                sQLiteCursor.dispose();
                return tL_messages_stickerSet;
            } catch (Throwable th4) {
                th = th4;
                tL_messages_stickerSet = null;
            }
        } catch (Throwable th5) {
            th = th5;
            sQLiteCursor = null;
            tL_messages_stickerSet = null;
            FileLog.e(th);
            return tL_messages_stickerSet;
        }
    }

    public static TLRPC.InputStickerSet getInputStickerSet(TLRPC.StickerSet stickerSet) {
        if (stickerSet == null) {
            return null;
        }
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.id = stickerSet.id;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        return tL_inputStickerSetID;
    }

    public static TLRPC.TL_inputStickerSetItem getInputStickerSetItem(TLRPC.Document document, String str) {
        TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = new TLRPC.TL_inputStickerSetItem();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_inputStickerSetItem.document = tL_inputDocument;
        tL_inputDocument.id = document.id;
        tL_inputDocument.access_hash = document.access_hash;
        tL_inputDocument.file_reference = document.file_reference;
        tL_inputStickerSetItem.emoji = str;
        return tL_inputStickerSetItem;
    }

    public static MediaDataController getInstance(int i9) {
        MediaDataController mediaDataController;
        MediaDataController mediaDataController2 = Instance[i9];
        if (mediaDataController2 != null) {
            return mediaDataController2;
        }
        synchronized (lockObjects) {
            try {
                mediaDataController = Instance[i9];
                if (mediaDataController == null) {
                    MediaDataController[] mediaDataControllerArr = Instance;
                    MediaDataController mediaDataController3 = new MediaDataController(i9);
                    mediaDataControllerArr[i9] = mediaDataController3;
                    mediaDataController = mediaDataController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaDataController;
    }

    private void getMediaCountDatabase(long j10, long j11, int i9, int i10) {
        getMessagesStorage().getStorageQueue().postRunnable(new g8(this, j11, j10, i9, i10, 0));
    }

    public static int getMediaType(TLRPC.Message message) {
        if (message == null) {
            return -1;
        }
        TLRPC.MessageMedia media = MessageObject.getMedia(message);
        if (media instanceof TLRPC.TL_messageMediaPoll) {
            return 8;
        }
        if (media instanceof TLRPC.TL_messageMediaPhoto) {
            return 0;
        }
        if (!(media instanceof TLRPC.TL_messageMediaDocument)) {
            if (!message.entities.isEmpty()) {
                for (int i9 = 0; i9 < message.entities.size(); i9++) {
                    TLRPC.MessageEntity messageEntity = message.entities.get(i9);
                    if ((messageEntity instanceof TLRPC.TL_messageEntityUrl) || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntityEmail)) {
                        return 3;
                    }
                }
            }
            return -1;
        }
        TLRPC.Document document = media.document;
        if (document == null) {
            return -1;
        }
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        for (int i10 = 0; i10 < document.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                z10 = documentAttribute.round_message;
                z12 = !z10;
                z11 = z10;
            } else if (documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) {
                z13 = true;
            } else if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                z10 = documentAttribute.voice;
                z15 = !z10;
            } else if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                z14 = true;
            }
        }
        if (z10 || z11) {
            return 2;
        }
        if (z12 && !z13 && !z14) {
            return 0;
        }
        if (z14) {
            return -1;
        }
        if (z13) {
            return 5;
        }
        return z15 ? 4 : 1;
    }

    public static TLRPC.TL_attachMenuBotIcon getPlaceholderStaticAttachMenuBotIcon(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList.get(i9);
            i9++;
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = tL_attachMenuBotIcon;
            if (tL_attachMenuBotIcon2.name.equals(ATTACH_MENU_BOT_PLACEHOLDER_STATIC_KEY)) {
                return tL_attachMenuBotIcon2;
            }
        }
        return null;
    }

    public static TLRPC.TL_attachMenuBotIcon getSideAttachMenuBotIcon(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList.get(i9);
            i9++;
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = tL_attachMenuBotIcon;
            if (tL_attachMenuBotIcon2.name.equals("android_side_menu_static")) {
                return tL_attachMenuBotIcon2;
            }
        }
        return null;
    }

    public static TLRPC.TL_attachMenuBotIcon getSideMenuBotIcon(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList.get(i9);
            i9++;
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = tL_attachMenuBotIcon;
            if (tL_attachMenuBotIcon2.name.equals("android_side_menu_static")) {
                return tL_attachMenuBotIcon2;
            }
        }
        return null;
    }

    public static TLRPC.TL_attachMenuBotIcon getStaticAttachMenuBotIcon(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList.get(i9);
            i9++;
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = tL_attachMenuBotIcon;
            if (tL_attachMenuBotIcon2.name.equals(ATTACH_MENU_BOT_STATIC_ICON_KEY)) {
                return tL_attachMenuBotIcon2;
            }
        }
        return null;
    }

    public static long getStickerSetId(TLRPC.Document document) {
        if (document == null) {
            return -1L;
        }
        for (int i9 = 0; i9 < document.attributes.size(); i9++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i9);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetID) {
                    return inputStickerSet.id;
                }
                return -1L;
            }
        }
        return -1L;
    }

    public static ArrayList<vz0> getTextStyleRuns(ArrayList<TLRPC.MessageEntity> arrayList, CharSequence charSequence, int i9) {
        int i10;
        ArrayList<vz0> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList(arrayList);
        Collections.sort(arrayList3, new q(10));
        int size = arrayList3.size();
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList3.get(i11);
            if (messageEntity != null && messageEntity.length > 0 && (i10 = messageEntity.offset) >= 0 && i10 < charSequence.length()) {
                if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                    messageEntity.length = charSequence.length() - messageEntity.offset;
                }
                if (!(messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                    vz0 vz0Var = new vz0();
                    int i12 = messageEntity.offset;
                    vz0Var.b = i12;
                    vz0Var.c = i12 + messageEntity.length;
                    if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                        vz0Var.a = 256;
                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                        vz0Var.a = 8;
                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                        vz0Var.a = 16;
                    } else if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                        vz0Var.a = 1;
                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                        vz0Var.a = 2;
                    } else if ((messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                        vz0Var.a = 4;
                    } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                        vz0Var.a = 64;
                        vz0Var.d = messageEntity;
                    } else if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                        vz0Var.a = 64;
                        vz0Var.d = messageEntity;
                    } else {
                        vz0Var.a = 128;
                        vz0Var.d = messageEntity;
                    }
                    if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                        vz0Var.a |= 1024;
                    }
                    vz0Var.a &= i9;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        vz0 vz0Var2 = arrayList2.get(i13);
                        int i14 = vz0Var.b;
                        int i15 = vz0Var2.b;
                        if (i14 > i15) {
                            int i16 = vz0Var2.c;
                            if (i14 < i16) {
                                if (vz0Var.c < i16) {
                                    vz0 vz0Var3 = new vz0(vz0Var);
                                    vz0Var3.b(vz0Var2);
                                    arrayList2.add(i13 + 1, vz0Var3);
                                    vz0 vz0Var4 = new vz0(vz0Var2);
                                    vz0Var4.b = vz0Var.c;
                                    i13 += 2;
                                    size2 += 2;
                                    arrayList2.add(i13, vz0Var4);
                                } else {
                                    vz0 vz0Var5 = new vz0(vz0Var);
                                    vz0Var5.b(vz0Var2);
                                    vz0Var5.c = vz0Var2.c;
                                    i13++;
                                    size2++;
                                    arrayList2.add(i13, vz0Var5);
                                }
                                int i17 = vz0Var.b;
                                vz0Var.b = vz0Var2.c;
                                vz0Var2.c = i17;
                            }
                        } else {
                            int i18 = vz0Var.c;
                            if (i15 < i18) {
                                int i19 = vz0Var2.c;
                                if (i18 == i19) {
                                    vz0Var2.b(vz0Var);
                                } else if (i18 < i19) {
                                    vz0 vz0Var6 = new vz0(vz0Var2);
                                    vz0Var6.b(vz0Var);
                                    vz0Var6.c = vz0Var.c;
                                    i13++;
                                    size2++;
                                    arrayList2.add(i13, vz0Var6);
                                    vz0Var2.b = vz0Var.c;
                                } else {
                                    vz0 vz0Var7 = new vz0(vz0Var);
                                    vz0Var7.b = vz0Var2.c;
                                    i13++;
                                    size2++;
                                    arrayList2.add(i13, vz0Var7);
                                    vz0Var2.b(vz0Var);
                                }
                                vz0Var.c = i15;
                            }
                        }
                        i13++;
                    }
                    if (vz0Var.b < vz0Var.c) {
                        arrayList2.add(vz0Var);
                    }
                }
            }
        }
        return arrayList2;
    }

    public static String inputSetKey(TLRPC.InputStickerSet inputStickerSet) {
        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetID) {
            return "id" + inputStickerSet.id + "access_hash" + inputStickerSet.access_hash;
        }
        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetShortName) {
            return "short" + inputStickerSet.short_name;
        }
        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty) {
            return "empty";
        }
        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetAnimatedEmoji) {
            return "animatedEmoji";
        }
        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiGenericAnimations) {
            return "emojiGenericAnimations";
        }
        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses) {
            return "emojiChannelDefaultStatuses";
        }
        if (!(inputStickerSet instanceof TLRPC.TL_inputStickerSetDice)) {
            return inputStickerSet instanceof TLRPC.TL_inputStickerSetPremiumGifts ? "premiumGifts" : inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultTopicIcons ? "defaultTopicIcons" : inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses ? "emojiDefaultStatuses" : inputStickerSet instanceof TLRPC.TL_inputStickerSetTonGifts ? "tonGifts" : BuildConfig.BETA_URL;
        }
        return "dice" + ((TLRPC.TL_inputStickerSetDice) inputStickerSet).emoticon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addRecentGif$26(TLRPC.Document document) {
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.id + "' AND type = 2").stepThis().dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addRecentGif$27(TLRPC.Document document) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 0, document, 7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addRecentSticker$20() {
        getMediaDataController().loadRecents(2, false, false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addRecentSticker$21(Object obj, TLRPC.TL_messages_faveSticker tL_messages_faveSticker, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text) || obj == null) {
            AndroidUtilities.runOnUIThread(new g7(this, 2));
        } else {
            getFileRefController().requestReference(obj, tL_messages_faveSticker);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addRecentSticker$22(Object obj, TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text) || obj == null) {
            return;
        }
        getFileRefController().requestReference(obj, tL_messages_saveRecentSticker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addRecentSticker$23(int i9, TLRPC.Document document) {
        int i10 = i9 == 0 ? 3 : i9 == 1 ? 4 : i9 == 5 ? 7 : 5;
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.id + "' AND type = " + i10).stepThis().dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$broadcastPinnedMessage$167(ArrayList arrayList, boolean z10, ArrayList arrayList2) {
        getMessagesController().putUsers(arrayList, z10);
        getMessagesController().putChats(arrayList2, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$broadcastPinnedMessage$168(ArrayList arrayList) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(((MessageObject) arrayList.get(0)).getDialogId()), null, Boolean.TRUE, arrayList, null, 0, -1, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$broadcastPinnedMessage$169(ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.h hVar, a0.h hVar2) {
        getMessagesController().putUsers(arrayList, z10);
        getMessagesController().putChats(arrayList2, z10);
        int size = arrayList3.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.Message message = (TLRPC.Message) arrayList3.get(i10);
            if ((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaDocument) || (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                i9++;
            }
            arrayList4.add(new MessageObject(this.currentAccount, message, hVar, hVar2, false, i9 < 30));
        }
        AndroidUtilities.runOnUIThread(new r7(this, arrayList4, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$broadcastReplyMessages$179(ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j10) {
        ArrayList arrayList4;
        getMessagesController().putUsers(arrayList, z10);
        getMessagesController().putChats(arrayList2, z10);
        int size = arrayList3.size();
        boolean z11 = false;
        for (int i9 = 0; i9 < size; i9++) {
            MessageObject messageObject = (MessageObject) arrayList3.get(i9);
            SparseArray sparseArray = (SparseArray) hVar.f(messageObject.getDialogId());
            if (sparseArray != null && (arrayList4 = (ArrayList) sparseArray.get(messageObject.getId())) != null) {
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    MessageObject messageObject2 = (MessageObject) arrayList4.get(i10);
                    messageObject2.replyMessageObject = messageObject;
                    messageObject2.applyTimestampsHighlightForReplyMsg();
                    TLRPC.MessageAction messageAction = messageObject2.messageOwner.action;
                    if (messageAction instanceof TLRPC.TL_messageActionPinMessage) {
                        messageObject2.generatePinMessageText(null, null);
                    } else if (messageAction instanceof TLRPC.TL_messageActionGameScore) {
                        messageObject2.generateGameMessageText(null);
                    } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSent) {
                        messageObject2.generatePaymentSentMessageText(null, false);
                    } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSentMe) {
                        messageObject2.generatePaymentSentMessageText(null, true);
                    } else if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                        messageObject2.generateSuggestionApprovalMessageText();
                    }
                }
                z11 = true;
            }
        }
        if (z11) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.replyMessagesDidLoad, Long.valueOf(j10), arrayList3, hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x00a5, code lost:
    
        if (r4.isEmpty() != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02f7 A[Catch: all -> 0x0389, TryCatch #4 {all -> 0x0389, blocks: (B:36:0x01c2, B:39:0x02bf, B:42:0x02d9, B:44:0x02f7, B:46:0x0306, B:48:0x0319, B:50:0x0323, B:52:0x0327, B:54:0x032a, B:56:0x0364, B:58:0x0330, B:59:0x0335, B:63:0x0336, B:64:0x033b, B:65:0x033c, B:67:0x0344, B:69:0x0348, B:71:0x034b, B:73:0x0356, B:74:0x0361, B:76:0x035c, B:78:0x036d, B:79:0x0372, B:82:0x0373, B:83:0x0378, B:84:0x030d, B:109:0x02b3, B:139:0x0379, B:140:0x0380, B:141:0x0381, B:142:0x0388), top: B:12:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0306 A[Catch: all -> 0x0389, TryCatch #4 {all -> 0x0389, blocks: (B:36:0x01c2, B:39:0x02bf, B:42:0x02d9, B:44:0x02f7, B:46:0x0306, B:48:0x0319, B:50:0x0323, B:52:0x0327, B:54:0x032a, B:56:0x0364, B:58:0x0330, B:59:0x0335, B:63:0x0336, B:64:0x033b, B:65:0x033c, B:67:0x0344, B:69:0x0348, B:71:0x034b, B:73:0x0356, B:74:0x0361, B:76:0x035c, B:78:0x036d, B:79:0x0372, B:82:0x0373, B:83:0x0378, B:84:0x030d, B:109:0x02b3, B:139:0x0379, B:140:0x0380, B:141:0x0381, B:142:0x0388), top: B:12:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0319 A[Catch: all -> 0x0389, TryCatch #4 {all -> 0x0389, blocks: (B:36:0x01c2, B:39:0x02bf, B:42:0x02d9, B:44:0x02f7, B:46:0x0306, B:48:0x0319, B:50:0x0323, B:52:0x0327, B:54:0x032a, B:56:0x0364, B:58:0x0330, B:59:0x0335, B:63:0x0336, B:64:0x033b, B:65:0x033c, B:67:0x0344, B:69:0x0348, B:71:0x034b, B:73:0x0356, B:74:0x0361, B:76:0x035c, B:78:0x036d, B:79:0x0372, B:82:0x0373, B:83:0x0378, B:84:0x030d, B:109:0x02b3, B:139:0x0379, B:140:0x0380, B:141:0x0381, B:142:0x0388), top: B:12:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x033c A[Catch: all -> 0x0389, TryCatch #4 {all -> 0x0389, blocks: (B:36:0x01c2, B:39:0x02bf, B:42:0x02d9, B:44:0x02f7, B:46:0x0306, B:48:0x0319, B:50:0x0323, B:52:0x0327, B:54:0x032a, B:56:0x0364, B:58:0x0330, B:59:0x0335, B:63:0x0336, B:64:0x033b, B:65:0x033c, B:67:0x0344, B:69:0x0348, B:71:0x034b, B:73:0x0356, B:74:0x0361, B:76:0x035c, B:78:0x036d, B:79:0x0372, B:82:0x0373, B:83:0x0378, B:84:0x030d, B:109:0x02b3, B:139:0x0379, B:140:0x0380, B:141:0x0381, B:142:0x0388), top: B:12:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x030d A[Catch: all -> 0x0389, TryCatch #4 {all -> 0x0389, blocks: (B:36:0x01c2, B:39:0x02bf, B:42:0x02d9, B:44:0x02f7, B:46:0x0306, B:48:0x0319, B:50:0x0323, B:52:0x0327, B:54:0x032a, B:56:0x0364, B:58:0x0330, B:59:0x0335, B:63:0x0336, B:64:0x033b, B:65:0x033c, B:67:0x0344, B:69:0x0348, B:71:0x034b, B:73:0x0356, B:74:0x0361, B:76:0x035c, B:78:0x036d, B:79:0x0372, B:82:0x0373, B:83:0x0378, B:84:0x030d, B:109:0x02b3, B:139:0x0379, B:140:0x0380, B:141:0x0381, B:142:0x0388), top: B:12:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lambda$buildShortcuts$143(boolean z10, ArrayList arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        g0.c cVar;
        boolean z11;
        ArrayList arrayList4;
        char c10;
        TLRPC.Chat chat;
        TLRPC.User user;
        int i9;
        ArrayList arrayList5;
        String str;
        TLRPC.FileLocation fileLocation;
        String str2;
        Intent intent;
        Bitmap bitmap;
        ArrayList arrayList6 = arrayList;
        try {
            if (SharedConfig.directShareHash == null) {
                SharedConfig.directShareHash = UUID.randomUUID().toString();
                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putString("directShareHash2", SharedConfig.directShareHash).commit();
            }
            arrayList2 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            if (z10) {
                g0.f.n(ApplicationLoader.applicationContext);
            } else {
                List e10 = g0.f.e(ApplicationLoader.applicationContext);
                if (e10 != null && !e10.isEmpty()) {
                    arrayList7.add("compose");
                    for (int i10 = 0; i10 < arrayList6.size(); i10++) {
                        arrayList7.add("did3_" + MessageObject.getPeerId(((TLRPC.TL_topPeer) arrayList6.get(i10)).peer));
                    }
                    for (int i11 = 0; i11 < e10.size(); i11++) {
                        String str3 = ((g0.c) e10.get(i11)).b;
                        if (!arrayList7.remove(str3)) {
                            arrayList8.add(str3);
                        }
                        arrayList2.add(str3);
                    }
                    if (arrayList7.isEmpty()) {
                    }
                }
                if (!arrayList8.isEmpty()) {
                    g0.f.o(ApplicationLoader.applicationContext, arrayList8);
                }
            }
            Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
            intent2.setAction("new_dialog");
            arrayList3 = new ArrayList();
            Context context = ApplicationLoader.applicationContext;
            cVar = new g0.c();
            cVar.a = context;
            cVar.b = "compose";
            cVar.e = LocaleController.getString(R.string.NewConversationShortcut);
            cVar.f = LocaleController.getString(R.string.NewConversationShortcut);
            cVar.h = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.shortcut_compose);
            cVar.m = 0;
            z11 = true;
            cVar.c = new Intent[]{intent2};
        } catch (Throwable unused) {
        }
        try {
            if (TextUtils.isEmpty(cVar.e)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            Intent[] intentArr = cVar.c;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            if (z10) {
                g0.f.m(ApplicationLoader.applicationContext, cVar);
            } else {
                arrayList3.add(cVar);
                if (arrayList2.contains("compose")) {
                    g0.f.w(ApplicationLoader.applicationContext, arrayList3);
                } else {
                    g0.f.a(ApplicationLoader.applicationContext, arrayList3);
                }
                arrayList3.clear();
            }
            HashSet hashSet = new HashSet(1);
            hashSet.add(SHORTCUT_CATEGORY);
            int i12 = 0;
            while (i12 < arrayList6.size()) {
                Intent intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) OpenChatReceiver.class);
                long peerId = MessageObject.getPeerId(((TLRPC.TL_topPeer) arrayList6.get(i12)).peer);
                if (DialogObject.isUserDialog(peerId)) {
                    intent3.putExtra("userId", peerId);
                    user = getMessagesController().getUser(Long.valueOf(peerId));
                    arrayList4 = arrayList2;
                    chat = null;
                    c10 = 0;
                } else {
                    arrayList4 = arrayList2;
                    long j10 = -peerId;
                    c10 = 0;
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j10));
                    intent3.putExtra("chatId", j10);
                    chat = chat2;
                    user = null;
                }
                if ((user == null || UserObject.isDeleted(user)) && chat == null) {
                    i9 = i12;
                    arrayList5 = arrayList4;
                } else if (user != null) {
                    str = ContactsController.formatName(user.first_name, user.last_name);
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null) {
                        fileLocation = userProfilePhoto.photo_small;
                        intent3.putExtra("currentAccount", this.currentAccount);
                        intent3.setAction("com.tmessages.openchat" + peerId);
                        intent3.putExtra("dialogId", peerId);
                        intent3.putExtra("hash", SharedConfig.directShareHash);
                        intent3.addFlags(67108864);
                        if (fileLocation == null) {
                            try {
                                Bitmap decodeFile = BitmapFactory.decodeFile(getFileLoader().getPathToAttach(fileLocation, z11).toString());
                                if (decodeFile != null) {
                                    try {
                                        int dp = AndroidUtilities.dp(48.0f);
                                        bitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
                                        Canvas canvas = new Canvas(bitmap);
                                        if (roundPaint == null) {
                                            roundPaint = new Paint(3);
                                            bitmapRect = new RectF();
                                            Paint paint = new Paint(1);
                                            erasePaint = paint;
                                            str2 = str;
                                            try {
                                                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                                Path path = new Path();
                                                roundPath = path;
                                                i9 = i12;
                                                intent = intent3;
                                                try {
                                                    path.addCircle(dp / 2, dp / 2, (dp / 2) - AndroidUtilities.dp(2.0f), Path.Direction.CW);
                                                    roundPath.toggleInverseFillType();
                                                } catch (Throwable th) {
                                                    th = th;
                                                    bitmap = decodeFile;
                                                    FileLog.e(th);
                                                    String str4 = "did3_" + peerId;
                                                    if (!TextUtils.isEmpty(str2)) {
                                                    }
                                                    Context context2 = ApplicationLoader.applicationContext;
                                                    g0.c cVar2 = new g0.c();
                                                    cVar2.a = context2;
                                                    cVar2.b = str4;
                                                    cVar2.e = r2;
                                                    cVar2.f = r2;
                                                    cVar2.m = i9 + 1;
                                                    Intent[] intentArr2 = new Intent[1];
                                                    intentArr2[c10] = intent;
                                                    cVar2.c = intentArr2;
                                                    if (!SharedConfig.directShare) {
                                                    }
                                                    if (bitmap == null) {
                                                    }
                                                    if (!z10) {
                                                    }
                                                    i12 = i9 + 1;
                                                    arrayList6 = arrayList;
                                                    arrayList2 = arrayList5;
                                                    z11 = true;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                i9 = i12;
                                                intent = intent3;
                                                bitmap = decodeFile;
                                                FileLog.e(th);
                                                String str42 = "did3_" + peerId;
                                                if (!TextUtils.isEmpty(str2)) {
                                                }
                                                Context context22 = ApplicationLoader.applicationContext;
                                                g0.c cVar22 = new g0.c();
                                                cVar22.a = context22;
                                                cVar22.b = str42;
                                                cVar22.e = r2;
                                                cVar22.f = r2;
                                                cVar22.m = i9 + 1;
                                                Intent[] intentArr22 = new Intent[1];
                                                intentArr22[c10] = intent;
                                                cVar22.c = intentArr22;
                                                if (!SharedConfig.directShare) {
                                                }
                                                if (bitmap == null) {
                                                }
                                                if (!z10) {
                                                }
                                                i12 = i9 + 1;
                                                arrayList6 = arrayList;
                                                arrayList2 = arrayList5;
                                                z11 = true;
                                            }
                                        } else {
                                            str2 = str;
                                            i9 = i12;
                                            intent = intent3;
                                        }
                                        bitmapRect.set(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f));
                                        canvas.drawBitmap(decodeFile, (Rect) null, bitmapRect, roundPaint);
                                        canvas.drawPath(roundPath, erasePaint);
                                        try {
                                            canvas.setBitmap(null);
                                        } catch (Exception unused2) {
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        str2 = str;
                                    }
                                } else {
                                    str2 = str;
                                    i9 = i12;
                                    intent = intent3;
                                    bitmap = decodeFile;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                str2 = str;
                                i9 = i12;
                                intent = intent3;
                                bitmap = null;
                            }
                        } else {
                            str2 = str;
                            i9 = i12;
                            intent = intent3;
                            bitmap = null;
                        }
                        String str422 = "did3_" + peerId;
                        String str5 = !TextUtils.isEmpty(str2) ? " " : str2;
                        Context context222 = ApplicationLoader.applicationContext;
                        g0.c cVar222 = new g0.c();
                        cVar222.a = context222;
                        cVar222.b = str422;
                        cVar222.e = str5;
                        cVar222.f = str5;
                        cVar222.m = i9 + 1;
                        Intent[] intentArr222 = new Intent[1];
                        intentArr222[c10] = intent;
                        cVar222.c = intentArr222;
                        if (!SharedConfig.directShare) {
                            a0.g gVar = new a0.g(0);
                            gVar.addAll(hashSet);
                            cVar222.j = gVar;
                        }
                        if (bitmap == null) {
                            cVar222.h = IconCompat.c(bitmap);
                        } else {
                            cVar222.h = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.shortcut_user);
                        }
                        if (!z10) {
                            Context context3 = ApplicationLoader.applicationContext;
                            if (TextUtils.isEmpty(cVar222.e)) {
                                throw new IllegalArgumentException("Shortcut must have a non-empty label");
                            }
                            Intent[] intentArr3 = cVar222.c;
                            if (intentArr3 == null || intentArr3.length == 0) {
                                throw new IllegalArgumentException("Shortcut must have an intent");
                            }
                            g0.f.m(context3, cVar222);
                            arrayList5 = arrayList4;
                        } else {
                            if (TextUtils.isEmpty(cVar222.e)) {
                                throw new IllegalArgumentException("Shortcut must have a non-empty label");
                            }
                            Intent[] intentArr4 = cVar222.c;
                            if (intentArr4 == null || intentArr4.length == 0) {
                                throw new IllegalArgumentException("Shortcut must have an intent");
                            }
                            arrayList3.add(cVar222);
                            arrayList5 = arrayList4;
                            if (arrayList5.contains(str422)) {
                                g0.f.w(ApplicationLoader.applicationContext, arrayList3);
                            } else {
                                g0.f.a(ApplicationLoader.applicationContext, arrayList3);
                            }
                            arrayList3.clear();
                        }
                    }
                    fileLocation = null;
                    intent3.putExtra("currentAccount", this.currentAccount);
                    intent3.setAction("com.tmessages.openchat" + peerId);
                    intent3.putExtra("dialogId", peerId);
                    intent3.putExtra("hash", SharedConfig.directShareHash);
                    intent3.addFlags(67108864);
                    if (fileLocation == null) {
                    }
                    String str4222 = "did3_" + peerId;
                    if (!TextUtils.isEmpty(str2)) {
                    }
                    Context context2222 = ApplicationLoader.applicationContext;
                    g0.c cVar2222 = new g0.c();
                    cVar2222.a = context2222;
                    cVar2222.b = str4222;
                    cVar2222.e = str5;
                    cVar2222.f = str5;
                    cVar2222.m = i9 + 1;
                    Intent[] intentArr2222 = new Intent[1];
                    intentArr2222[c10] = intent;
                    cVar2222.c = intentArr2222;
                    if (!SharedConfig.directShare) {
                    }
                    if (bitmap == null) {
                    }
                    if (!z10) {
                    }
                } else {
                    String str6 = chat.title;
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    if (chatPhoto != null) {
                        TLRPC.FileLocation fileLocation2 = chatPhoto.photo_small;
                        str = str6;
                        fileLocation = fileLocation2;
                        intent3.putExtra("currentAccount", this.currentAccount);
                        intent3.setAction("com.tmessages.openchat" + peerId);
                        intent3.putExtra("dialogId", peerId);
                        intent3.putExtra("hash", SharedConfig.directShareHash);
                        intent3.addFlags(67108864);
                        if (fileLocation == null) {
                        }
                        String str42222 = "did3_" + peerId;
                        if (!TextUtils.isEmpty(str2)) {
                        }
                        Context context22222 = ApplicationLoader.applicationContext;
                        g0.c cVar22222 = new g0.c();
                        cVar22222.a = context22222;
                        cVar22222.b = str42222;
                        cVar22222.e = str5;
                        cVar22222.f = str5;
                        cVar22222.m = i9 + 1;
                        Intent[] intentArr22222 = new Intent[1];
                        intentArr22222[c10] = intent;
                        cVar22222.c = intentArr22222;
                        if (!SharedConfig.directShare) {
                        }
                        if (bitmap == null) {
                        }
                        if (!z10) {
                        }
                    } else {
                        str = str6;
                        fileLocation = null;
                        intent3.putExtra("currentAccount", this.currentAccount);
                        intent3.setAction("com.tmessages.openchat" + peerId);
                        intent3.putExtra("dialogId", peerId);
                        intent3.putExtra("hash", SharedConfig.directShareHash);
                        intent3.addFlags(67108864);
                        if (fileLocation == null) {
                        }
                        String str422222 = "did3_" + peerId;
                        if (!TextUtils.isEmpty(str2)) {
                        }
                        Context context222222 = ApplicationLoader.applicationContext;
                        g0.c cVar222222 = new g0.c();
                        cVar222222.a = context222222;
                        cVar222222.b = str422222;
                        cVar222222.e = str5;
                        cVar222222.f = str5;
                        cVar222222.m = i9 + 1;
                        Intent[] intentArr222222 = new Intent[1];
                        intentArr222222[c10] = intent;
                        cVar222222.c = intentArr222222;
                        if (!SharedConfig.directShare) {
                        }
                        if (bitmap == null) {
                        }
                        if (!z10) {
                        }
                    }
                }
                i12 = i9 + 1;
                arrayList6 = arrayList;
                arrayList2 = arrayList5;
                z11 = true;
            }
        } catch (Throwable unused3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkDefaultTopicIcons$81(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            getUserConfig().defaultTopicIcons = tL_messages_stickerSet.set.short_name;
            getUserConfig().lastUpdatedDefaultTopicIcons = System.currentTimeMillis();
            getUserConfig().saveConfig(false);
            processLoadedDiceStickers(getUserConfig().defaultTopicIcons, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkDefaultTopicIcons$82(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new c7(this, tLObject, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkGenericAnimations$79(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            getUserConfig().genericAnimationsStickerPack = tL_messages_stickerSet.set.short_name;
            getUserConfig().lastUpdatedGenericAnimations = System.currentTimeMillis();
            getUserConfig().saveConfig(false);
            processLoadedDiceStickers(getUserConfig().genericAnimationsStickerPack, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
            for (int i9 = 0; i9 < tL_messages_stickerSet.documents.size(); i9++) {
                if (this.currentAccount == UserConfig.selectedAccount) {
                    preloadImage(ImageLocation.getForDocument(tL_messages_stickerSet.documents.get(i9)), 0);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkGenericAnimations$80(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new c7(this, tLObject, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkPremiumGiftStickers$75(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            getUserConfig().premiumGiftsStickerPack = tL_messages_stickerSet.set.short_name;
            getUserConfig().lastUpdatedPremiumGiftsStickerPack = System.currentTimeMillis();
            getUserConfig().saveConfig(false);
            processLoadedDiceStickers(getUserConfig().premiumGiftsStickerPack, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdatePremiumGiftStickers, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkPremiumGiftStickers$76(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new c7(this, tLObject, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkTonGiftStickers$77(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            getUserConfig().premiumTonStickerPack = tL_messages_stickerSet.set.short_name;
            getUserConfig().lastUpdatedTonGiftsStickerPack = System.currentTimeMillis();
            getUserConfig().saveConfig(false);
            processLoadedDiceStickers(getUserConfig().premiumTonStickerPack, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateTonGiftStickers, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkTonGiftStickers$78(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new c7(this, tLObject, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$cleanup$1() {
        try {
            g0.f.n(ApplicationLoader.applicationContext);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cleanup$2() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadHints, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadInlineHints, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadGuestBotHints, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadWebappsHints, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cleanupStickerSetCache$39() {
        try {
            long currentTimeMillis = System.currentTimeMillis() - 604800000;
            getMessagesStorage().getDatabase().executeFast("DELETE FROM stickersets2 WHERE date < " + currentTimeMillis).stepThis().dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearBotKeyboard$193(ArrayList arrayList, MessagesStorage.TopicKey topicKey) {
        if (arrayList == null) {
            if (topicKey != null) {
                this.botKeyboards.remove(topicKey);
                this.botDialogKeyboards.l(topicKey.dialogId);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, null, topicKey);
                return;
            }
            return;
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            int intValue = ((Integer) arrayList.get(i9)).intValue();
            long j10 = intValue;
            MessagesStorage.TopicKey topicKey2 = (MessagesStorage.TopicKey) this.botKeyboardsByMids.f(j10);
            if (topicKey2 != null) {
                this.botKeyboards.remove(topicKey2);
                ArrayList arrayList2 = (ArrayList) this.botDialogKeyboards.f(topicKey2.dialogId);
                if (arrayList2 != null) {
                    int i10 = 0;
                    while (i10 < arrayList2.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList2.get(i10);
                        if (message == null || message.id == intValue) {
                            arrayList2.remove(i10);
                            i10--;
                        }
                        i10++;
                    }
                    if (arrayList2.isEmpty()) {
                        this.botDialogKeyboards.l(topicKey2.dialogId);
                    }
                }
                this.botKeyboardsByMids.l(j10);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, null, topicKey2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearBotKeyboard$194(long j10) {
        ArrayList arrayList = (ArrayList) this.botDialogKeyboards.f(j10);
        if (arrayList != null) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i9);
                int i10 = this.currentAccount;
                MessagesStorage.TopicKey of2 = MessagesStorage.TopicKey.of(j10, MessageObject.getTopicId(i10, message, ChatObject.isForum(i10, j10)));
                this.botKeyboards.remove(of2);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, null, of2);
            }
        }
        this.botDialogKeyboards.l(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearRecentEmojiStatuses$229() {
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM emoji_statuses WHERE type = 0").stepThis().dispose();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearRecentStickers$17() {
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM web_recent_v3 WHERE type = 3").stepThis().dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearRecentStickers$18(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            getMessagesStorage().getStorageQueue().postRunnable(new g7(this, 5));
            this.recentStickers[0].clear();
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentDocumentsDidLoad, Boolean.FALSE, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearRecentStickers$19(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new c7(this, tLObject, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearTopPeers$149() {
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deletePeer$159(long j10, int i9) {
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            Locale locale = Locale.US;
            database.executeFast("DELETE FROM chat_hints WHERE did = " + j10 + " AND type = " + i9).stepThis().dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchEmojiStatuses$230() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentEmojiStatusesUpdate, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$fetchEmojiStatuses$231(int i9) {
        boolean z10;
        NativeByteBuffer byteBufferValue;
        try {
            SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data FROM emoji_statuses WHERE type = " + i9 + " LIMIT 1", new Object[0]);
            if (!queryFinalized.next() || queryFinalized.getColumnCount() <= 0 || queryFinalized.isNull(0) || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                z10 = false;
            } else {
                TL_account.EmojiStatuses TLdeserialize = TL_account.EmojiStatuses.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                if (TLdeserialize instanceof TL_account.TL_emojiStatuses) {
                    this.emojiStatusesHash[i9] = TLdeserialize.hash;
                    this.emojiStatuses[i9] = TLdeserialize.statuses;
                    z10 = true;
                } else {
                    z10 = false;
                }
                try {
                    byteBufferValue.reuse();
                } catch (Exception e10) {
                    e = e10;
                    FileLog.e(e);
                    this.emojiStatusesFromCacheFetched[i9] = true;
                    this.emojiStatusesFetching[i9] = false;
                    if (z10) {
                    }
                }
            }
            queryFinalized.dispose();
        } catch (Exception e11) {
            e = e11;
            z10 = false;
        }
        this.emojiStatusesFromCacheFetched[i9] = true;
        this.emojiStatusesFetching[i9] = false;
        if (z10) {
            fetchEmojiStatuses(i9, false);
        } else {
            AndroidUtilities.runOnUIThread(new g7(this, 11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchEmojiStatuses$232() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentEmojiStatusesUpdate, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchEmojiStatuses$233(int i9, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.emojiStatusesFetchDate[i9] = Long.valueOf(System.currentTimeMillis() / 1000);
        if (tLObject instanceof TL_account.TL_emojiStatusesNotModified) {
            this.emojiStatusesFetching[i9] = false;
            return;
        }
        if (tLObject instanceof TL_account.TL_emojiStatuses) {
            TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) tLObject;
            this.emojiStatusesHash[i9] = tL_emojiStatuses.hash;
            this.emojiStatuses[i9] = tL_emojiStatuses.statuses;
            updateEmojiStatuses(i9, tL_emojiStatuses);
            AndroidUtilities.runOnUIThread(new g7(this, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchNewEmojiKeywords$207(String str) {
        this.currentFetchingEmoji.remove(str);
        this.fetchedEmoji.add(str);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiKeywordsLoaded, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchNewEmojiKeywords$208(String str) {
        this.currentFetchingEmoji.remove(str);
        this.fetchedEmoji.add(str);
        fetchNewEmojiKeywords(new String[]{str});
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiKeywordsLoaded, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchNewEmojiKeywords$209(String str) {
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("DELETE FROM emoji_keywords_info_v2 WHERE lang = ?");
            executeFast.bindString(1, str);
            executeFast.step();
            executeFast.dispose();
            AndroidUtilities.runOnUIThread(new y7(this, str, 2));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchNewEmojiKeywords$210() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiKeywordsLoaded, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchNewEmojiKeywords$211(String str) {
        this.currentFetchingEmoji.remove(str);
        this.fetchedEmoji.add(str);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiKeywordsLoaded, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchNewEmojiKeywords$212(int i9, String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject == null) {
            AndroidUtilities.runOnUIThread(new y7(this, str2, 6));
            return;
        }
        TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference = (TLRPC.TL_emojiKeywordsDifference) tLObject;
        if (i9 != -1 && !tL_emojiKeywordsDifference.lang_code.equals(str)) {
            getMessagesStorage().getStorageQueue().postRunnable(new y7(this, str2, 5));
        } else {
            putEmojiKeywords(str2, tL_emojiKeywordsDifference);
            AndroidUtilities.runOnUIThread(new g7(this, 18));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$fetchNewEmojiKeywords$213(String str) {
        int i9;
        int i10;
        TLRPC.TL_messages_getEmojiKeywordsDifference tL_messages_getEmojiKeywordsDifference;
        int i11 = 0;
        String str2 = null;
        long j10 = 0;
        try {
            SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT alias, version, date FROM emoji_keywords_info_v2 WHERE lang = ?", str);
            if (queryFinalized.next()) {
                str2 = queryFinalized.stringValue(0);
                i9 = queryFinalized.intValue(1);
                try {
                    j10 = queryFinalized.longValue(2);
                } catch (Exception e10) {
                    e = e10;
                    FileLog.e(e);
                    String str3 = str2;
                    i10 = i9;
                    if (BuildVars.DEBUG_VERSION) {
                    }
                    if (i10 != -1) {
                    }
                    getConnectionsManager().sendRequest(tL_messages_getEmojiKeywordsDifference, new e8(this, i10, str3, str, 0));
                }
            } else {
                i9 = -1;
            }
            queryFinalized.dispose();
        } catch (Exception e11) {
            e = e11;
            i9 = -1;
        }
        String str32 = str2;
        i10 = i9;
        if (BuildVars.DEBUG_VERSION && Math.abs(System.currentTimeMillis() - j10) < 3600000) {
            AndroidUtilities.runOnUIThread(new y7(this, str, i11));
            return;
        }
        if (i10 != -1) {
            TLRPC.TL_messages_getEmojiKeywords tL_messages_getEmojiKeywords = new TLRPC.TL_messages_getEmojiKeywords();
            tL_messages_getEmojiKeywords.lang_code = str;
            tL_messages_getEmojiKeywordsDifference = tL_messages_getEmojiKeywords;
        } else {
            TLRPC.TL_messages_getEmojiKeywordsDifference tL_messages_getEmojiKeywordsDifference2 = new TLRPC.TL_messages_getEmojiKeywordsDifference();
            tL_messages_getEmojiKeywordsDifference2.lang_code = str;
            tL_messages_getEmojiKeywordsDifference2.from_version = i10;
            tL_messages_getEmojiKeywordsDifference = tL_messages_getEmojiKeywordsDifference2;
        }
        getConnectionsManager().sendRequest(tL_messages_getEmojiKeywordsDifference, new e8(this, i10, str32, str, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchStickerSetInternal$41(String str, TLObject tLObject) {
        ArrayList<Utilities.Callback2<Boolean, TLRPC.TL_messages_stickerSet>> arrayList = this.loadingStickerSets.get(str);
        if (arrayList != null) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                if (tLObject != null) {
                    arrayList.get(i9).run(Boolean.TRUE, (TLRPC.TL_messages_stickerSet) tLObject);
                } else {
                    arrayList.get(i9).run(Boolean.FALSE, null);
                }
            }
        }
        this.loadingStickerSets.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchStickerSetInternal$42(String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new j9(this, str, tLObject, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116 A[LOOP:1: B:32:0x00ab->B:39:0x0116, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0122 A[EDGE_INSN: B:40:0x0122->B:41:0x0122 BREAK  A[LOOP:1: B:32:0x00ab->B:39:0x0116], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$fillWithAnimatedEmoji$225(Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        int intValue;
        String str;
        boolean z12;
        char c10;
        int i9;
        ArrayList<TLRPC.StickerSetCovered> arrayList2;
        int i10;
        TLRPC.StickerSetCovered stickerSetCovered;
        ArrayList<TLRPC.Document> arrayList3;
        TLRPC.TL_documentAttributeCustomEmoji tL_documentAttributeCustomEmoji;
        TLRPC.StickerSet stickerSet;
        String str2;
        int i11;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.TL_documentAttributeCustomEmoji tL_documentAttributeCustomEmoji2;
        TLRPC.StickerSet stickerSet2;
        String str3;
        int i12;
        int i13;
        String str4;
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        MediaDataController mediaDataController = this;
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        ArrayList arrayList4 = new ArrayList();
        HashSet hashSet = new HashSet();
        ArrayList arrayList5 = new ArrayList();
        boolean z13 = true;
        if (num != null) {
            intValue = num.intValue();
        } else if (arrayList.size() > 5) {
            intValue = 1;
        } else {
            intValue = 2;
            if (arrayList.size() <= 2) {
                intValue = 3;
            }
        }
        int min = num == null ? Math.min(15, arrayList.size()) : arrayList.size();
        if (!UserConfig.getInstance(mediaDataController.currentAccount).isPremium() && !z10) {
            z13 = false;
        }
        if (z11) {
            str = UserConfig.getInstance(mediaDataController.currentAccount).defaultTopicIcons;
            if (arrayListArr[0] != null) {
                if (str != null) {
                    tL_messages_stickerSet2 = getInstance(mediaDataController.currentAccount).getStickerSetByName(str);
                    if (tL_messages_stickerSet2 == null) {
                        tL_messages_stickerSet2 = getInstance(mediaDataController.currentAccount).getStickerSetByEmojiOrName(str);
                    }
                } else {
                    tL_messages_stickerSet2 = null;
                }
                if (tL_messages_stickerSet2 != null) {
                    arrayListArr[0].add(tL_messages_stickerSet2);
                }
            }
        } else {
            str = null;
        }
        int i14 = 0;
        while (i14 < min) {
            String str5 = ((KeywordResult) arrayList.get(i14)).emoji;
            if (TextUtils.isEmpty(str5)) {
                arrayList2 = featuredEmojiSets;
                z12 = z13;
                i9 = min;
            } else {
                arrayList5.clear();
                if (Emoji.recentEmoji != null) {
                    c10 = 0;
                    int i15 = 0;
                    while (true) {
                        ArrayList<String> arrayList6 = Emoji.recentEmoji;
                        if (i15 >= arrayList6.size()) {
                            z12 = z13;
                            break;
                        }
                        if (arrayList6.get(i15).startsWith("animated_")) {
                            try {
                                z12 = z13;
                                try {
                                    TLRPC.Document f10 = org.telegram.ui.Components.k5.f(mediaDataController.currentAccount, Long.parseLong(arrayList6.get(i15).substring(9)));
                                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f10, null);
                                    if (f10 != null) {
                                        if (findAnimatedEmojiEmoticon != null) {
                                            if (findAnimatedEmojiEmoticon.contains(str5)) {
                                                if (!z12) {
                                                    if (MessageObject.isFreeEmoji(f10)) {
                                                    }
                                                }
                                                if (!hashSet.contains(Long.valueOf(f10.id))) {
                                                    hashSet.add(Long.valueOf(f10.id));
                                                    arrayList5.add(f10);
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception unused) {
                                    if (arrayList5.size() < intValue) {
                                    }
                                }
                            } catch (Exception unused2) {
                                z12 = z13;
                            }
                        } else {
                            z12 = z13;
                        }
                        if (arrayList5.size() < intValue) {
                            break;
                        }
                        i15++;
                        z13 = z12;
                    }
                } else {
                    z12 = z13;
                    c10 = 0;
                }
                if (arrayList5.size() < intValue && arrayListArr[c10] != null) {
                    int i16 = 0;
                    while (i16 < arrayListArr[c10].size()) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayListArr[c10].get(i16);
                        if (tL_messages_stickerSet3 == null || tL_messages_stickerSet3.packs == null) {
                            i11 = i16;
                            i9 = min;
                            if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                                int i17 = 0;
                                while (i17 < tL_messages_stickerSet3.documents.size()) {
                                    TLRPC.Document document2 = tL_messages_stickerSet3.documents.get(i17);
                                    if (document2 != null && document2.attributes != null && !arrayList5.contains(document2)) {
                                        int i18 = 0;
                                        while (true) {
                                            if (i18 >= document2.attributes.size()) {
                                                tL_documentAttributeCustomEmoji2 = null;
                                                break;
                                            }
                                            TLRPC.DocumentAttribute documentAttribute = document2.attributes.get(i18);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                                                tL_documentAttributeCustomEmoji2 = (TLRPC.TL_documentAttributeCustomEmoji) documentAttribute;
                                                break;
                                            }
                                            i18++;
                                        }
                                        if (tL_documentAttributeCustomEmoji2 != null && !TextUtils.isEmpty(tL_documentAttributeCustomEmoji2.alt) && tL_documentAttributeCustomEmoji2.alt.contains(str5) && (z12 || tL_documentAttributeCustomEmoji2.free || ((stickerSet2 = tL_messages_stickerSet3.set) != null && (str3 = stickerSet2.short_name) != null && str3.equals(str)))) {
                                            tL_messages_stickerSet = tL_messages_stickerSet3;
                                            if (!hashSet.contains(Long.valueOf(document2.id))) {
                                                hashSet.add(Long.valueOf(document2.id));
                                                arrayList5.add(document2);
                                                if (arrayList5.size() >= intValue) {
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                            i17++;
                                            tL_messages_stickerSet3 = tL_messages_stickerSet;
                                        }
                                    }
                                    tL_messages_stickerSet = tL_messages_stickerSet3;
                                    i17++;
                                    tL_messages_stickerSet3 = tL_messages_stickerSet;
                                }
                            }
                        } else {
                            int i19 = 0;
                            while (i19 < tL_messages_stickerSet3.packs.size()) {
                                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet3.packs.get(i19);
                                if (tL_stickerPack == null || (str4 = tL_stickerPack.emoticon) == null || !str4.contains(str5)) {
                                    i12 = i16;
                                } else {
                                    i12 = i16;
                                    int i20 = 0;
                                    while (i20 < tL_stickerPack.documents.size()) {
                                        long longValue = tL_stickerPack.documents.get(i20).longValue();
                                        int i21 = i20;
                                        int i22 = 0;
                                        while (true) {
                                            if (i22 >= tL_messages_stickerSet3.documents.size()) {
                                                i13 = min;
                                                document = null;
                                                break;
                                            }
                                            document = tL_messages_stickerSet3.documents.get(i22);
                                            int i23 = i22;
                                            i13 = min;
                                            if (document != null && document.id == longValue) {
                                                break;
                                            }
                                            i22 = i23 + 1;
                                            min = i13;
                                        }
                                        if (document != null && document.attributes != null && !arrayList5.contains(document) && !hashSet.contains(Long.valueOf(document.id))) {
                                            hashSet.add(Long.valueOf(document.id));
                                            arrayList5.add(document);
                                            if (arrayList5.size() >= intValue) {
                                                break;
                                            }
                                        }
                                        i20 = i21 + 1;
                                        min = i13;
                                    }
                                }
                                i13 = min;
                                i19++;
                                i16 = i12;
                                min = i13;
                            }
                            i11 = i16;
                            i9 = min;
                        }
                        if (arrayList5.size() >= intValue) {
                            break;
                        }
                        i16 = i11 + 1;
                        min = i9;
                    }
                }
                i9 = min;
                if (arrayList5.size() < intValue && featuredEmojiSets != null) {
                    int i24 = 0;
                    while (i24 < featuredEmojiSets.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered2 = featuredEmojiSets.get(i24);
                        if (stickerSetCovered2 != null) {
                            ArrayList<TLRPC.Document> arrayList7 = stickerSetCovered2 instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered2).documents : stickerSetCovered2.covers;
                            if (arrayList7 != null) {
                                int i25 = 0;
                                while (true) {
                                    if (i25 >= arrayList7.size()) {
                                        i10 = i24;
                                        arrayList2 = featuredEmojiSets;
                                        break;
                                    }
                                    TLRPC.Document document3 = arrayList7.get(i25);
                                    if (document3 == null || document3.attributes == null || arrayList5.contains(document3)) {
                                        i10 = i24;
                                        arrayList2 = featuredEmojiSets;
                                    } else {
                                        i10 = i24;
                                        int i26 = 0;
                                        while (true) {
                                            if (i26 >= document3.attributes.size()) {
                                                arrayList2 = featuredEmojiSets;
                                                tL_documentAttributeCustomEmoji = null;
                                                break;
                                            }
                                            TLRPC.DocumentAttribute documentAttribute2 = document3.attributes.get(i26);
                                            arrayList2 = featuredEmojiSets;
                                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                                                tL_documentAttributeCustomEmoji = (TLRPC.TL_documentAttributeCustomEmoji) documentAttribute2;
                                                break;
                                            } else {
                                                i26++;
                                                featuredEmojiSets = arrayList2;
                                            }
                                        }
                                        if (tL_documentAttributeCustomEmoji != null && !TextUtils.isEmpty(tL_documentAttributeCustomEmoji.alt) && tL_documentAttributeCustomEmoji.alt.contains(str5) && (z12 || tL_documentAttributeCustomEmoji.free || ((stickerSet = stickerSetCovered2.set) != null && (str2 = stickerSet.short_name) != null && str2.equals(str)))) {
                                            stickerSetCovered = stickerSetCovered2;
                                            arrayList3 = arrayList7;
                                            if (!hashSet.contains(Long.valueOf(document3.id))) {
                                                hashSet.add(Long.valueOf(document3.id));
                                                arrayList5.add(document3);
                                                if (arrayList5.size() >= intValue) {
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                            i25++;
                                            stickerSetCovered2 = stickerSetCovered;
                                            arrayList7 = arrayList3;
                                            i24 = i10;
                                            featuredEmojiSets = arrayList2;
                                        }
                                    }
                                    stickerSetCovered = stickerSetCovered2;
                                    arrayList3 = arrayList7;
                                    i25++;
                                    stickerSetCovered2 = stickerSetCovered;
                                    arrayList7 = arrayList3;
                                    i24 = i10;
                                    featuredEmojiSets = arrayList2;
                                }
                                if (arrayList5.size() >= intValue) {
                                    break;
                                }
                                i24 = i10 + 1;
                                featuredEmojiSets = arrayList2;
                            }
                        }
                        i10 = i24;
                        arrayList2 = featuredEmojiSets;
                        i24 = i10 + 1;
                        featuredEmojiSets = arrayList2;
                    }
                }
                arrayList2 = featuredEmojiSets;
                if (!arrayList5.isEmpty()) {
                    String str6 = ((KeywordResult) arrayList.get(i14)).keyword;
                    for (int i27 = 0; i27 < arrayList5.size(); i27++) {
                        TLRPC.Document document4 = (TLRPC.Document) arrayList5.get(i27);
                        if (document4 != null) {
                            KeywordResult keywordResult = new KeywordResult();
                            keywordResult.emoji = "animated_" + document4.id;
                            keywordResult.keyword = str6;
                            arrayList4.add(keywordResult);
                        }
                    }
                }
            }
            i14++;
            mediaDataController = this;
            z13 = z12;
            featuredEmojiSets = arrayList2;
            min = i9;
        }
        arrayList.addAll(0, arrayList4);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fillWithAnimatedEmoji$226(boolean[] zArr, ArrayList[] arrayListArr, Runnable runnable, ArrayList arrayList) {
        if (zArr[0]) {
            return;
        }
        arrayListArr[0] = arrayList;
        runnable.run();
        zArr[0] = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fillWithAnimatedEmoji$227(boolean[] zArr, ArrayList[] arrayListArr, Runnable runnable) {
        loadStickers(5, true, false, false, new g2(zArr, arrayListArr, runnable, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fillWithAnimatedEmoji$228(boolean[] zArr, Runnable runnable) {
        if (zArr[0]) {
            return;
        }
        runnable.run();
        zArr[0] = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$findStickerSetByNameInCache$29(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Utilities.Callback callback) {
        putStickerSet(tL_messages_stickerSet, false);
        callback.run(tL_messages_stickerSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$findStickerSetByNameInCache$30(String str, Utilities.Callback callback) {
        AndroidUtilities.runOnUIThread(new x8(this, getCachedStickerSetInternal(str.toLowerCase(), (Integer) 0), callback, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getAnimatedEmojiByKeywords$216(String str, ArrayList arrayList, ArrayList arrayList2, Utilities.Callback callback) {
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        String lowerCase = str.toLowerCase();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (((TLRPC.TL_messages_stickerSet) arrayList.get(i9)).keywords != null) {
                ArrayList<TLRPC.TL_stickerKeyword> arrayList5 = ((TLRPC.TL_messages_stickerSet) arrayList.get(i9)).keywords;
                for (int i10 = 0; i10 < arrayList5.size(); i10++) {
                    for (int i11 = 0; i11 < arrayList5.get(i10).keyword.size(); i11++) {
                        String str2 = arrayList5.get(i10).keyword.get(i11);
                        if (lowerCase.equals(str2)) {
                            arrayList3.add(Long.valueOf(arrayList5.get(i10).document_id));
                        } else if (lowerCase.contains(str2) || str2.contains(lowerCase)) {
                            arrayList4.add(Long.valueOf(arrayList5.get(i10).document_id));
                        }
                    }
                }
            }
        }
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            if ((arrayList2.get(i12) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList2.get(i12)).keywords != null) {
                ArrayList<TLRPC.TL_stickerKeyword> arrayList6 = ((TLRPC.TL_stickerSetFullCovered) arrayList2.get(i12)).keywords;
                for (int i13 = 0; i13 < arrayList6.size(); i13++) {
                    for (int i14 = 0; i14 < arrayList6.get(i13).keyword.size(); i14++) {
                        String str3 = arrayList6.get(i13).keyword.get(i14);
                        if (lowerCase.equals(str3)) {
                            arrayList3.add(Long.valueOf(arrayList6.get(i13).document_id));
                        } else if (lowerCase.contains(str3) || str3.contains(lowerCase)) {
                            arrayList4.add(Long.valueOf(arrayList6.get(i13).document_id));
                        }
                    }
                }
            }
        }
        arrayList3.addAll(arrayList4);
        if (callback != null) {
            callback.run(arrayList3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getEmojiNames$218(String[] strArr, String str, Utilities.Callback callback) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                int i9 = 1;
                Object[] objArr = new Object[strArr.length + 1];
                objArr[0] = str;
                String str2 = "1 = 1";
                int i10 = 0;
                while (i10 < strArr.length) {
                    if (i10 == 0) {
                        str2 = "lang = ?";
                    } else {
                        str2 = str2 + " OR lang = ?";
                    }
                    SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT alias FROM emoji_keywords_info_v2 WHERE lang = ?", strArr[i10]);
                    if (queryFinalized.next()) {
                        strArr[i10] = queryFinalized.stringValue(0);
                    }
                    queryFinalized.dispose();
                    int i11 = i10 + 1;
                    objArr[i11] = strArr[i10];
                    i10 = i11;
                }
                sQLiteCursor = getMessagesStorage().getDatabase().executeFast("SELECT keyword FROM emoji_keywords_v2 WHERE emoji = ? AND (" + str2 + ")").query(objArr);
                ArrayList arrayList = new ArrayList();
                while (sQLiteCursor.next()) {
                    arrayList.add(sQLiteCursor.stringValue(0));
                }
                AndroidUtilities.runOnUIThread(new e2(callback, arrayList, i9));
                sQLiteCursor.dispose();
            } catch (Exception e10) {
                FileLog.e(e10);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getEmojiSuggestions$219(String[] strArr, KeywordResultCallback keywordResultCallback, ArrayList arrayList) {
        for (String str : strArr) {
            if (this.currentFetchingEmoji.get(str) != null) {
                return;
            }
        }
        keywordResultCallback.run(arrayList, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getEmojiSuggestions$220(ArrayList arrayList, KeywordResult keywordResult, KeywordResult keywordResult2) {
        int indexOf = arrayList.indexOf(keywordResult.emoji);
        int i9 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (indexOf < 0) {
            indexOf = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int indexOf2 = arrayList.indexOf(keywordResult2.emoji);
        if (indexOf2 >= 0) {
            i9 = indexOf2;
        }
        if (indexOf < i9) {
            return -1;
        }
        if (indexOf > i9) {
            return 1;
        }
        int length = keywordResult.keyword.length();
        int length2 = keywordResult2.keyword.length();
        if (length < length2) {
            return -1;
        }
        return length > length2 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getEmojiSuggestions$222(CountDownLatch countDownLatch, KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str) {
        if (countDownLatch == null) {
            AndroidUtilities.runOnUIThread(new i7(keywordResultCallback, arrayList, str, 1));
        } else {
            keywordResultCallback.run(arrayList, str);
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$getEmojiSuggestions$224(String[] strArr, KeywordResultCallback keywordResultCallback, boolean z10, String str, boolean z11, ArrayList arrayList, boolean z12, Integer num, boolean z13, boolean z14, boolean z15, CountDownLatch countDownLatch) {
        String str2;
        String str3;
        SQLiteCursor queryFinalized;
        ArrayList<KeywordResult> arrayList2 = new ArrayList<>();
        HashMap hashMap = new HashMap();
        int i9 = 0;
        String str4 = null;
        boolean z16 = false;
        for (String str5 : strArr) {
            try {
                SQLiteCursor queryFinalized2 = getMessagesStorage().getDatabase().queryFinalized("SELECT alias FROM emoji_keywords_info_v2 WHERE lang = ?", str5);
                if (queryFinalized2.next()) {
                    str4 = queryFinalized2.stringValue(0);
                }
                queryFinalized2.dispose();
                if (str4 != null) {
                    z16 = true;
                }
            } catch (Exception e10) {
                e = e10;
            }
        }
        if (z16) {
            if (z10) {
                int[] iArr = new int[1];
                str2 = str;
                ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(str2, iArr);
                if (iArr[0] > 0) {
                    for (int i10 = 0; i10 < parseEmojis.size(); i10++) {
                        String charSequence = parseEmojis.get(i10).code.toString();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList2.size()) {
                                KeywordResult keywordResult = new KeywordResult();
                                keywordResult.emoji = charSequence;
                                keywordResult.keyword = "";
                                arrayList2.add(keywordResult);
                                break;
                            }
                            if (TextUtils.equals(arrayList2.get(i11).emoji, charSequence)) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
            } else {
                str2 = str;
            }
            String lowerCase = str2.toLowerCase();
            for (int i12 = 0; i12 < 2; i12++) {
                if (i12 == 1) {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase, false, false);
                    if (!translitString.equals(lowerCase)) {
                        lowerCase = translitString;
                    }
                }
                StringBuilder sb2 = new StringBuilder(lowerCase);
                int length = sb2.length();
                while (true) {
                    if (length <= 0) {
                        str3 = null;
                        break;
                    }
                    length--;
                    char charAt = (char) (sb2.charAt(length) + 1);
                    sb2.setCharAt(length, charAt);
                    if (charAt != 0) {
                        str3 = sb2.toString();
                        break;
                    }
                }
                if (z11) {
                    queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT emoji, keyword FROM emoji_keywords_v2 WHERE keyword = ?", lowerCase);
                } else if (str3 != null) {
                    queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT emoji, keyword FROM emoji_keywords_v2 WHERE keyword >= ? AND keyword < ?", lowerCase, str3);
                } else {
                    lowerCase = lowerCase + "%";
                    queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT emoji, keyword FROM emoji_keywords_v2 WHERE keyword LIKE ?", lowerCase);
                }
                while (queryFinalized.next()) {
                    String replace = queryFinalized.stringValue(0).replace("️", "");
                    if (hashMap.get(replace) == null) {
                        hashMap.put(replace, Boolean.TRUE);
                        KeywordResult keywordResult2 = new KeywordResult();
                        keywordResult2.emoji = replace;
                        keywordResult2.keyword = queryFinalized.stringValue(1);
                        arrayList2.add(keywordResult2);
                    }
                }
                queryFinalized.dispose();
            }
            String str6 = str4;
            Collections.sort(arrayList2, new h7(arrayList, i9));
            if (!z12) {
                fillWithAnimatedEmoji(arrayList2, num, z13, z14, z15, new gk(countDownLatch, keywordResultCallback, arrayList2, str6, 15));
                return;
            }
            ArrayList<KeywordResult> arrayList3 = arrayList2;
            if (countDownLatch == null) {
                AndroidUtilities.runOnUIThread(new i7(keywordResultCallback, arrayList3, str6, i9));
                return;
            } else {
                keywordResultCallback.run(arrayList3, str6);
                countDownLatch.countDown();
                return;
            }
        }
        try {
            AndroidUtilities.runOnUIThread(new gk(this, strArr, keywordResultCallback, arrayList2, 14));
        } catch (Exception e11) {
            e = e11;
            arrayList2 = arrayList2;
            FileLog.e(e);
            String str62 = str4;
            Collections.sort(arrayList2, new h7(arrayList, i9));
            if (!z12) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TLRPC.MessageEntity lambda$getEntities$181(Void r02) {
        return new TLRPC.TL_messageEntityBold();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TLRPC.MessageEntity lambda$getEntities$182(Void r02) {
        return new TLRPC.TL_messageEntityItalic();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TLRPC.MessageEntity lambda$getEntities$183(Void r02) {
        return new TLRPC.TL_messageEntitySpoiler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TLRPC.MessageEntity lambda$getEntities$184(Void r02) {
        return new TLRPC.TL_messageEntityStrike();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getMediaCount$132(long j10, long j11, int i9, int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            if (vector.objects.isEmpty()) {
                return;
            }
            processLoadedMediaCount(((TLRPC.TL_messages_searchCounter) vector.objects.get(0)).count, j10, j11, i9, i10, false, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getMediaCountDatabase$139(long j10, long j11, int i9, int i10) {
        SQLiteCursor queryFinalized;
        int i11;
        int i12;
        try {
            if (j10 != 0) {
                SQLiteDatabase database = getMessagesStorage().getDatabase();
                Locale locale = Locale.US;
                queryFinalized = database.queryFinalized("SELECT count, old FROM media_counts_topics WHERE uid = " + j11 + " AND topic_id = " + j10 + " AND type = " + i9 + " LIMIT 1", new Object[0]);
            } else {
                SQLiteDatabase database2 = getMessagesStorage().getDatabase();
                Locale locale2 = Locale.US;
                queryFinalized = database2.queryFinalized("SELECT count, old FROM media_counts_v2 WHERE uid = " + j11 + " AND type = " + i9 + " LIMIT 1", new Object[0]);
            }
            if (queryFinalized.next()) {
                i11 = queryFinalized.intValue(0);
                i12 = queryFinalized.intValue(1);
            } else {
                i11 = -1;
                i12 = 0;
            }
            queryFinalized.dispose();
            if (i11 == -1 && DialogObject.isEncryptedDialog(j11)) {
                SQLiteDatabase database3 = getMessagesStorage().getDatabase();
                Locale locale3 = Locale.US;
                SQLiteCursor queryFinalized2 = database3.queryFinalized("SELECT COUNT(mid) FROM media_v4 WHERE uid = " + j11 + " AND type = " + i9 + " LIMIT 1", new Object[0]);
                if (queryFinalized2.next()) {
                    i11 = queryFinalized2.intValue(0);
                }
                queryFinalized2.dispose();
                if (i11 != -1) {
                    putMediaCountDatabase(j11, j10, i9, i11);
                }
            }
            processLoadedMediaCount(i11, j11, j10, i9, i10, true, i12);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getMediaCounts$127(long j10, long j11, int[] iArr) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mediaCountsDidLoad, Long.valueOf(j10), Long.valueOf(j11), iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getMediaCounts$128(long j10, long j11, int[] iArr) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mediaCountsDidLoad, Long.valueOf(j10), Long.valueOf(j11), iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getMediaCounts$129(int[] iArr, long j10, long j11, TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (iArr[i10] < 0) {
                iArr[i10] = 0;
            }
        }
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            int size = vector.objects.size();
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.TL_messages_searchCounter tL_messages_searchCounter = (TLRPC.TL_messages_searchCounter) vector.objects.get(i11);
                TLRPC.MessagesFilter messagesFilter = tL_messages_searchCounter.filter;
                if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPhotoVideo) {
                    i9 = 0;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterDocument) {
                    i9 = 1;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterRoundVoice) {
                    i9 = 2;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterUrl) {
                    i9 = 3;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterMusic) {
                    i9 = 4;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterGif) {
                    i9 = 5;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPhotos) {
                    i9 = 6;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterVideo) {
                    i9 = 7;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPoll) {
                    i9 = 8;
                }
                int i12 = tL_messages_searchCounter.count;
                iArr[i9] = i12;
                putMediaCountDatabase(j10, j11, i9, i12);
            }
        }
        AndroidUtilities.runOnUIThread(new j7(this, j10, j11, iArr, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getMediaCounts$130(long j10, long j11, int[] iArr) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mediaCountsDidLoad, Long.valueOf(j10), Long.valueOf(j11), iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fe A[Catch: Exception -> 0x0086, TryCatch #0 {Exception -> 0x0086, blocks: (B:3:0x000a, B:5:0x005f, B:7:0x00a7, B:9:0x00ad, B:14:0x00b5, B:20:0x00c4, B:24:0x00d0, B:26:0x00d4, B:28:0x0108, B:29:0x0111, B:32:0x010f, B:31:0x011b, B:35:0x0122, B:38:0x0133, B:40:0x0145, B:42:0x0151, B:43:0x0162, B:46:0x016e, B:48:0x0172, B:51:0x0204, B:52:0x0177, B:54:0x017b, B:57:0x0181, B:59:0x01f8, B:63:0x01fe, B:65:0x0202, B:69:0x0190, B:71:0x019d, B:73:0x01aa, B:76:0x01b8, B:79:0x01c6, B:82:0x01d4, B:85:0x01e3, B:86:0x01ee, B:88:0x0214, B:90:0x021c, B:92:0x023e, B:96:0x024a, B:98:0x0089), top: B:2:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$getMediaCounts$131(long j10, long j11, int i9) {
        SQLiteCursor queryFinalized;
        long j12 = j10;
        long j13 = j11;
        int i10 = 9;
        try {
            int[] iArr = new int[9];
            int i11 = 0;
            iArr[0] = -1;
            iArr[1] = -1;
            int i12 = 2;
            iArr[2] = -1;
            iArr[3] = -1;
            iArr[4] = -1;
            iArr[5] = -1;
            iArr[6] = -1;
            iArr[7] = -1;
            iArr[8] = -1;
            int[] iArr2 = new int[9];
            iArr2[0] = -1;
            iArr2[1] = -1;
            iArr2[2] = -1;
            iArr2[3] = -1;
            iArr2[4] = -1;
            iArr2[5] = -1;
            iArr2[6] = -1;
            iArr2[7] = -1;
            iArr2[8] = -1;
            int[] iArr3 = new int[9];
            iArr3[0] = 0;
            iArr3[1] = 0;
            iArr3[2] = 0;
            iArr3[3] = 0;
            iArr3[4] = 0;
            iArr3[5] = 0;
            iArr3[6] = 0;
            iArr3[7] = 0;
            iArr3[8] = 0;
            if (j12 != 0) {
                SQLiteDatabase database = getMessagesStorage().getDatabase();
                Locale locale = Locale.US;
                queryFinalized = database.queryFinalized("SELECT type, count, old FROM media_counts_topics WHERE uid = " + j13 + " AND topic_id = " + j12, new Object[0]);
            } else {
                SQLiteDatabase database2 = getMessagesStorage().getDatabase();
                Locale locale2 = Locale.US;
                queryFinalized = database2.queryFinalized("SELECT type, count, old FROM media_counts_v2 WHERE uid = " + j13, new Object[0]);
            }
            while (queryFinalized.next()) {
                int intValue = queryFinalized.intValue(0);
                if (intValue >= 0 && intValue < 9) {
                    int intValue2 = queryFinalized.intValue(1);
                    iArr[intValue] = intValue2;
                    iArr2[intValue] = intValue2;
                    iArr3[intValue] = queryFinalized.intValue(2);
                }
            }
            queryFinalized.dispose();
            if (DialogObject.isEncryptedDialog(j13)) {
                int i13 = 0;
                while (i13 < 9) {
                    if (iArr[i13] == -1) {
                        SQLiteDatabase database3 = getMessagesStorage().getDatabase();
                        Locale locale3 = Locale.US;
                        SQLiteCursor queryFinalized2 = database3.queryFinalized("SELECT COUNT(mid) FROM media_v4 WHERE uid = " + j13 + " AND type = " + i13 + " LIMIT 1", new Object[0]);
                        if (queryFinalized2.next()) {
                            iArr[i13] = queryFinalized2.intValue(0);
                        } else {
                            iArr[i13] = 0;
                        }
                        queryFinalized2.dispose();
                        putMediaCountDatabase(j13, j12, i13, iArr[i13]);
                    }
                    i13++;
                    j12 = j10;
                    j13 = j11;
                }
                AndroidUtilities.runOnUIThread(new j7(this, j11, j10, iArr, 1));
                return;
            }
            TLRPC.TL_messages_getSearchCounters tL_messages_getSearchCounters = new TLRPC.TL_messages_getSearchCounters();
            tL_messages_getSearchCounters.peer = getMessagesController().getInputPeer(j13);
            if (j12 != 0) {
                if (j13 == getUserConfig().getClientUserId()) {
                    tL_messages_getSearchCounters.saved_peer_id = getMessagesController().getInputPeer(j12);
                    tL_messages_getSearchCounters.flags |= 4;
                } else {
                    tL_messages_getSearchCounters.top_msg_id = (int) j12;
                    tL_messages_getSearchCounters.flags |= 1;
                }
            }
            int i14 = 0;
            boolean z10 = false;
            while (i14 < i10) {
                if (tL_messages_getSearchCounters.peer == null) {
                    iArr[i14] = i11;
                } else if (iArr[i14] == -1 || iArr3[i14] == 1) {
                    if (i14 == 0) {
                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPhotoVideo());
                    } else if (i14 == 1) {
                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterDocument());
                    } else if (i14 == i12) {
                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterRoundVoice());
                    } else if (i14 == 3) {
                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterUrl());
                    } else {
                        if (i14 == 4) {
                            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterMusic());
                        } else if (i14 == 6) {
                            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPhotos());
                        } else if (i14 == 7) {
                            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterVideo());
                        } else if (i14 == 8) {
                            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPoll());
                        } else {
                            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterGif());
                        }
                        if (iArr[i14] != -1) {
                            z10 = true;
                        } else if (iArr3[i14] == 1) {
                            iArr[i14] = -1;
                        }
                        i14++;
                        i12 = 2;
                        i10 = 9;
                        i11 = 0;
                    }
                    if (iArr[i14] != -1) {
                    }
                    i14++;
                    i12 = 2;
                    i10 = 9;
                    i11 = 0;
                }
                i14++;
                i12 = 2;
                i10 = 9;
                i11 = 0;
            }
            if (!tL_messages_getSearchCounters.filters.isEmpty()) {
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getSearchCounters, new gh.d2(this, iArr, j13, j12, 2)), i9);
            }
            if (z10 && getConnectionsManager().getConnectionState() == 3) {
                return;
            }
            AndroidUtilities.runOnUIThread(new j7(this, j11, j10, iArr2, 2));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getStickerSet$32(String str, Utilities.Callback callback, Boolean bool, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        this.loadingStickerSetsKeys.remove(str);
        if (callback != null) {
            callback.run(tL_messages_stickerSet);
        }
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) {
            return;
        }
        this.stickerSetsById.k(tL_messages_stickerSet, stickerSet.id);
        this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
        saveStickerSetIntoCache(tL_messages_stickerSet);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getStickerSet$33(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet) {
        int i9 = 0;
        if (tL_messages_stickerSet == null) {
            if (z10) {
                this.loadingStickerSetsKeys.remove(str);
                return;
            } else {
                fetchStickerSetInternal(inputStickerSet, new m7(this, str, callback, i9));
                return;
            }
        }
        this.loadingStickerSetsKeys.remove(str);
        if (callback != null) {
            callback.run(tL_messages_stickerSet);
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet != null) {
            this.stickerSetsById.k(tL_messages_stickerSet, stickerSet.id);
            this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getStickerSet$34(TLRPC.InputStickerSet inputStickerSet, Integer num, String str, Utilities.Callback callback, boolean z10) {
        AndroidUtilities.runOnUIThread(new m8(this, getCachedStickerSetInternal(inputStickerSet.id, num), str, callback, z10, inputStickerSet, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getStickerSet$35(String str, Utilities.Callback callback, Boolean bool, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        this.loadingStickerSetsKeys.remove(str);
        if (callback != null) {
            callback.run(tL_messages_stickerSet);
        }
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) {
            return;
        }
        this.stickerSetsById.k(tL_messages_stickerSet, stickerSet.id);
        this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
        saveStickerSetIntoCache(tL_messages_stickerSet);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getStickerSet$36(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet) {
        int i9 = 1;
        if (tL_messages_stickerSet == null) {
            if (z10) {
                this.loadingStickerSetsKeys.remove(str);
                return;
            } else {
                fetchStickerSetInternal(inputStickerSet, new m7(this, str, callback, i9));
                return;
            }
        }
        this.loadingStickerSetsKeys.remove(str);
        if (callback != null) {
            callback.run(tL_messages_stickerSet);
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet != null) {
            this.stickerSetsById.k(tL_messages_stickerSet, stickerSet.id);
            this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getStickerSet$37(TLRPC.InputStickerSet inputStickerSet, Integer num, String str, Utilities.Callback callback, boolean z10) {
        AndroidUtilities.runOnUIThread(new m8(this, getCachedStickerSetInternal(inputStickerSet.short_name.toLowerCase(), num), str, callback, z10, inputStickerSet, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getStickerSet$38(String str, Utilities.Callback callback, TLRPC.InputStickerSet inputStickerSet, Boolean bool, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.loadingStickerSetsKeys.remove(str);
        if (callback != null) {
            callback.run(tL_messages_stickerSet);
        }
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                this.stickerSetsById.k(tL_messages_stickerSet, stickerSet.id);
                this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
                boolean z10 = inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses;
                if (z10) {
                    this.stickerSetDefaultStatuses = tL_messages_stickerSet;
                }
                if (z10) {
                    this.stickerSetDefaultChannelStatuses = tL_messages_stickerSet;
                }
            }
            saveStickerSetIntoCache(tL_messages_stickerSet);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getTextStyleRuns$180(TLRPC.MessageEntity messageEntity, TLRPC.MessageEntity messageEntity2) {
        int i9 = messageEntity.offset;
        int i10 = messageEntity2.offset;
        if (i9 > i10) {
            return 1;
        }
        return i9 < i10 ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$increaseInlineRating$150(TLRPC.TL_topPeer tL_topPeer, TLRPC.TL_topPeer tL_topPeer2) {
        double d = tL_topPeer.rating;
        double d9 = tL_topPeer2.rating;
        if (d > d9) {
            return -1;
        }
        return d < d9 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$increasePeerRaiting$155(TLRPC.TL_topPeer tL_topPeer, TLRPC.TL_topPeer tL_topPeer2) {
        double d = tL_topPeer.rating;
        double d9 = tL_topPeer2.rating;
        if (d > d9) {
            return -1;
        }
        return d < d9 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$increasePeerRaiting$156(long j10, double d) {
        TLRPC.TL_topPeer tL_topPeer;
        int i9 = 0;
        while (true) {
            if (i9 >= this.hints.size()) {
                tL_topPeer = null;
                break;
            }
            tL_topPeer = this.hints.get(i9);
            if (tL_topPeer.peer.user_id == j10) {
                break;
            } else {
                i9++;
            }
        }
        if (tL_topPeer == null) {
            tL_topPeer = new TLRPC.TL_topPeer();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_topPeer.peer = tL_peerUser;
            tL_peerUser.user_id = j10;
            this.hints.add(tL_topPeer);
        }
        tL_topPeer.rating = Math.exp(d / getMessagesController().ratingDecay) + tL_topPeer.rating;
        Collections.sort(this.hints, new q(11));
        savePeer(j10, 0, tL_topPeer.rating);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadHints, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$increasePeerRaiting$157(final long j10) {
        int i9;
        double d = 0.0d;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            Locale locale = Locale.US;
            int i10 = 0;
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT MAX(mid), MAX(date) FROM messages_v2 WHERE uid = " + j10 + " AND out = 1", new Object[0]);
            if (queryFinalized.next()) {
                i10 = queryFinalized.intValue(0);
                i9 = queryFinalized.intValue(1);
            } else {
                i9 = 0;
            }
            queryFinalized.dispose();
            if (i10 > 0 && getUserConfig().ratingLoadTime != 0) {
                d = i9 - getUserConfig().ratingLoadTime;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        final double d9 = d;
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.d9
            @Override // java.lang.Runnable
            public final void run() {
                MediaDataController.this.lambda$increasePeerRaiting$156(j10, d9);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$increaseWebappRating$151(TLRPC.TL_topPeer tL_topPeer, TLRPC.TL_topPeer tL_topPeer2) {
        double d = tL_topPeer.rating;
        double d9 = tL_topPeer2.rating;
        if (d > d9) {
            return -1;
        }
        return d < d9 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadArchivedStickersCount$71(TLRPC.TL_error tL_error, TLObject tLObject, int i9) {
        if (tL_error == null) {
            TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers = (TLRPC.TL_messages_archivedStickers) tLObject;
            this.archivedStickersCount[i9] = tL_messages_archivedStickers.count;
            MessagesController.getNotificationsSettings(this.currentAccount).edit().putInt(j3.r0.l(i9, "archivedStickersCount"), tL_messages_archivedStickers.count).commit();
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.archivedStickersCountDidLoad, Integer.valueOf(i9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadArchivedStickersCount$72(int i9, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new h0(this, tL_error, tLObject, i9, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [org.telegram.tgnet.TLRPC$TL_attachMenuBots] */
    public /* synthetic */ void lambda$loadAttachMenuBots$3() {
        long j10;
        int i9;
        SQLiteCursor sQLiteCursor;
        int i10;
        TLRPC.TL_attachMenuBots tL_attachMenuBots;
        TLRPC.TL_attachMenuBots tL_attachMenuBots2;
        int i11;
        long j11 = 0;
        try {
            try {
                SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data, hash, date FROM attach_menu_bots", new Object[0]);
                try {
                    try {
                        if (queryFinalized.next()) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC.AttachMenuBots TLdeserialize = TLRPC.AttachMenuBots.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), true);
                                r1 = TLdeserialize instanceof TLRPC.TL_attachMenuBots ? (TLRPC.TL_attachMenuBots) TLdeserialize : null;
                                byteBufferValue.reuse();
                            }
                            j11 = queryFinalized.longValue(1);
                            j10 = j11;
                            tL_attachMenuBots2 = r1;
                            i11 = queryFinalized.intValue(2);
                        } else {
                            j10 = 0;
                            tL_attachMenuBots2 = null;
                            i11 = 0;
                        }
                        if (tL_attachMenuBots2 != null) {
                            try {
                                ArrayList<Long> arrayList = new ArrayList<>();
                                for (int i12 = 0; i12 < tL_attachMenuBots2.bots.size(); i12++) {
                                    arrayList.add(Long.valueOf(tL_attachMenuBots2.bots.get(i12).bot_id));
                                }
                                tL_attachMenuBots2.users.addAll(getMessagesStorage().getUsers(arrayList));
                            } catch (Exception e10) {
                                e = e10;
                                sQLiteCursor = tL_attachMenuBots2;
                                i9 = i11;
                                r1 = queryFinalized;
                                FileLog.e((Throwable) e, false);
                                if (r1 != null) {
                                    r1.dispose();
                                }
                                i10 = i9;
                                tL_attachMenuBots = sQLiteCursor;
                                processLoadedMenuBots(tL_attachMenuBots, j10, i10, true);
                            }
                        }
                        queryFinalized.dispose();
                        i10 = i11;
                        tL_attachMenuBots = tL_attachMenuBots2;
                    } catch (Throwable th) {
                        th = th;
                        r1 = queryFinalized;
                        if (r1 != null) {
                            r1.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    j10 = j11;
                    i9 = 0;
                    sQLiteCursor = r1;
                }
            } catch (Exception e12) {
                e = e12;
                j10 = 0;
                i9 = 0;
                sQLiteCursor = null;
            }
            processLoadedMenuBots(tL_attachMenuBots, j10, i10, true);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadAttachMenuBots$4(Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (tLObject instanceof TLRPC.TL_attachMenuBotsNotModified) {
            processLoadedMenuBots(null, 0L, currentTimeMillis, false);
        } else if (tLObject instanceof TLRPC.TL_attachMenuBots) {
            TLRPC.TL_attachMenuBots tL_attachMenuBots = (TLRPC.TL_attachMenuBots) tLObject;
            processLoadedMenuBots(tL_attachMenuBots, tL_attachMenuBots.hash, currentTimeMillis, false);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadAvatarConstructor$241(TLObject tLObject, SharedPreferences sharedPreferences, boolean z10) {
        if (tLObject instanceof TLRPC.TL_emojiList) {
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (z10) {
                this.profileAvatarConstructorDefault = (TLRPC.TL_emojiList) tLObject;
                edit.putString("profile", Utilities.bytesToHex(serializedData.toByteArray()));
                edit.putLong("profile_last_check", System.currentTimeMillis());
            } else {
                this.groupAvatarConstructorDefault = (TLRPC.TL_emojiList) tLObject;
                edit.putString("group", Utilities.bytesToHex(serializedData.toByteArray()));
                edit.putLong("group_last_check", System.currentTimeMillis());
            }
            edit.apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadAvatarConstructor$242(SharedPreferences sharedPreferences, boolean z10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new mj(this, tLObject, sharedPreferences, z10, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadBotInfo$197(Utilities.Callback callback, TL_bots.BotInfo botInfo, int i9) {
        if (callback != null) {
            callback.run(botInfo);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botInfoDidLoad, botInfo, Integer.valueOf(i9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadBotInfo$198(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadBotInfo$199(long j10, long j11, Utilities.Callback callback, int i9) {
        try {
            TL_bots.BotInfo loadBotInfoInternal = loadBotInfoInternal(j10, j11);
            if (loadBotInfoInternal != null) {
                AndroidUtilities.runOnUIThread(new h0(this, callback, loadBotInfoInternal, i9, 7));
            } else if (callback != null) {
                AndroidUtilities.runOnUIThread(new o7(2, callback));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadBotKeyboard$195(TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, message, topicKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadBotKeyboard$196(MessagesStorage.TopicKey topicKey, boolean z10) {
        SQLiteCursor queryFinalized;
        TLRPC.Message message;
        NativeByteBuffer byteBufferValue;
        try {
            if (topicKey.topicId != 0) {
                SQLiteDatabase database = getMessagesStorage().getDatabase();
                Locale locale = Locale.US;
                queryFinalized = database.queryFinalized("SELECT info FROM bot_keyboard_topics WHERE uid = " + topicKey.dialogId + " AND tid = " + topicKey.topicId, new Object[0]);
            } else {
                SQLiteDatabase database2 = getMessagesStorage().getDatabase();
                Locale locale2 = Locale.US;
                queryFinalized = database2.queryFinalized("SELECT info FROM bot_keyboard WHERE uid = " + topicKey.dialogId, new Object[0]);
            }
            if (!queryFinalized.next() || queryFinalized.isNull(0) || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                message = null;
            } else {
                message = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                byteBufferValue.reuse();
            }
            queryFinalized.dispose();
            if (message == null && !z10) {
                return;
            }
            AndroidUtilities.runOnUIThread(new u6(this, message, topicKey));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadDraftsIfNeed$185() {
        this.loadingDrafts = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadDraftsIfNeed$186() {
        this.loadingDrafts = false;
        UserConfig userConfig = getUserConfig();
        userConfig.draftsLoaded = true;
        userConfig.saveConfig(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadDraftsIfNeed$187(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new g7(this, 16));
        } else {
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new g7(this, 17));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$loadFeaturedStickers$55(boolean z10) {
        ArrayList<TLRPC.StickerSetCovered> arrayList;
        long j10;
        int i9;
        boolean z11;
        ArrayList<TLRPC.StickerSetCovered> arrayList2;
        int i10;
        ArrayList<Long> arrayList3 = new ArrayList<>();
        SQLiteCursor sQLiteCursor = null;
        long j11 = 0;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            StringBuilder sb2 = new StringBuilder("SELECT data, unread, date, hash, premium FROM stickers_featured WHERE emoji = ");
            sb2.append(z10 ? 1 : 0);
            sb2.append(" AND id = ");
            sb2.append(z10 ? 2 : 1);
            SQLiteCursor queryFinalized = database.queryFinalized(sb2.toString(), new Object[0]);
            try {
                if (queryFinalized.next()) {
                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        arrayList = new ArrayList<>();
                        try {
                            int readInt32 = byteBufferValue.readInt32(false);
                            for (int i11 = 0; i11 < readInt32; i11++) {
                                arrayList.add(TLRPC.StickerSetCovered.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                            }
                            byteBufferValue.reuse();
                            sQLiteCursor = arrayList;
                        } catch (Throwable th) {
                            th = th;
                            sQLiteCursor = queryFinalized;
                            i9 = 0;
                            try {
                                FileLog.e(th);
                                if (sQLiteCursor != null) {
                                }
                                arrayList2 = arrayList;
                                j10 = j11;
                                z11 = false;
                                processLoadedFeaturedStickers(z10, arrayList2, arrayList3, z11, true, i9, j10);
                            } finally {
                            }
                        }
                    }
                    NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                    if (byteBufferValue2 != null) {
                        int readInt322 = byteBufferValue2.readInt32(false);
                        for (int i12 = 0; i12 < readInt322; i12++) {
                            arrayList3.add(Long.valueOf(byteBufferValue2.readInt64(false)));
                        }
                        byteBufferValue2.reuse();
                    }
                    i9 = queryFinalized.intValue(2);
                    try {
                        j11 = queryFinalized.longValue(3);
                        i10 = queryFinalized.intValue(4) == 1 ? 1 : 0;
                        r2 = i9;
                    } catch (Throwable th2) {
                        th = th2;
                        arrayList = sQLiteCursor;
                        sQLiteCursor = queryFinalized;
                        FileLog.e(th);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        arrayList2 = arrayList;
                        j10 = j11;
                        z11 = false;
                        processLoadedFeaturedStickers(z10, arrayList2, arrayList3, z11, true, i9, j10);
                    }
                } else {
                    i10 = 0;
                }
                queryFinalized.dispose();
                arrayList2 = sQLiteCursor;
                i9 = r2;
                j10 = j11;
                z11 = i10;
            } catch (Throwable th3) {
                th = th3;
                arrayList = sQLiteCursor;
            }
        } catch (Throwable th4) {
            th = th4;
            arrayList = null;
        }
        processLoadedFeaturedStickers(z10, arrayList2, arrayList3, z11, true, i9, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadFeaturedStickers$56(boolean z10, int i9) {
        this.loadingFeaturedStickers[z10 ? 1 : 0] = false;
        this.featuredStickersLoaded[z10 ? 1 : 0] = true;
        this.loadFeaturedDate[z10 ? 1 : 0] = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadFeaturedStickers$57(TLObject tLObject, boolean z10, long j10) {
        if (tLObject instanceof TLRPC.TL_messages_featuredStickers) {
            TLRPC.TL_messages_featuredStickers tL_messages_featuredStickers = (TLRPC.TL_messages_featuredStickers) tLObject;
            processLoadedFeaturedStickers(z10, tL_messages_featuredStickers.sets, tL_messages_featuredStickers.unread, tL_messages_featuredStickers.premium, false, (int) (System.currentTimeMillis() / 1000), tL_messages_featuredStickers.hash);
        } else {
            if (!(tLObject instanceof TLRPC.TL_messages_featuredStickersNotModified)) {
                processLoadedFeaturedStickers(z10, null, null, false, false, (int) (System.currentTimeMillis() / 1000), j10);
                return;
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            AndroidUtilities.runOnUIThread(new o8(this, z10, currentTimeMillis, 2));
            putFeaturedStickersToCache(z10, null, null, currentTimeMillis, j10, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadFeaturedStickers$58(boolean z10, long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new q8(this, tLObject, z10, j10, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadGroupStickerSet$43(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.groupStickerSets.k(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadGroupStickerSet$44(TLRPC.StickerSet stickerSet) {
        TLRPC.StickerSet stickerSet2;
        NativeByteBuffer byteBufferValue;
        try {
            SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT document FROM web_recent_v3 WHERE id = 's_" + stickerSet.id + "'", new Object[0]);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                tL_messages_stickerSet = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                byteBufferValue.reuse();
            }
            queryFinalized.dispose();
            if (tL_messages_stickerSet == null || (stickerSet2 = tL_messages_stickerSet.set) == null || stickerSet2.hash != stickerSet.hash) {
                loadGroupStickerSet(stickerSet, false);
            }
            if (tL_messages_stickerSet == null || tL_messages_stickerSet.set == null) {
                return;
            }
            AndroidUtilities.runOnUIThread(new b7(this, tL_messages_stickerSet, 2));
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadGroupStickerSet$45(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.groupStickerSets.k(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadGroupStickerSet$46(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new b7(this, (TLRPC.TL_messages_stickerSet) tLObject, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadHints$144(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        getMessagesController().putUsers(arrayList, true);
        getMessagesController().putChats(arrayList2, true);
        this.loading = false;
        this.loaded = true;
        this.hints = arrayList3;
        this.inlineBots = arrayList4;
        this.guestBots = arrayList5;
        this.webapps = arrayList6;
        buildShortcuts();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadHints, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadInlineHints, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadGuestBotHints, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadWebappsHints, new Object[0]);
        if (Math.abs(getUserConfig().lastHintsSyncTime - ((int) (System.currentTimeMillis() / 1000))) >= 86400 || BuildVars.DEBUG_PRIVATE_VERSION) {
            loadHints(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadHints$145() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList6 = new ArrayList<>();
        long clientUserId = getUserConfig().getClientUserId();
        try {
            ArrayList<Long> arrayList7 = new ArrayList<>();
            ArrayList arrayList8 = new ArrayList();
            int i9 = 0;
            SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT did, type, rating FROM chat_hints WHERE 1 ORDER BY rating DESC", new Object[0]);
            while (queryFinalized.next()) {
                long longValue = queryFinalized.longValue(i9);
                if (longValue != clientUserId) {
                    int intValue = queryFinalized.intValue(1);
                    TLRPC.TL_topPeer tL_topPeer = new TLRPC.TL_topPeer();
                    long j10 = clientUserId;
                    tL_topPeer.rating = queryFinalized.doubleValue(2);
                    if (longValue > 0) {
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_topPeer.peer = tL_peerUser;
                        tL_peerUser.user_id = longValue;
                        arrayList7.add(Long.valueOf(longValue));
                    } else {
                        TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                        tL_topPeer.peer = tL_peerChat;
                        long j11 = -longValue;
                        tL_peerChat.chat_id = j11;
                        arrayList8.add(Long.valueOf(j11));
                    }
                    if (intValue == 0) {
                        arrayList.add(tL_topPeer);
                    } else if (intValue == 1) {
                        arrayList2.add(tL_topPeer);
                    } else if (intValue == 2) {
                        arrayList4.add(tL_topPeer);
                    } else if (intValue == 3) {
                        arrayList3.add(tL_topPeer);
                    }
                    clientUserId = j10;
                    i9 = 0;
                }
            }
            queryFinalized.dispose();
            if (!arrayList7.isEmpty()) {
                getMessagesStorage().getUsersInternal(arrayList7, arrayList5);
            }
            if (!arrayList8.isEmpty()) {
                getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList8), arrayList6);
            }
            AndroidUtilities.runOnUIThread(new dl(this, arrayList5, arrayList6, arrayList, arrayList2, arrayList3, arrayList4, 2));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadHints$146() {
        getUserConfig().suggestContacts = true;
        getUserConfig().lastHintsSyncTime = (int) (System.currentTimeMillis() / 1000);
        getUserConfig().saveConfig(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadHints$147(TLRPC.TL_contacts_topPeers tL_contacts_topPeers) {
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
            getMessagesStorage().getDatabase().beginTransaction();
            getMessagesStorage().putUsersAndChats(tL_contacts_topPeers.users, tL_contacts_topPeers.chats, false, false);
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            for (int i9 = 0; i9 < tL_contacts_topPeers.categories.size(); i9++) {
                TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i9);
                TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                int i10 = topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline ? 1 : topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp ? 2 : topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat ? 3 : 0;
                for (int i11 = 0; i11 < tL_topPeerCategoryPeers.peers.size(); i11++) {
                    TLRPC.TL_topPeer tL_topPeer = tL_topPeerCategoryPeers.peers.get(i11);
                    executeFast.requery();
                    executeFast.bindLong(1, MessageObject.getPeerId(tL_topPeer.peer));
                    executeFast.bindInteger(2, i10);
                    executeFast.bindDouble(3, tL_topPeer.rating);
                    executeFast.bindInteger(4, 0);
                    executeFast.step();
                }
            }
            executeFast.dispose();
            getMessagesStorage().getDatabase().commitTransaction();
            AndroidUtilities.runOnUIThread(new g7(this, 14));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadHints$148(TLRPC.contacts_TopPeers contacts_toppeers, TLRPC.TL_error tL_error) {
        if (!(contacts_toppeers instanceof TLRPC.TL_contacts_topPeers)) {
            if (contacts_toppeers instanceof TLRPC.TL_contacts_topPeersDisabled) {
                getUserConfig().suggestContacts = false;
                getUserConfig().lastHintsSyncTime = (int) (System.currentTimeMillis() / 1000);
                getUserConfig().saveConfig(false);
                clearTopPeers();
                return;
            }
            return;
        }
        TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) contacts_toppeers;
        getMessagesController().putUsers(tL_contacts_topPeers.users, false);
        getMessagesController().putChats(tL_contacts_topPeers.chats, false);
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i9 = 0; i9 < tL_contacts_topPeers.categories.size(); i9++) {
            TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i9);
            TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
            if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline) {
                this.inlineBots = tL_topPeerCategoryPeers.peers;
                getUserConfig().botRatingLoadTime = currentTimeMillis;
            } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp) {
                this.webapps = tL_topPeerCategoryPeers.peers;
                getUserConfig().webappRatingLoadTime = currentTimeMillis;
            } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat) {
                this.guestBots = tL_topPeerCategoryPeers.peers;
                getUserConfig().botGuestRatingLoadTime = currentTimeMillis;
            } else {
                this.hints = tL_topPeerCategoryPeers.peers;
                long clientUserId = getUserConfig().getClientUserId();
                int i10 = 0;
                while (true) {
                    if (i10 >= this.hints.size()) {
                        break;
                    }
                    if (this.hints.get(i10).peer.user_id == clientUserId) {
                        this.hints.remove(i10);
                        break;
                    }
                    i10++;
                }
                getUserConfig().ratingLoadTime = (int) (System.currentTimeMillis() / 1000);
            }
        }
        getUserConfig().saveConfig(false);
        buildShortcuts();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadHints, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadInlineHints, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadGuestBotHints, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadWebappsHints, new Object[0]);
        getMessagesStorage().getStorageQueue().postRunnable(new c2(18, this, tL_contacts_topPeers));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadMedia$126(long j10, int i9, int i10, int i11, int i12, long j11, int i13, boolean z10, int i14, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            getMessagesController().removeDeletedMessagesFromArray(j10, messages_messages.messages);
            boolean z11 = false;
            if (i9 == 0 ? messages_messages.messages.size() == 0 : messages_messages.messages.size() <= 1) {
                z11 = true;
            }
            processLoadedMedia(messages_messages, j10, i10, i11, i9, i12, j11, 0, i13, z10, z11, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadMusic$141(long j10, ArrayList arrayList, ArrayList arrayList2) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.musicDidLoad, Long.valueOf(j10), arrayList, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0101 A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:36:0x0025, B:38:0x002b, B:12:0x00fb, B:14:0x0101, B:16:0x0107, B:18:0x0121, B:39:0x0063, B:8:0x0094, B:10:0x009a, B:34:0x00cb), top: B:35:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0141 A[Catch: Exception -> 0x0138, TRY_LEAVE, TryCatch #1 {Exception -> 0x0138, blocks: (B:21:0x012e, B:32:0x0141), top: B:20:0x012e }] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$loadMusic$142(long j10, long j11, long j12) {
        MediaDataController mediaDataController;
        SQLiteCursor queryFinalized;
        ?? r12;
        long j13 = j11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i9 = 0;
        while (i9 < 2) {
            ArrayList arrayList3 = i9 == 0 ? arrayList : arrayList2;
            if (i9 == 0) {
                try {
                    if (DialogObject.isEncryptedDialog(j10)) {
                        SQLiteDatabase database = getMessagesStorage().getDatabase();
                        Locale locale = Locale.US;
                        queryFinalized = database.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j10 + " AND mid > " + j13 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                    } else {
                        SQLiteDatabase database2 = getMessagesStorage().getDatabase();
                        Locale locale2 = Locale.US;
                        queryFinalized = database2.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j10 + " AND mid < " + j13 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                    }
                } catch (Exception e10) {
                    e = e10;
                    mediaDataController = this;
                    FileLog.e(e);
                    AndroidUtilities.runOnUIThread(new gh.e2(mediaDataController, j10, arrayList, arrayList2, 15));
                }
            } else if (DialogObject.isEncryptedDialog(j10)) {
                SQLiteDatabase database3 = getMessagesStorage().getDatabase();
                Locale locale3 = Locale.US;
                r12 = 0;
                queryFinalized = database3.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j10 + " AND mid < " + j12 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                if (queryFinalized.next()) {
                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(r12);
                    if (byteBufferValue != 0) {
                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r12), r12);
                        TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                        byteBufferValue.reuse();
                        if (MessageObject.isMusicMessage(TLdeserialize)) {
                            try {
                                TLdeserialize.id = queryFinalized.intValue(1);
                                TLdeserialize.dialog_id = j10;
                                arrayList3.add(0, new MessageObject(mediaDataController.currentAccount, TLdeserialize, false, true));
                            } catch (Exception e11) {
                                e = e11;
                                FileLog.e(e);
                                AndroidUtilities.runOnUIThread(new gh.e2(mediaDataController, j10, arrayList, arrayList2, 15));
                            }
                            mediaDataController = this;
                        }
                    }
                } else {
                    queryFinalized.dispose();
                    i9++;
                    j13 = j11;
                }
            } else {
                SQLiteDatabase database4 = getMessagesStorage().getDatabase();
                Locale locale4 = Locale.US;
                queryFinalized = database4.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j10 + " AND mid > " + j12 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
            }
            r12 = 0;
            queryFinalized = queryFinalized;
            if (queryFinalized.next()) {
            }
        }
        mediaDataController = this;
        AndroidUtilities.runOnUIThread(new gh.e2(mediaDataController, j10, arrayList, arrayList2, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadPinnedMessageInternal$164(long j10, long j11, TLRPC.TL_channels_getMessages tL_channels_getMessages, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            removeEmptyMessages(messages_messages.messages);
            if (!messages_messages.messages.isEmpty()) {
                getMessagesController().getChat(Long.valueOf(j10));
                ImageLoader.saveMessagesThumbs(messages_messages.messages);
                broadcastPinnedMessage(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                savePinnedMessages(j11, messages_messages.messages);
                return;
            }
        }
        getMessagesStorage().updatePinnedMessages(j11, tL_channels_getMessages.id, false, -1, 0, false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadPinnedMessageInternal$165(long j10, TLRPC.TL_messages_getMessages tL_messages_getMessages, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            removeEmptyMessages(messages_messages.messages);
            if (!messages_messages.messages.isEmpty()) {
                ImageLoader.saveMessagesThumbs(messages_messages.messages);
                broadcastPinnedMessage(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                savePinnedMessages(j10, messages_messages.messages);
                return;
            }
        }
        getMessagesStorage().updatePinnedMessages(j10, tL_messages_getMessages.id, false, -1, 0, false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadPinnedMessages$161(long j10) {
        this.loadingPinnedMessages.l(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadPinnedMessages$162(int i9, TLRPC.TL_messages_search tL_messages_search, long j10, int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        int i11;
        boolean z10;
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<Integer, MessageObject> hashMap = new HashMap<>();
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            a0.h hVar = new a0.h();
            for (int i12 = 0; i12 < messages_messages.users.size(); i12++) {
                TLRPC.User user = messages_messages.users.get(i12);
                hVar.k(user, user.id);
            }
            a0.h hVar2 = new a0.h();
            for (int i13 = 0; i13 < messages_messages.chats.size(); i13++) {
                TLRPC.Chat chat = messages_messages.chats.get(i13);
                hVar2.k(chat, chat.id);
            }
            getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            getMessagesController().putUsers(messages_messages.users, false);
            getMessagesController().putChats(messages_messages.chats, false);
            int size = messages_messages.messages.size();
            for (int i14 = 0; i14 < size; i14++) {
                TLRPC.Message message = messages_messages.messages.get(i14);
                if (!(message instanceof TLRPC.TL_messageService) && !(message instanceof TLRPC.TL_messageEmpty)) {
                    arrayList.add(Integer.valueOf(message.id));
                    hashMap.put(Integer.valueOf(message.id), new MessageObject(this.currentAccount, message, hVar, hVar2, false, false));
                }
            }
            if (i9 != 0 && arrayList.isEmpty()) {
                arrayList.add(Integer.valueOf(i9));
            }
            r3 = messages_messages.messages.size() >= tL_messages_search.limit ? 0 : 1;
            i11 = Math.max(messages_messages.count, messages_messages.messages.size());
            z10 = r3;
        } else {
            if (i9 != 0) {
                arrayList.add(Integer.valueOf(i9));
            } else {
                r3 = 0;
            }
            i11 = r3;
            z10 = false;
        }
        getMessagesStorage().updatePinnedMessages(j10, arrayList, true, i11, i10, z10, hashMap);
        AndroidUtilities.runOnUIThread(new a7(this, j10, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadPinnedMessages$163(long j10, long j11, ArrayList arrayList) {
        loadPinnedMessageInternal(j10, j11, arrayList, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadPremiumPromo$7() {
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor = null;
        r1 = null;
        r1 = null;
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo2 = null;
        sQLiteCursor = null;
        int i9 = 0;
        try {
            try {
                queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data, date FROM premium_promo", new Object[0]);
            } catch (Exception e10) {
                e = e10;
                tL_help_premiumPromo = null;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    tL_help_premiumPromo2 = TLRPC.TL_help_premiumPromo.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), true);
                    byteBufferValue.reuse();
                }
                i9 = queryFinalized.intValue(1);
            }
            queryFinalized.dispose();
        } catch (Exception e11) {
            e = e11;
            tL_help_premiumPromo = tL_help_premiumPromo2;
            sQLiteCursor = queryFinalized;
            FileLog.e((Throwable) e, false);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            tL_help_premiumPromo2 = tL_help_premiumPromo;
            processLoadedPremiumPromo(tL_help_premiumPromo2, i9, true);
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursor = queryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
        processLoadedPremiumPromo(tL_help_premiumPromo2, i9, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadPremiumPromo$8(TLObject tLObject, TLRPC.TL_error tL_error) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (tLObject instanceof TLRPC.TL_help_premiumPromo) {
            processLoadedPremiumPromo((TLRPC.TL_help_premiumPromo) tLObject, currentTimeMillis, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadReactions$11(List list, int i9, int i10) {
        processLoadedReactions(list, i9, i10, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Type inference failed for: r6v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$loadReactions$12() {
        SQLiteCursor sQLiteCursor;
        int i9;
        int i10;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor sQLiteCursor3;
        int i11;
        ArrayList arrayList;
        int i12;
        SQLiteCursor sQLiteCursor4 = null;
        int i13 = 0;
        try {
            try {
                SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data, hash, date FROM reactions", new Object[0]);
                try {
                    try {
                        if (queryFinalized.next()) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                int readInt32 = byteBufferValue.readInt32(false);
                                arrayList = new ArrayList(readInt32);
                                for (int i14 = 0; i14 < readInt32; i14++) {
                                    try {
                                        arrayList.add(TLRPC.TL_availableReaction.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), true));
                                    } catch (Exception e10) {
                                        e = e10;
                                        sQLiteCursor4 = queryFinalized;
                                        sQLiteCursor = arrayList;
                                        i11 = 0;
                                        sQLiteCursor3 = sQLiteCursor;
                                        FileLog.e((Throwable) e, false);
                                        if (sQLiteCursor4 != null) {
                                            sQLiteCursor4.dispose();
                                        }
                                        i10 = i11;
                                        sQLiteCursor2 = sQLiteCursor3;
                                        i9 = 0;
                                        AndroidUtilities.runOnUIThread(new w4(this, sQLiteCursor2, i10, i9, 2));
                                    }
                                }
                                byteBufferValue.reuse();
                                sQLiteCursor4 = arrayList;
                            }
                            i11 = queryFinalized.intValue(1);
                            try {
                                i12 = queryFinalized.intValue(2);
                                i13 = i11;
                            } catch (Exception e11) {
                                e = e11;
                                sQLiteCursor3 = sQLiteCursor4;
                                sQLiteCursor4 = queryFinalized;
                                FileLog.e((Throwable) e, false);
                                if (sQLiteCursor4 != null) {
                                }
                                i10 = i11;
                                sQLiteCursor2 = sQLiteCursor3;
                                i9 = 0;
                                AndroidUtilities.runOnUIThread(new w4(this, sQLiteCursor2, i10, i9, 2));
                            }
                        } else {
                            i12 = 0;
                        }
                        queryFinalized.dispose();
                        i9 = i12;
                        sQLiteCursor2 = sQLiteCursor4;
                        i10 = i13;
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor4 = queryFinalized;
                        if (sQLiteCursor4 != null) {
                            sQLiteCursor4.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e12) {
                    e = e12;
                    arrayList = sQLiteCursor4;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e13) {
            e = e13;
            sQLiteCursor = null;
        }
        AndroidUtilities.runOnUIThread(new w4(this, sQLiteCursor2, i10, i9, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadReactions$13(TLObject tLObject) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (tLObject instanceof TLRPC.TL_messages_availableReactionsNotModified) {
            processLoadedReactions(null, 0, currentTimeMillis, false);
        } else if (tLObject instanceof TLRPC.TL_messages_availableReactions) {
            TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject;
            processLoadedReactions(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadReactions$14(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new c7(this, tLObject, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadRecentAndTopReactions$235(TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr) {
        if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_reactions)) {
            TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject;
            this.recentReactions.clear();
            this.recentReactions.addAll(tL_messages_reactions.reactions);
            saveReactionsToPref(sharedPreferences, tL_messages_reactions.hash, tL_messages_reactions.reactions);
        }
        zArr[0] = true;
        if (zArr[1]) {
            this.loadingRecentReactions = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadRecentAndTopReactions$236(SharedPreferences sharedPreferences, boolean[] zArr, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new v6(this, tL_error, tLObject, sharedPreferences, zArr, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadRecentAndTopReactions$237(TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr) {
        if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_reactions)) {
            TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject;
            this.topReactions.clear();
            this.topReactions.addAll(tL_messages_reactions.reactions);
            saveReactionsToPref(sharedPreferences, tL_messages_reactions.hash, tL_messages_reactions.reactions);
        }
        zArr[1] = true;
        if (zArr[0]) {
            this.loadingRecentReactions = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadRecentAndTopReactions$238(SharedPreferences sharedPreferences, boolean[] zArr, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new v6(this, tL_error, tLObject, sharedPreferences, zArr, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$loadRecents$48(boolean z10, ArrayList arrayList, int i9) {
        if (z10) {
            this.recentGifs = arrayList;
            this.loadingRecentGifs = false;
            this.recentGifsLoaded = true;
        } else {
            this.recentStickers[i9] = arrayList;
            this.loadingRecentStickers[i9] = false;
            this.recentStickersLoaded[i9] = true;
        }
        if (i9 == 3) {
            preloadNextGreetingsSticker();
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentDocumentsDidLoad, Boolean.valueOf(z10), Integer.valueOf(i9));
        loadRecents(i9, z10, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadRecents$49(boolean z10, int i9) {
        int i10;
        NativeByteBuffer byteBufferValue;
        if (z10) {
            i10 = 2;
        } else {
            i10 = 3;
            if (i9 != 0) {
                if (i9 == 1) {
                    i10 = 4;
                } else if (i9 == 3) {
                    i10 = 6;
                } else {
                    i10 = 7;
                    if (i9 != 5) {
                        i10 = i9 == 7 ? 8 : 5;
                    }
                }
            }
        }
        try {
            SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT document FROM web_recent_v3 WHERE type = " + i10 + " ORDER BY date DESC", new Object[0]);
            ArrayList arrayList = new ArrayList();
            while (queryFinalized.next()) {
                if (!queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                    TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    if (TLdeserialize != null) {
                        arrayList.add(TLdeserialize);
                    }
                    byteBufferValue.reuse();
                }
            }
            queryFinalized.dispose();
            AndroidUtilities.runOnUIThread(new g9(this, z10, arrayList, i9));
        } catch (Throwable th) {
            getMessagesStorage().checkSQLException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadRecents$50(int i9, TLObject tLObject, TLRPC.TL_error tL_error) {
        processLoadedRecentDocuments(i9, tLObject instanceof TLRPC.TL_messages_savedGifs ? ((TLRPC.TL_messages_savedGifs) tLObject).gifs : null, true, 0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadRecents$51(int i9, TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList<TLRPC.Document> arrayList;
        if (i9 == 3 || i9 == 7) {
            if (tLObject instanceof TLRPC.TL_messages_stickers) {
                arrayList = ((TLRPC.TL_messages_stickers) tLObject).stickers;
            }
            arrayList = null;
        } else if (i9 == 2) {
            if (tLObject instanceof TLRPC.TL_messages_favedStickers) {
                arrayList = ((TLRPC.TL_messages_favedStickers) tLObject).stickers;
            }
            arrayList = null;
        } else {
            if (tLObject instanceof TLRPC.TL_messages_recentStickers) {
                arrayList = ((TLRPC.TL_messages_recentStickers) tLObject).stickers;
            }
            arrayList = null;
        }
        processLoadedRecentDocuments(i9, arrayList, false, 0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadRepliesOfDraftReplies$0(ArrayList arrayList) {
        try {
            ArrayList<Long> arrayList2 = new ArrayList<>();
            ArrayList<Long> arrayList3 = new ArrayList<>();
            a0.h hVar = new a0.h();
            a0.h hVar2 = new a0.h();
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                try {
                    MessagesStorage.addReplyMessages((TLRPC.Message) arrayList.get(i9), hVar, hVar2);
                } catch (Exception e10) {
                    getMessagesStorage().checkSQLException(e10);
                }
            }
            getMessagesStorage().loadReplyMessages(hVar, hVar2, arrayList2, arrayList3, 0);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadReplyIcons$243(TLObject tLObject, SharedPreferences sharedPreferences) {
        if (tLObject instanceof TLRPC.TL_emojiList) {
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            this.replyIconsDefault = (TLRPC.TL_emojiList) tLObject;
            edit.putString("replyicons", Utilities.bytesToHex(serializedData.toByteArray()));
            edit.putLong("replyicons_last_check", System.currentTimeMillis());
            edit.apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadReplyIcons$244(SharedPreferences sharedPreferences, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new c8(this, tLObject, sharedPreferences, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadReplyMessagesForMessages$170(Timer.Task task, long j10, ArrayList arrayList) {
        Timer.done(task);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.replyMessagesDidLoad, Long.valueOf(j10), arrayList, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadReplyMessagesForMessages$171(Timer.Task task, Timer timer, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        Timer.done(task);
        Timer.Task start = Timer.start(timer, "loadReplyMessagesForMessages: (encrypted) loading those messages from storage");
        try {
            ArrayList arrayList2 = new ArrayList();
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT m.data, m.mid, m.date, r.random_id FROM randoms_v2 as r INNER JOIN messages_v2 as m ON r.mid = m.mid AND r.uid = m.uid WHERE r.random_id IN(" + TextUtils.join(",", arrayList) + ")", new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                    byteBufferValue.reuse();
                    TLdeserialize.id = queryFinalized.intValue(1);
                    TLdeserialize.date = queryFinalized.intValue(2);
                    TLdeserialize.dialog_id = j10;
                    long longValue = queryFinalized.longValue(3);
                    ArrayList arrayList3 = (ArrayList) hVar.f(longValue);
                    hVar.l(longValue);
                    if (arrayList3 != null) {
                        MessageObject messageObject = new MessageObject(this.currentAccount, TLdeserialize, false, false);
                        arrayList2.add(messageObject);
                        for (int i9 = 0; i9 < arrayList3.size(); i9++) {
                            MessageObject messageObject2 = (MessageObject) arrayList3.get(i9);
                            messageObject2.replyMessageObject = messageObject;
                            messageObject2.applyTimestampsHighlightForReplyMsg();
                            messageObject2.messageOwner.reply_to = new TLRPC.TL_messageReplyHeader();
                            TLRPC.MessageReplyHeader messageReplyHeader = messageObject2.messageOwner.reply_to;
                            messageReplyHeader.flags |= 16;
                            messageReplyHeader.reply_to_msg_id = messageObject.getRealId();
                        }
                    }
                }
            }
            queryFinalized.dispose();
            if (hVar.m() != 0) {
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    ArrayList arrayList4 = (ArrayList) hVar.n(i10);
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        TLRPC.MessageReplyHeader messageReplyHeader2 = ((MessageObject) arrayList4.get(i11)).messageOwner.reply_to;
                        if (messageReplyHeader2 != null) {
                            messageReplyHeader2.reply_to_random_id = 0L;
                        }
                    }
                }
            }
            Timer.done(start);
            AndroidUtilities.runOnUIThread(new gh.e2(this, Timer.start(timer, "loadReplyMessagesForMessages (encrypted) runOnUIThread: posting notification"), j10, arrayList2, 14));
            if (runnable != null) {
                runnable.run();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadReplyMessagesForMessages$172(AtomicInteger atomicInteger, Runnable runnable) {
        if (atomicInteger.decrementAndGet() != 0 || runnable == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadReplyMessagesForMessages$173(TLRPC.TL_error tL_error, TLRPC.messages_Messages messages_messages, long j10, long j11, a0.h hVar, boolean z10, TLObject tLObject, TLRPC.TL_error tL_error2) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
            messages_messages.messages.addAll(messages_messages2.messages);
            messages_messages.users.addAll(messages_messages2.users);
            messages_messages.chats.addAll(messages_messages2.chats);
            for (int i9 = 0; i9 < messages_messages.messages.size(); i9++) {
                TLRPC.Message message = messages_messages.messages.get(i9);
                if (message.dialog_id == 0) {
                    message.dialog_id = j10;
                }
            }
            MessageObject.fixMessagePeer(messages_messages.messages, j11);
            ImageLoader.saveMessagesThumbs(messages_messages.messages);
            broadcastReplyMessages(messages_messages.messages, hVar, messages_messages.users, messages_messages.chats, j10, false);
            getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            saveReplyMessages(hVar, messages_messages.messages, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$loadReplyMessagesForMessages$174(Timer.Task task, TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages, final long j10, final long j11, final a0.h hVar, final boolean z10, Timer timer, AtomicInteger atomicInteger, Runnable runnable, TLObject tLObject, final TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_getMessages tL_messages_getMessages;
        Timer.done(task);
        if (tL_error == null) {
            final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int i9 = 0;
            while (i9 < messages_messages.messages.size()) {
                if (messages_messages.messages.get(i9) instanceof TLRPC.TL_messageEmpty) {
                    messages_messages.messages.remove(i9);
                    i9--;
                }
                i9++;
            }
            if (messages_messages.messages.size() < tL_messages_getScheduledMessages.id.size()) {
                if (j10 != 0) {
                    TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                    tL_channels_getMessages.channel = getMessagesController().getInputChannel(j10);
                    tL_channels_getMessages.id = tL_messages_getScheduledMessages.id;
                    tL_messages_getMessages = tL_channels_getMessages;
                } else {
                    TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages2.id = tL_messages_getScheduledMessages.id;
                    tL_messages_getMessages = tL_messages_getMessages2;
                }
                getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate() { // from class: org.telegram.messenger.h8
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                        MediaDataController.this.lambda$loadReplyMessagesForMessages$173(tL_error, messages_messages, j11, j10, hVar, z10, tLObject2, tL_error2);
                    }
                });
            } else {
                for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                    TLRPC.Message message = messages_messages.messages.get(i10);
                    if (message.dialog_id == 0) {
                        message.dialog_id = j11;
                    }
                }
                MessageObject.fixMessagePeer(messages_messages.messages, j10);
                ImageLoader.saveMessagesThumbs(messages_messages.messages);
                broadcastReplyMessages(messages_messages.messages, hVar, messages_messages.users, messages_messages.chats, j11, false);
                getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                saveReplyMessages(hVar, messages_messages.messages, z10);
            }
        } else {
            Timer.log(timer, "getScheduledMessages error: " + tL_error.code + " " + tL_error.text);
        }
        if (atomicInteger.decrementAndGet() != 0 || runnable == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadReplyMessagesForMessages$175(Timer.Task task, long j10, long j11, a0.h hVar, boolean z10, Timer timer, AtomicInteger atomicInteger, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        Timer.done(task);
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            for (int i9 = 0; i9 < messages_messages.messages.size(); i9++) {
                TLRPC.Message message = messages_messages.messages.get(i9);
                if (message.dialog_id == 0) {
                    message.dialog_id = j10;
                }
            }
            MessageObject.fixMessagePeer(messages_messages.messages, j11);
            ImageLoader.saveMessagesThumbs(messages_messages.messages);
            broadcastReplyMessages(messages_messages.messages, hVar, messages_messages.users, messages_messages.chats, j10, false);
            getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            saveReplyMessages(hVar, messages_messages.messages, z10);
        } else {
            Timer.log(timer, "channels.getMessages error: " + tL_error.code + " " + tL_error.text);
        }
        if (atomicInteger.decrementAndGet() != 0 || runnable == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadReplyMessagesForMessages$176(Timer.Task task, long j10, a0.h hVar, boolean z10, Timer timer, AtomicInteger atomicInteger, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        Timer.done(task);
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            for (int i9 = 0; i9 < messages_messages.messages.size(); i9++) {
                TLRPC.Message message = messages_messages.messages.get(i9);
                if (message.dialog_id == 0) {
                    message.dialog_id = j10;
                }
            }
            ImageLoader.saveMessagesThumbs(messages_messages.messages);
            broadcastReplyMessages(messages_messages.messages, hVar, messages_messages.users, messages_messages.chats, j10, false);
            getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            saveReplyMessages(hVar, messages_messages.messages, z10);
        } else {
            Timer.log(timer, "messages.getMessages error: " + tL_error.code + " " + tL_error.text);
        }
        if (atomicInteger.decrementAndGet() != 0 || runnable == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0107 A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:3:0x000b, B:5:0x002f, B:8:0x003c, B:13:0x0043, B:18:0x006f, B:22:0x01cc, B:31:0x0169, B:34:0x009f, B:36:0x0101, B:38:0x0107, B:40:0x010d, B:42:0x013e, B:43:0x0143, B:45:0x014b, B:47:0x015a, B:51:0x0164, B:53:0x00d1, B:55:0x0175, B:57:0x0183, B:60:0x0195, B:65:0x01a1, B:67:0x01a7, B:69:0x01b1, B:71:0x01b8, B:76:0x01da, B:78:0x01e4, B:79:0x01eb, B:81:0x01f1, B:82:0x01fe, B:84:0x020f, B:86:0x0219, B:88:0x021f, B:90:0x025b, B:92:0x02f6, B:97:0x0277, B:99:0x02b4, B:102:0x02be, B:104:0x02ef, B:109:0x0300, B:112:0x030b), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0164 A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:3:0x000b, B:5:0x002f, B:8:0x003c, B:13:0x0043, B:18:0x006f, B:22:0x01cc, B:31:0x0169, B:34:0x009f, B:36:0x0101, B:38:0x0107, B:40:0x010d, B:42:0x013e, B:43:0x0143, B:45:0x014b, B:47:0x015a, B:51:0x0164, B:53:0x00d1, B:55:0x0175, B:57:0x0183, B:60:0x0195, B:65:0x01a1, B:67:0x01a7, B:69:0x01b1, B:71:0x01b8, B:76:0x01da, B:78:0x01e4, B:79:0x01eb, B:81:0x01f1, B:82:0x01fe, B:84:0x020f, B:86:0x0219, B:88:0x021f, B:90:0x025b, B:92:0x02f6, B:97:0x0277, B:99:0x02b4, B:102:0x02be, B:104:0x02ef, B:109:0x0300, B:112:0x030b), top: B:2:0x000b }] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0160 -> B:32:0x00cf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lambda$loadReplyMessagesForMessages$177(Timer.Task task, a0.h hVar, final AtomicInteger atomicInteger, final Runnable runnable, int i9, final Timer timer, final a0.h hVar2, a0.h hVar3, final boolean z10, final long j10) {
        int i10;
        int i11;
        int i12;
        ArrayList<TL_ephemeral.EphemeralMessage> ephemeralMessagesInternal;
        int i13;
        int i14;
        ?? r82;
        SQLiteCursor sQLiteCursor;
        String str;
        String str2;
        a0.h hVar4 = hVar2;
        a0.h hVar5 = hVar3;
        Timer.done(task);
        try {
            getMessagesController().getStoriesController().k.d(hVar, new c2(19, atomicInteger, runnable), i9, true, timer);
            Timer timer2 = timer;
            if (hVar4.i()) {
                Timer.log(timer2, "loadReplyMessagesForMessages: empty replyMessageOwners");
                if (atomicInteger.decrementAndGet() != 0 || runnable == null) {
                    return;
                }
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
            Timer.Task start = Timer.start(timer2, "loadReplyMessagesForMessages: getting reply messages");
            ArrayList<TLRPC.Message> arrayList = new ArrayList<>();
            ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
            ArrayList<TLRPC.Chat> arrayList3 = new ArrayList<>();
            ArrayList<Long> arrayList4 = new ArrayList<>();
            ArrayList arrayList5 = new ArrayList();
            int m10 = hVar4.m();
            int i15 = 0;
            while (true) {
                String str3 = ",";
                if (i15 >= m10) {
                    break;
                }
                Timer.Task task2 = start;
                long j11 = hVar4.j(i15);
                ArrayList arrayList6 = (ArrayList) hVar5.f(-j11);
                if (arrayList6 == null) {
                    i11 = m10;
                    i12 = i15;
                } else {
                    i11 = m10;
                    int i16 = 0;
                    while (i16 < 2) {
                        if (i16 == 1 && !z10) {
                            i13 = i15;
                            str = str3;
                            i14 = i16;
                        } else if (i16 == 1) {
                            SQLiteDatabase database = getMessagesStorage().getDatabase();
                            Locale locale = Locale.US;
                            i13 = i15;
                            String join = TextUtils.join(str3, arrayList6);
                            StringBuilder sb2 = new StringBuilder();
                            i14 = i16;
                            sb2.append("SELECT data, mid, date, uid FROM scheduled_messages_v2 WHERE mid IN(");
                            sb2.append(join);
                            sb2.append(") AND uid = ");
                            sb2.append(j10);
                            SQLiteCursor sQLiteCursor2 = database.queryFinalized(sb2.toString(), new Object[0]);
                            r82 = 0;
                            sQLiteCursor = sQLiteCursor2;
                            if (sQLiteCursor.next()) {
                                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(r82);
                                if (byteBufferValue != 0) {
                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r82), r82);
                                    str2 = str3;
                                    TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                                    byteBufferValue.reuse();
                                    TLdeserialize.id = sQLiteCursor.intValue(1);
                                    TLdeserialize.date = sQLiteCursor.intValue(2);
                                    TLdeserialize.dialog_id = j10;
                                    MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize, arrayList4, arrayList5, null);
                                    arrayList.add(TLdeserialize);
                                    TLRPC.Peer peer = TLdeserialize.peer_id;
                                    long j12 = peer != null ? peer.channel_id : 0L;
                                    ArrayList arrayList7 = (ArrayList) hVar5.f(j12);
                                    if (arrayList7 != null) {
                                        arrayList7.remove(Integer.valueOf(TLdeserialize.id));
                                        if (arrayList7.isEmpty()) {
                                            hVar5.l(j12);
                                        }
                                    }
                                } else {
                                    str2 = str3;
                                }
                                str3 = str2;
                                sQLiteCursor2 = sQLiteCursor;
                                r82 = 0;
                                sQLiteCursor = sQLiteCursor2;
                                if (sQLiteCursor.next()) {
                                }
                            } else {
                                str = str3;
                                sQLiteCursor.dispose();
                            }
                        } else {
                            i13 = i15;
                            i14 = i16;
                            SQLiteDatabase database2 = getMessagesStorage().getDatabase();
                            Locale locale2 = Locale.US;
                            r82 = 0;
                            sQLiteCursor = database2.queryFinalized("SELECT data, mid, date, uid FROM messages_v2 WHERE mid IN(" + TextUtils.join(str3, arrayList6) + ") AND uid = " + j10, new Object[0]);
                            if (sQLiteCursor.next()) {
                            }
                        }
                        i16 = i14 + 1;
                        str3 = str;
                        i15 = i13;
                    }
                    i12 = i15;
                    ArrayList<Integer> arrayList8 = new ArrayList<>();
                    int size = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj = arrayList6.get(i17);
                        i17++;
                        int intValue = ((Integer) obj).intValue();
                        if (MessageObject.isEphemeralMessageId(intValue)) {
                            arrayList8.add(Integer.valueOf(MessageObject.ephemeralMessageIdUnpack(intValue)));
                        }
                    }
                    if (!arrayList8.isEmpty() && (ephemeralMessagesInternal = getMessagesStorage().getEphemeralMessagesInternal(j10, arrayList8)) != null) {
                        int size2 = ephemeralMessagesInternal.size();
                        int i18 = 0;
                        while (i18 < size2) {
                            TL_ephemeral.EphemeralMessage ephemeralMessage = ephemeralMessagesInternal.get(i18);
                            i18++;
                            TLRPC.Message b10 = ff.x.b(ephemeralMessage);
                            MessagesStorage.addUsersAndChatsFromMessage(b10, arrayList4, arrayList5, null);
                            arrayList.add(b10);
                        }
                    }
                }
                i15 = i12 + 1;
                start = task2;
                hVar4 = hVar2;
                m10 = i11;
            }
            Timer.Task task3 = start;
            if (!arrayList4.isEmpty()) {
                getMessagesStorage().getUsersInternal(arrayList4, arrayList2);
            }
            if (!arrayList5.isEmpty()) {
                getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList5), arrayList3);
            }
            final long j13 = j10;
            broadcastReplyMessages(arrayList, hVar2, arrayList2, arrayList3, j13, true);
            if (hVar5.i()) {
                Timer.done(task3);
                if (atomicInteger.decrementAndGet() != 0 || runnable == null) {
                    return;
                }
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
            Timer.done(task3);
            int m11 = hVar5.m();
            int i19 = 0;
            while (i19 < m11) {
                final long j14 = hVar5.j(i19);
                if (z10) {
                    final Timer.Task start2 = Timer.start(timer2, "loadReplyMessagesForMessages: load scheduled");
                    final TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = getMessagesController().getInputPeer(j13);
                    tL_messages_getScheduledMessages.id = (ArrayList) hVar5.n(i19);
                    i10 = m11;
                    int sendRequest = getConnectionsManager().sendRequest(tL_messages_getScheduledMessages, new RequestDelegate() { // from class: org.telegram.messenger.n7
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            MediaDataController.this.lambda$loadReplyMessagesForMessages$174(start2, tL_messages_getScheduledMessages, j14, j13, hVar2, z10, timer, atomicInteger, runnable, tLObject, tL_error);
                        }
                    });
                    if (i9 != 0) {
                        getConnectionsManager().bindRequestToGuid(sendRequest, i9);
                    }
                } else {
                    Timer timer3 = timer2;
                    i10 = m11;
                    if (j14 != 0) {
                        final Timer.Task start3 = Timer.start(timer3, "loadReplyMessagesForMessages: load channel messages");
                        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                        tL_channels_getMessages.channel = getMessagesController().getInputChannel(j14);
                        tL_channels_getMessages.id = (ArrayList) hVar5.n(i19);
                        int sendRequest2 = getConnectionsManager().sendRequest(tL_channels_getMessages, new RequestDelegate() { // from class: org.telegram.messenger.t7
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                MediaDataController.this.lambda$loadReplyMessagesForMessages$175(start3, j10, j14, hVar2, z10, timer, atomicInteger, runnable, tLObject, tL_error);
                            }
                        });
                        if (i9 != 0) {
                            getConnectionsManager().bindRequestToGuid(sendRequest2, i9);
                        }
                        hVar5 = hVar3;
                    } else {
                        Timer.Task start4 = Timer.start(timer3, "loadReplyMessagesForMessages: load messages");
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        hVar5 = hVar3;
                        tL_messages_getMessages.id = (ArrayList) hVar5.n(i19);
                        int sendRequest3 = getConnectionsManager().sendRequest(tL_messages_getMessages, new ih.h7(this, start4, j10, hVar2, z10, timer3, atomicInteger, runnable));
                        if (i9 != 0) {
                            getConnectionsManager().bindRequestToGuid(sendRequest3, i9);
                        }
                    }
                }
                i19++;
                m11 = i10;
                timer2 = timer;
                j13 = j10;
            }
        } catch (Exception e10) {
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadRestrictedStatusEmojis$245(TLObject tLObject, SharedPreferences sharedPreferences) {
        if (tLObject instanceof TLRPC.TL_emojiList) {
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            this.restrictedStatusEmojis = (TLRPC.TL_emojiList) tLObject;
            edit.putString("restrictedstatuses", Utilities.bytesToHex(serializedData.toByteArray()));
            edit.putLong("restrictedstatuses_last_check", System.currentTimeMillis());
            edit.apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadRestrictedStatusEmojis$246(SharedPreferences sharedPreferences, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new c8(this, tLObject, sharedPreferences, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadSavedReactions$239(TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences) {
        if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_reactions)) {
            TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject;
            this.savedReactions.clear();
            this.savedReactions.addAll(tL_messages_reactions.reactions);
            saveReactionsToPref(sharedPreferences, tL_messages_reactions.hash, tL_messages_reactions.reactions);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.savedReactionTagsUpdate, 0L);
        }
        this.loadingSavedReactions = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadSavedReactions$240(SharedPreferences sharedPreferences, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new gk((BaseController) this, tL_error, (Object) tLObject, (Object) sharedPreferences, 13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadStickers$100(TLObject tLObject, int i9, Utilities.Callback callback, long j10) {
        if (tLObject instanceof TLRPC.TL_messages_allStickers) {
            processLoadStickersResponse(i9, (TLRPC.TL_messages_allStickers) tLObject, new o7(0, callback));
        } else {
            processLoadedStickers(i9, null, false, (int) (System.currentTimeMillis() / 1000), j10, new o7(1, callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadStickers$101(int i9, Utilities.Callback callback, long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new fh.c0(this, tLObject, i9, callback, j10, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadStickers$91(int i9, boolean z10, Utilities.Callback callback) {
        loadStickers(i9, false, z10, false, callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadStickers$92(Utilities.Callback callback, ArrayList arrayList) {
        if (callback != null) {
            callback.run(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r2 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$loadStickers$93(int i9, Utilities.Callback callback) {
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList = new ArrayList<>();
        int i10 = 0;
        long j10 = 0;
        SQLiteCursor sQLiteCursor = null;
        try {
            sQLiteCursor = getMessagesStorage().getDatabase().queryFinalized("SELECT data, date, hash FROM stickers_v2 WHERE id = " + (i9 + 1), new Object[0]);
            if (sQLiteCursor.next()) {
                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                if (byteBufferValue != null) {
                    int readInt32 = byteBufferValue.readInt32(false);
                    for (int i11 = 0; i11 < readInt32; i11++) {
                        arrayList.add(TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                    }
                    byteBufferValue.reuse();
                }
                i10 = sQLiteCursor.intValue(1);
                j10 = calcStickersHash(arrayList);
            }
        } catch (Throwable th) {
            try {
                FileLog.e(th);
            } finally {
            }
        }
        sQLiteCursor.dispose();
        processLoadedStickers(i9, arrayList, true, i10, j10, new e2(callback, arrayList, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadStickers$94(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadStickers$95(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadStickers$96(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadStickers$97(int i9, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.TL_messages_stickerSet)) {
            processLoadedStickers(i9, null, false, (int) (System.currentTimeMillis() / 1000), 0L, new o7(5, callback));
            return;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList = new ArrayList<>();
        arrayList.add((TLRPC.TL_messages_stickerSet) tLObject);
        processLoadedStickers(i9, arrayList, false, (int) (System.currentTimeMillis() / 1000), calcStickersHash(arrayList), new o7(4, callback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadStickers$98(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadStickers$99(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadStickersByEmojiOrName$83(String str, boolean z10) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        int i9;
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor = null;
        r1 = null;
        r1 = null;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = null;
        int i10 = 0;
        try {
            queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data, date FROM stickers_dice WHERE emoji = ?", str);
        } catch (Throwable th) {
            th = th;
            tL_messages_stickerSet = null;
        }
        try {
            if (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    tL_messages_stickerSet3 = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    byteBufferValue.reuse();
                }
                i10 = queryFinalized.intValue(1);
            }
            queryFinalized.dispose();
            tL_messages_stickerSet2 = tL_messages_stickerSet3;
            i9 = i10;
        } catch (Throwable th2) {
            th = th2;
            tL_messages_stickerSet = tL_messages_stickerSet3;
            sQLiteCursor = queryFinalized;
            try {
                FileLog.e(th);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                i9 = 0;
                processLoadedDiceStickers(str, z10, tL_messages_stickerSet2, true, i9);
            } finally {
            }
        }
        processLoadedDiceStickers(str, z10, tL_messages_stickerSet2, true, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadStickersByEmojiOrName$84(TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z10) {
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            processLoadedDiceStickers(str, z10, (TLRPC.TL_messages_stickerSet) tLObject, false, (int) (System.currentTimeMillis() / 1000));
        } else {
            processLoadedDiceStickers(str, z10, null, false, (int) (System.currentTimeMillis() / 1000));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadStickersByEmojiOrName$85(String str, boolean z10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new bg.m((Object) this, tL_error, tLObject, str, z10, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$markFeaturedStickersByIdAsRead$67(boolean z10, long j10) {
        this.unreadStickerSets[z10 ? 1 : 0].remove(Long.valueOf(j10));
        this.readingStickerSets[z10 ? 1 : 0].remove(Long.valueOf(j10));
        this.loadFeaturedHash[z10 ? 1 : 0] = calcFeaturedStickersHash(z10, this.featuredStickerSets[z10 ? 1 : 0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(z10 ? NotificationCenter.featuredEmojiDidLoad : NotificationCenter.featuredStickersDidLoad, new Object[0]);
        putFeaturedStickersToCache(z10, this.featuredStickerSets[z10 ? 1 : 0], this.unreadStickerSets[z10 ? 1 : 0], this.loadFeaturedDate[z10 ? 1 : 0], this.loadFeaturedHash[z10 ? 1 : 0], this.loadFeaturedPremium);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$preloadPremiumPreviewStickers$205(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            return;
        }
        this.previewStickersLoading = false;
        this.premiumPreviewStickers.clear();
        this.premiumPreviewStickers.addAll(((TLRPC.TL_messages_stickers) tLObject).stickers);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumStickersPreviewLoaded, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$preloadPremiumPreviewStickers$206(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new x8(this, tL_error, tLObject, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadStickersResponse$73(TLObject tLObject, ArrayList arrayList, int i9, a0.h hVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i10) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
        arrayList.set(i9, tL_messages_stickerSet);
        hVar.k(tL_messages_stickerSet, stickerSet.id);
        if (hVar.m() == tL_messages_allStickers.sets.size()) {
            int i11 = 0;
            while (i11 < arrayList.size()) {
                if (arrayList.get(i11) == null) {
                    arrayList.remove(i11);
                    i11--;
                }
                i11++;
            }
            processLoadedStickers(i10, arrayList, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadStickersResponse$74(ArrayList arrayList, int i9, a0.h hVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new r(this, tLObject, arrayList, i9, hVar, stickerSet, tL_messages_allStickers, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedDiceStickers$86(String str) {
        this.loadingDiceStickerSets.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedDiceStickers$87(String str, boolean z10) {
        loadStickersByEmojiOrName(str, z10, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedDiceStickers$88(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.diceStickerSetsByEmoji.put(str, tL_messages_stickerSet);
        this.diceEmojiStickerSetsById.k(str, tL_messages_stickerSet.set.id);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.diceStickersDidLoad, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedDiceStickers$89(boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i9, String str, boolean z11) {
        if (z10) {
            if (tL_messages_stickerSet == null || Math.abs((System.currentTimeMillis() / 1000) - i9) >= 86400) {
                AndroidUtilities.runOnUIThread(new f8(this, str, z11, 0), (tL_messages_stickerSet != null || z10) ? 0L : 1000L);
                if (tL_messages_stickerSet == null) {
                    return;
                }
            }
        }
        if (tL_messages_stickerSet != null) {
            if (!z10) {
                putDiceStickersToCache(str, tL_messages_stickerSet, i9);
            }
            AndroidUtilities.runOnUIThread(new f0(this, str, tL_messages_stickerSet, 26));
        } else {
            if (z10) {
                return;
            }
            putDiceStickersToCache(str, null, i9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedFeaturedStickers$59(boolean z10) {
        this.loadingFeaturedStickers[z10 ? 1 : 0] = false;
        this.featuredStickersLoaded[z10 ? 1 : 0] = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedFeaturedStickers$60(ArrayList arrayList, long j10, boolean z10) {
        if (arrayList != null && j10 != 0) {
            this.loadFeaturedHash[z10 ? 1 : 0] = j10;
        }
        this.loadingFeaturedStickers[z10 ? 1 : 0] = false;
        loadFeaturedStickers(z10, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$processLoadedFeaturedStickers$61(boolean z10, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, long j10, int i9, boolean z11) {
        this.unreadStickerSets[z10 ? 1 : 0] = arrayList;
        this.featuredStickerSetsById[z10 ? 1 : 0] = hVar;
        this.featuredStickerSets[z10 ? 1 : 0] = arrayList2;
        this.loadFeaturedHash[z10 ? 1 : 0] = j10;
        this.loadFeaturedDate[z10 ? 1 : 0] = i9;
        this.loadFeaturedPremium = z11;
        loadStickers(z10 ? 6 : 3, true, false);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(z10 ? NotificationCenter.featuredEmojiDidLoad : NotificationCenter.featuredStickersDidLoad, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedFeaturedStickers$62(boolean z10, int i9) {
        this.loadFeaturedDate[z10 ? 1 : 0] = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedFeaturedStickers$63(boolean z10, ArrayList arrayList, final int i9, final long j10, final boolean z11, final ArrayList arrayList2, final boolean z12) {
        long j11 = 0;
        if ((z10 && (arrayList == null || Math.abs((System.currentTimeMillis() / 1000) - i9) >= 3600)) || (!z10 && arrayList == null && j10 == 0)) {
            q8 q8Var = new q8(this, arrayList, j10, z11);
            if (arrayList == null && !z10) {
                j11 = 1000;
            }
            AndroidUtilities.runOnUIThread(q8Var, j11);
            if (arrayList == null) {
                return;
            }
        }
        if (arrayList == null) {
            AndroidUtilities.runOnUIThread(new o8(this, z11, i9, 1));
            putFeaturedStickersToCache(z11, null, null, i9, 0L, z12);
            return;
        }
        try {
            final ArrayList<TLRPC.StickerSetCovered> arrayList3 = new ArrayList<>();
            final a0.h hVar = new a0.h();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i10);
                arrayList3.add(stickerSetCovered);
                hVar.k(stickerSetCovered, stickerSetCovered.set.id);
            }
            if (!z10) {
                putFeaturedStickersToCache(z11, arrayList3, arrayList2, i9, j10, z12);
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.u8
                @Override // java.lang.Runnable
                public final void run() {
                    MediaDataController.this.lambda$processLoadedFeaturedStickers$61(z11, arrayList2, hVar, arrayList3, j10, i9, z12);
                }
            });
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedMedia$133(TLRPC.messages_Messages messages_messages, int i9, long j10, ArrayList arrayList, int i10, int i11, boolean z10, int i12, int i13) {
        int i14 = messages_messages.count;
        getMessagesController().putUsers(messages_messages.users, i9 != 0);
        getMessagesController().putChats(messages_messages.chats, i9 != 0);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mediaDidLoad, Long.valueOf(j10), Integer.valueOf(i14), arrayList, Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10), Boolean.valueOf(i12 != 0), Integer.valueOf(i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedMedia$134(TLRPC.messages_Messages messages_messages, int i9, long j10, ArrayList arrayList, int i10, int i11, boolean z10, int i12, int i13) {
        AndroidUtilities.runOnUIThread(new x6(this, messages_messages, i9, j10, arrayList, i10, i11, z10, i12, i13, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedMedia$135(ArrayList arrayList, Runnable runnable) {
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i9);
            TLRPC.Message messageWithCustomParamsOnlyInternal = getMessagesStorage().getMessageWithCustomParamsOnlyInternal(messageObject.getId(), messageObject.getDialogId());
            TLRPC.Message message = messageObject.messageOwner;
            message.translatedToLanguage = messageWithCustomParamsOnlyInternal.translatedToLanguage;
            message.translatedText = messageWithCustomParamsOnlyInternal.translatedText;
            messageObject.updateTranslation();
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedMedia$136(TLRPC.messages_Messages messages_messages, int i9, long j10, int i10, int i11, boolean z10, int i12, int i13) {
        a0.h hVar = new a0.h();
        for (int i14 = 0; i14 < messages_messages.users.size(); i14++) {
            TLRPC.User user = messages_messages.users.get(i14);
            hVar.k(user, user.id);
        }
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        for (int i15 = 0; i15 < messages_messages.messages.size(); i15++) {
            MessageObject messageObject = new MessageObject(this.currentAccount, messages_messages.messages.get(i15), hVar, true, false);
            messageObject.createStrippedThumb();
            arrayList.add(messageObject);
        }
        getFileLoader().checkMediaExistance(arrayList);
        x6 x6Var = new x6(this, messages_messages, i9, j10, arrayList, i10, i11, z10, i12, i13, 1);
        if (getMessagesController().getTranslateController().isFeatureAvailable(j10)) {
            getMessagesStorage().getStorageQueue().postRunnable(new x8(this, arrayList, x6Var, 2));
        } else {
            x6Var.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r5 == 2) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$processLoadedMediaCount$137(long j10, boolean z10, int i9, int i10, int i11, long j11, int i12) {
        int i13;
        boolean z11;
        int i14 = i9;
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j10);
        if (z10) {
            if (i14 == -1) {
                i13 = i10;
            } else if (i14 == 0) {
                i13 = i10;
            }
            if (!isEncryptedDialog) {
                z11 = true;
                if (!z11 || (i11 == 1 && !isEncryptedDialog)) {
                    getMediaCount(j10, j11, i13, i12, false);
                }
                if (z11) {
                    return;
                }
                if (!z10) {
                    putMediaCountDatabase(j10, j11, i10, i14);
                }
                NotificationCenter notificationCenter = getNotificationCenter();
                int i15 = NotificationCenter.mediaCountDidLoad;
                Long valueOf = Long.valueOf(j10);
                Long valueOf2 = Long.valueOf(j11);
                if (z10 && i14 == -1) {
                    i14 = 0;
                }
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i15, valueOf, valueOf2, Integer.valueOf(i14), Boolean.valueOf(z10), Integer.valueOf(i10));
                return;
            }
            z11 = false;
            if (!z11) {
            }
            getMediaCount(j10, j11, i13, i12, false);
            if (z11) {
            }
        }
        i13 = i10;
        z11 = false;
        if (!z11) {
        }
        getMediaCount(j10, j11, i13, i12, false);
        if (z11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedMenuBots$5() {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.attachMenuBotsDidLoad, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedPremiumPromo$9() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumPromoUpdated, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedReactions$15() {
        preloadDefaultReactions();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reactionsDidLoad, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedRecentDocuments$52(boolean z10, int i9, ArrayList arrayList, boolean z11, int i10) {
        int i11;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            int i12 = 2;
            if (z10) {
                i11 = getMessagesController().maxRecentGifsCount;
            } else {
                if (i9 != 3 && i9 != 7) {
                    i11 = i9 == 2 ? getMessagesController().maxFaveStickersCount : getMessagesController().maxRecentStickersCount;
                }
                i11 = 200;
            }
            database.beginTransaction();
            SQLitePreparedStatement executeFast = database.executeFast("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            int size = arrayList.size();
            int i13 = z10 ? 2 : i9 == 0 ? 3 : i9 == 1 ? 4 : i9 == 3 ? 6 : i9 == 5 ? 7 : i9 == 7 ? 8 : 5;
            if (z11) {
                database.executeFast("DELETE FROM web_recent_v3 WHERE type = " + i13).stepThis().dispose();
            }
            int i14 = 0;
            while (i14 < size && i14 != i11) {
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i14);
                executeFast.requery();
                executeFast.bindString(1, "" + document.id);
                executeFast.bindInteger(i12, i13);
                executeFast.bindString(3, "");
                executeFast.bindString(4, "");
                executeFast.bindString(5, "");
                executeFast.bindInteger(6, 0);
                executeFast.bindInteger(7, 0);
                executeFast.bindInteger(8, 0);
                executeFast.bindInteger(9, i10 != 0 ? i10 : size - i14);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                document.serializeToStream(nativeByteBuffer);
                executeFast.bindByteBuffer(10, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
                i14++;
                i12 = 2;
            }
            executeFast.dispose();
            database.commitTransaction();
            if (z11 || arrayList.size() < i11) {
                return;
            }
            database.beginTransaction();
            while (i11 < arrayList.size()) {
                database.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + ((TLRPC.Document) arrayList.get(i11)).id + "' AND type = " + i13).stepThis().dispose();
                i11++;
            }
            database.commitTransaction();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$processLoadedRecentDocuments$53(boolean z10, int i9, ArrayList arrayList) {
        SharedPreferences.Editor edit = MessagesController.getEmojiSettings(this.currentAccount).edit();
        if (z10) {
            this.loadingRecentGifs = false;
            this.recentGifsLoaded = true;
            edit.putLong("lastGifLoadTime", System.currentTimeMillis()).apply();
        } else {
            this.loadingRecentStickers[i9] = false;
            this.recentStickersLoaded[i9] = true;
            if (i9 == 0) {
                edit.putLong("lastStickersLoadTime", System.currentTimeMillis()).apply();
            } else if (i9 == 1) {
                edit.putLong("lastStickersLoadTimeMask", System.currentTimeMillis()).apply();
            } else if (i9 == 3) {
                edit.putLong("lastStickersLoadTimeGreet", System.currentTimeMillis()).apply();
            } else if (i9 == 5) {
                edit.putLong("lastStickersLoadTimeEmojiPacks", System.currentTimeMillis()).apply();
            } else if (i9 == 7) {
                edit.putLong("lastStickersLoadTimePremiumStickers", System.currentTimeMillis()).apply();
            } else {
                edit.putLong("lastStickersLoadTimeFavs", System.currentTimeMillis()).apply();
            }
        }
        if (arrayList != null) {
            if (z10) {
                this.recentGifs = arrayList;
            } else {
                this.recentStickers[i9] = arrayList;
            }
            if (i9 == 3) {
                preloadNextGreetingsSticker();
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentDocumentsDidLoad, Boolean.valueOf(z10), Integer.valueOf(i9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedStickers$103(int i9) {
        this.loadingStickers[i9] = false;
        this.stickersLoaded[i9] = true;
        Runnable runnable = this.scheduledLoadStickers[i9];
        if (runnable != null) {
            runnable.run();
            this.scheduledLoadStickers[i9] = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedStickers$104(ArrayList arrayList, long j10, int i9) {
        if (arrayList != null && j10 != 0) {
            this.loadHash[i9] = j10;
        }
        loadStickers(i9, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$processLoadedStickers$105(int i9, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j10, int i10, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        for (int i11 = 0; i11 < this.stickerSets[i9].size(); i11++) {
            TLRPC.StickerSet stickerSet = this.stickerSets[i9].get(i11).set;
            this.stickerSetsById.l(stickerSet.id);
            this.stickerSetsByName.remove(stickerSet.short_name);
            if (i9 != 3 && i9 != 6 && i9 != 4) {
                this.installedStickerSetsById.l(stickerSet.id);
            }
        }
        for (int i12 = 0; i12 < hVar.m(); i12++) {
            this.stickerSetsById.k((TLRPC.TL_messages_stickerSet) hVar.n(i12), hVar.j(i12));
            if (i9 != 3 && i9 != 6 && i9 != 4) {
                this.installedStickerSetsById.k((TLRPC.TL_messages_stickerSet) hVar.n(i12), hVar.j(i12));
            }
        }
        this.stickerSetsByName.putAll(hashMap);
        this.stickerSets[i9] = arrayList;
        this.loadHash[i9] = j10;
        this.loadDate[i9] = i10;
        this.stickersByIds[i9] = hVar2;
        if (i9 == 0) {
            this.allStickers = hashMap2;
            this.stickersByEmoji = hVar3;
        } else if (i9 == 3) {
            this.allStickersFeatured = hashMap2;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i9), Boolean.TRUE);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedStickers$106(int i9, int i10) {
        this.loadDate[i9] = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedStickers$107(boolean z10, ArrayList arrayList, int i9, long j10, int i10, Runnable runnable) {
        MediaDataController mediaDataController;
        ArrayList arrayList2;
        String str;
        long j11 = 0;
        if ((z10 && (arrayList == null || BuildVars.DEBUG_PRIVATE_VERSION || Math.abs((System.currentTimeMillis() / 1000) - i9) >= 3600)) || (!z10 && arrayList == null && j10 == 0)) {
            mediaDataController = this;
            arrayList2 = arrayList;
            gh.c9 c9Var = new gh.c9(mediaDataController, arrayList2, j10, i10, 2);
            if (arrayList2 == null && !z10) {
                j11 = 1000;
            }
            AndroidUtilities.runOnUIThread(c9Var, j11);
            if (arrayList2 == null) {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
        } else {
            mediaDataController = this;
            arrayList2 = arrayList;
        }
        if (arrayList2 == null) {
            if (z10) {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            } else {
                AndroidUtilities.runOnUIThread(new p6(mediaDataController, i10, i9, 1));
                mediaDataController.putStickersToCache(i10, null, i9, 0L);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        try {
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList3 = new ArrayList<>();
            a0.h hVar = new a0.h();
            HashMap hashMap = new HashMap();
            a0.h hVar2 = new a0.h();
            a0.h hVar3 = new a0.h();
            HashMap hashMap2 = new HashMap();
            int i11 = 0;
            while (i11 < arrayList2.size()) {
                try {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList2.get(i11);
                    if (tL_messages_stickerSet != null && mediaDataController.removingStickerSetsUndos.h(tL_messages_stickerSet.set.id) < 0) {
                        arrayList3.add(tL_messages_stickerSet);
                        hVar.k(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
                        hashMap.put(tL_messages_stickerSet.set.short_name, tL_messages_stickerSet);
                        for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                            TLRPC.Document document = tL_messages_stickerSet.documents.get(i12);
                            if (document != null && !(document instanceof TLRPC.TL_documentEmpty)) {
                                hVar3.k(document, document.id);
                            }
                        }
                        if (!tL_messages_stickerSet.set.archived) {
                            int i13 = 0;
                            while (i13 < tL_messages_stickerSet.packs.size()) {
                                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i13);
                                if (tL_stickerPack != null && (str = tL_stickerPack.emoticon) != null) {
                                    String replace = str.replace("️", "");
                                    tL_stickerPack.emoticon = replace;
                                    ArrayList arrayList4 = (ArrayList) hashMap2.get(replace);
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                        hashMap2.put(tL_stickerPack.emoticon, arrayList4);
                                    }
                                    int i14 = 0;
                                    while (i14 < tL_stickerPack.documents.size()) {
                                        Long l10 = tL_stickerPack.documents.get(i14);
                                        a0.h hVar4 = hVar;
                                        if (hVar2.h(l10.longValue()) < 0) {
                                            hVar2.k(tL_stickerPack.emoticon, l10.longValue());
                                        }
                                        TLRPC.Document document2 = (TLRPC.Document) hVar3.f(l10.longValue());
                                        if (document2 != null) {
                                            arrayList4.add(document2);
                                        }
                                        i14++;
                                        hVar = hVar4;
                                    }
                                }
                                i13++;
                                hVar = hVar;
                            }
                        }
                    }
                    i11++;
                    mediaDataController = this;
                    arrayList2 = arrayList;
                    hVar = hVar;
                } catch (Throwable th) {
                    th = th;
                    FileLog.e(th);
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
            }
            a0.h hVar5 = hVar;
            if (!z10) {
                putStickersToCache(i10, arrayList3, i9, j10);
            }
            AndroidUtilities.runOnUIThread(new y2(this, i10, hVar5, hashMap, arrayList3, j10, i9, hVar3, hashMap2, hVar2, runnable));
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putBotInfo$201(TL_bots.BotInfo botInfo, long j10) {
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(botInfo.getObjectSize());
            botInfo.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, botInfo.user_id);
            executeFast.bindLong(2, j10);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putBotKeyboard$200(MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        TLRPC.Message message2 = this.botKeyboards.get(topicKey);
        this.botKeyboards.put(topicKey, message);
        ArrayList arrayList = (ArrayList) this.botDialogKeyboards.f(topicKey.dialogId);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.add(message);
        this.botDialogKeyboards.k(arrayList, topicKey.dialogId);
        if (MessageObject.getChannelId(message) == 0) {
            if (message2 != null) {
                this.botKeyboardsByMids.e(message2.id);
            }
            this.botKeyboardsByMids.k(topicKey, message.id);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, message, topicKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putDiceStickersToCache$90(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, int i9) {
        try {
            if (tL_messages_stickerSet == null) {
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("UPDATE stickers_dice SET date = ?");
                executeFast.requery();
                executeFast.bindInteger(1, i9);
                executeFast.step();
                executeFast.dispose();
                return;
            }
            SQLitePreparedStatement executeFast2 = getMessagesStorage().getDatabase().executeFast("REPLACE INTO stickers_dice VALUES(?, ?, ?)");
            executeFast2.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
            tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
            executeFast2.bindString(1, str);
            executeFast2.bindByteBuffer(2, nativeByteBuffer);
            executeFast2.bindInteger(3, i9);
            executeFast2.step();
            nativeByteBuffer.reuse();
            executeFast2.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putEmojiKeywords$214(String str) {
        this.currentFetchingEmoji.remove(str);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newEmojiSuggestionsAvailable, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putEmojiKeywords$215(TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference, String str) {
        try {
            if (!tL_emojiKeywordsDifference.keywords.isEmpty()) {
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO emoji_keywords_v2 VALUES(?, ?, ?)");
                SQLitePreparedStatement executeFast2 = getMessagesStorage().getDatabase().executeFast("DELETE FROM emoji_keywords_v2 WHERE lang = ? AND keyword = ? AND emoji = ?");
                getMessagesStorage().getDatabase().beginTransaction();
                int size = tL_emojiKeywordsDifference.keywords.size();
                for (int i9 = 0; i9 < size; i9++) {
                    TLRPC.EmojiKeyword emojiKeyword = tL_emojiKeywordsDifference.keywords.get(i9);
                    if (emojiKeyword instanceof TLRPC.TL_emojiKeyword) {
                        TLRPC.TL_emojiKeyword tL_emojiKeyword = (TLRPC.TL_emojiKeyword) emojiKeyword;
                        String lowerCase = tL_emojiKeyword.keyword.toLowerCase();
                        int size2 = tL_emojiKeyword.emoticons.size();
                        for (int i10 = 0; i10 < size2; i10++) {
                            executeFast.requery();
                            executeFast.bindString(1, tL_emojiKeywordsDifference.lang_code);
                            executeFast.bindString(2, lowerCase);
                            executeFast.bindString(3, tL_emojiKeyword.emoticons.get(i10));
                            executeFast.step();
                        }
                    } else if (emojiKeyword instanceof TLRPC.TL_emojiKeywordDeleted) {
                        TLRPC.TL_emojiKeywordDeleted tL_emojiKeywordDeleted = (TLRPC.TL_emojiKeywordDeleted) emojiKeyword;
                        String lowerCase2 = tL_emojiKeywordDeleted.keyword.toLowerCase();
                        int size3 = tL_emojiKeywordDeleted.emoticons.size();
                        for (int i11 = 0; i11 < size3; i11++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, tL_emojiKeywordsDifference.lang_code);
                            executeFast2.bindString(2, lowerCase2);
                            executeFast2.bindString(3, tL_emojiKeywordDeleted.emoticons.get(i11));
                            executeFast2.step();
                        }
                    }
                }
                getMessagesStorage().getDatabase().commitTransaction();
                executeFast.dispose();
                executeFast2.dispose();
            }
            SQLitePreparedStatement executeFast3 = getMessagesStorage().getDatabase().executeFast("REPLACE INTO emoji_keywords_info_v2 VALUES(?, ?, ?, ?)");
            executeFast3.bindString(1, str);
            executeFast3.bindString(2, tL_emojiKeywordsDifference.lang_code);
            executeFast3.bindInteger(3, tL_emojiKeywordsDifference.version);
            executeFast3.bindLong(4, System.currentTimeMillis());
            executeFast3.step();
            executeFast3.dispose();
            AndroidUtilities.runOnUIThread(new y7(this, str, 1));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putFeaturedStickersToCache$64(ArrayList arrayList, ArrayList arrayList2, boolean z10, int i9, long j10, boolean z11) {
        try {
            if (arrayList == null) {
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("UPDATE stickers_featured SET date = ? WHERE id = ? AND emoji = ?");
                executeFast.requery();
                executeFast.bindInteger(1, i9);
                executeFast.bindInteger(2, z10 ? 2 : 1);
                executeFast.bindInteger(3, z10 ? 1 : 0);
                executeFast.step();
                executeFast.dispose();
                return;
            }
            SQLitePreparedStatement executeFast2 = getMessagesStorage().getDatabase().executeFast("REPLACE INTO stickers_featured VALUES(?, ?, ?, ?, ?, ?, ?)");
            executeFast2.requery();
            int i10 = 4;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                i10 += ((TLRPC.StickerSetCovered) arrayList.get(i11)).getObjectSize();
            }
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i10);
            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer((arrayList2.size() * 8) + 4);
            nativeByteBuffer.writeInt32(arrayList.size());
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((TLRPC.StickerSetCovered) arrayList.get(i12)).serializeToStream(nativeByteBuffer);
            }
            nativeByteBuffer2.writeInt32(arrayList2.size());
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                nativeByteBuffer2.writeInt64(((Long) arrayList2.get(i13)).longValue());
            }
            executeFast2.bindInteger(1, z10 ? 2 : 1);
            executeFast2.bindByteBuffer(2, nativeByteBuffer);
            executeFast2.bindByteBuffer(3, nativeByteBuffer2);
            executeFast2.bindInteger(4, i9);
            executeFast2.bindLong(5, j10);
            executeFast2.bindInteger(6, z11 ? 1 : 0);
            executeFast2.bindInteger(7, z10 ? 1 : 0);
            executeFast2.step();
            nativeByteBuffer.reuse();
            nativeByteBuffer2.reuse();
            executeFast2.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putMediaCountDatabase$138(long j10, long j11, int i9, int i10) {
        int i11;
        try {
            SQLitePreparedStatement executeFast = j10 != 0 ? getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_counts_topics VALUES(?, ?, ?, ?, ?)") : getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_counts_v2 VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j11);
            if (j10 != 0) {
                executeFast.bindLong(2, j10);
                i11 = 3;
            } else {
                i11 = 2;
            }
            executeFast.bindInteger(i11, i9);
            executeFast.bindInteger(i11 + 1, i10);
            executeFast.bindInteger(i11 + 2, 0);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0061 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:46:0x0004, B:50:0x0010, B:4:0x002a, B:6:0x003b, B:7:0x0058, B:10:0x0061, B:17:0x006f, B:19:0x008f, B:20:0x0093, B:23:0x00b0, B:27:0x0108, B:39:0x00d3, B:41:0x00e8, B:42:0x00f8, B:43:0x00c3, B:44:0x004a), top: B:45:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:46:0x0004, B:50:0x0010, B:4:0x002a, B:6:0x003b, B:7:0x0058, B:10:0x0061, B:17:0x006f, B:19:0x008f, B:20:0x0093, B:23:0x00b0, B:27:0x0108, B:39:0x00d3, B:41:0x00e8, B:42:0x00f8, B:43:0x00c3, B:44:0x004a), top: B:45:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004a A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:46:0x0004, B:50:0x0010, B:4:0x002a, B:6:0x003b, B:7:0x0058, B:10:0x0061, B:17:0x006f, B:19:0x008f, B:20:0x0093, B:23:0x00b0, B:27:0x0108, B:39:0x00d3, B:41:0x00e8, B:42:0x00f8, B:43:0x00c3, B:44:0x004a), top: B:45:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003b A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:46:0x0004, B:50:0x0010, B:4:0x002a, B:6:0x003b, B:7:0x0058, B:10:0x0061, B:17:0x006f, B:19:0x008f, B:20:0x0093, B:23:0x00b0, B:27:0x0108, B:39:0x00d3, B:41:0x00e8, B:42:0x00f8, B:43:0x00c3, B:44:0x004a), top: B:45:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$putMediaDatabase$140(int i9, ArrayList arrayList, boolean z10, long j10, int i10, int i11, long j11) {
        long j12;
        int size;
        int i12;
        if (i9 == 0) {
            try {
                if (!arrayList.isEmpty()) {
                    if (z10) {
                    }
                }
                j12 = j11;
                getMessagesStorage().doneHolesInMedia(j10, i10, i11, j12);
                if (arrayList.isEmpty()) {
                    return;
                }
                getMessagesStorage().getDatabase().beginTransaction();
                SQLitePreparedStatement executeFast = j12 == 0 ? getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_topics VALUES(?, ?, ?, ?, ?, ?)") : getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_v4 VALUES(?, ?, ?, ?, ?)");
                size = arrayList.size();
                i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    TLRPC.Message message = (TLRPC.Message) obj;
                    if (canAddMessageToMedia(message)) {
                        executeFast.requery();
                        MessageObject.normalizeFlags(message);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                        message.serializeToStream(nativeByteBuffer);
                        executeFast.bindInteger(1, message.id);
                        executeFast.bindLong(2, j10);
                        int i13 = 3;
                        if (j12 != 0) {
                            executeFast.bindLong(3, j12);
                            i13 = 4;
                        }
                        executeFast.bindInteger(i13, message.date);
                        executeFast.bindInteger(i13 + 1, i11);
                        executeFast.bindByteBuffer(i13 + 2, nativeByteBuffer);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                    }
                }
                executeFast.dispose();
                if (z10 || i10 != 0 || i9 != 0) {
                    int i14 = (z10 || i9 != 0) ? ((TLRPC.Message) arrayList.get(arrayList.size() - 1)).id : 1;
                    if (i9 == 0) {
                        getMessagesStorage().closeHolesInMedia(j10, i14, ((TLRPC.Message) arrayList.get(0)).id, i11, j12);
                    } else if (i10 != 0) {
                        getMessagesStorage().closeHolesInMedia(j10, i14, i10, i11, j11);
                    } else {
                        getMessagesStorage().closeHolesInMedia(j10, i14, ConnectionsManager.DEFAULT_DATACENTER_ID, i11, j11);
                    }
                }
                getMessagesStorage().getDatabase().commitTransaction();
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        j12 = j11;
        getMessagesStorage().getDatabase().beginTransaction();
        if (j12 == 0) {
        }
        size = arrayList.size();
        i12 = 0;
        while (i12 < size) {
        }
        executeFast.dispose();
        if (z10) {
        }
        if (z10) {
        }
        if (i9 == 0) {
        }
        getMessagesStorage().getDatabase().commitTransaction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putMenuBotsToCache$6(TLRPC.TL_attachMenuBots tL_attachMenuBots, long j10, int i9) {
        try {
            if (tL_attachMenuBots == null) {
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("UPDATE attach_menu_bots SET date = ?");
                executeFast.requery();
                executeFast.bindLong(1, i9);
                executeFast.step();
                executeFast.dispose();
                return;
            }
            getMessagesStorage().getDatabase().executeFast("DELETE FROM attach_menu_bots").stepThis().dispose();
            SQLitePreparedStatement executeFast2 = getMessagesStorage().getDatabase().executeFast("REPLACE INTO attach_menu_bots VALUES(?, ?, ?)");
            executeFast2.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_attachMenuBots.getObjectSize());
            tL_attachMenuBots.serializeToStream(nativeByteBuffer);
            executeFast2.bindByteBuffer(1, nativeByteBuffer);
            executeFast2.bindLong(2, j10);
            executeFast2.bindInteger(3, i9);
            executeFast2.step();
            nativeByteBuffer.reuse();
            executeFast2.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putPremiumPromoToCache$10(TLRPC.TL_help_premiumPromo tL_help_premiumPromo, int i9) {
        try {
            if (tL_help_premiumPromo == null) {
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("UPDATE premium_promo SET date = ?");
                executeFast.requery();
                executeFast.bindInteger(1, i9);
                executeFast.step();
                executeFast.dispose();
                return;
            }
            getMessagesStorage().getDatabase().executeFast("DELETE FROM premium_promo").stepThis().dispose();
            SQLitePreparedStatement executeFast2 = getMessagesStorage().getDatabase().executeFast("REPLACE INTO premium_promo VALUES(?, ?)");
            executeFast2.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_help_premiumPromo.getObjectSize());
            tL_help_premiumPromo.serializeToStream(nativeByteBuffer);
            executeFast2.bindByteBuffer(1, nativeByteBuffer);
            executeFast2.bindInteger(2, i9);
            executeFast2.step();
            nativeByteBuffer.reuse();
            executeFast2.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putReactionsToCache$16(ArrayList arrayList, int i9, int i10) {
        try {
            if (arrayList == null) {
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("UPDATE reactions SET date = ?");
                executeFast.requery();
                executeFast.bindLong(1, i10);
                executeFast.step();
                executeFast.dispose();
                return;
            }
            getMessagesStorage().getDatabase().executeFast("DELETE FROM reactions").stepThis().dispose();
            SQLitePreparedStatement executeFast2 = getMessagesStorage().getDatabase().executeFast("REPLACE INTO reactions VALUES(?, ?, ?)");
            executeFast2.requery();
            int i11 = 4;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                i11 += ((TLRPC.TL_availableReaction) arrayList.get(i12)).getObjectSize();
            }
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i11);
            nativeByteBuffer.writeInt32(arrayList.size());
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((TLRPC.TL_availableReaction) arrayList.get(i13)).serializeToStream(nativeByteBuffer);
            }
            executeFast2.bindByteBuffer(1, nativeByteBuffer);
            executeFast2.bindInteger(2, i9);
            executeFast2.bindInteger(3, i10);
            executeFast2.step();
            nativeByteBuffer.reuse();
            executeFast2.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putSetToCache$47(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindString(1, "s_" + tL_messages_stickerSet.set.id);
            executeFast.bindInteger(2, 6);
            executeFast.bindString(3, "");
            executeFast.bindString(4, "");
            executeFast.bindString(5, "");
            executeFast.bindInteger(6, 0);
            executeFast.bindInteger(7, 0);
            executeFast.bindInteger(8, 0);
            executeFast.bindInteger(9, 0);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
            tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(10, nativeByteBuffer);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putStickersToCache$102(ArrayList arrayList, int i9, int i10, long j10) {
        try {
            if (arrayList == null) {
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("UPDATE stickers_v2 SET date = ?");
                executeFast.requery();
                executeFast.bindLong(1, i10);
                executeFast.step();
                executeFast.dispose();
                return;
            }
            SQLitePreparedStatement executeFast2 = getMessagesStorage().getDatabase().executeFast("REPLACE INTO stickers_v2 VALUES(?, ?, ?, ?)");
            executeFast2.requery();
            int i11 = 4;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                i11 += ((TLRPC.TL_messages_stickerSet) arrayList.get(i12)).getObjectSize();
            }
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i11);
            nativeByteBuffer.writeInt32(arrayList.size());
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((TLRPC.TL_messages_stickerSet) arrayList.get(i13)).serializeToStream(nativeByteBuffer);
            }
            executeFast2.bindInteger(1, i9 + 1);
            executeFast2.bindByteBuffer(2, nativeByteBuffer);
            executeFast2.bindInteger(3, i10);
            executeFast2.bindLong(4, j10);
            executeFast2.step();
            nativeByteBuffer.reuse();
            executeFast2.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeMultipleStickerSets$110(boolean[] zArr, ArrayList arrayList, int i9, int[] iArr) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            markSetUninstalling(((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.id, false);
            ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.archived = false;
            this.stickerSets[i9].add(iArr[i10], (TLRPC.TL_messages_stickerSet) arrayList.get(i10));
            this.stickerSetsById.k((TLRPC.TL_messages_stickerSet) arrayList.get(i10), ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.id);
            this.installedStickerSetsById.k((TLRPC.TL_messages_stickerSet) arrayList.get(i10), ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.id);
            this.stickerSetsByName.put(((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.short_name, (TLRPC.TL_messages_stickerSet) arrayList.get(i10));
            this.removingStickerSetsUndos.l(((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.id);
        }
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList2 = this.stickerSets[i9];
        int i11 = this.loadDate[i9];
        long[] jArr = this.loadHash;
        long calcStickersHash = calcStickersHash(arrayList2);
        jArr[i9] = calcStickersHash;
        putStickersToCache(i9, arrayList2, i11, calcStickersHash);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i9), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeMultipleStickerSets$111(boolean[] zArr, ArrayList arrayList, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i9) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            toggleStickerSetInternal(context, 0, o2Var, null, true, (TLObject) arrayList.get(i10), ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set, null, i9, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeRecentGif$24(TLRPC.TL_messages_saveGif tL_messages_saveGif, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text)) {
            return;
        }
        getFileRefController().requestReference("gif", tL_messages_saveGif);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeRecentGif$25(TLRPC.Document document) {
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.id + "' AND type = 2").stepThis().dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$reorderStickers$54(ArrayList arrayList, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet2) {
        int indexOf = arrayList.indexOf(Long.valueOf(tL_messages_stickerSet.set.id));
        int indexOf2 = arrayList.indexOf(Long.valueOf(tL_messages_stickerSet2.set.id));
        if (indexOf > indexOf2) {
            return 1;
        }
        return indexOf < indexOf2 ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$replaceStickerSet$28(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        a0.h stickerByIds = getStickerByIds(4);
        for (int i9 = 0; i9 < tL_messages_stickerSet.documents.size(); i9++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i9);
            stickerByIds.k(document, document.id);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveDraft$189(long j10, long j11, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            if (messages_messages.messages.isEmpty()) {
                return;
            }
            saveDraftReplyMessage(j10, j11, messages_messages.messages.get(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveDraft$190(long j10, long j11, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            if (messages_messages.messages.isEmpty()) {
                return;
            }
            saveDraftReplyMessage(j10, j11, messages_messages.messages.get(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveDraft$191(int i9, long j10, long j11, final long j12, final long j13) {
        TLRPC.Message message;
        NativeByteBuffer byteBufferValue;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT data, replydata FROM messages_v2 WHERE mid = " + i9 + " and uid = " + j10, new Object[0]);
            TLRPC.Message message2 = null;
            if (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(0);
                if (byteBufferValue2 != null) {
                    message = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                    message.readAttachPath(byteBufferValue2, getUserConfig().clientUserId);
                    byteBufferValue2.reuse();
                } else {
                    message = null;
                }
                if (message != null) {
                    ArrayList<Long> arrayList = new ArrayList<>();
                    ArrayList<Long> arrayList2 = new ArrayList<>();
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    try {
                        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
                        if (messageReplyHeader != null && messageReplyHeader.reply_to_msg_id != 0) {
                            if (!queryFinalized.isNull(1) && (byteBufferValue = queryFinalized.byteBufferValue(1)) != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                message.replyMessage = TLdeserialize;
                                TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                                byteBufferValue.reuse();
                                TLRPC.Message message3 = message.replyMessage;
                                if (message3 != null) {
                                    MessagesStorage.addUsersAndChatsFromMessage(message3, arrayList, arrayList2, null);
                                }
                            }
                            if (message.replyMessage == null) {
                                MessagesStorage.addReplyMessages(message, hVar, hVar2);
                            }
                        }
                    } catch (Exception e10) {
                        getMessagesStorage().checkSQLException(e10);
                    }
                    getMessagesStorage().loadReplyMessages(hVar, hVar2, arrayList, arrayList2, 0);
                }
                message2 = message;
            }
            queryFinalized.dispose();
            if (message2 != null) {
                saveDraftReplyMessage(j12, j13, message2);
                return;
            }
            if (j11 == 0) {
                TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                tL_messages_getMessages.id.add(Integer.valueOf(i9));
                final int i10 = 1;
                getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate(this) { // from class: org.telegram.messenger.n8
                    public final /* synthetic */ MediaDataController b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i10) {
                            case 0:
                                this.b.lambda$saveDraft$189(j12, j13, tLObject, tL_error);
                                break;
                            default:
                                this.b.lambda$saveDraft$190(j12, j13, tLObject, tL_error);
                                break;
                        }
                    }
                });
                return;
            }
            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
            tL_channels_getMessages.channel = getMessagesController().getInputChannel(j11);
            tL_channels_getMessages.id.add(Integer.valueOf(i9));
            final int i11 = 0;
            getConnectionsManager().sendRequest(tL_channels_getMessages, new RequestDelegate(this) { // from class: org.telegram.messenger.n8
                public final /* synthetic */ MediaDataController b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            this.b.lambda$saveDraft$189(j12, j13, tLObject, tL_error);
                            break;
                        default:
                            this.b.lambda$saveDraft$190(j12, j13, tLObject, tL_error);
                            break;
                    }
                }
            });
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveDraftReplyMessage$192(long j10, long j11, TLRPC.Message message) {
        TLRPC.InputReplyTo inputReplyTo;
        String sb2;
        a0.h hVar = (a0.h) this.drafts.f(j10);
        TLRPC.DraftMessage draftMessage = hVar != null ? (TLRPC.DraftMessage) hVar.f(j11) : null;
        if (draftMessage == null || (inputReplyTo = draftMessage.reply_to) == null || inputReplyTo.reply_to_msg_id != message.id) {
            return;
        }
        a0.h hVar2 = (a0.h) this.draftMessages.f(j10);
        if (hVar2 == null) {
            hVar2 = new a0.h();
            this.draftMessages.k(hVar2, j10);
        }
        hVar2.k(message, j11);
        SerializedData serializedData = new SerializedData(message.getObjectSize());
        message.serializeToStream(serializedData);
        SharedPreferences.Editor edit = this.draftPreferences.edit();
        if (j11 == 0) {
            sb2 = aa.d.m(j10, "r_");
        } else {
            StringBuilder s10 = aa.d.s(j10, "rt_", "_");
            s10.append(j11);
            sb2 = s10.toString();
        }
        edit.putString(sb2, Utilities.bytesToHex(serializedData.toByteArray())).commit();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newDraftReceived, Long.valueOf(j10));
        serializedData.cleanup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$savePeer$158(long j10, int i9, double d) {
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j10);
            executeFast.bindInteger(2, i9);
            executeFast.bindDouble(3, d);
            executeFast.bindInteger(4, ((int) System.currentTimeMillis()) / MAX_STYLE_RUNS_COUNT);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$savePinnedMessages$166(ArrayList arrayList, long j10) {
        try {
            getMessagesStorage().getDatabase().beginTransaction();
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO chat_pinned_v2 VALUES(?, ?, ?)");
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i9);
                MessageObject.normalizeFlags(message);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                message.serializeToStream(nativeByteBuffer);
                executeFast.requery();
                executeFast.bindLong(1, j10);
                executeFast.bindInteger(2, message.id);
                executeFast.bindByteBuffer(3, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
            }
            executeFast.dispose();
            getMessagesStorage().getDatabase().commitTransaction();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveReplyMessages$178(boolean z10, ArrayList arrayList, a0.h hVar) {
        SQLitePreparedStatement executeFast;
        SQLitePreparedStatement executeFast2;
        ArrayList arrayList2;
        try {
            getMessagesStorage().getDatabase().beginTransaction();
            if (z10) {
                executeFast = getMessagesStorage().getDatabase().executeFast("UPDATE scheduled_messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                executeFast2 = null;
            } else {
                executeFast = getMessagesStorage().getDatabase().executeFast("UPDATE messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                executeFast2 = getMessagesStorage().getDatabase().executeFast("UPDATE messages_topics SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
            }
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i9);
                SparseArray sparseArray = (SparseArray) hVar.f(MessageObject.getDialogId(message));
                if (sparseArray != null && (arrayList2 = (ArrayList) sparseArray.get(message.id)) != null) {
                    MessageObject.normalizeFlags(message);
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                    message.serializeToStream(nativeByteBuffer);
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        MessageObject messageObject = (MessageObject) arrayList2.get(i10);
                        int i11 = 0;
                        while (i11 < 2) {
                            SQLitePreparedStatement sQLitePreparedStatement = i11 == 0 ? executeFast : executeFast2;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                                sQLitePreparedStatement.bindInteger(2, message.id);
                                sQLitePreparedStatement.bindInteger(3, messageObject.getId());
                                sQLitePreparedStatement.bindLong(4, messageObject.getDialogId());
                                sQLitePreparedStatement.step();
                            }
                            i11++;
                        }
                    }
                    nativeByteBuffer.reuse();
                }
            }
            executeFast.dispose();
            if (executeFast2 != null) {
                executeFast2.dispose();
            }
            getMessagesStorage().getDatabase().commitTransaction();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveStickerSetIntoCache$40(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO stickersets2 VALUES(?, ?, ?, ?, ?)");
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
            tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, tL_messages_stickerSet.set.id);
            executeFast.bindByteBuffer(2, nativeByteBuffer);
            executeFast.bindInteger(3, tL_messages_stickerSet.set.hash);
            executeFast.bindLong(4, System.currentTimeMillis());
            String str = tL_messages_stickerSet.set.short_name;
            executeFast.bindString(5, str == null ? "" : str.toLowerCase());
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveToRingtones$203(TLObject tLObject, TLRPC.Document document) {
        if (tLObject != null) {
            if (tLObject instanceof TL_account.TL_savedRingtoneConverted) {
                this.ringtoneDataStore.a(((TL_account.TL_savedRingtoneConverted) tLObject).document);
            } else {
                this.ringtoneDataStore.a(document);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveToRingtones$204(TLRPC.Document document, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new x8(this, tLObject, document, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$searchMessagesInChat$120(long j10, TLObject tLObject, TLRPC.TL_messages_search tL_messages_search, long j11, int i9, int i10, long j12, TLRPC.User user, TLRPC.Chat chat, boolean z10, hg.r0 r0Var) {
        if (this.lastMergeDialogId == j10) {
            this.mergeReqId = 0;
            if (tLObject == null) {
                this.messagesSearchEndReached[1] = true;
                this.messagesSearchCount[1] = 0;
                searchMessagesInChat(tL_messages_search.q, j11, j10, i9, i10, j12, true, user, chat, z10, r0Var);
            } else {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                this.messagesSearchEndReached[1] = messages_messages.messages.isEmpty();
                this.messagesSearchCount[1] = messages_messages instanceof TLRPC.TL_messages_messagesSlice ? messages_messages.count : messages_messages.messages.size();
                searchMessagesInChat(tL_messages_search.q, j11, j10, i9, i10, j12, true, user, chat, z10, r0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$searchMessagesInChat$121(final long j10, final TLRPC.TL_messages_search tL_messages_search, final long j11, final int i9, final int i10, final long j12, final TLRPC.User user, final TLRPC.Chat chat, final boolean z10, final hg.r0 r0Var, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.b8
            @Override // java.lang.Runnable
            public final void run() {
                MediaDataController.this.lambda$searchMessagesInChat$120(j10, tLObject, tL_messages_search, j11, i9, i10, j12, user, chat, z10, r0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$searchMessagesInChat$122(int i9, int i10, int i11, long j10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        if (i9 == this.lastReqId) {
            this.loadedPredirectedSearchLocal = arrayList.size() == i10;
            this.loadingSearchLocal = false;
            getMessagesController().putUsers(arrayList2, true);
            getMessagesController().putChats(arrayList3, true);
            org.telegram.ui.Components.k5.h(this.currentAccount).d(arrayList4);
            this.searchLocalResultMessages = arrayList;
            updateSearchResults();
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i11), 0, Integer.valueOf(getMask()), Long.valueOf(j10), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$searchMessagesInChat$123(TLRPC.TL_messages_search tL_messages_search, long j10, long j11, int i9, TLRPC.messages_Messages messages_messages, ArrayList arrayList, boolean z10, boolean z11, long j12, long j13, TLRPC.User user, TLRPC.Chat chat) {
        char c10;
        if (tL_messages_search.offset_id == 0 && j10 == j11) {
            this.lastReturnedNum = 0;
            this.searchServerResultMessages.clear();
            this.searchServerResultMessagesMap[0].clear();
            this.searchServerResultMessagesMap[1].clear();
            this.messagesSearchCount[0] = 0;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsLoading, Integer.valueOf(i9));
        }
        int min = Math.min(messages_messages.messages.size(), tL_messages_search.limit - 1);
        int i10 = 0;
        boolean z12 = false;
        while (i10 < min) {
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            this.searchServerResultMessages.add(messageObject);
            this.searchServerResultMessagesMap[j10 == j11 ? (char) 0 : (char) 1].put(messageObject.getId(), messageObject);
            i10++;
            z12 = true;
        }
        updateSearchResults();
        this.messagesSearchEndReached[j10 == j11 ? (char) 0 : (char) 1] = messages_messages.messages.size() < tL_messages_search.limit;
        this.messagesSearchCount[j10 == j11 ? (char) 0 : (char) 1] = ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) || (messages_messages instanceof TLRPC.TL_messages_channelMessages)) ? messages_messages.count : messages_messages.messages.size();
        if (this.searchServerResultMessages.isEmpty()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i9), 0, Integer.valueOf(getMask()), 0L, 0, 0, Boolean.valueOf(z10));
        } else if (z12) {
            if (this.lastReturnedNum >= this.searchResultMessages.size()) {
                this.lastReturnedNum = this.searchResultMessages.size() - 1;
            }
            MessageObject messageObject2 = this.searchResultMessages.get(this.lastReturnedNum);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i9), Integer.valueOf(messageObject2.getId()), Integer.valueOf(getMask()), Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.valueOf(z10));
        } else if (z11) {
            c10 = 0;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i9), 0, Integer.valueOf(getMask()), Long.valueOf(j11), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.FALSE);
            if (j10 != j11) {
                boolean[] zArr = this.messagesSearchEndReached;
                if (!zArr[c10] || j12 == 0 || zArr[1]) {
                    return;
                }
                searchMessagesInChat(this.lastSearchQuery, j11, j12, i9, 0, j13, true, user, chat, z10, this.lastReaction);
                return;
            }
            return;
        }
        c10 = 0;
        if (j10 != j11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$searchMessagesInChat$124(int i9, final boolean z10, TLObject tLObject, final TLRPC.TL_messages_search tL_messages_search, final long j10, final long j11, final int i10, final ArrayList arrayList, final boolean z11, final long j12, final long j13, final TLRPC.User user, final TLRPC.Chat chat) {
        if (i9 == this.lastReqId) {
            this.reqId = 0;
            if (!z10) {
                this.loadingMoreSearchMessages = false;
            }
            if (tLObject != null) {
                final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                int i11 = 0;
                while (i11 < messages_messages.messages.size()) {
                    TLRPC.Message message = messages_messages.messages.get(i11);
                    if ((message instanceof TLRPC.TL_messageEmpty) || (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                        messages_messages.messages.remove(i11);
                        i11--;
                    }
                    i11++;
                }
                getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                getMessagesController().putUsers(messages_messages.users, false);
                getMessagesController().putChats(messages_messages.chats, false);
                Runnable runnable = new Runnable() { // from class: org.telegram.messenger.a9
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaDataController.this.lambda$searchMessagesInChat$123(tL_messages_search, j10, j11, i10, messages_messages, arrayList, z10, z11, j12, j13, user, chat);
                    }
                };
                if (z11) {
                    loadReplyMessagesForMessages(arrayList, j11, 0, this.lastReplyMessageId, runnable, i10, null);
                } else {
                    runnable.run();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$searchMessagesInChat$125(TLRPC.TL_messages_search tL_messages_search, final boolean z10, String str, boolean z11, final int i9, final boolean z12, final long j10, final long j11, final int i10, final long j12, final long j13, final TLRPC.User user, final TLRPC.Chat chat, final TLObject tLObject, TLRPC.TL_error tL_error) {
        final TLRPC.TL_messages_search tL_messages_search2;
        final ArrayList arrayList = new ArrayList();
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            tL_messages_search2 = tL_messages_search;
            int min = Math.min(messages_messages.messages.size(), tL_messages_search2.limit - 1);
            for (int i11 = 0; i11 < min; i11++) {
                MessageObject messageObject = new MessageObject(this.currentAccount, messages_messages.messages.get(i11), null, null, null, null, null, true, true, 0L, false, false, z10);
                if (messageObject.hasValidGroupId()) {
                    messageObject.isPrimaryGroupMessage = true;
                }
                messageObject.setQuery(str, !z11);
                arrayList.add(messageObject);
            }
        } else {
            tL_messages_search2 = tL_messages_search;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.d8
            @Override // java.lang.Runnable
            public final void run() {
                MediaDataController.this.lambda$searchMessagesInChat$124(i9, z12, tLObject, tL_messages_search2, j10, j11, i10, arrayList, z10, j12, j13, user, chat);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$searchStickerSets$249(Utilities.Callback callback, TLRPC.messages_FoundStickerSets messages_foundstickersets, TLRPC.TL_error tL_error) {
        if (messages_foundstickersets instanceof TLRPC.TL_messages_foundStickerSets) {
            callback.run(((TLRPC.TL_messages_foundStickerSets) messages_foundstickersets).sets);
        } else {
            callback.run(new ArrayList());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$searchStickers$247(SearchStickersKey searchStickersKey, SearchStickersResult searchStickersResult, Utilities.Callback callback, TLRPC.messages_FoundStickers messages_foundstickers, TLRPC.TL_error tL_error) {
        this.loadingSearchStickersKeys.remove(searchStickersKey);
        if (searchStickersResult == null) {
            searchStickersResult = new SearchStickersResult(null);
        }
        if (messages_foundstickers instanceof TLRPC.TL_messages_foundStickers) {
            searchStickersResult.apply((TLRPC.TL_messages_foundStickers) messages_foundstickers);
        }
        this.searchStickerResults.put(searchStickersKey, searchStickersResult);
        callback.run(searchStickersResult.documents);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$searchStickers$248(SearchStickersKey searchStickersKey, SearchStickersResult searchStickersResult, Utilities.Callback callback, ArrayList arrayList, String str) {
        if (this.loadingSearchStickersKeys.containsKey(searchStickersKey)) {
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                KeywordResult keywordResult = (KeywordResult) obj;
                if (!TextUtils.isEmpty(keywordResult.emoji) && !keywordResult.emoji.startsWith("animated_")) {
                    sb2.append(keywordResult.emoji);
                }
            }
            TLRPC.TL_messages_searchStickers tL_messages_searchStickers = new TLRPC.TL_messages_searchStickers();
            tL_messages_searchStickers.emojis = searchStickersKey.emojis;
            if (!TextUtils.isEmpty(searchStickersKey.lang_code)) {
                tL_messages_searchStickers.lang_code.add(searchStickersKey.lang_code);
            }
            tL_messages_searchStickers.emoticon = sb2.toString();
            tL_messages_searchStickers.q = searchStickersKey.q;
            tL_messages_searchStickers.limit = 100;
            tL_messages_searchStickers.offset = searchStickersResult != null ? searchStickersResult.next_offset.intValue() : 0;
            this.loadingSearchStickersKeys.put(searchStickersKey, Integer.valueOf(getConnectionsManager().sendRequestTyped(tL_messages_searchStickers, new a(), new y3(this, searchStickersKey, searchStickersResult, callback, 1))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setPlaceholderImage$31(String str, org.telegram.ui.Components.o9 o9Var, String str2, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        int i9;
        if (tL_messages_stickerSet == null) {
            return;
        }
        ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(str);
        for (int i10 = 0; i10 < parseEmojis.size(); i10++) {
            parseEmojis.get(i10).code = Emoji.fixEmoji(parseEmojis.get(i10).code.toString());
        }
        int i11 = 0;
        loop1: while (true) {
            if (i11 >= tL_messages_stickerSet.documents.size()) {
                document = null;
                break;
            }
            document = tL_messages_stickerSet.documents.get(i11);
            int size = parseEmojis.size();
            int i12 = 0;
            while (i12 < size) {
                Emoji.EmojiSpanRange emojiSpanRange = parseEmojis.get(i12);
                i12++;
                Emoji.EmojiSpanRange emojiSpanRange2 = emojiSpanRange;
                while (i9 < tL_messages_stickerSet.packs.size()) {
                    i9 = (tL_messages_stickerSet.packs.get(i9).documents.contains(Long.valueOf(document.id)) && TextUtils.equals(Emoji.fixEmoji(tL_messages_stickerSet.packs.get(i9).emoticon), emojiSpanRange2.code)) ? 0 : i9 + 1;
                }
            }
            break loop1;
            i11++;
        }
        if (document != null) {
            o9Var.n(ImageLocation.getForDocument(document), str2, DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.f6.m6, 0.2f, 1.0f, null), document);
            o9Var.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$160(TLRPC.MessageEntity messageEntity, TLRPC.MessageEntity messageEntity2) {
        int i9 = messageEntity.offset;
        int i10 = messageEntity2.offset;
        if (i9 > i10) {
            return 1;
        }
        return i9 < i10 ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleStickerSet$108(boolean[] zArr, TLRPC.StickerSet stickerSet, int i9, int i10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        markSetUninstalling(stickerSet.id, false);
        stickerSet.archived = false;
        this.stickerSets[i9].add(i10, tL_messages_stickerSet);
        this.stickerSetsById.k(tL_messages_stickerSet, stickerSet.id);
        this.installedStickerSetsById.k(tL_messages_stickerSet, stickerSet.id);
        String str = stickerSet.short_name;
        if (str != null) {
            this.stickerSetsByName.put(str.toLowerCase(), tL_messages_stickerSet);
        }
        this.removingStickerSetsUndos.l(stickerSet.id);
        this.loadHash[i9] = calcStickersHash(this.stickerSets[i9]);
        putStickersToCache(i9, this.stickerSets[i9], this.loadDate[i9], this.loadHash[i9]);
        if (runnable != null) {
            runnable.run();
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i9), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleStickerSet$109(boolean[] zArr, Context context, int i9, org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, boolean z10, TLObject tLObject, TLRPC.StickerSet stickerSet, TLRPC.Document document, int i10) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        toggleStickerSetInternal(context, i9, o2Var, frameLayout, z10, tLObject, stickerSet, document, i10, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleStickerSetInternal$112(TLRPC.StickerSet stickerSet, ArrayList arrayList) {
        markSetInstalling(stickerSet.id, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$toggleStickerSetInternal$113(TLRPC.StickerSet stickerSet, TLObject tLObject, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, int i9, TLRPC.TL_error tL_error, boolean z11, FrameLayout frameLayout, Context context, TLObject tLObject2, TLRPC.Document document) {
        this.removingStickerSetsUndos.l(stickerSet.id);
        if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
            processStickerSetInstallResultArchive(o2Var, z10, i9, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
        }
        loadStickers(i9, false, false, true, new h9(this, stickerSet, 1));
        if (tL_error == null && z11) {
            if (frameLayout != null) {
                org.telegram.ui.Components.gc.f(frameLayout, new iw0(context, tLObject2, 1, 2, document, o2Var.getResourceProvider()), 1500).j();
            } else if (o2Var != null) {
                org.telegram.ui.Components.gc.g(o2Var, new iw0(context, tLObject2, 1, 2, document, o2Var.getResourceProvider()), 1500).j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleStickerSetInternal$114(final TLRPC.StickerSet stickerSet, final org.telegram.ui.ActionBar.o2 o2Var, final boolean z10, final int i9, final boolean z11, final FrameLayout frameLayout, final Context context, final TLObject tLObject, final TLRPC.Document document, final TLObject tLObject2, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.f9
            @Override // java.lang.Runnable
            public final void run() {
                TLObject tLObject3 = tLObject;
                TLRPC.Document document2 = document;
                int i10 = i9;
                Context context2 = context;
                FrameLayout frameLayout2 = frameLayout;
                MediaDataController mediaDataController = this;
                TLObject tLObject4 = tLObject2;
                mediaDataController.lambda$toggleStickerSetInternal$113(stickerSet, tLObject4, o2Var, z10, i10, tL_error, z11, frameLayout2, context2, tLObject3, document2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleStickerSetInternal$115(TLRPC.StickerSet stickerSet, ArrayList arrayList) {
        markSetUninstalling(stickerSet.id, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleStickerSetInternal$116(TLRPC.StickerSet stickerSet, int i9) {
        this.removingStickerSetsUndos.l(stickerSet.id);
        loadStickers(i9, false, true, false, new h9(this, stickerSet, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleStickerSetInternal$117(TLRPC.StickerSet stickerSet, int i9, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new p4(this, stickerSet, i9, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleStickerSets$118(int i9, TLObject tLObject, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, int i10) {
        if (i9 == 0) {
            loadStickers(i10, false, true);
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
            processStickerSetInstallResultArchive(o2Var, z10, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
        }
        loadStickers(i10, false, false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleStickerSets$119(int i9, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new v7(this, i9, tLObject, o2Var, z10, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateBotInfo$202(TL_update.TL_updateBotCommands tL_updateBotCommands, long j10) {
        try {
            TL_bots.BotInfo loadBotInfoInternal = loadBotInfoInternal(tL_updateBotCommands.bot_id, j10);
            if (loadBotInfoInternal != null) {
                loadBotInfoInternal.commands = tL_updateBotCommands.commands;
            }
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(loadBotInfoInternal.getObjectSize());
            loadBotInfoInternal.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, loadBotInfoInternal.user_id);
            executeFast.bindLong(2, j10);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateEmojiStatuses$234(int i9, TL_account.TL_emojiStatuses tL_emojiStatuses) {
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM emoji_statuses WHERE type = " + i9).stepThis().dispose();
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("INSERT INTO emoji_statuses VALUES(?, ?)");
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_emojiStatuses.getObjectSize());
            tL_emojiStatuses.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(1, nativeByteBuffer);
            executeFast.bindInteger(2, i9);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.emojiStatusesFetching[i9] = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$verifyAnimatedStickerMessageInternal$69(String str, TLObject tLObject) {
        char c10;
        ArrayList<TLRPC.Message> arrayList = this.verifyingMessages.get(str);
        if (tLObject != null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            storeTempStickerSet(tL_messages_stickerSet);
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                TLRPC.Message message = arrayList.get(i9);
                TLRPC.Document document = MessageObject.getDocument(message);
                int size2 = tL_messages_stickerSet.documents.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size2) {
                        break;
                    }
                    TLRPC.Document document2 = tL_messages_stickerSet.documents.get(i10);
                    if (document2.id == document.id && document2.dc_id == document.dc_id) {
                        message.stickerVerified = 1;
                        break;
                    }
                    i10++;
                }
                if (message.stickerVerified == 0) {
                    message.stickerVerified = 2;
                }
            }
            c10 = 0;
        } else {
            c10 = 0;
            int size3 = arrayList.size();
            for (int i11 = 0; i11 < size3; i11++) {
                arrayList.get(i11).stickerVerified = 2;
            }
        }
        NotificationCenter notificationCenter = getNotificationCenter();
        int i12 = NotificationCenter.didVerifyMessagesStickers;
        Object[] objArr = new Object[1];
        objArr[c10] = arrayList;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i12, objArr);
        getMessagesStorage().updateMessageVerifyFlags(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$verifyAnimatedStickerMessageInternal$70(String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new j9(this, str, tLObject, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void loadAvatarConstructor(boolean z10) {
        String string;
        long j10;
        TLRPC.TL_emojiList tL_emojiList;
        Throwable th;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("avatar_constructor" + this.currentAccount, 0);
        TLRPC.TL_emojiList tL_emojiList2 = null;
        if (z10) {
            string = sharedPreferences.getString("profile", null);
            j10 = sharedPreferences.getLong("profile_last_check", 0L);
        } else {
            string = sharedPreferences.getString("group", null);
            j10 = sharedPreferences.getLong("group_last_check", 0L);
        }
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                tL_emojiList = (TLRPC.TL_emojiList) TLRPC.EmojiList.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                try {
                    if (z10) {
                        this.profileAvatarConstructorDefault = tL_emojiList;
                    } else {
                        this.groupAvatarConstructorDefault = tL_emojiList;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    FileLog.e(th);
                    tL_emojiList2 = tL_emojiList;
                    if (tL_emojiList2 != null) {
                    }
                    TL_account.getDefaultProfilePhotoEmojis getdefaultprofilephotoemojis = new TL_account.getDefaultProfilePhotoEmojis();
                    if (tL_emojiList2 != null) {
                    }
                    getConnectionsManager().sendRequest(getdefaultprofilephotoemojis, new v0(this, sharedPreferences, z10, 1));
                }
            } catch (Throwable th3) {
                tL_emojiList = null;
                th = th3;
            }
            tL_emojiList2 = tL_emojiList;
        }
        if (tL_emojiList2 != null || System.currentTimeMillis() - j10 > 86400000 || BuildVars.DEBUG_PRIVATE_VERSION) {
            TL_account.getDefaultProfilePhotoEmojis getdefaultprofilephotoemojis2 = new TL_account.getDefaultProfilePhotoEmojis();
            if (tL_emojiList2 != null) {
                getdefaultprofilephotoemojis2.hash = tL_emojiList2.hash;
            }
            getConnectionsManager().sendRequest(getdefaultprofilephotoemojis2, new v0(this, sharedPreferences, z10, 1));
        }
    }

    private TL_bots.BotInfo loadBotInfoInternal(long j10, long j11) {
        TL_bots.BotInfo botInfo;
        NativeByteBuffer byteBufferValue;
        SQLiteDatabase database = getMessagesStorage().getDatabase();
        Locale locale = Locale.US;
        StringBuilder s10 = aa.d.s(j10, "SELECT info FROM bot_info_v2 WHERE uid = ", " AND dialogId = ");
        s10.append(j11);
        SQLiteCursor queryFinalized = database.queryFinalized(s10.toString(), new Object[0]);
        if (!queryFinalized.next() || queryFinalized.isNull(0) || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
            botInfo = null;
        } else {
            botInfo = TL_bots.BotInfo.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
            byteBufferValue.reuse();
        }
        queryFinalized.dispose();
        return botInfo;
    }

    private void loadDraftVoiceMessages() {
        if (this.draftVoicesLoaded) {
            return;
        }
        Set<Map.Entry<String, ?>> entrySet = ApplicationLoader.applicationContext.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).getAll().entrySet();
        this.draftVoices.b();
        for (Map.Entry<String, ?> entry : entrySet) {
            String key = entry.getKey();
            DraftVoice fromString = DraftVoice.fromString((String) entry.getValue());
            if (fromString != null) {
                this.draftVoices.k(fromString, Long.parseLong(key));
            }
        }
        this.draftVoicesLoaded = true;
    }

    private void loadGroupStickerSet(TLRPC.StickerSet stickerSet, boolean z10) {
        if (z10) {
            getMessagesStorage().getStorageQueue().postRunnable(new c2(21, this, stickerSet));
            return;
        }
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
        tL_inputStickerSetID.id = stickerSet.id;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new k7(this, 8));
    }

    private void loadMediaDatabase(long j10, int i9, int i10, int i11, int i12, long j11, hg.r0 r0Var, int i13, boolean z10, int i14, int i15) {
        1 r02 = new 1(i9, j10, i11, j11, i12, r0Var, i10, i13, i14, z10, i15);
        MessagesStorage messagesStorage = getMessagesStorage();
        messagesStorage.getStorageQueue().postRunnable(r02);
        messagesStorage.bindTaskToGuid(r02, i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object, org.telegram.tgnet.TLRPC$Message] */
    /* JADX WARN: Type inference failed for: r22v0, types: [org.telegram.messenger.BaseController, org.telegram.messenger.MediaDataController] */
    /* JADX WARN: Type inference failed for: r4v4, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r6v11, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.StringBuilder] */
    private ArrayList<MessageObject> loadPinnedMessageInternal(long j10, long j11, ArrayList<Integer> arrayList, boolean z10) {
        Object join;
        ArrayList<TLRPC.User> arrayList2;
        ArrayList<TLRPC.Chat> arrayList3;
        try {
            ArrayList<Integer> arrayList4 = new ArrayList<>(arrayList);
            if (j11 != 0) {
                join = new StringBuilder();
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    Integer num = arrayList.get(i9);
                    if (join.length() != 0) {
                        join.append(",");
                    }
                    join.append(num);
                }
            } else {
                join = TextUtils.join(",", arrayList);
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList<TLRPC.User> arrayList6 = new ArrayList<>();
            ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
            ArrayList<Long> arrayList8 = new ArrayList<>();
            ArrayList arrayList9 = new ArrayList();
            long j12 = getUserConfig().clientUserId;
            int i10 = 1;
            ?? r11 = 0;
            ?? queryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT data, mid, date FROM messages_v2 WHERE mid IN (%s) AND uid = %d", join, Long.valueOf(j10)), new Object[0]);
            while (queryFinalized.next()) {
                ?? byteBufferValue = queryFinalized.byteBufferValue(r11);
                if (byteBufferValue != 0) {
                    ?? TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r11), r11);
                    if (!(TLdeserialize.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                        TLdeserialize.readAttachPath(byteBufferValue, j12);
                        TLdeserialize.id = queryFinalized.intValue(i10);
                        TLdeserialize.date = queryFinalized.intValue(2);
                        TLdeserialize.dialog_id = j10;
                        MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize, arrayList8, arrayList9, null);
                        arrayList5.add(TLdeserialize);
                        arrayList4.remove(Integer.valueOf(TLdeserialize.id));
                    }
                    byteBufferValue.reuse();
                }
                r11 = 0;
                i10 = 1;
            }
            queryFinalized.dispose();
            if (!arrayList4.isEmpty()) {
                SQLiteDatabase database = getMessagesStorage().getDatabase();
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized2 = database.queryFinalized("SELECT data FROM chat_pinned_v2 WHERE uid = " + j10 + " AND mid IN (" + TextUtils.join(",", arrayList4) + ")", new Object[0]);
                while (queryFinalized2.next()) {
                    NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(0);
                    if (byteBufferValue2 != null) {
                        TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                        if (!(TLdeserialize2.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                            TLdeserialize2.readAttachPath(byteBufferValue2, j12);
                            TLdeserialize2.dialog_id = j10;
                            MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize2, arrayList8, arrayList9, null);
                            arrayList5.add(TLdeserialize2);
                            arrayList4.remove(Integer.valueOf(TLdeserialize2.id));
                        }
                        byteBufferValue2.reuse();
                    }
                }
                queryFinalized2.dispose();
            }
            if (!arrayList4.isEmpty()) {
                if (j11 != 0) {
                    TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                    tL_channels_getMessages.channel = getMessagesController().getInputChannel(j11);
                    tL_channels_getMessages.id = arrayList4;
                    getConnectionsManager().sendRequest(tL_channels_getMessages, new gh.d2(this, j11, j10, tL_channels_getMessages));
                } else {
                    TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages.id = arrayList4;
                    getConnectionsManager().sendRequest(tL_messages_getMessages, new pk((BaseController) this, j10, tL_messages_getMessages, 2));
                }
            }
            if (arrayList5.isEmpty()) {
                return null;
            }
            try {
                if (arrayList8.isEmpty()) {
                    arrayList2 = arrayList6;
                } else {
                    arrayList2 = arrayList6;
                    getMessagesStorage().getUsersInternal(arrayList8, arrayList2);
                }
                if (arrayList9.isEmpty()) {
                    arrayList3 = arrayList7;
                } else {
                    arrayList3 = arrayList7;
                    getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList9), arrayList3);
                }
                if (z10) {
                    return broadcastPinnedMessage(arrayList5, arrayList2, arrayList3, true, true);
                }
                broadcastPinnedMessage(arrayList5, arrayList2, arrayList3, true, false);
                return null;
            } catch (Exception e10) {
                e = e10;
                FileLog.e(e);
                return null;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public static ArrayList<TLRPC.Reaction> loadReactionsFromPref(SharedPreferences sharedPreferences) {
        int i9 = sharedPreferences.getInt(NotificationBadge.NewHtcHomeBadger.COUNT, 0);
        ArrayList<TLRPC.Reaction> arrayList = new ArrayList<>(i9);
        if (i9 > 0) {
            for (int i10 = 0; i10 < i9; i10++) {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(sharedPreferences.getString("object_" + i10, "")));
                try {
                    arrayList.add(TLRPC.Reaction.TLdeserialize(serializedData, serializedData.readInt32(true), true));
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
        }
        return arrayList;
    }

    private void loadRepliesOfDraftReplies(ArrayList<TLRPC.Message> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new r7(this, arrayList, 0));
    }

    private void loadStickerSetThumbInternal(TLRPC.PhotoSize photoSize, Object obj, TLRPC.Document document, int i9) {
        ImageLocation forSticker = ImageLocation.getForSticker(photoSize, document, i9);
        if (forSticker != null) {
            getFileLoader().loadFile(forSticker, obj, forSticker.imageType == 1 ? "tgs" : "webp", 3, 1);
        }
    }

    public static void offsetEntities(ArrayList<TLRPC.MessageEntity> arrayList, int i9) {
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.MessageEntity messageEntity = arrayList.get(i10);
            i10++;
            messageEntity.offset += i9;
        }
    }

    private CharSequence parsePattern(CharSequence charSequence, Pattern pattern, ArrayList<TLRPC.MessageEntity> arrayList, GenericProvider<Void, TLRPC.MessageEntity> genericProvider) {
        URLSpan[] uRLSpanArr;
        Matcher matcher = pattern.matcher(charSequence);
        int i9 = 0;
        while (matcher.find()) {
            boolean z10 = true;
            String group = matcher.group(1);
            if ((charSequence instanceof Spannable) && (uRLSpanArr = (URLSpan[]) ((Spannable) charSequence).getSpans(matcher.start() - i9, matcher.end() - i9, URLSpan.class)) != null && uRLSpanArr.length > 0) {
                z10 = false;
            }
            if (z10) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    TLRPC.MessageEntity messageEntity = arrayList.get(i10);
                    if ((messageEntity instanceof TLRPC.TL_messageEntityPre) || (messageEntity instanceof TLRPC.TL_messageEntityCode)) {
                        int start = matcher.start() - i9;
                        int end = matcher.end() - i9;
                        int i11 = messageEntity.offset;
                        if (AndroidUtilities.intersect1d(start, end, i11, messageEntity.length + i11)) {
                            z10 = false;
                            break;
                        }
                    }
                    i10++;
                }
            }
            if (z10) {
                charSequence = ((Object) charSequence.subSequence(0, matcher.start() - i9)) + group + ((Object) charSequence.subSequence(matcher.end() - i9, charSequence.length()));
                TLRPC.MessageEntity provide = genericProvider.provide(null);
                provide.offset = matcher.start() - i9;
                int length = group.length();
                provide.length = length;
                int i12 = provide.offset;
                removeOffset4After(i12, length + i12, arrayList);
                arrayList.add(provide);
            }
            i9 += (matcher.end() - matcher.start()) - group.length();
        }
        return charSequence;
    }

    private void preloadNextGreetingsSticker() {
        if (this.recentStickers[3].isEmpty()) {
            return;
        }
        ArrayList<TLRPC.Document> arrayList = this.recentStickers[3];
        this.greetingsSticker = arrayList.get(Utilities.random.nextInt(arrayList.size()));
        getFileLoader().loadFile(ImageLocation.getForDocument(this.greetingsSticker), this.greetingsSticker, null, 0, 1);
    }

    private void processLoadStickersResponse(int i9, TLRPC.TL_messages_allStickers tL_messages_allStickers) {
        processLoadStickersResponse(i9, tL_messages_allStickers, null);
    }

    private void processLoadedDiceStickers(String str, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z11, int i9) {
        AndroidUtilities.runOnUIThread(new y7(this, str, 4));
        Utilities.stageQueue.postRunnable(new of.r0(this, z11, tL_messages_stickerSet, i9, str, z10));
    }

    private void processLoadedFeaturedStickers(boolean z10, ArrayList<TLRPC.StickerSetCovered> arrayList, ArrayList<Long> arrayList2, boolean z11, boolean z12, int i9, long j10) {
        AndroidUtilities.runOnUIThread(new z7(this, z10, 1));
        Utilities.stageQueue.postRunnable(new y8(this, z12, arrayList, i9, j10, z10, arrayList2, z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processLoadedMedia(final TLRPC.messages_Messages messages_messages, final long j10, int i9, int i10, final int i11, final int i12, long j11, final int i13, final int i14, boolean z10, final boolean z11, final int i15) {
        long j12;
        int i16;
        int i17;
        long j13;
        boolean z12;
        ArrayList<TLRPC.Message> arrayList;
        ArrayList<TLRPC.Message> arrayList2;
        if (BuildVars.LOGS_ENABLED) {
            int size = (messages_messages == null || (arrayList2 = messages_messages.messages) == null) ? 0 : arrayList2.size();
            StringBuilder sb2 = new StringBuilder("process load media messagesCount ");
            sb2.append(size);
            sb2.append(" did ");
            j12 = j10;
            sb2.append(j12);
            sb2.append(" topicId ");
            j13 = j11;
            sb2.append(j13);
            sb2.append(" count = ");
            i16 = i9;
            j3.r0.y(sb2, i16, " max_id=", i10, " min_id=");
            i17 = i12;
            j3.r0.y(sb2, i11, " type = ", i17, " cache = ");
            j3.r0.y(sb2, i13, " classGuid = ", i14, " topReached=");
            z12 = z11;
            sb2.append(z12);
            FileLog.d(sb2.toString());
        } else {
            j12 = j10;
            i16 = i9;
            i17 = i12;
            j13 = j11;
            z12 = z11;
        }
        if (i13 != 0 && messages_messages != null && (arrayList = messages_messages.messages) != null && (((arrayList.isEmpty() && i11 == 0) || (messages_messages.messages.size() <= 1 && i11 != 0)) && !DialogObject.isEncryptedDialog(j12))) {
            if (i13 == 2) {
                return;
            }
            loadMedia(j12, i16, i10, i11, i17, j13, 0, i14, i15, null, null);
        } else {
            if (i13 == 0) {
                ImageLoader.saveMessagesThumbs(messages_messages.messages);
                getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                putMediaDatabase(j10, j11, i12, messages_messages.messages, i10, i11, z12);
            }
            Utilities.searchQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.i9
                @Override // java.lang.Runnable
                public final void run() {
                    MediaDataController.this.lambda$processLoadedMedia$136(messages_messages, i13, j10, i14, i12, z11, i11, i15);
                }
            });
        }
    }

    private void processLoadedMediaCount(final int i9, final long j10, final long j11, final int i10, final int i11, final boolean z10, final int i12) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.z8
            @Override // java.lang.Runnable
            public final void run() {
                MediaDataController.this.lambda$processLoadedMediaCount$137(j10, z10, i9, i10, i12, j11, i11);
            }
        });
    }

    private void processLoadedStickers(int i9, ArrayList<TLRPC.TL_messages_stickerSet> arrayList, boolean z10, int i10, long j10) {
        processLoadedStickers(i9, arrayList, z10, i10, j10, null);
    }

    private void putDiceStickersToCache(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i9) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new h0(this, tL_messages_stickerSet, str, i9, 8));
    }

    private void putEmojiKeywords(String str, TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference) {
        if (tL_emojiKeywordsDifference == null) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new f0(this, tL_emojiKeywordsDifference, str, 27));
    }

    private void putFeaturedStickersToCache(final boolean z10, ArrayList<TLRPC.StickerSetCovered> arrayList, final ArrayList<Long> arrayList2, final int i9, final long j10, final boolean z11) {
        final ArrayList arrayList3 = arrayList != null ? new ArrayList(arrayList) : null;
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.messenger.l9
            @Override // java.lang.Runnable
            public final void run() {
                MediaDataController.this.lambda$putFeaturedStickersToCache$64(arrayList3, arrayList2, z10, i9, j10, z11);
            }
        });
    }

    private void putMediaCountDatabase(long j10, long j11, int i9, int i10) {
        getMessagesStorage().getStorageQueue().postRunnable(new g8(this, j11, j10, i9, i10, 1));
    }

    private void putMediaDatabase(long j10, long j11, int i9, ArrayList<TLRPC.Message> arrayList, int i10, int i11, boolean z10) {
        getMessagesStorage().getStorageQueue().postRunnable(new v8(this, i11, arrayList, z10, j10, i10, i9, j11));
    }

    private void putMenuBotsToCache(TLRPC.TL_attachMenuBots tL_attachMenuBots, long j10, int i9) {
        getMessagesStorage().getStorageQueue().postRunnable(new gh.c9(this, tL_attachMenuBots, j10, i9, 1));
    }

    private void putPremiumPromoToCache(TLRPC.TL_help_premiumPromo tL_help_premiumPromo, int i9) {
        getMessagesStorage().getStorageQueue().postRunnable(new p4(this, tL_help_premiumPromo, i9, 6));
    }

    private void putReactionsToCache(List<TLRPC.TL_availableReaction> list, int i9, int i10) {
        getMessagesStorage().getStorageQueue().postRunnable(new w4(this, list != null ? new ArrayList(list) : null, i9, i10, 3));
    }

    private void putSetToCache(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        getMessagesStorage().getStorageQueue().postRunnable(new b7(this, tL_messages_stickerSet, 3));
    }

    private void putStickersToCache(int i9, ArrayList<TLRPC.TL_messages_stickerSet> arrayList, int i10, long j10) {
        getMessagesStorage().getStorageQueue().postRunnable(new t(this, arrayList != null ? new ArrayList(arrayList) : null, i9, i10, j10));
    }

    private static void removeEmptyMessages(ArrayList<TLRPC.Message> arrayList) {
        int i9 = 0;
        while (i9 < arrayList.size()) {
            TLRPC.Message message = arrayList.get(i9);
            if (message == null || (message instanceof TLRPC.TL_messageEmpty) || (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                arrayList.remove(i9);
                i9--;
            }
            i9++;
        }
    }

    private static void removeOffset4After(int i9, int i10, ArrayList<TLRPC.MessageEntity> arrayList) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.MessageEntity messageEntity = arrayList.get(i11);
            int i12 = messageEntity.offset;
            if (i12 > i10) {
                messageEntity.offset = i12 - 4;
            } else if (i12 > i9) {
                messageEntity.offset = i12 - 2;
            }
        }
    }

    private static boolean replyToEquals(TLRPC.InputReplyTo inputReplyTo, TLRPC.InputReplyTo inputReplyTo2) {
        if (inputReplyTo == inputReplyTo2) {
            return true;
        }
        boolean z10 = inputReplyTo instanceof TLRPC.TL_inputReplyToMessage;
        if (z10 != (inputReplyTo2 instanceof TLRPC.TL_inputReplyToMessage)) {
            return false;
        }
        if (z10) {
            return MessageObject.peersEqual(inputReplyTo.reply_to_peer_id, inputReplyTo2.reply_to_peer_id) && TextUtils.equals(inputReplyTo.quote_text, inputReplyTo2.quote_text) && inputReplyTo.reply_to_msg_id == inputReplyTo2.reply_to_msg_id;
        }
        if (inputReplyTo instanceof TLRPC.TL_inputReplyToStory) {
            return MessageObject.peersEqual(inputReplyTo.peer, inputReplyTo2.peer) && inputReplyTo.story_id == inputReplyTo2.story_id;
        }
        return true;
    }

    private static boolean richMessageEquals(TL_iv.RichMessage richMessage, TL_iv.RichMessage richMessage2) {
        if (richMessage == richMessage2) {
            return true;
        }
        if ((richMessage == null) != (richMessage2 == null)) {
            return false;
        }
        try {
            SerializedData serializedData = new SerializedData(richMessage.getObjectSize());
            SerializedData serializedData2 = new SerializedData(richMessage2.getObjectSize());
            richMessage.serializeToStream(serializedData);
            richMessage2.serializeToStream(serializedData2);
            return Arrays.equals(serializedData.toByteArray(), serializedData2.toByteArray());
        } catch (Exception e10) {
            FileLog.e(e10);
            return false;
        }
    }

    private void saveDraftReplyMessage(long j10, long j11, TLRPC.Message message) {
        if (message == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new e5.y(this, j10, j11, message, 6));
    }

    private void savePeer(final long j10, final int i9, final double d) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.messenger.w6
            @Override // java.lang.Runnable
            public final void run() {
                MediaDataController.this.lambda$savePeer$158(j10, i9, d);
            }
        });
    }

    private void savePinnedMessages(long j10, ArrayList<TLRPC.Message> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new a4(this, arrayList, j10, 7));
    }

    public static void saveReactionsToPref(SharedPreferences sharedPreferences, long j10, ArrayList<? extends TLObject> arrayList) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, arrayList.size());
        edit.putLong("hash", j10);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            TLObject tLObject = arrayList.get(i9);
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            edit.putString("object_" + i9, Utilities.bytesToHex(serializedData.toByteArray()));
        }
        edit.apply();
    }

    private void saveReplyMessages(a0.h hVar, ArrayList<TLRPC.Message> arrayList, boolean z10) {
        getMessagesStorage().getStorageQueue().postRunnable(new mj(this, z10, arrayList, hVar, 7));
    }

    private void saveStickerSetIntoCache(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (tL_messages_stickerSet == null || tL_messages_stickerSet.set == null) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new b7(this, tL_messages_stickerSet, 0));
        cleanupStickerSetCache();
    }

    private TLRPC.MessageEntity setEntityStartEnd(TLRPC.MessageEntity messageEntity, int i9, int i10) {
        messageEntity.offset = i9;
        messageEntity.length = i10 - i9;
        return messageEntity;
    }

    public static void sortEntities(ArrayList<TLRPC.MessageEntity> arrayList) {
        Collections.sort(arrayList, entityComparator);
    }

    public static boolean stringsEqual(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null && charSequence2 == null) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || !TextUtils.equals(charSequence, charSequence2)) {
            return false;
        }
        return entitiesEqual(getInstance(UserConfig.selectedAccount).getEntities(new CharSequence[]{new SpannableStringBuilder(charSequence)}, true), getInstance(UserConfig.selectedAccount).getEntities(new CharSequence[]{new SpannableStringBuilder(charSequence2)}, true));
    }

    private static boolean suggestedPostEquals(TLRPC.SuggestedPost suggestedPost, TLRPC.SuggestedPost suggestedPost2) {
        if (suggestedPost != suggestedPost2) {
            if ((suggestedPost == null) == (suggestedPost2 == null)) {
                TL_stars.StarsAmount starsAmount = suggestedPost.price;
                TL_stars.StarsAmount starsAmount2 = suggestedPost2.price;
                gf.a l10 = gf.a.l(starsAmount);
                gf.a l11 = gf.a.l(starsAmount2);
                if (l10 != l11 && ((l10 == null || l11 == null || l10.a != l11.a || l10.b != l11.b) && suggestedPost.schedule_date == suggestedPost2.schedule_date && suggestedPost.accepted == suggestedPost2.accepted && suggestedPost.rejected == suggestedPost2.rejected)) {
                }
            }
            return false;
        }
        return true;
    }

    private static TLRPC.InputReplyTo toInputReplyTo(int i9, TLRPC.MessageReplyHeader messageReplyHeader) {
        if (messageReplyHeader instanceof TLRPC.TL_messageReplyStoryHeader) {
            TLRPC.TL_inputReplyToStory tL_inputReplyToStory = new TLRPC.TL_inputReplyToStory();
            tL_inputReplyToStory.peer = MessagesController.getInstance(i9).getInputPeer(messageReplyHeader.peer);
            tL_inputReplyToStory.story_id = messageReplyHeader.story_id;
            return tL_inputReplyToStory;
        }
        if (!(messageReplyHeader instanceof TLRPC.TL_messageReplyHeader)) {
            return null;
        }
        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
        tL_inputReplyToMessage.reply_to_msg_id = messageReplyHeader.reply_to_msg_id;
        if ((messageReplyHeader.flags & 1) != 0) {
            TLRPC.InputPeer inputPeer = MessagesController.getInstance(i9).getInputPeer(messageReplyHeader.reply_to_peer_id);
            tL_inputReplyToMessage.reply_to_peer_id = inputPeer;
            if (inputPeer != null) {
                tL_inputReplyToMessage.flags |= 2;
            }
        }
        int i10 = messageReplyHeader.flags;
        if ((i10 & 2) != 0) {
            tL_inputReplyToMessage.flags |= 1;
            tL_inputReplyToMessage.top_msg_id = messageReplyHeader.reply_to_top_id;
        }
        if ((i10 & 64) != 0) {
            tL_inputReplyToMessage.flags |= 4;
            tL_inputReplyToMessage.quote_text = messageReplyHeader.quote_text;
        }
        if ((i10 & 128) != 0) {
            tL_inputReplyToMessage.flags |= 8;
            tL_inputReplyToMessage.quote_entities = messageReplyHeader.quote_entities;
        }
        return tL_inputReplyToMessage;
    }

    private TL_iv.TL_inputRichMessage toInputRichMessage(TL_iv.RichMessage richMessage) {
        TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
        tL_inputRichMessage.rtl = richMessage.rtl;
        tL_inputRichMessage.blocks = new ArrayList<>(richMessage.blocks.size());
        for (int i9 = 0; i9 < richMessage.blocks.size(); i9++) {
            tL_inputRichMessage.blocks.add(SendMessagesHelper.toInputPageBlock(richMessage.blocks.get(i9)));
        }
        ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i10 = 0; i10 < richMessage.photos.size(); i10++) {
                TLRPC.Photo photo = richMessage.photos.get(i10);
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputPhoto.id = photo.id;
                tL_inputPhoto.access_hash = photo.access_hash;
                byte[] bArr = photo.file_reference;
                if (bArr == null) {
                    bArr = new byte[0];
                }
                tL_inputPhoto.file_reference = bArr;
                tL_inputRichMessage.photos.add(tL_inputPhoto);
            }
            tL_inputRichMessage.flags |= 4;
        }
        ArrayList<TLRPC.Document> arrayList2 = richMessage.documents;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            for (int i11 = 0; i11 < richMessage.documents.size(); i11++) {
                TLRPC.Document document = richMessage.documents.get(i11);
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = document.id;
                tL_inputDocument.access_hash = document.access_hash;
                byte[] bArr2 = document.file_reference;
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                tL_inputDocument.file_reference = bArr2;
                tL_inputRichMessage.documents.add(tL_inputDocument);
            }
            tL_inputRichMessage.flags |= 8;
        }
        return tL_inputRichMessage;
    }

    private void toggleStickerSetInternal(final Context context, int i9, final org.telegram.ui.ActionBar.o2 o2Var, final FrameLayout frameLayout, final boolean z10, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final int i10, final boolean z11) {
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        long j10 = stickerSet.id;
        tL_inputStickerSetID.id = j10;
        if (i9 == 0) {
            markSetUninstalling(j10, true);
            TLRPC.TL_messages_uninstallStickerSet tL_messages_uninstallStickerSet = new TLRPC.TL_messages_uninstallStickerSet();
            tL_messages_uninstallStickerSet.stickerset = tL_inputStickerSetID;
            getConnectionsManager().sendRequest(tL_messages_uninstallStickerSet, new sa(this, stickerSet, i10));
            return;
        }
        TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
        tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
        tL_messages_installStickerSet.archived = i9 == 1;
        markSetInstalling(stickerSet.id, true);
        getConnectionsManager().sendRequest(tL_messages_installStickerSet, new RequestDelegate() { // from class: org.telegram.messenger.z6
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                TLObject tLObject3 = tLObject;
                TLRPC.Document document2 = document;
                int i11 = i10;
                Context context2 = context;
                MediaDataController.this.lambda$toggleStickerSetInternal$114(stickerSet, o2Var, z10, i11, z11, frameLayout, context2, tLObject3, document2, tLObject2, tL_error);
            }
        });
    }

    private void updateEmojiStatuses(int i9, TL_account.TL_emojiStatuses tL_emojiStatuses) {
        getMessagesStorage().getStorageQueue().postRunnable(new p4(this, i9, tL_emojiStatuses, 8));
    }

    private void updateSearchResults() {
        MessageObject messageObject;
        ArrayList arrayList = new ArrayList(this.searchResultMessages);
        this.searchResultMessages.clear();
        HashSet hashSet = new HashSet();
        int i9 = 0;
        while (true) {
            MessageObject messageObject2 = null;
            if (i9 >= this.searchServerResultMessages.size()) {
                break;
            }
            MessageObject messageObject3 = this.searchServerResultMessages.get(i9);
            if ((!messageObject3.hasValidGroupId() || messageObject3.isPrimaryGroupMessage) && !hashSet.contains(Integer.valueOf(messageObject3.getId()))) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (((MessageObject) arrayList.get(i10)).getId() == messageObject3.getId()) {
                        messageObject2 = (MessageObject) arrayList.get(i10);
                        break;
                    }
                    i10++;
                }
                if (messageObject2 != null) {
                    messageObject3.copyStableParams(messageObject2);
                    messageObject3.mediaExists = messageObject2.mediaExists;
                    messageObject3.attachPathExists = messageObject2.attachPathExists;
                }
                messageObject3.isSavedFiltered = true;
                this.searchResultMessages.add(messageObject3);
                hashSet.add(Integer.valueOf(messageObject3.getId()));
            }
            i9++;
        }
        for (int i11 = 0; i11 < this.searchLocalResultMessages.size(); i11++) {
            MessageObject messageObject4 = this.searchLocalResultMessages.get(i11);
            if (!hashSet.contains(Integer.valueOf(messageObject4.getId()))) {
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        messageObject = null;
                        break;
                    } else {
                        if (((MessageObject) arrayList.get(i12)).getId() == messageObject4.getId()) {
                            messageObject = (MessageObject) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                }
                if (messageObject != null) {
                    messageObject4.copyStableParams(messageObject);
                    messageObject4.mediaExists = messageObject.mediaExists;
                    messageObject4.attachPathExists = messageObject.attachPathExists;
                }
                messageObject4.isSavedFiltered = true;
                this.searchResultMessages.add(messageObject4);
                hashSet.add(Integer.valueOf(messageObject4.getId()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: verifyAnimatedStickerMessageInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$verifyAnimatedStickerMessage$68(TLRPC.Message message, String str) {
        ArrayList<TLRPC.Message> arrayList = this.verifyingMessages.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.verifyingMessages.put(str, arrayList);
        }
        arrayList.add(message);
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = MessageObject.getInputStickerSet(message);
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new y6(this, str, 0));
    }

    public void addNewStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (this.stickerSetsById.h(tL_messages_stickerSet.set.id) >= 0 || this.stickerSetsByName.containsKey(tL_messages_stickerSet.set.short_name)) {
            return;
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        int i9 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
        this.stickerSets[i9].add(0, tL_messages_stickerSet);
        this.stickerSetsById.k(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
        this.installedStickerSetsById.k(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
        this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name, tL_messages_stickerSet);
        a0.h hVar = new a0.h();
        for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i10);
            hVar.k(document, document.id);
        }
        for (int i11 = 0; i11 < tL_messages_stickerSet.packs.size(); i11++) {
            TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i11);
            String replace = tL_stickerPack.emoticon.replace("️", "");
            tL_stickerPack.emoticon = replace;
            ArrayList<TLRPC.Document> arrayList = this.allStickers.get(replace);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.allStickers.put(tL_stickerPack.emoticon, arrayList);
            }
            for (int i12 = 0; i12 < tL_stickerPack.documents.size(); i12++) {
                Long l10 = tL_stickerPack.documents.get(i12);
                if (this.stickersByEmoji.h(l10.longValue()) < 0) {
                    this.stickersByEmoji.k(tL_stickerPack.emoticon, l10.longValue());
                }
                TLRPC.Document document2 = (TLRPC.Document) hVar.f(l10.longValue());
                if (document2 != null) {
                    arrayList.add(document2);
                }
            }
        }
        this.loadHash[i9] = calcStickersHash(this.stickerSets[i9]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i9), Boolean.TRUE);
        loadStickers(i9, false, true);
    }

    public void addRecentGif(TLRPC.Document document, int i9, boolean z10) {
        if (document == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.recentGifs.size()) {
                this.recentGifs.add(0, document);
                break;
            }
            TLRPC.Document document2 = this.recentGifs.get(i10);
            if (document2.id == document.id) {
                this.recentGifs.remove(i10);
                this.recentGifs.add(0, document2);
                break;
            }
            i10++;
        }
        if ((this.recentGifs.size() > getMessagesController().savedGifsLimitDefault && !UserConfig.getInstance(this.currentAccount).isPremium()) || this.recentGifs.size() > getMessagesController().savedGifsLimitPremium) {
            getMessagesStorage().getStorageQueue().postRunnable(new w7(1, this, (TLRPC.Document) e2.c.k(1, this.recentGifs)));
            if (z10) {
                AndroidUtilities.runOnUIThread(new e1(document, 26));
            }
        }
        ArrayList<TLRPC.Document> arrayList = new ArrayList<>();
        arrayList.add(document);
        processLoadedRecentDocuments(0, arrayList, true, i9, false);
    }

    public void addRecentSticker(int i9, Object obj, TLRPC.Document document, int i10, boolean z10) {
        int i11;
        int i12 = 0;
        if (i9 != 3) {
            int i13 = 1;
            if (MessageObject.isStickerDocument(document) || MessageObject.isAnimatedStickerDocument(document, true)) {
                int i14 = 0;
                while (true) {
                    if (i14 < this.recentStickers[i9].size()) {
                        TLRPC.Document document2 = this.recentStickers[i9].get(i14);
                        if (document2.id == document.id) {
                            this.recentStickers[i9].remove(i14);
                            if (!z10) {
                                this.recentStickers[i9].add(0, document2);
                            }
                        } else {
                            i14++;
                        }
                    } else if (!z10) {
                        this.recentStickers[i9].add(0, document);
                    }
                }
                if (i9 == 2) {
                    if (z10) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 0, document, 4);
                    } else {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 0, document, Integer.valueOf(this.recentStickers[i9].size() > getMessagesController().maxFaveStickersCount ? 6 : 5));
                    }
                    TLRPC.TL_messages_faveSticker tL_messages_faveSticker = new TLRPC.TL_messages_faveSticker();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_messages_faveSticker.id = tL_inputDocument;
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    byte[] bArr = document.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    tL_messages_faveSticker.unfave = z10;
                    getConnectionsManager().sendRequest(tL_messages_faveSticker, new s7(this, obj, tL_messages_faveSticker, i12));
                    i11 = getMessagesController().maxFaveStickersCount;
                } else {
                    if (i9 == 0 && z10) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 0, document, 3);
                        TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = new TLRPC.TL_messages_saveRecentSticker();
                        TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                        tL_messages_saveRecentSticker.id = tL_inputDocument2;
                        tL_inputDocument2.id = document.id;
                        tL_inputDocument2.access_hash = document.access_hash;
                        byte[] bArr2 = document.file_reference;
                        tL_inputDocument2.file_reference = bArr2;
                        if (bArr2 == null) {
                            tL_inputDocument2.file_reference = new byte[0];
                        }
                        tL_messages_saveRecentSticker.unsave = true;
                        getConnectionsManager().sendRequest(tL_messages_saveRecentSticker, new s7(this, obj, tL_messages_saveRecentSticker, i13));
                    }
                    i11 = getMessagesController().maxRecentStickersCount;
                }
                if (this.recentStickers[i9].size() > i11 || z10) {
                    getMessagesStorage().getStorageQueue().postRunnable(new p4(this, i9, z10 ? document : (TLRPC.Document) e2.c.k(1, this.recentStickers[i9]), 7));
                }
                if (!z10) {
                    ArrayList<TLRPC.Document> arrayList = new ArrayList<>();
                    arrayList.add(document);
                    processLoadedRecentDocuments(i9, arrayList, false, i10, false);
                }
                if (i9 == 2 || (i9 == 0 && z10)) {
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentDocumentsDidLoad, Boolean.FALSE, Integer.valueOf(i9));
                }
            }
        }
    }

    public void addStyle(int i9, int i10, int i11, ArrayList<TLRPC.MessageEntity> arrayList) {
        if ((i9 & 256) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC.TL_messageEntitySpoiler(), i10, i11));
        }
        if ((i9 & 1) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC.TL_messageEntityBold(), i10, i11));
        }
        if ((i9 & 2) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC.TL_messageEntityItalic(), i10, i11));
        }
        if ((i9 & 4) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC.TL_messageEntityCode(), i10, i11));
        }
        if ((i9 & 8) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC.TL_messageEntityStrike(), i10, i11));
        }
        if ((i9 & 16) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC.TL_messageEntityUnderline(), i10, i11));
        }
    }

    public void applyAttachMenuBot(TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot) {
        this.attachMenuBots.bots.add(tL_attachMenuBotsBot.bot);
        loadAttachMenuBots(false, true);
    }

    public boolean areAllTrendingStickerSetsUnread(boolean z10) {
        int size = this.featuredStickerSets[z10 ? 1 : 0].size();
        for (int i9 = 0; i9 < size; i9++) {
            TLRPC.StickerSetCovered stickerSetCovered = this.featuredStickerSets[z10 ? 1 : 0].get(i9);
            if (!isStickerPackInstalled(stickerSetCovered.set.id) && ((!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) && !this.unreadStickerSets[z10 ? 1 : 0].contains(Long.valueOf(stickerSetCovered.set.id)))) {
                return false;
            }
        }
        return true;
    }

    public boolean areStickersLoaded(int i9) {
        return this.stickersLoaded[i9];
    }

    public void beginTransaction() {
        this.inTransaction = true;
    }

    public boolean botInAttachMenu(long j10) {
        for (int i9 = 0; i9 < this.attachMenuBots.bots.size(); i9++) {
            if (this.attachMenuBots.bots.get(i9).bot_id == j10) {
                return true;
            }
        }
        return false;
    }

    public void buildShortcuts() {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        int g10 = g0.f.g(ApplicationLoader.applicationContext) - 2;
        if (g10 <= 0) {
            g10 = 5;
        }
        ArrayList arrayList = new ArrayList();
        if (SharedConfig.passcodeHash.length() <= 0) {
            for (int i9 = 0; i9 < this.hints.size(); i9++) {
                arrayList.add(this.hints.get(i9));
                if (arrayList.size() == g10 - 2) {
                    break;
                }
            }
        }
        Utilities.globalQueue.postRunnable(new l6(this, Build.VERSION.SDK_INT >= 30, arrayList, 4));
    }

    public void calcNewHash(int i9) {
        this.loadHash[i9] = calcStickersHash(this.stickerSets[i9]);
    }

    public boolean canAddStickerToFavorites() {
        return (this.stickersLoaded[0] && this.stickerSets[0].size() < 5 && this.recentStickers[2].isEmpty()) ? false : true;
    }

    public boolean canCreateAttachedMenuBotShortcut(long j10) {
        return true;
    }

    public boolean cancelRemovingStickerSet(long j10) {
        Runnable runnable = (Runnable) this.removingStickerSetsUndos.f(j10);
        if (runnable == null) {
            return false;
        }
        runnable.run();
        return true;
    }

    public void cancelSearchStickers(SearchStickersKey searchStickersKey) {
        Integer remove;
        if (searchStickersKey == null || (remove = this.loadingSearchStickersKeys.remove(searchStickersKey)) == null || remove.intValue() == 0) {
            return;
        }
        getConnectionsManager().cancelRequest(remove.intValue(), true);
    }

    public void checkAllMedia(boolean z10) {
        if (z10) {
            this.reactionsUpdateDate = 0;
            int[] iArr = this.loadFeaturedDate;
            iArr[0] = 0;
            iArr[1] = 0;
        }
        loadRecents(2, false, true, false);
        loadRecents(3, false, true, false);
        loadRecents(7, false, false, true);
        checkFeaturedStickers();
        checkFeaturedEmoji();
        checkReactions();
        checkMenuBots(true);
        checkPremiumPromo();
        checkPremiumGiftStickers();
        checkTonGiftStickers();
        checkGenericAnimations();
        getMessagesController().getAvailableEffects();
    }

    public void checkDefaultTopicIcons() {
        if (getUserConfig().defaultTopicIcons != null) {
            String str = getUserConfig().defaultTopicIcons;
            TLRPC.TL_messages_stickerSet stickerSetByName = getStickerSetByName(str);
            if (stickerSetByName == null) {
                stickerSetByName = getStickerSetByEmojiOrName(str);
            }
            if (stickerSetByName == null) {
                getInstance(this.currentAccount).loadStickersByEmojiOrName(str, false, true);
            }
        }
        if (this.loadingDefaultTopicIcons || System.currentTimeMillis() - getUserConfig().lastUpdatedDefaultTopicIcons < 86400000) {
            return;
        }
        this.loadingDefaultTopicIcons = true;
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetEmojiDefaultTopicIcons();
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new k7(this, 7));
    }

    public void checkFeaturedEmoji() {
        if (this.loadingFeaturedStickers[1]) {
            return;
        }
        if (!this.featuredStickersLoaded[1] || Math.abs((System.currentTimeMillis() / 1000) - this.loadFeaturedDate[1]) >= 3600) {
            loadFeaturedStickers(true, true);
        }
    }

    public void checkFeaturedStickers() {
        if (this.loadingFeaturedStickers[0]) {
            return;
        }
        if (!this.featuredStickersLoaded[0] || Math.abs((System.currentTimeMillis() / 1000) - this.loadFeaturedDate[0]) >= 3600) {
            loadFeaturedStickers(false, true);
        }
    }

    public void checkGenericAnimations() {
        if (getUserConfig().genericAnimationsStickerPack != null) {
            String str = getUserConfig().genericAnimationsStickerPack;
            TLRPC.TL_messages_stickerSet stickerSetByName = getStickerSetByName(str);
            if (stickerSetByName == null) {
                stickerSetByName = getStickerSetByEmojiOrName(str);
            }
            if (stickerSetByName == null) {
                getInstance(this.currentAccount).loadStickersByEmojiOrName(str, false, true);
            }
        }
        if (this.loadingGenericAnimations || System.currentTimeMillis() - getUserConfig().lastUpdatedGenericAnimations < 86400000) {
            return;
        }
        this.loadingGenericAnimations = true;
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetEmojiGenericAnimations();
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new k7(this, 0));
    }

    public void checkMenuBots(boolean z10) {
        if (this.isLoadingMenuBots) {
            return;
        }
        if ((!z10 || this.menuBotsUpdatedLocal) && Math.abs((System.currentTimeMillis() / 1000) - this.menuBotsUpdateDate) < 3600) {
            return;
        }
        loadAttachMenuBots(true, false);
    }

    public void checkPremiumGiftStickers() {
        if (getUserConfig().premiumGiftsStickerPack != null) {
            String str = getUserConfig().premiumGiftsStickerPack;
            TLRPC.TL_messages_stickerSet stickerSetByName = getStickerSetByName(str);
            if (stickerSetByName == null) {
                stickerSetByName = getStickerSetByEmojiOrName(str);
            }
            if (stickerSetByName == null) {
                getInstance(this.currentAccount).loadStickersByEmojiOrName(str, false, true);
            }
        }
        if (this.loadingPremiumGiftStickers || System.currentTimeMillis() - getUserConfig().lastUpdatedPremiumGiftsStickerPack < 86400000) {
            return;
        }
        this.loadingPremiumGiftStickers = true;
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetPremiumGifts();
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new k7(this, 5));
    }

    public void checkPremiumPromo() {
        if (this.isLoadingPremiumPromo) {
            return;
        }
        if (this.premiumPromo == null || Math.abs((System.currentTimeMillis() / 1000) - this.premiumPromoUpdateDate) >= 3600) {
            loadPremiumPromo(true);
        }
    }

    public void checkReactions() {
        if (this.isLoadingReactions || Math.abs((System.currentTimeMillis() / 1000) - this.reactionsUpdateDate) < 3600) {
            return;
        }
        loadReactions(true, null);
    }

    public void checkRingtones(boolean z10) {
        this.ringtoneDataStore.g(z10);
    }

    public void checkStickers(int i9) {
        if (this.loadingStickers[i9]) {
            return;
        }
        if (!this.stickersLoaded[i9] || Math.abs((System.currentTimeMillis() / 1000) - this.loadDate[i9]) >= 3600) {
            loadStickers(i9, true, false);
        }
    }

    public void checkTonGiftStickers() {
        if (getUserConfig().premiumTonStickerPack != null) {
            String str = getUserConfig().premiumTonStickerPack;
            TLRPC.TL_messages_stickerSet stickerSetByName = getStickerSetByName(str);
            if (stickerSetByName == null) {
                stickerSetByName = getStickerSetByEmojiOrName(str);
            }
            if (stickerSetByName == null) {
                getInstance(this.currentAccount).loadStickersByEmojiOrName(str, false, true);
            }
        }
        if (this.loadingPremiumTonStickers || System.currentTimeMillis() - getUserConfig().lastUpdatedTonGiftsStickerPack < 86400000) {
            return;
        }
        this.loadingPremiumTonStickers = true;
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetTonGifts();
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new k7(this, 9));
    }

    public void cleanDraft(long j10, long j11, boolean z10) {
        a0.h hVar = (a0.h) this.drafts.f(j10);
        TLRPC.DraftMessage draftMessage = hVar != null ? (TLRPC.DraftMessage) hVar.f(j11) : null;
        if (draftMessage == null) {
            return;
        }
        if (z10) {
            TLRPC.InputReplyTo inputReplyTo = draftMessage.reply_to;
            if (inputReplyTo == null || inputReplyTo.reply_to_msg_id != 0) {
                if (inputReplyTo != null) {
                    inputReplyTo.reply_to_msg_id = 0;
                }
                draftMessage.flags &= -2;
                saveDraft(j10, j11, draftMessage.message, draftMessage.entities, null, null, null, 0L, draftMessage.no_webpage, true);
                return;
            }
            return;
        }
        a0.h hVar2 = (a0.h) this.drafts.f(j10);
        if (hVar2 != null) {
            hVar2.l(j11);
            if (hVar2.m() == 0) {
                this.drafts.l(j10);
            }
        }
        a0.h hVar3 = (a0.h) this.draftMessages.f(j10);
        if (hVar3 != null) {
            hVar3.l(j11);
            if (hVar3.m() == 0) {
                this.draftMessages.l(j10);
            }
        }
        if (j11 != 0) {
            SharedPreferences.Editor edit = this.draftPreferences.edit();
            StringBuilder s10 = aa.d.s(j10, "t_", "_");
            s10.append(j11);
            SharedPreferences.Editor remove = edit.remove(s10.toString());
            StringBuilder s11 = aa.d.s(j10, "rt_", "_");
            s11.append(j11);
            remove.remove(s11.toString()).commit();
            return;
        }
        this.draftPreferences.edit().remove("" + j10).remove("r_" + j10).commit();
        getMessagesController().sortDialogs(null);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void cleanup() {
        int i9 = 0;
        while (true) {
            ArrayList<TLRPC.Document>[] arrayListArr = this.recentStickers;
            if (i9 >= arrayListArr.length) {
                break;
            }
            ArrayList<TLRPC.Document> arrayList = arrayListArr[i9];
            if (arrayList != null) {
                arrayList.clear();
            }
            this.loadingRecentStickers[i9] = false;
            this.recentStickersLoaded[i9] = false;
            i9++;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.loadHash[i10] = 0;
            this.loadDate[i10] = 0;
            this.stickerSets[i10].clear();
            this.loadingStickers[i10] = false;
            this.stickersLoaded[i10] = false;
        }
        this.loadingPinnedMessages.b();
        int[] iArr = this.loadFeaturedDate;
        iArr[0] = 0;
        long[] jArr = this.loadFeaturedHash;
        jArr[0] = 0;
        iArr[1] = 0;
        jArr[1] = 0;
        this.allStickers.clear();
        this.allStickersFeatured.clear();
        this.stickersByEmoji.b();
        this.featuredStickerSetsById[0].b();
        this.featuredStickerSets[0].clear();
        this.featuredStickerSetsById[1].b();
        this.featuredStickerSets[1].clear();
        this.unreadStickerSets[0].clear();
        this.unreadStickerSets[1].clear();
        this.recentGifs.clear();
        this.stickerSetsById.b();
        this.installedStickerSetsById.b();
        this.stickerSetsByName.clear();
        this.diceStickerSetsByEmoji.clear();
        this.diceEmojiStickerSetsById.b();
        this.loadingDiceStickerSets.clear();
        boolean[] zArr = this.loadingFeaturedStickers;
        zArr[0] = false;
        boolean[] zArr2 = this.featuredStickersLoaded;
        zArr2[0] = false;
        zArr[1] = false;
        zArr2[1] = false;
        this.loadingRecentGifs = false;
        this.recentGifsLoaded = false;
        this.currentFetchingEmoji.clear();
        if (Build.VERSION.SDK_INT >= 25) {
            Utilities.globalQueue.postRunnable(new w1(14));
        }
        this.verifyingMessages.clear();
        this.loading = false;
        this.loaded = false;
        this.hints.clear();
        this.inlineBots.clear();
        this.guestBots.clear();
        this.webapps.clear();
        AndroidUtilities.runOnUIThread(new g7(this, 9));
        this.drafts.b();
        this.draftMessages.b();
        this.draftPreferences.edit().clear().apply();
        this.botInfos.clear();
        this.botKeyboards.clear();
        this.botKeyboardsByMids.b();
    }

    public void clearAllDrafts(boolean z10) {
        this.drafts.b();
        this.draftMessages.b();
        this.draftsFolderIds.b();
        this.draftPreferences.edit().clear().commit();
        if (z10) {
            getMessagesController().sortDialogs(null);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
    }

    public void clearBotKeyboard(MessagesStorage.TopicKey topicKey, ArrayList<Integer> arrayList) {
        AndroidUtilities.runOnUIThread(new f0((BaseController) this, (ArrayList) arrayList, (Object) topicKey, 29));
    }

    public void clearDraftsFolderIds() {
        this.draftsFolderIds.b();
    }

    public void clearFoundMessageObjects() {
        this.searchResultMessages.clear();
        this.searchServerResultMessages.clear();
        this.searchLocalResultMessages.clear();
    }

    public ArrayList<TLRPC.EmojiStatus> clearRecentEmojiStatuses() {
        ArrayList<TLRPC.EmojiStatus> arrayList = this.emojiStatuses[0];
        if (arrayList != null) {
            arrayList.clear();
        }
        this.emojiStatusesHash[0] = 0;
        getMessagesStorage().getStorageQueue().postRunnable(new g7(this, 4));
        return this.emojiStatuses[0];
    }

    public void clearRecentReactions() {
        this.recentReactions.clear();
        ApplicationLoader.applicationContext.getSharedPreferences("recent_reactions_" + this.currentAccount, 0).edit().clear().apply();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_messages_clearRecentReactions(), new RequestDelegate() { // from class: org.telegram.messenger.MediaDataController.4
            @Override // org.telegram.tgnet.RequestDelegate
            public void run(TLObject tLObject, TLRPC.TL_error tL_error) {
            }
        });
    }

    public void clearRecentStickers() {
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearRecentStickers(), new k7(this, 1));
    }

    public void clearTopPeers() {
        this.hints.clear();
        this.inlineBots.clear();
        this.guestBots.clear();
        this.webapps.clear();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadHints, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadInlineHints, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadGuestBotHints, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadWebappsHints, new Object[0]);
        getMessagesStorage().getStorageQueue().postRunnable(new g7(this, 15));
        buildShortcuts();
    }

    public boolean containsTopPeer(long j10) {
        for (int i9 = 0; i9 < this.hints.size(); i9++) {
            if (DialogObject.getPeerDialogId(this.hints.get(i9).peer) == j10) {
                return true;
            }
        }
        return false;
    }

    public void endTransaction() {
        this.inTransaction = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void fetchEmojiStatuses(int i9, boolean z10) {
        TL_account.getChannelDefaultEmojiStatuses getchanneldefaultemojistatuses;
        boolean[] zArr = this.emojiStatusesFetching;
        if (zArr[i9]) {
            return;
        }
        zArr[i9] = true;
        if (z10) {
            getMessagesStorage().getStorageQueue().postRunnable(new k8(this, i9, 1));
            return;
        }
        if (i9 == 0) {
            TL_account.getRecentEmojiStatuses getrecentemojistatuses = new TL_account.getRecentEmojiStatuses();
            getrecentemojistatuses.hash = this.emojiStatusesHash[i9];
            getchanneldefaultemojistatuses = getrecentemojistatuses;
        } else if (i9 == 1) {
            TL_account.getDefaultEmojiStatuses getdefaultemojistatuses = new TL_account.getDefaultEmojiStatuses();
            getdefaultemojistatuses.hash = this.emojiStatusesHash[i9];
            getchanneldefaultemojistatuses = getdefaultemojistatuses;
        } else {
            TL_account.getChannelDefaultEmojiStatuses getchanneldefaultemojistatuses2 = new TL_account.getChannelDefaultEmojiStatuses();
            getchanneldefaultemojistatuses2.hash = this.emojiStatusesHash[i9];
            getchanneldefaultemojistatuses = getchanneldefaultemojistatuses2;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getchanneldefaultemojistatuses, new l7(this, i9, 3));
    }

    public void fetchNewEmojiKeywords(String[] strArr) {
        fetchNewEmojiKeywords(strArr, false);
    }

    public void fillWithAnimatedEmoji(ArrayList<KeywordResult> arrayList, Integer num, boolean z10, boolean z11, boolean z12, Runnable runnable) {
        if (arrayList == null || arrayList.isEmpty()) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        ArrayList[] arrayListArr = {getStickerSets(5)};
        s6 s6Var = new s6(this, num, arrayList, z11, z10, arrayListArr, runnable);
        ArrayList arrayList2 = arrayListArr[0];
        if ((arrayList2 != null && !arrayList2.isEmpty()) || this.triedLoadingEmojipacks) {
            s6Var.run();
            return;
        }
        this.triedLoadingEmojipacks = true;
        boolean[] zArr = new boolean[1];
        AndroidUtilities.runOnUIThread(new gk(this, zArr, arrayListArr, s6Var, 18));
        AndroidUtilities.runOnUIThread(new c2(20, zArr, s6Var), 900L);
    }

    public TLRPC.TL_attachMenuBot findBotInAttachMenu(long j10) {
        for (int i9 = 0; i9 < this.attachMenuBots.bots.size(); i9++) {
            if (this.attachMenuBots.bots.get(i9).bot_id == j10) {
                return this.attachMenuBots.bots.get(i9);
            }
        }
        return null;
    }

    public void findStickerSetByNameInCache(String str, Utilities.Callback<TLRPC.TL_messages_stickerSet> callback) {
        if (callback == null) {
            return;
        }
        if (str == null) {
            callback.run(null);
        } else {
            getMessagesStorage().getStorageQueue().postRunnable(new x8(this, str, callback, 0));
        }
    }

    public void generateEmojiPreviewThemes(ArrayList<TLRPC.TL_theme> arrayList, int i9) {
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("emojithemes_config_" + i9, 0).edit();
        edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.TL_theme tL_theme = arrayList.get(i10);
            SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
            tL_theme.serializeToStream(serializedData);
            edit.putString("theme_" + i10, Utilities.bytesToHex(serializedData.toByteArray()));
        }
        edit.apply();
        if (arrayList.isEmpty()) {
            this.defaultEmojiThemes.clear();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiPreviewThemesChanged, new Object[0]);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new bp(org.telegram.ui.ActionBar.b4.c(i9)));
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            org.telegram.ui.ActionBar.b4 d = org.telegram.ui.ActionBar.b4.d(i9, arrayList.get(i11));
            bp bpVar = new bp(d);
            if (d.f.size() >= 4) {
                arrayList2.add(bpVar);
            }
        }
        ChatThemeController.chatThemeQueue.postRunnable(new 3(arrayList2, i9));
    }

    public HashMap<String, ArrayList<TLRPC.Document>> getAllStickers() {
        return this.allStickers;
    }

    public HashMap<String, ArrayList<TLRPC.Document>> getAllStickersFeatured() {
        return this.allStickersFeatured;
    }

    public void getAnimatedEmojiByKeywords(String str, Utilities.Callback<ArrayList<Long>> callback) {
        if (str == null) {
            if (callback != null) {
                callback.run(new ArrayList<>());
            }
        } else {
            Utilities.searchQueue.postRunnable(new gk(str, getStickerSets(5), getFeaturedEmojiSets(), callback, 16));
        }
    }

    public int getArchivedStickersCount(int i9) {
        return this.archivedStickersCount[i9];
    }

    public TLRPC.TL_attachMenuBots getAttachMenuBots() {
        return this.attachMenuBots;
    }

    public TL_bots.BotInfo getBotInfoCached(long j10, long j11) {
        return this.botInfos.get(j10 + "_" + j11);
    }

    public ArrayList<TLRPC.EmojiStatus> getDefaultChannelEmojiStatuses() {
        if (!this.emojiStatusesFromCacheFetched[2]) {
            fetchEmojiStatuses(2, true);
        } else if (this.emojiStatuses[2] == null || (this.emojiStatusesFetchDate[2] != null && (System.currentTimeMillis() / 1000) - this.emojiStatusesFetchDate[2].longValue() > 1800)) {
            fetchEmojiStatuses(2, false);
        }
        return this.emojiStatuses[2];
    }

    public ArrayList<TLRPC.EmojiStatus> getDefaultEmojiStatuses() {
        if (!this.emojiStatusesFromCacheFetched[1]) {
            fetchEmojiStatuses(1, true);
        } else if (this.emojiStatuses[1] == null || (this.emojiStatusesFetchDate[1] != null && (System.currentTimeMillis() / 1000) - this.emojiStatusesFetchDate[1].longValue() > 1800)) {
            fetchEmojiStatuses(1, false);
        }
        return this.emojiStatuses[1];
    }

    public String getDoubleTapReaction() {
        String str = this.doubleTapReaction;
        if (str != null) {
            return str;
        }
        if (getReactionsList().isEmpty()) {
            return null;
        }
        String string = MessagesController.getEmojiSettings(this.currentAccount).getString("reaction_on_double_tap", null);
        if (string == null || (getReactionsMap().get(string) == null && !string.startsWith("animated_"))) {
            return getReactionsList().get(0).reaction;
        }
        this.doubleTapReaction = string;
        return string;
    }

    public TLRPC.DraftMessage getDraft(long j10, long j11) {
        a0.h hVar = (a0.h) this.drafts.f(j10);
        if (hVar == null) {
            return null;
        }
        return (TLRPC.DraftMessage) hVar.f(j11);
    }

    public int getDraftFolderId(long j10) {
        return ((Integer) this.draftsFolderIds.g(0, j10)).intValue();
    }

    public TLRPC.Message getDraftMessage(long j10, long j11) {
        a0.h hVar = (a0.h) this.draftMessages.f(j10);
        if (hVar == null) {
            return null;
        }
        return (TLRPC.Message) hVar.f(j11);
    }

    public DraftVoice getDraftVoice(long j10, long j11) {
        loadDraftVoiceMessages();
        return (DraftVoice) this.draftVoices.f(Objects.hash(Long.valueOf(j10), Long.valueOf(j11)));
    }

    public a0.h getDrafts() {
        return this.drafts;
    }

    public TLRPC.Document getEmojiAnimatedSticker(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String replace = charSequence.toString().replace("️", "");
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = getStickerSets(4);
        int size = stickerSets.size();
        for (int i9 = 0; i9 < size; i9++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i9);
            int size2 = tL_messages_stickerSet.packs.size();
            for (int i10 = 0; i10 < size2; i10++) {
                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i10);
                if (!tL_stickerPack.documents.isEmpty() && TextUtils.equals(tL_stickerPack.emoticon, replace)) {
                    return (TLRPC.Document) getStickerByIds(4).f(tL_stickerPack.documents.get(0).longValue());
                }
            }
        }
        return null;
    }

    public String getEmojiForSticker(long j10) {
        String str = (String) this.stickersByEmoji.f(j10);
        return str != null ? str : "";
    }

    public void getEmojiNames(String[] strArr, String str, Utilities.Callback<ArrayList<String>> callback) {
        if (callback == null || str == null) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new gk(this, strArr, str, callback, 17));
    }

    public void getEmojiSuggestions(String[] strArr, String str, boolean z10, KeywordResultCallback keywordResultCallback, boolean z11) {
        getEmojiSuggestions(strArr, str, z10, keywordResultCallback, null, z11, false, false, null);
    }

    public List<TLRPC.TL_availableReaction> getEnabledReactionsList() {
        return this.enabledReactionsList;
    }

    public ArrayList<TLRPC.MessageEntity> getEntities(CharSequence[] charSequenceArr, boolean z10) {
        return getEntities(charSequenceArr, z10, true);
    }

    public ArrayList<TLRPC.StickerSetCovered> getFeaturedEmojiSets() {
        return this.featuredStickerSets[1];
    }

    public ArrayList<TLRPC.StickerSetCovered> getFeaturedStickerSets() {
        return this.featuredStickerSets[0];
    }

    public long getFeaturedStickersHashWithoutUnread(boolean z10) {
        long j10 = 0;
        for (int i9 = 0; i9 < this.featuredStickerSets[z10 ? 1 : 0].size(); i9++) {
            TLRPC.StickerSet stickerSet = this.featuredStickerSets[z10 ? 1 : 0].get(i9).set;
            if (!stickerSet.archived) {
                j10 = calcHash(j10, stickerSet.id);
            }
        }
        return j10;
    }

    public ArrayList<MessageObject> getFoundMessageObjects() {
        return this.searchResultMessages;
    }

    public TLRPC.Document getGreetingsSticker() {
        TLRPC.Document document = this.greetingsSticker;
        preloadNextGreetingsSticker();
        return document;
    }

    public TLRPC.TL_messages_stickerSet getGroupStickerSetById(TLRPC.StickerSet stickerSet) {
        TLRPC.StickerSet stickerSet2;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.stickerSetsById.f(stickerSet.id);
        if (tL_messages_stickerSet == null) {
            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.groupStickerSets.f(stickerSet.id);
            if (tL_messages_stickerSet != null && (stickerSet2 = tL_messages_stickerSet.set) != null) {
                if (stickerSet2.hash != stickerSet.hash) {
                    loadGroupStickerSet(stickerSet, false);
                }
                return tL_messages_stickerSet;
            }
            loadGroupStickerSet(stickerSet, true);
        }
        return tL_messages_stickerSet;
    }

    public String getLastSearchQuery() {
        return this.lastSearchQuery;
    }

    public int getMask() {
        int i9 = 1;
        if (this.lastReturnedNum >= this.searchResultMessages.size() - 1) {
            boolean[] zArr = this.messagesSearchEndReached;
            if (zArr[0] && zArr[1]) {
                i9 = 0;
            }
        }
        return this.lastReturnedNum > 0 ? i9 | 2 : i9;
    }

    public void getMediaCount(final long j10, final long j11, final int i9, final int i10, boolean z10) {
        if (z10 || DialogObject.isEncryptedDialog(j10)) {
            getMediaCountDatabase(j10, j11, i9, i10);
            return;
        }
        TLRPC.TL_messages_getSearchCounters tL_messages_getSearchCounters = new TLRPC.TL_messages_getSearchCounters();
        if (i9 == 0) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPhotoVideo());
        } else if (i9 == 1) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterDocument());
        } else if (i9 == 2) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterRoundVoice());
        } else if (i9 == 3) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterUrl());
        } else if (i9 == 4) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterMusic());
        } else if (i9 == 5) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterGif());
        } else if (i9 == 8) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPoll());
        }
        if (j11 != 0) {
            if (j10 == getUserConfig().getClientUserId()) {
                tL_messages_getSearchCounters.saved_peer_id = getMessagesController().getInputPeer(j11);
                tL_messages_getSearchCounters.flags = 4 | tL_messages_getSearchCounters.flags;
            } else {
                tL_messages_getSearchCounters.top_msg_id = (int) j11;
                tL_messages_getSearchCounters.flags |= 1;
            }
        }
        TLRPC.InputPeer inputPeer = getMessagesController().getInputPeer(j10);
        tL_messages_getSearchCounters.peer = inputPeer;
        if (inputPeer == null) {
            return;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getSearchCounters, new RequestDelegate() { // from class: org.telegram.messenger.p7
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MediaDataController.this.lambda$getMediaCount$132(j10, j11, i9, i10, tLObject, tL_error);
            }
        }), i10);
    }

    public void getMediaCounts(long j10, long j11, int i9) {
        getMessagesStorage().getStorageQueue().postRunnable(new q7(this, j11, j10, i9, 0));
    }

    public Pair<Long, TLRPC.DraftMessage> getOneThreadDraft(long j10) {
        a0.h hVar = (a0.h) this.drafts.f(j10);
        if (hVar == null || hVar.m() <= 0) {
            return null;
        }
        return new Pair<>(Long.valueOf(hVar.j(0)), hVar.n(0));
    }

    public Integer getPremiumHintAnnualDiscount(boolean z10) {
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList;
        double d;
        int i9;
        double d9;
        n2.l lVar;
        n2.k kVar;
        n2.k kVar2;
        double d10;
        int i10;
        n2.l lVar2;
        n2.k kVar3;
        if ((z10 && (!BillingController.getInstance().isReady() || BillingController.getInstance().getLastPremiumTransaction() == null)) || (tL_help_premiumPromo = this.premiumPromo) == null) {
            return null;
        }
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList2 = tL_help_premiumPromo.period_options;
        int size = arrayList2.size();
        double d11 = 0.0d;
        boolean z11 = false;
        int i11 = 0;
        while (i11 < size) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = arrayList2.get(i11);
            i11++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption;
            if (!z10) {
                kVar2 = null;
                if (tL_premiumSubscriptionOption2.months == 1) {
                    if (BuildVars.useInvoiceBilling()) {
                    }
                    d10 = tL_premiumSubscriptionOption2.amount;
                    i10 = tL_premiumSubscriptionOption2.months;
                    d11 = d10 / i10;
                    z11 = true;
                }
            } else if (tL_premiumSubscriptionOption2.current) {
                kVar2 = null;
                if (Objects.equals(tL_premiumSubscriptionOption2.transaction.replaceAll("^(.*?)(?:\\.\\.\\d*|)$", "$1"), BillingController.getInstance().getLastPremiumTransaction())) {
                    if (!BuildVars.useInvoiceBilling() || (lVar2 = BillingController.PREMIUM_PRODUCT_DETAILS) == null) {
                        d10 = tL_premiumSubscriptionOption2.amount;
                        i10 = tL_premiumSubscriptionOption2.months;
                    } else {
                        ArrayList arrayList3 = lVar2.h;
                        int size2 = arrayList3.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size2) {
                                kVar3 = kVar2;
                                break;
                            }
                            Object obj = arrayList3.get(i12);
                            i12++;
                            kVar3 = (n2.k) obj;
                            String str = ((n2.j) ((ArrayList) kVar3.b.b).get(0)).d;
                            int i13 = tL_premiumSubscriptionOption2.months;
                            if (i13 != 12) {
                                Locale locale = Locale.ROOT;
                                if (str.equals("P" + i13 + "M")) {
                                    break;
                                }
                            } else if (str.equals("P1Y")) {
                                break;
                            }
                        }
                        if (kVar3 == null) {
                            d10 = tL_premiumSubscriptionOption2.amount;
                            i10 = tL_premiumSubscriptionOption2.months;
                        } else {
                            d10 = ((n2.j) ((ArrayList) kVar3.b.b).get(0)).b;
                            i10 = tL_premiumSubscriptionOption2.months;
                        }
                    }
                    d11 = d10 / i10;
                    z11 = true;
                }
            }
        }
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList4 = this.premiumPromo.period_options;
        int size3 = arrayList4.size();
        int i14 = 0;
        int i15 = 0;
        while (i15 < size3) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = arrayList4.get(i15);
            i15++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption4 = tL_premiumSubscriptionOption3;
            if (z11 && tL_premiumSubscriptionOption4.months == 12) {
                if (BuildVars.useInvoiceBilling() || (lVar = BillingController.PREMIUM_PRODUCT_DETAILS) == null) {
                    arrayList = arrayList4;
                    d = tL_premiumSubscriptionOption4.amount;
                    i9 = tL_premiumSubscriptionOption4.months;
                } else {
                    ArrayList arrayList5 = lVar.h;
                    int size4 = arrayList5.size();
                    int i16 = 0;
                    while (true) {
                        if (i16 >= size4) {
                            arrayList = arrayList4;
                            kVar = null;
                            break;
                        }
                        Object obj2 = arrayList5.get(i16);
                        i16++;
                        kVar = (n2.k) obj2;
                        String str2 = ((n2.j) ((ArrayList) kVar.b.b).get(0)).d;
                        int i17 = tL_premiumSubscriptionOption4.months;
                        arrayList = arrayList4;
                        if (i17 != 12) {
                            Locale locale2 = Locale.ROOT;
                            if (str2.equals("P" + i17 + "M")) {
                                break;
                            }
                            arrayList4 = arrayList;
                        } else {
                            if (str2.equals("P1Y")) {
                                break;
                            }
                            arrayList4 = arrayList;
                        }
                    }
                    if (kVar == null) {
                        d9 = tL_premiumSubscriptionOption4.amount / tL_premiumSubscriptionOption4.months;
                        i14 = (int) ((1.0d - (d9 / d11)) * 100.0d);
                    } else {
                        d = ((n2.j) ((ArrayList) kVar.b.b).get(0)).b;
                        i9 = tL_premiumSubscriptionOption4.months;
                    }
                }
                d9 = d / i9;
                i14 = (int) ((1.0d - (d9 / d11)) * 100.0d);
            } else {
                arrayList = arrayList4;
            }
            arrayList4 = arrayList;
        }
        if (!z11 || i14 <= 0) {
            return null;
        }
        return Integer.valueOf(i14);
    }

    public TLRPC.TL_help_premiumPromo getPremiumPromo() {
        return this.premiumPromo;
    }

    public List<TLRPC.TL_availableReaction> getReactionsList() {
        return this.reactionsList;
    }

    public HashMap<String, TLRPC.TL_availableReaction> getReactionsMap() {
        return this.reactionsMap;
    }

    public ArrayList<TLRPC.EmojiStatus> getRecentEmojiStatuses() {
        if (!this.emojiStatusesFromCacheFetched[0]) {
            fetchEmojiStatuses(0, true);
        } else if (this.emojiStatuses[0] == null || (this.emojiStatusesFetchDate[0] != null && (System.currentTimeMillis() / 1000) - this.emojiStatusesFetchDate[0].longValue() > 1800)) {
            fetchEmojiStatuses(0, false);
        }
        return this.emojiStatuses[0];
    }

    public ArrayList<TLRPC.Document> getRecentGifs() {
        return new ArrayList<>(this.recentGifs);
    }

    public ArrayList<TLRPC.Reaction> getRecentReactions() {
        return this.recentReactions;
    }

    public ArrayList<TLRPC.Document> getRecentStickers(int i9) {
        return getRecentStickers(i9, false);
    }

    public ArrayList<TLRPC.Document> getRecentStickersNoCopy(int i9) {
        return this.recentStickers[i9];
    }

    public ArrayList<TLRPC.Reaction> getSavedReactions() {
        return this.savedReactions;
    }

    public int getSearchCount() {
        if (this.searchServerResultMessages.isEmpty()) {
            int[] iArr = this.messagesSearchCount;
            return Math.max(Math.max(iArr[0] + iArr[1], this.messagesLocalSearchCount), this.searchServerResultMessages.size());
        }
        int[] iArr2 = this.messagesSearchCount;
        return Math.max(iArr2[0] + iArr2[1], this.searchServerResultMessages.size());
    }

    public int getSearchPosition() {
        return this.lastReturnedNum;
    }

    public a0.h getStickerByIds(int i9) {
        return this.stickersByIds[i9];
    }

    public TLRPC.TL_messages_stickerSet getStickerSet(TLRPC.StickerSet stickerSet, boolean z10) {
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.id = stickerSet.id;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        return getStickerSet(tL_inputStickerSetID, z10);
    }

    public TLRPC.TL_messages_stickerSet getStickerSetByEmojiOrName(String str) {
        return this.diceStickerSetsByEmoji.get(str);
    }

    public TLRPC.TL_messages_stickerSet getStickerSetById(long j10) {
        return (TLRPC.TL_messages_stickerSet) this.stickerSetsById.f(j10);
    }

    public TLRPC.TL_messages_stickerSet getStickerSetByName(String str) {
        if (str == null) {
            return null;
        }
        return this.stickerSetsByName.get(str.toLowerCase());
    }

    public String getStickerSetName(long j10) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.stickerSetsById.f(j10);
        if (tL_messages_stickerSet != null) {
            return tL_messages_stickerSet.set.short_name;
        }
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.featuredStickerSetsById[0].f(j10);
        if (stickerSetCovered != null) {
            return stickerSetCovered.set.short_name;
        }
        TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) this.featuredStickerSetsById[1].f(j10);
        if (stickerSetCovered2 != null) {
            return stickerSetCovered2.set.short_name;
        }
        return null;
    }

    public ArrayList<TLRPC.TL_messages_stickerSet> getStickerSets(int i9) {
        return i9 == 3 ? this.stickerSets[2] : this.stickerSets[i9];
    }

    public ArrayList<TLRPC.Reaction> getTopReactions() {
        return this.topReactions;
    }

    public ArrayList<Long> getUnreadEmojiSets() {
        return this.unreadStickerSets[1];
    }

    public ArrayList<Long> getUnreadStickerSets() {
        return this.unreadStickerSets[0];
    }

    public boolean hasRecentGif(TLRPC.Document document) {
        for (int i9 = 0; i9 < this.recentGifs.size(); i9++) {
            TLRPC.Document document2 = this.recentGifs.get(i9);
            if (document2.id == document.id) {
                this.recentGifs.remove(i9);
                this.recentGifs.add(0, document2);
                return true;
            }
        }
        return false;
    }

    public void increaseGuestRating(long j10) {
        increaseInlineRating(j10, true);
    }

    public void increaseInlineRating(long j10) {
        increaseInlineRating(j10, false);
    }

    public void increasePeerRaiting(long j10) {
        TLRPC.User user;
        if (!getUserConfig().suggestContacts || !DialogObject.isUserDialog(j10) || (user = getMessagesController().getUser(Long.valueOf(j10))) == null || user.bot || user.self) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new a7(this, j10, 1));
    }

    public void increaseWebappRating(long j10) {
        TLRPC.TL_topPeer tL_topPeer;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        if (user == null || !user.bot) {
            return;
        }
        int max = getUserConfig().webappRatingLoadTime != 0 ? Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - getUserConfig().webappRatingLoadTime) : 60;
        int i9 = 0;
        while (true) {
            if (i9 >= this.webapps.size()) {
                tL_topPeer = null;
                break;
            }
            tL_topPeer = this.webapps.get(i9);
            if (tL_topPeer.peer.user_id == j10) {
                break;
            } else {
                i9++;
            }
        }
        if (tL_topPeer == null) {
            tL_topPeer = new TLRPC.TL_topPeer();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_topPeer.peer = tL_peerUser;
            tL_peerUser.user_id = j10;
            this.webapps.add(tL_topPeer);
        }
        tL_topPeer.rating = Math.exp(max / getMessagesController().ratingDecay) + tL_topPeer.rating;
        Collections.sort(this.webapps, new q(9));
        if (this.webapps.size() > 20) {
            aa.d.u(1, this.webapps);
        }
        savePeer(j10, 2, tL_topPeer.rating);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadWebappsHints, new Object[0]);
    }

    public void installShortcut(long j10, int i9) {
        installShortcut(j10, i9, null);
    }

    public boolean isLoadingStickers(int i9) {
        return this.loadingStickers[i9];
    }

    public boolean isMenuBotsUpdatedLocal() {
        return this.menuBotsUpdatedLocal;
    }

    public boolean isMessageFound(int i9, boolean z10) {
        return this.searchServerResultMessagesMap[z10 ? 1 : 0].indexOfKey(i9) >= 0;
    }

    public boolean isSearchLoading() {
        return this.reqId != 0;
    }

    public boolean isShortcutAdded(long j10, int i9) {
        if (Build.VERSION.SDK_INT >= 26) {
            String str = (i9 == SHORTCUT_TYPE_USER_OR_CHAT ? "sdid_" : "bdid_") + j10;
            List k10 = g0.f.k(ApplicationLoader.applicationContext);
            for (int i10 = 0; i10 < k10.size(); i10++) {
                if (((g0.c) k10.get(i10)).b.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isStickerInFavorites(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        for (int i9 = 0; i9 < this.recentStickers[2].size(); i9++) {
            TLRPC.Document document2 = this.recentStickers[2].get(i9);
            if (document2.id == document.id && document2.dc_id == document.dc_id) {
                return true;
            }
        }
        return false;
    }

    public boolean isStickerPackInstalled(long j10) {
        return isStickerPackInstalled(j10, true);
    }

    public boolean isStickerPackUnread(boolean z10, long j10) {
        return this.unreadStickerSets[z10 ? 1 : 0].contains(Long.valueOf(j10));
    }

    public void jumpToSearchedMessage(int i9, int i10) {
        if (i10 < 0 || i10 >= this.searchResultMessages.size()) {
            return;
        }
        this.lastReturnedNum = i10;
        MessageObject messageObject = this.searchResultMessages.get(i10);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i9), Integer.valueOf(messageObject.getId()), Integer.valueOf(getMask()), Long.valueOf(messageObject.getDialogId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.TRUE);
    }

    public void loadArchivedStickersCount(int i9, boolean z10) {
        int i10 = 0;
        if (!z10) {
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            tL_messages_getArchivedStickers.limit = 0;
            tL_messages_getArchivedStickers.masks = i9 == 1;
            tL_messages_getArchivedStickers.emojis = i9 == 5;
            getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new l7(this, i9, i10));
            return;
        }
        int i11 = MessagesController.getNotificationsSettings(this.currentAccount).getInt("archivedStickersCount" + i9, -1);
        if (i11 == -1) {
            loadArchivedStickersCount(i9, false);
        } else {
            this.archivedStickersCount[i9] = i11;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.archivedStickersCountDidLoad, Integer.valueOf(i9));
        }
    }

    public void loadAttachMenuBots(boolean z10, boolean z11) {
        loadAttachMenuBots(z10, z11, null);
    }

    public void loadBotInfo(long j10, long j11, boolean z10, int i9) {
        loadBotInfo(j10, j11, z10, i9, null);
    }

    public void loadBotKeyboard(MessagesStorage.TopicKey topicKey) {
        loadBotKeyboard(topicKey, false);
    }

    public void loadDraftsIfNeed() {
        if (getUserConfig().draftsLoaded || this.loadingDrafts) {
            return;
        }
        this.loadingDrafts = true;
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_getAllDrafts(), new k7(this, 6));
    }

    public void loadEmojiThemes() {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("emojithemes_config_" + this.currentAccount, 0);
        int i9 = sharedPreferences.getInt(NotificationBadge.NewHtcHomeBadger.COUNT, 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new bp(org.telegram.ui.ActionBar.b4.c(this.currentAccount)));
        for (int i10 = 0; i10 < i9; i10++) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(sharedPreferences.getString("theme_" + i10, "")));
            try {
                org.telegram.ui.ActionBar.b4 d = org.telegram.ui.ActionBar.b4.d(this.currentAccount, TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true));
                if (d.f.size() >= 4) {
                    arrayList.add(new bp(d));
                }
                ChatThemeController.chatThemeQueue.postRunnable(new 2(arrayList));
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void loadFeaturedStickers(boolean z10, boolean z11) {
        long j10;
        TLRPC.TL_messages_getFeaturedStickers tL_messages_getFeaturedStickers;
        boolean[] zArr = this.loadingFeaturedStickers;
        if (zArr[z10 ? 1 : 0]) {
            return;
        }
        zArr[z10 ? 1 : 0] = true;
        if (z11) {
            getMessagesStorage().getStorageQueue().postRunnable(new z7(this, z10, 0));
            return;
        }
        if (z10) {
            TLRPC.TL_messages_getFeaturedEmojiStickers tL_messages_getFeaturedEmojiStickers = new TLRPC.TL_messages_getFeaturedEmojiStickers();
            j10 = this.loadFeaturedHash[1];
            tL_messages_getFeaturedEmojiStickers.hash = j10;
            tL_messages_getFeaturedStickers = tL_messages_getFeaturedEmojiStickers;
        } else {
            TLRPC.TL_messages_getFeaturedStickers tL_messages_getFeaturedStickers2 = new TLRPC.TL_messages_getFeaturedStickers();
            j10 = this.loadFeaturedHash[0];
            tL_messages_getFeaturedStickers2.hash = j10;
            tL_messages_getFeaturedStickers = tL_messages_getFeaturedStickers2;
        }
        getConnectionsManager().sendRequest(tL_messages_getFeaturedStickers, new a8(this, z10, j10, 0));
    }

    public void loadHints(boolean z10) {
        if (this.loading || !getUserConfig().suggestContacts) {
            return;
        }
        if (z10) {
            if (this.loaded) {
                return;
            }
            this.loading = true;
            getMessagesStorage().getStorageQueue().postRunnable(new g7(this, 12));
            this.loaded = true;
            return;
        }
        this.loading = true;
        TLRPC.TL_contacts_getTopPeers tL_contacts_getTopPeers = new TLRPC.TL_contacts_getTopPeers();
        tL_contacts_getTopPeers.hash = 0L;
        tL_contacts_getTopPeers.bots_pm = false;
        tL_contacts_getTopPeers.correspondents = true;
        tL_contacts_getTopPeers.groups = false;
        tL_contacts_getTopPeers.channels = false;
        tL_contacts_getTopPeers.bots_inline = true;
        tL_contacts_getTopPeers.bots_guestchat = true;
        tL_contacts_getTopPeers.bots_app = true;
        tL_contacts_getTopPeers.offset = 0;
        tL_contacts_getTopPeers.limit = 20;
        getConnectionsManager().sendRequestTyped(tL_contacts_getTopPeers, new a(), new he(this, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadMedia(final long j10, final int i9, final int i10, final int i11, final int i12, final long j11, int i13, final int i14, final int i15, hg.r0 r0Var, String str) {
        MediaDataController mediaDataController;
        final boolean z10;
        TLRPC.TL_messages_search tL_messages_search;
        if (DialogObject.isChatDialog(j10)) {
            mediaDataController = this;
            if (ChatObject.isChannel(-j10, mediaDataController.currentAccount)) {
                z10 = true;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("load media did " + j10 + " count = " + i9 + " max_id " + i10 + " type = " + i12 + " cache = " + i13 + " classGuid = " + i14);
                }
                if ((i13 == 0 && TextUtils.isEmpty(str)) || DialogObject.isEncryptedDialog(j10)) {
                    mediaDataController.loadMediaDatabase(j10, i9, i10, i11, i12, j11, r0Var, i14, z10, i13, i15);
                    return;
                }
                tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = i9;
                if (i11 == 0) {
                    tL_messages_search.offset_id = i11;
                    tL_messages_search.add_offset = -i9;
                } else {
                    tL_messages_search.offset_id = i10;
                }
                if (r0Var != null) {
                    tL_messages_search.flags |= 8;
                    tL_messages_search.saved_reaction.add(r0Var.g());
                }
                if (i12 != 0) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
                } else if (i12 == 6) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhotos();
                } else if (i12 == 7) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterVideo();
                } else if (i12 == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (i12 == 2) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterRoundVoice();
                } else if (i12 == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (i12 == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                } else if (i12 == 5) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterGif();
                } else if (i12 == 8) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPoll();
                }
                if (TextUtils.isEmpty(str)) {
                    tL_messages_search.q = str;
                } else {
                    tL_messages_search.q = "";
                }
                tL_messages_search.peer = getMessagesController().getInputPeer(j10);
                if (j11 != 0) {
                    if (j10 == getUserConfig().getClientUserId()) {
                        tL_messages_search.saved_peer_id = getMessagesController().getInputPeer(j11);
                        tL_messages_search.flags |= 4;
                    } else {
                        tL_messages_search.top_msg_id = (int) j11;
                        tL_messages_search.flags |= 2;
                    }
                }
                if (tL_messages_search.peer != null) {
                    return;
                }
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() { // from class: org.telegram.messenger.u7
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        MediaDataController.this.lambda$loadMedia$126(j10, i11, i9, i10, i12, j11, i14, z10, i15, tLObject, tL_error);
                    }
                }), i14);
                return;
            }
        } else {
            mediaDataController = this;
        }
        z10 = false;
        if (BuildVars.LOGS_ENABLED) {
        }
        if (i13 == 0) {
        }
        tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i9;
        if (i11 == 0) {
        }
        if (r0Var != null) {
        }
        if (i12 != 0) {
        }
        if (TextUtils.isEmpty(str)) {
        }
        tL_messages_search.peer = getMessagesController().getInputPeer(j10);
        if (j11 != 0) {
        }
        if (tL_messages_search.peer != null) {
        }
    }

    public void loadMoreSearchMessages(boolean z10) {
        if (this.loadingMoreSearchMessages || this.reqId != 0) {
            return;
        }
        boolean[] zArr = this.messagesSearchEndReached;
        if (zArr[0] && this.lastMergeDialogId == 0 && zArr[1]) {
            return;
        }
        int i9 = this.lastReturnedNum;
        this.lastReturnedNum = this.searchResultMessages.size();
        this.loadingMoreSearchMessages = true;
        searchMessagesInChat(null, this.lastDialogId, this.lastMergeDialogId, this.lastGuid, 1, this.lastReplyMessageId, false, this.lastSearchUser, this.lastSearchChat, false, this.lastReaction);
        this.lastReturnedNum = i9;
    }

    public void loadMusic(long j10, long j11, long j12) {
        getMessagesStorage().getStorageQueue().postRunnable(new m0(this, j10, j11, j12, 1));
    }

    public void loadPinnedMessages(final long j10, final int i9, final int i10) {
        if (this.loadingPinnedMessages.h(j10) >= 0) {
            return;
        }
        this.loadingPinnedMessages.k(Boolean.TRUE, j10);
        final TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.peer = getMessagesController().getInputPeer(j10);
        tL_messages_search.limit = 40;
        tL_messages_search.offset_id = i9;
        tL_messages_search.q = "";
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPinned();
        getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() { // from class: org.telegram.messenger.c9
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MediaDataController.this.lambda$loadPinnedMessages$162(i10, tL_messages_search, j10, i9, tLObject, tL_error);
            }
        });
    }

    public void loadPremiumPromo(boolean z10) {
        this.isLoadingPremiumPromo = true;
        if (z10) {
            getMessagesStorage().getStorageQueue().postRunnable(new g7(this, 6));
        } else {
            getConnectionsManager().sendRequest(new TLRPC.TL_help_getPremiumPromo(), new k7(this, 3));
        }
    }

    public void loadReactions(boolean z10, Integer num) {
        this.isLoadingReactions = true;
        if (z10) {
            getMessagesStorage().getStorageQueue().postRunnable(new g7(this, 10));
            return;
        }
        TLRPC.TL_messages_getAvailableReactions tL_messages_getAvailableReactions = new TLRPC.TL_messages_getAvailableReactions();
        tL_messages_getAvailableReactions.hash = num != null ? num.intValue() : this.reactionsUpdateHash;
        getConnectionsManager().sendRequest(tL_messages_getAvailableReactions, new k7(this, 4));
    }

    public void loadRecentAndTopReactions(boolean z10) {
        if (this.loadingRecentReactions) {
            return;
        }
        if (!this.loadedRecentReactions || z10) {
            final SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("recent_reactions_" + this.currentAccount, 0);
            final SharedPreferences sharedPreferences2 = ApplicationLoader.applicationContext.getSharedPreferences("top_reactions_" + this.currentAccount, 0);
            this.recentReactions.clear();
            this.topReactions.clear();
            this.recentReactions.addAll(loadReactionsFromPref(sharedPreferences));
            this.topReactions.addAll(loadReactionsFromPref(sharedPreferences2));
            this.loadingRecentReactions = true;
            this.loadedRecentReactions = true;
            final boolean[] zArr = new boolean[2];
            TLRPC.TL_messages_getRecentReactions tL_messages_getRecentReactions = new TLRPC.TL_messages_getRecentReactions();
            tL_messages_getRecentReactions.hash = sharedPreferences.getLong("hash", 0L);
            tL_messages_getRecentReactions.limit = 50;
            final int i9 = 0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getRecentReactions, new RequestDelegate(this) { // from class: org.telegram.messenger.b9
                public final /* synthetic */ MediaDataController b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i9) {
                        case 0:
                            this.b.lambda$loadRecentAndTopReactions$236(sharedPreferences, zArr, tLObject, tL_error);
                            break;
                        default:
                            this.b.lambda$loadRecentAndTopReactions$238(sharedPreferences, zArr, tLObject, tL_error);
                            break;
                    }
                }
            });
            TLRPC.TL_messages_getTopReactions tL_messages_getTopReactions = new TLRPC.TL_messages_getTopReactions();
            tL_messages_getTopReactions.hash = sharedPreferences2.getLong("hash", 0L);
            tL_messages_getTopReactions.limit = 100;
            final int i10 = 1;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getTopReactions, new RequestDelegate(this) { // from class: org.telegram.messenger.b9
                public final /* synthetic */ MediaDataController b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i10) {
                        case 0:
                            this.b.lambda$loadRecentAndTopReactions$236(sharedPreferences2, zArr, tLObject, tL_error);
                            break;
                        default:
                            this.b.lambda$loadRecentAndTopReactions$238(sharedPreferences2, zArr, tLObject, tL_error);
                            break;
                    }
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        r10 = org.telegram.messenger.MessagesController.getEmojiSettings(r7.currentAccount);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r11 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r9 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r10 = r10.getLong("lastGifLoadTime", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        if (java.lang.Math.abs(java.lang.System.currentTimeMillis() - r10) >= 3600000) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008e, code lost:
    
        if (r9 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0090, code lost:
    
        r7.loadingRecentGifs = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        r7.loadingRecentStickers[r8] = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        if (r8 != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        r10 = r10.getLong("lastStickersLoadTime", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r8 != 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        r10 = r10.getLong("lastStickersLoadTimeMask", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r8 != 3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        r10 = r10.getLong("lastStickersLoadTimeGreet", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (r8 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        r10 = r10.getLong("lastStickersLoadTimeEmojiPacks", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        if (r8 != 7) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
    
        r10 = r10.getLong("lastStickersLoadTimePremiumStickers", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
    
        r10 = r10.getLong("lastStickersLoadTimeFavs", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        if (r9 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        r9 = new org.telegram.tgnet.TLRPC.TL_messages_getSavedGifs();
        r9.hash = calcDocumentsHash(r7.recentGifs);
        getConnectionsManager().sendRequest(r9, new org.telegram.messenger.l7(r7, r8, 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b6, code lost:
    
        if (r8 != 2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
    
        r9 = new org.telegram.tgnet.TLRPC.TL_messages_getFavedStickers();
        r9.hash = calcDocumentsHash(r7.recentStickers[r8]);
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012e, code lost:
    
        getConnectionsManager().sendRequest(r9, new org.telegram.messenger.l7(r7, r8, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x013b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cb, code lost:
    
        if (r8 != 3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cd, code lost:
    
        r10 = new org.telegram.tgnet.TLRPC.TL_messages_getStickers();
        r10.emoticon = "👋" + org.telegram.messenger.Emoji.fixEmoji("⭐");
        r10.hash = calcDocumentsHash(r7.recentStickers[r8]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f1, code lost:
    
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f3, code lost:
    
        if (r8 != 7) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f5, code lost:
    
        r10 = new org.telegram.tgnet.TLRPC.TL_messages_getStickers();
        r10.emoticon = "📂" + org.telegram.messenger.Emoji.fixEmoji("⭐");
        r10.hash = calcDocumentsHash(r7.recentStickers[r8]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011a, code lost:
    
        r9 = new org.telegram.tgnet.TLRPC.TL_messages_getRecentStickers();
        r9.hash = calcDocumentsHash(r7.recentStickers[r8]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0129, code lost:
    
        if (r8 != 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012b, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012c, code lost:
    
        r9.attached = r0;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x001e, code lost:
    
        if (r7.recentStickersLoaded[r8] != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (r7.recentGifsLoaded != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r10 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        getMessagesStorage().getStorageQueue().postRunnable(new org.telegram.messenger.o8(r7, r9, r8, 0));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [org.telegram.tgnet.TLRPC$TL_messages_getStickers] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [org.telegram.tgnet.TLRPC$TL_messages_getStickers] */
    /* JADX WARN: Type inference failed for: r9v14, types: [org.telegram.tgnet.TLRPC$TL_messages_getFavedStickers] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadRecents(int i9, boolean z10, boolean z11, boolean z12) {
        boolean z13 = false;
        if (!z10) {
            boolean[] zArr = this.loadingRecentStickers;
            if (zArr[i9]) {
            } else {
                zArr[i9] = true;
            }
        } else if (this.loadingRecentGifs) {
        } else {
            this.loadingRecentGifs = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadReplyIcons() {
        Throwable th;
        TLRPC.TL_emojiList tL_emojiList;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("replyicons_" + this.currentAccount, 0);
        TLRPC.TL_emojiList tL_emojiList2 = null;
        String string = sharedPreferences.getString("replyicons", null);
        long j10 = sharedPreferences.getLong("replyicons_last_check", 0L);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                tL_emojiList = (TLRPC.TL_emojiList) TLRPC.EmojiList.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                try {
                    this.replyIconsDefault = tL_emojiList;
                } catch (Throwable th2) {
                    th = th2;
                    FileLog.e(th);
                    tL_emojiList2 = tL_emojiList;
                    if (tL_emojiList2 != null) {
                    }
                    TL_account.getDefaultBackgroundEmojis getdefaultbackgroundemojis = new TL_account.getDefaultBackgroundEmojis();
                    if (tL_emojiList2 != null) {
                    }
                    getConnectionsManager().sendRequest(getdefaultbackgroundemojis, new t6(this, sharedPreferences, 2));
                }
            } catch (Throwable th3) {
                th = th3;
                tL_emojiList = null;
            }
            tL_emojiList2 = tL_emojiList;
        }
        if (tL_emojiList2 != null || System.currentTimeMillis() - j10 > 86400000 || BuildVars.DEBUG_PRIVATE_VERSION) {
            TL_account.getDefaultBackgroundEmojis getdefaultbackgroundemojis2 = new TL_account.getDefaultBackgroundEmojis();
            if (tL_emojiList2 != null) {
                getdefaultbackgroundemojis2.hash = tL_emojiList2.hash;
            }
            getConnectionsManager().sendRequest(getdefaultbackgroundemojis2, new t6(this, sharedPreferences, 2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x01fb, code lost:
    
        if (r13 != 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0209, code lost:
    
        r13 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x020b, code lost:
    
        r1 = r5.replyMessageObject;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x020d, code lost:
    
        if (r1 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x020f, code lost:
    
        r1 = r1.messageOwner;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0211, code lost:
    
        if (r1 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0213, code lost:
    
        r1 = r1.peer_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0215, code lost:
    
        if (r1 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0219, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageEmpty) == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0220, code lost:
    
        if (r1.channel_id != r13) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0228, code lost:
    
        if (r23 == org.telegram.messenger.UserObject.REPLY_BOT) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x022c, code lost:
    
        if (r13 == r18) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0237, code lost:
    
        if (r5.getDialogId() == (-r13)) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0239, code lost:
    
        r0 = org.telegram.messenger.MessagesController.getInstance(r21.currentAccount).getChat(java.lang.Long.valueOf(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0247, code lost:
    
        if (r0 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x024d, code lost:
    
        if (org.telegram.messenger.ChatObject.isPublic(r0) != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0255, code lost:
    
        r0 = (android.util.SparseArray) r8.f(r23);
        r1 = (java.util.ArrayList) r9.f(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0261, code lost:
    
        if (r0 != null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0263, code lost:
    
        r0 = new android.util.SparseArray();
        r8.k(r0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x026b, code lost:
    
        if (r1 != null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x026d, code lost:
    
        r1 = org.telegram.messenger.l0.j(r13, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0271, code lost:
    
        r18 = (java.util.ArrayList) r0.get(r2);
        r19 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0279, code lost:
    
        if (r18 != null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x027b, code lost:
    
        r4 = new java.util.ArrayList();
        r0.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x028b, code lost:
    
        if (r1.contains(java.lang.Integer.valueOf(r2)) != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x028d, code lost:
    
        r1.add(java.lang.Integer.valueOf(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0297, code lost:
    
        r4.add(r5);
        org.telegram.messenger.Timer.log(r30, "+message did=" + (-r13) + " mid=" + r2 + " at replied #" + r5.getId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0295, code lost:
    
        r4 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0206, code lost:
    
        if (r13 != 0) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03a4 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadReplyMessagesForMessages(ArrayList<MessageObject> arrayList, long j10, int i9, long j11, Runnable runnable, int i10, Timer timer) {
        a0.h hVar;
        Timer.Task task;
        int i11;
        a0.h hVar2;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        int i12;
        MessageObject messageObject;
        long j12;
        long j13;
        ArrayList<MessageObject> arrayList2 = arrayList;
        boolean z10 = i9 == 1;
        if (DialogObject.isEncryptedDialog(j10)) {
            Timer.Task start = Timer.start(timer, "loadReplyMessagesForMessages: (encrypted) finding messages to load");
            ArrayList arrayList3 = new ArrayList();
            a0.h hVar3 = new a0.h();
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                MessageObject messageObject2 = arrayList2.get(i13);
                if (messageObject2 != null && messageObject2.isReply() && messageObject2.replyMessageObject == null) {
                    long j14 = messageObject2.messageOwner.reply_to.reply_to_random_id;
                    ArrayList arrayList4 = (ArrayList) hVar3.f(j14);
                    if (arrayList4 == null) {
                        arrayList4 = l0.j(j14, hVar3);
                    }
                    arrayList4.add(messageObject2);
                    if (!arrayList3.contains(Long.valueOf(j14))) {
                        arrayList3.add(Long.valueOf(j14));
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                Timer.done(start);
                getMessagesStorage().getStorageQueue().postRunnable(new i8(this, Timer.start(timer, "loadReplyMessagesForMessages (encrypted) storageQueue.postRunnable"), timer, arrayList3, j10, hVar3, runnable));
                return;
            } else {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        a0.h hVar4 = new a0.h();
        a0.h hVar5 = new a0.h();
        Timer.Task start2 = Timer.start(timer, "loadReplyMessagesForMessages: filling replies from the same array");
        int i14 = 0;
        while (true) {
            hVar = null;
            if (i14 >= arrayList2.size()) {
                break;
            }
            MessageObject messageObject3 = arrayList2.get(i14);
            if (messageObject3 != null && !messageObject3.isReplyToStory() && messageObject3.isReply() && messageObject3.getRealId() > 0) {
                TLRPC.MessageReplyHeader messageReplyHeader = messageObject3.messageOwner.reply_to;
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i15 = messageReplyHeader.reply_to_msg_id;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= arrayList2.size()) {
                            break;
                        }
                        if (i14 == i16 || arrayList2.get(i16) == null || arrayList2.get(i16).getRealId() != i15) {
                            i16++;
                        } else {
                            messageObject3.replyMessageObject = arrayList2.get(i16);
                            messageObject3.applyTimestampsHighlightForReplyMsg();
                            TLRPC.MessageAction messageAction = messageObject3.messageOwner.action;
                            if (messageAction instanceof TLRPC.TL_messageActionPinMessage) {
                                messageObject3.generatePinMessageText(null, null);
                            } else if (messageAction instanceof TLRPC.TL_messageActionGameScore) {
                                messageObject3.generateGameMessageText(null);
                            } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSent) {
                                messageObject3.generatePaymentSentMessageText(null, false);
                            } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSentMe) {
                                messageObject3.generatePaymentSentMessageText(null, true);
                            } else if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                                messageObject3.generateSuggestionApprovalMessageText();
                            }
                        }
                    }
                }
            }
            i14++;
        }
        Timer.done(start2);
        Timer.Task start3 = Timer.start(timer, "loadReplyMessagesForMessages: gathering ids of missing reply data");
        int i17 = 0;
        while (i17 < arrayList2.size()) {
            MessageObject messageObject4 = arrayList2.get(i17);
            if (messageObject4 == null) {
                task = start3;
                hVar2 = hVar;
            } else {
                int i18 = messageObject4.type;
                if (i18 == 23 || i18 == 24) {
                    task = start3;
                    i11 = i17;
                    hVar2 = hVar;
                    TLRPC.MessageMedia messageMedia2 = messageObject4.messageOwner.media;
                    if (messageMedia2.storyItem == null) {
                        long peerDialogId = DialogObject.getPeerDialogId(messageMedia2.peer);
                        hVar = hVar2 == null ? new a0.h() : hVar2;
                        ArrayList arrayList5 = (ArrayList) hVar.f(peerDialogId);
                        if (arrayList5 == null) {
                            arrayList5 = l0.j(peerDialogId, hVar);
                        }
                        StringBuilder s10 = aa.d.s(peerDialogId, "+story did=", " at ");
                        s10.append(messageObject4.type == 23 ? "forwarded" : "mentioned");
                        s10.append(" #");
                        s10.append(messageObject4.getId());
                        Timer.log(timer, s10.toString());
                        arrayList5.add(messageObject4);
                        if (messageObject4.type == 0 && (message = messageObject4.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                            i12 = 0;
                            while (i12 < messageObject4.messageOwner.media.webpage.attributes.size()) {
                                TLRPC.WebPageAttribute webPageAttribute = messageObject4.messageOwner.media.webpage.attributes.get(i12);
                                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                                    TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute;
                                    if (tL_webPageAttributeStory.storyItem == null) {
                                        long peerDialogId2 = DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer);
                                        if (hVar == null) {
                                            hVar = new a0.h();
                                        }
                                        ArrayList arrayList6 = (ArrayList) hVar.f(peerDialogId2);
                                        if (arrayList6 == null) {
                                            arrayList6 = l0.j(peerDialogId2, hVar);
                                        }
                                        StringBuilder s11 = aa.d.s(peerDialogId2, "+story did=", " at webpage of #");
                                        s11.append(messageObject4.getId());
                                        Timer.log(timer, s11.toString());
                                        arrayList6.add(messageObject4);
                                    } else {
                                        messageObject = messageObject4;
                                        tL_webPageAttributeStory.storyItem = ih.i7.c(this.currentAccount, DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer), tL_webPageAttributeStory.storyItem);
                                        i12++;
                                        messageObject4 = messageObject;
                                    }
                                }
                                messageObject = messageObject4;
                                i12++;
                                messageObject4 = messageObject;
                            }
                        }
                    } else {
                        long peerDialogId3 = DialogObject.getPeerDialogId(messageMedia2.peer);
                        TLRPC.MessageMedia messageMedia3 = messageObject4.messageOwner.media;
                        messageMedia3.storyItem = ih.i7.c(this.currentAccount, peerDialogId3, messageMedia3.storyItem);
                        hVar = hVar2;
                        if (messageObject4.type == 0) {
                            i12 = 0;
                            while (i12 < messageObject4.messageOwner.media.webpage.attributes.size()) {
                            }
                        }
                    }
                } else {
                    if (messageObject4.getRealId() <= 0 || !messageObject4.isReplyToStory()) {
                        task = start3;
                        if (messageObject4.getRealId() > 0 && messageObject4.isReply()) {
                            TLRPC.Message message2 = messageObject4.messageOwner;
                            TLRPC.MessageReplyHeader messageReplyHeader2 = message2.reply_to;
                            int i19 = messageReplyHeader2.reply_to_msg_id;
                            hVar2 = hVar;
                            if (i19 != j11) {
                                TLRPC.Peer peer = messageReplyHeader2.reply_to_peer_id;
                                if (peer != null) {
                                    j12 = 0;
                                    j13 = peer.channel_id;
                                } else {
                                    j12 = 0;
                                    j13 = message2.peer_id.channel_id;
                                }
                            }
                        }
                    } else {
                        TLRPC.Message message3 = messageObject4.messageOwner;
                        if (message3.replyStory == null) {
                            long peerDialogId4 = DialogObject.getPeerDialogId(message3.reply_to.peer);
                            if (hVar == null) {
                                hVar = new a0.h();
                            }
                            ArrayList arrayList7 = (ArrayList) hVar.f(peerDialogId4);
                            if (arrayList7 == null) {
                                arrayList7 = l0.j(peerDialogId4, hVar);
                            }
                            StringBuilder s12 = aa.d.s(peerDialogId4, "+story did=", " at replied #");
                            s12.append(messageObject4.getId());
                            Timer.log(timer, s12.toString());
                            arrayList7.add(messageObject4);
                            task = start3;
                            i11 = i17;
                            if (messageObject4.type == 0) {
                            }
                        } else {
                            long peerDialogId5 = DialogObject.getPeerDialogId(message3.reply_to.peer);
                            TLRPC.Message message4 = messageObject4.messageOwner;
                            task = start3;
                            message4.replyStory = ih.i7.c(this.currentAccount, peerDialogId5, message4.replyStory);
                        }
                    }
                    i11 = i17;
                    hVar2 = hVar;
                    hVar = hVar2;
                    if (messageObject4.type == 0) {
                    }
                }
                i17 = i11 + 1;
                arrayList2 = arrayList;
                start3 = task;
            }
            i11 = i17;
            hVar = hVar2;
            i17 = i11 + 1;
            arrayList2 = arrayList;
            start3 = task;
        }
        a0.h hVar6 = hVar;
        Timer.done(start3);
        if (hVar4.i() && hVar6 == null) {
            if (runnable != null) {
                runnable.run();
            }
        } else {
            getMessagesStorage().getStorageQueue().postRunnable(new j8(this, Timer.start(timer, "loadReplyMessagesForMessages: storageQueue.postRunnable"), hVar6, new AtomicInteger(2), runnable, i10, timer, hVar4, hVar5, z10, j10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadRestrictedStatusEmojis() {
        Throwable th;
        TLRPC.TL_emojiList tL_emojiList;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("restrictedstatuses_" + this.currentAccount, 0);
        TLRPC.TL_emojiList tL_emojiList2 = null;
        String string = sharedPreferences.getString("restrictedstatuses", null);
        long j10 = sharedPreferences.getLong("restrictedstatuses_last_check", 0L);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                tL_emojiList = (TLRPC.TL_emojiList) TLRPC.EmojiList.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                try {
                    this.restrictedStatusEmojis = tL_emojiList;
                } catch (Throwable th2) {
                    th = th2;
                    FileLog.e(th);
                    tL_emojiList2 = tL_emojiList;
                    if (tL_emojiList2 != null) {
                    }
                    TL_account.getChannelRestrictedStatusEmojis getchannelrestrictedstatusemojis = new TL_account.getChannelRestrictedStatusEmojis();
                    if (tL_emojiList2 != null) {
                    }
                    getConnectionsManager().sendRequest(getchannelrestrictedstatusemojis, new t6(this, sharedPreferences, 0));
                }
            } catch (Throwable th3) {
                th = th3;
                tL_emojiList = null;
            }
            tL_emojiList2 = tL_emojiList;
        }
        if (tL_emojiList2 != null || System.currentTimeMillis() - j10 > 86400000) {
            TL_account.getChannelRestrictedStatusEmojis getchannelrestrictedstatusemojis2 = new TL_account.getChannelRestrictedStatusEmojis();
            if (tL_emojiList2 != null) {
                getchannelrestrictedstatusemojis2.hash = tL_emojiList2.hash;
            }
            getConnectionsManager().sendRequest(getchannelrestrictedstatusemojis2, new t6(this, sharedPreferences, 0));
        }
    }

    public void loadSavedReactions(boolean z10) {
        if (this.loadingSavedReactions) {
            return;
        }
        if (!this.loadedSavedReactions || z10) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("saved_reactions_" + this.currentAccount, 0);
            this.savedReactions.clear();
            this.savedReactions.addAll(loadReactionsFromPref(sharedPreferences));
            this.loadingSavedReactions = true;
            this.loadedSavedReactions = true;
            TLRPC.TL_messages_getDefaultTagReactions tL_messages_getDefaultTagReactions = new TLRPC.TL_messages_getDefaultTagReactions();
            tL_messages_getDefaultTagReactions.hash = sharedPreferences.getLong("hash", 0L);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getDefaultTagReactions, new t6(this, sharedPreferences, 1));
        }
    }

    public void loadStickers(int i9, boolean z10, boolean z11) {
        loadStickers(i9, z10, z11, false, null);
    }

    public void loadStickersByEmojiOrName(String str, boolean z10, boolean z11) {
        if (this.loadingDiceStickerSets.contains(str)) {
            return;
        }
        if (!z10 || this.diceStickerSetsByEmoji.get(str) == null) {
            this.loadingDiceStickerSets.add(str);
            if (z11) {
                getMessagesStorage().getStorageQueue().postRunnable(new f8(this, str, z10, 1));
                return;
            }
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            if (Objects.equals(getUserConfig().premiumGiftsStickerPack, str)) {
                tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetPremiumGifts();
            } else if (z10) {
                TLRPC.TL_inputStickerSetDice tL_inputStickerSetDice = new TLRPC.TL_inputStickerSetDice();
                tL_inputStickerSetDice.emoticon = str;
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetDice;
            } else {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = str;
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
            }
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new v0(this, str, z10, 2));
        }
    }

    public void markFeaturedStickersAsRead(boolean z10, boolean z11) {
        if (this.unreadStickerSets[z10 ? 1 : 0].isEmpty()) {
            return;
        }
        this.unreadStickerSets[z10 ? 1 : 0].clear();
        this.loadFeaturedHash[z10 ? 1 : 0] = calcFeaturedStickersHash(z10, this.featuredStickerSets[z10 ? 1 : 0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(z10 ? NotificationCenter.featuredEmojiDidLoad : NotificationCenter.featuredStickersDidLoad, new Object[0]);
        putFeaturedStickersToCache(z10, this.featuredStickerSets[z10 ? 1 : 0], this.unreadStickerSets[z10 ? 1 : 0], this.loadFeaturedDate[z10 ? 1 : 0], this.loadFeaturedHash[z10 ? 1 : 0], this.loadFeaturedPremium);
        if (z11) {
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_readFeaturedStickers(), new c5(12));
        }
    }

    public void markFeaturedStickersByIdAsRead(boolean z10, long j10) {
        if (!this.unreadStickerSets[z10 ? 1 : 0].contains(Long.valueOf(j10)) || this.readingStickerSets[z10 ? 1 : 0].contains(Long.valueOf(j10))) {
            return;
        }
        this.readingStickerSets[z10 ? 1 : 0].add(Long.valueOf(j10));
        TLRPC.TL_messages_readFeaturedStickers tL_messages_readFeaturedStickers = new TLRPC.TL_messages_readFeaturedStickers();
        tL_messages_readFeaturedStickers.id.add(Long.valueOf(j10));
        getConnectionsManager().sendRequest(tL_messages_readFeaturedStickers, new c5(10));
        AndroidUtilities.runOnUIThread(new gh.ua(this, z10, j10, 3), 1000L);
    }

    public void markSetInstalling(long j10, boolean z10) {
        this.uninstalledForceStickerSetsById.remove(Long.valueOf(j10));
        if (z10 && !this.installedForceStickerSetsById.contains(Long.valueOf(j10))) {
            this.installedForceStickerSetsById.add(Long.valueOf(j10));
        }
        if (z10) {
            return;
        }
        this.installedForceStickerSetsById.remove(Long.valueOf(j10));
    }

    public void markSetUninstalling(long j10, boolean z10) {
        this.installedForceStickerSetsById.remove(Long.valueOf(j10));
        if (z10 && !this.uninstalledForceStickerSetsById.contains(Long.valueOf(j10))) {
            this.uninstalledForceStickerSetsById.add(Long.valueOf(j10));
        }
        if (z10) {
            return;
        }
        this.uninstalledForceStickerSetsById.remove(Long.valueOf(j10));
    }

    public void moveStickerSetToTop(long j10, boolean z10, boolean z11) {
        int i9 = z10 ? 5 : z11 ? 1 : 0;
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = getStickerSets(i9);
        if (stickerSets != null) {
            for (int i10 = 0; i10 < stickerSets.size(); i10++) {
                if (stickerSets.get(i10).set.id == j10) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i10);
                    stickerSets.remove(i10);
                    stickerSets.add(0, tL_messages_stickerSet);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i9), Boolean.FALSE);
                    return;
                }
            }
        }
    }

    public void onRingtoneUploaded(String str, TLRPC.Document document, boolean z10) {
        this.ringtoneUploaderHashMap.remove(str);
        bf.d dVar = this.ringtoneDataStore;
        ArrayList arrayList = dVar.e;
        boolean z11 = true;
        if (z10) {
            int i9 = 0;
            while (true) {
                if (i9 >= arrayList.size()) {
                    z11 = false;
                    break;
                } else {
                    if (((bf.c) arrayList.get(i9)).d && str.equals(((bf.c) arrayList.get(i9)).b)) {
                        arrayList.remove(i9);
                        break;
                    }
                    i9++;
                }
            }
        } else {
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    z11 = false;
                    break;
                } else {
                    if (((bf.c) arrayList.get(i10)).d && str.equals(((bf.c) arrayList.get(i10)).b)) {
                        ((bf.c) arrayList.get(i10)).d = false;
                        ((bf.c) arrayList.get(i10)).a = document;
                        break;
                    }
                    i10++;
                }
            }
            if (z11) {
                dVar.h();
            }
        }
        if (z11) {
            NotificationCenter.getInstance(dVar.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
        }
    }

    public void portSavedSearchResults(int i9, hg.r0 r0Var, String str, ArrayList<MessageObject> arrayList, ArrayList<MessageObject> arrayList2, int i10, int i11, boolean z10) {
        this.lastReaction = r0Var;
        this.lastSearchQuery = str;
        boolean[] zArr = this.messagesSearchEndReached;
        zArr[0] = z10;
        zArr[1] = true;
        this.searchServerResultMessages.clear();
        this.searchServerResultMessages.addAll(arrayList2);
        this.searchLocalResultMessages.clear();
        this.searchLocalResultMessages.addAll(arrayList);
        updateSearchResults();
        int[] iArr = this.messagesSearchCount;
        iArr[0] = i11;
        iArr[1] = 0;
        this.lastReturnedNum = i10;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i9), 0, Integer.valueOf(getMask()), Long.valueOf(getUserConfig().getClientUserId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.TRUE);
    }

    public void preloadDefaultReactions() {
        if (this.reactionsList == null || this.reactionsCacheGenerated || !LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) || this.currentAccount != UserConfig.selectedAccount) {
            return;
        }
        this.reactionsCacheGenerated = true;
        ArrayList arrayList = new ArrayList(this.reactionsList);
        int min = Math.min(arrayList.size(), 10);
        for (int i9 = 0; i9 < min; i9++) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList.get(i9);
            preloadImage(ImageLocation.getForDocument(tL_availableReaction.activate_animation), 0);
            preloadImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), 0);
        }
        for (int i10 = 0; i10 < min; i10++) {
            preloadImage(ImageLocation.getForDocument(((TLRPC.TL_availableReaction) arrayList.get(i10)).effect_animation), 0);
        }
    }

    public void preloadImage(ImageLocation imageLocation, int i9) {
        getFileLoader().loadFile(imageLocation, null, null, i9, 11);
    }

    public void preloadPremiumPreviewStickers() {
        if (!this.previewStickersLoading && this.premiumPreviewStickers.isEmpty()) {
            TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
            tL_messages_getStickers.emoticon = Emoji.fixEmoji("⭐") + Emoji.fixEmoji("⭐");
            tL_messages_getStickers.hash = 0L;
            this.previewStickersLoading = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickers, new k7(this, 2));
            return;
        }
        int i9 = 0;
        while (i9 < Math.min(this.premiumPreviewStickers.size(), 3)) {
            ArrayList<TLRPC.Document> arrayList = this.premiumPreviewStickers;
            TLRPC.Document document = arrayList.get(i9 == 2 ? arrayList.size() - 1 : i9);
            if (MessageObject.isPremiumSticker(document)) {
                ImageReceiver imageReceiver = new ImageReceiver();
                imageReceiver.setAllowLoadingOnAttachedOnly(false);
                imageReceiver.setImage(ImageLocation.getForDocument(document), null, null, "webp", null, 1);
                ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                ImageReceiver imageReceiver2 = new ImageReceiver();
                imageReceiver2.setAllowLoadingOnAttachedOnly(false);
                imageReceiver2.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(document), document), (String) null, (ImageLocation) null, (String) null, "tgs", (Object) null, 1);
                ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver2);
            }
            i9++;
        }
    }

    public void preloadStickerSetThumb(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        ArrayList<TLRPC.Document> arrayList;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSet.thumbs, 90)) == null || (arrayList = tL_messages_stickerSet.documents) == null || arrayList.isEmpty()) {
            return;
        }
        loadStickerSetThumbInternal(closestPhotoSizeWithSize, tL_messages_stickerSet, arrayList.get(0), tL_messages_stickerSet.set.thumb_version);
    }

    public boolean processDeletedMessage(int i9, long[] jArr) {
        MessageObject messageObject;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= this.deletedFromResultMessages.size()) {
                messageObject = null;
                break;
            }
            if (this.deletedFromResultMessages.get(i10).getId() == i9) {
                messageObject = this.deletedFromResultMessages.get(i10);
                break;
            }
            i10++;
        }
        if (messageObject != null && messageObject.getDialogId() == getUserConfig().getClientUserId()) {
            boolean processDeletedReactionTags = getMessagesController().processDeletedReactionTags(messageObject.messageOwner);
            jArr[0] = MessageObject.getSavedDialogId(getUserConfig().getClientUserId(), messageObject.messageOwner);
            z10 = processDeletedReactionTags;
        }
        this.deletedFromResultMessages.remove(messageObject);
        return z10;
    }

    public void processLoadedMenuBots(TLRPC.TL_attachMenuBots tL_attachMenuBots, long j10, int i9, boolean z10) {
        boolean z11;
        if (tL_attachMenuBots != null && i9 != 0) {
            this.attachMenuBots = tL_attachMenuBots;
            this.menuBotsUpdateHash = j10;
        }
        SharedPreferences.Editor edit = getMessagesController().getMainSettings().edit();
        this.menuBotsUpdateDate = i9;
        edit.putInt("menuBotsUpdateDate", i9).commit();
        this.menuBotsUpdatedLocal = true;
        if (tL_attachMenuBots != null) {
            if (!z10) {
                getMessagesStorage().putUsersAndChats(tL_attachMenuBots.users, null, true, true);
            }
            getMessagesController().putUsers(tL_attachMenuBots.users, z10);
            AndroidUtilities.runOnUIThread(new g7(this, 1));
            z11 = false;
            for (int i10 = 0; i10 < tL_attachMenuBots.bots.size(); i10++) {
                if (tL_attachMenuBots.bots.get(i10) instanceof TLRPC.TL_attachMenuBot_layer162) {
                    tL_attachMenuBots.bots.get(i10).show_in_attach_menu = true;
                    z11 = true;
                }
            }
        } else {
            z11 = false;
        }
        if (!z10) {
            putMenuBotsToCache(tL_attachMenuBots, j10, i9);
        } else if (z11 || Math.abs((System.currentTimeMillis() / 1000) - i9) >= 3600) {
            loadAttachMenuBots(false, true);
        }
    }

    public void processLoadedPremiumPromo(TLRPC.TL_help_premiumPromo tL_help_premiumPromo, int i9, boolean z10) {
        if (tL_help_premiumPromo != null) {
            this.premiumPromo = tL_help_premiumPromo;
            this.premiumPromoUpdateDate = i9;
            getMessagesController().putUsers(tL_help_premiumPromo.users, z10);
            AndroidUtilities.runOnUIThread(new g7(this, 7));
        }
        if (!z10) {
            if (tL_help_premiumPromo != null) {
                putPremiumPromoToCache(tL_help_premiumPromo, i9);
            }
            this.isLoadingPremiumPromo = false;
        } else if (tL_help_premiumPromo == null || Math.abs((System.currentTimeMillis() / 1000) - i9) >= 86400) {
            loadPremiumPromo(false);
        } else {
            this.isLoadingPremiumPromo = false;
        }
    }

    public void processLoadedReactions(List<TLRPC.TL_availableReaction> list, int i9, int i10, boolean z10) {
        if (list != null && i10 != 0) {
            this.reactionsList.clear();
            this.reactionsMap.clear();
            this.enabledReactionsList.clear();
            this.reactionsList.addAll(list);
            for (int i11 = 0; i11 < this.reactionsList.size(); i11++) {
                this.reactionsList.get(i11).positionInList = i11;
                this.reactionsMap.put(this.reactionsList.get(i11).reaction, this.reactionsList.get(i11));
                if (!this.reactionsList.get(i11).inactive) {
                    this.enabledReactionsList.add(this.reactionsList.get(i11));
                }
            }
            this.reactionsUpdateHash = i9;
        }
        this.reactionsUpdateDate = i10;
        if (list != null) {
            AndroidUtilities.runOnUIThread(new g7(this, 3));
        }
        this.isLoadingReactions = false;
        if (!z10) {
            putReactionsToCache(list, i9, i10);
        } else {
            Math.abs((System.currentTimeMillis() / 1000) - i10);
            loadReactions(false, Integer.valueOf(i9));
        }
    }

    public void processLoadedRecentDocuments(int i9, ArrayList<TLRPC.Document> arrayList, boolean z10, int i10, boolean z11) {
        int i11;
        ArrayList<TLRPC.Document> arrayList2;
        boolean z12;
        int i12;
        if (arrayList != null) {
            i11 = i9;
            arrayList2 = arrayList;
            z12 = z10;
            i12 = i10;
            getMessagesStorage().getStorageQueue().postRunnable(new k9(this, z12, i11, arrayList2, z11, i12));
        } else {
            i11 = i9;
            arrayList2 = arrayList;
            z12 = z10;
            i12 = i10;
        }
        if (i12 == 0) {
            AndroidUtilities.runOnUIThread(new g9(this, z12, i11, arrayList2));
        }
    }

    public void processStickerSetInstallResultArchive(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, int i9, TLRPC.TL_messages_stickerSetInstallResultArchive tL_messages_stickerSetInstallResultArchive) {
        int size = tL_messages_stickerSetInstallResultArchive.sets.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.installedStickerSetsById.l(tL_messages_stickerSetInstallResultArchive.sets.get(i10).set.id);
        }
        loadArchivedStickersCount(i9, false);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needAddArchivedStickers, tL_messages_stickerSetInstallResultArchive.sets);
        if (o2Var == null || o2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = o2Var.getParentActivity();
        org.telegram.ui.ActionBar.o2 o2Var2 = z10 ? o2Var : null;
        ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_stickerSetInstallResultArchive.sets;
        ex0 ex0Var = new ex0(parentActivity);
        TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(0);
        boolean z11 = stickerSetCovered.set.masks;
        org.telegram.ui.ActionBar.c2 c2Var = ex0Var.a;
        if (z11) {
            ex0Var.d = 1;
            c2Var.N = LocaleController.getString(R.string.ArchivedMasksAlertTitle);
        } else {
            ex0Var.d = 0;
            c2Var.N = LocaleController.getString(R.string.ArchivedStickersAlertTitle);
        }
        ex0Var.c = new ArrayList(arrayList);
        ex0Var.e = o2Var2;
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        ex0Var.n(linearLayout);
        TextView textView = new TextView(parentActivity);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        textView.setGravity(g7.e6.y());
        textView.setTextSize(1, 16.0f);
        textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(23.0f), 0);
        if (stickerSetCovered.set.masks) {
            textView.setText(LocaleController.getString(R.string.ArchivedMasksAlertInfo));
        } else {
            textView.setText(LocaleController.getString(R.string.ArchivedStickersAlertInfo));
        }
        linearLayout.addView(textView, g7.e6.n(-2, -2));
        wk0 wk0Var = new wk0(parentActivity, null);
        c2Var.getContext();
        wk0Var.setLayoutManager(new f2.m0(1, false));
        wk0Var.setAdapter(new dx0(ex0Var, parentActivity));
        wk0Var.setVerticalScrollBarEnabled(false);
        wk0Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        wk0Var.setGlowColor(-657673);
        linearLayout.addView(wk0Var, g7.e6.k(0.0f, 10.0f, 0.0f, 0.0f, -1, -2));
        ex0Var.h(LocaleController.getString(R.string.Close), new if0(11));
        if (o2Var2 != null) {
            ex0Var.k(LocaleController.getString(R.string.Settings), new wu(ex0Var, 23));
        }
        o2Var.showDialog(c2Var);
    }

    public void pushDraftVoiceMessage(long j10, long j11, DraftVoice draftVoice) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0);
        long hash = Objects.hash(Long.valueOf(j10), Long.valueOf(j11));
        String str = hash + "";
        if (draftVoice == null) {
            sharedPreferences.edit().remove(str).apply();
            this.draftVoices.l(hash);
        } else {
            sharedPreferences.edit().putString(str, draftVoice.toString()).apply();
            this.draftVoices.k(draftVoice, hash);
        }
    }

    public void pushRecentEmojiStatus(TLRPC.EmojiStatus emojiStatus) {
        if (this.emojiStatuses[0] != null) {
            if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
                long j10 = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
                int i9 = 0;
                while (i9 < this.emojiStatuses[0].size()) {
                    if ((this.emojiStatuses[0].get(i9) instanceof TLRPC.TL_emojiStatus) && ((TLRPC.TL_emojiStatus) this.emojiStatuses[0].get(i9)).document_id == j10) {
                        this.emojiStatuses[0].remove(i9);
                        i9--;
                    }
                    i9++;
                }
            }
            this.emojiStatuses[0].add(0, emojiStatus);
            while (this.emojiStatuses[0].size() > 50) {
                aa.d.u(1, this.emojiStatuses[0]);
            }
            TL_account.TL_emojiStatuses tL_emojiStatuses = new TL_account.TL_emojiStatuses();
            tL_emojiStatuses.hash = this.emojiStatusesHash[0];
            tL_emojiStatuses.statuses = this.emojiStatuses[0];
            updateEmojiStatuses(0, tL_emojiStatuses);
        }
    }

    public void putBotInfo(long j10, TL_bots.BotInfo botInfo) {
        if (botInfo == null) {
            return;
        }
        this.botInfos.put(botInfo.user_id + "_" + j10, botInfo);
        getMessagesStorage().getStorageQueue().postRunnable(new a4(this, botInfo, j10, 6));
    }

    public void putBotKeyboard(MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        SQLiteCursor queryFinalized;
        if (topicKey == null) {
            return;
        }
        try {
            if (topicKey.topicId != 0) {
                SQLiteDatabase database = getMessagesStorage().getDatabase();
                Locale locale = Locale.US;
                queryFinalized = database.queryFinalized("SELECT mid FROM bot_keyboard_topics WHERE uid = " + topicKey.dialogId + " AND tid = " + topicKey.topicId, new Object[0]);
            } else {
                SQLiteDatabase database2 = getMessagesStorage().getDatabase();
                Locale locale2 = Locale.US;
                queryFinalized = database2.queryFinalized("SELECT mid FROM bot_keyboard WHERE uid = " + topicKey.dialogId, new Object[0]);
            }
            int intValue = queryFinalized.next() ? queryFinalized.intValue(0) : 0;
            queryFinalized.dispose();
            if (intValue < message.id || MessageObject.isEphemeralMessageId(intValue) || MessageObject.isEphemeralMessageId(message.id)) {
                SQLitePreparedStatement executeFast = topicKey.topicId != 0 ? getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_keyboard_topics VALUES(?, ?, ?, ?)") : getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_keyboard VALUES(?, ?, ?)");
                executeFast.requery();
                MessageObject.normalizeFlags(message);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                message.serializeToStream(nativeByteBuffer);
                if (topicKey.topicId != 0) {
                    executeFast.bindLong(1, topicKey.dialogId);
                    executeFast.bindLong(2, topicKey.topicId);
                    executeFast.bindInteger(3, message.id);
                    executeFast.bindByteBuffer(4, nativeByteBuffer);
                } else {
                    executeFast.bindLong(1, topicKey.dialogId);
                    executeFast.bindInteger(2, message.id);
                    executeFast.bindByteBuffer(3, nativeByteBuffer);
                }
                executeFast.step();
                nativeByteBuffer.reuse();
                executeFast.dispose();
                AndroidUtilities.runOnUIThread(new u6(this, topicKey, message));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void putGroupStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.groupStickerSets.k(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
    }

    public void putStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        putStickerSet(tL_messages_stickerSet, true);
    }

    public void removeInline(long j10) {
        removeInline(j10, false);
    }

    public void removeMessageFromResults(int i9) {
        int i10 = 0;
        int i11 = 0;
        while (i11 < this.searchResultMessages.size()) {
            if (i9 == this.searchResultMessages.get(i11).getId()) {
                this.deletedFromResultMessages.add(this.searchResultMessages.remove(i11));
                i11--;
            }
            i11++;
        }
        int i12 = 0;
        while (i12 < this.searchServerResultMessages.size()) {
            if (i9 == this.searchServerResultMessages.get(i12).getId()) {
                this.searchServerResultMessages.remove(i12);
                i12--;
            }
            i12++;
        }
        while (i10 < this.searchLocalResultMessages.size()) {
            if (i9 == this.searchLocalResultMessages.get(i10).getId()) {
                this.searchLocalResultMessages.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    public void removeMultipleStickerSets(Context context, org.telegram.ui.ActionBar.o2 o2Var, ArrayList<TLRPC.TL_messages_stickerSet> arrayList) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (arrayList == null || arrayList.isEmpty() || (tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) j3.r0.j(1, arrayList)) == null) {
            return;
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        int i9 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList.get(i10).set.archived = false;
        }
        int[] iArr = new int[arrayList.size()];
        for (int i11 = 0; i11 < this.stickerSets[i9].size(); i11++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.stickerSets[i9].get(i11);
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                if (tL_messages_stickerSet2.set.id == arrayList.get(i12).set.id) {
                    iArr[i12] = i11;
                    this.stickerSets[i9].remove(i11);
                    this.stickerSetsById.l(tL_messages_stickerSet2.set.id);
                    this.installedStickerSetsById.l(tL_messages_stickerSet2.set.id);
                    this.stickerSetsByName.remove(tL_messages_stickerSet2.set.short_name);
                    break;
                }
                i12++;
            }
        }
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList2 = this.stickerSets[i9];
        int i13 = this.loadDate[i9];
        long[] jArr = this.loadHash;
        int i14 = i9;
        long calcStickersHash = calcStickersHash(arrayList2);
        jArr[i14] = calcStickersHash;
        putStickersToCache(i14, arrayList2, i13, calcStickersHash);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i14), Boolean.TRUE);
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            markSetUninstalling(arrayList.get(i15).set.id, true);
        }
        iw0 iw0Var = new iw0(context, tL_messages_stickerSet, arrayList.size(), 0, null, o2Var.getResourceProvider());
        boolean[] zArr = new boolean[1];
        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(context, null, false);
        ecVar.a = new fh.g1(this, zArr, arrayList, i14, iArr, 7);
        ecVar.b = new ff.k0(this, zArr, arrayList, context, o2Var, i14);
        iw0Var.setButton(ecVar);
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            this.removingStickerSetsUndos.k(new e1(ecVar, 25), arrayList.get(i16).set.id);
        }
        org.telegram.ui.Components.gc.g(o2Var, iw0Var, 2750).j();
    }

    public void removePeer(long j10) {
        for (int i9 = 0; i9 < this.hints.size(); i9++) {
            if (this.hints.get(i9).peer.user_id == j10) {
                this.hints.remove(i9);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadHints, new Object[0]);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryCorrespondents();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().getInputPeer(j10);
                deletePeer(j10, 0);
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new c5(11));
                return;
            }
        }
    }

    public void removeRecentGif(TLRPC.Document document) {
        int size = this.recentGifs.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                break;
            }
            if (this.recentGifs.get(i9).id == document.id) {
                this.recentGifs.remove(i9);
                break;
            }
            i9++;
        }
        TLRPC.TL_messages_saveGif tL_messages_saveGif = new TLRPC.TL_messages_saveGif();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_messages_saveGif.id = tL_inputDocument;
        tL_inputDocument.id = document.id;
        tL_inputDocument.access_hash = document.access_hash;
        byte[] bArr = document.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        tL_messages_saveGif.unsave = true;
        getConnectionsManager().sendRequest(tL_messages_saveGif, new t1(3, this, tL_messages_saveGif));
        getMessagesStorage().getStorageQueue().postRunnable(new w7(0, this, document));
    }

    public void removeWebapp(long j10) {
        for (int i9 = 0; i9 < this.webapps.size(); i9++) {
            if (this.webapps.get(i9).peer.user_id == j10) {
                this.webapps.remove(i9);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsApp();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().getInputPeer(j10);
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new c5(13));
                deletePeer(j10, 2);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadWebappsHints, new Object[0]);
                return;
            }
        }
    }

    public void reorderStickers(int i9, ArrayList<Long> arrayList, boolean z10) {
        Collections.sort(this.stickerSets[i9], new h7(arrayList, 1));
        this.loadHash[i9] = calcStickersHash(this.stickerSets[i9]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i9), Boolean.valueOf(z10));
    }

    public void replaceStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        boolean z10;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.stickerSetsById.f(tL_messages_stickerSet.set.id);
        String str = (String) this.diceEmojiStickerSetsById.f(tL_messages_stickerSet.set.id);
        if (str != null) {
            this.diceStickerSetsByEmoji.put(str, tL_messages_stickerSet);
            putDiceStickersToCache(str, tL_messages_stickerSet, (int) (System.currentTimeMillis() / 1000));
        }
        if (tL_messages_stickerSet2 == null) {
            tL_messages_stickerSet2 = this.stickerSetsByName.get(tL_messages_stickerSet.set.short_name);
        }
        boolean z11 = tL_messages_stickerSet2 == null && (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.groupStickerSets.f(tL_messages_stickerSet.set.id)) != null;
        if (tL_messages_stickerSet2 == null) {
            return;
        }
        if ("AnimatedEmojies".equals(tL_messages_stickerSet.set.short_name)) {
            tL_messages_stickerSet2.documents = tL_messages_stickerSet.documents;
            tL_messages_stickerSet2.packs = tL_messages_stickerSet.packs;
            tL_messages_stickerSet2.set = tL_messages_stickerSet.set;
            AndroidUtilities.runOnUIThread(new b7(this, tL_messages_stickerSet, 4));
            z10 = true;
        } else {
            a0.h hVar = new a0.h();
            int size = tL_messages_stickerSet.documents.size();
            for (int i9 = 0; i9 < size; i9++) {
                TLRPC.Document document = tL_messages_stickerSet.documents.get(i9);
                hVar.k(document, document.id);
            }
            int size2 = tL_messages_stickerSet2.documents.size();
            z10 = false;
            for (int i10 = 0; i10 < size2; i10++) {
                TLRPC.Document document2 = (TLRPC.Document) hVar.f(tL_messages_stickerSet2.documents.get(i10).id);
                if (document2 != null) {
                    tL_messages_stickerSet2.documents.set(i10, document2);
                    z10 = true;
                }
            }
        }
        if (z10) {
            if (z11) {
                putSetToCache(tL_messages_stickerSet2);
                return;
            }
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            int i11 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
            putStickersToCache(i11, this.stickerSets[i11], this.loadDate[i11], this.loadHash[i11]);
            if ("AnimatedEmojies".equals(tL_messages_stickerSet.set.short_name)) {
                putStickersToCache(4, this.stickerSets[4], this.loadDate[4], this.loadHash[4]);
            }
        }
    }

    public void saveDraft(long j10, int i9, CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.Message message, boolean z10, long j11) {
        saveDraft(j10, i9, charSequence, arrayList, message, null, null, j11, z10, false);
    }

    public boolean saveToRingtones(TLRPC.Document document) {
        int i9 = 4;
        if (document == null) {
            return false;
        }
        if (this.ringtoneDataStore.c(document.id) != null) {
            return true;
        }
        if (document.size > MessagesController.getInstance(this.currentAccount).ringtoneSizeMax) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)));
            return false;
        }
        for (int i10 = 0; i10 < document.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && documentAttribute.duration > MessagesController.getInstance(this.currentAccount).ringtoneDurationMax) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)));
                return false;
            }
        }
        TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        saveringtone.id = tL_inputDocument;
        tL_inputDocument.id = document.id;
        tL_inputDocument.file_reference = document.file_reference;
        tL_inputDocument.access_hash = document.access_hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(saveringtone, new t1(i9, this, document));
        return true;
    }

    public boolean searchEndReached() {
        boolean[] zArr = this.messagesSearchEndReached;
        return (zArr[0] && this.lastMergeDialogId == 0 && zArr[1]) || this.loadingSearchLocal || this.loadedPredirectedSearchLocal;
    }

    public void searchMessagesInChat(String str, long j10, long j11, int i9, int i10, long j12, TLRPC.User user, TLRPC.Chat chat, hg.r0 r0Var) {
        searchMessagesInChat(str, j10, j11, i9, i10, j12, false, user, chat, true, r0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void searchStickerSets(boolean z10, String str, Utilities.Callback<ArrayList<TLRPC.StickerSetCovered>> callback) {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        if (z10) {
            TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
            tL_messages_searchEmojiStickerSets.q = str;
            tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
        } else {
            TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
            tL_messages_searchStickerSets2.q = str;
            tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
        }
        getConnectionsManager().sendRequestTyped(tL_messages_searchStickerSets, new a(), new d4(1, callback));
    }

    public SearchStickersKey searchStickers(boolean z10, String str, String str2, Utilities.Callback<ArrayList<TLRPC.Document>> callback) {
        return searchStickers(z10, str, str2, callback, false);
    }

    public void setDoubleTapReaction(String str) {
        MessagesController.getEmojiSettings(this.currentAccount).edit().putString("reaction_on_double_tap", str).apply();
        this.doubleTapReaction = str;
    }

    public void setDraftFolderId(long j10, int i9) {
        this.draftsFolderIds.k(Integer.valueOf(i9), j10);
    }

    public void setDraftVoiceRegion(long j10, long j11, float f10, float f11) {
        DraftVoice draftVoice = getDraftVoice(j10, j11);
        if (draftVoice != null) {
            if (Math.abs(draftVoice.left - f10) >= 0.001f || Math.abs(draftVoice.right - f11) >= 0.001f) {
                draftVoice.left = f10;
                draftVoice.right = f11;
                ApplicationLoader.applicationContext.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).edit().putString(Objects.hash(Long.valueOf(j10), Long.valueOf(j11)) + "", draftVoice.toString()).apply();
            }
        }
    }

    public void setPlaceholderImage(org.telegram.ui.Components.o9 o9Var, String str, String str2, String str3) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = str;
        getInstance(this.currentAccount).getStickerSet(tL_inputStickerSetShortName, 0, false, new g2(str2, o9Var, str3, 3));
    }

    public void setSearchedPosition(int i9) {
        if (i9 < 0 || i9 >= this.searchResultMessages.size()) {
            return;
        }
        this.lastReturnedNum = i9;
    }

    public void storeTempStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) {
            return;
        }
        this.stickerSetsById.k(tL_messages_stickerSet, stickerSet.id);
        String str = tL_messages_stickerSet.set.short_name;
        if (str != null) {
            this.stickerSetsByName.put(str.toLowerCase(), tL_messages_stickerSet);
        }
    }

    public CharSequence substring(CharSequence charSequence, int i9, int i10) {
        return charSequence instanceof SpannableStringBuilder ? charSequence.subSequence(i9, i10) : charSequence instanceof SpannedString ? ((SpannedString) charSequence).subSequence(i9, i10) : TextUtils.substring(charSequence, i9, i10);
    }

    public void toggleDraftVoiceOnce(long j10, long j11, boolean z10) {
        DraftVoice draftVoice = getDraftVoice(j10, j11);
        if (draftVoice == null || draftVoice.once == z10) {
            return;
        }
        draftVoice.once = z10;
        ApplicationLoader.applicationContext.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).edit().putString(Objects.hash(Long.valueOf(j10), Long.valueOf(j11)) + "", draftVoice.toString()).apply();
    }

    public void toggleStickerSet(Context context, TLObject tLObject, int i9, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11) {
        toggleStickerSet(context, tLObject, i9, o2Var, z10, z11, null, true);
    }

    public void toggleStickerSets(ArrayList<TLRPC.StickerSet> arrayList, final int i9, final int i10, final org.telegram.ui.ActionBar.o2 o2Var, final boolean z10) {
        int size = arrayList.size();
        ArrayList<TLRPC.InputStickerSet> arrayList2 = new ArrayList<>(size);
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            TLRPC.StickerSet stickerSet = arrayList.get(i11);
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            tL_inputStickerSetID.id = stickerSet.id;
            arrayList2.add(tL_inputStickerSetID);
            if (i10 != 0) {
                stickerSet.archived = i10 == 1;
            }
            int size2 = this.stickerSets[i9].size();
            int i12 = 0;
            while (true) {
                if (i12 < size2) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.stickerSets[i9].get(i12);
                    if (tL_messages_stickerSet.set.id == tL_inputStickerSetID.id) {
                        this.stickerSets[i9].remove(i12);
                        if (i10 == 2) {
                            this.stickerSets[i9].add(0, tL_messages_stickerSet);
                        } else {
                            this.stickerSetsById.l(tL_messages_stickerSet.set.id);
                            this.installedStickerSetsById.l(tL_messages_stickerSet.set.id);
                            this.stickerSetsByName.remove(tL_messages_stickerSet.set.short_name);
                        }
                    } else {
                        i12++;
                    }
                }
            }
            i11++;
        }
        this.loadHash[i9] = calcStickersHash(this.stickerSets[i9]);
        putStickersToCache(i9, this.stickerSets[i9], this.loadDate[i9], this.loadHash[i9]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i9), Boolean.TRUE);
        TLRPC.TL_messages_toggleStickerSets tL_messages_toggleStickerSets = new TLRPC.TL_messages_toggleStickerSets();
        tL_messages_toggleStickerSets.stickersets = arrayList2;
        if (i10 == 0) {
            tL_messages_toggleStickerSets.uninstall = true;
        } else if (i10 == 1) {
            tL_messages_toggleStickerSets.archive = true;
        } else if (i10 == 2) {
            tL_messages_toggleStickerSets.unarchive = true;
        }
        getConnectionsManager().sendRequest(tL_messages_toggleStickerSets, new RequestDelegate() { // from class: org.telegram.messenger.e9
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MediaDataController.this.lambda$toggleStickerSets$119(i10, o2Var, z10, i9, tLObject, tL_error);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0 A[Catch: Exception -> 0x0035, TryCatch #0 {Exception -> 0x0035, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0016, B:8:0x0038, B:10:0x003c, B:11:0x004b, B:13:0x0054, B:17:0x0066, B:19:0x006d, B:23:0x0081, B:30:0x00c0, B:32:0x00c4, B:33:0x00d9, B:35:0x00dd, B:36:0x00e6, B:38:0x00e2, B:39:0x00cd, B:41:0x00d1, B:43:0x00d7, B:44:0x0093, B:46:0x0099, B:47:0x00a6, B:49:0x00ac), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dd A[Catch: Exception -> 0x0035, TryCatch #0 {Exception -> 0x0035, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0016, B:8:0x0038, B:10:0x003c, B:11:0x004b, B:13:0x0054, B:17:0x0066, B:19:0x006d, B:23:0x0081, B:30:0x00c0, B:32:0x00c4, B:33:0x00d9, B:35:0x00dd, B:36:0x00e6, B:38:0x00e2, B:39:0x00cd, B:41:0x00d1, B:43:0x00d7, B:44:0x0093, B:46:0x0099, B:47:0x00a6, B:49:0x00ac), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2 A[Catch: Exception -> 0x0035, TryCatch #0 {Exception -> 0x0035, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0016, B:8:0x0038, B:10:0x003c, B:11:0x004b, B:13:0x0054, B:17:0x0066, B:19:0x006d, B:23:0x0081, B:30:0x00c0, B:32:0x00c4, B:33:0x00d9, B:35:0x00dd, B:36:0x00e6, B:38:0x00e2, B:39:0x00cd, B:41:0x00d1, B:43:0x00d7, B:44:0x0093, B:46:0x0099, B:47:0x00a6, B:49:0x00ac), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7 A[Catch: Exception -> 0x0035, TryCatch #0 {Exception -> 0x0035, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0016, B:8:0x0038, B:10:0x003c, B:11:0x004b, B:13:0x0054, B:17:0x0066, B:19:0x006d, B:23:0x0081, B:30:0x00c0, B:32:0x00c4, B:33:0x00d9, B:35:0x00dd, B:36:0x00e6, B:38:0x00e2, B:39:0x00cd, B:41:0x00d1, B:43:0x00d7, B:44:0x0093, B:46:0x0099, B:47:0x00a6, B:49:0x00ac), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void uninstallShortcut(long j10, int i9) {
        TLRPC.Chat chat;
        TLRPC.User user;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                ArrayList arrayList = new ArrayList();
                if (i9 == SHORTCUT_TYPE_USER_OR_CHAT) {
                    arrayList.add("sdid_" + j10);
                    arrayList.add("ndid_" + j10);
                }
                if (i9 == SHORTCUT_TYPE_ATTACHED_BOT) {
                    arrayList.add("bdid_" + j10);
                }
                g0.f.o(ApplicationLoader.applicationContext, arrayList);
                if (i10 >= 30) {
                    fh.y5.b(ApplicationLoader.applicationContext.getSystemService(fh.y5.g())).removeLongLivedShortcuts(arrayList);
                    return;
                }
                return;
            }
            TLRPC.User user2 = null;
            if (DialogObject.isEncryptedDialog(j10)) {
                TLRPC.EncryptedChat encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j10)));
                if (encryptedChat == null) {
                    return;
                } else {
                    user = getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                }
            } else {
                if (!DialogObject.isUserDialog(j10)) {
                    if (DialogObject.isChatDialog(j10)) {
                        chat = getMessagesController().getChat(Long.valueOf(-j10));
                        if (user2 == null || chat != null) {
                            String formatName = user2 == null ? i9 == SHORTCUT_TYPE_USER_OR_CHAT ? ContactsController.formatName(user2.first_name, user2.last_name) : i9 == SHORTCUT_TYPE_ATTACHED_BOT ? user2.first_name : "" : chat.title;
                            Intent createIntrnalShortcutIntent = i9 != SHORTCUT_TYPE_USER_OR_CHAT ? createIntrnalShortcutIntent(j10) : createIntrnalAttachedBotShortcutIntent(j10);
                            Intent intent = new Intent();
                            intent.putExtra("android.intent.extra.shortcut.INTENT", createIntrnalShortcutIntent);
                            intent.putExtra("android.intent.extra.shortcut.NAME", formatName);
                            intent.putExtra("duplicate", false);
                            intent.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
                            ApplicationLoader.applicationContext.sendBroadcast(intent);
                        }
                        return;
                    }
                    return;
                }
                user = getMessagesController().getUser(Long.valueOf(j10));
            }
            user2 = user;
            chat = null;
            if (user2 == null) {
            }
            if (user2 == null) {
            }
            if (i9 != SHORTCUT_TYPE_USER_OR_CHAT) {
            }
            Intent intent2 = new Intent();
            intent2.putExtra("android.intent.extra.shortcut.INTENT", createIntrnalShortcutIntent);
            intent2.putExtra("android.intent.extra.shortcut.NAME", formatName);
            intent2.putExtra("duplicate", false);
            intent2.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
            ApplicationLoader.applicationContext.sendBroadcast(intent2);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void updateAttachMenuBotsInCache() {
        if (getAttachMenuBots() != null) {
            putMenuBotsToCache(getAttachMenuBots(), this.menuBotsUpdateHash, this.menuBotsUpdateDate);
        }
    }

    public void updateBotInfo(long j10, TL_update.TL_updateBotCommands tL_updateBotCommands) {
        TL_bots.BotInfo botInfo = this.botInfos.get(tL_updateBotCommands.bot_id + "_" + j10);
        if (botInfo != null) {
            botInfo.commands = tL_updateBotCommands.commands;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botInfoDidLoad, botInfo, 0);
        }
        getMessagesStorage().getStorageQueue().postRunnable(new a4(this, tL_updateBotCommands, j10, 5));
    }

    public void uploadRingtone(String str) {
        if (this.ringtoneUploaderHashMap.containsKey(str)) {
            return;
        }
        this.ringtoneUploaderHashMap.put(str, new bf.e(str, this.currentAccount));
        bf.d dVar = this.ringtoneDataStore;
        dVar.getClass();
        bf.c cVar = new bf.c();
        cVar.b = str;
        int i9 = dVar.d;
        dVar.d = i9 + 1;
        cVar.c = i9;
        cVar.d = true;
        dVar.e.add(cVar);
    }

    public void verifyAnimatedStickerMessage(TLRPC.Message message) {
        verifyAnimatedStickerMessage(message, false);
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class SearchStickersResult {
        public final ArrayList<TLRPC.Document> documents;
        public Integer next_offset;

        private SearchStickersResult() {
            this.documents = new ArrayList<>();
        }

        public void apply(TLRPC.TL_messages_foundStickers tL_messages_foundStickers) {
            this.documents.addAll(tL_messages_foundStickers.stickers);
            this.next_offset = (tL_messages_foundStickers.flags & 1) != 0 ? Integer.valueOf(tL_messages_foundStickers.next_offset) : null;
        }

        public /* synthetic */ SearchStickersResult(1 r12) {
            this();
        }
    }

    public static void addTextStyleRuns(TLRPC.DraftMessage draftMessage, Spannable spannable, int i9) {
        addTextStyleRuns(draftMessage.entities, draftMessage.message, spannable, i9);
    }

    public static long calcDocumentsHash(ArrayList<TLRPC.Document> arrayList, int i9) {
        long j10 = 0;
        if (arrayList == null) {
            return 0L;
        }
        int min = Math.min(i9, arrayList.size());
        for (int i10 = 0; i10 < min; i10++) {
            TLRPC.Document document = arrayList.get(i10);
            if (document != null) {
                j10 = calcHash(j10, document.id);
            }
        }
        return j10;
    }

    private void increaseInlineRating(long j10, boolean z10) {
        TLRPC.TL_topPeer tL_topPeer;
        if (getUserConfig().suggestContacts) {
            UserConfig userConfig = getUserConfig();
            int i9 = z10 ? userConfig.botGuestRatingLoadTime : userConfig.botRatingLoadTime;
            int max = i9 != 0 ? Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - i9) : 60;
            ArrayList<TLRPC.TL_topPeer> arrayList = z10 ? this.guestBots : this.inlineBots;
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    tL_topPeer = null;
                    break;
                }
                tL_topPeer = arrayList.get(i10);
                if (tL_topPeer.peer.user_id == j10) {
                    break;
                } else {
                    i10++;
                }
            }
            if (tL_topPeer == null) {
                tL_topPeer = new TLRPC.TL_topPeer();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_topPeer.peer = tL_peerUser;
                tL_peerUser.user_id = j10;
                arrayList.add(tL_topPeer);
            }
            tL_topPeer.rating = Math.exp(max / getMessagesController().ratingDecay) + tL_topPeer.rating;
            Collections.sort(arrayList, new q(12));
            if (arrayList.size() > 20) {
                aa.d.u(1, arrayList);
            }
            savePeer(j10, z10 ? 3 : 1, tL_topPeer.rating);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(z10 ? NotificationCenter.reloadGuestBotHints : NotificationCenter.reloadInlineHints, new Object[0]);
        }
    }

    private void processLoadStickersResponse(int i9, TLRPC.TL_messages_allStickers tL_messages_allStickers, Runnable runnable) {
        final TLRPC.TL_messages_allStickers tL_messages_allStickers2;
        final a0.h hVar;
        final int i10;
        final ArrayList<TLRPC.TL_messages_stickerSet> arrayList = new ArrayList<>();
        if (tL_messages_allStickers.sets.isEmpty()) {
            processLoadedStickers(i9, arrayList, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2, runnable);
            return;
        }
        MediaDataController mediaDataController = this;
        int i11 = i9;
        a0.h hVar2 = new a0.h();
        int i12 = 0;
        while (i12 < tL_messages_allStickers.sets.size()) {
            final TLRPC.StickerSet stickerSet = tL_messages_allStickers.sets.get(i12);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) mediaDataController.stickerSetsById.f(stickerSet.id);
            if (tL_messages_stickerSet != null) {
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                if (stickerSet2.hash == stickerSet.hash) {
                    stickerSet2.archived = stickerSet.archived;
                    stickerSet2.installed = stickerSet.installed;
                    stickerSet2.official = stickerSet.official;
                    hVar2.k(tL_messages_stickerSet, stickerSet2.id);
                    arrayList.add(tL_messages_stickerSet);
                    if (hVar2.m() == tL_messages_allStickers.sets.size()) {
                        mediaDataController.processLoadedStickers(i11, arrayList, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2);
                    }
                    tL_messages_allStickers2 = tL_messages_allStickers;
                    hVar = hVar2;
                    i10 = i12;
                    i12 = i10 + 1;
                    mediaDataController = this;
                    hVar2 = hVar;
                    tL_messages_allStickers = tL_messages_allStickers2;
                }
            }
            arrayList.add(null);
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
            tL_inputStickerSetID.id = stickerSet.id;
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            tL_messages_allStickers2 = tL_messages_allStickers;
            hVar = hVar2;
            i10 = i12;
            final int i13 = i11;
            i11 = i13;
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate() { // from class: org.telegram.messenger.r8
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MediaDataController.this.lambda$processLoadStickersResponse$74(arrayList, i10, hVar, stickerSet, tL_messages_allStickers2, i13, tLObject, tL_error);
                }
            });
            i12 = i10 + 1;
            mediaDataController = this;
            hVar2 = hVar;
            tL_messages_allStickers = tL_messages_allStickers2;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    private void processLoadedStickers(int i9, ArrayList<TLRPC.TL_messages_stickerSet> arrayList, boolean z10, int i10, long j10, Runnable runnable) {
        AndroidUtilities.runOnUIThread(new k8(this, i9, 0));
        Utilities.stageQueue.postRunnable(new l8(this, z10, arrayList, i10, j10, i9, runnable));
    }

    private void removeInline(long j10, boolean z10) {
        ArrayList<TLRPC.TL_topPeer> arrayList = z10 ? this.guestBots : this.inlineBots;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (arrayList.get(i9).peer.user_id == j10) {
                arrayList.remove(i9);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsInline();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().getInputPeer(j10);
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new c5(9));
                deletePeer(j10, z10 ? 3 : 1);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(z10 ? NotificationCenter.reloadGuestBotHints : NotificationCenter.reloadInlineHints, new Object[0]);
                return;
            }
        }
    }

    public void clearBotKeyboard(long j10) {
        AndroidUtilities.runOnUIThread(new a7(this, j10, 2));
    }

    public void fetchNewEmojiKeywords(String[] strArr, boolean z10) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            if (TextUtils.isEmpty(str) || this.currentFetchingEmoji.get(str) != null) {
                return;
            }
            if (z10 && this.fetchedEmoji.contains(str)) {
                return;
            }
            this.currentFetchingEmoji.put(str, Boolean.TRUE);
            getMessagesStorage().getStorageQueue().postRunnable(new y7(this, str, 3));
        }
    }

    public void getEmojiSuggestions(String[] strArr, String str, boolean z10, KeywordResultCallback keywordResultCallback, CountDownLatch countDownLatch, boolean z11) {
        getEmojiSuggestions(strArr, str, z10, keywordResultCallback, countDownLatch, z11, false, false, null);
    }

    public ArrayList<TLRPC.MessageEntity> getEntities(CharSequence[] charSequenceArr, boolean z10, boolean z11) {
        int i9;
        int indexOf;
        int i10;
        int i11;
        int i12;
        ArrayList<TLRPC.MessageEntity> arrayList = null;
        if (charSequenceArr != null && charSequenceArr[0] != null) {
            int i13 = -1;
            boolean z12 = false;
            int i14 = 0;
            loop0: while (true) {
                i9 = -1;
                while (true) {
                    if (!z11) {
                        break loop0;
                    }
                    indexOf = TextUtils.indexOf(charSequenceArr[0], !z12 ? "`" : "```", i14);
                    if (indexOf == i13) {
                        break loop0;
                    }
                    if (i9 != i13) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        for (int i15 = (z12 ? 3 : 1) + indexOf; i15 < charSequenceArr[0].length() && charSequenceArr[0].charAt(i15) == '`'; i15++) {
                            indexOf++;
                        }
                        i10 = (z12 ? 3 : 1) + indexOf;
                        if (!z12) {
                            i11 = i9 + 1;
                            if (i11 == indexOf) {
                                break;
                            }
                            CharSequence charSequence = charSequenceArr[0];
                            if (!(charSequence instanceof Spanned) || ((CodeHighlighting.Span[]) ((Spanned) charSequence).getSpans(Utilities.clamp(i9, charSequence.length(), 0), Utilities.clamp(i11, charSequenceArr[0].length(), 0), CodeHighlighting.Span.class)).length <= 0) {
                                break;
                            }
                            i14 = i10;
                            i13 = -1;
                        } else {
                            char charAt = i9 > 0 ? charSequenceArr[0].charAt(i9 - 1) : (char) 0;
                            int i16 = (charAt == ' ' || charAt == '\n') ? 1 : 0;
                            int i17 = i9 + 3;
                            int indexOf2 = TextUtils.indexOf(charSequenceArr[0], '\n', i17);
                            String substring = (indexOf2 < 0 || indexOf2 - i17 <= 0) ? "" : charSequenceArr[0].toString().substring(i17, indexOf2);
                            CharSequence substring2 = substring(charSequenceArr[0], 0, i9 - i16);
                            int length = substring.length() + i17 + (!substring.isEmpty());
                            if (length >= 0 && length < charSequenceArr[0].length() && length <= indexOf) {
                                CharSequence substring3 = substring(charSequenceArr[0], length, indexOf);
                                int i18 = indexOf + 3;
                                char charAt2 = i18 < charSequenceArr[0].length() ? charSequenceArr[0].charAt(i18) : (char) 0;
                                CharSequence charSequence2 = charSequenceArr[0];
                                CharSequence substring4 = substring(charSequence2, i18 + ((charAt2 == ' ' || charAt2 == '\n') ? 1 : 0), charSequence2.length());
                                if (substring2.length() != 0) {
                                    substring2 = AndroidUtilities.concat(substring2, "\n");
                                } else {
                                    i16 = 1;
                                }
                                if (substring4.length() > 0 && substring4.charAt(0) != '\n') {
                                    substring4 = AndroidUtilities.concat("\n", substring4);
                                }
                                if (substring3.length() <= 0 || substring3.charAt(substring3.length() - 1) != '\n') {
                                    i12 = 0;
                                } else {
                                    substring3 = substring(substring3, 0, substring3.length() - 1);
                                    i12 = 1;
                                }
                                if (!TextUtils.isEmpty(substring3)) {
                                    if (substring3.length() > 1 && substring3.charAt(0) == '\n') {
                                        substring3 = substring3.subSequence(1, substring3.length());
                                        indexOf--;
                                    }
                                    charSequenceArr[0] = AndroidUtilities.concat(substring2, substring3, substring4);
                                    TLRPC.MessageEntity tL_messageEntityPre = new TLRPC.TL_messageEntityPre();
                                    tL_messageEntityPre.offset = (i16 ^ 1) + i9;
                                    tL_messageEntityPre.length = ((((indexOf - i9) - 3) - (substring.length() + (!substring.isEmpty()))) + (i16 ^ 1)) - i12;
                                    if (TextUtils.isEmpty(substring) || substring.trim().length() == 0) {
                                        substring = "";
                                    }
                                    tL_messageEntityPre.language = substring;
                                    arrayList.add(tL_messageEntityPre);
                                    i10 -= 6;
                                }
                            }
                            i14 = i10;
                            i13 = -1;
                        }
                    } else {
                        z12 = charSequenceArr[0].length() - indexOf > 2 && charSequenceArr[0].charAt(indexOf + 1) == '`' && charSequenceArr[0].charAt(indexOf + 2) == '`';
                        i9 = indexOf;
                        i14 = indexOf + (z12 ? 3 : 1);
                    }
                }
                CharSequence substring5 = substring(charSequenceArr[0], 0, i9);
                CharSequence substring6 = substring(charSequenceArr[0], i11, indexOf);
                CharSequence charSequence3 = charSequenceArr[0];
                charSequenceArr[0] = AndroidUtilities.concat(substring5, substring6, substring(charSequence3, indexOf + 1, charSequence3.length()));
                TLRPC.MessageEntity tL_messageEntityCode = new TLRPC.TL_messageEntityCode();
                tL_messageEntityCode.offset = i9;
                tL_messageEntityCode.length = (indexOf - i9) - 1;
                arrayList.add(tL_messageEntityCode);
                i10 -= 2;
                i14 = i10;
                i13 = -1;
                z12 = false;
            }
            if (i9 != i13 && z12) {
                CharSequence substring7 = substring(charSequenceArr[0], 0, i9);
                CharSequence charSequence4 = charSequenceArr[0];
                charSequenceArr[0] = AndroidUtilities.concat(substring7, substring(charSequence4, i9 + 2, charSequence4.length()));
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                TLRPC.MessageEntity tL_messageEntityCode2 = new TLRPC.TL_messageEntityCode();
                tL_messageEntityCode2.offset = i9;
                tL_messageEntityCode2.length = 1;
                arrayList.add(tL_messageEntityCode2);
            }
            CharSequence charSequence5 = charSequenceArr[0];
            if (charSequence5 instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence5;
                wz0[] wz0VarArr = (wz0[]) spanned.getSpans(0, charSequence5.length(), wz0.class);
                if (wz0VarArr != null && wz0VarArr.length > 0) {
                    for (wz0 wz0Var : wz0VarArr) {
                        int spanStart = spanned.getSpanStart(wz0Var);
                        int spanEnd = spanned.getSpanEnd(wz0Var);
                        if (!checkInclusion(spanStart, arrayList, false) && !checkInclusion(spanEnd, arrayList, true) && !checkIntersection(spanStart, spanEnd, arrayList)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                            }
                            addStyle(wz0Var.b.a, spanStart, spanEnd, arrayList);
                        }
                    }
                }
                s41[] s41VarArr = (s41[]) spanned.getSpans(0, charSequenceArr[0].length(), s41.class);
                if (s41VarArr != null && s41VarArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    for (int i19 = 0; i19 < s41VarArr.length; i19++) {
                        TLRPC.TL_inputMessageEntityMentionName tL_inputMessageEntityMentionName = new TLRPC.TL_inputMessageEntityMentionName();
                        TLRPC.InputUser inputUser = getMessagesController().getInputUser(Utilities.parseLong(s41VarArr[i19].getURL()).longValue());
                        tL_inputMessageEntityMentionName.user_id = inputUser;
                        if (inputUser != null) {
                            tL_inputMessageEntityMentionName.offset = spanned.getSpanStart(s41VarArr[i19]);
                            tL_inputMessageEntityMentionName.length = Math.min(spanned.getSpanEnd(s41VarArr[i19]), charSequenceArr[0].length()) - tL_inputMessageEntityMentionName.offset;
                            if (charSequenceArr[0].charAt((r11 + r8) - 1) == ' ') {
                                tL_inputMessageEntityMentionName.length--;
                            }
                            arrayList.add(tL_inputMessageEntityMentionName);
                        }
                    }
                }
                r41[] r41VarArr = (r41[]) spanned.getSpans(0, charSequenceArr[0].length(), r41.class);
                if (r41VarArr != null && r41VarArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    for (int i20 = 0; i20 < r41VarArr.length; i20++) {
                        TLRPC.MessageEntity tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
                        tL_messageEntityTextUrl.offset = spanned.getSpanStart(r41VarArr[i20]);
                        tL_messageEntityTextUrl.length = Math.min(spanned.getSpanEnd(r41VarArr[i20]), charSequenceArr[0].length()) - tL_messageEntityTextUrl.offset;
                        tL_messageEntityTextUrl.url = r41VarArr[i20].getURL();
                        arrayList.add(tL_messageEntityTextUrl);
                        vz0 vz0Var = r41VarArr[i20].a;
                        if (vz0Var != null) {
                            int i21 = vz0Var.a;
                            int i22 = tL_messageEntityTextUrl.offset;
                            addStyle(i21, i22, tL_messageEntityTextUrl.length + i22, arrayList);
                        }
                    }
                }
                org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spanned.getSpans(0, charSequenceArr[0].length(), org.telegram.ui.Components.t5.class);
                if (t5VarArr != null && t5VarArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    ArrayList<TLRPC.MessageEntity> arrayList2 = arrayList;
                    for (org.telegram.ui.Components.t5 t5Var : t5VarArr) {
                        if (t5Var != null) {
                            try {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                                tL_messageEntityCustomEmoji.offset = spanned.getSpanStart(t5Var);
                                tL_messageEntityCustomEmoji.length = Math.min(spanned.getSpanEnd(t5Var), charSequenceArr[0].length()) - tL_messageEntityCustomEmoji.offset;
                                tL_messageEntityCustomEmoji.document_id = t5Var.getDocumentId();
                                tL_messageEntityCustomEmoji.document = t5Var.document;
                                arrayList2.add(tL_messageEntityCustomEmoji);
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                        }
                    }
                    arrayList = arrayList2;
                }
                CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) spanned.getSpans(0, charSequenceArr[0].length(), CodeHighlighting.Span.class);
                if (spanArr != null && spanArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    ArrayList<TLRPC.MessageEntity> arrayList3 = arrayList;
                    for (CodeHighlighting.Span span : spanArr) {
                        if (span != null) {
                            try {
                                TLRPC.MessageEntity tL_messageEntityPre2 = new TLRPC.TL_messageEntityPre();
                                tL_messageEntityPre2.offset = spanned.getSpanStart(span);
                                tL_messageEntityPre2.length = Math.min(spanned.getSpanEnd(span), charSequenceArr[0].length()) - tL_messageEntityPre2.offset;
                                tL_messageEntityPre2.language = span.lng;
                                arrayList3.add(tL_messageEntityPre2);
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                        }
                    }
                    arrayList = arrayList3;
                }
                fi0[] fi0VarArr = (fi0[]) spanned.getSpans(0, charSequenceArr[0].length(), fi0.class);
                if (fi0VarArr != null && fi0VarArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    ArrayList<TLRPC.MessageEntity> arrayList4 = arrayList;
                    for (fi0 fi0Var : fi0VarArr) {
                        if (fi0Var != null) {
                            try {
                                TLRPC.MessageEntity tL_messageEntityBlockquote = new TLRPC.TL_messageEntityBlockquote();
                                tL_messageEntityBlockquote.offset = spanned.getSpanStart(fi0Var);
                                tL_messageEntityBlockquote.length = Math.min(spanned.getSpanEnd(fi0Var), charSequenceArr[0].length()) - tL_messageEntityBlockquote.offset;
                                tL_messageEntityBlockquote.collapsed = fi0Var.e;
                                arrayList4.add(tL_messageEntityBlockquote);
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                        }
                    }
                    arrayList = arrayList4;
                }
                s00[] s00VarArr = (s00[]) spanned.getSpans(0, charSequenceArr[0].length(), s00.class);
                if (s00VarArr != null && s00VarArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    ArrayList<TLRPC.MessageEntity> arrayList5 = arrayList;
                    for (s00 s00Var : s00VarArr) {
                        if (s00Var != null) {
                            try {
                                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                                tL_messageEntityFormattedDate.offset = spanned.getSpanStart(s00Var);
                                tL_messageEntityFormattedDate.length = Math.min(spanned.getSpanEnd(s00Var), charSequenceArr[0].length()) - tL_messageEntityFormattedDate.offset;
                                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate2 = s00Var.b;
                                tL_messageEntityFormattedDate.relative = tL_messageEntityFormattedDate2.relative;
                                tL_messageEntityFormattedDate.short_time = tL_messageEntityFormattedDate2.short_time;
                                tL_messageEntityFormattedDate.long_time = tL_messageEntityFormattedDate2.long_time;
                                tL_messageEntityFormattedDate.long_date = tL_messageEntityFormattedDate2.long_date;
                                tL_messageEntityFormattedDate.short_date = tL_messageEntityFormattedDate2.short_date;
                                tL_messageEntityFormattedDate.day_of_week = tL_messageEntityFormattedDate2.day_of_week;
                                tL_messageEntityFormattedDate.date = tL_messageEntityFormattedDate2.date;
                                arrayList5.add(tL_messageEntityFormattedDate);
                            } catch (Exception e13) {
                                FileLog.e(e13);
                            }
                        }
                    }
                    arrayList = arrayList5;
                }
                if (spanned instanceof Spannable) {
                    Spannable spannable = (Spannable) spanned;
                    AndroidUtilities.addLinksSafe(spannable, 1, false, false);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, charSequenceArr[0].length(), URLSpan.class);
                    if (uRLSpanArr != null && uRLSpanArr.length > 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        for (int i23 = 0; i23 < uRLSpanArr.length; i23++) {
                            URLSpan uRLSpan = uRLSpanArr[i23];
                            if (!(uRLSpan instanceof r41) && !(uRLSpan instanceof s41) && !(uRLSpan instanceof s00)) {
                                TLRPC.MessageEntity tL_messageEntityUrl = new TLRPC.TL_messageEntityUrl();
                                tL_messageEntityUrl.offset = spanned.getSpanStart(uRLSpanArr[i23]);
                                tL_messageEntityUrl.length = Math.min(spanned.getSpanEnd(uRLSpanArr[i23]), charSequenceArr[0].length()) - tL_messageEntityUrl.offset;
                                tL_messageEntityUrl.url = uRLSpanArr[i23].getURL();
                                arrayList.add(tL_messageEntityUrl);
                                spannable.removeSpan(uRLSpanArr[i23]);
                            }
                        }
                    }
                }
            }
            CharSequence charSequence6 = charSequenceArr[0];
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (z11) {
                charSequence6 = parsePattern(parsePattern(parsePattern(charSequence6, BOLD_PATTERN, arrayList, new b(22)), ITALIC_PATTERN, arrayList, new b(23)), SPOILER_PATTERN, arrayList, new b(24));
                if (z10) {
                    charSequence6 = parsePattern(charSequence6, STRIKE_PATTERN, arrayList, new b(25));
                }
            }
            while (charSequence6.length() > 0 && (charSequence6.charAt(0) == '\n' || charSequence6.charAt(0) == ' ')) {
                int i24 = 1;
                charSequence6 = charSequence6.subSequence(1, charSequence6.length());
                int i25 = 0;
                while (i25 < arrayList.size()) {
                    TLRPC.MessageEntity messageEntity = arrayList.get(i25);
                    int i26 = messageEntity.offset;
                    if (i26 == 0) {
                        messageEntity.length -= i24;
                    }
                    messageEntity.offset = Math.max(0, i26 - 1);
                    i25++;
                    i24 = 1;
                }
            }
            while (charSequence6.length() > 0 && (charSequence6.charAt(charSequence6.length() - 1) == '\n' || charSequence6.charAt(charSequence6.length() - 1) == ' ')) {
                charSequence6 = charSequence6.subSequence(0, charSequence6.length() - 1);
                for (int i27 = 0; i27 < arrayList.size(); i27++) {
                    TLRPC.MessageEntity messageEntity2 = arrayList.get(i27);
                    if (messageEntity2.offset + messageEntity2.length > charSequence6.length()) {
                        messageEntity2.length--;
                    }
                }
            }
            charSequenceArr[0] = charSequence6;
        }
        return arrayList;
    }

    public ArrayList<TLRPC.Document> getRecentStickers(int i9, boolean z10) {
        ArrayList<TLRPC.Document> arrayList = this.recentStickers[i9];
        if (i9 == 7) {
            return new ArrayList<>(this.recentStickers[i9]);
        }
        ArrayList<TLRPC.Document> arrayList2 = new ArrayList<>(arrayList.subList(0, Math.min(arrayList.size(), 20)));
        if (z10 && !arrayList2.isEmpty()) {
            arrayList2.add(0, new TLRPC.TL_documentEmpty());
        }
        return arrayList2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:13|(2:15|(1:(2:18|19)(1:20))(1:21))(2:159|(1:161)(2:162|(2:164|(21:29|(2:31|(3:33|(2:35|36)|145)(6:146|(1:148)(2:150|(1:152)(3:153|(2:155|36)|145))|149|(2:(3:139|140|141)(1:97)|(13:101|102|103|104|(5:106|(1:108)(1:129)|109|110|111)(4:130|(1:132)|133|134)|112|113|114|115|116|117|118|119)(1:100))(1:40)|41|(7:43|(1:45)(1:78)|46|(1:48)(1:(2:68|(1:70)(1:71))(2:72|(1:77)(1:76)))|(1:50)(1:66)|51|(2:53|(2:62|63)(3:(1:58)(1:61)|59|60))(2:64|65))(4:79|(1:81)(2:84|(2:86|(1:88)(1:89))(2:90|(1:95)(1:94)))|82|83)))(3:156|(2:158|36)|145)|37|(0)|(0)(0)|(0)|101|102|103|104|(0)(0)|112|113|114|115|116|117|118|119|41|(0)(0))(1:(2:26|27)(1:28)))(1:(2:166|167)(1:168))))|22|(0)|29|(0)(0)|37|(0)|(0)(0)|(0)|101|102|103|104|(0)(0)|112|113|114|115|116|117|118|119|41|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01d2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01d3, code lost:
    
        r14 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01d8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01d9, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0139, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x013a, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01db, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0127 A[Catch: all -> 0x0139, TRY_ENTER, TryCatch #3 {all -> 0x0139, blocks: (B:106:0x0127, B:108:0x0132, B:110:0x0141, B:129:0x013d, B:132:0x0155), top: B:104:0x0125 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x014a A[Catch: all -> 0x01db, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x01db, blocks: (B:103:0x0113, B:112:0x019b, B:130:0x014a, B:134:0x0164), top: B:102:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00dd A[Catch: Exception -> 0x0012, TryCatch #6 {Exception -> 0x0012, blocks: (B:3:0x0008, B:5:0x000c, B:9:0x001e, B:13:0x0024, B:15:0x002a, B:18:0x003e, B:21:0x0044, B:26:0x0083, B:31:0x008d, B:33:0x0091, B:35:0x00a7, B:41:0x01e3, B:43:0x01e9, B:46:0x01f3, B:48:0x021a, B:50:0x025e, B:51:0x0291, B:53:0x029b, B:55:0x029f, B:59:0x02aa, B:61:0x02a6, B:62:0x02af, B:63:0x02b6, B:64:0x02b7, B:65:0x02be, B:68:0x0223, B:70:0x0227, B:71:0x0232, B:72:0x023d, B:74:0x0243, B:76:0x0247, B:77:0x0252, B:79:0x02bf, B:81:0x02c6, B:82:0x030d, B:86:0x02d0, B:88:0x02d4, B:89:0x02e0, B:90:0x02ec, B:92:0x02f2, B:94:0x02f6, B:95:0x0302, B:124:0x01e0, B:146:0x00b1, B:148:0x00b7, B:150:0x00c1, B:152:0x00c7, B:153:0x00ce, B:155:0x00da, B:156:0x00dd, B:158:0x00e3, B:159:0x0055, B:161:0x005b, B:162:0x0068, B:164:0x006e, B:166:0x032a, B:169:0x0015), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[Catch: Exception -> 0x0012, TryCatch #6 {Exception -> 0x0012, blocks: (B:3:0x0008, B:5:0x000c, B:9:0x001e, B:13:0x0024, B:15:0x002a, B:18:0x003e, B:21:0x0044, B:26:0x0083, B:31:0x008d, B:33:0x0091, B:35:0x00a7, B:41:0x01e3, B:43:0x01e9, B:46:0x01f3, B:48:0x021a, B:50:0x025e, B:51:0x0291, B:53:0x029b, B:55:0x029f, B:59:0x02aa, B:61:0x02a6, B:62:0x02af, B:63:0x02b6, B:64:0x02b7, B:65:0x02be, B:68:0x0223, B:70:0x0227, B:71:0x0232, B:72:0x023d, B:74:0x0243, B:76:0x0247, B:77:0x0252, B:79:0x02bf, B:81:0x02c6, B:82:0x030d, B:86:0x02d0, B:88:0x02d4, B:89:0x02e0, B:90:0x02ec, B:92:0x02f2, B:94:0x02f6, B:95:0x0302, B:124:0x01e0, B:146:0x00b1, B:148:0x00b7, B:150:0x00c1, B:152:0x00c7, B:153:0x00ce, B:155:0x00da, B:156:0x00dd, B:158:0x00e3, B:159:0x0055, B:161:0x005b, B:162:0x0068, B:164:0x006e, B:166:0x032a, B:169:0x0015), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e9 A[Catch: Exception -> 0x0012, TryCatch #6 {Exception -> 0x0012, blocks: (B:3:0x0008, B:5:0x000c, B:9:0x001e, B:13:0x0024, B:15:0x002a, B:18:0x003e, B:21:0x0044, B:26:0x0083, B:31:0x008d, B:33:0x0091, B:35:0x00a7, B:41:0x01e3, B:43:0x01e9, B:46:0x01f3, B:48:0x021a, B:50:0x025e, B:51:0x0291, B:53:0x029b, B:55:0x029f, B:59:0x02aa, B:61:0x02a6, B:62:0x02af, B:63:0x02b6, B:64:0x02b7, B:65:0x02be, B:68:0x0223, B:70:0x0227, B:71:0x0232, B:72:0x023d, B:74:0x0243, B:76:0x0247, B:77:0x0252, B:79:0x02bf, B:81:0x02c6, B:82:0x030d, B:86:0x02d0, B:88:0x02d4, B:89:0x02e0, B:90:0x02ec, B:92:0x02f2, B:94:0x02f6, B:95:0x0302, B:124:0x01e0, B:146:0x00b1, B:148:0x00b7, B:150:0x00c1, B:152:0x00c7, B:153:0x00ce, B:155:0x00da, B:156:0x00dd, B:158:0x00e3, B:159:0x0055, B:161:0x005b, B:162:0x0068, B:164:0x006e, B:166:0x032a, B:169:0x0015), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02bf A[Catch: Exception -> 0x0012, TryCatch #6 {Exception -> 0x0012, blocks: (B:3:0x0008, B:5:0x000c, B:9:0x001e, B:13:0x0024, B:15:0x002a, B:18:0x003e, B:21:0x0044, B:26:0x0083, B:31:0x008d, B:33:0x0091, B:35:0x00a7, B:41:0x01e3, B:43:0x01e9, B:46:0x01f3, B:48:0x021a, B:50:0x025e, B:51:0x0291, B:53:0x029b, B:55:0x029f, B:59:0x02aa, B:61:0x02a6, B:62:0x02af, B:63:0x02b6, B:64:0x02b7, B:65:0x02be, B:68:0x0223, B:70:0x0227, B:71:0x0232, B:72:0x023d, B:74:0x0243, B:76:0x0247, B:77:0x0252, B:79:0x02bf, B:81:0x02c6, B:82:0x030d, B:86:0x02d0, B:88:0x02d4, B:89:0x02e0, B:90:0x02ec, B:92:0x02f2, B:94:0x02f6, B:95:0x0302, B:124:0x01e0, B:146:0x00b1, B:148:0x00b7, B:150:0x00c1, B:152:0x00c7, B:153:0x00ce, B:155:0x00da, B:156:0x00dd, B:158:0x00e3, B:159:0x0055, B:161:0x005b, B:162:0x0068, B:164:0x006e, B:166:0x032a, B:169:0x0015), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void installShortcut(long j10, int i9, Utilities.Callback<Boolean> callback) {
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.User user2;
        String str;
        TLRPC.FileLocation fileLocation;
        String str2;
        TLRPC.FileLocation fileLocation2;
        boolean z10;
        PendingIntent pendingIntent;
        Bitmap bitmap;
        int i10;
        PendingIntent pendingIntent2;
        String string;
        try {
            Intent createIntrnalShortcutIntent = i9 == SHORTCUT_TYPE_USER_OR_CHAT ? createIntrnalShortcutIntent(j10) : createIntrnalAttachedBotShortcutIntent(j10);
            if (createIntrnalShortcutIntent == null) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
            }
            if (DialogObject.isEncryptedDialog(j10)) {
                TLRPC.EncryptedChat encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j10)));
                if (encryptedChat == null) {
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                        return;
                    }
                    return;
                }
                user2 = getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
            } else if (DialogObject.isUserDialog(j10)) {
                user2 = getMessagesController().getUser(Long.valueOf(j10));
            } else {
                if (!DialogObject.isChatDialog(j10)) {
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                        return;
                    }
                    return;
                }
                chat = getMessagesController().getChat(Long.valueOf(-j10));
                user = null;
                if (user != null && chat == null) {
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                        return;
                    }
                    return;
                }
                if (user != null) {
                    str = chat.title;
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    if (chatPhoto != null) {
                        fileLocation = chatPhoto.photo_small;
                        TLRPC.FileLocation fileLocation3 = fileLocation;
                        str2 = str;
                        fileLocation2 = fileLocation3;
                    }
                    str2 = str;
                    fileLocation2 = null;
                } else {
                    if (i9 != SHORTCUT_TYPE_ATTACHED_BOT) {
                        if (UserObject.isReplyUser(user)) {
                            string = LocaleController.getString(R.string.RepliesTitle);
                        } else if (UserObject.isUserSelf(user)) {
                            string = LocaleController.getString(R.string.SavedMessages);
                        } else {
                            str = ContactsController.formatName(user.first_name, user.last_name);
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto != null) {
                                fileLocation = userProfilePhoto.photo_small;
                                TLRPC.FileLocation fileLocation32 = fileLocation;
                                str2 = str;
                                fileLocation2 = fileLocation32;
                            }
                            str2 = str;
                            fileLocation2 = null;
                        }
                        str2 = string;
                        fileLocation2 = null;
                        z10 = true;
                        if (z10 && fileLocation2 == null) {
                            pendingIntent = null;
                            bitmap = null;
                        } else {
                            if (z10) {
                                bitmap = null;
                            } else {
                                try {
                                    bitmap = BitmapFactory.decodeFile(getFileLoader().getPathToAttach(fileLocation2, true).toString());
                                } catch (Throwable th) {
                                    th = th;
                                    pendingIntent = null;
                                    bitmap = null;
                                    FileLog.e(th);
                                    if (Build.VERSION.SDK_INT >= 26) {
                                    }
                                }
                            }
                            if (z10 && bitmap == null) {
                                pendingIntent = null;
                            } else {
                                int dp = AndroidUtilities.dp(58.0f);
                                Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
                                createBitmap.eraseColor(0);
                                Canvas canvas = new Canvas(createBitmap);
                                if (z10) {
                                    org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8(0, user);
                                    if (UserObject.isReplyUser(user)) {
                                        z8Var.g(12);
                                    } else {
                                        z8Var.g(1);
                                    }
                                    z8Var.setBounds(0, 0, dp, dp);
                                    z8Var.draw(canvas);
                                    i10 = dp;
                                } else {
                                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                    BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                                    if (roundPaint == null) {
                                        roundPaint = new Paint(1);
                                        bitmapRect = new RectF();
                                    }
                                    float width = dp / bitmap.getWidth();
                                    canvas.save();
                                    canvas.scale(width, width);
                                    roundPaint.setShader(bitmapShader);
                                    i10 = dp;
                                    bitmapRect.set(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
                                    canvas.drawRoundRect(bitmapRect, bitmap.getWidth(), bitmap.getHeight(), roundPaint);
                                    canvas.restore();
                                }
                                Drawable drawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.book_logo);
                                int dp2 = AndroidUtilities.dp(15.0f);
                                int i11 = i10 - dp2;
                                int dp3 = i11 - AndroidUtilities.dp(2.0f);
                                int dp4 = i11 - AndroidUtilities.dp(2.0f);
                                Bitmap bitmap2 = bitmap;
                                drawable.setBounds(dp3, dp4, dp3 + dp2, dp4 + dp2);
                                drawable.draw(canvas);
                                pendingIntent = null;
                                canvas.setBitmap(null);
                                bitmap = createBitmap;
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 26) {
                            Intent intent = new Intent();
                            if (bitmap != null) {
                                intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
                            } else if (user != null) {
                                if (user.bot) {
                                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_bot));
                                } else {
                                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_user));
                                }
                            } else if (!ChatObject.isChannel(chat) || chat.megagroup) {
                                intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_group));
                            } else {
                                intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_channel));
                            }
                            intent.putExtra("android.intent.extra.shortcut.INTENT", createIntrnalShortcutIntent);
                            intent.putExtra("android.intent.extra.shortcut.NAME", str2);
                            intent.putExtra("duplicate", false);
                            intent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
                            ApplicationLoader.applicationContext.sendBroadcast(intent);
                            return;
                        }
                        String str3 = i9 == SHORTCUT_TYPE_USER_OR_CHAT ? "sdid_" : "bdid_";
                        Context context = ApplicationLoader.applicationContext;
                        g0.c cVar = new g0.c();
                        cVar.a = context;
                        cVar.b = str3 + j10;
                        cVar.e = str2;
                        cVar.c = new Intent[]{createIntrnalShortcutIntent};
                        if (bitmap != null) {
                            cVar.h = IconCompat.c(bitmap);
                        } else if (user != null) {
                            if (user.bot) {
                                cVar.h = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.book_bot);
                            } else {
                                cVar.h = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.book_user);
                            }
                        } else if (!ChatObject.isChannel(chat) || chat.megagroup) {
                            cVar.h = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.book_group);
                        } else {
                            cVar.h = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.book_channel);
                        }
                        if (callback != null) {
                            byte[] bArr = new byte[16];
                            Utilities.fastRandom.nextBytes(bArr);
                            String bytesToHex = Utilities.bytesToHex(bArr);
                            Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) ShortcutResultReceiver.class);
                            intent2.putExtra("account", this.currentAccount);
                            intent2.putExtra("req_id", bytesToHex);
                            pendingIntent2 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent2, 167772160);
                            this.shortcutCallbacks.put(bytesToHex, callback);
                        } else {
                            pendingIntent2 = pendingIntent;
                        }
                        Context context2 = ApplicationLoader.applicationContext;
                        if (TextUtils.isEmpty(cVar.e)) {
                            throw new IllegalArgumentException("Shortcut must have a non-empty label");
                        }
                        Intent[] intentArr = cVar.c;
                        if (intentArr == null || intentArr.length == 0) {
                            throw new IllegalArgumentException("Shortcut must have an intent");
                        }
                        g0.f.r(context2, cVar, pendingIntent2 == null ? pendingIntent : pendingIntent2.getIntentSender());
                        return;
                    }
                    str = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)));
                    TLRPC.UserProfilePhoto userProfilePhoto2 = user.photo;
                    if (userProfilePhoto2 != null) {
                        fileLocation = userProfilePhoto2.photo_small;
                        TLRPC.FileLocation fileLocation322 = fileLocation;
                        str2 = str;
                        fileLocation2 = fileLocation322;
                    }
                    str2 = str;
                    fileLocation2 = null;
                }
                z10 = false;
                if (z10) {
                }
                if (z10) {
                }
                if (z10) {
                }
                int dp5 = AndroidUtilities.dp(58.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(dp5, dp5, Bitmap.Config.ARGB_8888);
                createBitmap2.eraseColor(0);
                Canvas canvas2 = new Canvas(createBitmap2);
                if (z10) {
                }
                Drawable drawable2 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.book_logo);
                int dp22 = AndroidUtilities.dp(15.0f);
                int i112 = i10 - dp22;
                int dp32 = i112 - AndroidUtilities.dp(2.0f);
                int dp42 = i112 - AndroidUtilities.dp(2.0f);
                Bitmap bitmap22 = bitmap;
                drawable2.setBounds(dp32, dp42, dp32 + dp22, dp42 + dp22);
                drawable2.draw(canvas2);
                pendingIntent = null;
                canvas2.setBitmap(null);
                bitmap = createBitmap2;
                if (Build.VERSION.SDK_INT >= 26) {
                }
            }
            user = user2;
            chat = null;
            if (user != null) {
            }
            if (user != null) {
            }
            z10 = false;
            if (z10) {
            }
            if (z10) {
            }
            if (z10) {
            }
            int dp52 = AndroidUtilities.dp(58.0f);
            Bitmap createBitmap22 = Bitmap.createBitmap(dp52, dp52, Bitmap.Config.ARGB_8888);
            createBitmap22.eraseColor(0);
            Canvas canvas22 = new Canvas(createBitmap22);
            if (z10) {
            }
            Drawable drawable22 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.book_logo);
            int dp222 = AndroidUtilities.dp(15.0f);
            int i1122 = i10 - dp222;
            int dp322 = i1122 - AndroidUtilities.dp(2.0f);
            int dp422 = i1122 - AndroidUtilities.dp(2.0f);
            Bitmap bitmap222 = bitmap;
            drawable22.setBounds(dp322, dp422, dp322 + dp222, dp422 + dp222);
            drawable22.draw(canvas22);
            pendingIntent = null;
            canvas22.setBitmap(null);
            bitmap = createBitmap22;
            if (Build.VERSION.SDK_INT >= 26) {
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public boolean isStickerPackInstalled(long j10, boolean z10) {
        if (this.installedStickerSetsById.h(j10) >= 0 || (z10 && this.installedForceStickerSetsById.contains(Long.valueOf(j10)))) {
            return (z10 && this.uninstalledForceStickerSetsById.contains(Long.valueOf(j10))) ? false : true;
        }
        return false;
    }

    public void loadAttachMenuBots(boolean z10, boolean z11, Runnable runnable) {
        this.isLoadingMenuBots = true;
        if (z10) {
            getMessagesStorage().getStorageQueue().postRunnable(new g7(this, 13));
            return;
        }
        TLRPC.TL_messages_getAttachMenuBots tL_messages_getAttachMenuBots = new TLRPC.TL_messages_getAttachMenuBots();
        tL_messages_getAttachMenuBots.hash = z11 ? 0L : this.menuBotsUpdateHash;
        getConnectionsManager().sendRequest(tL_messages_getAttachMenuBots, new t1(5, this, runnable));
    }

    public void loadBotInfo(long j10, long j11, boolean z10, int i9, Utilities.Callback<TL_bots.BotInfo> callback) {
        if (z10) {
            TL_bots.BotInfo botInfo = this.botInfos.get(j10 + "_" + j11);
            if (botInfo != null) {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botInfoDidLoad, botInfo, Integer.valueOf(i9));
                return;
            }
        }
        getMessagesStorage().getStorageQueue().postRunnable(new m9(this, j10, j11, callback, i9, 0));
    }

    public void loadBotKeyboard(MessagesStorage.TopicKey topicKey, boolean z10) {
        TLRPC.Message message = this.botKeyboards.get(topicKey);
        if (message != null) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, message, topicKey);
        } else {
            getMessagesStorage().getStorageQueue().postRunnable(new l6(this, topicKey, z10, 3));
        }
    }

    public void loadStickers(int i9, boolean z10, boolean z11, boolean z12) {
        loadStickers(i9, z10, z11, z12, null);
    }

    public void preloadImage(ImageReceiver imageReceiver, ImageLocation imageLocation, String str) {
        if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
            imageReceiver.setUniqKeyPrefix("preload");
            imageReceiver.setFileLoadingPriority(0);
            imageReceiver.setImage(imageLocation, str, null, null, 0, 11);
        }
    }

    public void putStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10) {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) {
            return;
        }
        this.stickerSetsById.k(tL_messages_stickerSet, stickerSet.id);
        if (!TextUtils.isEmpty(tL_messages_stickerSet.set.short_name)) {
            this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
        }
        int i9 = 0;
        while (true) {
            ArrayList<TLRPC.TL_messages_stickerSet>[] arrayListArr = this.stickerSets;
            if (i9 >= arrayListArr.length) {
                break;
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList = arrayListArr[i9];
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList.get(i10);
                    if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.id == tL_messages_stickerSet.set.id) {
                        arrayList.set(i10, tL_messages_stickerSet);
                    }
                }
            }
            i9++;
        }
        if (this.groupStickerSets.d(tL_messages_stickerSet.set.id)) {
            this.groupStickerSets.k(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
        }
        saveStickerSetIntoCache(tL_messages_stickerSet);
        TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet.set;
        int i11 = stickerSet3.masks ? 1 : stickerSet3.emojis ? 5 : 0;
        if (z10) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i11), Boolean.TRUE);
        }
    }

    public void saveDraft(long j10, long j11, CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.Message message, gn gnVar, TLRPC.SuggestedPost suggestedPost, long j12, boolean z10, boolean z11) {
        saveDraft(j10, j11, charSequence, arrayList, message, gnVar, suggestedPost, j12, z10, z11, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void searchMessagesInChat(String str, final long j10, final long j11, final int i9, final int i10, final long j12, boolean z10, final TLRPC.User user, final TLRPC.Chat chat, final boolean z11, final hg.r0 r0Var) {
        String str2;
        long j13;
        int i11;
        long j14;
        int i12;
        boolean z12;
        boolean[] zArr;
        long j15;
        TLRPC.User user2;
        TLRPC.Chat chat2;
        hg.r0 r0Var2;
        String str3;
        char c10;
        TLRPC.InputPeer inputPeer;
        final int i13;
        boolean z13 = !z10;
        if (this.reqId != 0) {
            this.loadingMoreSearchMessages = false;
            getConnectionsManager().cancelRequest(this.reqId, true);
            this.reqId = 0;
        }
        if (this.mergeReqId != 0) {
            getConnectionsManager().cancelRequest(this.mergeReqId, true);
            this.mergeReqId = 0;
        }
        if (str != null) {
            if (!z10) {
                boolean[] zArr2 = this.messagesSearchEndReached;
                zArr2[1] = false;
                zArr2[0] = false;
                int[] iArr = this.messagesSearchCount;
                iArr[1] = 0;
                iArr[0] = 0;
                this.searchResultMessages.clear();
                this.searchLocalResultMessages.clear();
                this.searchServerResultMessagesMap[0].clear();
                this.searchServerResultMessagesMap[1].clear();
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsLoading, Integer.valueOf(i9));
            }
            str2 = str;
            j13 = j10;
            i11 = 0;
        } else {
            if (this.searchResultMessages.isEmpty()) {
                this.loadingMoreSearchMessages = false;
                return;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    this.loadingMoreSearchMessages = false;
                    return;
                }
                int i14 = this.lastReturnedNum - 1;
                this.lastReturnedNum = i14;
                if (i14 < 0) {
                    this.lastReturnedNum = 0;
                    return;
                }
                if (i14 >= this.searchResultMessages.size()) {
                    this.lastReturnedNum = this.searchResultMessages.size() - 1;
                }
                MessageObject messageObject = this.searchResultMessages.get(this.lastReturnedNum);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i9), Integer.valueOf(messageObject.getId()), Integer.valueOf(getMask()), Long.valueOf(messageObject.getDialogId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.valueOf(z11));
                this.loadingMoreSearchMessages = false;
                return;
            }
            int i15 = this.lastReturnedNum + 1;
            this.lastReturnedNum = i15;
            if (i15 < this.searchResultMessages.size()) {
                MessageObject messageObject2 = this.searchResultMessages.get(this.lastReturnedNum);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i9), Integer.valueOf(messageObject2.getId()), Integer.valueOf(getMask()), Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.valueOf(z11));
                this.loadingMoreSearchMessages = false;
                return;
            }
            boolean[] zArr3 = this.messagesSearchEndReached;
            if (zArr3[0] && j11 == 0 && zArr3[1]) {
                this.lastReturnedNum--;
                this.loadingMoreSearchMessages = false;
                return;
            }
            String str4 = this.lastSearchQuery;
            MessageObject messageObject3 = (MessageObject) j3.r0.j(1, this.searchResultMessages);
            if (messageObject3.getDialogId() != j10 || this.messagesSearchEndReached[0]) {
                i11 = messageObject3.getDialogId() == j11 ? messageObject3.getId() : 0;
                this.messagesSearchEndReached[1] = false;
                j13 = j11;
            } else {
                i11 = messageObject3.getId();
                j13 = j10;
            }
            str2 = str4;
            z13 = false;
        }
        if (str2 != null) {
            i12 = 0;
            j14 = 0;
            if (str2.trim().startsWith("#") || str2.trim().startsWith("$")) {
                z12 = true;
                zArr = this.messagesSearchEndReached;
                if (zArr[i12] && !zArr[1] && j11 != j14) {
                    j13 = j11;
                }
                if (j13 == j10 || !z13) {
                    j15 = j10;
                    user2 = user;
                    chat2 = chat;
                    r0Var2 = r0Var;
                    str3 = str2;
                    c10 = 1;
                } else {
                    if (j11 != j14) {
                        TLRPC.InputPeer inputPeer2 = getMessagesController().getInputPeer(j11);
                        if (inputPeer2 == null) {
                            return;
                        }
                        final TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                        tL_messages_search.peer = inputPeer2;
                        this.lastMergeDialogId = j11;
                        tL_messages_search.limit = 1;
                        tL_messages_search.q = str2;
                        if (user != null) {
                            tL_messages_search.from_id = MessagesController.getInputPeer(user);
                            tL_messages_search.flags |= 1;
                        } else if (chat != null) {
                            tL_messages_search.from_id = MessagesController.getInputPeer(chat);
                            tL_messages_search.flags |= 1;
                        }
                        if (j12 != j14) {
                            if (j10 == getUserConfig().getClientUserId() || getMessagesStorage().isMonoForum(j13)) {
                                tL_messages_search.saved_peer_id = getMessagesController().getInputPeer(j12);
                                tL_messages_search.flags |= 4;
                            } else {
                                tL_messages_search.top_msg_id = (int) j12;
                                tL_messages_search.flags |= 2;
                            }
                        }
                        if (r0Var != null) {
                            tL_messages_search.saved_reaction.add(r0Var.g());
                            tL_messages_search.flags |= 8;
                        }
                        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                        this.mergeReqId = getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() { // from class: org.telegram.messenger.d7
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                MediaDataController.this.lambda$searchMessagesInChat$121(j11, tL_messages_search, j10, i9, i10, j12, user, chat, z11, r0Var, tLObject, tL_error);
                            }
                        }, 2);
                        return;
                    }
                    j15 = j10;
                    user2 = user;
                    chat2 = chat;
                    r0Var2 = r0Var;
                    str3 = str2;
                    c10 = 1;
                    this.lastMergeDialogId = j14;
                    zArr[1] = true;
                    this.messagesSearchCount[1] = i12;
                }
                final TLRPC.TL_messages_search tL_messages_search2 = new TLRPC.TL_messages_search();
                inputPeer = getMessagesController().getInputPeer(j13);
                tL_messages_search2.peer = inputPeer;
                if (inputPeer != null) {
                    this.loadingMoreSearchMessages = false;
                    return;
                }
                this.lastGuid = i9;
                this.lastDialogId = j15;
                this.lastSearchUser = user2;
                this.lastSearchChat = chat2;
                this.lastReplyMessageId = j12;
                this.lastReaction = r0Var2;
                tL_messages_search2.limit = 21;
                tL_messages_search2.q = str3 != null ? str3 : "";
                tL_messages_search2.offset_id = i11;
                if (user2 != null) {
                    tL_messages_search2.from_id = MessagesController.getInputPeer(user2);
                    tL_messages_search2.flags |= 1;
                } else if (chat2 != null) {
                    tL_messages_search2.from_id = MessagesController.getInputPeer(chat2);
                    tL_messages_search2.flags |= 1;
                }
                this.loadingSearchLocal = false;
                this.loadedPredirectedSearchLocal = false;
                int i16 = this.lastReqId + 1;
                this.lastReqId = i16;
                boolean z14 = j15 == getUserConfig().getClientUserId();
                if (z14 && r0Var2 != null && z13) {
                    this.lastReturnedNum = 0;
                    this.searchServerResultMessages.clear();
                    this.searchServerResultMessagesMap[0].clear();
                    this.searchServerResultMessagesMap[c10].clear();
                    final int savedTagCount = getMessagesController().getSavedTagCount(this.lastReplyMessageId, r0Var2);
                    this.messagesLocalSearchCount = TextUtils.isEmpty(tL_messages_search2.q) ? savedTagCount : 0;
                    this.loadingSearchLocal = true;
                    this.loadedPredirectedSearchLocal = false;
                    MessagesStorage messagesStorage = getMessagesStorage();
                    TLRPC.Reaction g10 = r0Var2.g();
                    long j16 = this.lastReplyMessageId;
                    ArrayList<MessageObject> arrayList = this.searchLocalResultMessages;
                    i13 = i16;
                    messagesStorage.searchSavedByTag(g10, j16, str3, 300, arrayList == null ? 0 : arrayList.size(), new Utilities.Callback4() { // from class: org.telegram.messenger.e7
                        @Override // org.telegram.messenger.Utilities.Callback4
                        public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                            MediaDataController.this.lambda$searchMessagesInChat$122(i13, savedTagCount, i9, j10, (ArrayList) obj, (ArrayList) obj2, (ArrayList) obj3, (ArrayList) obj4);
                        }
                    }, true);
                } else {
                    i13 = i16;
                }
                final String str5 = str3;
                if (this.lastReplyMessageId != 0) {
                    if (j13 == getUserConfig().getClientUserId() || getMessagesStorage().isMonoForum(j13)) {
                        tL_messages_search2.saved_peer_id = getMessagesController().getInputPeer(this.lastReplyMessageId);
                        tL_messages_search2.flags |= 4;
                    } else {
                        tL_messages_search2.top_msg_id = (int) this.lastReplyMessageId;
                        tL_messages_search2.flags |= 2;
                    }
                }
                if (r0Var2 != null) {
                    tL_messages_search2.saved_reaction.add(r0Var2.g());
                    tL_messages_search2.flags |= 8;
                }
                tL_messages_search2.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                this.lastSearchQuery = str5;
                final int i17 = i13;
                final boolean z15 = z12;
                final TLRPC.Chat chat3 = chat2;
                final long j17 = j13;
                final boolean z16 = z14;
                this.reqId = getConnectionsManager().sendRequest(tL_messages_search2, new RequestDelegate() { // from class: org.telegram.messenger.f7
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        MediaDataController.this.lambda$searchMessagesInChat$125(tL_messages_search2, z16, str5, z15, i17, z11, j17, j10, i9, j11, j12, user, chat3, tLObject, tL_error);
                    }
                }, 2);
                return;
            }
        } else {
            j14 = 0;
            i12 = 0;
        }
        z12 = false;
        zArr = this.messagesSearchEndReached;
        if (zArr[i12]) {
            j13 = j11;
        }
        if (j13 == j10) {
        }
        j15 = j10;
        user2 = user;
        chat2 = chat;
        r0Var2 = r0Var;
        str3 = str2;
        c10 = 1;
        final TLRPC.TL_messages_search tL_messages_search22 = new TLRPC.TL_messages_search();
        inputPeer = getMessagesController().getInputPeer(j13);
        tL_messages_search22.peer = inputPeer;
        if (inputPeer != null) {
        }
    }

    public SearchStickersKey searchStickers(boolean z10, String str, String str2, Utilities.Callback<ArrayList<TLRPC.Document>> callback, boolean z11) {
        if (callback == null) {
            return null;
        }
        SearchStickersKey searchStickersKey = new SearchStickersKey(z10, str, str2);
        SearchStickersResult searchStickersResult = this.searchStickerResults.get(searchStickersKey);
        if ((searchStickersResult == null || (searchStickersResult.next_offset != null && z11)) && !this.loadingSearchStickersKeys.containsKey(searchStickersKey)) {
            this.loadingSearchStickersKeys.put(searchStickersKey, 0);
            getInstance(this.currentAccount).getEmojiSuggestions(new String[]{str}, str2, true, new x7(this, searchStickersKey, searchStickersResult, callback), false);
            return searchStickersKey;
        }
        if (searchStickersResult != null) {
            callback.run(searchStickersResult.documents);
            return searchStickersKey;
        }
        callback.run(new ArrayList<>());
        return searchStickersKey;
    }

    public void toggleStickerSet(Context context, TLObject tLObject, int i9, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, Runnable runnable, boolean z12) {
        toggleStickerSet(context, tLObject, i9, o2Var, null, z10, z11, runnable, z12);
    }

    public void verifyAnimatedStickerMessage(TLRPC.Message message, boolean z10) {
        if (message == null) {
            return;
        }
        TLRPC.Document document = MessageObject.getDocument(message);
        String stickerSetName = MessageObject.getStickerSetName(document);
        if (TextUtils.isEmpty(stickerSetName)) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.stickerSetsByName.get(stickerSetName);
        if (tL_messages_stickerSet == null) {
            if (z10) {
                AndroidUtilities.runOnUIThread(new f0(this, message, stickerSetName, 28));
                return;
            } else {
                lambda$verifyAnimatedStickerMessage$68(message, stickerSetName);
                return;
            }
        }
        int size = tL_messages_stickerSet.documents.size();
        for (int i9 = 0; i9 < size; i9++) {
            TLRPC.Document document2 = tL_messages_stickerSet.documents.get(i9);
            if (document2.id == document.id && document2.dc_id == document.dc_id) {
                message.stickerVerified = 1;
                return;
            }
        }
    }

    public static void addTextStyleRuns(MessageObject messageObject, Spannable spannable, int i9) {
        addTextStyleRuns(messageObject.messageOwner.entities, messageObject.messageText, spannable, i9);
    }

    public void getEmojiSuggestions(String[] strArr, String str, boolean z10, KeywordResultCallback keywordResultCallback, CountDownLatch countDownLatch, boolean z11, boolean z12, boolean z13, Integer num) {
        getEmojiSuggestions(strArr, str, z10, keywordResultCallback, countDownLatch, z11, z12, z13, false, num, false);
    }

    public boolean isStickerPackInstalled(String str) {
        return this.stickerSetsByName.containsKey(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void loadStickers(int i9, boolean z10, boolean z11, boolean z12, Utilities.Callback<ArrayList<TLRPC.TL_messages_stickerSet>> callback) {
        long j10;
        TLRPC.TL_messages_getMaskStickers tL_messages_getMaskStickers;
        if (this.loadingStickers[i9]) {
            if (z12) {
                this.scheduledLoadStickers[i9] = new t4(this, i9, z11, callback, 2);
                return;
            } else {
                if (callback != null) {
                    callback.run(null);
                    return;
                }
                return;
            }
        }
        if (i9 == 3) {
            if (this.featuredStickerSets[0].isEmpty() || !getMessagesController().preloadFeaturedStickers) {
                if (callback != null) {
                    callback.run(null);
                    return;
                }
                return;
            }
        } else if (i9 == 6) {
            if (this.featuredStickerSets[1].isEmpty() || !getMessagesController().preloadFeaturedStickers) {
                if (callback != null) {
                    callback.run(null);
                    return;
                }
                return;
            }
        } else if (i9 != 4) {
            loadArchivedStickersCount(i9, z10);
        }
        this.loadingStickers[i9] = true;
        if (z10) {
            getMessagesStorage().getStorageQueue().postRunnable(new p4(this, i9, callback, 10));
            return;
        }
        if (i9 == 3 || i9 == 6) {
            char c10 = i9 != 6 ? (char) 0 : (char) 1;
            TLRPC.TL_messages_allStickers tL_messages_allStickers = new TLRPC.TL_messages_allStickers();
            tL_messages_allStickers.hash2 = this.loadFeaturedHash[c10];
            int size = this.featuredStickerSets[c10].size();
            for (int i10 = 0; i10 < size; i10++) {
                tL_messages_allStickers.sets.add(this.featuredStickerSets[c10].get(i10).set);
            }
            processLoadStickersResponse(i9, tL_messages_allStickers, new o7(3, callback));
            return;
        }
        if (i9 == 4) {
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetAnimatedEmoji();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new sa(this, i9, callback, 3));
            return;
        }
        if (i9 == 0) {
            TLRPC.TL_messages_getAllStickers tL_messages_getAllStickers = new TLRPC.TL_messages_getAllStickers();
            j10 = z11 ? 0L : this.loadHash[i9];
            tL_messages_getAllStickers.hash = j10;
            tL_messages_getMaskStickers = tL_messages_getAllStickers;
        } else if (i9 == 5) {
            TLRPC.TL_messages_getEmojiStickers tL_messages_getEmojiStickers = new TLRPC.TL_messages_getEmojiStickers();
            j10 = z11 ? 0L : this.loadHash[i9];
            tL_messages_getEmojiStickers.hash = j10;
            tL_messages_getMaskStickers = tL_messages_getEmojiStickers;
        } else {
            TLRPC.TL_messages_getMaskStickers tL_messages_getMaskStickers2 = new TLRPC.TL_messages_getMaskStickers();
            j10 = z11 ? 0L : this.loadHash[i9];
            tL_messages_getMaskStickers2.hash = j10;
            tL_messages_getMaskStickers = tL_messages_getMaskStickers2;
        }
        getConnectionsManager().sendRequest(tL_messages_getMaskStickers, new gh.v(this, i9, callback, j10, 4));
    }

    public void saveDraft(long j10, long j11, CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.Message message, gn gnVar, TLRPC.SuggestedPost suggestedPost, long j12, boolean z10, boolean z11, TL_iv.RichMessage richMessage) {
        TLRPC.DraftMessage tL_draftMessage;
        TLRPC.InputReplyTo inputReplyTo;
        TLRPC.Message message2 = (getMessagesController().isForum(j10) && j11 == 0) ? null : message;
        if (TextUtils.isEmpty(charSequence) && message2 == null && richMessage == null) {
            tL_draftMessage = new TLRPC.TL_draftMessageEmpty();
        } else {
            tL_draftMessage = new TLRPC.TL_draftMessage();
        }
        tL_draftMessage.rich_message = richMessage;
        tL_draftMessage.date = (int) (System.currentTimeMillis() / 1000);
        tL_draftMessage.message = charSequence == null ? "" : charSequence.toString();
        tL_draftMessage.no_webpage = z10;
        if (j12 != 0) {
            tL_draftMessage.flags |= 128;
            tL_draftMessage.effect = j12;
        }
        if (message2 != null) {
            TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
            tL_draftMessage.reply_to = tL_inputReplyToMessage;
            tL_draftMessage.flags |= 16;
            tL_inputReplyToMessage.reply_to_msg_id = message2.id;
            if (gnVar != null) {
                String str = gnVar.i;
                tL_inputReplyToMessage.quote_text = str;
                if (str != null) {
                    tL_inputReplyToMessage.flags |= 20;
                    tL_inputReplyToMessage.quote_offset = gnVar.b;
                }
                ArrayList<TLRPC.MessageEntity> arrayList2 = gnVar.j;
                tL_inputReplyToMessage.quote_entities = arrayList2;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    tL_draftMessage.reply_to.quote_entities = new ArrayList<>(tL_draftMessage.reply_to.quote_entities);
                    tL_draftMessage.reply_to.flags |= 8;
                }
                MessageObject messageObject = gnVar.a;
                if (messageObject != null && messageObject.messageOwner != null) {
                    TLRPC.Peer peer = getMessagesController().getPeer(j10);
                    TLRPC.Peer peer2 = gnVar.a.messageOwner.peer_id;
                    if (peer != null && !MessageObject.peersEqual(peer, peer2)) {
                        TLRPC.InputReplyTo inputReplyTo2 = tL_draftMessage.reply_to;
                        inputReplyTo2.flags |= 2;
                        inputReplyTo2.reply_to_peer_id = getMessagesController().getInputPeer(peer2);
                    }
                }
            } else if (j10 != MessageObject.getDialogId(message2)) {
                TLRPC.InputReplyTo inputReplyTo3 = tL_draftMessage.reply_to;
                inputReplyTo3.flags |= 2;
                inputReplyTo3.reply_to_peer_id = getMessagesController().getInputPeer(getMessagesController().getPeer(MessageObject.getDialogId(message2)));
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            tL_draftMessage.entities = arrayList;
            tL_draftMessage.flags |= 8;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        if (ChatObject.isMonoForum(chat) && ChatObject.canManageMonoForum(this.currentAccount, chat)) {
            tL_draftMessage.flags |= 16;
            TLRPC.InputReplyTo inputReplyTo4 = tL_draftMessage.reply_to;
            if (inputReplyTo4 == null) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_draftMessage.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = getMessagesController().getInputPeer(j11);
            } else {
                inputReplyTo4.monoforum_peer_id = getMessagesController().getInputPeer(j11);
                tL_draftMessage.reply_to.flags |= 32;
            }
        }
        if (suggestedPost != null) {
            tL_draftMessage.suggested_post = suggestedPost;
        }
        a0.h hVar = (a0.h) this.drafts.f(j10);
        TLRPC.DraftMessage draftMessage = hVar == null ? null : (TLRPC.DraftMessage) hVar.f(j11);
        if (!z11) {
            if (draftMessage != null) {
                if (draftMessage.message.equals(tL_draftMessage.message) && replyToEquals(draftMessage.reply_to, tL_draftMessage.reply_to) && suggestedPostEquals(draftMessage.suggested_post, tL_draftMessage.suggested_post) && richMessageEquals(draftMessage.rich_message, tL_draftMessage.rich_message) && draftMessage.no_webpage == tL_draftMessage.no_webpage && draftMessage.effect == tL_draftMessage.effect) {
                    return;
                }
            } else if (TextUtils.isEmpty(tL_draftMessage.message) && (((inputReplyTo = tL_draftMessage.reply_to) == null || inputReplyTo.reply_to_msg_id == 0) && tL_draftMessage.effect == 0 && tL_draftMessage.rich_message == null && tL_draftMessage.suggested_post == null)) {
                return;
            }
        }
        saveDraft(j10, j11, tL_draftMessage, message2, false);
        if (j11 == 0 || ChatObject.isForum(chat) || ChatObject.isMonoForum(chat)) {
            if (!DialogObject.isEncryptedDialog(j10)) {
                TLRPC.TL_messages_saveDraft tL_messages_saveDraft = new TLRPC.TL_messages_saveDraft();
                TLRPC.InputPeer inputPeer = getMessagesController().getInputPeer(j10);
                tL_messages_saveDraft.peer = inputPeer;
                if (inputPeer == null) {
                    return;
                }
                tL_messages_saveDraft.message = tL_draftMessage.message;
                tL_messages_saveDraft.no_webpage = tL_draftMessage.no_webpage;
                tL_messages_saveDraft.reply_to = tL_draftMessage.reply_to;
                tL_messages_saveDraft.suggested_post = tL_draftMessage.suggested_post;
                tL_messages_saveDraft.entities = tL_draftMessage.entities;
                TL_iv.RichMessage richMessage2 = tL_draftMessage.rich_message;
                if (richMessage2 != null) {
                    tL_messages_saveDraft.rich_message = toInputRichMessage(richMessage2);
                }
                if ((tL_draftMessage.flags & 128) != 0) {
                    tL_messages_saveDraft.effect = tL_draftMessage.effect;
                    tL_messages_saveDraft.flags |= 128;
                }
                getConnectionsManager().sendRequest(tL_messages_saveDraft, new c5(8));
            }
            getMessagesController().sortDialogs(null);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
    }

    public void toggleStickerSet(Context context, TLObject tLObject, int i9, org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, boolean z10, boolean z11, Runnable runnable, boolean z12) {
        toggleStickerSet(context, tLObject, null, i9, o2Var, frameLayout, z10, z11, runnable, z12);
    }

    public static void addTextStyleRuns(ArrayList<TLRPC.MessageEntity> arrayList, CharSequence charSequence, Spannable spannable) {
        addTextStyleRuns(arrayList, charSequence, spannable, -1);
    }

    public static TLRPC.InputStickerSet getInputStickerSet(TLRPC.Document document) {
        for (int i9 = 0; i9 < document.attributes.size(); i9++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i9);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty) {
                    return null;
                }
                return inputStickerSet;
            }
        }
        return null;
    }

    public void getEmojiSuggestions(final String[] strArr, final String str, final boolean z10, final KeywordResultCallback keywordResultCallback, final CountDownLatch countDownLatch, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final Integer num, final boolean z15) {
        if (keywordResultCallback == null) {
            return;
        }
        if (!TextUtils.isEmpty(str) && strArr != null) {
            final ArrayList arrayList = new ArrayList(Emoji.recentEmoji);
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.messenger.p8
                @Override // java.lang.Runnable
                public final void run() {
                    MediaDataController.this.lambda$getEmojiSuggestions$224(strArr, keywordResultCallback, z13, str, z10, arrayList, z11, num, z12, z14, z15, countDownLatch);
                }
            });
            if (countDownLatch != null) {
                try {
                    countDownLatch.await();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            return;
        }
        keywordResultCallback.run(new ArrayList<>(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void toggleStickerSet(final Context context, final TLObject tLObject, final TLRPC.Document document, final int i9, final org.telegram.ui.ActionBar.o2 o2Var, final FrameLayout frameLayout, final boolean z10, boolean z11, final Runnable runnable, boolean z12) {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        int i10;
        int i11;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3;
        int i12;
        char c10;
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject;
            stickerSet = tL_messages_stickerSet2.set;
        } else if (tLObject instanceof TLRPC.StickerSetCovered) {
            stickerSet = ((TLRPC.StickerSetCovered) tLObject).set;
            if (i9 != 2) {
                tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.stickerSetsById.f(stickerSet.id);
                if (tL_messages_stickerSet2 == null) {
                    return;
                }
            } else {
                stickerSet2 = stickerSet;
                tL_messages_stickerSet = null;
                if (stickerSet2.masks) {
                    i10 = stickerSet2.emojis ? 5 : 0;
                } else {
                    i10 = 1;
                }
                stickerSet2.archived = i9 != 1;
                i11 = 0;
                while (true) {
                    if (i11 < this.stickerSets[i10].size()) {
                        tL_messages_stickerSet3 = tL_messages_stickerSet;
                        i12 = 0;
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.stickerSets[i10].get(i11);
                    tL_messages_stickerSet3 = tL_messages_stickerSet;
                    if (tL_messages_stickerSet4.set.id == stickerSet2.id) {
                        this.stickerSets[i10].remove(i11);
                        if (i9 == 2) {
                            tL_messages_stickerSet4.set.title = stickerSet2.title;
                            this.stickerSets[i10].add(0, tL_messages_stickerSet4);
                        } else if (z12) {
                            this.stickerSetsById.l(tL_messages_stickerSet4.set.id);
                            this.installedStickerSetsById.l(tL_messages_stickerSet4.set.id);
                            this.stickerSetsByName.remove(tL_messages_stickerSet4.set.short_name);
                        }
                        i12 = i11;
                    } else {
                        i11++;
                        tL_messages_stickerSet = tL_messages_stickerSet3;
                    }
                }
                this.loadHash[i10] = calcStickersHash(this.stickerSets[i10]);
                int i13 = i10;
                putStickersToCache(i13, this.stickerSets[i10], this.loadDate[i10], this.loadHash[i10]);
                final int i14 = i13;
                if (i9 != 2) {
                    if (!cancelRemovingStickerSet(stickerSet2.id)) {
                        toggleStickerSetInternal(context, i9, o2Var, frameLayout, z10, tLObject, stickerSet2, document, i14, z11);
                    }
                    c10 = 1;
                } else if (z11 && o2Var != null) {
                    iw0 iw0Var = new iw0(context, tLObject, 1, i9, document, o2Var.getResourceProvider());
                    final boolean[] zArr = new boolean[1];
                    markSetUninstalling(stickerSet2.id, true);
                    org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(context, null, false);
                    final int i15 = i12;
                    final TLRPC.StickerSet stickerSet3 = stickerSet2;
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = tL_messages_stickerSet3;
                    ecVar.a = new Runnable() { // from class: org.telegram.messenger.s8
                        @Override // java.lang.Runnable
                        public final void run() {
                            MediaDataController.this.lambda$toggleStickerSet$108(zArr, stickerSet3, i14, i15, tL_messages_stickerSet5, runnable);
                        }
                    };
                    c10 = 1;
                    Runnable runnable2 = new Runnable() { // from class: org.telegram.messenger.t8
                        @Override // java.lang.Runnable
                        public final void run() {
                            MediaDataController.this.lambda$toggleStickerSet$109(zArr, context, i9, o2Var, frameLayout, z10, tLObject, stickerSet3, document, i14);
                        }
                    };
                    i14 = i14;
                    ecVar.b = runnable2;
                    iw0Var.setButton(ecVar);
                    this.removingStickerSetsUndos.k(new e1(ecVar, 25), stickerSet3.id);
                    if (frameLayout != null) {
                        org.telegram.ui.Components.gc.f(frameLayout, iw0Var, 2750).j();
                    } else {
                        org.telegram.ui.Components.gc.g(o2Var, iw0Var, 2750).j();
                    }
                } else {
                    c10 = 1;
                    toggleStickerSetInternal(context, i9, o2Var, frameLayout, z10, tLObject, stickerSet2, document, i14, false);
                }
                NotificationCenter notificationCenter = getNotificationCenter();
                int i16 = NotificationCenter.stickersDidLoad;
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(i14);
                objArr[c10] = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i16, objArr);
            }
        } else {
            throw new IllegalArgumentException("Invalid type of the given stickerSetObject: " + tLObject.getClass());
        }
        tL_messages_stickerSet = tL_messages_stickerSet2;
        stickerSet2 = stickerSet;
        if (stickerSet2.masks) {
        }
        stickerSet2.archived = i9 != 1;
        i11 = 0;
        while (true) {
            if (i11 < this.stickerSets[i10].size()) {
            }
            i11++;
            tL_messages_stickerSet = tL_messages_stickerSet3;
        }
        this.loadHash[i10] = calcStickersHash(this.stickerSets[i10]);
        int i132 = i10;
        putStickersToCache(i132, this.stickerSets[i10], this.loadDate[i10], this.loadHash[i10]);
        final int i142 = i132;
        if (i9 != 2) {
        }
        NotificationCenter notificationCenter2 = getNotificationCenter();
        int i162 = NotificationCenter.stickersDidLoad;
        Object[] objArr2 = new Object[2];
        objArr2[0] = Integer.valueOf(i142);
        objArr2[c10] = Boolean.TRUE;
        notificationCenter2.lambda$postNotificationNameOnUIThread$1(i162, objArr2);
    }

    public static void addTextStyleRuns(ArrayList<TLRPC.MessageEntity> arrayList, CharSequence charSequence, Spannable spannable, int i9) {
        for (wz0 wz0Var : (wz0[]) spannable.getSpans(0, spannable.length(), wz0.class)) {
            spannable.removeSpan(wz0Var);
        }
        ArrayList<vz0> textStyleRuns = getTextStyleRuns(arrayList, charSequence, i9);
        for (int i10 = 0; i10 < Math.min(MAX_STYLE_RUNS_COUNT, textStyleRuns.size()); i10++) {
            vz0 vz0Var = textStyleRuns.get(i10);
            addStyleToText(new wz0(vz0Var, 0), vz0Var.b, vz0Var.c, spannable, true);
        }
    }

    public TLRPC.TL_messages_stickerSet getStickerSet(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        return getStickerSet(inputStickerSet, null, z10, null);
    }

    public TLRPC.TL_messages_stickerSet getStickerSet(TLRPC.InputStickerSet inputStickerSet, Integer num, boolean z10) {
        return getStickerSet(inputStickerSet, num, z10, null);
    }

    public void preloadStickerSetThumb(TLRPC.StickerSetCovered stickerSetCovered) {
        TLRPC.StickerSet stickerSet;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        if (stickerSetCovered == null || (stickerSet = stickerSetCovered.set) == null || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSet.thumbs, 90)) == null) {
            return;
        }
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null) {
            if (stickerSetCovered.covers.isEmpty()) {
                return;
            } else {
                document = stickerSetCovered.covers.get(0);
            }
        }
        loadStickerSetThumbInternal(closestPhotoSizeWithSize, stickerSetCovered, document, stickerSetCovered.set.thumb_version);
    }

    public static boolean entitiesEqual(ArrayList<TLRPC.MessageEntity> arrayList, ArrayList<TLRPC.MessageEntity> arrayList2) {
        if (arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (!entitiesEqual(arrayList.get(i9), arrayList2.get(i9))) {
                return false;
            }
        }
        return true;
    }

    public TLRPC.TL_messages_stickerSet getStickerSet(TLRPC.InputStickerSet inputStickerSet, Integer num, boolean z10, Utilities.Callback<TLRPC.TL_messages_stickerSet> callback) {
        return getStickerSet(inputStickerSet, num, z10, false, callback);
    }

    public TLRPC.TL_messages_stickerSet getStickerSet(final TLRPC.InputStickerSet inputStickerSet, final Integer num, final boolean z10, boolean z11, final Utilities.Callback<TLRPC.TL_messages_stickerSet> callback) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        if (inputStickerSet != null) {
            boolean z12 = inputStickerSet instanceof TLRPC.TL_inputStickerSetID;
            if (z12 && this.stickerSetsById.d(inputStickerSet.id)) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.stickerSetsById.f(inputStickerSet.id);
            } else if ((inputStickerSet instanceof TLRPC.TL_inputStickerSetShortName) && (str = inputStickerSet.short_name) != null && this.stickerSetsByName.containsKey(str.toLowerCase())) {
                tL_messages_stickerSet = this.stickerSetsByName.get(inputStickerSet.short_name.toLowerCase());
            } else if ((!(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses) || (tL_messages_stickerSet = this.stickerSetDefaultStatuses) == null) && (!(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses) || (tL_messages_stickerSet = this.stickerSetDefaultChannelStatuses) == null)) {
                tL_messages_stickerSet = null;
            }
            if (tL_messages_stickerSet != null) {
                if (!z11 && callback != null) {
                    callback.run(tL_messages_stickerSet);
                }
                return tL_messages_stickerSet;
            }
            final String inputSetKey = inputSetKey(inputStickerSet);
            if (callback != null || !this.loadingStickerSetsKeys.contains(inputSetKey)) {
                this.loadingStickerSetsKeys.add(inputSetKey);
                if (z12) {
                    final int i9 = 0;
                    getMessagesStorage().getStorageQueue().postRunnable(new Runnable(this) { // from class: org.telegram.messenger.w8
                        public final /* synthetic */ MediaDataController b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i9) {
                                case 0:
                                    this.b.lambda$getStickerSet$34(inputStickerSet, num, inputSetKey, callback, z10);
                                    break;
                                default:
                                    this.b.lambda$getStickerSet$37(inputStickerSet, num, inputSetKey, callback, z10);
                                    break;
                            }
                        }
                    });
                    return null;
                }
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetShortName) {
                    final int i10 = 1;
                    getMessagesStorage().getStorageQueue().postRunnable(new Runnable(this) { // from class: org.telegram.messenger.w8
                        public final /* synthetic */ MediaDataController b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    this.b.lambda$getStickerSet$34(inputStickerSet, num, inputSetKey, callback, z10);
                                    break;
                                default:
                                    this.b.lambda$getStickerSet$37(inputStickerSet, num, inputSetKey, callback, z10);
                                    break;
                            }
                        }
                    });
                    return null;
                }
                if (!z10) {
                    fetchStickerSetInternal(inputStickerSet, new y3(this, inputSetKey, callback, inputStickerSet, 2));
                    return null;
                }
                this.loadingStickerSetsKeys.remove(inputSetKey);
                return null;
            }
        }
        return null;
    }

    public ArrayList<MessageObject> loadPinnedMessages(long j10, long j11, ArrayList<Integer> arrayList, boolean z10) {
        if (z10) {
            getMessagesStorage().getStorageQueue().postRunnable(new e5.y(this, j10, j11, arrayList, 5));
            return null;
        }
        return loadPinnedMessageInternal(j10, j11, arrayList, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private TLRPC.TL_messages_stickerSet getCachedStickerSetInternal(String str, Integer num) {
        SQLiteCursor sQLiteCursor;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        NativeByteBuffer nativeByteBuffer = null;
        try {
            try {
                sQLiteCursor = getMessagesStorage().getDatabase().queryFinalized("SELECT data, hash FROM stickersets2 WHERE short_name = ? LIMIT 1", str);
                try {
                    if (!sQLiteCursor.next() || sQLiteCursor.isNull(0)) {
                        tL_messages_stickerSet = null;
                    } else {
                        NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            try {
                                tL_messages_stickerSet = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                try {
                                    int intValue = sQLiteCursor.intValue(1);
                                    if (num != null && num.intValue() != 0) {
                                        if (num.intValue() != intValue) {
                                            byteBufferValue.reuse();
                                            sQLiteCursor.dispose();
                                            return null;
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    nativeByteBuffer = byteBufferValue;
                                    try {
                                        FileLog.e(th);
                                        return tL_messages_stickerSet;
                                    } finally {
                                        if (nativeByteBuffer != null) {
                                            nativeByteBuffer.reuse();
                                        }
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                tL_messages_stickerSet = null;
                            }
                        } else {
                            tL_messages_stickerSet = null;
                        }
                        nativeByteBuffer = byteBufferValue;
                    }
                    if (nativeByteBuffer != null) {
                        nativeByteBuffer.reuse();
                    }
                    sQLiteCursor.dispose();
                    return tL_messages_stickerSet;
                } catch (Throwable th3) {
                    th = th3;
                    tL_messages_stickerSet = null;
                }
            } catch (Throwable th4) {
                th = th4;
                sQLiteCursor = null;
                tL_messages_stickerSet = null;
                FileLog.e(th);
                return tL_messages_stickerSet;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$markFeaturedStickersAsRead$65(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$markFeaturedStickersByIdAsRead$66(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$removeInline$152(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$removePeer$154(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$removeWebapp$153(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$saveDraft$188(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public void saveDraft(final long j10, final long j11, TLRPC.DraftMessage draftMessage, TLRPC.Message message, boolean z10) {
        TLRPC.Message message2;
        String str;
        TLRPC.InputReplyTo inputReplyTo;
        TLRPC.Chat chat;
        StringBuilder sb2;
        if (getMessagesController().isForum(j10) && j11 == 0 && TextUtils.isEmpty(draftMessage.message)) {
            TLRPC.InputReplyTo inputReplyTo2 = draftMessage.reply_to;
            if (inputReplyTo2 instanceof TLRPC.TL_inputReplyToMessage) {
                ((TLRPC.TL_inputReplyToMessage) inputReplyTo2).reply_to_msg_id = 0;
            }
        }
        SharedPreferences.Editor edit = this.draftPreferences.edit();
        MessagesController messagesController = getMessagesController();
        if (draftMessage != null && !(draftMessage instanceof TLRPC.TL_draftMessageEmpty)) {
            a0.h hVar = (a0.h) this.drafts.f(j10);
            if (hVar == null) {
                hVar = new a0.h();
                this.drafts.k(hVar, j10);
            }
            hVar.k(draftMessage, j11);
            if (j11 == 0) {
                messagesController.putDraftDialogIfNeed(j10, draftMessage);
            }
            try {
                SerializedData serializedData = new SerializedData(draftMessage.getObjectSize());
                draftMessage.serializeToStream(serializedData);
                if (j11 != 0) {
                    sb2 = new StringBuilder("t_");
                    sb2.append(j10);
                    sb2.append("_");
                    sb2.append(j11);
                } else {
                    sb2 = new StringBuilder("");
                    sb2.append(j10);
                }
                edit.putString(sb2.toString(), Utilities.bytesToHex(serializedData.toByteArray()));
                serializedData.cleanup();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        } else {
            a0.h hVar2 = (a0.h) this.drafts.f(j10);
            if (hVar2 != null) {
                hVar2.l(j11);
                if (hVar2.m() == 0) {
                    this.drafts.l(j10);
                }
            }
            a0.h hVar3 = (a0.h) this.draftMessages.f(j10);
            if (hVar3 != null) {
                hVar3.l(j11);
                if (hVar3.m() == 0) {
                    this.draftMessages.l(j10);
                }
            }
            if (j11 == 0) {
                this.draftPreferences.edit().remove("" + j10).remove("r_" + j10).commit();
            } else {
                SharedPreferences.Editor edit2 = this.draftPreferences.edit();
                StringBuilder s10 = aa.d.s(j10, "t_", "_");
                s10.append(j11);
                SharedPreferences.Editor remove = edit2.remove(s10.toString());
                StringBuilder s11 = aa.d.s(j10, "rt_", "_");
                s11.append(j11);
                remove.remove(s11.toString()).commit();
            }
            messagesController.removeDraftDialogIfNeed(j10);
        }
        a0.h hVar4 = (a0.h) this.draftMessages.f(j10);
        TLRPC.User user = null;
        if (message != null || draftMessage == null || draftMessage.reply_to == null) {
            if (draftMessage != null && draftMessage.reply_to == null) {
                message2 = null;
            }
            message2 = message;
        } else {
            if (hVar4 != null) {
                message2 = (TLRPC.Message) hVar4.f(j11);
            }
            message2 = message;
        }
        if (message2 == null) {
            if (hVar4 != null) {
                hVar4.l(j11);
                if (hVar4.m() == 0) {
                    this.draftMessages.l(j10);
                }
            }
            if (j11 == 0) {
                edit.remove("r_" + j10);
            } else {
                StringBuilder s12 = aa.d.s(j10, "rt_", "_");
                s12.append(j11);
                edit.remove(s12.toString());
            }
        } else {
            if (hVar4 == null) {
                hVar4 = new a0.h();
                this.draftMessages.k(hVar4, j10);
            }
            hVar4.k(message2, j11);
            try {
                SerializedData serializedData2 = new SerializedData(message2.getObjectSize());
                message2.serializeToStream(serializedData2);
                if (j11 != 0) {
                    str = "rt_" + j10 + "_" + j11;
                } else {
                    str = "r_" + j10;
                }
                edit.putString(str, Utilities.bytesToHex(serializedData2.toByteArray()));
                serializedData2.cleanup();
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        edit.commit();
        if (z10) {
            if (j11 == 0 || getMessagesController().isForum(j10)) {
                if (draftMessage != null && (inputReplyTo = draftMessage.reply_to) != null && inputReplyTo.reply_to_msg_id != 0 && (message2 == null || ((message2.reply_to instanceof TLRPC.TL_messageReplyHeader) && message2.replyMessage == null))) {
                    long peerDialogId = (inputReplyTo.flags & 2) != 0 ? DialogObject.getPeerDialogId(inputReplyTo.reply_to_peer_id) : j10;
                    if (DialogObject.isUserDialog(peerDialogId)) {
                        user = getMessagesController().getUser(Long.valueOf(peerDialogId));
                        chat = null;
                    } else {
                        chat = getMessagesController().getChat(Long.valueOf(-peerDialogId));
                    }
                    if (user != null || chat != null) {
                        long j12 = ChatObject.isChannel(chat) ? chat.id : 0L;
                        final int i9 = draftMessage.reply_to.reply_to_msg_id;
                        final long j13 = peerDialogId;
                        final long j14 = j12;
                        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.messenger.n9
                            @Override // java.lang.Runnable
                            public final void run() {
                                MediaDataController.this.lambda$saveDraft$191(i9, j13, j14, j10, j11);
                            }
                        });
                    }
                }
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newDraftReceived, Long.valueOf(j10));
            }
        }
    }
}
