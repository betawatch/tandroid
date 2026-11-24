// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class gjc implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ cf7 c;

    public /* synthetic */ gjc(VoIPService voIPService, cf7 cf7Var, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = cf7Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        cf7 cf7Var = this.c;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$acceptIncomingCall$99(cf7Var, tLObject, tL_error);
                break;
            default:
                voIPService.lambda$startOutgoingCall$11(cf7Var, tLObject, tL_error);
                break;
        }
    }
}
