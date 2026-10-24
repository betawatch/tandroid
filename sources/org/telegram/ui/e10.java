package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class e10 implements org.telegram.ui.Cells.m7 {
    public final /* synthetic */ f10 a;

    public e10(f10 f10Var) {
        this.a = f10Var;
    }

    @Override // org.telegram.ui.Cells.m7
    public final void a(String str, boolean z10) {
        i10 i10Var = this.a.v;
        if (!z10) {
            SpannableStringBuilder[] spannableStringBuilderArr = i10.s0;
            i10Var.g(str);
            return;
        }
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) i10Var.K, (org.telegram.ui.ActionBar.g6) null, false);
        h3Var.fixNavigationBar();
        h3Var.title = str;
        h3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        mg.j jVar = new mg.j(7, this, str);
        h3Var.items = charSequenceArr;
        h3Var.onClickListener = jVar;
        i10Var.L.showDialog(h3Var);
    }

    @Override // org.telegram.ui.Cells.m7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        i10 i10Var = this.a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = i10.s0;
        org.telegram.ui.Components.cv.I(i10Var.L, messageObject, i10Var.g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.m7
    public final boolean e() {
        return !this.a.v.o0.g();
    }
}
