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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l3 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                q3 q3Var = (q3) this.b;
                Float f9 = (Float) obj;
                m4 m4Var = q3Var.G;
                if (q3Var == m4Var.q0[0]) {
                    if (m4Var.d0.W.getCurrentProgress() > f9.floatValue()) {
                        m4Var.d0.W.a(0.0f, false);
                    }
                    m4Var.d0.W.a(f9.floatValue(), true);
                    break;
                }
                break;
            case 1:
                ((org.telegram.ui.Components.pj0) this.b).h((List) obj);
                break;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                jr jrVar = ((ar) this.b).b;
                dr w02 = jrVar.w0();
                ArrayList arrayList = jrVar.B;
                a0.h hVar = jrVar.I;
                ArrayList arrayList2 = (hVar == null || hVar.m() == 0) ? arrayList : jrVar.D;
                if (hVar == null || hVar.m() == 0) {
                    hVar = jrVar.G;
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
                    Collections.sort(arrayList, new lh.e4(18));
                }
                jrVar.A0(w02);
                break;
            case 3:
                x3 x3Var = (x3) this.b;
                int i10 = ((p2.g) obj).a;
                AndroidUtilities.runOnUIThread(new lf0(0, x3Var, i10 == 0 ? null : BillingController.getResponseCodeString(i10)));
                break;
            case 4:
                zh0 zh0Var = (zh0) this.b;
                if (((p2.g) obj).a == 0) {
                    AndroidUtilities.runOnUIThread(zh0Var);
                    break;
                }
                break;
            case 5:
                ((ArrayList) this.b).add((TLRPC.User) obj);
                break;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.q2.participants.participants.size(); i11++) {
                    if (profileActivity.q2.participants.participants.get(i11).user_id == user2.id) {
                        profileActivity.q2.participants.participants.remove(i11);
                        profileActivity.e5(true, false);
                        break;
                    }
                }
                break;
            default:
                View view = ((ProxyListActivity) this.b).b.T((View) obj).a;
                if (view instanceof d11) {
                    d11 d11Var = (d11) view;
                    d11Var.setChecked(d11Var.d == SharedConfig.currentProxy);
                    d11Var.b();
                    break;
                }
                break;
        }
    }
}
