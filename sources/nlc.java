// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class nlc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ nlc(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = (byte) 2;
        this.b = voIPService;
        this.d = tLObject;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_error tL_error = this.c;
        TLObject tLObject = this.d;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$acceptIncomingCall$98(tL_error, tLObject);
                break;
            case 1:
                voIPService.lambda$processAcceptedCall$22(tL_error, tLObject);
                break;
            default:
                voIPService.lambda$startGroupCheckShortpoll$64(tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ nlc(VoIPService voIPService, TLRPC.TL_error tL_error, TLObject tLObject, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = tL_error;
        this.d = tLObject;
    }
}
