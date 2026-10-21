package gi;

import java.util.regex.Pattern;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationRepeat;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ l2(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MediaDataController.getInstance(this.b).loadAttachMenuBots(false, true);
                break;
            case 1:
                try {
                    MessagesStorage.getInstance(this.b).getDatabase().executeFast("DELETE FROM search_recent WHERE 1").stepThis().dispose();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 2:
                MediaController.lambda$loadGalleryPhotosAlbums$58(this.b);
                break;
            case 3:
                MediaController.lambda$checkGallery$1(this.b);
                break;
            case 4:
                NotificationRepeat.lambda$onHandleIntent$0(this.b);
                break;
            case 5:
                PushListenerController.lambda$processRemoteMessage$3(this.b);
                break;
            case 6:
                PushListenerController.lambda$processRemoteMessage$4(this.b);
                break;
            case 7:
                SharedConfig.lambda$checkLogsToDelete$3(this.b);
                break;
            case 8:
                ConnectionsManager.lambda$onUpdate$13(this.b);
                break;
            case 9:
                ConnectionsManager.lambda$onSessionCreated$14(this.b);
                break;
            case 10:
                ConnectionsManager.lambda$onLogout$16(this.b);
                break;
            case 11:
                MediaDataController.getInstance(this.b).checkStickers(5);
                break;
            default:
                int i10 = this.b;
                Pattern pattern = LaunchActivity.C1;
                ApplicationLoader.mainInterfacePausedStageQueue = true;
                ApplicationLoader.mainInterfacePausedStageQueueTime = 0L;
                if (VoIPService.getSharedInstance() == null) {
                    MessagesController.getInstance(i10).ignoreSetOnline = false;
                    break;
                }
                break;
        }
    }
}
