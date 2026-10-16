package m4;

import android.view.Surface;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.nu;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements e2.j, mu, bm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s0(i1 i1Var, Surface surface, int i10, int i11) {
        this.c = i1Var;
        this.d = surface;
        this.a = i10;
        this.b = i11;
    }

    @Override // e2.j
    public void accept(Object obj) {
        i1 i1Var = (i1) this.c;
        Surface surface = (Surface) this.d;
        m1 m1Var = (m1) obj;
        ((e0) i1Var.a.get()).getClass();
        if (surface == null) {
            m1Var.T(null);
            i1Var.i = null;
        } else {
            h1 h1Var = new h1(surface, this.a, this.b);
            i1Var.i = h1Var;
            m1Var.T(h1Var);
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

    public /* synthetic */ s0(nu nuVar, int i10, int i11, Runnable runnable) {
        this.c = nuVar;
        this.a = i10;
        this.b = i11;
        this.d = runnable;
    }

    public /* synthetic */ s0(ug.m1 m1Var, int i10, c6 c6Var, int i11) {
        this.c = m1Var;
        this.a = i10;
        this.d = c6Var;
        this.b = i11;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
