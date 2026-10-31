package org.telegram.ui.Wallet;

import android.graphics.RectF;
import android.os.SystemClock;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.bi0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c8 implements Runnable {
    public final /* synthetic */ h8 a;

    public c8(h8 h8Var) {
        this.a = h8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0162 A[LOOP:1: B:21:0x0160->B:22:0x0162, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x08c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x09f8  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0a24  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0a5a  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x066f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x07d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0497  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j10;
        float f7;
        u7 u7Var;
        u7 u7Var2;
        u7 u7Var3;
        boolean z10;
        m4.c cVar;
        boolean z11;
        org.telegram.ui.Components.g9 g9Var;
        float[] D;
        g8 g8Var;
        RectF Z;
        u7 j11;
        int size;
        int size2;
        float f10;
        Iterator it;
        float f11;
        boolean b10;
        boolean b11;
        l6 l6Var;
        int i10;
        float f12;
        float f13;
        g6 g6Var;
        int size3;
        int i11;
        Iterator it2;
        String string;
        boolean z12;
        float f14;
        f8 f8Var;
        f8 f8Var2;
        boolean optBoolean;
        int i12;
        ag.c2 c2Var;
        float f15;
        float f16;
        float f17;
        float f18;
        u7 u7Var4;
        float f19;
        bi0 B;
        float f20;
        float f21;
        float f22;
        h8 h8Var = this.a;
        if (h8Var.a1 || !h8Var.isAttachedToWindow()) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j12 = 0;
        float min = h8Var.M0 == 0 ? 0.016666668f : Math.min(0.032f, (uptimeMillis - r4) / 1000.0f);
        h8Var.M0 = uptimeMillis;
        if (h8Var.A()) {
            Iterator it3 = h8Var.f.values().iterator();
            boolean z13 = false;
            while (true) {
                j10 = j12;
                if (!it3.hasNext()) {
                    break;
                }
                g8 g8Var2 = (g8) it3.next();
                boolean z14 = g8Var2.K;
                f8 f8Var3 = g8Var2.m;
                f8 f8Var4 = g8Var2.i;
                String str = g8Var2.a;
                f8 f8Var5 = g8Var2.j;
                ag.c2 c2Var2 = g8Var2.c;
                f8 f8Var6 = g8Var2.g;
                f8 f8Var7 = g8Var2.f;
                f8 f8Var8 = g8Var2.e;
                f8 f8Var9 = g8Var2.h;
                if (z14) {
                    it2 = it3;
                    f14 = min;
                    z12 = z13;
                } else {
                    g8Var2.K = true;
                    if (h8Var.b) {
                        it2 = it3;
                        string = null;
                    } else {
                        it2 = it3;
                        string = h8Var.e.getString(str, null);
                    }
                    if (h8Var.b1 != null) {
                        TL_wallet.cardSticker R = h8Var.R(str);
                        if (R != null) {
                            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = R.coordinates;
                            if (string == null) {
                                z12 = z13;
                            } else {
                                z12 = z13;
                                try {
                                    optBoolean = new JSONObject(string).optBoolean("q");
                                } catch (Exception unused) {
                                }
                                h8Var.K(g8Var2, mediaAreaCoordinates, optBoolean);
                            }
                            optBoolean = false;
                            h8Var.K(g8Var2, mediaAreaCoordinates, optBoolean);
                        } else {
                            z12 = z13;
                        }
                    } else {
                        z12 = z13;
                        if (string != null) {
                            try {
                                JSONObject jSONObject = new JSONObject(string);
                                f14 = min;
                                try {
                                    f8Var9.a((float) jSONObject.optDouble("s", 1.0d));
                                    f8Var = f8Var3;
                                    f8Var2 = f8Var5;
                                } catch (Exception unused2) {
                                    f8Var = f8Var3;
                                    f8Var2 = f8Var5;
                                }
                                try {
                                    f8Var4.a((float) jSONObject.optDouble("r", 0.0d));
                                    g8Var2.N = jSONObject.optBoolean("q");
                                    float[] fArr = {((float) jSONObject.getDouble("x")) * h8Var.Y0, ((float) jSONObject.getDouble("y")) * h8Var.Z0, f8Var9.b};
                                    f8Var8.a(fArr[0]);
                                    f8Var7.a(fArr[1]);
                                    f8Var9.a(fArr[2]);
                                    g8Var2.H = 2;
                                    long j13 = h8Var.N0 + 1;
                                    h8Var.N0 = j13;
                                    g8Var2.I = j13;
                                    f8Var.a(1.0f);
                                    if (g8Var2.J == j10) {
                                        long j14 = h8Var.R0 + 1;
                                        h8Var.R0 = j14;
                                        g8Var2.J = j14;
                                    }
                                    str = str;
                                    try {
                                        if (str.equals(h8Var.P0)) {
                                            h8Var.T0 = g8Var2;
                                            h8Var.S0 = g8Var2;
                                            h8Var.U0 = 1.0f;
                                            h8Var.e();
                                        }
                                    } catch (Exception unused3) {
                                    }
                                } catch (Exception unused4) {
                                    str = str;
                                    if (g8Var2.b()) {
                                    }
                                    while (r7 < r5) {
                                    }
                                    float f23 = f14;
                                    i12 = g8Var2.H;
                                    if (i12 == 1) {
                                    }
                                    z12 = true;
                                    if (!g8Var2.b()) {
                                    }
                                    B = c2Var.B();
                                    if (B == null) {
                                    }
                                    z13 = z12;
                                    j12 = j10;
                                    it3 = it2;
                                    min = f15;
                                }
                            } catch (Exception unused5) {
                            }
                            if (g8Var2.b()) {
                                g8Var2.a();
                            }
                            for (f8 f8Var10 : g8Var2.s) {
                                z12 |= f8Var10.b(f14);
                            }
                            float f232 = f14;
                            i12 = g8Var2.H;
                            if (i12 == 1) {
                                float t10 = Utilities.t(f8Var8.a + g8Var2.n.a, f8Var7.a + g8Var2.o.a, f8Var8.b, f8Var7.b);
                                if (g8Var2.M || f8Var2.a >= 0.36f || t10 >= org.telegram.messenger.i0.L(24.0f)) {
                                    f20 = 0.35f;
                                } else {
                                    g8Var2.M = true;
                                    ArrayList arrayList = h8Var.n;
                                    float f24 = f8Var8.b;
                                    f20 = 0.35f;
                                    float f25 = f8Var7.b;
                                    d8 d8Var = new d8();
                                    d8Var.a = f24;
                                    d8Var.b = f25;
                                    arrayList.add(d8Var);
                                }
                                if (g8Var2.L || f8Var2.a >= 0.22f || t10 >= org.telegram.messenger.i0.L(12.0f)) {
                                    f21 = t10;
                                    c2Var = c2Var2;
                                    f22 = 1.4f;
                                } else {
                                    g8Var2.L = true;
                                    f8 f8Var11 = g8Var2.p;
                                    f8Var11.a(1.0f);
                                    f8Var11.b = 0.0f;
                                    f8 f8Var12 = h8Var.P;
                                    boolean z15 = g8Var2.P;
                                    float f26 = z15 ? 420.0f : 260.0f;
                                    float f27 = z15 ? 0.38f : 0.85f;
                                    f8Var12.d = f26;
                                    f8Var12.e = f27;
                                    f8Var12.c -= z15 ? 0.75f : 0.28f;
                                    float f28 = z15 ? 3.4f : 1.4f;
                                    f8 f8Var13 = h8Var.Q;
                                    float f29 = f8Var13.c;
                                    float f30 = f8Var8.b;
                                    f22 = 1.4f;
                                    f8Var13.c = (((f30 / h8Var.Y0) - 0.5f) * 2.0f * f28) + f29;
                                    f8 f8Var14 = h8Var.R;
                                    float f31 = f8Var14.c;
                                    float f32 = f8Var7.b;
                                    f21 = t10;
                                    f8Var14.c = (((f32 / h8Var.Z0) - 0.5f) * 2.0f * f28) + f31;
                                    if (z15) {
                                        Random random = new Random();
                                        int i13 = 0;
                                        while (i13 < 14) {
                                            e8 e8Var = new e8();
                                            ag.c2 c2Var3 = c2Var2;
                                            float nextFloat = (random.nextFloat() * f20) + ((float) ((i13 / 14.0f) * 3.141592653589793d * 2.0d));
                                            Random random2 = random;
                                            float nextFloat2 = (random.nextFloat() * org.telegram.messenger.i0.L(180.0f)) + org.telegram.messenger.i0.L(265.0f);
                                            e8Var.a = f30;
                                            e8Var.b = f32;
                                            double d = nextFloat;
                                            e8Var.c = ((float) Math.cos(d)) * nextFloat2;
                                            e8Var.d = ((float) Math.sin(d)) * nextFloat2;
                                            e8Var.e = (random2.nextFloat() * org.telegram.messenger.i0.L(1.1f)) + org.telegram.messenger.i0.L(0.8f);
                                            e8Var.f = (random2.nextFloat() * f20) + 0.7f;
                                            e8Var.g = random2.nextFloat() * 360.0f;
                                            h8Var.S.add(e8Var);
                                            i13++;
                                            random = random2;
                                            c2Var2 = c2Var3;
                                        }
                                    }
                                    c2Var = c2Var2;
                                    if (str.equals(h8Var.Q0)) {
                                        h8Var.X(g8Var2, false);
                                        h8Var.Q0 = null;
                                    }
                                }
                                if (!g8Var2.Q && g8Var2.k.a < 0.3f) {
                                    g8Var2.Q = true;
                                    f8Var6.c -= f22;
                                    h8Var.performHapticFeedback(3);
                                }
                                if (g8Var2.Q && f21 < 0.5f && Math.abs(f8Var6.a - 1.0f) < 0.004f && Math.abs(f8Var6.c) < 0.02f) {
                                    g8Var2.H = 2;
                                    f8Var8.a(f8Var8.b);
                                    f8Var7.a(f8Var7.b);
                                }
                                f15 = f232;
                            } else {
                                c2Var = c2Var2;
                                if (i12 == 4) {
                                    float f33 = 1.0f;
                                    float e = org.telegram.ui.Cells.f1.e(f232, g8Var2.b0, g8Var2.W, 1.0f);
                                    g8Var2.W = e;
                                    float f34 = 1.0f - e;
                                    float f35 = 1.0f - (f34 * f34);
                                    u7 j15 = h8Var.j(g8Var2);
                                    float l4 = Utilities.l(e / 0.5f);
                                    if (j15 != null) {
                                        f17 = 0.28f;
                                        f16 = e;
                                        f33 = 1.0f;
                                        f18 = org.telegram.messenger.i0.T1(g8Var2.c0, 1.0f, c3.i0.D(l4, 2.0f, 3.0f, l4 * l4));
                                    } else {
                                        f16 = e;
                                        f17 = 0.28f;
                                        f18 = 1.0f;
                                    }
                                    if (j15 != null) {
                                        j15.setScaleX(f18);
                                        j15.setScaleY(f18);
                                    }
                                    RectF Z2 = h8Var.Z(g8Var2);
                                    if (Z2 == null) {
                                        f8Var6.a((f33 - f35) * g8Var2.Z);
                                        u7Var4 = j15;
                                        f15 = f232;
                                        f19 = 1.0f;
                                    } else {
                                        float sin = (float) Math.sin(f35 * 3.141592653589793d);
                                        f15 = f232;
                                        u7Var4 = j15;
                                        float min2 = Math.min(org.telegram.messenger.i0.L(90.0f), Utilities.t(Z2.centerX(), Z2.centerY(), g8Var2.X, g8Var2.Y) * f17);
                                        f8Var8.a(org.telegram.messenger.i0.T1(g8Var2.X, Z2.centerX(), f35));
                                        f8Var7.a(org.telegram.messenger.i0.T1(g8Var2.Y, Z2.centerY(), f35) - ((((1.0f - f35) * 2.0f) * f35) * min2));
                                        f8Var6.a(org.telegram.messenger.i0.T1(1.0f, f18, f35) * c3.i0.C(sin, 0.05f, 1.0f, org.telegram.messenger.i0.T1(g8Var2.Z, (h8Var.f(g8Var2) * (Z2.width() / f18)) / h8Var.U(), f35)));
                                        f8Var2.a(sin * 0.8f);
                                        float f36 = g8Var2.a0;
                                        f8Var4.a((h8.c(-f36) * f35) + f36);
                                        f19 = 1.0f;
                                        f8Var.a(Utilities.l(1.0f - ((f35 - 0.35f) / 0.4f)));
                                    }
                                    if (f16 >= f19) {
                                        h8Var.g(g8Var2);
                                        if (u7Var4 != null) {
                                            u7Var4.animate().scaleX(0.955f).scaleY(0.955f).setDuration(70L).setInterpolator(null).withEndAction(new x7(u7Var4, 1)).start();
                                        }
                                    }
                                } else {
                                    f15 = f232;
                                    if (i12 == 5) {
                                        if (f8Var6.a < 0.03f) {
                                            h8Var.g(g8Var2);
                                        }
                                    }
                                    if (!g8Var2.b()) {
                                        g8Var2.R = true;
                                    } else if (g8Var2.H == 0) {
                                        g8Var2.R = false;
                                    }
                                    B = c2Var.B();
                                    if (B == null && B.k0) {
                                        bi0 B2 = c2Var.B();
                                        int i14 = B2 == null ? 0 : B2.a0;
                                        if (i14 >= 2) {
                                            g8Var2.T = true;
                                        }
                                        boolean z16 = g8Var2.S && !g8Var2.T && g8Var2.H == 2;
                                        if (g8Var2.l.b == 0.0f && !z16 && B2 != null && i14 < 2) {
                                            c2Var.Q0();
                                            c2Var.u0 = false;
                                            g8Var2.S = false;
                                        }
                                        z13 = true;
                                    } else {
                                        z13 = z12;
                                    }
                                    j12 = j10;
                                    it3 = it2;
                                    min = f15;
                                }
                            }
                            z12 = true;
                            if (!g8Var2.b()) {
                            }
                            B = c2Var.B();
                            if (B == null) {
                            }
                            z13 = z12;
                            j12 = j10;
                            it3 = it2;
                            min = f15;
                        }
                    }
                    f14 = min;
                }
                f8Var = f8Var3;
                f8Var2 = f8Var5;
                if (g8Var2.b()) {
                }
                while (r7 < r5) {
                }
                float f2322 = f14;
                i12 = g8Var2.H;
                if (i12 == 1) {
                }
                z12 = true;
                if (!g8Var2.b()) {
                }
                B = c2Var.B();
                if (B == null) {
                }
                z13 = z12;
                j12 = j10;
                it3 = it2;
                min = f15;
            }
            float f37 = min;
            boolean z17 = z13;
            f8 f8Var15 = h8Var.q1;
            f8 f8Var16 = h8Var.p1;
            boolean z18 = h8Var.b;
            if (!z18) {
                if (h8Var.h1) {
                    g8 g8Var3 = h8Var.k1;
                    if (g8Var3 != null && g8Var3.H == 0 && (j11 = h8Var.j(g8Var3)) != null && h8Var.z(j11) && h8.b(h8Var.k1)) {
                        g8Var = h8Var.k1;
                    } else {
                        ArrayList arrayList2 = h8Var.h;
                        int size4 = arrayList2.size();
                        int i15 = 0;
                        float f38 = 0.0f;
                        float f39 = 0.0f;
                        g8 g8Var4 = null;
                        while (i15 < size4) {
                            Object obj = arrayList2.get(i15);
                            i15++;
                            u7 u7Var5 = (u7) obj;
                            g8 g8Var5 = (g8) h8Var.f.get(u7Var5.w0.address);
                            if (g8Var5 != null && g8Var5.H == 0 && h8.b(g8Var5) && u7Var5.isAttachedToWindow() && h8Var.z(u7Var5) && (Z = h8Var.Z(g8Var5)) != null) {
                                if (g8Var4 != null) {
                                    float f40 = Z.top;
                                    if (f40 >= f38 - 1.0f) {
                                        if (Math.abs(f40 - f38) <= 1.0f && Z.left < f39) {
                                        }
                                    }
                                }
                                f38 = Z.top;
                                f39 = Z.left;
                                g8Var4 = g8Var5;
                            }
                        }
                        g8Var = g8Var4;
                    }
                    if (g8Var != null && g8Var != h8Var.k1) {
                        h8Var.k1 = g8Var;
                        h8Var.m1 = null;
                        h8Var.n1 = 0.0f;
                    }
                }
                g8 g8Var6 = h8Var.k1;
                u7 j16 = g8Var6 == null ? null : h8Var.j(g8Var6);
                boolean z19 = h8Var.h1 && g8Var6 != null && g8Var6.H == 0 && h8.b(g8Var6) && j16 != null && h8Var.z(j16) && !h8Var.s0 && !h8Var.p0;
                if (g8Var6 != null && (z19 || h8Var.i1)) {
                    g8Var6.a();
                    if (h8Var.m1 == null && g8Var6.u != null) {
                        h8Var.m1 = h8Var.x(g8Var6, h8Var.Y0 * 0.6f, h8Var.Z0 * 0.68f, true);
                        g8Var6.N = false;
                    }
                }
                f8Var16.b = z19 ? 1.0f : 0.0f;
                f8Var15.b = ((!z19 && !h8Var.i1) || h8Var.m1 == null || h8.H(g8Var6) == null) ? 0.0f : 1.0f;
                f7 = f37;
                boolean b12 = f8Var16.b(f7) | f8Var15.b(f7);
                float f41 = f8Var16.a;
                boolean z20 = f41 > 0.002f || f8Var15.a > 0.002f;
                if (z20) {
                    h8Var.n1 += f7;
                } else {
                    h8Var.n1 = 0.0f;
                    if (!h8Var.h1 && !h8Var.i1) {
                        u7Var = null;
                        h8Var.m1 = null;
                        if (g8Var6 != null && g8Var6.H == 0 && g8Var6.v != null && f41 > 0.002f) {
                            D = h8Var.D(h8Var.n1 % 2.0f);
                            if (Utilities.l(f8Var16.a) * Math.max(D[0], Math.max(D[1], D[2])) >= 0.003f) {
                                u7Var2 = j16;
                                u7Var3 = h8Var.l1;
                                if (u7Var3 != null && u7Var3 != u7Var2) {
                                    g9Var = u7Var3.D;
                                    if (g9Var.getAlpha() != 1.0f) {
                                        g9Var.setAlpha(1.0f);
                                    }
                                    u7Var3.invalidate();
                                }
                                h8Var.l1 = u7Var2;
                                if (u7Var2 != null) {
                                    org.telegram.ui.Components.g9 g9Var2 = u7Var2.D;
                                    if (g9Var2.getAlpha() != 0.0f) {
                                        g9Var2.setAlpha(0.0f);
                                    }
                                    u7Var2.invalidate();
                                }
                                u7 u7Var6 = (z19 || f8Var16.a <= 0.5f) ? u7Var : j16;
                                RectF rectF = h8Var.v1;
                                if (h8Var.getParent() instanceof ViewGroup) {
                                    RectF Z3 = u7Var6 == null ? u7Var : h8Var.Z(h8Var.k1);
                                    if (Z3 != null) {
                                        vh.p2 p2Var = h8Var.w1;
                                        if (p2Var == null) {
                                            h8Var.w1 = h8Var.B(2131743131, true);
                                        } else if (h8Var.j1 && !(z11 = p2Var.V)) {
                                            h8Var.j1 = false;
                                            h8Var.i1 = false;
                                            h8Var.h1 = false;
                                            if (z11) {
                                                p2Var.e(true);
                                            }
                                            if (!z18) {
                                                vp.d1().edit().putBoolean("walletcardstickerhint", true).apply();
                                            }
                                            h8Var.f0();
                                        }
                                        h8.J(h8Var.w1, Z3.centerX(), Z3.top + org.telegram.messenger.i0.L(4.0f));
                                        vh.p2 p2Var2 = h8Var.w1;
                                        if (!p2Var2.V) {
                                            p2Var2.u();
                                        }
                                        h8Var.j1 = true;
                                    } else {
                                        h8Var.j1 = false;
                                        vh.p2 p2Var3 = h8Var.w1;
                                        if (p2Var3 != null && p2Var3.V) {
                                            p2Var3.e(true);
                                        }
                                    }
                                    if (h8Var.i1 && f8Var15.a > 0.5f && (cVar = h8Var.d) != null && cVar.L() && h8Var.C()) {
                                        if (h8Var.x1 == null) {
                                            h8Var.x1 = h8Var.B(2131743132, false);
                                        }
                                        h8Var.u1.computeBounds(rectF, true);
                                        float[] L = h8Var.L(rectF.centerX(), rectF.top);
                                        if ((L[1] - org.telegram.messenger.i0.L(2.0f)) - org.telegram.messenger.i0.L(56.0f) < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m) {
                                            float[] L2 = h8Var.L(rectF.centerX(), rectF.bottom);
                                            vh.p2 p2Var4 = h8Var.x1;
                                            float f42 = L2[0];
                                            float L3 = L2[1] + org.telegram.messenger.i0.L(2.0f);
                                            h8.o(p2Var4, 1);
                                            p2Var4.m(0.0f, f42 - p2Var4.getPaddingLeft());
                                            p2Var4.setTranslationY(L3);
                                            p2Var4.invalidate();
                                        } else {
                                            h8.J(h8Var.x1, L[0], L[1] - org.telegram.messenger.i0.L(2.0f));
                                        }
                                        vh.p2 p2Var5 = h8Var.x1;
                                        if (!p2Var5.V) {
                                            p2Var5.u();
                                        }
                                    } else {
                                        vh.p2 p2Var6 = h8Var.x1;
                                        if (p2Var6 != null && p2Var6.V) {
                                            p2Var6.e(true);
                                        }
                                    }
                                }
                                if (!b12 || z20) {
                                    z10 = true;
                                    boolean z21 = z17 | z10;
                                    for (size = h8Var.S.size() - 1; size >= 0; size--) {
                                        e8 e8Var2 = (e8) h8Var.S.get(size);
                                        e8Var2.h += f7;
                                        float exp = (float) Math.exp((-2.4f) * f7);
                                        float f43 = e8Var2.c * exp;
                                        e8Var2.c = f43;
                                        float f44 = e8Var2.d * exp;
                                        e8Var2.d = f44;
                                        e8Var2.a = (f43 * f7) + e8Var2.a;
                                        e8Var2.b = (f44 * f7) + e8Var2.b;
                                        e8Var2.g = (f7 * 90.0f) + e8Var2.g;
                                        if (e8Var2.h >= e8Var2.f) {
                                            h8Var.S.remove(size);
                                        }
                                    }
                                    if (!h8Var.S.isEmpty()) {
                                        z21 = true;
                                    }
                                    for (size2 = h8Var.n.size() - 1; size2 >= 0; size2--) {
                                        d8 d8Var2 = (d8) h8Var.n.get(size2);
                                        float f45 = d8Var2.c + f7;
                                        d8Var2.c = f45;
                                        if (f45 > 0.42f) {
                                            h8Var.n.remove(size2);
                                        }
                                    }
                                    f10 = h8Var.U0;
                                    if (f10 < 1.0f) {
                                        h8Var.U0 = org.telegram.ui.Cells.f1.e(f7, h8Var.X0 ? 0.45f : 1.2f, f10, 1.0f);
                                        h8Var.e();
                                        z21 = true;
                                    }
                                    it = h8Var.f.values().iterator();
                                    boolean z22 = false;
                                    while (it.hasNext()) {
                                        if (((g8) it.next()).H == 5) {
                                            z22 = true;
                                        }
                                    }
                                    f8 f8Var17 = h8Var.N;
                                    f8Var17.b = ((!h8Var.m0 && h8Var.o0 && f8Var17.b > 0.0f) || z22 || h8Var.f0) ? 1.0f : 0.0f;
                                    f8 f8Var18 = h8Var.O;
                                    boolean z23 = h8Var.t0;
                                    f8Var18.b = (!z23 || z22 || h8Var.f0) ? 1.0f : 0.0f;
                                    if (h8Var.f0) {
                                        f11 = 0.0f;
                                        f8 f8Var19 = h8Var.c0;
                                        f8Var19.b = z23 ? 28.0f : 0.0f;
                                        b10 = z21 | f8Var19.b(f7);
                                    } else {
                                        f8 f8Var20 = h8Var.c0;
                                        f8Var20.a(Math.min(66.0f, (f7 * 60.0f) + f8Var20.a));
                                        f8 f8Var21 = h8Var.c0;
                                        if (f8Var21.a >= 66.0f) {
                                            h8Var.f0 = false;
                                            f11 = 0.0f;
                                            f8Var21.a(0.0f);
                                        } else {
                                            f11 = 0.0f;
                                        }
                                        b10 = true;
                                    }
                                    b11 = b10 | h8Var.N.b(f7) | h8Var.O.b(f7) | h8Var.P.b(f7) | h8Var.Q.b(f7) | h8Var.R.b(f7);
                                    h8Var.c.setStickerImpact(h8Var.P.a);
                                    l6Var = h8Var.c;
                                    float max = Math.max(-1.0f, Math.min(1.0f, h8Var.Q.a));
                                    float max2 = Math.max(-1.0f, Math.min(1.0f, h8Var.R.a));
                                    if (l6Var.b0 != 0) {
                                        m.p3 p3Var = new m.p3();
                                        float[] fArr2 = new float[8];
                                        p3Var.c(1000, 600, 0.0f, 5.0f, false, fArr2);
                                        l6Var.c0 = Math.hypot((double) (fArr2[2] - fArr2[4]), (double) (fArr2[3] - fArr2[5])) < Math.hypot((double) (fArr2[0] - fArr2[6]), (double) (fArr2[1] - fArr2[7])) ? 1 : -1;
                                        p3Var.c(1000, 600, 5.0f, 0.0f, false, fArr2);
                                        i10 = 0;
                                        l6Var.b0 = Math.hypot((double) (fArr2[4] - fArr2[6]), (double) (fArr2[5] - fArr2[7])) < Math.hypot((double) (fArr2[0] - fArr2[2]), (double) (fArr2[1] - fArr2[3])) ? 1 : -1;
                                    } else {
                                        i10 = 0;
                                    }
                                    f12 = l6Var.b0 * max2 * 10.0f;
                                    f13 = l6Var.c0 * max * 10.0f;
                                    g6Var = l6Var.D;
                                    if (g6Var.l0 == f12 || g6Var.m0 != f13) {
                                        g6Var.l0 = f12;
                                        g6Var.m0 = f13;
                                        g6Var.b(g6Var.c0, g6Var.f0);
                                    }
                                    h8Var.a0 = h8Var.c.getCardRotationX();
                                    h8Var.b0 = h8Var.c.getCardRotationY();
                                    ArrayList arrayList3 = h8Var.h;
                                    size3 = arrayList3.size();
                                    i11 = i10;
                                    while (i11 < size3) {
                                        Object obj2 = arrayList3.get(i11);
                                        i11++;
                                        u7 u7Var7 = (u7) obj2;
                                        g8 g8Var7 = (g8) h8Var.f.get(u7Var7.w0.address);
                                        if (g8Var7 != null) {
                                            u7Var7.k(g8Var7.R, true, g8Var7.H == 0 ? f11 : 1.0f);
                                        }
                                    }
                                    h8Var.invalidate();
                                    h8Var.L.invalidate();
                                    h8Var.M.invalidate();
                                    if (b11 && h8Var.n.isEmpty() && !h8Var.p0) {
                                        h8Var.M0 = j10;
                                        return;
                                    }
                                    h8Var.postOnAnimation(this);
                                }
                            }
                        }
                        u7Var2 = u7Var;
                        u7Var3 = h8Var.l1;
                        if (u7Var3 != null) {
                            g9Var = u7Var3.D;
                            if (g9Var.getAlpha() != 1.0f) {
                            }
                            u7Var3.invalidate();
                        }
                        h8Var.l1 = u7Var2;
                        if (u7Var2 != null) {
                        }
                        if (z19) {
                        }
                        RectF rectF2 = h8Var.v1;
                        if (h8Var.getParent() instanceof ViewGroup) {
                        }
                        if (!b12) {
                        }
                        z10 = true;
                        boolean z212 = z17 | z10;
                        while (size >= 0) {
                        }
                        if (!h8Var.S.isEmpty()) {
                        }
                        while (size2 >= 0) {
                        }
                        f10 = h8Var.U0;
                        if (f10 < 1.0f) {
                        }
                        it = h8Var.f.values().iterator();
                        boolean z222 = false;
                        while (it.hasNext()) {
                        }
                        f8 f8Var172 = h8Var.N;
                        f8Var172.b = ((!h8Var.m0 && h8Var.o0 && f8Var172.b > 0.0f) || z222 || h8Var.f0) ? 1.0f : 0.0f;
                        f8 f8Var182 = h8Var.O;
                        boolean z232 = h8Var.t0;
                        f8Var182.b = (!z232 || z222 || h8Var.f0) ? 1.0f : 0.0f;
                        if (h8Var.f0) {
                        }
                        b11 = b10 | h8Var.N.b(f7) | h8Var.O.b(f7) | h8Var.P.b(f7) | h8Var.Q.b(f7) | h8Var.R.b(f7);
                        h8Var.c.setStickerImpact(h8Var.P.a);
                        l6Var = h8Var.c;
                        float max3 = Math.max(-1.0f, Math.min(1.0f, h8Var.Q.a));
                        float max22 = Math.max(-1.0f, Math.min(1.0f, h8Var.R.a));
                        if (l6Var.b0 != 0) {
                        }
                        f12 = l6Var.b0 * max22 * 10.0f;
                        f13 = l6Var.c0 * max3 * 10.0f;
                        g6Var = l6Var.D;
                        if (g6Var.l0 == f12) {
                        }
                        g6Var.l0 = f12;
                        g6Var.m0 = f13;
                        g6Var.b(g6Var.c0, g6Var.f0);
                        h8Var.a0 = h8Var.c.getCardRotationX();
                        h8Var.b0 = h8Var.c.getCardRotationY();
                        ArrayList arrayList32 = h8Var.h;
                        size3 = arrayList32.size();
                        i11 = i10;
                        while (i11 < size3) {
                        }
                        h8Var.invalidate();
                        h8Var.L.invalidate();
                        h8Var.M.invalidate();
                        if (b11) {
                        }
                        h8Var.postOnAnimation(this);
                    }
                }
                u7Var = null;
                if (g8Var6 != null) {
                    D = h8Var.D(h8Var.n1 % 2.0f);
                    if (Utilities.l(f8Var16.a) * Math.max(D[0], Math.max(D[1], D[2])) >= 0.003f) {
                    }
                }
                u7Var2 = u7Var;
                u7Var3 = h8Var.l1;
                if (u7Var3 != null) {
                }
                h8Var.l1 = u7Var2;
                if (u7Var2 != null) {
                }
                if (z19) {
                }
                RectF rectF22 = h8Var.v1;
                if (h8Var.getParent() instanceof ViewGroup) {
                }
                if (!b12) {
                }
                z10 = true;
                boolean z2122 = z17 | z10;
                while (size >= 0) {
                }
                if (!h8Var.S.isEmpty()) {
                }
                while (size2 >= 0) {
                }
                f10 = h8Var.U0;
                if (f10 < 1.0f) {
                }
                it = h8Var.f.values().iterator();
                boolean z2222 = false;
                while (it.hasNext()) {
                }
                f8 f8Var1722 = h8Var.N;
                f8Var1722.b = ((!h8Var.m0 && h8Var.o0 && f8Var1722.b > 0.0f) || z2222 || h8Var.f0) ? 1.0f : 0.0f;
                f8 f8Var1822 = h8Var.O;
                boolean z2322 = h8Var.t0;
                f8Var1822.b = (!z2322 || z2222 || h8Var.f0) ? 1.0f : 0.0f;
                if (h8Var.f0) {
                }
                b11 = b10 | h8Var.N.b(f7) | h8Var.O.b(f7) | h8Var.P.b(f7) | h8Var.Q.b(f7) | h8Var.R.b(f7);
                h8Var.c.setStickerImpact(h8Var.P.a);
                l6Var = h8Var.c;
                float max32 = Math.max(-1.0f, Math.min(1.0f, h8Var.Q.a));
                float max222 = Math.max(-1.0f, Math.min(1.0f, h8Var.R.a));
                if (l6Var.b0 != 0) {
                }
                f12 = l6Var.b0 * max222 * 10.0f;
                f13 = l6Var.c0 * max32 * 10.0f;
                g6Var = l6Var.D;
                if (g6Var.l0 == f12) {
                }
                g6Var.l0 = f12;
                g6Var.m0 = f13;
                g6Var.b(g6Var.c0, g6Var.f0);
                h8Var.a0 = h8Var.c.getCardRotationX();
                h8Var.b0 = h8Var.c.getCardRotationY();
                ArrayList arrayList322 = h8Var.h;
                size3 = arrayList322.size();
                i11 = i10;
                while (i11 < size3) {
                }
                h8Var.invalidate();
                h8Var.L.invalidate();
                h8Var.M.invalidate();
                if (b11) {
                }
                h8Var.postOnAnimation(this);
            }
            f7 = f37;
            z10 = false;
            boolean z21222 = z17 | z10;
            while (size >= 0) {
            }
            if (!h8Var.S.isEmpty()) {
            }
            while (size2 >= 0) {
            }
            f10 = h8Var.U0;
            if (f10 < 1.0f) {
            }
            it = h8Var.f.values().iterator();
            boolean z22222 = false;
            while (it.hasNext()) {
            }
            f8 f8Var17222 = h8Var.N;
            f8Var17222.b = ((!h8Var.m0 && h8Var.o0 && f8Var17222.b > 0.0f) || z22222 || h8Var.f0) ? 1.0f : 0.0f;
            f8 f8Var18222 = h8Var.O;
            boolean z23222 = h8Var.t0;
            f8Var18222.b = (!z23222 || z22222 || h8Var.f0) ? 1.0f : 0.0f;
            if (h8Var.f0) {
            }
            b11 = b10 | h8Var.N.b(f7) | h8Var.O.b(f7) | h8Var.P.b(f7) | h8Var.Q.b(f7) | h8Var.R.b(f7);
            h8Var.c.setStickerImpact(h8Var.P.a);
            l6Var = h8Var.c;
            float max322 = Math.max(-1.0f, Math.min(1.0f, h8Var.Q.a));
            float max2222 = Math.max(-1.0f, Math.min(1.0f, h8Var.R.a));
            if (l6Var.b0 != 0) {
            }
            f12 = l6Var.b0 * max2222 * 10.0f;
            f13 = l6Var.c0 * max322 * 10.0f;
            g6Var = l6Var.D;
            if (g6Var.l0 == f12) {
            }
            g6Var.l0 = f12;
            g6Var.m0 = f13;
            g6Var.b(g6Var.c0, g6Var.f0);
            h8Var.a0 = h8Var.c.getCardRotationX();
            h8Var.b0 = h8Var.c.getCardRotationY();
            ArrayList arrayList3222 = h8Var.h;
            size3 = arrayList3222.size();
            i11 = i10;
            while (i11 < size3) {
            }
            h8Var.invalidate();
            h8Var.L.invalidate();
            h8Var.M.invalidate();
            if (b11) {
            }
            h8Var.postOnAnimation(this);
        }
    }
}
