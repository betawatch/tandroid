package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ce1 implements View.OnClickListener {
    public final /* synthetic */ ye1 a;

    public ce1(ye1 ye1Var) {
        this.a = ye1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ye1 ye1Var = this.a;
        if (ye1Var.M == 1) {
            org.telegram.ui.Components.f5.j0(ye1Var, -ye1Var.a, null, ye1Var.g(), null, false, ye1Var.J, new va(this, 5), ye1Var.getResourceProvider());
            return;
        }
        ye1Var.getMessagesController().addUserToChat(ye1Var.a, ye1Var.getUserConfig().getCurrentUser(), 0, null, ye1Var, false, new vd1(ye1Var, 2), new wd1(ye1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        ye1Var.N0(false);
    }
}
