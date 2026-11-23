package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ks extends org.telegram.ui.Components.dk0 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ns d;

    public ks(ns nsVar, ArrayList arrayList) {
        this.d = nsVar;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override // v4.i0
    public final int b() {
        return this.c.size();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        ms msVar = (ms) f1Var.a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.c.get(i7);
        org.telegram.ui.ActionBar.m5 m5Var = msVar.b;
        org.telegram.ui.Components.q9 q9Var = msVar.a;
        msVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            m5Var.l(org.telegram.messenger.hd.N0(2131748069, null), false);
            q9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        m5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null) {
            q9Var.m(null, null, null, null, null, 0);
            return;
        }
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
        org.telegram.messenger.mz f10 = org.telegram.messenger.u5.f(stickerSetCovered.cover, org.telegram.ui.ActionBar.m6.a7, 1.0f, msVar.c);
        if (f10 == null) {
            q9Var.k(org.telegram.messenger.gc.c(w10, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
        } else if (w10 != null) {
            q9Var.k(org.telegram.messenger.gc.c(w10, stickerSetCovered.cover), null, "webp", f10, stickerSetCovered);
        } else {
            q9Var.k(org.telegram.messenger.gc.b(stickerSetCovered.cover), null, "webp", f10, stickerSetCovered);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ms msVar = new ms(viewGroup.getContext(), this.d.c0);
        msVar.setLayoutParams(new v4.q0(-2, org.telegram.messenger.g0.L(48.0f)));
        return new org.telegram.ui.Components.mj0(msVar);
    }
}
