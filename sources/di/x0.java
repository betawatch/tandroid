package di;

import android.os.Build;
import c8.dd;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
