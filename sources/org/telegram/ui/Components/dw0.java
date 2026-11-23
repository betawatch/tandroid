package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class dw0 extends v4.y {
    public int e;
    public final /* synthetic */ kw0 f;

    public dw0(kw0 kw0Var) {
        this.f = kw0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override // v4.w
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        int i7 = f1Var.f;
        if (i7 == 3 || i7 != f1Var2.f) {
            return false;
        }
        kw0 kw0Var = this.f;
        if (kw0Var.N1 == null) {
            return false;
        }
        int b10 = f1Var.b();
        int b11 = f1Var2.b();
        kw0Var.N1.documents.add(b11, kw0Var.N1.documents.remove(b10));
        kw0Var.o1.j(b10, b11);
        this.e = b11;
        return true;
    }

    @Override // v4.w
    public final void p(v4.f1 f1Var, int i7) {
        kw0 kw0Var = this.f;
        if (i7 != 0 || kw0Var.q1 == null || this.e <= 0) {
            if (i7 == 2) {
                kw0Var.q1 = ((org.telegram.ui.Cells.a8) f1Var.a).getSticker();
            }
        } else {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = org.telegram.messenger.si.c0(kw0Var.q1, "").document;
            this.e = -1;
            kw0Var.q1 = null;
        }
    }

    @Override // v4.w
    public final void q(v4.f1 f1Var) {
    }

    @Override // v4.w
    public final void o(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2, int i7, int i10, int i11) {
    }
}
