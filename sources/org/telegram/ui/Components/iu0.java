package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class iu0 implements hg.z1, org.telegram.ui.Cells.z4 {
    public final /* synthetic */ ku0 a;

    public /* synthetic */ iu0(ku0 ku0Var) {
        this.a = ku0Var;
    }

    @Override // hg.z1
    public /* synthetic */ a0.h G() {
        return null;
    }

    @Override // hg.z1
    public /* synthetic */ boolean O(int i10) {
        return true;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        ku0 ku0Var = this.a;
        TLObject E = ku0Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return ku0Var.s.D1.h(tL_chatChannelParticipant, true, !z10, a5Var);
    }

    @Override // hg.z1
    public void f(int i10) {
        ku0 ku0Var = this.a;
        ku0Var.l();
        if (i10 != 1) {
            return;
        }
        int i11 = ku0Var.r - 1;
        ku0Var.r = i11;
        if (i11 != 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            tv0 tv0Var = ku0Var.s;
            mu0[] mu0VarArr = tv0Var.k0;
            if (i12 >= mu0VarArr.length) {
                return;
            }
            mu0 mu0Var = mu0VarArr[i12];
            if (mu0Var.F == 7) {
                if (ku0Var.h == 0) {
                    mu0Var.w.e(false, true);
                } else {
                    tv0Var.z(mu0Var.h, 0, null);
                }
            }
            i12++;
        }
    }

    @Override // hg.z1
    public /* synthetic */ a0.h y() {
        return null;
    }

    @Override // hg.z1
    public /* synthetic */ void S(ArrayList arrayList) {
    }
}
