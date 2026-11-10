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
import org.telegram.ui.Components.zg0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class y7 implements Runnable {
    public final /* synthetic */ d8 a;

    public y7(d8 d8Var) {
        this.a = d8Var;
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
        q7 q7Var;
        q7 q7Var2;
        q7 q7Var3;
        boolean z9;
        m4.d0 d0Var;
        boolean z10;
        org.telegram.ui.Components.k9 k9Var;
        float[] D;
        c8 c8Var;
        RectF Z;
        q7 j10;
        int size;
        int size2;
        float f11;
        Iterator it;
        float f12;
        boolean b10;
        boolean b11;
        i6 i6Var;
        int i7;
        float f13;
        float f14;
        d6 d6Var;
        int size3;
        int i10;
        Iterator it2;
        String string;
        boolean z11;
        float f15;
        b8 b8Var;
        b8 b8Var2;
        boolean optBoolean;
        int i11;
        di.z2 z2Var;
        float f16;
        float f17;
        float f18;
        float f19;
        q7 q7Var4;
        float f20;
        zg0 B;
        float f21;
        float f22;
        float f23;
        d8 d8Var = this.a;
        if (d8Var.a1 || !d8Var.isAttachedToWindow()) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j11 = 0;
        float min = d8Var.M0 == 0 ? 0.016666668f : Math.min(0.032f, (uptimeMillis - r4) / 1000.0f);
        d8Var.M0 = uptimeMillis;
        if (d8Var.A()) {
            Iterator it3 = d8Var.f.values().iterator();
            boolean z12 = false;
            while (true) {
                j3 = j11;
                if (!it3.hasNext()) {
                    break;
                }
                c8 c8Var2 = (c8) it3.next();
                boolean z13 = c8Var2.K;
                b8 b8Var3 = c8Var2.m;
                b8 b8Var4 = c8Var2.i;
                String str = c8Var2.a;
                b8 b8Var5 = c8Var2.j;
                di.z2 z2Var2 = c8Var2.c;
                b8 b8Var6 = c8Var2.g;
                b8 b8Var7 = c8Var2.f;
                b8 b8Var8 = c8Var2.e;
                b8 b8Var9 = c8Var2.h;
                if (z13) {
                    it2 = it3;
                    f15 = min;
                    z11 = z12;
                } else {
                    c8Var2.K = true;
                    if (d8Var.b) {
                        it2 = it3;
                        string = null;
                    } else {
                        it2 = it3;
                        string = d8Var.e.getString(str, null);
                    }
                    if (d8Var.b1 != null) {
                        TL_wallet.cardSticker R = d8Var.R(str);
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
                                d8Var.K(c8Var2, mediaAreaCoordinates, optBoolean);
                            }
                            optBoolean = false;
                            d8Var.K(c8Var2, mediaAreaCoordinates, optBoolean);
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
                                    b8Var9.a((float) jSONObject.optDouble("s", 1.0d));
                                    b8Var = b8Var3;
                                    b8Var2 = b8Var5;
                                } catch (Exception unused2) {
                                    b8Var = b8Var3;
                                    b8Var2 = b8Var5;
                                }
                                try {
                                    b8Var4.a((float) jSONObject.optDouble("r", 0.0d));
                                    c8Var2.N = jSONObject.optBoolean("q");
                                    float[] fArr = {((float) jSONObject.getDouble("x")) * d8Var.Y0, ((float) jSONObject.getDouble("y")) * d8Var.Z0, b8Var9.b};
                                    b8Var8.a(fArr[0]);
                                    b8Var7.a(fArr[1]);
                                    b8Var9.a(fArr[2]);
                                    c8Var2.H = 2;
                                    long j12 = d8Var.N0 + 1;
                                    d8Var.N0 = j12;
                                    c8Var2.I = j12;
                                    b8Var.a(1.0f);
                                    if (c8Var2.J == j3) {
                                        long j13 = d8Var.R0 + 1;
                                        d8Var.R0 = j13;
                                        c8Var2.J = j13;
                                    }
                                    str = str;
                                    try {
                                        if (str.equals(d8Var.P0)) {
                                            d8Var.T0 = c8Var2;
                                            d8Var.S0 = c8Var2;
                                            d8Var.U0 = 1.0f;
                                            d8Var.e();
                                        }
                                    } catch (Exception unused3) {
                                    }
                                } catch (Exception unused4) {
                                    str = str;
                                    if (c8Var2.b()) {
                                    }
                                    while (r7 < r5) {
                                    }
                                    float f24 = f15;
                                    i11 = c8Var2.H;
                                    if (i11 == 1) {
                                    }
                                    z11 = true;
                                    if (!c8Var2.b()) {
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
                            if (c8Var2.b()) {
                                c8Var2.a();
                            }
                            for (b8 b8Var10 : c8Var2.s) {
                                z11 |= b8Var10.b(f15);
                            }
                            float f242 = f15;
                            i11 = c8Var2.H;
                            if (i11 == 1) {
                                float t6 = Utilities.t(b8Var8.a + c8Var2.n.a, b8Var7.a + c8Var2.o.a, b8Var8.b, b8Var7.b);
                                if (c8Var2.M || b8Var2.a >= 0.36f || t6 >= org.telegram.messenger.g0.L(24.0f)) {
                                    f21 = 0.35f;
                                } else {
                                    c8Var2.M = true;
                                    ArrayList arrayList = d8Var.n;
                                    float f25 = b8Var8.b;
                                    f21 = 0.35f;
                                    float f26 = b8Var7.b;
                                    z7 z7Var = new z7();
                                    z7Var.a = f25;
                                    z7Var.b = f26;
                                    arrayList.add(z7Var);
                                }
                                if (c8Var2.L || b8Var2.a >= 0.22f || t6 >= org.telegram.messenger.g0.L(12.0f)) {
                                    f22 = t6;
                                    z2Var = z2Var2;
                                    f23 = 1.4f;
                                } else {
                                    c8Var2.L = true;
                                    b8 b8Var11 = c8Var2.p;
                                    b8Var11.a(1.0f);
                                    b8Var11.b = 0.0f;
                                    b8 b8Var12 = d8Var.P;
                                    boolean z14 = c8Var2.P;
                                    float f27 = z14 ? 420.0f : 260.0f;
                                    float f28 = z14 ? 0.38f : 0.85f;
                                    b8Var12.d = f27;
                                    b8Var12.e = f28;
                                    b8Var12.c -= z14 ? 0.75f : 0.28f;
                                    float f29 = z14 ? 3.4f : 1.4f;
                                    b8 b8Var13 = d8Var.Q;
                                    float f30 = b8Var13.c;
                                    float f31 = b8Var8.b;
                                    f23 = 1.4f;
                                    b8Var13.c = (((f31 / d8Var.Y0) - 0.5f) * 2.0f * f29) + f30;
                                    b8 b8Var14 = d8Var.R;
                                    float f32 = b8Var14.c;
                                    float f33 = b8Var7.b;
                                    f22 = t6;
                                    b8Var14.c = (((f33 / d8Var.Z0) - 0.5f) * 2.0f * f29) + f32;
                                    if (z14) {
                                        Random random = new Random();
                                        int i12 = 0;
                                        while (i12 < 14) {
                                            a8 a8Var = new a8();
                                            di.z2 z2Var3 = z2Var2;
                                            float nextFloat = (random.nextFloat() * f21) + ((float) ((i12 / 14.0f) * 3.141592653589793d * 2.0d));
                                            Random random2 = random;
                                            float nextFloat2 = (random.nextFloat() * org.telegram.messenger.g0.L(180.0f)) + org.telegram.messenger.g0.L(265.0f);
                                            a8Var.a = f31;
                                            a8Var.b = f33;
                                            double d = nextFloat;
                                            a8Var.c = ((float) Math.cos(d)) * nextFloat2;
                                            a8Var.d = ((float) Math.sin(d)) * nextFloat2;
                                            a8Var.e = (random2.nextFloat() * org.telegram.messenger.g0.L(1.1f)) + org.telegram.messenger.g0.L(0.8f);
                                            a8Var.f = (random2.nextFloat() * f21) + 0.7f;
                                            a8Var.g = random2.nextFloat() * 360.0f;
                                            d8Var.S.add(a8Var);
                                            i12++;
                                            random = random2;
                                            z2Var2 = z2Var3;
                                        }
                                    }
                                    z2Var = z2Var2;
                                    if (str.equals(d8Var.Q0)) {
                                        d8Var.X(c8Var2, false);
                                        d8Var.Q0 = null;
                                    }
                                }
                                if (!c8Var2.Q && c8Var2.k.a < 0.3f) {
                                    c8Var2.Q = true;
                                    b8Var6.c -= f23;
                                    d8Var.performHapticFeedback(3);
                                }
                                if (c8Var2.Q && f22 < 0.5f && Math.abs(b8Var6.a - 1.0f) < 0.004f && Math.abs(b8Var6.c) < 0.02f) {
                                    c8Var2.H = 2;
                                    b8Var8.a(b8Var8.b);
                                    b8Var7.a(b8Var7.b);
                                }
                                f16 = f242;
                            } else {
                                z2Var = z2Var2;
                                if (i11 == 4) {
                                    float f34 = 1.0f;
                                    float e10 = org.telegram.ui.Cells.f1.e(f242, c8Var2.b0, c8Var2.W, 1.0f);
                                    c8Var2.W = e10;
                                    float f35 = 1.0f - e10;
                                    float f36 = 1.0f - (f35 * f35);
                                    q7 j14 = d8Var.j(c8Var2);
                                    float l10 = Utilities.l(e10 / 0.5f);
                                    if (j14 != null) {
                                        f18 = 0.28f;
                                        f17 = e10;
                                        f34 = 1.0f;
                                        f19 = org.telegram.messenger.g0.T1(c8Var2.c0, 1.0f, com.google.android.recaptcha.internal.a.C(l10, 2.0f, 3.0f, l10 * l10));
                                    } else {
                                        f17 = e10;
                                        f18 = 0.28f;
                                        f19 = 1.0f;
                                    }
                                    if (j14 != null) {
                                        j14.setScaleX(f19);
                                        j14.setScaleY(f19);
                                    }
                                    RectF Z2 = d8Var.Z(c8Var2);
                                    if (Z2 == null) {
                                        b8Var6.a((f34 - f36) * c8Var2.Z);
                                        q7Var4 = j14;
                                        f16 = f242;
                                        f20 = 1.0f;
                                    } else {
                                        float sin = (float) Math.sin(f36 * 3.141592653589793d);
                                        f16 = f242;
                                        q7Var4 = j14;
                                        float min2 = Math.min(org.telegram.messenger.g0.L(90.0f), Utilities.t(Z2.centerX(), Z2.centerY(), c8Var2.X, c8Var2.Y) * f18);
                                        b8Var8.a(org.telegram.messenger.g0.T1(c8Var2.X, Z2.centerX(), f36));
                                        b8Var7.a(org.telegram.messenger.g0.T1(c8Var2.Y, Z2.centerY(), f36) - ((((1.0f - f36) * 2.0f) * f36) * min2));
                                        b8Var6.a(org.telegram.messenger.g0.T1(1.0f, f19, f36) * com.google.android.recaptcha.internal.a.B(sin, 0.05f, 1.0f, org.telegram.messenger.g0.T1(c8Var2.Z, (d8Var.f(c8Var2) * (Z2.width() / f19)) / d8Var.U(), f36)));
                                        b8Var2.a(sin * 0.8f);
                                        float f37 = c8Var2.a0;
                                        b8Var4.a((d8.c(-f37) * f36) + f37);
                                        f20 = 1.0f;
                                        b8Var.a(Utilities.l(1.0f - ((f36 - 0.35f) / 0.4f)));
                                    }
                                    if (f17 >= f20) {
                                        d8Var.g(c8Var2);
                                        if (q7Var4 != null) {
                                            q7Var4.animate().scaleX(0.955f).scaleY(0.955f).setDuration(70L).setInterpolator(null).withEndAction(new t7(q7Var4, 1)).start();
                                        }
                                    }
                                } else {
                                    f16 = f242;
                                    if (i11 == 5) {
                                        if (b8Var6.a < 0.03f) {
                                            d8Var.g(c8Var2);
                                        }
                                    }
                                    if (!c8Var2.b()) {
                                        c8Var2.R = true;
                                    } else if (c8Var2.H == 0) {
                                        c8Var2.R = false;
                                    }
                                    B = z2Var.B();
                                    if (B == null && B.k0) {
                                        zg0 B2 = z2Var.B();
                                        int i13 = B2 == null ? 0 : B2.a0;
                                        if (i13 >= 2) {
                                            c8Var2.T = true;
                                        }
                                        boolean z15 = c8Var2.S && !c8Var2.T && c8Var2.H == 2;
                                        if (c8Var2.l.b == 0.0f && !z15 && B2 != null && i13 < 2) {
                                            z2Var.Q0();
                                            z2Var.u0 = false;
                                            c8Var2.S = false;
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
                            if (!c8Var2.b()) {
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
                b8Var = b8Var3;
                b8Var2 = b8Var5;
                if (c8Var2.b()) {
                }
                while (r7 < r5) {
                }
                float f2422 = f15;
                i11 = c8Var2.H;
                if (i11 == 1) {
                }
                z11 = true;
                if (!c8Var2.b()) {
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
            b8 b8Var15 = d8Var.q1;
            b8 b8Var16 = d8Var.p1;
            boolean z17 = d8Var.b;
            if (!z17) {
                if (d8Var.h1) {
                    c8 c8Var3 = d8Var.k1;
                    if (c8Var3 != null && c8Var3.H == 0 && (j10 = d8Var.j(c8Var3)) != null && d8Var.z(j10) && d8.b(d8Var.k1)) {
                        c8Var = d8Var.k1;
                    } else {
                        ArrayList arrayList2 = d8Var.h;
                        int size4 = arrayList2.size();
                        int i14 = 0;
                        float f39 = 0.0f;
                        float f40 = 0.0f;
                        c8 c8Var4 = null;
                        while (i14 < size4) {
                            Object obj = arrayList2.get(i14);
                            i14++;
                            q7 q7Var5 = (q7) obj;
                            c8 c8Var5 = (c8) d8Var.f.get(q7Var5.w0.address);
                            if (c8Var5 != null && c8Var5.H == 0 && d8.b(c8Var5) && q7Var5.isAttachedToWindow() && d8Var.z(q7Var5) && (Z = d8Var.Z(c8Var5)) != null) {
                                if (c8Var4 != null) {
                                    float f41 = Z.top;
                                    if (f41 >= f39 - 1.0f) {
                                        if (Math.abs(f41 - f39) <= 1.0f && Z.left < f40) {
                                        }
                                    }
                                }
                                f39 = Z.top;
                                f40 = Z.left;
                                c8Var4 = c8Var5;
                            }
                        }
                        c8Var = c8Var4;
                    }
                    if (c8Var != null && c8Var != d8Var.k1) {
                        d8Var.k1 = c8Var;
                        d8Var.m1 = null;
                        d8Var.n1 = 0.0f;
                    }
                }
                c8 c8Var6 = d8Var.k1;
                q7 j15 = c8Var6 == null ? null : d8Var.j(c8Var6);
                boolean z18 = d8Var.h1 && c8Var6 != null && c8Var6.H == 0 && d8.b(c8Var6) && j15 != null && d8Var.z(j15) && !d8Var.s0 && !d8Var.p0;
                if (c8Var6 != null && (z18 || d8Var.i1)) {
                    c8Var6.a();
                    if (d8Var.m1 == null && c8Var6.u != null) {
                        d8Var.m1 = d8Var.x(c8Var6, d8Var.Y0 * 0.6f, d8Var.Z0 * 0.68f, true);
                        c8Var6.N = false;
                    }
                }
                b8Var16.b = z18 ? 1.0f : 0.0f;
                b8Var15.b = ((!z18 && !d8Var.i1) || d8Var.m1 == null || d8.H(c8Var6) == null) ? 0.0f : 1.0f;
                f10 = f38;
                boolean b12 = b8Var16.b(f10) | b8Var15.b(f10);
                float f42 = b8Var16.a;
                boolean z19 = f42 > 0.002f || b8Var15.a > 0.002f;
                if (z19) {
                    d8Var.n1 += f10;
                } else {
                    d8Var.n1 = 0.0f;
                    if (!d8Var.h1 && !d8Var.i1) {
                        q7Var = null;
                        d8Var.m1 = null;
                        if (c8Var6 != null && c8Var6.H == 0 && c8Var6.v != null && f42 > 0.002f) {
                            D = d8Var.D(d8Var.n1 % 2.0f);
                            if (Utilities.l(b8Var16.a) * Math.max(D[0], Math.max(D[1], D[2])) >= 0.003f) {
                                q7Var2 = j15;
                                q7Var3 = d8Var.l1;
                                if (q7Var3 != null && q7Var3 != q7Var2) {
                                    k9Var = q7Var3.D;
                                    if (k9Var.getAlpha() != 1.0f) {
                                        k9Var.setAlpha(1.0f);
                                    }
                                    q7Var3.invalidate();
                                }
                                d8Var.l1 = q7Var2;
                                if (q7Var2 != null) {
                                    org.telegram.ui.Components.k9 k9Var2 = q7Var2.D;
                                    if (k9Var2.getAlpha() != 0.0f) {
                                        k9Var2.setAlpha(0.0f);
                                    }
                                    q7Var2.invalidate();
                                }
                                q7 q7Var6 = (z18 || b8Var16.a <= 0.5f) ? q7Var : j15;
                                RectF rectF = d8Var.v1;
                                if (d8Var.getParent() instanceof ViewGroup) {
                                    RectF Z3 = q7Var6 == null ? q7Var : d8Var.Z(d8Var.k1);
                                    if (Z3 != null) {
                                        fi.m3 m3Var = d8Var.w1;
                                        if (m3Var == null) {
                                            d8Var.w1 = d8Var.B(2131743105, true);
                                        } else if (d8Var.j1 && !(z10 = m3Var.V)) {
                                            d8Var.j1 = false;
                                            d8Var.i1 = false;
                                            d8Var.h1 = false;
                                            if (z10) {
                                                m3Var.f(true);
                                            }
                                            if (!z17) {
                                                qp.e1().edit().putBoolean("walletcardstickerhint", true).apply();
                                            }
                                            d8Var.f0();
                                        }
                                        d8.J(d8Var.w1, Z3.centerX(), Z3.top + org.telegram.messenger.g0.L(4.0f));
                                        fi.m3 m3Var2 = d8Var.w1;
                                        if (!m3Var2.V) {
                                            m3Var2.w();
                                        }
                                        d8Var.j1 = true;
                                    } else {
                                        d8Var.j1 = false;
                                        fi.m3 m3Var3 = d8Var.w1;
                                        if (m3Var3 != null && m3Var3.V) {
                                            m3Var3.f(true);
                                        }
                                    }
                                    if (d8Var.i1 && b8Var15.a > 0.5f && (d0Var = d8Var.d) != null && d0Var.M() && d8Var.C()) {
                                        if (d8Var.x1 == null) {
                                            d8Var.x1 = d8Var.B(2131743106, false);
                                        }
                                        d8Var.u1.computeBounds(rectF, true);
                                        float[] L = d8Var.L(rectF.centerX(), rectF.top);
                                        if ((L[1] - org.telegram.messenger.g0.L(2.0f)) - org.telegram.messenger.g0.L(56.0f) < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.g0.m) {
                                            float[] L2 = d8Var.L(rectF.centerX(), rectF.bottom);
                                            fi.m3 m3Var4 = d8Var.x1;
                                            float f43 = L2[0];
                                            float L3 = L2[1] + org.telegram.messenger.g0.L(2.0f);
                                            d8.o(m3Var4, 1);
                                            m3Var4.p(0.0f, f43 - m3Var4.getPaddingLeft());
                                            m3Var4.setTranslationY(L3);
                                            m3Var4.invalidate();
                                        } else {
                                            d8.J(d8Var.x1, L[0], L[1] - org.telegram.messenger.g0.L(2.0f));
                                        }
                                        fi.m3 m3Var5 = d8Var.x1;
                                        if (!m3Var5.V) {
                                            m3Var5.w();
                                        }
                                    } else {
                                        fi.m3 m3Var6 = d8Var.x1;
                                        if (m3Var6 != null && m3Var6.V) {
                                            m3Var6.f(true);
                                        }
                                    }
                                }
                                if (!b12 || z19) {
                                    z9 = true;
                                    boolean z20 = z16 | z9;
                                    for (size = d8Var.S.size() - 1; size >= 0; size--) {
                                        a8 a8Var2 = (a8) d8Var.S.get(size);
                                        a8Var2.h += f10;
                                        float exp = (float) Math.exp((-2.4f) * f10);
                                        float f44 = a8Var2.c * exp;
                                        a8Var2.c = f44;
                                        float f45 = a8Var2.d * exp;
                                        a8Var2.d = f45;
                                        a8Var2.a = (f44 * f10) + a8Var2.a;
                                        a8Var2.b = (f45 * f10) + a8Var2.b;
                                        a8Var2.g = (f10 * 90.0f) + a8Var2.g;
                                        if (a8Var2.h >= a8Var2.f) {
                                            d8Var.S.remove(size);
                                        }
                                    }
                                    if (!d8Var.S.isEmpty()) {
                                        z20 = true;
                                    }
                                    for (size2 = d8Var.n.size() - 1; size2 >= 0; size2--) {
                                        z7 z7Var2 = (z7) d8Var.n.get(size2);
                                        float f46 = z7Var2.c + f10;
                                        z7Var2.c = f46;
                                        if (f46 > 0.42f) {
                                            d8Var.n.remove(size2);
                                        }
                                    }
                                    f11 = d8Var.U0;
                                    if (f11 < 1.0f) {
                                        d8Var.U0 = org.telegram.ui.Cells.f1.e(f10, d8Var.X0 ? 0.45f : 1.2f, f11, 1.0f);
                                        d8Var.e();
                                        z20 = true;
                                    }
                                    it = d8Var.f.values().iterator();
                                    boolean z21 = false;
                                    while (it.hasNext()) {
                                        if (((c8) it.next()).H == 5) {
                                            z21 = true;
                                        }
                                    }
                                    b8 b8Var17 = d8Var.N;
                                    b8Var17.b = ((!d8Var.m0 && d8Var.o0 && b8Var17.b > 0.0f) || z21 || d8Var.f0) ? 1.0f : 0.0f;
                                    b8 b8Var18 = d8Var.O;
                                    boolean z22 = d8Var.t0;
                                    b8Var18.b = (!z22 || z21 || d8Var.f0) ? 1.0f : 0.0f;
                                    if (d8Var.f0) {
                                        f12 = 0.0f;
                                        b8 b8Var19 = d8Var.c0;
                                        b8Var19.b = z22 ? 28.0f : 0.0f;
                                        b10 = z20 | b8Var19.b(f10);
                                    } else {
                                        b8 b8Var20 = d8Var.c0;
                                        b8Var20.a(Math.min(66.0f, (f10 * 60.0f) + b8Var20.a));
                                        b8 b8Var21 = d8Var.c0;
                                        if (b8Var21.a >= 66.0f) {
                                            d8Var.f0 = false;
                                            f12 = 0.0f;
                                            b8Var21.a(0.0f);
                                        } else {
                                            f12 = 0.0f;
                                        }
                                        b10 = true;
                                    }
                                    b11 = b10 | d8Var.N.b(f10) | d8Var.O.b(f10) | d8Var.P.b(f10) | d8Var.Q.b(f10) | d8Var.R.b(f10);
                                    d8Var.c.setStickerImpact(d8Var.P.a);
                                    i6Var = d8Var.c;
                                    float max = Math.max(-1.0f, Math.min(1.0f, d8Var.Q.a));
                                    float max2 = Math.max(-1.0f, Math.min(1.0f, d8Var.R.a));
                                    if (i6Var.b0 != 0) {
                                        ga.d dVar = new ga.d(4);
                                        float[] fArr2 = new float[8];
                                        dVar.f(1000, 600, 0.0f, 5.0f, false, fArr2);
                                        i6Var.c0 = Math.hypot((double) (fArr2[2] - fArr2[4]), (double) (fArr2[3] - fArr2[5])) < Math.hypot((double) (fArr2[0] - fArr2[6]), (double) (fArr2[1] - fArr2[7])) ? 1 : -1;
                                        dVar.f(1000, 600, 5.0f, 0.0f, false, fArr2);
                                        i7 = 0;
                                        i6Var.b0 = Math.hypot((double) (fArr2[4] - fArr2[6]), (double) (fArr2[5] - fArr2[7])) < Math.hypot((double) (fArr2[0] - fArr2[2]), (double) (fArr2[1] - fArr2[3])) ? 1 : -1;
                                    } else {
                                        i7 = 0;
                                    }
                                    f13 = i6Var.b0 * max2 * 10.0f;
                                    f14 = i6Var.c0 * max * 10.0f;
                                    d6Var = i6Var.D;
                                    if (d6Var.l0 == f13 || d6Var.m0 != f14) {
                                        d6Var.l0 = f13;
                                        d6Var.m0 = f14;
                                        d6Var.b(d6Var.c0, d6Var.f0);
                                    }
                                    d8Var.a0 = d8Var.c.getCardRotationX();
                                    d8Var.b0 = d8Var.c.getCardRotationY();
                                    ArrayList arrayList3 = d8Var.h;
                                    size3 = arrayList3.size();
                                    i10 = i7;
                                    while (i10 < size3) {
                                        Object obj2 = arrayList3.get(i10);
                                        i10++;
                                        q7 q7Var7 = (q7) obj2;
                                        c8 c8Var7 = (c8) d8Var.f.get(q7Var7.w0.address);
                                        if (c8Var7 != null) {
                                            q7Var7.k(c8Var7.R, true, c8Var7.H == 0 ? f12 : 1.0f);
                                        }
                                    }
                                    d8Var.invalidate();
                                    d8Var.L.invalidate();
                                    d8Var.M.invalidate();
                                    if (b11 && d8Var.n.isEmpty() && !d8Var.p0) {
                                        d8Var.M0 = j3;
                                        return;
                                    }
                                    d8Var.postOnAnimation(this);
                                }
                            }
                        }
                        q7Var2 = q7Var;
                        q7Var3 = d8Var.l1;
                        if (q7Var3 != null) {
                            k9Var = q7Var3.D;
                            if (k9Var.getAlpha() != 1.0f) {
                            }
                            q7Var3.invalidate();
                        }
                        d8Var.l1 = q7Var2;
                        if (q7Var2 != null) {
                        }
                        if (z18) {
                        }
                        RectF rectF2 = d8Var.v1;
                        if (d8Var.getParent() instanceof ViewGroup) {
                        }
                        if (!b12) {
                        }
                        z9 = true;
                        boolean z202 = z16 | z9;
                        while (size >= 0) {
                        }
                        if (!d8Var.S.isEmpty()) {
                        }
                        while (size2 >= 0) {
                        }
                        f11 = d8Var.U0;
                        if (f11 < 1.0f) {
                        }
                        it = d8Var.f.values().iterator();
                        boolean z212 = false;
                        while (it.hasNext()) {
                        }
                        b8 b8Var172 = d8Var.N;
                        b8Var172.b = ((!d8Var.m0 && d8Var.o0 && b8Var172.b > 0.0f) || z212 || d8Var.f0) ? 1.0f : 0.0f;
                        b8 b8Var182 = d8Var.O;
                        boolean z222 = d8Var.t0;
                        b8Var182.b = (!z222 || z212 || d8Var.f0) ? 1.0f : 0.0f;
                        if (d8Var.f0) {
                        }
                        b11 = b10 | d8Var.N.b(f10) | d8Var.O.b(f10) | d8Var.P.b(f10) | d8Var.Q.b(f10) | d8Var.R.b(f10);
                        d8Var.c.setStickerImpact(d8Var.P.a);
                        i6Var = d8Var.c;
                        float max3 = Math.max(-1.0f, Math.min(1.0f, d8Var.Q.a));
                        float max22 = Math.max(-1.0f, Math.min(1.0f, d8Var.R.a));
                        if (i6Var.b0 != 0) {
                        }
                        f13 = i6Var.b0 * max22 * 10.0f;
                        f14 = i6Var.c0 * max3 * 10.0f;
                        d6Var = i6Var.D;
                        if (d6Var.l0 == f13) {
                        }
                        d6Var.l0 = f13;
                        d6Var.m0 = f14;
                        d6Var.b(d6Var.c0, d6Var.f0);
                        d8Var.a0 = d8Var.c.getCardRotationX();
                        d8Var.b0 = d8Var.c.getCardRotationY();
                        ArrayList arrayList32 = d8Var.h;
                        size3 = arrayList32.size();
                        i10 = i7;
                        while (i10 < size3) {
                        }
                        d8Var.invalidate();
                        d8Var.L.invalidate();
                        d8Var.M.invalidate();
                        if (b11) {
                        }
                        d8Var.postOnAnimation(this);
                    }
                }
                q7Var = null;
                if (c8Var6 != null) {
                    D = d8Var.D(d8Var.n1 % 2.0f);
                    if (Utilities.l(b8Var16.a) * Math.max(D[0], Math.max(D[1], D[2])) >= 0.003f) {
                    }
                }
                q7Var2 = q7Var;
                q7Var3 = d8Var.l1;
                if (q7Var3 != null) {
                }
                d8Var.l1 = q7Var2;
                if (q7Var2 != null) {
                }
                if (z18) {
                }
                RectF rectF22 = d8Var.v1;
                if (d8Var.getParent() instanceof ViewGroup) {
                }
                if (!b12) {
                }
                z9 = true;
                boolean z2022 = z16 | z9;
                while (size >= 0) {
                }
                if (!d8Var.S.isEmpty()) {
                }
                while (size2 >= 0) {
                }
                f11 = d8Var.U0;
                if (f11 < 1.0f) {
                }
                it = d8Var.f.values().iterator();
                boolean z2122 = false;
                while (it.hasNext()) {
                }
                b8 b8Var1722 = d8Var.N;
                b8Var1722.b = ((!d8Var.m0 && d8Var.o0 && b8Var1722.b > 0.0f) || z2122 || d8Var.f0) ? 1.0f : 0.0f;
                b8 b8Var1822 = d8Var.O;
                boolean z2222 = d8Var.t0;
                b8Var1822.b = (!z2222 || z2122 || d8Var.f0) ? 1.0f : 0.0f;
                if (d8Var.f0) {
                }
                b11 = b10 | d8Var.N.b(f10) | d8Var.O.b(f10) | d8Var.P.b(f10) | d8Var.Q.b(f10) | d8Var.R.b(f10);
                d8Var.c.setStickerImpact(d8Var.P.a);
                i6Var = d8Var.c;
                float max32 = Math.max(-1.0f, Math.min(1.0f, d8Var.Q.a));
                float max222 = Math.max(-1.0f, Math.min(1.0f, d8Var.R.a));
                if (i6Var.b0 != 0) {
                }
                f13 = i6Var.b0 * max222 * 10.0f;
                f14 = i6Var.c0 * max32 * 10.0f;
                d6Var = i6Var.D;
                if (d6Var.l0 == f13) {
                }
                d6Var.l0 = f13;
                d6Var.m0 = f14;
                d6Var.b(d6Var.c0, d6Var.f0);
                d8Var.a0 = d8Var.c.getCardRotationX();
                d8Var.b0 = d8Var.c.getCardRotationY();
                ArrayList arrayList322 = d8Var.h;
                size3 = arrayList322.size();
                i10 = i7;
                while (i10 < size3) {
                }
                d8Var.invalidate();
                d8Var.L.invalidate();
                d8Var.M.invalidate();
                if (b11) {
                }
                d8Var.postOnAnimation(this);
            }
            f10 = f38;
            z9 = false;
            boolean z20222 = z16 | z9;
            while (size >= 0) {
            }
            if (!d8Var.S.isEmpty()) {
            }
            while (size2 >= 0) {
            }
            f11 = d8Var.U0;
            if (f11 < 1.0f) {
            }
            it = d8Var.f.values().iterator();
            boolean z21222 = false;
            while (it.hasNext()) {
            }
            b8 b8Var17222 = d8Var.N;
            b8Var17222.b = ((!d8Var.m0 && d8Var.o0 && b8Var17222.b > 0.0f) || z21222 || d8Var.f0) ? 1.0f : 0.0f;
            b8 b8Var18222 = d8Var.O;
            boolean z22222 = d8Var.t0;
            b8Var18222.b = (!z22222 || z21222 || d8Var.f0) ? 1.0f : 0.0f;
            if (d8Var.f0) {
            }
            b11 = b10 | d8Var.N.b(f10) | d8Var.O.b(f10) | d8Var.P.b(f10) | d8Var.Q.b(f10) | d8Var.R.b(f10);
            d8Var.c.setStickerImpact(d8Var.P.a);
            i6Var = d8Var.c;
            float max322 = Math.max(-1.0f, Math.min(1.0f, d8Var.Q.a));
            float max2222 = Math.max(-1.0f, Math.min(1.0f, d8Var.R.a));
            if (i6Var.b0 != 0) {
            }
            f13 = i6Var.b0 * max2222 * 10.0f;
            f14 = i6Var.c0 * max322 * 10.0f;
            d6Var = i6Var.D;
            if (d6Var.l0 == f13) {
            }
            d6Var.l0 = f13;
            d6Var.m0 = f14;
            d6Var.b(d6Var.c0, d6Var.f0);
            d8Var.a0 = d8Var.c.getCardRotationX();
            d8Var.b0 = d8Var.c.getCardRotationY();
            ArrayList arrayList3222 = d8Var.h;
            size3 = arrayList3222.size();
            i10 = i7;
            while (i10 < size3) {
            }
            d8Var.invalidate();
            d8Var.L.invalidate();
            d8Var.M.invalidate();
            if (b11) {
            }
            d8Var.postOnAnimation(this);
        }
    }
}
