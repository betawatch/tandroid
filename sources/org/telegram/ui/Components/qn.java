package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class qn implements TextWatcher {
    public final /* synthetic */ pn a;
    public final /* synthetic */ int b;
    public final /* synthetic */ un c;

    public qn(un unVar, pn pnVar, int i10) {
        this.c = unVar;
        this.a = pnVar;
        this.b = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        wn wnVar = this.c.d;
        pn pnVar = this.a;
        if (pnVar.getTag() != null) {
            return;
        }
        int i10 = this.b;
        int i11 = i10 == 11 ? wnVar.n0 : wnVar.m0;
        s4.c1 K = wnVar.s.K(i11);
        if (K != null && wnVar.x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, pnVar.getEditField().getPaint().getFontMetricsInt(), false);
            wnVar.x.setDirection(1);
            wnVar.x.setDelegate(pnVar);
            wnVar.x.setTranslationY(K.a.getY());
            wnVar.x.e();
        }
        if (i10 == 11) {
            wnVar.O = editable;
        } else {
            wnVar.N = editable;
        }
        if (K != null) {
            wn.L(wnVar, K.a, i11);
        }
        wnVar.T();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
