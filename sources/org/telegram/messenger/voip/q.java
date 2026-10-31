package org.telegram.messenger.voip;

import java.util.regex.Pattern;
import org.telegram.messenger.vp;
import org.telegram.messenger.wd;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ q(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = this.b;
        switch (i10) {
            case 0:
                VoIPGroupNotification.lambda$decline$3(i11, tLObject, tL_error);
                break;
            case 1:
                VoIPPreNotificationService.lambda$decline$4(i11, tLObject, tL_error);
                break;
            case 2:
                org.telegram.messenger.i0.g3(new x5(i11, tLObject));
                break;
            case 3:
                if (tLObject instanceof TLRPC.TL_updates) {
                    vp.r1(i11).L3((TLRPC.TL_updates) tLObject, false);
                    break;
                }
                break;
            case 4:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new x5(i11, 2, tLObject));
                break;
            case 5:
                Pattern pattern2 = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new x5(i11, 1, tLObject));
                break;
            default:
                org.telegram.messenger.i0.g3(new wd(i11, 13));
                break;
        }
    }
}
