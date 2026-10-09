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
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class o4 extends View {
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
    public float v;
    public float w;
    public float x;
    public ValueAnimator y;

    public o4(Context context, String str) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Path();
        this.c = new PathMeasure();
        this.e = new RectF();
        this.f = new float[2];
        this.h = new float[2];
        this.d = a1.g.t(new StringBuilder(), a5.k0(str.toUpperCase().replace('_', ' ').replace('-', ' ')), "   ·   ");
        paint.setColor(-16747826);
        paint.setTextSize(AndroidUtilities.dp(12.0f));
        paint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
    }

    public final void a() {
        if (!isAttachedToWindow() || this.w <= 0.0f) {
            return;
        }
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.w);
        this.y = ofFloat;
        ofFloat.setDuration(Math.max(1L, (long) ((this.w / AndroidUtilities.dp(24.0f)) * 1000.0f)));
        this.y.setInterpolator(new LinearInterpolator());
        this.y.setRepeatCount(-1);
        this.y.addUpdateListener(new s2(this, 2));
        this.y.start();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.y = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.r == null || this.v <= 0.0f || this.w <= 0.0f) {
            return;
        }
        int i10 = 0;
        float f7 = 0.0f;
        while (i10 < this.n.length()) {
            float f10 = this.r[i10] * this.s;
            float f11 = ((f10 / 2.0f) + f7) - this.x;
            float f12 = this.v;
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
                    canvas2.drawText(this.n, i10, i10 + 1, (-this.r[i10]) / 2.0f, AndroidUtilities.dp(3.0f), this.a);
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
        float dp = AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(266.0f);
        RectF rectF = this.e;
        rectF.set(((i10 - AndroidUtilities.dp(212.0f)) / 2.0f) - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f) - AndroidUtilities.dp(12.0f), ((AndroidUtilities.dp(212.0f) + i10) / 2.0f) + AndroidUtilities.dp(12.0f), dp);
        Path path = this.b;
        path.reset();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        PathMeasure pathMeasure = this.c;
        pathMeasure.setPath(path, true);
        this.v = pathMeasure.getLength();
        Paint paint = this.a;
        String str = this.d;
        int max = Math.max(1, Math.round(this.v / paint.measureText(str)));
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
        float f10 = this.v;
        this.s = f10 / f7;
        this.w = f10 / max;
        a();
    }
}
