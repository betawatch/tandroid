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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class du0 extends View {
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
    public du0(Context context, PhotoViewer photoViewer) {
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
        setAccessibilityDelegate(new cu0(this));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.s.U7 != 1) {
            this.f = (((getMeasuredWidth() - (this.c * this.s.U7)) - (((this.s.U7 * 2) - 2) * this.d)) - (this.e * 2)) / (this.s.U7 - 1);
        } else {
            this.f = ((getMeasuredWidth() - (this.c * this.s.U7)) - (this.d * 2)) - (this.e * 2);
        }
        int dp = AndroidUtilities.dp(6.0f) + (getMeasuredHeight() / 2);
        int i9 = 0;
        while (i9 < this.s.U7) {
            int i10 = this.e;
            int i11 = (this.d * 2) + this.f;
            int i12 = this.c;
            int i13 = (i12 / 2) + ((i11 + i12) * i9) + i10;
            if (i9 <= this.s.T7) {
                this.a.setColor(-11292945);
            } else {
                this.a.setColor(1728053247);
            }
            canvas.drawCircle(i13, dp, i9 == this.s.T7 ? AndroidUtilities.dp(6.0f) : this.c / 2, this.a);
            if (i9 != 0) {
                canvas.drawRect((i9 == this.s.T7 + 1 ? AndroidUtilities.dpf2(2.0f) : 0.0f) + (((i13 - (this.c / 2)) - this.d) - this.f), dp - AndroidUtilities.dp(1.0f), (r2 + this.f) - (i9 == this.s.T7 ? AndroidUtilities.dpf2(2.0f) : 0.0f), AndroidUtilities.dp(2.0f) + dp, this.a);
            }
            i9++;
        }
        canvas.drawText(this.h, this.e, dp - AndroidUtilities.dp(16.0f), this.b);
        canvas.drawText(this.n, (getMeasuredWidth() - this.e) - this.b.measureText(this.n), dp - AndroidUtilities.dp(16.0f), this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        this.c = AndroidUtilities.dp(8.0f);
        this.d = AndroidUtilities.dp(2.0f);
        this.e = AndroidUtilities.dp(18.0f);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.r = this.s.T7;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int i9 = 0;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            while (true) {
                if (i9 >= this.s.U7) {
                    break;
                }
                int i10 = this.e;
                int i11 = this.f;
                int i12 = this.d;
                int i13 = this.c;
                int i14 = (((i12 * 2) + i11 + i13) * i9) + i10;
                int i15 = i13 / 2;
                int i16 = i14 + i15;
                int i17 = (i11 / 2) + i15 + i12;
                if (x10 <= i16 - i17 || x10 >= i16 + i17) {
                    i9++;
                } else if (this.s.T7 != i9) {
                    this.s.T7 = i9;
                    this.s.R0();
                    invalidate();
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.s.T7 != this.r) {
                this.s.p2(1);
            }
            this.s.H6 = false;
            return true;
        }
        return true;
    }
}
