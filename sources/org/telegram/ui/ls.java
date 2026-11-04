package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ls implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ls(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((Comparator) this.b).compare(((ks) obj).a, ((ks) obj2).a);
            case 1:
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.b;
                int i3 = longSparseIntArray.get(((Long) obj).longValue());
                int i10 = longSparseIntArray.get(((Long) obj2).longValue());
                if (i3 > i10) {
                    return 1;
                }
                return i3 < i10 ? -1 : 0;
            case 2:
                org.telegram.messenger.yc ycVar = (org.telegram.messenger.yc) this.b;
                org.telegram.messenger.yc ycVar2 = (org.telegram.messenger.yc) obj;
                org.telegram.messenger.yc ycVar3 = (org.telegram.messenger.yc) obj2;
                if (ycVar2 != ycVar) {
                    if (ycVar3 != ycVar) {
                        int i11 = ycVar2.k;
                        int i12 = ycVar3.k;
                        if (i11 == i12) {
                            return ycVar2.a.compareTo(ycVar3.a);
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
