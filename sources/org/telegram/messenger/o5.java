package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class o5 {
    public static boolean A() {
        TLRPC.User Z1 = vp.r1(d20.s0).Z1(0L);
        if (Z1 == null) {
            return false;
        }
        return B(Z1.emoji_status);
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

    public static long G(int i10) {
        return 2305843009213693952L | i10;
    }

    public static String H(ImageReceiver imageReceiver, org.telegram.ui.Components.r8 r8Var, TLObject tLObject) {
        if (!(tLObject instanceof TLRPC.User)) {
            if (!(tLObject instanceof TLRPC.Chat)) {
                return "";
            }
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str = chat.title;
            if (r8Var != null) {
                r8Var.q(chat);
            }
            if (imageReceiver != null) {
                imageReceiver.i0(tLObject, r8Var, null);
            }
            return str;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        if (h20.z(user)) {
            String L0 = cd.L0(2131746281, null);
            if (r8Var != null) {
                r8Var.g(12);
            }
            if (imageReceiver != null) {
                imageReceiver.i0(null, r8Var, null);
            }
            return L0;
        }
        if (h20.B(user)) {
            String L02 = cd.L0(2131745918, null);
            if (r8Var != null) {
                r8Var.g(1);
            }
            if (imageReceiver != null) {
                imageReceiver.i0(null, r8Var, null);
            }
            return L02;
        }
        String p5 = h20.p(user);
        if (r8Var != null) {
            r8Var.r(user);
        }
        if (imageReceiver != null) {
            imageReceiver.i0(tLObject, r8Var, null);
        }
        return p5;
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
        for (int i10 = 0; i10 <= lowerCase.length(); i10++) {
            int i11 = i10;
            for (int i12 = 0; i12 <= lowerCase2.length(); i12++) {
                if (i10 == 0) {
                    iArr[i12] = i12;
                } else if (i12 > 0) {
                    int i13 = i12 - 1;
                    int i14 = iArr[i13];
                    if (lowerCase.charAt(i10 - 1) != lowerCase2.charAt(i13)) {
                        i14 = Math.min(Math.min(i14, i11), iArr[i12]) + 1;
                    }
                    iArr[i13] = i11;
                    i11 = i14;
                }
            }
            if (i10 > 0) {
                iArr[lowerCase2.length()] = i11;
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
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
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
        int i10;
        return (draftMessage == null || (i10 = draftMessage.date) < dialog.last_message_date) ? dialog.last_message_date : i10;
    }

    public static long k(TL_account.RequirementToContact requirementToContact) {
        if (requirementToContact instanceof TL_account.requirementToContactPaidMessages) {
            return ((TL_account.requirementToContactPaidMessages) requirementToContact).stars_amount;
        }
        return 0L;
    }

    public static String l(int i10, long j10) {
        return m(vp.r1(i10).d2(j10));
    }

    public static String m(TLObject tLObject) {
        return tLObject instanceof TLRPC.User ? i0.F2(i0.D2(h20.p((TLRPC.User) tLObject))) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : "";
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
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
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

    public static String s(int i10, long j10) {
        return u(vp.r1(i10).d2(j10));
    }

    public static String t(long j10) {
        return u(vp.r1(d20.s0).d2(j10));
    }

    public static String u(TLObject tLObject) {
        return tLObject instanceof TLRPC.User ? i0.F2(i0.D2(h20.k((TLRPC.User) tLObject))) : tLObject instanceof TLRPC.Chat ? i0.F2(i0.D2(((TLRPC.Chat) tLObject).title)) : "";
    }

    public static String v(String str, ArrayList arrayList, String str2) {
        double d = -1.0d;
        String str3 = null;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
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
        int i10 = d20.s0;
        TLObject d22 = vp.r1(i10).d2(j10);
        if (d22 instanceof TLRPC.User) {
            return cd.d0(i10, (TLRPC.User) d22, null, null);
        }
        if (!(d22 instanceof TLRPC.Chat)) {
            return "";
        }
        TLRPC.Chat chat = (TLRPC.Chat) d22;
        return chat.participants_count > 1 ? w3.V(chat) ? cd.H(',', "Subscribers", chat.participants_count) : cd.H(',', "Members", chat.participants_count) : w3.V(chat) ? cd.L0(2131751391, null) : cd.L0(2131754876, null);
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
