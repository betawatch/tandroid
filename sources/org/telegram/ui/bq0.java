package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
