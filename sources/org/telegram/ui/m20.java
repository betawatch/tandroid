package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class m20 extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final /* synthetic */ f40 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m20(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = f40Var;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        f40 f40Var = this.e;
        n20 n20Var = f40Var.z1;
        float y10 = n20Var.getY() + n20Var.getMeasuredHeight();
        te.c cVar = f40Var.v5;
        float f10 = y10 - cVar.f;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.a;
        rectF.set(0.0f, f10, measuredWidth, measuredHeight);
        float y11 = n20Var.getY() + n20Var.getMeasuredHeight();
        float measuredWidth2 = getMeasuredWidth();
        float measuredHeight2 = getMeasuredHeight();
        RectF rectF2 = this.b;
        rectF2.set(0.0f, y11, measuredWidth2, measuredHeight2);
        float y12 = (n20Var.getY() + n20Var.getMeasuredHeight()) - cVar.f;
        float measuredWidth3 = getMeasuredWidth();
        float y13 = n20Var.getY() + n20Var.getMeasuredHeight();
        RectF rectF3 = this.c;
        rectF3.set(0.0f, y12, measuredWidth3, y13);
        int i7 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i7 < 29 || f40Var.K4 == null || !canvas.isHardwareAccelerated()) {
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
            float f11 = f40Var.L4;
            canvas.scale(f11, f11);
            canvas.drawRenderNode(f40Var.K4);
            canvas.restore();
            paint.setColor(234881023);
            canvas.drawRect(rectF2, paint);
        }
        super.dispatchDraw(canvas);
    }
}
