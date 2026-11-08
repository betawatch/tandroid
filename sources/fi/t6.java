package fi;

import android.os.Build;
import c8.zc;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        if (zc.a(i7, 4)) {
            gVar.h(w6Var.X0.e());
        }
        gVar.e(w6Var.g2, w6Var.b.getWidth(), w6Var.b.getHeight());
    }
}
