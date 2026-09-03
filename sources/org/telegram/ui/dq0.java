package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class dq0 implements org.telegram.ui.ActionBar.t0 {
    public final /* synthetic */ mq0 a;

    public dq0(mq0 mq0Var) {
        this.a = mq0Var;
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final void e() {
        mq0 mq0Var = this.a;
        mq0Var.N.setText(LocaleController.getString(mq0Var.V ? R.string.ShowAsGrid : R.string.ShowAsList));
        mq0Var.N.setIcon(mq0Var.V ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final void c() {
    }
}
