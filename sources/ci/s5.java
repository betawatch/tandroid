package ci;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class s5 implements pg.u {
    public boolean a;
    public final /* synthetic */ pg.s0 b;
    public final /* synthetic */ qb c;

    public s5(qb qbVar, pg.s0 s0Var) {
        this.c = qbVar;
        this.b = s0Var;
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
        pg.s0 s0Var = this.b;
        s0Var.h(i10, true);
        s0Var.g();
        qbVar.setNewColor(i10);
        r5 r5Var = qbVar.w1;
        r5Var.setSelectedColorIndex(s0Var.d());
        r5Var.getAdapter().l();
    }
}
