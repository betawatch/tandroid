package ci;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class q5 implements pg.u {
    public boolean a;
    public final /* synthetic */ pg.u0 b;
    public final /* synthetic */ nb c;

    public q5(nb nbVar, pg.u0 u0Var) {
        this.c = nbVar;
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
        nb nbVar = this.c;
        nbVar.H0(false);
        pg.u0 u0Var = this.b;
        u0Var.h(i10, true);
        u0Var.g();
        nbVar.setNewColor(i10);
        p5 p5Var = nbVar.w1;
        p5Var.setSelectedColorIndex(u0Var.d());
        p5Var.getAdapter().l();
    }
}
