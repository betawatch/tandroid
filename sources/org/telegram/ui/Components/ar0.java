package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ar0 implements org.telegram.ui.Cells.i7 {
    public final /* synthetic */ ws0 a;

    public ar0(ws0 ws0Var) {
        this.a = ws0Var;
    }

    @Override // org.telegram.ui.Cells.i7
    public final void a(String str, boolean z10) {
        ws0 ws0Var = this.a;
        org.telegram.ui.ActionBar.d2 d2Var = ws0Var.y1;
        if (!z10) {
            ws0Var.b1(str);
            return;
        }
        org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(d2Var.getParentActivity(), false, 1, null);
        h.P = str;
        h.Q = false;
        CharSequence[] charSequenceArr = {org.telegram.messenger.bd.M0(2131747825, "Open"), org.telegram.messenger.bd.M0(2131751767, "Copy")};
        org.telegram.ui.u uVar = new org.telegram.ui.u(5, this, str);
        h.M = charSequenceArr;
        h.L = uVar;
        d2Var.showDialog(h);
    }

    @Override // org.telegram.ui.Cells.i7
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.zi ziVar) {
        ws0 ws0Var = this.a;
        ut.K0(ws0Var.y1, ziVar, ws0Var.u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.i7
    public final boolean c() {
        return !this.a.F1;
    }
}
