package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class dd implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ dd(int i9) {
        this.a = i9;
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
