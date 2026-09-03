package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class z41 implements vx0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ e51 b;

    public z41(e51 e51Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = e51Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.vx0
    public final void a() {
        e51 e51Var = this.b;
        f2.o0 adapter = e51Var.n.getAdapter();
        d51 d51Var = e51Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i10 = 0;
        if (adapter == d51Var) {
            while (i10 < d51Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) d51Var.e.get(i10);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    d51Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        tf.m1 m1Var = e51Var.v;
        ArrayList arrayList = m1Var.B;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.id == inputStickerSet.id) {
                m1Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
