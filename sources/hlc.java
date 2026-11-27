// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class hlc implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;

    public /* synthetic */ hlc(VoIPService voIPService, byte b) {
        this.a = b;
        this.b = voIPService;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$startGroupCheckShortpoll$65(tLObject, tL_error);
                break;
            case 1:
                voIPService.lambda$startOutgoingCall$7(tLObject, tL_error);
                break;
            case 2:
                voIPService.lambda$acceptIncomingCall$99(tLObject, tL_error);
                break;
            case 3:
                voIPService.lambda$declineIncomingCall$102(tLObject, tL_error);
                break;
            case 4:
                voIPService.lambda$processAcceptedCall$23(tLObject, tL_error);
                break;
            case 5:
                voIPService.lambda$startGroupCall$26(tLObject, tL_error);
                break;
            case 6:
                voIPService.lambda$stopScreenCapture$15(tLObject, tL_error);
                break;
            case 7:
                voIPService.lambda$hangUp$4(tLObject, tL_error);
                break;
            default:
                voIPService.lambda$hangUp$5(tLObject, tL_error);
                break;
        }
    }
}
