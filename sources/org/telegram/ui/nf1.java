package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class nf1 implements View.OnClickListener {
    public final /* synthetic */ ig1 a;

    public nf1(ig1 ig1Var) {
        this.a = ig1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ig1 ig1Var = this.a;
        if (ig1Var.M == 1) {
            org.telegram.ui.Components.d5.j0(ig1Var, -ig1Var.a, null, ig1Var.g(), null, false, ig1Var.J, new wa(this, 5), ig1Var.getResourceProvider());
            return;
        }
        ig1Var.getMessagesController().addUserToChat(ig1Var.a, ig1Var.getUserConfig().getCurrentUser(), 0, null, ig1Var, false, new gf1(ig1Var, 2), new hf1(ig1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        ig1Var.O0(false);
    }
}
