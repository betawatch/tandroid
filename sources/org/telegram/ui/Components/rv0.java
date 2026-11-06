package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class rv0 extends v4.x {
    public int e;
    public final /* synthetic */ yv0 f;

    public rv0(yv0 yv0Var) {
        this.f = yv0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override // v4.v
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        int i7 = d1Var.f;
        if (i7 == 3 || i7 != d1Var2.f) {
            return false;
        }
        yv0 yv0Var = this.f;
        if (yv0Var.J1 == null) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        yv0Var.J1.documents.add(b11, yv0Var.J1.documents.remove(b10));
        yv0Var.k1.j(b10, b11);
        this.e = b11;
        return true;
    }

    @Override // v4.v
    public final void p(v4.d1 d1Var, int i7) {
        yv0 yv0Var = this.f;
        if (i7 != 0 || yv0Var.m1 == null || this.e <= 0) {
            if (i7 == 2) {
                yv0Var.m1 = ((org.telegram.ui.Cells.z7) d1Var.a).getSticker();
            }
        } else {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = org.telegram.messenger.ui.a0(yv0Var.m1, "").document;
            this.e = -1;
            yv0Var.m1 = null;
        }
    }

    @Override // v4.v
    public final void q(v4.d1 d1Var) {
    }

    @Override // v4.v
    public final void o(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2, int i7, int i10, int i11) {
    }
}
