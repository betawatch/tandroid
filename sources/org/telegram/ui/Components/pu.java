package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class pu extends g.p {
    public final /* synthetic */ bv c;

    public pu(bv bvVar) {
        this.c = bvVar;
    }

    @Override // g.p
    public final int i(int i7) {
        TLRPC.StickerSet stickerSet;
        bv bvVar = this.c;
        v4.t tVar = bvVar.y1;
        nu nuVar = bvVar.p1;
        hi.w wVar = bvVar.r1;
        if (wVar.getAdapter() == null || wVar.getAdapter().d(i7) != 1) {
            return tVar.J;
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
                size = Math.min(tVar.J * 2, size);
            }
            i11 += size + 2;
            if (i7 < i11) {
                break;
            }
            i10++;
        }
        ArrayList arrayList = nuVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (arrayList == null || i10 >= arrayList.size()) ? null : (TLRPC.TL_messages_stickerSet) nuVar.b.get(i10);
        return (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) ? 5 : 8;
    }
}
