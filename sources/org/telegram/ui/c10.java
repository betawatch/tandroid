package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class c10 implements org.telegram.ui.Cells.l7 {
    public final /* synthetic */ d10 a;

    public c10(d10 d10Var) {
        this.a = d10Var;
    }

    @Override // org.telegram.ui.Cells.l7
    public final void a(String str, boolean z10) {
        g10 g10Var = this.a.v;
        if (!z10) {
            SpannableStringBuilder[] spannableStringBuilderArr = g10.s0;
            g10Var.g(str);
            return;
        }
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) g10Var.K, (org.telegram.ui.ActionBar.d6) null, false);
        f3Var.fixNavigationBar();
        f3Var.title = str;
        f3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        mg.j jVar = new mg.j(7, this, str);
        f3Var.items = charSequenceArr;
        f3Var.onClickListener = jVar;
        g10Var.L.showDialog(f3Var);
    }

    @Override // org.telegram.ui.Cells.l7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        g10 g10Var = this.a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = g10.s0;
        org.telegram.ui.Components.cv.J(g10Var.L, messageObject, g10Var.g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.l7
    public final boolean c() {
        return !this.a.v.o0.g();
    }
}
