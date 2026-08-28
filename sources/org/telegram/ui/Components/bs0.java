package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bs0 implements org.telegram.ui.Cells.k7 {
    public final /* synthetic */ eu0 a;

    public bs0(eu0 eu0Var) {
        this.a = eu0Var;
    }

    @Override // org.telegram.ui.Cells.k7
    public final void a(String str, boolean z10) {
        eu0 eu0Var = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = eu0Var.r1;
        if (!z10) {
            eu0Var.R0(str);
            return;
        }
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(o2Var.getParentActivity(), null, false, false);
        f3Var.fixNavigationBar();
        f3Var.title = str;
        f3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
        org.telegram.ui.v vVar = new org.telegram.ui.v(5, this, str);
        f3Var.items = charSequenceArr;
        f3Var.onClickListener = vVar;
        o2Var.showDialog(f3Var);
    }

    @Override // org.telegram.ui.Cells.k7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        eu0 eu0Var = this.a;
        gu.I(eu0Var.r1, messageObject, eu0Var.n1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.k7
    public final boolean f() {
        return !this.a.y1;
    }
}
