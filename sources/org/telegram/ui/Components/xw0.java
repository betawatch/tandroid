package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xw0 extends f2.e0 {
    public int e;
    public final /* synthetic */ ex0 f;

    public xw0(ex0 ex0Var) {
        this.f = ex0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override // f2.c0
    public final boolean n(RecyclerView recyclerView, f2.o1 o1Var, f2.o1 o1Var2) {
        int i10 = o1Var.f;
        if (i10 == 3 || i10 != o1Var2.f) {
            return false;
        }
        ex0 ex0Var = this.f;
        if (ex0Var.O == null) {
            return false;
        }
        int b10 = o1Var.b();
        int b11 = o1Var2.b();
        ex0Var.O.documents.add(b11, ex0Var.O.documents.remove(b10));
        ex0Var.d.p(b10, b11);
        this.e = b11;
        return true;
    }

    @Override // f2.c0
    public final void p(f2.o1 o1Var, int i10) {
        ex0 ex0Var = this.f;
        if (i10 != 0 || ex0Var.f == null || this.e <= 0) {
            if (i10 == 2) {
                ex0Var.f = ((org.telegram.ui.Cells.a8) o1Var.a).getSticker();
            }
        } else {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(ex0Var.f, "").document;
            this.e = -1;
            ex0Var.f = null;
        }
    }

    @Override // f2.c0
    public final void q(f2.o1 o1Var) {
    }

    @Override // f2.c0
    public final void o(RecyclerView recyclerView, f2.o1 o1Var, f2.o1 o1Var2, int i10, int i11, int i12) {
    }
}
