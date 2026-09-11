package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class xh0 extends Button {
    public final RectF a;
    public final Paint b;
    public boolean c;
    public float d;
    public long e;
    public int f;

    public xh0(Context context) {
        super(context);
        setAllCaps(false);
        setTextSize(1, 14.0f);
        setTypeface(AndroidUtilities.bold());
        setOutlineProvider(null);
        w7.d6.a(this, 8.0f, 0.0f, 8.0f, 0.0f);
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
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(11.0f);
            float f7 = measuredWidth;
            float dp = AndroidUtilities.dp(3.0f);
            float dp2 = AndroidUtilities.dp(8.0f) + measuredWidth;
            float dp3 = AndroidUtilities.dp(11.0f);
            RectF rectF = this.a;
            rectF.set(f7, dp, dp2, dp3);
            int min = Math.min(255, (int) (this.d * 255.0f));
            Paint paint = this.b;
            paint.setAlpha(min);
            canvas.drawArc(rectF, this.f, 220.0f, false, paint);
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(this.e - System.currentTimeMillis()) < 1000) {
                long j3 = currentTimeMillis - this.e;
                int i10 = (int) (this.f + ((360 * j3) / 2000.0f));
                this.f = i10 - ((i10 / 360) * 360);
                if (this.c) {
                    float f10 = this.d;
                    if (f10 < 1.0f) {
                        float f11 = (j3 / 200.0f) + f10;
                        this.d = f11;
                        if (f11 > 1.0f) {
                            this.d = 1.0f;
                        }
                    }
                } else {
                    float f12 = this.d;
                    if (f12 > 0.0f) {
                        float f13 = f12 - (j3 / 200.0f);
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
