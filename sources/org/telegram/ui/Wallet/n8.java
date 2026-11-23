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
import org.telegram.ui.Components.nh0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class n8 implements Runnable {
    public final /* synthetic */ s8 a;

    public n8(s8 s8Var) {
        this.a = s8Var;
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
    /* JADX WARN: Removed duplicated region for block: B:262:0x0a01  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0a2d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0a62  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x09eb  */
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
        f8 f8Var;
        f8 f8Var2;
        f8 f8Var3;
        boolean z10;
        jb.m mVar;
        boolean z11;
        org.telegram.ui.Components.p9 p9Var;
        float[] D;
        r8 r8Var;
        RectF Z;
        f8 j10;
        int size;
        int size2;
        float f11;
        Iterator it;
        float f12;
        boolean b10;
        boolean b11;
        y6 y6Var;
        int i7;
        float f13;
        float f14;
        t6 t6Var;
        int size3;
        int i10;
        Iterator it2;
        String string;
        boolean z12;
        float f15;
        q8 q8Var;
        q8 q8Var2;
        boolean optBoolean;
        int i11;
        fi.s2 s2Var;
        float f16;
        float f17;
        float f18;
        float f19;
        f8 f8Var4;
        float f20;
        nh0 C;
        float f21;
        float f22;
        q8 q8Var3;
        float f23;
        s8 s8Var = this.a;
        if (s8Var.b1 || !s8Var.isAttachedToWindow()) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j11 = 0;
        float min = s8Var.N0 == 0 ? 0.016666668f : Math.min(0.032f, (uptimeMillis - r4) / 1000.0f);
        s8Var.N0 = uptimeMillis;
        if (s8Var.A()) {
            Iterator it3 = s8Var.f.values().iterator();
            boolean z13 = false;
            while (true) {
                j3 = j11;
                if (!it3.hasNext()) {
                    break;
                }
                r8 r8Var2 = (r8) it3.next();
                boolean z14 = r8Var2.K;
                q8 q8Var4 = r8Var2.m;
                q8 q8Var5 = r8Var2.i;
                String str = r8Var2.a;
                q8 q8Var6 = r8Var2.j;
                fi.s2 s2Var2 = r8Var2.c;
                q8 q8Var7 = r8Var2.g;
                q8 q8Var8 = r8Var2.f;
                q8 q8Var9 = r8Var2.e;
                q8 q8Var10 = r8Var2.h;
                if (z14) {
                    it2 = it3;
                    f15 = min;
                    z12 = z13;
                } else {
                    r8Var2.K = true;
                    if (s8Var.b) {
                        it2 = it3;
                        string = null;
                    } else {
                        it2 = it3;
                        string = s8Var.e.getString(str, null);
                    }
                    if (s8Var.c1 != null) {
                        TL_wallet.cardSticker R = s8Var.R(str);
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
                                s8Var.K(r8Var2, mediaAreaCoordinates, optBoolean);
                            }
                            optBoolean = false;
                            s8Var.K(r8Var2, mediaAreaCoordinates, optBoolean);
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
                                    q8Var10.a((float) jSONObject.optDouble("s", 1.0d));
                                    q8Var = q8Var4;
                                    q8Var2 = q8Var6;
                                } catch (Exception unused2) {
                                    q8Var = q8Var4;
                                    q8Var2 = q8Var6;
                                }
                                try {
                                    q8Var5.a((float) jSONObject.optDouble("r", 0.0d));
                                    r8Var2.N = jSONObject.optBoolean("q");
                                    float[] fArr = {((float) jSONObject.getDouble("x")) * s8Var.Z0, ((float) jSONObject.getDouble("y")) * s8Var.a1, q8Var10.b};
                                    q8Var9.a(fArr[0]);
                                    q8Var8.a(fArr[1]);
                                    q8Var10.a(fArr[2]);
                                    r8Var2.H = 2;
                                    long j12 = s8Var.O0 + 1;
                                    s8Var.O0 = j12;
                                    r8Var2.I = j12;
                                    q8Var.a(1.0f);
                                    if (r8Var2.J == j3) {
                                        long j13 = s8Var.S0 + 1;
                                        s8Var.S0 = j13;
                                        r8Var2.J = j13;
                                    }
                                    str = str;
                                    try {
                                        if (str.equals(s8Var.Q0)) {
                                            s8Var.U0 = r8Var2;
                                            s8Var.T0 = r8Var2;
                                            s8Var.V0 = 1.0f;
                                            s8Var.e();
                                        }
                                    } catch (Exception unused3) {
                                    }
                                } catch (Exception unused4) {
                                    str = str;
                                    if (r8Var2.b()) {
                                    }
                                    while (r7 < r5) {
                                    }
                                    float f24 = f15;
                                    i11 = r8Var2.H;
                                    if (i11 == 1) {
                                    }
                                    z12 = true;
                                    if (!r8Var2.b()) {
                                    }
                                    C = s2Var.C();
                                    if (C == null) {
                                    }
                                    z13 = z12;
                                    j11 = j3;
                                    it3 = it2;
                                    min = f16;
                                }
                            } catch (Exception unused5) {
                            }
                            if (r8Var2.b()) {
                                r8Var2.a();
                            }
                            for (q8 q8Var11 : r8Var2.s) {
                                z12 |= q8Var11.b(f15);
                            }
                            float f242 = f15;
                            i11 = r8Var2.H;
                            if (i11 == 1) {
                                float t6 = Utilities.t(q8Var9.a + r8Var2.n.a, q8Var8.a + r8Var2.o.a, q8Var9.b, q8Var8.b);
                                if (r8Var2.M || q8Var2.a >= 0.36f || t6 >= org.telegram.messenger.g0.L(24.0f)) {
                                    f21 = 0.28f;
                                } else {
                                    r8Var2.M = true;
                                    ArrayList arrayList = s8Var.n;
                                    float f25 = q8Var9.b;
                                    f21 = 0.28f;
                                    float f26 = q8Var8.b;
                                    o8 o8Var = new o8();
                                    o8Var.a = f25;
                                    o8Var.b = f26;
                                    arrayList.add(o8Var);
                                }
                                if (r8Var2.L || q8Var2.a >= 0.22f || t6 >= org.telegram.messenger.g0.L(12.0f)) {
                                    f22 = t6;
                                    q8Var3 = q8Var8;
                                    f23 = 1.4f;
                                } else {
                                    r8Var2.L = true;
                                    q8 q8Var12 = r8Var2.p;
                                    q8Var12.a(1.0f);
                                    q8Var12.b = 0.0f;
                                    q8 q8Var13 = s8Var.Q;
                                    boolean z15 = r8Var2.P;
                                    float f27 = z15 ? 420.0f : 260.0f;
                                    float f28 = z15 ? 0.38f : 0.85f;
                                    q8Var13.d = f27;
                                    q8Var13.e = f28;
                                    q8Var13.c -= z15 ? 0.75f : f21;
                                    float f29 = z15 ? 3.4f : 1.4f;
                                    q8 q8Var14 = s8Var.R;
                                    float f30 = q8Var14.c;
                                    f23 = 1.4f;
                                    float f31 = q8Var9.b;
                                    q8Var14.c = (((f31 / s8Var.Z0) - 0.5f) * 2.0f * f29) + f30;
                                    q8 q8Var15 = s8Var.S;
                                    float f32 = q8Var15.c;
                                    float f33 = q8Var8.b;
                                    f22 = t6;
                                    q8Var15.c = (((f33 / s8Var.a1) - 0.5f) * 2.0f * f29) + f32;
                                    if (z15) {
                                        Random random = new Random();
                                        int i12 = 0;
                                        while (i12 < 14) {
                                            p8 p8Var = new p8();
                                            float h = org.telegram.ui.Cells.c0.h(random, 0.35f, (float) ((i12 / 14.0f) * 3.141592653589793d * 2.0d));
                                            float nextFloat = (random.nextFloat() * org.telegram.messenger.g0.L(180.0f)) + org.telegram.messenger.g0.L(265.0f);
                                            p8Var.a = f31;
                                            p8Var.b = f33;
                                            double d = h;
                                            p8Var.c = ((float) Math.cos(d)) * nextFloat;
                                            p8Var.d = ((float) Math.sin(d)) * nextFloat;
                                            p8Var.e = (random.nextFloat() * org.telegram.messenger.g0.L(1.1f)) + org.telegram.messenger.g0.L(0.8f);
                                            p8Var.f = org.telegram.ui.Cells.c0.h(random, 0.35f, 0.7f);
                                            p8Var.g = random.nextFloat() * 360.0f;
                                            s8Var.T.add(p8Var);
                                            i12++;
                                            f31 = f31;
                                            q8Var8 = q8Var8;
                                        }
                                    }
                                    q8Var3 = q8Var8;
                                    if (str.equals(s8Var.R0)) {
                                        s8Var.X(r8Var2, false);
                                        s8Var.R0 = null;
                                    }
                                }
                                if (!r8Var2.Q && r8Var2.k.a < 0.3f) {
                                    r8Var2.Q = true;
                                    q8Var7.c -= f23;
                                    s8Var.performHapticFeedback(3);
                                }
                                if (r8Var2.Q && f22 < 0.5f && Math.abs(q8Var7.a - 1.0f) < 0.004f && Math.abs(q8Var7.c) < 0.02f) {
                                    r8Var2.H = 2;
                                    q8Var9.a(q8Var9.b);
                                    q8 q8Var16 = q8Var3;
                                    q8Var16.a(q8Var16.b);
                                }
                                s2Var = s2Var2;
                                f16 = f242;
                            } else if (i11 == 4) {
                                float f34 = org.telegram.ui.Cells.c0.f(f242, r8Var2.b0, r8Var2.W, 1.0f);
                                r8Var2.W = f34;
                                float f35 = 1.0f - f34;
                                float f36 = 1.0f - (f35 * f35);
                                f8 j14 = s8Var.j(r8Var2);
                                float l10 = Utilities.l(f34 / 0.5f);
                                if (j14 != null) {
                                    f17 = f34;
                                    f16 = f242;
                                    f18 = 1.0f;
                                    f19 = org.telegram.messenger.g0.T1(r8Var2.c0, 1.0f, com.google.android.gms.internal.vision.e2.C(l10, 2.0f, 3.0f, l10 * l10));
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
                                RectF Z2 = s8Var.Z(r8Var2);
                                if (Z2 == null) {
                                    q8Var7.a((f18 - f36) * r8Var2.Z);
                                    s2Var = s2Var2;
                                    f8Var4 = j14;
                                    f20 = 1.0f;
                                } else {
                                    float sin = (float) Math.sin(f36 * 3.141592653589793d);
                                    s2Var = s2Var2;
                                    f8Var4 = j14;
                                    float min2 = Math.min(org.telegram.messenger.g0.L(90.0f), Utilities.t(Z2.centerX(), Z2.centerY(), r8Var2.X, r8Var2.Y) * 0.28f);
                                    q8Var9.a(org.telegram.messenger.g0.T1(r8Var2.X, Z2.centerX(), f36));
                                    q8Var8.a(org.telegram.messenger.g0.T1(r8Var2.Y, Z2.centerY(), f36) - ((((1.0f - f36) * 2.0f) * f36) * min2));
                                    q8Var7.a(org.telegram.messenger.g0.T1(1.0f, f19, f36) * com.google.android.gms.internal.vision.e2.B(sin, 0.05f, 1.0f, org.telegram.messenger.g0.T1(r8Var2.Z, (s8Var.f(r8Var2) * (Z2.width() / f19)) / s8Var.U(), f36)));
                                    q8Var2.a(sin * 0.8f);
                                    float f37 = r8Var2.a0;
                                    q8Var5.a((s8.c(-f37) * f36) + f37);
                                    f20 = 1.0f;
                                    q8Var.a(Utilities.l(1.0f - ((f36 - 0.35f) / 0.4f)));
                                }
                                if (f17 >= f20) {
                                    s8Var.g(r8Var2);
                                    if (f8Var4 != null) {
                                        f8Var4.animate().scaleX(0.955f).scaleY(0.955f).setDuration(70L).setInterpolator(null).withEndAction(new j8(f8Var4, 1)).start();
                                    }
                                }
                            } else {
                                s2Var = s2Var2;
                                f16 = f242;
                                if (i11 == 5) {
                                    if (q8Var7.a < 0.03f) {
                                        s8Var.g(r8Var2);
                                    }
                                }
                                if (!r8Var2.b()) {
                                    r8Var2.R = true;
                                } else if (r8Var2.H == 0) {
                                    r8Var2.R = false;
                                }
                                C = s2Var.C();
                                if (C == null && C.l0) {
                                    nh0 C2 = s2Var.C();
                                    int i13 = C2 == null ? 0 : C2.b0;
                                    if (i13 >= 2) {
                                        r8Var2.T = true;
                                    }
                                    boolean z16 = r8Var2.S && !r8Var2.T && r8Var2.H == 2;
                                    if (r8Var2.l.b == 0.0f && !z16 && C2 != null && i13 < 2) {
                                        s2Var.R0();
                                        s2Var.v0 = false;
                                        r8Var2.S = false;
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
                            if (!r8Var2.b()) {
                            }
                            C = s2Var.C();
                            if (C == null) {
                            }
                            z13 = z12;
                            j11 = j3;
                            it3 = it2;
                            min = f16;
                        }
                    }
                    f15 = min;
                }
                q8Var = q8Var4;
                q8Var2 = q8Var6;
                if (r8Var2.b()) {
                }
                while (r7 < r5) {
                }
                float f2422 = f15;
                i11 = r8Var2.H;
                if (i11 == 1) {
                }
                z12 = true;
                if (!r8Var2.b()) {
                }
                C = s2Var.C();
                if (C == null) {
                }
                z13 = z12;
                j11 = j3;
                it3 = it2;
                min = f16;
            }
            float f38 = min;
            boolean z17 = z13;
            q8 q8Var17 = s8Var.r1;
            q8 q8Var18 = s8Var.q1;
            boolean z18 = s8Var.b;
            if (!z18) {
                if (s8Var.i1) {
                    r8 r8Var3 = s8Var.l1;
                    if (r8Var3 != null && r8Var3.H == 0 && (j10 = s8Var.j(r8Var3)) != null && s8Var.z(j10) && s8.b(s8Var.l1)) {
                        r8Var = s8Var.l1;
                    } else {
                        ArrayList arrayList2 = s8Var.h;
                        int size4 = arrayList2.size();
                        int i14 = 0;
                        float f39 = 0.0f;
                        float f40 = 0.0f;
                        r8 r8Var4 = null;
                        while (i14 < size4) {
                            Object obj = arrayList2.get(i14);
                            i14++;
                            f8 f8Var5 = (f8) obj;
                            r8 r8Var5 = (r8) s8Var.f.get(f8Var5.x0.address);
                            if (r8Var5 != null && r8Var5.H == 0 && s8.b(r8Var5) && f8Var5.isAttachedToWindow() && s8Var.z(f8Var5) && (Z = s8Var.Z(r8Var5)) != null) {
                                if (r8Var4 != null) {
                                    float f41 = Z.top;
                                    if (f41 >= f39 - 1.0f) {
                                        if (Math.abs(f41 - f39) <= 1.0f && Z.left < f40) {
                                        }
                                    }
                                }
                                f39 = Z.top;
                                f40 = Z.left;
                                r8Var4 = r8Var5;
                            }
                        }
                        r8Var = r8Var4;
                    }
                    if (r8Var != null && r8Var != s8Var.l1) {
                        s8Var.l1 = r8Var;
                        s8Var.n1 = null;
                        s8Var.o1 = 0.0f;
                    }
                }
                r8 r8Var6 = s8Var.l1;
                f8 j15 = r8Var6 == null ? null : s8Var.j(r8Var6);
                boolean z19 = s8Var.i1 && r8Var6 != null && r8Var6.H == 0 && s8.b(r8Var6) && j15 != null && s8Var.z(j15) && !s8Var.t0 && !s8Var.q0;
                if (r8Var6 != null && (z19 || s8Var.j1)) {
                    r8Var6.a();
                    if (s8Var.n1 == null && r8Var6.u != null) {
                        s8Var.n1 = s8Var.x(r8Var6, s8Var.Z0 * 0.6f, s8Var.a1 * 0.68f, true);
                        r8Var6.N = false;
                    }
                }
                q8Var18.b = z19 ? 1.0f : 0.0f;
                q8Var17.b = ((!z19 && !s8Var.j1) || s8Var.n1 == null || s8.H(r8Var6) == null) ? 0.0f : 1.0f;
                f10 = f38;
                boolean b12 = q8Var18.b(f10) | q8Var17.b(f10);
                float f42 = q8Var18.a;
                boolean z20 = f42 > 0.002f || q8Var17.a > 0.002f;
                if (z20) {
                    s8Var.o1 += f10;
                } else {
                    s8Var.o1 = 0.0f;
                    if (!s8Var.i1 && !s8Var.j1) {
                        f8Var = null;
                        s8Var.n1 = null;
                        if (r8Var6 != null && r8Var6.H == 0 && r8Var6.v != null && f42 > 0.002f) {
                            D = s8Var.D(s8Var.o1 % 2.0f);
                            if (Utilities.l(q8Var18.a) * Math.max(D[0], Math.max(D[1], D[2])) >= 0.003f) {
                                f8Var2 = j15;
                                f8Var3 = s8Var.m1;
                                if (f8Var3 != null && f8Var3 != f8Var2) {
                                    p9Var = f8Var3.E;
                                    if (p9Var.getAlpha() != 1.0f) {
                                        p9Var.setAlpha(1.0f);
                                    }
                                    f8Var3.invalidate();
                                }
                                s8Var.m1 = f8Var2;
                                if (f8Var2 != null) {
                                    org.telegram.ui.Components.p9 p9Var2 = f8Var2.E;
                                    if (p9Var2.getAlpha() != 0.0f) {
                                        p9Var2.setAlpha(0.0f);
                                    }
                                    f8Var2.invalidate();
                                }
                                f8 f8Var6 = (z19 || q8Var18.a <= 0.5f) ? f8Var : j15;
                                RectF rectF = s8Var.w1;
                                if (s8Var.getParent() instanceof ViewGroup) {
                                    RectF Z3 = f8Var6 == null ? f8Var : s8Var.Z(s8Var.l1);
                                    if (Z3 != null) {
                                        hi.u3 u3Var = s8Var.x1;
                                        if (u3Var == null) {
                                            s8Var.x1 = s8Var.B(2131742853, true);
                                        } else if (s8Var.k1 && !(z11 = u3Var.W)) {
                                            s8Var.k1 = false;
                                            s8Var.j1 = false;
                                            s8Var.i1 = false;
                                            if (z11) {
                                                u3Var.f(true);
                                            }
                                            if (!z18) {
                                                mp.g1().edit().putBoolean("walletcardstickerhint", true).apply();
                                            }
                                            s8Var.f0();
                                        }
                                        s8.J(s8Var.x1, Z3.centerX(), Z3.top + org.telegram.messenger.g0.L(4.0f));
                                        hi.u3 u3Var2 = s8Var.x1;
                                        if (!u3Var2.W) {
                                            u3Var2.x();
                                        }
                                        s8Var.k1 = true;
                                    } else {
                                        s8Var.k1 = false;
                                        hi.u3 u3Var3 = s8Var.x1;
                                        if (u3Var3 != null && u3Var3.W) {
                                            u3Var3.f(true);
                                        }
                                    }
                                    if (s8Var.j1 && q8Var17.a > 0.5f && (mVar = s8Var.d) != null && mVar.z0() && s8Var.C()) {
                                        if (s8Var.y1 == null) {
                                            s8Var.y1 = s8Var.B(2131742854, false);
                                        }
                                        s8Var.v1.computeBounds(rectF, true);
                                        float[] L = s8Var.L(rectF.centerX(), rectF.top);
                                        if ((L[1] - org.telegram.messenger.g0.L(2.0f)) - org.telegram.messenger.g0.L(56.0f) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m) {
                                            float[] L2 = s8Var.L(rectF.centerX(), rectF.bottom);
                                            hi.u3 u3Var4 = s8Var.y1;
                                            float f43 = L2[0];
                                            float L3 = L2[1] + org.telegram.messenger.g0.L(2.0f);
                                            s8.o(u3Var4, 1);
                                            u3Var4.p(0.0f, f43 - u3Var4.getPaddingLeft());
                                            u3Var4.setTranslationY(L3);
                                            u3Var4.invalidate();
                                        } else {
                                            s8.J(s8Var.y1, L[0], L[1] - org.telegram.messenger.g0.L(2.0f));
                                        }
                                        hi.u3 u3Var5 = s8Var.y1;
                                        if (!u3Var5.W) {
                                            u3Var5.x();
                                        }
                                    } else {
                                        hi.u3 u3Var6 = s8Var.y1;
                                        if (u3Var6 != null && u3Var6.W) {
                                            u3Var6.f(true);
                                        }
                                    }
                                }
                                if (!b12 || z20) {
                                    z10 = true;
                                    boolean z21 = z17 | z10;
                                    for (size = s8Var.T.size() - 1; size >= 0; size--) {
                                        p8 p8Var2 = (p8) s8Var.T.get(size);
                                        p8Var2.h += f10;
                                        float exp = (float) Math.exp((-2.4f) * f10);
                                        float f44 = p8Var2.c * exp;
                                        p8Var2.c = f44;
                                        float f45 = p8Var2.d * exp;
                                        p8Var2.d = f45;
                                        p8Var2.a = (f44 * f10) + p8Var2.a;
                                        p8Var2.b = (f45 * f10) + p8Var2.b;
                                        p8Var2.g = (f10 * 90.0f) + p8Var2.g;
                                        if (p8Var2.h >= p8Var2.f) {
                                            s8Var.T.remove(size);
                                        }
                                    }
                                    if (!s8Var.T.isEmpty()) {
                                        z21 = true;
                                    }
                                    for (size2 = s8Var.n.size() - 1; size2 >= 0; size2--) {
                                        o8 o8Var2 = (o8) s8Var.n.get(size2);
                                        float f46 = o8Var2.c + f10;
                                        o8Var2.c = f46;
                                        if (f46 > 0.42f) {
                                            s8Var.n.remove(size2);
                                        }
                                    }
                                    f11 = s8Var.V0;
                                    if (f11 < 1.0f) {
                                        s8Var.V0 = org.telegram.ui.Cells.c0.f(f10, s8Var.Y0 ? 0.45f : 1.2f, f11, 1.0f);
                                        s8Var.e();
                                        z21 = true;
                                    }
                                    it = s8Var.f.values().iterator();
                                    boolean z22 = false;
                                    while (it.hasNext()) {
                                        if (((r8) it.next()).H == 5) {
                                            z22 = true;
                                        }
                                    }
                                    q8 q8Var19 = s8Var.O;
                                    q8Var19.b = ((!s8Var.n0 && s8Var.p0 && q8Var19.b > 0.0f) || z22 || s8Var.g0) ? 1.0f : 0.0f;
                                    q8 q8Var20 = s8Var.P;
                                    boolean z23 = s8Var.u0;
                                    q8Var20.b = (!z23 || z22 || s8Var.g0) ? 1.0f : 0.0f;
                                    if (s8Var.g0) {
                                        f12 = 0.0f;
                                        q8 q8Var21 = s8Var.d0;
                                        q8Var21.b = z23 ? 28.0f : 0.0f;
                                        b10 = z21 | q8Var21.b(f10);
                                    } else {
                                        q8 q8Var22 = s8Var.d0;
                                        q8Var22.a(Math.min(66.0f, (f10 * 60.0f) + q8Var22.a));
                                        q8 q8Var23 = s8Var.d0;
                                        if (q8Var23.a >= 66.0f) {
                                            s8Var.g0 = false;
                                            f12 = 0.0f;
                                            q8Var23.a(0.0f);
                                        } else {
                                            f12 = 0.0f;
                                        }
                                        b10 = true;
                                    }
                                    b11 = b10 | s8Var.O.b(f10) | s8Var.P.b(f10) | s8Var.Q.b(f10) | s8Var.R.b(f10) | s8Var.S.b(f10);
                                    s8Var.c.setStickerImpact(s8Var.Q.a);
                                    y6Var = s8Var.c;
                                    float max = Math.max(-1.0f, Math.min(1.0f, s8Var.R.a));
                                    float max2 = Math.max(-1.0f, Math.min(1.0f, s8Var.S.a));
                                    if (y6Var.c0 != 0) {
                                        m.o3 o3Var = new m.o3();
                                        float[] fArr2 = new float[8];
                                        o3Var.c(1000, 600, 0.0f, 5.0f, false, fArr2);
                                        y6Var.d0 = Math.hypot((double) (fArr2[2] - fArr2[4]), (double) (fArr2[3] - fArr2[5])) < Math.hypot((double) (fArr2[0] - fArr2[6]), (double) (fArr2[1] - fArr2[7])) ? 1 : -1;
                                        o3Var.c(1000, 600, 5.0f, 0.0f, false, fArr2);
                                        i7 = 0;
                                        y6Var.c0 = Math.hypot((double) (fArr2[4] - fArr2[6]), (double) (fArr2[5] - fArr2[7])) < Math.hypot((double) (fArr2[0] - fArr2[2]), (double) (fArr2[1] - fArr2[3])) ? 1 : -1;
                                    } else {
                                        i7 = 0;
                                    }
                                    f13 = y6Var.c0 * max2 * 10.0f;
                                    f14 = y6Var.d0 * max * 10.0f;
                                    t6Var = y6Var.E;
                                    if (t6Var.m0 == f13 || t6Var.n0 != f14) {
                                        t6Var.m0 = f13;
                                        t6Var.n0 = f14;
                                        t6Var.b(t6Var.d0, t6Var.g0);
                                    }
                                    s8Var.b0 = s8Var.c.getCardRotationX();
                                    s8Var.c0 = s8Var.c.getCardRotationY();
                                    ArrayList arrayList3 = s8Var.h;
                                    size3 = arrayList3.size();
                                    i10 = i7;
                                    while (i10 < size3) {
                                        Object obj2 = arrayList3.get(i10);
                                        i10++;
                                        f8 f8Var7 = (f8) obj2;
                                        r8 r8Var7 = (r8) s8Var.f.get(f8Var7.x0.address);
                                        if (r8Var7 != null) {
                                            f8Var7.k(r8Var7.R, true, r8Var7.H == 0 ? f12 : 1.0f);
                                        }
                                    }
                                    s8Var.invalidate();
                                    s8Var.M.invalidate();
                                    s8Var.N.invalidate();
                                    if (b11 && s8Var.n.isEmpty() && !s8Var.q0) {
                                        s8Var.N0 = j3;
                                        return;
                                    }
                                    s8Var.postOnAnimation(this);
                                }
                            }
                        }
                        f8Var2 = f8Var;
                        f8Var3 = s8Var.m1;
                        if (f8Var3 != null) {
                            p9Var = f8Var3.E;
                            if (p9Var.getAlpha() != 1.0f) {
                            }
                            f8Var3.invalidate();
                        }
                        s8Var.m1 = f8Var2;
                        if (f8Var2 != null) {
                        }
                        if (z19) {
                        }
                        RectF rectF2 = s8Var.w1;
                        if (s8Var.getParent() instanceof ViewGroup) {
                        }
                        if (!b12) {
                        }
                        z10 = true;
                        boolean z212 = z17 | z10;
                        while (size >= 0) {
                        }
                        if (!s8Var.T.isEmpty()) {
                        }
                        while (size2 >= 0) {
                        }
                        f11 = s8Var.V0;
                        if (f11 < 1.0f) {
                        }
                        it = s8Var.f.values().iterator();
                        boolean z222 = false;
                        while (it.hasNext()) {
                        }
                        q8 q8Var192 = s8Var.O;
                        q8Var192.b = ((!s8Var.n0 && s8Var.p0 && q8Var192.b > 0.0f) || z222 || s8Var.g0) ? 1.0f : 0.0f;
                        q8 q8Var202 = s8Var.P;
                        boolean z232 = s8Var.u0;
                        q8Var202.b = (!z232 || z222 || s8Var.g0) ? 1.0f : 0.0f;
                        if (s8Var.g0) {
                        }
                        b11 = b10 | s8Var.O.b(f10) | s8Var.P.b(f10) | s8Var.Q.b(f10) | s8Var.R.b(f10) | s8Var.S.b(f10);
                        s8Var.c.setStickerImpact(s8Var.Q.a);
                        y6Var = s8Var.c;
                        float max3 = Math.max(-1.0f, Math.min(1.0f, s8Var.R.a));
                        float max22 = Math.max(-1.0f, Math.min(1.0f, s8Var.S.a));
                        if (y6Var.c0 != 0) {
                        }
                        f13 = y6Var.c0 * max22 * 10.0f;
                        f14 = y6Var.d0 * max3 * 10.0f;
                        t6Var = y6Var.E;
                        if (t6Var.m0 == f13) {
                        }
                        t6Var.m0 = f13;
                        t6Var.n0 = f14;
                        t6Var.b(t6Var.d0, t6Var.g0);
                        s8Var.b0 = s8Var.c.getCardRotationX();
                        s8Var.c0 = s8Var.c.getCardRotationY();
                        ArrayList arrayList32 = s8Var.h;
                        size3 = arrayList32.size();
                        i10 = i7;
                        while (i10 < size3) {
                        }
                        s8Var.invalidate();
                        s8Var.M.invalidate();
                        s8Var.N.invalidate();
                        if (b11) {
                        }
                        s8Var.postOnAnimation(this);
                    }
                }
                f8Var = null;
                if (r8Var6 != null) {
                    D = s8Var.D(s8Var.o1 % 2.0f);
                    if (Utilities.l(q8Var18.a) * Math.max(D[0], Math.max(D[1], D[2])) >= 0.003f) {
                    }
                }
                f8Var2 = f8Var;
                f8Var3 = s8Var.m1;
                if (f8Var3 != null) {
                }
                s8Var.m1 = f8Var2;
                if (f8Var2 != null) {
                }
                if (z19) {
                }
                RectF rectF22 = s8Var.w1;
                if (s8Var.getParent() instanceof ViewGroup) {
                }
                if (!b12) {
                }
                z10 = true;
                boolean z2122 = z17 | z10;
                while (size >= 0) {
                }
                if (!s8Var.T.isEmpty()) {
                }
                while (size2 >= 0) {
                }
                f11 = s8Var.V0;
                if (f11 < 1.0f) {
                }
                it = s8Var.f.values().iterator();
                boolean z2222 = false;
                while (it.hasNext()) {
                }
                q8 q8Var1922 = s8Var.O;
                q8Var1922.b = ((!s8Var.n0 && s8Var.p0 && q8Var1922.b > 0.0f) || z2222 || s8Var.g0) ? 1.0f : 0.0f;
                q8 q8Var2022 = s8Var.P;
                boolean z2322 = s8Var.u0;
                q8Var2022.b = (!z2322 || z2222 || s8Var.g0) ? 1.0f : 0.0f;
                if (s8Var.g0) {
                }
                b11 = b10 | s8Var.O.b(f10) | s8Var.P.b(f10) | s8Var.Q.b(f10) | s8Var.R.b(f10) | s8Var.S.b(f10);
                s8Var.c.setStickerImpact(s8Var.Q.a);
                y6Var = s8Var.c;
                float max32 = Math.max(-1.0f, Math.min(1.0f, s8Var.R.a));
                float max222 = Math.max(-1.0f, Math.min(1.0f, s8Var.S.a));
                if (y6Var.c0 != 0) {
                }
                f13 = y6Var.c0 * max222 * 10.0f;
                f14 = y6Var.d0 * max32 * 10.0f;
                t6Var = y6Var.E;
                if (t6Var.m0 == f13) {
                }
                t6Var.m0 = f13;
                t6Var.n0 = f14;
                t6Var.b(t6Var.d0, t6Var.g0);
                s8Var.b0 = s8Var.c.getCardRotationX();
                s8Var.c0 = s8Var.c.getCardRotationY();
                ArrayList arrayList322 = s8Var.h;
                size3 = arrayList322.size();
                i10 = i7;
                while (i10 < size3) {
                }
                s8Var.invalidate();
                s8Var.M.invalidate();
                s8Var.N.invalidate();
                if (b11) {
                }
                s8Var.postOnAnimation(this);
            }
            f10 = f38;
            z10 = false;
            boolean z21222 = z17 | z10;
            while (size >= 0) {
            }
            if (!s8Var.T.isEmpty()) {
            }
            while (size2 >= 0) {
            }
            f11 = s8Var.V0;
            if (f11 < 1.0f) {
            }
            it = s8Var.f.values().iterator();
            boolean z22222 = false;
            while (it.hasNext()) {
            }
            q8 q8Var19222 = s8Var.O;
            q8Var19222.b = ((!s8Var.n0 && s8Var.p0 && q8Var19222.b > 0.0f) || z22222 || s8Var.g0) ? 1.0f : 0.0f;
            q8 q8Var20222 = s8Var.P;
            boolean z23222 = s8Var.u0;
            q8Var20222.b = (!z23222 || z22222 || s8Var.g0) ? 1.0f : 0.0f;
            if (s8Var.g0) {
            }
            b11 = b10 | s8Var.O.b(f10) | s8Var.P.b(f10) | s8Var.Q.b(f10) | s8Var.R.b(f10) | s8Var.S.b(f10);
            s8Var.c.setStickerImpact(s8Var.Q.a);
            y6Var = s8Var.c;
            float max322 = Math.max(-1.0f, Math.min(1.0f, s8Var.R.a));
            float max2222 = Math.max(-1.0f, Math.min(1.0f, s8Var.S.a));
            if (y6Var.c0 != 0) {
            }
            f13 = y6Var.c0 * max2222 * 10.0f;
            f14 = y6Var.d0 * max322 * 10.0f;
            t6Var = y6Var.E;
            if (t6Var.m0 == f13) {
            }
            t6Var.m0 = f13;
            t6Var.n0 = f14;
            t6Var.b(t6Var.d0, t6Var.g0);
            s8Var.b0 = s8Var.c.getCardRotationX();
            s8Var.c0 = s8Var.c.getCardRotationY();
            ArrayList arrayList3222 = s8Var.h;
            size3 = arrayList3222.size();
            i10 = i7;
            while (i10 < size3) {
            }
            s8Var.invalidate();
            s8Var.M.invalidate();
            s8Var.N.invalidate();
            if (b11) {
            }
            s8Var.postOnAnimation(this);
        }
    }
}
