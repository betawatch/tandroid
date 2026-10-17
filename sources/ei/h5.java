package ei;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class h5 implements qg.v {
    public boolean a;
    public final /* synthetic */ qg.u0 b;
    public final /* synthetic */ xa c;

    public h5(xa xaVar, qg.u0 u0Var) {
        this.c = xaVar;
        this.b = u0Var;
    }

    @Override // qg.v
    public final void a() {
        this.a = true;
    }

    @Override // qg.v
    public final void b(Canvas canvas) {
        v5 v5Var = this.c.O0;
        Matrix matrix = v5Var.getMatrix();
        canvas.save();
        canvas.translate(v5Var.getX(), v5Var.getY());
        canvas.concat(matrix);
        v5Var.getWidth();
        throw null;
    }

    @Override // qg.v
    public final boolean c() {
        return this.a;
    }

    @Override // qg.v
    public final void d() {
        this.a = false;
    }

    @Override // qg.v
    public final View e() {
        return this.c;
    }

    @Override // qg.v
    public final FrameLayout f() {
        return this.c.V0;
    }

    @Override // qg.v
    public final boolean g() {
        return false;
    }

    @Override // qg.v
    public final void h(int i10) {
        xa xaVar = this.c;
        xaVar.H0(false);
        qg.u0 u0Var = this.b;
        u0Var.h(i10, true);
        u0Var.g();
        xaVar.setNewColor(i10);
        g5 g5Var = xaVar.w1;
        g5Var.setSelectedColorIndex(u0Var.d());
        g5Var.getAdapter().l();
    }
}
