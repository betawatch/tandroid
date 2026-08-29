package bg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ws0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class j0 implements ag.z {
    public boolean a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ ws0 c;

    public j0(ws0 ws0Var, Bitmap bitmap) {
        this.c = ws0Var;
        this.b = bitmap;
    }

    @Override // ag.z
    public final void a() {
        this.a = true;
    }

    @Override // ag.z
    public final void b(Canvas canvas) {
        t0 t0Var = this.c.S0;
        Matrix matrix = t0Var.getMatrix();
        canvas.save();
        canvas.translate(t0Var.getX(), t0Var.getY());
        canvas.concat(matrix);
        float width = t0Var.getWidth();
        Bitmap bitmap = this.b;
        canvas.scale(width / bitmap.getWidth(), t0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
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
        return this.c.a1;
    }

    @Override // ag.z
    public final boolean g() {
        return this.b != null;
    }

    @Override // ag.z
    public final void h(int i10) {
        ws0 ws0Var = this.c;
        ws0Var.w0(false);
        ag.h1 h1Var = ws0Var.R1;
        h1Var.h(i10, true);
        h1Var.g();
        ws0Var.setNewColor(i10);
        a1 a1Var = ws0Var.C1;
        a1Var.setSelectedColorIndex(h1Var.d());
        a1Var.getAdapter().l();
    }
}
