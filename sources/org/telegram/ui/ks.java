package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ks extends org.telegram.ui.Components.oj0 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ns d;

    public ks(ns nsVar, ArrayList arrayList) {
        this.d = nsVar;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override // v4.g0
    public final int b() {
        return this.c.size();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        ms msVar = (ms) d1Var.a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.c.get(i7);
        org.telegram.ui.ActionBar.m5 m5Var = msVar.b;
        org.telegram.ui.Components.k9 k9Var = msVar.a;
        msVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            m5Var.l(org.telegram.messenger.id.M0(2131748262, null), false);
            k9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        m5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null) {
            k9Var.m(null, null, null, null, null, 0);
            return;
        }
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
        org.telegram.messenger.rz f10 = org.telegram.messenger.t5.f(stickerSetCovered.cover, org.telegram.ui.ActionBar.m6.a7, 1.0f, msVar.c);
        if (f10 == null) {
            k9Var.k(org.telegram.messenger.hc.c(w10, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
        } else if (w10 != null) {
            k9Var.k(org.telegram.messenger.hc.c(w10, stickerSetCovered.cover), null, "webp", f10, stickerSetCovered);
        } else {
            k9Var.k(org.telegram.messenger.hc.b(stickerSetCovered.cover), null, "webp", f10, stickerSetCovered);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        ms msVar = new ms(viewGroup.getContext(), this.d.c0);
        msVar.setLayoutParams(new v4.o0(-2, org.telegram.messenger.g0.L(48.0f)));
        return new org.telegram.ui.Components.xi0(msVar);
    }
}
