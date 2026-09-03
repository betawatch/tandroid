package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e3 extends qh.e3 {
    public final Paint I0;
    public final o1 J0;

    public e3(Activity activity, int i10, o1 o1Var, boolean z4) {
        super(activity, i10);
        Paint paint = new Paint(1);
        this.I0 = paint;
        this.J0 = o1Var;
        o1Var.a(this);
        paint.setPathEffect(new CornerPathEffect(this.v));
        if (z4) {
            i();
        }
    }

    @Override // qh.e3
    public final void c(Canvas canvas, float f10) {
        o1 o1Var = this.J0;
        Shader shader = o1Var.b().getShader();
        Paint paint = this.I0;
        paint.setShader(shader);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (Math.min(this.C.getAlpha(), o1Var.b().getAlpha()) * f10), 31);
        Path path = this.q0;
        canvas.drawPath(path, paint);
        if (o1Var.e) {
            paint.setShader(((Paint) o1Var.d.a).getShader());
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    @Override // qh.e3, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        this.J0.d(getX(), getY());
        super.dispatchDraw(canvas);
    }
}
