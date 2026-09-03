package ag;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.LongSparseArray;
import b4.e0;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import dg.n0;
import dg.s0;
import fg.t2;
import hg.v2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Pattern;
import lf.c0;
import mh.ja;
import mh.t7;
import ng.m0;
import oh.j1;
import oh.r5;
import oh.t6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e3  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10 = 0;
        switch (this.a) {
            case 0:
                SharedConfig.drawActionBarShadow = !SharedConfig.drawActionBarShadow;
                SharedConfig.saveDebugConfig();
                AndroidUtilities.forEachViews(LaunchActivity.D1.w0.getRootView(), new d(i10));
                break;
            case 1:
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (k6.N0(string) == null || k6.N0(string).q()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (k6.N0(string2) == null || !k6.N0(string2).q()) {
                    string2 = "Dark Blue";
                }
                j6 j6Var = k6.I;
                if (string.equals(string2)) {
                    if (j6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        AndroidUtilities.runOnUIThread(new e(k6.I.q() ? k6.N0(str2) : k6.N0(str), i10), 200L);
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                AndroidUtilities.runOnUIThread(new e(k6.I.q() ? k6.N0(str2) : k6.N0(str), i10), 200L);
                break;
            case 2:
                s0.b();
                break;
            case 3:
                int i11 = AlarmManagerSchedulerBroadcastReceiver.a;
                break;
            case 4:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 5:
                Looper myLooper2 = Looper.myLooper();
                if (myLooper2 != null) {
                    myLooper2.quit();
                    break;
                }
                break;
            case 6:
                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, new Object[0]);
                break;
            case 7:
                float[] fArr = t2.R;
                break;
            case 8:
                v2.e0(0, null);
                break;
            case 9:
                e0 e0Var = lf.g.B;
                if (e0Var != null) {
                    ArrayList arrayList = null;
                    while (i10 < lf.g.y) {
                        if (((Bitmap[]) e0Var.d)[i10] != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(((Bitmap[]) e0Var.d)[i10]);
                        }
                        ((Bitmap[]) e0Var.d)[i10] = null;
                        ((c0[]) e0Var.c)[i10] = null;
                        i10++;
                    }
                    if (!arrayList.isEmpty()) {
                        Utilities.globalQueue.postRunnable(new n0(arrayList, 1));
                    }
                    lf.g.B = null;
                    break;
                }
                break;
            case 10:
                p2 R = LaunchActivity.R();
                if (R != null) {
                    n2 n2Var = new n2();
                    n2Var.a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "gifts"), n2Var);
                    break;
                }
                break;
            case 11:
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                break;
            case 12:
                p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new ja());
                    break;
                }
                break;
            case 13:
                t7[][] t7VarArr = t7.S;
                break;
            case 14:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 15:
                break;
            case 16:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 17:
                j1.j();
                break;
            case 18:
                j1 j1Var = j1.W;
                j1Var.e.invalidate();
                if (!j1Var.e.isInLayout()) {
                    j1Var.e.requestLayout();
                    j1Var.d.requestLayout();
                    j1Var.f.requestLayout();
                    break;
                }
                break;
            case 19:
                int i12 = r5.h;
                break;
            case 20:
                Comparator comparator = t6.X;
                break;
            case 21:
                k6.E(false);
                break;
            case 22:
                int i13 = xn.Ec;
                break;
            case 23:
                break;
            case 24:
                m0.b(true);
                break;
            case 25:
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i14 = NotificationCenter.didSetNewTheme;
                Boolean bool = Boolean.TRUE;
                globalInstance.lambda$postNotificationNameOnUIThread$1(i14, Boolean.FALSE, bool, bool);
                break;
            case 26:
                Pattern pattern = z4.a;
                break;
            case 27:
                p2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    n2 n2Var2 = new n2();
                    n2Var2.a = true;
                    U2.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), n2Var2);
                    break;
                }
                break;
            case 28:
                AndroidUtilities.cancelRunOnUIThread(l5.v);
                try {
                    if (l5.q != null) {
                        for (int i15 = 0; i15 < l5.q.size(); i15++) {
                            LongSparseArray longSparseArray = (LongSparseArray) l5.q.valueAt(i15);
                            int i16 = 0;
                            while (i16 < longSparseArray.size()) {
                                if (!((l5) longSparseArray.valueAt(i16)).a) {
                                    longSparseArray.removeAt(i16);
                                    i16--;
                                }
                                i16++;
                            }
                        }
                        break;
                    }
                } catch (Exception e6) {
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        FileLog.e(e6);
                        return;
                    }
                    return;
                }
                break;
            default:
                c8 c8Var = c8.Q0;
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
}
