package ag;

import a8.ng;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Looper;
import bi.ca;
import bi.dd;
import di.f6;
import di.h7;
import di.o1;
import hi.m3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.regex.Pattern;
import jg.c2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.x6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ug1;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        r2 X;
        switch (this.a) {
            case 0:
                ng ngVar = k.B;
                if (ngVar != null) {
                    ArrayList arrayList = null;
                    for (int i10 = 0; i10 < k.y; i10++) {
                        if (((Bitmap[]) ngVar.d)[i10] != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(((Bitmap[]) ngVar.d)[i10]);
                        }
                        ((Bitmap[]) ngVar.d)[i10] = null;
                        ((i0[]) ngVar.c)[i10] = null;
                    }
                    if (!arrayList.isEmpty()) {
                        Utilities.globalQueue.postRunnable(new f(arrayList, 0));
                    }
                    k.B = null;
                    break;
                }
                break;
            case 1:
                wc.Y().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 2:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 3:
                r2 U = LaunchActivity.U();
                if ((U instanceof ug1) && (X = ((ug1) U).X()) != null) {
                    U = X;
                }
                qc R = (U != null ? wc.b0(U) : wc.Y()).R(R.raw.ic_delete, 36, LocaleController.getString(R.string.Gift2Deleted));
                R.u = true;
                R.j();
                break;
            case 4:
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                break;
            case 5:
                r2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(new dd());
                    break;
                }
                break;
            case 6:
                ca[][] caVarArr = ca.S;
                break;
            case 7:
                break;
            case 8:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 9:
                o1.j();
                break;
            case 10:
                o1 o1Var = o1.Z;
                o1Var.e.invalidate();
                if (!o1Var.e.isInLayout()) {
                    o1Var.e.requestLayout();
                    o1Var.d.requestLayout();
                    o1Var.f.requestLayout();
                    break;
                }
                break;
            case 11:
                int i11 = f6.h;
                break;
            case 12:
                Comparator comparator = h7.X;
                break;
            case 13:
                int i12 = fi.e0.x0;
                break;
            case 14:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 15:
                break;
            case 16:
                MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) + 1).apply();
                break;
            case 17:
                HashSet hashSet = m3.a1;
                break;
            case 18:
                break;
            case 19:
                c2[] c2VarArr = c2.g;
                break;
            case 20:
                int i13 = ji.h.H;
                break;
            case 21:
                SharedConfig.drawActionBarShadow = !SharedConfig.drawActionBarShadow;
                SharedConfig.saveDebugConfig();
                AndroidUtilities.forEachViews(LaunchActivity.I1.z0.getRootView(), new di.e(5));
                break;
            case 22:
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (y6.P0(string) == null || y6.P0(string).q()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (y6.P0(string2) == null || !y6.P0(string2).q()) {
                    string2 = "Dark Blue";
                }
                x6 x6Var = y6.I;
                if (string.equals(string2)) {
                    if (x6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        AndroidUtilities.runOnUIThread(new k2.c(y6.I.q() ? y6.P0(str2) : y6.P0(str), 14), 200L);
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                AndroidUtilities.runOnUIThread(new k2.c(y6.I.q() ? y6.P0(str2) : y6.P0(str), 14), 200L);
                break;
            case 23:
                y6.E(false);
                break;
            case 24:
                int i14 = un.bd;
                break;
            case 25:
                break;
            case 26:
                bh.s0.b(true);
                break;
            case 27:
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i15 = NotificationCenter.didSetNewTheme;
                Boolean bool = Boolean.TRUE;
                globalInstance.lambda$postNotificationNameOnUIThread$1(i15, Boolean.FALSE, bool, bool);
                break;
            case 28:
                Pattern pattern = g5.a;
                break;
            default:
                r2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    p2 p2Var = new p2();
                    p2Var.a = true;
                    U3.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), p2Var);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c(Object obj, int i10) {
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
