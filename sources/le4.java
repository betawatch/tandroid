// default package

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class le4 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LongSparseIntArray b;

    public /* synthetic */ le4(LongSparseIntArray longSparseIntArray, byte b) {
        this.a = b;
        this.b = longSparseIntArray;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        LongSparseIntArray longSparseIntArray = this.b;
        Long l = (Long) obj;
        Long l2 = (Long) obj2;
        switch (b) {
            case 0:
                int i = longSparseIntArray.get(l.longValue());
                int i2 = longSparseIntArray.get(l2.longValue());
                if (i <= i2) {
                    if (i < i2) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 1:
                int i3 = longSparseIntArray.get(l.longValue());
                int i4 = longSparseIntArray.get(l2.longValue());
                if (i3 <= i4) {
                    if (i3 < i4) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            default:
                int i5 = longSparseIntArray.get(l.longValue());
                int i6 = longSparseIntArray.get(l2.longValue());
                if (i5 >= i6) {
                    if (i5 > i6) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return -1;
    }
}
