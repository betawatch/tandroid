package org.telegram.messenger;

import java.text.CollationKey;
import java.text.Collator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
