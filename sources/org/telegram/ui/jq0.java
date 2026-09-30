package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
