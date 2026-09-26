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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class th implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ th(int i10) {
        this.a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                int i10 = vn.m1;
                break;
            case 2:
                PhotoViewer.t1().G0(false, false);
                break;
            case 3:
                PhotoViewer.t1().G0(false, false);
                break;
            case 4:
                int i11 = cu.b;
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
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                break;
            case 8:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 9:
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2();
                    k2Var.a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), k2Var);
                    break;
                }
                break;
            case 10:
                int i12 = u01.f;
                break;
            case 11:
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                k11.f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                break;
            case 12:
                SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
                k11.f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                break;
            case 13:
                int i13 = k31.f0;
                break;
            case 14:
                SavedMessagesController.openSavedMessages();
                break;
            case 15:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 16:
                org.telegram.ui.Components.voip.n2.i();
                break;
            case 17:
                ai.x7.p();
                break;
            case 18:
                org.telegram.ui.d60 d60Var = org.telegram.ui.d60.D3;
                if (d60Var != null) {
                    d60Var.show();
                    break;
                }
                break;
            case 19:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 20:
                Pattern pattern = LaunchActivity.B1;
                break;
            case 21:
                Pattern pattern2 = LaunchActivity.B1;
                break;
            case 22:
                Pattern pattern3 = LaunchActivity.B1;
                ApplicationLoader.mainInterfacePausedStageQueue = false;
                ApplicationLoader.mainInterfacePausedStageQueueTime = System.currentTimeMillis();
                break;
            case 23:
                break;
            case 24:
                CallReceiver.checkLastReceivedCall();
                break;
            case 25:
                CallReceiver.checkLastReceivedCall();
                break;
            case 26:
                xc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 27:
                xc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 28:
                Drawable[] drawableArr = PhotoViewer.U8;
                break;
            default:
                xc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
        }
    }

    public /* synthetic */ th(Object obj, int i10) {
        this.a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
