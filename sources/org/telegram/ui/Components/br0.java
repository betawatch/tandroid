package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class br0 implements org.telegram.ui.Cells.j7 {
    public final /* synthetic */ ys0 a;

    public br0(ys0 ys0Var) {
        this.a = ys0Var;
    }

    @Override // org.telegram.ui.Cells.j7
    public final void a(String str, boolean z9) {
        ys0 ys0Var = this.a;
        org.telegram.ui.ActionBar.f2 f2Var = ys0Var.x1;
        if (!z9) {
            ys0Var.d1(str);
            return;
        }
        org.telegram.ui.ActionBar.w2 h = org.telegram.messenger.camera.q.h(f2Var.getParentActivity(), false, 1, null);
        h.O = str;
        h.P = false;
        CharSequence[] charSequenceArr = {org.telegram.messenger.id.M0(2131747817, "Open"), org.telegram.messenger.id.M0(2131751767, "Copy")};
        og.j jVar = new og.j(6, this, str);
        h.L = charSequenceArr;
        h.K = jVar;
        f2Var.showDialog(h);
    }

    @Override // org.telegram.ui.Cells.j7
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.ij ijVar) {
        ys0 ys0Var = this.a;
        vt.N0(ys0Var.x1, ijVar, ys0Var.t1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.j7
    public final boolean d() {
        return !this.a.E1;
    }
}
