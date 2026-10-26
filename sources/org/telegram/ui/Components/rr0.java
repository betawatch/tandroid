package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class rr0 extends View implements org.telegram.ui.ActionBar.p6 {
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
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float f7 = 3.0f;
        int measuredWidth = (getMeasuredWidth() / 2) - AndroidUtilities.dp(3.0f);
        int dp = AndroidUtilities.dp(1.0f) + ((AndroidUtilities.dp(1.0f) + measuredWidth) * 7);
        ds dsVar = ds.g;
        float f10 = this.f;
        float interpolation = dsVar.getInterpolation(f10 > 0.4f ? (f10 - 0.4f) / 0.6f : 0.0f);
        float f11 = (this.n * interpolation) + ((1.0f - interpolation) * this.h);
        canvas.save();
        canvas.translate(0.0f, (-org.telegram.messenger.t.B(4.0f, getMeasuredHeight(), dp)) * f11);
        int i10 = 0;
        for (int i11 = 7; i10 < i11; i11 = 7) {
            int dp2 = ((AndroidUtilities.dp(1.0f) + measuredWidth) * i10) + AndroidUtilities.dp(f7);
            RectF rectF = AndroidUtilities.rectTmp;
            float f12 = dp2;
            float f13 = dp2 + measuredWidth;
            rectF.set(0.0f, f12, measuredWidth, f13);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint2);
            rectF.set(AndroidUtilities.dp(1.0f) + measuredWidth, f12, org.telegram.messenger.t.D(1.0f, measuredWidth, measuredWidth), f13);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint2);
            i10++;
            f7 = f7;
        }
        float f14 = f7;
        canvas.restore();
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(4.0f), this.d);
        canvas.translate(0.0f, getMeasuredHeight() - AndroidUtilities.dp(4.0f));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(4.0f), this.e);
        canvas.restore();
        float measuredHeight = ((getMeasuredHeight() - AndroidUtilities.dp(21.0f)) * f11) + AndroidUtilities.dp(f14);
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(getMeasuredWidth() - AndroidUtilities.dp(f14), measuredHeight, getMeasuredWidth(), AndroidUtilities.dp(15.0f) + measuredHeight);
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f), paint);
        float centerY = rectF2.centerY();
        float dp3 = AndroidUtilities.dp(0.5f) + measuredWidth;
        rectF2.set(dp3 - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(f14), dp3 + AndroidUtilities.dp(8.0f), centerY + AndroidUtilities.dp(f14));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(f14), AndroidUtilities.dp(f14), paint);
        float f15 = this.f + 0.016f;
        this.f = f15;
        if (f15 > 1.0f) {
            this.h = this.n;
            float j10 = org.telegram.ui.d3.j(this.a, 1001) / 1000.0f;
            this.n = j10;
            if (j10 > this.h) {
                this.n = j10 + 0.3f;
            } else {
                this.n = j10 - 0.3f;
            }
            this.n = Math.max(0.0f, Math.min(1.0f, this.n));
            this.f = 0.0f;
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            Paint paint = this.b;
            int i10 = org.telegram.ui.ActionBar.y6.pf;
            paint.setColor(i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i10, false), 76));
            this.c.setColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
