package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class n31 implements wv0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ t31 b;

    public n31(t31 t31Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = t31Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.wv0
    public final void a() {
        t31 t31Var = this.b;
        v4.g0 adapter = t31Var.n.getAdapter();
        s31 s31Var = t31Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i7 = 0;
        if (adapter == s31Var) {
            while (i7 < s31Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) s31Var.e.get(i7);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    s31Var.F(stickerSetCovered, null);
                    return;
                }
                i7++;
            }
            return;
        }
        jg.d2 d2Var = t31Var.w;
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
