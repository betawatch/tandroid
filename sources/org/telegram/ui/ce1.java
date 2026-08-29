package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ce1 implements View.OnClickListener {
    public final /* synthetic */ ze1 a;

    public ce1(ze1 ze1Var) {
        this.a = ze1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ze1 ze1Var = this.a;
        if (ze1Var.I == 1) {
            org.telegram.ui.Components.c5.j0(ze1Var, -ze1Var.a, null, ze1Var.g(), null, false, ze1Var.F, new pa(this, 5), ze1Var.getResourceProvider());
            return;
        }
        ze1Var.getMessagesController().addUserToChat(ze1Var.a, ze1Var.getUserConfig().getCurrentUser(), 0, null, ze1Var, false, new vd1(ze1Var, 2), new wd1(ze1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        ze1Var.O0(false);
    }
}
