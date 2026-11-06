package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class xm implements TextWatcher {
    public final /* synthetic */ wm a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.l4 c;

    public xm(org.telegram.ui.l4 l4Var, wm wmVar, int i7) {
        this.c = l4Var;
        this.a = wmVar;
        this.b = i7;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        bn bnVar = (bn) this.c.e;
        wm wmVar = this.a;
        if (wmVar.getTag() != null) {
            return;
        }
        int i7 = this.b;
        int i10 = i7 == 11 ? bnVar.n0 : bnVar.m0;
        v4.d1 K = bnVar.s.K(i10);
        if (K != null && bnVar.y != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.i6.l(editable, wmVar.getEditField().getPaint().getFontMetricsInt(), false);
            bnVar.y.setDirection(1);
            bnVar.y.setDelegate(wmVar);
            bnVar.y.setTranslationY(K.a.getY());
            bnVar.y.e();
        }
        if (i7 == 11) {
            bnVar.O = editable;
        } else {
            bnVar.N = editable;
        }
        if (K != null) {
            bn.P(bnVar, K.a, i10);
        }
        bnVar.X();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
