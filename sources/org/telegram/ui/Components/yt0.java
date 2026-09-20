package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class yt0 implements gg.b2, org.telegram.ui.Cells.b5 {
    public final /* synthetic */ au0 a;

    public /* synthetic */ yt0(au0 au0Var) {
        this.a = au0Var;
    }

    @Override // gg.b2
    public /* synthetic */ boolean F(int i10) {
        return true;
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

    @Override // org.telegram.ui.Cells.b5
    public boolean e(org.telegram.ui.Cells.c5 c5Var, boolean z10) {
        int intValue = ((Integer) c5Var.getTag()).intValue();
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
        return au0Var.s.D1.h(tL_chatChannelParticipant, true, !z10, c5Var);
    }

    @Override // gg.b2
    public /* synthetic */ a0.i l() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i w() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ void G(ArrayList arrayList) {
    }
}
