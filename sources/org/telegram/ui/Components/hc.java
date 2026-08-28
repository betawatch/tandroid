package org.telegram.ui.Components;

import android.content.Intent;
import android.content.SharedPreferences;
import java.util.regex.Pattern;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hc implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ hc(int i9) {
        this.a = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SavedMessagesController.openSavedMessages();
                break;
            case 1:
                LaunchActivity launchActivity = LaunchActivity.C1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.C1.startActivity(intent);
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
                int i9 = jn.i1;
                break;
            case 7:
                PhotoViewer.t1().F0(false, false);
                break;
            case 8:
                PhotoViewer.t1().F0(false, false);
                break;
            case 9:
                int i10 = mt.b;
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
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                    m2Var.a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), m2Var);
                    break;
                }
                break;
            case 13:
                int i11 = oz0.f;
                break;
            case 14:
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                d01.f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                break;
            case 15:
                SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
                d01.f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                break;
            case 16:
                int i12 = b21.b0;
                break;
            case 17:
                SavedMessagesController.openSavedMessages();
                break;
            case 18:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 19:
                org.telegram.ui.Components.voip.l2.i();
                break;
            case 20:
                ih.s5.p();
                break;
            case 21:
                org.telegram.ui.o50 o50Var = org.telegram.ui.o50.z3;
                if (o50Var != null) {
                    o50Var.show();
                    break;
                }
                break;
            case 22:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 23:
                Pattern pattern = LaunchActivity.x1;
                break;
            case 24:
                Pattern pattern2 = LaunchActivity.x1;
                break;
            case 25:
                Pattern pattern3 = LaunchActivity.x1;
                ApplicationLoader.mainInterfacePausedStageQueue = false;
                ApplicationLoader.mainInterfacePausedStageQueueTime = System.currentTimeMillis();
                break;
            case 26:
                break;
            case 27:
                CallReceiver.checkLastReceivedCall();
                break;
            case 28:
                CallReceiver.checkLastReceivedCall();
                break;
            default:
                oc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
        }
    }

    public /* synthetic */ hc(Object obj, int i9) {
        this.a = i9;
    }

    private final void a() {
    }

    private final void b() {
    }
}
