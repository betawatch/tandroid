package ki;

import org.telegram.messenger.mp;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.o5;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ b2(int i7, int i10) {
        this.a = i10;
        this.b = i7;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        int i10 = 1;
        int i11 = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g3(new jg.x(i11, i10));
                break;
            case 1:
                VoIPGroupNotification.lambda$decline$3(i11, tLObject, tL_error);
                break;
            case 2:
                VoIPPreNotificationService.lambda$decline$4(i11, tLObject, tL_error);
                break;
            case 3:
                org.telegram.messenger.g0.g3(new o5(i11, tLObject));
                break;
            case 4:
                if (tLObject instanceof TLRPC.TL_updates) {
                    mp.u1(i11).V3((TLRPC.TL_updates) tLObject, false);
                    break;
                }
                break;
            case 5:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new o5(i11, 2, tLObject));
                break;
            default:
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new o5(i11, i10, tLObject));
                break;
        }
    }
}
