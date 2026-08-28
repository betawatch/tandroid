package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class VideoEncodingService extends Service implements NotificationCenter.NotificationCenterDelegate {
    private static VideoEncodingService instance;
    private e0.t builder;
    int currentAccount;
    private MediaController.VideoConvertMessage currentMessage;
    String currentPath;

    public static boolean isRunning() {
        return instance != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$didReceivedNotification$0() {
        MediaController.VideoConvertMessage currentForegroundConverMessage = MediaController.getInstance().getCurrentForegroundConverMessage();
        if (currentForegroundConverMessage != null) {
            setCurrentMessage(currentForegroundConverMessage);
        } else {
            stopSelf();
        }
    }

    private void setCurrentMessage(MediaController.VideoConvertMessage videoConvertMessage) {
        MediaController.VideoConvertMessage videoConvertMessage2 = this.currentMessage;
        if (videoConvertMessage2 == videoConvertMessage) {
            return;
        }
        if (videoConvertMessage2 != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploadFailed);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploaded);
        }
        updateBuilderForMessage(videoConvertMessage);
        this.currentMessage = videoConvertMessage;
        int i9 = videoConvertMessage.currentAccount;
        this.currentAccount = i9;
        this.currentPath = videoConvertMessage.messageObject.messageOwner.attachPath;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
        if (isRunning()) {
            updateNotification();
        }
    }

    public static void start(boolean z10) {
        if (instance == null) {
            try {
                ApplicationLoader.applicationContext.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) VideoEncodingService.class));
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        if (z10) {
            MediaController.VideoConvertMessage currentForegroundConverMessage = MediaController.getInstance().getCurrentForegroundConverMessage();
            VideoEncodingService videoEncodingService = instance;
            if (videoEncodingService.currentMessage != currentForegroundConverMessage) {
                if (currentForegroundConverMessage != null) {
                    videoEncodingService.setCurrentMessage(currentForegroundConverMessage);
                } else {
                    videoEncodingService.stopSelf();
                }
            }
        }
    }

    public static void stop() {
        VideoEncodingService videoEncodingService = instance;
        if (videoEncodingService != null) {
            videoEncodingService.stopSelf();
        }
    }

    private void updateBuilderForMessage(MediaController.VideoConvertMessage videoConvertMessage) {
        if (videoConvertMessage == null) {
            return;
        }
        MessageObject messageObject = videoConvertMessage.messageObject;
        boolean z10 = messageObject != null && MessageObject.isGifMessage(messageObject.messageOwner);
        if (videoConvertMessage.foregroundConversion) {
            this.builder.p(LocaleController.getString(R.string.ConvertingVideo));
            this.builder.f(LocaleController.getString(R.string.ConvertingVideo));
        } else if (z10) {
            this.builder.p(LocaleController.getString(R.string.SendingGif));
            this.builder.f(LocaleController.getString(R.string.SendingGif));
        } else {
            this.builder.p(LocaleController.getString(R.string.SendingVideo));
            this.builder.f(LocaleController.getString(R.string.SendingVideo));
        }
        e0.t tVar = this.builder;
        tVar.n = 100;
        tVar.o = 0;
        tVar.p = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNotification() {
        try {
            if (MediaController.getInstance().getCurrentForegroundConverMessage() == null) {
                return;
            }
            new e0.n0(ApplicationLoader.applicationContext).d(4, this.builder.b());
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i9, int i10, Object... objArr) {
        String str;
        String str2;
        if (i9 != NotificationCenter.fileUploadProgressChanged) {
            if (i9 == NotificationCenter.fileUploaded || i9 == NotificationCenter.fileUploadFailed) {
                String str3 = (String) objArr[0];
                if (i10 == this.currentAccount && (str = this.currentPath) != null && str.equals(str3)) {
                    AndroidUtilities.runOnUIThread(new ml(this, 0));
                    return;
                }
                return;
            }
            return;
        }
        String str4 = (String) objArr[0];
        if (i10 == this.currentAccount && (str2 = this.currentPath) != null && str2.equals(str4)) {
            float min = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
            int i11 = (int) (min * 100.0f);
            e0.t tVar = this.builder;
            boolean z10 = i11 == 0;
            tVar.n = 100;
            tVar.o = i11;
            tVar.p = z10;
            updateNotification();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        instance = null;
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        new e0.n0(ApplicationLoader.applicationContext).b(4);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploaded);
        this.currentMessage = null;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("VideoEncodingService: destroy video service");
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i9, int i10) {
        MediaController.VideoConvertMessage currentForegroundConverMessage;
        if (isRunning() || (currentForegroundConverMessage = MediaController.getInstance().getCurrentForegroundConverMessage()) == null) {
            return 2;
        }
        instance = this;
        if (this.builder == null) {
            NotificationsController.checkOtherNotificationsChannel();
            e0.t tVar = new e0.t(ApplicationLoader.applicationContext, NotificationsController.OTHER_NOTIFICATIONS_CHANNEL);
            this.builder = tVar;
            tVar.E.icon = android.R.drawable.stat_sys_upload;
            tVar.E.when = System.currentTimeMillis();
            e0.t tVar2 = this.builder;
            tVar2.y = NotificationsController.OTHER_NOTIFICATIONS_CHANNEL;
            tVar2.g(LocaleController.getString(R.string.AppName));
        }
        setCurrentMessage(currentForegroundConverMessage);
        try {
            startForeground(4, this.builder.b());
        } catch (Throwable th) {
            FileLog.e(th);
        }
        AndroidUtilities.runOnUIThread(new ml(this, 1));
        return 2;
    }
}
