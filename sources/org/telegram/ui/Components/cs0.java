package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class cs0 implements org.telegram.ui.Cells.h7 {
    public final /* synthetic */ hu0 a;

    public cs0(hu0 hu0Var) {
        this.a = hu0Var;
    }

    @Override // org.telegram.ui.Cells.h7
    public final void a(String str, boolean z10) {
        hu0 hu0Var = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = hu0Var.r1;
        if (!z10) {
            hu0Var.R0(str);
            return;
        }
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(n2Var.getParentActivity(), null, false, false);
        e3Var.fixNavigationBar();
        e3Var.title = str;
        e3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
        org.telegram.ui.w wVar = new org.telegram.ui.w(5, this, str);
        e3Var.items = charSequenceArr;
        e3Var.onClickListener = wVar;
        n2Var.showDialog(e3Var);
    }

    @Override // org.telegram.ui.Cells.h7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        hu0 hu0Var = this.a;
        fu.J(hu0Var.r1, messageObject, hu0Var.n1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.h7
    public final boolean d() {
        return !this.a.y1;
    }
}
