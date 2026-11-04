package dh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m0 extends l0 {
    public final /* synthetic */ o0 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(o0 o0Var, l0 l0Var, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(l0Var, o0Var.l, o0Var.w, reactionCount, z10, o0Var.y);
        this.g0 = o0Var;
    }

    @Override // dh.l0
    public final float j() {
        return this.g0.a;
    }

    @Override // dh.l0
    public final ImageReceiver k() {
        return (ImageReceiver) this.g0.E.get(this.r);
    }

    @Override // dh.l0
    public final boolean l() {
        return this.g0.x.Q3();
    }

    @Override // dh.l0
    public final boolean m() {
        o0 o0Var = this.g0;
        int f12 = o0Var.x.f1();
        long d12 = o0Var.x.d1();
        j0 j0Var = j0.B;
        if (j0Var == null) {
            return false;
        }
        int i3 = j0Var.a;
        if (i3 != 2 && i3 != 0) {
            return false;
        }
        long j10 = j0Var.o;
        return ((j10 != 0 && d12 == j10) || f12 == j0Var.n) && j0Var.p.equals(this.r);
    }

    @Override // dh.l0
    public final void n() {
        this.g0.E.remove(this.r);
    }
}
