package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qu extends g.o {
    public final /* synthetic */ cv c;

    public qu(cv cvVar) {
        this.c = cvVar;
    }

    @Override // g.o
    public final int i(int i10) {
        TLRPC.StickerSet stickerSet;
        cv cvVar = this.c;
        s4.r rVar = cvVar.u1;
        ou ouVar = cvVar.l1;
        org.telegram.ui.g3 g3Var = cvVar.n1;
        if (g3Var.getAdapter() == null || g3Var.getAdapter().d(i10) != 1) {
            return rVar.J;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = ouVar.c;
            if (i11 >= arrayListArr.length) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (ouVar.c.length > 1) {
                size = Math.min(rVar.J * 2, size);
            }
            i12 += size + 2;
            if (i10 < i12) {
                break;
            }
            i11++;
        }
        ArrayList arrayList = ouVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (arrayList == null || i11 >= arrayList.size()) ? null : (TLRPC.TL_messages_stickerSet) ouVar.b.get(i11);
        return (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) ? 5 : 8;
    }
}
