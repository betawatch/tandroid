package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class e10 implements org.telegram.ui.Cells.h7 {
    public final /* synthetic */ f10 a;

    public e10(f10 f10Var) {
        this.a = f10Var;
    }

    @Override // org.telegram.ui.Cells.h7
    public final void a(String str, boolean z10) {
        i10 i10Var = this.a.v;
        if (!z10) {
            SpannableStringBuilder[] spannableStringBuilderArr = i10.o0;
            i10Var.g(str);
            return;
        }
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(i10Var.G, null, false, false);
        e3Var.fixNavigationBar();
        e3Var.title = str;
        e3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        w wVar = new w(6, this, str);
        e3Var.items = charSequenceArr;
        e3Var.onClickListener = wVar;
        i10Var.H.showDialog(e3Var);
    }

    @Override // org.telegram.ui.Cells.h7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        i10 i10Var = this.a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = i10.o0;
        org.telegram.ui.Components.fu.J(i10Var.H, messageObject, i10Var.c0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.h7
    public final boolean d() {
        return !this.a.v.k0.f();
    }
}
