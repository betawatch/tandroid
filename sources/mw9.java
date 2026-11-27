// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class mw9 extends u49 {
    public final /* synthetic */ nw9 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw9(nw9 nw9Var, int i, View view, TLRPC.TL_reactionCount tL_reactionCount, vnb vnbVar) {
        super(null, i, view, tL_reactionCount, true, vnbVar);
        this.g0 = nw9Var;
    }

    @Override // u49
    public final boolean e() {
        return this.v > 0 || this.t || this.E.l != 1.0f;
    }

    @Override // u49
    public final boolean h() {
        return !e();
    }

    @Override // u49
    public final int i() {
        return 18;
    }

    @Override // u49
    public final void r(float f) {
        int i = this.h;
        nw9 nw9Var = this.g0;
        boolean z = nw9Var.e;
        ow9 ow9Var = nw9Var.s;
        this.M = vm2.f(f, i, aob.v0(z ? aob.wk : aob.mb, ow9Var.c));
        int f2 = vm2.f(f, this.f, nw9Var.e ? aob.v0(aob.tk, ow9Var.c) : 0);
        this.N = f2;
        this.M = aob.v(f2, this.M);
        this.O = vm2.f(f, this.g, nw9Var.e ? 1526726655 : aob.v0(aob.nb, ow9Var.c));
    }
}
