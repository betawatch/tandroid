package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class or0 implements jg.y1, org.telegram.ui.Cells.z4 {
    public final /* synthetic */ qr0 a;

    public /* synthetic */ or0(qr0 qr0Var) {
        this.a = qr0Var;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h X0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z9) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        qr0 qr0Var = this.a;
        TLObject E = qr0Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = org.telegram.messenger.ij.C1(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return qr0Var.s.F1.h(tL_chatChannelParticipant, true, !z9, a5Var);
    }

    @Override // jg.y1
    public /* synthetic */ boolean k1(int i7) {
        return true;
    }

    @Override // jg.y1
    public void q(int i7) {
        qr0 qr0Var = this.a;
        qr0Var.f();
        if (i7 != 1) {
            return;
        }
        int i10 = qr0Var.r - 1;
        qr0Var.r = i10;
        if (i10 != 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            xs0 xs0Var = qr0Var.s;
            sr0[] sr0VarArr = xs0Var.m0;
            if (i11 >= sr0VarArr.length) {
                return;
            }
            sr0 sr0Var = sr0VarArr[i11];
            if (sr0Var.E == 7) {
                if (qr0Var.h == 0) {
                    sr0Var.w.e(false, true);
                } else {
                    xs0Var.D(sr0Var.h, 0, null);
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
