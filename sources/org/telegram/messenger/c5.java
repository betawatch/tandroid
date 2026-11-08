package org.telegram.messenger;

import java.text.CollationKey;
import java.text.Collator;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class c5 extends Collator {
    @Override // java.text.Collator
    public final int compare(String str, String str2) {
        if (str == null || str2 == null) {
            return 0;
        }
        return str.compareTo(str2);
    }

    @Override // java.text.Collator
    public final CollationKey getCollationKey(String str) {
        return null;
    }

    @Override // java.text.Collator
    public final int hashCode() {
        return 0;
    }
}
