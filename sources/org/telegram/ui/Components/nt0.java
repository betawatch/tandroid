package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nt0 implements uf.j1, org.telegram.ui.Cells.a5 {
    public final /* synthetic */ pt0 a;

    public /* synthetic */ nt0(pt0 pt0Var) {
        this.a = pt0Var;
    }

    @Override // uf.j1
    public /* synthetic */ a0.h K() {
        return null;
    }

    @Override // uf.j1
    public /* synthetic */ boolean R(int i10) {
        return true;
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z4) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        pt0 pt0Var = this.a;
        TLObject E = pt0Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return pt0Var.s.A1.h(tL_chatChannelParticipant, true, !z4, b5Var);
    }

    @Override // uf.j1
    public void g(int i10) {
        pt0 pt0Var = this.a;
        pt0Var.l();
        if (i10 != 1) {
            return;
        }
        int i11 = pt0Var.r - 1;
        pt0Var.r = i11;
        if (i11 != 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            zu0 zu0Var = pt0Var.s;
            rt0[] rt0VarArr = zu0Var.h0;
            if (i12 >= rt0VarArr.length) {
                return;
            }
            rt0 rt0Var = rt0VarArr[i12];
            if (rt0Var.C == 7) {
                if (pt0Var.h == 0) {
                    rt0Var.w.e(false, true);
                } else {
                    zu0Var.z(rt0Var.h, 0, null);
                }
            }
            i12++;
        }
    }

    @Override // uf.j1
    public /* synthetic */ a0.h y() {
        return null;
    }

    @Override // uf.j1
    public /* synthetic */ void V(ArrayList arrayList) {
    }
}
