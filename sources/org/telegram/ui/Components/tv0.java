package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class tv0 extends v4.x {
    public int e;
    public final /* synthetic */ bw0 f;

    public tv0(bw0 bw0Var) {
        this.f = bw0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override // v4.v
    public final boolean n(RecyclerView recyclerView, v4.e1 e1Var, v4.e1 e1Var2) {
        int i7 = e1Var.f;
        if (i7 == 3 || i7 != e1Var2.f) {
            return false;
        }
        bw0 bw0Var = this.f;
        if (bw0Var.N1 == null) {
            return false;
        }
        int b10 = e1Var.b();
        int b11 = e1Var2.b();
        bw0Var.N1.documents.add(b11, bw0Var.N1.documents.remove(b10));
        bw0Var.o1.j(b10, b11);
        this.e = b11;
        return true;
    }

    @Override // v4.v
    public final void p(v4.e1 e1Var, int i7) {
        bw0 bw0Var = this.f;
        if (i7 != 0 || bw0Var.q1 == null || this.e <= 0) {
            if (i7 == 2) {
                bw0Var.q1 = ((org.telegram.ui.Cells.y7) e1Var.a).getSticker();
            }
        } else {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = org.telegram.messenger.si.a0(bw0Var.q1, "").document;
            this.e = -1;
            bw0Var.q1 = null;
        }
    }

    @Override // v4.v
    public final void q(v4.e1 e1Var) {
    }

    @Override // v4.v
    public final void o(RecyclerView recyclerView, v4.e1 e1Var, v4.e1 e1Var2, int i7, int i10, int i11) {
    }
}
