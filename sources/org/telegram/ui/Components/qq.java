package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public abstract class qq implements InputFilter {
    public final int a;

    public qq(int i10) {
        this.a = i10;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        int codePointCount = this.a - (Character.codePointCount(spanned, 0, spanned.length()) - Character.codePointCount(spanned, i12, i13));
        if (codePointCount <= 0) {
            return "";
        }
        if (codePointCount >= Character.codePointCount(charSequence, i10, i11)) {
            return null;
        }
        int i14 = codePointCount + i10;
        return (Character.isHighSurrogate(charSequence.charAt(i14 + (-1))) && (i14 = i14 + (-1)) == i10) ? "" : charSequence.subSequence(i10, i14);
    }
}
