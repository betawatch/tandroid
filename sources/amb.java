// default package

import android.graphics.Color;
import android.util.SparseIntArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class amb {
    public int a;
    public bmb b;
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
    public xlb y;
    public boolean z;
    public int n = 45;
    public String o = "";
    public final float[] A = new float[3];

    public static int a(SparseIntArray sparseIntArray, int... iArr) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            if (sparseIntArray.indexOfKey(iArr[i5]) >= 0) {
                try {
                    int i6 = sparseIntArray.get(iArr[i5]);
                    i2 += Color.red(i6);
                    i3 += Color.green(i6);
                    i4 += Color.blue(i6);
                    i++;
                } catch (Exception unused) {
                }
            }
        }
        if (i == 0) {
            return 0;
        }
        return Color.argb(nm7.d4, i2 / i, i3 / i, i4 / i);
    }

    public static int c(SparseIntArray sparseIntArray, int i) {
        int i2;
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey < 0 && (i2 = cmb.hm.get(i, -1)) >= 0) {
            indexOfKey = sparseIntArray.indexOfKey(i2);
        }
        return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : cmb.gm[i];
    }

    public static void g(SparseIntArray sparseIntArray) {
        for (int i = cmb.pb; i < cmb.wb; i++) {
            sparseIntArray.delete(i);
            sparseIntArray.put(i, cmb.gm[i]);
        }
        for (int i2 = cmb.xb; i2 < cmb.Jc; i2++) {
            sparseIntArray.delete(i2);
            sparseIntArray.put(i2, cmb.gm[i2]);
        }
        for (int i3 = cmb.Kc; i3 < cmb.Sc; i3++) {
            sparseIntArray.delete(i3);
            sparseIntArray.put(i3, cmb.gm[i3]);
        }
    }

    public final int b(int i, int i2) {
        float[] fArr = this.A;
        Color.colorToHSV(i2, fArr);
        float f = fArr[0];
        Color.colorToHSV(i, fArr);
        float f2 = fArr[1];
        if (f2 <= 0.0f) {
            fArr[0] = f;
        }
        fArr[1] = mlb.f(f2, 0.6f, 1.0f, 0.0f);
        fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.05f));
        return Color.HSVToColor(30, fArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x052c, code lost:
    
        if (r14 < 85.0f) goto L210;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0547  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        int valueAt;
        int i;
        float f;
        int i2;
        boolean M1;
        int i3;
        char c;
        int valueAt2;
        int valueAt3;
        TLRPC.TL_theme tL_theme;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float[] N0 = cmb.N0(1);
        float[] N02 = cmb.N0(2);
        Color.colorToHSV(this.b.Y, N0);
        Color.colorToHSV(this.c, N02);
        boolean o = this.b.o();
        if (this.c != this.b.Y || this.d != 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = cmb.gm;
                if (i11 >= iArr.length) {
                    break;
                }
                if (!cmb.im.contains(Integer.valueOf(i11))) {
                    int indexOfKey = sparseIntArray.indexOfKey(i11);
                    if (indexOfKey < 0) {
                        int i12 = cmb.hm.get(i11, -1);
                        if (i12 < 0 || sparseIntArray.indexOfKey(i12) < 0) {
                            valueAt = iArr[i11];
                        }
                    } else {
                        valueAt = sparseIntArray.valueAt(indexOfKey);
                    }
                    int D = cmb.D(N0, N02, valueAt, o, valueAt);
                    if (D != valueAt) {
                        sparseIntArray2.put(i11, D);
                    }
                }
                i11++;
            }
        }
        int i13 = this.e;
        if ((i13 == 0 && this.c == 0) || this.f == 0) {
            i = 1;
            c = 2;
            f = 0.705f;
            i2 = 0;
            i3 = 0;
        } else {
            if (i13 == 0) {
                i13 = this.c;
            }
            int i14 = cmb.qb;
            int i15 = sparseIntArray.get(i14);
            if (i15 == 0) {
                i15 = cmb.gm[i14];
            }
            int E0 = gm.E0(i13, cmb.D(N0, N02, i15, o, i15));
            i = 1;
            int E02 = gm.E0(i13, this.f);
            char c2 = 2;
            int i16 = this.g;
            f = 0.705f;
            int i17 = this.e;
            i2 = 0;
            int i18 = this.f;
            if (i16 != 0) {
                int w0 = gm.w0(gm.w0(i17, i18), this.g);
                int i19 = this.h;
                if (i19 != 0) {
                    w0 = gm.w0(w0, i19);
                }
                M1 = gm.B(w0) > 0.705f;
            } else {
                M1 = cmb.M1(i17, i18);
            }
            i3 = (!M1 || E0 > 35000 || E02 > 35000) ? 0 : 1;
            float[] N03 = cmb.N0(3);
            float[] N04 = cmb.N0(4);
            Color.colorToHSV(i15, N03);
            Color.colorToHSV(i13, N04);
            float min = Math.min((N03[1] * 1.5f) / N0[1], 1.0f);
            N03[0] = (N04[0] - N03[0]) + N0[0];
            N03[1] = (N04[1] * N0[1]) / N03[1];
            float f2 = ((((N04[2] / N03[2]) + min) - 1.0f) * N0[2]) / min;
            N03[2] = f2;
            c = c2;
            if (f2 >= 0.3f) {
                i13 = Color.HSVToColor(nm7.d4, N03);
                c = c2;
            }
        }
        int i20 = (i13 == 0 || (((i9 = this.b.Y) == 0 || i13 == i9) && ((i10 = this.c) == 0 || i10 == i13))) ? i2 : i;
        if (i20 != 0 || this.d != 0) {
            int i21 = this.d;
            if (i21 != 0) {
                Color.colorToHSV(i21, N02);
            } else {
                Color.colorToHSV(i13, N02);
            }
            for (int i22 = cmb.xb; i22 < cmb.Jc; i22++) {
                int indexOfKey2 = sparseIntArray.indexOfKey(i22);
                if (indexOfKey2 < 0) {
                    int i23 = cmb.hm.get(i22, -1);
                    if (i23 < 0 || sparseIntArray.get(i23, -1) < 0) {
                        valueAt3 = cmb.gm[i22];
                    }
                } else {
                    valueAt3 = sparseIntArray.valueAt(indexOfKey2);
                }
                int D2 = cmb.D(N0, N02, valueAt3, o, valueAt3);
                if (D2 != valueAt3) {
                    sparseIntArray2.put(i22, D2);
                }
            }
            int[] iArr2 = cmb.xl;
            int length = iArr2.length;
            for (int i24 = i2; i24 < length; i24++) {
                int i25 = iArr2[i24];
                int indexOfKey3 = sparseIntArray.indexOfKey(i25);
                int valueAt4 = indexOfKey3 < 0 ? cmb.gm[i25] : sparseIntArray.valueAt(indexOfKey3);
                int D3 = cmb.D(N0, N02, valueAt4, o, valueAt4);
                if (D3 != valueAt4) {
                    sparseIntArray2.put(i25, D3);
                }
            }
            if (i20 != 0) {
                Color.colorToHSV(i13, N02);
                for (int i26 = cmb.pb; i26 < cmb.wb; i26++) {
                    int indexOfKey4 = sparseIntArray.indexOfKey(i26);
                    if (indexOfKey4 < 0) {
                        int i27 = cmb.hm.get(i26, -1);
                        if (i27 < 0 || sparseIntArray.get(i27, -1) < 0) {
                            valueAt2 = cmb.gm[i26];
                        }
                    } else {
                        valueAt2 = sparseIntArray.valueAt(indexOfKey4);
                    }
                    int D4 = cmb.D(N0, N02, valueAt2, o, valueAt2);
                    if (D4 != valueAt2) {
                        sparseIntArray2.put(i26, D4);
                    }
                }
            }
        }
        if (i3 == 0 && (i4 = this.f) != 0) {
            int i28 = this.g;
            int i29 = this.e;
            if (i28 != 0) {
                int w02 = gm.w0(gm.w0(i29, i4), this.g);
                int i30 = this.h;
                if (i30 != 0) {
                    w02 = gm.w0(w02, i30);
                }
                i5 = gm.B(w02) > f ? i : i2;
            } else {
                i5 = cmb.M1(i29, i4);
            }
            if (i5 != 0) {
                i8 = -14606047;
                i6 = -11184811;
                i7 = 1291845632;
            } else {
                i6 = -1118482;
                i7 = 1308622847;
                i8 = -1;
            }
            if (this.d == 0) {
                sparseIntArray2.put(cmb.gc, i7);
                sparseIntArray2.put(cmb.hc, i7);
                sparseIntArray2.put(cmb.mc, i7);
                sparseIntArray2.put(cmb.nc, i7);
                sparseIntArray2.put(cmb.oc, i7);
                sparseIntArray2.put(cmb.pc, i8);
                sparseIntArray2.put(cmb.qc, i7);
                sparseIntArray2.put(cmb.rc, i7);
                sparseIntArray2.put(cmb.sc, i8);
                sparseIntArray2.put(cmb.Xc, i8);
                sparseIntArray2.put(cmb.Ob, i8);
                sparseIntArray2.put(cmb.Pb, i8);
                sparseIntArray2.put(cmb.Qb, i8);
                sparseIntArray2.put(cmb.Rb, i8);
                sparseIntArray2.put(cmb.Sb, i8);
                sparseIntArray2.put(cmb.Wb, i8);
                sparseIntArray2.put(cmb.Xb, i8);
                sparseIntArray2.put(cmb.Lb, i8);
                sparseIntArray2.put(cmb.Mb, i8);
                sparseIntArray2.put(cmb.Nb, i8);
                sparseIntArray2.put(cmb.Hb, i8);
                sparseIntArray2.put(cmb.Ib, i8);
                sparseIntArray2.put(cmb.jc, i8);
                sparseIntArray2.put(cmb.vc, i8);
                sparseIntArray2.put(cmb.Yb, i8);
                sparseIntArray2.put(cmb.bc, i8);
                sparseIntArray2.put(cmb.cc, i8);
                sparseIntArray2.put(cmb.zb, i8);
                sparseIntArray2.put(cmb.Ab, i8);
                sparseIntArray2.put(cmb.Bb, i8);
                sparseIntArray2.put(cmb.Cb, i8);
                sparseIntArray2.put(cmb.Db, i8);
                sparseIntArray2.put(cmb.Eb, i8);
                sparseIntArray2.put(cmb.Jb, i8);
                sparseIntArray2.put(cmb.Kb, i8);
                sparseIntArray2.put(cmb.ic, i8);
                sparseIntArray2.put(cmb.dc, i8);
                sparseIntArray2.put(cmb.kc, i6);
                sparseIntArray2.put(cmb.lc, i6);
                sparseIntArray2.put(cmb.Zb, i6);
                sparseIntArray2.put(cmb.ac, i6);
                sparseIntArray2.put(cmb.wc, i6);
                sparseIntArray2.put(cmb.xc, i6);
                sparseIntArray2.put(cmb.Ac, i6);
                sparseIntArray2.put(cmb.Bc, i6);
                sparseIntArray2.put(cmb.Dc, i8);
                sparseIntArray2.put(cmb.Ec, i8);
                sparseIntArray2.put(cmb.tc, this.e);
                sparseIntArray2.put(cmb.uc, this.e);
                sparseIntArray2.put(cmb.Fb, this.e);
                sparseIntArray2.put(cmb.Gb, this.e);
            }
            sparseIntArray2.put(cmb.Tb, i8);
            sparseIntArray2.put(cmb.Ub, i8);
            sparseIntArray2.put(cmb.Vb, i8);
            sparseIntArray2.put(cmb.Vc, i8);
        }
        if (i3 != 0) {
            int i31 = cmb.Dc;
            if (gm.E0(-1, sparseIntArray2.indexOfKey(i31) >= 0 ? sparseIntArray2.get(i31) : i2) < 5000) {
                i3 = i2;
            }
        }
        int i32 = this.e;
        if (i32 != 0 && this.f != 0) {
            sparseIntArray2.put(cmb.qb, i32);
            sparseIntArray2.put(cmb.tb, this.f);
            int i33 = this.g;
            if (i33 != 0) {
                sparseIntArray2.put(cmb.ub, i33);
                int i34 = this.h;
                if (i34 != 0) {
                    sparseIntArray2.put(cmb.vb, i34);
                }
            }
            sparseIntArray2.put(cmb.Qc, this.i ? 1 : 0);
        }
        long j = this.j;
        int i35 = (int) j;
        if (i35 != 0) {
            sparseIntArray2.put(cmb.De, i35);
        } else if (j != 0) {
            sparseIntArray2.delete(cmb.De);
        }
        long j2 = this.k;
        int i36 = (int) j2;
        if (i36 != 0) {
            sparseIntArray2.put(cmb.Ee, i36);
        } else if (j2 != 0) {
            sparseIntArray2.delete(cmb.Ee);
        }
        long j3 = this.l;
        int i37 = (int) j3;
        if (i37 != 0) {
            sparseIntArray2.put(cmb.Fe, i37);
        } else if (j3 != 0) {
            sparseIntArray2.delete(cmb.Fe);
        }
        long j4 = this.m;
        int i38 = (int) j4;
        if (i38 != 0) {
            sparseIntArray2.put(cmb.Ge, i38);
        } else if (j4 != 0) {
            sparseIntArray2.delete(cmb.Ge);
        }
        int i39 = this.n;
        if (i39 != 45) {
            sparseIntArray2.put(cmb.He, i39);
        }
        int i40 = cmb.qb;
        int i41 = sparseIntArray2.get(i40);
        if (i41 == 0) {
            i41 = cmb.x0(sparseIntArray2, i40, null);
        }
        int i42 = cmb.qa;
        int i43 = sparseIntArray2.get(i42);
        if (i43 == 0) {
            i43 = cmb.x0(sparseIntArray2, i42, null);
        }
        if (this.c != this.b.Y || this.e != 0 || ((tL_theme = this.r) != null && tL_theme.emoticon != null)) {
            int c3 = c(sparseIntArray2, cmb.Qb);
            sparseIntArray2.put(cmb.Ka, (-16777216) | i41);
            sparseIntArray2.put(cmb.La, c(sparseIntArray2, cmb.ic));
            sparseIntArray2.put(cmb.Ma, c(sparseIntArray2, cmb.Bb));
            sparseIntArray2.put(cmb.Oa, c3);
            sparseIntArray2.put(cmb.Pa, c(sparseIntArray2, cmb.Sb));
            sparseIntArray2.put(cmb.Na, cmb.p1(0.1f, c3));
            sparseIntArray2.put(cmb.ab, c(sparseIntArray2, cmb.vc));
            sparseIntArray2.put(cmb.bb, c(sparseIntArray2, cmb.Dc));
            sparseIntArray2.put(cmb.cb, c(sparseIntArray2, cmb.Fb));
            sparseIntArray2.put(cmb.db, c(sparseIntArray2, cmb.wc));
            sparseIntArray2.put(cmb.eb, c(sparseIntArray2, cmb.yc));
            sparseIntArray2.put(cmb.fb, c(sparseIntArray2, cmb.kl));
            sparseIntArray2.put(cmb.Xa, c(sparseIntArray2, cmb.Ic));
        }
        TLRPC.TL_theme tL_theme2 = this.r;
        if (tL_theme2 != null && tL_theme2.emoticon != null && !o) {
            sparseIntArray2.delete(cmb.xd);
            int a = a(sparseIntArray2, cmb.Ee, cmb.Fe, cmb.Ge);
            if (a == 0) {
                a = a(sparseIntArray2, cmb.De);
            }
            if (a == 0) {
                a = this.c;
            }
            int b = b(i41, a);
            sparseIntArray2.put(cmb.Oc, b);
            sparseIntArray2.put(cmb.Rc, b);
            sparseIntArray2.put(cmb.rb, cmb.v(i41, b));
            int b2 = b(i43, this.c);
            sparseIntArray2.put(cmb.ra, b2);
            sparseIntArray2.put(cmb.Tc, cmb.v(i43, b2));
        }
        float[] fArr = this.A;
        if (!o) {
            sparseIntArray2.put(cmb.kg, h(i43, this.c));
            sparseIntArray2.put(cmb.Lc, h(i41, this.c));
            int i44 = cmb.Mc;
            Color.colorToHSV(this.c, fArr);
            float f3 = fArr[i2];
            Color.colorToHSV(i41, fArr);
            float f4 = fArr[i];
            if (f4 > 0.0f) {
                float f5 = fArr[i2];
                if (f5 > 45.0f) {
                }
                fArr[i] = mlb.f(f4, 0.6f, 1.0f, 0.0f);
                float f6 = fArr[c];
                fArr[c] = Math.max(0.0f, Math.min(1.0f, f6 - (f6 <= 0.7f ? 0.25f : 0.125f)));
                sparseIntArray2.put(i44, cmb.v(i41, Color.HSVToColor(nm7.d4, fArr)));
            }
            fArr[i2] = f3;
            fArr[i] = mlb.f(f4, 0.6f, 1.0f, 0.0f);
            float f62 = fArr[c];
            fArr[c] = Math.max(0.0f, Math.min(1.0f, f62 - (f62 <= 0.7f ? 0.25f : 0.125f)));
            sparseIntArray2.put(i44, cmb.v(i41, Color.HSVToColor(nm7.d4, fArr)));
        }
        Color.colorToHSV(cmb.x0(sparseIntArray2, cmb.m6, null), fArr);
        float f7 = fArr[i2];
        sparseIntArray2.put(cmb.Nc, f(i41, f7, o));
        sparseIntArray2.put(cmb.mg, f(i43, f7, o));
        int i45 = cmb.Wc;
        int i46 = sparseIntArray2.get(i45);
        if (i46 == 0) {
            i46 = cmb.x0(sparseIntArray2, i45, null);
        }
        int i47 = cmb.Xc;
        int i48 = sparseIntArray2.get(i47);
        if (i48 == 0) {
            i48 = cmb.x0(sparseIntArray2, i47, null);
        }
        sparseIntArray2.put(cmb.Be, e(i46, i43, o));
        sparseIntArray2.put(cmb.Cc, e(i48, i41, o));
        int i49 = cmb.F8;
        int i50 = sparseIntArray2.get(i49);
        if (i50 == 0) {
            i50 = cmb.x0(sparseIntArray2, i49, null);
        }
        int i51 = i2;
        sparseIntArray2.put(cmb.G8, Color.argb(Color.alpha(i50), Math.max(i51, Color.red(i50) - 10), Math.max(i51, Color.green(i50) - 10), Math.max(i51, Color.blue(i50) - 10)));
        int i52 = 64;
        if (o) {
            int i53 = cmb.tb;
            if (sparseIntArray2.get(i53) != 0) {
                Color.colorToHSV(a(sparseIntArray2, i53, cmb.ub, cmb.vb), fArr);
                fArr[i] = Utilities.i(fArr[i] + 0.1f, 1.0f, 0.0f);
                fArr[c] = Utilities.i(fArr[c] - 0.8f, 1.0f, 0.0f);
                sparseIntArray2.put(cmb.gl, Color.HSVToColor(64, fArr));
                cmb.f(sparseIntArray, sparseIntArray2, o);
                cmb.e(sparseIntArray, sparseIntArray2, o);
                return i3 ^ 1;
            }
        }
        int i54 = cmb.gl;
        Color.colorToHSV(i41, fArr);
        if (o) {
            fArr[i] = Utilities.i(fArr[i] - 0.08f, 1.0f, 0.0f);
            fArr[c] = 0.03f;
        } else {
            float f8 = fArr[i];
            if (f8 > 0.0f) {
                float f9 = fArr[c];
                if (f9 < 1.0f && f9 > 0.0f) {
                    fArr[i] = mlb.f(f8, 0.28f, 1.0f, 0.0f);
                    fArr[c] = mlb.f(fArr[c], -0.1f, 1.0f, 0.0f);
                    i52 = 32;
                }
            }
            fArr[c] = mlb.f(fArr[c], -0.2f, 1.0f, 0.0f);
            i52 = 32;
        }
        sparseIntArray2.put(i54, Color.HSVToColor(i52, fArr));
        cmb.f(sparseIntArray, sparseIntArray2, o);
        cmb.e(sparseIntArray, sparseIntArray2, o);
        return i3 ^ 1;
    }

    public final int e(int i, int i2, boolean z) {
        int f = on2.f(0.25f, i, i2);
        float[] fArr = this.A;
        Color.colorToHSV(f, fArr);
        fArr[1] = Math.max(0.0f, Math.min(1.0f, fArr[1] - 0.1f));
        fArr[2] = mlb.f(fArr[2], z ? 0.1f : 0.0f, 1.0f, 0.0f);
        return Color.HSVToColor(51, fArr);
    }

    public final int f(int i, float f, boolean z) {
        if (z) {
            return 520093695;
        }
        float[] fArr = this.A;
        Color.colorToHSV(i, fArr);
        if (fArr[1] > 0.0f) {
            float f2 = fArr[2];
            if (f2 < 1.0f && f2 > 0.0f) {
                fArr[0] = pqe.a(fArr[0] + 0.22f, 0.0f, 1.0f);
                fArr[1] = pqe.a(fArr[1] - 0.35f, 0.0f, 1.0f);
                fArr[2] = pqe.a(fArr[2] - 0.65f, 0.0f, 1.0f);
                return Color.HSVToColor(90, fArr);
            }
        }
        fArr[0] = f;
        fArr[1] = 0.2f;
        fArr[2] = pqe.a(fArr[2] - 0.65f, 0.0f, 1.0f);
        return Color.HSVToColor(90, fArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r3 < 85.0f) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(int i, int i2) {
        float[] fArr = this.A;
        Color.colorToHSV(i2, fArr);
        float f = fArr[0];
        Color.colorToHSV(i, fArr);
        float f2 = fArr[1];
        if (f2 > 0.0f) {
            float f3 = fArr[0];
            if (f3 > 45.0f) {
            }
            fArr[1] = mlb.f(f2, fArr[2] <= 0.85f ? 0.25f : 0.45f, 1.0f, 0.0f);
            fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.15f));
            return Color.HSVToColor(80, fArr);
        }
        fArr[0] = f;
        fArr[1] = mlb.f(f2, fArr[2] <= 0.85f ? 0.25f : 0.45f, 1.0f, 0.0f);
        fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.15f));
        return Color.HSVToColor(80, fArr);
    }
}
