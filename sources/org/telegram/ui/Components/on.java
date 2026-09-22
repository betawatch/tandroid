package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class on implements TextWatcher {
    public final /* synthetic */ nn a;
    public final /* synthetic */ int b;
    public final /* synthetic */ sn c;

    public on(sn snVar, nn nnVar, int i10) {
        this.c = snVar;
        this.a = nnVar;
        this.b = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        un unVar = this.c.d;
        nn nnVar = this.a;
        if (nnVar.getTag() != null) {
            return;
        }
        int i10 = this.b;
        int i11 = i10 == 11 ? unVar.n0 : unVar.m0;
        s4.c1 K = unVar.s.K(i11);
        if (K != null && unVar.x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, nnVar.getEditField().getPaint().getFontMetricsInt(), false);
            unVar.x.setDirection(1);
            unVar.x.setDelegate(nnVar);
            unVar.x.setTranslationY(K.a.getY());
            unVar.x.e();
        }
        if (i10 == 11) {
            unVar.O = editable;
        } else {
            unVar.N = editable;
        }
        if (K != null) {
            un.L(unVar, K.a, i11);
        }
        unVar.T();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
