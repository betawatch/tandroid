package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class e41 implements cx0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ j41 b;

    public e41(j41 j41Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = j41Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.cx0
    public final void a() {
        j41 j41Var = this.b;
        f2.q0 adapter = j41Var.n.getAdapter();
        i41 i41Var = j41Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i10 = 0;
        if (adapter == i41Var) {
            while (i10 < i41Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) i41Var.e.get(i10);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    i41Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        pf.l1 l1Var = j41Var.v;
        ArrayList arrayList = l1Var.A;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.id == inputStickerSet.id) {
                l1Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
