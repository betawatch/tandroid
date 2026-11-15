package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ku extends g.p {
    public final /* synthetic */ wu c;

    public ku(wu wuVar) {
        this.c = wuVar;
    }

    @Override // g.p
    public final int i(int i7) {
        TLRPC.StickerSet stickerSet;
        wu wuVar = this.c;
        v4.s sVar = wuVar.y1;
        iu iuVar = wuVar.p1;
        hi.v vVar = wuVar.r1;
        if (vVar.getAdapter() == null || vVar.getAdapter().d(i7) != 1) {
            return sVar.J;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList[] arrayListArr = iuVar.c;
            if (i10 >= arrayListArr.length) {
                break;
            }
            int size = arrayListArr[i10].size();
            if (iuVar.c.length > 1) {
                size = Math.min(sVar.J * 2, size);
            }
            i11 += size + 2;
            if (i7 < i11) {
                break;
            }
            i10++;
        }
        ArrayList arrayList = iuVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (arrayList == null || i10 >= arrayList.size()) ? null : (TLRPC.TL_messages_stickerSet) iuVar.b.get(i10);
        return (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) ? 5 : 8;
    }
}
