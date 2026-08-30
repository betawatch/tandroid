package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class px0 extends f2.d0 {
    public int e;
    public final /* synthetic */ xx0 f;

    public px0(xx0 xx0Var) {
        this.f = xx0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, f2.l1 l1Var, f2.l1 l1Var2) {
        int i10 = l1Var.f;
        if (i10 == 3 || i10 != l1Var2.f) {
            return false;
        }
        xx0 xx0Var = this.f;
        if (xx0Var.P == null) {
            return false;
        }
        int b10 = l1Var.b();
        int b11 = l1Var2.b();
        xx0Var.P.documents.add(b11, xx0Var.P.documents.remove(b10));
        xx0Var.d.p(b10, b11);
        this.e = b11;
        return true;
    }

    @Override // f2.b0
    public final void p(f2.l1 l1Var, int i10) {
        xx0 xx0Var = this.f;
        if (i10 != 0 || xx0Var.f == null || this.e <= 0) {
            if (i10 == 2) {
                xx0Var.f = ((org.telegram.ui.Cells.d8) l1Var.a).getSticker();
            }
        } else {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(xx0Var.f, "").document;
            this.e = -1;
            xx0Var.f = null;
        }
    }

    @Override // f2.b0
    public final void q(f2.l1 l1Var) {
    }

    @Override // f2.b0
    public final void o(RecyclerView recyclerView, f2.l1 l1Var, f2.l1 l1Var2, int i10, int i11, int i12) {
    }
}
