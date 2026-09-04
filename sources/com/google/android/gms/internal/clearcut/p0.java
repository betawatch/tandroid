package com.google.android.gms.internal.clearcut;

import androidx.car.app.navigation.model.Maneuver;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class p0 implements z0 {
    public static final Unsafe o = j1.f();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final int e;
    public final i f;
    public final boolean g;
    public final int[] h;
    public final int[] i;
    public final int[] j;
    public final r0 k;
    public final g0 l;
    public final c1 m;
    public final m0 n;

    public p0(int[] iArr, Object[] objArr, int i10, int i11, int i12, i iVar, boolean z10, int[] iArr2, int[] iArr3, int[] iArr4, r0 r0Var, g0 g0Var, c1 c1Var, q qVar, m0 m0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.g = z10;
        this.h = iArr2;
        this.i = iArr3;
        this.j = iArr4;
        this.k = r0Var;
        this.l = g0Var;
        this.m = c1Var;
        this.f = iVar;
        this.n = m0Var;
    }

    public static int A(Object obj, long j3) {
        return ((Integer) j1.k(obj, j3)).intValue();
    }

    public static long B(Object obj, long j3) {
        return ((Long) j1.k(obj, j3)).longValue();
    }

    public static int h(z0 z0Var, int i10, byte[] bArr, int i11, int i12, b0 b0Var, l lVar) {
        int j3 = j(z0Var, bArr, i11, i12, lVar);
        while (true) {
            b0Var.add(lVar.c);
            if (j3 >= i12) {
                break;
            }
            int f7 = m1.f(bArr, j3, lVar);
            if (i10 != lVar.a) {
                break;
            }
            j3 = j(z0Var, bArr, f7, i12, lVar);
        }
        return j3;
    }

    public static int i(z0 z0Var, byte[] bArr, int i10, int i11, int i12, l lVar) {
        p0 p0Var = (p0) z0Var;
        Object a2 = p0Var.a();
        int m10 = p0Var.m(a2, bArr, i10, i11, i12, lVar);
        p0Var.b(a2);
        lVar.c = a2;
        return m10;
    }

    public static int j(z0 z0Var, byte[] bArr, int i10, int i11, l lVar) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = m1.d(i13, bArr, i12, lVar);
            i13 = lVar.a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw c0.a();
        }
        Object a2 = z0Var.a();
        int i15 = i14 + i13;
        z0Var.f(a2, bArr, i14, i15, lVar);
        z0Var.b(a2);
        lVar.c = a2;
        return i15;
    }

    public static p0 n(x0 x0Var, r0 r0Var, g0 g0Var, c1 c1Var, q qVar, m0 m0Var) {
        int i10;
        int i11;
        int i12;
        int[] iArr;
        t tVar;
        int i13;
        int i14;
        int i15;
        Field b10;
        Field b11;
        Field b12;
        if (!(x0Var instanceof x0)) {
            x0Var.getClass();
            throw new ClassCastException();
        }
        y0 y0Var = x0Var.b;
        boolean z10 = (y0Var.d & 1) != 1;
        if (y0Var.e == 0) {
            i10 = 0;
            i11 = 0;
            i12 = 0;
        } else {
            int i16 = y0Var.g;
            int i17 = y0Var.h;
            i10 = y0Var.k;
            i11 = i16;
            i12 = i17;
        }
        int[] iArr2 = new int[i10 << 2];
        Object[] objArr = new Object[i10 << 1];
        int i18 = y0Var.i;
        int[] iArr3 = i18 > 0 ? new int[i18] : null;
        int i19 = y0Var.l;
        int[] iArr4 = i19 > 0 ? new int[i19] : null;
        boolean a2 = y0Var.a();
        Class cls = y0Var.c;
        Object[] objArr2 = y0Var.b;
        if (a2) {
            int i20 = y0Var.s;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            while (true) {
                if (i20 >= y0Var.j || i21 >= ((i20 - i11) << 2)) {
                    int i24 = y0Var.u;
                    t tVar2 = t.s;
                    if (i24 > tVar2.a) {
                        int i25 = y0Var.v << 1;
                        Object obj = objArr2[i25];
                        iArr = iArr2;
                        if (obj instanceof Field) {
                            b11 = (Field) obj;
                        } else {
                            b11 = y0.b(cls, (String) obj);
                            objArr2[i25] = b11;
                        }
                        i1 i1Var = j1.d;
                        tVar = tVar2;
                        i13 = (int) i1Var.a(b11);
                        int i26 = (y0Var.v << 1) + 1;
                        Object obj2 = objArr2[i26];
                        if (obj2 instanceof Field) {
                            b12 = (Field) obj2;
                        } else {
                            b12 = y0.b(cls, (String) obj2);
                            objArr2[i26] = b12;
                        }
                        i15 = (int) i1Var.a(b12);
                        i14 = 0;
                    } else {
                        iArr = iArr2;
                        tVar = tVar2;
                        Field field = y0Var.x;
                        i1 i1Var2 = j1.d;
                        int a10 = (int) i1Var2.a(field);
                        if ((y0Var.d & 1) != 1 || y0Var.u > t.d.a) {
                            i13 = a10;
                            i14 = 0;
                            i15 = 0;
                        } else {
                            int i27 = (y0Var.w / 32) + (y0Var.f << 1);
                            Object obj3 = objArr2[i27];
                            if (obj3 instanceof Field) {
                                b10 = (Field) obj3;
                            } else {
                                b10 = y0.b(cls, (String) obj3);
                                objArr2[i27] = b10;
                            }
                            i15 = (int) i1Var2.a(b10);
                            i14 = y0Var.w % 32;
                            i13 = a10;
                        }
                    }
                    iArr[i21] = y0Var.s;
                    int i28 = i21 + 1;
                    int i29 = i14;
                    int i30 = y0Var.t;
                    int i31 = i15;
                    int i32 = ((i30 & 256) != 0 ? TLObject.FLAG_28 : 0) | ((i30 & 512) != 0 ? TLObject.FLAG_29 : 0);
                    int i33 = y0Var.u;
                    iArr[i28] = i32 | (i33 << 20) | i13;
                    iArr[i21 + 2] = (i29 << 20) | i31;
                    Object obj4 = y0Var.A;
                    if (obj4 != null) {
                        int i34 = (i21 / 4) << 1;
                        objArr[i34] = obj4;
                        Object obj5 = y0Var.y;
                        if (obj5 != null) {
                            objArr[i34 + 1] = obj5;
                        } else {
                            Object obj6 = y0Var.z;
                            if (obj6 != null) {
                                objArr[i34 + 1] = obj6;
                            }
                        }
                    } else {
                        Object obj7 = y0Var.y;
                        if (obj7 != null) {
                            objArr[((i21 / 4) << 1) + 1] = obj7;
                        } else {
                            Object obj8 = y0Var.z;
                            if (obj8 != null) {
                                objArr[((i21 / 4) << 1) + 1] = obj8;
                            }
                        }
                    }
                    if (i33 == tVar.ordinal()) {
                        iArr3[i22] = i21;
                        i22++;
                    } else if (i33 >= 18 && i33 <= 49) {
                        iArr4[i23] = iArr[i28] & 1048575;
                        i23++;
                    }
                    if (!y0Var.a()) {
                        break;
                    }
                    i20 = y0Var.s;
                } else {
                    for (int i35 = 0; i35 < 4; i35++) {
                        iArr2[i21 + i35] = -1;
                    }
                    iArr = iArr2;
                }
                i21 += 4;
                iArr2 = iArr;
            }
        } else {
            iArr = iArr2;
        }
        return new p0(iArr, objArr, i11, i12, y0Var.j, x0Var.a, z10, y0Var.m, iArr3, iArr4, r0Var, g0Var, c1Var, qVar, m0Var);
    }

    @Override // com.google.android.gms.internal.clearcut.z0
    public final Object a() {
        this.k.getClass();
        return ((y) this.f).a(4);
    }

    @Override // com.google.android.gms.internal.clearcut.z0
    public final void b(Object obj) {
        int[] iArr = this.i;
        if (iArr != null) {
            for (int i10 : iArr) {
                long v = v(i10) & 1048575;
                Object k10 = j1.k(obj, v);
                if (k10 != null) {
                    this.n.getClass();
                    ((l0) k10).a = false;
                    j1.d(obj, v, k10);
                }
            }
        }
        int[] iArr2 = this.j;
        if (iArr2 != null) {
            for (int i11 : iArr2) {
                this.l.a(obj, i11);
            }
        }
        this.m.getClass();
        ((y) obj).zzjp.d = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.clearcut.z0
    public final void c(y yVar, y yVar2) {
        y yVar3;
        i1 i1Var;
        long h;
        int i10;
        yVar2.getClass();
        int i11 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i11 >= iArr.length) {
                y yVar4 = yVar;
                if (this.g) {
                    return;
                }
                a1.a(this.m, yVar4, yVar2);
                return;
            }
            int v = v(i11);
            long j3 = v & 1048575;
            int i12 = iArr[i11];
            switch ((v & 267386880) >>> 20) {
                case 0:
                    yVar3 = yVar;
                    if (!r(i11, yVar2)) {
                        break;
                    } else {
                        i1 i1Var2 = j1.d;
                        i1Var2.c(yVar3, j3, i1Var2.k(yVar2, j3));
                        x(i11, yVar3);
                        break;
                    }
                case 1:
                    yVar3 = yVar;
                    if (!r(i11, yVar2)) {
                        break;
                    } else {
                        i1 i1Var3 = j1.d;
                        i1Var3.d(yVar3, j3, i1Var3.j(yVar2, j3));
                        x(i11, yVar3);
                        break;
                    }
                case 2:
                    yVar3 = yVar;
                    if (!r(i11, yVar2)) {
                        break;
                    }
                    i1Var = j1.d;
                    h = i1Var.h(yVar2, j3);
                    i1Var.e(yVar3, j3, h);
                    x(i11, yVar3);
                    break;
                case 3:
                    yVar3 = yVar;
                    if (!r(i11, yVar2)) {
                        break;
                    }
                    i1Var = j1.d;
                    h = i1Var.h(yVar2, j3);
                    i1Var.e(yVar3, j3, h);
                    x(i11, yVar3);
                    break;
                case 4:
                    yVar3 = yVar;
                    if (!r(i11, yVar2)) {
                        break;
                    }
                    j1.b(j3, yVar3, j1.d.g(yVar2, j3));
                    x(i11, yVar3);
                    break;
                case 5:
                    yVar3 = yVar;
                    if (!r(i11, yVar2)) {
                        break;
                    }
                    i1Var = j1.d;
                    h = i1Var.h(yVar2, j3);
                    i1Var.e(yVar3, j3, h);
                    x(i11, yVar3);
                    break;
                case 6:
                    yVar3 = yVar;
                    if (!r(i11, yVar2)) {
                        break;
                    }
                    j1.b(j3, yVar3, j1.d.g(yVar2, j3));
                    x(i11, yVar3);
                    break;
                case 7:
                    yVar3 = yVar;
                    if (!r(i11, yVar2)) {
                        break;
                    } else {
                        i1 i1Var4 = j1.d;
                        i1Var4.f(yVar3, j3, i1Var4.i(yVar2, j3));
                        x(i11, yVar3);
                        break;
                    }
                case 8:
                    yVar3 = yVar;
                    if (!r(i11, yVar2)) {
                        break;
                    }
                    j1.d(yVar3, j3, j1.k(yVar2, j3));
                    x(i11, yVar3);
                    break;
                case 9:
                    yVar3 = yVar;
                    o(i11, yVar3, yVar2);
                    break;
                case 10:
                    yVar3 = yVar;
                    if (!r(i11, yVar2)) {
                        break;
                    }
                    j1.d(yVar3, j3, j1.k(yVar2, j3));
                    x(i11, yVar3);
                    break;
                case 11:
                    yVar3 = yVar;
                    if (!r(i11, yVar2)) {
                        break;
                    }
                    j1.b(j3, yVar3, j1.d.g(yVar2, j3));
                    x(i11, yVar3);
                    break;
                case 12:
                    yVar3 = yVar;
                    if (!r(i11, yVar2)) {
                        break;
                    }
                    j1.b(j3, yVar3, j1.d.g(yVar2, j3));
                    x(i11, yVar3);
                    break;
                case 13:
                    yVar3 = yVar;
                    if (!r(i11, yVar2)) {
                        break;
                    }
                    j1.b(j3, yVar3, j1.d.g(yVar2, j3));
                    x(i11, yVar3);
                    break;
                case 14:
                    yVar3 = yVar;
                    if (!r(i11, yVar2)) {
                        break;
                    }
                    i1Var = j1.d;
                    h = i1Var.h(yVar2, j3);
                    i1Var.e(yVar3, j3, h);
                    x(i11, yVar3);
                    break;
                case 15:
                    yVar3 = yVar;
                    if (!r(i11, yVar2)) {
                        break;
                    }
                    j1.b(j3, yVar3, j1.d.g(yVar2, j3));
                    x(i11, yVar3);
                    break;
                case 16:
                    if (r(i11, yVar2)) {
                        i1Var = j1.d;
                        h = i1Var.h(yVar2, j3);
                        yVar3 = yVar;
                        i1Var.e(yVar3, j3, h);
                        x(i11, yVar3);
                        break;
                    }
                    yVar3 = yVar;
                    break;
                case 17:
                    o(i11, yVar, yVar2);
                    yVar3 = yVar;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                case 48:
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    this.l.b(yVar, j3, yVar2);
                    yVar3 = yVar;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Class cls = a1.a;
                    Object k10 = j1.k(yVar, j3);
                    Object k11 = j1.k(yVar2, j3);
                    this.n.getClass();
                    j1.d(yVar, j3, m0.a(k10, k11));
                    yVar3 = yVar;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (q(i12, i11, yVar2)) {
                        j1.d(yVar, j3, j1.k(yVar2, j3));
                        i10 = iArr[i11 + 2];
                        j1.b(i10 & 1048575, yVar, i12);
                    }
                    yVar3 = yVar;
                    break;
                case 60:
                case 68:
                    y(i11, yVar, yVar2);
                    yVar3 = yVar;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                case 66:
                case 67:
                    if (q(i12, i11, yVar2)) {
                        j1.d(yVar, j3, j1.k(yVar2, j3));
                        i10 = iArr[i11 + 2];
                        j1.b(i10 & 1048575, yVar, i12);
                    }
                    yVar3 = yVar;
                    break;
                default:
                    yVar3 = yVar;
                    break;
            }
            i11 += 4;
            yVar = yVar3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        if (com.google.android.gms.internal.clearcut.a1.c(com.google.android.gms.internal.clearcut.j1.k(r12, r7), com.google.android.gms.internal.clearcut.j1.k(r13, r7)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (r5.h(r12, r7) != r5.h(r13, r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        if (r5.g(r12, r7) != r5.g(r13, r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
    
        if (r5.h(r12, r7) != r5.h(r13, r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
    
        if (r5.g(r12, r7) != r5.g(r13, r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        if (r5.g(r12, r7) != r5.g(r13, r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d6, code lost:
    
        if (r5.g(r12, r7) != r5.g(r13, r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ec, code lost:
    
        if (com.google.android.gms.internal.clearcut.a1.c(com.google.android.gms.internal.clearcut.j1.k(r12, r7), com.google.android.gms.internal.clearcut.j1.k(r13, r7)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0102, code lost:
    
        if (com.google.android.gms.internal.clearcut.a1.c(com.google.android.gms.internal.clearcut.j1.k(r12, r7), com.google.android.gms.internal.clearcut.j1.k(r13, r7)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0118, code lost:
    
        if (com.google.android.gms.internal.clearcut.a1.c(com.google.android.gms.internal.clearcut.j1.k(r12, r7), com.google.android.gms.internal.clearcut.j1.k(r13, r7)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012c, code lost:
    
        if (r5.i(r12, r7) != r5.i(r13, r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0140, code lost:
    
        if (r5.g(r12, r7) != r5.g(r13, r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0156, code lost:
    
        if (r5.h(r12, r7) != r5.h(r13, r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016a, code lost:
    
        if (r5.g(r12, r7) != r5.g(r13, r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0180, code lost:
    
        if (r5.h(r12, r7) != r5.h(r13, r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0196, code lost:
    
        if (r5.h(r12, r7) != r5.h(r13, r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01aa, code lost:
    
        if (r5.g(r12, r7) != r5.g(r13, r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c0, code lost:
    
        if (r5.h(r12, r7) != r5.h(r13, r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if (com.google.android.gms.internal.clearcut.a1.c(com.google.android.gms.internal.clearcut.j1.k(r12, r7), com.google.android.gms.internal.clearcut.j1.k(r13, r7)) != false) goto L104;
     */
    @Override // com.google.android.gms.internal.clearcut.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(y yVar, y yVar2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 < length) {
                int v = v(i10);
                long j3 = v & 1048575;
                switch ((v & 267386880) >>> 20) {
                    case 0:
                        if (z(yVar, yVar2, i10)) {
                            i1 i1Var = j1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 1:
                        if (z(yVar, yVar2, i10)) {
                            i1 i1Var2 = j1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 2:
                        if (z(yVar, yVar2, i10)) {
                            i1 i1Var3 = j1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 3:
                        if (z(yVar, yVar2, i10)) {
                            i1 i1Var4 = j1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 4:
                        if (z(yVar, yVar2, i10)) {
                            i1 i1Var5 = j1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 5:
                        if (z(yVar, yVar2, i10)) {
                            i1 i1Var6 = j1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 6:
                        if (z(yVar, yVar2, i10)) {
                            i1 i1Var7 = j1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 7:
                        if (z(yVar, yVar2, i10)) {
                            i1 i1Var8 = j1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 8:
                        if (z(yVar, yVar2, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 9:
                        if (z(yVar, yVar2, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 10:
                        if (z(yVar, yVar2, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 11:
                        if (z(yVar, yVar2, i10)) {
                            i1 i1Var9 = j1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 12:
                        if (z(yVar, yVar2, i10)) {
                            i1 i1Var10 = j1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 13:
                        if (z(yVar, yVar2, i10)) {
                            i1 i1Var11 = j1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 14:
                        if (z(yVar, yVar2, i10)) {
                            i1 i1Var12 = j1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 15:
                        if (z(yVar, yVar2, i10)) {
                            i1 i1Var13 = j1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 16:
                        if (z(yVar, yVar2, i10)) {
                            i1 i1Var14 = j1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 17:
                        if (z(yVar, yVar2, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    case 48:
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        z10 = a1.c(j1.k(yVar, j3), j1.k(yVar2, j3));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case VoIPService.CALL_MIN_LAYER /* 65 */:
                    case 66:
                    case 67:
                    case 68:
                        long j10 = iArr[i10 + 2] & 1048575;
                        i1 i1Var15 = j1.d;
                        if (i1Var15.g(yVar, j10) == i1Var15.g(yVar2, j10)) {
                            break;
                        }
                        z10 = false;
                        break;
                }
                if (z10) {
                    i10 += 4;
                }
            } else {
                this.m.getClass();
                if (yVar.zzjp.equals(yVar2.zzjp)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ab, code lost:
    
        if (r4 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ad, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00af, code lost:
    
        r3 = r8 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x015e, code lost:
    
        if (r4 != false) goto L44;
     */
    @Override // com.google.android.gms.internal.clearcut.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(y yVar) {
        int i10;
        long doubleToLongBits;
        int floatToIntBits;
        int i11;
        long doubleToLongBits2;
        Object k10;
        int[] iArr = this.a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 4) {
            int v = v(i13);
            int i14 = iArr[i13];
            long j3 = 1048575 & v;
            int i15 = 1237;
            int i16 = 37;
            switch ((v & 267386880) >>> 20) {
                case 0:
                    i10 = i12 * 53;
                    doubleToLongBits = Double.doubleToLongBits(j1.d.k(yVar, j3));
                    floatToIntBits = z.b(doubleToLongBits);
                    i12 = floatToIntBits + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    floatToIntBits = Float.floatToIntBits(j1.d.j(yVar, j3));
                    i12 = floatToIntBits + i10;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i10 = i12 * 53;
                    doubleToLongBits = j1.d.h(yVar, j3);
                    floatToIntBits = z.b(doubleToLongBits);
                    i12 = floatToIntBits + i10;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i10 = i12 * 53;
                    floatToIntBits = j1.d.g(yVar, j3);
                    i12 = floatToIntBits + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean i17 = j1.d.i(yVar, j3);
                    Charset charset = z.a;
                    break;
                case 8:
                    i10 = i12 * 53;
                    floatToIntBits = ((String) j1.k(yVar, j3)).hashCode();
                    i12 = floatToIntBits + i10;
                    break;
                case 9:
                    Object k11 = j1.k(yVar, j3);
                    if (k11 != null) {
                        i16 = k11.hashCode();
                    }
                    i12 = (i12 * 53) + i16;
                    break;
                case 10:
                    i10 = i12 * 53;
                    floatToIntBits = j1.k(yVar, j3).hashCode();
                    i12 = floatToIntBits + i10;
                    break;
                case 17:
                    Object k12 = j1.k(yVar, j3);
                    if (k12 != null) {
                        i16 = k12.hashCode();
                    }
                    i12 = (i12 * 53) + i16;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                case 48:
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    i10 = i12 * 53;
                    k10 = j1.k(yVar, j3);
                    floatToIntBits = k10.hashCode();
                    i12 = floatToIntBits + i10;
                    break;
                case 51:
                    if (q(i14, i13, yVar)) {
                        i10 = i12 * 53;
                        doubleToLongBits2 = Double.doubleToLongBits(((Double) j1.k(yVar, j3)).doubleValue());
                        floatToIntBits = z.b(doubleToLongBits2);
                        i12 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(i14, i13, yVar)) {
                        i10 = i12 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) j1.k(yVar, j3)).floatValue());
                        i12 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (!q(i14, i13, yVar)) {
                        break;
                    }
                    i10 = i12 * 53;
                    doubleToLongBits2 = B(yVar, j3);
                    floatToIntBits = z.b(doubleToLongBits2);
                    i12 = floatToIntBits + i10;
                    break;
                case 54:
                    if (!q(i14, i13, yVar)) {
                        break;
                    }
                    i10 = i12 * 53;
                    doubleToLongBits2 = B(yVar, j3);
                    floatToIntBits = z.b(doubleToLongBits2);
                    i12 = floatToIntBits + i10;
                    break;
                case 55:
                    if (!q(i14, i13, yVar)) {
                        break;
                    }
                    i10 = i12 * 53;
                    floatToIntBits = A(yVar, j3);
                    i12 = floatToIntBits + i10;
                    break;
                case 56:
                    if (!q(i14, i13, yVar)) {
                        break;
                    }
                    i10 = i12 * 53;
                    doubleToLongBits2 = B(yVar, j3);
                    floatToIntBits = z.b(doubleToLongBits2);
                    i12 = floatToIntBits + i10;
                    break;
                case 57:
                    if (!q(i14, i13, yVar)) {
                        break;
                    }
                    i10 = i12 * 53;
                    floatToIntBits = A(yVar, j3);
                    i12 = floatToIntBits + i10;
                    break;
                case 58:
                    if (q(i14, i13, yVar)) {
                        i11 = i12 * 53;
                        boolean booleanValue = ((Boolean) j1.k(yVar, j3)).booleanValue();
                        Charset charset2 = z.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(i14, i13, yVar)) {
                        i10 = i12 * 53;
                        floatToIntBits = ((String) j1.k(yVar, j3)).hashCode();
                        i12 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (!q(i14, i13, yVar)) {
                        break;
                    }
                    k10 = j1.k(yVar, j3);
                    i10 = i12 * 53;
                    floatToIntBits = k10.hashCode();
                    i12 = floatToIntBits + i10;
                    break;
                case 61:
                    if (!q(i14, i13, yVar)) {
                        break;
                    }
                    i10 = i12 * 53;
                    k10 = j1.k(yVar, j3);
                    floatToIntBits = k10.hashCode();
                    i12 = floatToIntBits + i10;
                    break;
                case 62:
                    if (!q(i14, i13, yVar)) {
                        break;
                    }
                    i10 = i12 * 53;
                    floatToIntBits = A(yVar, j3);
                    i12 = floatToIntBits + i10;
                    break;
                case 63:
                    if (!q(i14, i13, yVar)) {
                        break;
                    }
                    i10 = i12 * 53;
                    floatToIntBits = A(yVar, j3);
                    i12 = floatToIntBits + i10;
                    break;
                case 64:
                    if (!q(i14, i13, yVar)) {
                        break;
                    }
                    i10 = i12 * 53;
                    floatToIntBits = A(yVar, j3);
                    i12 = floatToIntBits + i10;
                    break;
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (!q(i14, i13, yVar)) {
                        break;
                    }
                    i10 = i12 * 53;
                    doubleToLongBits2 = B(yVar, j3);
                    floatToIntBits = z.b(doubleToLongBits2);
                    i12 = floatToIntBits + i10;
                    break;
                case 66:
                    if (!q(i14, i13, yVar)) {
                        break;
                    }
                    i10 = i12 * 53;
                    floatToIntBits = A(yVar, j3);
                    i12 = floatToIntBits + i10;
                    break;
                case 67:
                    if (!q(i14, i13, yVar)) {
                        break;
                    }
                    i10 = i12 * 53;
                    doubleToLongBits2 = B(yVar, j3);
                    floatToIntBits = z.b(doubleToLongBits2);
                    i12 = floatToIntBits + i10;
                    break;
                case 68:
                    if (!q(i14, i13, yVar)) {
                        break;
                    }
                    k10 = j1.k(yVar, j3);
                    i10 = i12 * 53;
                    floatToIntBits = k10.hashCode();
                    i12 = floatToIntBits + i10;
                    break;
            }
        }
        this.m.getClass();
        return yVar.zzjp.hashCode() + (i12 * 53);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x01d7, code lost:
    
        if (r6 == r9) goto L93;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0041. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0218  */
    @Override // com.google.android.gms.internal.clearcut.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Object obj, byte[] bArr, int i10, int i11, l lVar) {
        Unsafe unsafe;
        int i12;
        int i13;
        b1 b1Var;
        int k10;
        Unsafe unsafe2;
        Object obj2;
        Object a2;
        Object obj3;
        int i14;
        p0 p0Var = this;
        byte[] bArr2 = bArr;
        int i15 = i11;
        l lVar2 = lVar;
        if (!p0Var.g) {
            m(obj, bArr, i10, i15, 0, lVar);
            return;
        }
        Unsafe unsafe3 = o;
        int i16 = i10;
        while (i16 < i15) {
            int i17 = i16 + 1;
            int i18 = bArr2[i16];
            if (i18 < 0) {
                i17 = m1.d(i18, bArr2, i17, lVar2);
                i18 = lVar2.a;
            }
            int i19 = i18;
            int i20 = i17;
            int i21 = i19 >>> 3;
            int i22 = i19 & 7;
            int w10 = p0Var.w(i21);
            if (w10 >= 0) {
                int i23 = p0Var.a[w10 + 1];
                int i24 = (267386880 & i23) >>> 20;
                long j3 = 1048575 & i23;
                if (i24 <= 17) {
                    switch (i24) {
                        case 0:
                            unsafe = unsafe3;
                            if (i22 != 1) {
                                i12 = i20;
                                i13 = i12;
                                y yVar = (y) obj;
                                b1Var = yVar.zzjp;
                                if (b1Var == b1.e) {
                                    b1Var = b1.b();
                                    yVar.zzjp = b1Var;
                                }
                                i16 = m1.c(i19, bArr, i13, i11, b1Var, lVar);
                                p0Var = this;
                                bArr2 = bArr;
                                lVar2 = lVar;
                                i15 = i11;
                                break;
                            } else {
                                j1.d.c(obj, j3, Double.longBitsToDouble(m1.r(i20, bArr2)));
                                i16 = i20 + 8;
                                break;
                            }
                        case 1:
                            unsafe = unsafe3;
                            if (i22 == 5) {
                                j1.d.d(obj, j3, Float.intBitsToFloat(m1.o(i20, bArr2)));
                                i16 = i20 + 4;
                                break;
                            }
                            i12 = i20;
                            i13 = i12;
                            y yVar2 = (y) obj;
                            b1Var = yVar2.zzjp;
                            if (b1Var == b1.e) {
                            }
                            i16 = m1.c(i19, bArr, i13, i11, b1Var, lVar);
                            p0Var = this;
                            bArr2 = bArr;
                            lVar2 = lVar;
                            i15 = i11;
                            break;
                        case 2:
                        case 3:
                            Unsafe unsafe4 = unsafe3;
                            if (i22 != 0) {
                                unsafe = unsafe4;
                                i12 = i20;
                                i13 = i12;
                                y yVar22 = (y) obj;
                                b1Var = yVar22.zzjp;
                                if (b1Var == b1.e) {
                                }
                                i16 = m1.c(i19, bArr, i13, i11, b1Var, lVar);
                                p0Var = this;
                                bArr2 = bArr;
                                lVar2 = lVar;
                                i15 = i11;
                                break;
                            } else {
                                int m10 = m1.m(bArr2, i20, lVar2);
                                unsafe4.putLong(obj, j3, lVar2.b);
                                unsafe = unsafe4;
                                i16 = m10;
                                break;
                            }
                            break;
                        case 4:
                        case 11:
                            unsafe2 = unsafe3;
                            if (i22 != 0) {
                                i12 = i20;
                                unsafe = unsafe2;
                                i13 = i12;
                                y yVar222 = (y) obj;
                                b1Var = yVar222.zzjp;
                                if (b1Var == b1.e) {
                                }
                                i16 = m1.c(i19, bArr, i13, i11, b1Var, lVar);
                                p0Var = this;
                                bArr2 = bArr;
                                lVar2 = lVar;
                                i15 = i11;
                                break;
                            } else {
                                i16 = m1.f(bArr2, i20, lVar2);
                                unsafe2.putInt(obj, j3, lVar2.a);
                                unsafe3 = unsafe2;
                                break;
                            }
                            break;
                        case 5:
                        case 14:
                            unsafe2 = unsafe3;
                            if (i22 != 1) {
                                i12 = i20;
                                unsafe = unsafe2;
                                i13 = i12;
                                y yVar2222 = (y) obj;
                                b1Var = yVar2222.zzjp;
                                if (b1Var == b1.e) {
                                }
                                i16 = m1.c(i19, bArr, i13, i11, b1Var, lVar);
                                p0Var = this;
                                bArr2 = bArr;
                                lVar2 = lVar;
                                i15 = i11;
                                break;
                            } else {
                                unsafe2.putLong(obj, j3, m1.r(i20, bArr2));
                                i16 = i20 + 8;
                                unsafe3 = unsafe2;
                                break;
                            }
                            break;
                        case 6:
                        case 13:
                            unsafe2 = unsafe3;
                            if (i22 != 5) {
                                i12 = i20;
                                unsafe = unsafe2;
                                i13 = i12;
                                y yVar22222 = (y) obj;
                                b1Var = yVar22222.zzjp;
                                if (b1Var == b1.e) {
                                }
                                i16 = m1.c(i19, bArr, i13, i11, b1Var, lVar);
                                p0Var = this;
                                bArr2 = bArr;
                                lVar2 = lVar;
                                i15 = i11;
                                break;
                            } else {
                                unsafe2.putInt(obj, j3, m1.o(i20, bArr2));
                                i16 = i20 + 4;
                                unsafe3 = unsafe2;
                                break;
                            }
                            break;
                        case 7:
                            unsafe2 = unsafe3;
                            if (i22 != 0) {
                                i12 = i20;
                                unsafe = unsafe2;
                                i13 = i12;
                                y yVar222222 = (y) obj;
                                b1Var = yVar222222.zzjp;
                                if (b1Var == b1.e) {
                                }
                                i16 = m1.c(i19, bArr, i13, i11, b1Var, lVar);
                                p0Var = this;
                                bArr2 = bArr;
                                lVar2 = lVar;
                                i15 = i11;
                                break;
                            } else {
                                i16 = m1.m(bArr2, i20, lVar2);
                                j1.d.f(obj, j3, lVar2.b != 0);
                                unsafe3 = unsafe2;
                                break;
                            }
                            break;
                        case 8:
                            unsafe2 = unsafe3;
                            obj2 = obj;
                            if (i22 != 2) {
                                i12 = i20;
                                unsafe = unsafe2;
                                i13 = i12;
                                y yVar2222222 = (y) obj;
                                b1Var = yVar2222222.zzjp;
                                if (b1Var == b1.e) {
                                }
                                i16 = m1.c(i19, bArr, i13, i11, b1Var, lVar);
                                p0Var = this;
                                bArr2 = bArr;
                                lVar2 = lVar;
                                i15 = i11;
                                break;
                            } else {
                                if ((536870912 & i23) == 0) {
                                    i16 = m1.f(bArr2, i20, lVar2);
                                    int i25 = lVar2.a;
                                    if (i25 == 0) {
                                        lVar2.c = "";
                                    } else {
                                        lVar2.c = new String(bArr2, i16, i25, z.a);
                                        i16 += i25;
                                    }
                                } else {
                                    i16 = m1.q(bArr2, i20, lVar2);
                                }
                                a2 = lVar2.c;
                                unsafe2.putObject(obj2, j3, a2);
                                unsafe3 = unsafe2;
                                break;
                            }
                            break;
                        case 9:
                            unsafe2 = unsafe3;
                            obj2 = obj;
                            if (i22 != 2) {
                                i12 = i20;
                                unsafe = unsafe2;
                                i13 = i12;
                                y yVar22222222 = (y) obj;
                                b1Var = yVar22222222.zzjp;
                                if (b1Var == b1.e) {
                                }
                                i16 = m1.c(i19, bArr, i13, i11, b1Var, lVar);
                                p0Var = this;
                                bArr2 = bArr;
                                lVar2 = lVar;
                                i15 = i11;
                                break;
                            } else {
                                i16 = j(p0Var.s(w10), bArr2, i20, i15, lVar2);
                                Object object = unsafe2.getObject(obj2, j3);
                                a2 = object == null ? lVar2.c : z.a(object, lVar2.c);
                                unsafe2.putObject(obj2, j3, a2);
                                unsafe3 = unsafe2;
                                break;
                            }
                            break;
                        case 10:
                            unsafe2 = unsafe3;
                            obj2 = obj;
                            if (i22 != 2) {
                                i12 = i20;
                                unsafe = unsafe2;
                                i13 = i12;
                                y yVar222222222 = (y) obj;
                                b1Var = yVar222222222.zzjp;
                                if (b1Var == b1.e) {
                                }
                                i16 = m1.c(i19, bArr, i13, i11, b1Var, lVar);
                                p0Var = this;
                                bArr2 = bArr;
                                lVar2 = lVar;
                                i15 = i11;
                                break;
                            } else {
                                i16 = m1.s(bArr2, i20, lVar2);
                                a2 = lVar2.c;
                                unsafe2.putObject(obj2, j3, a2);
                                unsafe3 = unsafe2;
                                break;
                            }
                            break;
                        case 12:
                            unsafe2 = unsafe3;
                            obj3 = obj;
                            if (i22 != 0) {
                                i12 = i20;
                                unsafe = unsafe2;
                                i13 = i12;
                                y yVar2222222222 = (y) obj;
                                b1Var = yVar2222222222.zzjp;
                                if (b1Var == b1.e) {
                                }
                                i16 = m1.c(i19, bArr, i13, i11, b1Var, lVar);
                                p0Var = this;
                                bArr2 = bArr;
                                lVar2 = lVar;
                                i15 = i11;
                                break;
                            } else {
                                i16 = m1.f(bArr2, i20, lVar2);
                                i14 = lVar2.a;
                                unsafe2.putInt(obj3, j3, i14);
                                unsafe3 = unsafe2;
                                break;
                            }
                            break;
                        case 15:
                            unsafe2 = unsafe3;
                            obj3 = obj;
                            if (i22 != 0) {
                                i12 = i20;
                                unsafe = unsafe2;
                                i13 = i12;
                                y yVar22222222222 = (y) obj;
                                b1Var = yVar22222222222.zzjp;
                                if (b1Var == b1.e) {
                                }
                                i16 = m1.c(i19, bArr, i13, i11, b1Var, lVar);
                                p0Var = this;
                                bArr2 = bArr;
                                lVar2 = lVar;
                                i15 = i11;
                                break;
                            } else {
                                i16 = m1.f(bArr2, i20, lVar2);
                                int i26 = lVar2.a;
                                i14 = (-(i26 & 1)) ^ (i26 >>> 1);
                                unsafe2.putInt(obj3, j3, i14);
                                unsafe3 = unsafe2;
                                break;
                            }
                            break;
                        case 16:
                            if (i22 != 0) {
                                unsafe2 = unsafe3;
                                i12 = i20;
                                unsafe = unsafe2;
                                i13 = i12;
                                y yVar222222222222 = (y) obj;
                                b1Var = yVar222222222222.zzjp;
                                if (b1Var == b1.e) {
                                }
                                i16 = m1.c(i19, bArr, i13, i11, b1Var, lVar);
                                p0Var = this;
                                bArr2 = bArr;
                                lVar2 = lVar;
                                i15 = i11;
                                break;
                            } else {
                                int m11 = m1.m(bArr2, i20, lVar2);
                                long j10 = lVar2.b;
                                unsafe3.putLong(obj, j3, (-(j10 & 1)) ^ (j10 >>> 1));
                                unsafe2 = unsafe3;
                                i16 = m11;
                                unsafe3 = unsafe2;
                                break;
                            }
                            break;
                    }
                } else {
                    unsafe = unsafe3;
                    if (i24 == 27) {
                        if (i22 == 2) {
                            b0 b0Var = (b0) unsafe.getObject(obj, j3);
                            if (!((j) b0Var).a) {
                                int size = b0Var.size();
                                b0Var = b0Var.f(size == 0 ? 10 : size << 1);
                                unsafe.putObject(obj, j3, b0Var);
                            }
                            i16 = h(p0Var.s(w10), i19, bArr2, i20, i15, b0Var, lVar2);
                            bArr2 = bArr;
                            i15 = i11;
                            lVar2 = lVar;
                        } else {
                            i19 = i19;
                            i12 = i20;
                            i13 = i12;
                            y yVar2222222222222 = (y) obj;
                            b1Var = yVar2222222222222.zzjp;
                            if (b1Var == b1.e) {
                            }
                            i16 = m1.c(i19, bArr, i13, i11, b1Var, lVar);
                            p0Var = this;
                            bArr2 = bArr;
                            lVar2 = lVar;
                            i15 = i11;
                        }
                    } else if (i24 <= 49) {
                        i19 = i19;
                        k10 = p0Var.l(obj, bArr, i20, i11, i19, i21, i22, w10, i23, i24, j3, lVar);
                    } else {
                        i19 = i19;
                        if (i24 != 50) {
                            k10 = p0Var.k(obj, bArr, i20, i11, i19, i21, i22, i23, i24, j3, w10, lVar);
                            if (k10 != i20) {
                                p0Var = this;
                                bArr2 = bArr;
                                i15 = i11;
                                lVar2 = lVar;
                                i16 = k10;
                            }
                            i13 = k10;
                            y yVar22222222222222 = (y) obj;
                            b1Var = yVar22222222222222.zzjp;
                            if (b1Var == b1.e) {
                            }
                            i16 = m1.c(i19, bArr, i13, i11, b1Var, lVar);
                            p0Var = this;
                            bArr2 = bArr;
                            lVar2 = lVar;
                            i15 = i11;
                        } else {
                            if (i22 == 2) {
                                p0Var.p(j3, obj, w10);
                                throw null;
                            }
                            i12 = i20;
                            i13 = i12;
                            y yVar222222222222222 = (y) obj;
                            b1Var = yVar222222222222222.zzjp;
                            if (b1Var == b1.e) {
                            }
                            i16 = m1.c(i19, bArr, i13, i11, b1Var, lVar);
                            p0Var = this;
                            bArr2 = bArr;
                            lVar2 = lVar;
                            i15 = i11;
                        }
                    }
                }
                unsafe3 = unsafe;
            }
            unsafe = unsafe3;
            i12 = i20;
            i13 = i12;
            y yVar2222222222222222 = (y) obj;
            b1Var = yVar2222222222222222.zzjp;
            if (b1Var == b1.e) {
            }
            i16 = m1.c(i19, bArr, i13, i11, b1Var, lVar);
            p0Var = this;
            bArr2 = bArr;
            lVar2 = lVar;
            i15 = i11;
            unsafe3 = unsafe;
        }
        if (i16 != i15) {
            throw c0.b();
        }
    }

    @Override // com.google.android.gms.internal.clearcut.z0
    public final boolean g(Object obj) {
        int[] iArr;
        int i10;
        int i11 = 1;
        int[] iArr2 = this.h;
        if (iArr2 == null || iArr2.length == 0) {
            return true;
        }
        int length = iArr2.length;
        int i12 = -1;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int i15 = iArr2[i13];
            int w10 = w(i15);
            int v = v(w10);
            boolean z10 = this.g;
            if (z10) {
                iArr = iArr2;
                i10 = 0;
            } else {
                int i16 = this.a[w10 + 2];
                int i17 = i16 & 1048575;
                i10 = i11 << (i16 >>> 20);
                if (i17 != i12) {
                    iArr = iArr2;
                    i14 = o.getInt(obj, i17);
                    i12 = i17;
                } else {
                    iArr = iArr2;
                }
            }
            if ((268435456 & v) != 0) {
                if (!(z10 ? r(w10, obj) : (i14 & i10) != 0)) {
                    return false;
                }
            }
            int i18 = (267386880 & v) >>> 20;
            if (i18 == 9 || i18 == 17) {
                if ((z10 ? r(w10, obj) : (i14 & i10) != 0) && !s(w10).g(j1.k(obj, v & 1048575))) {
                    return false;
                }
                i13++;
                iArr2 = iArr;
                i11 = 1;
            } else {
                if (i18 != 27) {
                    if (i18 == 60 || i18 == 68) {
                        if (q(i15, w10, obj) && !s(w10).g(j1.k(obj, v & 1048575))) {
                            return false;
                        }
                    } else if (i18 != 49) {
                        if (i18 != 50) {
                            continue;
                        } else {
                            Object k10 = j1.k(obj, v & 1048575);
                            this.n.getClass();
                            if (!((l0) k10).isEmpty()) {
                                t(w10);
                                throw new NoSuchMethodError();
                            }
                        }
                    }
                    i13++;
                    iArr2 = iArr;
                    i11 = 1;
                }
                List list = (List) j1.k(obj, v & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    z0 s10 = s(w10);
                    for (int i19 = 0; i19 < list.size(); i19++) {
                        if (!s10.g(list.get(i19))) {
                            return false;
                        }
                    }
                }
                i13++;
                iArr2 = iArr;
                i11 = 1;
            }
        }
        return true;
    }

    public final int k(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j3, int i17, l lVar) {
        int i18;
        Object valueOf;
        int i19;
        Object valueOf2;
        int m10;
        long j10;
        int i20;
        Object valueOf3;
        Object object;
        Unsafe unsafe = o;
        long j11 = this.a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                i18 = i10;
                if (i14 != 1) {
                    return i18;
                }
                valueOf = Double.valueOf(Double.longBitsToDouble(m1.r(i18, bArr)));
                unsafe.putObject(obj, j3, valueOf);
                m10 = i18 + 8;
                unsafe.putInt(obj, j11, i13);
                return m10;
            case 52:
                i19 = i10;
                if (i14 != 5) {
                    return i19;
                }
                valueOf2 = Float.valueOf(Float.intBitsToFloat(m1.o(i19, bArr)));
                unsafe.putObject(obj, j3, valueOf2);
                m10 = i19 + 4;
                unsafe.putInt(obj, j11, i13);
                return m10;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                m10 = m1.m(bArr, i10, lVar);
                j10 = lVar.b;
                valueOf3 = Long.valueOf(j10);
                unsafe.putObject(obj, j3, valueOf3);
                unsafe.putInt(obj, j11, i13);
                return m10;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                m10 = m1.f(bArr, i10, lVar);
                i20 = lVar.a;
                valueOf3 = Integer.valueOf(i20);
                unsafe.putObject(obj, j3, valueOf3);
                unsafe.putInt(obj, j11, i13);
                return m10;
            case 56:
            case VoIPService.CALL_MIN_LAYER /* 65 */:
                i18 = i10;
                if (i14 != 1) {
                    return i18;
                }
                valueOf = Long.valueOf(m1.r(i18, bArr));
                unsafe.putObject(obj, j3, valueOf);
                m10 = i18 + 8;
                unsafe.putInt(obj, j11, i13);
                return m10;
            case 57:
            case 64:
                i19 = i10;
                if (i14 != 5) {
                    return i19;
                }
                valueOf2 = Integer.valueOf(m1.o(i19, bArr));
                unsafe.putObject(obj, j3, valueOf2);
                m10 = i19 + 4;
                unsafe.putInt(obj, j11, i13);
                return m10;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                m10 = m1.m(bArr, i10, lVar);
                valueOf3 = Boolean.valueOf(lVar.b != 0);
                unsafe.putObject(obj, j3, valueOf3);
                unsafe.putInt(obj, j11, i13);
                return m10;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int f7 = m1.f(bArr, i10, lVar);
                int i21 = lVar.a;
                if (i21 == 0) {
                    unsafe.putObject(obj, j3, "");
                } else {
                    if ((i15 & TLObject.FLAG_29) != 0) {
                        if (!l1.a.t(bArr, f7, f7 + i21)) {
                            throw new c0("Protocol message had invalid UTF-8.");
                        }
                    }
                    unsafe.putObject(obj, j3, new String(bArr, f7, i21, z.a));
                    f7 += i21;
                }
                unsafe.putInt(obj, j11, i13);
                return f7;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                int j12 = j(s(i17), bArr, i10, i11, lVar);
                object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j3) : null;
                Object obj2 = lVar.c;
                if (object != null) {
                    obj2 = z.a(object, obj2);
                }
                unsafe.putObject(obj, j3, obj2);
                unsafe.putInt(obj, j11, i13);
                return j12;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int f10 = m1.f(bArr, i10, lVar);
                int i22 = lVar.a;
                if (i22 == 0) {
                    unsafe.putObject(obj, j3, n.c);
                } else {
                    unsafe.putObject(obj, j3, n.n(f10, i22, bArr));
                    f10 += i22;
                }
                unsafe.putInt(obj, j11, i13);
                return f10;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int f11 = m1.f(bArr, i10, lVar);
                int i23 = lVar.a;
                a0 u10 = u(i17);
                if (u10 == null || u10.a(i23) != null) {
                    unsafe.putObject(obj, j3, Integer.valueOf(i23));
                    m10 = f11;
                    unsafe.putInt(obj, j11, i13);
                    return m10;
                }
                y yVar = (y) obj;
                b1 b1Var = yVar.zzjp;
                if (b1Var == b1.e) {
                    b1Var = b1.b();
                    yVar.zzjp = b1Var;
                }
                b1Var.a(i12, Long.valueOf(i23));
                return f11;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                m10 = m1.f(bArr, i10, lVar);
                int i24 = lVar.a;
                i20 = (-(i24 & 1)) ^ (i24 >>> 1);
                valueOf3 = Integer.valueOf(i20);
                unsafe.putObject(obj, j3, valueOf3);
                unsafe.putInt(obj, j11, i13);
                return m10;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                m10 = m1.m(bArr, i10, lVar);
                long j13 = lVar.b;
                j10 = (-(j13 & 1)) ^ (j13 >>> 1);
                valueOf3 = Long.valueOf(j10);
                unsafe.putObject(obj, j3, valueOf3);
                unsafe.putInt(obj, j11, i13);
                return m10;
            case 68:
                if (i14 == 3) {
                    m10 = i(s(i17), bArr, i10, i11, (i12 & (-8)) | 4, lVar);
                    object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j3) : null;
                    Object obj3 = lVar.c;
                    if (object != null) {
                        obj3 = z.a(object, obj3);
                    }
                    unsafe.putObject(obj, j3, obj3);
                    unsafe.putInt(obj, j11, i13);
                    return m10;
                }
            default:
                return i10;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01ae, code lost:
    
        if (r1 == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01b0, code lost:
    
        r6.add(com.google.android.gms.internal.clearcut.n.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01be, code lost:
    
        if (r12 >= r15) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01c0, code lost:
    
        r1 = com.google.android.gms.internal.clearcut.m1.f(r13, r12, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01c6, code lost:
    
        if (r16 != r25.a) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01c8, code lost:
    
        r12 = com.google.android.gms.internal.clearcut.m1.f(r13, r1, r25);
        r1 = r25.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01ce, code lost:
    
        if (r1 != 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01b6, code lost:
    
        r6.add(com.google.android.gms.internal.clearcut.n.n(r12, r1, r13));
        r12 = r12 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01d1, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01be, code lost:
    
        r6.add(com.google.android.gms.internal.clearcut.n.n(r12, r1, r13));
        r12 = r12 + r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0250  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x01ce -> B:109:0x01b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:131:0x0225 -> B:126:0x0206). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:143:0x025e -> B:138:0x0235). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int l(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j3, int i16, long j10, l lVar) {
        Unsafe unsafe = o;
        b0 b0Var = (b0) unsafe.getObject(obj, j10);
        if (!((j) b0Var).a) {
            int size = b0Var.size();
            b0Var = b0Var.f(size == 0 ? 10 : size << 1);
            unsafe.putObject(obj, j10, b0Var);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 != 2) {
                    if (i14 == 1) {
                        if (b0Var != null) {
                            throw new ClassCastException();
                        }
                        Double.longBitsToDouble(m1.r(i10, bArr));
                        throw null;
                    }
                    return i10;
                }
                if (b0Var != null) {
                    throw new ClassCastException();
                }
                int f7 = m1.f(bArr, i10, lVar);
                int i17 = lVar.a + f7;
                if (f7 < i17) {
                    Double.longBitsToDouble(m1.r(f7, bArr));
                    throw null;
                }
                if (f7 == i17) {
                    return f7;
                }
                throw c0.a();
            case 19:
            case 36:
                if (i14 != 2) {
                    if (i14 == 5) {
                        if (b0Var != null) {
                            throw new ClassCastException();
                        }
                        Float.intBitsToFloat(m1.o(i10, bArr));
                        throw null;
                    }
                    return i10;
                }
                if (b0Var != null) {
                    throw new ClassCastException();
                }
                int f10 = m1.f(bArr, i10, lVar);
                int i18 = lVar.a + f10;
                if (f10 < i18) {
                    Float.intBitsToFloat(m1.o(f10, bArr));
                    throw null;
                }
                if (f10 == i18) {
                    return f10;
                }
                throw c0.a();
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 != 2) {
                    if (i14 == 0) {
                        if (b0Var != null) {
                            throw new ClassCastException();
                        }
                        m1.m(bArr, i10, lVar);
                        throw null;
                    }
                    return i10;
                }
                if (b0Var != null) {
                    throw new ClassCastException();
                }
                int f11 = m1.f(bArr, i10, lVar);
                int i19 = lVar.a + f11;
                if (f11 < i19) {
                    m1.m(bArr, f11, lVar);
                    throw null;
                }
                if (f11 == i19) {
                    return f11;
                }
                throw c0.a();
            case 22:
            case 29:
            case Maneuver.TYPE_DESTINATION /* 39 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                if (i14 != 2) {
                    if (i14 == 0) {
                        if (b0Var != null) {
                            throw new ClassCastException();
                        }
                        m1.f(bArr, i10, lVar);
                        throw null;
                    }
                    return i10;
                }
                if (b0Var != null) {
                    throw new ClassCastException();
                }
                int f12 = m1.f(bArr, i10, lVar);
                int i20 = lVar.a + f12;
                if (f12 < i20) {
                    m1.f(bArr, f12, lVar);
                    throw null;
                }
                if (f12 == i20) {
                    return f12;
                }
                throw c0.a();
            case 23:
            case 32:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                if (i14 != 2) {
                    if (i14 == 1) {
                        if (b0Var != null) {
                            throw new ClassCastException();
                        }
                        m1.r(i10, bArr);
                        throw null;
                    }
                    return i10;
                }
                if (b0Var != null) {
                    throw new ClassCastException();
                }
                int f13 = m1.f(bArr, i10, lVar);
                int i21 = lVar.a + f13;
                if (f13 < i21) {
                    m1.r(f13, bArr);
                    throw null;
                }
                if (f13 == i21) {
                    return f13;
                }
                throw c0.a();
            case 24:
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                if (i14 != 2) {
                    if (i14 == 5) {
                        if (b0Var != null) {
                            throw new ClassCastException();
                        }
                        m1.o(i10, bArr);
                        throw null;
                    }
                    return i10;
                }
                if (b0Var != null) {
                    throw new ClassCastException();
                }
                int f14 = m1.f(bArr, i10, lVar);
                int i22 = lVar.a + f14;
                if (f14 < i22) {
                    m1.o(f14, bArr);
                    throw null;
                }
                if (f14 == i22) {
                    return f14;
                }
                throw c0.a();
            case 25:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                if (i14 != 2) {
                    if (i14 == 0) {
                        if (b0Var != null) {
                            throw new ClassCastException();
                        }
                        m1.m(bArr, i10, lVar);
                        throw null;
                    }
                    return i10;
                }
                if (b0Var != null) {
                    throw new ClassCastException();
                }
                int f15 = m1.f(bArr, i10, lVar);
                int i23 = lVar.a + f15;
                if (f15 < i23) {
                    m1.m(bArr, f15, lVar);
                    throw null;
                }
                if (f15 == i23) {
                    return f15;
                }
                throw c0.a();
            case 26:
                if (i14 == 2) {
                    long j11 = j3 & 536870912;
                    int f16 = m1.f(bArr, i10, lVar);
                    int i24 = lVar.a;
                    if (j11 == 0) {
                        if (i24 != 0) {
                            b0Var.add(new String(bArr, f16, i24, z.a));
                            f16 += i24;
                            while (f16 < i11) {
                                int f17 = m1.f(bArr, f16, lVar);
                                if (i12 != lVar.a) {
                                    return f16;
                                }
                                f16 = m1.f(bArr, f17, lVar);
                                int i25 = lVar.a;
                                if (i25 != 0) {
                                    b0Var.add(new String(bArr, f16, i25, z.a));
                                    f16 += i25;
                                }
                            }
                            return f16;
                        }
                        b0Var.add("");
                        while (f16 < i11) {
                        }
                        return f16;
                    }
                    if (i24 != 0) {
                        int i26 = f16 + i24;
                        if (!l1.a.t(bArr, f16, i26)) {
                            throw new c0("Protocol message had invalid UTF-8.");
                        }
                        b0Var.add(new String(bArr, f16, i24, z.a));
                        f16 = i26;
                        while (f16 < i11) {
                            int f18 = m1.f(bArr, f16, lVar);
                            if (i12 != lVar.a) {
                                return f16;
                            }
                            f16 = m1.f(bArr, f18, lVar);
                            int i27 = lVar.a;
                            if (i27 != 0) {
                                int i28 = f16 + i27;
                                if (!l1.a.t(bArr, f16, i28)) {
                                    throw new c0("Protocol message had invalid UTF-8.");
                                }
                                b0Var.add(new String(bArr, f16, i27, z.a));
                                f16 = i28;
                            }
                        }
                        return f16;
                    }
                    b0Var.add("");
                    while (f16 < i11) {
                    }
                    return f16;
                }
                return i10;
            case 27:
                if (i14 == 2) {
                    return h(s(i15), i12, bArr, i10, i11, b0Var, lVar);
                }
                return i10;
            case 28:
                if (i14 == 2) {
                    int f19 = m1.f(bArr, i10, lVar);
                    int i29 = lVar.a;
                    break;
                }
                return i10;
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                if (i14 != 2) {
                    if (i14 == 0) {
                        if (b0Var != null) {
                            throw new ClassCastException();
                        }
                        m1.f(bArr, i10, lVar);
                        throw null;
                    }
                    return i10;
                }
                if (b0Var != null) {
                    throw new ClassCastException();
                }
                int f20 = m1.f(bArr, i10, lVar);
                int i30 = lVar.a + f20;
                if (f20 < i30) {
                    m1.f(bArr, f20, lVar);
                    throw null;
                }
                if (f20 != i30) {
                    throw c0.a();
                }
                y yVar = (y) obj;
                b1 b1Var = yVar.zzjp;
                b1 b1Var2 = b1Var != b1.e ? b1Var : null;
                a0 u10 = u(i15);
                Class cls = a1.a;
                if (u10 != null) {
                    c1 c1Var = this.m;
                    if (b0Var != null) {
                        int size2 = b0Var.size();
                        int i31 = 0;
                        for (int i32 = 0; i32 < size2; i32++) {
                            Integer num = (Integer) b0Var.get(i32);
                            int intValue = num.intValue();
                            if (u10.a(intValue) != null) {
                                if (i32 != i31) {
                                    b0Var.set(i31, num);
                                }
                                i31++;
                            } else {
                                if (b1Var2 == null) {
                                    c1Var.getClass();
                                    b1Var2 = b1.b();
                                }
                                c1Var.getClass();
                                b1Var2.a(i13 << 3, Long.valueOf(intValue));
                            }
                        }
                        if (i31 != size2) {
                            b0Var.subList(i31, size2).clear();
                        }
                    } else {
                        Iterator it = b0Var.iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Integer) it.next()).intValue();
                            if (u10.a(intValue2) == null) {
                                if (b1Var2 == null) {
                                    c1Var.getClass();
                                    b1Var2 = b1.b();
                                }
                                c1Var.getClass();
                                b1Var2.a(i13 << 3, Long.valueOf(intValue2));
                                it.remove();
                            }
                        }
                    }
                }
                if (b1Var2 != null) {
                    yVar.zzjp = b1Var2;
                }
                return f20;
            case 33:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                if (i14 != 2) {
                    if (i14 == 0) {
                        if (b0Var != null) {
                            throw new ClassCastException();
                        }
                        m1.f(bArr, i10, lVar);
                        throw null;
                    }
                    return i10;
                }
                if (b0Var != null) {
                    throw new ClassCastException();
                }
                int f21 = m1.f(bArr, i10, lVar);
                int i33 = lVar.a + f21;
                if (f21 < i33) {
                    m1.f(bArr, f21, lVar);
                    throw null;
                }
                if (f21 == i33) {
                    return f21;
                }
                throw c0.a();
            case 34:
            case 48:
                if (i14 != 2) {
                    if (i14 == 0) {
                        if (b0Var != null) {
                            throw new ClassCastException();
                        }
                        m1.m(bArr, i10, lVar);
                        throw null;
                    }
                    return i10;
                }
                if (b0Var != null) {
                    throw new ClassCastException();
                }
                int f22 = m1.f(bArr, i10, lVar);
                int i34 = lVar.a + f22;
                if (f22 < i34) {
                    m1.m(bArr, f22, lVar);
                    throw null;
                }
                if (f22 == i34) {
                    return f22;
                }
                throw c0.a();
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                if (i14 == 3) {
                    z0 s10 = s(i15);
                    int i35 = (i12 & (-8)) | 4;
                    int i36 = i(s10, bArr, i10, i11, i35, lVar);
                    z0 z0Var = s10;
                    l lVar2 = lVar;
                    b0Var.add(lVar2.c);
                    while (i36 < i11) {
                        int f23 = m1.f(bArr, i36, lVar2);
                        if (i12 != lVar2.a) {
                            return i36;
                        }
                        l lVar3 = lVar2;
                        z0 z0Var2 = z0Var;
                        i36 = i(z0Var2, bArr, f23, i11, i35, lVar3);
                        b0Var.add(lVar3.c);
                        z0Var = z0Var2;
                        lVar2 = lVar3;
                    }
                    return i36;
                }
                return i10;
            default:
                return i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x03d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(Object obj, byte[] bArr, int i10, int i11, int i12, l lVar) {
        p0 p0Var;
        int[] iArr;
        int i13;
        Unsafe unsafe;
        int i14;
        Object obj2;
        int i15;
        int i16;
        b1 b1Var;
        int i17;
        char c10;
        int i18;
        byte[] bArr2;
        Unsafe unsafe2;
        int i19;
        int i20;
        Unsafe unsafe3;
        Unsafe unsafe4;
        byte[] bArr3;
        int i21;
        l lVar2;
        Unsafe unsafe5;
        int i22;
        int i23;
        int q6;
        Object a2;
        l lVar3;
        int l4;
        p0 p0Var2 = this;
        Object obj3 = obj;
        byte[] bArr4 = bArr;
        int i24 = i11;
        l lVar4 = lVar;
        Unsafe unsafe6 = o;
        int i25 = -1;
        int i26 = i10;
        int i27 = 0;
        int i28 = -1;
        int i29 = 0;
        while (true) {
            int[] iArr2 = p0Var2.a;
            if (i26 < i24) {
                int i30 = i26 + 1;
                int i31 = bArr4[i26];
                if (i31 < 0) {
                    i30 = m1.d(i31, bArr4, i30, lVar4);
                    i31 = lVar4.a;
                }
                int i32 = i31;
                int i33 = i30;
                int i34 = i32 >>> 3;
                int i35 = i32 & 7;
                int w10 = p0Var2.w(i34);
                b1 b1Var2 = b1.e;
                if (w10 != i25) {
                    int i36 = iArr2[w10 + 1];
                    int i37 = (i36 & 267386880) >>> 20;
                    int i38 = i32;
                    long j3 = i36 & 1048575;
                    if (i37 <= 17) {
                        int i39 = iArr2[w10 + 2];
                        int i40 = 1 << (i39 >>> 20);
                        int i41 = i39 & 1048575;
                        if (i41 != i28) {
                            i17 = i36;
                            i25 = -1;
                            iArr = iArr2;
                            c10 = 1;
                            if (i28 != -1) {
                                unsafe6.putInt(obj3, i28, i29);
                            }
                            i18 = i41;
                            i15 = unsafe6.getInt(obj3, i41);
                        } else {
                            iArr = iArr2;
                            i17 = i36;
                            i25 = -1;
                            c10 = 1;
                            i15 = i29;
                            i18 = i28;
                        }
                        switch (i37) {
                            case 0:
                                bArr2 = bArr;
                                unsafe2 = unsafe6;
                                i19 = i33;
                                i20 = i11;
                                lVar4 = lVar;
                                if (i35 == 1) {
                                    j1.d.c(obj3, j3, Double.longBitsToDouble(m1.r(i19, bArr2)));
                                    i26 = i19 + 8;
                                    int i42 = i18;
                                    i29 = i15 | i40;
                                    bArr4 = bArr2;
                                    i28 = i42;
                                    i24 = i20;
                                    unsafe6 = unsafe2;
                                    i27 = i38;
                                    break;
                                } else {
                                    i14 = i12;
                                    p0Var = p0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14 && i14 != 0) {
                                        i24 = i11;
                                        i26 = i16;
                                        i25 = -1;
                                        break;
                                    } else {
                                        y yVar = (y) obj2;
                                        b1Var = yVar.zzjp;
                                        if (b1Var == b1Var2) {
                                            b1Var = b1.b();
                                            yVar.zzjp = b1Var;
                                        }
                                        int i43 = i27;
                                        int c11 = m1.c(i43, bArr, i16, i11, b1Var, lVar);
                                        i27 = i43;
                                        bArr4 = bArr;
                                        lVar4 = lVar;
                                        i24 = i11;
                                        p0Var2 = p0Var;
                                        unsafe6 = unsafe;
                                        i25 = -1;
                                        i26 = c11;
                                        obj3 = obj2;
                                        i28 = i13;
                                        break;
                                    }
                                }
                            case 1:
                                bArr2 = bArr;
                                unsafe2 = unsafe6;
                                i19 = i33;
                                i20 = i11;
                                lVar4 = lVar;
                                if (i35 == 5) {
                                    j1.d.d(obj3, j3, Float.intBitsToFloat(m1.o(i19, bArr2)));
                                    i26 = i19 + 4;
                                    int i422 = i18;
                                    i29 = i15 | i40;
                                    bArr4 = bArr2;
                                    i28 = i422;
                                    i24 = i20;
                                    unsafe6 = unsafe2;
                                    i27 = i38;
                                    break;
                                } else {
                                    i14 = i12;
                                    p0Var = p0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14) {
                                    }
                                    y yVar2 = (y) obj2;
                                    b1Var = yVar2.zzjp;
                                    if (b1Var == b1Var2) {
                                    }
                                    int i432 = i27;
                                    int c112 = m1.c(i432, bArr, i16, i11, b1Var, lVar);
                                    i27 = i432;
                                    bArr4 = bArr;
                                    lVar4 = lVar;
                                    i24 = i11;
                                    p0Var2 = p0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c112;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            case 2:
                            case 3:
                                unsafe3 = unsafe6;
                                i19 = i33;
                                i20 = i11;
                                lVar4 = lVar;
                                if (i35 == 0) {
                                    int m10 = m1.m(bArr, i19, lVar4);
                                    unsafe3.putLong(obj3, j3, lVar4.b);
                                    unsafe2 = unsafe3;
                                    int i44 = i18;
                                    i29 = i15 | i40;
                                    bArr4 = bArr;
                                    i28 = i44;
                                    i26 = m10;
                                    i24 = i20;
                                    unsafe6 = unsafe2;
                                    i27 = i38;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    i14 = i12;
                                    p0Var = p0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14) {
                                    }
                                    y yVar22 = (y) obj2;
                                    b1Var = yVar22.zzjp;
                                    if (b1Var == b1Var2) {
                                    }
                                    int i4322 = i27;
                                    int c1122 = m1.c(i4322, bArr, i16, i11, b1Var, lVar);
                                    i27 = i4322;
                                    bArr4 = bArr;
                                    lVar4 = lVar;
                                    i24 = i11;
                                    p0Var2 = p0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c1122;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            case 4:
                            case 11:
                                unsafe3 = unsafe6;
                                i19 = i33;
                                lVar4 = lVar;
                                if (i35 == 0) {
                                    int f7 = m1.f(bArr, i19, lVar4);
                                    unsafe3.putInt(obj3, j3, lVar4.a);
                                    i24 = i11;
                                    unsafe6 = unsafe3;
                                    bArr4 = bArr;
                                    i28 = i18;
                                    i29 = i15 | i40;
                                    i26 = f7;
                                    i27 = i38;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    i14 = i12;
                                    p0Var = p0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14) {
                                    }
                                    y yVar222 = (y) obj2;
                                    b1Var = yVar222.zzjp;
                                    if (b1Var == b1Var2) {
                                    }
                                    int i43222 = i27;
                                    int c11222 = m1.c(i43222, bArr, i16, i11, b1Var, lVar);
                                    i27 = i43222;
                                    bArr4 = bArr;
                                    lVar4 = lVar;
                                    i24 = i11;
                                    p0Var2 = p0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c11222;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            case 5:
                            case 14:
                                unsafe4 = unsafe6;
                                if (i35 == 1) {
                                    i38 = i38;
                                    lVar4 = lVar;
                                    unsafe4.putLong(obj3, j3, m1.r(i33, bArr));
                                    i26 = i33 + 8;
                                    unsafe6 = unsafe4;
                                    bArr4 = bArr;
                                    i28 = i18;
                                    i29 = i15 | i40;
                                    i24 = i11;
                                    i27 = i38;
                                    break;
                                } else {
                                    i19 = i33;
                                    i38 = i38;
                                    unsafe2 = unsafe4;
                                    i14 = i12;
                                    p0Var = p0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14) {
                                    }
                                    y yVar2222 = (y) obj2;
                                    b1Var = yVar2222.zzjp;
                                    if (b1Var == b1Var2) {
                                    }
                                    int i432222 = i27;
                                    int c112222 = m1.c(i432222, bArr, i16, i11, b1Var, lVar);
                                    i27 = i432222;
                                    bArr4 = bArr;
                                    lVar4 = lVar;
                                    i24 = i11;
                                    p0Var2 = p0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c112222;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            case 6:
                            case 13:
                                bArr3 = bArr;
                                i21 = i33;
                                lVar2 = lVar;
                                unsafe5 = unsafe6;
                                i22 = i38;
                                i23 = i11;
                                if (i35 == 5) {
                                    unsafe5.putInt(obj3, j3, m1.o(i21, bArr3));
                                    i26 = i21 + 4;
                                    int i45 = i18;
                                    i29 = i15 | i40;
                                    bArr4 = bArr3;
                                    i28 = i45;
                                    int i46 = i23;
                                    unsafe6 = unsafe5;
                                    i24 = i46;
                                    lVar4 = lVar2;
                                    i27 = i22;
                                    break;
                                } else {
                                    i19 = i21;
                                    unsafe2 = unsafe5;
                                    i38 = i22;
                                    i14 = i12;
                                    p0Var = p0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14) {
                                    }
                                    y yVar22222 = (y) obj2;
                                    b1Var = yVar22222.zzjp;
                                    if (b1Var == b1Var2) {
                                    }
                                    int i4322222 = i27;
                                    int c1122222 = m1.c(i4322222, bArr, i16, i11, b1Var, lVar);
                                    i27 = i4322222;
                                    bArr4 = bArr;
                                    lVar4 = lVar;
                                    i24 = i11;
                                    p0Var2 = p0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c1122222;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            case 7:
                                bArr3 = bArr;
                                i21 = i33;
                                lVar2 = lVar;
                                unsafe5 = unsafe6;
                                i22 = i38;
                                i23 = i11;
                                if (i35 == 0) {
                                    i26 = m1.m(bArr3, i21, lVar2);
                                    j1.d.f(obj3, j3, lVar2.b != 0);
                                    int i452 = i18;
                                    i29 = i15 | i40;
                                    bArr4 = bArr3;
                                    i28 = i452;
                                    int i462 = i23;
                                    unsafe6 = unsafe5;
                                    i24 = i462;
                                    lVar4 = lVar2;
                                    i27 = i22;
                                    break;
                                } else {
                                    i19 = i21;
                                    unsafe2 = unsafe5;
                                    i38 = i22;
                                    i14 = i12;
                                    p0Var = p0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14) {
                                    }
                                    y yVar222222 = (y) obj2;
                                    b1Var = yVar222222.zzjp;
                                    if (b1Var == b1Var2) {
                                    }
                                    int i43222222 = i27;
                                    int c11222222 = m1.c(i43222222, bArr, i16, i11, b1Var, lVar);
                                    i27 = i43222222;
                                    bArr4 = bArr;
                                    lVar4 = lVar;
                                    i24 = i11;
                                    p0Var2 = p0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c11222222;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            case 8:
                                bArr3 = bArr;
                                i21 = i33;
                                lVar2 = lVar;
                                unsafe5 = unsafe6;
                                i22 = i38;
                                i23 = i11;
                                if (i35 == 2) {
                                    if ((i17 & TLObject.FLAG_29) == 0) {
                                        q6 = m1.f(bArr3, i21, lVar2);
                                        int i47 = lVar2.a;
                                        if (i47 == 0) {
                                            lVar2.c = "";
                                        } else {
                                            lVar2.c = new String(bArr3, q6, i47, z.a);
                                            q6 += i47;
                                        }
                                    } else {
                                        q6 = m1.q(bArr3, i21, lVar2);
                                    }
                                    i26 = q6;
                                    a2 = lVar2.c;
                                    unsafe5.putObject(obj3, j3, a2);
                                    int i4522 = i18;
                                    i29 = i15 | i40;
                                    bArr4 = bArr3;
                                    i28 = i4522;
                                    int i4622 = i23;
                                    unsafe6 = unsafe5;
                                    i24 = i4622;
                                    lVar4 = lVar2;
                                    i27 = i22;
                                    break;
                                } else {
                                    i19 = i21;
                                    unsafe2 = unsafe5;
                                    i38 = i22;
                                    i14 = i12;
                                    p0Var = p0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14) {
                                    }
                                    y yVar2222222 = (y) obj2;
                                    b1Var = yVar2222222.zzjp;
                                    if (b1Var == b1Var2) {
                                    }
                                    int i432222222 = i27;
                                    int c112222222 = m1.c(i432222222, bArr, i16, i11, b1Var, lVar);
                                    i27 = i432222222;
                                    bArr4 = bArr;
                                    lVar4 = lVar;
                                    i24 = i11;
                                    p0Var2 = p0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c112222222;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            case 9:
                                bArr3 = bArr;
                                i21 = i33;
                                lVar2 = lVar;
                                unsafe5 = unsafe6;
                                i22 = i38;
                                i23 = i11;
                                if (i35 == 2) {
                                    i26 = j(p0Var2.s(w10), bArr3, i21, i23, lVar2);
                                    a2 = (i15 & i40) == 0 ? lVar2.c : z.a(unsafe5.getObject(obj3, j3), lVar2.c);
                                    unsafe5.putObject(obj3, j3, a2);
                                    int i45222 = i18;
                                    i29 = i15 | i40;
                                    bArr4 = bArr3;
                                    i28 = i45222;
                                    int i46222 = i23;
                                    unsafe6 = unsafe5;
                                    i24 = i46222;
                                    lVar4 = lVar2;
                                    i27 = i22;
                                    break;
                                } else {
                                    i19 = i21;
                                    unsafe2 = unsafe5;
                                    i38 = i22;
                                    i14 = i12;
                                    p0Var = p0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14) {
                                    }
                                    y yVar22222222 = (y) obj2;
                                    b1Var = yVar22222222.zzjp;
                                    if (b1Var == b1Var2) {
                                    }
                                    int i4322222222 = i27;
                                    int c1122222222 = m1.c(i4322222222, bArr, i16, i11, b1Var, lVar);
                                    i27 = i4322222222;
                                    bArr4 = bArr;
                                    lVar4 = lVar;
                                    i24 = i11;
                                    p0Var2 = p0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c1122222222;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            case 10:
                                bArr3 = bArr;
                                i21 = i33;
                                lVar2 = lVar;
                                unsafe5 = unsafe6;
                                i22 = i38;
                                i23 = i11;
                                if (i35 == 2) {
                                    i26 = m1.s(bArr3, i21, lVar2);
                                    a2 = lVar2.c;
                                    unsafe5.putObject(obj3, j3, a2);
                                    int i452222 = i18;
                                    i29 = i15 | i40;
                                    bArr4 = bArr3;
                                    i28 = i452222;
                                    int i462222 = i23;
                                    unsafe6 = unsafe5;
                                    i24 = i462222;
                                    lVar4 = lVar2;
                                    i27 = i22;
                                    break;
                                } else {
                                    i19 = i21;
                                    unsafe2 = unsafe5;
                                    i38 = i22;
                                    i14 = i12;
                                    p0Var = p0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14) {
                                    }
                                    y yVar222222222 = (y) obj2;
                                    b1Var = yVar222222222.zzjp;
                                    if (b1Var == b1Var2) {
                                    }
                                    int i43222222222 = i27;
                                    int c11222222222 = m1.c(i43222222222, bArr, i16, i11, b1Var, lVar);
                                    i27 = i43222222222;
                                    bArr4 = bArr;
                                    lVar4 = lVar;
                                    i24 = i11;
                                    p0Var2 = p0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c11222222222;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            case 12:
                                bArr3 = bArr;
                                lVar2 = lVar;
                                unsafe5 = unsafe6;
                                i23 = i11;
                                if (i35 == 0) {
                                    i26 = m1.f(bArr3, i33, lVar2);
                                    int i48 = lVar2.a;
                                    a0 u10 = p0Var2.u(w10);
                                    if (u10 == null || u10.a(i48) != null) {
                                        i22 = i38;
                                        unsafe5.putInt(obj3, j3, i48);
                                        int i4522222 = i18;
                                        i29 = i15 | i40;
                                        bArr4 = bArr3;
                                        i28 = i4522222;
                                        int i4622222 = i23;
                                        unsafe6 = unsafe5;
                                        i24 = i4622222;
                                        lVar4 = lVar2;
                                        i27 = i22;
                                        break;
                                    } else {
                                        y yVar3 = (y) obj3;
                                        b1 b1Var3 = yVar3.zzjp;
                                        if (b1Var3 == b1Var2) {
                                            b1Var3 = b1.b();
                                            yVar3.zzjp = b1Var3;
                                        }
                                        b1Var3.a(i38, Long.valueOf(i48));
                                        unsafe6 = unsafe5;
                                        i24 = i23;
                                        lVar4 = lVar2;
                                        i27 = i38;
                                        bArr4 = bArr3;
                                        i28 = i18;
                                        i29 = i15;
                                        break;
                                    }
                                } else {
                                    i19 = i33;
                                    unsafe2 = unsafe5;
                                    i14 = i12;
                                    p0Var = p0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14) {
                                    }
                                    y yVar2222222222 = (y) obj2;
                                    b1Var = yVar2222222222.zzjp;
                                    if (b1Var == b1Var2) {
                                    }
                                    int i432222222222 = i27;
                                    int c112222222222 = m1.c(i432222222222, bArr, i16, i11, b1Var, lVar);
                                    i27 = i432222222222;
                                    bArr4 = bArr;
                                    lVar4 = lVar;
                                    i24 = i11;
                                    p0Var2 = p0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c112222222222;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            case 15:
                                lVar3 = lVar;
                                unsafe4 = unsafe6;
                                if (i35 == 0) {
                                    i26 = m1.f(bArr, i33, lVar3);
                                    int i49 = lVar3.a;
                                    unsafe4.putInt(obj3, j3, (-(i49 & 1)) ^ (i49 >>> 1));
                                    int i50 = i18;
                                    i29 = i15 | i40;
                                    bArr4 = bArr;
                                    i28 = i50;
                                    unsafe6 = unsafe4;
                                    lVar4 = lVar3;
                                    i27 = i38;
                                    i24 = i11;
                                    break;
                                } else {
                                    i19 = i33;
                                    unsafe2 = unsafe4;
                                    i14 = i12;
                                    p0Var = p0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14) {
                                    }
                                    y yVar22222222222 = (y) obj2;
                                    b1Var = yVar22222222222.zzjp;
                                    if (b1Var == b1Var2) {
                                    }
                                    int i4322222222222 = i27;
                                    int c1122222222222 = m1.c(i4322222222222, bArr, i16, i11, b1Var, lVar);
                                    i27 = i4322222222222;
                                    bArr4 = bArr;
                                    lVar4 = lVar;
                                    i24 = i11;
                                    p0Var2 = p0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c1122222222222;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            case 16:
                                lVar3 = lVar;
                                if (i35 == 0) {
                                    int m11 = m1.m(bArr, i33, lVar3);
                                    long j10 = lVar3.b;
                                    Unsafe unsafe7 = unsafe6;
                                    unsafe7.putLong(obj3, j3, (j10 >>> c10) ^ (-(j10 & 1)));
                                    int i51 = i18;
                                    i29 = i15 | i40;
                                    bArr4 = bArr;
                                    i28 = i51;
                                    unsafe6 = unsafe7;
                                    i26 = m11;
                                    lVar4 = lVar3;
                                    i27 = i38;
                                    i24 = i11;
                                    break;
                                } else {
                                    i19 = i33;
                                    unsafe2 = unsafe6;
                                    i14 = i12;
                                    p0Var = p0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14) {
                                    }
                                    y yVar222222222222 = (y) obj2;
                                    b1Var = yVar222222222222.zzjp;
                                    if (b1Var == b1Var2) {
                                    }
                                    int i43222222222222 = i27;
                                    int c11222222222222 = m1.c(i43222222222222, bArr, i16, i11, b1Var, lVar);
                                    i27 = i43222222222222;
                                    bArr4 = bArr;
                                    lVar4 = lVar;
                                    i24 = i11;
                                    p0Var2 = p0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c11222222222222;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            case 17:
                                if (i35 == 3) {
                                    i26 = i(p0Var2.s(w10), bArr, i33, i11, (i34 << 3) | 4, lVar);
                                    unsafe6.putObject(obj3, j3, (i15 & i40) == 0 ? lVar.c : z.a(unsafe6.getObject(obj3, j3), lVar.c));
                                    int i52 = i18;
                                    i29 = i15 | i40;
                                    bArr4 = bArr;
                                    i28 = i52;
                                    i24 = i11;
                                    lVar4 = lVar;
                                    i27 = i38;
                                    break;
                                } else {
                                    i19 = i33;
                                    unsafe2 = unsafe6;
                                    i14 = i12;
                                    p0Var = p0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14) {
                                    }
                                    y yVar2222222222222 = (y) obj2;
                                    b1Var = yVar2222222222222.zzjp;
                                    if (b1Var == b1Var2) {
                                    }
                                    int i432222222222222 = i27;
                                    int c112222222222222 = m1.c(i432222222222222, bArr, i16, i11, b1Var, lVar);
                                    i27 = i432222222222222;
                                    bArr4 = bArr;
                                    lVar4 = lVar;
                                    i24 = i11;
                                    p0Var2 = p0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c112222222222222;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            default:
                                i19 = i33;
                                unsafe2 = unsafe6;
                                i14 = i12;
                                p0Var = p0Var2;
                                obj2 = obj3;
                                i16 = i19;
                                unsafe = unsafe2;
                                i27 = i38;
                                i13 = i18;
                                i29 = i15;
                                if (i27 != i14) {
                                }
                                y yVar22222222222222 = (y) obj2;
                                b1Var = yVar22222222222222.zzjp;
                                if (b1Var == b1Var2) {
                                }
                                int i4322222222222222 = i27;
                                int c1122222222222222 = m1.c(i4322222222222222, bArr, i16, i11, b1Var, lVar);
                                i27 = i4322222222222222;
                                bArr4 = bArr;
                                lVar4 = lVar;
                                i24 = i11;
                                p0Var2 = p0Var;
                                unsafe6 = unsafe;
                                i25 = -1;
                                i26 = c1122222222222222;
                                obj3 = obj2;
                                i28 = i13;
                                break;
                        }
                    } else {
                        iArr = iArr2;
                        Unsafe unsafe8 = unsafe6;
                        if (i37 != 27) {
                            i33 = i33;
                            if (i37 <= 49) {
                                i15 = i29;
                                unsafe = unsafe8;
                                i27 = i38;
                                i13 = i28;
                                l4 = p0Var2.l(obj, bArr, i33, i11, i27, i34, i35, w10, i36, i37, j3, lVar);
                                if (l4 == i33) {
                                    p0Var = p0Var2;
                                    obj2 = obj;
                                } else {
                                    i24 = i11;
                                    lVar4 = lVar;
                                    obj3 = obj;
                                    i26 = l4;
                                    i28 = i13;
                                    i29 = i15;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    bArr4 = bArr;
                                }
                            } else {
                                unsafe = unsafe8;
                                i15 = i29;
                                i27 = i38;
                                i13 = i28;
                                if (i37 != 50) {
                                    l4 = p0Var2.k(obj, bArr, i33, i11, i27, i34, i35, i36, i37, j3, w10, lVar);
                                    p0Var = p0Var2;
                                    obj2 = obj;
                                    if (l4 != i33) {
                                        bArr4 = bArr;
                                        i24 = i11;
                                        lVar4 = lVar;
                                        i26 = l4;
                                        p0Var2 = p0Var;
                                        obj3 = obj2;
                                        i28 = i13;
                                        i29 = i15;
                                        unsafe6 = unsafe;
                                        i25 = -1;
                                    }
                                } else {
                                    if (i35 == 2) {
                                        p0Var2.p(j3, obj, w10);
                                        throw null;
                                    }
                                    p0Var = p0Var2;
                                    obj2 = obj;
                                }
                            }
                            i16 = l4;
                            i29 = i15;
                            i14 = i12;
                        } else if (i35 == 2) {
                            b0 b0Var = (b0) unsafe8.getObject(obj3, j3);
                            if (!((j) b0Var).a) {
                                int size = b0Var.size();
                                b0Var = b0Var.f(size == 0 ? 10 : size << 1);
                                unsafe8.putObject(obj3, j3, b0Var);
                            }
                            unsafe6 = unsafe8;
                            obj3 = obj;
                            i24 = i11;
                            lVar4 = lVar;
                            i26 = h(p0Var2.s(w10), i38, bArr, i33, i11, b0Var, lVar);
                            i27 = i38;
                            i25 = -1;
                            bArr4 = bArr;
                        } else {
                            p0Var = p0Var2;
                            unsafe = unsafe8;
                            i15 = i29;
                            i33 = i33;
                            i27 = i38;
                            i13 = i28;
                            obj2 = obj;
                        }
                        if (i27 != i14) {
                        }
                        y yVar222222222222222 = (y) obj2;
                        b1Var = yVar222222222222222.zzjp;
                        if (b1Var == b1Var2) {
                        }
                        int i43222222222222222 = i27;
                        int c11222222222222222 = m1.c(i43222222222222222, bArr, i16, i11, b1Var, lVar);
                        i27 = i43222222222222222;
                        bArr4 = bArr;
                        lVar4 = lVar;
                        i24 = i11;
                        p0Var2 = p0Var;
                        unsafe6 = unsafe;
                        i25 = -1;
                        i26 = c11222222222222222;
                        obj3 = obj2;
                        i28 = i13;
                    }
                } else {
                    p0Var = p0Var2;
                    iArr = iArr2;
                    i13 = i28;
                    unsafe = unsafe6;
                    i15 = i29;
                    i27 = i32;
                    obj2 = obj3;
                }
                i14 = i12;
                i16 = i33;
                i29 = i15;
                if (i27 != i14) {
                }
                y yVar2222222222222222 = (y) obj2;
                b1Var = yVar2222222222222222.zzjp;
                if (b1Var == b1Var2) {
                }
                int i432222222222222222 = i27;
                int c112222222222222222 = m1.c(i432222222222222222, bArr, i16, i11, b1Var, lVar);
                i27 = i432222222222222222;
                bArr4 = bArr;
                lVar4 = lVar;
                i24 = i11;
                p0Var2 = p0Var;
                unsafe6 = unsafe;
                i25 = -1;
                i26 = c112222222222222222;
                obj3 = obj2;
                i28 = i13;
            } else {
                p0Var = p0Var2;
                iArr = iArr2;
                i13 = i28;
                unsafe = unsafe6;
                i14 = i12;
                obj2 = obj3;
            }
        }
        int i53 = i13;
        if (i53 != i25) {
            unsafe.putInt(obj2, i53, i29);
        }
        int[] iArr3 = p0Var.i;
        if (iArr3 != null) {
            for (int i54 : iArr3) {
                int i55 = iArr[i54];
                Object k10 = j1.k(obj2, p0Var.v(i54) & 1048575);
                if (k10 != null && p0Var.u(i54) != null) {
                    p0Var.n.getClass();
                    p0Var.t(i54);
                    throw new NoSuchMethodError();
                }
            }
        }
        if (i14 == 0) {
            if (i26 != i24) {
                throw c0.b();
            }
        } else if (i26 > i24 || i27 != i14) {
            throw c0.b();
        }
        return i26;
    }

    public final void o(int i10, Object obj, Object obj2) {
        long v = v(i10) & 1048575;
        if (r(i10, obj2)) {
            Object k10 = j1.k(obj, v);
            Object k11 = j1.k(obj2, v);
            if (k10 != null && k11 != null) {
                k11 = z.a(k10, k11);
            } else if (k11 == null) {
                return;
            }
            j1.d(obj, v, k11);
            x(i10, obj);
        }
    }

    public final void p(long j3, Object obj, int i10) {
        l0 l0Var;
        Unsafe unsafe = o;
        t(i10);
        Object object = unsafe.getObject(obj, j3);
        this.n.getClass();
        if (!((l0) object).a) {
            l0 l0Var2 = l0.b;
            if (l0Var2.isEmpty()) {
                l0Var = new l0();
            } else {
                l0 l0Var3 = new l0(l0Var2);
                l0Var3.a = true;
                l0Var = l0Var3;
            }
            m0.a(l0Var, object);
            unsafe.putObject(obj, j3, l0Var);
        }
        throw new NoSuchMethodError();
    }

    public final boolean q(int i10, int i11, Object obj) {
        return j1.d.g(obj, (long) (this.a[i11 + 2] & 1048575)) == i10;
    }

    public final boolean r(int i10, Object obj) {
        if (this.g) {
            int v = v(i10);
            long j3 = v & 1048575;
            switch ((v & 267386880) >>> 20) {
                case 0:
                    if (j1.d.k(obj, j3) == 0.0d) {
                        return false;
                    }
                    break;
                case 1:
                    if (j1.d.j(obj, j3) == 0.0f) {
                        return false;
                    }
                    break;
                case 2:
                    if (j1.d.h(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (j1.d.h(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (j1.d.g(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (j1.d.h(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (j1.d.g(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return j1.d.i(obj, j3);
                case 8:
                    Object k10 = j1.k(obj, j3);
                    if (k10 instanceof String) {
                        if (((String) k10).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(k10 instanceof n)) {
                            throw new IllegalArgumentException();
                        }
                        if (n.c.equals(k10)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (j1.k(obj, j3) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (n.c.equals(j1.k(obj, j3))) {
                        return false;
                    }
                    break;
                case 11:
                    if (j1.d.g(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (j1.d.g(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (j1.d.g(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (j1.d.h(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (j1.d.g(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (j1.d.h(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (j1.k(obj, j3) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((j1.d.g(obj, r6 & 1048575) & (1 << (this.a[i10 + 2] >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    public final z0 s(int i10) {
        int i11 = (i10 / 4) << 1;
        Object[] objArr = this.b;
        z0 z0Var = (z0) objArr[i11];
        if (z0Var != null) {
            return z0Var;
        }
        z0 a2 = v0.c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a2;
        return a2;
    }

    public final Object t(int i10) {
        return this.b[(i10 / 4) << 1];
    }

    public final a0 u(int i10) {
        return (a0) this.b[((i10 / 4) << 1) + 1];
    }

    public final int v(int i10) {
        return this.a[i10 + 1];
    }

    public final int w(int i10) {
        int i11 = this.c;
        if (i10 >= i11) {
            int[] iArr = this.a;
            int i12 = this.e;
            if (i10 < i12) {
                int i13 = (i10 - i11) << 2;
                if (iArr[i13] == i10) {
                    return i13;
                }
                return -1;
            }
            if (i10 <= this.d) {
                int i14 = i12 - i11;
                int length = (iArr.length / 4) - 1;
                while (i14 <= length) {
                    int i15 = (length + i14) >>> 1;
                    int i16 = i15 << 2;
                    int i17 = iArr[i16];
                    if (i10 == i17) {
                        return i16;
                    }
                    if (i10 < i17) {
                        length = i15 - 1;
                    } else {
                        i14 = i15 + 1;
                    }
                }
            }
        }
        return -1;
    }

    public final void x(int i10, Object obj) {
        if (this.g) {
            return;
        }
        int i11 = this.a[i10 + 2];
        long j3 = i11 & 1048575;
        j1.b(j3, obj, j1.d.g(obj, j3) | (1 << (i11 >>> 20)));
    }

    public final void y(int i10, Object obj, Object obj2) {
        int i11;
        int v = v(i10);
        int[] iArr = this.a;
        int i12 = iArr[i10];
        long j3 = v & 1048575;
        if (q(i12, i10, obj2)) {
            Object k10 = j1.k(obj, j3);
            Object k11 = j1.k(obj2, j3);
            if (k10 != null && k11 != null) {
                j1.d(obj, j3, z.a(k10, k11));
                i11 = iArr[i10 + 2];
            } else {
                if (k11 == null) {
                    return;
                }
                j1.d(obj, j3, k11);
                i11 = iArr[i10 + 2];
            }
            j1.b(i11 & 1048575, obj, i12);
        }
    }

    public final boolean z(y yVar, Object obj, int i10) {
        return r(i10, yVar) == r(i10, obj);
    }
}
