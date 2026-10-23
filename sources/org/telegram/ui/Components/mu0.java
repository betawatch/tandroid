package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mu0 implements hg.z1, org.telegram.ui.Cells.z4 {
    public final /* synthetic */ ou0 a;

    public /* synthetic */ mu0(ou0 ou0Var) {
        this.a = ou0Var;
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
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        ou0 ou0Var = this.a;
        TLObject E = ou0Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return ou0Var.s.D1.h(tL_chatChannelParticipant, true, !z10, a5Var);
    }

    @Override // hg.z1
    public void f(int i10) {
        ou0 ou0Var = this.a;
        ou0Var.l();
        if (i10 != 1) {
            return;
        }
        int i11 = ou0Var.r - 1;
        ou0Var.r = i11;
        if (i11 != 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            xv0 xv0Var = ou0Var.s;
            qu0[] qu0VarArr = xv0Var.k0;
            if (i12 >= qu0VarArr.length) {
                return;
            }
            qu0 qu0Var = qu0VarArr[i12];
            if (qu0Var.F == 7) {
                if (ou0Var.h == 0) {
                    qu0Var.w.e(false, true);
                } else {
                    xv0Var.z(qu0Var.h, 0, null);
                }
            }
            i12++;
        }
    }

    @Override // hg.z1
    public /* synthetic */ a0.h x() {
        return null;
    }

    @Override // hg.z1
    public /* synthetic */ void S(ArrayList arrayList) {
    }
}
