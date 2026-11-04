package gi;

import android.os.Build;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u6 implements pi.n, pi.m {
    public final /* synthetic */ x6 a;

    public /* synthetic */ u6(x6 x6Var) {
        this.a = x6Var;
    }

    @Override // pi.n
    public int e() {
        x6 x6Var = this.a;
        x6Var.getClass();
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, x6Var.J0);
    }

    @Override // pi.m
    public void l(int i3) {
        x6 x6Var = this.a;
        eh.g gVar = x6Var.e2;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (x7.u.a(i3, 4)) {
            gVar.h(x6Var.Y0.e());
        }
        gVar.e(x6Var.h2, x6Var.b.getWidth(), x6Var.b.getHeight());
    }
}
