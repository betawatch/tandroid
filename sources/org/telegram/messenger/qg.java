package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class qg implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ LongSparseIntArray b;

    public /* synthetic */ qg(LongSparseIntArray longSparseIntArray, int i10) {
        this.a = i10;
        this.b = longSparseIntArray;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$checkLoadedRemoteFilters$68;
        int lambda$resetDialogs$94;
        Long l10 = (Long) obj;
        Long l11 = (Long) obj2;
        switch (this.a) {
            case 0:
                lambda$checkLoadedRemoteFilters$68 = MessagesStorage.lambda$checkLoadedRemoteFilters$68(this.b, l10, l11);
                return lambda$checkLoadedRemoteFilters$68;
            default:
                lambda$resetDialogs$94 = MessagesStorage.lambda$resetDialogs$94(this.b, l10, l11);
                return lambda$resetDialogs$94;
        }
    }
}
