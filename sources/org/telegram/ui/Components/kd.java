package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kd implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i9, int i10, Spanned spanned, int i11, int i12) {
        int i13 = ChatActivityEnterView.i5;
        for (int i14 = i9; i14 < i10; i14++) {
            char charAt = charSequence.charAt(i14);
            if (charAt == '\n' || charAt == '\r') {
                StringBuilder sb2 = new StringBuilder(i10 - i9);
                while (i9 < i10) {
                    char charAt2 = charSequence.charAt(i9);
                    if (charAt2 != '\n' && charAt2 != '\r') {
                        sb2.append(charAt2);
                    }
                    i9++;
                }
                return sb2;
            }
        }
        return null;
    }
}
