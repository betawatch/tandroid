package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class oe1 implements View.OnClickListener {
    public final /* synthetic */ kf1 a;

    public oe1(kf1 kf1Var) {
        this.a = kf1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kf1 kf1Var = this.a;
        if (kf1Var.J == 1) {
            org.telegram.ui.Components.z4.j0(kf1Var, -kf1Var.a, null, kf1Var.g(), null, false, kf1Var.G, new ta(this, 5), kf1Var.getResourceProvider());
            return;
        }
        kf1Var.getMessagesController().addUserToChat(kf1Var.a, kf1Var.getUserConfig().getCurrentUser(), 0, null, kf1Var, false, new he1(kf1Var, 2), new ie1(kf1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        kf1Var.O0(false);
    }
}
