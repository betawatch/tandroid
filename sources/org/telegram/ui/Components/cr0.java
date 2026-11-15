package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class cr0 implements org.telegram.ui.Cells.i7 {
    public final /* synthetic */ ys0 a;

    public cr0(ys0 ys0Var) {
        this.a = ys0Var;
    }

    @Override // org.telegram.ui.Cells.i7
    public final void a(String str, boolean z10) {
        ys0 ys0Var = this.a;
        org.telegram.ui.ActionBar.e2 e2Var = ys0Var.y1;
        if (!z10) {
            ys0Var.d1(str);
            return;
        }
        org.telegram.ui.ActionBar.u2 i7 = org.telegram.messenger.i20.i(e2Var.getParentActivity(), false, 1, null);
        i7.P = str;
        i7.Q = false;
        CharSequence[] charSequenceArr = {org.telegram.messenger.hd.M0(2131747817, "Open"), org.telegram.messenger.hd.M0(2131751767, "Copy")};
        og.j jVar = new og.j(6, this, str);
        i7.M = charSequenceArr;
        i7.L = jVar;
        e2Var.showDialog(i7);
    }

    @Override // org.telegram.ui.Cells.i7
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.gj gjVar) {
        ys0 ys0Var = this.a;
        bu.N0(ys0Var.y1, gjVar, ys0Var.u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.i7
    public final boolean c() {
        return !this.a.F1;
    }
}
