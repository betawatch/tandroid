package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class nn implements TextWatcher {
    public final /* synthetic */ mn a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.l4 c;

    public nn(org.telegram.ui.l4 l4Var, mn mnVar, int i7) {
        this.c = l4Var;
        this.a = mnVar;
        this.b = i7;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        rn rnVar = (rn) this.c.e;
        mn mnVar = this.a;
        if (mnVar.getTag() != null) {
            return;
        }
        int i7 = this.b;
        int i10 = i7 == 11 ? rnVar.o0 : rnVar.n0;
        v4.f1 K = rnVar.s.K(i10);
        if (K != null && rnVar.y != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.j6.l(editable, mnVar.getEditField().getPaint().getFontMetricsInt(), false);
            rnVar.y.setDirection(1);
            rnVar.y.setDelegate(mnVar);
            rnVar.y.setTranslationY(K.a.getY());
            rnVar.y.e();
        }
        if (i7 == 11) {
            rnVar.P = editable;
        } else {
            rnVar.O = editable;
        }
        if (K != null) {
            rn.Q(rnVar, K.a, i10);
        }
        rnVar.Y();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
