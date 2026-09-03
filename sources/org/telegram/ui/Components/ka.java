package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ka extends View {
    public final Paint a;
    public float b;
    public int c;
    public int d;
    public final RectF e;
    public final m2.h f;
    public final int h;
    public int n;
    public int r;

    public ka(Context context, m2.h hVar, int i10) {
        super(context);
        this.a = new Paint(1);
        new DecelerateInterpolator();
        this.e = new RectF();
        this.n = -1;
        this.r = -1;
        this.f = hVar;
        this.h = i10;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF;
        AndroidUtilities.dp(5.0f);
        int i10 = this.n;
        Paint paint = this.a;
        if (i10 >= 0) {
            paint.setColor((org.telegram.ui.ActionBar.j6.w0(null, i10, false) & 16777215) | (-1275068416));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.j6.A0().q() ? -11184811 : -4473925);
        }
        this.d = this.f.getCurrentItem();
        int i11 = 0;
        while (true) {
            int i12 = this.h;
            rectF = this.e;
            if (i11 >= i12) {
                break;
            }
            if (i11 != this.d) {
                rectF.set(AndroidUtilities.dp(11.0f) * i11, 0.0f, AndroidUtilities.dp(5.0f) + r5, AndroidUtilities.dp(5.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.5f), AndroidUtilities.dp(2.5f), paint);
            }
            i11++;
        }
        int i13 = this.r;
        if (i13 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        } else {
            paint.setColor(-14509328);
        }
        int dp = AndroidUtilities.dp(11.0f) * this.d;
        if (this.b == 0.0f) {
            rectF.set(dp, 0.0f, AndroidUtilities.dp(5.0f) + dp, AndroidUtilities.dp(5.0f));
        } else if (this.c >= this.d) {
            rectF.set(dp, 0.0f, (AndroidUtilities.dp(11.0f) * this.b) + AndroidUtilities.dp(5.0f) + dp, AndroidUtilities.dp(5.0f));
        } else {
            rectF.set(org.telegram.ui.ai.c(1.0f, this.b, AndroidUtilities.dp(11.0f), dp), 0.0f, AndroidUtilities.dp(5.0f) + dp, AndroidUtilities.dp(5.0f));
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.5f), AndroidUtilities.dp(2.5f), paint);
    }

    public void setCurrentPage(int i10) {
        this.d = i10;
        invalidate();
    }
}
