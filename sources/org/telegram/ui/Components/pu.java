package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pu extends f2.x {
    public final /* synthetic */ dv c;

    public pu(dv dvVar) {
        this.c = dvVar;
    }

    @Override // f2.x
    public final int i(int i9) {
        TLRPC.StickerSet stickerSet;
        dv dvVar = this.c;
        f2.y yVar = dvVar.y;
        nu nuVar = dvVar.e;
        kh.w wVar = dvVar.h;
        if (wVar.getAdapter() == null || wVar.getAdapter().j(i9) != 1) {
            return yVar.J;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList[] arrayListArr = nuVar.c;
            if (i10 >= arrayListArr.length) {
                break;
            }
            int size = arrayListArr[i10].size();
            if (nuVar.c.length > 1) {
                size = Math.min(yVar.J * 2, size);
            }
            i11 += size + 2;
            if (i9 < i11) {
                break;
            }
            i10++;
        }
        ArrayList arrayList = nuVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (arrayList == null || i10 >= arrayList.size()) ? null : (TLRPC.TL_messages_stickerSet) nuVar.b.get(i10);
        return (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) ? 5 : 8;
    }
}
