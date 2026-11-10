package di;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.ViewGroup;
import fi.ua;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f8(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 8;
        int i10 = 0;
        switch (this.a) {
            case 0:
                ((n2.n0) this.b).f(true);
                break;
            case 1:
                ((l8) this.b).requestLayout();
                break;
            case 2:
                u8 u8Var = (u8) this.b;
                fi.m3 m3Var = u8Var.c;
                if (m3Var != null) {
                    m3Var.f(true);
                    u8Var.c = null;
                }
                u8Var.b(false);
                break;
            case 3:
                s8 s8Var = (s8) this.b;
                if (s8Var.w) {
                    s8Var.E = true;
                    s8Var.F = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    s8Var.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    s8Var.f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    s8Var.invalidate();
                    break;
                }
                break;
            case 4:
                q9 q9Var = ((z8) this.b).b;
                try {
                    e9 e9Var = q9Var.s;
                    if (e9Var != null) {
                        if (q9Var.b) {
                            org.telegram.messenger.g0.E2(e9Var);
                        } else {
                            q9Var.n.removeView(e9Var);
                        }
                        q9Var.s = null;
                        q9Var.v();
                        break;
                    } else {
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((e9) this.b).r0.Q(true);
                break;
            case 6:
                ((z9) this.b).c();
                break;
            case 7:
                ((ci) this.b).hide();
                break;
            case 8:
                ei.n nVar = (ei.n) this.b;
                sp0 sp0Var = nVar.W;
                k6 k6Var = nVar.a;
                sp0Var.a(k6Var == null ? "" : k6Var.E);
                break;
            case 9:
                ab.q qVar = (ab.q) this.b;
                ((Context) qVar.b).unregisterReceiver((f2.a) qVar.c);
                break;
            case 10:
                f2.a aVar = (f2.a) this.b;
                if (aVar.c.a) {
                    aVar.a.a.C1(3, false);
                    break;
                }
                break;
            case 11:
                ((fi.h) this.b).c.W = false;
                break;
            case 12:
                ((fi.l) this.b).invalidateSelf();
                break;
            case 13:
                ((fi.d0) this.b).g = -1L;
                break;
            case 14:
                fi.m0 m0Var = (fi.m0) this.b;
                tg.i iVar = m0Var.b.H;
                if (iVar != null) {
                    iVar.b();
                }
                m0Var.b.k();
                break;
            case 15:
                ((fi.u0) this.b).a(false);
                break;
            case 16:
                fi.c5 c5Var = (fi.c5) this.b;
                bc.e();
                ug.w0 w0Var = new ug.w0((org.telegram.ui.ActionBar.f2) new bi.w4(c5Var), 14, false);
                w0Var.setOnDismissListener(new fi.d1(i10));
                w0Var.show();
                break;
            case 17:
                ((fi.r1) this.b).G();
                break;
            case 18:
                fi.y1 y1Var = (fi.y1) this.b;
                ArrayList arrayList = y1Var.w;
                ArrayList arrayList2 = y1Var.s;
                fi.z1 z1Var = y1Var.N;
                fi.k2 k2Var = z1Var.s;
                int i11 = fi.k2.B1;
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
                    arrayList2.clear();
                    arrayList.clear();
                    y1Var.D.clear();
                    y1Var.n.clear();
                    y1Var.y++;
                    arrayList2.add(null);
                    arrayList.add(0L);
                    arrayList2.addAll(i02);
                    y1Var.y = i02.size() + y1Var.y;
                    y1Var.I = y1Var.H;
                    y1Var.f();
                    fi.m1.z1(z1Var.b, 0, 0);
                    z1Var.f.c(false);
                    z1Var.e.n(false);
                    break;
                }
                break;
            case 19:
                fi.e2 e2Var = (fi.e2) ((ah.j) this.b).b;
                if (!e2Var.n) {
                    e2Var.r.setVisibility(8);
                    break;
                }
                break;
            case 20:
                fi.i2 i2Var = (fi.i2) ((fi.h2) this.b).b;
                ArrayList arrayList3 = i2Var.o;
                if (!arrayList3.isEmpty()) {
                    i2Var.l.e(true, 0.0f);
                    int i12 = i2Var.k + 1;
                    i2Var.k = i12;
                    if (i12 > arrayList3.size() - 1) {
                        i2Var.k = 0;
                    }
                    ch.f0 f0Var = i2Var.j;
                    f0Var.e((ch.o0) arrayList3.get(i2Var.k));
                    i2Var.j = i2Var.i;
                    i2Var.i = f0Var;
                    i2Var.p.invalidate();
                    break;
                }
                break;
            case 21:
                ((FfmpegAudioWaveformLoader) this.b).lambda$destroy$2();
                break;
            case 22:
                ((fi.b3) this.b).b(null);
                break;
            case 23:
                ((fi.e3) this.b).E();
                break;
            case 24:
                fi.n9 n9Var = (fi.n9) this.b;
                if (n9Var.I) {
                    n9Var.I = false;
                    n9Var.invalidate();
                    break;
                }
                break;
            case 25:
                fi.g6 g6Var = (fi.g6) ((fi.f6) this.b).q;
                g6Var.Q = System.currentTimeMillis();
                g6Var.R = 0L;
                g6Var.r0 = true;
                ((fi.r9) g6Var.a).a.J0.a(0L, true);
                g6Var.invalidate();
                break;
            case 26:
                fi.p pVar = (fi.p) this.b;
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    break;
                }
                break;
            case 27:
                fi.d dVar = (fi.d) this.b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    break;
                }
                break;
            case 28:
                ((fi.p8) ((ah.n) this.b).n).fullScroll(qs.O1);
                break;
            default:
                ua uaVar = (ua) this.b;
                uaVar.g0.onTouchEvent(org.telegram.messenger.g0.R());
                uaVar.f0.n0(org.telegram.messenger.g0.R());
                break;
        }
    }
}
