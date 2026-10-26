package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pu0 implements ig.z1, org.telegram.ui.Cells.e5 {
    public final /* synthetic */ ru0 a;

    public /* synthetic */ pu0(ru0 ru0Var) {
        this.a = ru0Var;
    }

    @Override // ig.z1
    public /* synthetic */ a0.h U() {
        return null;
    }

    @Override // org.telegram.ui.Cells.e5
    public boolean b(org.telegram.ui.Cells.f5 f5Var, boolean z10) {
        int intValue = ((Integer) f5Var.getTag()).intValue();
        ru0 ru0Var = this.a;
        TLObject E = ru0Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return ru0Var.s.F1.h(tL_chatChannelParticipant, true, !z10, f5Var);
    }

    @Override // ig.z1
    public void f(int i10) {
        ru0 ru0Var = this.a;
        ru0Var.l();
        if (i10 != 1) {
            return;
        }
        int i11 = ru0Var.r - 1;
        ru0Var.r = i11;
        if (i11 != 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            aw0 aw0Var = ru0Var.s;
            tu0[] tu0VarArr = aw0Var.m0;
            if (i12 >= tu0VarArr.length) {
                return;
            }
            tu0 tu0Var = tu0VarArr[i12];
            if (tu0Var.E == 7) {
                if (ru0Var.h == 0) {
                    tu0Var.v.e(false, true);
                } else {
                    aw0Var.C(tu0Var.h, 0, null);
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
