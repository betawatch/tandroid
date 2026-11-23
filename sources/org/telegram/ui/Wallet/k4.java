package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.Components.q80;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class k4 extends q80 {
    public final Paint M;
    public final /* synthetic */ m4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(m4 m4Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(h6Var);
        this.N = m4Var;
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override // org.telegram.ui.Components.q80
    public final void b(Canvas canvas, Path path) {
        super.b(canvas, path);
        m4 m4Var = this.N;
        RectF rectF = m4Var.f;
        if (m4Var.o0 != null) {
            canvas.saveLayer(rectF, null);
            m4Var.o0.c((org.telegram.messenger.g0.L(206.0f) - m4Var.o0.k()) / 2.0f, (rectF.bottom - org.telegram.messenger.g0.L(7.0f)) - m4Var.o0.i(), 1.0f, -1, canvas);
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
