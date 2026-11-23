package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class mr0 implements org.telegram.ui.Cells.k7 {
    public final /* synthetic */ jt0 a;

    public mr0(jt0 jt0Var) {
        this.a = jt0Var;
    }

    @Override // org.telegram.ui.Cells.k7
    public final void a(String str, boolean z10) {
        jt0 jt0Var = this.a;
        org.telegram.ui.ActionBar.g2 g2Var = jt0Var.y1;
        if (!z10) {
            jt0Var.d1(str);
            return;
        }
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.o10.j(g2Var.getParentActivity(), false, 1, null);
        j3.P = str;
        j3.Q = false;
        CharSequence[] charSequenceArr = {org.telegram.messenger.hd.N0(2131747623, "Open"), org.telegram.messenger.hd.N0(2131751755, "Copy")};
        og.j jVar = new og.j(6, this, str);
        j3.M = charSequenceArr;
        j3.L = jVar;
        g2Var.showDialog(j3);
    }

    @Override // org.telegram.ui.Cells.k7
    public final boolean b() {
        return !this.a.F1;
    }

    @Override // org.telegram.ui.Cells.k7
    public final void c(TLRPC.WebPage webPage, org.telegram.messenger.gj gjVar) {
        jt0 jt0Var = this.a;
        iu.O0(jt0Var.y1, gjVar, jt0Var.u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }
}
