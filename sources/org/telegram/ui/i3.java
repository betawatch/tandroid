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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i3 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                n3 n3Var = (n3) this.b;
                Float f7 = (Float) obj;
                k4 k4Var = n3Var.L;
                if (n3Var == k4Var.u0[0]) {
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
                jr jrVar = ((ar) this.b).b;
                dr w02 = jrVar.w0();
                ArrayList arrayList = jrVar.F;
                a0.h hVar = jrVar.M;
                ArrayList arrayList2 = (hVar == null || hVar.m() == 0) ? arrayList : jrVar.H;
                if (hVar == null || hVar.m() == 0) {
                    hVar = jrVar.K;
                }
                if (hVar.f(user.id) == null) {
                    if (ChatObject.isChannel(jrVar.r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = jrVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.id;
                        tL_channelParticipant.date = jrVar.getConnectionsManager().getCurrentTime();
                        arrayList2.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.id;
                        tL_chatParticipant.inviter_id = jrVar.getUserConfig().getClientUserId();
                        arrayList2.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.id);
                    }
                }
                if (arrayList2 == arrayList) {
                    Collections.sort(arrayList, new org.telegram.ui.ActionBar.l4(11));
                }
                jrVar.A0(w02);
                break;
            case 3:
                u3 u3Var = (u3) this.b;
                int i10 = ((c5.i) obj).a;
                AndroidUtilities.runOnUIThread(new f80(26, u3Var, i10 == 0 ? null : BillingController.getResponseCodeString(i10)));
                break;
            case 4:
                fi0 fi0Var = (fi0) this.b;
                if (((c5.i) obj).a == 0) {
                    AndroidUtilities.runOnUIThread(fi0Var);
                    break;
                }
                break;
            case 5:
                ((ArrayList) this.b).add((TLRPC.User) obj);
                break;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.v2.participants.participants.size(); i11++) {
                    if (profileActivity.v2.participants.participants.get(i11).user_id == user2.id) {
                        profileActivity.v2.participants.participants.remove(i11);
                        profileActivity.i5(true, false);
                        break;
                    }
                }
                break;
            default:
                View view = ((ProxyListActivity) this.b).b.T((View) obj).a;
                if (view instanceof o11) {
                    o11 o11Var = (o11) view;
                    o11Var.setChecked(o11Var.d == SharedConfig.currentProxy);
                    o11Var.b();
                    break;
                }
                break;
        }
    }
}
