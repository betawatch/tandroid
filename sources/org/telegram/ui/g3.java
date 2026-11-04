package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g3 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g3(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        int i3 = this.a;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                l3 l3Var = (l3) obj2;
                Float f10 = (Float) obj;
                i4 i4Var = l3Var.M;
                if (l3Var == i4Var.v0[0]) {
                    if (i4Var.i0.e0.getCurrentProgress() > f10.floatValue()) {
                        i4Var.i0.e0.a(false, 0.0f);
                    }
                    i4Var.i0.e0.a(true, f10.floatValue());
                    break;
                }
                break;
            case 1:
                ((org.telegram.ui.Components.uh0) obj2).h((List) obj);
                break;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                nq nqVar = ((dq) obj2).b;
                gq B0 = nqVar.B0();
                ArrayList arrayList = nqVar.F;
                a0.h hVar = nqVar.M;
                ArrayList arrayList2 = (hVar == null || hVar.m() == 0) ? arrayList : nqVar.H;
                if (hVar == null || hVar.m() == 0) {
                    hVar = nqVar.K;
                }
                if (hVar.f(user.id) == null) {
                    if (org.telegram.messenger.t3.T(nqVar.n)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = nqVar.getUserConfig().e();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.id;
                        tL_channelParticipant.date = nqVar.getConnectionsManager().getCurrentTime();
                        arrayList2.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.id;
                        tL_chatParticipant.inviter_id = nqVar.getUserConfig().e();
                        arrayList2.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.id);
                    }
                }
                if (arrayList2 == arrayList) {
                    Collections.sort(arrayList, new org.telegram.messenger.tq(24));
                }
                nqVar.F0(B0);
                break;
            case 3:
                s3 s3Var = (s3) obj2;
                int i10 = ((e5.f) obj).a;
                org.telegram.messenger.g0.h3(new tb0(9, s3Var, i10 == 0 ? null : org.telegram.messenger.r1.j(i10)));
                break;
            case 4:
                nf0 nf0Var = (nf0) obj2;
                if (((e5.f) obj).a == 0) {
                    org.telegram.messenger.g0.h3(nf0Var);
                    break;
                }
                break;
            case 5:
                RectF rectF = ProfileActivity.T6;
                ((ArrayList) obj2).add((TLRPC.User) obj);
                break;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.u2.participants.participants.size(); i11++) {
                    if (profileActivity.u2.participants.participants.get(i11).user_id == user2.id) {
                        profileActivity.u2.participants.participants.remove(i11);
                        profileActivity.D5(true, false);
                        break;
                    }
                }
                break;
            default:
                View view = ((ProxyListActivity) obj2).b.T((View) obj).a;
                if (view instanceof fx0) {
                    fx0 fx0Var = (fx0) view;
                    fx0Var.setChecked(fx0Var.d == org.telegram.messenger.az.B1);
                    fx0Var.b();
                    break;
                }
                break;
        }
    }
}
