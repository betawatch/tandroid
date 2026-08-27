package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class b9 extends View {
    public final a9 a;
    public ag.i2 b;
    public pz0 c;
    public Paint d;

    public b9(Context context, boolean z10) {
        super(context);
        this.a = new a9(this, z10);
    }

    public final void a(boolean z10) {
        this.a.b(z10, true);
    }

    public final void b(int i10, TLObject tLObject, int i11) {
        this.a.l(i10, tLObject, i11);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.g();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.h();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.i(canvas);
        if (this.c != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(22.0f), getHeight() - AndroidUtilities.dp(22.0f), getWidth() - AndroidUtilities.dp(0.0f), getHeight() - AndroidUtilities.dp(0.0f));
            this.b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + AndroidUtilities.dp(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.b.f);
            this.c.c(rectF.centerX() - (this.c.c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        a9 a9Var = this.a;
        a9Var.p = measuredWidth;
        a9Var.o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i10) {
        this.a.j(i10);
    }

    public void setCentered(boolean z10) {
        this.a.l = z10;
    }

    public void setCount(int i10) {
        this.a.k(i10);
    }

    public void setDelegate(Runnable runnable) {
        this.a.j = runnable;
    }

    public void setSize(int i10) {
        this.a.s = i10;
    }

    public void setStepFactor(float f10) {
        this.a.t = f10;
    }

    public void setStyle(int i10) {
        a9 a9Var = this.a;
        a9Var.k = i10;
        a9Var.f();
    }
}
