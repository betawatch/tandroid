package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class bo implements TextWatcher {
    public final /* synthetic */ ao a;
    public final /* synthetic */ int b;
    public final /* synthetic */ go c;

    public bo(go goVar, ao aoVar, int i10) {
        this.c = goVar;
        this.a = aoVar;
        this.b = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        io ioVar = this.c.d;
        ao aoVar = this.a;
        if (aoVar.getTag() != null) {
            return;
        }
        int i10 = this.b;
        int i11 = i10 == 11 ? ioVar.n0 : ioVar.m0;
        s4.b1 K = ioVar.s.K(i11);
        if (K != null && ioVar.x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, aoVar.getEditField().getPaint().getFontMetricsInt(), false);
            ioVar.x.setDirection(1);
            ioVar.x.setDelegate(aoVar);
            ioVar.x.setTranslationY(K.a.getY());
            ioVar.x.e();
        }
        if (i10 == 11) {
            ioVar.O = editable;
        } else {
            ioVar.N = editable;
        }
        if (K != null) {
            io.O(ioVar, K.a, i11);
        }
        ioVar.W();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
