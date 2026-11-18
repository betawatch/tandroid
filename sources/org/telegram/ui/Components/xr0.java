package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class xr0 implements jg.y1, org.telegram.ui.Cells.z4 {
    public final /* synthetic */ zr0 a;

    public /* synthetic */ xr0(zr0 zr0Var) {
        this.a = zr0Var;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h K0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        zr0 zr0Var = this.a;
        TLObject E = zr0Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = org.telegram.messenger.fj.B1(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return zr0Var.s.G1.h(tL_chatChannelParticipant, true, !z10, a5Var);
    }

    @Override // jg.y1
    public /* synthetic */ a0.h d1() {
        return null;
    }

    @Override // jg.y1
    public void r(int i7) {
        zr0 zr0Var = this.a;
        zr0Var.f();
        if (i7 != 1) {
            return;
        }
        int i10 = zr0Var.r - 1;
        zr0Var.r = i10;
        if (i10 != 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            gt0 gt0Var = zr0Var.s;
            bs0[] bs0VarArr = gt0Var.n0;
            if (i11 >= bs0VarArr.length) {
                return;
            }
            bs0 bs0Var = bs0VarArr[i11];
            if (bs0Var.F == 7) {
                if (zr0Var.h == 0) {
                    bs0Var.w.e(false, true);
                } else {
                    gt0Var.D(bs0Var.h, 0, null);
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
