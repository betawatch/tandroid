package eg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.pr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.gt0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class n1 implements dg.n1 {
    public final /* synthetic */ o1 a;

    public n1(o1 o1Var) {
        this.a = o1Var;
    }

    @Override // dg.n1
    public final void a() {
        o1 o1Var = this.a;
        o1Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new m1(o1Var, 0)).setInterpolator(pr.h);
    }

    @Override // dg.n1
    public final boolean d() {
        return true;
    }

    @Override // dg.n1
    public final void e() {
        o1 o1Var = this.a;
        o1Var.b.a.e();
        o1Var.w.setViewHidden(false);
        PhotoViewer photoViewer = ((gt0) o1Var).H;
        Drawable[] drawableArr = PhotoViewer.Q8;
        photoViewer.X2(true, true);
    }

    @Override // dg.n1
    public final void f() {
        this.a.w.setViewHidden(true);
    }

    @Override // dg.n1
    public final /* synthetic */ void b() {
    }

    @Override // dg.n1
    public final void c() {
    }
}
