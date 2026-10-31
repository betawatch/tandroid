package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class fr implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ LongSparseIntArray b;

    public /* synthetic */ fr(LongSparseIntArray longSparseIntArray, int i10) {
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
