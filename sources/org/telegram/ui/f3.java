package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        int i10 = 0;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                k3 k3Var = (k3) obj2;
                Float f10 = (Float) obj;
                g4 g4Var = k3Var.M;
                if (k3Var == g4Var.v0[0]) {
                    if (g4Var.i0.e0.getCurrentProgress() > f10.floatValue()) {
                        g4Var.i0.e0.a(false, 0.0f);
                    }
                    g4Var.i0.e0.a(true, f10.floatValue());
                    break;
                }
                break;
            case 1:
                ((org.telegram.ui.Components.vh0) obj2).h((List) obj);
                break;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                qq qqVar = ((hq) obj2).b;
                kq B0 = qqVar.B0();
                ArrayList arrayList = qqVar.F;
                a0.h hVar = qqVar.M;
                ArrayList arrayList2 = (hVar == null || hVar.m() == 0) ? arrayList : qqVar.H;
                if (hVar == null || hVar.m() == 0) {
                    hVar = qqVar.K;
                }
                if (hVar.f(user.id) == null) {
                    if (org.telegram.messenger.t3.T(qqVar.n)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = qqVar.getUserConfig().e();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.id;
                        tL_channelParticipant.date = qqVar.getConnectionsManager().getCurrentTime();
                        arrayList2.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.id;
                        tL_chatParticipant.inviter_id = qqVar.getUserConfig().e();
                        arrayList2.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.id);
                    }
                }
                if (arrayList2 == arrayList) {
                    Collections.sort(arrayList, new me(3));
                }
                qqVar.F0(B0);
                break;
            case 3:
                r3 r3Var = (r3) obj2;
                int i11 = ((f5.f) obj).a;
                org.telegram.messenger.g0.h3(new jd0(i10, r3Var, i11 == 0 ? null : org.telegram.messenger.r1.j(i11)));
                break;
            case 4:
                tf0 tf0Var = (tf0) obj2;
                if (((f5.f) obj).a == 0) {
                    org.telegram.messenger.g0.h3(tf0Var);
                    break;
                }
                break;
            case 5:
                RectF rectF = ProfileActivity.X6;
                ((ArrayList) obj2).add((TLRPC.User) obj);
                break;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i12 = 0; i12 < profileActivity.v2.participants.participants.size(); i12++) {
                    if (profileActivity.v2.participants.participants.get(i12).user_id == user2.id) {
                        profileActivity.v2.participants.participants.remove(i12);
                        profileActivity.G5(true, false);
                        break;
                    }
                }
                break;
            default:
                View view = ((ProxyListActivity) obj2).b.T((View) obj).a;
                if (view instanceof mx0) {
                    mx0 mx0Var = (mx0) view;
                    mx0Var.setChecked(mx0Var.d == org.telegram.messenger.gz.B1);
                    mx0Var.b();
                    break;
                }
                break;
        }
    }
}
