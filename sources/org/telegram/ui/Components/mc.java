package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mc implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ mc(int i10) {
        this.a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SavedMessagesController.openSavedMessagesReminders();
                break;
            case 1:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                break;
            case 2:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                break;
            case 3:
                break;
            case 4:
                int i10 = qn.j1;
                break;
            case 5:
                PhotoViewer.t1().G0(false, false);
                break;
            case 6:
                PhotoViewer.t1().G0(false, false);
                break;
            case 7:
                int i11 = vt.b;
                break;
            case 8:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 9:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 10:
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                    n2Var.a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), n2Var);
                    break;
                }
                break;
            case 11:
                int i12 = l01.f;
                break;
            case 12:
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                a11.f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                break;
            case 13:
                SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
                a11.f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                break;
            case 14:
                int i13 = w21.c0;
                break;
            case 15:
                SavedMessagesController.openSavedMessages();
                break;
            case 16:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 17:
                org.telegram.ui.Components.voip.m2.i();
                break;
            case 18:
                nh.r5.p();
                break;
            case 19:
                org.telegram.ui.c60 c60Var = org.telegram.ui.c60.A3;
                if (c60Var != null) {
                    c60Var.show();
                    break;
                }
                break;
            case 20:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 21:
                Pattern pattern = LaunchActivity.y1;
                break;
            case 22:
                Pattern pattern2 = LaunchActivity.y1;
                break;
            case 23:
                Pattern pattern3 = LaunchActivity.y1;
                ApplicationLoader.mainInterfacePausedStageQueue = false;
                ApplicationLoader.mainInterfacePausedStageQueueTime = System.currentTimeMillis();
                break;
            case 24:
                break;
            case 25:
                CallReceiver.checkLastReceivedCall();
                break;
            case 26:
                CallReceiver.checkLastReceivedCall();
                break;
            case 27:
                qc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 28:
                qc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.Q8;
                break;
        }
    }

    public /* synthetic */ mc(Object obj, int i10) {
        this.a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
