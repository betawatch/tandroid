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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                p3 p3Var = (p3) this.b;
                Float f10 = (Float) obj;
                l4 l4Var = p3Var.H;
                if (p3Var == l4Var.r0[0]) {
                    if (l4Var.e0.a0.getCurrentProgress() > f10.floatValue()) {
                        l4Var.e0.a0.a(0.0f, false);
                    }
                    l4Var.e0.a0.a(f10.floatValue(), true);
                    break;
                }
                break;
            case 1:
                ((org.telegram.ui.Components.ak0) this.b).h((List) obj);
                break;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                qr qrVar = ((hr) this.b).b;
                kr w02 = qrVar.w0();
                ArrayList arrayList = qrVar.C;
                a0.h hVar = qrVar.J;
                ArrayList arrayList2 = (hVar == null || hVar.m() == 0) ? arrayList : qrVar.E;
                if (hVar == null || hVar.m() == 0) {
                    hVar = qrVar.H;
                }
                if (hVar.f(user.id) == null) {
                    if (ChatObject.isChannel(qrVar.r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = qrVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.id;
                        tL_channelParticipant.date = qrVar.getConnectionsManager().getCurrentTime();
                        arrayList2.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.id;
                        tL_chatParticipant.inviter_id = qrVar.getUserConfig().getClientUserId();
                        arrayList2.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.id);
                    }
                }
                if (arrayList2 == arrayList) {
                    Collections.sort(arrayList, new oh.k0(15));
                }
                qrVar.A0(w02);
                break;
            case 3:
                w3 w3Var = (w3) this.b;
                int i10 = ((p2.h) obj).a;
                AndroidUtilities.runOnUIThread(new he0(8, w3Var, i10 == 0 ? null : BillingController.getResponseCodeString(i10)));
                break;
            case 4:
                ii0 ii0Var = (ii0) this.b;
                if (((p2.h) obj).a == 0) {
                    AndroidUtilities.runOnUIThread(ii0Var);
                    break;
                }
                break;
            case 5:
                ((ArrayList) this.b).add((TLRPC.User) obj);
                break;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.r2.participants.participants.size(); i11++) {
                    if (profileActivity.r2.participants.participants.get(i11).user_id == user2.id) {
                        profileActivity.r2.participants.participants.remove(i11);
                        profileActivity.e5(true, false);
                        break;
                    }
                }
                break;
            default:
                View view = ((ProxyListActivity) this.b).b.T((View) obj).a;
                if (view instanceof r11) {
                    r11 r11Var = (r11) view;
                    r11Var.setChecked(r11Var.d == SharedConfig.currentProxy);
                    r11Var.b();
                    break;
                }
                break;
        }
    }
}
