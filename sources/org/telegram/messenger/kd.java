package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class kd implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ kd(int i10) {
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
