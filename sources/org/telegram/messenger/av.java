package org.telegram.messenger;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class av extends MetricAffectingSpan {
    public final ev a;
    public final int b;
    public final boolean c;
    public boolean d;
    public int e;

    public av(ev evVar, int i7, boolean z10) {
        this.a = evVar;
        this.b = i7;
        this.c = z10;
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
            boolean z10 = TLObject.hasFlag(i7, 32) || i10 == 12;
            o12 = (hasFlag && z10) ? g0.o1("fonts/rmediumitalic.ttf") : hasFlag ? g0.o() : z10 ? g0.o1("fonts/ritalic.ttf") : null;
        }
        if (o12 != null) {
            textPaint.setTypeface(o12);
        }
        int i11 = bz.W0;
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
                ev evVar = this.a;
                if (i10 == 11) {
                    w02 = org.telegram.ui.ActionBar.n6.w0(evVar.E() ? org.telegram.ui.ActionBar.n6.Tb : org.telegram.ui.ActionBar.n6.Nd, evVar.D);
                } else if (i10 == 10) {
                    w02 = org.telegram.ui.ActionBar.n6.r1(0.5f, org.telegram.ui.ActionBar.n6.w0(evVar.E() ? org.telegram.ui.ActionBar.n6.Wc : org.telegram.ui.ActionBar.n6.Vc, evVar.D));
                } else {
                    w02 = org.telegram.ui.ActionBar.n6.w0(evVar.E() ? org.telegram.ui.ActionBar.n6.Wc : org.telegram.ui.ActionBar.n6.Vc, evVar.D);
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
