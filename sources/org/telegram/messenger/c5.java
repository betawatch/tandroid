package org.telegram.messenger;

import java.text.CollationKey;
import java.text.Collator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
