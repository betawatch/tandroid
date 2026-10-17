package ki;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Wallet.k7;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class y5 extends CharacterStyle {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ y5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setColor(h6.v(h6.m1(0.55f, textPaint.getColor()), h6.m1(0.4f, h6.w0(h6.Oh, ((c6) this.b).a))));
                break;
            case 1:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = h6.n6;
                ((ob0) this.b).getClass();
                textPaint.setColor(h6.x0(null, i10, false));
                textPaint.setAlpha(alpha);
                break;
            case 2:
                textPaint.setColor(h6.v(h6.m1(0.55f, textPaint.getColor()), h6.m1(0.4f, ((pj0) this.b).I)));
                break;
            case 3:
                textPaint.setColor(((org.telegram.ui.Wallet.k3) this.b).u0);
                break;
            default:
                float[] fArr = ((org.telegram.ui.Wallet.v5) this.b).e0;
                int i11 = -9577217;
                if (fArr != null) {
                    i11 = i0.b.f(fArr[8], k7.m(fArr, -9577217, 0), k7.m(fArr, -9577217, 3));
                }
                textPaint.setColor(i11);
                break;
        }
    }

    public y5(pj0 pj0Var) {
        this.a = 2;
        this.b = pj0Var;
    }
}
