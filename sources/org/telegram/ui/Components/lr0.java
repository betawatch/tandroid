package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class lr0 implements org.telegram.ui.Cells.j7 {
    public final /* synthetic */ it0 a;

    public lr0(it0 it0Var) {
        this.a = it0Var;
    }

    @Override // org.telegram.ui.Cells.j7
    public final void a(String str, boolean z10) {
        it0 it0Var = this.a;
        org.telegram.ui.ActionBar.g2 g2Var = it0Var.y1;
        if (!z10) {
            it0Var.d1(str);
            return;
        }
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.m10.j(g2Var.getParentActivity(), false, 1, null);
        j3.P = str;
        j3.Q = false;
        CharSequence[] charSequenceArr = {org.telegram.messenger.gd.N0(2131747623, "Open"), org.telegram.messenger.gd.N0(2131751755, "Copy")};
        og.j jVar = new og.j(6, this, str);
        j3.M = charSequenceArr;
        j3.L = jVar;
        g2Var.showDialog(j3);
    }

    @Override // org.telegram.ui.Cells.j7
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.fj fjVar) {
        it0 it0Var = this.a;
        gu.O0(it0Var.y1, fjVar, it0Var.u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.j7
    public final boolean d() {
        return !this.a.F1;
    }
}
