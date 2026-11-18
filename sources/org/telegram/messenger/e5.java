package org.telegram.messenger;

import java.text.CollationKey;
import java.text.Collator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class e5 extends Collator {
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
