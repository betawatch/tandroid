package org.telegram.messenger;

import java.text.CollationKey;
import java.text.Collator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
