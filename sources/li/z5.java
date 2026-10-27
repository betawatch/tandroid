package li;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Wallet.h7;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class z5 extends CharacterStyle {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ z5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setColor(y6.v(y6.o1(0.55f, textPaint.getColor()), y6.o1(0.4f, y6.w0(y6.Oh, ((d6) this.b).a))));
                break;
            case 1:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = y6.n6;
                ((nb0) this.b).getClass();
                textPaint.setColor(y6.x0(null, i10, false));
                textPaint.setAlpha(alpha);
                break;
            case 2:
                textPaint.setColor(y6.v(y6.o1(0.55f, textPaint.getColor()), y6.o1(0.4f, ((tj0) this.b).I)));
                break;
            case 3:
                textPaint.setColor(((org.telegram.ui.Wallet.m3) this.b).t0);
                break;
            default:
                float[] fArr = ((org.telegram.ui.Wallet.w5) this.b).a0;
                int i11 = -9577217;
                if (fArr != null) {
                    i11 = i0.a.f(fArr[8], h7.p(fArr, -9577217, 0), h7.p(fArr, -9577217, 3));
                }
                textPaint.setColor(i11);
                break;
        }
    }

    public z5(tj0 tj0Var) {
        this.a = 2;
        this.b = tj0Var;
    }
}
