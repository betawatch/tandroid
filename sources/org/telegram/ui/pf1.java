package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class pf1 implements View.OnClickListener {
    public final /* synthetic */ kg1 a;

    public pf1(kg1 kg1Var) {
        this.a = kg1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kg1 kg1Var = this.a;
        if (kg1Var.M == 1) {
            org.telegram.ui.Components.g5.i0(kg1Var, -kg1Var.a, null, kg1Var.g(), null, false, kg1Var.J, new za(this, 5), kg1Var.getResourceProvider());
            return;
        }
        kg1Var.getMessagesController().addUserToChat(kg1Var.a, kg1Var.getUserConfig().getCurrentUser(), 0, null, kg1Var, false, new if1(kg1Var, 2), new jf1(kg1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        kg1Var.O0(false);
    }
}
