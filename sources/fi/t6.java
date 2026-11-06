package fi;

import android.os.Build;
import c8.yc;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t6 implements oi.n, oi.m {
    public final /* synthetic */ w6 a;

    public /* synthetic */ t6(w6 w6Var) {
        this.a = w6Var;
    }

    @Override // oi.n
    public int h() {
        w6 w6Var = this.a;
        w6Var.getClass();
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, w6Var.I0);
    }

    @Override // oi.m
    public void l(int i7) {
        w6 w6Var = this.a;
        dh.g gVar = w6Var.d2;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (yc.a(i7, 4)) {
            gVar.h(w6Var.X0.e());
        }
        gVar.e(w6Var.g2, w6Var.b.getWidth(), w6Var.b.getHeight());
    }
}
