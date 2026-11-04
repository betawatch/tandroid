package org.telegram.ui.Wallet;

import android.graphics.RectF;
import android.os.SystemClock;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ch0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w7 implements Runnable {
    public final /* synthetic */ b8 a;

    public w7(b8 b8Var) {
        this.a = b8Var;
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
        long j10;
        float f10;
        o7 o7Var;
        o7 o7Var2;
        o7 o7Var3;
        boolean z10;
        m2.t tVar;
        boolean z11;
        org.telegram.ui.Components.k9 k9Var;
        float[] D;
        a8 a8Var;
        RectF Z;
        o7 j11;
        int size;
        int size2;
        float f11;
        Iterator it;
        float f12;
        boolean b10;
        boolean b11;
        f6 f6Var;
        int i3;
        float f13;
        float f14;
        a6 a6Var;
        int size3;
        int i10;
        Iterator it2;
        String string;
        boolean z12;
        float f15;
        z7 z7Var;
        z7 z7Var2;
        boolean optBoolean;
        int i11;
        ei.c3 c3Var;
        float f16;
        float f17;
        float f18;
        float f19;
        o7 o7Var4;
        float f20;
        ch0 B;
        float f21;
        float f22;
        float f23;
        b8 b8Var = this.a;
        if (b8Var.b1 || !b8Var.isAttachedToWindow()) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j12 = 0;
        float min = b8Var.N0 == 0 ? 0.016666668f : Math.min(0.032f, (uptimeMillis - r4) / 1000.0f);
        b8Var.N0 = uptimeMillis;
        if (b8Var.A()) {
            Iterator it3 = b8Var.f.values().iterator();
            boolean z13 = false;
            while (true) {
                j10 = j12;
                if (!it3.hasNext()) {
                    break;
                }
                a8 a8Var2 = (a8) it3.next();
                boolean z14 = a8Var2.K;
                z7 z7Var3 = a8Var2.m;
                z7 z7Var4 = a8Var2.i;
                String str = a8Var2.a;
                z7 z7Var5 = a8Var2.j;
                ei.c3 c3Var2 = a8Var2.c;
                z7 z7Var6 = a8Var2.g;
                z7 z7Var7 = a8Var2.f;
                z7 z7Var8 = a8Var2.e;
                z7 z7Var9 = a8Var2.h;
                if (z14) {
                    it2 = it3;
                    f15 = min;
                    z12 = z13;
                } else {
                    a8Var2.K = true;
                    if (b8Var.b) {
                        it2 = it3;
                        string = null;
                    } else {
                        it2 = it3;
                        string = b8Var.e.getString(str, null);
                    }
                    if (b8Var.c1 != null) {
                        TL_wallet.cardSticker R = b8Var.R(str);
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
                                b8Var.K(a8Var2, mediaAreaCoordinates, optBoolean);
                            }
                            optBoolean = false;
                            b8Var.K(a8Var2, mediaAreaCoordinates, optBoolean);
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
                                    z7Var9.a((float) jSONObject.optDouble("s", 1.0d));
                                    z7Var = z7Var3;
                                    z7Var2 = z7Var5;
                                } catch (Exception unused2) {
                                    z7Var = z7Var3;
                                    z7Var2 = z7Var5;
                                }
                                try {
                                    z7Var4.a((float) jSONObject.optDouble("r", 0.0d));
                                    a8Var2.N = jSONObject.optBoolean("q");
                                    float[] fArr = {((float) jSONObject.getDouble("x")) * b8Var.Z0, ((float) jSONObject.getDouble("y")) * b8Var.a1, z7Var9.b};
                                    z7Var8.a(fArr[0]);
                                    z7Var7.a(fArr[1]);
                                    z7Var9.a(fArr[2]);
                                    a8Var2.H = 2;
                                    long j13 = b8Var.O0 + 1;
                                    b8Var.O0 = j13;
                                    a8Var2.I = j13;
                                    z7Var.a(1.0f);
                                    if (a8Var2.J == j10) {
                                        long j14 = b8Var.S0 + 1;
                                        b8Var.S0 = j14;
                                        a8Var2.J = j14;
                                    }
                                    str = str;
                                    try {
                                        if (str.equals(b8Var.Q0)) {
                                            b8Var.U0 = a8Var2;
                                            b8Var.T0 = a8Var2;
                                            b8Var.V0 = 1.0f;
                                            b8Var.e();
                                        }
                                    } catch (Exception unused3) {
                                    }
                                } catch (Exception unused4) {
                                    str = str;
                                    if (a8Var2.b()) {
                                    }
                                    while (r7 < r5) {
                                    }
                                    float f24 = f15;
                                    i11 = a8Var2.H;
                                    if (i11 == 1) {
                                    }
                                    z12 = true;
                                    if (!a8Var2.b()) {
                                    }
                                    B = c3Var.B();
                                    if (B == null) {
                                    }
                                    z13 = z12;
                                    j12 = j10;
                                    it3 = it2;
                                    min = f16;
                                }
                            } catch (Exception unused5) {
                            }
                            if (a8Var2.b()) {
                                a8Var2.a();
                            }
                            for (z7 z7Var10 : a8Var2.s) {
                                z12 |= z7Var10.b(f15);
                            }
                            float f242 = f15;
                            i11 = a8Var2.H;
                            if (i11 == 1) {
                                float t10 = Utilities.t(z7Var8.a + a8Var2.n.a, z7Var7.a + a8Var2.o.a, z7Var8.b, z7Var7.b);
                                if (a8Var2.M || z7Var2.a >= 0.36f || t10 >= org.telegram.messenger.g0.L(24.0f)) {
                                    f21 = 0.35f;
                                } else {
                                    a8Var2.M = true;
                                    ArrayList arrayList = b8Var.n;
                                    float f25 = z7Var8.b;
                                    f21 = 0.35f;
                                    float f26 = z7Var7.b;
                                    x7 x7Var = new x7();
                                    x7Var.a = f25;
                                    x7Var.b = f26;
                                    arrayList.add(x7Var);
                                }
                                if (a8Var2.L || z7Var2.a >= 0.22f || t10 >= org.telegram.messenger.g0.L(12.0f)) {
                                    f22 = t10;
                                    c3Var = c3Var2;
                                    f23 = 1.4f;
                                } else {
                                    a8Var2.L = true;
                                    z7 z7Var11 = a8Var2.p;
                                    z7Var11.a(1.0f);
                                    z7Var11.b = 0.0f;
                                    z7 z7Var12 = b8Var.Q;
                                    boolean z15 = a8Var2.P;
                                    float f27 = z15 ? 420.0f : 260.0f;
                                    float f28 = z15 ? 0.38f : 0.85f;
                                    z7Var12.d = f27;
                                    z7Var12.e = f28;
                                    z7Var12.c -= z15 ? 0.75f : 0.28f;
                                    float f29 = z15 ? 3.4f : 1.4f;
                                    z7 z7Var13 = b8Var.R;
                                    float f30 = z7Var13.c;
                                    float f31 = z7Var8.b;
                                    f23 = 1.4f;
                                    z7Var13.c = (((f31 / b8Var.Z0) - 0.5f) * 2.0f * f29) + f30;
                                    z7 z7Var14 = b8Var.S;
                                    float f32 = z7Var14.c;
                                    float f33 = z7Var7.b;
                                    f22 = t10;
                                    z7Var14.c = (((f33 / b8Var.a1) - 0.5f) * 2.0f * f29) + f32;
                                    if (z15) {
                                        Random random = new Random();
                                        int i12 = 0;
                                        while (i12 < 14) {
                                            y7 y7Var = new y7();
                                            ei.c3 c3Var3 = c3Var2;
                                            float nextFloat = (random.nextFloat() * f21) + ((float) ((i12 / 14.0f) * 3.141592653589793d * 2.0d));
                                            Random random2 = random;
                                            float nextFloat2 = (random.nextFloat() * org.telegram.messenger.g0.L(180.0f)) + org.telegram.messenger.g0.L(265.0f);
                                            y7Var.a = f31;
                                            y7Var.b = f33;
                                            double d = nextFloat;
                                            y7Var.c = ((float) Math.cos(d)) * nextFloat2;
                                            y7Var.d = ((float) Math.sin(d)) * nextFloat2;
                                            y7Var.e = (random2.nextFloat() * org.telegram.messenger.g0.L(1.1f)) + org.telegram.messenger.g0.L(0.8f);
                                            y7Var.f = (random2.nextFloat() * f21) + 0.7f;
                                            y7Var.g = random2.nextFloat() * 360.0f;
                                            b8Var.T.add(y7Var);
                                            i12++;
                                            random = random2;
                                            c3Var2 = c3Var3;
                                        }
                                    }
                                    c3Var = c3Var2;
                                    if (str.equals(b8Var.R0)) {
                                        b8Var.X(a8Var2, false);
                                        b8Var.R0 = null;
                                    }
                                }
                                if (!a8Var2.Q && a8Var2.k.a < 0.3f) {
                                    a8Var2.Q = true;
                                    z7Var6.c -= f23;
                                    b8Var.performHapticFeedback(3);
                                }
                                if (a8Var2.Q && f22 < 0.5f && Math.abs(z7Var6.a - 1.0f) < 0.004f && Math.abs(z7Var6.c) < 0.02f) {
                                    a8Var2.H = 2;
                                    z7Var8.a(z7Var8.b);
                                    z7Var7.a(z7Var7.b);
                                }
                                f16 = f242;
                            } else {
                                c3Var = c3Var2;
                                if (i11 == 4) {
                                    float f34 = 1.0f;
                                    float h = org.telegram.ui.Cells.f1.h(f242, a8Var2.b0, a8Var2.W, 1.0f);
                                    a8Var2.W = h;
                                    float f35 = 1.0f - h;
                                    float f36 = 1.0f - (f35 * f35);
                                    o7 j15 = b8Var.j(a8Var2);
                                    float l10 = Utilities.l(h / 0.5f);
                                    if (j15 != null) {
                                        f18 = 0.28f;
                                        f17 = h;
                                        f34 = 1.0f;
                                        f19 = org.telegram.messenger.g0.T1(a8Var2.c0, 1.0f, com.google.android.recaptcha.internal.a.B(l10, 2.0f, 3.0f, l10 * l10));
                                    } else {
                                        f17 = h;
                                        f18 = 0.28f;
                                        f19 = 1.0f;
                                    }
                                    if (j15 != null) {
                                        j15.setScaleX(f19);
                                        j15.setScaleY(f19);
                                    }
                                    RectF Z2 = b8Var.Z(a8Var2);
                                    if (Z2 == null) {
                                        z7Var6.a((f34 - f36) * a8Var2.Z);
                                        o7Var4 = j15;
                                        f16 = f242;
                                        f20 = 1.0f;
                                    } else {
                                        float sin = (float) Math.sin(f36 * 3.141592653589793d);
                                        f16 = f242;
                                        o7Var4 = j15;
                                        float min2 = Math.min(org.telegram.messenger.g0.L(90.0f), Utilities.t(Z2.centerX(), Z2.centerY(), a8Var2.X, a8Var2.Y) * f18);
                                        z7Var8.a(org.telegram.messenger.g0.T1(a8Var2.X, Z2.centerX(), f36));
                                        z7Var7.a(org.telegram.messenger.g0.T1(a8Var2.Y, Z2.centerY(), f36) - ((((1.0f - f36) * 2.0f) * f36) * min2));
                                        z7Var6.a(org.telegram.messenger.g0.T1(1.0f, f19, f36) * com.google.android.recaptcha.internal.a.A(sin, 0.05f, 1.0f, org.telegram.messenger.g0.T1(a8Var2.Z, (b8Var.f(a8Var2) * (Z2.width() / f19)) / b8Var.U(), f36)));
                                        z7Var2.a(sin * 0.8f);
                                        float f37 = a8Var2.a0;
                                        z7Var4.a((b8.c(-f37) * f36) + f37);
                                        f20 = 1.0f;
                                        z7Var.a(Utilities.l(1.0f - ((f36 - 0.35f) / 0.4f)));
                                    }
                                    if (f17 >= f20) {
                                        b8Var.g(a8Var2);
                                        if (o7Var4 != null) {
                                            o7Var4.animate().scaleX(0.955f).scaleY(0.955f).setDuration(70L).setInterpolator(null).withEndAction(new r7(o7Var4, 1)).start();
                                        }
                                    }
                                } else {
                                    f16 = f242;
                                    if (i11 == 5) {
                                        if (z7Var6.a < 0.03f) {
                                            b8Var.g(a8Var2);
                                        }
                                    }
                                    if (!a8Var2.b()) {
                                        a8Var2.R = true;
                                    } else if (a8Var2.H == 0) {
                                        a8Var2.R = false;
                                    }
                                    B = c3Var.B();
                                    if (B == null && B.l0) {
                                        ch0 B2 = c3Var.B();
                                        int i13 = B2 == null ? 0 : B2.b0;
                                        if (i13 >= 2) {
                                            a8Var2.T = true;
                                        }
                                        boolean z16 = a8Var2.S && !a8Var2.T && a8Var2.H == 2;
                                        if (a8Var2.l.b == 0.0f && !z16 && B2 != null && i13 < 2) {
                                            c3Var.Q0();
                                            c3Var.v0 = false;
                                            a8Var2.S = false;
                                        }
                                        z13 = true;
                                    } else {
                                        z13 = z12;
                                    }
                                    j12 = j10;
                                    it3 = it2;
                                    min = f16;
                                }
                            }
                            z12 = true;
                            if (!a8Var2.b()) {
                            }
                            B = c3Var.B();
                            if (B == null) {
                            }
                            z13 = z12;
                            j12 = j10;
                            it3 = it2;
                            min = f16;
                        }
                    }
                    f15 = min;
                }
                z7Var = z7Var3;
                z7Var2 = z7Var5;
                if (a8Var2.b()) {
                }
                while (r7 < r5) {
                }
                float f2422 = f15;
                i11 = a8Var2.H;
                if (i11 == 1) {
                }
                z12 = true;
                if (!a8Var2.b()) {
                }
                B = c3Var.B();
                if (B == null) {
                }
                z13 = z12;
                j12 = j10;
                it3 = it2;
                min = f16;
            }
            float f38 = min;
            boolean z17 = z13;
            z7 z7Var15 = b8Var.r1;
            z7 z7Var16 = b8Var.q1;
            boolean z18 = b8Var.b;
            if (!z18) {
                if (b8Var.i1) {
                    a8 a8Var3 = b8Var.l1;
                    if (a8Var3 != null && a8Var3.H == 0 && (j11 = b8Var.j(a8Var3)) != null && b8Var.z(j11) && b8.b(b8Var.l1)) {
                        a8Var = b8Var.l1;
                    } else {
                        ArrayList arrayList2 = b8Var.h;
                        int size4 = arrayList2.size();
                        int i14 = 0;
                        float f39 = 0.0f;
                        float f40 = 0.0f;
                        a8 a8Var4 = null;
                        while (i14 < size4) {
                            Object obj = arrayList2.get(i14);
                            i14++;
                            o7 o7Var5 = (o7) obj;
                            a8 a8Var5 = (a8) b8Var.f.get(o7Var5.x0.address);
                            if (a8Var5 != null && a8Var5.H == 0 && b8.b(a8Var5) && o7Var5.isAttachedToWindow() && b8Var.z(o7Var5) && (Z = b8Var.Z(a8Var5)) != null) {
                                if (a8Var4 != null) {
                                    float f41 = Z.top;
                                    if (f41 >= f39 - 1.0f) {
                                        if (Math.abs(f41 - f39) <= 1.0f && Z.left < f40) {
                                        }
                                    }
                                }
                                f39 = Z.top;
                                f40 = Z.left;
                                a8Var4 = a8Var5;
                            }
                        }
                        a8Var = a8Var4;
                    }
                    if (a8Var != null && a8Var != b8Var.l1) {
                        b8Var.l1 = a8Var;
                        b8Var.n1 = null;
                        b8Var.o1 = 0.0f;
                    }
                }
                a8 a8Var6 = b8Var.l1;
                o7 j16 = a8Var6 == null ? null : b8Var.j(a8Var6);
                boolean z19 = b8Var.i1 && a8Var6 != null && a8Var6.H == 0 && b8.b(a8Var6) && j16 != null && b8Var.z(j16) && !b8Var.t0 && !b8Var.q0;
                if (a8Var6 != null && (z19 || b8Var.j1)) {
                    a8Var6.a();
                    if (b8Var.n1 == null && a8Var6.u != null) {
                        b8Var.n1 = b8Var.x(a8Var6, b8Var.Z0 * 0.6f, b8Var.a1 * 0.68f, true);
                        a8Var6.N = false;
                    }
                }
                z7Var16.b = z19 ? 1.0f : 0.0f;
                z7Var15.b = ((!z19 && !b8Var.j1) || b8Var.n1 == null || b8.H(a8Var6) == null) ? 0.0f : 1.0f;
                f10 = f38;
                boolean b12 = z7Var16.b(f10) | z7Var15.b(f10);
                float f42 = z7Var16.a;
                boolean z20 = f42 > 0.002f || z7Var15.a > 0.002f;
                if (z20) {
                    b8Var.o1 += f10;
                } else {
                    b8Var.o1 = 0.0f;
                    if (!b8Var.i1 && !b8Var.j1) {
                        o7Var = null;
                        b8Var.n1 = null;
                        if (a8Var6 != null && a8Var6.H == 0 && a8Var6.v != null && f42 > 0.002f) {
                            D = b8Var.D(b8Var.o1 % 2.0f);
                            if (Utilities.l(z7Var16.a) * Math.max(D[0], Math.max(D[1], D[2])) >= 0.003f) {
                                o7Var2 = j16;
                                o7Var3 = b8Var.m1;
                                if (o7Var3 != null && o7Var3 != o7Var2) {
                                    k9Var = o7Var3.E;
                                    if (k9Var.getAlpha() != 1.0f) {
                                        k9Var.setAlpha(1.0f);
                                    }
                                    o7Var3.invalidate();
                                }
                                b8Var.m1 = o7Var2;
                                if (o7Var2 != null) {
                                    org.telegram.ui.Components.k9 k9Var2 = o7Var2.E;
                                    if (k9Var2.getAlpha() != 0.0f) {
                                        k9Var2.setAlpha(0.0f);
                                    }
                                    o7Var2.invalidate();
                                }
                                o7 o7Var6 = (z19 || z7Var16.a <= 0.5f) ? o7Var : j16;
                                RectF rectF = b8Var.w1;
                                if (b8Var.getParent() instanceof ViewGroup) {
                                    RectF Z3 = o7Var6 == null ? o7Var : b8Var.Z(b8Var.l1);
                                    if (Z3 != null) {
                                        gi.l3 l3Var = b8Var.x1;
                                        if (l3Var == null) {
                                            b8Var.x1 = b8Var.B(2131743115, true);
                                        } else if (b8Var.k1 && !(z11 = l3Var.W)) {
                                            b8Var.k1 = false;
                                            b8Var.j1 = false;
                                            b8Var.i1 = false;
                                            if (z11) {
                                                l3Var.f(true);
                                            }
                                            if (!z18) {
                                                hp.e1().edit().putBoolean("walletcardstickerhint", true).apply();
                                            }
                                            b8Var.f0();
                                        }
                                        b8.J(b8Var.x1, Z3.centerX(), Z3.top + org.telegram.messenger.g0.L(4.0f));
                                        gi.l3 l3Var2 = b8Var.x1;
                                        if (!l3Var2.W) {
                                            l3Var2.w();
                                        }
                                        b8Var.k1 = true;
                                    } else {
                                        b8Var.k1 = false;
                                        gi.l3 l3Var3 = b8Var.x1;
                                        if (l3Var3 != null && l3Var3.W) {
                                            l3Var3.f(true);
                                        }
                                    }
                                    if (b8Var.j1 && z7Var15.a > 0.5f && (tVar = b8Var.d) != null && tVar.v0() && b8Var.C()) {
                                        if (b8Var.y1 == null) {
                                            b8Var.y1 = b8Var.B(2131743116, false);
                                        }
                                        b8Var.v1.computeBounds(rectF, true);
                                        float[] L = b8Var.L(rectF.centerX(), rectF.top);
                                        if ((L[1] - org.telegram.messenger.g0.L(2.0f)) - org.telegram.messenger.g0.L(56.0f) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m) {
                                            float[] L2 = b8Var.L(rectF.centerX(), rectF.bottom);
                                            gi.l3 l3Var4 = b8Var.y1;
                                            float f43 = L2[0];
                                            float L3 = L2[1] + org.telegram.messenger.g0.L(2.0f);
                                            b8.o(l3Var4, 1);
                                            l3Var4.p(0.0f, f43 - l3Var4.getPaddingLeft());
                                            l3Var4.setTranslationY(L3);
                                            l3Var4.invalidate();
                                        } else {
                                            b8.J(b8Var.y1, L[0], L[1] - org.telegram.messenger.g0.L(2.0f));
                                        }
                                        gi.l3 l3Var5 = b8Var.y1;
                                        if (!l3Var5.W) {
                                            l3Var5.w();
                                        }
                                    } else {
                                        gi.l3 l3Var6 = b8Var.y1;
                                        if (l3Var6 != null && l3Var6.W) {
                                            l3Var6.f(true);
                                        }
                                    }
                                }
                                if (!b12 || z20) {
                                    z10 = true;
                                    boolean z21 = z17 | z10;
                                    for (size = b8Var.T.size() - 1; size >= 0; size--) {
                                        y7 y7Var2 = (y7) b8Var.T.get(size);
                                        y7Var2.h += f10;
                                        float exp = (float) Math.exp((-2.4f) * f10);
                                        float f44 = y7Var2.c * exp;
                                        y7Var2.c = f44;
                                        float f45 = y7Var2.d * exp;
                                        y7Var2.d = f45;
                                        y7Var2.a = (f44 * f10) + y7Var2.a;
                                        y7Var2.b = (f45 * f10) + y7Var2.b;
                                        y7Var2.g = (f10 * 90.0f) + y7Var2.g;
                                        if (y7Var2.h >= y7Var2.f) {
                                            b8Var.T.remove(size);
                                        }
                                    }
                                    if (!b8Var.T.isEmpty()) {
                                        z21 = true;
                                    }
                                    for (size2 = b8Var.n.size() - 1; size2 >= 0; size2--) {
                                        x7 x7Var2 = (x7) b8Var.n.get(size2);
                                        float f46 = x7Var2.c + f10;
                                        x7Var2.c = f46;
                                        if (f46 > 0.42f) {
                                            b8Var.n.remove(size2);
                                        }
                                    }
                                    f11 = b8Var.V0;
                                    if (f11 < 1.0f) {
                                        b8Var.V0 = org.telegram.ui.Cells.f1.h(f10, b8Var.Y0 ? 0.45f : 1.2f, f11, 1.0f);
                                        b8Var.e();
                                        z21 = true;
                                    }
                                    it = b8Var.f.values().iterator();
                                    boolean z22 = false;
                                    while (it.hasNext()) {
                                        if (((a8) it.next()).H == 5) {
                                            z22 = true;
                                        }
                                    }
                                    z7 z7Var17 = b8Var.O;
                                    z7Var17.b = ((!b8Var.n0 && b8Var.p0 && z7Var17.b > 0.0f) || z22 || b8Var.g0) ? 1.0f : 0.0f;
                                    z7 z7Var18 = b8Var.P;
                                    boolean z23 = b8Var.u0;
                                    z7Var18.b = (!z23 || z22 || b8Var.g0) ? 1.0f : 0.0f;
                                    if (b8Var.g0) {
                                        f12 = 0.0f;
                                        z7 z7Var19 = b8Var.d0;
                                        z7Var19.b = z23 ? 28.0f : 0.0f;
                                        b10 = z21 | z7Var19.b(f10);
                                    } else {
                                        z7 z7Var20 = b8Var.d0;
                                        z7Var20.a(Math.min(66.0f, (f10 * 60.0f) + z7Var20.a));
                                        z7 z7Var21 = b8Var.d0;
                                        if (z7Var21.a >= 66.0f) {
                                            b8Var.g0 = false;
                                            f12 = 0.0f;
                                            z7Var21.a(0.0f);
                                        } else {
                                            f12 = 0.0f;
                                        }
                                        b10 = true;
                                    }
                                    b11 = b10 | b8Var.O.b(f10) | b8Var.P.b(f10) | b8Var.Q.b(f10) | b8Var.R.b(f10) | b8Var.S.b(f10);
                                    b8Var.c.setStickerImpact(b8Var.Q.a);
                                    f6Var = b8Var.c;
                                    float max = Math.max(-1.0f, Math.min(1.0f, b8Var.R.a));
                                    float max2 = Math.max(-1.0f, Math.min(1.0f, b8Var.S.a));
                                    if (f6Var.c0 != 0) {
                                        fa.f fVar = new fa.f(4);
                                        float[] fArr2 = new float[8];
                                        fVar.f(1000, 600, 0.0f, 5.0f, false, fArr2);
                                        f6Var.d0 = Math.hypot((double) (fArr2[2] - fArr2[4]), (double) (fArr2[3] - fArr2[5])) < Math.hypot((double) (fArr2[0] - fArr2[6]), (double) (fArr2[1] - fArr2[7])) ? 1 : -1;
                                        fVar.f(1000, 600, 5.0f, 0.0f, false, fArr2);
                                        i3 = 0;
                                        f6Var.c0 = Math.hypot((double) (fArr2[4] - fArr2[6]), (double) (fArr2[5] - fArr2[7])) < Math.hypot((double) (fArr2[0] - fArr2[2]), (double) (fArr2[1] - fArr2[3])) ? 1 : -1;
                                    } else {
                                        i3 = 0;
                                    }
                                    f13 = f6Var.c0 * max2 * 10.0f;
                                    f14 = f6Var.d0 * max * 10.0f;
                                    a6Var = f6Var.E;
                                    if (a6Var.m0 == f13 || a6Var.n0 != f14) {
                                        a6Var.m0 = f13;
                                        a6Var.n0 = f14;
                                        a6Var.b(a6Var.d0, a6Var.g0);
                                    }
                                    b8Var.b0 = b8Var.c.getCardRotationX();
                                    b8Var.c0 = b8Var.c.getCardRotationY();
                                    ArrayList arrayList3 = b8Var.h;
                                    size3 = arrayList3.size();
                                    i10 = i3;
                                    while (i10 < size3) {
                                        Object obj2 = arrayList3.get(i10);
                                        i10++;
                                        o7 o7Var7 = (o7) obj2;
                                        a8 a8Var7 = (a8) b8Var.f.get(o7Var7.x0.address);
                                        if (a8Var7 != null) {
                                            o7Var7.k(a8Var7.R, true, a8Var7.H == 0 ? f12 : 1.0f);
                                        }
                                    }
                                    b8Var.invalidate();
                                    b8Var.M.invalidate();
                                    b8Var.N.invalidate();
                                    if (b11 && b8Var.n.isEmpty() && !b8Var.q0) {
                                        b8Var.N0 = j10;
                                        return;
                                    }
                                    b8Var.postOnAnimation(this);
                                }
                            }
                        }
                        o7Var2 = o7Var;
                        o7Var3 = b8Var.m1;
                        if (o7Var3 != null) {
                            k9Var = o7Var3.E;
                            if (k9Var.getAlpha() != 1.0f) {
                            }
                            o7Var3.invalidate();
                        }
                        b8Var.m1 = o7Var2;
                        if (o7Var2 != null) {
                        }
                        if (z19) {
                        }
                        RectF rectF2 = b8Var.w1;
                        if (b8Var.getParent() instanceof ViewGroup) {
                        }
                        if (!b12) {
                        }
                        z10 = true;
                        boolean z212 = z17 | z10;
                        while (size >= 0) {
                        }
                        if (!b8Var.T.isEmpty()) {
                        }
                        while (size2 >= 0) {
                        }
                        f11 = b8Var.V0;
                        if (f11 < 1.0f) {
                        }
                        it = b8Var.f.values().iterator();
                        boolean z222 = false;
                        while (it.hasNext()) {
                        }
                        z7 z7Var172 = b8Var.O;
                        z7Var172.b = ((!b8Var.n0 && b8Var.p0 && z7Var172.b > 0.0f) || z222 || b8Var.g0) ? 1.0f : 0.0f;
                        z7 z7Var182 = b8Var.P;
                        boolean z232 = b8Var.u0;
                        z7Var182.b = (!z232 || z222 || b8Var.g0) ? 1.0f : 0.0f;
                        if (b8Var.g0) {
                        }
                        b11 = b10 | b8Var.O.b(f10) | b8Var.P.b(f10) | b8Var.Q.b(f10) | b8Var.R.b(f10) | b8Var.S.b(f10);
                        b8Var.c.setStickerImpact(b8Var.Q.a);
                        f6Var = b8Var.c;
                        float max3 = Math.max(-1.0f, Math.min(1.0f, b8Var.R.a));
                        float max22 = Math.max(-1.0f, Math.min(1.0f, b8Var.S.a));
                        if (f6Var.c0 != 0) {
                        }
                        f13 = f6Var.c0 * max22 * 10.0f;
                        f14 = f6Var.d0 * max3 * 10.0f;
                        a6Var = f6Var.E;
                        if (a6Var.m0 == f13) {
                        }
                        a6Var.m0 = f13;
                        a6Var.n0 = f14;
                        a6Var.b(a6Var.d0, a6Var.g0);
                        b8Var.b0 = b8Var.c.getCardRotationX();
                        b8Var.c0 = b8Var.c.getCardRotationY();
                        ArrayList arrayList32 = b8Var.h;
                        size3 = arrayList32.size();
                        i10 = i3;
                        while (i10 < size3) {
                        }
                        b8Var.invalidate();
                        b8Var.M.invalidate();
                        b8Var.N.invalidate();
                        if (b11) {
                        }
                        b8Var.postOnAnimation(this);
                    }
                }
                o7Var = null;
                if (a8Var6 != null) {
                    D = b8Var.D(b8Var.o1 % 2.0f);
                    if (Utilities.l(z7Var16.a) * Math.max(D[0], Math.max(D[1], D[2])) >= 0.003f) {
                    }
                }
                o7Var2 = o7Var;
                o7Var3 = b8Var.m1;
                if (o7Var3 != null) {
                }
                b8Var.m1 = o7Var2;
                if (o7Var2 != null) {
                }
                if (z19) {
                }
                RectF rectF22 = b8Var.w1;
                if (b8Var.getParent() instanceof ViewGroup) {
                }
                if (!b12) {
                }
                z10 = true;
                boolean z2122 = z17 | z10;
                while (size >= 0) {
                }
                if (!b8Var.T.isEmpty()) {
                }
                while (size2 >= 0) {
                }
                f11 = b8Var.V0;
                if (f11 < 1.0f) {
                }
                it = b8Var.f.values().iterator();
                boolean z2222 = false;
                while (it.hasNext()) {
                }
                z7 z7Var1722 = b8Var.O;
                z7Var1722.b = ((!b8Var.n0 && b8Var.p0 && z7Var1722.b > 0.0f) || z2222 || b8Var.g0) ? 1.0f : 0.0f;
                z7 z7Var1822 = b8Var.P;
                boolean z2322 = b8Var.u0;
                z7Var1822.b = (!z2322 || z2222 || b8Var.g0) ? 1.0f : 0.0f;
                if (b8Var.g0) {
                }
                b11 = b10 | b8Var.O.b(f10) | b8Var.P.b(f10) | b8Var.Q.b(f10) | b8Var.R.b(f10) | b8Var.S.b(f10);
                b8Var.c.setStickerImpact(b8Var.Q.a);
                f6Var = b8Var.c;
                float max32 = Math.max(-1.0f, Math.min(1.0f, b8Var.R.a));
                float max222 = Math.max(-1.0f, Math.min(1.0f, b8Var.S.a));
                if (f6Var.c0 != 0) {
                }
                f13 = f6Var.c0 * max222 * 10.0f;
                f14 = f6Var.d0 * max32 * 10.0f;
                a6Var = f6Var.E;
                if (a6Var.m0 == f13) {
                }
                a6Var.m0 = f13;
                a6Var.n0 = f14;
                a6Var.b(a6Var.d0, a6Var.g0);
                b8Var.b0 = b8Var.c.getCardRotationX();
                b8Var.c0 = b8Var.c.getCardRotationY();
                ArrayList arrayList322 = b8Var.h;
                size3 = arrayList322.size();
                i10 = i3;
                while (i10 < size3) {
                }
                b8Var.invalidate();
                b8Var.M.invalidate();
                b8Var.N.invalidate();
                if (b11) {
                }
                b8Var.postOnAnimation(this);
            }
            f10 = f38;
            z10 = false;
            boolean z21222 = z17 | z10;
            while (size >= 0) {
            }
            if (!b8Var.T.isEmpty()) {
            }
            while (size2 >= 0) {
            }
            f11 = b8Var.V0;
            if (f11 < 1.0f) {
            }
            it = b8Var.f.values().iterator();
            boolean z22222 = false;
            while (it.hasNext()) {
            }
            z7 z7Var17222 = b8Var.O;
            z7Var17222.b = ((!b8Var.n0 && b8Var.p0 && z7Var17222.b > 0.0f) || z22222 || b8Var.g0) ? 1.0f : 0.0f;
            z7 z7Var18222 = b8Var.P;
            boolean z23222 = b8Var.u0;
            z7Var18222.b = (!z23222 || z22222 || b8Var.g0) ? 1.0f : 0.0f;
            if (b8Var.g0) {
            }
            b11 = b10 | b8Var.O.b(f10) | b8Var.P.b(f10) | b8Var.Q.b(f10) | b8Var.R.b(f10) | b8Var.S.b(f10);
            b8Var.c.setStickerImpact(b8Var.Q.a);
            f6Var = b8Var.c;
            float max322 = Math.max(-1.0f, Math.min(1.0f, b8Var.R.a));
            float max2222 = Math.max(-1.0f, Math.min(1.0f, b8Var.S.a));
            if (f6Var.c0 != 0) {
            }
            f13 = f6Var.c0 * max2222 * 10.0f;
            f14 = f6Var.d0 * max322 * 10.0f;
            a6Var = f6Var.E;
            if (a6Var.m0 == f13) {
            }
            a6Var.m0 = f13;
            a6Var.n0 = f14;
            a6Var.b(a6Var.d0, a6Var.g0);
            b8Var.b0 = b8Var.c.getCardRotationX();
            b8Var.c0 = b8Var.c.getCardRotationY();
            ArrayList arrayList3222 = b8Var.h;
            size3 = arrayList3222.size();
            i10 = i3;
            while (i10 < size3) {
            }
            b8Var.invalidate();
            b8Var.M.invalidate();
            b8Var.N.invalidate();
            if (b11) {
            }
            b8Var.postOnAnimation(this);
        }
    }
}
