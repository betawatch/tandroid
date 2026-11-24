// default package

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class dk2 implements InputFilter {
    public final short a;

    /* JADX WARN: Multi-variable type inference failed */
    public dk2(int i) {
        this.a = i;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int codePointCount = this.a - (Character.codePointCount(spanned, 0, spanned.length()) - Character.codePointCount(spanned, i3, i4));
        if (codePointCount <= 0) {
            return "";
        }
        if (codePointCount >= Character.codePointCount(charSequence, i, i2)) {
            return null;
        }
        int i5 = codePointCount + i;
        return (Character.isHighSurrogate(charSequence.charAt(i5 + (-1))) && (i5 = i5 + (-1)) == i) ? "" : charSequence.subSequence(i, i5);
    }
}
