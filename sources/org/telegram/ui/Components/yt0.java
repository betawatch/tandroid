package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yt0 implements gg.b2, org.telegram.ui.Cells.a5 {
    public final /* synthetic */ au0 a;

    public /* synthetic */ yt0(au0 au0Var) {
        this.a = au0Var;
    }

    @Override // gg.b2
    public void a(int i10) {
        au0 au0Var = this.a;
        au0Var.l();
        if (i10 != 1) {
            return;
        }
        int i11 = au0Var.r - 1;
        au0Var.r = i11;
        if (i11 != 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            jv0 jv0Var = au0Var.s;
            cu0[] cu0VarArr = jv0Var.k0;
            if (i12 >= cu0VarArr.length) {
                return;
            }
            cu0 cu0Var = cu0VarArr[i12];
            if (cu0Var.F == 7) {
                if (au0Var.h == 0) {
                    cu0Var.w.e(false, true);
                } else {
                    jv0Var.z(cu0Var.h, 0, null);
                }
            }
            i12++;
        }
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        au0 au0Var = this.a;
        TLObject E = au0Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return au0Var.s.D1.h(tL_chatChannelParticipant, true, !z10, b5Var);
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
