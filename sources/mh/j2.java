package mh;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ j2(int i9, int i10) {
        this.a = i10;
        this.b = i9;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.a;
        int i10 = 0;
        int i11 = this.b;
        switch (i9) {
            case 0:
                AndroidUtilities.runOnUIThread(new k2(i11, i10));
                break;
            case 1:
                VoIPGroupNotification.lambda$decline$3(i11, tLObject, tL_error);
                break;
            case 2:
                VoIPPreNotificationService.lambda$decline$4(i11, tLObject, tL_error);
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new k5(i11, tLObject));
                break;
            case 4:
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(i11).processUpdates((TLRPC.TL_updates) tLObject, false);
                    break;
                }
                break;
            case 5:
                Pattern pattern = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new k5(i11, tLObject, 2));
                break;
            default:
                Pattern pattern2 = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new k5(i11, tLObject, 1));
                break;
        }
    }
}
