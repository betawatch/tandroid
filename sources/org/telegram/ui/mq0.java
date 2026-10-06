package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
