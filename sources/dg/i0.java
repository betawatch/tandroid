package dg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.mt0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class i0 implements cg.y {
    public boolean a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ mt0 c;

    public i0(mt0 mt0Var, Bitmap bitmap) {
        this.c = mt0Var;
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
        mt0 mt0Var = this.c;
        mt0Var.w0(false);
        cg.f1 f1Var = mt0Var.S1;
        f1Var.h(i10, true);
        f1Var.g();
        mt0Var.setNewColor(i10);
        z0 z0Var = mt0Var.D1;
        z0Var.setSelectedColorIndex(f1Var.d());
        z0Var.getAdapter().l();
    }
}
