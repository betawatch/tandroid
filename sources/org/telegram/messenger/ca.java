package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ca implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseController b;
    public final /* synthetic */ int c;

    public /* synthetic */ ca(BaseController baseController, int i9, int i10) {
        this.a = i10;
        this.b = baseController;
        this.c = i9;
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
