package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class jn implements TextWatcher {
    public final /* synthetic */ in a;
    public final /* synthetic */ int b;
    public final /* synthetic */ mn c;

    public jn(mn mnVar, in inVar, int i10) {
        this.c = mnVar;
        this.a = inVar;
        this.b = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        on onVar = this.c.d;
        in inVar = this.a;
        if (inVar.getTag() != null) {
            return;
        }
        int i10 = this.b;
        int i11 = i10 == 11 ? onVar.j0 : onVar.i0;
        f2.n1 K = onVar.s.K(i11);
        if (K != null && onVar.x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, inVar.getEditField().getPaint().getFontMetricsInt(), false);
            onVar.x.setDirection(1);
            onVar.x.setDelegate(inVar);
            onVar.x.setTranslationY(K.a.getY());
            onVar.x.e();
        }
        if (i10 == 11) {
            onVar.K = editable;
        } else {
            onVar.J = editable;
        }
        if (K != null) {
            on.K(onVar, K.a, i11);
        }
        onVar.T();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
