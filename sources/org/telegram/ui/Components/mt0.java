package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class mt0 implements hg.a2, org.telegram.ui.Cells.z4 {
    public final /* synthetic */ ot0 a;

    public /* synthetic */ mt0(ot0 ot0Var) {
        this.a = ot0Var;
    }

    @Override // hg.a2
    public /* synthetic */ a0.i G() {
        return null;
    }

    @Override // hg.a2
    public /* synthetic */ boolean Q(int i10) {
        return true;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        ot0 ot0Var = this.a;
        TLObject E = ot0Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return ot0Var.s.D1.h(tL_chatChannelParticipant, true, !z10, a5Var);
    }

    @Override // hg.a2
    public void f(int i10) {
        ot0 ot0Var = this.a;
        ot0Var.l();
        if (i10 != 1) {
            return;
        }
        int i11 = ot0Var.r - 1;
        ot0Var.r = i11;
        if (i11 != 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            xu0 xu0Var = ot0Var.s;
            qt0[] qt0VarArr = xu0Var.k0;
            if (i12 >= qt0VarArr.length) {
                return;
            }
            qt0 qt0Var = qt0VarArr[i12];
            if (qt0Var.F == 7) {
                if (ot0Var.h == 0) {
                    qt0Var.w.e(false, true);
                } else {
                    xu0Var.z(qt0Var.h, 0, null);
                }
            }
            i12++;
        }
    }

    @Override // hg.a2
    public /* synthetic */ a0.i w() {
        return null;
    }

    @Override // hg.a2
    public /* synthetic */ void Y(ArrayList arrayList) {
    }
}
