package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ev extends g.p {
    public final /* synthetic */ sv c;

    public ev(sv svVar) {
        this.c = svVar;
    }

    @Override // g.p
    public final int i(int i10) {
        TLRPC.StickerSet stickerSet;
        sv svVar = this.c;
        s4.s sVar = svVar.y;
        cv cvVar = svVar.e;
        ci.v vVar = svVar.h;
        if (vVar.getAdapter() == null || vVar.getAdapter().j(i10) != 1) {
            return sVar.J;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = cvVar.c;
            if (i11 >= arrayListArr.length) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (cvVar.c.length > 1) {
                size = Math.min(sVar.J * 2, size);
            }
            i12 += size + 2;
            if (i10 < i12) {
                break;
            }
            i11++;
        }
        ArrayList arrayList = cvVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (arrayList == null || i11 >= arrayList.size()) ? null : (TLRPC.TL_messages_stickerSet) cvVar.b.get(i11);
        return (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) ? 5 : 8;
    }
}
