package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nr0 implements kg.u1, org.telegram.ui.Cells.z4 {
    public final /* synthetic */ pr0 a;

    public /* synthetic */ nr0(pr0 pr0Var) {
        this.a = pr0Var;
    }

    @Override // kg.u1
    public /* synthetic */ a0.h C0() {
        return null;
    }

    @Override // kg.u1
    public /* synthetic */ boolean J1(int i3) {
        return true;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        pr0 pr0Var = this.a;
        TLObject E = pr0Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = org.telegram.messenger.zi.C1(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return pr0Var.s.G1.h(tL_chatChannelParticipant, true, !z10, a5Var);
    }

    @Override // kg.u1
    public /* synthetic */ a0.h k1() {
        return null;
    }

    @Override // kg.u1
    public void r(int i3) {
        pr0 pr0Var = this.a;
        pr0Var.f();
        if (i3 != 1) {
            return;
        }
        int i10 = pr0Var.r - 1;
        pr0Var.r = i10;
        if (i10 != 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            ws0 ws0Var = pr0Var.s;
            rr0[] rr0VarArr = ws0Var.n0;
            if (i11 >= rr0VarArr.length) {
                return;
            }
            rr0 rr0Var = rr0VarArr[i11];
            if (rr0Var.F == 7) {
                if (pr0Var.h == 0) {
                    rr0Var.w.e(false, true);
                } else {
                    ws0Var.D(rr0Var.h, 0, null);
                }
            }
            i11++;
        }
    }

    @Override // kg.u1
    public /* synthetic */ void b2(ArrayList arrayList) {
    }
}
