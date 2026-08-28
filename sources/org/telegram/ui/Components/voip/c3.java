package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import kh.x3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c3 extends x3 {
    public final Paint H0;
    public final n1 I0;

    public c3(Activity activity, int i9, n1 n1Var, boolean z10) {
        super(activity, i9);
        Paint paint = new Paint(1);
        this.H0 = paint;
        this.I0 = n1Var;
        n1Var.a(this);
        paint.setPathEffect(new CornerPathEffect(this.v));
        if (z10) {
            i();
        }
    }

    @Override // kh.x3
    public final void c(Canvas canvas, float f10) {
        n1 n1Var = this.I0;
        Shader shader = n1Var.b().getShader();
        Paint paint = this.H0;
        paint.setShader(shader);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (Math.min(this.B.getAlpha(), n1Var.b().getAlpha()) * f10), 31);
        Path path = this.p0;
        canvas.drawPath(path, paint);
        if (n1Var.e) {
            paint.setShader(((Paint) n1Var.d.a).getShader());
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    @Override // kh.x3, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        this.I0.d(getX(), getY());
        super.dispatchDraw(canvas);
    }
}
