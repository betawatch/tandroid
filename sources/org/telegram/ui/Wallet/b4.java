package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.Components.t80;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b4 extends t80 {
    public final Paint M;
    public final /* synthetic */ d4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(d4 d4Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(p6Var);
        this.N = d4Var;
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override // org.telegram.ui.Components.t80
    public final void b(Canvas canvas, Path path) {
        super.b(canvas, path);
        d4 d4Var = this.N;
        RectF rectF = d4Var.f;
        if (d4Var.o0 != null) {
            canvas.saveLayer(rectF, null);
            d4Var.o0.c((org.telegram.messenger.i0.L(206.0f) - d4Var.o0.k()) / 2.0f, (rectF.bottom - org.telegram.messenger.i0.L(7.0f)) - d4Var.o0.i(), 1.0f, -1, canvas);
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
