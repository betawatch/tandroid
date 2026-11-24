// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class bjc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ TLRPC.TL_error d;

    public /* synthetic */ bjc(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = (byte) 1;
        this.b = voIPService;
        this.c = tLObject;
        this.d = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.c;
        TLRPC.TL_error tL_error = this.d;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$acceptIncomingCall$97(tL_error, tLObject);
                break;
            case 1:
                voIPService.lambda$startGroupCheckShortpoll$64(tLObject, tL_error);
                break;
            default:
                voIPService.lambda$processAcceptedCall$22(tL_error, tLObject);
                break;
        }
    }

    public /* synthetic */ bjc(VoIPService voIPService, TLRPC.TL_error tL_error, TLObject tLObject, byte b) {
        this.a = b;
        this.b = voIPService;
        this.d = tL_error;
        this.c = tLObject;
    }
}
