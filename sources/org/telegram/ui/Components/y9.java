package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y9 extends View {
    public final Paint a;
    public float b;
    public int c;
    public int d;
    public final RectF e;
    public final z4.g f;
    public final int h;
    public int n;
    public int r;

    public y9(Context context, z4.g gVar, int i10) {
        super(context);
        this.a = new Paint(1);
        new DecelerateInterpolator();
        this.e = new RectF();
        this.n = -1;
        this.r = -1;
        this.f = gVar;
        this.h = i10;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF;
        org.telegram.messenger.i0.L(5.0f);
        int i10 = this.n;
        Paint paint = this.a;
        if (i10 >= 0) {
            paint.setColor((org.telegram.ui.ActionBar.t6.x0(null, i10, false) & 16777215) | (-1275068416));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.t6.D0().q() ? -11184811 : -4473925);
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
                rectF.set(org.telegram.messenger.i0.L(11.0f) * i11, 0.0f, org.telegram.messenger.i0.L(5.0f) + r5, org.telegram.messenger.i0.L(5.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.5f), org.telegram.messenger.i0.L(2.5f), paint);
            }
            i11++;
        }
        int i13 = this.r;
        if (i13 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, i13, false));
        } else {
            paint.setColor(-14509328);
        }
        int L = org.telegram.messenger.i0.L(11.0f) * this.d;
        if (this.b == 0.0f) {
            rectF.set(L, 0.0f, org.telegram.messenger.i0.L(5.0f) + L, org.telegram.messenger.i0.L(5.0f));
        } else if (this.c >= this.d) {
            rectF.set(L, 0.0f, (org.telegram.messenger.i0.L(11.0f) * this.b) + org.telegram.messenger.i0.L(5.0f) + L, org.telegram.messenger.i0.L(5.0f));
        } else {
            rectF.set(sc.e.z(1.0f, this.b, org.telegram.messenger.i0.L(11.0f), L), 0.0f, org.telegram.messenger.i0.L(5.0f) + L, org.telegram.messenger.i0.L(5.0f));
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.5f), org.telegram.messenger.i0.L(2.5f), paint);
    }

    public void setCurrentPage(int i10) {
        this.d = i10;
        invalidate();
    }
}
