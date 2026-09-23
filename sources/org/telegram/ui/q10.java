package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class q10 implements org.telegram.ui.Cells.m7 {
    public final /* synthetic */ r10 a;

    public q10(r10 r10Var) {
        this.a = r10Var;
    }

    @Override // org.telegram.ui.Cells.m7
    public final void a(String str, boolean z10) {
        u10 u10Var = this.a.v;
        if (!z10) {
            SpannableStringBuilder[] spannableStringBuilderArr = u10.s0;
            u10Var.g(str);
            return;
        }
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) u10Var.K, (org.telegram.ui.ActionBar.d6) null, false);
        f3Var.fixNavigationBar();
        f3Var.title = str;
        f3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        lg.j jVar = new lg.j(7, this, str);
        f3Var.items = charSequenceArr;
        f3Var.onClickListener = jVar;
        u10Var.L.showDialog(f3Var);
    }

    @Override // org.telegram.ui.Cells.m7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        u10 u10Var = this.a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = u10.s0;
        org.telegram.ui.Components.wu.J(u10Var.L, messageObject, u10Var.g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.m7
    public final boolean e() {
        return !this.a.v.o0.g();
    }
}
