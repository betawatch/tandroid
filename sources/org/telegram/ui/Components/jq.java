package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class jq extends View {
    public final Paint a;
    public final Paint b;
    public final RectF c;
    public int d;
    public long e;
    public int f;
    public int h;
    public int n;
    public int r;

    public jq(Context context, int i9) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.c = new RectF();
        this.d = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        if (i9 == 0) {
            this.f = org.telegram.ui.ActionBar.f6.B7;
            this.h = org.telegram.ui.ActionBar.f6.C7;
        } else if (i9 == 1) {
            this.f = org.telegram.ui.ActionBar.f6.D7;
            this.h = org.telegram.ui.ActionBar.f6.E7;
        } else if (i9 == 2) {
            this.f = org.telegram.ui.ActionBar.f6.F7;
            this.h = org.telegram.ui.ActionBar.f6.G7;
        } else if (i9 == 3) {
            this.f = org.telegram.ui.ActionBar.f6.H7;
            this.h = org.telegram.ui.ActionBar.f6.I7;
        }
        b();
    }

    public final void a(int i9, int i10) {
        this.f = -1;
        this.h = -1;
        this.n = i9;
        this.r = i10;
        b();
    }

    public final void b() {
        int i9 = this.f;
        Paint paint = this.a;
        if (i9 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        } else {
            paint.setColor(this.n);
        }
        int i10 = this.h;
        Paint paint2 = this.b;
        if (i10 >= 0) {
            paint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        } else {
            paint2.setColor(this.r);
        }
        invalidate();
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
        long j10 = currentTimeMillis - this.e;
        this.e = currentTimeMillis;
        this.d = (int) (((j10 * 360) / 1000.0f) + this.d);
        int measuredWidth = (getMeasuredWidth() / 2) - AndroidUtilities.dp(9.0f);
        int measuredHeight = (getMeasuredHeight() / 2) - AndroidUtilities.dp(9.0f);
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        float dp = AndroidUtilities.dp(18.0f) + measuredWidth;
        float dp2 = AndroidUtilities.dp(18.0f) + measuredHeight;
        RectF rectF = this.c;
        rectF.set(f10, f11, dp, dp2);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, AndroidUtilities.dp(9.0f), this.a);
        canvas.drawArc(rectF, this.d - 90, 90.0f, false, this.b);
        invalidate();
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        this.e = System.currentTimeMillis();
        invalidate();
    }
}
