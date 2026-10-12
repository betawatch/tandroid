package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class dw implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;

    public /* synthetic */ dw(yy yyVar, int i10) {
        this.a = i10;
        this.b = yyVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                yy yyVar = this.b;
                yyVar.getClass();
                yyVar.U1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", yyVar.U1).apply();
                yyVar.h3(false);
                break;
            default:
                yy yyVar2 = this.b;
                yyVar2.getClass();
                yyVar2.U1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", yyVar2.U1).commit();
                yyVar2.h3(false);
                break;
        }
    }
}
