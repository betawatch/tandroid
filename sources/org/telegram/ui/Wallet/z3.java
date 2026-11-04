package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.Components.w70;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class z3 extends w70 {
    public final Paint M;
    public final /* synthetic */ b4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(b4 b4Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(e6Var);
        this.N = b4Var;
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override // org.telegram.ui.Components.w70
    public final void b(Canvas canvas, Path path) {
        super.b(canvas, path);
        b4 b4Var = this.N;
        RectF rectF = b4Var.f;
        if (b4Var.o0 != null) {
            canvas.saveLayer(rectF, null);
            b4Var.o0.c((org.telegram.messenger.g0.L(206.0f) - b4Var.o0.k()) / 2.0f, (rectF.bottom - org.telegram.messenger.g0.L(7.0f)) - b4Var.o0.i(), 1.0f, -1, canvas);
            Shader shader = this.x.getShader();
            Paint paint = this.M;
            paint.setShader(shader);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.N.a.invalidate();
    }
}
