package ah;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Looper;
import android.util.LongSparseArray;
import bi.b2;
import bi.j7;
import bi.x8;
import fi.k3;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.s5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0127  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.a) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 1:
                break;
            case 2:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 3:
                b2.j();
                break;
            case 4:
                b2 b2Var = b2.Z;
                b2Var.e.invalidate();
                if (!b2Var.e.isInLayout()) {
                    b2Var.e.requestLayout();
                    b2Var.d.requestLayout();
                    b2Var.f.requestLayout();
                    break;
                }
                break;
            case 5:
                int i10 = j7.h;
                break;
            case 6:
                Comparator comparator = x8.X;
                break;
            case 7:
                int i11 = di.e0.x0;
                break;
            case 8:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 9:
                break;
            case 10:
                MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) + 1).apply();
                break;
            case 11:
                HashSet hashSet = k3.W0;
                break;
            case 12:
                break;
            case 13:
                int i12 = hi.h.F;
                break;
            case 14:
                ig.b2[] b2VarArr = ig.b2.g;
                break;
            case 15:
                SharedConfig.drawActionBarShadow = !SharedConfig.drawActionBarShadow;
                SharedConfig.saveDebugConfig();
                AndroidUtilities.forEachViews(LaunchActivity.G1.z0.getRootView(), new bi.f(5));
                break;
            case 16:
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (g6.O0(string) == null || g6.O0(string).q()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (g6.O0(string2) == null || !g6.O0(string2).q()) {
                    string2 = "Dark Blue";
                }
                f6 f6Var = g6.I;
                if (string.equals(string2)) {
                    if (f6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        AndroidUtilities.runOnUIThread(new ig.t0(g6.I.q() ? g6.O0(str2) : g6.O0(str), 19), 200L);
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                AndroidUtilities.runOnUIThread(new ig.t0(g6.I.q() ? g6.O0(str2) : g6.O0(str), 19), 200L);
                break;
            case 17:
                g6.E(false);
                break;
            case 18:
                int i13 = fo.Hc;
                break;
            case 19:
                break;
            case 20:
                d1.b(true);
                break;
            case 21:
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i14 = NotificationCenter.didSetNewTheme;
                Boolean bool = Boolean.TRUE;
                globalInstance.lambda$postNotificationNameOnUIThread$1(i14, Boolean.FALSE, bool, bool);
                break;
            case 22:
                Pattern pattern = g5.a;
                break;
            case 23:
                m2 U = LaunchActivity.U();
                if (U != null) {
                    k2 k2Var = new k2();
                    k2Var.a = true;
                    U.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), k2Var);
                    break;
                }
                break;
            case 24:
                AndroidUtilities.cancelRunOnUIThread(s5.v);
                try {
                    if (s5.q != null) {
                        for (int i15 = 0; i15 < s5.q.size(); i15++) {
                            LongSparseArray longSparseArray = (LongSparseArray) s5.q.valueAt(i15);
                            int i16 = 0;
                            while (i16 < longSparseArray.size()) {
                                if (!((s5) longSparseArray.valueAt(i16)).a) {
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
            case 25:
                m8 m8Var = m8.T0;
                break;
            case 26:
                SavedMessagesController.openSavedMessages();
                break;
            case 27:
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.G1.startActivity(intent);
                    break;
                }
                break;
            case 28:
                SavedMessagesController.openSavedMessagesReminders();
                break;
            default:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                break;
        }
    }

    public /* synthetic */ j(Object obj, int i10) {
        this.a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
