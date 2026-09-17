package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aw implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy b;

    public /* synthetic */ aw(uy uyVar, int i10) {
        this.a = i10;
        this.b = uyVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                uy uyVar = this.b;
                uyVar.getClass();
                uyVar.U1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", uyVar.U1).apply();
                uyVar.k3(false);
                break;
            default:
                uy uyVar2 = this.b;
                uyVar2.getClass();
                uyVar2.U1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", uyVar2.U1).commit();
                uyVar2.k3(false);
                break;
        }
    }
}
