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
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
    private a0.i botDialogKeyboards;
    private HashMap<String, TL_bots.BotInfo> botInfos;
    private HashMap<MessagesStorage.TopicKey, TLRPC.Message> botKeyboards;
    private a0.i botKeyboardsByMids;
    private boolean cleanedupStickerSetCache;
    private HashMap<String, Boolean> currentFetchingEmoji;
    public final ArrayList<kp> defaultEmojiThemes;
    private ArrayList<MessageObject> deletedFromResultMessages;
    private a0.i diceEmojiStickerSetsById;
    private HashMap<String, TLRPC.TL_messages_stickerSet> diceStickerSetsByEmoji;
    private String doubleTapReaction;
    private a0.i draftMessages;
    private SharedPreferences draftPreferences;
    public a0.i draftVoices;
    private boolean draftVoicesLoaded;
    private a0.i drafts;
    private a0.i draftsFolderIds;
    private ArrayList<TLRPC.EmojiStatus>[] emojiStatuses;
    private Long[] emojiStatusesFetchDate;
    private boolean[] emojiStatusesFetching;
    private boolean[] emojiStatusesFromCacheFetched;
    private long[] emojiStatusesHash;
    private List<TLRPC.TL_availableReaction> enabledReactionsList;
    private ArrayList<TLRPC.StickerSetCovered>[] featuredStickerSets;
    private a0.i[] featuredStickerSetsById;
    private boolean[] featuredStickersLoaded;
    private HashSet<String> fetchedEmoji;
    private TLRPC.Document greetingsSticker;
    public TLRPC.TL_emojiList groupAvatarConstructorDefault;
    private a0.i groupStickerSets;
    public ArrayList<TLRPC.TL_topPeer> guestBots;
    public ArrayList<TLRPC.TL_topPeer> hints;
    private boolean inTransaction;
    public ArrayList<TLRPC.TL_topPeer> inlineBots;
    private ArrayList<Long> installedForceStickerSetsById;
    private a0.i installedStickerSetsById;
    private boolean isLoadingMenuBots;
    private boolean isLoadingPremiumPromo;
    private boolean isLoadingReactions;
    private long lastDialogId;
    private int lastGuid;
    private long lastMergeDialogId;
    private ah.j1 lastReaction;
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
    private a0.i loadingPinnedMessages;
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
    private a0.i removingStickerSetsUndos;
    public TLRPC.TL_emojiList replyIconsDefault;
    private int reqId;
    public TLRPC.TL_emojiList restrictedStatusEmojis;
    public final uf.c ringtoneDataStore;
    public HashMap<String, uf.d> ringtoneUploaderHashMap;
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
    private a0.i stickerSetsById;
    private ConcurrentHashMap<String, TLRPC.TL_messages_stickerSet> stickerSetsByName;
    private a0.i stickersByEmoji;
    private a0.i[] stickersByIds;
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

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    public class 1 implements Runnable {
        final /* synthetic */ int val$classGuid;
        final /* synthetic */ int val$count;
        final /* synthetic */ int val$fromCache;
        final /* synthetic */ boolean val$isChannel;
        final /* synthetic */ int val$max_id;
        final /* synthetic */ int val$min_id;
        final /* synthetic */ int val$requestIndex;
        final /* synthetic */ ah.j1 val$tag;
        final /* synthetic */ long val$topicId;
        final /* synthetic */ int val$type;
        final /* synthetic */ long val$uid;

        public 1(int i10, long j3, int i11, long j10, int i12, ah.j1 j1Var, int i13, int i14, int i15, boolean z10, int i16) {
            this.val$count = i10;
            this.val$uid = j3;
            this.val$min_id = i11;
            this.val$topicId = j10;
            this.val$type = i12;
            this.val$tag = j1Var;
            this.val$max_id = i13;
            this.val$classGuid = i14;
            this.val$fromCache = i15;
            this.val$isChannel = z10;
            this.val$requestIndex = i16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0(Runnable runnable, int i10) {
            MediaDataController.this.getMessagesStorage().completeTaskForGuid(runnable, i10);
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
            q4 q4Var;
            long j3;
            ArrayList arrayList;
            SQLiteDatabase sQLiteDatabase;
            SQLiteCursor queryFinalized;
            boolean z10;
            boolean z11;
            TLRPC.TL_messages_messages tL_messages_messages;
            ArrayList<Long> arrayList2;
            long j10;
            ArrayList arrayList3;
            String str;
            String str2;
            int i10;
            boolean z12;
            String str3;
            ?? r42;
            String str4;
            String str5;
            String str6;
            int i11;
            int i12;
            SQLiteCursor queryFinalized2;
            boolean z13;
            String str7;
            String str8;
            String str9;
            int i13;
            SQLiteCursor queryFinalized3;
            int i14;
            String str10;
            String str11;
            String str12;
            int i15;
            SQLiteCursor queryFinalized4;
            int i16;
            SQLiteDatabase sQLiteDatabase2;
            1 r43;
            int i17;
            SQLiteCursor queryFinalized5;
            int i18;
            int intValue;
            int i19;
            1 r12 = this;
            long clientUserId = MediaDataController.this.getUserConfig().getClientUserId();
            TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
            boolean z14 = false;
            try {
                try {
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    ArrayList arrayList5 = new ArrayList();
                    int i20 = r12.val$count + 1;
                    SQLiteDatabase database = MediaDataController.this.getMessagesStorage().getDatabase();
                    TLRPC.TL_messages_messages tL_messages_messages3 = tL_messages_messages2;
                    try {
                        ArrayList<Long> arrayList6 = arrayList4;
                        if (DialogObject.isEncryptedDialog(r12.val$uid)) {
                            j3 = clientUserId;
                            arrayList = arrayList5;
                            sQLiteDatabase = database;
                            long j11 = r12.val$topicId;
                            if (j11 != 0) {
                                int i21 = r12.val$max_id;
                                if (i21 != 0) {
                                    Locale locale = Locale.US;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + r12.val$uid + " AND m.topic_id = " + j11 + " AND m.mid > " + i21 + " AND type = " + r12.val$type + " ORDER BY m.mid ASC LIMIT " + i20, new Object[0]);
                                } else {
                                    int i22 = r12.val$min_id;
                                    if (i22 != 0) {
                                        Locale locale2 = Locale.US;
                                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + r12.val$uid + " AND m.topic_id = " + j11 + " AND m.mid < " + i22 + " AND type = " + r12.val$type + " ORDER BY m.mid DESC LIMIT " + i20, new Object[0]);
                                    } else {
                                        Locale locale3 = Locale.US;
                                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + r12.val$uid + " AND m.topic_id = " + j11 + " AND type = " + r12.val$type + " ORDER BY m.mid ASC LIMIT " + i20, new Object[0]);
                                    }
                                }
                            } else {
                                int i23 = r12.val$max_id;
                                if (i23 != 0) {
                                    Locale locale4 = Locale.US;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + r12.val$uid + " AND m.mid > " + i23 + " AND type = " + r12.val$type + " ORDER BY m.mid ASC LIMIT " + i20, new Object[0]);
                                } else {
                                    int i24 = r12.val$min_id;
                                    if (i24 != 0) {
                                        Locale locale5 = Locale.US;
                                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + r12.val$uid + " AND m.mid < " + i24 + " AND type = " + r12.val$type + " ORDER BY m.mid DESC LIMIT " + i20, new Object[0]);
                                    } else {
                                        Locale locale6 = Locale.US;
                                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + r12.val$uid + " AND type = " + r12.val$type + " ORDER BY m.mid ASC LIMIT " + i20, new Object[0]);
                                    }
                                }
                            }
                            z10 = false;
                            z11 = true;
                        } else {
                            if (r12.val$min_id == 0) {
                                j3 = clientUserId;
                                long j12 = r12.val$topicId;
                                arrayList = arrayList5;
                                if (j12 != 0) {
                                    Locale locale7 = Locale.US;
                                    str = "SELECT max(end) FROM media_holes_topics WHERE uid = ";
                                    str2 = "t.tag = ";
                                    i10 = i20;
                                    queryFinalized5 = database.queryFinalized("SELECT start FROM media_holes_topics WHERE uid = " + r12.val$uid + " AND topic_id = " + j12 + " AND type = " + r12.val$type + " AND start IN (0, 1)", new Object[0]);
                                    i17 = 0;
                                } else {
                                    str = "SELECT max(end) FROM media_holes_topics WHERE uid = ";
                                    str2 = "t.tag = ";
                                    i10 = i20;
                                    Locale locale8 = Locale.US;
                                    i17 = 0;
                                    queryFinalized5 = database.queryFinalized("SELECT start FROM media_holes_v2 WHERE uid = " + r12.val$uid + " AND type = " + r12.val$type + " AND start IN (0, 1)", new Object[0]);
                                }
                                if (!queryFinalized5.next()) {
                                    queryFinalized5.dispose();
                                    long j13 = r12.val$topicId;
                                    if (j13 != 0) {
                                        Locale locale9 = Locale.US;
                                        queryFinalized5 = database.queryFinalized("SELECT min(mid) FROM media_topics WHERE uid = " + r12.val$uid + " AND topic_id = " + j13 + " AND type = " + r12.val$type + " AND mid > 0", new Object[0]);
                                        i18 = 0;
                                    } else {
                                        Locale locale10 = Locale.US;
                                        i18 = 0;
                                        queryFinalized5 = database.queryFinalized("SELECT min(mid) FROM media_v4 WHERE uid = " + r12.val$uid + " AND type = " + r12.val$type + " AND mid > 0", new Object[0]);
                                    }
                                    if (queryFinalized5.next() && (intValue = queryFinalized5.intValue(i18)) != 0) {
                                        SQLitePreparedStatement executeFast = r12.val$topicId != 0 ? database.executeFast("REPLACE INTO media_holes_topics VALUES(?, ?, ?, ?, ?)") : database.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                                        executeFast.requery();
                                        executeFast.bindLong(1, r12.val$uid);
                                        long j14 = r12.val$topicId;
                                        if (j14 != 0) {
                                            executeFast.bindLong(2, j14);
                                            i19 = 3;
                                        } else {
                                            i19 = 2;
                                        }
                                        executeFast.bindInteger(i19, r12.val$type);
                                        executeFast.bindInteger(i19 + 1, 0);
                                        executeFast.bindInteger(i19 + 2, intValue);
                                        executeFast.step();
                                        executeFast.dispose();
                                    }
                                } else if (queryFinalized5.intValue(i17) == 1) {
                                    z12 = true;
                                    queryFinalized5.dispose();
                                }
                                z12 = false;
                                queryFinalized5.dispose();
                            } else {
                                str = "SELECT max(end) FROM media_holes_topics WHERE uid = ";
                                str2 = "t.tag = ";
                                j3 = clientUserId;
                                arrayList = arrayList5;
                                i10 = i20;
                                z12 = false;
                            }
                            ah.j1 j1Var = r12.val$tag;
                            if (j1Var != null) {
                                long hashCode = !TextUtils.isEmpty(j1Var.f) ? r12.val$tag.f.hashCode() : r12.val$tag.g;
                                str3 = "INNER JOIN tag_message_id t ON m.mid = t.mid";
                                r42 = str2 + hashCode + " AND";
                            } else {
                                str3 = "";
                                r42 = "";
                            }
                            int i25 = r12.val$max_id;
                            z11 = z12;
                            try {
                                try {
                                    if (i25 != 0) {
                                        try {
                                            long j15 = r12.val$topicId;
                                            if (j15 != 0) {
                                                Locale locale11 = Locale.US;
                                                str12 = " WHERE ";
                                                str11 = " AND m.topic_id = ";
                                                str10 = r42;
                                                queryFinalized4 = database.queryFinalized("SELECT start, end FROM media_holes_topics WHERE uid = " + r12.val$uid + " AND topic_id = " + j15 + " AND type = " + r12.val$type + " AND start <= " + i25 + " ORDER BY end DESC LIMIT 1", new Object[0]);
                                                i15 = 0;
                                            } else {
                                                str10 = r42;
                                                str11 = " AND m.topic_id = ";
                                                str12 = " WHERE ";
                                                Locale locale12 = Locale.US;
                                                try {
                                                    i15 = 0;
                                                    queryFinalized4 = database.queryFinalized("SELECT start, end FROM media_holes_v2 WHERE uid = " + r12.val$uid + " AND type = " + r12.val$type + " AND start <= " + i25 + " ORDER BY end DESC LIMIT 1", new Object[0]);
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    r42 = r12;
                                                    r12 = r42;
                                                    tL_messages_messages2 = tL_messages_messages3;
                                                    tL_messages_messages2.messages.clear();
                                                    tL_messages_messages2.chats.clear();
                                                    tL_messages_messages2.users.clear();
                                                    FileLog.e(e);
                                                    q4Var = new q4(r12, r12, r12.val$classGuid, 1);
                                                    AndroidUtilities.runOnUIThread(q4Var);
                                                    MediaDataController.this.processLoadedMedia(tL_messages_messages2, r12.val$uid, r12.val$count, r12.val$max_id, r12.val$min_id, r12.val$type, r12.val$topicId, r12.val$fromCache, r12.val$classGuid, r12.val$isChannel, z14, r12.val$requestIndex);
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    r42 = r12;
                                                    r12 = r42;
                                                    tL_messages_messages2 = tL_messages_messages3;
                                                    AndroidUtilities.runOnUIThread(new q4(r12, r12, r12.val$classGuid, 1));
                                                    MediaDataController.this.processLoadedMedia(tL_messages_messages2, r12.val$uid, r12.val$count, r12.val$max_id, r12.val$min_id, r12.val$type, r12.val$topicId, r12.val$fromCache, r12.val$classGuid, r12.val$isChannel, false, r12.val$requestIndex);
                                                    throw th;
                                                }
                                            }
                                            if (queryFinalized4.next()) {
                                                queryFinalized4.intValue(i15);
                                                i16 = queryFinalized4.intValue(1);
                                            } else {
                                                i16 = 0;
                                            }
                                            queryFinalized4.dispose();
                                            long j16 = r12.val$topicId;
                                            if (j16 == 0) {
                                                sQLiteDatabase2 = database;
                                                int i26 = i10;
                                                String str13 = str12;
                                                String str14 = str10;
                                                if (i16 > 1) {
                                                    Locale locale13 = Locale.US;
                                                    queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + str13 + str14 + " m.uid = " + this.val$uid + " AND m.mid > 0 AND m.mid < " + this.val$max_id + " AND m.mid >= " + i16 + " AND m.type = " + this.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i26, new Object[0]);
                                                    z11 = false;
                                                    r43 = this;
                                                    r12 = r43;
                                                    sQLiteDatabase = sQLiteDatabase2;
                                                } else {
                                                    try {
                                                        Locale locale14 = Locale.US;
                                                        r43 = this;
                                                        sQLiteDatabase2 = sQLiteDatabase2;
                                                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + str13 + str14 + " m.uid = " + r43.val$uid + " AND m.mid > 0 AND m.mid < " + r43.val$max_id + " AND m.type = " + r43.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i26, new Object[0]);
                                                        r12 = r43;
                                                        sQLiteDatabase = sQLiteDatabase2;
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        r42 = this;
                                                        r12 = r42;
                                                        tL_messages_messages2 = tL_messages_messages3;
                                                        tL_messages_messages2.messages.clear();
                                                        tL_messages_messages2.chats.clear();
                                                        tL_messages_messages2.users.clear();
                                                        FileLog.e(e);
                                                        q4Var = new q4(r12, r12, r12.val$classGuid, 1);
                                                        AndroidUtilities.runOnUIThread(q4Var);
                                                        MediaDataController.this.processLoadedMedia(tL_messages_messages2, r12.val$uid, r12.val$count, r12.val$max_id, r12.val$min_id, r12.val$type, r12.val$topicId, r12.val$fromCache, r12.val$classGuid, r12.val$isChannel, z14, r12.val$requestIndex);
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        r42 = this;
                                                        r12 = r42;
                                                        tL_messages_messages2 = tL_messages_messages3;
                                                        AndroidUtilities.runOnUIThread(new q4(r12, r12, r12.val$classGuid, 1));
                                                        MediaDataController.this.processLoadedMedia(tL_messages_messages2, r12.val$uid, r12.val$count, r12.val$max_id, r12.val$min_id, r12.val$type, r12.val$topicId, r12.val$fromCache, r12.val$classGuid, r12.val$isChannel, false, r12.val$requestIndex);
                                                        throw th;
                                                    }
                                                }
                                            } else if (i16 > 1) {
                                                Locale locale15 = Locale.US;
                                                queryFinalized = database.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + str12 + str10 + " m.uid = " + r12.val$uid + str11 + j16 + " AND m.mid > 0 AND m.mid < " + r12.val$max_id + " AND m.mid >= " + i16 + " AND m.type = " + r12.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i10, new Object[0]);
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
                                                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + str15 + str17 + " m.uid = " + r12.val$uid + str16 + j16 + " AND m.mid > 0 AND m.mid < " + r12.val$max_id + " AND m.type = " + r12.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i10, new Object[0]);
                                                r43 = this;
                                                r12 = r43;
                                                sQLiteDatabase = sQLiteDatabase2;
                                            }
                                            z10 = z13;
                                        } catch (Exception e11) {
                                            e = e11;
                                            tL_messages_messages2 = tL_messages_messages3;
                                            tL_messages_messages2.messages.clear();
                                            tL_messages_messages2.chats.clear();
                                            tL_messages_messages2.users.clear();
                                            FileLog.e(e);
                                            q4Var = new q4(r12, r12, r12.val$classGuid, 1);
                                            AndroidUtilities.runOnUIThread(q4Var);
                                            MediaDataController.this.processLoadedMedia(tL_messages_messages2, r12.val$uid, r12.val$count, r12.val$max_id, r12.val$min_id, r12.val$type, r12.val$topicId, r12.val$fromCache, r12.val$classGuid, r12.val$isChannel, z14, r12.val$requestIndex);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            tL_messages_messages2 = tL_messages_messages3;
                                            AndroidUtilities.runOnUIThread(new q4(r12, r12, r12.val$classGuid, 1));
                                            MediaDataController.this.processLoadedMedia(tL_messages_messages2, r12.val$uid, r12.val$count, r12.val$max_id, r12.val$min_id, r12.val$type, r12.val$topicId, r12.val$fromCache, r12.val$classGuid, r12.val$isChannel, false, r12.val$requestIndex);
                                            throw th;
                                        }
                                    } else {
                                        SQLiteDatabase sQLiteDatabase3 = database;
                                        String str18 = r42;
                                        int i27 = i10;
                                        r42 = r12;
                                        int i28 = r42.val$min_id;
                                        if (i28 != 0) {
                                            long j17 = r42.val$topicId;
                                            if (j17 != 0) {
                                                Locale locale17 = Locale.US;
                                                str9 = str18;
                                                str7 = " m.uid = ";
                                                str8 = " WHERE ";
                                                queryFinalized3 = sQLiteDatabase3.queryFinalized("SELECT start, end FROM media_holes_topics WHERE uid = " + r42.val$uid + " AND topic_id = " + j17 + " AND type = " + r42.val$type + " AND end >= " + i28 + " ORDER BY end ASC LIMIT 1", new Object[0]);
                                                i13 = 0;
                                            } else {
                                                str7 = " m.uid = ";
                                                str8 = " WHERE ";
                                                str9 = str18;
                                                Locale locale18 = Locale.US;
                                                try {
                                                    i13 = 0;
                                                    queryFinalized3 = sQLiteDatabase3.queryFinalized("SELECT start, end FROM media_holes_v2 WHERE uid = " + r42.val$uid + " AND type = " + r42.val$type + " AND end >= " + i28 + " ORDER BY end ASC LIMIT 1", new Object[0]);
                                                } catch (Exception e12) {
                                                    e = e12;
                                                    r12 = r42;
                                                    tL_messages_messages2 = tL_messages_messages3;
                                                    tL_messages_messages2.messages.clear();
                                                    tL_messages_messages2.chats.clear();
                                                    tL_messages_messages2.users.clear();
                                                    FileLog.e(e);
                                                    q4Var = new q4(r12, r12, r12.val$classGuid, 1);
                                                    AndroidUtilities.runOnUIThread(q4Var);
                                                    MediaDataController.this.processLoadedMedia(tL_messages_messages2, r12.val$uid, r12.val$count, r12.val$max_id, r12.val$min_id, r12.val$type, r12.val$topicId, r12.val$fromCache, r12.val$classGuid, r12.val$isChannel, z14, r12.val$requestIndex);
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    r12 = r42;
                                                    tL_messages_messages2 = tL_messages_messages3;
                                                    AndroidUtilities.runOnUIThread(new q4(r12, r12, r12.val$classGuid, 1));
                                                    MediaDataController.this.processLoadedMedia(tL_messages_messages2, r12.val$uid, r12.val$count, r12.val$max_id, r12.val$min_id, r12.val$type, r12.val$topicId, r12.val$fromCache, r12.val$classGuid, r12.val$isChannel, false, r12.val$requestIndex);
                                                    throw th;
                                                }
                                            }
                                            if (queryFinalized3.next()) {
                                                i14 = queryFinalized3.intValue(i13);
                                                queryFinalized3.intValue(1);
                                            } else {
                                                i14 = 0;
                                            }
                                            queryFinalized3.dispose();
                                            long j18 = r42.val$topicId;
                                            if (j18 != 0) {
                                                if (i14 > 1) {
                                                    Locale locale19 = Locale.US;
                                                    queryFinalized = sQLiteDatabase3.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + str8 + str9 + str7 + r42.val$uid + " AND m.topic_id = " + j18 + " AND m.mid > 0 AND m.mid >= " + r42.val$min_id + " AND m.mid <= " + i14 + " AND m.type = " + r42.val$type + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i27, new Object[0]);
                                                    r12 = r42;
                                                } else {
                                                    String str19 = str7;
                                                    String str20 = str8;
                                                    String str21 = str9;
                                                    Locale locale20 = Locale.US;
                                                    sQLiteDatabase3 = sQLiteDatabase3;
                                                    queryFinalized = sQLiteDatabase3.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + str20 + str21 + str19 + r42.val$uid + " AND m.topic_id = " + j18 + " AND m.mid > 0 AND m.mid >= " + r42.val$min_id + " AND m.type = " + r42.val$type + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i27, new Object[0]);
                                                    z11 = true;
                                                    r12 = this;
                                                }
                                                sQLiteDatabase = sQLiteDatabase3;
                                            } else {
                                                String str22 = str7;
                                                String str23 = str8;
                                                String str24 = str9;
                                                if (i14 > 1) {
                                                    Locale locale21 = Locale.US;
                                                    sQLiteDatabase = sQLiteDatabase3;
                                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + str23 + str24 + str22 + this.val$uid + " AND m.mid > 0 AND m.mid >= " + this.val$min_id + " AND m.mid <= " + i14 + " AND m.type = " + this.val$type + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i27, new Object[0]);
                                                    r12 = this;
                                                } else {
                                                    sQLiteDatabase = sQLiteDatabase3;
                                                    Locale locale22 = Locale.US;
                                                    r12 = this;
                                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + str23 + str24 + str22 + r12.val$uid + " AND m.mid > 0 AND m.mid >= " + r12.val$min_id + " AND m.type = " + r12.val$type + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i27, new Object[0]);
                                                    z11 = true;
                                                }
                                            }
                                            z13 = true;
                                        } else {
                                            r12 = r42;
                                            sQLiteDatabase = sQLiteDatabase3;
                                            long j19 = r12.val$topicId;
                                            if (j19 != 0) {
                                                Locale locale23 = Locale.US;
                                                str4 = " m.uid = ";
                                                str5 = "SELECT m.data, m.mid FROM media_v4 m ";
                                                i11 = i27;
                                                str6 = " AND m.type = ";
                                                queryFinalized2 = sQLiteDatabase.queryFinalized(str + r12.val$uid + " AND topic_id = " + j19 + " AND type = " + r12.val$type, new Object[0]);
                                                i12 = 0;
                                            } else {
                                                str4 = " m.uid = ";
                                                str5 = "SELECT m.data, m.mid FROM media_v4 m ";
                                                str6 = " AND m.type = ";
                                                i11 = i27;
                                                Locale locale24 = Locale.US;
                                                i12 = 0;
                                                queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT max(end) FROM media_holes_v2 WHERE uid = " + r12.val$uid + " AND type = " + r12.val$type, new Object[0]);
                                            }
                                            int intValue2 = queryFinalized2.next() ? queryFinalized2.intValue(i12) : 0;
                                            queryFinalized2.dispose();
                                            long j20 = r12.val$topicId;
                                            if (j20 == 0) {
                                                int i29 = i11;
                                                String str25 = str6;
                                                String str26 = str4;
                                                if (intValue2 > 1) {
                                                    Locale locale25 = Locale.US;
                                                    r12 = this;
                                                    queryFinalized = sQLiteDatabase.queryFinalized(str5 + str3 + " WHERE " + str18 + str26 + r12.val$uid + " AND m.mid >= " + intValue2 + str25 + r12.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i29, new Object[0]);
                                                } else {
                                                    r12 = this;
                                                    Locale locale26 = Locale.US;
                                                    queryFinalized = sQLiteDatabase.queryFinalized(str5 + str3 + " WHERE " + str18 + str26 + r12.val$uid + " AND m.mid > 0 AND m.type = " + r12.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i29, new Object[0]);
                                                }
                                            } else if (intValue2 > 1) {
                                                Locale locale27 = Locale.US;
                                                queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str18 + str4 + r12.val$uid + " AND m.topic_id = " + j20 + " AND m.mid >= " + intValue2 + str6 + r12.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i11, new Object[0]);
                                            } else {
                                                int i30 = i11;
                                                String str27 = str4;
                                                Locale locale28 = Locale.US;
                                                queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str18 + str27 + r12.val$uid + " AND m.topic_id = " + j20 + " AND m.mid > 0 AND m.type = " + r12.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i30, new Object[0]);
                                                z13 = false;
                                                r12 = this;
                                            }
                                        }
                                        z10 = z13;
                                    }
                                    z13 = false;
                                    z10 = z13;
                                } catch (Exception e13) {
                                    e = e13;
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                            } catch (Exception e14) {
                                e = e14;
                                r12 = this;
                            } catch (Throwable th7) {
                                th = th7;
                                r12 = this;
                            }
                        }
                        Object obj = null;
                        HashSet hashSet = r12.val$tag != null ? new HashSet() : null;
                        while (queryFinalized.next()) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                j10 = j3;
                                TLdeserialize.readAttachPath(byteBufferValue, j10);
                                byteBufferValue.reuse();
                                TLdeserialize.id = queryFinalized.intValue(1);
                                long j21 = r12.val$uid;
                                TLdeserialize.dialog_id = j21;
                                if (DialogObject.isEncryptedDialog(j21)) {
                                    TLdeserialize.random_id = queryFinalized.longValue(2);
                                }
                                long j22 = TLdeserialize.grouped_id;
                                if (j22 != 0 && hashSet != null) {
                                    hashSet.add(Long.valueOf(j22));
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
                                j10 = j3;
                                arrayList3 = arrayList;
                            }
                            arrayList6 = arrayList2;
                            arrayList = arrayList3;
                            j3 = j10;
                            tL_messages_messages3 = tL_messages_messages;
                        }
                        tL_messages_messages2 = tL_messages_messages3;
                        ArrayList<Long> arrayList7 = arrayList6;
                        long j23 = j3;
                        ArrayList arrayList8 = arrayList;
                        queryFinalized.dispose();
                        if (r12.val$tag != null && !hashSet.isEmpty()) {
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                Long l4 = (Long) it.next();
                                long longValue = l4.longValue();
                                int i31 = 0;
                                while (true) {
                                    if (i31 >= tL_messages_messages2.messages.size()) {
                                        i31 = -1;
                                        break;
                                    } else if (tL_messages_messages2.messages.get(i31).grouped_id == longValue) {
                                        break;
                                    } else {
                                        i31++;
                                    }
                                }
                                if (i31 >= 0) {
                                    SQLiteCursor queryFinalized6 = sQLiteDatabase.queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? AND group_id = ? ORDER BY mid DESC", Long.valueOf(r12.val$uid), l4);
                                    ArrayList arrayList9 = new ArrayList();
                                    while (queryFinalized6.next()) {
                                        int intValue3 = queryFinalized6.intValue(1);
                                        NativeByteBuffer byteBufferValue2 = queryFinalized6.byteBufferValue(0);
                                        if (byteBufferValue2 != null) {
                                            TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                            TLdeserialize2.readAttachPath(byteBufferValue2, j23);
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
                                    tL_messages_messages2.messages.remove(i31);
                                    tL_messages_messages2.messages.addAll(i31, arrayList9);
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
                        q4Var = new q4(r12, r12, r12.val$classGuid, 1);
                    } catch (Exception e15) {
                        e = e15;
                    } catch (Throwable th8) {
                        th = th8;
                    }
                } catch (Throwable th9) {
                    th = th9;
                }
            } catch (Exception e16) {
                e = e16;
            }
            AndroidUtilities.runOnUIThread(q4Var);
            MediaDataController.this.processLoadedMedia(tL_messages_messages2, r12.val$uid, r12.val$count, r12.val$max_id, r12.val$min_id, r12.val$type, r12.val$topicId, r12.val$fromCache, r12.val$classGuid, r12.val$isChannel, z14, r12.val$requestIndex);
        }
    }

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
            for (int i10 = 0; i10 < this.val$previewItems.size(); i10++) {
                if (this.val$previewItems.get(i10) != null && ((kp) this.val$previewItems.get(i10)).a != null) {
                    ((kp) this.val$previewItems.get(i10)).a.n(0);
                }
            }
            AndroidUtilities.runOnUIThread(new d3(8, this, this.val$previewItems));
        }
    }

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    public class 3 implements Runnable {
        final /* synthetic */ int val$currentAccount;
        final /* synthetic */ ArrayList val$previewItems;

        public 3(ArrayList arrayList, int i10) {
            this.val$previewItems = arrayList;
            this.val$currentAccount = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0(ArrayList arrayList) {
            MediaDataController.this.defaultEmojiThemes.clear();
            MediaDataController.this.defaultEmojiThemes.addAll(arrayList);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiPreviewThemesChanged, new Object[0]);
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = 0; i10 < this.val$previewItems.size(); i10++) {
                ((kp) this.val$previewItems.get(i10)).a.n(this.val$currentAccount);
            }
            AndroidUtilities.runOnUIThread(new d3(9, this, this.val$previewItems));
        }
    }

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                int i10 = 0;
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
                for (int i11 = 0; i11 < length; i11++) {
                    strArr[i11] = split[i11 + 5];
                }
                String join = TextUtils.join("\n", strArr);
                draftVoice.recordSamples = new short[join.length()];
                while (true) {
                    short[] sArr = draftVoice.recordSamples;
                    if (i10 >= sArr.length) {
                        return draftVoice;
                    }
                    sArr[i10] = (short) join.charAt(i10);
                    i10++;
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                return null;
            }
        }

        public static DraftVoice of(MediaController mediaController, String str, boolean z10, float f7, float f10) {
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
            draftVoice.left = f7;
            draftVoice.right = f10;
            return draftVoice;
        }

        public String toString() {
            char[] cArr = new char[this.recordSamples.length];
            int i10 = 0;
            while (true) {
                short[] sArr = this.recordSamples;
                if (i10 >= sArr.length) {
                    return "@" + this.path + "\n" + this.samplesCount + "\n" + this.writedFrame + "\n" + this.recordTimeCount + "\n" + (this.once ? 1 : 0) + ";" + this.left + ";" + this.right + "\n" + new String(cArr);
                }
                cArr[i10] = (char) sArr[i10];
                i10++;
            }
        }
    }

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    public interface KeywordResultCallback {
        void run(ArrayList<KeywordResult> arrayList, String str);
    }

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        for (int i10 = 0; i10 < 4; i10++) {
            lockObjects[i10] = new Object();
        }
        SHORTCUT_TYPE_USER_OR_CHAT = 0;
        SHORTCUT_TYPE_ATTACHED_BOT = 1;
        entityComparator = new d(8);
    }

    public MediaDataController(int i10) {
        super(i10);
        String key;
        long longValue;
        SerializedData serializedData;
        boolean z10;
        this.attachMenuBots = new TLRPC.TL_attachMenuBots();
        this.reactionsList = new ArrayList();
        this.enabledReactionsList = new ArrayList();
        this.reactionsMap = new HashMap<>();
        this.stickerSets = new ArrayList[]{new ArrayList<>(), new ArrayList<>(), new ArrayList<>(0), new ArrayList<>(), new ArrayList<>(), new ArrayList<>()};
        this.stickersByIds = new a0.i[]{new a0.i(), new a0.i(), new a0.i(), new a0.i(), new a0.i(), new a0.i()};
        this.stickerSetsById = new a0.i();
        this.installedStickerSetsById = new a0.i();
        this.installedForceStickerSetsById = new ArrayList<>();
        this.uninstalledForceStickerSetsById = new ArrayList<>();
        this.groupStickerSets = new a0.i();
        this.stickerSetsByName = new ConcurrentHashMap<>(100, 1.0f, 1);
        this.stickerSetDefaultStatuses = null;
        this.stickerSetDefaultChannelStatuses = null;
        this.diceStickerSetsByEmoji = new HashMap<>();
        this.diceEmojiStickerSetsById = new a0.i();
        this.loadingDiceStickerSets = new HashSet<>();
        this.removingStickerSetsUndos = new a0.i();
        this.scheduledLoadStickers = new Runnable[7];
        this.loadingStickers = new boolean[7];
        this.stickersLoaded = new boolean[7];
        this.loadHash = new long[7];
        this.loadDate = new int[7];
        this.ringtoneUploaderHashMap = new HashMap<>();
        this.verifyingMessages = new HashMap<>();
        this.archivedStickersCount = new int[7];
        this.stickersByEmoji = new a0.i();
        this.allStickers = new HashMap<>();
        this.allStickersFeatured = new HashMap<>();
        this.recentStickers = new ArrayList[]{new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>()};
        this.loadingRecentStickers = new boolean[9];
        this.recentStickersLoaded = new boolean[9];
        this.recentGifs = new ArrayList<>();
        this.loadFeaturedHash = new long[2];
        this.loadFeaturedDate = new int[2];
        this.featuredStickerSets = new ArrayList[]{new ArrayList<>(), new ArrayList<>()};
        this.featuredStickerSetsById = new a0.i[]{new a0.i(), new a0.i()};
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
        this.loadingPinnedMessages = new a0.i();
        this.draftsFolderIds = new a0.i();
        this.drafts = new a0.i();
        this.draftMessages = new a0.i();
        this.botInfos = new HashMap<>();
        this.botDialogKeyboards = new a0.i();
        this.botKeyboards = new HashMap<>();
        this.botKeyboardsByMids = new a0.i();
        this.currentFetchingEmoji = new HashMap<>();
        this.fetchedEmoji = new HashSet<>();
        this.triedLoadingEmojipacks = false;
        this.recentReactions = new ArrayList<>();
        this.topReactions = new ArrayList<>();
        this.savedReactions = new ArrayList<>();
        this.draftVoicesLoaded = false;
        this.draftVoices = new a0.i();
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
                        a0.i iVar = (a0.i) this.drafts.f(longValue);
                        if (iVar == null) {
                            iVar = new a0.i();
                            this.drafts.k(iVar, longValue);
                        }
                        iVar.k(TLdeserialize, key.startsWith("t_") ? Utilities.parseLong(key.substring(key.lastIndexOf(95) + 1)).longValue() : 0L);
                    }
                    serializedData.cleanup();
                }
            }
            TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            if (TLdeserialize2 != null) {
                TLdeserialize2.readAttachPath(serializedData, getUserConfig().clientUserId);
                a0.i iVar2 = (a0.i) this.draftMessages.f(longValue);
                if (iVar2 == null) {
                    iVar2 = new a0.i();
                    this.draftMessages.k(iVar2, longValue);
                }
                iVar2.k(TLdeserialize2, z10 ? Utilities.parseInt((CharSequence) key.substring(key.lastIndexOf(95) + 1)).intValue() : 0);
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
        this.ringtoneDataStore = new uf.c(this.currentAccount);
        this.menuBotsUpdateDate = getMessagesController().getMainSettings().getInt("menuBotsUpdateDate", 0);
    }

    public static void addAnimatedEmojiSpans(ArrayList<TLRPC.MessageEntity> arrayList, CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        if (!(charSequence instanceof Spannable) || arrayList == null) {
            return;
        }
        Spannable spannable = (Spannable) charSequence;
        for (org.telegram.ui.Components.z5 z5Var : (org.telegram.ui.Components.z5[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.z5.class)) {
            if (z5Var != null) {
                spannable.removeSpan(z5Var);
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.MessageEntity messageEntity = arrayList.get(i10);
            if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                int i11 = messageEntity.offset;
                int i12 = messageEntity.length + i11;
                if (i11 < i12 && i12 <= spannable.length()) {
                    spannable.setSpan(tL_messageEntityCustomEmoji.document != null ? new org.telegram.ui.Components.z5(tL_messageEntityCustomEmoji.document, fontMetricsInt) : new org.telegram.ui.Components.z5(tL_messageEntityCustomEmoji.document_id, fontMetricsInt), i11, i12, 33);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void addStyleToText(o01 o01Var, int i10, int i11, Spannable spannable, boolean z10) {
        n01 n01Var;
        int i12;
        try {
            int i13 = i10;
            int i14 = i11;
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannable.getSpans(i13, i14, CharacterStyle.class);
            if (characterStyleArr != null && characterStyleArr.length > 0) {
                int i15 = 0;
                int i16 = 0;
                while (i16 < characterStyleArr.length) {
                    CharacterStyle characterStyle = characterStyleArr[i16];
                    n01 n01Var2 = o01Var != null ? o01Var.b : new n01();
                    if (characterStyle instanceof o01) {
                        n01Var = ((o01) characterStyle).b;
                    } else if (characterStyle instanceof n51) {
                        n01Var = ((n51) characterStyle).a;
                        if (n01Var == null) {
                            n01Var = new n01();
                        }
                    } else {
                        i16++;
                        i15 = 0;
                    }
                    if (n01Var != null) {
                        int spanStart = spannable.getSpanStart(characterStyle);
                        int spanEnd = spannable.getSpanEnd(characterStyle);
                        spannable.removeSpan(characterStyle);
                        if (spanStart <= i13 || i14 <= spanEnd) {
                            if (spanStart <= i13) {
                                if (spanStart != i13) {
                                    spannable.setSpan(createNewSpan(characterStyle, n01Var, null, z10), spanStart, i13, 33);
                                }
                                if (spanEnd > i13) {
                                    if (o01Var != null) {
                                        spannable.setSpan(createNewSpan(characterStyle, n01Var, n01Var2, z10), i13, Math.min(spanEnd, i14), 33);
                                    }
                                    i12 = spanEnd;
                                    if (spanEnd >= i14) {
                                        if (spanEnd != i14) {
                                            spannable.setSpan(createNewSpan(characterStyle, n01Var, null, z10), i14, spanEnd, 33);
                                        }
                                        if (i14 > spanStart && spanEnd <= i13) {
                                            if (o01Var != null) {
                                                spannable.setSpan(createNewSpan(characterStyle, n01Var, n01Var2, z10), spanStart, Math.min(spanEnd, i14), 33);
                                            }
                                            i13 = i12;
                                        }
                                    }
                                    i13 = i12;
                                }
                            }
                            i12 = i13;
                            if (spanEnd >= i14) {
                            }
                            i13 = i12;
                        } else {
                            spannable.setSpan(createNewSpan(characterStyle, n01Var, n01Var2, z10), spanStart, spanEnd, 33);
                            if (o01Var != null) {
                                spannable.setSpan(new o01(new n01(n01Var2), i15), spanEnd, i14, 33);
                            }
                        }
                        i14 = spanStart;
                    }
                    i16++;
                    i15 = 0;
                }
            }
            if (o01Var == null || i13 >= i14 || i13 >= spannable.length()) {
                return;
            }
            spannable.setSpan(o01Var, i13, Math.min(spannable.length(), i14), 33);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public static void addTextStyleRuns(MessageObject messageObject, Spannable spannable) {
        addTextStyleRuns(messageObject.messageOwner.entities, messageObject.messageText, spannable, -1);
    }

    private ArrayList<MessageObject> broadcastPinnedMessage(ArrayList<TLRPC.Message> arrayList, ArrayList<TLRPC.User> arrayList2, ArrayList<TLRPC.Chat> arrayList3, boolean z10, boolean z11) {
        if (arrayList.isEmpty()) {
            return null;
        }
        a0.i iVar = new a0.i();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            TLRPC.User user = arrayList2.get(i10);
            iVar.k(user, user.id);
        }
        a0.i iVar2 = new a0.i();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            TLRPC.Chat chat = arrayList3.get(i11);
            iVar2.k(chat, chat.id);
        }
        ArrayList<MessageObject> arrayList4 = new ArrayList<>();
        if (!z11) {
            AndroidUtilities.runOnUIThread(new hg.y0(this, arrayList2, z10, arrayList3, arrayList, arrayList4, iVar, iVar2));
            return null;
        }
        AndroidUtilities.runOnUIThread(new vj(this, arrayList2, z10, arrayList3, 9));
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            TLRPC.Message message = arrayList.get(i13);
            if ((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaDocument) || (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                i12++;
            }
            a0.i iVar3 = iVar2;
            int i14 = i12;
            arrayList4.add(new MessageObject(this.currentAccount, message, iVar, iVar3, false, i14 < 30));
            i13++;
            iVar2 = iVar3;
            i12 = i14;
        }
        return arrayList4;
    }

    private void broadcastReplyMessages(ArrayList<TLRPC.Message> arrayList, a0.i iVar, ArrayList<TLRPC.User> arrayList2, ArrayList<TLRPC.Chat> arrayList3, long j3, boolean z10) {
        a0.i iVar2 = new a0.i();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            TLRPC.User user = arrayList2.get(i10);
            iVar2.k(user, user.id);
        }
        a0.i iVar3 = new a0.i();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            TLRPC.Chat chat = arrayList3.get(i11);
            iVar3.k(chat, chat.id);
        }
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList4.add(new MessageObject(this.currentAccount, arrayList.get(i12), iVar2, iVar3, false, false));
        }
        AndroidUtilities.runOnUIThread(new xk(this, arrayList2, z10, arrayList3, arrayList4, iVar, j3));
    }

    public static long calcDocumentsHash(ArrayList<TLRPC.Document> arrayList) {
        return calcDocumentsHash(arrayList, 200);
    }

    private long calcFeaturedStickersHash(boolean z10, ArrayList<TLRPC.StickerSetCovered> arrayList) {
        long j3 = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.StickerSet stickerSet = arrayList.get(i10).set;
                if (!stickerSet.archived) {
                    j3 = calcHash(j3, stickerSet.id);
                    if (this.unreadStickerSets[z10 ? 1 : 0].contains(Long.valueOf(stickerSet.id))) {
                        j3 = calcHash(j3, 1L);
                    }
                }
            }
        }
        return j3;
    }

    public static long calcHash(long j3, long j10) {
        long j11 = j3 ^ (j3 >>> 21);
        long j12 = j11 ^ (j11 << 35);
        return (j12 ^ (j12 >>> 4)) + j10;
    }

    private static long calcStickersHash(ArrayList<TLRPC.TL_messages_stickerSet> arrayList) {
        long j3 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != null) {
                if (!arrayList.get(i10).set.archived) {
                    j3 = calcHash(j3, r3.hash);
                }
            }
        }
        return j3;
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
        int i10 = 0;
        while (i10 < size) {
            TLRPC.AttachMenuPeerType attachMenuPeerType = arrayList.get(i10);
            i10++;
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
        int i10 = 0;
        while (i10 < size) {
            TLRPC.AttachMenuPeerType attachMenuPeerType = arrayList.get(i10);
            i10++;
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
    private static boolean checkInclusion(int i10, List<TLRPC.MessageEntity> list, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.MessageEntity messageEntity = list.get(i11);
                int i12 = messageEntity.offset;
                if (z10) {
                    if (i12 >= i10) {
                        continue;
                    }
                    if (messageEntity.offset + messageEntity.length <= i10) {
                        return true;
                    }
                } else {
                    if (i12 > i10) {
                        continue;
                    }
                    if (messageEntity.offset + messageEntity.length <= i10) {
                    }
                }
            }
        }
        return false;
    }

    private static boolean checkIntersection(int i10, int i11, List<TLRPC.MessageEntity> list) {
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.MessageEntity messageEntity = list.get(i12);
                int i13 = messageEntity.offset;
                if (i13 > i10 && i13 + messageEntity.length <= i11) {
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
        getMessagesStorage().getStorageQueue().postRunnable(new i7(this, 8));
    }

    private Intent createIntrnalAttachedBotShortcutIntent(long j3) {
        if (j3 != 0 && canCreateAttachedMenuBotShortcut(j3)) {
            Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) OpenAttachedMenuBotReceiver.class);
            if (DialogObject.isUserDialog(j3)) {
                intent.putExtra("botId", j3);
                intent.putExtra("currentAccount", this.currentAccount);
                intent.setAction(OpenAttachedMenuBotReceiver.ACTION + j3);
                intent.addFlags(67108864);
                return intent;
            }
        }
        return null;
    }

    private Intent createIntrnalShortcutIntent(long j3) {
        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) OpenChatReceiver.class);
        if (DialogObject.isEncryptedDialog(j3)) {
            int encryptedChatId = DialogObject.getEncryptedChatId(j3);
            intent.putExtra("encId", encryptedChatId);
            if (getMessagesController().getEncryptedChat(Integer.valueOf(encryptedChatId)) == null) {
                return null;
            }
        } else if (DialogObject.isUserDialog(j3)) {
            intent.putExtra("userId", j3);
        } else {
            if (!DialogObject.isChatDialog(j3)) {
                return null;
            }
            intent.putExtra("chatId", -j3);
        }
        intent.putExtra("currentAccount", this.currentAccount);
        intent.setAction("com.tmessages.openchat" + j3);
        intent.addFlags(67108864);
        return intent;
    }

    private static CharacterStyle createNewSpan(CharacterStyle characterStyle, n01 n01Var, n01 n01Var2, boolean z10) {
        n01 n01Var3 = new n01(n01Var);
        if (n01Var2 != null) {
            if (z10) {
                n01Var3.b(n01Var2);
            } else {
                n01Var3.a = n01Var2.a;
                n01Var3.d = n01Var2.d;
            }
        }
        if (characterStyle instanceof o01) {
            return new o01(n01Var3, 0);
        }
        if (characterStyle instanceof n51) {
            return new n51(((n51) characterStyle).getURL(), n01Var3);
        }
        return null;
    }

    private void deletePeer(long j3, int i10) {
        getMessagesStorage().getStorageQueue().postRunnable(new bi.h7(this, j3, i10, 3));
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
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new a7(this, inputSetKey, 1));
    }

    public static TLRPC.TL_attachMenuBotIcon getAnimatedAttachMenuBotIcon(TLRPC.TL_attachMenuBot tL_attachMenuBot, boolean z10) {
        ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList.get(i10);
            i10++;
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
    private TLRPC.TL_messages_stickerSet getCachedStickerSetInternal(long j3, Integer num) {
        SQLiteCursor sQLiteCursor;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        NativeByteBuffer nativeByteBuffer = null;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            sQLiteCursor = getMessagesStorage().getDatabase().queryFinalized("SELECT data, hash FROM stickersets2 WHERE id = ? LIMIT 1", Long.valueOf(j3));
            try {
                if (!sQLiteCursor.next() || sQLiteCursor.isNull(0)) {
                    tL_messages_stickerSet = null;
                } else {
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        try {
                            tL_messages_stickerSet = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        } catch (Throwable th3) {
                            th = th3;
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
                        } catch (Throwable th4) {
                            th = th4;
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
            } catch (Throwable th5) {
                th = th5;
                tL_messages_stickerSet = null;
            }
        } catch (Throwable th6) {
            th = th6;
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

    public static MediaDataController getInstance(int i10) {
        MediaDataController mediaDataController;
        MediaDataController mediaDataController2 = Instance[i10];
        if (mediaDataController2 != null) {
            return mediaDataController2;
        }
        synchronized (lockObjects) {
            try {
                mediaDataController = Instance[i10];
                if (mediaDataController == null) {
                    MediaDataController[] mediaDataControllerArr = Instance;
                    MediaDataController mediaDataController3 = new MediaDataController(i10);
                    mediaDataControllerArr[i10] = mediaDataController3;
                    mediaDataController = mediaDataController3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaDataController;
    }

    private void getMediaCountDatabase(long j3, long j10, int i10, int i11) {
        getMessagesStorage().getStorageQueue().postRunnable(new j8(this, j10, j3, i10, i11, 0));
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
                for (int i10 = 0; i10 < message.entities.size(); i10++) {
                    TLRPC.MessageEntity messageEntity = message.entities.get(i10);
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
        for (int i11 = 0; i11 < document.attributes.size(); i11++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
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
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList.get(i10);
            i10++;
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
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList.get(i10);
            i10++;
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
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList.get(i10);
            i10++;
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
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList.get(i10);
            i10++;
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
        for (int i10 = 0; i10 < document.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
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

    public static ArrayList<n01> getTextStyleRuns(ArrayList<TLRPC.MessageEntity> arrayList, CharSequence charSequence, int i10) {
        int i11;
        ArrayList<n01> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList(arrayList);
        Collections.sort(arrayList3, new d(10));
        int size = arrayList3.size();
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList3.get(i12);
            if (messageEntity != null && messageEntity.length > 0 && (i11 = messageEntity.offset) >= 0 && i11 < charSequence.length()) {
                if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                    messageEntity.length = charSequence.length() - messageEntity.offset;
                }
                if (!(messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                    n01 n01Var = new n01();
                    int i13 = messageEntity.offset;
                    n01Var.b = i13;
                    n01Var.c = i13 + messageEntity.length;
                    if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                        n01Var.a = 256;
                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                        n01Var.a = 8;
                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                        n01Var.a = 16;
                    } else if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                        n01Var.a = 1;
                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                        n01Var.a = 2;
                    } else if ((messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                        n01Var.a = 4;
                    } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                        n01Var.a = 64;
                        n01Var.d = messageEntity;
                    } else if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                        n01Var.a = 64;
                        n01Var.d = messageEntity;
                    } else {
                        n01Var.a = 128;
                        n01Var.d = messageEntity;
                    }
                    if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                        n01Var.a |= 1024;
                    }
                    n01Var.a &= i10;
                    int size2 = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        n01 n01Var2 = arrayList2.get(i14);
                        int i15 = n01Var.b;
                        int i16 = n01Var2.b;
                        if (i15 > i16) {
                            int i17 = n01Var2.c;
                            if (i15 < i17) {
                                if (n01Var.c < i17) {
                                    n01 n01Var3 = new n01(n01Var);
                                    n01Var3.b(n01Var2);
                                    arrayList2.add(i14 + 1, n01Var3);
                                    n01 n01Var4 = new n01(n01Var2);
                                    n01Var4.b = n01Var.c;
                                    i14 += 2;
                                    size2 += 2;
                                    arrayList2.add(i14, n01Var4);
                                } else {
                                    n01 n01Var5 = new n01(n01Var);
                                    n01Var5.b(n01Var2);
                                    n01Var5.c = n01Var2.c;
                                    i14++;
                                    size2++;
                                    arrayList2.add(i14, n01Var5);
                                }
                                int i18 = n01Var.b;
                                n01Var.b = n01Var2.c;
                                n01Var2.c = i18;
                            }
                        } else {
                            int i19 = n01Var.c;
                            if (i16 < i19) {
                                int i20 = n01Var2.c;
                                if (i19 == i20) {
                                    n01Var2.b(n01Var);
                                } else if (i19 < i20) {
                                    n01 n01Var6 = new n01(n01Var2);
                                    n01Var6.b(n01Var);
                                    n01Var6.c = n01Var.c;
                                    i14++;
                                    size2++;
                                    arrayList2.add(i14, n01Var6);
                                    n01Var2.b = n01Var.c;
                                } else {
                                    n01 n01Var7 = new n01(n01Var);
                                    n01Var7.b = n01Var2.c;
                                    i14++;
                                    size2++;
                                    arrayList2.add(i14, n01Var7);
                                    n01Var2.b(n01Var);
                                }
                                n01Var.c = i16;
                            }
                        }
                        i14++;
                    }
                    if (n01Var.b < n01Var.c) {
                        arrayList2.add(n01Var);
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
        } catch (Exception e7) {
            FileLog.e(e7);
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
            AndroidUtilities.runOnUIThread(new i7(this, 2));
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
    public /* synthetic */ void lambda$addRecentSticker$23(int i10, TLRPC.Document document) {
        int i11 = i10 == 0 ? 3 : i10 == 1 ? 4 : i10 == 5 ? 7 : 5;
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.id + "' AND type = " + i11).stepThis().dispose();
        } catch (Exception e7) {
            FileLog.e(e7);
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
    public /* synthetic */ void lambda$broadcastPinnedMessage$169(ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.i iVar, a0.i iVar2) {
        getMessagesController().putUsers(arrayList, z10);
        getMessagesController().putChats(arrayList2, z10);
        int size = arrayList3.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.Message message = (TLRPC.Message) arrayList3.get(i11);
            if ((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaDocument) || (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                i10++;
            }
            arrayList4.add(new MessageObject(this.currentAccount, message, iVar, iVar2, false, i10 < 30));
        }
        AndroidUtilities.runOnUIThread(new u7(this, arrayList4, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$broadcastReplyMessages$179(ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.i iVar, long j3) {
        ArrayList arrayList4;
        getMessagesController().putUsers(arrayList, z10);
        getMessagesController().putChats(arrayList2, z10);
        int size = arrayList3.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            MessageObject messageObject = (MessageObject) arrayList3.get(i10);
            SparseArray sparseArray = (SparseArray) iVar.f(messageObject.getDialogId());
            if (sparseArray != null && (arrayList4 = (ArrayList) sparseArray.get(messageObject.getId())) != null) {
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    MessageObject messageObject2 = (MessageObject) arrayList4.get(i11);
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
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.replyMessagesDidLoad, Long.valueOf(j3), arrayList3, iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x00a5, code lost:
    
        if (r4.isEmpty() != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02f6 A[Catch: all -> 0x0388, TryCatch #4 {all -> 0x0388, blocks: (B:36:0x01c1, B:39:0x02be, B:42:0x02d8, B:44:0x02f6, B:46:0x0305, B:48:0x0318, B:50:0x0322, B:52:0x0326, B:54:0x0329, B:56:0x0363, B:58:0x032f, B:59:0x0334, B:63:0x0335, B:64:0x033a, B:65:0x033b, B:67:0x0343, B:69:0x0347, B:71:0x034a, B:73:0x0355, B:74:0x0360, B:76:0x035b, B:78:0x036c, B:79:0x0371, B:82:0x0372, B:83:0x0377, B:84:0x030c, B:108:0x02b2, B:138:0x0378, B:139:0x037f, B:140:0x0380, B:141:0x0387), top: B:12:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0305 A[Catch: all -> 0x0388, TryCatch #4 {all -> 0x0388, blocks: (B:36:0x01c1, B:39:0x02be, B:42:0x02d8, B:44:0x02f6, B:46:0x0305, B:48:0x0318, B:50:0x0322, B:52:0x0326, B:54:0x0329, B:56:0x0363, B:58:0x032f, B:59:0x0334, B:63:0x0335, B:64:0x033a, B:65:0x033b, B:67:0x0343, B:69:0x0347, B:71:0x034a, B:73:0x0355, B:74:0x0360, B:76:0x035b, B:78:0x036c, B:79:0x0371, B:82:0x0372, B:83:0x0377, B:84:0x030c, B:108:0x02b2, B:138:0x0378, B:139:0x037f, B:140:0x0380, B:141:0x0387), top: B:12:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0318 A[Catch: all -> 0x0388, TryCatch #4 {all -> 0x0388, blocks: (B:36:0x01c1, B:39:0x02be, B:42:0x02d8, B:44:0x02f6, B:46:0x0305, B:48:0x0318, B:50:0x0322, B:52:0x0326, B:54:0x0329, B:56:0x0363, B:58:0x032f, B:59:0x0334, B:63:0x0335, B:64:0x033a, B:65:0x033b, B:67:0x0343, B:69:0x0347, B:71:0x034a, B:73:0x0355, B:74:0x0360, B:76:0x035b, B:78:0x036c, B:79:0x0371, B:82:0x0372, B:83:0x0377, B:84:0x030c, B:108:0x02b2, B:138:0x0378, B:139:0x037f, B:140:0x0380, B:141:0x0387), top: B:12:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x033b A[Catch: all -> 0x0388, TryCatch #4 {all -> 0x0388, blocks: (B:36:0x01c1, B:39:0x02be, B:42:0x02d8, B:44:0x02f6, B:46:0x0305, B:48:0x0318, B:50:0x0322, B:52:0x0326, B:54:0x0329, B:56:0x0363, B:58:0x032f, B:59:0x0334, B:63:0x0335, B:64:0x033a, B:65:0x033b, B:67:0x0343, B:69:0x0347, B:71:0x034a, B:73:0x0355, B:74:0x0360, B:76:0x035b, B:78:0x036c, B:79:0x0371, B:82:0x0372, B:83:0x0377, B:84:0x030c, B:108:0x02b2, B:138:0x0378, B:139:0x037f, B:140:0x0380, B:141:0x0387), top: B:12:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x030c A[Catch: all -> 0x0388, TryCatch #4 {all -> 0x0388, blocks: (B:36:0x01c1, B:39:0x02be, B:42:0x02d8, B:44:0x02f6, B:46:0x0305, B:48:0x0318, B:50:0x0322, B:52:0x0326, B:54:0x0329, B:56:0x0363, B:58:0x032f, B:59:0x0334, B:63:0x0335, B:64:0x033a, B:65:0x033b, B:67:0x0343, B:69:0x0347, B:71:0x034a, B:73:0x0355, B:74:0x0360, B:76:0x035b, B:78:0x036c, B:79:0x0371, B:82:0x0372, B:83:0x0377, B:84:0x030c, B:108:0x02b2, B:138:0x0378, B:139:0x037f, B:140:0x0380, B:141:0x0387), top: B:12:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
        int i10;
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
                List e7 = g0.f.e(ApplicationLoader.applicationContext);
                if (e7 != null && !e7.isEmpty()) {
                    arrayList7.add("compose");
                    for (int i11 = 0; i11 < arrayList6.size(); i11++) {
                        arrayList7.add("did3_" + MessageObject.getPeerId(((TLRPC.TL_topPeer) arrayList6.get(i11)).peer));
                    }
                    for (int i12 = 0; i12 < e7.size(); i12++) {
                        String str3 = ((g0.c) e7.get(i12)).b;
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
                    g0.f.x(ApplicationLoader.applicationContext, arrayList3);
                } else {
                    g0.f.a(ApplicationLoader.applicationContext, arrayList3);
                }
                arrayList3.clear();
            }
            HashSet hashSet = new HashSet(1);
            hashSet.add(SHORTCUT_CATEGORY);
            int i13 = 0;
            while (i13 < arrayList6.size()) {
                Intent intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) OpenChatReceiver.class);
                long peerId = MessageObject.getPeerId(((TLRPC.TL_topPeer) arrayList6.get(i13)).peer);
                if (DialogObject.isUserDialog(peerId)) {
                    intent3.putExtra("userId", peerId);
                    user = getMessagesController().getUser(Long.valueOf(peerId));
                    arrayList4 = arrayList2;
                    chat = null;
                    c10 = 0;
                } else {
                    arrayList4 = arrayList2;
                    long j3 = -peerId;
                    c10 = 0;
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j3));
                    intent3.putExtra("chatId", j3);
                    chat = chat2;
                    user = null;
                }
                if ((user == null || UserObject.isDeleted(user)) && chat == null) {
                    i10 = i13;
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
                                                i10 = i13;
                                                intent = intent3;
                                                try {
                                                    path.addCircle(dp / 2, dp / 2, (dp / 2) - AndroidUtilities.dp(2.0f), Path.Direction.CW);
                                                    roundPath.toggleInverseFillType();
                                                } catch (Throwable th2) {
                                                    th = th2;
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
                                                    cVar2.m = i10 + 1;
                                                    Intent[] intentArr2 = new Intent[1];
                                                    intentArr2[c10] = intent;
                                                    cVar2.c = intentArr2;
                                                    if (!SharedConfig.directShare) {
                                                    }
                                                    if (bitmap == null) {
                                                    }
                                                    if (!z10) {
                                                    }
                                                    i13 = i10 + 1;
                                                    arrayList6 = arrayList;
                                                    arrayList2 = arrayList5;
                                                    z11 = true;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                i10 = i13;
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
                                                cVar22.m = i10 + 1;
                                                Intent[] intentArr22 = new Intent[1];
                                                intentArr22[c10] = intent;
                                                cVar22.c = intentArr22;
                                                if (!SharedConfig.directShare) {
                                                }
                                                if (bitmap == null) {
                                                }
                                                if (!z10) {
                                                }
                                                i13 = i10 + 1;
                                                arrayList6 = arrayList;
                                                arrayList2 = arrayList5;
                                                z11 = true;
                                            }
                                        } else {
                                            str2 = str;
                                            i10 = i13;
                                            intent = intent3;
                                        }
                                        bitmapRect.set(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f));
                                        canvas.drawBitmap(decodeFile, (Rect) null, bitmapRect, roundPaint);
                                        canvas.drawPath(roundPath, erasePaint);
                                        try {
                                            canvas.setBitmap(null);
                                        } catch (Exception unused2) {
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        str2 = str;
                                    }
                                } else {
                                    str2 = str;
                                    i10 = i13;
                                    intent = intent3;
                                    bitmap = decodeFile;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                str2 = str;
                                i10 = i13;
                                intent = intent3;
                                bitmap = null;
                            }
                        } else {
                            str2 = str;
                            i10 = i13;
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
                        cVar222.m = i10 + 1;
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
                                g0.f.x(ApplicationLoader.applicationContext, arrayList3);
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
                    cVar2222.m = i10 + 1;
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
                        cVar22222.m = i10 + 1;
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
                        cVar222222.m = i10 + 1;
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
                i13 = i10 + 1;
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
        AndroidUtilities.runOnUIThread(new e7(this, tLObject, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkGenericAnimations$79(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            getUserConfig().genericAnimationsStickerPack = tL_messages_stickerSet.set.short_name;
            getUserConfig().lastUpdatedGenericAnimations = System.currentTimeMillis();
            getUserConfig().saveConfig(false);
            processLoadedDiceStickers(getUserConfig().genericAnimationsStickerPack, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
            for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                if (this.currentAccount == UserConfig.selectedAccount) {
                    preloadImage(ImageLocation.getForDocument(tL_messages_stickerSet.documents.get(i10)), 0);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkGenericAnimations$80(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new e7(this, tLObject, 5));
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
        AndroidUtilities.runOnUIThread(new e7(this, tLObject, 0));
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
        AndroidUtilities.runOnUIThread(new e7(this, tLObject, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$cleanup$1() {
        try {
            g0.f.n(ApplicationLoader.applicationContext);
        } catch (Exception e7) {
            FileLog.e(e7);
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
        } catch (Exception e7) {
            FileLog.e(e7);
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
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            int intValue = ((Integer) arrayList.get(i10)).intValue();
            long j3 = intValue;
            MessagesStorage.TopicKey topicKey2 = (MessagesStorage.TopicKey) this.botKeyboardsByMids.f(j3);
            if (topicKey2 != null) {
                this.botKeyboards.remove(topicKey2);
                ArrayList arrayList2 = (ArrayList) this.botDialogKeyboards.f(topicKey2.dialogId);
                if (arrayList2 != null) {
                    int i11 = 0;
                    while (i11 < arrayList2.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList2.get(i11);
                        if (message == null || message.id == intValue) {
                            arrayList2.remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                    if (arrayList2.isEmpty()) {
                        this.botDialogKeyboards.l(topicKey2.dialogId);
                    }
                }
                this.botKeyboardsByMids.l(j3);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, null, topicKey2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearBotKeyboard$194(long j3) {
        ArrayList arrayList = (ArrayList) this.botDialogKeyboards.f(j3);
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
                int i11 = this.currentAccount;
                MessagesStorage.TopicKey of2 = MessagesStorage.TopicKey.of(j3, MessageObject.getTopicId(i11, message, ChatObject.isForum(i11, j3)));
                this.botKeyboards.remove(of2);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, null, of2);
            }
        }
        this.botDialogKeyboards.l(j3);
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearRecentStickers$18(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            getMessagesStorage().getStorageQueue().postRunnable(new i7(this, 5));
            this.recentStickers[0].clear();
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentDocumentsDidLoad, Boolean.FALSE, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearRecentStickers$19(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new e7(this, tLObject, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearTopPeers$149() {
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deletePeer$159(long j3, int i10) {
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            Locale locale = Locale.US;
            database.executeFast("DELETE FROM chat_hints WHERE did = " + j3 + " AND type = " + i10).stepThis().dispose();
        } catch (Exception e7) {
            FileLog.e(e7);
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
    public /* synthetic */ void lambda$fetchEmojiStatuses$231(int i10) {
        boolean z10;
        NativeByteBuffer byteBufferValue;
        try {
            SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data FROM emoji_statuses WHERE type = " + i10 + " LIMIT 1", new Object[0]);
            if (!queryFinalized.next() || queryFinalized.getColumnCount() <= 0 || queryFinalized.isNull(0) || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                z10 = false;
            } else {
                TL_account.EmojiStatuses TLdeserialize = TL_account.EmojiStatuses.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                if (TLdeserialize instanceof TL_account.TL_emojiStatuses) {
                    this.emojiStatusesHash[i10] = TLdeserialize.hash;
                    this.emojiStatuses[i10] = TLdeserialize.statuses;
                    z10 = true;
                } else {
                    z10 = false;
                }
                try {
                    byteBufferValue.reuse();
                } catch (Exception e7) {
                    e = e7;
                    FileLog.e(e);
                    this.emojiStatusesFromCacheFetched[i10] = true;
                    this.emojiStatusesFetching[i10] = false;
                    if (z10) {
                    }
                }
            }
            queryFinalized.dispose();
        } catch (Exception e10) {
            e = e10;
            z10 = false;
        }
        this.emojiStatusesFromCacheFetched[i10] = true;
        this.emojiStatusesFetching[i10] = false;
        if (z10) {
            fetchEmojiStatuses(i10, false);
        } else {
            AndroidUtilities.runOnUIThread(new i7(this, 11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchEmojiStatuses$232() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentEmojiStatusesUpdate, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchEmojiStatuses$233(int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.emojiStatusesFetchDate[i10] = Long.valueOf(System.currentTimeMillis() / 1000);
        if (tLObject instanceof TL_account.TL_emojiStatusesNotModified) {
            this.emojiStatusesFetching[i10] = false;
            return;
        }
        if (tLObject instanceof TL_account.TL_emojiStatuses) {
            TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) tLObject;
            this.emojiStatusesHash[i10] = tL_emojiStatuses.hash;
            this.emojiStatuses[i10] = tL_emojiStatuses.statuses;
            updateEmojiStatuses(i10, tL_emojiStatuses);
            AndroidUtilities.runOnUIThread(new i7(this, 0));
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
            AndroidUtilities.runOnUIThread(new b8(this, str, 2));
        } catch (Exception e7) {
            FileLog.e(e7);
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
    public /* synthetic */ void lambda$fetchNewEmojiKeywords$212(int i10, String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject == null) {
            AndroidUtilities.runOnUIThread(new b8(this, str2, 6));
            return;
        }
        TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference = (TLRPC.TL_emojiKeywordsDifference) tLObject;
        if (i10 != -1 && !tL_emojiKeywordsDifference.lang_code.equals(str)) {
            getMessagesStorage().getStorageQueue().postRunnable(new b8(this, str2, 5));
        } else {
            putEmojiKeywords(str2, tL_emojiKeywordsDifference);
            AndroidUtilities.runOnUIThread(new i7(this, 18));
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
        int i10;
        int i11;
        TLRPC.TL_messages_getEmojiKeywordsDifference tL_messages_getEmojiKeywordsDifference;
        int i12 = 0;
        String str2 = null;
        long j3 = 0;
        try {
            SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT alias, version, date FROM emoji_keywords_info_v2 WHERE lang = ?", str);
            if (queryFinalized.next()) {
                str2 = queryFinalized.stringValue(0);
                i10 = queryFinalized.intValue(1);
                try {
                    j3 = queryFinalized.longValue(2);
                } catch (Exception e7) {
                    e = e7;
                    FileLog.e(e);
                    String str3 = str2;
                    i11 = i10;
                    if (BuildVars.DEBUG_VERSION) {
                    }
                    if (i11 != -1) {
                    }
                    getConnectionsManager().sendRequest(tL_messages_getEmojiKeywordsDifference, new h8(this, i11, str3, str, 0));
                }
            } else {
                i10 = -1;
            }
            queryFinalized.dispose();
        } catch (Exception e10) {
            e = e10;
            i10 = -1;
        }
        String str32 = str2;
        i11 = i10;
        if (BuildVars.DEBUG_VERSION && Math.abs(System.currentTimeMillis() - j3) < 3600000) {
            AndroidUtilities.runOnUIThread(new b8(this, str, i12));
            return;
        }
        if (i11 != -1) {
            TLRPC.TL_messages_getEmojiKeywords tL_messages_getEmojiKeywords = new TLRPC.TL_messages_getEmojiKeywords();
            tL_messages_getEmojiKeywords.lang_code = str;
            tL_messages_getEmojiKeywordsDifference = tL_messages_getEmojiKeywords;
        } else {
            TLRPC.TL_messages_getEmojiKeywordsDifference tL_messages_getEmojiKeywordsDifference2 = new TLRPC.TL_messages_getEmojiKeywordsDifference();
            tL_messages_getEmojiKeywordsDifference2.lang_code = str;
            tL_messages_getEmojiKeywordsDifference2.from_version = i11;
            tL_messages_getEmojiKeywordsDifference = tL_messages_getEmojiKeywordsDifference2;
        }
        getConnectionsManager().sendRequest(tL_messages_getEmojiKeywordsDifference, new h8(this, i11, str32, str, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchStickerSetInternal$41(String str, TLObject tLObject) {
        ArrayList<Utilities.Callback2<Boolean, TLRPC.TL_messages_stickerSet>> arrayList = this.loadingStickerSets.get(str);
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (tLObject != null) {
                    arrayList.get(i10).run(Boolean.TRUE, (TLRPC.TL_messages_stickerSet) tLObject);
                } else {
                    arrayList.get(i10).run(Boolean.FALSE, null);
                }
            }
        }
        this.loadingStickerSets.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchStickerSetInternal$42(String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new l9(this, str, tLObject, 0));
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
        int i10;
        ArrayList<TLRPC.StickerSetCovered> arrayList2;
        int i11;
        TLRPC.StickerSetCovered stickerSetCovered;
        ArrayList<TLRPC.Document> arrayList3;
        TLRPC.TL_documentAttributeCustomEmoji tL_documentAttributeCustomEmoji;
        TLRPC.StickerSet stickerSet;
        String str2;
        int i12;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.TL_documentAttributeCustomEmoji tL_documentAttributeCustomEmoji2;
        TLRPC.StickerSet stickerSet2;
        String str3;
        int i13;
        int i14;
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
        int i15 = 0;
        while (i15 < min) {
            String str5 = ((KeywordResult) arrayList.get(i15)).emoji;
            if (TextUtils.isEmpty(str5)) {
                arrayList2 = featuredEmojiSets;
                z12 = z13;
                i10 = min;
            } else {
                arrayList5.clear();
                if (Emoji.recentEmoji != null) {
                    c10 = 0;
                    int i16 = 0;
                    while (true) {
                        ArrayList<String> arrayList6 = Emoji.recentEmoji;
                        if (i16 >= arrayList6.size()) {
                            z12 = z13;
                            break;
                        }
                        if (arrayList6.get(i16).startsWith("animated_")) {
                            try {
                                z12 = z13;
                                try {
                                    TLRPC.Document f7 = org.telegram.ui.Components.q5.f(mediaDataController.currentAccount, Long.parseLong(arrayList6.get(i16).substring(9)));
                                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f7, null);
                                    if (f7 != null) {
                                        if (findAnimatedEmojiEmoticon != null) {
                                            if (findAnimatedEmojiEmoticon.contains(str5)) {
                                                if (!z12) {
                                                    if (MessageObject.isFreeEmoji(f7)) {
                                                    }
                                                }
                                                if (!hashSet.contains(Long.valueOf(f7.id))) {
                                                    hashSet.add(Long.valueOf(f7.id));
                                                    arrayList5.add(f7);
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
                        i16++;
                        z13 = z12;
                    }
                } else {
                    z12 = z13;
                    c10 = 0;
                }
                if (arrayList5.size() < intValue && arrayListArr[c10] != null) {
                    int i17 = 0;
                    while (i17 < arrayListArr[c10].size()) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayListArr[c10].get(i17);
                        if (tL_messages_stickerSet3 == null || tL_messages_stickerSet3.packs == null) {
                            i12 = i17;
                            i10 = min;
                            if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                                int i18 = 0;
                                while (i18 < tL_messages_stickerSet3.documents.size()) {
                                    TLRPC.Document document2 = tL_messages_stickerSet3.documents.get(i18);
                                    if (document2 != null && document2.attributes != null && !arrayList5.contains(document2)) {
                                        int i19 = 0;
                                        while (true) {
                                            if (i19 >= document2.attributes.size()) {
                                                tL_documentAttributeCustomEmoji2 = null;
                                                break;
                                            }
                                            TLRPC.DocumentAttribute documentAttribute = document2.attributes.get(i19);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                                                tL_documentAttributeCustomEmoji2 = (TLRPC.TL_documentAttributeCustomEmoji) documentAttribute;
                                                break;
                                            }
                                            i19++;
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
                                            i18++;
                                            tL_messages_stickerSet3 = tL_messages_stickerSet;
                                        }
                                    }
                                    tL_messages_stickerSet = tL_messages_stickerSet3;
                                    i18++;
                                    tL_messages_stickerSet3 = tL_messages_stickerSet;
                                }
                            }
                        } else {
                            int i20 = 0;
                            while (i20 < tL_messages_stickerSet3.packs.size()) {
                                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet3.packs.get(i20);
                                if (tL_stickerPack == null || (str4 = tL_stickerPack.emoticon) == null || !str4.contains(str5)) {
                                    i13 = i17;
                                } else {
                                    i13 = i17;
                                    int i21 = 0;
                                    while (i21 < tL_stickerPack.documents.size()) {
                                        long longValue = tL_stickerPack.documents.get(i21).longValue();
                                        int i22 = i21;
                                        int i23 = 0;
                                        while (true) {
                                            if (i23 >= tL_messages_stickerSet3.documents.size()) {
                                                i14 = min;
                                                document = null;
                                                break;
                                            }
                                            document = tL_messages_stickerSet3.documents.get(i23);
                                            int i24 = i23;
                                            i14 = min;
                                            if (document != null && document.id == longValue) {
                                                break;
                                            }
                                            i23 = i24 + 1;
                                            min = i14;
                                        }
                                        if (document != null && document.attributes != null && !arrayList5.contains(document) && !hashSet.contains(Long.valueOf(document.id))) {
                                            hashSet.add(Long.valueOf(document.id));
                                            arrayList5.add(document);
                                            if (arrayList5.size() >= intValue) {
                                                break;
                                            }
                                        }
                                        i21 = i22 + 1;
                                        min = i14;
                                    }
                                }
                                i14 = min;
                                i20++;
                                i17 = i13;
                                min = i14;
                            }
                            i12 = i17;
                            i10 = min;
                        }
                        if (arrayList5.size() >= intValue) {
                            break;
                        }
                        i17 = i12 + 1;
                        min = i10;
                    }
                }
                i10 = min;
                if (arrayList5.size() < intValue && featuredEmojiSets != null) {
                    int i25 = 0;
                    while (i25 < featuredEmojiSets.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered2 = featuredEmojiSets.get(i25);
                        if (stickerSetCovered2 != null) {
                            ArrayList<TLRPC.Document> arrayList7 = stickerSetCovered2 instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered2).documents : stickerSetCovered2.covers;
                            if (arrayList7 != null) {
                                int i26 = 0;
                                while (true) {
                                    if (i26 >= arrayList7.size()) {
                                        i11 = i25;
                                        arrayList2 = featuredEmojiSets;
                                        break;
                                    }
                                    TLRPC.Document document3 = arrayList7.get(i26);
                                    if (document3 == null || document3.attributes == null || arrayList5.contains(document3)) {
                                        i11 = i25;
                                        arrayList2 = featuredEmojiSets;
                                    } else {
                                        i11 = i25;
                                        int i27 = 0;
                                        while (true) {
                                            if (i27 >= document3.attributes.size()) {
                                                arrayList2 = featuredEmojiSets;
                                                tL_documentAttributeCustomEmoji = null;
                                                break;
                                            }
                                            TLRPC.DocumentAttribute documentAttribute2 = document3.attributes.get(i27);
                                            arrayList2 = featuredEmojiSets;
                                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                                                tL_documentAttributeCustomEmoji = (TLRPC.TL_documentAttributeCustomEmoji) documentAttribute2;
                                                break;
                                            } else {
                                                i27++;
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
                                            i26++;
                                            stickerSetCovered2 = stickerSetCovered;
                                            arrayList7 = arrayList3;
                                            i25 = i11;
                                            featuredEmojiSets = arrayList2;
                                        }
                                    }
                                    stickerSetCovered = stickerSetCovered2;
                                    arrayList3 = arrayList7;
                                    i26++;
                                    stickerSetCovered2 = stickerSetCovered;
                                    arrayList7 = arrayList3;
                                    i25 = i11;
                                    featuredEmojiSets = arrayList2;
                                }
                                if (arrayList5.size() >= intValue) {
                                    break;
                                }
                                i25 = i11 + 1;
                                featuredEmojiSets = arrayList2;
                            }
                        }
                        i11 = i25;
                        arrayList2 = featuredEmojiSets;
                        i25 = i11 + 1;
                        featuredEmojiSets = arrayList2;
                    }
                }
                arrayList2 = featuredEmojiSets;
                if (!arrayList5.isEmpty()) {
                    String str6 = ((KeywordResult) arrayList.get(i15)).keyword;
                    for (int i28 = 0; i28 < arrayList5.size(); i28++) {
                        TLRPC.Document document4 = (TLRPC.Document) arrayList5.get(i28);
                        if (document4 != null) {
                            KeywordResult keywordResult = new KeywordResult();
                            keywordResult.emoji = "animated_" + document4.id;
                            keywordResult.keyword = str6;
                            arrayList4.add(keywordResult);
                        }
                    }
                }
            }
            i15++;
            mediaDataController = this;
            z13 = z12;
            featuredEmojiSets = arrayList2;
            min = i10;
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
        AndroidUtilities.runOnUIThread(new z8(this, getCachedStickerSetInternal(str.toLowerCase(), (Integer) 0), callback, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getAnimatedEmojiByKeywords$216(String str, ArrayList arrayList, ArrayList arrayList2, Utilities.Callback callback) {
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        String lowerCase = str.toLowerCase();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).keywords != null) {
                ArrayList<TLRPC.TL_stickerKeyword> arrayList5 = ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).keywords;
                for (int i11 = 0; i11 < arrayList5.size(); i11++) {
                    for (int i12 = 0; i12 < arrayList5.get(i11).keyword.size(); i12++) {
                        String str2 = arrayList5.get(i11).keyword.get(i12);
                        if (lowerCase.equals(str2)) {
                            arrayList3.add(Long.valueOf(arrayList5.get(i11).document_id));
                        } else if (lowerCase.contains(str2) || str2.contains(lowerCase)) {
                            arrayList4.add(Long.valueOf(arrayList5.get(i11).document_id));
                        }
                    }
                }
            }
        }
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if ((arrayList2.get(i13) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList2.get(i13)).keywords != null) {
                ArrayList<TLRPC.TL_stickerKeyword> arrayList6 = ((TLRPC.TL_stickerSetFullCovered) arrayList2.get(i13)).keywords;
                for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                    for (int i15 = 0; i15 < arrayList6.get(i14).keyword.size(); i15++) {
                        String str3 = arrayList6.get(i14).keyword.get(i15);
                        if (lowerCase.equals(str3)) {
                            arrayList3.add(Long.valueOf(arrayList6.get(i14).document_id));
                        } else if (lowerCase.contains(str3) || str3.contains(lowerCase)) {
                            arrayList4.add(Long.valueOf(arrayList6.get(i14).document_id));
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
                int i10 = 1;
                Object[] objArr = new Object[strArr.length + 1];
                objArr[0] = str;
                String str2 = "1 = 1";
                int i11 = 0;
                while (i11 < strArr.length) {
                    if (i11 == 0) {
                        str2 = "lang = ?";
                    } else {
                        str2 = str2 + " OR lang = ?";
                    }
                    SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT alias FROM emoji_keywords_info_v2 WHERE lang = ?", strArr[i11]);
                    if (queryFinalized.next()) {
                        strArr[i11] = queryFinalized.stringValue(0);
                    }
                    queryFinalized.dispose();
                    int i12 = i11 + 1;
                    objArr[i12] = strArr[i11];
                    i11 = i12;
                }
                sQLiteCursor = getMessagesStorage().getDatabase().executeFast("SELECT keyword FROM emoji_keywords_v2 WHERE emoji = ? AND (" + str2 + ")").query(objArr);
                ArrayList arrayList = new ArrayList();
                while (sQLiteCursor.next()) {
                    arrayList.add(sQLiteCursor.stringValue(0));
                }
                AndroidUtilities.runOnUIThread(new d2(callback, arrayList, i10));
                sQLiteCursor.dispose();
            } catch (Exception e7) {
                FileLog.e(e7);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
            }
        } catch (Throwable th2) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th2;
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
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (indexOf < 0) {
            indexOf = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int indexOf2 = arrayList.indexOf(keywordResult2.emoji);
        if (indexOf2 >= 0) {
            i10 = indexOf2;
        }
        if (indexOf < i10) {
            return -1;
        }
        if (indexOf > i10) {
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
            AndroidUtilities.runOnUIThread(new l7(keywordResultCallback, arrayList, str, 1));
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
        int i10 = 0;
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
            } catch (Exception e7) {
                e = e7;
            }
        }
        if (z16) {
            if (z10) {
                int[] iArr = new int[1];
                str2 = str;
                ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(str2, iArr);
                if (iArr[0] > 0) {
                    for (int i11 = 0; i11 < parseEmojis.size(); i11++) {
                        String charSequence = parseEmojis.get(i11).code.toString();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= arrayList2.size()) {
                                KeywordResult keywordResult = new KeywordResult();
                                keywordResult.emoji = charSequence;
                                keywordResult.keyword = "";
                                arrayList2.add(keywordResult);
                                break;
                            }
                            if (TextUtils.equals(arrayList2.get(i12).emoji, charSequence)) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
            } else {
                str2 = str;
            }
            String lowerCase = str2.toLowerCase();
            for (int i13 = 0; i13 < 2; i13++) {
                if (i13 == 1) {
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
            Collections.sort(arrayList2, new k7(arrayList, i10));
            if (!z12) {
                fillWithAnimatedEmoji(arrayList2, num, z13, z14, z15, new qk(countDownLatch, keywordResultCallback, arrayList2, str6, 16));
                return;
            }
            ArrayList<KeywordResult> arrayList3 = arrayList2;
            if (countDownLatch == null) {
                AndroidUtilities.runOnUIThread(new l7(keywordResultCallback, arrayList3, str6, i10));
                return;
            } else {
                keywordResultCallback.run(arrayList3, str6);
                countDownLatch.countDown();
                return;
            }
        }
        try {
            AndroidUtilities.runOnUIThread(new qk(this, strArr, keywordResultCallback, arrayList2, 15));
        } catch (Exception e10) {
            e = e10;
            arrayList2 = arrayList2;
            FileLog.e(e);
            String str62 = str4;
            Collections.sort(arrayList2, new k7(arrayList, i10));
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
    public /* synthetic */ void lambda$getMediaCount$132(long j3, long j10, int i10, int i11, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            if (vector.objects.isEmpty()) {
                return;
            }
            processLoadedMediaCount(((TLRPC.TL_messages_searchCounter) vector.objects.get(0)).count, j3, j10, i10, i11, false, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getMediaCountDatabase$139(long j3, long j10, int i10, int i11) {
        SQLiteCursor queryFinalized;
        int i12;
        int i13;
        try {
            if (j3 != 0) {
                SQLiteDatabase database = getMessagesStorage().getDatabase();
                Locale locale = Locale.US;
                queryFinalized = database.queryFinalized("SELECT count, old FROM media_counts_topics WHERE uid = " + j10 + " AND topic_id = " + j3 + " AND type = " + i10 + " LIMIT 1", new Object[0]);
            } else {
                SQLiteDatabase database2 = getMessagesStorage().getDatabase();
                Locale locale2 = Locale.US;
                queryFinalized = database2.queryFinalized("SELECT count, old FROM media_counts_v2 WHERE uid = " + j10 + " AND type = " + i10 + " LIMIT 1", new Object[0]);
            }
            if (queryFinalized.next()) {
                i12 = queryFinalized.intValue(0);
                i13 = queryFinalized.intValue(1);
            } else {
                i12 = -1;
                i13 = 0;
            }
            queryFinalized.dispose();
            if (i12 == -1 && DialogObject.isEncryptedDialog(j10)) {
                SQLiteDatabase database3 = getMessagesStorage().getDatabase();
                Locale locale3 = Locale.US;
                SQLiteCursor queryFinalized2 = database3.queryFinalized("SELECT COUNT(mid) FROM media_v4 WHERE uid = " + j10 + " AND type = " + i10 + " LIMIT 1", new Object[0]);
                if (queryFinalized2.next()) {
                    i12 = queryFinalized2.intValue(0);
                }
                queryFinalized2.dispose();
                if (i12 != -1) {
                    putMediaCountDatabase(j10, j3, i10, i12);
                }
            }
            processLoadedMediaCount(i12, j10, j3, i10, i11, true, i13);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getMediaCounts$127(long j3, long j10, int[] iArr) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mediaCountsDidLoad, Long.valueOf(j3), Long.valueOf(j10), iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getMediaCounts$128(long j3, long j10, int[] iArr) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mediaCountsDidLoad, Long.valueOf(j3), Long.valueOf(j10), iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getMediaCounts$129(int[] iArr, long j3, long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] < 0) {
                iArr[i11] = 0;
            }
        }
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            int size = vector.objects.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.TL_messages_searchCounter tL_messages_searchCounter = (TLRPC.TL_messages_searchCounter) vector.objects.get(i12);
                TLRPC.MessagesFilter messagesFilter = tL_messages_searchCounter.filter;
                if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPhotoVideo) {
                    i10 = 0;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterDocument) {
                    i10 = 1;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterRoundVoice) {
                    i10 = 2;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterUrl) {
                    i10 = 3;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterMusic) {
                    i10 = 4;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterGif) {
                    i10 = 5;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPhotos) {
                    i10 = 6;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterVideo) {
                    i10 = 7;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPoll) {
                    i10 = 8;
                }
                int i13 = tL_messages_searchCounter.count;
                iArr[i10] = i13;
                putMediaCountDatabase(j3, j10, i10, i13);
            }
        }
        AndroidUtilities.runOnUIThread(new m7(this, j3, j10, iArr, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getMediaCounts$130(long j3, long j10, int[] iArr) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mediaCountsDidLoad, Long.valueOf(j3), Long.valueOf(j10), iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fe A[Catch: Exception -> 0x0086, TryCatch #0 {Exception -> 0x0086, blocks: (B:3:0x000a, B:5:0x005f, B:7:0x00a7, B:9:0x00ad, B:14:0x00b5, B:20:0x00c4, B:24:0x00d0, B:26:0x00d4, B:28:0x0108, B:29:0x0111, B:32:0x010f, B:31:0x011b, B:35:0x0122, B:38:0x0133, B:40:0x0145, B:42:0x0151, B:43:0x0162, B:46:0x016e, B:48:0x0172, B:51:0x0204, B:52:0x0177, B:54:0x017b, B:57:0x0181, B:59:0x01f8, B:63:0x01fe, B:65:0x0202, B:69:0x0190, B:71:0x019d, B:73:0x01aa, B:76:0x01b8, B:79:0x01c6, B:82:0x01d4, B:85:0x01e3, B:86:0x01ee, B:88:0x0214, B:90:0x021c, B:92:0x023e, B:96:0x024a, B:98:0x0089), top: B:2:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$getMediaCounts$131(long j3, long j10, int i10) {
        SQLiteCursor queryFinalized;
        long j11 = j3;
        long j12 = j10;
        int i11 = 9;
        try {
            int[] iArr = new int[9];
            int i12 = 0;
            iArr[0] = -1;
            iArr[1] = -1;
            int i13 = 2;
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
            if (j11 != 0) {
                SQLiteDatabase database = getMessagesStorage().getDatabase();
                Locale locale = Locale.US;
                queryFinalized = database.queryFinalized("SELECT type, count, old FROM media_counts_topics WHERE uid = " + j12 + " AND topic_id = " + j11, new Object[0]);
            } else {
                SQLiteDatabase database2 = getMessagesStorage().getDatabase();
                Locale locale2 = Locale.US;
                queryFinalized = database2.queryFinalized("SELECT type, count, old FROM media_counts_v2 WHERE uid = " + j12, new Object[0]);
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
            if (DialogObject.isEncryptedDialog(j12)) {
                int i14 = 0;
                while (i14 < 9) {
                    if (iArr[i14] == -1) {
                        SQLiteDatabase database3 = getMessagesStorage().getDatabase();
                        Locale locale3 = Locale.US;
                        SQLiteCursor queryFinalized2 = database3.queryFinalized("SELECT COUNT(mid) FROM media_v4 WHERE uid = " + j12 + " AND type = " + i14 + " LIMIT 1", new Object[0]);
                        if (queryFinalized2.next()) {
                            iArr[i14] = queryFinalized2.intValue(0);
                        } else {
                            iArr[i14] = 0;
                        }
                        queryFinalized2.dispose();
                        putMediaCountDatabase(j12, j11, i14, iArr[i14]);
                    }
                    i14++;
                    j11 = j3;
                    j12 = j10;
                }
                AndroidUtilities.runOnUIThread(new m7(this, j10, j3, iArr, 1));
                return;
            }
            TLRPC.TL_messages_getSearchCounters tL_messages_getSearchCounters = new TLRPC.TL_messages_getSearchCounters();
            tL_messages_getSearchCounters.peer = getMessagesController().getInputPeer(j12);
            if (j11 != 0) {
                if (j12 == getUserConfig().getClientUserId()) {
                    tL_messages_getSearchCounters.saved_peer_id = getMessagesController().getInputPeer(j11);
                    tL_messages_getSearchCounters.flags |= 4;
                } else {
                    tL_messages_getSearchCounters.top_msg_id = (int) j11;
                    tL_messages_getSearchCounters.flags |= 1;
                }
            }
            int i15 = 0;
            boolean z10 = false;
            while (i15 < i11) {
                if (tL_messages_getSearchCounters.peer == null) {
                    iArr[i15] = i12;
                } else if (iArr[i15] == -1 || iArr3[i15] == 1) {
                    if (i15 == 0) {
                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPhotoVideo());
                    } else if (i15 == 1) {
                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterDocument());
                    } else if (i15 == i13) {
                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterRoundVoice());
                    } else if (i15 == 3) {
                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterUrl());
                    } else {
                        if (i15 == 4) {
                            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterMusic());
                        } else if (i15 == 6) {
                            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPhotos());
                        } else if (i15 == 7) {
                            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterVideo());
                        } else if (i15 == 8) {
                            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPoll());
                        } else {
                            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterGif());
                        }
                        if (iArr[i15] != -1) {
                            z10 = true;
                        } else if (iArr3[i15] == 1) {
                            iArr[i15] = -1;
                        }
                        i15++;
                        i13 = 2;
                        i11 = 9;
                        i12 = 0;
                    }
                    if (iArr[i15] != -1) {
                    }
                    i15++;
                    i13 = 2;
                    i11 = 9;
                    i12 = 0;
                }
                i15++;
                i13 = 2;
                i11 = 9;
                i12 = 0;
            }
            if (!tL_messages_getSearchCounters.filters.isEmpty()) {
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getSearchCounters, new z6(this, iArr, j12, j11, 1)), i10);
            }
            if (z10 && getConnectionsManager().getConnectionState() == 3) {
                return;
            }
            AndroidUtilities.runOnUIThread(new m7(this, j10, j3, iArr2, 2));
        } catch (Exception e7) {
            FileLog.e(e7);
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
        int i10 = 0;
        if (tL_messages_stickerSet == null) {
            if (z10) {
                this.loadingStickerSetsKeys.remove(str);
                return;
            } else {
                fetchStickerSetInternal(inputStickerSet, new p7(this, str, callback, i10));
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
        AndroidUtilities.runOnUIThread(new p8(this, getCachedStickerSetInternal(inputStickerSet.id, num), str, callback, z10, inputStickerSet, 0));
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
        int i10 = 1;
        if (tL_messages_stickerSet == null) {
            if (z10) {
                this.loadingStickerSetsKeys.remove(str);
                return;
            } else {
                fetchStickerSetInternal(inputStickerSet, new p7(this, str, callback, i10));
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
        AndroidUtilities.runOnUIThread(new p8(this, getCachedStickerSetInternal(inputStickerSet.short_name.toLowerCase(), num), str, callback, z10, inputStickerSet, 1));
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
        int i10 = messageEntity.offset;
        int i11 = messageEntity2.offset;
        if (i10 > i11) {
            return 1;
        }
        return i10 < i11 ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$increaseInlineRating$150(TLRPC.TL_topPeer tL_topPeer, TLRPC.TL_topPeer tL_topPeer2) {
        double d = tL_topPeer.rating;
        double d10 = tL_topPeer2.rating;
        if (d > d10) {
            return -1;
        }
        return d < d10 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$increasePeerRaiting$155(TLRPC.TL_topPeer tL_topPeer, TLRPC.TL_topPeer tL_topPeer2) {
        double d = tL_topPeer.rating;
        double d10 = tL_topPeer2.rating;
        if (d > d10) {
            return -1;
        }
        return d < d10 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$increasePeerRaiting$156(long j3, double d) {
        TLRPC.TL_topPeer tL_topPeer;
        int i10 = 0;
        while (true) {
            if (i10 >= this.hints.size()) {
                tL_topPeer = null;
                break;
            }
            tL_topPeer = this.hints.get(i10);
            if (tL_topPeer.peer.user_id == j3) {
                break;
            } else {
                i10++;
            }
        }
        if (tL_topPeer == null) {
            tL_topPeer = new TLRPC.TL_topPeer();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_topPeer.peer = tL_peerUser;
            tL_peerUser.user_id = j3;
            this.hints.add(tL_topPeer);
        }
        tL_topPeer.rating = Math.exp(d / getMessagesController().ratingDecay) + tL_topPeer.rating;
        Collections.sort(this.hints, new d(11));
        savePeer(j3, 0, tL_topPeer.rating);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadHints, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$increasePeerRaiting$157(final long j3) {
        int i10;
        double d = 0.0d;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            Locale locale = Locale.US;
            int i11 = 0;
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT MAX(mid), MAX(date) FROM messages_v2 WHERE uid = " + j3 + " AND out = 1", new Object[0]);
            if (queryFinalized.next()) {
                i11 = queryFinalized.intValue(0);
                i10 = queryFinalized.intValue(1);
            } else {
                i10 = 0;
            }
            queryFinalized.dispose();
            if (i11 > 0 && getUserConfig().ratingLoadTime != 0) {
                d = i10 - getUserConfig().ratingLoadTime;
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        final double d10 = d;
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.f9
            @Override // java.lang.Runnable
            public final void run() {
                MediaDataController.this.lambda$increasePeerRaiting$156(j3, d10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$increaseWebappRating$151(TLRPC.TL_topPeer tL_topPeer, TLRPC.TL_topPeer tL_topPeer2) {
        double d = tL_topPeer.rating;
        double d10 = tL_topPeer2.rating;
        if (d > d10) {
            return -1;
        }
        return d < d10 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadArchivedStickersCount$71(TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        if (tL_error == null) {
            TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers = (TLRPC.TL_messages_archivedStickers) tLObject;
            this.archivedStickersCount[i10] = tL_messages_archivedStickers.count;
            MessagesController.getNotificationsSettings(this.currentAccount).edit().putInt(i2.g.i(i10, "archivedStickersCount"), tL_messages_archivedStickers.count).commit();
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.archivedStickersCountDidLoad, Integer.valueOf(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadArchivedStickersCount$72(int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new h0(this, tL_error, tLObject, i10, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [org.telegram.tgnet.TLRPC$TL_attachMenuBots] */
    public /* synthetic */ void lambda$loadAttachMenuBots$3() {
        long j3;
        int i10;
        SQLiteCursor sQLiteCursor;
        int i11;
        TLRPC.TL_attachMenuBots tL_attachMenuBots;
        TLRPC.TL_attachMenuBots tL_attachMenuBots2;
        int i12;
        long j10 = 0;
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
                            j10 = queryFinalized.longValue(1);
                            j3 = j10;
                            tL_attachMenuBots2 = r1;
                            i12 = queryFinalized.intValue(2);
                        } else {
                            j3 = 0;
                            tL_attachMenuBots2 = null;
                            i12 = 0;
                        }
                        if (tL_attachMenuBots2 != null) {
                            try {
                                ArrayList<Long> arrayList = new ArrayList<>();
                                for (int i13 = 0; i13 < tL_attachMenuBots2.bots.size(); i13++) {
                                    arrayList.add(Long.valueOf(tL_attachMenuBots2.bots.get(i13).bot_id));
                                }
                                tL_attachMenuBots2.users.addAll(getMessagesStorage().getUsers(arrayList));
                            } catch (Exception e7) {
                                e = e7;
                                sQLiteCursor = tL_attachMenuBots2;
                                i10 = i12;
                                r1 = queryFinalized;
                                FileLog.e((Throwable) e, false);
                                if (r1 != null) {
                                    r1.dispose();
                                }
                                i11 = i10;
                                tL_attachMenuBots = sQLiteCursor;
                                processLoadedMenuBots(tL_attachMenuBots, j3, i11, true);
                            }
                        }
                        queryFinalized.dispose();
                        i11 = i12;
                        tL_attachMenuBots = tL_attachMenuBots2;
                    } catch (Throwable th2) {
                        th = th2;
                        r1 = queryFinalized;
                        if (r1 != null) {
                            r1.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    j3 = j10;
                    i10 = 0;
                    sQLiteCursor = r1;
                }
            } catch (Exception e11) {
                e = e11;
                j3 = 0;
                i10 = 0;
                sQLiteCursor = null;
            }
            processLoadedMenuBots(tL_attachMenuBots, j3, i11, true);
        } catch (Throwable th3) {
            th = th3;
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
        AndroidUtilities.runOnUIThread(new vj(this, tLObject, sharedPreferences, z10, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadBotInfo$197(Utilities.Callback callback, TL_bots.BotInfo botInfo, int i10) {
        if (callback != null) {
            callback.run(botInfo);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botInfoDidLoad, botInfo, Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadBotInfo$198(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadBotInfo$199(long j3, long j10, Utilities.Callback callback, int i10) {
        try {
            TL_bots.BotInfo loadBotInfoInternal = loadBotInfoInternal(j3, j10);
            if (loadBotInfoInternal != null) {
                AndroidUtilities.runOnUIThread(new h0(this, callback, loadBotInfoInternal, i10, 7));
            } else if (callback != null) {
                AndroidUtilities.runOnUIThread(new r7(2, callback));
            }
        } catch (Exception e7) {
            FileLog.e(e7);
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
            AndroidUtilities.runOnUIThread(new v6(this, message, topicKey));
        } catch (Exception e7) {
            FileLog.e(e7);
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
            AndroidUtilities.runOnUIThread(new i7(this, 16));
        } else {
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new i7(this, 17));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$loadFeaturedStickers$55(boolean z10) {
        ArrayList<TLRPC.StickerSetCovered> arrayList;
        long j3;
        int i10;
        boolean z11;
        ArrayList<TLRPC.StickerSetCovered> arrayList2;
        int i11;
        ArrayList<Long> arrayList3 = new ArrayList<>();
        SQLiteCursor sQLiteCursor = null;
        long j10 = 0;
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
                            for (int i12 = 0; i12 < readInt32; i12++) {
                                arrayList.add(TLRPC.StickerSetCovered.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                            }
                            byteBufferValue.reuse();
                            sQLiteCursor = arrayList;
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor = queryFinalized;
                            i10 = 0;
                            try {
                                FileLog.e(th);
                                if (sQLiteCursor != null) {
                                }
                                arrayList2 = arrayList;
                                j3 = j10;
                                z11 = false;
                                processLoadedFeaturedStickers(z10, arrayList2, arrayList3, z11, true, i10, j3);
                            } finally {
                            }
                        }
                    }
                    NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                    if (byteBufferValue2 != null) {
                        int readInt322 = byteBufferValue2.readInt32(false);
                        for (int i13 = 0; i13 < readInt322; i13++) {
                            arrayList3.add(Long.valueOf(byteBufferValue2.readInt64(false)));
                        }
                        byteBufferValue2.reuse();
                    }
                    i10 = queryFinalized.intValue(2);
                    try {
                        j10 = queryFinalized.longValue(3);
                        i11 = queryFinalized.intValue(4) == 1 ? 1 : 0;
                        r2 = i10;
                    } catch (Throwable th3) {
                        th = th3;
                        arrayList = sQLiteCursor;
                        sQLiteCursor = queryFinalized;
                        FileLog.e(th);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        arrayList2 = arrayList;
                        j3 = j10;
                        z11 = false;
                        processLoadedFeaturedStickers(z10, arrayList2, arrayList3, z11, true, i10, j3);
                    }
                } else {
                    i11 = 0;
                }
                queryFinalized.dispose();
                arrayList2 = sQLiteCursor;
                i10 = r2;
                j3 = j10;
                z11 = i11;
            } catch (Throwable th4) {
                th = th4;
                arrayList = sQLiteCursor;
            }
        } catch (Throwable th5) {
            th = th5;
            arrayList = null;
        }
        processLoadedFeaturedStickers(z10, arrayList2, arrayList3, z11, true, i10, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadFeaturedStickers$56(boolean z10, int i10) {
        this.loadingFeaturedStickers[z10 ? 1 : 0] = false;
        this.featuredStickersLoaded[z10 ? 1 : 0] = true;
        this.loadFeaturedDate[z10 ? 1 : 0] = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadFeaturedStickers$57(TLObject tLObject, boolean z10, long j3) {
        if (tLObject instanceof TLRPC.TL_messages_featuredStickers) {
            TLRPC.TL_messages_featuredStickers tL_messages_featuredStickers = (TLRPC.TL_messages_featuredStickers) tLObject;
            processLoadedFeaturedStickers(z10, tL_messages_featuredStickers.sets, tL_messages_featuredStickers.unread, tL_messages_featuredStickers.premium, false, (int) (System.currentTimeMillis() / 1000), tL_messages_featuredStickers.hash);
        } else {
            if (!(tLObject instanceof TLRPC.TL_messages_featuredStickersNotModified)) {
                processLoadedFeaturedStickers(z10, null, null, false, false, (int) (System.currentTimeMillis() / 1000), j3);
                return;
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            AndroidUtilities.runOnUIThread(new r8(this, z10, currentTimeMillis, 2));
            putFeaturedStickersToCache(z10, null, null, currentTimeMillis, j3, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadFeaturedStickers$58(boolean z10, long j3, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new t8(this, tLObject, z10, j3, 0));
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
            AndroidUtilities.runOnUIThread(new d7(this, tL_messages_stickerSet, 2));
        } catch (Throwable th2) {
            FileLog.e(th2);
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
            AndroidUtilities.runOnUIThread(new d7(this, (TLRPC.TL_messages_stickerSet) tLObject, 1));
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
            int i10 = 0;
            SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT did, type, rating FROM chat_hints WHERE 1 ORDER BY rating DESC", new Object[0]);
            while (queryFinalized.next()) {
                long longValue = queryFinalized.longValue(i10);
                if (longValue != clientUserId) {
                    int intValue = queryFinalized.intValue(1);
                    TLRPC.TL_topPeer tL_topPeer = new TLRPC.TL_topPeer();
                    long j3 = clientUserId;
                    tL_topPeer.rating = queryFinalized.doubleValue(2);
                    if (longValue > 0) {
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_topPeer.peer = tL_peerUser;
                        tL_peerUser.user_id = longValue;
                        arrayList7.add(Long.valueOf(longValue));
                    } else {
                        TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                        tL_topPeer.peer = tL_peerChat;
                        long j10 = -longValue;
                        tL_peerChat.chat_id = j10;
                        arrayList8.add(Long.valueOf(j10));
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
                    clientUserId = j3;
                    i10 = 0;
                }
            }
            queryFinalized.dispose();
            if (!arrayList7.isEmpty()) {
                getMessagesStorage().getUsersInternal(arrayList7, arrayList5);
            }
            if (!arrayList8.isEmpty()) {
                getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList8), arrayList6);
            }
            AndroidUtilities.runOnUIThread(new nl(this, arrayList5, arrayList6, arrayList, arrayList2, arrayList3, arrayList4, 1));
        } catch (Exception e7) {
            FileLog.e(e7);
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
            for (int i10 = 0; i10 < tL_contacts_topPeers.categories.size(); i10++) {
                TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i10);
                TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                int i11 = topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline ? 1 : topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp ? 2 : topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat ? 3 : 0;
                for (int i12 = 0; i12 < tL_topPeerCategoryPeers.peers.size(); i12++) {
                    TLRPC.TL_topPeer tL_topPeer = tL_topPeerCategoryPeers.peers.get(i12);
                    executeFast.requery();
                    executeFast.bindLong(1, MessageObject.getPeerId(tL_topPeer.peer));
                    executeFast.bindInteger(2, i11);
                    executeFast.bindDouble(3, tL_topPeer.rating);
                    executeFast.bindInteger(4, 0);
                    executeFast.step();
                }
            }
            executeFast.dispose();
            getMessagesStorage().getDatabase().commitTransaction();
            AndroidUtilities.runOnUIThread(new i7(this, 14));
        } catch (Exception e7) {
            FileLog.e(e7);
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
        for (int i10 = 0; i10 < tL_contacts_topPeers.categories.size(); i10++) {
            TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i10);
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
                int i11 = 0;
                while (true) {
                    if (i11 >= this.hints.size()) {
                        break;
                    }
                    if (this.hints.get(i11).peer.user_id == clientUserId) {
                        this.hints.remove(i11);
                        break;
                    }
                    i11++;
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
        getMessagesStorage().getStorageQueue().postRunnable(new b2(18, this, tL_contacts_topPeers));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadMedia$126(long j3, int i10, int i11, int i12, int i13, long j10, int i14, boolean z10, int i15, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            getMessagesController().removeDeletedMessagesFromArray(j3, messages_messages.messages);
            boolean z11 = false;
            if (i10 == 0 ? messages_messages.messages.size() == 0 : messages_messages.messages.size() <= 1) {
                z11 = true;
            }
            processLoadedMedia(messages_messages, j3, i11, i12, i10, i13, j10, 0, i14, z10, z11, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadMusic$141(long j3, ArrayList arrayList, ArrayList arrayList2) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.musicDidLoad, Long.valueOf(j3), arrayList, arrayList2);
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
    public /* synthetic */ void lambda$loadMusic$142(long j3, long j10, long j11) {
        MediaDataController mediaDataController;
        SQLiteCursor queryFinalized;
        ?? r12;
        long j12 = j10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (i10 < 2) {
            ArrayList arrayList3 = i10 == 0 ? arrayList : arrayList2;
            if (i10 == 0) {
                try {
                    if (DialogObject.isEncryptedDialog(j3)) {
                        SQLiteDatabase database = getMessagesStorage().getDatabase();
                        Locale locale = Locale.US;
                        queryFinalized = database.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j3 + " AND mid > " + j12 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                    } else {
                        SQLiteDatabase database2 = getMessagesStorage().getDatabase();
                        Locale locale2 = Locale.US;
                        queryFinalized = database2.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j3 + " AND mid < " + j12 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                    }
                } catch (Exception e7) {
                    e = e7;
                    mediaDataController = this;
                    FileLog.e(e);
                    AndroidUtilities.runOnUIThread(new bi.x7(mediaDataController, j3, arrayList, arrayList2, 9));
                }
            } else if (DialogObject.isEncryptedDialog(j3)) {
                SQLiteDatabase database3 = getMessagesStorage().getDatabase();
                Locale locale3 = Locale.US;
                r12 = 0;
                queryFinalized = database3.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j3 + " AND mid < " + j11 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                if (queryFinalized.next()) {
                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(r12);
                    if (byteBufferValue != 0) {
                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r12), r12);
                        TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                        byteBufferValue.reuse();
                        if (MessageObject.isMusicMessage(TLdeserialize)) {
                            try {
                                TLdeserialize.id = queryFinalized.intValue(1);
                                TLdeserialize.dialog_id = j3;
                                arrayList3.add(0, new MessageObject(mediaDataController.currentAccount, TLdeserialize, false, true));
                            } catch (Exception e10) {
                                e = e10;
                                FileLog.e(e);
                                AndroidUtilities.runOnUIThread(new bi.x7(mediaDataController, j3, arrayList, arrayList2, 9));
                            }
                            mediaDataController = this;
                        }
                    }
                } else {
                    queryFinalized.dispose();
                    i10++;
                    j12 = j10;
                }
            } else {
                SQLiteDatabase database4 = getMessagesStorage().getDatabase();
                Locale locale4 = Locale.US;
                queryFinalized = database4.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j3 + " AND mid > " + j11 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
            }
            r12 = 0;
            queryFinalized = queryFinalized;
            if (queryFinalized.next()) {
            }
        }
        mediaDataController = this;
        AndroidUtilities.runOnUIThread(new bi.x7(mediaDataController, j3, arrayList, arrayList2, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadPinnedMessageInternal$164(long j3, long j10, TLRPC.TL_channels_getMessages tL_channels_getMessages, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            removeEmptyMessages(messages_messages.messages);
            if (!messages_messages.messages.isEmpty()) {
                getMessagesController().getChat(Long.valueOf(j3));
                ImageLoader.saveMessagesThumbs(messages_messages.messages);
                broadcastPinnedMessage(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                savePinnedMessages(j10, messages_messages.messages);
                return;
            }
        }
        getMessagesStorage().updatePinnedMessages(j10, tL_channels_getMessages.id, false, -1, 0, false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadPinnedMessageInternal$165(long j3, TLRPC.TL_messages_getMessages tL_messages_getMessages, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            removeEmptyMessages(messages_messages.messages);
            if (!messages_messages.messages.isEmpty()) {
                ImageLoader.saveMessagesThumbs(messages_messages.messages);
                broadcastPinnedMessage(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                savePinnedMessages(j3, messages_messages.messages);
                return;
            }
        }
        getMessagesStorage().updatePinnedMessages(j3, tL_messages_getMessages.id, false, -1, 0, false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadPinnedMessages$161(long j3) {
        this.loadingPinnedMessages.l(j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadPinnedMessages$162(int i10, TLRPC.TL_messages_search tL_messages_search, long j3, int i11, TLObject tLObject, TLRPC.TL_error tL_error) {
        int i12;
        boolean z10;
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<Integer, MessageObject> hashMap = new HashMap<>();
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            a0.i iVar = new a0.i();
            for (int i13 = 0; i13 < messages_messages.users.size(); i13++) {
                TLRPC.User user = messages_messages.users.get(i13);
                iVar.k(user, user.id);
            }
            a0.i iVar2 = new a0.i();
            for (int i14 = 0; i14 < messages_messages.chats.size(); i14++) {
                TLRPC.Chat chat = messages_messages.chats.get(i14);
                iVar2.k(chat, chat.id);
            }
            getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            getMessagesController().putUsers(messages_messages.users, false);
            getMessagesController().putChats(messages_messages.chats, false);
            int size = messages_messages.messages.size();
            for (int i15 = 0; i15 < size; i15++) {
                TLRPC.Message message = messages_messages.messages.get(i15);
                if (!(message instanceof TLRPC.TL_messageService) && !(message instanceof TLRPC.TL_messageEmpty)) {
                    arrayList.add(Integer.valueOf(message.id));
                    hashMap.put(Integer.valueOf(message.id), new MessageObject(this.currentAccount, message, iVar, iVar2, false, false));
                }
            }
            if (i10 != 0 && arrayList.isEmpty()) {
                arrayList.add(Integer.valueOf(i10));
            }
            r3 = messages_messages.messages.size() >= tL_messages_search.limit ? 0 : 1;
            i12 = Math.max(messages_messages.count, messages_messages.messages.size());
            z10 = r3;
        } else {
            if (i10 != 0) {
                arrayList.add(Integer.valueOf(i10));
            } else {
                r3 = 0;
            }
            i12 = r3;
            z10 = false;
        }
        getMessagesStorage().updatePinnedMessages(j3, arrayList, true, i12, i11, z10, hashMap);
        AndroidUtilities.runOnUIThread(new c7(this, j3, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadPinnedMessages$163(long j3, long j10, ArrayList arrayList) {
        loadPinnedMessageInternal(j3, j10, arrayList, false);
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
        int i10 = 0;
        try {
            try {
                queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data, date FROM premium_promo", new Object[0]);
            } catch (Exception e7) {
                e = e7;
                tL_help_premiumPromo = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    tL_help_premiumPromo2 = TLRPC.TL_help_premiumPromo.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), true);
                    byteBufferValue.reuse();
                }
                i10 = queryFinalized.intValue(1);
            }
            queryFinalized.dispose();
        } catch (Exception e10) {
            e = e10;
            tL_help_premiumPromo = tL_help_premiumPromo2;
            sQLiteCursor = queryFinalized;
            FileLog.e((Throwable) e, false);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            tL_help_premiumPromo2 = tL_help_premiumPromo;
            processLoadedPremiumPromo(tL_help_premiumPromo2, i10, true);
        } catch (Throwable th3) {
            th = th3;
            sQLiteCursor = queryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
        processLoadedPremiumPromo(tL_help_premiumPromo2, i10, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadPremiumPromo$8(TLObject tLObject, TLRPC.TL_error tL_error) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (tLObject instanceof TLRPC.TL_help_premiumPromo) {
            processLoadedPremiumPromo((TLRPC.TL_help_premiumPromo) tLObject, currentTimeMillis, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadReactions$11(List list, int i10, int i11) {
        processLoadedReactions(list, i10, i11, true);
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
        int i10;
        int i11;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor sQLiteCursor3;
        int i12;
        ArrayList arrayList;
        int i13;
        SQLiteCursor sQLiteCursor4 = null;
        int i14 = 0;
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
                                for (int i15 = 0; i15 < readInt32; i15++) {
                                    try {
                                        arrayList.add(TLRPC.TL_availableReaction.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), true));
                                    } catch (Exception e7) {
                                        e = e7;
                                        sQLiteCursor4 = queryFinalized;
                                        sQLiteCursor = arrayList;
                                        i12 = 0;
                                        sQLiteCursor3 = sQLiteCursor;
                                        FileLog.e((Throwable) e, false);
                                        if (sQLiteCursor4 != null) {
                                            sQLiteCursor4.dispose();
                                        }
                                        i11 = i12;
                                        sQLiteCursor2 = sQLiteCursor3;
                                        i10 = 0;
                                        AndroidUtilities.runOnUIThread(new x4(this, sQLiteCursor2, i11, i10, 2));
                                    }
                                }
                                byteBufferValue.reuse();
                                sQLiteCursor4 = arrayList;
                            }
                            i12 = queryFinalized.intValue(1);
                            try {
                                i13 = queryFinalized.intValue(2);
                                i14 = i12;
                            } catch (Exception e10) {
                                e = e10;
                                sQLiteCursor3 = sQLiteCursor4;
                                sQLiteCursor4 = queryFinalized;
                                FileLog.e((Throwable) e, false);
                                if (sQLiteCursor4 != null) {
                                }
                                i11 = i12;
                                sQLiteCursor2 = sQLiteCursor3;
                                i10 = 0;
                                AndroidUtilities.runOnUIThread(new x4(this, sQLiteCursor2, i11, i10, 2));
                            }
                        } else {
                            i13 = 0;
                        }
                        queryFinalized.dispose();
                        i10 = i13;
                        sQLiteCursor2 = sQLiteCursor4;
                        i11 = i14;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor4 = queryFinalized;
                        if (sQLiteCursor4 != null) {
                            sQLiteCursor4.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    arrayList = sQLiteCursor4;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e12) {
            e = e12;
            sQLiteCursor = null;
        }
        AndroidUtilities.runOnUIThread(new x4(this, sQLiteCursor2, i11, i10, 2));
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
        AndroidUtilities.runOnUIThread(new e7(this, tLObject, 1));
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
        AndroidUtilities.runOnUIThread(new w6(this, tL_error, tLObject, sharedPreferences, zArr, 1));
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
        AndroidUtilities.runOnUIThread(new w6(this, tL_error, tLObject, sharedPreferences, zArr, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$loadRecents$48(boolean z10, ArrayList arrayList, int i10) {
        if (z10) {
            this.recentGifs = arrayList;
            this.loadingRecentGifs = false;
            this.recentGifsLoaded = true;
        } else {
            this.recentStickers[i10] = arrayList;
            this.loadingRecentStickers[i10] = false;
            this.recentStickersLoaded[i10] = true;
        }
        if (i10 == 3) {
            preloadNextGreetingsSticker();
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentDocumentsDidLoad, Boolean.valueOf(z10), Integer.valueOf(i10));
        loadRecents(i10, z10, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadRecents$49(boolean z10, int i10) {
        int i11;
        NativeByteBuffer byteBufferValue;
        if (z10) {
            i11 = 2;
        } else {
            i11 = 3;
            if (i10 != 0) {
                if (i10 == 1) {
                    i11 = 4;
                } else if (i10 == 3) {
                    i11 = 6;
                } else {
                    i11 = 7;
                    if (i10 != 5) {
                        i11 = i10 == 7 ? 8 : 5;
                    }
                }
            }
        }
        try {
            SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT document FROM web_recent_v3 WHERE type = " + i11 + " ORDER BY date DESC", new Object[0]);
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
            AndroidUtilities.runOnUIThread(new i9(this, z10, arrayList, i10));
        } catch (Throwable th2) {
            getMessagesStorage().checkSQLException(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadRecents$50(int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        processLoadedRecentDocuments(i10, tLObject instanceof TLRPC.TL_messages_savedGifs ? ((TLRPC.TL_messages_savedGifs) tLObject).gifs : null, true, 0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadRecents$51(int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList<TLRPC.Document> arrayList;
        if (i10 == 3 || i10 == 7) {
            if (tLObject instanceof TLRPC.TL_messages_stickers) {
                arrayList = ((TLRPC.TL_messages_stickers) tLObject).stickers;
            }
            arrayList = null;
        } else if (i10 == 2) {
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
        processLoadedRecentDocuments(i10, arrayList, false, 0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadRepliesOfDraftReplies$0(ArrayList arrayList) {
        try {
            ArrayList<Long> arrayList2 = new ArrayList<>();
            ArrayList<Long> arrayList3 = new ArrayList<>();
            a0.i iVar = new a0.i();
            a0.i iVar2 = new a0.i();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                try {
                    MessagesStorage.addReplyMessages((TLRPC.Message) arrayList.get(i10), iVar, iVar2);
                } catch (Exception e7) {
                    getMessagesStorage().checkSQLException(e7);
                }
            }
            getMessagesStorage().loadReplyMessages(iVar, iVar2, arrayList2, arrayList3, 0);
        } catch (Exception e10) {
            FileLog.e(e10);
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
        AndroidUtilities.runOnUIThread(new f8(this, tLObject, sharedPreferences, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadReplyMessagesForMessages$170(Timer.Task task, long j3, ArrayList arrayList) {
        Timer.done(task);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.replyMessagesDidLoad, Long.valueOf(j3), arrayList, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadReplyMessagesForMessages$171(Timer.Task task, Timer timer, ArrayList arrayList, long j3, a0.i iVar, Runnable runnable) {
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
                    TLdeserialize.dialog_id = j3;
                    long longValue = queryFinalized.longValue(3);
                    ArrayList arrayList3 = (ArrayList) iVar.f(longValue);
                    iVar.l(longValue);
                    if (arrayList3 != null) {
                        MessageObject messageObject = new MessageObject(this.currentAccount, TLdeserialize, false, false);
                        arrayList2.add(messageObject);
                        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                            MessageObject messageObject2 = (MessageObject) arrayList3.get(i10);
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
            if (iVar.m() != 0) {
                for (int i11 = 0; i11 < iVar.m(); i11++) {
                    ArrayList arrayList4 = (ArrayList) iVar.n(i11);
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        TLRPC.MessageReplyHeader messageReplyHeader2 = ((MessageObject) arrayList4.get(i12)).messageOwner.reply_to;
                        if (messageReplyHeader2 != null) {
                            messageReplyHeader2.reply_to_random_id = 0L;
                        }
                    }
                }
            }
            Timer.done(start);
            AndroidUtilities.runOnUIThread(new bi.x7(this, Timer.start(timer, "loadReplyMessagesForMessages (encrypted) runOnUIThread: posting notification"), j3, arrayList2, 8));
            if (runnable != null) {
                runnable.run();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
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
    public /* synthetic */ void lambda$loadReplyMessagesForMessages$173(TLRPC.TL_error tL_error, TLRPC.messages_Messages messages_messages, long j3, long j10, a0.i iVar, boolean z10, TLObject tLObject, TLRPC.TL_error tL_error2) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
            messages_messages.messages.addAll(messages_messages2.messages);
            messages_messages.users.addAll(messages_messages2.users);
            messages_messages.chats.addAll(messages_messages2.chats);
            for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                TLRPC.Message message = messages_messages.messages.get(i10);
                if (message.dialog_id == 0) {
                    message.dialog_id = j3;
                }
            }
            MessageObject.fixMessagePeer(messages_messages.messages, j10);
            ImageLoader.saveMessagesThumbs(messages_messages.messages);
            broadcastReplyMessages(messages_messages.messages, iVar, messages_messages.users, messages_messages.chats, j3, false);
            getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            saveReplyMessages(iVar, messages_messages.messages, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$loadReplyMessagesForMessages$174(Timer.Task task, TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages, final long j3, final long j10, final a0.i iVar, final boolean z10, Timer timer, AtomicInteger atomicInteger, Runnable runnable, TLObject tLObject, final TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_getMessages tL_messages_getMessages;
        Timer.done(task);
        if (tL_error == null) {
            final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int i10 = 0;
            while (i10 < messages_messages.messages.size()) {
                if (messages_messages.messages.get(i10) instanceof TLRPC.TL_messageEmpty) {
                    messages_messages.messages.remove(i10);
                    i10--;
                }
                i10++;
            }
            if (messages_messages.messages.size() < tL_messages_getScheduledMessages.id.size()) {
                if (j3 != 0) {
                    TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                    tL_channels_getMessages.channel = getMessagesController().getInputChannel(j3);
                    tL_channels_getMessages.id = tL_messages_getScheduledMessages.id;
                    tL_messages_getMessages = tL_channels_getMessages;
                } else {
                    TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages2.id = tL_messages_getScheduledMessages.id;
                    tL_messages_getMessages = tL_messages_getMessages2;
                }
                getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate() { // from class: org.telegram.messenger.k8
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                        MediaDataController.this.lambda$loadReplyMessagesForMessages$173(tL_error, messages_messages, j10, j3, iVar, z10, tLObject2, tL_error2);
                    }
                });
            } else {
                for (int i11 = 0; i11 < messages_messages.messages.size(); i11++) {
                    TLRPC.Message message = messages_messages.messages.get(i11);
                    if (message.dialog_id == 0) {
                        message.dialog_id = j10;
                    }
                }
                MessageObject.fixMessagePeer(messages_messages.messages, j3);
                ImageLoader.saveMessagesThumbs(messages_messages.messages);
                broadcastReplyMessages(messages_messages.messages, iVar, messages_messages.users, messages_messages.chats, j10, false);
                getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                saveReplyMessages(iVar, messages_messages.messages, z10);
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
    public /* synthetic */ void lambda$loadReplyMessagesForMessages$175(Timer.Task task, long j3, long j10, a0.i iVar, boolean z10, Timer timer, AtomicInteger atomicInteger, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        Timer.done(task);
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                TLRPC.Message message = messages_messages.messages.get(i10);
                if (message.dialog_id == 0) {
                    message.dialog_id = j3;
                }
            }
            MessageObject.fixMessagePeer(messages_messages.messages, j10);
            ImageLoader.saveMessagesThumbs(messages_messages.messages);
            broadcastReplyMessages(messages_messages.messages, iVar, messages_messages.users, messages_messages.chats, j3, false);
            getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            saveReplyMessages(iVar, messages_messages.messages, z10);
        } else {
            Timer.log(timer, "channels.getMessages error: " + tL_error.code + " " + tL_error.text);
        }
        if (atomicInteger.decrementAndGet() != 0 || runnable == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadReplyMessagesForMessages$176(Timer.Task task, long j3, a0.i iVar, boolean z10, Timer timer, AtomicInteger atomicInteger, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        Timer.done(task);
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                TLRPC.Message message = messages_messages.messages.get(i10);
                if (message.dialog_id == 0) {
                    message.dialog_id = j3;
                }
            }
            ImageLoader.saveMessagesThumbs(messages_messages.messages);
            broadcastReplyMessages(messages_messages.messages, iVar, messages_messages.users, messages_messages.chats, j3, false);
            getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            saveReplyMessages(iVar, messages_messages.messages, z10);
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
    public void lambda$loadReplyMessagesForMessages$177(Timer.Task task, a0.i iVar, final AtomicInteger atomicInteger, final Runnable runnable, int i10, final Timer timer, final a0.i iVar2, a0.i iVar3, final boolean z10, final long j3) {
        int i11;
        int i12;
        int i13;
        ArrayList<TL_ephemeral.EphemeralMessage> ephemeralMessagesInternal;
        int i14;
        int i15;
        ?? r82;
        SQLiteCursor sQLiteCursor;
        String str;
        String str2;
        a0.i iVar4 = iVar2;
        a0.i iVar5 = iVar3;
        Timer.done(task);
        try {
            getMessagesController().getStoriesController().k.d(iVar, new b2(19, atomicInteger, runnable), i10, true, timer);
            Timer timer2 = timer;
            if (iVar4.i()) {
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
            int m10 = iVar4.m();
            int i16 = 0;
            while (true) {
                String str3 = ",";
                if (i16 >= m10) {
                    break;
                }
                Timer.Task task2 = start;
                long j10 = iVar4.j(i16);
                ArrayList arrayList6 = (ArrayList) iVar5.f(-j10);
                if (arrayList6 == null) {
                    i12 = m10;
                    i13 = i16;
                } else {
                    i12 = m10;
                    int i17 = 0;
                    while (i17 < 2) {
                        if (i17 == 1 && !z10) {
                            i14 = i16;
                            str = str3;
                            i15 = i17;
                        } else if (i17 == 1) {
                            SQLiteDatabase database = getMessagesStorage().getDatabase();
                            Locale locale = Locale.US;
                            i14 = i16;
                            String join = TextUtils.join(str3, arrayList6);
                            StringBuilder sb2 = new StringBuilder();
                            i15 = i17;
                            sb2.append("SELECT data, mid, date, uid FROM scheduled_messages_v2 WHERE mid IN(");
                            sb2.append(join);
                            sb2.append(") AND uid = ");
                            sb2.append(j3);
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
                                    TLdeserialize.dialog_id = j3;
                                    MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize, arrayList4, arrayList5, null);
                                    arrayList.add(TLdeserialize);
                                    TLRPC.Peer peer = TLdeserialize.peer_id;
                                    long j11 = peer != null ? peer.channel_id : 0L;
                                    ArrayList arrayList7 = (ArrayList) iVar5.f(j11);
                                    if (arrayList7 != null) {
                                        arrayList7.remove(Integer.valueOf(TLdeserialize.id));
                                        if (arrayList7.isEmpty()) {
                                            iVar5.l(j11);
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
                            i14 = i16;
                            i15 = i17;
                            SQLiteDatabase database2 = getMessagesStorage().getDatabase();
                            Locale locale2 = Locale.US;
                            r82 = 0;
                            sQLiteCursor = database2.queryFinalized("SELECT data, mid, date, uid FROM messages_v2 WHERE mid IN(" + TextUtils.join(str3, arrayList6) + ") AND uid = " + j3, new Object[0]);
                            if (sQLiteCursor.next()) {
                            }
                        }
                        i17 = i15 + 1;
                        str3 = str;
                        i16 = i14;
                    }
                    i13 = i16;
                    ArrayList<Integer> arrayList8 = new ArrayList<>();
                    int size = arrayList6.size();
                    int i18 = 0;
                    while (i18 < size) {
                        Object obj = arrayList6.get(i18);
                        i18++;
                        int intValue = ((Integer) obj).intValue();
                        if (MessageObject.isEphemeralMessageId(intValue)) {
                            arrayList8.add(Integer.valueOf(MessageObject.ephemeralMessageIdUnpack(intValue)));
                        }
                    }
                    if (!arrayList8.isEmpty() && (ephemeralMessagesInternal = getMessagesStorage().getEphemeralMessagesInternal(j3, arrayList8)) != null) {
                        int size2 = ephemeralMessagesInternal.size();
                        int i19 = 0;
                        while (i19 < size2) {
                            TL_ephemeral.EphemeralMessage ephemeralMessage = ephemeralMessagesInternal.get(i19);
                            i19++;
                            TLRPC.Message b10 = yf.u.b(ephemeralMessage);
                            MessagesStorage.addUsersAndChatsFromMessage(b10, arrayList4, arrayList5, null);
                            arrayList.add(b10);
                        }
                    }
                }
                i16 = i13 + 1;
                start = task2;
                iVar4 = iVar2;
                m10 = i12;
            }
            Timer.Task task3 = start;
            if (!arrayList4.isEmpty()) {
                getMessagesStorage().getUsersInternal(arrayList4, arrayList2);
            }
            if (!arrayList5.isEmpty()) {
                getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList5), arrayList3);
            }
            final long j12 = j3;
            broadcastReplyMessages(arrayList, iVar2, arrayList2, arrayList3, j12, true);
            if (iVar5.i()) {
                Timer.done(task3);
                if (atomicInteger.decrementAndGet() != 0 || runnable == null) {
                    return;
                }
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
            Timer.done(task3);
            int m11 = iVar5.m();
            int i20 = 0;
            while (i20 < m11) {
                final long j13 = iVar5.j(i20);
                if (z10) {
                    final Timer.Task start2 = Timer.start(timer2, "loadReplyMessagesForMessages: load scheduled");
                    final TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = getMessagesController().getInputPeer(j12);
                    tL_messages_getScheduledMessages.id = (ArrayList) iVar5.n(i20);
                    i11 = m11;
                    int sendRequest = getConnectionsManager().sendRequest(tL_messages_getScheduledMessages, new RequestDelegate() { // from class: org.telegram.messenger.q7
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            MediaDataController.this.lambda$loadReplyMessagesForMessages$174(start2, tL_messages_getScheduledMessages, j13, j12, iVar2, z10, timer, atomicInteger, runnable, tLObject, tL_error);
                        }
                    });
                    if (i10 != 0) {
                        getConnectionsManager().bindRequestToGuid(sendRequest, i10);
                    }
                } else {
                    Timer timer3 = timer2;
                    i11 = m11;
                    if (j13 != 0) {
                        final Timer.Task start3 = Timer.start(timer3, "loadReplyMessagesForMessages: load channel messages");
                        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                        tL_channels_getMessages.channel = getMessagesController().getInputChannel(j13);
                        tL_channels_getMessages.id = (ArrayList) iVar5.n(i20);
                        int sendRequest2 = getConnectionsManager().sendRequest(tL_channels_getMessages, new RequestDelegate() { // from class: org.telegram.messenger.w7
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                MediaDataController.this.lambda$loadReplyMessagesForMessages$175(start3, j3, j13, iVar2, z10, timer, atomicInteger, runnable, tLObject, tL_error);
                            }
                        });
                        if (i10 != 0) {
                            getConnectionsManager().bindRequestToGuid(sendRequest2, i10);
                        }
                        iVar5 = iVar3;
                    } else {
                        Timer.Task start4 = Timer.start(timer3, "loadReplyMessagesForMessages: load messages");
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        iVar5 = iVar3;
                        tL_messages_getMessages.id = (ArrayList) iVar5.n(i20);
                        int sendRequest3 = getConnectionsManager().sendRequest(tL_messages_getMessages, new bi.g9(this, start4, j3, iVar2, z10, timer3, atomicInteger, runnable));
                        if (i10 != 0) {
                            getConnectionsManager().bindRequestToGuid(sendRequest3, i10);
                        }
                    }
                }
                i20++;
                m11 = i11;
                timer2 = timer;
                j12 = j3;
            }
        } catch (Exception e7) {
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
            FileLog.e(e7);
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
        AndroidUtilities.runOnUIThread(new f8(this, tLObject, sharedPreferences, 0));
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
        AndroidUtilities.runOnUIThread(new qk((BaseController) this, tL_error, (Object) tLObject, (Object) sharedPreferences, 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadStickers$100(TLObject tLObject, int i10, Utilities.Callback callback, long j3) {
        if (tLObject instanceof TLRPC.TL_messages_allStickers) {
            processLoadStickersResponse(i10, (TLRPC.TL_messages_allStickers) tLObject, new r7(0, callback));
        } else {
            processLoadedStickers(i10, null, false, (int) (System.currentTimeMillis() / 1000), j3, new r7(1, callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadStickers$101(int i10, Utilities.Callback callback, long j3, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new bi.u7(this, tLObject, i10, callback, j3, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadStickers$91(int i10, boolean z10, Utilities.Callback callback) {
        loadStickers(i10, false, z10, false, callback);
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
    public /* synthetic */ void lambda$loadStickers$93(int i10, Utilities.Callback callback) {
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList = new ArrayList<>();
        int i11 = 0;
        long j3 = 0;
        SQLiteCursor sQLiteCursor = null;
        try {
            sQLiteCursor = getMessagesStorage().getDatabase().queryFinalized("SELECT data, date, hash FROM stickers_v2 WHERE id = " + (i10 + 1), new Object[0]);
            if (sQLiteCursor.next()) {
                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                if (byteBufferValue != null) {
                    int readInt32 = byteBufferValue.readInt32(false);
                    for (int i12 = 0; i12 < readInt32; i12++) {
                        arrayList.add(TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                    }
                    byteBufferValue.reuse();
                }
                i11 = sQLiteCursor.intValue(1);
                j3 = calcStickersHash(arrayList);
            }
        } catch (Throwable th2) {
            try {
                FileLog.e(th2);
            } finally {
            }
        }
        sQLiteCursor.dispose();
        processLoadedStickers(i10, arrayList, true, i11, j3, new d2(callback, arrayList, 2));
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
    public /* synthetic */ void lambda$loadStickers$97(int i10, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.TL_messages_stickerSet)) {
            processLoadedStickers(i10, null, false, (int) (System.currentTimeMillis() / 1000), 0L, new r7(5, callback));
            return;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList = new ArrayList<>();
        arrayList.add((TLRPC.TL_messages_stickerSet) tLObject);
        processLoadedStickers(i10, arrayList, false, (int) (System.currentTimeMillis() / 1000), calcStickersHash(arrayList), new r7(4, callback));
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
        int i10;
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor = null;
        r1 = null;
        r1 = null;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = null;
        int i11 = 0;
        try {
            queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data, date FROM stickers_dice WHERE emoji = ?", str);
        } catch (Throwable th2) {
            th = th2;
            tL_messages_stickerSet = null;
        }
        try {
            if (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    tL_messages_stickerSet3 = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    byteBufferValue.reuse();
                }
                i11 = queryFinalized.intValue(1);
            }
            queryFinalized.dispose();
            tL_messages_stickerSet2 = tL_messages_stickerSet3;
            i10 = i11;
        } catch (Throwable th3) {
            th = th3;
            tL_messages_stickerSet = tL_messages_stickerSet3;
            sQLiteCursor = queryFinalized;
            try {
                FileLog.e(th);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                i10 = 0;
                processLoadedDiceStickers(str, z10, tL_messages_stickerSet2, true, i10);
            } finally {
            }
        }
        processLoadedDiceStickers(str, z10, tL_messages_stickerSet2, true, i10);
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
        AndroidUtilities.runOnUIThread(new di.u1((Object) this, (Object) tL_error, tLObject, (Object) str, z10, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$markFeaturedStickersByIdAsRead$67(boolean z10, long j3) {
        this.unreadStickerSets[z10 ? 1 : 0].remove(Long.valueOf(j3));
        this.readingStickerSets[z10 ? 1 : 0].remove(Long.valueOf(j3));
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
        AndroidUtilities.runOnUIThread(new z8(this, tL_error, tLObject, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadStickersResponse$73(TLObject tLObject, ArrayList arrayList, int i10, a0.i iVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i11) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
        arrayList.set(i10, tL_messages_stickerSet);
        iVar.k(tL_messages_stickerSet, stickerSet.id);
        if (iVar.m() == tL_messages_allStickers.sets.size()) {
            int i12 = 0;
            while (i12 < arrayList.size()) {
                if (arrayList.get(i12) == null) {
                    arrayList.remove(i12);
                    i12--;
                }
                i12++;
            }
            processLoadedStickers(i11, arrayList, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadStickersResponse$74(ArrayList arrayList, int i10, a0.i iVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i11, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new hg.s(this, tLObject, arrayList, i10, iVar, stickerSet, tL_messages_allStickers, i11));
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
    public /* synthetic */ void lambda$processLoadedDiceStickers$89(boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, String str, boolean z11) {
        if (z10) {
            if (tL_messages_stickerSet == null || Math.abs((System.currentTimeMillis() / 1000) - i10) >= 86400) {
                AndroidUtilities.runOnUIThread(new i8(this, str, z11, 0), (tL_messages_stickerSet != null || z10) ? 0L : 1000L);
                if (tL_messages_stickerSet == null) {
                    return;
                }
            }
        }
        if (tL_messages_stickerSet != null) {
            if (!z10) {
                putDiceStickersToCache(str, tL_messages_stickerSet, i10);
            }
            AndroidUtilities.runOnUIThread(new f0(this, str, tL_messages_stickerSet, 27));
        } else {
            if (z10) {
                return;
            }
            putDiceStickersToCache(str, null, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedFeaturedStickers$59(boolean z10) {
        this.loadingFeaturedStickers[z10 ? 1 : 0] = false;
        this.featuredStickersLoaded[z10 ? 1 : 0] = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedFeaturedStickers$60(ArrayList arrayList, long j3, boolean z10) {
        if (arrayList != null && j3 != 0) {
            this.loadFeaturedHash[z10 ? 1 : 0] = j3;
        }
        this.loadingFeaturedStickers[z10 ? 1 : 0] = false;
        loadFeaturedStickers(z10, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$processLoadedFeaturedStickers$61(boolean z10, ArrayList arrayList, a0.i iVar, ArrayList arrayList2, long j3, int i10, boolean z11) {
        this.unreadStickerSets[z10 ? 1 : 0] = arrayList;
        this.featuredStickerSetsById[z10 ? 1 : 0] = iVar;
        this.featuredStickerSets[z10 ? 1 : 0] = arrayList2;
        this.loadFeaturedHash[z10 ? 1 : 0] = j3;
        this.loadFeaturedDate[z10 ? 1 : 0] = i10;
        this.loadFeaturedPremium = z11;
        loadStickers(z10 ? 6 : 3, true, false);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(z10 ? NotificationCenter.featuredEmojiDidLoad : NotificationCenter.featuredStickersDidLoad, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedFeaturedStickers$62(boolean z10, int i10) {
        this.loadFeaturedDate[z10 ? 1 : 0] = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedFeaturedStickers$63(boolean z10, ArrayList arrayList, final int i10, final long j3, final boolean z11, final ArrayList arrayList2, final boolean z12) {
        long j10 = 0;
        if ((z10 && (arrayList == null || Math.abs((System.currentTimeMillis() / 1000) - i10) >= 3600)) || (!z10 && arrayList == null && j3 == 0)) {
            t8 t8Var = new t8(this, arrayList, j3, z11);
            if (arrayList == null && !z10) {
                j10 = 1000;
            }
            AndroidUtilities.runOnUIThread(t8Var, j10);
            if (arrayList == null) {
                return;
            }
        }
        if (arrayList == null) {
            AndroidUtilities.runOnUIThread(new r8(this, z11, i10, 1));
            putFeaturedStickersToCache(z11, null, null, i10, 0L, z12);
            return;
        }
        try {
            final ArrayList<TLRPC.StickerSetCovered> arrayList3 = new ArrayList<>();
            final a0.i iVar = new a0.i();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i11);
                arrayList3.add(stickerSetCovered);
                iVar.k(stickerSetCovered, stickerSetCovered.set.id);
            }
            if (!z10) {
                putFeaturedStickersToCache(z11, arrayList3, arrayList2, i10, j3, z12);
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.w8
                @Override // java.lang.Runnable
                public final void run() {
                    MediaDataController.this.lambda$processLoadedFeaturedStickers$61(z11, arrayList2, iVar, arrayList3, j3, i10, z12);
                }
            });
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedMedia$133(TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14) {
        int i15 = messages_messages.count;
        getMessagesController().putUsers(messages_messages.users, i10 != 0);
        getMessagesController().putChats(messages_messages.chats, i10 != 0);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mediaDidLoad, Long.valueOf(j3), Integer.valueOf(i15), arrayList, Integer.valueOf(i11), Integer.valueOf(i12), Boolean.valueOf(z10), Boolean.valueOf(i13 != 0), Integer.valueOf(i14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedMedia$134(TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14) {
        AndroidUtilities.runOnUIThread(new y6(this, messages_messages, i10, j3, arrayList, i11, i12, z10, i13, i14, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedMedia$135(ArrayList arrayList, Runnable runnable) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            TLRPC.Message messageWithCustomParamsOnlyInternal = getMessagesStorage().getMessageWithCustomParamsOnlyInternal(messageObject.getId(), messageObject.getDialogId());
            TLRPC.Message message = messageObject.messageOwner;
            message.translatedToLanguage = messageWithCustomParamsOnlyInternal.translatedToLanguage;
            message.translatedText = messageWithCustomParamsOnlyInternal.translatedText;
            messageObject.updateTranslation();
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedMedia$136(TLRPC.messages_Messages messages_messages, int i10, long j3, int i11, int i12, boolean z10, int i13, int i14) {
        a0.i iVar = new a0.i();
        for (int i15 = 0; i15 < messages_messages.users.size(); i15++) {
            TLRPC.User user = messages_messages.users.get(i15);
            iVar.k(user, user.id);
        }
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        for (int i16 = 0; i16 < messages_messages.messages.size(); i16++) {
            MessageObject messageObject = new MessageObject(this.currentAccount, messages_messages.messages.get(i16), iVar, true, false);
            messageObject.createStrippedThumb();
            arrayList.add(messageObject);
        }
        getFileLoader().checkMediaExistance(arrayList);
        y6 y6Var = new y6(this, messages_messages, i10, j3, arrayList, i11, i12, z10, i13, i14, 1);
        if (getMessagesController().getTranslateController().isFeatureAvailable(j3)) {
            getMessagesStorage().getStorageQueue().postRunnable(new z8(this, arrayList, y6Var, 3));
        } else {
            y6Var.run();
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
    public /* synthetic */ void lambda$processLoadedMediaCount$137(long j3, boolean z10, int i10, int i11, int i12, long j10, int i13) {
        int i14;
        boolean z11;
        int i15 = i10;
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j3);
        if (z10) {
            if (i15 == -1) {
                i14 = i11;
            } else if (i15 == 0) {
                i14 = i11;
            }
            if (!isEncryptedDialog) {
                z11 = true;
                if (!z11 || (i12 == 1 && !isEncryptedDialog)) {
                    getMediaCount(j3, j10, i14, i13, false);
                }
                if (z11) {
                    return;
                }
                if (!z10) {
                    putMediaCountDatabase(j3, j10, i11, i15);
                }
                NotificationCenter notificationCenter = getNotificationCenter();
                int i16 = NotificationCenter.mediaCountDidLoad;
                Long valueOf = Long.valueOf(j3);
                Long valueOf2 = Long.valueOf(j10);
                if (z10 && i15 == -1) {
                    i15 = 0;
                }
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i16, valueOf, valueOf2, Integer.valueOf(i15), Boolean.valueOf(z10), Integer.valueOf(i11));
                return;
            }
            z11 = false;
            if (!z11) {
            }
            getMediaCount(j3, j10, i14, i13, false);
            if (z11) {
            }
        }
        i14 = i11;
        z11 = false;
        if (!z11) {
        }
        getMediaCount(j3, j10, i14, i13, false);
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
    public /* synthetic */ void lambda$processLoadedRecentDocuments$52(boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        int i12;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            int i13 = 2;
            if (z10) {
                i12 = getMessagesController().maxRecentGifsCount;
            } else {
                if (i10 != 3 && i10 != 7) {
                    i12 = i10 == 2 ? getMessagesController().maxFaveStickersCount : getMessagesController().maxRecentStickersCount;
                }
                i12 = 200;
            }
            database.beginTransaction();
            SQLitePreparedStatement executeFast = database.executeFast("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            int size = arrayList.size();
            int i14 = z10 ? 2 : i10 == 0 ? 3 : i10 == 1 ? 4 : i10 == 3 ? 6 : i10 == 5 ? 7 : i10 == 7 ? 8 : 5;
            if (z11) {
                database.executeFast("DELETE FROM web_recent_v3 WHERE type = " + i14).stepThis().dispose();
            }
            int i15 = 0;
            while (i15 < size && i15 != i12) {
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i15);
                executeFast.requery();
                executeFast.bindString(1, "" + document.id);
                executeFast.bindInteger(i13, i14);
                executeFast.bindString(3, "");
                executeFast.bindString(4, "");
                executeFast.bindString(5, "");
                executeFast.bindInteger(6, 0);
                executeFast.bindInteger(7, 0);
                executeFast.bindInteger(8, 0);
                executeFast.bindInteger(9, i11 != 0 ? i11 : size - i15);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                document.serializeToStream(nativeByteBuffer);
                executeFast.bindByteBuffer(10, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
                i15++;
                i13 = 2;
            }
            executeFast.dispose();
            database.commitTransaction();
            if (z11 || arrayList.size() < i12) {
                return;
            }
            database.beginTransaction();
            while (i12 < arrayList.size()) {
                database.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + ((TLRPC.Document) arrayList.get(i12)).id + "' AND type = " + i14).stepThis().dispose();
                i12++;
            }
            database.commitTransaction();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$processLoadedRecentDocuments$53(boolean z10, int i10, ArrayList arrayList) {
        SharedPreferences.Editor edit = MessagesController.getEmojiSettings(this.currentAccount).edit();
        if (z10) {
            this.loadingRecentGifs = false;
            this.recentGifsLoaded = true;
            edit.putLong("lastGifLoadTime", System.currentTimeMillis()).apply();
        } else {
            this.loadingRecentStickers[i10] = false;
            this.recentStickersLoaded[i10] = true;
            if (i10 == 0) {
                edit.putLong("lastStickersLoadTime", System.currentTimeMillis()).apply();
            } else if (i10 == 1) {
                edit.putLong("lastStickersLoadTimeMask", System.currentTimeMillis()).apply();
            } else if (i10 == 3) {
                edit.putLong("lastStickersLoadTimeGreet", System.currentTimeMillis()).apply();
            } else if (i10 == 5) {
                edit.putLong("lastStickersLoadTimeEmojiPacks", System.currentTimeMillis()).apply();
            } else if (i10 == 7) {
                edit.putLong("lastStickersLoadTimePremiumStickers", System.currentTimeMillis()).apply();
            } else {
                edit.putLong("lastStickersLoadTimeFavs", System.currentTimeMillis()).apply();
            }
        }
        if (arrayList != null) {
            if (z10) {
                this.recentGifs = arrayList;
            } else {
                this.recentStickers[i10] = arrayList;
            }
            if (i10 == 3) {
                preloadNextGreetingsSticker();
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentDocumentsDidLoad, Boolean.valueOf(z10), Integer.valueOf(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedStickers$103(int i10) {
        this.loadingStickers[i10] = false;
        this.stickersLoaded[i10] = true;
        Runnable runnable = this.scheduledLoadStickers[i10];
        if (runnable != null) {
            runnable.run();
            this.scheduledLoadStickers[i10] = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedStickers$104(ArrayList arrayList, long j3, int i10) {
        if (arrayList != null && j3 != 0) {
            this.loadHash[i10] = j3;
        }
        loadStickers(i10, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$processLoadedStickers$105(int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        for (int i12 = 0; i12 < this.stickerSets[i10].size(); i12++) {
            TLRPC.StickerSet stickerSet = this.stickerSets[i10].get(i12).set;
            this.stickerSetsById.l(stickerSet.id);
            this.stickerSetsByName.remove(stickerSet.short_name);
            if (i10 != 3 && i10 != 6 && i10 != 4) {
                this.installedStickerSetsById.l(stickerSet.id);
            }
        }
        for (int i13 = 0; i13 < iVar.m(); i13++) {
            this.stickerSetsById.k((TLRPC.TL_messages_stickerSet) iVar.n(i13), iVar.j(i13));
            if (i10 != 3 && i10 != 6 && i10 != 4) {
                this.installedStickerSetsById.k((TLRPC.TL_messages_stickerSet) iVar.n(i13), iVar.j(i13));
            }
        }
        this.stickerSetsByName.putAll(hashMap);
        this.stickerSets[i10] = arrayList;
        this.loadHash[i10] = j3;
        this.loadDate[i10] = i11;
        this.stickersByIds[i10] = iVar2;
        if (i10 == 0) {
            this.allStickers = hashMap2;
            this.stickersByEmoji = iVar3;
        } else if (i10 == 3) {
            this.allStickersFeatured = hashMap2;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i10), Boolean.TRUE);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedStickers$106(int i10, int i11) {
        this.loadDate[i10] = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedStickers$107(boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        MediaDataController mediaDataController;
        ArrayList arrayList2;
        String str;
        long j10 = 0;
        if ((z10 && (arrayList == null || BuildVars.DEBUG_PRIVATE_VERSION || Math.abs((System.currentTimeMillis() / 1000) - i10) >= 3600)) || (!z10 && arrayList == null && j3 == 0)) {
            mediaDataController = this;
            arrayList2 = arrayList;
            j7 j7Var = new j7(mediaDataController, arrayList2, j3, i11, 1);
            if (arrayList2 == null && !z10) {
                j10 = 1000;
            }
            AndroidUtilities.runOnUIThread(j7Var, j10);
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
                AndroidUtilities.runOnUIThread(new q6(mediaDataController, i11, i10, 1));
                mediaDataController.putStickersToCache(i11, null, i10, 0L);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        try {
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList3 = new ArrayList<>();
            a0.i iVar = new a0.i();
            HashMap hashMap = new HashMap();
            a0.i iVar2 = new a0.i();
            a0.i iVar3 = new a0.i();
            HashMap hashMap2 = new HashMap();
            int i12 = 0;
            while (i12 < arrayList2.size()) {
                try {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList2.get(i12);
                    if (tL_messages_stickerSet != null && mediaDataController.removingStickerSetsUndos.h(tL_messages_stickerSet.set.id) < 0) {
                        arrayList3.add(tL_messages_stickerSet);
                        iVar.k(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
                        hashMap.put(tL_messages_stickerSet.set.short_name, tL_messages_stickerSet);
                        for (int i13 = 0; i13 < tL_messages_stickerSet.documents.size(); i13++) {
                            TLRPC.Document document = tL_messages_stickerSet.documents.get(i13);
                            if (document != null && !(document instanceof TLRPC.TL_documentEmpty)) {
                                iVar3.k(document, document.id);
                            }
                        }
                        if (!tL_messages_stickerSet.set.archived) {
                            int i14 = 0;
                            while (i14 < tL_messages_stickerSet.packs.size()) {
                                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i14);
                                if (tL_stickerPack != null && (str = tL_stickerPack.emoticon) != null) {
                                    String replace = str.replace("️", "");
                                    tL_stickerPack.emoticon = replace;
                                    ArrayList arrayList4 = (ArrayList) hashMap2.get(replace);
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                        hashMap2.put(tL_stickerPack.emoticon, arrayList4);
                                    }
                                    int i15 = 0;
                                    while (i15 < tL_stickerPack.documents.size()) {
                                        Long l4 = tL_stickerPack.documents.get(i15);
                                        a0.i iVar4 = iVar;
                                        if (iVar2.h(l4.longValue()) < 0) {
                                            iVar2.k(tL_stickerPack.emoticon, l4.longValue());
                                        }
                                        TLRPC.Document document2 = (TLRPC.Document) iVar3.f(l4.longValue());
                                        if (document2 != null) {
                                            arrayList4.add(document2);
                                        }
                                        i15++;
                                        iVar = iVar4;
                                    }
                                }
                                i14++;
                                iVar = iVar;
                            }
                        }
                    }
                    i12++;
                    mediaDataController = this;
                    arrayList2 = arrayList;
                    iVar = iVar;
                } catch (Throwable th2) {
                    th = th2;
                    FileLog.e(th);
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
            }
            a0.i iVar5 = iVar;
            if (!z10) {
                putStickersToCache(i11, arrayList3, i10, j3);
            }
            AndroidUtilities.runOnUIThread(new z2(this, i11, iVar5, hashMap, arrayList3, j3, i10, iVar3, hashMap2, iVar2, runnable));
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putBotInfo$201(TL_bots.BotInfo botInfo, long j3) {
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(botInfo.getObjectSize());
            botInfo.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, botInfo.user_id);
            executeFast.bindLong(2, j3);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e7) {
            FileLog.e(e7);
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
    public /* synthetic */ void lambda$putDiceStickersToCache$90(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, int i10) {
        try {
            if (tL_messages_stickerSet == null) {
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("UPDATE stickers_dice SET date = ?");
                executeFast.requery();
                executeFast.bindInteger(1, i10);
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
            executeFast2.bindInteger(3, i10);
            executeFast2.step();
            nativeByteBuffer.reuse();
            executeFast2.dispose();
        } catch (Exception e7) {
            FileLog.e(e7);
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
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.EmojiKeyword emojiKeyword = tL_emojiKeywordsDifference.keywords.get(i10);
                    if (emojiKeyword instanceof TLRPC.TL_emojiKeyword) {
                        TLRPC.TL_emojiKeyword tL_emojiKeyword = (TLRPC.TL_emojiKeyword) emojiKeyword;
                        String lowerCase = tL_emojiKeyword.keyword.toLowerCase();
                        int size2 = tL_emojiKeyword.emoticons.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            executeFast.requery();
                            executeFast.bindString(1, tL_emojiKeywordsDifference.lang_code);
                            executeFast.bindString(2, lowerCase);
                            executeFast.bindString(3, tL_emojiKeyword.emoticons.get(i11));
                            executeFast.step();
                        }
                    } else if (emojiKeyword instanceof TLRPC.TL_emojiKeywordDeleted) {
                        TLRPC.TL_emojiKeywordDeleted tL_emojiKeywordDeleted = (TLRPC.TL_emojiKeywordDeleted) emojiKeyword;
                        String lowerCase2 = tL_emojiKeywordDeleted.keyword.toLowerCase();
                        int size3 = tL_emojiKeywordDeleted.emoticons.size();
                        for (int i12 = 0; i12 < size3; i12++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, tL_emojiKeywordsDifference.lang_code);
                            executeFast2.bindString(2, lowerCase2);
                            executeFast2.bindString(3, tL_emojiKeywordDeleted.emoticons.get(i12));
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
            AndroidUtilities.runOnUIThread(new b8(this, str, 1));
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putFeaturedStickersToCache$64(ArrayList arrayList, ArrayList arrayList2, boolean z10, int i10, long j3, boolean z11) {
        try {
            if (arrayList == null) {
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("UPDATE stickers_featured SET date = ? WHERE id = ? AND emoji = ?");
                executeFast.requery();
                executeFast.bindInteger(1, i10);
                executeFast.bindInteger(2, z10 ? 2 : 1);
                executeFast.bindInteger(3, z10 ? 1 : 0);
                executeFast.step();
                executeFast.dispose();
                return;
            }
            SQLitePreparedStatement executeFast2 = getMessagesStorage().getDatabase().executeFast("REPLACE INTO stickers_featured VALUES(?, ?, ?, ?, ?, ?, ?)");
            executeFast2.requery();
            int i11 = 4;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                i11 += ((TLRPC.StickerSetCovered) arrayList.get(i12)).getObjectSize();
            }
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i11);
            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer((arrayList2.size() * 8) + 4);
            nativeByteBuffer.writeInt32(arrayList.size());
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((TLRPC.StickerSetCovered) arrayList.get(i13)).serializeToStream(nativeByteBuffer);
            }
            nativeByteBuffer2.writeInt32(arrayList2.size());
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                nativeByteBuffer2.writeInt64(((Long) arrayList2.get(i14)).longValue());
            }
            executeFast2.bindInteger(1, z10 ? 2 : 1);
            executeFast2.bindByteBuffer(2, nativeByteBuffer);
            executeFast2.bindByteBuffer(3, nativeByteBuffer2);
            executeFast2.bindInteger(4, i10);
            executeFast2.bindLong(5, j3);
            executeFast2.bindInteger(6, z11 ? 1 : 0);
            executeFast2.bindInteger(7, z10 ? 1 : 0);
            executeFast2.step();
            nativeByteBuffer.reuse();
            nativeByteBuffer2.reuse();
            executeFast2.dispose();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putMediaCountDatabase$138(long j3, long j10, int i10, int i11) {
        int i12;
        try {
            SQLitePreparedStatement executeFast = j3 != 0 ? getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_counts_topics VALUES(?, ?, ?, ?, ?)") : getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_counts_v2 VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j10);
            if (j3 != 0) {
                executeFast.bindLong(2, j3);
                i12 = 3;
            } else {
                i12 = 2;
            }
            executeFast.bindInteger(i12, i10);
            executeFast.bindInteger(i12 + 1, i11);
            executeFast.bindInteger(i12 + 2, 0);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e7) {
            FileLog.e(e7);
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
    public /* synthetic */ void lambda$putMediaDatabase$140(int i10, ArrayList arrayList, boolean z10, long j3, int i11, int i12, long j10) {
        long j11;
        int size;
        int i13;
        if (i10 == 0) {
            try {
                if (!arrayList.isEmpty()) {
                    if (z10) {
                    }
                }
                j11 = j10;
                getMessagesStorage().doneHolesInMedia(j3, i11, i12, j11);
                if (arrayList.isEmpty()) {
                    return;
                }
                getMessagesStorage().getDatabase().beginTransaction();
                SQLitePreparedStatement executeFast = j11 == 0 ? getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_topics VALUES(?, ?, ?, ?, ?, ?)") : getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_v4 VALUES(?, ?, ?, ?, ?)");
                size = arrayList.size();
                i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    TLRPC.Message message = (TLRPC.Message) obj;
                    if (canAddMessageToMedia(message)) {
                        executeFast.requery();
                        MessageObject.normalizeFlags(message);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                        message.serializeToStream(nativeByteBuffer);
                        executeFast.bindInteger(1, message.id);
                        executeFast.bindLong(2, j3);
                        int i14 = 3;
                        if (j11 != 0) {
                            executeFast.bindLong(3, j11);
                            i14 = 4;
                        }
                        executeFast.bindInteger(i14, message.date);
                        executeFast.bindInteger(i14 + 1, i12);
                        executeFast.bindByteBuffer(i14 + 2, nativeByteBuffer);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                    }
                }
                executeFast.dispose();
                if (z10 || i11 != 0 || i10 != 0) {
                    int i15 = (z10 || i10 != 0) ? ((TLRPC.Message) arrayList.get(arrayList.size() - 1)).id : 1;
                    if (i10 == 0) {
                        getMessagesStorage().closeHolesInMedia(j3, i15, ((TLRPC.Message) arrayList.get(0)).id, i12, j11);
                    } else if (i11 != 0) {
                        getMessagesStorage().closeHolesInMedia(j3, i15, i11, i12, j10);
                    } else {
                        getMessagesStorage().closeHolesInMedia(j3, i15, ConnectionsManager.DEFAULT_DATACENTER_ID, i12, j10);
                    }
                }
                getMessagesStorage().getDatabase().commitTransaction();
            } catch (Exception e7) {
                FileLog.e(e7);
                return;
            }
        }
        j11 = j10;
        getMessagesStorage().getDatabase().beginTransaction();
        if (j11 == 0) {
        }
        size = arrayList.size();
        i13 = 0;
        while (i13 < size) {
        }
        executeFast.dispose();
        if (z10) {
        }
        if (z10) {
        }
        if (i10 == 0) {
        }
        getMessagesStorage().getDatabase().commitTransaction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putMenuBotsToCache$6(TLRPC.TL_attachMenuBots tL_attachMenuBots, long j3, int i10) {
        try {
            if (tL_attachMenuBots == null) {
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("UPDATE attach_menu_bots SET date = ?");
                executeFast.requery();
                executeFast.bindLong(1, i10);
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
            executeFast2.bindLong(2, j3);
            executeFast2.bindInteger(3, i10);
            executeFast2.step();
            nativeByteBuffer.reuse();
            executeFast2.dispose();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putPremiumPromoToCache$10(TLRPC.TL_help_premiumPromo tL_help_premiumPromo, int i10) {
        try {
            if (tL_help_premiumPromo == null) {
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("UPDATE premium_promo SET date = ?");
                executeFast.requery();
                executeFast.bindInteger(1, i10);
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
            executeFast2.bindInteger(2, i10);
            executeFast2.step();
            nativeByteBuffer.reuse();
            executeFast2.dispose();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putReactionsToCache$16(ArrayList arrayList, int i10, int i11) {
        try {
            if (arrayList == null) {
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("UPDATE reactions SET date = ?");
                executeFast.requery();
                executeFast.bindLong(1, i11);
                executeFast.step();
                executeFast.dispose();
                return;
            }
            getMessagesStorage().getDatabase().executeFast("DELETE FROM reactions").stepThis().dispose();
            SQLitePreparedStatement executeFast2 = getMessagesStorage().getDatabase().executeFast("REPLACE INTO reactions VALUES(?, ?, ?)");
            executeFast2.requery();
            int i12 = 4;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                i12 += ((TLRPC.TL_availableReaction) arrayList.get(i13)).getObjectSize();
            }
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i12);
            nativeByteBuffer.writeInt32(arrayList.size());
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                ((TLRPC.TL_availableReaction) arrayList.get(i14)).serializeToStream(nativeByteBuffer);
            }
            executeFast2.bindByteBuffer(1, nativeByteBuffer);
            executeFast2.bindInteger(2, i10);
            executeFast2.bindInteger(3, i11);
            executeFast2.step();
            nativeByteBuffer.reuse();
            executeFast2.dispose();
        } catch (Exception e7) {
            FileLog.e(e7);
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putStickersToCache$102(ArrayList arrayList, int i10, int i11, long j3) {
        try {
            if (arrayList == null) {
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("UPDATE stickers_v2 SET date = ?");
                executeFast.requery();
                executeFast.bindLong(1, i11);
                executeFast.step();
                executeFast.dispose();
                return;
            }
            SQLitePreparedStatement executeFast2 = getMessagesStorage().getDatabase().executeFast("REPLACE INTO stickers_v2 VALUES(?, ?, ?, ?)");
            executeFast2.requery();
            int i12 = 4;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                i12 += ((TLRPC.TL_messages_stickerSet) arrayList.get(i13)).getObjectSize();
            }
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i12);
            nativeByteBuffer.writeInt32(arrayList.size());
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                ((TLRPC.TL_messages_stickerSet) arrayList.get(i14)).serializeToStream(nativeByteBuffer);
            }
            executeFast2.bindInteger(1, i10 + 1);
            executeFast2.bindByteBuffer(2, nativeByteBuffer);
            executeFast2.bindInteger(3, i11);
            executeFast2.bindLong(4, j3);
            executeFast2.step();
            nativeByteBuffer.reuse();
            executeFast2.dispose();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeMultipleStickerSets$110(boolean[] zArr, ArrayList arrayList, int i10, int[] iArr) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            markSetUninstalling(((TLRPC.TL_messages_stickerSet) arrayList.get(i11)).set.id, false);
            ((TLRPC.TL_messages_stickerSet) arrayList.get(i11)).set.archived = false;
            this.stickerSets[i10].add(iArr[i11], (TLRPC.TL_messages_stickerSet) arrayList.get(i11));
            this.stickerSetsById.k((TLRPC.TL_messages_stickerSet) arrayList.get(i11), ((TLRPC.TL_messages_stickerSet) arrayList.get(i11)).set.id);
            this.installedStickerSetsById.k((TLRPC.TL_messages_stickerSet) arrayList.get(i11), ((TLRPC.TL_messages_stickerSet) arrayList.get(i11)).set.id);
            this.stickerSetsByName.put(((TLRPC.TL_messages_stickerSet) arrayList.get(i11)).set.short_name, (TLRPC.TL_messages_stickerSet) arrayList.get(i11));
            this.removingStickerSetsUndos.l(((TLRPC.TL_messages_stickerSet) arrayList.get(i11)).set.id);
        }
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList2 = this.stickerSets[i10];
        int i12 = this.loadDate[i10];
        long[] jArr = this.loadHash;
        long calcStickersHash = calcStickersHash(arrayList2);
        jArr[i10] = calcStickersHash;
        putStickersToCache(i10, arrayList2, i12, calcStickersHash);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i10), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeMultipleStickerSets$111(boolean[] zArr, ArrayList arrayList, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            toggleStickerSetInternal(context, 0, n2Var, null, true, (TLObject) arrayList.get(i11), ((TLRPC.TL_messages_stickerSet) arrayList.get(i11)).set, null, i10, false);
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
        } catch (Exception e7) {
            FileLog.e(e7);
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
        a0.i stickerByIds = getStickerByIds(4);
        for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i10);
            stickerByIds.k(document, document.id);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveDraft$189(long j3, long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            if (messages_messages.messages.isEmpty()) {
                return;
            }
            saveDraftReplyMessage(j3, j10, messages_messages.messages.get(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveDraft$190(long j3, long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            if (messages_messages.messages.isEmpty()) {
                return;
            }
            saveDraftReplyMessage(j3, j10, messages_messages.messages.get(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveDraft$191(int i10, long j3, long j10, final long j11, final long j12) {
        TLRPC.Message message;
        NativeByteBuffer byteBufferValue;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT data, replydata FROM messages_v2 WHERE mid = " + i10 + " and uid = " + j3, new Object[0]);
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
                    a0.i iVar = new a0.i();
                    a0.i iVar2 = new a0.i();
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
                                MessagesStorage.addReplyMessages(message, iVar, iVar2);
                            }
                        }
                    } catch (Exception e7) {
                        getMessagesStorage().checkSQLException(e7);
                    }
                    getMessagesStorage().loadReplyMessages(iVar, iVar2, arrayList, arrayList2, 0);
                }
                message2 = message;
            }
            queryFinalized.dispose();
            if (message2 != null) {
                saveDraftReplyMessage(j11, j12, message2);
                return;
            }
            if (j10 == 0) {
                TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                tL_messages_getMessages.id.add(Integer.valueOf(i10));
                final int i11 = 1;
                getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate(this) { // from class: org.telegram.messenger.q8
                    public final /* synthetic */ MediaDataController b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i11) {
                            case 0:
                                this.b.lambda$saveDraft$189(j11, j12, tLObject, tL_error);
                                break;
                            default:
                                this.b.lambda$saveDraft$190(j11, j12, tLObject, tL_error);
                                break;
                        }
                    }
                });
                return;
            }
            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
            tL_channels_getMessages.channel = getMessagesController().getInputChannel(j10);
            tL_channels_getMessages.id.add(Integer.valueOf(i10));
            final int i12 = 0;
            getConnectionsManager().sendRequest(tL_channels_getMessages, new RequestDelegate(this) { // from class: org.telegram.messenger.q8
                public final /* synthetic */ MediaDataController b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            this.b.lambda$saveDraft$189(j11, j12, tLObject, tL_error);
                            break;
                        default:
                            this.b.lambda$saveDraft$190(j11, j12, tLObject, tL_error);
                            break;
                    }
                }
            });
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveDraftReplyMessage$192(long j3, long j10, TLRPC.Message message) {
        TLRPC.InputReplyTo inputReplyTo;
        String sb2;
        a0.i iVar = (a0.i) this.drafts.f(j3);
        TLRPC.DraftMessage draftMessage = iVar != null ? (TLRPC.DraftMessage) iVar.f(j10) : null;
        if (draftMessage == null || (inputReplyTo = draftMessage.reply_to) == null || inputReplyTo.reply_to_msg_id != message.id) {
            return;
        }
        a0.i iVar2 = (a0.i) this.draftMessages.f(j3);
        if (iVar2 == null) {
            iVar2 = new a0.i();
            this.draftMessages.k(iVar2, j3);
        }
        iVar2.k(message, j10);
        SerializedData serializedData = new SerializedData(message.getObjectSize());
        message.serializeToStream(serializedData);
        SharedPreferences.Editor edit = this.draftPreferences.edit();
        if (j10 == 0) {
            sb2 = a4.a.o(j3, "r_");
        } else {
            StringBuilder t10 = a4.a.t(j3, "rt_", "_");
            t10.append(j10);
            sb2 = t10.toString();
        }
        edit.putString(sb2, Utilities.bytesToHex(serializedData.toByteArray())).commit();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newDraftReceived, Long.valueOf(j3));
        serializedData.cleanup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$savePeer$158(long j3, int i10, double d) {
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j3);
            executeFast.bindInteger(2, i10);
            executeFast.bindDouble(3, d);
            executeFast.bindInteger(4, ((int) System.currentTimeMillis()) / MAX_STYLE_RUNS_COUNT);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$savePinnedMessages$166(ArrayList arrayList, long j3) {
        try {
            getMessagesStorage().getDatabase().beginTransaction();
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO chat_pinned_v2 VALUES(?, ?, ?)");
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
                MessageObject.normalizeFlags(message);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                message.serializeToStream(nativeByteBuffer);
                executeFast.requery();
                executeFast.bindLong(1, j3);
                executeFast.bindInteger(2, message.id);
                executeFast.bindByteBuffer(3, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
            }
            executeFast.dispose();
            getMessagesStorage().getDatabase().commitTransaction();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveReplyMessages$178(boolean z10, ArrayList arrayList, a0.i iVar) {
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
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
                SparseArray sparseArray = (SparseArray) iVar.f(MessageObject.getDialogId(message));
                if (sparseArray != null && (arrayList2 = (ArrayList) sparseArray.get(message.id)) != null) {
                    MessageObject.normalizeFlags(message);
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                    message.serializeToStream(nativeByteBuffer);
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                        int i12 = 0;
                        while (i12 < 2) {
                            SQLitePreparedStatement sQLitePreparedStatement = i12 == 0 ? executeFast : executeFast2;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                                sQLitePreparedStatement.bindInteger(2, message.id);
                                sQLitePreparedStatement.bindInteger(3, messageObject.getId());
                                sQLitePreparedStatement.bindLong(4, messageObject.getDialogId());
                                sQLitePreparedStatement.step();
                            }
                            i12++;
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
        } catch (Exception e7) {
            FileLog.e(e7);
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
        } catch (Exception e7) {
            FileLog.e(e7);
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
        AndroidUtilities.runOnUIThread(new z8(this, tLObject, document, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$searchMessagesInChat$120(long j3, TLObject tLObject, TLRPC.TL_messages_search tL_messages_search, long j10, int i10, int i11, long j11, TLRPC.User user, TLRPC.Chat chat, boolean z10, ah.j1 j1Var) {
        if (this.lastMergeDialogId == j3) {
            this.mergeReqId = 0;
            if (tLObject == null) {
                this.messagesSearchEndReached[1] = true;
                this.messagesSearchCount[1] = 0;
                searchMessagesInChat(tL_messages_search.q, j10, j3, i10, i11, j11, true, user, chat, z10, j1Var);
            } else {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                this.messagesSearchEndReached[1] = messages_messages.messages.isEmpty();
                this.messagesSearchCount[1] = messages_messages instanceof TLRPC.TL_messages_messagesSlice ? messages_messages.count : messages_messages.messages.size();
                searchMessagesInChat(tL_messages_search.q, j10, j3, i10, i11, j11, true, user, chat, z10, j1Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$searchMessagesInChat$121(final long j3, final TLRPC.TL_messages_search tL_messages_search, final long j10, final int i10, final int i11, final long j11, final TLRPC.User user, final TLRPC.Chat chat, final boolean z10, final ah.j1 j1Var, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.e8
            @Override // java.lang.Runnable
            public final void run() {
                MediaDataController.this.lambda$searchMessagesInChat$120(j3, tLObject, tL_messages_search, j10, i10, i11, j11, user, chat, z10, j1Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$searchMessagesInChat$122(int i10, int i11, int i12, long j3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        if (i10 == this.lastReqId) {
            this.loadedPredirectedSearchLocal = arrayList.size() == i11;
            this.loadingSearchLocal = false;
            getMessagesController().putUsers(arrayList2, true);
            getMessagesController().putChats(arrayList3, true);
            org.telegram.ui.Components.q5.h(this.currentAccount).d(arrayList4);
            this.searchLocalResultMessages = arrayList;
            updateSearchResults();
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i12), 0, Integer.valueOf(getMask()), Long.valueOf(j3), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$searchMessagesInChat$123(TLRPC.TL_messages_search tL_messages_search, long j3, long j10, int i10, TLRPC.messages_Messages messages_messages, ArrayList arrayList, boolean z10, boolean z11, long j11, long j12, TLRPC.User user, TLRPC.Chat chat) {
        char c10;
        if (tL_messages_search.offset_id == 0 && j3 == j10) {
            this.lastReturnedNum = 0;
            this.searchServerResultMessages.clear();
            this.searchServerResultMessagesMap[0].clear();
            this.searchServerResultMessagesMap[1].clear();
            this.messagesSearchCount[0] = 0;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsLoading, Integer.valueOf(i10));
        }
        int min = Math.min(messages_messages.messages.size(), tL_messages_search.limit - 1);
        int i11 = 0;
        boolean z12 = false;
        while (i11 < min) {
            MessageObject messageObject = (MessageObject) arrayList.get(i11);
            this.searchServerResultMessages.add(messageObject);
            this.searchServerResultMessagesMap[j3 == j10 ? (char) 0 : (char) 1].put(messageObject.getId(), messageObject);
            i11++;
            z12 = true;
        }
        updateSearchResults();
        this.messagesSearchEndReached[j3 == j10 ? (char) 0 : (char) 1] = messages_messages.messages.size() < tL_messages_search.limit;
        this.messagesSearchCount[j3 == j10 ? (char) 0 : (char) 1] = ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) || (messages_messages instanceof TLRPC.TL_messages_channelMessages)) ? messages_messages.count : messages_messages.messages.size();
        if (this.searchServerResultMessages.isEmpty()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i10), 0, Integer.valueOf(getMask()), 0L, 0, 0, Boolean.valueOf(z10));
        } else if (z12) {
            if (this.lastReturnedNum >= this.searchResultMessages.size()) {
                this.lastReturnedNum = this.searchResultMessages.size() - 1;
            }
            MessageObject messageObject2 = this.searchResultMessages.get(this.lastReturnedNum);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i10), Integer.valueOf(messageObject2.getId()), Integer.valueOf(getMask()), Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.valueOf(z10));
        } else if (z11) {
            c10 = 0;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i10), 0, Integer.valueOf(getMask()), Long.valueOf(j10), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.FALSE);
            if (j3 != j10) {
                boolean[] zArr = this.messagesSearchEndReached;
                if (!zArr[c10] || j11 == 0 || zArr[1]) {
                    return;
                }
                searchMessagesInChat(this.lastSearchQuery, j10, j11, i10, 0, j12, true, user, chat, z10, this.lastReaction);
                return;
            }
            return;
        }
        c10 = 0;
        if (j3 != j10) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$searchMessagesInChat$124(int i10, final boolean z10, TLObject tLObject, final TLRPC.TL_messages_search tL_messages_search, final long j3, final long j10, final int i11, final ArrayList arrayList, final boolean z11, final long j11, final long j12, final TLRPC.User user, final TLRPC.Chat chat) {
        if (i10 == this.lastReqId) {
            this.reqId = 0;
            if (!z10) {
                this.loadingMoreSearchMessages = false;
            }
            if (tLObject != null) {
                final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                int i12 = 0;
                while (i12 < messages_messages.messages.size()) {
                    TLRPC.Message message = messages_messages.messages.get(i12);
                    if ((message instanceof TLRPC.TL_messageEmpty) || (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                        messages_messages.messages.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                getMessagesController().putUsers(messages_messages.users, false);
                getMessagesController().putChats(messages_messages.chats, false);
                Runnable runnable = new Runnable() { // from class: org.telegram.messenger.c9
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaDataController.this.lambda$searchMessagesInChat$123(tL_messages_search, j3, j10, i11, messages_messages, arrayList, z10, z11, j11, j12, user, chat);
                    }
                };
                if (z11) {
                    loadReplyMessagesForMessages(arrayList, j10, 0, this.lastReplyMessageId, runnable, i11, null);
                } else {
                    runnable.run();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$searchMessagesInChat$125(TLRPC.TL_messages_search tL_messages_search, final boolean z10, String str, boolean z11, final int i10, final boolean z12, final long j3, final long j10, final int i11, final long j11, final long j12, final TLRPC.User user, final TLRPC.Chat chat, final TLObject tLObject, TLRPC.TL_error tL_error) {
        final TLRPC.TL_messages_search tL_messages_search2;
        final ArrayList arrayList = new ArrayList();
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            tL_messages_search2 = tL_messages_search;
            int min = Math.min(messages_messages.messages.size(), tL_messages_search2.limit - 1);
            for (int i12 = 0; i12 < min; i12++) {
                MessageObject messageObject = new MessageObject(this.currentAccount, messages_messages.messages.get(i12), null, null, null, null, null, true, true, 0L, false, false, z10);
                if (messageObject.hasValidGroupId()) {
                    messageObject.isPrimaryGroupMessage = true;
                }
                messageObject.setQuery(str, !z11);
                arrayList.add(messageObject);
            }
        } else {
            tL_messages_search2 = tL_messages_search;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.g8
            @Override // java.lang.Runnable
            public final void run() {
                MediaDataController.this.lambda$searchMessagesInChat$124(i10, z12, tLObject, tL_messages_search2, j3, j10, i11, arrayList, z10, j11, j12, user, chat);
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
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
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
            this.loadingSearchStickersKeys.put(searchStickersKey, Integer.valueOf(getConnectionsManager().sendRequestTyped(tL_messages_searchStickers, new a(), new z3(this, searchStickersKey, searchStickersResult, callback, 1))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setPlaceholderImage$31(String str, org.telegram.ui.Components.x9 x9Var, String str2, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        int i10;
        if (tL_messages_stickerSet == null) {
            return;
        }
        ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(str);
        for (int i11 = 0; i11 < parseEmojis.size(); i11++) {
            parseEmojis.get(i11).code = Emoji.fixEmoji(parseEmojis.get(i11).code.toString());
        }
        int i12 = 0;
        loop1: while (true) {
            if (i12 >= tL_messages_stickerSet.documents.size()) {
                document = null;
                break;
            }
            document = tL_messages_stickerSet.documents.get(i12);
            int size = parseEmojis.size();
            int i13 = 0;
            while (i13 < size) {
                Emoji.EmojiSpanRange emojiSpanRange = parseEmojis.get(i13);
                i13++;
                Emoji.EmojiSpanRange emojiSpanRange2 = emojiSpanRange;
                while (i10 < tL_messages_stickerSet.packs.size()) {
                    i10 = (tL_messages_stickerSet.packs.get(i10).documents.contains(Long.valueOf(document.id)) && TextUtils.equals(Emoji.fixEmoji(tL_messages_stickerSet.packs.get(i10).emoticon), emojiSpanRange2.code)) ? 0 : i10 + 1;
                }
            }
            break loop1;
            i12++;
        }
        if (document != null) {
            x9Var.n(ImageLocation.getForDocument(document), str2, DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.j6.m6, 0.2f, 1.0f, null), document);
            x9Var.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$160(TLRPC.MessageEntity messageEntity, TLRPC.MessageEntity messageEntity2) {
        int i10 = messageEntity.offset;
        int i11 = messageEntity2.offset;
        if (i10 > i11) {
            return 1;
        }
        return i10 < i11 ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleStickerSet$108(boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        markSetUninstalling(stickerSet.id, false);
        stickerSet.archived = false;
        this.stickerSets[i10].add(i11, tL_messages_stickerSet);
        this.stickerSetsById.k(tL_messages_stickerSet, stickerSet.id);
        this.installedStickerSetsById.k(tL_messages_stickerSet, stickerSet.id);
        String str = stickerSet.short_name;
        if (str != null) {
            this.stickerSetsByName.put(str.toLowerCase(), tL_messages_stickerSet);
        }
        this.removingStickerSetsUndos.l(stickerSet.id);
        this.loadHash[i10] = calcStickersHash(this.stickerSets[i10]);
        putStickersToCache(i10, this.stickerSets[i10], this.loadDate[i10], this.loadHash[i10]);
        if (runnable != null) {
            runnable.run();
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i10), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleStickerSet$109(boolean[] zArr, Context context, int i10, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, boolean z10, TLObject tLObject, TLRPC.StickerSet stickerSet, TLRPC.Document document, int i11) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        toggleStickerSetInternal(context, i10, n2Var, frameLayout, z10, tLObject, stickerSet, document, i11, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleStickerSetInternal$112(TLRPC.StickerSet stickerSet, ArrayList arrayList) {
        markSetInstalling(stickerSet.id, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$toggleStickerSetInternal$113(TLRPC.StickerSet stickerSet, TLObject tLObject, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, int i10, TLRPC.TL_error tL_error, boolean z11, FrameLayout frameLayout, Context context, TLObject tLObject2, TLRPC.Document document) {
        this.removingStickerSetsUndos.l(stickerSet.id);
        if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
            processStickerSetInstallResultArchive(n2Var, z10, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
        }
        loadStickers(i10, false, false, true, new j9(this, stickerSet, 1));
        if (tL_error == null && z11) {
            if (frameLayout != null) {
                org.telegram.ui.Components.qc.f(frameLayout, new zw0(context, tLObject2, 1, 2, document, n2Var.getResourceProvider()), 1500).j();
            } else if (n2Var != null) {
                org.telegram.ui.Components.qc.g(n2Var, new zw0(context, tLObject2, 1, 2, document, n2Var.getResourceProvider()), 1500).j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleStickerSetInternal$114(final TLRPC.StickerSet stickerSet, final org.telegram.ui.ActionBar.n2 n2Var, final boolean z10, final int i10, final boolean z11, final FrameLayout frameLayout, final Context context, final TLObject tLObject, final TLRPC.Document document, final TLObject tLObject2, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.h9
            @Override // java.lang.Runnable
            public final void run() {
                TLObject tLObject3 = tLObject;
                TLRPC.Document document2 = document;
                int i11 = i10;
                Context context2 = context;
                FrameLayout frameLayout2 = frameLayout;
                MediaDataController mediaDataController = this;
                TLObject tLObject4 = tLObject2;
                mediaDataController.lambda$toggleStickerSetInternal$113(stickerSet, tLObject4, n2Var, z10, i11, tL_error, z11, frameLayout2, context2, tLObject3, document2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleStickerSetInternal$115(TLRPC.StickerSet stickerSet, ArrayList arrayList) {
        markSetUninstalling(stickerSet.id, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleStickerSetInternal$116(TLRPC.StickerSet stickerSet, int i10) {
        this.removingStickerSetsUndos.l(stickerSet.id);
        loadStickers(i10, false, true, false, new j9(this, stickerSet, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleStickerSetInternal$117(TLRPC.StickerSet stickerSet, int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new q4(this, stickerSet, i10, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleStickerSets$118(int i10, TLObject tLObject, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, int i11) {
        if (i10 == 0) {
            loadStickers(i11, false, true);
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
            processStickerSetInstallResultArchive(n2Var, z10, i11, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
        }
        loadStickers(i11, false, false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleStickerSets$119(int i10, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, int i11, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new y7(this, i10, tLObject, n2Var, z10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateBotInfo$202(TL_update.TL_updateBotCommands tL_updateBotCommands, long j3) {
        try {
            TL_bots.BotInfo loadBotInfoInternal = loadBotInfoInternal(tL_updateBotCommands.bot_id, j3);
            if (loadBotInfoInternal != null) {
                loadBotInfoInternal.commands = tL_updateBotCommands.commands;
            }
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(loadBotInfoInternal.getObjectSize());
            loadBotInfoInternal.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, loadBotInfoInternal.user_id);
            executeFast.bindLong(2, j3);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateEmojiStatuses$234(int i10, TL_account.TL_emojiStatuses tL_emojiStatuses) {
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM emoji_statuses WHERE type = " + i10).stepThis().dispose();
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("INSERT INTO emoji_statuses VALUES(?, ?)");
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_emojiStatuses.getObjectSize());
            tL_emojiStatuses.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(1, nativeByteBuffer);
            executeFast.bindInteger(2, i10);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        this.emojiStatusesFetching[i10] = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$verifyAnimatedStickerMessageInternal$69(String str, TLObject tLObject) {
        char c10;
        ArrayList<TLRPC.Message> arrayList = this.verifyingMessages.get(str);
        if (tLObject != null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            storeTempStickerSet(tL_messages_stickerSet);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.Message message = arrayList.get(i10);
                TLRPC.Document document = MessageObject.getDocument(message);
                int size2 = tL_messages_stickerSet.documents.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    TLRPC.Document document2 = tL_messages_stickerSet.documents.get(i11);
                    if (document2.id == document.id && document2.dc_id == document.dc_id) {
                        message.stickerVerified = 1;
                        break;
                    }
                    i11++;
                }
                if (message.stickerVerified == 0) {
                    message.stickerVerified = 2;
                }
            }
            c10 = 0;
        } else {
            c10 = 0;
            int size3 = arrayList.size();
            for (int i12 = 0; i12 < size3; i12++) {
                arrayList.get(i12).stickerVerified = 2;
            }
        }
        NotificationCenter notificationCenter = getNotificationCenter();
        int i13 = NotificationCenter.didVerifyMessagesStickers;
        Object[] objArr = new Object[1];
        objArr[c10] = arrayList;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, objArr);
        getMessagesStorage().updateMessageVerifyFlags(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$verifyAnimatedStickerMessageInternal$70(String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new l9(this, str, tLObject, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void loadAvatarConstructor(boolean z10) {
        String string;
        long j3;
        TLRPC.TL_emojiList tL_emojiList;
        Throwable th2;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("avatar_constructor" + this.currentAccount, 0);
        TLRPC.TL_emojiList tL_emojiList2 = null;
        if (z10) {
            string = sharedPreferences.getString("profile", null);
            j3 = sharedPreferences.getLong("profile_last_check", 0L);
        } else {
            string = sharedPreferences.getString("group", null);
            j3 = sharedPreferences.getLong("group_last_check", 0L);
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
                } catch (Throwable th3) {
                    th2 = th3;
                    FileLog.e(th2);
                    tL_emojiList2 = tL_emojiList;
                    if (tL_emojiList2 != null) {
                    }
                    TL_account.getDefaultProfilePhotoEmojis getdefaultprofilephotoemojis = new TL_account.getDefaultProfilePhotoEmojis();
                    if (tL_emojiList2 != null) {
                    }
                    getConnectionsManager().sendRequest(getdefaultprofilephotoemojis, new u0(this, sharedPreferences, z10, 1));
                }
            } catch (Throwable th4) {
                tL_emojiList = null;
                th2 = th4;
            }
            tL_emojiList2 = tL_emojiList;
        }
        if (tL_emojiList2 != null || System.currentTimeMillis() - j3 > 86400000 || BuildVars.DEBUG_PRIVATE_VERSION) {
            TL_account.getDefaultProfilePhotoEmojis getdefaultprofilephotoemojis2 = new TL_account.getDefaultProfilePhotoEmojis();
            if (tL_emojiList2 != null) {
                getdefaultprofilephotoemojis2.hash = tL_emojiList2.hash;
            }
            getConnectionsManager().sendRequest(getdefaultprofilephotoemojis2, new u0(this, sharedPreferences, z10, 1));
        }
    }

    private TL_bots.BotInfo loadBotInfoInternal(long j3, long j10) {
        TL_bots.BotInfo botInfo;
        NativeByteBuffer byteBufferValue;
        SQLiteDatabase database = getMessagesStorage().getDatabase();
        Locale locale = Locale.US;
        StringBuilder t10 = a4.a.t(j3, "SELECT info FROM bot_info_v2 WHERE uid = ", " AND dialogId = ");
        t10.append(j10);
        SQLiteCursor queryFinalized = database.queryFinalized(t10.toString(), new Object[0]);
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
            getMessagesStorage().getStorageQueue().postRunnable(new b2(21, this, stickerSet));
            return;
        }
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
        tL_inputStickerSetID.id = stickerSet.id;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new n7(this, 8));
    }

    private void loadMediaDatabase(long j3, int i10, int i11, int i12, int i13, long j10, ah.j1 j1Var, int i14, boolean z10, int i15, int i16) {
        1 r02 = new 1(i10, j3, i12, j10, i13, j1Var, i11, i14, i15, z10, i16);
        MessagesStorage messagesStorage = getMessagesStorage();
        messagesStorage.getStorageQueue().postRunnable(r02);
        messagesStorage.bindTaskToGuid(r02, i14);
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
    private ArrayList<MessageObject> loadPinnedMessageInternal(long j3, long j10, ArrayList<Integer> arrayList, boolean z10) {
        Object join;
        ArrayList<TLRPC.User> arrayList2;
        ArrayList<TLRPC.Chat> arrayList3;
        try {
            ArrayList<Integer> arrayList4 = new ArrayList<>(arrayList);
            if (j10 != 0) {
                join = new StringBuilder();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Integer num = arrayList.get(i10);
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
            long j11 = getUserConfig().clientUserId;
            int i11 = 1;
            ?? r11 = 0;
            ?? queryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT data, mid, date FROM messages_v2 WHERE mid IN (%s) AND uid = %d", join, Long.valueOf(j3)), new Object[0]);
            while (queryFinalized.next()) {
                ?? byteBufferValue = queryFinalized.byteBufferValue(r11);
                if (byteBufferValue != 0) {
                    ?? TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r11), r11);
                    if (!(TLdeserialize.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                        TLdeserialize.readAttachPath(byteBufferValue, j11);
                        TLdeserialize.id = queryFinalized.intValue(i11);
                        TLdeserialize.date = queryFinalized.intValue(2);
                        TLdeserialize.dialog_id = j3;
                        MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize, arrayList8, arrayList9, null);
                        arrayList5.add(TLdeserialize);
                        arrayList4.remove(Integer.valueOf(TLdeserialize.id));
                    }
                    byteBufferValue.reuse();
                }
                r11 = 0;
                i11 = 1;
            }
            queryFinalized.dispose();
            if (!arrayList4.isEmpty()) {
                SQLiteDatabase database = getMessagesStorage().getDatabase();
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized2 = database.queryFinalized("SELECT data FROM chat_pinned_v2 WHERE uid = " + j3 + " AND mid IN (" + TextUtils.join(",", arrayList4) + ")", new Object[0]);
                while (queryFinalized2.next()) {
                    NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(0);
                    if (byteBufferValue2 != null) {
                        TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                        if (!(TLdeserialize2.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                            TLdeserialize2.readAttachPath(byteBufferValue2, j11);
                            TLdeserialize2.dialog_id = j3;
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
                if (j10 != 0) {
                    TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                    tL_channels_getMessages.channel = getMessagesController().getInputChannel(j10);
                    tL_channels_getMessages.id = arrayList4;
                    getConnectionsManager().sendRequest(tL_channels_getMessages, new z6(this, j10, j3, tL_channels_getMessages));
                } else {
                    TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages.id = arrayList4;
                    getConnectionsManager().sendRequest(tL_messages_getMessages, new zk((BaseController) this, j3, tL_messages_getMessages, 2));
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
            } catch (Exception e7) {
                e = e7;
                FileLog.e(e);
                return null;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    public static ArrayList<TLRPC.Reaction> loadReactionsFromPref(SharedPreferences sharedPreferences) {
        int i10 = sharedPreferences.getInt(NotificationBadge.NewHtcHomeBadger.COUNT, 0);
        ArrayList<TLRPC.Reaction> arrayList = new ArrayList<>(i10);
        if (i10 > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(sharedPreferences.getString("object_" + i11, "")));
                try {
                    arrayList.add(TLRPC.Reaction.TLdeserialize(serializedData, serializedData.readInt32(true), true));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
        }
        return arrayList;
    }

    private void loadRepliesOfDraftReplies(ArrayList<TLRPC.Message> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new u7(this, arrayList, 0));
    }

    private void loadStickerSetThumbInternal(TLRPC.PhotoSize photoSize, Object obj, TLRPC.Document document, int i10) {
        ImageLocation forSticker = ImageLocation.getForSticker(photoSize, document, i10);
        if (forSticker != null) {
            getFileLoader().loadFile(forSticker, obj, forSticker.imageType == 1 ? "tgs" : "webp", 3, 1);
        }
    }

    public static void offsetEntities(ArrayList<TLRPC.MessageEntity> arrayList, int i10) {
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            TLRPC.MessageEntity messageEntity = arrayList.get(i11);
            i11++;
            messageEntity.offset += i10;
        }
    }

    private CharSequence parsePattern(CharSequence charSequence, Pattern pattern, ArrayList<TLRPC.MessageEntity> arrayList, GenericProvider<Void, TLRPC.MessageEntity> genericProvider) {
        URLSpan[] uRLSpanArr;
        Matcher matcher = pattern.matcher(charSequence);
        int i10 = 0;
        while (matcher.find()) {
            boolean z10 = true;
            String group = matcher.group(1);
            if ((charSequence instanceof Spannable) && (uRLSpanArr = (URLSpan[]) ((Spannable) charSequence).getSpans(matcher.start() - i10, matcher.end() - i10, URLSpan.class)) != null && uRLSpanArr.length > 0) {
                z10 = false;
            }
            if (z10) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    TLRPC.MessageEntity messageEntity = arrayList.get(i11);
                    if ((messageEntity instanceof TLRPC.TL_messageEntityPre) || (messageEntity instanceof TLRPC.TL_messageEntityCode)) {
                        int start = matcher.start() - i10;
                        int end = matcher.end() - i10;
                        int i12 = messageEntity.offset;
                        if (AndroidUtilities.intersect1d(start, end, i12, messageEntity.length + i12)) {
                            z10 = false;
                            break;
                        }
                    }
                    i11++;
                }
            }
            if (z10) {
                charSequence = ((Object) charSequence.subSequence(0, matcher.start() - i10)) + group + ((Object) charSequence.subSequence(matcher.end() - i10, charSequence.length()));
                TLRPC.MessageEntity provide = genericProvider.provide(null);
                provide.offset = matcher.start() - i10;
                int length = group.length();
                provide.length = length;
                int i13 = provide.offset;
                removeOffset4After(i13, length + i13, arrayList);
                arrayList.add(provide);
            }
            i10 += (matcher.end() - matcher.start()) - group.length();
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

    private void processLoadStickersResponse(int i10, TLRPC.TL_messages_allStickers tL_messages_allStickers) {
        processLoadStickersResponse(i10, tL_messages_allStickers, null);
    }

    private void processLoadedDiceStickers(String str, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z11, int i10) {
        AndroidUtilities.runOnUIThread(new b8(this, str, 4));
        Utilities.stageQueue.postRunnable(new hg.v0(this, z11, tL_messages_stickerSet, i10, str, z10));
    }

    private void processLoadedFeaturedStickers(boolean z10, ArrayList<TLRPC.StickerSetCovered> arrayList, ArrayList<Long> arrayList2, boolean z11, boolean z12, int i10, long j3) {
        AndroidUtilities.runOnUIThread(new c8(this, z10, 1));
        Utilities.stageQueue.postRunnable(new a9(this, z12, arrayList, i10, j3, z10, arrayList2, z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processLoadedMedia(final TLRPC.messages_Messages messages_messages, final long j3, int i10, int i11, final int i12, final int i13, long j10, final int i14, final int i15, boolean z10, final boolean z11, final int i16) {
        long j11;
        int i17;
        int i18;
        long j12;
        boolean z12;
        ArrayList<TLRPC.Message> arrayList;
        ArrayList<TLRPC.Message> arrayList2;
        if (BuildVars.LOGS_ENABLED) {
            int size = (messages_messages == null || (arrayList2 = messages_messages.messages) == null) ? 0 : arrayList2.size();
            StringBuilder sb2 = new StringBuilder("process load media messagesCount ");
            sb2.append(size);
            sb2.append(" did ");
            j11 = j3;
            sb2.append(j11);
            sb2.append(" topicId ");
            j12 = j10;
            sb2.append(j12);
            sb2.append(" count = ");
            i17 = i10;
            i2.g.v(sb2, i17, " max_id=", i11, " min_id=");
            i18 = i13;
            i2.g.v(sb2, i12, " type = ", i18, " cache = ");
            i2.g.v(sb2, i14, " classGuid = ", i15, " topReached=");
            z12 = z11;
            sb2.append(z12);
            FileLog.d(sb2.toString());
        } else {
            j11 = j3;
            i17 = i10;
            i18 = i13;
            j12 = j10;
            z12 = z11;
        }
        if (i14 != 0 && messages_messages != null && (arrayList = messages_messages.messages) != null && (((arrayList.isEmpty() && i12 == 0) || (messages_messages.messages.size() <= 1 && i12 != 0)) && !DialogObject.isEncryptedDialog(j11))) {
            if (i14 == 2) {
                return;
            }
            loadMedia(j11, i17, i11, i12, i18, j12, 0, i15, i16, null, null);
        } else {
            if (i14 == 0) {
                ImageLoader.saveMessagesThumbs(messages_messages.messages);
                getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                putMediaDatabase(j3, j10, i13, messages_messages.messages, i11, i12, z12);
            }
            Utilities.searchQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.k9
                @Override // java.lang.Runnable
                public final void run() {
                    MediaDataController.this.lambda$processLoadedMedia$136(messages_messages, i14, j3, i15, i13, z11, i12, i16);
                }
            });
        }
    }

    private void processLoadedMediaCount(final int i10, final long j3, final long j10, final int i11, final int i12, final boolean z10, final int i13) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.b9
            @Override // java.lang.Runnable
            public final void run() {
                MediaDataController.this.lambda$processLoadedMediaCount$137(j3, z10, i10, i11, i13, j10, i12);
            }
        });
    }

    private void processLoadedStickers(int i10, ArrayList<TLRPC.TL_messages_stickerSet> arrayList, boolean z10, int i11, long j3) {
        processLoadedStickers(i10, arrayList, z10, i11, j3, null);
    }

    private void putDiceStickersToCache(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new h0(this, tL_messages_stickerSet, str, i10, 8));
    }

    private void putEmojiKeywords(String str, TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference) {
        if (tL_emojiKeywordsDifference == null) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new f0(this, tL_emojiKeywordsDifference, str, 28));
    }

    private void putFeaturedStickersToCache(final boolean z10, ArrayList<TLRPC.StickerSetCovered> arrayList, final ArrayList<Long> arrayList2, final int i10, final long j3, final boolean z11) {
        final ArrayList arrayList3 = arrayList != null ? new ArrayList(arrayList) : null;
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.messenger.n9
            @Override // java.lang.Runnable
            public final void run() {
                MediaDataController.this.lambda$putFeaturedStickersToCache$64(arrayList3, arrayList2, z10, i10, j3, z11);
            }
        });
    }

    private void putMediaCountDatabase(long j3, long j10, int i10, int i11) {
        getMessagesStorage().getStorageQueue().postRunnable(new j8(this, j10, j3, i10, i11, 1));
    }

    private void putMediaDatabase(long j3, long j10, int i10, ArrayList<TLRPC.Message> arrayList, int i11, int i12, boolean z10) {
        getMessagesStorage().getStorageQueue().postRunnable(new x8(this, i12, arrayList, z10, j3, i11, i10, j10));
    }

    private void putMenuBotsToCache(TLRPC.TL_attachMenuBots tL_attachMenuBots, long j3, int i10) {
        getMessagesStorage().getStorageQueue().postRunnable(new j7(this, tL_attachMenuBots, j3, i10, 0));
    }

    private void putPremiumPromoToCache(TLRPC.TL_help_premiumPromo tL_help_premiumPromo, int i10) {
        getMessagesStorage().getStorageQueue().postRunnable(new q4(this, tL_help_premiumPromo, i10, 6));
    }

    private void putReactionsToCache(List<TLRPC.TL_availableReaction> list, int i10, int i11) {
        getMessagesStorage().getStorageQueue().postRunnable(new x4(this, list != null ? new ArrayList(list) : null, i10, i11, 3));
    }

    private void putSetToCache(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        getMessagesStorage().getStorageQueue().postRunnable(new d7(this, tL_messages_stickerSet, 3));
    }

    private void putStickersToCache(int i10, ArrayList<TLRPC.TL_messages_stickerSet> arrayList, int i11, long j3) {
        getMessagesStorage().getStorageQueue().postRunnable(new s(this, arrayList != null ? new ArrayList(arrayList) : null, i10, i11, j3));
    }

    private static void removeEmptyMessages(ArrayList<TLRPC.Message> arrayList) {
        int i10 = 0;
        while (i10 < arrayList.size()) {
            TLRPC.Message message = arrayList.get(i10);
            if (message == null || (message instanceof TLRPC.TL_messageEmpty) || (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    private static void removeOffset4After(int i10, int i11, ArrayList<TLRPC.MessageEntity> arrayList) {
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.MessageEntity messageEntity = arrayList.get(i12);
            int i13 = messageEntity.offset;
            if (i13 > i11) {
                messageEntity.offset = i13 - 4;
            } else if (i13 > i10) {
                messageEntity.offset = i13 - 2;
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
        } catch (Exception e7) {
            FileLog.e(e7);
            return false;
        }
    }

    private void saveDraftReplyMessage(long j3, long j10, TLRPC.Message message) {
        if (message == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new a3.g0(this, j3, j10, message, 5));
    }

    private void savePeer(final long j3, final int i10, final double d) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.messenger.x6
            @Override // java.lang.Runnable
            public final void run() {
                MediaDataController.this.lambda$savePeer$158(j3, i10, d);
            }
        });
    }

    private void savePinnedMessages(long j3, ArrayList<TLRPC.Message> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new b4(this, arrayList, j3, 8));
    }

    public static void saveReactionsToPref(SharedPreferences sharedPreferences, long j3, ArrayList<? extends TLObject> arrayList) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, arrayList.size());
        edit.putLong("hash", j3);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLObject tLObject = arrayList.get(i10);
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            edit.putString("object_" + i10, Utilities.bytesToHex(serializedData.toByteArray()));
        }
        edit.apply();
    }

    private void saveReplyMessages(a0.i iVar, ArrayList<TLRPC.Message> arrayList, boolean z10) {
        getMessagesStorage().getStorageQueue().postRunnable(new vj(this, z10, arrayList, iVar, 7));
    }

    private void saveStickerSetIntoCache(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (tL_messages_stickerSet == null || tL_messages_stickerSet.set == null) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new d7(this, tL_messages_stickerSet, 0));
        cleanupStickerSetCache();
    }

    private TLRPC.MessageEntity setEntityStartEnd(TLRPC.MessageEntity messageEntity, int i10, int i11) {
        messageEntity.offset = i10;
        messageEntity.length = i11 - i10;
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
                zf.a l4 = zf.a.l(starsAmount);
                zf.a l10 = zf.a.l(starsAmount2);
                if (l4 != l10 && ((l4 == null || l10 == null || l4.a != l10.a || l4.b != l10.b) && suggestedPost.schedule_date == suggestedPost2.schedule_date && suggestedPost.accepted == suggestedPost2.accepted && suggestedPost.rejected == suggestedPost2.rejected)) {
                }
            }
            return false;
        }
        return true;
    }

    private static TLRPC.InputReplyTo toInputReplyTo(int i10, TLRPC.MessageReplyHeader messageReplyHeader) {
        if (messageReplyHeader instanceof TLRPC.TL_messageReplyStoryHeader) {
            TLRPC.TL_inputReplyToStory tL_inputReplyToStory = new TLRPC.TL_inputReplyToStory();
            tL_inputReplyToStory.peer = MessagesController.getInstance(i10).getInputPeer(messageReplyHeader.peer);
            tL_inputReplyToStory.story_id = messageReplyHeader.story_id;
            return tL_inputReplyToStory;
        }
        if (!(messageReplyHeader instanceof TLRPC.TL_messageReplyHeader)) {
            return null;
        }
        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
        tL_inputReplyToMessage.reply_to_msg_id = messageReplyHeader.reply_to_msg_id;
        if ((messageReplyHeader.flags & 1) != 0) {
            TLRPC.InputPeer inputPeer = MessagesController.getInstance(i10).getInputPeer(messageReplyHeader.reply_to_peer_id);
            tL_inputReplyToMessage.reply_to_peer_id = inputPeer;
            if (inputPeer != null) {
                tL_inputReplyToMessage.flags |= 2;
            }
        }
        int i11 = messageReplyHeader.flags;
        if ((i11 & 2) != 0) {
            tL_inputReplyToMessage.flags |= 1;
            tL_inputReplyToMessage.top_msg_id = messageReplyHeader.reply_to_top_id;
        }
        if ((i11 & 64) != 0) {
            tL_inputReplyToMessage.flags |= 4;
            tL_inputReplyToMessage.quote_text = messageReplyHeader.quote_text;
        }
        if ((i11 & 128) != 0) {
            tL_inputReplyToMessage.flags |= 8;
            tL_inputReplyToMessage.quote_entities = messageReplyHeader.quote_entities;
        }
        return tL_inputReplyToMessage;
    }

    private TL_iv.TL_inputRichMessage toInputRichMessage(TL_iv.RichMessage richMessage) {
        TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
        tL_inputRichMessage.rtl = richMessage.rtl;
        tL_inputRichMessage.blocks = new ArrayList<>(richMessage.blocks.size());
        for (int i10 = 0; i10 < richMessage.blocks.size(); i10++) {
            tL_inputRichMessage.blocks.add(SendMessagesHelper.toInputPageBlock(richMessage.blocks.get(i10)));
        }
        ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < richMessage.photos.size(); i11++) {
                TLRPC.Photo photo = richMessage.photos.get(i11);
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
            for (int i12 = 0; i12 < richMessage.documents.size(); i12++) {
                TLRPC.Document document = richMessage.documents.get(i12);
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

    private void toggleStickerSetInternal(final Context context, int i10, final org.telegram.ui.ActionBar.n2 n2Var, final FrameLayout frameLayout, final boolean z10, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final int i11, final boolean z11) {
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        long j3 = stickerSet.id;
        tL_inputStickerSetID.id = j3;
        if (i10 == 0) {
            markSetUninstalling(j3, true);
            TLRPC.TL_messages_uninstallStickerSet tL_messages_uninstallStickerSet = new TLRPC.TL_messages_uninstallStickerSet();
            tL_messages_uninstallStickerSet.stickerset = tL_inputStickerSetID;
            getConnectionsManager().sendRequest(tL_messages_uninstallStickerSet, new wa(this, stickerSet, i11));
            return;
        }
        TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
        tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
        tL_messages_installStickerSet.archived = i10 == 1;
        markSetInstalling(stickerSet.id, true);
        getConnectionsManager().sendRequest(tL_messages_installStickerSet, new RequestDelegate() { // from class: org.telegram.messenger.b7
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                TLObject tLObject3 = tLObject;
                TLRPC.Document document2 = document;
                int i12 = i11;
                Context context2 = context;
                MediaDataController.this.lambda$toggleStickerSetInternal$114(stickerSet, n2Var, z10, i12, z11, frameLayout, context2, tLObject3, document2, tLObject2, tL_error);
            }
        });
    }

    private void updateEmojiStatuses(int i10, TL_account.TL_emojiStatuses tL_emojiStatuses) {
        getMessagesStorage().getStorageQueue().postRunnable(new q4(this, i10, tL_emojiStatuses, 8));
    }

    private void updateSearchResults() {
        MessageObject messageObject;
        ArrayList arrayList = new ArrayList(this.searchResultMessages);
        this.searchResultMessages.clear();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            MessageObject messageObject2 = null;
            if (i10 >= this.searchServerResultMessages.size()) {
                break;
            }
            MessageObject messageObject3 = this.searchServerResultMessages.get(i10);
            if ((!messageObject3.hasValidGroupId() || messageObject3.isPrimaryGroupMessage) && !hashSet.contains(Integer.valueOf(messageObject3.getId()))) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (((MessageObject) arrayList.get(i11)).getId() == messageObject3.getId()) {
                        messageObject2 = (MessageObject) arrayList.get(i11);
                        break;
                    }
                    i11++;
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
            i10++;
        }
        for (int i12 = 0; i12 < this.searchLocalResultMessages.size(); i12++) {
            MessageObject messageObject4 = this.searchLocalResultMessages.get(i12);
            if (!hashSet.contains(Integer.valueOf(messageObject4.getId()))) {
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        messageObject = null;
                        break;
                    } else {
                        if (((MessageObject) arrayList.get(i13)).getId() == messageObject4.getId()) {
                            messageObject = (MessageObject) arrayList.get(i13);
                            break;
                        }
                        i13++;
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
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new a7(this, str, 0));
    }

    public void addNewStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (this.stickerSetsById.h(tL_messages_stickerSet.set.id) >= 0 || this.stickerSetsByName.containsKey(tL_messages_stickerSet.set.short_name)) {
            return;
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        int i10 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
        this.stickerSets[i10].add(0, tL_messages_stickerSet);
        this.stickerSetsById.k(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
        this.installedStickerSetsById.k(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
        this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name, tL_messages_stickerSet);
        a0.i iVar = new a0.i();
        for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
            iVar.k(document, document.id);
        }
        for (int i12 = 0; i12 < tL_messages_stickerSet.packs.size(); i12++) {
            TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i12);
            String replace = tL_stickerPack.emoticon.replace("️", "");
            tL_stickerPack.emoticon = replace;
            ArrayList<TLRPC.Document> arrayList = this.allStickers.get(replace);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.allStickers.put(tL_stickerPack.emoticon, arrayList);
            }
            for (int i13 = 0; i13 < tL_stickerPack.documents.size(); i13++) {
                Long l4 = tL_stickerPack.documents.get(i13);
                if (this.stickersByEmoji.h(l4.longValue()) < 0) {
                    this.stickersByEmoji.k(tL_stickerPack.emoticon, l4.longValue());
                }
                TLRPC.Document document2 = (TLRPC.Document) iVar.f(l4.longValue());
                if (document2 != null) {
                    arrayList.add(document2);
                }
            }
        }
        this.loadHash[i10] = calcStickersHash(this.stickerSets[i10]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i10), Boolean.TRUE);
        loadStickers(i10, false, true);
    }

    public void addRecentGif(TLRPC.Document document, int i10, boolean z10) {
        if (document == null) {
            return;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.recentGifs.size()) {
                this.recentGifs.add(0, document);
                break;
            }
            TLRPC.Document document2 = this.recentGifs.get(i11);
            if (document2.id == document.id) {
                this.recentGifs.remove(i11);
                this.recentGifs.add(0, document2);
                break;
            }
            i11++;
        }
        if ((this.recentGifs.size() > getMessagesController().savedGifsLimitDefault && !UserConfig.getInstance(this.currentAccount).isPremium()) || this.recentGifs.size() > getMessagesController().savedGifsLimitPremium) {
            getMessagesStorage().getStorageQueue().postRunnable(new z7(1, this, (TLRPC.Document) i2.g.z(1, this.recentGifs)));
            if (z10) {
                AndroidUtilities.runOnUIThread(new d1(document, 26));
            }
        }
        ArrayList<TLRPC.Document> arrayList = new ArrayList<>();
        arrayList.add(document);
        processLoadedRecentDocuments(0, arrayList, true, i10, false);
    }

    public void addRecentSticker(int i10, Object obj, TLRPC.Document document, int i11, boolean z10) {
        int i12;
        int i13 = 0;
        if (i10 != 3) {
            int i14 = 1;
            if (MessageObject.isStickerDocument(document) || MessageObject.isAnimatedStickerDocument(document, true)) {
                int i15 = 0;
                while (true) {
                    if (i15 < this.recentStickers[i10].size()) {
                        TLRPC.Document document2 = this.recentStickers[i10].get(i15);
                        if (document2.id == document.id) {
                            this.recentStickers[i10].remove(i15);
                            if (!z10) {
                                this.recentStickers[i10].add(0, document2);
                            }
                        } else {
                            i15++;
                        }
                    } else if (!z10) {
                        this.recentStickers[i10].add(0, document);
                    }
                }
                if (i10 == 2) {
                    if (z10) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 0, document, 4);
                    } else {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 0, document, Integer.valueOf(this.recentStickers[i10].size() > getMessagesController().maxFaveStickersCount ? 6 : 5));
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
                    getConnectionsManager().sendRequest(tL_messages_faveSticker, new v7(this, obj, tL_messages_faveSticker, i13));
                    i12 = getMessagesController().maxFaveStickersCount;
                } else {
                    if (i10 == 0 && z10) {
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
                        getConnectionsManager().sendRequest(tL_messages_saveRecentSticker, new v7(this, obj, tL_messages_saveRecentSticker, i14));
                    }
                    i12 = getMessagesController().maxRecentStickersCount;
                }
                if (this.recentStickers[i10].size() > i12 || z10) {
                    getMessagesStorage().getStorageQueue().postRunnable(new q4(this, i10, z10 ? document : (TLRPC.Document) i2.g.z(1, this.recentStickers[i10]), 7));
                }
                if (!z10) {
                    ArrayList<TLRPC.Document> arrayList = new ArrayList<>();
                    arrayList.add(document);
                    processLoadedRecentDocuments(i10, arrayList, false, i11, false);
                }
                if (i10 == 2 || (i10 == 0 && z10)) {
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentDocumentsDidLoad, Boolean.FALSE, Integer.valueOf(i10));
                }
            }
        }
    }

    public void addStyle(int i10, int i11, int i12, ArrayList<TLRPC.MessageEntity> arrayList) {
        if ((i10 & 256) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC.TL_messageEntitySpoiler(), i11, i12));
        }
        if ((i10 & 1) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC.TL_messageEntityBold(), i11, i12));
        }
        if ((i10 & 2) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC.TL_messageEntityItalic(), i11, i12));
        }
        if ((i10 & 4) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC.TL_messageEntityCode(), i11, i12));
        }
        if ((i10 & 8) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC.TL_messageEntityStrike(), i11, i12));
        }
        if ((i10 & 16) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC.TL_messageEntityUnderline(), i11, i12));
        }
    }

    public void applyAttachMenuBot(TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot) {
        this.attachMenuBots.bots.add(tL_attachMenuBotsBot.bot);
        loadAttachMenuBots(false, true);
    }

    public boolean areAllTrendingStickerSetsUnread(boolean z10) {
        int size = this.featuredStickerSets[z10 ? 1 : 0].size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = this.featuredStickerSets[z10 ? 1 : 0].get(i10);
            if (!isStickerPackInstalled(stickerSetCovered.set.id) && ((!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) && !this.unreadStickerSets[z10 ? 1 : 0].contains(Long.valueOf(stickerSetCovered.set.id)))) {
                return false;
            }
        }
        return true;
    }

    public boolean areStickersLoaded(int i10) {
        return this.stickersLoaded[i10];
    }

    public void beginTransaction() {
        this.inTransaction = true;
    }

    public boolean botInAttachMenu(long j3) {
        for (int i10 = 0; i10 < this.attachMenuBots.bots.size(); i10++) {
            if (this.attachMenuBots.bots.get(i10).bot_id == j3) {
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
            for (int i10 = 0; i10 < this.hints.size(); i10++) {
                arrayList.add(this.hints.get(i10));
                if (arrayList.size() == g10 - 2) {
                    break;
                }
            }
        }
        Utilities.globalQueue.postRunnable(new m6(this, Build.VERSION.SDK_INT >= 30, arrayList, 4));
    }

    public void calcNewHash(int i10) {
        this.loadHash[i10] = calcStickersHash(this.stickerSets[i10]);
    }

    public boolean canAddStickerToFavorites() {
        return (this.stickersLoaded[0] && this.stickerSets[0].size() < 5 && this.recentStickers[2].isEmpty()) ? false : true;
    }

    public boolean canCreateAttachedMenuBotShortcut(long j3) {
        return true;
    }

    public boolean cancelRemovingStickerSet(long j3) {
        Runnable runnable = (Runnable) this.removingStickerSetsUndos.f(j3);
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
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new n7(this, 7));
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
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new n7(this, 0));
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
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new n7(this, 5));
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

    public void checkStickers(int i10) {
        if (this.loadingStickers[i10]) {
            return;
        }
        if (!this.stickersLoaded[i10] || Math.abs((System.currentTimeMillis() / 1000) - this.loadDate[i10]) >= 3600) {
            loadStickers(i10, true, false);
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
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new n7(this, 9));
    }

    public void cleanDraft(long j3, long j10, boolean z10) {
        a0.i iVar = (a0.i) this.drafts.f(j3);
        TLRPC.DraftMessage draftMessage = iVar != null ? (TLRPC.DraftMessage) iVar.f(j10) : null;
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
                saveDraft(j3, j10, draftMessage.message, draftMessage.entities, null, null, null, 0L, draftMessage.no_webpage, true);
                return;
            }
            return;
        }
        a0.i iVar2 = (a0.i) this.drafts.f(j3);
        if (iVar2 != null) {
            iVar2.l(j10);
            if (iVar2.m() == 0) {
                this.drafts.l(j3);
            }
        }
        a0.i iVar3 = (a0.i) this.draftMessages.f(j3);
        if (iVar3 != null) {
            iVar3.l(j10);
            if (iVar3.m() == 0) {
                this.draftMessages.l(j3);
            }
        }
        if (j10 != 0) {
            SharedPreferences.Editor edit = this.draftPreferences.edit();
            StringBuilder t10 = a4.a.t(j3, "t_", "_");
            t10.append(j10);
            SharedPreferences.Editor remove = edit.remove(t10.toString());
            StringBuilder t11 = a4.a.t(j3, "rt_", "_");
            t11.append(j10);
            remove.remove(t11.toString()).commit();
            return;
        }
        this.draftPreferences.edit().remove("" + j3).remove("r_" + j3).commit();
        getMessagesController().sortDialogs(null);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void cleanup() {
        int i10 = 0;
        while (true) {
            ArrayList<TLRPC.Document>[] arrayListArr = this.recentStickers;
            if (i10 >= arrayListArr.length) {
                break;
            }
            ArrayList<TLRPC.Document> arrayList = arrayListArr[i10];
            if (arrayList != null) {
                arrayList.clear();
            }
            this.loadingRecentStickers[i10] = false;
            this.recentStickersLoaded[i10] = false;
            i10++;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            this.loadHash[i11] = 0;
            this.loadDate[i11] = 0;
            this.stickerSets[i11].clear();
            this.loadingStickers[i11] = false;
            this.stickersLoaded[i11] = false;
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
            Utilities.globalQueue.postRunnable(new u1(14));
        }
        this.verifyingMessages.clear();
        this.loading = false;
        this.loaded = false;
        this.hints.clear();
        this.inlineBots.clear();
        this.guestBots.clear();
        this.webapps.clear();
        AndroidUtilities.runOnUIThread(new i7(this, 9));
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
        AndroidUtilities.runOnUIThread(new z8(this, arrayList, topicKey, 0));
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
        getMessagesStorage().getStorageQueue().postRunnable(new i7(this, 4));
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
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearRecentStickers(), new n7(this, 1));
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
        getMessagesStorage().getStorageQueue().postRunnable(new i7(this, 15));
        buildShortcuts();
    }

    public boolean containsTopPeer(long j3) {
        for (int i10 = 0; i10 < this.hints.size(); i10++) {
            if (DialogObject.getPeerDialogId(this.hints.get(i10).peer) == j3) {
                return true;
            }
        }
        return false;
    }

    public void endTransaction() {
        this.inTransaction = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void fetchEmojiStatuses(int i10, boolean z10) {
        TL_account.getChannelDefaultEmojiStatuses getchanneldefaultemojistatuses;
        boolean[] zArr = this.emojiStatusesFetching;
        if (zArr[i10]) {
            return;
        }
        zArr[i10] = true;
        if (z10) {
            getMessagesStorage().getStorageQueue().postRunnable(new n8(this, i10, 1));
            return;
        }
        if (i10 == 0) {
            TL_account.getRecentEmojiStatuses getrecentemojistatuses = new TL_account.getRecentEmojiStatuses();
            getrecentemojistatuses.hash = this.emojiStatusesHash[i10];
            getchanneldefaultemojistatuses = getrecentemojistatuses;
        } else if (i10 == 1) {
            TL_account.getDefaultEmojiStatuses getdefaultemojistatuses = new TL_account.getDefaultEmojiStatuses();
            getdefaultemojistatuses.hash = this.emojiStatusesHash[i10];
            getchanneldefaultemojistatuses = getdefaultemojistatuses;
        } else {
            TL_account.getChannelDefaultEmojiStatuses getchanneldefaultemojistatuses2 = new TL_account.getChannelDefaultEmojiStatuses();
            getchanneldefaultemojistatuses2.hash = this.emojiStatusesHash[i10];
            getchanneldefaultemojistatuses = getchanneldefaultemojistatuses2;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getchanneldefaultemojistatuses, new o7(this, i10, 3));
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
        t6 t6Var = new t6(this, num, arrayList, z11, z10, arrayListArr, runnable);
        ArrayList arrayList2 = arrayListArr[0];
        if ((arrayList2 != null && !arrayList2.isEmpty()) || this.triedLoadingEmojipacks) {
            t6Var.run();
            return;
        }
        this.triedLoadingEmojipacks = true;
        boolean[] zArr = new boolean[1];
        AndroidUtilities.runOnUIThread(new qk(this, zArr, arrayListArr, t6Var, 19));
        AndroidUtilities.runOnUIThread(new b2(20, zArr, t6Var), 900L);
    }

    public TLRPC.TL_attachMenuBot findBotInAttachMenu(long j3) {
        for (int i10 = 0; i10 < this.attachMenuBots.bots.size(); i10++) {
            if (this.attachMenuBots.bots.get(i10).bot_id == j3) {
                return this.attachMenuBots.bots.get(i10);
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
            getMessagesStorage().getStorageQueue().postRunnable(new z8(this, str, callback, 1));
        }
    }

    public void generateEmojiPreviewThemes(ArrayList<TLRPC.TL_theme> arrayList, int i10) {
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("emojithemes_config_" + i10, 0).edit();
        edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.TL_theme tL_theme = arrayList.get(i11);
            SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
            tL_theme.serializeToStream(serializedData);
            edit.putString("theme_" + i11, Utilities.bytesToHex(serializedData.toByteArray()));
        }
        edit.apply();
        if (arrayList.isEmpty()) {
            this.defaultEmojiThemes.clear();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiPreviewThemesChanged, new Object[0]);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new kp(org.telegram.ui.ActionBar.d4.c(i10)));
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            org.telegram.ui.ActionBar.d4 d = org.telegram.ui.ActionBar.d4.d(i10, arrayList.get(i12));
            kp kpVar = new kp(d);
            if (d.f.size() >= 4) {
                arrayList2.add(kpVar);
            }
        }
        ChatThemeController.chatThemeQueue.postRunnable(new 3(arrayList2, i10));
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
            Utilities.searchQueue.postRunnable(new qk(str, getStickerSets(5), getFeaturedEmojiSets(), callback, 17));
        }
    }

    public int getArchivedStickersCount(int i10) {
        return this.archivedStickersCount[i10];
    }

    public TLRPC.TL_attachMenuBots getAttachMenuBots() {
        return this.attachMenuBots;
    }

    public TL_bots.BotInfo getBotInfoCached(long j3, long j10) {
        return this.botInfos.get(j3 + "_" + j10);
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

    public TLRPC.DraftMessage getDraft(long j3, long j10) {
        a0.i iVar = (a0.i) this.drafts.f(j3);
        if (iVar == null) {
            return null;
        }
        return (TLRPC.DraftMessage) iVar.f(j10);
    }

    public int getDraftFolderId(long j3) {
        return ((Integer) this.draftsFolderIds.g(0, j3)).intValue();
    }

    public TLRPC.Message getDraftMessage(long j3, long j10) {
        a0.i iVar = (a0.i) this.draftMessages.f(j3);
        if (iVar == null) {
            return null;
        }
        return (TLRPC.Message) iVar.f(j10);
    }

    public DraftVoice getDraftVoice(long j3, long j10) {
        loadDraftVoiceMessages();
        return (DraftVoice) this.draftVoices.f(Objects.hash(Long.valueOf(j3), Long.valueOf(j10)));
    }

    public a0.i getDrafts() {
        return this.drafts;
    }

    public TLRPC.Document getEmojiAnimatedSticker(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String replace = charSequence.toString().replace("️", "");
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = getStickerSets(4);
        int size = stickerSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i10);
            int size2 = tL_messages_stickerSet.packs.size();
            for (int i11 = 0; i11 < size2; i11++) {
                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i11);
                if (!tL_stickerPack.documents.isEmpty() && TextUtils.equals(tL_stickerPack.emoticon, replace)) {
                    return (TLRPC.Document) getStickerByIds(4).f(tL_stickerPack.documents.get(0).longValue());
                }
            }
        }
        return null;
    }

    public String getEmojiForSticker(long j3) {
        String str = (String) this.stickersByEmoji.f(j3);
        return str != null ? str : "";
    }

    public void getEmojiNames(String[] strArr, String str, Utilities.Callback<ArrayList<String>> callback) {
        if (callback == null || str == null) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new qk(this, strArr, str, callback, 18));
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
        long j3 = 0;
        for (int i10 = 0; i10 < this.featuredStickerSets[z10 ? 1 : 0].size(); i10++) {
            TLRPC.StickerSet stickerSet = this.featuredStickerSets[z10 ? 1 : 0].get(i10).set;
            if (!stickerSet.archived) {
                j3 = calcHash(j3, stickerSet.id);
            }
        }
        return j3;
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
        int i10 = 1;
        if (this.lastReturnedNum >= this.searchResultMessages.size() - 1) {
            boolean[] zArr = this.messagesSearchEndReached;
            if (zArr[0] && zArr[1]) {
                i10 = 0;
            }
        }
        return this.lastReturnedNum > 0 ? i10 | 2 : i10;
    }

    public void getMediaCount(final long j3, final long j10, final int i10, final int i11, boolean z10) {
        if (z10 || DialogObject.isEncryptedDialog(j3)) {
            getMediaCountDatabase(j3, j10, i10, i11);
            return;
        }
        TLRPC.TL_messages_getSearchCounters tL_messages_getSearchCounters = new TLRPC.TL_messages_getSearchCounters();
        if (i10 == 0) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPhotoVideo());
        } else if (i10 == 1) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterDocument());
        } else if (i10 == 2) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterRoundVoice());
        } else if (i10 == 3) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterUrl());
        } else if (i10 == 4) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterMusic());
        } else if (i10 == 5) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterGif());
        } else if (i10 == 8) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPoll());
        }
        if (j10 != 0) {
            if (j3 == getUserConfig().getClientUserId()) {
                tL_messages_getSearchCounters.saved_peer_id = getMessagesController().getInputPeer(j10);
                tL_messages_getSearchCounters.flags = 4 | tL_messages_getSearchCounters.flags;
            } else {
                tL_messages_getSearchCounters.top_msg_id = (int) j10;
                tL_messages_getSearchCounters.flags |= 1;
            }
        }
        TLRPC.InputPeer inputPeer = getMessagesController().getInputPeer(j3);
        tL_messages_getSearchCounters.peer = inputPeer;
        if (inputPeer == null) {
            return;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getSearchCounters, new RequestDelegate() { // from class: org.telegram.messenger.s7
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MediaDataController.this.lambda$getMediaCount$132(j3, j10, i10, i11, tLObject, tL_error);
            }
        }), i11);
    }

    public void getMediaCounts(long j3, long j10, int i10) {
        getMessagesStorage().getStorageQueue().postRunnable(new t7(this, j10, j3, i10, 0));
    }

    public Pair<Long, TLRPC.DraftMessage> getOneThreadDraft(long j3) {
        a0.i iVar = (a0.i) this.drafts.f(j3);
        if (iVar == null || iVar.m() <= 0) {
            return null;
        }
        return new Pair<>(Long.valueOf(iVar.j(0)), iVar.n(0));
    }

    public Integer getPremiumHintAnnualDiscount(boolean z10) {
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList;
        double d;
        int i10;
        double d10;
        c5.o oVar;
        c5.n nVar;
        c5.n nVar2;
        double d11;
        int i11;
        c5.o oVar2;
        c5.n nVar3;
        if ((z10 && (!BillingController.getInstance().isReady() || BillingController.getInstance().getLastPremiumTransaction() == null)) || (tL_help_premiumPromo = this.premiumPromo) == null) {
            return null;
        }
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList2 = tL_help_premiumPromo.period_options;
        int size = arrayList2.size();
        int i12 = 0;
        double d12 = 0.0d;
        boolean z11 = false;
        int i13 = 0;
        while (i13 < size) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = arrayList2.get(i13);
            i13++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption;
            if (!z10) {
                nVar2 = null;
                if (tL_premiumSubscriptionOption2.months == 1) {
                    if (BuildVars.useInvoiceBilling()) {
                    }
                    d11 = tL_premiumSubscriptionOption2.amount;
                    i11 = tL_premiumSubscriptionOption2.months;
                    d12 = d11 / i11;
                    z11 = true;
                }
            } else if (tL_premiumSubscriptionOption2.current) {
                nVar2 = null;
                if (Objects.equals(tL_premiumSubscriptionOption2.transaction.replaceAll("^(.*?)(?:\\.\\.\\d*|)$", "$1"), BillingController.getInstance().getLastPremiumTransaction())) {
                    if (!BuildVars.useInvoiceBilling() || (oVar2 = BillingController.PREMIUM_PRODUCT_DETAILS) == null) {
                        d11 = tL_premiumSubscriptionOption2.amount;
                        i11 = tL_premiumSubscriptionOption2.months;
                    } else {
                        ArrayList arrayList3 = oVar2.h;
                        int size2 = arrayList3.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size2) {
                                nVar3 = nVar2;
                                break;
                            }
                            Object obj = arrayList3.get(i14);
                            i14++;
                            nVar3 = (c5.n) obj;
                            String str = ((c5.l) nVar3.b.a.get(0)).d;
                            int i15 = tL_premiumSubscriptionOption2.months;
                            if (i15 != 12) {
                                Locale locale = Locale.ROOT;
                                if (str.equals("P" + i15 + "M")) {
                                    break;
                                }
                            } else if (str.equals("P1Y")) {
                                break;
                            }
                        }
                        if (nVar3 == null) {
                            d11 = tL_premiumSubscriptionOption2.amount;
                            i11 = tL_premiumSubscriptionOption2.months;
                        } else {
                            d11 = ((c5.l) nVar3.b.a.get(0)).b;
                            i11 = tL_premiumSubscriptionOption2.months;
                        }
                    }
                    d12 = d11 / i11;
                    z11 = true;
                }
            }
        }
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList4 = this.premiumPromo.period_options;
        int size3 = arrayList4.size();
        int i16 = 0;
        int i17 = 0;
        while (i17 < size3) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = arrayList4.get(i17);
            i17++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption4 = tL_premiumSubscriptionOption3;
            if (z11 && tL_premiumSubscriptionOption4.months == 12) {
                if (BuildVars.useInvoiceBilling() || (oVar = BillingController.PREMIUM_PRODUCT_DETAILS) == null) {
                    arrayList = arrayList4;
                    d = tL_premiumSubscriptionOption4.amount;
                    i10 = tL_premiumSubscriptionOption4.months;
                } else {
                    ArrayList arrayList5 = oVar.h;
                    int size4 = arrayList5.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 >= size4) {
                            arrayList = arrayList4;
                            nVar = null;
                            break;
                        }
                        Object obj2 = arrayList5.get(i18);
                        i18++;
                        nVar = (c5.n) obj2;
                        String str2 = ((c5.l) nVar.b.a.get(i12)).d;
                        int i19 = tL_premiumSubscriptionOption4.months;
                        arrayList = arrayList4;
                        if (i19 != 12) {
                            Locale locale2 = Locale.ROOT;
                            if (str2.equals("P" + i19 + "M")) {
                                break;
                            }
                            arrayList4 = arrayList;
                            i12 = 0;
                        } else {
                            if (str2.equals("P1Y")) {
                                break;
                            }
                            arrayList4 = arrayList;
                            i12 = 0;
                        }
                    }
                    if (nVar == null) {
                        d10 = tL_premiumSubscriptionOption4.amount / tL_premiumSubscriptionOption4.months;
                        i16 = (int) ((1.0d - (d10 / d12)) * 100.0d);
                    } else {
                        d = ((c5.l) nVar.b.a.get(0)).b;
                        i10 = tL_premiumSubscriptionOption4.months;
                    }
                }
                d10 = d / i10;
                i16 = (int) ((1.0d - (d10 / d12)) * 100.0d);
            } else {
                arrayList = arrayList4;
            }
            arrayList4 = arrayList;
            i12 = 0;
        }
        if (!z11 || i16 <= 0) {
            return null;
        }
        return Integer.valueOf(i16);
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

    public ArrayList<TLRPC.Document> getRecentStickers(int i10) {
        return getRecentStickers(i10, false);
    }

    public ArrayList<TLRPC.Document> getRecentStickersNoCopy(int i10) {
        return this.recentStickers[i10];
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

    public a0.i getStickerByIds(int i10) {
        return this.stickersByIds[i10];
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

    public TLRPC.TL_messages_stickerSet getStickerSetById(long j3) {
        return (TLRPC.TL_messages_stickerSet) this.stickerSetsById.f(j3);
    }

    public TLRPC.TL_messages_stickerSet getStickerSetByName(String str) {
        if (str == null) {
            return null;
        }
        return this.stickerSetsByName.get(str.toLowerCase());
    }

    public String getStickerSetName(long j3) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.stickerSetsById.f(j3);
        if (tL_messages_stickerSet != null) {
            return tL_messages_stickerSet.set.short_name;
        }
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.featuredStickerSetsById[0].f(j3);
        if (stickerSetCovered != null) {
            return stickerSetCovered.set.short_name;
        }
        TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) this.featuredStickerSetsById[1].f(j3);
        if (stickerSetCovered2 != null) {
            return stickerSetCovered2.set.short_name;
        }
        return null;
    }

    public ArrayList<TLRPC.TL_messages_stickerSet> getStickerSets(int i10) {
        return i10 == 3 ? this.stickerSets[2] : this.stickerSets[i10];
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
        for (int i10 = 0; i10 < this.recentGifs.size(); i10++) {
            TLRPC.Document document2 = this.recentGifs.get(i10);
            if (document2.id == document.id) {
                this.recentGifs.remove(i10);
                this.recentGifs.add(0, document2);
                return true;
            }
        }
        return false;
    }

    public void increaseGuestRating(long j3) {
        increaseInlineRating(j3, true);
    }

    public void increaseInlineRating(long j3) {
        increaseInlineRating(j3, false);
    }

    public void increasePeerRaiting(long j3) {
        TLRPC.User user;
        if (!getUserConfig().suggestContacts || !DialogObject.isUserDialog(j3) || (user = getMessagesController().getUser(Long.valueOf(j3))) == null || user.bot || user.self) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new c7(this, j3, 1));
    }

    public void increaseWebappRating(long j3) {
        TLRPC.TL_topPeer tL_topPeer;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
        if (user == null || !user.bot) {
            return;
        }
        int max = getUserConfig().webappRatingLoadTime != 0 ? Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - getUserConfig().webappRatingLoadTime) : 60;
        int i10 = 0;
        while (true) {
            if (i10 >= this.webapps.size()) {
                tL_topPeer = null;
                break;
            }
            tL_topPeer = this.webapps.get(i10);
            if (tL_topPeer.peer.user_id == j3) {
                break;
            } else {
                i10++;
            }
        }
        if (tL_topPeer == null) {
            tL_topPeer = new TLRPC.TL_topPeer();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_topPeer.peer = tL_peerUser;
            tL_peerUser.user_id = j3;
            this.webapps.add(tL_topPeer);
        }
        tL_topPeer.rating = Math.exp(max / getMessagesController().ratingDecay) + tL_topPeer.rating;
        Collections.sort(this.webapps, new d(9));
        if (this.webapps.size() > 20) {
            a4.a.x(1, this.webapps);
        }
        savePeer(j3, 2, tL_topPeer.rating);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadWebappsHints, new Object[0]);
    }

    public void installShortcut(long j3, int i10) {
        installShortcut(j3, i10, null);
    }

    public boolean isLoadingStickers(int i10) {
        return this.loadingStickers[i10];
    }

    public boolean isMenuBotsUpdatedLocal() {
        return this.menuBotsUpdatedLocal;
    }

    public boolean isMessageFound(int i10, boolean z10) {
        return this.searchServerResultMessagesMap[z10 ? 1 : 0].indexOfKey(i10) >= 0;
    }

    public boolean isSearchLoading() {
        return this.reqId != 0;
    }

    public boolean isShortcutAdded(long j3, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            String str = (i10 == SHORTCUT_TYPE_USER_OR_CHAT ? "sdid_" : "bdid_") + j3;
            List k10 = g0.f.k(ApplicationLoader.applicationContext);
            for (int i11 = 0; i11 < k10.size(); i11++) {
                if (((g0.c) k10.get(i11)).b.equals(str)) {
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
        for (int i10 = 0; i10 < this.recentStickers[2].size(); i10++) {
            TLRPC.Document document2 = this.recentStickers[2].get(i10);
            if (document2.id == document.id && document2.dc_id == document.dc_id) {
                return true;
            }
        }
        return false;
    }

    public boolean isStickerPackInstalled(long j3) {
        return isStickerPackInstalled(j3, true);
    }

    public boolean isStickerPackUnread(boolean z10, long j3) {
        return this.unreadStickerSets[z10 ? 1 : 0].contains(Long.valueOf(j3));
    }

    public void jumpToSearchedMessage(int i10, int i11) {
        if (i11 < 0 || i11 >= this.searchResultMessages.size()) {
            return;
        }
        this.lastReturnedNum = i11;
        MessageObject messageObject = this.searchResultMessages.get(i11);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i10), Integer.valueOf(messageObject.getId()), Integer.valueOf(getMask()), Long.valueOf(messageObject.getDialogId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.TRUE);
    }

    public void loadArchivedStickersCount(int i10, boolean z10) {
        int i11 = 0;
        if (!z10) {
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            tL_messages_getArchivedStickers.limit = 0;
            tL_messages_getArchivedStickers.masks = i10 == 1;
            tL_messages_getArchivedStickers.emojis = i10 == 5;
            getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new o7(this, i10, i11));
            return;
        }
        int i12 = MessagesController.getNotificationsSettings(this.currentAccount).getInt("archivedStickersCount" + i10, -1);
        if (i12 == -1) {
            loadArchivedStickersCount(i10, false);
        } else {
            this.archivedStickersCount[i10] = i12;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.archivedStickersCountDidLoad, Integer.valueOf(i10));
        }
    }

    public void loadAttachMenuBots(boolean z10, boolean z11) {
        loadAttachMenuBots(z10, z11, null);
    }

    public void loadBotInfo(long j3, long j10, boolean z10, int i10) {
        loadBotInfo(j3, j10, z10, i10, null);
    }

    public void loadBotKeyboard(MessagesStorage.TopicKey topicKey) {
        loadBotKeyboard(topicKey, false);
    }

    public void loadDraftsIfNeed() {
        if (getUserConfig().draftsLoaded || this.loadingDrafts) {
            return;
        }
        this.loadingDrafts = true;
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_getAllDrafts(), new n7(this, 6));
    }

    public void loadEmojiThemes() {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("emojithemes_config_" + this.currentAccount, 0);
        int i10 = sharedPreferences.getInt(NotificationBadge.NewHtcHomeBadger.COUNT, 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new kp(org.telegram.ui.ActionBar.d4.c(this.currentAccount)));
        for (int i11 = 0; i11 < i10; i11++) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(sharedPreferences.getString("theme_" + i11, "")));
            try {
                org.telegram.ui.ActionBar.d4 d = org.telegram.ui.ActionBar.d4.d(this.currentAccount, TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true));
                if (d.f.size() >= 4) {
                    arrayList.add(new kp(d));
                }
                ChatThemeController.chatThemeQueue.postRunnable(new 2(arrayList));
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void loadFeaturedStickers(boolean z10, boolean z11) {
        long j3;
        TLRPC.TL_messages_getFeaturedStickers tL_messages_getFeaturedStickers;
        boolean[] zArr = this.loadingFeaturedStickers;
        if (zArr[z10 ? 1 : 0]) {
            return;
        }
        zArr[z10 ? 1 : 0] = true;
        if (z11) {
            getMessagesStorage().getStorageQueue().postRunnable(new c8(this, z10, 0));
            return;
        }
        if (z10) {
            TLRPC.TL_messages_getFeaturedEmojiStickers tL_messages_getFeaturedEmojiStickers = new TLRPC.TL_messages_getFeaturedEmojiStickers();
            j3 = this.loadFeaturedHash[1];
            tL_messages_getFeaturedEmojiStickers.hash = j3;
            tL_messages_getFeaturedStickers = tL_messages_getFeaturedEmojiStickers;
        } else {
            TLRPC.TL_messages_getFeaturedStickers tL_messages_getFeaturedStickers2 = new TLRPC.TL_messages_getFeaturedStickers();
            j3 = this.loadFeaturedHash[0];
            tL_messages_getFeaturedStickers2.hash = j3;
            tL_messages_getFeaturedStickers = tL_messages_getFeaturedStickers2;
        }
        getConnectionsManager().sendRequest(tL_messages_getFeaturedStickers, new d8(this, z10, j3, 0));
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
            getMessagesStorage().getStorageQueue().postRunnable(new i7(this, 12));
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
        getConnectionsManager().sendRequestTyped(tL_contacts_getTopPeers, new a(), new me(this, 4));
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
    public void loadMedia(final long j3, final int i10, final int i11, final int i12, final int i13, final long j10, int i14, final int i15, final int i16, ah.j1 j1Var, String str) {
        MediaDataController mediaDataController;
        final boolean z10;
        TLRPC.TL_messages_search tL_messages_search;
        if (DialogObject.isChatDialog(j3)) {
            mediaDataController = this;
            if (ChatObject.isChannel(-j3, mediaDataController.currentAccount)) {
                z10 = true;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("load media did " + j3 + " count = " + i10 + " max_id " + i11 + " type = " + i13 + " cache = " + i14 + " classGuid = " + i15);
                }
                if ((i14 == 0 && TextUtils.isEmpty(str)) || DialogObject.isEncryptedDialog(j3)) {
                    mediaDataController.loadMediaDatabase(j3, i10, i11, i12, i13, j10, j1Var, i15, z10, i14, i16);
                    return;
                }
                tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = i10;
                if (i12 == 0) {
                    tL_messages_search.offset_id = i12;
                    tL_messages_search.add_offset = -i10;
                } else {
                    tL_messages_search.offset_id = i11;
                }
                if (j1Var != null) {
                    tL_messages_search.flags |= 8;
                    tL_messages_search.saved_reaction.add(j1Var.g());
                }
                if (i13 != 0) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
                } else if (i13 == 6) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhotos();
                } else if (i13 == 7) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterVideo();
                } else if (i13 == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (i13 == 2) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterRoundVoice();
                } else if (i13 == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (i13 == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                } else if (i13 == 5) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterGif();
                } else if (i13 == 8) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPoll();
                }
                if (TextUtils.isEmpty(str)) {
                    tL_messages_search.q = str;
                } else {
                    tL_messages_search.q = "";
                }
                tL_messages_search.peer = getMessagesController().getInputPeer(j3);
                if (j10 != 0) {
                    if (j3 == getUserConfig().getClientUserId()) {
                        tL_messages_search.saved_peer_id = getMessagesController().getInputPeer(j10);
                        tL_messages_search.flags |= 4;
                    } else {
                        tL_messages_search.top_msg_id = (int) j10;
                        tL_messages_search.flags |= 2;
                    }
                }
                if (tL_messages_search.peer != null) {
                    return;
                }
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() { // from class: org.telegram.messenger.x7
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        MediaDataController.this.lambda$loadMedia$126(j3, i12, i10, i11, i13, j10, i15, z10, i16, tLObject, tL_error);
                    }
                }), i15);
                return;
            }
        } else {
            mediaDataController = this;
        }
        z10 = false;
        if (BuildVars.LOGS_ENABLED) {
        }
        if (i14 == 0) {
        }
        tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i10;
        if (i12 == 0) {
        }
        if (j1Var != null) {
        }
        if (i13 != 0) {
        }
        if (TextUtils.isEmpty(str)) {
        }
        tL_messages_search.peer = getMessagesController().getInputPeer(j3);
        if (j10 != 0) {
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
        int i10 = this.lastReturnedNum;
        this.lastReturnedNum = this.searchResultMessages.size();
        this.loadingMoreSearchMessages = true;
        searchMessagesInChat(null, this.lastDialogId, this.lastMergeDialogId, this.lastGuid, 1, this.lastReplyMessageId, false, this.lastSearchUser, this.lastSearchChat, false, this.lastReaction);
        this.lastReturnedNum = i10;
    }

    public void loadMusic(long j3, long j10, long j11) {
        getMessagesStorage().getStorageQueue().postRunnable(new l0(this, j3, j10, j11, 1));
    }

    public void loadPinnedMessages(final long j3, final int i10, final int i11) {
        if (this.loadingPinnedMessages.h(j3) >= 0) {
            return;
        }
        this.loadingPinnedMessages.k(Boolean.TRUE, j3);
        final TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.peer = getMessagesController().getInputPeer(j3);
        tL_messages_search.limit = 40;
        tL_messages_search.offset_id = i10;
        tL_messages_search.q = "";
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPinned();
        getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() { // from class: org.telegram.messenger.e9
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MediaDataController.this.lambda$loadPinnedMessages$162(i11, tL_messages_search, j3, i10, tLObject, tL_error);
            }
        });
    }

    public void loadPremiumPromo(boolean z10) {
        this.isLoadingPremiumPromo = true;
        if (z10) {
            getMessagesStorage().getStorageQueue().postRunnable(new i7(this, 6));
        } else {
            getConnectionsManager().sendRequest(new TLRPC.TL_help_getPremiumPromo(), new n7(this, 3));
        }
    }

    public void loadReactions(boolean z10, Integer num) {
        this.isLoadingReactions = true;
        if (z10) {
            getMessagesStorage().getStorageQueue().postRunnable(new i7(this, 10));
            return;
        }
        TLRPC.TL_messages_getAvailableReactions tL_messages_getAvailableReactions = new TLRPC.TL_messages_getAvailableReactions();
        tL_messages_getAvailableReactions.hash = num != null ? num.intValue() : this.reactionsUpdateHash;
        getConnectionsManager().sendRequest(tL_messages_getAvailableReactions, new n7(this, 4));
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
            final int i10 = 0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getRecentReactions, new RequestDelegate(this) { // from class: org.telegram.messenger.d9
                public final /* synthetic */ MediaDataController b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i10) {
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
            final int i11 = 1;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getTopReactions, new RequestDelegate(this) { // from class: org.telegram.messenger.d9
                public final /* synthetic */ MediaDataController b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i11) {
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
        getConnectionsManager().sendRequest(r9, new org.telegram.messenger.o7(r7, r8, 1));
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
    
        getConnectionsManager().sendRequest(r9, new org.telegram.messenger.o7(r7, r8, 2));
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
    
        getMessagesStorage().getStorageQueue().postRunnable(new org.telegram.messenger.r8(r7, r9, r8, 0));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [org.telegram.tgnet.TLRPC$TL_messages_getStickers] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [org.telegram.tgnet.TLRPC$TL_messages_getStickers] */
    /* JADX WARN: Type inference failed for: r9v14, types: [org.telegram.tgnet.TLRPC$TL_messages_getFavedStickers] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadRecents(int i10, boolean z10, boolean z11, boolean z12) {
        boolean z13 = false;
        if (!z10) {
            boolean[] zArr = this.loadingRecentStickers;
            if (zArr[i10]) {
            } else {
                zArr[i10] = true;
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
        Throwable th2;
        TLRPC.TL_emojiList tL_emojiList;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("replyicons_" + this.currentAccount, 0);
        TLRPC.TL_emojiList tL_emojiList2 = null;
        String string = sharedPreferences.getString("replyicons", null);
        long j3 = sharedPreferences.getLong("replyicons_last_check", 0L);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                tL_emojiList = (TLRPC.TL_emojiList) TLRPC.EmojiList.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                try {
                    this.replyIconsDefault = tL_emojiList;
                } catch (Throwable th3) {
                    th2 = th3;
                    FileLog.e(th2);
                    tL_emojiList2 = tL_emojiList;
                    if (tL_emojiList2 != null) {
                    }
                    TL_account.getDefaultBackgroundEmojis getdefaultbackgroundemojis = new TL_account.getDefaultBackgroundEmojis();
                    if (tL_emojiList2 != null) {
                    }
                    getConnectionsManager().sendRequest(getdefaultbackgroundemojis, new u6(this, sharedPreferences, 2));
                }
            } catch (Throwable th4) {
                th2 = th4;
                tL_emojiList = null;
            }
            tL_emojiList2 = tL_emojiList;
        }
        if (tL_emojiList2 != null || System.currentTimeMillis() - j3 > 86400000 || BuildVars.DEBUG_PRIVATE_VERSION) {
            TL_account.getDefaultBackgroundEmojis getdefaultbackgroundemojis2 = new TL_account.getDefaultBackgroundEmojis();
            if (tL_emojiList2 != null) {
                getdefaultbackgroundemojis2.hash = tL_emojiList2.hash;
            }
            getConnectionsManager().sendRequest(getdefaultbackgroundemojis2, new u6(this, sharedPreferences, 2));
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
    
        r1 = org.telegram.messenger.w1.k(r13, r9);
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
    public void loadReplyMessagesForMessages(ArrayList<MessageObject> arrayList, long j3, int i10, long j10, Runnable runnable, int i11, Timer timer) {
        a0.i iVar;
        Timer.Task task;
        int i12;
        a0.i iVar2;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        int i13;
        MessageObject messageObject;
        long j11;
        long j12;
        ArrayList<MessageObject> arrayList2 = arrayList;
        boolean z10 = i10 == 1;
        if (DialogObject.isEncryptedDialog(j3)) {
            Timer.Task start = Timer.start(timer, "loadReplyMessagesForMessages: (encrypted) finding messages to load");
            ArrayList arrayList3 = new ArrayList();
            a0.i iVar3 = new a0.i();
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                MessageObject messageObject2 = arrayList2.get(i14);
                if (messageObject2 != null && messageObject2.isReply() && messageObject2.replyMessageObject == null) {
                    long j13 = messageObject2.messageOwner.reply_to.reply_to_random_id;
                    ArrayList arrayList4 = (ArrayList) iVar3.f(j13);
                    if (arrayList4 == null) {
                        arrayList4 = w1.k(j13, iVar3);
                    }
                    arrayList4.add(messageObject2);
                    if (!arrayList3.contains(Long.valueOf(j13))) {
                        arrayList3.add(Long.valueOf(j13));
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                Timer.done(start);
                getMessagesStorage().getStorageQueue().postRunnable(new l8(this, Timer.start(timer, "loadReplyMessagesForMessages (encrypted) storageQueue.postRunnable"), timer, arrayList3, j3, iVar3, runnable));
                return;
            } else {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        a0.i iVar4 = new a0.i();
        a0.i iVar5 = new a0.i();
        Timer.Task start2 = Timer.start(timer, "loadReplyMessagesForMessages: filling replies from the same array");
        int i15 = 0;
        while (true) {
            iVar = null;
            if (i15 >= arrayList2.size()) {
                break;
            }
            MessageObject messageObject3 = arrayList2.get(i15);
            if (messageObject3 != null && !messageObject3.isReplyToStory() && messageObject3.isReply() && messageObject3.getRealId() > 0) {
                TLRPC.MessageReplyHeader messageReplyHeader = messageObject3.messageOwner.reply_to;
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i16 = messageReplyHeader.reply_to_msg_id;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= arrayList2.size()) {
                            break;
                        }
                        if (i15 == i17 || arrayList2.get(i17) == null || arrayList2.get(i17).getRealId() != i16) {
                            i17++;
                        } else {
                            messageObject3.replyMessageObject = arrayList2.get(i17);
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
            i15++;
        }
        Timer.done(start2);
        Timer.Task start3 = Timer.start(timer, "loadReplyMessagesForMessages: gathering ids of missing reply data");
        int i18 = 0;
        while (i18 < arrayList2.size()) {
            MessageObject messageObject4 = arrayList2.get(i18);
            if (messageObject4 == null) {
                task = start3;
                iVar2 = iVar;
            } else {
                int i19 = messageObject4.type;
                if (i19 == 23 || i19 == 24) {
                    task = start3;
                    i12 = i18;
                    iVar2 = iVar;
                    TLRPC.MessageMedia messageMedia2 = messageObject4.messageOwner.media;
                    if (messageMedia2.storyItem == null) {
                        long peerDialogId = DialogObject.getPeerDialogId(messageMedia2.peer);
                        iVar = iVar2 == null ? new a0.i() : iVar2;
                        ArrayList arrayList5 = (ArrayList) iVar.f(peerDialogId);
                        if (arrayList5 == null) {
                            arrayList5 = w1.k(peerDialogId, iVar);
                        }
                        StringBuilder t10 = a4.a.t(peerDialogId, "+story did=", " at ");
                        t10.append(messageObject4.type == 23 ? "forwarded" : "mentioned");
                        t10.append(" #");
                        t10.append(messageObject4.getId());
                        Timer.log(timer, t10.toString());
                        arrayList5.add(messageObject4);
                        if (messageObject4.type == 0 && (message = messageObject4.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                            i13 = 0;
                            while (i13 < messageObject4.messageOwner.media.webpage.attributes.size()) {
                                TLRPC.WebPageAttribute webPageAttribute = messageObject4.messageOwner.media.webpage.attributes.get(i13);
                                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                                    TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute;
                                    if (tL_webPageAttributeStory.storyItem == null) {
                                        long peerDialogId2 = DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer);
                                        if (iVar == null) {
                                            iVar = new a0.i();
                                        }
                                        ArrayList arrayList6 = (ArrayList) iVar.f(peerDialogId2);
                                        if (arrayList6 == null) {
                                            arrayList6 = w1.k(peerDialogId2, iVar);
                                        }
                                        StringBuilder t11 = a4.a.t(peerDialogId2, "+story did=", " at webpage of #");
                                        t11.append(messageObject4.getId());
                                        Timer.log(timer, t11.toString());
                                        arrayList6.add(messageObject4);
                                    } else {
                                        messageObject = messageObject4;
                                        tL_webPageAttributeStory.storyItem = bi.h9.c(this.currentAccount, DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer), tL_webPageAttributeStory.storyItem);
                                        i13++;
                                        messageObject4 = messageObject;
                                    }
                                }
                                messageObject = messageObject4;
                                i13++;
                                messageObject4 = messageObject;
                            }
                        }
                    } else {
                        long peerDialogId3 = DialogObject.getPeerDialogId(messageMedia2.peer);
                        TLRPC.MessageMedia messageMedia3 = messageObject4.messageOwner.media;
                        messageMedia3.storyItem = bi.h9.c(this.currentAccount, peerDialogId3, messageMedia3.storyItem);
                        iVar = iVar2;
                        if (messageObject4.type == 0) {
                            i13 = 0;
                            while (i13 < messageObject4.messageOwner.media.webpage.attributes.size()) {
                            }
                        }
                    }
                } else {
                    if (messageObject4.getRealId() <= 0 || !messageObject4.isReplyToStory()) {
                        task = start3;
                        if (messageObject4.getRealId() > 0 && messageObject4.isReply()) {
                            TLRPC.Message message2 = messageObject4.messageOwner;
                            TLRPC.MessageReplyHeader messageReplyHeader2 = message2.reply_to;
                            int i20 = messageReplyHeader2.reply_to_msg_id;
                            iVar2 = iVar;
                            if (i20 != j10) {
                                TLRPC.Peer peer = messageReplyHeader2.reply_to_peer_id;
                                if (peer != null) {
                                    j11 = 0;
                                    j12 = peer.channel_id;
                                } else {
                                    j11 = 0;
                                    j12 = message2.peer_id.channel_id;
                                }
                            }
                        }
                    } else {
                        TLRPC.Message message3 = messageObject4.messageOwner;
                        if (message3.replyStory == null) {
                            long peerDialogId4 = DialogObject.getPeerDialogId(message3.reply_to.peer);
                            if (iVar == null) {
                                iVar = new a0.i();
                            }
                            ArrayList arrayList7 = (ArrayList) iVar.f(peerDialogId4);
                            if (arrayList7 == null) {
                                arrayList7 = w1.k(peerDialogId4, iVar);
                            }
                            StringBuilder t12 = a4.a.t(peerDialogId4, "+story did=", " at replied #");
                            t12.append(messageObject4.getId());
                            Timer.log(timer, t12.toString());
                            arrayList7.add(messageObject4);
                            task = start3;
                            i12 = i18;
                            if (messageObject4.type == 0) {
                            }
                        } else {
                            long peerDialogId5 = DialogObject.getPeerDialogId(message3.reply_to.peer);
                            TLRPC.Message message4 = messageObject4.messageOwner;
                            task = start3;
                            message4.replyStory = bi.h9.c(this.currentAccount, peerDialogId5, message4.replyStory);
                        }
                    }
                    i12 = i18;
                    iVar2 = iVar;
                    iVar = iVar2;
                    if (messageObject4.type == 0) {
                    }
                }
                i18 = i12 + 1;
                arrayList2 = arrayList;
                start3 = task;
            }
            i12 = i18;
            iVar = iVar2;
            i18 = i12 + 1;
            arrayList2 = arrayList;
            start3 = task;
        }
        a0.i iVar6 = iVar;
        Timer.done(start3);
        if (iVar4.i() && iVar6 == null) {
            if (runnable != null) {
                runnable.run();
            }
        } else {
            getMessagesStorage().getStorageQueue().postRunnable(new m8(this, Timer.start(timer, "loadReplyMessagesForMessages: storageQueue.postRunnable"), iVar6, new AtomicInteger(2), runnable, i11, timer, iVar4, iVar5, z10, j3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadRestrictedStatusEmojis() {
        Throwable th2;
        TLRPC.TL_emojiList tL_emojiList;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("restrictedstatuses_" + this.currentAccount, 0);
        TLRPC.TL_emojiList tL_emojiList2 = null;
        String string = sharedPreferences.getString("restrictedstatuses", null);
        long j3 = sharedPreferences.getLong("restrictedstatuses_last_check", 0L);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                tL_emojiList = (TLRPC.TL_emojiList) TLRPC.EmojiList.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                try {
                    this.restrictedStatusEmojis = tL_emojiList;
                } catch (Throwable th3) {
                    th2 = th3;
                    FileLog.e(th2);
                    tL_emojiList2 = tL_emojiList;
                    if (tL_emojiList2 != null) {
                    }
                    TL_account.getChannelRestrictedStatusEmojis getchannelrestrictedstatusemojis = new TL_account.getChannelRestrictedStatusEmojis();
                    if (tL_emojiList2 != null) {
                    }
                    getConnectionsManager().sendRequest(getchannelrestrictedstatusemojis, new u6(this, sharedPreferences, 0));
                }
            } catch (Throwable th4) {
                th2 = th4;
                tL_emojiList = null;
            }
            tL_emojiList2 = tL_emojiList;
        }
        if (tL_emojiList2 != null || System.currentTimeMillis() - j3 > 86400000) {
            TL_account.getChannelRestrictedStatusEmojis getchannelrestrictedstatusemojis2 = new TL_account.getChannelRestrictedStatusEmojis();
            if (tL_emojiList2 != null) {
                getchannelrestrictedstatusemojis2.hash = tL_emojiList2.hash;
            }
            getConnectionsManager().sendRequest(getchannelrestrictedstatusemojis2, new u6(this, sharedPreferences, 0));
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getDefaultTagReactions, new u6(this, sharedPreferences, 1));
        }
    }

    public void loadStickers(int i10, boolean z10, boolean z11) {
        loadStickers(i10, z10, z11, false, null);
    }

    public void loadStickersByEmojiOrName(String str, boolean z10, boolean z11) {
        if (this.loadingDiceStickerSets.contains(str)) {
            return;
        }
        if (!z10 || this.diceStickerSetsByEmoji.get(str) == null) {
            this.loadingDiceStickerSets.add(str);
            if (z11) {
                getMessagesStorage().getStorageQueue().postRunnable(new i8(this, str, z10, 1));
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
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new u0(this, str, z10, 2));
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
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_readFeaturedStickers(), new d5(12));
        }
    }

    public void markFeaturedStickersByIdAsRead(boolean z10, long j3) {
        if (!this.unreadStickerSets[z10 ? 1 : 0].contains(Long.valueOf(j3)) || this.readingStickerSets[z10 ? 1 : 0].contains(Long.valueOf(j3))) {
            return;
        }
        this.readingStickerSets[z10 ? 1 : 0].add(Long.valueOf(j3));
        TLRPC.TL_messages_readFeaturedStickers tL_messages_readFeaturedStickers = new TLRPC.TL_messages_readFeaturedStickers();
        tL_messages_readFeaturedStickers.id.add(Long.valueOf(j3));
        getConnectionsManager().sendRequest(tL_messages_readFeaturedStickers, new d5(10));
        AndroidUtilities.runOnUIThread(new di.q9(this, z10, j3, 2), 1000L);
    }

    public void markSetInstalling(long j3, boolean z10) {
        this.uninstalledForceStickerSetsById.remove(Long.valueOf(j3));
        if (z10 && !this.installedForceStickerSetsById.contains(Long.valueOf(j3))) {
            this.installedForceStickerSetsById.add(Long.valueOf(j3));
        }
        if (z10) {
            return;
        }
        this.installedForceStickerSetsById.remove(Long.valueOf(j3));
    }

    public void markSetUninstalling(long j3, boolean z10) {
        this.installedForceStickerSetsById.remove(Long.valueOf(j3));
        if (z10 && !this.uninstalledForceStickerSetsById.contains(Long.valueOf(j3))) {
            this.uninstalledForceStickerSetsById.add(Long.valueOf(j3));
        }
        if (z10) {
            return;
        }
        this.uninstalledForceStickerSetsById.remove(Long.valueOf(j3));
    }

    public void moveStickerSetToTop(long j3, boolean z10, boolean z11) {
        int i10 = z10 ? 5 : z11 ? 1 : 0;
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = getStickerSets(i10);
        if (stickerSets != null) {
            for (int i11 = 0; i11 < stickerSets.size(); i11++) {
                if (stickerSets.get(i11).set.id == j3) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i11);
                    stickerSets.remove(i11);
                    stickerSets.add(0, tL_messages_stickerSet);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i10), Boolean.FALSE);
                    return;
                }
            }
        }
    }

    public void onRingtoneUploaded(String str, TLRPC.Document document, boolean z10) {
        this.ringtoneUploaderHashMap.remove(str);
        uf.c cVar = this.ringtoneDataStore;
        ArrayList arrayList = cVar.e;
        boolean z11 = true;
        if (z10) {
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    z11 = false;
                    break;
                } else {
                    if (((uf.b) arrayList.get(i10)).d && str.equals(((uf.b) arrayList.get(i10)).b)) {
                        arrayList.remove(i10);
                        break;
                    }
                    i10++;
                }
            }
        } else {
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    z11 = false;
                    break;
                } else {
                    if (((uf.b) arrayList.get(i11)).d && str.equals(((uf.b) arrayList.get(i11)).b)) {
                        ((uf.b) arrayList.get(i11)).d = false;
                        ((uf.b) arrayList.get(i11)).a = document;
                        break;
                    }
                    i11++;
                }
            }
            if (z11) {
                cVar.h();
            }
        }
        if (z11) {
            NotificationCenter.getInstance(cVar.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
        }
    }

    public void portSavedSearchResults(int i10, ah.j1 j1Var, String str, ArrayList<MessageObject> arrayList, ArrayList<MessageObject> arrayList2, int i11, int i12, boolean z10) {
        this.lastReaction = j1Var;
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
        iArr[0] = i12;
        iArr[1] = 0;
        this.lastReturnedNum = i11;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i10), 0, Integer.valueOf(getMask()), Long.valueOf(getUserConfig().getClientUserId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.TRUE);
    }

    public void preloadDefaultReactions() {
        if (this.reactionsList == null || this.reactionsCacheGenerated || !LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) || this.currentAccount != UserConfig.selectedAccount) {
            return;
        }
        this.reactionsCacheGenerated = true;
        ArrayList arrayList = new ArrayList(this.reactionsList);
        int min = Math.min(arrayList.size(), 10);
        for (int i10 = 0; i10 < min; i10++) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList.get(i10);
            preloadImage(ImageLocation.getForDocument(tL_availableReaction.activate_animation), 0);
            preloadImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), 0);
        }
        for (int i11 = 0; i11 < min; i11++) {
            preloadImage(ImageLocation.getForDocument(((TLRPC.TL_availableReaction) arrayList.get(i11)).effect_animation), 0);
        }
    }

    public void preloadImage(ImageLocation imageLocation, int i10) {
        getFileLoader().loadFile(imageLocation, null, null, i10, 11);
    }

    public void preloadPremiumPreviewStickers() {
        if (!this.previewStickersLoading && this.premiumPreviewStickers.isEmpty()) {
            TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
            tL_messages_getStickers.emoticon = Emoji.fixEmoji("⭐") + Emoji.fixEmoji("⭐");
            tL_messages_getStickers.hash = 0L;
            this.previewStickersLoading = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickers, new n7(this, 2));
            return;
        }
        int i10 = 0;
        while (i10 < Math.min(this.premiumPreviewStickers.size(), 3)) {
            ArrayList<TLRPC.Document> arrayList = this.premiumPreviewStickers;
            TLRPC.Document document = arrayList.get(i10 == 2 ? arrayList.size() - 1 : i10);
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
            i10++;
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

    public boolean processDeletedMessage(int i10, long[] jArr) {
        MessageObject messageObject;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= this.deletedFromResultMessages.size()) {
                messageObject = null;
                break;
            }
            if (this.deletedFromResultMessages.get(i11).getId() == i10) {
                messageObject = this.deletedFromResultMessages.get(i11);
                break;
            }
            i11++;
        }
        if (messageObject != null && messageObject.getDialogId() == getUserConfig().getClientUserId()) {
            boolean processDeletedReactionTags = getMessagesController().processDeletedReactionTags(messageObject.messageOwner);
            jArr[0] = MessageObject.getSavedDialogId(getUserConfig().getClientUserId(), messageObject.messageOwner);
            z10 = processDeletedReactionTags;
        }
        this.deletedFromResultMessages.remove(messageObject);
        return z10;
    }

    public void processLoadedMenuBots(TLRPC.TL_attachMenuBots tL_attachMenuBots, long j3, int i10, boolean z10) {
        boolean z11;
        if (tL_attachMenuBots != null && i10 != 0) {
            this.attachMenuBots = tL_attachMenuBots;
            this.menuBotsUpdateHash = j3;
        }
        SharedPreferences.Editor edit = getMessagesController().getMainSettings().edit();
        this.menuBotsUpdateDate = i10;
        edit.putInt("menuBotsUpdateDate", i10).commit();
        this.menuBotsUpdatedLocal = true;
        if (tL_attachMenuBots != null) {
            if (!z10) {
                getMessagesStorage().putUsersAndChats(tL_attachMenuBots.users, null, true, true);
            }
            getMessagesController().putUsers(tL_attachMenuBots.users, z10);
            AndroidUtilities.runOnUIThread(new i7(this, 1));
            z11 = false;
            for (int i11 = 0; i11 < tL_attachMenuBots.bots.size(); i11++) {
                if (tL_attachMenuBots.bots.get(i11) instanceof TLRPC.TL_attachMenuBot_layer162) {
                    tL_attachMenuBots.bots.get(i11).show_in_attach_menu = true;
                    z11 = true;
                }
            }
        } else {
            z11 = false;
        }
        if (!z10) {
            putMenuBotsToCache(tL_attachMenuBots, j3, i10);
        } else if (z11 || Math.abs((System.currentTimeMillis() / 1000) - i10) >= 3600) {
            loadAttachMenuBots(false, true);
        }
    }

    public void processLoadedPremiumPromo(TLRPC.TL_help_premiumPromo tL_help_premiumPromo, int i10, boolean z10) {
        if (tL_help_premiumPromo != null) {
            this.premiumPromo = tL_help_premiumPromo;
            this.premiumPromoUpdateDate = i10;
            getMessagesController().putUsers(tL_help_premiumPromo.users, z10);
            AndroidUtilities.runOnUIThread(new i7(this, 7));
        }
        if (!z10) {
            if (tL_help_premiumPromo != null) {
                putPremiumPromoToCache(tL_help_premiumPromo, i10);
            }
            this.isLoadingPremiumPromo = false;
        } else if (tL_help_premiumPromo == null || Math.abs((System.currentTimeMillis() / 1000) - i10) >= 86400) {
            loadPremiumPromo(false);
        } else {
            this.isLoadingPremiumPromo = false;
        }
    }

    public void processLoadedReactions(List<TLRPC.TL_availableReaction> list, int i10, int i11, boolean z10) {
        if (list != null && i11 != 0) {
            this.reactionsList.clear();
            this.reactionsMap.clear();
            this.enabledReactionsList.clear();
            this.reactionsList.addAll(list);
            for (int i12 = 0; i12 < this.reactionsList.size(); i12++) {
                this.reactionsList.get(i12).positionInList = i12;
                this.reactionsMap.put(this.reactionsList.get(i12).reaction, this.reactionsList.get(i12));
                if (!this.reactionsList.get(i12).inactive) {
                    this.enabledReactionsList.add(this.reactionsList.get(i12));
                }
            }
            this.reactionsUpdateHash = i10;
        }
        this.reactionsUpdateDate = i11;
        if (list != null) {
            AndroidUtilities.runOnUIThread(new i7(this, 3));
        }
        this.isLoadingReactions = false;
        if (!z10) {
            putReactionsToCache(list, i10, i11);
        } else {
            Math.abs((System.currentTimeMillis() / 1000) - i11);
            loadReactions(false, Integer.valueOf(i10));
        }
    }

    public void processLoadedRecentDocuments(int i10, ArrayList<TLRPC.Document> arrayList, boolean z10, int i11, boolean z11) {
        int i12;
        ArrayList<TLRPC.Document> arrayList2;
        boolean z12;
        int i13;
        if (arrayList != null) {
            i12 = i10;
            arrayList2 = arrayList;
            z12 = z10;
            i13 = i11;
            getMessagesStorage().getStorageQueue().postRunnable(new m9(this, z12, i12, arrayList2, z11, i13));
        } else {
            i12 = i10;
            arrayList2 = arrayList;
            z12 = z10;
            i13 = i11;
        }
        if (i13 == 0) {
            AndroidUtilities.runOnUIThread(new i9(this, z12, i12, arrayList2));
        }
    }

    public void processStickerSetInstallResultArchive(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, int i10, TLRPC.TL_messages_stickerSetInstallResultArchive tL_messages_stickerSetInstallResultArchive) {
        int size = tL_messages_stickerSetInstallResultArchive.sets.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.installedStickerSetsById.l(tL_messages_stickerSetInstallResultArchive.sets.get(i11).set.id);
        }
        loadArchivedStickersCount(i10, false);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needAddArchivedStickers, tL_messages_stickerSetInstallResultArchive.sets);
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = n2Var.getParentActivity();
        org.telegram.ui.ActionBar.n2 n2Var2 = z10 ? n2Var : null;
        ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_stickerSetInstallResultArchive.sets;
        wx0 wx0Var = new wx0(parentActivity);
        TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(0);
        boolean z11 = stickerSetCovered.set.masks;
        org.telegram.ui.ActionBar.b2 b2Var = wx0Var.a;
        if (z11) {
            wx0Var.d = 1;
            b2Var.R = LocaleController.getString(R.string.ArchivedMasksAlertTitle);
        } else {
            wx0Var.d = 0;
            b2Var.R = LocaleController.getString(R.string.ArchivedStickersAlertTitle);
        }
        wx0Var.c = new ArrayList(arrayList);
        wx0Var.e = n2Var2;
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        wx0Var.n(linearLayout);
        TextView textView = new TextView(parentActivity);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        textView.setGravity(w7.x5.y());
        textView.setTextSize(1, 16.0f);
        textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(23.0f), 0);
        if (stickerSetCovered.set.masks) {
            textView.setText(LocaleController.getString(R.string.ArchivedMasksAlertInfo));
        } else {
            textView.setText(LocaleController.getString(R.string.ArchivedStickersAlertInfo));
        }
        linearLayout.addView(textView, w7.x5.n(-2, -2));
        ll0 ll0Var = new ll0(parentActivity, null);
        b2Var.getContext();
        ll0Var.setLayoutManager(new s4.c0(1, false));
        ll0Var.setAdapter(new vx0(wx0Var, parentActivity));
        ll0Var.setVerticalScrollBarEnabled(false);
        ll0Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        ll0Var.setGlowColor(-657673);
        linearLayout.addView(ll0Var, w7.x5.k(0.0f, 10.0f, 0.0f, 0.0f, -1, -2));
        wx0Var.h(LocaleController.getString(R.string.Close), new wo0(6));
        if (n2Var2 != null) {
            wx0Var.k(LocaleController.getString(R.string.Settings), new kv(wx0Var, 23));
        }
        n2Var.showDialog(b2Var);
    }

    public void pushDraftVoiceMessage(long j3, long j10, DraftVoice draftVoice) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0);
        long hash = Objects.hash(Long.valueOf(j3), Long.valueOf(j10));
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
                long j3 = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
                int i10 = 0;
                while (i10 < this.emojiStatuses[0].size()) {
                    if ((this.emojiStatuses[0].get(i10) instanceof TLRPC.TL_emojiStatus) && ((TLRPC.TL_emojiStatus) this.emojiStatuses[0].get(i10)).document_id == j3) {
                        this.emojiStatuses[0].remove(i10);
                        i10--;
                    }
                    i10++;
                }
            }
            this.emojiStatuses[0].add(0, emojiStatus);
            while (this.emojiStatuses[0].size() > 50) {
                a4.a.x(1, this.emojiStatuses[0]);
            }
            TL_account.TL_emojiStatuses tL_emojiStatuses = new TL_account.TL_emojiStatuses();
            tL_emojiStatuses.hash = this.emojiStatusesHash[0];
            tL_emojiStatuses.statuses = this.emojiStatuses[0];
            updateEmojiStatuses(0, tL_emojiStatuses);
        }
    }

    public void putBotInfo(long j3, TL_bots.BotInfo botInfo) {
        if (botInfo == null) {
            return;
        }
        this.botInfos.put(botInfo.user_id + "_" + j3, botInfo);
        getMessagesStorage().getStorageQueue().postRunnable(new b4(this, botInfo, j3, 7));
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
                AndroidUtilities.runOnUIThread(new v6(this, topicKey, message));
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public void putGroupStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.groupStickerSets.k(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
    }

    public void putStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        putStickerSet(tL_messages_stickerSet, true);
    }

    public void removeInline(long j3) {
        removeInline(j3, false);
    }

    public void removeMessageFromResults(int i10) {
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.searchResultMessages.size()) {
            if (i10 == this.searchResultMessages.get(i12).getId()) {
                this.deletedFromResultMessages.add(this.searchResultMessages.remove(i12));
                i12--;
            }
            i12++;
        }
        int i13 = 0;
        while (i13 < this.searchServerResultMessages.size()) {
            if (i10 == this.searchServerResultMessages.get(i13).getId()) {
                this.searchServerResultMessages.remove(i13);
                i13--;
            }
            i13++;
        }
        while (i11 < this.searchLocalResultMessages.size()) {
            if (i10 == this.searchLocalResultMessages.get(i11).getId()) {
                this.searchLocalResultMessages.remove(i11);
                i11--;
            }
            i11++;
        }
    }

    public void removeMultipleStickerSets(Context context, org.telegram.ui.ActionBar.n2 n2Var, ArrayList<TLRPC.TL_messages_stickerSet> arrayList) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (arrayList == null || arrayList.isEmpty() || (tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) i2.g.h(1, arrayList)) == null) {
            return;
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        int i10 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).set.archived = false;
        }
        int[] iArr = new int[arrayList.size()];
        for (int i12 = 0; i12 < this.stickerSets[i10].size(); i12++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.stickerSets[i10].get(i12);
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList.size()) {
                    break;
                }
                if (tL_messages_stickerSet2.set.id == arrayList.get(i13).set.id) {
                    iArr[i13] = i12;
                    this.stickerSets[i10].remove(i12);
                    this.stickerSetsById.l(tL_messages_stickerSet2.set.id);
                    this.installedStickerSetsById.l(tL_messages_stickerSet2.set.id);
                    this.stickerSetsByName.remove(tL_messages_stickerSet2.set.short_name);
                    break;
                }
                i13++;
            }
        }
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList2 = this.stickerSets[i10];
        int i14 = this.loadDate[i10];
        long[] jArr = this.loadHash;
        int i15 = i10;
        long calcStickersHash = calcStickersHash(arrayList2);
        jArr[i15] = calcStickersHash;
        putStickersToCache(i15, arrayList2, i14, calcStickersHash);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i15), Boolean.TRUE);
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            markSetUninstalling(arrayList.get(i16).set.id, true);
        }
        zw0 zw0Var = new zw0(context, tL_messages_stickerSet, arrayList.size(), 0, null, n2Var.getResourceProvider());
        boolean[] zArr = new boolean[1];
        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(context, null, false);
        ocVar.a = new fi.l3(this, zArr, arrayList, i15, iArr, 7);
        ocVar.b = new bi.ia(this, zArr, arrayList, context, n2Var, i15);
        zw0Var.setButton(ocVar);
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            this.removingStickerSetsUndos.k(new d1(ocVar, 25), arrayList.get(i17).set.id);
        }
        org.telegram.ui.Components.qc.g(n2Var, zw0Var, 2750).j();
    }

    public void removePeer(long j3) {
        for (int i10 = 0; i10 < this.hints.size(); i10++) {
            if (this.hints.get(i10).peer.user_id == j3) {
                this.hints.remove(i10);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadHints, new Object[0]);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryCorrespondents();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().getInputPeer(j3);
                deletePeer(j3, 0);
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new d5(11));
                return;
            }
        }
    }

    public void removeRecentGif(TLRPC.Document document) {
        int size = this.recentGifs.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (this.recentGifs.get(i10).id == document.id) {
                this.recentGifs.remove(i10);
                break;
            }
            i10++;
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
        getConnectionsManager().sendRequest(tL_messages_saveGif, new r1(3, this, tL_messages_saveGif));
        getMessagesStorage().getStorageQueue().postRunnable(new z7(0, this, document));
    }

    public void removeWebapp(long j3) {
        for (int i10 = 0; i10 < this.webapps.size(); i10++) {
            if (this.webapps.get(i10).peer.user_id == j3) {
                this.webapps.remove(i10);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsApp();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().getInputPeer(j3);
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new d5(13));
                deletePeer(j3, 2);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadWebappsHints, new Object[0]);
                return;
            }
        }
    }

    public void reorderStickers(int i10, ArrayList<Long> arrayList, boolean z10) {
        Collections.sort(this.stickerSets[i10], new k7(arrayList, 1));
        this.loadHash[i10] = calcStickersHash(this.stickerSets[i10]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i10), Boolean.valueOf(z10));
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
            AndroidUtilities.runOnUIThread(new d7(this, tL_messages_stickerSet, 4));
            z10 = true;
        } else {
            a0.i iVar = new a0.i();
            int size = tL_messages_stickerSet.documents.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.Document document = tL_messages_stickerSet.documents.get(i10);
                iVar.k(document, document.id);
            }
            int size2 = tL_messages_stickerSet2.documents.size();
            z10 = false;
            for (int i11 = 0; i11 < size2; i11++) {
                TLRPC.Document document2 = (TLRPC.Document) iVar.f(tL_messages_stickerSet2.documents.get(i11).id);
                if (document2 != null) {
                    tL_messages_stickerSet2.documents.set(i11, document2);
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
            int i12 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
            putStickersToCache(i12, this.stickerSets[i12], this.loadDate[i12], this.loadHash[i12]);
            if ("AnimatedEmojies".equals(tL_messages_stickerSet.set.short_name)) {
                putStickersToCache(4, this.stickerSets[4], this.loadDate[4], this.loadHash[4]);
            }
        }
    }

    public void saveDraft(long j3, int i10, CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.Message message, boolean z10, long j10) {
        saveDraft(j3, i10, charSequence, arrayList, message, null, null, j10, z10, false);
    }

    public boolean saveToRingtones(TLRPC.Document document) {
        int i10 = 4;
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
        for (int i11 = 0; i11 < document.attributes.size(); i11++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(saveringtone, new r1(i10, this, document));
        return true;
    }

    public boolean searchEndReached() {
        boolean[] zArr = this.messagesSearchEndReached;
        return (zArr[0] && this.lastMergeDialogId == 0 && zArr[1]) || this.loadingSearchLocal || this.loadedPredirectedSearchLocal;
    }

    public void searchMessagesInChat(String str, long j3, long j10, int i10, int i11, long j11, TLRPC.User user, TLRPC.Chat chat, ah.j1 j1Var) {
        searchMessagesInChat(str, j3, j10, i10, i11, j11, false, user, chat, true, j1Var);
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
        getConnectionsManager().sendRequestTyped(tL_messages_searchStickerSets, new a(), new e4(1, callback));
    }

    public SearchStickersKey searchStickers(boolean z10, String str, String str2, Utilities.Callback<ArrayList<TLRPC.Document>> callback) {
        return searchStickers(z10, str, str2, callback, false);
    }

    public void setDoubleTapReaction(String str) {
        MessagesController.getEmojiSettings(this.currentAccount).edit().putString("reaction_on_double_tap", str).apply();
        this.doubleTapReaction = str;
    }

    public void setDraftFolderId(long j3, int i10) {
        this.draftsFolderIds.k(Integer.valueOf(i10), j3);
    }

    public void setDraftVoiceRegion(long j3, long j10, float f7, float f10) {
        DraftVoice draftVoice = getDraftVoice(j3, j10);
        if (draftVoice != null) {
            if (Math.abs(draftVoice.left - f7) >= 0.001f || Math.abs(draftVoice.right - f10) >= 0.001f) {
                draftVoice.left = f7;
                draftVoice.right = f10;
                ApplicationLoader.applicationContext.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).edit().putString(Objects.hash(Long.valueOf(j3), Long.valueOf(j10)) + "", draftVoice.toString()).apply();
            }
        }
    }

    public void setPlaceholderImage(org.telegram.ui.Components.x9 x9Var, String str, String str2, String str3) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = str;
        getInstance(this.currentAccount).getStickerSet(tL_inputStickerSetShortName, 0, false, new g2(str2, x9Var, str3, 3));
    }

    public void setSearchedPosition(int i10) {
        if (i10 < 0 || i10 >= this.searchResultMessages.size()) {
            return;
        }
        this.lastReturnedNum = i10;
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

    public CharSequence substring(CharSequence charSequence, int i10, int i11) {
        return charSequence instanceof SpannableStringBuilder ? charSequence.subSequence(i10, i11) : charSequence instanceof SpannedString ? ((SpannedString) charSequence).subSequence(i10, i11) : TextUtils.substring(charSequence, i10, i11);
    }

    public void toggleDraftVoiceOnce(long j3, long j10, boolean z10) {
        DraftVoice draftVoice = getDraftVoice(j3, j10);
        if (draftVoice == null || draftVoice.once == z10) {
            return;
        }
        draftVoice.once = z10;
        ApplicationLoader.applicationContext.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).edit().putString(Objects.hash(Long.valueOf(j3), Long.valueOf(j10)) + "", draftVoice.toString()).apply();
    }

    public void toggleStickerSet(Context context, TLObject tLObject, int i10, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11) {
        toggleStickerSet(context, tLObject, i10, n2Var, z10, z11, null, true);
    }

    public void toggleStickerSets(ArrayList<TLRPC.StickerSet> arrayList, final int i10, final int i11, final org.telegram.ui.ActionBar.n2 n2Var, final boolean z10) {
        int size = arrayList.size();
        ArrayList<TLRPC.InputStickerSet> arrayList2 = new ArrayList<>(size);
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                break;
            }
            TLRPC.StickerSet stickerSet = arrayList.get(i12);
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            tL_inputStickerSetID.id = stickerSet.id;
            arrayList2.add(tL_inputStickerSetID);
            if (i11 != 0) {
                stickerSet.archived = i11 == 1;
            }
            int size2 = this.stickerSets[i10].size();
            int i13 = 0;
            while (true) {
                if (i13 < size2) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.stickerSets[i10].get(i13);
                    if (tL_messages_stickerSet.set.id == tL_inputStickerSetID.id) {
                        this.stickerSets[i10].remove(i13);
                        if (i11 == 2) {
                            this.stickerSets[i10].add(0, tL_messages_stickerSet);
                        } else {
                            this.stickerSetsById.l(tL_messages_stickerSet.set.id);
                            this.installedStickerSetsById.l(tL_messages_stickerSet.set.id);
                            this.stickerSetsByName.remove(tL_messages_stickerSet.set.short_name);
                        }
                    } else {
                        i13++;
                    }
                }
            }
            i12++;
        }
        this.loadHash[i10] = calcStickersHash(this.stickerSets[i10]);
        putStickersToCache(i10, this.stickerSets[i10], this.loadDate[i10], this.loadHash[i10]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i10), Boolean.TRUE);
        TLRPC.TL_messages_toggleStickerSets tL_messages_toggleStickerSets = new TLRPC.TL_messages_toggleStickerSets();
        tL_messages_toggleStickerSets.stickersets = arrayList2;
        if (i11 == 0) {
            tL_messages_toggleStickerSets.uninstall = true;
        } else if (i11 == 1) {
            tL_messages_toggleStickerSets.archive = true;
        } else if (i11 == 2) {
            tL_messages_toggleStickerSets.unarchive = true;
        }
        getConnectionsManager().sendRequest(tL_messages_toggleStickerSets, new RequestDelegate() { // from class: org.telegram.messenger.g9
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MediaDataController.this.lambda$toggleStickerSets$119(i11, n2Var, z10, i10, tLObject, tL_error);
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
    public void uninstallShortcut(long j3, int i10) {
        TLRPC.Chat chat;
        TLRPC.User user;
        try {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 26) {
                ArrayList arrayList = new ArrayList();
                if (i10 == SHORTCUT_TYPE_USER_OR_CHAT) {
                    arrayList.add("sdid_" + j3);
                    arrayList.add("ndid_" + j3);
                }
                if (i10 == SHORTCUT_TYPE_ATTACHED_BOT) {
                    arrayList.add("bdid_" + j3);
                }
                g0.f.o(ApplicationLoader.applicationContext, arrayList);
                if (i11 >= 30) {
                    di.w9.a(ApplicationLoader.applicationContext.getSystemService(di.w9.d())).removeLongLivedShortcuts(arrayList);
                    return;
                }
                return;
            }
            TLRPC.User user2 = null;
            if (DialogObject.isEncryptedDialog(j3)) {
                TLRPC.EncryptedChat encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j3)));
                if (encryptedChat == null) {
                    return;
                } else {
                    user = getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                }
            } else {
                if (!DialogObject.isUserDialog(j3)) {
                    if (DialogObject.isChatDialog(j3)) {
                        chat = getMessagesController().getChat(Long.valueOf(-j3));
                        if (user2 == null || chat != null) {
                            String formatName = user2 == null ? i10 == SHORTCUT_TYPE_USER_OR_CHAT ? ContactsController.formatName(user2.first_name, user2.last_name) : i10 == SHORTCUT_TYPE_ATTACHED_BOT ? user2.first_name : "" : chat.title;
                            Intent createIntrnalShortcutIntent = i10 != SHORTCUT_TYPE_USER_OR_CHAT ? createIntrnalShortcutIntent(j3) : createIntrnalAttachedBotShortcutIntent(j3);
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
                user = getMessagesController().getUser(Long.valueOf(j3));
            }
            user2 = user;
            chat = null;
            if (user2 == null) {
            }
            if (user2 == null) {
            }
            if (i10 != SHORTCUT_TYPE_USER_OR_CHAT) {
            }
            Intent intent2 = new Intent();
            intent2.putExtra("android.intent.extra.shortcut.INTENT", createIntrnalShortcutIntent);
            intent2.putExtra("android.intent.extra.shortcut.NAME", formatName);
            intent2.putExtra("duplicate", false);
            intent2.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
            ApplicationLoader.applicationContext.sendBroadcast(intent2);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public void updateAttachMenuBotsInCache() {
        if (getAttachMenuBots() != null) {
            putMenuBotsToCache(getAttachMenuBots(), this.menuBotsUpdateHash, this.menuBotsUpdateDate);
        }
    }

    public void updateBotInfo(long j3, TL_update.TL_updateBotCommands tL_updateBotCommands) {
        TL_bots.BotInfo botInfo = this.botInfos.get(tL_updateBotCommands.bot_id + "_" + j3);
        if (botInfo != null) {
            botInfo.commands = tL_updateBotCommands.commands;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botInfoDidLoad, botInfo, 0);
        }
        getMessagesStorage().getStorageQueue().postRunnable(new b4(this, tL_updateBotCommands, j3, 6));
    }

    public void uploadRingtone(String str) {
        if (this.ringtoneUploaderHashMap.containsKey(str)) {
            return;
        }
        this.ringtoneUploaderHashMap.put(str, new uf.d(str, this.currentAccount));
        uf.c cVar = this.ringtoneDataStore;
        cVar.getClass();
        uf.b bVar = new uf.b();
        bVar.b = str;
        int i10 = cVar.d;
        cVar.d = i10 + 1;
        bVar.c = i10;
        bVar.d = true;
        cVar.e.add(bVar);
    }

    public void verifyAnimatedStickerMessage(TLRPC.Message message) {
        verifyAnimatedStickerMessage(message, false);
    }

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

    public static void addTextStyleRuns(TLRPC.DraftMessage draftMessage, Spannable spannable, int i10) {
        addTextStyleRuns(draftMessage.entities, draftMessage.message, spannable, i10);
    }

    public static long calcDocumentsHash(ArrayList<TLRPC.Document> arrayList, int i10) {
        long j3 = 0;
        if (arrayList == null) {
            return 0L;
        }
        int min = Math.min(i10, arrayList.size());
        for (int i11 = 0; i11 < min; i11++) {
            TLRPC.Document document = arrayList.get(i11);
            if (document != null) {
                j3 = calcHash(j3, document.id);
            }
        }
        return j3;
    }

    private void increaseInlineRating(long j3, boolean z10) {
        TLRPC.TL_topPeer tL_topPeer;
        if (getUserConfig().suggestContacts) {
            UserConfig userConfig = getUserConfig();
            int i10 = z10 ? userConfig.botGuestRatingLoadTime : userConfig.botRatingLoadTime;
            int max = i10 != 0 ? Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - i10) : 60;
            ArrayList<TLRPC.TL_topPeer> arrayList = z10 ? this.guestBots : this.inlineBots;
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    tL_topPeer = null;
                    break;
                }
                tL_topPeer = arrayList.get(i11);
                if (tL_topPeer.peer.user_id == j3) {
                    break;
                } else {
                    i11++;
                }
            }
            if (tL_topPeer == null) {
                tL_topPeer = new TLRPC.TL_topPeer();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_topPeer.peer = tL_peerUser;
                tL_peerUser.user_id = j3;
                arrayList.add(tL_topPeer);
            }
            tL_topPeer.rating = Math.exp(max / getMessagesController().ratingDecay) + tL_topPeer.rating;
            Collections.sort(arrayList, new d(12));
            if (arrayList.size() > 20) {
                a4.a.x(1, arrayList);
            }
            savePeer(j3, z10 ? 3 : 1, tL_topPeer.rating);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(z10 ? NotificationCenter.reloadGuestBotHints : NotificationCenter.reloadInlineHints, new Object[0]);
        }
    }

    private void processLoadStickersResponse(int i10, TLRPC.TL_messages_allStickers tL_messages_allStickers, Runnable runnable) {
        final TLRPC.TL_messages_allStickers tL_messages_allStickers2;
        final a0.i iVar;
        final int i11;
        final ArrayList<TLRPC.TL_messages_stickerSet> arrayList = new ArrayList<>();
        if (tL_messages_allStickers.sets.isEmpty()) {
            processLoadedStickers(i10, arrayList, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2, runnable);
            return;
        }
        MediaDataController mediaDataController = this;
        int i12 = i10;
        a0.i iVar2 = new a0.i();
        int i13 = 0;
        while (i13 < tL_messages_allStickers.sets.size()) {
            final TLRPC.StickerSet stickerSet = tL_messages_allStickers.sets.get(i13);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) mediaDataController.stickerSetsById.f(stickerSet.id);
            if (tL_messages_stickerSet != null) {
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                if (stickerSet2.hash == stickerSet.hash) {
                    stickerSet2.archived = stickerSet.archived;
                    stickerSet2.installed = stickerSet.installed;
                    stickerSet2.official = stickerSet.official;
                    iVar2.k(tL_messages_stickerSet, stickerSet2.id);
                    arrayList.add(tL_messages_stickerSet);
                    if (iVar2.m() == tL_messages_allStickers.sets.size()) {
                        mediaDataController.processLoadedStickers(i12, arrayList, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2);
                    }
                    tL_messages_allStickers2 = tL_messages_allStickers;
                    iVar = iVar2;
                    i11 = i13;
                    i13 = i11 + 1;
                    mediaDataController = this;
                    iVar2 = iVar;
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
            iVar = iVar2;
            i11 = i13;
            final int i14 = i12;
            i12 = i14;
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate() { // from class: org.telegram.messenger.u8
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MediaDataController.this.lambda$processLoadStickersResponse$74(arrayList, i11, iVar, stickerSet, tL_messages_allStickers2, i14, tLObject, tL_error);
                }
            });
            i13 = i11 + 1;
            mediaDataController = this;
            iVar2 = iVar;
            tL_messages_allStickers = tL_messages_allStickers2;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    private void processLoadedStickers(int i10, ArrayList<TLRPC.TL_messages_stickerSet> arrayList, boolean z10, int i11, long j3, Runnable runnable) {
        AndroidUtilities.runOnUIThread(new n8(this, i10, 0));
        Utilities.stageQueue.postRunnable(new o8(this, z10, arrayList, i11, j3, i10, runnable));
    }

    private void removeInline(long j3, boolean z10) {
        ArrayList<TLRPC.TL_topPeer> arrayList = z10 ? this.guestBots : this.inlineBots;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10).peer.user_id == j3) {
                arrayList.remove(i10);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsInline();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().getInputPeer(j3);
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new d5(9));
                deletePeer(j3, z10 ? 3 : 1);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(z10 ? NotificationCenter.reloadGuestBotHints : NotificationCenter.reloadInlineHints, new Object[0]);
                return;
            }
        }
    }

    public void clearBotKeyboard(long j3) {
        AndroidUtilities.runOnUIThread(new c7(this, j3, 2));
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
            getMessagesStorage().getStorageQueue().postRunnable(new b8(this, str, 3));
        }
    }

    public void getEmojiSuggestions(String[] strArr, String str, boolean z10, KeywordResultCallback keywordResultCallback, CountDownLatch countDownLatch, boolean z11) {
        getEmojiSuggestions(strArr, str, z10, keywordResultCallback, countDownLatch, z11, false, false, null);
    }

    public ArrayList<TLRPC.MessageEntity> getEntities(CharSequence[] charSequenceArr, boolean z10, boolean z11) {
        int i10;
        int indexOf;
        int i11;
        int i12;
        int i13;
        ArrayList<TLRPC.MessageEntity> arrayList = null;
        if (charSequenceArr != null && charSequenceArr[0] != null) {
            int i14 = -1;
            boolean z12 = false;
            int i15 = 0;
            loop0: while (true) {
                i10 = -1;
                while (true) {
                    if (!z11) {
                        break loop0;
                    }
                    indexOf = TextUtils.indexOf(charSequenceArr[0], !z12 ? "`" : "```", i15);
                    if (indexOf == i14) {
                        break loop0;
                    }
                    if (i10 != i14) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        for (int i16 = (z12 ? 3 : 1) + indexOf; i16 < charSequenceArr[0].length() && charSequenceArr[0].charAt(i16) == '`'; i16++) {
                            indexOf++;
                        }
                        i11 = (z12 ? 3 : 1) + indexOf;
                        if (!z12) {
                            i12 = i10 + 1;
                            if (i12 == indexOf) {
                                break;
                            }
                            CharSequence charSequence = charSequenceArr[0];
                            if (!(charSequence instanceof Spanned) || ((CodeHighlighting.Span[]) ((Spanned) charSequence).getSpans(Utilities.clamp(i10, charSequence.length(), 0), Utilities.clamp(i12, charSequenceArr[0].length(), 0), CodeHighlighting.Span.class)).length <= 0) {
                                break;
                            }
                            i15 = i11;
                            i14 = -1;
                        } else {
                            char charAt = i10 > 0 ? charSequenceArr[0].charAt(i10 - 1) : (char) 0;
                            int i17 = (charAt == ' ' || charAt == '\n') ? 1 : 0;
                            int i18 = i10 + 3;
                            int indexOf2 = TextUtils.indexOf(charSequenceArr[0], '\n', i18);
                            String substring = (indexOf2 < 0 || indexOf2 - i18 <= 0) ? "" : charSequenceArr[0].toString().substring(i18, indexOf2);
                            CharSequence substring2 = substring(charSequenceArr[0], 0, i10 - i17);
                            int length = substring.length() + i18 + (!substring.isEmpty());
                            if (length >= 0 && length < charSequenceArr[0].length() && length <= indexOf) {
                                CharSequence substring3 = substring(charSequenceArr[0], length, indexOf);
                                int i19 = indexOf + 3;
                                char charAt2 = i19 < charSequenceArr[0].length() ? charSequenceArr[0].charAt(i19) : (char) 0;
                                CharSequence charSequence2 = charSequenceArr[0];
                                CharSequence substring4 = substring(charSequence2, i19 + ((charAt2 == ' ' || charAt2 == '\n') ? 1 : 0), charSequence2.length());
                                if (substring2.length() != 0) {
                                    substring2 = AndroidUtilities.concat(substring2, "\n");
                                } else {
                                    i17 = 1;
                                }
                                if (substring4.length() > 0 && substring4.charAt(0) != '\n') {
                                    substring4 = AndroidUtilities.concat("\n", substring4);
                                }
                                if (substring3.length() <= 0 || substring3.charAt(substring3.length() - 1) != '\n') {
                                    i13 = 0;
                                } else {
                                    substring3 = substring(substring3, 0, substring3.length() - 1);
                                    i13 = 1;
                                }
                                if (!TextUtils.isEmpty(substring3)) {
                                    if (substring3.length() > 1 && substring3.charAt(0) == '\n') {
                                        substring3 = substring3.subSequence(1, substring3.length());
                                        indexOf--;
                                    }
                                    charSequenceArr[0] = AndroidUtilities.concat(substring2, substring3, substring4);
                                    TLRPC.MessageEntity tL_messageEntityPre = new TLRPC.TL_messageEntityPre();
                                    tL_messageEntityPre.offset = (i17 ^ 1) + i10;
                                    tL_messageEntityPre.length = ((((indexOf - i10) - 3) - (substring.length() + (!substring.isEmpty()))) + (i17 ^ 1)) - i13;
                                    if (TextUtils.isEmpty(substring) || substring.trim().length() == 0) {
                                        substring = "";
                                    }
                                    tL_messageEntityPre.language = substring;
                                    arrayList.add(tL_messageEntityPre);
                                    i11 -= 6;
                                }
                            }
                            i15 = i11;
                            i14 = -1;
                        }
                    } else {
                        z12 = charSequenceArr[0].length() - indexOf > 2 && charSequenceArr[0].charAt(indexOf + 1) == '`' && charSequenceArr[0].charAt(indexOf + 2) == '`';
                        i10 = indexOf;
                        i15 = indexOf + (z12 ? 3 : 1);
                    }
                }
                CharSequence substring5 = substring(charSequenceArr[0], 0, i10);
                CharSequence substring6 = substring(charSequenceArr[0], i12, indexOf);
                CharSequence charSequence3 = charSequenceArr[0];
                charSequenceArr[0] = AndroidUtilities.concat(substring5, substring6, substring(charSequence3, indexOf + 1, charSequence3.length()));
                TLRPC.MessageEntity tL_messageEntityCode = new TLRPC.TL_messageEntityCode();
                tL_messageEntityCode.offset = i10;
                tL_messageEntityCode.length = (indexOf - i10) - 1;
                arrayList.add(tL_messageEntityCode);
                i11 -= 2;
                i15 = i11;
                i14 = -1;
                z12 = false;
            }
            if (i10 != i14 && z12) {
                CharSequence substring7 = substring(charSequenceArr[0], 0, i10);
                CharSequence charSequence4 = charSequenceArr[0];
                charSequenceArr[0] = AndroidUtilities.concat(substring7, substring(charSequence4, i10 + 2, charSequence4.length()));
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                TLRPC.MessageEntity tL_messageEntityCode2 = new TLRPC.TL_messageEntityCode();
                tL_messageEntityCode2.offset = i10;
                tL_messageEntityCode2.length = 1;
                arrayList.add(tL_messageEntityCode2);
            }
            CharSequence charSequence5 = charSequenceArr[0];
            if (charSequence5 instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence5;
                o01[] o01VarArr = (o01[]) spanned.getSpans(0, charSequence5.length(), o01.class);
                if (o01VarArr != null && o01VarArr.length > 0) {
                    for (o01 o01Var : o01VarArr) {
                        int spanStart = spanned.getSpanStart(o01Var);
                        int spanEnd = spanned.getSpanEnd(o01Var);
                        if (!checkInclusion(spanStart, arrayList, false) && !checkInclusion(spanEnd, arrayList, true) && !checkIntersection(spanStart, spanEnd, arrayList)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                            }
                            addStyle(o01Var.b.a, spanStart, spanEnd, arrayList);
                        }
                    }
                }
                o51[] o51VarArr = (o51[]) spanned.getSpans(0, charSequenceArr[0].length(), o51.class);
                if (o51VarArr != null && o51VarArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    for (int i20 = 0; i20 < o51VarArr.length; i20++) {
                        TLRPC.TL_inputMessageEntityMentionName tL_inputMessageEntityMentionName = new TLRPC.TL_inputMessageEntityMentionName();
                        TLRPC.InputUser inputUser = getMessagesController().getInputUser(Utilities.parseLong(o51VarArr[i20].getURL()).longValue());
                        tL_inputMessageEntityMentionName.user_id = inputUser;
                        if (inputUser != null) {
                            tL_inputMessageEntityMentionName.offset = spanned.getSpanStart(o51VarArr[i20]);
                            tL_inputMessageEntityMentionName.length = Math.min(spanned.getSpanEnd(o51VarArr[i20]), charSequenceArr[0].length()) - tL_inputMessageEntityMentionName.offset;
                            if (charSequenceArr[0].charAt((r11 + r8) - 1) == ' ') {
                                tL_inputMessageEntityMentionName.length--;
                            }
                            arrayList.add(tL_inputMessageEntityMentionName);
                        }
                    }
                }
                n51[] n51VarArr = (n51[]) spanned.getSpans(0, charSequenceArr[0].length(), n51.class);
                if (n51VarArr != null && n51VarArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    for (int i21 = 0; i21 < n51VarArr.length; i21++) {
                        TLRPC.MessageEntity tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
                        tL_messageEntityTextUrl.offset = spanned.getSpanStart(n51VarArr[i21]);
                        tL_messageEntityTextUrl.length = Math.min(spanned.getSpanEnd(n51VarArr[i21]), charSequenceArr[0].length()) - tL_messageEntityTextUrl.offset;
                        tL_messageEntityTextUrl.url = n51VarArr[i21].getURL();
                        arrayList.add(tL_messageEntityTextUrl);
                        n01 n01Var = n51VarArr[i21].a;
                        if (n01Var != null) {
                            int i22 = n01Var.a;
                            int i23 = tL_messageEntityTextUrl.offset;
                            addStyle(i22, i23, tL_messageEntityTextUrl.length + i23, arrayList);
                        }
                    }
                }
                org.telegram.ui.Components.z5[] z5VarArr = (org.telegram.ui.Components.z5[]) spanned.getSpans(0, charSequenceArr[0].length(), org.telegram.ui.Components.z5.class);
                if (z5VarArr != null && z5VarArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    ArrayList<TLRPC.MessageEntity> arrayList2 = arrayList;
                    for (org.telegram.ui.Components.z5 z5Var : z5VarArr) {
                        if (z5Var != null) {
                            try {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                                tL_messageEntityCustomEmoji.offset = spanned.getSpanStart(z5Var);
                                tL_messageEntityCustomEmoji.length = Math.min(spanned.getSpanEnd(z5Var), charSequenceArr[0].length()) - tL_messageEntityCustomEmoji.offset;
                                tL_messageEntityCustomEmoji.document_id = z5Var.getDocumentId();
                                tL_messageEntityCustomEmoji.document = z5Var.document;
                                arrayList2.add(tL_messageEntityCustomEmoji);
                            } catch (Exception e7) {
                                FileLog.e(e7);
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
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                        }
                    }
                    arrayList = arrayList3;
                }
                si0[] si0VarArr = (si0[]) spanned.getSpans(0, charSequenceArr[0].length(), si0.class);
                if (si0VarArr != null && si0VarArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    ArrayList<TLRPC.MessageEntity> arrayList4 = arrayList;
                    for (si0 si0Var : si0VarArr) {
                        if (si0Var != null) {
                            try {
                                TLRPC.MessageEntity tL_messageEntityBlockquote = new TLRPC.TL_messageEntityBlockquote();
                                tL_messageEntityBlockquote.offset = spanned.getSpanStart(si0Var);
                                tL_messageEntityBlockquote.length = Math.min(spanned.getSpanEnd(si0Var), charSequenceArr[0].length()) - tL_messageEntityBlockquote.offset;
                                tL_messageEntityBlockquote.collapsed = si0Var.e;
                                arrayList4.add(tL_messageEntityBlockquote);
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                        }
                    }
                    arrayList = arrayList4;
                }
                h10[] h10VarArr = (h10[]) spanned.getSpans(0, charSequenceArr[0].length(), h10.class);
                if (h10VarArr != null && h10VarArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    ArrayList<TLRPC.MessageEntity> arrayList5 = arrayList;
                    for (h10 h10Var : h10VarArr) {
                        if (h10Var != null) {
                            try {
                                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                                tL_messageEntityFormattedDate.offset = spanned.getSpanStart(h10Var);
                                tL_messageEntityFormattedDate.length = Math.min(spanned.getSpanEnd(h10Var), charSequenceArr[0].length()) - tL_messageEntityFormattedDate.offset;
                                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate2 = h10Var.b;
                                tL_messageEntityFormattedDate.relative = tL_messageEntityFormattedDate2.relative;
                                tL_messageEntityFormattedDate.short_time = tL_messageEntityFormattedDate2.short_time;
                                tL_messageEntityFormattedDate.long_time = tL_messageEntityFormattedDate2.long_time;
                                tL_messageEntityFormattedDate.long_date = tL_messageEntityFormattedDate2.long_date;
                                tL_messageEntityFormattedDate.short_date = tL_messageEntityFormattedDate2.short_date;
                                tL_messageEntityFormattedDate.day_of_week = tL_messageEntityFormattedDate2.day_of_week;
                                tL_messageEntityFormattedDate.date = tL_messageEntityFormattedDate2.date;
                                arrayList5.add(tL_messageEntityFormattedDate);
                            } catch (Exception e12) {
                                FileLog.e(e12);
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
                        for (int i24 = 0; i24 < uRLSpanArr.length; i24++) {
                            URLSpan uRLSpan = uRLSpanArr[i24];
                            if (!(uRLSpan instanceof n51) && !(uRLSpan instanceof o51) && !(uRLSpan instanceof h10)) {
                                TLRPC.MessageEntity tL_messageEntityUrl = new TLRPC.TL_messageEntityUrl();
                                tL_messageEntityUrl.offset = spanned.getSpanStart(uRLSpanArr[i24]);
                                tL_messageEntityUrl.length = Math.min(spanned.getSpanEnd(uRLSpanArr[i24]), charSequenceArr[0].length()) - tL_messageEntityUrl.offset;
                                tL_messageEntityUrl.url = uRLSpanArr[i24].getURL();
                                arrayList.add(tL_messageEntityUrl);
                                spannable.removeSpan(uRLSpanArr[i24]);
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
                int i25 = 1;
                charSequence6 = charSequence6.subSequence(1, charSequence6.length());
                int i26 = 0;
                while (i26 < arrayList.size()) {
                    TLRPC.MessageEntity messageEntity = arrayList.get(i26);
                    int i27 = messageEntity.offset;
                    if (i27 == 0) {
                        messageEntity.length -= i25;
                    }
                    messageEntity.offset = Math.max(0, i27 - 1);
                    i26++;
                    i25 = 1;
                }
            }
            while (charSequence6.length() > 0 && (charSequence6.charAt(charSequence6.length() - 1) == '\n' || charSequence6.charAt(charSequence6.length() - 1) == ' ')) {
                charSequence6 = charSequence6.subSequence(0, charSequence6.length() - 1);
                for (int i28 = 0; i28 < arrayList.size(); i28++) {
                    TLRPC.MessageEntity messageEntity2 = arrayList.get(i28);
                    if (messageEntity2.offset + messageEntity2.length > charSequence6.length()) {
                        messageEntity2.length--;
                    }
                }
            }
            charSequenceArr[0] = charSequence6;
        }
        return arrayList;
    }

    public ArrayList<TLRPC.Document> getRecentStickers(int i10, boolean z10) {
        ArrayList<TLRPC.Document> arrayList = this.recentStickers[i10];
        if (i10 == 7) {
            return new ArrayList<>(this.recentStickers[i10]);
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
    public void installShortcut(long j3, int i10, Utilities.Callback<Boolean> callback) {
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
        int i11;
        PendingIntent pendingIntent2;
        String string;
        try {
            Intent createIntrnalShortcutIntent = i10 == SHORTCUT_TYPE_USER_OR_CHAT ? createIntrnalShortcutIntent(j3) : createIntrnalAttachedBotShortcutIntent(j3);
            if (createIntrnalShortcutIntent == null) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
            }
            if (DialogObject.isEncryptedDialog(j3)) {
                TLRPC.EncryptedChat encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j3)));
                if (encryptedChat == null) {
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                        return;
                    }
                    return;
                }
                user2 = getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
            } else if (DialogObject.isUserDialog(j3)) {
                user2 = getMessagesController().getUser(Long.valueOf(j3));
            } else {
                if (!DialogObject.isChatDialog(j3)) {
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                        return;
                    }
                    return;
                }
                chat = getMessagesController().getChat(Long.valueOf(-j3));
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
                    if (i10 != SHORTCUT_TYPE_ATTACHED_BOT) {
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
                                } catch (Throwable th2) {
                                    th = th2;
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
                                    org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(0, user);
                                    if (UserObject.isReplyUser(user)) {
                                        i9Var.g(12);
                                    } else {
                                        i9Var.g(1);
                                    }
                                    i9Var.setBounds(0, 0, dp, dp);
                                    i9Var.draw(canvas);
                                    i11 = dp;
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
                                    i11 = dp;
                                    bitmapRect.set(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
                                    canvas.drawRoundRect(bitmapRect, bitmap.getWidth(), bitmap.getHeight(), roundPaint);
                                    canvas.restore();
                                }
                                Drawable drawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.book_logo);
                                int dp2 = AndroidUtilities.dp(15.0f);
                                int i12 = i11 - dp2;
                                int dp3 = i12 - AndroidUtilities.dp(2.0f);
                                int dp4 = i12 - AndroidUtilities.dp(2.0f);
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
                        String str3 = i10 == SHORTCUT_TYPE_USER_OR_CHAT ? "sdid_" : "bdid_";
                        Context context = ApplicationLoader.applicationContext;
                        g0.c cVar = new g0.c();
                        cVar.a = context;
                        cVar.b = str3 + j3;
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
                    str = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3)));
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
                int i122 = i11 - dp22;
                int dp32 = i122 - AndroidUtilities.dp(2.0f);
                int dp42 = i122 - AndroidUtilities.dp(2.0f);
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
            int i1222 = i11 - dp222;
            int dp322 = i1222 - AndroidUtilities.dp(2.0f);
            int dp422 = i1222 - AndroidUtilities.dp(2.0f);
            Bitmap bitmap222 = bitmap;
            drawable22.setBounds(dp322, dp422, dp322 + dp222, dp422 + dp222);
            drawable22.draw(canvas22);
            pendingIntent = null;
            canvas22.setBitmap(null);
            bitmap = createBitmap22;
            if (Build.VERSION.SDK_INT >= 26) {
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public boolean isStickerPackInstalled(long j3, boolean z10) {
        if (this.installedStickerSetsById.h(j3) >= 0 || (z10 && this.installedForceStickerSetsById.contains(Long.valueOf(j3)))) {
            return (z10 && this.uninstalledForceStickerSetsById.contains(Long.valueOf(j3))) ? false : true;
        }
        return false;
    }

    public void loadAttachMenuBots(boolean z10, boolean z11, Runnable runnable) {
        this.isLoadingMenuBots = true;
        if (z10) {
            getMessagesStorage().getStorageQueue().postRunnable(new i7(this, 13));
            return;
        }
        TLRPC.TL_messages_getAttachMenuBots tL_messages_getAttachMenuBots = new TLRPC.TL_messages_getAttachMenuBots();
        tL_messages_getAttachMenuBots.hash = z11 ? 0L : this.menuBotsUpdateHash;
        getConnectionsManager().sendRequest(tL_messages_getAttachMenuBots, new r1(5, this, runnable));
    }

    public void loadBotInfo(long j3, long j10, boolean z10, int i10, Utilities.Callback<TL_bots.BotInfo> callback) {
        if (z10) {
            TL_bots.BotInfo botInfo = this.botInfos.get(j3 + "_" + j10);
            if (botInfo != null) {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botInfoDidLoad, botInfo, Integer.valueOf(i10));
                return;
            }
        }
        getMessagesStorage().getStorageQueue().postRunnable(new o9(this, j3, j10, callback, i10, 0));
    }

    public void loadBotKeyboard(MessagesStorage.TopicKey topicKey, boolean z10) {
        TLRPC.Message message = this.botKeyboards.get(topicKey);
        if (message != null) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, message, topicKey);
        } else {
            getMessagesStorage().getStorageQueue().postRunnable(new m6(this, topicKey, z10, 3));
        }
    }

    public void loadStickers(int i10, boolean z10, boolean z11, boolean z12) {
        loadStickers(i10, z10, z11, z12, null);
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
        int i10 = 0;
        while (true) {
            ArrayList<TLRPC.TL_messages_stickerSet>[] arrayListArr = this.stickerSets;
            if (i10 >= arrayListArr.length) {
                break;
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList = arrayListArr[i10];
            if (arrayList != null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList.get(i11);
                    if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.id == tL_messages_stickerSet.set.id) {
                        arrayList.set(i11, tL_messages_stickerSet);
                    }
                }
            }
            i10++;
        }
        if (this.groupStickerSets.d(tL_messages_stickerSet.set.id)) {
            this.groupStickerSets.k(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
        }
        saveStickerSetIntoCache(tL_messages_stickerSet);
        TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet.set;
        int i12 = stickerSet3.masks ? 1 : stickerSet3.emojis ? 5 : 0;
        if (z10) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i12), Boolean.TRUE);
        }
    }

    public void saveDraft(long j3, long j10, CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.Message message, sn snVar, TLRPC.SuggestedPost suggestedPost, long j11, boolean z10, boolean z11) {
        saveDraft(j3, j10, charSequence, arrayList, message, snVar, suggestedPost, j11, z10, z11, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void searchMessagesInChat(String str, final long j3, final long j10, final int i10, final int i11, final long j11, boolean z10, final TLRPC.User user, final TLRPC.Chat chat, final boolean z11, final ah.j1 j1Var) {
        String str2;
        long j12;
        int i12;
        long j13;
        int i13;
        boolean z12;
        boolean[] zArr;
        long j14;
        TLRPC.User user2;
        TLRPC.Chat chat2;
        ah.j1 j1Var2;
        String str3;
        char c10;
        TLRPC.InputPeer inputPeer;
        final int i14;
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
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsLoading, Integer.valueOf(i10));
            }
            str2 = str;
            j12 = j3;
            i12 = 0;
        } else {
            if (this.searchResultMessages.isEmpty()) {
                this.loadingMoreSearchMessages = false;
                return;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    this.loadingMoreSearchMessages = false;
                    return;
                }
                int i15 = this.lastReturnedNum - 1;
                this.lastReturnedNum = i15;
                if (i15 < 0) {
                    this.lastReturnedNum = 0;
                    return;
                }
                if (i15 >= this.searchResultMessages.size()) {
                    this.lastReturnedNum = this.searchResultMessages.size() - 1;
                }
                MessageObject messageObject = this.searchResultMessages.get(this.lastReturnedNum);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i10), Integer.valueOf(messageObject.getId()), Integer.valueOf(getMask()), Long.valueOf(messageObject.getDialogId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.valueOf(z11));
                this.loadingMoreSearchMessages = false;
                return;
            }
            int i16 = this.lastReturnedNum + 1;
            this.lastReturnedNum = i16;
            if (i16 < this.searchResultMessages.size()) {
                MessageObject messageObject2 = this.searchResultMessages.get(this.lastReturnedNum);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i10), Integer.valueOf(messageObject2.getId()), Integer.valueOf(getMask()), Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.valueOf(z11));
                this.loadingMoreSearchMessages = false;
                return;
            }
            boolean[] zArr3 = this.messagesSearchEndReached;
            if (zArr3[0] && j10 == 0 && zArr3[1]) {
                this.lastReturnedNum--;
                this.loadingMoreSearchMessages = false;
                return;
            }
            String str4 = this.lastSearchQuery;
            MessageObject messageObject3 = (MessageObject) i2.g.h(1, this.searchResultMessages);
            if (messageObject3.getDialogId() != j3 || this.messagesSearchEndReached[0]) {
                i12 = messageObject3.getDialogId() == j10 ? messageObject3.getId() : 0;
                this.messagesSearchEndReached[1] = false;
                j12 = j10;
            } else {
                i12 = messageObject3.getId();
                j12 = j3;
            }
            str2 = str4;
            z13 = false;
        }
        if (str2 != null) {
            i13 = 0;
            j13 = 0;
            if (str2.trim().startsWith("#") || str2.trim().startsWith("$")) {
                z12 = true;
                zArr = this.messagesSearchEndReached;
                if (zArr[i13] && !zArr[1] && j10 != j13) {
                    j12 = j10;
                }
                if (j12 == j3 || !z13) {
                    j14 = j3;
                    user2 = user;
                    chat2 = chat;
                    j1Var2 = j1Var;
                    str3 = str2;
                    c10 = 1;
                } else {
                    if (j10 != j13) {
                        TLRPC.InputPeer inputPeer2 = getMessagesController().getInputPeer(j10);
                        if (inputPeer2 == null) {
                            return;
                        }
                        final TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                        tL_messages_search.peer = inputPeer2;
                        this.lastMergeDialogId = j10;
                        tL_messages_search.limit = 1;
                        tL_messages_search.q = str2;
                        if (user != null) {
                            tL_messages_search.from_id = MessagesController.getInputPeer(user);
                            tL_messages_search.flags |= 1;
                        } else if (chat != null) {
                            tL_messages_search.from_id = MessagesController.getInputPeer(chat);
                            tL_messages_search.flags |= 1;
                        }
                        if (j11 != j13) {
                            if (j3 == getUserConfig().getClientUserId() || getMessagesStorage().isMonoForum(j12)) {
                                tL_messages_search.saved_peer_id = getMessagesController().getInputPeer(j11);
                                tL_messages_search.flags |= 4;
                            } else {
                                tL_messages_search.top_msg_id = (int) j11;
                                tL_messages_search.flags |= 2;
                            }
                        }
                        if (j1Var != null) {
                            tL_messages_search.saved_reaction.add(j1Var.g());
                            tL_messages_search.flags |= 8;
                        }
                        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                        this.mergeReqId = getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() { // from class: org.telegram.messenger.f7
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                MediaDataController.this.lambda$searchMessagesInChat$121(j10, tL_messages_search, j3, i10, i11, j11, user, chat, z11, j1Var, tLObject, tL_error);
                            }
                        }, 2);
                        return;
                    }
                    j14 = j3;
                    user2 = user;
                    chat2 = chat;
                    j1Var2 = j1Var;
                    str3 = str2;
                    c10 = 1;
                    this.lastMergeDialogId = j13;
                    zArr[1] = true;
                    this.messagesSearchCount[1] = i13;
                }
                final TLRPC.TL_messages_search tL_messages_search2 = new TLRPC.TL_messages_search();
                inputPeer = getMessagesController().getInputPeer(j12);
                tL_messages_search2.peer = inputPeer;
                if (inputPeer != null) {
                    this.loadingMoreSearchMessages = false;
                    return;
                }
                this.lastGuid = i10;
                this.lastDialogId = j14;
                this.lastSearchUser = user2;
                this.lastSearchChat = chat2;
                this.lastReplyMessageId = j11;
                this.lastReaction = j1Var2;
                tL_messages_search2.limit = 21;
                tL_messages_search2.q = str3 != null ? str3 : "";
                tL_messages_search2.offset_id = i12;
                if (user2 != null) {
                    tL_messages_search2.from_id = MessagesController.getInputPeer(user2);
                    tL_messages_search2.flags |= 1;
                } else if (chat2 != null) {
                    tL_messages_search2.from_id = MessagesController.getInputPeer(chat2);
                    tL_messages_search2.flags |= 1;
                }
                this.loadingSearchLocal = false;
                this.loadedPredirectedSearchLocal = false;
                int i17 = this.lastReqId + 1;
                this.lastReqId = i17;
                boolean z14 = j14 == getUserConfig().getClientUserId();
                if (z14 && j1Var2 != null && z13) {
                    this.lastReturnedNum = 0;
                    this.searchServerResultMessages.clear();
                    this.searchServerResultMessagesMap[0].clear();
                    this.searchServerResultMessagesMap[c10].clear();
                    final int savedTagCount = getMessagesController().getSavedTagCount(this.lastReplyMessageId, j1Var2);
                    this.messagesLocalSearchCount = TextUtils.isEmpty(tL_messages_search2.q) ? savedTagCount : 0;
                    this.loadingSearchLocal = true;
                    this.loadedPredirectedSearchLocal = false;
                    MessagesStorage messagesStorage = getMessagesStorage();
                    TLRPC.Reaction g10 = j1Var2.g();
                    long j15 = this.lastReplyMessageId;
                    ArrayList<MessageObject> arrayList = this.searchLocalResultMessages;
                    i14 = i17;
                    messagesStorage.searchSavedByTag(g10, j15, str3, 300, arrayList == null ? 0 : arrayList.size(), new Utilities.Callback4() { // from class: org.telegram.messenger.g7
                        @Override // org.telegram.messenger.Utilities.Callback4
                        public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                            MediaDataController.this.lambda$searchMessagesInChat$122(i14, savedTagCount, i10, j3, (ArrayList) obj, (ArrayList) obj2, (ArrayList) obj3, (ArrayList) obj4);
                        }
                    }, true);
                } else {
                    i14 = i17;
                }
                final String str5 = str3;
                if (this.lastReplyMessageId != 0) {
                    if (j12 == getUserConfig().getClientUserId() || getMessagesStorage().isMonoForum(j12)) {
                        tL_messages_search2.saved_peer_id = getMessagesController().getInputPeer(this.lastReplyMessageId);
                        tL_messages_search2.flags |= 4;
                    } else {
                        tL_messages_search2.top_msg_id = (int) this.lastReplyMessageId;
                        tL_messages_search2.flags |= 2;
                    }
                }
                if (j1Var2 != null) {
                    tL_messages_search2.saved_reaction.add(j1Var2.g());
                    tL_messages_search2.flags |= 8;
                }
                tL_messages_search2.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                this.lastSearchQuery = str5;
                final int i18 = i14;
                final boolean z15 = z12;
                final TLRPC.Chat chat3 = chat2;
                final long j16 = j12;
                final boolean z16 = z14;
                this.reqId = getConnectionsManager().sendRequest(tL_messages_search2, new RequestDelegate() { // from class: org.telegram.messenger.h7
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        MediaDataController.this.lambda$searchMessagesInChat$125(tL_messages_search2, z16, str5, z15, i18, z11, j16, j3, i10, j10, j11, user, chat3, tLObject, tL_error);
                    }
                }, 2);
                return;
            }
        } else {
            j13 = 0;
            i13 = 0;
        }
        z12 = false;
        zArr = this.messagesSearchEndReached;
        if (zArr[i13]) {
            j12 = j10;
        }
        if (j12 == j3) {
        }
        j14 = j3;
        user2 = user;
        chat2 = chat;
        j1Var2 = j1Var;
        str3 = str2;
        c10 = 1;
        final TLRPC.TL_messages_search tL_messages_search22 = new TLRPC.TL_messages_search();
        inputPeer = getMessagesController().getInputPeer(j12);
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
            getInstance(this.currentAccount).getEmojiSuggestions(new String[]{str}, str2, true, new a8(this, searchStickersKey, searchStickersResult, callback), false);
            return searchStickersKey;
        }
        if (searchStickersResult != null) {
            callback.run(searchStickersResult.documents);
            return searchStickersKey;
        }
        callback.run(new ArrayList<>());
        return searchStickersKey;
    }

    public void toggleStickerSet(Context context, TLObject tLObject, int i10, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, Runnable runnable, boolean z12) {
        toggleStickerSet(context, tLObject, i10, n2Var, null, z10, z11, runnable, z12);
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
                AndroidUtilities.runOnUIThread(new f0(this, message, stickerSetName, 29));
                return;
            } else {
                lambda$verifyAnimatedStickerMessage$68(message, stickerSetName);
                return;
            }
        }
        int size = tL_messages_stickerSet.documents.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.Document document2 = tL_messages_stickerSet.documents.get(i10);
            if (document2.id == document.id && document2.dc_id == document.dc_id) {
                message.stickerVerified = 1;
                return;
            }
        }
    }

    public static void addTextStyleRuns(MessageObject messageObject, Spannable spannable, int i10) {
        addTextStyleRuns(messageObject.messageOwner.entities, messageObject.messageText, spannable, i10);
    }

    public void getEmojiSuggestions(String[] strArr, String str, boolean z10, KeywordResultCallback keywordResultCallback, CountDownLatch countDownLatch, boolean z11, boolean z12, boolean z13, Integer num) {
        getEmojiSuggestions(strArr, str, z10, keywordResultCallback, countDownLatch, z11, z12, z13, false, num, false);
    }

    public boolean isStickerPackInstalled(String str) {
        return this.stickerSetsByName.containsKey(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void loadStickers(int i10, boolean z10, boolean z11, boolean z12, Utilities.Callback<ArrayList<TLRPC.TL_messages_stickerSet>> callback) {
        long j3;
        TLRPC.TL_messages_getMaskStickers tL_messages_getMaskStickers;
        if (this.loadingStickers[i10]) {
            if (z12) {
                this.scheduledLoadStickers[i10] = new u4(this, i10, z11, callback, 2);
                return;
            } else {
                if (callback != null) {
                    callback.run(null);
                    return;
                }
                return;
            }
        }
        if (i10 == 3) {
            if (this.featuredStickerSets[0].isEmpty() || !getMessagesController().preloadFeaturedStickers) {
                if (callback != null) {
                    callback.run(null);
                    return;
                }
                return;
            }
        } else if (i10 == 6) {
            if (this.featuredStickerSets[1].isEmpty() || !getMessagesController().preloadFeaturedStickers) {
                if (callback != null) {
                    callback.run(null);
                    return;
                }
                return;
            }
        } else if (i10 != 4) {
            loadArchivedStickersCount(i10, z10);
        }
        this.loadingStickers[i10] = true;
        if (z10) {
            getMessagesStorage().getStorageQueue().postRunnable(new q4(this, i10, callback, 10));
            return;
        }
        if (i10 == 3 || i10 == 6) {
            char c10 = i10 != 6 ? (char) 0 : (char) 1;
            TLRPC.TL_messages_allStickers tL_messages_allStickers = new TLRPC.TL_messages_allStickers();
            tL_messages_allStickers.hash2 = this.loadFeaturedHash[c10];
            int size = this.featuredStickerSets[c10].size();
            for (int i11 = 0; i11 < size; i11++) {
                tL_messages_allStickers.sets.add(this.featuredStickerSets[c10].get(i11).set);
            }
            processLoadStickersResponse(i10, tL_messages_allStickers, new r7(3, callback));
            return;
        }
        if (i10 == 4) {
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetAnimatedEmoji();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new wa(this, i10, callback, 3));
            return;
        }
        if (i10 == 0) {
            TLRPC.TL_messages_getAllStickers tL_messages_getAllStickers = new TLRPC.TL_messages_getAllStickers();
            j3 = z11 ? 0L : this.loadHash[i10];
            tL_messages_getAllStickers.hash = j3;
            tL_messages_getMaskStickers = tL_messages_getAllStickers;
        } else if (i10 == 5) {
            TLRPC.TL_messages_getEmojiStickers tL_messages_getEmojiStickers = new TLRPC.TL_messages_getEmojiStickers();
            j3 = z11 ? 0L : this.loadHash[i10];
            tL_messages_getEmojiStickers.hash = j3;
            tL_messages_getMaskStickers = tL_messages_getEmojiStickers;
        } else {
            TLRPC.TL_messages_getMaskStickers tL_messages_getMaskStickers2 = new TLRPC.TL_messages_getMaskStickers();
            j3 = z11 ? 0L : this.loadHash[i10];
            tL_messages_getMaskStickers2.hash = j3;
            tL_messages_getMaskStickers = tL_messages_getMaskStickers2;
        }
        getConnectionsManager().sendRequest(tL_messages_getMaskStickers, new bi.s7(this, i10, callback, j3, 2));
    }

    public void saveDraft(long j3, long j10, CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.Message message, sn snVar, TLRPC.SuggestedPost suggestedPost, long j11, boolean z10, boolean z11, TL_iv.RichMessage richMessage) {
        TLRPC.DraftMessage tL_draftMessage;
        TLRPC.InputReplyTo inputReplyTo;
        TLRPC.Message message2 = (getMessagesController().isForum(j3) && j10 == 0) ? null : message;
        if (TextUtils.isEmpty(charSequence) && message2 == null && richMessage == null) {
            tL_draftMessage = new TLRPC.TL_draftMessageEmpty();
        } else {
            tL_draftMessage = new TLRPC.TL_draftMessage();
        }
        tL_draftMessage.rich_message = richMessage;
        tL_draftMessage.date = (int) (System.currentTimeMillis() / 1000);
        tL_draftMessage.message = charSequence == null ? "" : charSequence.toString();
        tL_draftMessage.no_webpage = z10;
        if (j11 != 0) {
            tL_draftMessage.flags |= 128;
            tL_draftMessage.effect = j11;
        }
        if (message2 != null) {
            TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
            tL_draftMessage.reply_to = tL_inputReplyToMessage;
            tL_draftMessage.flags |= 16;
            tL_inputReplyToMessage.reply_to_msg_id = message2.id;
            if (snVar != null) {
                String str = snVar.i;
                tL_inputReplyToMessage.quote_text = str;
                if (str != null) {
                    tL_inputReplyToMessage.flags |= 20;
                    tL_inputReplyToMessage.quote_offset = snVar.b;
                }
                ArrayList<TLRPC.MessageEntity> arrayList2 = snVar.j;
                tL_inputReplyToMessage.quote_entities = arrayList2;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    tL_draftMessage.reply_to.quote_entities = new ArrayList<>(tL_draftMessage.reply_to.quote_entities);
                    tL_draftMessage.reply_to.flags |= 8;
                }
                MessageObject messageObject = snVar.a;
                if (messageObject != null && messageObject.messageOwner != null) {
                    TLRPC.Peer peer = getMessagesController().getPeer(j3);
                    TLRPC.Peer peer2 = snVar.a.messageOwner.peer_id;
                    if (peer != null && !MessageObject.peersEqual(peer, peer2)) {
                        TLRPC.InputReplyTo inputReplyTo2 = tL_draftMessage.reply_to;
                        inputReplyTo2.flags |= 2;
                        inputReplyTo2.reply_to_peer_id = getMessagesController().getInputPeer(peer2);
                    }
                }
            } else if (j3 != MessageObject.getDialogId(message2)) {
                TLRPC.InputReplyTo inputReplyTo3 = tL_draftMessage.reply_to;
                inputReplyTo3.flags |= 2;
                inputReplyTo3.reply_to_peer_id = getMessagesController().getInputPeer(getMessagesController().getPeer(MessageObject.getDialogId(message2)));
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            tL_draftMessage.entities = arrayList;
            tL_draftMessage.flags |= 8;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
        if (ChatObject.isMonoForum(chat) && ChatObject.canManageMonoForum(this.currentAccount, chat)) {
            tL_draftMessage.flags |= 16;
            TLRPC.InputReplyTo inputReplyTo4 = tL_draftMessage.reply_to;
            if (inputReplyTo4 == null) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_draftMessage.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = getMessagesController().getInputPeer(j10);
            } else {
                inputReplyTo4.monoforum_peer_id = getMessagesController().getInputPeer(j10);
                tL_draftMessage.reply_to.flags |= 32;
            }
        }
        if (suggestedPost != null) {
            tL_draftMessage.suggested_post = suggestedPost;
        }
        a0.i iVar = (a0.i) this.drafts.f(j3);
        TLRPC.DraftMessage draftMessage = iVar == null ? null : (TLRPC.DraftMessage) iVar.f(j10);
        if (!z11) {
            if (draftMessage != null) {
                if (draftMessage.message.equals(tL_draftMessage.message) && replyToEquals(draftMessage.reply_to, tL_draftMessage.reply_to) && suggestedPostEquals(draftMessage.suggested_post, tL_draftMessage.suggested_post) && richMessageEquals(draftMessage.rich_message, tL_draftMessage.rich_message) && draftMessage.no_webpage == tL_draftMessage.no_webpage && draftMessage.effect == tL_draftMessage.effect) {
                    return;
                }
            } else if (TextUtils.isEmpty(tL_draftMessage.message) && (((inputReplyTo = tL_draftMessage.reply_to) == null || inputReplyTo.reply_to_msg_id == 0) && tL_draftMessage.effect == 0 && tL_draftMessage.rich_message == null && tL_draftMessage.suggested_post == null)) {
                return;
            }
        }
        saveDraft(j3, j10, tL_draftMessage, message2, false);
        if (j10 == 0 || ChatObject.isForum(chat) || ChatObject.isMonoForum(chat)) {
            if (!DialogObject.isEncryptedDialog(j3)) {
                TLRPC.TL_messages_saveDraft tL_messages_saveDraft = new TLRPC.TL_messages_saveDraft();
                TLRPC.InputPeer inputPeer = getMessagesController().getInputPeer(j3);
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
                getConnectionsManager().sendRequest(tL_messages_saveDraft, new d5(8));
            }
            getMessagesController().sortDialogs(null);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
    }

    public void toggleStickerSet(Context context, TLObject tLObject, int i10, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, boolean z10, boolean z11, Runnable runnable, boolean z12) {
        toggleStickerSet(context, tLObject, null, i10, n2Var, frameLayout, z10, z11, runnable, z12);
    }

    public static void addTextStyleRuns(ArrayList<TLRPC.MessageEntity> arrayList, CharSequence charSequence, Spannable spannable) {
        addTextStyleRuns(arrayList, charSequence, spannable, -1);
    }

    public static TLRPC.InputStickerSet getInputStickerSet(TLRPC.Document document) {
        for (int i10 = 0; i10 < document.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
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
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.messenger.s8
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
    public void toggleStickerSet(final Context context, final TLObject tLObject, final TLRPC.Document document, final int i10, final org.telegram.ui.ActionBar.n2 n2Var, final FrameLayout frameLayout, final boolean z10, boolean z11, Runnable runnable, boolean z12) {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        int i11;
        int i12;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3;
        int i13;
        char c10;
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject;
            stickerSet = tL_messages_stickerSet2.set;
        } else if (tLObject instanceof TLRPC.StickerSetCovered) {
            stickerSet = ((TLRPC.StickerSetCovered) tLObject).set;
            if (i10 != 2) {
                tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.stickerSetsById.f(stickerSet.id);
                if (tL_messages_stickerSet2 == null) {
                    return;
                }
            } else {
                stickerSet2 = stickerSet;
                tL_messages_stickerSet = null;
                if (stickerSet2.masks) {
                    i11 = stickerSet2.emojis ? 5 : 0;
                } else {
                    i11 = 1;
                }
                stickerSet2.archived = i10 != 1;
                i12 = 0;
                while (true) {
                    if (i12 < this.stickerSets[i11].size()) {
                        tL_messages_stickerSet3 = tL_messages_stickerSet;
                        i13 = 0;
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.stickerSets[i11].get(i12);
                    tL_messages_stickerSet3 = tL_messages_stickerSet;
                    if (tL_messages_stickerSet4.set.id == stickerSet2.id) {
                        this.stickerSets[i11].remove(i12);
                        if (i10 == 2) {
                            tL_messages_stickerSet4.set.title = stickerSet2.title;
                            this.stickerSets[i11].add(0, tL_messages_stickerSet4);
                        } else if (z12) {
                            this.stickerSetsById.l(tL_messages_stickerSet4.set.id);
                            this.installedStickerSetsById.l(tL_messages_stickerSet4.set.id);
                            this.stickerSetsByName.remove(tL_messages_stickerSet4.set.short_name);
                        }
                        i13 = i12;
                    } else {
                        i12++;
                        tL_messages_stickerSet = tL_messages_stickerSet3;
                    }
                }
                this.loadHash[i11] = calcStickersHash(this.stickerSets[i11]);
                int i14 = i11;
                putStickersToCache(i14, this.stickerSets[i11], this.loadDate[i11], this.loadHash[i11]);
                final int i15 = i14;
                if (i10 != 2) {
                    if (!cancelRemovingStickerSet(stickerSet2.id)) {
                        toggleStickerSetInternal(context, i10, n2Var, frameLayout, z10, tLObject, stickerSet2, document, i15, z11);
                    }
                    c10 = 1;
                } else if (z11 && n2Var != null) {
                    zw0 zw0Var = new zw0(context, tLObject, 1, i10, document, n2Var.getResourceProvider());
                    final boolean[] zArr = new boolean[1];
                    markSetUninstalling(stickerSet2.id, true);
                    org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(context, null, false);
                    final TLRPC.StickerSet stickerSet3 = stickerSet2;
                    ocVar.a = new m4.w0(this, zArr, stickerSet3, i15, i13, tL_messages_stickerSet3, runnable);
                    c10 = 1;
                    Runnable runnable2 = new Runnable() { // from class: org.telegram.messenger.v8
                        @Override // java.lang.Runnable
                        public final void run() {
                            MediaDataController.this.lambda$toggleStickerSet$109(zArr, context, i10, n2Var, frameLayout, z10, tLObject, stickerSet3, document, i15);
                        }
                    };
                    i15 = i15;
                    ocVar.b = runnable2;
                    zw0Var.setButton(ocVar);
                    this.removingStickerSetsUndos.k(new d1(ocVar, 25), stickerSet3.id);
                    if (frameLayout != null) {
                        org.telegram.ui.Components.qc.f(frameLayout, zw0Var, 2750).j();
                    } else {
                        org.telegram.ui.Components.qc.g(n2Var, zw0Var, 2750).j();
                    }
                } else {
                    c10 = 1;
                    toggleStickerSetInternal(context, i10, n2Var, frameLayout, z10, tLObject, stickerSet2, document, i15, false);
                }
                NotificationCenter notificationCenter = getNotificationCenter();
                int i16 = NotificationCenter.stickersDidLoad;
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(i15);
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
        stickerSet2.archived = i10 != 1;
        i12 = 0;
        while (true) {
            if (i12 < this.stickerSets[i11].size()) {
            }
            i12++;
            tL_messages_stickerSet = tL_messages_stickerSet3;
        }
        this.loadHash[i11] = calcStickersHash(this.stickerSets[i11]);
        int i142 = i11;
        putStickersToCache(i142, this.stickerSets[i11], this.loadDate[i11], this.loadHash[i11]);
        final int i152 = i142;
        if (i10 != 2) {
        }
        NotificationCenter notificationCenter2 = getNotificationCenter();
        int i162 = NotificationCenter.stickersDidLoad;
        Object[] objArr2 = new Object[2];
        objArr2[0] = Integer.valueOf(i152);
        objArr2[c10] = Boolean.TRUE;
        notificationCenter2.lambda$postNotificationNameOnUIThread$1(i162, objArr2);
    }

    public static void addTextStyleRuns(ArrayList<TLRPC.MessageEntity> arrayList, CharSequence charSequence, Spannable spannable, int i10) {
        for (o01 o01Var : (o01[]) spannable.getSpans(0, spannable.length(), o01.class)) {
            spannable.removeSpan(o01Var);
        }
        ArrayList<n01> textStyleRuns = getTextStyleRuns(arrayList, charSequence, i10);
        for (int i11 = 0; i11 < Math.min(MAX_STYLE_RUNS_COUNT, textStyleRuns.size()); i11++) {
            n01 n01Var = textStyleRuns.get(i11);
            addStyleToText(new o01(n01Var, 0), n01Var.b, n01Var.c, spannable, true);
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
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (!entitiesEqual(arrayList.get(i10), arrayList2.get(i10))) {
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
                    final int i10 = 0;
                    getMessagesStorage().getStorageQueue().postRunnable(new Runnable(this) { // from class: org.telegram.messenger.y8
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
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetShortName) {
                    final int i11 = 1;
                    getMessagesStorage().getStorageQueue().postRunnable(new Runnable(this) { // from class: org.telegram.messenger.y8
                        public final /* synthetic */ MediaDataController b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
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
                    fetchStickerSetInternal(inputStickerSet, new z3(this, inputSetKey, callback, inputStickerSet, 2));
                    return null;
                }
                this.loadingStickerSetsKeys.remove(inputSetKey);
                return null;
            }
        }
        return null;
    }

    public ArrayList<MessageObject> loadPinnedMessages(long j3, long j10, ArrayList<Integer> arrayList, boolean z10) {
        if (z10) {
            getMessagesStorage().getStorageQueue().postRunnable(new a3.g0(this, j3, j10, arrayList, 4));
            return null;
        }
        return loadPinnedMessageInternal(j3, j10, arrayList, true);
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
                                } catch (Throwable th2) {
                                    th = th2;
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
                            } catch (Throwable th3) {
                                th = th3;
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
        } catch (Throwable th6) {
            th = th6;
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

    public void saveDraft(final long j3, final long j10, TLRPC.DraftMessage draftMessage, TLRPC.Message message, boolean z10) {
        TLRPC.Message message2;
        String str;
        TLRPC.InputReplyTo inputReplyTo;
        TLRPC.Chat chat;
        StringBuilder sb2;
        if (getMessagesController().isForum(j3) && j10 == 0 && TextUtils.isEmpty(draftMessage.message)) {
            TLRPC.InputReplyTo inputReplyTo2 = draftMessage.reply_to;
            if (inputReplyTo2 instanceof TLRPC.TL_inputReplyToMessage) {
                ((TLRPC.TL_inputReplyToMessage) inputReplyTo2).reply_to_msg_id = 0;
            }
        }
        SharedPreferences.Editor edit = this.draftPreferences.edit();
        MessagesController messagesController = getMessagesController();
        if (draftMessage != null && !(draftMessage instanceof TLRPC.TL_draftMessageEmpty)) {
            a0.i iVar = (a0.i) this.drafts.f(j3);
            if (iVar == null) {
                iVar = new a0.i();
                this.drafts.k(iVar, j3);
            }
            iVar.k(draftMessage, j10);
            if (j10 == 0) {
                messagesController.putDraftDialogIfNeed(j3, draftMessage);
            }
            try {
                SerializedData serializedData = new SerializedData(draftMessage.getObjectSize());
                draftMessage.serializeToStream(serializedData);
                if (j10 != 0) {
                    sb2 = new StringBuilder("t_");
                    sb2.append(j3);
                    sb2.append("_");
                    sb2.append(j10);
                } else {
                    sb2 = new StringBuilder("");
                    sb2.append(j3);
                }
                edit.putString(sb2.toString(), Utilities.bytesToHex(serializedData.toByteArray()));
                serializedData.cleanup();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        } else {
            a0.i iVar2 = (a0.i) this.drafts.f(j3);
            if (iVar2 != null) {
                iVar2.l(j10);
                if (iVar2.m() == 0) {
                    this.drafts.l(j3);
                }
            }
            a0.i iVar3 = (a0.i) this.draftMessages.f(j3);
            if (iVar3 != null) {
                iVar3.l(j10);
                if (iVar3.m() == 0) {
                    this.draftMessages.l(j3);
                }
            }
            if (j10 == 0) {
                this.draftPreferences.edit().remove("" + j3).remove("r_" + j3).commit();
            } else {
                SharedPreferences.Editor edit2 = this.draftPreferences.edit();
                StringBuilder t10 = a4.a.t(j3, "t_", "_");
                t10.append(j10);
                SharedPreferences.Editor remove = edit2.remove(t10.toString());
                StringBuilder t11 = a4.a.t(j3, "rt_", "_");
                t11.append(j10);
                remove.remove(t11.toString()).commit();
            }
            messagesController.removeDraftDialogIfNeed(j3);
        }
        a0.i iVar4 = (a0.i) this.draftMessages.f(j3);
        TLRPC.User user = null;
        if (message != null || draftMessage == null || draftMessage.reply_to == null) {
            if (draftMessage != null && draftMessage.reply_to == null) {
                message2 = null;
            }
            message2 = message;
        } else {
            if (iVar4 != null) {
                message2 = (TLRPC.Message) iVar4.f(j10);
            }
            message2 = message;
        }
        if (message2 == null) {
            if (iVar4 != null) {
                iVar4.l(j10);
                if (iVar4.m() == 0) {
                    this.draftMessages.l(j3);
                }
            }
            if (j10 == 0) {
                edit.remove("r_" + j3);
            } else {
                StringBuilder t12 = a4.a.t(j3, "rt_", "_");
                t12.append(j10);
                edit.remove(t12.toString());
            }
        } else {
            if (iVar4 == null) {
                iVar4 = new a0.i();
                this.draftMessages.k(iVar4, j3);
            }
            iVar4.k(message2, j10);
            try {
                SerializedData serializedData2 = new SerializedData(message2.getObjectSize());
                message2.serializeToStream(serializedData2);
                if (j10 != 0) {
                    str = "rt_" + j3 + "_" + j10;
                } else {
                    str = "r_" + j3;
                }
                edit.putString(str, Utilities.bytesToHex(serializedData2.toByteArray()));
                serializedData2.cleanup();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        edit.commit();
        if (z10) {
            if (j10 == 0 || getMessagesController().isForum(j3)) {
                if (draftMessage != null && (inputReplyTo = draftMessage.reply_to) != null && inputReplyTo.reply_to_msg_id != 0 && (message2 == null || ((message2.reply_to instanceof TLRPC.TL_messageReplyHeader) && message2.replyMessage == null))) {
                    long peerDialogId = (inputReplyTo.flags & 2) != 0 ? DialogObject.getPeerDialogId(inputReplyTo.reply_to_peer_id) : j3;
                    if (DialogObject.isUserDialog(peerDialogId)) {
                        user = getMessagesController().getUser(Long.valueOf(peerDialogId));
                        chat = null;
                    } else {
                        chat = getMessagesController().getChat(Long.valueOf(-peerDialogId));
                    }
                    if (user != null || chat != null) {
                        long j11 = ChatObject.isChannel(chat) ? chat.id : 0L;
                        final int i10 = draftMessage.reply_to.reply_to_msg_id;
                        final long j12 = peerDialogId;
                        final long j13 = j11;
                        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.messenger.p9
                            @Override // java.lang.Runnable
                            public final void run() {
                                MediaDataController.this.lambda$saveDraft$191(i10, j12, j13, j3, j10);
                            }
                        });
                    }
                }
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newDraftReceived, Long.valueOf(j3));
            }
        }
    }
}
