package m4;

import android.view.Surface;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.nu;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements e2.j, mu, bm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t0(j1 j1Var, Surface surface, int i10, int i11) {
        this.c = j1Var;
        this.d = surface;
        this.a = i10;
        this.b = i11;
    }

    @Override // e2.j
    public void accept(Object obj) {
        j1 j1Var = (j1) this.c;
        Surface surface = (Surface) this.d;
        n1 n1Var = (n1) obj;
        ((f0) j1Var.a.get()).getClass();
        if (surface == null) {
            n1Var.T(null);
            j1Var.i = null;
        } else {
            i1 i1Var = new i1(surface, this.a, this.b);
            j1Var.i = i1Var;
            n1Var.T(i1Var);
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void d(float f7, float f10, int i10, View view) {
        ug.m1.R((ug.m1) this.c, this.a, (c6) this.d, this.b, view);
    }

    @Override // org.telegram.ui.Components.mu
    public void run(String str) {
        nu.k((nu) this.c, this.a, this.b, (Runnable) this.d, str);
    }

    public /* synthetic */ t0(nu nuVar, int i10, int i11, Runnable runnable) {
        this.c = nuVar;
        this.a = i10;
        this.b = i11;
        this.d = runnable;
    }

    public /* synthetic */ t0(ug.m1 m1Var, int i10, c6 c6Var, int i11) {
        this.c = m1Var;
        this.a = i10;
        this.d = c6Var;
        this.b = i11;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
