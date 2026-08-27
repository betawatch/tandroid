package org.telegram.messenger;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                FileLog.dumpANR();
                break;
            case 4:
                ApplicationLoader.startPushService();
                break;
            case 5:
                ApplicationLoader.lambda$initPushServices$0();
                break;
            case 6:
                BotGuardHelper.lambda$openGuardBotWebApp$1();
                break;
            case 7:
                CodeHighlighting.lambda$prepare$2();
                break;
            case 8:
                Emoji.lambda$static$0();
                break;
            case 9:
                KeepAliveJob.finishJobInternal();
                break;
            case 10:
                KeepAliveJob.lambda$startJob$0();
                break;
            case 11:
                LocaleController.lambda$applyLanguage$9();
                break;
            case 12:
                LocationController.lambda$setLastKnownLocation$10();
                break;
            case 13:
                LocationSharingService.lambda$onCreate$0();
                break;
            case 14:
                MediaDataController.lambda$cleanup$1();
                break;
            case 15:
                org.telegram.ui.ActionBar.g6.E(false);
                break;
            case 16:
                NotificationCenter.lambda$listen$3();
                break;
            case 17:
                NotificationsController.lambda$dismissNotification$37();
                break;
            case 18:
                SharedConfig.saveConfig();
                break;
            case 19:
                SharedConfig.lambda$checkSdCard$0();
                break;
            case 20:
                SharedConfig.lambda$checkSdCard$2();
                break;
            case 21:
                SharedConfig.lambda$checkSaveToGalleryFiles$5();
                break;
            default:
                SvgHelper.SvgDrawable.shiftRunnable = null;
                break;
        }
    }
}
