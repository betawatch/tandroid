package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class ha implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseController b;
    public final /* synthetic */ int c;

    public /* synthetic */ ha(BaseController baseController, int i10, int i11) {
        this.a = i11;
        this.b = baseController;
        this.c = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((MessagesController) this.b).lambda$migrateDialogs$215(this.c, tLObject, tL_error);
                break;
            case 1:
                ((MessagesController) this.b).lambda$loadPinnedDialogs$368(this.c, tLObject, tL_error);
                break;
            case 2:
                ((MessagesController) this.b).lambda$loadGlobalNotificationsSettings$200(this.c, tLObject, tL_error);
                break;
            default:
                ((ContactsController) this.b).lambda$loadPrivacySettings$65(this.c, tLObject, tL_error);
                break;
        }
    }
}
