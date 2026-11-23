package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class f41 implements iw0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ k41 b;

    public f41(k41 k41Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = k41Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.iw0
    public final void a() {
        k41 k41Var = this.b;
        v4.i0 adapter = k41Var.n.getAdapter();
        j41 j41Var = k41Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i7 = 0;
        if (adapter == j41Var) {
            while (i7 < j41Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) j41Var.e.get(i7);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    j41Var.F(stickerSetCovered, null);
                    return;
                }
                i7++;
            }
            return;
        }
        jg.c2 c2Var = k41Var.w;
        ArrayList arrayList = c2Var.F;
        while (i7 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i7);
            if (stickerSetCovered2.set.id == inputStickerSet.id) {
                c2Var.F(stickerSetCovered2, null);
                return;
            }
            i7++;
        }
    }
}
