package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import java.util.Random;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ro0 extends View implements org.telegram.ui.ActionBar.b6 {
    public Random a;
    public Paint b;
    public Paint c;
    public Paint d;
    public Paint e;
    public float f;
    public float h;
    public float n;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.c;
        Paint paint2 = this.b;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.messenger.qs.e4, 31);
        float f10 = 3.0f;
        int measuredWidth = (getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(3.0f);
        int L = org.telegram.messenger.g0.L(1.0f) + ((org.telegram.messenger.g0.L(1.0f) + measuredWidth) * 7);
        xq xqVar = xq.g;
        float f11 = this.f;
        float interpolation = xqVar.getInterpolation(f11 > 0.4f ? (f11 - 0.4f) / 0.6f : 0.0f);
        float f12 = (this.n * interpolation) + ((1.0f - interpolation) * this.h);
        canvas.save();
        canvas.translate(0.0f, (-org.telegram.messenger.k5.B(4.0f, getMeasuredHeight(), L)) * f12);
        int i7 = 0;
        for (int i10 = 7; i7 < i10; i10 = 7) {
            int L2 = ((org.telegram.messenger.g0.L(1.0f) + measuredWidth) * i7) + org.telegram.messenger.g0.L(f10);
            RectF rectF = org.telegram.messenger.g0.P;
            float f13 = L2;
            float f14 = L2 + measuredWidth;
            rectF.set(0.0f, f13, measuredWidth, f14);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), paint2);
            rectF.set(org.telegram.messenger.g0.L(1.0f) + measuredWidth, f13, org.telegram.messenger.k5.C(1.0f, measuredWidth, measuredWidth), f14);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), paint2);
            i7++;
            f10 = f10;
        }
        float f15 = f10;
        canvas.restore();
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.g0.L(4.0f), this.d);
        canvas.translate(0.0f, getMeasuredHeight() - org.telegram.messenger.g0.L(4.0f));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.g0.L(4.0f), this.e);
        canvas.restore();
        float measuredHeight = ((getMeasuredHeight() - org.telegram.messenger.g0.L(21.0f)) * f12) + org.telegram.messenger.g0.L(f15);
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(getMeasuredWidth() - org.telegram.messenger.g0.L(f15), measuredHeight, getMeasuredWidth(), org.telegram.messenger.g0.L(15.0f) + measuredHeight);
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(1.5f), org.telegram.messenger.g0.L(1.5f), paint);
        float centerY = rectF2.centerY();
        float L3 = org.telegram.messenger.g0.L(0.5f) + measuredWidth;
        rectF2.set(L3 - org.telegram.messenger.g0.L(8.0f), centerY - org.telegram.messenger.g0.L(f15), L3 + org.telegram.messenger.g0.L(8.0f), centerY + org.telegram.messenger.g0.L(f15));
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(f15), paint);
        float f16 = this.f + 0.016f;
        this.f = f16;
        if (f16 > 1.0f) {
            this.h = this.n;
            float abs = Math.abs(this.a.nextInt() % 1001) / 1000.0f;
            this.n = abs;
            if (abs > this.h) {
                this.n = abs + 0.3f;
            } else {
                this.n = abs - 0.3f;
            }
            this.n = Math.max(0.0f, Math.min(1.0f, this.n));
            this.f = 0.0f;
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            Paint paint = this.b;
            int i7 = org.telegram.ui.ActionBar.l6.dg;
            paint.setColor(i0.a.o(org.telegram.ui.ActionBar.l6.x0(null, i7, false), 76));
            this.c.setColor(org.telegram.ui.ActionBar.l6.x0(null, i7, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
