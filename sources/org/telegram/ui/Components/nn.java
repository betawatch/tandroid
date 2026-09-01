package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class nn implements TextWatcher {
    public final /* synthetic */ mn a;
    public final /* synthetic */ int b;
    public final /* synthetic */ qn c;

    public nn(qn qnVar, mn mnVar, int i10) {
        this.c = qnVar;
        this.a = mnVar;
        this.b = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        sn snVar = this.c.d;
        mn mnVar = this.a;
        if (mnVar.getTag() != null) {
            return;
        }
        int i10 = this.b;
        int i11 = i10 == 11 ? snVar.k0 : snVar.j0;
        f2.m1 K = snVar.s.K(i11);
        if (K != null && snVar.x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, mnVar.getEditField().getPaint().getFontMetricsInt(), false);
            snVar.x.setDirection(1);
            snVar.x.setDelegate(mnVar);
            snVar.x.setTranslationY(K.a.getY());
            snVar.x.e();
        }
        if (i10 == 11) {
            snVar.L = editable;
        } else {
            snVar.K = editable;
        }
        if (K != null) {
            sn.K(snVar, K.a, i11);
        }
        snVar.T();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
