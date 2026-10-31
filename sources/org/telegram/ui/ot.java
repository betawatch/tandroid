package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ot implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ot(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((Comparator) this.b).compare(((nt) obj).a, ((nt) obj2).a);
            case 1:
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.b;
                int i10 = longSparseIntArray.get(((Long) obj).longValue());
                int i11 = longSparseIntArray.get(((Long) obj2).longValue());
                if (i10 > i11) {
                    return 1;
                }
                return i10 < i11 ? -1 : 0;
            case 2:
                org.telegram.messenger.zc zcVar = (org.telegram.messenger.zc) this.b;
                org.telegram.messenger.zc zcVar2 = (org.telegram.messenger.zc) obj;
                org.telegram.messenger.zc zcVar3 = (org.telegram.messenger.zc) obj2;
                if (zcVar2 != zcVar) {
                    if (zcVar3 != zcVar) {
                        int i12 = zcVar2.k;
                        int i13 = zcVar3.k;
                        if (i12 == i13) {
                            return zcVar2.a.compareTo(zcVar3.a);
                        }
                        if (i12 <= i13) {
                            if (i12 >= i13) {
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
