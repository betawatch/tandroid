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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k3 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k3(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                p3 p3Var = (p3) this.b;
                Float f10 = (Float) obj;
                l4 l4Var = p3Var.G;
                if (p3Var == l4Var.q0[0]) {
                    if (l4Var.d0.W.getCurrentProgress() > f10.floatValue()) {
                        l4Var.d0.W.a(0.0f, false);
                    }
                    l4Var.d0.W.a(f10.floatValue(), true);
                    break;
                }
                break;
            case 1:
                ((org.telegram.ui.Components.ej0) this.b).h((List) obj);
                break;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                jr jrVar = ((zq) this.b).b;
                cr v02 = jrVar.v0();
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
                    Collections.sort(arrayList, new j9.a(20));
                }
                jrVar.z0(v02);
                break;
            case 3:
                w3 w3Var = (w3) this.b;
                int i9 = ((n2.g) obj).a;
                AndroidUtilities.runOnUIThread(new cf0(3, w3Var, i9 == 0 ? null : BillingController.getResponseCodeString(i9)));
                break;
            case 4:
                ai0 ai0Var = (ai0) this.b;
                if (((n2.g) obj).a == 0) {
                    AndroidUtilities.runOnUIThread(ai0Var);
                    break;
                }
                break;
            case 5:
                ((ArrayList) this.b).add((TLRPC.User) obj);
                break;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i10 = 0; i10 < profileActivity.q2.participants.participants.size(); i10++) {
                    if (profileActivity.q2.participants.participants.get(i10).user_id == user2.id) {
                        profileActivity.q2.participants.participants.remove(i10);
                        profileActivity.e5(true, false);
                        break;
                    }
                }
                break;
            default:
                View view = ((ProxyListActivity) this.b).b.T((View) obj).a;
                if (view instanceof c11) {
                    c11 c11Var = (c11) view;
                    c11Var.setChecked(c11Var.d == SharedConfig.currentProxy);
                    c11Var.b();
                    break;
                }
                break;
        }
    }
}
