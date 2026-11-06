package di;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s7(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 8;
        boolean z9 = true;
        int i10 = 0;
        switch (this.a) {
            case 0:
                w7 w7Var = (w7) this.b;
                ArrayList arrayList = w7Var.c;
                if (arrayList != null) {
                    w7Var.a.i1 = arrayList;
                }
                i4 i4Var = w7Var.a;
                long j3 = w7Var.b;
                if (i4Var.k1 != j3 || i4Var.i1 != null) {
                    i4Var.k1 = j3;
                    i4Var.h1();
                    i4Var.g1();
                    i4Var.d1(true);
                    TL_stories.PeerStories peerStories = i4Var.s0.P0;
                    if (peerStories == null) {
                        y6 y6Var = i4Var.B1;
                        TL_stories.PeerStories y10 = y6Var.y(j3);
                        if (y10 == null) {
                            y10 = y6Var.z(j3);
                        } else {
                            z9 = false;
                        }
                        y6Var.V(y10, z9);
                        break;
                    } else {
                        i4Var.B1.V(peerStories, true);
                        break;
                    }
                }
                break;
            case 1:
                ((n2.n0) this.b).f(true);
                break;
            case 2:
                ((k8) this.b).requestLayout();
                break;
            case 3:
                t8 t8Var = (t8) this.b;
                fi.m3 m3Var = t8Var.c;
                if (m3Var != null) {
                    m3Var.f(true);
                    t8Var.c = null;
                }
                t8Var.b(false);
                break;
            case 4:
                r8 r8Var = (r8) this.b;
                if (r8Var.w) {
                    r8Var.E = true;
                    r8Var.F = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    r8Var.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    r8Var.f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    r8Var.invalidate();
                    break;
                }
                break;
            case 5:
                p9 p9Var = ((y8) this.b).b;
                try {
                    d9 d9Var = p9Var.s;
                    if (d9Var != null) {
                        if (p9Var.b) {
                            org.telegram.messenger.g0.E2(d9Var);
                        } else {
                            p9Var.n.removeView(d9Var);
                        }
                        p9Var.s = null;
                        p9Var.v();
                        break;
                    } else {
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
            case 6:
                ((d9) this.b).r0.Q(true);
                break;
            case 7:
                ((y9) this.b).c();
                break;
            case 8:
                ((di) this.b).hide();
                break;
            case 9:
                ei.n nVar = (ei.n) this.b;
                sp0 sp0Var = nVar.W;
                j6 j6Var = nVar.a;
                sp0Var.a(j6Var == null ? "" : j6Var.E);
                break;
            case 10:
                ab.q qVar = (ab.q) this.b;
                ((Context) qVar.b).unregisterReceiver((f2.a) qVar.c);
                break;
            case 11:
                f2.a aVar = (f2.a) this.b;
                if (aVar.c.a) {
                    aVar.a.a.C1(3, false);
                    break;
                }
                break;
            case 12:
                ((fi.h) this.b).c.W = false;
                break;
            case 13:
                ((fi.l) this.b).invalidateSelf();
                break;
            case 14:
                ((fi.d0) this.b).g = -1L;
                break;
            case 15:
                fi.m0 m0Var = (fi.m0) this.b;
                tg.i iVar = m0Var.b.H;
                if (iVar != null) {
                    iVar.b();
                }
                m0Var.b.k();
                break;
            case 16:
                ((fi.u0) this.b).a(false);
                break;
            case 17:
                fi.c5 c5Var = (fi.c5) this.b;
                cc.e();
                ug.w0 w0Var = new ug.w0((org.telegram.ui.ActionBar.f2) new bi.w4(c5Var), 14, false);
                w0Var.setOnDismissListener(new fi.d1(i10));
                w0Var.show();
                break;
            case 18:
                ((fi.r1) this.b).G();
                break;
            case 19:
                fi.y1 y1Var = (fi.y1) this.b;
                ArrayList arrayList2 = y1Var.w;
                ArrayList arrayList3 = y1Var.s;
                fi.z1 z1Var = y1Var.N;
                fi.k2 k2Var = z1Var.s;
                int i11 = fi.k2.y1;
                ui b02 = ui.b0(k2Var.a);
                String str = y1Var.H;
                if (!"premium".equalsIgnoreCase(str)) {
                    if (z1Var.a != 1 || !org.telegram.messenger.i6.d(y1Var.H)) {
                        String[] G0 = org.telegram.messenger.g0.G0();
                        String[] strArr = y1Var.J;
                        if (strArr == null || !Arrays.equals(G0, strArr)) {
                            ui.b0(k2Var.a).M(G0, false);
                        }
                        y1Var.J = G0;
                        b02.V(G0, y1Var.H, false, new a3.h(y1Var, str, b02, i7), false, false, false, true, 50);
                        break;
                    } else {
                        TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                        tL_messages_getStickers.emoticon = y1Var.H;
                        tL_messages_getStickers.hash = 0L;
                        ConnectionsManager.getInstance(k2Var.a).sendRequest(tL_messages_getStickers, new bi.j(12, y1Var, str));
                        break;
                    }
                } else {
                    ArrayList i02 = b02.i0(7, false);
                    y1Var.y = 0;
                    arrayList3.clear();
                    arrayList2.clear();
                    y1Var.D.clear();
                    y1Var.n.clear();
                    y1Var.y++;
                    arrayList3.add(null);
                    arrayList2.add(0L);
                    arrayList3.addAll(i02);
                    y1Var.y = i02.size() + y1Var.y;
                    y1Var.I = y1Var.H;
                    y1Var.f();
                    fi.m1.z1(z1Var.b, 0, 0);
                    z1Var.f.c(false);
                    z1Var.e.n(false);
                    break;
                }
                break;
            case 20:
                fi.e2 e2Var = (fi.e2) ((ah.j) this.b).b;
                if (!e2Var.n) {
                    e2Var.r.setVisibility(8);
                    break;
                }
                break;
            case 21:
                fi.i2 i2Var = (fi.i2) ((fi.h2) this.b).b;
                ArrayList arrayList4 = i2Var.o;
                if (!arrayList4.isEmpty()) {
                    i2Var.l.e(true, 0.0f);
                    int i12 = i2Var.k + 1;
                    i2Var.k = i12;
                    if (i12 > arrayList4.size() - 1) {
                        i2Var.k = 0;
                    }
                    ch.f0 f0Var = i2Var.j;
                    f0Var.e((ch.o0) arrayList4.get(i2Var.k));
                    i2Var.j = i2Var.i;
                    i2Var.i = f0Var;
                    i2Var.p.invalidate();
                    break;
                }
                break;
            case 22:
                ((FfmpegAudioWaveformLoader) this.b).lambda$destroy$2();
                break;
            case 23:
                ((fi.b3) this.b).b(null);
                break;
            case 24:
                ((fi.e3) this.b).E();
                break;
            case 25:
                fi.o9 o9Var = (fi.o9) this.b;
                if (o9Var.I) {
                    o9Var.I = false;
                    o9Var.invalidate();
                    break;
                }
                break;
            case 26:
                fi.g6 g6Var = (fi.g6) ((fi.f6) this.b).q;
                g6Var.Q = System.currentTimeMillis();
                g6Var.R = 0L;
                g6Var.r0 = true;
                ((fi.s9) g6Var.a).a.J0.a(0L, true);
                g6Var.invalidate();
                break;
            case 27:
                fi.p pVar = (fi.p) this.b;
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    break;
                }
                break;
            case 28:
                fi.d dVar = (fi.d) this.b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    break;
                }
                break;
            default:
                ((fi.p8) ((ah.n) this.b).n).fullScroll(qs.O1);
                break;
        }
    }
}
