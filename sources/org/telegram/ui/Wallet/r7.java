package org.telegram.ui.Wallet;

import android.graphics.RectF;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class r7 implements Runnable {
    public final /* synthetic */ w7 a;

    public r7(w7 w7Var) {
        this.a = w7Var;
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
    /* JADX WARN: Removed duplicated region for block: B:250:0x0a63  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0aae  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0ae2  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0a7e  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0a4f  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x06ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x084f A[ADDED_TO_REGION] */
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
        j7 j7Var;
        j7 j7Var2;
        j7 j7Var3;
        boolean z10;
        n2.e eVar;
        boolean z11;
        org.telegram.ui.Components.w9 w9Var;
        float[] F;
        v7 v7Var;
        RectF b02;
        j7 j11;
        int size;
        int size2;
        float f10;
        Iterator it;
        boolean b10;
        boolean b11;
        int i10;
        FrameLayout frameLayout;
        int size3;
        int i11;
        u7 u7Var;
        ArrayList arrayList;
        String string;
        u7 u7Var2;
        u7 u7Var3;
        u7 u7Var4;
        boolean optBoolean;
        ArrayList arrayList2;
        u7 u7Var5;
        u7 u7Var6;
        u7 u7Var7;
        ArrayList arrayList3;
        float f11;
        float f12;
        float f13;
        j7 j7Var4;
        float f14;
        float f15;
        u7 u7Var8;
        u7 u7Var9;
        u7 u7Var10;
        float f16;
        ArrayList arrayList4;
        u7 u7Var11;
        w7 w7Var = this.a;
        boolean z12 = w7Var.b;
        u7 u7Var12 = w7Var.c0;
        u7 u7Var13 = w7Var.R;
        u7 u7Var14 = w7Var.Q;
        u7 u7Var15 = w7Var.P;
        v5 v5Var = w7Var.c;
        LinkedHashMap linkedHashMap2 = w7Var.f;
        ArrayList arrayList5 = w7Var.S;
        ArrayList arrayList6 = w7Var.n;
        if (w7Var.V0 || !w7Var.isAttachedToWindow()) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (w7Var.H0 == 0) {
            min = 0.016666668f;
            j10 = 0;
        } else {
            j10 = 0;
            min = Math.min(0.032f, (uptimeMillis - r13) / 1000.0f);
        }
        w7Var.H0 = uptimeMillis;
        if (w7Var.C()) {
            Iterator it2 = linkedHashMap2.values().iterator();
            boolean z13 = false;
            while (it2.hasNext()) {
                v7 v7Var2 = (v7) it2.next();
                boolean z14 = v7Var2.K;
                boolean z15 = z12;
                u7 u7Var16 = v7Var2.m;
                Iterator it3 = it2;
                u7 u7Var17 = v7Var2.i;
                String str = v7Var2.a;
                boolean z16 = z13;
                u7 u7Var18 = v7Var2.j;
                ci.g3 g3Var = v7Var2.c;
                v5 v5Var2 = v5Var;
                u7 u7Var19 = v7Var2.g;
                u7 u7Var20 = u7Var12;
                u7 u7Var21 = v7Var2.f;
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                u7 u7Var22 = v7Var2.e;
                u7 u7Var23 = v7Var2.h;
                if (z14) {
                    u7Var2 = u7Var13;
                    u7Var3 = u7Var14;
                    u7Var4 = u7Var15;
                    u7Var = u7Var19;
                    arrayList = arrayList5;
                } else {
                    u7Var = u7Var19;
                    v7Var2.K = true;
                    if (z15) {
                        arrayList = arrayList5;
                        string = null;
                    } else {
                        arrayList = arrayList5;
                        string = w7Var.e.getString(str, null);
                    }
                    if (w7Var.W0 != null) {
                        TL_wallet.cardSticker T = w7Var.T(str);
                        if (T != null) {
                            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = T.coordinates;
                            if (string == null) {
                                u7Var2 = u7Var13;
                            } else {
                                u7Var2 = u7Var13;
                                try {
                                    optBoolean = new JSONObject(string).optBoolean("q");
                                } catch (Exception unused) {
                                }
                                w7Var.O(v7Var2, mediaAreaCoordinates, optBoolean);
                            }
                            optBoolean = false;
                            w7Var.O(v7Var2, mediaAreaCoordinates, optBoolean);
                        } else {
                            u7Var2 = u7Var13;
                        }
                    } else {
                        u7Var2 = u7Var13;
                        if (string != null) {
                            try {
                                JSONObject jSONObject = new JSONObject(string);
                                u7Var3 = u7Var14;
                                u7Var4 = u7Var15;
                                try {
                                    u7Var23.a((float) jSONObject.optDouble("s", 1.0d));
                                    u7Var17.a((float) jSONObject.optDouble("r", 0.0d));
                                    v7Var2.N = jSONObject.optBoolean("q");
                                    float[] fArr = {((float) jSONObject.getDouble("x")) * w7Var.T0, ((float) jSONObject.getDouble("y")) * w7Var.U0, u7Var23.b};
                                    u7Var22.a(fArr[0]);
                                    u7Var21.a(fArr[1]);
                                    u7Var23.a(fArr[2]);
                                    v7Var2.H = 2;
                                    long j12 = w7Var.I0 + 1;
                                    w7Var.I0 = j12;
                                    v7Var2.I = j12;
                                    u7Var16.a(1.0f);
                                    if (v7Var2.J == j10) {
                                        long j13 = w7Var.M0 + 1;
                                        w7Var.M0 = j13;
                                        v7Var2.J = j13;
                                    }
                                    if (str.equals(w7Var.K0)) {
                                        w7Var.O0 = v7Var2;
                                        w7Var.N0 = v7Var2;
                                        w7Var.P0 = 1.0f;
                                        w7Var.e();
                                    }
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                            }
                        }
                    }
                    u7Var3 = u7Var14;
                    u7Var4 = u7Var15;
                }
                if (v7Var2.b()) {
                    v7Var2.a();
                }
                for (u7 u7Var24 : v7Var2.s) {
                    z16 |= u7Var24.b(min);
                }
                int i12 = v7Var2.H;
                if (i12 == 1) {
                    float dist = Utilities.dist(u7Var22.a + v7Var2.n.a, u7Var21.a + v7Var2.o.a, u7Var22.b, u7Var21.b);
                    if (!v7Var2.M && u7Var18.a < 0.36f && dist < AndroidUtilities.dp(24.0f)) {
                        v7Var2.M = true;
                        float f17 = u7Var22.b;
                        float f18 = u7Var21.b;
                        s7 s7Var = new s7();
                        s7Var.a = f17;
                        s7Var.b = f18;
                        arrayList6.add(s7Var);
                    }
                    if (v7Var2.L || u7Var18.a >= 0.22f || dist >= AndroidUtilities.dp(12.0f)) {
                        f15 = dist;
                        u7Var8 = u7Var2;
                        u7Var9 = u7Var3;
                        u7Var10 = u7Var4;
                        f16 = 1.4f;
                        arrayList2 = arrayList6;
                        arrayList4 = arrayList;
                    } else {
                        v7Var2.L = true;
                        u7 u7Var25 = v7Var2.p;
                        u7Var25.a(1.0f);
                        u7Var25.b = 0.0f;
                        boolean z17 = v7Var2.P;
                        float f19 = z17 ? 420.0f : 260.0f;
                        float f20 = z17 ? 0.38f : 0.85f;
                        u7Var10 = u7Var4;
                        f16 = 1.4f;
                        u7Var10.d = f19;
                        u7Var10.e = f20;
                        u7Var10.c -= z17 ? 0.75f : 0.28f;
                        float f21 = z17 ? 3.4f : 1.4f;
                        u7 u7Var26 = u7Var3;
                        float f22 = u7Var26.c;
                        float f23 = u7Var22.b;
                        u7Var26.c = (((f23 / w7Var.T0) - 0.5f) * 2.0f * f21) + f22;
                        u7Var8 = u7Var2;
                        float f24 = u7Var8.c;
                        float f25 = u7Var21.b;
                        f15 = dist;
                        u7Var8.c = (((f25 / w7Var.U0) - 0.5f) * 2.0f * f21) + f24;
                        if (z17) {
                            Random random = new Random();
                            int i13 = 0;
                            while (i13 < 14) {
                                t7 t7Var = new t7();
                                ArrayList arrayList7 = arrayList6;
                                float d = org.telegram.ui.Cells.t0.d(random, 0.35f, (float) ((i13 / 14.0f) * 3.141592653589793d * 2.0d));
                                float nextFloat = (random.nextFloat() * AndroidUtilities.dp(180.0f)) + AndroidUtilities.dp(265.0f);
                                t7Var.a = f23;
                                t7Var.b = f25;
                                double d10 = d;
                                t7Var.c = ((float) Math.cos(d10)) * nextFloat;
                                t7Var.d = ((float) Math.sin(d10)) * nextFloat;
                                t7Var.e = (random.nextFloat() * AndroidUtilities.dp(1.1f)) + AndroidUtilities.dp(0.8f);
                                t7Var.f = org.telegram.ui.Cells.t0.d(random, 0.35f, 0.7f);
                                t7Var.g = random.nextFloat() * 360.0f;
                                arrayList.add(t7Var);
                                i13++;
                                u7Var26 = u7Var26;
                                arrayList6 = arrayList7;
                            }
                        }
                        arrayList2 = arrayList6;
                        u7Var9 = u7Var26;
                        arrayList4 = arrayList;
                        if (str.equals(w7Var.L0)) {
                            w7Var.Z(v7Var2, false);
                            w7Var.L0 = null;
                        }
                    }
                    if (v7Var2.Q || v7Var2.k.a >= 0.3f) {
                        u7Var11 = u7Var;
                    } else {
                        v7Var2.Q = true;
                        u7Var11 = u7Var;
                        u7Var11.c -= f16;
                        w7Var.performHapticFeedback(3);
                    }
                    if (v7Var2.Q && f15 < 0.5f && Math.abs(u7Var11.a - 1.0f) < 0.004f && Math.abs(u7Var11.c) < 0.02f) {
                        v7Var2.H = 2;
                        u7Var22.a(u7Var22.b);
                        u7Var21.a(u7Var21.b);
                    }
                    u7Var5 = u7Var10;
                    u7Var6 = u7Var8;
                    arrayList3 = arrayList4;
                    f11 = min;
                    u7Var7 = u7Var9;
                } else {
                    u7 u7Var27 = u7Var;
                    u7 u7Var28 = u7Var2;
                    u7 u7Var29 = u7Var3;
                    u7 u7Var30 = u7Var4;
                    arrayList2 = arrayList6;
                    ArrayList arrayList8 = arrayList;
                    if (i12 == 4) {
                        float c10 = org.telegram.ui.Cells.t0.c(min, v7Var2.b0, v7Var2.W, 1.0f);
                        v7Var2.W = c10;
                        float f26 = 1.0f - c10;
                        float f27 = 1.0f - (f26 * f26);
                        j7 j14 = w7Var.j(v7Var2);
                        float clamp01 = Utilities.clamp01(c10 / 0.5f);
                        if (j14 != null) {
                            u7Var6 = u7Var28;
                            u7Var7 = u7Var29;
                            u7Var5 = u7Var30;
                            arrayList3 = arrayList8;
                            f12 = 1.0f;
                            f13 = AndroidUtilities.lerp(v7Var2.c0, 1.0f, com.google.android.gms.internal.cast.a6.B(clamp01, 2.0f, 3.0f, clamp01 * clamp01));
                        } else {
                            u7Var5 = u7Var30;
                            u7Var6 = u7Var28;
                            u7Var7 = u7Var29;
                            arrayList3 = arrayList8;
                            f12 = 1.0f;
                            f13 = 1.0f;
                        }
                        if (j14 != null) {
                            j14.setScaleX(f13);
                            j14.setScaleY(f13);
                        }
                        RectF b03 = w7Var.b0(v7Var2);
                        if (b03 == null) {
                            u7Var27.a((f12 - f27) * v7Var2.Z);
                            j7Var4 = j14;
                            f11 = min;
                            f14 = 1.0f;
                        } else {
                            float sin = (float) Math.sin(f27 * 3.141592653589793d);
                            f11 = min;
                            j7Var4 = j14;
                            float min2 = Math.min(AndroidUtilities.dp(90.0f), Utilities.dist(b03.centerX(), b03.centerY(), v7Var2.X, v7Var2.Y) * 0.28f);
                            u7Var22.a(AndroidUtilities.lerp(v7Var2.X, b03.centerX(), f27));
                            u7Var21.a(AndroidUtilities.lerp(v7Var2.Y, b03.centerY(), f27) - ((((1.0f - f27) * 2.0f) * f27) * min2));
                            u7Var27.a(AndroidUtilities.lerp(1.0f, f13, f27) * com.google.android.gms.internal.cast.a6.A(sin, 0.05f, 1.0f, AndroidUtilities.lerp(v7Var2.Z, (w7Var.f(v7Var2) * (b03.width() / f13)) / w7Var.W(), f27)));
                            u7Var18.a(sin * 0.8f);
                            float f28 = v7Var2.a0;
                            u7Var17.a((w7.c(-f28) * f27) + f28);
                            f14 = 1.0f;
                            u7Var16.a(Utilities.clamp01(1.0f - ((f27 - 0.35f) / 0.4f)));
                        }
                        if (c10 >= f14) {
                            w7Var.g(v7Var2);
                            if (j7Var4 != null) {
                                j7Var4.animate().scaleX(0.955f).scaleY(0.955f).setDuration(70L).setInterpolator(null).withEndAction(new m7(j7Var4, 1)).start();
                            }
                        }
                    } else {
                        u7Var5 = u7Var30;
                        u7Var6 = u7Var28;
                        u7Var7 = u7Var29;
                        arrayList3 = arrayList8;
                        f11 = min;
                        if (i12 == 5) {
                            if (u7Var27.a < 0.03f) {
                                w7Var.g(v7Var2);
                            }
                        }
                        if (!v7Var2.b()) {
                            v7Var2.R = true;
                        } else if (v7Var2.H == 0) {
                            v7Var2.R = false;
                        }
                        if (g3Var.isLottieRunning()) {
                            z13 = z16;
                        } else {
                            uj0 lottieAnimation = g3Var.getLottieAnimation();
                            int i14 = lottieAnimation == null ? 0 : lottieAnimation.a0;
                            if (i14 >= 2) {
                                v7Var2.T = true;
                            }
                            boolean z18 = v7Var2.S && !v7Var2.T && v7Var2.H == 2;
                            if (v7Var2.l.b == 0.0f && !z18 && lottieAnimation != null && i14 < 2) {
                                g3Var.stopAnimation();
                                g3Var.setAllowStartLottieAnimation(false);
                                v7Var2.S = false;
                            }
                            z13 = true;
                        }
                        z12 = z15;
                        it2 = it3;
                        v5Var = v5Var2;
                        u7Var12 = u7Var20;
                        linkedHashMap2 = linkedHashMap3;
                        u7Var13 = u7Var6;
                        arrayList6 = arrayList2;
                        min = f11;
                        u7Var14 = u7Var7;
                        u7Var15 = u7Var5;
                        arrayList5 = arrayList3;
                    }
                }
                z16 = true;
                if (!v7Var2.b()) {
                }
                if (g3Var.isLottieRunning()) {
                }
                z12 = z15;
                it2 = it3;
                v5Var = v5Var2;
                u7Var12 = u7Var20;
                linkedHashMap2 = linkedHashMap3;
                u7Var13 = u7Var6;
                arrayList6 = arrayList2;
                min = f11;
                u7Var14 = u7Var7;
                u7Var15 = u7Var5;
                arrayList5 = arrayList3;
            }
            boolean z19 = z12;
            u7 u7Var31 = u7Var12;
            u7 u7Var32 = u7Var13;
            u7 u7Var33 = u7Var14;
            u7 u7Var34 = u7Var15;
            v5 v5Var3 = v5Var;
            LinkedHashMap linkedHashMap4 = linkedHashMap2;
            ArrayList arrayList9 = arrayList5;
            ArrayList arrayList10 = arrayList6;
            boolean z20 = z13;
            float f29 = min;
            u7 u7Var35 = w7Var.l1;
            u7 u7Var36 = w7Var.k1;
            if (!z19) {
                if (w7Var.c1) {
                    v7 v7Var3 = w7Var.f1;
                    if (v7Var3 != null && v7Var3.H == 0 && (j11 = w7Var.j(v7Var3)) != null && w7Var.B(j11) && w7.b(w7Var.f1)) {
                        v7Var = w7Var.f1;
                    } else {
                        ArrayList arrayList11 = w7Var.h;
                        int size4 = arrayList11.size();
                        int i15 = 0;
                        v7 v7Var4 = null;
                        float f30 = 0.0f;
                        float f31 = 0.0f;
                        while (i15 < size4) {
                            Object obj = arrayList11.get(i15);
                            i15++;
                            j7 j7Var5 = (j7) obj;
                            LinkedHashMap linkedHashMap5 = linkedHashMap4;
                            v7 v7Var5 = (v7) linkedHashMap5.get(j7Var5.o0.address);
                            if (v7Var5 != null && v7Var5.H == 0 && w7.b(v7Var5) && j7Var5.isAttachedToWindow() && w7Var.B(j7Var5) && (b02 = w7Var.b0(v7Var5)) != null) {
                                if (v7Var4 != null) {
                                    float f32 = b02.top;
                                    if (f32 >= f30 - 1.0f) {
                                        if (Math.abs(f32 - f30) <= 1.0f) {
                                            if (b02.left >= f31) {
                                            }
                                        }
                                    }
                                }
                                float f33 = b02.top;
                                f31 = b02.left;
                                f30 = f33;
                                v7Var4 = v7Var5;
                            }
                            linkedHashMap4 = linkedHashMap5;
                        }
                        v7Var = v7Var4;
                    }
                    linkedHashMap = linkedHashMap4;
                    if (v7Var != null && v7Var != w7Var.f1) {
                        w7Var.f1 = v7Var;
                        w7Var.h1 = null;
                        w7Var.i1 = 0.0f;
                    }
                } else {
                    linkedHashMap = linkedHashMap4;
                }
                v7 v7Var6 = w7Var.f1;
                j7 j15 = v7Var6 == null ? null : w7Var.j(v7Var6);
                boolean z21 = w7Var.c1 && v7Var6 != null && v7Var6.H == 0 && w7.b(v7Var6) && j15 != null && w7Var.B(j15) && !w7Var.n0 && !w7Var.k0;
                if (v7Var6 != null && (z21 || w7Var.d1)) {
                    v7Var6.a();
                    if (w7Var.h1 == null && v7Var6.u != null) {
                        w7Var.h1 = w7Var.z(v7Var6, w7Var.T0 * 0.6f, w7Var.U0 * 0.68f, true);
                        v7Var6.N = false;
                    }
                }
                u7Var36.b = z21 ? 1.0f : 0.0f;
                u7Var35.b = ((!z21 && !w7Var.d1) || w7Var.h1 == null || w7.L(v7Var6) == null) ? 0.0f : 1.0f;
                f7 = f29;
                boolean b12 = u7Var36.b(f7) | u7Var35.b(f7);
                float f34 = u7Var36.a;
                boolean z22 = f34 > 0.002f || u7Var35.a > 0.002f;
                if (z22) {
                    w7Var.i1 += f7;
                } else {
                    w7Var.i1 = 0.0f;
                    if (!w7Var.c1 && !w7Var.d1) {
                        j7Var = null;
                        w7Var.h1 = null;
                        if (v7Var6 != null && v7Var6.H == 0 && v7Var6.v != null && f34 > 0.002f) {
                            F = w7Var.F(w7Var.i1 % 2.0f);
                            if (Utilities.clamp01(u7Var36.a) * Math.max(F[0], Math.max(F[1], F[2])) >= 0.003f) {
                                j7Var2 = j15;
                                j7Var3 = w7Var.g1;
                                if (j7Var3 != null && j7Var3 != j7Var2) {
                                    w9Var = j7Var3.y;
                                    if (w9Var.getAlpha() != 1.0f) {
                                        w9Var.setAlpha(1.0f);
                                    }
                                    j7Var3.invalidate();
                                }
                                w7Var.g1 = j7Var2;
                                if (j7Var2 != null) {
                                    org.telegram.ui.Components.w9 w9Var2 = j7Var2.y;
                                    if (w9Var2.getAlpha() != 0.0f) {
                                        w9Var2.setAlpha(0.0f);
                                    }
                                    j7Var2.invalidate();
                                }
                                if (z21 || u7Var36.a <= 0.5f) {
                                    j15 = j7Var;
                                }
                                RectF rectF = w7Var.q1;
                                if (w7Var.getParent() instanceof ViewGroup) {
                                    RectF b04 = j15 == null ? j7Var : w7Var.b0(w7Var.f1);
                                    if (b04 != null) {
                                        ei.x3 x3Var = w7Var.r1;
                                        if (x3Var == null) {
                                            w7Var.r1 = w7Var.D(R.string.WalletGiftDragHint, true);
                                        } else if (w7Var.e1 && !(z11 = x3Var.V)) {
                                            w7Var.e1 = false;
                                            w7Var.d1 = false;
                                            w7Var.c1 = false;
                                            if (z11) {
                                                x3Var.e(true);
                                            }
                                            if (!z19) {
                                                MessagesController.getGlobalMainSettings().edit().putBoolean("walletcardstickerhint", true).apply();
                                            }
                                            w7Var.h0();
                                        }
                                        w7.N(w7Var.r1, b04.centerX(), b04.top + AndroidUtilities.dp(4.0f));
                                        ei.x3 x3Var2 = w7Var.r1;
                                        if (!x3Var2.V) {
                                            x3Var2.u();
                                        }
                                        w7Var.e1 = true;
                                    } else {
                                        w7Var.e1 = false;
                                        ei.x3 x3Var3 = w7Var.r1;
                                        if (x3Var3 != null && x3Var3.V) {
                                            x3Var3.e(true);
                                        }
                                    }
                                    if (w7Var.d1 && u7Var35.a > 0.5f && (eVar = w7Var.d) != null && eVar.O() && w7Var.E()) {
                                        if (w7Var.s1 == null) {
                                            w7Var.s1 = w7Var.D(R.string.WalletGiftDragHere, false);
                                        }
                                        w7Var.p1.computeBounds(rectF, true);
                                        float[] P = w7Var.P(rectF.centerX(), rectF.top);
                                        if ((P[1] - AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp(56.0f) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) {
                                            float[] P2 = w7Var.P(rectF.centerX(), rectF.bottom);
                                            ei.x3 x3Var4 = w7Var.s1;
                                            float f35 = P2[0];
                                            float dp = P2[1] + AndroidUtilities.dp(2.0f);
                                            w7.o(x3Var4, 1);
                                            x3Var4.m(0.0f, f35 - x3Var4.getPaddingLeft());
                                            x3Var4.setTranslationY(dp);
                                            x3Var4.invalidate();
                                        } else {
                                            w7.N(w7Var.s1, P[0], P[1] - AndroidUtilities.dp(2.0f));
                                        }
                                        ei.x3 x3Var5 = w7Var.s1;
                                        if (!x3Var5.V) {
                                            x3Var5.u();
                                        }
                                    } else {
                                        ei.x3 x3Var6 = w7Var.s1;
                                        if (x3Var6 != null && x3Var6.V) {
                                            x3Var6.e(true);
                                        }
                                    }
                                }
                                if (!b12 || z22) {
                                    z10 = true;
                                    boolean z23 = z20 | z10;
                                    size = arrayList9.size() - 1;
                                    while (size >= 0) {
                                        ArrayList arrayList12 = arrayList9;
                                        t7 t7Var2 = (t7) arrayList12.get(size);
                                        t7Var2.h += f7;
                                        float exp = (float) Math.exp((-2.4f) * f7);
                                        float f36 = t7Var2.c * exp;
                                        t7Var2.c = f36;
                                        float f37 = t7Var2.d * exp;
                                        t7Var2.d = f37;
                                        t7Var2.a = (f36 * f7) + t7Var2.a;
                                        t7Var2.b = (f37 * f7) + t7Var2.b;
                                        t7Var2.g = (f7 * 90.0f) + t7Var2.g;
                                        if (t7Var2.h >= t7Var2.f) {
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
                                        s7 s7Var2 = (s7) arrayList13.get(size2);
                                        float f38 = s7Var2.c + f7;
                                        s7Var2.c = f38;
                                        if (f38 > 0.42f) {
                                            arrayList13.remove(size2);
                                        }
                                        size2--;
                                        arrayList10 = arrayList13;
                                    }
                                    ArrayList arrayList14 = arrayList10;
                                    f10 = w7Var.P0;
                                    if (f10 < 1.0f) {
                                        w7Var.P0 = org.telegram.ui.Cells.t0.c(f7, w7Var.S0 ? 0.45f : 1.2f, f10, 1.0f);
                                        w7Var.e();
                                        z23 = true;
                                    }
                                    it = linkedHashMap.values().iterator();
                                    boolean z24 = false;
                                    while (it.hasNext()) {
                                        if (((v7) it.next()).H == 5) {
                                            z24 = true;
                                        }
                                    }
                                    u7 u7Var37 = w7Var.N;
                                    u7Var37.b = ((!w7Var.h0 && w7Var.j0 && u7Var37.b > 0.0f) || z24 || w7Var.f0) ? 1.0f : 0.0f;
                                    u7 u7Var38 = w7Var.O;
                                    boolean z25 = w7Var.o0;
                                    u7Var38.b = (!z25 || z24 || w7Var.f0) ? 1.0f : 0.0f;
                                    if (w7Var.f0) {
                                        u7Var31.b = z25 ? 28.0f : 0.0f;
                                        b10 = z23 | u7Var31.b(f7);
                                    } else {
                                        u7Var31.a(Math.min(66.0f, (60.0f * f7) + u7Var31.a));
                                        if (u7Var31.a >= 66.0f) {
                                            w7Var.f0 = false;
                                            u7Var31.a(0.0f);
                                        }
                                        b10 = true;
                                    }
                                    b11 = b10 | w7Var.N.b(f7) | w7Var.O.b(f7) | u7Var34.b(f7) | u7Var33.b(f7) | u7Var32.b(f7);
                                    v5Var3.setStickerImpact(u7Var34.a);
                                    float max = Math.max(-1.0f, Math.min(1.0f, u7Var33.a));
                                    float max2 = Math.max(-1.0f, Math.min(1.0f, u7Var32.a));
                                    if (v5Var3.f0 != 0) {
                                        m.s3 s3Var = new m.s3();
                                        float[] fArr2 = new float[8];
                                        s3Var.c(MediaDataController.MAX_STYLE_RUNS_COUNT, 600, 0.0f, 5.0f, false, fArr2);
                                        v5Var3.g0 = Math.hypot((double) (fArr2[2] - fArr2[4]), (double) (fArr2[3] - fArr2[5])) < Math.hypot((double) (fArr2[0] - fArr2[6]), (double) (fArr2[1] - fArr2[7])) ? 1 : -1;
                                        s3Var.c(MediaDataController.MAX_STYLE_RUNS_COUNT, 600, 5.0f, 0.0f, false, fArr2);
                                        i10 = 0;
                                        v5Var3.f0 = Math.hypot((double) (fArr2[4] - fArr2[6]), (double) (fArr2[5] - fArr2[7])) < Math.hypot((double) (fArr2[0] - fArr2[2]), (double) (fArr2[1] - fArr2[3])) ? 1 : -1;
                                    } else {
                                        i10 = 0;
                                    }
                                    float f39 = v5Var3.f0 * max2 * 10.0f;
                                    float f40 = v5Var3.g0 * max * 10.0f;
                                    frameLayout = v5Var3.G;
                                    if (frameLayout instanceof c6) {
                                        o5 o5Var = (o5) frameLayout;
                                        if (o5Var.a0 != f39 || o5Var.b0 != f40) {
                                            o5Var.a0 = f39;
                                            o5Var.b0 = f40;
                                            o5Var.b(o5Var.S, o5Var.V);
                                        }
                                    } else {
                                        c6 c6Var = (c6) frameLayout;
                                        if (c6Var.T != f39 || c6Var.U != f40) {
                                            c6Var.T = f39;
                                            c6Var.U = f40;
                                            c6Var.a(c6Var.K, c6Var.N);
                                        }
                                    }
                                    w7Var.a0 = v5Var3.getCardRotationX();
                                    w7Var.b0 = v5Var3.getCardRotationY();
                                    ArrayList arrayList15 = w7Var.h;
                                    size3 = arrayList15.size();
                                    i11 = i10;
                                    while (i11 < size3) {
                                        Object obj2 = arrayList15.get(i11);
                                        i11++;
                                        j7 j7Var6 = (j7) obj2;
                                        v7 v7Var7 = (v7) linkedHashMap.get(j7Var6.o0.address);
                                        if (v7Var7 != null) {
                                            j7Var6.j(v7Var7.R, true, v7Var7.H == 0 ? 0.0f : 1.0f);
                                        }
                                    }
                                    w7Var.invalidate();
                                    w7Var.L.invalidate();
                                    w7Var.M.invalidate();
                                    if (b11 && arrayList14.isEmpty() && !w7Var.k0) {
                                        w7Var.H0 = j10;
                                        return;
                                    }
                                    w7Var.postOnAnimation(this);
                                }
                            }
                        }
                        j7Var2 = j7Var;
                        j7Var3 = w7Var.g1;
                        if (j7Var3 != null) {
                            w9Var = j7Var3.y;
                            if (w9Var.getAlpha() != 1.0f) {
                            }
                            j7Var3.invalidate();
                        }
                        w7Var.g1 = j7Var2;
                        if (j7Var2 != null) {
                        }
                        if (z21) {
                        }
                        j15 = j7Var;
                        RectF rectF2 = w7Var.q1;
                        if (w7Var.getParent() instanceof ViewGroup) {
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
                        f10 = w7Var.P0;
                        if (f10 < 1.0f) {
                        }
                        it = linkedHashMap.values().iterator();
                        boolean z242 = false;
                        while (it.hasNext()) {
                        }
                        u7 u7Var372 = w7Var.N;
                        u7Var372.b = ((!w7Var.h0 && w7Var.j0 && u7Var372.b > 0.0f) || z242 || w7Var.f0) ? 1.0f : 0.0f;
                        u7 u7Var382 = w7Var.O;
                        boolean z252 = w7Var.o0;
                        u7Var382.b = (!z252 || z242 || w7Var.f0) ? 1.0f : 0.0f;
                        if (w7Var.f0) {
                        }
                        b11 = b10 | w7Var.N.b(f7) | w7Var.O.b(f7) | u7Var34.b(f7) | u7Var33.b(f7) | u7Var32.b(f7);
                        v5Var3.setStickerImpact(u7Var34.a);
                        float max3 = Math.max(-1.0f, Math.min(1.0f, u7Var33.a));
                        float max22 = Math.max(-1.0f, Math.min(1.0f, u7Var32.a));
                        if (v5Var3.f0 != 0) {
                        }
                        float f392 = v5Var3.f0 * max22 * 10.0f;
                        float f402 = v5Var3.g0 * max3 * 10.0f;
                        frameLayout = v5Var3.G;
                        if (frameLayout instanceof c6) {
                        }
                        w7Var.a0 = v5Var3.getCardRotationX();
                        w7Var.b0 = v5Var3.getCardRotationY();
                        ArrayList arrayList152 = w7Var.h;
                        size3 = arrayList152.size();
                        i11 = i10;
                        while (i11 < size3) {
                        }
                        w7Var.invalidate();
                        w7Var.L.invalidate();
                        w7Var.M.invalidate();
                        if (b11) {
                        }
                        w7Var.postOnAnimation(this);
                    }
                }
                j7Var = null;
                if (v7Var6 != null) {
                    F = w7Var.F(w7Var.i1 % 2.0f);
                    if (Utilities.clamp01(u7Var36.a) * Math.max(F[0], Math.max(F[1], F[2])) >= 0.003f) {
                    }
                }
                j7Var2 = j7Var;
                j7Var3 = w7Var.g1;
                if (j7Var3 != null) {
                }
                w7Var.g1 = j7Var2;
                if (j7Var2 != null) {
                }
                if (z21) {
                }
                j15 = j7Var;
                RectF rectF22 = w7Var.q1;
                if (w7Var.getParent() instanceof ViewGroup) {
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
                f10 = w7Var.P0;
                if (f10 < 1.0f) {
                }
                it = linkedHashMap.values().iterator();
                boolean z2422 = false;
                while (it.hasNext()) {
                }
                u7 u7Var3722 = w7Var.N;
                u7Var3722.b = ((!w7Var.h0 && w7Var.j0 && u7Var3722.b > 0.0f) || z2422 || w7Var.f0) ? 1.0f : 0.0f;
                u7 u7Var3822 = w7Var.O;
                boolean z2522 = w7Var.o0;
                u7Var3822.b = (!z2522 || z2422 || w7Var.f0) ? 1.0f : 0.0f;
                if (w7Var.f0) {
                }
                b11 = b10 | w7Var.N.b(f7) | w7Var.O.b(f7) | u7Var34.b(f7) | u7Var33.b(f7) | u7Var32.b(f7);
                v5Var3.setStickerImpact(u7Var34.a);
                float max32 = Math.max(-1.0f, Math.min(1.0f, u7Var33.a));
                float max222 = Math.max(-1.0f, Math.min(1.0f, u7Var32.a));
                if (v5Var3.f0 != 0) {
                }
                float f3922 = v5Var3.f0 * max222 * 10.0f;
                float f4022 = v5Var3.g0 * max32 * 10.0f;
                frameLayout = v5Var3.G;
                if (frameLayout instanceof c6) {
                }
                w7Var.a0 = v5Var3.getCardRotationX();
                w7Var.b0 = v5Var3.getCardRotationY();
                ArrayList arrayList1522 = w7Var.h;
                size3 = arrayList1522.size();
                i11 = i10;
                while (i11 < size3) {
                }
                w7Var.invalidate();
                w7Var.L.invalidate();
                w7Var.M.invalidate();
                if (b11) {
                }
                w7Var.postOnAnimation(this);
            }
            linkedHashMap = linkedHashMap4;
            f7 = f29;
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
            f10 = w7Var.P0;
            if (f10 < 1.0f) {
            }
            it = linkedHashMap.values().iterator();
            boolean z24222 = false;
            while (it.hasNext()) {
            }
            u7 u7Var37222 = w7Var.N;
            u7Var37222.b = ((!w7Var.h0 && w7Var.j0 && u7Var37222.b > 0.0f) || z24222 || w7Var.f0) ? 1.0f : 0.0f;
            u7 u7Var38222 = w7Var.O;
            boolean z25222 = w7Var.o0;
            u7Var38222.b = (!z25222 || z24222 || w7Var.f0) ? 1.0f : 0.0f;
            if (w7Var.f0) {
            }
            b11 = b10 | w7Var.N.b(f7) | w7Var.O.b(f7) | u7Var34.b(f7) | u7Var33.b(f7) | u7Var32.b(f7);
            v5Var3.setStickerImpact(u7Var34.a);
            float max322 = Math.max(-1.0f, Math.min(1.0f, u7Var33.a));
            float max2222 = Math.max(-1.0f, Math.min(1.0f, u7Var32.a));
            if (v5Var3.f0 != 0) {
            }
            float f39222 = v5Var3.f0 * max2222 * 10.0f;
            float f40222 = v5Var3.g0 * max322 * 10.0f;
            frameLayout = v5Var3.G;
            if (frameLayout instanceof c6) {
            }
            w7Var.a0 = v5Var3.getCardRotationX();
            w7Var.b0 = v5Var3.getCardRotationY();
            ArrayList arrayList15222 = w7Var.h;
            size3 = arrayList15222.size();
            i11 = i10;
            while (i11 < size3) {
            }
            w7Var.invalidate();
            w7Var.L.invalidate();
            w7Var.M.invalidate();
            if (b11) {
            }
            w7Var.postOnAnimation(this);
        }
    }
}
