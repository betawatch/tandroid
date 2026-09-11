package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class hd implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ hd(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                MessagesController.lambda$removeSuggestion$40(tLObject, tL_error);
                break;
            case 1:
                MessagesController.lambda$hidePromoDialog$135(tLObject, tL_error);
                break;
            case 2:
                MessagesController.lambda$blockPeer$89(tLObject, tL_error);
                break;
            case 3:
                MessagesController.lambda$logDeviceStats$31(tLObject, tL_error);
                break;
            case 4:
                MessagesController.lambda$deleteParticipantFromChat$314(tLObject, tL_error);
                break;
            case 5:
                NotificationsController.lambda$updateServerNotificationsSettings$51(tLObject, tL_error);
                break;
            case 6:
                NotificationsController.lambda$updateServerNotificationsSettings$52(tLObject, tL_error);
                break;
            default:
                NotificationsController.lambda$updateServerNotificationsSettings$50(tLObject, tL_error);
                break;
        }
    }
}
