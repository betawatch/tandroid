package kh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class i5 implements xf.u {
    public boolean a;
    public final /* synthetic */ xf.s0 b;
    public final /* synthetic */ ya c;

    public i5(ya yaVar, xf.s0 s0Var) {
        this.c = yaVar;
        this.b = s0Var;
    }

    @Override // xf.u
    public final void a() {
        this.a = true;
    }

    @Override // xf.u
    public final void b(Canvas canvas) {
        w5 w5Var = this.c.K0;
        Matrix matrix = w5Var.getMatrix();
        canvas.save();
        canvas.translate(w5Var.getX(), w5Var.getY());
        canvas.concat(matrix);
        w5Var.getWidth();
        throw null;
    }

    @Override // xf.u
    public final boolean c() {
        return this.a;
    }

    @Override // xf.u
    public final void d() {
        this.a = false;
    }

    @Override // xf.u
    public final View e() {
        return this.c;
    }

    @Override // xf.u
    public final FrameLayout f() {
        return this.c.R0;
    }

    @Override // xf.u
    public final boolean g() {
        return false;
    }

    @Override // xf.u
    public final void h(int i9) {
        ya yaVar = this.c;
        yaVar.I0(false);
        xf.s0 s0Var = this.b;
        s0Var.h(i9, true);
        s0Var.g();
        yaVar.setNewColor(i9);
        h5 h5Var = yaVar.s1;
        h5Var.setSelectedColorIndex(s0Var.d());
        h5Var.getAdapter().l();
    }
}
