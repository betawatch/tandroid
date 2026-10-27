package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class vd implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ vd(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                MessagesController.lambda$reportSpam$77(tLObject, tL_error);
                break;
            case 1:
                MessagesController.lambda$hidePromoDialog$134(tLObject, tL_error);
                break;
            case 2:
                MessagesController.lambda$blockPeer$88(tLObject, tL_error);
                break;
            case 3:
                MessagesController.lambda$deleteParticipantFromChat$315(tLObject, tL_error);
                break;
            case 4:
                NotificationsController.lambda$updateServerNotificationsSettings$52(tLObject, tL_error);
                break;
            case 5:
                NotificationsController.lambda$updateServerNotificationsSettings$53(tLObject, tL_error);
                break;
            default:
                NotificationsController.lambda$updateServerNotificationsSettings$51(tLObject, tL_error);
                break;
        }
    }
}
