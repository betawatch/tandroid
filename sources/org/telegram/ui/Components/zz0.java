package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class zz0 extends ReplacementSpan {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public zz0(int i10) {
        this.a = 0;
        Paint paint = new Paint(1);
        this.c = paint;
        this.b = i10;
        paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.3f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.nd, false)));
    }

    public void a(int i10) {
        org.telegram.ui.wp0 wp0Var = (org.telegram.ui.wp0) this.c;
        if (wp0Var != null) {
            wp0Var.a = i10 / 2.0f;
            wp0Var.d();
            this.b = i10;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        switch (this.a) {
            case 0:
                float dp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.33f);
                float dp2 = AndroidUtilities.dp(6.66f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = dp2 / 2.0f;
                rectF.set(f7, dp - f10, this.b + f7, dp + f10);
                canvas.drawRoundRect(rectF, f10, f10, (Paint) this.c);
                break;
            default:
                org.telegram.ui.wp0 wp0Var = (org.telegram.ui.wp0) this.c;
                if (wp0Var != null) {
                    int i15 = (i12 + i14) / 2;
                    int i16 = this.b;
                    wp0Var.setBounds((int) (AndroidUtilities.dp(3.0f) + f7), i15 - this.b, (int) (f7 + AndroidUtilities.dp(5.0f) + i16), i15 + i16);
                    wp0Var.draw(canvas);
                    break;
                }
                break;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(3.0f) + this.b;
        }
    }

    public zz0(boolean z10, int i10, int i11) {
        this.a = 1;
        this.b = AndroidUtilities.dp(21.0f);
        this.c = z10 ? org.telegram.ui.wp0.c(i10, i11) : org.telegram.ui.wp0.a(i10, i11);
    }
}
