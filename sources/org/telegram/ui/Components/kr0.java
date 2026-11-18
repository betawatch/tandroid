package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class kr0 implements org.telegram.ui.Cells.k7 {
    public final /* synthetic */ gt0 a;

    public kr0(gt0 gt0Var) {
        this.a = gt0Var;
    }

    @Override // org.telegram.ui.Cells.k7
    public final void a(String str, boolean z10) {
        gt0 gt0Var = this.a;
        org.telegram.ui.ActionBar.h2 h2Var = gt0Var.y1;
        if (!z10) {
            gt0Var.d1(str);
            return;
        }
        org.telegram.ui.ActionBar.x2 j3 = org.telegram.messenger.n10.j(h2Var.getParentActivity(), false, 1, null);
        j3.P = str;
        j3.Q = false;
        CharSequence[] charSequenceArr = {org.telegram.messenger.gd.M0(2131747624, "Open"), org.telegram.messenger.gd.M0(2131751756, "Copy")};
        og.j jVar = new og.j(6, this, str);
        j3.M = charSequenceArr;
        j3.L = jVar;
        h2Var.showDialog(j3);
    }

    @Override // org.telegram.ui.Cells.k7
    public final boolean b() {
        return !this.a.F1;
    }

    @Override // org.telegram.ui.Cells.k7
    public final void c(TLRPC.WebPage webPage, org.telegram.messenger.fj fjVar) {
        gt0 gt0Var = this.a;
        gu.O0(gt0Var.y1, fjVar, gt0Var.u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }
}
