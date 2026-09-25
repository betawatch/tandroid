package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class p10 implements org.telegram.ui.Cells.m7 {
    public final /* synthetic */ q10 a;

    public p10(q10 q10Var) {
        this.a = q10Var;
    }

    @Override // org.telegram.ui.Cells.m7
    public final void a(String str, boolean z10) {
        t10 t10Var = this.a.v;
        if (!z10) {
            SpannableStringBuilder[] spannableStringBuilderArr = t10.s0;
            t10Var.g(str);
            return;
        }
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) t10Var.K, (org.telegram.ui.ActionBar.d6) null, false);
        e3Var.fixNavigationBar();
        e3Var.title = str;
        e3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        lg.j jVar = new lg.j(7, this, str);
        e3Var.items = charSequenceArr;
        e3Var.onClickListener = jVar;
        t10Var.L.showDialog(e3Var);
    }

    @Override // org.telegram.ui.Cells.m7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        t10 t10Var = this.a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = t10.s0;
        org.telegram.ui.Components.wu.J(t10Var.L, messageObject, t10Var.g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.m7
    public final boolean e() {
        return !this.a.v.o0.g();
    }
}
