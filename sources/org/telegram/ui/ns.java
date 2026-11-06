package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ns implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ns(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((Comparator) this.b).compare(((ms) obj).a, ((ms) obj2).a);
            case 1:
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.b;
                int i7 = longSparseIntArray.get(((Long) obj).longValue());
                int i10 = longSparseIntArray.get(((Long) obj2).longValue());
                if (i7 > i10) {
                    return 1;
                }
                return i7 < i10 ? -1 : 0;
            case 2:
                org.telegram.messenger.ed edVar = (org.telegram.messenger.ed) this.b;
                org.telegram.messenger.ed edVar2 = (org.telegram.messenger.ed) obj;
                org.telegram.messenger.ed edVar3 = (org.telegram.messenger.ed) obj2;
                if (edVar2 != edVar) {
                    if (edVar3 != edVar) {
                        int i11 = edVar2.k;
                        int i12 = edVar3.k;
                        if (i11 == i12) {
                            return edVar2.a.compareTo(edVar3.a);
                        }
                        if (i11 <= i12) {
                            if (i11 >= i12) {
                                return 0;
                            }
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.b;
                int indexOf = stickersActivity.d.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf2 = stickersActivity.d.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf < 0 || indexOf2 < 0) {
                    return 0;
                }
                return indexOf - indexOf2;
        }
    }
}
