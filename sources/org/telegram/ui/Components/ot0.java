package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ot0 implements gg.b2, org.telegram.ui.Cells.z4 {
    public final /* synthetic */ qt0 a;

    public /* synthetic */ ot0(qt0 qt0Var) {
        this.a = qt0Var;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i F() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ boolean O(int i10) {
        return true;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        qt0 qt0Var = this.a;
        TLObject E = qt0Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return qt0Var.s.D1.h(tL_chatChannelParticipant, true, !z10, a5Var);
    }

    @Override // gg.b2
    public void h(int i10) {
        qt0 qt0Var = this.a;
        qt0Var.l();
        if (i10 != 1) {
            return;
        }
        int i11 = qt0Var.r - 1;
        qt0Var.r = i11;
        if (i11 != 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            zu0 zu0Var = qt0Var.s;
            st0[] st0VarArr = zu0Var.k0;
            if (i12 >= st0VarArr.length) {
                return;
            }
            st0 st0Var = st0VarArr[i12];
            if (st0Var.F == 7) {
                if (qt0Var.h == 0) {
                    st0Var.w.e(false, true);
                } else {
                    zu0Var.z(st0Var.h, 0, null);
                }
            }
            i12++;
        }
    }

    @Override // gg.b2
    public /* synthetic */ a0.i w() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ void Q(ArrayList arrayList) {
    }
}
