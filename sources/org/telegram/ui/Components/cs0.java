package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class cs0 implements org.telegram.ui.Cells.n7 {
    public final /* synthetic */ au0 a;

    public cs0(au0 au0Var) {
        this.a = au0Var;
    }

    @Override // org.telegram.ui.Cells.n7
    public final void a(String str, boolean z10) {
        au0 au0Var = this.a;
        org.telegram.ui.ActionBar.k2 k2Var = au0Var.x1;
        if (!z10) {
            au0Var.Z0(str);
            return;
        }
        org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.a30.h(k2Var.getParentActivity(), false, 1, null);
        h.O = str;
        h.P = false;
        CharSequence[] charSequenceArr = {org.telegram.messenger.dd.L0(2131747833, "Open"), org.telegram.messenger.dd.L0(2131751767, "Copy")};
        eg.j jVar = new eg.j(7, this, str);
        h.L = charSequenceArr;
        h.K = jVar;
        k2Var.showDialog(h);
    }

    @Override // org.telegram.ui.Cells.n7
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.kj kjVar) {
        au0 au0Var = this.a;
        hu.K0(au0Var.x1, kjVar, au0Var.t1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.n7
    public final boolean c() {
        return !this.a.E1;
    }
}
