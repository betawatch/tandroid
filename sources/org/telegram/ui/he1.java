package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class he1 implements View.OnClickListener {
    public final /* synthetic */ cf1 a;

    public he1(cf1 cf1Var) {
        this.a = cf1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cf1 cf1Var = this.a;
        if (cf1Var.M == 1) {
            org.telegram.ui.Components.g5.i0(cf1Var, -cf1Var.a, null, cf1Var.g(), null, false, cf1Var.J, new wa(this, 5), cf1Var.getResourceProvider());
            return;
        }
        cf1Var.getMessagesController().addUserToChat(cf1Var.a, cf1Var.getUserConfig().getCurrentUser(), 0, null, cf1Var, false, new ae1(cf1Var, 2), new be1(cf1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        cf1Var.O0(false);
    }
}
