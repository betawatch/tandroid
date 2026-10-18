package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class yn implements TextWatcher {
    public final /* synthetic */ xn a;
    public final /* synthetic */ int b;
    public final /* synthetic */ co c;

    public yn(co coVar, xn xnVar, int i10) {
        this.c = coVar;
        this.a = xnVar;
        this.b = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        fo foVar = this.c.d;
        xn xnVar = this.a;
        if (xnVar.getTag() != null) {
            return;
        }
        int i10 = this.b;
        int i11 = i10 == 11 ? foVar.n0 : foVar.m0;
        s4.b1 K = foVar.s.K(i11);
        if (K != null && foVar.x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, xnVar.getEditField().getPaint().getFontMetricsInt(), false);
            foVar.x.setDirection(1);
            foVar.x.setDelegate(xnVar);
            foVar.x.setTranslationY(K.a.getY());
            foVar.x.e();
        }
        if (i10 == 11) {
            foVar.O = editable;
        } else {
            foVar.N = editable;
        }
        if (K != null) {
            fo.O(foVar, K.a, i11);
        }
        foVar.W();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
