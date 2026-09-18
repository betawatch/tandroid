package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class m40 extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final /* synthetic */ k60 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m40(k60 k60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = k60Var;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        k60 k60Var = this.e;
        n40 n40Var = k60Var.F;
        float y3 = n40Var.getY() + n40Var.getMeasuredHeight();
        le.e eVar = k60Var.B3;
        float f7 = y3 - eVar.e;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.a;
        rectF.set(0.0f, f7, measuredWidth, measuredHeight);
        float y10 = n40Var.getY() + n40Var.getMeasuredHeight();
        float measuredWidth2 = getMeasuredWidth();
        float measuredHeight2 = getMeasuredHeight();
        RectF rectF2 = this.b;
        rectF2.set(0.0f, y10, measuredWidth2, measuredHeight2);
        float y11 = (n40Var.getY() + n40Var.getMeasuredHeight()) - eVar.e;
        float measuredWidth3 = getMeasuredWidth();
        float y12 = n40Var.getY() + n40Var.getMeasuredHeight();
        RectF rectF3 = this.c;
        rectF3.set(0.0f, y11, measuredWidth3, y12);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i10 < 29 || k60Var.Q2 == null || !canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF3, paint);
            paint.setColor(i0.a.h(234881023, -14933463));
            canvas.drawRect(rectF2, paint);
        } else {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f10 = k60Var.R2;
            canvas.scale(f10, f10);
            canvas.drawRenderNode(k60Var.Q2);
            canvas.restore();
            paint.setColor(234881023);
            canvas.drawRect(rectF2, paint);
        }
        super.dispatchDraw(canvas);
    }
}
