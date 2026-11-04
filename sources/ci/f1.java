package ci;

import android.os.Build;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f1 implements pi.m, pi.n {
    public final /* synthetic */ p1 a;

    @Override // pi.n
    public int e() {
        return this.a.d1();
    }

    @Override // pi.m
    public void l(int i3) {
        p1 p1Var = this.a;
        eh.g gVar = p1Var.k2;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (x7.u.a(i3, 4)) {
            gVar.h(p1Var.Y0.e());
        }
        gVar.e(p1Var.p2, p1Var.b.getWidth(), p1Var.b.getHeight());
    }
}
