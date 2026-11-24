// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class ehc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ ehc(VoIPService voIPService, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_error tL_error = this.c;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$startGroupCall$31(tL_error);
                break;
            case 1:
                voIPService.lambda$startScreenCapture$62(tL_error);
                break;
            default:
                voIPService.lambda$startGroupCall$25(tL_error);
                break;
        }
    }
}
