package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class d61 implements sy0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ i61 b;

    public d61(i61 i61Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = i61Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.sy0
    public final void a() {
        i61 i61Var = this.b;
        s4.g0 adapter = i61Var.n.getAdapter();
        h61 h61Var = i61Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i10 = 0;
        if (adapter == h61Var) {
            while (i10 < h61Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) h61Var.e.get(i10);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    h61Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        hg.e2 e2Var = i61Var.v;
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
