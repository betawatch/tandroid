package hi;

import org.telegram.messenger.qp;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ g2(int i7, int i10) {
        this.a = i10;
        this.b = i7;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        int i10 = 0;
        int i11 = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new j2(i11, i10));
                break;
            case 1:
                VoIPGroupNotification.lambda$decline$3(i11, tLObject, tL_error);
                break;
            case 2:
                VoIPPreNotificationService.lambda$decline$4(i11, tLObject, tL_error);
                break;
            case 3:
                org.telegram.messenger.g0.h3(new n5(i11, tLObject));
                break;
            case 4:
                if (tLObject instanceof TLRPC.TL_updates) {
                    qp.s1(i11).O3((TLRPC.TL_updates) tLObject, false);
                    break;
                }
                break;
            case 5:
                String str = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new n5(i11, 2, tLObject));
                break;
            default:
                String str2 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new n5(i11, 1, tLObject));
                break;
        }
    }
}
