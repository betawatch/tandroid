package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b10 implements org.telegram.ui.Cells.k7 {
    public final /* synthetic */ c10 a;

    public b10(c10 c10Var) {
        this.a = c10Var;
    }

    @Override // org.telegram.ui.Cells.k7
    public final void a(String str, boolean z10) {
        f10 f10Var = this.a.v;
        if (!z10) {
            SpannableStringBuilder[] spannableStringBuilderArr = f10.o0;
            f10Var.g(str);
            return;
        }
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(f10Var.G, null, false, false);
        f3Var.fixNavigationBar();
        f3Var.title = str;
        f3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        v vVar = new v(6, this, str);
        f3Var.items = charSequenceArr;
        f3Var.onClickListener = vVar;
        f10Var.H.showDialog(f3Var);
    }

    @Override // org.telegram.ui.Cells.k7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        f10 f10Var = this.a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = f10.o0;
        org.telegram.ui.Components.gu.I(f10Var.H, messageObject, f10Var.c0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.k7
    public final boolean f() {
        return !this.a.v.k0.f();
    }
}
