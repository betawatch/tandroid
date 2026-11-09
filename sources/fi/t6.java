package fi;

import android.os.Build;
import c8.zc;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        return org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.d6, w6Var.I0);
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
