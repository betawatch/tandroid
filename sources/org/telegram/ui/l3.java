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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                Float f10 = (Float) obj;
                m4 m4Var = q3Var.G;
                if (q3Var == m4Var.q0[0]) {
                    if (m4Var.d0.W.getCurrentProgress() > f10.floatValue()) {
                        m4Var.d0.W.a(0.0f, false);
                    }
                    m4Var.d0.W.a(f10.floatValue(), true);
                    break;
                }
                break;
            case 1:
                ((org.telegram.ui.Components.gj0) this.b).h((List) obj);
                break;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                lr lrVar = ((br) this.b).b;
                er w02 = lrVar.w0();
                ArrayList arrayList = lrVar.B;
                a0.h hVar = lrVar.I;
                ArrayList arrayList2 = (hVar == null || hVar.m() == 0) ? arrayList : lrVar.D;
                if (hVar == null || hVar.m() == 0) {
                    hVar = lrVar.G;
                }
                if (hVar.f(user.id) == null) {
                    if (ChatObject.isChannel(lrVar.r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = lrVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.id;
                        tL_channelParticipant.date = lrVar.getConnectionsManager().getCurrentTime();
                        arrayList2.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.id;
                        tL_chatParticipant.inviter_id = lrVar.getUserConfig().getClientUserId();
                        arrayList2.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.id);
                    }
                }
                if (arrayList2 == arrayList) {
                    Collections.sort(arrayList, new k9.a(18));
                }
                lrVar.A0(w02);
                break;
            case 3:
                x3 x3Var = (x3) this.b;
                int i10 = ((n2.g) obj).a;
                AndroidUtilities.runOnUIThread(new ff0(3, x3Var, i10 == 0 ? null : BillingController.getResponseCodeString(i10)));
                break;
            case 4:
                ci0 ci0Var = (ci0) this.b;
                if (((n2.g) obj).a == 0) {
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
