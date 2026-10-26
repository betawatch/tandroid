package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class fe1 implements View.OnClickListener {
    public final /* synthetic */ af1 a;

    public fe1(af1 af1Var) {
        this.a = af1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        af1 af1Var = this.a;
        if (af1Var.M == 1) {
            org.telegram.ui.Components.g5.i0(af1Var, -af1Var.a, null, af1Var.g(), null, false, af1Var.J, new wa(this, 5), af1Var.getResourceProvider());
            return;
        }
        af1Var.getMessagesController().addUserToChat(af1Var.a, af1Var.getUserConfig().getCurrentUser(), 0, null, af1Var, false, new yd1(af1Var, 2), new zd1(af1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        af1Var.O0(false);
    }
}
