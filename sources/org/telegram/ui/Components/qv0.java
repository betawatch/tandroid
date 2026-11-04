package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qv0 extends u4.x {
    public int e;
    public final /* synthetic */ xv0 f;

    public qv0(xv0 xv0Var) {
        this.f = xv0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override // u4.v
    public final boolean n(RecyclerView recyclerView, u4.d1 d1Var, u4.d1 d1Var2) {
        int i3 = d1Var.f;
        if (i3 == 3 || i3 != d1Var2.f) {
            return false;
        }
        xv0 xv0Var = this.f;
        if (xv0Var.K1 == null) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        xv0Var.K1.documents.add(b11, xv0Var.K1.documents.remove(b10));
        xv0Var.l1.j(b10, b11);
        this.e = b11;
        return true;
    }

    @Override // u4.v
    public final void p(u4.d1 d1Var, int i3) {
        xv0 xv0Var = this.f;
        if (i3 != 0 || xv0Var.n1 == null || this.e <= 0) {
            if (i3 == 2) {
                xv0Var.n1 = ((org.telegram.ui.Cells.y7) d1Var.a).getSticker();
            }
        } else {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = org.telegram.messenger.li.a0(xv0Var.n1, "").document;
            this.e = -1;
            xv0Var.n1 = null;
        }
    }

    @Override // u4.v
    public final void q(u4.d1 d1Var) {
    }

    @Override // u4.v
    public final void o(RecyclerView recyclerView, u4.d1 d1Var, u4.d1 d1Var2, int i3, int i10, int i11) {
    }
}
