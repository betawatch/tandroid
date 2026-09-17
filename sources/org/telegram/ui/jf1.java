package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
