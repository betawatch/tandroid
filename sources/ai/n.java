package ai;

import a8.xa;
import android.graphics.Bitmap;
import android.os.Looper;
import bi.i4;
import di.pb;
import di.y8;
import fi.n5;
import fi.p6;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.AppStartReceiver;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cz;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.ot;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.j9;
import org.telegram.ui.Wallet.n6;
import org.telegram.ui.qb1;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ n(int i7) {
        this.a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.g2 c02;
        int i7 = 0;
        switch (this.a) {
            case 0:
                t[] tVarArr = DictationAsr.a;
                ArrayList arrayList = new ArrayList(DictationAsr.g);
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((Runnable) obj).run();
                }
                break;
            case 1:
                DictationAsr.Y(true);
                break;
            case 2:
                DictationLid.b();
                break;
            case 3:
                xa xaVar = bg.i.B;
                if (xaVar != null) {
                    ArrayList arrayList2 = null;
                    for (int i10 = 0; i10 < bg.i.y; i10++) {
                        if (((Bitmap[]) xaVar.d)[i10] != null) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(((Bitmap[]) xaVar.d)[i10]);
                        }
                        ((Bitmap[]) xaVar.d)[i10] = null;
                        ((bg.e0[]) xaVar.c)[i10] = null;
                    }
                    if (!arrayList2.isEmpty()) {
                        Utilities.e.c(new bg.e(0, arrayList2));
                    }
                    bg.i.B = null;
                    break;
                }
                break;
            case 4:
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
                    e2Var.a = true;
                    Q.showAsSheet(new PremiumPreviewFragment(0, "gifts"), e2Var);
                    break;
                }
                break;
            case 5:
                gc t6 = i4.h().t(hd.N0(2131749560, null), null);
                t6.t = true;
                t6.j();
                break;
            case 6:
                ls.e().k(99, 512);
                break;
            case 7:
                lc.Y().N(hd.N0(2131745665, null), hd.N0(2131751093, null)).j();
                break;
            case 8:
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    n6 n6Var = new n6();
                    j9 j9Var = n6Var.j0;
                    if (j9Var != null) {
                        j9Var.b(false);
                    }
                    if (n6Var.g0) {
                        n6Var.I0 = false;
                        n6Var.f0 = 1;
                        hi.i1 i1Var = n6Var.s0;
                        if (i1Var != null) {
                            i1Var.setPosition(1);
                        }
                    } else {
                        n6Var.I0 = true;
                    }
                    T.presentFragment(n6Var);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                if ((T2 instanceof qb1) && (c02 = ((qb1) T2).c0()) != null) {
                    T2 = c02;
                }
                gc Q2 = (T2 != null ? lc.b0(T2) : lc.Y()).Q(R.raw.ic_delete, 36, hd.N0(2131750199, null));
                Q2.t = true;
                Q2.j();
                break;
            case 10:
                org.telegram.messenger.q2.E.a();
                break;
            case 11:
                org.telegram.ui.ActionBar.g2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    T3.presentFragment(new pb());
                    break;
                }
                break;
            case 12:
                y8[][] y8VarArr = y8.S;
                break;
            case 13:
                break;
            case 14:
                int i11 = n5.r1;
                break;
            case 15:
                Comparator comparator = p6.X;
                break;
            case 16:
                int i12 = hi.g0.y0;
                break;
            case 17:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 18:
                break;
            case 19:
                np.g1().edit().putInt("storydualhint", np.g1().getInt("storydualhint", 0) + 1).apply();
                break;
            case 20:
                break;
            case 21:
                kg.v1[] v1VarArr = kg.v1.g;
                break;
            case 22:
                HashSet hashSet = ki.s2.b1;
                break;
            case 23:
                int i13 = mi.h.I;
                break;
            case 24:
                int i14 = AppStartReceiver.a;
                cz.t();
                if (cz.s.length() > 0) {
                    cz.x = true;
                    cz.y();
                }
                org.telegram.messenger.t0.x();
                break;
            case 25:
                Utilities.e.c(new n(28));
                break;
            case 26:
                boolean z10 = a8.j;
                StringBuilder sb2 = new StringBuilder();
                for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                    Thread key = entry.getKey();
                    StackTraceElement[] value = entry.getValue();
                    sb2.append("Thread: ");
                    sb2.append(key.getName());
                    sb2.append("\n");
                    for (StackTraceElement stackTraceElement : value) {
                        sb2.append("\tat ");
                        sb2.append(stackTraceElement);
                        sb2.append("\n");
                    }
                    sb2.append("\n\n");
                }
                a8.d("ANR thread dump\n" + sb2.toString());
                a8.j();
                a8.c(false);
                break;
            case 27:
                org.telegram.messenger.t0.x();
                break;
            case 28:
                org.telegram.utils.twidget.p1.d(org.telegram.messenger.t0.b);
                break;
            default:
                if (((ot) org.telegram.messenger.t0.l()).hasServices()) {
                    ((ot) org.telegram.messenger.t0.l()).onRequestPushToken();
                    break;
                } else {
                    if (org.telegram.messenger.s2.a) {
                        ((ot) org.telegram.messenger.t0.l()).getClass();
                        a8.b("No valid Google Play Services APK found.");
                    }
                    cz.h = "__NO_GOOGLE_PLAY_SERVICES__";
                    ((ot) org.telegram.messenger.t0.l()).getClass();
                    PushListenerController.sendRegistrationToServer(2, null);
                    break;
                }
        }
    }

    public /* synthetic */ n(Object obj, int i7) {
        this.a = i7;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
