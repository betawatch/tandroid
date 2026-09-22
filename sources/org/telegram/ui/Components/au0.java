package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class au0 implements gg.b2, org.telegram.ui.Cells.b5 {
    public final /* synthetic */ cu0 a;

    public /* synthetic */ au0(cu0 cu0Var) {
        this.a = cu0Var;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i D() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ boolean L(int i10) {
        return true;
    }

    @Override // org.telegram.ui.Cells.b5
    public boolean c(org.telegram.ui.Cells.c5 c5Var, boolean z10) {
        int intValue = ((Integer) c5Var.getTag()).intValue();
        cu0 cu0Var = this.a;
        TLObject E = cu0Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return cu0Var.s.D1.h(tL_chatChannelParticipant, true, !z10, c5Var);
    }

    @Override // gg.b2
    public void f(int i10) {
        cu0 cu0Var = this.a;
        cu0Var.l();
        if (i10 != 1) {
            return;
        }
        int i11 = cu0Var.r - 1;
        cu0Var.r = i11;
        if (i11 != 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            lv0 lv0Var = cu0Var.s;
            eu0[] eu0VarArr = lv0Var.k0;
            if (i12 >= eu0VarArr.length) {
                return;
            }
            eu0 eu0Var = eu0VarArr[i12];
            if (eu0Var.F == 7) {
                if (cu0Var.h == 0) {
                    eu0Var.w.e(false, true);
                } else {
                    lv0Var.z(eu0Var.h, 0, null);
                }
            }
            i12++;
        }
    }

    @Override // gg.b2
    public /* synthetic */ a0.i y() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ void O(ArrayList arrayList) {
    }
}
