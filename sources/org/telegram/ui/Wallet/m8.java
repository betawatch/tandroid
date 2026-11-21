package org.telegram.ui.Wallet;

import android.graphics.RectF;
import android.os.SystemClock;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.mp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.oh0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class m8 implements Runnable {
    public final /* synthetic */ r8 a;

    public m8(r8 r8Var) {
        this.a = r8Var;
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
        e8 e8Var;
        e8 e8Var2;
        e8 e8Var3;
        boolean z10;
        k8.a aVar;
        boolean z11;
        org.telegram.ui.Components.q9 q9Var;
        float[] D;
        q8 q8Var;
        RectF Z;
        e8 j10;
        int size;
        int size2;
        float f11;
        Iterator it;
        float f12;
        boolean b10;
        boolean b11;
        x6 x6Var;
        int i7;
        float f13;
        float f14;
        s6 s6Var;
        int size3;
        int i10;
        Iterator it2;
        String string;
        boolean z12;
        float f15;
        p8 p8Var;
        p8 p8Var2;
        boolean optBoolean;
        int i11;
        fi.s2 s2Var;
        float f16;
        float f17;
        float f18;
        float f19;
        e8 e8Var4;
        float f20;
        oh0 B;
        float f21;
        float f22;
        p8 p8Var3;
        float f23;
        r8 r8Var = this.a;
        if (r8Var.b1 || !r8Var.isAttachedToWindow()) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j11 = 0;
        float min = r8Var.N0 == 0 ? 0.016666668f : Math.min(0.032f, (uptimeMillis - r4) / 1000.0f);
        r8Var.N0 = uptimeMillis;
        if (r8Var.A()) {
            Iterator it3 = r8Var.f.values().iterator();
            boolean z13 = false;
            while (true) {
                j3 = j11;
                if (!it3.hasNext()) {
                    break;
                }
                q8 q8Var2 = (q8) it3.next();
                boolean z14 = q8Var2.K;
                p8 p8Var4 = q8Var2.m;
                p8 p8Var5 = q8Var2.i;
                String str = q8Var2.a;
                p8 p8Var6 = q8Var2.j;
                fi.s2 s2Var2 = q8Var2.c;
                p8 p8Var7 = q8Var2.g;
                p8 p8Var8 = q8Var2.f;
                p8 p8Var9 = q8Var2.e;
                p8 p8Var10 = q8Var2.h;
                if (z14) {
                    it2 = it3;
                    f15 = min;
                    z12 = z13;
                } else {
                    q8Var2.K = true;
                    if (r8Var.b) {
                        it2 = it3;
                        string = null;
                    } else {
                        it2 = it3;
                        string = r8Var.e.getString(str, null);
                    }
                    if (r8Var.c1 != null) {
                        TL_wallet.cardSticker R = r8Var.R(str);
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
                                r8Var.K(q8Var2, mediaAreaCoordinates, optBoolean);
                            }
                            optBoolean = false;
                            r8Var.K(q8Var2, mediaAreaCoordinates, optBoolean);
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
                                    p8Var10.a((float) jSONObject.optDouble("s", 1.0d));
                                    p8Var = p8Var4;
                                    p8Var2 = p8Var6;
                                } catch (Exception unused2) {
                                    p8Var = p8Var4;
                                    p8Var2 = p8Var6;
                                }
                                try {
                                    p8Var5.a((float) jSONObject.optDouble("r", 0.0d));
                                    q8Var2.N = jSONObject.optBoolean("q");
                                    float[] fArr = {((float) jSONObject.getDouble("x")) * r8Var.Z0, ((float) jSONObject.getDouble("y")) * r8Var.a1, p8Var10.b};
                                    p8Var9.a(fArr[0]);
                                    p8Var8.a(fArr[1]);
                                    p8Var10.a(fArr[2]);
                                    q8Var2.H = 2;
                                    long j12 = r8Var.O0 + 1;
                                    r8Var.O0 = j12;
                                    q8Var2.I = j12;
                                    p8Var.a(1.0f);
                                    if (q8Var2.J == j3) {
                                        long j13 = r8Var.S0 + 1;
                                        r8Var.S0 = j13;
                                        q8Var2.J = j13;
                                    }
                                    str = str;
                                    try {
                                        if (str.equals(r8Var.Q0)) {
                                            r8Var.U0 = q8Var2;
                                            r8Var.T0 = q8Var2;
                                            r8Var.V0 = 1.0f;
                                            r8Var.e();
                                        }
                                    } catch (Exception unused3) {
                                    }
                                } catch (Exception unused4) {
                                    str = str;
                                    if (q8Var2.b()) {
                                    }
                                    while (r7 < r5) {
                                    }
                                    float f24 = f15;
                                    i11 = q8Var2.H;
                                    if (i11 == 1) {
                                    }
                                    z12 = true;
                                    if (!q8Var2.b()) {
                                    }
                                    B = s2Var.B();
                                    if (B == null) {
                                    }
                                    z13 = z12;
                                    j11 = j3;
                                    it3 = it2;
                                    min = f16;
                                }
                            } catch (Exception unused5) {
                            }
                            if (q8Var2.b()) {
                                q8Var2.a();
                            }
                            for (p8 p8Var11 : q8Var2.s) {
                                z12 |= p8Var11.b(f15);
                            }
                            float f242 = f15;
                            i11 = q8Var2.H;
                            if (i11 == 1) {
                                float t6 = Utilities.t(p8Var9.a + q8Var2.n.a, p8Var8.a + q8Var2.o.a, p8Var9.b, p8Var8.b);
                                if (q8Var2.M || p8Var2.a >= 0.36f || t6 >= org.telegram.messenger.g0.L(24.0f)) {
                                    f21 = 0.28f;
                                } else {
                                    q8Var2.M = true;
                                    ArrayList arrayList = r8Var.n;
                                    float f25 = p8Var9.b;
                                    f21 = 0.28f;
                                    float f26 = p8Var8.b;
                                    n8 n8Var = new n8();
                                    n8Var.a = f25;
                                    n8Var.b = f26;
                                    arrayList.add(n8Var);
                                }
                                if (q8Var2.L || p8Var2.a >= 0.22f || t6 >= org.telegram.messenger.g0.L(12.0f)) {
                                    f22 = t6;
                                    p8Var3 = p8Var8;
                                    f23 = 1.4f;
                                } else {
                                    q8Var2.L = true;
                                    p8 p8Var12 = q8Var2.p;
                                    p8Var12.a(1.0f);
                                    p8Var12.b = 0.0f;
                                    p8 p8Var13 = r8Var.Q;
                                    boolean z15 = q8Var2.P;
                                    float f27 = z15 ? 420.0f : 260.0f;
                                    float f28 = z15 ? 0.38f : 0.85f;
                                    p8Var13.d = f27;
                                    p8Var13.e = f28;
                                    p8Var13.c -= z15 ? 0.75f : f21;
                                    float f29 = z15 ? 3.4f : 1.4f;
                                    p8 p8Var14 = r8Var.R;
                                    float f30 = p8Var14.c;
                                    f23 = 1.4f;
                                    float f31 = p8Var9.b;
                                    p8Var14.c = (((f31 / r8Var.Z0) - 0.5f) * 2.0f * f29) + f30;
                                    p8 p8Var15 = r8Var.S;
                                    float f32 = p8Var15.c;
                                    float f33 = p8Var8.b;
                                    f22 = t6;
                                    p8Var15.c = (((f33 / r8Var.a1) - 0.5f) * 2.0f * f29) + f32;
                                    if (z15) {
                                        Random random = new Random();
                                        int i12 = 0;
                                        while (i12 < 14) {
                                            o8 o8Var = new o8();
                                            float h = org.telegram.ui.Cells.c0.h(random, 0.35f, (float) ((i12 / 14.0f) * 3.141592653589793d * 2.0d));
                                            float nextFloat = (random.nextFloat() * org.telegram.messenger.g0.L(180.0f)) + org.telegram.messenger.g0.L(265.0f);
                                            o8Var.a = f31;
                                            o8Var.b = f33;
                                            double d = h;
                                            o8Var.c = ((float) Math.cos(d)) * nextFloat;
                                            o8Var.d = ((float) Math.sin(d)) * nextFloat;
                                            o8Var.e = (random.nextFloat() * org.telegram.messenger.g0.L(1.1f)) + org.telegram.messenger.g0.L(0.8f);
                                            o8Var.f = org.telegram.ui.Cells.c0.h(random, 0.35f, 0.7f);
                                            o8Var.g = random.nextFloat() * 360.0f;
                                            r8Var.T.add(o8Var);
                                            i12++;
                                            f31 = f31;
                                            p8Var8 = p8Var8;
                                        }
                                    }
                                    p8Var3 = p8Var8;
                                    if (str.equals(r8Var.R0)) {
                                        r8Var.X(q8Var2, false);
                                        r8Var.R0 = null;
                                    }
                                }
                                if (!q8Var2.Q && q8Var2.k.a < 0.3f) {
                                    q8Var2.Q = true;
                                    p8Var7.c -= f23;
                                    r8Var.performHapticFeedback(3);
                                }
                                if (q8Var2.Q && f22 < 0.5f && Math.abs(p8Var7.a - 1.0f) < 0.004f && Math.abs(p8Var7.c) < 0.02f) {
                                    q8Var2.H = 2;
                                    p8Var9.a(p8Var9.b);
                                    p8 p8Var16 = p8Var3;
                                    p8Var16.a(p8Var16.b);
                                }
                                s2Var = s2Var2;
                                f16 = f242;
                            } else if (i11 == 4) {
                                float f34 = org.telegram.ui.Cells.c0.f(f242, q8Var2.b0, q8Var2.W, 1.0f);
                                q8Var2.W = f34;
                                float f35 = 1.0f - f34;
                                float f36 = 1.0f - (f35 * f35);
                                e8 j14 = r8Var.j(q8Var2);
                                float l10 = Utilities.l(f34 / 0.5f);
                                if (j14 != null) {
                                    f17 = f34;
                                    f16 = f242;
                                    f18 = 1.0f;
                                    f19 = org.telegram.messenger.g0.T1(q8Var2.c0, 1.0f, com.google.android.gms.internal.vision.e2.C(l10, 2.0f, 3.0f, l10 * l10));
                                } else {
                                    f17 = f34;
                                    f18 = 1.0f;
                                    f16 = f242;
                                    f19 = 1.0f;
                                }
                                if (j14 != null) {
                                    j14.setScaleX(f19);
                                    j14.setScaleY(f19);
                                }
                                RectF Z2 = r8Var.Z(q8Var2);
                                if (Z2 == null) {
                                    p8Var7.a((f18 - f36) * q8Var2.Z);
                                    s2Var = s2Var2;
                                    e8Var4 = j14;
                                    f20 = 1.0f;
                                } else {
                                    float sin = (float) Math.sin(f36 * 3.141592653589793d);
                                    s2Var = s2Var2;
                                    e8Var4 = j14;
                                    float min2 = Math.min(org.telegram.messenger.g0.L(90.0f), Utilities.t(Z2.centerX(), Z2.centerY(), q8Var2.X, q8Var2.Y) * 0.28f);
                                    p8Var9.a(org.telegram.messenger.g0.T1(q8Var2.X, Z2.centerX(), f36));
                                    p8Var8.a(org.telegram.messenger.g0.T1(q8Var2.Y, Z2.centerY(), f36) - ((((1.0f - f36) * 2.0f) * f36) * min2));
                                    p8Var7.a(org.telegram.messenger.g0.T1(1.0f, f19, f36) * com.google.android.gms.internal.vision.e2.B(sin, 0.05f, 1.0f, org.telegram.messenger.g0.T1(q8Var2.Z, (r8Var.f(q8Var2) * (Z2.width() / f19)) / r8Var.U(), f36)));
                                    p8Var2.a(sin * 0.8f);
                                    float f37 = q8Var2.a0;
                                    p8Var5.a((r8.c(-f37) * f36) + f37);
                                    f20 = 1.0f;
                                    p8Var.a(Utilities.l(1.0f - ((f36 - 0.35f) / 0.4f)));
                                }
                                if (f17 >= f20) {
                                    r8Var.g(q8Var2);
                                    if (e8Var4 != null) {
                                        e8Var4.animate().scaleX(0.955f).scaleY(0.955f).setDuration(70L).setInterpolator(null).withEndAction(new i8(e8Var4, 1)).start();
                                    }
                                }
                            } else {
                                s2Var = s2Var2;
                                f16 = f242;
                                if (i11 == 5) {
                                    if (p8Var7.a < 0.03f) {
                                        r8Var.g(q8Var2);
                                    }
                                }
                                if (!q8Var2.b()) {
                                    q8Var2.R = true;
                                } else if (q8Var2.H == 0) {
                                    q8Var2.R = false;
                                }
                                B = s2Var.B();
                                if (B == null && B.l0) {
                                    oh0 B2 = s2Var.B();
                                    int i13 = B2 == null ? 0 : B2.b0;
                                    if (i13 >= 2) {
                                        q8Var2.T = true;
                                    }
                                    boolean z16 = q8Var2.S && !q8Var2.T && q8Var2.H == 2;
                                    if (q8Var2.l.b == 0.0f && !z16 && B2 != null && i13 < 2) {
                                        s2Var.Q0();
                                        s2Var.v0 = false;
                                        q8Var2.S = false;
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
                            if (!q8Var2.b()) {
                            }
                            B = s2Var.B();
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
                p8Var = p8Var4;
                p8Var2 = p8Var6;
                if (q8Var2.b()) {
                }
                while (r7 < r5) {
                }
                float f2422 = f15;
                i11 = q8Var2.H;
                if (i11 == 1) {
                }
                z12 = true;
                if (!q8Var2.b()) {
                }
                B = s2Var.B();
                if (B == null) {
                }
                z13 = z12;
                j11 = j3;
                it3 = it2;
                min = f16;
            }
            float f38 = min;
            boolean z17 = z13;
            p8 p8Var17 = r8Var.r1;
            p8 p8Var18 = r8Var.q1;
            boolean z18 = r8Var.b;
            if (!z18) {
                if (r8Var.i1) {
                    q8 q8Var3 = r8Var.l1;
                    if (q8Var3 != null && q8Var3.H == 0 && (j10 = r8Var.j(q8Var3)) != null && r8Var.z(j10) && r8.b(r8Var.l1)) {
                        q8Var = r8Var.l1;
                    } else {
                        ArrayList arrayList2 = r8Var.h;
                        int size4 = arrayList2.size();
                        int i14 = 0;
                        float f39 = 0.0f;
                        float f40 = 0.0f;
                        q8 q8Var4 = null;
                        while (i14 < size4) {
                            Object obj = arrayList2.get(i14);
                            i14++;
                            e8 e8Var5 = (e8) obj;
                            q8 q8Var5 = (q8) r8Var.f.get(e8Var5.x0.address);
                            if (q8Var5 != null && q8Var5.H == 0 && r8.b(q8Var5) && e8Var5.isAttachedToWindow() && r8Var.z(e8Var5) && (Z = r8Var.Z(q8Var5)) != null) {
                                if (q8Var4 != null) {
                                    float f41 = Z.top;
                                    if (f41 >= f39 - 1.0f) {
                                        if (Math.abs(f41 - f39) <= 1.0f && Z.left < f40) {
                                        }
                                    }
                                }
                                f39 = Z.top;
                                f40 = Z.left;
                                q8Var4 = q8Var5;
                            }
                        }
                        q8Var = q8Var4;
                    }
                    if (q8Var != null && q8Var != r8Var.l1) {
                        r8Var.l1 = q8Var;
                        r8Var.n1 = null;
                        r8Var.o1 = 0.0f;
                    }
                }
                q8 q8Var6 = r8Var.l1;
                e8 j15 = q8Var6 == null ? null : r8Var.j(q8Var6);
                boolean z19 = r8Var.i1 && q8Var6 != null && q8Var6.H == 0 && r8.b(q8Var6) && j15 != null && r8Var.z(j15) && !r8Var.t0 && !r8Var.q0;
                if (q8Var6 != null && (z19 || r8Var.j1)) {
                    q8Var6.a();
                    if (r8Var.n1 == null && q8Var6.u != null) {
                        r8Var.n1 = r8Var.x(q8Var6, r8Var.Z0 * 0.6f, r8Var.a1 * 0.68f, true);
                        q8Var6.N = false;
                    }
                }
                p8Var18.b = z19 ? 1.0f : 0.0f;
                p8Var17.b = ((!z19 && !r8Var.j1) || r8Var.n1 == null || r8.H(q8Var6) == null) ? 0.0f : 1.0f;
                f10 = f38;
                boolean b12 = p8Var18.b(f10) | p8Var17.b(f10);
                float f42 = p8Var18.a;
                boolean z20 = f42 > 0.002f || p8Var17.a > 0.002f;
                if (z20) {
                    r8Var.o1 += f10;
                } else {
                    r8Var.o1 = 0.0f;
                    if (!r8Var.i1 && !r8Var.j1) {
                        e8Var = null;
                        r8Var.n1 = null;
                        if (q8Var6 != null && q8Var6.H == 0 && q8Var6.v != null && f42 > 0.002f) {
                            D = r8Var.D(r8Var.o1 % 2.0f);
                            if (Utilities.l(p8Var18.a) * Math.max(D[0], Math.max(D[1], D[2])) >= 0.003f) {
                                e8Var2 = j15;
                                e8Var3 = r8Var.m1;
                                if (e8Var3 != null && e8Var3 != e8Var2) {
                                    q9Var = e8Var3.E;
                                    if (q9Var.getAlpha() != 1.0f) {
                                        q9Var.setAlpha(1.0f);
                                    }
                                    e8Var3.invalidate();
                                }
                                r8Var.m1 = e8Var2;
                                if (e8Var2 != null) {
                                    org.telegram.ui.Components.q9 q9Var2 = e8Var2.E;
                                    if (q9Var2.getAlpha() != 0.0f) {
                                        q9Var2.setAlpha(0.0f);
                                    }
                                    e8Var2.invalidate();
                                }
                                e8 e8Var6 = (z19 || p8Var18.a <= 0.5f) ? e8Var : j15;
                                RectF rectF = r8Var.w1;
                                if (r8Var.getParent() instanceof ViewGroup) {
                                    RectF Z3 = e8Var6 == null ? e8Var : r8Var.Z(r8Var.l1);
                                    if (Z3 != null) {
                                        hi.l3 l3Var = r8Var.x1;
                                        if (l3Var == null) {
                                            r8Var.x1 = r8Var.B(2131742860, true);
                                        } else if (r8Var.k1 && !(z11 = l3Var.W)) {
                                            r8Var.k1 = false;
                                            r8Var.j1 = false;
                                            r8Var.i1 = false;
                                            if (z11) {
                                                l3Var.f(true);
                                            }
                                            if (!z18) {
                                                mp.g1().edit().putBoolean("walletcardstickerhint", true).apply();
                                            }
                                            r8Var.f0();
                                        }
                                        r8.J(r8Var.x1, Z3.centerX(), Z3.top + org.telegram.messenger.g0.L(4.0f));
                                        hi.l3 l3Var2 = r8Var.x1;
                                        if (!l3Var2.W) {
                                            l3Var2.x();
                                        }
                                        r8Var.k1 = true;
                                    } else {
                                        r8Var.k1 = false;
                                        hi.l3 l3Var3 = r8Var.x1;
                                        if (l3Var3 != null && l3Var3.W) {
                                            l3Var3.f(true);
                                        }
                                    }
                                    if (r8Var.j1 && p8Var17.a > 0.5f && (aVar = r8Var.d) != null && aVar.J0() && r8Var.C()) {
                                        if (r8Var.y1 == null) {
                                            r8Var.y1 = r8Var.B(2131742861, false);
                                        }
                                        r8Var.v1.computeBounds(rectF, true);
                                        float[] L = r8Var.L(rectF.centerX(), rectF.top);
                                        if ((L[1] - org.telegram.messenger.g0.L(2.0f)) - org.telegram.messenger.g0.L(56.0f) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m) {
                                            float[] L2 = r8Var.L(rectF.centerX(), rectF.bottom);
                                            hi.l3 l3Var4 = r8Var.y1;
                                            float f43 = L2[0];
                                            float L3 = L2[1] + org.telegram.messenger.g0.L(2.0f);
                                            r8.o(l3Var4, 1);
                                            l3Var4.p(0.0f, f43 - l3Var4.getPaddingLeft());
                                            l3Var4.setTranslationY(L3);
                                            l3Var4.invalidate();
                                        } else {
                                            r8.J(r8Var.y1, L[0], L[1] - org.telegram.messenger.g0.L(2.0f));
                                        }
                                        hi.l3 l3Var5 = r8Var.y1;
                                        if (!l3Var5.W) {
                                            l3Var5.x();
                                        }
                                    } else {
                                        hi.l3 l3Var6 = r8Var.y1;
                                        if (l3Var6 != null && l3Var6.W) {
                                            l3Var6.f(true);
                                        }
                                    }
                                }
                                if (!b12 || z20) {
                                    z10 = true;
                                    boolean z21 = z17 | z10;
                                    for (size = r8Var.T.size() - 1; size >= 0; size--) {
                                        o8 o8Var2 = (o8) r8Var.T.get(size);
                                        o8Var2.h += f10;
                                        float exp = (float) Math.exp((-2.4f) * f10);
                                        float f44 = o8Var2.c * exp;
                                        o8Var2.c = f44;
                                        float f45 = o8Var2.d * exp;
                                        o8Var2.d = f45;
                                        o8Var2.a = (f44 * f10) + o8Var2.a;
                                        o8Var2.b = (f45 * f10) + o8Var2.b;
                                        o8Var2.g = (f10 * 90.0f) + o8Var2.g;
                                        if (o8Var2.h >= o8Var2.f) {
                                            r8Var.T.remove(size);
                                        }
                                    }
                                    if (!r8Var.T.isEmpty()) {
                                        z21 = true;
                                    }
                                    for (size2 = r8Var.n.size() - 1; size2 >= 0; size2--) {
                                        n8 n8Var2 = (n8) r8Var.n.get(size2);
                                        float f46 = n8Var2.c + f10;
                                        n8Var2.c = f46;
                                        if (f46 > 0.42f) {
                                            r8Var.n.remove(size2);
                                        }
                                    }
                                    f11 = r8Var.V0;
                                    if (f11 < 1.0f) {
                                        r8Var.V0 = org.telegram.ui.Cells.c0.f(f10, r8Var.Y0 ? 0.45f : 1.2f, f11, 1.0f);
                                        r8Var.e();
                                        z21 = true;
                                    }
                                    it = r8Var.f.values().iterator();
                                    boolean z22 = false;
                                    while (it.hasNext()) {
                                        if (((q8) it.next()).H == 5) {
                                            z22 = true;
                                        }
                                    }
                                    p8 p8Var19 = r8Var.O;
                                    p8Var19.b = ((!r8Var.n0 && r8Var.p0 && p8Var19.b > 0.0f) || z22 || r8Var.g0) ? 1.0f : 0.0f;
                                    p8 p8Var20 = r8Var.P;
                                    boolean z23 = r8Var.u0;
                                    p8Var20.b = (!z23 || z22 || r8Var.g0) ? 1.0f : 0.0f;
                                    if (r8Var.g0) {
                                        f12 = 0.0f;
                                        p8 p8Var21 = r8Var.d0;
                                        p8Var21.b = z23 ? 28.0f : 0.0f;
                                        b10 = z21 | p8Var21.b(f10);
                                    } else {
                                        p8 p8Var22 = r8Var.d0;
                                        p8Var22.a(Math.min(66.0f, (f10 * 60.0f) + p8Var22.a));
                                        p8 p8Var23 = r8Var.d0;
                                        if (p8Var23.a >= 66.0f) {
                                            r8Var.g0 = false;
                                            f12 = 0.0f;
                                            p8Var23.a(0.0f);
                                        } else {
                                            f12 = 0.0f;
                                        }
                                        b10 = true;
                                    }
                                    b11 = b10 | r8Var.O.b(f10) | r8Var.P.b(f10) | r8Var.Q.b(f10) | r8Var.R.b(f10) | r8Var.S.b(f10);
                                    r8Var.c.setStickerImpact(r8Var.Q.a);
                                    x6Var = r8Var.c;
                                    float max = Math.max(-1.0f, Math.min(1.0f, r8Var.R.a));
                                    float max2 = Math.max(-1.0f, Math.min(1.0f, r8Var.S.a));
                                    if (x6Var.c0 != 0) {
                                        ga.d dVar = new ga.d(4);
                                        float[] fArr2 = new float[8];
                                        dVar.f(1000, 600, 0.0f, 5.0f, false, fArr2);
                                        x6Var.d0 = Math.hypot((double) (fArr2[2] - fArr2[4]), (double) (fArr2[3] - fArr2[5])) < Math.hypot((double) (fArr2[0] - fArr2[6]), (double) (fArr2[1] - fArr2[7])) ? 1 : -1;
                                        dVar.f(1000, 600, 5.0f, 0.0f, false, fArr2);
                                        i7 = 0;
                                        x6Var.c0 = Math.hypot((double) (fArr2[4] - fArr2[6]), (double) (fArr2[5] - fArr2[7])) < Math.hypot((double) (fArr2[0] - fArr2[2]), (double) (fArr2[1] - fArr2[3])) ? 1 : -1;
                                    } else {
                                        i7 = 0;
                                    }
                                    f13 = x6Var.c0 * max2 * 10.0f;
                                    f14 = x6Var.d0 * max * 10.0f;
                                    s6Var = x6Var.E;
                                    if (s6Var.m0 == f13 || s6Var.n0 != f14) {
                                        s6Var.m0 = f13;
                                        s6Var.n0 = f14;
                                        s6Var.b(s6Var.d0, s6Var.g0);
                                    }
                                    r8Var.b0 = r8Var.c.getCardRotationX();
                                    r8Var.c0 = r8Var.c.getCardRotationY();
                                    ArrayList arrayList3 = r8Var.h;
                                    size3 = arrayList3.size();
                                    i10 = i7;
                                    while (i10 < size3) {
                                        Object obj2 = arrayList3.get(i10);
                                        i10++;
                                        e8 e8Var7 = (e8) obj2;
                                        q8 q8Var7 = (q8) r8Var.f.get(e8Var7.x0.address);
                                        if (q8Var7 != null) {
                                            e8Var7.k(q8Var7.R, true, q8Var7.H == 0 ? f12 : 1.0f);
                                        }
                                    }
                                    r8Var.invalidate();
                                    r8Var.M.invalidate();
                                    r8Var.N.invalidate();
                                    if (b11 && r8Var.n.isEmpty() && !r8Var.q0) {
                                        r8Var.N0 = j3;
                                        return;
                                    }
                                    r8Var.postOnAnimation(this);
                                }
                            }
                        }
                        e8Var2 = e8Var;
                        e8Var3 = r8Var.m1;
                        if (e8Var3 != null) {
                            q9Var = e8Var3.E;
                            if (q9Var.getAlpha() != 1.0f) {
                            }
                            e8Var3.invalidate();
                        }
                        r8Var.m1 = e8Var2;
                        if (e8Var2 != null) {
                        }
                        if (z19) {
                        }
                        RectF rectF2 = r8Var.w1;
                        if (r8Var.getParent() instanceof ViewGroup) {
                        }
                        if (!b12) {
                        }
                        z10 = true;
                        boolean z212 = z17 | z10;
                        while (size >= 0) {
                        }
                        if (!r8Var.T.isEmpty()) {
                        }
                        while (size2 >= 0) {
                        }
                        f11 = r8Var.V0;
                        if (f11 < 1.0f) {
                        }
                        it = r8Var.f.values().iterator();
                        boolean z222 = false;
                        while (it.hasNext()) {
                        }
                        p8 p8Var192 = r8Var.O;
                        p8Var192.b = ((!r8Var.n0 && r8Var.p0 && p8Var192.b > 0.0f) || z222 || r8Var.g0) ? 1.0f : 0.0f;
                        p8 p8Var202 = r8Var.P;
                        boolean z232 = r8Var.u0;
                        p8Var202.b = (!z232 || z222 || r8Var.g0) ? 1.0f : 0.0f;
                        if (r8Var.g0) {
                        }
                        b11 = b10 | r8Var.O.b(f10) | r8Var.P.b(f10) | r8Var.Q.b(f10) | r8Var.R.b(f10) | r8Var.S.b(f10);
                        r8Var.c.setStickerImpact(r8Var.Q.a);
                        x6Var = r8Var.c;
                        float max3 = Math.max(-1.0f, Math.min(1.0f, r8Var.R.a));
                        float max22 = Math.max(-1.0f, Math.min(1.0f, r8Var.S.a));
                        if (x6Var.c0 != 0) {
                        }
                        f13 = x6Var.c0 * max22 * 10.0f;
                        f14 = x6Var.d0 * max3 * 10.0f;
                        s6Var = x6Var.E;
                        if (s6Var.m0 == f13) {
                        }
                        s6Var.m0 = f13;
                        s6Var.n0 = f14;
                        s6Var.b(s6Var.d0, s6Var.g0);
                        r8Var.b0 = r8Var.c.getCardRotationX();
                        r8Var.c0 = r8Var.c.getCardRotationY();
                        ArrayList arrayList32 = r8Var.h;
                        size3 = arrayList32.size();
                        i10 = i7;
                        while (i10 < size3) {
                        }
                        r8Var.invalidate();
                        r8Var.M.invalidate();
                        r8Var.N.invalidate();
                        if (b11) {
                        }
                        r8Var.postOnAnimation(this);
                    }
                }
                e8Var = null;
                if (q8Var6 != null) {
                    D = r8Var.D(r8Var.o1 % 2.0f);
                    if (Utilities.l(p8Var18.a) * Math.max(D[0], Math.max(D[1], D[2])) >= 0.003f) {
                    }
                }
                e8Var2 = e8Var;
                e8Var3 = r8Var.m1;
                if (e8Var3 != null) {
                }
                r8Var.m1 = e8Var2;
                if (e8Var2 != null) {
                }
                if (z19) {
                }
                RectF rectF22 = r8Var.w1;
                if (r8Var.getParent() instanceof ViewGroup) {
                }
                if (!b12) {
                }
                z10 = true;
                boolean z2122 = z17 | z10;
                while (size >= 0) {
                }
                if (!r8Var.T.isEmpty()) {
                }
                while (size2 >= 0) {
                }
                f11 = r8Var.V0;
                if (f11 < 1.0f) {
                }
                it = r8Var.f.values().iterator();
                boolean z2222 = false;
                while (it.hasNext()) {
                }
                p8 p8Var1922 = r8Var.O;
                p8Var1922.b = ((!r8Var.n0 && r8Var.p0 && p8Var1922.b > 0.0f) || z2222 || r8Var.g0) ? 1.0f : 0.0f;
                p8 p8Var2022 = r8Var.P;
                boolean z2322 = r8Var.u0;
                p8Var2022.b = (!z2322 || z2222 || r8Var.g0) ? 1.0f : 0.0f;
                if (r8Var.g0) {
                }
                b11 = b10 | r8Var.O.b(f10) | r8Var.P.b(f10) | r8Var.Q.b(f10) | r8Var.R.b(f10) | r8Var.S.b(f10);
                r8Var.c.setStickerImpact(r8Var.Q.a);
                x6Var = r8Var.c;
                float max32 = Math.max(-1.0f, Math.min(1.0f, r8Var.R.a));
                float max222 = Math.max(-1.0f, Math.min(1.0f, r8Var.S.a));
                if (x6Var.c0 != 0) {
                }
                f13 = x6Var.c0 * max222 * 10.0f;
                f14 = x6Var.d0 * max32 * 10.0f;
                s6Var = x6Var.E;
                if (s6Var.m0 == f13) {
                }
                s6Var.m0 = f13;
                s6Var.n0 = f14;
                s6Var.b(s6Var.d0, s6Var.g0);
                r8Var.b0 = r8Var.c.getCardRotationX();
                r8Var.c0 = r8Var.c.getCardRotationY();
                ArrayList arrayList322 = r8Var.h;
                size3 = arrayList322.size();
                i10 = i7;
                while (i10 < size3) {
                }
                r8Var.invalidate();
                r8Var.M.invalidate();
                r8Var.N.invalidate();
                if (b11) {
                }
                r8Var.postOnAnimation(this);
            }
            f10 = f38;
            z10 = false;
            boolean z21222 = z17 | z10;
            while (size >= 0) {
            }
            if (!r8Var.T.isEmpty()) {
            }
            while (size2 >= 0) {
            }
            f11 = r8Var.V0;
            if (f11 < 1.0f) {
            }
            it = r8Var.f.values().iterator();
            boolean z22222 = false;
            while (it.hasNext()) {
            }
            p8 p8Var19222 = r8Var.O;
            p8Var19222.b = ((!r8Var.n0 && r8Var.p0 && p8Var19222.b > 0.0f) || z22222 || r8Var.g0) ? 1.0f : 0.0f;
            p8 p8Var20222 = r8Var.P;
            boolean z23222 = r8Var.u0;
            p8Var20222.b = (!z23222 || z22222 || r8Var.g0) ? 1.0f : 0.0f;
            if (r8Var.g0) {
            }
            b11 = b10 | r8Var.O.b(f10) | r8Var.P.b(f10) | r8Var.Q.b(f10) | r8Var.R.b(f10) | r8Var.S.b(f10);
            r8Var.c.setStickerImpact(r8Var.Q.a);
            x6Var = r8Var.c;
            float max322 = Math.max(-1.0f, Math.min(1.0f, r8Var.R.a));
            float max2222 = Math.max(-1.0f, Math.min(1.0f, r8Var.S.a));
            if (x6Var.c0 != 0) {
            }
            f13 = x6Var.c0 * max2222 * 10.0f;
            f14 = x6Var.d0 * max322 * 10.0f;
            s6Var = x6Var.E;
            if (s6Var.m0 == f13) {
            }
            s6Var.m0 = f13;
            s6Var.n0 = f14;
            s6Var.b(s6Var.d0, s6Var.g0);
            r8Var.b0 = r8Var.c.getCardRotationX();
            r8Var.c0 = r8Var.c.getCardRotationY();
            ArrayList arrayList3222 = r8Var.h;
            size3 = arrayList3222.size();
            i10 = i7;
            while (i10 < size3) {
            }
            r8Var.invalidate();
            r8Var.M.invalidate();
            r8Var.N.invalidate();
            if (b11) {
            }
            r8Var.postOnAnimation(this);
        }
    }
}
