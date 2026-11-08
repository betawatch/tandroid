package di;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.id;
import org.telegram.ui.Components.my0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class k0 extends ReplacementSpan {
    public final /* synthetic */ int a;
    public final Object b;
    public final Paint c;
    public final my0 d;

    public k0(org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = 2;
        this.b = f6Var;
        this.d = new my0(id.M0(2131745240, null), 12.0f, org.telegram.messenger.g0.o());
        this.c = new Paint(1);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        switch (this.a) {
            case 0:
                float L = ((i11 + i13) / 2.0f) + org.telegram.messenger.g0.L(0.0f);
                RectF rectF = (RectF) this.b;
                rectF.set(f10, L - org.telegram.messenger.g0.L(6.0f), this.d.k() + f10 + org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(6.0f) + L);
                Paint paint2 = this.c;
                paint2.setColor(-572850);
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
                this.d.c(org.telegram.messenger.g0.L(4.0f) + f10, L, 1.0f, -1, canvas);
                break;
            case 1:
                float L2 = ((i11 + i13) / 2.0f) + org.telegram.messenger.g0.L(1.33f);
                RectF rectF2 = (RectF) this.b;
                rectF2.set(f10, L2 - org.telegram.messenger.g0.L(7.0f), this.d.k() + f10 + org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(7.0f) + L2);
                Paint paint3 = this.c;
                paint3.setColor(-572850);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint3);
                this.d.c(org.telegram.messenger.g0.L(6.0f) + f10, L2, 1.0f, -1, canvas);
                break;
            default:
                float L3 = ((i11 + i13) / 2.0f) + org.telegram.messenger.g0.L(1.0f);
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, (org.telegram.ui.ActionBar.f6) this.b);
                Paint paint4 = this.c;
                paint4.setColor(w02);
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(f10, L3 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(16.0f) + f10 + this.d.c, org.telegram.messenger.g0.L(9.0f) + L3);
                canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), paint4);
                this.d.c(f10 + org.telegram.messenger.g0.L(8.0f), L3, 1.0f, -1, canvas);
                break;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        float k10;
        int L;
        float f10;
        switch (this.a) {
            case 0:
                k10 = this.d.k();
                L = org.telegram.messenger.g0.L(8.0f);
                f10 = L;
                break;
            case 1:
                k10 = this.d.k();
                L = org.telegram.messenger.g0.L(12.0f);
                f10 = L;
                break;
            default:
                k10 = org.telegram.messenger.g0.L(16.0f);
                f10 = this.d.c;
                break;
        }
        return (int) (k10 + f10);
    }

    public k0(int i7) {
        this.a = i7;
        switch (i7) {
            case 1:
                this.b = new RectF();
                this.c = new Paint(1);
                this.d = new my0(id.M0(2131748826, null), 9.0f, org.telegram.messenger.g0.o());
                break;
            default:
                this.b = new RectF();
                this.c = new Paint(1);
                this.d = new my0(id.M0(2131748826, null), 8.0f, org.telegram.messenger.g0.o());
                break;
        }
    }
}
