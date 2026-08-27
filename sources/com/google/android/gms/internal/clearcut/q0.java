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
public final class q0 implements b1 {
    public static final Unsafe o = l1.f();
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
    public final e1 m;
    public final n0 n;

    public q0(int[] iArr, Object[] objArr, int i10, int i11, int i12, j jVar, boolean z10, int[] iArr2, int[] iArr3, int[] iArr4, s0 s0Var, h0 h0Var, e1 e1Var, r rVar, n0 n0Var) {
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
        this.m = e1Var;
        this.f = jVar;
        this.n = n0Var;
    }

    public static int A(Object obj, long j10) {
        return ((Integer) l1.k(obj, j10)).intValue();
    }

    public static long B(Object obj, long j10) {
        return ((Long) l1.k(obj, j10)).longValue();
    }

    public static int h(b1 b1Var, int i10, byte[] bArr, int i11, int i12, c0 c0Var, m mVar) {
        int j10 = j(b1Var, bArr, i11, i12, mVar);
        while (true) {
            c0Var.add(mVar.c);
            if (j10 >= i12) {
                break;
            }
            int f10 = o1.f(bArr, j10, mVar);
            if (i10 != mVar.a) {
                break;
            }
            j10 = j(b1Var, bArr, f10, i12, mVar);
        }
        return j10;
    }

    public static int i(b1 b1Var, byte[] bArr, int i10, int i11, int i12, m mVar) {
        q0 q0Var = (q0) b1Var;
        Object a2 = q0Var.a();
        int m10 = q0Var.m(a2, bArr, i10, i11, i12, mVar);
        q0Var.b(a2);
        mVar.c = a2;
        return m10;
    }

