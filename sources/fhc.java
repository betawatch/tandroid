// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class fhc implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ ad7 c;

    public /* synthetic */ fhc(VoIPService voIPService, ad7 ad7Var, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = ad7Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        ad7 ad7Var = this.c;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$acceptIncomingCall$99(ad7Var, tLObject, tL_error);
                break;
            default:
                voIPService.lambda$startOutgoingCall$11(ad7Var, tLObject, tL_error);
                break;
        }
    }
}
