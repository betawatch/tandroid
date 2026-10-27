package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class xe implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ LongSparseIntArray b;

    public /* synthetic */ xe(LongSparseIntArray longSparseIntArray, int i10) {
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
