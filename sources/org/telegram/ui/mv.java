package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mv implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ dy b;

    public /* synthetic */ mv(dy dyVar, int i9) {
        this.a = i9;
        this.b = dyVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i9) {
        switch (this.a) {
            case 0:
                dy dyVar = this.b;
                dyVar.getClass();
                dyVar.Q1 = i9 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", dyVar.Q1).apply();
                dyVar.k3(false);
                break;
            default:
                dy dyVar2 = this.b;
                dyVar2.getClass();
                dyVar2.Q1 = i9 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", dyVar2.Q1).commit();
                dyVar2.k3(false);
                break;
        }
    }
}
