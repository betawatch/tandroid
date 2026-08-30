package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ei0 extends Button {
    public final RectF a;
    public final Paint b;
    public boolean c;
    public float d;
    public long e;
    public int f;

    public ei0(Context context) {
        super(context);
        setAllCaps(false);
        setTextSize(1, 14.0f);
        setTypeface(AndroidUtilities.bold());
        setOutlineProvider(null);
        k7.h6.a(this, 8.0f, 0.0f, 8.0f, 0.0f);
        int dp = AndroidUtilities.dp(60.0f);
        setMinWidth(dp);
        setMinimumWidth(dp);
        this.a = new RectF();
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public final void a(boolean z4, boolean z10) {
        if (this.c != z4) {
            this.c = z4;
            if (!z10) {
                this.d = z4 ? 1.0f : 0.0f;
            }
            this.e = System.currentTimeMillis();
            invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c || this.d != 0.0f) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(11.0f);
            float f10 = measuredWidth;
            float dp = AndroidUtilities.dp(3.0f);
            float dp2 = AndroidUtilities.dp(8.0f) + measuredWidth;
            float dp3 = AndroidUtilities.dp(11.0f);
            RectF rectF = this.a;
            rectF.set(f10, dp, dp2, dp3);
            int min = Math.min(255, (int) (this.d * 255.0f));
            Paint paint = this.b;
            paint.setAlpha(min);
            canvas.drawArc(rectF, this.f, 220.0f, false, paint);
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(this.e - System.currentTimeMillis()) < 1000) {
                long j10 = currentTimeMillis - this.e;
                int i10 = (int) (this.f + ((360 * j10) / 2000.0f));
                this.f = i10 - ((i10 / 360) * 360);
                if (this.c) {
                    float f11 = this.d;
                    if (f11 < 1.0f) {
                        float f12 = (j10 / 200.0f) + f11;
                        this.d = f12;
                        if (f12 > 1.0f) {
                            this.d = 1.0f;
                        }
                    }
                } else {
                    float f13 = this.d;
                    if (f13 > 0.0f) {
                        float f14 = f13 - (j10 / 200.0f);
                        this.d = f14;
                        if (f14 < 0.0f) {
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
