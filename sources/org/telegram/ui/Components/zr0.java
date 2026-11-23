package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zr0 implements jg.y1, org.telegram.ui.Cells.a5 {
    public final /* synthetic */ bs0 a;

    public /* synthetic */ zr0(bs0 bs0Var) {
        this.a = bs0Var;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h K0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean b(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        bs0 bs0Var = this.a;
        TLObject E = bs0Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = org.telegram.messenger.gj.B1(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return bs0Var.s.G1.h(tL_chatChannelParticipant, true, !z10, b5Var);
    }

    @Override // jg.y1
    public /* synthetic */ a0.h d1() {
        return null;
    }

    @Override // jg.y1
    public void r(int i7) {
        bs0 bs0Var = this.a;
        bs0Var.f();
        if (i7 != 1) {
            return;
        }
        int i10 = bs0Var.r - 1;
        bs0Var.r = i10;
        if (i10 != 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            jt0 jt0Var = bs0Var.s;
            ds0[] ds0VarArr = jt0Var.n0;
            if (i11 >= ds0VarArr.length) {
                return;
            }
            ds0 ds0Var = ds0VarArr[i11];
            if (ds0Var.F == 7) {
                if (bs0Var.h == 0) {
                    ds0Var.w.e(false, true);
                } else {
                    jt0Var.D(ds0Var.h, 0, null);
                }
            }
            i11++;
        }
    }

    @Override // jg.y1
    public /* synthetic */ boolean v1(int i7) {
        return true;
    }

    @Override // jg.y1
    public /* synthetic */ void P1(ArrayList arrayList) {
    }
}
