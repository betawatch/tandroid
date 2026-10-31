package bi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.wh0;
import org.telegram.ui.Wallet.v7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class m6 extends CharacterStyle {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ m6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setColor(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.r1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.t6.r1(0.4f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, ((q6) this.b).a))));
                break;
            case 1:
                textPaint.setTypeface(org.telegram.messenger.i0.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.n6, (org.telegram.ui.ActionBar.p6) this.b));
                textPaint.setAlpha(alpha);
                break;
            case 2:
                textPaint.setTypeface(org.telegram.messenger.i0.o());
                int alpha2 = textPaint.getAlpha();
                int i10 = org.telegram.ui.ActionBar.t6.n6;
                ((da0) this.b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.t6.v0(i10));
                textPaint.setAlpha(alpha2);
                break;
            case 3:
                textPaint.setColor(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.r1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.t6.r1(0.4f, ((wh0) this.b).I)));
                break;
            case 4:
                textPaint.setColor(((org.telegram.ui.Wallet.d4) this.b).t0);
                break;
            default:
                float[] fArr = ((org.telegram.ui.Wallet.l6) this.b).a0;
                int i11 = -9577217;
                if (fArr != null) {
                    i11 = i0.b.f(fArr[8], v7.p(-9577217, 0, fArr), v7.p(-9577217, 3, fArr));
                }
                textPaint.setColor(i11);
                break;
        }
    }

    public m6(wh0 wh0Var) {
        this.a = 3;
        this.b = wh0Var;
    }
}
