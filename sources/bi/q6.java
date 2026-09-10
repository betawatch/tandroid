package bi;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class q6 implements og.v {
    public boolean a;
    public final /* synthetic */ og.x0 b;
    public final /* synthetic */ ad c;

    public q6(ad adVar, og.x0 x0Var) {
        this.c = adVar;
        this.b = x0Var;
    }

    @Override // og.v
    public final void a() {
        this.a = true;
    }

    @Override // og.v
    public final void b(Canvas canvas) {
        f7 f7Var = this.c.O0;
        Matrix matrix = f7Var.getMatrix();
        canvas.save();
        canvas.translate(f7Var.getX(), f7Var.getY());
        canvas.concat(matrix);
        f7Var.getWidth();
        throw null;
    }

    @Override // og.v
    public final boolean c() {
        return this.a;
    }

    @Override // og.v
    public final void d() {
        this.a = false;
    }

    @Override // og.v
    public final View e() {
        return this.c;
    }

    @Override // og.v
    public final FrameLayout f() {
        return this.c.V0;
    }

    @Override // og.v
    public final boolean g() {
        return false;
    }

    @Override // og.v
    public final void h(int i10) {
        ad adVar = this.c;
        adVar.I0(false);
        og.x0 x0Var = this.b;
        x0Var.h(i10, true);
        x0Var.g();
        adVar.setNewColor(i10);
        p6 p6Var = adVar.w1;
        p6Var.setSelectedColorIndex(x0Var.d());
        p6Var.getAdapter().l();
    }
}
