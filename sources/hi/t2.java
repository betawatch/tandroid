package hi;

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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.jb1;
import org.telegram.ui.Components.nb1;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ t2(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nb1 nb1Var;
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
                MediaController.lambda$loadGalleryPhotosAlbums$60(this.b);
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
            case 12:
                int i10 = this.b;
                jb1.t(i10 + "/", jb1.b.keySet());
                for (gb1 gb1Var : jb1.a.values()) {
                    if (gb1Var.b == i10 && gb1Var.u.isEmpty() && (nb1Var = gb1Var.s) != null) {
                        nb1Var.r();
                        nb1Var.g = null;
                        nb1Var.i = 0;
                        nb1Var.k = 0;
                        nb1Var.l = false;
                    }
                }
                break;
            case 13:
                String m10 = a1.g.m(this.b, "/");
                jb1.t(m10, jb1.b.keySet());
                jb1.t(m10, jb1.c.keySet());
                jb1.t(m10, jb1.d.keySet());
                break;
            default:
                int i11 = this.b;
                Pattern pattern = LaunchActivity.D1;
                ApplicationLoader.mainInterfacePausedStageQueue = true;
                ApplicationLoader.mainInterfacePausedStageQueueTime = 0L;
                if (VoIPService.getSharedInstance() == null) {
                    MessagesController.getInstance(i11).ignoreSetOnline = false;
                    break;
                }
                break;
        }
    }
}
