package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class ld implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ ld(int i10) {
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
