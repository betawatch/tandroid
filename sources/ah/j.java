package ah;

import ai.ha;
import ai.nd;
import android.content.SharedPreferences;
import android.os.Looper;
import android.util.LongSparseArray;
import ci.f6;
import ci.h7;
import ci.o1;
import gi.d3;
import ig.z1;
import java.util.Comparator;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.sn;
import org.telegram.ui.ug1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f3  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        o2 X;
        switch (this.a) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 1:
                o2 U = LaunchActivity.U();
                if ((U instanceof ug1) && (X = ((ug1) U).X()) != null) {
                    U = X;
                }
                qc Q = (U != null ? xc.a0(U) : xc.X()).Q(R.raw.ic_delete, 36, LocaleController.getString(R.string.Gift2Deleted));
                Q.t = true;
                Q.j();
                break;
            case 2:
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                break;
            case 3:
                o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(new nd());
                    break;
                }
                break;
            case 4:
                ha[][] haVarArr = ha.S;
                break;
            case 5:
                break;
            case 6:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 7:
                o1.j();
                break;
            case 8:
                o1 o1Var = o1.Z;
                o1Var.e.invalidate();
                if (!o1Var.e.isInLayout()) {
                    o1Var.e.requestLayout();
                    o1Var.d.requestLayout();
                    o1Var.f.requestLayout();
                    break;
                }
                break;
            case 9:
                int i10 = f6.h;
                break;
            case 10:
                Comparator comparator = h7.X;
                break;
            case 11:
                int i11 = ei.e0.x0;
                break;
            case 12:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 13:
                break;
            case 14:
                MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) + 1).apply();
                break;
            case 15:
                HashSet hashSet = d3.a1;
                break;
            case 16:
                break;
            case 17:
                z1[] z1VarArr = z1.g;
                break;
            case 18:
                int i12 = ii.h.H;
                break;
            case 19:
                SharedConfig.drawActionBarShadow = !SharedConfig.drawActionBarShadow;
                SharedConfig.saveDebugConfig();
                AndroidUtilities.forEachViews(LaunchActivity.J1.z0.getRootView(), new ci.e(5));
                break;
            case 20:
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (k6.P0(string) == null || k6.P0(string).q()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (k6.P0(string2) == null || !k6.P0(string2).q()) {
                    string2 = "Dark Blue";
                }
                j6 j6Var = k6.I;
                if (string.equals(string2)) {
                    if (j6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        AndroidUtilities.runOnUIThread(new ki.u(k6.I.q() ? k6.P0(str2) : k6.P0(str), 9), 200L);
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                AndroidUtilities.runOnUIThread(new ki.u(k6.I.q() ? k6.P0(str2) : k6.P0(str), 9), 200L);
                break;
            case 21:
                k6.E(false);
                break;
            case 22:
                int i13 = sn.Vc;
                break;
            case 23:
                break;
            case 24:
                d1.b(true);
                break;
            case 25:
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i14 = NotificationCenter.didSetNewTheme;
                Boolean bool = Boolean.TRUE;
                globalInstance.lambda$postNotificationNameOnUIThread$1(i14, Boolean.FALSE, bool, bool);
                break;
            case 26:
                Pattern pattern = f5.a;
                break;
            case 27:
                o2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    m2 m2Var = new m2();
                    m2Var.a = true;
                    U3.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), m2Var);
                    break;
                }
                break;
            case 28:
                AndroidUtilities.cancelRunOnUIThread(r5.w);
                try {
                    if (r5.r != null) {
                        for (int i15 = 0; i15 < r5.r.size(); i15++) {
                            LongSparseArray longSparseArray = (LongSparseArray) r5.r.valueAt(i15);
                            int i16 = 0;
                            while (i16 < longSparseArray.size()) {
                                if (!((r5) longSparseArray.valueAt(i16)).a) {
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
            default:
                k8 k8Var = k8.Y0;
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
