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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d6 {
    public int a;
    public e6 b;
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
    public y5 y;
    public boolean z;
    public int n = 45;
    public String o = "";
    public final float[] A = new float[3];

    public static int a(SparseIntArray sparseIntArray, int... iArr) {
        int i9 = 0;
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
                    i9++;
                } catch (Exception unused) {
                }
            }
        }
        if (i9 == 0) {
            return 0;
        }
        return Color.argb(255, i10 / i9, i11 / i9, i12 / i9);
    }

    public static void g(SparseIntArray sparseIntArray) {
        for (int i9 = f6.za; i9 < f6.Ga; i9++) {
            sparseIntArray.delete(i9);
            sparseIntArray.put(i9, f6.nl[i9]);
        }
        for (int i10 = f6.Ha; i10 < f6.Tb; i10++) {
            sparseIntArray.delete(i10);
            sparseIntArray.put(i10, f6.nl[i10]);
        }
        for (int i11 = f6.Ub; i11 < f6.cc; i11++) {
            sparseIntArray.delete(i11);
            sparseIntArray.put(i11, f6.nl[i11]);
        }
    }

    public final int b(int i9, int i10) {
        float[] fArr = this.A;
        Color.colorToHSV(i10, fArr);
        float f10 = fArr[0];
        Color.colorToHSV(i9, fArr);
        float f11 = fArr[1];
        if (f11 <= 0.0f) {
            fArr[0] = f10;
        }
        fArr[1] = Math.max(0.0f, Math.min(1.0f, f11 + 0.6f));
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
        char c10;
        char c11;
        float f10;
        boolean a2;
        boolean z10;
        int valueAt2;
        int valueAt3;
        int i9;
        boolean a3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float[] M0 = f6.M0(1);
        float[] M02 = f6.M0(2);
        Color.colorToHSV(this.b.T, M0);
        Color.colorToHSV(this.c, M02);
        boolean q10 = this.b.q();
        if (this.c != this.b.T || this.d != 0) {
            int i15 = 0;
            while (true) {
                int[] iArr = f6.nl;
                if (i15 >= iArr.length) {
                    break;
                }
                if (!f6.pl.contains(Integer.valueOf(i15))) {
                    int indexOfKey = sparseIntArray.indexOfKey(i15);
                    if (indexOfKey < 0) {
                        int i16 = f6.ol.get(i15, -1);
                        if (i16 < 0 || sparseIntArray.indexOfKey(i16) < 0) {
                            valueAt = iArr[i15];
                        }
                    } else {
                        valueAt = sparseIntArray.valueAt(indexOfKey);
                    }
                    int D = f6.D(M0, M02, valueAt, q10, valueAt);
                    if (D != valueAt) {
                        sparseIntArray2.put(i15, D);
                    }
                }
                i15++;
            }
        }
        int i17 = this.e;
        if ((i17 == 0 && this.c == 0) || this.f == 0) {
            c10 = 1;
            c11 = 2;
            f10 = 0.705f;
            z10 = false;
        } else {
            if (i17 == 0) {
                i17 = this.c;
            }
            int i18 = f6.Aa;
            int i19 = sparseIntArray.get(i18);
            if (i19 == 0) {
                i19 = f6.nl[i18];
            }
            int colorDistance = AndroidUtilities.getColorDistance(i17, f6.D(M0, M02, i19, q10, i19));
            c10 = 1;
            int colorDistance2 = AndroidUtilities.getColorDistance(i17, this.f);
            c11 = 2;
            if (this.g != 0) {
                f10 = 0.705f;
                int averageColor = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(this.e, this.f), this.g);
                int i20 = this.h;
                if (i20 != 0) {
                    averageColor = AndroidUtilities.getAverageColor(averageColor, i20);
                }
                a2 = AndroidUtilities.computePerceivedBrightness(averageColor) > 0.705f;
            } else {
                f10 = 0.705f;
                a2 = f6.a(this.e, this.f);
            }
            z10 = a2 && colorDistance <= 35000 && colorDistance2 <= 35000;
            float[] M03 = f6.M0(3);
            float[] M04 = f6.M0(4);
            Color.colorToHSV(i19, M03);
            Color.colorToHSV(i17, M04);
            float min = Math.min((M03[1] * 1.5f) / M0[1], 1.0f);
            M03[0] = (M04[0] - M03[0]) + M0[0];
            M03[1] = (M04[1] * M0[1]) / M03[1];
            float f11 = ((((M04[2] / M03[2]) + min) - 1.0f) * M0[2]) / min;
            M03[2] = f11;
            if (f11 >= 0.3f) {
                i17 = Color.HSVToColor(255, M03);
            }
        }
        boolean z11 = (i17 == 0 || (((i13 = this.b.T) == 0 || i17 == i13) && ((i14 = this.c) == 0 || i14 == i17))) ? false : true;
        if (z11 || this.d != 0) {
            int i21 = this.d;
            if (i21 != 0) {
                Color.colorToHSV(i21, M02);
            } else {
                Color.colorToHSV(i17, M02);
            }
            for (int i22 = f6.Ha; i22 < f6.Tb; i22++) {
                int indexOfKey2 = sparseIntArray.indexOfKey(i22);
                if (indexOfKey2 < 0) {
                    int i23 = f6.ol.get(i22, -1);
                    if (i23 < 0 || sparseIntArray.get(i23, -1) < 0) {
                        valueAt3 = f6.nl[i22];
                    }
                } else {
                    valueAt3 = sparseIntArray.valueAt(indexOfKey2);
                }
                int D2 = f6.D(M0, M02, valueAt3, q10, valueAt3);
                if (D2 != valueAt3) {
                    sparseIntArray2.put(i22, D2);
                }
            }
            for (int i24 : f6.Hk) {
                int indexOfKey3 = sparseIntArray.indexOfKey(i24);
                int valueAt4 = indexOfKey3 < 0 ? f6.nl[i24] : sparseIntArray.valueAt(indexOfKey3);
                int D3 = f6.D(M0, M02, valueAt4, q10, valueAt4);
                if (D3 != valueAt4) {
                    sparseIntArray2.put(i24, D3);
                }
            }
            if (z11) {
                Color.colorToHSV(i17, M02);
                for (int i25 = f6.za; i25 < f6.Ga; i25++) {
                    int indexOfKey4 = sparseIntArray.indexOfKey(i25);
                    if (indexOfKey4 < 0) {
                        int i26 = f6.ol.get(i25, -1);
                        if (i26 < 0 || sparseIntArray.get(i26, -1) < 0) {
                            valueAt2 = f6.nl[i25];
                        }
                    } else {
                        valueAt2 = sparseIntArray.valueAt(indexOfKey4);
                    }
                    int D4 = f6.D(M0, M02, valueAt2, q10, valueAt2);
                    if (D4 != valueAt2) {
                        sparseIntArray2.put(i25, D4);
                    }
                }
            }
        }
        if (!z10 && (i9 = this.f) != 0) {
            if (this.g != 0) {
                int averageColor2 = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(this.e, i9), this.g);
                int i27 = this.h;
                if (i27 != 0) {
                    averageColor2 = AndroidUtilities.getAverageColor(averageColor2, i27);
                }
                a3 = AndroidUtilities.computePerceivedBrightness(averageColor2) > f10;
            } else {
                a3 = f6.a(this.e, i9);
            }
            if (a3) {
                i12 = -14606047;
                i10 = -11184811;
                i11 = 1291845632;
            } else {
                i10 = -1118482;
                i11 = 1308622847;
                i12 = -1;
            }
            if (this.d == 0) {
                sparseIntArray2.put(f6.qb, i11);
                sparseIntArray2.put(f6.rb, i11);
                sparseIntArray2.put(f6.wb, i11);
                sparseIntArray2.put(f6.xb, i11);
                sparseIntArray2.put(f6.yb, i11);
                sparseIntArray2.put(f6.zb, i12);
                sparseIntArray2.put(f6.Ab, i11);
                sparseIntArray2.put(f6.Bb, i11);
                sparseIntArray2.put(f6.Cb, i12);
                sparseIntArray2.put(f6.hc, i12);
                sparseIntArray2.put(f6.Ya, i12);
                sparseIntArray2.put(f6.Za, i12);
                sparseIntArray2.put(f6.ab, i12);
                sparseIntArray2.put(f6.bb, i12);
                sparseIntArray2.put(f6.cb, i12);
                sparseIntArray2.put(f6.gb, i12);
                sparseIntArray2.put(f6.hb, i12);
                sparseIntArray2.put(f6.Va, i12);
                sparseIntArray2.put(f6.Wa, i12);
                sparseIntArray2.put(f6.Xa, i12);
                sparseIntArray2.put(f6.Ra, i12);
                sparseIntArray2.put(f6.Sa, i12);
                sparseIntArray2.put(f6.tb, i12);
                sparseIntArray2.put(f6.Fb, i12);
                sparseIntArray2.put(f6.ib, i12);
                sparseIntArray2.put(f6.lb, i12);
                sparseIntArray2.put(f6.mb, i12);
                sparseIntArray2.put(f6.Ja, i12);
                sparseIntArray2.put(f6.Ka, i12);
                sparseIntArray2.put(f6.La, i12);
                sparseIntArray2.put(f6.Ma, i12);
                sparseIntArray2.put(f6.Na, i12);
                sparseIntArray2.put(f6.Oa, i12);
                sparseIntArray2.put(f6.Ta, i12);
                sparseIntArray2.put(f6.Ua, i12);
                sparseIntArray2.put(f6.sb, i12);
                sparseIntArray2.put(f6.nb, i12);
                sparseIntArray2.put(f6.ub, i10);
                sparseIntArray2.put(f6.vb, i10);
                sparseIntArray2.put(f6.jb, i10);
                sparseIntArray2.put(f6.kb, i10);
                sparseIntArray2.put(f6.Gb, i10);
                sparseIntArray2.put(f6.Hb, i10);
                sparseIntArray2.put(f6.Kb, i10);
                sparseIntArray2.put(f6.Lb, i10);
                sparseIntArray2.put(f6.Nb, i12);
                sparseIntArray2.put(f6.Ob, i12);
                sparseIntArray2.put(f6.Db, this.e);
                sparseIntArray2.put(f6.Eb, this.e);
                sparseIntArray2.put(f6.Pa, this.e);
                sparseIntArray2.put(f6.Qa, this.e);
            }
            sparseIntArray2.put(f6.db, i12);
            sparseIntArray2.put(f6.eb, i12);
            sparseIntArray2.put(f6.fb, i12);
            sparseIntArray2.put(f6.fc, i12);
        }
        if (z10) {
            int i28 = f6.Nb;
            if (AndroidUtilities.getColorDistance(-1, sparseIntArray2.indexOfKey(i28) >= 0 ? sparseIntArray2.get(i28) : 0) < 5000) {
                z10 = false;
            }
        }
        int i29 = this.e;
        if (i29 != 0 && this.f != 0) {
            sparseIntArray2.put(f6.Aa, i29);
            sparseIntArray2.put(f6.Da, this.f);
            int i30 = this.g;
            if (i30 != 0) {
                sparseIntArray2.put(f6.Ea, i30);
                int i31 = this.h;
                if (i31 != 0) {
                    sparseIntArray2.put(f6.Fa, i31);
                }
            }
            sparseIntArray2.put(f6.ac, this.i ? 1 : 0);
        }
        long j10 = this.j;
        int i32 = (int) j10;
        if (i32 != 0) {
            sparseIntArray2.put(f6.Nd, i32);
        } else if (j10 != 0) {
            sparseIntArray2.delete(f6.Nd);
        }
        long j11 = this.k;
        int i33 = (int) j11;
        if (i33 != 0) {
            sparseIntArray2.put(f6.Od, i33);
        } else if (j11 != 0) {
            sparseIntArray2.delete(f6.Od);
        }
        long j12 = this.l;
        int i34 = (int) j12;
        if (i34 != 0) {
            sparseIntArray2.put(f6.Pd, i34);
        } else if (j12 != 0) {
            sparseIntArray2.delete(f6.Pd);
        }
        long j13 = this.m;
        int i35 = (int) j13;
        if (i35 != 0) {
            sparseIntArray2.put(f6.Qd, i35);
        } else if (j13 != 0) {
            sparseIntArray2.delete(f6.Qd);
        }
        int i36 = this.n;
        if (i36 != 45) {
            sparseIntArray2.put(f6.Rd, i36);
        }
        int i37 = f6.Aa;
        int i38 = sparseIntArray2.get(i37);
        if (i38 == 0) {
            i38 = f6.w0(null, i37, false);
        }
        int i39 = f6.ra;
        int i40 = sparseIntArray2.get(i39);
        if (i40 == 0) {
            i40 = f6.w0(null, i39, false);
        }
        TLRPC.TL_theme tL_theme = this.r;
        if (tL_theme != null && tL_theme.emoticon != null && !q10) {
            sparseIntArray2.delete(f6.Hc);
            int a10 = a(sparseIntArray2, f6.Od, f6.Pd, f6.Qd);
            if (a10 == 0) {
                a10 = a(sparseIntArray2, f6.Nd);
            }
            if (a10 == 0) {
                a10 = this.c;
            }
            int b10 = b(i38, a10);
            sparseIntArray2.put(f6.Yb, b10);
            sparseIntArray2.put(f6.bc, b10);
            sparseIntArray2.put(f6.Ba, f6.v(i38, b10));
            int b11 = b(i40, this.c);
            sparseIntArray2.put(f6.sa, b11);
            sparseIntArray2.put(f6.dc, f6.v(i40, b11));
        }
        float[] fArr = this.A;
        if (!q10) {
            sparseIntArray2.put(f6.uf, h(i40, this.c));
            sparseIntArray2.put(f6.Vb, h(i38, this.c));
            int i41 = f6.Wb;
            Color.colorToHSV(this.c, fArr);
            float f12 = fArr[0];
            Color.colorToHSV(i38, fArr);
            float f13 = fArr[c10];
            if (f13 > 0.0f) {
                float f14 = fArr[0];
                if (f14 > 45.0f) {
                }
                fArr[c10] = Math.max(0.0f, Math.min(1.0f, f13 + 0.6f));
                float f15 = fArr[c11];
                fArr[c11] = Math.max(0.0f, Math.min(1.0f, f15 - (f15 <= 0.7f ? 0.25f : 0.125f)));
                sparseIntArray2.put(i41, f6.v(i38, Color.HSVToColor(255, fArr)));
            }
            fArr[0] = f12;
            fArr[c10] = Math.max(0.0f, Math.min(1.0f, f13 + 0.6f));
            float f152 = fArr[c11];
            fArr[c11] = Math.max(0.0f, Math.min(1.0f, f152 - (f152 <= 0.7f ? 0.25f : 0.125f)));
            sparseIntArray2.put(i41, f6.v(i38, Color.HSVToColor(255, fArr)));
        }
        Color.colorToHSV(f6.w0(null, f6.n6, false), fArr);
        float f16 = fArr[0];
        sparseIntArray2.put(f6.Xb, f(i38, f16, q10));
        sparseIntArray2.put(f6.wf, f(i40, f16, q10));
        int i42 = f6.gc;
        int i43 = sparseIntArray2.get(i42);
        if (i43 == 0) {
            i43 = f6.w0(null, i42, false);
        }
        int i44 = f6.hc;
        int i45 = sparseIntArray2.get(i44);
        if (i45 == 0) {
            i45 = f6.w0(null, i44, false);
        }
        sparseIntArray2.put(f6.Ld, e(i43, i40, q10));
        sparseIntArray2.put(f6.Mb, e(i45, i38, q10));
        int i46 = f6.G8;
        int i47 = sparseIntArray2.get(i46);
        if (i47 == 0) {
            i47 = f6.w0(null, i46, false);
        }
        sparseIntArray2.put(f6.H8, Color.argb(Color.alpha(i47), Math.max(0, Color.red(i47) - 10), Math.max(0, Color.green(i47) - 10), Math.max(0, Color.blue(i47) - 10)));
        int i48 = 64;
        if (q10) {
            int i49 = f6.Da;
            if (sparseIntArray2.get(i49) != 0) {
                Color.colorToHSV(a(sparseIntArray2, i49, f6.Ea, f6.Fa), fArr);
                fArr[c10] = Utilities.clamp(fArr[c10] + 0.1f, 1.0f, 0.0f);
                fArr[c11] = Utilities.clamp(fArr[c11] - 0.8f, 1.0f, 0.0f);
                sparseIntArray2.put(f6.qk, Color.HSVToColor(64, fArr));
                f6.g(sparseIntArray, sparseIntArray2, q10);
                f6.f(sparseIntArray, sparseIntArray2, q10);
                return !z10;
            }
        }
        int i50 = f6.qk;
        Color.colorToHSV(i38, fArr);
        if (q10) {
            fArr[c10] = Utilities.clamp(fArr[c10] - 0.08f, 1.0f, 0.0f);
            fArr[c11] = 0.03f;
        } else {
            float f17 = fArr[c10];
            if (f17 > 0.0f) {
                float f18 = fArr[c11];
                if (f18 < 1.0f && f18 > 0.0f) {
                    fArr[c10] = Math.max(0.0f, Math.min(1.0f, f17 + 0.28f));
                    fArr[c11] = Math.max(0.0f, Math.min(1.0f, fArr[c11] - 0.1f));
                    i48 = 32;
                }
            }
            fArr[c11] = Math.max(0.0f, Math.min(1.0f, fArr[c11] - 0.2f));
            i48 = 32;
        }
        sparseIntArray2.put(i50, Color.HSVToColor(i48, fArr));
        f6.g(sparseIntArray, sparseIntArray2, q10);
        f6.f(sparseIntArray, sparseIntArray2, q10);
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

    public final int e(int i9, int i10, boolean z10) {
        int d = i0.a.d(0.25f, i9, i10);
        float[] fArr = this.A;
        Color.colorToHSV(d, fArr);
        fArr[1] = Math.max(0.0f, Math.min(1.0f, fArr[1] - 0.1f));
        fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] + (z10 ? 0.1f : 0.0f)));
        return Color.HSVToColor(51, fArr);
    }

    public final int f(int i9, float f10, boolean z10) {
        if (z10) {
            return 520093695;
        }
        float[] fArr = this.A;
        Color.colorToHSV(i9, fArr);
        if (fArr[1] > 0.0f) {
            float f11 = fArr[2];
            if (f11 < 1.0f && f11 > 0.0f) {
                fArr[0] = g7.n.a(fArr[0] + 0.22f, 0.0f, 1.0f);
                fArr[1] = g7.n.a(fArr[1] - 0.35f, 0.0f, 1.0f);
                fArr[2] = g7.n.a(fArr[2] - 0.65f, 0.0f, 1.0f);
                return Color.HSVToColor(90, fArr);
            }
        }
        fArr[0] = f10;
        fArr[1] = 0.2f;
        fArr[2] = g7.n.a(fArr[2] - 0.65f, 0.0f, 1.0f);
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
    public final int h(int i9, int i10) {
        float[] fArr = this.A;
        Color.colorToHSV(i10, fArr);
        float f10 = fArr[0];
        Color.colorToHSV(i9, fArr);
        float f11 = fArr[1];
        if (f11 > 0.0f) {
            float f12 = fArr[0];
            if (f12 > 45.0f) {
            }
            fArr[1] = Math.max(0.0f, Math.min(1.0f, f11 + (fArr[2] <= 0.85f ? 0.25f : 0.45f)));
            fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.15f));
            return Color.HSVToColor(80, fArr);
        }
        fArr[0] = f10;
        fArr[1] = Math.max(0.0f, Math.min(1.0f, f11 + (fArr[2] <= 0.85f ? 0.25f : 0.45f)));
        fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.15f));
        return Color.HSVToColor(80, fArr);
    }
}
