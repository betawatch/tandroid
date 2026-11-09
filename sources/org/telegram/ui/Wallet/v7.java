package org.telegram.ui.Wallet;

import android.graphics.RectF;
import android.os.SystemClock;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ah0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class v7 implements Runnable {
    public final /* synthetic */ a8 a;

    public v7(a8 a8Var) {
        this.a = a8Var;
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
    /* JADX WARN: Removed duplicated region for block: B:262:0x09f7  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0a23  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0a59  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x09e1  */
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
        long j3;
        float f10;
        n7 n7Var;
        n7 n7Var2;
        n7 n7Var3;
        boolean z9;
        m4.d0 d0Var;
        boolean z10;
        org.telegram.ui.Components.l9 l9Var;
        float[] D;
        z7 z7Var;
        RectF Z;
        n7 j10;
        int size;
        int size2;
        float f11;
        Iterator it;
        float f12;
        boolean b10;
        boolean b11;
        f6 f6Var;
        int i7;
        float f13;
        float f14;
        a6 a6Var;
        int size3;
        int i10;
        Iterator it2;
        String string;
        boolean z11;
        float f15;
        y7 y7Var;
        y7 y7Var2;
        boolean optBoolean;
        int i11;
        di.z2 z2Var;
        float f16;
        float f17;
        float f18;
        float f19;
        n7 n7Var4;
        float f20;
        ah0 B;
        float f21;
        float f22;
        float f23;
        a8 a8Var = this.a;
        if (a8Var.a1 || !a8Var.isAttachedToWindow()) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j11 = 0;
        float min = a8Var.M0 == 0 ? 0.016666668f : Math.min(0.032f, (uptimeMillis - r4) / 1000.0f);
        a8Var.M0 = uptimeMillis;
        if (a8Var.A()) {
            Iterator it3 = a8Var.f.values().iterator();
            boolean z12 = false;
            while (true) {
                j3 = j11;
                if (!it3.hasNext()) {
                    break;
                }
                z7 z7Var2 = (z7) it3.next();
                boolean z13 = z7Var2.K;
                y7 y7Var3 = z7Var2.m;
                y7 y7Var4 = z7Var2.i;
                String str = z7Var2.a;
                y7 y7Var5 = z7Var2.j;
                di.z2 z2Var2 = z7Var2.c;
                y7 y7Var6 = z7Var2.g;
                y7 y7Var7 = z7Var2.f;
                y7 y7Var8 = z7Var2.e;
                y7 y7Var9 = z7Var2.h;
                if (z13) {
                    it2 = it3;
                    f15 = min;
                    z11 = z12;
                } else {
                    z7Var2.K = true;
                    if (a8Var.b) {
                        it2 = it3;
                        string = null;
                    } else {
                        it2 = it3;
                        string = a8Var.e.getString(str, null);
                    }
                    if (a8Var.b1 != null) {
                        TL_wallet.cardSticker R = a8Var.R(str);
                        if (R != null) {
                            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = R.coordinates;
                            if (string == null) {
                                z11 = z12;
                            } else {
                                z11 = z12;
                                try {
                                    optBoolean = new JSONObject(string).optBoolean("q");
                                } catch (Exception unused) {
                                }
                                a8Var.K(z7Var2, mediaAreaCoordinates, optBoolean);
                            }
                            optBoolean = false;
                            a8Var.K(z7Var2, mediaAreaCoordinates, optBoolean);
                        } else {
                            z11 = z12;
                        }
                    } else {
                        z11 = z12;
                        if (string != null) {
                            try {
                                JSONObject jSONObject = new JSONObject(string);
                                f15 = min;
                                try {
                                    y7Var9.a((float) jSONObject.optDouble("s", 1.0d));
                                    y7Var = y7Var3;
                                    y7Var2 = y7Var5;
                                } catch (Exception unused2) {
                                    y7Var = y7Var3;
                                    y7Var2 = y7Var5;
                                }
                                try {
                                    y7Var4.a((float) jSONObject.optDouble("r", 0.0d));
                                    z7Var2.N = jSONObject.optBoolean("q");
                                    float[] fArr = {((float) jSONObject.getDouble("x")) * a8Var.Y0, ((float) jSONObject.getDouble("y")) * a8Var.Z0, y7Var9.b};
                                    y7Var8.a(fArr[0]);
                                    y7Var7.a(fArr[1]);
                                    y7Var9.a(fArr[2]);
                                    z7Var2.H = 2;
                                    long j12 = a8Var.N0 + 1;
                                    a8Var.N0 = j12;
                                    z7Var2.I = j12;
                                    y7Var.a(1.0f);
                                    if (z7Var2.J == j3) {
                                        long j13 = a8Var.R0 + 1;
                                        a8Var.R0 = j13;
                                        z7Var2.J = j13;
                                    }
                                    str = str;
                                    try {
                                        if (str.equals(a8Var.P0)) {
                                            a8Var.T0 = z7Var2;
                                            a8Var.S0 = z7Var2;
                                            a8Var.U0 = 1.0f;
                                            a8Var.e();
                                        }
                                    } catch (Exception unused3) {
                                    }
                                } catch (Exception unused4) {
                                    str = str;
                                    if (z7Var2.b()) {
                                    }
                                    while (r7 < r5) {
                                    }
                                    float f24 = f15;
                                    i11 = z7Var2.H;
                                    if (i11 == 1) {
                                    }
                                    z11 = true;
                                    if (!z7Var2.b()) {
                                    }
                                    B = z2Var.B();
                                    if (B == null) {
                                    }
                                    z12 = z11;
                                    j11 = j3;
                                    it3 = it2;
                                    min = f16;
                                }
                            } catch (Exception unused5) {
                            }
                            if (z7Var2.b()) {
                                z7Var2.a();
                            }
                            for (y7 y7Var10 : z7Var2.s) {
                                z11 |= y7Var10.b(f15);
                            }
                            float f242 = f15;
                            i11 = z7Var2.H;
                            if (i11 == 1) {
                                float t6 = Utilities.t(y7Var8.a + z7Var2.n.a, y7Var7.a + z7Var2.o.a, y7Var8.b, y7Var7.b);
                                if (z7Var2.M || y7Var2.a >= 0.36f || t6 >= org.telegram.messenger.g0.L(24.0f)) {
                                    f21 = 0.35f;
                                } else {
                                    z7Var2.M = true;
                                    ArrayList arrayList = a8Var.n;
                                    float f25 = y7Var8.b;
                                    f21 = 0.35f;
                                    float f26 = y7Var7.b;
                                    w7 w7Var = new w7();
                                    w7Var.a = f25;
                                    w7Var.b = f26;
                                    arrayList.add(w7Var);
                                }
                                if (z7Var2.L || y7Var2.a >= 0.22f || t6 >= org.telegram.messenger.g0.L(12.0f)) {
                                    f22 = t6;
                                    z2Var = z2Var2;
                                    f23 = 1.4f;
                                } else {
                                    z7Var2.L = true;
                                    y7 y7Var11 = z7Var2.p;
                                    y7Var11.a(1.0f);
                                    y7Var11.b = 0.0f;
                                    y7 y7Var12 = a8Var.P;
                                    boolean z14 = z7Var2.P;
                                    float f27 = z14 ? 420.0f : 260.0f;
                                    float f28 = z14 ? 0.38f : 0.85f;
                                    y7Var12.d = f27;
                                    y7Var12.e = f28;
                                    y7Var12.c -= z14 ? 0.75f : 0.28f;
                                    float f29 = z14 ? 3.4f : 1.4f;
                                    y7 y7Var13 = a8Var.Q;
                                    float f30 = y7Var13.c;
                                    float f31 = y7Var8.b;
                                    f23 = 1.4f;
                                    y7Var13.c = (((f31 / a8Var.Y0) - 0.5f) * 2.0f * f29) + f30;
                                    y7 y7Var14 = a8Var.R;
                                    float f32 = y7Var14.c;
                                    float f33 = y7Var7.b;
                                    f22 = t6;
                                    y7Var14.c = (((f33 / a8Var.Z0) - 0.5f) * 2.0f * f29) + f32;
                                    if (z14) {
                                        Random random = new Random();
                                        int i12 = 0;
                                        while (i12 < 14) {
                                            x7 x7Var = new x7();
                                            di.z2 z2Var3 = z2Var2;
                                            float nextFloat = (random.nextFloat() * f21) + ((float) ((i12 / 14.0f) * 3.141592653589793d * 2.0d));
                                            Random random2 = random;
                                            float nextFloat2 = (random.nextFloat() * org.telegram.messenger.g0.L(180.0f)) + org.telegram.messenger.g0.L(265.0f);
                                            x7Var.a = f31;
                                            x7Var.b = f33;
                                            double d = nextFloat;
                                            x7Var.c = ((float) Math.cos(d)) * nextFloat2;
                                            x7Var.d = ((float) Math.sin(d)) * nextFloat2;
                                            x7Var.e = (random2.nextFloat() * org.telegram.messenger.g0.L(1.1f)) + org.telegram.messenger.g0.L(0.8f);
                                            x7Var.f = (random2.nextFloat() * f21) + 0.7f;
                                            x7Var.g = random2.nextFloat() * 360.0f;
                                            a8Var.S.add(x7Var);
                                            i12++;
                                            random = random2;
                                            z2Var2 = z2Var3;
                                        }
                                    }
                                    z2Var = z2Var2;
                                    if (str.equals(a8Var.Q0)) {
                                        a8Var.X(z7Var2, false);
                                        a8Var.Q0 = null;
                                    }
                                }
                                if (!z7Var2.Q && z7Var2.k.a < 0.3f) {
                                    z7Var2.Q = true;
                                    y7Var6.c -= f23;
                                    a8Var.performHapticFeedback(3);
                                }
                                if (z7Var2.Q && f22 < 0.5f && Math.abs(y7Var6.a - 1.0f) < 0.004f && Math.abs(y7Var6.c) < 0.02f) {
                                    z7Var2.H = 2;
                                    y7Var8.a(y7Var8.b);
                                    y7Var7.a(y7Var7.b);
                                }
                                f16 = f242;
                            } else {
                                z2Var = z2Var2;
                                if (i11 == 4) {
                                    float f34 = 1.0f;
                                    float e10 = org.telegram.ui.Cells.f1.e(f242, z7Var2.b0, z7Var2.W, 1.0f);
                                    z7Var2.W = e10;
                                    float f35 = 1.0f - e10;
                                    float f36 = 1.0f - (f35 * f35);
                                    n7 j14 = a8Var.j(z7Var2);
                                    float l10 = Utilities.l(e10 / 0.5f);
                                    if (j14 != null) {
                                        f18 = 0.28f;
                                        f17 = e10;
                                        f34 = 1.0f;
                                        f19 = org.telegram.messenger.g0.T1(z7Var2.c0, 1.0f, com.google.android.recaptcha.internal.a.C(l10, 2.0f, 3.0f, l10 * l10));
                                    } else {
                                        f17 = e10;
                                        f18 = 0.28f;
                                        f19 = 1.0f;
                                    }
                                    if (j14 != null) {
                                        j14.setScaleX(f19);
                                        j14.setScaleY(f19);
                                    }
                                    RectF Z2 = a8Var.Z(z7Var2);
                                    if (Z2 == null) {
                                        y7Var6.a((f34 - f36) * z7Var2.Z);
                                        n7Var4 = j14;
                                        f16 = f242;
                                        f20 = 1.0f;
                                    } else {
                                        float sin = (float) Math.sin(f36 * 3.141592653589793d);
                                        f16 = f242;
                                        n7Var4 = j14;
                                        float min2 = Math.min(org.telegram.messenger.g0.L(90.0f), Utilities.t(Z2.centerX(), Z2.centerY(), z7Var2.X, z7Var2.Y) * f18);
                                        y7Var8.a(org.telegram.messenger.g0.T1(z7Var2.X, Z2.centerX(), f36));
                                        y7Var7.a(org.telegram.messenger.g0.T1(z7Var2.Y, Z2.centerY(), f36) - ((((1.0f - f36) * 2.0f) * f36) * min2));
                                        y7Var6.a(org.telegram.messenger.g0.T1(1.0f, f19, f36) * com.google.android.recaptcha.internal.a.B(sin, 0.05f, 1.0f, org.telegram.messenger.g0.T1(z7Var2.Z, (a8Var.f(z7Var2) * (Z2.width() / f19)) / a8Var.U(), f36)));
                                        y7Var2.a(sin * 0.8f);
                                        float f37 = z7Var2.a0;
                                        y7Var4.a((a8.c(-f37) * f36) + f37);
                                        f20 = 1.0f;
                                        y7Var.a(Utilities.l(1.0f - ((f36 - 0.35f) / 0.4f)));
                                    }
                                    if (f17 >= f20) {
                                        a8Var.g(z7Var2);
                                        if (n7Var4 != null) {
                                            n7Var4.animate().scaleX(0.955f).scaleY(0.955f).setDuration(70L).setInterpolator(null).withEndAction(new q7(n7Var4, 1)).start();
                                        }
                                    }
                                } else {
                                    f16 = f242;
                                    if (i11 == 5) {
                                        if (y7Var6.a < 0.03f) {
                                            a8Var.g(z7Var2);
                                        }
                                    }
                                    if (!z7Var2.b()) {
                                        z7Var2.R = true;
                                    } else if (z7Var2.H == 0) {
                                        z7Var2.R = false;
                                    }
                                    B = z2Var.B();
                                    if (B == null && B.k0) {
                                        ah0 B2 = z2Var.B();
                                        int i13 = B2 == null ? 0 : B2.a0;
                                        if (i13 >= 2) {
                                            z7Var2.T = true;
                                        }
                                        boolean z15 = z7Var2.S && !z7Var2.T && z7Var2.H == 2;
                                        if (z7Var2.l.b == 0.0f && !z15 && B2 != null && i13 < 2) {
                                            z2Var.Q0();
                                            z2Var.u0 = false;
                                            z7Var2.S = false;
                                        }
                                        z12 = true;
                                    } else {
                                        z12 = z11;
                                    }
                                    j11 = j3;
                                    it3 = it2;
                                    min = f16;
                                }
                            }
                            z11 = true;
                            if (!z7Var2.b()) {
                            }
                            B = z2Var.B();
                            if (B == null) {
                            }
                            z12 = z11;
                            j11 = j3;
                            it3 = it2;
                            min = f16;
                        }
                    }
                    f15 = min;
                }
                y7Var = y7Var3;
                y7Var2 = y7Var5;
                if (z7Var2.b()) {
                }
                while (r7 < r5) {
                }
                float f2422 = f15;
                i11 = z7Var2.H;
                if (i11 == 1) {
                }
                z11 = true;
                if (!z7Var2.b()) {
                }
                B = z2Var.B();
                if (B == null) {
                }
                z12 = z11;
                j11 = j3;
                it3 = it2;
                min = f16;
            }
            float f38 = min;
            boolean z16 = z12;
            y7 y7Var15 = a8Var.q1;
            y7 y7Var16 = a8Var.p1;
            boolean z17 = a8Var.b;
            if (!z17) {
                if (a8Var.h1) {
                    z7 z7Var3 = a8Var.k1;
                    if (z7Var3 != null && z7Var3.H == 0 && (j10 = a8Var.j(z7Var3)) != null && a8Var.z(j10) && a8.b(a8Var.k1)) {
                        z7Var = a8Var.k1;
                    } else {
                        ArrayList arrayList2 = a8Var.h;
                        int size4 = arrayList2.size();
                        int i14 = 0;
                        float f39 = 0.0f;
                        float f40 = 0.0f;
                        z7 z7Var4 = null;
                        while (i14 < size4) {
                            Object obj = arrayList2.get(i14);
                            i14++;
                            n7 n7Var5 = (n7) obj;
                            z7 z7Var5 = (z7) a8Var.f.get(n7Var5.w0.address);
                            if (z7Var5 != null && z7Var5.H == 0 && a8.b(z7Var5) && n7Var5.isAttachedToWindow() && a8Var.z(n7Var5) && (Z = a8Var.Z(z7Var5)) != null) {
                                if (z7Var4 != null) {
                                    float f41 = Z.top;
                                    if (f41 >= f39 - 1.0f) {
                                        if (Math.abs(f41 - f39) <= 1.0f && Z.left < f40) {
                                        }
                                    }
                                }
                                f39 = Z.top;
                                f40 = Z.left;
                                z7Var4 = z7Var5;
                            }
                        }
                        z7Var = z7Var4;
                    }
                    if (z7Var != null && z7Var != a8Var.k1) {
                        a8Var.k1 = z7Var;
                        a8Var.m1 = null;
                        a8Var.n1 = 0.0f;
                    }
                }
                z7 z7Var6 = a8Var.k1;
                n7 j15 = z7Var6 == null ? null : a8Var.j(z7Var6);
                boolean z18 = a8Var.h1 && z7Var6 != null && z7Var6.H == 0 && a8.b(z7Var6) && j15 != null && a8Var.z(j15) && !a8Var.s0 && !a8Var.p0;
                if (z7Var6 != null && (z18 || a8Var.i1)) {
                    z7Var6.a();
                    if (a8Var.m1 == null && z7Var6.u != null) {
                        a8Var.m1 = a8Var.x(z7Var6, a8Var.Y0 * 0.6f, a8Var.Z0 * 0.68f, true);
                        z7Var6.N = false;
                    }
                }
                y7Var16.b = z18 ? 1.0f : 0.0f;
                y7Var15.b = ((!z18 && !a8Var.i1) || a8Var.m1 == null || a8.H(z7Var6) == null) ? 0.0f : 1.0f;
                f10 = f38;
                boolean b12 = y7Var16.b(f10) | y7Var15.b(f10);
                float f42 = y7Var16.a;
                boolean z19 = f42 > 0.002f || y7Var15.a > 0.002f;
                if (z19) {
                    a8Var.n1 += f10;
                } else {
                    a8Var.n1 = 0.0f;
                    if (!a8Var.h1 && !a8Var.i1) {
                        n7Var = null;
                        a8Var.m1 = null;
                        if (z7Var6 != null && z7Var6.H == 0 && z7Var6.v != null && f42 > 0.002f) {
                            D = a8Var.D(a8Var.n1 % 2.0f);
                            if (Utilities.l(y7Var16.a) * Math.max(D[0], Math.max(D[1], D[2])) >= 0.003f) {
                                n7Var2 = j15;
                                n7Var3 = a8Var.l1;
                                if (n7Var3 != null && n7Var3 != n7Var2) {
                                    l9Var = n7Var3.D;
                                    if (l9Var.getAlpha() != 1.0f) {
                                        l9Var.setAlpha(1.0f);
                                    }
                                    n7Var3.invalidate();
                                }
                                a8Var.l1 = n7Var2;
                                if (n7Var2 != null) {
                                    org.telegram.ui.Components.l9 l9Var2 = n7Var2.D;
                                    if (l9Var2.getAlpha() != 0.0f) {
                                        l9Var2.setAlpha(0.0f);
                                    }
                                    n7Var2.invalidate();
                                }
                                n7 n7Var6 = (z18 || y7Var16.a <= 0.5f) ? n7Var : j15;
                                RectF rectF = a8Var.v1;
                                if (a8Var.getParent() instanceof ViewGroup) {
                                    RectF Z3 = n7Var6 == null ? n7Var : a8Var.Z(a8Var.k1);
                                    if (Z3 != null) {
                                        fi.m3 m3Var = a8Var.w1;
                                        if (m3Var == null) {
                                            a8Var.w1 = a8Var.B(2131743105, true);
                                        } else if (a8Var.j1 && !(z10 = m3Var.V)) {
                                            a8Var.j1 = false;
                                            a8Var.i1 = false;
                                            a8Var.h1 = false;
                                            if (z10) {
                                                m3Var.f(true);
                                            }
                                            if (!z17) {
                                                qp.e1().edit().putBoolean("walletcardstickerhint", true).apply();
                                            }
                                            a8Var.f0();
                                        }
                                        a8.J(a8Var.w1, Z3.centerX(), Z3.top + org.telegram.messenger.g0.L(4.0f));
                                        fi.m3 m3Var2 = a8Var.w1;
                                        if (!m3Var2.V) {
                                            m3Var2.w();
                                        }
                                        a8Var.j1 = true;
                                    } else {
                                        a8Var.j1 = false;
                                        fi.m3 m3Var3 = a8Var.w1;
                                        if (m3Var3 != null && m3Var3.V) {
                                            m3Var3.f(true);
                                        }
                                    }
                                    if (a8Var.i1 && y7Var15.a > 0.5f && (d0Var = a8Var.d) != null && d0Var.M() && a8Var.C()) {
                                        if (a8Var.x1 == null) {
                                            a8Var.x1 = a8Var.B(2131743106, false);
                                        }
                                        a8Var.u1.computeBounds(rectF, true);
                                        float[] L = a8Var.L(rectF.centerX(), rectF.top);
                                        if ((L[1] - org.telegram.messenger.g0.L(2.0f)) - org.telegram.messenger.g0.L(56.0f) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m) {
                                            float[] L2 = a8Var.L(rectF.centerX(), rectF.bottom);
                                            fi.m3 m3Var4 = a8Var.x1;
                                            float f43 = L2[0];
                                            float L3 = L2[1] + org.telegram.messenger.g0.L(2.0f);
                                            a8.o(m3Var4, 1);
                                            m3Var4.p(0.0f, f43 - m3Var4.getPaddingLeft());
                                            m3Var4.setTranslationY(L3);
                                            m3Var4.invalidate();
                                        } else {
                                            a8.J(a8Var.x1, L[0], L[1] - org.telegram.messenger.g0.L(2.0f));
                                        }
                                        fi.m3 m3Var5 = a8Var.x1;
                                        if (!m3Var5.V) {
                                            m3Var5.w();
                                        }
                                    } else {
                                        fi.m3 m3Var6 = a8Var.x1;
                                        if (m3Var6 != null && m3Var6.V) {
                                            m3Var6.f(true);
                                        }
                                    }
                                }
                                if (!b12 || z19) {
                                    z9 = true;
                                    boolean z20 = z16 | z9;
                                    for (size = a8Var.S.size() - 1; size >= 0; size--) {
                                        x7 x7Var2 = (x7) a8Var.S.get(size);
                                        x7Var2.h += f10;
                                        float exp = (float) Math.exp((-2.4f) * f10);
                                        float f44 = x7Var2.c * exp;
                                        x7Var2.c = f44;
                                        float f45 = x7Var2.d * exp;
                                        x7Var2.d = f45;
                                        x7Var2.a = (f44 * f10) + x7Var2.a;
                                        x7Var2.b = (f45 * f10) + x7Var2.b;
                                        x7Var2.g = (f10 * 90.0f) + x7Var2.g;
                                        if (x7Var2.h >= x7Var2.f) {
                                            a8Var.S.remove(size);
                                        }
                                    }
                                    if (!a8Var.S.isEmpty()) {
                                        z20 = true;
                                    }
                                    for (size2 = a8Var.n.size() - 1; size2 >= 0; size2--) {
                                        w7 w7Var2 = (w7) a8Var.n.get(size2);
                                        float f46 = w7Var2.c + f10;
                                        w7Var2.c = f46;
                                        if (f46 > 0.42f) {
                                            a8Var.n.remove(size2);
                                        }
                                    }
                                    f11 = a8Var.U0;
                                    if (f11 < 1.0f) {
                                        a8Var.U0 = org.telegram.ui.Cells.f1.e(f10, a8Var.X0 ? 0.45f : 1.2f, f11, 1.0f);
                                        a8Var.e();
                                        z20 = true;
                                    }
                                    it = a8Var.f.values().iterator();
                                    boolean z21 = false;
                                    while (it.hasNext()) {
                                        if (((z7) it.next()).H == 5) {
                                            z21 = true;
                                        }
                                    }
                                    y7 y7Var17 = a8Var.N;
                                    y7Var17.b = ((!a8Var.m0 && a8Var.o0 && y7Var17.b > 0.0f) || z21 || a8Var.f0) ? 1.0f : 0.0f;
                                    y7 y7Var18 = a8Var.O;
                                    boolean z22 = a8Var.t0;
                                    y7Var18.b = (!z22 || z21 || a8Var.f0) ? 1.0f : 0.0f;
                                    if (a8Var.f0) {
                                        f12 = 0.0f;
                                        y7 y7Var19 = a8Var.c0;
                                        y7Var19.b = z22 ? 28.0f : 0.0f;
                                        b10 = z20 | y7Var19.b(f10);
                                    } else {
                                        y7 y7Var20 = a8Var.c0;
                                        y7Var20.a(Math.min(66.0f, (f10 * 60.0f) + y7Var20.a));
                                        y7 y7Var21 = a8Var.c0;
                                        if (y7Var21.a >= 66.0f) {
                                            a8Var.f0 = false;
                                            f12 = 0.0f;
                                            y7Var21.a(0.0f);
                                        } else {
                                            f12 = 0.0f;
                                        }
                                        b10 = true;
                                    }
                                    b11 = b10 | a8Var.N.b(f10) | a8Var.O.b(f10) | a8Var.P.b(f10) | a8Var.Q.b(f10) | a8Var.R.b(f10);
                                    a8Var.c.setStickerImpact(a8Var.P.a);
                                    f6Var = a8Var.c;
                                    float max = Math.max(-1.0f, Math.min(1.0f, a8Var.Q.a));
                                    float max2 = Math.max(-1.0f, Math.min(1.0f, a8Var.R.a));
                                    if (f6Var.b0 != 0) {
                                        ga.d dVar = new ga.d(4);
                                        float[] fArr2 = new float[8];
                                        dVar.f(1000, 600, 0.0f, 5.0f, false, fArr2);
                                        f6Var.c0 = Math.hypot((double) (fArr2[2] - fArr2[4]), (double) (fArr2[3] - fArr2[5])) < Math.hypot((double) (fArr2[0] - fArr2[6]), (double) (fArr2[1] - fArr2[7])) ? 1 : -1;
                                        dVar.f(1000, 600, 5.0f, 0.0f, false, fArr2);
                                        i7 = 0;
                                        f6Var.b0 = Math.hypot((double) (fArr2[4] - fArr2[6]), (double) (fArr2[5] - fArr2[7])) < Math.hypot((double) (fArr2[0] - fArr2[2]), (double) (fArr2[1] - fArr2[3])) ? 1 : -1;
                                    } else {
                                        i7 = 0;
                                    }
                                    f13 = f6Var.b0 * max2 * 10.0f;
                                    f14 = f6Var.c0 * max * 10.0f;
                                    a6Var = f6Var.D;
                                    if (a6Var.l0 == f13 || a6Var.m0 != f14) {
                                        a6Var.l0 = f13;
                                        a6Var.m0 = f14;
                                        a6Var.b(a6Var.c0, a6Var.f0);
                                    }
                                    a8Var.a0 = a8Var.c.getCardRotationX();
                                    a8Var.b0 = a8Var.c.getCardRotationY();
                                    ArrayList arrayList3 = a8Var.h;
                                    size3 = arrayList3.size();
                                    i10 = i7;
                                    while (i10 < size3) {
                                        Object obj2 = arrayList3.get(i10);
                                        i10++;
                                        n7 n7Var7 = (n7) obj2;
                                        z7 z7Var7 = (z7) a8Var.f.get(n7Var7.w0.address);
                                        if (z7Var7 != null) {
                                            n7Var7.k(z7Var7.R, true, z7Var7.H == 0 ? f12 : 1.0f);
                                        }
                                    }
                                    a8Var.invalidate();
                                    a8Var.L.invalidate();
                                    a8Var.M.invalidate();
                                    if (b11 && a8Var.n.isEmpty() && !a8Var.p0) {
                                        a8Var.M0 = j3;
                                        return;
                                    }
                                    a8Var.postOnAnimation(this);
                                }
                            }
                        }
                        n7Var2 = n7Var;
                        n7Var3 = a8Var.l1;
                        if (n7Var3 != null) {
                            l9Var = n7Var3.D;
                            if (l9Var.getAlpha() != 1.0f) {
                            }
                            n7Var3.invalidate();
                        }
                        a8Var.l1 = n7Var2;
                        if (n7Var2 != null) {
                        }
                        if (z18) {
                        }
                        RectF rectF2 = a8Var.v1;
                        if (a8Var.getParent() instanceof ViewGroup) {
                        }
                        if (!b12) {
                        }
                        z9 = true;
                        boolean z202 = z16 | z9;
                        while (size >= 0) {
                        }
                        if (!a8Var.S.isEmpty()) {
                        }
                        while (size2 >= 0) {
                        }
                        f11 = a8Var.U0;
                        if (f11 < 1.0f) {
                        }
                        it = a8Var.f.values().iterator();
                        boolean z212 = false;
                        while (it.hasNext()) {
                        }
                        y7 y7Var172 = a8Var.N;
                        y7Var172.b = ((!a8Var.m0 && a8Var.o0 && y7Var172.b > 0.0f) || z212 || a8Var.f0) ? 1.0f : 0.0f;
                        y7 y7Var182 = a8Var.O;
                        boolean z222 = a8Var.t0;
                        y7Var182.b = (!z222 || z212 || a8Var.f0) ? 1.0f : 0.0f;
                        if (a8Var.f0) {
                        }
                        b11 = b10 | a8Var.N.b(f10) | a8Var.O.b(f10) | a8Var.P.b(f10) | a8Var.Q.b(f10) | a8Var.R.b(f10);
                        a8Var.c.setStickerImpact(a8Var.P.a);
                        f6Var = a8Var.c;
                        float max3 = Math.max(-1.0f, Math.min(1.0f, a8Var.Q.a));
                        float max22 = Math.max(-1.0f, Math.min(1.0f, a8Var.R.a));
                        if (f6Var.b0 != 0) {
                        }
                        f13 = f6Var.b0 * max22 * 10.0f;
                        f14 = f6Var.c0 * max3 * 10.0f;
                        a6Var = f6Var.D;
                        if (a6Var.l0 == f13) {
                        }
                        a6Var.l0 = f13;
                        a6Var.m0 = f14;
                        a6Var.b(a6Var.c0, a6Var.f0);
                        a8Var.a0 = a8Var.c.getCardRotationX();
                        a8Var.b0 = a8Var.c.getCardRotationY();
                        ArrayList arrayList32 = a8Var.h;
                        size3 = arrayList32.size();
                        i10 = i7;
                        while (i10 < size3) {
                        }
                        a8Var.invalidate();
                        a8Var.L.invalidate();
                        a8Var.M.invalidate();
                        if (b11) {
                        }
                        a8Var.postOnAnimation(this);
                    }
                }
                n7Var = null;
                if (z7Var6 != null) {
                    D = a8Var.D(a8Var.n1 % 2.0f);
                    if (Utilities.l(y7Var16.a) * Math.max(D[0], Math.max(D[1], D[2])) >= 0.003f) {
                    }
                }
                n7Var2 = n7Var;
                n7Var3 = a8Var.l1;
                if (n7Var3 != null) {
                }
                a8Var.l1 = n7Var2;
                if (n7Var2 != null) {
                }
                if (z18) {
                }
                RectF rectF22 = a8Var.v1;
                if (a8Var.getParent() instanceof ViewGroup) {
                }
                if (!b12) {
                }
                z9 = true;
                boolean z2022 = z16 | z9;
                while (size >= 0) {
                }
                if (!a8Var.S.isEmpty()) {
                }
                while (size2 >= 0) {
                }
                f11 = a8Var.U0;
                if (f11 < 1.0f) {
                }
                it = a8Var.f.values().iterator();
                boolean z2122 = false;
                while (it.hasNext()) {
                }
                y7 y7Var1722 = a8Var.N;
                y7Var1722.b = ((!a8Var.m0 && a8Var.o0 && y7Var1722.b > 0.0f) || z2122 || a8Var.f0) ? 1.0f : 0.0f;
                y7 y7Var1822 = a8Var.O;
                boolean z2222 = a8Var.t0;
                y7Var1822.b = (!z2222 || z2122 || a8Var.f0) ? 1.0f : 0.0f;
                if (a8Var.f0) {
                }
                b11 = b10 | a8Var.N.b(f10) | a8Var.O.b(f10) | a8Var.P.b(f10) | a8Var.Q.b(f10) | a8Var.R.b(f10);
                a8Var.c.setStickerImpact(a8Var.P.a);
                f6Var = a8Var.c;
                float max32 = Math.max(-1.0f, Math.min(1.0f, a8Var.Q.a));
                float max222 = Math.max(-1.0f, Math.min(1.0f, a8Var.R.a));
                if (f6Var.b0 != 0) {
                }
                f13 = f6Var.b0 * max222 * 10.0f;
                f14 = f6Var.c0 * max32 * 10.0f;
                a6Var = f6Var.D;
                if (a6Var.l0 == f13) {
                }
                a6Var.l0 = f13;
                a6Var.m0 = f14;
                a6Var.b(a6Var.c0, a6Var.f0);
                a8Var.a0 = a8Var.c.getCardRotationX();
                a8Var.b0 = a8Var.c.getCardRotationY();
                ArrayList arrayList322 = a8Var.h;
                size3 = arrayList322.size();
                i10 = i7;
                while (i10 < size3) {
                }
                a8Var.invalidate();
                a8Var.L.invalidate();
                a8Var.M.invalidate();
                if (b11) {
                }
                a8Var.postOnAnimation(this);
            }
            f10 = f38;
            z9 = false;
            boolean z20222 = z16 | z9;
            while (size >= 0) {
            }
            if (!a8Var.S.isEmpty()) {
            }
            while (size2 >= 0) {
            }
            f11 = a8Var.U0;
            if (f11 < 1.0f) {
            }
            it = a8Var.f.values().iterator();
            boolean z21222 = false;
            while (it.hasNext()) {
            }
            y7 y7Var17222 = a8Var.N;
            y7Var17222.b = ((!a8Var.m0 && a8Var.o0 && y7Var17222.b > 0.0f) || z21222 || a8Var.f0) ? 1.0f : 0.0f;
            y7 y7Var18222 = a8Var.O;
            boolean z22222 = a8Var.t0;
            y7Var18222.b = (!z22222 || z21222 || a8Var.f0) ? 1.0f : 0.0f;
            if (a8Var.f0) {
            }
            b11 = b10 | a8Var.N.b(f10) | a8Var.O.b(f10) | a8Var.P.b(f10) | a8Var.Q.b(f10) | a8Var.R.b(f10);
            a8Var.c.setStickerImpact(a8Var.P.a);
            f6Var = a8Var.c;
            float max322 = Math.max(-1.0f, Math.min(1.0f, a8Var.Q.a));
            float max2222 = Math.max(-1.0f, Math.min(1.0f, a8Var.R.a));
            if (f6Var.b0 != 0) {
            }
            f13 = f6Var.b0 * max2222 * 10.0f;
            f14 = f6Var.c0 * max322 * 10.0f;
            a6Var = f6Var.D;
            if (a6Var.l0 == f13) {
            }
            a6Var.l0 = f13;
            a6Var.m0 = f14;
            a6Var.b(a6Var.c0, a6Var.f0);
            a8Var.a0 = a8Var.c.getCardRotationX();
            a8Var.b0 = a8Var.c.getCardRotationY();
            ArrayList arrayList3222 = a8Var.h;
            size3 = arrayList3222.size();
            i10 = i7;
            while (i10 < size3) {
            }
            a8Var.invalidate();
            a8Var.L.invalidate();
            a8Var.M.invalidate();
            if (b11) {
            }
            a8Var.postOnAnimation(this);
        }
    }
}
