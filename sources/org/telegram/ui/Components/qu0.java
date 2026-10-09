package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qu0 implements gg.a2, org.telegram.ui.Cells.a5 {
    public final /* synthetic */ su0 a;

    public /* synthetic */ qu0(su0 su0Var) {
        this.a = su0Var;
    }

    @Override // gg.a2
    public /* synthetic */ a0.i V() {
        return null;
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        su0 su0Var = this.a;
        TLObject E = su0Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return su0Var.s.D1.h(tL_chatChannelParticipant, true, !z10, b5Var);
    }

    @Override // gg.a2
    public /* synthetic */ a0.i d0() {
        return null;
    }

    @Override // gg.a2
    public void h(int i10) {
        su0 su0Var = this.a;
        su0Var.l();
        if (i10 != 1) {
            return;
        }
        int i11 = su0Var.r - 1;
        su0Var.r = i11;
        if (i11 != 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            bw0 bw0Var = su0Var.s;
            uu0[] uu0VarArr = bw0Var.k0;
            if (i12 >= uu0VarArr.length) {
                return;
            }
            uu0 uu0Var = uu0VarArr[i12];
            if (uu0Var.F == 7) {
                if (su0Var.h == 0) {
                    uu0Var.w.e(false, true);
                } else {
                    bw0Var.z(uu0Var.h, 0, null);
                }
            }
            i12++;
        }
    }

    @Override // gg.a2
    public /* synthetic */ boolean s0(int i10) {
        return true;
    }

    @Override // gg.a2
    public /* synthetic */ void x0(ArrayList arrayList) {
    }
}
