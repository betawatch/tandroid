package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class gt extends org.telegram.ui.Components.tk0 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ kt d;

    public gt(kt ktVar, ArrayList arrayList) {
        this.d = ktVar;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.g0
    public final int b() {
        return this.c.size();
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        jt jtVar = (jt) c1Var.a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.c.get(i10);
        org.telegram.ui.ActionBar.u5 u5Var = jtVar.b;
        org.telegram.ui.Components.g9 g9Var = jtVar.a;
        jtVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            u5Var.l(org.telegram.messenger.dd.L0(2131748279, null), false);
            g9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        u5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null) {
            g9Var.m(null, null, null, null, null, 0);
            return;
        }
        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
        org.telegram.messenger.d00 f7 = org.telegram.messenger.v5.f(stickerSetCovered.cover, org.telegram.ui.ActionBar.t6.a7, 1.0f, jtVar.c);
        if (f7 == null) {
            g9Var.k(org.telegram.messenger.jc.c(w9, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
        } else if (w9 != null) {
            g9Var.k(org.telegram.messenger.jc.c(w9, stickerSetCovered.cover), null, "webp", f7, stickerSetCovered);
        } else {
            g9Var.k(org.telegram.messenger.jc.b(stickerSetCovered.cover), null, "webp", f7, stickerSetCovered);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        jt jtVar = new jt(viewGroup.getContext(), this.d.c0);
        jtVar.setLayoutParams(new s4.o0(-2, org.telegram.messenger.i0.L(48.0f)));
        return new org.telegram.ui.Components.dk0(jtVar);
    }
}
