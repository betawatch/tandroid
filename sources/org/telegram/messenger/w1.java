package org.telegram.messenger;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class w1 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ w1(int i10) {
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
                CodeHighlighting.lambda$prepare$2();
                break;
            case 10:
                Emoji.lambda$static$0();
                break;
            case 11:
                KeepAliveJob.finishJobInternal();
                break;
            case 12:
                KeepAliveJob.lambda$startJob$0();
                break;
            case 13:
                LocaleController.lambda$applyLanguage$9();
                break;
            case 14:
                LocationController.lambda$setLastKnownLocation$10();
                break;
            case 15:
                LocationSharingService.lambda$onCreate$0();
                break;
            case 16:
                MediaDataController.lambda$cleanup$1();
                break;
            case 17:
                org.telegram.ui.ActionBar.h6.E(false);
                break;
            case 18:
                NotificationCenter.lambda$listen$3();
                break;
            case 19:
                NotificationsController.lambda$dismissNotification$37();
                break;
            case 20:
                SharedConfig.saveConfig();
                break;
            case 21:
                SharedConfig.lambda$checkSdCard$0();
                break;
            case 22:
                SharedConfig.lambda$checkSdCard$2();
                break;
            case 23:
                SharedConfig.lambda$checkSaveToGalleryFiles$5();
                break;
            default:
                SvgHelper.SvgDrawable.shiftRunnable = null;
                break;
        }
    }
}
