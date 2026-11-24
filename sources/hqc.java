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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class hqc implements Runnable {
    public final /* synthetic */ mqc a;

    public hqc(mqc mqcVar) {
        this.a = mqcVar;
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
        aqc aqcVar;
        float f2;
        aqc aqcVar2;
        aqc aqcVar3;
        boolean z;
        xab xabVar;
        boolean z2;
        bf0 bf0Var;
        lqc lqcVar;
        RectF Z;
        aqc j2;
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
        moc mocVar;
        int size3;
        int i3;
        Iterator it2;
        String string;
        boolean z4;
        JSONObject jSONObject;
        float f7;
        kqc kqcVar;
        kqc kqcVar2;
        boolean optBoolean;
        byte b3;
        mm mmVar;
        float f8;
        float f9;
        float f10;
        float f11;
        aqc aqcVar4;
        float f12;
        p09 y;
        float f13;
        float f14;
        kqc kqcVar3;
        float f15;
        float f16;
        float f17;
        mqc mqcVar = this.a;
        if (mqcVar.b1 || !mqcVar.isAttachedToWindow()) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j3 = 0;
        float min = mqcVar.N0 == 0 ? 0.016666668f : Math.min(0.032f, (uptimeMillis - r4) / 1000.0f);
        mqcVar.N0 = uptimeMillis;
        if (mqcVar.A()) {
            Iterator it3 = mqcVar.f.values().iterator();
            boolean z5 = false;
            while (true) {
                j = j3;
                if (!it3.hasNext()) {
                    break;
                }
                lqc lqcVar2 = (lqc) it3.next();
                boolean z6 = lqcVar2.K;
                kqc kqcVar4 = lqcVar2.m;
                kqc kqcVar5 = lqcVar2.i;
                String str = lqcVar2.a;
                kqc kqcVar6 = lqcVar2.j;
                mm mmVar2 = lqcVar2.c;
                kqc kqcVar7 = lqcVar2.g;
                kqc kqcVar8 = lqcVar2.f;
                kqc kqcVar9 = lqcVar2.e;
                kqc kqcVar10 = lqcVar2.h;
                if (z6) {
                    it2 = it3;
                    f7 = min;
                    z4 = z5;
                } else {
                    lqcVar2.K = true;
                    if (mqcVar.b) {
                        it2 = it3;
                        string = null;
                    } else {
                        it2 = it3;
                        string = mqcVar.e.getString(str, null);
                    }
                    if (mqcVar.c1 != null) {
                        TL_wallet.cardSticker R = mqcVar.R(str);
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
                                mqcVar.K(lqcVar2, mediaAreaCoordinates, optBoolean);
                            }
                            optBoolean = false;
                            mqcVar.K(lqcVar2, mediaAreaCoordinates, optBoolean);
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
                                    kqcVar10.a((float) jSONObject.optDouble("s", 1.0d));
                                    kqcVar = kqcVar4;
                                    kqcVar2 = kqcVar6;
                                } catch (Exception unused2) {
                                    kqcVar = kqcVar4;
                                    kqcVar2 = kqcVar6;
                                }
                            } catch (Exception unused3) {
                            }
                            try {
                                kqcVar5.a((float) jSONObject.optDouble("r", 0.0d));
                                lqcVar2.N = jSONObject.optBoolean("q");
                                float[] fArr = {((float) jSONObject.getDouble("x")) * mqcVar.Z0, ((float) jSONObject.getDouble("y")) * mqcVar.a1, kqcVar10.b};
                                kqcVar9.a(fArr[0]);
                                kqcVar8.a(fArr[1]);
                                kqcVar10.a(fArr[2]);
                                lqcVar2.H = (byte) 2;
                                long j4 = mqcVar.O0 + 1;
                                mqcVar.O0 = j4;
                                lqcVar2.I = j4;
                                kqcVar.a(1.0f);
                                if (lqcVar2.J == j) {
                                    long j5 = mqcVar.S0 + 1;
                                    mqcVar.S0 = j5;
                                    lqcVar2.J = j5;
                                }
                                str = str;
                                try {
                                    if (str.equals(mqcVar.Q0)) {
                                        mqcVar.U0 = lqcVar2;
                                        mqcVar.T0 = lqcVar2;
                                        mqcVar.V0 = 1.0f;
                                        mqcVar.e();
                                    }
                                } catch (Exception unused4) {
                                }
                            } catch (Exception unused5) {
                                str = str;
                                if (lqcVar2.b()) {
                                }
                                while (r7 < r5) {
                                }
                                float f18 = f7;
                                b3 = lqcVar2.H;
                                if (b3 == 1) {
                                }
                                z4 = true;
                                if (!lqcVar2.b()) {
                                }
                                y = mmVar.y();
                                if (y == null) {
                                }
                                z5 = z4;
                                j3 = j;
                                it3 = it2;
                                min = f8;
                            }
                            if (lqcVar2.b()) {
                                lqcVar2.a();
                            }
                            for (kqc kqcVar11 : lqcVar2.s) {
                                z4 |= kqcVar11.b(f7);
                            }
                            float f182 = f7;
                            b3 = lqcVar2.H;
                            if (b3 == 1) {
                                float t = Utilities.t(kqcVar9.a + lqcVar2.n.a, kqcVar8.a + lqcVar2.o.a, kqcVar9.b, kqcVar8.b);
                                if (lqcVar2.M || kqcVar2.a >= 0.36f || t >= gm.L(24.0f)) {
                                    f13 = 0.28f;
                                } else {
                                    lqcVar2.M = true;
                                    ArrayList arrayList2 = mqcVar.n;
                                    float f19 = kqcVar9.b;
                                    f13 = 0.28f;
                                    float f20 = kqcVar8.b;
                                    iqc iqcVar = new iqc();
                                    iqcVar.a = f19;
                                    iqcVar.b = f20;
                                    arrayList2.add(iqcVar);
                                }
                                if (lqcVar2.L || kqcVar2.a >= 0.22f || t >= gm.L(12.0f)) {
                                    f14 = t;
                                    kqcVar3 = kqcVar8;
                                    f15 = 1.4f;
                                } else {
                                    lqcVar2.L = true;
                                    kqc kqcVar12 = lqcVar2.p;
                                    kqcVar12.a(1.0f);
                                    kqcVar12.b = 0.0f;
                                    kqc kqcVar13 = mqcVar.Q;
                                    boolean z7 = lqcVar2.P;
                                    if (z7) {
                                        f16 = 420.0f;
                                        f17 = 0.38f;
                                    } else {
                                        f16 = 260.0f;
                                        f17 = 0.85f;
                                    }
                                    kqcVar13.d = f16;
                                    kqcVar13.e = f17;
                                    kqcVar13.c -= z7 ? 0.75f : f13;
                                    float f21 = z7 ? 3.4f : 1.4f;
                                    kqc kqcVar14 = mqcVar.R;
                                    float f22 = kqcVar14.c;
                                    f15 = 1.4f;
                                    float f23 = kqcVar9.b;
                                    kqcVar14.c = (((f23 / mqcVar.Z0) - 0.5f) * 2.0f * f21) + f22;
                                    kqc kqcVar15 = mqcVar.S;
                                    float f24 = kqcVar15.c;
                                    float f25 = kqcVar8.b;
                                    f14 = t;
                                    kqcVar15.c = (((f25 / mqcVar.a1) - 0.5f) * 2.0f * f21) + f24;
                                    if (z7) {
                                        Random random = new Random();
                                        int i4 = 0;
                                        while (i4 < 14) {
                                            jqc jqcVar = new jqc();
                                            float e = wi8.e(random, 0.35f, (float) ((i4 / 14.0f) * 3.141592653589793d * 2.0d));
                                            float nextFloat = (random.nextFloat() * gm.L(180.0f)) + gm.L(265.0f);
                                            jqcVar.a = f23;
                                            jqcVar.b = f25;
                                            double d = e;
                                            jqcVar.c = ((float) Math.cos(d)) * nextFloat;
                                            jqcVar.d = ((float) Math.sin(d)) * nextFloat;
                                            jqcVar.e = (random.nextFloat() * gm.L(1.1f)) + gm.L(0.8f);
                                            jqcVar.f = wi8.e(random, 0.35f, 0.7f);
                                            jqcVar.g = random.nextFloat() * 360.0f;
                                            mqcVar.T.add(jqcVar);
                                            i4++;
                                            f23 = f23;
                                            kqcVar8 = kqcVar8;
                                        }
                                    }
                                    kqcVar3 = kqcVar8;
                                    if (str.equals(mqcVar.R0)) {
                                        mqcVar.X(lqcVar2, false);
                                        mqcVar.R0 = null;
                                    }
                                }
                                if (!lqcVar2.Q && lqcVar2.k.a < 0.3f) {
                                    lqcVar2.Q = true;
                                    kqcVar7.c -= f15;
                                    mqcVar.performHapticFeedback(3);
                                }
                                if (lqcVar2.Q && f14 < 0.5f && Math.abs(kqcVar7.a - 1.0f) < 0.004f && Math.abs(kqcVar7.c) < 0.02f) {
                                    lqcVar2.H = (byte) 2;
                                    kqcVar9.a(kqcVar9.b);
                                    kqc kqcVar16 = kqcVar3;
                                    kqcVar16.a(kqcVar16.b);
                                }
                                mmVar = mmVar2;
                                f8 = f182;
                            } else if (b3 == 4) {
                                float A = kt6.A(f182, lqcVar2.b0, lqcVar2.W, 1.0f);
                                lqcVar2.W = A;
                                float f26 = 1.0f - A;
                                float f27 = 1.0f - (f26 * f26);
                                aqc j6 = mqcVar.j(lqcVar2);
                                float l = Utilities.l(A / 0.5f);
                                if (j6 != null) {
                                    f9 = A;
                                    f8 = f182;
                                    f10 = 1.0f;
                                    f11 = gm.R1(lqcVar2.c0, 1.0f, mlb.B(l, 2.0f, 3.0f, l * l));
                                    j6.setScaleX(f11);
                                    j6.setScaleY(f11);
                                } else {
                                    f9 = A;
                                    f10 = 1.0f;
                                    f8 = f182;
                                    f11 = 1.0f;
                                }
                                RectF Z2 = mqcVar.Z(lqcVar2);
                                if (Z2 == null) {
                                    kqcVar7.a((f10 - f27) * lqcVar2.Z);
                                    mmVar = mmVar2;
                                    aqcVar4 = j6;
                                    f12 = 1.0f;
                                } else {
                                    float sin = (float) Math.sin(f27 * 3.141592653589793d);
                                    mmVar = mmVar2;
                                    aqcVar4 = j6;
                                    float min2 = Math.min(gm.L(90.0f), Utilities.t(Z2.centerX(), Z2.centerY(), lqcVar2.X, lqcVar2.Y) * 0.28f);
                                    kqcVar9.a(gm.R1(lqcVar2.X, Z2.centerX(), f27));
                                    kqcVar8.a(gm.R1(lqcVar2.Y, Z2.centerY(), f27) - ((((1.0f - f27) * 2.0f) * f27) * min2));
                                    kqcVar7.a(gm.R1(1.0f, f11, f27) * mlb.A(sin, 0.05f, 1.0f, gm.R1(lqcVar2.Z, (mqcVar.f(lqcVar2) * (Z2.width() / f11)) / mqcVar.U(), f27)));
                                    kqcVar2.a(sin * 0.8f);
                                    float f28 = lqcVar2.a0;
                                    kqcVar5.a((mqc.c(-f28) * f27) + f28);
                                    f12 = 1.0f;
                                    kqcVar.a(Utilities.l(1.0f - ((f27 - 0.35f) / 0.4f)));
                                }
                                if (f9 >= f12) {
                                    mqcVar.g(lqcVar2);
                                    if (aqcVar4 != null) {
                                        aqcVar4.animate().scaleX(0.955f).scaleY(0.955f).setDuration(70L).setInterpolator(null).withEndAction(new dqc(aqcVar4, (byte) 1)).start();
                                    }
                                }
                            } else {
                                mmVar = mmVar2;
                                f8 = f182;
                                if (b3 == 5) {
                                    if (kqcVar7.a < 0.03f) {
                                        mqcVar.g(lqcVar2);
                                    }
                                }
                                if (!lqcVar2.b()) {
                                    lqcVar2.R = true;
                                } else if (lqcVar2.H == 0) {
                                    lqcVar2.R = false;
                                }
                                y = mmVar.y();
                                if (y == null && y.l0) {
                                    p09 y2 = mmVar.y();
                                    int i5 = y2 == null ? 0 : y2.b0;
                                    if (i5 >= 2) {
                                        lqcVar2.T = true;
                                    }
                                    boolean z8 = lqcVar2.S && !lqcVar2.T && lqcVar2.H == 2;
                                    if (lqcVar2.l.b == 0.0f && !z8 && y2 != null && i5 < 2) {
                                        mmVar.x0();
                                        mmVar.v0 = false;
                                        lqcVar2.S = false;
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
                            if (!lqcVar2.b()) {
                            }
                            y = mmVar.y();
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
                kqcVar = kqcVar4;
                kqcVar2 = kqcVar6;
                if (lqcVar2.b()) {
                }
                while (r7 < r5) {
                }
                float f1822 = f7;
                b3 = lqcVar2.H;
                if (b3 == 1) {
                }
                z4 = true;
                if (!lqcVar2.b()) {
                }
                y = mmVar.y();
                if (y == null) {
                }
                z5 = z4;
                j3 = j;
                it3 = it2;
                min = f8;
            }
            float f29 = min;
            boolean z9 = z5;
            kqc kqcVar17 = mqcVar.r1;
            kqc kqcVar18 = mqcVar.q1;
            boolean z10 = mqcVar.b;
            if (!z10) {
                if (mqcVar.i1) {
                    lqc lqcVar3 = mqcVar.l1;
                    if (lqcVar3 != null && lqcVar3.H == 0 && (j2 = mqcVar.j(lqcVar3)) != null && mqcVar.z(j2) && mqc.b(mqcVar.l1)) {
                        lqcVar = mqcVar.l1;
                    } else {
                        ArrayList arrayList3 = mqcVar.h;
                        int size4 = arrayList3.size();
                        int i6 = 0;
                        float f30 = 0.0f;
                        float f31 = 0.0f;
                        lqc lqcVar4 = null;
                        while (i6 < size4) {
                            Object obj = arrayList3.get(i6);
                            i6++;
                            aqc aqcVar5 = (aqc) obj;
                            lqc lqcVar5 = (lqc) mqcVar.f.get(aqcVar5.x0.address);
                            if (lqcVar5 != null && lqcVar5.H == 0 && mqc.b(lqcVar5) && aqcVar5.isAttachedToWindow() && mqcVar.z(aqcVar5) && (Z = mqcVar.Z(lqcVar5)) != null) {
                                if (lqcVar4 != null) {
                                    float f32 = Z.top;
                                    if (f32 >= f30 - 1.0f) {
                                        if (Math.abs(f32 - f30) <= 1.0f && Z.left < f31) {
                                        }
                                    }
                                }
                                f30 = Z.top;
                                f31 = Z.left;
                                lqcVar4 = lqcVar5;
                            }
                        }
                        lqcVar = lqcVar4;
                    }
                    if (lqcVar != null && lqcVar != mqcVar.l1) {
                        mqcVar.l1 = lqcVar;
                        mqcVar.n1 = null;
                        mqcVar.o1 = 0.0f;
                    }
                }
                lqc lqcVar6 = mqcVar.l1;
                aqc j7 = lqcVar6 == null ? null : mqcVar.j(lqcVar6);
                boolean z11 = mqcVar.i1 && lqcVar6 != null && lqcVar6.H == 0 && mqc.b(lqcVar6) && j7 != null && mqcVar.z(j7) && !mqcVar.t0 && !mqcVar.q0;
                if (lqcVar6 != null && (z11 || mqcVar.j1)) {
                    lqcVar6.a();
                    if (mqcVar.n1 == null && lqcVar6.u != null) {
                        mqcVar.n1 = mqcVar.x(lqcVar6, mqcVar.Z0 * 0.6f, mqcVar.a1 * 0.68f, true);
                        lqcVar6.N = false;
                    }
                }
                kqcVar18.b = z11 ? 1.0f : 0.0f;
                kqcVar17.b = ((!z11 && !mqcVar.j1) || mqcVar.n1 == null || mqc.H(lqcVar6) == null) ? 0.0f : 1.0f;
                f = f29;
                boolean b4 = kqcVar18.b(f) | kqcVar17.b(f);
                float f33 = kqcVar18.a;
                boolean z12 = f33 > 0.002f || kqcVar17.a > 0.002f;
                if (z12) {
                    float f34 = mqcVar.o1 + f;
                    mqcVar.o1 = f34;
                    f2 = f34;
                    aqcVar = null;
                } else {
                    mqcVar.o1 = 0.0f;
                    if (mqcVar.i1 || mqcVar.j1) {
                        aqcVar = null;
                    } else {
                        aqcVar = null;
                        mqcVar.n1 = null;
                    }
                    f2 = 0.0f;
                }
                if (lqcVar6 != null && lqcVar6.H == 0 && lqcVar6.v != null && f33 > 0.002f) {
                    float[] D = mqcVar.D(f2 % 2.0f);
                    if (Utilities.l(kqcVar18.a) * Math.max(D[0], Math.max(D[1], D[2])) >= 0.003f) {
                        aqcVar2 = j7;
                        aqcVar3 = mqcVar.m1;
                        if (aqcVar3 != null && aqcVar3 != aqcVar2) {
                            bf0Var = aqcVar3.E;
                            if (bf0Var.getAlpha() != 1.0f) {
                                bf0Var.setAlpha(1.0f);
                            }
                            aqcVar3.invalidate();
                        }
                        mqcVar.m1 = aqcVar2;
                        if (aqcVar2 != null) {
                            bf0 bf0Var2 = aqcVar2.E;
                            if (bf0Var2.getAlpha() != 0.0f) {
                                bf0Var2.setAlpha(0.0f);
                            }
                            aqcVar2.invalidate();
                        }
                        aqc aqcVar6 = (z11 || kqcVar18.a <= 0.5f) ? aqcVar : j7;
                        RectF rectF = mqcVar.w1;
                        if (mqcVar.getParent() instanceof ViewGroup) {
                            RectF Z3 = aqcVar6 == null ? aqcVar : mqcVar.Z(mqcVar.l1);
                            if (Z3 != null) {
                                hg5 hg5Var = mqcVar.x1;
                                if (hg5Var == null) {
                                    hg5Var = mqcVar.B(2131742787, true);
                                    mqcVar.x1 = hg5Var;
                                } else if (mqcVar.k1 && !(z2 = hg5Var.W)) {
                                    mqcVar.k1 = false;
                                    mqcVar.j1 = false;
                                    mqcVar.i1 = false;
                                    if (z2) {
                                        hg5Var.f(true);
                                    }
                                    if (!z10) {
                                        oc7.d1().edit().putBoolean("walletcardstickerhint", true).apply();
                                    }
                                    mqcVar.f0();
                                }
                                mqc.J(hg5Var, Z3.centerX(), Z3.top + gm.L(4.0f));
                                hg5 hg5Var2 = mqcVar.x1;
                                if (!hg5Var2.W) {
                                    hg5Var2.v();
                                }
                                mqcVar.k1 = true;
                            } else {
                                mqcVar.k1 = false;
                                hg5 hg5Var3 = mqcVar.x1;
                                if (hg5Var3 != null && hg5Var3.W) {
                                    hg5Var3.f(true);
                                }
                            }
                            if (mqcVar.j1 && kqcVar17.a > 0.5f && (xabVar = mqcVar.d) != null && xabVar.l() && mqcVar.C()) {
                                if (mqcVar.y1 == null) {
                                    mqcVar.y1 = mqcVar.B(2131742788, false);
                                }
                                mqcVar.v1.computeBounds(rectF, true);
                                float[] L = mqcVar.L(rectF.centerX(), rectF.top);
                                if ((L[1] - gm.L(2.0f)) - gm.L(56.0f) < a.getCurrentActionBarHeight() + gm.m) {
                                    float[] L2 = mqcVar.L(rectF.centerX(), rectF.bottom);
                                    hg5 hg5Var4 = mqcVar.y1;
                                    float f35 = L2[0];
                                    float L3 = L2[1] + gm.L(2.0f);
                                    mqc.o(hg5Var4, 1);
                                    hg5Var4.o(0.0f, f35 - hg5Var4.getPaddingLeft());
                                    hg5Var4.setTranslationY(L3);
                                    hg5Var4.invalidate();
                                } else {
                                    mqc.J(mqcVar.y1, L[0], L[1] - gm.L(2.0f));
                                }
                                hg5 hg5Var5 = mqcVar.y1;
                                if (!hg5Var5.W) {
                                    hg5Var5.v();
                                }
                            } else {
                                hg5 hg5Var6 = mqcVar.y1;
                                if (hg5Var6 != null && hg5Var6.W) {
                                    hg5Var6.f(true);
                                }
                            }
                        }
                        if (!b4 || z12) {
                            z = true;
                            boolean z13 = z9 | z;
                            size = mqcVar.T.size();
                            while (true) {
                                size--;
                                arrayList = mqcVar.T;
                                if (size < 0) {
                                    break;
                                }
                                jqc jqcVar2 = (jqc) arrayList.get(size);
                                jqcVar2.h += f;
                                float exp = (float) Math.exp((-2.4f) * f);
                                float f36 = jqcVar2.c * exp;
                                jqcVar2.c = f36;
                                float f37 = jqcVar2.d * exp;
                                jqcVar2.d = f37;
                                jqcVar2.a = (f36 * f) + jqcVar2.a;
                                jqcVar2.b = (f37 * f) + jqcVar2.b;
                                jqcVar2.g = (f * 90.0f) + jqcVar2.g;
                                if (jqcVar2.h >= jqcVar2.f) {
                                    mqcVar.T.remove(size);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                z13 = true;
                            }
                            for (size2 = mqcVar.n.size() - 1; size2 >= 0; size2--) {
                                iqc iqcVar2 = (iqc) mqcVar.n.get(size2);
                                float f38 = iqcVar2.c + f;
                                iqcVar2.c = f38;
                                if (f38 > 0.42f) {
                                    mqcVar.n.remove(size2);
                                }
                            }
                            f3 = mqcVar.V0;
                            if (f3 < 1.0f) {
                                mqcVar.V0 = kt6.A(f, mqcVar.Y0 ? 0.45f : 1.2f, f3, 1.0f);
                                mqcVar.e();
                                z13 = true;
                            }
                            it = mqcVar.f.values().iterator();
                            boolean z14 = false;
                            while (it.hasNext()) {
                                if (((lqc) it.next()).H == 5) {
                                    z14 = true;
                                }
                            }
                            kqc kqcVar19 = mqcVar.O;
                            kqcVar19.b = ((!mqcVar.n0 && mqcVar.p0 && kqcVar19.b > 0.0f) || z14 || mqcVar.g0) ? 1.0f : 0.0f;
                            kqc kqcVar20 = mqcVar.P;
                            boolean z15 = mqcVar.u0;
                            kqcVar20.b = (!z15 || z14 || mqcVar.g0) ? 1.0f : 0.0f;
                            z3 = mqcVar.g0;
                            kqc kqcVar21 = mqcVar.d0;
                            if (z3) {
                                kqcVar21.a(Math.min(66.0f, (f * 60.0f) + kqcVar21.a));
                                kqc kqcVar22 = mqcVar.d0;
                                if (kqcVar22.a >= 66.0f) {
                                    mqcVar.g0 = false;
                                    f4 = 0.0f;
                                    kqcVar22.a(0.0f);
                                } else {
                                    f4 = 0.0f;
                                }
                                b = true;
                            } else {
                                f4 = 0.0f;
                                kqcVar21.b = z15 ? 28.0f : 0.0f;
                                b = z13 | kqcVar21.b(f);
                            }
                            b2 = b | mqcVar.O.b(f) | mqcVar.P.b(f) | mqcVar.Q.b(f) | mqcVar.R.b(f) | mqcVar.S.b(f);
                            mqcVar.c.setStickerImpact(mqcVar.Q.a);
                            soc socVar = mqcVar.c;
                            float max = Math.max(-1.0f, Math.min(1.0f, mqcVar.R.a));
                            float max2 = Math.max(-1.0f, Math.min(1.0f, mqcVar.S.a));
                            i = socVar.c0;
                            if (i == 0) {
                                ovb ovbVar = new ovb();
                                float[] fArr2 = new float[8];
                                ovbVar.a(1000, 600, 0.0f, 5.0f, false, fArr2);
                                socVar.d0 = Math.hypot((double) (fArr2[2] - fArr2[4]), (double) (fArr2[3] - fArr2[5])) < Math.hypot((double) (fArr2[0] - fArr2[6]), (double) (fArr2[1] - fArr2[7])) ? 1 : -1;
                                ovbVar.a(1000, 600, 5.0f, 0.0f, false, fArr2);
                                i2 = 0;
                                int i7 = Math.hypot((double) (fArr2[4] - fArr2[6]), (double) (fArr2[5] - fArr2[7])) < Math.hypot((double) (fArr2[0] - fArr2[2]), (double) (fArr2[1] - fArr2[3])) ? 1 : -1;
                                socVar.c0 = i7;
                                i = i7;
                            } else {
                                i2 = 0;
                            }
                            f5 = i * max2 * 10.0f;
                            f6 = socVar.d0 * max * 10.0f;
                            mocVar = socVar.E;
                            if (mocVar.m0 == f5 || mocVar.n0 != f6) {
                                mocVar.m0 = f5;
                                mocVar.n0 = f6;
                                mocVar.b(mocVar.d0, mocVar.g0);
                            }
                            mqcVar.b0 = mqcVar.c.getCardRotationX();
                            mqcVar.c0 = mqcVar.c.getCardRotationY();
                            ArrayList arrayList4 = mqcVar.h;
                            size3 = arrayList4.size();
                            i3 = i2;
                            while (i3 < size3) {
                                Object obj2 = arrayList4.get(i3);
                                i3++;
                                aqc aqcVar7 = (aqc) obj2;
                                lqc lqcVar7 = (lqc) mqcVar.f.get(aqcVar7.x0.address);
                                if (lqcVar7 != null) {
                                    aqcVar7.k(lqcVar7.R, true, lqcVar7.H == 0 ? f4 : 1.0f);
                                }
                            }
                            mqcVar.invalidate();
                            mqcVar.M.invalidate();
                            mqcVar.N.invalidate();
                            if (b2 && mqcVar.n.isEmpty() && !mqcVar.q0) {
                                mqcVar.N0 = j;
                                return;
                            }
                            mqcVar.postOnAnimation(this);
                        }
                    }
                }
                aqcVar2 = aqcVar;
                aqcVar3 = mqcVar.m1;
                if (aqcVar3 != null) {
                    bf0Var = aqcVar3.E;
                    if (bf0Var.getAlpha() != 1.0f) {
                    }
                    aqcVar3.invalidate();
                }
                mqcVar.m1 = aqcVar2;
                if (aqcVar2 != null) {
                }
                if (z11) {
                }
                RectF rectF2 = mqcVar.w1;
                if (mqcVar.getParent() instanceof ViewGroup) {
                }
                if (!b4) {
                }
                z = true;
                boolean z132 = z9 | z;
                size = mqcVar.T.size();
                while (true) {
                    size--;
                    arrayList = mqcVar.T;
                    if (size < 0) {
                    }
                }
                if (!arrayList.isEmpty()) {
                }
                while (size2 >= 0) {
                }
                f3 = mqcVar.V0;
                if (f3 < 1.0f) {
                }
                it = mqcVar.f.values().iterator();
                boolean z142 = false;
                while (it.hasNext()) {
                }
                kqc kqcVar192 = mqcVar.O;
                kqcVar192.b = ((!mqcVar.n0 && mqcVar.p0 && kqcVar192.b > 0.0f) || z142 || mqcVar.g0) ? 1.0f : 0.0f;
                kqc kqcVar202 = mqcVar.P;
                boolean z152 = mqcVar.u0;
                kqcVar202.b = (!z152 || z142 || mqcVar.g0) ? 1.0f : 0.0f;
                z3 = mqcVar.g0;
                kqc kqcVar212 = mqcVar.d0;
                if (z3) {
                }
                b2 = b | mqcVar.O.b(f) | mqcVar.P.b(f) | mqcVar.Q.b(f) | mqcVar.R.b(f) | mqcVar.S.b(f);
                mqcVar.c.setStickerImpact(mqcVar.Q.a);
                soc socVar2 = mqcVar.c;
                float max3 = Math.max(-1.0f, Math.min(1.0f, mqcVar.R.a));
                float max22 = Math.max(-1.0f, Math.min(1.0f, mqcVar.S.a));
                i = socVar2.c0;
                if (i == 0) {
                }
                f5 = i * max22 * 10.0f;
                f6 = socVar2.d0 * max3 * 10.0f;
                mocVar = socVar2.E;
                if (mocVar.m0 == f5) {
                }
                mocVar.m0 = f5;
                mocVar.n0 = f6;
                mocVar.b(mocVar.d0, mocVar.g0);
                mqcVar.b0 = mqcVar.c.getCardRotationX();
                mqcVar.c0 = mqcVar.c.getCardRotationY();
                ArrayList arrayList42 = mqcVar.h;
                size3 = arrayList42.size();
                i3 = i2;
                while (i3 < size3) {
                }
                mqcVar.invalidate();
                mqcVar.M.invalidate();
                mqcVar.N.invalidate();
                if (b2) {
                }
                mqcVar.postOnAnimation(this);
            }
            f = f29;
            z = false;
            boolean z1322 = z9 | z;
            size = mqcVar.T.size();
            while (true) {
                size--;
                arrayList = mqcVar.T;
                if (size < 0) {
                }
            }
            if (!arrayList.isEmpty()) {
            }
            while (size2 >= 0) {
            }
            f3 = mqcVar.V0;
            if (f3 < 1.0f) {
            }
            it = mqcVar.f.values().iterator();
            boolean z1422 = false;
            while (it.hasNext()) {
            }
            kqc kqcVar1922 = mqcVar.O;
            kqcVar1922.b = ((!mqcVar.n0 && mqcVar.p0 && kqcVar1922.b > 0.0f) || z1422 || mqcVar.g0) ? 1.0f : 0.0f;
            kqc kqcVar2022 = mqcVar.P;
            boolean z1522 = mqcVar.u0;
            kqcVar2022.b = (!z1522 || z1422 || mqcVar.g0) ? 1.0f : 0.0f;
            z3 = mqcVar.g0;
            kqc kqcVar2122 = mqcVar.d0;
            if (z3) {
            }
            b2 = b | mqcVar.O.b(f) | mqcVar.P.b(f) | mqcVar.Q.b(f) | mqcVar.R.b(f) | mqcVar.S.b(f);
            mqcVar.c.setStickerImpact(mqcVar.Q.a);
            soc socVar22 = mqcVar.c;
            float max32 = Math.max(-1.0f, Math.min(1.0f, mqcVar.R.a));
            float max222 = Math.max(-1.0f, Math.min(1.0f, mqcVar.S.a));
            i = socVar22.c0;
            if (i == 0) {
            }
            f5 = i * max222 * 10.0f;
            f6 = socVar22.d0 * max32 * 10.0f;
            mocVar = socVar22.E;
            if (mocVar.m0 == f5) {
            }
            mocVar.m0 = f5;
            mocVar.n0 = f6;
            mocVar.b(mocVar.d0, mocVar.g0);
            mqcVar.b0 = mqcVar.c.getCardRotationX();
            mqcVar.c0 = mqcVar.c.getCardRotationY();
            ArrayList arrayList422 = mqcVar.h;
            size3 = arrayList422.size();
            i3 = i2;
            while (i3 < size3) {
            }
            mqcVar.invalidate();
            mqcVar.M.invalidate();
            mqcVar.N.invalidate();
            if (b2) {
            }
            mqcVar.postOnAnimation(this);
        }
    }
}
