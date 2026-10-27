package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class er extends View implements org.telegram.ui.ActionBar.p6 {
    public final Paint a;
    public final Paint b;
    public final RectF c;
    public int d;
    public long e;
    public int f;
    public int h;
    public int n;
    public int r;

    public er(Context context, int i10) {
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
        if (i10 == 0) {
            this.f = org.telegram.ui.ActionBar.y6.B7;
            this.h = org.telegram.ui.ActionBar.y6.C7;
        } else if (i10 == 1) {
            this.f = org.telegram.ui.ActionBar.y6.D7;
            this.h = org.telegram.ui.ActionBar.y6.E7;
        } else if (i10 == 2) {
            this.f = org.telegram.ui.ActionBar.y6.F7;
            this.h = org.telegram.ui.ActionBar.y6.G7;
        } else if (i10 == 3) {
            this.f = org.telegram.ui.ActionBar.y6.H7;
            this.h = org.telegram.ui.ActionBar.y6.I7;
        }
        updateColors();
    }

    public final void a(int i10, int i11) {
        this.f = -1;
        this.h = -1;
        this.n = i10;
        this.r = i11;
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
        long j10 = currentTimeMillis - this.e;
        this.e = currentTimeMillis;
        this.d = (int) (((j10 * 360) / 1000.0f) + this.d);
        int measuredWidth = (getMeasuredWidth() / 2) - AndroidUtilities.dp(9.0f);
        int measuredHeight = (getMeasuredHeight() / 2) - AndroidUtilities.dp(9.0f);
        float f7 = measuredWidth;
        float f10 = measuredHeight;
        float dp = AndroidUtilities.dp(18.0f) + measuredWidth;
        float dp2 = AndroidUtilities.dp(18.0f) + measuredHeight;
        RectF rectF = this.c;
        rectF.set(f7, f10, dp, dp2);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, AndroidUtilities.dp(9.0f), this.a);
        canvas.drawArc(rectF, this.d - 90, 90.0f, false, this.b);
        invalidate();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.e = System.currentTimeMillis();
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int i10 = this.f;
        Paint paint = this.a;
        if (i10 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        } else {
            paint.setColor(this.n);
        }
        int i11 = this.h;
        Paint paint2 = this.b;
        if (i11 >= 0) {
            paint2.setColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        } else {
            paint2.setColor(this.r);
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
