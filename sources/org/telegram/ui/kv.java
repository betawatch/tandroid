package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kv implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ cy b;

    public /* synthetic */ kv(cy cyVar, int i10) {
        this.a = i10;
        this.b = cyVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                cy cyVar = this.b;
                cyVar.getClass();
                cyVar.U1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", cyVar.U1).apply();
                cyVar.r3(false);
                break;
            default:
                cy cyVar2 = this.b;
                cyVar2.getClass();
                cyVar2.U1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", cyVar2.U1).commit();
                cyVar2.r3(false);
                break;
        }
    }
}
