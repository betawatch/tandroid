// default package

import android.text.TextUtils;
import java.util.Locale;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class l7c {
    public static boolean A(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        long j = user.id;
        return j == 708513 || j == 1271266957;
    }

    public static boolean B(long j) {
        return j == 333000 || j == 777000 || j == 42777;
    }

    public static boolean C(TLRPC.User user) {
        if (user != null) {
            return (user instanceof TLRPC.TL_userSelf_old3) || user.self;
        }
        return false;
    }

    public static boolean a(TLRPC.UserFull userFull, TL_account.RequirementToContact requirementToContact) {
        if (requirementToContact instanceof TL_account.requirementToContactEmpty) {
            if (userFull.contact_require_premium || userFull.send_paid_messages_stars != 0) {
                userFull.contact_require_premium = false;
                userFull.flags2 &= -16385;
                userFull.send_paid_messages_stars = 0L;
                return true;
            }
        } else if (requirementToContact instanceof TL_account.requirementToContactPremium) {
            if (!userFull.contact_require_premium || userFull.send_paid_messages_stars != 0) {
                userFull.contact_require_premium = true;
                userFull.flags2 &= -16385;
                userFull.send_paid_messages_stars = 0L;
                return true;
            }
        } else if (requirementToContact instanceof TL_account.requirementToContactPaidMessages) {
            long j = ((TL_account.requirementToContactPaidMessages) requirementToContact).stars_amount;
            if (userFull.contact_require_premium || userFull.send_paid_messages_stars != j) {
                userFull.contact_require_premium = false;
                userFull.flags2 |= TLObject.FLAG_14;
                userFull.send_paid_messages_stars = j;
                return true;
            }
        }
        return false;
    }

    public static boolean b(long j) {
        return c(na7.q1(y6c.t0).W1(j));
    }

    public static boolean c(TLRPC.UserFull userFull) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        return userFull != null && userFull.id != y6c.h(y6c.t0).e() && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_premium_gifts;
    }

    public static boolean d(TL_account.RequirementToContact requirementToContact, TL_account.RequirementToContact requirementToContact2) {
        if (requirementToContact instanceof TL_account.requirementToContactEmpty) {
            requirementToContact = null;
        }
        if (requirementToContact2 instanceof TL_account.requirementToContactEmpty) {
            requirementToContact2 = null;
        }
        if (requirementToContact == null) {
            if (requirementToContact2 == null) {
                return true;
            }
        } else if (requirementToContact2 != null) {
            if ((requirementToContact instanceof TL_account.requirementToContactPremium) && (requirementToContact2 instanceof TL_account.requirementToContactPremium)) {
                return true;
            }
            return (requirementToContact instanceof TL_account.requirementToContactPaidMessages) && (requirementToContact2 instanceof TL_account.requirementToContactPaidMessages) && ((TL_account.requirementToContactPaidMessages) requirementToContact).stars_amount == ((TL_account.requirementToContactPaidMessages) requirementToContact2).stars_amount;
        }
        return false;
    }

    public static String e(TLRPC.User user) {
        String o = o(user);
        if (o != null) {
            String lowerCase = o.toLowerCase(Locale.ROOT);
            if (lowerCase.endsWith("agent")) {
                return k96.M0(2131752932, null);
            }
            if (lowerCase.endsWith("game")) {
                return k96.M0(2131752930, null);
            }
            if (lowerCase.endsWith("app")) {
                return k96.M0(2131752931, null);
            }
            if (lowerCase.endsWith("ai")) {
                return k96.M0(2131752933, null);
            }
            if (lowerCase.endsWith("gay")) {
                return k96.M0(2131752929, null);
            }
        }
        return k96.M0(2131753153, null);
    }

    public static int f(TLRPC.User user) {
        if (user == null) {
            return 0;
        }
        TLRPC.PeerColor peerColor = user.color;
        return (!(peerColor instanceof TLRPC.TL_peerColor) || (peerColor.flags & 1) == 0) ? (int) (user.id % 7) : peerColor.color;
    }

    public static long g(TLRPC.User user) {
        if (user == null) {
            return 0L;
        }
        TLRPC.PeerColor peerColor = user.color;
        if (!(peerColor instanceof TLRPC.TL_peerColor) || (peerColor.flags & 2) == 0) {
            return 0L;
        }
        return peerColor.background_emoji_id;
    }

    public static Long h(TLRPC.EmojiStatus emojiStatus) {
        if (emojiStatus == null) {
            return null;
        }
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((tL_emojiStatus.flags & 1) == 0 || tL_emojiStatus.until > ((int) (System.currentTimeMillis() / 1000))) {
                return Long.valueOf(tL_emojiStatus.document_id);
            }
            return null;
        }
        if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
            return null;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
        if ((tL_emojiStatusCollectible.flags & 1) == 0 || tL_emojiStatusCollectible.until > ((int) (System.currentTimeMillis() / 1000))) {
            return Long.valueOf(tL_emojiStatusCollectible.document_id);
        }
        return null;
    }

    public static Long i(TLRPC.User user) {
        if (user == null) {
            return null;
        }
        return h(user.emoji_status);
    }

    public static String j(TLRPC.User user) {
        return k(user, true);
    }

    public static String k(TLRPC.User user, boolean z) {
        if (user == null || y(user)) {
            return "DELETED";
        }
        String str = user.first_name;
        if (TextUtils.isEmpty(str)) {
            str = user.last_name;
        } else if (!z && str.length() <= 2) {
            return qu2.m(0, user.first_name, user.last_name);
        }
        return !TextUtils.isEmpty(str) ? str : k96.M0(2131749136, null);
    }

    public static String l(TLRPC.User user) {
        if (user == null || y(user)) {
            return k96.M0(2131749136, null);
        }
        String str = user.first_name;
        if (TextUtils.isEmpty(str)) {
            str = user.last_name;
        }
        if (str == null) {
            return k96.M0(2131749136, null);
        }
        int indexOf = str.indexOf(" ", 2);
        return indexOf >= 0 ? str.substring(0, indexOf) : str;
    }

    public static int m(TLRPC.User user) {
        if (user == null) {
            return 0;
        }
        TLRPC.PeerColor peerColor = user.profile_color;
        if (!(peerColor instanceof TLRPC.TL_peerColor) || (peerColor.flags & 1) == 0) {
            return -1;
        }
        return peerColor.color;
    }

    public static long n(TLRPC.User user) {
        if (user == null) {
            return 0L;
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            return ((TLRPC.TL_emojiStatusCollectible) emojiStatus).pattern_document_id;
        }
        TLRPC.PeerColor peerColor = user.profile_color;
        if (peerColor == null || (peerColor.flags & 2) == 0) {
            return 0L;
        }
        return peerColor.background_emoji_id;
    }

    public static String o(TLRPC.User user) {
        if (user == null) {
            return null;
        }
        if (!TextUtils.isEmpty(user.username)) {
            return user.username;
        }
        if (user.usernames == null) {
            return null;
        }
        for (int i = 0; i < user.usernames.size(); i++) {
            TLRPC.TL_username tL_username = user.usernames.get(i);
            if (tL_username != null && ((tL_username.active || tL_username.editable) && !TextUtils.isEmpty(tL_username.username))) {
                return tL_username.username;
            }
        }
        return null;
    }

    public static TL_account.RequirementToContact p(TLRPC.UserFull userFull) {
        if (userFull.send_paid_messages_stars != 0) {
            TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = new TL_account.requirementToContactPaidMessages();
            requirementtocontactpaidmessages.stars_amount = userFull.send_paid_messages_stars;
            return requirementtocontactpaidmessages;
        }
        if (userFull.contact_require_premium) {
            return new TL_account.requirementToContactPremium();
        }
        return null;
    }

    public static String q(TLRPC.User user) {
        if (user == null || y(user)) {
            return k96.M0(2131749136, null);
        }
        String C2 = gl.C2(gl.A2(qu2.m(0, user.first_name, user.last_name)));
        if (C2.length() != 0 || TextUtils.isEmpty(user.phone)) {
            return C2;
        }
        return yjb.k(new StringBuilder("+"), user.phone, p38.f());
    }

    public static boolean r(TLRPC.UserFull userFull) {
        TLRPC.Photo photo;
        return (userFull == null || (photo = userFull.fallback_photo) == null || (photo instanceof TLRPC.TL_photoEmpty)) ? false : true;
    }

    public static boolean s(String str, TLRPC.User user) {
        if (user != null && str != null) {
            if (str.equalsIgnoreCase(user.username)) {
                return true;
            }
            if (user.usernames != null) {
                for (int i = 0; i < user.usernames.size(); i++) {
                    TLRPC.TL_username tL_username = user.usernames.get(i);
                    if (tL_username != null && tL_username.active && str.equalsIgnoreCase(tL_username.username)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean t(TLRPC.User user) {
        return user != null && user.id == 2666000;
    }

    public static boolean u(TLRPC.User user) {
        return user != null && user.bot;
    }

    public static boolean v(TLRPC.User user) {
        return user != null && user.bot_forum_view;
    }

    public static boolean w(TLRPC.User user) {
        return user != null && user.bot_forum_view && user.bot_forum_can_manage_topics;
    }

    public static boolean x(TLRPC.User user) {
        return (user instanceof TLRPC.TL_userContact_old2) || user.contact || user.mutual_contact;
    }

    public static boolean y(TLRPC.User user) {
        return user == null || (user instanceof TLRPC.TL_userDeleted_old2) || (user instanceof TLRPC.TL_userEmpty) || user.deleted;
    }

    public static boolean z(long j) {
        return j == 708513 || j == 1271266957;
    }
}
