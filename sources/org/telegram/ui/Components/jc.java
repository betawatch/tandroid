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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jc implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ jc(int i10) {
        this.a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SavedMessagesController.openSavedMessages();
                break;
            case 1:
                LaunchActivity launchActivity = LaunchActivity.D1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.D1.startActivity(intent);
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
                int i10 = sn.j1;
                break;
            case 7:
                PhotoViewer.t1().G0(false, false);
                break;
            case 8:
                PhotoViewer.t1().G0(false, false);
                break;
            case 9:
                int i11 = xt.b;
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
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                    n2Var.a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), n2Var);
                    break;
                }
                break;
            case 13:
                int i12 = m01.f;
                break;
            case 14:
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                b11.f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                break;
            case 15:
                SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
                b11.f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                break;
            case 16:
                int i13 = x21.c0;
                break;
            case 17:
                SavedMessagesController.openSavedMessages();
                break;
            case 18:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 19:
                org.telegram.ui.Components.voip.n2.i();
                break;
            case 20:
                oh.r5.p();
                break;
            case 21:
                org.telegram.ui.d60 d60Var = org.telegram.ui.d60.A3;
                if (d60Var != null) {
                    d60Var.show();
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
                Pattern pattern = LaunchActivity.y1;
                break;
            case 24:
                Pattern pattern2 = LaunchActivity.y1;
                break;
            case 25:
                Pattern pattern3 = LaunchActivity.y1;
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
                qc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
        }
    }

    public /* synthetic */ jc(Object obj, int i10) {
        this.a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
