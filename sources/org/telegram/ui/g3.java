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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                ((org.telegram.ui.Components.qj0) this.b).h((List) obj);
                break;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                ur urVar = ((lr) this.b).b;
                or w02 = urVar.w0();
                ArrayList arrayList = urVar.F;
                a0.i iVar = urVar.M;
                ArrayList arrayList2 = (iVar == null || iVar.m() == 0) ? arrayList : urVar.H;
                if (iVar == null || iVar.m() == 0) {
                    iVar = urVar.K;
                }
                if (iVar.f(user.id) == null) {
                    if (ChatObject.isChannel(urVar.r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = urVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.id;
                        tL_channelParticipant.date = urVar.getConnectionsManager().getCurrentTime();
                        arrayList2.add(0, tL_channelParticipant);
                        iVar.k(tL_channelParticipant, user.id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.id;
                        tL_chatParticipant.inviter_id = urVar.getUserConfig().getClientUserId();
                        arrayList2.add(0, tL_chatParticipant);
                        iVar.k(tL_chatParticipant, user.id);
                    }
                }
                if (arrayList2 == arrayList) {
                    Collections.sort(arrayList, new ff(4));
                }
                urVar.A0(w02);
                break;
            case 3:
                s3 s3Var = (s3) this.b;
                int i10 = ((c5.h) obj).a;
                AndroidUtilities.runOnUIThread(new oa0(21, s3Var, i10 == 0 ? null : BillingController.getResponseCodeString(i10)));
                break;
            case 4:
                si0 si0Var = (si0) this.b;
                if (((c5.h) obj).a == 0) {
                    AndroidUtilities.runOnUIThread(si0Var);
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
                if (view instanceof h21) {
                    h21 h21Var = (h21) view;
                    h21Var.setChecked(h21Var.d == SharedConfig.currentProxy);
                    h21Var.b();
                    break;
                }
                break;
        }
    }
}
