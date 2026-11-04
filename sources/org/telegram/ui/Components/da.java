package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class da extends View {
    public final Paint a;
    public float b;
    public int c;
    public int d;
    public final RectF e;
    public final b5.l f;
    public final int h;
    public int n;
    public int r;

    public da(Context context, b5.l lVar, int i3) {
        super(context);
        this.a = new Paint(1);
        new DecelerateInterpolator();
        this.e = new RectF();
        this.n = -1;
        this.r = -1;
        this.f = lVar;
        this.h = i3;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF;
        org.telegram.messenger.g0.L(5.0f);
        int i3 = this.n;
        Paint paint = this.a;
        if (i3 >= 0) {
            paint.setColor((org.telegram.ui.ActionBar.k6.x0(null, i3, false) & 16777215) | (-1275068416));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.k6.D0().q() ? -11184811 : -4473925);
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
                rectF.set(org.telegram.messenger.g0.L(11.0f) * i10, 0.0f, org.telegram.messenger.g0.L(5.0f) + r5, org.telegram.messenger.g0.L(5.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.5f), org.telegram.messenger.g0.L(2.5f), paint);
            }
            i10++;
        }
        int i12 = this.r;
        if (i12 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        } else {
            paint.setColor(-14509328);
        }
        int L = org.telegram.messenger.g0.L(11.0f) * this.d;
        if (this.b == 0.0f) {
            rectF.set(L, 0.0f, org.telegram.messenger.g0.L(5.0f) + L, org.telegram.messenger.g0.L(5.0f));
        } else if (this.c >= this.d) {
            rectF.set(L, 0.0f, (org.telegram.messenger.g0.L(11.0f) * this.b) + org.telegram.messenger.g0.L(5.0f) + L, org.telegram.messenger.g0.L(5.0f));
        } else {
            rectF.set(a1.g.D(1.0f, this.b, org.telegram.messenger.g0.L(11.0f), L), 0.0f, org.telegram.messenger.g0.L(5.0f) + L, org.telegram.messenger.g0.L(5.0f));
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.5f), org.telegram.messenger.g0.L(2.5f), paint);
    }

    public void setCurrentPage(int i3) {
        this.d = i3;
        invalidate();
    }
}
