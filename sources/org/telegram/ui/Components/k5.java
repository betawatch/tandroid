package org.telegram.ui.Components;

import android.content.Intent;
import android.content.SharedPreferences;
import android.util.LongSparseArray;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k5 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ k5(int i10) {
        this.a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.cancelRunOnUIThread(t5.w);
                try {
                    if (t5.r != null) {
                        for (int i10 = 0; i10 < t5.r.size(); i10++) {
                            LongSparseArray longSparseArray = (LongSparseArray) t5.r.valueAt(i10);
                            int i11 = 0;
                            while (i11 < longSparseArray.size()) {
                                if (!((t5) longSparseArray.valueAt(i11)).a) {
                                    longSparseArray.removeAt(i11);
                                    i11--;
                                }
                                i11++;
                            }
                        }
                        break;
                    }
                } catch (Exception e) {
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        FileLog.e(e);
                        return;
                    }
                    return;
                }
                break;
            case 1:
                m8 m8Var = m8.Y0;
                break;
            case 2:
                SavedMessagesController.openSavedMessages();
                break;
            case 3:
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.I1.startActivity(intent);
                    break;
                }
                break;
            case 4:
                SavedMessagesController.openSavedMessagesReminders();
                break;
            case 5:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                break;
            case 6:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                break;
            case 7:
                break;
            case 8:
                int i12 = go.r1;
                break;
            case 9:
                PhotoViewer.v1().H0(false, false);
                break;
            case 10:
                PhotoViewer.v1().H0(false, false);
                break;
            case 11:
                int i13 = ju.b;
                break;
            case 12:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 13:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 14:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                break;
            case 15:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 16:
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.ActionBar.p2 p2Var = new org.telegram.ui.ActionBar.p2();
                    p2Var.a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), p2Var);
                    break;
                }
                break;
            case 17:
                int i14 = s11.f;
                break;
            case 18:
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                h21.f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                break;
            case 19:
                SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
                h21.f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                break;
            case 20:
                int i15 = f41.i0;
                break;
            case 21:
                SavedMessagesController.openSavedMessages();
                break;
            case 22:
                jb1.j();
                break;
            case 23:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 24:
                org.telegram.ui.Components.voip.n2.i();
                break;
            case 25:
                di.f6.p();
                break;
            case 26:
                org.telegram.ui.x50 x50Var = org.telegram.ui.x50.D3;
                if (x50Var != null) {
                    x50Var.show();
                    break;
                }
                break;
            case 27:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 28:
                Pattern pattern = LaunchActivity.D1;
                break;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                break;
        }
    }

    public /* synthetic */ k5(TLRPC.TL_error tL_error) {
        this.a = 29;
    }

    private final void a() {
    }
}
