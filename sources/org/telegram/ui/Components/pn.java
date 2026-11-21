package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class pn implements TextWatcher {
    public final /* synthetic */ on a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.l4 c;

    public pn(org.telegram.ui.l4 l4Var, on onVar, int i7) {
        this.c = l4Var;
        this.a = onVar;
        this.b = i7;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        tn tnVar = (tn) this.c.e;
        on onVar = this.a;
        if (onVar.getTag() != null) {
            return;
        }
        int i7 = this.b;
        int i10 = i7 == 11 ? tnVar.o0 : tnVar.n0;
        v4.f1 K = tnVar.s.K(i10);
        if (K != null && tnVar.y != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.j6.l(editable, onVar.getEditField().getPaint().getFontMetricsInt(), false);
            tnVar.y.setDirection(1);
            tnVar.y.setDelegate(onVar);
            tnVar.y.setTranslationY(K.a.getY());
            tnVar.y.e();
        }
        if (i7 == 11) {
            tnVar.P = editable;
        } else {
            tnVar.O = editable;
        }
        if (K != null) {
            tn.Q(tnVar, K.a, i10);
        }
        tnVar.Y();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
