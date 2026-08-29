package nh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class y4 implements ag.z {
    public boolean a;
    public final /* synthetic */ ag.h1 b;
    public final /* synthetic */ ja c;

    public y4(ja jaVar, ag.h1 h1Var) {
        this.c = jaVar;
        this.b = h1Var;
    }

    @Override // ag.z
    public final void a() {
        this.a = true;
    }

    @Override // ag.z
    public final void b(Canvas canvas) {
        j5 j5Var = this.c.K0;
        Matrix matrix = j5Var.getMatrix();
        canvas.save();
        canvas.translate(j5Var.getX(), j5Var.getY());
        canvas.concat(matrix);
        j5Var.getWidth();
        throw null;
    }

    @Override // ag.z
    public final boolean c() {
        return this.a;
    }

    @Override // ag.z
    public final void d() {
        this.a = false;
    }

    @Override // ag.z
    public final View e() {
        return this.c;
    }

    @Override // ag.z
    public final FrameLayout f() {
        return this.c.R0;
    }

    @Override // ag.z
    public final boolean g() {
        return false;
    }

    @Override // ag.z
    public final void h(int i10) {
        ja jaVar = this.c;
        jaVar.I0(false);
        ag.h1 h1Var = this.b;
        h1Var.h(i10, true);
        h1Var.g();
        jaVar.setNewColor(i10);
        x4 x4Var = jaVar.s1;
        x4Var.setSelectedColorIndex(h1Var.d());
        x4Var.getAdapter().l();
    }
}
