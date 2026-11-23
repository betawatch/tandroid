package f2;

import a8.ka;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import b3.u;
import c8.od;
import fi.a1;
import fi.a6;
import fi.a8;
import fi.b1;
import fi.b5;
import fi.c1;
import fi.c3;
import fi.d1;
import fi.d7;
import fi.e1;
import fi.e9;
import fi.f9;
import fi.h8;
import fi.j8;
import fi.m7;
import fi.n5;
import fi.o8;
import fi.o9;
import fi.p5;
import fi.p6;
import fi.s3;
import fi.t6;
import fi.t8;
import fi.w8;
import fi.x2;
import fi.x4;
import fi.z3;
import h2.j0;
import h2.l0;
import h2.v;
import hi.j1;
import hi.u3;
import hi.v8;
import java.util.ArrayList;
import java.util.Locale;
import n2.p0;
import org.telegram.messenger.g0;
import org.telegram.messenger.ks;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bx;
import org.telegram.ui.sv;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wi.n nVar;
        LaunchActivity launchActivity;
        String d;
        TelephonyManager telephonyManager;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                b bVar = (b) this.b;
                if (bVar.c.a) {
                    bVar.a.a.C1(3, false);
                    return;
                }
                return;
            case 1:
                bx bxVar = ((sv) this.b).P0;
                if (bxVar.M && bxVar.k4().I()) {
                    bxVar.F0.h();
                    return;
                } else {
                    bxVar.R4(true, true);
                    return;
                }
            case 2:
                ((a1) this.b).a.t(false);
                return;
            case 3:
                c1 c1Var = ((b1) this.b).a;
                ks.f(c1Var.e).k(ks.G2, Long.valueOf(c1Var.g()));
                return;
            case 4:
                e1 e1Var = (e1) this.b;
                f9 f9Var = e1Var.c;
                if (f9Var == null || !e1Var.O0() || (nVar = e1Var.a) == null || nVar.c != 0 || (launchActivity = LaunchActivity.H1) == null || !od.a(launchActivity)) {
                    return;
                }
                f9Var.T();
                return;
            case 5:
                wi.n nVar2 = ((d1) this.b).e.a;
                if (nVar2 != null) {
                    nVar2.c();
                    return;
                }
                return;
            case 6:
                ((x2) this.b).a.O0();
                return;
            case 7:
                z3 z3Var = ((c3) this.b).y;
                s3 s3Var = z3Var.A1;
                if (s3Var != null) {
                    if (z3Var.D1 || z3Var.E1 || z3Var.F1) {
                        if (z3Var.y1.e) {
                            ((e9) z3Var.w2.c).loopBack();
                            return;
                        } else {
                            z3Var.G0 = 0L;
                            return;
                        }
                    }
                    f9 f9Var2 = ((w8) s3Var).d;
                    if (f9Var2.o0.getCurrentPeerView().b1(true) || f9Var2.o0.E(true)) {
                        return;
                    }
                    f9Var2.u(true);
                    return;
                }
                return;
            case 8:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                int i7 = ProfileStoriesView.t0;
                profileStoriesView.getClass();
                g0.a4(profileStoriesView);
                return;
            case 9:
                b5.a(((x4) this.b).d);
                return;
            case 10:
                n5 n5Var = (n5) this.b;
                if (n5Var.isShowing()) {
                    n5Var.K0(true);
                    return;
                }
                return;
            case 11:
                j1 j1Var = (j1) this.b;
                j1Var.c(j1Var.b);
                j1Var.c = false;
                return;
            case 12:
                ((v8) this.b).run();
                return;
            case 13:
                t6 t6Var = (t6) this.b;
                t6Var.c();
                t6Var.a(true);
                return;
            case 14:
                ((p5) this.b).a(null);
                return;
            case 15:
                ((d7) this.b).S();
                return;
            case 16:
                m7 m7Var = (m7) this.b;
                ArrayList arrayList = m7Var.c;
                if (arrayList != null) {
                    m7Var.a.j1 = arrayList;
                }
                z3 z3Var2 = m7Var.a;
                long j3 = m7Var.b;
                if (z3Var2.l1 == j3 && z3Var2.j1 == null) {
                    return;
                }
                z3Var2.l1 = j3;
                z3Var2.h1();
                z3Var2.g1();
                z3Var2.d1(true);
                TL_stories.PeerStories peerStories = z3Var2.t0.Q0;
                if (peerStories != null) {
                    z3Var2.C1.V(peerStories, true);
                    return;
                }
                p6 p6Var = z3Var2.C1;
                TL_stories.PeerStories y10 = p6Var.y(j3);
                if (y10 == null) {
                    y10 = p6Var.z(j3);
                    z10 = true;
                }
                p6Var.V(y10, z10);
                return;
            case 17:
                ((p0) this.b).f(true);
                return;
            case 18:
                ((a8) this.b).requestLayout();
                return;
            case 19:
                j8 j8Var = (j8) this.b;
                u3 u3Var = j8Var.c;
                if (u3Var != null) {
                    u3Var.f(true);
                    j8Var.c = null;
                }
                j8Var.b(false);
                return;
            case 20:
                h8 h8Var = (h8) this.b;
                if (h8Var.w) {
                    h8Var.F = true;
                    h8Var.G = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    h8Var.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    h8Var.f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    h8Var.invalidate();
                    return;
                }
                return;
            case 21:
                f9 f9Var3 = ((o8) this.b).b;
                try {
                    t8 t8Var = f9Var3.s;
                    if (t8Var == null) {
                        return;
                    }
                    if (f9Var3.b) {
                        g0.E2(t8Var);
                    } else {
                        f9Var3.n.removeView(t8Var);
                    }
                    f9Var3.s = null;
                    f9Var3.v();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 22:
                ((t8) this.b).s0.Q(true);
                return;
            case 23:
                ((o9) this.b).c();
                return;
            case 24:
                ((ti) this.b).hide();
                return;
            case 25:
                gi.m mVar = (gi.m) this.b;
                eq0 eq0Var = mVar.a0;
                a6 a6Var = mVar.a;
                eq0Var.a(a6Var == null ? "" : a6Var.E);
                return;
            case 26:
                ((j0) this.b).getClass();
                return;
            case 27:
                v vVar = (v) this.b;
                b3.f fVar = (b3.f) vVar.a.get();
                if (fVar != null) {
                    int b10 = vVar.c.b();
                    b3.g gVar = fVar.a;
                    synchronized (gVar) {
                        synchronized (gVar) {
                            int i10 = gVar.n;
                            if (i10 == 0 || gVar.e) {
                                if (i10 != b10 || gVar.o == null) {
                                    gVar.n = b10;
                                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                                        if (gVar.o == null) {
                                            Context context = gVar.a;
                                            String str = l0.a;
                                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                                    d = ka.d(networkCountryIso);
                                                    gVar.o = d;
                                                }
                                            }
                                            d = ka.d(Locale.getDefault().getCountry());
                                            gVar.o = d;
                                        }
                                        gVar.l = gVar.b(b10);
                                        gVar.d.getClass();
                                        long elapsedRealtime = SystemClock.elapsedRealtime();
                                        gVar.d(gVar.i, gVar.g > 0 ? (int) (elapsedRealtime - gVar.h) : 0, gVar.l);
                                        gVar.h = elapsedRealtime;
                                        gVar.i = 0L;
                                        gVar.k = 0L;
                                        gVar.j = 0L;
                                        u uVar = gVar.f;
                                        uVar.a.clear();
                                        uVar.c = -1;
                                        uVar.d = 0;
                                        uVar.e = 0;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
                return;
            case 28:
                ((hi.i) this.b).c.a0 = false;
                return;
            default:
                ((hi.m) this.b).invalidateSelf();
                return;
        }
    }
}
