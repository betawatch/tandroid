package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class cr0 implements org.telegram.ui.Cells.j7 {
    public final /* synthetic */ zs0 a;

    public cr0(zs0 zs0Var) {
        this.a = zs0Var;
    }

    @Override // org.telegram.ui.Cells.j7
    public final void a(String str, boolean z9) {
        zs0 zs0Var = this.a;
        org.telegram.ui.ActionBar.f2 f2Var = zs0Var.x1;
        if (!z9) {
            zs0Var.d1(str);
            return;
        }
        org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(f2Var.getParentActivity(), false, 1, null);
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
        zs0 zs0Var = this.a;
        wt.N0(zs0Var.x1, ijVar, zs0Var.t1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.j7
    public final boolean d() {
        return !this.a.E1;
    }
}
