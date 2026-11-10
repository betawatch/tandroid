package kg;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class y0 implements InputFilter {
    public final /* synthetic */ int a;

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        switch (this.a) {
            case 0:
                if (charSequence != null) {
                    String charSequence2 = charSequence.toString();
                    if (charSequence2.contains("\n")) {
                        return charSequence2.replaceAll("\n", "");
                    }
                }
                return null;
            default:
                return String.valueOf(charSequence).replaceAll("[^\\d_\\p{L}\\x{200c}\\x{00b7}\\x{0d80}-\\x{0dff}]", "");
        }
    }
}
