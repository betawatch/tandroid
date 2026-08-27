package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vs0 implements pf.i1, org.telegram.ui.Cells.x4 {
    public final /* synthetic */ xs0 a;

    public /* synthetic */ vs0(xs0 xs0Var) {
        this.a = xs0Var;
    }

    @Override // pf.i1
    public /* synthetic */ boolean D0(int i10) {
        return true;
    }

    @Override // pf.i1
    public /* synthetic */ a0.h J() {
        return null;
    }

    @Override // org.telegram.ui.Cells.x4
    public boolean d(org.telegram.ui.Cells.y4 y4Var, boolean z10) {
        int intValue = ((Integer) y4Var.getTag()).intValue();
        xs0 xs0Var = this.a;
        TLObject E = xs0Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return xs0Var.s.z1.h(tL_chatChannelParticipant, true, !z10, y4Var);
    }

    @Override // pf.i1
    public /* synthetic */ a0.h h0() {
        return null;
    }

    @Override // pf.i1
    public void i(int i10) {
        xs0 xs0Var = this.a;
        xs0Var.l();
        if (i10 != 1) {
            return;
        }
        int i11 = xs0Var.r - 1;
        xs0Var.r = i11;
        if (i11 != 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            hu0 hu0Var = xs0Var.s;
            zs0[] zs0VarArr = hu0Var.g0;
            if (i12 >= zs0VarArr.length) {
                return;
            }
            zs0 zs0Var = zs0VarArr[i12];
            if (zs0Var.B == 7) {
                if (xs0Var.h == 0) {
                    zs0Var.w.e(false, true);
                } else {
                    hu0Var.z(zs0Var.h, 0, null);
                }
            }
            i12++;
        }
    }

    @Override // pf.i1
    public /* synthetic */ void V0(ArrayList arrayList) {
    }
}
