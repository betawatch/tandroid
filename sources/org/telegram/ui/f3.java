package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f3 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        int i7 = this.a;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                k3 k3Var = (k3) obj2;
                Float f10 = (Float) obj;
                g4 g4Var = k3Var.L;
                if (k3Var == g4Var.u0[0]) {
                    if (g4Var.h0.d0.getCurrentProgress() > f10.floatValue()) {
                        g4Var.h0.d0.a(false, 0.0f);
                    }
                    g4Var.h0.d0.a(true, f10.floatValue());
                    break;
                }
                break;
            case 1:
                ((org.telegram.ui.Components.rh0) obj2).h((List) obj);
                break;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                rq rqVar = ((iq) obj2).b;
                lq B0 = rqVar.B0();
                ArrayList arrayList = rqVar.E;
                a0.h hVar = rqVar.L;
                ArrayList arrayList2 = (hVar == null || hVar.m() == 0) ? arrayList : rqVar.G;
                if (hVar == null || hVar.m() == 0) {
                    hVar = rqVar.J;
                }
                if (hVar.f(user.id) == null) {
                    if (org.telegram.messenger.t3.T(rqVar.n)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = rqVar.getUserConfig().e();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.id;
                        tL_channelParticipant.date = rqVar.getConnectionsManager().getCurrentTime();
                        arrayList2.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.id;
                        tL_chatParticipant.inviter_id = rqVar.getUserConfig().e();
                        arrayList2.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.id);
                    }
                }
                if (arrayList2 == arrayList) {
                    Collections.sort(arrayList, new pe(4));
                }
                rqVar.F0(B0);
                break;
            case 3:
                r3 r3Var = (r3) obj2;
                int i10 = ((f5.f) obj).a;
                org.telegram.messenger.g0.h3(new tc0(5, r3Var, i10 == 0 ? null : org.telegram.messenger.r1.j(i10)));
                break;
            case 4:
                wf0 wf0Var = (wf0) obj2;
                if (((f5.f) obj).a == 0) {
                    org.telegram.messenger.g0.h3(wf0Var);
                    break;
                }
                break;
            case 5:
                RectF rectF = ProfileActivity.V6;
                ((ArrayList) obj2).add((TLRPC.User) obj);
                break;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.t2.participants.participants.size(); i11++) {
                    if (profileActivity.t2.participants.participants.get(i11).user_id == user2.id) {
                        profileActivity.t2.participants.participants.remove(i11);
                        profileActivity.G5(true, false);
                        break;
                    }
                }
                break;
            default:
                View view = ((ProxyListActivity) obj2).b.T((View) obj).a;
                if (view instanceof sx0) {
                    sx0 sx0Var = (sx0) view;
                    sx0Var.setChecked(sx0Var.d == org.telegram.messenger.iz.B1);
                    sx0Var.b();
                    break;
                }
                break;
        }
    }
}
