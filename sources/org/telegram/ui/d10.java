package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class d10 implements org.telegram.ui.Cells.i7 {
    public final /* synthetic */ e10 a;

    public d10(e10 e10Var) {
        this.a = e10Var;
    }

    @Override // org.telegram.ui.Cells.i7
    public final void a(String str, boolean z10) {
        h10 h10Var = this.a.v;
        if (!z10) {
            SpannableStringBuilder[] spannableStringBuilderArr = h10.o0;
            h10Var.g(str);
            return;
        }
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(h10Var.G, null, false, false);
        f3Var.fixNavigationBar();
        f3Var.title = str;
        f3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        ag.y1 y1Var = new ag.y1(7, this, str);
        f3Var.items = charSequenceArr;
        f3Var.onClickListener = y1Var;
        h10Var.H.showDialog(f3Var);
    }

    @Override // org.telegram.ui.Cells.i7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        h10 h10Var = this.a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = h10.o0;
        org.telegram.ui.Components.mu.I(h10Var.H, messageObject, h10Var.c0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.i7
    public final boolean c() {
        return !this.a.v.k0.f();
    }
}
