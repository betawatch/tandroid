package dg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ft0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class i0 implements cg.y {
    public boolean a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ ft0 c;

    public i0(ft0 ft0Var, Bitmap bitmap) {
        this.c = ft0Var;
        this.b = bitmap;
    }

    @Override // cg.y
    public final void a() {
        this.a = true;
    }

    @Override // cg.y
    public final void b(Canvas canvas) {
        s0 s0Var = this.c.T0;
        Matrix matrix = s0Var.getMatrix();
        canvas.save();
        canvas.translate(s0Var.getX(), s0Var.getY());
        canvas.concat(matrix);
        float width = s0Var.getWidth();
        Bitmap bitmap = this.b;
        canvas.scale(width / bitmap.getWidth(), s0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override // cg.y
    public final boolean c() {
        return this.a;
    }

    @Override // cg.y
    public final void d() {
        this.a = false;
    }

    @Override // cg.y
    public final View e() {
        return this.c;
    }

    @Override // cg.y
    public final FrameLayout f() {
        return this.c.b1;
    }

    @Override // cg.y
    public final boolean g() {
        return this.b != null;
    }

    @Override // cg.y
    public final void h(int i10) {
        ft0 ft0Var = this.c;
        ft0Var.w0(false);
        cg.f1 f1Var = ft0Var.S1;
        f1Var.h(i10, true);
        f1Var.g();
        ft0Var.setNewColor(i10);
        z0 z0Var = ft0Var.D1;
        z0Var.setSelectedColorIndex(f1Var.d());
        z0Var.getAdapter().l();
    }
}
