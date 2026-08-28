package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c41 implements ax0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ h41 b;

    public c41(h41 h41Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = h41Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.ax0
    public final void a() {
        h41 h41Var = this.b;
        f2.r0 adapter = h41Var.n.getAdapter();
        g41 g41Var = h41Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i9 = 0;
        if (adapter == g41Var) {
            while (i9 < g41Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) g41Var.e.get(i9);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    g41Var.F(stickerSetCovered, null);
                    return;
                }
                i9++;
            }
            return;
        }
        of.y1 y1Var = h41Var.v;
        ArrayList arrayList = y1Var.A;
        while (i9 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i9);
            if (stickerSetCovered2.set.id == inputStickerSet.id) {
                y1Var.F(stickerSetCovered2, null);
                return;
            }
            i9++;
        }
    }
}
