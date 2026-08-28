package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ts0 implements of.u1, org.telegram.ui.Cells.a5 {
    public final /* synthetic */ vs0 a;

    public /* synthetic */ ts0(vs0 vs0Var) {
        this.a = vs0Var;
    }

    @Override // of.u1
    public /* synthetic */ a0.h O() {
        return null;
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean d(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        vs0 vs0Var = this.a;
        TLObject E = vs0Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return vs0Var.s.z1.h(tL_chatChannelParticipant, true, !z10, b5Var);
    }

    @Override // of.u1
    public void e(int i9) {
        vs0 vs0Var = this.a;
        vs0Var.l();
        if (i9 != 1) {
            return;
        }
        int i10 = vs0Var.r - 1;
        vs0Var.r = i10;
        if (i10 != 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            eu0 eu0Var = vs0Var.s;
            xs0[] xs0VarArr = eu0Var.g0;
            if (i11 >= xs0VarArr.length) {
                return;
            }
            xs0 xs0Var = xs0VarArr[i11];
            if (xs0Var.B == 7) {
                if (vs0Var.h == 0) {
                    xs0Var.w.e(false, true);
                } else {
                    eu0Var.z(xs0Var.h, 0, null);
                }
            }
            i11++;
        }
    }

    @Override // of.u1
    public /* synthetic */ boolean p0(int i9) {
        return true;
    }

    @Override // of.u1
    public /* synthetic */ a0.h y() {
        return null;
    }

    @Override // of.u1
    public /* synthetic */ void H0(ArrayList arrayList) {
    }
}
