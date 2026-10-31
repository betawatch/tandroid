package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fn implements TextWatcher {
    public final /* synthetic */ en a;
    public final /* synthetic */ int b;
    public final /* synthetic */ fg.j c;

    public fn(fg.j jVar, en enVar, int i10) {
        this.c = jVar;
        this.a = enVar;
        this.b = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        jn jnVar = (jn) this.c.e;
        en enVar = this.a;
        if (enVar.getTag() != null) {
            return;
        }
        int i10 = this.b;
        int i11 = i10 == 11 ? jnVar.n0 : jnVar.m0;
        s4.c1 K = jnVar.s.K(i11);
        if (K != null && jnVar.y != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.k6.l(editable, enVar.getEditField().getPaint().getFontMetricsInt(), false);
            jnVar.y.setDirection(1);
            jnVar.y.setDelegate(enVar);
            jnVar.y.setTranslationY(K.a.getY());
            jnVar.y.e();
        }
        if (i10 == 11) {
            jnVar.O = editable;
        } else {
            jnVar.N = editable;
        }
        if (K != null) {
            jn.O(jnVar, K.a, i11);
        }
        jnVar.W();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
