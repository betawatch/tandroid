package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class j20 extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final /* synthetic */ c40 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j20(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = c40Var;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        c40 c40Var = this.e;
        k20 k20Var = c40Var.w1;
        float y10 = k20Var.getY() + k20Var.getMeasuredHeight();
        te.c cVar = c40Var.s5;
        float f10 = y10 - cVar.f;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.a;
        rectF.set(0.0f, f10, measuredWidth, measuredHeight);
        float y11 = k20Var.getY() + k20Var.getMeasuredHeight();
        float measuredWidth2 = getMeasuredWidth();
        float measuredHeight2 = getMeasuredHeight();
        RectF rectF2 = this.b;
        rectF2.set(0.0f, y11, measuredWidth2, measuredHeight2);
        float y12 = (k20Var.getY() + k20Var.getMeasuredHeight()) - cVar.f;
        float measuredWidth3 = getMeasuredWidth();
        float y13 = k20Var.getY() + k20Var.getMeasuredHeight();
        RectF rectF3 = this.c;
        rectF3.set(0.0f, y12, measuredWidth3, y13);
        int i7 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i7 < 29 || c40Var.H4 == null || !canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF3, paint);
            paint.setColor(i0.a.k(234881023, -14933463));
            canvas.drawRect(rectF2, paint);
        } else {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f11 = c40Var.I4;
            canvas.scale(f11, f11);
            canvas.drawRenderNode(c40Var.H4);
            canvas.restore();
            paint.setColor(234881023);
            canvas.drawRect(rectF2, paint);
        }
        super.dispatchDraw(canvas);
    }
}
