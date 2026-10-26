package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class bu0 implements org.telegram.ui.Cells.q7 {
    public final /* synthetic */ aw0 a;

    public bu0(aw0 aw0Var) {
        this.a = aw0Var;
    }

    @Override // org.telegram.ui.Cells.q7
    public final void a(String str, boolean z10) {
        aw0 aw0Var = this.a;
        org.telegram.ui.ActionBar.r2 r2Var = aw0Var.x1;
        if (!z10) {
            aw0Var.X0(str);
            return;
        }
        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) r2Var.getParentActivity(), (org.telegram.ui.ActionBar.u6) null, false);
        k3Var.fixNavigationBar();
        k3Var.title = str;
        k3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
        ng.j jVar = new ng.j(6, this, str);
        k3Var.items = charSequenceArr;
        k3Var.onClickListener = jVar;
        r2Var.showDialog(k3Var);
    }

    @Override // org.telegram.ui.Cells.q7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        aw0 aw0Var = this.a;
        dv.I(aw0Var.x1, messageObject, aw0Var.t1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.q7
    public final boolean c() {
        return !this.a.E1;
    }
}
