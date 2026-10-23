package org.telegram.ui.Components;

import android.content.Intent;
import android.content.SharedPreferences;
import java.util.regex.Pattern;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rc implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ rc(int i10) {
        this.a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SavedMessagesController.openSavedMessages();
                break;
            case 1:
                LaunchActivity launchActivity = LaunchActivity.J1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.J1.startActivity(intent);
                    break;
                }
                break;
            case 2:
                SavedMessagesController.openSavedMessagesReminders();
                break;
            case 3:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                break;
            case 4:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                break;
            case 5:
                break;
            case 6:
                int i10 = fo.r1;
                break;
            case 7:
                PhotoViewer.u1().H0(false, false);
                break;
            case 8:
                PhotoViewer.u1().H0(false, false);
                break;
            case 9:
                int i11 = iu.b;
                break;
            case 10:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 11:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 12:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                break;
            case 13:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 14:
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                    m2Var.a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), m2Var);
                    break;
                }
                break;
            case 15:
                int i12 = j11.f;
                break;
            case 16:
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                y11.f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                break;
            case 17:
                SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
                y11.f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                break;
            case 18:
                int i13 = w31.i0;
                break;
            case 19:
                SavedMessagesController.openSavedMessages();
                break;
            case 20:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 21:
                org.telegram.ui.Components.voip.k2.i();
                break;
            case 22:
                ci.f6.q();
                break;
            case 23:
                org.telegram.ui.u50 u50Var = org.telegram.ui.u50.D3;
                if (u50Var != null) {
                    u50Var.show();
                    break;
                }
                break;
            case 24:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 25:
                Pattern pattern = LaunchActivity.E1;
                break;
            case 26:
                Pattern pattern2 = LaunchActivity.E1;
                break;
            case 27:
                Pattern pattern3 = LaunchActivity.E1;
                ApplicationLoader.mainInterfacePausedStageQueue = false;
                ApplicationLoader.mainInterfacePausedStageQueueTime = System.currentTimeMillis();
                break;
            case 28:
                break;
            default:
                CallReceiver.checkLastReceivedCall();
                break;
        }
    }

    public /* synthetic */ rc(Object obj, int i10) {
        this.a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
