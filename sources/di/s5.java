package di;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class s5 implements qg.u {
    public boolean a;
    public final /* synthetic */ qg.s0 b;
    public final /* synthetic */ rb c;

    public s5(rb rbVar, qg.s0 s0Var) {
        this.c = rbVar;
        this.b = s0Var;
    }

    @Override // qg.u
    public final void a() {
        this.a = true;
    }

    @Override // qg.u
    public final void b(Canvas canvas) {
        g6 g6Var = this.c.O0;
        Matrix matrix = g6Var.getMatrix();
        canvas.save();
        canvas.translate(g6Var.getX(), g6Var.getY());
        canvas.concat(matrix);
        g6Var.getWidth();
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
        rb rbVar = this.c;
        rbVar.I0(false);
        qg.s0 s0Var = this.b;
        s0Var.h(i10, true);
        s0Var.g();
        rbVar.setNewColor(i10);
        r5 r5Var = rbVar.w1;
        r5Var.setSelectedColorIndex(s0Var.d());
        r5Var.getAdapter().l();
    }
}
