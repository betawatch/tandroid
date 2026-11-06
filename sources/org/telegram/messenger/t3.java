package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class t3 {
    public static boolean A(int i7, TLRPC.Chat chat, int i10) {
        return y(i10, E(i7, chat));
    }

    public static boolean B(TLRPC.Chat chat) {
        if (!T(chat) || chat.creator) {
            return true;
        }
        TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
        if (tL_chatAdminRights != null && tL_chatAdminRights.post_messages) {
            return true;
        }
        if (chat.broadcast || chat.gigagroup) {
            return chat.gigagroup && N(chat);
        }
        return true;
    }

    public static boolean C(TLRPC.TL_chatBannedRights tL_chatBannedRights, int i7) {
        if (tL_chatBannedRights == null) {
            return false;
        }
        if (i7 == 0) {
            return tL_chatBannedRights.pin_messages;
        }
        if (i7 == 1) {
            return tL_chatBannedRights.change_info;
        }
        if (i7 == 3) {
            return tL_chatBannedRights.invite_users;
        }
        if (i7 == 26) {
            return tL_chatBannedRights.send_reactions;
        }
        if (i7 == 27) {
            return tL_chatBannedRights.manage_linked_peers;
        }
        switch (i7) {
            case 6:
                return tL_chatBannedRights.send_messages;
            case 7:
                return tL_chatBannedRights.send_media;
            case 8:
                return tL_chatBannedRights.send_stickers;
            case 9:
                return tL_chatBannedRights.embed_links;
            case 10:
                return tL_chatBannedRights.send_polls;
            case 11:
                return tL_chatBannedRights.view_messages;
            default:
                switch (i7) {
                    case 15:
                        return tL_chatBannedRights.manage_topics;
                    case 16:
                        return tL_chatBannedRights.send_photos;
                    case 17:
                        return tL_chatBannedRights.send_videos;
                    case 18:
                        return tL_chatBannedRights.send_audios;
                    case 19:
                        return tL_chatBannedRights.send_docs;
                    case 20:
                        return tL_chatBannedRights.send_voices;
                    case 21:
                        return tL_chatBannedRights.send_roundvideos;
                    case 22:
                        return tL_chatBannedRights.send_plain;
                    default:
                        return false;
                }
        }
    }

    public static String D(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m("" + (tL_chatBannedRights.view_messages ? 1 : 0));
        m10.append(tL_chatBannedRights.send_messages ? 1 : 0);
        StringBuilder m11 = com.google.android.recaptcha.internal.a.m(m10.toString());
        m11.append(tL_chatBannedRights.send_media ? 1 : 0);
        StringBuilder m12 = com.google.android.recaptcha.internal.a.m(m11.toString());
        m12.append(tL_chatBannedRights.send_stickers ? 1 : 0);
        StringBuilder m13 = com.google.android.recaptcha.internal.a.m(m12.toString());
        m13.append(tL_chatBannedRights.send_gifs ? 1 : 0);
        StringBuilder m14 = com.google.android.recaptcha.internal.a.m(m13.toString());
        m14.append(tL_chatBannedRights.send_games ? 1 : 0);
        StringBuilder m15 = com.google.android.recaptcha.internal.a.m(m14.toString());
        m15.append(tL_chatBannedRights.send_inline ? 1 : 0);
        StringBuilder m16 = com.google.android.recaptcha.internal.a.m(m15.toString());
        m16.append(tL_chatBannedRights.embed_links ? 1 : 0);
        StringBuilder m17 = com.google.android.recaptcha.internal.a.m(m16.toString());
        m17.append(tL_chatBannedRights.send_polls ? 1 : 0);
        StringBuilder m18 = com.google.android.recaptcha.internal.a.m(m17.toString());
        m18.append(tL_chatBannedRights.invite_users ? 1 : 0);
        StringBuilder m19 = com.google.android.recaptcha.internal.a.m(m18.toString());
        m19.append(tL_chatBannedRights.change_info ? 1 : 0);
        StringBuilder m20 = com.google.android.recaptcha.internal.a.m(m19.toString());
        m20.append(tL_chatBannedRights.pin_messages ? 1 : 0);
        StringBuilder m21 = com.google.android.recaptcha.internal.a.m(m20.toString());
        m21.append(tL_chatBannedRights.manage_topics ? 1 : 0);
        StringBuilder m22 = com.google.android.recaptcha.internal.a.m(m21.toString());
        m22.append(tL_chatBannedRights.send_photos ? 1 : 0);
        StringBuilder m23 = com.google.android.recaptcha.internal.a.m(m22.toString());
        m23.append(tL_chatBannedRights.send_videos ? 1 : 0);
        StringBuilder m24 = com.google.android.recaptcha.internal.a.m(m23.toString());
        m24.append(tL_chatBannedRights.send_roundvideos ? 1 : 0);
        StringBuilder m25 = com.google.android.recaptcha.internal.a.m(m24.toString());
        m25.append(tL_chatBannedRights.send_voices ? 1 : 0);
        StringBuilder m26 = com.google.android.recaptcha.internal.a.m(m25.toString());
        m26.append(tL_chatBannedRights.send_audios ? 1 : 0);
        StringBuilder m27 = com.google.android.recaptcha.internal.a.m(m26.toString());
        m27.append(tL_chatBannedRights.send_docs ? 1 : 0);
        StringBuilder m28 = com.google.android.recaptcha.internal.a.m(m27.toString());
        m28.append(tL_chatBannedRights.send_plain ? 1 : 0);
        StringBuilder m29 = com.google.android.recaptcha.internal.a.m(m28.toString());
        m29.append(tL_chatBannedRights.edit_rank ? 1 : 0);
        StringBuilder m30 = com.google.android.recaptcha.internal.a.m(m29.toString());
        m30.append(tL_chatBannedRights.send_reactions ? 1 : 0);
        StringBuilder m31 = com.google.android.recaptcha.internal.a.m(m30.toString());
        m31.append(tL_chatBannedRights.manage_linked_peers ? 1 : 0);
        StringBuilder m32 = com.google.android.recaptcha.internal.a.m(m31.toString());
        m32.append(tL_chatBannedRights.until_date);
        return m32.toString();
    }

    public static TLRPC.Chat E(int i7, TLRPC.Chat chat) {
        if (chat == null || chat.linked_monoforum_id == 0) {
            return null;
        }
        return chat.monoforum ? qp.s1(i7).M0(Long.valueOf(chat.linked_monoforum_id)) : chat;
    }

    public static int F(TLRPC.Chat chat) {
        if (chat == null) {
            return 0;
        }
        TLRPC.PeerColor peerColor = chat.color;
        return (!(peerColor instanceof TLRPC.TL_peerColor) || (peerColor.flags & 1) == 0) ? (int) (chat.id % 7) : peerColor.color;
    }

    public static long G(TLRPC.Chat chat) {
        if (chat == null) {
            return 0L;
        }
        TLRPC.PeerColor peerColor = chat.color;
        if (!(peerColor instanceof TLRPC.TL_peerColor) || (peerColor.flags & 2) == 0) {
            return 0L;
        }
        return peerColor.background_emoji_id;
    }

    public static int H(TLRPC.GroupCallParticipant groupCallParticipant) {
        if ((groupCallParticipant.flags & 128) != 0) {
            return groupCallParticipant.volume;
        }
        return 10000;
    }

    public static int I(TLRPC.Chat chat) {
        if (chat == null) {
            return 0;
        }
        TLRPC.PeerColor peerColor = chat.profile_color;
        if (!(peerColor instanceof TLRPC.TL_peerColor) || (peerColor.flags & 1) == 0) {
            return -1;
        }
        return peerColor.color;
    }

    public static long J(TLRPC.Chat chat) {
        if (chat != null) {
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                return ((TLRPC.TL_emojiStatusCollectible) emojiStatus).pattern_document_id;
            }
        }
        if (chat == null) {
            return 0L;
        }
        TLRPC.PeerColor peerColor = chat.profile_color;
        if (!(peerColor instanceof TLRPC.TL_peerColor) || (peerColor.flags & 2) == 0) {
            return 0L;
        }
        return peerColor.background_emoji_id;
    }

    public static String K(TLRPC.Chat chat, boolean z9) {
        if (chat == null) {
            return null;
        }
        if (!TextUtils.isEmpty(chat.username) && !z9) {
            return chat.username;
        }
        if (chat.usernames != null) {
            for (int i7 = 0; i7 < chat.usernames.size(); i7++) {
                TLRPC.TL_username tL_username = chat.usernames.get(i7);
                if (tL_username != null && (((tL_username.active && !z9) || tL_username.editable) && !TextUtils.isEmpty(tL_username.username))) {
                    return tL_username.username;
                }
            }
        }
        if (TextUtils.isEmpty(chat.username) || !z9) {
            return null;
        }
        ArrayList<TLRPC.TL_username> arrayList = chat.usernames;
        if (arrayList == null || arrayList.size() <= 0) {
            return chat.username;
        }
        return null;
    }

    public static String L(int i7, TLRPC.Chat chat) {
        return i7 == 23 ? (chat == null || P(i7, chat)) ? hd.M0(2131749544, null) : g0.D1(chat.banned_rights) ? hd.a0("AttachGifRestrictedForever", null, 2131753969, new Object[0]) : hd.a0("AttachGifRestricted", null, 2131753970, hd.v(chat.banned_rights.until_date)) : i7 == 8 ? (chat == null || P(i7, chat)) ? hd.M0(2131749538, null) : g0.D1(chat.banned_rights) ? hd.a0("AttachStickersRestrictedForever", null, 2131753934, new Object[0]) : hd.a0("AttachStickersRestricted", null, 2131753935, hd.v(chat.banned_rights.until_date)) : i7 == 16 ? (chat == null || P(i7, chat)) ? hd.M0(2131749541, null) : g0.D1(chat.banned_rights) ? hd.a0("AttachPhotoRestrictedForever", null, 2131753945, new Object[0]) : hd.a0("AttachPhotoRestricted", null, 2131753946, hd.v(chat.banned_rights.until_date)) : i7 == 17 ? (chat == null || P(i7, chat)) ? hd.M0(2131749537, null) : g0.D1(chat.banned_rights) ? hd.a0("AttachVideoRestrictedForever", null, 2131753930, new Object[0]) : hd.a0("AttachVideoRestricted", null, 2131753931, hd.v(chat.banned_rights.until_date)) : i7 == 19 ? (chat == null || P(i7, chat)) ? hd.M0(2131749546, null) : g0.D1(chat.banned_rights) ? hd.a0("AttachDocumentsRestrictedForever", null, 2131753973, new Object[0]) : hd.a0("AttachDocumentsRestricted", null, 2131753974, hd.v(chat.banned_rights.until_date)) : i7 == 7 ? (chat == null || P(i7, chat)) ? hd.M0(2131749542, null) : g0.D1(chat.banned_rights) ? hd.a0("AttachMediaRestrictedForever", null, 2131753955, new Object[0]) : hd.a0("AttachMediaRestricted", null, 2131753956, hd.v(chat.banned_rights.until_date)) : i7 == 18 ? (chat == null || P(i7, chat)) ? hd.M0(2131749547, null) : g0.D1(chat.banned_rights) ? hd.a0("AttachAudioRestrictedForever", null, 2131753980, new Object[0]) : hd.a0("AttachAudioRestricted", null, 2131753981, hd.v(chat.banned_rights.until_date)) : i7 == 22 ? (chat == null || P(i7, chat)) ? hd.M0(2131749540, null) : g0.D1(chat.banned_rights) ? hd.a0("AttachPlainRestrictedForever", null, 2131753943, new Object[0]) : hd.a0("AttachPlainRestricted", null, 2131753944, hd.v(chat.banned_rights.until_date)) : i7 == 21 ? (chat == null || P(i7, chat)) ? hd.M0(2131749539, null) : g0.D1(chat.banned_rights) ? hd.a0("AttachRoundRestrictedForever", null, 2131753938, new Object[0]) : hd.a0("AttachRoundRestricted", null, 2131753939, hd.v(chat.banned_rights.until_date)) : i7 == 20 ? (chat == null || P(i7, chat)) ? hd.M0(2131749536, null) : g0.D1(chat.banned_rights) ? hd.a0("AttachVoiceRestrictedForever", null, 2131753927, new Object[0]) : hd.a0("AttachVoiceRestricted", null, 2131753928, hd.v(chat.banned_rights.until_date)) : "";
    }

    public static long M(TLRPC.Chat chat, TLRPC.ChatFull chatFull, boolean z9) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.Peer peer;
        if (chat != null && chatFull != null && (peer = chatFull.default_send_as) != null) {
            long j3 = peer.user_id;
            if (j3 != 0) {
                return j3;
            }
            long j10 = peer.channel_id;
            return z9 ? -j10 : j10;
        }
        if (chat != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.anonymous) {
            long j11 = chat.id;
            return z9 ? -j11 : j11;
        }
        if (chat == null || !V(chat) || chat.signatures) {
            return p10.i(p10.s0).e();
        }
        long j12 = chat.id;
        return z9 ? -j12 : j12;
    }

    public static boolean N(TLRPC.Chat chat) {
        if (chat == null) {
            return false;
        }
        if (chat.creator) {
            return true;
        }
        TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
        return (tL_chatAdminRights == null || tL_chatAdminRights.flags == 0) ? false : true;
    }

    public static boolean O(String str, TLRPC.Chat chat) {
        if (chat == null) {
            return false;
        }
        if (!TextUtils.isEmpty(chat.username)) {
            return chat.username.equalsIgnoreCase(str);
        }
        if (chat.usernames != null) {
            for (int i7 = 0; i7 < chat.usernames.size(); i7++) {
                TLRPC.TL_username tL_username = chat.usernames.get(i7);
                if (tL_username != null && tL_username.active && !TextUtils.isEmpty(tL_username.username) && tL_username.username.equalsIgnoreCase(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean P(int i7, TLRPC.Chat chat) {
        if (chat == null) {
            return false;
        }
        if (C(chat.banned_rights, i7) && C(chat.default_banned_rights, i7)) {
            return true;
        }
        return C(chat.default_banned_rights, i7);
    }

    public static boolean Q(int i7) {
        return i7 == 0 || i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5 || i7 == 12 || i7 == 13 || i7 == 15;
    }

    public static boolean R(TLRPC.Chat chat) {
        return (V(chat) || n0(chat)) && !p0(chat);
    }

    public static boolean S(int i7, long j3) {
        return T(qp.s1(i7).M0(Long.valueOf(j3)));
    }

    public static boolean T(TLRPC.Chat chat) {
        return (chat instanceof TLRPC.TL_channel) || (chat instanceof TLRPC.TL_channelForbidden) || Y(chat);
    }

    public static boolean U(int i7, long j3) {
        return V(qp.s1(i7).M0(Long.valueOf(j3)));
    }

    public static boolean V(TLRPC.Chat chat) {
        return T(chat) && !n0(chat);
    }

    public static boolean W(TLRPC.Chat chat) {
        if (T(chat)) {
            return !chat.megagroup || chat.gigagroup;
        }
        return false;
    }

    public static boolean X(int i7, TLRPC.Chat chat) {
        TLRPC.Chat M0;
        return (chat == null || chat.linked_community_id == 0 || (M0 = qp.s1(i7).M0(Long.valueOf(chat.linked_community_id))) == null || !M0.collapsed_in_dialogs) ? false : true;
    }

    public static boolean Y(TLRPC.Chat chat) {
        return (chat instanceof TLRPC.TL_community) || (chat instanceof TLRPC.TL_communityForbidden);
    }

    public static boolean Z(int i7, long j3) {
        qp s12 = qp.s1(i7);
        TLRPC.Chat M0 = s12.M0(Long.valueOf(j3));
        TLRPC.ChatFull N0 = s12.N0(j3);
        return (!n0(M0) || N0 == null || N0.linked_chat_id == 0) ? false : true;
    }

    public static boolean a(TLRPC.Chat chat) {
        if (iz.n) {
            return true;
        }
        return chat != null && chat.forum_tabs;
    }

    public static boolean a0(TLRPC.Chat chat) {
        return (chat instanceof TLRPC.TL_chatForbidden) || (chat instanceof TLRPC.TL_channelForbidden) || (chat instanceof TLRPC.TL_communityForbidden);
    }

    public static boolean b(TLRPC.Chat chat) {
        if (!T(chat)) {
            return chat.migrated_to == null;
        }
        if (!chat.megagroup) {
            return false;
        }
        TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
        return (tL_chatAdminRights != null && (tL_chatAdminRights.post_messages || tL_chatAdminRights.add_admins)) || chat.creator;
    }

    public static boolean b0(int i7, long j3) {
        TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
        if (M0 != null) {
            return M0.forum;
        }
        return false;
    }

    public static boolean c(TLRPC.Chat chat) {
        return w(27, chat);
    }

    public static boolean c0(TLRPC.Chat chat) {
        return chat != null && chat.forum;
    }

    public static boolean d(TLRPC.Chat chat) {
        return w(1, chat);
    }

    public static boolean d0(int i7, long j3) {
        return j3 > 0 ? f0(i7, qp.s1(i7).a2(Long.valueOf(j3))) : e0(i7, qp.s1(i7).M0(Long.valueOf(-j3)));
    }

    public static boolean e(int i7, TLRPC.Chat chat, TLRPC.TL_forumTopic tL_forumTopic) {
        TLRPC.Message message;
        TLRPC.Message message2;
        if (tL_forumTopic == null || tL_forumTopic.id != 1) {
            if (!w(13, chat)) {
                if (q0(i7, tL_forumTopic) && (message = tL_forumTopic.topMessage) != null && (message2 = tL_forumTopic.topicStartMessage) != null) {
                    int i10 = message.id - message2.id;
                    ArrayList<ij> arrayList = tL_forumTopic.groupedMessages;
                    if (i10 > Math.max(1, arrayList == null ? 0 : arrayList.size()) || !ij.w5(tL_forumTopic.from_id, tL_forumTopic.topMessage.from_id)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean e0(int i7, TLRPC.Chat chat) {
        return chat != null && g0(chat.linked_community_id, i7, -chat.id);
    }

    public static boolean f(TLRPC.Chat chat) {
        return w(14, chat);
    }

    public static boolean f0(int i7, TLRPC.User user) {
        return user != null && g0(user.linked_community_id, i7, user.id);
    }

    public static boolean g(int i7, TLRPC.Chat chat) {
        return A(i7, chat, 24);
    }

    public static boolean g0(long j3, int i7, long j10) {
        TLRPC.ChatFull N0;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        if (j3 != 0 && j10 != 0 && (N0 = qp.s1(i7).N0(j3)) != null && (arrayList = N0.linked_peers) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i10);
                i10++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (m5.o(communityPeer2.peer) == j10 && c8.zc.a(communityPeer2.flags, 1) && !communityPeer2.visible) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean h(TLRPC.Chat chat) {
        boolean z9;
        if (chat == null) {
            return false;
        }
        if (chat.creator) {
            return true;
        }
        TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.banned_rights;
        if (tL_chatBannedRights == null) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
            if (tL_chatBannedRights2 == null) {
                return true;
            }
            z9 = tL_chatBannedRights2.edit_rank;
        } else {
            z9 = tL_chatBannedRights.edit_rank;
        }
        return !z9;
    }

    public static boolean h0(TLRPC.Chat chat) {
        if (chat != null) {
            return i0(qp.s1(p10.s0).N0(chat.id));
        }
        return false;
    }

    public static boolean i(int i7, TLRPC.Chat chat, TLRPC.TL_forumTopic tL_forumTopic) {
        return y(15, chat) || q0(i7, tL_forumTopic);
    }

    public static boolean i0(TLRPC.ChatFull chatFull) {
        int i7;
        return chatFull != null && (i7 = chatFull.boosts_unrestrict) > 0 && chatFull.boosts_applied - i7 >= 0;
    }

    public static boolean j(TLRPC.Chat chat) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (w(0, chat)) {
            return true;
        }
        return T(chat) && !chat.megagroup && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.edit_messages;
    }

    public static boolean j0(TLRPC.Chat chat) {
        return (chat == null || (chat instanceof TLRPC.TL_chatEmpty) || a0(chat) || chat.left || chat.kicked || chat.deactivated) ? false : true;
    }

    public static boolean k(TLRPC.Chat chat) {
        if (!T(chat)) {
            return false;
        }
        if (!chat.megagroup && chat.signatures && N(chat) && B(chat)) {
            return true;
        }
        if (chat.megagroup) {
            return t0(chat) || chat.has_geo || chat.has_link;
        }
        return false;
    }

    public static boolean k0(TLRPC.Chat chat) {
        if (chat == null || (chat instanceof TLRPC.TL_chatEmpty) || a0(chat) || chat.kicked || chat.deactivated) {
            return true;
        }
        TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.banned_rights;
        return tL_chatBannedRights != null && tL_chatBannedRights.view_messages;
    }

    public static boolean l(TLRPC.Chat chat) {
        if (h0(chat)) {
            return true;
        }
        return w(19, chat);
    }

    public static boolean l0(TLRPC.Chat chat) {
        return chat == null || (chat instanceof TLRPC.TL_chatEmpty) || a0(chat) || chat.left || chat.deactivated;
    }

    public static boolean m(TLRPC.Chat chat) {
        if (h0(chat)) {
            return true;
        }
        return w(9, chat);
    }

    public static boolean m0(int i7, long j3) {
        TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(j3));
        return T(M0) && M0.megagroup;
    }

    public static boolean n(TLRPC.Chat chat) {
        if (r0(chat) && chat != null && chat.join_to_send) {
            return false;
        }
        if (h0(chat)) {
            return true;
        }
        return w(6, chat);
    }

    public static boolean n0(TLRPC.Chat chat) {
        return T(chat) && chat.megagroup;
    }

    public static boolean o(TLRPC.Chat chat) {
        if (h0(chat)) {
            return true;
        }
        return w(18, chat);
    }

    public static boolean o0(int i7, long j3) {
        TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
        if (M0 != null) {
            return M0.monoforum;
        }
        return false;
    }

    public static boolean p(TLRPC.Chat chat) {
        if (h0(chat)) {
            return true;
        }
        return w(16, chat);
    }

    public static boolean p0(TLRPC.Chat chat) {
        return chat != null && chat.monoforum;
    }

    public static boolean q(TLRPC.Chat chat) {
        if (h0(chat)) {
            return true;
        }
        return w(22, chat);
    }

    public static boolean q0(int i7, TLRPC.TL_forumTopic tL_forumTopic) {
        if (tL_forumTopic == null) {
            return false;
        }
        if (tL_forumTopic.my) {
            return true;
        }
        TLRPC.Peer peer = tL_forumTopic.from_id;
        return (peer instanceof TLRPC.TL_peerUser) && peer.user_id == p10.i(i7).n;
    }

    public static boolean r(TLRPC.Chat chat) {
        if (p0(chat)) {
            return false;
        }
        if (h0(chat)) {
            return true;
        }
        return w(10, chat);
    }

    public static boolean r0(TLRPC.Chat chat) {
        return chat == null || (chat instanceof TLRPC.TL_chatEmpty) || a0(chat) || chat.left || chat.kicked || chat.deactivated;
    }

    public static boolean s(TLRPC.Chat chat) {
        if (h0(chat)) {
            return true;
        }
        return w(21, chat);
    }

    public static boolean s0(TLRPC.Chat chat) {
        TLRPC.ChatFull N0;
        return (chat == null || (N0 = qp.s1(p10.s0).N0(chat.id)) == null || N0.boosts_unrestrict <= 0) ? false : true;
    }

    public static boolean t(TLRPC.Chat chat) {
        if (h0(chat)) {
            return true;
        }
        return w(8, chat);
    }

    public static boolean t0(TLRPC.Chat chat) {
        return !TextUtils.isEmpty(K(chat, false));
    }

    public static boolean u(TLRPC.Chat chat) {
        if (h0(chat)) {
            return true;
        }
        return w(17, chat);
    }

    public static boolean u0(int i7, TLRPC.User user) {
        TLRPC.Chat M0;
        return (user == null || user.linked_community_id == 0 || (M0 = qp.s1(i7).M0(Long.valueOf(user.linked_community_id))) == null || !M0.collapsed_in_dialogs) ? false : true;
    }

    public static boolean v(TLRPC.Chat chat) {
        if (h0(chat)) {
            return true;
        }
        return w(20, chat);
    }

    public static boolean v0(TLRPC.ChatFull chatFull, String str) {
        TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
            return true;
        }
        if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
            for (int i7 = 0; i7 < tL_chatReactionsSome.reactions.size(); i7++) {
                if ((tL_chatReactionsSome.reactions.get(i7) instanceof TLRPC.TL_reactionEmoji) && TextUtils.equals(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i7)).emoticon, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean w(int i7, TLRPC.Chat chat) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        if (chat != null && !y(i7, chat)) {
            if (!C(chat.banned_rights, i7)) {
                if (i7 != 0 && i7 != 1 && i7 != 3 && i7 != 26 && i7 != 27) {
                    switch (i7) {
                        default:
                            switch (i7) {
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                    break;
                                default:
                                    return false;
                            }
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                            if ((chat.admin_rights == null && !Q(i7)) || ((tL_chatBannedRights = chat.default_banned_rights) == null && ((chat instanceof TLRPC.TL_chat_layer92) || (chat instanceof TLRPC.TL_chat_old) || (chat instanceof TLRPC.TL_chat_old2) || (chat instanceof TLRPC.TL_channel_layer92) || (chat instanceof TLRPC.TL_channel_layer77) || (chat instanceof TLRPC.TL_channel_layer72) || (chat instanceof TLRPC.TL_channel_layer67) || (chat instanceof TLRPC.TL_channel_layer48) || (chat instanceof TLRPC.TL_channel_old)))) {
                                return true;
                            }
                            if (tL_chatBannedRights != null || C(tL_chatBannedRights, i7)) {
                            }
                            break;
                    }
                }
                if (chat.admin_rights == null) {
                }
                if (tL_chatBannedRights != null) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(TLRPC.Chat chat, TLRPC.ChannelParticipant channelParticipant, int i7) {
        boolean z9;
        boolean z10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z11;
        if (chat != null) {
            if (channelParticipant != null) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = channelParticipant.admin_rights;
                if (tL_chatAdminRights != null) {
                    if (i7 == 0) {
                        z11 = tL_chatAdminRights.pin_messages;
                    } else if (i7 == 1) {
                        z11 = tL_chatAdminRights.change_info;
                    } else if (i7 == 2) {
                        z11 = tL_chatAdminRights.ban_users;
                    } else if (i7 == 3) {
                        z11 = tL_chatAdminRights.invite_users;
                    } else if (i7 == 4) {
                        z11 = tL_chatAdminRights.add_admins;
                    } else if (i7 == 5) {
                        z11 = tL_chatAdminRights.post_messages;
                    } else if (i7 != 27) {
                        switch (i7) {
                            case 12:
                                z11 = tL_chatAdminRights.edit_messages;
                                break;
                            case 13:
                                z11 = tL_chatAdminRights.delete_messages;
                                break;
                            case 14:
                                z11 = tL_chatAdminRights.manage_call;
                                break;
                            case 15:
                                z11 = tL_chatAdminRights.manage_topics;
                                break;
                            default:
                                z11 = false;
                                break;
                        }
                    } else {
                        z11 = tL_chatAdminRights.manage_linked_peers;
                    }
                    if (z11) {
                        z9 = true;
                        if (!z9) {
                            if (!C(channelParticipant.banned_rights, i7)) {
                                if (i7 != 0 && i7 != 1 && i7 != 3 && i7 != 26 && i7 != 27) {
                                    switch (i7) {
                                        default:
                                            switch (i7) {
                                                case 15:
                                                case 16:
                                                case 17:
                                                case 18:
                                                case 19:
                                                case 20:
                                                case 21:
                                                case 22:
                                                    break;
                                                default:
                                                    z10 = false;
                                                    break;
                                            }
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                            z10 = true;
                                            break;
                                    }
                                    if (z10) {
                                        if ((channelParticipant.admin_rights != null && !Q(i7)) || ((tL_chatBannedRights = chat.default_banned_rights) == null && ((chat instanceof TLRPC.TL_chat_layer92) || (chat instanceof TLRPC.TL_chat_old) || (chat instanceof TLRPC.TL_chat_old2) || (chat instanceof TLRPC.TL_channel_layer92) || (chat instanceof TLRPC.TL_channel_layer77) || (chat instanceof TLRPC.TL_channel_layer72) || (chat instanceof TLRPC.TL_channel_layer67) || (chat instanceof TLRPC.TL_channel_layer48) || (chat instanceof TLRPC.TL_channel_old)))) {
                                            return true;
                                        }
                                        if (tL_chatBannedRights == null || C(tL_chatBannedRights, i7)) {
                                        }
                                    }
                                }
                                z10 = true;
                                if (z10) {
                                }
                            }
                        }
                    }
                }
                z9 = false;
                if (!z9) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean y(int i7, TLRPC.Chat chat) {
        boolean z9;
        if (chat != null) {
            if (!chat.creator) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
                if (tL_chatAdminRights != null) {
                    if (i7 == 0) {
                        z9 = tL_chatAdminRights.pin_messages;
                    } else if (i7 == 1) {
                        z9 = tL_chatAdminRights.change_info;
                    } else if (i7 == 2) {
                        z9 = tL_chatAdminRights.ban_users;
                    } else if (i7 == 3) {
                        z9 = tL_chatAdminRights.invite_users;
                    } else if (i7 == 4) {
                        z9 = tL_chatAdminRights.add_admins;
                    } else if (i7 == 5) {
                        z9 = tL_chatAdminRights.post_messages;
                    } else if (i7 == 24) {
                        z9 = tL_chatAdminRights.manage_direct_messages;
                    } else if (i7 == 25) {
                        z9 = tL_chatAdminRights.manage_ranks;
                    } else if (i7 == 27) {
                        z9 = tL_chatAdminRights.manage_linked_peers;
                    } else if (i7 != 28) {
                        switch (i7) {
                            case 12:
                                z9 = tL_chatAdminRights.edit_messages;
                                break;
                            case 13:
                                z9 = tL_chatAdminRights.delete_messages;
                                break;
                            case 14:
                                z9 = tL_chatAdminRights.manage_call;
                                break;
                            case 15:
                                z9 = tL_chatAdminRights.manage_topics;
                                break;
                            default:
                                z9 = false;
                                break;
                        }
                    } else {
                        z9 = tL_chatAdminRights.manage_welcome_messages;
                    }
                    if (z9) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean z(int i7, int i10, long j3) {
        return y(i10, E(i7, qp.s1(i7).M0(Long.valueOf(-j3))));
    }
}
