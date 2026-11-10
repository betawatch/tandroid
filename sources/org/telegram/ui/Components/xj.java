package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xj implements InputFilter {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ xj(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        switch (this.a) {
            case 0:
                return hk.R((hk) this.b, charSequence, i7, i10, spanned, i11, i12);
            default:
                return (charSequence.length() <= 0 || !Character.isWhitespace(charSequence.charAt(0))) ? charSequence : (TextUtils.isEmpty(((bw0) this.b).getText()) || i11 == 0) ? "" : charSequence;
        }
    }
}
