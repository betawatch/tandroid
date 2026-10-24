package ig;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class a1 implements InputFilter {
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
