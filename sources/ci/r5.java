package ci;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class r5 implements pg.u {
    public boolean a;
    public final /* synthetic */ pg.u0 b;
    public final /* synthetic */ nb c;

    public r5(nb nbVar, pg.u0 u0Var) {
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
        nbVar.I0(false);
        pg.u0 u0Var = this.b;
        u0Var.h(i10, true);
        u0Var.g();
        nbVar.setNewColor(i10);
        q5 q5Var = nbVar.w1;
        q5Var.setSelectedColorIndex(u0Var.d());
        q5Var.getAdapter().l();
    }
}
