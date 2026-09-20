package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class n51 implements ey0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ s51 b;

    public n51(s51 s51Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = s51Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.ey0
    public final void a() {
        s51 s51Var = this.b;
        s4.h0 adapter = s51Var.n.getAdapter();
        r51 r51Var = s51Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i10 = 0;
        if (adapter == r51Var) {
            while (i10 < r51Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) r51Var.e.get(i10);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    r51Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        gg.g2 g2Var = s51Var.v;
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
