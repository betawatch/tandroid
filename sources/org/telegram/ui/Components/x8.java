package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class x8 extends View {
    public final w8 a;
    public vg.x0 b;
    public ly0 c;
    public Paint d;

    public x8(Context context, boolean z10) {
        super(context);
        this.a = new w8(this, z10);
    }

    public final void a(boolean z10) {
        this.a.a(z10, true);
    }

    public final void b(int i3, int i10, TLObject tLObject) {
        this.a.j(i3, i10, tLObject);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.e();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.f();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.g(canvas);
        if (this.c != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(getWidth() - org.telegram.messenger.g0.L(22.0f), getHeight() - org.telegram.messenger.g0.L(22.0f), getWidth() - org.telegram.messenger.g0.L(0.0f), getHeight() - org.telegram.messenger.g0.L(0.0f));
            this.b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + org.telegram.messenger.g0.L(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.b.f);
            this.c.c(rectF.centerX() - (this.c.c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        int measuredWidth = getMeasuredWidth();
        w8 w8Var = this.a;
        w8Var.p = measuredWidth;
        w8Var.o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i3) {
        this.a.h(i3);
    }

    public void setCentered(boolean z10) {
        this.a.l = z10;
    }

    public void setCount(int i3) {
        this.a.i(i3);
    }

    public void setDelegate(Runnable runnable) {
        this.a.j = runnable;
    }

    public void setSize(int i3) {
        this.a.s = i3;
    }

    public void setStepFactor(float f10) {
        this.a.t = f10;
    }

    public void setStyle(int i3) {
        w8 w8Var = this.a;
        w8Var.k = i3;
        w8Var.d();
    }
}
