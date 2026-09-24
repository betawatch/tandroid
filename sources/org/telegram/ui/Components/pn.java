package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class pn implements TextWatcher {
    public final /* synthetic */ on a;
    public final /* synthetic */ int b;
    public final /* synthetic */ tn c;

    public pn(tn tnVar, on onVar, int i10) {
        this.c = tnVar;
        this.a = onVar;
        this.b = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        vn vnVar = this.c.d;
        on onVar = this.a;
        if (onVar.getTag() != null) {
            return;
        }
        int i10 = this.b;
        int i11 = i10 == 11 ? vnVar.n0 : vnVar.m0;
        s4.c1 K = vnVar.s.K(i11);
        if (K != null && vnVar.x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, onVar.getEditField().getPaint().getFontMetricsInt(), false);
            vnVar.x.setDirection(1);
            vnVar.x.setDelegate(onVar);
            vnVar.x.setTranslationY(K.a.getY());
            vnVar.x.e();
        }
        if (i10 == 11) {
            vnVar.O = editable;
        } else {
            vnVar.N = editable;
        }
        if (K != null) {
            vn.L(vnVar, K.a, i11);
        }
        vnVar.T();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
