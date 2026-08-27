package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ou extends f2.w {
    public final /* synthetic */ cv c;

    public ou(cv cvVar) {
        this.c = cvVar;
    }

    @Override // f2.w
    public final int i(int i10) {
        TLRPC.StickerSet stickerSet;
        cv cvVar = this.c;
        f2.x xVar = cvVar.y;
        mu muVar = cvVar.e;
        lh.w wVar = cvVar.h;
        if (wVar.getAdapter() == null || wVar.getAdapter().j(i10) != 1) {
            return xVar.J;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = muVar.c;
            if (i11 >= arrayListArr.length) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (muVar.c.length > 1) {
                size = Math.min(xVar.J * 2, size);
            }
            i12 += size + 2;
            if (i10 < i12) {
                break;
            }
            i11++;
        }
        ArrayList arrayList = muVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (arrayList == null || i11 >= arrayList.size()) ? null : (TLRPC.TL_messages_stickerSet) muVar.b.get(i11);
        return (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) ? 5 : 8;
    }
}
