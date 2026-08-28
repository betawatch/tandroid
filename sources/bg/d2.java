package bg;

import android.graphics.Bitmap;
import android.os.Looper;
import android.util.LongSparseArray;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import gh.oa;
import gh.v7;
import ih.s5;
import ih.v6;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.y4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d2 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ d2(int i9) {
        this.a = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g3.d0(0, null);
                break;
            case 1:
                int i9 = AlarmManagerSchedulerBroadcastReceiver.a;
                break;
            case 2:
                a6.a aVar = ff.h.B;
                if (aVar != null) {
                    ArrayList arrayList = null;
                    for (int i10 = 0; i10 < ff.h.y; i10++) {
                        if (((Bitmap[]) aVar.d)[i10] != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(((Bitmap[]) aVar.d)[i10]);
                        }
                        ((Bitmap[]) aVar.d)[i10] = null;
                        ((ff.d0[]) aVar.b)[i10] = null;
                    }
                    if (!arrayList.isEmpty()) {
                        Utilities.globalQueue.postRunnable(new ff.e(arrayList, 0));
                    }
                    ff.h.B = null;
                    break;
                }
                break;
            case 3:
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                    m2Var.a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "gifts"), m2Var);
                    break;
                }
                break;
            case 4:
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                break;
            case 5:
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new oa());
                    break;
                }
                break;
            case 6:
                v7[][] v7VarArr = v7.S;
                break;
            case 7:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 8:
                break;
            case 9:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 10:
                ih.k1.j();
                break;
            case 11:
                ih.k1 k1Var = ih.k1.V;
                k1Var.e.invalidate();
                if (!k1Var.e.isInLayout()) {
                    k1Var.e.requestLayout();
                    k1Var.d.requestLayout();
                    k1Var.f.requestLayout();
                    break;
                }
                break;
            case 12:
                int i11 = s5.h;
                break;
            case 13:
                Comparator comparator = v6.X;
                break;
            case 14:
                int i12 = kh.f0.t0;
                break;
            case 15:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 16:
                break;
            case 17:
                MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) + 1).apply();
                break;
            case 18:
                HashSet hashSet = mh.c3.S0;
                break;
            case 19:
                break;
            case 20:
                int i13 = oh.g.B;
                break;
            case 21:
                f6.E(false);
                break;
            case 22:
                int i14 = qn.Dc;
                break;
            case 23:
                break;
            case 24:
                hg.n0.b(true);
                break;
            case 25:
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i15 = NotificationCenter.didSetNewTheme;
                Boolean bool = Boolean.TRUE;
                globalInstance.lambda$postNotificationNameOnUIThread$1(i15, Boolean.FALSE, bool, bool);
                break;
            case 26:
                Pattern pattern = y4.a;
                break;
            case 27:
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    org.telegram.ui.ActionBar.m2 m2Var2 = new org.telegram.ui.ActionBar.m2();
                    m2Var2.a = true;
                    U2.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), m2Var2);
                    break;
                }
                break;
            case 28:
                AndroidUtilities.cancelRunOnUIThread(k5.v);
                try {
                    if (k5.q != null) {
                        for (int i16 = 0; i16 < k5.q.size(); i16++) {
                            LongSparseArray longSparseArray = (LongSparseArray) k5.q.valueAt(i16);
                            int i17 = 0;
                            while (i17 < longSparseArray.size()) {
                                if (!((k5) longSparseArray.valueAt(i17)).a) {
                                    longSparseArray.removeAt(i17);
                                    i17--;
                                }
                                i17++;
                            }
                        }
                        break;
                    }
                } catch (Exception e10) {
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        FileLog.e(e10);
                        return;
                    }
                    return;
                }
                break;
            default:
                c8 c8Var = c8.P0;
                break;
        }
    }

    public /* synthetic */ d2(Object obj, int i9) {
        this.a = i9;
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
