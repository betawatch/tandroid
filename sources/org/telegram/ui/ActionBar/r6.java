package org.telegram.ui.ActionBar;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.io.File;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r6 {
    public int a;
    public s6 b;
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
    public m6 y;
    public boolean z;
    public int n = 45;
    public String o = "";
    public final float[] A = new float[3];

    public static int a(SparseIntArray sparseIntArray, int... iArr) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            if (sparseIntArray.indexOfKey(iArr[i14]) >= 0) {
                try {
                    int i15 = sparseIntArray.get(iArr[i14]);
                    i11 += Color.red(i15);
                    i12 += Color.green(i15);
                    i13 += Color.blue(i15);
                    i10++;
                } catch (Exception unused) {
                }
            }
        }
        if (i10 == 0) {
            return 0;
        }
        return Color.argb(zs.e4, i11 / i10, i12 / i10, i13 / i10);
    }

    public static int c(SparseIntArray sparseIntArray, int i10) {
        int i11;
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey < 0 && (i11 = t6.fm.get(i10, -1)) >= 0) {
            indexOfKey = sparseIntArray.indexOfKey(i11);
        }
        return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : t6.em[i10];
    }

    public static void h(SparseIntArray sparseIntArray) {
        for (int i10 = t6.nb; i10 < t6.ub; i10++) {
            sparseIntArray.delete(i10);
            sparseIntArray.put(i10, t6.em[i10]);
        }
        for (int i11 = t6.vb; i11 < t6.Hc; i11++) {
            sparseIntArray.delete(i11);
            sparseIntArray.put(i11, t6.em[i11]);
        }
        for (int i12 = t6.Ic; i12 < t6.Qc; i12++) {
            sparseIntArray.delete(i12);
            sparseIntArray.put(i12, t6.em[i12]);
        }
    }

    public final int b(int i10, int i11) {
        float[] fArr = this.A;
        Color.colorToHSV(i11, fArr);
        float f7 = fArr[0];
        Color.colorToHSV(i10, fArr);
        float f10 = fArr[1];
        if (f10 <= 0.0f) {
            fArr[0] = f7;
        }
        fArr[1] = z20.z(f10, 0.6f, 1.0f, 0.0f);
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
        float f7;
        boolean a2;
        int i10;
        char c10;
        int i11;
        int i12;
        int valueAt2;
        int valueAt3;
        TLRPC.TL_theme tL_theme;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float[] P0 = t6.P0(1);
        float[] P02 = t6.P0(2);
        Color.colorToHSV(this.b.X, P0);
        Color.colorToHSV(this.c, P02);
        boolean q6 = this.b.q();
        int i20 = 0;
        if (this.c != this.b.X || this.d != 0) {
            int i21 = 0;
            while (true) {
                int[] iArr = t6.em;
                if (i21 >= iArr.length) {
                    break;
                }
                if (!t6.gm.contains(Integer.valueOf(i21))) {
                    int indexOfKey = sparseIntArray.indexOfKey(i21);
                    if (indexOfKey < 0) {
                        int i22 = t6.fm.get(i21, -1);
                        if (i22 < 0 || sparseIntArray.indexOfKey(i22) < 0) {
                            valueAt = iArr[i21];
                        }
                    } else {
                        valueAt = sparseIntArray.valueAt(indexOfKey);
                    }
                    int E = t6.E(P0, P02, valueAt, q6, valueAt);
                    if (E != valueAt) {
                        sparseIntArray2.put(i21, E);
                    }
                }
                i21++;
            }
        }
        int i23 = this.e;
        if ((i23 == 0 && this.c == 0) || this.f == 0) {
            i11 = 1;
            c10 = 2;
            f7 = 0.705f;
            i10 = 0;
        } else {
            if (i23 == 0) {
                i23 = this.c;
            }
            int i24 = t6.ob;
            int i25 = sparseIntArray.get(i24);
            if (i25 == 0) {
                i25 = t6.em[i24];
            }
            int F0 = org.telegram.messenger.i0.F0(i23, t6.E(P0, P02, i25, q6, i25));
            int i26 = 1;
            int F02 = org.telegram.messenger.i0.F0(i23, this.f);
            char c11 = 2;
            if (this.g != 0) {
                f7 = 0.705f;
                int w02 = org.telegram.messenger.i0.w0(org.telegram.messenger.i0.w0(this.e, this.f), this.g);
                int i27 = this.h;
                if (i27 != 0) {
                    w02 = org.telegram.messenger.i0.w0(w02, i27);
                }
                a2 = org.telegram.messenger.i0.B(w02) > 0.705f;
            } else {
                f7 = 0.705f;
                a2 = t6.a(this.e, this.f);
            }
            i10 = (!a2 || F0 > 35000 || F02 > 35000) ? 0 : 1;
            float[] P03 = t6.P0(3);
            float[] P04 = t6.P0(4);
            Color.colorToHSV(i25, P03);
            Color.colorToHSV(i23, P04);
            float min = Math.min((P03[1] * 1.5f) / P0[1], 1.0f);
            P03[0] = (P04[0] - P03[0]) + P0[0];
            P03[1] = (P04[1] * P0[1]) / P03[1];
            float f10 = ((((P04[2] / P03[2]) + min) - 1.0f) * P0[2]) / min;
            P03[2] = f10;
            i11 = i26;
            c10 = c11;
            if (f10 >= 0.3f) {
                i23 = Color.HSVToColor(zs.e4, P03);
                i11 = i26;
                c10 = c11;
            }
        }
        int i28 = (i23 == 0 || (((i18 = this.b.X) == 0 || i23 == i18) && ((i19 = this.c) == 0 || i19 == i23))) ? 0 : i11;
        if (i28 == 0 && this.d == 0) {
            i12 = 0;
        } else {
            int i29 = this.d;
            if (i29 != 0) {
                Color.colorToHSV(i29, P02);
            } else {
                Color.colorToHSV(i23, P02);
            }
            for (int i30 = t6.vb; i30 < t6.Hc; i30++) {
                int indexOfKey2 = sparseIntArray.indexOfKey(i30);
                if (indexOfKey2 < 0) {
                    int i31 = t6.fm.get(i30, -1);
                    if (i31 < 0 || sparseIntArray.get(i31, -1) < 0) {
                        valueAt3 = t6.em[i30];
                    }
                } else {
                    valueAt3 = sparseIntArray.valueAt(indexOfKey2);
                }
                int E2 = t6.E(P0, P02, valueAt3, q6, valueAt3);
                if (E2 != valueAt3) {
                    sparseIntArray2.put(i30, E2);
                }
            }
            int[] iArr2 = t6.vl;
            int length = iArr2.length;
            int i32 = 0;
            while (i32 < length) {
                int i33 = i20;
                int i34 = iArr2[i32];
                int indexOfKey3 = sparseIntArray.indexOfKey(i34);
                int valueAt4 = indexOfKey3 < 0 ? t6.em[i34] : sparseIntArray.valueAt(indexOfKey3);
                int E3 = t6.E(P0, P02, valueAt4, q6, valueAt4);
                if (E3 != valueAt4) {
                    sparseIntArray2.put(i34, E3);
                }
                i32++;
                i20 = i33;
            }
            i12 = i20;
            if (i28 != 0) {
                Color.colorToHSV(i23, P02);
                for (int i35 = t6.nb; i35 < t6.ub; i35++) {
                    int indexOfKey4 = sparseIntArray.indexOfKey(i35);
                    if (indexOfKey4 < 0) {
                        int i36 = t6.fm.get(i35, -1);
                        if (i36 < 0 || sparseIntArray.get(i36, -1) < 0) {
                            valueAt2 = t6.em[i35];
                        }
                    } else {
                        valueAt2 = sparseIntArray.valueAt(indexOfKey4);
                    }
                    int E4 = t6.E(P0, P02, valueAt2, q6, valueAt2);
                    if (E4 != valueAt2) {
                        sparseIntArray2.put(i35, E4);
                    }
                }
            }
        }
        if (i10 == 0 && (i13 = this.f) != 0) {
            if (this.g != 0) {
                int w03 = org.telegram.messenger.i0.w0(org.telegram.messenger.i0.w0(this.e, i13), this.g);
                int i37 = this.h;
                if (i37 != 0) {
                    w03 = org.telegram.messenger.i0.w0(w03, i37);
                }
                i14 = org.telegram.messenger.i0.B(w03) > f7 ? i11 : i12;
            } else {
                i14 = t6.a(this.e, i13);
            }
            if (i14 != 0) {
                i17 = -14606047;
                i15 = -11184811;
                i16 = 1291845632;
            } else {
                i15 = -1118482;
                i16 = 1308622847;
                i17 = -1;
            }
            if (this.d == 0) {
                sparseIntArray2.put(t6.ec, i16);
                sparseIntArray2.put(t6.fc, i16);
                sparseIntArray2.put(t6.kc, i16);
                sparseIntArray2.put(t6.lc, i16);
                sparseIntArray2.put(t6.mc, i16);
                sparseIntArray2.put(t6.nc, i17);
                sparseIntArray2.put(t6.oc, i16);
                sparseIntArray2.put(t6.pc, i16);
                sparseIntArray2.put(t6.qc, i17);
                sparseIntArray2.put(t6.Vc, i17);
                sparseIntArray2.put(t6.Mb, i17);
                sparseIntArray2.put(t6.Nb, i17);
                sparseIntArray2.put(t6.Ob, i17);
                sparseIntArray2.put(t6.Pb, i17);
                sparseIntArray2.put(t6.Qb, i17);
                sparseIntArray2.put(t6.Ub, i17);
                sparseIntArray2.put(t6.Vb, i17);
                sparseIntArray2.put(t6.Jb, i17);
                sparseIntArray2.put(t6.Kb, i17);
                sparseIntArray2.put(t6.Lb, i17);
                sparseIntArray2.put(t6.Fb, i17);
                sparseIntArray2.put(t6.Gb, i17);
                sparseIntArray2.put(t6.hc, i17);
                sparseIntArray2.put(t6.tc, i17);
                sparseIntArray2.put(t6.Wb, i17);
                sparseIntArray2.put(t6.Zb, i17);
                sparseIntArray2.put(t6.ac, i17);
                sparseIntArray2.put(t6.xb, i17);
                sparseIntArray2.put(t6.yb, i17);
                sparseIntArray2.put(t6.zb, i17);
                sparseIntArray2.put(t6.Ab, i17);
                sparseIntArray2.put(t6.Bb, i17);
                sparseIntArray2.put(t6.Cb, i17);
                sparseIntArray2.put(t6.Hb, i17);
                sparseIntArray2.put(t6.Ib, i17);
                sparseIntArray2.put(t6.gc, i17);
                sparseIntArray2.put(t6.bc, i17);
                sparseIntArray2.put(t6.ic, i15);
                sparseIntArray2.put(t6.jc, i15);
                sparseIntArray2.put(t6.Xb, i15);
                sparseIntArray2.put(t6.Yb, i15);
                sparseIntArray2.put(t6.uc, i15);
                sparseIntArray2.put(t6.vc, i15);
                sparseIntArray2.put(t6.yc, i15);
                sparseIntArray2.put(t6.zc, i15);
                sparseIntArray2.put(t6.Bc, i17);
                sparseIntArray2.put(t6.Cc, i17);
                sparseIntArray2.put(t6.rc, this.e);
                sparseIntArray2.put(t6.sc, this.e);
                sparseIntArray2.put(t6.Db, this.e);
                sparseIntArray2.put(t6.Eb, this.e);
            }
            sparseIntArray2.put(t6.Rb, i17);
            sparseIntArray2.put(t6.Sb, i17);
            sparseIntArray2.put(t6.Tb, i17);
            sparseIntArray2.put(t6.Tc, i17);
        }
        if (i10 != 0) {
            int i38 = t6.Bc;
            if (org.telegram.messenger.i0.F0(-1, sparseIntArray2.indexOfKey(i38) >= 0 ? sparseIntArray2.get(i38) : i12) < 5000) {
                i10 = i12;
            }
        }
        int i39 = this.e;
        if (i39 != 0 && this.f != 0) {
            sparseIntArray2.put(t6.ob, i39);
            sparseIntArray2.put(t6.rb, this.f);
            int i40 = this.g;
            if (i40 != 0) {
                sparseIntArray2.put(t6.sb, i40);
                int i41 = this.h;
                if (i41 != 0) {
                    sparseIntArray2.put(t6.tb, i41);
                }
            }
            sparseIntArray2.put(t6.Oc, this.i ? 1 : 0);
        }
        long j10 = this.j;
        int i42 = (int) j10;
        if (i42 != 0) {
            sparseIntArray2.put(t6.Be, i42);
        } else if (j10 != 0) {
            sparseIntArray2.delete(t6.Be);
        }
        long j11 = this.k;
        int i43 = (int) j11;
        if (i43 != 0) {
            sparseIntArray2.put(t6.Ce, i43);
        } else if (j11 != 0) {
            sparseIntArray2.delete(t6.Ce);
        }
        long j12 = this.l;
        int i44 = (int) j12;
        if (i44 != 0) {
            sparseIntArray2.put(t6.De, i44);
        } else if (j12 != 0) {
            sparseIntArray2.delete(t6.De);
        }
        long j13 = this.m;
        int i45 = (int) j13;
        if (i45 != 0) {
            sparseIntArray2.put(t6.Ee, i45);
        } else if (j13 != 0) {
            sparseIntArray2.delete(t6.Ee);
        }
        int i46 = this.n;
        if (i46 != 45) {
            sparseIntArray2.put(t6.Fe, i46);
        }
        int i47 = t6.ob;
        int i48 = sparseIntArray2.get(i47);
        if (i48 == 0) {
            i48 = t6.y0(sparseIntArray2, i47, null);
        }
        int i49 = t6.ra;
        int i50 = sparseIntArray2.get(i49);
        if (i50 == 0) {
            i50 = t6.y0(sparseIntArray2, i49, null);
        }
        if (this.c != this.b.X || this.e != 0 || ((tL_theme = this.r) != null && tL_theme.emoticon != null)) {
            int c12 = c(sparseIntArray2, t6.Ob);
            sparseIntArray2.put(t6.La, (-16777216) | i48);
            sparseIntArray2.put(t6.Ma, c(sparseIntArray2, t6.gc));
            sparseIntArray2.put(t6.Na, c(sparseIntArray2, t6.zb));
            sparseIntArray2.put(t6.Pa, c12);
            sparseIntArray2.put(t6.Qa, c(sparseIntArray2, t6.Qb));
            sparseIntArray2.put(t6.Oa, t6.r1(0.1f, c12));
            sparseIntArray2.put(t6.Ya, c(sparseIntArray2, t6.tc));
            sparseIntArray2.put(t6.Za, c(sparseIntArray2, t6.Bc));
            sparseIntArray2.put(t6.ab, c(sparseIntArray2, t6.Db));
            sparseIntArray2.put(t6.bb, c(sparseIntArray2, t6.uc));
            sparseIntArray2.put(t6.cb, c(sparseIntArray2, t6.wc));
            sparseIntArray2.put(t6.db, c(sparseIntArray2, t6.il));
        }
        TLRPC.TL_theme tL_theme2 = this.r;
        if (tL_theme2 != null && tL_theme2.emoticon != null && !q6) {
            sparseIntArray2.delete(t6.vd);
            int a10 = a(sparseIntArray2, t6.Ce, t6.De, t6.Ee);
            if (a10 == 0) {
                a10 = a(sparseIntArray2, t6.Be);
            }
            if (a10 == 0) {
                a10 = this.c;
            }
            int b10 = b(i48, a10);
            sparseIntArray2.put(t6.Mc, b10);
            sparseIntArray2.put(t6.Pc, b10);
            sparseIntArray2.put(t6.pb, t6.w(i48, b10));
            int b11 = b(i50, this.c);
            sparseIntArray2.put(t6.sa, b11);
            sparseIntArray2.put(t6.Rc, t6.w(i50, b11));
        }
        float[] fArr = this.A;
        if (!q6) {
            sparseIntArray2.put(t6.ig, i(i50, this.c));
            sparseIntArray2.put(t6.Jc, i(i48, this.c));
            int i51 = t6.Kc;
            Color.colorToHSV(this.c, fArr);
            float f11 = fArr[i12];
            Color.colorToHSV(i48, fArr);
            float f12 = fArr[i11];
            if (f12 > 0.0f) {
                float f13 = fArr[i12];
                if (f13 > 45.0f) {
                }
                fArr[i11] = z20.z(f12, 0.6f, 1.0f, 0.0f);
                float f14 = fArr[c10];
                fArr[c10] = Math.max(0.0f, Math.min(1.0f, f14 - (f14 <= 0.7f ? 0.25f : 0.125f)));
                sparseIntArray2.put(i51, t6.w(i48, Color.HSVToColor(zs.e4, fArr)));
            }
            fArr[i12] = f11;
            fArr[i11] = z20.z(f12, 0.6f, 1.0f, 0.0f);
            float f142 = fArr[c10];
            fArr[c10] = Math.max(0.0f, Math.min(1.0f, f142 - (f142 <= 0.7f ? 0.25f : 0.125f)));
            sparseIntArray2.put(i51, t6.w(i48, Color.HSVToColor(zs.e4, fArr)));
        }
        Color.colorToHSV(t6.y0(sparseIntArray2, t6.n6, null), fArr);
        float f15 = fArr[i12];
        sparseIntArray2.put(t6.Lc, g(i48, f15, q6));
        sparseIntArray2.put(t6.kg, g(i50, f15, q6));
        int i52 = t6.Uc;
        int i53 = sparseIntArray2.get(i52);
        if (i53 == 0) {
            i53 = t6.y0(sparseIntArray2, i52, null);
        }
        int i54 = t6.Vc;
        int i55 = sparseIntArray2.get(i54);
        if (i55 == 0) {
            i55 = t6.y0(sparseIntArray2, i54, null);
        }
        sparseIntArray2.put(t6.ze, f(i53, i50, q6));
        sparseIntArray2.put(t6.Ac, f(i55, i48, q6));
        int i56 = t6.G8;
        int i57 = sparseIntArray2.get(i56);
        if (i57 == 0) {
            i57 = t6.y0(sparseIntArray2, i56, null);
        }
        int i58 = i12;
        sparseIntArray2.put(t6.H8, Color.argb(Color.alpha(i57), Math.max(i58, Color.red(i57) - 10), Math.max(i58, Color.green(i57) - 10), Math.max(i58, Color.blue(i57) - 10)));
        int i59 = 64;
        if (q6) {
            int i60 = t6.rb;
            if (sparseIntArray2.get(i60) != 0) {
                Color.colorToHSV(a(sparseIntArray2, i60, t6.sb, t6.tb), fArr);
                fArr[i11] = Utilities.i(fArr[i11] + 0.1f, 1.0f, 0.0f);
                fArr[c10] = Utilities.i(fArr[c10] - 0.8f, 1.0f, 0.0f);
                sparseIntArray2.put(t6.el, Color.HSVToColor(64, fArr));
                t6.g(sparseIntArray, sparseIntArray2, q6);
                t6.f(sparseIntArray, sparseIntArray2, q6);
                return i10 ^ 1;
            }
        }
        int i61 = t6.el;
        Color.colorToHSV(i48, fArr);
        if (q6) {
            fArr[i11] = Utilities.i(fArr[i11] - 0.08f, 1.0f, 0.0f);
            fArr[c10] = 0.03f;
        } else {
            float f16 = fArr[i11];
            if (f16 > 0.0f) {
                float f17 = fArr[c10];
                if (f17 < 1.0f && f17 > 0.0f) {
                    fArr[i11] = z20.z(f16, 0.28f, 1.0f, 0.0f);
                    fArr[c10] = z20.z(fArr[c10], -0.1f, 1.0f, 0.0f);
                    i59 = 32;
                }
            }
            fArr[c10] = z20.z(fArr[c10], -0.2f, 1.0f, 0.0f);
            i59 = 32;
        }
        sparseIntArray2.put(i61, Color.HSVToColor(i59, fArr));
        t6.g(sparseIntArray, sparseIntArray2, q6);
        t6.f(sparseIntArray, sparseIntArray2, q6);
        return i10 ^ 1;
    }

    public final File e() {
        if (this.a < 100) {
            if (TextUtils.isEmpty(this.o)) {
                return null;
            }
            File h = org.telegram.messenger.w0.h();
            Locale locale = Locale.US;
            return new File(h, this.b.m() + "_" + this.a + "_" + this.o + "_v5.jpg");
        }
        if (TextUtils.isEmpty(this.o)) {
            return null;
        }
        File h10 = org.telegram.messenger.w0.h();
        Locale locale2 = Locale.US;
        return new File(h10, this.b.m() + "_" + this.a + "_" + this.o + "_v8_debug.jpg");
    }

    public final int f(int i10, int i11, boolean z10) {
        int f7 = i0.b.f(0.25f, i10, i11);
        float[] fArr = this.A;
        Color.colorToHSV(f7, fArr);
        fArr[1] = Math.max(0.0f, Math.min(1.0f, fArr[1] - 0.1f));
        fArr[2] = z20.z(fArr[2], z10 ? 0.1f : 0.0f, 1.0f, 0.0f);
        return Color.HSVToColor(51, fArr);
    }

    public final int g(int i10, float f7, boolean z10) {
        if (z10) {
            return 520093695;
        }
        float[] fArr = this.A;
        Color.colorToHSV(i10, fArr);
        if (fArr[1] > 0.0f) {
            float f10 = fArr[2];
            if (f10 < 1.0f && f10 > 0.0f) {
                fArr[0] = w7.u.a(fArr[0] + 0.22f, 0.0f, 1.0f);
                fArr[1] = w7.u.a(fArr[1] - 0.35f, 0.0f, 1.0f);
                fArr[2] = w7.u.a(fArr[2] - 0.65f, 0.0f, 1.0f);
                return Color.HSVToColor(90, fArr);
            }
        }
        fArr[0] = f7;
        fArr[1] = 0.2f;
        fArr[2] = w7.u.a(fArr[2] - 0.65f, 0.0f, 1.0f);
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
    public final int i(int i10, int i11) {
        float[] fArr = this.A;
        Color.colorToHSV(i11, fArr);
        float f7 = fArr[0];
        Color.colorToHSV(i10, fArr);
        float f10 = fArr[1];
        if (f10 > 0.0f) {
            float f11 = fArr[0];
            if (f11 > 45.0f) {
            }
            fArr[1] = z20.z(f10, fArr[2] <= 0.85f ? 0.25f : 0.45f, 1.0f, 0.0f);
            fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.15f));
            return Color.HSVToColor(80, fArr);
        }
        fArr[0] = f7;
        fArr[1] = z20.z(f10, fArr[2] <= 0.85f ? 0.25f : 0.45f, 1.0f, 0.0f);
        fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.15f));
        return Color.HSVToColor(80, fArr);
    }
}
