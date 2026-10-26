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
import org.telegram.ui.Components.db1;
import org.telegram.ui.Components.fb1;
import org.telegram.ui.Components.jb1;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        jb1 jb1Var;
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
                fb1.n(i10 + "/", fb1.b.keySet());
                for (db1 db1Var : fb1.a.values()) {
                    if (db1Var.b == i10 && db1Var.k.isEmpty() && (jb1Var = db1Var.i) != null) {
                        jb1Var.m();
                        jb1Var.g = null;
                        jb1Var.i = 0;
                        jb1Var.k = 0;
                        jb1Var.l = false;
                    }
                }
                break;
            case 13:
                String m10 = a1.g.m(this.b, "/");
                fb1.n(m10, fb1.b.keySet());
                fb1.n(m10, fb1.c.keySet());
                fb1.n(m10, fb1.d.keySet());
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
