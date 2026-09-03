package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class av extends f2.v {
    public final /* synthetic */ ov c;

    public av(ov ovVar) {
        this.c = ovVar;
    }

    @Override // f2.v
    public final int i(int i10) {
        TLRPC.StickerSet stickerSet;
        ov ovVar = this.c;
        f2.w wVar = ovVar.y;
        yu yuVar = ovVar.e;
        org.telegram.ui.k3 k3Var = ovVar.h;
        if (k3Var.getAdapter() == null || k3Var.getAdapter().j(i10) != 1) {
            return wVar.J;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = yuVar.c;
            if (i11 >= arrayListArr.length) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (yuVar.c.length > 1) {
                size = Math.min(wVar.J * 2, size);
            }
            i12 += size + 2;
            if (i10 < i12) {
                break;
            }
            i11++;
        }
        ArrayList arrayList = yuVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (arrayList == null || i11 >= arrayList.size()) ? null : (TLRPC.TL_messages_stickerSet) yuVar.b.get(i11);
        return (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) ? 5 : 8;
    }
}
