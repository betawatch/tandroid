package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class du extends g.p {
    public final /* synthetic */ pu c;

    public du(pu puVar) {
        this.c = puVar;
    }

    @Override // g.p
    public final int i(int i3) {
        TLRPC.StickerSet stickerSet;
        pu puVar = this.c;
        u4.s sVar = puVar.v1;
        bu buVar = puVar.m1;
        gi.v vVar = puVar.o1;
        if (vVar.getAdapter() == null || vVar.getAdapter().d(i3) != 1) {
            return sVar.J;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList[] arrayListArr = buVar.c;
            if (i10 >= arrayListArr.length) {
                break;
            }
            int size = arrayListArr[i10].size();
            if (buVar.c.length > 1) {
                size = Math.min(sVar.J * 2, size);
            }
            i11 += size + 2;
            if (i3 < i11) {
                break;
            }
            i10++;
        }
        ArrayList arrayList = buVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (arrayList == null || i10 >= arrayList.size()) ? null : (TLRPC.TL_messages_stickerSet) buVar.b.get(i10);
        return (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) ? 5 : 8;
    }
}
