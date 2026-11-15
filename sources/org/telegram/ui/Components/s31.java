package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class s31 implements zv0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ x31 b;

    public s31(x31 x31Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = x31Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.zv0
    public final void a() {
        x31 x31Var = this.b;
        v4.h0 adapter = x31Var.n.getAdapter();
        w31 w31Var = x31Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i7 = 0;
        if (adapter == w31Var) {
            while (i7 < w31Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) w31Var.e.get(i7);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    w31Var.F(stickerSetCovered, null);
                    return;
                }
                i7++;
            }
            return;
        }
        jg.c2 c2Var = x31Var.w;
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