    public static int j(b1 b1Var, byte[] bArr, int i10, int i11, m mVar) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = o1.d(i13, bArr, i12, mVar);
            i13 = mVar.a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw d0.a();
        }
        Object a2 = b1Var.a();
        int i15 = i14 + i13;
        b1Var.f(a2, bArr, i14, i15, mVar);
        b1Var.b(a2);
        mVar.c = a2;
        return i15;
    }

    public static q0 n(y0 y0Var, s0 s0Var, h0 h0Var, e1 e1Var, r rVar, n0 n0Var) {
        int i10;
        int i11;
        int i12;
        int[] iArr;
        u uVar;
        int i13;
        int i14;
        int i15;
        Field b10;
        Field b11;
        Field b12;
        if (!(y0Var instanceof y0)) {
            y0Var.getClass();
            throw new ClassCastException();
        }
        z0 z0Var = y0Var.b;
        boolean z10 = (z0Var.d & 1) != 1;
        if (z0Var.e == 0) {
            i10 = 0;
            i11 = 0;
            i12 = 0;
        } else {
            int i16 = z0Var.g;
            int i17 = z0Var.h;
            i10 = z0Var.k;
            i11 = i16;
            i12 = i17;
        }
        int[] iArr2 = new int[i10 << 2];
        Object[] objArr = new Object[i10 << 1];
        int i18 = z0Var.i;
        int[] iArr3 = i18 > 0 ? new int[i18] : null;
        int i19 = z0Var.l;
        int[] iArr4 = i19 > 0 ? new int[i19] : null;
        boolean a2 = z0Var.a();
        Class cls = z0Var.c;
        Object[] objArr2 = z0Var.b;
        if (a2) {
            int i20 = z0Var.s;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            while (true) {
                if (i20 >= z0Var.j || i21 >= ((i20 - i11) << 2)) {
                    int i24 = z0Var.u;
                    u uVar2 = u.s;
                    if (i24 > uVar2.a) {
                        int i25 = z0Var.v << 1;
                        Object obj = objArr2[i25];
                        iArr = iArr2;
                        if (obj instanceof Field) {
                            b11 = (Field) obj;
                        } else {
                            b11 = z0.b(cls, (String) obj);
                            objArr2[i25] = b11;
                        }
                        k1 k1Var = l1.d;
                        uVar = uVar2;
                        i13 = (int) k1Var.a(b11);
                        int i26 = (z0Var.v << 1) + 1;
                        Object obj2 = objArr2[i26];
                        if (obj2 instanceof Field) {
                            b12 = (Field) obj2;
                        } else {
                            b12 = z0.b(cls, (String) obj2);
                            objArr2[i26] = b12;
                        }
                        i15 = (int) k1Var.a(b12);
                        i14 = 0;
                    } else {
                        iArr = iArr2;
                        uVar = uVar2;
                        Field field = z0Var.x;
                        k1 k1Var2 = l1.d;
                        int a3 = (int) k1Var2.a(field);
                        if ((z0Var.d & 1) != 1 || z0Var.u > u.d.a) {
                            i13 = a3;
                            i14 = 0;
                            i15 = 0;
                        } else {
                            int i27 = (z0Var.w / 32) + (z0Var.f << 1);
                            Object obj3 = objArr2[i27];
                            if (obj3 instanceof Field) {
                                b10 = (Field) obj3;
                            } else {
                                b10 = z0.b(cls, (String) obj3);
                                objArr2[i27] = b10;
                            }
                            i15 = (int) k1Var2.a(b10);
                            i14 = z0Var.w % 32;
                            i13 = a3;
                        }
                    }
                    iArr[i21] = z0Var.s;
                    int i28 = i21 + 1;
                    int i29 = i14;
                    int i30 = z0Var.t;
                    int i31 = i15;
                    int i32 = ((i30 & 256) != 0 ? TLObject.FLAG_28 : 0) | ((i30 & 512) != 0 ? TLObject.FLAG_29 : 0);
                    int i33 = z0Var.u;
                    iArr[i28] = i32 | (i33 << 20) | i13;
                    iArr[i21 + 2] = (i29 << 20) | i31;
                    Object obj4 = z0Var.A;
                    if (obj4 != null) {
                        int i34 = (i21 / 4) << 1;
                        objArr[i34] = obj4;
                        Object obj5 = z0Var.y;
                        if (obj5 != null) {
                            objArr[i34 + 1] = obj5;
                        } else {
                            Object obj6 = z0Var.z;
                            if (obj6 != null) {
                                objArr[i34 + 1] = obj6;
                            }
                        }
                    } else {
                        Object obj7 = z0Var.y;
                        if (obj7 != null) {
                            objArr[((i21 / 4) << 1) + 1] = obj7;
                        } else {
                            Object obj8 = z0Var.z;
                            if (obj8 != null) {
                                objArr[((i21 / 4) << 1) + 1] = obj8;
                            }
                        }
                    }
                    if (i33 == uVar.ordinal()) {
                        iArr3[i22] = i21;
                        i22++;
                    } else if (i33 >= 18 && i33 <= 49) {
                        iArr4[i23] = iArr[i28] & 1048575;
                        i23++;
                    }
                    if (!z0Var.a()) {
                        break;
                    }
                    i20 = z0Var.s;
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
        return new q0(iArr, objArr, i11, i12, z0Var.j, y0Var.a, z10, z0Var.m, iArr3, iArr4, s0Var, h0Var, e1Var, rVar, n0Var);
    }

    @Override // com.google.android.gms.internal.clearcut.b1
    public final Object a() {
        this.k.getClass();
        return ((z) this.f).a(4);
    }

    @Override // com.google.android.gms.internal.clearcut.b1
    public final void b(Object obj) {
        int[] iArr = this.i;
        if (iArr != null) {
            for (int i10 : iArr) {
                long v = v(i10) & 1048575;
                Object k10 = l1.k(obj, v);
                if (k10 != null) {
                    this.n.getClass();
                    ((m0) k10).a = false;
                    l1.d(obj, v, k10);
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
    @Override // com.google.android.gms.internal.clearcut.b1
    public final void c(z zVar, z zVar2) {
        z zVar3;
        k1 k1Var;
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
                c1.a(this.m, zVar4, zVar2);
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
                        k1 k1Var2 = l1.d;
                        k1Var2.c(zVar3, j10, k1Var2.k(zVar2, j10));
                        x(i11, zVar3);
                        break;
                    }
                case 1:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    } else {
                        k1 k1Var3 = l1.d;
                        k1Var3.d(zVar3, j10, k1Var3.j(zVar2, j10));
                        x(i11, zVar3);
                        break;
                    }
                case 2:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    }
                    k1Var = l1.d;
                    h = k1Var.h(zVar2, j10);
                    k1Var.e(zVar3, j10, h);
                    x(i11, zVar3);
                    break;
                case 3:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    }
                    k1Var = l1.d;
                    h = k1Var.h(zVar2, j10);
                    k1Var.e(zVar3, j10, h);
                    x(i11, zVar3);
                    break;
                case 4:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    }
                    l1.b(j10, zVar3, l1.d.g(zVar2, j10));
                    x(i11, zVar3);
                    break;
                case 5:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    }
                    k1Var = l1.d;
                    h = k1Var.h(zVar2, j10);
                    k1Var.e(zVar3, j10, h);
                    x(i11, zVar3);
                    break;
                case 6:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    }
                    l1.b(j10, zVar3, l1.d.g(zVar2, j10));
                    x(i11, zVar3);
                    break;
                case 7:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    } else {
                        k1 k1Var4 = l1.d;
                        k1Var4.f(zVar3, j10, k1Var4.i(zVar2, j10));
                        x(i11, zVar3);
                        break;
                    }
                case 8:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    }
                    l1.d(zVar3, j10, l1.k(zVar2, j10));
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
                    l1.d(zVar3, j10, l1.k(zVar2, j10));
                    x(i11, zVar3);
                    break;
                case 11:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    }
                    l1.b(j10, zVar3, l1.d.g(zVar2, j10));
                    x(i11, zVar3);
                    break;
                case 12:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    }
                    l1.b(j10, zVar3, l1.d.g(zVar2, j10));
                    x(i11, zVar3);
                    break;
                case 13:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    }
                    l1.b(j10, zVar3, l1.d.g(zVar2, j10));
                    x(i11, zVar3);
                    break;
                case 14:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    }
                    k1Var = l1.d;
                    h = k1Var.h(zVar2, j10);
                    k1Var.e(zVar3, j10, h);
                    x(i11, zVar3);
                    break;
                case 15:
                    zVar3 = zVar;
                    if (!r(i11, zVar2)) {
                        break;
                    }
                    l1.b(j10, zVar3, l1.d.g(zVar2, j10));
                    x(i11, zVar3);
                    break;
                case 16:
                    if (r(i11, zVar2)) {
                        k1Var = l1.d;
                        h = k1Var.h(zVar2, j10);
                        zVar3 = zVar;
                        k1Var.e(zVar3, j10, h);
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
                    Class cls = c1.a;
                    Object k10 = l1.k(zVar, j10);
                    Object k11 = l1.k(zVar2, j10);
                    this.n.getClass();
                    l1.d(zVar, j10, n0.a(k10, k11));
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
                        l1.d(zVar, j10, l1.k(zVar2, j10));
                        i10 = iArr[i11 + 2];
                        l1.b(i10 & 1048575, zVar, i12);
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
                        l1.d(zVar, j10, l1.k(zVar2, j10));
                        i10 = iArr[i11 + 2];
                        l1.b(i10 & 1048575, zVar, i12);
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
    
        if (com.google.android.gms.internal.clearcut.c1.c(com.google.android.gms.internal.clearcut.l1.k(r12, r7), com.google.android.gms.internal.clearcut.l1.k(r13, r7)) != false) goto L104;
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
    
        if (com.google.android.gms.internal.clearcut.c1.c(com.google.android.gms.internal.clearcut.l1.k(r12, r7), com.google.android.gms.internal.clearcut.l1.k(r13, r7)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0102, code lost:
    
        if (com.google.android.gms.internal.clearcut.c1.c(com.google.android.gms.internal.clearcut.l1.k(r12, r7), com.google.android.gms.internal.clearcut.l1.k(r13, r7)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0118, code lost:
    
        if (com.google.android.gms.internal.clearcut.c1.c(com.google.android.gms.internal.clearcut.l1.k(r12, r7), com.google.android.gms.internal.clearcut.l1.k(r13, r7)) != false) goto L104;
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
    
        if (com.google.android.gms.internal.clearcut.c1.c(com.google.android.gms.internal.clearcut.l1.k(r12, r7), com.google.android.gms.internal.clearcut.l1.k(r13, r7)) != false) goto L104;
     */
    @Override // com.google.android.gms.internal.clearcut.b1
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
                            k1 k1Var = l1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 1:
                        if (z(zVar, zVar2, i10)) {
                            k1 k1Var2 = l1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 2:
                        if (z(zVar, zVar2, i10)) {
                            k1 k1Var3 = l1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 3:
                        if (z(zVar, zVar2, i10)) {
                            k1 k1Var4 = l1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 4:
                        if (z(zVar, zVar2, i10)) {
                            k1 k1Var5 = l1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 5:
                        if (z(zVar, zVar2, i10)) {
                            k1 k1Var6 = l1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 6:
                        if (z(zVar, zVar2, i10)) {
                            k1 k1Var7 = l1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 7:
                        if (z(zVar, zVar2, i10)) {
                            k1 k1Var8 = l1.d;
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
                            k1 k1Var9 = l1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 12:
                        if (z(zVar, zVar2, i10)) {
                            k1 k1Var10 = l1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 13:
                        if (z(zVar, zVar2, i10)) {
                            k1 k1Var11 = l1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 14:
                        if (z(zVar, zVar2, i10)) {
                            k1 k1Var12 = l1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 15:
                        if (z(zVar, zVar2, i10)) {
                            k1 k1Var13 = l1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 16:
                        if (z(zVar, zVar2, i10)) {
                            k1 k1Var14 = l1.d;
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
                        z10 = c1.c(l1.k(zVar, j10), l1.k(zVar2, j10));
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
                        k1 k1Var15 = l1.d;
                        if (k1Var15.g(zVar, j11) == k1Var15.g(zVar2, j11)) {
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
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00af, code lost:
    
        r3 = r8 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x015e, code lost:
    
        if (r4 != false) goto L44;
     */
    @Override // com.google.android.gms.internal.clearcut.b1
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
                    doubleToLongBits = Double.doubleToLongBits(l1.d.k(zVar, j10));
                    floatToIntBits = a0.b(doubleToLongBits);
                    i12 = floatToIntBits + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    floatToIntBits = Float.floatToIntBits(l1.d.j(zVar, j10));
                    i12 = floatToIntBits + i10;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i10 = i12 * 53;
                    doubleToLongBits = l1.d.h(zVar, j10);
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
                    floatToIntBits = l1.d.g(zVar, j10);
                    i12 = floatToIntBits + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean i17 = l1.d.i(zVar, j10);
                    Charset charset = a0.a;
                    break;
                case 8:
                    i10 = i12 * 53;
                    floatToIntBits = ((String) l1.k(zVar, j10)).hashCode();
                    i12 = floatToIntBits + i10;
                    break;
                case 9:
                    Object k11 = l1.k(zVar, j10);
                    if (k11 != null) {
                        i16 = k11.hashCode();
                    }
                    i12 = (i12 * 53) + i16;
                    break;
                case 10:
                    i10 = i12 * 53;
                    floatToIntBits = l1.k(zVar, j10).hashCode();
                    i12 = floatToIntBits + i10;
                    break;
                case 17:
                    Object k12 = l1.k(zVar, j10);
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
                    k10 = l1.k(zVar, j10);
                    floatToIntBits = k10.hashCode();
                    i12 = floatToIntBits + i10;
                    break;
                case 51:
                    if (q(i14, i13, zVar)) {
                        i10 = i12 * 53;
                        doubleToLongBits2 = Double.doubleToLongBits(((Double) l1.k(zVar, j10)).doubleValue());
                        floatToIntBits = a0.b(doubleToLongBits2);
                        i12 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(i14, i13, zVar)) {
                        i10 = i12 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) l1.k(zVar, j10)).floatValue());
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
                        boolean booleanValue = ((Boolean) l1.k(zVar, j10)).booleanValue();
                        Charset charset2 = a0.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(i14, i13, zVar)) {
                        i10 = i12 * 53;
                        floatToIntBits = ((String) l1.k(zVar, j10)).hashCode();
                        i12 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (!q(i14, i13, zVar)) {
                        break;
                    }
                    k10 = l1.k(zVar, j10);
                    i10 = i12 * 53;
                    floatToIntBits = k10.hashCode();
                    i12 = floatToIntBits + i10;
                    break;
                case 61:
                    if (!q(i14, i13, zVar)) {
                        break;
                    }
                    i10 = i12 * 53;
                    k10 = l1.k(zVar, j10);
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
                    k10 = l1.k(zVar, j10);
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
    @Override // com.google.android.gms.internal.clearcut.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Object obj, byte[] bArr, int i10, int i11, m mVar) {
        Unsafe unsafe;
        int i12;
        int i13;
        d1 d1Var;
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
                i17 = o1.d(i18, bArr2, i17, mVar2);
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
                                d1Var = zVar.zzjp;
                                if (d1Var == d1.e) {
                                    d1Var = d1.b();
                                    zVar.zzjp = d1Var;
                                }
                                i16 = o1.c(i19, bArr, i13, i11, d1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i15 = i11;
                                break;
                            } else {
                                l1.d.c(obj, j10, Double.longBitsToDouble(o1.r(i20, bArr2)));
                                i16 = i20 + 8;
                                break;
                            }
                        case 1:
                            unsafe = unsafe3;
                            if (i22 == 5) {
                                l1.d.d(obj, j10, Float.intBitsToFloat(o1.o(i20, bArr2)));
                                i16 = i20 + 4;
                                break;
                            }
                            i12 = i20;
                            i13 = i12;
                            z zVar2 = (z) obj;
                            d1Var = zVar2.zzjp;
                            if (d1Var == d1.e) {
                            }
                            i16 = o1.c(i19, bArr, i13, i11, d1Var, mVar);
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
                                d1Var = zVar22.zzjp;
                                if (d1Var == d1.e) {
                                }
                                i16 = o1.c(i19, bArr, i13, i11, d1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i15 = i11;
                                break;
                            } else {
                                int m10 = o1.m(bArr2, i20, mVar2);
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
                                d1Var = zVar222.zzjp;
                                if (d1Var == d1.e) {
                                }
                                i16 = o1.c(i19, bArr, i13, i11, d1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i15 = i11;
                                break;
                            } else {
                                i16 = o1.f(bArr2, i20, mVar2);
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
                                d1Var = zVar2222.zzjp;
                                if (d1Var == d1.e) {
                                }
                                i16 = o1.c(i19, bArr, i13, i11, d1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i15 = i11;
                                break;
                            } else {
                                unsafe2.putLong(obj, j10, o1.r(i20, bArr2));
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
                                d1Var = zVar22222.zzjp;
                                if (d1Var == d1.e) {
                                }
                                i16 = o1.c(i19, bArr, i13, i11, d1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i15 = i11;
                                break;
                            } else {
                                unsafe2.putInt(obj, j10, o1.o(i20, bArr2));
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
                                d1Var = zVar222222.zzjp;
                                if (d1Var == d1.e) {
                                }
                                i16 = o1.c(i19, bArr, i13, i11, d1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i15 = i11;
                                break;
                            } else {
                                i16 = o1.m(bArr2, i20, mVar2);
                                l1.d.f(obj, j10, mVar2.b != 0);
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
                                d1Var = zVar2222222.zzjp;
                                if (d1Var == d1.e) {
                                }
                                i16 = o1.c(i19, bArr, i13, i11, d1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i15 = i11;
                                break;
                            } else {
                                if ((536870912 & i23) == 0) {
                                    i16 = o1.f(bArr2, i20, mVar2);
                                    int i25 = mVar2.a;
                                    if (i25 == 0) {
                                        mVar2.c = "";
                                    } else {
                                        mVar2.c = new String(bArr2, i16, i25, a0.a);
                                        i16 += i25;
                                    }
                                } else {
                                    i16 = o1.q(bArr2, i20, mVar2);
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
                                d1Var = zVar22222222.zzjp;
                                if (d1Var == d1.e) {
                                }
                                i16 = o1.c(i19, bArr, i13, i11, d1Var, mVar);
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
                                d1Var = zVar222222222.zzjp;
                                if (d1Var == d1.e) {
                                }
                                i16 = o1.c(i19, bArr, i13, i11, d1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i15 = i11;
                                break;
                            } else {
                                i16 = o1.s(bArr2, i20, mVar2);
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
                                d1Var = zVar2222222222.zzjp;
                                if (d1Var == d1.e) {
                                }
                                i16 = o1.c(i19, bArr, i13, i11, d1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i15 = i11;
                                break;
                            } else {
                                i16 = o1.f(bArr2, i20, mVar2);
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
                                d1Var = zVar22222222222.zzjp;
                                if (d1Var == d1.e) {
                                }
                                i16 = o1.c(i19, bArr, i13, i11, d1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i15 = i11;
                                break;
                            } else {
                                i16 = o1.f(bArr2, i20, mVar2);
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
                                d1Var = zVar222222222222.zzjp;
                                if (d1Var == d1.e) {
                                }
                                i16 = o1.c(i19, bArr, i13, i11, d1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i15 = i11;
                                break;
                            } else {
                                int m11 = o1.m(bArr2, i20, mVar2);
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
                                c0Var = c0Var.d(size == 0 ? 10 : size << 1);
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
                            d1Var = zVar2222222222222.zzjp;
                            if (d1Var == d1.e) {
                            }
                            i16 = o1.c(i19, bArr, i13, i11, d1Var, mVar);
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
                            d1Var = zVar22222222222222.zzjp;
                            if (d1Var == d1.e) {
                            }
                            i16 = o1.c(i19, bArr, i13, i11, d1Var, mVar);
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
                            d1Var = zVar222222222222222.zzjp;
                            if (d1Var == d1.e) {
                            }
                            i16 = o1.c(i19, bArr, i13, i11, d1Var, mVar);
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
            d1Var = zVar2222222222222222.zzjp;
            if (d1Var == d1.e) {
            }
            i16 = o1.c(i19, bArr, i13, i11, d1Var, mVar);
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

    @Override // com.google.android.gms.internal.clearcut.b1
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
                if ((z10 ? r(w10, obj) : (i14 & i10) != 0) && !s(w10).g(l1.k(obj, v & 1048575))) {
                    return false;
                }
                i13++;
                iArr2 = iArr;
                i11 = 1;
            } else {
                if (i18 != 27) {
                    if (i18 == 60 || i18 == 68) {
                        if (q(i15, w10, obj) && !s(w10).g(l1.k(obj, v & 1048575))) {
                            return false;
                        }
                    } else if (i18 != 49) {
                        if (i18 != 50) {
                            continue;
                        } else {
                            Object k10 = l1.k(obj, v & 1048575);
                            this.n.getClass();
                            if (!((m0) k10).isEmpty()) {
                                t(w10);
                                throw new NoSuchMethodError();
                            }
                        }
                    }
                    i13++;
                    iArr2 = iArr;
                    i11 = 1;
                }
                List list = (List) l1.k(obj, v & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    b1 s10 = s(w10);
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
                valueOf = Double.valueOf(Double.longBitsToDouble(o1.r(i18, bArr)));
                unsafe.putObject(obj, j10, valueOf);
                m10 = i18 + 8;
                unsafe.putInt(obj, j12, i13);
                return m10;
            case 52:
                i19 = i10;
                if (i14 != 5) {
                    return i19;
                }
                valueOf2 = Float.valueOf(Float.intBitsToFloat(o1.o(i19, bArr)));
                unsafe.putObject(obj, j10, valueOf2);
                m10 = i19 + 4;
                unsafe.putInt(obj, j12, i13);
                return m10;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                m10 = o1.m(bArr, i10, mVar);
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
                m10 = o1.f(bArr, i10, mVar);
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
                valueOf = Long.valueOf(o1.r(i18, bArr));
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
                valueOf2 = Integer.valueOf(o1.o(i19, bArr));
                unsafe.putObject(obj, j10, valueOf2);
                m10 = i19 + 4;
                unsafe.putInt(obj, j12, i13);
                return m10;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                m10 = o1.m(bArr, i10, mVar);
                valueOf3 = Boolean.valueOf(mVar.b != 0);
                unsafe.putObject(obj, j10, valueOf3);
                unsafe.putInt(obj, j12, i13);
                return m10;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int f10 = o1.f(bArr, i10, mVar);
                int i21 = mVar.a;
                if (i21 == 0) {
                    unsafe.putObject(obj, j10, "");
                } else {
                    if ((i15 & TLObject.FLAG_29) != 0) {
                        if (!n1.a.t(bArr, f10, f10 + i21)) {
                            throw new d0("Protocol message had invalid UTF-8.");
                        }
                    }
                    unsafe.putObject(obj, j10, new String(bArr, f10, i21, a0.a));
                    f10 += i21;
                }
                unsafe.putInt(obj, j12, i13);
                return f10;
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
                int f11 = o1.f(bArr, i10, mVar);
                int i22 = mVar.a;
                if (i22 == 0) {
                    unsafe.putObject(obj, j10, o.c);
                } else {
                    unsafe.putObject(obj, j10, o.n(f11, i22, bArr));
                    f11 += i22;
                }
                unsafe.putInt(obj, j12, i13);
                return f11;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int f12 = o1.f(bArr, i10, mVar);
                int i23 = mVar.a;
                b0 u10 = u(i17);
                if (u10 == null || u10.a(i23) != null) {
                    unsafe.putObject(obj, j10, Integer.valueOf(i23));
                    m10 = f12;
                    unsafe.putInt(obj, j12, i13);
                    return m10;
                }
                z zVar = (z) obj;
                d1 d1Var = zVar.zzjp;
                if (d1Var == d1.e) {
                    d1Var = d1.b();
                    zVar.zzjp = d1Var;
                }
                d1Var.a(i12, Long.valueOf(i23));
                return f12;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                m10 = o1.f(bArr, i10, mVar);
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
                m10 = o1.m(bArr, i10, mVar);
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
    
        if (r12 >= r15) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01c0, code lost:
    
        r1 = com.google.android.gms.internal.clearcut.o1.f(r13, r12, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01c6, code lost:
    
        if (r16 != r25.a) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01c8, code lost:
    
        r12 = com.google.android.gms.internal.clearcut.o1.f(r13, r1, r25);
        r1 = r25.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01ce, code lost:
    
        if (r1 != 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01b6, code lost:
    
        r6.add(com.google.android.gms.internal.clearcut.o.n(r12, r1, r13));
        r12 = r12 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01d1, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01be, code lost:
    
        r6.add(com.google.android.gms.internal.clearcut.o.n(r12, r1, r13));
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
    public final int l(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, m mVar) {
        Unsafe unsafe = o;
        c0 c0Var = (c0) unsafe.getObject(obj, j11);
        if (!((k) c0Var).a) {
            int size = c0Var.size();
            c0Var = c0Var.d(size == 0 ? 10 : size << 1);
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
                        Double.longBitsToDouble(o1.r(i10, bArr));
                        throw null;
                    }
                    return i10;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f10 = o1.f(bArr, i10, mVar);
                int i17 = mVar.a + f10;
                if (f10 < i17) {
                    Double.longBitsToDouble(o1.r(f10, bArr));
                    throw null;
                }
                if (f10 == i17) {
                    return f10;
                }
                throw d0.a();
            case 19:
            case 36:
                if (i14 != 2) {
                    if (i14 == 5) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        Float.intBitsToFloat(o1.o(i10, bArr));
                        throw null;
                    }
                    return i10;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f11 = o1.f(bArr, i10, mVar);
                int i18 = mVar.a + f11;
                if (f11 < i18) {
                    Float.intBitsToFloat(o1.o(f11, bArr));
                    throw null;
                }
                if (f11 == i18) {
                    return f11;
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
                        o1.m(bArr, i10, mVar);
                        throw null;
                    }
                    return i10;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f12 = o1.f(bArr, i10, mVar);
                int i19 = mVar.a + f12;
                if (f12 < i19) {
                    o1.m(bArr, f12, mVar);
                    throw null;
                }
                if (f12 == i19) {
                    return f12;
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
                        o1.f(bArr, i10, mVar);
                        throw null;
                    }
                    return i10;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f13 = o1.f(bArr, i10, mVar);
                int i20 = mVar.a + f13;
                if (f13 < i20) {
                    o1.f(bArr, f13, mVar);
                    throw null;
                }
                if (f13 == i20) {
                    return f13;
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
                        o1.r(i10, bArr);
                        throw null;
                    }
                    return i10;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f14 = o1.f(bArr, i10, mVar);
                int i21 = mVar.a + f14;
                if (f14 < i21) {
                    o1.r(f14, bArr);
                    throw null;
                }
                if (f14 == i21) {
                    return f14;
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
                        o1.o(i10, bArr);
                        throw null;
                    }
                    return i10;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f15 = o1.f(bArr, i10, mVar);
                int i22 = mVar.a + f15;
                if (f15 < i22) {
                    o1.o(f15, bArr);
                    throw null;
                }
                if (f15 == i22) {
                    return f15;
                }
                throw d0.a();
            case 25:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                if (i14 != 2) {
                    if (i14 == 0) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        o1.m(bArr, i10, mVar);
                        throw null;
                    }
                    return i10;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f16 = o1.f(bArr, i10, mVar);
                int i23 = mVar.a + f16;
                if (f16 < i23) {
                    o1.m(bArr, f16, mVar);
                    throw null;
                }
                if (f16 == i23) {
                    return f16;
                }
                throw d0.a();
            case 26:
                if (i14 == 2) {
                    long j12 = j10 & 536870912;
                    int f17 = o1.f(bArr, i10, mVar);
                    int i24 = mVar.a;
                    if (j12 == 0) {
                        if (i24 != 0) {
                            c0Var.add(new String(bArr, f17, i24, a0.a));
                            f17 += i24;
                            while (f17 < i11) {
                                int f18 = o1.f(bArr, f17, mVar);
                                if (i12 != mVar.a) {
                                    return f17;
                                }
                                f17 = o1.f(bArr, f18, mVar);
                                int i25 = mVar.a;
                                if (i25 != 0) {
                                    c0Var.add(new String(bArr, f17, i25, a0.a));
                                    f17 += i25;
                                }
                            }
                            return f17;
                        }
                        c0Var.add("");
                        while (f17 < i11) {
                        }
                        return f17;
                    }
                    if (i24 != 0) {
                        int i26 = f17 + i24;
                        if (!n1.a.t(bArr, f17, i26)) {
                            throw new d0("Protocol message had invalid UTF-8.");
                        }
                        c0Var.add(new String(bArr, f17, i24, a0.a));
                        f17 = i26;
                        while (f17 < i11) {
                            int f19 = o1.f(bArr, f17, mVar);
                            if (i12 != mVar.a) {
                                return f17;
                            }
                            f17 = o1.f(bArr, f19, mVar);
                            int i27 = mVar.a;
                            if (i27 != 0) {
                                int i28 = f17 + i27;
                                if (!n1.a.t(bArr, f17, i28)) {
                                    throw new d0("Protocol message had invalid UTF-8.");
                                }
                                c0Var.add(new String(bArr, f17, i27, a0.a));
                                f17 = i28;
                            }
                        }
                        return f17;
                    }
                    c0Var.add("");
                    while (f17 < i11) {
                    }
                    return f17;
                }
                return i10;
            case 27:
                if (i14 == 2) {
                    return h(s(i15), i12, bArr, i10, i11, c0Var, mVar);
                }
                return i10;
            case 28:
                if (i14 == 2) {
                    int f20 = o1.f(bArr, i10, mVar);
                    int i29 = mVar.a;
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
                        o1.f(bArr, i10, mVar);
                        throw null;
                    }
                    return i10;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f21 = o1.f(bArr, i10, mVar);
                int i30 = mVar.a + f21;
                if (f21 < i30) {
                    o1.f(bArr, f21, mVar);
                    throw null;
                }
                if (f21 != i30) {
                    throw d0.a();
                }
                z zVar = (z) obj;
                d1 d1Var = zVar.zzjp;
                d1 d1Var2 = d1Var != d1.e ? d1Var : null;
                b0 u10 = u(i15);
                Class cls = c1.a;
                if (u10 != null) {
                    e1 e1Var = this.m;
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
                                if (d1Var2 == null) {
                                    e1Var.getClass();
                                    d1Var2 = d1.b();
                                }
                                e1Var.getClass();
                                d1Var2.a(i13 << 3, Long.valueOf(intValue));
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
                                if (d1Var2 == null) {
                                    e1Var.getClass();
                                    d1Var2 = d1.b();
                                }
                                e1Var.getClass();
                                d1Var2.a(i13 << 3, Long.valueOf(intValue2));
                                it.remove();
                            }
                        }
                    }
                }
                if (d1Var2 != null) {
                    zVar.zzjp = d1Var2;
                }
                return f21;
            case 33:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                if (i14 != 2) {
                    if (i14 == 0) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        o1.f(bArr, i10, mVar);
                        throw null;
                    }
                    return i10;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f22 = o1.f(bArr, i10, mVar);
                int i33 = mVar.a + f22;
                if (f22 < i33) {
                    o1.f(bArr, f22, mVar);
                    throw null;
                }
                if (f22 == i33) {
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
                        o1.m(bArr, i10, mVar);
                        throw null;
                    }
                    return i10;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f23 = o1.f(bArr, i10, mVar);
                int i34 = mVar.a + f23;
                if (f23 < i34) {
                    o1.m(bArr, f23, mVar);
                    throw null;
                }
                if (f23 == i34) {
                    return f23;
                }
                throw d0.a();
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                if (i14 == 3) {
                    b1 s10 = s(i15);
                    int i35 = (i12 & (-8)) | 4;
                    int i36 = i(s10, bArr, i10, i11, i35, mVar);
                    b1 b1Var = s10;
                    m mVar2 = mVar;
                    c0Var.add(mVar2.c);
                    while (i36 < i11) {
                        int f24 = o1.f(bArr, i36, mVar2);
                        if (i12 != mVar2.a) {
                            return i36;
                        }
                        m mVar3 = mVar2;
                        b1 b1Var2 = b1Var;
                        i36 = i(b1Var2, bArr, f24, i11, i35, mVar3);
                        c0Var.add(mVar3.c);
                        b1Var = b1Var2;
                        mVar2 = mVar3;
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
    public final int m(Object obj, byte[] bArr, int i10, int i11, int i12, m mVar) {
        q0 q0Var;
        int[] iArr;
        int i13;
        Unsafe unsafe;
        int i14;
        Object obj2;
        int i15;
        int i16;
        d1 d1Var;
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
        m mVar2;
        Unsafe unsafe5;
        int i22;
        int i23;
        int q6;
        Object a2;
        m mVar3;
        int l10;
        q0 q0Var2 = this;
        Object obj3 = obj;
        byte[] bArr4 = bArr;
        int i24 = i11;
        m mVar4 = mVar;
        Unsafe unsafe6 = o;
        int i25 = -1;
        int i26 = i10;
        int i27 = 0;
        int i28 = -1;
        int i29 = 0;
        while (true) {
            int[] iArr2 = q0Var2.a;
            if (i26 < i24) {
                int i30 = i26 + 1;
                int i31 = bArr4[i26];
                if (i31 < 0) {
                    i30 = o1.d(i31, bArr4, i30, mVar4);
                    i31 = mVar4.a;
                }
                int i32 = i31;
                int i33 = i30;
                int i34 = i32 >>> 3;
                int i35 = i32 & 7;
                int w10 = q0Var2.w(i34);
                d1 d1Var2 = d1.e;
                if (w10 != i25) {
                    int i36 = iArr2[w10 + 1];
                    int i37 = (i36 & 267386880) >>> 20;
                    int i38 = i32;
                    long j10 = i36 & 1048575;
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
                                mVar4 = mVar;
                                if (i35 == 1) {
                                    l1.d.c(obj3, j10, Double.longBitsToDouble(o1.r(i19, bArr2)));
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
                                    q0Var = q0Var2;
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
                                        z zVar = (z) obj2;
                                        d1Var = zVar.zzjp;
                                        if (d1Var == d1Var2) {
                                            d1Var = d1.b();
                                            zVar.zzjp = d1Var;
                                        }
                                        int i43 = i27;
                                        int c11 = o1.c(i43, bArr, i16, i11, d1Var, mVar);
                                        i27 = i43;
                                        bArr4 = bArr;
                                        mVar4 = mVar;
                                        i24 = i11;
                                        q0Var2 = q0Var;
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
                                mVar4 = mVar;
                                if (i35 == 5) {
                                    l1.d.d(obj3, j10, Float.intBitsToFloat(o1.o(i19, bArr2)));
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
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14) {
                                    }
                                    z zVar2 = (z) obj2;
                                    d1Var = zVar2.zzjp;
                                    if (d1Var == d1Var2) {
                                    }
                                    int i432 = i27;
                                    int c112 = o1.c(i432, bArr, i16, i11, d1Var, mVar);
                                    i27 = i432;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i24 = i11;
                                    q0Var2 = q0Var;
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
                                mVar4 = mVar;
                                if (i35 == 0) {
                                    int m10 = o1.m(bArr, i19, mVar4);
                                    unsafe3.putLong(obj3, j10, mVar4.b);
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
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14) {
                                    }
                                    z zVar22 = (z) obj2;
                                    d1Var = zVar22.zzjp;
                                    if (d1Var == d1Var2) {
                                    }
                                    int i4322 = i27;
                                    int c1122 = o1.c(i4322, bArr, i16, i11, d1Var, mVar);
                                    i27 = i4322;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i24 = i11;
                                    q0Var2 = q0Var;
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
                                mVar4 = mVar;
                                if (i35 == 0) {
                                    int f10 = o1.f(bArr, i19, mVar4);
                                    unsafe3.putInt(obj3, j10, mVar4.a);
                                    i24 = i11;
                                    unsafe6 = unsafe3;
                                    bArr4 = bArr;
                                    i28 = i18;
                                    i29 = i15 | i40;
                                    i26 = f10;
                                    i27 = i38;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    i14 = i12;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14) {
                                    }
                                    z zVar222 = (z) obj2;
                                    d1Var = zVar222.zzjp;
                                    if (d1Var == d1Var2) {
                                    }
                                    int i43222 = i27;
                                    int c11222 = o1.c(i43222, bArr, i16, i11, d1Var, mVar);
                                    i27 = i43222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i24 = i11;
                                    q0Var2 = q0Var;
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
                                    mVar4 = mVar;
                                    unsafe4.putLong(obj3, j10, o1.r(i33, bArr));
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
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14) {
                                    }
                                    z zVar2222 = (z) obj2;
                                    d1Var = zVar2222.zzjp;
                                    if (d1Var == d1Var2) {
                                    }
                                    int i432222 = i27;
                                    int c112222 = o1.c(i432222, bArr, i16, i11, d1Var, mVar);
                                    i27 = i432222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i24 = i11;
                                    q0Var2 = q0Var;
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
                                mVar2 = mVar;
                                unsafe5 = unsafe6;
                                i22 = i38;
                                i23 = i11;
                                if (i35 == 5) {
                                    unsafe5.putInt(obj3, j10, o1.o(i21, bArr3));
                                    i26 = i21 + 4;
                                    int i45 = i18;
                                    i29 = i15 | i40;
                                    bArr4 = bArr3;
                                    i28 = i45;
                                    int i46 = i23;
                                    unsafe6 = unsafe5;
                                    i24 = i46;
                                    mVar4 = mVar2;
                                    i27 = i22;
                                    break;
                                } else {
                                    i19 = i21;
                                    unsafe2 = unsafe5;
                                    i38 = i22;
                                    i14 = i12;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14) {
                                    }
                                    z zVar22222 = (z) obj2;
                                    d1Var = zVar22222.zzjp;
                                    if (d1Var == d1Var2) {
                                    }
                                    int i4322222 = i27;
                                    int c1122222 = o1.c(i4322222, bArr, i16, i11, d1Var, mVar);
                                    i27 = i4322222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i24 = i11;
                                    q0Var2 = q0Var;
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
                                mVar2 = mVar;
                                unsafe5 = unsafe6;
                                i22 = i38;
                                i23 = i11;
                                if (i35 == 0) {
                                    i26 = o1.m(bArr3, i21, mVar2);
                                    l1.d.f(obj3, j10, mVar2.b != 0);
                                    int i452 = i18;
                                    i29 = i15 | i40;
                                    bArr4 = bArr3;
                                    i28 = i452;
                                    int i462 = i23;
                                    unsafe6 = unsafe5;
                                    i24 = i462;
                                    mVar4 = mVar2;
                                    i27 = i22;
                                    break;
                                } else {
                                    i19 = i21;
                                    unsafe2 = unsafe5;
                                    i38 = i22;
                                    i14 = i12;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14) {
                                    }
                                    z zVar222222 = (z) obj2;
                                    d1Var = zVar222222.zzjp;
                                    if (d1Var == d1Var2) {
                                    }
                                    int i43222222 = i27;
                                    int c11222222 = o1.c(i43222222, bArr, i16, i11, d1Var, mVar);
                                    i27 = i43222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i24 = i11;
                                    q0Var2 = q0Var;
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
                                mVar2 = mVar;
                                unsafe5 = unsafe6;
                                i22 = i38;
                                i23 = i11;
                                if (i35 == 2) {
                                    if ((i17 & TLObject.FLAG_29) == 0) {
                                        q6 = o1.f(bArr3, i21, mVar2);
                                        int i47 = mVar2.a;
                                        if (i47 == 0) {
                                            mVar2.c = "";
                                        } else {
                                            mVar2.c = new String(bArr3, q6, i47, a0.a);
                                            q6 += i47;
                                        }
                                    } else {
                                        q6 = o1.q(bArr3, i21, mVar2);
                                    }
                                    i26 = q6;
                                    a2 = mVar2.c;
                                    unsafe5.putObject(obj3, j10, a2);
                                    int i4522 = i18;
                                    i29 = i15 | i40;
                                    bArr4 = bArr3;
                                    i28 = i4522;
                                    int i4622 = i23;
                                    unsafe6 = unsafe5;
                                    i24 = i4622;
                                    mVar4 = mVar2;
                                    i27 = i22;
                                    break;
                                } else {
                                    i19 = i21;
                                    unsafe2 = unsafe5;
                                    i38 = i22;
                                    i14 = i12;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14) {
                                    }
                                    z zVar2222222 = (z) obj2;
                                    d1Var = zVar2222222.zzjp;
                                    if (d1Var == d1Var2) {
                                    }
                                    int i432222222 = i27;
                                    int c112222222 = o1.c(i432222222, bArr, i16, i11, d1Var, mVar);
                                    i27 = i432222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i24 = i11;
                                    q0Var2 = q0Var;
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
                                mVar2 = mVar;
                                unsafe5 = unsafe6;
                                i22 = i38;
                                i23 = i11;
                                if (i35 == 2) {
                                    i26 = j(q0Var2.s(w10), bArr3, i21, i23, mVar2);
                                    a2 = (i15 & i40) == 0 ? mVar2.c : a0.a(unsafe5.getObject(obj3, j10), mVar2.c);
                                    unsafe5.putObject(obj3, j10, a2);
                                    int i45222 = i18;
                                    i29 = i15 | i40;
                                    bArr4 = bArr3;
                                    i28 = i45222;
                                    int i46222 = i23;
                                    unsafe6 = unsafe5;
                                    i24 = i46222;
                                    mVar4 = mVar2;
                                    i27 = i22;
                                    break;
                                } else {
                                    i19 = i21;
                                    unsafe2 = unsafe5;
                                    i38 = i22;
                                    i14 = i12;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14) {
                                    }
                                    z zVar22222222 = (z) obj2;
                                    d1Var = zVar22222222.zzjp;
                                    if (d1Var == d1Var2) {
                                    }
                                    int i4322222222 = i27;
                                    int c1122222222 = o1.c(i4322222222, bArr, i16, i11, d1Var, mVar);
                                    i27 = i4322222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i24 = i11;
                                    q0Var2 = q0Var;
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
                                mVar2 = mVar;
                                unsafe5 = unsafe6;
                                i22 = i38;
                                i23 = i11;
                                if (i35 == 2) {
                                    i26 = o1.s(bArr3, i21, mVar2);
                                    a2 = mVar2.c;
                                    unsafe5.putObject(obj3, j10, a2);
                                    int i452222 = i18;
                                    i29 = i15 | i40;
                                    bArr4 = bArr3;
                                    i28 = i452222;
                                    int i462222 = i23;
                                    unsafe6 = unsafe5;
                                    i24 = i462222;
                                    mVar4 = mVar2;
                                    i27 = i22;
                                    break;
                                } else {
                                    i19 = i21;
                                    unsafe2 = unsafe5;
                                    i38 = i22;
                                    i14 = i12;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14) {
                                    }
                                    z zVar222222222 = (z) obj2;
                                    d1Var = zVar222222222.zzjp;
                                    if (d1Var == d1Var2) {
                                    }
                                    int i43222222222 = i27;
                                    int c11222222222 = o1.c(i43222222222, bArr, i16, i11, d1Var, mVar);
                                    i27 = i43222222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i24 = i11;
                                    q0Var2 = q0Var;
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
                                mVar2 = mVar;
                                unsafe5 = unsafe6;
                                i23 = i11;
                                if (i35 == 0) {
                                    i26 = o1.f(bArr3, i33, mVar2);
                                    int i48 = mVar2.a;
                                    b0 u10 = q0Var2.u(w10);
                                    if (u10 == null || u10.a(i48) != null) {
                                        i22 = i38;
                                        unsafe5.putInt(obj3, j10, i48);
                                        int i4522222 = i18;
                                        i29 = i15 | i40;
                                        bArr4 = bArr3;
                                        i28 = i4522222;
                                        int i4622222 = i23;
                                        unsafe6 = unsafe5;
                                        i24 = i4622222;
                                        mVar4 = mVar2;
                                        i27 = i22;
                                        break;
                                    } else {
                                        z zVar3 = (z) obj3;
                                        d1 d1Var3 = zVar3.zzjp;
                                        if (d1Var3 == d1Var2) {
                                            d1Var3 = d1.b();
                                            zVar3.zzjp = d1Var3;
                                        }
                                        d1Var3.a(i38, Long.valueOf(i48));
                                        unsafe6 = unsafe5;
                                        i24 = i23;
                                        mVar4 = mVar2;
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
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14) {
                                    }
                                    z zVar2222222222 = (z) obj2;
                                    d1Var = zVar2222222222.zzjp;
                                    if (d1Var == d1Var2) {
                                    }
                                    int i432222222222 = i27;
                                    int c112222222222 = o1.c(i432222222222, bArr, i16, i11, d1Var, mVar);
                                    i27 = i432222222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i24 = i11;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c112222222222;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            case 15:
                                mVar3 = mVar;
                                unsafe4 = unsafe6;
                                if (i35 == 0) {
                                    i26 = o1.f(bArr, i33, mVar3);
                                    int i49 = mVar3.a;
                                    unsafe4.putInt(obj3, j10, (-(i49 & 1)) ^ (i49 >>> 1));
                                    int i50 = i18;
                                    i29 = i15 | i40;
                                    bArr4 = bArr;
                                    i28 = i50;
                                    unsafe6 = unsafe4;
                                    mVar4 = mVar3;
                                    i27 = i38;
                                    i24 = i11;
                                    break;
                                } else {
                                    i19 = i33;
                                    unsafe2 = unsafe4;
                                    i14 = i12;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14) {
                                    }
                                    z zVar22222222222 = (z) obj2;
                                    d1Var = zVar22222222222.zzjp;
                                    if (d1Var == d1Var2) {
                                    }
                                    int i4322222222222 = i27;
                                    int c1122222222222 = o1.c(i4322222222222, bArr, i16, i11, d1Var, mVar);
                                    i27 = i4322222222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i24 = i11;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i25 = -1;
                                    i26 = c1122222222222;
                                    obj3 = obj2;
                                    i28 = i13;
                                    break;
                                }
                                break;
                            case 16:
                                mVar3 = mVar;
                                if (i35 == 0) {
                                    int m11 = o1.m(bArr, i33, mVar3);
                                    long j11 = mVar3.b;
                                    Unsafe unsafe7 = unsafe6;
                                    unsafe7.putLong(obj3, j10, (j11 >>> c10) ^ (-(j11 & 1)));
                                    int i51 = i18;
                                    i29 = i15 | i40;
                                    bArr4 = bArr;
                                    i28 = i51;
                                    unsafe6 = unsafe7;
                                    i26 = m11;
                                    mVar4 = mVar3;
                                    i27 = i38;
                                    i24 = i11;
                                    break;
                                } else {
                                    i19 = i33;
                                    unsafe2 = unsafe6;
                                    i14 = i12;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14) {
                                    }
                                    z zVar222222222222 = (z) obj2;
                                    d1Var = zVar222222222222.zzjp;
                                    if (d1Var == d1Var2) {
                                    }
                                    int i43222222222222 = i27;
                                    int c11222222222222 = o1.c(i43222222222222, bArr, i16, i11, d1Var, mVar);
                                    i27 = i43222222222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i24 = i11;
                                    q0Var2 = q0Var;
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
                                    i26 = i(q0Var2.s(w10), bArr, i33, i11, (i34 << 3) | 4, mVar);
                                    unsafe6.putObject(obj3, j10, (i15 & i40) == 0 ? mVar.c : a0.a(unsafe6.getObject(obj3, j10), mVar.c));
                                    int i52 = i18;
                                    i29 = i15 | i40;
                                    bArr4 = bArr;
                                    i28 = i52;
                                    i24 = i11;
                                    mVar4 = mVar;
                                    i27 = i38;
                                    break;
                                } else {
                                    i19 = i33;
                                    unsafe2 = unsafe6;
                                    i14 = i12;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i16 = i19;
                                    unsafe = unsafe2;
                                    i27 = i38;
                                    i13 = i18;
                                    i29 = i15;
                                    if (i27 != i14) {
                                    }
                                    z zVar2222222222222 = (z) obj2;
                                    d1Var = zVar2222222222222.zzjp;
                                    if (d1Var == d1Var2) {
                                    }
                                    int i432222222222222 = i27;
                                    int c112222222222222 = o1.c(i432222222222222, bArr, i16, i11, d1Var, mVar);
                                    i27 = i432222222222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i24 = i11;
                                    q0Var2 = q0Var;
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
                                q0Var = q0Var2;
                                obj2 = obj3;
                                i16 = i19;
                                unsafe = unsafe2;
                                i27 = i38;
                                i13 = i18;
                                i29 = i15;
                                if (i27 != i14) {
                                }
                                z zVar22222222222222 = (z) obj2;
                                d1Var = zVar22222222222222.zzjp;
                                if (d1Var == d1Var2) {
                                }
                                int i4322222222222222 = i27;
                                int c1122222222222222 = o1.c(i4322222222222222, bArr, i16, i11, d1Var, mVar);
                                i27 = i4322222222222222;
                                bArr4 = bArr;
                                mVar4 = mVar;
                                i24 = i11;
                                q0Var2 = q0Var;
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
                                l10 = q0Var2.l(obj, bArr, i33, i11, i27, i34, i35, w10, i36, i37, j10, mVar);
                                if (l10 == i33) {
                                    q0Var = q0Var2;
                                    obj2 = obj;
                                } else {
                                    i24 = i11;
                                    mVar4 = mVar;
                                    obj3 = obj;
                                    i26 = l10;
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
                                    l10 = q0Var2.k(obj, bArr, i33, i11, i27, i34, i35, i36, i37, j10, w10, mVar);
                                    q0Var = q0Var2;
                                    obj2 = obj;
                                    if (l10 != i33) {
                                        bArr4 = bArr;
                                        i24 = i11;
                                        mVar4 = mVar;
                                        i26 = l10;
                                        q0Var2 = q0Var;
                                        obj3 = obj2;
                                        i28 = i13;
                                        i29 = i15;
                                        unsafe6 = unsafe;
                                        i25 = -1;
                                    }
                                } else {
                                    if (i35 == 2) {
                                        q0Var2.p(j10, obj, w10);
                                        throw null;
                                    }
                                    q0Var = q0Var2;
                                    obj2 = obj;
                                }
                            }
                            i16 = l10;
                            i29 = i15;
                            i14 = i12;
                        } else if (i35 == 2) {
                            c0 c0Var = (c0) unsafe8.getObject(obj3, j10);
                            if (!((k) c0Var).a) {
                                int size = c0Var.size();
                                c0Var = c0Var.d(size == 0 ? 10 : size << 1);
                                unsafe8.putObject(obj3, j10, c0Var);
                            }
                            unsafe6 = unsafe8;
                            obj3 = obj;
                            i24 = i11;
                            mVar4 = mVar;
                            i26 = h(q0Var2.s(w10), i38, bArr, i33, i11, c0Var, mVar);
                            i27 = i38;
                            i25 = -1;
                            bArr4 = bArr;
                        } else {
                            q0Var = q0Var2;
                            unsafe = unsafe8;
                            i15 = i29;
                            i33 = i33;
                            i27 = i38;
                            i13 = i28;
                            obj2 = obj;
                        }
                        if (i27 != i14) {
                        }
                        z zVar222222222222222 = (z) obj2;
                        d1Var = zVar222222222222222.zzjp;
                        if (d1Var == d1Var2) {
                        }
                        int i43222222222222222 = i27;
                        int c11222222222222222 = o1.c(i43222222222222222, bArr, i16, i11, d1Var, mVar);
                        i27 = i43222222222222222;
                        bArr4 = bArr;
                        mVar4 = mVar;
                        i24 = i11;
                        q0Var2 = q0Var;
                        unsafe6 = unsafe;
                        i25 = -1;
                        i26 = c11222222222222222;
                        obj3 = obj2;
                        i28 = i13;
                    }
                } else {
                    q0Var = q0Var2;
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
                z zVar2222222222222222 = (z) obj2;
                d1Var = zVar2222222222222222.zzjp;
                if (d1Var == d1Var2) {
                }
                int i432222222222222222 = i27;
                int c112222222222222222 = o1.c(i432222222222222222, bArr, i16, i11, d1Var, mVar);
                i27 = i432222222222222222;
                bArr4 = bArr;
                mVar4 = mVar;
                i24 = i11;
                q0Var2 = q0Var;
                unsafe6 = unsafe;
                i25 = -1;
                i26 = c112222222222222222;
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
        int i53 = i13;
        if (i53 != i25) {
            unsafe.putInt(obj2, i53, i29);
        }
        int[] iArr3 = q0Var.i;
        if (iArr3 != null) {
            for (int i54 : iArr3) {
                int i55 = iArr[i54];
                Object k10 = l1.k(obj2, q0Var.v(i54) & 1048575);
                if (k10 != null && q0Var.u(i54) != null) {
                    q0Var.n.getClass();
                    q0Var.t(i54);
                    throw new NoSuchMethodError();
                }
            }
        }
        if (i14 == 0) {
            if (i26 != i24) {
                throw d0.b();
            }
        } else if (i26 > i24 || i27 != i14) {
            throw d0.b();
        }
        return i26;
    }

    public final void o(int i10, Object obj, Object obj2) {
        long v = v(i10) & 1048575;
        if (r(i10, obj2)) {
            Object k10 = l1.k(obj, v);
            Object k11 = l1.k(obj2, v);
            if (k10 != null && k11 != null) {
                k11 = a0.a(k10, k11);
            } else if (k11 == null) {
                return;
            }
            l1.d(obj, v, k11);
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
        return l1.d.g(obj, (long) (this.a[i11 + 2] & 1048575)) == i10;
    }

    public final boolean r(int i10, Object obj) {
        if (this.g) {
            int v = v(i10);
            long j10 = v & 1048575;
            switch ((v & 267386880) >>> 20) {
                case 0:
                    if (l1.d.k(obj, j10) == 0.0d) {
                        return false;
                    }
                    break;
                case 1:
                    if (l1.d.j(obj, j10) == 0.0f) {
                        return false;
                    }
                    break;
                case 2:
                    if (l1.d.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (l1.d.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (l1.d.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (l1.d.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (l1.d.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return l1.d.i(obj, j10);
                case 8:
                    Object k10 = l1.k(obj, j10);
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
                    if (l1.k(obj, j10) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (o.c.equals(l1.k(obj, j10))) {
                        return false;
                    }
                    break;
                case 11:
                    if (l1.d.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (l1.d.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (l1.d.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (l1.d.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (l1.d.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (l1.d.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (l1.k(obj, j10) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((l1.d.g(obj, r6 & 1048575) & (1 << (this.a[i10 + 2] >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    public final b1 s(int i10) {
        int i11 = (i10 / 4) << 1;
        Object[] objArr = this.b;
        b1 b1Var = (b1) objArr[i11];
        if (b1Var != null) {
            return b1Var;
        }
        b1 a2 = w0.c.a((Class) objArr[i11 + 1]);
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
        l1.b(j10, obj, l1.d.g(obj, j10) | (1 << (i11 >>> 20)));
    }

    public final void y(int i10, Object obj, Object obj2) {
        int i11;
        int v = v(i10);
        int[] iArr = this.a;
        int i12 = iArr[i10];
        long j10 = v & 1048575;
        if (q(i12, i10, obj2)) {
            Object k10 = l1.k(obj, j10);
            Object k11 = l1.k(obj2, j10);
            if (k10 != null && k11 != null) {
                l1.d(obj, j10, a0.a(k10, k11));
                i11 = iArr[i10 + 2];
            } else {
                if (k11 == null) {
                    return;
                }
                l1.d(obj, j10, k11);
                i11 = iArr[i10 + 2];
            }
            l1.b(i11 & 1048575, obj, i12);
        }
    }

    public final boolean z(z zVar, Object obj, int i10) {
        return r(i10, zVar) == r(i10, obj);
    }
}
