package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import ci.e4;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class e3 extends e4 {
    public final Paint L0;
    public final r1 M0;

    public e3(Activity activity, int i10, r1 r1Var, boolean z10) {
        super(activity, i10);
        Paint paint = new Paint(1);
        this.L0 = paint;
        this.M0 = r1Var;
        r1Var.a(this);
        paint.setPathEffect(new CornerPathEffect(this.v));
        if (z10) {
            i();
        }
    }

    @Override // ci.e4
    public final void c(Canvas canvas, float f7) {
        r1 r1Var = this.M0;
        Shader shader = r1Var.b().getShader();
        Paint paint = this.L0;
        paint.setShader(shader);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (Math.min(this.F.getAlpha(), r1Var.b().getAlpha()) * f7), 31);
        Path path = this.t0;
        canvas.drawPath(path, paint);
        if (r1Var.e) {
            paint.setShader(((Paint) r1Var.d.a).getShader());
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    @Override // ci.e4, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        this.M0.d(getX(), getY());
        super.dispatchDraw(canvas);
    }
}
