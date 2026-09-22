package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
