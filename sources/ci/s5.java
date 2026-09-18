package ci;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class s5 implements pg.u {
    public boolean a;
    public final /* synthetic */ pg.u0 b;
    public final /* synthetic */ qb c;

    public s5(qb qbVar, pg.u0 u0Var) {
        this.c = qbVar;
        this.b = u0Var;
    }

    @Override // pg.u
    public final void a() {
        this.a = true;
    }

    @Override // pg.u
    public final void b(Canvas canvas) {
        g6 g6Var = this.c.O0;
        Matrix matrix = g6Var.getMatrix();
        canvas.save();
        canvas.translate(g6Var.getX(), g6Var.getY());
        canvas.concat(matrix);
        g6Var.getWidth();
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
        qb qbVar = this.c;
        qbVar.I0(false);
        pg.u0 u0Var = this.b;
        u0Var.h(i10, true);
        u0Var.g();
        qbVar.setNewColor(i10);
        r5 r5Var = qbVar.w1;
        r5Var.setSelectedColorIndex(u0Var.d());
        r5Var.getAdapter().l();
    }
}
