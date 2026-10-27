package org.telegram.ui.Wallet;

import android.graphics.RectF;
import android.os.SystemClock;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.yj0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class o7 implements Runnable {
    public final /* synthetic */ t7 a;

    public o7(t7 t7Var) {
        this.a = t7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0934 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x09bd  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0a65  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0a8d  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0ac1  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0a4f  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x06ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x084f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04e8  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j10;
        float min;
        LinkedHashMap linkedHashMap;
        float f7;
        g7 g7Var;
        g7 g7Var2;
        g7 g7Var3;
        boolean z10;
        m4.c cVar;
        boolean z11;
        org.telegram.ui.Components.y9 y9Var;
        float[] D;
        s7 s7Var;
        RectF Z;
        g7 j11;
        int size;
        int size2;
        float f10;
        Iterator it;
        boolean b10;
        boolean b11;
        int i10;
        float f11;
        float f12;
        r5 r5Var;
        int size3;
        int i11;
        r7 r7Var;
        ArrayList arrayList;
        String string;
        r7 r7Var2;
        r7 r7Var3;
        r7 r7Var4;
        boolean optBoolean;
        ArrayList arrayList2;
        r7 r7Var5;
        r7 r7Var6;
        r7 r7Var7;
        ArrayList arrayList3;
        float f13;
        float f14;
        float f15;
        g7 g7Var4;
        float f16;
        float f17;
        r7 r7Var8;
        r7 r7Var9;
        r7 r7Var10;
        float f18;
        ArrayList arrayList4;
        r7 r7Var11;
        t7 t7Var = this.a;
        boolean z12 = t7Var.b;
        r7 r7Var12 = t7Var.c0;
        r7 r7Var13 = t7Var.R;
        r7 r7Var14 = t7Var.Q;
        r7 r7Var15 = t7Var.P;
        w5 w5Var = t7Var.c;
        LinkedHashMap linkedHashMap2 = t7Var.f;
        ArrayList arrayList5 = t7Var.S;
        ArrayList arrayList6 = t7Var.n;
        if (t7Var.a1 || !t7Var.isAttachedToWindow()) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (t7Var.M0 == 0) {
            min = 0.016666668f;
            j10 = 0;
        } else {
            j10 = 0;
            min = Math.min(0.032f, (uptimeMillis - r13) / 1000.0f);
        }
        t7Var.M0 = uptimeMillis;
        if (t7Var.A()) {
            Iterator it2 = linkedHashMap2.values().iterator();
            boolean z13 = false;
            while (it2.hasNext()) {
                s7 s7Var2 = (s7) it2.next();
                boolean z14 = s7Var2.K;
                boolean z15 = z12;
                r7 r7Var16 = s7Var2.m;
                Iterator it3 = it2;
                r7 r7Var17 = s7Var2.i;
                String str = s7Var2.a;
                boolean z16 = z13;
                r7 r7Var18 = s7Var2.j;
                di.f3 f3Var = s7Var2.c;
                w5 w5Var2 = w5Var;
                r7 r7Var19 = s7Var2.g;
                r7 r7Var20 = r7Var12;
                r7 r7Var21 = s7Var2.f;
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                r7 r7Var22 = s7Var2.e;
                r7 r7Var23 = s7Var2.h;
                if (z14) {
                    r7Var2 = r7Var13;
                    r7Var3 = r7Var14;
                    r7Var4 = r7Var15;
                    r7Var = r7Var19;
                    arrayList = arrayList5;
                } else {
                    r7Var = r7Var19;
                    s7Var2.K = true;
                    if (z15) {
                        arrayList = arrayList5;
                        string = null;
                    } else {
                        arrayList = arrayList5;
                        string = t7Var.e.getString(str, null);
                    }
                    if (t7Var.b1 != null) {
                        TL_wallet.cardSticker R = t7Var.R(str);
                        if (R != null) {
                            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = R.coordinates;
                            if (string == null) {
                                r7Var2 = r7Var13;
                            } else {
                                r7Var2 = r7Var13;
                                try {
                                    optBoolean = new JSONObject(string).optBoolean("q");
                                } catch (Exception unused) {
                                }
                                t7Var.K(s7Var2, mediaAreaCoordinates, optBoolean);
                            }
                            optBoolean = false;
                            t7Var.K(s7Var2, mediaAreaCoordinates, optBoolean);
                        } else {
                            r7Var2 = r7Var13;
                        }
                    } else {
                        r7Var2 = r7Var13;
                        if (string != null) {
                            try {
                                JSONObject jSONObject = new JSONObject(string);
                                r7Var3 = r7Var14;
                                r7Var4 = r7Var15;
                                try {
                                    r7Var23.a((float) jSONObject.optDouble("s", 1.0d));
                                    r7Var17.a((float) jSONObject.optDouble("r", 0.0d));
                                    s7Var2.N = jSONObject.optBoolean("q");
                                    float[] fArr = {((float) jSONObject.getDouble("x")) * t7Var.Y0, ((float) jSONObject.getDouble("y")) * t7Var.Z0, r7Var23.b};
                                    r7Var22.a(fArr[0]);
                                    r7Var21.a(fArr[1]);
                                    r7Var23.a(fArr[2]);
                                    s7Var2.H = 2;
                                    long j12 = t7Var.N0 + 1;
                                    t7Var.N0 = j12;
                                    s7Var2.I = j12;
                                    r7Var16.a(1.0f);
                                    if (s7Var2.J == j10) {
                                        long j13 = t7Var.R0 + 1;
                                        t7Var.R0 = j13;
                                        s7Var2.J = j13;
                                    }
                                    if (str.equals(t7Var.P0)) {
                                        t7Var.T0 = s7Var2;
                                        t7Var.S0 = s7Var2;
                                        t7Var.U0 = 1.0f;
                                        t7Var.e();
                                    }
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                            }
                        }
                    }
                    r7Var3 = r7Var14;
                    r7Var4 = r7Var15;
                }
                if (s7Var2.b()) {
                    s7Var2.a();
                }
                for (r7 r7Var24 : s7Var2.s) {
                    z16 |= r7Var24.b(min);
                }
                int i12 = s7Var2.H;
                if (i12 == 1) {
                    float dist = Utilities.dist(r7Var22.a + s7Var2.n.a, r7Var21.a + s7Var2.o.a, r7Var22.b, r7Var21.b);
                    if (!s7Var2.M && r7Var18.a < 0.36f && dist < AndroidUtilities.dp(24.0f)) {
                        s7Var2.M = true;
                        float f19 = r7Var22.b;
                        float f20 = r7Var21.b;
                        p7 p7Var = new p7();
                        p7Var.a = f19;
                        p7Var.b = f20;
                        arrayList6.add(p7Var);
                    }
                    if (s7Var2.L || r7Var18.a >= 0.22f || dist >= AndroidUtilities.dp(12.0f)) {
                        f17 = dist;
                        r7Var8 = r7Var2;
                        r7Var9 = r7Var3;
                        r7Var10 = r7Var4;
                        f18 = 1.4f;
                        arrayList2 = arrayList6;
                        arrayList4 = arrayList;
                    } else {
                        s7Var2.L = true;
                        r7 r7Var25 = s7Var2.p;
                        r7Var25.a(1.0f);
                        r7Var25.b = 0.0f;
                        boolean z17 = s7Var2.P;
                        float f21 = z17 ? 420.0f : 260.0f;
                        float f22 = z17 ? 0.38f : 0.85f;
                        r7Var10 = r7Var4;
                        f18 = 1.4f;
                        r7Var10.d = f21;
                        r7Var10.e = f22;
                        r7Var10.c -= z17 ? 0.75f : 0.28f;
                        float f23 = z17 ? 3.4f : 1.4f;
                        r7 r7Var26 = r7Var3;
                        float f24 = r7Var26.c;
                        float f25 = r7Var22.b;
                        r7Var26.c = (((f25 / t7Var.Y0) - 0.5f) * 2.0f * f23) + f24;
                        r7Var8 = r7Var2;
                        float f26 = r7Var8.c;
                        float f27 = r7Var21.b;
                        f17 = dist;
                        r7Var8.c = (((f27 / t7Var.Z0) - 0.5f) * 2.0f * f23) + f26;
                        if (z17) {
                            Random random = new Random();
                            int i13 = 0;
                            while (i13 < 14) {
                                q7 q7Var = new q7();
                                ArrayList arrayList7 = arrayList6;
                                float f28 = org.telegram.ui.d3.f(random, 0.35f, (float) ((i13 / 14.0f) * 3.141592653589793d * 2.0d));
                                float nextFloat = (random.nextFloat() * AndroidUtilities.dp(180.0f)) + AndroidUtilities.dp(265.0f);
                                q7Var.a = f25;
                                q7Var.b = f27;
                                double d = f28;
                                q7Var.c = ((float) Math.cos(d)) * nextFloat;
                                q7Var.d = ((float) Math.sin(d)) * nextFloat;
                                q7Var.e = (random.nextFloat() * AndroidUtilities.dp(1.1f)) + AndroidUtilities.dp(0.8f);
                                q7Var.f = org.telegram.ui.d3.f(random, 0.35f, 0.7f);
                                q7Var.g = random.nextFloat() * 360.0f;
                                arrayList.add(q7Var);
                                i13++;
                                r7Var26 = r7Var26;
                                arrayList6 = arrayList7;
                            }
                        }
                        arrayList2 = arrayList6;
                        r7Var9 = r7Var26;
                        arrayList4 = arrayList;
                        if (str.equals(t7Var.Q0)) {
                            t7Var.X(s7Var2, false);
                            t7Var.Q0 = null;
                        }
                    }
                    if (s7Var2.Q || s7Var2.k.a >= 0.3f) {
                        r7Var11 = r7Var;
                    } else {
                        s7Var2.Q = true;
                        r7Var11 = r7Var;
                        r7Var11.c -= f18;
                        t7Var.performHapticFeedback(3);
                    }
                    if (s7Var2.Q && f17 < 0.5f && Math.abs(r7Var11.a - 1.0f) < 0.004f && Math.abs(r7Var11.c) < 0.02f) {
                        s7Var2.H = 2;
                        r7Var22.a(r7Var22.b);
                        r7Var21.a(r7Var21.b);
                    }
                    r7Var5 = r7Var10;
                    r7Var6 = r7Var8;
                    arrayList3 = arrayList4;
                    f13 = min;
                    r7Var7 = r7Var9;
                } else {
                    r7 r7Var27 = r7Var;
                    r7 r7Var28 = r7Var2;
                    r7 r7Var29 = r7Var3;
                    r7 r7Var30 = r7Var4;
                    arrayList2 = arrayList6;
                    ArrayList arrayList8 = arrayList;
                    if (i12 == 4) {
                        float d10 = org.telegram.ui.d3.d(min, s7Var2.b0, s7Var2.W, 1.0f);
                        s7Var2.W = d10;
                        float f29 = 1.0f - d10;
                        float f30 = 1.0f - (f29 * f29);
                        g7 j14 = t7Var.j(s7Var2);
                        float clamp01 = Utilities.clamp01(d10 / 0.5f);
                        if (j14 != null) {
                            r7Var6 = r7Var28;
                            r7Var7 = r7Var29;
                            r7Var5 = r7Var30;
                            arrayList3 = arrayList8;
                            f14 = 1.0f;
                            f15 = AndroidUtilities.lerp(s7Var2.c0, 1.0f, c3.h0.D(clamp01, 2.0f, 3.0f, clamp01 * clamp01));
                        } else {
                            r7Var5 = r7Var30;
                            r7Var6 = r7Var28;
                            r7Var7 = r7Var29;
                            arrayList3 = arrayList8;
                            f14 = 1.0f;
                            f15 = 1.0f;
                        }
                        if (j14 != null) {
                            j14.setScaleX(f15);
                            j14.setScaleY(f15);
                        }
                        RectF Z2 = t7Var.Z(s7Var2);
                        if (Z2 == null) {
                            r7Var27.a((f14 - f30) * s7Var2.Z);
                            g7Var4 = j14;
                            f13 = min;
                            f16 = 1.0f;
                        } else {
                            float sin = (float) Math.sin(f30 * 3.141592653589793d);
                            f13 = min;
                            g7Var4 = j14;
                            float min2 = Math.min(AndroidUtilities.dp(90.0f), Utilities.dist(Z2.centerX(), Z2.centerY(), s7Var2.X, s7Var2.Y) * 0.28f);
                            r7Var22.a(AndroidUtilities.lerp(s7Var2.X, Z2.centerX(), f30));
                            r7Var21.a(AndroidUtilities.lerp(s7Var2.Y, Z2.centerY(), f30) - ((((1.0f - f30) * 2.0f) * f30) * min2));
                            r7Var27.a(AndroidUtilities.lerp(1.0f, f15, f30) * c3.h0.C(sin, 0.05f, 1.0f, AndroidUtilities.lerp(s7Var2.Z, (t7Var.f(s7Var2) * (Z2.width() / f15)) / t7Var.U(), f30)));
                            r7Var18.a(sin * 0.8f);
                            float f31 = s7Var2.a0;
                            r7Var17.a((t7.c(-f31) * f30) + f31);
                            f16 = 1.0f;
                            r7Var16.a(Utilities.clamp01(1.0f - ((f30 - 0.35f) / 0.4f)));
                        }
                        if (d10 >= f16) {
                            t7Var.g(s7Var2);
                            if (g7Var4 != null) {
                                g7Var4.animate().scaleX(0.955f).scaleY(0.955f).setDuration(70L).setInterpolator(null).withEndAction(new j7(g7Var4, 1)).start();
                            }
                        }
                    } else {
                        r7Var5 = r7Var30;
                        r7Var6 = r7Var28;
                        r7Var7 = r7Var29;
                        arrayList3 = arrayList8;
                        f13 = min;
                        if (i12 == 5) {
                            if (r7Var27.a < 0.03f) {
                                t7Var.g(s7Var2);
                            }
                        }
                        if (!s7Var2.b()) {
                            s7Var2.R = true;
                        } else if (s7Var2.H == 0) {
                            s7Var2.R = false;
                        }
                        if (f3Var.isLottieRunning()) {
                            z13 = z16;
                        } else {
                            yj0 lottieAnimation = f3Var.getLottieAnimation();
                            int i14 = lottieAnimation == null ? 0 : lottieAnimation.a0;
                            if (i14 >= 2) {
                                s7Var2.T = true;
                            }
                            boolean z18 = s7Var2.S && !s7Var2.T && s7Var2.H == 2;
                            if (s7Var2.l.b == 0.0f && !z18 && lottieAnimation != null && i14 < 2) {
                                f3Var.stopAnimation();
                                f3Var.setAllowStartLottieAnimation(false);
                                s7Var2.S = false;
                            }
                            z13 = true;
                        }
                        z12 = z15;
                        it2 = it3;
                        w5Var = w5Var2;
                        r7Var12 = r7Var20;
                        linkedHashMap2 = linkedHashMap3;
                        r7Var13 = r7Var6;
                        arrayList6 = arrayList2;
                        min = f13;
                        r7Var14 = r7Var7;
                        r7Var15 = r7Var5;
                        arrayList5 = arrayList3;
                    }
                }
                z16 = true;
                if (!s7Var2.b()) {
                }
                if (f3Var.isLottieRunning()) {
                }
                z12 = z15;
                it2 = it3;
                w5Var = w5Var2;
                r7Var12 = r7Var20;
                linkedHashMap2 = linkedHashMap3;
                r7Var13 = r7Var6;
                arrayList6 = arrayList2;
                min = f13;
                r7Var14 = r7Var7;
                r7Var15 = r7Var5;
                arrayList5 = arrayList3;
            }
            boolean z19 = z12;
            r7 r7Var31 = r7Var12;
            r7 r7Var32 = r7Var13;
            r7 r7Var33 = r7Var14;
            r7 r7Var34 = r7Var15;
            w5 w5Var3 = w5Var;
            LinkedHashMap linkedHashMap4 = linkedHashMap2;
            ArrayList arrayList9 = arrayList5;
            ArrayList arrayList10 = arrayList6;
            boolean z20 = z13;
            float f32 = min;
            r7 r7Var35 = t7Var.q1;
            r7 r7Var36 = t7Var.p1;
            if (!z19) {
                if (t7Var.h1) {
                    s7 s7Var3 = t7Var.k1;
                    if (s7Var3 != null && s7Var3.H == 0 && (j11 = t7Var.j(s7Var3)) != null && t7Var.z(j11) && t7.b(t7Var.k1)) {
                        s7Var = t7Var.k1;
                    } else {
                        ArrayList arrayList11 = t7Var.h;
                        int size4 = arrayList11.size();
                        int i15 = 0;
                        s7 s7Var4 = null;
                        float f33 = 0.0f;
                        float f34 = 0.0f;
                        while (i15 < size4) {
                            Object obj = arrayList11.get(i15);
                            i15++;
                            g7 g7Var5 = (g7) obj;
                            LinkedHashMap linkedHashMap5 = linkedHashMap4;
                            s7 s7Var5 = (s7) linkedHashMap5.get(g7Var5.w0.address);
                            if (s7Var5 != null && s7Var5.H == 0 && t7.b(s7Var5) && g7Var5.isAttachedToWindow() && t7Var.z(g7Var5) && (Z = t7Var.Z(s7Var5)) != null) {
                                if (s7Var4 != null) {
                                    float f35 = Z.top;
                                    if (f35 >= f33 - 1.0f) {
                                        if (Math.abs(f35 - f33) <= 1.0f) {
                                            if (Z.left >= f34) {
                                            }
                                        }
                                    }
                                }
                                float f36 = Z.top;
                                f34 = Z.left;
                                f33 = f36;
                                s7Var4 = s7Var5;
                            }
                            linkedHashMap4 = linkedHashMap5;
                        }
                        s7Var = s7Var4;
                    }
                    linkedHashMap = linkedHashMap4;
                    if (s7Var != null && s7Var != t7Var.k1) {
                        t7Var.k1 = s7Var;
                        t7Var.m1 = null;
                        t7Var.n1 = 0.0f;
                    }
                } else {
                    linkedHashMap = linkedHashMap4;
                }
                s7 s7Var6 = t7Var.k1;
                g7 j15 = s7Var6 == null ? null : t7Var.j(s7Var6);
                boolean z21 = t7Var.h1 && s7Var6 != null && s7Var6.H == 0 && t7.b(s7Var6) && j15 != null && t7Var.z(j15) && !t7Var.s0 && !t7Var.p0;
                if (s7Var6 != null && (z21 || t7Var.i1)) {
                    s7Var6.a();
                    if (t7Var.m1 == null && s7Var6.u != null) {
                        t7Var.m1 = t7Var.x(s7Var6, t7Var.Y0 * 0.6f, t7Var.Z0 * 0.68f, true);
                        s7Var6.N = false;
                    }
                }
                r7Var36.b = z21 ? 1.0f : 0.0f;
                r7Var35.b = ((!z21 && !t7Var.i1) || t7Var.m1 == null || t7.H(s7Var6) == null) ? 0.0f : 1.0f;
                f7 = f32;
                boolean b12 = r7Var36.b(f7) | r7Var35.b(f7);
                float f37 = r7Var36.a;
                boolean z22 = f37 > 0.002f || r7Var35.a > 0.002f;
                if (z22) {
                    t7Var.n1 += f7;
                } else {
                    t7Var.n1 = 0.0f;
                    if (!t7Var.h1 && !t7Var.i1) {
                        g7Var = null;
                        t7Var.m1 = null;
                        if (s7Var6 != null && s7Var6.H == 0 && s7Var6.v != null && f37 > 0.002f) {
                            D = t7Var.D(t7Var.n1 % 2.0f);
                            if (Utilities.clamp01(r7Var36.a) * Math.max(D[0], Math.max(D[1], D[2])) >= 0.003f) {
                                g7Var2 = j15;
                                g7Var3 = t7Var.l1;
                                if (g7Var3 != null && g7Var3 != g7Var2) {
                                    y9Var = g7Var3.y;
                                    if (y9Var.getAlpha() != 1.0f) {
                                        y9Var.setAlpha(1.0f);
                                    }
                                    g7Var3.invalidate();
                                }
                                t7Var.l1 = g7Var2;
                                if (g7Var2 != null) {
                                    org.telegram.ui.Components.y9 y9Var2 = g7Var2.y;
                                    if (y9Var2.getAlpha() != 0.0f) {
                                        y9Var2.setAlpha(0.0f);
                                    }
                                    g7Var2.invalidate();
                                }
                                if (z21 || r7Var36.a <= 0.5f) {
                                    j15 = g7Var;
                                }
                                RectF rectF = t7Var.v1;
                                if (t7Var.getParent() instanceof ViewGroup) {
                                    RectF Z3 = j15 == null ? g7Var : t7Var.Z(t7Var.k1);
                                    if (Z3 != null) {
                                        fi.v3 v3Var = t7Var.w1;
                                        if (v3Var == null) {
                                            t7Var.w1 = t7Var.B(R.string.WalletGiftDragHint, true);
                                        } else if (t7Var.j1 && !(z11 = v3Var.V)) {
                                            t7Var.j1 = false;
                                            t7Var.i1 = false;
                                            t7Var.h1 = false;
                                            if (z11) {
                                                v3Var.e(true);
                                            }
                                            if (!z19) {
                                                MessagesController.getGlobalMainSettings().edit().putBoolean("walletcardstickerhint", true).apply();
                                            }
                                            t7Var.f0();
                                        }
                                        t7.J(t7Var.w1, Z3.centerX(), Z3.top + AndroidUtilities.dp(4.0f));
                                        fi.v3 v3Var2 = t7Var.w1;
                                        if (!v3Var2.V) {
                                            v3Var2.u();
                                        }
                                        t7Var.j1 = true;
                                    } else {
                                        t7Var.j1 = false;
                                        fi.v3 v3Var3 = t7Var.w1;
                                        if (v3Var3 != null && v3Var3.V) {
                                            v3Var3.e(true);
                                        }
                                    }
                                    if (t7Var.i1 && r7Var35.a > 0.5f && (cVar = t7Var.d) != null && cVar.f0() && t7Var.C()) {
                                        if (t7Var.x1 == null) {
                                            t7Var.x1 = t7Var.B(R.string.WalletGiftDragHere, false);
                                        }
                                        t7Var.u1.computeBounds(rectF, true);
                                        float[] L = t7Var.L(rectF.centerX(), rectF.top);
                                        if ((L[1] - AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp(56.0f) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) {
                                            float[] L2 = t7Var.L(rectF.centerX(), rectF.bottom);
                                            fi.v3 v3Var4 = t7Var.x1;
                                            float f38 = L2[0];
                                            float dp = L2[1] + AndroidUtilities.dp(2.0f);
                                            t7.o(v3Var4, 1);
                                            v3Var4.m(0.0f, f38 - v3Var4.getPaddingLeft());
                                            v3Var4.setTranslationY(dp);
                                            v3Var4.invalidate();
                                        } else {
                                            t7.J(t7Var.x1, L[0], L[1] - AndroidUtilities.dp(2.0f));
                                        }
                                        fi.v3 v3Var5 = t7Var.x1;
                                        if (!v3Var5.V) {
                                            v3Var5.u();
                                        }
                                    } else {
                                        fi.v3 v3Var6 = t7Var.x1;
                                        if (v3Var6 != null && v3Var6.V) {
                                            v3Var6.e(true);
                                        }
                                    }
                                }
                                if (!b12 || z22) {
                                    z10 = true;
                                    boolean z23 = z20 | z10;
                                    size = arrayList9.size() - 1;
                                    while (size >= 0) {
                                        ArrayList arrayList12 = arrayList9;
                                        q7 q7Var2 = (q7) arrayList12.get(size);
                                        q7Var2.h += f7;
                                        float exp = (float) Math.exp((-2.4f) * f7);
                                        float f39 = q7Var2.c * exp;
                                        q7Var2.c = f39;
                                        float f40 = q7Var2.d * exp;
                                        q7Var2.d = f40;
                                        q7Var2.a = (f39 * f7) + q7Var2.a;
                                        q7Var2.b = (f40 * f7) + q7Var2.b;
                                        q7Var2.g = (f7 * 90.0f) + q7Var2.g;
                                        if (q7Var2.h >= q7Var2.f) {
                                            arrayList12.remove(size);
                                        }
                                        size--;
                                        arrayList9 = arrayList12;
                                    }
                                    if (!arrayList9.isEmpty()) {
                                        z23 = true;
                                    }
                                    size2 = arrayList10.size() - 1;
                                    while (size2 >= 0) {
                                        ArrayList arrayList13 = arrayList10;
                                        p7 p7Var2 = (p7) arrayList13.get(size2);
                                        float f41 = p7Var2.c + f7;
                                        p7Var2.c = f41;
                                        if (f41 > 0.42f) {
                                            arrayList13.remove(size2);
                                        }
                                        size2--;
                                        arrayList10 = arrayList13;
                                    }
                                    ArrayList arrayList14 = arrayList10;
                                    f10 = t7Var.U0;
                                    if (f10 < 1.0f) {
                                        t7Var.U0 = org.telegram.ui.d3.d(f7, t7Var.X0 ? 0.45f : 1.2f, f10, 1.0f);
                                        t7Var.e();
                                        z23 = true;
                                    }
                                    it = linkedHashMap.values().iterator();
                                    boolean z24 = false;
                                    while (it.hasNext()) {
                                        if (((s7) it.next()).H == 5) {
                                            z24 = true;
                                        }
                                    }
                                    r7 r7Var37 = t7Var.N;
                                    r7Var37.b = ((!t7Var.m0 && t7Var.o0 && r7Var37.b > 0.0f) || z24 || t7Var.f0) ? 1.0f : 0.0f;
                                    r7 r7Var38 = t7Var.O;
                                    boolean z25 = t7Var.t0;
                                    r7Var38.b = (!z25 || z24 || t7Var.f0) ? 1.0f : 0.0f;
                                    if (t7Var.f0) {
                                        r7Var31.b = z25 ? 28.0f : 0.0f;
                                        b10 = z23 | r7Var31.b(f7);
                                    } else {
                                        r7Var31.a(Math.min(66.0f, (60.0f * f7) + r7Var31.a));
                                        if (r7Var31.a >= 66.0f) {
                                            t7Var.f0 = false;
                                            r7Var31.a(0.0f);
                                        }
                                        b10 = true;
                                    }
                                    b11 = b10 | t7Var.N.b(f7) | t7Var.O.b(f7) | r7Var34.b(f7) | r7Var33.b(f7) | r7Var32.b(f7);
                                    w5Var3.setStickerImpact(r7Var34.a);
                                    float max = Math.max(-1.0f, Math.min(1.0f, r7Var33.a));
                                    float max2 = Math.max(-1.0f, Math.min(1.0f, r7Var32.a));
                                    if (w5Var3.b0 != 0) {
                                        m.r3 r3Var = new m.r3();
                                        float[] fArr2 = new float[8];
                                        r3Var.c(MediaDataController.MAX_STYLE_RUNS_COUNT, 600, 0.0f, 5.0f, false, fArr2);
                                        w5Var3.c0 = Math.hypot((double) (fArr2[2] - fArr2[4]), (double) (fArr2[3] - fArr2[5])) < Math.hypot((double) (fArr2[0] - fArr2[6]), (double) (fArr2[1] - fArr2[7])) ? 1 : -1;
                                        r3Var.c(MediaDataController.MAX_STYLE_RUNS_COUNT, 600, 5.0f, 0.0f, false, fArr2);
                                        i10 = 0;
                                        w5Var3.b0 = Math.hypot((double) (fArr2[4] - fArr2[6]), (double) (fArr2[5] - fArr2[7])) < Math.hypot((double) (fArr2[0] - fArr2[2]), (double) (fArr2[1] - fArr2[3])) ? 1 : -1;
                                    } else {
                                        i10 = 0;
                                    }
                                    f11 = w5Var3.b0 * max2 * 10.0f;
                                    f12 = w5Var3.c0 * max * 10.0f;
                                    r5Var = w5Var3.y;
                                    if (r5Var.l0 == f11 || r5Var.m0 != f12) {
                                        r5Var.l0 = f11;
                                        r5Var.m0 = f12;
                                        r5Var.b(r5Var.c0, r5Var.f0);
                                    }
                                    t7Var.a0 = w5Var3.getCardRotationX();
                                    t7Var.b0 = w5Var3.getCardRotationY();
                                    ArrayList arrayList15 = t7Var.h;
                                    size3 = arrayList15.size();
                                    i11 = i10;
                                    while (i11 < size3) {
                                        Object obj2 = arrayList15.get(i11);
                                        i11++;
                                        g7 g7Var6 = (g7) obj2;
                                        s7 s7Var7 = (s7) linkedHashMap.get(g7Var6.w0.address);
                                        if (s7Var7 != null) {
                                            g7Var6.k(s7Var7.R, true, s7Var7.H == 0 ? 0.0f : 1.0f);
                                        }
                                    }
                                    t7Var.invalidate();
                                    t7Var.L.invalidate();
                                    t7Var.M.invalidate();
                                    if (b11 && arrayList14.isEmpty() && !t7Var.p0) {
                                        t7Var.M0 = j10;
                                        return;
                                    }
                                    t7Var.postOnAnimation(this);
                                }
                            }
                        }
                        g7Var2 = g7Var;
                        g7Var3 = t7Var.l1;
                        if (g7Var3 != null) {
                            y9Var = g7Var3.y;
                            if (y9Var.getAlpha() != 1.0f) {
                            }
                            g7Var3.invalidate();
                        }
                        t7Var.l1 = g7Var2;
                        if (g7Var2 != null) {
                        }
                        if (z21) {
                        }
                        j15 = g7Var;
                        RectF rectF2 = t7Var.v1;
                        if (t7Var.getParent() instanceof ViewGroup) {
                        }
                        if (!b12) {
                        }
                        z10 = true;
                        boolean z232 = z20 | z10;
                        size = arrayList9.size() - 1;
                        while (size >= 0) {
                        }
                        if (!arrayList9.isEmpty()) {
                        }
                        size2 = arrayList10.size() - 1;
                        while (size2 >= 0) {
                        }
                        ArrayList arrayList142 = arrayList10;
                        f10 = t7Var.U0;
                        if (f10 < 1.0f) {
                        }
                        it = linkedHashMap.values().iterator();
                        boolean z242 = false;
                        while (it.hasNext()) {
                        }
                        r7 r7Var372 = t7Var.N;
                        r7Var372.b = ((!t7Var.m0 && t7Var.o0 && r7Var372.b > 0.0f) || z242 || t7Var.f0) ? 1.0f : 0.0f;
                        r7 r7Var382 = t7Var.O;
                        boolean z252 = t7Var.t0;
                        r7Var382.b = (!z252 || z242 || t7Var.f0) ? 1.0f : 0.0f;
                        if (t7Var.f0) {
                        }
                        b11 = b10 | t7Var.N.b(f7) | t7Var.O.b(f7) | r7Var34.b(f7) | r7Var33.b(f7) | r7Var32.b(f7);
                        w5Var3.setStickerImpact(r7Var34.a);
                        float max3 = Math.max(-1.0f, Math.min(1.0f, r7Var33.a));
                        float max22 = Math.max(-1.0f, Math.min(1.0f, r7Var32.a));
                        if (w5Var3.b0 != 0) {
                        }
                        f11 = w5Var3.b0 * max22 * 10.0f;
                        f12 = w5Var3.c0 * max3 * 10.0f;
                        r5Var = w5Var3.y;
                        if (r5Var.l0 == f11) {
                        }
                        r5Var.l0 = f11;
                        r5Var.m0 = f12;
                        r5Var.b(r5Var.c0, r5Var.f0);
                        t7Var.a0 = w5Var3.getCardRotationX();
                        t7Var.b0 = w5Var3.getCardRotationY();
                        ArrayList arrayList152 = t7Var.h;
                        size3 = arrayList152.size();
                        i11 = i10;
                        while (i11 < size3) {
                        }
                        t7Var.invalidate();
                        t7Var.L.invalidate();
                        t7Var.M.invalidate();
                        if (b11) {
                        }
                        t7Var.postOnAnimation(this);
                    }
                }
                g7Var = null;
                if (s7Var6 != null) {
                    D = t7Var.D(t7Var.n1 % 2.0f);
                    if (Utilities.clamp01(r7Var36.a) * Math.max(D[0], Math.max(D[1], D[2])) >= 0.003f) {
                    }
                }
                g7Var2 = g7Var;
                g7Var3 = t7Var.l1;
                if (g7Var3 != null) {
                }
                t7Var.l1 = g7Var2;
                if (g7Var2 != null) {
                }
                if (z21) {
                }
                j15 = g7Var;
                RectF rectF22 = t7Var.v1;
                if (t7Var.getParent() instanceof ViewGroup) {
                }
                if (!b12) {
                }
                z10 = true;
                boolean z2322 = z20 | z10;
                size = arrayList9.size() - 1;
                while (size >= 0) {
                }
                if (!arrayList9.isEmpty()) {
                }
                size2 = arrayList10.size() - 1;
                while (size2 >= 0) {
                }
                ArrayList arrayList1422 = arrayList10;
                f10 = t7Var.U0;
                if (f10 < 1.0f) {
                }
                it = linkedHashMap.values().iterator();
                boolean z2422 = false;
                while (it.hasNext()) {
                }
                r7 r7Var3722 = t7Var.N;
                r7Var3722.b = ((!t7Var.m0 && t7Var.o0 && r7Var3722.b > 0.0f) || z2422 || t7Var.f0) ? 1.0f : 0.0f;
                r7 r7Var3822 = t7Var.O;
                boolean z2522 = t7Var.t0;
                r7Var3822.b = (!z2522 || z2422 || t7Var.f0) ? 1.0f : 0.0f;
                if (t7Var.f0) {
                }
                b11 = b10 | t7Var.N.b(f7) | t7Var.O.b(f7) | r7Var34.b(f7) | r7Var33.b(f7) | r7Var32.b(f7);
                w5Var3.setStickerImpact(r7Var34.a);
                float max32 = Math.max(-1.0f, Math.min(1.0f, r7Var33.a));
                float max222 = Math.max(-1.0f, Math.min(1.0f, r7Var32.a));
                if (w5Var3.b0 != 0) {
                }
                f11 = w5Var3.b0 * max222 * 10.0f;
                f12 = w5Var3.c0 * max32 * 10.0f;
                r5Var = w5Var3.y;
                if (r5Var.l0 == f11) {
                }
                r5Var.l0 = f11;
                r5Var.m0 = f12;
                r5Var.b(r5Var.c0, r5Var.f0);
                t7Var.a0 = w5Var3.getCardRotationX();
                t7Var.b0 = w5Var3.getCardRotationY();
                ArrayList arrayList1522 = t7Var.h;
                size3 = arrayList1522.size();
                i11 = i10;
                while (i11 < size3) {
                }
                t7Var.invalidate();
                t7Var.L.invalidate();
                t7Var.M.invalidate();
                if (b11) {
                }
                t7Var.postOnAnimation(this);
            }
            linkedHashMap = linkedHashMap4;
            f7 = f32;
            z10 = false;
            boolean z23222 = z20 | z10;
            size = arrayList9.size() - 1;
            while (size >= 0) {
            }
            if (!arrayList9.isEmpty()) {
            }
            size2 = arrayList10.size() - 1;
            while (size2 >= 0) {
            }
            ArrayList arrayList14222 = arrayList10;
            f10 = t7Var.U0;
            if (f10 < 1.0f) {
            }
            it = linkedHashMap.values().iterator();
            boolean z24222 = false;
            while (it.hasNext()) {
            }
            r7 r7Var37222 = t7Var.N;
            r7Var37222.b = ((!t7Var.m0 && t7Var.o0 && r7Var37222.b > 0.0f) || z24222 || t7Var.f0) ? 1.0f : 0.0f;
            r7 r7Var38222 = t7Var.O;
            boolean z25222 = t7Var.t0;
            r7Var38222.b = (!z25222 || z24222 || t7Var.f0) ? 1.0f : 0.0f;
            if (t7Var.f0) {
            }
            b11 = b10 | t7Var.N.b(f7) | t7Var.O.b(f7) | r7Var34.b(f7) | r7Var33.b(f7) | r7Var32.b(f7);
            w5Var3.setStickerImpact(r7Var34.a);
            float max322 = Math.max(-1.0f, Math.min(1.0f, r7Var33.a));
            float max2222 = Math.max(-1.0f, Math.min(1.0f, r7Var32.a));
            if (w5Var3.b0 != 0) {
            }
            f11 = w5Var3.b0 * max2222 * 10.0f;
            f12 = w5Var3.c0 * max322 * 10.0f;
            r5Var = w5Var3.y;
            if (r5Var.l0 == f11) {
            }
            r5Var.l0 = f11;
            r5Var.m0 = f12;
            r5Var.b(r5Var.c0, r5Var.f0);
            t7Var.a0 = w5Var3.getCardRotationX();
            t7Var.b0 = w5Var3.getCardRotationY();
            ArrayList arrayList15222 = t7Var.h;
            size3 = arrayList15222.size();
            i11 = i10;
            while (i11 < size3) {
            }
            t7Var.invalidate();
            t7Var.L.invalidate();
            t7Var.M.invalidate();
            if (b11) {
            }
            t7Var.postOnAnimation(this);
        }
    }
}
