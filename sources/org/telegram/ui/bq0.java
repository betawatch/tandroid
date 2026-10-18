package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class bq0 implements org.telegram.ui.ActionBar.r0 {
    public final /* synthetic */ lq0 a;

    public bq0(lq0 lq0Var) {
        this.a = lq0Var;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final void f() {
        lq0 lq0Var = this.a;
        lq0Var.Q.setText(LocaleController.getString(lq0Var.Y ? R.string.ShowAsGrid : R.string.ShowAsList));
        lq0Var.Q.setIcon(lq0Var.Y ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final void e() {
    }
}
