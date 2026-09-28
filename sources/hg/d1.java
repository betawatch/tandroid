package hg;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class d1 implements InputFilter {
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
