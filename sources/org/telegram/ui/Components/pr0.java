package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class pr0 implements jg.y1, org.telegram.ui.Cells.z4 {
    public final /* synthetic */ rr0 a;

    public /* synthetic */ pr0(rr0 rr0Var) {
        this.a = rr0Var;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h K() {
        return null;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h U() {
        return null;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        rr0 rr0Var = this.a;
        TLObject E = rr0Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = org.telegram.messenger.gj.B1(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return rr0Var.s.G1.h(tL_chatChannelParticipant, true, !z10, a5Var);
    }

    @Override // jg.y1
    public /* synthetic */ boolean e0(int i7) {
        return true;
    }

    @Override // jg.y1
    public void i(int i7) {
        rr0 rr0Var = this.a;
        rr0Var.f();
        if (i7 != 1) {
            return;
        }
        int i10 = rr0Var.r - 1;
        rr0Var.r = i10;
        if (i10 != 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            ys0 ys0Var = rr0Var.s;
            tr0[] tr0VarArr = ys0Var.n0;
            if (i11 >= tr0VarArr.length) {
                return;
            }
            tr0 tr0Var = tr0VarArr[i11];
            if (tr0Var.F == 7) {
                if (rr0Var.h == 0) {
                    tr0Var.w.e(false, true);
                } else {
                    ys0Var.D(tr0Var.h, 0, null);
                }
            }
            i11++;
        }
    }

    @Override // jg.y1
    public /* synthetic */ void l0(ArrayList arrayList) {
    }
}
