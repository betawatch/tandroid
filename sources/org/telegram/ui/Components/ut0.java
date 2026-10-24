package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ut0 implements org.telegram.ui.Cells.m7 {
    public final /* synthetic */ xv0 a;

    public ut0(xv0 xv0Var) {
        this.a = xv0Var;
    }

    @Override // org.telegram.ui.Cells.m7
    public final void a(String str, boolean z10) {
        xv0 xv0Var = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = xv0Var.v1;
        if (!z10) {
            xv0Var.U0(str);
            return;
        }
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) o2Var.getParentActivity(), (org.telegram.ui.ActionBar.g6) null, false);
        h3Var.fixNavigationBar();
        h3Var.title = str;
        h3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
        mg.j jVar = new mg.j(6, this, str);
        h3Var.items = charSequenceArr;
        h3Var.onClickListener = jVar;
        o2Var.showDialog(h3Var);
    }

    @Override // org.telegram.ui.Cells.m7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        xv0 xv0Var = this.a;
        cv.I(xv0Var.v1, messageObject, xv0Var.r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.m7
    public final boolean e() {
        return !this.a.C1;
    }
}
