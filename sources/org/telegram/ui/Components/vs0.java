package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class vs0 implements org.telegram.ui.Cells.m7 {
    public final /* synthetic */ yu0 a;

    public vs0(yu0 yu0Var) {
        this.a = yu0Var;
    }

    @Override // org.telegram.ui.Cells.m7
    public final void a(String str, boolean z10) {
        yu0 yu0Var = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = yu0Var.v1;
        if (!z10) {
            yu0Var.R0(str);
            return;
        }
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) n2Var.getParentActivity(), (org.telegram.ui.ActionBar.d6) null, false);
        f3Var.fixNavigationBar();
        f3Var.title = str;
        f3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
        lg.j jVar = new lg.j(6, this, str);
        f3Var.items = charSequenceArr;
        f3Var.onClickListener = jVar;
        n2Var.showDialog(f3Var);
    }

    @Override // org.telegram.ui.Cells.m7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        yu0 yu0Var = this.a;
        wu.J(yu0Var.v1, messageObject, yu0Var.r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.m7
    public final boolean e() {
        return !this.a.C1;
    }
}
