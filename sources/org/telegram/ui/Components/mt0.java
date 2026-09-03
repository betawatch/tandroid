package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mt0 implements tf.i1, org.telegram.ui.Cells.z4 {
    public final /* synthetic */ ot0 a;

    public /* synthetic */ mt0(ot0 ot0Var) {
        this.a = ot0Var;
    }

    @Override // tf.i1
    public /* synthetic */ a0.h H0() {
        return null;
    }

    @Override // tf.i1
    public /* synthetic */ a0.h X0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z4) {
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
        return ot0Var.s.A1.h(tL_chatChannelParticipant, true, !z4, a5Var);
    }

    @Override // tf.i1
    public void k(int i10) {
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
            yu0 yu0Var = ot0Var.s;
            qt0[] qt0VarArr = yu0Var.h0;
            if (i12 >= qt0VarArr.length) {
                return;
            }
            qt0 qt0Var = qt0VarArr[i12];
            if (qt0Var.C == 7) {
                if (ot0Var.h == 0) {
                    qt0Var.w.e(false, true);
                } else {
                    yu0Var.z(qt0Var.h, 0, null);
                }
            }
            i12++;
        }
    }

    @Override // tf.i1
    public /* synthetic */ boolean t1(int i10) {
        return true;
    }

    @Override // tf.i1
    public /* synthetic */ void J1(ArrayList arrayList) {
    }
}
