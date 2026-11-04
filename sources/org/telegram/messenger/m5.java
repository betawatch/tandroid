package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class m5 {
    public static boolean A() {
        TLRPC.User a22 = hp.s1(h10.t0).a2(0L);
        if (a22 == null) {
            return false;
        }
        return B(a22.emoji_status);
    }

    public static boolean B(TLRPC.EmojiStatus emojiStatus) {
        if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
            return false;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
        return (tL_emojiStatusCollectible.flags & 1) == 0 || tL_emojiStatusCollectible.until > ((int) (System.currentTimeMillis() / 1000));
    }

    public static boolean C(long j10) {
        return (4611686018427387904L & j10) != 0 && (j10 & Long.MIN_VALUE) == 0;
    }

    public static boolean D(long j10) {
        return (2305843009213693952L & j10) != 0 && (j10 & Long.MIN_VALUE) == 0;
    }

    public static boolean E(long j10) {
        return (C(j10) || D(j10) || j10 <= 0) ? false : true;
    }

    public static long F(long j10) {
        return (j10 & 4294967295L) | 4611686018427387904L;
    }

    public static long G(int i3) {
        return 2305843009213693952L | i3;
    }

    public static String H(ImageReceiver imageReceiver, org.telegram.ui.Components.u8 u8Var, TLObject tLObject) {
        if (!(tLObject instanceof TLRPC.User)) {
            if (!(tLObject instanceof TLRPC.Chat)) {
                return "";
            }
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str = chat.title;
            if (u8Var != null) {
                u8Var.q(chat);
            }
            if (imageReceiver != null) {
                imageReceiver.i0(tLObject, u8Var, null);
            }
            return str;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        if (l10.z(user)) {
            String M0 = bd.M0(2131746274, null);
            if (u8Var != null) {
                u8Var.g(12);
            }
            if (imageReceiver != null) {
                imageReceiver.i0(null, u8Var, null);
            }
            return M0;
        }
        if (l10.B(user)) {
            String M02 = bd.M0(2131745911, null);
            if (u8Var != null) {
                u8Var.g(1);
            }
            if (imageReceiver != null) {
                imageReceiver.i0(null, u8Var, null);
            }
            return M02;
        }
        String p10 = l10.p(user);
        if (u8Var != null) {
            u8Var.r(user);
        }
        if (imageReceiver != null) {
            imageReceiver.i0(tLObject, u8Var, null);
        }
        return p10;
    }

    public static double I(String str, String str2) {
        if (str.length() < str2.length()) {
            str2 = str;
            str = str2;
        }
        int length = str.length();
        if (length == 0) {
            return 1.0d;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        int[] iArr = new int[lowerCase2.length() + 1];
        for (int i3 = 0; i3 <= lowerCase.length(); i3++) {
            int i10 = i3;
            for (int i11 = 0; i11 <= lowerCase2.length(); i11++) {
                if (i3 == 0) {
                    iArr[i11] = i11;
                } else if (i11 > 0) {
                    int i12 = i11 - 1;
                    int i13 = iArr[i12];
                    if (lowerCase.charAt(i3 - 1) != lowerCase2.charAt(i12)) {
                        i13 = Math.min(Math.min(i13, i10), iArr[i11]) + 1;
                    }
                    iArr[i12] = i10;
                    i10 = i13;
                }
            }
            if (i3 > 0) {
                iArr[lowerCase2.length()] = i10;
            }
        }
        return (length - iArr[lowerCase2.length()]) / length;
    }

    public static boolean a(TLRPC.EmojiStatus emojiStatus, TLRPC.EmojiStatus emojiStatus2) {
        return f(emojiStatus) == f(emojiStatus2) && e(emojiStatus) == e(emojiStatus2) && g(emojiStatus) == g(emojiStatus2);
    }

    public static TLRPC.TL_username b(String str, ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            TLRPC.TL_username tL_username = (TLRPC.TL_username) obj;
            if (tL_username != null && TextUtils.equals(tL_username.username, str)) {
                return tL_username;
            }
        }
        return null;
    }

    public static long c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).bot_verification_icon;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).bot_verification_icon;
        }
        return 0L;
    }

    public static long d(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return -((TLRPC.Chat) tLObject).id;
        }
        return 0L;
    }

    public static long e(TLRPC.EmojiStatus emojiStatus) {
        if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
            return 0L;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
        if ((tL_emojiStatusCollectible.flags & 1) == 0 || tL_emojiStatusCollectible.until > ((int) (System.currentTimeMillis() / 1000))) {
            return tL_emojiStatusCollectible.collectible_id;
        }
        return 0L;
    }

    public static long f(TLRPC.EmojiStatus emojiStatus) {
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((tL_emojiStatus.flags & 1) == 0 || tL_emojiStatus.until > ((int) (System.currentTimeMillis() / 1000))) {
                return tL_emojiStatus.document_id;
            }
            return 0L;
        }
        if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
            return 0L;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
        if ((tL_emojiStatusCollectible.flags & 1) == 0 || tL_emojiStatusCollectible.until > ((int) (System.currentTimeMillis() / 1000))) {
            return tL_emojiStatusCollectible.document_id;
        }
        return 0L;
    }

    public static int g(TLRPC.EmojiStatus emojiStatus) {
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((tL_emojiStatus.flags & 1) != 0) {
                return tL_emojiStatus.until;
            }
            return 0;
        }
        if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
            return 0;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
        if ((tL_emojiStatusCollectible.flags & 1) != 0) {
            return tL_emojiStatusCollectible.until;
        }
        return 0;
    }

    public static int h(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static int i(long j10) {
        return (int) j10;
    }

    public static long j(TLRPC.Dialog dialog, TLRPC.DraftMessage draftMessage) {
        int i3;
        return (draftMessage == null || (i3 = draftMessage.date) < dialog.last_message_date) ? dialog.last_message_date : i3;
    }

    public static long k(TL_account.RequirementToContact requirementToContact) {
        if (requirementToContact instanceof TL_account.requirementToContactPaidMessages) {
            return ((TL_account.requirementToContactPaidMessages) requirementToContact).stars_amount;
        }
        return 0L;
    }

    public static String l(int i3, long j10) {
        return m(hp.s1(i3).e2(j10));
    }

    public static String m(TLObject tLObject) {
        return tLObject instanceof TLRPC.User ? g0.F2(g0.D2(l10.p((TLRPC.User) tLObject))) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : "";
    }

    public static long n(TLRPC.InputPeer inputPeer) {
        if (inputPeer == null) {
            return 0L;
        }
        long j10 = inputPeer.user_id;
        if (j10 != 0) {
            return j10;
        }
        long j11 = inputPeer.chat_id;
        return j11 != 0 ? -j11 : -inputPeer.channel_id;
    }

    public static long o(TLRPC.Peer peer) {
        if (peer == null) {
            return 0L;
        }
        long j10 = peer.user_id;
        if (j10 != 0) {
            return j10;
        }
        long j11 = peer.chat_id;
        return j11 != 0 ? -j11 : -peer.channel_id;
    }

    public static String p(String str, ArrayList arrayList) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i3);
                if (tL_username != null && ((tL_username.active || tL_username.editable) && !TextUtils.isEmpty(tL_username.username))) {
                    return tL_username.username;
                }
            }
        }
        TextUtils.isEmpty(str);
        return null;
    }

    public static String q(String str, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            return str == null ? p(chat.username, chat.usernames) : v(chat.username, chat.usernames, str);
        }
        if (!(tLObject instanceof TLRPC.User)) {
            return null;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        return str == null ? p(user.username, user.usernames) : v(user.username, user.usernames, str);
    }

    public static String r(TLObject tLObject) {
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            return p(chat.username, chat.usernames);
        }
        if (!(tLObject instanceof TLRPC.User)) {
            return null;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        return p(user.username, user.usernames);
    }

    public static String s(int i3, long j10) {
        return u(hp.s1(i3).e2(j10));
    }

    public static String t(long j10) {
        return u(hp.s1(h10.t0).e2(j10));
    }

    public static String u(TLObject tLObject) {
        return tLObject instanceof TLRPC.User ? g0.F2(g0.D2(l10.k((TLRPC.User) tLObject))) : tLObject instanceof TLRPC.Chat ? g0.F2(g0.D2(((TLRPC.Chat) tLObject).title)) : "";
    }

    public static String v(String str, ArrayList arrayList, String str2) {
        double d = -1.0d;
        String str3 = null;
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i3);
                if (tL_username != null && tL_username.active && !TextUtils.isEmpty(tL_username.username)) {
                    double I = d < 0.0d ? 0.0d : I(tL_username.username, str2);
                    if (I > d) {
                        str3 = tL_username.username;
                        d = I;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            if ((d >= 0.0d ? I(str, str2) : 0.0d) > d) {
                return str;
            }
        }
        return str3;
    }

    public static String w(long j10) {
        int i3 = h10.t0;
        TLObject e22 = hp.s1(i3).e2(j10);
        if (e22 instanceof TLRPC.User) {
            return bd.d0(i3, (TLRPC.User) e22, null, null);
        }
        if (!(e22 instanceof TLRPC.Chat)) {
            return "";
        }
        TLRPC.Chat chat = (TLRPC.Chat) e22;
        return chat.participants_count > 1 ? t3.V(chat) ? bd.H(',', "Subscribers", chat.participants_count) : bd.H(',', "Members", chat.participants_count) : t3.V(chat) ? bd.M0(2131751391, null) : bd.M0(2131754876, null);
    }

    public static void x(TLRPC.Dialog dialog) {
        if (dialog == null || dialog.id != 0) {
            return;
        }
        if (!(dialog instanceof TLRPC.TL_dialog)) {
            if (dialog instanceof TLRPC.TL_dialogFolder) {
                dialog.id = 2305843009213693952L | ((TLRPC.TL_dialogFolder) dialog).folder.id;
                return;
            } else {
                if (dialog instanceof TLRPC.TL_dialogCommunity) {
                    dialog.id = -dialog.community_id;
                    return;
                }
                return;
            }
        }
        TLRPC.Peer peer = dialog.peer;
        if (peer == null) {
            return;
        }
        long j10 = peer.user_id;
        if (j10 != 0) {
            dialog.id = j10;
            return;
        }
        long j11 = peer.chat_id;
        if (j11 != 0) {
            dialog.id = -j11;
        } else {
            dialog.id = -peer.channel_id;
        }
    }

    public static boolean y(TLRPC.Dialog dialog) {
        return (dialog == null || (dialog.flags & 1) == 0) ? false : true;
    }

    public static boolean z(long j10) {
        return (C(j10) || D(j10) || j10 >= 0) ? false : true;
    }
}
