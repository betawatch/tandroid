package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class su extends g.p {
    public final /* synthetic */ ev c;

    public su(ev evVar) {
        this.c = evVar;
    }

    @Override // g.p
    public final int i(int i7) {
        TLRPC.StickerSet stickerSet;
        ev evVar = this.c;
        v4.t tVar = evVar.y1;
        qu quVar = evVar.p1;
        hi.x xVar = evVar.r1;
        if (xVar.getAdapter() == null || xVar.getAdapter().d(i7) != 1) {
            return tVar.J;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList[] arrayListArr = quVar.c;
            if (i10 >= arrayListArr.length) {
                break;
            }
            int size = arrayListArr[i10].size();
            if (quVar.c.length > 1) {
                size = Math.min(tVar.J * 2, size);
            }
            i11 += size + 2;
            if (i7 < i11) {
                break;
            }
            i10++;
        }
        ArrayList arrayList = quVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (arrayList == null || i10 >= arrayList.size()) ? null : (TLRPC.TL_messages_stickerSet) quVar.b.get(i10);
        return (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) ? 5 : 8;
    }
}
