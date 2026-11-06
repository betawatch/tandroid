package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class hs extends org.telegram.ui.Components.oj0 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ks d;

    public hs(ks ksVar, ArrayList arrayList) {
        this.d = ksVar;
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
        js jsVar = (js) d1Var.a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.c.get(i7);
        org.telegram.ui.ActionBar.k5 k5Var = jsVar.b;
        org.telegram.ui.Components.l9 l9Var = jsVar.a;
        jsVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            k5Var.l(org.telegram.messenger.hd.M0(2131748261, null), false);
            l9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        k5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null) {
            l9Var.m(null, null, null, null, null, 0);
            return;
        }
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
        org.telegram.messenger.rz f10 = org.telegram.messenger.t5.f(stickerSetCovered.cover, org.telegram.ui.ActionBar.k6.a7, 1.0f, jsVar.c);
        if (f10 == null) {
            l9Var.k(org.telegram.messenger.hc.c(w10, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
        } else if (w10 != null) {
            l9Var.k(org.telegram.messenger.hc.c(w10, stickerSetCovered.cover), null, "webp", f10, stickerSetCovered);
        } else {
            l9Var.k(org.telegram.messenger.hc.b(stickerSetCovered.cover), null, "webp", f10, stickerSetCovered);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        js jsVar = new js(viewGroup.getContext(), this.d.c0);
        jsVar.setLayoutParams(new v4.o0(-2, org.telegram.messenger.g0.L(48.0f)));
        return new org.telegram.ui.Components.xi0(jsVar);
    }
}
