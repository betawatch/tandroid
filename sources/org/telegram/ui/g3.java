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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g3 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                l3 l3Var = (l3) this.b;
                Float f7 = (Float) obj;
                h4 h4Var = l3Var.K;
                if (l3Var == h4Var.u0[0]) {
                    if (h4Var.h0.d0.getCurrentProgress() > f7.floatValue()) {
                        h4Var.h0.d0.a(0.0f, false);
                    }
                    h4Var.h0.d0.a(f7.floatValue(), true);
                    break;
                }
                break;
            case 1:
                ((org.telegram.ui.Components.ak0) this.b).h((List) obj);
                break;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                sr srVar = ((jr) this.b).b;
                mr w02 = srVar.w0();
                ArrayList arrayList = srVar.F;
                a0.i iVar = srVar.M;
                ArrayList arrayList2 = (iVar == null || iVar.m() == 0) ? arrayList : srVar.H;
                if (iVar == null || iVar.m() == 0) {
                    iVar = srVar.K;
                }
                if (iVar.f(user.id) == null) {
                    if (ChatObject.isChannel(srVar.r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = srVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.id;
                        tL_channelParticipant.date = srVar.getConnectionsManager().getCurrentTime();
                        arrayList2.add(0, tL_channelParticipant);
                        iVar.k(tL_channelParticipant, user.id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.id;
                        tL_chatParticipant.inviter_id = srVar.getUserConfig().getClientUserId();
                        arrayList2.add(0, tL_chatParticipant);
                        iVar.k(tL_chatParticipant, user.id);
                    }
                }
                if (arrayList2 == arrayList) {
                    Collections.sort(arrayList, new df(4));
                }
                srVar.A0(w02);
                break;
            case 3:
                s3 s3Var = (s3) this.b;
                int i10 = ((c5.h) obj).a;
                AndroidUtilities.runOnUIThread(new y80(25, s3Var, i10 == 0 ? null : BillingController.getResponseCodeString(i10)));
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
                View view = ((ProxyListActivity) this.b).b.U((View) obj).a;
                if (view instanceof f21) {
                    f21 f21Var = (f21) view;
                    f21Var.setChecked(f21Var.d == SharedConfig.currentProxy);
                    f21Var.b();
                    break;
                }
                break;
        }
    }
}
