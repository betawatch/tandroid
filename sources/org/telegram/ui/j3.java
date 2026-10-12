package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class j3 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                o3 o3Var = (o3) this.b;
                Float f7 = (Float) obj;
                k4 k4Var = o3Var.K;
                if (o3Var == k4Var.u0[0]) {
                    if (k4Var.h0.d0.getCurrentProgress() > f7.floatValue()) {
                        k4Var.h0.d0.a(0.0f, false);
                    }
                    k4Var.h0.d0.a(f7.floatValue(), true);
                    break;
                }
                break;
            case 1:
                ((org.telegram.ui.Components.qk0) this.b).h((List) obj);
                break;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                yr yrVar = ((pr) this.b).b;
                sr w02 = yrVar.w0();
                ArrayList arrayList = yrVar.F;
                a0.h hVar = yrVar.M;
                ArrayList arrayList2 = (hVar == null || hVar.m() == 0) ? arrayList : yrVar.H;
                if (hVar == null || hVar.m() == 0) {
                    hVar = yrVar.K;
                }
                if (hVar.f(user.id) == null) {
                    if (ChatObject.isChannel(yrVar.r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = yrVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.id;
                        tL_channelParticipant.date = yrVar.getConnectionsManager().getCurrentTime();
                        arrayList2.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.id;
                        tL_chatParticipant.inviter_id = yrVar.getUserConfig().getClientUserId();
                        arrayList2.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.id);
                    }
                }
                if (arrayList2 == arrayList) {
                    Collections.sort(arrayList, new org.telegram.ui.ActionBar.l5(8));
                }
                yrVar.A0(w02);
                break;
            case 3:
                v3 v3Var = (v3) this.b;
                int i10 = ((c5.i) obj).a;
                AndroidUtilities.runOnUIThread(new wc0(13, v3Var, i10 == 0 ? null : BillingController.getResponseCodeString(i10)));
                break;
            case 4:
                wi0 wi0Var = (wi0) this.b;
                if (((c5.i) obj).a == 0) {
                    AndroidUtilities.runOnUIThread(wi0Var);
                    break;
                }
                break;
            case 5:
                ((ArrayList) this.b).add((TLRPC.User) obj);
                break;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.u2.participants.participants.size(); i11++) {
                    if (profileActivity.u2.participants.participants.get(i11).user_id == user2.id) {
                        profileActivity.u2.participants.participants.remove(i11);
                        profileActivity.e5(true, false);
                        break;
                    }
                }
                break;
            default:
                View view = ((ProxyListActivity) this.b).b.T((View) obj).a;
                if (view instanceof n21) {
                    n21 n21Var = (n21) view;
                    n21Var.setChecked(n21Var.d == SharedConfig.currentProxy);
                    n21Var.b();
                    break;
                }
                break;
        }
    }
}
