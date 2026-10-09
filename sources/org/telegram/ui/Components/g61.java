package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class g61 implements vy0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ l61 b;

    public g61(l61 l61Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = l61Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.vy0
    public final void a() {
        l61 l61Var = this.b;
        s4.i0 adapter = l61Var.n.getAdapter();
        k61 k61Var = l61Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i10 = 0;
        if (adapter == k61Var) {
            while (i10 < k61Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) k61Var.e.get(i10);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    k61Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        gg.f2 f2Var = l61Var.v;
        ArrayList arrayList = f2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.id == inputStickerSet.id) {
                f2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
