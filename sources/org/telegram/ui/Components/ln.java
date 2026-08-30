package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ln implements TextWatcher {
    public final /* synthetic */ kn a;
    public final /* synthetic */ int b;
    public final /* synthetic */ on c;

    public ln(on onVar, kn knVar, int i10) {
        this.c = onVar;
        this.a = knVar;
        this.b = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        qn qnVar = this.c.d;
        kn knVar = this.a;
        if (knVar.getTag() != null) {
            return;
        }
        int i10 = this.b;
        int i11 = i10 == 11 ? qnVar.k0 : qnVar.j0;
        f2.l1 K = qnVar.s.K(i11);
        if (K != null && qnVar.x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, knVar.getEditField().getPaint().getFontMetricsInt(), false);
            qnVar.x.setDirection(1);
            qnVar.x.setDelegate(knVar);
            qnVar.x.setTranslationY(K.a.getY());
            qnVar.x.e();
        }
        if (i10 == 11) {
            qnVar.L = editable;
        } else {
            qnVar.K = editable;
        }
        if (K != null) {
            qn.K(qnVar, K.a, i11);
        }
        qnVar.T();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
