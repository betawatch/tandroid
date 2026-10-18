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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                l4 l4Var = o3Var.K;
                if (o3Var == l4Var.u0[0]) {
                    if (l4Var.h0.d0.getCurrentProgress() > f7.floatValue()) {
                        l4Var.h0.d0.a(0.0f, false);
                    }
                    l4Var.h0.d0.a(f7.floatValue(), true);
                    break;
                }
                break;
            case 1:
                ((org.telegram.ui.Components.mk0) this.b).h((List) obj);
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
                    Collections.sort(arrayList, new org.telegram.ui.ActionBar.i4(11));
                }
                jrVar.A0(w02);
                break;
            case 3:
                v3 v3Var = (v3) this.b;
                int i10 = ((c5.i) obj).a;
                AndroidUtilities.runOnUIThread(new b80(26, v3Var, i10 == 0 ? null : BillingController.getResponseCodeString(i10)));
                break;
            case 4:
                ci0 ci0Var = (ci0) this.b;
                if (((c5.i) obj).a == 0) {
                    AndroidUtilities.runOnUIThread(ci0Var);
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
                        profileActivity.e5(true, false);
                        break;
                    }
                }
                break;
            default:
                View view = ((ProxyListActivity) this.b).b.T((View) obj).a;
                if (view instanceof m11) {
                    m11 m11Var = (m11) view;
                    m11Var.setChecked(m11Var.d == SharedConfig.currentProxy);
                    m11Var.b();
                    break;
                }
                break;
        }
    }
}
