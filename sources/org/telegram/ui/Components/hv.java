package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class hv extends g.p {
    public final /* synthetic */ vv c;

    public hv(vv vvVar) {
        this.c = vvVar;
    }

    @Override // g.p
    public final int i(int i10) {
        TLRPC.StickerSet stickerSet;
        vv vvVar = this.c;
        s4.s sVar = vvVar.y;
        fv fvVar = vvVar.e;
        ci.v vVar = vvVar.h;
        if (vVar.getAdapter() == null || vVar.getAdapter().j(i10) != 1) {
            return sVar.J;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = fvVar.c;
            if (i11 >= arrayListArr.length) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (fvVar.c.length > 1) {
                size = Math.min(sVar.J * 2, size);
            }
            i12 += size + 2;
            if (i10 < i12) {
                break;
            }
            i11++;
        }
        ArrayList arrayList = fvVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (arrayList == null || i11 >= arrayList.size()) ? null : (TLRPC.TL_messages_stickerSet) fvVar.b.get(i11);
        return (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) ? 5 : 8;
    }
}
