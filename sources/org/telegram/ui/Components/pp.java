package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public abstract class pp implements InputFilter {
    public final int a;

    public pp(int i7) {
        this.a = i7;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        int codePointCount = this.a - (Character.codePointCount(spanned, 0, spanned.length()) - Character.codePointCount(spanned, i11, i12));
        if (codePointCount <= 0) {
            return "";
        }
        if (codePointCount >= Character.codePointCount(charSequence, i7, i10)) {
            return null;
        }
        int i13 = codePointCount + i7;
        return (Character.isHighSurrogate(charSequence.charAt(i13 + (-1))) && (i13 = i13 + (-1)) == i7) ? "" : charSequence.subSequence(i7, i13);
    }
}
