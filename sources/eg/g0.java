package eg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.mt0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class g0 implements dg.y {
    public boolean a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ mt0 c;

    public g0(mt0 mt0Var, Bitmap bitmap) {
        this.c = mt0Var;
        this.b = bitmap;
    }

    @Override // dg.y
    public final void a() {
        this.a = true;
    }

    @Override // dg.y
    public final void b(Canvas canvas) {
        q0 q0Var = this.c.T0;
        Matrix matrix = q0Var.getMatrix();
        canvas.save();
        canvas.translate(q0Var.getX(), q0Var.getY());
        canvas.concat(matrix);
        float width = q0Var.getWidth();
        Bitmap bitmap = this.b;
        canvas.scale(width / bitmap.getWidth(), q0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override // dg.y
    public final boolean c() {
        return this.a;
    }

    @Override // dg.y
    public final void d() {
        this.a = false;
    }

    @Override // dg.y
    public final View e() {
        return this.c;
    }

    @Override // dg.y
    public final FrameLayout f() {
        return this.c.b1;
    }

    @Override // dg.y
    public final boolean g() {
        return this.b != null;
    }

    @Override // dg.y
    public final void h(int i10) {
        mt0 mt0Var = this.c;
        mt0Var.w0(false);
        dg.e1 e1Var = mt0Var.S1;
        e1Var.h(i10, true);
        e1Var.g();
        mt0Var.setNewColor(i10);
        x0 x0Var = mt0Var.D1;
        x0Var.setSelectedColorIndex(e1Var.d());
        x0Var.getAdapter().l();
    }
}
