package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class eu extends g.p {
    public final /* synthetic */ qu c;

    public eu(qu quVar) {
        this.c = quVar;
    }

    @Override // g.p
    public final int i(int i7) {
        TLRPC.StickerSet stickerSet;
        qu quVar = this.c;
        v4.s sVar = quVar.x1;
        cu cuVar = quVar.o1;
        fi.v vVar = quVar.q1;
        if (vVar.getAdapter() == null || vVar.getAdapter().d(i7) != 1) {
            return sVar.J;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList[] arrayListArr = cuVar.c;
            if (i10 >= arrayListArr.length) {
                break;
            }
            int size = arrayListArr[i10].size();
            if (cuVar.c.length > 1) {
                size = Math.min(sVar.J * 2, size);
            }
            i11 += size + 2;
            if (i7 < i11) {
                break;
            }
            i10++;
        }
        ArrayList arrayList = cuVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (arrayList == null || i10 >= arrayList.size()) ? null : (TLRPC.TL_messages_stickerSet) cuVar.b.get(i10);
        return (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) ? 5 : 8;
    }
}
