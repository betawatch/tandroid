package ag;

import android.graphics.Bitmap;
import android.os.Looper;
import cg.w2;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Pattern;
import jh.ia;
import jh.s7;
import lh.q5;
import lh.s6;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.c5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ o0(int i10) {
        this.a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0.b();
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
                float[] fArr = w2.Q;
                break;
            case 5:
                int i10 = AlarmManagerSchedulerBroadcastReceiver.a;
                break;
            case 6:
                eg.w2.e0(0, null);
                break;
            case 7:
                o2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                    m2Var.a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "gifts"), m2Var);
                    break;
                }
                break;
            case 8:
                j2 j2Var = jf.g.B;
                if (j2Var != null) {
                    ArrayList arrayList = null;
                    for (int i11 = 0; i11 < jf.g.y; i11++) {
                        if (((Bitmap[]) j2Var.d)[i11] != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(((Bitmap[]) j2Var.d)[i11]);
                        }
                        ((Bitmap[]) j2Var.d)[i11] = null;
                        ((jf.c0[]) j2Var.c)[i11] = null;
                    }
                    if (!arrayList.isEmpty()) {
                        Utilities.globalQueue.postRunnable(new p0(arrayList, 1));
                    }
                    jf.g.B = null;
                    break;
                }
                break;
            case 9:
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                break;
            case 10:
                o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new ia());
                    break;
                }
                break;
            case 11:
                s7[][] s7VarArr = s7.S;
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
                lh.i1.j();
                break;
            case 16:
                lh.i1 i1Var = lh.i1.V;
                i1Var.e.invalidate();
                if (!i1Var.e.isInLayout()) {
                    i1Var.e.requestLayout();
                    i1Var.d.requestLayout();
                    i1Var.f.requestLayout();
                    break;
                }
                break;
            case 17:
                int i12 = q5.h;
                break;
            case 18:
                Comparator comparator = s6.X;
                break;
            case 19:
                int i13 = nh.e0.t0;
                break;
            case 20:
                Looper myLooper3 = Looper.myLooper();
                if (myLooper3 != null) {
                    myLooper3.quit();
                    break;
                }
                break;
            case 21:
                break;
            case 22:
                MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) + 1).apply();
                break;
            case 23:
                g6.E(false);
                break;
            case 24:
                int i14 = tn.Dc;
                break;
            case 25:
                break;
            case 26:
                kg.m0.b(true);
                break;
            case 27:
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i15 = NotificationCenter.didSetNewTheme;
                Boolean bool = Boolean.TRUE;
                globalInstance.lambda$postNotificationNameOnUIThread$1(i15, Boolean.FALSE, bool, bool);
                break;
            case 28:
                Pattern pattern = c5.a;
                break;
            default:
                o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    org.telegram.ui.ActionBar.m2 m2Var2 = new org.telegram.ui.ActionBar.m2();
                    m2Var2.a = true;
                    U2.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), m2Var2);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ o0(Object obj, int i10) {
        this.a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
