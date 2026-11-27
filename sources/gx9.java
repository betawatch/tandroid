// default package

import android.app.Activity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class gx9 extends tl3 {
    public final /* synthetic */ uj3 J0;
    public final /* synthetic */ Activity K0;
    public final /* synthetic */ bj3 L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx9(bj3 bj3Var, Activity activity, uj3 uj3Var, int i, int i2, zb3 zb3Var, boolean z, uj3 uj3Var2, Activity activity2) {
        super(activity, uj3Var, i, i2, zb3Var, z);
        this.L0 = bj3Var;
        this.J0 = uj3Var2;
        this.K0 = activity2;
    }

    @Override // j79
    public final void f() {
        gw9 gw9Var;
        int i = this.C0;
        super.f();
        bj3 bj3Var = this.L0;
        if (!bj3Var.L0 && (gw9Var = bj3Var.b0) != null) {
            gw9Var.x0(0);
            bj3Var.L0 = true;
        }
        if (b() != 0 || i == 0 || this.E0 > 0) {
            return;
        }
        bj3Var.c0.e(false, false);
    }
}
