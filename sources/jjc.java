// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class jjc implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;

    public /* synthetic */ jjc(VoIPService voIPService, byte b) {
        this.a = b;
        this.b = voIPService;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$acceptIncomingCall$98(tLObject, tL_error);
                break;
            case 1:
                voIPService.lambda$startOutgoingCall$7(tLObject, tL_error);
                break;
            case 2:
                voIPService.lambda$declineIncomingCall$101(tLObject, tL_error);
                break;
            case 3:
                voIPService.lambda$processAcceptedCall$23(tLObject, tL_error);
                break;
            case 4:
                voIPService.lambda$startGroupCall$26(tLObject, tL_error);
                break;
            case 5:
                voIPService.lambda$stopScreenCapture$15(tLObject, tL_error);
                break;
            case 6:
                voIPService.lambda$hangUp$4(tLObject, tL_error);
                break;
            case 7:
                voIPService.lambda$hangUp$5(tLObject, tL_error);
                break;
            default:
                voIPService.lambda$startGroupCheckShortpoll$65(tLObject, tL_error);
                break;
        }
    }
}
