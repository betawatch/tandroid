package org.telegram.messenger;

import android.text.TextUtils;
import java.util.Locale;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class h20 {
    public static boolean A(long j10) {
        return j10 == 333000 || j10 == 777000 || j10 == 42777;
    }

    public static boolean B(TLRPC.User user) {
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
            long j10 = ((TL_account.requirementToContactPaidMessages) requirementToContact).stars_amount;
            if (userFull.contact_require_premium || userFull.send_paid_messages_stars != j10) {
                userFull.contact_require_premium = false;
                userFull.flags2 |= TLObject.FLAG_14;
                userFull.send_paid_messages_stars = j10;
                return true;
            }
        }
        return false;
    }

    public static boolean b(TLRPC.UserFull userFull) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        return (userFull == null || userFull.id != d20.i(d20.s0).e()) && userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_premium_gifts;
    }

    public static boolean c(TL_account.RequirementToContact requirementToContact, TL_account.RequirementToContact requirementToContact2) {
        if (requirementToContact instanceof TL_account.requirementToContactEmpty) {
            requirementToContact = null;
        }
        if (requirementToContact2 instanceof TL_account.requirementToContactEmpty) {
            requirementToContact2 = null;
        }
        if (requirementToContact == null && requirementToContact2 == null) {
            return true;
        }
        if (requirementToContact != null && requirementToContact2 != null) {
            if ((requirementToContact instanceof TL_account.requirementToContactPremium) && (requirementToContact2 instanceof TL_account.requirementToContactPremium)) {
                return true;
            }
            if ((requirementToContact instanceof TL_account.requirementToContactPaidMessages) && (requirementToContact2 instanceof TL_account.requirementToContactPaidMessages) && ((TL_account.requirementToContactPaidMessages) requirementToContact).stars_amount == ((TL_account.requirementToContactPaidMessages) requirementToContact2).stars_amount) {
                return true;
            }
        }
        return false;
    }

    public static String d(TLRPC.User user) {
        String n10 = n(user);
        if (n10 != null) {
            String lowerCase = n10.toLowerCase(Locale.ROOT);
            if (lowerCase.endsWith("agent")) {
                return cd.L0(2131752944, null);
            }
            if (lowerCase.endsWith("game")) {
                return cd.L0(2131752942, null);
            }
            if (lowerCase.endsWith("app")) {
                return cd.L0(2131752943, null);
            }
            if (lowerCase.endsWith("ai")) {
                return cd.L0(2131752945, null);
            }
            if (lowerCase.endsWith("gay")) {
                return cd.L0(2131752941, null);
            }
        }
        return cd.L0(2131753156, null);
    }

    public static int e(TLRPC.User user) {
        if (user == null) {
            return 0;
        }
        TLRPC.PeerColor peerColor = user.color;
        return (!(peerColor instanceof TLRPC.TL_peerColor) || (peerColor.flags & 1) == 0) ? (int) (user.id % 7) : peerColor.color;
    }

    public static long f(TLRPC.User user) {
        if (user == null) {
            return 0L;
        }
        TLRPC.PeerColor peerColor = user.color;
        if (!(peerColor instanceof TLRPC.TL_peerColor) || (peerColor.flags & 2) == 0) {
            return 0L;
        }
        return peerColor.background_emoji_id;
    }

    public static Long g(TLRPC.EmojiStatus emojiStatus) {
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

    public static Long h(TLRPC.User user) {
        if (user == null) {
            return null;
        }
        return g(user.emoji_status);
    }

    public static String i(TLRPC.User user) {
        return j(user, true);
    }

    public static String j(TLRPC.User user, boolean z10) {
        if (user == null || x(user)) {
            return "DELETED";
        }
        String str = user.first_name;
        if (TextUtils.isEmpty(str)) {
            str = user.last_name;
        } else if (!z10 && str.length() <= 2) {
            return i5.m(0, user.first_name, user.last_name);
        }
        return !TextUtils.isEmpty(str) ? str : cd.L0(2131749337, null);
    }

    public static String k(TLRPC.User user) {
        if (user == null || x(user)) {
            return cd.L0(2131749337, null);
        }
        String str = user.first_name;
        if (TextUtils.isEmpty(str)) {
            str = user.last_name;
        }
        if (str == null) {
            return cd.L0(2131749337, null);
        }
        int indexOf = str.indexOf(" ", 2);
        return indexOf >= 0 ? str.substring(0, indexOf) : str;
    }

    public static int l(TLRPC.User user) {
        if (user == null) {
            return 0;
        }
        TLRPC.PeerColor peerColor = user.profile_color;
        if (!(peerColor instanceof TLRPC.TL_peerColor) || (peerColor.flags & 1) == 0) {
            return -1;
        }
        return peerColor.color;
    }

    public static long m(TLRPC.User user) {
        TLRPC.PeerColor peerColor;
        if (user != null) {
            TLRPC.EmojiStatus emojiStatus = user.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                return ((TLRPC.TL_emojiStatusCollectible) emojiStatus).pattern_document_id;
            }
        }
        if (user == null || (peerColor = user.profile_color) == null || (peerColor.flags & 2) == 0) {
            return 0L;
        }
        return peerColor.background_emoji_id;
    }

    public static String n(TLRPC.User user) {
        if (user == null) {
            return null;
        }
        if (!TextUtils.isEmpty(user.username)) {
            return user.username;
        }
        if (user.usernames == null) {
            return null;
        }
        for (int i10 = 0; i10 < user.usernames.size(); i10++) {
            TLRPC.TL_username tL_username = user.usernames.get(i10);
            if (tL_username != null && ((tL_username.active || tL_username.editable) && !TextUtils.isEmpty(tL_username.username))) {
                return tL_username.username;
            }
        }
        return null;
    }

    public static TL_account.RequirementToContact o(TLRPC.UserFull userFull) {
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

    public static String p(TLRPC.User user) {
        if (user == null || x(user)) {
            return cd.L0(2131749337, null);
        }
        String F2 = i0.F2(i0.D2(i5.m(0, user.first_name, user.last_name)));
        if (F2.length() != 0 || TextUtils.isEmpty(user.phone)) {
            return F2;
        }
        return m5.h(new StringBuilder("+"), user.phone, af.b.c());
    }

    public static boolean q(TLRPC.UserFull userFull) {
        TLRPC.Photo photo;
        return (userFull == null || (photo = userFull.fallback_photo) == null || (photo instanceof TLRPC.TL_photoEmpty)) ? false : true;
    }

    public static boolean r(String str, TLRPC.User user) {
        if (user != null && str != null) {
            if (str.equalsIgnoreCase(user.username)) {
                return true;
            }
            if (user.usernames != null) {
                for (int i10 = 0; i10 < user.usernames.size(); i10++) {
                    TLRPC.TL_username tL_username = user.usernames.get(i10);
                    if (tL_username != null && tL_username.active && str.equalsIgnoreCase(tL_username.username)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean s(TLRPC.User user) {
        return user != null && user.id == 2666000;
    }

    public static boolean t(TLRPC.User user) {
        return user != null && user.bot;
    }

    public static boolean u(TLRPC.User user) {
        return user != null && user.bot_forum_view;
    }

    public static boolean v(TLRPC.User user) {
        return user != null && user.bot_forum_view && user.bot_forum_can_manage_topics;
    }

    public static boolean w(TLRPC.User user) {
        return (user instanceof TLRPC.TL_userContact_old2) || user.contact || user.mutual_contact;
    }

    public static boolean x(TLRPC.User user) {
        return user == null || (user instanceof TLRPC.TL_userDeleted_old2) || (user instanceof TLRPC.TL_userEmpty) || user.deleted;
    }

    public static boolean y(long j10) {
        return j10 == 708513 || j10 == 1271266957;
    }

    public static boolean z(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        long j10 = user.id;
        return j10 == 708513 || j10 == 1271266957;
    }
}
