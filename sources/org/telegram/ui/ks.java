package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ks extends org.telegram.ui.Components.tj0 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ns d;

    public ks(ns nsVar, ArrayList arrayList) {
        this.d = nsVar;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override // v4.h0
    public final int b() {
        return this.c.size();
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        ms msVar = (ms) e1Var.a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.c.get(i7);
        org.telegram.ui.ActionBar.j5 j5Var = msVar.b;
        org.telegram.ui.Components.i9 i9Var = msVar.a;
        msVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            j5Var.l(org.telegram.messenger.hd.M0(2131748262, null), false);
            i9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        j5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null) {
            i9Var.m(null, null, null, null, null, 0);
            return;
        }
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
        org.telegram.messenger.pz f10 = org.telegram.messenger.t5.f(stickerSetCovered.cover, org.telegram.ui.ActionBar.j6.a7, 1.0f, msVar.c);
        if (f10 == null) {
            i9Var.k(org.telegram.messenger.gc.c(w10, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
        } else if (w10 != null) {
            i9Var.k(org.telegram.messenger.gc.c(w10, stickerSetCovered.cover), null, "webp", f10, stickerSetCovered);
        } else {
            i9Var.k(org.telegram.messenger.gc.b(stickerSetCovered.cover), null, "webp", f10, stickerSetCovered);
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        ms msVar = new ms(viewGroup.getContext(), this.d.c0);
        msVar.setLayoutParams(new v4.p0(-2, org.telegram.messenger.g0.L(48.0f)));
        return new org.telegram.ui.Components.cj0(msVar);
    }
}
