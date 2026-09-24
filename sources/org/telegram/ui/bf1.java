package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class bf1 implements View.OnClickListener {
    public final /* synthetic */ wf1 a;

    public bf1(wf1 wf1Var) {
        this.a = wf1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        wf1 wf1Var = this.a;
        if (wf1Var.M == 1) {
            org.telegram.ui.Components.e5.j0(wf1Var, -wf1Var.a, null, wf1Var.g(), null, false, wf1Var.J, new ua(this, 5), wf1Var.getResourceProvider());
            return;
        }
        wf1Var.getMessagesController().addUserToChat(wf1Var.a, wf1Var.getUserConfig().getCurrentUser(), 0, null, wf1Var, false, new ue1(wf1Var, 2), new ve1(wf1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        wf1Var.O0(false);
    }
}
