package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                ((org.telegram.ui.Components.vi0) obj2).h((List) obj);
                break;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                pr prVar = ((gr) obj2).b;
                jr A0 = prVar.A0();
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
                prVar.E0(A0);
                break;
            case 3:
                s3 s3Var = (s3) obj2;
                int i11 = ((c5.g) obj).a;
                org.telegram.messenger.i0.g3(new f70(27, s3Var, i11 == 0 ? null : org.telegram.messenger.u1.j(i11)));
                break;
            case 4:
                ch0 ch0Var = (ch0) obj2;
                if (((c5.g) obj).a == 0) {
                    org.telegram.messenger.i0.g3(ch0Var);
                    break;
                }
                break;
            case 5:
                RectF rectF = ProfileActivity.R6;
                ((ArrayList) obj2).add((TLRPC.User) obj);
                break;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i12 = 0; i12 < profileActivity.t2.participants.participants.size(); i12++) {
                    if (profileActivity.t2.participants.participants.get(i12).user_id == user2.id) {
                        profileActivity.t2.participants.participants.remove(i12);
                        profileActivity.C5(true, false);
                        break;
                    }
                }
                break;
            default:
                View view = ((ProxyListActivity) obj2).b.T((View) obj).a;
                if (view instanceof cz0) {
                    cz0 cz0Var = (cz0) view;
                    cz0Var.setChecked(cz0Var.d == org.telegram.messenger.tz.B1);
                    cz0Var.b();
                    break;
                }
                break;
        }
    }
}
