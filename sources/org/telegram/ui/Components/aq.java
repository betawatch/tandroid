package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class aq implements InputFilter {
    public final int a;

    public aq(int i10) {
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
