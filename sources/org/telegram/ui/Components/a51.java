package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class a51 implements ux0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ f51 b;

    public a51(f51 f51Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = f51Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.ux0
    public final void a() {
        f51 f51Var = this.b;
        s4.h0 adapter = f51Var.n.getAdapter();
        e51 e51Var = f51Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i10 = 0;
        if (adapter == e51Var) {
            while (i10 < e51Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) e51Var.e.get(i10);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    e51Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        gg.g2 g2Var = f51Var.v;
        ArrayList arrayList = g2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.id == inputStickerSet.id) {
                g2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
