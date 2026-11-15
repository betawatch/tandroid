package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class fn implements TextWatcher {
    public final /* synthetic */ en a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.l4 c;

    public fn(org.telegram.ui.l4 l4Var, en enVar, int i7) {
        this.c = l4Var;
        this.a = enVar;
        this.b = i7;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        jn jnVar = (jn) this.c.e;
        en enVar = this.a;
        if (enVar.getTag() != null) {
            return;
        }
        int i7 = this.b;
        int i10 = i7 == 11 ? jnVar.o0 : jnVar.n0;
        v4.e1 K = jnVar.s.K(i10);
        if (K != null && jnVar.y != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.j6.l(editable, enVar.getEditField().getPaint().getFontMetricsInt(), false);
            jnVar.y.setDirection(1);
            jnVar.y.setDelegate(enVar);
            jnVar.y.setTranslationY(K.a.getY());
            jnVar.y.e();
        }
        if (i7 == 11) {
            jnVar.P = editable;
        } else {
            jnVar.O = editable;
        }
        if (K != null) {
            jn.Q(jnVar, K.a, i10);
        }
        jnVar.Y();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
