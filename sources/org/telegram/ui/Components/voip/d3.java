package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import ci.f4;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class d3 extends f4 {
    public final Paint L0;
    public final q1 M0;

    public d3(Activity activity, int i10, q1 q1Var, boolean z10) {
        super(activity, i10);
        Paint paint = new Paint(1);
        this.L0 = paint;
        this.M0 = q1Var;
        q1Var.a(this);
        paint.setPathEffect(new CornerPathEffect(this.v));
        if (z10) {
            i();
        }
    }

    @Override // ci.f4
    public final void c(Canvas canvas, float f7) {
        q1 q1Var = this.M0;
        Shader shader = q1Var.b().getShader();
        Paint paint = this.L0;
        paint.setShader(shader);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (Math.min(this.F.getAlpha(), q1Var.b().getAlpha()) * f7), 31);
        Path path = this.t0;
        canvas.drawPath(path, paint);
        if (q1Var.e) {
            paint.setShader(((Paint) q1Var.d.a).getShader());
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    @Override // ci.f4, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        this.M0.d(getX(), getY());
        super.dispatchDraw(canvas);
    }
}
