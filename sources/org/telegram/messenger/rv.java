package org.telegram.messenger;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class rv extends MetricAffectingSpan {
    public final vv a;
    public final int b;
    public final boolean c;
    public boolean d;
    public int e;

    public rv(vv vvVar, int i10, boolean z10) {
        this.a = vvVar;
        this.b = i10;
        this.c = z10;
    }

    public final void a(TextPaint textPaint) {
        Typeface o12;
        int L;
        int w02;
        int i10 = this.b;
        int i11 = i10 & 15;
        if (i11 == 8) {
            o12 = Typeface.MONOSPACE;
        } else if (i11 == 11) {
            o12 = i0.o();
        } else if (i11 >= 1 && i11 <= 6) {
            o12 = TLObject.hasFlag(i10, 32) ? i0.o1("fonts/rmediumitalic.ttf") : i0.o();
        } else if (TLObject.hasFlag(i10, 256)) {
            o12 = Typeface.MONOSPACE;
        } else {
            boolean hasFlag = TLObject.hasFlag(i10, 16);
            boolean z10 = TLObject.hasFlag(i10, 32) || i11 == 12;
            o12 = (hasFlag && z10) ? i0.o1("fonts/rmediumitalic.ttf") : hasFlag ? i0.o() : z10 ? i0.o1("fonts/ritalic.ttf") : null;
        }
        if (o12 != null) {
            textPaint.setTypeface(o12);
        }
        int i12 = tz.W0;
        if (i11 != 14 || !this.d) {
            switch (i11) {
                case 1:
                    L = i0.L(i12 + 4);
                    break;
                case 2:
                    L = i0.L(i12 + 2);
                    break;
                case 3:
                    L = i0.L(i12 + 1);
                    break;
                case 4:
                case 5:
                case 6:
                    L = i0.L(i12);
                    break;
                case 7:
                case 13:
                    L = i0.L(i12 - 2);
                    break;
                case 8:
                    int i13 = i12 - 2;
                    L = i0.L(Math.max(Math.min(10, i13), i13 - this.e));
                    break;
                case 9:
                case 11:
                case 12:
                    L = i0.L(i12 - 2);
                    break;
                case 10:
                    L = i0.L(i12 - 2);
                    break;
                case 14:
                    L = i0.L(Math.max(8, i12 - 2));
                    break;
                case 15:
                    L = i0.L(i12 - 2);
                    break;
                default:
                    L = i0.L(i12);
                    break;
            }
        } else {
            L = i0.L(i12);
        }
        if (TLObject.hasFlag(i10, 6144)) {
            L -= i0.L(4.0f);
        }
        textPaint.setTextSize(L);
        if (!this.c) {
            textPaint.setFlags(TLObject.setFlag(TLObject.setFlag(textPaint.getFlags(), 8, TLObject.hasFlag(i10, 64)), 16, TLObject.hasFlag(i10, 128)));
            if (i11 != 8) {
                vv vvVar = this.a;
                if (i11 == 11) {
                    w02 = org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.Qb : org.telegram.ui.ActionBar.t6.Kd, vvVar.D);
                } else if (i11 == 10) {
                    w02 = org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.Tc : org.telegram.ui.ActionBar.t6.Sc, vvVar.D));
                } else {
                    w02 = org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.Tc : org.telegram.ui.ActionBar.t6.Sc, vvVar.D);
                }
                textPaint.setColor(w02);
            }
        }
        if (TLObject.hasFlag(i10, TLObject.FLAG_12)) {
            textPaint.baselineShift -= i0.L(6.0f);
        } else if (TLObject.hasFlag(i10, 2048)) {
            textPaint.baselineShift = i0.L(2.0f) + textPaint.baselineShift;
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
