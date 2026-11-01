package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class h30 extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final /* synthetic */ a50 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h30(a50 a50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = a50Var;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a50 a50Var = this.e;
        i30 i30Var = a50Var.w1;
        float y3 = i30Var.getY() + i30Var.getMeasuredHeight();
        fe.f fVar = a50Var.s5;
        float f7 = y3 - fVar.f;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.a;
        rectF.set(0.0f, f7, measuredWidth, measuredHeight);
        float y10 = i30Var.getY() + i30Var.getMeasuredHeight();
        float measuredWidth2 = getMeasuredWidth();
        float measuredHeight2 = getMeasuredHeight();
        RectF rectF2 = this.b;
        rectF2.set(0.0f, y10, measuredWidth2, measuredHeight2);
        float y11 = (i30Var.getY() + i30Var.getMeasuredHeight()) - fVar.f;
        float measuredWidth3 = getMeasuredWidth();
        float y12 = i30Var.getY() + i30Var.getMeasuredHeight();
        RectF rectF3 = this.c;
        rectF3.set(0.0f, y11, measuredWidth3, y12);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i10 < 29 || a50Var.H4 == null || !canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF3, paint);
            paint.setColor(i0.b.k(234881023, -14933463));
            canvas.drawRect(rectF2, paint);
        } else {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f10 = a50Var.I4;
            canvas.scale(f10, f10);
            canvas.drawRenderNode(a50Var.H4);
            canvas.restore();
            paint.setColor(234881023);
            canvas.drawRect(rectF2, paint);
        }
        super.dispatchDraw(canvas);
    }
}
