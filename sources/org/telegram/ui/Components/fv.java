package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class fv extends g.p {
    public final /* synthetic */ tv c;

    public fv(tv tvVar) {
        this.c = tvVar;
    }

    @Override // g.p
    public final int i(int i10) {
        TLRPC.StickerSet stickerSet;
        tv tvVar = this.c;
        s4.s sVar = tvVar.y;
        dv dvVar = tvVar.e;
        ci.v vVar = tvVar.h;
        if (vVar.getAdapter() == null || vVar.getAdapter().j(i10) != 1) {
            return sVar.J;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = dvVar.c;
            if (i11 >= arrayListArr.length) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (dvVar.c.length > 1) {
                size = Math.min(sVar.J * 2, size);
            }
            i12 += size + 2;
            if (i10 < i12) {
                break;
            }
            i11++;
        }
        ArrayList arrayList = dvVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (arrayList == null || i11 >= arrayList.size()) ? null : (TLRPC.TL_messages_stickerSet) dvVar.b.get(i11);
        return (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) ? 5 : 8;
    }
}
