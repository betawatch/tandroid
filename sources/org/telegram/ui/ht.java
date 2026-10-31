package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ht extends org.telegram.ui.Components.sk0 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ lt d;

    public ht(lt ltVar, ArrayList arrayList) {
        this.d = ltVar;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.g0
    public final int b() {
        return this.c.size();
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        kt ktVar = (kt) c1Var.a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.c.get(i10);
        org.telegram.ui.ActionBar.u5 u5Var = ktVar.b;
        org.telegram.ui.Components.g9 g9Var = ktVar.a;
        ktVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            u5Var.l(org.telegram.messenger.cd.L0(2131748279, null), false);
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
        org.telegram.messenger.c00 f7 = org.telegram.messenger.v5.f(stickerSetCovered.cover, org.telegram.ui.ActionBar.t6.a7, 1.0f, ktVar.c);
        if (f7 == null) {
            g9Var.k(org.telegram.messenger.ic.c(w9, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
        } else if (w9 != null) {
            g9Var.k(org.telegram.messenger.ic.c(w9, stickerSetCovered.cover), null, "webp", f7, stickerSetCovered);
        } else {
            g9Var.k(org.telegram.messenger.ic.b(stickerSetCovered.cover), null, "webp", f7, stickerSetCovered);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        kt ktVar = new kt(viewGroup.getContext(), this.d.c0);
        ktVar.setLayoutParams(new s4.o0(-2, org.telegram.messenger.i0.L(48.0f)));
        return new org.telegram.ui.Components.ck0(ktVar);
    }
}
