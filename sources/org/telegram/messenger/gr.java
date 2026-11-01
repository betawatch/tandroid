package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class gr implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ LongSparseIntArray b;

    public /* synthetic */ gr(LongSparseIntArray longSparseIntArray, int i10) {
        this.a = i10;
        this.b = longSparseIntArray;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Long l4 = (Long) obj;
        Long l10 = (Long) obj2;
        switch (this.a) {
            case 0:
                long longValue = l4.longValue();
                LongSparseIntArray longSparseIntArray = this.b;
                int i10 = longSparseIntArray.get(longValue);
                int i11 = longSparseIntArray.get(l10.longValue());
                if (i10 <= i11) {
                    if (i10 < i11) {
                    }
                }
                break;
            default:
                long longValue2 = l4.longValue();
                LongSparseIntArray longSparseIntArray2 = this.b;
                int i12 = longSparseIntArray2.get(longValue2);
                int i13 = longSparseIntArray2.get(l10.longValue());
                if (i12 >= i13) {
                    if (i12 > i13) {
                    }
                }
                break;
        }
        return 0;
    }
}
