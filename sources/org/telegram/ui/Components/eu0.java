package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class eu0 implements gg.b2, org.telegram.ui.Cells.a5 {
    public final /* synthetic */ gu0 a;

    public /* synthetic */ eu0(gu0 gu0Var) {
        this.a = gu0Var;
    }

    @Override // gg.b2
    public void a(int i10) {
        gu0 gu0Var = this.a;
        gu0Var.l();
        if (i10 != 1) {
            return;
        }
        int i11 = gu0Var.r - 1;
        gu0Var.r = i11;
        if (i11 != 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            pv0 pv0Var = gu0Var.s;
            iu0[] iu0VarArr = pv0Var.k0;
            if (i12 >= iu0VarArr.length) {
                return;
            }
            iu0 iu0Var = iu0VarArr[i12];
            if (iu0Var.F == 7) {
                if (gu0Var.h == 0) {
                    iu0Var.w.e(false, true);
                } else {
                    pv0Var.z(iu0Var.h, 0, null);
                }
            }
            i12++;
        }
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        gu0 gu0Var = this.a;
        TLObject E = gu0Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return gu0Var.s.D1.h(tL_chatChannelParticipant, true, !z10, b5Var);
    }

    @Override // gg.b2
    public /* synthetic */ a0.i w() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i y() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ boolean z(int i10) {
        return true;
    }

    @Override // gg.b2
    public /* synthetic */ void C(ArrayList arrayList) {
    }
}
