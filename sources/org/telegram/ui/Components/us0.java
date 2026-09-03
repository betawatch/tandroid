package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class us0 implements org.telegram.ui.Cells.k7 {
    public final /* synthetic */ yu0 a;

    public us0(yu0 yu0Var) {
        this.a = yu0Var;
    }

    @Override // org.telegram.ui.Cells.k7
    public final void a(String str, boolean z4) {
        yu0 yu0Var = this.a;
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.s1;
        if (!z4) {
            yu0Var.R0(str);
            return;
        }
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(p2Var.getParentActivity(), null, false, false);
        h3Var.fixNavigationBar();
        h3Var.title = str;
        h3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
        dg.t1 t1Var = new dg.t1(6, this, str);
        h3Var.items = charSequenceArr;
        h3Var.onClickListener = t1Var;
        p2Var.showDialog(h3Var);
    }

    @Override // org.telegram.ui.Cells.k7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        yu0 yu0Var = this.a;
        ru.I(yu0Var.s1, messageObject, yu0Var.o1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.k7
    public final boolean d() {
        return !this.a.z1;
    }
}
