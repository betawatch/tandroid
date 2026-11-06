package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ch0 extends View implements org.telegram.ui.ActionBar.a6 {
    public final Paint a;
    public final Paint b;
    public final org.telegram.ui.Components.w5 c;
    public final org.telegram.ui.Components.i6 d;
    public int e;
    public float f;
    public ValueAnimator h;

    public ch0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.c = new org.telegram.ui.Components.w5(this, 0L, 320L, xqVar);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true);
        this.d = i6Var;
        this.f = 1.0f;
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false));
        paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(4.0f));
        i6Var.setCallback(this);
        i6Var.n(0.35f, 200L, xqVar);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = i6Var.a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(org.telegram.messenger.g0.L(0.24f));
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        i6Var.w(org.telegram.messenger.g0.L(13.3f));
        i6Var.u(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false));
        i6Var.M = org.telegram.messenger.g0.L(64.0f);
        i6Var.b = 1;
    }

    public final boolean a(int i7) {
        int i10 = this.e;
        if (i10 != i7) {
            r1 = i10 < i7;
            this.e = i7;
            String str = "";
            if (i7 > 0) {
                str = "" + this.e;
            }
            this.d.t(str, true, true);
            if (r1) {
                ValueAnimator valueAnimator = this.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.h = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.h = ofFloat;
                ofFloat.addUpdateListener(new a3(this, 16));
                this.h.addListener(new d30(this, 6));
                org.telegram.messenger.camera.q.i(2.0f, this.h);
                this.h.setDuration(200L);
                this.h.start();
            }
        }
        return r1;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float e10 = this.c.e(false, this.e > 0 ? 1.0f : 0.0f);
        canvas.save();
        float f10 = this.f;
        canvas.scale(f10 * e10, f10 * e10, getWidth() / 2.0f, getHeight() / 2.0f);
        org.telegram.ui.Components.i6 i6Var = this.d;
        float N = org.telegram.messenger.g0.N(12.66f) + i6Var.c();
        float N2 = org.telegram.messenger.g0.N(20.3f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - N) / 2.0f, (getHeight() - N2) / 2.0f, (getWidth() + N) / 2.0f, (getHeight() + N2) / 2.0f);
        int i7 = (int) (e10 * 255.0f);
        Paint paint = this.b;
        paint.setAlpha(i7);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f), paint);
        Paint paint2 = this.a;
        paint2.setAlpha(i7);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f), paint2);
        canvas.save();
        canvas.translate(0.0f, -org.telegram.messenger.g0.L(1.0f));
        i6Var.setBounds(0, 0, getWidth(), getHeight());
        i6Var.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            this.a.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false));
            this.b.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.d || super.verifyDrawable(drawable);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
