package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr0 implements jg.y1, org.telegram.ui.Cells.z4 {
    public final /* synthetic */ sr0 a;

    public /* synthetic */ qr0(sr0 sr0Var) {
        this.a = sr0Var;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h X0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z9) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        sr0 sr0Var = this.a;
        TLObject E = sr0Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = org.telegram.messenger.ij.B1(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return sr0Var.s.F1.h(tL_chatChannelParticipant, true, !z9, a5Var);
    }

    @Override // jg.y1
    public /* synthetic */ boolean k1(int i7) {
        return true;
    }

    @Override // jg.y1
    public void q(int i7) {
        sr0 sr0Var = this.a;
        sr0Var.f();
        if (i7 != 1) {
            return;
        }
        int i10 = sr0Var.r - 1;
        sr0Var.r = i10;
        if (i10 != 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            zs0 zs0Var = sr0Var.s;
            ur0[] ur0VarArr = zs0Var.m0;
            if (i11 >= ur0VarArr.length) {
                return;
            }
            ur0 ur0Var = ur0VarArr[i11];
            if (ur0Var.E == 7) {
                if (sr0Var.h == 0) {
                    ur0Var.w.e(false, true);
                } else {
                    zs0Var.D(ur0Var.h, 0, null);
                }
            }
            i11++;
        }
    }

    @Override // jg.y1
    public /* synthetic */ a0.h v0() {
        return null;
    }

    @Override // jg.y1
    public /* synthetic */ void m1(ArrayList arrayList) {
    }
}
