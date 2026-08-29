package org.telegram.ui.Components;

import android.content.Intent;
import android.content.SharedPreferences;
import android.util.LongSparseArray;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g5 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ g5(int i10) {
        this.a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.cancelRunOnUIThread(p5.v);
                try {
                    if (p5.q != null) {
                        for (int i10 = 0; i10 < p5.q.size(); i10++) {
                            LongSparseArray longSparseArray = (LongSparseArray) p5.q.valueAt(i10);
                            int i11 = 0;
                            while (i11 < longSparseArray.size()) {
                                if (!((p5) longSparseArray.valueAt(i11)).a) {
                                    longSparseArray.removeAt(i11);
                                    i11--;
                                }
                                i11++;
                            }
                        }
                        break;
                    }
                } catch (Exception e10) {
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        FileLog.e(e10);
                        return;
                    }
                    return;
                }
                break;
            case 1:
                g8 g8Var = g8.P0;
                break;
            case 2:
                SavedMessagesController.openSavedMessages();
                break;
            case 3:
                LaunchActivity launchActivity = LaunchActivity.C1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.C1.startActivity(intent);
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
                int i12 = on.i1;
                break;
            case 9:
                PhotoViewer.t1().G0(false, false);
                break;
            case 10:
                PhotoViewer.t1().G0(false, false);
                break;
            case 11:
                int i13 = st.b;
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
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                    m2Var.a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), m2Var);
                    break;
                }
                break;
            case 15:
                int i14 = a01.f;
                break;
            case 16:
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                p01.f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                break;
            case 17:
                SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
                p01.f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                break;
            case 18:
                int i15 = m21.b0;
                break;
            case 19:
                SavedMessagesController.openSavedMessages();
                break;
            case 20:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 21:
                org.telegram.ui.Components.voip.o2.i();
                break;
            case 22:
                lh.q5.p();
                break;
            case 23:
                org.telegram.ui.r50 r50Var = org.telegram.ui.r50.z3;
                if (r50Var != null) {
                    r50Var.show();
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
                Pattern pattern = LaunchActivity.x1;
                break;
            case 26:
                Pattern pattern2 = LaunchActivity.x1;
                break;
            case 27:
                Pattern pattern3 = LaunchActivity.x1;
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

    public /* synthetic */ g5(Object obj, int i10) {
        this.a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
