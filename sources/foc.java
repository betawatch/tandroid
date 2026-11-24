// default package

import android.graphics.RectF;
import android.os.SystemClock;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class foc implements Runnable {
    public final /* synthetic */ koc a;

    public foc(koc kocVar) {
        this.a = kocVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0820 A[EDGE_INSN: B:197:0x0820->B:198:0x0820 BREAK  A[LOOP:3: B:189:0x07da->B:195:0x081d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015d A[LOOP:1: B:21:0x015b->B:22:0x015d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0890  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x08ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x093f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x09e6  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0a11  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0a44  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x09d2  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0490  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        float f;
        ync yncVar;
        float f2;
        ync yncVar2;
        ync yncVar3;
        boolean z;
        v8b v8bVar;
        boolean z2;
        be0 be0Var;
        joc jocVar;
        RectF Z;
        ync j2;
        int size;
        ArrayList arrayList;
        int size2;
        float f3;
        Iterator it;
        boolean z3;
        float f4;
        boolean b;
        boolean b2;
        int i;
        int i2;
        float f5;
        float f6;
        mmc mmcVar;
        int size3;
        int i3;
        Iterator it2;
        String string;
        boolean z4;
        JSONObject jSONObject;
        float f7;
        ioc iocVar;
        ioc iocVar2;
        boolean optBoolean;
        byte b3;
        ml mlVar;
        float f8;
        float f9;
        float f10;
        float f11;
        ync yncVar4;
        float f12;
        oy8 y;
        float f13;
        float f14;
        ioc iocVar3;
        float f15;
        float f16;
        float f17;
        koc kocVar = this.a;
        if (kocVar.b1 || !kocVar.isAttachedToWindow()) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j3 = 0;
        float min = kocVar.N0 == 0 ? 0.016666668f : Math.min(0.032f, (uptimeMillis - r4) / 1000.0f);
        kocVar.N0 = uptimeMillis;
        if (kocVar.A()) {
            Iterator it3 = kocVar.f.values().iterator();
            boolean z5 = false;
            while (true) {
                j = j3;
                if (!it3.hasNext()) {
                    break;
                }
                joc jocVar2 = (joc) it3.next();
                boolean z6 = jocVar2.K;
                ioc iocVar4 = jocVar2.m;
                ioc iocVar5 = jocVar2.i;
                String str = jocVar2.a;
                ioc iocVar6 = jocVar2.j;
                ml mlVar2 = jocVar2.c;
                ioc iocVar7 = jocVar2.g;
                ioc iocVar8 = jocVar2.f;
                ioc iocVar9 = jocVar2.e;
                ioc iocVar10 = jocVar2.h;
                if (z6) {
                    it2 = it3;
                    f7 = min;
                    z4 = z5;
                } else {
                    jocVar2.K = true;
                    if (kocVar.b) {
                        it2 = it3;
                        string = null;
                    } else {
                        it2 = it3;
                        string = kocVar.e.getString(str, null);
                    }
                    if (kocVar.c1 != null) {
                        TL_wallet.cardSticker R = kocVar.R(str);
                        if (R != null) {
                            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = R.coordinates;
                            if (string == null) {
                                z4 = z5;
                            } else {
                                z4 = z5;
                                try {
                                    optBoolean = new JSONObject(string).optBoolean("q");
                                } catch (Exception unused) {
                                }
                                kocVar.K(jocVar2, mediaAreaCoordinates, optBoolean);
                            }
                            optBoolean = false;
                            kocVar.K(jocVar2, mediaAreaCoordinates, optBoolean);
                        } else {
                            z4 = z5;
                        }
                    } else {
                        z4 = z5;
                        if (string != null) {
                            try {
                                jSONObject = new JSONObject(string);
                                f7 = min;
                                try {
                                    iocVar10.a((float) jSONObject.optDouble("s", 1.0d));
                                    iocVar = iocVar4;
                                    iocVar2 = iocVar6;
                                } catch (Exception unused2) {
                                    iocVar = iocVar4;
                                    iocVar2 = iocVar6;
                                }
                            } catch (Exception unused3) {
                            }
                            try {
                                iocVar5.a((float) jSONObject.optDouble("r", 0.0d));
                                jocVar2.N = jSONObject.optBoolean("q");
                                float[] fArr = {((float) jSONObject.getDouble("x")) * kocVar.Z0, ((float) jSONObject.getDouble("y")) * kocVar.a1, iocVar10.b};
                                iocVar9.a(fArr[0]);
                                iocVar8.a(fArr[1]);
                                iocVar10.a(fArr[2]);
                                jocVar2.H = (byte) 2;
                                long j4 = kocVar.O0 + 1;
                                kocVar.O0 = j4;
                                jocVar2.I = j4;
                                iocVar.a(1.0f);
                                if (jocVar2.J == j) {
                                    long j5 = kocVar.S0 + 1;
                                    kocVar.S0 = j5;
                                    jocVar2.J = j5;
                                }
                                str = str;
                                try {
                                    if (str.equals(kocVar.Q0)) {
                                        kocVar.U0 = jocVar2;
                                        kocVar.T0 = jocVar2;
                                        kocVar.V0 = 1.0f;
                                        kocVar.e();
                                    }
                                } catch (Exception unused4) {
                                }
                            } catch (Exception unused5) {
                                str = str;
                                if (jocVar2.b()) {
                                }
                                while (r7 < r5) {
                                }
                                float f18 = f7;
                                b3 = jocVar2.H;
                                if (b3 == 1) {
                                }
                                z4 = true;
                                if (!jocVar2.b()) {
                                }
                                y = mlVar.y();
                                if (y == null) {
                                }
                                z5 = z4;
                                j3 = j;
                                it3 = it2;
                                min = f8;
                            }
                            if (jocVar2.b()) {
                                jocVar2.a();
                            }
                            for (ioc iocVar11 : jocVar2.s) {
                                z4 |= iocVar11.b(f7);
                            }
                            float f182 = f7;
                            b3 = jocVar2.H;
                            if (b3 == 1) {
                                float t = Utilities.t(iocVar9.a + jocVar2.n.a, iocVar8.a + jocVar2.o.a, iocVar9.b, iocVar8.b);
                                if (jocVar2.M || iocVar2.a >= 0.36f || t >= gl.L(24.0f)) {
                                    f13 = 0.28f;
                                } else {
                                    jocVar2.M = true;
                                    ArrayList arrayList2 = kocVar.n;
                                    float f19 = iocVar9.b;
                                    f13 = 0.28f;
                                    float f20 = iocVar8.b;
                                    goc gocVar = new goc();
                                    gocVar.a = f19;
                                    gocVar.b = f20;
                                    arrayList2.add(gocVar);
                                }
                                if (jocVar2.L || iocVar2.a >= 0.22f || t >= gl.L(12.0f)) {
                                    f14 = t;
                                    iocVar3 = iocVar8;
                                    f15 = 1.4f;
                                } else {
                                    jocVar2.L = true;
                                    ioc iocVar12 = jocVar2.p;
                                    iocVar12.a(1.0f);
                                    iocVar12.b = 0.0f;
                                    ioc iocVar13 = kocVar.Q;
                                    boolean z7 = jocVar2.P;
                                    if (z7) {
                                        f16 = 420.0f;
                                        f17 = 0.38f;
                                    } else {
                                        f16 = 260.0f;
                                        f17 = 0.85f;
                                    }
                                    iocVar13.d = f16;
                                    iocVar13.e = f17;
                                    iocVar13.c -= z7 ? 0.75f : f13;
                                    float f21 = z7 ? 3.4f : 1.4f;
                                    ioc iocVar14 = kocVar.R;
                                    float f22 = iocVar14.c;
                                    f15 = 1.4f;
                                    float f23 = iocVar9.b;
                                    iocVar14.c = (((f23 / kocVar.Z0) - 0.5f) * 2.0f * f21) + f22;
                                    ioc iocVar15 = kocVar.S;
                                    float f24 = iocVar15.c;
                                    float f25 = iocVar8.b;
                                    f14 = t;
                                    iocVar15.c = (((f25 / kocVar.a1) - 0.5f) * 2.0f * f21) + f24;
                                    if (z7) {
                                        Random random = new Random();
                                        int i4 = 0;
                                        while (i4 < 14) {
                                            hoc hocVar = new hoc();
                                            float e = ug8.e(random, 0.35f, (float) ((i4 / 14.0f) * 3.141592653589793d * 2.0d));
                                            float nextFloat = (random.nextFloat() * gl.L(180.0f)) + gl.L(265.0f);
                                            hocVar.a = f23;
                                            hocVar.b = f25;
                                            double d = e;
                                            hocVar.c = ((float) Math.cos(d)) * nextFloat;
                                            hocVar.d = ((float) Math.sin(d)) * nextFloat;
                                            hocVar.e = (random.nextFloat() * gl.L(1.1f)) + gl.L(0.8f);
                                            hocVar.f = ug8.e(random, 0.35f, 0.7f);
                                            hocVar.g = random.nextFloat() * 360.0f;
                                            kocVar.T.add(hocVar);
                                            i4++;
                                            f23 = f23;
                                            iocVar8 = iocVar8;
                                        }
                                    }
                                    iocVar3 = iocVar8;
                                    if (str.equals(kocVar.R0)) {
                                        kocVar.X(jocVar2, false);
                                        kocVar.R0 = null;
                                    }
                                }
                                if (!jocVar2.Q && jocVar2.k.a < 0.3f) {
                                    jocVar2.Q = true;
                                    iocVar7.c -= f15;
                                    kocVar.performHapticFeedback(3);
                                }
                                if (jocVar2.Q && f14 < 0.5f && Math.abs(iocVar7.a - 1.0f) < 0.004f && Math.abs(iocVar7.c) < 0.02f) {
                                    jocVar2.H = (byte) 2;
                                    iocVar9.a(iocVar9.b);
                                    ioc iocVar16 = iocVar3;
                                    iocVar16.a(iocVar16.b);
                                }
                                mlVar = mlVar2;
                                f8 = f182;
                            } else if (b3 == 4) {
                                float z8 = ls6.z(f182, jocVar2.b0, jocVar2.W, 1.0f);
                                jocVar2.W = z8;
                                float f26 = 1.0f - z8;
                                float f27 = 1.0f - (f26 * f26);
                                ync j6 = kocVar.j(jocVar2);
                                float l = Utilities.l(z8 / 0.5f);
                                if (j6 != null) {
                                    f9 = z8;
                                    f8 = f182;
                                    f10 = 1.0f;
                                    f11 = gl.R1(jocVar2.c0, 1.0f, yjb.B(l, 2.0f, 3.0f, l * l));
                                    j6.setScaleX(f11);
                                    j6.setScaleY(f11);
                                } else {
                                    f9 = z8;
                                    f10 = 1.0f;
                                    f8 = f182;
                                    f11 = 1.0f;
                                }
                                RectF Z2 = kocVar.Z(jocVar2);
                                if (Z2 == null) {
                                    iocVar7.a((f10 - f27) * jocVar2.Z);
                                    mlVar = mlVar2;
                                    yncVar4 = j6;
                                    f12 = 1.0f;
                                } else {
                                    float sin = (float) Math.sin(f27 * 3.141592653589793d);
                                    mlVar = mlVar2;
                                    yncVar4 = j6;
                                    float min2 = Math.min(gl.L(90.0f), Utilities.t(Z2.centerX(), Z2.centerY(), jocVar2.X, jocVar2.Y) * 0.28f);
                                    iocVar9.a(gl.R1(jocVar2.X, Z2.centerX(), f27));
                                    iocVar8.a(gl.R1(jocVar2.Y, Z2.centerY(), f27) - ((((1.0f - f27) * 2.0f) * f27) * min2));
                                    iocVar7.a(gl.R1(1.0f, f11, f27) * yjb.z(sin, 0.05f, 1.0f, gl.R1(jocVar2.Z, (kocVar.f(jocVar2) * (Z2.width() / f11)) / kocVar.U(), f27)));
                                    iocVar2.a(sin * 0.8f);
                                    float f28 = jocVar2.a0;
                                    iocVar5.a((koc.c(-f28) * f27) + f28);
                                    f12 = 1.0f;
                                    iocVar.a(Utilities.l(1.0f - ((f27 - 0.35f) / 0.4f)));
                                }
                                if (f9 >= f12) {
                                    kocVar.g(jocVar2);
                                    if (yncVar4 != null) {
                                        yncVar4.animate().scaleX(0.955f).scaleY(0.955f).setDuration(70L).setInterpolator(null).withEndAction(new boc(yncVar4, (byte) 1)).start();
                                    }
                                }
                            } else {
                                mlVar = mlVar2;
                                f8 = f182;
                                if (b3 == 5) {
                                    if (iocVar7.a < 0.03f) {
                                        kocVar.g(jocVar2);
                                    }
                                }
                                if (!jocVar2.b()) {
                                    jocVar2.R = true;
                                } else if (jocVar2.H == 0) {
                                    jocVar2.R = false;
                                }
                                y = mlVar.y();
                                if (y == null && y.l0) {
                                    oy8 y2 = mlVar.y();
                                    int i5 = y2 == null ? 0 : y2.b0;
                                    if (i5 >= 2) {
                                        jocVar2.T = true;
                                    }
                                    boolean z9 = jocVar2.S && !jocVar2.T && jocVar2.H == 2;
                                    if (jocVar2.l.b == 0.0f && !z9 && y2 != null && i5 < 2) {
                                        mlVar.x0();
                                        mlVar.v0 = false;
                                        jocVar2.S = false;
                                    }
                                    z5 = true;
                                } else {
                                    z5 = z4;
                                }
                                j3 = j;
                                it3 = it2;
                                min = f8;
                            }
                            z4 = true;
                            if (!jocVar2.b()) {
                            }
                            y = mlVar.y();
                            if (y == null) {
                            }
                            z5 = z4;
                            j3 = j;
                            it3 = it2;
                            min = f8;
                        }
                    }
                    f7 = min;
                }
                iocVar = iocVar4;
                iocVar2 = iocVar6;
                if (jocVar2.b()) {
                }
                while (r7 < r5) {
                }
                float f1822 = f7;
                b3 = jocVar2.H;
                if (b3 == 1) {
                }
                z4 = true;
                if (!jocVar2.b()) {
                }
                y = mlVar.y();
                if (y == null) {
                }
                z5 = z4;
                j3 = j;
                it3 = it2;
                min = f8;
            }
            float f29 = min;
            boolean z10 = z5;
            ioc iocVar17 = kocVar.r1;
            ioc iocVar18 = kocVar.q1;
            boolean z11 = kocVar.b;
            if (!z11) {
                if (kocVar.i1) {
                    joc jocVar3 = kocVar.l1;
                    if (jocVar3 != null && jocVar3.H == 0 && (j2 = kocVar.j(jocVar3)) != null && kocVar.z(j2) && koc.b(kocVar.l1)) {
                        jocVar = kocVar.l1;
                    } else {
                        ArrayList arrayList3 = kocVar.h;
                        int size4 = arrayList3.size();
                        int i6 = 0;
                        float f30 = 0.0f;
                        float f31 = 0.0f;
                        joc jocVar4 = null;
                        while (i6 < size4) {
                            Object obj = arrayList3.get(i6);
                            i6++;
                            ync yncVar5 = (ync) obj;
                            joc jocVar5 = (joc) kocVar.f.get(yncVar5.x0.address);
                            if (jocVar5 != null && jocVar5.H == 0 && koc.b(jocVar5) && yncVar5.isAttachedToWindow() && kocVar.z(yncVar5) && (Z = kocVar.Z(jocVar5)) != null) {
                                if (jocVar4 != null) {
                                    float f32 = Z.top;
                                    if (f32 >= f30 - 1.0f) {
                                        if (Math.abs(f32 - f30) <= 1.0f && Z.left < f31) {
                                        }
                                    }
                                }
                                f30 = Z.top;
                                f31 = Z.left;
                                jocVar4 = jocVar5;
                            }
                        }
                        jocVar = jocVar4;
                    }
                    if (jocVar != null && jocVar != kocVar.l1) {
                        kocVar.l1 = jocVar;
                        kocVar.n1 = null;
                        kocVar.o1 = 0.0f;
                    }
                }
                joc jocVar6 = kocVar.l1;
                ync j7 = jocVar6 == null ? null : kocVar.j(jocVar6);
                boolean z12 = kocVar.i1 && jocVar6 != null && jocVar6.H == 0 && koc.b(jocVar6) && j7 != null && kocVar.z(j7) && !kocVar.t0 && !kocVar.q0;
                if (jocVar6 != null && (z12 || kocVar.j1)) {
                    jocVar6.a();
                    if (kocVar.n1 == null && jocVar6.u != null) {
                        kocVar.n1 = kocVar.x(jocVar6, kocVar.Z0 * 0.6f, kocVar.a1 * 0.68f, true);
                        jocVar6.N = false;
                    }
                }
                iocVar18.b = z12 ? 1.0f : 0.0f;
                iocVar17.b = ((!z12 && !kocVar.j1) || kocVar.n1 == null || koc.H(jocVar6) == null) ? 0.0f : 1.0f;
                f = f29;
                boolean b4 = iocVar18.b(f) | iocVar17.b(f);
                float f33 = iocVar18.a;
                boolean z13 = f33 > 0.002f || iocVar17.a > 0.002f;
                if (z13) {
                    float f34 = kocVar.o1 + f;
                    kocVar.o1 = f34;
                    f2 = f34;
                    yncVar = null;
                } else {
                    kocVar.o1 = 0.0f;
                    if (kocVar.i1 || kocVar.j1) {
                        yncVar = null;
                    } else {
                        yncVar = null;
                        kocVar.n1 = null;
                    }
                    f2 = 0.0f;
                }
                if (jocVar6 != null && jocVar6.H == 0 && jocVar6.v != null && f33 > 0.002f) {
                    float[] D = kocVar.D(f2 % 2.0f);
                    if (Utilities.l(iocVar18.a) * Math.max(D[0], Math.max(D[1], D[2])) >= 0.003f) {
                        yncVar2 = j7;
                        yncVar3 = kocVar.m1;
                        if (yncVar3 != null && yncVar3 != yncVar2) {
                            be0Var = yncVar3.E;
                            if (be0Var.getAlpha() != 1.0f) {
                                be0Var.setAlpha(1.0f);
                            }
                            yncVar3.invalidate();
                        }
                        kocVar.m1 = yncVar2;
                        if (yncVar2 != null) {
                            be0 be0Var2 = yncVar2.E;
                            if (be0Var2.getAlpha() != 0.0f) {
                                be0Var2.setAlpha(0.0f);
                            }
                            yncVar2.invalidate();
                        }
                        ync yncVar6 = (z12 || iocVar18.a <= 0.5f) ? yncVar : j7;
                        RectF rectF = kocVar.w1;
                        if (kocVar.getParent() instanceof ViewGroup) {
                            RectF Z3 = yncVar6 == null ? yncVar : kocVar.Z(kocVar.l1);
                            if (Z3 != null) {
                                je5 je5Var = kocVar.x1;
                                if (je5Var == null) {
                                    je5Var = kocVar.B(2131742861, true);
                                    kocVar.x1 = je5Var;
                                } else if (kocVar.k1 && !(z2 = je5Var.W)) {
                                    kocVar.k1 = false;
                                    kocVar.j1 = false;
                                    kocVar.i1 = false;
                                    if (z2) {
                                        je5Var.f(true);
                                    }
                                    if (!z11) {
                                        na7.c1().edit().putBoolean("walletcardstickerhint", true).apply();
                                    }
                                    kocVar.f0();
                                }
                                koc.J(je5Var, Z3.centerX(), Z3.top + gl.L(4.0f));
                                je5 je5Var2 = kocVar.x1;
                                if (!je5Var2.W) {
                                    je5Var2.v();
                                }
                                kocVar.k1 = true;
                            } else {
                                kocVar.k1 = false;
                                je5 je5Var3 = kocVar.x1;
                                if (je5Var3 != null && je5Var3.W) {
                                    je5Var3.f(true);
                                }
                            }
                            if (kocVar.j1 && iocVar17.a > 0.5f && (v8bVar = kocVar.d) != null && v8bVar.l() && kocVar.C()) {
                                if (kocVar.y1 == null) {
                                    kocVar.y1 = kocVar.B(2131742862, false);
                                }
                                kocVar.v1.computeBounds(rectF, true);
                                float[] L = kocVar.L(rectF.centerX(), rectF.top);
                                if ((L[1] - gl.L(2.0f)) - gl.L(56.0f) < a.getCurrentActionBarHeight() + gl.m) {
                                    float[] L2 = kocVar.L(rectF.centerX(), rectF.bottom);
                                    je5 je5Var4 = kocVar.y1;
                                    float f35 = L2[0];
                                    float L3 = L2[1] + gl.L(2.0f);
                                    koc.o(je5Var4, 1);
                                    je5Var4.o(0.0f, f35 - je5Var4.getPaddingLeft());
                                    je5Var4.setTranslationY(L3);
                                    je5Var4.invalidate();
                                } else {
                                    koc.J(kocVar.y1, L[0], L[1] - gl.L(2.0f));
                                }
                                je5 je5Var5 = kocVar.y1;
                                if (!je5Var5.W) {
                                    je5Var5.v();
                                }
                            } else {
                                je5 je5Var6 = kocVar.y1;
                                if (je5Var6 != null && je5Var6.W) {
                                    je5Var6.f(true);
                                }
                            }
                        }
                        if (!b4 || z13) {
                            z = true;
                            boolean z14 = z10 | z;
                            size = kocVar.T.size();
                            while (true) {
                                size--;
                                arrayList = kocVar.T;
                                if (size < 0) {
                                    break;
                                }
                                hoc hocVar2 = (hoc) arrayList.get(size);
                                hocVar2.h += f;
                                float exp = (float) Math.exp((-2.4f) * f);
                                float f36 = hocVar2.c * exp;
                                hocVar2.c = f36;
                                float f37 = hocVar2.d * exp;
                                hocVar2.d = f37;
                                hocVar2.a = (f36 * f) + hocVar2.a;
                                hocVar2.b = (f37 * f) + hocVar2.b;
                                hocVar2.g = (f * 90.0f) + hocVar2.g;
                                if (hocVar2.h >= hocVar2.f) {
                                    kocVar.T.remove(size);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                z14 = true;
                            }
                            for (size2 = kocVar.n.size() - 1; size2 >= 0; size2--) {
                                goc gocVar2 = (goc) kocVar.n.get(size2);
                                float f38 = gocVar2.c + f;
                                gocVar2.c = f38;
                                if (f38 > 0.42f) {
                                    kocVar.n.remove(size2);
                                }
                            }
                            f3 = kocVar.V0;
                            if (f3 < 1.0f) {
                                kocVar.V0 = ls6.z(f, kocVar.Y0 ? 0.45f : 1.2f, f3, 1.0f);
                                kocVar.e();
                                z14 = true;
                            }
                            it = kocVar.f.values().iterator();
                            boolean z15 = false;
                            while (it.hasNext()) {
                                if (((joc) it.next()).H == 5) {
                                    z15 = true;
                                }
                            }
                            ioc iocVar19 = kocVar.O;
                            iocVar19.b = ((!kocVar.n0 && kocVar.p0 && iocVar19.b > 0.0f) || z15 || kocVar.g0) ? 1.0f : 0.0f;
                            ioc iocVar20 = kocVar.P;
                            boolean z16 = kocVar.u0;
                            iocVar20.b = (!z16 || z15 || kocVar.g0) ? 1.0f : 0.0f;
                            z3 = kocVar.g0;
                            ioc iocVar21 = kocVar.d0;
                            if (z3) {
                                iocVar21.a(Math.min(66.0f, (f * 60.0f) + iocVar21.a));
                                ioc iocVar22 = kocVar.d0;
                                if (iocVar22.a >= 66.0f) {
                                    kocVar.g0 = false;
                                    f4 = 0.0f;
                                    iocVar22.a(0.0f);
                                } else {
                                    f4 = 0.0f;
                                }
                                b = true;
                            } else {
                                f4 = 0.0f;
                                iocVar21.b = z16 ? 28.0f : 0.0f;
                                b = z14 | iocVar21.b(f);
                            }
                            b2 = b | kocVar.O.b(f) | kocVar.P.b(f) | kocVar.Q.b(f) | kocVar.R.b(f) | kocVar.S.b(f);
                            kocVar.c.setStickerImpact(kocVar.Q.a);
                            smc smcVar = kocVar.c;
                            float max = Math.max(-1.0f, Math.min(1.0f, kocVar.R.a));
                            float max2 = Math.max(-1.0f, Math.min(1.0f, kocVar.S.a));
                            i = smcVar.c0;
                            if (i == 0) {
                                ntb ntbVar = new ntb();
                                float[] fArr2 = new float[8];
                                ntbVar.a(1000, 600, 0.0f, 5.0f, false, fArr2);
                                smcVar.d0 = Math.hypot((double) (fArr2[2] - fArr2[4]), (double) (fArr2[3] - fArr2[5])) < Math.hypot((double) (fArr2[0] - fArr2[6]), (double) (fArr2[1] - fArr2[7])) ? 1 : -1;
                                ntbVar.a(1000, 600, 5.0f, 0.0f, false, fArr2);
                                i2 = 0;
                                int i7 = Math.hypot((double) (fArr2[4] - fArr2[6]), (double) (fArr2[5] - fArr2[7])) < Math.hypot((double) (fArr2[0] - fArr2[2]), (double) (fArr2[1] - fArr2[3])) ? 1 : -1;
                                smcVar.c0 = i7;
                                i = i7;
                            } else {
                                i2 = 0;
                            }
                            f5 = i * max2 * 10.0f;
                            f6 = smcVar.d0 * max * 10.0f;
                            mmcVar = smcVar.E;
                            if (mmcVar.m0 == f5 || mmcVar.n0 != f6) {
                                mmcVar.m0 = f5;
                                mmcVar.n0 = f6;
                                mmcVar.b(mmcVar.d0, mmcVar.g0);
                            }
                            kocVar.b0 = kocVar.c.getCardRotationX();
                            kocVar.c0 = kocVar.c.getCardRotationY();
                            ArrayList arrayList4 = kocVar.h;
                            size3 = arrayList4.size();
                            i3 = i2;
                            while (i3 < size3) {
                                Object obj2 = arrayList4.get(i3);
                                i3++;
                                ync yncVar7 = (ync) obj2;
                                joc jocVar7 = (joc) kocVar.f.get(yncVar7.x0.address);
                                if (jocVar7 != null) {
                                    yncVar7.k(jocVar7.R, true, jocVar7.H == 0 ? f4 : 1.0f);
                                }
                            }
                            kocVar.invalidate();
                            kocVar.M.invalidate();
                            kocVar.N.invalidate();
                            if (b2 && kocVar.n.isEmpty() && !kocVar.q0) {
                                kocVar.N0 = j;
                                return;
                            }
                            kocVar.postOnAnimation(this);
                        }
                    }
                }
                yncVar2 = yncVar;
                yncVar3 = kocVar.m1;
                if (yncVar3 != null) {
                    be0Var = yncVar3.E;
                    if (be0Var.getAlpha() != 1.0f) {
                    }
                    yncVar3.invalidate();
                }
                kocVar.m1 = yncVar2;
                if (yncVar2 != null) {
                }
                if (z12) {
                }
                RectF rectF2 = kocVar.w1;
                if (kocVar.getParent() instanceof ViewGroup) {
                }
                if (!b4) {
                }
                z = true;
                boolean z142 = z10 | z;
                size = kocVar.T.size();
                while (true) {
                    size--;
                    arrayList = kocVar.T;
                    if (size < 0) {
                    }
                }
                if (!arrayList.isEmpty()) {
                }
                while (size2 >= 0) {
                }
                f3 = kocVar.V0;
                if (f3 < 1.0f) {
                }
                it = kocVar.f.values().iterator();
                boolean z152 = false;
                while (it.hasNext()) {
                }
                ioc iocVar192 = kocVar.O;
                iocVar192.b = ((!kocVar.n0 && kocVar.p0 && iocVar192.b > 0.0f) || z152 || kocVar.g0) ? 1.0f : 0.0f;
                ioc iocVar202 = kocVar.P;
                boolean z162 = kocVar.u0;
                iocVar202.b = (!z162 || z152 || kocVar.g0) ? 1.0f : 0.0f;
                z3 = kocVar.g0;
                ioc iocVar212 = kocVar.d0;
                if (z3) {
                }
                b2 = b | kocVar.O.b(f) | kocVar.P.b(f) | kocVar.Q.b(f) | kocVar.R.b(f) | kocVar.S.b(f);
                kocVar.c.setStickerImpact(kocVar.Q.a);
                smc smcVar2 = kocVar.c;
                float max3 = Math.max(-1.0f, Math.min(1.0f, kocVar.R.a));
                float max22 = Math.max(-1.0f, Math.min(1.0f, kocVar.S.a));
                i = smcVar2.c0;
                if (i == 0) {
                }
                f5 = i * max22 * 10.0f;
                f6 = smcVar2.d0 * max3 * 10.0f;
                mmcVar = smcVar2.E;
                if (mmcVar.m0 == f5) {
                }
                mmcVar.m0 = f5;
                mmcVar.n0 = f6;
                mmcVar.b(mmcVar.d0, mmcVar.g0);
                kocVar.b0 = kocVar.c.getCardRotationX();
                kocVar.c0 = kocVar.c.getCardRotationY();
                ArrayList arrayList42 = kocVar.h;
                size3 = arrayList42.size();
                i3 = i2;
                while (i3 < size3) {
                }
                kocVar.invalidate();
                kocVar.M.invalidate();
                kocVar.N.invalidate();
                if (b2) {
                }
                kocVar.postOnAnimation(this);
            }
            f = f29;
            z = false;
            boolean z1422 = z10 | z;
            size = kocVar.T.size();
            while (true) {
                size--;
                arrayList = kocVar.T;
                if (size < 0) {
                }
            }
            if (!arrayList.isEmpty()) {
            }
            while (size2 >= 0) {
            }
            f3 = kocVar.V0;
            if (f3 < 1.0f) {
            }
            it = kocVar.f.values().iterator();
            boolean z1522 = false;
            while (it.hasNext()) {
            }
            ioc iocVar1922 = kocVar.O;
            iocVar1922.b = ((!kocVar.n0 && kocVar.p0 && iocVar1922.b > 0.0f) || z1522 || kocVar.g0) ? 1.0f : 0.0f;
            ioc iocVar2022 = kocVar.P;
            boolean z1622 = kocVar.u0;
            iocVar2022.b = (!z1622 || z1522 || kocVar.g0) ? 1.0f : 0.0f;
            z3 = kocVar.g0;
            ioc iocVar2122 = kocVar.d0;
            if (z3) {
            }
            b2 = b | kocVar.O.b(f) | kocVar.P.b(f) | kocVar.Q.b(f) | kocVar.R.b(f) | kocVar.S.b(f);
            kocVar.c.setStickerImpact(kocVar.Q.a);
            smc smcVar22 = kocVar.c;
            float max32 = Math.max(-1.0f, Math.min(1.0f, kocVar.R.a));
            float max222 = Math.max(-1.0f, Math.min(1.0f, kocVar.S.a));
            i = smcVar22.c0;
            if (i == 0) {
            }
            f5 = i * max222 * 10.0f;
            f6 = smcVar22.d0 * max32 * 10.0f;
            mmcVar = smcVar22.E;
            if (mmcVar.m0 == f5) {
            }
            mmcVar.m0 = f5;
            mmcVar.n0 = f6;
            mmcVar.b(mmcVar.d0, mmcVar.g0);
            kocVar.b0 = kocVar.c.getCardRotationX();
            kocVar.c0 = kocVar.c.getCardRotationY();
            ArrayList arrayList422 = kocVar.h;
            size3 = arrayList422.size();
            i3 = i2;
            while (i3 < size3) {
            }
            kocVar.invalidate();
            kocVar.M.invalidate();
            kocVar.N.invalidate();
            if (b2) {
            }
            kocVar.postOnAnimation(this);
        }
    }
}
