package ii;

import org.telegram.messenger.hp;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ g2(int i3, int i10) {
        this.a = i10;
        this.b = i3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3 = this.a;
        int i10 = 0;
        int i11 = this.b;
        switch (i3) {
            case 0:
                org.telegram.messenger.g0.h3(new i2(i11, i10));
                break;
            case 1:
                VoIPGroupNotification.lambda$decline$3(i11, tLObject, tL_error);
                break;
            case 2:
                VoIPPreNotificationService.lambda$decline$4(i11, tLObject, tL_error);
                break;
            case 3:
                org.telegram.messenger.g0.h3(new m5(i11, tLObject));
                break;
            case 4:
                if (tLObject instanceof TLRPC.TL_updates) {
                    hp.s1(i11).O3((TLRPC.TL_updates) tLObject, false);
                    break;
                }
                break;
            case 5:
                String str = LaunchActivity.E1;
                org.telegram.messenger.g0.h3(new m5(i11, 2, tLObject));
                break;
            default:
                String str2 = LaunchActivity.E1;
                org.telegram.messenger.g0.h3(new m5(i11, 1, tLObject));
                break;
        }
    }
}
