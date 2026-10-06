package ci;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class r5 implements pg.u {
    public boolean a;
    public final /* synthetic */ pg.u0 b;
    public final /* synthetic */ mb c;

    public r5(mb mbVar, pg.u0 u0Var) {
        this.c = mbVar;
        this.b = u0Var;
    }

    @Override // pg.u
    public final void a() {
        this.a = true;
    }

    @Override // pg.u
    public final void b(Canvas canvas) {
        f6 f6Var = this.c.O0;
        Matrix matrix = f6Var.getMatrix();
        canvas.save();
        canvas.translate(f6Var.getX(), f6Var.getY());
        canvas.concat(matrix);
        f6Var.getWidth();
        throw null;
    }

    @Override // pg.u
    public final boolean c() {
        return this.a;
    }

    @Override // pg.u
    public final void d() {
        this.a = false;
    }

    @Override // pg.u
    public final View e() {
        return this.c;
    }

    @Override // pg.u
    public final FrameLayout f() {
        return this.c.V0;
    }

    @Override // pg.u
    public final boolean g() {
        return false;
    }

    @Override // pg.u
    public final void h(int i10) {
        mb mbVar = this.c;
        mbVar.I0(false);
        pg.u0 u0Var = this.b;
        u0Var.h(i10, true);
        u0Var.g();
        mbVar.setNewColor(i10);
        q5 q5Var = mbVar.w1;
        q5Var.setSelectedColorIndex(u0Var.d());
        q5Var.getAdapter().l();
    }
}
