package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fs extends org.telegram.ui.Components.sj0 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ is d;

    public fs(is isVar, ArrayList arrayList) {
        this.d = isVar;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override // u4.h0
    public final int b() {
        return this.c.size();
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        hs hsVar = (hs) d1Var.a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.c.get(i3);
        org.telegram.ui.ActionBar.k5 k5Var = hsVar.b;
        org.telegram.ui.Components.k9 k9Var = hsVar.a;
        hsVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            k5Var.l(org.telegram.messenger.bd.M0(2131748270, null), false);
            k9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        k5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null) {
            k9Var.m(null, null, null, null, null, 0);
            return;
        }
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
        org.telegram.messenger.jz f10 = org.telegram.messenger.t5.f(stickerSetCovered.cover, org.telegram.ui.ActionBar.k6.a7, 1.0f, hsVar.c);
        if (f10 == null) {
            k9Var.k(org.telegram.messenger.ac.c(w10, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
        } else if (w10 != null) {
            k9Var.k(org.telegram.messenger.ac.c(w10, stickerSetCovered.cover), null, "webp", f10, stickerSetCovered);
        } else {
            k9Var.k(org.telegram.messenger.ac.b(stickerSetCovered.cover), null, "webp", f10, stickerSetCovered);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        hs hsVar = new hs(viewGroup.getContext(), this.d.c0);
        hsVar.setLayoutParams(new u4.p0(-2, org.telegram.messenger.g0.L(48.0f)));
        return new org.telegram.ui.Components.bj0(hsVar);
    }
}
