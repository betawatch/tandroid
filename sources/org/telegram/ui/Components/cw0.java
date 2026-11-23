package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class cw0 extends v4.y {
    public int e;
    public final /* synthetic */ jw0 f;

    public cw0(jw0 jw0Var) {
        this.f = jw0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override // v4.w
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        int i7 = f1Var.f;
        if (i7 == 3 || i7 != f1Var2.f) {
            return false;
        }
        jw0 jw0Var = this.f;
        if (jw0Var.N1 == null) {
            return false;
        }
        int b10 = f1Var.b();
        int b11 = f1Var2.b();
        jw0Var.N1.documents.add(b11, jw0Var.N1.documents.remove(b10));
        jw0Var.o1.j(b10, b11);
        this.e = b11;
        return true;
    }

    @Override // v4.w
    public final void p(v4.f1 f1Var, int i7) {
        jw0 jw0Var = this.f;
        if (i7 != 0 || jw0Var.q1 == null || this.e <= 0) {
            if (i7 == 2) {
                jw0Var.q1 = ((org.telegram.ui.Cells.z7) f1Var.a).getSticker();
            }
        } else {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = org.telegram.messenger.ri.c0(jw0Var.q1, "").document;
            this.e = -1;
            jw0Var.q1 = null;
        }
    }

    @Override // v4.w
    public final void q(v4.f1 f1Var) {
    }

    @Override // v4.w
    public final void o(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2, int i7, int i10, int i11) {
    }
}
