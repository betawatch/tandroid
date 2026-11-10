package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class y8 extends View {
    public final x8 a;
    public ug.y0 b;
    public my0 c;
    public Paint d;

    public y8(Context context, boolean z9) {
        super(context);
        this.a = new x8(this, z9);
    }

    public final void a(boolean z9) {
        this.a.a(z9, true);
    }

    public final void b(int i7, int i10, TLObject tLObject) {
        this.a.j(i7, i10, tLObject);
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
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int measuredWidth = getMeasuredWidth();
        x8 x8Var = this.a;
        x8Var.p = measuredWidth;
        x8Var.o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i7) {
        this.a.h(i7);
    }

    public void setCentered(boolean z9) {
        this.a.l = z9;
    }

    public void setCount(int i7) {
        this.a.i(i7);
    }

    public void setDelegate(Runnable runnable) {
        this.a.j = runnable;
    }

    public void setSize(int i7) {
        this.a.s = i7;
    }

    public void setStepFactor(float f10) {
        this.a.t = f10;
    }

    public void setStyle(int i7) {
        x8 x8Var = this.a;
        x8Var.k = i7;
        x8Var.d();
    }
}
