package ah;

import ai.fa;
import ai.ld;
import android.content.SharedPreferences;
import android.os.Looper;
import android.util.LongSparseArray;
import ci.g6;
import ci.i7;
import ci.p1;
import gi.d3;
import ig.y1;
import java.util.Comparator;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.r5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.l5;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
        switch (this.a) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 1:
                n2 U = LaunchActivity.U();
                if (U instanceof l5) {
                    ((l5) U).H0();
                    break;
                } else if (U != null) {
                    l5 l5Var = new l5();
                    l5Var.H0();
                    U.presentFragment(l5Var);
                    break;
                }
                break;
            case 2:
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                break;
            case 3:
                n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(new ld());
                    break;
                }
                break;
            case 4:
                fa[][] faVarArr = fa.S;
                break;
            case 5:
                break;
            case 6:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 7:
                p1.j();
                break;
            case 8:
                p1 p1Var = p1.Z;
                p1Var.e.invalidate();
                if (!p1Var.e.isInLayout()) {
                    p1Var.e.requestLayout();
                    p1Var.d.requestLayout();
                    p1Var.f.requestLayout();
                    break;
                }
                break;
            case 9:
                int i10 = g6.h;
                break;
            case 10:
                Comparator comparator = i7.X;
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
                HashSet hashSet = d3.W0;
                break;
            case 16:
                break;
            case 17:
                y1[] y1VarArr = y1.g;
                break;
            case 18:
                int i12 = ii.g.F;
                break;
            case 19:
                SharedConfig.drawActionBarShadow = !SharedConfig.drawActionBarShadow;
                SharedConfig.saveDebugConfig();
                AndroidUtilities.forEachViews(LaunchActivity.H1.z0.getRootView(), new ci.e(5));
                break;
            case 20:
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (h6.O0(string) == null || h6.O0(string).q()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (h6.O0(string2) == null || !h6.O0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.g6 g6Var = h6.I;
                if (string.equals(string2)) {
                    if (g6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        AndroidUtilities.runOnUIThread(new ki.u(h6.I.q() ? h6.O0(str2) : h6.O0(str), 9), 200L);
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                AndroidUtilities.runOnUIThread(new ki.u(h6.I.q() ? h6.O0(str2) : h6.O0(str), 9), 200L);
                break;
            case 21:
                h6.E(false);
                break;
            case 22:
                int i13 = sn.Hc;
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
                n2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    l2 l2Var = new l2();
                    l2Var.a = true;
                    U3.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), l2Var);
                    break;
                }
                break;
            case 28:
                AndroidUtilities.cancelRunOnUIThread(r5.v);
                try {
                    if (r5.q != null) {
                        for (int i15 = 0; i15 < r5.q.size(); i15++) {
                            LongSparseArray longSparseArray = (LongSparseArray) r5.q.valueAt(i15);
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
                k8 k8Var = k8.T0;
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
