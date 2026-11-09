package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class o31 implements xv0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ u31 b;

    public o31(u31 u31Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = u31Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.xv0
    public final void a() {
        u31 u31Var = this.b;
        v4.g0 adapter = u31Var.n.getAdapter();
        t31 t31Var = u31Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i7 = 0;
        if (adapter == t31Var) {
            while (i7 < t31Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) t31Var.e.get(i7);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    t31Var.F(stickerSetCovered, null);
                    return;
                }
                i7++;
            }
            return;
        }
        jg.d2 d2Var = u31Var.w;
        ArrayList arrayList = d2Var.E;
        while (i7 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i7);
            if (stickerSetCovered2.set.id == inputStickerSet.id) {
                d2Var.F(stickerSetCovered2, null);
                return;
            }
            i7++;
        }
    }
}
