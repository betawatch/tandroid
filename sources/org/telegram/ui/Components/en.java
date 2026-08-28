package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class en implements TextWatcher {
    public final /* synthetic */ dn a;
    public final /* synthetic */ int b;
    public final /* synthetic */ hn c;

    public en(hn hnVar, dn dnVar, int i9) {
        this.c = hnVar;
        this.a = dnVar;
        this.b = i9;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        jn jnVar = this.c.d;
        dn dnVar = this.a;
        if (dnVar.getTag() != null) {
            return;
        }
        int i9 = this.b;
        int i10 = i9 == 11 ? jnVar.j0 : jnVar.i0;
        f2.q1 K = jnVar.s.K(i10);
        if (K != null && jnVar.x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, dnVar.getEditField().getPaint().getFontMetricsInt(), false);
            jnVar.x.setDirection(1);
            jnVar.x.setDelegate(dnVar);
            jnVar.x.setTranslationY(K.a.getY());
            jnVar.x.e();
        }
        if (i9 == 11) {
            jnVar.K = editable;
        } else {
            jnVar.J = editable;
        }
        if (K != null) {
            jn.K(jnVar, K.a, i10);
        }
        jnVar.S();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
