package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qu0 implements ig.z1, org.telegram.ui.Cells.e5 {
    public final /* synthetic */ su0 a;

    public /* synthetic */ qu0(su0 su0Var) {
        this.a = su0Var;
    }

    @Override // ig.z1
    public /* synthetic */ a0.h U() {
        return null;
    }

    @Override // org.telegram.ui.Cells.e5
    public boolean b(org.telegram.ui.Cells.f5 f5Var, boolean z10) {
        int intValue = ((Integer) f5Var.getTag()).intValue();
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
        return su0Var.s.F1.h(tL_chatChannelParticipant, true, !z10, f5Var);
    }

    @Override // ig.z1
    public void f(int i10) {
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
            uu0[] uu0VarArr = bw0Var.m0;
            if (i12 >= uu0VarArr.length) {
                return;
            }
            uu0 uu0Var = uu0VarArr[i12];
            if (uu0Var.E == 7) {
                if (su0Var.h == 0) {
                    uu0Var.v.e(false, true);
                } else {
                    bw0Var.C(uu0Var.h, 0, null);
                }
            }
            i12++;
        }
    }

    @Override // ig.z1
    public /* synthetic */ boolean k0(int i10) {
        return true;
    }

    @Override // ig.z1
    public /* synthetic */ a0.h y() {
        return null;
    }

    @Override // ig.z1
    public /* synthetic */ void p0(ArrayList arrayList) {
    }
}
