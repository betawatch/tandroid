package m4;

import android.view.Surface;
import android.view.View;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.ju;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements e2.j, iu, am0 {
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

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.am0
    public void e(float f7, float f10, int i10, View view) {
        vg.n1.Q((vg.n1) this.c, this.a, (u6) this.d, this.b, view, i10);
    }

    @Override // org.telegram.ui.Components.iu
    public void run(String str) {
        ju.k((ju) this.c, this.a, this.b, (Runnable) this.d, str);
    }

    public /* synthetic */ t0(ju juVar, int i10, int i11, Runnable runnable) {
        this.c = juVar;
        this.a = i10;
        this.b = i11;
        this.d = runnable;
    }

    public /* synthetic */ t0(vg.n1 n1Var, int i10, u6 u6Var, int i11) {
        this.c = n1Var;
        this.a = i10;
        this.d = u6Var;
        this.b = i11;
    }

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ void l0(View view, float f7, float f10) {
    }
}
