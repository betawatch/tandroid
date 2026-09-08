package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class nn implements TextWatcher {
    public final /* synthetic */ mn a;
    public final /* synthetic */ int b;
    public final /* synthetic */ rn c;

    public nn(rn rnVar, mn mnVar, int i10) {
        this.c = rnVar;
        this.a = mnVar;
        this.b = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        tn tnVar = this.c.d;
        mn mnVar = this.a;
        if (mnVar.getTag() != null) {
            return;
        }
        int i10 = this.b;
        int i11 = i10 == 11 ? tnVar.n0 : tnVar.m0;
        s4.c1 K = tnVar.s.K(i11);
        if (K != null && tnVar.x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, mnVar.getEditField().getPaint().getFontMetricsInt(), false);
            tnVar.x.setDirection(1);
            tnVar.x.setDelegate(mnVar);
            tnVar.x.setTranslationY(K.a.getY());
            tnVar.x.e();
        }
        if (i10 == 11) {
            tnVar.O = editable;
        } else {
            tnVar.N = editable;
        }
        if (K != null) {
            tn.L(tnVar, K.a, i11);
        }
        tnVar.T();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
