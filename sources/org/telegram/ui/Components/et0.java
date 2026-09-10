package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class et0 implements org.telegram.ui.Cells.n7 {
    public final /* synthetic */ iv0 a;

    public et0(iv0 iv0Var) {
        this.a = iv0Var;
    }

    @Override // org.telegram.ui.Cells.n7
    public final void a(String str, boolean z10) {
        iv0 iv0Var = this.a;
        org.telegram.ui.ActionBar.p2 p2Var = iv0Var.v1;
        if (!z10) {
            iv0Var.R0(str);
            return;
        }
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) p2Var.getParentActivity(), (org.telegram.ui.ActionBar.f6) null, false);
        h3Var.fixNavigationBar();
        h3Var.title = str;
        h3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
        kg.j jVar = new kg.j(7, this, str);
        h3Var.items = charSequenceArr;
        h3Var.onClickListener = jVar;
        p2Var.showDialog(h3Var);
    }

    @Override // org.telegram.ui.Cells.n7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        iv0 iv0Var = this.a;
        zu.J(iv0Var.v1, messageObject, iv0Var.r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.n7
    public final boolean e() {
        return !this.a.C1;
    }
}
