package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class it0 implements org.telegram.ui.Cells.n7 {
    public final /* synthetic */ lv0 a;

    public it0(lv0 lv0Var) {
        this.a = lv0Var;
    }

    @Override // org.telegram.ui.Cells.n7
    public final void a(String str, boolean z10) {
        lv0 lv0Var = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = lv0Var.v1;
        if (!z10) {
            lv0Var.R0(str);
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
        lv0 lv0Var = this.a;
        vu.J(lv0Var.v1, messageObject, lv0Var.r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.n7
    public final boolean e() {
        return !this.a.C1;
    }
}
