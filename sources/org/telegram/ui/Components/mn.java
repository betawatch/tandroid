package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class mn implements TextWatcher {
    public final /* synthetic */ ln a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.l4 c;

    public mn(org.telegram.ui.l4 l4Var, ln lnVar, int i7) {
        this.c = l4Var;
        this.a = lnVar;
        this.b = i7;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        qn qnVar = (qn) this.c.e;
        ln lnVar = this.a;
        if (lnVar.getTag() != null) {
            return;
        }
        int i7 = this.b;
        int i10 = i7 == 11 ? qnVar.o0 : qnVar.n0;
        v4.f1 K = qnVar.s.K(i10);
        if (K != null && qnVar.y != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.j6.l(editable, lnVar.getEditField().getPaint().getFontMetricsInt(), false);
            qnVar.y.setDirection(1);
            qnVar.y.setDelegate(lnVar);
            qnVar.y.setTranslationY(K.a.getY());
            qnVar.y.e();
        }
        if (i7 == 11) {
            qnVar.P = editable;
        } else {
            qnVar.O = editable;
        }
        if (K != null) {
            qn.Q(qnVar, K.a, i10);
        }
        qnVar.Y();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
