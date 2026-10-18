package m4;

import android.view.Surface;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.xl0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements e2.j, hu, xl0 {
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

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // e2.j
    public void accept(Object obj) {
        i1 i1Var = (i1) this.c;
        Surface surface = (Surface) this.d;
        m1 m1Var = (m1) obj;
        ((f0) i1Var.a.get()).getClass();
        if (surface == null) {
            m1Var.T(null);
            i1Var.i = null;
        } else {
            h1 h1Var = new h1(surface, this.a, this.b);
            i1Var.i = h1Var;
            m1Var.T(h1Var);
        }
    }

    @Override // org.telegram.ui.Components.xl0
    public void d(float f7, float f10, int i10, View view) {
        ug.m1.R((ug.m1) this.c, this.a, (d6) this.d, this.b, view, i10);
    }

    @Override // org.telegram.ui.Components.hu
    public void run(String str) {
        iu.k((iu) this.c, this.a, this.b, (Runnable) this.d, str);
    }

    public /* synthetic */ s0(iu iuVar, int i10, int i11, Runnable runnable) {
        this.c = iuVar;
        this.a = i10;
        this.b = i11;
        this.d = runnable;
    }

    public /* synthetic */ s0(ug.m1 m1Var, int i10, d6 d6Var, int i11) {
        this.c = m1Var;
        this.a = i10;
        this.d = d6Var;
        this.b = i11;
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
