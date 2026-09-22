package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ox0 extends s4.x {
    public int e;
    public final /* synthetic */ vx0 f;

    public ox0(vx0 vx0Var) {
        this.f = vx0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int i10 = c1Var.f;
        if (i10 == 3 || i10 != c1Var2.f) {
            return false;
        }
        vx0 vx0Var = this.f;
        if (vx0Var.S == null) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        vx0Var.S.documents.add(b11, vx0Var.S.documents.remove(b10));
        vx0Var.d.p(b10, b11);
        this.e = b11;
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        vx0 vx0Var = this.f;
        if (i10 != 0 || vx0Var.f == null || this.e <= 0) {
            if (i10 == 2) {
                vx0Var.f = ((org.telegram.ui.Cells.f8) c1Var.a).getSticker();
            }
        } else {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(vx0Var.f, "").document;
            this.e = -1;
            vx0Var.f = null;
        }
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
    }

    @Override // s4.v
    public final void o(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2, int i10, int i11, int i12) {
    }
}
