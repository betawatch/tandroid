package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pv implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ gy b;

    public /* synthetic */ pv(gy gyVar, int i10) {
        this.a = i10;
        this.b = gyVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                gy gyVar = this.b;
                gyVar.getClass();
                gyVar.Q1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", gyVar.Q1).apply();
                gyVar.k3(false);
                break;
            default:
                gy gyVar2 = this.b;
                gyVar2.getClass();
                gyVar2.Q1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", gyVar2.Q1).commit();
                gyVar2.k3(false);
                break;
        }
    }
}
