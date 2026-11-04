package ei;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import b8.xb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.li;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z5(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String d;
        TelephonyManager telephonyManager;
        boolean z10 = true;
        int i3 = 0;
        switch (this.a) {
            case 0:
                gi.z0 z0Var = (gi.z0) this.b;
                z0Var.c(z0Var.b);
                z0Var.c = false;
                return;
            case 1:
                ((gi.c8) this.b).run();
                return;
            case 2:
                d7 d7Var = (d7) this.b;
                d7Var.c();
                d7Var.a(true);
                return;
            case 3:
                ((y5) this.b).a(null);
                return;
            case 4:
                ((n7) this.b).R();
                return;
            case 5:
                w7 w7Var = (w7) this.b;
                ArrayList arrayList = w7Var.c;
                if (arrayList != null) {
                    w7Var.a.j1 = arrayList;
                }
                j4 j4Var = w7Var.a;
                long j10 = w7Var.b;
                if (j4Var.l1 == j10 && j4Var.j1 == null) {
                    return;
                }
                j4Var.l1 = j10;
                j4Var.h1();
                j4Var.g1();
                j4Var.d1(true);
                TL_stories.PeerStories peerStories = j4Var.t0.R0;
                if (peerStories != null) {
                    j4Var.C1.V(peerStories, true);
                    return;
                }
                z6 z6Var = j4Var.C1;
                TL_stories.PeerStories y9 = z6Var.y(j10);
                if (y9 == null) {
                    y9 = z6Var.z(j10);
                } else {
                    z10 = false;
                }
                z6Var.V(y9, z10);
                return;
            case 6:
                ((m2.p0) this.b).f(true);
                return;
            case 7:
                ((k8) this.b).requestLayout();
                return;
            case 8:
                t8 t8Var = (t8) this.b;
                gi.l3 l3Var = t8Var.c;
                if (l3Var != null) {
                    l3Var.f(true);
                    t8Var.c = null;
                }
                t8Var.b(false);
                return;
            case 9:
                r8 r8Var = (r8) this.b;
                if (r8Var.w) {
                    r8Var.F = true;
                    r8Var.G = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    r8Var.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    r8Var.f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    r8Var.invalidate();
                    return;
                }
                return;
            case 10:
                r9 r9Var = ((z8) this.b).b;
                try {
                    e9 e9Var = r9Var.s;
                    if (e9Var == null) {
                        return;
                    }
                    if (r9Var.b) {
                        org.telegram.messenger.g0.E2(e9Var);
                    } else {
                        r9Var.n.removeView(e9Var);
                    }
                    r9Var.s = null;
                    r9Var.E();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 11:
                ((e9) this.b).s0.Y(true);
                return;
            case 12:
                ((aa) this.b).c();
                return;
            case 13:
                ((bi) this.b).hide();
                return;
            case 14:
                fi.m mVar = (fi.m) this.b;
                tp0 tp0Var = mVar.a0;
                k6 k6Var = mVar.a;
                tp0Var.a(k6Var == null ? "" : k6Var.E);
                return;
            case 15:
                g2.w wVar = (g2.w) this.b;
                a3.f fVar = (a3.f) wVar.a.get();
                if (fVar != null) {
                    int b10 = wVar.c.b();
                    a3.g gVar = fVar.a;
                    synchronized (gVar) {
                        synchronized (gVar) {
                            int i10 = gVar.n;
                            if (i10 == 0 || gVar.e) {
                                if (i10 != b10 || gVar.o == null) {
                                    gVar.n = b10;
                                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                                        if (gVar.o == null) {
                                            Context context = gVar.a;
                                            String str = g2.n0.a;
                                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                                    d = xb.d(networkCountryIso);
                                                    gVar.o = d;
                                                }
                                            }
                                            d = xb.d(Locale.getDefault().getCountry());
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
                                        a3.w wVar2 = gVar.f;
                                        wVar2.a.clear();
                                        wVar2.c = -1;
                                        wVar2.d = 0;
                                        wVar2.e = 0;
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
            case 16:
                ((gi.h) this.b).c.a0 = false;
                return;
            case 17:
                ((gi.l) this.b).invalidateSelf();
                return;
            case 18:
                ((gi.d0) this.b).g = -1L;
                return;
            case 19:
                gi.m0 m0Var = (gi.m0) this.b;
                ug.i iVar = m0Var.b.I;
                if (iVar != null) {
                    iVar.b();
                }
                m0Var.b.k();
                return;
            case 20:
                ((gi.u0) this.b).a(false);
                return;
            case 21:
                gi.a5 a5Var = (gi.a5) this.b;
                ac.e();
                vg.v0 v0Var = new vg.v0((org.telegram.ui.ActionBar.d2) new ai.c7(a5Var), 14, false);
                v0Var.setOnDismissListener(new gi.d1(i3));
                v0Var.show();
                return;
            case 22:
                ((gi.r1) this.b).G();
                return;
            case 23:
                gi.x1 x1Var = (gi.x1) this.b;
                ArrayList arrayList2 = x1Var.w;
                ArrayList arrayList3 = x1Var.s;
                gi.y1 y1Var = x1Var.O;
                gi.i2 i2Var = y1Var.s;
                int i11 = gi.i2.z1;
                li b02 = li.b0(i2Var.a);
                String str2 = x1Var.I;
                if (!"premium".equalsIgnoreCase(str2)) {
                    if (y1Var.a == 1 && org.telegram.messenger.i6.d(x1Var.I)) {
                        TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                        tL_messages_getStickers.emoticon = x1Var.I;
                        tL_messages_getStickers.hash = 0L;
                        ConnectionsManager.getInstance(i2Var.a).sendRequest(tL_messages_getStickers, new ai.f3(15, x1Var, str2));
                        return;
                    }
                    String[] G0 = org.telegram.messenger.g0.G0();
                    String[] strArr = x1Var.K;
                    if (strArr == null || !Arrays.equals(G0, strArr)) {
                        li.b0(i2Var.a).M(G0, false);
                    }
                    x1Var.K = G0;
                    b02.V(G0, x1Var.I, false, new aa.a(x1Var, str2, b02, 6), false, false, false, true, 50);
                    return;
                }
                ArrayList i02 = b02.i0(7, false);
                x1Var.y = 0;
                arrayList3.clear();
                arrayList2.clear();
                x1Var.E.clear();
                x1Var.n.clear();
                x1Var.y++;
                arrayList3.add(null);
                arrayList2.add(0L);
                arrayList3.addAll(i02);
                x1Var.y = i02.size() + x1Var.y;
                x1Var.J = x1Var.I;
                x1Var.f();
                gi.m1.z1(y1Var.b, 0, 0);
                y1Var.f.c(false);
                y1Var.e.n(false);
                return;
            case 24:
                gi.d2 d2Var = (gi.d2) ((bh.h) this.b).b;
                if (d2Var.n) {
                    return;
                }
                d2Var.r.setVisibility(8);
                return;
            case 25:
                gi.g2 g2Var = (gi.g2) ((g6.q) this.b).b;
                ArrayList arrayList4 = g2Var.o;
                if (arrayList4.isEmpty()) {
                    return;
                }
                g2Var.l.e(true, 0.0f);
                int i12 = g2Var.k + 1;
                g2Var.k = i12;
                if (i12 > arrayList4.size() - 1) {
                    g2Var.k = 0;
                }
                dh.e0 e0Var = g2Var.j;
                e0Var.e((dh.n0) arrayList4.get(g2Var.k));
                g2Var.j = g2Var.i;
                g2Var.i = e0Var;
                g2Var.p.invalidate();
                return;
            case 26:
                ((FfmpegAudioWaveformLoader) this.b).lambda$destroy$2();
                return;
            case 27:
                ((gi.z2) this.b).b(null);
                return;
            case 28:
                ((gi.c3) this.b).E();
                return;
            default:
                gi.o9 o9Var = (gi.o9) this.b;
                if (o9Var.J) {
                    o9Var.J = false;
                    o9Var.invalidate();
                    return;
                }
                return;
        }
    }
}
