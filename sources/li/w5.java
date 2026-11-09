package li;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.Wallet.f6;
import org.telegram.ui.Wallet.o7;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                textPaint.setColor(l6.w(l6.r1(0.55f, textPaint.getColor()), l6.r1(0.4f, l6.w0(l6.Ci, ((a6) this.b).a))));
                break;
            case 1:
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(l6.w0(l6.n6, (g6) this.b));
                textPaint.setAlpha(alpha);
                break;
            case 2:
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int alpha2 = textPaint.getAlpha();
                int i7 = l6.n6;
                ((m90) this.b).getClass();
                textPaint.setColor(l6.v0(i7));
                textPaint.setAlpha(alpha2);
                break;
            case 3:
                textPaint.setColor(l6.w(l6.r1(0.55f, textPaint.getColor()), l6.r1(0.4f, ((vg0) this.b).I)));
                break;
            case 4:
                textPaint.setColor(((org.telegram.ui.Wallet.b4) this.b).t0);
                break;
            default:
                float[] fArr = ((f6) this.b).a0;
                int i10 = -9577217;
                if (fArr != null) {
                    i10 = i0.a.f(fArr[8], o7.p(-9577217, 0, fArr), o7.p(-9577217, 3, fArr));
                }
                textPaint.setColor(i10);
                break;
        }
    }

    public w5(vg0 vg0Var) {
        this.a = 3;
        this.b = vg0Var;
    }
}
