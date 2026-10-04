package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class mq0 implements org.telegram.ui.ActionBar.s0 {
    public final /* synthetic */ wq0 a;

    public mq0(wq0 wq0Var) {
        this.a = wq0Var;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void e() {
        wq0 wq0Var = this.a;
        wq0Var.Q.setText(LocaleController.getString(wq0Var.Y ? R.string.ShowAsGrid : R.string.ShowAsList));
        wq0Var.Q.setIcon(wq0Var.Y ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void c() {
    }
}
