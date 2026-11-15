package oi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.Wallet.h6;
import org.telegram.ui.Wallet.q7;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class u5 extends CharacterStyle {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ u5(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setColor(j6.w(j6.r1(0.55f, textPaint.getColor()), j6.r1(0.4f, j6.w0(j6.Fi, ((y5) this.b).a))));
                break;
            case 1:
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(j6.w0(j6.n6, (e6) this.b));
                textPaint.setAlpha(alpha);
                break;
            case 2:
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int alpha2 = textPaint.getAlpha();
                int i7 = j6.n6;
                ((o90) this.b).getClass();
                textPaint.setColor(j6.v0(i7));
                textPaint.setAlpha(alpha2);
                break;
            case 3:
                textPaint.setColor(j6.w(j6.r1(0.55f, textPaint.getColor()), j6.r1(0.4f, ((xg0) this.b).J)));
                break;
            case 4:
                textPaint.setColor(((org.telegram.ui.Wallet.c4) this.b).t0);
                break;
            default:
                float[] fArr = ((h6) this.b).b0;
                int i10 = -9577217;
                if (fArr != null) {
                    i10 = i0.a.f(fArr[8], q7.p(-9577217, 0, fArr), q7.p(-9577217, 3, fArr));
                }
                textPaint.setColor(i10);
                break;
        }
    }

    public u5(xg0 xg0Var) {
        this.a = 3;
        this.b = xg0Var;
    }
}
