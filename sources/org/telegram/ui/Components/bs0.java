package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bs0 implements org.telegram.ui.Cells.n7 {
    public final /* synthetic */ zt0 a;

    public bs0(zt0 zt0Var) {
        this.a = zt0Var;
    }

    @Override // org.telegram.ui.Cells.n7
    public final void a(String str, boolean z10) {
        zt0 zt0Var = this.a;
        org.telegram.ui.ActionBar.k2 k2Var = zt0Var.x1;
        if (!z10) {
            zt0Var.Y0(str);
            return;
        }
        org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.z20.h(k2Var.getParentActivity(), false, 1, null);
        h.O = str;
        h.P = false;
        CharSequence[] charSequenceArr = {org.telegram.messenger.cd.L0(2131747833, "Open"), org.telegram.messenger.cd.L0(2131751767, "Copy")};
        eg.j jVar = new eg.j(7, this, str);
        h.L = charSequenceArr;
        h.K = jVar;
        k2Var.showDialog(h);
    }

    @Override // org.telegram.ui.Cells.n7
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.jj jjVar) {
        zt0 zt0Var = this.a;
        hu.K0(zt0Var.x1, jjVar, zt0Var.t1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.n7
    public final boolean c() {
        return !this.a.E1;
    }
}
