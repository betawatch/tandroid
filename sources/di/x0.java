package di;

import android.os.Build;
import c8.dd;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements ri.m, ri.n {
    public final /* synthetic */ h1 a;

    @Override // ri.n
    public int e() {
        return this.a.e1();
    }

    @Override // ri.m
    public void l(int i7) {
        h1 h1Var = this.a;
        dh.g gVar = h1Var.n2;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (dd.a(i7, 4)) {
            gVar.h(h1Var.Y0.e());
        }
        gVar.e(h1Var.s2, h1Var.b.getWidth(), h1Var.b.getHeight());
    }
}
