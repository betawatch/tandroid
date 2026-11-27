// default package

import org.telegram.messenger.voip.OpusDred;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class fw0 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ fw0(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        byte b2 = 0;
        int i = this.b;
        switch (b) {
            case 0:
                hl.c3(new gw0(i, b2));
                break;
            case 1:
                String str = LaunchActivity.C1;
                hl.c3(new b16(tLObject, i, (byte) 1));
                break;
            case 2:
                String str2 = LaunchActivity.C1;
                hl.c3(new b16(tLObject, i, b2));
                break;
            case 3:
                OpusDred.lambda$download$8(i, tLObject, tL_error);
                break;
            case 4:
                hl.c3(new b16(i, tLObject));
                break;
            case 5:
                VoIPGroupNotification.lambda$decline$3(i, tLObject, tL_error);
                break;
            case 6:
                if (tLObject instanceof TLRPC.TL_updates) {
                    uc7.s1(i).Y3((TLRPC.TL_updates) tLObject, false);
                    break;
                }
                break;
            default:
                VoIPPreNotificationService.lambda$decline$4(i, tLObject, tL_error);
                break;
        }
    }
}
