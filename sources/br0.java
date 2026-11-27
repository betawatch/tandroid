// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class br0 extends fr0 {
    public final /* synthetic */ gr0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br0(gr0 gr0Var, Context context) {
        super(gr0Var, context);
        this.w = gr0Var;
    }

    @Override // fr0, j79
    public final void f() {
        super.f();
        gr0 gr0Var = this.w;
        if (gr0Var.r.getVisibility() == 0) {
            gr0Var.x.f();
        }
        z2b z2bVar = gr0Var.E;
        if (z2bVar != null) {
            o5b o5bVar = this.e;
            z2bVar.e(o5bVar != null && o5bVar.C, true);
        }
    }
}
