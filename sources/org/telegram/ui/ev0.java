package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ev0 extends View {
    public final Paint a;
    public final TextPaint b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final String h;
    public final String n;
    public int r;
    public final /* synthetic */ PhotoViewer s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.s = photoViewer;
        this.a = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-3289651);
        this.h = LocaleController.getString("AccDescrVideoCompressLow", R.string.AccDescrVideoCompressLow);
        this.n = LocaleController.getString("AccDescrVideoCompressHigh", R.string.AccDescrVideoCompressHigh);
        setImportantForAccessibility(1);
        setFocusable(true);
        setAccessibilityDelegate(new dv0(this));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.s.Y7 != 1) {
            this.f = (((getMeasuredWidth() - (this.c * this.s.Y7)) - (((this.s.Y7 * 2) - 2) * this.d)) - (this.e * 2)) / (this.s.Y7 - 1);
        } else {
            this.f = ((getMeasuredWidth() - (this.c * this.s.Y7)) - (this.d * 2)) - (this.e * 2);
        }
        int dp = AndroidUtilities.dp(6.0f) + (getMeasuredHeight() / 2);
        int i10 = 0;
        while (i10 < this.s.Y7) {
            int i11 = this.e;
            int i12 = (this.d * 2) + this.f;
            int i13 = this.c;
            int i14 = (i13 / 2) + ((i12 + i13) * i10) + i11;
            if (i10 <= this.s.X7) {
                this.a.setColor(-11292945);
            } else {
                this.a.setColor(1728053247);
            }
            canvas.drawCircle(i14, dp, i10 == this.s.X7 ? AndroidUtilities.dp(6.0f) : this.c / 2, this.a);
            if (i10 != 0) {
                canvas.drawRect((i10 == this.s.X7 + 1 ? AndroidUtilities.dpf2(2.0f) : 0.0f) + (((i14 - (this.c / 2)) - this.d) - this.f), dp - AndroidUtilities.dp(1.0f), (r2 + this.f) - (i10 == this.s.X7 ? AndroidUtilities.dpf2(2.0f) : 0.0f), AndroidUtilities.dp(2.0f) + dp, this.a);
            }
            i10++;
        }
        canvas.drawText(this.h, this.e, dp - AndroidUtilities.dp(16.0f), this.b);
        canvas.drawText(this.n, (getMeasuredWidth() - this.e) - this.b.measureText(this.n), dp - AndroidUtilities.dp(16.0f), this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.c = AndroidUtilities.dp(8.0f);
        this.d = AndroidUtilities.dp(2.0f);
        this.e = AndroidUtilities.dp(18.0f);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.r = this.s.X7;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int i10 = 0;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            while (true) {
                if (i10 >= this.s.Y7) {
                    break;
                }
                int i11 = this.e;
                int i12 = this.f;
                int i13 = this.d;
                int i14 = this.c;
                int i15 = (((i13 * 2) + i12 + i14) * i10) + i11;
                int i16 = i14 / 2;
                int i17 = i15 + i16;
                int i18 = (i12 / 2) + i16 + i13;
                if (x10 <= i17 - i18 || x10 >= i17 + i18) {
                    i10++;
                } else if (this.s.X7 != i10) {
                    this.s.X7 = i10;
                    this.s.R0();
                    invalidate();
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.s.X7 != this.r) {
                this.s.p2(1);
            }
            this.s.L6 = false;
            return true;
        }
        return true;
    }
}
