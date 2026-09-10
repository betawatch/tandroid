package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class un implements TextWatcher {
    public final /* synthetic */ tn a;
    public final /* synthetic */ int b;
    public final /* synthetic */ xn c;

    public un(xn xnVar, tn tnVar, int i10) {
        this.c = xnVar;
        this.a = tnVar;
        this.b = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        zn znVar = this.c.d;
        tn tnVar = this.a;
        if (tnVar.getTag() != null) {
            return;
        }
        int i10 = this.b;
        int i11 = i10 == 11 ? znVar.n0 : znVar.m0;
        s4.c1 K = znVar.s.K(i11);
        if (K != null && znVar.x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, tnVar.getEditField().getPaint().getFontMetricsInt(), false);
            znVar.x.setDirection(1);
            znVar.x.setDelegate(tnVar);
            znVar.x.setTranslationY(K.a.getY());
            znVar.x.e();
        }
        if (i10 == 11) {
            znVar.O = editable;
        } else {
            znVar.N = editable;
        }
        if (K != null) {
            zn.L(znVar, K.a, i11);
        }
        znVar.T();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
