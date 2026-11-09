package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class sv0 extends v4.x {
    public int e;
    public final /* synthetic */ zv0 f;

    public sv0(zv0 zv0Var) {
        this.f = zv0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override // v4.v
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        int i7 = d1Var.f;
        if (i7 == 3 || i7 != d1Var2.f) {
            return false;
        }
        zv0 zv0Var = this.f;
        if (zv0Var.J1 == null) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        zv0Var.J1.documents.add(b11, zv0Var.J1.documents.remove(b10));
        zv0Var.k1.j(b10, b11);
        this.e = b11;
        return true;
    }

    @Override // v4.v
    public final void p(v4.d1 d1Var, int i7) {
        zv0 zv0Var = this.f;
        if (i7 != 0 || zv0Var.m1 == null || this.e <= 0) {
            if (i7 == 2) {
                zv0Var.m1 = ((org.telegram.ui.Cells.z7) d1Var.a).getSticker();
            }
        } else {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = org.telegram.messenger.ui.a0(zv0Var.m1, "").document;
            this.e = -1;
            zv0Var.m1 = null;
        }
    }

    @Override // v4.v
    public final void q(v4.d1 d1Var) {
    }

    @Override // v4.v
    public final void o(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2, int i7, int i10, int i11) {
    }
}
