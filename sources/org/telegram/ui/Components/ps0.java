package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ps0 implements zf.l1, org.telegram.ui.Cells.d5 {
    public final /* synthetic */ rs0 a;

    public /* synthetic */ ps0(rs0 rs0Var) {
        this.a = rs0Var;
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
        rs0 rs0Var = this.a;
        TLObject E = rs0Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = org.telegram.messenger.kj.C1(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return rs0Var.s.F1.h(tL_chatChannelParticipant, true, !z10, e5Var);
    }

    @Override // zf.l1
    public void i(int i10) {
        rs0 rs0Var = this.a;
        rs0Var.f();
        if (i10 != 1) {
            return;
        }
        int i11 = rs0Var.r - 1;
        rs0Var.r = i11;
        if (i11 != 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            au0 au0Var = rs0Var.s;
            ts0[] ts0VarArr = au0Var.m0;
            if (i12 >= ts0VarArr.length) {
                return;
            }
            ts0 ts0Var = ts0VarArr[i12];
            if (ts0Var.E == 7) {
                if (rs0Var.h == 0) {
                    ts0Var.w.e(false, true);
                } else {
                    au0Var.C(ts0Var.h, 0, null);
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
