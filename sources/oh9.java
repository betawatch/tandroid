// default package

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class oh9 extends MetricAffectingSpan {
    public final rh9 a;
    public final int b;
    public final boolean c;
    public boolean d;
    public int e;

    public oh9(rh9 rh9Var, int i, boolean z) {
        this.a = rh9Var;
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
            n1 = gl.o();
        } else if (i2 >= 1 && i2 <= 6) {
            n1 = TLObject.hasFlag(i, 32) ? gl.n1("fonts/rmediumitalic.ttf") : gl.o();
        } else if (TLObject.hasFlag(i, 256)) {
            n1 = Typeface.MONOSPACE;
        } else {
            boolean hasFlag = TLObject.hasFlag(i, 16);
            boolean z = TLObject.hasFlag(i, 32) || i2 == 12;
            n1 = hasFlag ? z ? gl.n1("fonts/rmediumitalic.ttf") : gl.o() : z ? gl.n1("fonts/ritalic.ttf") : null;
        }
        if (n1 != null) {
            textPaint.setTypeface(n1);
        }
        int i3 = gba.S0;
        if (i2 != 14 || !this.d) {
            switch (i2) {
                case 1:
                    L = gl.L(i3 + 4);
                    break;
                case 2:
                    L = gl.L(i3 + 2);
                    break;
                case 3:
                    L = gl.L(i3 + 1);
                    break;
                case 4:
                case 5:
                case 6:
                    L = gl.L(i3);
                    break;
                case 7:
                case 13:
                    L = gl.L(i3 - 2);
                    break;
                case 8:
                    int i4 = i3 - 2;
                    L = gl.L(Math.max(Math.min(10, i4), i4 - this.e));
                    break;
                case 9:
                case 11:
                case 12:
                    L = gl.L(i3 - 2);
                    break;
                case 10:
                    L = gl.L(i3 - 2);
                    break;
                case 14:
                    L = gl.L(Math.max(8, i3 - 2));
                    break;
                case 15:
                    L = gl.L(i3 - 2);
                    break;
                default:
                    L = gl.L(i3);
                    break;
            }
        } else {
            L = gl.L(i3);
        }
        if (TLObject.hasFlag(i, 6144)) {
            L -= gl.L(4.0f);
        }
        textPaint.setTextSize(L);
        if (!this.c) {
            textPaint.setFlags(TLObject.setFlag(TLObject.setFlag(textPaint.getFlags(), 8, TLObject.hasFlag(i, 64)), 16, TLObject.hasFlag(i, 128)));
            if (i2 != 8) {
                rh9 rh9Var = this.a;
                if (i2 == 11) {
                    v0 = bkb.v0(rh9Var.D() ? bkb.Sb : bkb.Md, rh9Var.D);
                } else if (i2 == 10) {
                    v0 = bkb.p1(0.5f, bkb.v0(rh9Var.D() ? bkb.Vc : bkb.Uc, rh9Var.D));
                } else {
                    v0 = bkb.v0(rh9Var.D() ? bkb.Vc : bkb.Uc, rh9Var.D);
                }
                textPaint.setColor(v0);
            }
        }
        if (TLObject.hasFlag(i, TLObject.FLAG_12)) {
            textPaint.baselineShift -= gl.L(6.0f);
        } else if (TLObject.hasFlag(i, 2048)) {
            textPaint.baselineShift = gl.L(2.0f) + textPaint.baselineShift;
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
