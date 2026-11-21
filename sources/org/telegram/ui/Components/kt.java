package org.telegram.ui.Components;

import android.text.Editable;
import android.text.style.CharacterStyle;
import android.view.Surface;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kt implements nt, h2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kt(ot otVar, int i7, int i10, Runnable runnable) {
        this.c = otVar;
        this.a = i7;
        this.b = i10;
        this.d = runnable;
    }

    @Override // org.telegram.ui.Components.nt
    public void a(String str) {
        ot otVar = (ot) this.c;
        Runnable runnable = (Runnable) this.d;
        Editable text = otVar.getText();
        int i7 = this.a;
        int i10 = this.b;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i7, i10, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof y5) && !(characterStyle instanceof ih0)) {
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
            text.setSpan(otVar.B(str), i7, i10, 33);
        } catch (Exception unused) {
        }
        mt mtVar = otVar.T1;
        if (mtVar != null) {
            mtVar.g();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // h2.j
    public void accept(Object obj) {
        p4.e1 e1Var = (p4.e1) this.c;
        Surface surface = (Surface) this.d;
        p4.i1 i1Var = (p4.i1) obj;
        ((p4.e0) e1Var.a.get()).getClass();
        if (surface == null) {
            i1Var.S(null);
            e1Var.i = null;
        } else {
            p4.d1 d1Var = new p4.d1(surface, this.a, this.b);
            e1Var.i = d1Var;
            i1Var.S(d1Var);
        }
    }

    public /* synthetic */ kt(p4.e1 e1Var, Surface surface, int i7, int i10) {
        this.c = e1Var;
        this.d = surface;
        this.a = i7;
        this.b = i10;
    }
}
