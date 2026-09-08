package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class us0 implements org.telegram.ui.Cells.m7 {
    public final /* synthetic */ xu0 a;

    public us0(xu0 xu0Var) {
        this.a = xu0Var;
    }

    @Override // org.telegram.ui.Cells.m7
    public final void a(String str, boolean z10) {
        xu0 xu0Var = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = xu0Var.v1;
        if (!z10) {
            xu0Var.R0(str);
            return;
        }
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) n2Var.getParentActivity(), (org.telegram.ui.ActionBar.f6) null, false);
        f3Var.fixNavigationBar();
        f3Var.title = str;
        f3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
        mg.j jVar = new mg.j(6, this, str);
        f3Var.items = charSequenceArr;
        f3Var.onClickListener = jVar;
        n2Var.showDialog(f3Var);
    }

    @Override // org.telegram.ui.Cells.m7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        xu0 xu0Var = this.a;
        tu.J(xu0Var.v1, messageObject, xu0Var.r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.m7
    public final boolean c() {
        return !this.a.C1;
    }
}
