package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class kf1 implements View.OnClickListener {
    public final /* synthetic */ fg1 a;

    public kf1(fg1 fg1Var) {
        this.a = fg1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        fg1 fg1Var = this.a;
        if (fg1Var.M == 1) {
            org.telegram.ui.Components.g5.i0(fg1Var, -fg1Var.a, null, fg1Var.g(), null, false, fg1Var.J, new va(this, 5), fg1Var.getResourceProvider());
            return;
        }
        fg1Var.getMessagesController().addUserToChat(fg1Var.a, fg1Var.getUserConfig().getCurrentUser(), 0, null, fg1Var, false, new df1(fg1Var, 2), new ef1(fg1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        fg1Var.O0(false);
    }
}
