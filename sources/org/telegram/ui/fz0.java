package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class fz0 implements gq {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.ChatParticipant b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ ProfileActivity e;

    public fz0(ProfileActivity profileActivity, int i10, TLRPC.ChatParticipant chatParticipant, boolean z4, boolean[] zArr) {
        this.e = profileActivity;
        this.a = i10;
        this.b = chatParticipant;
        this.c = z4;
        this.d = zArr;
    }

    @Override // org.telegram.ui.gq
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.e;
        profileActivity.J.m(-profileActivity.c1, user, profileActivity.B2.megagroup ? 10 : 9);
    }

    @Override // org.telegram.ui.gq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.ChatFull chatFull;
        boolean z4;
        int i11 = 0;
        TLRPC.ChatParticipant chatParticipant = this.b;
        ProfileActivity profileActivity = this.e;
        int i12 = this.a;
        if (i12 == 0) {
            if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                if (i10 == 1) {
                    TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                    tL_chatChannelParticipant.channelParticipant = tL_channelParticipantAdmin;
                    tL_channelParticipantAdmin.flags |= 4;
                } else {
                    tL_chatChannelParticipant.channelParticipant = new TLRPC.TL_channelParticipant();
                }
                tL_chatChannelParticipant.channelParticipant.inviter_id = profileActivity.getUserConfig().getClientUserId();
                tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                channelParticipant.peer.user_id = chatParticipant.user_id;
                channelParticipant.date = chatParticipant.date;
                channelParticipant.banned_rights = tL_chatBannedRights;
                channelParticipant.admin_rights = tL_chatAdminRights;
                channelParticipant.rank = str;
            } else if (chatParticipant != null) {
                TLRPC.ChatParticipant tL_chatParticipantAdmin = i10 == 1 ? new TLRPC.TL_chatParticipantAdmin() : new TLRPC.TL_chatParticipant();
                tL_chatParticipantAdmin.user_id = chatParticipant.user_id;
                tL_chatParticipantAdmin.date = chatParticipant.date;
                tL_chatParticipantAdmin.inviter_id = chatParticipant.inviter_id;
                int indexOf = profileActivity.r2.participants.participants.indexOf(chatParticipant);
                if (indexOf >= 0) {
                    profileActivity.r2.participants.participants.set(indexOf, tL_chatParticipantAdmin);
                }
            }
            if (i10 != 1 || this.c) {
                return;
            }
            this.d[0] = true;
            return;
        }
        if (i12 == 1 && i10 == 0 && profileActivity.B2.megagroup && (chatFull = profileActivity.r2) != null && chatFull.participants != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= profileActivity.r2.participants.participants.size()) {
                    z4 = false;
                    break;
                } else {
                    if (MessageObject.getPeerId(((TLRPC.TL_chatChannelParticipant) profileActivity.r2.participants.participants.get(i13)).channelParticipant.peer) == chatParticipant.user_id) {
                        TLRPC.ChatFull chatFull2 = profileActivity.r2;
                        chatFull2.participants_count--;
                        chatFull2.participants.participants.remove(i13);
                        z4 = true;
                        break;
                    }
                    i13++;
                }
            }
            TLRPC.ChatFull chatFull3 = profileActivity.r2;
            if (chatFull3 != null && chatFull3.participants != null) {
                while (true) {
                    if (i11 >= profileActivity.r2.participants.participants.size()) {
                        break;
                    }
                    if (profileActivity.r2.participants.participants.get(i11).user_id == chatParticipant.user_id) {
                        profileActivity.r2.participants.participants.remove(i11);
                        z4 = true;
                        break;
                    }
                    i11++;
                }
            }
            if (z4) {
                profileActivity.h5(true);
                profileActivity.j5();
                profileActivity.d.l();
            }
        }
    }
}
