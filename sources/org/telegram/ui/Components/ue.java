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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ ue(int i10) {
        this.a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                break;
            case 1:
                break;
            case 2:
                int i10 = tn.m1;
                break;
            case 3:
                PhotoViewer.t1().G0(false, false);
                break;
            case 4:
                PhotoViewer.t1().G0(false, false);
                break;
            case 5:
                int i11 = zt.b;
                break;
            case 6:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 7:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                    l2Var.a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), l2Var);
                    break;
                }
                break;
            case 9:
                int i12 = g01.f;
                break;
            case 10:
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                w01.f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                break;
            case 11:
                SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
                w01.f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                break;
            case 12:
                int i13 = w21.f0;
                break;
            case 13:
                SavedMessagesController.openSavedMessages();
                break;
            case 14:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 15:
                org.telegram.ui.Components.voip.k2.i();
                break;
            case 16:
                bi.f7.p();
                break;
            case 17:
                org.telegram.ui.j60 j60Var = org.telegram.ui.j60.D3;
                if (j60Var != null) {
                    j60Var.show();
                    break;
                }
                break;
            case 18:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 19:
                Pattern pattern = LaunchActivity.B1;
                break;
            case 20:
                Pattern pattern2 = LaunchActivity.B1;
                break;
            case 21:
                Pattern pattern3 = LaunchActivity.B1;
                ApplicationLoader.mainInterfacePausedStageQueue = false;
                ApplicationLoader.mainInterfacePausedStageQueueTime = System.currentTimeMillis();
                break;
            case 22:
                break;
            case 23:
                CallReceiver.checkLastReceivedCall();
                break;
            case 24:
                CallReceiver.checkLastReceivedCall();
                break;
            case 25:
                yc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 26:
                yc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 27:
                Drawable[] drawableArr = PhotoViewer.T8;
                break;
            case 28:
                yc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            default:
                yc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
        }
    }

    public /* synthetic */ ue(Object obj, int i10) {
        this.a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
