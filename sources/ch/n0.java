package ch;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class n0 extends m0 {
    public final /* synthetic */ p0 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(p0 p0Var, m0 m0Var, TLRPC.ReactionCount reactionCount, boolean z9) {
        super(m0Var, p0Var.l, p0Var.w, reactionCount, z9, p0Var.y);
        this.g0 = p0Var;
    }

    @Override // ch.m0
    public final float j() {
        return this.g0.a;
    }

    @Override // ch.m0
    public final ImageReceiver k() {
        return (ImageReceiver) this.g0.E.get(this.r);
    }

    @Override // ch.m0
    public final boolean l() {
        return this.g0.x.Q3();
    }

    @Override // ch.m0
    public final boolean m() {
        p0 p0Var = this.g0;
        int f12 = p0Var.x.f1();
        long d12 = p0Var.x.d1();
        k0 k0Var = k0.B;
        if (k0Var == null) {
            return false;
        }
        int i7 = k0Var.a;
        if (i7 != 2 && i7 != 0) {
            return false;
        }
        long j3 = k0Var.o;
        return ((j3 != 0 && d12 == j3) || f12 == k0Var.n) && k0Var.p.equals(this.r);
    }

    @Override // ch.m0
    public final void n() {
        this.g0.E.remove(this.r);
    }
}
