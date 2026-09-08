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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        switch (this.a) {
            case 0:
                m3 m3Var = (m3) this.b;
                Float f7 = (Float) obj;
                i4 i4Var = m3Var.K;
                if (m3Var == i4Var.u0[0]) {
                    if (i4Var.h0.d0.getCurrentProgress() > f7.floatValue()) {
                        i4Var.h0.d0.a(0.0f, false);
                    }
                    i4Var.h0.d0.a(f7.floatValue(), true);
                    break;
                }
                break;
            case 1:
                ((org.telegram.ui.Components.pj0) this.b).h((List) obj);
                break;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                vr vrVar = ((mr) this.b).b;
                pr w02 = vrVar.w0();
                ArrayList arrayList = vrVar.F;
                a0.i iVar = vrVar.M;
                ArrayList arrayList2 = (iVar == null || iVar.m() == 0) ? arrayList : vrVar.H;
                if (iVar == null || iVar.m() == 0) {
                    iVar = vrVar.K;
                }
                if (iVar.f(user.id) == null) {
                    if (ChatObject.isChannel(vrVar.r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = vrVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.id;
                        tL_channelParticipant.date = vrVar.getConnectionsManager().getCurrentTime();
                        arrayList2.add(0, tL_channelParticipant);
                        iVar.k(tL_channelParticipant, user.id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.id;
                        tL_chatParticipant.inviter_id = vrVar.getUserConfig().getClientUserId();
                        arrayList2.add(0, tL_chatParticipant);
                        iVar.k(tL_chatParticipant, user.id);
                    }
                }
                if (arrayList2 == arrayList) {
                    Collections.sort(arrayList, new f6(6));
                }
                vrVar.A0(w02);
                break;
            case 3:
                t3 t3Var = (t3) this.b;
                int i10 = ((c5.h) obj).a;
                AndroidUtilities.runOnUIThread(new r80(27, t3Var, i10 == 0 ? null : BillingController.getResponseCodeString(i10)));
                break;
            case 4:
                ri0 ri0Var = (ri0) this.b;
                if (((c5.h) obj).a == 0) {
                    AndroidUtilities.runOnUIThread(ri0Var);
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
                if (view instanceof i21) {
                    i21 i21Var = (i21) view;
                    i21Var.setChecked(i21Var.d == SharedConfig.currentProxy);
                    i21Var.b();
                    break;
                }
                break;
        }
    }
}
