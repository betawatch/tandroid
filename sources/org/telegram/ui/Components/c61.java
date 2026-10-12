package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class c61 implements ry0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ h61 b;

    public c61(h61 h61Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = h61Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.ry0
    public final void a() {
        h61 h61Var = this.b;
        s4.g0 adapter = h61Var.n.getAdapter();
        g61 g61Var = h61Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i10 = 0;
        if (adapter == g61Var) {
            while (i10 < g61Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) g61Var.e.get(i10);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    g61Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        hg.e2 e2Var = h61Var.v;
        ArrayList arrayList = e2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.id == inputStickerSet.id) {
                e2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
