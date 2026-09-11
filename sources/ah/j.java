package ah;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Looper;
import android.util.LongSparseArray;
import bi.a2;
import bi.f7;
import bi.u8;
import fi.k3;
import ig.b2;
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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.q5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.co;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
                a2.j();
                break;
            case 4:
                a2 a2Var = a2.Z;
                a2Var.e.invalidate();
                if (!a2Var.e.isInLayout()) {
                    a2Var.e.requestLayout();
                    a2Var.d.requestLayout();
                    a2Var.f.requestLayout();
                    break;
                }
                break;
            case 5:
                int i10 = f7.h;
                break;
            case 6:
                Comparator comparator = u8.X;
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
                b2[] b2VarArr = b2.g;
                break;
            case 15:
                SharedConfig.drawActionBarShadow = !SharedConfig.drawActionBarShadow;
                SharedConfig.saveDebugConfig();
                AndroidUtilities.forEachViews(LaunchActivity.G1.z0.getRootView(), new bi.f(19));
                break;
            case 16:
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (j6.N0(string) == null || j6.N0(string).q()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (j6.N0(string2) == null || !j6.N0(string2).q()) {
                    string2 = "Dark Blue";
                }
                i6 i6Var = j6.I;
                if (string.equals(string2)) {
                    if (i6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        AndroidUtilities.runOnUIThread(new ig.t0(j6.I.q() ? j6.N0(str2) : j6.N0(str), 17), 200L);
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                AndroidUtilities.runOnUIThread(new ig.t0(j6.I.q() ? j6.N0(str2) : j6.N0(str), 17), 200L);
                break;
            case 17:
                j6.E(false);
                break;
            case 18:
                int i13 = co.Hc;
                break;
            case 19:
                break;
            case 20:
                e1.b(true);
                break;
            case 21:
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i14 = NotificationCenter.didSetNewTheme;
                Boolean bool = Boolean.TRUE;
                globalInstance.lambda$postNotificationNameOnUIThread$1(i14, Boolean.FALSE, bool, bool);
                break;
            case 22:
                Pattern pattern = e5.a;
                break;
            case 23:
                n2 U = LaunchActivity.U();
                if (U != null) {
                    l2 l2Var = new l2();
                    l2Var.a = true;
                    U.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), l2Var);
                    break;
                }
                break;
            case 24:
                AndroidUtilities.cancelRunOnUIThread(q5.v);
                try {
                    if (q5.q != null) {
                        for (int i15 = 0; i15 < q5.q.size(); i15++) {
                            LongSparseArray longSparseArray = (LongSparseArray) q5.q.valueAt(i15);
                            int i16 = 0;
                            while (i16 < longSparseArray.size()) {
                                if (!((q5) longSparseArray.valueAt(i16)).a) {
                                    longSparseArray.removeAt(i16);
                                    i16--;
                                }
                                i16++;
                            }
                        }
                        break;
                    }
                } catch (Exception e7) {
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        FileLog.e(e7);
                        return;
                    }
                    return;
                }
                break;
            case 25:
                k8 k8Var = k8.T0;
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

    private final void e() {
    }
}
