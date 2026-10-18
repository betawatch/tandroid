package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                eyVar.h3(false);
                break;
            default:
                ey eyVar2 = this.b;
                eyVar2.getClass();
                eyVar2.U1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", eyVar2.U1).commit();
                eyVar2.h3(false);
                break;
        }
    }
}
