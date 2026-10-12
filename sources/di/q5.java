package di;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class q5 implements qg.u {
    public boolean a;
    public final /* synthetic */ qg.s0 b;
    public final /* synthetic */ mb c;

    public q5(mb mbVar, qg.s0 s0Var) {
        this.c = mbVar;
        this.b = s0Var;
    }

    @Override // qg.u
    public final void a() {
        this.a = true;
    }

    @Override // qg.u
    public final void b(Canvas canvas) {
        e6 e6Var = this.c.O0;
        Matrix matrix = e6Var.getMatrix();
        canvas.save();
        canvas.translate(e6Var.getX(), e6Var.getY());
        canvas.concat(matrix);
        e6Var.getWidth();
        throw null;
    }

    @Override // qg.u
    public final boolean c() {
        return this.a;
    }

    @Override // qg.u
    public final void d() {
        this.a = false;
    }

    @Override // qg.u
    public final View e() {
        return this.c;
    }

    @Override // qg.u
    public final FrameLayout f() {
        return this.c.V0;
    }

    @Override // qg.u
    public final boolean g() {
        return false;
    }

    @Override // qg.u
    public final void h(int i10) {
        mb mbVar = this.c;
        mbVar.H0(false);
        qg.s0 s0Var = this.b;
        s0Var.h(i10, true);
        s0Var.g();
        mbVar.setNewColor(i10);
        p5 p5Var = mbVar.w1;
        p5Var.setSelectedColorIndex(s0Var.d());
        p5Var.getAdapter().l();
    }
}
