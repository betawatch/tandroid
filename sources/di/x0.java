package di;

import android.os.Build;
import c8.dd;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
