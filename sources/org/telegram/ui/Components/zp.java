package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class zp extends View implements org.telegram.ui.ActionBar.a6 {
    public final Paint a;
    public final Paint b;
    public final RectF c;
    public int d;
    public long e;
    public int f;
    public int h;
    public int n;
    public int r;

    public zp(Context context, int i7) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.c = new RectF();
        this.d = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        if (i7 == 0) {
            this.f = org.telegram.ui.ActionBar.k6.B7;
            this.h = org.telegram.ui.ActionBar.k6.C7;
        } else if (i7 == 1) {
            this.f = org.telegram.ui.ActionBar.k6.D7;
            this.h = org.telegram.ui.ActionBar.k6.E7;
        } else if (i7 == 2) {
            this.f = org.telegram.ui.ActionBar.k6.F7;
            this.h = org.telegram.ui.ActionBar.k6.G7;
        } else if (i7 == 3) {
            this.f = org.telegram.ui.ActionBar.k6.H7;
            this.h = org.telegram.ui.ActionBar.k6.I7;
        }
        updateColors();
    }

    public final void a(int i7, int i10) {
        this.f = -1;
        this.h = -1;
        this.n = i7;
        this.r = i10;
        updateColors();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = System.currentTimeMillis();
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (getVisibility() != 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.e;
        this.e = currentTimeMillis;
        this.d = (int) (((j3 * 360) / 1000.0f) + this.d);
        int measuredWidth = (getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(9.0f);
        int measuredHeight = (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(9.0f);
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        float L = org.telegram.messenger.g0.L(18.0f) + measuredWidth;
        float L2 = org.telegram.messenger.g0.L(18.0f) + measuredHeight;
        RectF rectF = this.c;
        rectF.set(f10, f11, L, L2);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, org.telegram.messenger.g0.L(9.0f), this.a);
        canvas.drawArc(rectF, this.d - 90, 90.0f, false, this.b);
        invalidate();
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        this.e = System.currentTimeMillis();
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        int i7 = this.f;
        Paint paint = this.a;
        if (i7 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        } else {
            paint.setColor(this.n);
        }
        int i10 = this.h;
        Paint paint2 = this.b;
        if (i10 >= 0) {
            paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        } else {
            paint2.setColor(this.r);
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
