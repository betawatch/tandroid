package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class jf1 implements View.OnClickListener {
    public final /* synthetic */ eg1 a;

    public jf1(eg1 eg1Var) {
        this.a = eg1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        eg1 eg1Var = this.a;
        if (eg1Var.M == 1) {
            org.telegram.ui.Components.e5.j0(eg1Var, -eg1Var.a, null, eg1Var.g(), null, false, eg1Var.J, new va(this, 5), eg1Var.getResourceProvider());
            return;
        }
        eg1Var.getMessagesController().addUserToChat(eg1Var.a, eg1Var.getUserConfig().getCurrentUser(), 0, null, eg1Var, false, new cf1(eg1Var, 2), new df1(eg1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        eg1Var.O0(false);
    }
}
