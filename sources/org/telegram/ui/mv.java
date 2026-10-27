package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mv implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey b;

    public /* synthetic */ mv(ey eyVar, int i10) {
        this.a = i10;
        this.b = eyVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                ey eyVar = this.b;
                eyVar.getClass();
                eyVar.U1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", eyVar.U1).apply();
                eyVar.r3(false);
                break;
            default:
                ey eyVar2 = this.b;
                eyVar2.getClass();
                eyVar2.U1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", eyVar2.U1).commit();
                eyVar2.r3(false);
                break;
        }
    }
}
