package org.telegram.ui.ActionBar;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.io.File;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e6 {
    public int a;
    public f6 b;
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
    public z5 y;
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
        return Color.argb(255, i11 / i10, i12 / i10, i13 / i10);
    }

    public static void g(SparseIntArray sparseIntArray) {
        for (int i10 = g6.za; i10 < g6.Ga; i10++) {
            sparseIntArray.delete(i10);
            sparseIntArray.put(i10, g6.nl[i10]);
        }
        for (int i11 = g6.Ha; i11 < g6.Tb; i11++) {
            sparseIntArray.delete(i11);
            sparseIntArray.put(i11, g6.nl[i11]);
        }
        for (int i12 = g6.Ub; i12 < g6.cc; i12++) {
            sparseIntArray.delete(i12);
            sparseIntArray.put(i12, g6.nl[i12]);
        }
    }

    public final int b(int i10, int i11) {
        float[] fArr = this.A;
        Color.colorToHSV(i11, fArr);
        float f9 = fArr[0];
        Color.colorToHSV(i10, fArr);
        float f10 = fArr[1];
        if (f10 <= 0.0f) {
            fArr[0] = f9;
        }
        fArr[1] = Math.max(0.0f, Math.min(1.0f, f10 + 0.6f));
        fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.05f));
        return Color.HSVToColor(30, fArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x049c, code lost:
    
        if (r13 < 85.0f) goto L209;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        int valueAt;
        char c3;
        char c6;
        float f9;
        boolean a2;
        boolean z10;
        int valueAt2;
        int valueAt3;
        int i10;
        boolean a10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float[] M0 = g6.M0(1);
        float[] M02 = g6.M0(2);
        Color.colorToHSV(this.b.T, M0);
        Color.colorToHSV(this.c, M02);
        boolean q6 = this.b.q();
        if (this.c != this.b.T || this.d != 0) {
            int i16 = 0;
            while (true) {
                int[] iArr = g6.nl;
                if (i16 >= iArr.length) {
                    break;
                }
                if (!g6.pl.contains(Integer.valueOf(i16))) {
                    int indexOfKey = sparseIntArray.indexOfKey(i16);
                    if (indexOfKey < 0) {
                        int i17 = g6.ol.get(i16, -1);
                        if (i17 < 0 || sparseIntArray.indexOfKey(i17) < 0) {
                            valueAt = iArr[i16];
                        }
                    } else {
                        valueAt = sparseIntArray.valueAt(indexOfKey);
                    }
                    int D = g6.D(M0, M02, valueAt, q6, valueAt);
                    if (D != valueAt) {
                        sparseIntArray2.put(i16, D);
                    }
                }
                i16++;
            }
        }
        int i18 = this.e;
        if ((i18 == 0 && this.c == 0) || this.f == 0) {
            c3 = 1;
            c6 = 2;
            f9 = 0.705f;
            z10 = false;
        } else {
            if (i18 == 0) {
                i18 = this.c;
            }
            int i19 = g6.Aa;
            int i20 = sparseIntArray.get(i19);
            if (i20 == 0) {
                i20 = g6.nl[i19];
            }
            int colorDistance = AndroidUtilities.getColorDistance(i18, g6.D(M0, M02, i20, q6, i20));
            c3 = 1;
            int colorDistance2 = AndroidUtilities.getColorDistance(i18, this.f);
            c6 = 2;
            if (this.g != 0) {
                f9 = 0.705f;
                int averageColor = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(this.e, this.f), this.g);
                int i21 = this.h;
                if (i21 != 0) {
                    averageColor = AndroidUtilities.getAverageColor(averageColor, i21);
                }
                a2 = AndroidUtilities.computePerceivedBrightness(averageColor) > 0.705f;
            } else {
                f9 = 0.705f;
                a2 = g6.a(this.e, this.f);
            }
            z10 = a2 && colorDistance <= 35000 && colorDistance2 <= 35000;
            float[] M03 = g6.M0(3);
            float[] M04 = g6.M0(4);
            Color.colorToHSV(i20, M03);
            Color.colorToHSV(i18, M04);
            float min = Math.min((M03[1] * 1.5f) / M0[1], 1.0f);
            M03[0] = (M04[0] - M03[0]) + M0[0];
            M03[1] = (M04[1] * M0[1]) / M03[1];
            float f10 = ((((M04[2] / M03[2]) + min) - 1.0f) * M0[2]) / min;
            M03[2] = f10;
            if (f10 >= 0.3f) {
                i18 = Color.HSVToColor(255, M03);
            }
        }
        boolean z11 = (i18 == 0 || (((i14 = this.b.T) == 0 || i18 == i14) && ((i15 = this.c) == 0 || i15 == i18))) ? false : true;
        if (z11 || this.d != 0) {
            int i22 = this.d;
            if (i22 != 0) {
                Color.colorToHSV(i22, M02);
            } else {
                Color.colorToHSV(i18, M02);
            }
            for (int i23 = g6.Ha; i23 < g6.Tb; i23++) {
                int indexOfKey2 = sparseIntArray.indexOfKey(i23);
                if (indexOfKey2 < 0) {
                    int i24 = g6.ol.get(i23, -1);
                    if (i24 < 0 || sparseIntArray.get(i24, -1) < 0) {
                        valueAt3 = g6.nl[i23];
                    }
                } else {
                    valueAt3 = sparseIntArray.valueAt(indexOfKey2);
                }
                int D2 = g6.D(M0, M02, valueAt3, q6, valueAt3);
                if (D2 != valueAt3) {
                    sparseIntArray2.put(i23, D2);
                }
            }
            for (int i25 : g6.Hk) {
                int indexOfKey3 = sparseIntArray.indexOfKey(i25);
                int valueAt4 = indexOfKey3 < 0 ? g6.nl[i25] : sparseIntArray.valueAt(indexOfKey3);
                int D3 = g6.D(M0, M02, valueAt4, q6, valueAt4);
                if (D3 != valueAt4) {
                    sparseIntArray2.put(i25, D3);
                }
            }
            if (z11) {
                Color.colorToHSV(i18, M02);
                for (int i26 = g6.za; i26 < g6.Ga; i26++) {
                    int indexOfKey4 = sparseIntArray.indexOfKey(i26);
                    if (indexOfKey4 < 0) {
                        int i27 = g6.ol.get(i26, -1);
                        if (i27 < 0 || sparseIntArray.get(i27, -1) < 0) {
                            valueAt2 = g6.nl[i26];
                        }
                    } else {
                        valueAt2 = sparseIntArray.valueAt(indexOfKey4);
                    }
                    int D4 = g6.D(M0, M02, valueAt2, q6, valueAt2);
                    if (D4 != valueAt2) {
                        sparseIntArray2.put(i26, D4);
                    }
                }
            }
        }
        if (!z10 && (i10 = this.f) != 0) {
            if (this.g != 0) {
                int averageColor2 = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(this.e, i10), this.g);
                int i28 = this.h;
                if (i28 != 0) {
                    averageColor2 = AndroidUtilities.getAverageColor(averageColor2, i28);
                }
                a10 = AndroidUtilities.computePerceivedBrightness(averageColor2) > f9;
            } else {
                a10 = g6.a(this.e, i10);
            }
            if (a10) {
                i13 = -14606047;
                i11 = -11184811;
                i12 = 1291845632;
            } else {
                i11 = -1118482;
                i12 = 1308622847;
                i13 = -1;
            }
            if (this.d == 0) {
                sparseIntArray2.put(g6.qb, i12);
                sparseIntArray2.put(g6.rb, i12);
                sparseIntArray2.put(g6.wb, i12);
                sparseIntArray2.put(g6.xb, i12);
                sparseIntArray2.put(g6.yb, i12);
                sparseIntArray2.put(g6.zb, i13);
                sparseIntArray2.put(g6.Ab, i12);
                sparseIntArray2.put(g6.Bb, i12);
                sparseIntArray2.put(g6.Cb, i13);
                sparseIntArray2.put(g6.hc, i13);
                sparseIntArray2.put(g6.Ya, i13);
                sparseIntArray2.put(g6.Za, i13);
                sparseIntArray2.put(g6.ab, i13);
                sparseIntArray2.put(g6.bb, i13);
                sparseIntArray2.put(g6.cb, i13);
                sparseIntArray2.put(g6.gb, i13);
                sparseIntArray2.put(g6.hb, i13);
                sparseIntArray2.put(g6.Va, i13);
                sparseIntArray2.put(g6.Wa, i13);
                sparseIntArray2.put(g6.Xa, i13);
                sparseIntArray2.put(g6.Ra, i13);
                sparseIntArray2.put(g6.Sa, i13);
                sparseIntArray2.put(g6.tb, i13);
                sparseIntArray2.put(g6.Fb, i13);
                sparseIntArray2.put(g6.ib, i13);
                sparseIntArray2.put(g6.lb, i13);
                sparseIntArray2.put(g6.mb, i13);
                sparseIntArray2.put(g6.Ja, i13);
                sparseIntArray2.put(g6.Ka, i13);
                sparseIntArray2.put(g6.La, i13);
                sparseIntArray2.put(g6.Ma, i13);
                sparseIntArray2.put(g6.Na, i13);
                sparseIntArray2.put(g6.Oa, i13);
                sparseIntArray2.put(g6.Ta, i13);
                sparseIntArray2.put(g6.Ua, i13);
                sparseIntArray2.put(g6.sb, i13);
                sparseIntArray2.put(g6.nb, i13);
                sparseIntArray2.put(g6.ub, i11);
                sparseIntArray2.put(g6.vb, i11);
                sparseIntArray2.put(g6.jb, i11);
                sparseIntArray2.put(g6.kb, i11);
                sparseIntArray2.put(g6.Gb, i11);
                sparseIntArray2.put(g6.Hb, i11);
                sparseIntArray2.put(g6.Kb, i11);
                sparseIntArray2.put(g6.Lb, i11);
                sparseIntArray2.put(g6.Nb, i13);
                sparseIntArray2.put(g6.Ob, i13);
                sparseIntArray2.put(g6.Db, this.e);
                sparseIntArray2.put(g6.Eb, this.e);
                sparseIntArray2.put(g6.Pa, this.e);
                sparseIntArray2.put(g6.Qa, this.e);
            }
            sparseIntArray2.put(g6.db, i13);
            sparseIntArray2.put(g6.eb, i13);
            sparseIntArray2.put(g6.fb, i13);
            sparseIntArray2.put(g6.fc, i13);
        }
        if (z10) {
            int i29 = g6.Nb;
            if (AndroidUtilities.getColorDistance(-1, sparseIntArray2.indexOfKey(i29) >= 0 ? sparseIntArray2.get(i29) : 0) < 5000) {
                z10 = false;
            }
        }
        int i30 = this.e;
        if (i30 != 0 && this.f != 0) {
            sparseIntArray2.put(g6.Aa, i30);
            sparseIntArray2.put(g6.Da, this.f);
            int i31 = this.g;
            if (i31 != 0) {
                sparseIntArray2.put(g6.Ea, i31);
                int i32 = this.h;
                if (i32 != 0) {
                    sparseIntArray2.put(g6.Fa, i32);
                }
            }
            sparseIntArray2.put(g6.ac, this.i ? 1 : 0);
        }
        long j10 = this.j;
        int i33 = (int) j10;
        if (i33 != 0) {
            sparseIntArray2.put(g6.Nd, i33);
        } else if (j10 != 0) {
            sparseIntArray2.delete(g6.Nd);
        }
        long j11 = this.k;
        int i34 = (int) j11;
        if (i34 != 0) {
            sparseIntArray2.put(g6.Od, i34);
        } else if (j11 != 0) {
            sparseIntArray2.delete(g6.Od);
        }
        long j12 = this.l;
        int i35 = (int) j12;
        if (i35 != 0) {
            sparseIntArray2.put(g6.Pd, i35);
        } else if (j12 != 0) {
            sparseIntArray2.delete(g6.Pd);
        }
        long j13 = this.m;
        int i36 = (int) j13;
        if (i36 != 0) {
            sparseIntArray2.put(g6.Qd, i36);
        } else if (j13 != 0) {
            sparseIntArray2.delete(g6.Qd);
        }
        int i37 = this.n;
        if (i37 != 45) {
            sparseIntArray2.put(g6.Rd, i37);
        }
        int i38 = g6.Aa;
        int i39 = sparseIntArray2.get(i38);
        if (i39 == 0) {
            i39 = g6.w0(null, i38, false);
        }
        int i40 = g6.ra;
        int i41 = sparseIntArray2.get(i40);
        if (i41 == 0) {
            i41 = g6.w0(null, i40, false);
        }
        TLRPC.TL_theme tL_theme = this.r;
        if (tL_theme != null && tL_theme.emoticon != null && !q6) {
            sparseIntArray2.delete(g6.Hc);
            int a11 = a(sparseIntArray2, g6.Od, g6.Pd, g6.Qd);
            if (a11 == 0) {
                a11 = a(sparseIntArray2, g6.Nd);
            }
            if (a11 == 0) {
                a11 = this.c;
            }
            int b10 = b(i39, a11);
            sparseIntArray2.put(g6.Yb, b10);
            sparseIntArray2.put(g6.bc, b10);
            sparseIntArray2.put(g6.Ba, g6.v(i39, b10));
            int b11 = b(i41, this.c);
            sparseIntArray2.put(g6.sa, b11);
            sparseIntArray2.put(g6.dc, g6.v(i41, b11));
        }
        float[] fArr = this.A;
        if (!q6) {
            sparseIntArray2.put(g6.uf, h(i41, this.c));
            sparseIntArray2.put(g6.Vb, h(i39, this.c));
            int i42 = g6.Wb;
            Color.colorToHSV(this.c, fArr);
            float f11 = fArr[0];
            Color.colorToHSV(i39, fArr);
            float f12 = fArr[c3];
            if (f12 > 0.0f) {
                float f13 = fArr[0];
                if (f13 > 45.0f) {
                }
                fArr[c3] = Math.max(0.0f, Math.min(1.0f, f12 + 0.6f));
                float f14 = fArr[c6];
                fArr[c6] = Math.max(0.0f, Math.min(1.0f, f14 - (f14 <= 0.7f ? 0.25f : 0.125f)));
                sparseIntArray2.put(i42, g6.v(i39, Color.HSVToColor(255, fArr)));
            }
            fArr[0] = f11;
            fArr[c3] = Math.max(0.0f, Math.min(1.0f, f12 + 0.6f));
            float f142 = fArr[c6];
            fArr[c6] = Math.max(0.0f, Math.min(1.0f, f142 - (f142 <= 0.7f ? 0.25f : 0.125f)));
            sparseIntArray2.put(i42, g6.v(i39, Color.HSVToColor(255, fArr)));
        }
        Color.colorToHSV(g6.w0(null, g6.n6, false), fArr);
        float f15 = fArr[0];
        sparseIntArray2.put(g6.Xb, f(i39, f15, q6));
        sparseIntArray2.put(g6.wf, f(i41, f15, q6));
        int i43 = g6.gc;
        int i44 = sparseIntArray2.get(i43);
        if (i44 == 0) {
            i44 = g6.w0(null, i43, false);
        }
        int i45 = g6.hc;
        int i46 = sparseIntArray2.get(i45);
        if (i46 == 0) {
            i46 = g6.w0(null, i45, false);
        }
        sparseIntArray2.put(g6.Ld, e(i44, i41, q6));
        sparseIntArray2.put(g6.Mb, e(i46, i39, q6));
        int i47 = g6.G8;
        int i48 = sparseIntArray2.get(i47);
        if (i48 == 0) {
            i48 = g6.w0(null, i47, false);
        }
        sparseIntArray2.put(g6.H8, Color.argb(Color.alpha(i48), Math.max(0, Color.red(i48) - 10), Math.max(0, Color.green(i48) - 10), Math.max(0, Color.blue(i48) - 10)));
        int i49 = 64;
        if (q6) {
            int i50 = g6.Da;
            if (sparseIntArray2.get(i50) != 0) {
                Color.colorToHSV(a(sparseIntArray2, i50, g6.Ea, g6.Fa), fArr);
                fArr[c3] = Utilities.clamp(fArr[c3] + 0.1f, 1.0f, 0.0f);
                fArr[c6] = Utilities.clamp(fArr[c6] - 0.8f, 1.0f, 0.0f);
                sparseIntArray2.put(g6.qk, Color.HSVToColor(64, fArr));
                g6.g(sparseIntArray, sparseIntArray2, q6);
                g6.f(sparseIntArray, sparseIntArray2, q6);
                return !z10;
            }
        }
        int i51 = g6.qk;
        Color.colorToHSV(i39, fArr);
        if (q6) {
            fArr[c3] = Utilities.clamp(fArr[c3] - 0.08f, 1.0f, 0.0f);
            fArr[c6] = 0.03f;
        } else {
            float f16 = fArr[c3];
            if (f16 > 0.0f) {
                float f17 = fArr[c6];
                if (f17 < 1.0f && f17 > 0.0f) {
                    fArr[c3] = Math.max(0.0f, Math.min(1.0f, f16 + 0.28f));
                    fArr[c6] = Math.max(0.0f, Math.min(1.0f, fArr[c6] - 0.1f));
                    i49 = 32;
                }
            }
            fArr[c6] = Math.max(0.0f, Math.min(1.0f, fArr[c6] - 0.2f));
            i49 = 32;
        }
        sparseIntArray2.put(i51, Color.HSVToColor(i49, fArr));
        g6.g(sparseIntArray, sparseIntArray2, q6);
        g6.f(sparseIntArray, sparseIntArray2, q6);
        return !z10;
    }

    public final File d() {
        if (this.a < 100) {
            if (TextUtils.isEmpty(this.o)) {
                return null;
            }
            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
            Locale locale = Locale.US;
            return new File(filesDirFixed, this.b.m() + "_" + this.a + "_" + this.o + "_v5.jpg");
        }
        if (TextUtils.isEmpty(this.o)) {
            return null;
        }
        File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
        Locale locale2 = Locale.US;
        return new File(filesDirFixed2, this.b.m() + "_" + this.a + "_" + this.o + "_v8_debug.jpg");
    }

    public final int e(int i10, int i11, boolean z10) {
        int d = i0.a.d(0.25f, i10, i11);
        float[] fArr = this.A;
        Color.colorToHSV(d, fArr);
        fArr[1] = Math.max(0.0f, Math.min(1.0f, fArr[1] - 0.1f));
        fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] + (z10 ? 0.1f : 0.0f)));
        return Color.HSVToColor(51, fArr);
    }

    public final int f(int i10, float f9, boolean z10) {
        if (z10) {
            return 520093695;
        }
        float[] fArr = this.A;
        Color.colorToHSV(i10, fArr);
        if (fArr[1] > 0.0f) {
            float f10 = fArr[2];
            if (f10 < 1.0f && f10 > 0.0f) {
                fArr[0] = i7.w.a(fArr[0] + 0.22f, 0.0f, 1.0f);
                fArr[1] = i7.w.a(fArr[1] - 0.35f, 0.0f, 1.0f);
                fArr[2] = i7.w.a(fArr[2] - 0.65f, 0.0f, 1.0f);
                return Color.HSVToColor(90, fArr);
            }
        }
        fArr[0] = f9;
        fArr[1] = 0.2f;
        fArr[2] = i7.w.a(fArr[2] - 0.65f, 0.0f, 1.0f);
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
    public final int h(int i10, int i11) {
        float[] fArr = this.A;
        Color.colorToHSV(i11, fArr);
        float f9 = fArr[0];
        Color.colorToHSV(i10, fArr);
        float f10 = fArr[1];
        if (f10 > 0.0f) {
            float f11 = fArr[0];
            if (f11 > 45.0f) {
            }
            fArr[1] = Math.max(0.0f, Math.min(1.0f, f10 + (fArr[2] <= 0.85f ? 0.25f : 0.45f)));
            fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.15f));
            return Color.HSVToColor(80, fArr);
        }
        fArr[0] = f9;
        fArr[1] = Math.max(0.0f, Math.min(1.0f, f10 + (fArr[2] <= 0.85f ? 0.25f : 0.45f)));
        fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.15f));
        return Color.HSVToColor(80, fArr);
    }
}
