package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class jq0 implements org.telegram.ui.ActionBar.r0 {
    public final /* synthetic */ tq0 a;

    public jq0(tq0 tq0Var) {
        this.a = tq0Var;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final void e() {
        tq0 tq0Var = this.a;
        tq0Var.Q.setText(LocaleController.getString(tq0Var.Y ? R.string.ShowAsGrid : R.string.ShowAsList));
        tq0Var.Q.setIcon(tq0Var.Y ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final void c() {
    }
}
