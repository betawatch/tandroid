package org.telegram.ui.Wallet;

import android.graphics.RectF;
import android.os.SystemClock;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.np;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ch0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class x7 implements Runnable {
    public final /* synthetic */ c8 a;

    public x7(c8 c8Var) {
        this.a = c8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0162 A[LOOP:1: B:21:0x0160->B:22:0x0162, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x08c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0a00  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0a2c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0a61  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x09ea  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x08fb  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0674 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x07dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x049c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j3;
        float f10;
        p7 p7Var;
        p7 p7Var2;
        p7 p7Var3;
        boolean z10;
        k8.a aVar;
        boolean z11;
        org.telegram.ui.Components.i9 i9Var;
        float[] D;
        b8 b8Var;
        RectF Z;
        p7 j10;
        int size;
        int size2;
        float f11;
        Iterator it;
        float f12;
        boolean b10;
        boolean b11;
        h6 h6Var;
        int i7;
        float f13;
        float f14;
        c6 c6Var;
        int size3;
        int i10;
        Iterator it2;
        String string;
        boolean z12;
        float f15;
        a8 a8Var;
        a8 a8Var2;
        boolean optBoolean;
        int i11;
        fi.u2 u2Var;
        float f16;
        float f17;
        float f18;
        float f19;
        p7 p7Var4;
        float f20;
        ch0 B;
        float f21;
        float f22;
        a8 a8Var3;
        float f23;
        c8 c8Var = this.a;
        if (c8Var.b1 || !c8Var.isAttachedToWindow()) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j11 = 0;
        float min = c8Var.N0 == 0 ? 0.016666668f : Math.min(0.032f, (uptimeMillis - r4) / 1000.0f);
        c8Var.N0 = uptimeMillis;
        if (c8Var.A()) {
            Iterator it3 = c8Var.f.values().iterator();
            boolean z13 = false;
            while (true) {
                j3 = j11;
                if (!it3.hasNext()) {
                    break;
                }
                b8 b8Var2 = (b8) it3.next();
                boolean z14 = b8Var2.K;
                a8 a8Var4 = b8Var2.m;
                a8 a8Var5 = b8Var2.i;
                String str = b8Var2.a;
                a8 a8Var6 = b8Var2.j;
                fi.u2 u2Var2 = b8Var2.c;
                a8 a8Var7 = b8Var2.g;
                a8 a8Var8 = b8Var2.f;
                a8 a8Var9 = b8Var2.e;
                a8 a8Var10 = b8Var2.h;
                if (z14) {
                    it2 = it3;
                    f15 = min;
                    z12 = z13;
                } else {
                    b8Var2.K = true;
                    if (c8Var.b) {
                        it2 = it3;
                        string = null;
                    } else {
                        it2 = it3;
                        string = c8Var.e.getString(str, null);
                    }
                    if (c8Var.c1 != null) {
                        TL_wallet.cardSticker R = c8Var.R(str);
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
                                c8Var.K(b8Var2, mediaAreaCoordinates, optBoolean);
                            }
                            optBoolean = false;
                            c8Var.K(b8Var2, mediaAreaCoordinates, optBoolean);
                        } else {
                            z12 = z13;
                        }
                    } else {
                        z12 = z13;
                        if (string != null) {
                            try {
                                JSONObject jSONObject = new JSONObject(string);
                                f15 = min;
                                try {
                                    a8Var10.a((float) jSONObject.optDouble("s", 1.0d));
                                    a8Var = a8Var4;
                                    a8Var2 = a8Var6;
                                } catch (Exception unused2) {
                                    a8Var = a8Var4;
                                    a8Var2 = a8Var6;
                                }
                                try {
                                    a8Var5.a((float) jSONObject.optDouble("r", 0.0d));
                                    b8Var2.N = jSONObject.optBoolean("q");
                                    float[] fArr = {((float) jSONObject.getDouble("x")) * c8Var.Z0, ((float) jSONObject.getDouble("y")) * c8Var.a1, a8Var10.b};
                                    a8Var9.a(fArr[0]);
                                    a8Var8.a(fArr[1]);
                                    a8Var10.a(fArr[2]);
                                    b8Var2.H = 2;
                                    long j12 = c8Var.O0 + 1;
                                    c8Var.O0 = j12;
                                    b8Var2.I = j12;
                                    a8Var.a(1.0f);
                                    if (b8Var2.J == j3) {
                                        long j13 = c8Var.S0 + 1;
                                        c8Var.S0 = j13;
                                        b8Var2.J = j13;
                                    }
                                    str = str;
                                    try {
                                        if (str.equals(c8Var.Q0)) {
                                            c8Var.U0 = b8Var2;
                                            c8Var.T0 = b8Var2;
                                            c8Var.V0 = 1.0f;
                                            c8Var.e();
                                        }
                                    } catch (Exception unused3) {
                                    }
                                } catch (Exception unused4) {
                                    str = str;
                                    if (b8Var2.b()) {
                                    }
                                    while (r7 < r5) {
                                    }
                                    float f24 = f15;
                                    i11 = b8Var2.H;
                                    if (i11 == 1) {
                                    }
                                    z12 = true;
                                    if (!b8Var2.b()) {
                                    }
                                    B = u2Var.B();
                                    if (B == null) {
                                    }
                                    z13 = z12;
                                    j11 = j3;
                                    it3 = it2;
                                    min = f16;
                                }
                            } catch (Exception unused5) {
                            }
                            if (b8Var2.b()) {
                                b8Var2.a();
                            }
                            for (a8 a8Var11 : b8Var2.s) {
                                z12 |= a8Var11.b(f15);
                            }
                            float f242 = f15;
                            i11 = b8Var2.H;
                            if (i11 == 1) {
                                float t6 = Utilities.t(a8Var9.a + b8Var2.n.a, a8Var8.a + b8Var2.o.a, a8Var9.b, a8Var8.b);
                                if (b8Var2.M || a8Var2.a >= 0.36f || t6 >= org.telegram.messenger.g0.L(24.0f)) {
                                    f21 = 0.28f;
                                } else {
                                    b8Var2.M = true;
                                    ArrayList arrayList = c8Var.n;
                                    float f25 = a8Var9.b;
                                    f21 = 0.28f;
                                    float f26 = a8Var8.b;
                                    y7 y7Var = new y7();
                                    y7Var.a = f25;
                                    y7Var.b = f26;
                                    arrayList.add(y7Var);
                                }
                                if (b8Var2.L || a8Var2.a >= 0.22f || t6 >= org.telegram.messenger.g0.L(12.0f)) {
                                    f22 = t6;
                                    a8Var3 = a8Var8;
                                    f23 = 1.4f;
                                } else {
                                    b8Var2.L = true;
                                    a8 a8Var12 = b8Var2.p;
                                    a8Var12.a(1.0f);
                                    a8Var12.b = 0.0f;
                                    a8 a8Var13 = c8Var.Q;
                                    boolean z15 = b8Var2.P;
                                    float f27 = z15 ? 420.0f : 260.0f;
                                    float f28 = z15 ? 0.38f : 0.85f;
                                    a8Var13.d = f27;
                                    a8Var13.e = f28;
                                    a8Var13.c -= z15 ? 0.75f : f21;
                                    float f29 = z15 ? 3.4f : 1.4f;
                                    a8 a8Var14 = c8Var.R;
                                    float f30 = a8Var14.c;
                                    f23 = 1.4f;
                                    float f31 = a8Var9.b;
                                    a8Var14.c = (((f31 / c8Var.Z0) - 0.5f) * 2.0f * f29) + f30;
                                    a8 a8Var15 = c8Var.S;
                                    float f32 = a8Var15.c;
                                    float f33 = a8Var8.b;
                                    f22 = t6;
                                    a8Var15.c = (((f33 / c8Var.a1) - 0.5f) * 2.0f * f29) + f32;
                                    if (z15) {
                                        Random random = new Random();
                                        int i12 = 0;
                                        while (i12 < 14) {
                                            z7 z7Var = new z7();
                                            float g10 = org.telegram.ui.Cells.y0.g(random, 0.35f, (float) ((i12 / 14.0f) * 3.141592653589793d * 2.0d));
                                            float nextFloat = (random.nextFloat() * org.telegram.messenger.g0.L(180.0f)) + org.telegram.messenger.g0.L(265.0f);
                                            z7Var.a = f31;
                                            z7Var.b = f33;
                                            double d = g10;
                                            z7Var.c = ((float) Math.cos(d)) * nextFloat;
                                            z7Var.d = ((float) Math.sin(d)) * nextFloat;
                                            z7Var.e = (random.nextFloat() * org.telegram.messenger.g0.L(1.1f)) + org.telegram.messenger.g0.L(0.8f);
                                            z7Var.f = org.telegram.ui.Cells.y0.g(random, 0.35f, 0.7f);
                                            z7Var.g = random.nextFloat() * 360.0f;
                                            c8Var.T.add(z7Var);
                                            i12++;
                                            f31 = f31;
                                            a8Var8 = a8Var8;
                                        }
                                    }
                                    a8Var3 = a8Var8;
                                    if (str.equals(c8Var.R0)) {
                                        c8Var.X(b8Var2, false);
                                        c8Var.R0 = null;
                                    }
                                }
                                if (!b8Var2.Q && b8Var2.k.a < 0.3f) {
                                    b8Var2.Q = true;
                                    a8Var7.c -= f23;
                                    c8Var.performHapticFeedback(3);
                                }
                                if (b8Var2.Q && f22 < 0.5f && Math.abs(a8Var7.a - 1.0f) < 0.004f && Math.abs(a8Var7.c) < 0.02f) {
                                    b8Var2.H = 2;
                                    a8Var9.a(a8Var9.b);
                                    a8 a8Var16 = a8Var3;
                                    a8Var16.a(a8Var16.b);
                                }
                                u2Var = u2Var2;
                                f16 = f242;
                            } else if (i11 == 4) {
                                float e10 = org.telegram.ui.Cells.y0.e(f242, b8Var2.b0, b8Var2.W, 1.0f);
                                b8Var2.W = e10;
                                float f34 = 1.0f - e10;
                                float f35 = 1.0f - (f34 * f34);
                                p7 j14 = c8Var.j(b8Var2);
                                float l10 = Utilities.l(e10 / 0.5f);
                                if (j14 != null) {
                                    f17 = e10;
                                    f16 = f242;
                                    f18 = 1.0f;
                                    f19 = org.telegram.messenger.g0.T1(b8Var2.c0, 1.0f, com.google.android.gms.internal.vision.e2.C(l10, 2.0f, 3.0f, l10 * l10));
                                } else {
                                    f17 = e10;
                                    f18 = 1.0f;
                                    f16 = f242;
                                    f19 = 1.0f;
                                }
                                if (j14 != null) {
                                    j14.setScaleX(f19);
                                    j14.setScaleY(f19);
                                }
                                RectF Z2 = c8Var.Z(b8Var2);
                                if (Z2 == null) {
                                    a8Var7.a((f18 - f35) * b8Var2.Z);
                                    u2Var = u2Var2;
                                    p7Var4 = j14;
                                    f20 = 1.0f;
                                } else {
                                    float sin = (float) Math.sin(f35 * 3.141592653589793d);
                                    u2Var = u2Var2;
                                    p7Var4 = j14;
                                    float min2 = Math.min(org.telegram.messenger.g0.L(90.0f), Utilities.t(Z2.centerX(), Z2.centerY(), b8Var2.X, b8Var2.Y) * 0.28f);
                                    a8Var9.a(org.telegram.messenger.g0.T1(b8Var2.X, Z2.centerX(), f35));
                                    a8Var8.a(org.telegram.messenger.g0.T1(b8Var2.Y, Z2.centerY(), f35) - ((((1.0f - f35) * 2.0f) * f35) * min2));
                                    a8Var7.a(org.telegram.messenger.g0.T1(1.0f, f19, f35) * com.google.android.gms.internal.vision.e2.B(sin, 0.05f, 1.0f, org.telegram.messenger.g0.T1(b8Var2.Z, (c8Var.f(b8Var2) * (Z2.width() / f19)) / c8Var.U(), f35)));
                                    a8Var2.a(sin * 0.8f);
                                    float f36 = b8Var2.a0;
                                    a8Var5.a((c8.c(-f36) * f35) + f36);
                                    f20 = 1.0f;
                                    a8Var.a(Utilities.l(1.0f - ((f35 - 0.35f) / 0.4f)));
                                }
                                if (f17 >= f20) {
                                    c8Var.g(b8Var2);
                                    if (p7Var4 != null) {
                                        p7Var4.animate().scaleX(0.955f).scaleY(0.955f).setDuration(70L).setInterpolator(null).withEndAction(new s7(p7Var4, 1)).start();
                                    }
                                }
                            } else {
                                u2Var = u2Var2;
                                f16 = f242;
                                if (i11 == 5) {
                                    if (a8Var7.a < 0.03f) {
                                        c8Var.g(b8Var2);
                                    }
                                }
                                if (!b8Var2.b()) {
                                    b8Var2.R = true;
                                } else if (b8Var2.H == 0) {
                                    b8Var2.R = false;
                                }
                                B = u2Var.B();
                                if (B == null && B.l0) {
                                    ch0 B2 = u2Var.B();
                                    int i13 = B2 == null ? 0 : B2.b0;
                                    if (i13 >= 2) {
                                        b8Var2.T = true;
                                    }
                                    boolean z16 = b8Var2.S && !b8Var2.T && b8Var2.H == 2;
                                    if (b8Var2.l.b == 0.0f && !z16 && B2 != null && i13 < 2) {
                                        u2Var.Q0();
                                        u2Var.v0 = false;
                                        b8Var2.S = false;
                                    }
                                    z13 = true;
                                } else {
                                    z13 = z12;
                                }
                                j11 = j3;
                                it3 = it2;
                                min = f16;
                            }
                            z12 = true;
                            if (!b8Var2.b()) {
                            }
                            B = u2Var.B();
                            if (B == null) {
                            }
                            z13 = z12;
                            j11 = j3;
                            it3 = it2;
                            min = f16;
                        }
                    }
                    f15 = min;
                }
                a8Var = a8Var4;
                a8Var2 = a8Var6;
                if (b8Var2.b()) {
                }
                while (r7 < r5) {
                }
                float f2422 = f15;
                i11 = b8Var2.H;
                if (i11 == 1) {
                }
                z12 = true;
                if (!b8Var2.b()) {
                }
                B = u2Var.B();
                if (B == null) {
                }
                z13 = z12;
                j11 = j3;
                it3 = it2;
                min = f16;
            }
            float f37 = min;
            boolean z17 = z13;
            a8 a8Var17 = c8Var.r1;
            a8 a8Var18 = c8Var.q1;
            boolean z18 = c8Var.b;
            if (!z18) {
                if (c8Var.i1) {
                    b8 b8Var3 = c8Var.l1;
                    if (b8Var3 != null && b8Var3.H == 0 && (j10 = c8Var.j(b8Var3)) != null && c8Var.z(j10) && c8.b(c8Var.l1)) {
                        b8Var = c8Var.l1;
                    } else {
                        ArrayList arrayList2 = c8Var.h;
                        int size4 = arrayList2.size();
                        int i14 = 0;
                        float f38 = 0.0f;
                        float f39 = 0.0f;
                        b8 b8Var4 = null;
                        while (i14 < size4) {
                            Object obj = arrayList2.get(i14);
                            i14++;
                            p7 p7Var5 = (p7) obj;
                            b8 b8Var5 = (b8) c8Var.f.get(p7Var5.x0.address);
                            if (b8Var5 != null && b8Var5.H == 0 && c8.b(b8Var5) && p7Var5.isAttachedToWindow() && c8Var.z(p7Var5) && (Z = c8Var.Z(b8Var5)) != null) {
                                if (b8Var4 != null) {
                                    float f40 = Z.top;
                                    if (f40 >= f38 - 1.0f) {
                                        if (Math.abs(f40 - f38) <= 1.0f && Z.left < f39) {
                                        }
                                    }
                                }
                                f38 = Z.top;
                                f39 = Z.left;
                                b8Var4 = b8Var5;
                            }
                        }
                        b8Var = b8Var4;
                    }
                    if (b8Var != null && b8Var != c8Var.l1) {
                        c8Var.l1 = b8Var;
                        c8Var.n1 = null;
                        c8Var.o1 = 0.0f;
                    }
                }
                b8 b8Var6 = c8Var.l1;
                p7 j15 = b8Var6 == null ? null : c8Var.j(b8Var6);
                boolean z19 = c8Var.i1 && b8Var6 != null && b8Var6.H == 0 && c8.b(b8Var6) && j15 != null && c8Var.z(j15) && !c8Var.t0 && !c8Var.q0;
                if (b8Var6 != null && (z19 || c8Var.j1)) {
                    b8Var6.a();
                    if (c8Var.n1 == null && b8Var6.u != null) {
                        c8Var.n1 = c8Var.x(b8Var6, c8Var.Z0 * 0.6f, c8Var.a1 * 0.68f, true);
                        b8Var6.N = false;
                    }
                }
                a8Var18.b = z19 ? 1.0f : 0.0f;
                a8Var17.b = ((!z19 && !c8Var.j1) || c8Var.n1 == null || c8.H(b8Var6) == null) ? 0.0f : 1.0f;
                f10 = f37;
                boolean b12 = a8Var18.b(f10) | a8Var17.b(f10);
                float f41 = a8Var18.a;
                boolean z20 = f41 > 0.002f || a8Var17.a > 0.002f;
                if (z20) {
                    c8Var.o1 += f10;
                } else {
                    c8Var.o1 = 0.0f;
                    if (!c8Var.i1 && !c8Var.j1) {
                        p7Var = null;
                        c8Var.n1 = null;
                        if (b8Var6 != null && b8Var6.H == 0 && b8Var6.v != null && f41 > 0.002f) {
                            D = c8Var.D(c8Var.o1 % 2.0f);
                            if (Utilities.l(a8Var18.a) * Math.max(D[0], Math.max(D[1], D[2])) >= 0.003f) {
                                p7Var2 = j15;
                                p7Var3 = c8Var.m1;
                                if (p7Var3 != null && p7Var3 != p7Var2) {
                                    i9Var = p7Var3.E;
                                    if (i9Var.getAlpha() != 1.0f) {
                                        i9Var.setAlpha(1.0f);
                                    }
                                    p7Var3.invalidate();
                                }
                                c8Var.m1 = p7Var2;
                                if (p7Var2 != null) {
                                    org.telegram.ui.Components.i9 i9Var2 = p7Var2.E;
                                    if (i9Var2.getAlpha() != 0.0f) {
                                        i9Var2.setAlpha(0.0f);
                                    }
                                    p7Var2.invalidate();
                                }
                                p7 p7Var6 = (z19 || a8Var18.a <= 0.5f) ? p7Var : j15;
                                RectF rectF = c8Var.w1;
                                if (c8Var.getParent() instanceof ViewGroup) {
                                    RectF Z3 = p7Var6 == null ? p7Var : c8Var.Z(c8Var.l1);
                                    if (Z3 != null) {
                                        hi.l3 l3Var = c8Var.x1;
                                        if (l3Var == null) {
                                            c8Var.x1 = c8Var.B(2131743105, true);
                                        } else if (c8Var.k1 && !(z11 = l3Var.W)) {
                                            c8Var.k1 = false;
                                            c8Var.j1 = false;
                                            c8Var.i1 = false;
                                            if (z11) {
                                                l3Var.f(true);
                                            }
                                            if (!z18) {
                                                np.e1().edit().putBoolean("walletcardstickerhint", true).apply();
                                            }
                                            c8Var.f0();
                                        }
                                        c8.J(c8Var.x1, Z3.centerX(), Z3.top + org.telegram.messenger.g0.L(4.0f));
                                        hi.l3 l3Var2 = c8Var.x1;
                                        if (!l3Var2.W) {
                                            l3Var2.w();
                                        }
                                        c8Var.k1 = true;
                                    } else {
                                        c8Var.k1 = false;
                                        hi.l3 l3Var3 = c8Var.x1;
                                        if (l3Var3 != null && l3Var3.W) {
                                            l3Var3.f(true);
                                        }
                                    }
                                    if (c8Var.j1 && a8Var17.a > 0.5f && (aVar = c8Var.d) != null && aVar.M0() && c8Var.C()) {
                                        if (c8Var.y1 == null) {
                                            c8Var.y1 = c8Var.B(2131743106, false);
                                        }
                                        c8Var.v1.computeBounds(rectF, true);
                                        float[] L = c8Var.L(rectF.centerX(), rectF.top);
                                        if ((L[1] - org.telegram.messenger.g0.L(2.0f)) - org.telegram.messenger.g0.L(56.0f) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m) {
                                            float[] L2 = c8Var.L(rectF.centerX(), rectF.bottom);
                                            hi.l3 l3Var4 = c8Var.y1;
                                            float f42 = L2[0];
                                            float L3 = L2[1] + org.telegram.messenger.g0.L(2.0f);
                                            c8.o(l3Var4, 1);
                                            l3Var4.p(0.0f, f42 - l3Var4.getPaddingLeft());
                                            l3Var4.setTranslationY(L3);
                                            l3Var4.invalidate();
                                        } else {
                                            c8.J(c8Var.y1, L[0], L[1] - org.telegram.messenger.g0.L(2.0f));
                                        }
                                        hi.l3 l3Var5 = c8Var.y1;
                                        if (!l3Var5.W) {
                                            l3Var5.w();
                                        }
                                    } else {
                                        hi.l3 l3Var6 = c8Var.y1;
                                        if (l3Var6 != null && l3Var6.W) {
                                            l3Var6.f(true);
                                        }
                                    }
                                }
                                if (!b12 || z20) {
                                    z10 = true;
                                    boolean z21 = z17 | z10;
                                    for (size = c8Var.T.size() - 1; size >= 0; size--) {
                                        z7 z7Var2 = (z7) c8Var.T.get(size);
                                        z7Var2.h += f10;
                                        float exp = (float) Math.exp((-2.4f) * f10);
                                        float f43 = z7Var2.c * exp;
                                        z7Var2.c = f43;
                                        float f44 = z7Var2.d * exp;
                                        z7Var2.d = f44;
                                        z7Var2.a = (f43 * f10) + z7Var2.a;
                                        z7Var2.b = (f44 * f10) + z7Var2.b;
                                        z7Var2.g = (f10 * 90.0f) + z7Var2.g;
                                        if (z7Var2.h >= z7Var2.f) {
                                            c8Var.T.remove(size);
                                        }
                                    }
                                    if (!c8Var.T.isEmpty()) {
                                        z21 = true;
                                    }
                                    for (size2 = c8Var.n.size() - 1; size2 >= 0; size2--) {
                                        y7 y7Var2 = (y7) c8Var.n.get(size2);
                                        float f45 = y7Var2.c + f10;
                                        y7Var2.c = f45;
                                        if (f45 > 0.42f) {
                                            c8Var.n.remove(size2);
                                        }
                                    }
                                    f11 = c8Var.V0;
                                    if (f11 < 1.0f) {
                                        c8Var.V0 = org.telegram.ui.Cells.y0.e(f10, c8Var.Y0 ? 0.45f : 1.2f, f11, 1.0f);
                                        c8Var.e();
                                        z21 = true;
                                    }
                                    it = c8Var.f.values().iterator();
                                    boolean z22 = false;
                                    while (it.hasNext()) {
                                        if (((b8) it.next()).H == 5) {
                                            z22 = true;
                                        }
                                    }
                                    a8 a8Var19 = c8Var.O;
                                    a8Var19.b = ((!c8Var.n0 && c8Var.p0 && a8Var19.b > 0.0f) || z22 || c8Var.g0) ? 1.0f : 0.0f;
                                    a8 a8Var20 = c8Var.P;
                                    boolean z23 = c8Var.u0;
                                    a8Var20.b = (!z23 || z22 || c8Var.g0) ? 1.0f : 0.0f;
                                    if (c8Var.g0) {
                                        f12 = 0.0f;
                                        a8 a8Var21 = c8Var.d0;
                                        a8Var21.b = z23 ? 28.0f : 0.0f;
                                        b10 = z21 | a8Var21.b(f10);
                                    } else {
                                        a8 a8Var22 = c8Var.d0;
                                        a8Var22.a(Math.min(66.0f, (f10 * 60.0f) + a8Var22.a));
                                        a8 a8Var23 = c8Var.d0;
                                        if (a8Var23.a >= 66.0f) {
                                            c8Var.g0 = false;
                                            f12 = 0.0f;
                                            a8Var23.a(0.0f);
                                        } else {
                                            f12 = 0.0f;
                                        }
                                        b10 = true;
                                    }
                                    b11 = b10 | c8Var.O.b(f10) | c8Var.P.b(f10) | c8Var.Q.b(f10) | c8Var.R.b(f10) | c8Var.S.b(f10);
                                    c8Var.c.setStickerImpact(c8Var.Q.a);
                                    h6Var = c8Var.c;
                                    float max = Math.max(-1.0f, Math.min(1.0f, c8Var.R.a));
                                    float max2 = Math.max(-1.0f, Math.min(1.0f, c8Var.S.a));
                                    if (h6Var.c0 != 0) {
                                        ga.d dVar = new ga.d(4);
                                        float[] fArr2 = new float[8];
                                        dVar.f(1000, 600, 0.0f, 5.0f, false, fArr2);
                                        h6Var.d0 = Math.hypot((double) (fArr2[2] - fArr2[4]), (double) (fArr2[3] - fArr2[5])) < Math.hypot((double) (fArr2[0] - fArr2[6]), (double) (fArr2[1] - fArr2[7])) ? 1 : -1;
                                        dVar.f(1000, 600, 5.0f, 0.0f, false, fArr2);
                                        i7 = 0;
                                        h6Var.c0 = Math.hypot((double) (fArr2[4] - fArr2[6]), (double) (fArr2[5] - fArr2[7])) < Math.hypot((double) (fArr2[0] - fArr2[2]), (double) (fArr2[1] - fArr2[3])) ? 1 : -1;
                                    } else {
                                        i7 = 0;
                                    }
                                    f13 = h6Var.c0 * max2 * 10.0f;
                                    f14 = h6Var.d0 * max * 10.0f;
                                    c6Var = h6Var.E;
                                    if (c6Var.m0 == f13 || c6Var.n0 != f14) {
                                        c6Var.m0 = f13;
                                        c6Var.n0 = f14;
                                        c6Var.b(c6Var.d0, c6Var.g0);
                                    }
                                    c8Var.b0 = c8Var.c.getCardRotationX();
                                    c8Var.c0 = c8Var.c.getCardRotationY();
                                    ArrayList arrayList3 = c8Var.h;
                                    size3 = arrayList3.size();
                                    i10 = i7;
                                    while (i10 < size3) {
                                        Object obj2 = arrayList3.get(i10);
                                        i10++;
                                        p7 p7Var7 = (p7) obj2;
                                        b8 b8Var7 = (b8) c8Var.f.get(p7Var7.x0.address);
                                        if (b8Var7 != null) {
                                            p7Var7.k(b8Var7.R, true, b8Var7.H == 0 ? f12 : 1.0f);
                                        }
                                    }
                                    c8Var.invalidate();
                                    c8Var.M.invalidate();
                                    c8Var.N.invalidate();
                                    if (b11 && c8Var.n.isEmpty() && !c8Var.q0) {
                                        c8Var.N0 = j3;
                                        return;
                                    }
                                    c8Var.postOnAnimation(this);
                                }
                            }
                        }
                        p7Var2 = p7Var;
                        p7Var3 = c8Var.m1;
                        if (p7Var3 != null) {
                            i9Var = p7Var3.E;
                            if (i9Var.getAlpha() != 1.0f) {
                            }
                            p7Var3.invalidate();
                        }
                        c8Var.m1 = p7Var2;
                        if (p7Var2 != null) {
                        }
                        if (z19) {
                        }
                        RectF rectF2 = c8Var.w1;
                        if (c8Var.getParent() instanceof ViewGroup) {
                        }
                        if (!b12) {
                        }
                        z10 = true;
                        boolean z212 = z17 | z10;
                        while (size >= 0) {
                        }
                        if (!c8Var.T.isEmpty()) {
                        }
                        while (size2 >= 0) {
                        }
                        f11 = c8Var.V0;
                        if (f11 < 1.0f) {
                        }
                        it = c8Var.f.values().iterator();
                        boolean z222 = false;
                        while (it.hasNext()) {
                        }
                        a8 a8Var192 = c8Var.O;
                        a8Var192.b = ((!c8Var.n0 && c8Var.p0 && a8Var192.b > 0.0f) || z222 || c8Var.g0) ? 1.0f : 0.0f;
                        a8 a8Var202 = c8Var.P;
                        boolean z232 = c8Var.u0;
                        a8Var202.b = (!z232 || z222 || c8Var.g0) ? 1.0f : 0.0f;
                        if (c8Var.g0) {
                        }
                        b11 = b10 | c8Var.O.b(f10) | c8Var.P.b(f10) | c8Var.Q.b(f10) | c8Var.R.b(f10) | c8Var.S.b(f10);
                        c8Var.c.setStickerImpact(c8Var.Q.a);
                        h6Var = c8Var.c;
                        float max3 = Math.max(-1.0f, Math.min(1.0f, c8Var.R.a));
                        float max22 = Math.max(-1.0f, Math.min(1.0f, c8Var.S.a));
                        if (h6Var.c0 != 0) {
                        }
                        f13 = h6Var.c0 * max22 * 10.0f;
                        f14 = h6Var.d0 * max3 * 10.0f;
                        c6Var = h6Var.E;
                        if (c6Var.m0 == f13) {
                        }
                        c6Var.m0 = f13;
                        c6Var.n0 = f14;
                        c6Var.b(c6Var.d0, c6Var.g0);
                        c8Var.b0 = c8Var.c.getCardRotationX();
                        c8Var.c0 = c8Var.c.getCardRotationY();
                        ArrayList arrayList32 = c8Var.h;
                        size3 = arrayList32.size();
                        i10 = i7;
                        while (i10 < size3) {
                        }
                        c8Var.invalidate();
                        c8Var.M.invalidate();
                        c8Var.N.invalidate();
                        if (b11) {
                        }
                        c8Var.postOnAnimation(this);
                    }
                }
                p7Var = null;
                if (b8Var6 != null) {
                    D = c8Var.D(c8Var.o1 % 2.0f);
                    if (Utilities.l(a8Var18.a) * Math.max(D[0], Math.max(D[1], D[2])) >= 0.003f) {
                    }
                }
                p7Var2 = p7Var;
                p7Var3 = c8Var.m1;
                if (p7Var3 != null) {
                }
                c8Var.m1 = p7Var2;
                if (p7Var2 != null) {
                }
                if (z19) {
                }
                RectF rectF22 = c8Var.w1;
                if (c8Var.getParent() instanceof ViewGroup) {
                }
                if (!b12) {
                }
                z10 = true;
                boolean z2122 = z17 | z10;
                while (size >= 0) {
                }
                if (!c8Var.T.isEmpty()) {
                }
                while (size2 >= 0) {
                }
                f11 = c8Var.V0;
                if (f11 < 1.0f) {
                }
                it = c8Var.f.values().iterator();
                boolean z2222 = false;
                while (it.hasNext()) {
                }
                a8 a8Var1922 = c8Var.O;
                a8Var1922.b = ((!c8Var.n0 && c8Var.p0 && a8Var1922.b > 0.0f) || z2222 || c8Var.g0) ? 1.0f : 0.0f;
                a8 a8Var2022 = c8Var.P;
                boolean z2322 = c8Var.u0;
                a8Var2022.b = (!z2322 || z2222 || c8Var.g0) ? 1.0f : 0.0f;
                if (c8Var.g0) {
                }
                b11 = b10 | c8Var.O.b(f10) | c8Var.P.b(f10) | c8Var.Q.b(f10) | c8Var.R.b(f10) | c8Var.S.b(f10);
                c8Var.c.setStickerImpact(c8Var.Q.a);
                h6Var = c8Var.c;
                float max32 = Math.max(-1.0f, Math.min(1.0f, c8Var.R.a));
                float max222 = Math.max(-1.0f, Math.min(1.0f, c8Var.S.a));
                if (h6Var.c0 != 0) {
                }
                f13 = h6Var.c0 * max222 * 10.0f;
                f14 = h6Var.d0 * max32 * 10.0f;
                c6Var = h6Var.E;
                if (c6Var.m0 == f13) {
                }
                c6Var.m0 = f13;
                c6Var.n0 = f14;
                c6Var.b(c6Var.d0, c6Var.g0);
                c8Var.b0 = c8Var.c.getCardRotationX();
                c8Var.c0 = c8Var.c.getCardRotationY();
                ArrayList arrayList322 = c8Var.h;
                size3 = arrayList322.size();
                i10 = i7;
                while (i10 < size3) {
                }
                c8Var.invalidate();
                c8Var.M.invalidate();
                c8Var.N.invalidate();
                if (b11) {
                }
                c8Var.postOnAnimation(this);
            }
            f10 = f37;
            z10 = false;
            boolean z21222 = z17 | z10;
            while (size >= 0) {
            }
            if (!c8Var.T.isEmpty()) {
            }
            while (size2 >= 0) {
            }
            f11 = c8Var.V0;
            if (f11 < 1.0f) {
            }
            it = c8Var.f.values().iterator();
            boolean z22222 = false;
            while (it.hasNext()) {
            }
            a8 a8Var19222 = c8Var.O;
            a8Var19222.b = ((!c8Var.n0 && c8Var.p0 && a8Var19222.b > 0.0f) || z22222 || c8Var.g0) ? 1.0f : 0.0f;
            a8 a8Var20222 = c8Var.P;
            boolean z23222 = c8Var.u0;
            a8Var20222.b = (!z23222 || z22222 || c8Var.g0) ? 1.0f : 0.0f;
            if (c8Var.g0) {
            }
            b11 = b10 | c8Var.O.b(f10) | c8Var.P.b(f10) | c8Var.Q.b(f10) | c8Var.R.b(f10) | c8Var.S.b(f10);
            c8Var.c.setStickerImpact(c8Var.Q.a);
            h6Var = c8Var.c;
            float max322 = Math.max(-1.0f, Math.min(1.0f, c8Var.R.a));
            float max2222 = Math.max(-1.0f, Math.min(1.0f, c8Var.S.a));
            if (h6Var.c0 != 0) {
            }
            f13 = h6Var.c0 * max2222 * 10.0f;
            f14 = h6Var.d0 * max322 * 10.0f;
            c6Var = h6Var.E;
            if (c6Var.m0 == f13) {
            }
            c6Var.m0 = f13;
            c6Var.n0 = f14;
            c6Var.b(c6Var.d0, c6Var.g0);
            c8Var.b0 = c8Var.c.getCardRotationX();
            c8Var.c0 = c8Var.c.getCardRotationY();
            ArrayList arrayList3222 = c8Var.h;
            size3 = arrayList3222.size();
            i10 = i7;
            while (i10 < size3) {
            }
            c8Var.invalidate();
            c8Var.M.invalidate();
            c8Var.N.invalidate();
            if (b11) {
            }
            c8Var.postOnAnimation(this);
        }
    }
}
