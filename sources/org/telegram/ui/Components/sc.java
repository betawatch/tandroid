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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sc implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ sc(int i10) {
        this.a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.H1.startActivity(intent);
                    break;
                }
                break;
            case 1:
                SavedMessagesController.openSavedMessagesReminders();
                break;
            case 2:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                break;
            case 3:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                break;
            case 4:
                break;
            case 5:
                int i10 = fo.m1;
                break;
            case 6:
                PhotoViewer.t1().G0(false, false);
                break;
            case 7:
                PhotoViewer.t1().G0(false, false);
                break;
            case 8:
                int i11 = iu.b;
                break;
            case 9:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 10:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 11:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                break;
            case 12:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 13:
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                    l2Var.a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), l2Var);
                    break;
                }
                break;
            case 14:
                int i12 = e11.f;
                break;
            case 15:
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                t11.f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                break;
            case 16:
                SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
                t11.f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                break;
            case 17:
                int i13 = q31.f0;
                break;
            case 18:
                SavedMessagesController.openSavedMessages();
                break;
            case 19:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 20:
                org.telegram.ui.Components.voip.k2.i();
                break;
            case 21:
                ci.f6.q();
                break;
            case 22:
                org.telegram.ui.s50 s50Var = org.telegram.ui.s50.D3;
                if (s50Var != null) {
                    s50Var.show();
                    break;
                }
                break;
            case 23:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 24:
                Pattern pattern = LaunchActivity.C1;
                break;
            case 25:
                Pattern pattern2 = LaunchActivity.C1;
                break;
            case 26:
                Pattern pattern3 = LaunchActivity.C1;
                ApplicationLoader.mainInterfacePausedStageQueue = false;
                ApplicationLoader.mainInterfacePausedStageQueueTime = System.currentTimeMillis();
                break;
            case 27:
                break;
            case 28:
                CallReceiver.checkLastReceivedCall();
                break;
            default:
                CallReceiver.checkLastReceivedCall();
                break;
        }
    }

    public /* synthetic */ sc(Object obj, int i10) {
        this.a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
