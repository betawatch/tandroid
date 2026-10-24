package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class my0 extends s4.x {
    public int e;
    public final /* synthetic */ ty0 f;

    public my0(ty0 ty0Var) {
        this.f = ty0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        int i10 = b1Var.f;
        if (i10 == 3 || i10 != b1Var2.f) {
            return false;
        }
        ty0 ty0Var = this.f;
        if (ty0Var.S == null) {
            return false;
        }
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        ty0Var.S.documents.add(b11, ty0Var.S.documents.remove(b10));
        ty0Var.d.p(b10, b11);
        this.e = b11;
        return true;
    }

    @Override // s4.v
    public final void p(s4.b1 b1Var, int i10) {
        ty0 ty0Var = this.f;
        if (i10 != 0 || ty0Var.f == null || this.e <= 0) {
            if (i10 == 2) {
                ty0Var.f = ((org.telegram.ui.Cells.e8) b1Var.a).getSticker();
            }
        } else {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(ty0Var.f, "").document;
            this.e = -1;
            ty0Var.f = null;
        }
    }

    @Override // s4.v
    public final void q(s4.b1 b1Var) {
    }

    @Override // s4.v
    public final void o(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2, int i10, int i11, int i12) {
    }
}
