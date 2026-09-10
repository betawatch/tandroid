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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.x91;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class c30 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ c30(int i10) {
        this.a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wc a02;
        int i10 = 1;
        switch (this.a) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 1:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                    n2Var.a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), n2Var);
                    break;
                }
                break;
            case 3:
                int i11 = u01.f;
                break;
            case 4:
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                k11.f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                break;
            case 5:
                SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
                k11.f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                break;
            case 6:
                int i12 = k31.f0;
                break;
            case 7:
                SavedMessagesController.openSavedMessages();
                break;
            case 8:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 9:
                org.telegram.ui.Components.voip.l2.i();
                break;
            case 10:
                zh.i4.p();
                break;
            case 11:
                org.telegram.ui.j60 j60Var = org.telegram.ui.j60.D3;
                if (j60Var != null) {
                    j60Var.show();
                    break;
                }
                break;
            case 12:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 13:
                Pattern pattern = LaunchActivity.B1;
                break;
            case 14:
                Pattern pattern2 = LaunchActivity.B1;
                break;
            case 15:
                Pattern pattern3 = LaunchActivity.B1;
                ApplicationLoader.mainInterfacePausedStageQueue = false;
                ApplicationLoader.mainInterfacePausedStageQueueTime = System.currentTimeMillis();
                break;
            case 16:
                break;
            case 17:
                CallReceiver.checkLastReceivedCall();
                break;
            case 18:
                CallReceiver.checkLastReceivedCall();
                break;
            case 19:
                wc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 20:
                wc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 21:
                Drawable[] drawableArr = PhotoViewer.T8;
                break;
            case 22:
                wc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 23:
                wc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 24:
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null && (a02 = wc.a0(U)) != null) {
                    pc M = a02.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                    M.j = 5000;
                    M.j();
                    break;
                }
                break;
            case 25:
                int i13 = x91.d0;
                break;
            case 26:
                org.telegram.ui.ActionBar.j6.N = false;
                org.telegram.ui.ActionBar.j6.E(false);
                break;
            case 27:
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    break;
                }
                break;
            case 28:
                int[][] iArr = WallpapersListActivity.k0;
                PhotoViewer.t1().G0(false, false);
                break;
            default:
                Utilities.globalQueue.postRunnable(new org.telegram.ui.web.d1(i10));
                break;
        }
    }

    public /* synthetic */ c30(Object obj, int i10) {
        this.a = i10;
    }

    private final void a() {
    }
}
