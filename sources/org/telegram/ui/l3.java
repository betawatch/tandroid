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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                r3 r3Var = (r3) this.b;
                Float f10 = (Float) obj;
                n4 n4Var = r3Var.H;
                if (r3Var == n4Var.r0[0]) {
                    if (n4Var.e0.a0.getCurrentProgress() > f10.floatValue()) {
                        n4Var.e0.a0.a(0.0f, false);
                    }
                    n4Var.e0.a0.a(f10.floatValue(), true);
                    break;
                }
                break;
            case 1:
                ((org.telegram.ui.Components.yj0) this.b).h((List) obj);
                break;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                rr rrVar = ((ir) this.b).b;
                lr w02 = rrVar.w0();
                ArrayList arrayList = rrVar.C;
                a0.h hVar = rrVar.J;
                ArrayList arrayList2 = (hVar == null || hVar.m() == 0) ? arrayList : rrVar.E;
                if (hVar == null || hVar.m() == 0) {
                    hVar = rrVar.H;
                }
                if (hVar.f(user.id) == null) {
                    if (ChatObject.isChannel(rrVar.r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = rrVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.id;
                        tL_channelParticipant.date = rrVar.getConnectionsManager().getCurrentTime();
                        arrayList2.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.id;
                        tL_chatParticipant.inviter_id = rrVar.getUserConfig().getClientUserId();
                        arrayList2.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.id);
                    }
                }
                if (arrayList2 == arrayList) {
                    Collections.sort(arrayList, new nh.e4(15));
                }
                rrVar.A0(w02);
                break;
            case 3:
                y3 y3Var = (y3) this.b;
                int i10 = ((p2.h) obj).a;
                AndroidUtilities.runOnUIThread(new ie0(8, y3Var, i10 == 0 ? null : BillingController.getResponseCodeString(i10)));
                break;
            case 4:
                ji0 ji0Var = (ji0) this.b;
                if (((p2.h) obj).a == 0) {
                    AndroidUtilities.runOnUIThread(ji0Var);
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
                if (view instanceof v11) {
                    v11 v11Var = (v11) view;
                    v11Var.setChecked(v11Var.d == SharedConfig.currentProxy);
                    v11Var.b();
                    break;
                }
                break;
        }
    }
}
