package mi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.Wallet.p7;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class x5 extends CharacterStyle {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ x5(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setColor(k6.w(k6.r1(0.55f, textPaint.getColor()), k6.r1(0.4f, k6.w0(k6.Ci, ((b6) this.b).a))));
                break;
            case 1:
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(k6.w0(k6.n6, (org.telegram.ui.ActionBar.e6) this.b));
                textPaint.setAlpha(alpha);
                break;
            case 2:
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int alpha2 = textPaint.getAlpha();
                int i3 = k6.n6;
                ((h90) this.b).getClass();
                textPaint.setColor(k6.v0(i3));
                textPaint.setAlpha(alpha2);
                break;
            case 3:
                textPaint.setColor(k6.w(k6.r1(0.55f, textPaint.getColor()), k6.r1(0.4f, ((xg0) this.b).J)));
                break;
            case 4:
                textPaint.setColor(((org.telegram.ui.Wallet.b4) this.b).t0);
                break;
            default:
                float[] fArr = ((org.telegram.ui.Wallet.f6) this.b).b0;
                int i10 = -9577217;
                if (fArr != null) {
                    i10 = i0.a.f(fArr[8], p7.p(-9577217, 0, fArr), p7.p(-9577217, 3, fArr));
                }
                textPaint.setColor(i10);
                break;
        }
    }

    public x5(xg0 xg0Var) {
        this.a = 3;
        this.b = xg0Var;
    }
}
