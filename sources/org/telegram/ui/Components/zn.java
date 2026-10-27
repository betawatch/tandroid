package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class zn implements TextWatcher {
    public final /* synthetic */ yn a;
    public final /* synthetic */ int b;
    public final /* synthetic */ eo c;

    public zn(eo eoVar, yn ynVar, int i10) {
        this.c = eoVar;
        this.a = ynVar;
        this.b = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        go goVar = this.c.d;
        yn ynVar = this.a;
        if (ynVar.getTag() != null) {
            return;
        }
        int i10 = this.b;
        int i11 = i10 == 11 ? goVar.n0 : goVar.m0;
        s4.e1 K = goVar.s.K(i11);
        if (K != null && goVar.x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, ynVar.getEditField().getPaint().getFontMetricsInt(), false);
            goVar.x.setDirection(1);
            goVar.x.setDelegate(ynVar);
            goVar.x.setTranslationY(K.a.getY());
            goVar.x.e();
        }
        if (i10 == 11) {
            goVar.O = editable;
        } else {
            goVar.N = editable;
        }
        if (K != null) {
            go.O(goVar, K.a, i11);
        }
        goVar.W();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
