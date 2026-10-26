package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class hq0 implements org.telegram.ui.ActionBar.t0 {
    public final /* synthetic */ rq0 a;

    public hq0(rq0 rq0Var) {
        this.a = rq0Var;
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final void b() {
        rq0 rq0Var = this.a;
        rq0Var.Q.setText(LocaleController.getString(rq0Var.Y ? R.string.ShowAsGrid : R.string.ShowAsList));
        rq0Var.Q.setIcon(rq0Var.Y ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final void a() {
    }
}
