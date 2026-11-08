package org.telegram.ui.ActionBar;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.SparseIntArray;
import c8.j9;
import java.io.File;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class h6 {
    public int a;
    public j6 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public long j;
    public long k;
    public long l;
    public long m;
    public float p;
    public boolean q;
    public TLRPC.TL_theme r;
    public TLRPC.TL_wallPaper s;
    public int t;
    public String u;
    public String v;
    public TLRPC.InputFile w;
    public TLRPC.InputFile x;
    public c6 y;
    public boolean z;
    public int n = 45;
    public String o = "";
    public final float[] A = new float[3];

    public static int a(SparseIntArray sparseIntArray, int... iArr) {
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            if (sparseIntArray.indexOfKey(iArr[i13]) >= 0) {
                try {
                    int i14 = sparseIntArray.get(iArr[i13]);
                    i10 += Color.red(i14);
                    i11 += Color.green(i14);
                    i12 += Color.blue(i14);
                    i7++;
                } catch (Exception unused) {
                }
            }
        }
        if (i7 == 0) {
            return 0;
        }
        return Color.argb(qs.e4, i10 / i7, i11 / i7, i12 / i7);
    }

    public static int c(SparseIntArray sparseIntArray, int i7) {
        int i10;
        int indexOfKey = sparseIntArray.indexOfKey(i7);
        if (indexOfKey < 0 && (i10 = k6.fm.get(i7, -1)) >= 0) {
            indexOfKey = sparseIntArray.indexOfKey(i10);
        }
        return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : k6.em[i7];
    }

    public static void h(SparseIntArray sparseIntArray) {
        for (int i7 = k6.nb; i7 < k6.ub; i7++) {
            sparseIntArray.delete(i7);
            sparseIntArray.put(i7, k6.em[i7]);
        }
        for (int i10 = k6.vb; i10 < k6.Hc; i10++) {
            sparseIntArray.delete(i10);
            sparseIntArray.put(i10, k6.em[i10]);
        }
        for (int i11 = k6.Ic; i11 < k6.Qc; i11++) {
            sparseIntArray.delete(i11);
            sparseIntArray.put(i11, k6.em[i11]);
        }
    }

    public final int b(int i7, int i10) {
        float[] fArr = this.A;
        Color.colorToHSV(i10, fArr);
        float f10 = fArr[0];
        Color.colorToHSV(i7, fArr);
        float f11 = fArr[1];
        if (f11 <= 0.0f) {
            fArr[0] = f10;
        }
        fArr[1] = org.telegram.messenger.camera.q.z(f11, 0.6f, 1.0f, 0.0f);
        fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.05f));
        return Color.HSVToColor(30, fArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x053e, code lost:
    
        if (r14 < 85.0f) goto L221;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0559  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        int valueAt;
        float f10;
        boolean a10;
        int i7;
        char c10;
        int i10;
        int i11;
        int valueAt2;
        int valueAt3;
        TLRPC.TL_theme tL_theme;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        float[] P0 = k6.P0(1);
        float[] P02 = k6.P0(2);
        Color.colorToHSV(this.b.X, P0);
        Color.colorToHSV(this.c, P02);
        boolean q10 = this.b.q();
        int i19 = 0;
        if (this.c != this.b.X || this.d != 0) {
            int i20 = 0;
            while (true) {
                int[] iArr = k6.em;
                if (i20 >= iArr.length) {
                    break;
                }
                if (!k6.gm.contains(Integer.valueOf(i20))) {
                    int indexOfKey = sparseIntArray.indexOfKey(i20);
                    if (indexOfKey < 0) {
                        int i21 = k6.fm.get(i20, -1);
                        if (i21 < 0 || sparseIntArray.indexOfKey(i21) < 0) {
                            valueAt = iArr[i20];
                        }
                    } else {
                        valueAt = sparseIntArray.valueAt(indexOfKey);
                    }
                    int E = k6.E(P0, P02, valueAt, q10, valueAt);
                    if (E != valueAt) {
                        sparseIntArray2.put(i20, E);
                    }
                }
                i20++;
            }
        }
        int i22 = this.e;
        if ((i22 == 0 && this.c == 0) || this.f == 0) {
            i10 = 1;
            c10 = 2;
            f10 = 0.705f;
            i7 = 0;
        } else {
            if (i22 == 0) {
                i22 = this.c;
            }
            int i23 = k6.ob;
            int i24 = sparseIntArray.get(i23);
            if (i24 == 0) {
                i24 = k6.em[i23];
            }
            int F0 = org.telegram.messenger.g0.F0(i22, k6.E(P0, P02, i24, q10, i24));
            int i25 = 1;
            int F02 = org.telegram.messenger.g0.F0(i22, this.f);
            char c11 = 2;
            if (this.g != 0) {
                f10 = 0.705f;
                int w02 = org.telegram.messenger.g0.w0(org.telegram.messenger.g0.w0(this.e, this.f), this.g);
                int i26 = this.h;
                if (i26 != 0) {
                    w02 = org.telegram.messenger.g0.w0(w02, i26);
                }
                a10 = org.telegram.messenger.g0.B(w02) > 0.705f;
            } else {
                f10 = 0.705f;
                a10 = k6.a(this.e, this.f);
            }
            i7 = (!a10 || F0 > 35000 || F02 > 35000) ? 0 : 1;
            float[] P03 = k6.P0(3);
            float[] P04 = k6.P0(4);
            Color.colorToHSV(i24, P03);
            Color.colorToHSV(i22, P04);
            float min = Math.min((P03[1] * 1.5f) / P0[1], 1.0f);
            P03[0] = (P04[0] - P03[0]) + P0[0];
            P03[1] = (P04[1] * P0[1]) / P03[1];
            float f11 = ((((P04[2] / P03[2]) + min) - 1.0f) * P0[2]) / min;
            P03[2] = f11;
            i10 = i25;
            c10 = c11;
            if (f11 >= 0.3f) {
                i22 = Color.HSVToColor(qs.e4, P03);
                i10 = i25;
                c10 = c11;
            }
        }
        int i27 = (i22 == 0 || (((i17 = this.b.X) == 0 || i22 == i17) && ((i18 = this.c) == 0 || i18 == i22))) ? 0 : i10;
        if (i27 == 0 && this.d == 0) {
            i11 = 0;
        } else {
            int i28 = this.d;
            if (i28 != 0) {
                Color.colorToHSV(i28, P02);
            } else {
                Color.colorToHSV(i22, P02);
            }
            for (int i29 = k6.vb; i29 < k6.Hc; i29++) {
                int indexOfKey2 = sparseIntArray.indexOfKey(i29);
                if (indexOfKey2 < 0) {
                    int i30 = k6.fm.get(i29, -1);
                    if (i30 < 0 || sparseIntArray.get(i30, -1) < 0) {
                        valueAt3 = k6.em[i29];
                    }
                } else {
                    valueAt3 = sparseIntArray.valueAt(indexOfKey2);
                }
                int E2 = k6.E(P0, P02, valueAt3, q10, valueAt3);
                if (E2 != valueAt3) {
                    sparseIntArray2.put(i29, E2);
                }
            }
            int[] iArr2 = k6.vl;
            int length = iArr2.length;
            int i31 = 0;
            while (i31 < length) {
                int i32 = i19;
                int i33 = iArr2[i31];
                int indexOfKey3 = sparseIntArray.indexOfKey(i33);
                int valueAt4 = indexOfKey3 < 0 ? k6.em[i33] : sparseIntArray.valueAt(indexOfKey3);
                int E3 = k6.E(P0, P02, valueAt4, q10, valueAt4);
                if (E3 != valueAt4) {
                    sparseIntArray2.put(i33, E3);
                }
                i31++;
                i19 = i32;
            }
            i11 = i19;
            if (i27 != 0) {
                Color.colorToHSV(i22, P02);
                for (int i34 = k6.nb; i34 < k6.ub; i34++) {
                    int indexOfKey4 = sparseIntArray.indexOfKey(i34);
                    if (indexOfKey4 < 0) {
                        int i35 = k6.fm.get(i34, -1);
                        if (i35 < 0 || sparseIntArray.get(i35, -1) < 0) {
                            valueAt2 = k6.em[i34];
                        }
                    } else {
                        valueAt2 = sparseIntArray.valueAt(indexOfKey4);
                    }
                    int E4 = k6.E(P0, P02, valueAt2, q10, valueAt2);
                    if (E4 != valueAt2) {
                        sparseIntArray2.put(i34, E4);
                    }
                }
            }
        }
        if (i7 == 0 && (i12 = this.f) != 0) {
            if (this.g != 0) {
                int w03 = org.telegram.messenger.g0.w0(org.telegram.messenger.g0.w0(this.e, i12), this.g);
                int i36 = this.h;
                if (i36 != 0) {
                    w03 = org.telegram.messenger.g0.w0(w03, i36);
                }
                i13 = org.telegram.messenger.g0.B(w03) > f10 ? i10 : i11;
            } else {
                i13 = k6.a(this.e, i12);
            }
            if (i13 != 0) {
                i16 = -14606047;
                i14 = -11184811;
                i15 = 1291845632;
            } else {
                i14 = -1118482;
                i15 = 1308622847;
                i16 = -1;
            }
            if (this.d == 0) {
                sparseIntArray2.put(k6.ec, i15);
                sparseIntArray2.put(k6.fc, i15);
                sparseIntArray2.put(k6.kc, i15);
                sparseIntArray2.put(k6.lc, i15);
                sparseIntArray2.put(k6.mc, i15);
                sparseIntArray2.put(k6.nc, i16);
                sparseIntArray2.put(k6.oc, i15);
                sparseIntArray2.put(k6.pc, i15);
                sparseIntArray2.put(k6.qc, i16);
                sparseIntArray2.put(k6.Vc, i16);
                sparseIntArray2.put(k6.Mb, i16);
                sparseIntArray2.put(k6.Nb, i16);
                sparseIntArray2.put(k6.Ob, i16);
                sparseIntArray2.put(k6.Pb, i16);
                sparseIntArray2.put(k6.Qb, i16);
                sparseIntArray2.put(k6.Ub, i16);
                sparseIntArray2.put(k6.Vb, i16);
                sparseIntArray2.put(k6.Jb, i16);
                sparseIntArray2.put(k6.Kb, i16);
                sparseIntArray2.put(k6.Lb, i16);
                sparseIntArray2.put(k6.Fb, i16);
                sparseIntArray2.put(k6.Gb, i16);
                sparseIntArray2.put(k6.hc, i16);
                sparseIntArray2.put(k6.tc, i16);
                sparseIntArray2.put(k6.Wb, i16);
                sparseIntArray2.put(k6.Zb, i16);
                sparseIntArray2.put(k6.ac, i16);
                sparseIntArray2.put(k6.xb, i16);
                sparseIntArray2.put(k6.yb, i16);
                sparseIntArray2.put(k6.zb, i16);
                sparseIntArray2.put(k6.Ab, i16);
                sparseIntArray2.put(k6.Bb, i16);
                sparseIntArray2.put(k6.Cb, i16);
                sparseIntArray2.put(k6.Hb, i16);
                sparseIntArray2.put(k6.Ib, i16);
                sparseIntArray2.put(k6.gc, i16);
                sparseIntArray2.put(k6.bc, i16);
                sparseIntArray2.put(k6.ic, i14);
                sparseIntArray2.put(k6.jc, i14);
                sparseIntArray2.put(k6.Xb, i14);
                sparseIntArray2.put(k6.Yb, i14);
                sparseIntArray2.put(k6.uc, i14);
                sparseIntArray2.put(k6.vc, i14);
                sparseIntArray2.put(k6.yc, i14);
                sparseIntArray2.put(k6.zc, i14);
                sparseIntArray2.put(k6.Bc, i16);
                sparseIntArray2.put(k6.Cc, i16);
                sparseIntArray2.put(k6.rc, this.e);
                sparseIntArray2.put(k6.sc, this.e);
                sparseIntArray2.put(k6.Db, this.e);
                sparseIntArray2.put(k6.Eb, this.e);
            }
            sparseIntArray2.put(k6.Rb, i16);
            sparseIntArray2.put(k6.Sb, i16);
            sparseIntArray2.put(k6.Tb, i16);
            sparseIntArray2.put(k6.Tc, i16);
        }
        if (i7 != 0) {
            int i37 = k6.Bc;
            if (org.telegram.messenger.g0.F0(-1, sparseIntArray2.indexOfKey(i37) >= 0 ? sparseIntArray2.get(i37) : i11) < 5000) {
                i7 = i11;
            }
        }
        int i38 = this.e;
        if (i38 != 0 && this.f != 0) {
            sparseIntArray2.put(k6.ob, i38);
            sparseIntArray2.put(k6.rb, this.f);
            int i39 = this.g;
            if (i39 != 0) {
                sparseIntArray2.put(k6.sb, i39);
                int i40 = this.h;
                if (i40 != 0) {
                    sparseIntArray2.put(k6.tb, i40);
                }
            }
            sparseIntArray2.put(k6.Oc, this.i ? 1 : 0);
        }
        long j3 = this.j;
        int i41 = (int) j3;
        if (i41 != 0) {
            sparseIntArray2.put(k6.Be, i41);
        } else if (j3 != 0) {
            sparseIntArray2.delete(k6.Be);
        }
        long j10 = this.k;
        int i42 = (int) j10;
        if (i42 != 0) {
            sparseIntArray2.put(k6.Ce, i42);
        } else if (j10 != 0) {
            sparseIntArray2.delete(k6.Ce);
        }
        long j11 = this.l;
        int i43 = (int) j11;
        if (i43 != 0) {
            sparseIntArray2.put(k6.De, i43);
        } else if (j11 != 0) {
            sparseIntArray2.delete(k6.De);
        }
        long j12 = this.m;
        int i44 = (int) j12;
        if (i44 != 0) {
            sparseIntArray2.put(k6.Ee, i44);
        } else if (j12 != 0) {
            sparseIntArray2.delete(k6.Ee);
        }
        int i45 = this.n;
        if (i45 != 45) {
            sparseIntArray2.put(k6.Fe, i45);
        }
        int i46 = k6.ob;
        int i47 = sparseIntArray2.get(i46);
        if (i47 == 0) {
            i47 = k6.y0(sparseIntArray2, i46, null);
        }
        int i48 = k6.ra;
        int i49 = sparseIntArray2.get(i48);
        if (i49 == 0) {
            i49 = k6.y0(sparseIntArray2, i48, null);
        }
        if (this.c != this.b.X || this.e != 0 || ((tL_theme = this.r) != null && tL_theme.emoticon != null)) {
            int c12 = c(sparseIntArray2, k6.Ob);
            sparseIntArray2.put(k6.La, (-16777216) | i47);
            sparseIntArray2.put(k6.Ma, c(sparseIntArray2, k6.gc));
            sparseIntArray2.put(k6.Na, c(sparseIntArray2, k6.zb));
            sparseIntArray2.put(k6.Pa, c12);
            sparseIntArray2.put(k6.Qa, c(sparseIntArray2, k6.Qb));
            sparseIntArray2.put(k6.Oa, k6.r1(0.1f, c12));
            sparseIntArray2.put(k6.Ya, c(sparseIntArray2, k6.tc));
            sparseIntArray2.put(k6.Za, c(sparseIntArray2, k6.Bc));
            sparseIntArray2.put(k6.ab, c(sparseIntArray2, k6.Db));
            sparseIntArray2.put(k6.bb, c(sparseIntArray2, k6.uc));
            sparseIntArray2.put(k6.cb, c(sparseIntArray2, k6.wc));
            sparseIntArray2.put(k6.db, c(sparseIntArray2, k6.il));
        }
        TLRPC.TL_theme tL_theme2 = this.r;
        if (tL_theme2 != null && tL_theme2.emoticon != null && !q10) {
            sparseIntArray2.delete(k6.vd);
            int a11 = a(sparseIntArray2, k6.Ce, k6.De, k6.Ee);
            if (a11 == 0) {
                a11 = a(sparseIntArray2, k6.Be);
            }
            if (a11 == 0) {
                a11 = this.c;
            }
            int b10 = b(i47, a11);
            sparseIntArray2.put(k6.Mc, b10);
            sparseIntArray2.put(k6.Pc, b10);
            sparseIntArray2.put(k6.pb, k6.w(i47, b10));
            int b11 = b(i49, this.c);
            sparseIntArray2.put(k6.sa, b11);
            sparseIntArray2.put(k6.Rc, k6.w(i49, b11));
        }
        float[] fArr = this.A;
        if (!q10) {
            sparseIntArray2.put(k6.ig, i(i49, this.c));
            sparseIntArray2.put(k6.Jc, i(i47, this.c));
            int i50 = k6.Kc;
            Color.colorToHSV(this.c, fArr);
            float f12 = fArr[i11];
            Color.colorToHSV(i47, fArr);
            float f13 = fArr[i10];
            if (f13 > 0.0f) {
                float f14 = fArr[i11];
                if (f14 > 45.0f) {
                }
                fArr[i10] = org.telegram.messenger.camera.q.z(f13, 0.6f, 1.0f, 0.0f);
                float f15 = fArr[c10];
                fArr[c10] = Math.max(0.0f, Math.min(1.0f, f15 - (f15 <= 0.7f ? 0.25f : 0.125f)));
                sparseIntArray2.put(i50, k6.w(i47, Color.HSVToColor(qs.e4, fArr)));
            }
            fArr[i11] = f12;
            fArr[i10] = org.telegram.messenger.camera.q.z(f13, 0.6f, 1.0f, 0.0f);
            float f152 = fArr[c10];
            fArr[c10] = Math.max(0.0f, Math.min(1.0f, f152 - (f152 <= 0.7f ? 0.25f : 0.125f)));
            sparseIntArray2.put(i50, k6.w(i47, Color.HSVToColor(qs.e4, fArr)));
        }
        Color.colorToHSV(k6.y0(sparseIntArray2, k6.n6, null), fArr);
        float f16 = fArr[i11];
        sparseIntArray2.put(k6.Lc, g(i47, f16, q10));
        sparseIntArray2.put(k6.kg, g(i49, f16, q10));
        int i51 = k6.Uc;
        int i52 = sparseIntArray2.get(i51);
        if (i52 == 0) {
            i52 = k6.y0(sparseIntArray2, i51, null);
        }
        int i53 = k6.Vc;
        int i54 = sparseIntArray2.get(i53);
        if (i54 == 0) {
            i54 = k6.y0(sparseIntArray2, i53, null);
        }
        sparseIntArray2.put(k6.ze, f(i52, i49, q10));
        sparseIntArray2.put(k6.Ac, f(i54, i47, q10));
        int i55 = k6.G8;
        int i56 = sparseIntArray2.get(i55);
        if (i56 == 0) {
            i56 = k6.y0(sparseIntArray2, i55, null);
        }
        int i57 = i11;
        sparseIntArray2.put(k6.H8, Color.argb(Color.alpha(i56), Math.max(i57, Color.red(i56) - 10), Math.max(i57, Color.green(i56) - 10), Math.max(i57, Color.blue(i56) - 10)));
        int i58 = 64;
        if (q10) {
            int i59 = k6.rb;
            if (sparseIntArray2.get(i59) != 0) {
                Color.colorToHSV(a(sparseIntArray2, i59, k6.sb, k6.tb), fArr);
                fArr[i10] = Utilities.i(fArr[i10] + 0.1f, 1.0f, 0.0f);
                fArr[c10] = Utilities.i(fArr[c10] - 0.8f, 1.0f, 0.0f);
                sparseIntArray2.put(k6.el, Color.HSVToColor(64, fArr));
                k6.g(sparseIntArray, sparseIntArray2, q10);
                k6.f(sparseIntArray, sparseIntArray2, q10);
                return i7 ^ 1;
            }
        }
        int i60 = k6.el;
        Color.colorToHSV(i47, fArr);
        if (q10) {
            fArr[i10] = Utilities.i(fArr[i10] - 0.08f, 1.0f, 0.0f);
            fArr[c10] = 0.03f;
        } else {
            float f17 = fArr[i10];
            if (f17 > 0.0f) {
                float f18 = fArr[c10];
                if (f18 < 1.0f && f18 > 0.0f) {
                    fArr[i10] = org.telegram.messenger.camera.q.z(f17, 0.28f, 1.0f, 0.0f);
                    fArr[c10] = org.telegram.messenger.camera.q.z(fArr[c10], -0.1f, 1.0f, 0.0f);
                    i58 = 32;
                }
            }
            fArr[c10] = org.telegram.messenger.camera.q.z(fArr[c10], -0.2f, 1.0f, 0.0f);
            i58 = 32;
        }
        sparseIntArray2.put(i60, Color.HSVToColor(i58, fArr));
        k6.g(sparseIntArray, sparseIntArray2, q10);
        k6.f(sparseIntArray, sparseIntArray2, q10);
        return i7 ^ 1;
    }

    public final File e() {
        if (this.a < 100) {
            if (TextUtils.isEmpty(this.o)) {
                return null;
            }
            File h = org.telegram.messenger.t0.h();
            Locale locale = Locale.US;
            return new File(h, this.b.m() + "_" + this.a + "_" + this.o + "_v5.jpg");
        }
        if (TextUtils.isEmpty(this.o)) {
            return null;
        }
        File h7 = org.telegram.messenger.t0.h();
        Locale locale2 = Locale.US;
        return new File(h7, this.b.m() + "_" + this.a + "_" + this.o + "_v8_debug.jpg");
    }

    public final int f(int i7, int i10, boolean z9) {
        int f10 = i0.a.f(0.25f, i7, i10);
        float[] fArr = this.A;
        Color.colorToHSV(f10, fArr);
        fArr[1] = Math.max(0.0f, Math.min(1.0f, fArr[1] - 0.1f));
        fArr[2] = org.telegram.messenger.camera.q.z(fArr[2], z9 ? 0.1f : 0.0f, 1.0f, 0.0f);
        return Color.HSVToColor(51, fArr);
    }

    public final int g(int i7, float f10, boolean z9) {
        if (z9) {
            return 520093695;
        }
        float[] fArr = this.A;
        Color.colorToHSV(i7, fArr);
        if (fArr[1] > 0.0f) {
            float f11 = fArr[2];
            if (f11 < 1.0f && f11 > 0.0f) {
                fArr[0] = j9.a(fArr[0] + 0.22f, 0.0f, 1.0f);
                fArr[1] = j9.a(fArr[1] - 0.35f, 0.0f, 1.0f);
                fArr[2] = j9.a(fArr[2] - 0.65f, 0.0f, 1.0f);
                return Color.HSVToColor(90, fArr);
            }
        }
        fArr[0] = f10;
        fArr[1] = 0.2f;
        fArr[2] = j9.a(fArr[2] - 0.65f, 0.0f, 1.0f);
        return Color.HSVToColor(90, fArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r4 < 85.0f) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(int i7, int i10) {
        float[] fArr = this.A;
        Color.colorToHSV(i10, fArr);
        float f10 = fArr[0];
        Color.colorToHSV(i7, fArr);
        float f11 = fArr[1];
        if (f11 > 0.0f) {
            float f12 = fArr[0];
            if (f12 > 45.0f) {
            }
            fArr[1] = org.telegram.messenger.camera.q.z(f11, fArr[2] <= 0.85f ? 0.25f : 0.45f, 1.0f, 0.0f);
            fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.15f));
            return Color.HSVToColor(80, fArr);
        }
        fArr[0] = f10;
        fArr[1] = org.telegram.messenger.camera.q.z(f11, fArr[2] <= 0.85f ? 0.25f : 0.45f, 1.0f, 0.0f);
        fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.15f));
        return Color.HSVToColor(80, fArr);
    }
}
