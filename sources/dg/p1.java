package dg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.mr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.lt0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class p1 implements cg.o1 {
    public final /* synthetic */ q1 a;

    public p1(q1 q1Var) {
        this.a = q1Var;
    }

    @Override // cg.o1
    public final void a() {
        q1 q1Var = this.a;
        q1Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new o1(q1Var, 0)).setInterpolator(mr.h);
    }

    @Override // cg.o1
    public final boolean d() {
        return true;
    }

    @Override // cg.o1
    public final void e() {
        q1 q1Var = this.a;
        q1Var.b.a.g();
        q1Var.w.setViewHidden(false);
        PhotoViewer photoViewer = ((lt0) q1Var).H;
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
