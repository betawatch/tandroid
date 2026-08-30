package cg;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.LongSparseArray;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import eg.u2;
import gg.v2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Pattern;
import lh.ja;
import lh.t7;
import nh.r5;
import nh.t6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ n0(int i10) {
        this.a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t0.b();
                break;
            case 1:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 2:
                Looper myLooper2 = Looper.myLooper();
                if (myLooper2 != null) {
                    myLooper2.quit();
                    break;
                }
                break;
            case 3:
                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, new Object[0]);
                break;
            case 4:
                int i10 = AlarmManagerSchedulerBroadcastReceiver.a;
                break;
            case 5:
                float[] fArr = u2.R;
                break;
            case 6:
                v2.e0(0, null);
                break;
            case 7:
                p2 R = LaunchActivity.R();
                if (R != null) {
                    n2 n2Var = new n2();
                    n2Var.a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "gifts"), n2Var);
                    break;
                }
                break;
            case 8:
                b4.e0 e0Var = lf.g.B;
                if (e0Var != null) {
                    ArrayList arrayList = null;
                    for (int i11 = 0; i11 < lf.g.y; i11++) {
                        if (((Bitmap[]) e0Var.d)[i11] != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(((Bitmap[]) e0Var.d)[i11]);
                        }
                        ((Bitmap[]) e0Var.d)[i11] = null;
                        ((lf.c0[]) e0Var.c)[i11] = null;
                    }
                    if (!arrayList.isEmpty()) {
                        Utilities.globalQueue.postRunnable(new o0(arrayList, 1));
                    }
                    lf.g.B = null;
                    break;
                }
                break;
            case 9:
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                break;
            case 10:
                p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new ja());
                    break;
                }
                break;
            case 11:
                t7[][] t7VarArr = t7.S;
                break;
            case 12:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 13:
                break;
            case 14:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 15:
                nh.j1.j();
                break;
            case 16:
                nh.j1 j1Var = nh.j1.W;
                j1Var.e.invalidate();
                if (!j1Var.e.isInLayout()) {
                    j1Var.e.requestLayout();
                    j1Var.d.requestLayout();
                    j1Var.f.requestLayout();
                    break;
                }
                break;
            case 17:
                int i12 = r5.h;
                break;
            case 18:
                Comparator comparator = t6.X;
                break;
            case 19:
                j6.E(false);
                break;
            case 20:
                int i13 = xn.Ec;
                break;
            case 21:
                break;
            case 22:
                mg.m0.b(true);
                break;
            case 23:
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i14 = NotificationCenter.didSetNewTheme;
                Boolean bool = Boolean.TRUE;
                globalInstance.lambda$postNotificationNameOnUIThread$1(i14, Boolean.FALSE, bool, bool);
                break;
            case 24:
                Pattern pattern = z4.a;
                break;
            case 25:
                p2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    n2 n2Var2 = new n2();
                    n2Var2.a = true;
                    U2.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), n2Var2);
                    break;
                }
                break;
            case 26:
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
                } catch (Exception e) {
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        FileLog.e(e);
                        return;
                    }
                    return;
                }
                break;
            case 27:
                c8 c8Var = c8.Q0;
                break;
            case 28:
                SavedMessagesController.openSavedMessages();
                break;
            default:
                LaunchActivity launchActivity = LaunchActivity.D1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.D1.startActivity(intent);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ n0(Object obj, int i10) {
        this.a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
