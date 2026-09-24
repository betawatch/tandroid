package ai;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Looper;
import android.util.LongSparseArray;
import java.util.Comparator;
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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0137  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 2:
                m2.j();
                break;
            case 3:
                m2 m2Var = m2.Z;
                m2Var.e.invalidate();
                if (!m2Var.e.isInLayout()) {
                    m2Var.e.requestLayout();
                    m2Var.d.requestLayout();
                    m2Var.f.requestLayout();
                    break;
                }
                break;
            case 4:
                int i10 = x7.h;
                break;
            case 5:
                Comparator comparator = l9.X;
                break;
            case 6:
                int i11 = ci.e0.x0;
                break;
            case 7:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 8:
                break;
            case 9:
                MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) + 1).apply();
                break;
            case 10:
                HashSet hashSet = ei.k3.W0;
                break;
            case 11:
                break;
            case 12:
                int i12 = gi.h.F;
                break;
            case 13:
                hg.c2[] c2VarArr = hg.c2.g;
                break;
            case 14:
                SharedConfig.drawActionBarShadow = !SharedConfig.drawActionBarShadow;
                SharedConfig.saveDebugConfig();
                AndroidUtilities.forEachViews(LaunchActivity.G1.z0.getRootView(), new i(5));
                break;
            case 15:
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.h6.N0(string) == null || org.telegram.ui.ActionBar.h6.N0(string).q()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.h6.N0(string2) == null || !org.telegram.ui.ActionBar.h6.N0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.g6 g6Var = org.telegram.ui.ActionBar.h6.I;
                if (string.equals(string2)) {
                    if (g6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        AndroidUtilities.runOnUIThread(new i2.h0(org.telegram.ui.ActionBar.h6.I.q() ? org.telegram.ui.ActionBar.h6.N0(str2) : org.telegram.ui.ActionBar.h6.N0(str), 12), 200L);
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                AndroidUtilities.runOnUIThread(new i2.h0(org.telegram.ui.ActionBar.h6.I.q() ? org.telegram.ui.ActionBar.h6.N0(str2) : org.telegram.ui.ActionBar.h6.N0(str), 12), 200L);
                break;
            case 16:
                org.telegram.ui.ActionBar.h6.E(false);
                break;
            case 17:
                int i13 = wn.Gc;
                break;
            case 18:
                break;
            case 19:
                zg.k0.b(true);
                break;
            case 20:
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i14 = NotificationCenter.didSetNewTheme;
                Boolean bool = Boolean.TRUE;
                globalInstance.lambda$postNotificationNameOnUIThread$1(i14, Boolean.FALSE, bool, bool);
                break;
            case 21:
                Pattern pattern = org.telegram.ui.Components.e5.a;
                break;
            case 22:
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2();
                    k2Var.a = true;
                    U.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), k2Var);
                    break;
                }
                break;
            case 23:
                AndroidUtilities.cancelRunOnUIThread(org.telegram.ui.Components.q5.v);
                try {
                    if (org.telegram.ui.Components.q5.q != null) {
                        for (int i15 = 0; i15 < org.telegram.ui.Components.q5.q.size(); i15++) {
                            LongSparseArray longSparseArray = (LongSparseArray) org.telegram.ui.Components.q5.q.valueAt(i15);
                            int i16 = 0;
                            while (i16 < longSparseArray.size()) {
                                if (!((org.telegram.ui.Components.q5) longSparseArray.valueAt(i16)).a) {
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
            case 24:
                org.telegram.ui.Components.j8 j8Var = org.telegram.ui.Components.j8.T0;
                break;
            case 25:
                SavedMessagesController.openSavedMessages();
                break;
            case 26:
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.G1.startActivity(intent);
                    break;
                }
                break;
            case 27:
                SavedMessagesController.openSavedMessagesReminders();
                break;
            case 28:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                break;
            default:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                break;
        }
    }

    public /* synthetic */ f(Object obj, int i10) {
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
