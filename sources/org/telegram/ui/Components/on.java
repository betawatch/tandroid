package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
        s4.c1 L = unVar.s.L(i11);
        if (L != null && unVar.x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, nnVar.getEditField().getPaint().getFontMetricsInt(), false);
            unVar.x.setDirection(1);
            unVar.x.setDelegate(nnVar);
            unVar.x.setTranslationY(L.a.getY());
            unVar.x.e();
        }
        if (i10 == 11) {
            unVar.O = editable;
        } else {
            unVar.N = editable;
        }
        if (L != null) {
            un.L(unVar, L.a, i11);
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
