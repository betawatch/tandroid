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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                j4 j4Var = n3Var.K;
                if (n3Var == j4Var.u0[0]) {
                    if (j4Var.h0.d0.getCurrentProgress() > f7.floatValue()) {
                        j4Var.h0.d0.a(0.0f, false);
                    }
                    j4Var.h0.d0.a(f7.floatValue(), true);
                    break;
                }
                break;
            case 1:
                ((org.telegram.ui.Components.zj0) this.b).h((List) obj);
                break;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                wr wrVar = ((nr) this.b).b;
                qr w02 = wrVar.w0();
                ArrayList arrayList = wrVar.F;
                a0.i iVar = wrVar.M;
                ArrayList arrayList2 = (iVar == null || iVar.m() == 0) ? arrayList : wrVar.H;
                if (iVar == null || iVar.m() == 0) {
                    iVar = wrVar.K;
                }
                if (iVar.f(user.id) == null) {
                    if (ChatObject.isChannel(wrVar.r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = wrVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.id;
                        tL_channelParticipant.date = wrVar.getConnectionsManager().getCurrentTime();
                        arrayList2.add(0, tL_channelParticipant);
                        iVar.k(tL_channelParticipant, user.id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.id;
                        tL_chatParticipant.inviter_id = wrVar.getUserConfig().getClientUserId();
                        arrayList2.add(0, tL_chatParticipant);
                        iVar.k(tL_chatParticipant, user.id);
                    }
                }
                if (arrayList2 == arrayList) {
                    Collections.sort(arrayList, new a4.e(27));
                }
                wrVar.A0(w02);
                break;
            case 3:
                u3 u3Var = (u3) this.b;
                int i10 = ((c5.h) obj).a;
                AndroidUtilities.runOnUIThread(new h90(24, u3Var, i10 == 0 ? null : BillingController.getResponseCodeString(i10)));
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
                if (view instanceof m21) {
                    m21 m21Var = (m21) view;
                    m21Var.setChecked(m21Var.d == SharedConfig.currentProxy);
                    m21Var.b();
                    break;
                }
                break;
        }
    }
}
