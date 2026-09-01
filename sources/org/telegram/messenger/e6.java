package org.telegram.messenger;

import java.util.regex.Pattern;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class e6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ e6(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MediaController.lambda$loadGalleryPhotosAlbums$57(this.b);
                break;
            case 1:
                MediaController.lambda$checkGallery$1(this.b);
                break;
            case 2:
                NotificationRepeat.lambda$onHandleIntent$0(this.b);
                break;
            case 3:
                PushListenerController.lambda$processRemoteMessage$3(this.b);
                break;
            case 4:
                PushListenerController.lambda$processRemoteMessage$4(this.b);
                break;
            case 5:
                SharedConfig.lambda$checkLogsToDelete$3(this.b);
                break;
            case 6:
                ConnectionsManager.lambda$onUpdate$13(this.b);
                break;
            case 7:
                ConnectionsManager.lambda$onSessionCreated$14(this.b);
                break;
            case 8:
                ConnectionsManager.lambda$onLogout$16(this.b);
                break;
            case 9:
                MediaDataController.getInstance(this.b).checkStickers(5);
                break;
            case 10:
                int i10 = this.b;
                Pattern pattern = LaunchActivity.y1;
                ApplicationLoader.mainInterfacePausedStageQueue = true;
                ApplicationLoader.mainInterfacePausedStageQueueTime = 0L;
                if (VoIPService.getSharedInstance() == null) {
                    MessagesController.getInstance(i10).ignoreSetOnline = false;
                    break;
                }
                break;
            default:
                MediaDataController.getInstance(this.b).loadAttachMenuBots(false, true);
                break;
        }
    }
}
