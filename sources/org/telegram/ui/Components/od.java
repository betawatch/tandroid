package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class od implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        int i14 = ChatActivityEnterView.i5;
        for (int i15 = i10; i15 < i11; i15++) {
            char charAt = charSequence.charAt(i15);
            if (charAt == '\n' || charAt == '\r') {
                StringBuilder sb2 = new StringBuilder(i11 - i10);
                while (i10 < i11) {
                    char charAt2 = charSequence.charAt(i10);
                    if (charAt2 != '\n' && charAt2 != '\r') {
                        sb2.append(charAt2);
                    }
                    i10++;
                }
                return sb2;
            }
        }
        return null;
    }
}
