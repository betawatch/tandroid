package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class zx0 extends s4.x {
    public int e;
    public final /* synthetic */ gy0 f;

    public zx0(gy0 gy0Var) {
        this.f = gy0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int i10 = c1Var.f;
        if (i10 == 3 || i10 != c1Var2.f) {
            return false;
        }
        gy0 gy0Var = this.f;
        if (gy0Var.S == null) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        gy0Var.S.documents.add(b11, gy0Var.S.documents.remove(b10));
        gy0Var.d.p(b10, b11);
        this.e = b11;
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        gy0 gy0Var = this.f;
        if (i10 != 0 || gy0Var.f == null || this.e <= 0) {
            if (i10 == 2) {
                gy0Var.f = ((org.telegram.ui.Cells.g8) c1Var.a).getSticker();
            }
        } else {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(gy0Var.f, "").document;
            this.e = -1;
            gy0Var.f = null;
        }
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
    }

    @Override // s4.v
    public final void o(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2, int i10, int i11, int i12) {
    }
}
