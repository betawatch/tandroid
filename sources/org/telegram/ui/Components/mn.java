package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class mn implements TextWatcher {
    public final /* synthetic */ ln a;
    public final /* synthetic */ int b;
    public final /* synthetic */ pn c;

    public mn(pn pnVar, ln lnVar, int i10) {
        this.c = pnVar;
        this.a = lnVar;
        this.b = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        rn rnVar = this.c.d;
        ln lnVar = this.a;
        if (lnVar.getTag() != null) {
            return;
        }
        int i10 = this.b;
        int i11 = i10 == 11 ? rnVar.k0 : rnVar.j0;
        f2.m1 K = rnVar.s.K(i11);
        if (K != null && rnVar.x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, lnVar.getEditField().getPaint().getFontMetricsInt(), false);
            rnVar.x.setDirection(1);
            rnVar.x.setDelegate(lnVar);
            rnVar.x.setTranslationY(K.a.getY());
            rnVar.x.e();
        }
        if (i10 == 11) {
            rnVar.L = editable;
        } else {
            rnVar.K = editable;
        }
        if (K != null) {
            rn.K(rnVar, K.a, i11);
        }
        rnVar.T();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
