package fi;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class g5 implements rg.v {
    public boolean a;
    public final /* synthetic */ rg.s0 b;
    public final /* synthetic */ ta c;

    public g5(ta taVar, rg.s0 s0Var) {
        this.c = taVar;
        this.b = s0Var;
    }

    @Override // rg.v
    public final void a() {
        this.a = true;
    }

    @Override // rg.v
    public final void b(Canvas canvas) {
        u5 u5Var = this.c.D0;
        Matrix matrix = u5Var.getMatrix();
        canvas.save();
        canvas.translate(u5Var.getX(), u5Var.getY());
        canvas.concat(matrix);
        u5Var.getWidth();
        throw null;
    }

    @Override // rg.v
    public final boolean c() {
        return this.a;
    }

    @Override // rg.v
    public final void d() {
        this.a = false;
    }

    @Override // rg.v
    public final View e() {
        return this.c;
    }

    @Override // rg.v
    public final FrameLayout f() {
        return this.c.K0;
    }

    @Override // rg.v
    public final boolean g() {
        return false;
    }

    @Override // rg.v
    public final void h(int i10) {
        ta taVar = this.c;
        taVar.F0(false);
        rg.s0 s0Var = this.b;
        s0Var.h(i10, true);
        s0Var.g();
        taVar.setNewColor(i10);
        f5 f5Var = taVar.l1;
        f5Var.setSelectedColorIndex(s0Var.d());
        f5Var.getAdapter().l();
    }
}
