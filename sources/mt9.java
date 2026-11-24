// default package

import android.app.Activity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class mt9 extends bl3 {
    public final /* synthetic */ cj3 J0;
    public final /* synthetic */ Activity K0;
    public final /* synthetic */ hi3 L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt9(hi3 hi3Var, Activity activity, cj3 cj3Var, int i, int i2, gb3 gb3Var, boolean z, cj3 cj3Var2, Activity activity2) {
        super(activity, cj3Var, i, i2, gb3Var, z);
        this.L0 = hi3Var;
        this.J0 = cj3Var2;
        this.K0 = activity2;
    }

    @Override // w39
    public final void f() {
        ns9 ns9Var;
        int i = this.C0;
        super.f();
        hi3 hi3Var = this.L0;
        if (!hi3Var.L0 && (ns9Var = hi3Var.b0) != null) {
            ns9Var.w0(0);
            hi3Var.L0 = true;
        }
        if (b() != 0 || i == 0 || this.E0 > 0) {
            return;
        }
        hi3Var.c0.e(false, false);
    }
}
