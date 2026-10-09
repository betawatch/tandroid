package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class fo implements TextWatcher {
    public final /* synthetic */ eo a;
    public final /* synthetic */ int b;
    public final /* synthetic */ jo c;

    public fo(jo joVar, eo eoVar, int i10) {
        this.c = joVar;
        this.a = eoVar;
        this.b = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        lo loVar = this.c.d;
        eo eoVar = this.a;
        if (eoVar.getTag() != null) {
            return;
        }
        int i10 = this.b;
        int i11 = i10 == 11 ? loVar.n0 : loVar.m0;
        s4.d1 K = loVar.s.K(i11);
        if (K != null && loVar.x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, eoVar.getEditField().getPaint().getFontMetricsInt(), false);
            loVar.x.setDirection(1);
            loVar.x.setDelegate(eoVar);
            loVar.x.setTranslationY(K.a.getY());
            loVar.x.e();
        }
        if (i10 == 11) {
            loVar.O = editable;
        } else {
            loVar.N = editable;
        }
        if (K != null) {
            lo.O(loVar, K.a, i11);
        }
        loVar.W();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
