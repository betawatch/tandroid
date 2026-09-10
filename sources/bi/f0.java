package bi;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Looper;
import android.util.LongSparseArray;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.zn;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.eo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ f0(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10 = 2;
        switch (this.a) {
            case 0:
                int i11 = j0.x0;
                break;
            case 1:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) + 1).apply();
                break;
            case 4:
                HashSet hashSet = di.n3.W0;
                break;
            case 5:
                break;
            case 6:
                int i12 = fi.h.F;
                break;
            case 7:
                gg.k2[] k2VarArr = gg.k2.g;
                break;
            case 8:
                SharedConfig.drawActionBarShadow = !SharedConfig.drawActionBarShadow;
                SharedConfig.saveDebugConfig();
                AndroidUtilities.forEachViews(LaunchActivity.G1.z0.getRootView(), new gg.g0(i10));
                break;
            case 9:
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string) == null || org.telegram.ui.ActionBar.j6.N0(string).q()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string2) == null || !org.telegram.ui.ActionBar.j6.N0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.I;
                if (string.equals(string2)) {
                    if (i6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        AndroidUtilities.runOnUIThread(new gg.v1(org.telegram.ui.ActionBar.j6.I.q() ? org.telegram.ui.ActionBar.j6.N0(str2) : org.telegram.ui.ActionBar.j6.N0(str), 19), 200L);
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                AndroidUtilities.runOnUIThread(new gg.v1(org.telegram.ui.ActionBar.j6.I.q() ? org.telegram.ui.ActionBar.j6.N0(str2) : org.telegram.ui.ActionBar.j6.N0(str), 19), 200L);
                break;
            case 10:
                og.m0.b();
                break;
            case 11:
                org.telegram.ui.ActionBar.j6.E(false);
                break;
            case 12:
                int i13 = eo.Hc;
                break;
            case 13:
                break;
            case 14:
                yg.l0.b(true);
                break;
            case 15:
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i14 = NotificationCenter.didSetNewTheme;
                Boolean bool = Boolean.TRUE;
                globalInstance.lambda$postNotificationNameOnUIThread$1(i14, Boolean.FALSE, bool, bool);
                break;
            case 16:
                Pattern pattern = org.telegram.ui.Components.d5.a;
                break;
            case 17:
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                    n2Var.a = true;
                    U.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), n2Var);
                    break;
                }
                break;
            case 18:
                AndroidUtilities.cancelRunOnUIThread(org.telegram.ui.Components.p5.v);
                try {
                    if (org.telegram.ui.Components.p5.q != null) {
                        for (int i15 = 0; i15 < org.telegram.ui.Components.p5.q.size(); i15++) {
                            LongSparseArray longSparseArray = (LongSparseArray) org.telegram.ui.Components.p5.q.valueAt(i15);
                            int i16 = 0;
                            while (i16 < longSparseArray.size()) {
                                if (!((org.telegram.ui.Components.p5) longSparseArray.valueAt(i16)).a) {
                                    longSparseArray.removeAt(i16);
                                    i16--;
                                }
                                i16++;
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
            case 19:
                org.telegram.ui.Components.j8 j8Var = org.telegram.ui.Components.j8.T0;
                break;
            case 20:
                SavedMessagesController.openSavedMessages();
                break;
            case 21:
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.G1.startActivity(intent);
                    break;
                }
                break;
            case 22:
                SavedMessagesController.openSavedMessagesReminders();
                break;
            case 23:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                break;
            case 24:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                break;
            case 25:
                break;
            case 26:
                int i17 = zn.m1;
                break;
            case 27:
                PhotoViewer.t1().G0(false, false);
                break;
            case 28:
                PhotoViewer.t1().G0(false, false);
                break;
            default:
                int i18 = fu.b;
                break;
        }
    }

    public /* synthetic */ f0(Object obj, int i10) {
        this.a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void e() {
    }
}
