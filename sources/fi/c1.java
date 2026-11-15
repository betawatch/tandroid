package fi;

import a8.ha;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import c8.kd;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.ns;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c1(Object obj, int i7) {
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
                e1 e1Var = ((d1) this.b).a;
                ns.f(e1Var.e).k(ns.G2, Long.valueOf(e1Var.g()));
                return;
            case 1:
                g1 g1Var = (g1) this.b;
                i9 i9Var = g1Var.c;
                if (i9Var == null || !g1Var.F() || (nVar = g1Var.a) == null || nVar.c != 0 || (launchActivity = LaunchActivity.H1) == null || !kd.a(launchActivity)) {
                    return;
                }
                i9Var.T();
                return;
            case 2:
                wi.n nVar2 = ((f1) this.b).e.a;
                if (nVar2 != null) {
                    nVar2.c();
                    return;
                }
                return;
            case 3:
                ((z2) this.b).a.O0();
                return;
            case 4:
                b4 b4Var = ((e3) this.b).y;
                u3 u3Var = b4Var.A1;
                if (u3Var != null) {
                    if (b4Var.D1 || b4Var.E1 || b4Var.F1) {
                        if (b4Var.y1.e) {
                            ((h9) b4Var.w2.c).loopBack();
                            return;
                        } else {
                            b4Var.G0 = 0L;
                            return;
                        }
                    }
                    i9 i9Var2 = ((z8) u3Var).d;
                    if (i9Var2.o0.getCurrentPeerView().b1(true) || i9Var2.o0.E(true)) {
                        return;
                    }
                    i9Var2.u(true);
                    return;
                }
                return;
            case 5:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                int i7 = ProfileStoriesView.t0;
                profileStoriesView.getClass();
                org.telegram.messenger.g0.b4(profileStoriesView);
                return;
            case 6:
                c5.a(((y4) this.b).d);
                return;
            case 7:
                o5 o5Var = (o5) this.b;
                if (o5Var.isShowing()) {
                    o5Var.J0(true);
                    return;
                }
                return;
            case 8:
                hi.a1 a1Var = (hi.a1) this.b;
                a1Var.c(a1Var.b);
                a1Var.c = false;
                return;
            case 9:
                ((hi.b8) this.b).run();
                return;
            case 10:
                w6 w6Var = (w6) this.b;
                w6Var.c();
                w6Var.a(true);
                return;
            case 11:
                ((q5) this.b).a(null);
                return;
            case 12:
                ((g7) this.b).R();
                return;
            case 13:
                p7 p7Var = (p7) this.b;
                ArrayList arrayList = p7Var.c;
                if (arrayList != null) {
                    p7Var.a.j1 = arrayList;
                }
                b4 b4Var2 = p7Var.a;
                long j3 = p7Var.b;
                if (b4Var2.l1 == j3 && b4Var2.j1 == null) {
                    return;
                }
                b4Var2.l1 = j3;
                b4Var2.h1();
                b4Var2.g1();
                b4Var2.d1(true);
                TL_stories.PeerStories peerStories = b4Var2.t0.Q0;
                if (peerStories != null) {
                    b4Var2.C1.V(peerStories, true);
                    return;
                }
                s6 s6Var = b4Var2.C1;
                TL_stories.PeerStories y10 = s6Var.y(j3);
                if (y10 == null) {
                    y10 = s6Var.z(j3);
                    z10 = true;
                }
                s6Var.V(y10, z10);
                return;
            case 14:
                ((n2.o0) this.b).f(true);
                return;
            case 15:
                ((d8) this.b).requestLayout();
                return;
            case 16:
                m8 m8Var = (m8) this.b;
                hi.l3 l3Var = m8Var.c;
                if (l3Var != null) {
                    l3Var.f(true);
                    m8Var.c = null;
                }
                m8Var.b(false);
                return;
            case 17:
                k8 k8Var = (k8) this.b;
                if (k8Var.w) {
                    k8Var.F = true;
                    k8Var.G = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    k8Var.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    k8Var.f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    k8Var.invalidate();
                    return;
                }
                return;
            case 18:
                i9 i9Var3 = ((r8) this.b).b;
                try {
                    w8 w8Var = i9Var3.s;
                    if (w8Var == null) {
                        return;
                    }
                    if (i9Var3.b) {
                        org.telegram.messenger.g0.E2(w8Var);
                    } else {
                        i9Var3.n.removeView(w8Var);
                    }
                    i9Var3.s = null;
                    i9Var3.v();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 19:
                ((w8) this.b).s0.Q(true);
                return;
            case 20:
                ((r9) this.b).c();
                return;
            case 21:
                ((ki) this.b).hide();
                return;
            case 22:
                gi.m mVar = (gi.m) this.b;
                vp0 vp0Var = mVar.a0;
                c6 c6Var = mVar.a;
                vp0Var.a(c6Var == null ? "" : c6Var.E);
                return;
            case 23:
                ((h2.j0) this.b).getClass();
                return;
            case 24:
                h2.v vVar = (h2.v) this.b;
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
                                            String str = h2.l0.a;
                                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                                    d = ha.d(networkCountryIso);
                                                    gVar.o = d;
                                                }
                                            }
                                            d = ha.d(Locale.getDefault().getCountry());
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
                                        b3.t tVar = gVar.f;
                                        tVar.a.clear();
                                        tVar.c = -1;
                                        tVar.d = 0;
                                        tVar.e = 0;
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
            case 25:
                ((hi.h) this.b).c.a0 = false;
                return;
            case 26:
                ((hi.l) this.b).invalidateSelf();
                return;
            case 27:
                ((hi.d0) this.b).g = -1L;
                return;
            case 28:
                hi.n0 n0Var = (hi.n0) this.b;
                tg.i iVar = n0Var.b.I;
                if (iVar != null) {
                    iVar.b();
                }
                n0Var.b.k();
                return;
            default:
                ((hi.v0) this.b).a(false);
                return;
        }
    }
}
