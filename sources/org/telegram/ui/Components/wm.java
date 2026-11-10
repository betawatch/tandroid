package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class wm implements TextWatcher {
    public final /* synthetic */ vm a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.l4 c;

    public wm(org.telegram.ui.l4 l4Var, vm vmVar, int i7) {
        this.c = l4Var;
        this.a = vmVar;
        this.b = i7;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        an anVar = (an) this.c.e;
        vm vmVar = this.a;
        if (vmVar.getTag() != null) {
            return;
        }
        int i7 = this.b;
        int i10 = i7 == 11 ? anVar.n0 : anVar.m0;
        v4.d1 K = anVar.s.K(i10);
        if (K != null && anVar.y != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.i6.l(editable, vmVar.getEditField().getPaint().getFontMetricsInt(), false);
            anVar.y.setDirection(1);
            anVar.y.setDelegate(vmVar);
            anVar.y.setTranslationY(K.a.getY());
            anVar.y.e();
        }
        if (i7 == 11) {
            anVar.O = editable;
        } else {
            anVar.N = editable;
        }
        if (K != null) {
            an.P(anVar, K.a, i10);
        }
        anVar.X();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
