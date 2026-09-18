package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zt0 implements gg.b2, org.telegram.ui.Cells.a5 {
    public final /* synthetic */ bu0 a;

    public /* synthetic */ zt0(bu0 bu0Var) {
        this.a = bu0Var;
    }

    @Override // gg.b2
    public void a(int i10) {
        bu0 bu0Var = this.a;
        bu0Var.l();
        if (i10 != 1) {
            return;
        }
        int i11 = bu0Var.r - 1;
        bu0Var.r = i11;
        if (i11 != 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            kv0 kv0Var = bu0Var.s;
            du0[] du0VarArr = kv0Var.k0;
            if (i12 >= du0VarArr.length) {
                return;
            }
            du0 du0Var = du0VarArr[i12];
            if (du0Var.F == 7) {
                if (bu0Var.h == 0) {
                    du0Var.w.e(false, true);
                } else {
                    kv0Var.z(du0Var.h, 0, null);
                }
            }
            i12++;
        }
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        bu0 bu0Var = this.a;
        TLObject E = bu0Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return bu0Var.s.D1.h(tL_chatChannelParticipant, true, !z10, b5Var);
    }

    @Override // gg.b2
    public /* synthetic */ a0.i i() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i o() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ boolean s(int i10) {
        return true;
    }

    @Override // gg.b2
    public /* synthetic */ void F(ArrayList arrayList) {
    }
}
