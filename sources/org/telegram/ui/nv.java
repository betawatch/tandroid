package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nv implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ fy b;

    public /* synthetic */ nv(fy fyVar, int i10) {
        this.a = i10;
        this.b = fyVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                fy fyVar = this.b;
                fyVar.getClass();
                fyVar.Q1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", fyVar.Q1).apply();
                fyVar.k3(false);
                break;
            default:
                fy fyVar2 = this.b;
                fyVar2.getClass();
                fyVar2.Q1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", fyVar2.Q1).commit();
                fyVar2.k3(false);
                break;
        }
    }
}
