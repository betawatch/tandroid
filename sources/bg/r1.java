package bg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.jr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.vs0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r1 implements ag.s1 {
    public final /* synthetic */ s1 a;

    public r1(s1 s1Var) {
        this.a = s1Var;
    }

    @Override // ag.s1
    public final void a() {
        s1 s1Var = this.a;
        s1Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new q1(s1Var, 0)).setInterpolator(jr.h);
    }

    @Override // ag.s1
    public final boolean d() {
        return true;
    }

    @Override // ag.s1
    public final void e() {
        s1 s1Var = this.a;
        s1Var.b.a.e();
        s1Var.w.setViewHidden(false);
        PhotoViewer photoViewer = ((vs0) s1Var).G;
        Drawable[] drawableArr = PhotoViewer.P8;
        photoViewer.X2(true, true);
    }

    @Override // ag.s1
    public final void f() {
        this.a.w.setViewHidden(true);
    }

    @Override // ag.s1
    public final /* synthetic */ void b() {
    }

    @Override // ag.s1
    public final void c() {
    }
}
