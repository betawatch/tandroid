package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.Button;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ch0 extends Button {
    public final RectF a;
    public final Paint b;
    public boolean c;
    public float d;
    public long e;
    public int f;

    public ch0(Context context) {
        super(context);
        setAllCaps(false);
        setTextSize(1, 14.0f);
        setTypeface(org.telegram.messenger.i0.o());
        setOutlineProvider(null);
        w7.i6.a(this, 8.0f, 0.0f, 8.0f, 0.0f);
        int L = org.telegram.messenger.i0.L(60.0f);
        setMinWidth(L);
        setMinimumWidth(L);
        this.a = new RectF();
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
    }

    public final void a(boolean z10, boolean z11) {
        if (this.c != z10) {
            this.c = z10;
            if (!z11) {
                this.d = z10 ? 1.0f : 0.0f;
            }
            this.e = System.currentTimeMillis();
            invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c || this.d != 0.0f) {
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(11.0f);
            float f7 = measuredWidth;
            float L = org.telegram.messenger.i0.L(3.0f);
            float L2 = org.telegram.messenger.i0.L(8.0f) + measuredWidth;
            float L3 = org.telegram.messenger.i0.L(11.0f);
            RectF rectF = this.a;
            rectF.set(f7, L, L2, L3);
            int min = Math.min(org.telegram.messenger.zs.e4, (int) (this.d * 255.0f));
            Paint paint = this.b;
            paint.setAlpha(min);
            canvas.drawArc(rectF, this.f, 220.0f, false, paint);
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(this.e - System.currentTimeMillis()) < 1000) {
                long j10 = currentTimeMillis - this.e;
                int i10 = (int) (this.f + ((360 * j10) / 2000.0f));
                this.f = i10 - ((i10 / 360) * 360);
                if (this.c) {
                    float f10 = this.d;
                    if (f10 < 1.0f) {
                        float f11 = (j10 / 200.0f) + f10;
                        this.d = f11;
                        if (f11 > 1.0f) {
                            this.d = 1.0f;
                        }
                    }
                } else {
                    float f12 = this.d;
                    if (f12 > 0.0f) {
                        float f13 = f12 - (j10 / 200.0f);
                        this.d = f13;
                        if (f13 < 0.0f) {
                            this.d = 0.0f;
                        }
                    }
                }
            }
            this.e = currentTimeMillis;
            postInvalidateOnAnimation();
        }
    }

    public void setProgressColor(int i10) {
        this.b.setColor(i10);
    }
}
