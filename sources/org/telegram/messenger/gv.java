package org.telegram.messenger;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class gv extends MetricAffectingSpan {
    public final kv a;
    public final int b;
    public final boolean c;
    public boolean d;
    public int e;

    public gv(kv kvVar, int i7, boolean z9) {
        this.a = kvVar;
        this.b = i7;
        this.c = z9;
    }

    public final void a(TextPaint textPaint) {
        Typeface o12;
        int L;
        int w02;
        int i7 = this.b;
        int i10 = i7 & 15;
        if (i10 == 8) {
            o12 = Typeface.MONOSPACE;
        } else if (i10 == 11) {
            o12 = g0.o();
        } else if (i10 >= 1 && i10 <= 6) {
            o12 = TLObject.hasFlag(i7, 32) ? g0.o1("fonts/rmediumitalic.ttf") : g0.o();
        } else if (TLObject.hasFlag(i7, 256)) {
            o12 = Typeface.MONOSPACE;
        } else {
            boolean hasFlag = TLObject.hasFlag(i7, 16);
            boolean z9 = TLObject.hasFlag(i7, 32) || i10 == 12;
            o12 = (hasFlag && z9) ? g0.o1("fonts/rmediumitalic.ttf") : hasFlag ? g0.o() : z9 ? g0.o1("fonts/ritalic.ttf") : null;
        }
        if (o12 != null) {
            textPaint.setTypeface(o12);
        }
        int i11 = iz.W0;
        if (i10 != 14 || !this.d) {
            switch (i10) {
                case 1:
                    L = g0.L(i11 + 4);
                    break;
                case 2:
                    L = g0.L(i11 + 2);
                    break;
                case 3:
                    L = g0.L(i11 + 1);
                    break;
                case 4:
                case 5:
                case 6:
                    L = g0.L(i11);
                    break;
                case 7:
                case 13:
                    L = g0.L(i11 - 2);
                    break;
                case 8:
                    int i12 = i11 - 2;
                    L = g0.L(Math.max(Math.min(10, i12), i12 - this.e));
                    break;
                case 9:
                case 11:
                case 12:
                    L = g0.L(i11 - 2);
                    break;
                case 10:
                    L = g0.L(i11 - 2);
                    break;
                case 14:
                    L = g0.L(Math.max(8, i11 - 2));
                    break;
                case 15:
                    L = g0.L(i11 - 2);
                    break;
                default:
                    L = g0.L(i11);
                    break;
            }
        } else {
            L = g0.L(i11);
        }
        if (TLObject.hasFlag(i7, 6144)) {
            L -= g0.L(4.0f);
        }
        textPaint.setTextSize(L);
        if (!this.c) {
            textPaint.setFlags(TLObject.setFlag(TLObject.setFlag(textPaint.getFlags(), 8, TLObject.hasFlag(i7, 64)), 16, TLObject.hasFlag(i7, 128)));
            if (i10 != 8) {
                kv kvVar = this.a;
                if (i10 == 11) {
                    w02 = org.telegram.ui.ActionBar.l6.w0(kvVar.E() ? org.telegram.ui.ActionBar.l6.Qb : org.telegram.ui.ActionBar.l6.Kd, kvVar.D);
                } else if (i10 == 10) {
                    w02 = org.telegram.ui.ActionBar.l6.r1(0.5f, org.telegram.ui.ActionBar.l6.w0(kvVar.E() ? org.telegram.ui.ActionBar.l6.Tc : org.telegram.ui.ActionBar.l6.Sc, kvVar.D));
                } else {
                    w02 = org.telegram.ui.ActionBar.l6.w0(kvVar.E() ? org.telegram.ui.ActionBar.l6.Tc : org.telegram.ui.ActionBar.l6.Sc, kvVar.D);
                }
                textPaint.setColor(w02);
            }
        }
        if (TLObject.hasFlag(i7, TLObject.FLAG_12)) {
            textPaint.baselineShift -= g0.L(6.0f);
        } else if (TLObject.hasFlag(i7, 2048)) {
            textPaint.baselineShift = g0.L(2.0f) + textPaint.baselineShift;
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
