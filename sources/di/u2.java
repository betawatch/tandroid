package di;

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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class u2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ u2(int i10, int i11) {
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
                int i10 = this.b;
                Pattern pattern = LaunchActivity.B1;
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
