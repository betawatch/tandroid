package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class os0 implements zf.l1, org.telegram.ui.Cells.d5 {
    public final /* synthetic */ qs0 a;

    public /* synthetic */ os0(qs0 qs0Var) {
        this.a = qs0Var;
    }

    @Override // zf.l1
    public /* synthetic */ a0.h M() {
        return null;
    }

    @Override // zf.l1
    public /* synthetic */ boolean Y(int i10) {
        return true;
    }

    @Override // org.telegram.ui.Cells.d5
    public boolean c(org.telegram.ui.Cells.e5 e5Var, boolean z10) {
        int intValue = ((Integer) e5Var.getTag()).intValue();
        qs0 qs0Var = this.a;
        TLObject E = qs0Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = org.telegram.messenger.jj.C1(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return qs0Var.s.F1.h(tL_chatChannelParticipant, true, !z10, e5Var);
    }

    @Override // zf.l1
    public void i(int i10) {
        qs0 qs0Var = this.a;
        qs0Var.f();
        if (i10 != 1) {
            return;
        }
        int i11 = qs0Var.r - 1;
        qs0Var.r = i11;
        if (i11 != 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            zt0 zt0Var = qs0Var.s;
            ss0[] ss0VarArr = zt0Var.m0;
            if (i12 >= ss0VarArr.length) {
                return;
            }
            ss0 ss0Var = ss0VarArr[i12];
            if (ss0Var.E == 7) {
                if (qs0Var.h == 0) {
                    ss0Var.w.e(false, true);
                } else {
                    zt0Var.C(ss0Var.h, 0, null);
                }
            }
            i12++;
        }
    }

    @Override // zf.l1
    public /* synthetic */ a0.h x() {
        return null;
    }

    @Override // zf.l1
    public /* synthetic */ void c0(ArrayList arrayList) {
    }
}
