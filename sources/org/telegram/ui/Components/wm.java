package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class wm implements TextWatcher {
    public final /* synthetic */ vm a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.n4 c;

    public wm(org.telegram.ui.n4 n4Var, vm vmVar, int i3) {
        this.c = n4Var;
        this.a = vmVar;
        this.b = i3;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        an anVar = (an) this.c.e;
        vm vmVar = this.a;
        if (vmVar.getTag() != null) {
            return;
        }
        int i3 = this.b;
        int i10 = i3 == 11 ? anVar.o0 : anVar.n0;
        u4.d1 K = anVar.s.K(i10);
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
        if (i3 == 11) {
            anVar.P = editable;
        } else {
            anVar.O = editable;
        }
        if (K != null) {
            an.P(anVar, K.a, i10);
        }
        anVar.X();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
