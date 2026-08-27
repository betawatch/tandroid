package lh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class h5 implements yf.u {
    public boolean a;
    public final /* synthetic */ yf.r0 b;
    public final /* synthetic */ va c;

    public h5(va vaVar, yf.r0 r0Var) {
        this.c = vaVar;
        this.b = r0Var;
    }

    @Override // yf.u
    public final void a() {
        this.a = true;
    }

    @Override // yf.u
    public final void b(Canvas canvas) {
        v5 v5Var = this.c.K0;
        Matrix matrix = v5Var.getMatrix();
        canvas.save();
        canvas.translate(v5Var.getX(), v5Var.getY());
        canvas.concat(matrix);
        v5Var.getWidth();
        throw null;
    }

    @Override // yf.u
    public final boolean c() {
        return this.a;
    }

    @Override // yf.u
    public final void d() {
        this.a = false;
    }

    @Override // yf.u
    public final View e() {
        return this.c;
    }

    @Override // yf.u
    public final FrameLayout f() {
        return this.c.R0;
    }

    @Override // yf.u
    public final boolean g() {
        return false;
    }

    @Override // yf.u
    public final void h(int i10) {
        va vaVar = this.c;
        vaVar.I0(false);
        yf.r0 r0Var = this.b;
        r0Var.h(i10, true);
        r0Var.g();
        vaVar.setNewColor(i10);
        g5 g5Var = vaVar.s1;
        g5Var.setSelectedColorIndex(r0Var.d());
        g5Var.getAdapter().l();
    }
}
