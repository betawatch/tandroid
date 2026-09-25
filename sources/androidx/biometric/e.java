package androidx.biometric;

import java.util.Arrays;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class e {
    public final int a;
    public final CharSequence b;

    public e(int i10, CharSequence charSequence) {
        this.a = i10;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.a != eVar.a) {
            return false;
        }
        CharSequence charSequence = eVar.b;
        CharSequence charSequence2 = this.b;
        String charSequence3 = charSequence2 != null ? charSequence2.toString() : null;
        String charSequence4 = charSequence != null ? charSequence.toString() : null;
        if (charSequence3 == null && charSequence4 == null) {
            return true;
        }
        return charSequence3 != null && charSequence3.equals(charSequence4);
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.a);
        CharSequence charSequence = this.b;
        return Arrays.hashCode(new Object[]{valueOf, charSequence != null ? charSequence.toString() : null});
    }
}
