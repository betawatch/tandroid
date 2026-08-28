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

    public q0(int[] iArr, Object[] objArr, int i9, int i10, int i11, j jVar, boolean z10, int[] iArr2, int[] iArr3, int[] iArr4, s0 s0Var, h0 h0Var, e1 e1Var, r rVar, n0 n0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i9;
        this.d = i10;
        this.e = i11;
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

    public static int h(b1 b1Var, int i9, byte[] bArr, int i10, int i11, c0 c0Var, m mVar) {
        int j10 = j(b1Var, bArr, i10, i11, mVar);
        while (true) {
            c0Var.add(mVar.c);
            if (j10 >= i11) {
                break;
            }
            int f10 = o1.f(bArr, j10, mVar);
            if (i9 != mVar.a) {
                break;
            }
            j10 = j(b1Var, bArr, f10, i11, mVar);
        }
        return j10;
    }

    public static int i(b1 b1Var, byte[] bArr, int i9, int i10, int i11, m mVar) {
        q0 q0Var = (q0) b1Var;
        Object a2 = q0Var.a();
        int m10 = q0Var.m(a2, bArr, i9, i10, i11, mVar);
        q0Var.b(a2);
        mVar.c = a2;
        return m10;
    }

    public static int j(b1 b1Var, byte[] bArr, int i9, int i10, m mVar) {
        int i11 = i9 + 1;
        int i12 = bArr[i9];
        if (i12 < 0) {
            i11 = o1.d(i12, bArr, i11, mVar);
            i12 = mVar.a;
        }
        int i13 = i11;
        if (i12 < 0 || i12 > i10 - i13) {
            throw d0.a();
        }
        Object a2 = b1Var.a();
        int i14 = i13 + i12;
        b1Var.f(a2, bArr, i13, i14, mVar);
        b1Var.b(a2);
        mVar.c = a2;
        return i14;
    }

    public static q0 n(y0 y0Var, s0 s0Var, h0 h0Var, e1 e1Var, r rVar, n0 n0Var) {
        int i9;
        int i10;
        int i11;
        int[] iArr;
        u uVar;
        int i12;
        int i13;
        int i14;
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
            i9 = 0;
            i10 = 0;
            i11 = 0;
        } else {
            int i15 = z0Var.g;
            int i16 = z0Var.h;
            i9 = z0Var.k;
            i10 = i15;
            i11 = i16;
        }
        int[] iArr2 = new int[i9 << 2];
        Object[] objArr = new Object[i9 << 1];
        int i17 = z0Var.i;
        int[] iArr3 = i17 > 0 ? new int[i17] : null;
        int i18 = z0Var.l;
        int[] iArr4 = i18 > 0 ? new int[i18] : null;
        boolean a2 = z0Var.a();
        Class cls = z0Var.c;
        Object[] objArr2 = z0Var.b;
        if (a2) {
            int i19 = z0Var.s;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                if (i19 >= z0Var.j || i20 >= ((i19 - i10) << 2)) {
                    int i23 = z0Var.u;
                    u uVar2 = u.s;
                    if (i23 > uVar2.a) {
                        int i24 = z0Var.v << 1;
                        Object obj = objArr2[i24];
                        iArr = iArr2;
                        if (obj instanceof Field) {
                            b11 = (Field) obj;
                        } else {
                            b11 = z0.b(cls, (String) obj);
                            objArr2[i24] = b11;
                        }
                        k1 k1Var = l1.d;
                        uVar = uVar2;
                        i12 = (int) k1Var.a(b11);
                        int i25 = (z0Var.v << 1) + 1;
                        Object obj2 = objArr2[i25];
                        if (obj2 instanceof Field) {
                            b12 = (Field) obj2;
                        } else {
                            b12 = z0.b(cls, (String) obj2);
                            objArr2[i25] = b12;
                        }
                        i14 = (int) k1Var.a(b12);
                        i13 = 0;
                    } else {
                        iArr = iArr2;
                        uVar = uVar2;
                        Field field = z0Var.x;
                        k1 k1Var2 = l1.d;
                        int a3 = (int) k1Var2.a(field);
                        if ((z0Var.d & 1) != 1 || z0Var.u > u.d.a) {
                            i12 = a3;
                            i13 = 0;
                            i14 = 0;
                        } else {
                            int i26 = (z0Var.w / 32) + (z0Var.f << 1);
                            Object obj3 = objArr2[i26];
                            if (obj3 instanceof Field) {
                                b10 = (Field) obj3;
                            } else {
                                b10 = z0.b(cls, (String) obj3);
                                objArr2[i26] = b10;
                            }
                            i14 = (int) k1Var2.a(b10);
                            i13 = z0Var.w % 32;
                            i12 = a3;
                        }
                    }
                    iArr[i20] = z0Var.s;
                    int i27 = i20 + 1;
                    int i28 = i13;
                    int i29 = z0Var.t;
                    int i30 = i14;
                    int i31 = ((i29 & 256) != 0 ? TLObject.FLAG_28 : 0) | ((i29 & 512) != 0 ? TLObject.FLAG_29 : 0);
                    int i32 = z0Var.u;
                    iArr[i27] = i31 | (i32 << 20) | i12;
                    iArr[i20 + 2] = (i28 << 20) | i30;
                    Object obj4 = z0Var.A;
                    if (obj4 != null) {
                        int i33 = (i20 / 4) << 1;
                        objArr[i33] = obj4;
                        Object obj5 = z0Var.y;
                        if (obj5 != null) {
                            objArr[i33 + 1] = obj5;
                        } else {
                            Object obj6 = z0Var.z;
                            if (obj6 != null) {
                                objArr[i33 + 1] = obj6;
                            }
                        }
                    } else {
                        Object obj7 = z0Var.y;
                        if (obj7 != null) {
                            objArr[((i20 / 4) << 1) + 1] = obj7;
                        } else {
                            Object obj8 = z0Var.z;
                            if (obj8 != null) {
                                objArr[((i20 / 4) << 1) + 1] = obj8;
                            }
                        }
                    }
                    if (i32 == uVar.ordinal()) {
                        iArr3[i21] = i20;
                        i21++;
                    } else if (i32 >= 18 && i32 <= 49) {
                        iArr4[i22] = iArr[i27] & 1048575;
                        i22++;
                    }
                    if (!z0Var.a()) {
                        break;
                    }
                    i19 = z0Var.s;
                } else {
                    for (int i34 = 0; i34 < 4; i34++) {
                        iArr2[i20 + i34] = -1;
                    }
                    iArr = iArr2;
                }
                i20 += 4;
                iArr2 = iArr;
            }
        } else {
            iArr = iArr2;
        }
        return new q0(iArr, objArr, i10, i11, z0Var.j, y0Var.a, z10, z0Var.m, iArr3, iArr4, s0Var, h0Var, e1Var, rVar, n0Var);
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
            for (int i9 : iArr) {
                long v = v(i9) & 1048575;
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
            for (int i10 : iArr2) {
                this.l.a(obj, i10);
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
        int i9;
        zVar2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i10 >= iArr.length) {
                z zVar4 = zVar;
                if (this.g) {
                    return;
                }
                c1.a(this.m, zVar4, zVar2);
                return;
            }
            int v = v(i10);
            long j10 = v & 1048575;
            int i11 = iArr[i10];
            switch ((v & 267386880) >>> 20) {
                case 0:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    } else {
                        k1 k1Var2 = l1.d;
                        k1Var2.c(zVar3, j10, k1Var2.k(zVar2, j10));
                        x(i10, zVar3);
                        break;
                    }
                case 1:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    } else {
                        k1 k1Var3 = l1.d;
                        k1Var3.d(zVar3, j10, k1Var3.j(zVar2, j10));
                        x(i10, zVar3);
                        break;
                    }
                case 2:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    }
                    k1Var = l1.d;
                    h = k1Var.h(zVar2, j10);
                    k1Var.e(zVar3, j10, h);
                    x(i10, zVar3);
                    break;
                case 3:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    }
                    k1Var = l1.d;
                    h = k1Var.h(zVar2, j10);
                    k1Var.e(zVar3, j10, h);
                    x(i10, zVar3);
                    break;
                case 4:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    }
                    l1.b(j10, zVar3, l1.d.g(zVar2, j10));
                    x(i10, zVar3);
                    break;
                case 5:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    }
                    k1Var = l1.d;
                    h = k1Var.h(zVar2, j10);
                    k1Var.e(zVar3, j10, h);
                    x(i10, zVar3);
                    break;
                case 6:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    }
                    l1.b(j10, zVar3, l1.d.g(zVar2, j10));
                    x(i10, zVar3);
                    break;
                case 7:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    } else {
                        k1 k1Var4 = l1.d;
                        k1Var4.f(zVar3, j10, k1Var4.i(zVar2, j10));
                        x(i10, zVar3);
                        break;
                    }
                case 8:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    }
                    l1.d(zVar3, j10, l1.k(zVar2, j10));
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
                    l1.d(zVar3, j10, l1.k(zVar2, j10));
                    x(i10, zVar3);
                    break;
                case 11:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    }
                    l1.b(j10, zVar3, l1.d.g(zVar2, j10));
                    x(i10, zVar3);
                    break;
                case 12:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    }
                    l1.b(j10, zVar3, l1.d.g(zVar2, j10));
                    x(i10, zVar3);
                    break;
                case 13:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    }
                    l1.b(j10, zVar3, l1.d.g(zVar2, j10));
                    x(i10, zVar3);
                    break;
                case 14:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    }
                    k1Var = l1.d;
                    h = k1Var.h(zVar2, j10);
                    k1Var.e(zVar3, j10, h);
                    x(i10, zVar3);
                    break;
                case 15:
                    zVar3 = zVar;
                    if (!r(i10, zVar2)) {
                        break;
                    }
                    l1.b(j10, zVar3, l1.d.g(zVar2, j10));
                    x(i10, zVar3);
                    break;
                case 16:
                    if (r(i10, zVar2)) {
                        k1Var = l1.d;
                        h = k1Var.h(zVar2, j10);
                        zVar3 = zVar;
                        k1Var.e(zVar3, j10, h);
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
                    if (q(i11, i10, zVar2)) {
                        l1.d(zVar, j10, l1.k(zVar2, j10));
                        i9 = iArr[i10 + 2];
                        l1.b(i9 & 1048575, zVar, i11);
                    }
                    zVar3 = zVar;
                    break;
                case 60:
                case 68:
                    y(i10, zVar, zVar2);
                    zVar3 = zVar;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                case 66:
                case 67:
                    if (q(i11, i10, zVar2)) {
                        l1.d(zVar, j10, l1.k(zVar2, j10));
                        i9 = iArr[i10 + 2];
                        l1.b(i9 & 1048575, zVar, i11);
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
        int i9 = 0;
        while (true) {
            boolean z10 = true;
            if (i9 < length) {
                int v = v(i9);
                long j10 = v & 1048575;
                switch ((v & 267386880) >>> 20) {
                    case 0:
                        if (z(zVar, zVar2, i9)) {
                            k1 k1Var = l1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 1:
                        if (z(zVar, zVar2, i9)) {
                            k1 k1Var2 = l1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 2:
                        if (z(zVar, zVar2, i9)) {
                            k1 k1Var3 = l1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 3:
                        if (z(zVar, zVar2, i9)) {
                            k1 k1Var4 = l1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 4:
                        if (z(zVar, zVar2, i9)) {
                            k1 k1Var5 = l1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 5:
                        if (z(zVar, zVar2, i9)) {
                            k1 k1Var6 = l1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 6:
                        if (z(zVar, zVar2, i9)) {
                            k1 k1Var7 = l1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 7:
                        if (z(zVar, zVar2, i9)) {
                            k1 k1Var8 = l1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 8:
                        if (z(zVar, zVar2, i9)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 9:
                        if (z(zVar, zVar2, i9)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 10:
                        if (z(zVar, zVar2, i9)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 11:
                        if (z(zVar, zVar2, i9)) {
                            k1 k1Var9 = l1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 12:
                        if (z(zVar, zVar2, i9)) {
                            k1 k1Var10 = l1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 13:
                        if (z(zVar, zVar2, i9)) {
                            k1 k1Var11 = l1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 14:
                        if (z(zVar, zVar2, i9)) {
                            k1 k1Var12 = l1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 15:
                        if (z(zVar, zVar2, i9)) {
                            k1 k1Var13 = l1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 16:
                        if (z(zVar, zVar2, i9)) {
                            k1 k1Var14 = l1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 17:
                        if (z(zVar, zVar2, i9)) {
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
                        long j11 = iArr[i9 + 2] & 1048575;
                        k1 k1Var15 = l1.d;
                        if (k1Var15.g(zVar, j11) == k1Var15.g(zVar2, j11)) {
                            break;
                        }
                        z10 = false;
                        break;
                }
                if (z10) {
                    i9 += 4;
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
        int i9;
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
            long j10 = 1048575 & v;
            int i14 = 1237;
            int i15 = 37;
            switch ((v & 267386880) >>> 20) {
                case 0:
                    i9 = i11 * 53;
                    doubleToLongBits = Double.doubleToLongBits(l1.d.k(zVar, j10));
                    floatToIntBits = a0.b(doubleToLongBits);
                    i11 = floatToIntBits + i9;
                    break;
                case 1:
                    i9 = i11 * 53;
                    floatToIntBits = Float.floatToIntBits(l1.d.j(zVar, j10));
                    i11 = floatToIntBits + i9;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i9 = i11 * 53;
                    doubleToLongBits = l1.d.h(zVar, j10);
                    floatToIntBits = a0.b(doubleToLongBits);
                    i11 = floatToIntBits + i9;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i9 = i11 * 53;
                    floatToIntBits = l1.d.g(zVar, j10);
                    i11 = floatToIntBits + i9;
                    break;
                case 7:
                    i10 = i11 * 53;
                    boolean i16 = l1.d.i(zVar, j10);
                    Charset charset = a0.a;
                    break;
                case 8:
                    i9 = i11 * 53;
                    floatToIntBits = ((String) l1.k(zVar, j10)).hashCode();
                    i11 = floatToIntBits + i9;
                    break;
                case 9:
                    Object k11 = l1.k(zVar, j10);
                    if (k11 != null) {
                        i15 = k11.hashCode();
                    }
                    i11 = (i11 * 53) + i15;
                    break;
                case 10:
                    i9 = i11 * 53;
                    floatToIntBits = l1.k(zVar, j10).hashCode();
                    i11 = floatToIntBits + i9;
                    break;
                case 17:
                    Object k12 = l1.k(zVar, j10);
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
                    i9 = i11 * 53;
                    k10 = l1.k(zVar, j10);
                    floatToIntBits = k10.hashCode();
                    i11 = floatToIntBits + i9;
                    break;
                case 51:
                    if (q(i13, i12, zVar)) {
                        i9 = i11 * 53;
                        doubleToLongBits2 = Double.doubleToLongBits(((Double) l1.k(zVar, j10)).doubleValue());
                        floatToIntBits = a0.b(doubleToLongBits2);
                        i11 = floatToIntBits + i9;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(i13, i12, zVar)) {
                        i9 = i11 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) l1.k(zVar, j10)).floatValue());
                        i11 = floatToIntBits + i9;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    i9 = i11 * 53;
                    doubleToLongBits2 = B(zVar, j10);
                    floatToIntBits = a0.b(doubleToLongBits2);
                    i11 = floatToIntBits + i9;
                    break;
                case 54:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    i9 = i11 * 53;
                    doubleToLongBits2 = B(zVar, j10);
                    floatToIntBits = a0.b(doubleToLongBits2);
                    i11 = floatToIntBits + i9;
                    break;
                case 55:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    i9 = i11 * 53;
                    floatToIntBits = A(zVar, j10);
                    i11 = floatToIntBits + i9;
                    break;
                case 56:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    i9 = i11 * 53;
                    doubleToLongBits2 = B(zVar, j10);
                    floatToIntBits = a0.b(doubleToLongBits2);
                    i11 = floatToIntBits + i9;
                    break;
                case 57:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    i9 = i11 * 53;
                    floatToIntBits = A(zVar, j10);
                    i11 = floatToIntBits + i9;
                    break;
                case 58:
                    if (q(i13, i12, zVar)) {
                        i10 = i11 * 53;
                        boolean booleanValue = ((Boolean) l1.k(zVar, j10)).booleanValue();
                        Charset charset2 = a0.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(i13, i12, zVar)) {
                        i9 = i11 * 53;
                        floatToIntBits = ((String) l1.k(zVar, j10)).hashCode();
                        i11 = floatToIntBits + i9;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    k10 = l1.k(zVar, j10);
                    i9 = i11 * 53;
                    floatToIntBits = k10.hashCode();
                    i11 = floatToIntBits + i9;
                    break;
                case 61:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    i9 = i11 * 53;
                    k10 = l1.k(zVar, j10);
                    floatToIntBits = k10.hashCode();
                    i11 = floatToIntBits + i9;
                    break;
                case 62:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    i9 = i11 * 53;
                    floatToIntBits = A(zVar, j10);
                    i11 = floatToIntBits + i9;
                    break;
                case 63:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    i9 = i11 * 53;
                    floatToIntBits = A(zVar, j10);
                    i11 = floatToIntBits + i9;
                    break;
                case 64:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    i9 = i11 * 53;
                    floatToIntBits = A(zVar, j10);
                    i11 = floatToIntBits + i9;
                    break;
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    i9 = i11 * 53;
                    doubleToLongBits2 = B(zVar, j10);
                    floatToIntBits = a0.b(doubleToLongBits2);
                    i11 = floatToIntBits + i9;
                    break;
                case 66:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    i9 = i11 * 53;
                    floatToIntBits = A(zVar, j10);
                    i11 = floatToIntBits + i9;
                    break;
                case 67:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    i9 = i11 * 53;
                    doubleToLongBits2 = B(zVar, j10);
                    floatToIntBits = a0.b(doubleToLongBits2);
                    i11 = floatToIntBits + i9;
                    break;
                case 68:
                    if (!q(i13, i12, zVar)) {
                        break;
                    }
                    k10 = l1.k(zVar, j10);
                    i9 = i11 * 53;
                    floatToIntBits = k10.hashCode();
                    i11 = floatToIntBits + i9;
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
    @Override // com.google.android.gms.internal.clearcut.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Object obj, byte[] bArr, int i9, int i10, m mVar) {
        Unsafe unsafe;
        int i11;
        int i12;
        d1 d1Var;
        int k10;
        Unsafe unsafe2;
        Object obj2;
        Object a2;
        Object obj3;
        int i13;
        q0 q0Var = this;
        byte[] bArr2 = bArr;
        int i14 = i10;
        m mVar2 = mVar;
        if (!q0Var.g) {
            m(obj, bArr, i9, i14, 0, mVar);
            return;
        }
        Unsafe unsafe3 = o;
        int i15 = i9;
        while (i15 < i14) {
            int i16 = i15 + 1;
            int i17 = bArr2[i15];
            if (i17 < 0) {
                i16 = o1.d(i17, bArr2, i16, mVar2);
                i17 = mVar2.a;
            }
            int i18 = i17;
            int i19 = i16;
            int i20 = i18 >>> 3;
            int i21 = i18 & 7;
            int w8 = q0Var.w(i20);
            if (w8 >= 0) {
                int i22 = q0Var.a[w8 + 1];
                int i23 = (267386880 & i22) >>> 20;
                long j10 = 1048575 & i22;
                if (i23 <= 17) {
                    switch (i23) {
                        case 0:
                            unsafe = unsafe3;
                            if (i21 != 1) {
                                i11 = i19;
                                i12 = i11;
                                z zVar = (z) obj;
                                d1Var = zVar.zzjp;
                                if (d1Var == d1.e) {
                                    d1Var = d1.b();
                                    zVar.zzjp = d1Var;
                                }
                                i15 = o1.c(i18, bArr, i12, i10, d1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i14 = i10;
                                break;
                            } else {
                                l1.d.c(obj, j10, Double.longBitsToDouble(o1.r(i19, bArr2)));
                                i15 = i19 + 8;
                                break;
                            }
                        case 1:
                            unsafe = unsafe3;
                            if (i21 == 5) {
                                l1.d.d(obj, j10, Float.intBitsToFloat(o1.o(i19, bArr2)));
                                i15 = i19 + 4;
                                break;
                            }
                            i11 = i19;
                            i12 = i11;
                            z zVar2 = (z) obj;
                            d1Var = zVar2.zzjp;
                            if (d1Var == d1.e) {
                            }
                            i15 = o1.c(i18, bArr, i12, i10, d1Var, mVar);
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
                                d1Var = zVar22.zzjp;
                                if (d1Var == d1.e) {
                                }
                                i15 = o1.c(i18, bArr, i12, i10, d1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i14 = i10;
                                break;
                            } else {
                                int m10 = o1.m(bArr2, i19, mVar2);
                                unsafe4.putLong(obj, j10, mVar2.b);
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
                                d1Var = zVar222.zzjp;
                                if (d1Var == d1.e) {
                                }
                                i15 = o1.c(i18, bArr, i12, i10, d1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i14 = i10;
                                break;
                            } else {
                                i15 = o1.f(bArr2, i19, mVar2);
                                unsafe2.putInt(obj, j10, mVar2.a);
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
                                d1Var = zVar2222.zzjp;
                                if (d1Var == d1.e) {
                                }
                                i15 = o1.c(i18, bArr, i12, i10, d1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i14 = i10;
                                break;
                            } else {
                                unsafe2.putLong(obj, j10, o1.r(i19, bArr2));
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
                                d1Var = zVar22222.zzjp;
                                if (d1Var == d1.e) {
                                }
                                i15 = o1.c(i18, bArr, i12, i10, d1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i14 = i10;
                                break;
                            } else {
                                unsafe2.putInt(obj, j10, o1.o(i19, bArr2));
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
                                d1Var = zVar222222.zzjp;
                                if (d1Var == d1.e) {
                                }
                                i15 = o1.c(i18, bArr, i12, i10, d1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i14 = i10;
                                break;
                            } else {
                                i15 = o1.m(bArr2, i19, mVar2);
                                l1.d.f(obj, j10, mVar2.b != 0);
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
                                d1Var = zVar2222222.zzjp;
                                if (d1Var == d1.e) {
                                }
                                i15 = o1.c(i18, bArr, i12, i10, d1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i14 = i10;
                                break;
                            } else {
                                if ((536870912 & i22) == 0) {
                                    i15 = o1.f(bArr2, i19, mVar2);
                                    int i24 = mVar2.a;
                                    if (i24 == 0) {
                                        mVar2.c = "";
                                    } else {
                                        mVar2.c = new String(bArr2, i15, i24, a0.a);
                                        i15 += i24;
                                    }
                                } else {
                                    i15 = o1.q(bArr2, i19, mVar2);
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
                            if (i21 != 2) {
                                i11 = i19;
                                unsafe = unsafe2;
                                i12 = i11;
                                z zVar22222222 = (z) obj;
                                d1Var = zVar22222222.zzjp;
                                if (d1Var == d1.e) {
                                }
                                i15 = o1.c(i18, bArr, i12, i10, d1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i14 = i10;
                                break;
                            } else {
                                i15 = j(q0Var.s(w8), bArr2, i19, i14, mVar2);
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
                            if (i21 != 2) {
                                i11 = i19;
                                unsafe = unsafe2;
                                i12 = i11;
                                z zVar222222222 = (z) obj;
                                d1Var = zVar222222222.zzjp;
                                if (d1Var == d1.e) {
                                }
                                i15 = o1.c(i18, bArr, i12, i10, d1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i14 = i10;
                                break;
                            } else {
                                i15 = o1.s(bArr2, i19, mVar2);
                                a2 = mVar2.c;
                                unsafe2.putObject(obj2, j10, a2);
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
                                d1Var = zVar2222222222.zzjp;
                                if (d1Var == d1.e) {
                                }
                                i15 = o1.c(i18, bArr, i12, i10, d1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i14 = i10;
                                break;
                            } else {
                                i15 = o1.f(bArr2, i19, mVar2);
                                i13 = mVar2.a;
                                unsafe2.putInt(obj3, j10, i13);
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
                                d1Var = zVar22222222222.zzjp;
                                if (d1Var == d1.e) {
                                }
                                i15 = o1.c(i18, bArr, i12, i10, d1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i14 = i10;
                                break;
                            } else {
                                i15 = o1.f(bArr2, i19, mVar2);
                                int i25 = mVar2.a;
                                i13 = (-(i25 & 1)) ^ (i25 >>> 1);
                                unsafe2.putInt(obj3, j10, i13);
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
                                d1Var = zVar222222222222.zzjp;
                                if (d1Var == d1.e) {
                                }
                                i15 = o1.c(i18, bArr, i12, i10, d1Var, mVar);
                                q0Var = this;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i14 = i10;
                                break;
                            } else {
                                int m11 = o1.m(bArr2, i19, mVar2);
                                long j11 = mVar2.b;
                                unsafe3.putLong(obj, j10, (-(j11 & 1)) ^ (j11 >>> 1));
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
                            c0 c0Var = (c0) unsafe.getObject(obj, j10);
                            if (!((k) c0Var).a) {
                                int size = c0Var.size();
                                c0Var = c0Var.d(size == 0 ? 10 : size << 1);
                                unsafe.putObject(obj, j10, c0Var);
                            }
                            i15 = h(q0Var.s(w8), i18, bArr2, i19, i14, c0Var, mVar2);
                            bArr2 = bArr;
                            i14 = i10;
                            mVar2 = mVar;
                        } else {
                            i18 = i18;
                            i11 = i19;
                            i12 = i11;
                            z zVar2222222222222 = (z) obj;
                            d1Var = zVar2222222222222.zzjp;
                            if (d1Var == d1.e) {
                            }
                            i15 = o1.c(i18, bArr, i12, i10, d1Var, mVar);
                            q0Var = this;
                            bArr2 = bArr;
                            mVar2 = mVar;
                            i14 = i10;
                        }
                    } else if (i23 <= 49) {
                        i18 = i18;
                        k10 = q0Var.l(obj, bArr, i19, i10, i18, i20, i21, w8, i22, i23, j10, mVar);
                    } else {
                        i18 = i18;
                        if (i23 != 50) {
                            k10 = q0Var.k(obj, bArr, i19, i10, i18, i20, i21, i22, i23, j10, w8, mVar);
                            if (k10 != i19) {
                                q0Var = this;
                                bArr2 = bArr;
                                i14 = i10;
                                mVar2 = mVar;
                                i15 = k10;
                            }
                            i12 = k10;
                            z zVar22222222222222 = (z) obj;
                            d1Var = zVar22222222222222.zzjp;
                            if (d1Var == d1.e) {
                            }
                            i15 = o1.c(i18, bArr, i12, i10, d1Var, mVar);
                            q0Var = this;
                            bArr2 = bArr;
                            mVar2 = mVar;
                            i14 = i10;
                        } else {
                            if (i21 == 2) {
                                q0Var.p(j10, obj, w8);
                                throw null;
                            }
                            i11 = i19;
                            i12 = i11;
                            z zVar222222222222222 = (z) obj;
                            d1Var = zVar222222222222222.zzjp;
                            if (d1Var == d1.e) {
                            }
                            i15 = o1.c(i18, bArr, i12, i10, d1Var, mVar);
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
            d1Var = zVar2222222222222222.zzjp;
            if (d1Var == d1.e) {
            }
            i15 = o1.c(i18, bArr, i12, i10, d1Var, mVar);
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

    @Override // com.google.android.gms.internal.clearcut.b1
    public final boolean g(Object obj) {
        int[] iArr;
        int i9;
        int i10 = 1;
        int[] iArr2 = this.h;
        if (iArr2 == null || iArr2.length == 0) {
            return true;
        }
        int length = iArr2.length;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            int i14 = iArr2[i12];
            int w8 = w(i14);
            int v = v(w8);
            boolean z10 = this.g;
            if (z10) {
                iArr = iArr2;
                i9 = 0;
            } else {
                int i15 = this.a[w8 + 2];
                int i16 = i15 & 1048575;
                i9 = i10 << (i15 >>> 20);
                if (i16 != i11) {
                    iArr = iArr2;
                    i13 = o.getInt(obj, i16);
                    i11 = i16;
                } else {
                    iArr = iArr2;
                }
            }
            if ((268435456 & v) != 0) {
                if (!(z10 ? r(w8, obj) : (i13 & i9) != 0)) {
                    return false;
                }
            }
            int i17 = (267386880 & v) >>> 20;
            if (i17 == 9 || i17 == 17) {
                if ((z10 ? r(w8, obj) : (i13 & i9) != 0) && !s(w8).g(l1.k(obj, v & 1048575))) {
                    return false;
                }
                i12++;
                iArr2 = iArr;
                i10 = 1;
            } else {
                if (i17 != 27) {
                    if (i17 == 60 || i17 == 68) {
                        if (q(i14, w8, obj) && !s(w8).g(l1.k(obj, v & 1048575))) {
                            return false;
                        }
                    } else if (i17 != 49) {
                        if (i17 != 50) {
                            continue;
                        } else {
                            Object k10 = l1.k(obj, v & 1048575);
                            this.n.getClass();
                            if (!((m0) k10).isEmpty()) {
                                t(w8);
                                throw new NoSuchMethodError();
                            }
                        }
                    }
                    i12++;
                    iArr2 = iArr;
                    i10 = 1;
                }
                List list = (List) l1.k(obj, v & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    b1 s10 = s(w8);
                    for (int i18 = 0; i18 < list.size(); i18++) {
                        if (!s10.g(list.get(i18))) {
                            return false;
                        }
                    }
                }
                i12++;
                iArr2 = iArr;
                i10 = 1;
            }
        }
        return true;
    }

    public final int k(Object obj, byte[] bArr, int i9, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, m mVar) {
        int i17;
        Object valueOf;
        int i18;
        Object valueOf2;
        int m10;
        long j11;
        int i19;
        Object valueOf3;
        Object object;
        Unsafe unsafe = o;
        long j12 = this.a[i16 + 2] & 1048575;
        switch (i15) {
            case 51:
                i17 = i9;
                if (i13 != 1) {
                    return i17;
                }
                valueOf = Double.valueOf(Double.longBitsToDouble(o1.r(i17, bArr)));
                unsafe.putObject(obj, j10, valueOf);
                m10 = i17 + 8;
                unsafe.putInt(obj, j12, i12);
                return m10;
            case 52:
                i18 = i9;
                if (i13 != 5) {
                    return i18;
                }
                valueOf2 = Float.valueOf(Float.intBitsToFloat(o1.o(i18, bArr)));
                unsafe.putObject(obj, j10, valueOf2);
                m10 = i18 + 4;
                unsafe.putInt(obj, j12, i12);
                return m10;
            case 53:
            case 54:
                if (i13 != 0) {
                    return i9;
                }
                m10 = o1.m(bArr, i9, mVar);
                j11 = mVar.b;
                valueOf3 = Long.valueOf(j11);
                unsafe.putObject(obj, j10, valueOf3);
                unsafe.putInt(obj, j12, i12);
                return m10;
            case 55:
            case 62:
                if (i13 != 0) {
                    return i9;
                }
                m10 = o1.f(bArr, i9, mVar);
                i19 = mVar.a;
                valueOf3 = Integer.valueOf(i19);
                unsafe.putObject(obj, j10, valueOf3);
                unsafe.putInt(obj, j12, i12);
                return m10;
            case 56:
            case VoIPService.CALL_MIN_LAYER /* 65 */:
                i17 = i9;
                if (i13 != 1) {
                    return i17;
                }
                valueOf = Long.valueOf(o1.r(i17, bArr));
                unsafe.putObject(obj, j10, valueOf);
                m10 = i17 + 8;
                unsafe.putInt(obj, j12, i12);
                return m10;
            case 57:
            case 64:
                i18 = i9;
                if (i13 != 5) {
                    return i18;
                }
                valueOf2 = Integer.valueOf(o1.o(i18, bArr));
                unsafe.putObject(obj, j10, valueOf2);
                m10 = i18 + 4;
                unsafe.putInt(obj, j12, i12);
                return m10;
            case 58:
                if (i13 != 0) {
                    return i9;
                }
                m10 = o1.m(bArr, i9, mVar);
                valueOf3 = Boolean.valueOf(mVar.b != 0);
                unsafe.putObject(obj, j10, valueOf3);
                unsafe.putInt(obj, j12, i12);
                return m10;
            case 59:
                if (i13 != 2) {
                    return i9;
                }
                int f10 = o1.f(bArr, i9, mVar);
                int i20 = mVar.a;
                if (i20 == 0) {
                    unsafe.putObject(obj, j10, "");
                } else {
                    if ((i14 & TLObject.FLAG_29) != 0) {
                        if (!n1.a.t(bArr, f10, f10 + i20)) {
                            throw new d0("Protocol message had invalid UTF-8.");
                        }
                    }
                    unsafe.putObject(obj, j10, new String(bArr, f10, i20, a0.a));
                    f10 += i20;
                }
                unsafe.putInt(obj, j12, i12);
                return f10;
            case 60:
                if (i13 != 2) {
                    return i9;
                }
                int j13 = j(s(i16), bArr, i9, i10, mVar);
                object = unsafe.getInt(obj, j12) == i12 ? unsafe.getObject(obj, j10) : null;
                Object obj2 = mVar.c;
                if (object != null) {
                    obj2 = a0.a(object, obj2);
                }
                unsafe.putObject(obj, j10, obj2);
                unsafe.putInt(obj, j12, i12);
                return j13;
            case 61:
                if (i13 != 2) {
                    return i9;
                }
                int f11 = o1.f(bArr, i9, mVar);
                int i21 = mVar.a;
                if (i21 == 0) {
                    unsafe.putObject(obj, j10, o.c);
                } else {
                    unsafe.putObject(obj, j10, o.n(f11, i21, bArr));
                    f11 += i21;
                }
                unsafe.putInt(obj, j12, i12);
                return f11;
            case 63:
                if (i13 != 0) {
                    return i9;
                }
                int f12 = o1.f(bArr, i9, mVar);
                int i22 = mVar.a;
                b0 u10 = u(i16);
                if (u10 == null || u10.a(i22) != null) {
                    unsafe.putObject(obj, j10, Integer.valueOf(i22));
                    m10 = f12;
                    unsafe.putInt(obj, j12, i12);
                    return m10;
                }
                z zVar = (z) obj;
                d1 d1Var = zVar.zzjp;
                if (d1Var == d1.e) {
                    d1Var = d1.b();
                    zVar.zzjp = d1Var;
                }
                d1Var.a(i11, Long.valueOf(i22));
                return f12;
            case 66:
                if (i13 != 0) {
                    return i9;
                }
                m10 = o1.f(bArr, i9, mVar);
                int i23 = mVar.a;
                i19 = (-(i23 & 1)) ^ (i23 >>> 1);
                valueOf3 = Integer.valueOf(i19);
                unsafe.putObject(obj, j10, valueOf3);
                unsafe.putInt(obj, j12, i12);
                return m10;
            case 67:
                if (i13 != 0) {
                    return i9;
                }
                m10 = o1.m(bArr, i9, mVar);
                long j14 = mVar.b;
                j11 = (-(j14 & 1)) ^ (j14 >>> 1);
                valueOf3 = Long.valueOf(j11);
                unsafe.putObject(obj, j10, valueOf3);
                unsafe.putInt(obj, j12, i12);
                return m10;
            case 68:
                if (i13 == 3) {
                    m10 = i(s(i16), bArr, i9, i10, (i11 & (-8)) | 4, mVar);
                    object = unsafe.getInt(obj, j12) == i12 ? unsafe.getObject(obj, j10) : null;
                    Object obj3 = mVar.c;
                    if (object != null) {
                        obj3 = a0.a(object, obj3);
                    }
                    unsafe.putObject(obj, j10, obj3);
                    unsafe.putInt(obj, j12, i12);
                    return m10;
                }
            default:
                return i9;
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
    public final int l(Object obj, byte[] bArr, int i9, int i10, int i11, int i12, int i13, int i14, long j10, int i15, long j11, m mVar) {
        Unsafe unsafe = o;
        c0 c0Var = (c0) unsafe.getObject(obj, j11);
        if (!((k) c0Var).a) {
            int size = c0Var.size();
            c0Var = c0Var.d(size == 0 ? 10 : size << 1);
            unsafe.putObject(obj, j11, c0Var);
        }
        switch (i15) {
            case 18:
            case 35:
                if (i13 != 2) {
                    if (i13 == 1) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        Double.longBitsToDouble(o1.r(i9, bArr));
                        throw null;
                    }
                    return i9;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f10 = o1.f(bArr, i9, mVar);
                int i16 = mVar.a + f10;
                if (f10 < i16) {
                    Double.longBitsToDouble(o1.r(f10, bArr));
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
                        Float.intBitsToFloat(o1.o(i9, bArr));
                        throw null;
                    }
                    return i9;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f11 = o1.f(bArr, i9, mVar);
                int i17 = mVar.a + f11;
                if (f11 < i17) {
                    Float.intBitsToFloat(o1.o(f11, bArr));
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
                        o1.m(bArr, i9, mVar);
                        throw null;
                    }
                    return i9;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f12 = o1.f(bArr, i9, mVar);
                int i18 = mVar.a + f12;
                if (f12 < i18) {
                    o1.m(bArr, f12, mVar);
                    throw null;
                }
                if (f12 == i18) {
                    return f12;
                }
                throw d0.a();
            case 22:
            case 29:
            case Maneuver.TYPE_DESTINATION /* 39 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                if (i13 != 2) {
                    if (i13 == 0) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        o1.f(bArr, i9, mVar);
                        throw null;
                    }
                    return i9;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f13 = o1.f(bArr, i9, mVar);
                int i19 = mVar.a + f13;
                if (f13 < i19) {
                    o1.f(bArr, f13, mVar);
                    throw null;
                }
                if (f13 == i19) {
                    return f13;
                }
                throw d0.a();
            case 23:
            case 32:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                if (i13 != 2) {
                    if (i13 == 1) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        o1.r(i9, bArr);
                        throw null;
                    }
                    return i9;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f14 = o1.f(bArr, i9, mVar);
                int i20 = mVar.a + f14;
                if (f14 < i20) {
                    o1.r(f14, bArr);
                    throw null;
                }
                if (f14 == i20) {
                    return f14;
                }
                throw d0.a();
            case 24:
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                if (i13 != 2) {
                    if (i13 == 5) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        o1.o(i9, bArr);
                        throw null;
                    }
                    return i9;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f15 = o1.f(bArr, i9, mVar);
                int i21 = mVar.a + f15;
                if (f15 < i21) {
                    o1.o(f15, bArr);
                    throw null;
                }
                if (f15 == i21) {
                    return f15;
                }
                throw d0.a();
            case 25:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                if (i13 != 2) {
                    if (i13 == 0) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        o1.m(bArr, i9, mVar);
                        throw null;
                    }
                    return i9;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f16 = o1.f(bArr, i9, mVar);
                int i22 = mVar.a + f16;
                if (f16 < i22) {
                    o1.m(bArr, f16, mVar);
                    throw null;
                }
                if (f16 == i22) {
                    return f16;
                }
                throw d0.a();
            case 26:
                if (i13 == 2) {
                    long j12 = j10 & 536870912;
                    int f17 = o1.f(bArr, i9, mVar);
                    int i23 = mVar.a;
                    if (j12 == 0) {
                        if (i23 != 0) {
                            c0Var.add(new String(bArr, f17, i23, a0.a));
                            f17 += i23;
                            while (f17 < i10) {
                                int f18 = o1.f(bArr, f17, mVar);
                                if (i11 != mVar.a) {
                                    return f17;
                                }
                                f17 = o1.f(bArr, f18, mVar);
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
                    if (i23 != 0) {
                        int i25 = f17 + i23;
                        if (!n1.a.t(bArr, f17, i25)) {
                            throw new d0("Protocol message had invalid UTF-8.");
                        }
                        c0Var.add(new String(bArr, f17, i23, a0.a));
                        f17 = i25;
                        while (f17 < i10) {
                            int f19 = o1.f(bArr, f17, mVar);
                            if (i11 != mVar.a) {
                                return f17;
                            }
                            f17 = o1.f(bArr, f19, mVar);
                            int i26 = mVar.a;
                            if (i26 != 0) {
                                int i27 = f17 + i26;
                                if (!n1.a.t(bArr, f17, i27)) {
                                    throw new d0("Protocol message had invalid UTF-8.");
                                }
                                c0Var.add(new String(bArr, f17, i26, a0.a));
                                f17 = i27;
                            }
                        }
                        return f17;
                    }
                    c0Var.add("");
                    while (f17 < i10) {
                    }
                    return f17;
                }
                return i9;
            case 27:
                if (i13 == 2) {
                    return h(s(i14), i11, bArr, i9, i10, c0Var, mVar);
                }
                return i9;
            case 28:
                if (i13 == 2) {
                    int f20 = o1.f(bArr, i9, mVar);
                    int i28 = mVar.a;
                    break;
                }
                return i9;
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                if (i13 != 2) {
                    if (i13 == 0) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        o1.f(bArr, i9, mVar);
                        throw null;
                    }
                    return i9;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f21 = o1.f(bArr, i9, mVar);
                int i29 = mVar.a + f21;
                if (f21 < i29) {
                    o1.f(bArr, f21, mVar);
                    throw null;
                }
                if (f21 != i29) {
                    throw d0.a();
                }
                z zVar = (z) obj;
                d1 d1Var = zVar.zzjp;
                d1 d1Var2 = d1Var != d1.e ? d1Var : null;
                b0 u10 = u(i14);
                Class cls = c1.a;
                if (u10 != null) {
                    e1 e1Var = this.m;
                    if (c0Var != null) {
                        int size2 = c0Var.size();
                        int i30 = 0;
                        for (int i31 = 0; i31 < size2; i31++) {
                            Integer num = (Integer) c0Var.get(i31);
                            int intValue = num.intValue();
                            if (u10.a(intValue) != null) {
                                if (i31 != i30) {
                                    c0Var.set(i30, num);
                                }
                                i30++;
                            } else {
                                if (d1Var2 == null) {
                                    e1Var.getClass();
                                    d1Var2 = d1.b();
                                }
                                e1Var.getClass();
                                d1Var2.a(i12 << 3, Long.valueOf(intValue));
                            }
                        }
                        if (i30 != size2) {
                            c0Var.subList(i30, size2).clear();
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
                                d1Var2.a(i12 << 3, Long.valueOf(intValue2));
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
                if (i13 != 2) {
                    if (i13 == 0) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        o1.f(bArr, i9, mVar);
                        throw null;
                    }
                    return i9;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f22 = o1.f(bArr, i9, mVar);
                int i32 = mVar.a + f22;
                if (f22 < i32) {
                    o1.f(bArr, f22, mVar);
                    throw null;
                }
                if (f22 == i32) {
                    return f22;
                }
                throw d0.a();
            case 34:
            case 48:
                if (i13 != 2) {
                    if (i13 == 0) {
                        if (c0Var != null) {
                            throw new ClassCastException();
                        }
                        o1.m(bArr, i9, mVar);
                        throw null;
                    }
                    return i9;
                }
                if (c0Var != null) {
                    throw new ClassCastException();
                }
                int f23 = o1.f(bArr, i9, mVar);
                int i33 = mVar.a + f23;
                if (f23 < i33) {
                    o1.m(bArr, f23, mVar);
                    throw null;
                }
                if (f23 == i33) {
                    return f23;
                }
                throw d0.a();
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                if (i13 == 3) {
                    b1 s10 = s(i14);
                    int i34 = (i11 & (-8)) | 4;
                    int i35 = i(s10, bArr, i9, i10, i34, mVar);
                    b1 b1Var = s10;
                    m mVar2 = mVar;
                    c0Var.add(mVar2.c);
                    while (i35 < i10) {
                        int f24 = o1.f(bArr, i35, mVar2);
                        if (i11 != mVar2.a) {
                            return i35;
                        }
                        m mVar3 = mVar2;
                        b1 b1Var2 = b1Var;
                        i35 = i(b1Var2, bArr, f24, i10, i34, mVar3);
                        c0Var.add(mVar3.c);
                        b1Var = b1Var2;
                        mVar2 = mVar3;
                    }
                    return i35;
                }
                return i9;
            default:
                return i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x03d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(Object obj, byte[] bArr, int i9, int i10, int i11, m mVar) {
        q0 q0Var;
        int[] iArr;
        int i12;
        Unsafe unsafe;
        int i13;
        Object obj2;
        int i14;
        int i15;
        d1 d1Var;
        int i16;
        char c10;
        int i17;
        byte[] bArr2;
        Unsafe unsafe2;
        int i18;
        int i19;
        Unsafe unsafe3;
        Unsafe unsafe4;
        byte[] bArr3;
        int i20;
        m mVar2;
        Unsafe unsafe5;
        int i21;
        int i22;
        int q10;
        Object a2;
        m mVar3;
        int l10;
        q0 q0Var2 = this;
        Object obj3 = obj;
        byte[] bArr4 = bArr;
        int i23 = i10;
        m mVar4 = mVar;
        Unsafe unsafe6 = o;
        int i24 = -1;
        int i25 = i9;
        int i26 = 0;
        int i27 = -1;
        int i28 = 0;
        while (true) {
            int[] iArr2 = q0Var2.a;
            if (i25 < i23) {
                int i29 = i25 + 1;
                int i30 = bArr4[i25];
                if (i30 < 0) {
                    i29 = o1.d(i30, bArr4, i29, mVar4);
                    i30 = mVar4.a;
                }
                int i31 = i30;
                int i32 = i29;
                int i33 = i31 >>> 3;
                int i34 = i31 & 7;
                int w8 = q0Var2.w(i33);
                d1 d1Var2 = d1.e;
                if (w8 != i24) {
                    int i35 = iArr2[w8 + 1];
                    int i36 = (i35 & 267386880) >>> 20;
                    int i37 = i31;
                    long j10 = i35 & 1048575;
                    if (i36 <= 17) {
                        int i38 = iArr2[w8 + 2];
                        int i39 = 1 << (i38 >>> 20);
                        int i40 = i38 & 1048575;
                        if (i40 != i27) {
                            i16 = i35;
                            i24 = -1;
                            iArr = iArr2;
                            c10 = 1;
                            if (i27 != -1) {
                                unsafe6.putInt(obj3, i27, i28);
                            }
                            i17 = i40;
                            i14 = unsafe6.getInt(obj3, i40);
                        } else {
                            iArr = iArr2;
                            i16 = i35;
                            i24 = -1;
                            c10 = 1;
                            i14 = i28;
                            i17 = i27;
                        }
                        switch (i36) {
                            case 0:
                                bArr2 = bArr;
                                unsafe2 = unsafe6;
                                i18 = i32;
                                i19 = i10;
                                mVar4 = mVar;
                                if (i34 == 1) {
                                    l1.d.c(obj3, j10, Double.longBitsToDouble(o1.r(i18, bArr2)));
                                    i25 = i18 + 8;
                                    int i41 = i17;
                                    i28 = i14 | i39;
                                    bArr4 = bArr2;
                                    i27 = i41;
                                    i23 = i19;
                                    unsafe6 = unsafe2;
                                    i26 = i37;
                                    break;
                                } else {
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i26 = i37;
                                    i12 = i17;
                                    i28 = i14;
                                    if (i26 != i13 && i13 != 0) {
                                        i23 = i10;
                                        i25 = i15;
                                        i24 = -1;
                                        break;
                                    } else {
                                        z zVar = (z) obj2;
                                        d1Var = zVar.zzjp;
                                        if (d1Var == d1Var2) {
                                            d1Var = d1.b();
                                            zVar.zzjp = d1Var;
                                        }
                                        int i42 = i26;
                                        int c11 = o1.c(i42, bArr, i15, i10, d1Var, mVar);
                                        i26 = i42;
                                        bArr4 = bArr;
                                        mVar4 = mVar;
                                        i23 = i10;
                                        q0Var2 = q0Var;
                                        unsafe6 = unsafe;
                                        i24 = -1;
                                        i25 = c11;
                                        obj3 = obj2;
                                        i27 = i12;
                                        break;
                                    }
                                }
                            case 1:
                                bArr2 = bArr;
                                unsafe2 = unsafe6;
                                i18 = i32;
                                i19 = i10;
                                mVar4 = mVar;
                                if (i34 == 5) {
                                    l1.d.d(obj3, j10, Float.intBitsToFloat(o1.o(i18, bArr2)));
                                    i25 = i18 + 4;
                                    int i412 = i17;
                                    i28 = i14 | i39;
                                    bArr4 = bArr2;
                                    i27 = i412;
                                    i23 = i19;
                                    unsafe6 = unsafe2;
                                    i26 = i37;
                                    break;
                                } else {
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i26 = i37;
                                    i12 = i17;
                                    i28 = i14;
                                    if (i26 != i13) {
                                    }
                                    z zVar2 = (z) obj2;
                                    d1Var = zVar2.zzjp;
                                    if (d1Var == d1Var2) {
                                    }
                                    int i422 = i26;
                                    int c112 = o1.c(i422, bArr, i15, i10, d1Var, mVar);
                                    i26 = i422;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i23 = i10;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i24 = -1;
                                    i25 = c112;
                                    obj3 = obj2;
                                    i27 = i12;
                                    break;
                                }
                                break;
                            case 2:
                            case 3:
                                unsafe3 = unsafe6;
                                i18 = i32;
                                i19 = i10;
                                mVar4 = mVar;
                                if (i34 == 0) {
                                    int m10 = o1.m(bArr, i18, mVar4);
                                    unsafe3.putLong(obj3, j10, mVar4.b);
                                    unsafe2 = unsafe3;
                                    int i43 = i17;
                                    i28 = i14 | i39;
                                    bArr4 = bArr;
                                    i27 = i43;
                                    i25 = m10;
                                    i23 = i19;
                                    unsafe6 = unsafe2;
                                    i26 = i37;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i26 = i37;
                                    i12 = i17;
                                    i28 = i14;
                                    if (i26 != i13) {
                                    }
                                    z zVar22 = (z) obj2;
                                    d1Var = zVar22.zzjp;
                                    if (d1Var == d1Var2) {
                                    }
                                    int i4222 = i26;
                                    int c1122 = o1.c(i4222, bArr, i15, i10, d1Var, mVar);
                                    i26 = i4222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i23 = i10;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i24 = -1;
                                    i25 = c1122;
                                    obj3 = obj2;
                                    i27 = i12;
                                    break;
                                }
                                break;
                            case 4:
                            case 11:
                                unsafe3 = unsafe6;
                                i18 = i32;
                                mVar4 = mVar;
                                if (i34 == 0) {
                                    int f10 = o1.f(bArr, i18, mVar4);
                                    unsafe3.putInt(obj3, j10, mVar4.a);
                                    i23 = i10;
                                    unsafe6 = unsafe3;
                                    bArr4 = bArr;
                                    i27 = i17;
                                    i28 = i14 | i39;
                                    i25 = f10;
                                    i26 = i37;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i26 = i37;
                                    i12 = i17;
                                    i28 = i14;
                                    if (i26 != i13) {
                                    }
                                    z zVar222 = (z) obj2;
                                    d1Var = zVar222.zzjp;
                                    if (d1Var == d1Var2) {
                                    }
                                    int i42222 = i26;
                                    int c11222 = o1.c(i42222, bArr, i15, i10, d1Var, mVar);
                                    i26 = i42222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i23 = i10;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i24 = -1;
                                    i25 = c11222;
                                    obj3 = obj2;
                                    i27 = i12;
                                    break;
                                }
                                break;
                            case 5:
                            case 14:
                                unsafe4 = unsafe6;
                                if (i34 == 1) {
                                    i37 = i37;
                                    mVar4 = mVar;
                                    unsafe4.putLong(obj3, j10, o1.r(i32, bArr));
                                    i25 = i32 + 8;
                                    unsafe6 = unsafe4;
                                    bArr4 = bArr;
                                    i27 = i17;
                                    i28 = i14 | i39;
                                    i23 = i10;
                                    i26 = i37;
                                    break;
                                } else {
                                    i18 = i32;
                                    i37 = i37;
                                    unsafe2 = unsafe4;
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i26 = i37;
                                    i12 = i17;
                                    i28 = i14;
                                    if (i26 != i13) {
                                    }
                                    z zVar2222 = (z) obj2;
                                    d1Var = zVar2222.zzjp;
                                    if (d1Var == d1Var2) {
                                    }
                                    int i422222 = i26;
                                    int c112222 = o1.c(i422222, bArr, i15, i10, d1Var, mVar);
                                    i26 = i422222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i23 = i10;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i24 = -1;
                                    i25 = c112222;
                                    obj3 = obj2;
                                    i27 = i12;
                                    break;
                                }
                                break;
                            case 6:
                            case 13:
                                bArr3 = bArr;
                                i20 = i32;
                                mVar2 = mVar;
                                unsafe5 = unsafe6;
                                i21 = i37;
                                i22 = i10;
                                if (i34 == 5) {
                                    unsafe5.putInt(obj3, j10, o1.o(i20, bArr3));
                                    i25 = i20 + 4;
                                    int i44 = i17;
                                    i28 = i14 | i39;
                                    bArr4 = bArr3;
                                    i27 = i44;
                                    int i45 = i22;
                                    unsafe6 = unsafe5;
                                    i23 = i45;
                                    mVar4 = mVar2;
                                    i26 = i21;
                                    break;
                                } else {
                                    i18 = i20;
                                    unsafe2 = unsafe5;
                                    i37 = i21;
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i26 = i37;
                                    i12 = i17;
                                    i28 = i14;
                                    if (i26 != i13) {
                                    }
                                    z zVar22222 = (z) obj2;
                                    d1Var = zVar22222.zzjp;
                                    if (d1Var == d1Var2) {
                                    }
                                    int i4222222 = i26;
                                    int c1122222 = o1.c(i4222222, bArr, i15, i10, d1Var, mVar);
                                    i26 = i4222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i23 = i10;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i24 = -1;
                                    i25 = c1122222;
                                    obj3 = obj2;
                                    i27 = i12;
                                    break;
                                }
                                break;
                            case 7:
                                bArr3 = bArr;
                                i20 = i32;
                                mVar2 = mVar;
                                unsafe5 = unsafe6;
                                i21 = i37;
                                i22 = i10;
                                if (i34 == 0) {
                                    i25 = o1.m(bArr3, i20, mVar2);
                                    l1.d.f(obj3, j10, mVar2.b != 0);
                                    int i442 = i17;
                                    i28 = i14 | i39;
                                    bArr4 = bArr3;
                                    i27 = i442;
                                    int i452 = i22;
                                    unsafe6 = unsafe5;
                                    i23 = i452;
                                    mVar4 = mVar2;
                                    i26 = i21;
                                    break;
                                } else {
                                    i18 = i20;
                                    unsafe2 = unsafe5;
                                    i37 = i21;
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i26 = i37;
                                    i12 = i17;
                                    i28 = i14;
                                    if (i26 != i13) {
                                    }
                                    z zVar222222 = (z) obj2;
                                    d1Var = zVar222222.zzjp;
                                    if (d1Var == d1Var2) {
                                    }
                                    int i42222222 = i26;
                                    int c11222222 = o1.c(i42222222, bArr, i15, i10, d1Var, mVar);
                                    i26 = i42222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i23 = i10;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i24 = -1;
                                    i25 = c11222222;
                                    obj3 = obj2;
                                    i27 = i12;
                                    break;
                                }
                                break;
                            case 8:
                                bArr3 = bArr;
                                i20 = i32;
                                mVar2 = mVar;
                                unsafe5 = unsafe6;
                                i21 = i37;
                                i22 = i10;
                                if (i34 == 2) {
                                    if ((i16 & TLObject.FLAG_29) == 0) {
                                        q10 = o1.f(bArr3, i20, mVar2);
                                        int i46 = mVar2.a;
                                        if (i46 == 0) {
                                            mVar2.c = "";
                                        } else {
                                            mVar2.c = new String(bArr3, q10, i46, a0.a);
                                            q10 += i46;
                                        }
                                    } else {
                                        q10 = o1.q(bArr3, i20, mVar2);
                                    }
                                    i25 = q10;
                                    a2 = mVar2.c;
                                    unsafe5.putObject(obj3, j10, a2);
                                    int i4422 = i17;
                                    i28 = i14 | i39;
                                    bArr4 = bArr3;
                                    i27 = i4422;
                                    int i4522 = i22;
                                    unsafe6 = unsafe5;
                                    i23 = i4522;
                                    mVar4 = mVar2;
                                    i26 = i21;
                                    break;
                                } else {
                                    i18 = i20;
                                    unsafe2 = unsafe5;
                                    i37 = i21;
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i26 = i37;
                                    i12 = i17;
                                    i28 = i14;
                                    if (i26 != i13) {
                                    }
                                    z zVar2222222 = (z) obj2;
                                    d1Var = zVar2222222.zzjp;
                                    if (d1Var == d1Var2) {
                                    }
                                    int i422222222 = i26;
                                    int c112222222 = o1.c(i422222222, bArr, i15, i10, d1Var, mVar);
                                    i26 = i422222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i23 = i10;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i24 = -1;
                                    i25 = c112222222;
                                    obj3 = obj2;
                                    i27 = i12;
                                    break;
                                }
                                break;
                            case 9:
                                bArr3 = bArr;
                                i20 = i32;
                                mVar2 = mVar;
                                unsafe5 = unsafe6;
                                i21 = i37;
                                i22 = i10;
                                if (i34 == 2) {
                                    i25 = j(q0Var2.s(w8), bArr3, i20, i22, mVar2);
                                    a2 = (i14 & i39) == 0 ? mVar2.c : a0.a(unsafe5.getObject(obj3, j10), mVar2.c);
                                    unsafe5.putObject(obj3, j10, a2);
                                    int i44222 = i17;
                                    i28 = i14 | i39;
                                    bArr4 = bArr3;
                                    i27 = i44222;
                                    int i45222 = i22;
                                    unsafe6 = unsafe5;
                                    i23 = i45222;
                                    mVar4 = mVar2;
                                    i26 = i21;
                                    break;
                                } else {
                                    i18 = i20;
                                    unsafe2 = unsafe5;
                                    i37 = i21;
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i26 = i37;
                                    i12 = i17;
                                    i28 = i14;
                                    if (i26 != i13) {
                                    }
                                    z zVar22222222 = (z) obj2;
                                    d1Var = zVar22222222.zzjp;
                                    if (d1Var == d1Var2) {
                                    }
                                    int i4222222222 = i26;
                                    int c1122222222 = o1.c(i4222222222, bArr, i15, i10, d1Var, mVar);
                                    i26 = i4222222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i23 = i10;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i24 = -1;
                                    i25 = c1122222222;
                                    obj3 = obj2;
                                    i27 = i12;
                                    break;
                                }
                                break;
                            case 10:
                                bArr3 = bArr;
                                i20 = i32;
                                mVar2 = mVar;
                                unsafe5 = unsafe6;
                                i21 = i37;
                                i22 = i10;
                                if (i34 == 2) {
                                    i25 = o1.s(bArr3, i20, mVar2);
                                    a2 = mVar2.c;
                                    unsafe5.putObject(obj3, j10, a2);
                                    int i442222 = i17;
                                    i28 = i14 | i39;
                                    bArr4 = bArr3;
                                    i27 = i442222;
                                    int i452222 = i22;
                                    unsafe6 = unsafe5;
                                    i23 = i452222;
                                    mVar4 = mVar2;
                                    i26 = i21;
                                    break;
                                } else {
                                    i18 = i20;
                                    unsafe2 = unsafe5;
                                    i37 = i21;
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i26 = i37;
                                    i12 = i17;
                                    i28 = i14;
                                    if (i26 != i13) {
                                    }
                                    z zVar222222222 = (z) obj2;
                                    d1Var = zVar222222222.zzjp;
                                    if (d1Var == d1Var2) {
                                    }
                                    int i42222222222 = i26;
                                    int c11222222222 = o1.c(i42222222222, bArr, i15, i10, d1Var, mVar);
                                    i26 = i42222222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i23 = i10;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i24 = -1;
                                    i25 = c11222222222;
                                    obj3 = obj2;
                                    i27 = i12;
                                    break;
                                }
                                break;
                            case 12:
                                bArr3 = bArr;
                                mVar2 = mVar;
                                unsafe5 = unsafe6;
                                i22 = i10;
                                if (i34 == 0) {
                                    i25 = o1.f(bArr3, i32, mVar2);
                                    int i47 = mVar2.a;
                                    b0 u10 = q0Var2.u(w8);
                                    if (u10 == null || u10.a(i47) != null) {
                                        i21 = i37;
                                        unsafe5.putInt(obj3, j10, i47);
                                        int i4422222 = i17;
                                        i28 = i14 | i39;
                                        bArr4 = bArr3;
                                        i27 = i4422222;
                                        int i4522222 = i22;
                                        unsafe6 = unsafe5;
                                        i23 = i4522222;
                                        mVar4 = mVar2;
                                        i26 = i21;
                                        break;
                                    } else {
                                        z zVar3 = (z) obj3;
                                        d1 d1Var3 = zVar3.zzjp;
                                        if (d1Var3 == d1Var2) {
                                            d1Var3 = d1.b();
                                            zVar3.zzjp = d1Var3;
                                        }
                                        d1Var3.a(i37, Long.valueOf(i47));
                                        unsafe6 = unsafe5;
                                        i23 = i22;
                                        mVar4 = mVar2;
                                        i26 = i37;
                                        bArr4 = bArr3;
                                        i27 = i17;
                                        i28 = i14;
                                        break;
                                    }
                                } else {
                                    i18 = i32;
                                    unsafe2 = unsafe5;
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i26 = i37;
                                    i12 = i17;
                                    i28 = i14;
                                    if (i26 != i13) {
                                    }
                                    z zVar2222222222 = (z) obj2;
                                    d1Var = zVar2222222222.zzjp;
                                    if (d1Var == d1Var2) {
                                    }
                                    int i422222222222 = i26;
                                    int c112222222222 = o1.c(i422222222222, bArr, i15, i10, d1Var, mVar);
                                    i26 = i422222222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i23 = i10;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i24 = -1;
                                    i25 = c112222222222;
                                    obj3 = obj2;
                                    i27 = i12;
                                    break;
                                }
                                break;
                            case 15:
                                mVar3 = mVar;
                                unsafe4 = unsafe6;
                                if (i34 == 0) {
                                    i25 = o1.f(bArr, i32, mVar3);
                                    int i48 = mVar3.a;
                                    unsafe4.putInt(obj3, j10, (-(i48 & 1)) ^ (i48 >>> 1));
                                    int i49 = i17;
                                    i28 = i14 | i39;
                                    bArr4 = bArr;
                                    i27 = i49;
                                    unsafe6 = unsafe4;
                                    mVar4 = mVar3;
                                    i26 = i37;
                                    i23 = i10;
                                    break;
                                } else {
                                    i18 = i32;
                                    unsafe2 = unsafe4;
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i26 = i37;
                                    i12 = i17;
                                    i28 = i14;
                                    if (i26 != i13) {
                                    }
                                    z zVar22222222222 = (z) obj2;
                                    d1Var = zVar22222222222.zzjp;
                                    if (d1Var == d1Var2) {
                                    }
                                    int i4222222222222 = i26;
                                    int c1122222222222 = o1.c(i4222222222222, bArr, i15, i10, d1Var, mVar);
                                    i26 = i4222222222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i23 = i10;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i24 = -1;
                                    i25 = c1122222222222;
                                    obj3 = obj2;
                                    i27 = i12;
                                    break;
                                }
                                break;
                            case 16:
                                mVar3 = mVar;
                                if (i34 == 0) {
                                    int m11 = o1.m(bArr, i32, mVar3);
                                    long j11 = mVar3.b;
                                    Unsafe unsafe7 = unsafe6;
                                    unsafe7.putLong(obj3, j10, (j11 >>> c10) ^ (-(j11 & 1)));
                                    int i50 = i17;
                                    i28 = i14 | i39;
                                    bArr4 = bArr;
                                    i27 = i50;
                                    unsafe6 = unsafe7;
                                    i25 = m11;
                                    mVar4 = mVar3;
                                    i26 = i37;
                                    i23 = i10;
                                    break;
                                } else {
                                    i18 = i32;
                                    unsafe2 = unsafe6;
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i26 = i37;
                                    i12 = i17;
                                    i28 = i14;
                                    if (i26 != i13) {
                                    }
                                    z zVar222222222222 = (z) obj2;
                                    d1Var = zVar222222222222.zzjp;
                                    if (d1Var == d1Var2) {
                                    }
                                    int i42222222222222 = i26;
                                    int c11222222222222 = o1.c(i42222222222222, bArr, i15, i10, d1Var, mVar);
                                    i26 = i42222222222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i23 = i10;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i24 = -1;
                                    i25 = c11222222222222;
                                    obj3 = obj2;
                                    i27 = i12;
                                    break;
                                }
                                break;
                            case 17:
                                if (i34 == 3) {
                                    i25 = i(q0Var2.s(w8), bArr, i32, i10, (i33 << 3) | 4, mVar);
                                    unsafe6.putObject(obj3, j10, (i14 & i39) == 0 ? mVar.c : a0.a(unsafe6.getObject(obj3, j10), mVar.c));
                                    int i51 = i17;
                                    i28 = i14 | i39;
                                    bArr4 = bArr;
                                    i27 = i51;
                                    i23 = i10;
                                    mVar4 = mVar;
                                    i26 = i37;
                                    break;
                                } else {
                                    i18 = i32;
                                    unsafe2 = unsafe6;
                                    i13 = i11;
                                    q0Var = q0Var2;
                                    obj2 = obj3;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i26 = i37;
                                    i12 = i17;
                                    i28 = i14;
                                    if (i26 != i13) {
                                    }
                                    z zVar2222222222222 = (z) obj2;
                                    d1Var = zVar2222222222222.zzjp;
                                    if (d1Var == d1Var2) {
                                    }
                                    int i422222222222222 = i26;
                                    int c112222222222222 = o1.c(i422222222222222, bArr, i15, i10, d1Var, mVar);
                                    i26 = i422222222222222;
                                    bArr4 = bArr;
                                    mVar4 = mVar;
                                    i23 = i10;
                                    q0Var2 = q0Var;
                                    unsafe6 = unsafe;
                                    i24 = -1;
                                    i25 = c112222222222222;
                                    obj3 = obj2;
                                    i27 = i12;
                                    break;
                                }
                                break;
                            default:
                                i18 = i32;
                                unsafe2 = unsafe6;
                                i13 = i11;
                                q0Var = q0Var2;
                                obj2 = obj3;
                                i15 = i18;
                                unsafe = unsafe2;
                                i26 = i37;
                                i12 = i17;
                                i28 = i14;
                                if (i26 != i13) {
                                }
                                z zVar22222222222222 = (z) obj2;
                                d1Var = zVar22222222222222.zzjp;
                                if (d1Var == d1Var2) {
                                }
                                int i4222222222222222 = i26;
                                int c1122222222222222 = o1.c(i4222222222222222, bArr, i15, i10, d1Var, mVar);
                                i26 = i4222222222222222;
                                bArr4 = bArr;
                                mVar4 = mVar;
                                i23 = i10;
                                q0Var2 = q0Var;
                                unsafe6 = unsafe;
                                i24 = -1;
                                i25 = c1122222222222222;
                                obj3 = obj2;
                                i27 = i12;
                                break;
                        }
                    } else {
                        iArr = iArr2;
                        Unsafe unsafe8 = unsafe6;
                        if (i36 != 27) {
                            i32 = i32;
                            if (i36 <= 49) {
                                i14 = i28;
                                unsafe = unsafe8;
                                i26 = i37;
                                i12 = i27;
                                l10 = q0Var2.l(obj, bArr, i32, i10, i26, i33, i34, w8, i35, i36, j10, mVar);
                                if (l10 == i32) {
                                    q0Var = q0Var2;
                                    obj2 = obj;
                                } else {
                                    i23 = i10;
                                    mVar4 = mVar;
                                    obj3 = obj;
                                    i25 = l10;
                                    i27 = i12;
                                    i28 = i14;
                                    unsafe6 = unsafe;
                                    i24 = -1;
                                    bArr4 = bArr;
                                }
                            } else {
                                unsafe = unsafe8;
                                i14 = i28;
                                i26 = i37;
                                i12 = i27;
                                if (i36 != 50) {
                                    l10 = q0Var2.k(obj, bArr, i32, i10, i26, i33, i34, i35, i36, j10, w8, mVar);
                                    q0Var = q0Var2;
                                    obj2 = obj;
                                    if (l10 != i32) {
                                        bArr4 = bArr;
                                        i23 = i10;
                                        mVar4 = mVar;
                                        i25 = l10;
                                        q0Var2 = q0Var;
                                        obj3 = obj2;
                                        i27 = i12;
                                        i28 = i14;
                                        unsafe6 = unsafe;
                                        i24 = -1;
                                    }
                                } else {
                                    if (i34 == 2) {
                                        q0Var2.p(j10, obj, w8);
                                        throw null;
                                    }
                                    q0Var = q0Var2;
                                    obj2 = obj;
                                }
                            }
                            i15 = l10;
                            i28 = i14;
                            i13 = i11;
                        } else if (i34 == 2) {
                            c0 c0Var = (c0) unsafe8.getObject(obj3, j10);
                            if (!((k) c0Var).a) {
                                int size = c0Var.size();
                                c0Var = c0Var.d(size == 0 ? 10 : size << 1);
                                unsafe8.putObject(obj3, j10, c0Var);
                            }
                            unsafe6 = unsafe8;
                            obj3 = obj;
                            i23 = i10;
                            mVar4 = mVar;
                            i25 = h(q0Var2.s(w8), i37, bArr, i32, i10, c0Var, mVar);
                            i26 = i37;
                            i24 = -1;
                            bArr4 = bArr;
                        } else {
                            q0Var = q0Var2;
                            unsafe = unsafe8;
                            i14 = i28;
                            i32 = i32;
                            i26 = i37;
                            i12 = i27;
                            obj2 = obj;
                        }
                        if (i26 != i13) {
                        }
                        z zVar222222222222222 = (z) obj2;
                        d1Var = zVar222222222222222.zzjp;
                        if (d1Var == d1Var2) {
                        }
                        int i42222222222222222 = i26;
                        int c11222222222222222 = o1.c(i42222222222222222, bArr, i15, i10, d1Var, mVar);
                        i26 = i42222222222222222;
                        bArr4 = bArr;
                        mVar4 = mVar;
                        i23 = i10;
                        q0Var2 = q0Var;
                        unsafe6 = unsafe;
                        i24 = -1;
                        i25 = c11222222222222222;
                        obj3 = obj2;
                        i27 = i12;
                    }
                } else {
                    q0Var = q0Var2;
                    iArr = iArr2;
                    i12 = i27;
                    unsafe = unsafe6;
                    i14 = i28;
                    i26 = i31;
                    obj2 = obj3;
                }
                i13 = i11;
                i15 = i32;
                i28 = i14;
                if (i26 != i13) {
                }
                z zVar2222222222222222 = (z) obj2;
                d1Var = zVar2222222222222222.zzjp;
                if (d1Var == d1Var2) {
                }
                int i422222222222222222 = i26;
                int c112222222222222222 = o1.c(i422222222222222222, bArr, i15, i10, d1Var, mVar);
                i26 = i422222222222222222;
                bArr4 = bArr;
                mVar4 = mVar;
                i23 = i10;
                q0Var2 = q0Var;
                unsafe6 = unsafe;
                i24 = -1;
                i25 = c112222222222222222;
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
        int i52 = i12;
        if (i52 != i24) {
            unsafe.putInt(obj2, i52, i28);
        }
        int[] iArr3 = q0Var.i;
        if (iArr3 != null) {
            for (int i53 : iArr3) {
                int i54 = iArr[i53];
                Object k10 = l1.k(obj2, q0Var.v(i53) & 1048575);
                if (k10 != null && q0Var.u(i53) != null) {
                    q0Var.n.getClass();
                    q0Var.t(i53);
                    throw new NoSuchMethodError();
                }
            }
        }
        if (i13 == 0) {
            if (i25 != i23) {
                throw d0.b();
            }
        } else if (i25 > i23 || i26 != i13) {
            throw d0.b();
        }
        return i25;
    }

    public final void o(int i9, Object obj, Object obj2) {
        long v = v(i9) & 1048575;
        if (r(i9, obj2)) {
            Object k10 = l1.k(obj, v);
            Object k11 = l1.k(obj2, v);
            if (k10 != null && k11 != null) {
                k11 = a0.a(k10, k11);
            } else if (k11 == null) {
                return;
            }
            l1.d(obj, v, k11);
            x(i9, obj);
        }
    }

    public final void p(long j10, Object obj, int i9) {
        m0 m0Var;
        Unsafe unsafe = o;
        t(i9);
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

    public final boolean q(int i9, int i10, Object obj) {
        return l1.d.g(obj, (long) (this.a[i10 + 2] & 1048575)) == i9;
    }

    public final boolean r(int i9, Object obj) {
        if (this.g) {
            int v = v(i9);
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
            if ((l1.d.g(obj, r6 & 1048575) & (1 << (this.a[i9 + 2] >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    public final b1 s(int i9) {
        int i10 = (i9 / 4) << 1;
        Object[] objArr = this.b;
        b1 b1Var = (b1) objArr[i10];
        if (b1Var != null) {
            return b1Var;
        }
        b1 a2 = w0.c.a((Class) objArr[i10 + 1]);
        objArr[i10] = a2;
        return a2;
    }

    public final Object t(int i9) {
        return this.b[(i9 / 4) << 1];
    }

    public final b0 u(int i9) {
        return (b0) this.b[((i9 / 4) << 1) + 1];
    }

    public final int v(int i9) {
        return this.a[i9 + 1];
    }

    public final int w(int i9) {
        int i10 = this.c;
        if (i9 >= i10) {
            int[] iArr = this.a;
            int i11 = this.e;
            if (i9 < i11) {
                int i12 = (i9 - i10) << 2;
                if (iArr[i12] == i9) {
                    return i12;
                }
                return -1;
            }
            if (i9 <= this.d) {
                int i13 = i11 - i10;
                int length = (iArr.length / 4) - 1;
                while (i13 <= length) {
                    int i14 = (length + i13) >>> 1;
                    int i15 = i14 << 2;
                    int i16 = iArr[i15];
                    if (i9 == i16) {
                        return i15;
                    }
                    if (i9 < i16) {
                        length = i14 - 1;
                    } else {
                        i13 = i14 + 1;
                    }
                }
            }
        }
        return -1;
    }

    public final void x(int i9, Object obj) {
        if (this.g) {
            return;
        }
        int i10 = this.a[i9 + 2];
        long j10 = i10 & 1048575;
        l1.b(j10, obj, l1.d.g(obj, j10) | (1 << (i10 >>> 20)));
    }

    public final void y(int i9, Object obj, Object obj2) {
        int i10;
        int v = v(i9);
        int[] iArr = this.a;
        int i11 = iArr[i9];
        long j10 = v & 1048575;
        if (q(i11, i9, obj2)) {
            Object k10 = l1.k(obj, j10);
            Object k11 = l1.k(obj2, j10);
            if (k10 != null && k11 != null) {
                l1.d(obj, j10, a0.a(k10, k11));
                i10 = iArr[i9 + 2];
            } else {
                if (k11 == null) {
                    return;
                }
                l1.d(obj, j10, k11);
                i10 = iArr[i9 + 2];
            }
            l1.b(i10 & 1048575, obj, i11);
        }
    }

    public final boolean z(z zVar, Object obj, int i9) {
        return r(i9, zVar) == r(i9, obj);
    }
}
