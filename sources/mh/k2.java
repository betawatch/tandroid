package mh;

import java.util.regex.Pattern;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationRepeat;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ k2(int i9, int i10) {
        this.a = i10;
        this.b = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MediaDataController.getInstance(this.b).loadAttachMenuBots(false, true);
                break;
            case 1:
                MediaController.lambda$loadGalleryPhotosAlbums$57(this.b);
                break;
            case 2:
                MediaController.lambda$checkGallery$1(this.b);
                break;
            case 3:
                NotificationRepeat.lambda$onHandleIntent$0(this.b);
                break;
            case 4:
                PushListenerController.lambda$processRemoteMessage$3(this.b);
                break;
            case 5:
                PushListenerController.lambda$processRemoteMessage$4(this.b);
                break;
            case 6:
                SharedConfig.lambda$checkLogsToDelete$3(this.b);
                break;
            case 7:
                ConnectionsManager.lambda$onUpdate$13(this.b);
                break;
            case 8:
                ConnectionsManager.lambda$onSessionCreated$14(this.b);
                break;
            case 9:
                ConnectionsManager.lambda$onLogout$16(this.b);
                break;
            case 10:
                MediaDataController.getInstance(this.b).checkStickers(5);
                break;
            default:
                int i9 = this.b;
                Pattern pattern = LaunchActivity.x1;
                ApplicationLoader.mainInterfacePausedStageQueue = true;
                ApplicationLoader.mainInterfacePausedStageQueueTime = 0L;
                if (VoIPService.getSharedInstance() == null) {
                    MessagesController.getInstance(i9).ignoreSetOnline = false;
                    break;
                }
                break;
        }
    }
}
