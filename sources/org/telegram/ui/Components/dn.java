package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class dn implements TextWatcher {
    public final /* synthetic */ cn a;
    public final /* synthetic */ int b;
    public final /* synthetic */ gn c;

    public dn(gn gnVar, cn cnVar, int i10) {
        this.c = gnVar;
        this.a = cnVar;
        this.b = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        in inVar = this.c.d;
        cn cnVar = this.a;
        if (cnVar.getTag() != null) {
            return;
        }
        int i10 = this.b;
        int i11 = i10 == 11 ? inVar.j0 : inVar.i0;
        f2.o1 K = inVar.s.K(i11);
        if (K != null && inVar.x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, cnVar.getEditField().getPaint().getFontMetricsInt(), false);
            inVar.x.setDirection(1);
            inVar.x.setDelegate(cnVar);
            inVar.x.setTranslationY(K.a.getY());
            inVar.x.e();
        }
        if (i10 == 11) {
            inVar.K = editable;
        } else {
            inVar.J = editable;
        }
        if (K != null) {
            in.L(inVar, K.a, i11);
        }
        inVar.T();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
