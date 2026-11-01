package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f3 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                l3 l3Var = (l3) obj2;
                Float f7 = (Float) obj;
                h4 h4Var = l3Var.L;
                if (l3Var == h4Var.u0[0]) {
                    if (h4Var.h0.d0.getCurrentProgress() > f7.floatValue()) {
                        h4Var.h0.d0.a(false, 0.0f);
                    }
                    h4Var.h0.d0.a(true, f7.floatValue());
                    break;
                }
                break;
            case 1:
                ((org.telegram.ui.Components.wi0) obj2).h((List) obj);
                break;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                pr prVar = ((gr) obj2).b;
                jr B0 = prVar.B0();
                ArrayList arrayList = prVar.E;
                a0.h hVar = prVar.L;
                ArrayList arrayList2 = (hVar == null || hVar.m() == 0) ? arrayList : prVar.G;
                if (hVar == null || hVar.m() == 0) {
                    hVar = prVar.J;
                }
                if (hVar.f(user.id) == null) {
                    if (org.telegram.messenger.w3.T(prVar.n)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = prVar.getUserConfig().e();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.id;
                        tL_channelParticipant.date = prVar.getConnectionsManager().getCurrentTime();
                        arrayList2.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.id;
                        tL_chatParticipant.inviter_id = prVar.getUserConfig().e();
                        arrayList2.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.id);
                    }
                }
                if (arrayList2 == arrayList) {
                    Collections.sort(arrayList, new f6(6));
                }
                prVar.F0(B0);
                break;
            case 3:
                s3 s3Var = (s3) obj2;
                int i11 = ((c5.g) obj).a;
                org.telegram.messenger.i0.g3(new y60(28, s3Var, i11 == 0 ? null : org.telegram.messenger.u1.j(i11)));
                break;
            case 4:
                ah0 ah0Var = (ah0) obj2;
                if (((c5.g) obj).a == 0) {
                    org.telegram.messenger.i0.g3(ah0Var);
                    break;
                }
                break;
            case 5:
                RectF rectF = ProfileActivity.S6;
                ((ArrayList) obj2).add((TLRPC.User) obj);
                break;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i12 = 0; i12 < profileActivity.t2.participants.participants.size(); i12++) {
                    if (profileActivity.t2.participants.participants.get(i12).user_id == user2.id) {
                        profileActivity.t2.participants.participants.remove(i12);
                        profileActivity.D5(true, false);
                        break;
                    }
                }
                break;
            default:
                View view = ((ProxyListActivity) obj2).b.T((View) obj).a;
                if (view instanceof bz0) {
                    bz0 bz0Var = (bz0) view;
                    bz0Var.setChecked(bz0Var.d == org.telegram.messenger.uz.B1);
                    bz0Var.b();
                    break;
                }
                break;
        }
    }
}
