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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class i6 {
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
    public d6 y;
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
        for (int i10 = k6.za; i10 < k6.Ga; i10++) {
            sparseIntArray.delete(i10);
            sparseIntArray.put(i10, k6.ql[i10]);
        }
        for (int i11 = k6.Ha; i11 < k6.Tb; i11++) {
            sparseIntArray.delete(i11);
            sparseIntArray.put(i11, k6.ql[i11]);
        }
        for (int i12 = k6.Ub; i12 < k6.cc; i12++) {
            sparseIntArray.delete(i12);
            sparseIntArray.put(i12, k6.ql[i12]);
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
        fArr[1] = Math.max(0.0f, Math.min(1.0f, f10 + 0.6f));
        fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.05f));
        return Color.HSVToColor(30, fArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x04a8, code lost:
    
        if (r13 < 85.0f) goto L212;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        int valueAt;
        float f7;
        boolean a2;
        int i10;
        char c10;
        int i11;
        int i12;
        int valueAt2;
        int valueAt3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float[] O0 = k6.O0(1);
        float[] O02 = k6.O0(2);
        Color.colorToHSV(this.b.X, O0);
        Color.colorToHSV(this.c, O02);
        boolean q6 = this.b.q();
        int i20 = 0;
        if (this.c != this.b.X || this.d != 0) {
            int i21 = 0;
            while (true) {
                int[] iArr = k6.ql;
                if (i21 >= iArr.length) {
                    break;
                }
                if (!k6.sl.contains(Integer.valueOf(i21))) {
                    int indexOfKey = sparseIntArray.indexOfKey(i21);
                    if (indexOfKey < 0) {
                        int i22 = k6.rl.get(i21, -1);
                        if (i22 < 0 || sparseIntArray.indexOfKey(i22) < 0) {
                            valueAt = iArr[i21];
                        }
                    } else {
                        valueAt = sparseIntArray.valueAt(indexOfKey);
                    }
                    int D = k6.D(O0, O02, valueAt, q6, valueAt);
                    if (D != valueAt) {
                        sparseIntArray2.put(i21, D);
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
            int i24 = k6.Aa;
            int i25 = sparseIntArray.get(i24);
            if (i25 == 0) {
                i25 = k6.ql[i24];
            }
            int colorDistance = AndroidUtilities.getColorDistance(i23, k6.D(O0, O02, i25, q6, i25));
            int i26 = 1;
            int colorDistance2 = AndroidUtilities.getColorDistance(i23, this.f);
            char c11 = 2;
            if (this.g != 0) {
                f7 = 0.705f;
                int averageColor = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(this.e, this.f), this.g);
                int i27 = this.h;
                if (i27 != 0) {
                    averageColor = AndroidUtilities.getAverageColor(averageColor, i27);
                }
                a2 = AndroidUtilities.computePerceivedBrightness(averageColor) > 0.705f;
            } else {
                f7 = 0.705f;
                a2 = k6.a(this.e, this.f);
            }
            i10 = (!a2 || colorDistance > 35000 || colorDistance2 > 35000) ? 0 : 1;
            float[] O03 = k6.O0(3);
            float[] O04 = k6.O0(4);
            Color.colorToHSV(i25, O03);
            Color.colorToHSV(i23, O04);
            float min = Math.min((O03[1] * 1.5f) / O0[1], 1.0f);
            O03[0] = (O04[0] - O03[0]) + O0[0];
            O03[1] = (O04[1] * O0[1]) / O03[1];
            float f10 = ((((O04[2] / O03[2]) + min) - 1.0f) * O0[2]) / min;
            O03[2] = f10;
            i11 = i26;
            c10 = c11;
            if (f10 >= 0.3f) {
                i23 = Color.HSVToColor(255, O03);
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
                Color.colorToHSV(i29, O02);
            } else {
                Color.colorToHSV(i23, O02);
            }
            for (int i30 = k6.Ha; i30 < k6.Tb; i30++) {
                int indexOfKey2 = sparseIntArray.indexOfKey(i30);
                if (indexOfKey2 < 0) {
                    int i31 = k6.rl.get(i30, -1);
                    if (i31 < 0 || sparseIntArray.get(i31, -1) < 0) {
                        valueAt3 = k6.ql[i30];
                    }
                } else {
                    valueAt3 = sparseIntArray.valueAt(indexOfKey2);
                }
                int D2 = k6.D(O0, O02, valueAt3, q6, valueAt3);
                if (D2 != valueAt3) {
                    sparseIntArray2.put(i30, D2);
                }
            }
            int[] iArr2 = k6.Hk;
            int length = iArr2.length;
            int i32 = 0;
            while (i32 < length) {
                int i33 = i20;
                int i34 = iArr2[i32];
                int indexOfKey3 = sparseIntArray.indexOfKey(i34);
                int valueAt4 = indexOfKey3 < 0 ? k6.ql[i34] : sparseIntArray.valueAt(indexOfKey3);
                int D3 = k6.D(O0, O02, valueAt4, q6, valueAt4);
                if (D3 != valueAt4) {
                    sparseIntArray2.put(i34, D3);
                }
                i32++;
                i20 = i33;
            }
            i12 = i20;
            if (i28 != 0) {
                Color.colorToHSV(i23, O02);
                for (int i35 = k6.za; i35 < k6.Ga; i35++) {
                    int indexOfKey4 = sparseIntArray.indexOfKey(i35);
                    if (indexOfKey4 < 0) {
                        int i36 = k6.rl.get(i35, -1);
                        if (i36 < 0 || sparseIntArray.get(i36, -1) < 0) {
                            valueAt2 = k6.ql[i35];
                        }
                    } else {
                        valueAt2 = sparseIntArray.valueAt(indexOfKey4);
                    }
                    int D4 = k6.D(O0, O02, valueAt2, q6, valueAt2);
                    if (D4 != valueAt2) {
                        sparseIntArray2.put(i35, D4);
                    }
                }
            }
        }
        if (i10 == 0 && (i13 = this.f) != 0) {
            if (this.g != 0) {
                int averageColor2 = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(this.e, i13), this.g);
                int i37 = this.h;
                if (i37 != 0) {
                    averageColor2 = AndroidUtilities.getAverageColor(averageColor2, i37);
                }
                i14 = AndroidUtilities.computePerceivedBrightness(averageColor2) > f7 ? i11 : i12;
            } else {
                i14 = k6.a(this.e, i13);
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
                sparseIntArray2.put(k6.qb, i16);
                sparseIntArray2.put(k6.rb, i16);
                sparseIntArray2.put(k6.wb, i16);
                sparseIntArray2.put(k6.xb, i16);
                sparseIntArray2.put(k6.yb, i16);
                sparseIntArray2.put(k6.zb, i17);
                sparseIntArray2.put(k6.Ab, i16);
                sparseIntArray2.put(k6.Bb, i16);
                sparseIntArray2.put(k6.Cb, i17);
                sparseIntArray2.put(k6.hc, i17);
                sparseIntArray2.put(k6.Ya, i17);
                sparseIntArray2.put(k6.Za, i17);
                sparseIntArray2.put(k6.ab, i17);
                sparseIntArray2.put(k6.bb, i17);
                sparseIntArray2.put(k6.cb, i17);
                sparseIntArray2.put(k6.gb, i17);
                sparseIntArray2.put(k6.hb, i17);
                sparseIntArray2.put(k6.Va, i17);
                sparseIntArray2.put(k6.Wa, i17);
                sparseIntArray2.put(k6.Xa, i17);
                sparseIntArray2.put(k6.Ra, i17);
                sparseIntArray2.put(k6.Sa, i17);
                sparseIntArray2.put(k6.tb, i17);
                sparseIntArray2.put(k6.Fb, i17);
                sparseIntArray2.put(k6.ib, i17);
                sparseIntArray2.put(k6.lb, i17);
                sparseIntArray2.put(k6.mb, i17);
                sparseIntArray2.put(k6.Ja, i17);
                sparseIntArray2.put(k6.Ka, i17);
                sparseIntArray2.put(k6.La, i17);
                sparseIntArray2.put(k6.Ma, i17);
                sparseIntArray2.put(k6.Na, i17);
                sparseIntArray2.put(k6.Oa, i17);
                sparseIntArray2.put(k6.Ta, i17);
                sparseIntArray2.put(k6.Ua, i17);
                sparseIntArray2.put(k6.sb, i17);
                sparseIntArray2.put(k6.nb, i17);
                sparseIntArray2.put(k6.ub, i15);
                sparseIntArray2.put(k6.vb, i15);
                sparseIntArray2.put(k6.jb, i15);
                sparseIntArray2.put(k6.kb, i15);
                sparseIntArray2.put(k6.Gb, i15);
                sparseIntArray2.put(k6.Hb, i15);
                sparseIntArray2.put(k6.Kb, i15);
                sparseIntArray2.put(k6.Lb, i15);
                sparseIntArray2.put(k6.Nb, i17);
                sparseIntArray2.put(k6.Ob, i17);
                sparseIntArray2.put(k6.Db, this.e);
                sparseIntArray2.put(k6.Eb, this.e);
                sparseIntArray2.put(k6.Pa, this.e);
                sparseIntArray2.put(k6.Qa, this.e);
            }
            sparseIntArray2.put(k6.db, i17);
            sparseIntArray2.put(k6.eb, i17);
            sparseIntArray2.put(k6.fb, i17);
            sparseIntArray2.put(k6.fc, i17);
        }
        if (i10 != 0) {
            int i38 = k6.Nb;
            if (AndroidUtilities.getColorDistance(-1, sparseIntArray2.indexOfKey(i38) >= 0 ? sparseIntArray2.get(i38) : i12) < 5000) {
                i10 = i12;
            }
        }
        int i39 = this.e;
        if (i39 != 0 && this.f != 0) {
            sparseIntArray2.put(k6.Aa, i39);
            sparseIntArray2.put(k6.Da, this.f);
            int i40 = this.g;
            if (i40 != 0) {
                sparseIntArray2.put(k6.Ea, i40);
                int i41 = this.h;
                if (i41 != 0) {
                    sparseIntArray2.put(k6.Fa, i41);
                }
            }
            sparseIntArray2.put(k6.ac, this.i ? 1 : 0);
        }
        long j10 = this.j;
        int i42 = (int) j10;
        if (i42 != 0) {
            sparseIntArray2.put(k6.Nd, i42);
        } else if (j10 != 0) {
            sparseIntArray2.delete(k6.Nd);
        }
        long j11 = this.k;
        int i43 = (int) j11;
        if (i43 != 0) {
            sparseIntArray2.put(k6.Od, i43);
        } else if (j11 != 0) {
            sparseIntArray2.delete(k6.Od);
        }
        long j12 = this.l;
        int i44 = (int) j12;
        if (i44 != 0) {
            sparseIntArray2.put(k6.Pd, i44);
        } else if (j12 != 0) {
            sparseIntArray2.delete(k6.Pd);
        }
        long j13 = this.m;
        int i45 = (int) j13;
        if (i45 != 0) {
            sparseIntArray2.put(k6.Qd, i45);
        } else if (j13 != 0) {
            sparseIntArray2.delete(k6.Qd);
        }
        int i46 = this.n;
        if (i46 != 45) {
            sparseIntArray2.put(k6.Rd, i46);
        }
        int i47 = k6.Aa;
        int i48 = sparseIntArray2.get(i47);
        if (i48 == 0) {
            i48 = k6.y0(sparseIntArray2, i47, null);
        }
        int i49 = k6.ra;
        int i50 = sparseIntArray2.get(i49);
        if (i50 == 0) {
            i50 = k6.y0(sparseIntArray2, i49, null);
        }
        TLRPC.TL_theme tL_theme = this.r;
        if (tL_theme != null && tL_theme.emoticon != null && !q6) {
            sparseIntArray2.delete(k6.Hc);
            int a10 = a(sparseIntArray2, k6.Od, k6.Pd, k6.Qd);
            if (a10 == 0) {
                a10 = a(sparseIntArray2, k6.Nd);
            }
            if (a10 == 0) {
                a10 = this.c;
            }
            int b10 = b(i48, a10);
            sparseIntArray2.put(k6.Yb, b10);
            sparseIntArray2.put(k6.bc, b10);
            sparseIntArray2.put(k6.Ba, k6.v(i48, b10));
            int b11 = b(i50, this.c);
            sparseIntArray2.put(k6.sa, b11);
            sparseIntArray2.put(k6.dc, k6.v(i50, b11));
        }
        float[] fArr = this.A;
        if (!q6) {
            sparseIntArray2.put(k6.uf, h(i50, this.c));
            sparseIntArray2.put(k6.Vb, h(i48, this.c));
            int i51 = k6.Wb;
            Color.colorToHSV(this.c, fArr);
            float f11 = fArr[i12];
            Color.colorToHSV(i48, fArr);
            float f12 = fArr[i11];
            if (f12 > 0.0f) {
                float f13 = fArr[i12];
                if (f13 > 45.0f) {
                }
                fArr[i11] = Math.max(0.0f, Math.min(1.0f, f12 + 0.6f));
                float f14 = fArr[c10];
                fArr[c10] = Math.max(0.0f, Math.min(1.0f, f14 - (f14 <= 0.7f ? 0.25f : 0.125f)));
                sparseIntArray2.put(i51, k6.v(i48, Color.HSVToColor(255, fArr)));
            }
            fArr[i12] = f11;
            fArr[i11] = Math.max(0.0f, Math.min(1.0f, f12 + 0.6f));
            float f142 = fArr[c10];
            fArr[c10] = Math.max(0.0f, Math.min(1.0f, f142 - (f142 <= 0.7f ? 0.25f : 0.125f)));
            sparseIntArray2.put(i51, k6.v(i48, Color.HSVToColor(255, fArr)));
        }
        Color.colorToHSV(k6.y0(sparseIntArray2, k6.n6, null), fArr);
        float f15 = fArr[i12];
        sparseIntArray2.put(k6.Xb, f(i48, f15, q6));
        sparseIntArray2.put(k6.wf, f(i50, f15, q6));
        int i52 = k6.gc;
        int i53 = sparseIntArray2.get(i52);
        if (i53 == 0) {
            i53 = k6.y0(sparseIntArray2, i52, null);
        }
        int i54 = k6.hc;
        int i55 = sparseIntArray2.get(i54);
        if (i55 == 0) {
            i55 = k6.y0(sparseIntArray2, i54, null);
        }
        sparseIntArray2.put(k6.Ld, e(i53, i50, q6));
        sparseIntArray2.put(k6.Mb, e(i55, i48, q6));
        int i56 = k6.G8;
        int i57 = sparseIntArray2.get(i56);
        if (i57 == 0) {
            i57 = k6.y0(sparseIntArray2, i56, null);
        }
        int i58 = i12;
        sparseIntArray2.put(k6.H8, Color.argb(Color.alpha(i57), Math.max(i58, Color.red(i57) - 10), Math.max(i58, Color.green(i57) - 10), Math.max(i58, Color.blue(i57) - 10)));
        int i59 = 64;
        if (q6) {
            int i60 = k6.Da;
            if (sparseIntArray2.get(i60) != 0) {
                Color.colorToHSV(a(sparseIntArray2, i60, k6.Ea, k6.Fa), fArr);
                fArr[i11] = Utilities.clamp(fArr[i11] + 0.1f, 1.0f, 0.0f);
                fArr[c10] = Utilities.clamp(fArr[c10] - 0.8f, 1.0f, 0.0f);
                sparseIntArray2.put(k6.qk, Color.HSVToColor(64, fArr));
                k6.g(sparseIntArray, sparseIntArray2, q6);
                k6.f(sparseIntArray, sparseIntArray2, q6);
                return i10 ^ 1;
            }
        }
        int i61 = k6.qk;
        Color.colorToHSV(i48, fArr);
        if (q6) {
            fArr[i11] = Utilities.clamp(fArr[i11] - 0.08f, 1.0f, 0.0f);
            fArr[c10] = 0.03f;
        } else {
            float f16 = fArr[i11];
            if (f16 > 0.0f) {
                float f17 = fArr[c10];
                if (f17 < 1.0f && f17 > 0.0f) {
                    fArr[i11] = Math.max(0.0f, Math.min(1.0f, f16 + 0.28f));
                    fArr[c10] = Math.max(0.0f, Math.min(1.0f, fArr[c10] - 0.1f));
                    i59 = 32;
                }
            }
            fArr[c10] = Math.max(0.0f, Math.min(1.0f, fArr[c10] - 0.2f));
            i59 = 32;
        }
        sparseIntArray2.put(i61, Color.HSVToColor(i59, fArr));
        k6.g(sparseIntArray, sparseIntArray2, q6);
        k6.f(sparseIntArray, sparseIntArray2, q6);
        return i10 ^ 1;
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
        int f7 = i0.a.f(0.25f, i10, i11);
        float[] fArr = this.A;
        Color.colorToHSV(f7, fArr);
        fArr[1] = Math.max(0.0f, Math.min(1.0f, fArr[1] - 0.1f));
        fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] + (z10 ? 0.1f : 0.0f)));
        return Color.HSVToColor(51, fArr);
    }

    public final int f(int i10, float f7, boolean z10) {
        if (z10) {
            return 520093695;
        }
        float[] fArr = this.A;
        Color.colorToHSV(i10, fArr);
        if (fArr[1] > 0.0f) {
            float f10 = fArr[2];
            if (f10 < 1.0f && f10 > 0.0f) {
                fArr[0] = w7.r.a(fArr[0] + 0.22f, 0.0f, 1.0f);
                fArr[1] = w7.r.a(fArr[1] - 0.35f, 0.0f, 1.0f);
                fArr[2] = w7.r.a(fArr[2] - 0.65f, 0.0f, 1.0f);
                return Color.HSVToColor(90, fArr);
            }
        }
        fArr[0] = f7;
        fArr[1] = 0.2f;
        fArr[2] = w7.r.a(fArr[2] - 0.65f, 0.0f, 1.0f);
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
        float f7 = fArr[0];
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
        fArr[0] = f7;
        fArr[1] = Math.max(0.0f, Math.min(1.0f, f10 + (fArr[2] <= 0.85f ? 0.25f : 0.45f)));
        fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.15f));
        return Color.HSVToColor(80, fArr);
    }
}
