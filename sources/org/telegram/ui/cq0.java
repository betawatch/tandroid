package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class cq0 implements org.telegram.ui.ActionBar.r0 {
    public final /* synthetic */ mq0 a;

    public cq0(mq0 mq0Var) {
        this.a = mq0Var;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final void d() {
        mq0 mq0Var = this.a;
        mq0Var.Q.setText(LocaleController.getString(mq0Var.Y ? R.string.ShowAsGrid : R.string.ShowAsList));
        mq0Var.Q.setIcon(mq0Var.Y ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final void c() {
    }
}
