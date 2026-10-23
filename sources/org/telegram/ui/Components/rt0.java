package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class rt0 implements org.telegram.ui.Cells.l7 {
    public final /* synthetic */ uv0 a;

    public rt0(uv0 uv0Var) {
        this.a = uv0Var;
    }

    @Override // org.telegram.ui.Cells.l7
    public final void a(String str, boolean z10) {
        uv0 uv0Var = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = uv0Var.v1;
        if (!z10) {
            uv0Var.T0(str);
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
        uv0 uv0Var = this.a;
        cv.J(uv0Var.v1, messageObject, uv0Var.r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.l7
    public final boolean c() {
        return !this.a.C1;
    }
}
