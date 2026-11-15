package ai;

import a8.xa;
import android.graphics.Bitmap;
import android.os.Looper;
import di.lb;
import di.u8;
import fi.o5;
import fi.s6;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.AppStartReceiver;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g5;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.k4;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.qt;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.mb1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ o(int i7) {
        this.a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.e2 c02;
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
                return;
            case 1:
                DictationAsr.T(true);
                return;
            case 2:
                DictationLid.b();
                return;
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
                        ((bg.d0[]) xaVar.c)[i10] = null;
                    }
                    if (!arrayList2.isEmpty()) {
                        Utilities.e.c(new bg.e(i7, arrayList2));
                    }
                    bg.i.B = null;
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q == null) {
                    return;
                }
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2();
                c2Var.a = true;
                Q.showAsSheet(new PremiumPreviewFragment(0, "gifts"), c2Var);
                return;
            case 5:
                ns.e().k(99, 512);
                return;
            case 6:
                cc.X().N(hd.M0(2131745861, null), hd.M0(2131751105, null)).j();
                return;
            case 7:
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if ((T instanceof mb1) && (c02 = ((mb1) T).c0()) != null) {
                    T = c02;
                }
                xb Q2 = (T != null ? cc.a0(T) : cc.X()).Q(R.raw.ic_delete, 36, hd.M0(2131750216, null));
                Q2.t = true;
                Q2.j();
                return;
            case 8:
                org.telegram.messenger.p2.E.a();
                return;
            case 9:
                org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                if (T2 == null) {
                    return;
                }
                T2.presentFragment(new lb());
                return;
            case 10:
                u8[][] u8VarArr = u8.S;
                return;
            case 11:
                return;
            case 12:
                int i11 = o5.r1;
                return;
            case 13:
                Comparator comparator = s6.X;
                return;
            case 14:
                int i12 = hi.e0.y0;
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
                np.e1().edit().putInt("storydualhint", np.e1().getInt("storydualhint", 0) + 1).apply();
                return;
            case 18:
                return;
            case 19:
                kg.v1[] v1VarArr = kg.v1.g;
                return;
            case 20:
                HashSet hashSet = ki.x2.b1;
                return;
            case 21:
                int i13 = mi.h.I;
                return;
            case 22:
                int i14 = AppStartReceiver.a;
                gz.t();
                if (gz.s.length() > 0) {
                    gz.x = true;
                    gz.y();
                }
                org.telegram.messenger.t0.x();
                return;
            case 23:
                Utilities.e.c(new o(26));
                return;
            case 24:
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
            case 25:
                org.telegram.messenger.t0.x();
                return;
            case 26:
                org.telegram.utils.twidget.l1.c(org.telegram.messenger.t0.b);
                return;
            case 27:
                if (((qt) org.telegram.messenger.t0.l()).hasServices()) {
                    ((qt) org.telegram.messenger.t0.l()).onRequestPushToken();
                    return;
                }
                if (org.telegram.messenger.r2.a) {
                    ((qt) org.telegram.messenger.t0.l()).getClass();
                    a8.b("No valid Google Play Services APK found.");
                }
                gz.h = "__NO_GOOGLE_PLAY_SERVICES__";
                ((qt) org.telegram.messenger.t0.l()).getClass();
                PushListenerController.sendRegistrationToServer(2, null);
                return;
            case 28:
                return;
        }
        while (i7 < 4) {
            if (m10.i(i7).p()) {
                ConnectionsManager.getInstance(i7).resumeNetworkMaybe();
                Utilities.e.c(new k4(g5.r(i7), 3));
            }
            i7++;
        }
    }

    public /* synthetic */ o(Object obj, int i7) {
        this.a = i7;
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
