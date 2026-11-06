package bi;

import android.os.Build;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        dh.g gVar = w1Var.j2;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (c8.yc.a(i7, 4)) {
            gVar.h(w1Var.X0.e());
        }
        gVar.e(w1Var.o2, w1Var.b.getWidth(), w1Var.b.getHeight());
    }
}
