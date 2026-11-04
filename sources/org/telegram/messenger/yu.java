package org.telegram.messenger;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class yu extends MetricAffectingSpan {
    public final cv a;
    public final int b;
    public final boolean c;
    public boolean d;
    public int e;

    public yu(cv cvVar, int i3, boolean z10) {
        this.a = cvVar;
        this.b = i3;
        this.c = z10;
    }

    public final void a(TextPaint textPaint) {
        Typeface o12;
        int L;
        int w02;
        int i3 = this.b;
        int i10 = i3 & 15;
        if (i10 == 8) {
            o12 = Typeface.MONOSPACE;
        } else if (i10 == 11) {
            o12 = g0.o();
        } else if (i10 >= 1 && i10 <= 6) {
            o12 = TLObject.hasFlag(i3, 32) ? g0.o1("fonts/rmediumitalic.ttf") : g0.o();
        } else if (TLObject.hasFlag(i3, 256)) {
            o12 = Typeface.MONOSPACE;
        } else {
            boolean hasFlag = TLObject.hasFlag(i3, 16);
            boolean z10 = TLObject.hasFlag(i3, 32) || i10 == 12;
            o12 = (hasFlag && z10) ? g0.o1("fonts/rmediumitalic.ttf") : hasFlag ? g0.o() : z10 ? g0.o1("fonts/ritalic.ttf") : null;
        }
        if (o12 != null) {
            textPaint.setTypeface(o12);
        }
        int i11 = az.W0;
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
        if (TLObject.hasFlag(i3, 6144)) {
            L -= g0.L(4.0f);
        }
        textPaint.setTextSize(L);
        if (!this.c) {
            textPaint.setFlags(TLObject.setFlag(TLObject.setFlag(textPaint.getFlags(), 8, TLObject.hasFlag(i3, 64)), 16, TLObject.hasFlag(i3, 128)));
            if (i10 != 8) {
                cv cvVar = this.a;
                if (i10 == 11) {
                    w02 = org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.Qb : org.telegram.ui.ActionBar.k6.Kd, cvVar.D);
                } else if (i10 == 10) {
                    w02 = org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.Tc : org.telegram.ui.ActionBar.k6.Sc, cvVar.D));
                } else {
                    w02 = org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.Tc : org.telegram.ui.ActionBar.k6.Sc, cvVar.D);
                }
                textPaint.setColor(w02);
            }
        }
        if (TLObject.hasFlag(i3, TLObject.FLAG_12)) {
            textPaint.baselineShift -= g0.L(6.0f);
        } else if (TLObject.hasFlag(i3, 2048)) {
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
