// default package

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class g19 extends f19 {
    public final /* synthetic */ i19 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g19(i19 i19Var, f19 f19Var, TLRPC.ReactionCount reactionCount, boolean z) {
        super(f19Var, i19Var.l, i19Var.w, reactionCount, z, i19Var.y);
        this.g0 = i19Var;
    }

    @Override // f19
    public final float j() {
        return this.g0.a;
    }

    @Override // f19
    public final ImageReceiver k() {
        return (ImageReceiver) this.g0.E.get(this.r);
    }

    @Override // f19
    public final boolean l() {
        return this.g0.x.O3();
    }

    @Override // f19
    public final boolean m() {
        i19 i19Var = this.g0;
        int e1 = i19Var.x.e1();
        long c1 = i19Var.x.c1();
        d19 d19Var = d19.B;
        if (d19Var == null) {
            return false;
        }
        int i = d19Var.a;
        if (i != 2 && i != 0) {
            return false;
        }
        long j = d19Var.o;
        return ((j != 0 && c1 == j) || e1 == d19Var.n) && d19Var.p.equals(this.r);
    }

    @Override // f19
    public final void n() {
        this.g0.E.remove(this.r);
    }
}
