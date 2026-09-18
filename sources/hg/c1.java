package hg;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class c1 implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (charSequence == null) {
            return null;
        }
        String charSequence2 = charSequence.toString();
        if (charSequence2.contains("\n")) {
            return charSequence2.replaceAll("\n", "");
        }
        return null;
    }
}
