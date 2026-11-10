package bi;

import android.os.Build;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements oi.m, oi.n {
    public final /* synthetic */ w1 a;

    @Override // oi.n
    public int h() {
        return this.a.d1();
    }

    @Override // oi.m
    public void l(int i7) {
        w1 w1Var = this.a;
        dh.g gVar = w1Var.m2;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (c8.zc.a(i7, 4)) {
            gVar.h(w1Var.X0.e());
        }
        gVar.e(w1Var.r2, w1Var.b.getWidth(), w1Var.b.getHeight());
    }
}
