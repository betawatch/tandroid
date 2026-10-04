package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class df1 implements View.OnClickListener {
    public final /* synthetic */ yf1 a;

    public df1(yf1 yf1Var) {
        this.a = yf1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        yf1 yf1Var = this.a;
        if (yf1Var.M == 1) {
            org.telegram.ui.Components.e5.j0(yf1Var, -yf1Var.a, null, yf1Var.g(), null, false, yf1Var.J, new wa(this, 5), yf1Var.getResourceProvider());
            return;
        }
        yf1Var.getMessagesController().addUserToChat(yf1Var.a, yf1Var.getUserConfig().getCurrentUser(), 0, null, yf1Var, false, new we1(yf1Var, 2), new xe1(yf1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        yf1Var.O0(false);
    }
}
