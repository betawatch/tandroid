package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class ue implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ LongSparseIntArray b;

    public /* synthetic */ ue(LongSparseIntArray longSparseIntArray, int i10) {
        this.a = i10;
        this.b = longSparseIntArray;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$checkLoadedRemoteFilters$71;
        int lambda$resetDialogs$97;
        Long l4 = (Long) obj;
        Long l10 = (Long) obj2;
        switch (this.a) {
            case 0:
                lambda$checkLoadedRemoteFilters$71 = MessagesStorage.lambda$checkLoadedRemoteFilters$71(this.b, l4, l10);
                return lambda$checkLoadedRemoteFilters$71;
            default:
                lambda$resetDialogs$97 = MessagesStorage.lambda$resetDialogs$97(this.b, l4, l10);
                return lambda$resetDialogs$97;
        }
    }
}
