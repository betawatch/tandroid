package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class dv extends g.p {
    public final /* synthetic */ rv c;

    public dv(rv rvVar) {
        this.c = rvVar;
    }

    @Override // g.p
    public final int i(int i10) {
        TLRPC.StickerSet stickerSet;
        rv rvVar = this.c;
        s4.s sVar = rvVar.y;
        bv bvVar = rvVar.e;
        di.v vVar = rvVar.h;
        if (vVar.getAdapter() == null || vVar.getAdapter().j(i10) != 1) {
            return sVar.J;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = bvVar.c;
            if (i11 >= arrayListArr.length) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (bvVar.c.length > 1) {
                size = Math.min(sVar.J * 2, size);
            }
            i12 += size + 2;
            if (i10 < i12) {
                break;
            }
            i11++;
        }
        ArrayList arrayList = bvVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (arrayList == null || i11 >= arrayList.size()) ? null : (TLRPC.TL_messages_stickerSet) bvVar.b.get(i11);
        return (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) ? 5 : 8;
    }
}
