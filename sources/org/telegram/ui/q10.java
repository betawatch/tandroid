package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class q10 implements org.telegram.ui.Cells.j7 {
    public final /* synthetic */ r10 a;

    public q10(r10 r10Var) {
        this.a = r10Var;
    }

    @Override // org.telegram.ui.Cells.j7
    public final void a(String str, boolean z4) {
        u10 u10Var = this.a.v;
        if (!z4) {
            SpannableStringBuilder[] spannableStringBuilderArr = u10.p0;
            u10Var.g(str);
            return;
        }
        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(u10Var.H, null, false, false);
        g3Var.fixNavigationBar();
        g3Var.title = str;
        g3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        cg.u1 u1Var = new cg.u1(7, this, str);
        g3Var.items = charSequenceArr;
        g3Var.onClickListener = u1Var;
        u10Var.I.showDialog(g3Var);
    }

    @Override // org.telegram.ui.Cells.j7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        u10 u10Var = this.a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = u10.p0;
        org.telegram.ui.Components.ou.I(u10Var.I, messageObject, u10Var.d0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.j7
    public final boolean e() {
        return !this.a.v.l0.f();
    }
}
