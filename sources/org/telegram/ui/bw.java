package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class bw implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ wy b;

    public /* synthetic */ bw(wy wyVar, int i10) {
        this.a = i10;
        this.b = wyVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                wy wyVar = this.b;
                wyVar.getClass();
                wyVar.U1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", wyVar.U1).apply();
                wyVar.k3(false);
                break;
            default:
                wy wyVar2 = this.b;
                wyVar2.getClass();
                wyVar2.U1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", wyVar2.U1).commit();
                wyVar2.k3(false);
                break;
        }
    }
}
