package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class pt0 implements org.telegram.ui.Cells.l7 {
    public final /* synthetic */ sv0 a;

    public pt0(sv0 sv0Var) {
        this.a = sv0Var;
    }

    @Override // org.telegram.ui.Cells.l7
    public final void a(String str, boolean z10) {
        sv0 sv0Var = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = sv0Var.v1;
        if (!z10) {
            sv0Var.T0(str);
            return;
        }
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) n2Var.getParentActivity(), (org.telegram.ui.ActionBar.d6) null, false);
        f3Var.fixNavigationBar();
        f3Var.title = str;
        f3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
        mg.j jVar = new mg.j(6, this, str);
        f3Var.items = charSequenceArr;
        f3Var.onClickListener = jVar;
        n2Var.showDialog(f3Var);
    }

    @Override // org.telegram.ui.Cells.l7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        sv0 sv0Var = this.a;
        cv.J(sv0Var.v1, messageObject, sv0Var.r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.l7
    public final boolean c() {
        return !this.a.C1;
    }
}
