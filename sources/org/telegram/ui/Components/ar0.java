package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ar0 implements org.telegram.ui.Cells.j7 {
    public final /* synthetic */ xs0 a;

    public ar0(xs0 xs0Var) {
        this.a = xs0Var;
    }

    @Override // org.telegram.ui.Cells.j7
    public final void a(String str, boolean z9) {
        xs0 xs0Var = this.a;
        org.telegram.ui.ActionBar.f2 f2Var = xs0Var.x1;
        if (!z9) {
            xs0Var.b1(str);
            return;
        }
        org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(f2Var.getParentActivity(), false, 1, null);
        h.O = str;
        h.P = false;
        CharSequence[] charSequenceArr = {org.telegram.messenger.hd.M0(2131747816, "Open"), org.telegram.messenger.hd.M0(2131751767, "Copy")};
        og.j jVar = new og.j(6, this, str);
        h.L = charSequenceArr;
        h.K = jVar;
        f2Var.showDialog(h);
    }

    @Override // org.telegram.ui.Cells.j7
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.ij ijVar) {
        xs0 xs0Var = this.a;
        vt.N0(xs0Var.x1, ijVar, xs0Var.t1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.j7
    public final boolean d() {
        return !this.a.E1;
    }
}
