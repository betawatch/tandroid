package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n41 implements lx0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ s41 b;

    public n41(s41 s41Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = s41Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.lx0
    public final void a() {
        s41 s41Var = this.b;
        f2.p0 adapter = s41Var.n.getAdapter();
        r41 r41Var = s41Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i10 = 0;
        if (adapter == r41Var) {
            while (i10 < r41Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) r41Var.e.get(i10);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    r41Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        rf.m1 m1Var = s41Var.v;
        ArrayList arrayList = m1Var.A;
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
