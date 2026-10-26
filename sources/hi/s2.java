package hi;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ s2(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 0;
        int i12 = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new t2(i12, i11));
                break;
            case 1:
                VoIPGroupNotification.lambda$decline$3(i12, tLObject, tL_error);
                break;
            case 2:
                VoIPPreNotificationService.lambda$decline$4(i12, tLObject, tL_error);
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new d6(i12, tLObject));
                break;
            case 4:
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(i12).lambda$processUpdates$379((TLRPC.TL_updates) tLObject, false);
                    break;
                }
                break;
            case 5:
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new d6(i12, tLObject, 2));
                break;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new d6(i12, tLObject, 1));
                break;
        }
    }
}
