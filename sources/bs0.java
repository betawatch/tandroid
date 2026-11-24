// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bs0 extends fs0 {
    public final /* synthetic */ gs0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs0(gs0 gs0Var, Context context) {
        super(gs0Var, context);
        this.w = gs0Var;
    }

    @Override // fs0, y59
    public final void f() {
        super.f();
        gs0 gs0Var = this.w;
        if (gs0Var.r.getVisibility() == 0) {
            gs0Var.x.f();
        }
        a1b a1bVar = gs0Var.E;
        if (a1bVar != null) {
            t3b t3bVar = this.e;
            a1bVar.e(t3bVar != null && t3bVar.C, true);
        }
    }
}
