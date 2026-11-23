package oi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Wallet.g8;
import org.telegram.ui.Wallet.y6;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                textPaint.setColor(n6.w(n6.r1(0.55f, textPaint.getColor()), n6.r1(0.4f, n6.w0(n6.Fi, ((a6) this.b).a))));
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
                ((x90) this.b).getClass();
                textPaint.setColor(n6.v0(i7));
                textPaint.setAlpha(alpha2);
                break;
            case 3:
                textPaint.setColor(n6.w(n6.r1(0.55f, textPaint.getColor()), n6.r1(0.4f, ((ih0) this.b).J)));
                break;
            case 4:
                textPaint.setColor(((org.telegram.ui.Wallet.n4) this.b).t0);
                break;
            default:
                float[] fArr = ((y6) this.b).b0;
                int i10 = -9577217;
                if (fArr != null) {
                    i10 = i0.a.f(fArr[8], g8.p(-9577217, 0, fArr), g8.p(-9577217, 3, fArr));
                }
                textPaint.setColor(i10);
                break;
        }
    }

    public w5(ih0 ih0Var) {
        this.a = 3;
        this.b = ih0Var;
    }
}
