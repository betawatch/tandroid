package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hu0 implements hg.z1, org.telegram.ui.Cells.z4 {
    public final /* synthetic */ ju0 a;

    public /* synthetic */ hu0(ju0 ju0Var) {
        this.a = ju0Var;
    }

    @Override // hg.z1
    public /* synthetic */ a0.h J() {
        return null;
    }

    @Override // hg.z1
    public /* synthetic */ boolean O(int i10) {
        return true;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        ju0 ju0Var = this.a;
        TLObject E = ju0Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return ju0Var.s.D1.h(tL_chatChannelParticipant, true, !z10, a5Var);
    }

    @Override // hg.z1
    public void f(int i10) {
        ju0 ju0Var = this.a;
        ju0Var.l();
        if (i10 != 1) {
            return;
        }
        int i11 = ju0Var.r - 1;
        ju0Var.r = i11;
        if (i11 != 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            sv0 sv0Var = ju0Var.s;
            lu0[] lu0VarArr = sv0Var.k0;
            if (i12 >= lu0VarArr.length) {
                return;
            }
            lu0 lu0Var = lu0VarArr[i12];
            if (lu0Var.F == 7) {
                if (ju0Var.h == 0) {
                    lu0Var.w.e(false, true);
                } else {
                    sv0Var.z(lu0Var.h, 0, null);
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
    public /* synthetic */ void Y(ArrayList arrayList) {
    }
}
