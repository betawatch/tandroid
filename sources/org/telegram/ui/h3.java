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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h3 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                m3 m3Var = (m3) obj2;
                Float f7 = (Float) obj;
                j4 j4Var = m3Var.L;
                if (m3Var == j4Var.u0[0]) {
                    if (j4Var.h0.d0.getCurrentProgress() > f7.floatValue()) {
                        j4Var.h0.d0.a(0.0f, false);
                    }
                    j4Var.h0.d0.a(f7.floatValue(), true);
                    break;
                }
                break;
            case 1:
                ((org.telegram.ui.Components.pk0) obj2).h((List) obj);
                break;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                kr krVar = ((br) obj2).b;
                er x02 = krVar.x0();
                ArrayList arrayList = krVar.E;
                a0.h hVar = krVar.L;
                ArrayList arrayList2 = (hVar == null || hVar.m() == 0) ? arrayList : krVar.G;
                if (hVar == null || hVar.m() == 0) {
                    hVar = krVar.J;
                }
                if (hVar.f(user.id) == null) {
                    if (ChatObject.isChannel(krVar.n)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = krVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.id;
                        tL_channelParticipant.date = krVar.getConnectionsManager().getCurrentTime();
                        arrayList2.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.id;
                        tL_chatParticipant.inviter_id = krVar.getUserConfig().getClientUserId();
                        arrayList2.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.id);
                    }
                }
                if (arrayList2 == arrayList) {
                    Collections.sort(arrayList, new org.telegram.ui.ActionBar.n4(11));
                }
                krVar.B0(x02);
                break;
            case 3:
                t3 t3Var = (t3) obj2;
                int i11 = ((d5.i) obj).a;
                AndroidUtilities.runOnUIThread(new wb0(13, t3Var, i11 == 0 ? null : BillingController.getResponseCodeString(i11)));
                break;
            case 4:
                ci0 ci0Var = (ci0) obj2;
                if (((d5.i) obj).a == 0) {
                    AndroidUtilities.runOnUIThread(ci0Var);
                    break;
                }
                break;
            case 5:
                int i12 = ProfileActivity.R6;
                ((ArrayList) obj2).add((TLRPC.User) obj);
                break;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i13 = 0; i13 < profileActivity.u2.participants.participants.size(); i13++) {
                    if (profileActivity.u2.participants.participants.get(i13).user_id == user2.id) {
                        profileActivity.u2.participants.participants.remove(i13);
                        profileActivity.p5(true, false);
                        break;
                    }
                }
                break;
            default:
                View view = ((ProxyListActivity) obj2).b.T((View) obj).a;
                if (view instanceof s11) {
                    s11 s11Var = (s11) view;
                    s11Var.setChecked(s11Var.d == SharedConfig.currentProxy);
                    s11Var.b();
                    break;
                }
                break;
        }
    }
}
