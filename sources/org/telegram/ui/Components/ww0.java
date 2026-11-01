package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ww0 extends s4.w {
    public int e;
    public final /* synthetic */ dx0 f;

    public ww0(dx0 dx0Var) {
        this.f = dx0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override // s4.u
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int i10 = c1Var.f;
        if (i10 == 3 || i10 != c1Var2.f) {
            return false;
        }
        dx0 dx0Var = this.f;
        if (dx0Var.J1 == null) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        dx0Var.J1.documents.add(b11, dx0Var.J1.documents.remove(b10));
        dx0Var.k1.j(b10, b11);
        this.e = b11;
        return true;
    }

    @Override // s4.u
    public final void p(s4.c1 c1Var, int i10) {
        dx0 dx0Var = this.f;
        if (i10 != 0 || dx0Var.m1 == null || this.e <= 0) {
            if (i10 == 2) {
                dx0Var.m1 = ((org.telegram.ui.Cells.d8) c1Var.a).getSticker();
            }
        } else {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = org.telegram.messenger.vi.a0(dx0Var.m1, "").document;
            this.e = -1;
            dx0Var.m1 = null;
        }
    }

    @Override // s4.u
    public final void q(s4.c1 c1Var) {
    }

    @Override // s4.u
    public final void o(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2, int i10, int i11, int i12) {
    }
}
