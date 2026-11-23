package ch;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class o0 extends n0 {
    public final /* synthetic */ q0 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(q0 q0Var, n0 n0Var, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(n0Var, q0Var.l, q0Var.w, reactionCount, z10, q0Var.y);
        this.g0 = q0Var;
    }

    @Override // ch.n0
    public final float j() {
        return this.g0.a;
    }

    @Override // ch.n0
    public final ImageReceiver k() {
        return (ImageReceiver) this.g0.E.get(this.r);
    }

    @Override // ch.n0
    public final boolean l() {
        return this.g0.x.P3();
    }

    @Override // ch.n0
    public final boolean m() {
        q0 q0Var = this.g0;
        int e12 = q0Var.x.e1();
        long c12 = q0Var.x.c1();
        l0 l0Var = l0.B;
        if (l0Var == null) {
            return false;
        }
        int i7 = l0Var.a;
        if (i7 != 2 && i7 != 0) {
            return false;
        }
        long j3 = l0Var.o;
        return ((j3 != 0 && c12 == j3) || e12 == l0Var.n) && l0Var.p.equals(this.r);
    }

    @Override // ch.n0
    public final void n() {
        this.g0.E.remove(this.r);
    }
}
