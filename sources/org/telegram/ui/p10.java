package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(t10Var.H, null, false, false);
        g3Var.fixNavigationBar();
        g3Var.title = str;
        g3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        cg.u1 u1Var = new cg.u1(7, this, str);
        g3Var.items = charSequenceArr;
        g3Var.onClickListener = u1Var;
        t10Var.I.showDialog(g3Var);
    }

    @Override // org.telegram.ui.Cells.k7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        t10 t10Var = this.a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = t10.p0;
        org.telegram.ui.Components.pu.I(t10Var.I, messageObject, t10Var.d0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.k7
    public final boolean d() {
        return !this.a.v.l0.f();
    }
}
