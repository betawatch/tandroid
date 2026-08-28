package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ka extends View {
    public final Paint a;
    public float b;
    public int c;
    public int d;
    public final RectF e;
    public final m2.g f;
    public final int h;
    public int n;
    public int r;

    public ka(Context context, m2.g gVar, int i9) {
        super(context);
        this.a = new Paint(1);
        new DecelerateInterpolator();
        this.e = new RectF();
        this.n = -1;
        this.r = -1;
        this.f = gVar;
        this.h = i9;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF;
        AndroidUtilities.dp(5.0f);
        int i9 = this.n;
        Paint paint = this.a;
        if (i9 >= 0) {
            paint.setColor((org.telegram.ui.ActionBar.f6.w0(null, i9, false) & 16777215) | (-1275068416));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.f6.A0().q() ? -11184811 : -4473925);
        }
        this.d = this.f.getCurrentItem();
        int i10 = 0;
        while (true) {
            int i11 = this.h;
            rectF = this.e;
            if (i10 >= i11) {
                break;
            }
            if (i10 != this.d) {
                rectF.set(AndroidUtilities.dp(11.0f) * i10, 0.0f, AndroidUtilities.dp(5.0f) + r5, AndroidUtilities.dp(5.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.5f), AndroidUtilities.dp(2.5f), paint);
            }
            i10++;
        }
        int i12 = this.r;
        if (i12 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        } else {
            paint.setColor(-14509328);
        }
        int dp = AndroidUtilities.dp(11.0f) * this.d;
        if (this.b == 0.0f) {
            rectF.set(dp, 0.0f, AndroidUtilities.dp(5.0f) + dp, AndroidUtilities.dp(5.0f));
        } else if (this.c >= this.d) {
            rectF.set(dp, 0.0f, (AndroidUtilities.dp(11.0f) * this.b) + AndroidUtilities.dp(5.0f) + dp, AndroidUtilities.dp(5.0f));
        } else {
            rectF.set(j3.r0.C(1.0f, this.b, AndroidUtilities.dp(11.0f), dp), 0.0f, AndroidUtilities.dp(5.0f) + dp, AndroidUtilities.dp(5.0f));
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.5f), AndroidUtilities.dp(2.5f), paint);
    }

    public void setCurrentPage(int i9) {
        this.d = i9;
        invalidate();
    }
}
