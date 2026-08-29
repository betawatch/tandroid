package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gx0 extends f2.d0 {
    public int e;
    public final /* synthetic */ nx0 f;

    public gx0(nx0 nx0Var) {
        this.f = nx0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, f2.n1 n1Var, f2.n1 n1Var2) {
        int i10 = n1Var.f;
        if (i10 == 3 || i10 != n1Var2.f) {
            return false;
        }
        nx0 nx0Var = this.f;
        if (nx0Var.O == null) {
            return false;
        }
        int b10 = n1Var.b();
        int b11 = n1Var2.b();
        nx0Var.O.documents.add(b11, nx0Var.O.documents.remove(b10));
        nx0Var.d.p(b10, b11);
        this.e = b11;
        return true;
    }

    @Override // f2.b0
    public final void p(f2.n1 n1Var, int i10) {
        nx0 nx0Var = this.f;
        if (i10 != 0 || nx0Var.f == null || this.e <= 0) {
            if (i10 == 2) {
                nx0Var.f = ((org.telegram.ui.Cells.b8) n1Var.a).getSticker();
            }
        } else {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(nx0Var.f, "").document;
            this.e = -1;
            nx0Var.f = null;
        }
    }

    @Override // f2.b0
    public final void q(f2.n1 n1Var) {
    }

    @Override // f2.b0
    public final void o(RecyclerView recyclerView, f2.n1 n1Var, f2.n1 n1Var2, int i10, int i11, int i12) {
    }
}
