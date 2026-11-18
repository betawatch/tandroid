package oi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Wallet.f8;
import org.telegram.ui.Wallet.x6;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class v5 extends CharacterStyle {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ v5(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setColor(n6.w(n6.r1(0.55f, textPaint.getColor()), n6.r1(0.4f, n6.w0(n6.Fi, ((z5) this.b).a))));
                break;
            case 1:
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(n6.w0(n6.n6, (i6) this.b));
                textPaint.setAlpha(alpha);
                break;
            case 2:
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int alpha2 = textPaint.getAlpha();
                int i7 = n6.n6;
                ((y90) this.b).getClass();
                textPaint.setColor(n6.v0(i7));
                textPaint.setAlpha(alpha2);
                break;
            case 3:
                textPaint.setColor(n6.w(n6.r1(0.55f, textPaint.getColor()), n6.r1(0.4f, ((hh0) this.b).J)));
                break;
            case 4:
                textPaint.setColor(((org.telegram.ui.Wallet.m4) this.b).t0);
                break;
            default:
                float[] fArr = ((x6) this.b).b0;
                int i10 = -9577217;
                if (fArr != null) {
                    i10 = i0.a.f(fArr[8], f8.p(-9577217, 0, fArr), f8.p(-9577217, 3, fArr));
                }
                textPaint.setColor(i10);
                break;
        }
    }

    public v5(hh0 hh0Var) {
        this.a = 3;
        this.b = hh0Var;
    }
}
