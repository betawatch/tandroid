package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class hz0 extends ReplacementSpan {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public hz0(int i9) {
        this.a = 0;
        Paint paint = new Paint(1);
        this.c = paint;
        this.b = i9;
        paint.setColor(org.telegram.ui.ActionBar.f6.l1(0.3f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.nd, false)));
    }

    public void a(int i9) {
        org.telegram.ui.vo0 vo0Var = (org.telegram.ui.vo0) this.c;
        if (vo0Var != null) {
            vo0Var.a = i9 / 2.0f;
            vo0Var.d();
            this.b = i9;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        switch (this.a) {
            case 0:
                float dp = ((i11 + i13) / 2.0f) + AndroidUtilities.dp(1.33f);
                float dp2 = AndroidUtilities.dp(6.66f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f11 = dp2 / 2.0f;
                rectF.set(f10, dp - f11, this.b + f10, dp + f11);
                canvas.drawRoundRect(rectF, f11, f11, (Paint) this.c);
                break;
            default:
                org.telegram.ui.vo0 vo0Var = (org.telegram.ui.vo0) this.c;
                if (vo0Var != null) {
                    int i14 = (i11 + i13) / 2;
                    int i15 = this.b;
                    vo0Var.setBounds((int) (AndroidUtilities.dp(3.0f) + f10), i14 - this.b, (int) (f10 + AndroidUtilities.dp(5.0f) + i15), i14 + i15);
                    vo0Var.draw(canvas);
                    break;
                }
                break;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(3.0f) + this.b;
        }
    }

    public hz0(boolean z10, int i9, int i10) {
        this.a = 1;
        this.b = AndroidUtilities.dp(21.0f);
        this.c = z10 ? org.telegram.ui.vo0.c(i9, i10) : org.telegram.ui.vo0.a(i9, i10);
    }
}
