// default package

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.List;
import java.util.logging.Logger;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class cwd implements lzd {
    public static final Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final int e;
    public final mnd f;
    public final boolean g;
    public final int[] h;
    public final int[] i;
    public final int[] j;
    public final exd k;
    public final krd l;
    public final z2e m;
    public final oud n;

    static {
        Unsafe unsafe;
        Logger logger = k4e.a;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new r2((byte) 3));
        } catch (Throwable unused) {
            unsafe = null;
        }
        o = unsafe;
    }

    public cwd(int[] iArr, Object[] objArr, int i, int i2, int i3, mnd mndVar, boolean z, int[] iArr2, int[] iArr3, int[] iArr4, exd exdVar, krd krdVar, z2e z2eVar, akd akdVar, oud oudVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.g = z;
        this.h = iArr2;
        this.i = iArr3;
        this.j = iArr4;
        this.k = exdVar;
        this.l = krdVar;
        this.m = z2eVar;
        this.f = mndVar;
        this.n = oudVar;
    }

    public static int A(long j, Object obj) {
        return ((Integer) k4e.l(j, obj)).intValue();
    }

    public static long B(long j, Object obj) {
        return ((Long) k4e.l(j, obj)).longValue();
    }

    public static int k(lzd lzdVar, int i, byte[] bArr, int i2, int i3, dpd dpdVar, lfd lfdVar) {
        int m = m(lzdVar, bArr, i2, i3, lfdVar);
        while (true) {
            dpdVar.add(lfdVar.c);
            if (m >= i3) {
                break;
            }
            int d = i4f.d(bArr, m, lfdVar);
            if (i != lfdVar.a) {
                break;
            }
            m = m(lzdVar, bArr, d, i3, lfdVar);
        }
        return m;
    }

    public static int l(lzd lzdVar, byte[] bArr, int i, int i2, int i3, lfd lfdVar) {
        cwd cwdVar = (cwd) lzdVar;
        Object a = cwdVar.a();
        int j = cwdVar.j(a, bArr, i, i2, i3, lfdVar);
        cwdVar.b(a);
        lfdVar.c = a;
        return j;
    }

    public static int m(lzd lzdVar, byte[] bArr, int i, int i2, lfd lfdVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = i4f.c(i4, bArr, i3, lfdVar);
            i4 = lfdVar.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw mpd.a();
        }
        Object a = lzdVar.a();
        int i6 = i5 + i4;
        lzdVar.c(a, bArr, i5, i6, lfdVar);
        lzdVar.b(a);
        lfdVar.c = a;
        return i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a7 A[EDGE_INSN: B:59:0x01a7->B:60:0x01a7 BREAK  A[LOOP:0: B:18:0x0049->B:29:0x019d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static cwd n(vyd vydVar, exd exdVar, krd krdVar, z2e z2eVar, akd akdVar, oud oudVar) {
        int i;
        int i2;
        int i3;
        int[] iArr;
        gmd gmdVar;
        int i4;
        int i5;
        Field b;
        int i6;
        int i7;
        Object obj;
        int i8;
        Field b2;
        Field b3;
        if (!(vydVar instanceof vyd)) {
            grb.o();
            return null;
        }
        wyd wydVar = vydVar.b;
        int i9 = 1;
        boolean z = (wydVar.d & 1) != 1;
        if (wydVar.e == 0) {
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            int i10 = wydVar.g;
            int i11 = wydVar.h;
            i = wydVar.k;
            i2 = i10;
            i3 = i11;
        }
        int[] iArr2 = new int[i << 2];
        Object[] objArr = new Object[i << 1];
        int i12 = wydVar.i;
        int[] iArr3 = i12 > 0 ? new int[i12] : null;
        int i13 = wydVar.l;
        int[] iArr4 = i13 > 0 ? new int[i13] : null;
        boolean a = wydVar.a();
        Class cls = wydVar.c;
        Object[] objArr2 = wydVar.b;
        if (a) {
            int i14 = wydVar.s;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                if (i14 >= wydVar.j || i15 >= ((i14 - i2) << 2)) {
                    int i18 = i9;
                    int i19 = wydVar.u;
                    gmd gmdVar2 = gmd.s;
                    if (i19 <= gmdVar2.a) {
                        iArr = iArr2;
                        gmdVar = gmdVar2;
                        Field field = wydVar.x;
                        cac cacVar = k4e.d;
                        int objectFieldOffset = (int) cacVar.a.objectFieldOffset(field);
                        if ((wydVar.d & 1) == i18 && wydVar.u <= gmd.d.a) {
                            int i20 = (wydVar.w / 32) + (wydVar.f << 1);
                            Object obj2 = objArr2[i20];
                            if (obj2 instanceof Field) {
                                b = (Field) obj2;
                            } else {
                                b = wyd.b(cls, (String) obj2);
                                objArr2[i20] = b;
                            }
                            i5 = (int) cacVar.a.objectFieldOffset(b);
                            i6 = wydVar.w % 32;
                            i4 = objectFieldOffset;
                            iArr[i15] = wydVar.s;
                            int i21 = i15 + 1;
                            int i22 = i5;
                            int i23 = wydVar.t;
                            int i24 = i4;
                            int i25 = ((i23 & 512) == 0 ? TLObject.FLAG_29 : 0) | ((i23 & 256) == 0 ? TLObject.FLAG_28 : 0);
                            i7 = wydVar.u;
                            iArr[i21] = i25 | (i7 << 20) | i24;
                            iArr[i15 + 2] = (i6 << 20) | i22;
                            obj = wydVar.A;
                            if (obj == null) {
                                int i26 = (i15 / 4) << 1;
                                objArr[i26] = obj;
                                Object obj3 = wydVar.y;
                                if (obj3 != null) {
                                    objArr[i26 + 1] = obj3;
                                } else {
                                    Object obj4 = wydVar.z;
                                    if (obj4 != null) {
                                        objArr[i26 + 1] = obj4;
                                    }
                                }
                                i8 = 1;
                            } else {
                                Object obj5 = wydVar.y;
                                if (obj5 != null) {
                                    i8 = 1;
                                    objArr[((i15 / 4) << 1) + 1] = obj5;
                                } else {
                                    i8 = 1;
                                    Object obj6 = wydVar.z;
                                    if (obj6 != null) {
                                        objArr[((i15 / 4) << 1) + 1] = obj6;
                                    }
                                }
                            }
                            if (i7 != gmdVar.ordinal()) {
                                iArr3[i16] = i15;
                                i16++;
                            } else if (i7 >= 18 && i7 <= 49) {
                                iArr4[i17] = iArr[i21] & 1048575;
                                i17++;
                            }
                            if (wydVar.a()) {
                                break;
                            }
                            i14 = wydVar.s;
                        } else {
                            i4 = objectFieldOffset;
                            i5 = 0;
                        }
                    } else {
                        int i27 = wydVar.v << 1;
                        Object obj7 = objArr2[i27];
                        if (obj7 instanceof Field) {
                            b2 = (Field) obj7;
                        } else {
                            b2 = wyd.b(cls, (String) obj7);
                            objArr2[i27] = b2;
                        }
                        cac cacVar2 = k4e.d;
                        iArr = iArr2;
                        gmdVar = gmdVar2;
                        int objectFieldOffset2 = (int) cacVar2.a.objectFieldOffset(b2);
                        int i28 = (wydVar.v << 1) + 1;
                        Object obj8 = objArr2[i28];
                        if (obj8 instanceof Field) {
                            b3 = (Field) obj8;
                        } else {
                            b3 = wyd.b(cls, (String) obj8);
                            objArr2[i28] = b3;
                        }
                        i5 = (int) cacVar2.a.objectFieldOffset(b3);
                        i4 = objectFieldOffset2;
                    }
                    i6 = 0;
                    iArr[i15] = wydVar.s;
                    int i212 = i15 + 1;
                    int i222 = i5;
                    int i232 = wydVar.t;
                    int i242 = i4;
                    int i252 = ((i232 & 512) == 0 ? TLObject.FLAG_29 : 0) | ((i232 & 256) == 0 ? TLObject.FLAG_28 : 0);
                    i7 = wydVar.u;
                    iArr[i212] = i252 | (i7 << 20) | i242;
                    iArr[i15 + 2] = (i6 << 20) | i222;
                    obj = wydVar.A;
                    if (obj == null) {
                    }
                    if (i7 != gmdVar.ordinal()) {
                    }
                    if (wydVar.a()) {
                    }
                } else {
                    i8 = i9;
                    for (int i29 = 0; i29 < 4; i29++) {
                        iArr2[i15 + i29] = -1;
                    }
                    iArr = iArr2;
                }
                i15 += 4;
                i9 = i8;
                iArr2 = iArr;
            }
        } else {
            iArr = iArr2;
        }
        return new cwd(iArr, objArr, i2, i3, wydVar.j, vydVar.a, z, wydVar.m, iArr3, iArr4, exdVar, krdVar, z2eVar, akdVar, oudVar);
    }

    @Override // lzd
    public final Object a() {
        this.k.getClass();
        return this.f.a(4);
    }

    @Override // lzd
    public final void b(Object obj) {
        int[] iArr = this.i;
        if (iArr != null) {
            for (int i : iArr) {
                long v = v(i) & 1048575;
                Object l = k4e.l(v, obj);
                if (l != null) {
                    this.n.getClass();
                    ((bud) l).a = false;
                    k4e.d(v, obj, l);
                }
            }
        }
        int[] iArr2 = this.j;
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                this.l.a(i2, obj);
            }
        }
        this.m.getClass();
        ((mnd) obj).zzjp.d = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x01e4  */
    @Override // lzd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Object obj, byte[] bArr, int i, int i2, lfd lfdVar) {
        int i3;
        int i4;
        t2e t2eVar;
        int e;
        long j;
        Object obj2;
        Unsafe unsafe;
        Object obj3;
        int i5;
        Unsafe unsafe2;
        Object obj4;
        Object a;
        int h;
        cwd cwdVar = this;
        byte[] bArr2 = bArr;
        int i6 = i2;
        lfd lfdVar2 = lfdVar;
        if (!cwdVar.g) {
            j(obj, bArr, i, i6, 0, lfdVar);
            return;
        }
        int i7 = i;
        while (i7 < i6) {
            int i8 = i7 + 1;
            int i9 = bArr2[i7];
            if (i9 < 0) {
                i8 = i4f.c(i9, bArr2, i8, lfdVar2);
                i9 = lfdVar2.a;
            }
            int i10 = i9;
            int i11 = i8;
            int i12 = i10 >>> 3;
            int i13 = i10 & 7;
            int w = cwdVar.w(i12);
            if (w >= 0) {
                int i14 = cwdVar.a[w + 1];
                int i15 = (267386880 & i14) >>> 20;
                long j2 = 1048575 & i14;
                Unsafe unsafe3 = o;
                if (i15 <= 17) {
                    switch (i15) {
                        case 0:
                            if (i13 != 1) {
                                break;
                            } else {
                                k4e.d.m(obj, j2, Double.longBitsToDouble(i4f.h(i11, bArr2)));
                                i7 = i11 + 8;
                                break;
                            }
                        case 1:
                            if (i13 != 5) {
                                break;
                            } else {
                                k4e.d.n(obj, j2, Float.intBitsToFloat(i4f.f(i11, bArr2)));
                                i5 = i11 + 4;
                                i7 = i5;
                                break;
                            }
                        case 2:
                        case 3:
                            if (i13 != 0) {
                                break;
                            } else {
                                e = i4f.e(bArr2, i11, lfdVar2);
                                j = lfdVar2.b;
                                obj2 = obj;
                                unsafe3 = unsafe3;
                                unsafe3.putLong(obj2, j2, j);
                                i7 = e;
                                break;
                            }
                        case 4:
                        case 11:
                            unsafe = unsafe3;
                            obj3 = obj;
                            if (i13 != 0) {
                                break;
                            } else {
                                i5 = i4f.d(bArr2, i11, lfdVar2);
                                unsafe.putInt(obj3, j2, lfdVar2.a);
                                i7 = i5;
                                break;
                            }
                        case 5:
                        case 14:
                            if (i13 != 1) {
                                break;
                            } else {
                                unsafe3.putLong(obj, j2, i4f.h(i11, bArr2));
                                i5 = i11 + 8;
                                i7 = i5;
                                break;
                            }
                        case 6:
                        case 13:
                            if (i13 != 5) {
                                break;
                            } else {
                                unsafe3.putInt(obj, j2, i4f.f(i11, bArr2));
                                i5 = i11 + 4;
                                i7 = i5;
                                break;
                            }
                        case 7:
                            if (i13 != 0) {
                                break;
                            } else {
                                i5 = i4f.e(bArr2, i11, lfdVar2);
                                k4e.d.o(obj, j2, lfdVar2.b != 0);
                                i7 = i5;
                                break;
                            }
                        case 8:
                            unsafe2 = unsafe3;
                            obj4 = obj;
                            if (i13 != 2) {
                                break;
                            } else {
                                if ((i14 & TLObject.FLAG_29) == 0) {
                                    i5 = i4f.d(bArr2, i11, lfdVar2);
                                    int i16 = lfdVar2.a;
                                    if (i16 == 0) {
                                        lfdVar2.c = "";
                                    } else {
                                        lfdVar2.c = new String(bArr2, i5, i16, vnd.a);
                                        i5 += i16;
                                    }
                                } else {
                                    i5 = i4f.g(bArr2, i11, lfdVar2);
                                }
                                a = lfdVar2.c;
                                unsafe2.putObject(obj4, j2, a);
                                i7 = i5;
                                break;
                            }
                        case 9:
                            unsafe2 = unsafe3;
                            obj4 = obj;
                            if (i13 != 2) {
                                break;
                            } else {
                                i5 = m(cwdVar.s(w), bArr2, i11, i6, lfdVar2);
                                Object object = unsafe2.getObject(obj4, j2);
                                Object obj5 = lfdVar2.c;
                                if (object == null) {
                                    unsafe2.putObject(obj4, j2, obj5);
                                    i7 = i5;
                                    break;
                                } else {
                                    a = vnd.a(object, obj5);
                                    unsafe2.putObject(obj4, j2, a);
                                    i7 = i5;
                                }
                            }
                        case 10:
                            unsafe2 = unsafe3;
                            obj4 = obj;
                            if (i13 != 2) {
                                break;
                            } else {
                                i5 = i4f.i(bArr2, i11, lfdVar2);
                                a = lfdVar2.c;
                                unsafe2.putObject(obj4, j2, a);
                                i7 = i5;
                                break;
                            }
                        case 12:
                            unsafe = unsafe3;
                            obj3 = obj;
                            if (i13 != 0) {
                                break;
                            } else {
                                i5 = i4f.d(bArr2, i11, lfdVar2);
                                unsafe.putInt(obj3, j2, lfdVar2.a);
                                i7 = i5;
                                break;
                            }
                        case 15:
                            if (i13 != 0) {
                                break;
                            } else {
                                i5 = i4f.d(bArr2, i11, lfdVar2);
                                int i17 = lfdVar2.a;
                                unsafe3.putInt(obj, j2, (i17 >>> 1) ^ (-(i17 & 1)));
                                i7 = i5;
                                break;
                            }
                        case 16:
                            if (i13 != 0) {
                                break;
                            } else {
                                e = i4f.e(bArr2, i11, lfdVar2);
                                long j3 = lfdVar2.b;
                                j = (-(j3 & 1)) ^ (j3 >>> 1);
                                obj2 = obj;
                                unsafe3.putLong(obj2, j2, j);
                                i7 = e;
                                break;
                            }
                    }
                } else if (i15 != 27) {
                    i10 = i10;
                    if (i15 <= 49) {
                        h = cwdVar.i(obj, bArr, i11, i2, i10, i12, i13, w, i14, i15, j2, lfdVar);
                        if (h != i11) {
                            bArr2 = bArr;
                            i6 = i2;
                            lfdVar2 = lfdVar;
                            i7 = h;
                        } else {
                            i4 = h;
                            mnd mndVar = (mnd) obj;
                            t2eVar = mndVar.zzjp;
                            if (t2eVar == t2e.e) {
                                t2eVar = t2e.b();
                                mndVar.zzjp = t2eVar;
                            }
                            bArr2 = bArr;
                            lfdVar2 = lfdVar;
                            i7 = i4f.b(i10, bArr, i4, i2, t2eVar, lfdVar);
                            i6 = i2;
                            cwdVar = this;
                        }
                    } else {
                        i3 = i11;
                        if (i15 != 50) {
                            h = cwdVar.h(obj, bArr, i3, i2, i10, i12, i13, i14, i15, j2, w, lfdVar);
                            if (h == i3) {
                                i4 = h;
                                mnd mndVar2 = (mnd) obj;
                                t2eVar = mndVar2.zzjp;
                                if (t2eVar == t2e.e) {
                                }
                                bArr2 = bArr;
                                lfdVar2 = lfdVar;
                                i7 = i4f.b(i10, bArr, i4, i2, t2eVar, lfdVar);
                                i6 = i2;
                                cwdVar = this;
                            } else {
                                cwdVar = this;
                                bArr2 = bArr;
                                i6 = i2;
                                lfdVar2 = lfdVar;
                                i7 = h;
                            }
                        } else if (i13 == 2) {
                            cwdVar.o(j2, obj, w);
                            throw null;
                        }
                    }
                } else if (i13 == 2) {
                    dpd dpdVar = (dpd) unsafe3.getObject(obj, j2);
                    if (!((wed) dpdVar).a) {
                        int size = dpdVar.size();
                        dpdVar = dpdVar.f(size == 0 ? 10 : size << 1);
                        unsafe3.putObject(obj, j2, dpdVar);
                    }
                    i7 = k(cwdVar.s(w), i10, bArr2, i11, i6, dpdVar, lfdVar2);
                    bArr2 = bArr;
                    i6 = i2;
                    lfdVar2 = lfdVar;
                } else {
                    i10 = i10;
                }
                i4 = i3;
                mnd mndVar22 = (mnd) obj;
                t2eVar = mndVar22.zzjp;
                if (t2eVar == t2e.e) {
                }
                bArr2 = bArr;
                lfdVar2 = lfdVar;
                i7 = i4f.b(i10, bArr, i4, i2, t2eVar, lfdVar);
                i6 = i2;
                cwdVar = this;
            }
            i3 = i11;
            i4 = i3;
            mnd mndVar222 = (mnd) obj;
            t2eVar = mndVar222.zzjp;
            if (t2eVar == t2e.e) {
            }
            bArr2 = bArr;
            lfdVar2 = lfdVar;
            i7 = i4f.b(i10, bArr, i4, i2, t2eVar, lfdVar);
            i6 = i2;
            cwdVar = this;
        }
        if (i7 != i6) {
            throw mpd.b();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // lzd
    public final void d(mnd mndVar, mnd mndVar2) {
        mnd mndVar3;
        long k;
        Unsafe unsafe;
        int i;
        mndVar2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                mnd mndVar4 = mndVar;
                if (this.g) {
                    return;
                }
                wzd.a(this.m, mndVar4, mndVar2);
                return;
            }
            int v = v(i2);
            long j = v & 1048575;
            int i3 = iArr[i2];
            switch ((v & 267386880) >>> 20) {
                case 0:
                    mndVar3 = mndVar;
                    if (!r(i2, mndVar2)) {
                        break;
                    } else {
                        cac cacVar = k4e.d;
                        cacVar.m(mndVar3, j, cacVar.A(mndVar2, j));
                        x(mndVar3, i2);
                        break;
                    }
                case 1:
                    mndVar3 = mndVar;
                    if (!r(i2, mndVar2)) {
                        break;
                    } else {
                        cac cacVar2 = k4e.d;
                        cacVar2.n(mndVar3, j, cacVar2.z(j, mndVar2));
                        x(mndVar3, i2);
                        break;
                    }
                case 2:
                    mndVar3 = mndVar;
                    if (!r(i2, mndVar2)) {
                        break;
                    }
                    k = k4e.k(j, mndVar2);
                    unsafe = k4e.d.a;
                    unsafe.putLong(mndVar3, j, k);
                    x(mndVar3, i2);
                    break;
                case 3:
                    mndVar3 = mndVar;
                    if (!r(i2, mndVar2)) {
                        break;
                    }
                    k = k4e.k(j, mndVar2);
                    unsafe = k4e.d.a;
                    unsafe.putLong(mndVar3, j, k);
                    x(mndVar3, i2);
                    break;
                case 4:
                    mndVar3 = mndVar;
                    if (!r(i2, mndVar2)) {
                        break;
                    }
                    k4e.c(j, mndVar3, k4e.j(j, mndVar2));
                    x(mndVar3, i2);
                    break;
                case 5:
                    mndVar3 = mndVar;
                    if (!r(i2, mndVar2)) {
                        break;
                    }
                    k = k4e.k(j, mndVar2);
                    unsafe = k4e.d.a;
                    unsafe.putLong(mndVar3, j, k);
                    x(mndVar3, i2);
                    break;
                case 6:
                    mndVar3 = mndVar;
                    if (!r(i2, mndVar2)) {
                        break;
                    }
                    k4e.c(j, mndVar3, k4e.j(j, mndVar2));
                    x(mndVar3, i2);
                    break;
                case 7:
                    mndVar3 = mndVar;
                    if (!r(i2, mndVar2)) {
                        break;
                    } else {
                        cac cacVar3 = k4e.d;
                        cacVar3.o(mndVar3, j, cacVar3.y(j, mndVar2));
                        x(mndVar3, i2);
                        break;
                    }
                case 8:
                    mndVar3 = mndVar;
                    if (!r(i2, mndVar2)) {
                        break;
                    }
                    k4e.d(j, mndVar3, k4e.l(j, mndVar2));
                    x(mndVar3, i2);
                    break;
                case 9:
                    mndVar3 = mndVar;
                    p(mndVar3, mndVar2, i2);
                    break;
                case 10:
                    mndVar3 = mndVar;
                    if (!r(i2, mndVar2)) {
                        break;
                    }
                    k4e.d(j, mndVar3, k4e.l(j, mndVar2));
                    x(mndVar3, i2);
                    break;
                case 11:
                    mndVar3 = mndVar;
                    if (!r(i2, mndVar2)) {
                        break;
                    }
                    k4e.c(j, mndVar3, k4e.j(j, mndVar2));
                    x(mndVar3, i2);
                    break;
                case 12:
                    mndVar3 = mndVar;
                    if (!r(i2, mndVar2)) {
                        break;
                    }
                    k4e.c(j, mndVar3, k4e.j(j, mndVar2));
                    x(mndVar3, i2);
                    break;
                case 13:
                    mndVar3 = mndVar;
                    if (!r(i2, mndVar2)) {
                        break;
                    }
                    k4e.c(j, mndVar3, k4e.j(j, mndVar2));
                    x(mndVar3, i2);
                    break;
                case 14:
                    mndVar3 = mndVar;
                    if (!r(i2, mndVar2)) {
                        break;
                    }
                    k = k4e.k(j, mndVar2);
                    unsafe = k4e.d.a;
                    unsafe.putLong(mndVar3, j, k);
                    x(mndVar3, i2);
                    break;
                case 15:
                    mndVar3 = mndVar;
                    if (!r(i2, mndVar2)) {
                        break;
                    }
                    k4e.c(j, mndVar3, k4e.j(j, mndVar2));
                    x(mndVar3, i2);
                    break;
                case 16:
                    if (r(i2, mndVar2)) {
                        k = k4e.k(j, mndVar2);
                        unsafe = k4e.d.a;
                        mndVar3 = mndVar;
                        unsafe.putLong(mndVar3, j, k);
                        x(mndVar3, i2);
                        break;
                    }
                    mndVar3 = mndVar;
                    break;
                case 17:
                    p(mndVar, mndVar2, i2);
                    mndVar3 = mndVar;
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
                case jn7.S /* 30 */:
                case 31:
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
                    this.l.b(mndVar, mndVar2, j);
                    mndVar3 = mndVar;
                    break;
                case 50:
                    Class cls = wzd.a;
                    Object l = k4e.l(j, mndVar);
                    Object l2 = k4e.l(j, mndVar2);
                    this.n.getClass();
                    k4e.d(j, mndVar, oud.a(l, l2));
                    mndVar3 = mndVar;
                    break;
                case jn7.n0 /* 51 */:
                case jn7.o0 /* 52 */:
                case jn7.p0 /* 53 */:
                case jn7.q0 /* 54 */:
                case jn7.r0 /* 55 */:
                case 56:
                case jn7.t0 /* 57 */:
                case jn7.u0 /* 58 */:
                case jn7.v0 /* 59 */:
                    if (q(i3, i2, mndVar2)) {
                        k4e.d(j, mndVar, k4e.l(j, mndVar2));
                        i = iArr[i2 + 2];
                        k4e.c(i & 1048575, mndVar, i3);
                    }
                    mndVar3 = mndVar;
                    break;
                case jn7.w0 /* 60 */:
                case jn7.E0 /* 68 */:
                    y(mndVar, mndVar2, i2);
                    mndVar3 = mndVar;
                    break;
                case jn7.x0 /* 61 */:
                case jn7.y0 /* 62 */:
                case jn7.z0 /* 63 */:
                case 64:
                case 65:
                case jn7.C0 /* 66 */:
                case jn7.D0 /* 67 */:
                    if (q(i3, i2, mndVar2)) {
                        k4e.d(j, mndVar, k4e.l(j, mndVar2));
                        i = iArr[i2 + 2];
                        k4e.c(i & 1048575, mndVar, i3);
                    }
                    mndVar3 = mndVar;
                    break;
                default:
                    mndVar3 = mndVar;
                    break;
            }
            i2 += 4;
            mndVar = mndVar3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008e, code lost:
    
        if (r4 != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x013a, code lost:
    
        r3 = r8 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0139, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f7, code lost:
    
        if (r4 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x011b, code lost:
    
        r3 = (r3 * 53) + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0117, code lost:
    
        r10 = r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0115, code lost:
    
        if (r4 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0137, code lost:
    
        if (r4 != false) goto L79;
     */
    @Override // lzd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(mnd mndVar) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int i2;
        Object l;
        Object l2;
        long k;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 4) {
            int v = v(i4);
            int i5 = iArr[i4];
            long j = 1048575 & v;
            int i6 = 1237;
            int i7 = 37;
            switch ((v & 267386880) >>> 20) {
                case 0:
                    i = i3 * 53;
                    doubleToLongBits = Double.doubleToLongBits(k4e.d.A(mndVar, j));
                    floatToIntBits = vnd.b(doubleToLongBits);
                    i3 = floatToIntBits + i;
                    break;
                case 1:
                    i = i3 * 53;
                    floatToIntBits = Float.floatToIntBits(k4e.d.z(j, mndVar));
                    i3 = floatToIntBits + i;
                    break;
                case 2:
                case 3:
                case 5:
                    i = i3 * 53;
                    doubleToLongBits = k4e.k(j, mndVar);
                    floatToIntBits = vnd.b(doubleToLongBits);
                    i3 = floatToIntBits + i;
                    break;
                case 4:
                case 6:
                    i = i3 * 53;
                    floatToIntBits = k4e.j(j, mndVar);
                    i3 = floatToIntBits + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean y = k4e.d.y(j, mndVar);
                    Charset charset = vnd.a;
                    break;
                case 8:
                    i = i3 * 53;
                    floatToIntBits = ((String) k4e.l(j, mndVar)).hashCode();
                    i3 = floatToIntBits + i;
                    break;
                case 9:
                    l = k4e.l(j, mndVar);
                    break;
                case 10:
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
                case jn7.S /* 30 */:
                case 31:
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
                    i = i3 * 53;
                    l2 = k4e.l(j, mndVar);
                    floatToIntBits = l2.hashCode();
                    i3 = floatToIntBits + i;
                    break;
                case 11:
                case 12:
                case 13:
                case 15:
                    i = i3 * 53;
                    floatToIntBits = k4e.j(j, mndVar);
                    i3 = floatToIntBits + i;
                    break;
                case 14:
                case 16:
                    i = i3 * 53;
                    k = k4e.k(j, mndVar);
                    floatToIntBits = vnd.b(k);
                    i3 = floatToIntBits + i;
                    break;
                case 17:
                    l = k4e.l(j, mndVar);
                    break;
                case jn7.n0 /* 51 */:
                    if (q(i5, i4, mndVar)) {
                        i = i3 * 53;
                        k = Double.doubleToLongBits(((Double) k4e.l(j, mndVar)).doubleValue());
                        floatToIntBits = vnd.b(k);
                        i3 = floatToIntBits + i;
                        break;
                    } else {
                        break;
                    }
                case jn7.o0 /* 52 */:
                    if (q(i5, i4, mndVar)) {
                        i = i3 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) k4e.l(j, mndVar)).floatValue());
                        i3 = floatToIntBits + i;
                        break;
                    } else {
                        break;
                    }
                case jn7.p0 /* 53 */:
                    if (!q(i5, i4, mndVar)) {
                        break;
                    }
                    i = i3 * 53;
                    k = B(j, mndVar);
                    floatToIntBits = vnd.b(k);
                    i3 = floatToIntBits + i;
                    break;
                case jn7.q0 /* 54 */:
                    if (!q(i5, i4, mndVar)) {
                        break;
                    }
                    i = i3 * 53;
                    k = B(j, mndVar);
                    floatToIntBits = vnd.b(k);
                    i3 = floatToIntBits + i;
                    break;
                case jn7.r0 /* 55 */:
                    if (!q(i5, i4, mndVar)) {
                        break;
                    }
                    i = i3 * 53;
                    floatToIntBits = A(j, mndVar);
                    i3 = floatToIntBits + i;
                    break;
                case 56:
                    if (!q(i5, i4, mndVar)) {
                        break;
                    }
                    i = i3 * 53;
                    k = B(j, mndVar);
                    floatToIntBits = vnd.b(k);
                    i3 = floatToIntBits + i;
                    break;
                case jn7.t0 /* 57 */:
                    if (!q(i5, i4, mndVar)) {
                        break;
                    }
                    i = i3 * 53;
                    floatToIntBits = A(j, mndVar);
                    i3 = floatToIntBits + i;
                    break;
                case jn7.u0 /* 58 */:
                    if (q(i5, i4, mndVar)) {
                        i2 = i3 * 53;
                        boolean booleanValue = ((Boolean) k4e.l(j, mndVar)).booleanValue();
                        Charset charset2 = vnd.a;
                        break;
                    } else {
                        break;
                    }
                case jn7.v0 /* 59 */:
                    if (!q(i5, i4, mndVar)) {
                        break;
                    }
                    i = i3 * 53;
                    floatToIntBits = ((String) k4e.l(j, mndVar)).hashCode();
                    i3 = floatToIntBits + i;
                    break;
                case jn7.w0 /* 60 */:
                    if (!q(i5, i4, mndVar)) {
                        break;
                    }
                    l2 = k4e.l(j, mndVar);
                    i = i3 * 53;
                    floatToIntBits = l2.hashCode();
                    i3 = floatToIntBits + i;
                    break;
                case jn7.x0 /* 61 */:
                    if (!q(i5, i4, mndVar)) {
                        break;
                    }
                    i = i3 * 53;
                    l2 = k4e.l(j, mndVar);
                    floatToIntBits = l2.hashCode();
                    i3 = floatToIntBits + i;
                    break;
                case jn7.y0 /* 62 */:
                    if (!q(i5, i4, mndVar)) {
                        break;
                    }
                    i = i3 * 53;
                    floatToIntBits = A(j, mndVar);
                    i3 = floatToIntBits + i;
                    break;
                case jn7.z0 /* 63 */:
                    if (!q(i5, i4, mndVar)) {
                        break;
                    }
                    i = i3 * 53;
                    floatToIntBits = A(j, mndVar);
                    i3 = floatToIntBits + i;
                    break;
                case 64:
                    if (!q(i5, i4, mndVar)) {
                        break;
                    }
                    i = i3 * 53;
                    floatToIntBits = A(j, mndVar);
                    i3 = floatToIntBits + i;
                    break;
                case 65:
                    if (!q(i5, i4, mndVar)) {
                        break;
                    }
                    i = i3 * 53;
                    k = B(j, mndVar);
                    floatToIntBits = vnd.b(k);
                    i3 = floatToIntBits + i;
                    break;
                case jn7.C0 /* 66 */:
                    if (!q(i5, i4, mndVar)) {
                        break;
                    }
                    i = i3 * 53;
                    floatToIntBits = A(j, mndVar);
                    i3 = floatToIntBits + i;
                    break;
                case jn7.D0 /* 67 */:
                    if (!q(i5, i4, mndVar)) {
                        break;
                    }
                    i = i3 * 53;
                    k = B(j, mndVar);
                    floatToIntBits = vnd.b(k);
                    i3 = floatToIntBits + i;
                    break;
                case jn7.E0 /* 68 */:
                    if (!q(i5, i4, mndVar)) {
                        break;
                    }
                    l2 = k4e.l(j, mndVar);
                    i = i3 * 53;
                    floatToIntBits = l2.hashCode();
                    i3 = floatToIntBits + i;
                    break;
            }
        }
        this.m.getClass();
        return mndVar.zzjp.hashCode() + (i3 * 53);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (wzd.c(k4e.l(r7, r11), k4e.l(r7, r12)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (k4e.k(r7, r11) == k4e.k(r7, r12)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (k4e.j(r7, r11) == k4e.j(r7, r12)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (k4e.k(r7, r11) == k4e.k(r7, r12)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (k4e.j(r7, r11) == k4e.j(r7, r12)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        if (k4e.j(r7, r11) == k4e.j(r7, r12)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
    
        if (k4e.j(r7, r11) == k4e.j(r7, r12)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        if (wzd.c(k4e.l(r7, r11), k4e.l(r7, r12)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
    
        if (wzd.c(k4e.l(r7, r11), k4e.l(r7, r12)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010e, code lost:
    
        if (wzd.c(k4e.l(r7, r11), k4e.l(r7, r12)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0122, code lost:
    
        if (r5.y(r7, r11) != r5.y(r7, r12)) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0134, code lost:
    
        if (k4e.j(r7, r11) == k4e.j(r7, r12)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0148, code lost:
    
        if (k4e.k(r7, r11) == k4e.k(r7, r12)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0159, code lost:
    
        if (k4e.j(r7, r11) == k4e.j(r7, r12)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016c, code lost:
    
        if (k4e.k(r7, r11) == k4e.k(r7, r12)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017f, code lost:
    
        if (k4e.k(r7, r11) == k4e.k(r7, r12)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0190, code lost:
    
        if (k4e.j(r7, r11) == k4e.j(r7, r12)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a3, code lost:
    
        if (k4e.k(r7, r11) == k4e.k(r7, r12)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (wzd.c(k4e.l(r7, r11), k4e.l(r7, r12)) != false) goto L104;
     */
    @Override // lzd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(mnd mndVar, mnd mndVar2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int v = v(i);
                long j = v & 1048575;
                switch ((v & 267386880) >>> 20) {
                    case 0:
                        if (z(mndVar, mndVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (z(mndVar, mndVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (z(mndVar, mndVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (z(mndVar, mndVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (z(mndVar, mndVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (z(mndVar, mndVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (z(mndVar, mndVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (z(mndVar, mndVar2, i)) {
                            cac cacVar = k4e.d;
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (z(mndVar, mndVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (z(mndVar, mndVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (z(mndVar, mndVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (z(mndVar, mndVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (z(mndVar, mndVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (z(mndVar, mndVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (z(mndVar, mndVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (z(mndVar, mndVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (z(mndVar, mndVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (z(mndVar, mndVar2, i)) {
                            break;
                        }
                        z = false;
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
                    case jn7.S /* 30 */:
                    case 31:
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
                        z = wzd.c(k4e.l(j, mndVar), k4e.l(j, mndVar2));
                        break;
                    case jn7.n0 /* 51 */:
                    case jn7.o0 /* 52 */:
                    case jn7.p0 /* 53 */:
                    case jn7.q0 /* 54 */:
                    case jn7.r0 /* 55 */:
                    case 56:
                    case jn7.t0 /* 57 */:
                    case jn7.u0 /* 58 */:
                    case jn7.v0 /* 59 */:
                    case jn7.w0 /* 60 */:
                    case jn7.x0 /* 61 */:
                    case jn7.y0 /* 62 */:
                    case jn7.z0 /* 63 */:
                    case 64:
                    case 65:
                    case jn7.C0 /* 66 */:
                    case jn7.D0 /* 67 */:
                    case jn7.E0 /* 68 */:
                        long j2 = iArr[i + 2] & 1048575;
                        if (k4e.j(j2, mndVar) == k4e.j(j2, mndVar2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (z) {
                    i += 4;
                }
            } else {
                this.m.getClass();
                if (mndVar.zzjp.equals(mndVar2.zzjp)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // lzd
    public final boolean g(Object obj) {
        boolean z;
        int[] iArr;
        int i;
        boolean z2 = true;
        z2 = true;
        z2 = true;
        int[] iArr2 = this.h;
        if (iArr2 != null && iArr2.length != 0) {
            int length = iArr2.length;
            int i2 = -1;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                int i5 = iArr2[i3];
                int w = w(i5);
                int v = v(w);
                boolean z3 = this.g;
                if (z3) {
                    z = z2 ? 1 : 0;
                    iArr = iArr2;
                    i = 0;
                } else {
                    int i6 = this.a[w + 2];
                    int i7 = i6 & 1048575;
                    i = (z2 ? 1 : 0) << (i6 >>> 20);
                    if (i7 != i2) {
                        Unsafe unsafe = o;
                        z = z2 ? 1 : 0;
                        iArr = iArr2;
                        i4 = unsafe.getInt(obj, i7);
                        i2 = i7;
                    } else {
                        z = z2 ? 1 : 0;
                        iArr = iArr2;
                    }
                }
                if ((268435456 & v) != 0) {
                    if (!(z3 ? r(w, obj) : (i4 & i) != 0 ? z : false)) {
                        return false;
                    }
                }
                int i8 = (267386880 & v) >>> 20;
                if (i8 == 9 || i8 == 17) {
                    if ((z3 ? r(w, obj) : (i & i4) != 0 ? z : false) && !s(w).g(k4e.l(v & 1048575, obj))) {
                        return false;
                    }
                    i3++;
                    z2 = z;
                    iArr2 = iArr;
                } else {
                    if (i8 != 27) {
                        if (i8 == 60 || i8 == 68) {
                            if (q(i5, w, obj) && !s(w).g(k4e.l(v & 1048575, obj))) {
                                return false;
                            }
                        } else if (i8 != 49) {
                            if (i8 == 50) {
                                Object l = k4e.l(v & 1048575, obj);
                                this.n.getClass();
                                if (!((bud) l).isEmpty()) {
                                    t(w);
                                    throw new NoSuchMethodError();
                                }
                            } else {
                                continue;
                            }
                        }
                        i3++;
                        z2 = z;
                        iArr2 = iArr;
                    }
                    List list = (List) k4e.l(v & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        lzd s = s(w);
                        for (int i9 = 0; i9 < list.size(); i9++) {
                            if (!s.g(list.get(i9))) {
                                return false;
                            }
                        }
                    }
                    i3++;
                    z2 = z;
                    iArr2 = iArr;
                }
            }
        }
        return z2;
    }

    public final int h(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, lfd lfdVar) {
        int i9;
        Object valueOf;
        int i10;
        Object valueOf2;
        int e;
        Object valueOf3;
        int i11;
        Object str;
        Object object;
        long j2 = this.a[i8 + 2] & 1048575;
        Unsafe unsafe = o;
        switch (i7) {
            case jn7.n0 /* 51 */:
                i9 = i;
                if (i5 != 1) {
                    return i9;
                }
                valueOf = Double.valueOf(Double.longBitsToDouble(i4f.h(i9, bArr)));
                unsafe.putObject(obj, j, valueOf);
                e = i9 + 8;
                unsafe.putInt(obj, j2, i4);
                return e;
            case jn7.o0 /* 52 */:
                i10 = i;
                if (i5 != 5) {
                    return i10;
                }
                valueOf2 = Float.valueOf(Float.intBitsToFloat(i4f.f(i10, bArr)));
                unsafe.putObject(obj, j, valueOf2);
                e = i10 + 4;
                unsafe.putInt(obj, j2, i4);
                return e;
            case jn7.p0 /* 53 */:
            case jn7.q0 /* 54 */:
                if (i5 != 0) {
                    return i;
                }
                e = i4f.e(bArr, i, lfdVar);
                valueOf3 = Long.valueOf(lfdVar.b);
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case jn7.r0 /* 55 */:
            case jn7.y0 /* 62 */:
                if (i5 != 0) {
                    return i;
                }
                e = i4f.d(bArr, i, lfdVar);
                valueOf3 = Integer.valueOf(lfdVar.a);
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case 56:
            case 65:
                i9 = i;
                if (i5 != 1) {
                    return i9;
                }
                valueOf = Long.valueOf(i4f.h(i9, bArr));
                unsafe.putObject(obj, j, valueOf);
                e = i9 + 8;
                unsafe.putInt(obj, j2, i4);
                return e;
            case jn7.t0 /* 57 */:
            case 64:
                i10 = i;
                if (i5 != 5) {
                    return i10;
                }
                valueOf2 = Integer.valueOf(i4f.f(i10, bArr));
                unsafe.putObject(obj, j, valueOf2);
                e = i10 + 4;
                unsafe.putInt(obj, j2, i4);
                return e;
            case jn7.u0 /* 58 */:
                if (i5 != 0) {
                    return i;
                }
                e = i4f.e(bArr, i, lfdVar);
                valueOf3 = Boolean.valueOf(lfdVar.b != 0);
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case jn7.v0 /* 59 */:
                if (i5 != 2) {
                    return i;
                }
                e = i4f.d(bArr, i, lfdVar);
                i11 = lfdVar.a;
                if (i11 == 0) {
                    valueOf3 = "";
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j2, i4);
                    return e;
                }
                if ((i6 & TLObject.FLAG_29) != 0) {
                    if (!b5e.a.b(bArr, e, e + i11)) {
                        throw new mpd("Protocol message had invalid UTF-8.");
                    }
                }
                str = new String(bArr, e, i11, vnd.a);
                unsafe.putObject(obj, j, str);
                e += i11;
                unsafe.putInt(obj, j2, i4);
                return e;
            case jn7.w0 /* 60 */:
                if (i5 != 2) {
                    return i;
                }
                e = m(s(i8), bArr, i, i2, lfdVar);
                object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                valueOf3 = lfdVar.c;
                if (object != null) {
                    valueOf3 = vnd.a(object, valueOf3);
                }
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case jn7.x0 /* 61 */:
                if (i5 != 2) {
                    return i;
                }
                e = i4f.d(bArr, i, lfdVar);
                i11 = lfdVar.a;
                if (i11 == 0) {
                    valueOf3 = vhd.c;
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j2, i4);
                    return e;
                }
                str = vhd.i(e, i11, bArr);
                unsafe.putObject(obj, j, str);
                e += i11;
                unsafe.putInt(obj, j2, i4);
                return e;
            case jn7.z0 /* 63 */:
                if (i5 != 0) {
                    return i;
                }
                int d = i4f.d(bArr, i, lfdVar);
                int i12 = lfdVar.a;
                u(i8);
                unsafe.putObject(obj, j, Integer.valueOf(i12));
                e = d;
                unsafe.putInt(obj, j2, i4);
                return e;
            case jn7.C0 /* 66 */:
                if (i5 != 0) {
                    return i;
                }
                e = i4f.d(bArr, i, lfdVar);
                int i13 = lfdVar.a;
                valueOf3 = Integer.valueOf((i13 >>> 1) ^ (-(i13 & 1)));
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case jn7.D0 /* 67 */:
                if (i5 != 0) {
                    return i;
                }
                e = i4f.e(bArr, i, lfdVar);
                long j3 = lfdVar.b;
                valueOf3 = Long.valueOf((j3 >>> 1) ^ (-(j3 & 1)));
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case jn7.E0 /* 68 */:
                if (i5 == 3) {
                    e = l(s(i8), bArr, i, i2, (i3 & (-8)) | 4, lfdVar);
                    object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    Object obj2 = lfdVar.c;
                    if (object != null) {
                        obj2 = vnd.a(object, obj2);
                    }
                    unsafe.putObject(obj, j, obj2);
                    unsafe.putInt(obj, j2, i4);
                    return e;
                }
            default:
                return i;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x016d, code lost:
    
        if (r16 != 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0172, code lost:
    
        if (r16 != 5) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0177, code lost:
    
        if (r16 != 1) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x017c, code lost:
    
        if (r16 == 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0188, code lost:
    
        if (r16 != 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x018d, code lost:
    
        if (r16 != 5) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0192, code lost:
    
        if (r16 != 1) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if (r16 != 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r16 != 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        if (r16 != 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x017e, code lost:
    
        grb.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0181, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        if (r12 == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        r5.add(vhd.i(r9, r12, r11));
        r9 = r9 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
    
        if (r9 >= r13) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
    
        r12 = i4f.d(r11, r9, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
    
        if (r14 != r23.a) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        r9 = i4f.d(r11, r12, r23);
        r12 = r23.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a8, code lost:
    
        if (r12 != 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
    
        r5.add(vhd.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0098, code lost:
    
        r5.add(vhd.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f8, code lost:
    
        r5.add("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0136, code lost:
    
        r5.add("");
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0138  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00a8 -> B:35:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x010e -> B:54:0x00f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0156 -> B:68:0x0132). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, lfd lfdVar) {
        Unsafe unsafe = o;
        dpd dpdVar = (dpd) unsafe.getObject(obj, j2);
        if (!((wed) dpdVar).a) {
            int size = dpdVar.size();
            dpdVar = dpdVar.f(size == 0 ? 10 : size << 1);
            unsafe.putObject(obj, j2, dpdVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 != 2) {
                }
                grb.o();
                return 0;
            case 19:
            case 36:
                if (i5 != 2) {
                }
                grb.o();
                return 0;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 != 2) {
                }
                grb.o();
                return 0;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 != 2) {
                }
                grb.o();
                return 0;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 != 2) {
                }
                grb.o();
                return 0;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 != 2) {
                }
                grb.o();
                return 0;
            case 25:
            case 42:
                if (i5 != 2) {
                }
                grb.o();
                return 0;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int d = i4f.d(bArr, i, lfdVar);
                        int i8 = lfdVar.a;
                        if (i8 != 0) {
                            String str = new String(bArr, d, i8, vnd.a);
                            dpdVar.add(str);
                            d += i8;
                            while (d < i2) {
                                int d2 = i4f.d(bArr, d, lfdVar);
                                if (i3 != lfdVar.a) {
                                    return d;
                                }
                                d = i4f.d(bArr, d2, lfdVar);
                                i8 = lfdVar.a;
                                if (i8 != 0) {
                                    str = new String(bArr, d, i8, vnd.a);
                                    dpdVar.add(str);
                                    d += i8;
                                    while (d < i2) {
                                    }
                                }
                            }
                            return d;
                        }
                        dpdVar.add("");
                    } else {
                        int d3 = i4f.d(bArr, i, lfdVar);
                        int i9 = lfdVar.a;
                        if (i9 != 0) {
                            int i10 = d3 + i9;
                            if (!b5e.a.b(bArr, d3, i10)) {
                                throw new mpd("Protocol message had invalid UTF-8.");
                            }
                            String str2 = new String(bArr, d3, i9, vnd.a);
                            dpdVar.add(str2);
                            d3 = i10;
                            while (d3 < i2) {
                                int d4 = i4f.d(bArr, d3, lfdVar);
                                if (i3 != lfdVar.a) {
                                    return d3;
                                }
                                d3 = i4f.d(bArr, d4, lfdVar);
                                int i11 = lfdVar.a;
                                if (i11 != 0) {
                                    i10 = d3 + i11;
                                    if (!b5e.a.b(bArr, d3, i10)) {
                                        throw new mpd("Protocol message had invalid UTF-8.");
                                    }
                                    str2 = new String(bArr, d3, i11, vnd.a);
                                    dpdVar.add(str2);
                                    d3 = i10;
                                    while (d3 < i2) {
                                    }
                                }
                            }
                            return d3;
                        }
                        dpdVar.add("");
                    }
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return k(s(i6), i3, bArr, i, i2, dpdVar, lfdVar);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    int d5 = i4f.d(bArr, i, lfdVar);
                    int i12 = lfdVar.a;
                    break;
                }
                return i;
            case jn7.S /* 30 */:
            case 44:
                if (i5 != 2) {
                }
                grb.o();
                return 0;
            case 33:
            case 47:
                if (i5 != 2) {
                }
                grb.o();
                return 0;
            case 34:
            case 48:
                if (i5 != 2) {
                }
                grb.o();
                return 0;
            case 49:
                if (i5 == 3) {
                    lzd s = s(i6);
                    int i13 = (i3 & (-8)) | 4;
                    int l = l(s, bArr, i, i2, i13, lfdVar);
                    int i14 = i13;
                    lfd lfdVar2 = lfdVar;
                    dpdVar.add(lfdVar2.c);
                    while (l < i2) {
                        int d6 = i4f.d(bArr, l, lfdVar2);
                        if (i3 != lfdVar2.a) {
                            return l;
                        }
                        lfd lfdVar3 = lfdVar2;
                        int i15 = i14;
                        l = l(s, bArr, d6, i2, i15, lfdVar3);
                        dpdVar.add(lfdVar3.c);
                        i14 = i15;
                        lfdVar2 = lfdVar3;
                    }
                    return l;
                }
                return i;
            default:
                return i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0366 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0375  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(Object obj, byte[] bArr, int i, int i2, int i3, lfd lfdVar) {
        cwd cwdVar;
        Object obj2;
        int[] iArr;
        int i4;
        Unsafe unsafe;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        t2e t2eVar;
        int i10;
        int i11;
        int i12;
        byte[] bArr2;
        Unsafe unsafe2;
        int i13;
        lfd lfdVar2;
        Unsafe unsafe3;
        int i14;
        int g;
        byte[] bArr3;
        int i15;
        Object a;
        byte[] bArr4;
        int i16;
        lfd lfdVar3;
        int h;
        cwd cwdVar2 = this;
        Object obj3 = obj;
        byte[] bArr5 = bArr;
        int i17 = i2;
        lfd lfdVar4 = lfdVar;
        int i18 = -1;
        int i19 = i;
        int i20 = -1;
        int i21 = 0;
        int i22 = 0;
        while (true) {
            int[] iArr2 = cwdVar2.a;
            Unsafe unsafe4 = o;
            if (i19 < i17) {
                int i23 = i19 + 1;
                int i24 = bArr5[i19];
                if (i24 < 0) {
                    i23 = i4f.c(i24, bArr5, i23, lfdVar4);
                    i24 = lfdVar4.a;
                }
                int i25 = i24;
                int i26 = i23;
                int i27 = i25 >>> 3;
                int i28 = i25 & 7;
                int w = cwdVar2.w(i27);
                if (w != i18) {
                    int i29 = iArr2[w + 1];
                    int i30 = (i29 & 267386880) >>> 20;
                    long j = i29 & 1048575;
                    if (i30 <= 17) {
                        int i31 = iArr2[w + 2];
                        int i32 = 1 << (i31 >>> 20);
                        int i33 = i31 & 1048575;
                        if (i33 != i20) {
                            i4 = -1;
                            i10 = 1;
                            iArr = iArr2;
                            if (i20 != -1) {
                                unsafe4.putInt(obj3, i20, i22);
                            }
                            i11 = unsafe4.getInt(obj3, i33);
                            i12 = i33;
                        } else {
                            i10 = 1;
                            iArr = iArr2;
                            i4 = -1;
                            i11 = i22;
                            i12 = i20;
                        }
                        switch (i30) {
                            case 0:
                                unsafe2 = unsafe4;
                                i13 = i26;
                                if (i28 == i10) {
                                    k4e.d.m(obj3, j, Double.longBitsToDouble(i4f.h(i13, bArr)));
                                    Object obj4 = obj3;
                                    i19 = i13 + 8;
                                    int i34 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr;
                                    i20 = i34;
                                    i17 = i2;
                                    obj3 = obj4;
                                    i18 = i4;
                                    i21 = i25;
                                    lfdVar4 = lfdVar;
                                    break;
                                } else {
                                    obj2 = obj3;
                                    i5 = i3;
                                    cwdVar = cwdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5 && i5 != 0) {
                                        i17 = i2;
                                        i19 = i9;
                                        break;
                                    } else {
                                        mnd mndVar = (mnd) obj2;
                                        t2eVar = mndVar.zzjp;
                                        if (t2eVar == t2e.e) {
                                            t2eVar = t2e.b();
                                            mndVar.zzjp = t2eVar;
                                        }
                                        int i35 = i21;
                                        int b = i4f.b(i35, bArr, i9, i2, t2eVar, lfdVar);
                                        i21 = i35;
                                        bArr5 = bArr;
                                        i17 = i2;
                                        cwdVar2 = cwdVar;
                                        i18 = i4;
                                        i19 = b;
                                        obj3 = obj2;
                                        lfdVar4 = lfdVar;
                                        break;
                                    }
                                }
                            case 1:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i13 = i26;
                                lfdVar2 = lfdVar;
                                if (i28 == 5) {
                                    k4e.d.n(obj3, j, Float.intBitsToFloat(i4f.f(i13, bArr2)));
                                    i19 = i13 + 4;
                                    int i36 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr2;
                                    i20 = i36;
                                    i17 = i2;
                                    lfdVar4 = lfdVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    obj2 = obj3;
                                    i5 = i3;
                                    cwdVar = cwdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    mnd mndVar2 = (mnd) obj2;
                                    t2eVar = mndVar2.zzjp;
                                    if (t2eVar == t2e.e) {
                                    }
                                    int i352 = i21;
                                    int b2 = i4f.b(i352, bArr, i9, i2, t2eVar, lfdVar);
                                    i21 = i352;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    cwdVar2 = cwdVar;
                                    i18 = i4;
                                    i19 = b2;
                                    obj3 = obj2;
                                    lfdVar4 = lfdVar;
                                    break;
                                }
                                break;
                            case 2:
                            case 3:
                                unsafe3 = unsafe4;
                                i13 = i26;
                                lfdVar2 = lfdVar;
                                if (i28 == 0) {
                                    int e = i4f.e(bArr, i13, lfdVar2);
                                    unsafe3.putLong(obj3, j, lfdVar2.b);
                                    int i37 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr;
                                    i20 = i37;
                                    i17 = i2;
                                    i19 = e;
                                    lfdVar4 = lfdVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    obj2 = obj3;
                                    i5 = i3;
                                    cwdVar = cwdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    mnd mndVar22 = (mnd) obj2;
                                    t2eVar = mndVar22.zzjp;
                                    if (t2eVar == t2e.e) {
                                    }
                                    int i3522 = i21;
                                    int b22 = i4f.b(i3522, bArr, i9, i2, t2eVar, lfdVar);
                                    i21 = i3522;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    cwdVar2 = cwdVar;
                                    i18 = i4;
                                    i19 = b22;
                                    obj3 = obj2;
                                    lfdVar4 = lfdVar;
                                    break;
                                }
                                break;
                            case 4:
                            case 11:
                                unsafe3 = unsafe4;
                                i13 = i26;
                                lfdVar2 = lfdVar;
                                if (i28 == 0) {
                                    int d = i4f.d(bArr, i13, lfdVar2);
                                    unsafe3.putInt(obj3, j, lfdVar2.a);
                                    int i38 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr;
                                    i20 = i38;
                                    i17 = i2;
                                    i19 = d;
                                    lfdVar4 = lfdVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    obj2 = obj3;
                                    i5 = i3;
                                    cwdVar = cwdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    mnd mndVar222 = (mnd) obj2;
                                    t2eVar = mndVar222.zzjp;
                                    if (t2eVar == t2e.e) {
                                    }
                                    int i35222 = i21;
                                    int b222 = i4f.b(i35222, bArr, i9, i2, t2eVar, lfdVar);
                                    i21 = i35222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    cwdVar2 = cwdVar;
                                    i18 = i4;
                                    i19 = b222;
                                    obj3 = obj2;
                                    lfdVar4 = lfdVar;
                                    break;
                                }
                                break;
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i14 = i26;
                                unsafe2 = unsafe4;
                                lfdVar2 = lfdVar;
                                if (i28 == i10) {
                                    unsafe2.putLong(obj3, j, i4f.h(i14, bArr2));
                                    i19 = i14 + 8;
                                    int i362 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr2;
                                    i20 = i362;
                                    i17 = i2;
                                    lfdVar4 = lfdVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i14;
                                    obj2 = obj3;
                                    i5 = i3;
                                    cwdVar = cwdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    mnd mndVar2222 = (mnd) obj2;
                                    t2eVar = mndVar2222.zzjp;
                                    if (t2eVar == t2e.e) {
                                    }
                                    int i352222 = i21;
                                    int b2222 = i4f.b(i352222, bArr, i9, i2, t2eVar, lfdVar);
                                    i21 = i352222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    cwdVar2 = cwdVar;
                                    i18 = i4;
                                    i19 = b2222;
                                    obj3 = obj2;
                                    lfdVar4 = lfdVar;
                                    break;
                                }
                                break;
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i14 = i26;
                                unsafe2 = unsafe4;
                                lfdVar2 = lfdVar;
                                if (i28 == 5) {
                                    unsafe2.putInt(obj3, j, i4f.f(i14, bArr2));
                                    i19 = i14 + 4;
                                    int i3622 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr2;
                                    i20 = i3622;
                                    i17 = i2;
                                    lfdVar4 = lfdVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i14;
                                    obj2 = obj3;
                                    i5 = i3;
                                    cwdVar = cwdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    mnd mndVar22222 = (mnd) obj2;
                                    t2eVar = mndVar22222.zzjp;
                                    if (t2eVar == t2e.e) {
                                    }
                                    int i3522222 = i21;
                                    int b22222 = i4f.b(i3522222, bArr, i9, i2, t2eVar, lfdVar);
                                    i21 = i3522222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    cwdVar2 = cwdVar;
                                    i18 = i4;
                                    i19 = b22222;
                                    obj3 = obj2;
                                    lfdVar4 = lfdVar;
                                    break;
                                }
                                break;
                            case 7:
                                bArr2 = bArr;
                                i14 = i26;
                                unsafe2 = unsafe4;
                                lfdVar2 = lfdVar;
                                if (i28 == 0) {
                                    i19 = i4f.e(bArr2, i14, lfdVar2);
                                    k4e.d.o(obj3, j, lfdVar2.b != 0 ? i10 : 0);
                                    int i36222 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr2;
                                    i20 = i36222;
                                    i17 = i2;
                                    lfdVar4 = lfdVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i14;
                                    obj2 = obj3;
                                    i5 = i3;
                                    cwdVar = cwdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    mnd mndVar222222 = (mnd) obj2;
                                    t2eVar = mndVar222222.zzjp;
                                    if (t2eVar == t2e.e) {
                                    }
                                    int i35222222 = i21;
                                    int b222222 = i4f.b(i35222222, bArr, i9, i2, t2eVar, lfdVar);
                                    i21 = i35222222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    cwdVar2 = cwdVar;
                                    i18 = i4;
                                    i19 = b222222;
                                    obj3 = obj2;
                                    lfdVar4 = lfdVar;
                                    break;
                                }
                                break;
                            case 8:
                                bArr2 = bArr;
                                i14 = i26;
                                unsafe2 = unsafe4;
                                lfdVar2 = lfdVar;
                                if (i28 == 2) {
                                    if ((i29 & TLObject.FLAG_29) == 0) {
                                        g = i4f.d(bArr2, i14, lfdVar2);
                                        int i39 = lfdVar2.a;
                                        if (i39 == 0) {
                                            lfdVar2.c = "";
                                        } else {
                                            lfdVar2.c = new String(bArr2, g, i39, vnd.a);
                                            g += i39;
                                        }
                                    } else {
                                        g = i4f.g(bArr2, i14, lfdVar2);
                                    }
                                    i19 = g;
                                    unsafe2.putObject(obj3, j, lfdVar2.c);
                                    int i362222 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr2;
                                    i20 = i362222;
                                    i17 = i2;
                                    lfdVar4 = lfdVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i14;
                                    obj2 = obj3;
                                    i5 = i3;
                                    cwdVar = cwdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    mnd mndVar2222222 = (mnd) obj2;
                                    t2eVar = mndVar2222222.zzjp;
                                    if (t2eVar == t2e.e) {
                                    }
                                    int i352222222 = i21;
                                    int b2222222 = i4f.b(i352222222, bArr, i9, i2, t2eVar, lfdVar);
                                    i21 = i352222222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    cwdVar2 = cwdVar;
                                    i18 = i4;
                                    i19 = b2222222;
                                    obj3 = obj2;
                                    lfdVar4 = lfdVar;
                                    break;
                                }
                            case 9:
                                bArr3 = bArr;
                                i14 = i26;
                                i15 = i2;
                                unsafe2 = unsafe4;
                                lfdVar2 = lfdVar;
                                if (i28 != 2) {
                                    i13 = i14;
                                    obj2 = obj3;
                                    i5 = i3;
                                    cwdVar = cwdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    mnd mndVar22222222 = (mnd) obj2;
                                    t2eVar = mndVar22222222.zzjp;
                                    if (t2eVar == t2e.e) {
                                    }
                                    int i3522222222 = i21;
                                    int b22222222 = i4f.b(i3522222222, bArr, i9, i2, t2eVar, lfdVar);
                                    i21 = i3522222222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    cwdVar2 = cwdVar;
                                    i18 = i4;
                                    i19 = b22222222;
                                    obj3 = obj2;
                                    lfdVar4 = lfdVar;
                                    break;
                                } else {
                                    i19 = m(cwdVar2.s(w), bArr3, i14, i15, lfdVar2);
                                    if ((i11 & i32) != 0) {
                                        a = vnd.a(unsafe2.getObject(obj3, j), lfdVar2.c);
                                        unsafe2.putObject(obj3, j, a);
                                        int i40 = i12;
                                        i22 = i11 | i32;
                                        bArr5 = bArr3;
                                        i20 = i40;
                                        i17 = i15;
                                        lfdVar4 = lfdVar2;
                                        i18 = i4;
                                        i21 = i25;
                                        break;
                                    }
                                    a = lfdVar2.c;
                                    unsafe2.putObject(obj3, j, a);
                                    int i402 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr3;
                                    i20 = i402;
                                    i17 = i15;
                                    lfdVar4 = lfdVar2;
                                    i18 = i4;
                                    i21 = i25;
                                }
                                break;
                            case 10:
                                bArr3 = bArr;
                                i14 = i26;
                                i15 = i2;
                                unsafe2 = unsafe4;
                                lfdVar2 = lfdVar;
                                if (i28 == 2) {
                                    i19 = i4f.i(bArr3, i14, lfdVar2);
                                    a = lfdVar2.c;
                                    unsafe2.putObject(obj3, j, a);
                                    int i4022 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr3;
                                    i20 = i4022;
                                    i17 = i15;
                                    lfdVar4 = lfdVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i14;
                                    obj2 = obj3;
                                    i5 = i3;
                                    cwdVar = cwdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    mnd mndVar222222222 = (mnd) obj2;
                                    t2eVar = mndVar222222222.zzjp;
                                    if (t2eVar == t2e.e) {
                                    }
                                    int i35222222222 = i21;
                                    int b222222222 = i4f.b(i35222222222, bArr, i9, i2, t2eVar, lfdVar);
                                    i21 = i35222222222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    cwdVar2 = cwdVar;
                                    i18 = i4;
                                    i19 = b222222222;
                                    obj3 = obj2;
                                    lfdVar4 = lfdVar;
                                    break;
                                }
                                break;
                            case 12:
                                bArr3 = bArr;
                                i14 = i26;
                                i15 = i2;
                                unsafe2 = unsafe4;
                                lfdVar2 = lfdVar;
                                if (i28 == 0) {
                                    i19 = i4f.d(bArr3, i14, lfdVar2);
                                    int i41 = lfdVar2.a;
                                    cwdVar2.u(w);
                                    unsafe2.putInt(obj3, j, i41);
                                    int i40222 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr3;
                                    i20 = i40222;
                                    i17 = i15;
                                    lfdVar4 = lfdVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i14;
                                    obj2 = obj3;
                                    i5 = i3;
                                    cwdVar = cwdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    mnd mndVar2222222222 = (mnd) obj2;
                                    t2eVar = mndVar2222222222.zzjp;
                                    if (t2eVar == t2e.e) {
                                    }
                                    int i352222222222 = i21;
                                    int b2222222222 = i4f.b(i352222222222, bArr, i9, i2, t2eVar, lfdVar);
                                    i21 = i352222222222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    cwdVar2 = cwdVar;
                                    i18 = i4;
                                    i19 = b2222222222;
                                    obj3 = obj2;
                                    lfdVar4 = lfdVar;
                                    break;
                                }
                                break;
                            case 15:
                                bArr4 = bArr;
                                i14 = i26;
                                i16 = i2;
                                lfdVar3 = lfdVar;
                                unsafe2 = unsafe4;
                                if (i28 == 0) {
                                    i19 = i4f.d(bArr4, i14, lfdVar3);
                                    int i42 = lfdVar3.a;
                                    unsafe2.putInt(obj3, j, (i42 >>> 1) ^ (-(i42 & 1)));
                                    int i43 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr4;
                                    i20 = i43;
                                    i17 = i16;
                                    lfdVar4 = lfdVar3;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i14;
                                    obj2 = obj3;
                                    i5 = i3;
                                    cwdVar = cwdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    mnd mndVar22222222222 = (mnd) obj2;
                                    t2eVar = mndVar22222222222.zzjp;
                                    if (t2eVar == t2e.e) {
                                    }
                                    int i3522222222222 = i21;
                                    int b22222222222 = i4f.b(i3522222222222, bArr, i9, i2, t2eVar, lfdVar);
                                    i21 = i3522222222222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    cwdVar2 = cwdVar;
                                    i18 = i4;
                                    i19 = b22222222222;
                                    obj3 = obj2;
                                    lfdVar4 = lfdVar;
                                    break;
                                }
                                break;
                            case 16:
                                i16 = i2;
                                lfdVar3 = lfdVar;
                                if (i28 == 0) {
                                    int e2 = i4f.e(bArr, i26, lfdVar3);
                                    long j2 = lfdVar3.b;
                                    unsafe4.putLong(obj3, j, (j2 >>> i10) ^ (-(j2 & 1)));
                                    int i44 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr;
                                    i20 = i44;
                                    i19 = e2;
                                    i17 = i16;
                                    lfdVar4 = lfdVar3;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i26;
                                    obj2 = obj3;
                                    unsafe2 = unsafe4;
                                    i5 = i3;
                                    cwdVar = cwdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    mnd mndVar222222222222 = (mnd) obj2;
                                    t2eVar = mndVar222222222222.zzjp;
                                    if (t2eVar == t2e.e) {
                                    }
                                    int i35222222222222 = i21;
                                    int b222222222222 = i4f.b(i35222222222222, bArr, i9, i2, t2eVar, lfdVar);
                                    i21 = i35222222222222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    cwdVar2 = cwdVar;
                                    i18 = i4;
                                    i19 = b222222222222;
                                    obj3 = obj2;
                                    lfdVar4 = lfdVar;
                                    break;
                                }
                                break;
                            case 17:
                                if (i28 == 3) {
                                    i19 = l(cwdVar2.s(w), bArr, i26, i2, (i27 << 3) | 4, lfdVar);
                                    i16 = i2;
                                    lfdVar3 = lfdVar;
                                    bArr4 = bArr;
                                    unsafe4.putObject(obj3, j, (i11 & i32) == 0 ? lfdVar3.c : vnd.a(unsafe4.getObject(obj3, j), lfdVar3.c));
                                    int i432 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr4;
                                    i20 = i432;
                                    i17 = i16;
                                    lfdVar4 = lfdVar3;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i26;
                                    obj2 = obj3;
                                    unsafe2 = unsafe4;
                                    i5 = i3;
                                    cwdVar = cwdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    mnd mndVar2222222222222 = (mnd) obj2;
                                    t2eVar = mndVar2222222222222.zzjp;
                                    if (t2eVar == t2e.e) {
                                    }
                                    int i352222222222222 = i21;
                                    int b2222222222222 = i4f.b(i352222222222222, bArr, i9, i2, t2eVar, lfdVar);
                                    i21 = i352222222222222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    cwdVar2 = cwdVar;
                                    i18 = i4;
                                    i19 = b2222222222222;
                                    obj3 = obj2;
                                    lfdVar4 = lfdVar;
                                    break;
                                }
                                break;
                            default:
                                i13 = i26;
                                obj2 = obj3;
                                unsafe2 = unsafe4;
                                i5 = i3;
                                cwdVar = cwdVar2;
                                unsafe = unsafe2;
                                i20 = i12;
                                i9 = i13;
                                i21 = i25;
                                i22 = i11;
                                if (i21 != i5) {
                                }
                                mnd mndVar22222222222222 = (mnd) obj2;
                                t2eVar = mndVar22222222222222.zzjp;
                                if (t2eVar == t2e.e) {
                                }
                                int i3522222222222222 = i21;
                                int b22222222222222 = i4f.b(i3522222222222222, bArr, i9, i2, t2eVar, lfdVar);
                                i21 = i3522222222222222;
                                bArr5 = bArr;
                                i17 = i2;
                                cwdVar2 = cwdVar;
                                i18 = i4;
                                i19 = b22222222222222;
                                obj3 = obj2;
                                lfdVar4 = lfdVar;
                                break;
                        }
                    } else {
                        obj2 = obj3;
                        i8 = i26;
                        iArr = iArr2;
                        i4 = -1;
                        if (i30 != 27) {
                            i21 = i25;
                            if (i30 <= 49) {
                                unsafe = unsafe4;
                                int i45 = i20;
                                i7 = i22;
                                h = cwdVar2.i(obj2, bArr, i8, i2, i21, i27, i28, w, i29, i30, j, lfdVar);
                                obj3 = obj2;
                                if (h == i8) {
                                    i20 = i45;
                                    cwdVar = cwdVar2;
                                    obj2 = obj3;
                                } else {
                                    bArr5 = bArr;
                                    i20 = i45;
                                    i17 = i2;
                                    lfdVar4 = lfdVar;
                                    i19 = h;
                                    i18 = -1;
                                    i22 = i7;
                                }
                            } else {
                                unsafe = unsafe4;
                                i6 = i20;
                                i7 = i22;
                                if (i30 != 50) {
                                    h = cwdVar2.h(obj2, bArr, i8, i2, i21, i27, i28, i29, i30, j, w, lfdVar);
                                    cwdVar = cwdVar2;
                                    obj2 = obj2;
                                    if (h == i8) {
                                        i20 = i6;
                                    } else {
                                        bArr5 = bArr;
                                        i20 = i6;
                                        i17 = i2;
                                        i19 = h;
                                        cwdVar2 = cwdVar;
                                        obj3 = obj2;
                                        i18 = -1;
                                        i22 = i7;
                                        lfdVar4 = lfdVar;
                                    }
                                } else {
                                    if (i28 == 2) {
                                        cwdVar2.o(j, obj2, w);
                                        throw null;
                                    }
                                    cwdVar = cwdVar2;
                                    obj2 = obj2;
                                }
                            }
                            i9 = h;
                            i22 = i7;
                            i5 = i3;
                            if (i21 != i5) {
                            }
                            mnd mndVar222222222222222 = (mnd) obj2;
                            t2eVar = mndVar222222222222222.zzjp;
                            if (t2eVar == t2e.e) {
                            }
                            int i35222222222222222 = i21;
                            int b222222222222222 = i4f.b(i35222222222222222, bArr, i9, i2, t2eVar, lfdVar);
                            i21 = i35222222222222222;
                            bArr5 = bArr;
                            i17 = i2;
                            cwdVar2 = cwdVar;
                            i18 = i4;
                            i19 = b222222222222222;
                            obj3 = obj2;
                            lfdVar4 = lfdVar;
                        } else if (i28 == 2) {
                            dpd dpdVar = (dpd) unsafe4.getObject(obj2, j);
                            if (!((wed) dpdVar).a) {
                                int size = dpdVar.size();
                                dpdVar = dpdVar.f(size == 0 ? 10 : size << 1);
                                unsafe4.putObject(obj2, j, dpdVar);
                            }
                            i21 = i25;
                            i17 = i2;
                            i19 = k(cwdVar2.s(w), i25, bArr, i8, i2, dpdVar, lfdVar);
                            obj3 = obj2;
                            i18 = -1;
                            bArr5 = bArr;
                            lfdVar4 = lfdVar;
                        } else {
                            cwdVar = cwdVar2;
                            unsafe = unsafe4;
                            i6 = i20;
                            i21 = i25;
                            i7 = i22;
                        }
                    }
                } else {
                    cwdVar = cwdVar2;
                    obj2 = obj3;
                    iArr = iArr2;
                    i6 = i20;
                    i4 = i18;
                    i7 = i22;
                    unsafe = unsafe4;
                    i21 = i25;
                    i8 = i26;
                }
                i20 = i6;
                i5 = i3;
                i9 = i8;
                i22 = i7;
                if (i21 != i5) {
                }
                mnd mndVar2222222222222222 = (mnd) obj2;
                t2eVar = mndVar2222222222222222.zzjp;
                if (t2eVar == t2e.e) {
                }
                int i352222222222222222 = i21;
                int b2222222222222222 = i4f.b(i352222222222222222, bArr, i9, i2, t2eVar, lfdVar);
                i21 = i352222222222222222;
                bArr5 = bArr;
                i17 = i2;
                cwdVar2 = cwdVar;
                i18 = i4;
                i19 = b2222222222222222;
                obj3 = obj2;
                lfdVar4 = lfdVar;
            } else {
                cwdVar = cwdVar2;
                obj2 = obj3;
                iArr = iArr2;
                i4 = i18;
                unsafe = unsafe4;
                i5 = i3;
            }
        }
        if (i20 != i4) {
            unsafe.putInt(obj2, i20, i22);
        }
        int[] iArr3 = cwdVar.i;
        if (iArr3 != null) {
            for (int i46 : iArr3) {
                int i47 = iArr[i46];
                if (k4e.l(cwdVar.v(i46) & 1048575, obj2) != null) {
                    cwdVar.u(i46);
                }
            }
        }
        if (i5 != 0 ? i19 > i17 || i21 != i5 : i19 != i17) {
            throw mpd.b();
        }
        return i19;
    }

    public final void o(long j, Object obj, int i) {
        bud budVar;
        t(i);
        Unsafe unsafe = o;
        Object object = unsafe.getObject(obj, j);
        this.n.getClass();
        if (!((bud) object).a) {
            bud budVar2 = bud.b;
            if (budVar2.isEmpty()) {
                budVar = new bud();
            } else {
                bud budVar3 = new bud(budVar2);
                budVar3.a = true;
                budVar = budVar3;
            }
            oud.a(budVar, object);
            unsafe.putObject(obj, j, budVar);
        }
        throw new NoSuchMethodError();
    }

    public final void p(mnd mndVar, mnd mndVar2, int i) {
        long v = v(i) & 1048575;
        if (r(i, mndVar2)) {
            Object l = k4e.l(v, mndVar);
            Object l2 = k4e.l(v, mndVar2);
            if (l != null && l2 != null) {
                l2 = vnd.a(l, l2);
            } else if (l2 == null) {
                return;
            }
            k4e.d(v, mndVar, l2);
            x(mndVar, i);
        }
    }

    public final boolean q(int i, int i2, Object obj) {
        return k4e.j((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ec A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(int i, Object obj) {
        if (this.g) {
            int v = v(i);
            long j = 1048575 & v;
            switch ((v & 267386880) >>> 20) {
                case 0:
                    return k4e.d.A(obj, j) != 0.0d;
                case 1:
                    if (k4e.d.z(j, obj) != 0.0f) {
                    }
                    break;
                case 2:
                    if (k4e.k(j, obj) != 0) {
                    }
                    break;
                case 3:
                    if (k4e.k(j, obj) != 0) {
                    }
                    break;
                case 4:
                    if (k4e.j(j, obj) != 0) {
                    }
                    break;
                case 5:
                    if (k4e.k(j, obj) != 0) {
                    }
                    break;
                case 6:
                    if (k4e.j(j, obj) != 0) {
                    }
                    break;
                case 7:
                    return k4e.d.y(j, obj);
                case 8:
                    Object l = k4e.l(j, obj);
                    if (!(l instanceof String)) {
                        if (l instanceof vhd) {
                            if (!vhd.c.equals(l)) {
                            }
                        }
                        iy8.d();
                        return false;
                    }
                    if (!((String) l).isEmpty()) {
                    }
                    break;
                case 9:
                    if (k4e.l(j, obj) != null) {
                    }
                    break;
                case 10:
                    if (!vhd.c.equals(k4e.l(j, obj))) {
                    }
                    break;
                case 11:
                    if (k4e.j(j, obj) != 0) {
                    }
                    break;
                case 12:
                    if (k4e.j(j, obj) != 0) {
                    }
                    break;
                case 13:
                    if (k4e.j(j, obj) != 0) {
                    }
                    break;
                case 14:
                    if (k4e.k(j, obj) != 0) {
                    }
                    break;
                case 15:
                    if (k4e.j(j, obj) != 0) {
                    }
                    break;
                case 16:
                    if (k4e.k(j, obj) != 0) {
                    }
                    break;
                case 17:
                    if (k4e.l(j, obj) != null) {
                    }
                    break;
                default:
                    iy8.d();
                    return false;
            }
        } else {
            if ((k4e.j(r6 & 1048575, obj) & (1 << (this.a[i + 2] >>> 20))) != 0) {
            }
        }
    }

    public final lzd s(int i) {
        int i2 = (i / 4) << 1;
        Object[] objArr = this.b;
        lzd lzdVar = (lzd) objArr[i2];
        if (lzdVar != null) {
            return lzdVar;
        }
        lzd a = jyd.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final Object t(int i) {
        return this.b[(i / 4) << 1];
    }

    public final oee u(int i) {
        return (oee) this.b[((i / 4) << 1) + 1];
    }

    public final int v(int i) {
        return this.a[i + 1];
    }

    public final int w(int i) {
        int i2 = this.c;
        if (i < i2) {
            return -1;
        }
        int[] iArr = this.a;
        int i3 = this.e;
        if (i < i3) {
            int i4 = (i - i2) << 2;
            if (iArr[i4] == i) {
                return i4;
            }
            return -1;
        }
        if (i > this.d) {
            return -1;
        }
        int i5 = i3 - i2;
        int length = (iArr.length / 4) - 1;
        while (i5 <= length) {
            int i6 = (length + i5) >>> 1;
            int i7 = i6 << 2;
            int i8 = iArr[i7];
            if (i == i8) {
                return i7;
            }
            if (i < i8) {
                length = i6 - 1;
            } else {
                i5 = i6 + 1;
            }
        }
        return -1;
    }

    public final void x(mnd mndVar, int i) {
        if (this.g) {
            return;
        }
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        k4e.c(j, mndVar, k4e.j(j, mndVar) | (1 << (i2 >>> 20)));
    }

    public final void y(mnd mndVar, mnd mndVar2, int i) {
        int i2;
        int v = v(i);
        int[] iArr = this.a;
        int i3 = iArr[i];
        long j = v & 1048575;
        if (q(i3, i, mndVar2)) {
            Object l = k4e.l(j, mndVar);
            Object l2 = k4e.l(j, mndVar2);
            if (l != null && l2 != null) {
                k4e.d(j, mndVar, vnd.a(l, l2));
                i2 = iArr[i + 2];
            } else {
                if (l2 == null) {
                    return;
                }
                k4e.d(j, mndVar, l2);
                i2 = iArr[i + 2];
            }
            k4e.c(i2 & 1048575, mndVar, i3);
        }
    }

    public final boolean z(mnd mndVar, mnd mndVar2, int i) {
        return r(i, mndVar) == r(i, mndVar2);
    }
}
