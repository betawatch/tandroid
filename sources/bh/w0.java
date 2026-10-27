package bh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class w0 extends v0 {
    public final /* synthetic */ y0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(y0 y0Var, v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11) {
        super(v0Var, y0Var.n, y0Var.z, reactionCount, z10, z11, y0Var.B);
        this.h0 = y0Var;
    }

    @Override // bh.v0
    public final float k() {
        return this.h0.a;
    }

    @Override // bh.v0
    public final ImageReceiver l() {
        return (ImageReceiver) this.h0.H.get(this.s);
    }

    @Override // bh.v0
    public final boolean m() {
        return this.h0.A.isOutOwner();
    }

    @Override // bh.v0
    public final boolean n() {
        y0 y0Var = this.h0;
        int id2 = y0Var.A.getId();
        long groupId = y0Var.A.getGroupId();
        s0 s0Var = s0.B;
        if (s0Var == null) {
            return false;
        }
        int i10 = s0Var.a;
        if (i10 != 2 && i10 != 0) {
            return false;
        }
        long j10 = s0Var.o;
        return ((j10 != 0 && groupId == j10) || id2 == s0Var.n) && s0Var.p.equals(this.s);
    }

    @Override // bh.v0
    public final void o() {
        this.h0.H.remove(this.s);
    }
}
