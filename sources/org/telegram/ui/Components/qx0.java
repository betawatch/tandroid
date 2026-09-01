package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class qx0 extends f2.e0 {
    public int e;
    public final /* synthetic */ yx0 f;

    public qx0(yx0 yx0Var) {
        this.f = yx0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2) {
        int i10 = m1Var.f;
        if (i10 == 3 || i10 != m1Var2.f) {
            return false;
        }
        yx0 yx0Var = this.f;
        if (yx0Var.P == null) {
            return false;
        }
        int b10 = m1Var.b();
        int b11 = m1Var2.b();
        yx0Var.P.documents.add(b11, yx0Var.P.documents.remove(b10));
        yx0Var.d.p(b10, b11);
        this.e = b11;
        return true;
    }

    @Override // f2.b0
    public final void p(f2.m1 m1Var, int i10) {
        yx0 yx0Var = this.f;
        if (i10 != 0 || yx0Var.f == null || this.e <= 0) {
            if (i10 == 2) {
                yx0Var.f = ((org.telegram.ui.Cells.d8) m1Var.a).getSticker();
            }
        } else {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(yx0Var.f, "").document;
            this.e = -1;
            yx0Var.f = null;
        }
    }

    @Override // f2.b0
    public final void q(f2.m1 m1Var) {
    }

    @Override // f2.b0
    public final void o(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2, int i10, int i11, int i12) {
    }
}
