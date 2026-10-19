package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class da implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseController b;
    public final /* synthetic */ int c;

    public /* synthetic */ da(BaseController baseController, int i10, int i11) {
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
                ((MessagesController) this.b).lambda$loadPinnedDialogs$366(this.c, tLObject, tL_error);
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
