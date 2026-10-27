package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class jq0 implements org.telegram.ui.ActionBar.t0 {
    public final /* synthetic */ tq0 a;

    public jq0(tq0 tq0Var) {
        this.a = tq0Var;
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final void b() {
        tq0 tq0Var = this.a;
        tq0Var.Q.setText(LocaleController.getString(tq0Var.Y ? R.string.ShowAsGrid : R.string.ShowAsList));
        tq0Var.Q.setIcon(tq0Var.Y ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final void a() {
    }
}
