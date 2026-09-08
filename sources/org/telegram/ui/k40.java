package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class k40 extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final /* synthetic */ j60 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k40(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = j60Var;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        j60 j60Var = this.e;
        l40 l40Var = j60Var.F;
        float y3 = l40Var.getY() + l40Var.getMeasuredHeight();
        le.e eVar = j60Var.B3;
        float f7 = y3 - eVar.e;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.a;
        rectF.set(0.0f, f7, measuredWidth, measuredHeight);
        float y10 = l40Var.getY() + l40Var.getMeasuredHeight();
        float measuredWidth2 = getMeasuredWidth();
        float measuredHeight2 = getMeasuredHeight();
        RectF rectF2 = this.b;
        rectF2.set(0.0f, y10, measuredWidth2, measuredHeight2);
        float y11 = (l40Var.getY() + l40Var.getMeasuredHeight()) - eVar.e;
        float measuredWidth3 = getMeasuredWidth();
        float y12 = l40Var.getY() + l40Var.getMeasuredHeight();
        RectF rectF3 = this.c;
        rectF3.set(0.0f, y11, measuredWidth3, y12);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i10 < 29 || j60Var.Q2 == null || !canvas.isHardwareAccelerated()) {
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
            float f10 = j60Var.R2;
            canvas.scale(f10, f10);
            canvas.drawRenderNode(j60Var.Q2);
            canvas.restore();
            paint.setColor(234881023);
            canvas.drawRect(rectF2, paint);
        }
        super.dispatchDraw(canvas);
    }
}
