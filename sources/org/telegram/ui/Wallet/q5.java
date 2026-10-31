package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q5 extends View {
    public ValueAnimator D;
    public final Paint a;
    public final Path b;
    public final PathMeasure c;
    public final String d;
    public final RectF e;
    public final float[] f;
    public final float[] h;
    public String n;
    public float[] r;
    public float s;
    public float w;
    public float x;
    public float y;

    public q5(Context context, String str) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Path();
        this.c = new PathMeasure();
        this.e = new RectF();
        this.f = new float[2];
        this.h = new float[2];
        this.d = a1.g.r(new StringBuilder(), b6.u0(str.toUpperCase().replace('_', ' ').replace('-', ' ')), "   ·   ");
        paint.setColor(-16747826);
        paint.setTextSize(org.telegram.messenger.i0.L(12.0f));
        paint.setTypeface(org.telegram.messenger.i0.o1("fonts/rmono.ttf"));
    }

    public final void a() {
        if (!isAttachedToWindow() || this.x <= 0.0f) {
            return;
        }
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.x);
        this.D = ofFloat;
        ofFloat.setDuration(Math.max(1L, (long) ((this.x / org.telegram.messenger.i0.L(24.0f)) * 1000.0f)));
        this.D.setInterpolator(new LinearInterpolator());
        this.D.setRepeatCount(-1);
        this.D.addUpdateListener(new r3(this, 1));
        this.D.start();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.D = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.r == null || this.w <= 0.0f || this.x <= 0.0f) {
            return;
        }
        int i10 = 0;
        float f7 = 0.0f;
        while (i10 < this.n.length()) {
            float f10 = this.r[i10] * this.s;
            float f11 = ((f10 / 2.0f) + f7) - this.y;
            float f12 = this.w;
            float f13 = f11 % f12;
            if (f13 < 0.0f) {
                f13 += f12;
            }
            if (this.n.charAt(i10) != ' ') {
                PathMeasure pathMeasure = this.c;
                float[] fArr = this.f;
                if (pathMeasure.getPosTan(f13, fArr, this.h)) {
                    canvas.save();
                    canvas.translate(fArr[0], fArr[1]);
                    canvas.rotate((float) Math.toDegrees(Math.atan2(r7[1], r7[0])));
                    canvas2 = canvas;
                    canvas2.drawText(this.n, i10, i10 + 1, (-this.r[i10]) / 2.0f, org.telegram.messenger.i0.L(3.0f), this.a);
                    canvas2.restore();
                    f7 += f10;
                    i10++;
                    canvas = canvas2;
                }
            }
            canvas2 = canvas;
            f7 += f10;
            i10++;
            canvas = canvas2;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float L = org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.L(266.0f);
        RectF rectF = this.e;
        rectF.set(((i10 - org.telegram.messenger.i0.L(212.0f)) / 2.0f) - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(22.0f) - org.telegram.messenger.i0.L(12.0f), ((org.telegram.messenger.i0.L(212.0f) + i10) / 2.0f) + org.telegram.messenger.i0.L(12.0f), L);
        Path path = this.b;
        path.reset();
        path.addRoundRect(rectF, org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(32.0f), Path.Direction.CW);
        PathMeasure pathMeasure = this.c;
        pathMeasure.setPath(path, true);
        this.w = pathMeasure.getLength();
        Paint paint = this.a;
        String str = this.d;
        int max = Math.max(1, Math.round(this.w / paint.measureText(str)));
        StringBuilder sb2 = new StringBuilder(str.length() * max);
        int i14 = 0;
        for (int i15 = 0; i15 < max; i15++) {
            sb2.append(str);
        }
        String sb3 = sb2.toString();
        this.n = sb3;
        this.r = new float[sb3.length()];
        float f7 = 0.0f;
        while (i14 < this.n.length()) {
            int i16 = i14 + 1;
            this.r[i14] = paint.measureText(this.n, i14, i16);
            f7 += this.r[i14];
            i14 = i16;
        }
        float f10 = this.w;
        this.s = f10 / f7;
        this.x = f10 / max;
        a();
    }
}
