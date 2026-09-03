package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ld implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        int i14 = ChatActivityEnterView.j5;
        for (int i15 = i10; i15 < i11; i15++) {
            char charAt = charSequence.charAt(i15);
            if (charAt == '\n' || charAt == '\r') {
                StringBuilder sb = new StringBuilder(i11 - i10);
                while (i10 < i11) {
                    char charAt2 = charSequence.charAt(i10);
                    if (charAt2 != '\n' && charAt2 != '\r') {
                        sb.append(charAt2);
                    }
                    i10++;
                }
                return sb;
            }
        }
        return null;
    }
}
