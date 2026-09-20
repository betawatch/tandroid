package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class gt0 implements org.telegram.ui.Cells.n7 {
    public final /* synthetic */ jv0 a;

    public gt0(jv0 jv0Var) {
        this.a = jv0Var;
    }

    @Override // org.telegram.ui.Cells.n7
    public final void a(String str, boolean z10) {
        jv0 jv0Var = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = jv0Var.v1;
        if (!z10) {
            jv0Var.R0(str);
            return;
        }
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) n2Var.getParentActivity(), (org.telegram.ui.ActionBar.f6) null, false);
        f3Var.fixNavigationBar();
        f3Var.title = str;
        f3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
        lg.j jVar = new lg.j(6, this, str);
        f3Var.items = charSequenceArr;
        f3Var.onClickListener = jVar;
        n2Var.showDialog(f3Var);
    }

    @Override // org.telegram.ui.Cells.n7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        jv0 jv0Var = this.a;
        vu.J(jv0Var.v1, messageObject, jv0Var.r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.n7
    public final boolean e() {
        return !this.a.C1;
    }
}
