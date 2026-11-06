package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class h31 implements wv0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ n31 b;

    public h31(n31 n31Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = n31Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.wv0
    public final void a() {
        n31 n31Var = this.b;
        v4.g0 adapter = n31Var.n.getAdapter();
        m31 m31Var = n31Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i7 = 0;
        if (adapter == m31Var) {
            while (i7 < m31Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) m31Var.e.get(i7);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    m31Var.F(stickerSetCovered, null);
                    return;
                }
                i7++;
            }
            return;
        }
        jg.d2 d2Var = n31Var.w;
        ArrayList arrayList = d2Var.E;
        while (i7 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i7);
            if (stickerSetCovered2.set.id == inputStickerSet.id) {
                d2Var.F(stickerSetCovered2, null);
                return;
            }
            i7++;
        }
    }
}
