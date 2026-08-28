package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class wp implements InputFilter {
    public final int a;

    public wp(int i9) {
        this.a = i9;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i9, int i10, Spanned spanned, int i11, int i12) {
        int codePointCount = this.a - (Character.codePointCount(spanned, 0, spanned.length()) - Character.codePointCount(spanned, i11, i12));
        if (codePointCount <= 0) {
            return "";
        }
        if (codePointCount >= Character.codePointCount(charSequence, i9, i10)) {
            return null;
        }
        int i13 = codePointCount + i9;
        return (Character.isHighSurrogate(charSequence.charAt(i13 + (-1))) && (i13 = i13 + (-1)) == i9) ? "" : charSequence.subSequence(i9, i13);
    }
}
