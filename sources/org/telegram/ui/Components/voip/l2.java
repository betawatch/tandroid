package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class l2 extends vh.p2 {
    public final Paint L0;
    public final y0 M0;

    public l2(Activity activity, int i10, y0 y0Var, boolean z10) {
        super(activity, i10);
        Paint paint = new Paint(1);
        this.L0 = paint;
        this.M0 = y0Var;
        y0Var.a(this);
        paint.setPathEffect(new CornerPathEffect(this.w));
        if (z10) {
            i(true);
        }
    }

    @Override // vh.p2
    public final void c(Canvas canvas, float f7) {
        y0 y0Var = this.M0;
        Shader shader = y0Var.b().getShader();
        Paint paint = this.L0;
        paint.setShader(shader);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (Math.min(this.F.getAlpha(), y0Var.b().getAlpha()) * f7), 31);
        Path path = this.t0;
        canvas.drawPath(path, paint);
        if (y0Var.e) {
            paint.setShader(((Paint) y0Var.d.a).getShader());
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    @Override // vh.p2, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        this.M0.d(getX(), getY());
        super.dispatchDraw(canvas);
    }
}
