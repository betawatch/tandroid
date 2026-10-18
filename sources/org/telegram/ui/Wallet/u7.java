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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class u7 implements Runnable {
    public final /* synthetic */ z7 a;

    public u7(z7 z7Var) {
        this.a = z7Var;
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
        m7 m7Var;
        m7 m7Var2;
        m7 m7Var3;
        boolean z10;
        n2.e eVar;
        boolean z11;
        org.telegram.ui.Components.w9 w9Var;
        float[] F;
        y7 y7Var;
        RectF b02;
        m7 j11;
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
        x7 x7Var;
        ArrayList arrayList;
        String string;
        x7 x7Var2;
        x7 x7Var3;
        x7 x7Var4;
        boolean optBoolean;
        ArrayList arrayList2;
        x7 x7Var5;
        x7 x7Var6;
        x7 x7Var7;
        ArrayList arrayList3;
        float f11;
        float f12;
        float f13;
        m7 m7Var4;
        float f14;
        float f15;
        x7 x7Var8;
        x7 x7Var9;
        x7 x7Var10;
        float f16;
        ArrayList arrayList4;
        x7 x7Var11;
        z7 z7Var = this.a;
        boolean z12 = z7Var.b;
        x7 x7Var12 = z7Var.c0;
        x7 x7Var13 = z7Var.R;
        x7 x7Var14 = z7Var.Q;
        x7 x7Var15 = z7Var.P;
        x5 x5Var = z7Var.c;
        LinkedHashMap linkedHashMap2 = z7Var.f;
        ArrayList arrayList5 = z7Var.S;
        ArrayList arrayList6 = z7Var.n;
        if (z7Var.V0 || !z7Var.isAttachedToWindow()) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (z7Var.H0 == 0) {
            min = 0.016666668f;
            j10 = 0;
        } else {
            j10 = 0;
            min = Math.min(0.032f, (uptimeMillis - r13) / 1000.0f);
        }
        z7Var.H0 = uptimeMillis;
        if (z7Var.C()) {
            Iterator it2 = linkedHashMap2.values().iterator();
            boolean z13 = false;
            while (it2.hasNext()) {
                y7 y7Var2 = (y7) it2.next();
                boolean z14 = y7Var2.K;
                boolean z15 = z12;
                x7 x7Var16 = y7Var2.m;
                Iterator it3 = it2;
                x7 x7Var17 = y7Var2.i;
                String str = y7Var2.a;
                boolean z16 = z13;
                x7 x7Var18 = y7Var2.j;
                ci.g3 g3Var = y7Var2.c;
                x5 x5Var2 = x5Var;
                x7 x7Var19 = y7Var2.g;
                x7 x7Var20 = x7Var12;
                x7 x7Var21 = y7Var2.f;
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                x7 x7Var22 = y7Var2.e;
                x7 x7Var23 = y7Var2.h;
                if (z14) {
                    x7Var2 = x7Var13;
                    x7Var3 = x7Var14;
                    x7Var4 = x7Var15;
                    x7Var = x7Var19;
                    arrayList = arrayList5;
                } else {
                    x7Var = x7Var19;
                    y7Var2.K = true;
                    if (z15) {
                        arrayList = arrayList5;
                        string = null;
                    } else {
                        arrayList = arrayList5;
                        string = z7Var.e.getString(str, null);
                    }
                    if (z7Var.W0 != null) {
                        TL_wallet.cardSticker T = z7Var.T(str);
                        if (T != null) {
                            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = T.coordinates;
                            if (string == null) {
                                x7Var2 = x7Var13;
                            } else {
                                x7Var2 = x7Var13;
                                try {
                                    optBoolean = new JSONObject(string).optBoolean("q");
                                } catch (Exception unused) {
                                }
                                z7Var.O(y7Var2, mediaAreaCoordinates, optBoolean);
                            }
                            optBoolean = false;
                            z7Var.O(y7Var2, mediaAreaCoordinates, optBoolean);
                        } else {
                            x7Var2 = x7Var13;
                        }
                    } else {
                        x7Var2 = x7Var13;
                        if (string != null) {
                            try {
                                JSONObject jSONObject = new JSONObject(string);
                                x7Var3 = x7Var14;
                                x7Var4 = x7Var15;
                                try {
                                    x7Var23.a((float) jSONObject.optDouble("s", 1.0d));
                                    x7Var17.a((float) jSONObject.optDouble("r", 0.0d));
                                    y7Var2.N = jSONObject.optBoolean("q");
                                    float[] fArr = {((float) jSONObject.getDouble("x")) * z7Var.T0, ((float) jSONObject.getDouble("y")) * z7Var.U0, x7Var23.b};
                                    x7Var22.a(fArr[0]);
                                    x7Var21.a(fArr[1]);
                                    x7Var23.a(fArr[2]);
                                    y7Var2.H = 2;
                                    long j12 = z7Var.I0 + 1;
                                    z7Var.I0 = j12;
                                    y7Var2.I = j12;
                                    x7Var16.a(1.0f);
                                    if (y7Var2.J == j10) {
                                        long j13 = z7Var.M0 + 1;
                                        z7Var.M0 = j13;
                                        y7Var2.J = j13;
                                    }
                                    if (str.equals(z7Var.K0)) {
                                        z7Var.O0 = y7Var2;
                                        z7Var.N0 = y7Var2;
                                        z7Var.P0 = 1.0f;
                                        z7Var.e();
                                    }
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                            }
                        }
                    }
                    x7Var3 = x7Var14;
                    x7Var4 = x7Var15;
                }
                if (y7Var2.b()) {
                    y7Var2.a();
                }
                for (x7 x7Var24 : y7Var2.s) {
                    z16 |= x7Var24.b(min);
                }
                int i12 = y7Var2.H;
                if (i12 == 1) {
                    float dist = Utilities.dist(x7Var22.a + y7Var2.n.a, x7Var21.a + y7Var2.o.a, x7Var22.b, x7Var21.b);
                    if (!y7Var2.M && x7Var18.a < 0.36f && dist < AndroidUtilities.dp(24.0f)) {
                        y7Var2.M = true;
                        float f17 = x7Var22.b;
                        float f18 = x7Var21.b;
                        v7 v7Var = new v7();
                        v7Var.a = f17;
                        v7Var.b = f18;
                        arrayList6.add(v7Var);
                    }
                    if (y7Var2.L || x7Var18.a >= 0.22f || dist >= AndroidUtilities.dp(12.0f)) {
                        f15 = dist;
                        x7Var8 = x7Var2;
                        x7Var9 = x7Var3;
                        x7Var10 = x7Var4;
                        f16 = 1.4f;
                        arrayList2 = arrayList6;
                        arrayList4 = arrayList;
                    } else {
                        y7Var2.L = true;
                        x7 x7Var25 = y7Var2.p;
                        x7Var25.a(1.0f);
                        x7Var25.b = 0.0f;
                        boolean z17 = y7Var2.P;
                        float f19 = z17 ? 420.0f : 260.0f;
                        float f20 = z17 ? 0.38f : 0.85f;
                        x7Var10 = x7Var4;
                        f16 = 1.4f;
                        x7Var10.d = f19;
                        x7Var10.e = f20;
                        x7Var10.c -= z17 ? 0.75f : 0.28f;
                        float f21 = z17 ? 3.4f : 1.4f;
                        x7 x7Var26 = x7Var3;
                        float f22 = x7Var26.c;
                        float f23 = x7Var22.b;
                        x7Var26.c = (((f23 / z7Var.T0) - 0.5f) * 2.0f * f21) + f22;
                        x7Var8 = x7Var2;
                        float f24 = x7Var8.c;
                        float f25 = x7Var21.b;
                        f15 = dist;
                        x7Var8.c = (((f25 / z7Var.U0) - 0.5f) * 2.0f * f21) + f24;
                        if (z17) {
                            Random random = new Random();
                            int i13 = 0;
                            while (i13 < 14) {
                                w7 w7Var = new w7();
                                ArrayList arrayList7 = arrayList6;
                                float d = org.telegram.ui.Cells.c1.d(random, 0.35f, (float) ((i13 / 14.0f) * 3.141592653589793d * 2.0d));
                                float nextFloat = (random.nextFloat() * AndroidUtilities.dp(180.0f)) + AndroidUtilities.dp(265.0f);
                                w7Var.a = f23;
                                w7Var.b = f25;
                                double d10 = d;
                                w7Var.c = ((float) Math.cos(d10)) * nextFloat;
                                w7Var.d = ((float) Math.sin(d10)) * nextFloat;
                                w7Var.e = (random.nextFloat() * AndroidUtilities.dp(1.1f)) + AndroidUtilities.dp(0.8f);
                                w7Var.f = org.telegram.ui.Cells.c1.d(random, 0.35f, 0.7f);
                                w7Var.g = random.nextFloat() * 360.0f;
                                arrayList.add(w7Var);
                                i13++;
                                x7Var26 = x7Var26;
                                arrayList6 = arrayList7;
                            }
                        }
                        arrayList2 = arrayList6;
                        x7Var9 = x7Var26;
                        arrayList4 = arrayList;
                        if (str.equals(z7Var.L0)) {
                            z7Var.Z(y7Var2, false);
                            z7Var.L0 = null;
                        }
                    }
                    if (y7Var2.Q || y7Var2.k.a >= 0.3f) {
                        x7Var11 = x7Var;
                    } else {
                        y7Var2.Q = true;
                        x7Var11 = x7Var;
                        x7Var11.c -= f16;
                        z7Var.performHapticFeedback(3);
                    }
                    if (y7Var2.Q && f15 < 0.5f && Math.abs(x7Var11.a - 1.0f) < 0.004f && Math.abs(x7Var11.c) < 0.02f) {
                        y7Var2.H = 2;
                        x7Var22.a(x7Var22.b);
                        x7Var21.a(x7Var21.b);
                    }
                    x7Var5 = x7Var10;
                    x7Var6 = x7Var8;
                    arrayList3 = arrayList4;
                    f11 = min;
                    x7Var7 = x7Var9;
                } else {
                    x7 x7Var27 = x7Var;
                    x7 x7Var28 = x7Var2;
                    x7 x7Var29 = x7Var3;
                    x7 x7Var30 = x7Var4;
                    arrayList2 = arrayList6;
                    ArrayList arrayList8 = arrayList;
                    if (i12 == 4) {
                        float c10 = org.telegram.ui.Cells.c1.c(min, y7Var2.b0, y7Var2.W, 1.0f);
                        y7Var2.W = c10;
                        float f26 = 1.0f - c10;
                        float f27 = 1.0f - (f26 * f26);
                        m7 j14 = z7Var.j(y7Var2);
                        float clamp01 = Utilities.clamp01(c10 / 0.5f);
                        if (j14 != null) {
                            x7Var6 = x7Var28;
                            x7Var7 = x7Var29;
                            x7Var5 = x7Var30;
                            arrayList3 = arrayList8;
                            f12 = 1.0f;
                            f13 = AndroidUtilities.lerp(y7Var2.c0, 1.0f, com.google.android.gms.internal.play_billing.k3.B(clamp01, 2.0f, 3.0f, clamp01 * clamp01));
                        } else {
                            x7Var5 = x7Var30;
                            x7Var6 = x7Var28;
                            x7Var7 = x7Var29;
                            arrayList3 = arrayList8;
                            f12 = 1.0f;
                            f13 = 1.0f;
                        }
                        if (j14 != null) {
                            j14.setScaleX(f13);
                            j14.setScaleY(f13);
                        }
                        RectF b03 = z7Var.b0(y7Var2);
                        if (b03 == null) {
                            x7Var27.a((f12 - f27) * y7Var2.Z);
                            m7Var4 = j14;
                            f11 = min;
                            f14 = 1.0f;
                        } else {
                            float sin = (float) Math.sin(f27 * 3.141592653589793d);
                            f11 = min;
                            m7Var4 = j14;
                            float min2 = Math.min(AndroidUtilities.dp(90.0f), Utilities.dist(b03.centerX(), b03.centerY(), y7Var2.X, y7Var2.Y) * 0.28f);
                            x7Var22.a(AndroidUtilities.lerp(y7Var2.X, b03.centerX(), f27));
                            x7Var21.a(AndroidUtilities.lerp(y7Var2.Y, b03.centerY(), f27) - ((((1.0f - f27) * 2.0f) * f27) * min2));
                            x7Var27.a(AndroidUtilities.lerp(1.0f, f13, f27) * com.google.android.gms.internal.play_billing.k3.A(sin, 0.05f, 1.0f, AndroidUtilities.lerp(y7Var2.Z, (z7Var.f(y7Var2) * (b03.width() / f13)) / z7Var.W(), f27)));
                            x7Var18.a(sin * 0.8f);
                            float f28 = y7Var2.a0;
                            x7Var17.a((z7.c(-f28) * f27) + f28);
                            f14 = 1.0f;
                            x7Var16.a(Utilities.clamp01(1.0f - ((f27 - 0.35f) / 0.4f)));
                        }
                        if (c10 >= f14) {
                            z7Var.g(y7Var2);
                            if (m7Var4 != null) {
                                m7Var4.animate().scaleX(0.955f).scaleY(0.955f).setDuration(70L).setInterpolator(null).withEndAction(new p7(m7Var4, 1)).start();
                            }
                        }
                    } else {
                        x7Var5 = x7Var30;
                        x7Var6 = x7Var28;
                        x7Var7 = x7Var29;
                        arrayList3 = arrayList8;
                        f11 = min;
                        if (i12 == 5) {
                            if (x7Var27.a < 0.03f) {
                                z7Var.g(y7Var2);
                            }
                        }
                        if (!y7Var2.b()) {
                            y7Var2.R = true;
                        } else if (y7Var2.H == 0) {
                            y7Var2.R = false;
                        }
                        if (g3Var.isLottieRunning()) {
                            z13 = z16;
                        } else {
                            uj0 lottieAnimation = g3Var.getLottieAnimation();
                            int i14 = lottieAnimation == null ? 0 : lottieAnimation.a0;
                            if (i14 >= 2) {
                                y7Var2.T = true;
                            }
                            boolean z18 = y7Var2.S && !y7Var2.T && y7Var2.H == 2;
                            if (y7Var2.l.b == 0.0f && !z18 && lottieAnimation != null && i14 < 2) {
                                g3Var.stopAnimation();
                                g3Var.setAllowStartLottieAnimation(false);
                                y7Var2.S = false;
                            }
                            z13 = true;
                        }
                        z12 = z15;
                        it2 = it3;
                        x5Var = x5Var2;
                        x7Var12 = x7Var20;
                        linkedHashMap2 = linkedHashMap3;
                        x7Var13 = x7Var6;
                        arrayList6 = arrayList2;
                        min = f11;
                        x7Var14 = x7Var7;
                        x7Var15 = x7Var5;
                        arrayList5 = arrayList3;
                    }
                }
                z16 = true;
                if (!y7Var2.b()) {
                }
                if (g3Var.isLottieRunning()) {
                }
                z12 = z15;
                it2 = it3;
                x5Var = x5Var2;
                x7Var12 = x7Var20;
                linkedHashMap2 = linkedHashMap3;
                x7Var13 = x7Var6;
                arrayList6 = arrayList2;
                min = f11;
                x7Var14 = x7Var7;
                x7Var15 = x7Var5;
                arrayList5 = arrayList3;
            }
            boolean z19 = z12;
            x7 x7Var31 = x7Var12;
            x7 x7Var32 = x7Var13;
            x7 x7Var33 = x7Var14;
            x7 x7Var34 = x7Var15;
            x5 x5Var3 = x5Var;
            LinkedHashMap linkedHashMap4 = linkedHashMap2;
            ArrayList arrayList9 = arrayList5;
            ArrayList arrayList10 = arrayList6;
            boolean z20 = z13;
            float f29 = min;
            x7 x7Var35 = z7Var.l1;
            x7 x7Var36 = z7Var.k1;
            if (!z19) {
                if (z7Var.c1) {
                    y7 y7Var3 = z7Var.f1;
                    if (y7Var3 != null && y7Var3.H == 0 && (j11 = z7Var.j(y7Var3)) != null && z7Var.B(j11) && z7.b(z7Var.f1)) {
                        y7Var = z7Var.f1;
                    } else {
                        ArrayList arrayList11 = z7Var.h;
                        int size4 = arrayList11.size();
                        int i15 = 0;
                        y7 y7Var4 = null;
                        float f30 = 0.0f;
                        float f31 = 0.0f;
                        while (i15 < size4) {
                            Object obj = arrayList11.get(i15);
                            i15++;
                            m7 m7Var5 = (m7) obj;
                            LinkedHashMap linkedHashMap5 = linkedHashMap4;
                            y7 y7Var5 = (y7) linkedHashMap5.get(m7Var5.o0.address);
                            if (y7Var5 != null && y7Var5.H == 0 && z7.b(y7Var5) && m7Var5.isAttachedToWindow() && z7Var.B(m7Var5) && (b02 = z7Var.b0(y7Var5)) != null) {
                                if (y7Var4 != null) {
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
                                y7Var4 = y7Var5;
                            }
                            linkedHashMap4 = linkedHashMap5;
                        }
                        y7Var = y7Var4;
                    }
                    linkedHashMap = linkedHashMap4;
                    if (y7Var != null && y7Var != z7Var.f1) {
                        z7Var.f1 = y7Var;
                        z7Var.h1 = null;
                        z7Var.i1 = 0.0f;
                    }
                } else {
                    linkedHashMap = linkedHashMap4;
                }
                y7 y7Var6 = z7Var.f1;
                m7 j15 = y7Var6 == null ? null : z7Var.j(y7Var6);
                boolean z21 = z7Var.c1 && y7Var6 != null && y7Var6.H == 0 && z7.b(y7Var6) && j15 != null && z7Var.B(j15) && !z7Var.n0 && !z7Var.k0;
                if (y7Var6 != null && (z21 || z7Var.d1)) {
                    y7Var6.a();
                    if (z7Var.h1 == null && y7Var6.u != null) {
                        z7Var.h1 = z7Var.z(y7Var6, z7Var.T0 * 0.6f, z7Var.U0 * 0.68f, true);
                        y7Var6.N = false;
                    }
                }
                x7Var36.b = z21 ? 1.0f : 0.0f;
                x7Var35.b = ((!z21 && !z7Var.d1) || z7Var.h1 == null || z7.L(y7Var6) == null) ? 0.0f : 1.0f;
                f7 = f29;
                boolean b12 = x7Var36.b(f7) | x7Var35.b(f7);
                float f34 = x7Var36.a;
                boolean z22 = f34 > 0.002f || x7Var35.a > 0.002f;
                if (z22) {
                    z7Var.i1 += f7;
                } else {
                    z7Var.i1 = 0.0f;
                    if (!z7Var.c1 && !z7Var.d1) {
                        m7Var = null;
                        z7Var.h1 = null;
                        if (y7Var6 != null && y7Var6.H == 0 && y7Var6.v != null && f34 > 0.002f) {
                            F = z7Var.F(z7Var.i1 % 2.0f);
                            if (Utilities.clamp01(x7Var36.a) * Math.max(F[0], Math.max(F[1], F[2])) >= 0.003f) {
                                m7Var2 = j15;
                                m7Var3 = z7Var.g1;
                                if (m7Var3 != null && m7Var3 != m7Var2) {
                                    w9Var = m7Var3.y;
                                    if (w9Var.getAlpha() != 1.0f) {
                                        w9Var.setAlpha(1.0f);
                                    }
                                    m7Var3.invalidate();
                                }
                                z7Var.g1 = m7Var2;
                                if (m7Var2 != null) {
                                    org.telegram.ui.Components.w9 w9Var2 = m7Var2.y;
                                    if (w9Var2.getAlpha() != 0.0f) {
                                        w9Var2.setAlpha(0.0f);
                                    }
                                    m7Var2.invalidate();
                                }
                                if (z21 || x7Var36.a <= 0.5f) {
                                    j15 = m7Var;
                                }
                                RectF rectF = z7Var.q1;
                                if (z7Var.getParent() instanceof ViewGroup) {
                                    RectF b04 = j15 == null ? m7Var : z7Var.b0(z7Var.f1);
                                    if (b04 != null) {
                                        ei.x3 x3Var = z7Var.r1;
                                        if (x3Var == null) {
                                            z7Var.r1 = z7Var.D(R.string.WalletGiftDragHint, true);
                                        } else if (z7Var.e1 && !(z11 = x3Var.V)) {
                                            z7Var.e1 = false;
                                            z7Var.d1 = false;
                                            z7Var.c1 = false;
                                            if (z11) {
                                                x3Var.e(true);
                                            }
                                            if (!z19) {
                                                MessagesController.getGlobalMainSettings().edit().putBoolean("walletcardstickerhint", true).apply();
                                            }
                                            z7Var.h0();
                                        }
                                        z7.N(z7Var.r1, b04.centerX(), b04.top + AndroidUtilities.dp(4.0f));
                                        ei.x3 x3Var2 = z7Var.r1;
                                        if (!x3Var2.V) {
                                            x3Var2.u();
                                        }
                                        z7Var.e1 = true;
                                    } else {
                                        z7Var.e1 = false;
                                        ei.x3 x3Var3 = z7Var.r1;
                                        if (x3Var3 != null && x3Var3.V) {
                                            x3Var3.e(true);
                                        }
                                    }
                                    if (z7Var.d1 && x7Var35.a > 0.5f && (eVar = z7Var.d) != null && eVar.O() && z7Var.E()) {
                                        if (z7Var.s1 == null) {
                                            z7Var.s1 = z7Var.D(R.string.WalletGiftDragHere, false);
                                        }
                                        z7Var.p1.computeBounds(rectF, true);
                                        float[] P = z7Var.P(rectF.centerX(), rectF.top);
                                        if ((P[1] - AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp(56.0f) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) {
                                            float[] P2 = z7Var.P(rectF.centerX(), rectF.bottom);
                                            ei.x3 x3Var4 = z7Var.s1;
                                            float f35 = P2[0];
                                            float dp = P2[1] + AndroidUtilities.dp(2.0f);
                                            z7.o(x3Var4, 1);
                                            x3Var4.m(0.0f, f35 - x3Var4.getPaddingLeft());
                                            x3Var4.setTranslationY(dp);
                                            x3Var4.invalidate();
                                        } else {
                                            z7.N(z7Var.s1, P[0], P[1] - AndroidUtilities.dp(2.0f));
                                        }
                                        ei.x3 x3Var5 = z7Var.s1;
                                        if (!x3Var5.V) {
                                            x3Var5.u();
                                        }
                                    } else {
                                        ei.x3 x3Var6 = z7Var.s1;
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
                                        w7 w7Var2 = (w7) arrayList12.get(size);
                                        w7Var2.h += f7;
                                        float exp = (float) Math.exp((-2.4f) * f7);
                                        float f36 = w7Var2.c * exp;
                                        w7Var2.c = f36;
                                        float f37 = w7Var2.d * exp;
                                        w7Var2.d = f37;
                                        w7Var2.a = (f36 * f7) + w7Var2.a;
                                        w7Var2.b = (f37 * f7) + w7Var2.b;
                                        w7Var2.g = (f7 * 90.0f) + w7Var2.g;
                                        if (w7Var2.h >= w7Var2.f) {
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
                                        v7 v7Var2 = (v7) arrayList13.get(size2);
                                        float f38 = v7Var2.c + f7;
                                        v7Var2.c = f38;
                                        if (f38 > 0.42f) {
                                            arrayList13.remove(size2);
                                        }
                                        size2--;
                                        arrayList10 = arrayList13;
                                    }
                                    ArrayList arrayList14 = arrayList10;
                                    f10 = z7Var.P0;
                                    if (f10 < 1.0f) {
                                        z7Var.P0 = org.telegram.ui.Cells.c1.c(f7, z7Var.S0 ? 0.45f : 1.2f, f10, 1.0f);
                                        z7Var.e();
                                        z23 = true;
                                    }
                                    it = linkedHashMap.values().iterator();
                                    boolean z24 = false;
                                    while (it.hasNext()) {
                                        if (((y7) it.next()).H == 5) {
                                            z24 = true;
                                        }
                                    }
                                    x7 x7Var37 = z7Var.N;
                                    x7Var37.b = ((!z7Var.h0 && z7Var.j0 && x7Var37.b > 0.0f) || z24 || z7Var.f0) ? 1.0f : 0.0f;
                                    x7 x7Var38 = z7Var.O;
                                    boolean z25 = z7Var.o0;
                                    x7Var38.b = (!z25 || z24 || z7Var.f0) ? 1.0f : 0.0f;
                                    if (z7Var.f0) {
                                        x7Var31.b = z25 ? 28.0f : 0.0f;
                                        b10 = z23 | x7Var31.b(f7);
                                    } else {
                                        x7Var31.a(Math.min(66.0f, (60.0f * f7) + x7Var31.a));
                                        if (x7Var31.a >= 66.0f) {
                                            z7Var.f0 = false;
                                            x7Var31.a(0.0f);
                                        }
                                        b10 = true;
                                    }
                                    b11 = b10 | z7Var.N.b(f7) | z7Var.O.b(f7) | x7Var34.b(f7) | x7Var33.b(f7) | x7Var32.b(f7);
                                    x5Var3.setStickerImpact(x7Var34.a);
                                    float max = Math.max(-1.0f, Math.min(1.0f, x7Var33.a));
                                    float max2 = Math.max(-1.0f, Math.min(1.0f, x7Var32.a));
                                    if (x5Var3.f0 != 0) {
                                        m.s3 s3Var = new m.s3();
                                        float[] fArr2 = new float[8];
                                        s3Var.c(MediaDataController.MAX_STYLE_RUNS_COUNT, 600, 0.0f, 5.0f, false, fArr2);
                                        x5Var3.g0 = Math.hypot((double) (fArr2[2] - fArr2[4]), (double) (fArr2[3] - fArr2[5])) < Math.hypot((double) (fArr2[0] - fArr2[6]), (double) (fArr2[1] - fArr2[7])) ? 1 : -1;
                                        s3Var.c(MediaDataController.MAX_STYLE_RUNS_COUNT, 600, 5.0f, 0.0f, false, fArr2);
                                        i10 = 0;
                                        x5Var3.f0 = Math.hypot((double) (fArr2[4] - fArr2[6]), (double) (fArr2[5] - fArr2[7])) < Math.hypot((double) (fArr2[0] - fArr2[2]), (double) (fArr2[1] - fArr2[3])) ? 1 : -1;
                                    } else {
                                        i10 = 0;
                                    }
                                    float f39 = x5Var3.f0 * max2 * 10.0f;
                                    float f40 = x5Var3.g0 * max * 10.0f;
                                    frameLayout = x5Var3.G;
                                    if (frameLayout instanceof f6) {
                                        p5 p5Var = (p5) frameLayout;
                                        if (p5Var.a0 != f39 || p5Var.b0 != f40) {
                                            p5Var.a0 = f39;
                                            p5Var.b0 = f40;
                                            p5Var.b(p5Var.S, p5Var.V);
                                        }
                                    } else {
                                        f6 f6Var = (f6) frameLayout;
                                        if (f6Var.T != f39 || f6Var.U != f40) {
                                            f6Var.T = f39;
                                            f6Var.U = f40;
                                            f6Var.a(f6Var.K, f6Var.N);
                                        }
                                    }
                                    z7Var.a0 = x5Var3.getCardRotationX();
                                    z7Var.b0 = x5Var3.getCardRotationY();
                                    ArrayList arrayList15 = z7Var.h;
                                    size3 = arrayList15.size();
                                    i11 = i10;
                                    while (i11 < size3) {
                                        Object obj2 = arrayList15.get(i11);
                                        i11++;
                                        m7 m7Var6 = (m7) obj2;
                                        y7 y7Var7 = (y7) linkedHashMap.get(m7Var6.o0.address);
                                        if (y7Var7 != null) {
                                            m7Var6.j(y7Var7.R, true, y7Var7.H == 0 ? 0.0f : 1.0f);
                                        }
                                    }
                                    z7Var.invalidate();
                                    z7Var.L.invalidate();
                                    z7Var.M.invalidate();
                                    if (b11 && arrayList14.isEmpty() && !z7Var.k0) {
                                        z7Var.H0 = j10;
                                        return;
                                    }
                                    z7Var.postOnAnimation(this);
                                }
                            }
                        }
                        m7Var2 = m7Var;
                        m7Var3 = z7Var.g1;
                        if (m7Var3 != null) {
                            w9Var = m7Var3.y;
                            if (w9Var.getAlpha() != 1.0f) {
                            }
                            m7Var3.invalidate();
                        }
                        z7Var.g1 = m7Var2;
                        if (m7Var2 != null) {
                        }
                        if (z21) {
                        }
                        j15 = m7Var;
                        RectF rectF2 = z7Var.q1;
                        if (z7Var.getParent() instanceof ViewGroup) {
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
                        f10 = z7Var.P0;
                        if (f10 < 1.0f) {
                        }
                        it = linkedHashMap.values().iterator();
                        boolean z242 = false;
                        while (it.hasNext()) {
                        }
                        x7 x7Var372 = z7Var.N;
                        x7Var372.b = ((!z7Var.h0 && z7Var.j0 && x7Var372.b > 0.0f) || z242 || z7Var.f0) ? 1.0f : 0.0f;
                        x7 x7Var382 = z7Var.O;
                        boolean z252 = z7Var.o0;
                        x7Var382.b = (!z252 || z242 || z7Var.f0) ? 1.0f : 0.0f;
                        if (z7Var.f0) {
                        }
                        b11 = b10 | z7Var.N.b(f7) | z7Var.O.b(f7) | x7Var34.b(f7) | x7Var33.b(f7) | x7Var32.b(f7);
                        x5Var3.setStickerImpact(x7Var34.a);
                        float max3 = Math.max(-1.0f, Math.min(1.0f, x7Var33.a));
                        float max22 = Math.max(-1.0f, Math.min(1.0f, x7Var32.a));
                        if (x5Var3.f0 != 0) {
                        }
                        float f392 = x5Var3.f0 * max22 * 10.0f;
                        float f402 = x5Var3.g0 * max3 * 10.0f;
                        frameLayout = x5Var3.G;
                        if (frameLayout instanceof f6) {
                        }
                        z7Var.a0 = x5Var3.getCardRotationX();
                        z7Var.b0 = x5Var3.getCardRotationY();
                        ArrayList arrayList152 = z7Var.h;
                        size3 = arrayList152.size();
                        i11 = i10;
                        while (i11 < size3) {
                        }
                        z7Var.invalidate();
                        z7Var.L.invalidate();
                        z7Var.M.invalidate();
                        if (b11) {
                        }
                        z7Var.postOnAnimation(this);
                    }
                }
                m7Var = null;
                if (y7Var6 != null) {
                    F = z7Var.F(z7Var.i1 % 2.0f);
                    if (Utilities.clamp01(x7Var36.a) * Math.max(F[0], Math.max(F[1], F[2])) >= 0.003f) {
                    }
                }
                m7Var2 = m7Var;
                m7Var3 = z7Var.g1;
                if (m7Var3 != null) {
                }
                z7Var.g1 = m7Var2;
                if (m7Var2 != null) {
                }
                if (z21) {
                }
                j15 = m7Var;
                RectF rectF22 = z7Var.q1;
                if (z7Var.getParent() instanceof ViewGroup) {
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
                f10 = z7Var.P0;
                if (f10 < 1.0f) {
                }
                it = linkedHashMap.values().iterator();
                boolean z2422 = false;
                while (it.hasNext()) {
                }
                x7 x7Var3722 = z7Var.N;
                x7Var3722.b = ((!z7Var.h0 && z7Var.j0 && x7Var3722.b > 0.0f) || z2422 || z7Var.f0) ? 1.0f : 0.0f;
                x7 x7Var3822 = z7Var.O;
                boolean z2522 = z7Var.o0;
                x7Var3822.b = (!z2522 || z2422 || z7Var.f0) ? 1.0f : 0.0f;
                if (z7Var.f0) {
                }
                b11 = b10 | z7Var.N.b(f7) | z7Var.O.b(f7) | x7Var34.b(f7) | x7Var33.b(f7) | x7Var32.b(f7);
                x5Var3.setStickerImpact(x7Var34.a);
                float max32 = Math.max(-1.0f, Math.min(1.0f, x7Var33.a));
                float max222 = Math.max(-1.0f, Math.min(1.0f, x7Var32.a));
                if (x5Var3.f0 != 0) {
                }
                float f3922 = x5Var3.f0 * max222 * 10.0f;
                float f4022 = x5Var3.g0 * max32 * 10.0f;
                frameLayout = x5Var3.G;
                if (frameLayout instanceof f6) {
                }
                z7Var.a0 = x5Var3.getCardRotationX();
                z7Var.b0 = x5Var3.getCardRotationY();
                ArrayList arrayList1522 = z7Var.h;
                size3 = arrayList1522.size();
                i11 = i10;
                while (i11 < size3) {
                }
                z7Var.invalidate();
                z7Var.L.invalidate();
                z7Var.M.invalidate();
                if (b11) {
                }
                z7Var.postOnAnimation(this);
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
            f10 = z7Var.P0;
            if (f10 < 1.0f) {
            }
            it = linkedHashMap.values().iterator();
            boolean z24222 = false;
            while (it.hasNext()) {
            }
            x7 x7Var37222 = z7Var.N;
            x7Var37222.b = ((!z7Var.h0 && z7Var.j0 && x7Var37222.b > 0.0f) || z24222 || z7Var.f0) ? 1.0f : 0.0f;
            x7 x7Var38222 = z7Var.O;
            boolean z25222 = z7Var.o0;
            x7Var38222.b = (!z25222 || z24222 || z7Var.f0) ? 1.0f : 0.0f;
            if (z7Var.f0) {
            }
            b11 = b10 | z7Var.N.b(f7) | z7Var.O.b(f7) | x7Var34.b(f7) | x7Var33.b(f7) | x7Var32.b(f7);
            x5Var3.setStickerImpact(x7Var34.a);
            float max322 = Math.max(-1.0f, Math.min(1.0f, x7Var33.a));
            float max2222 = Math.max(-1.0f, Math.min(1.0f, x7Var32.a));
            if (x5Var3.f0 != 0) {
            }
            float f39222 = x5Var3.f0 * max2222 * 10.0f;
            float f40222 = x5Var3.g0 * max322 * 10.0f;
            frameLayout = x5Var3.G;
            if (frameLayout instanceof f6) {
            }
            z7Var.a0 = x5Var3.getCardRotationX();
            z7Var.b0 = x5Var3.getCardRotationY();
            ArrayList arrayList15222 = z7Var.h;
            size3 = arrayList15222.size();
            i11 = i10;
            while (i11 < size3) {
            }
            z7Var.invalidate();
            z7Var.L.invalidate();
            z7Var.M.invalidate();
            if (b11) {
            }
            z7Var.postOnAnimation(this);
        }
    }
}
