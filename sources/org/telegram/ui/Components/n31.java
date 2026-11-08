package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
