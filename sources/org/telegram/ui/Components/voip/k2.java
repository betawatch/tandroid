package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k2 extends vh.p2 {
    public final Paint L0;
    public final x0 M0;

    public k2(Activity activity, int i10, x0 x0Var, boolean z10) {
        super(activity, i10);
        Paint paint = new Paint(1);
        this.L0 = paint;
        this.M0 = x0Var;
        x0Var.a(this);
        paint.setPathEffect(new CornerPathEffect(this.w));
        if (z10) {
            i(true);
        }
    }

    @Override // vh.p2
    public final void c(Canvas canvas, float f7) {
        x0 x0Var = this.M0;
        Shader shader = x0Var.b().getShader();
        Paint paint = this.L0;
        paint.setShader(shader);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (Math.min(this.F.getAlpha(), x0Var.b().getAlpha()) * f7), 31);
        Path path = this.t0;
        canvas.drawPath(path, paint);
        if (x0Var.e) {
            paint.setShader(((Paint) x0Var.d.a).getShader());
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
