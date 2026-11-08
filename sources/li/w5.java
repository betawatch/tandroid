package li;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Wallet.g6;
import org.telegram.ui.Wallet.p7;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class w5 extends CharacterStyle {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ w5(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setColor(k6.w(k6.r1(0.55f, textPaint.getColor()), k6.r1(0.4f, k6.w0(k6.Ci, ((a6) this.b).a))));
                break;
            case 1:
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(k6.w0(k6.n6, (f6) this.b));
                textPaint.setAlpha(alpha);
                break;
            case 2:
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int alpha2 = textPaint.getAlpha();
                int i7 = k6.n6;
                ((l90) this.b).getClass();
                textPaint.setColor(k6.v0(i7));
                textPaint.setAlpha(alpha2);
                break;
            case 3:
                textPaint.setColor(k6.w(k6.r1(0.55f, textPaint.getColor()), k6.r1(0.4f, ((ug0) this.b).I)));
                break;
            case 4:
                textPaint.setColor(((org.telegram.ui.Wallet.c4) this.b).t0);
                break;
            default:
                float[] fArr = ((g6) this.b).a0;
                int i10 = -9577217;
                if (fArr != null) {
                    i10 = i0.a.f(fArr[8], p7.p(-9577217, 0, fArr), p7.p(-9577217, 3, fArr));
                }
                textPaint.setColor(i10);
                break;
        }
    }

    public w5(ug0 ug0Var) {
        this.a = 3;
        this.b = ug0Var;
    }
}
