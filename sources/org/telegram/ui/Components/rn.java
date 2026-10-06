package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class rn implements TextWatcher {
    public final /* synthetic */ qn a;
    public final /* synthetic */ int b;
    public final /* synthetic */ vn c;

    public rn(vn vnVar, qn qnVar, int i10) {
        this.c = vnVar;
        this.a = qnVar;
        this.b = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        xn xnVar = this.c.d;
        qn qnVar = this.a;
        if (qnVar.getTag() != null) {
            return;
        }
        int i10 = this.b;
        int i11 = i10 == 11 ? xnVar.n0 : xnVar.m0;
        s4.c1 K = xnVar.s.K(i11);
        if (K != null && xnVar.x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, qnVar.getEditField().getPaint().getFontMetricsInt(), false);
            xnVar.x.setDirection(1);
            xnVar.x.setDelegate(qnVar);
            xnVar.x.setTranslationY(K.a.getY());
            xnVar.x.e();
        }
        if (i10 == 11) {
            xnVar.O = editable;
        } else {
            xnVar.N = editable;
        }
        if (K != null) {
            xn.J(xnVar, K.a, i11);
        }
        xnVar.R();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
