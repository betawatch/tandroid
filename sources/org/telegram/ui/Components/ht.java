package org.telegram.ui.Components;

import android.text.Editable;
import android.text.style.CharacterStyle;
import android.view.Surface;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ht implements lt, h2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ht(mt mtVar, int i7, int i10, Runnable runnable) {
        this.c = mtVar;
        this.a = i7;
        this.b = i10;
        this.d = runnable;
    }

    @Override // org.telegram.ui.Components.lt
    public void a(String str) {
        mt mtVar = (mt) this.c;
        Runnable runnable = (Runnable) this.d;
        Editable text = mtVar.getText();
        int i7 = this.a;
        int i10 = this.b;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i7, i10, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof x5) && !(characterStyle instanceof hh0)) {
                    int spanStart = text.getSpanStart(characterStyle);
                    int spanEnd = text.getSpanEnd(characterStyle);
                    text.removeSpan(characterStyle);
                    if (spanStart < i7) {
                        text.setSpan(characterStyle, spanStart, i7, 33);
                    }
                    if (spanEnd > i10) {
                        text.setSpan(characterStyle, i10, spanEnd, 33);
                    }
                }
            }
        }
        try {
            text.setSpan(mtVar.B(str), i7, i10, 33);
        } catch (Exception unused) {
        }
        kt ktVar = mtVar.T1;
        if (ktVar != null) {
            ktVar.u();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // h2.j
    public void accept(Object obj) {
        p4.d1 d1Var = (p4.d1) this.c;
        Surface surface = (Surface) this.d;
        p4.h1 h1Var = (p4.h1) obj;
        ((p4.d0) d1Var.a.get()).getClass();
        if (surface == null) {
            h1Var.T(null);
            d1Var.i = null;
        } else {
            p4.c1 c1Var = new p4.c1(surface, this.a, this.b);
            d1Var.i = c1Var;
            h1Var.T(c1Var);
        }
    }

    public /* synthetic */ ht(p4.d1 d1Var, Surface surface, int i7, int i10) {
        this.c = d1Var;
        this.d = surface;
        this.a = i7;
        this.b = i10;
    }
}
