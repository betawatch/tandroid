package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class m51 implements fy0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ r51 b;

    public m51(r51 r51Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = r51Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.fy0
    public final void a() {
        r51 r51Var = this.b;
        s4.h0 adapter = r51Var.n.getAdapter();
        q51 q51Var = r51Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i10 = 0;
        if (adapter == q51Var) {
            while (i10 < q51Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) q51Var.e.get(i10);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    q51Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        fg.h2 h2Var = r51Var.v;
        ArrayList arrayList = h2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.id == inputStickerSet.id) {
                h2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
