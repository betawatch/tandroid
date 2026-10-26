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
public final class q0 implements z0 {
    public static final Unsafe o = i1.f();
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
    public final c1 m;
    public final n0 n;

    public q0(int[] iArr, Object[] objArr, int i10, int i11, int i12, j jVar, boolean z10, int[] iArr2, int[] iArr3, int[] iArr4, s0 s0Var, h0 h0Var, c1 c1Var, r rVar, n0 n0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.g = z10;
        this.h = iArr2;
        this.i = iArr3;
        this.j = iArr4;
        this.k = s0Var;
        this.l = h0Var;
        this.m = c1Var;
        this.f = jVar;
        this.n = n0Var;
    }

    public static int A(Object obj, long j10) {
        return ((Integer) i1.k(obj, j10)).intValue();
    }

    public static long B(Object obj, long j10) {
        return ((Long) i1.k(obj, j10)).longValue();
    }

    public static int h(z0 z0Var, int i10, byte[] bArr, int i11, int i12, c0 c0Var, m mVar) {
        int j10 = j(z0Var, bArr, i11, i12, mVar);
        while (true) {
            c0Var.add(mVar.c);
            if (j10 >= i12) {
                break;
            }
            int f7 = l1.f(bArr, j10, mVar);
            if (i10 != mVar.a) {
                break;
            }
            j10 = j(z0Var, bArr, f7, i12, mVar);
        }
        return j10;
    }

    public static int i(z0 z0Var, byte[] bArr, int i10, int i11, int i12, m mVar) {
        q0 q0Var = (q0) z0Var;
        Object a2 = q0Var.a();
        int m10 = q0Var.m(a2, bArr, i10, i11, i12, mVar);
        q0Var.b(a2);
        mVar.c = a2;
        return m10;
    }

