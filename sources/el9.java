// default package

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class el9 extends MetricAffectingSpan {
    public final hl9 a;
    public final int b;
    public final boolean c;
    public boolean d;
    public int e;

    public el9(hl9 hl9Var, int i, boolean z) {
        this.a = hl9Var;
        this.b = i;
        this.c = z;
    }

    public final void a(TextPaint textPaint) {
        Typeface n1;
        int L;
        int v0;
        int i = this.b;
        int i2 = i & 15;
        if (i2 == 8) {
            n1 = Typeface.MONOSPACE;
        } else if (i2 == 11) {
            n1 = hl.o();
        } else if (i2 >= 1 && i2 <= 6) {
            n1 = TLObject.hasFlag(i, 32) ? hl.n1("fonts/rmediumitalic.ttf") : hl.o();
        } else if (TLObject.hasFlag(i, 256)) {
            n1 = Typeface.MONOSPACE;
        } else {
            boolean hasFlag = TLObject.hasFlag(i, 16);
            boolean z = TLObject.hasFlag(i, 32) || i2 == 12;
            n1 = hasFlag ? z ? hl.n1("fonts/rmediumitalic.ttf") : hl.o() : z ? hl.n1("fonts/ritalic.ttf") : null;
        }
        if (n1 != null) {
            textPaint.setTypeface(n1);
        }
        int i3 = xea.S0;
        if (i2 != 14 || !this.d) {
            switch (i2) {
                case 1:
                    L = hl.L(i3 + 4);
                    break;
                case 2:
                    L = hl.L(i3 + 2);
                    break;
                case 3:
                    L = hl.L(i3 + 1);
                    break;
                case 4:
                case 5:
                case 6:
                    L = hl.L(i3);
                    break;
                case 7:
                case 13:
                    L = hl.L(i3 - 2);
                    break;
                case 8:
                    int i4 = i3 - 2;
                    L = hl.L(Math.max(Math.min(10, i4), i4 - this.e));
                    break;
                case 9:
                case 11:
                case 12:
                    L = hl.L(i3 - 2);
                    break;
                case 10:
                    L = hl.L(i3 - 2);
                    break;
                case 14:
                    L = hl.L(Math.max(8, i3 - 2));
                    break;
                case 15:
                    L = hl.L(i3 - 2);
                    break;
                default:
                    L = hl.L(i3);
                    break;
            }
        } else {
            L = hl.L(i3);
        }
        if (TLObject.hasFlag(i, 6144)) {
            L -= hl.L(4.0f);
        }
        textPaint.setTextSize(L);
        if (!this.c) {
            textPaint.setFlags(TLObject.setFlag(TLObject.setFlag(textPaint.getFlags(), 8, TLObject.hasFlag(i, 64)), 16, TLObject.hasFlag(i, 128)));
            if (i2 != 8) {
                hl9 hl9Var = this.a;
                if (i2 == 11) {
                    v0 = aob.v0(hl9Var.D() ? aob.Tb : aob.Nd, hl9Var.D);
                } else if (i2 == 10) {
                    v0 = aob.p1(0.5f, aob.v0(hl9Var.D() ? aob.Wc : aob.Vc, hl9Var.D));
                } else {
                    v0 = aob.v0(hl9Var.D() ? aob.Wc : aob.Vc, hl9Var.D);
                }
                textPaint.setColor(v0);
            }
        }
        if (TLObject.hasFlag(i, TLObject.FLAG_12)) {
            textPaint.baselineShift -= hl.L(6.0f);
        } else if (TLObject.hasFlag(i, 2048)) {
            textPaint.baselineShift = hl.L(2.0f) + textPaint.baselineShift;
        }
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
