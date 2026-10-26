package org.telegram.messenger;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class a2 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ a2(int i10) {
        this.a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ContactsController.MyContentObserver.lambda$new$0();
                break;
            case 1:
                MediaController.GalleryObserverExternal.lambda$onChange$0();
                break;
            case 2:
                AppStartReceiver.lambda$onReceive$0();
                break;
            case 3:
                ApplicationLoader.lambda$new$1();
                break;
            case 4:
                NotificationCenter.sanitize();
                break;
            case 5:
                FileLog.dumpANR();
                break;
            case 6:
                ApplicationLoader.startPushService();
                break;
            case 7:
                ApplicationLoader.lambda$initPushServices$2();
                break;
            case 8:
                BotGuardHelper.lambda$openGuardBotWebApp$1();
                break;
            case 9:
                Emoji.lambda$static$0();
                break;
            case 10:
                KeepAliveJob.finishJobInternal();
                break;
            case 11:
                KeepAliveJob.lambda$startJob$0();
                break;
            case 12:
                LiteMode.getValue(false);
                break;
            case 13:
                LiteMode.queryBatteryLevel();
                break;
            case 14:
                LocaleController.lambda$applyLanguage$9();
                break;
            case 15:
                LocationController.lambda$setLastKnownLocation$10();
                break;
            case 16:
                LocationSharingService.lambda$onCreate$0();
                break;
            case 17:
                MediaDataController.lambda$cleanup$1();
                break;
            case 18:
                org.telegram.ui.ActionBar.y6.E(false);
                break;
            case 19:
                NotificationCenter.lambda$listen$3();
                break;
            case 20:
                NotificationsController.lambda$dismissNotification$38();
                break;
            case 21:
                SharedConfig.saveConfig();
                break;
            case 22:
                SharedConfig.lambda$checkSdCard$0();
                break;
            case 23:
                SharedConfig.lambda$checkSdCard$2();
                break;
            case 24:
                SharedConfig.lambda$checkSaveToGalleryFiles$5();
                break;
            default:
                SvgHelper.SvgDrawable.shiftRunnable = null;
                break;
        }
    }
}