    public static int j(z0 z0Var, byte[] bArr, int i10, int i11, m mVar) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = l1.d(i13, bArr, i12, mVar);
            i13 = mVar.a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw d0.a();
        }
        Object a2 = z0Var.a();
        int i15 = i14 + i13;
        z0Var.f(a2, bArr, i14, i15, mVar);
        z0Var.b(a2);
        mVar.c = a2;
        return i15;
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
    public static q0 n(x0 x0Var, s0 s0Var, h0 h0Var, c1 c1Var, r rVar, n0 n0Var) {
        int i10;
        int i11;
        int i12;
        int[] iArr;
        u uVar;
        int i13;
        int i14;
        Field b10;
        int i15;
        int i16;
        Object obj;
        int i17;
        Field b11;
        Field b12;
        if (!(x0Var instanceof x0)) {
            x0Var.getClass();
            throw new ClassCastException();
        }
        y0 y0Var = x0Var.b;
        int i18 = 1;
        boolean z10 = (y0Var.d & 1) != 1;
        if (y0Var.e == 0) {
            i10 = 0;
            i11 = 0;
            i12 = 0;
        } else {
            int i19 = y0Var.g;
            int i20 = y0Var.h;
            i10 = y0Var.k;
            i11 = i19;
            i12 = i20;
        }
        int[] iArr2 = new int[i10 << 2];
        Object[] objArr = new Object[i10 << 1];
        int i21 = y0Var.i;
        int[] iArr3 = i21 > 0 ? new int[i21] : null;
        int i22 = y0Var.l;
        int[] iArr4 = i22 > 0 ? new int[i22] : null;
        boolean a2 = y0Var.a();
        Class cls = y0Var.c;
        Object[] objArr2 = y0Var.b;
        if (a2) {
            int i23 = y0Var.s;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            while (true) {
                if (i23 >= y0Var.j || i24 >= ((i23 - i11) << 2)) {
                    int i27 = i18;
                    int i28 = y0Var.u;
                    u uVar2 = u.s;
                    if (i28 <= uVar2.a) {
                        iArr = iArr2;
                        uVar = uVar2;
                        Field field = y0Var.x;
                        h1 h1Var = i1.d;
                        int a10 = (int) h1Var.a(field);
                        if ((y0Var.d & 1) == i27 && y0Var.u <= u.d.a) {
                            int i29 = (y0Var.w / 32) + (y0Var.f << 1);
                            Object obj2 = objArr2[i29];
                            if (obj2 instanceof Field) {
                                b10 = (Field) obj2;
                            } else {
                                b10 = y0.b(cls, (String) obj2);
                                objArr2[i29] = b10;
                            }
                            i14 = (int) h1Var.a(b10);
                            i15 = y0Var.w % 32;
                            i13 = a10;
                            iArr[i24] = y0Var.s;
                            int i30 = i24 + 1;
                            int i31 = i14;
                            int i32 = y0Var.t;
                            int i33 = i13;
                            int i34 = ((i32 & 256) == 0 ? TLObject.FLAG_28 : 0) | ((i32 & 512) == 0 ? TLObject.FLAG_29 : 0);
                            i16 = y0Var.u;
                            iArr[i30] = i34 | (i16 << 20) | i33;
                            iArr[i24 + 2] = (i15 << 20) | i31;
                            obj = y0Var.A;
                            if (obj == null) {
                                int i35 = (i24 / 4) << 1;
                                objArr[i35] = obj;
                                Object obj3 = y0Var.y;
                                if (obj3 != null) {
                                    objArr[i35 + 1] = obj3;
                                } else {
                                    Object obj4 = y0Var.z;
                                    if (obj4 != null) {
                                        objArr[i35 + 1] = obj4;
                                    }
                                }
                                i17 = 1;
                            } else {
                                Object obj5 = y0Var.y;
                                if (obj5 != null) {
                                    i17 = 1;
                                    objArr[((i24 / 4) << 1) + 1] = obj5;
                                } else {
                                    i17 = 1;
                                    Object obj6 = y0Var.z;
                                    if (obj6 != null) {
                                        objArr[((i24 / 4) << 1) + 1] = obj6;
                                    }
                                }
                            }
                            if (i16 != uVar.ordinal()) {
                                iArr3[i25] = i24;
                                i25++;
                            } else if (i16 >= 18 && i16 <= 49) {
                                iArr4[i26] = iArr[i30] & 1048575;
                                i26++;
                            }
                            if (y0Var.a()) {
                                break;
                            }
                            i23 = y0Var.s;
                        } else {
                            i13 = a10;
                            i14 = 0;
                        }
                    } else {
                        int i36 = y0Var.v << 1;
                        Object obj7 = objArr2[i36];
                        iArr = iArr2;
                        if (obj7 instanceof Field) {
                            b11 = (Field) obj7;
                        } else {
                            b11 = y0.b(cls, (String) obj7);
                            objArr2[i36] = b11;
                        }
                        h1 h1Var2 = i1.d;
                        uVar = uVar2;
                        int a11 = (int) h1Var2.a(b11);
                        int i37 = (y0Var.v << 1) + 1;
                        Object obj8 = objArr2[i37];
                        if (obj8 instanceof Field) {
                            b12 = (Field) obj8;
                        } else {
                            b12 = y0.b(cls, (String) obj8);
                            objArr2[i37] = b12;
                        }
                        i14 = (int) h1Var2.a(b12);
                        i13 = a11;
                    }
                    i15 = 0;
                    iArr[i24] = y0Var.s;
                    int i302 = i24 + 1;
                    int i312 = i14;
                    int i322 = y0Var.t;
                    int i332 = i13;
                    if ((i322 & 512) == 0) {
                    }
                    int i342 = ((i322 & 256) == 0 ? TLObject.FLAG_28 : 0) | ((i322 & 512) == 0 ? TLObject.FLAG_29 : 0);
                    i16 = y0Var.u;
                    iArr[i302] = i342 | (i16 << 20) | i332;
                    iArr[i24 + 2] = (i15 << 20) | i312;
                    obj = y0Var.A;
                    if (obj == null) {
                    }
                    if (i16 != uVar.ordinal()) {
                    }
                    if (y0Var.a()) {
                    }
                } else {
                    i17 = i18;
                    for (int i38 = 0; i38 < 4; i38++) {
                        iArr2[i24 + i38] = -1;
                    }
                    iArr = iArr2;
                }
                i24 += 4;
                i18 = i17;
                iArr2 = iArr;
            }
        } else {
            iArr = iArr2;
        }
        return new q0(iArr, objArr, i11, i12, y0Var.j, x0Var.a, z10, y0Var.m, iArr3, iArr4, s0Var, h0Var, c1Var, rVar, n0Var);
    }

    @Override // com.google.android.gms.internal.clearcut.z0
    public final Object a() {
        this.k.getClass();
        return ((z) this.f).a(4);
    }

    @Override // com.google.android.gms.internal.clearcut.z0
    public final void b(Object obj) {
        int[] iArr = this.i;
        if (iArr != null) {
            for (int i10 : iArr) {
                long v = v(i10) & 1048575;
                Object k10 = i1.k(obj, v);
                if (k10 != null) {
                    this.n.getClass();
                    ((m0) k10).a = false;
                    i1.d(obj, v, k10);
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
        ((z) obj).zzjp.d = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.clearcut.z0
    public final void c(z zVar, z zVar2) {
        z zVar3;
        h1 h1Var;
        long h;
        int i10;
        zVar2.getClass();
        int i11 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i11 >= iArr.length) {
                z zVar4 = zVar;
                if (this.g) {
                    return;
                }
                a1.a(this.m, zVar4, zVar2);
                return;
            }
            int v = v(i11);
            long j10 = v & 1048575;
            int i12 = iArr[i11];
            switch ((v & 267386880) >>> 20) {
                case 0:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    } else {
                        h1 h1Var2 = i1.d;
                        h1Var2.c(zVar3, j10, h1Var2.k(zVar2, j10));
                        x(i11, zVar3);
                        break;
                    }
                case 1:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    } else {
                        h1 h1Var3 = i1.d;
                        h1Var3.d(zVar3, j10, h1Var3.j(zVar2, j10));
                        x(i11, zVar3);
                        break;
                    }
                case 2:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    }
                    h1Var = i1.d;
                    h = h1Var.h(zVar2, j10);
                    h1Var.e(zVar3, j10, h);
                    x(i11, zVar3);
                    break;
                case 3:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    }
                    h1Var = i1.d;
                    h = h1Var.h(zVar2, j10);
                    h1Var.e(zVar3, j10, h);
                    x(i11, zVar3);
                    break;
                case 4:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    }
                    i1.b(j10, zVar3, i1.d.g(zVar2, j10));
                    x(i11, zVar3);
                    break;
                case 5:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    }
                    h1Var = i1.d;
                    h = h1Var.h(zVar2, j10);
                    h1Var.e(zVar3, j10, h);
                    x(i11, zVar3);
                    break;
                case 6:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    }
                    i1.b(j10, zVar3, i1.d.g(zVar2, j10));
                    x(i11, zVar3);
                    break;
                case 7:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    } else {
                        h1 h1Var4 = i1.d;
                        h1Var4.f(zVar3, j10, h1Var4.i(zVar2, j10));
                        x(i11, zVar3);
                        break;
                    }
                case 8:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    }
                    i1.d(zVar3, j10, i1.k(zVar2, j10));
                    x(i11, zVar3);
                    break;
                case 9:
                    zVar3 = zVar;
                    o(i11, zVar3, zVar2);
                    break;
                case 10:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    }
                    i1.d(zVar3, j10, i1.k(zVar2, j10));
                    x(i11, zVar3);
                    break;
                case 11:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    }
                    i1.b(j10, zVar3, i1.d.g(zVar2, j10));
                    x(i11, zVar3);
                    break;
                case 12:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    }
                    i1.b(j10, zVar3, i1.d.g(zVar2, j10));
                    x(i11, zVar3);
                    break;
                case 13:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    }
                    i1.b(j10, zVar3, i1.d.g(zVar2, j10));
                    x(i11, zVar3);
                    break;
                case 14:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    }
                    h1Var = i1.d;
                    h = h1Var.h(zVar2, j10);
                    h1Var.e(zVar3, j10, h);
                    x(i11, zVar3);
                    break;
                case 15:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    }
                    i1.b(j10, zVar3, i1.d.g(zVar2, j10));
                    x(i11, zVar3);
                    break;
                case 16:
                    if (r(i11, zVar2)) {
                        h1Var = i1.d;
                        h = h1Var.h(zVar2, j10);
                        zVar3 = zVar;
                        h1Var.e(zVar3, j10, h);
                        x(i11, zVar3);
                        break;
                    }
                    zVar3 = zVar;
                    break;
                case 17:
                    o(i11, zVar, zVar2);
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
                    this.l.b(zVar, j10, zVar2);
                    zVar3 = zVar;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Class cls = a1.a;
                    Object k10 = i1.k(zVar, j10);
                    Object k11 = i1.k(zVar2, j10);
                    this.n.getClass();
                    i1.d(zVar, j10, n0.a(k10, k11));
                    zVar3 = zVar;
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
                    if (q(i12, i11, zVar2)) {
                        i1.d(zVar, j10, i1.k(zVar2, j10));
                        i10 = iArr[i11 + 2];
                        i1.b(i10 & 1048575, zVar, i12);
                    }
                    zVar3 = zVar;
                    break;
                case 60:
                case 68:
                    y(i11, zVar, zVar2);
                    zVar3 = zVar;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                case 66:
                case 67:
                    if (q(i12, i11, zVar2)) {
                        i1.d(zVar, j10, i1.k(zVar2, j10));
                        i10 = iArr[i11 + 2];
                        i1.b(i10 & 1048575, zVar, i12);
                    }
                    zVar3 = zVar;
                    break;
                default:
                    zVar3 = zVar;
                    break;
            }
            i11 += 4;
            zVar = zVar3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        if (com.google.android.gms.internal.clearcut.a1.c(com.google.android.gms.internal.clearcut.i1.k(r12, r7), com.google.android.gms.internal.clearcut.i1.k(r13, r7)) != false) goto L104;
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
    
        if (com.google.android.gms.internal.clearcut.a1.c(com.google.android.gms.internal.clearcut.i1.k(r12, r7), com.google.android.gms.internal.clearcut.i1.k(r13, r7)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0102, code lost:
    
        if (com.google.android.gms.internal.clearcut.a1.c(com.google.android.gms.internal.clearcut.i1.k(r12, r7), com.google.android.gms.internal.clearcut.i1.k(r13, r7)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0118, code lost:
    
        if (com.google.android.gms.internal.clearcut.a1.c(com.google.android.gms.internal.clearcut.i1.k(r12, r7), com.google.android.gms.internal.clearcut.i1.k(r13, r7)) != false) goto L104;
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
    
        if (com.google.android.gms.internal.clearcut.a1.c(com.google.android.gms.internal.clearcut.i1.k(r12, r7), com.google.android.gms.internal.clearcut.i1.k(r13, r7)) != false) goto L104;
     */
    @Override // com.google.android.gms.internal.clearcut.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(z zVar, z zVar2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 < length) {
                int v = v(i10);
                long j10 = v & 1048575;
                switch ((v & 267386880) >>> 20) {
                    case 0:
                        if (z(zVar, zVar2, i10)) {
                            h1 h1Var = i1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 1:
                        if (z(zVar, zVar2, i10)) {
                            h1 h1Var2 = i1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 2:
                        if (z(zVar, zVar2, i10)) {
                            h1 h1Var3 = i1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 3:
                        if (z(zVar, zVar2, i10)) {
                            h1 h1Var4 = i1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 4:
                        if (z(zVar, zVar2, i10)) {
                            h1 h1Var5 = i1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 5:
                        if (z(zVar, zVar2, i10)) {
                            h1 h1Var6 = i1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 6:
                        if (z(zVar, zVar2, i10)) {
                            h1 h1Var7 = i1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 7:
                        if (z(zVar, zVar2, i10)) {
                            h1 h1Var8 = i1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 8:
                        if (z(zVar, zVar2, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 9:
                        if (z(zVar, zVar2, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 10:
                        if (z(zVar, zVar2, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 11:
                        if (z(zVar, zVar2, i10)) {
                            h1 h1Var9 = i1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 12:
                        if (z(zVar, zVar2, i10)) {
                            h1 h1Var10 = i1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 13:
                        if (z(zVar, zVar2, i10)) {
                            h1 h1Var11 = i1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 14:
                        if (z(zVar, zVar2, i10)) {
                            h1 h1Var12 = i1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 15:
                        if (z(zVar, zVar2, i10)) {
                            h1 h1Var13 = i1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 16:
                        if (z(zVar, zVar2, i10)) {
                            h1 h1Var14 = i1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 17:
                        if (z(zVar, zVar2, i10)) {
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
                        z10 = a1.c(i1.k(zVar, j10), i1.k(zVar2, j10));
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
                        long j11 = iArr[i10 + 2] & 1048575;
                        h1 h1Var15 = i1.d;
                        if (h1Var15.g(zVar, j11) == h1Var15.g(zVar2, j11)) {
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
    @Override // com.google.android.gms.internal.clearcut.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(z zVar) {
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
            long j10 = 1048575 & v;
            int i15 = 1237;
            int i16 = 37;
            switch ((v & 267386880) >>> 20) {
                case 0:
                    i10 = i12 * 53;
                    doubleToLongBits = Double.doubleToLongBits(i1.d.k(zVar, j10));
                    floatToIntBits = a0.b(doubleToLongBits);
                    i12 = floatToIntBits + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    floatToIntBits = Float.floatToIntBits(i1.d.j(zVar, j10));
                    i12 = floatToIntBits + i10;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i10 = i12 * 53;
                    doubleToLongBits = i1.d.h(zVar, j10);
                    floatToIntBits = a0.b(doubleToLongBits);
                    i12 = floatToIntBits + i10;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i10 = i12 * 53;
                    floatToIntBits = i1.d.g(zVar, j10);
                    i12 = floatToIntBits + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean i17 = i1.d.i(zVar, j10);
                    Charset charset = a0.a;
                    break;
                case 8:
                    i10 = i12 * 53;
                    floatToIntBits = ((String) i1.k(zVar, j10)).hashCode();
                    i12 = floatToIntBits + i10;
                    break;
                case 9:
                    Object k11 = i1.k(zVar, j10);
                    if (k11 != null) {
                        i16 = k11.hashCode();
                    }
                    i12 = (i12 * 53) + i16;
                    break;
                case 10:
                    i10 = i12 * 53;
                    floatToIntBits = i1.k(zVar, j10).hashCode();
                    i12 = floatToIntBits + i10;
                    break;
                case 17:
                    Object k12 = i1.k(zVar, j10);
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
                    k10 = i1.k(zVar, j10);
                    floatToIntBits = k10.hashCode();
                    i12 = floatToIntBits + i10;
                    break;
                case 51:
                    if (q(i14, i13, zVar)) {
                        i10 = i12 * 53;
                        doubleToLongBits2 = Double.doubleToLongBits(((Double) i1.k(zVar, j10)).doubleValue());
                        floatToIntBits = a0.b(doubleToLongBits2);
                        i12 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(i14, i13, zVar)) {
                        i10 = i12 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) i1.k(zVar, j10)).floatValue());
                        i12 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (!q(i14, i13, zVar)) {
                        break;
                    }
                    i10 = i12 * 53;
                    doubleToLongBits2 = B(zVar, j10);
                    floatToIntBits = a0.b(doubleToLongBits2);
                    i12 = floatToIntBits + i10;
                    break;
                case 54:
                    if (!q(i14, i13, zVar)) {
                        break;
                    }
                    i10 = i12 * 53;
                    doubleToLongBits2 = B(zVar, j10);
                    floatToIntBits = a0.b(doubleToLongBits2);
                    i12 = floatToIntBits + i10;
                    break;
                case 55:
                    if (!q(i14, i13, zVar)) {
                        break;
                    }
                    i10 = i12 * 53;
                    floatToIntBits = A(zVar, j10);
                    i12 = floatToIntBits + i10;
                    break;
                case 56:
                    if (!q(i14, i13, zVar)) {
                        break;
                    }
                    i10 = i12 * 53;
                    doubleToLongBits2 = B(zVar, j10);
                    floatToIntBits = a0.b(doubleToLongBits2);
                    i12 = floatToIntBits + i10;
                    break;
                case 57:
                    if (!q(i14, i13, zVar)) {
                        break;
                    }
                    i10 = i12 * 53;
                    floatToIntBits = A(zVar, j10);
                    i12 = floatToIntBits + i10;
                    break;
                case 58:
                    if (q(i14, i13, zVar)) {
                        i11 = i12 * 53;
                        boolean booleanValue = ((Boolean) i1.k(zVar, j10)).booleanValue();
                        Charset charset2 = a0.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(i14, i13, zVar)) {
                        i10 = i12 * 53;
                        floatToIntBits = ((String) i1.k(zVar, j10)).hashCode();
                        i12 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (!q(i14, i13, zVar)) {
                        break;
                    }
                    k10 = i1.k(zVar, j10);
                    i10 = i12 * 53;
                    floatToIntBits = k10.hashCode();
                    i12 = floatToIntBits + i10;
                    break;
                case 61:
                    if (!q(i14, i13, zVar)) {
                        break;
                    }
                    i10 = i12 * 53;
                    k10 = i1.k(zVar, j10);
                    floatToIntBits = k10.hashCode();
                    i12 = floatToIntBits + i10;
                    break;
                case 62:
                    if (!q(i14, i13, zVar)) {
                        break;
                    }
                    i10 = i12 * 53;
                    floatToIntBits = A(zVar, j10);
                    i12 = floatToIntBits + i10;
                    break;
                case 63:
                    if (!q(i14, i13, zVar)) {
                        break;
                    }
                    i10 = i12 * 53;
                    floatToIntBits = A(zVar, j10);
                    i12 = floatToIntBits + i10;
                    break;
                case 64:
                    if (!q(i14, i13, zVar)) {
                        break;
                    }
                    i10 = i12 * 53;
                    floatToIntBits = A(zVar, j10);
                    i12 = floatToIntBits + i10;
                    break;
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (!q(i14, i13, zVar)) {
                        break;
                    }
                    i10 = i12 * 53;
                    doubleToLongBits2 = B(zVar, j10);
                    floatToIntBits = a0.b(doubleToLongBits2);
                    i12 = floatToIntBits + i10;
                    break;
                case 66:
                    if (!q(i14, i13, zVar)) {
                        break;
                    }
                    i10 = i12 * 53;
                    floatToIntBits = A(zVar, j10);
                    i12 = floatToIntBits + i10;
                    break;
                case 67:
                    if (!q(i14, i13, zVar)) {
                        break;
                    }
                    i10 = i12 * 53;
                    doubleToLongBits2 = B(zVar, j10);
                    floatToIntBits = a0.b(doubleToLongBits2);
                    i12 = floatToIntBits + i10;
                    break;
                case 68:
                    if (!q(i14, i13, zVar)) {
                        break;
                    }
                    k10 = i1.k(zVar, j10);
                    i10 = i12 * 53;
                    floatToIntBits = k10.hashCode();
                    i12 = floatToIntBits + i10;
                    break;
            }
        }
        this.m.getClass();
        return zVar.zzjp.hashCode() + (i12 * 53);
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
    public final void f(Object obj, byte[] bArr, int i10, int i11, m mVar) {
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
        q0 q0Var = this;
        byte[] bArr2 = bArr;
        int i15 = i11;
        m mVar2 = mVar;
        if (!q0Var.g) {
            m(obj, bArr, i10, i15, 0, mVar);
            return;
        }
        Unsafe unsafe3 = o;
        int i16 = i10;
        while (i16 < i15) {
            int i17 = i16 + 1;
            int i18 = bArr2[i16];
            if (i18 < 0) {
                i17 = l1.d(i18, bArr2, i17, mVar2);
                i18 = mVar2.a;
            }
            int i19 = i18;
            int i20 = i17;
            int i21 = i19 >>> 3;
            int i22 = i19 & 7;
            int w10 = q0Var.w(i21);
            if (w10 >= 0) {
                int i23 = q0Var.a[w10 + 1];
                int i24 = (267386880 & i23) >>> 20;
                long j10 = 1048575 & i23;
                if (i24 <= 17) {
                    switch (i24) {
                        case 0:
                            unsafe = unsafe3;
                            if (i22 != 1) {
                                i12 = i20;
                                i13 = i12;
                                z zVar = (z) obj;
                                b1Var = zVar.zzjp;
                                if (b1Var == b1.e) {
                                    b1Var = b1.b();
                                    zVar.zzjp = b1Var;
                                }
                                i16 = l1.c(i19, bArr, i13, i11, b1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i15 = i11;
                                break;
                            } else {
                                i1.d.c(obj, j10, Double.longBitsToDouble(l1.r(i20, bArr2)));
                                i16 = i20 + 8;
                                break;
                            }
                        case 1:
                            unsafe = unsafe3;
                            if (i22 == 5) {
                                i1.d.d(obj, j10, Float.intBitsToFloat(l1.o(i20, bArr2)));
                                i16 = i20 + 4;
                                break;
                            }
                            i12 = i20;
                            i13 = i12;
                            z zVar2 = (z) obj;
                            b1Var = zVar2.zzjp;
                            if (b1Var == b1.e) {
                            }
                            i16 = l1.c(i19, bArr, i13, i11, b1Var, mVar);
                            q0Var = this;
                            bArr2 = bArr;
                            mVar2 = mVar;
                            i15 = i11;
                            break;
                        case 2:
                        case 3:
                            Unsafe unsafe4 = unsafe3;
                            if (i22 != 0) {
                                unsafe = unsafe4;
                                i12 = i20;
                                i13 = i12;
                                z zVar22 = (z) obj;
                                b1Var = zVar22.zzjp;
                                if (b1Var == b1.e) {
                                }
                                i16 = l1.c(i19, bArr, i13, i11, b1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i15 = i11;
                                break;
                            } else {
                                int m10 = l1.m(bArr2, i20, mVar2);
                                unsafe4.putLong(obj, j10, mVar2.b);
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
                                z zVar222 = (z) obj;
                                b1Var = zVar222.zzjp;
                                if (b1Var == b1.e) {
                                }
                                i16 = l1.c(i19, bArr, i13, i11, b1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i15 = i11;
                                break;
                            } else {
                                i16 = l1.f(bArr2, i20, mVar2);
                                unsafe2.putInt(obj, j10, mVar2.a);
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
                                z zVar2222 = (z) obj;
                                b1Var = zVar2222.zzjp;
                                if (b1Var == b1.e) {
                                }
                                i16 = l1.c(i19, bArr, i13, i11, b1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i15 = i11;
                                break;
                            } else {
                                unsafe2.putLong(obj, j10, l1.r(i20, bArr2));
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
                                z zVar22222 = (z) obj;
                                b1Var = zVar22222.zzjp;
                                if (b1Var == b1.e) {
                                }
                                i16 = l1.c(i19, bArr, i13, i11, b1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i15 = i11;
                                break;
                            } else {
                                unsafe2.putInt(obj, j10, l1.o(i20, bArr2));
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
                                z zVar222222 = (z) obj;
                                b1Var = zVar222222.zzjp;
                                if (b1Var == b1.e) {
                                }
                                i16 = l1.c(i19, bArr, i13, i11, b1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i15 = i11;
                                break;
                            } else {
                                i16 = l1.m(bArr2, i20, mVar2);
                                i1.d.f(obj, j10, mVar2.b != 0);
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
                                z zVar2222222 = (z) obj;
                                b1Var = zVar2222222.zzjp;
                                if (b1Var == b1.e) {
                                }
                                i16 = l1.c(i19, bArr, i13, i11, b1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i15 = i11;
                                break;
                            } else {
                                if ((536870912 & i23) == 0) {
                                    i16 = l1.f(bArr2, i20, mVar2);
                                    int i25 = mVar2.a;
                                    if (i25 == 0) {
                                        mVar2.c = "";
                                    } else {
                                        mVar2.c = new String(bArr2, i16, i25, a0.a);
                                        i16 += i25;
                                    }
                                } else {
                                    i16 = l1.q(bArr2, i20, mVar2);
                                }
                                a2 = mVar2.c;
                                unsafe2.putObject(obj2, j10, a2);
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
                                z zVar22222222 = (z) obj;
                                b1Var = zVar22222222.zzjp;
                                if (b1Var == b1.e) {
                                }
                                i16 = l1.c(i19, bArr, i13, i11, b1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i15 = i11;
                                break;
                            } else {
                                i16 = j(q0Var.s(w10), bArr2, i20, i15, mVar2);
                                Object object = unsafe2.getObject(obj2, j10);
                                a2 = object == null ? mVar2.c : a0.a(object, mVar2.c);
                                unsafe2.putObject(obj2, j10, a2);
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
                                z zVar222222222 = (z) obj;
                                b1Var = zVar222222222.zzjp;
                                if (b1Var == b1.e) {
                                }
                                i16 = l1.c(i19, bArr, i13, i11, b1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i15 = i11;
                                break;
                            } else {
                                i16 = l1.s(bArr2, i20, mVar2);
                                a2 = mVar2.c;
                                unsafe2.putObject(obj2, j10, a2);
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
                                z zVar2222222222 = (z) obj;
                                b1Var = zVar2222222222.zzjp;
                                if (b1Var == b1.e) {
                                }
                                i16 = l1.c(i19, bArr, i13, i11, b1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i15 = i11;
                                break;
                            } else {
                                i16 = l1.f(bArr2, i20, mVar2);
                                i14 = mVar2.a;
                                unsafe2.putInt(obj3, j10, i14);
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
                                z zVar22222222222 = (z) obj;
                                b1Var = zVar22222222222.zzjp;
                                if (b1Var == b1.e) {
                                }
                                i16 = l1.c(i19, bArr, i13, i11, b1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i15 = i11;
                                break;
                            } else {
                                i16 = l1.f(bArr2, i20, mVar2);
                                int i26 = mVar2.a;
                                i14 = (-(i26 & 1)) ^ (i26 >>> 1);
                                unsafe2.putInt(obj3, j10, i14);
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
                                z zVar222222222222 = (z) obj;
                                b1Var = zVar222222222222.zzjp;
                                if (b1Var == b1.e) {
                                }
                                i16 = l1.c(i19, bArr, i13, i11, b1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i15 = i11;
                                break;
                            } else {
                                int m11 = l1.m(bArr2, i20, mVar2);
                                long j11 = mVar2.b;
                                unsafe3.putLong(obj, j10, (-(j11 & 1)) ^ (j11 >>> 1));
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
                            c0 c0Var = (c0) unsafe.getObject(obj, j10);
                            if (!((k) c0Var).a) {
                                int size = c0Var.size();
                                c0Var = c0Var.f(size == 0 ? 10 : size << 1);
                                unsafe.putObject(obj, j10, c0Var);
                            }
                            i16 = h(q0Var.s(w10), i19, bArr2, i20, i15, c0Var, mVar2);
                            bArr2 = bArr;
                            i15 = i11;
                            mVar2 = mVar;
                        } else {
                            i19 = i19;
                            i12 = i20;
                            i13 = i12;
                            z zVar2222222222222 = (z) obj;
                            b1Var = zVar2222222222222.zzjp;
                            if (b1Var == b1.e) {
                            }
                            i16 = l1.c(i19, bArr, i13, i11, b1Var, mVar);
                            q0Var = this;
                            bArr2 = bArr;
                            mVar2 = mVar;
                            i15 = i11;
                        }
                    } else if (i24 <= 49) {
                        i19 = i19;
                        k10 = q0Var.l(obj, bArr, i20, i11, i19, i21, i22, w10, i23, i24, j10, mVar);
                    } else {
                        i19 = i19;
                        if (i24 != 50) {
                            k10 = q0Var.k(obj, bArr, i20, i11, i19, i21, i22, i23, i24, j10, w10, mVar);
                            if (k10 != i20) {
                                q0Var = this;
                                bArr2 = bArr;
                                i15 = i11;
                                mVar2 = mVar;
                                i16 = k10;
                            }
                            i13 = k10;
                            z zVar22222222222222 = (z) obj;
                            b1Var = zVar22222222222222.zzjp;
                            if (b1Var == b1.e) {
                            }
                            i16 = l1.c(i19, bArr, i13, i11, b1Var, mVar);
                            q0Var = this;
                            bArr2 = bArr;
                            mVar2 = mVar;
                            i15 = i11;
                        } else {
                            if (i22 == 2) {
                                q0Var.p(j10, obj, w10);
                                throw null;
                            }
                            i12 = i20;
                            i13 = i12;
                            z zVar222222222222222 = (z) obj;
                            b1Var = zVar222222222222222.zzjp;
                            if (b1Var == b1.e) {
                            }
                            i16 = l1.c(i19, bArr, i13, i11, b1Var, mVar);
                            q0Var = this;
                            bArr2 = bArr;
                            mVar2 = mVar;
                            i15 = i11;
                        }
                    }
                }
                unsafe3 = unsafe;
            }
            unsafe = unsafe3;
            i12 = i20;
            i13 = i12;
            z zVar2222222222222222 = (z) obj;
            b1Var = zVar2222222222222222.zzjp;
            if (b1Var == b1.e) {
            }
            i16 = l1.c(i19, bArr, i13, i11, b1Var, mVar);
            q0Var = this;
            bArr2 = bArr;
            mVar2 = mVar;
            i15 = i11;
            unsafe3 = unsafe;
        }
        if (i16 != i15) {
            throw d0.b();
        }
    }

    @Override // com.google.android.gms.internal.clearcut.z0
    public final boolean g(Object obj) {
        boolean z10;
        int[] iArr;
        int i10;
        boolean z11 = true;
        z11 = true;
        z11 = true;
        int[] iArr2 = this.h;
        if (iArr2 != null && iArr2.length != 0) {
            int length = iArr2.length;
            int i11 = -1;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                int i14 = iArr2[i12];
                int w10 = w(i14);
                int v = v(w10);
                boolean z12 = this.g;
                if (z12) {
                    z10 = z11 ? 1 : 0;
                    iArr = iArr2;
                    i10 = 0;
                } else {
                    int i15 = this.a[w10 + 2];
                    int i16 = i15 & 1048575;
                    i10 = (z11 ? 1 : 0) << (i15 >>> 20);
                    if (i16 != i11) {
                        Unsafe unsafe = o;
                        z10 = z11 ? 1 : 0;
                        iArr = iArr2;
                        i13 = unsafe.getInt(obj, i16);
                        i11 = i16;
                    } else {
                        z10 = z11 ? 1 : 0;
                        iArr = iArr2;
                    }
                }
                if ((268435456 & v) != 0) {
                    if (!(z12 ? r(w10, obj) : (i13 & i10) != 0 ? z10 : false)) {
                        return false;
                    }
                }
                int i17 = (267386880 & v) >>> 20;
                if (i17 == 9 || i17 == 17) {
                    if ((z12 ? r(w10, obj) : (i13 & i10) != 0 ? z10 : false) && !s(w10).g(i1.k(obj, v & 1048575))) {
                        return false;
                    }
                    i12++;
                    z11 = z10;
                    iArr2 = iArr;
                } else {
                    if (i17 != 27) {
                        if (i17 == 60 || i17 == 68) {
                            if (q(i14, w10, obj) && !s(w10).g(i1.k(obj, v & 1048575))) {
                                return false;
                            }
                        } else if (i17 != 49) {
                            if (i17 != 50) {
                                continue;
                            } else {
                                Object k10 = i1.k(obj, v & 1048575);
                                this.n.getClass();
                                if (!((m0) k10).isEmpty()) {
                                    t(w10);
                                    throw new NoSuchMethodError();
                                }
                            }
                        }
                        i12++;
                        z11 = z10;
                        iArr2 = iArr;
                    }
                    List list = (List) i1.k(obj, v & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        z0 s10 = s(w10);
                        for (int i18 = 0; i18 < list.size(); i18++) {
                            if (!s10.g(list.get(i18))) {
                                return false;
                            }
                        }
                    }
                    i12++;
                    z11 = z10;
                    iArr2 = iArr;
                }
            }
        }
        return z11;
    }

    public final int k(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, m mVar) {
        int i18;
        Object valueOf;
        int i19;
        Object valueOf2;
        int m10;
        long j11;
        int i20;
        Object valueOf3;
        Object object;
        Unsafe unsafe = o;
        long j12 = this.a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                i18 = i10;
                if (i14 != 1) {
                    return i18;
                }
                valueOf = Double.valueOf(Double.longBitsToDouble(l1.r(i18, bArr)));
                unsafe.putObject(obj, j10, valueOf);
                m10 = i18 + 8;
                unsafe.putInt(obj, j12, i13);
                return m10;
            case 52:
                i19 = i10;
                if (i14 != 5) {
                    return i19;
                }
                valueOf2 = Float.valueOf(Float.intBitsToFloat(l1.o(i19, bArr)));
                unsafe.putObject(obj, j10, valueOf2);
                m10 = i19 + 4;
                unsafe.putInt(obj, j12, i13);
                return m10;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                m10 = l1.m(bArr, i10, mVar);
                j11 = mVar.b;
                valueOf3 = Long.valueOf(j11);
                unsafe.putObject(obj, j10, valueOf3);
                unsafe.putInt(obj, j12, i13);
                return m10;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                m10 = l1.f(bArr, i10, mVar);
                i20 = mVar.a;
                valueOf3 = Integer.valueOf(i20);
                unsafe.putObject(obj, j10, valueOf3);
                unsafe.putInt(obj, j12, i13);
                return m10;
            case 56:
            case VoIPService.CALL_MIN_LAYER /* 65 */:
                i18 = i10;
                if (i14 != 1) {
                    return i18;
                }
                valueOf = Long.valueOf(l1.r(i18, bArr));
                unsafe.putObject(obj, j10, valueOf);
                m10 = i18 + 8;
                unsafe.putInt(obj, j12, i13);
                return m10;
            case 57:
            case 64:
                i19 = i10;
                if (i14 != 5) {
                    return i19;
                }
                valueOf2 = Integer.valueOf(l1.o(i19, bArr));
                unsafe.putObject(obj, j10, valueOf2);
                m10 = i19 + 4;
                unsafe.putInt(obj, j12, i13);
                return m10;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                m10 = l1.m(bArr, i10, mVar);
                valueOf3 = Boolean.valueOf(mVar.b != 0);
                unsafe.putObject(obj, j10, valueOf3);
                unsafe.putInt(obj, j12, i13);
                return m10;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int f7 = l1.f(bArr, i10, mVar);
                int i21 = mVar.a;
                if (i21 == 0) {
                    unsafe.putObject(obj, j10, "");
                } else {
                    if ((i15 & TLObject.FLAG_29) != 0) {
                        if (!k1.a.t(bArr, f7, f7 + i21)) {
                            throw new d0("Protocol message had invalid UTF-8.");
                        }
                    }
                    unsafe.putObject(obj, j10, new String(bArr, f7, i21, a0.a));
                    f7 += i21;
                }
                unsafe.putInt(obj, j12, i13);
                return f7;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                int j13 = j(s(i17), bArr, i10, i11, mVar);
                object = unsafe.getInt(obj, j12) == i13 ? unsafe.getObject(obj, j10) : null;
                Object obj2 = mVar.c;
                if (object != null) {
                    obj2 = a0.a(object, obj2);
                }
                unsafe.putObject(obj, j10, obj2);
                unsafe.putInt(obj, j12, i13);
                return j13;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int f10 = l1.f(bArr, i10, mVar);
                int i22 = mVar.a;
                if (i22 == 0) {
                    unsafe.putObject(obj, j10, o.c);
                } else {
                    unsafe.putObject(obj, j10, o.m(f10, i22, bArr));
                    f10 += i22;
                }
                unsafe.putInt(obj, j12, i13);
                return f10;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int f11 = l1.f(bArr, i10, mVar);
                int i23 = mVar.a;
                b0 u10 = u(i17);
                if (u10 == null || u10.a(i23) != null) {
                    unsafe.putObject(obj, j10, Integer.valueOf(i23));
                    m10 = f11;
                    unsafe.putInt(obj, j12, i13);
                    return m10;
                }
                z zVar = (z) obj;
                b1 b1Var = zVar.zzjp;
                if (b1Var == b1.e) {
                    b1Var = b1.b();
                    zVar.zzjp = b1Var;
                }
                b1Var.a(i12, Long.valueOf(i23));
                return f11;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                m10 = l1.f(bArr, i10, mVar);
                int i24 = mVar.a;
                i20 = (-(i24 & 1)) ^ (i24 >>> 1);
                valueOf3 = Integer.valueOf(i20);
                unsafe.putObject(obj, j10, valueOf3);
                unsafe.putInt(obj, j12, i13);
                return m10;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                m10 = l1.m(bArr, i10, mVar);
                long j14 = mVar.b;
                j11 = (-(j14 & 1)) ^ (j14 >>> 1);
                valueOf3 = Long.valueOf(j11);
                unsafe.putObject(obj, j10, valueOf3);
                unsafe.putInt(obj, j12, i13);
                return m10;
            case 68:
                if (i14 == 3) {
                    m10 = i(s(i17), bArr, i10, i11, (i12 & (-8)) | 4, mVar);
                    object = unsafe.getInt(obj, j12) == i13 ? unsafe.getObject(obj, j10) : null;
                    Object obj3 = mVar.c;
                    if (object != null) {
                        obj3 = a0.a(object, obj3);
                    }
                    unsafe.putObject(obj, j10, obj3);
                    unsafe.putInt(obj, j12, i13);
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
    
        r6.add(com.google.android.gms.internal.clearcut.o.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01be, code lost:
    
        if (r12 >= r15) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01c0, code lost:
    
        r1 = com.google.android.gms.internal.clearcut.l1.f(r13, r12, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01c6, code lost:
    
        if (r16 != r25.a) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01c8, code lost:
    
        r12 = com.google.android.gms.internal.clearcut.l1.f(r13, r1, r25);
        r1 = r25.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01ce, code lost:
    
        if (r1 != 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01b6, code lost:
    
        r6.add(com.google.android.gms.internal.clearcut.o.m(r12, r1, r13));
        r12 = r12 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01d1, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01be, code lost:
    
        r6.add(com.google.android.gms.internal.clearcut.o.m(r12, r1, r13));
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
    public final int l(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, m mVar) {
        Unsafe unsafe = o;
        c0 c0Var = (c0) unsafe.getObject(obj, j11);
        if (!((k) c0Var).a) {
            int size = c0Var.size();
            c0Var = c0Var.f(size == 0 ? 10 : size << 1);
            unsafe.putObject(obj, j11, c0Var);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 != 2) {
                    if (i14 == 1) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        Double.longBitsToDouble(l1.r(i10, bArr));
                        throw null;
                    }
                    return i10;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f7 = l1.f(bArr, i10, mVar);
                int i17 = mVar.a + f7;
                if (f7 < i17) {
                    Double.longBitsToDouble(l1.r(f7, bArr));
                    throw null;
                }
                if (f7 == i17) {
                    return f7;
                }
                throw d0.a();
            case 19:
            case 36:
                if (i14 != 2) {
                    if (i14 == 5) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        Float.intBitsToFloat(l1.o(i10, bArr));
                        throw null;
                    }
                    return i10;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f10 = l1.f(bArr, i10, mVar);
                int i18 = mVar.a + f10;
                if (f10 < i18) {
                    Float.intBitsToFloat(l1.o(f10, bArr));
                    throw null;
                }
                if (f10 == i18) {
                    return f10;
                }
                throw d0.a();
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 != 2) {
                    if (i14 == 0) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        l1.m(bArr, i10, mVar);
                        throw null;
                    }
                    return i10;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f11 = l1.f(bArr, i10, mVar);
                int i19 = mVar.a + f11;
                if (f11 < i19) {
                    l1.m(bArr, f11, mVar);
                    throw null;
                }
                if (f11 == i19) {
                    return f11;
                }
                throw d0.a();
            case 22:
            case 29:
            case Maneuver.TYPE_DESTINATION /* 39 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                if (i14 != 2) {
                    if (i14 == 0) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        l1.f(bArr, i10, mVar);
                        throw null;
                    }
                    return i10;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f12 = l1.f(bArr, i10, mVar);
                int i20 = mVar.a + f12;
                if (f12 < i20) {
                    l1.f(bArr, f12, mVar);
                    throw null;
                }
                if (f12 == i20) {
                    return f12;
                }
                throw d0.a();
            case 23:
            case 32:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                if (i14 != 2) {
                    if (i14 == 1) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        l1.r(i10, bArr);
                        throw null;
                    }
                    return i10;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f13 = l1.f(bArr, i10, mVar);
                int i21 = mVar.a + f13;
                if (f13 < i21) {
                    l1.r(f13, bArr);
                    throw null;
                }
                if (f13 == i21) {
                    return f13;
                }
                throw d0.a();
            case 24:
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                if (i14 != 2) {
                    if (i14 == 5) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        l1.o(i10, bArr);
                        throw null;
                    }
                    return i10;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f14 = l1.f(bArr, i10, mVar);
                int i22 = mVar.a + f14;
                if (f14 < i22) {
                    l1.o(f14, bArr);
                    throw null;
                }
                if (f14 == i22) {
                    return f14;
                }
                throw d0.a();
            case 25:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                if (i14 != 2) {
                    if (i14 == 0) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        l1.m(bArr, i10, mVar);
                        throw null;
                    }
                    return i10;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f15 = l1.f(bArr, i10, mVar);
                int i23 = mVar.a + f15;
                if (f15 < i23) {
                    l1.m(bArr, f15, mVar);
                    throw null;
                }
                if (f15 == i23) {
                    return f15;
                }
                throw d0.a();
            case 26:
                if (i14 == 2) {
                    if ((j10 & 536870912) == 0) {
                        int f16 = l1.f(bArr, i10, mVar);
                        int i24 = mVar.a;
                        if (i24 != 0) {
                            c0Var.add(new String(bArr, f16, i24, a0.a));
                            f16 += i24;
                            while (f16 < i11) {
                                int f17 = l1.f(bArr, f16, mVar);
                                if (i12 != mVar.a) {
                                    return f16;
                                }
                                f16 = l1.f(bArr, f17, mVar);
                                int i25 = mVar.a;
                                if (i25 != 0) {
                                    c0Var.add(new String(bArr, f16, i25, a0.a));
                                    f16 += i25;
                                }
                            }
                            return f16;
                        }
                        c0Var.add("");
                        while (f16 < i11) {
                        }
                        return f16;
                    }
                    int f18 = l1.f(bArr, i10, mVar);
                    int i26 = mVar.a;
                    if (i26 != 0) {
                        int i27 = f18 + i26;
                        if (!k1.a.t(bArr, f18, i27)) {
                            throw new d0("Protocol message had invalid UTF-8.");
                        }
                        c0Var.add(new String(bArr, f18, i26, a0.a));
                        f18 = i27;
                        while (f18 < i11) {
                            int f19 = l1.f(bArr, f18, mVar);
                            if (i12 != mVar.a) {
                                return f18;
                            }
                            f18 = l1.f(bArr, f19, mVar);
                            int i28 = mVar.a;
                            if (i28 != 0) {
                                int i29 = f18 + i28;
                                if (!k1.a.t(bArr, f18, i29)) {
                                    throw new d0("Protocol message had invalid UTF-8.");
                                }
                                c0Var.add(new String(bArr, f18, i28, a0.a));
                                f18 = i29;
                            }
                        }
                        return f18;
                    }
                    c0Var.add("");
                    while (f18 < i11) {
                    }
                    return f18;
                }
                return i10;
            case 27:
                if (i14 == 2) {
                    return h(s(i15), i12, bArr, i10, i11, c0Var, mVar);
                }
                return i10;
            case 28:
                if (i14 == 2) {
                    int f20 = l1.f(bArr, i10, mVar);
                    int i30 = mVar.a;
                    break;
                }
                return i10;
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                if (i14 != 2) {
                    if (i14 == 0) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        l1.f(bArr, i10, mVar);
                        throw null;
                    }
                    return i10;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f21 = l1.f(bArr, i10, mVar);
                int i31 = mVar.a + f21;
                if (f21 < i31) {
                    l1.f(bArr, f21, mVar);
                    throw null;
                }
                if (f21 != i31) {
                    throw d0.a();
                }
                z zVar = (z) obj;
                b1 b1Var = zVar.zzjp;
                b1 b1Var2 = b1Var != b1.e ? b1Var : null;
                b0 u10 = u(i15);
                Class cls = a1.a;
                if (u10 != null) {
                    c1 c1Var = this.m;
                    if (c0Var != null) {
                        int size2 = c0Var.size();
                        int i32 = 0;
                        for (int i33 = 0; i33 < size2; i33++) {
                            Integer num = (Integer) c0Var.get(i33);
                            int intValue = num.intValue();
                            if (u10.a(intValue) != null) {
                                if (i33 != i32) {
                                    c0Var.set(i32, num);
                                }
                                i32++;
                            } else {
                                if (b1Var2 == null) {
                                    c1Var.getClass();
                                    b1Var2 = b1.b();
                                }
                                c1Var.getClass();
                                b1Var2.a(i13 << 3, Long.valueOf(intValue));
                            }
                        }
                        if (i32 != size2) {
                            c0Var.subList(i32, size2).clear();
                        }
                    } else {
                        Iterator it = c0Var.iterator();
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
                    zVar.zzjp = b1Var2;
                }
                return f21;
            case 33:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                if (i14 != 2) {
                    if (i14 == 0) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        l1.f(bArr, i10, mVar);
                        throw null;
                    }
                    return i10;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f22 = l1.f(bArr, i10, mVar);
                int i34 = mVar.a + f22;
                if (f22 < i34) {
                    l1.f(bArr, f22, mVar);
                    throw null;
                }
                if (f22 == i34) {
                    return f22;
                }
                throw d0.a();
            case 34:
            case 48:
                if (i14 != 2) {
                    if (i14 == 0) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        l1.m(bArr, i10, mVar);
                        throw null;
                    }
                    return i10;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f23 = l1.f(bArr, i10, mVar);
                int i35 = mVar.a + f23;
                if (f23 < i35) {
                    l1.m(bArr, f23, mVar);
                    throw null;
                }
                if (f23 == i35) {
                    return f23;
                }
                throw d0.a();
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                if (i14 == 3) {
                    z0 s10 = s(i15);
                    int i36 = (i12 & (-8)) | 4;
                    int i37 = i(s10, bArr, i10, i11, i36, mVar);
                    z0 z0Var = s10;
                    m mVar2 = mVar;
                    c0Var.add(mVar2.c);
                    while (i37 < i11) {
                        int f24 = l1.f(bArr, i37, mVar2);
                        if (i12 != mVar2.a) {
                            return i37;
                        }
                        m mVar3 = mVar2;
                        z0 z0Var2 = z0Var;
                        i37 = i(z0Var2, bArr, f24, i11, i36, mVar3);
                        c0Var.add(mVar3.c);
                        z0Var = z0Var2;
                        mVar2 = mVar3;
                    }
                    return i37;
                }
                return i10;
            default:
                return i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(Object obj, byte[] bArr, int i10, int i11, int i12, m mVar) {
        q0 q0Var;
        int[] iArr;
        int i13;
        Unsafe unsafe;
        int i14;
        Object obj2;
        int i15;
        int i16;
        b1 b1Var;
        int i17;
        int i18;
        int i19;
        byte[] bArr2;
        Unsafe unsafe2;
        int i20;
        int i21;
        Unsafe unsafe3;
        Unsafe unsafe4;
        byte[] bArr3;
        int i22;
        m mVar2;
        Unsafe unsafe5;
        int i23;
        int i24;
        int q5;
        Object a2;
        m mVar3;
        int l4;
        q0 q0Var2 = this;
        Object obj3 = obj;
        byte[] bArr4 = bArr;
        int i25 = i11;
        m mVar4 = mVar;
        Unsafe unsafe6 = o;
        int i26 = -1;
        int i27 = i10;
        int i28 = -1;
        int i29 = 0;
        int i30 = 0;
        while (true) {
            int[] iArr2 = q0Var2.a;
            if (i27 < i25) {
                int i31 = i27 + 1;
                int i32 = bArr4[i27];
                if (i32 < 0) {
                    i31 = l1.d(i32, bArr4, i31, mVar4);
                    i32 = mVar4.a;
                }
                int i33 = i32;
                int i34 = i31;
                int i35 = i33 >>> 3;
                int i36 = i33 & 7;
                int w10 = q0Var2.w(i35);
                b1 b1Var2 = b1.e;
                if (w10 != i26) {
                    int i37 = iArr2[w10 + 1];
                    int i38 = (i37 & 267386880) >>> 20;
                    int i39 = i33;
                    long j10 = i37 & 1048575;
                    if (i38 <= 17) {
                        int i40 = iArr2[w10 + 2];
                        int i41 = 1 << (i40 >>> 20);
                        int i42 = i40 & 1048575;
                        if (i42 != i28) {
                            i18 = i37;
                            i26 = -1;
                            i17 = 1;
                            iArr = iArr2;
                            if (i28 != -1) {
                                unsafe6.putInt(obj3, i28, i30);
                            }
                            i19 = i42;
                            i15 = unsafe6.getInt(obj3, i42);
                        } else {
                            i17 = 1;
                            iArr = iArr2;
                            i18 = i37;
                            i26 = -1;
                            i15 = i30;
                            i19 = i28;
                        }
                        switch (i38) {
                            case 0:
                                bArr2 = bArr;
                                unsafe2 = unsafe6;
                                i20 = i34;
                                i21 = i11;
                                mVar4 = mVar;
                                if (i36 == i17) {
                                    i1.d.c(obj3, j10, Double.longBitsToDouble(l1.r(i20, bArr2)));
                                    i27 = i20 + 8;
                                    int i43 = i19;
                                    i30 = i15 | i41;
                                    bArr4 = bArr2;
                                    i28 = i43;
                                    i25 = i21;
                                    unsafe6 = unsafe2;
                                    i29 = i39;
                                    break;
                                } else {
                                    i14 = i12;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i20;
                                    unsafe = unsafe2;
                                    i29 = i39;
                                    i13 = i19;
                                    i30 = i15;
                                    if (i29 != i14 && i14 != 0) {
                                        i25 = i11;
                                        i27 = i16;
                                        i26 = -1;
                                        break;
                                    } else {
                                        z zVar = (z) obj2;
                                        b1Var = zVar.zzjp;
                                        if (b1Var == b1Var2) {
                                            b1Var = b1.b();
                                            zVar.zzjp = b1Var;
                                        }
                                        int i44 = i29;
                                        int c10 = l1.c(i44, bArr, i16, i11, b1Var, mVar);
                                        i29 = i44;
                                        bArr4 = bArr;
                                        mVar4 = mVar;
                                        i25 = i11;
                                        q0Var2 = q0Var;
                                        unsafe6 = unsafe;
                                        i26 = -1;
                                        i27 = c10;
                                        obj3 = obj2;
                                        i28 = i13;
                                        break;
                                    }
                                }
                            case 1:
                                bArr2 = bArr;
                                unsafe2 = unsafe6;
                                i20 = i34;
                                i21 = i11;
                                mVar4 = mVar;
                                if (i36 == 5) {
                                    i1.d.d(obj3, j10, Float.intBitsToFloat(l1.o(i20, bArr2)));
                                    i27 = i20 + 4;
                                    int i432 = i19;
                                    i30 = i15 | i41;
                                    bArr4 = bArr2;
                                    i28 = i432;
                                    i25 = i21;
                                    unsafe6 = unsafe2;
                                    i29 = i39;
                                    break;
                                } else {
                                    i14 = i12;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i20;
                                    unsafe = unsafe2;
                                    i29 = i39;
                                    i13 = i19;
                                    i30 = i15;
                                    if (i29 != i14) {
                                    }
                                    z zVar2 = (z) obj2;
                                    b1Var = zVar2.zzjp;
                                    if (b1Var == b1Var2) {
                                    }
                                    int i442 = i29;
                                    int c102 = l1.c(i442, bArr, i16, i11, b1Var, mVar);
                                    i29 = i442;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i25 = i11;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i26 = -1;
                                    i27 = c102;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            case 2:
                            case 3:
                                unsafe3 = unsafe6;
                                i20 = i34;
                                i21 = i11;
                                mVar4 = mVar;
                                if (i36 == 0) {
                                    int m10 = l1.m(bArr, i20, mVar4);
                                    unsafe3.putLong(obj3, j10, mVar4.b);
                                    unsafe2 = unsafe3;
                                    int i45 = i19;
                                    i30 = i15 | i41;
                                    bArr4 = bArr;
                                    i28 = i45;
                                    i27 = m10;
                                    i25 = i21;
                                    unsafe6 = unsafe2;
                                    i29 = i39;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    i14 = i12;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i20;
                                    unsafe = unsafe2;
                                    i29 = i39;
                                    i13 = i19;
                                    i30 = i15;
                                    if (i29 != i14) {
                                    }
                                    z zVar22 = (z) obj2;
                                    b1Var = zVar22.zzjp;
                                    if (b1Var == b1Var2) {
                                    }
                                    int i4422 = i29;
                                    int c1022 = l1.c(i4422, bArr, i16, i11, b1Var, mVar);
                                    i29 = i4422;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i25 = i11;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i26 = -1;
                                    i27 = c1022;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            case 4:
                            case 11:
                                unsafe3 = unsafe6;
                                i20 = i34;
                                mVar4 = mVar;
                                if (i36 == 0) {
                                    int f7 = l1.f(bArr, i20, mVar4);
                                    unsafe3.putInt(obj3, j10, mVar4.a);
                                    i25 = i11;
                                    unsafe6 = unsafe3;
                                    bArr4 = bArr;
                                    i28 = i19;
                                    i30 = i15 | i41;
                                    i27 = f7;
                                    i29 = i39;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    i14 = i12;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i20;
                                    unsafe = unsafe2;
                                    i29 = i39;
                                    i13 = i19;
                                    i30 = i15;
                                    if (i29 != i14) {
                                    }
                                    z zVar222 = (z) obj2;
                                    b1Var = zVar222.zzjp;
                                    if (b1Var == b1Var2) {
                                    }
                                    int i44222 = i29;
                                    int c10222 = l1.c(i44222, bArr, i16, i11, b1Var, mVar);
                                    i29 = i44222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i25 = i11;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i26 = -1;
                                    i27 = c10222;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            case 5:
                            case 14:
                                unsafe4 = unsafe6;
                                if (i36 == i17) {
                                    i39 = i39;
                                    mVar4 = mVar;
                                    unsafe4.putLong(obj3, j10, l1.r(i34, bArr));
                                    i27 = i34 + 8;
                                    unsafe6 = unsafe4;
                                    bArr4 = bArr;
                                    i28 = i19;
                                    i30 = i15 | i41;
                                    i25 = i11;
                                    i29 = i39;
                                    break;
                                } else {
                                    i20 = i34;
                                    i39 = i39;
                                    unsafe2 = unsafe4;
                                    i14 = i12;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i20;
                                    unsafe = unsafe2;
                                    i29 = i39;
                                    i13 = i19;
                                    i30 = i15;
                                    if (i29 != i14) {
                                    }
                                    z zVar2222 = (z) obj2;
                                    b1Var = zVar2222.zzjp;
                                    if (b1Var == b1Var2) {
                                    }
                                    int i442222 = i29;
                                    int c102222 = l1.c(i442222, bArr, i16, i11, b1Var, mVar);
                                    i29 = i442222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i25 = i11;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i26 = -1;
                                    i27 = c102222;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            case 6:
                            case 13:
                                bArr3 = bArr;
                                i22 = i34;
                                mVar2 = mVar;
                                unsafe5 = unsafe6;
                                i23 = i39;
                                i24 = i11;
                                if (i36 == 5) {
                                    unsafe5.putInt(obj3, j10, l1.o(i22, bArr3));
                                    i27 = i22 + 4;
                                    int i46 = i19;
                                    i30 = i15 | i41;
                                    bArr4 = bArr3;
                                    i28 = i46;
                                    int i47 = i24;
                                    unsafe6 = unsafe5;
                                    i25 = i47;
                                    mVar4 = mVar2;
                                    i29 = i23;
                                    break;
                                } else {
                                    i20 = i22;
                                    unsafe2 = unsafe5;
                                    i39 = i23;
                                    i14 = i12;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i20;
                                    unsafe = unsafe2;
                                    i29 = i39;
                                    i13 = i19;
                                    i30 = i15;
                                    if (i29 != i14) {
                                    }
                                    z zVar22222 = (z) obj2;
                                    b1Var = zVar22222.zzjp;
                                    if (b1Var == b1Var2) {
                                    }
                                    int i4422222 = i29;
                                    int c1022222 = l1.c(i4422222, bArr, i16, i11, b1Var, mVar);
                                    i29 = i4422222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i25 = i11;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i26 = -1;
                                    i27 = c1022222;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            case 7:
                                bArr3 = bArr;
                                i22 = i34;
                                mVar2 = mVar;
                                unsafe5 = unsafe6;
                                i23 = i39;
                                i24 = i11;
                                if (i36 == 0) {
                                    i27 = l1.m(bArr3, i22, mVar2);
                                    i1.d.f(obj3, j10, mVar2.b != 0 ? i17 : 0);
                                    int i462 = i19;
                                    i30 = i15 | i41;
                                    bArr4 = bArr3;
                                    i28 = i462;
                                    int i472 = i24;
                                    unsafe6 = unsafe5;
                                    i25 = i472;
                                    mVar4 = mVar2;
                                    i29 = i23;
                                    break;
                                } else {
                                    i20 = i22;
                                    unsafe2 = unsafe5;
                                    i39 = i23;
                                    i14 = i12;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i20;
                                    unsafe = unsafe2;
                                    i29 = i39;
                                    i13 = i19;
                                    i30 = i15;
                                    if (i29 != i14) {
                                    }
                                    z zVar222222 = (z) obj2;
                                    b1Var = zVar222222.zzjp;
                                    if (b1Var == b1Var2) {
                                    }
                                    int i44222222 = i29;
                                    int c10222222 = l1.c(i44222222, bArr, i16, i11, b1Var, mVar);
                                    i29 = i44222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i25 = i11;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i26 = -1;
                                    i27 = c10222222;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            case 8:
                                bArr3 = bArr;
                                i22 = i34;
                                mVar2 = mVar;
                                unsafe5 = unsafe6;
                                i23 = i39;
                                i24 = i11;
                                if (i36 == 2) {
                                    if ((i18 & TLObject.FLAG_29) == 0) {
                                        q5 = l1.f(bArr3, i22, mVar2);
                                        int i48 = mVar2.a;
                                        if (i48 == 0) {
                                            mVar2.c = "";
                                        } else {
                                            mVar2.c = new String(bArr3, q5, i48, a0.a);
                                            q5 += i48;
                                        }
                                    } else {
                                        q5 = l1.q(bArr3, i22, mVar2);
                                    }
                                    i27 = q5;
                                    a2 = mVar2.c;
                                    unsafe5.putObject(obj3, j10, a2);
                                    int i4622 = i19;
                                    i30 = i15 | i41;
                                    bArr4 = bArr3;
                                    i28 = i4622;
                                    int i4722 = i24;
                                    unsafe6 = unsafe5;
                                    i25 = i4722;
                                    mVar4 = mVar2;
                                    i29 = i23;
                                    break;
                                } else {
                                    i20 = i22;
                                    unsafe2 = unsafe5;
                                    i39 = i23;
                                    i14 = i12;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i20;
                                    unsafe = unsafe2;
                                    i29 = i39;
                                    i13 = i19;
                                    i30 = i15;
                                    if (i29 != i14) {
                                    }
                                    z zVar2222222 = (z) obj2;
                                    b1Var = zVar2222222.zzjp;
                                    if (b1Var == b1Var2) {
                                    }
                                    int i442222222 = i29;
                                    int c102222222 = l1.c(i442222222, bArr, i16, i11, b1Var, mVar);
                                    i29 = i442222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i25 = i11;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i26 = -1;
                                    i27 = c102222222;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            case 9:
                                bArr3 = bArr;
                                i22 = i34;
                                mVar2 = mVar;
                                unsafe5 = unsafe6;
                                i23 = i39;
                                i24 = i11;
                                if (i36 == 2) {
                                    i27 = j(q0Var2.s(w10), bArr3, i22, i24, mVar2);
                                    a2 = (i15 & i41) == 0 ? mVar2.c : a0.a(unsafe5.getObject(obj3, j10), mVar2.c);
                                    unsafe5.putObject(obj3, j10, a2);
                                    int i46222 = i19;
                                    i30 = i15 | i41;
                                    bArr4 = bArr3;
                                    i28 = i46222;
                                    int i47222 = i24;
                                    unsafe6 = unsafe5;
                                    i25 = i47222;
                                    mVar4 = mVar2;
                                    i29 = i23;
                                    break;
                                } else {
                                    i20 = i22;
                                    unsafe2 = unsafe5;
                                    i39 = i23;
                                    i14 = i12;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i20;
                                    unsafe = unsafe2;
                                    i29 = i39;
                                    i13 = i19;
                                    i30 = i15;
                                    if (i29 != i14) {
                                    }
                                    z zVar22222222 = (z) obj2;
                                    b1Var = zVar22222222.zzjp;
                                    if (b1Var == b1Var2) {
                                    }
                                    int i4422222222 = i29;
                                    int c1022222222 = l1.c(i4422222222, bArr, i16, i11, b1Var, mVar);
                                    i29 = i4422222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i25 = i11;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i26 = -1;
                                    i27 = c1022222222;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            case 10:
                                bArr3 = bArr;
                                i22 = i34;
                                mVar2 = mVar;
                                unsafe5 = unsafe6;
                                i23 = i39;
                                i24 = i11;
                                if (i36 == 2) {
                                    i27 = l1.s(bArr3, i22, mVar2);
                                    a2 = mVar2.c;
                                    unsafe5.putObject(obj3, j10, a2);
                                    int i462222 = i19;
                                    i30 = i15 | i41;
                                    bArr4 = bArr3;
                                    i28 = i462222;
                                    int i472222 = i24;
                                    unsafe6 = unsafe5;
                                    i25 = i472222;
                                    mVar4 = mVar2;
                                    i29 = i23;
                                    break;
                                } else {
                                    i20 = i22;
                                    unsafe2 = unsafe5;
                                    i39 = i23;
                                    i14 = i12;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i20;
                                    unsafe = unsafe2;
                                    i29 = i39;
                                    i13 = i19;
                                    i30 = i15;
                                    if (i29 != i14) {
                                    }
                                    z zVar222222222 = (z) obj2;
                                    b1Var = zVar222222222.zzjp;
                                    if (b1Var == b1Var2) {
                                    }
                                    int i44222222222 = i29;
                                    int c10222222222 = l1.c(i44222222222, bArr, i16, i11, b1Var, mVar);
                                    i29 = i44222222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i25 = i11;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i26 = -1;
                                    i27 = c10222222222;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            case 12:
                                bArr3 = bArr;
                                mVar2 = mVar;
                                unsafe5 = unsafe6;
                                i24 = i11;
                                if (i36 == 0) {
                                    i27 = l1.f(bArr3, i34, mVar2);
                                    int i49 = mVar2.a;
                                    b0 u10 = q0Var2.u(w10);
                                    if (u10 == null || u10.a(i49) != null) {
                                        i23 = i39;
                                        unsafe5.putInt(obj3, j10, i49);
                                        int i4622222 = i19;
                                        i30 = i15 | i41;
                                        bArr4 = bArr3;
                                        i28 = i4622222;
                                        int i4722222 = i24;
                                        unsafe6 = unsafe5;
                                        i25 = i4722222;
                                        mVar4 = mVar2;
                                        i29 = i23;
                                        break;
                                    } else {
                                        z zVar3 = (z) obj3;
                                        b1 b1Var3 = zVar3.zzjp;
                                        if (b1Var3 == b1Var2) {
                                            b1Var3 = b1.b();
                                            zVar3.zzjp = b1Var3;
                                        }
                                        b1Var3.a(i39, Long.valueOf(i49));
                                        unsafe6 = unsafe5;
                                        i25 = i24;
                                        mVar4 = mVar2;
                                        i29 = i39;
                                        bArr4 = bArr3;
                                        i28 = i19;
                                        i30 = i15;
                                        break;
                                    }
                                } else {
                                    i20 = i34;
                                    unsafe2 = unsafe5;
                                    i14 = i12;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i20;
                                    unsafe = unsafe2;
                                    i29 = i39;
                                    i13 = i19;
                                    i30 = i15;
                                    if (i29 != i14) {
                                    }
                                    z zVar2222222222 = (z) obj2;
                                    b1Var = zVar2222222222.zzjp;
                                    if (b1Var == b1Var2) {
                                    }
                                    int i442222222222 = i29;
                                    int c102222222222 = l1.c(i442222222222, bArr, i16, i11, b1Var, mVar);
                                    i29 = i442222222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i25 = i11;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i26 = -1;
                                    i27 = c102222222222;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            case 15:
                                mVar3 = mVar;
                                unsafe4 = unsafe6;
                                if (i36 == 0) {
                                    i27 = l1.f(bArr, i34, mVar3);
                                    int i50 = mVar3.a;
                                    unsafe4.putInt(obj3, j10, (-(i50 & 1)) ^ (i50 >>> 1));
                                    int i51 = i19;
                                    i30 = i15 | i41;
                                    bArr4 = bArr;
                                    i28 = i51;
                                    unsafe6 = unsafe4;
                                    mVar4 = mVar3;
                                    i29 = i39;
                                    i25 = i11;
                                    break;
                                } else {
                                    i20 = i34;
                                    unsafe2 = unsafe4;
                                    i14 = i12;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i20;
                                    unsafe = unsafe2;
                                    i29 = i39;
                                    i13 = i19;
                                    i30 = i15;
                                    if (i29 != i14) {
                                    }
                                    z zVar22222222222 = (z) obj2;
                                    b1Var = zVar22222222222.zzjp;
                                    if (b1Var == b1Var2) {
                                    }
                                    int i4422222222222 = i29;
                                    int c1022222222222 = l1.c(i4422222222222, bArr, i16, i11, b1Var, mVar);
                                    i29 = i4422222222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i25 = i11;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i26 = -1;
                                    i27 = c1022222222222;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            case 16:
                                mVar3 = mVar;
                                if (i36 == 0) {
                                    int m11 = l1.m(bArr, i34, mVar3);
                                    long j11 = mVar3.b;
                                    Unsafe unsafe7 = unsafe6;
                                    unsafe7.putLong(obj3, j10, (j11 >>> i17) ^ (-(j11 & 1)));
                                    int i52 = i19;
                                    i30 = i15 | i41;
                                    bArr4 = bArr;
                                    i28 = i52;
                                    unsafe6 = unsafe7;
                                    i27 = m11;
                                    mVar4 = mVar3;
                                    i29 = i39;
                                    i25 = i11;
                                    break;
                                } else {
                                    i20 = i34;
                                    unsafe2 = unsafe6;
                                    i14 = i12;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i20;
                                    unsafe = unsafe2;
                                    i29 = i39;
                                    i13 = i19;
                                    i30 = i15;
                                    if (i29 != i14) {
                                    }
                                    z zVar222222222222 = (z) obj2;
                                    b1Var = zVar222222222222.zzjp;
                                    if (b1Var == b1Var2) {
                                    }
                                    int i44222222222222 = i29;
                                    int c10222222222222 = l1.c(i44222222222222, bArr, i16, i11, b1Var, mVar);
                                    i29 = i44222222222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i25 = i11;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i26 = -1;
                                    i27 = c10222222222222;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            case 17:
                                if (i36 == 3) {
                                    i27 = i(q0Var2.s(w10), bArr, i34, i11, (i35 << 3) | 4, mVar);
                                    unsafe6.putObject(obj3, j10, (i15 & i41) == 0 ? mVar.c : a0.a(unsafe6.getObject(obj3, j10), mVar.c));
                                    int i53 = i19;
                                    i30 = i15 | i41;
                                    bArr4 = bArr;
                                    i28 = i53;
                                    i25 = i11;
                                    mVar4 = mVar;
                                    i29 = i39;
                                    break;
                                } else {
                                    i20 = i34;
                                    unsafe2 = unsafe6;
                                    i14 = i12;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i20;
                                    unsafe = unsafe2;
                                    i29 = i39;
                                    i13 = i19;
                                    i30 = i15;
                                    if (i29 != i14) {
                                    }
                                    z zVar2222222222222 = (z) obj2;
                                    b1Var = zVar2222222222222.zzjp;
                                    if (b1Var == b1Var2) {
                                    }
                                    int i442222222222222 = i29;
                                    int c102222222222222 = l1.c(i442222222222222, bArr, i16, i11, b1Var, mVar);
                                    i29 = i442222222222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i25 = i11;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i26 = -1;
                                    i27 = c102222222222222;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            default:
                                i20 = i34;
                                unsafe2 = unsafe6;
                                i14 = i12;
                                q0Var = q0Var2;
                                obj2 = obj3;
                                i16 = i20;
                                unsafe = unsafe2;
                                i29 = i39;
                                i13 = i19;
                                i30 = i15;
                                if (i29 != i14) {
                                }
                                z zVar22222222222222 = (z) obj2;
                                b1Var = zVar22222222222222.zzjp;
                                if (b1Var == b1Var2) {
                                }
                                int i4422222222222222 = i29;
                                int c1022222222222222 = l1.c(i4422222222222222, bArr, i16, i11, b1Var, mVar);
                                i29 = i4422222222222222;
                                bArr4 = bArr;
                                mVar4 = mVar;
                                i25 = i11;
                                q0Var2 = q0Var;
                                unsafe6 = unsafe;
                                i26 = -1;
                                i27 = c1022222222222222;
                                obj3 = obj2;
                                i28 = i13;
                                break;
                        }
                    } else {
                        iArr = iArr2;
                        Unsafe unsafe8 = unsafe6;
                        if (i38 != 27) {
                            i34 = i34;
                            if (i38 <= 49) {
                                i15 = i30;
                                unsafe = unsafe8;
                                i29 = i39;
                                i13 = i28;
                                l4 = q0Var2.l(obj, bArr, i34, i11, i29, i35, i36, w10, i37, i38, j10, mVar);
                                if (l4 == i34) {
                                    q0Var = q0Var2;
                                    obj2 = obj;
                                } else {
                                    i25 = i11;
                                    mVar4 = mVar;
                                    obj3 = obj;
                                    i27 = l4;
                                    i28 = i13;
                                    i30 = i15;
                                    unsafe6 = unsafe;
                                    i26 = -1;
                                    bArr4 = bArr;
                                }
                            } else {
                                unsafe = unsafe8;
                                i15 = i30;
                                i29 = i39;
                                i13 = i28;
                                if (i38 != 50) {
                                    l4 = q0Var2.k(obj, bArr, i34, i11, i29, i35, i36, i37, i38, j10, w10, mVar);
                                    q0Var = q0Var2;
                                    obj2 = obj;
                                    if (l4 != i34) {
                                        bArr4 = bArr;
                                        i25 = i11;
                                        mVar4 = mVar;
                                        i27 = l4;
                                        q0Var2 = q0Var;
                                        obj3 = obj2;
                                        i28 = i13;
                                        i30 = i15;
                                        unsafe6 = unsafe;
                                        i26 = -1;
                                    }
                                } else {
                                    if (i36 == 2) {
                                        q0Var2.p(j10, obj, w10);
                                        throw null;
                                    }
                                    q0Var = q0Var2;
                                    obj2 = obj;
                                }
                            }
                            i16 = l4;
                            i30 = i15;
                            i14 = i12;
                        } else if (i36 == 2) {
                            c0 c0Var = (c0) unsafe8.getObject(obj3, j10);
                            if (!((k) c0Var).a) {
                                int size = c0Var.size();
                                c0Var = c0Var.f(size == 0 ? 10 : size << 1);
                                unsafe8.putObject(obj3, j10, c0Var);
                            }
                            unsafe6 = unsafe8;
                            obj3 = obj;
                            i25 = i11;
                            mVar4 = mVar;
                            i27 = h(q0Var2.s(w10), i39, bArr, i34, i11, c0Var, mVar);
                            i29 = i39;
                            i26 = -1;
                            bArr4 = bArr;
                        } else {
                            q0Var = q0Var2;
                            unsafe = unsafe8;
                            i15 = i30;
                            i34 = i34;
                            i29 = i39;
                            i13 = i28;
                            obj2 = obj;
                        }
                        if (i29 != i14) {
                        }
                        z zVar222222222222222 = (z) obj2;
                        b1Var = zVar222222222222222.zzjp;
                        if (b1Var == b1Var2) {
                        }
                        int i44222222222222222 = i29;
                        int c10222222222222222 = l1.c(i44222222222222222, bArr, i16, i11, b1Var, mVar);
                        i29 = i44222222222222222;
                        bArr4 = bArr;
                        mVar4 = mVar;
                        i25 = i11;
                        q0Var2 = q0Var;
                        unsafe6 = unsafe;
                        i26 = -1;
                        i27 = c10222222222222222;
                        obj3 = obj2;
                        i28 = i13;
                    }
                } else {
                    q0Var = q0Var2;
                    iArr = iArr2;
                    i13 = i28;
                    unsafe = unsafe6;
                    i15 = i30;
                    i29 = i33;
                    obj2 = obj3;
                }
                i14 = i12;
                i16 = i34;
                i30 = i15;
                if (i29 != i14) {
                }
                z zVar2222222222222222 = (z) obj2;
                b1Var = zVar2222222222222222.zzjp;
                if (b1Var == b1Var2) {
                }
                int i442222222222222222 = i29;
                int c102222222222222222 = l1.c(i442222222222222222, bArr, i16, i11, b1Var, mVar);
                i29 = i442222222222222222;
                bArr4 = bArr;
                mVar4 = mVar;
                i25 = i11;
                q0Var2 = q0Var;
                unsafe6 = unsafe;
                i26 = -1;
                i27 = c102222222222222222;
                obj3 = obj2;
                i28 = i13;
            } else {
                q0Var = q0Var2;
                iArr = iArr2;
                i13 = i28;
                unsafe = unsafe6;
                i14 = i12;
                obj2 = obj3;
            }
        }
        int i54 = i13;
        if (i54 != i26) {
            unsafe.putInt(obj2, i54, i30);
        }
        int[] iArr3 = q0Var.i;
        if (iArr3 != null) {
            for (int i55 : iArr3) {
                int i56 = iArr[i55];
                Object k10 = i1.k(obj2, q0Var.v(i55) & 1048575);
                if (k10 != null && q0Var.u(i55) != null) {
                    q0Var.n.getClass();
                    q0Var.t(i55);
                    throw new NoSuchMethodError();
                }
            }
        }
        if (i14 == 0) {
            if (i27 != i25) {
                throw d0.b();
            }
        } else if (i27 > i25 || i29 != i14) {
            throw d0.b();
        }
        return i27;
    }

    public final void o(int i10, Object obj, Object obj2) {
        long v = v(i10) & 1048575;
        if (r(i10, obj2)) {
            Object k10 = i1.k(obj, v);
            Object k11 = i1.k(obj2, v);
            if (k10 != null && k11 != null) {
                k11 = a0.a(k10, k11);
            } else if (k11 == null) {
                return;
            }
            i1.d(obj, v, k11);
            x(i10, obj);
        }
    }

    public final void p(long j10, Object obj, int i10) {
        m0 m0Var;
        Unsafe unsafe = o;
        t(i10);
        Object object = unsafe.getObject(obj, j10);
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
            unsafe.putObject(obj, j10, m0Var);
        }
        throw new NoSuchMethodError();
    }

    public final boolean q(int i10, int i11, Object obj) {
        return i1.d.g(obj, (long) (this.a[i11 + 2] & 1048575)) == i10;
    }

    public final boolean r(int i10, Object obj) {
        if (this.g) {
            int v = v(i10);
            long j10 = v & 1048575;
            switch ((v & 267386880) >>> 20) {
                case 0:
                    if (i1.d.k(obj, j10) == 0.0d) {
                        return false;
                    }
                    break;
                case 1:
                    if (i1.d.j(obj, j10) == 0.0f) {
                        return false;
                    }
                    break;
                case 2:
                    if (i1.d.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (i1.d.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (i1.d.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (i1.d.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (i1.d.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return i1.d.i(obj, j10);
                case 8:
                    Object k10 = i1.k(obj, j10);
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
                    if (i1.k(obj, j10) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (o.c.equals(i1.k(obj, j10))) {
                        return false;
                    }
                    break;
                case 11:
                    if (i1.d.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (i1.d.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (i1.d.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (i1.d.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (i1.d.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (i1.d.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (i1.k(obj, j10) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((i1.d.g(obj, r6 & 1048575) & (1 << (this.a[i10 + 2] >>> 20))) == 0) {
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

    public final b0 u(int i10) {
        return (b0) this.b[((i10 / 4) << 1) + 1];
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
        long j10 = i11 & 1048575;
        i1.b(j10, obj, i1.d.g(obj, j10) | (1 << (i11 >>> 20)));
    }

    public final void y(int i10, Object obj, Object obj2) {
        int i11;
        int v = v(i10);
        int[] iArr = this.a;
        int i12 = iArr[i10];
        long j10 = v & 1048575;
        if (q(i12, i10, obj2)) {
            Object k10 = i1.k(obj, j10);
            Object k11 = i1.k(obj2, j10);
            if (k10 != null && k11 != null) {
                i1.d(obj, j10, a0.a(k10, k11));
                i11 = iArr[i10 + 2];
            } else {
                if (k11 == null) {
                    return;
                }
                i1.d(obj, j10, k11);
                i11 = iArr[i10 + 2];
            }
            i1.b(i11 & 1048575, obj, i12);
        }
    }

    public final boolean z(z zVar, Object obj, int i10) {
        return r(i10, zVar) == r(i10, obj);
    }
}
