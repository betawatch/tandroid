package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import java.util.regex.Pattern;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class sh implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ sh(int i10) {
        this.a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc a02;
        switch (this.a) {
            case 0:
                break;
            case 1:
                int i10 = un.m1;
                break;
            case 2:
                PhotoViewer.t1().G0(false, false);
                break;
            case 3:
                PhotoViewer.t1().G0(false, false);
                break;
            case 4:
                int i11 = bu.b;
                break;
            case 5:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 6:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                    l2Var.a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), l2Var);
                    break;
                }
                break;
            case 8:
                int i12 = w01.f;
                break;
            case 9:
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                m11.f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                break;
            case 10:
                SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
                m11.f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                break;
            case 11:
                int i13 = m31.f0;
                break;
            case 12:
                SavedMessagesController.openSavedMessages();
                break;
            case 13:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 14:
                org.telegram.ui.Components.voip.m2.i();
                break;
            case 15:
                ai.w7.p();
                break;
            case 16:
                org.telegram.ui.i60 i60Var = org.telegram.ui.i60.D3;
                if (i60Var != null) {
                    i60Var.show();
                    break;
                }
                break;
            case 17:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 18:
                Pattern pattern = LaunchActivity.B1;
                break;
            case 19:
                Pattern pattern2 = LaunchActivity.B1;
                break;
            case 20:
                Pattern pattern3 = LaunchActivity.B1;
                ApplicationLoader.mainInterfacePausedStageQueue = false;
                ApplicationLoader.mainInterfacePausedStageQueueTime = System.currentTimeMillis();
                break;
            case 21:
                break;
            case 22:
                CallReceiver.checkLastReceivedCall();
                break;
            case 23:
                CallReceiver.checkLastReceivedCall();
                break;
            case 24:
                xc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 25:
                xc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 26:
                Drawable[] drawableArr = PhotoViewer.U8;
                break;
            case 27:
                xc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 28:
                xc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            default:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null && (a02 = xc.a0(U)) != null) {
                    qc M = a02.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                    M.j = 5000;
                    M.j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ sh(Object obj, int i10) {
        this.a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
