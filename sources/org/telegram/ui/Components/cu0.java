package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class cu0 implements org.telegram.ui.Cells.q7 {
    public final /* synthetic */ bw0 a;

    public cu0(bw0 bw0Var) {
        this.a = bw0Var;
    }

    @Override // org.telegram.ui.Cells.q7
    public final void a(String str, boolean z10) {
        bw0 bw0Var = this.a;
        org.telegram.ui.ActionBar.r2 r2Var = bw0Var.x1;
        if (!z10) {
            bw0Var.X0(str);
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
        bw0 bw0Var = this.a;
        dv.I(bw0Var.x1, messageObject, bw0Var.t1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.q7
    public final boolean c() {
        return !this.a.E1;
    }
}
