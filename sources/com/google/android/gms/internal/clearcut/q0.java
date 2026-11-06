package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class q0 implements a1 {
    public static final Unsafe o = j1.f();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final int e;
    public final j f;
    public final boolean g;
    public final int[] h;
    public final int[] i;
    public final int[] j;
    public final s0 k;
    public final h0 l;
    public final d1 m;
    public final n0 n;

    public q0(int[] iArr, Object[] objArr, int i7, int i10, int i11, j jVar, boolean z9, int[] iArr2, int[] iArr3, int[] iArr4, s0 s0Var, h0 h0Var, d1 d1Var, r rVar, n0 n0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i7;
        this.d = i10;
        this.e = i11;
        this.g = z9;
        this.h = iArr2;
        this.i = iArr3;
        this.j = iArr4;
        this.k = s0Var;
        this.l = h0Var;
        this.m = d1Var;
        this.f = jVar;
        this.n = n0Var;
    }

    public static int A(Object obj, long j3) {
        return ((Integer) j1.k(obj, j3)).intValue();
    }

    public static long B(Object obj, long j3) {
        return ((Long) j1.k(obj, j3)).longValue();
    }

    public static int h(a1 a1Var, int i7, byte[] bArr, int i10, int i11, c0 c0Var, m mVar) {
        int j3 = j(a1Var, bArr, i10, i11, mVar);
        while (true) {
            c0Var.add(mVar.c);
            if (j3 >= i11) {
                break;
            }
            int f10 = m1.f(bArr, j3, mVar);
            if (i7 != mVar.a) {
                break;
            }
            j3 = j(a1Var, bArr, f10, i11, mVar);
        }
        return j3;
    }

    public static int i(a1 a1Var, byte[] bArr, int i7, int i10, int i11, m mVar) {
        q0 q0Var = (q0) a1Var;
        Object a10 = q0Var.a();
        int m10 = q0Var.m(a10, bArr, i7, i10, i11, mVar);
        q0Var.b(a10);
        mVar.c = a10;
        return m10;
    }

    public static int j(a1 a1Var, byte[] bArr, int i7, int i10, m mVar) {
        int i11 = i7 + 1;
        int i12 = bArr[i7];
        if (i12 < 0) {
            i11 = m1.d(i12, bArr, i11, mVar);
            i12 = mVar.a;
        }
        int i13 = i11;
        if (i12 < 0 || i12 > i10 - i13) {
            throw d0.a();
        }
        Object a10 = a1Var.a();
        int i14 = i13 + i12;
        a1Var.f(a10, bArr, i13, i14, mVar);
        a1Var.b(a10);
        mVar.c = a10;
        return i14;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a0 A[EDGE_INSN: B:59:0x01a0->B:60:0x01a0 BREAK  A[LOOP:0: B:18:0x004a->B:29:0x0196], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q0 n(x0 x0Var, s0 s0Var, h0 h0Var, d1 d1Var, r rVar, n0 n0Var) {
        int i7;
        int i10;
        int i11;
        int[] iArr;
        u uVar;
        int i12;
        int i13;
        Field b10;
        int i14;
        int i15;
        Object obj;
        int i16;
        Field b11;
        Field b12;
        if (!(x0Var instanceof x0)) {
            x0Var.getClass();
            throw new ClassCastException();
        }
        y0 y0Var = x0Var.b;
        int i17 = 1;
        boolean z9 = (y0Var.d & 1) != 1;
        if (y0Var.e == 0) {
            i7 = 0;
            i10 = 0;
            i11 = 0;
        } else {
            int i18 = y0Var.g;
            int i19 = y0Var.h;
            i7 = y0Var.k;
            i10 = i18;
            i11 = i19;
        }
        int[] iArr2 = new int[i7 << 2];
        Object[] objArr = new Object[i7 << 1];
        int i20 = y0Var.i;
        int[] iArr3 = i20 > 0 ? new int[i20] : null;
        int i21 = y0Var.l;
        int[] iArr4 = i21 > 0 ? new int[i21] : null;
        boolean a10 = y0Var.a();
        Class cls = y0Var.c;
        Object[] objArr2 = y0Var.b;
        if (a10) {
            int i22 = y0Var.s;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            while (true) {
                if (i22 >= y0Var.j || i23 >= ((i22 - i10) << 2)) {
                    int i26 = i17;
                    int i27 = y0Var.u;
                    u uVar2 = u.s;
                    if (i27 <= uVar2.a) {
                        iArr = iArr2;
                        uVar = uVar2;
                        Field field = y0Var.x;
                        i1 i1Var = j1.d;
                        int a11 = (int) i1Var.a(field);
                        if ((y0Var.d & 1) == i26 && y0Var.u <= u.d.a) {
                            int i28 = (y0Var.w / 32) + (y0Var.f << 1);
                            Object obj2 = objArr2[i28];
                            if (obj2 instanceof Field) {
                                b10 = (Field) obj2;
                            } else {
                                b10 = y0.b(cls, (String) obj2);
                                objArr2[i28] = b10;
                            }
                            i13 = (int) i1Var.a(b10);
                            i14 = y0Var.w % 32;
                            i12 = a11;
                            iArr[i23] = y0Var.s;
                            int i29 = i23 + 1;
                            int i30 = i13;
                            int i31 = y0Var.t;
                            int i32 = i12;
                            int i33 = ((i31 & 256) == 0 ? TLObject.FLAG_28 : 0) | ((i31 & 512) == 0 ? TLObject.FLAG_29 : 0);
                            i15 = y0Var.u;
                            iArr[i29] = i33 | (i15 << 20) | i32;
                            iArr[i23 + 2] = (i14 << 20) | i30;
                            obj = y0Var.A;
                            if (obj == null) {
                                int i34 = (i23 / 4) << 1;
                                objArr[i34] = obj;
                                Object obj3 = y0Var.y;
                                if (obj3 != null) {
                                    objArr[i34 + 1] = obj3;
                                } else {
                                    Object obj4 = y0Var.z;
                                    if (obj4 != null) {
                                        objArr[i34 + 1] = obj4;
                                    }
                                }
                                i16 = 1;
                            } else {
                                Object obj5 = y0Var.y;
                                if (obj5 != null) {
                                    i16 = 1;
                                    objArr[((i23 / 4) << 1) + 1] = obj5;
                                } else {
                                    i16 = 1;
                                    Object obj6 = y0Var.z;
                                    if (obj6 != null) {
                                        objArr[((i23 / 4) << 1) + 1] = obj6;
                                    }
                                }
                            }
                            if (i15 != uVar.ordinal()) {
                                iArr3[i24] = i23;
                                i24++;
                            } else if (i15 >= 18 && i15 <= 49) {
                                iArr4[i25] = iArr[i29] & 1048575;
                                i25++;
                            }
                            if (y0Var.a()) {
                                break;
                            }
                            i22 = y0Var.s;
                        } else {
                            i12 = a11;
                            i13 = 0;
                        }
                    } else {
                        int i35 = y0Var.v << 1;
                        Object obj7 = objArr2[i35];
                        iArr = iArr2;
                        if (obj7 instanceof Field) {
                            b11 = (Field) obj7;
                        } else {
                            b11 = y0.b(cls, (String) obj7);
                            objArr2[i35] = b11;
                        }
                        i1 i1Var2 = j1.d;
                        uVar = uVar2;
                        int a12 = (int) i1Var2.a(b11);
                        int i36 = (y0Var.v << 1) + 1;
                        Object obj8 = objArr2[i36];
                        if (obj8 instanceof Field) {
                            b12 = (Field) obj8;
                        } else {
                            b12 = y0.b(cls, (String) obj8);
                            objArr2[i36] = b12;
                        }
                        i13 = (int) i1Var2.a(b12);
                        i12 = a12;
                    }
                    i14 = 0;
                    iArr[i23] = y0Var.s;
                    int i292 = i23 + 1;
                    int i302 = i13;
                    int i312 = y0Var.t;
                    int i322 = i12;
                    if ((i312 & 512) == 0) {
                    }
                    int i332 = ((i312 & 256) == 0 ? TLObject.FLAG_28 : 0) | ((i312 & 512) == 0 ? TLObject.FLAG_29 : 0);
                    i15 = y0Var.u;
                    iArr[i292] = i332 | (i15 << 20) | i322;
                    iArr[i23 + 2] = (i14 << 20) | i302;
                    obj = y0Var.A;
                    if (obj == null) {
                    }
                    if (i15 != uVar.ordinal()) {
                    }
                    if (y0Var.a()) {
                    }
                } else {
                    i16 = i17;
                    for (int i37 = 0; i37 < 4; i37++) {
                        iArr2[i23 + i37] = -1;
                    }
                    iArr = iArr2;
                }
                i23 += 4;
                i17 = i16;
                iArr2 = iArr;
            }
        } else {
            iArr = iArr2;
        }
        return new q0(iArr, objArr, i10, i11, y0Var.j, x0Var.a, z9, y0Var.m, iArr3, iArr4, s0Var, h0Var, d1Var, rVar, n0Var);
    }

    @Override // com.google.android.gms.internal.clearcut.a1
    public final Object a() {
        this.k.getClass();
        return ((z) this.f).a(4);
    }

    @Override // com.google.android.gms.internal.clearcut.a1
    public final void b(Object obj) {
        int[] iArr = this.i;
        if (iArr != null) {
            for (int i7 : iArr) {
                long v = v(i7) & 1048575;
                Object k10 = j1.k(obj, v);
                if (k10 != null) {
                    this.n.getClass();
                    ((m0) k10).a = false;
                    j1.d(obj, v, k10);
                }
            }
        }
        int[] iArr2 = this.j;
        if (iArr2 != null) {
            for (int i10 : iArr2) {
                this.l.a(obj, i10);
            }
        }
        this.m.getClass();
        ((z) obj).zzjp.d = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.clearcut.a1
    public final void c(z zVar, z zVar2) {
        z zVar3;
        i1 i1Var;
        long h;
        int i7;
        zVar2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i10 >= iArr.length) {
                z zVar4 = zVar;
                if (this.g) {
                    return;
                }
                b1.a(this.m, zVar4, zVar2);
                return;
            }
            int v = v(i10);
            long j3 = v & 1048575;
            int i11 = iArr[i10];
            switch ((v & 267386880) >>> 20) {
                case 0:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    } else {
                        i1 i1Var2 = j1.d;
                        i1Var2.c(zVar3, j3, i1Var2.k(zVar2, j3));
                        x(i10, zVar3);
                        break;
                    }
                case 1:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    } else {
                        i1 i1Var3 = j1.d;
                        i1Var3.d(zVar3, j3, i1Var3.j(zVar2, j3));
                        x(i10, zVar3);
                        break;
                    }
                case 2:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    }
                    i1Var = j1.d;
                    h = i1Var.h(zVar2, j3);
                    i1Var.e(zVar3, j3, h);
                    x(i10, zVar3);
                    break;
                case 3:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    }
                    i1Var = j1.d;
                    h = i1Var.h(zVar2, j3);
                    i1Var.e(zVar3, j3, h);
                    x(i10, zVar3);
                    break;
                case 4:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    }
                    j1.b(j3, zVar3, j1.d.g(zVar2, j3));
                    x(i10, zVar3);
                    break;
                case 5:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    }
                    i1Var = j1.d;
                    h = i1Var.h(zVar2, j3);
                    i1Var.e(zVar3, j3, h);
                    x(i10, zVar3);
                    break;
                case 6:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    }
                    j1.b(j3, zVar3, j1.d.g(zVar2, j3));
                    x(i10, zVar3);
                    break;
                case 7:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    } else {
                        i1 i1Var4 = j1.d;
                        i1Var4.f(zVar3, j3, i1Var4.i(zVar2, j3));
                        x(i10, zVar3);
                        break;
                    }
                case 8:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    }
                    j1.d(zVar3, j3, j1.k(zVar2, j3));
                    x(i10, zVar3);
                    break;
                case 9:
                    zVar3 = zVar;
                    o(i10, zVar3, zVar2);
                    break;
                case 10:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    }
                    j1.d(zVar3, j3, j1.k(zVar2, j3));
                    x(i10, zVar3);
                    break;
                case 11:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    }
                    j1.b(j3, zVar3, j1.d.g(zVar2, j3));
                    x(i10, zVar3);
                    break;
                case 12:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    }
                    j1.b(j3, zVar3, j1.d.g(zVar2, j3));
                    x(i10, zVar3);
                    break;
                case 13:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    }
                    j1.b(j3, zVar3, j1.d.g(zVar2, j3));
                    x(i10, zVar3);
                    break;
                case 14:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    }
                    i1Var = j1.d;
                    h = i1Var.h(zVar2, j3);
                    i1Var.e(zVar3, j3, h);
                    x(i10, zVar3);
                    break;
                case 15:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    }
                    j1.b(j3, zVar3, j1.d.g(zVar2, j3));
                    x(i10, zVar3);
                    break;
                case 16:
                    if (r(i10, zVar2)) {
                        i1Var = j1.d;
                        h = i1Var.h(zVar2, j3);
                        zVar3 = zVar;
                        i1Var.e(zVar3, j3, h);
                        x(i10, zVar3);
                        break;
                    }
                    zVar3 = zVar;
                    break;
                case 17:
                    o(i10, zVar, zVar2);
                    zVar3 = zVar;
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
                case qs.T /* 30 */:
                case qs.U /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.l.b(zVar, j3, zVar2);
                    zVar3 = zVar;
                    break;
                case 50:
                    Class cls = b1.a;
                    Object k10 = j1.k(zVar, j3);
                    Object k11 = j1.k(zVar2, j3);
                    this.n.getClass();
                    j1.d(zVar, j3, n0.a(k10, k11));
                    zVar3 = zVar;
                    break;
                case qs.o0 /* 51 */:
                case qs.p0 /* 52 */:
                case qs.q0 /* 53 */:
                case qs.r0 /* 54 */:
                case qs.s0 /* 55 */:
                case qs.t0 /* 56 */:
                case qs.u0 /* 57 */:
                case qs.v0 /* 58 */:
                case qs.w0 /* 59 */:
                    if (q(i11, i10, zVar2)) {
                        j1.d(zVar, j3, j1.k(zVar2, j3));
                        i7 = iArr[i10 + 2];
                        j1.b(i7 & 1048575, zVar, i11);
                    }
                    zVar3 = zVar;
                    break;
                case qs.x0 /* 60 */:
                case qs.F0 /* 68 */:
                    y(i10, zVar, zVar2);
                    zVar3 = zVar;
                    break;
                case qs.y0 /* 61 */:
                case qs.z0 /* 62 */:
                case qs.A0 /* 63 */:
                case 64:
                case 65:
                case qs.D0 /* 66 */:
                case qs.E0 /* 67 */:
                    if (q(i11, i10, zVar2)) {
                        j1.d(zVar, j3, j1.k(zVar2, j3));
                        i7 = iArr[i10 + 2];
                        j1.b(i7 & 1048575, zVar, i11);
                    }
                    zVar3 = zVar;
                    break;
                default:
                    zVar3 = zVar;
                    break;
            }
            i10 += 4;
            zVar = zVar3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        if (com.google.android.gms.internal.clearcut.b1.c(com.google.android.gms.internal.clearcut.j1.k(r12, r7), com.google.android.gms.internal.clearcut.j1.k(r13, r7)) != false) goto L104;
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
    
        if (com.google.android.gms.internal.clearcut.b1.c(com.google.android.gms.internal.clearcut.j1.k(r12, r7), com.google.android.gms.internal.clearcut.j1.k(r13, r7)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0102, code lost:
    
        if (com.google.android.gms.internal.clearcut.b1.c(com.google.android.gms.internal.clearcut.j1.k(r12, r7), com.google.android.gms.internal.clearcut.j1.k(r13, r7)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0118, code lost:
    
        if (com.google.android.gms.internal.clearcut.b1.c(com.google.android.gms.internal.clearcut.j1.k(r12, r7), com.google.android.gms.internal.clearcut.j1.k(r13, r7)) != false) goto L104;
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
    
        if (com.google.android.gms.internal.clearcut.b1.c(com.google.android.gms.internal.clearcut.j1.k(r12, r7), com.google.android.gms.internal.clearcut.j1.k(r13, r7)) != false) goto L104;
     */
    @Override // com.google.android.gms.internal.clearcut.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(z zVar, z zVar2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i7 = 0;
        while (true) {
            boolean z9 = true;
            if (i7 < length) {
                int v = v(i7);
                long j3 = v & 1048575;
                switch ((v & 267386880) >>> 20) {
                    case 0:
                        if (z(zVar, zVar2, i7)) {
                            i1 i1Var = j1.d;
                            break;
                        }
                        z9 = false;
                        break;
                    case 1:
                        if (z(zVar, zVar2, i7)) {
                            i1 i1Var2 = j1.d;
                            break;
                        }
                        z9 = false;
                        break;
                    case 2:
                        if (z(zVar, zVar2, i7)) {
                            i1 i1Var3 = j1.d;
                            break;
                        }
                        z9 = false;
                        break;
                    case 3:
                        if (z(zVar, zVar2, i7)) {
                            i1 i1Var4 = j1.d;
                            break;
                        }
                        z9 = false;
                        break;
                    case 4:
                        if (z(zVar, zVar2, i7)) {
                            i1 i1Var5 = j1.d;
                            break;
                        }
                        z9 = false;
                        break;
                    case 5:
                        if (z(zVar, zVar2, i7)) {
                            i1 i1Var6 = j1.d;
                            break;
                        }
                        z9 = false;
                        break;
                    case 6:
                        if (z(zVar, zVar2, i7)) {
                            i1 i1Var7 = j1.d;
                            break;
                        }
                        z9 = false;
                        break;
                    case 7:
                        if (z(zVar, zVar2, i7)) {
                            i1 i1Var8 = j1.d;
                            break;
                        }
                        z9 = false;
                        break;
                    case 8:
                        if (z(zVar, zVar2, i7)) {
                            break;
                        }
                        z9 = false;
                        break;
                    case 9:
                        if (z(zVar, zVar2, i7)) {
                            break;
                        }
                        z9 = false;
                        break;
                    case 10:
                        if (z(zVar, zVar2, i7)) {
                            break;
                        }
                        z9 = false;
                        break;
                    case 11:
                        if (z(zVar, zVar2, i7)) {
                            i1 i1Var9 = j1.d;
                            break;
                        }
                        z9 = false;
                        break;
                    case 12:
                        if (z(zVar, zVar2, i7)) {
                            i1 i1Var10 = j1.d;
                            break;
                        }
                        z9 = false;
                        break;
                    case 13:
                        if (z(zVar, zVar2, i7)) {
                            i1 i1Var11 = j1.d;
                            break;
                        }
                        z9 = false;
                        break;
                    case 14:
                        if (z(zVar, zVar2, i7)) {
                            i1 i1Var12 = j1.d;
                            break;
                        }
                        z9 = false;
                        break;
                    case 15:
                        if (z(zVar, zVar2, i7)) {
                            i1 i1Var13 = j1.d;
                            break;
                        }
                        z9 = false;
                        break;
                    case 16:
                        if (z(zVar, zVar2, i7)) {
                            i1 i1Var14 = j1.d;
                            break;
                        }
                        z9 = false;
                        break;
                    case 17:
                        if (z(zVar, zVar2, i7)) {
                            break;
                        }
                        z9 = false;
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
                    case qs.T /* 30 */:
                    case qs.U /* 31 */:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                        z9 = b1.c(j1.k(zVar, j3), j1.k(zVar2, j3));
                        break;
                    case qs.o0 /* 51 */:
                    case qs.p0 /* 52 */:
                    case qs.q0 /* 53 */:
                    case qs.r0 /* 54 */:
                    case qs.s0 /* 55 */:
                    case qs.t0 /* 56 */:
                    case qs.u0 /* 57 */:
                    case qs.v0 /* 58 */:
                    case qs.w0 /* 59 */:
                    case qs.x0 /* 60 */:
                    case qs.y0 /* 61 */:
                    case qs.z0 /* 62 */:
                    case qs.A0 /* 63 */:
                    case 64:
                    case 65:
                    case qs.D0 /* 66 */:
                    case qs.E0 /* 67 */:
                    case qs.F0 /* 68 */:
                        long j10 = iArr[i7 + 2] & 1048575;
                        i1 i1Var15 = j1.d;
                        if (i1Var15.g(zVar, j10) == i1Var15.g(zVar2, j10)) {
                            break;
                        }
                        z9 = false;
                        break;
                }
                if (z9) {
                    i7 += 4;
                }
            } else {
                this.m.getClass();
                if (zVar.zzjp.equals(zVar2.zzjp)) {
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
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ae, code lost:
    
        r3 = r8 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x015d, code lost:
    
        if (r4 != false) goto L44;
     */
    @Override // com.google.android.gms.internal.clearcut.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(z zVar) {
        int i7;
        long doubleToLongBits;
        int floatToIntBits;
        int i10;
        long doubleToLongBits2;
        Object k10;
        int[] iArr = this.a;
        int length = iArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 4) {
            int v = v(i12);
            int i13 = iArr[i12];
            long j3 = 1048575 & v;
            int i14 = 1237;
            int i15 = 37;
            switch ((v & 267386880) >>> 20) {
                case 0:
                    i7 = i11 * 53;
                    doubleToLongBits = Double.doubleToLongBits(j1.d.k(zVar, j3));
                    floatToIntBits = a0.b(doubleToLongBits);
                    i11 = floatToIntBits + i7;
                    break;
                case 1:
                    i7 = i11 * 53;
                    floatToIntBits = Float.floatToIntBits(j1.d.j(zVar, j3));
                    i11 = floatToIntBits + i7;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i7 = i11 * 53;
                    doubleToLongBits = j1.d.h(zVar, j3);
                    floatToIntBits = a0.b(doubleToLongBits);
                    i11 = floatToIntBits + i7;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i7 = i11 * 53;
                    floatToIntBits = j1.d.g(zVar, j3);
                    i11 = floatToIntBits + i7;
                    break;
                case 7:
                    i10 = i11 * 53;
                    boolean i16 = j1.d.i(zVar, j3);
                    Charset charset = a0.a;
                    break;
                case 8:
                    i7 = i11 * 53;
                    floatToIntBits = ((String) j1.k(zVar, j3)).hashCode();
                    i11 = floatToIntBits + i7;
                    break;
                case 9:
                    Object k11 = j1.k(zVar, j3);
                    if (k11 != null) {
                        i15 = k11.hashCode();
                    }
                    i11 = (i11 * 53) + i15;
                    break;
                case 10:
                    i7 = i11 * 53;
                    floatToIntBits = j1.k(zVar, j3).hashCode();
                    i11 = floatToIntBits + i7;
                    break;
                case 17:
                    Object k12 = j1.k(zVar, j3);
                    if (k12 != null) {
                        i15 = k12.hashCode();
                    }
                    i11 = (i11 * 53) + i15;
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
                case qs.T /* 30 */:
                case qs.U /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    i7 = i11 * 53;
                    k10 = j1.k(zVar, j3);
                    floatToIntBits = k10.hashCode();
                    i11 = floatToIntBits + i7;
                    break;
                case qs.o0 /* 51 */:
                    if (q(i13, i12, zVar)) {
                        i7 = i11 * 53;
                        doubleToLongBits2 = Double.doubleToLongBits(((Double) j1.k(zVar, j3)).doubleValue());
                        floatToIntBits = a0.b(doubleToLongBits2);
                        i11 = floatToIntBits + i7;
                        break;
                    } else {
                        break;
                    }
                case qs.p0 /* 52 */:
                    if (q(i13, i12, zVar)) {
                        i7 = i11 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) j1.k(zVar, j3)).floatValue());
                        i11 = floatToIntBits + i7;
                        break;
                    } else {
                        break;
                    }
                case qs.q0 /* 53 */:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    i7 = i11 * 53;
                    doubleToLongBits2 = B(zVar, j3);
                    floatToIntBits = a0.b(doubleToLongBits2);
                    i11 = floatToIntBits + i7;
                    break;
                case qs.r0 /* 54 */:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    i7 = i11 * 53;
                    doubleToLongBits2 = B(zVar, j3);
                    floatToIntBits = a0.b(doubleToLongBits2);
                    i11 = floatToIntBits + i7;
                    break;
                case qs.s0 /* 55 */:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    i7 = i11 * 53;
                    floatToIntBits = A(zVar, j3);
                    i11 = floatToIntBits + i7;
                    break;
                case qs.t0 /* 56 */:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    i7 = i11 * 53;
                    doubleToLongBits2 = B(zVar, j3);
                    floatToIntBits = a0.b(doubleToLongBits2);
                    i11 = floatToIntBits + i7;
                    break;
                case qs.u0 /* 57 */:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    i7 = i11 * 53;
                    floatToIntBits = A(zVar, j3);
                    i11 = floatToIntBits + i7;
                    break;
                case qs.v0 /* 58 */:
                    if (q(i13, i12, zVar)) {
                        i10 = i11 * 53;
                        boolean booleanValue = ((Boolean) j1.k(zVar, j3)).booleanValue();
                        Charset charset2 = a0.a;
                        break;
                    } else {
                        break;
                    }
                case qs.w0 /* 59 */:
                    if (q(i13, i12, zVar)) {
                        i7 = i11 * 53;
                        floatToIntBits = ((String) j1.k(zVar, j3)).hashCode();
                        i11 = floatToIntBits + i7;
                        break;
                    } else {
                        break;
                    }
                case qs.x0 /* 60 */:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    k10 = j1.k(zVar, j3);
                    i7 = i11 * 53;
                    floatToIntBits = k10.hashCode();
                    i11 = floatToIntBits + i7;
                    break;
                case qs.y0 /* 61 */:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    i7 = i11 * 53;
                    k10 = j1.k(zVar, j3);
                    floatToIntBits = k10.hashCode();
                    i11 = floatToIntBits + i7;
                    break;
                case qs.z0 /* 62 */:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    i7 = i11 * 53;
                    floatToIntBits = A(zVar, j3);
                    i11 = floatToIntBits + i7;
                    break;
                case qs.A0 /* 63 */:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    i7 = i11 * 53;
                    floatToIntBits = A(zVar, j3);
                    i11 = floatToIntBits + i7;
                    break;
                case 64:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    i7 = i11 * 53;
                    floatToIntBits = A(zVar, j3);
                    i11 = floatToIntBits + i7;
                    break;
                case 65:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    i7 = i11 * 53;
                    doubleToLongBits2 = B(zVar, j3);
                    floatToIntBits = a0.b(doubleToLongBits2);
                    i11 = floatToIntBits + i7;
                    break;
                case qs.D0 /* 66 */:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    i7 = i11 * 53;
                    floatToIntBits = A(zVar, j3);
                    i11 = floatToIntBits + i7;
                    break;
                case qs.E0 /* 67 */:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    i7 = i11 * 53;
                    doubleToLongBits2 = B(zVar, j3);
                    floatToIntBits = a0.b(doubleToLongBits2);
                    i11 = floatToIntBits + i7;
                    break;
                case qs.F0 /* 68 */:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    k10 = j1.k(zVar, j3);
                    i7 = i11 * 53;
                    floatToIntBits = k10.hashCode();
                    i11 = floatToIntBits + i7;
                    break;
            }
        }
        this.m.getClass();
        return zVar.zzjp.hashCode() + (i11 * 53);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x01d7, code lost:
    
        if (r6 == r9) goto L93;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0041. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0218  */
    @Override // com.google.android.gms.internal.clearcut.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Object obj, byte[] bArr, int i7, int i10, m mVar) {
        Unsafe unsafe;
        int i11;
        int i12;
        c1 c1Var;
        int k10;
        Unsafe unsafe2;
        Object obj2;
        Object a10;
        Object obj3;
        int i13;
        q0 q0Var = this;
        byte[] bArr2 = bArr;
        int i14 = i10;
        m mVar2 = mVar;
        if (!q0Var.g) {
            m(obj, bArr, i7, i14, 0, mVar);
            return;
        }
        Unsafe unsafe3 = o;
        int i15 = i7;
        while (i15 < i14) {
            int i16 = i15 + 1;
            int i17 = bArr2[i15];
            if (i17 < 0) {
                i16 = m1.d(i17, bArr2, i16, mVar2);
                i17 = mVar2.a;
            }
            int i18 = i17;
            int i19 = i16;
            int i20 = i18 >>> 3;
            int i21 = i18 & 7;
            int w10 = q0Var.w(i20);
            if (w10 >= 0) {
                int i22 = q0Var.a[w10 + 1];
                int i23 = (267386880 & i22) >>> 20;
                long j3 = 1048575 & i22;
                if (i23 <= 17) {
                    switch (i23) {
                        case 0:
                            unsafe = unsafe3;
                            if (i21 != 1) {
                                i11 = i19;
                                i12 = i11;
                                z zVar = (z) obj;
                                c1Var = zVar.zzjp;
                                if (c1Var == c1.e) {
                                    c1Var = c1.b();
                                    zVar.zzjp = c1Var;
                                }
                                i15 = m1.c(i18, bArr, i12, i10, c1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i14 = i10;
                                break;
                            } else {
                                j1.d.c(obj, j3, Double.longBitsToDouble(m1.r(i19, bArr2)));
                                i15 = i19 + 8;
                                break;
                            }
                        case 1:
                            unsafe = unsafe3;
                            if (i21 == 5) {
                                j1.d.d(obj, j3, Float.intBitsToFloat(m1.o(i19, bArr2)));
                                i15 = i19 + 4;
                                break;
                            }
                            i11 = i19;
                            i12 = i11;
                            z zVar2 = (z) obj;
                            c1Var = zVar2.zzjp;
                            if (c1Var == c1.e) {
                            }
                            i15 = m1.c(i18, bArr, i12, i10, c1Var, mVar);
                            q0Var = this;
                            bArr2 = bArr;
                            mVar2 = mVar;
                            i14 = i10;
                            break;
                        case 2:
                        case 3:
                            Unsafe unsafe4 = unsafe3;
                            if (i21 != 0) {
                                unsafe = unsafe4;
                                i11 = i19;
                                i12 = i11;
                                z zVar22 = (z) obj;
                                c1Var = zVar22.zzjp;
                                if (c1Var == c1.e) {
                                }
                                i15 = m1.c(i18, bArr, i12, i10, c1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i14 = i10;
                                break;
                            } else {
                                int m10 = m1.m(bArr2, i19, mVar2);
                                unsafe4.putLong(obj, j3, mVar2.b);
                                unsafe = unsafe4;
                                i15 = m10;
                                break;
                            }
                            break;
                        case 4:
                        case 11:
                            unsafe2 = unsafe3;
                            if (i21 != 0) {
                                i11 = i19;
                                unsafe = unsafe2;
                                i12 = i11;
                                z zVar222 = (z) obj;
                                c1Var = zVar222.zzjp;
                                if (c1Var == c1.e) {
                                }
                                i15 = m1.c(i18, bArr, i12, i10, c1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i14 = i10;
                                break;
                            } else {
                                i15 = m1.f(bArr2, i19, mVar2);
                                unsafe2.putInt(obj, j3, mVar2.a);
                                unsafe3 = unsafe2;
                                break;
                            }
                            break;
                        case 5:
                        case 14:
                            unsafe2 = unsafe3;
                            if (i21 != 1) {
                                i11 = i19;
                                unsafe = unsafe2;
                                i12 = i11;
                                z zVar2222 = (z) obj;
                                c1Var = zVar2222.zzjp;
                                if (c1Var == c1.e) {
                                }
                                i15 = m1.c(i18, bArr, i12, i10, c1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i14 = i10;
                                break;
                            } else {
                                unsafe2.putLong(obj, j3, m1.r(i19, bArr2));
                                i15 = i19 + 8;
                                unsafe3 = unsafe2;
                                break;
                            }
                            break;
                        case 6:
                        case 13:
                            unsafe2 = unsafe3;
                            if (i21 != 5) {
                                i11 = i19;
                                unsafe = unsafe2;
                                i12 = i11;
                                z zVar22222 = (z) obj;
                                c1Var = zVar22222.zzjp;
                                if (c1Var == c1.e) {
                                }
                                i15 = m1.c(i18, bArr, i12, i10, c1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i14 = i10;
                                break;
                            } else {
                                unsafe2.putInt(obj, j3, m1.o(i19, bArr2));
                                i15 = i19 + 4;
                                unsafe3 = unsafe2;
                                break;
                            }
                            break;
                        case 7:
                            unsafe2 = unsafe3;
                            if (i21 != 0) {
                                i11 = i19;
                                unsafe = unsafe2;
                                i12 = i11;
                                z zVar222222 = (z) obj;
                                c1Var = zVar222222.zzjp;
                                if (c1Var == c1.e) {
                                }
                                i15 = m1.c(i18, bArr, i12, i10, c1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i14 = i10;
                                break;
                            } else {
                                i15 = m1.m(bArr2, i19, mVar2);
                                j1.d.f(obj, j3, mVar2.b != 0);
                                unsafe3 = unsafe2;
                                break;
                            }
                            break;
                        case 8:
                            unsafe2 = unsafe3;
                            obj2 = obj;
                            if (i21 != 2) {
                                i11 = i19;
                                unsafe = unsafe2;
                                i12 = i11;
                                z zVar2222222 = (z) obj;
                                c1Var = zVar2222222.zzjp;
                                if (c1Var == c1.e) {
                                }
                                i15 = m1.c(i18, bArr, i12, i10, c1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i14 = i10;
                                break;
                            } else {
                                if ((536870912 & i22) == 0) {
                                    i15 = m1.f(bArr2, i19, mVar2);
                                    int i24 = mVar2.a;
                                    if (i24 == 0) {
                                        mVar2.c = "";
                                    } else {
                                        mVar2.c = new String(bArr2, i15, i24, a0.a);
                                        i15 += i24;
                                    }
                                } else {
                                    i15 = m1.q(bArr2, i19, mVar2);
                                }
                                a10 = mVar2.c;
                                unsafe2.putObject(obj2, j3, a10);
                                unsafe3 = unsafe2;
                                break;
                            }
                            break;
                        case 9:
                            unsafe2 = unsafe3;
                            obj2 = obj;
                            if (i21 != 2) {
                                i11 = i19;
                                unsafe = unsafe2;
                                i12 = i11;
                                z zVar22222222 = (z) obj;
                                c1Var = zVar22222222.zzjp;
                                if (c1Var == c1.e) {
                                }
                                i15 = m1.c(i18, bArr, i12, i10, c1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i14 = i10;
                                break;
                            } else {
                                i15 = j(q0Var.s(w10), bArr2, i19, i14, mVar2);
                                Object object = unsafe2.getObject(obj2, j3);
                                a10 = object == null ? mVar2.c : a0.a(object, mVar2.c);
                                unsafe2.putObject(obj2, j3, a10);
                                unsafe3 = unsafe2;
                                break;
                            }
                            break;
                        case 10:
                            unsafe2 = unsafe3;
                            obj2 = obj;
                            if (i21 != 2) {
                                i11 = i19;
                                unsafe = unsafe2;
                                i12 = i11;
                                z zVar222222222 = (z) obj;
                                c1Var = zVar222222222.zzjp;
                                if (c1Var == c1.e) {
                                }
                                i15 = m1.c(i18, bArr, i12, i10, c1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i14 = i10;
                                break;
                            } else {
                                i15 = m1.s(bArr2, i19, mVar2);
                                a10 = mVar2.c;
                                unsafe2.putObject(obj2, j3, a10);
                                unsafe3 = unsafe2;
                                break;
                            }
                            break;
                        case 12:
                            unsafe2 = unsafe3;
                            obj3 = obj;
                            if (i21 != 0) {
                                i11 = i19;
                                unsafe = unsafe2;
                                i12 = i11;
                                z zVar2222222222 = (z) obj;
                                c1Var = zVar2222222222.zzjp;
                                if (c1Var == c1.e) {
                                }
                                i15 = m1.c(i18, bArr, i12, i10, c1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i14 = i10;
                                break;
                            } else {
                                i15 = m1.f(bArr2, i19, mVar2);
                                i13 = mVar2.a;
                                unsafe2.putInt(obj3, j3, i13);
                                unsafe3 = unsafe2;
                                break;
                            }
                            break;
                        case 15:
                            unsafe2 = unsafe3;
                            obj3 = obj;
                            if (i21 != 0) {
                                i11 = i19;
                                unsafe = unsafe2;
                                i12 = i11;
                                z zVar22222222222 = (z) obj;
                                c1Var = zVar22222222222.zzjp;
                                if (c1Var == c1.e) {
                                }
                                i15 = m1.c(i18, bArr, i12, i10, c1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i14 = i10;
                                break;
                            } else {
                                i15 = m1.f(bArr2, i19, mVar2);
                                int i25 = mVar2.a;
                                i13 = (-(i25 & 1)) ^ (i25 >>> 1);
                                unsafe2.putInt(obj3, j3, i13);
                                unsafe3 = unsafe2;
                                break;
                            }
                            break;
                        case 16:
                            if (i21 != 0) {
                                unsafe2 = unsafe3;
                                i11 = i19;
                                unsafe = unsafe2;
                                i12 = i11;
                                z zVar222222222222 = (z) obj;
                                c1Var = zVar222222222222.zzjp;
                                if (c1Var == c1.e) {
                                }
                                i15 = m1.c(i18, bArr, i12, i10, c1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i14 = i10;
                                break;
                            } else {
                                int m11 = m1.m(bArr2, i19, mVar2);
                                long j10 = mVar2.b;
                                unsafe3.putLong(obj, j3, (-(j10 & 1)) ^ (j10 >>> 1));
                                unsafe2 = unsafe3;
                                i15 = m11;
                                unsafe3 = unsafe2;
                                break;
                            }
                            break;
                    }
                } else {
                    unsafe = unsafe3;
                    if (i23 == 27) {
                        if (i21 == 2) {
                            c0 c0Var = (c0) unsafe.getObject(obj, j3);
                            if (!((k) c0Var).a) {
                                int size = c0Var.size();
                                c0Var = c0Var.h(size == 0 ? 10 : size << 1);
                                unsafe.putObject(obj, j3, c0Var);
                            }
                            i15 = h(q0Var.s(w10), i18, bArr2, i19, i14, c0Var, mVar2);
                            bArr2 = bArr;
                            i14 = i10;
                            mVar2 = mVar;
                        } else {
                            i18 = i18;
                            i11 = i19;
                            i12 = i11;
                            z zVar2222222222222 = (z) obj;
                            c1Var = zVar2222222222222.zzjp;
                            if (c1Var == c1.e) {
                            }
                            i15 = m1.c(i18, bArr, i12, i10, c1Var, mVar);
                            q0Var = this;
                            bArr2 = bArr;
                            mVar2 = mVar;
                            i14 = i10;
                        }
                    } else if (i23 <= 49) {
                        i18 = i18;
                        k10 = q0Var.l(obj, bArr, i19, i10, i18, i20, i21, w10, i22, i23, j3, mVar);
                    } else {
                        i18 = i18;
                        if (i23 != 50) {
                            k10 = q0Var.k(obj, bArr, i19, i10, i18, i20, i21, i22, i23, j3, w10, mVar);
                            if (k10 != i19) {
                                q0Var = this;
                                bArr2 = bArr;
                                i14 = i10;
                                mVar2 = mVar;
                                i15 = k10;
                            }
                            i12 = k10;
                            z zVar22222222222222 = (z) obj;
                            c1Var = zVar22222222222222.zzjp;
                            if (c1Var == c1.e) {
                            }
                            i15 = m1.c(i18, bArr, i12, i10, c1Var, mVar);
                            q0Var = this;
                            bArr2 = bArr;
                            mVar2 = mVar;
                            i14 = i10;
                        } else {
                            if (i21 == 2) {
                                q0Var.p(j3, obj, w10);
                                throw null;
                            }
                            i11 = i19;
                            i12 = i11;
                            z zVar222222222222222 = (z) obj;
                            c1Var = zVar222222222222222.zzjp;
                            if (c1Var == c1.e) {
                            }
                            i15 = m1.c(i18, bArr, i12, i10, c1Var, mVar);
                            q0Var = this;
                            bArr2 = bArr;
                            mVar2 = mVar;
                            i14 = i10;
                        }
                    }
                }
                unsafe3 = unsafe;
            }
            unsafe = unsafe3;
            i11 = i19;
            i12 = i11;
            z zVar2222222222222222 = (z) obj;
            c1Var = zVar2222222222222222.zzjp;
            if (c1Var == c1.e) {
            }
            i15 = m1.c(i18, bArr, i12, i10, c1Var, mVar);
            q0Var = this;
            bArr2 = bArr;
            mVar2 = mVar;
            i14 = i10;
            unsafe3 = unsafe;
        }
        if (i15 != i14) {
            throw d0.b();
        }
    }

    @Override // com.google.android.gms.internal.clearcut.a1
    public final boolean g(Object obj) {
        boolean z9;
        int[] iArr;
        int i7;
        boolean z10 = true;
        z10 = true;
        z10 = true;
        int[] iArr2 = this.h;
        if (iArr2 != null && iArr2.length != 0) {
            int length = iArr2.length;
            int i10 = -1;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                int i13 = iArr2[i11];
                int w10 = w(i13);
                int v = v(w10);
                boolean z11 = this.g;
                if (z11) {
                    z9 = z10 ? 1 : 0;
                    iArr = iArr2;
                    i7 = 0;
                } else {
                    int i14 = this.a[w10 + 2];
                    int i15 = i14 & 1048575;
                    i7 = (z10 ? 1 : 0) << (i14 >>> 20);
                    if (i15 != i10) {
                        Unsafe unsafe = o;
                        z9 = z10 ? 1 : 0;
                        iArr = iArr2;
                        i12 = unsafe.getInt(obj, i15);
                        i10 = i15;
                    } else {
                        z9 = z10 ? 1 : 0;
                        iArr = iArr2;
                    }
                }
                if ((268435456 & v) != 0) {
                    if (!(z11 ? r(w10, obj) : (i12 & i7) != 0 ? z9 : false)) {
                        return false;
                    }
                }
                int i16 = (267386880 & v) >>> 20;
                if (i16 == 9 || i16 == 17) {
                    if ((z11 ? r(w10, obj) : (i12 & i7) != 0 ? z9 : false) && !s(w10).g(j1.k(obj, v & 1048575))) {
                        return false;
                    }
                    i11++;
                    z10 = z9;
                    iArr2 = iArr;
                } else {
                    if (i16 != 27) {
                        if (i16 == 60 || i16 == 68) {
                            if (q(i13, w10, obj) && !s(w10).g(j1.k(obj, v & 1048575))) {
                                return false;
                            }
                        } else if (i16 != 49) {
                            if (i16 != 50) {
                                continue;
                            } else {
                                Object k10 = j1.k(obj, v & 1048575);
                                this.n.getClass();
                                if (!((m0) k10).isEmpty()) {
                                    t(w10);
                                    throw new NoSuchMethodError();
                                }
                            }
                        }
                        i11++;
                        z10 = z9;
                        iArr2 = iArr;
                    }
                    List list = (List) j1.k(obj, v & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        a1 s5 = s(w10);
                        for (int i17 = 0; i17 < list.size(); i17++) {
                            if (!s5.g(list.get(i17))) {
                                return false;
                            }
                        }
                    }
                    i11++;
                    z10 = z9;
                    iArr2 = iArr;
                }
            }
        }
        return z10;
    }

    public final int k(Object obj, byte[] bArr, int i7, int i10, int i11, int i12, int i13, int i14, int i15, long j3, int i16, m mVar) {
        int i17;
        Object valueOf;
        int i18;
        Object valueOf2;
        int m10;
        long j10;
        int i19;
        Object valueOf3;
        Object object;
        Unsafe unsafe = o;
        long j11 = this.a[i16 + 2] & 1048575;
        switch (i15) {
            case qs.o0 /* 51 */:
                i17 = i7;
                if (i13 != 1) {
                    return i17;
                }
                valueOf = Double.valueOf(Double.longBitsToDouble(m1.r(i17, bArr)));
                unsafe.putObject(obj, j3, valueOf);
                m10 = i17 + 8;
                unsafe.putInt(obj, j11, i12);
                return m10;
            case qs.p0 /* 52 */:
                i18 = i7;
                if (i13 != 5) {
                    return i18;
                }
                valueOf2 = Float.valueOf(Float.intBitsToFloat(m1.o(i18, bArr)));
                unsafe.putObject(obj, j3, valueOf2);
                m10 = i18 + 4;
                unsafe.putInt(obj, j11, i12);
                return m10;
            case qs.q0 /* 53 */:
            case qs.r0 /* 54 */:
                if (i13 != 0) {
                    return i7;
                }
                m10 = m1.m(bArr, i7, mVar);
                j10 = mVar.b;
                valueOf3 = Long.valueOf(j10);
                unsafe.putObject(obj, j3, valueOf3);
                unsafe.putInt(obj, j11, i12);
                return m10;
            case qs.s0 /* 55 */:
            case qs.z0 /* 62 */:
                if (i13 != 0) {
                    return i7;
                }
                m10 = m1.f(bArr, i7, mVar);
                i19 = mVar.a;
                valueOf3 = Integer.valueOf(i19);
                unsafe.putObject(obj, j3, valueOf3);
                unsafe.putInt(obj, j11, i12);
                return m10;
            case qs.t0 /* 56 */:
            case 65:
                i17 = i7;
                if (i13 != 1) {
                    return i17;
                }
                valueOf = Long.valueOf(m1.r(i17, bArr));
                unsafe.putObject(obj, j3, valueOf);
                m10 = i17 + 8;
                unsafe.putInt(obj, j11, i12);
                return m10;
            case qs.u0 /* 57 */:
            case 64:
                i18 = i7;
                if (i13 != 5) {
                    return i18;
                }
                valueOf2 = Integer.valueOf(m1.o(i18, bArr));
                unsafe.putObject(obj, j3, valueOf2);
                m10 = i18 + 4;
                unsafe.putInt(obj, j11, i12);
                return m10;
            case qs.v0 /* 58 */:
                if (i13 != 0) {
                    return i7;
                }
                m10 = m1.m(bArr, i7, mVar);
                valueOf3 = Boolean.valueOf(mVar.b != 0);
                unsafe.putObject(obj, j3, valueOf3);
                unsafe.putInt(obj, j11, i12);
                return m10;
            case qs.w0 /* 59 */:
                if (i13 != 2) {
                    return i7;
                }
                int f10 = m1.f(bArr, i7, mVar);
                int i20 = mVar.a;
                if (i20 == 0) {
                    unsafe.putObject(obj, j3, "");
                } else {
                    if ((i14 & TLObject.FLAG_29) != 0) {
                        if (!l1.a.t(bArr, f10, f10 + i20)) {
                            throw new d0("Protocol message had invalid UTF-8.");
                        }
                    }
                    unsafe.putObject(obj, j3, new String(bArr, f10, i20, a0.a));
                    f10 += i20;
                }
                unsafe.putInt(obj, j11, i12);
                return f10;
            case qs.x0 /* 60 */:
                if (i13 != 2) {
                    return i7;
                }
                int j12 = j(s(i16), bArr, i7, i10, mVar);
                object = unsafe.getInt(obj, j11) == i12 ? unsafe.getObject(obj, j3) : null;
                Object obj2 = mVar.c;
                if (object != null) {
                    obj2 = a0.a(object, obj2);
                }
                unsafe.putObject(obj, j3, obj2);
                unsafe.putInt(obj, j11, i12);
                return j12;
            case qs.y0 /* 61 */:
                if (i13 != 2) {
                    return i7;
                }
                int f11 = m1.f(bArr, i7, mVar);
                int i21 = mVar.a;
                if (i21 == 0) {
                    unsafe.putObject(obj, j3, o.c);
                } else {
                    unsafe.putObject(obj, j3, o.i(f11, i21, bArr));
                    f11 += i21;
                }
                unsafe.putInt(obj, j11, i12);
                return f11;
            case qs.A0 /* 63 */:
                if (i13 != 0) {
                    return i7;
                }
                int f12 = m1.f(bArr, i7, mVar);
                int i22 = mVar.a;
                b0 u10 = u(i16);
                if (u10 == null || u10.a(i22) != null) {
                    unsafe.putObject(obj, j3, Integer.valueOf(i22));
                    m10 = f12;
                    unsafe.putInt(obj, j11, i12);
                    return m10;
                }
                z zVar = (z) obj;
                c1 c1Var = zVar.zzjp;
                if (c1Var == c1.e) {
                    c1Var = c1.b();
                    zVar.zzjp = c1Var;
                }
                c1Var.a(i11, Long.valueOf(i22));
                return f12;
            case qs.D0 /* 66 */:
                if (i13 != 0) {
                    return i7;
                }
                m10 = m1.f(bArr, i7, mVar);
                int i23 = mVar.a;
                i19 = (-(i23 & 1)) ^ (i23 >>> 1);
                valueOf3 = Integer.valueOf(i19);
                unsafe.putObject(obj, j3, valueOf3);
                unsafe.putInt(obj, j11, i12);
                return m10;
            case qs.E0 /* 67 */:
                if (i13 != 0) {
                    return i7;
                }
                m10 = m1.m(bArr, i7, mVar);
                long j13 = mVar.b;
                j10 = (-(j13 & 1)) ^ (j13 >>> 1);
                valueOf3 = Long.valueOf(j10);
                unsafe.putObject(obj, j3, valueOf3);
                unsafe.putInt(obj, j11, i12);
                return m10;
            case qs.F0 /* 68 */:
                if (i13 == 3) {
                    m10 = i(s(i16), bArr, i7, i10, (i11 & (-8)) | 4, mVar);
                    object = unsafe.getInt(obj, j11) == i12 ? unsafe.getObject(obj, j3) : null;
                    Object obj3 = mVar.c;
                    if (object != null) {
                        obj3 = a0.a(object, obj3);
                    }
                    unsafe.putObject(obj, j3, obj3);
                    unsafe.putInt(obj, j11, i12);
                    return m10;
                }
            default:
                return i7;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01ae, code lost:
    
        if (r1 == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01b0, code lost:
    
        r6.add(com.google.android.gms.internal.clearcut.o.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01be, code lost:
    
        if (r12 >= r15) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01c0, code lost:
    
        r1 = com.google.android.gms.internal.clearcut.m1.f(r13, r12, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01c6, code lost:
    
        if (r16 != r25.a) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01c8, code lost:
    
        r12 = com.google.android.gms.internal.clearcut.m1.f(r13, r1, r25);
        r1 = r25.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01ce, code lost:
    
        if (r1 != 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01b6, code lost:
    
        r6.add(com.google.android.gms.internal.clearcut.o.i(r12, r1, r13));
        r12 = r12 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01d1, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01be, code lost:
    
        r6.add(com.google.android.gms.internal.clearcut.o.i(r12, r1, r13));
        r12 = r12 + r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0256  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x01ce -> B:109:0x01b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:132:0x0225 -> B:127:0x0206). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:144:0x0264 -> B:139:0x023b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int l(Object obj, byte[] bArr, int i7, int i10, int i11, int i12, int i13, int i14, long j3, int i15, long j10, m mVar) {
        Unsafe unsafe = o;
        c0 c0Var = (c0) unsafe.getObject(obj, j10);
        if (!((k) c0Var).a) {
            int size = c0Var.size();
            c0Var = c0Var.h(size == 0 ? 10 : size << 1);
            unsafe.putObject(obj, j10, c0Var);
        }
        switch (i15) {
            case 18:
            case 35:
                if (i13 != 2) {
                    if (i13 == 1) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        Double.longBitsToDouble(m1.r(i7, bArr));
                        throw null;
                    }
                    return i7;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f10 = m1.f(bArr, i7, mVar);
                int i16 = mVar.a + f10;
                if (f10 < i16) {
                    Double.longBitsToDouble(m1.r(f10, bArr));
                    throw null;
                }
                if (f10 == i16) {
                    return f10;
                }
                throw d0.a();
            case 19:
            case 36:
                if (i13 != 2) {
                    if (i13 == 5) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        Float.intBitsToFloat(m1.o(i7, bArr));
                        throw null;
                    }
                    return i7;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f11 = m1.f(bArr, i7, mVar);
                int i17 = mVar.a + f11;
                if (f11 < i17) {
                    Float.intBitsToFloat(m1.o(f11, bArr));
                    throw null;
                }
                if (f11 == i17) {
                    return f11;
                }
                throw d0.a();
            case 20:
            case 21:
            case 37:
            case 38:
                if (i13 != 2) {
                    if (i13 == 0) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        m1.m(bArr, i7, mVar);
                        throw null;
                    }
                    return i7;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f12 = m1.f(bArr, i7, mVar);
                int i18 = mVar.a + f12;
                if (f12 < i18) {
                    m1.m(bArr, f12, mVar);
                    throw null;
                }
                if (f12 == i18) {
                    return f12;
                }
                throw d0.a();
            case 22:
            case 29:
            case 39:
            case 43:
                if (i13 != 2) {
                    if (i13 == 0) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        m1.f(bArr, i7, mVar);
                        throw null;
                    }
                    return i7;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f13 = m1.f(bArr, i7, mVar);
                int i19 = mVar.a + f13;
                if (f13 < i19) {
                    m1.f(bArr, f13, mVar);
                    throw null;
                }
                if (f13 == i19) {
                    return f13;
                }
                throw d0.a();
            case 23:
            case 32:
            case 40:
            case 46:
                if (i13 != 2) {
                    if (i13 == 1) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        m1.r(i7, bArr);
                        throw null;
                    }
                    return i7;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f14 = m1.f(bArr, i7, mVar);
                int i20 = mVar.a + f14;
                if (f14 < i20) {
                    m1.r(f14, bArr);
                    throw null;
                }
                if (f14 == i20) {
                    return f14;
                }
                throw d0.a();
            case 24:
            case qs.U /* 31 */:
            case 41:
            case 45:
                if (i13 != 2) {
                    if (i13 == 5) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        m1.o(i7, bArr);
                        throw null;
                    }
                    return i7;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f15 = m1.f(bArr, i7, mVar);
                int i21 = mVar.a + f15;
                if (f15 < i21) {
                    m1.o(f15, bArr);
                    throw null;
                }
                if (f15 == i21) {
                    return f15;
                }
                throw d0.a();
            case 25:
            case 42:
                if (i13 != 2) {
                    if (i13 == 0) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        m1.m(bArr, i7, mVar);
                        throw null;
                    }
                    return i7;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f16 = m1.f(bArr, i7, mVar);
                int i22 = mVar.a + f16;
                if (f16 < i22) {
                    m1.m(bArr, f16, mVar);
                    throw null;
                }
                if (f16 == i22) {
                    return f16;
                }
                throw d0.a();
            case 26:
                if (i13 == 2) {
                    if ((j3 & 536870912) == 0) {
                        int f17 = m1.f(bArr, i7, mVar);
                        int i23 = mVar.a;
                        if (i23 != 0) {
                            c0Var.add(new String(bArr, f17, i23, a0.a));
                            f17 += i23;
                            while (f17 < i10) {
                                int f18 = m1.f(bArr, f17, mVar);
                                if (i11 != mVar.a) {
                                    return f17;
                                }
                                f17 = m1.f(bArr, f18, mVar);
                                int i24 = mVar.a;
                                if (i24 != 0) {
                                    c0Var.add(new String(bArr, f17, i24, a0.a));
                                    f17 += i24;
                                }
                            }
                            return f17;
                        }
                        c0Var.add("");
                        while (f17 < i10) {
                        }
                        return f17;
                    }
                    int f19 = m1.f(bArr, i7, mVar);
                    int i25 = mVar.a;
                    if (i25 != 0) {
                        int i26 = f19 + i25;
                        if (!l1.a.t(bArr, f19, i26)) {
                            throw new d0("Protocol message had invalid UTF-8.");
                        }
                        c0Var.add(new String(bArr, f19, i25, a0.a));
                        f19 = i26;
                        while (f19 < i10) {
                            int f20 = m1.f(bArr, f19, mVar);
                            if (i11 != mVar.a) {
                                return f19;
                            }
                            f19 = m1.f(bArr, f20, mVar);
                            int i27 = mVar.a;
                            if (i27 != 0) {
                                int i28 = f19 + i27;
                                if (!l1.a.t(bArr, f19, i28)) {
                                    throw new d0("Protocol message had invalid UTF-8.");
                                }
                                c0Var.add(new String(bArr, f19, i27, a0.a));
                                f19 = i28;
                            }
                        }
                        return f19;
                    }
                    c0Var.add("");
                    while (f19 < i10) {
                    }
                    return f19;
                }
                return i7;
            case 27:
                if (i13 == 2) {
                    return h(s(i14), i11, bArr, i7, i10, c0Var, mVar);
                }
                return i7;
            case 28:
                if (i13 == 2) {
                    int f21 = m1.f(bArr, i7, mVar);
                    int i29 = mVar.a;
                    break;
                }
                return i7;
            case qs.T /* 30 */:
            case 44:
                if (i13 != 2) {
                    if (i13 == 0) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        m1.f(bArr, i7, mVar);
                        throw null;
                    }
                    return i7;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f22 = m1.f(bArr, i7, mVar);
                int i30 = mVar.a + f22;
                if (f22 < i30) {
                    m1.f(bArr, f22, mVar);
                    throw null;
                }
                if (f22 != i30) {
                    throw d0.a();
                }
                z zVar = (z) obj;
                c1 c1Var = zVar.zzjp;
                c1 c1Var2 = c1Var != c1.e ? c1Var : null;
                b0 u10 = u(i14);
                Class cls = b1.a;
                if (u10 != null) {
                    d1 d1Var = this.m;
                    if (c0Var != null) {
                        int size2 = c0Var.size();
                        int i31 = 0;
                        for (int i32 = 0; i32 < size2; i32++) {
                            Integer num = (Integer) c0Var.get(i32);
                            int intValue = num.intValue();
                            if (u10.a(intValue) != null) {
                                if (i32 != i31) {
                                    c0Var.set(i31, num);
                                }
                                i31++;
                            } else {
                                if (c1Var2 == null) {
                                    d1Var.getClass();
                                    c1Var2 = c1.b();
                                }
                                d1Var.getClass();
                                c1Var2.a(i12 << 3, Long.valueOf(intValue));
                            }
                        }
                        if (i31 != size2) {
                            c0Var.subList(i31, size2).clear();
                        }
                    } else {
                        Iterator it = c0Var.iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Integer) it.next()).intValue();
                            if (u10.a(intValue2) == null) {
                                if (c1Var2 == null) {
                                    d1Var.getClass();
                                    c1Var2 = c1.b();
                                }
                                d1Var.getClass();
                                c1Var2.a(i12 << 3, Long.valueOf(intValue2));
                                it.remove();
                            }
                        }
                    }
                }
                if (c1Var2 != null) {
                    zVar.zzjp = c1Var2;
                }
                return f22;
            case 33:
            case 47:
                if (i13 != 2) {
                    if (i13 == 0) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        m1.f(bArr, i7, mVar);
                        throw null;
                    }
                    return i7;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f23 = m1.f(bArr, i7, mVar);
                int i33 = mVar.a + f23;
                if (f23 < i33) {
                    m1.f(bArr, f23, mVar);
                    throw null;
                }
                if (f23 == i33) {
                    return f23;
                }
                throw d0.a();
            case 34:
            case 48:
                if (i13 != 2) {
                    if (i13 == 0) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        m1.m(bArr, i7, mVar);
                        throw null;
                    }
                    return i7;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f24 = m1.f(bArr, i7, mVar);
                int i34 = mVar.a + f24;
                if (f24 < i34) {
                    m1.m(bArr, f24, mVar);
                    throw null;
                }
                if (f24 == i34) {
                    return f24;
                }
                throw d0.a();
            case 49:
                if (i13 == 3) {
                    a1 s5 = s(i14);
                    int i35 = (i11 & (-8)) | 4;
                    int i36 = i(s5, bArr, i7, i10, i35, mVar);
                    a1 a1Var = s5;
                    m mVar2 = mVar;
                    c0Var.add(mVar2.c);
                    while (i36 < i10) {
                        int f25 = m1.f(bArr, i36, mVar2);
                        if (i11 != mVar2.a) {
                            return i36;
                        }
                        m mVar3 = mVar2;
                        a1 a1Var2 = a1Var;
                        i36 = i(a1Var2, bArr, f25, i10, i35, mVar3);
                        c0Var.add(mVar3.c);
                        a1Var = a1Var2;
                        mVar2 = mVar3;
                    }
                    return i36;
                }
                return i7;
            default:
                return i7;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(Object obj, byte[] bArr, int i7, int i10, int i11, m mVar) {
        q0 q0Var;
        int[] iArr;
        int i12;
        Unsafe unsafe;
        int i13;
        Object obj2;
        int i14;
        int i15;
        c1 c1Var;
        int i16;
        int i17;
        int i18;
        byte[] bArr2;
        Unsafe unsafe2;
        int i19;
        int i20;
        Unsafe unsafe3;
        Unsafe unsafe4;
        byte[] bArr3;
        int i21;
        m mVar2;
        Unsafe unsafe5;
        int i22;
        int i23;
        int q10;
        Object a10;
        m mVar3;
        int l10;
        q0 q0Var2 = this;
        Object obj3 = obj;
        byte[] bArr4 = bArr;
        int i24 = i10;
        m mVar4 = mVar;
        Unsafe unsafe6 = o;
        int i25 = -1;
        int i26 = i7;
        int i27 = -1;
        int i28 = 0;
        int i29 = 0;
        while (true) {
            int[] iArr2 = q0Var2.a;
            if (i26 < i24) {
                int i30 = i26 + 1;
                int i31 = bArr4[i26];
                if (i31 < 0) {
                    i30 = m1.d(i31, bArr4, i30, mVar4);
                    i31 = mVar4.a;
                }
                int i32 = i31;
                int i33 = i30;
                int i34 = i32 >>> 3;
                int i35 = i32 & 7;
                int w10 = q0Var2.w(i34);
                c1 c1Var2 = c1.e;
                if (w10 != i25) {
                    int i36 = iArr2[w10 + 1];
                    int i37 = (i36 & 267386880) >>> 20;
                    int i38 = i32;
                    long j3 = i36 & 1048575;
                    if (i37 <= 17) {
                        int i39 = iArr2[w10 + 2];
                        int i40 = 1 << (i39 >>> 20);
                        int i41 = i39 & 1048575;
                        if (i41 != i27) {
                            i17 = i36;
                            i25 = -1;
                            i16 = 1;
                            iArr = iArr2;
                            if (i27 != -1) {
                                unsafe6.putInt(obj3, i27, i29);
                            }
                            i18 = i41;
                            i14 = unsafe6.getInt(obj3, i41);
                        } else {
                            i16 = 1;
                            iArr = iArr2;
                            i17 = i36;
                            i25 = -1;
                            i14 = i29;
                            i18 = i27;
                        }
                        switch (i37) {
                            case 0:
                                bArr2 = bArr;
                                unsafe2 = unsafe6;
                                i19 = i33;
                                i20 = i10;
                                mVar4 = mVar;
                                if (i35 == i16) {
                                    j1.d.c(obj3, j3, Double.longBitsToDouble(m1.r(i19, bArr2)));
                                    i26 = i19 + 8;
                                    int i42 = i18;
                                    i29 = i14 | i40;
                                    bArr4 = bArr2;
                                    i27 = i42;
                                    i24 = i20;
                                    unsafe6 = unsafe2;
                                    i28 = i38;
                                    break;
                                } else {
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i19;
                                    unsafe = unsafe2;
                                    i28 = i38;
                                    i12 = i18;
                                    i29 = i14;
                                    if (i28 != i13 && i13 != 0) {
                                        i24 = i10;
                                        i26 = i15;
                                        i25 = -1;
                                        break;
                                    } else {
                                        z zVar = (z) obj2;
                                        c1Var = zVar.zzjp;
                                        if (c1Var == c1Var2) {
                                            c1Var = c1.b();
                                            zVar.zzjp = c1Var;
                                        }
                                        int i43 = i28;
                                        int c10 = m1.c(i43, bArr, i15, i10, c1Var, mVar);
                                        i28 = i43;
                                        bArr4 = bArr;
                                        mVar4 = mVar;
                                        i24 = i10;
                                        q0Var2 = q0Var;
                                        unsafe6 = unsafe;
                                        i25 = -1;
                                        i26 = c10;
                                        obj3 = obj2;
                                        i27 = i12;
                                        break;
                                    }
                                }
                            case 1:
                                bArr2 = bArr;
                                unsafe2 = unsafe6;
                                i19 = i33;
                                i20 = i10;
                                mVar4 = mVar;
                                if (i35 == 5) {
                                    j1.d.d(obj3, j3, Float.intBitsToFloat(m1.o(i19, bArr2)));
                                    i26 = i19 + 4;
                                    int i422 = i18;
                                    i29 = i14 | i40;
                                    bArr4 = bArr2;
                                    i27 = i422;
                                    i24 = i20;
                                    unsafe6 = unsafe2;
                                    i28 = i38;
                                    break;
                                } else {
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i19;
                                    unsafe = unsafe2;
                                    i28 = i38;
                                    i12 = i18;
                                    i29 = i14;
                                    if (i28 != i13) {
                                    }
                                    z zVar2 = (z) obj2;
                                    c1Var = zVar2.zzjp;
                                    if (c1Var == c1Var2) {
                                    }
                                    int i432 = i28;
                                    int c102 = m1.c(i432, bArr, i15, i10, c1Var, mVar);
                                    i28 = i432;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i24 = i10;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c102;
                                    obj3 = obj2;
                                    i27 = i12;
                                    break;
                                }
                                break;
                            case 2:
                            case 3:
                                unsafe3 = unsafe6;
                                i19 = i33;
                                i20 = i10;
                                mVar4 = mVar;
                                if (i35 == 0) {
                                    int m10 = m1.m(bArr, i19, mVar4);
                                    unsafe3.putLong(obj3, j3, mVar4.b);
                                    unsafe2 = unsafe3;
                                    int i44 = i18;
                                    i29 = i14 | i40;
                                    bArr4 = bArr;
                                    i27 = i44;
                                    i26 = m10;
                                    i24 = i20;
                                    unsafe6 = unsafe2;
                                    i28 = i38;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i19;
                                    unsafe = unsafe2;
                                    i28 = i38;
                                    i12 = i18;
                                    i29 = i14;
                                    if (i28 != i13) {
                                    }
                                    z zVar22 = (z) obj2;
                                    c1Var = zVar22.zzjp;
                                    if (c1Var == c1Var2) {
                                    }
                                    int i4322 = i28;
                                    int c1022 = m1.c(i4322, bArr, i15, i10, c1Var, mVar);
                                    i28 = i4322;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i24 = i10;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c1022;
                                    obj3 = obj2;
                                    i27 = i12;
                                    break;
                                }
                                break;
                            case 4:
                            case 11:
                                unsafe3 = unsafe6;
                                i19 = i33;
                                mVar4 = mVar;
                                if (i35 == 0) {
                                    int f10 = m1.f(bArr, i19, mVar4);
                                    unsafe3.putInt(obj3, j3, mVar4.a);
                                    i24 = i10;
                                    unsafe6 = unsafe3;
                                    bArr4 = bArr;
                                    i27 = i18;
                                    i29 = i14 | i40;
                                    i26 = f10;
                                    i28 = i38;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i19;
                                    unsafe = unsafe2;
                                    i28 = i38;
                                    i12 = i18;
                                    i29 = i14;
                                    if (i28 != i13) {
                                    }
                                    z zVar222 = (z) obj2;
                                    c1Var = zVar222.zzjp;
                                    if (c1Var == c1Var2) {
                                    }
                                    int i43222 = i28;
                                    int c10222 = m1.c(i43222, bArr, i15, i10, c1Var, mVar);
                                    i28 = i43222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i24 = i10;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c10222;
                                    obj3 = obj2;
                                    i27 = i12;
                                    break;
                                }
                                break;
                            case 5:
                            case 14:
                                unsafe4 = unsafe6;
                                if (i35 == i16) {
                                    i38 = i38;
                                    mVar4 = mVar;
                                    unsafe4.putLong(obj3, j3, m1.r(i33, bArr));
                                    i26 = i33 + 8;
                                    unsafe6 = unsafe4;
                                    bArr4 = bArr;
                                    i27 = i18;
                                    i29 = i14 | i40;
                                    i24 = i10;
                                    i28 = i38;
                                    break;
                                } else {
                                    i19 = i33;
                                    i38 = i38;
                                    unsafe2 = unsafe4;
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i19;
                                    unsafe = unsafe2;
                                    i28 = i38;
                                    i12 = i18;
                                    i29 = i14;
                                    if (i28 != i13) {
                                    }
                                    z zVar2222 = (z) obj2;
                                    c1Var = zVar2222.zzjp;
                                    if (c1Var == c1Var2) {
                                    }
                                    int i432222 = i28;
                                    int c102222 = m1.c(i432222, bArr, i15, i10, c1Var, mVar);
                                    i28 = i432222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i24 = i10;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c102222;
                                    obj3 = obj2;
                                    i27 = i12;
                                    break;
                                }
                                break;
                            case 6:
                            case 13:
                                bArr3 = bArr;
                                i21 = i33;
                                mVar2 = mVar;
                                unsafe5 = unsafe6;
                                i22 = i38;
                                i23 = i10;
                                if (i35 == 5) {
                                    unsafe5.putInt(obj3, j3, m1.o(i21, bArr3));
                                    i26 = i21 + 4;
                                    int i45 = i18;
                                    i29 = i14 | i40;
                                    bArr4 = bArr3;
                                    i27 = i45;
                                    int i46 = i23;
                                    unsafe6 = unsafe5;
                                    i24 = i46;
                                    mVar4 = mVar2;
                                    i28 = i22;
                                    break;
                                } else {
                                    i19 = i21;
                                    unsafe2 = unsafe5;
                                    i38 = i22;
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i19;
                                    unsafe = unsafe2;
                                    i28 = i38;
                                    i12 = i18;
                                    i29 = i14;
                                    if (i28 != i13) {
                                    }
                                    z zVar22222 = (z) obj2;
                                    c1Var = zVar22222.zzjp;
                                    if (c1Var == c1Var2) {
                                    }
                                    int i4322222 = i28;
                                    int c1022222 = m1.c(i4322222, bArr, i15, i10, c1Var, mVar);
                                    i28 = i4322222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i24 = i10;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c1022222;
                                    obj3 = obj2;
                                    i27 = i12;
                                    break;
                                }
                                break;
                            case 7:
                                bArr3 = bArr;
                                i21 = i33;
                                mVar2 = mVar;
                                unsafe5 = unsafe6;
                                i22 = i38;
                                i23 = i10;
                                if (i35 == 0) {
                                    i26 = m1.m(bArr3, i21, mVar2);
                                    j1.d.f(obj3, j3, mVar2.b != 0 ? i16 : 0);
                                    int i452 = i18;
                                    i29 = i14 | i40;
                                    bArr4 = bArr3;
                                    i27 = i452;
                                    int i462 = i23;
                                    unsafe6 = unsafe5;
                                    i24 = i462;
                                    mVar4 = mVar2;
                                    i28 = i22;
                                    break;
                                } else {
                                    i19 = i21;
                                    unsafe2 = unsafe5;
                                    i38 = i22;
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i19;
                                    unsafe = unsafe2;
                                    i28 = i38;
                                    i12 = i18;
                                    i29 = i14;
                                    if (i28 != i13) {
                                    }
                                    z zVar222222 = (z) obj2;
                                    c1Var = zVar222222.zzjp;
                                    if (c1Var == c1Var2) {
                                    }
                                    int i43222222 = i28;
                                    int c10222222 = m1.c(i43222222, bArr, i15, i10, c1Var, mVar);
                                    i28 = i43222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i24 = i10;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c10222222;
                                    obj3 = obj2;
                                    i27 = i12;
                                    break;
                                }
                                break;
                            case 8:
                                bArr3 = bArr;
                                i21 = i33;
                                mVar2 = mVar;
                                unsafe5 = unsafe6;
                                i22 = i38;
                                i23 = i10;
                                if (i35 == 2) {
                                    if ((i17 & TLObject.FLAG_29) == 0) {
                                        q10 = m1.f(bArr3, i21, mVar2);
                                        int i47 = mVar2.a;
                                        if (i47 == 0) {
                                            mVar2.c = "";
                                        } else {
                                            mVar2.c = new String(bArr3, q10, i47, a0.a);
                                            q10 += i47;
                                        }
                                    } else {
                                        q10 = m1.q(bArr3, i21, mVar2);
                                    }
                                    i26 = q10;
                                    a10 = mVar2.c;
                                    unsafe5.putObject(obj3, j3, a10);
                                    int i4522 = i18;
                                    i29 = i14 | i40;
                                    bArr4 = bArr3;
                                    i27 = i4522;
                                    int i4622 = i23;
                                    unsafe6 = unsafe5;
                                    i24 = i4622;
                                    mVar4 = mVar2;
                                    i28 = i22;
                                    break;
                                } else {
                                    i19 = i21;
                                    unsafe2 = unsafe5;
                                    i38 = i22;
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i19;
                                    unsafe = unsafe2;
                                    i28 = i38;
                                    i12 = i18;
                                    i29 = i14;
                                    if (i28 != i13) {
                                    }
                                    z zVar2222222 = (z) obj2;
                                    c1Var = zVar2222222.zzjp;
                                    if (c1Var == c1Var2) {
                                    }
                                    int i432222222 = i28;
                                    int c102222222 = m1.c(i432222222, bArr, i15, i10, c1Var, mVar);
                                    i28 = i432222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i24 = i10;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c102222222;
                                    obj3 = obj2;
                                    i27 = i12;
                                    break;
                                }
                                break;
                            case 9:
                                bArr3 = bArr;
                                i21 = i33;
                                mVar2 = mVar;
                                unsafe5 = unsafe6;
                                i22 = i38;
                                i23 = i10;
                                if (i35 == 2) {
                                    i26 = j(q0Var2.s(w10), bArr3, i21, i23, mVar2);
                                    a10 = (i14 & i40) == 0 ? mVar2.c : a0.a(unsafe5.getObject(obj3, j3), mVar2.c);
                                    unsafe5.putObject(obj3, j3, a10);
                                    int i45222 = i18;
                                    i29 = i14 | i40;
                                    bArr4 = bArr3;
                                    i27 = i45222;
                                    int i46222 = i23;
                                    unsafe6 = unsafe5;
                                    i24 = i46222;
                                    mVar4 = mVar2;
                                    i28 = i22;
                                    break;
                                } else {
                                    i19 = i21;
                                    unsafe2 = unsafe5;
                                    i38 = i22;
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i19;
                                    unsafe = unsafe2;
                                    i28 = i38;
                                    i12 = i18;
                                    i29 = i14;
                                    if (i28 != i13) {
                                    }
                                    z zVar22222222 = (z) obj2;
                                    c1Var = zVar22222222.zzjp;
                                    if (c1Var == c1Var2) {
                                    }
                                    int i4322222222 = i28;
                                    int c1022222222 = m1.c(i4322222222, bArr, i15, i10, c1Var, mVar);
                                    i28 = i4322222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i24 = i10;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c1022222222;
                                    obj3 = obj2;
                                    i27 = i12;
                                    break;
                                }
                                break;
                            case 10:
                                bArr3 = bArr;
                                i21 = i33;
                                mVar2 = mVar;
                                unsafe5 = unsafe6;
                                i22 = i38;
                                i23 = i10;
                                if (i35 == 2) {
                                    i26 = m1.s(bArr3, i21, mVar2);
                                    a10 = mVar2.c;
                                    unsafe5.putObject(obj3, j3, a10);
                                    int i452222 = i18;
                                    i29 = i14 | i40;
                                    bArr4 = bArr3;
                                    i27 = i452222;
                                    int i462222 = i23;
                                    unsafe6 = unsafe5;
                                    i24 = i462222;
                                    mVar4 = mVar2;
                                    i28 = i22;
                                    break;
                                } else {
                                    i19 = i21;
                                    unsafe2 = unsafe5;
                                    i38 = i22;
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i19;
                                    unsafe = unsafe2;
                                    i28 = i38;
                                    i12 = i18;
                                    i29 = i14;
                                    if (i28 != i13) {
                                    }
                                    z zVar222222222 = (z) obj2;
                                    c1Var = zVar222222222.zzjp;
                                    if (c1Var == c1Var2) {
                                    }
                                    int i43222222222 = i28;
                                    int c10222222222 = m1.c(i43222222222, bArr, i15, i10, c1Var, mVar);
                                    i28 = i43222222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i24 = i10;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c10222222222;
                                    obj3 = obj2;
                                    i27 = i12;
                                    break;
                                }
                                break;
                            case 12:
                                bArr3 = bArr;
                                mVar2 = mVar;
                                unsafe5 = unsafe6;
                                i23 = i10;
                                if (i35 == 0) {
                                    i26 = m1.f(bArr3, i33, mVar2);
                                    int i48 = mVar2.a;
                                    b0 u10 = q0Var2.u(w10);
                                    if (u10 == null || u10.a(i48) != null) {
                                        i22 = i38;
                                        unsafe5.putInt(obj3, j3, i48);
                                        int i4522222 = i18;
                                        i29 = i14 | i40;
                                        bArr4 = bArr3;
                                        i27 = i4522222;
                                        int i4622222 = i23;
                                        unsafe6 = unsafe5;
                                        i24 = i4622222;
                                        mVar4 = mVar2;
                                        i28 = i22;
                                        break;
                                    } else {
                                        z zVar3 = (z) obj3;
                                        c1 c1Var3 = zVar3.zzjp;
                                        if (c1Var3 == c1Var2) {
                                            c1Var3 = c1.b();
                                            zVar3.zzjp = c1Var3;
                                        }
                                        c1Var3.a(i38, Long.valueOf(i48));
                                        unsafe6 = unsafe5;
                                        i24 = i23;
                                        mVar4 = mVar2;
                                        i28 = i38;
                                        bArr4 = bArr3;
                                        i27 = i18;
                                        i29 = i14;
                                        break;
                                    }
                                } else {
                                    i19 = i33;
                                    unsafe2 = unsafe5;
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i19;
                                    unsafe = unsafe2;
                                    i28 = i38;
                                    i12 = i18;
                                    i29 = i14;
                                    if (i28 != i13) {
                                    }
                                    z zVar2222222222 = (z) obj2;
                                    c1Var = zVar2222222222.zzjp;
                                    if (c1Var == c1Var2) {
                                    }
                                    int i432222222222 = i28;
                                    int c102222222222 = m1.c(i432222222222, bArr, i15, i10, c1Var, mVar);
                                    i28 = i432222222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i24 = i10;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c102222222222;
                                    obj3 = obj2;
                                    i27 = i12;
                                    break;
                                }
                                break;
                            case 15:
                                mVar3 = mVar;
                                unsafe4 = unsafe6;
                                if (i35 == 0) {
                                    i26 = m1.f(bArr, i33, mVar3);
                                    int i49 = mVar3.a;
                                    unsafe4.putInt(obj3, j3, (-(i49 & 1)) ^ (i49 >>> 1));
                                    int i50 = i18;
                                    i29 = i14 | i40;
                                    bArr4 = bArr;
                                    i27 = i50;
                                    unsafe6 = unsafe4;
                                    mVar4 = mVar3;
                                    i28 = i38;
                                    i24 = i10;
                                    break;
                                } else {
                                    i19 = i33;
                                    unsafe2 = unsafe4;
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i19;
                                    unsafe = unsafe2;
                                    i28 = i38;
                                    i12 = i18;
                                    i29 = i14;
                                    if (i28 != i13) {
                                    }
                                    z zVar22222222222 = (z) obj2;
                                    c1Var = zVar22222222222.zzjp;
                                    if (c1Var == c1Var2) {
                                    }
                                    int i4322222222222 = i28;
                                    int c1022222222222 = m1.c(i4322222222222, bArr, i15, i10, c1Var, mVar);
                                    i28 = i4322222222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i24 = i10;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c1022222222222;
                                    obj3 = obj2;
                                    i27 = i12;
                                    break;
                                }
                                break;
                            case 16:
                                mVar3 = mVar;
                                if (i35 == 0) {
                                    int m11 = m1.m(bArr, i33, mVar3);
                                    long j10 = mVar3.b;
                                    Unsafe unsafe7 = unsafe6;
                                    unsafe7.putLong(obj3, j3, (j10 >>> i16) ^ (-(j10 & 1)));
                                    int i51 = i18;
                                    i29 = i14 | i40;
                                    bArr4 = bArr;
                                    i27 = i51;
                                    unsafe6 = unsafe7;
                                    i26 = m11;
                                    mVar4 = mVar3;
                                    i28 = i38;
                                    i24 = i10;
                                    break;
                                } else {
                                    i19 = i33;
                                    unsafe2 = unsafe6;
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i19;
                                    unsafe = unsafe2;
                                    i28 = i38;
                                    i12 = i18;
                                    i29 = i14;
                                    if (i28 != i13) {
                                    }
                                    z zVar222222222222 = (z) obj2;
                                    c1Var = zVar222222222222.zzjp;
                                    if (c1Var == c1Var2) {
                                    }
                                    int i43222222222222 = i28;
                                    int c10222222222222 = m1.c(i43222222222222, bArr, i15, i10, c1Var, mVar);
                                    i28 = i43222222222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i24 = i10;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c10222222222222;
                                    obj3 = obj2;
                                    i27 = i12;
                                    break;
                                }
                                break;
                            case 17:
                                if (i35 == 3) {
                                    i26 = i(q0Var2.s(w10), bArr, i33, i10, (i34 << 3) | 4, mVar);
                                    unsafe6.putObject(obj3, j3, (i14 & i40) == 0 ? mVar.c : a0.a(unsafe6.getObject(obj3, j3), mVar.c));
                                    int i52 = i18;
                                    i29 = i14 | i40;
                                    bArr4 = bArr;
                                    i27 = i52;
                                    i24 = i10;
                                    mVar4 = mVar;
                                    i28 = i38;
                                    break;
                                } else {
                                    i19 = i33;
                                    unsafe2 = unsafe6;
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i19;
                                    unsafe = unsafe2;
                                    i28 = i38;
                                    i12 = i18;
                                    i29 = i14;
                                    if (i28 != i13) {
                                    }
                                    z zVar2222222222222 = (z) obj2;
                                    c1Var = zVar2222222222222.zzjp;
                                    if (c1Var == c1Var2) {
                                    }
                                    int i432222222222222 = i28;
                                    int c102222222222222 = m1.c(i432222222222222, bArr, i15, i10, c1Var, mVar);
                                    i28 = i432222222222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i24 = i10;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c102222222222222;
                                    obj3 = obj2;
                                    i27 = i12;
                                    break;
                                }
                                break;
                            default:
                                i19 = i33;
                                unsafe2 = unsafe6;
                                i13 = i11;
                                q0Var = q0Var2;
                                obj2 = obj3;
                                i15 = i19;
                                unsafe = unsafe2;
                                i28 = i38;
                                i12 = i18;
                                i29 = i14;
                                if (i28 != i13) {
                                }
                                z zVar22222222222222 = (z) obj2;
                                c1Var = zVar22222222222222.zzjp;
                                if (c1Var == c1Var2) {
                                }
                                int i4322222222222222 = i28;
                                int c1022222222222222 = m1.c(i4322222222222222, bArr, i15, i10, c1Var, mVar);
                                i28 = i4322222222222222;
                                bArr4 = bArr;
                                mVar4 = mVar;
                                i24 = i10;
                                q0Var2 = q0Var;
                                unsafe6 = unsafe;
                                i25 = -1;
                                i26 = c1022222222222222;
                                obj3 = obj2;
                                i27 = i12;
                                break;
                        }
                    } else {
                        iArr = iArr2;
                        Unsafe unsafe8 = unsafe6;
                        if (i37 != 27) {
                            i33 = i33;
                            if (i37 <= 49) {
                                i14 = i29;
                                unsafe = unsafe8;
                                i28 = i38;
                                i12 = i27;
                                l10 = q0Var2.l(obj, bArr, i33, i10, i28, i34, i35, w10, i36, i37, j3, mVar);
                                if (l10 == i33) {
                                    q0Var = q0Var2;
                                    obj2 = obj;
                                } else {
                                    i24 = i10;
                                    mVar4 = mVar;
                                    obj3 = obj;
                                    i26 = l10;
                                    i27 = i12;
                                    i29 = i14;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    bArr4 = bArr;
                                }
                            } else {
                                unsafe = unsafe8;
                                i14 = i29;
                                i28 = i38;
                                i12 = i27;
                                if (i37 != 50) {
                                    l10 = q0Var2.k(obj, bArr, i33, i10, i28, i34, i35, i36, i37, j3, w10, mVar);
                                    q0Var = q0Var2;
                                    obj2 = obj;
                                    if (l10 != i33) {
                                        bArr4 = bArr;
                                        i24 = i10;
                                        mVar4 = mVar;
                                        i26 = l10;
                                        q0Var2 = q0Var;
                                        obj3 = obj2;
                                        i27 = i12;
                                        i29 = i14;
                                        unsafe6 = unsafe;
                                        i25 = -1;
                                    }
                                } else {
                                    if (i35 == 2) {
                                        q0Var2.p(j3, obj, w10);
                                        throw null;
                                    }
                                    q0Var = q0Var2;
                                    obj2 = obj;
                                }
                            }
                            i15 = l10;
                            i29 = i14;
                            i13 = i11;
                        } else if (i35 == 2) {
                            c0 c0Var = (c0) unsafe8.getObject(obj3, j3);
                            if (!((k) c0Var).a) {
                                int size = c0Var.size();
                                c0Var = c0Var.h(size == 0 ? 10 : size << 1);
                                unsafe8.putObject(obj3, j3, c0Var);
                            }
                            unsafe6 = unsafe8;
                            obj3 = obj;
                            i24 = i10;
                            mVar4 = mVar;
                            i26 = h(q0Var2.s(w10), i38, bArr, i33, i10, c0Var, mVar);
                            i28 = i38;
                            i25 = -1;
                            bArr4 = bArr;
                        } else {
                            q0Var = q0Var2;
                            unsafe = unsafe8;
                            i14 = i29;
                            i33 = i33;
                            i28 = i38;
                            i12 = i27;
                            obj2 = obj;
                        }
                        if (i28 != i13) {
                        }
                        z zVar222222222222222 = (z) obj2;
                        c1Var = zVar222222222222222.zzjp;
                        if (c1Var == c1Var2) {
                        }
                        int i43222222222222222 = i28;
                        int c10222222222222222 = m1.c(i43222222222222222, bArr, i15, i10, c1Var, mVar);
                        i28 = i43222222222222222;
                        bArr4 = bArr;
                        mVar4 = mVar;
                        i24 = i10;
                        q0Var2 = q0Var;
                        unsafe6 = unsafe;
                        i25 = -1;
                        i26 = c10222222222222222;
                        obj3 = obj2;
                        i27 = i12;
                    }
                } else {
                    q0Var = q0Var2;
                    iArr = iArr2;
                    i12 = i27;
                    unsafe = unsafe6;
                    i14 = i29;
                    i28 = i32;
                    obj2 = obj3;
                }
                i13 = i11;
                i15 = i33;
                i29 = i14;
                if (i28 != i13) {
                }
                z zVar2222222222222222 = (z) obj2;
                c1Var = zVar2222222222222222.zzjp;
                if (c1Var == c1Var2) {
                }
                int i432222222222222222 = i28;
                int c102222222222222222 = m1.c(i432222222222222222, bArr, i15, i10, c1Var, mVar);
                i28 = i432222222222222222;
                bArr4 = bArr;
                mVar4 = mVar;
                i24 = i10;
                q0Var2 = q0Var;
                unsafe6 = unsafe;
                i25 = -1;
                i26 = c102222222222222222;
                obj3 = obj2;
                i27 = i12;
            } else {
                q0Var = q0Var2;
                iArr = iArr2;
                i12 = i27;
                unsafe = unsafe6;
                i13 = i11;
                obj2 = obj3;
            }
        }
        int i53 = i12;
        if (i53 != i25) {
            unsafe.putInt(obj2, i53, i29);
        }
        int[] iArr3 = q0Var.i;
        if (iArr3 != null) {
            for (int i54 : iArr3) {
                int i55 = iArr[i54];
                Object k10 = j1.k(obj2, q0Var.v(i54) & 1048575);
                if (k10 != null && q0Var.u(i54) != null) {
                    q0Var.n.getClass();
                    q0Var.t(i54);
                    throw new NoSuchMethodError();
                }
            }
        }
        if (i13 == 0) {
            if (i26 != i24) {
                throw d0.b();
            }
        } else if (i26 > i24 || i28 != i13) {
            throw d0.b();
        }
        return i26;
    }

    public final void o(int i7, Object obj, Object obj2) {
        long v = v(i7) & 1048575;
        if (r(i7, obj2)) {
            Object k10 = j1.k(obj, v);
            Object k11 = j1.k(obj2, v);
            if (k10 != null && k11 != null) {
                k11 = a0.a(k10, k11);
            } else if (k11 == null) {
                return;
            }
            j1.d(obj, v, k11);
            x(i7, obj);
        }
    }

    public final void p(long j3, Object obj, int i7) {
        m0 m0Var;
        Unsafe unsafe = o;
        t(i7);
        Object object = unsafe.getObject(obj, j3);
        this.n.getClass();
        if (!((m0) object).a) {
            m0 m0Var2 = m0.b;
            if (m0Var2.isEmpty()) {
                m0Var = new m0();
            } else {
                m0 m0Var3 = new m0(m0Var2);
                m0Var3.a = true;
                m0Var = m0Var3;
            }
            n0.a(m0Var, object);
            unsafe.putObject(obj, j3, m0Var);
        }
        throw new NoSuchMethodError();
    }

    public final boolean q(int i7, int i10, Object obj) {
        return j1.d.g(obj, (long) (this.a[i10 + 2] & 1048575)) == i7;
    }

    public final boolean r(int i7, Object obj) {
        if (this.g) {
            int v = v(i7);
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
                        if (!(k10 instanceof o)) {
                            throw new IllegalArgumentException();
                        }
                        if (o.c.equals(k10)) {
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
                    if (o.c.equals(j1.k(obj, j3))) {
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
            if ((j1.d.g(obj, r6 & 1048575) & (1 << (this.a[i7 + 2] >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    public final a1 s(int i7) {
        int i10 = (i7 / 4) << 1;
        Object[] objArr = this.b;
        a1 a1Var = (a1) objArr[i10];
        if (a1Var != null) {
            return a1Var;
        }
        a1 a10 = v0.c.a((Class) objArr[i10 + 1]);
        objArr[i10] = a10;
        return a10;
    }

    public final Object t(int i7) {
        return this.b[(i7 / 4) << 1];
    }

    public final b0 u(int i7) {
        return (b0) this.b[((i7 / 4) << 1) + 1];
    }

    public final int v(int i7) {
        return this.a[i7 + 1];
    }

    public final int w(int i7) {
        int i10 = this.c;
        if (i7 >= i10) {
            int[] iArr = this.a;
            int i11 = this.e;
            if (i7 < i11) {
                int i12 = (i7 - i10) << 2;
                if (iArr[i12] == i7) {
                    return i12;
                }
                return -1;
            }
            if (i7 <= this.d) {
                int i13 = i11 - i10;
                int length = (iArr.length / 4) - 1;
                while (i13 <= length) {
                    int i14 = (length + i13) >>> 1;
                    int i15 = i14 << 2;
                    int i16 = iArr[i15];
                    if (i7 == i16) {
                        return i15;
                    }
                    if (i7 < i16) {
                        length = i14 - 1;
                    } else {
                        i13 = i14 + 1;
                    }
                }
            }
        }
        return -1;
    }

    public final void x(int i7, Object obj) {
        if (this.g) {
            return;
        }
        int i10 = this.a[i7 + 2];
        long j3 = i10 & 1048575;
        j1.b(j3, obj, j1.d.g(obj, j3) | (1 << (i10 >>> 20)));
    }

    public final void y(int i7, Object obj, Object obj2) {
        int i10;
        int v = v(i7);
        int[] iArr = this.a;
        int i11 = iArr[i7];
        long j3 = v & 1048575;
        if (q(i11, i7, obj2)) {
            Object k10 = j1.k(obj, j3);
            Object k11 = j1.k(obj2, j3);
            if (k10 != null && k11 != null) {
                j1.d(obj, j3, a0.a(k10, k11));
                i10 = iArr[i7 + 2];
            } else {
                if (k11 == null) {
                    return;
                }
                j1.d(obj, j3, k11);
                i10 = iArr[i7 + 2];
            }
            j1.b(i10 & 1048575, obj, i11);
        }
    }

    public final boolean z(z zVar, Object obj, int i7) {
        return r(i7, zVar) == r(i7, obj);
    }
}
