package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class fa implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseController b;
    public final /* synthetic */ int c;

    public /* synthetic */ fa(BaseController baseController, int i10, int i11) {
        this.a = i11;
        this.b = baseController;
        this.c = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((MessagesController) this.b).lambda$migrateDialogs$216(this.c, tLObject, tL_error);
                break;
            case 1:
                ((MessagesController) this.b).lambda$loadPinnedDialogs$367(this.c, tLObject, tL_error);
                break;
            case 2:
                ((MessagesController) this.b).lambda$loadGlobalNotificationsSettings$201(this.c, tLObject, tL_error);
                break;
            default:
                ((ContactsController) this.b).lambda$loadPrivacySettings$65(this.c, tLObject, tL_error);
                break;
        }
    }
}
