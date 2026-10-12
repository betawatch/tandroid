package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ha0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class b3 extends ha0 {
    public final Paint M;
    public final /* synthetic */ d3 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(d3 d3Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(c6Var);
        this.N = d3Var;
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override // org.telegram.ui.Components.ha0
    public final void b(Canvas canvas, Path path) {
        super.b(canvas, path);
        d3 d3Var = this.N;
        RectF rectF = d3Var.f;
        if (d3Var.o0 != null) {
            canvas.saveLayer(rectF, null);
            d3Var.o0.c((AndroidUtilities.dp(206.0f) - d3Var.o0.l()) / 2.0f, (rectF.bottom - AndroidUtilities.dp(7.0f)) - d3Var.o0.j(), 1.0f, -1, canvas);
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
