package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class gt0 implements org.telegram.ui.Cells.m7 {
    public final /* synthetic */ jv0 a;

    public gt0(jv0 jv0Var) {
        this.a = jv0Var;
    }

    @Override // org.telegram.ui.Cells.m7
    public final void a(String str, boolean z10) {
        jv0 jv0Var = this.a;
        org.telegram.ui.ActionBar.m2 m2Var = jv0Var.v1;
        if (!z10) {
            jv0Var.R0(str);
            return;
        }
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) m2Var.getParentActivity(), (org.telegram.ui.ActionBar.d6) null, false);
        e3Var.fixNavigationBar();
        e3Var.title = str;
        e3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
        lg.j jVar = new lg.j(6, this, str);
        e3Var.items = charSequenceArr;
        e3Var.onClickListener = jVar;
        m2Var.showDialog(e3Var);
    }

    @Override // org.telegram.ui.Cells.m7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        jv0 jv0Var = this.a;
        wu.J(jv0Var.v1, messageObject, jv0Var.r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.m7
    public final boolean e() {
        return !this.a.C1;
    }
}
