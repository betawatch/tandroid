package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class f10 implements org.telegram.ui.Cells.q7 {
    public final /* synthetic */ g10 a;

    public f10(g10 g10Var) {
        this.a = g10Var;
    }

    @Override // org.telegram.ui.Cells.q7
    public final void a(String str, boolean z10) {
        j10 j10Var = this.a.v;
        if (!z10) {
            SpannableStringBuilder[] spannableStringBuilderArr = j10.s0;
            j10Var.g(str);
            return;
        }
        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) j10Var.K, (org.telegram.ui.ActionBar.u6) null, false);
        k3Var.fixNavigationBar();
        k3Var.title = str;
        k3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        ng.j jVar = new ng.j(7, this, str);
        k3Var.items = charSequenceArr;
        k3Var.onClickListener = jVar;
        j10Var.L.showDialog(k3Var);
    }

    @Override // org.telegram.ui.Cells.q7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        j10 j10Var = this.a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = j10.s0;
        org.telegram.ui.Components.dv.I(j10Var.L, messageObject, j10Var.g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.q7
    public final boolean c() {
        return !this.a.v.o0.g();
    }
}
