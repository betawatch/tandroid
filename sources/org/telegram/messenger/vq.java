package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class vq implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ LongSparseIntArray b;

    public /* synthetic */ vq(LongSparseIntArray longSparseIntArray, int i7) {
        this.a = i7;
        this.b = longSparseIntArray;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Long l10 = (Long) obj;
        Long l11 = (Long) obj2;
        switch (this.a) {
            case 0:
                long longValue = l10.longValue();
                LongSparseIntArray longSparseIntArray = this.b;
                int i7 = longSparseIntArray.get(longValue);
                int i10 = longSparseIntArray.get(l11.longValue());
                if (i7 <= i10) {
                    if (i7 < i10) {
                    }
                }
                break;
            default:
                long longValue2 = l10.longValue();
                LongSparseIntArray longSparseIntArray2 = this.b;
                int i11 = longSparseIntArray2.get(longValue2);
                int i12 = longSparseIntArray2.get(l11.longValue());
                if (i11 >= i12) {
                    if (i11 > i12) {
                    }
                }
                break;
        }
        return 0;
    }
}
