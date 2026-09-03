package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class p10 implements org.telegram.ui.Cells.k7 {
    public final /* synthetic */ q10 a;

    public p10(q10 q10Var) {
        this.a = q10Var;
    }

    @Override // org.telegram.ui.Cells.k7
    public final void a(String str, boolean z4) {
        t10 t10Var = this.a.v;
        if (!z4) {
            SpannableStringBuilder[] spannableStringBuilderArr = t10.p0;
            t10Var.g(str);
            return;
        }
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(t10Var.H, null, false, false);
        h3Var.fixNavigationBar();
        h3Var.title = str;
        h3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        dg.t1 t1Var = new dg.t1(7, this, str);
        h3Var.items = charSequenceArr;
        h3Var.onClickListener = t1Var;
        t10Var.I.showDialog(h3Var);
    }

    @Override // org.telegram.ui.Cells.k7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        t10 t10Var = this.a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = t10.p0;
        org.telegram.ui.Components.ru.I(t10Var.I, messageObject, t10Var.d0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.k7
    public final boolean d() {
        return !this.a.v.l0.f();
    }
}
