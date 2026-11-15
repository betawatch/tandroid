package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class xp implements InputFilter {
    public final int a;

    public xp(int i7) {
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
