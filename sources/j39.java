// default package

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class j39 extends i39 {
    public final /* synthetic */ l39 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j39(l39 l39Var, i39 i39Var, TLRPC.ReactionCount reactionCount, boolean z) {
        super(i39Var, l39Var.l, l39Var.w, reactionCount, z, l39Var.y);
        this.g0 = l39Var;
    }

    @Override // i39
    public final float j() {
        return this.g0.a;
    }

    @Override // i39
    public final ImageReceiver k() {
        return (ImageReceiver) this.g0.E.get(this.r);
    }

    @Override // i39
    public final boolean l() {
        return this.g0.x.O3();
    }

    @Override // i39
    public final boolean m() {
        l39 l39Var = this.g0;
        int e1 = l39Var.x.e1();
        long c1 = l39Var.x.c1();
        g39 g39Var = g39.B;
        if (g39Var == null) {
            return false;
        }
        int i = g39Var.a;
        if (i != 2 && i != 0) {
            return false;
        }
        long j = g39Var.o;
        return ((j != 0 && c1 == j) || e1 == g39Var.n) && g39Var.p.equals(this.r);
    }

    @Override // i39
    public final void n() {
        this.g0.E.remove(this.r);
    }
}
