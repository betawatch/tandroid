package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class h11 extends ReplacementSpan {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public h11(int i10) {
        this.a = 0;
        Paint paint = new Paint(1);
        this.c = paint;
        this.b = i10;
        paint.setColor(org.telegram.ui.ActionBar.y6.o1(0.3f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.nd, false)));
    }

    public void a(int i10) {
        org.telegram.ui.mp0 mp0Var = (org.telegram.ui.mp0) this.c;
        if (mp0Var != null) {
            mp0Var.a = i10 / 2.0f;
            mp0Var.d();
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
                Paint paint2 = (Paint) this.c;
                paint2.setColor(org.telegram.ui.ActionBar.y6.o1(0.3f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.nd, false)));
                canvas.drawRoundRect(rectF, f10, f10, paint2);
                break;
            default:
                org.telegram.ui.mp0 mp0Var = (org.telegram.ui.mp0) this.c;
                if (mp0Var != null) {
                    int i15 = (i12 + i14) / 2;
                    int i16 = this.b;
                    mp0Var.setBounds((int) (AndroidUtilities.dp(3.0f) + f7), i15 - this.b, (int) (f7 + AndroidUtilities.dp(5.0f) + i16), i15 + i16);
                    mp0Var.draw(canvas);
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

    public h11(boolean z10, int i10, int i11) {
        this.a = 1;
        this.b = AndroidUtilities.dp(21.0f);
        this.c = z10 ? org.telegram.ui.mp0.c(i10, i11) : org.telegram.ui.mp0.a(i10, i11);
    }
}
