package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class yu extends f2.v {
    public final /* synthetic */ mv c;

    public yu(mv mvVar) {
        this.c = mvVar;
    }

    @Override // f2.v
    public final int i(int i10) {
        TLRPC.StickerSet stickerSet;
        mv mvVar = this.c;
        f2.w wVar = mvVar.y;
        wu wuVar = mvVar.e;
        org.telegram.ui.k3 k3Var = mvVar.h;
        if (k3Var.getAdapter() == null || k3Var.getAdapter().j(i10) != 1) {
            return wVar.J;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = wuVar.c;
            if (i11 >= arrayListArr.length) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (wuVar.c.length > 1) {
                size = Math.min(wVar.J * 2, size);
            }
            i12 += size + 2;
            if (i10 < i12) {
                break;
            }
            i11++;
        }
        ArrayList arrayList = wuVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (arrayList == null || i11 >= arrayList.size()) ? null : (TLRPC.TL_messages_stickerSet) wuVar.b.get(i11);
        return (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) ? 5 : 8;
    }
}
