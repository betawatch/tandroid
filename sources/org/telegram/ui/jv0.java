package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class jv0 implements kp {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.ChatParticipant b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ ProfileActivity e;

    public jv0(ProfileActivity profileActivity, int i7, TLRPC.ChatParticipant chatParticipant, boolean z10, boolean[] zArr) {
        this.e = profileActivity;
        this.a = i7;
        this.b = chatParticipant;
        this.c = z10;
        this.d = zArr;
    }

    @Override // org.telegram.ui.kp
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.e;
        profileActivity.M.m(-profileActivity.f1, user, profileActivity.F2.megagroup ? 10 : 9);
    }

    @Override // org.telegram.ui.kp
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.ChatFull chatFull;
        boolean z10;
        int i10 = 0;
        TLRPC.ChatParticipant chatParticipant = this.b;
        ProfileActivity profileActivity = this.e;
        int i11 = this.a;
        if (i11 == 0) {
            if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                if (i7 == 1) {
                    TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                    tL_chatChannelParticipant.channelParticipant = tL_channelParticipantAdmin;
                    tL_channelParticipantAdmin.flags |= 4;
                } else {
                    tL_chatChannelParticipant.channelParticipant = new TLRPC.TL_channelParticipant();
                }
                tL_chatChannelParticipant.channelParticipant.inviter_id = profileActivity.getUserConfig().e();
                tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                channelParticipant.peer.user_id = chatParticipant.user_id;
                channelParticipant.date = chatParticipant.date;
                channelParticipant.banned_rights = tL_chatBannedRights;
                channelParticipant.admin_rights = tL_chatAdminRights;
                channelParticipant.rank = str;
            } else if (chatParticipant != null) {
                TLRPC.ChatParticipant tL_chatParticipantAdmin = i7 == 1 ? new TLRPC.TL_chatParticipantAdmin() : new TLRPC.TL_chatParticipant();
                tL_chatParticipantAdmin.user_id = chatParticipant.user_id;
                tL_chatParticipantAdmin.date = chatParticipant.date;
                tL_chatParticipantAdmin.inviter_id = chatParticipant.inviter_id;
                int indexOf = profileActivity.v2.participants.participants.indexOf(chatParticipant);
                if (indexOf >= 0) {
                    profileActivity.v2.participants.participants.set(indexOf, tL_chatParticipantAdmin);
                }
            }
            if (i7 != 1 || this.c) {
                return;
            }
            this.d[0] = true;
            return;
        }
        if (i11 == 1 && i7 == 0 && profileActivity.F2.megagroup && (chatFull = profileActivity.v2) != null && chatFull.participants != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= profileActivity.v2.participants.participants.size()) {
                    z10 = false;
                    break;
                } else {
                    if (org.telegram.messenger.gj.B1(((TLRPC.TL_chatChannelParticipant) profileActivity.v2.participants.participants.get(i12)).channelParticipant.peer) == chatParticipant.user_id) {
                        TLRPC.ChatFull chatFull2 = profileActivity.v2;
                        chatFull2.participants_count--;
                        chatFull2.participants.participants.remove(i12);
                        z10 = true;
                        break;
                    }
                    i12++;
                }
            }
            TLRPC.ChatFull chatFull3 = profileActivity.v2;
            if (chatFull3 != null && chatFull3.participants != null) {
                while (true) {
                    if (i10 >= profileActivity.v2.participants.participants.size()) {
                        break;
                    }
                    if (profileActivity.v2.participants.participants.get(i10).user_id == chatParticipant.user_id) {
                        profileActivity.v2.participants.participants.remove(i10);
                        z10 = true;
                        break;
                    }
                    i10++;
                }
            }
            if (z10) {
                profileActivity.K5(true);
                profileActivity.N5();
                profileActivity.d.f();
            }
        }
    }
}
