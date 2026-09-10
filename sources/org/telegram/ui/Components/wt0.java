package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class wt0 implements fg.c2, org.telegram.ui.Cells.a5 {
    public final /* synthetic */ yt0 a;

    public /* synthetic */ wt0(yt0 yt0Var) {
        this.a = yt0Var;
    }

    @Override // fg.c2
    public /* synthetic */ a0.i D() {
        return null;
    }

    @Override // fg.c2
    public /* synthetic */ a0.i P() {
        return null;
    }

    @Override // fg.c2
    public void a(int i10) {
        yt0 yt0Var = this.a;
        yt0Var.l();
        if (i10 != 1) {
            return;
        }
        int i11 = yt0Var.r - 1;
        yt0Var.r = i11;
        if (i11 != 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            iv0 iv0Var = yt0Var.s;
            au0[] au0VarArr = iv0Var.k0;
            if (i12 >= au0VarArr.length) {
                return;
            }
            au0 au0Var = au0VarArr[i12];
            if (au0Var.F == 7) {
                if (yt0Var.h == 0) {
                    au0Var.w.e(false, true);
                } else {
                    iv0Var.z(au0Var.h, 0, null);
                }
            }
            i12++;
        }
    }

    @Override // fg.c2
    public /* synthetic */ boolean c0(int i10) {
        return true;
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        yt0 yt0Var = this.a;
        TLObject E = yt0Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return yt0Var.s.D1.h(tL_chatChannelParticipant, true, !z10, b5Var);
    }

    @Override // fg.c2
    public /* synthetic */ void k0(ArrayList arrayList) {
    }
}
