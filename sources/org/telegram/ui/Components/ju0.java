package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ju0 implements hg.z1, org.telegram.ui.Cells.z4 {
    public final /* synthetic */ lu0 a;

    public /* synthetic */ ju0(lu0 lu0Var) {
        this.a = lu0Var;
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
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        lu0 lu0Var = this.a;
        TLObject E = lu0Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return lu0Var.s.D1.h(tL_chatChannelParticipant, true, !z10, a5Var);
    }

    @Override // hg.z1
    public void f(int i10) {
        lu0 lu0Var = this.a;
        lu0Var.l();
        if (i10 != 1) {
            return;
        }
        int i11 = lu0Var.r - 1;
        lu0Var.r = i11;
        if (i11 != 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            uv0 uv0Var = lu0Var.s;
            nu0[] nu0VarArr = uv0Var.k0;
            if (i12 >= nu0VarArr.length) {
                return;
            }
            nu0 nu0Var = nu0VarArr[i12];
            if (nu0Var.F == 7) {
                if (lu0Var.h == 0) {
                    nu0Var.w.e(false, true);
                } else {
                    uv0Var.z(nu0Var.h, 0, null);
                }
            }
            i12++;
        }
    }

    @Override // hg.z1
    public /* synthetic */ a0.h y() {
        return null;
    }

    @Override // hg.z1
    public /* synthetic */ void S(ArrayList arrayList) {
    }
}
