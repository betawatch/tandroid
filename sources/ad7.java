// default package

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ad7 extends pf0 {
    public static volatile ad7[] f0 = new ad7[4];
    public static final Object[] g0 = new Object[4];
    public static final String[] h0;
    public int E;
    public int F;
    public int G;
    public int H;
    public final ArrayList I;
    public final SparseArray J;
    public final vf6 K;
    public int L;
    public int M;
    public volatile int N;
    public volatile int O;
    public boolean P;
    public final CountDownLatch Q;
    public boolean R;
    public final LongSparseIntArray S;
    public boolean T;
    public final int[][] U;
    public final int[][] V;
    public final int[][] W;
    public final int[][] X;
    public final int[][] Y;
    public final int[][] Z;
    public final co3 a;
    public final int[] a0;
    public SQLiteDatabase b;
    public final int[] b0;
    public File c;
    public final vf6 c0;
    public File d;
    public final vf6 d0;
    public File e;
    public final s34 e0;
    public final AtomicLong f;
    public final SparseArray h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public byte[] y;

    static {
        for (int i = 0; i < 4; i++) {
            g0[i] = new Object();
        }
        h0 = new String[]{"messages_holes", "media_holes_v2", "scheduled_messages_v2", "quick_replies", "messages_v2", "download_queue", "user_contacts_v7", "user_phones_v7", "dialogs", "dialog_filter", "dialog_filter_ep", "dialog_filter_pin_v2", "randoms_v2", "enc_tasks_v4", "messages_seq", "params", "media_v4", "bot_keyboard", "bot_keyboard_topics", "chat_settings_v2", "user_settings", "chat_pinned_v2", "chat_pinned_count", "chat_hints", "botcache", "users_data", "users", "chats", "enc_chats", "channel_users_v2", "channel_admins_v3", "contacts", "dialog_photos", "dialog_settings", "web_recent_v3", "stickers_v2", "stickers_featured", "stickers_dice", "stickersets", "hashtag_recent_v2", "webpage_pending_v2", "sent_files_v2", "search_recent", "media_counts_v2", "keyvalue", "bot_info_v2", "pending_tasks", "requested_holes", "sharing_locations", "shortcut_widget", "emoji_keywords_v2", "emoji_keywords_info_v2", "wallpapers2", "unread_push_messages", "polls_v2", "reactions", "reaction_mentions", "downloading_documents", "animated_emoji", "attach_menu_bots", "premium_promo", "emoji_statuses", "messages_holes_topics", "messages_topics", "saved_dialogs", "media_topics", "media_holes_topics", "topics", "media_counts_topics", "reaction_mentions_topics", "emoji_groups", "poll_votes_mentions", "poll_votes_mentions_topics", "ephemeral_messages", "widget_state", "widget_heights"};
    }

    public ad7(int i) {
        super(i);
        this.f = new AtomicLong(System.currentTimeMillis());
        this.h = new SparseArray();
        this.n = 0;
        this.r = 0;
        this.s = 0;
        this.w = 0;
        this.x = 0;
        this.y = null;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = new ArrayList();
        this.J = new SparseArray();
        this.K = new vf6();
        this.Q = new CountDownLatch(1);
        this.S = new LongSparseIntArray();
        this.U = new int[][]{new int[2], new int[2]};
        this.V = new int[][]{new int[2], new int[2]};
        this.W = new int[][]{new int[2], new int[2]};
        this.X = new int[][]{new int[2], new int[2]};
        this.Y = new int[][]{new int[2], new int[2]};
        this.Z = new int[][]{new int[2], new int[2]};
        this.a0 = new int[2];
        this.b0 = new int[2];
        this.c0 = new vf6();
        this.d0 = new vf6();
        this.e0 = new s34((byte) 0);
        co3 co3Var = new co3(de9.k(i, "storageQueue_"));
        this.a = co3Var;
        co3Var.setPriority(8);
        co3Var.c(new vb7(this, (byte) 9));
    }

    public static void I(TLRPC.Message message) {
        if (message != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported_old) {
                if (messageMedia.bytes.length == 0) {
                    Pattern pattern = Utilities.a;
                    messageMedia.bytes = new byte[]{0, 0, 0, -22};
                    return;
                }
                return;
            }
            if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported) {
                TLRPC.TL_messageMediaUnsupported_old tL_messageMediaUnsupported_old = new TLRPC.TL_messageMediaUnsupported_old();
                message.media = tL_messageMediaUnsupported_old;
                Pattern pattern2 = Utilities.a;
                tL_messageMediaUnsupported_old.bytes = new byte[]{0, 0, 0, -22};
                message.flags |= 512;
            }
        }
    }

    public static ArrayList I1(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) arrayList.get(i);
                if (inputPeer != null) {
                    long j = inputPeer.user_id;
                    if (j == 0) {
                        long j2 = inputPeer.chat_id;
                        if (j2 == 0) {
                            j2 = inputPeer.channel_id;
                        }
                        j = -j2;
                    }
                    arrayList2.add(Long.valueOf(j));
                }
            }
        }
        return arrayList2;
    }

    public static String J(TLRPC.User user) {
        StringBuilder sb = new StringBuilder();
        String str = user.first_name;
        if (str != null && str.length() > 0) {
            sb.append(user.first_name);
        }
        String str2 = user.last_name;
        if (str2 != null && str2.length() > 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(user.last_name);
        }
        sb.append(";;;");
        String str3 = user.username;
        if (str3 == null || str3.length() <= 0) {
            ArrayList<TLRPC.TL_username> arrayList = user.usernames;
            if (arrayList != null && arrayList.size() > 0) {
                for (int i = 0; i < user.usernames.size(); i++) {
                    TLRPC.TL_username tL_username = user.usernames.get(i);
                    if (tL_username != null && tL_username.active) {
                        sb.append(tL_username.username);
                        sb.append(";;");
                    }
                }
            }
        } else {
            sb.append(user.username);
        }
        return sb.toString().toLowerCase();
    }

    public static ad7 Y(int i) {
        ad7 ad7Var;
        ad7 ad7Var2 = f0[i];
        if (ad7Var2 != null) {
            return ad7Var2;
        }
        synchronized (g0[i]) {
            ad7Var = f0[i];
            if (ad7Var == null) {
                ad7[] ad7VarArr = f0;
                ad7 ad7Var3 = new ad7(i);
                ad7VarArr[i] = ad7Var3;
                ad7Var = ad7Var3;
            }
        }
        return ad7Var;
    }

    public static void b(TLRPC.Peer peer, ArrayList arrayList, ArrayList arrayList2) {
        if (peer instanceof TLRPC.TL_peerUser) {
            if (arrayList.contains(Long.valueOf(peer.user_id))) {
                return;
            }
            arrayList.add(Long.valueOf(peer.user_id));
        } else if (peer instanceof TLRPC.TL_peerChannel) {
            if (arrayList2.contains(Long.valueOf(peer.channel_id))) {
                return;
            }
            arrayList2.add(Long.valueOf(peer.channel_id));
        } else {
            if (!(peer instanceof TLRPC.TL_peerChat) || arrayList2.contains(Long.valueOf(peer.chat_id))) {
                return;
            }
            arrayList2.add(Long.valueOf(peer.chat_id));
        }
    }

    public static int b0(TLRPC.Message message) {
        if (!(message instanceof TLRPC.TL_message_secret)) {
            if (message instanceof TLRPC.TL_message) {
                TLRPC.MessageMedia messageMedia = message.media;
                if (((messageMedia instanceof TLRPC.TL_messageMediaPhoto) || (messageMedia instanceof TLRPC.TL_messageMediaDocument)) && messageMedia.ttl_seconds != 0) {
                    return 1;
                }
            }
            return ((message.media instanceof TLRPC.TL_messageMediaPhoto) || k27.K4(message)) ? 0 : -1;
        }
        if (!(message.media instanceof TLRPC.TL_messageMediaPhoto) && !k27.t3(message) && !k27.Q4(message) && !k27.K4(message) && !k27.i4(message)) {
            return -1;
        }
        int i = message.ttl;
        return (i <= 0 || i > 60) ? 0 : 1;
    }

    public static void c(TLRPC.Message message, vf6 vf6Var, vf6 vf6Var2) {
        long B1;
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        int i = messageReplyHeader.reply_to_msg_id;
        if ((message.flags & TLObject.FLAG_30) != 0) {
            B1 = message.quick_reply_shortcut_id;
        } else {
            TLRPC.Peer peer = messageReplyHeader.reply_to_peer_id;
            B1 = peer != null ? k27.B1(peer) : k27.B0(message);
        }
        SparseArray sparseArray = (SparseArray) vf6Var.f(B1);
        ArrayList arrayList = (ArrayList) vf6Var2.f(B1);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            vf6Var.k(sparseArray, B1);
        }
        if (arrayList == null) {
            arrayList = tb4.s(vf6Var2, B1);
        }
        ArrayList arrayList2 = (ArrayList) sparseArray.get(message.reply_to.reply_to_msg_id);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            sparseArray.put(message.reply_to.reply_to_msg_id, arrayList2);
            if (!arrayList.contains(Integer.valueOf(message.reply_to.reply_to_msg_id))) {
                arrayList.add(Integer.valueOf(message.reply_to.reply_to_msg_id));
            }
        }
        arrayList2.add(message);
    }

    public static void d(TLRPC.Message message, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        TLRPC.Peer peer;
        TLRPC.Peer peer2;
        String str;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer3;
        TLRPC.Peer peer4;
        TLRPC.WebPage webPage;
        TLRPC.Peer peer5;
        TL_stories.StoryFwdHeader storyFwdHeader;
        TL_stories.StoryItem storyItem;
        TLRPC.Peer peer6;
        TLRPC.Peer peer7;
        long B1 = k27.B1(message.from_id);
        if (cf3.D(B1)) {
            if (!arrayList.contains(Long.valueOf(B1))) {
                arrayList.add(Long.valueOf(B1));
            }
        } else if (cf3.y(B1)) {
            long j = -B1;
            if (!arrayList2.contains(Long.valueOf(j))) {
                arrayList2.add(Long.valueOf(j));
            }
        }
        long j2 = message.via_bot_id;
        if (j2 != 0 && !arrayList.contains(Long.valueOf(j2))) {
            arrayList.add(Long.valueOf(message.via_bot_id));
        }
        TLRPC.Peer peer8 = message.guestchat_via_from;
        if (peer8 != null) {
            b(peer8, arrayList, arrayList2);
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction != null) {
            long j3 = messageAction.user_id;
            if (j3 != 0 && !arrayList.contains(Long.valueOf(j3))) {
                arrayList.add(Long.valueOf(message.action.user_id));
            }
            long j4 = message.action.channel_id;
            if (j4 != 0 && !arrayList2.contains(Long.valueOf(j4))) {
                arrayList2.add(Long.valueOf(message.action.channel_id));
            }
            long j5 = message.action.chat_id;
            if (j5 != 0 && !arrayList2.contains(Long.valueOf(j5))) {
                arrayList2.add(Long.valueOf(message.action.chat_id));
            }
            TLRPC.MessageAction messageAction2 = message.action;
            if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                b(((TLRPC.TL_messageActionGiftCode) messageAction2).boost_peer, arrayList, arrayList2);
            }
            TLRPC.MessageAction messageAction3 = message.action;
            if (messageAction3 instanceof TLRPC.TL_messageActionGeoProximityReached) {
                TLRPC.TL_messageActionGeoProximityReached tL_messageActionGeoProximityReached = (TLRPC.TL_messageActionGeoProximityReached) messageAction3;
                b(tL_messageActionGeoProximityReached.from_id, arrayList, arrayList2);
                b(tL_messageActionGeoProximityReached.to_id, arrayList, arrayList2);
            }
            TLRPC.MessageAction messageAction4 = message.action;
            if (messageAction4 instanceof TLRPC.TL_messageActionManagedBotCreated) {
                arrayList.add(Long.valueOf(((TLRPC.TL_messageActionManagedBotCreated) messageAction4).bot_id));
            }
            TLRPC.MessageAction messageAction5 = message.action;
            if (messageAction5 instanceof TLRPC.TL_messageActionBotInvite) {
                TLRPC.TL_messageActionBotInvite tL_messageActionBotInvite = (TLRPC.TL_messageActionBotInvite) messageAction5;
                long j6 = tL_messageActionBotInvite.inviter_id;
                if (j6 != 0 && !arrayList.contains(Long.valueOf(j6))) {
                    arrayList.add(Long.valueOf(tL_messageActionBotInvite.inviter_id));
                }
            }
            TLRPC.MessageAction messageAction6 = message.action;
            if (messageAction6 instanceof TLRPC.TL_messageActionChangeCommunity) {
                long j7 = ((TLRPC.TL_messageActionChangeCommunity) messageAction6).community_id;
                if (j7 > 0) {
                    arrayList2.add(Long.valueOf(j7));
                }
            }
            if (!message.action.users.isEmpty()) {
                for (int i = 0; i < message.action.users.size(); i++) {
                    Long l = message.action.users.get(i);
                    if (!arrayList.contains(l)) {
                        arrayList.add(l);
                    }
                }
            }
        }
        if (!message.entities.isEmpty()) {
            for (int i2 = 0; i2 < message.entities.size(); i2++) {
                TLRPC.MessageEntity messageEntity = message.entities.get(i2);
                if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                    arrayList.add(Long.valueOf(((TLRPC.TL_messageEntityMentionName) messageEntity).user_id));
                } else if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                    arrayList.add(Long.valueOf(((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id));
                } else if (arrayList3 != null && (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                    arrayList3.add(Long.valueOf(((TLRPC.TL_messageEntityCustomEmoji) messageEntity).document_id));
                }
            }
        }
        TLRPC.MessageAction messageAction7 = message.action;
        if (messageAction7 instanceof TLRPC.TL_messageActionStarGift) {
            TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGift) messageAction7).gift;
            if (starGift != null && (peer7 = starGift.released_by) != null) {
                b(peer7, arrayList, arrayList2);
            }
        } else if (messageAction7 instanceof TLRPC.TL_messageActionStarGiftUnique) {
            TL_stars.StarGift starGift2 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction7).gift;
            if (starGift2 != null && (peer = starGift2.released_by) != null) {
                b(peer, arrayList, arrayList2);
            }
        } else if (messageAction7 instanceof TLRPC.TL_messageActionRequestedPeer) {
            TLRPC.TL_messageActionRequestedPeer tL_messageActionRequestedPeer = (TLRPC.TL_messageActionRequestedPeer) messageAction7;
            for (int i3 = 0; i3 < tL_messageActionRequestedPeer.peers.size(); i3++) {
                b(tL_messageActionRequestedPeer.peers.get(i3), arrayList, arrayList2);
            }
        }
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia != null) {
            long j8 = messageMedia.user_id;
            if (j8 != 0 && !arrayList.contains(Long.valueOf(j8))) {
                arrayList.add(Long.valueOf(message.media.user_id));
            }
            TLRPC.MessageMedia messageMedia2 = message.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveaway) {
                ArrayList<Long> arrayList4 = ((TLRPC.TL_messageMediaGiveaway) messageMedia2).channels;
                int size = arrayList4.size();
                int i4 = 0;
                while (i4 < size) {
                    Long l2 = arrayList4.get(i4);
                    i4++;
                    Long l3 = l2;
                    if (!arrayList2.contains(l3)) {
                        arrayList2.add(l3);
                    }
                }
            }
            TLRPC.MessageMedia messageMedia3 = message.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                ArrayList<Long> arrayList5 = ((TLRPC.TL_messageMediaGiveawayResults) messageMedia3).winners;
                int size2 = arrayList5.size();
                int i5 = 0;
                while (i5 < size2) {
                    Long l4 = arrayList5.get(i5);
                    i5++;
                    Long l5 = l4;
                    if (!arrayList.contains(l5)) {
                        arrayList.add(l5);
                    }
                }
            }
            TLRPC.MessageMedia messageMedia4 = message.media;
            if (messageMedia4 instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia4;
                if (!tL_messageMediaPoll.poll.answers.isEmpty()) {
                    for (int i6 = 0; i6 < tL_messageMediaPoll.poll.answers.size(); i6++) {
                        TLRPC.Peer peer9 = tL_messageMediaPoll.poll.answers.get(i6).added_by;
                        if (peer9 != null) {
                            b(peer9, arrayList, arrayList2);
                        }
                    }
                }
                TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
                if (pollResults != null) {
                    ArrayList<TLRPC.Peer> arrayList6 = pollResults.recent_voters;
                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                        for (int i7 = 0; i7 < tL_messageMediaPoll.results.recent_voters.size(); i7++) {
                            b(tL_messageMediaPoll.results.recent_voters.get(i7), arrayList, arrayList2);
                        }
                    }
                    if (!tL_messageMediaPoll.results.results.isEmpty()) {
                        ArrayList<TLRPC.PollAnswerVoters> arrayList7 = tL_messageMediaPoll.results.results;
                        int size3 = arrayList7.size();
                        int i8 = 0;
                        while (i8 < size3) {
                            TLRPC.PollAnswerVoters pollAnswerVoters = arrayList7.get(i8);
                            i8++;
                            TLRPC.PollAnswerVoters pollAnswerVoters2 = pollAnswerVoters;
                            ArrayList<TLRPC.Peer> arrayList8 = pollAnswerVoters2.recent_voters;
                            if (arrayList8 != null && !arrayList8.isEmpty()) {
                                ArrayList<TLRPC.Peer> arrayList9 = pollAnswerVoters2.recent_voters;
                                int size4 = arrayList9.size();
                                int i9 = 0;
                                while (i9 < size4) {
                                    TLRPC.Peer peer10 = arrayList9.get(i9);
                                    i9++;
                                    b(peer10, arrayList, arrayList2);
                                }
                            }
                        }
                    }
                }
            }
            TLRPC.MessageMedia messageMedia5 = message.media;
            if ((messageMedia5 instanceof TLRPC.TL_messageMediaStory) && (storyItem = messageMedia5.storyItem) != null) {
                TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                if (storyFwdHeader2 != null) {
                    b(storyFwdHeader2.from, arrayList, arrayList2);
                }
                TL_stories.StoryItem storyItem2 = message.media.storyItem;
                if (storyItem2 != null && storyItem2.media_areas != null) {
                    for (int i10 = 0; i10 < message.media.storyItem.media_areas.size(); i10++) {
                        if (message.media.storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            long j9 = ((TL_stories.TL_mediaAreaChannelPost) message.media.storyItem.media_areas.get(i10)).channel_id;
                            if (!arrayList2.contains(Long.valueOf(j9))) {
                                arrayList2.add(Long.valueOf(j9));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem3 = message.media.storyItem;
                if (storyItem3 != null && (peer6 = storyItem3.from_id) != null) {
                    b(peer6, arrayList, arrayList2);
                }
            }
            TLRPC.MessageMedia messageMedia6 = message.media;
            if ((messageMedia6 instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia6.webpage) != null && webPage.attributes != null) {
                for (int i11 = 0; i11 < message.media.webpage.attributes.size(); i11++) {
                    if (message.media.webpage.attributes.get(i11) instanceof TLRPC.TL_webPageAttributeStory) {
                        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) message.media.webpage.attributes.get(i11);
                        TL_stories.StoryItem storyItem4 = tL_webPageAttributeStory.storyItem;
                        if (storyItem4 != null && (storyFwdHeader = storyItem4.fwd_from) != null) {
                            b(storyFwdHeader.from, arrayList, arrayList2);
                        }
                        TL_stories.StoryItem storyItem5 = tL_webPageAttributeStory.storyItem;
                        if (storyItem5 != null && storyItem5.media_areas != null) {
                            for (int i12 = 0; i12 < tL_webPageAttributeStory.storyItem.media_areas.size(); i12++) {
                                if (tL_webPageAttributeStory.storyItem.media_areas.get(i12) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                    long j10 = ((TL_stories.TL_mediaAreaChannelPost) tL_webPageAttributeStory.storyItem.media_areas.get(i12)).channel_id;
                                    if (!arrayList2.contains(Long.valueOf(j10))) {
                                        arrayList2.add(Long.valueOf(j10));
                                    }
                                }
                            }
                        }
                        TL_stories.StoryItem storyItem6 = tL_webPageAttributeStory.storyItem;
                        if (storyItem6 != null && (peer5 = storyItem6.from_id) != null) {
                            b(peer5, arrayList, arrayList2);
                        }
                    }
                }
            }
            TLRPC.Peer peer11 = message.media.peer;
            if (peer11 != null) {
                b(peer11, arrayList, arrayList2);
            }
        }
        TLRPC.MessageReplies messageReplies = message.replies;
        if (messageReplies != null) {
            int size5 = messageReplies.recent_repliers.size();
            for (int i13 = 0; i13 < size5; i13++) {
                b(message.replies.recent_repliers.get(i13), arrayList, arrayList2);
            }
        }
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        if (messageReplyHeader != null && (peer4 = messageReplyHeader.reply_to_peer_id) != null) {
            b(peer4, arrayList, arrayList2);
        }
        TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
        if (messageFwdHeader2 != null) {
            b(messageFwdHeader2.from_id, arrayList, arrayList2);
            b(message.fwd_from.saved_from_peer, arrayList, arrayList2);
        }
        TLRPC.MessageReplyHeader messageReplyHeader2 = message.reply_to;
        if (messageReplyHeader2 != null && (messageFwdHeader = messageReplyHeader2.reply_from) != null && (peer3 = messageFwdHeader.from_id) != null) {
            b(peer3, arrayList, arrayList2);
        }
        HashMap<String, String> hashMap = message.params;
        if (hashMap != null && (str = hashMap.get("fwd_peer")) != null) {
            long longValue = Utilities.A(str).longValue();
            if (longValue < 0) {
                long j11 = -longValue;
                if (!arrayList2.contains(Long.valueOf(j11))) {
                    arrayList2.add(Long.valueOf(j11));
                }
            }
        }
        TLRPC.TL_messageReactions tL_messageReactions = message.reactions;
        if (tL_messageReactions == null || tL_messageReactions.top_reactors == null) {
            return;
        }
        for (int i14 = 0; i14 < message.reactions.top_reactors.size(); i14++) {
            TLRPC.MessageReactor messageReactor = message.reactions.top_reactors.get(i14);
            if (messageReactor != null && (peer2 = messageReactor.peer_id) != null) {
                b(peer2, arrayList, arrayList2);
            }
        }
    }

    public static boolean p0(vf6 vf6Var) {
        return vf6Var == null || vf6Var.m() == 0;
    }

    public static boolean q0(LongSparseIntArray longSparseIntArray) {
        return longSparseIntArray == null || longSparseIntArray.size() == 0;
    }

    public static boolean s0(TLRPC.MessageAction messageAction) {
        return (messageAction instanceof TLRPC.TL_messageActionPinMessage) || (messageAction instanceof TLRPC.TL_messageActionPaymentSent) || (messageAction instanceof TLRPC.TL_messageActionGameScore) || (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) || (messageAction instanceof TLRPC.TL_messageActionPollAppendAnswer) || (messageAction instanceof TLRPC.TL_messageActionPollDeleteAnswer);
    }

    public static void v(long j, SQLitePreparedStatement sQLitePreparedStatement, SQLitePreparedStatement sQLitePreparedStatement2, int i, long j2) {
        int i2;
        int i3;
        sQLitePreparedStatement.requery();
        sQLitePreparedStatement.bindLong(1, j);
        if (j2 != 0) {
            sQLitePreparedStatement.bindLong(2, j2);
            i2 = 3;
        } else {
            i2 = 2;
        }
        int i4 = i2 + 1;
        sQLitePreparedStatement.bindInteger(i2, i == 1 ? 1 : 0);
        sQLitePreparedStatement.bindInteger(i4, i);
        sQLitePreparedStatement.step();
        for (int i5 = 0; i5 < 9; i5++) {
            sQLitePreparedStatement2.requery();
            sQLitePreparedStatement2.bindLong(1, j);
            if (j2 != 0) {
                sQLitePreparedStatement2.bindLong(2, j2);
                i3 = 3;
            } else {
                i3 = 2;
            }
            int i6 = i3 + 1;
            sQLitePreparedStatement2.bindInteger(i3, i5);
            int i7 = i3 + 2;
            sQLitePreparedStatement2.bindInteger(i6, i == 1 ? 1 : 0);
            sQLitePreparedStatement2.bindInteger(i7, i);
            sQLitePreparedStatement2.step();
        }
    }

    public static boolean v0(TLRPC.Message message) {
        TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
        if (replyMarkup == null || (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            return false;
        }
        return !replyMarkup.selective || message.mentioned;
    }

    public static void z(SQLiteDatabase sQLiteDatabase) {
        ir2.B(sQLiteDatabase, "CREATE TABLE messages_holes(uid INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, start));", "CREATE INDEX IF NOT EXISTS uid_end_messages_holes_4_dialogs ON messages_holes(uid, end);", "CREATE TABLE media_holes_v2(uid INTEGER, type INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, type, start));", "CREATE INDEX IF NOT EXISTS uid_end_media_holes_v2 ON media_holes_v2(uid, type, end);");
        ir2.B(sQLiteDatabase, "CREATE TABLE scheduled_messages_v2(mid INTEGER, uid INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, uid))", "CREATE INDEX IF NOT EXISTS send_state_idx_scheduled_messages_v2 ON scheduled_messages_v2(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS uid_date_idx_scheduled_messages_v2 ON scheduled_messages_v2(uid, date);", "CREATE INDEX IF NOT EXISTS reply_to_idx_scheduled_messages_v2 ON scheduled_messages_v2(mid, reply_to_message_id);");
        ir2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS idx_to_reply_scheduled_messages_v2 ON scheduled_messages_v2(reply_to_message_id, mid);", "CREATE TABLE messages_v2(mid INTEGER, uid INTEGER, read_state INTEGER, send_state INTEGER, date INTEGER, data BLOB, out INTEGER, ttl INTEGER, media INTEGER, replydata BLOB, imp INTEGER, mention INTEGER, forwards INTEGER, replies_data BLOB, thread_reply_id INTEGER, is_channel INTEGER, reply_to_message_id INTEGER, custom_params BLOB, group_id INTEGER, reply_to_story_id INTEGER, PRIMARY KEY(mid, uid))", "CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_v2 ON messages_v2(uid, mid, read_state, out);", "CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages_v2 ON messages_v2(uid, date, mid);");
        ir2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS mid_out_idx_messages_v2 ON messages_v2(mid, out);", "CREATE INDEX IF NOT EXISTS task_idx_messages_v2 ON messages_v2(uid, out, read_state, ttl, date, send_state);", "CREATE INDEX IF NOT EXISTS send_state_idx_messages_v2 ON messages_v2(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_v2 ON messages_v2(uid, mention, read_state);");
        ir2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS is_channel_idx_messages_v2 ON messages_v2(mid, is_channel);", "CREATE INDEX IF NOT EXISTS reply_to_idx_messages_v2 ON messages_v2(mid, reply_to_message_id);", "CREATE INDEX IF NOT EXISTS idx_to_reply_messages_v2 ON messages_v2(reply_to_message_id, mid);", "CREATE INDEX IF NOT EXISTS uid_mid_groupid_messages_v2 ON messages_v2(uid, mid, group_id);");
        ir2.B(sQLiteDatabase, "CREATE TABLE saved_dialogs(did INTEGER, date INTEGER, last_mid INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, last_mid_group INTEGER, count INTEGER, forumChatId INTEGER, unread_count INTEGER, max_read_id INTEGER, read_outbox INTEGER, PRIMARY KEY (did, forumChatId))", "CREATE INDEX IF NOT EXISTS date_idx_4_saved_dialogs ON saved_dialogs(date);", "CREATE INDEX IF NOT EXISTS last_mid_idx_4_saved_dialogs ON saved_dialogs(last_mid);", "CREATE INDEX IF NOT EXISTS folder_id_idx_4_saved_dialogs ON saved_dialogs(folder_id);");
        ir2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS flags_idx_4_saved_dialogs ON saved_dialogs(flags);", "CREATE INDEX IF NOT EXISTS forum_idx_dialogs ON saved_dialogs(forumChatId);", "CREATE TABLE download_queue(uid INTEGER, type INTEGER, date INTEGER, data BLOB, parent TEXT, PRIMARY KEY (uid, type));", "CREATE INDEX IF NOT EXISTS type_date_idx_download_queue ON download_queue(type, date);");
        ir2.B(sQLiteDatabase, "CREATE TABLE user_contacts_v7(key TEXT PRIMARY KEY, uid INTEGER, fname TEXT, sname TEXT, imported INTEGER)", "CREATE TABLE user_phones_v7(key TEXT, phone TEXT, sphone TEXT, deleted INTEGER, PRIMARY KEY (key, phone))", "CREATE INDEX IF NOT EXISTS sphone_deleted_idx_user_phones ON user_phones_v7(sphone, deleted);", "CREATE TABLE dialogs(did INTEGER PRIMARY KEY, date INTEGER, unread_count INTEGER, last_mid INTEGER, inbox_max INTEGER, outbox_max INTEGER, last_mid_i INTEGER, unread_count_i INTEGER, pts INTEGER, date_i INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, data BLOB, unread_reactions INTEGER, last_mid_group INTEGER, ttl_period INTEGER, unread_poll_votes INTEGER)");
        ir2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS date_idx_4_dialogs ON dialogs(date);", "CREATE INDEX IF NOT EXISTS last_mid_idx_4_dialogs ON dialogs(last_mid);", "CREATE INDEX IF NOT EXISTS unread_count_idx_dialogs ON dialogs(unread_count);", "CREATE INDEX IF NOT EXISTS last_mid_i_idx_dialogs ON dialogs(last_mid_i);");
        ir2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS unread_count_i_idx_dialogs ON dialogs(unread_count_i);", "CREATE INDEX IF NOT EXISTS folder_id_idx_4_dialogs ON dialogs(folder_id);", "CREATE INDEX IF NOT EXISTS flags_idx_4_dialogs ON dialogs(flags);", "CREATE TABLE dialog_filter(id INTEGER PRIMARY KEY, ord INTEGER, unread_count INTEGER, flags INTEGER, title TEXT, color INTEGER DEFAULT -1, entities BLOB, noanimate INTEGER)");
        ir2.B(sQLiteDatabase, "CREATE TABLE dialog_filter_ep(id INTEGER, peer INTEGER, PRIMARY KEY (id, peer))", "CREATE TABLE dialog_filter_pin_v2(id INTEGER, peer INTEGER, pin INTEGER, PRIMARY KEY (id, peer))", "CREATE TABLE randoms_v2(random_id INTEGER, mid INTEGER, uid INTEGER, PRIMARY KEY (random_id, mid, uid))", "CREATE INDEX IF NOT EXISTS mid_idx_randoms_v2 ON randoms_v2(mid, uid);");
        ir2.B(sQLiteDatabase, "CREATE TABLE enc_tasks_v4(mid INTEGER, uid INTEGER, date INTEGER, media INTEGER, PRIMARY KEY(mid, uid, media))", "CREATE INDEX IF NOT EXISTS date_idx_enc_tasks_v4 ON enc_tasks_v4(date);", "CREATE TABLE messages_seq(mid INTEGER PRIMARY KEY, seq_in INTEGER, seq_out INTEGER);", "CREATE INDEX IF NOT EXISTS seq_idx_messages_seq ON messages_seq(seq_in, seq_out);");
        ir2.B(sQLiteDatabase, "CREATE TABLE params(id INTEGER PRIMARY KEY, seq INTEGER, pts INTEGER, date INTEGER, qts INTEGER, lsv INTEGER, sg INTEGER, pbytes BLOB)", "INSERT INTO params VALUES(1, 0, 0, 0, 0, 0, 0, NULL)", "CREATE TABLE media_v4(mid INTEGER, uid INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid, type))", "CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_v4 ON media_v4(uid, mid, type, date);");
        ir2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS uid_type_date_mid_idx_media_v4 ON media_v4(uid, type, date DESC, mid DESC);", "CREATE INDEX IF NOT EXISTS media_v4_music_browse_idx ON media_v4(uid, date DESC, mid DESC) WHERE type = 4 AND mid > 0 AND uid != 0;", "CREATE TABLE bot_keyboard(uid INTEGER PRIMARY KEY, mid INTEGER, info BLOB)", "CREATE INDEX IF NOT EXISTS bot_keyboard_idx_mid_v2 ON bot_keyboard(mid, uid);");
        ir2.B(sQLiteDatabase, "CREATE TABLE bot_keyboard_topics(uid INTEGER, tid INTEGER, mid INTEGER, info BLOB, PRIMARY KEY(uid, tid))", "CREATE INDEX IF NOT EXISTS bot_keyboard_topics_idx_mid_v2 ON bot_keyboard_topics(mid, uid, tid);", "CREATE TABLE chat_settings_v2(uid INTEGER PRIMARY KEY, info BLOB, pinned INTEGER, online INTEGER, inviter INTEGER, links INTEGER, participants_count INTEGER)", "CREATE INDEX IF NOT EXISTS chat_settings_pinned_idx ON chat_settings_v2(uid, pinned) WHERE pinned != 0;");
        ir2.B(sQLiteDatabase, "CREATE TABLE user_settings(uid INTEGER PRIMARY KEY, info BLOB, pinned INTEGER)", "CREATE INDEX IF NOT EXISTS user_settings_pinned_idx ON user_settings(uid, pinned) WHERE pinned != 0;", "CREATE TABLE chat_pinned_v2(uid INTEGER, mid INTEGER, data BLOB, PRIMARY KEY (uid, mid));", "CREATE TABLE chat_pinned_count(uid INTEGER PRIMARY KEY, count INTEGER, end INTEGER);");
        ir2.B(sQLiteDatabase, "CREATE TABLE chat_hints(did INTEGER, type INTEGER, rating REAL, date INTEGER, PRIMARY KEY(did, type))", "CREATE INDEX IF NOT EXISTS chat_hints_rating_idx ON chat_hints(rating);", "CREATE TABLE botcache(id TEXT PRIMARY KEY, date INTEGER, data BLOB)", "CREATE INDEX IF NOT EXISTS botcache_date_idx ON botcache(date);");
        ir2.B(sQLiteDatabase, "CREATE TABLE users_data(uid INTEGER PRIMARY KEY, about TEXT)", "CREATE TABLE users(uid INTEGER PRIMARY KEY, name TEXT, status INTEGER, data BLOB)", "CREATE TABLE chats(uid INTEGER PRIMARY KEY, name TEXT, data BLOB)", "CREATE TABLE enc_chats(uid INTEGER PRIMARY KEY, user INTEGER, name TEXT, data BLOB, g BLOB, authkey BLOB, ttl INTEGER, layer INTEGER, seq_in INTEGER, seq_out INTEGER, use_count INTEGER, exchange_id INTEGER, key_date INTEGER, fprint INTEGER, fauthkey BLOB, khash BLOB, in_seq_no INTEGER, admin_id INTEGER, mtproto_seq INTEGER)");
        ir2.B(sQLiteDatabase, "CREATE TABLE channel_users_v2(did INTEGER, uid INTEGER, date INTEGER, data BLOB, PRIMARY KEY(did, uid))", "CREATE TABLE channel_admins_v3(did INTEGER, uid INTEGER, data BLOB, PRIMARY KEY(did, uid))", "CREATE TABLE contacts(uid INTEGER PRIMARY KEY, mutual INTEGER)", "CREATE TABLE dialog_photos(uid INTEGER, id INTEGER, num INTEGER, data BLOB, PRIMARY KEY (uid, id))");
        ir2.B(sQLiteDatabase, "CREATE TABLE dialog_photos_count(uid INTEGER PRIMARY KEY, count INTEGER)", "CREATE TABLE dialog_settings(did INTEGER PRIMARY KEY, flags INTEGER);", "CREATE TABLE web_recent_v3(id TEXT, type INTEGER, image_url TEXT, thumb_url TEXT, local_url TEXT, width INTEGER, height INTEGER, size INTEGER, date INTEGER, document BLOB, PRIMARY KEY (id, type));", "CREATE TABLE stickers_v2(id INTEGER PRIMARY KEY, data BLOB, date INTEGER, hash INTEGER);");
        ir2.B(sQLiteDatabase, "CREATE TABLE stickers_featured(id INTEGER PRIMARY KEY, data BLOB, unread BLOB, date INTEGER, hash INTEGER, premium INTEGER, emoji INTEGER);", "CREATE TABLE stickers_dice(emoji TEXT PRIMARY KEY, data BLOB, date INTEGER);", "CREATE TABLE hashtag_recent_v2(id TEXT PRIMARY KEY, date INTEGER);", "CREATE TABLE webpage_pending_v2(id INTEGER, mid INTEGER, uid INTEGER, PRIMARY KEY (id, mid, uid));");
        ir2.B(sQLiteDatabase, "CREATE TABLE sent_files_v2(uid TEXT, type INTEGER, data BLOB, parent TEXT, PRIMARY KEY (uid, type))", "CREATE TABLE search_recent(did INTEGER PRIMARY KEY, date INTEGER);", "CREATE TABLE media_counts_v2(uid INTEGER, type INTEGER, count INTEGER, old INTEGER, PRIMARY KEY(uid, type))", "CREATE TABLE keyvalue(id TEXT PRIMARY KEY, value TEXT)");
        ir2.B(sQLiteDatabase, "CREATE TABLE bot_info_v2(uid INTEGER, dialogId INTEGER, info BLOB, PRIMARY KEY(uid, dialogId))", "CREATE TABLE pending_tasks(id INTEGER PRIMARY KEY, data BLOB);", "CREATE TABLE requested_holes(uid INTEGER, seq_out_start INTEGER, seq_out_end INTEGER, PRIMARY KEY (uid, seq_out_start, seq_out_end));", "CREATE TABLE sharing_locations(uid INTEGER PRIMARY KEY, mid INTEGER, date INTEGER, period INTEGER, message BLOB, proximity INTEGER);");
        ir2.B(sQLiteDatabase, "CREATE TABLE stickersets2(id INTEGER PRIMATE KEY, data BLOB, hash INTEGER, date INTEGER, short_name TEXT);", "CREATE INDEX IF NOT EXISTS stickersets2_id_index ON stickersets2(id);", "CREATE INDEX IF NOT EXISTS stickersets2_id_short_name ON stickersets2(id, short_name);", "CREATE INDEX IF NOT EXISTS stickers_featured_emoji_index ON stickers_featured(emoji);");
        ir2.B(sQLiteDatabase, "CREATE TABLE shortcut_widget(id INTEGER, did INTEGER, ord INTEGER, PRIMARY KEY (id, did));", "CREATE INDEX IF NOT EXISTS shortcut_widget_did ON shortcut_widget(did);", "CREATE TABLE emoji_keywords_v2(lang TEXT, keyword TEXT, emoji TEXT, PRIMARY KEY(lang, keyword, emoji));", "CREATE INDEX IF NOT EXISTS emoji_keywords_v2_keyword ON emoji_keywords_v2(keyword);");
        ir2.B(sQLiteDatabase, "CREATE TABLE emoji_keywords_info_v2(lang TEXT PRIMARY KEY, alias TEXT, version INTEGER, date INTEGER);", "CREATE TABLE wallpapers2(uid INTEGER PRIMARY KEY, data BLOB, num INTEGER)", "CREATE INDEX IF NOT EXISTS wallpapers_num ON wallpapers2(num);", "CREATE TABLE unread_push_messages(uid INTEGER, mid INTEGER, random INTEGER, date INTEGER, data BLOB, fm TEXT, name TEXT, uname TEXT, flags INTEGER, topicId INTEGER, is_reaction INTEGER, PRIMARY KEY(uid, mid))");
        ir2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS unread_push_messages_idx_date ON unread_push_messages(date);", "CREATE INDEX IF NOT EXISTS unread_push_messages_idx_random ON unread_push_messages(random);", "CREATE TABLE polls_v2(mid INTEGER, uid INTEGER, id INTEGER, PRIMARY KEY (mid, uid));", "CREATE INDEX IF NOT EXISTS polls_id_v2 ON polls_v2(id);");
        ir2.B(sQLiteDatabase, "CREATE TABLE reactions(data BLOB, hash INTEGER, date INTEGER);", "CREATE TABLE reaction_mentions(message_id INTEGER, state INTEGER, dialog_id INTEGER, PRIMARY KEY(message_id, dialog_id))", "CREATE INDEX IF NOT EXISTS reaction_mentions_did ON reaction_mentions(dialog_id);", "CREATE TABLE downloading_documents(data BLOB, hash INTEGER, id INTEGER, state INTEGER, date INTEGER, PRIMARY KEY(hash, id));");
        ir2.B(sQLiteDatabase, "CREATE TABLE animated_emoji(document_id INTEGER PRIMARY KEY, data BLOB);", "CREATE TABLE attach_menu_bots(data BLOB, hash INTEGER, date INTEGER);", "CREATE TABLE premium_promo(data BLOB, date INTEGER);", "CREATE TABLE emoji_statuses(data BLOB, type INTEGER);");
        ir2.B(sQLiteDatabase, "CREATE TABLE messages_holes_topics(uid INTEGER, topic_id INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, topic_id, start));", "CREATE INDEX IF NOT EXISTS uid_end_messages_holes_4_topics ON messages_holes_topics(uid, topic_id, end);", "CREATE TABLE messages_topics(mid INTEGER, uid INTEGER, topic_id INTEGER, read_state INTEGER, send_state INTEGER, date INTEGER, data BLOB, out INTEGER, ttl INTEGER, media INTEGER, replydata BLOB, imp INTEGER, mention INTEGER, forwards INTEGER, replies_data BLOB, thread_reply_id INTEGER, is_channel INTEGER, reply_to_message_id INTEGER, custom_params BLOB, reply_to_story_id INTEGER, PRIMARY KEY(mid, topic_id, uid))", "CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages_topics ON messages_topics(uid, date, mid);");
        ir2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS mid_out_idx_messages_topics ON messages_topics(mid, out);", "CREATE INDEX IF NOT EXISTS task_idx_messages_topics ON messages_topics(uid, out, read_state, ttl, date, send_state);", "CREATE INDEX IF NOT EXISTS send_state_idx_messages_topics ON messages_topics(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS is_channel_idx_messages_topics ON messages_topics(mid, is_channel);");
        ir2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS reply_to_idx_messages_topics ON messages_topics(mid, reply_to_message_id);", "CREATE INDEX IF NOT EXISTS idx_to_reply_messages_topics ON messages_topics(reply_to_message_id, mid);", "CREATE INDEX IF NOT EXISTS mid_uid_messages_topics ON messages_topics(mid, uid);", "CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_topics ON messages_topics(uid, topic_id, mid, read_state, out);");
        ir2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_topics ON messages_topics(uid, topic_id, mention, read_state);", "CREATE INDEX IF NOT EXISTS uid_topic_id_messages_topics ON messages_topics(uid, topic_id);", "CREATE INDEX IF NOT EXISTS uid_topic_id_date_mid_messages_topics ON messages_topics(uid, topic_id, date, mid);", "CREATE INDEX IF NOT EXISTS uid_topic_id_mid_messages_topics ON messages_topics(uid, topic_id, mid);");
        ir2.B(sQLiteDatabase, "CREATE TABLE media_topics(mid INTEGER, uid INTEGER, topic_id INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid, topic_id, type))", "CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_topics ON media_topics(uid, topic_id, mid, type, date);", "CREATE TABLE media_holes_topics(uid INTEGER, topic_id INTEGER, type INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, topic_id, type, start));", "CREATE INDEX IF NOT EXISTS uid_end_media_holes_topics ON media_holes_topics(uid, topic_id, type, end);");
        ir2.B(sQLiteDatabase, "CREATE TABLE topics(did INTEGER, topic_id INTEGER, data BLOB, top_message INTEGER, topic_message BLOB, unread_count INTEGER, max_read_id INTEGER, unread_mentions INTEGER, unread_reactions INTEGER, read_outbox INTEGER, pinned INTEGER, total_messages_count INTEGER, hidden INTEGER, edit_date INTEGER, nopaid_messages_exception INTEGER, unread_poll_votes INTEGER, PRIMARY KEY(did, topic_id));", "CREATE INDEX IF NOT EXISTS did_top_message_topics ON topics(did, top_message);", "CREATE INDEX IF NOT EXISTS did_topics ON topics(did);", "CREATE TABLE media_counts_topics(uid INTEGER, topic_id INTEGER, type INTEGER, count INTEGER, old INTEGER, PRIMARY KEY(uid, topic_id, type))");
        ir2.B(sQLiteDatabase, "CREATE TABLE reaction_mentions_topics(message_id INTEGER, state INTEGER, dialog_id INTEGER, topic_id INTEGER, PRIMARY KEY(message_id, dialog_id, topic_id))", "CREATE INDEX IF NOT EXISTS reaction_mentions_topics_did ON reaction_mentions_topics(dialog_id, topic_id);", "CREATE TABLE emoji_groups(type INTEGER PRIMARY KEY, data BLOB)", "CREATE TABLE app_config(data BLOB)");
        ir2.B(sQLiteDatabase, "CREATE TABLE web_browser_settings(data BLOB)", "CREATE TABLE effects(data BLOB)", "CREATE TABLE stories (dialog_id INTEGER, story_id INTEGER, data BLOB, custom_params BLOB, PRIMARY KEY (dialog_id, story_id));", "CREATE TABLE stories_counter (dialog_id INTEGER PRIMARY KEY, count INTEGER, max_read INTEGER);");
        ir2.B(sQLiteDatabase, "CREATE TABLE profile_stories (dialog_id INTEGER, story_id INTEGER, data BLOB, type INTEGER, seen INTEGER, pin INTEGER, PRIMARY KEY(dialog_id, story_id, type));", "CREATE TABLE profile_stories_albums (dialog_id INTEGER, album_id INTEGER, order_index INTEGER, data BLOB, PRIMARY KEY(dialog_id, album_id));", "CREATE TABLE profile_stories_albums_links (dialog_id INTEGER, album_id INTEGER, story_id INTEGER, order_index INTEGER, PRIMARY KEY (dialog_id, album_id, story_id));", "CREATE TABLE story_drafts (id INTEGER PRIMARY KEY, date INTEGER, data BLOB, type INTEGER);");
        ir2.B(sQLiteDatabase, "CREATE TABLE story_pushes (uid INTEGER, sid INTEGER, date INTEGER, localName TEXT, flags INTEGER, expire_date INTEGER, live INTEGER, PRIMARY KEY(uid, sid));", "CREATE TABLE unconfirmed_auth (data BLOB);", "CREATE TABLE saved_reaction_tags (topic_id INTEGER PRIMARY KEY, data BLOB);", "CREATE TABLE tag_message_id(mid INTEGER, topic_id INTEGER, tag INTEGER, text TEXT);");
        ir2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS tag_idx_tag_message_id ON tag_message_id(tag);", "CREATE INDEX IF NOT EXISTS tag_text_idx_tag_message_id ON tag_message_id(tag, text COLLATE NOCASE);", "CREATE INDEX IF NOT EXISTS tag_topic_idx_tag_message_id ON tag_message_id(topic_id, tag);", "CREATE INDEX IF NOT EXISTS tag_topic_text_idx_tag_message_id ON tag_message_id(topic_id, tag, text COLLATE NOCASE);");
        ir2.B(sQLiteDatabase, "CREATE TABLE business_replies(topic_id INTEGER PRIMARY KEY, name TEXT, order_value INTEGER, count INTEGER);", "CREATE TABLE quick_replies_messages(mid INTEGER, topic_id INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, topic_id))", "CREATE INDEX IF NOT EXISTS send_state_idx_quick_replies_messages ON quick_replies_messages(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS topic_date_idx_quick_replies_messages ON quick_replies_messages(topic_id, date);");
        ir2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS reply_to_idx_quick_replies_messages ON quick_replies_messages(mid, reply_to_message_id);", "CREATE INDEX IF NOT EXISTS idx_to_reply_quick_replies_messages ON quick_replies_messages(reply_to_message_id, mid);", "CREATE TABLE welcome_messages(mid INTEGER, dialog_id INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, dialog_id))", "CREATE INDEX IF NOT EXISTS send_state_idx_welcome_messages ON welcome_messages(mid, send_state, date);");
        ir2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS dialog_date_idx_welcome_messages ON welcome_messages(dialog_id, date);", "CREATE INDEX IF NOT EXISTS reply_to_idx_welcome_messages ON welcome_messages(mid, reply_to_message_id);", "CREATE INDEX IF NOT EXISTS idx_to_reply_welcome_messages ON welcome_messages(reply_to_message_id, mid);", "CREATE TABLE business_links(data BLOB, order_value INTEGER);");
        ir2.B(sQLiteDatabase, "CREATE TABLE fact_checks(hash INTEGER PRIMARY KEY, data BLOB, expires INTEGER);", "CREATE TABLE popular_bots(uid INTEGER PRIMARY KEY, time INTEGER, offset TEXT, pos INTEGER);", "CREATE TABLE star_gifts2(id INTEGER PRIMARY KEY, data BLOB, hash INTEGER, time INTEGER, pos INTEGER);", "CREATE TABLE gift_themes (slug TEXT PRIMARY KEY, data BLOB);");
        ir2.B(sQLiteDatabase, "CREATE TABLE poll_votes_mentions(message_id INTEGER, state INTEGER, dialog_id INTEGER, PRIMARY KEY(message_id, dialog_id))", "CREATE INDEX IF NOT EXISTS poll_votes_mentions_did ON poll_votes_mentions(dialog_id);", "CREATE TABLE poll_votes_mentions_topics(message_id INTEGER, state INTEGER, dialog_id INTEGER, topic_id INTEGER, PRIMARY KEY(message_id, dialog_id, topic_id))", "CREATE INDEX IF NOT EXISTS poll_votes_mentions_topics_did ON poll_votes_mentions_topics(dialog_id, topic_id);");
        ir2.B(sQLiteDatabase, "CREATE TABLE ephemeral_messages (id INTEGER, dialog_id INTEGER, topic_id INTEGER, date INTEGER, data BLOB, PRIMARY KEY(dialog_id, id));", "CREATE INDEX IF NOT EXISTS ephemeral_messages_date_idx ON ephemeral_messages(date);", "CREATE TABLE widget_state(uid INTEGER, mid INTEGER, local TEXT, PRIMARY KEY(uid, mid));", "CREATE TABLE widget_heights(uid INTEGER, mid INTEGER, width INTEGER, height INTEGER, date INTEGER, anchor INTEGER default 0, PRIMARY KEY(uid, mid, width));");
        ir2.z(sQLiteDatabase, "CREATE TABLE onchain_offer_intents(slug TEXT, amount INTEGER, duration INTEGER, random_id INTEGER, used_at INTEGER, PRIMARY KEY(slug, amount, duration));", "PRAGMA user_version = 182");
    }

    public final void A(long j, SparseArray sparseArray) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                ArrayList arrayList = new ArrayList();
                if (sparseArray.size() != 0) {
                    this.b.beginTransaction();
                    SQLitePreparedStatement executeFast = this.b.executeFast("REPLACE INTO enc_tasks_v4 VALUES(?, ?, ?, ?)");
                    int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                        try {
                            int keyAt = sparseArray.keyAt(i2);
                            ArrayList arrayList2 = (ArrayList) sparseArray.get(keyAt);
                            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                                int intValue = ((Integer) arrayList2.get(i3)).intValue();
                                executeFast.requery();
                                executeFast.bindInteger(1, intValue);
                                executeFast.bindLong(2, j);
                                executeFast.bindInteger(3, keyAt);
                                executeFast.bindInteger(4, 1);
                                i = Math.min(i, intValue);
                                executeFast.step();
                                arrayList.add((Integer) arrayList2.get(i3));
                            }
                        } catch (Exception e) {
                            e = e;
                            sQLitePreparedStatement = executeFast;
                            n(e, true);
                            SQLiteDatabase sQLiteDatabase = this.b;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.commitTransaction();
                            }
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            sQLitePreparedStatement = executeFast;
                            SQLiteDatabase sQLiteDatabase2 = this.b;
                            if (sQLiteDatabase2 != null) {
                                sQLiteDatabase2.commitTransaction();
                            }
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            throw th;
                        }
                    }
                    executeFast.dispose();
                    this.b.commitTransaction();
                    SQLiteDatabase sQLiteDatabase3 = this.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase3.executeFast("UPDATE messages_v2 SET ttl = 0 WHERE uid = " + j + " AND mid IN(" + TextUtils.join(", ", arrayList) + ")").stepThis().dispose();
                    getMessagesController().k0(i, j, sparseArray);
                }
                SQLiteDatabase sQLiteDatabase4 = this.b;
                if (sQLiteDatabase4 != null) {
                    sQLiteDatabase4.commitTransaction();
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x03cb, code lost:
    
        if (r3.migrated_to == null) goto L184;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0588  */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0() {
        SQLiteCursor sQLiteCursor;
        String str;
        ArrayList arrayList;
        vf6 vf6Var;
        ArrayList arrayList2;
        String str2;
        ArrayList arrayList3;
        SQLiteCursor sQLiteCursor2;
        ArrayList arrayList4;
        vf6 vf6Var2;
        ArrayList arrayList5;
        vf6 vf6Var3;
        int i;
        vf6 vf6Var4;
        vf6 vf6Var5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        String str3;
        ArrayList arrayList9;
        ArrayList arrayList10;
        NativeByteBuffer byteBufferValue;
        try {
            ArrayList arrayList11 = new ArrayList();
            ArrayList arrayList12 = new ArrayList();
            ArrayList arrayList13 = new ArrayList();
            vf6 vf6Var6 = new vf6();
            SQLiteCursor queryFinalized = this.b.queryFinalized("SELECT d.did, d.unread_count, s.flags FROM dialogs as d LEFT JOIN dialog_settings as s ON d.did = s.did WHERE d.unread_count > 0", new Object[0]);
            try {
                StringBuilder sb = new StringBuilder();
                int currentTime = getConnectionsManager().getCurrentTime();
                while (true) {
                    str = ",";
                    if (!queryFinalized.next()) {
                        break;
                    }
                    long longValue = queryFinalized.longValue(2);
                    boolean z = (longValue & 1) != 0;
                    int i2 = (int) (longValue >> 32);
                    if (queryFinalized.isNull(2) || !z || (i2 != 0 && i2 < currentTime)) {
                        long longValue2 = queryFinalized.longValue(0);
                        if (!cf3.C(longValue2)) {
                            vf6Var6.k(Integer.valueOf(queryFinalized.intValue(1)), longValue2);
                            if (sb.length() != 0) {
                                sb.append(",");
                            }
                            sb.append(longValue2);
                            if (cf3.B(longValue2)) {
                                int h = cf3.h(longValue2);
                                if (!arrayList13.contains(Integer.valueOf(h))) {
                                    arrayList13.add(Integer.valueOf(h));
                                }
                            } else if (!cf3.D(longValue2)) {
                                long j = -longValue2;
                                if (!arrayList12.contains(Long.valueOf(j))) {
                                    arrayList12.add(Long.valueOf(j));
                                }
                            } else if (!arrayList11.contains(Long.valueOf(longValue2))) {
                                arrayList11.add(Long.valueOf(longValue2));
                            }
                        }
                    }
                }
                queryFinalized.dispose();
                vf6 vf6Var7 = new vf6();
                vf6 vf6Var8 = new vf6();
                ArrayList arrayList14 = new ArrayList();
                ArrayList arrayList15 = new ArrayList();
                ArrayList arrayList16 = new ArrayList();
                ArrayList arrayList17 = new ArrayList();
                ArrayList arrayList18 = new ArrayList();
                if (sb.length() > 0) {
                    SQLiteDatabase sQLiteDatabase = this.b;
                    StringBuilder sb2 = new StringBuilder();
                    vf6 vf6Var9 = vf6Var6;
                    sb2.append("SELECT read_state, data, send_state, mid, date, uid, replydata FROM messages_v2 WHERE uid IN (");
                    sb2.append(sb.toString());
                    sb2.append(") AND out = 0 AND read_state IN(0,2) ORDER BY date DESC LIMIT 50");
                    sQLiteCursor2 = sQLiteDatabase.queryFinalized(sb2.toString(), new Object[0]);
                    int i3 = 0;
                    while (sQLiteCursor2.next()) {
                        try {
                            try {
                                NativeByteBuffer byteBufferValue2 = sQLiteCursor2.byteBufferValue(1);
                                if (byteBufferValue2 != null) {
                                    arrayList9 = arrayList17;
                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                    arrayList8 = arrayList18;
                                    TLdeserialize.readAttachPath(byteBufferValue2, getUserConfig().n);
                                    byteBufferValue2.reuse();
                                    k27.L5(sQLiteCursor2.intValue(0), TLdeserialize);
                                    TLdeserialize.id = sQLiteCursor2.intValue(3);
                                    TLdeserialize.date = sQLiteCursor2.intValue(4);
                                    str3 = str;
                                    TLdeserialize.dialog_id = sQLiteCursor2.longValue(5);
                                    arrayList14.add(TLdeserialize);
                                    int max = Math.max(i3, TLdeserialize.date);
                                    d(TLdeserialize, arrayList11, arrayList12, null);
                                    TLdeserialize.send_state = sQLiteCursor2.intValue(2);
                                    if ((TLdeserialize.peer_id.channel_id == 0 && !TLdeserialize.unread && !cf3.B(TLdeserialize.dialog_id)) || TLdeserialize.id > 0) {
                                        TLdeserialize.send_state = 0;
                                    }
                                    if (!cf3.B(TLdeserialize.dialog_id) || sQLiteCursor2.isNull(5)) {
                                        arrayList7 = arrayList14;
                                        arrayList10 = arrayList13;
                                    } else {
                                        arrayList7 = arrayList14;
                                        arrayList10 = arrayList13;
                                        TLdeserialize.random_id = sQLiteCursor2.longValue(5);
                                    }
                                    try {
                                        TLRPC.MessageReplyHeader messageReplyHeader = TLdeserialize.reply_to;
                                        if (messageReplyHeader == null || messageReplyHeader.reply_to_msg_id == 0 || !s0(TLdeserialize.action)) {
                                            sQLiteCursor = sQLiteCursor2;
                                        } else {
                                            if (sQLiteCursor2.isNull(6) || (byteBufferValue = sQLiteCursor2.byteBufferValue(6)) == null) {
                                                sQLiteCursor = sQLiteCursor2;
                                            } else {
                                                TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                TLdeserialize.replyMessage = TLdeserialize2;
                                                sQLiteCursor = sQLiteCursor2;
                                                try {
                                                    try {
                                                        TLdeserialize2.readAttachPath(byteBufferValue, getUserConfig().n);
                                                        byteBufferValue.reuse();
                                                        TLRPC.Message message = TLdeserialize.replyMessage;
                                                        if (message != null) {
                                                            d(message, arrayList11, arrayList12, null);
                                                        }
                                                    } catch (Exception e) {
                                                        e = e;
                                                        try {
                                                            m(e);
                                                            i3 = max;
                                                            sQLiteCursor2 = sQLiteCursor;
                                                            arrayList13 = arrayList10;
                                                            str = str3;
                                                            arrayList17 = arrayList9;
                                                            arrayList18 = arrayList8;
                                                            arrayList14 = arrayList7;
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            m(e);
                                                            if (sQLiteCursor == null) {
                                                                sQLiteCursor.dispose();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    if (sQLiteCursor != null) {
                                                        sQLiteCursor.dispose();
                                                    }
                                                    throw th;
                                                }
                                            }
                                            if (TLdeserialize.replyMessage == null) {
                                                c(TLdeserialize, vf6Var7, vf6Var8);
                                            }
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        sQLiteCursor = sQLiteCursor2;
                                    }
                                    i3 = max;
                                } else {
                                    arrayList7 = arrayList14;
                                    arrayList8 = arrayList18;
                                    str3 = str;
                                    arrayList9 = arrayList17;
                                    arrayList10 = arrayList13;
                                    sQLiteCursor = sQLiteCursor2;
                                }
                                sQLiteCursor2 = sQLiteCursor;
                                arrayList13 = arrayList10;
                                str = str3;
                                arrayList17 = arrayList9;
                                arrayList18 = arrayList8;
                                arrayList14 = arrayList7;
                            } catch (Exception e4) {
                                e = e4;
                                sQLiteCursor = sQLiteCursor2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor = sQLiteCursor2;
                        }
                    }
                    ArrayList arrayList19 = arrayList14;
                    ArrayList arrayList20 = arrayList18;
                    str2 = str;
                    ArrayList arrayList21 = arrayList17;
                    ArrayList arrayList22 = arrayList13;
                    sQLiteCursor2.dispose();
                    this.b.executeFast("DELETE FROM unread_push_messages WHERE date <= " + i3).stepThis().dispose();
                    ?? r9 = 0;
                    SQLiteCursor queryFinalized2 = this.b.queryFinalized("SELECT data, mid, date, uid, random, fm, name, uname, flags, topicId, is_reaction FROM unread_push_messages WHERE 1 ORDER BY date DESC LIMIT 50", new Object[0]);
                    while (queryFinalized2.next()) {
                        try {
                            NativeByteBuffer byteBufferValue3 = queryFinalized2.byteBufferValue(r9);
                            if (byteBufferValue3 != 0) {
                                TLRPC.Message TLdeserialize3 = TLRPC.Message.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(r9), r9);
                                byteBufferValue3.reuse();
                                TLdeserialize3.id = queryFinalized2.intValue(1);
                                TLdeserialize3.date = queryFinalized2.intValue(2);
                                vf6Var4 = vf6Var7;
                                vf6Var5 = vf6Var8;
                                TLdeserialize3.dialog_id = queryFinalized2.longValue(3);
                                TLdeserialize3.random_id = queryFinalized2.longValue(4);
                                String stringValue = queryFinalized2.isNull(5) ? null : queryFinalized2.stringValue(5);
                                String stringValue2 = queryFinalized2.isNull(6) ? null : queryFinalized2.stringValue(6);
                                String stringValue3 = queryFinalized2.isNull(7) ? null : queryFinalized2.stringValue(7);
                                int intValue = queryFinalized2.intValue(8);
                                int intValue2 = queryFinalized2.intValue(9);
                                if (k27.a1(TLdeserialize3) == 0 && cf3.D(TLdeserialize3.dialog_id)) {
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    TLdeserialize3.from_id = tL_peerUser;
                                    arrayList6 = arrayList22;
                                    tL_peerUser.user_id = TLdeserialize3.dialog_id;
                                } else {
                                    arrayList6 = arrayList22;
                                }
                                boolean D = cf3.D(TLdeserialize3.dialog_id);
                                long j2 = TLdeserialize3.dialog_id;
                                if (D) {
                                    if (!arrayList11.contains(Long.valueOf(j2))) {
                                        arrayList11.add(Long.valueOf(TLdeserialize3.dialog_id));
                                    }
                                } else if (cf3.y(j2) && !arrayList12.contains(Long.valueOf(-TLdeserialize3.dialog_id))) {
                                    arrayList12.add(Long.valueOf(-TLdeserialize3.dialog_id));
                                }
                                if (intValue2 != 0) {
                                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                    TLdeserialize3.reply_to = tL_messageReplyHeader;
                                    tL_messageReplyHeader.forum_topic = true;
                                    tL_messageReplyHeader.reply_to_top_id = intValue2;
                                }
                                k27 k27Var = new k27(this.currentAccount, TLdeserialize3, stringValue, stringValue2, stringValue3, (intValue & 1) != 0, (intValue & 2) != 0, (TLdeserialize3.flags & TLObject.FLAG_31) != 0, false);
                                int intValue3 = queryFinalized2.intValue(10);
                                k27Var.I = intValue3 == 1;
                                k27Var.J = intValue3 == 2;
                                arrayList15.add(k27Var);
                                d(TLdeserialize3, arrayList11, arrayList12, null);
                            } else {
                                vf6Var4 = vf6Var7;
                                vf6Var5 = vf6Var8;
                                arrayList6 = arrayList22;
                            }
                            vf6Var7 = vf6Var4;
                            vf6Var8 = vf6Var5;
                            arrayList22 = arrayList6;
                            r9 = 0;
                        } catch (Exception e5) {
                            e = e5;
                            sQLiteCursor = queryFinalized2;
                            m(e);
                            if (sQLiteCursor == null) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            sQLiteCursor = queryFinalized2;
                            if (sQLiteCursor != null) {
                            }
                            throw th;
                        }
                    }
                    vf6 vf6Var10 = vf6Var7;
                    vf6 vf6Var11 = vf6Var8;
                    ArrayList arrayList23 = arrayList22;
                    sQLiteCursor = null;
                    queryFinalized2.dispose();
                    arrayList = arrayList19;
                    H0(vf6Var10, vf6Var11, arrayList11, arrayList12, 0);
                    if (arrayList23.isEmpty()) {
                        arrayList2 = arrayList20;
                    } else {
                        arrayList2 = arrayList20;
                        T(TextUtils.join(str2, arrayList23), arrayList2, arrayList11);
                    }
                    if (!arrayList11.isEmpty()) {
                        j0(arrayList11, arrayList16);
                    }
                    if (arrayList12.isEmpty()) {
                        arrayList3 = arrayList21;
                    } else {
                        arrayList3 = arrayList21;
                        P(TextUtils.join(str2, arrayList12), arrayList3);
                        int i4 = 0;
                        while (i4 < arrayList3.size()) {
                            TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i4);
                            if (chat != null) {
                                if (!hc2.r0(chat)) {
                                    if (!chat.min) {
                                    }
                                }
                                long j3 = -chat.id;
                                this.b.executeFast("UPDATE dialogs SET unread_count = 0 WHERE did = " + j3).stepThis().dispose();
                                SQLiteDatabase sQLiteDatabase2 = this.b;
                                Locale locale = Locale.US;
                                sQLiteDatabase2.executeFast("UPDATE messages_v2 SET read_state = 3 WHERE uid = " + j3 + " AND mid > 0 AND read_state IN(0,2) AND out = 0").stepThis().dispose();
                                arrayList3.remove(i4);
                                i4 += -1;
                                vf6Var3 = vf6Var9;
                                vf6Var3.l(j3);
                                for (int i5 = 0; i5 < arrayList.size(); i5 = i + 1) {
                                    int i6 = i5;
                                    if (((TLRPC.Message) arrayList.get(i5)).dialog_id == j3) {
                                        arrayList.remove(i6);
                                        i = i6 - 1;
                                    } else {
                                        i = i6;
                                    }
                                }
                                i4++;
                                vf6Var9 = vf6Var3;
                                sQLiteCursor = null;
                            }
                            vf6Var3 = vf6Var9;
                            i4++;
                            vf6Var9 = vf6Var3;
                            sQLiteCursor = null;
                        }
                    }
                    vf6Var = vf6Var9;
                } else {
                    arrayList = arrayList14;
                    vf6Var = vf6Var6;
                    arrayList2 = arrayList18;
                    str2 = ",";
                    arrayList3 = arrayList17;
                }
                Collections.reverse(arrayList);
                arrayList11.clear();
                arrayList12.clear();
                sQLiteCursor2 = this.b.queryFinalized("SELECT uid, sid, date, expire_date, localName, flags FROM story_pushes", new Object[0]);
                HashMap hashMap = new HashMap();
                while (sQLiteCursor2.next()) {
                    long longValue3 = sQLiteCursor2.longValue(0);
                    if (longValue3 >= 0) {
                        if (!arrayList11.contains(Long.valueOf(longValue3))) {
                            arrayList11.add(Long.valueOf(longValue3));
                        }
                    } else if (!arrayList12.contains(Long.valueOf(longValue3))) {
                        arrayList12.add(Long.valueOf(longValue3));
                    }
                    int intValue4 = sQLiteCursor2.intValue(1);
                    long longValue4 = sQLiteCursor2.longValue(2);
                    long longValue5 = sQLiteCursor2.longValue(3);
                    String stringValue4 = sQLiteCursor2.stringValue(4);
                    int intValue5 = sQLiteCursor2.intValue(5);
                    hm7 hm7Var = (hm7) hashMap.get(Long.valueOf(longValue3));
                    if (hm7Var != null) {
                        arrayList4 = arrayList2;
                        vf6Var2 = vf6Var;
                        arrayList5 = arrayList;
                        hm7Var.c.put(Integer.valueOf(intValue4), new Pair(Long.valueOf(longValue4), Long.valueOf(longValue5)));
                        hm7Var.e = hm7Var.a();
                        hm7Var.d |= (intValue5 & 1) != 0;
                        if (!TextUtils.isEmpty(stringValue4)) {
                            hm7Var.b = stringValue4;
                        }
                    } else {
                        arrayList4 = arrayList2;
                        vf6Var2 = vf6Var;
                        arrayList5 = arrayList;
                        hm7 hm7Var2 = new hm7(stringValue4, longValue3, intValue4, longValue4, longValue5);
                        hm7Var2.d = (intValue5 & 1) != 0;
                        hashMap.put(Long.valueOf(longValue3), hm7Var2);
                    }
                    arrayList2 = arrayList4;
                    vf6Var = vf6Var2;
                    arrayList = arrayList5;
                }
                ArrayList arrayList24 = arrayList2;
                vf6 vf6Var12 = vf6Var;
                ArrayList arrayList25 = arrayList;
                sQLiteCursor2.dispose();
                if (!arrayList11.isEmpty()) {
                    j0(arrayList11, arrayList16);
                }
                if (!arrayList12.isEmpty()) {
                    P(TextUtils.join(str2, arrayList12), arrayList3);
                }
                gl.c3(new ln0((Object) this, (Object) vf6Var12, (Object) arrayList25, (Object) arrayList15, (Object) arrayList16, (Object) arrayList3, (Object) arrayList24, (Object) hashMap, (byte) 7));
            } catch (Exception e6) {
                e = e6;
                sQLiteCursor = queryFinalized;
            } catch (Throwable th4) {
                th = th4;
                sQLiteCursor = queryFinalized;
            }
        } catch (Exception e7) {
            e = e7;
            sQLiteCursor = null;
        } catch (Throwable th5) {
            th = th5;
            sQLiteCursor = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A1(long j, List list, boolean z, boolean z2, int i) {
        ad7 ad7Var;
        boolean z3;
        boolean z4;
        HashSet hashSet;
        HashMap hashMap;
        boolean z5;
        int i2;
        int i3;
        SQLitePreparedStatement sQLitePreparedStatement;
        NativeByteBuffer nativeByteBuffer;
        NativeByteBuffer nativeByteBuffer2;
        int i4;
        int i5;
        ad7 ad7Var2 = this;
        long j2 = j;
        boolean z6 = true;
        z6 = true;
        z6 = true;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        sQLitePreparedStatement2 = null;
        sQLitePreparedStatement2 = null;
        try {
            try {
                hashSet = new HashSet();
                hashMap = new HashMap();
                z5 = false;
                i2 = 0;
            } catch (Throwable th) {
                th = th;
                ad7Var = ad7Var2;
            }
        } catch (Exception e) {
            e = e;
            ad7Var = ad7Var2;
            z3 = z6;
        }
        while (true) {
            i3 = 2;
            if (i2 >= list.size()) {
                break;
            }
            try {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) list.get(i2);
                SQLiteCursor queryFinalized = ad7Var2.b.queryFinalized("SELECT did, pinned FROM topics WHERE did = " + j2 + " AND topic_id = " + tL_forumTopic.id, new Object[0]);
                boolean next = queryFinalized.next();
                if (next) {
                    hashMap.put(Integer.valueOf(i2), Integer.valueOf(queryFinalized.intValue(2)));
                }
                queryFinalized.dispose();
                if (next) {
                    hashSet.add(Integer.valueOf(i2));
                }
                i2++;
            } catch (Exception e2) {
                e = e2;
                ad7Var = ad7Var2;
                z4 = z6;
            }
            e = e2;
            ad7Var = ad7Var2;
            z4 = z6;
            try {
                ad7Var.n(e, z4);
                if (sQLitePreparedStatement2 != null) {
                    sQLitePreparedStatement2.dispose();
                }
                ad7Var.b.commitTransaction();
            } catch (Throwable th2) {
                th = th2;
                if (sQLitePreparedStatement2 != null) {
                    sQLitePreparedStatement2.dispose();
                }
                ad7Var.b.commitTransaction();
                throw th;
            }
        }
        if (z) {
            ad7Var2.b.executeFast("DELETE FROM topics WHERE did = " + j2).stepThis().dispose();
        }
        sQLitePreparedStatement2 = ad7Var2.b.executeFast("REPLACE INTO topics VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        if (z2) {
            ad7Var2.b.beginTransaction();
        }
        int i6 = 0;
        while (i6 < list.size()) {
            TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) list.get(i6);
            long n = ad7Var2.r0(4, j2) ? cf3.n(tL_forumTopic2.from_id) : tL_forumTopic2.id;
            boolean contains = hashSet.contains(Integer.valueOf(i6));
            sQLitePreparedStatement2.requery();
            sQLitePreparedStatement2.bindLong(z6 ? 1 : 0, j2);
            sQLitePreparedStatement2.bindLong(i3, n);
            z3 = z6 ? 1 : 0;
            try {
                nativeByteBuffer = new NativeByteBuffer(tL_forumTopic2.getObjectSize());
                tL_forumTopic2.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatement2.bindByteBuffer(3, nativeByteBuffer);
                sQLitePreparedStatement2.bindInteger(4, tL_forumTopic2.top_message);
                nativeByteBuffer2 = new NativeByteBuffer(tL_forumTopic2.topicStartMessage.getObjectSize());
                tL_forumTopic2.topicStartMessage.serializeToStream(nativeByteBuffer2);
                sQLitePreparedStatement2.bindByteBuffer(5, nativeByteBuffer2);
                i4 = i6;
                sQLitePreparedStatement2.bindInteger(6, tL_forumTopic2.unread_count);
                sQLitePreparedStatement2.bindInteger(7, tL_forumTopic2.read_inbox_max_id);
                sQLitePreparedStatement2.bindInteger(8, tL_forumTopic2.unread_mentions_count);
                sQLitePreparedStatement2.bindInteger(9, tL_forumTopic2.unread_reactions_count);
                sQLitePreparedStatement2.bindInteger(10, tL_forumTopic2.read_outbox_max_id);
                if (tL_forumTopic2.isShort && hashMap.containsKey(Integer.valueOf(i4))) {
                    sQLitePreparedStatement2.bindInteger(11, ((Integer) hashMap.get(Integer.valueOf(i4))).intValue());
                } else {
                    sQLitePreparedStatement2.bindInteger(11, tL_forumTopic2.pinned ? tL_forumTopic2.pinnedOrder + 1 : 0);
                }
                sQLitePreparedStatement2.bindInteger(12, tL_forumTopic2.totalMessagesCount);
                sQLitePreparedStatement2.bindInteger(13, tL_forumTopic2.hidden ? 1 : 0);
                sQLitePreparedStatement2.bindInteger(14, i);
            } catch (Exception e3) {
                e = e3;
                ad7Var = ad7Var2;
            }
            try {
                sQLitePreparedStatement2.bindInteger(15, tL_forumTopic2.nopaid_messages_exception ? 1 : 0);
                sQLitePreparedStatement2.bindInteger(16, tL_forumTopic2.unread_poll_votes_count);
                sQLitePreparedStatement2.step();
                nativeByteBuffer2.reuse();
                nativeByteBuffer.reuse();
                if (contains) {
                    long j3 = n;
                    int i7 = tL_forumTopic2.top_message;
                    sQLitePreparedStatement = sQLitePreparedStatement2;
                    try {
                        t(i7, i7, j, j3, "messages_holes_topics");
                    } catch (Exception e4) {
                        e = e4;
                        ad7Var = this;
                    } catch (Throwable th3) {
                        th = th3;
                        ad7Var = this;
                    }
                    try {
                        int i8 = tL_forumTopic2.top_message;
                        s(j, i8, i8, -1, 0L);
                        ad7Var = this;
                        i5 = i4;
                    } catch (Exception e5) {
                        e = e5;
                        ad7Var = this;
                        sQLitePreparedStatement2 = sQLitePreparedStatement;
                        z4 = z3;
                        ad7Var.n(e, z4);
                        if (sQLitePreparedStatement2 != null) {
                        }
                        ad7Var.b.commitTransaction();
                    } catch (Throwable th4) {
                        th = th4;
                        ad7Var = this;
                        sQLitePreparedStatement2 = sQLitePreparedStatement;
                        if (sQLitePreparedStatement2 != null) {
                        }
                        ad7Var.b.commitTransaction();
                        throw th;
                    }
                } else {
                    sQLitePreparedStatement = sQLitePreparedStatement2;
                    long j4 = n;
                    ad7Var = this;
                    try {
                        SQLiteDatabase sQLiteDatabase = ad7Var.b;
                        Locale locale = Locale.ENGLISH;
                        sQLiteDatabase.executeFast("DELETE FROM messages_holes_topics WHERE uid = " + j2 + " AND topic_id = " + j4).stepThis().dispose();
                        ad7Var.b.executeFast("DELETE FROM media_holes_topics WHERE uid = " + j2 + " AND topic_id = " + j4).stepThis().dispose();
                        ad7Var.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j2 + " AND topic_id = " + j4).stepThis().dispose();
                        ad7Var.b.executeFast("DELETE FROM media_topics WHERE uid = " + j2 + " AND topic_id = " + j4).stepThis().dispose();
                        SQLitePreparedStatement executeFast = ad7Var.b.executeFast("REPLACE INTO messages_holes_topics VALUES(?, ?, ?, ?)");
                        i5 = i4;
                        v(j2, executeFast, ad7Var.b.executeFast("REPLACE INTO media_holes_topics VALUES(?, ?, ?, ?, ?)"), tL_forumTopic2.top_message, j4);
                        executeFast.dispose();
                        executeFast.dispose();
                    } catch (Exception e6) {
                        e = e6;
                        sQLitePreparedStatement2 = sQLitePreparedStatement;
                        z4 = z3;
                        ad7Var.n(e, z4);
                        if (sQLitePreparedStatement2 != null) {
                        }
                        ad7Var.b.commitTransaction();
                    } catch (Throwable th5) {
                        th = th5;
                        sQLitePreparedStatement2 = sQLitePreparedStatement;
                        if (sQLitePreparedStatement2 != null) {
                        }
                        ad7Var.b.commitTransaction();
                        throw th;
                    }
                }
                i6 = i5 + 1;
                j2 = j;
                ad7Var2 = ad7Var;
                sQLitePreparedStatement2 = sQLitePreparedStatement;
                z6 = z3;
                z5 = false;
                i3 = 2;
            } catch (Exception e7) {
                e = e7;
                ad7Var = this;
                z4 = z3;
                ad7Var.n(e, z4);
                if (sQLitePreparedStatement2 != null) {
                }
                ad7Var.b.commitTransaction();
            } catch (Throwable th6) {
                th = th6;
                ad7Var = this;
                if (sQLitePreparedStatement2 != null) {
                }
                ad7Var.b.commitTransaction();
                throw th;
            }
        }
        ad7Var = ad7Var2;
        z3 = z6 ? 1 : 0;
        boolean z7 = z5;
        sQLitePreparedStatement = sQLitePreparedStatement2;
        ad7Var.q1(z7);
        if (sQLitePreparedStatement != null) {
            sQLitePreparedStatement.dispose();
        }
        ad7Var.b.commitTransaction();
    }

    public final void B(t97 t97Var) {
        try {
            this.I.remove(t97Var);
            this.J.remove(t97Var.a);
            this.b.executeFast("DELETE FROM dialog_filter WHERE id = " + t97Var.a).stepThis().dispose();
            this.b.executeFast("DELETE FROM dialog_filter_ep WHERE id = " + t97Var.a).stepThis().dispose();
            this.b.executeFast("DELETE FROM dialog_filter_pin_v2 WHERE id = " + t97Var.a).stepThis().dispose();
        } catch (Exception e) {
            n(e, true);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void B0(int r49, int r50, int r51, long r52, long r54, org.telegram.tgnet.TLRPC.messages_Messages r56, boolean r57) {
        /*
            Method dump skipped, instructions count: 3830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad7.B0(int, int, int, long, long, org.telegram.tgnet.TLRPC$messages_Messages, boolean):void");
    }

    public final void B1(long j, long j2) {
        this.a.c(new sa7(this, j, j2, (byte) 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(ArrayList arrayList, boolean z) {
        Throwable th;
        SQLiteDatabase sQLiteDatabase;
        Exception e;
        SQLiteDatabase sQLiteDatabase2;
        SQLiteDatabase sQLiteDatabase3;
        if (arrayList.isEmpty()) {
            return;
        }
        SQLitePreparedStatement sQLitePreparedStatement = null;
        if (z) {
            try {
                try {
                    this.b.beginTransaction();
                } catch (Exception e2) {
                    e = e2;
                    n(e, true);
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    if (z || (sQLiteDatabase2 = this.b) == null) {
                    }
                    sQLiteDatabase2.commitTransaction();
                    return;
                }
            } catch (Throwable th2) {
                th = th2;
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
                if (z && (sQLiteDatabase = this.b) != null) {
                    sQLiteDatabase.commitTransaction();
                }
                throw th;
            }
        }
        SQLitePreparedStatement executeFast = this.b.executeFast("DELETE FROM download_queue WHERE uid = ? AND type = ?");
        try {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Pair pair = (Pair) arrayList.get(i);
                executeFast.requery();
                executeFast.bindLong(1, ((Long) pair.first).longValue());
                executeFast.bindInteger(2, ((Integer) pair.second).intValue());
                executeFast.step();
            }
            executeFast.dispose();
            if (z) {
                this.b.commitTransaction();
            }
            gl.c3(new i41(this, arrayList, (byte) 14));
            if (!z || (sQLiteDatabase3 = this.b) == null) {
                return;
            }
            sQLiteDatabase3.commitTransaction();
        } catch (Exception e3) {
            e = e3;
            sQLitePreparedStatement = executeFast;
            n(e, true);
            if (sQLitePreparedStatement != null) {
            }
            if (z) {
            }
        } catch (Throwable th3) {
            th = th3;
            sQLitePreparedStatement = executeFast;
            if (sQLitePreparedStatement != null) {
            }
            if (z) {
                sQLiteDatabase.commitTransaction();
            }
            throw th;
        }
    }

    public final TLRPC.ChatFull C0(final long j, final boolean z, final CountDownLatch countDownLatch, final boolean z2, final boolean z3, final int i) {
        final TLRPC.ChatFull[] chatFullArr = new TLRPC.ChatFull[1];
        this.a.c(new Runnable(chatFullArr, j, z, z2, z3, i, countDownLatch) { // from class: hc7
            public final /* synthetic */ TLRPC.ChatFull[] b;
            public final /* synthetic */ long c;
            public final /* synthetic */ boolean d;
            public final /* synthetic */ boolean e;
            public final /* synthetic */ boolean f;
            public final /* synthetic */ CountDownLatch h;

            {
                this.h = countDownLatch;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.b[0] = ad7.this.D0(this.c, this.d, this.e, this.f);
                CountDownLatch countDownLatch2 = this.h;
                if (countDownLatch2 != null) {
                    countDownLatch2.countDown();
                }
            }
        });
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (Throwable unused) {
            }
        }
        return chatFullArr[0];
    }

    public final void C1(long j, boolean z) {
        this.a.c(new ab7(this, j, z, (byte) 0));
    }

    public final void D(ArrayList arrayList, long j) {
        try {
            SQLiteDatabase sQLiteDatabase = this.b;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM unread_push_messages WHERE uid = " + j + " AND mid IN(" + TextUtils.join(",", arrayList) + ")").stepThis().dispose();
        } catch (Exception e) {
            n(e, true);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:130|(3:147|148|(6:150|95|(8:97|98|99|(1:101)|102|103|104|(3:106|(2:108|109)|111))(1:125)|112|54|55))(1:132)|133|134|135|136|95|(0)(0)|112|54|55) */
    /* JADX WARN: Can't wrap try/catch for region: R(39:0|1|(5:2|3|4|5|6)|(3:322|323|(40:325|327|328|329|330|331|332|9|10|12|13|14|(3:16|(3:18|(3:20|(2:22|23)(2:25|26)|24)|27)|28)(3:205|206|(3:208|(3:211|212|209)|213)(2:214|(42:216|217|218|219|220|221|222|223|224|225|(12:228|229|(2:268|269)(1:231)|232|(1:234)(1:267)|(3:236|237|(3:239|(2:263|264)(6:242|(1:244)|245|246|247|249)|250))(1:266)|265|(0)|263|264|250|226)|276|277|278|(3:282|279|280)|283|(2:31|(1:33))|(3:39|(3:42|43|40)|44)|67|68|69|70|71|72|73|(5:190|191|192|74|75)|77|78|79|80|81|82|(6:84|85|86|87|(1:89)(1:164)|90)(1:175)|91|92|(3:127|128|(11:130|(3:147|148|(6:150|95|(8:97|98|99|(1:101)|102|103|104|(3:106|(2:108|109)|111))(1:125)|112|54|55))(1:132)|133|134|135|136|95|(0)(0)|112|54|55))|94|95|(0)(0)|112|54|55)))|29|(0)|(5:35|37|39|(1:40)|44)|67|68|69|70|71|72|73|(2:74|75)|77|78|79|80|81|82|(0)(0)|91|92|(0)|94|95|(0)(0)|112|54|55))|8|9|10|12|13|14|(0)(0)|29|(0)|(0)|67|68|69|70|71|72|73|(2:74|75)|77|78|79|80|81|82|(0)(0)|91|92|(0)|94|95|(0)(0)|112|54|55|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(3:(3:190|191|192)|74|75) */
    /* JADX WARN: Can't wrap try/catch for region: R(43:0|1|2|3|4|5|6|(3:322|323|(40:325|327|328|329|330|331|332|9|10|12|13|14|(3:16|(3:18|(3:20|(2:22|23)(2:25|26)|24)|27)|28)(3:205|206|(3:208|(3:211|212|209)|213)(2:214|(42:216|217|218|219|220|221|222|223|224|225|(12:228|229|(2:268|269)(1:231)|232|(1:234)(1:267)|(3:236|237|(3:239|(2:263|264)(6:242|(1:244)|245|246|247|249)|250))(1:266)|265|(0)|263|264|250|226)|276|277|278|(3:282|279|280)|283|(2:31|(1:33))|(3:39|(3:42|43|40)|44)|67|68|69|70|71|72|73|(5:190|191|192|74|75)|77|78|79|80|81|82|(6:84|85|86|87|(1:89)(1:164)|90)(1:175)|91|92|(3:127|128|(11:130|(3:147|148|(6:150|95|(8:97|98|99|(1:101)|102|103|104|(3:106|(2:108|109)|111))(1:125)|112|54|55))(1:132)|133|134|135|136|95|(0)(0)|112|54|55))|94|95|(0)(0)|112|54|55)))|29|(0)|(5:35|37|39|(1:40)|44)|67|68|69|70|71|72|73|(2:74|75)|77|78|79|80|81|82|(0)(0)|91|92|(0)|94|95|(0)(0)|112|54|55))|8|9|10|12|13|14|(0)(0)|29|(0)|(0)|67|68|69|70|71|72|73|(2:74|75)|77|78|79|80|81|82|(0)(0)|91|92|(0)|94|95|(0)(0)|112|54|55|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03ba, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03bb, code lost:
    
        r19 = r6;
        r12 = r7;
        r16 = r9;
        r18 = r11;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03af, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03b0, code lost:
    
        r13 = r0;
        r19 = r6;
        r12 = r7;
        r16 = r9;
        r18 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0447, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0448, code lost:
    
        r12 = r7;
        r16 = r9;
        r18 = r11;
        r11 = r5;
        r19 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x043b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x043c, code lost:
    
        r12 = r7;
        r16 = r9;
        r18 = r11;
        r11 = r5;
        r13 = r0;
        r19 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x045e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x045f, code lost:
    
        r16 = r9;
        r18 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0463, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0464, code lost:
    
        r19 = r6;
        r11 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0467, code lost:
    
        r12 = r11 == true ? 1 : 0;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0451, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0452, code lost:
    
        r16 = r9;
        r18 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0456, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0457, code lost:
    
        r13 = r0;
        r19 = r6;
        r11 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x045b, code lost:
    
        r12 = r11 == true ? 1 : 0;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0470, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0471, code lost:
    
        r16 = r9;
        r18 = r11;
        r9 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0469, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x046a, code lost:
    
        r16 = r9;
        r18 = r11;
        r9 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x047e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x047f, code lost:
    
        r16 = r9;
        r18 = r11;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0477, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0478, code lost:
    
        r16 = r9;
        r18 = r11;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x048d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x048e, code lost:
    
        r16 = r9;
        r18 = r11;
        r9 = r15;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0485, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0486, code lost:
    
        r16 = r9;
        r18 = r11;
        r9 = r15;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0119, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x011a, code lost:
    
        r7 = true;
        r19 = r6;
        r16 = r9;
        r12 = false;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x010f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0110, code lost:
    
        r13 = r0;
        r19 = r6;
        r16 = r9;
        r12 = false;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x049d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x049e, code lost:
    
        r16 = r9;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x04a1, code lost:
    
        r19 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0495, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0496, code lost:
    
        r16 = r9;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0499, code lost:
    
        r13 = r0;
        r19 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x04a8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x04a9, code lost:
    
        r16 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x04a4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x04a5, code lost:
    
        r16 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0366 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0 A[Catch: all -> 0x010f, Exception -> 0x0119, TRY_ENTER, TryCatch #34 {Exception -> 0x0119, all -> 0x010f, blocks: (B:16:0x00b0, B:18:0x00b4, B:20:0x00bb, B:22:0x00cf, B:25:0x00d7, B:209:0x00ef, B:211:0x00f9), top: B:14:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x025b A[Catch: all -> 0x0299, Exception -> 0x02a2, TryCatch #33 {Exception -> 0x02a2, all -> 0x0299, blocks: (B:31:0x025b, B:33:0x0261, B:35:0x026a, B:37:0x026e, B:40:0x0275, B:42:0x0282, B:280:0x01f1, B:282:0x01f9), top: B:279:0x01f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x026a A[Catch: all -> 0x0299, Exception -> 0x02a2, TryCatch #33 {Exception -> 0x02a2, all -> 0x0299, blocks: (B:31:0x025b, B:33:0x0261, B:35:0x026a, B:37:0x026e, B:40:0x0275, B:42:0x0282, B:280:0x01f1, B:282:0x01f9), top: B:279:0x01f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0282 A[Catch: all -> 0x0299, Exception -> 0x02a2, TRY_LEAVE, TryCatch #33 {Exception -> 0x02a2, all -> 0x0299, blocks: (B:31:0x025b, B:33:0x0261, B:35:0x026a, B:37:0x026e, B:40:0x0275, B:42:0x0282, B:280:0x01f1, B:282:0x01f9), top: B:279:0x01f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x031b A[Catch: all -> 0x0345, Exception -> 0x0352, TRY_ENTER, TRY_LEAVE, TryCatch #40 {Exception -> 0x0352, all -> 0x0345, blocks: (B:191:0x02e3, B:84:0x031b), top: B:190:0x02e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TLRPC.ChatFull D0(final long j, boolean z, final boolean z2, final boolean z3) {
        ArrayList arrayList;
        ArrayList arrayList2;
        TLRPC.ChatFull chatFull;
        Throwable th;
        final boolean z4;
        SQLiteCursor sQLiteCursor;
        boolean z5;
        final TLRPC.ChatFull chatFull2;
        Runnable runnable;
        SQLiteCursor queryFinalized;
        int i;
        NativeByteBuffer byteBufferValue;
        int i2;
        int i3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        long j2;
        int i4;
        ArrayList arrayList5;
        TLRPC.User TLdeserialize;
        TLRPC.ChannelParticipant channelParticipant;
        TLRPC.User user;
        TLRPC.User user2;
        long j3;
        int i5;
        boolean z6;
        int i6;
        ArrayList<Long> arrayList6;
        int i7;
        ArrayList arrayList7 = new ArrayList();
        final ArrayList arrayList8 = new ArrayList();
        final HashMap hashMap = new HashMap();
        ArrayList arrayList9 = new ArrayList();
        final int i8 = 0;
        boolean z7 = 0;
        r11 = 0;
        i8 = 0;
        int i9 = 0;
        int i10 = 0;
        r11 = 0;
        i8 = 0;
        r11 = 0;
        i8 = 0;
        i8 = 0;
        int i11 = 0;
        try {
            queryFinalized = this.b.queryFinalized("SELECT info, pinned, online, inviter, links FROM chat_settings_v2 WHERE uid = " + j, new Object[0]);
            try {
                i = 2;
            } catch (Exception e) {
                e = e;
                arrayList = arrayList7;
                arrayList2 = arrayList9;
                chatFull = null;
                sQLiteCursor = queryFinalized;
                z4 = false;
                z5 = true;
                try {
                    n(e, z5);
                    if (sQLiteCursor != null) {
                    }
                    final na7 messagesController = getMessagesController();
                    messagesController.getClass();
                    final ArrayList arrayList10 = arrayList2;
                    final ArrayList arrayList11 = arrayList;
                    chatFull2 = chatFull;
                    final int i12 = i11 == true ? 1 : 0;
                    runnable = new Runnable() { // from class: i77
                        @Override // java.lang.Runnable
                        public final void run() {
                            na7 na7Var = na7.this;
                            vf6 vf6Var = na7Var.c1;
                            long j4 = j;
                            boolean z8 = z3;
                            if (j4 > 0 && !z8 && System.currentTimeMillis() - na7Var.p1.get(j4, 0L) > 60000) {
                                na7Var.Y2(0, j4, z2);
                            }
                            TLRPC.ChatFull chatFull3 = chatFull2;
                            if (chatFull3 != null) {
                                if (vf6Var.f(j4) == null) {
                                    vf6Var.k(chatFull3, j4);
                                    na7Var.i4.M(-j4);
                                }
                                na7Var.b4(arrayList11, true);
                                na7Var.V3(arrayList8, true);
                                if (chatFull3.stickerset != null) {
                                    na7Var.getMediaDataController().a0(chatFull3.stickerset);
                                }
                                if (chatFull3.emojiset != null) {
                                    na7Var.getMediaDataController().a0(chatFull3.emojiset);
                                }
                                na7Var.getNotificationCenter().k(kk7.S, chatFull3, 0, Boolean.valueOf(z8), Boolean.FALSE);
                            }
                            na7Var.getNotificationCenter().k(kk7.E0, Long.valueOf(-j4), arrayList10, hashMap, Integer.valueOf(i12), Boolean.valueOf(z4));
                        }
                    };
                    gl.c3(runnable);
                    return chatFull2;
                } catch (Throwable th2) {
                    th = th2;
                    i8 = i11;
                    if (sQLiteCursor != null) {
                    }
                    final na7 messagesController2 = getMessagesController();
                    messagesController2.getClass();
                    final ArrayList arrayList12 = arrayList2;
                    final ArrayList arrayList13 = arrayList;
                    final TLRPC.ChatFull chatFull3 = chatFull;
                    gl.c3(new Runnable() { // from class: i77
                        @Override // java.lang.Runnable
                        public final void run() {
                            na7 na7Var = na7.this;
                            vf6 vf6Var = na7Var.c1;
                            long j4 = j;
                            boolean z8 = z3;
                            if (j4 > 0 && !z8 && System.currentTimeMillis() - na7Var.p1.get(j4, 0L) > 60000) {
                                na7Var.Y2(0, j4, z2);
                            }
                            TLRPC.ChatFull chatFull32 = chatFull3;
                            if (chatFull32 != null) {
                                if (vf6Var.f(j4) == null) {
                                    vf6Var.k(chatFull32, j4);
                                    na7Var.i4.M(-j4);
                                }
                                na7Var.b4(arrayList13, true);
                                na7Var.V3(arrayList8, true);
                                if (chatFull32.stickerset != null) {
                                    na7Var.getMediaDataController().a0(chatFull32.stickerset);
                                }
                                if (chatFull32.emojiset != null) {
                                    na7Var.getMediaDataController().a0(chatFull32.emojiset);
                                }
                                na7Var.getNotificationCenter().k(kk7.S, chatFull32, 0, Boolean.valueOf(z8), Boolean.FALSE);
                            }
                            na7Var.getNotificationCenter().k(kk7.E0, Long.valueOf(-j4), arrayList12, hashMap, Integer.valueOf(i8), Boolean.valueOf(z4));
                        }
                    });
                    throw th;
                }
            } catch (Throwable th3) {
                arrayList = arrayList7;
                arrayList2 = arrayList9;
                chatFull = null;
                th = th3;
                sQLiteCursor = queryFinalized;
                z4 = false;
            }
        } catch (Exception e2) {
            e = e2;
            arrayList = arrayList7;
            arrayList2 = arrayList9;
            chatFull = null;
            z4 = false;
            sQLiteCursor = null;
        } catch (Throwable th4) {
            arrayList = arrayList7;
            arrayList2 = arrayList9;
            chatFull = null;
            th = th4;
            z4 = false;
            sQLiteCursor = null;
        }
        if (queryFinalized.next()) {
            try {
                byteBufferValue = queryFinalized.byteBufferValue(0);
            } catch (Exception e3) {
                e = e3;
                arrayList = arrayList7;
                sQLiteCursor = queryFinalized;
                z5 = true;
                arrayList2 = arrayList9;
                z4 = false;
                chatFull = null;
            } catch (Throwable th5) {
                arrayList = arrayList7;
                th = th5;
                sQLiteCursor = queryFinalized;
                arrayList2 = arrayList9;
                z4 = false;
                chatFull = null;
            }
            if (byteBufferValue != null) {
                TLRPC.ChatFull TLdeserialize2 = TLRPC.ChatFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                try {
                    byteBufferValue.reuse();
                    TLdeserialize2.pinned_msg_id = queryFinalized.intValue(1);
                    TLdeserialize2.online_count = queryFinalized.intValue(2);
                    arrayList = arrayList7;
                    try {
                        TLdeserialize2.inviterId = queryFinalized.longValue(3);
                        TLdeserialize2.invitesCount = queryFinalized.intValue(4);
                        chatFull2 = TLdeserialize2;
                        queryFinalized.dispose();
                        arrayList3 = new ArrayList();
                        arrayList4 = new ArrayList();
                    } catch (Exception e4) {
                        e = e4;
                        sQLiteCursor = queryFinalized;
                        z5 = true;
                        arrayList2 = arrayList9;
                        z4 = false;
                        chatFull = TLdeserialize2;
                        n(e, z5);
                        if (sQLiteCursor != null) {
                        }
                        final na7 messagesController3 = getMessagesController();
                        messagesController3.getClass();
                        final ArrayList arrayList102 = arrayList2;
                        final ArrayList arrayList112 = arrayList;
                        chatFull2 = chatFull;
                        final int i122 = i11 == true ? 1 : 0;
                        runnable = new Runnable() { // from class: i77
                            @Override // java.lang.Runnable
                            public final void run() {
                                na7 na7Var = na7.this;
                                vf6 vf6Var = na7Var.c1;
                                long j4 = j;
                                boolean z8 = z3;
                                if (j4 > 0 && !z8 && System.currentTimeMillis() - na7Var.p1.get(j4, 0L) > 60000) {
                                    na7Var.Y2(0, j4, z2);
                                }
                                TLRPC.ChatFull chatFull32 = chatFull2;
                                if (chatFull32 != null) {
                                    if (vf6Var.f(j4) == null) {
                                        vf6Var.k(chatFull32, j4);
                                        na7Var.i4.M(-j4);
                                    }
                                    na7Var.b4(arrayList112, true);
                                    na7Var.V3(arrayList8, true);
                                    if (chatFull32.stickerset != null) {
                                        na7Var.getMediaDataController().a0(chatFull32.stickerset);
                                    }
                                    if (chatFull32.emojiset != null) {
                                        na7Var.getMediaDataController().a0(chatFull32.emojiset);
                                    }
                                    na7Var.getNotificationCenter().k(kk7.S, chatFull32, 0, Boolean.valueOf(z8), Boolean.FALSE);
                                }
                                na7Var.getNotificationCenter().k(kk7.E0, Long.valueOf(-j4), arrayList102, hashMap, Integer.valueOf(i122), Boolean.valueOf(z4));
                            }
                        };
                        gl.c3(runnable);
                        return chatFull2;
                    } catch (Throwable th6) {
                        th = th6;
                        th = th;
                        sQLiteCursor = queryFinalized;
                        arrayList2 = arrayList9;
                        z4 = false;
                        chatFull = TLdeserialize2;
                        if (sQLiteCursor != null) {
                        }
                        final na7 messagesController22 = getMessagesController();
                        messagesController22.getClass();
                        final ArrayList arrayList122 = arrayList2;
                        final ArrayList arrayList132 = arrayList;
                        final TLRPC.ChatFull chatFull32 = chatFull;
                        gl.c3(new Runnable() { // from class: i77
                            @Override // java.lang.Runnable
                            public final void run() {
                                na7 na7Var = na7.this;
                                vf6 vf6Var = na7Var.c1;
                                long j4 = j;
                                boolean z8 = z3;
                                if (j4 > 0 && !z8 && System.currentTimeMillis() - na7Var.p1.get(j4, 0L) > 60000) {
                                    na7Var.Y2(0, j4, z2);
                                }
                                TLRPC.ChatFull chatFull322 = chatFull32;
                                if (chatFull322 != null) {
                                    if (vf6Var.f(j4) == null) {
                                        vf6Var.k(chatFull322, j4);
                                        na7Var.i4.M(-j4);
                                    }
                                    na7Var.b4(arrayList132, true);
                                    na7Var.V3(arrayList8, true);
                                    if (chatFull322.stickerset != null) {
                                        na7Var.getMediaDataController().a0(chatFull322.stickerset);
                                    }
                                    if (chatFull322.emojiset != null) {
                                        na7Var.getMediaDataController().a0(chatFull322.emojiset);
                                    }
                                    na7Var.getNotificationCenter().k(kk7.S, chatFull322, 0, Boolean.valueOf(z8), Boolean.FALSE);
                                }
                                na7Var.getNotificationCenter().k(kk7.E0, Long.valueOf(-j4), arrayList122, hashMap, Integer.valueOf(i8), Boolean.valueOf(z4));
                            }
                        });
                        throw th;
                    }
                } catch (Exception e5) {
                    e = e5;
                    arrayList = arrayList7;
                } catch (Throwable th7) {
                    th = th7;
                    arrayList = arrayList7;
                }
                if (chatFull2 instanceof TLRPC.TL_communityFull) {
                    j2 = 0;
                    if (chatFull2 instanceof TLRPC.TL_chatFull) {
                        for (int i13 = 0; i13 < chatFull2.participants.participants.size(); i13++) {
                            arrayList3.add(Long.valueOf(chatFull2.participants.participants.get(i13).user_id));
                        }
                    } else if (chatFull2 instanceof TLRPC.TL_channelFull) {
                        try {
                            SQLiteDatabase sQLiteDatabase = this.b;
                            StringBuilder sb = new StringBuilder("SELECT us.data, us.status, cu.data, cu.date FROM channel_users_v2 as cu LEFT JOIN users as us ON us.uid = cu.uid WHERE cu.did = ");
                            TLRPC.ChatFull chatFull4 = chatFull2;
                            try {
                                sb.append(-j);
                                sb.append(" ORDER BY cu.date DESC");
                                SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized(sb.toString(), new Object[0]);
                                try {
                                    chatFull2 = chatFull4;
                                    try {
                                        try {
                                            chatFull2.participants = new TLRPC.TL_chatParticipants();
                                            while (queryFinalized2.next()) {
                                                try {
                                                    NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(z7 ? 1 : 0);
                                                    if (byteBufferValue2 != null) {
                                                        try {
                                                            TLdeserialize = TLRPC.User.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(z7), z7);
                                                            byteBufferValue2.reuse();
                                                        } catch (Throwable th8) {
                                                            th = th8;
                                                            chatFull = chatFull2;
                                                            arrayList2 = arrayList9;
                                                            z4 = z7 ? 1 : 0;
                                                            i4 = z7;
                                                            sQLiteCursor = queryFinalized2;
                                                            i8 = i4;
                                                            if (sQLiteCursor != null) {
                                                            }
                                                            final na7 messagesController222 = getMessagesController();
                                                            messagesController222.getClass();
                                                            final ArrayList arrayList1222 = arrayList2;
                                                            final ArrayList arrayList1322 = arrayList;
                                                            final TLRPC.ChatFull chatFull322 = chatFull;
                                                            gl.c3(new Runnable() { // from class: i77
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    na7 na7Var = na7.this;
                                                                    vf6 vf6Var = na7Var.c1;
                                                                    long j4 = j;
                                                                    boolean z8 = z3;
                                                                    if (j4 > 0 && !z8 && System.currentTimeMillis() - na7Var.p1.get(j4, 0L) > 60000) {
                                                                        na7Var.Y2(0, j4, z2);
                                                                    }
                                                                    TLRPC.ChatFull chatFull3222 = chatFull322;
                                                                    if (chatFull3222 != null) {
                                                                        if (vf6Var.f(j4) == null) {
                                                                            vf6Var.k(chatFull3222, j4);
                                                                            na7Var.i4.M(-j4);
                                                                        }
                                                                        na7Var.b4(arrayList1322, true);
                                                                        na7Var.V3(arrayList8, true);
                                                                        if (chatFull3222.stickerset != null) {
                                                                            na7Var.getMediaDataController().a0(chatFull3222.stickerset);
                                                                        }
                                                                        if (chatFull3222.emojiset != null) {
                                                                            na7Var.getMediaDataController().a0(chatFull3222.emojiset);
                                                                        }
                                                                        na7Var.getNotificationCenter().k(kk7.S, chatFull3222, 0, Boolean.valueOf(z8), Boolean.FALSE);
                                                                    }
                                                                    na7Var.getNotificationCenter().k(kk7.E0, Long.valueOf(-j4), arrayList1222, hashMap, Integer.valueOf(i8), Boolean.valueOf(z4));
                                                                }
                                                            });
                                                            throw th;
                                                        }
                                                    } else {
                                                        TLdeserialize = null;
                                                    }
                                                    NativeByteBuffer byteBufferValue3 = queryFinalized2.byteBufferValue(i);
                                                    if (byteBufferValue3 != null) {
                                                        channelParticipant = TLRPC.ChannelParticipant.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(z7), z7);
                                                        byteBufferValue3.reuse();
                                                    } else {
                                                        channelParticipant = null;
                                                    }
                                                } catch (Exception e6) {
                                                    e = e6;
                                                    arrayList5 = arrayList;
                                                }
                                                if (channelParticipant != null) {
                                                    user = TLdeserialize;
                                                    if (channelParticipant.user_id == getUserConfig().n) {
                                                        user2 = getUserConfig().f();
                                                        if (user2 != null || channelParticipant == null) {
                                                            arrayList5 = arrayList;
                                                        } else {
                                                            TLRPC.UserStatus userStatus = user2.status;
                                                            if (userStatus != null) {
                                                                userStatus.expires = queryFinalized2.intValue(1);
                                                            }
                                                            arrayList5 = arrayList;
                                                            try {
                                                                try {
                                                                    arrayList5.add(user2);
                                                                    channelParticipant.date = queryFinalized2.intValue(3);
                                                                    TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                                                                    tL_chatChannelParticipant.user_id = k27.B1(channelParticipant.peer);
                                                                    tL_chatChannelParticipant.date = channelParticipant.date;
                                                                    tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
                                                                    tL_chatChannelParticipant.channelParticipant = channelParticipant;
                                                                    chatFull2.participants.participants.add(tL_chatChannelParticipant);
                                                                } catch (Exception e7) {
                                                                    e = e7;
                                                                    try {
                                                                        n(e, true);
                                                                        arrayList = arrayList5;
                                                                        z7 = 0;
                                                                        i = 2;
                                                                    } catch (Exception e8) {
                                                                        e = e8;
                                                                        chatFull = chatFull2;
                                                                        arrayList2 = arrayList9;
                                                                        arrayList = arrayList5;
                                                                        z5 = true;
                                                                        i11 = 0;
                                                                        z4 = false;
                                                                        sQLiteCursor = queryFinalized2;
                                                                        n(e, z5);
                                                                        if (sQLiteCursor != null) {
                                                                        }
                                                                        final na7 messagesController32 = getMessagesController();
                                                                        messagesController32.getClass();
                                                                        final ArrayList arrayList1022 = arrayList2;
                                                                        final ArrayList arrayList1122 = arrayList;
                                                                        chatFull2 = chatFull;
                                                                        final int i1222 = i11 == true ? 1 : 0;
                                                                        runnable = new Runnable() { // from class: i77
                                                                            @Override // java.lang.Runnable
                                                                            public final void run() {
                                                                                na7 na7Var = na7.this;
                                                                                vf6 vf6Var = na7Var.c1;
                                                                                long j4 = j;
                                                                                boolean z8 = z3;
                                                                                if (j4 > 0 && !z8 && System.currentTimeMillis() - na7Var.p1.get(j4, 0L) > 60000) {
                                                                                    na7Var.Y2(0, j4, z2);
                                                                                }
                                                                                TLRPC.ChatFull chatFull3222 = chatFull2;
                                                                                if (chatFull3222 != null) {
                                                                                    if (vf6Var.f(j4) == null) {
                                                                                        vf6Var.k(chatFull3222, j4);
                                                                                        na7Var.i4.M(-j4);
                                                                                    }
                                                                                    na7Var.b4(arrayList1122, true);
                                                                                    na7Var.V3(arrayList8, true);
                                                                                    if (chatFull3222.stickerset != null) {
                                                                                        na7Var.getMediaDataController().a0(chatFull3222.stickerset);
                                                                                    }
                                                                                    if (chatFull3222.emojiset != null) {
                                                                                        na7Var.getMediaDataController().a0(chatFull3222.emojiset);
                                                                                    }
                                                                                    na7Var.getNotificationCenter().k(kk7.S, chatFull3222, 0, Boolean.valueOf(z8), Boolean.FALSE);
                                                                                }
                                                                                na7Var.getNotificationCenter().k(kk7.E0, Long.valueOf(-j4), arrayList1022, hashMap, Integer.valueOf(i1222), Boolean.valueOf(z4));
                                                                            }
                                                                        };
                                                                        gl.c3(runnable);
                                                                        return chatFull2;
                                                                    }
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                                chatFull = chatFull2;
                                                                arrayList2 = arrayList9;
                                                                arrayList = arrayList5;
                                                                i4 = 0;
                                                                z4 = false;
                                                                sQLiteCursor = queryFinalized2;
                                                                i8 = i4;
                                                                if (sQLiteCursor != null) {
                                                                }
                                                                final na7 messagesController2222 = getMessagesController();
                                                                messagesController2222.getClass();
                                                                final ArrayList arrayList12222 = arrayList2;
                                                                final ArrayList arrayList13222 = arrayList;
                                                                final TLRPC.ChatFull chatFull3222 = chatFull;
                                                                gl.c3(new Runnable() { // from class: i77
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        na7 na7Var = na7.this;
                                                                        vf6 vf6Var = na7Var.c1;
                                                                        long j4 = j;
                                                                        boolean z8 = z3;
                                                                        if (j4 > 0 && !z8 && System.currentTimeMillis() - na7Var.p1.get(j4, 0L) > 60000) {
                                                                            na7Var.Y2(0, j4, z2);
                                                                        }
                                                                        TLRPC.ChatFull chatFull32222 = chatFull3222;
                                                                        if (chatFull32222 != null) {
                                                                            if (vf6Var.f(j4) == null) {
                                                                                vf6Var.k(chatFull32222, j4);
                                                                                na7Var.i4.M(-j4);
                                                                            }
                                                                            na7Var.b4(arrayList13222, true);
                                                                            na7Var.V3(arrayList8, true);
                                                                            if (chatFull32222.stickerset != null) {
                                                                                na7Var.getMediaDataController().a0(chatFull32222.stickerset);
                                                                            }
                                                                            if (chatFull32222.emojiset != null) {
                                                                                na7Var.getMediaDataController().a0(chatFull32222.emojiset);
                                                                            }
                                                                            na7Var.getNotificationCenter().k(kk7.S, chatFull32222, 0, Boolean.valueOf(z8), Boolean.FALSE);
                                                                        }
                                                                        na7Var.getNotificationCenter().k(kk7.E0, Long.valueOf(-j4), arrayList12222, hashMap, Integer.valueOf(i8), Boolean.valueOf(z4));
                                                                    }
                                                                });
                                                                throw th;
                                                            }
                                                        }
                                                        arrayList = arrayList5;
                                                        z7 = 0;
                                                        i = 2;
                                                    }
                                                } else {
                                                    user = TLdeserialize;
                                                }
                                                user2 = user;
                                                if (user2 != null) {
                                                }
                                                arrayList5 = arrayList;
                                                arrayList = arrayList5;
                                                z7 = 0;
                                                i = 2;
                                            }
                                            arrayList5 = arrayList;
                                            queryFinalized2.dispose();
                                            for (int i14 = 0; i14 < chatFull2.bot_info.size(); i14++) {
                                                try {
                                                    arrayList3.add(Long.valueOf(chatFull2.bot_info.get(i14).user_id));
                                                } catch (Exception e9) {
                                                    e = e9;
                                                    chatFull = chatFull2;
                                                    arrayList2 = arrayList9;
                                                    arrayList = arrayList5;
                                                    sQLiteCursor = null;
                                                    z5 = true;
                                                    i11 = 0;
                                                    z4 = false;
                                                    n(e, z5);
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    final na7 messagesController322 = getMessagesController();
                                                    messagesController322.getClass();
                                                    final ArrayList arrayList10222 = arrayList2;
                                                    final ArrayList arrayList11222 = arrayList;
                                                    chatFull2 = chatFull;
                                                    final int i12222 = i11 == true ? 1 : 0;
                                                    runnable = new Runnable() { // from class: i77
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            na7 na7Var = na7.this;
                                                            vf6 vf6Var = na7Var.c1;
                                                            long j4 = j;
                                                            boolean z8 = z3;
                                                            if (j4 > 0 && !z8 && System.currentTimeMillis() - na7Var.p1.get(j4, 0L) > 60000) {
                                                                na7Var.Y2(0, j4, z2);
                                                            }
                                                            TLRPC.ChatFull chatFull32222 = chatFull2;
                                                            if (chatFull32222 != null) {
                                                                if (vf6Var.f(j4) == null) {
                                                                    vf6Var.k(chatFull32222, j4);
                                                                    na7Var.i4.M(-j4);
                                                                }
                                                                na7Var.b4(arrayList11222, true);
                                                                na7Var.V3(arrayList8, true);
                                                                if (chatFull32222.stickerset != null) {
                                                                    na7Var.getMediaDataController().a0(chatFull32222.stickerset);
                                                                }
                                                                if (chatFull32222.emojiset != null) {
                                                                    na7Var.getMediaDataController().a0(chatFull32222.emojiset);
                                                                }
                                                                na7Var.getNotificationCenter().k(kk7.S, chatFull32222, 0, Boolean.valueOf(z8), Boolean.FALSE);
                                                            }
                                                            na7Var.getNotificationCenter().k(kk7.E0, Long.valueOf(-j4), arrayList10222, hashMap, Integer.valueOf(i12222), Boolean.valueOf(z4));
                                                        }
                                                    };
                                                    gl.c3(runnable);
                                                    return chatFull2;
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    chatFull = chatFull2;
                                                    arrayList2 = arrayList9;
                                                    arrayList = arrayList5;
                                                    sQLiteCursor = null;
                                                    i8 = 0;
                                                    z4 = false;
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    final na7 messagesController22222 = getMessagesController();
                                                    messagesController22222.getClass();
                                                    final ArrayList arrayList122222 = arrayList2;
                                                    final ArrayList arrayList132222 = arrayList;
                                                    final TLRPC.ChatFull chatFull32222 = chatFull;
                                                    gl.c3(new Runnable() { // from class: i77
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            na7 na7Var = na7.this;
                                                            vf6 vf6Var = na7Var.c1;
                                                            long j4 = j;
                                                            boolean z8 = z3;
                                                            if (j4 > 0 && !z8 && System.currentTimeMillis() - na7Var.p1.get(j4, 0L) > 60000) {
                                                                na7Var.Y2(0, j4, z2);
                                                            }
                                                            TLRPC.ChatFull chatFull322222 = chatFull32222;
                                                            if (chatFull322222 != null) {
                                                                if (vf6Var.f(j4) == null) {
                                                                    vf6Var.k(chatFull322222, j4);
                                                                    na7Var.i4.M(-j4);
                                                                }
                                                                na7Var.b4(arrayList132222, true);
                                                                na7Var.V3(arrayList8, true);
                                                                if (chatFull322222.stickerset != null) {
                                                                    na7Var.getMediaDataController().a0(chatFull322222.stickerset);
                                                                }
                                                                if (chatFull322222.emojiset != null) {
                                                                    na7Var.getMediaDataController().a0(chatFull322222.emojiset);
                                                                }
                                                                na7Var.getNotificationCenter().k(kk7.S, chatFull322222, 0, Boolean.valueOf(z8), Boolean.FALSE);
                                                            }
                                                            na7Var.getNotificationCenter().k(kk7.E0, Long.valueOf(-j4), arrayList122222, hashMap, Integer.valueOf(i8), Boolean.valueOf(z4));
                                                        }
                                                    });
                                                    throw th;
                                                }
                                            }
                                            if (chatFull2 != null) {
                                                long j4 = chatFull2.inviterId;
                                                if (j4 != j2) {
                                                    arrayList3.add(Long.valueOf(j4));
                                                }
                                            }
                                            if (chatFull2 != null && (arrayList6 = chatFull2.recent_requesters) != null && !arrayList6.isEmpty()) {
                                                for (i7 = 0; i7 < Math.min(3, chatFull2.recent_requesters.size()); i7++) {
                                                    arrayList3.add(chatFull2.recent_requesters.get((r5.size() - 1) - i7));
                                                }
                                            }
                                            int i15 = 0;
                                            k0(arrayList3, arrayList5, false);
                                            P(TextUtils.join(",", arrayList4), arrayList8);
                                            SQLiteDatabase sQLiteDatabase2 = getMessagesStorage().b;
                                            Locale locale = Locale.US;
                                            j3 = -j;
                                            i15 = 0;
                                            queryFinalized = sQLiteDatabase2.queryFinalized("SELECT mid FROM chat_pinned_v2 WHERE uid = " + j3 + " ORDER BY mid DESC", new Object[0]);
                                            while (queryFinalized.next()) {
                                                try {
                                                    int intValue = queryFinalized.intValue(i15);
                                                    arrayList9.add(Integer.valueOf(intValue));
                                                    hashMap.put(Integer.valueOf(intValue), null);
                                                    i15 = 0;
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    chatFull = chatFull2;
                                                    arrayList2 = arrayList9;
                                                    arrayList = arrayList5;
                                                    z5 = true;
                                                    i3 = 0;
                                                    z4 = false;
                                                    sQLiteCursor = queryFinalized;
                                                    i11 = i3;
                                                    n(e, z5);
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    final na7 messagesController3222 = getMessagesController();
                                                    messagesController3222.getClass();
                                                    final ArrayList arrayList102222 = arrayList2;
                                                    final ArrayList arrayList112222 = arrayList;
                                                    chatFull2 = chatFull;
                                                    final int i122222 = i11 == true ? 1 : 0;
                                                    runnable = new Runnable() { // from class: i77
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            na7 na7Var = na7.this;
                                                            vf6 vf6Var = na7Var.c1;
                                                            long j42 = j;
                                                            boolean z8 = z3;
                                                            if (j42 > 0 && !z8 && System.currentTimeMillis() - na7Var.p1.get(j42, 0L) > 60000) {
                                                                na7Var.Y2(0, j42, z2);
                                                            }
                                                            TLRPC.ChatFull chatFull322222 = chatFull2;
                                                            if (chatFull322222 != null) {
                                                                if (vf6Var.f(j42) == null) {
                                                                    vf6Var.k(chatFull322222, j42);
                                                                    na7Var.i4.M(-j42);
                                                                }
                                                                na7Var.b4(arrayList112222, true);
                                                                na7Var.V3(arrayList8, true);
                                                                if (chatFull322222.stickerset != null) {
                                                                    na7Var.getMediaDataController().a0(chatFull322222.stickerset);
                                                                }
                                                                if (chatFull322222.emojiset != null) {
                                                                    na7Var.getMediaDataController().a0(chatFull322222.emojiset);
                                                                }
                                                                na7Var.getNotificationCenter().k(kk7.S, chatFull322222, 0, Boolean.valueOf(z8), Boolean.FALSE);
                                                            }
                                                            na7Var.getNotificationCenter().k(kk7.E0, Long.valueOf(-j42), arrayList102222, hashMap, Integer.valueOf(i122222), Boolean.valueOf(z4));
                                                        }
                                                    };
                                                    gl.c3(runnable);
                                                    return chatFull2;
                                                } catch (Throwable th11) {
                                                    th = th11;
                                                    chatFull = chatFull2;
                                                    arrayList2 = arrayList9;
                                                    arrayList = arrayList5;
                                                    i2 = 0;
                                                    z4 = false;
                                                    sQLiteCursor = queryFinalized;
                                                    i8 = i2;
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    final na7 messagesController222222 = getMessagesController();
                                                    messagesController222222.getClass();
                                                    final ArrayList arrayList1222222 = arrayList2;
                                                    final ArrayList arrayList1322222 = arrayList;
                                                    final TLRPC.ChatFull chatFull322222 = chatFull;
                                                    gl.c3(new Runnable() { // from class: i77
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            na7 na7Var = na7.this;
                                                            vf6 vf6Var = na7Var.c1;
                                                            long j42 = j;
                                                            boolean z8 = z3;
                                                            if (j42 > 0 && !z8 && System.currentTimeMillis() - na7Var.p1.get(j42, 0L) > 60000) {
                                                                na7Var.Y2(0, j42, z2);
                                                            }
                                                            TLRPC.ChatFull chatFull3222222 = chatFull322222;
                                                            if (chatFull3222222 != null) {
                                                                if (vf6Var.f(j42) == null) {
                                                                    vf6Var.k(chatFull3222222, j42);
                                                                    na7Var.i4.M(-j42);
                                                                }
                                                                na7Var.b4(arrayList1322222, true);
                                                                na7Var.V3(arrayList8, true);
                                                                if (chatFull3222222.stickerset != null) {
                                                                    na7Var.getMediaDataController().a0(chatFull3222222.stickerset);
                                                                }
                                                                if (chatFull3222222.emojiset != null) {
                                                                    na7Var.getMediaDataController().a0(chatFull3222222.emojiset);
                                                                }
                                                                na7Var.getNotificationCenter().k(kk7.S, chatFull3222222, 0, Boolean.valueOf(z8), Boolean.FALSE);
                                                            }
                                                            na7Var.getNotificationCenter().k(kk7.E0, Long.valueOf(-j42), arrayList1222222, hashMap, Integer.valueOf(i8), Boolean.valueOf(z4));
                                                        }
                                                    });
                                                    throw th;
                                                }
                                            }
                                            queryFinalized.dispose();
                                            i15 = 0;
                                            queryFinalized = this.b.queryFinalized("SELECT count, end FROM chat_pinned_count WHERE uid = " + j3, new Object[0]);
                                            if (queryFinalized.next()) {
                                                i5 = queryFinalized.intValue(0);
                                                try {
                                                    z6 = queryFinalized.intValue(1) != 0;
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    chatFull = chatFull2;
                                                    arrayList2 = arrayList9;
                                                    arrayList = arrayList5;
                                                    z5 = true;
                                                    z4 = false;
                                                    sQLiteCursor = queryFinalized;
                                                    i11 = i5;
                                                    n(e, z5);
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    final na7 messagesController32222 = getMessagesController();
                                                    messagesController32222.getClass();
                                                    final ArrayList arrayList1022222 = arrayList2;
                                                    final ArrayList arrayList1122222 = arrayList;
                                                    chatFull2 = chatFull;
                                                    final int i1222222 = i11 == true ? 1 : 0;
                                                    runnable = new Runnable() { // from class: i77
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            na7 na7Var = na7.this;
                                                            vf6 vf6Var = na7Var.c1;
                                                            long j42 = j;
                                                            boolean z8 = z3;
                                                            if (j42 > 0 && !z8 && System.currentTimeMillis() - na7Var.p1.get(j42, 0L) > 60000) {
                                                                na7Var.Y2(0, j42, z2);
                                                            }
                                                            TLRPC.ChatFull chatFull3222222 = chatFull2;
                                                            if (chatFull3222222 != null) {
                                                                if (vf6Var.f(j42) == null) {
                                                                    vf6Var.k(chatFull3222222, j42);
                                                                    na7Var.i4.M(-j42);
                                                                }
                                                                na7Var.b4(arrayList1122222, true);
                                                                na7Var.V3(arrayList8, true);
                                                                if (chatFull3222222.stickerset != null) {
                                                                    na7Var.getMediaDataController().a0(chatFull3222222.stickerset);
                                                                }
                                                                if (chatFull3222222.emojiset != null) {
                                                                    na7Var.getMediaDataController().a0(chatFull3222222.emojiset);
                                                                }
                                                                na7Var.getNotificationCenter().k(kk7.S, chatFull3222222, 0, Boolean.valueOf(z8), Boolean.FALSE);
                                                            }
                                                            na7Var.getNotificationCenter().k(kk7.E0, Long.valueOf(-j42), arrayList1022222, hashMap, Integer.valueOf(i1222222), Boolean.valueOf(z4));
                                                        }
                                                    };
                                                    gl.c3(runnable);
                                                    return chatFull2;
                                                } catch (Throwable th12) {
                                                    th = th12;
                                                    chatFull = chatFull2;
                                                    arrayList2 = arrayList9;
                                                    arrayList = arrayList5;
                                                    z4 = false;
                                                    sQLiteCursor = queryFinalized;
                                                    i8 = i5;
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    final na7 messagesController2222222 = getMessagesController();
                                                    messagesController2222222.getClass();
                                                    final ArrayList arrayList12222222 = arrayList2;
                                                    final ArrayList arrayList13222222 = arrayList;
                                                    final TLRPC.ChatFull chatFull3222222 = chatFull;
                                                    gl.c3(new Runnable() { // from class: i77
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            na7 na7Var = na7.this;
                                                            vf6 vf6Var = na7Var.c1;
                                                            long j42 = j;
                                                            boolean z8 = z3;
                                                            if (j42 > 0 && !z8 && System.currentTimeMillis() - na7Var.p1.get(j42, 0L) > 60000) {
                                                                na7Var.Y2(0, j42, z2);
                                                            }
                                                            TLRPC.ChatFull chatFull32222222 = chatFull3222222;
                                                            if (chatFull32222222 != null) {
                                                                if (vf6Var.f(j42) == null) {
                                                                    vf6Var.k(chatFull32222222, j42);
                                                                    na7Var.i4.M(-j42);
                                                                }
                                                                na7Var.b4(arrayList13222222, true);
                                                                na7Var.V3(arrayList8, true);
                                                                if (chatFull32222222.stickerset != null) {
                                                                    na7Var.getMediaDataController().a0(chatFull32222222.stickerset);
                                                                }
                                                                if (chatFull32222222.emojiset != null) {
                                                                    na7Var.getMediaDataController().a0(chatFull32222222.emojiset);
                                                                }
                                                                na7Var.getNotificationCenter().k(kk7.S, chatFull32222222, 0, Boolean.valueOf(z8), Boolean.FALSE);
                                                            }
                                                            na7Var.getNotificationCenter().k(kk7.E0, Long.valueOf(-j42), arrayList12222222, hashMap, Integer.valueOf(i8), Boolean.valueOf(z4));
                                                        }
                                                    });
                                                    throw th;
                                                }
                                            } else {
                                                i5 = 0;
                                                z6 = false;
                                            }
                                            queryFinalized.dispose();
                                        } catch (Throwable th13) {
                                            th = th13;
                                            th = th;
                                            chatFull = chatFull2;
                                            arrayList2 = arrayList9;
                                            i4 = 0;
                                            z4 = false;
                                            sQLiteCursor = queryFinalized2;
                                            i8 = i4;
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            final na7 messagesController22222222 = getMessagesController();
                                            messagesController22222222.getClass();
                                            final ArrayList arrayList122222222 = arrayList2;
                                            final ArrayList arrayList132222222 = arrayList;
                                            final TLRPC.ChatFull chatFull32222222 = chatFull;
                                            gl.c3(new Runnable() { // from class: i77
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    na7 na7Var = na7.this;
                                                    vf6 vf6Var = na7Var.c1;
                                                    long j42 = j;
                                                    boolean z8 = z3;
                                                    if (j42 > 0 && !z8 && System.currentTimeMillis() - na7Var.p1.get(j42, 0L) > 60000) {
                                                        na7Var.Y2(0, j42, z2);
                                                    }
                                                    TLRPC.ChatFull chatFull322222222 = chatFull32222222;
                                                    if (chatFull322222222 != null) {
                                                        if (vf6Var.f(j42) == null) {
                                                            vf6Var.k(chatFull322222222, j42);
                                                            na7Var.i4.M(-j42);
                                                        }
                                                        na7Var.b4(arrayList132222222, true);
                                                        na7Var.V3(arrayList8, true);
                                                        if (chatFull322222222.stickerset != null) {
                                                            na7Var.getMediaDataController().a0(chatFull322222222.stickerset);
                                                        }
                                                        if (chatFull322222222.emojiset != null) {
                                                            na7Var.getMediaDataController().a0(chatFull322222222.emojiset);
                                                        }
                                                        na7Var.getNotificationCenter().k(kk7.S, chatFull322222222, 0, Boolean.valueOf(z8), Boolean.FALSE);
                                                    }
                                                    na7Var.getNotificationCenter().k(kk7.E0, Long.valueOf(-j42), arrayList122222222, hashMap, Integer.valueOf(i8), Boolean.valueOf(z4));
                                                }
                                            });
                                            throw th;
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                        chatFull = chatFull2;
                                        arrayList2 = arrayList9;
                                        z5 = true;
                                        i11 = 0;
                                        z4 = false;
                                        sQLiteCursor = queryFinalized2;
                                        n(e, z5);
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        final na7 messagesController322222 = getMessagesController();
                                        messagesController322222.getClass();
                                        final ArrayList arrayList10222222 = arrayList2;
                                        final ArrayList arrayList11222222 = arrayList;
                                        chatFull2 = chatFull;
                                        final int i12222222 = i11 == true ? 1 : 0;
                                        runnable = new Runnable() { // from class: i77
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                na7 na7Var = na7.this;
                                                vf6 vf6Var = na7Var.c1;
                                                long j42 = j;
                                                boolean z8 = z3;
                                                if (j42 > 0 && !z8 && System.currentTimeMillis() - na7Var.p1.get(j42, 0L) > 60000) {
                                                    na7Var.Y2(0, j42, z2);
                                                }
                                                TLRPC.ChatFull chatFull322222222 = chatFull2;
                                                if (chatFull322222222 != null) {
                                                    if (vf6Var.f(j42) == null) {
                                                        vf6Var.k(chatFull322222222, j42);
                                                        na7Var.i4.M(-j42);
                                                    }
                                                    na7Var.b4(arrayList11222222, true);
                                                    na7Var.V3(arrayList8, true);
                                                    if (chatFull322222222.stickerset != null) {
                                                        na7Var.getMediaDataController().a0(chatFull322222222.stickerset);
                                                    }
                                                    if (chatFull322222222.emojiset != null) {
                                                        na7Var.getMediaDataController().a0(chatFull322222222.emojiset);
                                                    }
                                                    na7Var.getNotificationCenter().k(kk7.S, chatFull322222222, 0, Boolean.valueOf(z8), Boolean.FALSE);
                                                }
                                                na7Var.getNotificationCenter().k(kk7.E0, Long.valueOf(-j42), arrayList10222222, hashMap, Integer.valueOf(i12222222), Boolean.valueOf(z4));
                                            }
                                        };
                                        gl.c3(runnable);
                                        return chatFull2;
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    chatFull2 = chatFull4;
                                } catch (Throwable th14) {
                                    th = th14;
                                    chatFull2 = chatFull4;
                                }
                            } catch (Exception e14) {
                                e = e14;
                                chatFull2 = chatFull4;
                                chatFull = chatFull2;
                                arrayList2 = arrayList9;
                                sQLiteCursor = null;
                                z5 = true;
                                i11 = 0;
                                z4 = false;
                                n(e, z5);
                                if (sQLiteCursor != null) {
                                }
                                final na7 messagesController3222222 = getMessagesController();
                                messagesController3222222.getClass();
                                final ArrayList arrayList102222222 = arrayList2;
                                final ArrayList arrayList112222222 = arrayList;
                                chatFull2 = chatFull;
                                final int i122222222 = i11 == true ? 1 : 0;
                                runnable = new Runnable() { // from class: i77
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        na7 na7Var = na7.this;
                                        vf6 vf6Var = na7Var.c1;
                                        long j42 = j;
                                        boolean z8 = z3;
                                        if (j42 > 0 && !z8 && System.currentTimeMillis() - na7Var.p1.get(j42, 0L) > 60000) {
                                            na7Var.Y2(0, j42, z2);
                                        }
                                        TLRPC.ChatFull chatFull322222222 = chatFull2;
                                        if (chatFull322222222 != null) {
                                            if (vf6Var.f(j42) == null) {
                                                vf6Var.k(chatFull322222222, j42);
                                                na7Var.i4.M(-j42);
                                            }
                                            na7Var.b4(arrayList112222222, true);
                                            na7Var.V3(arrayList8, true);
                                            if (chatFull322222222.stickerset != null) {
                                                na7Var.getMediaDataController().a0(chatFull322222222.stickerset);
                                            }
                                            if (chatFull322222222.emojiset != null) {
                                                na7Var.getMediaDataController().a0(chatFull322222222.emojiset);
                                            }
                                            na7Var.getNotificationCenter().k(kk7.S, chatFull322222222, 0, Boolean.valueOf(z8), Boolean.FALSE);
                                        }
                                        na7Var.getNotificationCenter().k(kk7.E0, Long.valueOf(-j42), arrayList102222222, hashMap, Integer.valueOf(i122222222), Boolean.valueOf(z4));
                                    }
                                };
                                gl.c3(runnable);
                                return chatFull2;
                            } catch (Throwable th15) {
                                th = th15;
                                chatFull2 = chatFull4;
                                th = th;
                                chatFull = chatFull2;
                                arrayList2 = arrayList9;
                                sQLiteCursor = null;
                                i8 = 0;
                                z4 = false;
                                if (sQLiteCursor != null) {
                                }
                                final na7 messagesController222222222 = getMessagesController();
                                messagesController222222222.getClass();
                                final ArrayList arrayList1222222222 = arrayList2;
                                final ArrayList arrayList1322222222 = arrayList;
                                final TLRPC.ChatFull chatFull322222222 = chatFull;
                                gl.c3(new Runnable() { // from class: i77
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        na7 na7Var = na7.this;
                                        vf6 vf6Var = na7Var.c1;
                                        long j42 = j;
                                        boolean z8 = z3;
                                        if (j42 > 0 && !z8 && System.currentTimeMillis() - na7Var.p1.get(j42, 0L) > 60000) {
                                            na7Var.Y2(0, j42, z2);
                                        }
                                        TLRPC.ChatFull chatFull3222222222 = chatFull322222222;
                                        if (chatFull3222222222 != null) {
                                            if (vf6Var.f(j42) == null) {
                                                vf6Var.k(chatFull3222222222, j42);
                                                na7Var.i4.M(-j42);
                                            }
                                            na7Var.b4(arrayList1322222222, true);
                                            na7Var.V3(arrayList8, true);
                                            if (chatFull3222222222.stickerset != null) {
                                                na7Var.getMediaDataController().a0(chatFull3222222222.stickerset);
                                            }
                                            if (chatFull3222222222.emojiset != null) {
                                                na7Var.getMediaDataController().a0(chatFull3222222222.emojiset);
                                            }
                                            na7Var.getNotificationCenter().k(kk7.S, chatFull3222222222, 0, Boolean.valueOf(z8), Boolean.FALSE);
                                        }
                                        na7Var.getNotificationCenter().k(kk7.E0, Long.valueOf(-j42), arrayList1222222222, hashMap, Integer.valueOf(i8), Boolean.valueOf(z4));
                                    }
                                });
                                throw th;
                            }
                        } catch (Exception e15) {
                            e = e15;
                        } catch (Throwable th16) {
                            th = th16;
                        }
                        if (chatFull2 != null) {
                            try {
                            } catch (Exception e16) {
                                e = e16;
                                queryFinalized = null;
                            } catch (Throwable th17) {
                                th = th17;
                                queryFinalized = null;
                            }
                            if (chatFull2.pinned_msg_id != 0) {
                                if (arrayList9.isEmpty()) {
                                    i6 = 0;
                                } else {
                                    try {
                                        i6 = 0;
                                    } catch (Exception e17) {
                                        e = e17;
                                        chatFull = chatFull2;
                                        z4 = z6;
                                        arrayList2 = arrayList9;
                                        arrayList = arrayList5;
                                        sQLiteCursor = null;
                                        z5 = true;
                                        i11 = i5;
                                        n(e, z5);
                                        if (sQLiteCursor != null) {
                                        }
                                        final na7 messagesController32222222 = getMessagesController();
                                        messagesController32222222.getClass();
                                        final ArrayList arrayList1022222222 = arrayList2;
                                        final ArrayList arrayList1122222222 = arrayList;
                                        chatFull2 = chatFull;
                                        final int i1222222222 = i11 == true ? 1 : 0;
                                        runnable = new Runnable() { // from class: i77
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                na7 na7Var = na7.this;
                                                vf6 vf6Var = na7Var.c1;
                                                long j42 = j;
                                                boolean z8 = z3;
                                                if (j42 > 0 && !z8 && System.currentTimeMillis() - na7Var.p1.get(j42, 0L) > 60000) {
                                                    na7Var.Y2(0, j42, z2);
                                                }
                                                TLRPC.ChatFull chatFull3222222222 = chatFull2;
                                                if (chatFull3222222222 != null) {
                                                    if (vf6Var.f(j42) == null) {
                                                        vf6Var.k(chatFull3222222222, j42);
                                                        na7Var.i4.M(-j42);
                                                    }
                                                    na7Var.b4(arrayList1122222222, true);
                                                    na7Var.V3(arrayList8, true);
                                                    if (chatFull3222222222.stickerset != null) {
                                                        na7Var.getMediaDataController().a0(chatFull3222222222.stickerset);
                                                    }
                                                    if (chatFull3222222222.emojiset != null) {
                                                        na7Var.getMediaDataController().a0(chatFull3222222222.emojiset);
                                                    }
                                                    na7Var.getNotificationCenter().k(kk7.S, chatFull3222222222, 0, Boolean.valueOf(z8), Boolean.FALSE);
                                                }
                                                na7Var.getNotificationCenter().k(kk7.E0, Long.valueOf(-j42), arrayList1022222222, hashMap, Integer.valueOf(i1222222222), Boolean.valueOf(z4));
                                            }
                                        };
                                        gl.c3(runnable);
                                        return chatFull2;
                                    } catch (Throwable th18) {
                                        th = th18;
                                        chatFull = chatFull2;
                                        z4 = z6;
                                        arrayList2 = arrayList9;
                                        arrayList = arrayList5;
                                        sQLiteCursor = null;
                                        i8 = i5;
                                        if (sQLiteCursor != null) {
                                        }
                                        final na7 messagesController2222222222 = getMessagesController();
                                        messagesController2222222222.getClass();
                                        final ArrayList arrayList12222222222 = arrayList2;
                                        final ArrayList arrayList13222222222 = arrayList;
                                        final TLRPC.ChatFull chatFull3222222222 = chatFull;
                                        gl.c3(new Runnable() { // from class: i77
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                na7 na7Var = na7.this;
                                                vf6 vf6Var = na7Var.c1;
                                                long j42 = j;
                                                boolean z8 = z3;
                                                if (j42 > 0 && !z8 && System.currentTimeMillis() - na7Var.p1.get(j42, 0L) > 60000) {
                                                    na7Var.Y2(0, j42, z2);
                                                }
                                                TLRPC.ChatFull chatFull32222222222 = chatFull3222222222;
                                                if (chatFull32222222222 != null) {
                                                    if (vf6Var.f(j42) == null) {
                                                        vf6Var.k(chatFull32222222222, j42);
                                                        na7Var.i4.M(-j42);
                                                    }
                                                    na7Var.b4(arrayList13222222222, true);
                                                    na7Var.V3(arrayList8, true);
                                                    if (chatFull32222222222.stickerset != null) {
                                                        na7Var.getMediaDataController().a0(chatFull32222222222.stickerset);
                                                    }
                                                    if (chatFull32222222222.emojiset != null) {
                                                        na7Var.getMediaDataController().a0(chatFull32222222222.emojiset);
                                                    }
                                                    na7Var.getNotificationCenter().k(kk7.S, chatFull32222222222, 0, Boolean.valueOf(z8), Boolean.FALSE);
                                                }
                                                na7Var.getNotificationCenter().k(kk7.E0, Long.valueOf(-j42), arrayList12222222222, hashMap, Integer.valueOf(i8), Boolean.valueOf(z4));
                                            }
                                        });
                                        throw th;
                                    }
                                    if (chatFull2.pinned_msg_id <= ((Integer) arrayList9.get(0)).intValue()) {
                                        queryFinalized = null;
                                        if (arrayList9.isEmpty()) {
                                            arrayList2 = arrayList9;
                                            arrayList = arrayList5;
                                        } else {
                                            arrayList = arrayList5;
                                            try {
                                                hq6 mediaDataController = getMediaDataController();
                                                if (z) {
                                                    j2 = j;
                                                }
                                                arrayList2 = arrayList9;
                                                try {
                                                    ArrayList R0 = mediaDataController.R0(j3, j2, arrayList2, true);
                                                    if (R0 != null) {
                                                        int size = R0.size();
                                                        for (int i16 = i6; i16 < size; i16++) {
                                                            k27 k27Var = (k27) R0.get(i16);
                                                            hashMap.put(Integer.valueOf(k27Var.e1()), k27Var);
                                                        }
                                                    }
                                                } catch (Exception e18) {
                                                    e = e18;
                                                    int i17 = i5;
                                                    chatFull = chatFull2;
                                                    z4 = z6;
                                                    z5 = true;
                                                    i3 = i17;
                                                    sQLiteCursor = queryFinalized;
                                                    i11 = i3;
                                                    n(e, z5);
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    final na7 messagesController322222222 = getMessagesController();
                                                    messagesController322222222.getClass();
                                                    final ArrayList arrayList10222222222 = arrayList2;
                                                    final ArrayList arrayList11222222222 = arrayList;
                                                    chatFull2 = chatFull;
                                                    final int i12222222222 = i11 == true ? 1 : 0;
                                                    runnable = new Runnable() { // from class: i77
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            na7 na7Var = na7.this;
                                                            vf6 vf6Var = na7Var.c1;
                                                            long j42 = j;
                                                            boolean z8 = z3;
                                                            if (j42 > 0 && !z8 && System.currentTimeMillis() - na7Var.p1.get(j42, 0L) > 60000) {
                                                                na7Var.Y2(0, j42, z2);
                                                            }
                                                            TLRPC.ChatFull chatFull32222222222 = chatFull2;
                                                            if (chatFull32222222222 != null) {
                                                                if (vf6Var.f(j42) == null) {
                                                                    vf6Var.k(chatFull32222222222, j42);
                                                                    na7Var.i4.M(-j42);
                                                                }
                                                                na7Var.b4(arrayList11222222222, true);
                                                                na7Var.V3(arrayList8, true);
                                                                if (chatFull32222222222.stickerset != null) {
                                                                    na7Var.getMediaDataController().a0(chatFull32222222222.stickerset);
                                                                }
                                                                if (chatFull32222222222.emojiset != null) {
                                                                    na7Var.getMediaDataController().a0(chatFull32222222222.emojiset);
                                                                }
                                                                na7Var.getNotificationCenter().k(kk7.S, chatFull32222222222, 0, Boolean.valueOf(z8), Boolean.FALSE);
                                                            }
                                                            na7Var.getNotificationCenter().k(kk7.E0, Long.valueOf(-j42), arrayList10222222222, hashMap, Integer.valueOf(i12222222222), Boolean.valueOf(z4));
                                                        }
                                                    };
                                                    gl.c3(runnable);
                                                    return chatFull2;
                                                } catch (Throwable th19) {
                                                    th = th19;
                                                    th = th;
                                                    i2 = i5;
                                                    chatFull = chatFull2;
                                                    z4 = z6;
                                                    sQLiteCursor = queryFinalized;
                                                    i8 = i2;
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    final na7 messagesController22222222222 = getMessagesController();
                                                    messagesController22222222222.getClass();
                                                    final ArrayList arrayList122222222222 = arrayList2;
                                                    final ArrayList arrayList132222222222 = arrayList;
                                                    final TLRPC.ChatFull chatFull32222222222 = chatFull;
                                                    gl.c3(new Runnable() { // from class: i77
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            na7 na7Var = na7.this;
                                                            vf6 vf6Var = na7Var.c1;
                                                            long j42 = j;
                                                            boolean z8 = z3;
                                                            if (j42 > 0 && !z8 && System.currentTimeMillis() - na7Var.p1.get(j42, 0L) > 60000) {
                                                                na7Var.Y2(0, j42, z2);
                                                            }
                                                            TLRPC.ChatFull chatFull322222222222 = chatFull32222222222;
                                                            if (chatFull322222222222 != null) {
                                                                if (vf6Var.f(j42) == null) {
                                                                    vf6Var.k(chatFull322222222222, j42);
                                                                    na7Var.i4.M(-j42);
                                                                }
                                                                na7Var.b4(arrayList132222222222, true);
                                                                na7Var.V3(arrayList8, true);
                                                                if (chatFull322222222222.stickerset != null) {
                                                                    na7Var.getMediaDataController().a0(chatFull322222222222.stickerset);
                                                                }
                                                                if (chatFull322222222222.emojiset != null) {
                                                                    na7Var.getMediaDataController().a0(chatFull322222222222.emojiset);
                                                                }
                                                                na7Var.getNotificationCenter().k(kk7.S, chatFull322222222222, 0, Boolean.valueOf(z8), Boolean.FALSE);
                                                            }
                                                            na7Var.getNotificationCenter().k(kk7.E0, Long.valueOf(-j42), arrayList122222222222, hashMap, Integer.valueOf(i8), Boolean.valueOf(z4));
                                                        }
                                                    });
                                                    throw th;
                                                }
                                            } catch (Exception e19) {
                                                e = e19;
                                                arrayList2 = arrayList9;
                                            } catch (Throwable th20) {
                                                th = th20;
                                                arrayList2 = arrayList9;
                                            }
                                        }
                                        final na7 messagesController4 = getMessagesController();
                                        messagesController4.getClass();
                                        final int i18 = i5;
                                        final boolean z8 = z6;
                                        final ArrayList arrayList14 = arrayList2;
                                        final ArrayList arrayList15 = arrayList;
                                        runnable = new Runnable() { // from class: i77
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                na7 na7Var = na7.this;
                                                vf6 vf6Var = na7Var.c1;
                                                long j42 = j;
                                                boolean z82 = z3;
                                                if (j42 > 0 && !z82 && System.currentTimeMillis() - na7Var.p1.get(j42, 0L) > 60000) {
                                                    na7Var.Y2(0, j42, z2);
                                                }
                                                TLRPC.ChatFull chatFull322222222222 = chatFull2;
                                                if (chatFull322222222222 != null) {
                                                    if (vf6Var.f(j42) == null) {
                                                        vf6Var.k(chatFull322222222222, j42);
                                                        na7Var.i4.M(-j42);
                                                    }
                                                    na7Var.b4(arrayList15, true);
                                                    na7Var.V3(arrayList8, true);
                                                    if (chatFull322222222222.stickerset != null) {
                                                        na7Var.getMediaDataController().a0(chatFull322222222222.stickerset);
                                                    }
                                                    if (chatFull322222222222.emojiset != null) {
                                                        na7Var.getMediaDataController().a0(chatFull322222222222.emojiset);
                                                    }
                                                    na7Var.getNotificationCenter().k(kk7.S, chatFull322222222222, 0, Boolean.valueOf(z82), Boolean.FALSE);
                                                }
                                                na7Var.getNotificationCenter().k(kk7.E0, Long.valueOf(-j42), arrayList14, hashMap, Integer.valueOf(i18), Boolean.valueOf(z8));
                                            }
                                        };
                                        gl.c3(runnable);
                                        return chatFull2;
                                    }
                                }
                                arrayList9.clear();
                                arrayList9.add(Integer.valueOf(chatFull2.pinned_msg_id));
                                queryFinalized = null;
                                hashMap.put(Integer.valueOf(chatFull2.pinned_msg_id), null);
                                if (arrayList9.isEmpty()) {
                                }
                                final na7 messagesController42 = getMessagesController();
                                messagesController42.getClass();
                                final int i182 = i5;
                                final boolean z82 = z6;
                                final ArrayList arrayList142 = arrayList2;
                                final ArrayList arrayList152 = arrayList;
                                runnable = new Runnable() { // from class: i77
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        na7 na7Var = na7.this;
                                        vf6 vf6Var = na7Var.c1;
                                        long j42 = j;
                                        boolean z822 = z3;
                                        if (j42 > 0 && !z822 && System.currentTimeMillis() - na7Var.p1.get(j42, 0L) > 60000) {
                                            na7Var.Y2(0, j42, z2);
                                        }
                                        TLRPC.ChatFull chatFull322222222222 = chatFull2;
                                        if (chatFull322222222222 != null) {
                                            if (vf6Var.f(j42) == null) {
                                                vf6Var.k(chatFull322222222222, j42);
                                                na7Var.i4.M(-j42);
                                            }
                                            na7Var.b4(arrayList152, true);
                                            na7Var.V3(arrayList8, true);
                                            if (chatFull322222222222.stickerset != null) {
                                                na7Var.getMediaDataController().a0(chatFull322222222222.stickerset);
                                            }
                                            if (chatFull322222222222.emojiset != null) {
                                                na7Var.getMediaDataController().a0(chatFull322222222222.emojiset);
                                            }
                                            na7Var.getNotificationCenter().k(kk7.S, chatFull322222222222, 0, Boolean.valueOf(z822), Boolean.FALSE);
                                        }
                                        na7Var.getNotificationCenter().k(kk7.E0, Long.valueOf(-j42), arrayList142, hashMap, Integer.valueOf(i182), Boolean.valueOf(z82));
                                    }
                                };
                                gl.c3(runnable);
                                return chatFull2;
                            }
                        }
                        queryFinalized = null;
                        i6 = 0;
                        if (arrayList9.isEmpty()) {
                        }
                        final na7 messagesController422 = getMessagesController();
                        messagesController422.getClass();
                        final int i1822 = i5;
                        final boolean z822 = z6;
                        final ArrayList arrayList1422 = arrayList2;
                        final ArrayList arrayList1522 = arrayList;
                        runnable = new Runnable() { // from class: i77
                            @Override // java.lang.Runnable
                            public final void run() {
                                na7 na7Var = na7.this;
                                vf6 vf6Var = na7Var.c1;
                                long j42 = j;
                                boolean z8222 = z3;
                                if (j42 > 0 && !z8222 && System.currentTimeMillis() - na7Var.p1.get(j42, 0L) > 60000) {
                                    na7Var.Y2(0, j42, z2);
                                }
                                TLRPC.ChatFull chatFull322222222222 = chatFull2;
                                if (chatFull322222222222 != null) {
                                    if (vf6Var.f(j42) == null) {
                                        vf6Var.k(chatFull322222222222, j42);
                                        na7Var.i4.M(-j42);
                                    }
                                    na7Var.b4(arrayList1522, true);
                                    na7Var.V3(arrayList8, true);
                                    if (chatFull322222222222.stickerset != null) {
                                        na7Var.getMediaDataController().a0(chatFull322222222222.stickerset);
                                    }
                                    if (chatFull322222222222.emojiset != null) {
                                        na7Var.getMediaDataController().a0(chatFull322222222222.emojiset);
                                    }
                                    na7Var.getNotificationCenter().k(kk7.S, chatFull322222222222, 0, Boolean.valueOf(z8222), Boolean.FALSE);
                                }
                                na7Var.getNotificationCenter().k(kk7.E0, Long.valueOf(-j42), arrayList1422, hashMap, Integer.valueOf(i1822), Boolean.valueOf(z822));
                            }
                        };
                        gl.c3(runnable);
                        return chatFull2;
                    }
                } else {
                    ArrayList<TL_communities.CommunityPeer> arrayList16 = chatFull2.linked_peers;
                    if (arrayList16 != null) {
                        int size2 = arrayList16.size();
                        for (int i19 = 0; i19 < size2; i19++) {
                            long n = cf3.n(chatFull2.linked_peers.get(i19).peer);
                            if (n > 0) {
                                arrayList3.add(Long.valueOf(n));
                            } else {
                                arrayList4.add(Long.valueOf(-n));
                            }
                        }
                    }
                    j2 = 0;
                }
                arrayList5 = arrayList;
                if (chatFull2 != null) {
                }
                if (chatFull2 != null) {
                    while (i7 < Math.min(3, chatFull2.recent_requesters.size())) {
                    }
                }
                int i152 = 0;
                k0(arrayList3, arrayList5, false);
                P(TextUtils.join(",", arrayList4), arrayList8);
                SQLiteDatabase sQLiteDatabase22 = getMessagesStorage().b;
                Locale locale2 = Locale.US;
                j3 = -j;
                i152 = 0;
                queryFinalized = sQLiteDatabase22.queryFinalized("SELECT mid FROM chat_pinned_v2 WHERE uid = " + j3 + " ORDER BY mid DESC", new Object[0]);
                while (queryFinalized.next()) {
                }
                queryFinalized.dispose();
                i152 = 0;
                queryFinalized = this.b.queryFinalized("SELECT count, end FROM chat_pinned_count WHERE uid = " + j3, new Object[0]);
                if (queryFinalized.next()) {
                }
                queryFinalized.dispose();
                if (chatFull2 != null) {
                }
                queryFinalized = null;
                i6 = 0;
                if (arrayList9.isEmpty()) {
                }
                final na7 messagesController4222 = getMessagesController();
                messagesController4222.getClass();
                final int i18222 = i5;
                final boolean z8222 = z6;
                final ArrayList arrayList14222 = arrayList2;
                final ArrayList arrayList15222 = arrayList;
                runnable = new Runnable() { // from class: i77
                    @Override // java.lang.Runnable
                    public final void run() {
                        na7 na7Var = na7.this;
                        vf6 vf6Var = na7Var.c1;
                        long j42 = j;
                        boolean z82222 = z3;
                        if (j42 > 0 && !z82222 && System.currentTimeMillis() - na7Var.p1.get(j42, 0L) > 60000) {
                            na7Var.Y2(0, j42, z2);
                        }
                        TLRPC.ChatFull chatFull322222222222 = chatFull2;
                        if (chatFull322222222222 != null) {
                            if (vf6Var.f(j42) == null) {
                                vf6Var.k(chatFull322222222222, j42);
                                na7Var.i4.M(-j42);
                            }
                            na7Var.b4(arrayList15222, true);
                            na7Var.V3(arrayList8, true);
                            if (chatFull322222222222.stickerset != null) {
                                na7Var.getMediaDataController().a0(chatFull322222222222.stickerset);
                            }
                            if (chatFull322222222222.emojiset != null) {
                                na7Var.getMediaDataController().a0(chatFull322222222222.emojiset);
                            }
                            na7Var.getNotificationCenter().k(kk7.S, chatFull322222222222, 0, Boolean.valueOf(z82222), Boolean.FALSE);
                        }
                        na7Var.getNotificationCenter().k(kk7.E0, Long.valueOf(-j42), arrayList14222, hashMap, Integer.valueOf(i18222), Boolean.valueOf(z8222));
                    }
                };
                gl.c3(runnable);
                return chatFull2;
            }
        }
        arrayList = arrayList7;
        chatFull2 = null;
        queryFinalized.dispose();
        arrayList3 = new ArrayList();
        arrayList4 = new ArrayList();
        if (chatFull2 instanceof TLRPC.TL_communityFull) {
        }
        arrayList5 = arrayList;
        if (chatFull2 != null) {
        }
        if (chatFull2 != null) {
        }
        int i1522 = 0;
        k0(arrayList3, arrayList5, false);
        P(TextUtils.join(",", arrayList4), arrayList8);
        SQLiteDatabase sQLiteDatabase222 = getMessagesStorage().b;
        Locale locale22 = Locale.US;
        j3 = -j;
        i1522 = 0;
        queryFinalized = sQLiteDatabase222.queryFinalized("SELECT mid FROM chat_pinned_v2 WHERE uid = " + j3 + " ORDER BY mid DESC", new Object[0]);
        while (queryFinalized.next()) {
        }
        queryFinalized.dispose();
        i1522 = 0;
        queryFinalized = this.b.queryFinalized("SELECT count, end FROM chat_pinned_count WHERE uid = " + j3, new Object[0]);
        if (queryFinalized.next()) {
        }
        queryFinalized.dispose();
        if (chatFull2 != null) {
        }
        queryFinalized = null;
        i6 = 0;
        if (arrayList9.isEmpty()) {
        }
        final na7 messagesController42222 = getMessagesController();
        messagesController42222.getClass();
        final int i182222 = i5;
        final boolean z82222 = z6;
        final ArrayList arrayList142222 = arrayList2;
        final ArrayList arrayList152222 = arrayList;
        runnable = new Runnable() { // from class: i77
            @Override // java.lang.Runnable
            public final void run() {
                na7 na7Var = na7.this;
                vf6 vf6Var = na7Var.c1;
                long j42 = j;
                boolean z822222 = z3;
                if (j42 > 0 && !z822222 && System.currentTimeMillis() - na7Var.p1.get(j42, 0L) > 60000) {
                    na7Var.Y2(0, j42, z2);
                }
                TLRPC.ChatFull chatFull322222222222 = chatFull2;
                if (chatFull322222222222 != null) {
                    if (vf6Var.f(j42) == null) {
                        vf6Var.k(chatFull322222222222, j42);
                        na7Var.i4.M(-j42);
                    }
                    na7Var.b4(arrayList152222, true);
                    na7Var.V3(arrayList8, true);
                    if (chatFull322222222222.stickerset != null) {
                        na7Var.getMediaDataController().a0(chatFull322222222222.stickerset);
                    }
                    if (chatFull322222222222.emojiset != null) {
                        na7Var.getMediaDataController().a0(chatFull322222222222.emojiset);
                    }
                    na7Var.getNotificationCenter().k(kk7.S, chatFull322222222222, 0, Boolean.valueOf(z822222), Boolean.FALSE);
                }
                na7Var.getNotificationCenter().k(kk7.E0, Long.valueOf(-j42), arrayList142222, hashMap, Integer.valueOf(i182222), Boolean.valueOf(z82222));
            }
        };
        gl.c3(runnable);
        return chatFull2;
    }

    public final void D1(ArrayList arrayList, ArrayList arrayList2, long j, int i) {
        if (arrayList == null && arrayList2 == null && j == 0) {
            return;
        }
        this.a.c(new wy((Object) this, (Object) arrayList, (Serializable) arrayList2, i, j, (byte) 8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0199  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(int i, int i2, long j, long j2) {
        SQLitePreparedStatement sQLitePreparedStatement;
        int i3;
        int i4;
        SQLitePreparedStatement sQLitePreparedStatement2 = "DELETE FROM media_holes_topics WHERE uid = ";
        if (i2 == -1) {
            if (j2 != 0) {
                SQLiteDatabase sQLiteDatabase = this.b;
                if (i == 0) {
                    Locale locale = Locale.US;
                    StringBuilder o = ug8.o(j, "DELETE FROM media_holes_topics WHERE uid = ", " AND topic_id = ");
                    o.append(j2);
                    sQLiteDatabase.executeFast(o.toString()).stepThis().dispose();
                } else {
                    Locale locale2 = Locale.US;
                    StringBuilder o2 = ug8.o(j, "DELETE FROM media_holes_topics WHERE uid = ", " AND topic_id = ");
                    o2.append(j2);
                    o2.append(" AND start = 0");
                    sQLiteDatabase.executeFast(o2.toString()).stepThis().dispose();
                }
            } else {
                SQLiteDatabase sQLiteDatabase2 = this.b;
                if (i == 0) {
                    Locale locale3 = Locale.US;
                    sQLiteDatabase2.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + j).stepThis().dispose();
                } else {
                    Locale locale4 = Locale.US;
                    sQLiteDatabase2.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + j + " AND start = 0").stepThis().dispose();
                }
            }
            try {
                try {
                    SQLiteDatabase sQLiteDatabase3 = this.b;
                    SQLitePreparedStatement executeFast = j2 != 0 ? sQLiteDatabase3.executeFast("REPLACE INTO media_holes_topics VALUES(?, ?, ?, ?, ?)") : sQLiteDatabase3.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                    for (int i5 = 0; i5 < 9; i5++) {
                        try {
                            executeFast.requery();
                            executeFast.bindLong(1, j);
                            if (j2 != 0) {
                                executeFast.bindLong(2, j2);
                                i4 = 3;
                            } else {
                                i4 = 2;
                            }
                            executeFast.bindInteger(i4, i5);
                            executeFast.bindInteger(i4 + 1, 1);
                            executeFast.bindInteger(i4 + 2, 1);
                            executeFast.step();
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                    if (executeFast != null) {
                        executeFast.dispose();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    th = th;
                    if (sQLitePreparedStatement2 != 0) {
                        sQLitePreparedStatement2.dispose();
                    }
                    throw th;
                }
            } catch (Exception e2) {
                throw e2;
            } catch (Throwable th2) {
                th = th2;
                sQLitePreparedStatement2 = 0;
                if (sQLitePreparedStatement2 != 0) {
                }
                throw th;
            }
        }
        if (j2 != 0) {
            SQLiteDatabase sQLiteDatabase4 = this.b;
            if (i == 0) {
                Locale locale5 = Locale.US;
                StringBuilder o3 = ug8.o(j, "DELETE FROM media_holes_topics WHERE uid = ", " AND topic_id = ");
                o3.append(j2);
                o3.append(" AND type = ");
                o3.append(i2);
                ir2.y(sQLiteDatabase4, o3.toString());
            } else {
                Locale locale6 = Locale.US;
                StringBuilder o4 = ug8.o(j, "DELETE FROM media_holes_topics WHERE uid = ", " AND topic_id = ");
                o4.append(j2);
                o4.append(" AND type = ");
                o4.append(i2);
                o4.append(" AND start = 0");
                sQLiteDatabase4.executeFast(o4.toString()).stepThis().dispose();
            }
        } else {
            SQLiteDatabase sQLiteDatabase5 = this.b;
            if (i == 0) {
                Locale locale7 = Locale.US;
                ir2.y(sQLiteDatabase5, "DELETE FROM media_holes_v2 WHERE uid = " + j + " AND type = " + i2);
            } else {
                Locale locale8 = Locale.US;
                sQLiteDatabase5.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + j + " AND type = " + i2 + " AND start = 0").stepThis().dispose();
            }
        }
        try {
            SQLiteDatabase sQLiteDatabase6 = this.b;
            sQLitePreparedStatement = j2 != 0 ? sQLiteDatabase6.executeFast("REPLACE INTO media_holes_topics VALUES(?, ?, ?, ?, ?)") : sQLiteDatabase6.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
            try {
                try {
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindLong(1, j);
                    if (j2 != 0) {
                        sQLitePreparedStatement.bindLong(2, j2);
                        i3 = 3;
                    } else {
                        i3 = 2;
                    }
                    sQLitePreparedStatement.bindInteger(i3, i2);
                    sQLitePreparedStatement.bindInteger(i3 + 1, 1);
                    sQLitePreparedStatement.bindInteger(i3 + 2, 1);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                    sQLitePreparedStatement.dispose();
                } catch (Exception e3) {
                }
            } catch (Throwable th3) {
                th = th3;
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
                throw th;
            }
        } catch (Exception e4) {
            sQLitePreparedStatement = null;
            throw e4;
        } catch (Throwable th4) {
            th = th4;
            sQLitePreparedStatement = null;
            if (sQLitePreparedStatement != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bb A[Catch: all -> 0x03e1, Exception -> 0x03e4, TryCatch #1 {all -> 0x03e1, blocks: (B:5:0x0037, B:7:0x0040, B:9:0x0067, B:12:0x0072, B:15:0x0091, B:18:0x00a8, B:21:0x00b1, B:23:0x00c7, B:25:0x00cf, B:26:0x00d4, B:28:0x00f0, B:29:0x00f7, B:31:0x0113, B:33:0x011d, B:35:0x0140, B:36:0x0142, B:38:0x0156, B:40:0x015a, B:42:0x015e, B:44:0x0166, B:46:0x016e, B:48:0x0174, B:51:0x0184, B:53:0x0190, B:54:0x0197, B:56:0x019b, B:57:0x01b5, B:59:0x01bb, B:61:0x01c1, B:62:0x01c4, B:64:0x01ca, B:66:0x01dc, B:70:0x01e4, B:72:0x01ea, B:74:0x01f4, B:77:0x01fc, B:79:0x0209, B:85:0x01a9, B:90:0x01ad, B:97:0x0213), top: B:4:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ca A[Catch: all -> 0x03e1, Exception -> 0x03e4, TryCatch #1 {all -> 0x03e1, blocks: (B:5:0x0037, B:7:0x0040, B:9:0x0067, B:12:0x0072, B:15:0x0091, B:18:0x00a8, B:21:0x00b1, B:23:0x00c7, B:25:0x00cf, B:26:0x00d4, B:28:0x00f0, B:29:0x00f7, B:31:0x0113, B:33:0x011d, B:35:0x0140, B:36:0x0142, B:38:0x0156, B:40:0x015a, B:42:0x015e, B:44:0x0166, B:46:0x016e, B:48:0x0174, B:51:0x0184, B:53:0x0190, B:54:0x0197, B:56:0x019b, B:57:0x01b5, B:59:0x01bb, B:61:0x01c1, B:62:0x01c4, B:64:0x01ca, B:66:0x01dc, B:70:0x01e4, B:72:0x01ea, B:74:0x01f4, B:77:0x01fc, B:79:0x0209, B:85:0x01a9, B:90:0x01ad, B:97:0x0213), top: B:4:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e4 A[Catch: all -> 0x03e1, Exception -> 0x03e4, TryCatch #1 {all -> 0x03e1, blocks: (B:5:0x0037, B:7:0x0040, B:9:0x0067, B:12:0x0072, B:15:0x0091, B:18:0x00a8, B:21:0x00b1, B:23:0x00c7, B:25:0x00cf, B:26:0x00d4, B:28:0x00f0, B:29:0x00f7, B:31:0x0113, B:33:0x011d, B:35:0x0140, B:36:0x0142, B:38:0x0156, B:40:0x015a, B:42:0x015e, B:44:0x0166, B:46:0x016e, B:48:0x0174, B:51:0x0184, B:53:0x0190, B:54:0x0197, B:56:0x019b, B:57:0x01b5, B:59:0x01bb, B:61:0x01c1, B:62:0x01c4, B:64:0x01ca, B:66:0x01dc, B:70:0x01e4, B:72:0x01ea, B:74:0x01f4, B:77:0x01fc, B:79:0x0209, B:85:0x01a9, B:90:0x01ad, B:97:0x0213), top: B:4:0x0037 }] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TLRPC.TL_messages_dialogs E0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        SQLiteCursor sQLiteCursor;
        SQLiteCursor queryFinalized;
        TLRPC.Dialog dialog;
        NativeByteBuffer byteBufferValue;
        NativeByteBuffer byteBufferValue2;
        int i;
        long j;
        NativeByteBuffer byteBufferValue3;
        ad7 ad7Var = this;
        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
        vf6 vf6Var = new vf6();
        vf6 vf6Var2 = new vf6();
        try {
            SQLiteDatabase sQLiteDatabase = ad7Var.b;
            Locale locale = Locale.US;
            ?? r10 = 0;
            SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT d.did, d.last_mid, d.unread_count, d.date, m.data, m.read_state, m.mid, m.send_state, s.flags, m.date, d.pts, d.inbox_max, d.outbox_max, m.replydata, d.pinned, d.unread_count_i, d.flags, d.folder_id, d.data, d.unread_reactions, d.last_mid_group, d.ttl_period, d.unread_poll_votes FROM dialogs as d LEFT JOIN messages_v2 as m ON d.last_mid = m.mid AND d.did = m.uid LEFT JOIN dialog_settings as s ON d.did = s.did WHERE d.did IN (" + str + ") ORDER BY d.pinned DESC, d.date DESC", new Object[0]);
            while (queryFinalized2.next()) {
                try {
                    try {
                        long longValue = queryFinalized2.longValue(r10);
                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                        tL_dialog.id = longValue;
                        tL_dialog.top_message = queryFinalized2.intValue(1);
                        tL_dialog.unread_count = queryFinalized2.intValue(2);
                        tL_dialog.last_message_date = queryFinalized2.intValue(3);
                        int intValue = queryFinalized2.intValue(10);
                        tL_dialog.pts = intValue;
                        tL_dialog.flags = (intValue == 0 || cf3.D(tL_dialog.id)) ? r10 : 1;
                        tL_dialog.read_inbox_max_id = queryFinalized2.intValue(11);
                        tL_dialog.read_outbox_max_id = queryFinalized2.intValue(12);
                        int intValue2 = queryFinalized2.intValue(14);
                        tL_dialog.pinnedNum = intValue2;
                        tL_dialog.pinned = intValue2 != 0 ? true : r10;
                        tL_dialog.unread_mentions_count = queryFinalized2.intValue(15);
                        int intValue3 = queryFinalized2.intValue(16);
                        tL_dialog.unread_mark = (intValue3 & 1) != 0 ? true : r10;
                        tL_dialog.view_forum_as_messages = (intValue3 & 64) != 0 ? true : r10;
                        long longValue2 = queryFinalized2.longValue(8);
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        tL_dialog.notify_settings = tL_peerNotifySettings;
                        if ((((int) longValue2) & 1) != 0) {
                            int i2 = (int) (longValue2 >> 32);
                            tL_peerNotifySettings.mute_until = i2;
                            if (i2 == 0) {
                                tL_peerNotifySettings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            }
                        }
                        tL_dialog.folder_id = queryFinalized2.intValue(17);
                        tL_dialog.unread_reactions_count = queryFinalized2.intValue(19);
                        long longValue3 = queryFinalized2.longValue(20);
                        if (longValue3 != 0) {
                            vf6Var2.a(longValue, Long.valueOf(longValue3));
                        }
                        tL_dialog.ttl_period = queryFinalized2.intValue(21);
                        tL_dialog.unread_poll_votes_count = queryFinalized2.intValue(22);
                        tL_messages_dialogs.dialogs.add(tL_dialog);
                        NativeByteBuffer byteBufferValue4 = queryFinalized2.byteBufferValue(4);
                        if (byteBufferValue4 != 0) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue4, byteBufferValue4.readInt32(r10), r10);
                            if (TLdeserialize != null) {
                                TLdeserialize.readAttachPath(byteBufferValue4, ad7Var.getUserConfig().n);
                                byteBufferValue4.reuse();
                                k27.L5(queryFinalized2.intValue(5), TLdeserialize);
                                TLdeserialize.id = queryFinalized2.intValue(6);
                                int intValue4 = queryFinalized2.intValue(9);
                                if (intValue4 != 0) {
                                    tL_dialog.last_message_date = intValue4;
                                }
                                TLdeserialize.send_state = queryFinalized2.intValue(7);
                                TLdeserialize.dialog_id = tL_dialog.id;
                                tL_messages_dialogs.messages.add(TLdeserialize);
                                d(TLdeserialize, arrayList, arrayList2, null);
                                try {
                                    TLRPC.MessageReplyHeader messageReplyHeader = TLdeserialize.reply_to;
                                    if (messageReplyHeader != null && messageReplyHeader.reply_to_msg_id != 0 && s0(TLdeserialize.action)) {
                                        if (queryFinalized2.isNull(13) || (byteBufferValue3 = queryFinalized2.byteBufferValue(13)) == 0) {
                                            j = longValue;
                                        } else {
                                            TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(r10), r10);
                                            TLdeserialize.replyMessage = TLdeserialize2;
                                            j = longValue;
                                            try {
                                                TLdeserialize2.readAttachPath(byteBufferValue3, ad7Var.getUserConfig().n);
                                                byteBufferValue3.reuse();
                                                TLRPC.Message message = TLdeserialize.replyMessage;
                                                if (message != null) {
                                                    d(message, arrayList, arrayList2, null);
                                                }
                                            } catch (Exception e) {
                                                e = e;
                                                ad7Var.n(e, true);
                                                if (!cf3.B(j)) {
                                                }
                                                if (cf3.B(j)) {
                                                }
                                                r10 = 0;
                                            }
                                        }
                                        if (TLdeserialize.replyMessage == null) {
                                            vf6Var.k(TLdeserialize, tL_dialog.id);
                                        }
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    j = longValue;
                                }
                            } else {
                                j = longValue;
                                byteBufferValue4.reuse();
                            }
                            if (!cf3.B(j) && tL_dialog.read_inbox_max_id > tL_dialog.top_message) {
                                tL_dialog.read_inbox_max_id = 0;
                            }
                            if (cf3.B(j)) {
                                int i3 = (int) (j & 4294967295L);
                                if (!arrayList3.contains(Integer.valueOf(i3))) {
                                    arrayList3.add(Integer.valueOf(i3));
                                }
                            } else if (!cf3.D(j)) {
                                long j2 = -j;
                                if (!arrayList2.contains(Long.valueOf(j2))) {
                                    arrayList2.add(Long.valueOf(j2));
                                }
                            } else if (!arrayList.contains(Long.valueOf(j))) {
                                arrayList.add(Long.valueOf(j));
                            }
                            r10 = 0;
                        }
                        j = longValue;
                        if (!cf3.B(j)) {
                            tL_dialog.read_inbox_max_id = 0;
                        }
                        if (cf3.B(j)) {
                        }
                        r10 = 0;
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor = queryFinalized2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    sQLiteCursor = queryFinalized2;
                }
            }
            queryFinalized2.dispose();
            if (vf6Var2.i()) {
                queryFinalized = null;
            } else {
                try {
                    StringBuilder sb = new StringBuilder();
                    int i4 = 0;
                    while (i4 < vf6Var2.m()) {
                        sb.append("uid = ");
                        sb.append(vf6Var2.j(i4));
                        sb.append(" AND group_id = ");
                        sb.append(vf6Var2.n(i4));
                        i4++;
                        if (i4 < vf6Var2.m()) {
                            sb.append(" OR ");
                        }
                    }
                    SQLiteDatabase sQLiteDatabase2 = ad7Var.b;
                    Locale locale2 = Locale.US;
                    int i5 = 0;
                    queryFinalized = sQLiteDatabase2.queryFinalized("SELECT uid, data, read_state, mid, send_state, date, replydata FROM messages_v2 WHERE " + ((Object) sb) + " ORDER BY date DESC", new Object[0]);
                    while (queryFinalized.next()) {
                        try {
                            try {
                                long longValue4 = queryFinalized.longValue(i5);
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= tL_messages_dialogs.dialogs.size()) {
                                        dialog = null;
                                        break;
                                    }
                                    dialog = tL_messages_dialogs.dialogs.get(i6);
                                    if (dialog != null && dialog.id == longValue4) {
                                        break;
                                    }
                                    i6++;
                                }
                                if (dialog != null && (byteBufferValue = queryFinalized.byteBufferValue(1)) != null) {
                                    TLRPC.Message TLdeserialize3 = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                    if (TLdeserialize3 != null) {
                                        TLdeserialize3.readAttachPath(byteBufferValue, ad7Var.getUserConfig().n);
                                        byteBufferValue.reuse();
                                        k27.L5(queryFinalized.intValue(2), TLdeserialize3);
                                        TLdeserialize3.id = queryFinalized.intValue(3);
                                        int intValue5 = queryFinalized.intValue(5);
                                        if (intValue5 != 0) {
                                            dialog.last_message_date = intValue5;
                                        }
                                        TLdeserialize3.send_state = queryFinalized.intValue(4);
                                        TLdeserialize3.dialog_id = dialog.id;
                                        tL_messages_dialogs.messages.add(TLdeserialize3);
                                        d(TLdeserialize3, arrayList, arrayList2, null);
                                        try {
                                            TLRPC.MessageReplyHeader messageReplyHeader2 = TLdeserialize3.reply_to;
                                            if (messageReplyHeader2 != null && messageReplyHeader2.reply_to_msg_id != 0 && s0(TLdeserialize3.action)) {
                                                if (!queryFinalized.isNull(6) && (byteBufferValue2 = queryFinalized.byteBufferValue(6)) != null) {
                                                    TLRPC.Message TLdeserialize4 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                                    TLdeserialize3.replyMessage = TLdeserialize4;
                                                    TLdeserialize4.readAttachPath(byteBufferValue2, ad7Var.getUserConfig().n);
                                                    byteBufferValue2.reuse();
                                                    TLRPC.Message message2 = TLdeserialize3.replyMessage;
                                                    if (message2 != null) {
                                                        d(message2, arrayList, arrayList2, null);
                                                    }
                                                }
                                                if (TLdeserialize3.replyMessage == null) {
                                                    vf6Var.k(TLdeserialize3, dialog.id);
                                                }
                                            }
                                        } catch (Exception e4) {
                                            ad7Var.n(e4, true);
                                        }
                                    } else {
                                        byteBufferValue.reuse();
                                    }
                                }
                                i5 = 0;
                            } catch (Exception e5) {
                                e = e5;
                                sQLiteCursor = queryFinalized;
                                try {
                                    throw e;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            sQLiteCursor = queryFinalized;
                            if (sQLiteCursor != null) {
                            }
                            throw th;
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e6) {
                    e = e6;
                    sQLiteCursor = null;
                    throw e;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = null;
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
            }
            if (!vf6Var.i()) {
                int m = vf6Var.m();
                int i7 = 0;
                while (i7 < m) {
                    long j3 = vf6Var.j(i7);
                    TLRPC.Message message3 = (TLRPC.Message) vf6Var.n(i7);
                    SQLiteDatabase sQLiteDatabase3 = ad7Var.b;
                    Locale locale3 = Locale.US;
                    SQLiteCursor queryFinalized3 = sQLiteDatabase3.queryFinalized("SELECT data, mid, date, uid FROM messages_v2 WHERE mid = " + message3.id + " and uid = " + j3, new Object[0]);
                    while (queryFinalized3.next()) {
                        NativeByteBuffer byteBufferValue5 = queryFinalized3.byteBufferValue(0);
                        if (byteBufferValue5 != null) {
                            TLRPC.Message TLdeserialize5 = TLRPC.Message.TLdeserialize(byteBufferValue5, byteBufferValue5.readInt32(false), false);
                            TLdeserialize5.readAttachPath(byteBufferValue5, ad7Var.getUserConfig().n);
                            byteBufferValue5.reuse();
                            TLdeserialize5.id = queryFinalized3.intValue(1);
                            TLdeserialize5.date = queryFinalized3.intValue(2);
                            i = m;
                            TLdeserialize5.dialog_id = queryFinalized3.longValue(3);
                            d(TLdeserialize5, arrayList, arrayList2, null);
                            message3.replyMessage = TLdeserialize5;
                            TLdeserialize5.dialog_id = message3.dialog_id;
                        } else {
                            i = m;
                        }
                        ad7Var = this;
                        m = i;
                    }
                    int i8 = m;
                    queryFinalized3.dispose();
                    i7++;
                    ad7Var = this;
                    m = i8;
                }
            }
            if (queryFinalized != null) {
                queryFinalized.dispose();
            }
            return tL_messages_dialogs;
        } catch (Exception e7) {
            e = e7;
            sQLiteCursor = null;
        } catch (Throwable th5) {
            th = th5;
            sQLiteCursor = null;
        }
    }

    public final void E1(int i) {
        G();
        this.n = i;
    }

    public final void F(int i, long j, long j2, String str) {
        SQLitePreparedStatement executeFast;
        SQLiteDatabase sQLiteDatabase = this.b;
        int i2 = 2;
        if (j2 != 0) {
            if (i == 0) {
                sQLiteDatabase.executeFast(String.format(Locale.US, tb4.y("DELETE FROM ", str, " WHERE uid = %d AND topic_id = %d"), Long.valueOf(j), Long.valueOf(j2))).stepThis().dispose();
            } else {
                sQLiteDatabase.executeFast(String.format(Locale.US, tb4.y("DELETE FROM ", str, " WHERE uid = %d AND topic_id = %d AND start = 0"), Long.valueOf(j), Long.valueOf(j2))).stepThis().dispose();
            }
        } else if (i == 0) {
            sQLiteDatabase.executeFast(String.format(Locale.US, tb4.y("DELETE FROM ", str, " WHERE uid = %d"), Long.valueOf(j))).stepThis().dispose();
        } else {
            sQLiteDatabase.executeFast(String.format(Locale.US, tb4.y("DELETE FROM ", str, " WHERE uid = %d AND start = 0"), Long.valueOf(j))).stepThis().dispose();
        }
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase2 = this.b;
                if (j2 != 0) {
                    executeFast = sQLiteDatabase2.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?, ?)");
                } else {
                    executeFast = sQLiteDatabase2.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?)");
                }
                sQLitePreparedStatement = executeFast;
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindLong(1, j);
                if (j2 != 0) {
                    sQLitePreparedStatement.bindLong(2, j2);
                    i2 = 3;
                }
                sQLitePreparedStatement.bindInteger(i2, 1);
                sQLitePreparedStatement.bindInteger(i2 + 1, 1);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e) {
                throw e;
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public final void F0(ArrayList arrayList) {
        try {
            vf6 vf6Var = new vf6();
            for (int i = 0; i < arrayList.size(); i++) {
                if (!((mub) arrayList.get(i)).i && !((mub) arrayList.get(i)).j && ((mub) arrayList.get(i)).g != null) {
                    long j = ((mub) arrayList.get(i)).g.grouped_id;
                    if (j != 0) {
                        ArrayList arrayList2 = (ArrayList) vf6Var.f(j);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            vf6Var.k(arrayList2, j);
                        }
                        arrayList2.add((mub) arrayList.get(i));
                    }
                }
            }
            for (int i2 = 0; i2 < vf6Var.m(); i2++) {
                long j2 = vf6Var.j(i2);
                ArrayList arrayList3 = (ArrayList) vf6Var.n(i2);
                SQLiteDatabase sQLiteDatabase = this.b;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + ((mub) arrayList3.get(0)).b + " AND group_id = " + j2 + " ORDER BY date DESC", new Object[0]);
                ArrayList arrayList4 = null;
                while (queryFinalized.next()) {
                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    if (TLdeserialize != null) {
                        TLdeserialize.readAttachPath(byteBufferValue, y6c.h(this.currentAccount).n);
                    }
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(new k27(this.currentAccount, TLdeserialize, false, false));
                }
                queryFinalized.dispose();
                for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                    ((mub) arrayList3.get(i3)).h = arrayList4;
                }
            }
        } catch (Throwable th) {
            n(th, true);
        }
    }

    public final void F1(int i) {
        G();
        this.r = i;
    }

    public final void G() {
        try {
            this.Q.await();
        } catch (Throwable unused) {
        }
    }

    public final void G0(ArrayList arrayList, long j) {
        if (arrayList != null) {
            try {
                vf6 vf6Var = new vf6();
                for (int i = 0; i < arrayList.size(); i++) {
                    if (((TLRPC.TL_forumTopic) arrayList.get(i)).topMessage != null) {
                        long j2 = ((TLRPC.TL_forumTopic) arrayList.get(i)).topMessage.grouped_id;
                        if (j2 != 0) {
                            ArrayList arrayList2 = (ArrayList) vf6Var.f(j2);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                vf6Var.k(arrayList2, j2);
                            }
                            arrayList2.add((TLRPC.TL_forumTopic) arrayList.get(i));
                        }
                    }
                }
                for (int i2 = 0; i2 < vf6Var.m(); i2++) {
                    long j3 = vf6Var.j(i2);
                    ArrayList arrayList3 = (ArrayList) vf6Var.n(i2);
                    SQLiteDatabase sQLiteDatabase = this.b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j + " AND group_id = " + j3 + " ORDER BY date DESC", new Object[0]);
                    ArrayList<k27> arrayList4 = null;
                    while (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        if (TLdeserialize != null) {
                            TLdeserialize.readAttachPath(byteBufferValue, y6c.h(this.currentAccount).n);
                        }
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList<>();
                        }
                        arrayList4.add(new k27(this.currentAccount, TLdeserialize, false, false));
                    }
                    queryFinalized.dispose();
                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                        ((TLRPC.TL_forumTopic) arrayList3.get(i3)).groupedMessages = arrayList4;
                    }
                }
            } catch (Throwable th) {
                n(th, true);
            }
        }
    }

    public final void G1(int i) {
        G();
        this.s = i;
    }

    public final void H(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        co3 co3Var = this.a;
        if (currentThread != co3Var) {
            co3Var.c(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0111 A[Catch: all -> 0x0196, Exception -> 0x019a, TryCatch #4 {Exception -> 0x019a, all -> 0x0196, blocks: (B:35:0x010b, B:37:0x0111, B:39:0x0117, B:41:0x013c, B:42:0x0153, B:44:0x0165, B:50:0x014d), top: B:34:0x010b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0188 A[Catch: Exception -> 0x019e, all -> 0x01a0, TRY_LEAVE, TryCatch #0 {all -> 0x01a0, blocks: (B:71:0x005f, B:47:0x016e, B:53:0x0188, B:75:0x019f, B:30:0x008c, B:32:0x0094, B:67:0x00c0, B:68:0x00e6), top: B:70:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a3  */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H0(vf6 vf6Var, vf6 vf6Var2, ArrayList arrayList, ArrayList arrayList2, int i) {
        boolean z;
        int i2;
        boolean z2;
        int i3;
        SQLiteCursor queryFinalized;
        ?? r3;
        SQLiteCursor sQLiteCursor;
        ad7 ad7Var = this;
        vf6 vf6Var3 = vf6Var;
        if (vf6Var3.i()) {
            return;
        }
        int i4 = 1;
        boolean z3 = i == 1;
        boolean z4 = i == 5;
        boolean z5 = i == 9;
        long e = ad7Var.getUserConfig().e();
        int m = vf6Var3.m();
        int i5 = 0;
        while (i5 < m) {
            long j = vf6Var3.j(i5);
            SparseArray sparseArray = (SparseArray) vf6Var3.n(i5);
            ArrayList arrayList3 = (ArrayList) vf6Var2.f(j);
            if (arrayList3 == null) {
                z = z5;
            } else {
                int i6 = 0;
                SQLiteCursor sQLiteCursor2 = null;
                while (i6 < 2) {
                    try {
                        if (i6 != i4) {
                            i2 = 0;
                        } else if (z3) {
                            i2 = i4;
                        } else {
                            z2 = z5;
                            i3 = i6;
                            i6 = i3 + 1;
                            ad7Var = this;
                            z5 = z2;
                            i4 = 1;
                        }
                        if (z5) {
                            try {
                                try {
                                    SQLiteDatabase sQLiteDatabase = ad7Var.b;
                                    Locale locale = Locale.US;
                                    String join = TextUtils.join(",", arrayList3);
                                    z2 = z5;
                                    StringBuilder sb = new StringBuilder();
                                    i3 = i6;
                                    sb.append("SELECT data, mid, date, dialog_id FROM welcome_messages WHERE mid IN(");
                                    sb.append(join);
                                    sb.append(") AND dialog_id = ");
                                    sb.append(j);
                                    queryFinalized = sQLiteDatabase.queryFinalized(sb.toString(), new Object[0]);
                                } catch (Throwable th) {
                                    th = th;
                                    if (sQLiteCursor2 != null) {
                                        sQLiteCursor2.dispose();
                                    }
                                    throw th;
                                }
                            } catch (Exception e2) {
                                throw e2;
                            }
                        } else {
                            z2 = z5;
                            i3 = i6;
                            SQLiteDatabase sQLiteDatabase2 = ad7Var.b;
                            if (z4) {
                                Locale locale2 = Locale.US;
                                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT data, mid, date, topic_id FROM quick_replies_messages WHERE mid IN(" + TextUtils.join(",", arrayList3) + ") AND topic_id = " + j, new Object[0]);
                            } else if (i2 != 0) {
                                Locale locale3 = Locale.US;
                                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT data, mid, date, uid FROM scheduled_messages_v2 WHERE mid IN(" + TextUtils.join(",", arrayList3) + ") AND uid = " + j, new Object[0]);
                            } else {
                                Locale locale4 = Locale.US;
                                r3 = 0;
                                sQLiteCursor = sQLiteDatabase2.queryFinalized("SELECT data, mid, date, uid FROM messages_v2 WHERE mid IN(" + TextUtils.join(",", arrayList3) + ") AND uid = " + j, new Object[0]);
                                if (sQLiteCursor.next()) {
                                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(r3);
                                    if (byteBufferValue != 0) {
                                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r3), r3);
                                        TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().n);
                                        byteBufferValue.reuse();
                                        TLdeserialize.id = sQLiteCursor.intValue(1);
                                        TLdeserialize.date = sQLiteCursor.intValue(2);
                                        if (z4) {
                                            TLdeserialize.dialog_id = e;
                                            TLdeserialize.flags |= TLObject.FLAG_30;
                                            TLdeserialize.quick_reply_shortcut_id = sQLiteCursor.intValue(3);
                                        } else {
                                            TLdeserialize.dialog_id = sQLiteCursor.longValue(3);
                                        }
                                        d(TLdeserialize, arrayList, arrayList2, null);
                                        ArrayList arrayList4 = (ArrayList) sparseArray.get(TLdeserialize.id);
                                        if (arrayList4 != null) {
                                            SQLiteCursor sQLiteCursor3 = sQLiteCursor;
                                            int i7 = 0;
                                            for (int size = arrayList4.size(); i7 < size; size = size) {
                                                ((TLRPC.Message) arrayList4.get(i7)).replyMessage = TLdeserialize;
                                                k27.B0(TLdeserialize);
                                                i7++;
                                            }
                                            queryFinalized = sQLiteCursor3;
                                        }
                                    }
                                    queryFinalized = sQLiteCursor;
                                } else {
                                    sQLiteCursor2 = sQLiteCursor;
                                    sQLiteCursor2.dispose();
                                    i6 = i3 + 1;
                                    ad7Var = this;
                                    z5 = z2;
                                    i4 = 1;
                                }
                            }
                        }
                        if (sQLiteCursor.next()) {
                        }
                    } catch (Exception e3) {
                        throw e3;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor2 = sQLiteCursor;
                        if (sQLiteCursor2 != null) {
                        }
                        throw th;
                    }
                    r3 = 0;
                    sQLiteCursor = queryFinalized;
                }
                z = z5;
                if (sQLiteCursor2 != null) {
                    sQLiteCursor2.dispose();
                }
            }
            i5++;
            ad7Var = this;
            vf6Var3 = vf6Var;
            z5 = z;
            i4 = 1;
        }
    }

    public final void H1(int i) {
        G();
        this.w = i;
    }

    public final ArrayList I0(HashSet hashSet) {
        ArrayList arrayList = new ArrayList();
        try {
            String join = TextUtils.join(",", hashSet);
            SQLiteCursor queryFinalized = this.b.queryFinalized("SELECT info, pinned FROM user_settings WHERE uid IN(" + join + ")", new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.UserFull TLdeserialize = TLRPC.UserFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    TLdeserialize.pinned_msg_id = queryFinalized.intValue(1);
                    arrayList.add(TLdeserialize);
                    byteBufferValue.reuse();
                }
            }
            queryFinalized.dispose();
            return arrayList;
        } catch (Exception e) {
            n(e, true);
            return arrayList;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0256, code lost:
    
        if (r3.contains(" " + r14) == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02a2, code lost:
    
        r7 = (xk3) r6.f(r13.id);
        r8 = r13.status;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02ac, code lost:
    
        if (r8 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02ae, code lost:
    
        r28 = r3;
        r29 = r6;
        r8.expires = r2.intValue(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02c0, code lost:
    
        if (r5 != 1) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02c2, code lost:
    
        r7.c = gl.r0(r13.first_name, r13.last_name, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02f6, code lost:
    
        r7.a = r13;
        r7 = r19 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02cd, code lost:
    
        r7.c = gl.r0("@" + l7c.p(r13), null, "@" + r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02bb, code lost:
    
        r28 = r3;
        r29 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03c3, code lost:
    
        if (r3.contains(" " + r13) == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0563, code lost:
    
        if (r6.contains(" " + r14) == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x07a9, code lost:
    
        if (r6.contains(" " + r13) == false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x004a, code lost:
    
        if (r14.length() == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0140, code lost:
    
        if (r9.startsWith(r3) == false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x026a A[Catch: all -> 0x0826, Exception -> 0x0829, TryCatch #9 {Exception -> 0x0829, all -> 0x0826, blocks: (B:20:0x009d, B:22:0x00a5, B:25:0x00c1, B:30:0x00cb, B:32:0x00d1, B:45:0x00e7, B:47:0x00f1, B:55:0x00fc, B:57:0x0107, B:65:0x0114, B:67:0x0122, B:71:0x012f, B:92:0x01e5, B:94:0x01eb, B:97:0x01ff, B:99:0x0208, B:102:0x021a, B:104:0x0224, B:107:0x023d, B:109:0x0243, B:112:0x025a, B:116:0x026a, B:118:0x0275, B:121:0x0288, B:125:0x030a, B:127:0x02a2, B:129:0x02ae, B:132:0x02c2, B:133:0x02f6, B:136:0x02cd, B:155:0x032b, B:170:0x0393, B:173:0x03aa, B:175:0x03b0, B:261:0x04f9, B:263:0x04ff, B:267:0x0518, B:269:0x051f, B:272:0x052b, B:274:0x0533, B:277:0x054a, B:279:0x0550, B:282:0x0567, B:288:0x0572, B:290:0x0579, B:292:0x0588, B:294:0x058e, B:297:0x05a0, B:299:0x0630, B:300:0x0632, B:302:0x063e, B:305:0x0648, B:306:0x0698, B:309:0x066f, B:286:0x06a2, B:319:0x06b7, B:354:0x0735, B:356:0x073b, B:359:0x0746, B:362:0x075a, B:364:0x0761, B:367:0x076f, B:369:0x0777, B:372:0x0790, B:374:0x0796, B:377:0x07ad, B:383:0x07ba, B:385:0x07c1, B:387:0x07d0, B:390:0x07da, B:391:0x0810, B:392:0x07e6, B:381:0x0814, B:403:0x0822), top: B:19:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0349 A[Catch: all -> 0x0715, Exception -> 0x0717, TRY_ENTER, TRY_LEAVE, TryCatch #10 {Exception -> 0x0717, all -> 0x0715, blocks: (B:435:0x0046, B:14:0x0061, B:17:0x007f, B:75:0x013c, B:77:0x014b, B:80:0x016c, B:82:0x017a, B:84:0x018b, B:86:0x019c, B:91:0x01c2, B:159:0x0349, B:260:0x04d4, B:324:0x06d9, B:326:0x06e3, B:328:0x06e7, B:337:0x06fe), top: B:434:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06a2 A[Catch: all -> 0x0826, Exception -> 0x0829, LOOP:6: B:271:0x0529->B:286:0x06a2, LOOP_END, TryCatch #9 {Exception -> 0x0829, all -> 0x0826, blocks: (B:20:0x009d, B:22:0x00a5, B:25:0x00c1, B:30:0x00cb, B:32:0x00d1, B:45:0x00e7, B:47:0x00f1, B:55:0x00fc, B:57:0x0107, B:65:0x0114, B:67:0x0122, B:71:0x012f, B:92:0x01e5, B:94:0x01eb, B:97:0x01ff, B:99:0x0208, B:102:0x021a, B:104:0x0224, B:107:0x023d, B:109:0x0243, B:112:0x025a, B:116:0x026a, B:118:0x0275, B:121:0x0288, B:125:0x030a, B:127:0x02a2, B:129:0x02ae, B:132:0x02c2, B:133:0x02f6, B:136:0x02cd, B:155:0x032b, B:170:0x0393, B:173:0x03aa, B:175:0x03b0, B:261:0x04f9, B:263:0x04ff, B:267:0x0518, B:269:0x051f, B:272:0x052b, B:274:0x0533, B:277:0x054a, B:279:0x0550, B:282:0x0567, B:288:0x0572, B:290:0x0579, B:292:0x0588, B:294:0x058e, B:297:0x05a0, B:299:0x0630, B:300:0x0632, B:302:0x063e, B:305:0x0648, B:306:0x0698, B:309:0x066f, B:286:0x06a2, B:319:0x06b7, B:354:0x0735, B:356:0x073b, B:359:0x0746, B:362:0x075a, B:364:0x0761, B:367:0x076f, B:369:0x0777, B:372:0x0790, B:374:0x0796, B:377:0x07ad, B:383:0x07ba, B:385:0x07c1, B:387:0x07d0, B:390:0x07da, B:391:0x0810, B:392:0x07e6, B:381:0x0814, B:403:0x0822), top: B:19:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0572 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x06d9 A[Catch: all -> 0x0715, Exception -> 0x0717, TRY_ENTER, TryCatch #10 {Exception -> 0x0717, all -> 0x0715, blocks: (B:435:0x0046, B:14:0x0061, B:17:0x007f, B:75:0x013c, B:77:0x014b, B:80:0x016c, B:82:0x017a, B:84:0x018b, B:86:0x019c, B:91:0x01c2, B:159:0x0349, B:260:0x04d4, B:324:0x06d9, B:326:0x06e3, B:328:0x06e7, B:337:0x06fe), top: B:434:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x06fe A[Catch: all -> 0x0715, Exception -> 0x0717, TRY_ENTER, TRY_LEAVE, TryCatch #10 {Exception -> 0x0717, all -> 0x0715, blocks: (B:435:0x0046, B:14:0x0061, B:17:0x007f, B:75:0x013c, B:77:0x014b, B:80:0x016c, B:82:0x017a, B:84:0x018b, B:86:0x019c, B:91:0x01c2, B:159:0x0349, B:260:0x04d4, B:324:0x06d9, B:326:0x06e3, B:328:0x06e7, B:337:0x06fe), top: B:434:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0814 A[Catch: all -> 0x0826, Exception -> 0x0829, LOOP:10: B:366:0x076d->B:381:0x0814, LOOP_END, TryCatch #9 {Exception -> 0x0829, all -> 0x0826, blocks: (B:20:0x009d, B:22:0x00a5, B:25:0x00c1, B:30:0x00cb, B:32:0x00d1, B:45:0x00e7, B:47:0x00f1, B:55:0x00fc, B:57:0x0107, B:65:0x0114, B:67:0x0122, B:71:0x012f, B:92:0x01e5, B:94:0x01eb, B:97:0x01ff, B:99:0x0208, B:102:0x021a, B:104:0x0224, B:107:0x023d, B:109:0x0243, B:112:0x025a, B:116:0x026a, B:118:0x0275, B:121:0x0288, B:125:0x030a, B:127:0x02a2, B:129:0x02ae, B:132:0x02c2, B:133:0x02f6, B:136:0x02cd, B:155:0x032b, B:170:0x0393, B:173:0x03aa, B:175:0x03b0, B:261:0x04f9, B:263:0x04ff, B:267:0x0518, B:269:0x051f, B:272:0x052b, B:274:0x0533, B:277:0x054a, B:279:0x0550, B:282:0x0567, B:288:0x0572, B:290:0x0579, B:292:0x0588, B:294:0x058e, B:297:0x05a0, B:299:0x0630, B:300:0x0632, B:302:0x063e, B:305:0x0648, B:306:0x0698, B:309:0x066f, B:286:0x06a2, B:319:0x06b7, B:354:0x0735, B:356:0x073b, B:359:0x0746, B:362:0x075a, B:364:0x0761, B:367:0x076f, B:369:0x0777, B:372:0x0790, B:374:0x0796, B:377:0x07ad, B:383:0x07ba, B:385:0x07c1, B:387:0x07d0, B:390:0x07da, B:391:0x0810, B:392:0x07e6, B:381:0x0814, B:403:0x0822), top: B:19:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x07ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:410:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018b A[Catch: all -> 0x0715, Exception -> 0x0717, TryCatch #10 {Exception -> 0x0717, all -> 0x0715, blocks: (B:435:0x0046, B:14:0x0061, B:17:0x007f, B:75:0x013c, B:77:0x014b, B:80:0x016c, B:82:0x017a, B:84:0x018b, B:86:0x019c, B:91:0x01c2, B:159:0x0349, B:260:0x04d4, B:324:0x06d9, B:326:0x06e3, B:328:0x06e7, B:337:0x06fe), top: B:434:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019c A[Catch: all -> 0x0715, Exception -> 0x0717, TRY_LEAVE, TryCatch #10 {Exception -> 0x0717, all -> 0x0715, blocks: (B:435:0x0046, B:14:0x0061, B:17:0x007f, B:75:0x013c, B:77:0x014b, B:80:0x016c, B:82:0x017a, B:84:0x018b, B:86:0x019c, B:91:0x01c2, B:159:0x0349, B:260:0x04d4, B:324:0x06d9, B:326:0x06e3, B:328:0x06e7, B:337:0x06fe), top: B:434:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c2 A[Catch: all -> 0x0715, Exception -> 0x0717, TRY_ENTER, TRY_LEAVE, TryCatch #10 {Exception -> 0x0717, all -> 0x0715, blocks: (B:435:0x0046, B:14:0x0061, B:17:0x007f, B:75:0x013c, B:77:0x014b, B:80:0x016c, B:82:0x017a, B:84:0x018b, B:86:0x019c, B:91:0x01c2, B:159:0x0349, B:260:0x04d4, B:324:0x06d9, B:326:0x06e3, B:328:0x06e7, B:337:0x06fe), top: B:434:0x0046 }] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J0(int i, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, int i2) {
        SQLiteCursor sQLiteCursor;
        int i3;
        SQLiteCursor queryFinalized;
        String str2;
        String str3;
        int i4;
        ArrayList arrayList5;
        vf6 vf6Var;
        int i5;
        String str4;
        int i6;
        vf6 vf6Var2;
        String str5;
        int i7;
        ArrayList arrayList6;
        int i8;
        int i9;
        vf6 vf6Var3;
        int i10;
        int i11;
        TLRPC.EncryptedChat encryptedChat;
        TLRPC.User user;
        SQLiteCursor sQLiteCursor2;
        vf6 vf6Var4;
        ArrayList arrayList7;
        ?? r5;
        String str6;
        vf6 vf6Var5;
        String str7;
        int i12;
        String str8;
        int i13;
        TLRPC.User V1;
        long e = y6c.h(this.currentAccount).e();
        try {
            String lowerCase = str.trim().toLowerCase();
            if (TextUtils.isEmpty(lowerCase)) {
                return;
            }
            String lowerCase2 = k96.L0(2131745709).toLowerCase();
            String lowerCase3 = k96.L0(2131746073).toLowerCase();
            String str9 = "replies";
            String R0 = k96.D0().R0(lowerCase);
            if (!lowerCase.equals(R0)) {
                try {
                } catch (Exception e2) {
                    e = e2;
                    sQLiteCursor = null;
                    try {
                        m(e);
                        if (sQLiteCursor == null) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteCursor = null;
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
            }
            R0 = null;
            int i14 = 1 + (R0 != null ? 1 : 0);
            String[] strArr = new String[i14];
            strArr[0] = lowerCase;
            if (R0 != null) {
                strArr[1] = R0;
            }
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            ArrayList arrayList10 = new ArrayList();
            vf6 vf6Var6 = new vf6();
            SQLiteDatabase sQLiteDatabase = this.b;
            if (i2 >= 0) {
                i3 = i14;
                queryFinalized = sQLiteDatabase.queryFinalized("SELECT did, date FROM dialogs WHERE folder_id = ? ORDER BY date DESC LIMIT 600", Integer.valueOf(i2));
            } else {
                i3 = i14;
                queryFinalized = sQLiteDatabase.queryFinalized("SELECT did, date FROM dialogs ORDER BY date DESC LIMIT 600", new Object[0]);
            }
            while (true) {
                try {
                    str2 = lowerCase;
                    if (!queryFinalized.next()) {
                        break;
                    }
                    long longValue = queryFinalized.longValue(0);
                    xk3 xk3Var = new xk3();
                    String str10 = str9;
                    xk3Var.b = queryFinalized.intValue(1);
                    vf6Var6.k(xk3Var, longValue);
                    if (i != 15 || (arrayList4 != null && arrayList4.contains(Long.valueOf(longValue)))) {
                        if (cf3.B(longValue)) {
                            if (i == 0 || i == 3) {
                                int h = cf3.h(longValue);
                                if (!arrayList10.contains(Integer.valueOf(h))) {
                                    arrayList10.add(Integer.valueOf(h));
                                }
                            }
                        } else if (cf3.D(longValue)) {
                            if ((i != 4 || longValue != e) && i != 6 && i != 5 && i != 2 && !arrayList8.contains(Long.valueOf(longValue))) {
                                arrayList8.add(Long.valueOf(longValue));
                            }
                        } else if (i != 4) {
                            long j = -longValue;
                            if (!arrayList9.contains(Long.valueOf(j))) {
                                arrayList9.add(Long.valueOf(j));
                            }
                        }
                    }
                    lowerCase = str2;
                    str9 = str10;
                } catch (Exception e3) {
                    e = e3;
                    sQLiteCursor = queryFinalized;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = queryFinalized;
                }
            }
            String str11 = str9;
            queryFinalized.dispose();
            if (i != 4) {
                str3 = str2;
            } else {
                str3 = str2;
            }
            if (!"saved messages".startsWith(str3)) {
                i4 = 0;
                if ((i != 4 && lowerCase3.startsWith(str3)) || str11.startsWith(str3)) {
                    V1 = getMessagesController().V1(708513L);
                    if (V1 == null) {
                        V1 = getMessagesController().V1(1271266957L);
                    }
                    if (V1 != null) {
                        xk3 xk3Var2 = new xk3();
                        xk3Var2.b = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        xk3Var2.c = k96.L0(2131746073);
                        xk3Var2.a = V1;
                        vf6Var6.k(xk3Var2, V1.id);
                        i4++;
                    }
                }
                String str12 = ";;;";
                if (arrayList8.isEmpty()) {
                    arrayList5 = arrayList10;
                    vf6Var = vf6Var6;
                    i5 = i3;
                    str4 = ";;;";
                } else {
                    SQLiteDatabase sQLiteDatabase2 = this.b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT data, status, name FROM users WHERE uid IN(" + TextUtils.join(",", arrayList8) + ")", new Object[0]);
                    while (queryFinalized2.next()) {
                        String stringValue = queryFinalized2.stringValue(2);
                        String R02 = k96.D0().R0(stringValue);
                        if (stringValue.equals(R02)) {
                            R02 = null;
                        }
                        int lastIndexOf = stringValue.lastIndexOf(str12);
                        int i15 = i4;
                        String substring = lastIndexOf != -1 ? stringValue.substring(lastIndexOf + 3) : null;
                        int i16 = i3;
                        String str13 = str12;
                        int i17 = i16;
                        int i18 = 0;
                        boolean z = false;
                        while (true) {
                            if (i18 >= i17) {
                                arrayList7 = arrayList10;
                                break;
                            }
                            int i19 = i18;
                            String str14 = strArr[i19];
                            if (stringValue.startsWith(str14)) {
                                arrayList7 = arrayList10;
                            } else {
                                arrayList7 = arrayList10;
                                if (!stringValue.contains(" " + str14)) {
                                    if (R02 != null) {
                                        if (!R02.startsWith(str14)) {
                                        }
                                    }
                                    r5 = (substring == null || !substring.startsWith(str14)) ? z : 2;
                                    if (r5 == 0) {
                                        str6 = R02;
                                        str7 = substring;
                                        NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(0);
                                        if (byteBufferValue == null) {
                                            break;
                                        }
                                        str8 = stringValue;
                                        TLRPC.User TLdeserialize = TLRPC.User.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                        byteBufferValue.reuse();
                                        if (i != 15) {
                                            i13 = i17;
                                            break;
                                        }
                                        if (arrayList4 != null) {
                                            i13 = i17;
                                            if (arrayList4.contains(Long.valueOf(TLdeserialize.id))) {
                                                break;
                                            }
                                            i12 = i13;
                                            vf6Var5 = vf6Var6;
                                        } else {
                                            vf6Var5 = vf6Var6;
                                            i12 = i17;
                                        }
                                    } else {
                                        str6 = R02;
                                        vf6Var5 = vf6Var6;
                                        str7 = substring;
                                        i12 = i17;
                                        str8 = stringValue;
                                    }
                                    i18 = i19 + 1;
                                    R02 = str6;
                                    substring = str7;
                                    stringValue = str8;
                                    i17 = i12;
                                    vf6Var6 = vf6Var5;
                                    z = r5;
                                    arrayList10 = arrayList7;
                                }
                            }
                            r5 = 1;
                            if (r5 == 0) {
                            }
                            i18 = i19 + 1;
                            R02 = str6;
                            substring = str7;
                            stringValue = str8;
                            i17 = i12;
                            vf6Var6 = vf6Var5;
                            z = r5;
                            arrayList10 = arrayList7;
                        }
                        vf6 vf6Var7 = vf6Var6;
                        int i20 = i17;
                        i4 = i15;
                        str12 = str13;
                        arrayList10 = arrayList7;
                        i3 = i20;
                        vf6Var6 = vf6Var7;
                    }
                    arrayList5 = arrayList10;
                    vf6Var = vf6Var6;
                    int i21 = i4;
                    i5 = i3;
                    str4 = str12;
                    queryFinalized2.dispose();
                    i4 = i21;
                }
                if (arrayList9.isEmpty()) {
                    i6 = i5;
                    vf6Var2 = vf6Var;
                } else {
                    SQLiteDatabase sQLiteDatabase3 = this.b;
                    Locale locale2 = Locale.US;
                    SQLiteCursor queryFinalized3 = sQLiteDatabase3.queryFinalized("SELECT data, name FROM chats WHERE uid IN(" + TextUtils.join(",", arrayList9) + ")", new Object[0]);
                    while (queryFinalized3.next()) {
                        try {
                            String stringValue2 = queryFinalized3.stringValue(1);
                            String R03 = k96.D0().R0(stringValue2);
                            if (stringValue2.equals(R03)) {
                                R03 = null;
                            }
                            int i22 = i5;
                            int i23 = 0;
                            while (i23 < i22) {
                                String str15 = strArr[i23];
                                if (!stringValue2.startsWith(str15)) {
                                    if (!stringValue2.contains(" " + str15)) {
                                        if (R03 != null) {
                                            if (!R03.startsWith(str15)) {
                                            }
                                        }
                                        sQLiteCursor2 = queryFinalized3;
                                        try {
                                            i23++;
                                            queryFinalized3 = sQLiteCursor2;
                                        } catch (Exception e4) {
                                            e = e4;
                                            sQLiteCursor = sQLiteCursor2;
                                            m(e);
                                            if (sQLiteCursor == null) {
                                                sQLiteCursor.dispose();
                                                return;
                                            }
                                            return;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            sQLiteCursor = sQLiteCursor2;
                                            if (sQLiteCursor != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                }
                                NativeByteBuffer byteBufferValue2 = queryFinalized3.byteBufferValue(0);
                                if (byteBufferValue2 == null) {
                                    break;
                                }
                                sQLiteCursor2 = queryFinalized3;
                                TLRPC.Chat TLdeserialize2 = TLRPC.Chat.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                byteBufferValue2.reuse();
                                if ((i != 15 || (arrayList4 != null && arrayList4.contains(Long.valueOf(-TLdeserialize2.id)))) && ((i != 6 || !hc2.V(TLdeserialize2)) && (i != 5 || hc2.V(TLdeserialize2)))) {
                                    if (TLdeserialize2.monoforum) {
                                        String j2 = mm4.j(this.currentAccount, TLdeserialize2, true);
                                        if (j2 == null) {
                                            j2 = "";
                                        }
                                        String lowerCase4 = j2.toLowerCase();
                                        String R04 = k96.D0().R0(lowerCase4);
                                        if (lowerCase4.equals(R04)) {
                                            R04 = null;
                                        }
                                        if (!lowerCase4.startsWith(str15)) {
                                            if (!lowerCase4.contains(" " + str15)) {
                                                if (R04 != null) {
                                                    if (!R04.startsWith(str15)) {
                                                        if (R04.contains(" " + str15)) {
                                                        }
                                                    }
                                                }
                                                String str16 = R04;
                                                stringValue2 = lowerCase4;
                                                R03 = str16;
                                            }
                                        }
                                    }
                                    if (!TLdeserialize2.deactivated && (!hc2.T(TLdeserialize2) || !hc2.r0(TLdeserialize2))) {
                                        vf6Var4 = vf6Var;
                                        xk3 xk3Var3 = (xk3) vf6Var4.f(-TLdeserialize2.id);
                                        xk3Var3.c = gl.r0(TLdeserialize2.monoforum ? mm4.j(this.currentAccount, TLdeserialize2, false) : TLdeserialize2.title, null, str15);
                                        xk3Var3.a = TLdeserialize2;
                                        i4++;
                                        vf6Var = vf6Var4;
                                        i5 = i22;
                                        queryFinalized3 = sQLiteCursor2;
                                    }
                                    vf6Var4 = vf6Var;
                                    vf6Var = vf6Var4;
                                    i5 = i22;
                                    queryFinalized3 = sQLiteCursor2;
                                }
                                i23++;
                                queryFinalized3 = sQLiteCursor2;
                            }
                            sQLiteCursor2 = queryFinalized3;
                            vf6Var4 = vf6Var;
                            vf6Var = vf6Var4;
                            i5 = i22;
                            queryFinalized3 = sQLiteCursor2;
                        } catch (Exception e5) {
                            e = e5;
                            sQLiteCursor2 = queryFinalized3;
                        } catch (Throwable th5) {
                            th = th5;
                            sQLiteCursor2 = queryFinalized3;
                        }
                    }
                    sQLiteCursor2 = queryFinalized3;
                    i6 = i5;
                    vf6Var2 = vf6Var;
                    sQLiteCursor2.dispose();
                }
                if (!arrayList5.isEmpty() || i == 15) {
                    str5 = str4;
                    i7 = i6;
                } else {
                    SQLiteDatabase sQLiteDatabase4 = this.b;
                    Locale locale3 = Locale.US;
                    SQLiteCursor queryFinalized4 = sQLiteDatabase4.queryFinalized("SELECT q.data, u.name, q.user, q.g, q.authkey, q.ttl, u.data, u.status, q.layer, q.seq_in, q.seq_out, q.use_count, q.exchange_id, q.key_date, q.fprint, q.fauthkey, q.khash, q.in_seq_no, q.admin_id, q.mtproto_seq FROM enc_chats as q INNER JOIN users as u ON q.user = u.uid WHERE q.uid IN(" + TextUtils.join(",", arrayList5) + ")", new Object[0]);
                    while (queryFinalized4.next()) {
                        String stringValue3 = queryFinalized4.stringValue(1);
                        String R05 = k96.D0().R0(stringValue3);
                        String str17 = stringValue3.equals(R05) ? null : R05;
                        String str18 = str4;
                        int lastIndexOf2 = stringValue3.lastIndexOf(str18);
                        String substring2 = lastIndexOf2 != -1 ? stringValue3.substring(lastIndexOf2 + 2) : null;
                        int i24 = 0;
                        char c = 0;
                        while (true) {
                            if (i24 >= i6) {
                                break;
                            }
                            String str19 = strArr[i24];
                            if (!stringValue3.startsWith(str19)) {
                                if (!stringValue3.contains(" " + str19)) {
                                    if (str17 != null) {
                                        if (!str17.startsWith(str19)) {
                                        }
                                    }
                                    if (substring2 != null && substring2.startsWith(str19)) {
                                        c = 2;
                                    }
                                    if (c == 0) {
                                        NativeByteBuffer byteBufferValue3 = queryFinalized4.byteBufferValue(0);
                                        if (byteBufferValue3 != null) {
                                            encryptedChat = TLRPC.EncryptedChat.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(false), false);
                                            byteBufferValue3.reuse();
                                        } else {
                                            encryptedChat = null;
                                        }
                                        NativeByteBuffer byteBufferValue4 = queryFinalized4.byteBufferValue(6);
                                        if (byteBufferValue4 != null) {
                                            user = TLRPC.User.TLdeserialize(byteBufferValue4, byteBufferValue4.readInt32(false), false);
                                            byteBufferValue4.reuse();
                                        } else {
                                            user = null;
                                        }
                                        if (encryptedChat != null && user != null) {
                                            xk3 xk3Var4 = (xk3) vf6Var2.f(cf3.E(encryptedChat.id));
                                            int i25 = i4;
                                            i10 = i6;
                                            encryptedChat.user_id = queryFinalized4.longValue(2);
                                            encryptedChat.a_or_b = queryFinalized4.byteArrayValue(3);
                                            encryptedChat.auth_key = queryFinalized4.byteArrayValue(4);
                                            encryptedChat.ttl = queryFinalized4.intValue(5);
                                            encryptedChat.layer = queryFinalized4.intValue(8);
                                            encryptedChat.seq_in = queryFinalized4.intValue(9);
                                            encryptedChat.seq_out = queryFinalized4.intValue(10);
                                            int intValue = queryFinalized4.intValue(11);
                                            encryptedChat.key_use_count_in = (short) (intValue >> 16);
                                            encryptedChat.key_use_count_out = (short) intValue;
                                            encryptedChat.exchange_id = queryFinalized4.longValue(12);
                                            encryptedChat.key_create_date = queryFinalized4.intValue(13);
                                            encryptedChat.future_key_fingerprint = queryFinalized4.longValue(14);
                                            encryptedChat.future_auth_key = queryFinalized4.byteArrayValue(15);
                                            encryptedChat.key_hash = queryFinalized4.byteArrayValue(16);
                                            encryptedChat.in_seq_no = queryFinalized4.intValue(17);
                                            long longValue2 = queryFinalized4.longValue(18);
                                            if (longValue2 != 0) {
                                                encryptedChat.admin_id = longValue2;
                                            }
                                            encryptedChat.mtproto_seq = queryFinalized4.intValue(19);
                                            TLRPC.UserStatus userStatus = user.status;
                                            if (userStatus != null) {
                                                userStatus.expires = queryFinalized4.intValue(7);
                                            }
                                            if (c == 1) {
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qu2.n(user.first_name, user.last_name));
                                                xk3Var4.c = spannableStringBuilder;
                                                spannableStringBuilder.setSpan(new ForegroundColorSpan(bkb.u0(bkb.Y8)), 0, xk3Var4.c.length(), 33);
                                            } else {
                                                xk3Var4.c = gl.r0("@" + l7c.p(user), null, "@" + str19);
                                            }
                                            xk3Var4.a = encryptedChat;
                                            arrayList3.add(user);
                                            i11 = i25 + 1;
                                        }
                                    } else {
                                        i24++;
                                        i4 = i4;
                                    }
                                }
                            }
                            c = 1;
                            if (c == 0) {
                            }
                        }
                        i10 = i6;
                        i11 = i4;
                        i4 = i11;
                        i6 = i10;
                        str4 = str18;
                    }
                    int i26 = i4;
                    str5 = str4;
                    i7 = i6;
                    queryFinalized4.dispose();
                    i4 = i26;
                }
                arrayList6 = new ArrayList(i4);
                for (i8 = 0; i8 < vf6Var2.m(); i8++) {
                    xk3 xk3Var5 = (xk3) vf6Var2.n(i8);
                    if (xk3Var5.a != null && xk3Var5.c != null) {
                        arrayList6.add(xk3Var5);
                    }
                }
                Collections.sort(arrayList6, new el6((byte) 26));
                for (i9 = 0; i9 < arrayList6.size(); i9++) {
                    xk3 xk3Var6 = (xk3) arrayList6.get(i9);
                    arrayList.add(xk3Var6.a);
                    arrayList2.add(xk3Var6.c);
                }
                if (i == 2 || i == 15 || i == 6 || i == 5) {
                    return;
                }
                queryFinalized = this.b.queryFinalized("SELECT u.data, u.status, u.name, u.uid FROM users as u INNER JOIN contacts as c ON u.uid = c.uid", new Object[0]);
                while (queryFinalized.next()) {
                    if (vf6Var2.h(queryFinalized.longValue(3)) < 0) {
                        String stringValue4 = queryFinalized.stringValue(2);
                        String R06 = k96.D0().R0(stringValue4);
                        if (stringValue4.equals(R06)) {
                            R06 = null;
                        }
                        int lastIndexOf3 = stringValue4.lastIndexOf(str5);
                        String substring3 = lastIndexOf3 != -1 ? stringValue4.substring(lastIndexOf3 + 3) : null;
                        int i27 = i7;
                        int i28 = 0;
                        char c2 = 0;
                        while (true) {
                            if (i28 >= i27) {
                                vf6Var3 = vf6Var2;
                                break;
                            }
                            String str20 = strArr[i28];
                            if (stringValue4.startsWith(str20)) {
                                vf6Var3 = vf6Var2;
                            } else {
                                vf6Var3 = vf6Var2;
                                if (!stringValue4.contains(" " + str20)) {
                                    if (R06 != null) {
                                        if (!R06.startsWith(str20)) {
                                        }
                                    }
                                    if (substring3 != null && substring3.startsWith(str20)) {
                                        c2 = 2;
                                    }
                                    if (c2 == 0) {
                                        NativeByteBuffer byteBufferValue5 = queryFinalized.byteBufferValue(0);
                                        if (byteBufferValue5 != null) {
                                            TLRPC.User TLdeserialize3 = TLRPC.User.TLdeserialize(byteBufferValue5, byteBufferValue5.readInt32(false), false);
                                            byteBufferValue5.reuse();
                                            TLRPC.UserStatus userStatus2 = TLdeserialize3.status;
                                            if (userStatus2 != null) {
                                                userStatus2.expires = queryFinalized.intValue(1);
                                            }
                                            if (c2 == 1) {
                                                arrayList2.add(gl.r0(TLdeserialize3.first_name, TLdeserialize3.last_name, str20));
                                            } else {
                                                arrayList2.add(gl.r0("@" + l7c.p(TLdeserialize3), null, "@" + str20));
                                            }
                                            arrayList.add(TLdeserialize3);
                                        }
                                    } else {
                                        i28++;
                                        vf6Var2 = vf6Var3;
                                    }
                                }
                            }
                            c2 = 1;
                            if (c2 == 0) {
                            }
                        }
                        i7 = i27;
                        vf6Var2 = vf6Var3;
                    }
                }
                queryFinalized.dispose();
                return;
            }
            TLRPC.User f = y6c.h(this.currentAccount).f();
            xk3 xk3Var7 = new xk3();
            xk3Var7.b = ConnectionsManager.DEFAULT_DATACENTER_ID;
            xk3Var7.c = lowerCase2;
            xk3Var7.a = f;
            vf6Var6.k(xk3Var7, f.id);
            i4 = 1;
            if (i != 4) {
                V1 = getMessagesController().V1(708513L);
                if (V1 == null) {
                }
                if (V1 != null) {
                }
                String str122 = ";;;";
                if (arrayList8.isEmpty()) {
                }
                if (arrayList9.isEmpty()) {
                }
                if (arrayList5.isEmpty()) {
                }
                str5 = str4;
                i7 = i6;
                arrayList6 = new ArrayList(i4);
                while (i8 < vf6Var2.m()) {
                }
                Collections.sort(arrayList6, new el6((byte) 26));
                while (i9 < arrayList6.size()) {
                }
                if (i == 2) {
                    return;
                } else {
                    return;
                }
            }
            V1 = getMessagesController().V1(708513L);
            if (V1 == null) {
            }
            if (V1 != null) {
            }
            String str1222 = ";;;";
            if (arrayList8.isEmpty()) {
            }
            if (arrayList9.isEmpty()) {
            }
            if (arrayList5.isEmpty()) {
            }
            str5 = str4;
            i7 = i6;
            arrayList6 = new ArrayList(i4);
            while (i8 < vf6Var2.m()) {
            }
            Collections.sort(arrayList6, new el6((byte) 26));
            while (i9 < arrayList6.size()) {
            }
            if (i == 2) {
            }
        } catch (Exception e6) {
            e = e6;
            sQLiteCursor = null;
        } catch (Throwable th6) {
            th = th6;
            sQLiteCursor = null;
        }
    }

    public final void J1(long j, TLRPC.TL_chatBannedRights tL_chatBannedRights, int i) {
        if (tL_chatBannedRights == null || j == 0) {
            return;
        }
        this.a.c(new o57((Object) this, j, i, (Object) tL_chatBannedRights, (byte) 12));
    }

    public final void K(String str, ArrayList arrayList) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.b;
                Locale locale = Locale.US;
                sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM animated_emoji WHERE document_id IN (" + str + ")", new Object[0]);
                while (sQLiteCursor.next()) {
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    try {
                        TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                        if (TLdeserialize != null && TLdeserialize.id != 0) {
                            arrayList.add(TLdeserialize);
                        }
                    } catch (Exception e) {
                        n(e, true);
                    }
                    if (byteBufferValue != null) {
                        byteBufferValue.reuse();
                    }
                }
            } catch (SQLiteException e2) {
                e2.printStackTrace();
                if (sQLiteCursor == null) {
                    return;
                }
            }
            sQLiteCursor.dispose();
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public final void K0(int i, TLRPC.Message message) {
        this.a.c(new va7((Object) this, i, (Object) message, (byte) 0));
    }

    public final void K1(TLRPC.ChatFull chatFull, boolean z) {
        this.a.c(new vj6((Object) this, (Object) chatFull, z, (byte) 6));
    }

    public final void L(String str, RequestDelegate requestDelegate) {
        this.a.c(new q76((Object) this, getConnectionsManager().getCurrentTime(), (Object) str, (Object) requestDelegate, (byte) 11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0193  */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L0(String str, String str2, long j, long j2, int i, boolean z) {
        SQLitePreparedStatement sQLitePreparedStatement;
        ?? r8;
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor;
        Throwable th;
        boolean z2;
        NativeByteBuffer byteBufferValue;
        TLRPC.Message TLdeserialize;
        boolean z3;
        SQLitePreparedStatement executeFast;
        int i2 = 0;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        while (i2 < 2) {
            boolean z4 = i2 == 1;
            if (!z4) {
                try {
                    SQLiteDatabase sQLiteDatabase = getMessagesStorage().b;
                    Locale locale = Locale.ENGLISH;
                    SQLitePreparedStatement executeFast2 = sQLiteDatabase.executeFast("UPDATE " + str + " SET state = 0 WHERE message_id = ? AND dialog_id = ?");
                    executeFast2.bindInteger(1, i);
                    executeFast2.bindLong(2, j);
                    executeFast2.step();
                    executeFast2.dispose();
                    SQLiteDatabase sQLiteDatabase2 = this.b;
                    Locale locale2 = Locale.US;
                    r8 = 0;
                    queryFinalized = sQLiteDatabase2.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j + " AND mid = " + i, new Object[0]);
                } catch (SQLiteException e) {
                    e = e;
                    sQLitePreparedStatement = sQLitePreparedStatement2;
                    z2 = true;
                    sQLiteCursor = null;
                    n(e, z2);
                    if (sQLitePreparedStatement != null) {
                    }
                    if (sQLiteCursor == null) {
                    }
                }
            } else if (j2 != 0) {
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase3 = getMessagesStorage().b;
                        Locale locale3 = Locale.ENGLISH;
                        sQLitePreparedStatement = sQLiteDatabase3.executeFast("UPDATE " + str2 + " SET state = 0 WHERE message_id = ? AND dialog_id = ? AND topic_id = ? ");
                    } catch (SQLiteException e2) {
                        e = e2;
                        sQLitePreparedStatement = sQLitePreparedStatement2;
                    }
                    try {
                        try {
                            sQLitePreparedStatement.bindInteger(1, i);
                            sQLitePreparedStatement.bindLong(2, j);
                            sQLitePreparedStatement.bindLong(3, j2);
                            sQLitePreparedStatement.step();
                            sQLitePreparedStatement.dispose();
                            try {
                                try {
                                    SQLiteDatabase sQLiteDatabase4 = this.b;
                                    Locale locale4 = Locale.US;
                                    queryFinalized = sQLiteDatabase4.queryFinalized("SELECT data FROM messages_topics WHERE uid = " + j + " AND mid = " + i, new Object[0]);
                                    r8 = 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLitePreparedStatement = null;
                                    sQLiteCursor = null;
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                z2 = true;
                                sQLitePreparedStatement = null;
                                sQLiteCursor = null;
                                try {
                                    n(e, z2);
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLiteCursor == null) {
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                        z2 = true;
                        sQLiteCursor = null;
                        n(e, z2);
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor == null) {
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    sQLitePreparedStatement = sQLitePreparedStatement2;
                }
            } else {
                continue;
                i2++;
            }
            SQLiteCursor sQLiteCursor2 = queryFinalized;
            if (z) {
                try {
                    if (sQLiteCursor2.next() && (byteBufferValue = sQLiteCursor2.byteBufferValue(r8)) != 0) {
                        TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r8), r8);
                        z3 = z4;
                        TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().n);
                        byteBufferValue.reuse();
                        TLRPC.TL_messageReactions tL_messageReactions = TLdeserialize.reactions;
                        if (tL_messageReactions != null && tL_messageReactions.recent_reactions != null) {
                            for (int i3 = 0; i3 < TLdeserialize.reactions.recent_reactions.size(); i3++) {
                                TLdeserialize.reactions.recent_reactions.get(i3).unread = false;
                            }
                        }
                        sQLiteCursor2.dispose();
                        if (TLdeserialize == null) {
                            if (z3) {
                                SQLiteDatabase sQLiteDatabase5 = getMessagesStorage().b;
                                Locale locale5 = Locale.US;
                                executeFast = sQLiteDatabase5.executeFast("UPDATE messages_topics SET data = ? WHERE uid = " + j + " AND mid = " + i);
                            } else {
                                try {
                                    SQLiteDatabase sQLiteDatabase6 = getMessagesStorage().b;
                                    Locale locale6 = Locale.US;
                                    executeFast = sQLiteDatabase6.executeFast("UPDATE messages_v2 SET data = ? WHERE uid = " + j + " AND mid = " + i);
                                } catch (SQLiteException e5) {
                                    e = e5;
                                    sQLitePreparedStatement = null;
                                    z2 = true;
                                    sQLiteCursor = null;
                                    n(e, z2);
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    if (sQLiteCursor == null) {
                                        sQLiteCursor.dispose();
                                        return;
                                    }
                                    return;
                                }
                            }
                            sQLitePreparedStatement = executeFast;
                            try {
                                k27.p5(TLdeserialize);
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(TLdeserialize.getObjectSize());
                                TLdeserialize.serializeToStream(nativeByteBuffer);
                                sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                                sQLitePreparedStatement.step();
                                sQLitePreparedStatement.dispose();
                                nativeByteBuffer.reuse();
                            } catch (Exception e6) {
                                try {
                                    fa4.g(e6, true);
                                } catch (SQLiteException e7) {
                                    e = e7;
                                    z2 = true;
                                    sQLiteCursor = null;
                                    n(e, z2);
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLiteCursor == null) {
                                    }
                                }
                            }
                            sQLitePreparedStatement2 = sQLitePreparedStatement;
                        } else {
                            sQLitePreparedStatement2 = null;
                        }
                        i2++;
                    }
                } catch (SQLiteException e8) {
                    e = e8;
                    sQLiteCursor = sQLiteCursor2;
                    sQLitePreparedStatement = null;
                    z2 = true;
                    n(e, z2);
                    if (sQLitePreparedStatement != null) {
                    }
                    if (sQLiteCursor == null) {
                    }
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor = sQLiteCursor2;
                    sQLitePreparedStatement = null;
                    if (sQLitePreparedStatement != null) {
                    }
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
            }
            z3 = z4;
            TLdeserialize = null;
            sQLiteCursor2.dispose();
            if (TLdeserialize == null) {
            }
            i2++;
        }
        if (sQLitePreparedStatement2 != null) {
            sQLitePreparedStatement2.dispose();
        }
    }

    public final void L1(TLRPC.ChatParticipants chatParticipants) {
        if (chatParticipants == null) {
            return;
        }
        this.a.c(new t67(this, chatParticipants, (byte) 20));
    }

    public final int M(long j) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Integer[] numArr = {0};
        this.a.c(new m77((Object) this, j, (Object) numArr, (Object) countDownLatch, (byte) 24));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            n(e, true);
        }
        return numArr[0].intValue();
    }

    public final ArrayList M0(long j, ArrayList arrayList, boolean z, boolean z2, int i, int i2) {
        if (arrayList.isEmpty()) {
            return null;
        }
        if (!z) {
            return N0(i, i2, j, arrayList, z2);
        }
        this.a.c(new jv1(this, j, arrayList, z2, i, i2));
        return null;
    }

    public final void M1(int i) {
        gl.c3(new vb7(this, (byte) 4));
        fa4.b("MessagesStorage start db migration from " + i + " to 182");
        fa4.b("MessagesStorage db migration finished to varsion " + i83.c(this, this.b, i));
        gl.c3(new vb7(this, (byte) 5));
    }

    public final TLRPC.Chat N(long j) {
        try {
            ArrayList arrayList = new ArrayList();
            P(String.valueOf(j), arrayList);
            if (arrayList.isEmpty()) {
                return null;
            }
            return (TLRPC.Chat) arrayList.get(0);
        } catch (Exception e) {
            n(e, true);
            return null;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final java.util.ArrayList N0(int r47, int r48, long r49, java.util.ArrayList r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 4018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad7.N0(int, int, long, java.util.ArrayList, boolean):java.util.ArrayList");
    }

    public final void N1(long j, int i, boolean z, boolean z2) {
        String str = z2 ? "unread_reactions" : "unread_poll_votes";
        this.a.c(new tm3(this, z, str, j, i, str));
    }

    public final TLRPC.Chat O(long j) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        TLRPC.Chat[] chatArr = new TLRPC.Chat[1];
        this.a.c(new m77((Object) this, (Object) chatArr, j, (Object) countDownLatch, (byte) 25));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            n(e, true);
        }
        return chatArr[0];
    }

    public final void O0(LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray) {
        this.a.c(new jw6(this, longSparseIntArray, longSparseIntArray2, sparseIntArray, (byte) 9));
    }

    public final void O1(long j, long j2, ArrayList arrayList, ArrayList arrayList2) {
        H(new dt4((Object) this, j, j2, (Object) arrayList, (Object) arrayList2, (byte) 8));
    }

    public final void P(String str, ArrayList arrayList) {
        if (str == null || str.length() == 0 || arrayList == null) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = this.b;
        Locale locale = Locale.US;
        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(tb4.y("SELECT data FROM chats WHERE uid IN(", str, ")"), new Object[0]);
        ArrayList arrayList2 = null;
        while (queryFinalized.next()) {
            try {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.Chat TLdeserialize = TLRPC.Chat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false, true);
                    byteBufferValue.reuse();
                    if (TLdeserialize != null) {
                        arrayList.add(TLdeserialize);
                        if (TLdeserialize.linked_monoforum_id != 0) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(Long.valueOf(TLdeserialize.linked_monoforum_id));
                        }
                        if (TLdeserialize.linked_community_id != 0) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(Long.valueOf(TLdeserialize.linked_community_id));
                        }
                    }
                }
            } catch (Exception e) {
                n(e, true);
            }
        }
        queryFinalized.dispose();
        if (arrayList2 != null) {
            SQLiteDatabase sQLiteDatabase2 = this.b;
            Locale locale2 = Locale.US;
            SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized(tb4.y("SELECT data FROM chats WHERE uid IN(", TextUtils.join(", ", arrayList2), ")"), new Object[0]);
            while (queryFinalized2.next()) {
                try {
                    NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(0);
                    if (byteBufferValue2 != null) {
                        TLRPC.Chat TLdeserialize2 = TLRPC.Chat.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false, true);
                        byteBufferValue2.reuse();
                        if (TLdeserialize2 != null) {
                            arrayList.add(TLdeserialize2);
                        }
                    }
                } catch (Exception e2) {
                    n(e2, true);
                }
            }
            queryFinalized2.dispose();
        }
    }

    public final void P0(int i, int i2, long j, ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.a.c(new a70(i2, i, j, this, arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0492  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P1(long j, long j2, ArrayList arrayList, ArrayList arrayList2) {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteCursor sQLiteCursor;
        SQLiteDatabase sQLiteDatabase;
        boolean z;
        SQLiteDatabase sQLiteDatabase2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        SQLitePreparedStatement sQLitePreparedStatement2;
        ArrayList arrayList7;
        TLRPC.TL_messages_dialogs tL_messages_dialogs;
        SQLiteCursor sQLiteCursor2;
        ArrayList arrayList8;
        SQLiteCursor sQLiteCursor3;
        TLRPC.TL_messages_dialogs tL_messages_dialogs2;
        TLRPC.Dialog dialog;
        TLRPC.TL_dialog tL_dialog;
        SQLitePreparedStatement executeFast;
        try {
            ArrayList arrayList9 = new ArrayList();
            try {
                try {
                    if (arrayList.isEmpty()) {
                        arrayList3 = arrayList9;
                        arrayList3.add(Long.valueOf(-j2));
                    } else {
                        if (j2 != 0) {
                            arrayList9.add(Long.valueOf(-j2));
                            executeFast = this.b.executeFast("UPDATE dialogs SET (last_mid, last_mid_group) = (SELECT mid, group_id FROM messages_v2 WHERE uid = ? AND date = (SELECT MAX(date) FROM messages_v2 WHERE uid = ?)) WHERE did = ?");
                        } else {
                            if (j == 0) {
                                String join = TextUtils.join(",", arrayList);
                                SQLiteDatabase sQLiteDatabase3 = this.b;
                                Locale locale = Locale.US;
                                SQLiteCursor queryFinalized = sQLiteDatabase3.queryFinalized("SELECT did FROM dialogs WHERE last_mid IN(" + join + ") AND flags = 0", new Object[0]);
                                while (queryFinalized.next()) {
                                    try {
                                        arrayList9.add(Long.valueOf(queryFinalized.longValue(0)));
                                    } catch (Exception e) {
                                        e = e;
                                        sQLiteCursor = queryFinalized;
                                        z = true;
                                        sQLitePreparedStatement = null;
                                        try {
                                            n(e, z);
                                            sQLiteDatabase2 = this.b;
                                            if (sQLiteDatabase2 != null) {
                                            }
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement == null) {
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabase = this.b;
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.commitTransaction();
                                            }
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            if (sQLitePreparedStatement != null) {
                                                sQLitePreparedStatement.dispose();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sQLiteCursor = queryFinalized;
                                        sQLitePreparedStatement = null;
                                        sQLiteDatabase = this.b;
                                        if (sQLiteDatabase != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        throw th;
                                    }
                                }
                                queryFinalized.dispose();
                            } else {
                                arrayList9.add(Long.valueOf(j));
                            }
                            executeFast = this.b.executeFast("UPDATE dialogs SET (last_mid, last_mid_group) = (SELECT mid, group_id FROM messages_v2 WHERE uid = ? AND date = (SELECT MAX(date) FROM messages_v2 WHERE uid = ? AND date != 0)) WHERE did = ?");
                        }
                        try {
                            this.b.beginTransaction();
                            int i = 0;
                            while (i < arrayList9.size()) {
                                long longValue = ((Long) arrayList9.get(i)).longValue();
                                executeFast.requery();
                                executeFast.bindLong(1, longValue);
                                executeFast.bindLong(2, longValue);
                                executeFast.bindLong(3, longValue);
                                executeFast.step();
                                i++;
                                arrayList9 = arrayList9;
                            }
                            ArrayList arrayList10 = arrayList9;
                            executeFast.dispose();
                            this.b.commitTransaction();
                            arrayList3 = arrayList10;
                        } catch (Exception e2) {
                            e = e2;
                            sQLitePreparedStatement = executeFast;
                            z = true;
                            sQLiteCursor = null;
                            n(e, z);
                            sQLiteDatabase2 = this.b;
                            if (sQLiteDatabase2 != null) {
                            }
                            if (sQLiteCursor != null) {
                            }
                            if (sQLitePreparedStatement == null) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            sQLitePreparedStatement = executeFast;
                            sQLiteCursor = null;
                            sQLiteDatabase = this.b;
                            if (sQLiteDatabase != null) {
                            }
                            if (sQLiteCursor != null) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                            throw th;
                        }
                    }
                    if (arrayList2 != null) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            Long l = (Long) arrayList2.get(i2);
                            if (!arrayList3.contains(l)) {
                                arrayList3.add(l);
                            }
                        }
                    }
                    String join2 = TextUtils.join(",", arrayList3);
                    TLRPC.TL_messages_dialogs tL_messages_dialogs3 = new TLRPC.TL_messages_dialogs();
                    ArrayList arrayList11 = new ArrayList();
                    arrayList4 = new ArrayList();
                    arrayList5 = new ArrayList();
                    arrayList6 = new ArrayList();
                    vf6 vf6Var = new vf6();
                    SQLiteDatabase sQLiteDatabase4 = this.b;
                    Locale locale2 = Locale.US;
                    int i3 = 0;
                    SQLiteCursor queryFinalized2 = sQLiteDatabase4.queryFinalized("SELECT d.did, d.last_mid, d.unread_count, d.date, m.data, m.read_state, m.mid, m.send_state, m.date, d.pts, d.inbox_max, d.outbox_max, d.pinned, d.unread_count_i, d.flags, d.folder_id, d.data, d.unread_reactions, d.last_mid_group, d.ttl_period, d.unread_poll_votes FROM dialogs as d LEFT JOIN messages_v2 as m ON d.last_mid = m.mid AND d.did = m.uid AND d.last_mid_group IS NULL WHERE d.did IN(" + join2 + ")", new Object[0]);
                    while (queryFinalized2.next()) {
                        try {
                            ArrayList arrayList12 = arrayList11;
                            try {
                                long longValue2 = queryFinalized2.longValue(i3);
                                if (cf3.C(longValue2)) {
                                    TLRPC.TL_dialogFolder tL_dialogFolder = new TLRPC.TL_dialogFolder();
                                    tL_dialog = tL_dialogFolder;
                                    if (!queryFinalized2.isNull(16)) {
                                        NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(16);
                                        if (byteBufferValue != null) {
                                            tL_dialogFolder.folder = TLRPC.TL_folder.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                            byteBufferValue.reuse();
                                            tL_dialog = tL_dialogFolder;
                                        } else {
                                            TLRPC.TL_folder tL_folder = new TLRPC.TL_folder();
                                            tL_dialogFolder.folder = tL_folder;
                                            tL_folder.id = queryFinalized2.intValue(15);
                                            tL_dialog = tL_dialogFolder;
                                        }
                                    }
                                } else {
                                    tL_dialog = new TLRPC.TL_dialog();
                                }
                                tL_dialog.id = longValue2;
                                tL_dialog.top_message = queryFinalized2.intValue(1);
                                tL_dialog.read_inbox_max_id = queryFinalized2.intValue(10);
                                tL_dialog.read_outbox_max_id = queryFinalized2.intValue(11);
                                tL_dialog.unread_count = queryFinalized2.intValue(2);
                                tL_dialog.unread_mentions_count = queryFinalized2.intValue(13);
                                tL_dialog.last_message_date = queryFinalized2.intValue(3);
                                tL_dialog.pts = queryFinalized2.intValue(9);
                                tL_dialog.flags = j2 == 0 ? 0 : 1;
                                int intValue = queryFinalized2.intValue(12);
                                tL_dialog.pinnedNum = intValue;
                                tL_dialog.pinned = intValue != 0;
                                int intValue2 = queryFinalized2.intValue(14);
                                tL_dialog.unread_mark = (intValue2 & 1) != 0;
                                tL_dialog.view_forum_as_messages = (intValue2 & 64) != 0;
                                tL_dialog.folder_id = queryFinalized2.intValue(15);
                                tL_dialog.unread_reactions_count = queryFinalized2.intValue(17);
                                long longValue3 = queryFinalized2.longValue(18);
                                if (longValue3 != 0) {
                                    vf6Var.k(Long.valueOf(longValue3), longValue2);
                                }
                                tL_dialog.ttl_period = queryFinalized2.intValue(19);
                                tL_dialog.unread_poll_votes_count = queryFinalized2.intValue(20);
                                tL_messages_dialogs3.dialogs.add(tL_dialog);
                                NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(4);
                                if (byteBufferValue2 != null) {
                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                    TLdeserialize.readAttachPath(byteBufferValue2, getUserConfig().n);
                                    byteBufferValue2.reuse();
                                    k27.L5(queryFinalized2.intValue(5), TLdeserialize);
                                    TLdeserialize.id = queryFinalized2.intValue(6);
                                    TLdeserialize.send_state = queryFinalized2.intValue(7);
                                    int intValue3 = queryFinalized2.intValue(8);
                                    if (intValue3 != 0) {
                                        tL_dialog.last_message_date = intValue3;
                                    }
                                    TLdeserialize.dialog_id = tL_dialog.id;
                                    tL_messages_dialogs3.messages.add(TLdeserialize);
                                    d(TLdeserialize, arrayList4, arrayList5, null);
                                }
                                if (!cf3.B(longValue2) && tL_dialog.read_inbox_max_id > tL_dialog.top_message) {
                                    tL_dialog.read_inbox_max_id = 0;
                                }
                                if (cf3.B(longValue2)) {
                                    int i4 = (int) (longValue2 & 4294967295L);
                                    if (!arrayList6.contains(Integer.valueOf(i4))) {
                                        arrayList6.add(Integer.valueOf(i4));
                                    }
                                } else if (!cf3.D(longValue2)) {
                                    long j3 = -longValue2;
                                    if (!arrayList5.contains(Long.valueOf(j3))) {
                                        arrayList5.add(Long.valueOf(j3));
                                    }
                                } else if (!arrayList4.contains(Long.valueOf(longValue2))) {
                                    arrayList4.add(Long.valueOf(longValue2));
                                }
                                arrayList11 = arrayList12;
                                i3 = 0;
                            } catch (Exception e3) {
                                e = e3;
                                sQLiteCursor = queryFinalized2;
                                sQLitePreparedStatement = null;
                                z = true;
                                n(e, z);
                                sQLiteDatabase2 = this.b;
                                if (sQLiteDatabase2 != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                if (sQLitePreparedStatement == null) {
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                sQLiteCursor = queryFinalized2;
                                sQLitePreparedStatement = null;
                                sQLiteDatabase = this.b;
                                if (sQLiteDatabase != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                throw th;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            sQLitePreparedStatement2 = null;
                            sQLiteCursor = queryFinalized2;
                        } catch (Throwable th5) {
                            th = th5;
                            sQLitePreparedStatement2 = null;
                            sQLiteCursor = queryFinalized2;
                        }
                    }
                    arrayList7 = arrayList11;
                    queryFinalized2.dispose();
                    if (vf6Var.i()) {
                        tL_messages_dialogs = tL_messages_dialogs3;
                        sQLitePreparedStatement2 = null;
                        sQLiteCursor2 = null;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        int i5 = 0;
                        while (i5 < vf6Var.m()) {
                            try {
                                sb.append("uid = ");
                                sb.append(vf6Var.j(i5));
                                sb.append(" AND group_id = ");
                                sb.append(vf6Var.n(i5));
                                i5++;
                                if (i5 < vf6Var.m()) {
                                    sb.append(" OR ");
                                }
                            } catch (Exception e5) {
                                e = e5;
                                sQLitePreparedStatement = null;
                                z = true;
                                sQLiteCursor = null;
                                n(e, z);
                                sQLiteDatabase2 = this.b;
                                if (sQLiteDatabase2 != null) {
                                    sQLiteDatabase2.commitTransaction();
                                }
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                if (sQLitePreparedStatement == null) {
                                    sQLitePreparedStatement.dispose();
                                    return;
                                }
                                return;
                            }
                        }
                        SQLiteDatabase sQLiteDatabase5 = this.b;
                        Locale locale3 = Locale.US;
                        int i6 = 0;
                        SQLiteCursor queryFinalized3 = sQLiteDatabase5.queryFinalized("SELECT uid, data, read_state, mid, send_state, date, group_id FROM messages_v2 WHERE " + ((Object) sb), new Object[0]);
                        while (queryFinalized3.next()) {
                            try {
                                long longValue4 = queryFinalized3.longValue(i6);
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= tL_messages_dialogs3.dialogs.size()) {
                                        tL_messages_dialogs2 = tL_messages_dialogs3;
                                        dialog = null;
                                        break;
                                    }
                                    try {
                                        dialog = tL_messages_dialogs3.dialogs.get(i7);
                                        if (dialog != null) {
                                            tL_messages_dialogs2 = tL_messages_dialogs3;
                                            if (dialog.id == longValue4) {
                                                break;
                                            }
                                        } else {
                                            tL_messages_dialogs2 = tL_messages_dialogs3;
                                        }
                                        i7++;
                                        tL_messages_dialogs3 = tL_messages_dialogs2;
                                    } catch (Exception e6) {
                                        e = e6;
                                        sQLiteCursor = queryFinalized3;
                                        sQLitePreparedStatement = null;
                                        z = true;
                                        n(e, z);
                                        sQLiteDatabase2 = this.b;
                                        if (sQLiteDatabase2 != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        if (sQLitePreparedStatement == null) {
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        sQLiteCursor = queryFinalized3;
                                        sQLitePreparedStatement = null;
                                        sQLiteDatabase = this.b;
                                        if (sQLiteDatabase != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        throw th;
                                    }
                                }
                                if (dialog != null) {
                                    NativeByteBuffer byteBufferValue3 = queryFinalized3.byteBufferValue(1);
                                    if (byteBufferValue3 != null) {
                                        TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(false), false);
                                        TLdeserialize2.readAttachPath(byteBufferValue3, getUserConfig().n);
                                        byteBufferValue3.reuse();
                                        k27.L5(queryFinalized3.intValue(2), TLdeserialize2);
                                        TLdeserialize2.id = queryFinalized3.intValue(3);
                                        TLdeserialize2.send_state = queryFinalized3.intValue(4);
                                        int intValue4 = queryFinalized3.intValue(5);
                                        if (intValue4 != 0) {
                                            dialog.last_message_date = intValue4;
                                        }
                                        sQLiteCursor3 = queryFinalized3;
                                        try {
                                            TLdeserialize2.dialog_id = dialog.id;
                                            tL_messages_dialogs2.messages.add(TLdeserialize2);
                                            sQLitePreparedStatement2 = null;
                                            try {
                                                d(TLdeserialize2, arrayList4, arrayList5, null);
                                            } catch (Exception e7) {
                                                e = e7;
                                                sQLiteCursor = sQLiteCursor3;
                                                sQLitePreparedStatement = sQLitePreparedStatement2;
                                                z = true;
                                                n(e, z);
                                                sQLiteDatabase2 = this.b;
                                                if (sQLiteDatabase2 != null) {
                                                }
                                                if (sQLiteCursor != null) {
                                                }
                                                if (sQLitePreparedStatement == null) {
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                sQLiteCursor = sQLiteCursor3;
                                                sQLitePreparedStatement = sQLitePreparedStatement2;
                                                sQLiteDatabase = this.b;
                                                if (sQLiteDatabase != null) {
                                                }
                                                if (sQLiteCursor != null) {
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                }
                                                throw th;
                                            }
                                        } catch (Exception e8) {
                                            e = e8;
                                            sQLitePreparedStatement2 = null;
                                            sQLiteCursor = sQLiteCursor3;
                                            sQLitePreparedStatement = sQLitePreparedStatement2;
                                            z = true;
                                            n(e, z);
                                            sQLiteDatabase2 = this.b;
                                            if (sQLiteDatabase2 != null) {
                                            }
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement == null) {
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            sQLitePreparedStatement2 = null;
                                            sQLiteCursor = sQLiteCursor3;
                                            sQLitePreparedStatement = sQLitePreparedStatement2;
                                            sQLiteDatabase = this.b;
                                            if (sQLiteDatabase != null) {
                                            }
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            throw th;
                                        }
                                    } else {
                                        sQLiteCursor3 = queryFinalized3;
                                    }
                                    queryFinalized3 = sQLiteCursor3;
                                }
                                tL_messages_dialogs3 = tL_messages_dialogs2;
                                i6 = 0;
                            } catch (Exception e9) {
                                e = e9;
                                sQLiteCursor3 = queryFinalized3;
                            } catch (Throwable th9) {
                                th = th9;
                                sQLiteCursor3 = queryFinalized3;
                            }
                        }
                        sQLiteCursor3 = queryFinalized3;
                        tL_messages_dialogs = tL_messages_dialogs3;
                        sQLitePreparedStatement2 = null;
                        sQLiteCursor3.dispose();
                        sQLiteCursor2 = sQLiteCursor3;
                    }
                } catch (Exception e10) {
                    e = e10;
                    z = true;
                    sQLitePreparedStatement = null;
                }
            } catch (Throwable th10) {
                th = th10;
                sQLitePreparedStatement = null;
            }
        } catch (Exception e11) {
            e = e11;
            sQLitePreparedStatement = null;
            sQLiteCursor = null;
        } catch (Throwable th11) {
            th = th11;
            sQLitePreparedStatement = null;
            sQLiteCursor = null;
        }
        try {
            if (arrayList6.isEmpty()) {
                arrayList8 = arrayList7;
            } else {
                arrayList8 = arrayList7;
                T(TextUtils.join(",", arrayList6), arrayList8, arrayList4);
            }
            if (!arrayList5.isEmpty()) {
                P(TextUtils.join(",", arrayList5), tL_messages_dialogs.chats);
            }
            if (!arrayList4.isEmpty()) {
                k0(arrayList4, tL_messages_dialogs.users, false);
            }
            getMessagesController().g4.E(arrayList, j);
            if (!tL_messages_dialogs.dialogs.isEmpty() || !arrayList8.isEmpty()) {
                na7 messagesController = getMessagesController();
                messagesController.getClass();
                Utilities.d.c(new mn6((Object) messagesController, (Object) tL_messages_dialogs, true, (byte) (true ? 1 : 0)));
            }
            SQLiteDatabase sQLiteDatabase6 = this.b;
            if (sQLiteDatabase6 != null) {
                sQLiteDatabase6.commitTransaction();
            }
            if (sQLiteCursor2 != null) {
                sQLiteCursor2.dispose();
            }
        } catch (Exception e12) {
            e = e12;
            sQLitePreparedStatement = sQLitePreparedStatement2;
            sQLiteCursor = sQLiteCursor2;
            z = true;
            n(e, z);
            sQLiteDatabase2 = this.b;
            if (sQLiteDatabase2 != null) {
            }
            if (sQLiteCursor != null) {
            }
            if (sQLitePreparedStatement == null) {
            }
        } catch (Throwable th12) {
            th = th12;
            sQLitePreparedStatement = sQLitePreparedStatement2;
            sQLiteCursor = sQLiteCursor2;
            sQLiteDatabase = this.b;
            if (sQLiteDatabase != null) {
            }
            if (sQLiteCursor != null) {
            }
            if (sQLitePreparedStatement != null) {
            }
            throw th;
        }
    }

    public final long Q() {
        File file = this.c;
        long length = file != null ? file.length() : 0L;
        File file2 = this.e;
        return file2 != null ? file2.length() + length : length;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(int i, long j, ArrayList arrayList) {
        Throwable th;
        ad7 ad7Var;
        Exception exc;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                String join = TextUtils.join(",", arrayList);
                SQLiteDatabase sQLiteDatabase = this.b;
                Locale locale = Locale.US;
                try {
                    sQLiteDatabase.executeFast("UPDATE messages_v2 SET read_state = read_state | 2 WHERE mid IN (" + join + ") AND uid = " + j).stepThis().dispose();
                    if (i == 0) {
                        return;
                    }
                    SQLiteCursor queryFinalized = this.b.queryFinalized("SELECT mid, ttl FROM messages_v2 WHERE mid IN (" + join + ") AND uid = " + j + " AND ttl > 0", new Object[0]);
                    ArrayList arrayList2 = null;
                    while (queryFinalized.next()) {
                        try {
                            try {
                                if (arrayList2 == null) {
                                    try {
                                        arrayList2 = new ArrayList();
                                    } catch (Exception e) {
                                        exc = e;
                                        ad7Var = this;
                                        sQLiteCursor = queryFinalized;
                                        ad7Var.n(exc, true);
                                        if (sQLiteCursor != null) {
                                        }
                                    }
                                }
                                arrayList2.add(Integer.valueOf(queryFinalized.intValue(0)));
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteCursor = queryFinalized;
                                if (sQLiteCursor == null) {
                                    throw th;
                                }
                                sQLiteCursor.dispose();
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            ad7Var = this;
                        }
                    }
                    if (arrayList2 != null) {
                        try {
                            ad7Var = this;
                            try {
                                this.a.c(new jc7(ad7Var, arrayList2, j, (byte) 2));
                            } catch (Exception e3) {
                                e = e3;
                                exc = e;
                                sQLiteCursor = queryFinalized;
                                ad7Var.n(exc, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            ad7Var = this;
                        }
                    } else {
                        ad7Var = this;
                    }
                    try {
                        queryFinalized.dispose();
                    } catch (Exception e5) {
                        e = e5;
                        exc = e;
                        sQLiteCursor = queryFinalized;
                        ad7Var.n(exc, true);
                        if (sQLiteCursor != null) {
                        }
                    }
                } catch (Exception e6) {
                    ad7Var = this;
                    exc = e6;
                }
            } catch (Exception e7) {
                ad7Var = this;
                exc = e7;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void Q1(LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, vf6 vf6Var, LongSparseIntArray longSparseIntArray3) {
        if (q0(longSparseIntArray) && q0(longSparseIntArray2) && p0(vf6Var) && q0(longSparseIntArray3)) {
            return;
        }
        this.a.c(new vz4((Object) this, (Object) longSparseIntArray, (Object) longSparseIntArray2, (Object) vf6Var, (Object) longSparseIntArray3, (byte) 25));
    }

    public final int R(long j) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                if (this.K.f(j) == null) {
                    sQLiteCursor = this.b.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j));
                    r4 = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : -1;
                    sQLiteCursor.dispose();
                }
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                return r4;
            } catch (Exception e) {
                n(e, true);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                return 0;
            }
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public final void R0(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        gl.c3(new i41(this, arrayList, (byte) 9));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0401 A[Catch: Exception -> 0x0415, TRY_LEAVE, TryCatch #1 {Exception -> 0x0415, blocks: (B:3:0x000d, B:32:0x030f, B:34:0x0315, B:38:0x03f1, B:40:0x0401, B:45:0x0320, B:47:0x032d, B:48:0x033b, B:50:0x0341, B:52:0x034d, B:53:0x0383, B:55:0x039c, B:56:0x0351, B:58:0x0375, B:59:0x037b, B:61:0x0380, B:62:0x0387, B:66:0x03a0, B:67:0x03ad, B:69:0x03b3, B:70:0x03bc, B:72:0x03c2, B:74:0x03cc, B:76:0x03e5, B:77:0x03d3, B:80:0x03e7, B:81:0x03ea, B:88:0x007e, B:91:0x0085, B:93:0x008b, B:97:0x00a1, B:98:0x0175, B:100:0x0195, B:101:0x019b, B:103:0x01da, B:105:0x01eb, B:111:0x00c3, B:112:0x00e7, B:116:0x00ef, B:118:0x00f6, B:120:0x0124, B:121:0x015b, B:122:0x0145, B:123:0x015f, B:125:0x0099, B:127:0x01f3, B:129:0x01fd, B:131:0x0204, B:132:0x023a, B:134:0x0240, B:136:0x0259, B:138:0x025f, B:140:0x0265, B:142:0x026c, B:144:0x028c, B:145:0x0293, B:149:0x02a2, B:147:0x02ac, B:155:0x02b5, B:159:0x02c3, B:161:0x02cd, B:163:0x02d4, B:168:0x02da, B:171:0x02e1, B:173:0x02e7), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0414 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x032d A[Catch: Exception -> 0x0415, TryCatch #1 {Exception -> 0x0415, blocks: (B:3:0x000d, B:32:0x030f, B:34:0x0315, B:38:0x03f1, B:40:0x0401, B:45:0x0320, B:47:0x032d, B:48:0x033b, B:50:0x0341, B:52:0x034d, B:53:0x0383, B:55:0x039c, B:56:0x0351, B:58:0x0375, B:59:0x037b, B:61:0x0380, B:62:0x0387, B:66:0x03a0, B:67:0x03ad, B:69:0x03b3, B:70:0x03bc, B:72:0x03c2, B:74:0x03cc, B:76:0x03e5, B:77:0x03d3, B:80:0x03e7, B:81:0x03ea, B:88:0x007e, B:91:0x0085, B:93:0x008b, B:97:0x00a1, B:98:0x0175, B:100:0x0195, B:101:0x019b, B:103:0x01da, B:105:0x01eb, B:111:0x00c3, B:112:0x00e7, B:116:0x00ef, B:118:0x00f6, B:120:0x0124, B:121:0x015b, B:122:0x0145, B:123:0x015f, B:125:0x0099, B:127:0x01f3, B:129:0x01fd, B:131:0x0204, B:132:0x023a, B:134:0x0240, B:136:0x0259, B:138:0x025f, B:140:0x0265, B:142:0x026c, B:144:0x028c, B:145:0x0293, B:149:0x02a2, B:147:0x02ac, B:155:0x02b5, B:159:0x02c3, B:161:0x02cd, B:163:0x02d4, B:168:0x02da, B:171:0x02e1, B:173:0x02e7), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03b3 A[Catch: Exception -> 0x0415, TryCatch #1 {Exception -> 0x0415, blocks: (B:3:0x000d, B:32:0x030f, B:34:0x0315, B:38:0x03f1, B:40:0x0401, B:45:0x0320, B:47:0x032d, B:48:0x033b, B:50:0x0341, B:52:0x034d, B:53:0x0383, B:55:0x039c, B:56:0x0351, B:58:0x0375, B:59:0x037b, B:61:0x0380, B:62:0x0387, B:66:0x03a0, B:67:0x03ad, B:69:0x03b3, B:70:0x03bc, B:72:0x03c2, B:74:0x03cc, B:76:0x03e5, B:77:0x03d3, B:80:0x03e7, B:81:0x03ea, B:88:0x007e, B:91:0x0085, B:93:0x008b, B:97:0x00a1, B:98:0x0175, B:100:0x0195, B:101:0x019b, B:103:0x01da, B:105:0x01eb, B:111:0x00c3, B:112:0x00e7, B:116:0x00ef, B:118:0x00f6, B:120:0x0124, B:121:0x015b, B:122:0x0145, B:123:0x015f, B:125:0x0099, B:127:0x01f3, B:129:0x01fd, B:131:0x0204, B:132:0x023a, B:134:0x0240, B:136:0x0259, B:138:0x025f, B:140:0x0265, B:142:0x026c, B:144:0x028c, B:145:0x0293, B:149:0x02a2, B:147:0x02ac, B:155:0x02b5, B:159:0x02c3, B:161:0x02cd, B:163:0x02d4, B:168:0x02da, B:171:0x02e1, B:173:0x02e7), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x007e A[Catch: Exception -> 0x0415, TRY_ENTER, TryCatch #1 {Exception -> 0x0415, blocks: (B:3:0x000d, B:32:0x030f, B:34:0x0315, B:38:0x03f1, B:40:0x0401, B:45:0x0320, B:47:0x032d, B:48:0x033b, B:50:0x0341, B:52:0x034d, B:53:0x0383, B:55:0x039c, B:56:0x0351, B:58:0x0375, B:59:0x037b, B:61:0x0380, B:62:0x0387, B:66:0x03a0, B:67:0x03ad, B:69:0x03b3, B:70:0x03bc, B:72:0x03c2, B:74:0x03cc, B:76:0x03e5, B:77:0x03d3, B:80:0x03e7, B:81:0x03ea, B:88:0x007e, B:91:0x0085, B:93:0x008b, B:97:0x00a1, B:98:0x0175, B:100:0x0195, B:101:0x019b, B:103:0x01da, B:105:0x01eb, B:111:0x00c3, B:112:0x00e7, B:116:0x00ef, B:118:0x00f6, B:120:0x0124, B:121:0x015b, B:122:0x0145, B:123:0x015f, B:125:0x0099, B:127:0x01f3, B:129:0x01fd, B:131:0x0204, B:132:0x023a, B:134:0x0240, B:136:0x0259, B:138:0x025f, B:140:0x0265, B:142:0x026c, B:144:0x028c, B:145:0x0293, B:149:0x02a2, B:147:0x02ac, B:155:0x02b5, B:159:0x02c3, B:161:0x02cd, B:163:0x02d4, B:168:0x02da, B:171:0x02e1, B:173:0x02e7), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[Catch: Exception -> 0x007c, TRY_ENTER, TryCatch #0 {Exception -> 0x007c, blocks: (B:176:0x001f, B:9:0x002d, B:10:0x004c, B:12:0x0052, B:15:0x0058, B:18:0x005e, B:25:0x0068, B:21:0x006c, B:30:0x0072), top: B:175:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R1(ArrayList arrayList, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, vf6 vf6Var, LongSparseIntArray longSparseIntArray3) {
        boolean z;
        boolean z2;
        LongSparseIntArray longSparseIntArray4;
        int i;
        LongSparseIntArray longSparseIntArray5;
        String str;
        LongSparseIntArray longSparseIntArray6;
        int i2;
        int i3;
        int i4;
        try {
            LongSparseIntArray longSparseIntArray7 = new LongSparseIntArray();
            LongSparseIntArray longSparseIntArray8 = new LongSparseIntArray();
            ArrayList arrayList2 = new ArrayList();
            int i5 = 0;
            if (arrayList != null) {
                try {
                    if (!arrayList.isEmpty()) {
                        z2 = false;
                        String str2 = ",";
                        if (z2) {
                            String join = TextUtils.join(",", arrayList);
                            SQLiteDatabase sQLiteDatabase = this.b;
                            Locale locale = Locale.US;
                            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT uid, read_state, out FROM messages_v2 WHERE mid IN(" + join + ") AND is_channel = 0", new Object[0]);
                            while (queryFinalized.next()) {
                                if (queryFinalized.intValue(2) == 0 && queryFinalized.intValue(1) == 0) {
                                    long longValue = queryFinalized.longValue(0);
                                    int i6 = longSparseIntArray7.get(longValue);
                                    if (i6 == 0) {
                                        longSparseIntArray7.put(longValue, 1);
                                    } else {
                                        longSparseIntArray7.put(longValue, i6 + 1);
                                    }
                                }
                            }
                            queryFinalized.dispose();
                            longSparseIntArray4 = longSparseIntArray7;
                        } else {
                            if (!q0(longSparseIntArray)) {
                                int i7 = 0;
                                while (i7 < longSparseIntArray.size()) {
                                    String str3 = str2;
                                    long keyAt = longSparseIntArray.keyAt(i7);
                                    int i8 = longSparseIntArray.get(keyAt);
                                    int i9 = longSparseIntArray3 == null ? -2 : longSparseIntArray3.get(keyAt, -2);
                                    if (i9 >= 0) {
                                        longSparseIntArray7.put(keyAt, i9);
                                        boolean z3 = w01.a;
                                        fa4.b(keyAt + " update unread messages count by still unread " + i9);
                                    } else {
                                        if (longSparseIntArray3 == null || i9 == -2) {
                                            i = 1;
                                        } else {
                                            SQLiteDatabase sQLiteDatabase2 = this.b;
                                            Locale locale2 = Locale.US;
                                            SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT start, end FROM messages_holes WHERE uid = " + keyAt + " AND end > " + i8, new Object[i5]);
                                            i = 1;
                                            while (queryFinalized2.next()) {
                                                i = i5;
                                            }
                                            queryFinalized2.dispose();
                                        }
                                        if (i != 0) {
                                            SQLiteDatabase sQLiteDatabase3 = this.b;
                                            Locale locale3 = Locale.US;
                                            SQLiteCursor queryFinalized3 = sQLiteDatabase3.queryFinalized("SELECT COUNT(mid) FROM messages_v2 WHERE uid = " + keyAt + " AND mid > " + i8 + " AND read_state IN(0,2) AND out = 0", new Object[i5]);
                                            if (queryFinalized3.next()) {
                                                int intValue = queryFinalized3.intValue(i5);
                                                longSparseIntArray7.put(keyAt, intValue);
                                                boolean z4 = w01.a;
                                                fa4.b(keyAt + " update unread messages count " + intValue);
                                            } else {
                                                boolean z5 = w01.a;
                                                fa4.b(keyAt + " can't update unread messages count cursor trouble");
                                            }
                                            queryFinalized3.dispose();
                                        } else {
                                            boolean z6 = w01.a;
                                            fa4.b(keyAt + " can't update unread messages count");
                                        }
                                    }
                                    SQLiteCursor queryFinalized4 = this.b.queryFinalized("SELECT inbox_max FROM dialogs WHERE did = " + keyAt, new Object[0]);
                                    int intValue2 = queryFinalized4.next() ? queryFinalized4.intValue(0) : 0;
                                    queryFinalized4.dispose();
                                    fa4.b(keyAt + " set inbox max " + i8);
                                    SQLitePreparedStatement executeFast = this.b.executeFast("UPDATE dialogs SET inbox_max = max((SELECT inbox_max FROM dialogs WHERE did = ?), ?) WHERE did = ?");
                                    executeFast.requery();
                                    executeFast.bindLong(1, keyAt);
                                    executeFast.bindInteger(2, i8);
                                    executeFast.bindLong(3, keyAt);
                                    executeFast.step();
                                    executeFast.dispose();
                                    if (r0(14, keyAt)) {
                                        longSparseIntArray5 = longSparseIntArray7;
                                        str = str3;
                                        d2(keyAt, intValue2, i8);
                                    } else {
                                        longSparseIntArray5 = longSparseIntArray7;
                                        str = str3;
                                    }
                                    i7++;
                                    str2 = str;
                                    longSparseIntArray7 = longSparseIntArray5;
                                    i5 = 0;
                                }
                            }
                            longSparseIntArray4 = longSparseIntArray7;
                            int i10 = 3;
                            String str4 = str2;
                            if (!p0(vf6Var)) {
                                int m = vf6Var.m();
                                int i11 = 0;
                                while (i11 < m) {
                                    ArrayList arrayList3 = (ArrayList) vf6Var.n(i11);
                                    ArrayList arrayList4 = new ArrayList(arrayList3);
                                    String join2 = TextUtils.join(str4, arrayList3);
                                    SQLiteDatabase sQLiteDatabase4 = this.b;
                                    Locale locale4 = Locale.US;
                                    int i12 = 0;
                                    SQLiteCursor queryFinalized5 = sQLiteDatabase4.queryFinalized("SELECT uid, read_state, out, mention, mid, is_channel FROM messages_v2 WHERE mid IN(" + join2 + ")", new Object[0]);
                                    long j = 0;
                                    while (queryFinalized5.next()) {
                                        String str5 = str4;
                                        long longValue2 = queryFinalized5.longValue(i12);
                                        arrayList4.remove(Integer.valueOf(queryFinalized5.intValue(4)));
                                        if (queryFinalized5.intValue(1) < 2 && queryFinalized5.intValue(2) == 0 && queryFinalized5.intValue(i10) == 1) {
                                            int i13 = longSparseIntArray8.get(longValue2, -1);
                                            if (i13 < 0) {
                                                SQLiteCursor queryFinalized6 = this.b.queryFinalized("SELECT unread_count_i FROM dialogs WHERE did = " + longValue2, new Object[0]);
                                                int intValue3 = queryFinalized6.next() ? queryFinalized6.intValue(0) : 0;
                                                queryFinalized6.dispose();
                                                longSparseIntArray8.put(longValue2, Math.max(0, intValue3 - 1));
                                            } else {
                                                longSparseIntArray8.put(longValue2, Math.max(0, i13 - 1));
                                            }
                                        }
                                        j = queryFinalized5.longValue(5);
                                        str4 = str5;
                                        i12 = 0;
                                        i10 = 3;
                                    }
                                    String str6 = str4;
                                    queryFinalized5.dispose();
                                    if (!arrayList4.isEmpty() && j != 0 && !arrayList2.contains(Long.valueOf(j))) {
                                        arrayList2.add(Long.valueOf(j));
                                    }
                                    i11++;
                                    str4 = str6;
                                    i10 = 3;
                                }
                            }
                            if (!q0(longSparseIntArray2)) {
                                for (int i14 = 0; i14 < longSparseIntArray2.size(); i14++) {
                                    long keyAt2 = longSparseIntArray2.keyAt(i14);
                                    int i15 = longSparseIntArray2.get(keyAt2);
                                    SQLitePreparedStatement executeFast2 = this.b.executeFast("UPDATE dialogs SET outbox_max = max((SELECT outbox_max FROM dialogs WHERE did = ?), ?) WHERE did = ?");
                                    executeFast2.requery();
                                    executeFast2.bindLong(1, keyAt2);
                                    executeFast2.bindInteger(2, i15);
                                    executeFast2.bindLong(3, keyAt2);
                                    executeFast2.step();
                                    executeFast2.dispose();
                                }
                            }
                        }
                        if (longSparseIntArray4.size() <= 0 || longSparseIntArray8.size() > 0) {
                            this.b.beginTransaction();
                            if (longSparseIntArray4.size() <= 0) {
                                ArrayList arrayList5 = new ArrayList();
                                SQLitePreparedStatement executeFast3 = this.b.executeFast("UPDATE dialogs SET unread_count = ? WHERE did = ?");
                                int i16 = 0;
                                while (i16 < longSparseIntArray4.size()) {
                                    LongSparseIntArray longSparseIntArray9 = longSparseIntArray4;
                                    long keyAt3 = longSparseIntArray9.keyAt(i16);
                                    if (r0(13, keyAt3)) {
                                        longSparseIntArray9.removeAt(i16);
                                    } else {
                                        int valueAt = longSparseIntArray9.valueAt(i16);
                                        SQLiteCursor queryFinalized7 = this.b.queryFinalized("SELECT unread_count FROM dialogs WHERE did = " + keyAt3, new Object[0]);
                                        int intValue4 = queryFinalized7.next() ? queryFinalized7.intValue(0) : 0;
                                        queryFinalized7.dispose();
                                        if (intValue4 == valueAt) {
                                            longSparseIntArray9.removeAt(i16);
                                        } else {
                                            executeFast3.requery();
                                            i4 = 1;
                                            executeFast3.bindInteger(1, valueAt);
                                            executeFast3.bindLong(2, keyAt3);
                                            executeFast3.step();
                                            arrayList5.add(Long.valueOf(keyAt3));
                                            i16 += i4;
                                            longSparseIntArray4 = longSparseIntArray9;
                                        }
                                    }
                                    i16--;
                                    i4 = 1;
                                    i16 += i4;
                                    longSparseIntArray4 = longSparseIntArray9;
                                }
                                longSparseIntArray6 = longSparseIntArray4;
                                i2 = 0;
                                executeFast3.dispose();
                                i2(arrayList5);
                            } else {
                                longSparseIntArray6 = longSparseIntArray4;
                                i2 = 0;
                            }
                            if (longSparseIntArray8.size() > 0) {
                                SQLitePreparedStatement executeFast4 = this.b.executeFast("UPDATE dialogs SET unread_count_i = ? WHERE did = ?");
                                int i17 = i2;
                                while (i17 < longSparseIntArray8.size()) {
                                    long keyAt4 = longSparseIntArray8.keyAt(i17);
                                    if (r0(13, keyAt4)) {
                                        longSparseIntArray8.removeAt(i17);
                                        i17--;
                                        i3 = 1;
                                    } else {
                                        executeFast4.requery();
                                        i3 = 1;
                                        executeFast4.bindInteger(1, longSparseIntArray8.valueAt(i17));
                                        executeFast4.bindLong(2, keyAt4);
                                        executeFast4.step();
                                    }
                                    i17 += i3;
                                }
                                executeFast4.dispose();
                            }
                            this.b.commitTransaction();
                        } else {
                            longSparseIntArray6 = longSparseIntArray4;
                        }
                        T1(longSparseIntArray6, longSparseIntArray8, true);
                        getMessagesController().K3(longSparseIntArray6, longSparseIntArray8);
                        if (arrayList2.isEmpty()) {
                            na7 messagesController = getMessagesController();
                            messagesController.getClass();
                            gl.c3(new f57(messagesController, arrayList2, (byte) 5));
                            return;
                        }
                        return;
                    }
                } catch (Exception e) {
                    e = e;
                    z = true;
                    n(e, z);
                    return;
                }
            }
            z2 = true;
            String str22 = ",";
            if (z2) {
            }
            if (longSparseIntArray4.size() <= 0) {
            }
            this.b.beginTransaction();
            if (longSparseIntArray4.size() <= 0) {
            }
            if (longSparseIntArray8.size() > 0) {
            }
            this.b.commitTransaction();
            T1(longSparseIntArray6, longSparseIntArray8, true);
            getMessagesController().K3(longSparseIntArray6, longSparseIntArray8);
            if (arrayList2.isEmpty()) {
            }
        } catch (Exception e2) {
            e = e2;
            z = true;
        }
    }

    public final int S(long j, boolean z) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Integer[] numArr = {0};
        this.a.c(new fe2(this, z, j, numArr, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            n(e, true);
        }
        return numArr[0].intValue();
    }

    public final void S0(int i) {
        if (!gi7.a) {
            int i2 = 0;
            while (!gi7.a) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i2++;
                if (i2 > 5) {
                    break;
                }
            }
        }
        File h = a.h();
        if (this.currentAccount != 0) {
            File file = new File(h, de9.l(new StringBuilder("account"), this.currentAccount, "/"));
            file.mkdirs();
            h = file;
        }
        this.c = new File(h, "cache4.db");
        this.d = new File(h, "cache4.db-wal");
        this.e = new File(h, "cache4.db-shm");
        this.P = false;
        boolean exists = this.c.exists();
        byte b = 2;
        try {
            SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(this.c.getPath());
            this.b = sQLiteDatabase;
            sQLiteDatabase.executeFast("PRAGMA secure_delete = ON").stepThis().dispose();
            this.b.executeFast("PRAGMA temp_store = MEMORY").stepThis().dispose();
            this.b.executeFast("PRAGMA journal_mode = WAL").stepThis().dispose();
            this.b.executeFast("PRAGMA journal_size_limit = 10485760").stepThis().dispose();
            if (exists) {
                int intValue = this.b.executeInt("PRAGMA user_version", new Object[0]).intValue();
                if (w01.a) {
                    fa4.b("current db version = " + intValue);
                }
                if (intValue == 0) {
                    throw new Exception("malformed");
                }
                try {
                    SQLiteCursor queryFinalized = this.b.queryFinalized("SELECT seq, pts, date, qts, lsv, sg, pbytes FROM params WHERE id = 1", new Object[0]);
                    if (queryFinalized.next()) {
                        this.w = queryFinalized.intValue(0);
                        this.r = queryFinalized.intValue(1);
                        this.n = queryFinalized.intValue(2);
                        this.s = queryFinalized.intValue(3);
                        this.x = queryFinalized.intValue(4);
                        this.E = queryFinalized.intValue(5);
                        if (queryFinalized.isNull(6)) {
                            this.y = null;
                        } else {
                            byte[] byteArrayValue = queryFinalized.byteArrayValue(6);
                            this.y = byteArrayValue;
                            if (byteArrayValue != null && byteArrayValue.length == 1) {
                                this.y = null;
                            }
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    if (e2.getMessage() != null && e2.getMessage().contains("malformed")) {
                        throw new RuntimeException("malformed");
                    }
                    try {
                        this.b.executeFast("CREATE TABLE IF NOT EXISTS params(id INTEGER PRIMARY KEY, seq INTEGER, pts INTEGER, date INTEGER, qts INTEGER, lsv INTEGER, sg INTEGER, pbytes BLOB)").stepThis().dispose();
                        this.b.executeFast("INSERT INTO params VALUES(1, 0, 0, 0, 0, 0, 0, NULL)").stepThis().dispose();
                    } catch (Exception e3) {
                        fa4.g(e3, true);
                    }
                }
                if (intValue < 182) {
                    try {
                        M1(intValue);
                    } catch (Exception e4) {
                        boolean z = w01.a;
                        fa4.g(e4, true);
                        throw new RuntimeException("malformed");
                    }
                }
            } else {
                if (w01.a) {
                    fa4.b("create new database");
                }
                z(this.b);
            }
            this.P = true;
        } catch (Exception e5) {
            fa4.g(e5, true);
            if (i < 3 && e5.getMessage() != null && e5.getMessage().contains("malformed")) {
                if (i == 2) {
                    o(true);
                    r();
                } else {
                    o(false);
                }
                S0(i == 1 ? (byte) 2 : (byte) 3);
                return;
            }
        }
        gl.c3(new vb7(this, b));
        this.a.c(new vb7(this, (byte) 27));
        this.a.c(new vb7(this, (byte) 21));
        this.a.c(new vb7(this, (byte) 28));
        try {
            this.Q.countDown();
        } catch (Throwable unused) {
        }
        gl.c3(new vb7(this, r5));
    }

    public final void S1(TLRPC.EncryptedChat encryptedChat) {
        if (encryptedChat == null) {
            return;
        }
        this.a.c(new fb7(this, encryptedChat, (byte) 1));
    }

    public final void T(String str, ArrayList arrayList, ArrayList arrayList2) {
        if (str == null || str.length() == 0) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = this.b;
        Locale locale = Locale.US;
        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(tb4.y("SELECT data, user, g, authkey, ttl, layer, seq_in, seq_out, use_count, exchange_id, key_date, fprint, fauthkey, khash, in_seq_no, admin_id, mtproto_seq FROM enc_chats WHERE uid IN(", str, ")"), new Object[0]);
        while (queryFinalized.next()) {
            try {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.EncryptedChat TLdeserialize = TLRPC.EncryptedChat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    byteBufferValue.reuse();
                    if (TLdeserialize != null) {
                        long longValue = queryFinalized.longValue(1);
                        TLdeserialize.user_id = longValue;
                        if (arrayList2 != null && !arrayList2.contains(Long.valueOf(longValue))) {
                            arrayList2.add(Long.valueOf(TLdeserialize.user_id));
                        }
                        TLdeserialize.a_or_b = queryFinalized.byteArrayValue(2);
                        TLdeserialize.auth_key = queryFinalized.byteArrayValue(3);
                        TLdeserialize.ttl = queryFinalized.intValue(4);
                        TLdeserialize.layer = queryFinalized.intValue(5);
                        TLdeserialize.seq_in = queryFinalized.intValue(6);
                        TLdeserialize.seq_out = queryFinalized.intValue(7);
                        int intValue = queryFinalized.intValue(8);
                        TLdeserialize.key_use_count_in = (short) (intValue >> 16);
                        TLdeserialize.key_use_count_out = (short) intValue;
                        TLdeserialize.exchange_id = queryFinalized.longValue(9);
                        TLdeserialize.key_create_date = queryFinalized.intValue(10);
                        TLdeserialize.future_key_fingerprint = queryFinalized.longValue(11);
                        TLdeserialize.future_auth_key = queryFinalized.byteArrayValue(12);
                        TLdeserialize.key_hash = queryFinalized.byteArrayValue(13);
                        TLdeserialize.in_seq_no = queryFinalized.intValue(14);
                        long longValue2 = queryFinalized.longValue(15);
                        if (longValue2 != 0) {
                            TLdeserialize.admin_id = longValue2;
                        }
                        TLdeserialize.mtproto_seq = queryFinalized.intValue(16);
                        arrayList.add(TLdeserialize);
                    }
                }
            } catch (Exception e) {
                n(e, true);
            }
        }
        queryFinalized.dispose();
    }

    public final void T0(ArrayList arrayList, j57 j57Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        H(new lo6((Object) this, (Object) arrayList, (Object) j57Var, (byte) 24));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r21v10 int, still in use, count: 2, list:
          (r21v10 int) from 0x0661: IF  (r21v10 int) == (0 int)  -> B:357:0x06a5 A[HIDDEN]
          (r21v10 int) from 0x0654: PHI (r21v11 int) = (r21v10 int) binds: [B:356:0x0661] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0b02  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0b09  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x0a41  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0aa4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T1(org.telegram.messenger.support.LongSparseIntArray r31, org.telegram.messenger.support.LongSparseIntArray r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 2857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad7.T1(org.telegram.messenger.support.LongSparseIntArray, org.telegram.messenger.support.LongSparseIntArray, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TL_ephemeral.EphemeralMessage U(int i, long j) {
        SQLiteCursor sQLiteCursor;
        SQLiteDatabase sQLiteDatabase;
        NativeByteBuffer byteBufferValue;
        SQLiteCursor sQLiteCursor2 = null;
        r1 = null;
        TL_ephemeral.EphemeralMessage ephemeralMessage = null;
        try {
            try {
                sQLiteDatabase = this.b;
                Locale locale = Locale.US;
            } catch (Throwable th) {
                th = th;
                if (sQLiteCursor2 != null) {
                }
                throw th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM ephemeral_messages WHERE dialog_id = " + j + " AND id = " + i, new Object[0]);
            try {
                try {
                    if (sQLiteCursor.next() && (byteBufferValue = sQLiteCursor.byteBufferValue(0)) != null) {
                        TL_ephemeral.EphemeralMessage TLdeserialize = TL_ephemeral.EphemeralMessage.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                        ephemeralMessage = TLdeserialize;
                    }
                    sQLiteCursor.dispose();
                    return ephemeralMessage;
                } catch (Exception e2) {
                    e = e2;
                    n(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                sQLiteCursor2 = sQLiteCursor;
                if (sQLiteCursor2 != null) {
                    sQLiteCursor2.dispose();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            sQLiteCursor = null;
            n(e, true);
            if (sQLiteCursor != null) {
            }
            return null;
        }
    }

    public final void U0(ArrayList arrayList, i57 i57Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        H(new pc7((Object) this, (Object) arrayList, (Object) i57Var, (byte) 1));
    }

    public final void U1(long j, TLRPC.Message message) {
        this.a.c(new go6((Object) this, (Object) message, j, (byte) 15));
    }

    public final ArrayList V(long j, long j2) {
        ArrayList arrayList = new ArrayList();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = this.b.queryFinalized("SELECT data FROM ephemeral_messages WHERE dialog_id = ? AND topic_id = ? AND date >= ? ORDER BY date DESC LIMIT 30", Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(getConnectionsManager().getCurrentTime() - 172800));
                while (sQLiteCursor.next()) {
                    TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) sQLiteCursor.tlObjectValue(0, new yw6((byte) 26), false);
                    if (ephemeralMessage != null && ephemeralMessage.anchor_msg_id == 0) {
                        arrayList.add(ephemeralMessage);
                    }
                }
                sQLiteCursor.dispose();
                return arrayList;
            } catch (Exception e) {
                n(e, true);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                return arrayList;
            }
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public final void V0(TLRPC.TL_messages_dialogs tL_messages_dialogs, TLRPC.TL_messages_dialogs tL_messages_dialogs2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SparseArray sparseArray, ArrayList arrayList4, HashMap hashMap, HashSet hashSet, Runnable runnable) {
        j1(arrayList, arrayList2, true, false);
        int size = sparseArray.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            B((t97) sparseArray.valueAt(i));
            i++;
            z = true;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            t97 t97Var = (t97) this.J.get(((Integer) it.next()).intValue());
            if (t97Var != null) {
                t97Var.e = -1;
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            t97 t97Var2 = (t97) this.J.get(((Integer) entry.getKey()).intValue());
            if (t97Var2 != null) {
                Iterator it2 = ((HashSet) entry.getValue()).iterator();
                while (it2.hasNext()) {
                    t97Var2.j.delete(((Long) it2.next()).longValue());
                }
                z = true;
            }
        }
        int size2 = arrayList3.size();
        int i2 = 0;
        while (i2 < size2) {
            u1((t97) arrayList3.get(i2), false);
            i2++;
            z = true;
        }
        int size3 = this.I.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < size3; i3++) {
            t97 t97Var3 = (t97) this.I.get(i3);
            int indexOf = arrayList4.indexOf(Integer.valueOf(t97Var3.a));
            if (t97Var3.f != indexOf) {
                t97Var3.f = indexOf;
                z2 = true;
                z = true;
            }
        }
        if (z2) {
            Collections.sort(this.I, new el6((byte) 25));
            w1();
        }
        int i4 = z ? 1 : 2;
        i(true);
        na7 messagesController = getMessagesController();
        ArrayList arrayList5 = new ArrayList(this.I);
        messagesController.getClass();
        Utilities.d.c(new g87(messagesController, tL_messages_dialogs, null, tL_messages_dialogs2, i4, arrayList5, arrayList, arrayList2, runnable));
    }

    public final void V1(long j, TLRPC.Poll poll, TLRPC.PollResults pollResults) {
        this.a.c(new m77((Object) this, j, (Object) poll, (Object) pollResults, (byte) 27));
    }

    public final ArrayList W(ArrayList arrayList, long j) {
        ArrayList arrayList2 = new ArrayList();
        if (!arrayList.isEmpty()) {
            SQLiteCursor sQLiteCursor = null;
            try {
                try {
                    SQLiteDatabase sQLiteDatabase = this.b;
                    Locale locale = Locale.US;
                    sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM ephemeral_messages WHERE dialog_id = " + j + " AND id IN (" + TextUtils.join(",", arrayList) + ")", new Object[0]);
                    while (sQLiteCursor.next()) {
                        NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TL_ephemeral.EphemeralMessage TLdeserialize = TL_ephemeral.EphemeralMessage.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            byteBufferValue.reuse();
                            if (TLdeserialize != null) {
                                arrayList2.add(TLdeserialize);
                            }
                        }
                    }
                    sQLiteCursor.dispose();
                    return arrayList2;
                } catch (Exception e) {
                    n(e, true);
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
        return arrayList2;
    }

    public final void W0(HashMap hashMap, boolean z, boolean z2) {
        if (!hashMap.isEmpty() || z || z2) {
            this.a.c(new mn6((Object) this, (Object) hashMap, z, (byte) 2));
        }
    }

    public final void W1(long j, int i, TLRPC.TL_messageReactions tL_messageReactions) {
        this.a.c(new o57(this, i, j, (TLObject) tL_messageReactions, (byte) 13));
    }

    public final int X(long j) {
        LongSparseIntArray longSparseIntArray = this.S;
        int i = longSparseIntArray.get(j, -1);
        if (i == -1) {
            i = 0;
            if (j < 0) {
                TLRPC.Chat N = N(-j);
                if (N != null && N.forum) {
                    i = N.forum_tabs ? 3 : 1;
                }
                if (N != null && N.monoforum) {
                    i |= 4;
                }
            } else {
                TLRPC.User g02 = g0(j);
                if (g02 != null && g02.bot_forum_view) {
                    i = 8;
                }
            }
            longSparseIntArray.put(j, i);
        }
        return i;
    }

    public final void X0(vf6 vf6Var, vf6 vf6Var2, vf6 vf6Var3, boolean z) {
        if (p0(vf6Var) && p0(vf6Var2) && p0(vf6Var3)) {
            return;
        }
        this.a.c(new z77((Object) this, (Object) vf6Var, (Object) vf6Var2, (Object) vf6Var3, z, (byte) 14));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(14:402|403|404|405|406|407|408|409|411|412|(4:414|415|416|417)(1:429)|418|(1:420)|24)(1:3)|(2:390|(6:392|(1:394)(1:401)|395|396|397|24))(5:8|9|10|11|12)|276|277|279|280|(2:282|283)|285|20|(1:(4:89|(24:170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|(2:188|189)|193|194|195|196|197|198)(2:91|(5:147|148|150|151|152)(3:93|94|(6:124|125|126|127|128|129)(3:96|97|(6:101|102|103|104|105|106))))|99|100)(14:28|(1:30)(2:75|(1:77)(2:78|(1:80)(2:81|(1:83)(12:84|32|33|34|(1:36)(1:69)|37|38|(5:40|41|42|43|44)|66|(1:68)|54|55))))|31|32|33|34|(0)(0)|37|38|(0)|66|(0)|54|55))|24) */
    /* JADX WARN: Can't wrap try/catch for region: R(13:251|252|253|(1:255)|(1:257)|(3:179|180|181)|182|183|184|185|186|(0)|(8:193|194|195|196|197|198|99|100)) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:(4:302|303|(2:305|306)(1:361)|307)|308|309|(2:311|312)(1:349)|313|314|315|316|317|318|320|321|(2:323|324)|326) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:28|(1:30)(2:75|(1:77)(2:78|(1:80)(2:81|(1:83)(12:84|32|33|34|(1:36)(1:69)|37|38|(5:40|41|42|43|44)|66|(1:68)|54|55))))|31|32|33|34|(0)(0)|37|38|(0)|66|(0)|54|55) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:299|300|(4:302|303|(2:305|306)(1:361)|307)|308|309|(2:311|312)(1:349)|313|314|315|316|317|318|320|321|(2:323|324)|326) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:238|239|(2:240|241)|(2:243|182)|183|184|185|186|(0)|193|194|195|196|197|198|99|100) */
    /* JADX WARN: Can't wrap try/catch for region: R(18:0|1|(14:402|403|404|405|406|407|408|409|411|412|(4:414|415|416|417)(1:429)|418|(1:420)|24)(1:3)|4|(2:390|(6:392|(1:394)(1:401)|395|396|397|24))(5:8|9|10|11|12)|13|(19:299|300|302|303|(2:305|306)(1:361)|307|308|309|(2:311|312)(1:349)|313|314|315|316|317|318|320|321|(2:323|324)|326)(1:16)|(1:18)|276|277|279|280|(2:282|283)|285|20|(1:(4:89|(24:170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|(2:188|189)|193|194|195|196|197|198)(2:91|(5:147|148|150|151|152)(3:93|94|(6:124|125|126|127|128|129)(3:96|97|(6:101|102|103|104|105|106))))|99|100)(14:28|(1:30)(2:75|(1:77)(2:78|(1:80)(2:81|(1:83)(12:84|32|33|34|(1:36)(1:69)|37|38|(5:40|41|42|43|44)|66|(1:68)|54|55))))|31|32|33|34|(0)(0)|37|38|(0)|66|(0)|54|55))|24|(3:(0)|(1:380)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0244, code lost:
    
        if (r6 == 1) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0508, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0469, code lost:
    
        r0 = r34.b;
        r3 = java.util.Locale.US;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x046f, code lost:
    
        r7 = "DELETE FROM media_topics WHERE mid = ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0471, code lost:
    
        r0.executeFast(r7 + r15 + " AND uid = " + r10).stepThis().dispose();
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0495, code lost:
    
        if (r2 != null) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0497, code lost:
    
        r2.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x049b, code lost:
    
        r23 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x048d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0492, code lost:
    
        m(r0);
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x048f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0490, code lost:
    
        r7 = "DELETE FROM media_topics WHERE mid = ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0276, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0277, code lost:
    
        r27 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x027b, code lost:
    
        m(r0);
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x027e, code lost:
    
        if (r27 != null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0280, code lost:
    
        r27.dispose();
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0271, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0272, code lost:
    
        r27 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0663, code lost:
    
        if (r27 != null) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0665, code lost:
    
        r27.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0668, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x027a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0227, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0228, code lost:
    
        r27 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0236, code lost:
    
        m(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0239, code lost:
    
        if (r27 != null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x023b, code lost:
    
        r27.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x023e, code lost:
    
        r2 = r36;
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0669, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x066a, code lost:
    
        r3 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x066c, code lost:
    
        if (r3 != null) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x066e, code lost:
    
        r3.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0671, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0223, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0224, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x022b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x022c, code lost:
    
        r27 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0232, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0233, code lost:
    
        r36 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x01e6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x01e7, code lost:
    
        m(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x01ea, code lost:
    
        if (r3 != null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x01ec, code lost:
    
        r3.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x01ef, code lost:
    
        r2 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x00e8, code lost:
    
        if (r11 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0315, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0316, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0311, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0312, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0341 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x028d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0268 A[Catch: all -> 0x0271, Exception -> 0x0276, TRY_LEAVE, TryCatch #68 {Exception -> 0x0276, all -> 0x0271, blocks: (B:280:0x0262, B:282:0x0268), top: B:279:0x0262 }] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x01d9 A[Catch: Exception -> 0x01e6, all -> 0x0672, TRY_LEAVE, TryCatch #15 {Exception -> 0x01e6, blocks: (B:309:0x01b9, B:311:0x01d9), top: B:308:0x01b9, outer: #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0215 A[Catch: all -> 0x0223, Exception -> 0x0227, TRY_LEAVE, TryCatch #70 {Exception -> 0x0227, all -> 0x0223, blocks: (B:321:0x020f, B:323:0x0215), top: B:320:0x020f }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02d9 A[Catch: all -> 0x0311, Exception -> 0x0315, TryCatch #63 {Exception -> 0x0315, all -> 0x0311, blocks: (B:34:0x02d0, B:36:0x02d9, B:38:0x02de, B:40:0x02e6), top: B:33:0x02d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x00f4 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02e6 A[Catch: all -> 0x0311, Exception -> 0x0315, TRY_LEAVE, TryCatch #63 {Exception -> 0x0315, all -> 0x0311, blocks: (B:34:0x02d0, B:36:0x02d9, B:38:0x02de, B:40:0x02e6), top: B:33:0x02d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x033b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0536  */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [org.telegram.SQLite.SQLitePreparedStatement] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [org.telegram.SQLite.SQLitePreparedStatement] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v39, types: [org.telegram.SQLite.SQLitePreparedStatement] */
    /* JADX WARN: Type inference failed for: r2v41, types: [org.telegram.SQLite.SQLitePreparedStatement] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v21, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long[] X1(long j, long j2, Integer num, int i, int i2, int i3, int i4) {
        String str;
        String str2;
        Integer num2;
        SQLiteCursor sQLiteCursor;
        long j3;
        Integer num3;
        SQLiteCursor sQLiteCursor2;
        long j4;
        SQLiteDatabase sQLiteDatabase;
        int intValue;
        SQLiteCursor sQLiteCursor3;
        long j5;
        ?? r2;
        ?? r3;
        SQLiteCursor queryFinalized;
        int i5;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        String str3;
        SQLitePreparedStatement sQLitePreparedStatement3;
        SQLitePreparedStatement executeFast;
        SQLitePreparedStatement executeFast2;
        SQLitePreparedStatement executeFast3;
        SQLitePreparedStatement executeFast4;
        SQLitePreparedStatement sQLitePreparedStatement4;
        int i6;
        SQLitePreparedStatement sQLitePreparedStatement5;
        SQLitePreparedStatement executeFast5;
        SQLitePreparedStatement sQLitePreparedStatement6;
        int i7 = i3;
        SQLiteCursor sQLiteCursor4 = null;
        SQLitePreparedStatement sQLitePreparedStatement7 = null;
        SQLitePreparedStatement sQLitePreparedStatement8 = null;
        r23 = null;
        SQLitePreparedStatement sQLitePreparedStatement9 = null;
        r23 = null;
        SQLitePreparedStatement sQLitePreparedStatement10 = null;
        r23 = null;
        SQLitePreparedStatement sQLitePreparedStatement11 = null;
        r23 = null;
        SQLitePreparedStatement sQLitePreparedStatement12 = null;
        r23 = null;
        SQLitePreparedStatement sQLitePreparedStatement13 = null;
        SQLitePreparedStatement sQLitePreparedStatement14 = null;
        try {
            if (num == null) {
                try {
                    try {
                        sQLiteDatabase = this.b;
                        Locale locale = Locale.US;
                        str = "DELETE FROM messages_seq WHERE mid = ";
                    } catch (Exception e) {
                        e = e;
                        str = "DELETE FROM messages_seq WHERE mid = ";
                    }
                    try {
                        str2 = "DELETE FROM messages_v2 WHERE mid = ";
                        try {
                            sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT mid, uid FROM randoms_v2 WHERE random_id = " + j + " LIMIT 1", new Object[0]);
                        } catch (Exception e2) {
                            e = e2;
                            num2 = num;
                            sQLiteCursor = null;
                            m(e);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            j3 = j2;
                            if (num2 != null) {
                            }
                            return null;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        str2 = "DELETE FROM messages_v2 WHERE mid = ";
                        num2 = num;
                        sQLiteCursor = null;
                        m(e);
                        if (sQLiteCursor != null) {
                        }
                        j3 = j2;
                        if (num2 != null) {
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (sQLiteCursor4 != null) {
                        sQLiteCursor4.dispose();
                    }
                    throw th;
                }
                try {
                    try {
                        if (sQLiteCursor.next()) {
                            num2 = Integer.valueOf(sQLiteCursor.intValue(0));
                            try {
                                j3 = sQLiteCursor.longValue(1);
                            } catch (Exception e4) {
                                e = e4;
                                m(e);
                                if (sQLiteCursor != null) {
                                }
                                j3 = j2;
                                if (num2 != null) {
                                }
                                return null;
                            }
                        } else {
                            j3 = j2;
                            num2 = num;
                        }
                        sQLiteCursor.dispose();
                    } catch (Exception e5) {
                        e = e5;
                        num2 = num;
                    }
                    if (num2 != null) {
                        num3 = num2;
                        long j6 = j3;
                        sQLiteCursor2 = sQLiteCursor;
                        j4 = j6;
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteCursor4 = sQLiteCursor;
                    if (sQLiteCursor4 != null) {
                    }
                    throw th;
                }
            }
            str = "DELETE FROM messages_seq WHERE mid = ";
            str2 = "DELETE FROM messages_v2 WHERE mid = ";
            j4 = j2;
            num3 = num;
            sQLiteCursor2 = null;
            if (num3.intValue() < 0 && i7 == 1) {
                try {
                    sQLitePreparedStatement6 = this.b.executeFast("UPDATE randoms_v2 SET mid = ? WHERE random_id = ? AND mid = ?");
                    try {
                        try {
                            sQLitePreparedStatement6.bindInteger(1, i);
                            sQLitePreparedStatement6.bindLong(2, j);
                            sQLitePreparedStatement6.bindInteger(3, intValue);
                            sQLitePreparedStatement6.step();
                        } catch (Exception e6) {
                            e = e6;
                            m(e);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        sQLitePreparedStatement7 = sQLitePreparedStatement6;
                        throw th;
                    }
                } catch (Exception e7) {
                    e = e7;
                    sQLitePreparedStatement6 = null;
                } catch (Throwable th4) {
                    th = th4;
                    throw th;
                }
                sQLitePreparedStatement6.dispose();
            } else if (num3.intValue() > 0) {
                TL_update.TL_updateDeleteScheduledMessages tL_updateDeleteScheduledMessages = new TL_update.TL_updateDeleteScheduledMessages();
                tL_updateDeleteScheduledMessages.messages.add(num3);
                if (cf3.y(j4)) {
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    tL_updateDeleteScheduledMessages.peer = tL_peerChannel;
                    tL_peerChannel.channel_id = -j4;
                } else {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_updateDeleteScheduledMessages.peer = tL_peerUser;
                    tL_peerUser.user_id = j4;
                }
                TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                tL_updates.updates.add(tL_updateDeleteScheduledMessages);
                Utilities.d.c(new t67(this, tL_updates, (byte) 22));
                try {
                    SQLiteDatabase sQLiteDatabase2 = this.b;
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("DELETE FROM randoms_v2 WHERE random_id = " + j + " AND mid = " + num3 + " AND uid = " + j4).stepThis().dispose();
                } catch (Exception e8) {
                    m(e8);
                }
                return null;
            }
            SQLiteDatabase sQLiteDatabase3 = this.b;
            Locale locale3 = Locale.US;
            r3 = sQLiteDatabase3.queryFinalized("SELECT uid FROM scheduled_messages_v2 WHERE mid = " + num3 + " LIMIT 1", new Object[0]);
            if (r3.next()) {
                j5 = r3.longValue(0);
                i7 = 1;
            }
            r3.dispose();
            sQLitePreparedStatement = r3;
            if (j5 == 0 || i7 == 2) {
                if (intValue != i && i2 != 0) {
                    try {
                    } catch (Exception e9) {
                        e = e9;
                        sQLitePreparedStatement4 = null;
                    } catch (Throwable th5) {
                        th = th5;
                        sQLitePreparedStatement4 = null;
                    }
                    if (i7 == 0) {
                        executeFast5 = this.b.executeFast("UPDATE messages_v2 SET send_state = 0, date = ? WHERE mid = ? AND uid = ?");
                    } else if (i7 == 1) {
                        executeFast5 = this.b.executeFast("UPDATE scheduled_messages_v2 SET send_state = 0, date = ? WHERE mid = ? AND uid = ?");
                    } else if (i7 == 2) {
                        executeFast5 = this.b.executeFast("UPDATE quick_replies_messages SET send_state = 0, date = ? WHERE mid = ? AND topic_id = ?");
                    } else {
                        if (i7 != 3) {
                            i6 = i2;
                            sQLitePreparedStatement5 = null;
                            sQLitePreparedStatement5.bindInteger(1, i6);
                            sQLitePreparedStatement5.bindInteger(2, i);
                            sQLitePreparedStatement5.bindLong(3, i7 != 2 ? (long) r2 : j5);
                            sQLitePreparedStatement5.step();
                            if (i7 == 0) {
                                sQLitePreparedStatement4 = this.b.executeFast("UPDATE messages_topics SET send_state = 0, date = ? WHERE mid = ? AND uid = ?");
                                try {
                                    sQLitePreparedStatement4.bindInteger(1, i6);
                                    sQLitePreparedStatement4.bindInteger(2, i);
                                    sQLitePreparedStatement4.bindLong(3, j5);
                                    sQLitePreparedStatement4.step();
                                    sQLitePreparedStatement8 = sQLitePreparedStatement4;
                                } catch (Exception e10) {
                                    e = e10;
                                    sQLitePreparedStatement9 = sQLitePreparedStatement5;
                                    try {
                                        m(e);
                                        if (sQLitePreparedStatement9 != null) {
                                            sQLitePreparedStatement9.dispose();
                                        }
                                        if (sQLitePreparedStatement4 != null) {
                                            sQLitePreparedStatement4.dispose();
                                        }
                                        return new long[]{j5, i};
                                    } catch (Throwable th6) {
                                        th = th6;
                                        if (sQLitePreparedStatement9 != null) {
                                            sQLitePreparedStatement9.dispose();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    sQLitePreparedStatement9 = sQLitePreparedStatement5;
                                    if (sQLitePreparedStatement9 != null) {
                                    }
                                    throw th;
                                }
                            }
                            sQLitePreparedStatement5.dispose();
                            if (sQLitePreparedStatement8 != null) {
                                sQLitePreparedStatement8.dispose();
                            }
                            return new long[]{j5, i};
                        }
                        executeFast5 = this.b.executeFast("UPDATE welcome_messages SET send_state = 0, date = ? WHERE mid = ? AND dialog_id = ?");
                    }
                    i6 = i2;
                    sQLitePreparedStatement5 = executeFast5;
                    sQLitePreparedStatement5.bindInteger(1, i6);
                    sQLitePreparedStatement5.bindInteger(2, i);
                    sQLitePreparedStatement5.bindLong(3, i7 != 2 ? (long) r2 : j5);
                    sQLitePreparedStatement5.step();
                    if (i7 == 0) {
                    }
                    sQLitePreparedStatement5.dispose();
                    if (sQLitePreparedStatement8 != null) {
                    }
                    return new long[]{j5, i};
                }
                try {
                    if (i7 == 0) {
                        try {
                            r2 = this.b.executeFast("UPDATE messages_v2 SET mid = ?, send_state = 0 WHERE mid = ? AND uid = ?");
                            try {
                                r2.bindInteger(1, i);
                                r2.bindInteger(2, intValue);
                                r2.bindLong(3, j5);
                                r2.step();
                                sQLitePreparedStatement = this.b.executeFast("UPDATE messages_topics SET mid = ?, send_state = 0 WHERE mid = ? AND uid = ?");
                                try {
                                    sQLitePreparedStatement.bindInteger(1, i);
                                    sQLitePreparedStatement.bindInteger(2, intValue);
                                    sQLitePreparedStatement.bindLong(3, j5);
                                    sQLitePreparedStatement.step();
                                    r2.dispose();
                                    sQLitePreparedStatement.dispose();
                                    r2 = 0;
                                } catch (Exception unused) {
                                    try {
                                        SQLiteDatabase sQLiteDatabase4 = this.b;
                                        Locale locale4 = Locale.US;
                                        sQLiteDatabase4.executeFast(str2 + num3 + " AND uid = " + j5).stepThis().dispose();
                                        SQLiteDatabase sQLiteDatabase5 = this.b;
                                        StringBuilder sb = new StringBuilder(str);
                                        sb.append(num3);
                                        sQLiteDatabase5.executeFast(sb.toString()).stepThis().dispose();
                                        this.b.executeFast("DELETE FROM messages_topics WHERE mid = " + num3 + " AND uid = " + j5).stepThis().dispose();
                                    } catch (Exception e11) {
                                        m(e11);
                                    }
                                    if (r2 != 0) {
                                        r2.dispose();
                                        r2 = 0;
                                    }
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    try {
                                        try {
                                            r2 = this.b.executeFast("UPDATE media_v4 SET mid = ? WHERE mid = ? AND uid = ?");
                                            r2.bindInteger(1, i);
                                            r2.bindInteger(2, intValue);
                                            r2.bindLong(3, j5);
                                            r2.step();
                                            r2.dispose();
                                            str3 = "DELETE FROM media_v4 WHERE mid = ";
                                        } finally {
                                            if (r2 != 0) {
                                                r2.dispose();
                                            }
                                        }
                                    } catch (Exception unused2) {
                                        SQLiteDatabase sQLiteDatabase6 = this.b;
                                        Locale locale5 = Locale.US;
                                        str3 = "DELETE FROM media_v4 WHERE mid = ";
                                        try {
                                            sQLiteDatabase6.executeFast(str3 + num3 + " AND uid = " + j5).stepThis().dispose();
                                            sQLitePreparedStatement3 = r2;
                                        } catch (Exception e12) {
                                            e = e12;
                                            m(e);
                                            sQLitePreparedStatement3 = r2;
                                            if (sQLitePreparedStatement3 != null) {
                                            }
                                            sQLitePreparedStatement3 = this.b.executeFast("UPDATE media_topics SET mid = ? WHERE mid = ? AND uid = ?");
                                            sQLitePreparedStatement3.bindInteger(1, i);
                                            sQLitePreparedStatement3.bindInteger(2, intValue);
                                            sQLitePreparedStatement3.bindLong(3, j5);
                                            sQLitePreparedStatement3.step();
                                            sQLitePreparedStatement3.dispose();
                                            String str4 = "DELETE FROM media_topics WHERE mid = ";
                                            if (k27.f3(i)) {
                                            }
                                            executeFast = this.b.executeFast("UPDATE dialogs SET last_mid = ? WHERE last_mid = ?");
                                            executeFast.bindInteger(1, i);
                                            executeFast.bindInteger(2, intValue);
                                            executeFast.step();
                                            executeFast.dispose();
                                            return new long[]{j5, num3.intValue()};
                                        }
                                        if (sQLitePreparedStatement3 != null) {
                                            sQLitePreparedStatement3.dispose();
                                            sQLitePreparedStatement3 = null;
                                        }
                                        sQLitePreparedStatement3 = this.b.executeFast("UPDATE media_topics SET mid = ? WHERE mid = ? AND uid = ?");
                                        sQLitePreparedStatement3.bindInteger(1, i);
                                        sQLitePreparedStatement3.bindInteger(2, intValue);
                                        sQLitePreparedStatement3.bindLong(3, j5);
                                        sQLitePreparedStatement3.step();
                                        sQLitePreparedStatement3.dispose();
                                        String str42 = "DELETE FROM media_topics WHERE mid = ";
                                        if (k27.f3(i)) {
                                        }
                                        executeFast = this.b.executeFast("UPDATE dialogs SET last_mid = ? WHERE last_mid = ?");
                                        executeFast.bindInteger(1, i);
                                        executeFast.bindInteger(2, intValue);
                                        executeFast.step();
                                        executeFast.dispose();
                                        return new long[]{j5, num3.intValue()};
                                    }
                                    sQLitePreparedStatement3 = null;
                                    sQLitePreparedStatement3 = this.b.executeFast("UPDATE media_topics SET mid = ? WHERE mid = ? AND uid = ?");
                                    sQLitePreparedStatement3.bindInteger(1, i);
                                    sQLitePreparedStatement3.bindInteger(2, intValue);
                                    sQLitePreparedStatement3.bindLong(3, j5);
                                    sQLitePreparedStatement3.step();
                                    sQLitePreparedStatement3.dispose();
                                    String str422 = "DELETE FROM media_topics WHERE mid = ";
                                    if (k27.f3(i)) {
                                    }
                                    try {
                                        executeFast = this.b.executeFast("UPDATE dialogs SET last_mid = ? WHERE last_mid = ?");
                                        executeFast.bindInteger(1, i);
                                        executeFast.bindInteger(2, intValue);
                                        executeFast.step();
                                        executeFast.dispose();
                                        return new long[]{j5, num3.intValue()};
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                }
                            } catch (Exception unused3) {
                                sQLitePreparedStatement = null;
                            } catch (Throwable th9) {
                                th = th9;
                                sQLitePreparedStatement = null;
                                sQLitePreparedStatement14 = r2;
                                sQLitePreparedStatement2 = sQLitePreparedStatement;
                                if (sQLitePreparedStatement14 != null) {
                                }
                                if (sQLitePreparedStatement2 != null) {
                                }
                                throw th;
                            }
                        } catch (Exception unused4) {
                            r2 = 0;
                            sQLitePreparedStatement = null;
                        } catch (Throwable th10) {
                            th = th10;
                            sQLitePreparedStatement2 = null;
                            if (sQLitePreparedStatement14 != null) {
                            }
                            if (sQLitePreparedStatement2 != null) {
                            }
                            throw th;
                        }
                        try {
                            r2 = this.b.executeFast("UPDATE media_v4 SET mid = ? WHERE mid = ? AND uid = ?");
                            r2.bindInteger(1, i);
                            r2.bindInteger(2, intValue);
                            r2.bindLong(3, j5);
                            r2.step();
                            r2.dispose();
                            str3 = "DELETE FROM media_v4 WHERE mid = ";
                        } catch (Exception e13) {
                            e = e13;
                            str3 = "DELETE FROM media_v4 WHERE mid = ";
                            m(e);
                            sQLitePreparedStatement3 = r2;
                            if (sQLitePreparedStatement3 != null) {
                            }
                            sQLitePreparedStatement3 = this.b.executeFast("UPDATE media_topics SET mid = ? WHERE mid = ? AND uid = ?");
                            sQLitePreparedStatement3.bindInteger(1, i);
                            sQLitePreparedStatement3.bindInteger(2, intValue);
                            sQLitePreparedStatement3.bindLong(3, j5);
                            sQLitePreparedStatement3.step();
                            sQLitePreparedStatement3.dispose();
                            String str4222 = "DELETE FROM media_topics WHERE mid = ";
                            if (k27.f3(i)) {
                            }
                            executeFast = this.b.executeFast("UPDATE dialogs SET last_mid = ? WHERE last_mid = ?");
                            executeFast.bindInteger(1, i);
                            executeFast.bindInteger(2, intValue);
                            executeFast.step();
                            executeFast.dispose();
                            return new long[]{j5, num3.intValue()};
                        }
                        sQLitePreparedStatement3 = null;
                        try {
                            sQLitePreparedStatement3 = this.b.executeFast("UPDATE media_topics SET mid = ? WHERE mid = ? AND uid = ?");
                            sQLitePreparedStatement3.bindInteger(1, i);
                            sQLitePreparedStatement3.bindInteger(2, intValue);
                            sQLitePreparedStatement3.bindLong(3, j5);
                            sQLitePreparedStatement3.step();
                            sQLitePreparedStatement3.dispose();
                            String str42222 = "DELETE FROM media_topics WHERE mid = ";
                            if (k27.f3(i)) {
                                try {
                                    SQLiteDatabase sQLiteDatabase7 = this.b;
                                    Locale locale6 = Locale.US;
                                    sQLiteDatabase7.executeFast(str3 + num3 + " AND uid = " + j5).stepThis().dispose();
                                    this.b.executeFast(str42222 + num3 + " AND uid = " + j5).stepThis().dispose();
                                } catch (Exception e14) {
                                    m(e14);
                                }
                            }
                            executeFast = this.b.executeFast("UPDATE dialogs SET last_mid = ? WHERE last_mid = ?");
                            try {
                                executeFast.bindInteger(1, i);
                                executeFast.bindInteger(2, intValue);
                                executeFast.step();
                                executeFast.dispose();
                            } catch (Exception e15) {
                                e = e15;
                                sQLitePreparedStatement13 = executeFast;
                                m(e);
                                if (sQLitePreparedStatement13 != null) {
                                    sQLitePreparedStatement13.dispose();
                                }
                                return new long[]{j5, num3.intValue()};
                            } catch (Throwable th11) {
                                th = th11;
                                sQLitePreparedStatement13 = executeFast;
                                if (sQLitePreparedStatement13 != null) {
                                    sQLitePreparedStatement13.dispose();
                                }
                                throw th;
                            }
                        } finally {
                            if (sQLitePreparedStatement3 != null) {
                                sQLitePreparedStatement3.dispose();
                            }
                        }
                    } else if (i7 == 1) {
                        try {
                            try {
                                executeFast2 = this.b.executeFast("UPDATE scheduled_messages_v2 SET mid = ?, send_state = 0 WHERE mid = ? AND uid = ?");
                            } catch (Exception unused5) {
                            }
                        } catch (Throwable th12) {
                            th = th12;
                            if (sQLitePreparedStatement12 != null) {
                                sQLitePreparedStatement12.dispose();
                            }
                            throw th;
                        }
                        try {
                            executeFast2.bindInteger(1, i);
                            executeFast2.bindInteger(2, intValue);
                            executeFast2.bindLong(3, j5);
                            executeFast2.step();
                            executeFast2.dispose();
                        } catch (Exception unused6) {
                            sQLitePreparedStatement12 = executeFast2;
                            try {
                                SQLiteDatabase sQLiteDatabase8 = this.b;
                                Locale locale7 = Locale.US;
                                sQLiteDatabase8.executeFast("DELETE FROM scheduled_messages_v2 WHERE mid = " + num3 + " AND uid = " + j5).stepThis().dispose();
                            } catch (Exception e16) {
                                m(e16);
                                if (sQLitePreparedStatement12 != null) {
                                    sQLitePreparedStatement12.dispose();
                                }
                                return new long[]{j5, num3.intValue()};
                            }
                            if (sQLitePreparedStatement12 != null) {
                            }
                            return new long[]{j5, num3.intValue()};
                        } catch (Throwable th13) {
                            th = th13;
                            sQLitePreparedStatement12 = executeFast2;
                            if (sQLitePreparedStatement12 != null) {
                            }
                            throw th;
                        }
                    } else {
                        try {
                            if (i7 == 2) {
                                try {
                                    executeFast3 = this.b.executeFast("UPDATE quick_replies_messages SET mid = ?, topic_id = ?, send_state = 0 WHERE mid = ? AND topic_id = ?");
                                } catch (Exception unused7) {
                                }
                                try {
                                    executeFast3.bindInteger(1, i);
                                    executeFast3.bindInteger(2, i4);
                                    executeFast3.bindInteger(3, intValue);
                                    executeFast3.bindLong(4, (long) r2);
                                    executeFast3.step();
                                    executeFast3.dispose();
                                } catch (Exception unused8) {
                                    sQLitePreparedStatement11 = executeFast3;
                                    try {
                                        SQLiteDatabase sQLiteDatabase9 = this.b;
                                        Locale locale8 = Locale.US;
                                        sQLiteDatabase9.executeFast("DELETE FROM quick_replies_messages WHERE mid = " + num3 + " AND topic_id = " + r2).stepThis().dispose();
                                    } catch (Exception e17) {
                                        m(e17);
                                    }
                                    if (sQLitePreparedStatement11 != null) {
                                        sQLitePreparedStatement11.dispose();
                                    }
                                    return new long[]{j5, num3.intValue()};
                                } catch (Throwable th14) {
                                    th = th14;
                                    sQLitePreparedStatement11 = executeFast3;
                                    if (sQLitePreparedStatement11 != null) {
                                    }
                                    throw th;
                                }
                            } else {
                                try {
                                    if (i7 == 3) {
                                        try {
                                            executeFast4 = this.b.executeFast("UPDATE welcome_messages SET mid = ?, dialog_id = ?, send_state = 0 WHERE mid = ? AND dialog_id = ?");
                                        } catch (Exception unused9) {
                                        }
                                        try {
                                            executeFast4.bindInteger(1, i);
                                            executeFast4.bindInteger(2, i4);
                                            executeFast4.bindInteger(3, intValue);
                                            executeFast4.bindLong(4, j4);
                                            executeFast4.step();
                                            executeFast4.dispose();
                                        } catch (Exception unused10) {
                                            sQLitePreparedStatement10 = executeFast4;
                                            try {
                                                SQLiteDatabase sQLiteDatabase10 = this.b;
                                                Locale locale9 = Locale.US;
                                                sQLiteDatabase10.executeFast("DELETE FROM welcome_messages WHERE mid = " + num3 + " AND dialog_id = " + j4).stepThis().dispose();
                                            } catch (Exception e18) {
                                                m(e18);
                                            }
                                            if (sQLitePreparedStatement10 != null) {
                                                sQLitePreparedStatement10.dispose();
                                            }
                                            return new long[]{j5, num3.intValue()};
                                        } catch (Throwable th15) {
                                            th = th15;
                                            sQLitePreparedStatement10 = executeFast4;
                                            if (sQLitePreparedStatement10 != null) {
                                                sQLitePreparedStatement10.dispose();
                                            }
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th16) {
                                    th = th16;
                                }
                            }
                        } catch (Throwable th17) {
                            th = th17;
                            if (sQLitePreparedStatement11 != null) {
                                sQLitePreparedStatement11.dispose();
                            }
                            throw th;
                        }
                    }
                    return new long[]{j5, num3.intValue()};
                } catch (Throwable th18) {
                    th = th18;
                    sQLitePreparedStatement14 = r2;
                    sQLitePreparedStatement2 = sQLitePreparedStatement;
                    if (sQLitePreparedStatement14 != null) {
                        sQLitePreparedStatement14.dispose();
                    }
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    throw th;
                }
            }
            return null;
        } catch (Throwable th19) {
            th = th19;
        }
        getUserConfig().e();
        intValue = num3.intValue();
        if (i7 == -1 || i7 == 0) {
            try {
                try {
                    SQLiteDatabase sQLiteDatabase11 = this.b;
                    Locale locale10 = Locale.US;
                    sQLiteCursor3 = sQLiteDatabase11.queryFinalized("SELECT uid FROM messages_v2 WHERE mid = " + num3 + " LIMIT 1", new Object[0]);
                } catch (Exception e19) {
                    e = e19;
                }
            } catch (Throwable th20) {
                th = th20;
            }
            try {
                try {
                    try {
                        if (sQLiteCursor3.next()) {
                            j5 = sQLiteCursor3.longValue(0);
                            i7 = 0;
                        } else {
                            j5 = 0;
                        }
                        sQLiteCursor3.dispose();
                    } catch (Exception e20) {
                        e = e20;
                        sQLiteCursor2 = sQLiteCursor3;
                        m(e);
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                        sQLiteCursor3 = sQLiteCursor2;
                        j5 = 0;
                        SQLiteDatabase sQLiteDatabase12 = this.b;
                        Locale locale11 = Locale.US;
                        sQLiteCursor3 = sQLiteDatabase12.queryFinalized("SELECT topic_id FROM quick_replies_messages WHERE mid = " + num3 + " LIMIT 1", new Object[0]);
                        if (sQLiteCursor3.next()) {
                        }
                        sQLiteCursor3.dispose();
                        int i8 = i5;
                        SQLiteDatabase sQLiteDatabase13 = this.b;
                        Locale locale12 = Locale.US;
                        int i9 = i8;
                        queryFinalized = sQLiteDatabase13.queryFinalized("SELECT dialog_id FROM welcome_messages WHERE mid = " + num3 + " LIMIT 1", new Object[0]);
                        if (queryFinalized.next()) {
                        }
                        queryFinalized.dispose();
                        sQLiteCursor2 = queryFinalized;
                        r3 = -1;
                        r2 = i9;
                        if (i7 != r3) {
                        }
                        SQLiteDatabase sQLiteDatabase32 = this.b;
                        Locale locale32 = Locale.US;
                        r3 = sQLiteDatabase32.queryFinalized("SELECT uid FROM scheduled_messages_v2 WHERE mid = " + num3 + " LIMIT 1", new Object[0]);
                        if (r3.next()) {
                        }
                        r3.dispose();
                        sQLitePreparedStatement = r3;
                        if (j5 == 0) {
                        }
                        if (intValue != i) {
                        }
                        if (i7 == 0) {
                        }
                        return new long[]{j5, num3.intValue()};
                    } catch (Throwable th21) {
                        th = th21;
                        sQLiteCursor2 = sQLiteCursor3;
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                        throw th;
                    }
                    SQLiteDatabase sQLiteDatabase132 = this.b;
                    Locale locale122 = Locale.US;
                    int i92 = i8;
                    queryFinalized = sQLiteDatabase132.queryFinalized("SELECT dialog_id FROM welcome_messages WHERE mid = " + num3 + " LIMIT 1", new Object[0]);
                    if (queryFinalized.next()) {
                        j5 = queryFinalized.longValue(0);
                        i7 = 3;
                    }
                    queryFinalized.dispose();
                    sQLiteCursor2 = queryFinalized;
                    r3 = -1;
                    r2 = i92;
                } catch (Throwable th22) {
                    th = th22;
                }
                SQLiteDatabase sQLiteDatabase122 = this.b;
                Locale locale112 = Locale.US;
                sQLiteCursor3 = sQLiteDatabase122.queryFinalized("SELECT topic_id FROM quick_replies_messages WHERE mid = " + num3 + " LIMIT 1", new Object[0]);
                if (sQLiteCursor3.next()) {
                    i5 = i4;
                } else {
                    i5 = sQLiteCursor3.intValue(0);
                    i7 = 2;
                }
                sQLiteCursor3.dispose();
                int i82 = i5;
            } catch (Throwable th23) {
                if (sQLiteCursor3 != null) {
                    sQLiteCursor3.dispose();
                }
                throw th23;
            }
        } else {
            r3 = -1;
            j5 = 0;
            r2 = i4;
        }
        if (i7 != r3) {
            sQLitePreparedStatement = r3;
        }
    }

    public final void Y0(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        SQLitePreparedStatement executeFast = this.b.executeFast("REPLACE INTO chats VALUES(?, ?, ?)");
        for (int i = 0; i < list.size(); i++) {
            TLRPC.Chat chat = (TLRPC.Chat) list.get(i);
            if (chat.min) {
                SQLiteDatabase sQLiteDatabase = this.b;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(ls6.n(chat.id, "SELECT data FROM chats WHERE uid = "), new Object[0]);
                if (queryFinalized.next()) {
                    try {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TLRPC.Chat TLdeserialize = TLRPC.Chat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            byteBufferValue.reuse();
                            if (TLdeserialize != null) {
                                TLdeserialize.title = chat.title;
                                TLdeserialize.photo = chat.photo;
                                TLdeserialize.broadcast = chat.broadcast;
                                TLdeserialize.verified = chat.verified;
                                TLdeserialize.megagroup = chat.megagroup;
                                TLdeserialize.call_not_empty = chat.call_not_empty;
                                TLdeserialize.call_active = chat.call_active;
                                TLdeserialize.monoforum = chat.monoforum;
                                TLdeserialize.broadcast_messages_allowed = chat.broadcast_messages_allowed;
                                if ((chat.flags2 & 262144) != 0) {
                                    TLdeserialize.linked_monoforum_id = chat.linked_monoforum_id;
                                    TLdeserialize.flags2 |= 262144;
                                }
                                if (fod.a(chat.flags2, TLObject.FLAG_20)) {
                                    TLdeserialize.linked_community_id = chat.linked_community_id;
                                    TLdeserialize.flags2 |= TLObject.FLAG_20;
                                }
                                TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                                if (tL_chatBannedRights != null) {
                                    TLdeserialize.default_banned_rights = tL_chatBannedRights;
                                    TLdeserialize.flags |= 262144;
                                }
                                TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
                                if (tL_chatAdminRights != null) {
                                    TLdeserialize.admin_rights = tL_chatAdminRights;
                                    TLdeserialize.flags |= TLObject.FLAG_14;
                                }
                                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.banned_rights;
                                if (tL_chatBannedRights2 != null) {
                                    TLdeserialize.banned_rights = tL_chatBannedRights2;
                                    TLdeserialize.flags |= 32768;
                                }
                                String str = chat.username;
                                if (str != null) {
                                    TLdeserialize.username = str;
                                    TLdeserialize.flags |= 64;
                                } else {
                                    TLdeserialize.username = null;
                                    TLdeserialize.flags &= -65;
                                }
                                int i2 = chat.participants_count;
                                if (i2 > 0) {
                                    TLdeserialize.participants_count = i2;
                                }
                                chat = TLdeserialize;
                            }
                        }
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                }
                queryFinalized.dispose();
            }
            executeFast.requery();
            chat.flags |= 131072;
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(chat.getObjectSize());
            chat.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, chat.id);
            String str2 = chat.title;
            if (str2 != null) {
                executeFast.bindString(2, str2.toLowerCase());
            } else {
                executeFast.bindString(2, "");
            }
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            executeFast.step();
            nativeByteBuffer.reuse();
            this.S.delete(-chat.id);
        }
        executeFast.dispose();
    }

    public final void Y1(final int i, final long j, final long j2, final String str, final boolean z) {
        this.a.c(new Runnable() { // from class: tb7
            @Override // java.lang.Runnable
            public final void run() {
                TLRPC.TL_message c0;
                SQLitePreparedStatement executeFast;
                ad7 ad7Var = ad7.this;
                int i2 = i;
                long j3 = j;
                boolean z2 = z;
                long j4 = j2;
                String str2 = str;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        ad7Var.b.beginTransaction();
                        c0 = ad7Var.c0(i2, j3);
                        c0.voiceTranscriptionFinal = z2;
                        c0.voiceTranscriptionId = j4;
                        c0.voiceTranscription = str2;
                        c0.voiceTranscriptionLocal = false;
                        c0.voiceTranscriptionWords = null;
                        executeFast = ad7Var.b.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?");
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    executeFast.requery();
                    NativeByteBuffer c = l17.c(c0);
                    if (c != null) {
                        executeFast.bindByteBuffer(1, c);
                    } else {
                        executeFast.bindNull(1);
                    }
                    executeFast.bindInteger(2, i2);
                    executeFast.bindLong(3, j3);
                    executeFast.step();
                    executeFast.dispose();
                    ad7Var.b.commitTransaction();
                    if (c != null) {
                        c.reuse();
                    }
                    SQLiteDatabase sQLiteDatabase = ad7Var.b;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.commitTransaction();
                    }
                } catch (Exception e2) {
                    e = e2;
                    sQLitePreparedStatement = executeFast;
                    ad7Var.n(e, true);
                    SQLiteDatabase sQLiteDatabase2 = ad7Var.b;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.commitTransaction();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLitePreparedStatement = executeFast;
                    SQLiteDatabase sQLiteDatabase3 = ad7Var.b;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.commitTransaction();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            }
        });
    }

    public final TLRPC.Message Z(long j, long j2) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        this.a.c(new dt4((Object) this, j, j2, (Object) atomicReference, (Object) countDownLatch, (byte) 7));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            n(e, true);
        }
        return (TLRPC.Message) atomicReference.get();
    }

    public final void Z0(ArrayList arrayList, boolean z) {
        if (!arrayList.isEmpty() || z) {
            this.a.c(new eb7(this, z, new ArrayList(arrayList)));
        }
    }

    public final void Z1(final long j, final ArrayList arrayList, final boolean z, final int i, final int i2, final boolean z2, final HashMap hashMap) {
        this.a.c(new Runnable() { // from class: rc7
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:61:0x034e  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0353  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x0358  */
            /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:72:0x0361  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x0366  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x036b  */
            /* JADX WARN: Type inference failed for: r10v16 */
            /* JADX WARN: Type inference failed for: r10v17, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r10v18 */
            /* JADX WARN: Type inference failed for: r10v2 */
            /* JADX WARN: Type inference failed for: r10v3, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r10v7 */
            /* JADX WARN: Type inference failed for: r1v16, types: [org.telegram.SQLite.SQLitePreparedStatement] */
            /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v17 */
            /* JADX WARN: Type inference failed for: r2v18 */
            /* JADX WARN: Type inference failed for: r2v2 */
            /* JADX WARN: Type inference failed for: r2v28 */
            /* JADX WARN: Type inference failed for: r2v3, types: [org.telegram.SQLite.SQLitePreparedStatement] */
            /* JADX WARN: Type inference failed for: r2v30 */
            /* JADX WARN: Type inference failed for: r2v32, types: [org.telegram.SQLite.SQLitePreparedStatement] */
            /* JADX WARN: Type inference failed for: r2v33 */
            /* JADX WARN: Type inference failed for: r2v39, types: [org.telegram.SQLite.SQLitePreparedStatement] */
            /* JADX WARN: Type inference failed for: r2v5 */
            /* JADX WARN: Type inference failed for: r2v8 */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                ?? r2;
                SQLiteDatabase sQLiteDatabase;
                boolean z3;
                SQLitePreparedStatement sQLitePreparedStatement;
                SQLiteDatabase sQLiteDatabase2;
                ArrayList arrayList2;
                HashMap hashMap2;
                int i3;
                int i4;
                int max;
                final ?? r10;
                SQLiteCursor queryFinalized;
                int i5;
                int i6;
                boolean z4;
                int max2;
                final ?? r102;
                NativeByteBuffer nativeByteBuffer;
                int i7 = i;
                final ad7 ad7Var = ad7.this;
                ?? r22 = z;
                final HashMap hashMap3 = hashMap;
                int i8 = i2;
                final long j2 = j;
                ArrayList arrayList3 = arrayList;
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        if (r22 != 0) {
                            ad7Var.b.beginTransaction();
                            if (hashMap3 != null) {
                                if (i8 == 0) {
                                    ad7Var.b.executeFast("DELETE FROM chat_pinned_v2 WHERE uid = " + j2).stepThis().dispose();
                                }
                                i5 = 0;
                            } else {
                                SQLiteDatabase sQLiteDatabase3 = ad7Var.b;
                                Locale locale = Locale.US;
                                queryFinalized = sQLiteDatabase3.queryFinalized("SELECT COUNT(mid) FROM chat_pinned_v2 WHERE uid = " + j2 + " AND mid IN (" + TextUtils.join(",", arrayList3) + ")", new Object[0]);
                                try {
                                    int intValue = queryFinalized.next() ? queryFinalized.intValue(0) : 0;
                                    queryFinalized.dispose();
                                    i5 = intValue;
                                } catch (Exception e) {
                                    e = e;
                                    sQLiteCursor = queryFinalized;
                                    r2 = 0;
                                    z3 = true;
                                    sQLitePreparedStatement = r2;
                                    ad7Var.n(e, z3);
                                    sQLiteDatabase2 = ad7Var.b;
                                    if (sQLiteDatabase2 != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    if (sQLitePreparedStatement == null) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    sQLiteCursor = queryFinalized;
                                    r22 = 0;
                                    sQLiteDatabase = ad7Var.b;
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.commitTransaction();
                                    }
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    if (r22 != 0) {
                                        r22.dispose();
                                    }
                                    throw th;
                                }
                            }
                            r2 = ad7Var.b.executeFast("REPLACE INTO chat_pinned_v2 VALUES(?, ?, ?)");
                            try {
                                int size = arrayList3.size();
                                int i9 = 0;
                                while (i9 < size) {
                                    Integer num = (Integer) arrayList3.get(i9);
                                    r2.requery();
                                    ArrayList arrayList4 = arrayList3;
                                    r2.bindLong(1, j2);
                                    int i10 = i8;
                                    r2.bindInteger(2, num.intValue());
                                    k27 k27Var = hashMap3 != null ? (k27) hashMap3.get(num) : null;
                                    if (k27Var != null) {
                                        nativeByteBuffer = new NativeByteBuffer(k27Var.k.getObjectSize());
                                        k27Var.k.serializeToStream(nativeByteBuffer);
                                        r2.bindByteBuffer(3, nativeByteBuffer);
                                    } else {
                                        r2.bindNull(3);
                                        nativeByteBuffer = null;
                                    }
                                    r2.step();
                                    if (nativeByteBuffer != null) {
                                        nativeByteBuffer.reuse();
                                    }
                                    i9++;
                                    arrayList3 = arrayList4;
                                    i8 = i10;
                                }
                                final ArrayList arrayList5 = arrayList3;
                                final int i11 = i8;
                                r2.dispose();
                                ad7Var.b.commitTransaction();
                                SQLiteDatabase sQLiteDatabase4 = ad7Var.b;
                                Locale locale2 = Locale.US;
                                queryFinalized = sQLiteDatabase4.queryFinalized("SELECT COUNT(mid) FROM chat_pinned_v2 WHERE uid = " + j2, new Object[0]);
                                int intValue2 = queryFinalized.next() ? queryFinalized.intValue(0) : 0;
                                queryFinalized.dispose();
                                if (hashMap3 != null) {
                                    max2 = Math.max(i7, intValue2);
                                    r102 = z2;
                                } else {
                                    SQLiteCursor queryFinalized2 = ad7Var.b.queryFinalized("SELECT count, end FROM chat_pinned_count WHERE uid = " + j2, new Object[0]);
                                    if (queryFinalized2.next()) {
                                        i6 = queryFinalized2.intValue(0);
                                        if (queryFinalized2.intValue(1) != 0) {
                                            z4 = true;
                                            queryFinalized2.dispose();
                                            max2 = Math.max((arrayList5.size() - i5) + i6, intValue2);
                                            r102 = z4;
                                        }
                                    } else {
                                        i6 = 0;
                                    }
                                    z4 = false;
                                    queryFinalized2.dispose();
                                    max2 = Math.max((arrayList5.size() - i5) + i6, intValue2);
                                    r102 = z4;
                                }
                                r2 = ad7Var.b.executeFast("REPLACE INTO chat_pinned_count VALUES(?, ?, ?)");
                                r2.requery();
                                r2.bindLong(1, j2);
                                r2.bindInteger(2, max2);
                                r2.bindInteger(3, r102);
                                r2.step();
                                r2.dispose();
                                final byte b = 0;
                                final int i12 = max2;
                                gl.c3(new Runnable() { // from class: wb7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b2 = b;
                                        boolean z5 = r102;
                                        int i13 = i12;
                                        int i14 = i11;
                                        HashMap hashMap4 = hashMap3;
                                        ArrayList arrayList6 = arrayList5;
                                        long j3 = j2;
                                        ad7 ad7Var2 = ad7Var;
                                        switch (b2) {
                                            case 0:
                                                ad7Var2.getNotificationCenter().k(56, Long.valueOf(j3), arrayList6, Boolean.TRUE, null, hashMap4, Integer.valueOf(i14), Integer.valueOf(i13), Boolean.valueOf(z5));
                                                break;
                                            default:
                                                ad7Var2.getNotificationCenter().k(56, Long.valueOf(j3), arrayList6, Boolean.FALSE, null, hashMap4, Integer.valueOf(i14), Integer.valueOf(i13), Boolean.valueOf(z5));
                                                break;
                                        }
                                    }
                                });
                            } catch (Exception e2) {
                                e = e2;
                                z3 = true;
                                sQLitePreparedStatement = r2;
                                ad7Var.n(e, z3);
                                sQLiteDatabase2 = ad7Var.b;
                                if (sQLiteDatabase2 != null) {
                                    sQLiteDatabase2.commitTransaction();
                                }
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                if (sQLitePreparedStatement == null) {
                                    sQLitePreparedStatement.dispose();
                                    return;
                                }
                                return;
                            }
                        } else {
                            if (arrayList3 == null) {
                                ad7Var.b.executeFast("DELETE FROM chat_pinned_v2 WHERE uid = " + j2).stepThis().dispose();
                                boolean y = cf3.y(j2);
                                SQLiteDatabase sQLiteDatabase5 = ad7Var.b;
                                if (y) {
                                    Locale locale3 = Locale.US;
                                    sQLiteDatabase5.executeFast("UPDATE chat_settings_v2 SET pinned = 0 WHERE uid = " + (-j2)).stepThis().dispose();
                                } else {
                                    Locale locale4 = Locale.US;
                                    sQLiteDatabase5.executeFast("UPDATE user_settings SET pinned = 0 WHERE uid = " + j2).stepThis().dispose();
                                }
                                arrayList2 = arrayList3;
                                hashMap2 = hashMap3;
                                i3 = i8;
                                r10 = 1;
                                max = 0;
                            } else {
                                String join = TextUtils.join(",", arrayList3);
                                boolean y2 = cf3.y(j2);
                                SQLiteDatabase sQLiteDatabase6 = ad7Var.b;
                                arrayList2 = arrayList3;
                                if (y2) {
                                    Locale locale5 = Locale.US;
                                    hashMap2 = hashMap3;
                                    i3 = i8;
                                    sQLiteDatabase6.executeFast("UPDATE chat_settings_v2 SET pinned = 0 WHERE uid = " + (-j2) + " AND pinned IN (" + join + ")").stepThis().dispose();
                                } else {
                                    hashMap2 = hashMap3;
                                    i3 = i8;
                                    Locale locale6 = Locale.US;
                                    sQLiteDatabase6.executeFast("UPDATE user_settings SET pinned = 0 WHERE uid = " + j2 + " AND pinned IN (" + join + ")").stepThis().dispose();
                                }
                                ad7Var.b.executeFast("DELETE FROM chat_pinned_v2 WHERE uid = " + j2 + " AND mid IN(" + join + ")").stepThis().dispose();
                                SQLiteCursor queryFinalized3 = ad7Var.b.queryFinalized("SELECT changes()", new Object[0]);
                                try {
                                    int intValue3 = queryFinalized3.next() ? queryFinalized3.intValue(0) : 0;
                                    queryFinalized3.dispose();
                                    SQLiteCursor queryFinalized4 = ad7Var.b.queryFinalized("SELECT COUNT(mid) FROM chat_pinned_v2 WHERE uid = " + j2, new Object[0]);
                                    int intValue4 = queryFinalized4.next() ? queryFinalized4.intValue(0) : 0;
                                    queryFinalized4.dispose();
                                    boolean z5 = false;
                                    queryFinalized3 = ad7Var.b.queryFinalized("SELECT count, end FROM chat_pinned_count WHERE uid = " + j2, new Object[0]);
                                    if (queryFinalized3.next()) {
                                        int max3 = Math.max(0, queryFinalized3.intValue(0) - intValue3);
                                        z5 = queryFinalized3.intValue(1) != 0;
                                        i4 = max3;
                                    } else {
                                        i4 = 0;
                                    }
                                    queryFinalized3.dispose();
                                    max = Math.max(intValue4, i4);
                                    r10 = z5;
                                } catch (Exception e3) {
                                    e = e3;
                                    sQLitePreparedStatement = null;
                                    z3 = true;
                                    sQLiteCursor = queryFinalized3;
                                    ad7Var.n(e, z3);
                                    sQLiteDatabase2 = ad7Var.b;
                                    if (sQLiteDatabase2 != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    if (sQLitePreparedStatement == null) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    r22 = 0;
                                    sQLiteCursor = queryFinalized3;
                                    sQLiteDatabase = ad7Var.b;
                                    if (sQLiteDatabase != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    if (r22 != 0) {
                                    }
                                    throw th;
                                }
                            }
                            ?? executeFast = ad7Var.b.executeFast("REPLACE INTO chat_pinned_count VALUES(?, ?, ?)");
                            try {
                                executeFast.requery();
                                executeFast.bindLong(1, j2);
                                executeFast.bindInteger(2, max);
                                executeFast.bindInteger(3, r10);
                                executeFast.step();
                                executeFast.dispose();
                                final byte b2 = 1;
                                final HashMap hashMap4 = hashMap2;
                                final int i13 = max;
                                final ArrayList arrayList6 = arrayList2;
                                final int i14 = i3;
                                gl.c3(new Runnable() { // from class: wb7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b22 = b2;
                                        boolean z52 = r10;
                                        int i132 = i13;
                                        int i142 = i14;
                                        HashMap hashMap42 = hashMap4;
                                        ArrayList arrayList62 = arrayList6;
                                        long j3 = j2;
                                        ad7 ad7Var2 = ad7Var;
                                        switch (b22) {
                                            case 0:
                                                ad7Var2.getNotificationCenter().k(56, Long.valueOf(j3), arrayList62, Boolean.TRUE, null, hashMap42, Integer.valueOf(i142), Integer.valueOf(i132), Boolean.valueOf(z52));
                                                break;
                                            default:
                                                ad7Var2.getNotificationCenter().k(56, Long.valueOf(j3), arrayList62, Boolean.FALSE, null, hashMap42, Integer.valueOf(i142), Integer.valueOf(i132), Boolean.valueOf(z52));
                                                break;
                                        }
                                    }
                                });
                            } catch (Exception e4) {
                                e = e4;
                                r2 = executeFast;
                                z3 = true;
                                sQLitePreparedStatement = r2;
                                ad7Var.n(e, z3);
                                sQLiteDatabase2 = ad7Var.b;
                                if (sQLiteDatabase2 != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                if (sQLitePreparedStatement == null) {
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                r22 = executeFast;
                                sQLiteDatabase = ad7Var.b;
                                if (sQLiteDatabase != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                if (r22 != 0) {
                                }
                                throw th;
                            }
                        }
                        SQLiteDatabase sQLiteDatabase7 = ad7Var.b;
                        if (sQLiteDatabase7 != null) {
                            sQLiteDatabase7.commitTransaction();
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Exception e5) {
                    e = e5;
                    r2 = 0;
                } catch (Throwable th5) {
                    th = th5;
                    r22 = 0;
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(TLRPC.Message message, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, boolean z) {
        long j;
        int i;
        TLRPC.Document G0 = k27.G0(message);
        TLRPC.Photo C1 = k27.C1(message);
        int i2 = 0;
        if (!k27.Q4(message)) {
            if (k27.v4(message) || k27.L2(message)) {
                if (G0 != null) {
                    j = G0.id;
                    i = 1;
                }
                return false;
            }
            if (k27.K4(message) || k27.i4(message) || k27.t3(message)) {
                if (G0 != null) {
                    j = G0.id;
                    i = 4;
                }
                return false;
            }
            if (G0 != null) {
                if (getMediaDataController().A0.c(G0.id) != null) {
                    return false;
                }
                j = G0.id;
                i = 8;
            } else if (C1 == null || ba4.w(C1.sizes, gl.Y0(false), false, null, false) == null) {
                j = 0;
                i = 0;
            } else {
                j = C1.id;
                i = 1;
            }
            if (j != 0) {
            }
            if (C1 != null) {
            }
            return true;
        }
        if (G0 == null || getMediaDataController().A0.c(G0.id) != null) {
            return false;
        }
        j = G0.id;
        i = 2;
        if (j != 0) {
            arrayList2.add(new Pair(Long.valueOf(j), Integer.valueOf(i)));
        }
        if (C1 != null) {
            if (G0 != null) {
                String r = ba4.r(null, G0);
                if (!TextUtils.isEmpty(r)) {
                    arrayList3.add(r);
                }
                getFileLoader().getClass();
                File J = ba4.J(G0, null, z, true);
                if (J.toString().length() > 0) {
                    arrayList.add(J);
                }
                int size = G0.thumbs.size();
                while (i2 < size) {
                    TLRPC.PhotoSize photoSize = G0.thumbs.get(i2);
                    getFileLoader().getClass();
                    File I = ba4.I(photoSize);
                    if (I.toString().length() > 0) {
                        arrayList.add(I);
                    }
                    i2++;
                }
            }
            return false;
        }
        int size2 = C1.sizes.size();
        while (i2 < size2) {
            TLRPC.PhotoSize photoSize2 = C1.sizes.get(i2);
            String r2 = ba4.r(null, photoSize2);
            if (!TextUtils.isEmpty(r2)) {
                arrayList3.add(r2);
            }
            getFileLoader().getClass();
            File J2 = ba4.J(photoSize2, null, z, true);
            if (J2.toString().length() > 0) {
                arrayList.add(J2);
            }
            i2++;
        }
        return true;
    }

    public final TLRPC.Message a0(long j, long j2) {
        TLRPC.Message message;
        SQLiteCursor sQLiteCursor = null;
        TLRPC.Message message2 = null;
        SQLiteCursor sQLiteCursor2 = null;
        try {
            try {
                SQLiteCursor queryFinalized = this.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j + " AND mid = " + j2 + " LIMIT 1", new Object[0]);
                while (queryFinalized.next()) {
                    try {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().n);
                            }
                            byteBufferValue.reuse();
                            message2 = TLdeserialize;
                        }
                    } catch (Exception e) {
                        e = e;
                        TLRPC.Message message3 = message2;
                        sQLiteCursor = queryFinalized;
                        message = message3;
                        n(e, true);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        return message;
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor2 = queryFinalized;
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                        throw th;
                    }
                }
                queryFinalized.dispose();
                return message2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
            message = null;
        }
    }

    public final void a1(TLRPC.messages_Dialogs messages_dialogs, int i) {
        if (messages_dialogs.dialogs.isEmpty()) {
            return;
        }
        this.a.c(new o94((Object) this, (Object) messages_dialogs, i, (byte) 11));
    }

    public final void a2(int i, int i2, long j, long j2) {
        this.a.c(new sz4(this, j, j2, i, i2, (byte) 2));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void b1(org.telegram.tgnet.TLRPC.messages_Dialogs r31, int r32) {
        /*
            Method dump skipped, instructions count: 1840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad7.b1(org.telegram.tgnet.TLRPC$messages_Dialogs, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b2(final int i, int i2, final long j, final long j2) {
        SQLiteCursor sQLiteCursor;
        boolean z;
        String str;
        String str2;
        int i3;
        final int i4;
        final int i5;
        TLRPC.MessageReplies messageReplies;
        NativeByteBuffer byteBufferValue;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            if (r0(13, j)) {
                str = " AND read_state IN(0, 1) AND out = 0";
                str2 = "UPDATE messages_topics SET read_state = read_state | 2 WHERE uid = ";
            } else {
                SQLitePreparedStatement executeFast = this.b.executeFast("UPDATE messages_v2 SET replies_data = ? WHERE mid = ? AND uid = ?");
                try {
                    SQLiteDatabase sQLiteDatabase = this.b;
                    Locale locale = Locale.US;
                    str = " AND read_state IN(0, 1) AND out = 0";
                    str2 = "UPDATE messages_topics SET read_state = read_state | 2 WHERE uid = ";
                    sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT replies_data FROM messages_v2 WHERE mid = " + j2 + " AND uid = " + j, new Object[0]);
                    try {
                        if (!sQLiteCursor.next() || (byteBufferValue = sQLiteCursor.byteBufferValue(0)) == null) {
                            messageReplies = null;
                        } else {
                            messageReplies = TLRPC.MessageReplies.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            byteBufferValue.reuse();
                        }
                        sQLiteCursor.dispose();
                        if (messageReplies != null) {
                            messageReplies.read_max_id = i;
                            executeFast.requery();
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageReplies.getObjectSize());
                            messageReplies.serializeToStream(nativeByteBuffer);
                            executeFast.bindByteBuffer(1, nativeByteBuffer);
                            executeFast.bindInteger(2, (int) j2);
                            executeFast.bindLong(3, j);
                            executeFast.step();
                            nativeByteBuffer.reuse();
                        }
                        executeFast.dispose();
                    } catch (Exception e) {
                        e = e;
                        sQLitePreparedStatement = executeFast;
                        z = true;
                        n(e, z);
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor != null) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        sQLitePreparedStatement = executeFast;
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor != null) {
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    sQLiteCursor = null;
                    z = true;
                    sQLitePreparedStatement = executeFast;
                    n(e, z);
                    if (sQLitePreparedStatement != null) {
                    }
                    if (sQLiteCursor != null) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteCursor = null;
                }
            }
            SQLiteDatabase sQLiteDatabase2 = this.b;
            Locale locale2 = Locale.US;
            sQLiteCursor = sQLiteDatabase2.queryFinalized("SELECT max_read_id FROM topics WHERE did = " + j + " AND topic_id = " + j2, new Object[0]);
            try {
                try {
                    boolean z2 = sQLiteCursor.next() && i >= sQLiteCursor.intValue(0);
                    sQLiteCursor.dispose();
                    this.b.executeFast("UPDATE messages_topics SET read_state = read_state | 1 WHERE uid = " + j + " AND topic_id = " + j2 + " AND mid <= " + i + " AND read_state IN(0, 2) AND out = 0").stepThis().dispose();
                    SQLiteDatabase sQLiteDatabase3 = this.b;
                    StringBuilder sb = new StringBuilder(str2);
                    sb.append(j);
                    sb.append(" AND topic_id = ");
                    sb.append(j2);
                    sb.append(" AND mid <= ");
                    sb.append(i);
                    String str3 = str;
                    sb.append(str3);
                    sQLiteDatabase3.executeFast(sb.toString()).stepThis().dispose();
                    if (i2 < 0) {
                        SQLiteCursor queryFinalized = this.b.queryFinalized("SELECT count(mid) FROM messages_topics WHERE uid = " + j + " AND topic_id = " + j2 + " AND mid > " + i + " AND read_state IN(0, 2) AND out = 0", new Object[0]);
                        int intValue = queryFinalized.next() ? queryFinalized.intValue(0) : 0;
                        queryFinalized.dispose();
                        if (intValue == 0) {
                            i4 = intValue;
                            i5 = 0;
                            if (z2) {
                                return;
                            }
                            if (i5 >= 0) {
                                boolean z3 = w01.a;
                                SQLiteDatabase sQLiteDatabase4 = this.b;
                                Locale locale3 = Locale.ENGLISH;
                                sQLiteDatabase4.executeFast("UPDATE topics SET max_read_id = " + i + ", unread_count = " + i4 + ", unread_mentions = " + i5 + " WHERE did = " + j + " AND topic_id = " + j2).stepThis().dispose();
                            } else {
                                SQLiteDatabase sQLiteDatabase5 = this.b;
                                Locale locale4 = Locale.ENGLISH;
                                sQLiteDatabase5.executeFast("UPDATE topics SET max_read_id = " + i + ", unread_count = " + i4 + " WHERE did = " + j + " AND topic_id = " + j2).stepThis().dispose();
                            }
                            gl.c3(new Runnable() { // from class: nc7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    pub pubVar = ad7.this.getMessagesController().g4;
                                    long j3 = -j;
                                    TLRPC.TL_forumTopic f = pubVar.f(j3, j2);
                                    if (f != null) {
                                        f.read_inbox_max_id = i;
                                        f.unread_count = i4;
                                        int i6 = i5;
                                        if (i6 >= 0) {
                                            f.unread_mentions_count = i6;
                                        }
                                        pubVar.y(j3, true);
                                    }
                                }
                            });
                            r1(j);
                            return;
                        }
                        SQLiteCursor queryFinalized2 = this.b.queryFinalized("SELECT count(mid) FROM messages_topics WHERE uid = " + j + " AND topic_id = " + j2 + " AND mid > " + i + str3, new Object[0]);
                        int intValue2 = queryFinalized2.next() ? queryFinalized2.intValue(0) : -1;
                        queryFinalized2.dispose();
                        if (r0(4, j)) {
                            i3 = 0;
                        } else {
                            sQLiteCursor = this.b.queryFinalized("SELECT unread_mentions FROM topics WHERE did = " + j + " AND topic_id = " + j2, new Object[0]);
                            i3 = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : 0;
                            sQLiteCursor.dispose();
                        }
                        if (intValue2 <= i3) {
                            i3 = intValue2;
                        }
                        i4 = intValue;
                        i5 = i3;
                        if (z2) {
                        }
                    } else {
                        i3 = 0;
                        i4 = i2;
                        if (i2 != 0) {
                            i5 = -1;
                            if (z2) {
                            }
                        }
                        i5 = i3;
                        if (z2) {
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    z = true;
                    n(e, z);
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            sQLiteCursor = null;
        } catch (Throwable th4) {
            th = th4;
            sQLiteCursor = null;
        }
    }

    public final TLRPC.TL_message c0(int i, long j) {
        SQLiteCursor queryFinalized;
        boolean z;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                queryFinalized = this.b.queryFinalized("SELECT custom_params FROM messages_v2 WHERE mid = ? AND uid = ?", Integer.valueOf(i), Long.valueOf(j));
            } catch (SQLiteException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (queryFinalized.next()) {
                l17.b(tL_message, queryFinalized.byteBufferValue(0));
                z = true;
            } else {
                z = false;
            }
            queryFinalized.dispose();
            if (!z) {
                sQLiteCursor = this.b.queryFinalized("SELECT custom_params FROM messages_topics WHERE mid = ? AND uid = ?", Integer.valueOf(i), Long.valueOf(j));
                if (sQLiteCursor.next()) {
                    l17.b(tL_message, sQLiteCursor.byteBufferValue(0));
                }
                sQLiteCursor.dispose();
                return tL_message;
            }
        } catch (SQLiteException e2) {
            e = e2;
            sQLiteCursor = queryFinalized;
            n(e, true);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            return tL_message;
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursor = queryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
        return tL_message;
    }

    public final void c1(ArrayList arrayList, boolean z) {
        if (arrayList.isEmpty()) {
            return;
        }
        H(new eb7(this, arrayList, z, (byte) 1));
    }

    public final void c2(long j, TLRPC.TL_forumTopic tL_forumTopic, int i) {
        int currentTime = getConnectionsManager().getCurrentTime();
        if (tL_forumTopic == null) {
            return;
        }
        this.a.c(new a70(this, i, tL_forumTopic, j, currentTime));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public final bc7 d0(long r83, long r85, int r87, int r88, int r89, int r90, int r91, int r92, int r93, long r94, int r96, boolean r97, boolean r98, qob r99) {
        /*
            Method dump skipped, instructions count: 8843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad7.d0(long, long, int, int, int, int, int, int, int, long, int, boolean, boolean, qob):bc7");
    }

    public final void d1(ArrayList arrayList, boolean z) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            if (z) {
                try {
                    this.b.beginTransaction();
                } catch (Exception e) {
                    n(e, true);
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                        return;
                    }
                    return;
                }
            }
            sQLitePreparedStatement = this.b.executeFast("INSERT OR REPLACE INTO ephemeral_messages (dialog_id, id, topic_id, date, data) VALUES (?, ?, ?, ?, ?);");
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) obj;
                if (!ephemeralMessage.welcome) {
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindLong(1, cf3.n(ephemeralMessage.peer_id));
                    sQLitePreparedStatement.bindInteger(2, ephemeralMessage.id);
                    sQLitePreparedStatement.bindInteger(3, ephemeralMessage.top_msg_id);
                    sQLitePreparedStatement.bindInteger(4, ephemeralMessage.date);
                    sQLitePreparedStatement.bindTlObject(5, ephemeralMessage);
                    sQLitePreparedStatement.step();
                }
            }
            if (z) {
                this.b.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public final void d2(long j, long j2, long j3) {
        ad7 ad7Var;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.b;
                Locale locale = Locale.US;
                sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT topic_id FROM topics WHERE did = " + j + " AND max_read_id < " + j3 + " AND (top_message > " + j2 + " OR unread_count > 0)", new Object[0]);
                while (sQLiteCursor.next()) {
                    ad7Var = this;
                    long j4 = j;
                    try {
                        ad7Var.b2((int) j3, -1, j4, sQLiteCursor.longValue(0));
                        this = ad7Var;
                        j = j4;
                    } catch (Exception e) {
                        e = e;
                        ad7Var.n(e, true);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                            return;
                        }
                        return;
                    }
                }
                sQLiteCursor.dispose();
            } catch (Exception e2) {
                e = e2;
                ad7Var = this;
            }
        } finally {
        }
    }

    public final void e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.c(new lo6((Object) this, (Object) str, (Object) str2, (byte) 27));
    }

    public final Object[] e0(int i, String str) {
        if (str == null || str.toLowerCase().endsWith("attheme")) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Object[] objArr = new Object[2];
        this.a.c(new bb6(this, str, i, objArr, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            n(e, true);
        }
        if (objArr[0] != null) {
            return objArr;
        }
        return null;
    }

    public final void e1(int i, int i2, int i3, long j, long j2, TLRPC.messages_Messages messages_messages, boolean z) {
        this.a.c(new eo6(this, i3, messages_messages, j, j2, i, i2, z));
    }

    public final void e2(int i, long j, long j2, boolean z) {
        this.a.c(new xa7(this, j2, z, "unread_poll_votes", j, i, "poll_votes_mentions_topics", "unread_poll_votes", "poll_votes_mentions"));
    }

    public final void f(SQLitePreparedStatement sQLitePreparedStatement, TLRPC.Message message) {
        ArrayList<TLRPC.ReactionCount> arrayList;
        long e = getUserConfig().e();
        TLRPC.TL_messageReactions tL_messageReactions = message.reactions;
        if (tL_messageReactions == null || !tL_messageReactions.reactions_as_tags || (arrayList = tL_messageReactions.results) == null || arrayList.isEmpty()) {
            return;
        }
        k96 D0 = k96.D0();
        String str = message.message;
        if (str == null) {
            str = "";
        }
        int i = 0;
        String S0 = D0.S0(str, true, false);
        ArrayList<TLRPC.ReactionCount> arrayList2 = message.reactions.results;
        int size = arrayList2.size();
        while (i < size) {
            TLRPC.ReactionCount reactionCount = arrayList2.get(i);
            i++;
            TLRPC.ReactionCount reactionCount2 = reactionCount;
            TLRPC.Reaction reaction = reactionCount2.reaction;
            if ((reaction instanceof TLRPC.TL_reactionEmoji) || (reaction instanceof TLRPC.TL_reactionCustomEmoji)) {
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindLong(1, message.id);
                sQLitePreparedStatement.bindLong(2, k27.Q1(e, message));
                TLRPC.Reaction reaction2 = reactionCount2.reaction;
                sQLitePreparedStatement.bindLong(3, reaction2 instanceof TLRPC.TL_reactionEmoji ? ((TLRPC.TL_reactionEmoji) reaction2).emoticon.hashCode() : reaction2 instanceof TLRPC.TL_reactionCustomEmoji ? ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id : 0L);
                sQLitePreparedStatement.bindString(4, S0 == null ? "" : S0);
                sQLitePreparedStatement.step();
            }
        }
    }

    public final HashMap f0() {
        HashMap hashMap = new HashMap();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = this.b.queryFinalized("SELECT uid, info, participants_count FROM chat_settings_v2 WHERE participants_count > 1", new Object[0]);
                while (sQLiteCursor.next()) {
                    long longValue = sQLiteCursor.longValue(0);
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(1);
                    int intValue = sQLiteCursor.intValue(2);
                    if (byteBufferValue != null) {
                        TLRPC.ChatFull TLdeserialize = TLRPC.ChatFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                        if (TLdeserialize instanceof TLRPC.TL_channelFull) {
                            hashMap.put(Long.valueOf(longValue), Integer.valueOf(intValue));
                        }
                    }
                }
                sQLiteCursor.dispose();
                return hashMap;
            } catch (Exception e) {
                n(e, true);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                return hashMap;
            }
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public final void f1(int i, int i2, long j, ArrayList arrayList, boolean z) {
        g1(arrayList, z, true, false, i, false, i2, j);
    }

    public final void f2(int i, long j, long j2, boolean z) {
        this.a.c(new xa7(this, j2, z, "unread_reactions", j, i, "reaction_mentions_topics", "unread_reactions", "reaction_mentions"));
    }

    public final void g() {
        gl.c3(new vb7(this, (byte) 13));
    }

    public final TLRPC.User g0(long j) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(j));
            k0(arrayList2, arrayList, false);
            if (arrayList.isEmpty()) {
                return null;
            }
            return (TLRPC.User) arrayList.get(0);
        } catch (Exception e) {
            n(e, true);
            return null;
        }
    }

    public final void g1(final ArrayList arrayList, final boolean z, boolean z2, final boolean z3, final int i, final boolean z4, final int i2, final long j) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (!z2) {
            h1(arrayList, z, z3, i, z4, i2, j);
        } else {
            this.a.c(new Runnable() { // from class: qb7
                @Override // java.lang.Runnable
                public final void run() {
                    ad7.this.h1(arrayList, z, z3, i, z4, i2, j);
                }
            });
        }
    }

    public final void g2(TLRPC.UserFull userFull, boolean z) {
        this.a.c(new vj6((Object) this, (Object) userFull, z, (byte) 3));
    }

    public final void h(Long l) {
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.b;
                Locale locale = Locale.US;
                queryFinalized = sQLiteDatabase.queryFinalized("SELECT COUNT(mid) FROM scheduled_messages_v2 WHERE uid = " + l, new Object[0]);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            int intValue = queryFinalized.next() ? queryFinalized.intValue(0) : 0;
            queryFinalized.dispose();
            gl.c3(new j45((Object) this, (Object) l, intValue, (byte) 14));
        } catch (Exception e2) {
            e = e2;
            sQLiteCursor = queryFinalized;
            n(e, true);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursor = queryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public final TLRPC.User h0(long j) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        TLRPC.User[] userArr = new TLRPC.User[1];
        this.a.c(new m77((Object) this, (Object) userArr, j, (Object) countDownLatch, (byte) 22));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            n(e, true);
        }
        return userArr[0];
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void h1(java.util.ArrayList r62, boolean r63, boolean r64, int r65, boolean r66, int r67, long r68) {
        /*
            Method dump skipped, instructions count: 8633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad7.h1(java.util.ArrayList, boolean, boolean, int, boolean, int, long):void");
    }

    public final void h2(ArrayList arrayList, boolean z) {
        if (arrayList.isEmpty()) {
            return;
        }
        this.a.c(new eb7(this, arrayList, z, (byte) 0));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r23v1 int, still in use, count: 2, list:
          (r23v1 int) from 0x0609: IF  (r23v1 int) != (0 int)  -> B:347:0x060b A[HIDDEN] (LINE:1546)
          (r23v1 int) from 0x060b: PHI (r23v2 int) = (r23v1 int) binds: [B:374:0x0609] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b2 A[Catch: all -> 0x06d2, Exception -> 0x06d5, TryCatch #5 {Exception -> 0x06d5, all -> 0x06d2, blocks: (B:8:0x000a, B:23:0x0031, B:25:0x0034, B:69:0x011a, B:71:0x0140, B:73:0x014b, B:75:0x016f, B:78:0x0179, B:79:0x0180, B:81:0x0186, B:83:0x01c5, B:84:0x0193, B:86:0x0197, B:88:0x01a4, B:90:0x01a8, B:92:0x01ac, B:94:0x01b9, B:97:0x01d8, B:100:0x01e6, B:102:0x01ff, B:104:0x020c, B:106:0x0220, B:108:0x0228, B:112:0x029f, B:113:0x0241, B:115:0x025e, B:118:0x0268, B:119:0x026f, B:121:0x0273, B:123:0x0277, B:124:0x0292, B:126:0x0286, B:129:0x02ac, B:131:0x02b2, B:133:0x02c4, B:137:0x0390, B:138:0x02dc, B:140:0x02e2, B:142:0x02e8, B:144:0x02ee, B:146:0x030a, B:150:0x0322, B:153:0x0331, B:154:0x0339, B:156:0x033f, B:158:0x0345, B:159:0x0352, B:161:0x0358, B:163:0x035c, B:164:0x0369, B:165:0x0375, B:170:0x037b, B:173:0x0398, B:174:0x039f, B:178:0x03a8, B:182:0x03b1, B:187:0x03c5, B:188:0x03dd, B:190:0x03e3, B:192:0x03e7, B:194:0x03f1, B:195:0x03f8, B:197:0x03fc, B:199:0x0409, B:200:0x040e, B:202:0x0412, B:204:0x0416, B:206:0x0421, B:207:0x0426, B:209:0x042a, B:211:0x0437, B:212:0x043a, B:214:0x043e, B:216:0x0442, B:218:0x044d, B:219:0x0452, B:221:0x0456, B:223:0x0463, B:224:0x0466, B:226:0x046a, B:228:0x046e, B:230:0x0479, B:231:0x047e, B:233:0x0482, B:235:0x048f, B:236:0x0492, B:238:0x0496, B:240:0x049a, B:242:0x04a5, B:243:0x04aa, B:245:0x04ae, B:247:0x04bb, B:249:0x04c0, B:251:0x04c6, B:253:0x04da, B:255:0x04e5, B:258:0x04f0, B:265:0x0510, B:270:0x0526, B:272:0x052a, B:273:0x053f, B:275:0x0542, B:278:0x056a, B:279:0x0547, B:281:0x054b, B:284:0x0564, B:286:0x0558, B:288:0x055c, B:293:0x052f, B:295:0x0533, B:297:0x0537, B:298:0x053b, B:299:0x051f, B:307:0x05c0, B:308:0x0576, B:310:0x0583, B:312:0x0589, B:314:0x058d, B:315:0x0596, B:317:0x0599, B:319:0x059d, B:321:0x05a6, B:323:0x05b1, B:325:0x05b5, B:329:0x05be, B:331:0x0592, B:334:0x05cc, B:336:0x05db, B:343:0x05f8, B:347:0x060b, B:349:0x060f, B:350:0x0624, B:352:0x0627, B:354:0x062b, B:357:0x063a, B:359:0x063e, B:363:0x0646, B:362:0x064c, B:367:0x0614, B:369:0x0618, B:371:0x061c, B:372:0x0620, B:373:0x0605, B:381:0x069f, B:382:0x0656, B:384:0x0662, B:386:0x0668, B:388:0x066c, B:389:0x0675, B:391:0x0678, B:393:0x067c, B:396:0x0685, B:398:0x0689, B:400:0x0692, B:403:0x069d, B:406:0x0671, B:409:0x06a4, B:411:0x06a8, B:416:0x06b3, B:418:0x06b7, B:422:0x06bc, B:424:0x06c0, B:431:0x03c8, B:433:0x03cc, B:435:0x03d4, B:436:0x03d6, B:438:0x03da), top: B:7:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0322 A[Catch: all -> 0x06d2, Exception -> 0x06d5, TryCatch #5 {Exception -> 0x06d5, all -> 0x06d2, blocks: (B:8:0x000a, B:23:0x0031, B:25:0x0034, B:69:0x011a, B:71:0x0140, B:73:0x014b, B:75:0x016f, B:78:0x0179, B:79:0x0180, B:81:0x0186, B:83:0x01c5, B:84:0x0193, B:86:0x0197, B:88:0x01a4, B:90:0x01a8, B:92:0x01ac, B:94:0x01b9, B:97:0x01d8, B:100:0x01e6, B:102:0x01ff, B:104:0x020c, B:106:0x0220, B:108:0x0228, B:112:0x029f, B:113:0x0241, B:115:0x025e, B:118:0x0268, B:119:0x026f, B:121:0x0273, B:123:0x0277, B:124:0x0292, B:126:0x0286, B:129:0x02ac, B:131:0x02b2, B:133:0x02c4, B:137:0x0390, B:138:0x02dc, B:140:0x02e2, B:142:0x02e8, B:144:0x02ee, B:146:0x030a, B:150:0x0322, B:153:0x0331, B:154:0x0339, B:156:0x033f, B:158:0x0345, B:159:0x0352, B:161:0x0358, B:163:0x035c, B:164:0x0369, B:165:0x0375, B:170:0x037b, B:173:0x0398, B:174:0x039f, B:178:0x03a8, B:182:0x03b1, B:187:0x03c5, B:188:0x03dd, B:190:0x03e3, B:192:0x03e7, B:194:0x03f1, B:195:0x03f8, B:197:0x03fc, B:199:0x0409, B:200:0x040e, B:202:0x0412, B:204:0x0416, B:206:0x0421, B:207:0x0426, B:209:0x042a, B:211:0x0437, B:212:0x043a, B:214:0x043e, B:216:0x0442, B:218:0x044d, B:219:0x0452, B:221:0x0456, B:223:0x0463, B:224:0x0466, B:226:0x046a, B:228:0x046e, B:230:0x0479, B:231:0x047e, B:233:0x0482, B:235:0x048f, B:236:0x0492, B:238:0x0496, B:240:0x049a, B:242:0x04a5, B:243:0x04aa, B:245:0x04ae, B:247:0x04bb, B:249:0x04c0, B:251:0x04c6, B:253:0x04da, B:255:0x04e5, B:258:0x04f0, B:265:0x0510, B:270:0x0526, B:272:0x052a, B:273:0x053f, B:275:0x0542, B:278:0x056a, B:279:0x0547, B:281:0x054b, B:284:0x0564, B:286:0x0558, B:288:0x055c, B:293:0x052f, B:295:0x0533, B:297:0x0537, B:298:0x053b, B:299:0x051f, B:307:0x05c0, B:308:0x0576, B:310:0x0583, B:312:0x0589, B:314:0x058d, B:315:0x0596, B:317:0x0599, B:319:0x059d, B:321:0x05a6, B:323:0x05b1, B:325:0x05b5, B:329:0x05be, B:331:0x0592, B:334:0x05cc, B:336:0x05db, B:343:0x05f8, B:347:0x060b, B:349:0x060f, B:350:0x0624, B:352:0x0627, B:354:0x062b, B:357:0x063a, B:359:0x063e, B:363:0x0646, B:362:0x064c, B:367:0x0614, B:369:0x0618, B:371:0x061c, B:372:0x0620, B:373:0x0605, B:381:0x069f, B:382:0x0656, B:384:0x0662, B:386:0x0668, B:388:0x066c, B:389:0x0675, B:391:0x0678, B:393:0x067c, B:396:0x0685, B:398:0x0689, B:400:0x0692, B:403:0x069d, B:406:0x0671, B:409:0x06a4, B:411:0x06a8, B:416:0x06b3, B:418:0x06b7, B:422:0x06bc, B:424:0x06c0, B:431:0x03c8, B:433:0x03cc, B:435:0x03d4, B:436:0x03d6, B:438:0x03da), top: B:7:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0331 A[Catch: all -> 0x06d2, Exception -> 0x06d5, TryCatch #5 {Exception -> 0x06d5, all -> 0x06d2, blocks: (B:8:0x000a, B:23:0x0031, B:25:0x0034, B:69:0x011a, B:71:0x0140, B:73:0x014b, B:75:0x016f, B:78:0x0179, B:79:0x0180, B:81:0x0186, B:83:0x01c5, B:84:0x0193, B:86:0x0197, B:88:0x01a4, B:90:0x01a8, B:92:0x01ac, B:94:0x01b9, B:97:0x01d8, B:100:0x01e6, B:102:0x01ff, B:104:0x020c, B:106:0x0220, B:108:0x0228, B:112:0x029f, B:113:0x0241, B:115:0x025e, B:118:0x0268, B:119:0x026f, B:121:0x0273, B:123:0x0277, B:124:0x0292, B:126:0x0286, B:129:0x02ac, B:131:0x02b2, B:133:0x02c4, B:137:0x0390, B:138:0x02dc, B:140:0x02e2, B:142:0x02e8, B:144:0x02ee, B:146:0x030a, B:150:0x0322, B:153:0x0331, B:154:0x0339, B:156:0x033f, B:158:0x0345, B:159:0x0352, B:161:0x0358, B:163:0x035c, B:164:0x0369, B:165:0x0375, B:170:0x037b, B:173:0x0398, B:174:0x039f, B:178:0x03a8, B:182:0x03b1, B:187:0x03c5, B:188:0x03dd, B:190:0x03e3, B:192:0x03e7, B:194:0x03f1, B:195:0x03f8, B:197:0x03fc, B:199:0x0409, B:200:0x040e, B:202:0x0412, B:204:0x0416, B:206:0x0421, B:207:0x0426, B:209:0x042a, B:211:0x0437, B:212:0x043a, B:214:0x043e, B:216:0x0442, B:218:0x044d, B:219:0x0452, B:221:0x0456, B:223:0x0463, B:224:0x0466, B:226:0x046a, B:228:0x046e, B:230:0x0479, B:231:0x047e, B:233:0x0482, B:235:0x048f, B:236:0x0492, B:238:0x0496, B:240:0x049a, B:242:0x04a5, B:243:0x04aa, B:245:0x04ae, B:247:0x04bb, B:249:0x04c0, B:251:0x04c6, B:253:0x04da, B:255:0x04e5, B:258:0x04f0, B:265:0x0510, B:270:0x0526, B:272:0x052a, B:273:0x053f, B:275:0x0542, B:278:0x056a, B:279:0x0547, B:281:0x054b, B:284:0x0564, B:286:0x0558, B:288:0x055c, B:293:0x052f, B:295:0x0533, B:297:0x0537, B:298:0x053b, B:299:0x051f, B:307:0x05c0, B:308:0x0576, B:310:0x0583, B:312:0x0589, B:314:0x058d, B:315:0x0596, B:317:0x0599, B:319:0x059d, B:321:0x05a6, B:323:0x05b1, B:325:0x05b5, B:329:0x05be, B:331:0x0592, B:334:0x05cc, B:336:0x05db, B:343:0x05f8, B:347:0x060b, B:349:0x060f, B:350:0x0624, B:352:0x0627, B:354:0x062b, B:357:0x063a, B:359:0x063e, B:363:0x0646, B:362:0x064c, B:367:0x0614, B:369:0x0618, B:371:0x061c, B:372:0x0620, B:373:0x0605, B:381:0x069f, B:382:0x0656, B:384:0x0662, B:386:0x0668, B:388:0x066c, B:389:0x0675, B:391:0x0678, B:393:0x067c, B:396:0x0685, B:398:0x0689, B:400:0x0692, B:403:0x069d, B:406:0x0671, B:409:0x06a4, B:411:0x06a8, B:416:0x06b3, B:418:0x06b7, B:422:0x06bc, B:424:0x06c0, B:431:0x03c8, B:433:0x03cc, B:435:0x03d4, B:436:0x03d6, B:438:0x03da), top: B:7:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x033f A[Catch: all -> 0x06d2, Exception -> 0x06d5, TryCatch #5 {Exception -> 0x06d5, all -> 0x06d2, blocks: (B:8:0x000a, B:23:0x0031, B:25:0x0034, B:69:0x011a, B:71:0x0140, B:73:0x014b, B:75:0x016f, B:78:0x0179, B:79:0x0180, B:81:0x0186, B:83:0x01c5, B:84:0x0193, B:86:0x0197, B:88:0x01a4, B:90:0x01a8, B:92:0x01ac, B:94:0x01b9, B:97:0x01d8, B:100:0x01e6, B:102:0x01ff, B:104:0x020c, B:106:0x0220, B:108:0x0228, B:112:0x029f, B:113:0x0241, B:115:0x025e, B:118:0x0268, B:119:0x026f, B:121:0x0273, B:123:0x0277, B:124:0x0292, B:126:0x0286, B:129:0x02ac, B:131:0x02b2, B:133:0x02c4, B:137:0x0390, B:138:0x02dc, B:140:0x02e2, B:142:0x02e8, B:144:0x02ee, B:146:0x030a, B:150:0x0322, B:153:0x0331, B:154:0x0339, B:156:0x033f, B:158:0x0345, B:159:0x0352, B:161:0x0358, B:163:0x035c, B:164:0x0369, B:165:0x0375, B:170:0x037b, B:173:0x0398, B:174:0x039f, B:178:0x03a8, B:182:0x03b1, B:187:0x03c5, B:188:0x03dd, B:190:0x03e3, B:192:0x03e7, B:194:0x03f1, B:195:0x03f8, B:197:0x03fc, B:199:0x0409, B:200:0x040e, B:202:0x0412, B:204:0x0416, B:206:0x0421, B:207:0x0426, B:209:0x042a, B:211:0x0437, B:212:0x043a, B:214:0x043e, B:216:0x0442, B:218:0x044d, B:219:0x0452, B:221:0x0456, B:223:0x0463, B:224:0x0466, B:226:0x046a, B:228:0x046e, B:230:0x0479, B:231:0x047e, B:233:0x0482, B:235:0x048f, B:236:0x0492, B:238:0x0496, B:240:0x049a, B:242:0x04a5, B:243:0x04aa, B:245:0x04ae, B:247:0x04bb, B:249:0x04c0, B:251:0x04c6, B:253:0x04da, B:255:0x04e5, B:258:0x04f0, B:265:0x0510, B:270:0x0526, B:272:0x052a, B:273:0x053f, B:275:0x0542, B:278:0x056a, B:279:0x0547, B:281:0x054b, B:284:0x0564, B:286:0x0558, B:288:0x055c, B:293:0x052f, B:295:0x0533, B:297:0x0537, B:298:0x053b, B:299:0x051f, B:307:0x05c0, B:308:0x0576, B:310:0x0583, B:312:0x0589, B:314:0x058d, B:315:0x0596, B:317:0x0599, B:319:0x059d, B:321:0x05a6, B:323:0x05b1, B:325:0x05b5, B:329:0x05be, B:331:0x0592, B:334:0x05cc, B:336:0x05db, B:343:0x05f8, B:347:0x060b, B:349:0x060f, B:350:0x0624, B:352:0x0627, B:354:0x062b, B:357:0x063a, B:359:0x063e, B:363:0x0646, B:362:0x064c, B:367:0x0614, B:369:0x0618, B:371:0x061c, B:372:0x0620, B:373:0x0605, B:381:0x069f, B:382:0x0656, B:384:0x0662, B:386:0x0668, B:388:0x066c, B:389:0x0675, B:391:0x0678, B:393:0x067c, B:396:0x0685, B:398:0x0689, B:400:0x0692, B:403:0x069d, B:406:0x0671, B:409:0x06a4, B:411:0x06a8, B:416:0x06b3, B:418:0x06b7, B:422:0x06bc, B:424:0x06c0, B:431:0x03c8, B:433:0x03cc, B:435:0x03d4, B:436:0x03d6, B:438:0x03da), top: B:7:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04e5 A[Catch: all -> 0x06d2, Exception -> 0x06d5, TryCatch #5 {Exception -> 0x06d5, all -> 0x06d2, blocks: (B:8:0x000a, B:23:0x0031, B:25:0x0034, B:69:0x011a, B:71:0x0140, B:73:0x014b, B:75:0x016f, B:78:0x0179, B:79:0x0180, B:81:0x0186, B:83:0x01c5, B:84:0x0193, B:86:0x0197, B:88:0x01a4, B:90:0x01a8, B:92:0x01ac, B:94:0x01b9, B:97:0x01d8, B:100:0x01e6, B:102:0x01ff, B:104:0x020c, B:106:0x0220, B:108:0x0228, B:112:0x029f, B:113:0x0241, B:115:0x025e, B:118:0x0268, B:119:0x026f, B:121:0x0273, B:123:0x0277, B:124:0x0292, B:126:0x0286, B:129:0x02ac, B:131:0x02b2, B:133:0x02c4, B:137:0x0390, B:138:0x02dc, B:140:0x02e2, B:142:0x02e8, B:144:0x02ee, B:146:0x030a, B:150:0x0322, B:153:0x0331, B:154:0x0339, B:156:0x033f, B:158:0x0345, B:159:0x0352, B:161:0x0358, B:163:0x035c, B:164:0x0369, B:165:0x0375, B:170:0x037b, B:173:0x0398, B:174:0x039f, B:178:0x03a8, B:182:0x03b1, B:187:0x03c5, B:188:0x03dd, B:190:0x03e3, B:192:0x03e7, B:194:0x03f1, B:195:0x03f8, B:197:0x03fc, B:199:0x0409, B:200:0x040e, B:202:0x0412, B:204:0x0416, B:206:0x0421, B:207:0x0426, B:209:0x042a, B:211:0x0437, B:212:0x043a, B:214:0x043e, B:216:0x0442, B:218:0x044d, B:219:0x0452, B:221:0x0456, B:223:0x0463, B:224:0x0466, B:226:0x046a, B:228:0x046e, B:230:0x0479, B:231:0x047e, B:233:0x0482, B:235:0x048f, B:236:0x0492, B:238:0x0496, B:240:0x049a, B:242:0x04a5, B:243:0x04aa, B:245:0x04ae, B:247:0x04bb, B:249:0x04c0, B:251:0x04c6, B:253:0x04da, B:255:0x04e5, B:258:0x04f0, B:265:0x0510, B:270:0x0526, B:272:0x052a, B:273:0x053f, B:275:0x0542, B:278:0x056a, B:279:0x0547, B:281:0x054b, B:284:0x0564, B:286:0x0558, B:288:0x055c, B:293:0x052f, B:295:0x0533, B:297:0x0537, B:298:0x053b, B:299:0x051f, B:307:0x05c0, B:308:0x0576, B:310:0x0583, B:312:0x0589, B:314:0x058d, B:315:0x0596, B:317:0x0599, B:319:0x059d, B:321:0x05a6, B:323:0x05b1, B:325:0x05b5, B:329:0x05be, B:331:0x0592, B:334:0x05cc, B:336:0x05db, B:343:0x05f8, B:347:0x060b, B:349:0x060f, B:350:0x0624, B:352:0x0627, B:354:0x062b, B:357:0x063a, B:359:0x063e, B:363:0x0646, B:362:0x064c, B:367:0x0614, B:369:0x0618, B:371:0x061c, B:372:0x0620, B:373:0x0605, B:381:0x069f, B:382:0x0656, B:384:0x0662, B:386:0x0668, B:388:0x066c, B:389:0x0675, B:391:0x0678, B:393:0x067c, B:396:0x0685, B:398:0x0689, B:400:0x0692, B:403:0x069d, B:406:0x0671, B:409:0x06a4, B:411:0x06a8, B:416:0x06b3, B:418:0x06b7, B:422:0x06bc, B:424:0x06c0, B:431:0x03c8, B:433:0x03cc, B:435:0x03d4, B:436:0x03d6, B:438:0x03da), top: B:7:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06ab  */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(boolean r28) {
        /*
            Method dump skipped, instructions count: 1767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad7.i(boolean):void");
    }

    public final ArrayList i0(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        try {
            k0(arrayList, arrayList2, false);
            return arrayList2;
        } catch (Exception e) {
            arrayList2.clear();
            n(e, true);
            return arrayList2;
        }
    }

    public final void i1(String str, TLObject tLObject, int i, String str2) {
        if (str == null || tLObject == null) {
            return;
        }
        this.a.c(new bb6(this, str, tLObject, i, str2, (byte) 3));
    }

    public final void i2(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        try {
            SQLiteDatabase sQLiteDatabase = this.b;
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT DISTINCT id FROM shortcut_widget WHERE did IN(" + TextUtils.join(",", arrayList) + ",-1)", new Object[0]);
            ArrayList arrayList2 = null;
            while (queryFinalized.next()) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(Integer.valueOf(queryFinalized.intValue(0)));
            }
            queryFinalized.dispose();
            if (arrayList2 != null) {
                gl.c3(new re(arrayList2, (byte) 6));
            }
        } catch (Exception e) {
            n(e, true);
        }
    }

    public final void j(int i) {
        SparseArray sparseArray = this.h;
        ArrayList arrayList = (ArrayList) sparseArray.get(i);
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.a.a((Runnable) arrayList.get(i2));
        }
        sparseArray.remove(i);
    }

    public final void j0(ArrayList arrayList, ArrayList arrayList2) {
        k0(arrayList, arrayList2, false);
    }

    public final void j1(List list, List list2, boolean z, boolean z2) {
        if (list == null || !list.isEmpty() || list2 == null || !list2.isEmpty()) {
            if (!z2) {
                k1(list, list2, z);
            } else {
                this.a.c(new d97((Object) this, (Object) list, (Object) list2, z, (byte) 2));
            }
        }
    }

    public final void k(int i) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                boolean z = false;
                sQLiteCursor = this.b.queryFinalized("SELECT did FROM dialogs WHERE folder_id = ?", Integer.valueOf(i));
                while (true) {
                    if (!sQLiteCursor.next()) {
                        z = true;
                        break;
                    }
                    long longValue = sQLiteCursor.longValue(0);
                    if (!cf3.D(longValue) && !cf3.B(longValue)) {
                        TLRPC.Chat N = N(-longValue);
                        if (!hc2.r0(N) && N.migrated_to == null) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                sQLiteCursor.dispose();
                if (z) {
                    gl.c3(new wa7(this, i, (byte) 4));
                    this.b.executeFast("DELETE FROM dialogs WHERE did = " + (i | 2305843009213693952L)).stepThis().dispose();
                }
                sQLiteCursor.dispose();
            } catch (Exception e) {
                n(e, true);
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

    public final void k0(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        if (arrayList.isEmpty() || arrayList2 == null) {
            return;
        }
        if (arrayList.size() > 50) {
            int i = 0;
            while (i < arrayList.size()) {
                Long l = (Long) arrayList.get(i);
                l.getClass();
                TLRPC.User V1 = getMessagesController().V1(l);
                if (V1 != null) {
                    arrayList2.add(V1);
                    arrayList.remove(i);
                    i--;
                }
                i++;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = this.b;
        Locale locale = Locale.US;
        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(tb4.y("SELECT data, status FROM users WHERE uid IN(", TextUtils.join(",", arrayList), ")"), new Object[0]);
        while (queryFinalized.next()) {
            try {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.User TLdeserialize = TLRPC.User.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    byteBufferValue.reuse();
                    if (TLdeserialize != null) {
                        TLRPC.UserStatus userStatus = TLdeserialize.status;
                        if (userStatus != null) {
                            userStatus.expires = queryFinalized.intValue(1);
                        }
                        arrayList2.add(TLdeserialize);
                        if (arrayList.size() > 50 && z) {
                            getMessagesController().a4(TLdeserialize, true, false);
                        }
                    }
                }
            } catch (Exception e) {
                n(e, true);
            }
        }
        queryFinalized.dispose();
    }

    public final void k1(List list, List list2, boolean z) {
        try {
            if (z) {
                try {
                    this.b.beginTransaction();
                } catch (Exception e) {
                    n(e, true);
                    SQLiteDatabase sQLiteDatabase = this.b;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.commitTransaction();
                        return;
                    }
                    return;
                }
            }
            l1(list);
            Y0(list2);
            SQLiteDatabase sQLiteDatabase2 = this.b;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.commitTransaction();
            }
        } catch (Throwable th) {
            SQLiteDatabase sQLiteDatabase3 = this.b;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.commitTransaction();
            }
            throw th;
        }
    }

    public final boolean l(long j) {
        boolean[] zArr = new boolean[1];
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.a.c(new gb7(this, j, zArr, countDownLatch, (byte) 2));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            n(e, true);
        }
        return zArr[0];
    }

    public final void l0(ArrayList arrayList, HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        if (hashSet.size() > 50) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                TLRPC.User V1 = getMessagesController().V1((Long) it.next());
                if (V1 != null) {
                    arrayList.add(V1);
                    it.remove();
                }
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = this.b;
        Locale locale = Locale.US;
        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(tb4.y("SELECT data, status FROM users WHERE uid IN(", TextUtils.join(",", hashSet), ")"), new Object[0]);
        while (queryFinalized.next()) {
            try {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.User TLdeserialize = TLRPC.User.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    byteBufferValue.reuse();
                    if (TLdeserialize != null) {
                        TLRPC.UserStatus userStatus = TLdeserialize.status;
                        if (userStatus != null) {
                            userStatus.expires = queryFinalized.intValue(1);
                        }
                        arrayList.add(TLdeserialize);
                    }
                }
            } catch (Exception e) {
                n(e, true);
            }
        }
        queryFinalized.dispose();
    }

    public final void l1(List list) {
        int i;
        if (list == null || list.isEmpty()) {
            return;
        }
        SQLitePreparedStatement executeFast = this.b.executeFast("REPLACE INTO users VALUES(?, ?, ?, ?)");
        for (int i2 = 0; i2 < list.size(); i2++) {
            TLRPC.User user = (TLRPC.User) list.get(i2);
            if (user != null) {
                if (user.min) {
                    SQLiteDatabase sQLiteDatabase = this.b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(ls6.n(user.id, "SELECT data FROM users WHERE uid = "), new Object[0]);
                    if (queryFinalized.next()) {
                        try {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC.User TLdeserialize = TLRPC.User.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                byteBufferValue.reuse();
                                if (TLdeserialize != null) {
                                    String str = user.username;
                                    if (str != null) {
                                        TLdeserialize.username = str;
                                        i = TLdeserialize.flags | 8;
                                        TLdeserialize.flags = i;
                                    } else {
                                        TLdeserialize.username = null;
                                        i = TLdeserialize.flags & (-9);
                                        TLdeserialize.flags = i;
                                    }
                                    if (user.apply_min_photo) {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                                        if (userProfilePhoto != null) {
                                            TLdeserialize.photo = userProfilePhoto;
                                            TLdeserialize.flags = i | 32;
                                        } else {
                                            TLdeserialize.photo = null;
                                            TLdeserialize.flags = i & (-33);
                                        }
                                    }
                                    user = TLdeserialize;
                                }
                            }
                        } catch (Exception e) {
                            n(e, true);
                        }
                    }
                    queryFinalized.dispose();
                }
                executeFast.requery();
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(user.getObjectSize());
                user.serializeToStream(nativeByteBuffer);
                executeFast.bindLong(1, user.id);
                executeFast.bindString(2, J(user));
                TLRPC.UserStatus userStatus = user.status;
                if (userStatus != null) {
                    if (userStatus instanceof TLRPC.TL_userStatusRecently) {
                        userStatus.expires = userStatus.by_me ? -1000 : -100;
                    } else if (userStatus instanceof TLRPC.TL_userStatusLastWeek) {
                        userStatus.expires = userStatus.by_me ? -1001 : -101;
                    } else if (userStatus instanceof TLRPC.TL_userStatusLastMonth) {
                        userStatus.expires = userStatus.by_me ? -1002 : -102;
                    }
                    executeFast.bindInteger(3, userStatus.expires);
                } else {
                    executeFast.bindInteger(3, 0);
                }
                executeFast.bindByteBuffer(4, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
                this.S.delete(user.id);
            }
        }
        executeFast.dispose();
    }

    public final void m(Exception exc) {
        n(exc, true);
    }

    public final void m0() {
        this.a.c(new vb7(this, (byte) 23));
    }

    public final void m1(int i, ArrayList arrayList) {
        this.a.c(new za7(this, i, arrayList, (byte) 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x039e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0351 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(Throwable th, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        long j;
        boolean z2;
        boolean z3;
        ad7 ad7Var;
        ?? r11;
        boolean z4;
        ad7 ad7Var2;
        ad7 ad7Var3;
        SQLiteDatabase sQLiteDatabase;
        int intValue;
        SQLiteCursor sQLiteCursor;
        long longValue;
        HashSet hashSet;
        int i;
        if (!(th instanceof SQLiteException) || th.getMessage() == null || !th.getMessage().contains("is malformed") || this.T) {
            fa4.g(th, z);
            return;
        }
        this.T = true;
        fa4.d("disk image malformed detected, try recover");
        String str5 = "PRAGMA journal_mode = WAL";
        String str6 = "PRAGMA temp_store = MEMORY";
        String str7 = "PRAGMA secure_delete = ON";
        this.b.close();
        File file = this.c;
        File file2 = this.d;
        File file3 = this.e;
        File file4 = new File(a.h(), tb4.n(this.currentAccount, "recover_database_", "/"));
        file4.mkdirs();
        File file5 = new File(file4, "cache4.db");
        File file6 = new File(file4, "cache4.db-wal");
        File file7 = new File(file4, "cache4.db-shm");
        try {
            file5.delete();
            file6.delete();
            file7.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        fa4.b("start recover database");
        try {
            j = System.currentTimeMillis();
            try {
                sQLiteDatabase = new SQLiteDatabase(file5.getPath());
                sQLiteDatabase.executeFast("PRAGMA secure_delete = ON").stepThis().dispose();
                sQLiteDatabase.executeFast("PRAGMA temp_store = MEMORY").stepThis().dispose();
                sQLiteDatabase.executeFast("PRAGMA journal_mode = WAL").stepThis().dispose();
                sQLiteDatabase.executeFast("PRAGMA journal_size_limit = 10485760").stepThis().dispose();
                z(sQLiteDatabase);
                sQLiteDatabase.executeFast("ATTACH DATABASE \"" + file.getAbsolutePath() + "\" AS old;").stepThis().dispose();
                str = "PRAGMA journal_size_limit = 10485760";
            } catch (Exception e2) {
                e = e2;
                str = "PRAGMA journal_size_limit = 10485760";
            }
        } catch (Exception e3) {
            e = e3;
            str = "PRAGMA journal_size_limit = 10485760";
            str2 = "PRAGMA journal_mode = WAL";
            str3 = "PRAGMA temp_store = MEMORY";
            str4 = "PRAGMA secure_delete = ON";
            j = 0;
        }
        try {
            intValue = sQLiteDatabase.executeInt("PRAGMA old.user_version", new Object[0]).intValue();
        } catch (Exception e4) {
            e = e4;
            str2 = "PRAGMA journal_mode = WAL";
            str3 = str6;
            str4 = str7;
            fa4.g(e, true);
            z2 = false;
            if (z2) {
            }
            z3 = false;
            fa4.d("Database restored = " + z3);
            if (z3) {
            }
            r11 = 1;
            z4 = z3;
            ad7Var2 = ad7Var3;
            if (!z4) {
            }
            if (!z4) {
            }
        }
        if (intValue != 182) {
            fa4.d("can't restore database from version " + intValue);
            str2 = "PRAGMA journal_mode = WAL";
            str3 = "PRAGMA temp_store = MEMORY";
            str4 = "PRAGMA secure_delete = ON";
            z3 = false;
            fa4.d("Database restored = " + z3);
            if (z3) {
                ad7Var3 = this;
            } else {
                try {
                    ad7Var = this;
                } catch (SQLiteException e5) {
                    e = e5;
                    ad7Var = this;
                }
                try {
                    SQLiteDatabase sQLiteDatabase2 = new SQLiteDatabase(ad7Var.c.getPath());
                    ad7Var.b = sQLiteDatabase2;
                    sQLiteDatabase2.executeFast(str4).stepThis().dispose();
                    ad7Var.b.executeFast(str3).stepThis().dispose();
                    ad7Var.b.executeFast(str2).stepThis().dispose();
                    ad7Var.b.executeFast(str).stepThis().dispose();
                    ad7Var3 = ad7Var;
                } catch (SQLiteException e6) {
                    e = e6;
                    r11 = 1;
                    fa4.g(new Exception(e), true);
                    z4 = false;
                    ad7Var2 = ad7Var;
                    if (!z4) {
                    }
                    if (!z4) {
                    }
                }
            }
            r11 = 1;
            z4 = z3;
            ad7Var2 = ad7Var3;
            if (!z4) {
                ad7Var2.o(r11);
                ad7Var2.S0(r11);
                z4 = ad7Var2.P;
                fa4.d("Try create new database = " + z4);
            }
            if (!z4) {
                fa4.g(new Exception(th), z);
                return;
            }
            ad7Var2.p1();
            ad7Var2.T = false;
            ad7Var2.r();
            gl.c3(new vb7(ad7Var2, (byte) 24));
            fa4.g(new Exception("database restored!!"), true);
            return;
        }
        HashSet hashSet2 = new HashSet();
        hashSet2.add("messages_v2");
        hashSet2.add("messages_holes");
        hashSet2.add("scheduled_messages_v2");
        hashSet2.add("media_holes_v2");
        hashSet2.add("media_v4");
        hashSet2.add("messages_holes_topics");
        hashSet2.add("messages_topics");
        hashSet2.add("media_topics");
        hashSet2.add("media_holes_topics");
        hashSet2.add("topics");
        hashSet2.add("media_counts_v2");
        hashSet2.add("media_counts_topics");
        hashSet2.add("dialogs");
        hashSet2.add("dialog_filter");
        hashSet2.add("dialog_filter_ep");
        hashSet2.add("dialog_filter_pin_v2");
        int i2 = 0;
        while (true) {
            String[] strArr = h0;
            if (i2 >= 76) {
                break;
            }
            String str8 = strArr[i2];
            if (hashSet2.contains(str8)) {
                hashSet = hashSet2;
                i = i2;
            } else {
                Locale locale = Locale.US;
                hashSet = hashSet2;
                StringBuilder sb = new StringBuilder();
                i = i2;
                sb.append("INSERT OR IGNORE INTO ");
                sb.append(str8);
                sb.append(" SELECT * FROM old.");
                sb.append(str8);
                sb.append(";");
                sQLiteDatabase.executeFast(sb.toString()).stepThis().dispose();
            }
            i2 = i + 1;
            hashSet2 = hashSet;
        }
        int i3 = 0;
        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT did FROM old.dialogs", new Object[0]);
        while (queryFinalized.next()) {
            long longValue2 = queryFinalized.longValue(i3);
            if (cf3.B(longValue2)) {
                arrayList.add(Long.valueOf(longValue2));
            } else {
                arrayList2.add(Long.valueOf(longValue2));
            }
            i3 = 0;
        }
        queryFinalized.dispose();
        int i4 = 0;
        while (i4 < arrayList.size()) {
            Long l = (Long) arrayList.get(i4);
            l.getClass();
            Locale locale2 = Locale.US;
            sQLiteDatabase.executeFast("INSERT OR IGNORE INTO messages_v2 SELECT * FROM old.messages_v2 WHERE uid = " + l + ";").stepThis().dispose();
            sQLiteDatabase.executeFast("INSERT OR IGNORE INTO messages_holes SELECT * FROM old.messages_holes WHERE uid = " + l + ";").stepThis().dispose();
            sQLiteDatabase.executeFast("INSERT OR IGNORE INTO media_holes_v2 SELECT * FROM old.media_holes_v2 WHERE uid = " + l + ";").stepThis().dispose();
            sQLiteDatabase.executeFast("INSERT OR IGNORE INTO media_v4 SELECT * FROM old.media_v4 WHERE uid = " + l + ";").stepThis().dispose();
            i4++;
            arrayList = arrayList;
        }
        SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO messages_holes VALUES(?, ?, ?)");
        SQLitePreparedStatement executeFast2 = sQLiteDatabase.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
        int i5 = 0;
        while (i5 < arrayList2.size()) {
            Long l2 = (Long) arrayList2.get(i5);
            int i6 = i5;
            SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT last_mid_i, last_mid FROM old.dialogs WHERE did = " + l2, new Object[0]);
            if (queryFinalized2.next()) {
                str2 = str5;
                try {
                    longValue = queryFinalized2.longValue(0);
                    str3 = str6;
                    str4 = str7;
                } catch (Exception e7) {
                    e = e7;
                    str3 = str6;
                    str4 = str7;
                    fa4.g(e, true);
                    z2 = false;
                    if (z2) {
                    }
                    z3 = false;
                    fa4.d("Database restored = " + z3);
                    if (z3) {
                    }
                    r11 = 1;
                    z4 = z3;
                    ad7Var2 = ad7Var3;
                    if (!z4) {
                    }
                    if (!z4) {
                    }
                }
                try {
                    long longValue3 = queryFinalized2.longValue(1);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("INSERT OR IGNORE INTO messages_v2 SELECT * FROM old.messages_v2 WHERE uid = ");
                    sb2.append(l2);
                    sQLiteCursor = queryFinalized2;
                    sb2.append(" AND mid IN (");
                    sb2.append(longValue);
                    sb2.append(",");
                    sb2.append(longValue3);
                    sb2.append(")");
                    sQLiteDatabase.executeFast(sb2.toString()).stepThis().dispose();
                    v(l2.longValue(), executeFast, executeFast2, (int) longValue3, 0L);
                } catch (Exception e8) {
                    e = e8;
                    fa4.g(e, true);
                    z2 = false;
                    if (z2) {
                    }
                    z3 = false;
                    fa4.d("Database restored = " + z3);
                    if (z3) {
                    }
                    r11 = 1;
                    z4 = z3;
                    ad7Var2 = ad7Var3;
                    if (!z4) {
                    }
                    if (!z4) {
                    }
                }
            } else {
                sQLiteCursor = queryFinalized2;
                str2 = str5;
                str3 = str6;
                str4 = str7;
            }
            sQLiteCursor.dispose();
            i5 = i6 + 1;
            str5 = str2;
            str6 = str3;
            str7 = str4;
        }
        str2 = str5;
        str3 = str6;
        str4 = str7;
        executeFast.dispose();
        executeFast2.dispose();
        sQLiteDatabase.executeFast("DETACH DATABASE old;").stepThis().dispose();
        sQLiteDatabase.close();
        z2 = true;
        if (z2) {
            try {
                file.delete();
                file2.delete();
                file3.delete();
                gl.E(file5, file);
                gl.E(file6, file2);
                gl.E(file7, file3);
                file5.delete();
                file6.delete();
                file7.delete();
                fa4.b("database recovered time " + (System.currentTimeMillis() - j));
                z3 = true;
            } catch (IOException e9) {
                e9.printStackTrace();
            }
            fa4.d("Database restored = " + z3);
            if (z3) {
            }
            r11 = 1;
            z4 = z3;
            ad7Var2 = ad7Var3;
            if (!z4) {
            }
            if (!z4) {
            }
        }
        z3 = false;
        fa4.d("Database restored = " + z3);
        if (z3) {
        }
        r11 = 1;
        z4 = z3;
        ad7Var2 = ad7Var3;
        if (!z4) {
        }
        if (!z4) {
        }
    }

    public final void n0(final int i, final int i2, final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3, final boolean z) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.a.c(new Runnable() { // from class: oc7
            /* JADX WARN: Type inference failed for: r15v11, types: [int] */
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList4;
                ArrayList arrayList5;
                ArrayList arrayList6;
                ad7 ad7Var = ad7.this;
                int i3 = i;
                CountDownLatch countDownLatch2 = countDownLatch;
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        SQLiteDatabase sQLiteDatabase = ad7Var.b;
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT did FROM shortcut_widget WHERE id = " + i3 + " ORDER BY ord ASC", new Object[0]);
                        while (true) {
                            try {
                                boolean next = queryFinalized.next();
                                arrayList4 = arrayList;
                                arrayList5 = arrayList2;
                                arrayList6 = arrayList3;
                                if (!next) {
                                    break;
                                }
                                long longValue = queryFinalized.longValue(0);
                                if (longValue != -1) {
                                    arrayList4.add(Long.valueOf(longValue));
                                    if (arrayList5 != null && arrayList6 != null) {
                                        if (cf3.D(longValue)) {
                                            arrayList7.add(Long.valueOf(longValue));
                                        } else {
                                            arrayList8.add(Long.valueOf(-longValue));
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                e = e;
                                sQLiteCursor = queryFinalized;
                            } catch (Throwable th) {
                                th = th;
                                sQLiteCursor = queryFinalized;
                            }
                        }
                        queryFinalized.dispose();
                        if (!z && arrayList4.isEmpty()) {
                            ?? r15 = i2;
                            try {
                                if (r15 == 0) {
                                    SQLiteCursor queryFinalized2 = ad7Var.b.queryFinalized("SELECT did FROM dialogs WHERE folder_id = 0 ORDER BY pinned DESC, date DESC LIMIT 0,10", new Object[0]);
                                    while (queryFinalized2.next()) {
                                        long longValue2 = queryFinalized2.longValue(0);
                                        if (!cf3.C(longValue2)) {
                                            arrayList4.add(Long.valueOf(longValue2));
                                            if (arrayList5 != null && arrayList6 != null) {
                                                if (cf3.D(longValue2)) {
                                                    arrayList7.add(Long.valueOf(longValue2));
                                                } else {
                                                    arrayList8.add(Long.valueOf(-longValue2));
                                                }
                                            }
                                        }
                                    }
                                    queryFinalized2.dispose();
                                } else {
                                    SQLiteCursor queryFinalized3 = ad7Var.getMessagesStorage().b.queryFinalized("SELECT did FROM chat_hints WHERE type = 0 ORDER BY rating DESC LIMIT 4", new Object[0]);
                                    while (queryFinalized3.next()) {
                                        long longValue3 = queryFinalized3.longValue(0);
                                        arrayList4.add(Long.valueOf(longValue3));
                                        if (arrayList5 != null && arrayList6 != null) {
                                            if (cf3.D(longValue3)) {
                                                arrayList7.add(Long.valueOf(longValue3));
                                            } else {
                                                arrayList8.add(Long.valueOf(-longValue3));
                                            }
                                        }
                                    }
                                    queryFinalized3.dispose();
                                }
                            } catch (Exception e2) {
                                sQLiteCursor = r15;
                                e = e2;
                                ad7Var.n(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                countDownLatch2.countDown();
                            } catch (Throwable th2) {
                                sQLiteCursor = r15;
                                th = th2;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                countDownLatch2.countDown();
                                throw th;
                            }
                        }
                        if (arrayList5 != null && arrayList6 != null) {
                            if (!arrayList8.isEmpty()) {
                                ad7Var.P(TextUtils.join(",", arrayList8), arrayList6);
                            }
                            if (!arrayList7.isEmpty()) {
                                ad7Var.k0(arrayList7, arrayList5, false);
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
                countDownLatch2.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            n(e, true);
        }
    }

    public final void n1(long j) {
        this.a.c(new ua7(this, j, (byte) 6));
    }

    public final void o(boolean z) {
        if (z) {
            p1();
        } else {
            p();
        }
        SQLiteDatabase sQLiteDatabase = this.b;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
            this.b = null;
        }
        if (z) {
            File file = this.c;
            if (file != null) {
                file.delete();
                this.c = null;
            }
            File file2 = this.d;
            if (file2 != null) {
                file2.delete();
                this.d = null;
            }
            File file3 = this.e;
            if (file3 != null) {
                file3.delete();
                this.e = null;
            }
        }
    }

    public final boolean o0(vf6 vf6Var, TLRPC.Chat chat) {
        long j = chat.linked_community_id;
        if (j == 0) {
            return false;
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) vf6Var.f(j);
        if (chat2 == null) {
            chat2 = N(chat.linked_community_id);
            vf6Var.k(chat2, chat.linked_community_id);
        }
        return chat2 != null && chat2.collapsed_in_dialogs;
    }

    public final void o1(TLRPC.Message message, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        if (message == null || (message instanceof TLRPC.TL_messageEmpty)) {
            return;
        }
        this.a.c(new z77((Object) this, (Object) message, z, (Object) arrayList, (Object) arrayList2, (byte) 1));
    }

    public final void p() {
        this.n = 0;
        this.w = 0;
        this.r = 0;
        this.s = 0;
        this.x = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.I.clear();
        this.J.clear();
        this.K.b();
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.y = null;
        this.E = 0;
    }

    public final void p1() {
        p();
        gl.c3(new vb7(this, (byte) 10));
    }

    public final void q(int i) {
        this.a.c(new kc7(this, i, (byte) 0));
    }

    public final void q1(boolean z) {
        int size = this.I.size();
        for (int i = 0; i < size; i++) {
            t97 t97Var = (t97) this.I.get(i);
            if (z) {
                int i2 = t97Var.g;
                int i3 = na7.q5;
                if ((i2 & 32) != 0) {
                    t97Var.e = -1;
                }
            } else {
                t97Var.e = -1;
            }
        }
        i(false);
        gl.c3(new vb7(this, (byte) 25));
    }

    public final void r() {
        for (int i = 0; i < 2; i++) {
            getUserConfig().w(i, 0, 0, 0L, 0L, 0L, 0L);
            getUserConfig().y(i, 0);
        }
        getUserConfig().u(false);
    }

    public final boolean r0(int i, long j) {
        return (X(j) & i) != 0;
    }

    public final void r1(long j) {
        LongSparseIntArray longSparseIntArray;
        SQLiteCursor sQLiteCursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.b;
            Locale locale = Locale.ENGLISH;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT topic_id FROM topics WHERE did = " + j + " AND unread_count > 0", new Object[0]);
            try {
                if (queryFinalized.next()) {
                    longSparseIntArray = null;
                } else {
                    longSparseIntArray = new LongSparseIntArray();
                    longSparseIntArray.put(j, 0);
                }
                queryFinalized.dispose();
                if (longSparseIntArray != null) {
                    this.b.executeFast("UPDATE dialogs SET unread_count = 0, unread_count_i = 0 WHERE did = " + j).stepThis().dispose();
                }
                T1(longSparseIntArray, null, true);
                getMessagesController().K3(longSparseIntArray, null);
            } catch (Throwable th) {
                th = th;
                sQLiteCursor = queryFinalized;
                try {
                    n(th, true);
                } finally {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0497  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(long j, int i, int i2, int i3, long j2) {
        SQLitePreparedStatement sQLitePreparedStatement;
        ad7 ad7Var;
        SQLiteCursor sQLiteCursor;
        String str;
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor2;
        int i4;
        String str2;
        ArrayList arrayList;
        int i5;
        SQLitePreparedStatement executeFast;
        int i6;
        int i7;
        String str3;
        int i8 = i;
        int i9 = i2;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.b;
                String str4 = " AND type = ";
                try {
                    if (j2 == 0) {
                        str = " AND topic_id = ";
                        if (i3 < 0) {
                            Locale locale = Locale.US;
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT type, start, end FROM media_holes_v2 WHERE uid = " + j + " AND type >= 0 AND ((end >= " + i8 + " AND end <= " + i9 + ") OR (start >= " + i8 + " AND start <= " + i9 + ") OR (start >= " + i8 + " AND end <= " + i9 + ") OR (start <= " + i8 + " AND end >= " + i9 + "))", new Object[0]);
                        } else {
                            try {
                                Locale locale2 = Locale.US;
                                queryFinalized = sQLiteDatabase.queryFinalized("SELECT type, start, end FROM media_holes_v2 WHERE uid = " + j + " AND type = " + i3 + " AND ((end >= " + i8 + " AND end <= " + i9 + ") OR (start >= " + i8 + " AND start <= " + i9 + ") OR (start >= " + i8 + " AND end <= " + i9 + ") OR (start <= " + i8 + " AND end >= " + i9 + "))", new Object[0]);
                            } catch (Exception e) {
                                e = e;
                                ad7Var = this;
                                sQLitePreparedStatement = null;
                                sQLiteCursor = null;
                                try {
                                    ad7Var.m(e);
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    if (sQLiteCursor == null) {
                                        sQLiteCursor.dispose();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    throw th;
                                }
                            }
                        }
                        sQLiteCursor2 = queryFinalized;
                    } else if (i3 < 0) {
                        Locale locale3 = Locale.US;
                        sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT type, start, end FROM media_holes_topics WHERE uid = " + j + " AND topic_id = " + j2 + " AND type >= 0 AND ((end >= " + i8 + " AND end <= " + i9 + ") OR (start >= " + i8 + " AND start <= " + i9 + ") OR (start >= " + i8 + " AND end <= " + i9 + ") OR (start <= " + i8 + " AND end >= " + i9 + "))", new Object[0]);
                        str = " AND topic_id = ";
                        str4 = " AND type = ";
                    } else {
                        Locale locale4 = Locale.US;
                        StringBuilder sb = new StringBuilder("SELECT type, start, end FROM media_holes_topics WHERE uid = ");
                        sb.append(j);
                        sb.append(" AND topic_id = ");
                        sb.append(j2);
                        str4 = " AND type = ";
                        sb.append(str4);
                        sb.append(i3);
                        sb.append(" AND ((end >= ");
                        sb.append(i8);
                        sb.append(" AND end <= ");
                        sb.append(i9);
                        sb.append(") OR (start >= ");
                        sb.append(i8);
                        sb.append(" AND start <= ");
                        sb.append(i9);
                        sb.append(") OR (start >= ");
                        sb.append(i8);
                        sb.append(" AND end <= ");
                        sb.append(i9);
                        sb.append(") OR (start <= ");
                        sb.append(i8);
                        sb.append(" AND end >= ");
                        sb.append(i9);
                        sb.append("))");
                        sQLiteCursor2 = sQLiteDatabase.queryFinalized(sb.toString(), new Object[0]);
                        str = " AND topic_id = ";
                    }
                    ArrayList arrayList2 = null;
                    while (sQLiteCursor2.next()) {
                        try {
                            try {
                                if (arrayList2 == null) {
                                    try {
                                        arrayList2 = new ArrayList();
                                    } catch (Exception e2) {
                                        e = e2;
                                        sQLitePreparedStatement = null;
                                        ad7Var = this;
                                        sQLiteCursor = sQLiteCursor2;
                                        ad7Var.m(e);
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        if (sQLiteCursor == null) {
                                        }
                                    }
                                }
                                int intValue = sQLiteCursor2.intValue(0);
                                int intValue2 = sQLiteCursor2.intValue(1);
                                int intValue3 = sQLiteCursor2.intValue(2);
                                if (intValue2 != intValue3 || intValue2 != 1) {
                                    arrayList2.add(new tc7(intValue, intValue2, intValue3));
                                }
                            } catch (Exception e3) {
                                e = e3;
                                ad7Var = this;
                                sQLiteCursor = sQLiteCursor2;
                                sQLitePreparedStatement = null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor = sQLiteCursor2;
                            sQLitePreparedStatement = null;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    }
                    sQLiteCursor2.dispose();
                    if (arrayList2 != null) {
                        int i10 = 0;
                        while (i10 < arrayList2.size()) {
                            tc7 tc7Var = (tc7) arrayList2.get(i10);
                            int i11 = tc7Var.b;
                            int i12 = tc7Var.c;
                            int i13 = tc7Var.a;
                            if (i9 >= i11 - 1) {
                                if (i8 <= i13 + 1) {
                                    ad7Var = this;
                                    try {
                                        SQLiteDatabase sQLiteDatabase2 = ad7Var.b;
                                        if (j2 != 0) {
                                            Locale locale5 = Locale.US;
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("DELETE FROM media_holes_topics WHERE uid = ");
                                            sb2.append(j);
                                            str3 = str;
                                            sb2.append(str3);
                                            arrayList = arrayList2;
                                            sb2.append(j2);
                                            sb2.append(str4);
                                            sb2.append(i12);
                                            sb2.append(" AND start = ");
                                            sb2.append(i13);
                                            sb2.append(" AND end = ");
                                            sb2.append(i11);
                                            sQLiteDatabase2.executeFast(sb2.toString()).stepThis().dispose();
                                            i5 = i2;
                                            i4 = i10;
                                            str2 = str3;
                                        } else {
                                            str3 = str;
                                            arrayList = arrayList2;
                                            Locale locale6 = Locale.US;
                                            i4 = i10;
                                            sQLiteDatabase2.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + j + str4 + i12 + " AND start = " + i13 + " AND end = " + i11).stepThis().dispose();
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        sQLitePreparedStatement = null;
                                        sQLiteCursor = null;
                                        ad7Var.m(e);
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        if (sQLiteCursor == null) {
                                        }
                                    }
                                } else {
                                    i4 = i10;
                                    str3 = str;
                                    arrayList = arrayList2;
                                    if (i11 != i8) {
                                        try {
                                            SQLiteDatabase sQLiteDatabase3 = this.b;
                                            if (j2 != 0) {
                                                Locale locale7 = Locale.US;
                                                sQLiteDatabase3.executeFast("UPDATE media_holes_topics SET end = " + i8 + " WHERE uid = " + j + str3 + j2 + str4 + i12 + " AND start = " + i13 + " AND end = " + i11).stepThis().dispose();
                                            } else {
                                                Locale locale8 = Locale.US;
                                                sQLiteDatabase3.executeFast("UPDATE media_holes_v2 SET end = " + i8 + " WHERE uid = " + j + str4 + i12 + " AND start = " + i13 + " AND end = " + i11).stepThis().dispose();
                                            }
                                        } catch (Exception e5) {
                                            n(e5, false);
                                        }
                                    }
                                }
                                i5 = i2;
                                str2 = str3;
                            } else {
                                ad7Var = this;
                                i4 = i10;
                                str2 = str;
                                arrayList = arrayList2;
                                if (i8 <= i13 + 1) {
                                    i5 = i2;
                                    if (i13 != i5) {
                                        try {
                                            SQLiteDatabase sQLiteDatabase4 = ad7Var.b;
                                            if (j2 != 0) {
                                                Locale locale9 = Locale.US;
                                                sQLiteDatabase4.executeFast("UPDATE media_holes_topics SET start = " + i5 + " WHERE uid = " + j + str2 + j2 + str4 + i12 + " AND start = " + i13 + " AND end = " + i11).stepThis().dispose();
                                            } else {
                                                Locale locale10 = Locale.US;
                                                sQLiteDatabase4.executeFast("UPDATE media_holes_v2 SET start = " + i5 + " WHERE uid = " + j + str4 + i12 + " AND start = " + i13 + " AND end = " + i11).stepThis().dispose();
                                            }
                                        } catch (Exception e6) {
                                            n(e6, false);
                                        }
                                    }
                                } else {
                                    i5 = i2;
                                    SQLiteDatabase sQLiteDatabase5 = ad7Var.b;
                                    if (j2 != 0) {
                                        Locale locale11 = Locale.US;
                                        sQLiteDatabase5.executeFast("DELETE FROM media_holes_topics WHERE uid = " + j + str2 + j2 + str4 + i12 + " AND start = " + i13 + " AND end = " + i11).stepThis().dispose();
                                        executeFast = ad7Var.b.executeFast("REPLACE INTO media_holes_topics VALUES(?, ?, ?, ?, ?)");
                                    } else {
                                        Locale locale12 = Locale.US;
                                        sQLiteDatabase5.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + j + str4 + i12 + " AND start = " + i13 + " AND end = " + i11).stepThis().dispose();
                                        executeFast = ad7Var.b.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                                    }
                                    try {
                                        executeFast.requery();
                                        executeFast.bindLong(1, j);
                                        if (j2 != 0) {
                                            executeFast.bindLong(2, j2);
                                            i6 = 3;
                                        } else {
                                            i6 = 2;
                                        }
                                        executeFast.bindInteger(i6, i12);
                                        executeFast.bindInteger(i6 + 1, i13);
                                        i7 = i;
                                        executeFast.bindInteger(i6 + 2, i7);
                                        executeFast.step();
                                        executeFast.requery();
                                        executeFast.bindLong(1, j);
                                        executeFast.bindInteger(2, i12);
                                        executeFast.bindInteger(3, i5);
                                        executeFast.bindInteger(4, i11);
                                        executeFast.step();
                                        executeFast.dispose();
                                        i9 = i5;
                                        i8 = i7;
                                        arrayList2 = arrayList;
                                        str = str2;
                                        i10 = i4 + 1;
                                    } catch (Exception e7) {
                                        e = e7;
                                        sQLitePreparedStatement = executeFast;
                                        sQLiteCursor = null;
                                        ad7Var.m(e);
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        if (sQLiteCursor == null) {
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        sQLitePreparedStatement = executeFast;
                                        sQLiteCursor = null;
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        throw th;
                                    }
                                }
                            }
                            i7 = i;
                            i9 = i5;
                            i8 = i7;
                            arrayList2 = arrayList;
                            str = str2;
                            i10 = i4 + 1;
                        }
                    }
                } catch (Exception e8) {
                    e = e8;
                    sQLitePreparedStatement = null;
                    sQLiteCursor = null;
                    ad7Var = this;
                }
            } catch (Exception e9) {
                e = e9;
                ad7Var = this;
            }
        } catch (Throwable th4) {
            th = th4;
            sQLitePreparedStatement = null;
        }
    }

    public final void s1(String str, TLObject tLObject) {
        if (tLObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.a.c(new lo6((Object) this, (Object) tLObject, (Object) str, (byte) 26));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0552  */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1 */
    /* JADX WARN: Type inference failed for: r33v15 */
    /* JADX WARN: Type inference failed for: r33v16 */
    /* JADX WARN: Type inference failed for: r33v17 */
    /* JADX WARN: Type inference failed for: r33v18 */
    /* JADX WARN: Type inference failed for: r33v19 */
    /* JADX WARN: Type inference failed for: r33v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(int i, int i2, long j, long j2, String str) {
        SQLitePreparedStatement sQLitePreparedStatement;
        boolean z;
        SQLiteCursor sQLiteCursor;
        int i3;
        int i4;
        ?? r33;
        SQLiteCursor queryFinalized;
        int i5;
        boolean z2;
        SQLitePreparedStatement executeFast;
        long j3;
        int i6;
        int i7;
        int i8;
        int i9 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.b;
                boolean z3 = false;
                int i10 = 2;
                if (i9 != 0) {
                    i3 = 3;
                    try {
                        i4 = 4;
                        r33 = 1;
                    } catch (Exception e) {
                        e = e;
                        r33 = 1;
                    }
                    try {
                        queryFinalized = sQLiteDatabase.queryFinalized(String.format(Locale.US, "SELECT start, end FROM " + str + " WHERE uid = %d AND topic_id = %d AND ((end >= %d AND end <= %d) OR (start >= %d AND start <= %d) OR (start >= %d AND end <= %d) OR (start <= %d AND end >= %d))", Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i2)), new Object[0]);
                    } catch (Exception e2) {
                        e = e2;
                        z = r33;
                        sQLitePreparedStatement = null;
                        sQLiteCursor = null;
                        try {
                            n(e, z);
                            if (sQLitePreparedStatement != null) {
                            }
                            if (sQLiteCursor != null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    }
                } else {
                    i3 = 3;
                    i4 = 4;
                    r33 = 1;
                    queryFinalized = sQLiteDatabase.queryFinalized(String.format(Locale.US, "SELECT start, end FROM " + str + " WHERE uid = %d AND ((end >= %d AND end <= %d) OR (start >= %d AND start <= %d) OR (start >= %d AND end <= %d) OR (start <= %d AND end >= %d))", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i2)), new Object[0]);
                }
                SQLiteCursor sQLiteCursor2 = queryFinalized;
                ArrayList arrayList = null;
                ?? r332 = r33;
                while (sQLiteCursor2.next()) {
                    try {
                        try {
                            if (arrayList == null) {
                                try {
                                    arrayList = new ArrayList();
                                } catch (Exception e3) {
                                    e = e3;
                                    sQLiteCursor = sQLiteCursor2;
                                    z = r332;
                                    sQLitePreparedStatement = null;
                                    n(e, z);
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                        return;
                                    }
                                    return;
                                }
                            }
                            int intValue = sQLiteCursor2.intValue(0);
                            int i11 = r332;
                            int intValue2 = sQLiteCursor2.intValue(i11);
                            if (intValue != intValue2 || intValue != i11) {
                                tc7 tc7Var = new tc7();
                                tc7Var.a = intValue;
                                tc7Var.b = intValue2;
                                arrayList.add(tc7Var);
                            }
                            r332 = 1;
                        } catch (Exception e4) {
                            e = e4;
                            sQLiteCursor = sQLiteCursor2;
                            z = true;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor = sQLiteCursor2;
                        sQLitePreparedStatement = null;
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor != null) {
                        }
                        throw th;
                    }
                }
                sQLiteCursor2.dispose();
                if (arrayList != null) {
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        tc7 tc7Var2 = (tc7) arrayList.get(i12);
                        int i13 = tc7Var2.b;
                        int i14 = tc7Var2.a;
                        boolean z4 = z3;
                        int i15 = i9;
                        int i16 = i12;
                        ArrayList arrayList2 = arrayList;
                        int i17 = i14 + 1;
                        if (i2 >= i13 - 1) {
                            if (i <= i17) {
                                SQLiteDatabase sQLiteDatabase2 = this.b;
                                if (i15 != 0) {
                                    Long valueOf = Long.valueOf(j);
                                    Long valueOf2 = Long.valueOf(j2);
                                    Integer valueOf3 = Integer.valueOf(i14);
                                    Integer valueOf4 = Integer.valueOf(i13);
                                    Object[] objArr = new Object[i4];
                                    objArr[z4 ? 1 : 0] = valueOf;
                                    objArr[1] = valueOf2;
                                    objArr[i10] = valueOf3;
                                    objArr[i3] = valueOf4;
                                    sQLiteDatabase2.executeFast(String.format(Locale.US, "DELETE FROM " + str + " WHERE uid = %d AND topic_id = %d AND start = %d AND end = %d", objArr)).stepThis().dispose();
                                } else {
                                    Long valueOf5 = Long.valueOf(j);
                                    Integer valueOf6 = Integer.valueOf(i14);
                                    Integer valueOf7 = Integer.valueOf(i13);
                                    Object[] objArr2 = new Object[i3];
                                    objArr2[z4 ? 1 : 0] = valueOf5;
                                    objArr2[1] = valueOf6;
                                    objArr2[i10] = valueOf7;
                                    sQLiteDatabase2.executeFast(String.format(Locale.US, "DELETE FROM " + str + " WHERE uid = %d AND start = %d AND end = %d", objArr2)).stepThis().dispose();
                                }
                            } else if (i13 != i) {
                                try {
                                    SQLiteDatabase sQLiteDatabase3 = this.b;
                                    if (i15 != 0) {
                                        Locale locale = Locale.US;
                                        Long valueOf8 = Long.valueOf(j);
                                        Long valueOf9 = Long.valueOf(j2);
                                        Integer valueOf10 = Integer.valueOf(i14);
                                        Integer valueOf11 = Integer.valueOf(i13);
                                        Object[] objArr3 = new Object[4];
                                        objArr3[z4 ? 1 : 0] = valueOf8;
                                        objArr3[1] = valueOf9;
                                        objArr3[i10] = valueOf10;
                                        objArr3[3] = valueOf11;
                                        sQLiteDatabase3.executeFast(String.format(locale, "DELETE FROM " + str + " WHERE uid = %d AND topic_id = %d AND start = %d AND end = %d", objArr3)).stepThis().dispose();
                                        Long valueOf12 = Long.valueOf(j);
                                        Long valueOf13 = Long.valueOf(j2);
                                        Integer valueOf14 = Integer.valueOf(i14);
                                        Integer valueOf15 = Integer.valueOf(i);
                                        Object[] objArr4 = new Object[4];
                                        objArr4[z4 ? 1 : 0] = valueOf12;
                                        objArr4[1] = valueOf13;
                                        objArr4[i10] = valueOf14;
                                        objArr4[3] = valueOf15;
                                        this.b.executeFast(String.format(locale, "REPLACE INTO " + str + " VALUES(%d, %d, %d, %d)", objArr4)).stepThis().dispose();
                                    } else {
                                        Locale locale2 = Locale.US;
                                        Long valueOf16 = Long.valueOf(j);
                                        Integer valueOf17 = Integer.valueOf(i14);
                                        Integer valueOf18 = Integer.valueOf(i13);
                                        Object[] objArr5 = new Object[3];
                                        objArr5[z4 ? 1 : 0] = valueOf16;
                                        objArr5[1] = valueOf17;
                                        objArr5[i10] = valueOf18;
                                        sQLiteDatabase3.executeFast(String.format(locale2, "DELETE FROM " + str + " WHERE uid = %d AND start = %d AND end = %d", objArr5)).stepThis().dispose();
                                        Long valueOf19 = Long.valueOf(j);
                                        Integer valueOf20 = Integer.valueOf(i14);
                                        Integer valueOf21 = Integer.valueOf(i);
                                        Object[] objArr6 = new Object[3];
                                        objArr6[z4 ? 1 : 0] = valueOf19;
                                        objArr6[1] = valueOf20;
                                        objArr6[i10] = valueOf21;
                                        this.b.executeFast(String.format(locale2, "REPLACE INTO " + str + " VALUES(%d, %d, %d)", objArr6)).stepThis().dispose();
                                    }
                                } catch (Exception e5) {
                                    n(e5, z4);
                                }
                            }
                        } else if (i > i17) {
                            SQLiteDatabase sQLiteDatabase4 = this.b;
                            if (i15 != 0) {
                                Long valueOf22 = Long.valueOf(j);
                                Long valueOf23 = Long.valueOf(j2);
                                Integer valueOf24 = Integer.valueOf(i14);
                                Integer valueOf25 = Integer.valueOf(i13);
                                Object[] objArr7 = new Object[4];
                                objArr7[0] = valueOf22;
                                objArr7[1] = valueOf23;
                                objArr7[i10] = valueOf24;
                                objArr7[3] = valueOf25;
                                sQLiteDatabase4.executeFast(String.format(Locale.US, "DELETE FROM " + str + " WHERE uid = %d AND topic_id = %d AND start = %d AND end = %d", objArr7)).stepThis().dispose();
                                executeFast = this.b.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?, ?)");
                                i5 = 3;
                                z2 = false;
                            } else {
                                Long valueOf26 = Long.valueOf(j);
                                Integer valueOf27 = Integer.valueOf(i14);
                                Integer valueOf28 = Integer.valueOf(i13);
                                i5 = 3;
                                Object[] objArr8 = new Object[3];
                                z2 = false;
                                objArr8[0] = valueOf26;
                                objArr8[1] = valueOf27;
                                objArr8[i10] = valueOf28;
                                sQLiteDatabase4.executeFast(String.format(Locale.US, "DELETE FROM " + str + " WHERE uid = %d AND start = %d AND end = %d", objArr8)).stepThis().dispose();
                                executeFast = this.b.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?)");
                            }
                            try {
                                executeFast.requery();
                                executeFast.bindLong(1, j);
                                if (i15 != 0) {
                                    j3 = j2;
                                    executeFast.bindLong(i10, j3);
                                    i6 = i5;
                                } else {
                                    j3 = j2;
                                    i6 = 2;
                                }
                                executeFast.bindInteger(i6, i14);
                                executeFast.bindInteger(i6 + 1, i);
                                executeFast.step();
                                executeFast.requery();
                                executeFast.bindLong(1, j);
                                if (i15 != 0) {
                                    i7 = 2;
                                    executeFast.bindLong(2, j3);
                                    i8 = i5;
                                } else {
                                    i7 = 2;
                                    i8 = 2;
                                }
                                executeFast.bindInteger(i8, i2);
                                executeFast.bindInteger(i8 + 1, i13);
                                executeFast.step();
                                executeFast.dispose();
                                i10 = i7;
                                i3 = i5;
                                z3 = z2;
                                i9 = i15;
                                arrayList = arrayList2;
                                i4 = 4;
                                i12 = i16 + 1;
                            } catch (Exception e6) {
                                e = e6;
                                sQLitePreparedStatement = executeFast;
                                z = true;
                                sQLiteCursor = null;
                                n(e, z);
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                sQLitePreparedStatement = executeFast;
                                sQLiteCursor = null;
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                throw th;
                            }
                        } else if (i14 != i2) {
                            try {
                                SQLiteDatabase sQLiteDatabase5 = this.b;
                                if (i15 != 0) {
                                    Locale locale3 = Locale.US;
                                    Long valueOf29 = Long.valueOf(j);
                                    Long valueOf30 = Long.valueOf(j2);
                                    Integer valueOf31 = Integer.valueOf(i14);
                                    Integer valueOf32 = Integer.valueOf(i13);
                                    Object[] objArr9 = new Object[4];
                                    objArr9[0] = valueOf29;
                                    objArr9[1] = valueOf30;
                                    objArr9[i10] = valueOf31;
                                    objArr9[3] = valueOf32;
                                    sQLiteDatabase5.executeFast(String.format(locale3, "DELETE FROM " + str + " WHERE uid = %d AND topic_id = %d AND start = %d AND end = %d", objArr9)).stepThis().dispose();
                                    Long valueOf33 = Long.valueOf(j);
                                    Long valueOf34 = Long.valueOf(j2);
                                    Integer valueOf35 = Integer.valueOf(i2);
                                    Integer valueOf36 = Integer.valueOf(i13);
                                    Object[] objArr10 = new Object[4];
                                    objArr10[0] = valueOf33;
                                    objArr10[1] = valueOf34;
                                    objArr10[i10] = valueOf35;
                                    objArr10[3] = valueOf36;
                                    this.b.executeFast(String.format(locale3, "REPLACE INTO " + str + " VALUES(%d, %d, %d, %d)", objArr10)).stepThis().dispose();
                                } else {
                                    Locale locale4 = Locale.US;
                                    Long valueOf37 = Long.valueOf(j);
                                    Integer valueOf38 = Integer.valueOf(i14);
                                    Integer valueOf39 = Integer.valueOf(i13);
                                    Object[] objArr11 = new Object[3];
                                    objArr11[0] = valueOf37;
                                    objArr11[1] = valueOf38;
                                    objArr11[i10] = valueOf39;
                                    sQLiteDatabase5.executeFast(String.format(locale4, "DELETE FROM " + str + " WHERE uid = %d AND start = %d AND end = %d", objArr11)).stepThis().dispose();
                                    Long valueOf40 = Long.valueOf(j);
                                    Integer valueOf41 = Integer.valueOf(i2);
                                    Integer valueOf42 = Integer.valueOf(i13);
                                    Object[] objArr12 = new Object[3];
                                    objArr12[0] = valueOf40;
                                    objArr12[1] = valueOf41;
                                    objArr12[i10] = valueOf42;
                                    this.b.executeFast(String.format(locale4, "REPLACE INTO " + str + " VALUES(%d, %d, %d)", objArr12)).stepThis().dispose();
                                }
                            } catch (Exception e7) {
                                n(e7, false);
                            }
                        }
                        i7 = i10;
                        i5 = 3;
                        z2 = false;
                        i10 = i7;
                        i3 = i5;
                        z3 = z2;
                        i9 = i15;
                        arrayList = arrayList2;
                        i4 = 4;
                        i12 = i16 + 1;
                    }
                }
            } catch (Exception e8) {
                e = e8;
                z = true;
            }
        } catch (Throwable th4) {
            th = th4;
            sQLitePreparedStatement = null;
        }
    }

    public final boolean t0(long j) {
        return r0(4, j);
    }

    public final void t1(int i, long j) {
        this.a.c(new bb7(this, i, j, (byte) 2));
    }

    public final boolean u(long j) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Boolean[] boolArr = {Boolean.FALSE};
        this.a.c(new m77((Object) this, j, (Object) boolArr, (Object) countDownLatch, (byte) 23));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            n(e, true);
        }
        return boolArr[0].booleanValue();
    }

    public final boolean u0(vf6 vf6Var, TLRPC.User user) {
        long j = user.linked_community_id;
        if (j == 0) {
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) vf6Var.f(j);
        if (chat == null) {
            chat = N(user.linked_community_id);
            vf6Var.k(chat, user.linked_community_id);
        }
        return chat != null && chat.collapsed_in_dialogs;
    }

    public final void u1(t97 t97Var, boolean z) {
        int i;
        SQLitePreparedStatement executeFast;
        ArrayList arrayList = this.I;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (!arrayList.contains(t97Var)) {
                    if (!z) {
                        arrayList.add(t97Var);
                    } else if (((t97) arrayList.get(0)).d()) {
                        arrayList.add(1, t97Var);
                    } else {
                        arrayList.add(0, t97Var);
                    }
                    this.J.put(t97Var.a, t97Var);
                }
                executeFast = this.b.executeFast("REPLACE INTO dialog_filter VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            int i2 = t97Var.a;
            LongSparseIntArray longSparseIntArray = t97Var.j;
            executeFast.bindInteger(1, i2);
            executeFast.bindInteger(2, t97Var.f);
            executeFast.bindInteger(3, t97Var.d);
            executeFast.bindInteger(4, t97Var.g);
            executeFast.bindString(5, t97Var.a == 0 ? "ALL_CHATS" : t97Var.b);
            executeFast.bindInteger(6, t97Var.m);
            Vector vector = new Vector(new yw6((byte) 25));
            vector.objects.addAll(t97Var.c);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(vector.getObjectSize());
            vector.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(7, nativeByteBuffer);
            executeFast.bindInteger(8, t97Var.n ? 1 : 0);
            executeFast.step();
            executeFast.dispose();
            nativeByteBuffer.reuse();
            this.b.executeFast("DELETE FROM dialog_filter_ep WHERE id = " + t97Var.a).stepThis().dispose();
            this.b.executeFast("DELETE FROM dialog_filter_pin_v2 WHERE id = " + t97Var.a).stepThis().dispose();
            this.b.beginTransaction();
            SQLitePreparedStatement executeFast2 = this.b.executeFast("REPLACE INTO dialog_filter_pin_v2 VALUES(?, ?, ?)");
            int size = t97Var.h.size();
            for (int i3 = 0; i3 < size; i3++) {
                long longValue = ((Long) t97Var.h.get(i3)).longValue();
                executeFast2.requery();
                executeFast2.bindInteger(1, t97Var.a);
                executeFast2.bindLong(2, longValue);
                executeFast2.bindInteger(3, longSparseIntArray.get(longValue, TLObject.FLAG_31));
                executeFast2.step();
            }
            int size2 = longSparseIntArray.size();
            for (int i4 = 0; i4 < size2; i4++) {
                long keyAt = longSparseIntArray.keyAt(i4);
                if (cf3.B(keyAt)) {
                    executeFast2.requery();
                    executeFast2.bindInteger(1, t97Var.a);
                    executeFast2.bindLong(2, keyAt);
                    executeFast2.bindInteger(3, longSparseIntArray.valueAt(i4));
                    executeFast2.step();
                }
            }
            executeFast2.dispose();
            executeFast = this.b.executeFast("REPLACE INTO dialog_filter_ep VALUES(?, ?)");
            int size3 = t97Var.i.size();
            for (i = 0; i < size3; i++) {
                executeFast.requery();
                executeFast.bindInteger(1, t97Var.a);
                executeFast.bindLong(2, ((Long) t97Var.i.get(i)).longValue());
                executeFast.step();
            }
            executeFast.dispose();
            this.b.commitTransaction();
            SQLiteDatabase sQLiteDatabase = this.b;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.commitTransaction();
            }
        } catch (Exception e2) {
            e = e2;
            sQLitePreparedStatement = executeFast;
            n(e, true);
            SQLiteDatabase sQLiteDatabase2 = this.b;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLitePreparedStatement = executeFast;
            SQLiteDatabase sQLiteDatabase3 = this.b;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public final void v1() {
        this.a.c(new i41(this, new ArrayList(getMessagesController().G0), (byte) 10));
    }

    public final SQLiteCursor w(int i, int i2, long j) {
        SQLiteDatabase sQLiteDatabase = this.b;
        Locale locale = Locale.US;
        StringBuilder o = ug8.o(j, "SELECT data, seen, pin FROM profile_stories JOIN profile_stories_albums_links ON profile_stories.story_id = profile_stories_albums_links.story_id WHERE profile_stories.dialog_id = ", " AND profile_stories_albums_links.dialog_id = ");
        o.append(j);
        o.append("  AND profile_stories_albums_links.album_id = ");
        o.append(i);
        o.append(" AND profile_stories.type = ");
        o.append(i2);
        o.append(" ORDER BY profile_stories_albums_links.order_index ASC;");
        return sQLiteDatabase.queryFinalized(o.toString(), new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0450 A[Catch: all -> 0x0475, Exception -> 0x0477, TryCatch #6 {Exception -> 0x0477, blocks: (B:36:0x02ce, B:38:0x02d4, B:60:0x0355, B:62:0x0359, B:64:0x0450, B:65:0x046a), top: B:35:0x02ce }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x051c  */
    /* JADX WARN: Type inference failed for: r0v171, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [byte] */
    /* JADX WARN: Type inference failed for: r15v4, types: [org.telegram.tgnet.TLRPC$Message] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v7, types: [org.telegram.SQLite.SQLiteCursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w0() {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteCursor sQLiteCursor;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        ArrayList arrayList;
        int i;
        SQLitePreparedStatement executeFast;
        SQLiteCursor sQLiteCursor2;
        ArrayList arrayList2;
        int i2;
        ?? r15;
        int i3;
        try {
            arrayList = new ArrayList();
            this.b.executeFast("DELETE FROM ephemeral_messages").stepThis().dispose();
            this.b.executeFast("DELETE FROM widget_state").stepThis().dispose();
            this.b.executeFast("DELETE FROM widget_heights").stepThis().dispose();
            vvc.u(this.currentAccount);
            this.b.executeFast("DELETE FROM poll_votes_mentions").stepThis().dispose();
            this.b.executeFast("DELETE FROM poll_votes_mentions_topics").stepThis().dispose();
            this.b.executeFast("DELETE FROM reaction_mentions").stepThis().dispose();
            this.b.executeFast("DELETE FROM reaction_mentions_topics").stepThis().dispose();
            this.b.executeFast("DELETE FROM downloading_documents").stepThis().dispose();
            this.b.executeFast("DELETE FROM attach_menu_bots").stepThis().dispose();
            this.b.executeFast("DELETE FROM animated_emoji").stepThis().dispose();
            this.b.executeFast("DELETE FROM stickers_v2").stepThis().dispose();
            this.b.executeFast("DELETE FROM stickersets2").stepThis().dispose();
            this.b.executeFast("DELETE FROM messages_holes_topics").stepThis().dispose();
            this.b.executeFast("DELETE FROM messages_topics").stepThis().dispose();
            this.b.executeFast("DELETE FROM saved_dialogs").stepThis().dispose();
            this.b.executeFast("DELETE FROM topics").stepThis().dispose();
            this.b.executeFast("DELETE FROM media_holes_topics").stepThis().dispose();
            this.b.executeFast("DELETE FROM media_topics").stepThis().dispose();
            this.b.executeFast("DELETE FROM media_counts_topics").stepThis().dispose();
            this.b.executeFast("DELETE FROM chat_pinned_v2").stepThis().dispose();
            this.b.executeFast("DELETE FROM chat_pinned_count").stepThis().dispose();
            this.b.executeFast("DELETE FROM profile_stories").stepThis().dispose();
            this.b.executeFast("DELETE FROM profile_stories_albums").stepThis().dispose();
            this.b.executeFast("DELETE FROM profile_stories_albums_links").stepThis().dispose();
            this.b.executeFast("DELETE FROM story_pushes").stepThis().dispose();
            this.b.executeFast("DELETE FROM dialog_photos").stepThis().dispose();
            this.b.executeFast("DELETE FROM dialog_photos_count").stepThis().dispose();
            this.b.executeFast("DELETE FROM saved_reaction_tags").stepThis().dispose();
            this.b.executeFast("DELETE FROM business_replies").stepThis().dispose();
            this.b.executeFast("DELETE FROM quick_replies_messages").stepThis().dispose();
            this.b.executeFast("DELETE FROM welcome_messages").stepThis().dispose();
            this.b.executeFast("DELETE FROM effects").stepThis().dispose();
            this.b.executeFast("DELETE FROM app_config").stepThis().dispose();
            this.b.executeFast("DELETE FROM star_gifts2").stepThis().dispose();
            this.b.executeFast("DELETE FROM premium_promo").stepThis().dispose();
            this.b.executeFast("DELETE FROM media_counts_v2").stepThis().dispose();
            this.b.executeFast("DELETE FROM media_v4").stepThis().dispose();
            i = 0;
            SQLiteCursor queryFinalized = this.b.queryFinalized("SELECT did FROM dialogs WHERE 1", new Object[0]);
            while (queryFinalized.next()) {
                try {
                    long longValue = queryFinalized.longValue(0);
                    if (!cf3.B(longValue)) {
                        arrayList.add(Long.valueOf(longValue));
                    }
                } catch (Exception e) {
                    e = e;
                    sQLiteCursor = queryFinalized;
                } catch (Throwable th) {
                    th = th;
                    sQLiteCursor = queryFinalized;
                }
            }
            queryFinalized.dispose();
            executeFast = this.b.executeFast("REPLACE INTO messages_holes VALUES(?, ?, ?)");
        } catch (Exception e2) {
            e = e2;
            sQLitePreparedStatement = null;
        } catch (Throwable th2) {
            th = th2;
            sQLitePreparedStatement = null;
        }
        try {
            SQLitePreparedStatement executeFast2 = this.b.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
            try {
                this.b.beginTransaction();
                int i4 = 0;
                sQLiteCursor2 = null;
                while (i4 < arrayList.size()) {
                    try {
                        Long l = (Long) arrayList.get(i4);
                        sQLiteCursor2 = this.b.queryFinalized("SELECT COUNT(mid) FROM messages_v2 WHERE uid = " + l, new Object[i]);
                        int intValue = sQLiteCursor2.next() ? sQLiteCursor2.intValue(i) : i;
                        sQLiteCursor2.dispose();
                        if (intValue <= 2) {
                            arrayList2 = arrayList;
                            i2 = i4;
                            r15 = i;
                        } else {
                            sQLiteCursor = this.b.queryFinalized("SELECT last_mid_i, last_mid FROM dialogs WHERE did = " + l, new Object[i]);
                            try {
                                try {
                                    if (sQLiteCursor.next()) {
                                        long longValue2 = sQLiteCursor.longValue(i);
                                        arrayList2 = arrayList;
                                        long longValue3 = sQLiteCursor.longValue(1);
                                        ?? queryFinalized2 = this.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + l + " AND mid IN (" + longValue2 + "," + longValue3 + ")", new Object[i]);
                                        int i5 = -1;
                                        ?? r6 = i;
                                        while (queryFinalized2.next()) {
                                            try {
                                                ?? byteBufferValue = queryFinalized2.byteBufferValue(r6);
                                                if (byteBufferValue != 0) {
                                                    ?? TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r6), r6);
                                                    if (TLdeserialize != 0) {
                                                        int i6 = TLdeserialize.id;
                                                        try {
                                                            i2 = i4;
                                                            try {
                                                                TLdeserialize.readAttachPath(byteBufferValue, y6c.h(this.currentAccount).n);
                                                                i5 = i6;
                                                            } catch (Exception e3) {
                                                                e = e3;
                                                                i5 = i6;
                                                                m(e);
                                                                i3 = i5;
                                                                queryFinalized2.dispose();
                                                                this.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + l + " AND mid != " + longValue2 + " AND mid != " + longValue3).stepThis().dispose();
                                                                SQLiteDatabase sQLiteDatabase3 = this.b;
                                                                StringBuilder sb = new StringBuilder();
                                                                sb.append("DELETE FROM messages_holes WHERE uid = ");
                                                                sb.append(l);
                                                                sQLiteDatabase3.executeFast(sb.toString()).stepThis().dispose();
                                                                this.b.executeFast("DELETE FROM bot_keyboard WHERE uid = " + l).stepThis().dispose();
                                                                this.b.executeFast("DELETE FROM bot_keyboard_topics WHERE uid = " + l).stepThis().dispose();
                                                                this.b.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + l).stepThis().dispose();
                                                                this.b.executeFast("DELETE FROM media_v4 WHERE uid = " + l).stepThis().dispose();
                                                                this.b.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + l).stepThis().dispose();
                                                                r15 = 0;
                                                                gl.c3(new ko6(hq6.d0(this.currentAccount), l.longValue(), r15));
                                                                if (i3 != -1) {
                                                                }
                                                                sQLiteCursor.dispose();
                                                                sQLiteCursor2 = null;
                                                                i4 = i2 + 1;
                                                                i = r15;
                                                                arrayList = arrayList2;
                                                            }
                                                        } catch (Exception e4) {
                                                            e = e4;
                                                            i2 = i4;
                                                        }
                                                    } else {
                                                        i2 = i4;
                                                    }
                                                    try {
                                                        byteBufferValue.reuse();
                                                    } catch (Exception e5) {
                                                        e = e5;
                                                        m(e);
                                                        i3 = i5;
                                                        queryFinalized2.dispose();
                                                        this.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + l + " AND mid != " + longValue2 + " AND mid != " + longValue3).stepThis().dispose();
                                                        SQLiteDatabase sQLiteDatabase32 = this.b;
                                                        StringBuilder sb2 = new StringBuilder();
                                                        sb2.append("DELETE FROM messages_holes WHERE uid = ");
                                                        sb2.append(l);
                                                        sQLiteDatabase32.executeFast(sb2.toString()).stepThis().dispose();
                                                        this.b.executeFast("DELETE FROM bot_keyboard WHERE uid = " + l).stepThis().dispose();
                                                        this.b.executeFast("DELETE FROM bot_keyboard_topics WHERE uid = " + l).stepThis().dispose();
                                                        this.b.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + l).stepThis().dispose();
                                                        this.b.executeFast("DELETE FROM media_v4 WHERE uid = " + l).stepThis().dispose();
                                                        this.b.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + l).stepThis().dispose();
                                                        r15 = 0;
                                                        gl.c3(new ko6(hq6.d0(this.currentAccount), l.longValue(), r15));
                                                        if (i3 != -1) {
                                                        }
                                                        sQLiteCursor.dispose();
                                                        sQLiteCursor2 = null;
                                                        i4 = i2 + 1;
                                                        i = r15;
                                                        arrayList = arrayList2;
                                                    }
                                                } else {
                                                    i2 = i4;
                                                }
                                                i4 = i2;
                                                r6 = 0;
                                            } catch (Exception e6) {
                                                e = e6;
                                                i2 = i4;
                                            }
                                        }
                                        i2 = i4;
                                        i3 = i5;
                                        queryFinalized2.dispose();
                                        this.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + l + " AND mid != " + longValue2 + " AND mid != " + longValue3).stepThis().dispose();
                                        SQLiteDatabase sQLiteDatabase322 = this.b;
                                        StringBuilder sb22 = new StringBuilder();
                                        sb22.append("DELETE FROM messages_holes WHERE uid = ");
                                        sb22.append(l);
                                        sQLiteDatabase322.executeFast(sb22.toString()).stepThis().dispose();
                                        this.b.executeFast("DELETE FROM bot_keyboard WHERE uid = " + l).stepThis().dispose();
                                        this.b.executeFast("DELETE FROM bot_keyboard_topics WHERE uid = " + l).stepThis().dispose();
                                        this.b.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + l).stepThis().dispose();
                                        this.b.executeFast("DELETE FROM media_v4 WHERE uid = " + l).stepThis().dispose();
                                        this.b.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + l).stepThis().dispose();
                                        r15 = 0;
                                        gl.c3(new ko6(hq6.d0(this.currentAccount), l.longValue(), r15));
                                        if (i3 != -1) {
                                            v(l.longValue(), executeFast, executeFast2, i3, 0L);
                                        }
                                    } else {
                                        arrayList2 = arrayList;
                                        i2 = i4;
                                        r15 = i;
                                    }
                                    sQLiteCursor.dispose();
                                    sQLiteCursor2 = null;
                                } catch (Exception e7) {
                                    e = e7;
                                    sQLitePreparedStatement = executeFast;
                                    sQLitePreparedStatement2 = executeFast2;
                                    try {
                                        m(e);
                                        sQLiteDatabase2 = this.b;
                                        if (sQLiteDatabase2 != null) {
                                            sQLiteDatabase2.commitTransaction();
                                        }
                                        if (sQLitePreparedStatement != null) {
                                            sQLitePreparedStatement.dispose();
                                        }
                                        if (sQLitePreparedStatement2 != null) {
                                            sQLitePreparedStatement2.dispose();
                                        }
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        p1();
                                    } catch (Throwable th3) {
                                        th = th3;
                                        sQLiteDatabase = this.b;
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.commitTransaction();
                                        }
                                        if (sQLitePreparedStatement != null) {
                                            sQLitePreparedStatement.dispose();
                                        }
                                        if (sQLitePreparedStatement2 != null) {
                                            sQLitePreparedStatement2.dispose();
                                        }
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        p1();
                                        throw th;
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                sQLitePreparedStatement = executeFast;
                                sQLitePreparedStatement2 = executeFast2;
                                sQLiteDatabase = this.b;
                                if (sQLiteDatabase != null) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLitePreparedStatement2 != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                p1();
                                throw th;
                            }
                        }
                        i4 = i2 + 1;
                        i = r15;
                        arrayList = arrayList2;
                    } catch (Exception e8) {
                        e = e8;
                        sQLiteCursor = sQLiteCursor2;
                    } catch (Throwable th5) {
                        th = th5;
                        sQLiteCursor = sQLiteCursor2;
                    }
                }
                executeFast.dispose();
                executeFast2.dispose();
            } catch (Exception e9) {
                e = e9;
                sQLitePreparedStatement = executeFast;
                sQLitePreparedStatement2 = executeFast2;
                sQLiteCursor = null;
            } catch (Throwable th6) {
                th = th6;
                sQLitePreparedStatement = executeFast;
                sQLitePreparedStatement2 = executeFast2;
                sQLiteCursor = null;
            }
            try {
                this.b.commitTransaction();
                this.b.executeFast("PRAGMA journal_size_limit = 0").stepThis().dispose();
                this.b.executeFast("VACUUM").stepThis().dispose();
                this.b.executeFast("PRAGMA journal_size_limit = -1").stepThis().dispose();
                getMessagesController().g4.b();
                gl.c3(new vb7(this, (byte) 17));
                SQLiteDatabase sQLiteDatabase4 = this.b;
                if (sQLiteDatabase4 != null) {
                    sQLiteDatabase4.commitTransaction();
                }
                if (sQLiteCursor2 != null) {
                    sQLiteCursor2.dispose();
                }
            } catch (Exception e10) {
                e = e10;
                sQLiteCursor = sQLiteCursor2;
                sQLitePreparedStatement = null;
                sQLitePreparedStatement2 = null;
                m(e);
                sQLiteDatabase2 = this.b;
                if (sQLiteDatabase2 != null) {
                }
                if (sQLitePreparedStatement != null) {
                }
                if (sQLitePreparedStatement2 != null) {
                }
                if (sQLiteCursor != null) {
                }
                p1();
            } catch (Throwable th7) {
                th = th7;
                sQLiteCursor = sQLiteCursor2;
                sQLitePreparedStatement = null;
                sQLitePreparedStatement2 = null;
                sQLiteDatabase = this.b;
                if (sQLiteDatabase != null) {
                }
                if (sQLitePreparedStatement != null) {
                }
                if (sQLitePreparedStatement2 != null) {
                }
                if (sQLiteCursor != null) {
                }
                p1();
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            sQLitePreparedStatement = executeFast;
            sQLiteCursor = null;
            sQLitePreparedStatement2 = null;
            m(e);
            sQLiteDatabase2 = this.b;
            if (sQLiteDatabase2 != null) {
            }
            if (sQLitePreparedStatement != null) {
            }
            if (sQLitePreparedStatement2 != null) {
            }
            if (sQLiteCursor != null) {
            }
            p1();
        } catch (Throwable th8) {
            th = th8;
            sQLitePreparedStatement = executeFast;
            sQLiteCursor = null;
            sQLitePreparedStatement2 = null;
            sQLiteDatabase = this.b;
            if (sQLiteDatabase != null) {
            }
            if (sQLitePreparedStatement != null) {
            }
            if (sQLitePreparedStatement2 != null) {
            }
            if (sQLiteCursor != null) {
            }
            p1();
            throw th;
        }
        p1();
    }

    public final void w1() {
        ArrayList arrayList = this.I;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.b.executeFast("UPDATE dialog_filter SET ord = ?, flags = ? WHERE id = ?");
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    t97 t97Var = (t97) arrayList.get(i);
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindInteger(1, t97Var.f);
                    sQLitePreparedStatement.bindInteger(2, t97Var.g);
                    sQLitePreparedStatement.bindInteger(3, t97Var.a);
                    sQLitePreparedStatement.step();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e) {
                n(e, true);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public final void x(long j, TLRPC.Message message) {
        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
        tL_forumTopic.topicStartMessage = message;
        tL_forumTopic.top_message = message.id;
        tL_forumTopic.topMessage = message;
        tL_forumTopic.from_id = message.from_id;
        tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
        tL_forumTopic.unread_count = 0;
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionTopicCreate) {
            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = (TLRPC.TL_messageActionTopicCreate) messageAction;
            tL_forumTopic.id = message.id;
            long j2 = tL_messageActionTopicCreate.icon_emoji_id;
            tL_forumTopic.icon_emoji_id = j2;
            tL_forumTopic.title = tL_messageActionTopicCreate.title;
            tL_forumTopic.icon_color = tL_messageActionTopicCreate.icon_color;
            if (j2 != 0) {
                tL_forumTopic.flags |= 1;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(tL_forumTopic);
            A1(j, arrayList, false, false, message.date);
            gl.c3(new go6((Object) this, j, (Object) tL_forumTopic, (byte) 10));
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionTopicEdit) {
            TLRPC.TL_messageActionTopicEdit tL_messageActionTopicEdit = (TLRPC.TL_messageActionTopicEdit) messageAction;
            tL_forumTopic.id = (int) k27.b2(this.currentAccount, message, true, false);
            tL_forumTopic.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
            tL_forumTopic.title = tL_messageActionTopicEdit.title;
            tL_forumTopic.closed = tL_messageActionTopicEdit.closed;
            tL_forumTopic.hidden = tL_messageActionTopicEdit.hidden;
            int i = tL_messageActionTopicEdit.flags;
            int i2 = (i & 1) != 0 ? 1 : 0;
            if ((i & 2) != 0) {
                i2 += 2;
            }
            if ((i & 4) != 0) {
                i2 += 8;
            }
            if ((i & 8) != 0) {
                i2 += 32;
            }
            this.a.c(new a70(this, i2, tL_forumTopic, j, message.date));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0455 A[Catch: Exception -> 0x0608, all -> 0x0623, TryCatch #3 {all -> 0x0623, blocks: (B:197:0x000e, B:3:0x0046, B:13:0x00fb, B:146:0x04a1, B:152:0x03b9, B:154:0x0455, B:156:0x045b, B:157:0x047d, B:158:0x0057, B:178:0x00c9), top: B:196:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x047d A[Catch: Exception -> 0x0608, all -> 0x0623, TryCatch #3 {all -> 0x0623, blocks: (B:197:0x000e, B:3:0x0046, B:13:0x00fb, B:146:0x04a1, B:152:0x03b9, B:154:0x0455, B:156:0x045b, B:157:0x047d, B:158:0x0057, B:178:0x00c9), top: B:196:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0332  */
    /* JADX WARN: Type inference failed for: r0v153, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r0v33, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r27v0, types: [ad7, pf0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [org.telegram.tgnet.TLRPC$Message] */
    /* JADX WARN: Type inference failed for: r3v27, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v37, types: [org.telegram.tgnet.TLRPC$Message] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [org.telegram.SQLite.SQLiteCursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x0(int i, long j) {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor queryFinalized;
        ad7 ad7Var;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor sQLiteCursor3;
        ArrayList arrayList;
        String str;
        boolean z;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        long j2;
        String str8;
        SQLiteCursor sQLiteCursor4;
        int i2;
        SQLiteCursor sQLiteCursor5;
        String str9;
        ?? r12 = 0;
        if (i == 3) {
            try {
                try {
                    queryFinalized = this.b.queryFinalized("SELECT last_mid FROM dialogs WHERE did = " + j, new Object[0]);
                } catch (Throwable th) {
                    th = th;
                    sQLitePreparedStatement = null;
                    sQLitePreparedStatement2 = null;
                    sQLiteCursor = null;
                    sQLiteCursor2 = null;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    if (sQLiteCursor2 != null) {
                        sQLiteCursor2.dispose();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    throw th;
                }
            } catch (Exception e) {
                e = e;
                ad7Var = this;
                sQLitePreparedStatement = null;
                sQLitePreparedStatement2 = null;
                sQLiteCursor = null;
                sQLiteCursor2 = null;
                try {
                    ad7Var.m(e);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    if (sQLiteCursor2 != null) {
                        sQLiteCursor2.dispose();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    if (sQLitePreparedStatement2 == null) {
                        sQLitePreparedStatement2.dispose();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    if (sQLiteCursor != null) {
                    }
                    if (sQLiteCursor2 != null) {
                    }
                    if (sQLitePreparedStatement != null) {
                    }
                    if (sQLitePreparedStatement2 != null) {
                    }
                    throw th;
                }
            }
            try {
                int intValue = queryFinalized.next() ? queryFinalized.intValue(0) : -1;
                queryFinalized.dispose();
                if (intValue != 0) {
                    return;
                }
            } catch (Exception e2) {
                e = e2;
                ad7Var = this;
                sQLiteCursor = queryFinalized;
                sQLitePreparedStatement = null;
                sQLitePreparedStatement2 = null;
                sQLiteCursor2 = null;
                ad7Var.m(e);
                if (sQLiteCursor != null) {
                }
                if (sQLiteCursor2 != null) {
                }
                if (sQLitePreparedStatement != null) {
                }
                if (sQLitePreparedStatement2 == null) {
                }
            } catch (Throwable th3) {
                th = th3;
                sQLiteCursor = queryFinalized;
                sQLitePreparedStatement = null;
                sQLitePreparedStatement2 = null;
                sQLiteCursor2 = null;
                if (sQLiteCursor != null) {
                }
                if (sQLiteCursor2 != null) {
                }
                if (sQLitePreparedStatement != null) {
                }
                if (sQLitePreparedStatement2 != null) {
                }
                throw th;
            }
        }
        byte b = 8;
        if (cf3.B(j) || i == 2) {
            ?? queryFinalized2 = this.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j, new Object[0]);
            try {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    String str10 = "SELECT data FROM messages_v2 WHERE uid = ";
                    ArrayList arrayList4 = new ArrayList();
                    queryFinalized2 = queryFinalized2;
                    while (queryFinalized2.next()) {
                        try {
                            ?? byteBufferValue = queryFinalized2.byteBufferValue(r12);
                            if (byteBufferValue != 0) {
                                ?? TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r12), r12);
                                TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().n);
                                byteBufferValue.reuse();
                                sQLiteCursor3 = queryFinalized2;
                                arrayList = arrayList3;
                                str = str10;
                                z = true;
                                try {
                                    try {
                                        a(TLdeserialize, arrayList2, arrayList4, arrayList, false);
                                    } catch (Exception e3) {
                                        e = e3;
                                        try {
                                            m(e);
                                            sQLiteCursor3.dispose();
                                            C(arrayList4, z);
                                            gl.c3(new i41(this, arrayList, b));
                                            getFileLoader().getClass();
                                            ba4.p(i, arrayList2);
                                            String str11 = "DELETE FROM messages_topics WHERE uid = ";
                                            if (i != 0) {
                                            }
                                            str2 = "DELETE FROM bot_keyboard_topics WHERE uid = ";
                                            str3 = "DELETE FROM bot_keyboard WHERE uid = ";
                                            str4 = "DELETE FROM media_v4 WHERE uid = ";
                                            str5 = "DELETE FROM media_counts_v2 WHERE uid = ";
                                            str6 = "DELETE FROM messages_holes WHERE uid = ";
                                            str7 = "DELETE FROM messages_topics WHERE uid = ";
                                            j2 = j;
                                            ad7Var = this;
                                        } catch (Exception e4) {
                                            e = e4;
                                            ad7Var = this;
                                            sQLiteCursor = sQLiteCursor3;
                                            sQLitePreparedStatement = null;
                                            sQLitePreparedStatement2 = null;
                                            sQLiteCursor2 = null;
                                            ad7Var.m(e);
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLiteCursor2 != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            if (sQLitePreparedStatement2 == null) {
                                            }
                                        }
                                        try {
                                            ad7Var.b.executeFast("DELETE FROM dialogs WHERE did = " + j2).stepThis().dispose();
                                            ad7Var.b.executeFast("DELETE FROM chat_pinned_v2 WHERE uid = " + j2).stepThis().dispose();
                                            ad7Var.b.executeFast("DELETE FROM chat_pinned_count WHERE uid = " + j2).stepThis().dispose();
                                            ad7Var.b.executeFast("DELETE FROM channel_users_v2 WHERE did = " + j2).stepThis().dispose();
                                            ad7Var.b.executeFast("DELETE FROM search_recent WHERE did = " + j2).stepThis().dispose();
                                            if (!cf3.B(j2)) {
                                            }
                                            ad7Var.b.executeFast("UPDATE dialogs SET unread_count = 0, unread_count_i = 0 WHERE did = " + j2).stepThis().dispose();
                                            ad7Var.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j2).stepThis().dispose();
                                            ad7Var.b.executeFast("DELETE FROM widget_state WHERE uid = " + j2).stepThis().dispose();
                                            ad7Var.b.executeFast("DELETE FROM widget_heights WHERE uid = " + j2).stepThis().dispose();
                                            ad7Var.b.executeFast(str7 + j2).stepThis().dispose();
                                            ad7Var.b.executeFast(str3 + j2).stepThis().dispose();
                                            ad7Var.b.executeFast(str2 + j2).stepThis().dispose();
                                            ad7Var.b.executeFast(str5 + j2).stepThis().dispose();
                                            ad7Var.b.executeFast(str8 + j2).stepThis().dispose();
                                            ad7Var.b.executeFast(str6 + j2).stepThis().dispose();
                                            ad7Var.b.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + j2).stepThis().dispose();
                                            hq6 mediaDataController = ad7Var.getMediaDataController();
                                            mediaDataController.getClass();
                                            gl.c3(new ko6(mediaDataController, j2, (byte) 0));
                                            gl.c3(new vb7(ad7Var, (byte) 8));
                                            ad7Var.q1(false);
                                            ArrayList arrayList5 = new ArrayList();
                                            arrayList5.add(Long.valueOf(j2));
                                            ad7Var.i2(arrayList5);
                                        } catch (Exception e5) {
                                            e = e5;
                                            sQLitePreparedStatement = null;
                                            sQLitePreparedStatement2 = null;
                                            sQLiteCursor = null;
                                            sQLiteCursor2 = null;
                                            ad7Var.m(e);
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLiteCursor2 != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            if (sQLitePreparedStatement2 == null) {
                                            }
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    sQLiteCursor = sQLiteCursor3;
                                    sQLitePreparedStatement = null;
                                    sQLitePreparedStatement2 = null;
                                    sQLiteCursor2 = null;
                                    if (sQLiteCursor != null) {
                                    }
                                    if (sQLiteCursor2 != null) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLitePreparedStatement2 != null) {
                                    }
                                    throw th;
                                }
                            } else {
                                sQLiteCursor3 = queryFinalized2;
                                arrayList = arrayList3;
                                str = str10;
                            }
                            arrayList3 = arrayList;
                            queryFinalized2 = sQLiteCursor3;
                            str10 = str;
                            r12 = 0;
                        } catch (Exception e6) {
                            e = e6;
                            sQLiteCursor3 = queryFinalized2;
                            arrayList = arrayList3;
                            str = str10;
                            z = true;
                        }
                    }
                    sQLiteCursor3 = queryFinalized2;
                    arrayList = arrayList3;
                    str = str10;
                    z = true;
                    sQLiteCursor3.dispose();
                    C(arrayList4, z);
                    gl.c3(new i41(this, arrayList, b));
                    getFileLoader().getClass();
                    ba4.p(i, arrayList2);
                } catch (Exception e7) {
                    e = e7;
                    ad7Var = this;
                    sQLiteCursor3 = queryFinalized2;
                }
            } catch (Throwable th5) {
                th = th5;
                sQLiteCursor3 = queryFinalized2;
            }
        } else {
            str = "SELECT data FROM messages_v2 WHERE uid = ";
        }
        String str112 = "DELETE FROM messages_topics WHERE uid = ";
        if (i != 0 || i == 3) {
            str2 = "DELETE FROM bot_keyboard_topics WHERE uid = ";
            str3 = "DELETE FROM bot_keyboard WHERE uid = ";
            str4 = "DELETE FROM media_v4 WHERE uid = ";
            str5 = "DELETE FROM media_counts_v2 WHERE uid = ";
            str6 = "DELETE FROM messages_holes WHERE uid = ";
            str7 = "DELETE FROM messages_topics WHERE uid = ";
            j2 = j;
            ad7Var = this;
            ad7Var.b.executeFast("DELETE FROM dialogs WHERE did = " + j2).stepThis().dispose();
            ad7Var.b.executeFast("DELETE FROM chat_pinned_v2 WHERE uid = " + j2).stepThis().dispose();
            ad7Var.b.executeFast("DELETE FROM chat_pinned_count WHERE uid = " + j2).stepThis().dispose();
            ad7Var.b.executeFast("DELETE FROM channel_users_v2 WHERE did = " + j2).stepThis().dispose();
            ad7Var.b.executeFast("DELETE FROM search_recent WHERE did = " + j2).stepThis().dispose();
            if (!cf3.B(j2)) {
                str8 = str4;
                ad7Var.b.executeFast("DELETE FROM enc_chats WHERE uid = " + cf3.h(j2)).stepThis().dispose();
            } else if (cf3.y(j2)) {
                SQLiteDatabase sQLiteDatabase = ad7Var.b;
                StringBuilder sb = new StringBuilder();
                sb.append("DELETE FROM chat_settings_v2 WHERE uid = ");
                str8 = str4;
                sb.append(-j2);
                sQLiteDatabase.executeFast(sb.toString()).stepThis().dispose();
            }
            ad7Var.b.executeFast("UPDATE dialogs SET unread_count = 0, unread_count_i = 0 WHERE did = " + j2).stepThis().dispose();
            ad7Var.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j2).stepThis().dispose();
            ad7Var.b.executeFast("DELETE FROM widget_state WHERE uid = " + j2).stepThis().dispose();
            ad7Var.b.executeFast("DELETE FROM widget_heights WHERE uid = " + j2).stepThis().dispose();
            ad7Var.b.executeFast(str7 + j2).stepThis().dispose();
            ad7Var.b.executeFast(str3 + j2).stepThis().dispose();
            ad7Var.b.executeFast(str2 + j2).stepThis().dispose();
            ad7Var.b.executeFast(str5 + j2).stepThis().dispose();
            ad7Var.b.executeFast(str8 + j2).stepThis().dispose();
            ad7Var.b.executeFast(str6 + j2).stepThis().dispose();
            ad7Var.b.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + j2).stepThis().dispose();
            hq6 mediaDataController2 = ad7Var.getMediaDataController();
            mediaDataController2.getClass();
            gl.c3(new ko6(mediaDataController2, j2, (byte) 0));
            gl.c3(new vb7(ad7Var, (byte) 8));
            ad7Var.q1(false);
            ArrayList arrayList52 = new ArrayList();
            arrayList52.add(Long.valueOf(j2));
            ad7Var.i2(arrayList52);
        }
        if (i == 2) {
            SQLiteCursor queryFinalized3 = this.b.queryFinalized("SELECT last_mid_i, last_mid FROM dialogs WHERE did = " + j, new Object[0]);
            try {
                if (queryFinalized3.next()) {
                    long longValue = queryFinalized3.longValue(0);
                    long longValue2 = queryFinalized3.longValue(1);
                    SQLiteDatabase sQLiteDatabase2 = this.b;
                    StringBuilder sb2 = new StringBuilder();
                    sQLiteCursor4 = queryFinalized3;
                    try {
                        try {
                            sb2.append(str);
                            sb2.append(j);
                            sb2.append(" AND mid IN (");
                            sb2.append(longValue);
                            sb2.append(",");
                            sb2.append(longValue2);
                            sb2.append(")");
                            String sb3 = sb2.toString();
                            ?? r14 = 0;
                            i2 = -1;
                            ?? r3 = sQLiteDatabase2.queryFinalized(sb3, new Object[0]);
                            while (r3.next()) {
                                try {
                                    ?? byteBufferValue2 = r3.byteBufferValue(r14);
                                    if (byteBufferValue2 != 0) {
                                        sQLiteCursor5 = r3;
                                        try {
                                            try {
                                                ?? TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(r14), r14);
                                                if (TLdeserialize2 != 0) {
                                                    str9 = str112;
                                                    try {
                                                        TLdeserialize2.readAttachPath(byteBufferValue2, getUserConfig().n);
                                                    } catch (Exception e8) {
                                                        e = e8;
                                                        try {
                                                            m(e);
                                                            sQLiteCursor5.dispose();
                                                            this.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j + " AND mid != " + longValue + " AND mid != " + longValue2).stepThis().dispose();
                                                            this.b.executeFast("DELETE FROM widget_state WHERE uid = " + j + " AND mid != " + longValue + " AND mid != " + longValue2).stepThis().dispose();
                                                            this.b.executeFast("DELETE FROM widget_heights WHERE uid = " + j + " AND mid != " + longValue + " AND mid != " + longValue2).stepThis().dispose();
                                                            this.b.executeFast(str9 + j + " AND mid != " + longValue + " AND mid != " + longValue2).stepThis().dispose();
                                                            SQLiteDatabase sQLiteDatabase3 = this.b;
                                                            StringBuilder sb4 = new StringBuilder();
                                                            sb4.append("DELETE FROM messages_holes WHERE uid = ");
                                                            sb4.append(j);
                                                            sQLiteDatabase3.executeFast(sb4.toString()).stepThis().dispose();
                                                            this.b.executeFast("DELETE FROM bot_keyboard WHERE uid = " + j).stepThis().dispose();
                                                            this.b.executeFast("DELETE FROM bot_keyboard_topics WHERE uid = " + j).stepThis().dispose();
                                                            this.b.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + j).stepThis().dispose();
                                                            this.b.executeFast("DELETE FROM media_v4 WHERE uid = " + j).stepThis().dispose();
                                                            this.b.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + j).stepThis().dispose();
                                                            hq6 mediaDataController3 = getMediaDataController();
                                                            mediaDataController3.getClass();
                                                            gl.c3(new ko6(mediaDataController3, j, (byte) 0));
                                                            sQLitePreparedStatement = this.b.executeFast("REPLACE INTO messages_holes VALUES(?, ?, ?)");
                                                            sQLitePreparedStatement2 = this.b.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                                                            if (i2 != -1) {
                                                            }
                                                            sQLitePreparedStatement.dispose();
                                                            sQLitePreparedStatement2.dispose();
                                                            try {
                                                                ArrayList arrayList6 = new ArrayList();
                                                                arrayList6.add(Long.valueOf(j));
                                                                ad7Var.i2(arrayList6);
                                                                sQLiteCursor4.dispose();
                                                                return;
                                                            } catch (Exception e9) {
                                                                e = e9;
                                                                sQLiteCursor = sQLiteCursor4;
                                                                sQLitePreparedStatement = null;
                                                                sQLitePreparedStatement2 = null;
                                                                sQLiteCursor2 = null;
                                                                ad7Var.m(e);
                                                                if (sQLiteCursor != null) {
                                                                }
                                                                if (sQLiteCursor2 != null) {
                                                                }
                                                                if (sQLitePreparedStatement != null) {
                                                                }
                                                                if (sQLitePreparedStatement2 == null) {
                                                                }
                                                            }
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                            ad7Var = this;
                                                            sQLiteCursor = sQLiteCursor4;
                                                            sQLiteCursor2 = sQLiteCursor5;
                                                            sQLitePreparedStatement = null;
                                                            sQLitePreparedStatement2 = null;
                                                            ad7Var.m(e);
                                                            if (sQLiteCursor != null) {
                                                            }
                                                            if (sQLiteCursor2 != null) {
                                                            }
                                                            if (sQLitePreparedStatement != null) {
                                                            }
                                                            if (sQLitePreparedStatement2 == null) {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    str9 = str112;
                                                }
                                                byteBufferValue2.reuse();
                                                if (TLdeserialize2 != 0) {
                                                    i2 = TLdeserialize2.id;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                sQLiteCursor = sQLiteCursor4;
                                                sQLiteCursor2 = sQLiteCursor5;
                                                sQLitePreparedStatement = null;
                                                sQLitePreparedStatement2 = null;
                                                if (sQLiteCursor != null) {
                                                }
                                                if (sQLiteCursor2 != null) {
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                }
                                                if (sQLitePreparedStatement2 != null) {
                                                }
                                                throw th;
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
                                            str9 = str112;
                                            m(e);
                                            sQLiteCursor5.dispose();
                                            this.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j + " AND mid != " + longValue + " AND mid != " + longValue2).stepThis().dispose();
                                            this.b.executeFast("DELETE FROM widget_state WHERE uid = " + j + " AND mid != " + longValue + " AND mid != " + longValue2).stepThis().dispose();
                                            this.b.executeFast("DELETE FROM widget_heights WHERE uid = " + j + " AND mid != " + longValue + " AND mid != " + longValue2).stepThis().dispose();
                                            this.b.executeFast(str9 + j + " AND mid != " + longValue + " AND mid != " + longValue2).stepThis().dispose();
                                            SQLiteDatabase sQLiteDatabase32 = this.b;
                                            StringBuilder sb42 = new StringBuilder();
                                            sb42.append("DELETE FROM messages_holes WHERE uid = ");
                                            sb42.append(j);
                                            sQLiteDatabase32.executeFast(sb42.toString()).stepThis().dispose();
                                            this.b.executeFast("DELETE FROM bot_keyboard WHERE uid = " + j).stepThis().dispose();
                                            this.b.executeFast("DELETE FROM bot_keyboard_topics WHERE uid = " + j).stepThis().dispose();
                                            this.b.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + j).stepThis().dispose();
                                            this.b.executeFast("DELETE FROM media_v4 WHERE uid = " + j).stepThis().dispose();
                                            this.b.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + j).stepThis().dispose();
                                            hq6 mediaDataController32 = getMediaDataController();
                                            mediaDataController32.getClass();
                                            gl.c3(new ko6(mediaDataController32, j, (byte) 0));
                                            sQLitePreparedStatement = this.b.executeFast("REPLACE INTO messages_holes VALUES(?, ?, ?)");
                                            sQLitePreparedStatement2 = this.b.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                                            if (i2 != -1) {
                                            }
                                            sQLitePreparedStatement.dispose();
                                            sQLitePreparedStatement2.dispose();
                                            ArrayList arrayList62 = new ArrayList();
                                            arrayList62.add(Long.valueOf(j));
                                            ad7Var.i2(arrayList62);
                                            sQLiteCursor4.dispose();
                                            return;
                                        }
                                    } else {
                                        sQLiteCursor5 = r3;
                                        str9 = str112;
                                    }
                                    r3 = sQLiteCursor5;
                                    str112 = str9;
                                    r14 = 0;
                                } catch (Exception e12) {
                                    e = e12;
                                    sQLiteCursor5 = r3;
                                } catch (Throwable th7) {
                                    th = th7;
                                    sQLiteCursor5 = r3;
                                    sQLiteCursor = sQLiteCursor4;
                                    sQLiteCursor2 = sQLiteCursor5;
                                    sQLitePreparedStatement = null;
                                    sQLitePreparedStatement2 = null;
                                    if (sQLiteCursor != null) {
                                    }
                                    if (sQLiteCursor2 != null) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLitePreparedStatement2 != null) {
                                    }
                                    throw th;
                                }
                            }
                            sQLiteCursor5 = r3;
                            str9 = str112;
                            sQLiteCursor5.dispose();
                            this.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j + " AND mid != " + longValue + " AND mid != " + longValue2).stepThis().dispose();
                            this.b.executeFast("DELETE FROM widget_state WHERE uid = " + j + " AND mid != " + longValue + " AND mid != " + longValue2).stepThis().dispose();
                            this.b.executeFast("DELETE FROM widget_heights WHERE uid = " + j + " AND mid != " + longValue + " AND mid != " + longValue2).stepThis().dispose();
                            this.b.executeFast(str9 + j + " AND mid != " + longValue + " AND mid != " + longValue2).stepThis().dispose();
                            SQLiteDatabase sQLiteDatabase322 = this.b;
                            StringBuilder sb422 = new StringBuilder();
                            sb422.append("DELETE FROM messages_holes WHERE uid = ");
                            sb422.append(j);
                            sQLiteDatabase322.executeFast(sb422.toString()).stepThis().dispose();
                            this.b.executeFast("DELETE FROM bot_keyboard WHERE uid = " + j).stepThis().dispose();
                            this.b.executeFast("DELETE FROM bot_keyboard_topics WHERE uid = " + j).stepThis().dispose();
                            this.b.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + j).stepThis().dispose();
                            this.b.executeFast("DELETE FROM media_v4 WHERE uid = " + j).stepThis().dispose();
                            this.b.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + j).stepThis().dispose();
                            hq6 mediaDataController322 = getMediaDataController();
                            mediaDataController322.getClass();
                            gl.c3(new ko6(mediaDataController322, j, (byte) 0));
                            sQLitePreparedStatement = this.b.executeFast("REPLACE INTO messages_holes VALUES(?, ?, ?)");
                        } catch (Exception e13) {
                            e = e13;
                            ad7Var = this;
                            sQLiteCursor = sQLiteCursor4;
                            sQLitePreparedStatement = null;
                            sQLitePreparedStatement2 = null;
                            sQLiteCursor2 = null;
                            ad7Var.m(e);
                            if (sQLiteCursor != null) {
                            }
                            if (sQLiteCursor2 != null) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                            if (sQLitePreparedStatement2 == null) {
                            }
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        sQLiteCursor = sQLiteCursor4;
                        sQLitePreparedStatement = null;
                        sQLitePreparedStatement2 = null;
                        sQLiteCursor2 = null;
                        if (sQLiteCursor != null) {
                        }
                        if (sQLiteCursor2 != null) {
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLitePreparedStatement2 != null) {
                        }
                        throw th;
                    }
                    try {
                        sQLitePreparedStatement2 = this.b.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                        if (i2 != -1) {
                            ad7Var = this;
                            try {
                                v(j, sQLitePreparedStatement, sQLitePreparedStatement2, i2, 0L);
                            } catch (Exception e14) {
                                e = e14;
                                sQLiteCursor = sQLiteCursor4;
                                sQLiteCursor2 = null;
                                ad7Var.m(e);
                                if (sQLiteCursor != null) {
                                }
                                if (sQLiteCursor2 != null) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLitePreparedStatement2 == null) {
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                sQLiteCursor = sQLiteCursor4;
                                sQLiteCursor2 = null;
                                if (sQLiteCursor != null) {
                                }
                                if (sQLiteCursor2 != null) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLitePreparedStatement2 != null) {
                                }
                                throw th;
                            }
                        } else {
                            ad7Var = this;
                        }
                        sQLitePreparedStatement.dispose();
                    } catch (Exception e15) {
                        e = e15;
                        ad7Var = this;
                        sQLiteCursor = sQLiteCursor4;
                        sQLitePreparedStatement2 = null;
                        sQLiteCursor2 = null;
                        ad7Var.m(e);
                        if (sQLiteCursor != null) {
                        }
                        if (sQLiteCursor2 != null) {
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLitePreparedStatement2 == null) {
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        sQLiteCursor = sQLiteCursor4;
                        sQLitePreparedStatement2 = null;
                        sQLiteCursor2 = null;
                        if (sQLiteCursor != null) {
                        }
                        if (sQLiteCursor2 != null) {
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLitePreparedStatement2 != null) {
                        }
                        throw th;
                    }
                    try {
                        sQLitePreparedStatement2.dispose();
                        ArrayList arrayList622 = new ArrayList();
                        arrayList622.add(Long.valueOf(j));
                        ad7Var.i2(arrayList622);
                    } catch (Exception e16) {
                        e = e16;
                        sQLiteCursor = sQLiteCursor4;
                        sQLitePreparedStatement = null;
                        sQLiteCursor2 = null;
                        ad7Var.m(e);
                        if (sQLiteCursor != null) {
                        }
                        if (sQLiteCursor2 != null) {
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLitePreparedStatement2 == null) {
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        sQLiteCursor = sQLiteCursor4;
                        sQLitePreparedStatement = null;
                        sQLiteCursor2 = null;
                        if (sQLiteCursor != null) {
                        }
                        if (sQLiteCursor2 != null) {
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLitePreparedStatement2 != null) {
                        }
                        throw th;
                    }
                } else {
                    ad7Var = this;
                    sQLiteCursor4 = queryFinalized3;
                }
                sQLiteCursor4.dispose();
                return;
            } catch (Exception e17) {
                e = e17;
                ad7Var = this;
                sQLiteCursor4 = queryFinalized3;
            } catch (Throwable th12) {
                th = th12;
                sQLiteCursor4 = queryFinalized3;
            }
        } else {
            str2 = "DELETE FROM bot_keyboard_topics WHERE uid = ";
            str3 = "DELETE FROM bot_keyboard WHERE uid = ";
            str4 = "DELETE FROM media_v4 WHERE uid = ";
            str5 = "DELETE FROM media_counts_v2 WHERE uid = ";
            str6 = "DELETE FROM messages_holes WHERE uid = ";
            str7 = "DELETE FROM messages_topics WHERE uid = ";
            j2 = j;
            ad7Var = this;
        }
        str8 = str4;
        ad7Var.b.executeFast("UPDATE dialogs SET unread_count = 0, unread_count_i = 0 WHERE did = " + j2).stepThis().dispose();
        ad7Var.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j2).stepThis().dispose();
        ad7Var.b.executeFast("DELETE FROM widget_state WHERE uid = " + j2).stepThis().dispose();
        ad7Var.b.executeFast("DELETE FROM widget_heights WHERE uid = " + j2).stepThis().dispose();
        ad7Var.b.executeFast(str7 + j2).stepThis().dispose();
        ad7Var.b.executeFast(str3 + j2).stepThis().dispose();
        ad7Var.b.executeFast(str2 + j2).stepThis().dispose();
        ad7Var.b.executeFast(str5 + j2).stepThis().dispose();
        ad7Var.b.executeFast(str8 + j2).stepThis().dispose();
        ad7Var.b.executeFast(str6 + j2).stepThis().dispose();
        ad7Var.b.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + j2).stepThis().dispose();
        hq6 mediaDataController22 = ad7Var.getMediaDataController();
        mediaDataController22.getClass();
        gl.c3(new ko6(mediaDataController22, j2, (byte) 0));
        gl.c3(new vb7(ad7Var, (byte) 8));
        ad7Var.q1(false);
        ArrayList arrayList522 = new ArrayList();
        arrayList522.add(Long.valueOf(j2));
        ad7Var.i2(arrayList522);
    }

    public final void x1(int i, int i2, int i3, int i4) {
        this.a.c(new gc7(this, i, i2, i3, i4, (byte) 0));
    }

    public final long y(NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer == null) {
            return 0L;
        }
        long andAdd = this.f.getAndAdd(1L);
        this.a.c(new go6((Object) this, andAdd, (Object) nativeByteBuffer, (byte) 13));
        return andAdd;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:0|1|2|3|4|(8:5|6|7|(15:9|10|(1:12)(1:287)|13|14|15|(36:20|21|22|(5:24|25|(2:27|(1:29)(1:30))|31|(2:155|108)(2:33|(1:35)))(2:162|163)|36|(3:38|39|(28:41|42|(1:44)(1:152)|45|(1:47)(1:151)|48|(1:50)(1:150)|51|52|(3:54|55|(1:57))|58|59|60|(1:62)|63|64|(1:66)|67|68|(9:70|(7:72|(1:74)|75|76|77|78|(1:144)(4:84|(1:143)(5:88|89|90|91|(1:93))|94|(1:96)))(1:148)|98|(3:120|121|(1:123))|100|(3:102|(1:104)|105)(2:109|(3:111|(1:113)|114)(2:115|(2:117|(1:119))))|106|107|108)(1:149)|97|98|(0)|100|(0)(0)|106|107|108))(1:154)|153|42|(0)(0)|45|(0)(0)|48|(0)(0)|51|52|(0)|58|59|60|(0)|63|64|(0)|67|68|(0)(0)|97|98|(0)|100|(0)(0)|106|107|108|17|18)|167|168|169|170|171|172|(9:174|(6:177|178|179|(2:181|182)(1:184)|183|175)|190|191|(6:194|195|(3:196|197|(3:199|(2:201|(2:203|204)(1:256))(2:258|259)|257)(2:260|261))|(2:254|255)(2:207|(12:209|210|211|212|(2:241|242)|214|215|216|217|(4:223|(2:227|(1:229))|230|(1:232))|233|234)(2:252|253))|235|192)|264|265|266|267)(2:269|270)|268)(1:290)|160|161|(1:136)|137)|291|292|293|294|(7:351|352|(4:355|(1:371)(4:357|(2:359|(1:361))(2:368|(1:370))|362|(2:364|365)(1:367))|366|353)|372|373|(5:375|(3:379|376|377)|380|381|382)(1:387)|383)(1:296)|297|(6:299|300|301|302|303|304)(1:348)|305|(1:307)|308|(1:310)|311|(5:313|(4:316|(4:319|(2:323|324)|325|317)|328|314)|329|330|(8:332|333|334|335|336|(1:338)|128|129))|342|333|334|335|336|(0)|128|129|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0653, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02b9 A[Catch: Exception -> 0x031e, all -> 0x04d0, TryCatch #4 {Exception -> 0x031e, blocks: (B:98:0x02a4, B:121:0x02aa, B:123:0x02b0, B:100:0x02b3, B:102:0x02b9, B:104:0x02c9, B:109:0x02d3, B:111:0x02db, B:113:0x02e5, B:114:0x02ec, B:115:0x02f6, B:117:0x02fe, B:119:0x0309, B:142:0x028c, B:148:0x0290), top: B:120:0x02aa }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d3 A[Catch: Exception -> 0x031e, all -> 0x04d0, TryCatch #4 {Exception -> 0x031e, blocks: (B:98:0x02a4, B:121:0x02aa, B:123:0x02b0, B:100:0x02b3, B:102:0x02b9, B:104:0x02c9, B:109:0x02d3, B:111:0x02db, B:113:0x02e5, B:114:0x02ec, B:115:0x02f6, B:117:0x02fe, B:119:0x0309, B:142:0x028c, B:148:0x0290), top: B:120:0x02aa }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:338:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ab A[Catch: Exception -> 0x0212, all -> 0x059b, TRY_ENTER, TRY_LEAVE, TryCatch #18 {Exception -> 0x0212, blocks: (B:25:0x00bd, B:27:0x00ca, B:29:0x00d0, B:30:0x00df, B:31:0x00e9, B:35:0x00ef, B:39:0x0121, B:55:0x0188, B:57:0x018c, B:62:0x01ab, B:66:0x01d2, B:74:0x020f), top: B:24:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d2 A[Catch: Exception -> 0x0212, all -> 0x059b, TRY_ENTER, TRY_LEAVE, TryCatch #18 {Exception -> 0x0212, blocks: (B:25:0x00bd, B:27:0x00ca, B:29:0x00d0, B:30:0x00df, B:31:0x00e9, B:35:0x00ef, B:39:0x0121, B:55:0x0188, B:57:0x018c, B:62:0x01ab, B:66:0x01d2, B:74:0x020f), top: B:24:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e0 A[Catch: Exception -> 0x0328, all -> 0x04d8, TryCatch #8 {Exception -> 0x0328, blocks: (B:22:0x00b3, B:36:0x00fe, B:42:0x012d, B:45:0x014c, B:48:0x0163, B:51:0x016c, B:59:0x0193, B:64:0x01bd, B:68:0x01da, B:70:0x01e0, B:72:0x01eb, B:76:0x021d, B:163:0x00f9), top: B:21:0x00b3 }] */
    /* JADX WARN: Type inference failed for: r0v167, types: [org.telegram.tgnet.TLRPC$TL_dialogFolder] */
    /* JADX WARN: Type inference failed for: r0v84, types: [org.telegram.tgnet.TLRPC$TL_dialog] */
    /* JADX WARN: Type inference failed for: r0v85 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0(int i, int i2, int i3, long[] jArr) {
        ad7 ad7Var;
        TLRPC.TL_messages_dialogs tL_messages_dialogs;
        ArrayList arrayList;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        ArrayList arrayList2;
        HashSet hashSet;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        vf6 vf6Var;
        vf6 vf6Var2;
        ArrayList arrayList7;
        int i4;
        ArrayList arrayList8;
        TLRPC.TL_messages_dialogs tL_messages_dialogs2;
        HashSet hashSet2;
        int i5;
        vf6 vf6Var3;
        SQLiteCursor queryFinalized;
        ArrayList arrayList9;
        int i6;
        int i7;
        int i8;
        SQLiteCursor sQLiteCursor3;
        SQLiteCursor sQLiteCursor4;
        ArrayList arrayList10;
        ArrayList arrayList11;
        TLRPC.TL_messages_dialogs tL_messages_dialogs3;
        ArrayList arrayList12;
        TLRPC.Dialog dialog;
        ArrayList arrayList13;
        NativeByteBuffer byteBufferValue;
        int i9;
        TLRPC.TL_messages_dialogs tL_messages_dialogs4;
        ad7 ad7Var2;
        ?? tL_dialog;
        ArrayList arrayList14;
        int i10;
        int i11;
        long longValue;
        NativeByteBuffer byteBufferValue2;
        ArrayList arrayList15;
        ArrayList arrayList16;
        ArrayList arrayList17;
        HashSet hashSet3;
        NativeByteBuffer byteBufferValue3;
        ad7 ad7Var3 = this;
        TLRPC.TL_messages_dialogs tL_messages_dialogs5 = new TLRPC.TL_messages_dialogs();
        ArrayList arrayList18 = new ArrayList();
        try {
            try {
                arrayList2 = new ArrayList();
                hashSet = new HashSet();
                arrayList2.add(Long.valueOf(ad7Var3.getUserConfig().e()));
                arrayList3 = new ArrayList();
                arrayList4 = new ArrayList();
                arrayList5 = new ArrayList();
                arrayList6 = new ArrayList();
                vf6Var = new vf6();
                vf6Var2 = new vf6();
                arrayList7 = new ArrayList(2);
                arrayList7.add(Integer.valueOf(i));
                i4 = 0;
                sQLiteCursor = null;
            } catch (Throwable th) {
                th = th;
                sQLiteCursor2 = null;
            }
            while (true) {
                try {
                    try {
                        arrayList8 = arrayList18;
                        if (i4 >= arrayList7.size()) {
                            break;
                        }
                        try {
                            Integer num = (Integer) arrayList7.get(i4);
                            num.getClass();
                            if (i4 == 0) {
                                i8 = i2;
                                i6 = i4;
                                i7 = i3;
                            } else {
                                i6 = i4;
                                i7 = 100;
                                i8 = 0;
                            }
                            ArrayList arrayList19 = new ArrayList();
                            HashSet hashSet4 = hashSet;
                            SQLiteDatabase sQLiteDatabase = ad7Var3.b;
                            Locale locale = Locale.US;
                            ArrayList arrayList20 = arrayList4;
                            StringBuilder sb = new StringBuilder();
                            try {
                                sb.append("SELECT d.did, d.last_mid, d.unread_count, d.date, m.data, m.read_state, m.mid, m.send_state, s.flags, m.date, d.pts, d.inbox_max, d.outbox_max, m.replydata, d.pinned, d.unread_count_i, d.flags, d.folder_id, d.data, d.unread_reactions, d.last_mid_group, d.ttl_period, d.unread_poll_votes FROM dialogs as d LEFT JOIN messages_v2 as m ON d.last_mid = m.mid AND d.did = m.uid AND d.last_mid_group IS NULL LEFT JOIN dialog_settings as s ON d.did = s.did WHERE d.folder_id = ");
                                sb.append(num);
                                sb.append(" ORDER BY d.pinned DESC, d.date DESC LIMIT ");
                                sb.append(i8);
                                sb.append(",");
                                sb.append(i7);
                                queryFinalized = sQLiteDatabase.queryFinalized(sb.toString(), new Object[0]);
                                while (queryFinalized.next()) {
                                    try {
                                        try {
                                            try {
                                                long longValue2 = queryFinalized.longValue(0);
                                                if (cf3.C(longValue2)) {
                                                    try {
                                                        try {
                                                            tL_dialog = new TLRPC.TL_dialogFolder();
                                                            if (!queryFinalized.isNull(18)) {
                                                                NativeByteBuffer byteBufferValue4 = queryFinalized.byteBufferValue(18);
                                                                if (byteBufferValue4 != null) {
                                                                    tL_dialog.folder = TLRPC.TL_folder.TLdeserialize(byteBufferValue4, byteBufferValue4.readInt32(false), false);
                                                                    byteBufferValue4.reuse();
                                                                } else {
                                                                    TLRPC.TL_folder tL_folder = new TLRPC.TL_folder();
                                                                    tL_dialog.folder = tL_folder;
                                                                    tL_folder.id = (int) longValue2;
                                                                }
                                                            }
                                                            TLRPC.TL_folder tL_folder2 = tL_dialog.folder;
                                                            if (tL_folder2 == null) {
                                                                continue;
                                                            } else if (i6 == 0) {
                                                                arrayList7.add(Integer.valueOf(tL_folder2.id));
                                                            }
                                                        } catch (Exception e) {
                                                            e = e;
                                                            ad7Var = this;
                                                            sQLiteCursor = queryFinalized;
                                                            tL_messages_dialogs = tL_messages_dialogs5;
                                                            arrayList = arrayList8;
                                                            tL_messages_dialogs.dialogs.clear();
                                                            tL_messages_dialogs.users.clear();
                                                            tL_messages_dialogs.chats.clear();
                                                            arrayList.clear();
                                                            ad7Var.m(e);
                                                            ad7Var.getMessagesController().M3(tL_messages_dialogs, arrayList, null, i, 0, 100, 1, true, false, true);
                                                            if (sQLiteCursor == null) {
                                                            }
                                                            sQLiteCursor.dispose();
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        sQLiteCursor2 = queryFinalized;
                                                    }
                                                } else {
                                                    tL_dialog = new TLRPC.TL_dialog();
                                                }
                                                TLRPC.Dialog dialog2 = tL_dialog;
                                                dialog2.id = longValue2;
                                                dialog2.top_message = queryFinalized.intValue(1);
                                                dialog2.unread_count = queryFinalized.intValue(2);
                                                dialog2.last_message_date = queryFinalized.intValue(3);
                                                int intValue = queryFinalized.intValue(10);
                                                dialog2.pts = intValue;
                                                if (intValue != 0) {
                                                    arrayList14 = arrayList7;
                                                    if (!cf3.D(dialog2.id)) {
                                                        i10 = 1;
                                                        dialog2.flags = i10;
                                                        dialog2.read_inbox_max_id = queryFinalized.intValue(11);
                                                        dialog2.read_outbox_max_id = queryFinalized.intValue(12);
                                                        int intValue2 = queryFinalized.intValue(14);
                                                        dialog2.pinnedNum = intValue2;
                                                        dialog2.pinned = intValue2 == 0;
                                                        dialog2.unread_mentions_count = queryFinalized.intValue(15);
                                                        int intValue3 = queryFinalized.intValue(16);
                                                        dialog2.unread_mark = (intValue3 & 1) == 0;
                                                        dialog2.view_forum_as_messages = (intValue3 & 64) == 0;
                                                        long longValue3 = queryFinalized.longValue(8);
                                                        i11 = (int) longValue3;
                                                        ArrayList arrayList21 = arrayList14;
                                                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                                                        dialog2.notify_settings = tL_peerNotifySettings;
                                                        if ((i11 & 1) != 0) {
                                                            int i12 = (int) (longValue3 >> 32);
                                                            tL_peerNotifySettings.mute_until = i12;
                                                            if (i12 == 0) {
                                                                tL_peerNotifySettings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                            }
                                                        }
                                                        dialog2.folder_id = queryFinalized.intValue(17);
                                                        dialog2.unread_reactions_count = queryFinalized.intValue(19);
                                                        longValue = queryFinalized.longValue(20);
                                                        if (longValue != 0) {
                                                            arrayList19.add(new Pair(Long.valueOf(longValue2), Long.valueOf(longValue)));
                                                        }
                                                        dialog2.ttl_period = queryFinalized.intValue(21);
                                                        dialog2.unread_poll_votes_count = queryFinalized.intValue(22);
                                                        tL_messages_dialogs5.dialogs.add(dialog2);
                                                        if (jArr != null) {
                                                            arrayList5.add(Long.valueOf(longValue2));
                                                        }
                                                        byteBufferValue2 = queryFinalized.byteBufferValue(4);
                                                        if (byteBufferValue2 == null) {
                                                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                                            if (TLdeserialize != null) {
                                                                arrayList16 = arrayList5;
                                                                TLdeserialize.readAttachPath(byteBufferValue2, getUserConfig().n);
                                                                byteBufferValue2.reuse();
                                                                k27.L5(queryFinalized.intValue(5), TLdeserialize);
                                                                TLdeserialize.id = queryFinalized.intValue(6);
                                                                int intValue4 = queryFinalized.intValue(9);
                                                                if (intValue4 != 0) {
                                                                    dialog2.last_message_date = intValue4;
                                                                }
                                                                TLdeserialize.send_state = queryFinalized.intValue(7);
                                                                TLdeserialize.dialog_id = dialog2.id;
                                                                tL_messages_dialogs5.messages.add(TLdeserialize);
                                                                d(TLdeserialize, arrayList2, arrayList3, arrayList6);
                                                                try {
                                                                    TLRPC.MessageReplyHeader messageReplyHeader = TLdeserialize.reply_to;
                                                                    if (messageReplyHeader == null || messageReplyHeader.reply_to_msg_id == 0 || !s0(TLdeserialize.action)) {
                                                                        arrayList15 = arrayList19;
                                                                        tL_messages_dialogs4 = tL_messages_dialogs5;
                                                                    } else {
                                                                        if (queryFinalized.isNull(13) || (byteBufferValue3 = queryFinalized.byteBufferValue(13)) == null) {
                                                                            arrayList15 = arrayList19;
                                                                            tL_messages_dialogs4 = tL_messages_dialogs5;
                                                                        } else {
                                                                            TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(false), false);
                                                                            TLdeserialize.replyMessage = TLdeserialize2;
                                                                            arrayList15 = arrayList19;
                                                                            tL_messages_dialogs4 = tL_messages_dialogs5;
                                                                            try {
                                                                                TLdeserialize2.readAttachPath(byteBufferValue3, getUserConfig().n);
                                                                                byteBufferValue3.reuse();
                                                                                TLRPC.Message message = TLdeserialize.replyMessage;
                                                                                if (message != null) {
                                                                                    d(message, arrayList2, arrayList3, arrayList6);
                                                                                }
                                                                            } catch (Exception e2) {
                                                                                e = e2;
                                                                                sQLiteCursor3 = queryFinalized;
                                                                                ad7Var2 = this;
                                                                                ad7Var2.m(e);
                                                                                if (!cf3.B(longValue2)) {
                                                                                }
                                                                                if (cf3.B(longValue2)) {
                                                                                }
                                                                                queryFinalized = sQLiteCursor3;
                                                                                hashSet4 = hashSet3;
                                                                                arrayList20 = arrayList17;
                                                                                arrayList5 = arrayList16;
                                                                                arrayList7 = arrayList21;
                                                                                tL_messages_dialogs5 = tL_messages_dialogs4;
                                                                                arrayList19 = arrayList15;
                                                                            }
                                                                        }
                                                                        if (TLdeserialize.replyMessage == null) {
                                                                            c(TLdeserialize, vf6Var, vf6Var2);
                                                                        }
                                                                    }
                                                                } catch (Exception e3) {
                                                                    e = e3;
                                                                    arrayList15 = arrayList19;
                                                                    tL_messages_dialogs4 = tL_messages_dialogs5;
                                                                }
                                                            } else {
                                                                arrayList15 = arrayList19;
                                                                tL_messages_dialogs4 = tL_messages_dialogs5;
                                                                arrayList16 = arrayList5;
                                                                sQLiteCursor3 = queryFinalized;
                                                                ad7Var2 = this;
                                                                byteBufferValue2.reuse();
                                                            }
                                                            if (!cf3.B(longValue2)) {
                                                                try {
                                                                    try {
                                                                        if (dialog2.read_inbox_max_id > dialog2.top_message) {
                                                                            dialog2.read_inbox_max_id = 0;
                                                                        }
                                                                    } catch (Exception e4) {
                                                                        e = e4;
                                                                        ad7Var = ad7Var2;
                                                                        sQLiteCursor = sQLiteCursor3;
                                                                        arrayList = arrayList8;
                                                                        tL_messages_dialogs = tL_messages_dialogs4;
                                                                        tL_messages_dialogs.dialogs.clear();
                                                                        tL_messages_dialogs.users.clear();
                                                                        tL_messages_dialogs.chats.clear();
                                                                        arrayList.clear();
                                                                        ad7Var.m(e);
                                                                        ad7Var.getMessagesController().M3(tL_messages_dialogs, arrayList, null, i, 0, 100, 1, true, false, true);
                                                                        if (sQLiteCursor == null) {
                                                                        }
                                                                        sQLiteCursor.dispose();
                                                                    }
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    sQLiteCursor2 = sQLiteCursor3;
                                                                    if (sQLiteCursor2 != null) {
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                            if (cf3.B(longValue2)) {
                                                                arrayList17 = arrayList20;
                                                                if (cf3.D(longValue2)) {
                                                                    if (!arrayList2.contains(Long.valueOf(longValue2))) {
                                                                        arrayList2.add(Long.valueOf(longValue2));
                                                                    }
                                                                    hashSet3 = hashSet4;
                                                                    hashSet3.add(Long.valueOf(longValue2));
                                                                } else {
                                                                    hashSet3 = hashSet4;
                                                                    if (cf3.y(longValue2)) {
                                                                        long j = -longValue2;
                                                                        if (!arrayList3.contains(Long.valueOf(j))) {
                                                                            arrayList3.add(Long.valueOf(j));
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                int h = cf3.h(longValue2);
                                                                arrayList17 = arrayList20;
                                                                if (!arrayList17.contains(Integer.valueOf(h))) {
                                                                    arrayList17.add(Integer.valueOf(h));
                                                                }
                                                                hashSet3 = hashSet4;
                                                            }
                                                            queryFinalized = sQLiteCursor3;
                                                            hashSet4 = hashSet3;
                                                            arrayList20 = arrayList17;
                                                            arrayList5 = arrayList16;
                                                            arrayList7 = arrayList21;
                                                            tL_messages_dialogs5 = tL_messages_dialogs4;
                                                            arrayList19 = arrayList15;
                                                        } else {
                                                            arrayList15 = arrayList19;
                                                            tL_messages_dialogs4 = tL_messages_dialogs5;
                                                            arrayList16 = arrayList5;
                                                        }
                                                        sQLiteCursor3 = queryFinalized;
                                                        ad7Var2 = this;
                                                        if (!cf3.B(longValue2)) {
                                                        }
                                                        if (cf3.B(longValue2)) {
                                                        }
                                                        queryFinalized = sQLiteCursor3;
                                                        hashSet4 = hashSet3;
                                                        arrayList20 = arrayList17;
                                                        arrayList5 = arrayList16;
                                                        arrayList7 = arrayList21;
                                                        tL_messages_dialogs5 = tL_messages_dialogs4;
                                                        arrayList19 = arrayList15;
                                                    }
                                                } else {
                                                    arrayList14 = arrayList7;
                                                }
                                                i10 = 0;
                                                dialog2.flags = i10;
                                                dialog2.read_inbox_max_id = queryFinalized.intValue(11);
                                                dialog2.read_outbox_max_id = queryFinalized.intValue(12);
                                                int intValue22 = queryFinalized.intValue(14);
                                                dialog2.pinnedNum = intValue22;
                                                dialog2.pinned = intValue22 == 0;
                                                dialog2.unread_mentions_count = queryFinalized.intValue(15);
                                                int intValue32 = queryFinalized.intValue(16);
                                                dialog2.unread_mark = (intValue32 & 1) == 0;
                                                dialog2.view_forum_as_messages = (intValue32 & 64) == 0;
                                                long longValue32 = queryFinalized.longValue(8);
                                                i11 = (int) longValue32;
                                                ArrayList arrayList212 = arrayList14;
                                                TLRPC.TL_peerNotifySettings tL_peerNotifySettings2 = new TLRPC.TL_peerNotifySettings();
                                                dialog2.notify_settings = tL_peerNotifySettings2;
                                                if ((i11 & 1) != 0) {
                                                }
                                                dialog2.folder_id = queryFinalized.intValue(17);
                                                dialog2.unread_reactions_count = queryFinalized.intValue(19);
                                                longValue = queryFinalized.longValue(20);
                                                if (longValue != 0) {
                                                }
                                                dialog2.ttl_period = queryFinalized.intValue(21);
                                                dialog2.unread_poll_votes_count = queryFinalized.intValue(22);
                                                tL_messages_dialogs5.dialogs.add(dialog2);
                                                if (jArr != null) {
                                                }
                                                byteBufferValue2 = queryFinalized.byteBufferValue(4);
                                                if (byteBufferValue2 == null) {
                                                }
                                                sQLiteCursor3 = queryFinalized;
                                                ad7Var2 = this;
                                                if (!cf3.B(longValue2)) {
                                                }
                                                if (cf3.B(longValue2)) {
                                                }
                                                queryFinalized = sQLiteCursor3;
                                                hashSet4 = hashSet3;
                                                arrayList20 = arrayList17;
                                                arrayList5 = arrayList16;
                                                arrayList7 = arrayList212;
                                                tL_messages_dialogs5 = tL_messages_dialogs4;
                                                arrayList19 = arrayList15;
                                            } catch (Exception e5) {
                                                e = e5;
                                                sQLiteCursor3 = queryFinalized;
                                                tL_messages_dialogs4 = tL_messages_dialogs5;
                                                ad7Var2 = this;
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                            sQLiteCursor4 = queryFinalized;
                                            tL_messages_dialogs2 = tL_messages_dialogs5;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        sQLiteCursor3 = queryFinalized;
                                    }
                                }
                                ArrayList arrayList22 = arrayList19;
                                TLRPC.TL_messages_dialogs tL_messages_dialogs6 = tL_messages_dialogs5;
                                ArrayList arrayList23 = arrayList5;
                                ArrayList arrayList24 = arrayList7;
                                HashSet hashSet5 = hashSet4;
                                ArrayList arrayList25 = arrayList20;
                                sQLiteCursor4 = queryFinalized;
                                ad7Var3 = this;
                                try {
                                    sQLiteCursor4.dispose();
                                    try {
                                        if (arrayList22.isEmpty()) {
                                            arrayList10 = arrayList6;
                                            arrayList11 = arrayList25;
                                            tL_messages_dialogs3 = tL_messages_dialogs6;
                                            sQLiteCursor = null;
                                        } else {
                                            StringBuilder sb2 = new StringBuilder();
                                            int i13 = 0;
                                            while (i13 < arrayList22.size()) {
                                                ArrayList arrayList26 = arrayList22;
                                                try {
                                                    Pair pair = (Pair) arrayList26.get(i13);
                                                    sb2.append("uid = ");
                                                    sb2.append(pair.first);
                                                    sb2.append(" AND group_id = ");
                                                    sb2.append(pair.second);
                                                    i13++;
                                                    if (i13 < arrayList26.size()) {
                                                        sb2.append(" OR ");
                                                    }
                                                    arrayList22 = arrayList26;
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    ad7Var = ad7Var3;
                                                    arrayList = arrayList8;
                                                    tL_messages_dialogs = tL_messages_dialogs6;
                                                    sQLiteCursor = null;
                                                    tL_messages_dialogs.dialogs.clear();
                                                    tL_messages_dialogs.users.clear();
                                                    tL_messages_dialogs.chats.clear();
                                                    arrayList.clear();
                                                    ad7Var.m(e);
                                                    ad7Var.getMessagesController().M3(tL_messages_dialogs, arrayList, null, i, 0, 100, 1, true, false, true);
                                                    if (sQLiteCursor == null) {
                                                    }
                                                    sQLiteCursor.dispose();
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    sQLiteCursor2 = null;
                                                }
                                            }
                                            SQLiteDatabase sQLiteDatabase2 = ad7Var3.b;
                                            Locale locale2 = Locale.US;
                                            int i14 = 0;
                                            sQLiteCursor4 = sQLiteDatabase2.queryFinalized("SELECT uid, data, read_state, mid, send_state, date, replydata, group_id FROM messages_v2 WHERE " + ((Object) sb2) + " ORDER BY date DESC", new Object[0]);
                                            while (sQLiteCursor4.next()) {
                                                long longValue4 = sQLiteCursor4.longValue(i14);
                                                NativeByteBuffer byteBufferValue5 = sQLiteCursor4.byteBufferValue(1);
                                                tL_messages_dialogs2 = tL_messages_dialogs6;
                                                int i15 = 0;
                                                while (true) {
                                                    try {
                                                        if (i15 >= tL_messages_dialogs2.dialogs.size()) {
                                                            arrayList12 = arrayList25;
                                                            dialog = null;
                                                            break;
                                                        }
                                                        dialog = tL_messages_dialogs2.dialogs.get(i15);
                                                        if (dialog != null) {
                                                            arrayList12 = arrayList25;
                                                            i9 = i15;
                                                            if (dialog.id == longValue4) {
                                                                break;
                                                            }
                                                        } else {
                                                            arrayList12 = arrayList25;
                                                            i9 = i15;
                                                        }
                                                        i15 = i9 + 1;
                                                        arrayList25 = arrayList12;
                                                    } catch (Exception e8) {
                                                        e = e8;
                                                        ad7Var = ad7Var3;
                                                        sQLiteCursor = sQLiteCursor4;
                                                        tL_messages_dialogs = tL_messages_dialogs2;
                                                        arrayList = arrayList8;
                                                        tL_messages_dialogs.dialogs.clear();
                                                        tL_messages_dialogs.users.clear();
                                                        tL_messages_dialogs.chats.clear();
                                                        arrayList.clear();
                                                        ad7Var.m(e);
                                                        ad7Var.getMessagesController().M3(tL_messages_dialogs, arrayList, null, i, 0, 100, 1, true, false, true);
                                                        if (sQLiteCursor == null) {
                                                        }
                                                        sQLiteCursor.dispose();
                                                    }
                                                }
                                                if (dialog == null || byteBufferValue5 == null) {
                                                    arrayList13 = arrayList6;
                                                } else {
                                                    TLRPC.Message TLdeserialize3 = TLRPC.Message.TLdeserialize(byteBufferValue5, byteBufferValue5.readInt32(false), false);
                                                    if (TLdeserialize3 != null) {
                                                        arrayList13 = arrayList6;
                                                        try {
                                                            TLdeserialize3.readAttachPath(byteBufferValue5, ad7Var3.getUserConfig().n);
                                                            byteBufferValue5.reuse();
                                                            k27.L5(sQLiteCursor4.intValue(2), TLdeserialize3);
                                                            TLdeserialize3.id = sQLiteCursor4.intValue(3);
                                                            int intValue5 = sQLiteCursor4.intValue(5);
                                                            if (intValue5 != 0) {
                                                                try {
                                                                    dialog.last_message_date = intValue5;
                                                                } catch (Exception e9) {
                                                                    e = e9;
                                                                    ad7Var = this;
                                                                    sQLiteCursor = sQLiteCursor4;
                                                                    tL_messages_dialogs = tL_messages_dialogs2;
                                                                    arrayList = arrayList8;
                                                                    tL_messages_dialogs.dialogs.clear();
                                                                    tL_messages_dialogs.users.clear();
                                                                    tL_messages_dialogs.chats.clear();
                                                                    arrayList.clear();
                                                                    ad7Var.m(e);
                                                                    ad7Var.getMessagesController().M3(tL_messages_dialogs, arrayList, null, i, 0, 100, 1, true, false, true);
                                                                    if (sQLiteCursor == null) {
                                                                    }
                                                                    sQLiteCursor.dispose();
                                                                }
                                                            }
                                                            TLdeserialize3.send_state = sQLiteCursor4.intValue(4);
                                                            TLdeserialize3.dialog_id = longValue4;
                                                            tL_messages_dialogs2.messages.add(TLdeserialize3);
                                                            d(TLdeserialize3, arrayList2, arrayList3, null);
                                                            try {
                                                                TLRPC.MessageReplyHeader messageReplyHeader2 = TLdeserialize3.reply_to;
                                                                if (messageReplyHeader2 != null && messageReplyHeader2.reply_to_msg_id != 0 && s0(TLdeserialize3.action)) {
                                                                    if (!sQLiteCursor4.isNull(7) && (byteBufferValue = sQLiteCursor4.byteBufferValue(7)) != null) {
                                                                        TLRPC.Message TLdeserialize4 = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                                        TLdeserialize3.replyMessage = TLdeserialize4;
                                                                        TLdeserialize4.readAttachPath(byteBufferValue, getUserConfig().n);
                                                                        byteBufferValue.reuse();
                                                                        TLRPC.Message message2 = TLdeserialize3.replyMessage;
                                                                        if (message2 != null) {
                                                                            d(message2, arrayList2, arrayList3, null);
                                                                        }
                                                                    }
                                                                    if (TLdeserialize3.replyMessage == null) {
                                                                        c(TLdeserialize3, vf6Var, vf6Var2);
                                                                    }
                                                                }
                                                                ad7Var3 = this;
                                                            } catch (Exception e10) {
                                                                ad7Var3 = this;
                                                                ad7Var3.m(e10);
                                                            }
                                                        } catch (Exception e11) {
                                                            e = e11;
                                                            ad7Var3 = this;
                                                            ad7Var = ad7Var3;
                                                            sQLiteCursor = sQLiteCursor4;
                                                            tL_messages_dialogs = tL_messages_dialogs2;
                                                            arrayList = arrayList8;
                                                            tL_messages_dialogs.dialogs.clear();
                                                            tL_messages_dialogs.users.clear();
                                                            tL_messages_dialogs.chats.clear();
                                                            arrayList.clear();
                                                            ad7Var.m(e);
                                                            ad7Var.getMessagesController().M3(tL_messages_dialogs, arrayList, null, i, 0, 100, 1, true, false, true);
                                                            if (sQLiteCursor == null) {
                                                            }
                                                            sQLiteCursor.dispose();
                                                        }
                                                    } else {
                                                        arrayList13 = arrayList6;
                                                        byteBufferValue5.reuse();
                                                    }
                                                }
                                                tL_messages_dialogs6 = tL_messages_dialogs2;
                                                arrayList6 = arrayList13;
                                                arrayList25 = arrayList12;
                                                i14 = 0;
                                            }
                                            arrayList10 = arrayList6;
                                            arrayList11 = arrayList25;
                                            tL_messages_dialogs3 = tL_messages_dialogs6;
                                            sQLiteCursor4.dispose();
                                            sQLiteCursor = sQLiteCursor4;
                                        }
                                        hashSet = hashSet5;
                                        tL_messages_dialogs5 = tL_messages_dialogs3;
                                        arrayList5 = arrayList23;
                                        arrayList18 = arrayList8;
                                        arrayList6 = arrayList10;
                                        arrayList4 = arrayList11;
                                        arrayList7 = arrayList24;
                                        i4 = i6 + 1;
                                    } catch (Exception e12) {
                                        e = e12;
                                        ad7Var = ad7Var3;
                                        tL_messages_dialogs = tL_messages_dialogs6;
                                        sQLiteCursor = null;
                                        arrayList = arrayList8;
                                        tL_messages_dialogs.dialogs.clear();
                                        tL_messages_dialogs.users.clear();
                                        tL_messages_dialogs.chats.clear();
                                        arrayList.clear();
                                        ad7Var.m(e);
                                        ad7Var.getMessagesController().M3(tL_messages_dialogs, arrayList, null, i, 0, 100, 1, true, false, true);
                                        if (sQLiteCursor == null) {
                                        }
                                        sQLiteCursor.dispose();
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    tL_messages_dialogs2 = tL_messages_dialogs6;
                                }
                            } catch (Exception e14) {
                                e = e14;
                                ad7Var3 = this;
                                tL_messages_dialogs2 = tL_messages_dialogs5;
                                ad7Var = ad7Var3;
                                tL_messages_dialogs = tL_messages_dialogs2;
                                arrayList = arrayList8;
                                tL_messages_dialogs.dialogs.clear();
                                tL_messages_dialogs.users.clear();
                                tL_messages_dialogs.chats.clear();
                                arrayList.clear();
                                ad7Var.m(e);
                                ad7Var.getMessagesController().M3(tL_messages_dialogs, arrayList, null, i, 0, 100, 1, true, false, true);
                                if (sQLiteCursor == null) {
                                }
                                sQLiteCursor.dispose();
                            }
                        } catch (Exception e15) {
                            e = e15;
                        }
                        th = th2;
                        sQLiteCursor2 = queryFinalized;
                    } catch (Exception e16) {
                        e = e16;
                        ad7Var = ad7Var3;
                        tL_messages_dialogs = tL_messages_dialogs5;
                        arrayList = arrayList18;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor2 = sQLiteCursor;
                }
                if (sQLiteCursor2 != null) {
                    sQLiteCursor2.dispose();
                }
                throw th;
            }
            ArrayList arrayList27 = arrayList4;
            ArrayList arrayList28 = arrayList5;
            tL_messages_dialogs2 = tL_messages_dialogs5;
            hashSet2 = hashSet;
            try {
                ad7Var3.H0(vf6Var, vf6Var2, arrayList2, arrayList3, 0);
                ad7Var = ad7Var3;
                if (jArr != null) {
                    try {
                        ArrayList arrayList29 = new ArrayList();
                        for (int i16 = 0; i16 < jArr.length; i16++) {
                            long j2 = jArr[i16];
                            if (!cf3.B(j2)) {
                                if (j2 <= 0) {
                                    long j3 = -j2;
                                    if (!arrayList3.contains(Long.valueOf(j3))) {
                                        arrayList3.add(Long.valueOf(j3));
                                    }
                                } else if (!arrayList2.contains(Long.valueOf(j2))) {
                                    arrayList2.add(Long.valueOf(j2));
                                }
                                if (!arrayList28.contains(Long.valueOf(jArr[i16]))) {
                                    arrayList29.add(Long.valueOf(jArr[i16]));
                                }
                            }
                        }
                        if (arrayList29.isEmpty()) {
                            i5 = 0;
                            vf6Var3 = null;
                        } else {
                            vf6Var3 = new vf6(arrayList29.size());
                            SQLiteDatabase sQLiteDatabase3 = ad7Var.b;
                            Locale locale3 = Locale.US;
                            i5 = 0;
                            queryFinalized = sQLiteDatabase3.queryFinalized("SELECT did, folder_id FROM dialogs WHERE did IN(" + TextUtils.join(",", arrayList29) + ")", new Object[0]);
                            while (queryFinalized.next()) {
                                try {
                                    vf6Var3.k(Integer.valueOf(queryFinalized.intValue(1)), queryFinalized.longValue(0));
                                } catch (Exception e17) {
                                    e = e17;
                                    sQLiteCursor = queryFinalized;
                                    tL_messages_dialogs = tL_messages_dialogs2;
                                    arrayList = arrayList8;
                                    tL_messages_dialogs.dialogs.clear();
                                    tL_messages_dialogs.users.clear();
                                    tL_messages_dialogs.chats.clear();
                                    arrayList.clear();
                                    ad7Var.m(e);
                                    ad7Var.getMessagesController().M3(tL_messages_dialogs, arrayList, null, i, 0, 100, 1, true, false, true);
                                    if (sQLiteCursor == null) {
                                        return;
                                    }
                                    sQLiteCursor.dispose();
                                }
                            }
                            queryFinalized.dispose();
                            sQLiteCursor = null;
                        }
                        gl.c3(new cb7(ad7Var, vf6Var3, (byte) 2));
                    } catch (Exception e18) {
                        e = e18;
                    }
                } else {
                    i5 = 0;
                }
                if (arrayList27.isEmpty()) {
                    arrayList = arrayList8;
                } else {
                    try {
                        arrayList = arrayList8;
                        try {
                            ad7Var.T(TextUtils.join(",", arrayList27), arrayList, arrayList2);
                        } catch (Exception e19) {
                            e = e19;
                            tL_messages_dialogs = tL_messages_dialogs2;
                            tL_messages_dialogs.dialogs.clear();
                            tL_messages_dialogs.users.clear();
                            tL_messages_dialogs.chats.clear();
                            arrayList.clear();
                            ad7Var.m(e);
                            ad7Var.getMessagesController().M3(tL_messages_dialogs, arrayList, null, i, 0, 100, 1, true, false, true);
                            if (sQLiteCursor == null) {
                            }
                            sQLiteCursor.dispose();
                        }
                    } catch (Exception e20) {
                        e = e20;
                        arrayList = arrayList8;
                        tL_messages_dialogs = tL_messages_dialogs2;
                        tL_messages_dialogs.dialogs.clear();
                        tL_messages_dialogs.users.clear();
                        tL_messages_dialogs.chats.clear();
                        arrayList.clear();
                        ad7Var.m(e);
                        ad7Var.getMessagesController().M3(tL_messages_dialogs, arrayList, null, i, 0, 100, 1, true, false, true);
                        if (sQLiteCursor == null) {
                        }
                        sQLiteCursor.dispose();
                    }
                }
                if (!arrayList3.isEmpty()) {
                    ad7Var.P(TextUtils.join(",", arrayList3), tL_messages_dialogs2.chats);
                }
                if (!arrayList2.isEmpty()) {
                    ad7Var.j0(arrayList2, tL_messages_dialogs2.users);
                }
            } catch (Exception e21) {
                e = e21;
                ad7Var = ad7Var3;
                tL_messages_dialogs = tL_messages_dialogs2;
                arrayList = arrayList8;
                tL_messages_dialogs.dialogs.clear();
                tL_messages_dialogs.users.clear();
                tL_messages_dialogs.chats.clear();
                arrayList.clear();
                ad7Var.m(e);
                ad7Var.getMessagesController().M3(tL_messages_dialogs, arrayList, null, i, 0, 100, 1, true, false, true);
                if (sQLiteCursor == null) {
                }
                sQLiteCursor.dispose();
            }
        } catch (Exception e22) {
            e = e22;
            ad7Var = ad7Var3;
            tL_messages_dialogs = tL_messages_dialogs5;
            arrayList = arrayList18;
            sQLiteCursor = null;
        }
        if (!hashSet2.isEmpty()) {
            HashSet hashSet6 = new HashSet();
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                Long l = (Long) it.next();
                for (int i17 = i5; i17 < tL_messages_dialogs2.users.size(); i17++) {
                    if (tL_messages_dialogs2.users.get(i17).id == l.longValue() && tL_messages_dialogs2.users.get(i17).premium) {
                        hashSet6.add(l);
                    }
                }
            }
            if (!hashSet6.isEmpty()) {
                arrayList9 = ad7Var.I0(hashSet6);
                tL_messages_dialogs = tL_messages_dialogs2;
                ad7Var.getMessagesController().M3(tL_messages_dialogs, arrayList, arrayList9, i, i2, i3, 1, false, false, true);
                if (sQLiteCursor == null) {
                    return;
                }
                sQLiteCursor.dispose();
            }
        }
        arrayList9 = null;
        tL_messages_dialogs = tL_messages_dialogs2;
        ad7Var.getMessagesController().M3(tL_messages_dialogs, arrayList, arrayList9, i, i2, i3, 1, false, false, true);
        if (sQLiteCursor == null) {
        }
        sQLiteCursor.dispose();
    }

    public final void y1(int i, int i2, int i3, int i4) {
        try {
            if (this.F == i && this.G == i2 && this.H == i3 && this.s == i4) {
                return;
            }
            SQLitePreparedStatement executeFast = this.b.executeFast("UPDATE params SET seq = ?, pts = ?, date = ?, qts = ? WHERE id = 1");
            executeFast.bindInteger(1, i);
            executeFast.bindInteger(2, i2);
            executeFast.bindInteger(3, i3);
            executeFast.bindInteger(4, i4);
            executeFast.step();
            executeFast.dispose();
            this.F = i;
            this.G = i2;
            this.H = i3;
        } catch (Exception e) {
            n(e, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x043b  */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z0() {
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor sQLiteCursor3;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        try {
            try {
                SparseArray sparseArray = new SparseArray();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                sQLiteCursor = this.b.queryFinalized("SELECT m.read_state, m.data, m.send_state, m.mid, m.date, r.random_id, m.uid, s.seq_in, s.seq_out, m.ttl FROM messages_v2 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid AND r.uid = m.uid LEFT JOIN messages_seq as s ON m.mid = s.mid WHERE (m.mid < 0 AND m.send_state = 1) OR (m.mid > 0 AND m.send_state = 3) ORDER BY m.mid DESC LIMIT 1000", new Object[0]);
                while (sQLiteCursor.next()) {
                    try {
                        NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(1);
                        if (byteBufferValue != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            TLdeserialize.send_state = sQLiteCursor.intValue(2);
                            arrayList3 = arrayList7;
                            arrayList4 = arrayList8;
                            TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().n);
                            byteBufferValue.reuse();
                            if (sparseArray.indexOfKey(TLdeserialize.id) < 0) {
                                k27.L5(sQLiteCursor.intValue(0), TLdeserialize);
                                TLdeserialize.id = sQLiteCursor.intValue(3);
                                TLdeserialize.date = sQLiteCursor.intValue(4);
                                if (!sQLiteCursor.isNull(5)) {
                                    TLdeserialize.random_id = sQLiteCursor.longValue(5);
                                }
                                TLdeserialize.dialog_id = sQLiteCursor.longValue(6);
                                TLdeserialize.seq_in = sQLiteCursor.intValue(7);
                                TLdeserialize.seq_out = sQLiteCursor.intValue(8);
                                TLdeserialize.ttl = sQLiteCursor.intValue(9);
                                if (TLdeserialize.media instanceof TLRPC.TL_messageMediaPaidMedia) {
                                    arrayList13.add(TLdeserialize);
                                } else {
                                    arrayList5.add(TLdeserialize);
                                }
                                sparseArray.put(TLdeserialize.id, TLdeserialize);
                                boolean B = cf3.B(TLdeserialize.dialog_id);
                                long j = TLdeserialize.dialog_id;
                                if (B) {
                                    int h = cf3.h(j);
                                    if (!arrayList12.contains(Integer.valueOf(h))) {
                                        arrayList12.add(Integer.valueOf(h));
                                    }
                                } else {
                                    boolean D = cf3.D(j);
                                    long j2 = TLdeserialize.dialog_id;
                                    if (D) {
                                        if (!arrayList10.contains(Long.valueOf(j2))) {
                                            arrayList10.add(Long.valueOf(TLdeserialize.dialog_id));
                                        }
                                    } else if (!arrayList11.contains(Long.valueOf(-j2))) {
                                        arrayList11.add(Long.valueOf(-TLdeserialize.dialog_id));
                                    }
                                }
                                d(TLdeserialize, arrayList10, arrayList11, null);
                                if (TLdeserialize.send_state != 3 && ((TLdeserialize.peer_id.channel_id == 0 && !TLdeserialize.unread && !cf3.B(TLdeserialize.dialog_id)) || TLdeserialize.id > 0)) {
                                    TLdeserialize.send_state = 0;
                                }
                            }
                        } else {
                            arrayList3 = arrayList7;
                            arrayList4 = arrayList8;
                        }
                        arrayList7 = arrayList3;
                        arrayList8 = arrayList4;
                    } catch (Exception e) {
                        e = e;
                        sQLiteCursor3 = sQLiteCursor;
                        m(e);
                        if (sQLiteCursor3 != 0) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor2 = sQLiteCursor;
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                        throw th;
                    }
                }
                ArrayList arrayList14 = arrayList7;
                ArrayList arrayList15 = arrayList8;
                sQLiteCursor.dispose();
                if (!arrayList13.isEmpty()) {
                    try {
                        int size = arrayList13.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList13.get(i);
                            i++;
                            TLRPC.Message message = (TLRPC.Message) obj;
                            this.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + message.dialog_id + " AND mid = " + message.id).stepThis().dispose();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        sQLiteCursor3 = 0;
                        m(e);
                        if (sQLiteCursor3 != 0) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor2 = null;
                        if (sQLiteCursor2 != null) {
                        }
                        throw th;
                    }
                }
                ?? r6 = 0;
                sQLiteCursor3 = this.b.queryFinalized("SELECT m.data, m.send_state, m.mid, m.date, r.random_id, m.uid, m.ttl FROM scheduled_messages_v2 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid AND r.uid = m.uid WHERE (m.mid < 0 AND m.send_state = 1) OR (m.mid > 0 AND m.send_state = 3) ORDER BY date ASC", new Object[0]);
                while (sQLiteCursor3.next()) {
                    try {
                        NativeByteBuffer byteBufferValue2 = sQLiteCursor3.byteBufferValue(r6);
                        if (byteBufferValue2 != 0) {
                            TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(r6), r6);
                            TLdeserialize2.send_state = sQLiteCursor3.intValue(1);
                            TLdeserialize2.readAttachPath(byteBufferValue2, getUserConfig().n);
                            byteBufferValue2.reuse();
                            if (sparseArray.indexOfKey(TLdeserialize2.id) < 0) {
                                TLdeserialize2.id = sQLiteCursor3.intValue(2);
                                TLdeserialize2.date = sQLiteCursor3.intValue(3);
                                if (!sQLiteCursor3.isNull(4)) {
                                    TLdeserialize2.random_id = sQLiteCursor3.longValue(4);
                                }
                                TLdeserialize2.dialog_id = sQLiteCursor3.longValue(5);
                                TLdeserialize2.ttl = sQLiteCursor3.intValue(6);
                                arrayList6.add(TLdeserialize2);
                                sparseArray.put(TLdeserialize2.id, TLdeserialize2);
                                boolean B2 = cf3.B(TLdeserialize2.dialog_id);
                                long j3 = TLdeserialize2.dialog_id;
                                if (B2) {
                                    int h2 = cf3.h(j3);
                                    if (!arrayList12.contains(Integer.valueOf(h2))) {
                                        arrayList12.add(Integer.valueOf(h2));
                                    }
                                } else {
                                    boolean D2 = cf3.D(j3);
                                    long j4 = TLdeserialize2.dialog_id;
                                    if (D2) {
                                        if (!arrayList10.contains(Long.valueOf(j4))) {
                                            arrayList10.add(Long.valueOf(TLdeserialize2.dialog_id));
                                        }
                                    } else if (!arrayList11.contains(Long.valueOf(-j4))) {
                                        arrayList11.add(Long.valueOf(-TLdeserialize2.dialog_id));
                                    }
                                }
                                d(TLdeserialize2, arrayList10, arrayList11, null);
                                if (TLdeserialize2.send_state != 3 && ((TLdeserialize2.peer_id.channel_id == 0 && !TLdeserialize2.unread && !cf3.B(TLdeserialize2.dialog_id)) || TLdeserialize2.id > 0)) {
                                    TLdeserialize2.send_state = 0;
                                }
                            }
                        }
                        r6 = 0;
                    } catch (Exception e3) {
                        e = e3;
                        m(e);
                        if (sQLiteCursor3 != 0) {
                            sQLiteCursor3.dispose();
                            return;
                        }
                        return;
                    }
                }
                sQLiteCursor3.dispose();
                getUserConfig().e();
                boolean z = false;
                sQLiteCursor3 = this.b.queryFinalized("SELECT m.data, m.send_state, m.mid, m.date, m.topic_id, m.ttl FROM quick_replies_messages as m WHERE (m.mid < 0 AND m.send_state = 1) OR (m.mid > 0 AND m.send_state = 3) ORDER BY mid DESC", new Object[0]);
                while (sQLiteCursor3.next()) {
                    NativeByteBuffer byteBufferValue3 = sQLiteCursor3.byteBufferValue(z ? 1 : 0);
                    if (byteBufferValue3 != null) {
                        TLRPC.Message TLdeserialize3 = TLRPC.Message.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(z), z);
                        TLdeserialize3.send_state = sQLiteCursor3.intValue(1);
                        TLdeserialize3.readAttachPath(byteBufferValue3, getUserConfig().n);
                        byteBufferValue3.reuse();
                        if (sparseArray.indexOfKey(TLdeserialize3.id) < 0) {
                            TLdeserialize3.id = sQLiteCursor3.intValue(2);
                            int intValue = sQLiteCursor3.intValue(4);
                            SQLiteCursor queryFinalized = this.b.queryFinalized("SELECT name FROM business_replies WHERE topic_id = ?", Integer.valueOf(intValue));
                            String stringValue = queryFinalized.next() ? queryFinalized.stringValue(1) : null;
                            queryFinalized.dispose();
                            if (stringValue == null) {
                                this.b.executeFast("DELETE FROM quick_replies_messages WHERE mid = " + TLdeserialize3.id + " AND topic_id = " + intValue).stepThis().dispose();
                            } else {
                                TLRPC.TL_inputQuickReplyShortcut tL_inputQuickReplyShortcut = new TLRPC.TL_inputQuickReplyShortcut();
                                tL_inputQuickReplyShortcut.shortcut = stringValue;
                                TLdeserialize3.quick_reply_shortcut = tL_inputQuickReplyShortcut;
                                TLdeserialize3.quick_reply_shortcut_id = intValue;
                                if (intValue != 0) {
                                    TLdeserialize3.flags |= TLObject.FLAG_30;
                                }
                                TLdeserialize3.date = sQLiteCursor3.intValue(3);
                                TLdeserialize3.ttl = sQLiteCursor3.intValue(5);
                                arrayList6.add(TLdeserialize3);
                                sparseArray.put(TLdeserialize3.id, TLdeserialize3);
                                boolean B3 = cf3.B(TLdeserialize3.dialog_id);
                                long j5 = TLdeserialize3.dialog_id;
                                if (B3) {
                                    int h3 = cf3.h(j5);
                                    if (!arrayList12.contains(Integer.valueOf(h3))) {
                                        arrayList12.add(Integer.valueOf(h3));
                                    }
                                } else {
                                    boolean D3 = cf3.D(j5);
                                    long j6 = TLdeserialize3.dialog_id;
                                    if (D3) {
                                        if (!arrayList10.contains(Long.valueOf(j6))) {
                                            arrayList10.add(Long.valueOf(TLdeserialize3.dialog_id));
                                        }
                                    } else if (!arrayList11.contains(Long.valueOf(-j6))) {
                                        arrayList11.add(Long.valueOf(-TLdeserialize3.dialog_id));
                                    }
                                }
                                d(TLdeserialize3, arrayList10, arrayList11, null);
                                if (TLdeserialize3.send_state != 3 && ((TLdeserialize3.peer_id.channel_id == 0 && !TLdeserialize3.unread && !cf3.B(TLdeserialize3.dialog_id)) || TLdeserialize3.id > 0)) {
                                    z = false;
                                    TLdeserialize3.send_state = 0;
                                }
                            }
                        }
                        z = false;
                    }
                }
                sQLiteCursor = null;
                sQLiteCursor3.dispose();
                if (!arrayList12.isEmpty()) {
                    T(TextUtils.join(",", arrayList12), arrayList9, arrayList10);
                }
                if (arrayList10.isEmpty()) {
                    arrayList = arrayList14;
                } else {
                    arrayList = arrayList14;
                    j0(arrayList10, arrayList);
                }
                if (arrayList11.isEmpty()) {
                    arrayList2 = arrayList15;
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = z ? 1 : 0; i2 < arrayList11.size(); i2++) {
                        Long l = (Long) arrayList11.get(i2);
                        if (sb.length() != 0) {
                            sb.append(",");
                        }
                        sb.append(l);
                    }
                    arrayList2 = arrayList15;
                    P(sb.toString(), arrayList2);
                }
                z3a sendMessagesHelper = getSendMessagesHelper();
                sendMessagesHelper.getClass();
                gl.c3(new e57((Object) sendMessagesHelper, (Object) arrayList, (Object) arrayList2, (Object) arrayList9, (Object) arrayList5, (Object) arrayList6, (byte) 1));
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e4) {
            e = e4;
            sQLiteCursor = null;
        } catch (Throwable th4) {
            th = th4;
            sQLiteCursor = null;
        }
    }

    public final void z1(int i, long j, List list, boolean z) {
        this.a.c(new tm3(this, j, list, z, i));
    }
}
