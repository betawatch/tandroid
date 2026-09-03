package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class xu extends f2.v {
    public final /* synthetic */ lv c;

    public xu(lv lvVar) {
        this.c = lvVar;
    }

    @Override // f2.v
    public final int i(int i10) {
        TLRPC.StickerSet stickerSet;
        lv lvVar = this.c;
        f2.w wVar = lvVar.y;
        vu vuVar = lvVar.e;
        org.telegram.ui.m3 m3Var = lvVar.h;
        if (m3Var.getAdapter() == null || m3Var.getAdapter().j(i10) != 1) {
            return wVar.J;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = vuVar.c;
            if (i11 >= arrayListArr.length) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (vuVar.c.length > 1) {
                size = Math.min(wVar.J * 2, size);
            }
            i12 += size + 2;
            if (i10 < i12) {
                break;
            }
            i11++;
        }
        ArrayList arrayList = vuVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (arrayList == null || i11 >= arrayList.size()) ? null : (TLRPC.TL_messages_stickerSet) vuVar.b.get(i11);
        return (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) ? 5 : 8;
    }
}
