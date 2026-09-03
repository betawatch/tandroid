package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class px0 extends f2.e0 {
    public int e;
    public final /* synthetic */ xx0 f;

    public px0(xx0 xx0Var) {
        this.f = xx0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2) {
        int i10 = m1Var.f;
        if (i10 == 3 || i10 != m1Var2.f) {
            return false;
        }
        xx0 xx0Var = this.f;
        if (xx0Var.P == null) {
            return false;
        }
        int b10 = m1Var.b();
        int b11 = m1Var2.b();
        xx0Var.P.documents.add(b11, xx0Var.P.documents.remove(b10));
        xx0Var.d.p(b10, b11);
        this.e = b11;
        return true;
    }

    @Override // f2.b0
    public final void p(f2.m1 m1Var, int i10) {
        xx0 xx0Var = this.f;
        if (i10 != 0 || xx0Var.f == null || this.e <= 0) {
            if (i10 == 2) {
                xx0Var.f = ((org.telegram.ui.Cells.d8) m1Var.a).getSticker();
            }
        } else {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(xx0Var.f, "").document;
            this.e = -1;
            xx0Var.f = null;
        }
    }

    @Override // f2.b0
    public final void q(f2.m1 m1Var) {
    }

    @Override // f2.b0
    public final void o(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2, int i10, int i11, int i12) {
    }
}
