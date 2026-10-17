package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class aq0 implements org.telegram.ui.ActionBar.r0 {
    public final /* synthetic */ kq0 a;

    public aq0(kq0 kq0Var) {
        this.a = kq0Var;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final void f() {
        kq0 kq0Var = this.a;
        kq0Var.Q.setText(LocaleController.getString(kq0Var.Y ? R.string.ShowAsGrid : R.string.ShowAsList));
        kq0Var.Q.setIcon(kq0Var.Y ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final void e() {
    }
}
