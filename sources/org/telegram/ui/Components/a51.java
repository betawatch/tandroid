package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class a51 implements wx0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ f51 b;

    public a51(f51 f51Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = f51Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.wx0
    public final void a() {
        f51 f51Var = this.b;
        f2.p0 adapter = f51Var.n.getAdapter();
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
        uf.m1 m1Var = f51Var.v;
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
