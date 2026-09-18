package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ws0 implements org.telegram.ui.Cells.m7 {
    public final /* synthetic */ zu0 a;

    public ws0(zu0 zu0Var) {
        this.a = zu0Var;
    }

    @Override // org.telegram.ui.Cells.m7
    public final void a(String str, boolean z10) {
        zu0 zu0Var = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = zu0Var.v1;
        if (!z10) {
            zu0Var.R0(str);
            return;
        }
        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(1, (Context) o2Var.getParentActivity(), (org.telegram.ui.ActionBar.f6) null, false);
        g3Var.fixNavigationBar();
        g3Var.title = str;
        g3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
        lg.j jVar = new lg.j(6, this, str);
        g3Var.items = charSequenceArr;
        g3Var.onClickListener = jVar;
        o2Var.showDialog(g3Var);
    }

    @Override // org.telegram.ui.Cells.m7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        zu0 zu0Var = this.a;
        vu.J(zu0Var.v1, messageObject, zu0Var.r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.m7
    public final boolean e() {
        return !this.a.C1;
    }
}
