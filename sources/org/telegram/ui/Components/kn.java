package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class kn implements TextWatcher {
    public final /* synthetic */ jn a;
    public final /* synthetic */ int b;
    public final /* synthetic */ nn c;

    public kn(nn nnVar, jn jnVar, int i10) {
        this.c = nnVar;
        this.a = jnVar;
        this.b = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        pn pnVar = this.c.d;
        jn jnVar = this.a;
        if (jnVar.getTag() != null) {
            return;
        }
        int i10 = this.b;
        int i11 = i10 == 11 ? pnVar.k0 : pnVar.j0;
        f2.l1 K = pnVar.s.K(i11);
        if (K != null && pnVar.x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, jnVar.getEditField().getPaint().getFontMetricsInt(), false);
            pnVar.x.setDirection(1);
            pnVar.x.setDelegate(jnVar);
            pnVar.x.setTranslationY(K.a.getY());
            pnVar.x.e();
        }
        if (i10 == 11) {
            pnVar.L = editable;
        } else {
            pnVar.K = editable;
        }
        if (K != null) {
            pn.K(pnVar, K.a, i11);
        }
        pnVar.T();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
