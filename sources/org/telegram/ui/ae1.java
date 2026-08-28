package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ae1 implements View.OnClickListener {
    public final /* synthetic */ we1 a;

    public ae1(we1 we1Var) {
        this.a = we1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        we1 we1Var = this.a;
        if (we1Var.I == 1) {
            org.telegram.ui.Components.y4.j0(we1Var, -we1Var.a, null, we1Var.g(), null, false, we1Var.F, new qa(this, 5), we1Var.getResourceProvider());
            return;
        }
        we1Var.getMessagesController().addUserToChat(we1Var.a, we1Var.getUserConfig().getCurrentUser(), 0, null, we1Var, false, new td1(we1Var, 2), new ud1(we1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        we1Var.O0(false);
    }
}
