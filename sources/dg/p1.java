package dg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.nr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.et0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class p1 implements cg.o1 {
    public final /* synthetic */ q1 a;

    public p1(q1 q1Var) {
        this.a = q1Var;
    }

    @Override // cg.o1
    public final void a() {
        q1 q1Var = this.a;
        q1Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new o1(q1Var, 0)).setInterpolator(nr.h);
    }

    @Override // cg.o1
    public final boolean d() {
        return true;
    }

    @Override // cg.o1
    public final void e() {
        q1 q1Var = this.a;
        q1Var.b.a.e();
        q1Var.w.setViewHidden(false);
        PhotoViewer photoViewer = ((et0) q1Var).H;
        Drawable[] drawableArr = PhotoViewer.Q8;
        photoViewer.X2(true, true);
    }

    @Override // cg.o1
    public final void f() {
        this.a.w.setViewHidden(true);
    }

    @Override // cg.o1
    public final /* synthetic */ void b() {
    }

    @Override // cg.o1
    public final void c() {
    }
}
