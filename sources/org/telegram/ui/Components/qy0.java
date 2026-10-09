package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class qy0 extends s4.y {
    public int e;
    public final /* synthetic */ xy0 f;

    public qy0(xy0 xy0Var) {
        this.f = xy0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override // s4.w
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        int i10 = d1Var.f;
        if (i10 == 3 || i10 != d1Var2.f) {
            return false;
        }
        xy0 xy0Var = this.f;
        if (xy0Var.S == null) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        xy0Var.S.documents.add(b11, xy0Var.S.documents.remove(b10));
        xy0Var.d.p(b10, b11);
        this.e = b11;
        return true;
    }

    @Override // s4.w
    public final void p(s4.d1 d1Var, int i10) {
        xy0 xy0Var = this.f;
        if (i10 != 0 || xy0Var.f == null || this.e <= 0) {
            if (i10 == 2) {
                xy0Var.f = ((org.telegram.ui.Cells.f8) d1Var.a).getSticker();
            }
        } else {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(xy0Var.f, "").document;
            this.e = -1;
            xy0Var.f = null;
        }
    }

    @Override // s4.w
    public final void q(s4.d1 d1Var) {
    }

    @Override // s4.w
    public final void o(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2, int i10, int i11, int i12) {
    }
}
