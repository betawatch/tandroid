package ah;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class i1 extends h1 {
    public final /* synthetic */ k1 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(k1 k1Var, h1 h1Var, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11) {
        super(h1Var, k1Var.n, k1Var.z, reactionCount, z10, z11, k1Var.B);
        this.h0 = k1Var;
    }

    @Override // ah.h1
    public final float k() {
        return this.h0.a;
    }

    @Override // ah.h1
    public final ImageReceiver l() {
        return (ImageReceiver) this.h0.H.get(this.s);
    }

    @Override // ah.h1
    public final boolean m() {
        return this.h0.A.isOutOwner();
    }

    @Override // ah.h1
    public final boolean n() {
        k1 k1Var = this.h0;
        int id2 = k1Var.A.getId();
        long groupId = k1Var.A.getGroupId();
        e1 e1Var = e1.B;
        if (e1Var == null) {
            return false;
        }
        int i10 = e1Var.a;
        if (i10 != 2 && i10 != 0) {
            return false;
        }
        long j3 = e1Var.o;
        return ((j3 != 0 && groupId == j3) || id2 == e1Var.n) && e1Var.p.equals(this.s);
    }

    @Override // ah.h1
    public final void o() {
        this.h0.H.remove(this.s);
    }
}
