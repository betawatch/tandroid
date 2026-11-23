package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        org.telegram.ui.ActionBar.n5 n5Var = msVar.b;
        org.telegram.ui.Components.p9 p9Var = msVar.a;
        msVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            n5Var.l(org.telegram.messenger.gd.N0(2131748069, null), false);
            p9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        n5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null) {
            p9Var.m(null, null, null, null, null, 0);
            return;
        }
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
        org.telegram.messenger.kz f10 = org.telegram.messenger.u5.f(stickerSetCovered.cover, org.telegram.ui.ActionBar.n6.a7, 1.0f, msVar.c);
        if (f10 == null) {
            p9Var.k(org.telegram.messenger.fc.c(w10, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
        } else if (w10 != null) {
            p9Var.k(org.telegram.messenger.fc.c(w10, stickerSetCovered.cover), null, "webp", f10, stickerSetCovered);
        } else {
            p9Var.k(org.telegram.messenger.fc.b(stickerSetCovered.cover), null, "webp", f10, stickerSetCovered);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ms msVar = new ms(viewGroup.getContext(), this.d.c0);
        msVar.setLayoutParams(new v4.q0(-2, org.telegram.messenger.g0.L(48.0f)));
        return new org.telegram.ui.Components.mj0(msVar);
    }
}
