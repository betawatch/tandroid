package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ea extends View {
    public final Paint a;
    public float b;
    public int c;
    public int d;
    public final RectF e;
    public final c5.k f;
    public final int h;
    public int n;
    public int r;

    public ea(Context context, c5.k kVar, int i7) {
        super(context);
        this.a = new Paint(1);
        new DecelerateInterpolator();
        this.e = new RectF();
        this.n = -1;
        this.r = -1;
        this.f = kVar;
        this.h = i7;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF;
        org.telegram.messenger.g0.L(5.0f);
        int i7 = this.n;
        Paint paint = this.a;
        if (i7 >= 0) {
            paint.setColor((org.telegram.ui.ActionBar.k6.x0(null, i7, false) & 16777215) | (-1275068416));
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
            rectF.set(com.google.android.recaptcha.internal.a.v(1.0f, this.b, org.telegram.messenger.g0.L(11.0f), L), 0.0f, org.telegram.messenger.g0.L(5.0f) + L, org.telegram.messenger.g0.L(5.0f));
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.5f), org.telegram.messenger.g0.L(2.5f), paint);
    }

    public void setCurrentPage(int i7) {
        this.d = i7;
        invalidate();
    }
}
