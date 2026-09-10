package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ay0 extends s4.x {
    public int e;
    public final /* synthetic */ hy0 f;

    public ay0(hy0 hy0Var) {
        this.f = hy0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int i10 = c1Var.f;
        if (i10 == 3 || i10 != c1Var2.f) {
            return false;
        }
        hy0 hy0Var = this.f;
        if (hy0Var.S == null) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        hy0Var.S.documents.add(b11, hy0Var.S.documents.remove(b10));
        hy0Var.d.p(b10, b11);
        this.e = b11;
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        hy0 hy0Var = this.f;
        if (i10 != 0 || hy0Var.f == null || this.e <= 0) {
            if (i10 == 2) {
                hy0Var.f = ((org.telegram.ui.Cells.g8) c1Var.a).getSticker();
            }
        } else {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(hy0Var.f, "").document;
            this.e = -1;
            hy0Var.f = null;
        }
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
    }

    @Override // s4.v
    public final void o(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2, int i10, int i11, int i12) {
    }
}
