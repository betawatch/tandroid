package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class if1 implements View.OnClickListener {
    public final /* synthetic */ dg1 a;

    public if1(dg1 dg1Var) {
        this.a = dg1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dg1 dg1Var = this.a;
        if (dg1Var.M == 1) {
            org.telegram.ui.Components.e5.j0(dg1Var, -dg1Var.a, null, dg1Var.g(), null, false, dg1Var.J, new va(this, 5), dg1Var.getResourceProvider());
            return;
        }
        dg1Var.getMessagesController().addUserToChat(dg1Var.a, dg1Var.getUserConfig().getCurrentUser(), 0, null, dg1Var, false, new bf1(dg1Var, 2), new cf1(dg1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        dg1Var.O0(false);
    }
}
