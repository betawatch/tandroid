package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class et0 implements rf.j1, org.telegram.ui.Cells.y4 {
    public final /* synthetic */ gt0 a;

    public /* synthetic */ et0(gt0 gt0Var) {
        this.a = gt0Var;
    }

    @Override // rf.j1
    public /* synthetic */ boolean A(int i10) {
        return true;
    }

    @Override // org.telegram.ui.Cells.y4
    public boolean d(org.telegram.ui.Cells.z4 z4Var, boolean z10) {
        int intValue = ((Integer) z4Var.getTag()).intValue();
        gt0 gt0Var = this.a;
        TLObject E = gt0Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return gt0Var.s.z1.h(tL_chatChannelParticipant, true, !z10, z4Var);
    }

    @Override // rf.j1
    public void f(int i10) {
        gt0 gt0Var = this.a;
        gt0Var.l();
        if (i10 != 1) {
            return;
        }
        int i11 = gt0Var.r - 1;
        gt0Var.r = i11;
        if (i11 != 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            qu0 qu0Var = gt0Var.s;
            it0[] it0VarArr = qu0Var.g0;
            if (i12 >= it0VarArr.length) {
                return;
            }
            it0 it0Var = it0VarArr[i12];
            if (it0Var.B == 7) {
                if (gt0Var.h == 0) {
                    it0Var.w.e(false, true);
                } else {
                    qu0Var.z(it0Var.h, 0, null);
                }
            }
            i12++;
        }
    }

    @Override // rf.j1
    public /* synthetic */ a0.h q() {
        return null;
    }

    @Override // rf.j1
    public /* synthetic */ a0.h t() {
        return null;
    }

    @Override // rf.j1
    public /* synthetic */ void E(ArrayList arrayList) {
    }
}
