package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class kq0 implements org.telegram.ui.ActionBar.s0 {
    public final /* synthetic */ uq0 a;

    public kq0(uq0 uq0Var) {
        this.a = uq0Var;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void e() {
        uq0 uq0Var = this.a;
        uq0Var.Q.setText(LocaleController.getString(uq0Var.Y ? R.string.ShowAsGrid : R.string.ShowAsList));
        uq0Var.Q.setIcon(uq0Var.Y ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void c() {
    }
}
