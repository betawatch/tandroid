package ai;

import android.graphics.Bitmap;
import android.os.Looper;
import b8.kg;
import ci.e9;
import ci.wb;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.AppStartReceiver;
import org.telegram.messenger.KeepAliveJob;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.lt;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.gb1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ y1(int i3) {
        this.a = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.d2 c02;
        int i3 = 0;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q == null) {
                    return;
                }
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2();
                b2Var.a = true;
                Q.showAsSheet(new PremiumPreviewFragment(0, "gifts"), b2Var);
                return;
            case 1:
                fc.X().N(bd.M0(2131745871, null), bd.M0(2131751106, null)).j();
                return;
            case 2:
                kg kgVar = cg.h.B;
                if (kgVar != null) {
                    ArrayList arrayList = null;
                    for (int i10 = 0; i10 < cg.h.y; i10++) {
                        if (((Bitmap[]) kgVar.d)[i10] != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(((Bitmap[]) kgVar.d)[i10]);
                        }
                        ((Bitmap[]) kgVar.d)[i10] = null;
                        ((cg.c0[]) kgVar.c)[i10] = null;
                    }
                    if (!arrayList.isEmpty()) {
                        Utilities.e.c(new cg.e(i3, arrayList));
                    }
                    cg.h.B = null;
                    return;
                }
                return;
            case 3:
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if ((T instanceof gb1) && (c02 = ((gb1) T).c0()) != null) {
                    T = c02;
                }
                ac Q2 = (T != null ? fc.a0(T) : fc.X()).Q(R.raw.ic_delete, 36, bd.M0(2131750224, null));
                Q2.t = true;
                Q2.j();
                return;
            case 4:
                org.telegram.messenger.p2.E.a();
                return;
            case 5:
                org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                if (T2 == null) {
                    return;
                }
                T2.presentFragment(new wb());
                return;
            case 6:
                e9[][] e9VarArr = e9.S;
                return;
            case 7:
                hs.e().k(99, 512);
                return;
            case 8:
                return;
            case 9:
                hs.e().k(hs.F2, new Object[0]);
                return;
            case 10:
                ei.n1.b();
                return;
            case 11:
                ei.n1 n1Var = ei.n1.a0;
                n1Var.e.invalidate();
                if (n1Var.e.isInLayout()) {
                    return;
                }
                n1Var.e.requestLayout();
                n1Var.d.requestLayout();
                n1Var.f.requestLayout();
                return;
            case 12:
                int i11 = ei.w5.o1;
                return;
            case 13:
                Comparator comparator = ei.z6.X;
                return;
            case 14:
                int i12 = gi.e0.y0;
                return;
            case 15:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 16:
                return;
            case 17:
                hp.e1().edit().putInt("storydualhint", hp.e1().getInt("storydualhint", 0) + 1).apply();
                return;
            case 18:
                HashSet hashSet = ii.a3.b1;
                return;
            case 19:
                return;
            case 20:
                int i13 = ki.h.I;
                return;
            case 21:
                lg.u1[] u1VarArr = lg.u1.g;
                return;
            case 22:
                int i14 = AppStartReceiver.a;
                az.t();
                if (az.s.length() > 0) {
                    az.x = true;
                    az.y();
                }
                org.telegram.messenger.t0.x();
                return;
            case 23:
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
                return;
            case 24:
                org.telegram.messenger.t0.x();
                return;
            case 25:
                if (((lt) org.telegram.messenger.t0.l()).hasServices()) {
                    ((lt) org.telegram.messenger.t0.l()).onRequestPushToken();
                    return;
                }
                if (org.telegram.messenger.r2.a) {
                    ((lt) org.telegram.messenger.t0.l()).getClass();
                    a8.b("No valid Google Play Services APK found.");
                }
                az.h = "__NO_GOOGLE_PLAY_SERVICES__";
                ((lt) org.telegram.messenger.t0.l()).getClass();
                PushListenerController.sendRegistrationToServer(2, null);
                return;
            case 26:
                return;
            case 27:
                break;
            case 28:
                hs.e().k(hs.i4, new Object[0]);
                return;
            default:
                KeepAliveJob.a();
                return;
        }
        while (true) {
            int i15 = 4;
            if (i3 >= 4) {
                return;
            }
            if (h10.i(i3).p()) {
                ConnectionsManager.getInstance(i3).resumeNetworkMaybe();
                Utilities.e.c(new org.telegram.messenger.x4(org.telegram.messenger.g5.r(i3), i15));
            }
            i3++;
        }
    }

    public /* synthetic */ y1(Object obj, int i3) {
        this.a = i3;
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
