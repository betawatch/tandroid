// default package

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.List;
import java.util.logging.Logger;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class mrd implements vud {
    public static final Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final int e;
    public final vid f;
    public final boolean g;
    public final int[] h;
    public final int[] i;
    public final int[] j;
    public final osd k;
    public final tmd l;
    public final jyd m;
    public final ypd n;

    static {
        Unsafe unsafe;
        Logger logger = uzd.a;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new q2((byte) 3));
        } catch (Throwable unused) {
            unsafe = null;
        }
        o = unsafe;
    }

    public mrd(int[] iArr, Object[] objArr, int i, int i2, int i3, vid vidVar, boolean z, int[] iArr2, int[] iArr3, int[] iArr4, osd osdVar, tmd tmdVar, jyd jydVar, jfd jfdVar, ypd ypdVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.g = z;
        this.h = iArr2;
        this.i = iArr3;
        this.j = iArr4;
        this.k = osdVar;
        this.l = tmdVar;
        this.m = jydVar;
        this.f = vidVar;
        this.n = ypdVar;
    }

    public static int A(Object obj, long j) {
        return ((Integer) uzd.l(obj, j)).intValue();
    }

    public static long B(Object obj, long j) {
        return ((Long) uzd.l(obj, j)).longValue();
    }

    public static int k(vud vudVar, int i, byte[] bArr, int i2, int i3, mkd mkdVar, sad sadVar) {
        int m = m(vudVar, bArr, i2, i3, sadVar);
        while (true) {
            mkdVar.add(sadVar.c);
            if (m >= i3) {
                break;
            }
            int d = pze.d(bArr, m, sadVar);
            if (i != sadVar.a) {
                break;
            }
            m = m(vudVar, bArr, d, i3, sadVar);
        }
        return m;
    }

    public static int l(vud vudVar, byte[] bArr, int i, int i2, int i3, sad sadVar) {
        mrd mrdVar = (mrd) vudVar;
        Object a = mrdVar.a();
        int j = mrdVar.j(a, bArr, i, i2, i3, sadVar);
        mrdVar.b(a);
        sadVar.c = a;
        return j;
    }

    public static int m(vud vudVar, byte[] bArr, int i, int i2, sad sadVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = pze.c(i4, bArr, i3, sadVar);
            i4 = sadVar.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw vkd.a();
        }
        Object a = vudVar.a();
        int i6 = i5 + i4;
        vudVar.c(a, bArr, i5, i6, sadVar);
        vudVar.b(a);
        sadVar.c = a;
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
    public static mrd n(fud fudVar, osd osdVar, tmd tmdVar, jyd jydVar, jfd jfdVar, ypd ypdVar) {
        int i;
        int i2;
        int i3;
        int[] iArr;
        phd phdVar;
        int i4;
        int i5;
        Field b;
        int i6;
        int i7;
        Object obj;
        int i8;
        Field b2;
        Field b3;
        if (!(fudVar instanceof fud)) {
            fyb.g();
            return null;
        }
        gud gudVar = fudVar.b;
        int i9 = 1;
        boolean z = (gudVar.d & 1) != 1;
        if (gudVar.e == 0) {
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            int i10 = gudVar.g;
            int i11 = gudVar.h;
            i = gudVar.k;
            i2 = i10;
            i3 = i11;
        }
        int[] iArr2 = new int[i << 2];
        Object[] objArr = new Object[i << 1];
        int i12 = gudVar.i;
        int[] iArr3 = i12 > 0 ? new int[i12] : null;
        int i13 = gudVar.l;
        int[] iArr4 = i13 > 0 ? new int[i13] : null;
        boolean a = gudVar.a();
        Class cls = gudVar.c;
        Object[] objArr2 = gudVar.b;
        if (a) {
            int i14 = gudVar.s;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                if (i14 >= gudVar.j || i15 >= ((i14 - i2) << 2)) {
                    int i18 = i9;
                    int i19 = gudVar.u;
                    phd phdVar2 = phd.s;
                    if (i19 <= phdVar2.a) {
                        iArr = iArr2;
                        phdVar = phdVar2;
                        Field field = gudVar.x;
                        c6c c6cVar = uzd.d;
                        int objectFieldOffset = (int) c6cVar.a.objectFieldOffset(field);
                        if ((gudVar.d & 1) == i18 && gudVar.u <= phd.d.a) {
                            int i20 = (gudVar.w / 32) + (gudVar.f << 1);
                            Object obj2 = objArr2[i20];
                            if (obj2 instanceof Field) {
                                b = (Field) obj2;
                            } else {
                                b = gud.b(cls, (String) obj2);
                                objArr2[i20] = b;
                            }
                            i5 = (int) c6cVar.a.objectFieldOffset(b);
                            i6 = gudVar.w % 32;
                            i4 = objectFieldOffset;
                            iArr[i15] = gudVar.s;
                            int i21 = i15 + 1;
                            int i22 = i5;
                            int i23 = gudVar.t;
                            int i24 = i4;
                            int i25 = ((i23 & 512) == 0 ? TLObject.FLAG_29 : 0) | ((i23 & 256) == 0 ? TLObject.FLAG_28 : 0);
                            i7 = gudVar.u;
                            iArr[i21] = i25 | (i7 << 20) | i24;
                            iArr[i15 + 2] = (i6 << 20) | i22;
                            obj = gudVar.A;
                            if (obj == null) {
                                int i26 = (i15 / 4) << 1;
                                objArr[i26] = obj;
                                Object obj3 = gudVar.y;
                                if (obj3 != null) {
                                    objArr[i26 + 1] = obj3;
                                } else {
                                    Object obj4 = gudVar.z;
                                    if (obj4 != null) {
                                        objArr[i26 + 1] = obj4;
                                    }
                                }
                                i8 = 1;
                            } else {
                                Object obj5 = gudVar.y;
                                if (obj5 != null) {
                                    i8 = 1;
                                    objArr[((i15 / 4) << 1) + 1] = obj5;
                                } else {
                                    i8 = 1;
                                    Object obj6 = gudVar.z;
                                    if (obj6 != null) {
                                        objArr[((i15 / 4) << 1) + 1] = obj6;
                                    }
                                }
                            }
                            if (i7 != phdVar.ordinal()) {
                                iArr3[i16] = i15;
                                i16++;
                            } else if (i7 >= 18 && i7 <= 49) {
                                iArr4[i17] = iArr[i21] & 1048575;
                                i17++;
                            }
                            if (gudVar.a()) {
                                break;
                            }
                            i14 = gudVar.s;
                        } else {
                            i4 = objectFieldOffset;
                            i5 = 0;
                        }
                    } else {
                        int i27 = gudVar.v << 1;
                        Object obj7 = objArr2[i27];
                        if (obj7 instanceof Field) {
                            b2 = (Field) obj7;
                        } else {
                            b2 = gud.b(cls, (String) obj7);
                            objArr2[i27] = b2;
                        }
                        c6c c6cVar2 = uzd.d;
                        iArr = iArr2;
                        phdVar = phdVar2;
                        int objectFieldOffset2 = (int) c6cVar2.a.objectFieldOffset(b2);
                        int i28 = (gudVar.v << 1) + 1;
                        Object obj8 = objArr2[i28];
                        if (obj8 instanceof Field) {
                            b3 = (Field) obj8;
                        } else {
                            b3 = gud.b(cls, (String) obj8);
                            objArr2[i28] = b3;
                        }
                        i5 = (int) c6cVar2.a.objectFieldOffset(b3);
                        i4 = objectFieldOffset2;
                    }
                    i6 = 0;
                    iArr[i15] = gudVar.s;
                    int i212 = i15 + 1;
                    int i222 = i5;
                    int i232 = gudVar.t;
                    int i242 = i4;
                    int i252 = ((i232 & 512) == 0 ? TLObject.FLAG_29 : 0) | ((i232 & 256) == 0 ? TLObject.FLAG_28 : 0);
                    i7 = gudVar.u;
                    iArr[i212] = i252 | (i7 << 20) | i242;
                    iArr[i15 + 2] = (i6 << 20) | i222;
                    obj = gudVar.A;
                    if (obj == null) {
                    }
                    if (i7 != phdVar.ordinal()) {
                    }
                    if (gudVar.a()) {
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
        return new mrd(iArr, objArr, i2, i3, gudVar.j, fudVar.a, z, gudVar.m, iArr3, iArr4, osdVar, tmdVar, jydVar, jfdVar, ypdVar);
    }

    @Override // vud
    public final Object a() {
        this.k.getClass();
        return this.f.a(4);
    }

    @Override // vud
    public final void b(Object obj) {
        int[] iArr = this.i;
        if (iArr != null) {
            for (int i : iArr) {
                long v = v(i) & 1048575;
                Object l = uzd.l(obj, v);
                if (l != null) {
                    this.n.getClass();
                    ((lpd) l).a = false;
                    uzd.d(obj, v, l);
                }
            }
        }
        int[] iArr2 = this.j;
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                this.l.a(obj, i2);
            }
        }
        this.m.getClass();
        ((vid) obj).zzjp.d = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x01e4  */
    @Override // vud
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Object obj, byte[] bArr, int i, int i2, sad sadVar) {
        int i3;
        int i4;
        dyd dydVar;
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
        mrd mrdVar = this;
        byte[] bArr2 = bArr;
        int i6 = i2;
        sad sadVar2 = sadVar;
        if (!mrdVar.g) {
            j(obj, bArr, i, i6, 0, sadVar);
            return;
        }
        int i7 = i;
        while (i7 < i6) {
            int i8 = i7 + 1;
            int i9 = bArr2[i7];
            if (i9 < 0) {
                i8 = pze.c(i9, bArr2, i8, sadVar2);
                i9 = sadVar2.a;
            }
            int i10 = i9;
            int i11 = i8;
            int i12 = i10 >>> 3;
            int i13 = i10 & 7;
            int w = mrdVar.w(i12);
            if (w >= 0) {
                int i14 = mrdVar.a[w + 1];
                int i15 = (267386880 & i14) >>> 20;
                long j2 = 1048575 & i14;
                Unsafe unsafe3 = o;
                if (i15 <= 17) {
                    switch (i15) {
                        case 0:
                            if (i13 != 1) {
                                break;
                            } else {
                                uzd.d.m(obj, j2, Double.longBitsToDouble(pze.h(i11, bArr2)));
                                i7 = i11 + 8;
                                break;
                            }
                        case 1:
                            if (i13 != 5) {
                                break;
                            } else {
                                uzd.d.n(obj, j2, Float.intBitsToFloat(pze.f(i11, bArr2)));
                                i5 = i11 + 4;
                                i7 = i5;
                                break;
                            }
                        case 2:
                        case 3:
                            if (i13 != 0) {
                                break;
                            } else {
                                e = pze.e(bArr2, i11, sadVar2);
                                j = sadVar2.b;
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
                                i5 = pze.d(bArr2, i11, sadVar2);
                                unsafe.putInt(obj3, j2, sadVar2.a);
                                i7 = i5;
                                break;
                            }
                        case 5:
                        case 14:
                            if (i13 != 1) {
                                break;
                            } else {
                                unsafe3.putLong(obj, j2, pze.h(i11, bArr2));
                                i5 = i11 + 8;
                                i7 = i5;
                                break;
                            }
                        case 6:
                        case 13:
                            if (i13 != 5) {
                                break;
                            } else {
                                unsafe3.putInt(obj, j2, pze.f(i11, bArr2));
                                i5 = i11 + 4;
                                i7 = i5;
                                break;
                            }
                        case 7:
                            if (i13 != 0) {
                                break;
                            } else {
                                i5 = pze.e(bArr2, i11, sadVar2);
                                uzd.d.o(obj, j2, sadVar2.b != 0);
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
                                    i5 = pze.d(bArr2, i11, sadVar2);
                                    int i16 = sadVar2.a;
                                    if (i16 == 0) {
                                        sadVar2.c = "";
                                    } else {
                                        sadVar2.c = new String(bArr2, i5, i16, ejd.a);
                                        i5 += i16;
                                    }
                                } else {
                                    i5 = pze.g(bArr2, i11, sadVar2);
                                }
                                a = sadVar2.c;
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
                                i5 = m(mrdVar.s(w), bArr2, i11, i6, sadVar2);
                                Object object = unsafe2.getObject(obj4, j2);
                                Object obj5 = sadVar2.c;
                                if (object == null) {
                                    unsafe2.putObject(obj4, j2, obj5);
                                    i7 = i5;
                                    break;
                                } else {
                                    a = ejd.a(object, obj5);
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
                                i5 = pze.i(bArr2, i11, sadVar2);
                                a = sadVar2.c;
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
                                i5 = pze.d(bArr2, i11, sadVar2);
                                unsafe.putInt(obj3, j2, sadVar2.a);
                                i7 = i5;
                                break;
                            }
                        case 15:
                            if (i13 != 0) {
                                break;
                            } else {
                                i5 = pze.d(bArr2, i11, sadVar2);
                                int i17 = sadVar2.a;
                                unsafe3.putInt(obj, j2, (i17 >>> 1) ^ (-(i17 & 1)));
                                i7 = i5;
                                break;
                            }
                        case 16:
                            if (i13 != 0) {
                                break;
                            } else {
                                e = pze.e(bArr2, i11, sadVar2);
                                long j3 = sadVar2.b;
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
                        h = mrdVar.i(obj, bArr, i11, i2, i10, i12, i13, w, i14, i15, j2, sadVar);
                        if (h != i11) {
                            bArr2 = bArr;
                            i6 = i2;
                            sadVar2 = sadVar;
                            i7 = h;
                        } else {
                            i4 = h;
                            vid vidVar = (vid) obj;
                            dydVar = vidVar.zzjp;
                            if (dydVar == dyd.e) {
                                dydVar = dyd.b();
                                vidVar.zzjp = dydVar;
                            }
                            bArr2 = bArr;
                            sadVar2 = sadVar;
                            i7 = pze.b(i10, bArr, i4, i2, dydVar, sadVar);
                            i6 = i2;
                            mrdVar = this;
                        }
                    } else {
                        i3 = i11;
                        if (i15 != 50) {
                            h = mrdVar.h(obj, bArr, i3, i2, i10, i12, i13, i14, i15, j2, w, sadVar);
                            if (h == i3) {
                                i4 = h;
                                vid vidVar2 = (vid) obj;
                                dydVar = vidVar2.zzjp;
                                if (dydVar == dyd.e) {
                                }
                                bArr2 = bArr;
                                sadVar2 = sadVar;
                                i7 = pze.b(i10, bArr, i4, i2, dydVar, sadVar);
                                i6 = i2;
                                mrdVar = this;
                            } else {
                                mrdVar = this;
                                bArr2 = bArr;
                                i6 = i2;
                                sadVar2 = sadVar;
                                i7 = h;
                            }
                        } else if (i13 == 2) {
                            mrdVar.o(obj, w, j2);
                            throw null;
                        }
                    }
                } else if (i13 == 2) {
                    mkd mkdVar = (mkd) unsafe3.getObject(obj, j2);
                    if (!((dad) mkdVar).a) {
                        int size = mkdVar.size();
                        mkdVar = mkdVar.f(size == 0 ? 10 : size << 1);
                        unsafe3.putObject(obj, j2, mkdVar);
                    }
                    i7 = k(mrdVar.s(w), i10, bArr2, i11, i6, mkdVar, sadVar2);
                    bArr2 = bArr;
                    i6 = i2;
                    sadVar2 = sadVar;
                } else {
                    i10 = i10;
                }
                i4 = i3;
                vid vidVar22 = (vid) obj;
                dydVar = vidVar22.zzjp;
                if (dydVar == dyd.e) {
                }
                bArr2 = bArr;
                sadVar2 = sadVar;
                i7 = pze.b(i10, bArr, i4, i2, dydVar, sadVar);
                i6 = i2;
                mrdVar = this;
            }
            i3 = i11;
            i4 = i3;
            vid vidVar222 = (vid) obj;
            dydVar = vidVar222.zzjp;
            if (dydVar == dyd.e) {
            }
            bArr2 = bArr;
            sadVar2 = sadVar;
            i7 = pze.b(i10, bArr, i4, i2, dydVar, sadVar);
            i6 = i2;
            mrdVar = this;
        }
        if (i7 != i6) {
            throw vkd.b();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // vud
    public final void d(vid vidVar, vid vidVar2) {
        vid vidVar3;
        long k;
        Unsafe unsafe;
        int i;
        vidVar2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                vid vidVar4 = vidVar;
                if (this.g) {
                    return;
                }
                gvd.a(this.m, vidVar4, vidVar2);
                return;
            }
            int v = v(i2);
            long j = v & 1048575;
            int i3 = iArr[i2];
            switch ((v & 267386880) >>> 20) {
                case 0:
                    vidVar3 = vidVar;
                    if (!r(i2, vidVar2)) {
                        break;
                    } else {
                        c6c c6cVar = uzd.d;
                        c6cVar.m(vidVar3, j, c6cVar.A(vidVar2, j));
                        x(vidVar3, i2);
                        break;
                    }
                case 1:
                    vidVar3 = vidVar;
                    if (!r(i2, vidVar2)) {
                        break;
                    } else {
                        c6c c6cVar2 = uzd.d;
                        c6cVar2.n(vidVar3, j, c6cVar2.z(vidVar2, j));
                        x(vidVar3, i2);
                        break;
                    }
                case 2:
                    vidVar3 = vidVar;
                    if (!r(i2, vidVar2)) {
                        break;
                    }
                    k = uzd.k(vidVar2, j);
                    unsafe = uzd.d.a;
                    unsafe.putLong(vidVar3, j, k);
                    x(vidVar3, i2);
                    break;
                case 3:
                    vidVar3 = vidVar;
                    if (!r(i2, vidVar2)) {
                        break;
                    }
                    k = uzd.k(vidVar2, j);
                    unsafe = uzd.d.a;
                    unsafe.putLong(vidVar3, j, k);
                    x(vidVar3, i2);
                    break;
                case 4:
                    vidVar3 = vidVar;
                    if (!r(i2, vidVar2)) {
                        break;
                    }
                    uzd.c(vidVar3, uzd.j(vidVar2, j), j);
                    x(vidVar3, i2);
                    break;
                case 5:
                    vidVar3 = vidVar;
                    if (!r(i2, vidVar2)) {
                        break;
                    }
                    k = uzd.k(vidVar2, j);
                    unsafe = uzd.d.a;
                    unsafe.putLong(vidVar3, j, k);
                    x(vidVar3, i2);
                    break;
                case 6:
                    vidVar3 = vidVar;
                    if (!r(i2, vidVar2)) {
                        break;
                    }
                    uzd.c(vidVar3, uzd.j(vidVar2, j), j);
                    x(vidVar3, i2);
                    break;
                case 7:
                    vidVar3 = vidVar;
                    if (!r(i2, vidVar2)) {
                        break;
                    } else {
                        c6c c6cVar3 = uzd.d;
                        c6cVar3.o(vidVar3, j, c6cVar3.y(vidVar2, j));
                        x(vidVar3, i2);
                        break;
                    }
                case 8:
                    vidVar3 = vidVar;
                    if (!r(i2, vidVar2)) {
                        break;
                    }
                    uzd.d(vidVar3, j, uzd.l(vidVar2, j));
                    x(vidVar3, i2);
                    break;
                case 9:
                    vidVar3 = vidVar;
                    p(vidVar3, vidVar2, i2);
                    break;
                case 10:
                    vidVar3 = vidVar;
                    if (!r(i2, vidVar2)) {
                        break;
                    }
                    uzd.d(vidVar3, j, uzd.l(vidVar2, j));
                    x(vidVar3, i2);
                    break;
                case 11:
                    vidVar3 = vidVar;
                    if (!r(i2, vidVar2)) {
                        break;
                    }
                    uzd.c(vidVar3, uzd.j(vidVar2, j), j);
                    x(vidVar3, i2);
                    break;
                case 12:
                    vidVar3 = vidVar;
                    if (!r(i2, vidVar2)) {
                        break;
                    }
                    uzd.c(vidVar3, uzd.j(vidVar2, j), j);
                    x(vidVar3, i2);
                    break;
                case 13:
                    vidVar3 = vidVar;
                    if (!r(i2, vidVar2)) {
                        break;
                    }
                    uzd.c(vidVar3, uzd.j(vidVar2, j), j);
                    x(vidVar3, i2);
                    break;
                case 14:
                    vidVar3 = vidVar;
                    if (!r(i2, vidVar2)) {
                        break;
                    }
                    k = uzd.k(vidVar2, j);
                    unsafe = uzd.d.a;
                    unsafe.putLong(vidVar3, j, k);
                    x(vidVar3, i2);
                    break;
                case 15:
                    vidVar3 = vidVar;
                    if (!r(i2, vidVar2)) {
                        break;
                    }
                    uzd.c(vidVar3, uzd.j(vidVar2, j), j);
                    x(vidVar3, i2);
                    break;
                case 16:
                    if (r(i2, vidVar2)) {
                        k = uzd.k(vidVar2, j);
                        unsafe = uzd.d.a;
                        vidVar3 = vidVar;
                        unsafe.putLong(vidVar3, j, k);
                        x(vidVar3, i2);
                        break;
                    }
                    vidVar3 = vidVar;
                    break;
                case 17:
                    p(vidVar, vidVar2, i2);
                    vidVar3 = vidVar;
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
                case kk7.S /* 30 */:
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
                    this.l.b(vidVar, vidVar2, j);
                    vidVar3 = vidVar;
                    break;
                case 50:
                    Class cls = gvd.a;
                    Object l = uzd.l(vidVar, j);
                    Object l2 = uzd.l(vidVar2, j);
                    this.n.getClass();
                    uzd.d(vidVar, j, ypd.a(l, l2));
                    vidVar3 = vidVar;
                    break;
                case kk7.n0 /* 51 */:
                case kk7.o0 /* 52 */:
                case kk7.p0 /* 53 */:
                case kk7.q0 /* 54 */:
                case kk7.r0 /* 55 */:
                case 56:
                case kk7.t0 /* 57 */:
                case kk7.u0 /* 58 */:
                case kk7.v0 /* 59 */:
                    if (q(i3, i2, vidVar2)) {
                        uzd.d(vidVar, j, uzd.l(vidVar2, j));
                        i = iArr[i2 + 2];
                        uzd.c(vidVar, i3, i & 1048575);
                    }
                    vidVar3 = vidVar;
                    break;
                case kk7.w0 /* 60 */:
                case kk7.E0 /* 68 */:
                    y(vidVar, vidVar2, i2);
                    vidVar3 = vidVar;
                    break;
                case kk7.x0 /* 61 */:
                case kk7.y0 /* 62 */:
                case kk7.z0 /* 63 */:
                case 64:
                case 65:
                case kk7.C0 /* 66 */:
                case kk7.D0 /* 67 */:
                    if (q(i3, i2, vidVar2)) {
                        uzd.d(vidVar, j, uzd.l(vidVar2, j));
                        i = iArr[i2 + 2];
                        uzd.c(vidVar, i3, i & 1048575);
                    }
                    vidVar3 = vidVar;
                    break;
                default:
                    vidVar3 = vidVar;
                    break;
            }
            i2 += 4;
            vidVar = vidVar3;
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
    @Override // vud
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(vid vidVar) {
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
                    doubleToLongBits = Double.doubleToLongBits(uzd.d.A(vidVar, j));
                    floatToIntBits = ejd.b(doubleToLongBits);
                    i3 = floatToIntBits + i;
                    break;
                case 1:
                    i = i3 * 53;
                    floatToIntBits = Float.floatToIntBits(uzd.d.z(vidVar, j));
                    i3 = floatToIntBits + i;
                    break;
                case 2:
                case 3:
                case 5:
                    i = i3 * 53;
                    doubleToLongBits = uzd.k(vidVar, j);
                    floatToIntBits = ejd.b(doubleToLongBits);
                    i3 = floatToIntBits + i;
                    break;
                case 4:
                case 6:
                    i = i3 * 53;
                    floatToIntBits = uzd.j(vidVar, j);
                    i3 = floatToIntBits + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean y = uzd.d.y(vidVar, j);
                    Charset charset = ejd.a;
                    break;
                case 8:
                    i = i3 * 53;
                    floatToIntBits = ((String) uzd.l(vidVar, j)).hashCode();
                    i3 = floatToIntBits + i;
                    break;
                case 9:
                    l = uzd.l(vidVar, j);
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
                case kk7.S /* 30 */:
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
                    l2 = uzd.l(vidVar, j);
                    floatToIntBits = l2.hashCode();
                    i3 = floatToIntBits + i;
                    break;
                case 11:
                case 12:
                case 13:
                case 15:
                    i = i3 * 53;
                    floatToIntBits = uzd.j(vidVar, j);
                    i3 = floatToIntBits + i;
                    break;
                case 14:
                case 16:
                    i = i3 * 53;
                    k = uzd.k(vidVar, j);
                    floatToIntBits = ejd.b(k);
                    i3 = floatToIntBits + i;
                    break;
                case 17:
                    l = uzd.l(vidVar, j);
                    break;
                case kk7.n0 /* 51 */:
                    if (q(i5, i4, vidVar)) {
                        i = i3 * 53;
                        k = Double.doubleToLongBits(((Double) uzd.l(vidVar, j)).doubleValue());
                        floatToIntBits = ejd.b(k);
                        i3 = floatToIntBits + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.o0 /* 52 */:
                    if (q(i5, i4, vidVar)) {
                        i = i3 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) uzd.l(vidVar, j)).floatValue());
                        i3 = floatToIntBits + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.p0 /* 53 */:
                    if (!q(i5, i4, vidVar)) {
                        break;
                    }
                    i = i3 * 53;
                    k = B(vidVar, j);
                    floatToIntBits = ejd.b(k);
                    i3 = floatToIntBits + i;
                    break;
                case kk7.q0 /* 54 */:
                    if (!q(i5, i4, vidVar)) {
                        break;
                    }
                    i = i3 * 53;
                    k = B(vidVar, j);
                    floatToIntBits = ejd.b(k);
                    i3 = floatToIntBits + i;
                    break;
                case kk7.r0 /* 55 */:
                    if (!q(i5, i4, vidVar)) {
                        break;
                    }
                    i = i3 * 53;
                    floatToIntBits = A(vidVar, j);
                    i3 = floatToIntBits + i;
                    break;
                case 56:
                    if (!q(i5, i4, vidVar)) {
                        break;
                    }
                    i = i3 * 53;
                    k = B(vidVar, j);
                    floatToIntBits = ejd.b(k);
                    i3 = floatToIntBits + i;
                    break;
                case kk7.t0 /* 57 */:
                    if (!q(i5, i4, vidVar)) {
                        break;
                    }
                    i = i3 * 53;
                    floatToIntBits = A(vidVar, j);
                    i3 = floatToIntBits + i;
                    break;
                case kk7.u0 /* 58 */:
                    if (q(i5, i4, vidVar)) {
                        i2 = i3 * 53;
                        boolean booleanValue = ((Boolean) uzd.l(vidVar, j)).booleanValue();
                        Charset charset2 = ejd.a;
                        break;
                    } else {
                        break;
                    }
                case kk7.v0 /* 59 */:
                    if (!q(i5, i4, vidVar)) {
                        break;
                    }
                    i = i3 * 53;
                    floatToIntBits = ((String) uzd.l(vidVar, j)).hashCode();
                    i3 = floatToIntBits + i;
                    break;
                case kk7.w0 /* 60 */:
                    if (!q(i5, i4, vidVar)) {
                        break;
                    }
                    l2 = uzd.l(vidVar, j);
                    i = i3 * 53;
                    floatToIntBits = l2.hashCode();
                    i3 = floatToIntBits + i;
                    break;
                case kk7.x0 /* 61 */:
                    if (!q(i5, i4, vidVar)) {
                        break;
                    }
                    i = i3 * 53;
                    l2 = uzd.l(vidVar, j);
                    floatToIntBits = l2.hashCode();
                    i3 = floatToIntBits + i;
                    break;
                case kk7.y0 /* 62 */:
                    if (!q(i5, i4, vidVar)) {
                        break;
                    }
                    i = i3 * 53;
                    floatToIntBits = A(vidVar, j);
                    i3 = floatToIntBits + i;
                    break;
                case kk7.z0 /* 63 */:
                    if (!q(i5, i4, vidVar)) {
                        break;
                    }
                    i = i3 * 53;
                    floatToIntBits = A(vidVar, j);
                    i3 = floatToIntBits + i;
                    break;
                case 64:
                    if (!q(i5, i4, vidVar)) {
                        break;
                    }
                    i = i3 * 53;
                    floatToIntBits = A(vidVar, j);
                    i3 = floatToIntBits + i;
                    break;
                case 65:
                    if (!q(i5, i4, vidVar)) {
                        break;
                    }
                    i = i3 * 53;
                    k = B(vidVar, j);
                    floatToIntBits = ejd.b(k);
                    i3 = floatToIntBits + i;
                    break;
                case kk7.C0 /* 66 */:
                    if (!q(i5, i4, vidVar)) {
                        break;
                    }
                    i = i3 * 53;
                    floatToIntBits = A(vidVar, j);
                    i3 = floatToIntBits + i;
                    break;
                case kk7.D0 /* 67 */:
                    if (!q(i5, i4, vidVar)) {
                        break;
                    }
                    i = i3 * 53;
                    k = B(vidVar, j);
                    floatToIntBits = ejd.b(k);
                    i3 = floatToIntBits + i;
                    break;
                case kk7.E0 /* 68 */:
                    if (!q(i5, i4, vidVar)) {
                        break;
                    }
                    l2 = uzd.l(vidVar, j);
                    i = i3 * 53;
                    floatToIntBits = l2.hashCode();
                    i3 = floatToIntBits + i;
                    break;
            }
        }
        this.m.getClass();
        return vidVar.zzjp.hashCode() + (i3 * 53);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (gvd.c(uzd.l(r11, r7), uzd.l(r12, r7)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (uzd.k(r11, r7) == uzd.k(r12, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (uzd.j(r11, r7) == uzd.j(r12, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (uzd.k(r11, r7) == uzd.k(r12, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (uzd.j(r11, r7) == uzd.j(r12, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        if (uzd.j(r11, r7) == uzd.j(r12, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
    
        if (uzd.j(r11, r7) == uzd.j(r12, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        if (gvd.c(uzd.l(r11, r7), uzd.l(r12, r7)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
    
        if (gvd.c(uzd.l(r11, r7), uzd.l(r12, r7)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010e, code lost:
    
        if (gvd.c(uzd.l(r11, r7), uzd.l(r12, r7)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0122, code lost:
    
        if (r5.y(r11, r7) != r5.y(r12, r7)) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0134, code lost:
    
        if (uzd.j(r11, r7) == uzd.j(r12, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0148, code lost:
    
        if (uzd.k(r11, r7) == uzd.k(r12, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0159, code lost:
    
        if (uzd.j(r11, r7) == uzd.j(r12, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016c, code lost:
    
        if (uzd.k(r11, r7) == uzd.k(r12, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017f, code lost:
    
        if (uzd.k(r11, r7) == uzd.k(r12, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0190, code lost:
    
        if (uzd.j(r11, r7) == uzd.j(r12, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a3, code lost:
    
        if (uzd.k(r11, r7) == uzd.k(r12, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (gvd.c(uzd.l(r11, r7), uzd.l(r12, r7)) != false) goto L104;
     */
    @Override // vud
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(vid vidVar, vid vidVar2) {
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
                        if (z(vidVar, vidVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (z(vidVar, vidVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (z(vidVar, vidVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (z(vidVar, vidVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (z(vidVar, vidVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (z(vidVar, vidVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (z(vidVar, vidVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (z(vidVar, vidVar2, i)) {
                            c6c c6cVar = uzd.d;
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (z(vidVar, vidVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (z(vidVar, vidVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (z(vidVar, vidVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (z(vidVar, vidVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (z(vidVar, vidVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (z(vidVar, vidVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (z(vidVar, vidVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (z(vidVar, vidVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (z(vidVar, vidVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (z(vidVar, vidVar2, i)) {
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
                    case kk7.S /* 30 */:
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
                        z = gvd.c(uzd.l(vidVar, j), uzd.l(vidVar2, j));
                        break;
                    case kk7.n0 /* 51 */:
                    case kk7.o0 /* 52 */:
                    case kk7.p0 /* 53 */:
                    case kk7.q0 /* 54 */:
                    case kk7.r0 /* 55 */:
                    case 56:
                    case kk7.t0 /* 57 */:
                    case kk7.u0 /* 58 */:
                    case kk7.v0 /* 59 */:
                    case kk7.w0 /* 60 */:
                    case kk7.x0 /* 61 */:
                    case kk7.y0 /* 62 */:
                    case kk7.z0 /* 63 */:
                    case 64:
                    case 65:
                    case kk7.C0 /* 66 */:
                    case kk7.D0 /* 67 */:
                    case kk7.E0 /* 68 */:
                        long j2 = iArr[i + 2] & 1048575;
                        if (uzd.j(vidVar, j2) == uzd.j(vidVar2, j2)) {
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
                if (vidVar.zzjp.equals(vidVar2.zzjp)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // vud
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
                    if ((z3 ? r(w, obj) : (i & i4) != 0 ? z : false) && !s(w).g(uzd.l(obj, v & 1048575))) {
                        return false;
                    }
                    i3++;
                    z2 = z;
                    iArr2 = iArr;
                } else {
                    if (i8 != 27) {
                        if (i8 == 60 || i8 == 68) {
                            if (q(i5, w, obj) && !s(w).g(uzd.l(obj, v & 1048575))) {
                                return false;
                            }
                        } else if (i8 != 49) {
                            if (i8 == 50) {
                                Object l = uzd.l(obj, v & 1048575);
                                this.n.getClass();
                                if (!((lpd) l).isEmpty()) {
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
                    List list = (List) uzd.l(obj, v & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        vud s = s(w);
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

    public final int h(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, sad sadVar) {
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
            case kk7.n0 /* 51 */:
                i9 = i;
                if (i5 != 1) {
                    return i9;
                }
                valueOf = Double.valueOf(Double.longBitsToDouble(pze.h(i9, bArr)));
                unsafe.putObject(obj, j, valueOf);
                e = i9 + 8;
                unsafe.putInt(obj, j2, i4);
                return e;
            case kk7.o0 /* 52 */:
                i10 = i;
                if (i5 != 5) {
                    return i10;
                }
                valueOf2 = Float.valueOf(Float.intBitsToFloat(pze.f(i10, bArr)));
                unsafe.putObject(obj, j, valueOf2);
                e = i10 + 4;
                unsafe.putInt(obj, j2, i4);
                return e;
            case kk7.p0 /* 53 */:
            case kk7.q0 /* 54 */:
                if (i5 != 0) {
                    return i;
                }
                e = pze.e(bArr, i, sadVar);
                valueOf3 = Long.valueOf(sadVar.b);
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case kk7.r0 /* 55 */:
            case kk7.y0 /* 62 */:
                if (i5 != 0) {
                    return i;
                }
                e = pze.d(bArr, i, sadVar);
                valueOf3 = Integer.valueOf(sadVar.a);
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case 56:
            case 65:
                i9 = i;
                if (i5 != 1) {
                    return i9;
                }
                valueOf = Long.valueOf(pze.h(i9, bArr));
                unsafe.putObject(obj, j, valueOf);
                e = i9 + 8;
                unsafe.putInt(obj, j2, i4);
                return e;
            case kk7.t0 /* 57 */:
            case 64:
                i10 = i;
                if (i5 != 5) {
                    return i10;
                }
                valueOf2 = Integer.valueOf(pze.f(i10, bArr));
                unsafe.putObject(obj, j, valueOf2);
                e = i10 + 4;
                unsafe.putInt(obj, j2, i4);
                return e;
            case kk7.u0 /* 58 */:
                if (i5 != 0) {
                    return i;
                }
                e = pze.e(bArr, i, sadVar);
                valueOf3 = Boolean.valueOf(sadVar.b != 0);
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case kk7.v0 /* 59 */:
                if (i5 != 2) {
                    return i;
                }
                e = pze.d(bArr, i, sadVar);
                i11 = sadVar.a;
                if (i11 == 0) {
                    valueOf3 = "";
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j2, i4);
                    return e;
                }
                if ((i6 & TLObject.FLAG_29) != 0) {
                    if (!l0e.a.b(bArr, e, e + i11)) {
                        throw new vkd("Protocol message had invalid UTF-8.");
                    }
                }
                str = new String(bArr, e, i11, ejd.a);
                unsafe.putObject(obj, j, str);
                e += i11;
                unsafe.putInt(obj, j2, i4);
                return e;
            case kk7.w0 /* 60 */:
                if (i5 != 2) {
                    return i;
                }
                e = m(s(i8), bArr, i, i2, sadVar);
                object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                valueOf3 = sadVar.c;
                if (object != null) {
                    valueOf3 = ejd.a(object, valueOf3);
                }
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case kk7.x0 /* 61 */:
                if (i5 != 2) {
                    return i;
                }
                e = pze.d(bArr, i, sadVar);
                i11 = sadVar.a;
                if (i11 == 0) {
                    valueOf3 = cdd.c;
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j2, i4);
                    return e;
                }
                str = cdd.i(e, i11, bArr);
                unsafe.putObject(obj, j, str);
                e += i11;
                unsafe.putInt(obj, j2, i4);
                return e;
            case kk7.z0 /* 63 */:
                if (i5 != 0) {
                    return i;
                }
                int d = pze.d(bArr, i, sadVar);
                int i12 = sadVar.a;
                u(i8);
                unsafe.putObject(obj, j, Integer.valueOf(i12));
                e = d;
                unsafe.putInt(obj, j2, i4);
                return e;
            case kk7.C0 /* 66 */:
                if (i5 != 0) {
                    return i;
                }
                e = pze.d(bArr, i, sadVar);
                int i13 = sadVar.a;
                valueOf3 = Integer.valueOf((i13 >>> 1) ^ (-(i13 & 1)));
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case kk7.D0 /* 67 */:
                if (i5 != 0) {
                    return i;
                }
                e = pze.e(bArr, i, sadVar);
                long j3 = sadVar.b;
                valueOf3 = Long.valueOf((j3 >>> 1) ^ (-(j3 & 1)));
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case kk7.E0 /* 68 */:
                if (i5 == 3) {
                    e = l(s(i8), bArr, i, i2, (i3 & (-8)) | 4, sadVar);
                    object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    Object obj2 = sadVar.c;
                    if (object != null) {
                        obj2 = ejd.a(object, obj2);
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
    
        fyb.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0181, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        if (r12 == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        r5.add(cdd.i(r9, r12, r11));
        r9 = r9 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
    
        if (r9 >= r13) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
    
        r12 = pze.d(r11, r9, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
    
        if (r14 != r23.a) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        r9 = pze.d(r11, r12, r23);
        r12 = r23.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a8, code lost:
    
        if (r12 != 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
    
        r5.add(cdd.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0098, code lost:
    
        r5.add(cdd.c);
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
    public final int i(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, sad sadVar) {
        Unsafe unsafe = o;
        mkd mkdVar = (mkd) unsafe.getObject(obj, j2);
        if (!((dad) mkdVar).a) {
            int size = mkdVar.size();
            mkdVar = mkdVar.f(size == 0 ? 10 : size << 1);
            unsafe.putObject(obj, j2, mkdVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 != 2) {
                }
                fyb.g();
                return 0;
            case 19:
            case 36:
                if (i5 != 2) {
                }
                fyb.g();
                return 0;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 != 2) {
                }
                fyb.g();
                return 0;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 != 2) {
                }
                fyb.g();
                return 0;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 != 2) {
                }
                fyb.g();
                return 0;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 != 2) {
                }
                fyb.g();
                return 0;
            case 25:
            case 42:
                if (i5 != 2) {
                }
                fyb.g();
                return 0;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int d = pze.d(bArr, i, sadVar);
                        int i8 = sadVar.a;
                        if (i8 != 0) {
                            String str = new String(bArr, d, i8, ejd.a);
                            mkdVar.add(str);
                            d += i8;
                            while (d < i2) {
                                int d2 = pze.d(bArr, d, sadVar);
                                if (i3 != sadVar.a) {
                                    return d;
                                }
                                d = pze.d(bArr, d2, sadVar);
                                i8 = sadVar.a;
                                if (i8 != 0) {
                                    str = new String(bArr, d, i8, ejd.a);
                                    mkdVar.add(str);
                                    d += i8;
                                    while (d < i2) {
                                    }
                                }
                            }
                            return d;
                        }
                        mkdVar.add("");
                    } else {
                        int d3 = pze.d(bArr, i, sadVar);
                        int i9 = sadVar.a;
                        if (i9 != 0) {
                            int i10 = d3 + i9;
                            if (!l0e.a.b(bArr, d3, i10)) {
                                throw new vkd("Protocol message had invalid UTF-8.");
                            }
                            String str2 = new String(bArr, d3, i9, ejd.a);
                            mkdVar.add(str2);
                            d3 = i10;
                            while (d3 < i2) {
                                int d4 = pze.d(bArr, d3, sadVar);
                                if (i3 != sadVar.a) {
                                    return d3;
                                }
                                d3 = pze.d(bArr, d4, sadVar);
                                int i11 = sadVar.a;
                                if (i11 != 0) {
                                    i10 = d3 + i11;
                                    if (!l0e.a.b(bArr, d3, i10)) {
                                        throw new vkd("Protocol message had invalid UTF-8.");
                                    }
                                    str2 = new String(bArr, d3, i11, ejd.a);
                                    mkdVar.add(str2);
                                    d3 = i10;
                                    while (d3 < i2) {
                                    }
                                }
                            }
                            return d3;
                        }
                        mkdVar.add("");
                    }
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return k(s(i6), i3, bArr, i, i2, mkdVar, sadVar);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    int d5 = pze.d(bArr, i, sadVar);
                    int i12 = sadVar.a;
                    break;
                }
                return i;
            case kk7.S /* 30 */:
            case 44:
                if (i5 != 2) {
                }
                fyb.g();
                return 0;
            case 33:
            case 47:
                if (i5 != 2) {
                }
                fyb.g();
                return 0;
            case 34:
            case 48:
                if (i5 != 2) {
                }
                fyb.g();
                return 0;
            case 49:
                if (i5 == 3) {
                    vud s = s(i6);
                    int i13 = (i3 & (-8)) | 4;
                    int l = l(s, bArr, i, i2, i13, sadVar);
                    int i14 = i13;
                    sad sadVar2 = sadVar;
                    mkdVar.add(sadVar2.c);
                    while (l < i2) {
                        int d6 = pze.d(bArr, l, sadVar2);
                        if (i3 != sadVar2.a) {
                            return l;
                        }
                        sad sadVar3 = sadVar2;
                        int i15 = i14;
                        l = l(s, bArr, d6, i2, i15, sadVar3);
                        mkdVar.add(sadVar3.c);
                        i14 = i15;
                        sadVar2 = sadVar3;
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
    public final int j(Object obj, byte[] bArr, int i, int i2, int i3, sad sadVar) {
        mrd mrdVar;
        Object obj2;
        int[] iArr;
        int i4;
        Unsafe unsafe;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        dyd dydVar;
        int i10;
        int i11;
        int i12;
        byte[] bArr2;
        Unsafe unsafe2;
        int i13;
        sad sadVar2;
        Unsafe unsafe3;
        int i14;
        int g;
        byte[] bArr3;
        int i15;
        Object a;
        byte[] bArr4;
        int i16;
        sad sadVar3;
        int h;
        mrd mrdVar2 = this;
        Object obj3 = obj;
        byte[] bArr5 = bArr;
        int i17 = i2;
        sad sadVar4 = sadVar;
        int i18 = -1;
        int i19 = i;
        int i20 = -1;
        int i21 = 0;
        int i22 = 0;
        while (true) {
            int[] iArr2 = mrdVar2.a;
            Unsafe unsafe4 = o;
            if (i19 < i17) {
                int i23 = i19 + 1;
                int i24 = bArr5[i19];
                if (i24 < 0) {
                    i23 = pze.c(i24, bArr5, i23, sadVar4);
                    i24 = sadVar4.a;
                }
                int i25 = i24;
                int i26 = i23;
                int i27 = i25 >>> 3;
                int i28 = i25 & 7;
                int w = mrdVar2.w(i27);
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
                                    uzd.d.m(obj3, j, Double.longBitsToDouble(pze.h(i13, bArr)));
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
                                    sadVar4 = sadVar;
                                    break;
                                } else {
                                    obj2 = obj3;
                                    i5 = i3;
                                    mrdVar = mrdVar2;
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
                                        vid vidVar = (vid) obj2;
                                        dydVar = vidVar.zzjp;
                                        if (dydVar == dyd.e) {
                                            dydVar = dyd.b();
                                            vidVar.zzjp = dydVar;
                                        }
                                        int i35 = i21;
                                        int b = pze.b(i35, bArr, i9, i2, dydVar, sadVar);
                                        i21 = i35;
                                        bArr5 = bArr;
                                        i17 = i2;
                                        mrdVar2 = mrdVar;
                                        i18 = i4;
                                        i19 = b;
                                        obj3 = obj2;
                                        sadVar4 = sadVar;
                                        break;
                                    }
                                }
                            case 1:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i13 = i26;
                                sadVar2 = sadVar;
                                if (i28 == 5) {
                                    uzd.d.n(obj3, j, Float.intBitsToFloat(pze.f(i13, bArr2)));
                                    i19 = i13 + 4;
                                    int i36 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr2;
                                    i20 = i36;
                                    i17 = i2;
                                    sadVar4 = sadVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    obj2 = obj3;
                                    i5 = i3;
                                    mrdVar = mrdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    vid vidVar2 = (vid) obj2;
                                    dydVar = vidVar2.zzjp;
                                    if (dydVar == dyd.e) {
                                    }
                                    int i352 = i21;
                                    int b2 = pze.b(i352, bArr, i9, i2, dydVar, sadVar);
                                    i21 = i352;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    mrdVar2 = mrdVar;
                                    i18 = i4;
                                    i19 = b2;
                                    obj3 = obj2;
                                    sadVar4 = sadVar;
                                    break;
                                }
                                break;
                            case 2:
                            case 3:
                                unsafe3 = unsafe4;
                                i13 = i26;
                                sadVar2 = sadVar;
                                if (i28 == 0) {
                                    int e = pze.e(bArr, i13, sadVar2);
                                    unsafe3.putLong(obj3, j, sadVar2.b);
                                    int i37 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr;
                                    i20 = i37;
                                    i17 = i2;
                                    i19 = e;
                                    sadVar4 = sadVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    obj2 = obj3;
                                    i5 = i3;
                                    mrdVar = mrdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    vid vidVar22 = (vid) obj2;
                                    dydVar = vidVar22.zzjp;
                                    if (dydVar == dyd.e) {
                                    }
                                    int i3522 = i21;
                                    int b22 = pze.b(i3522, bArr, i9, i2, dydVar, sadVar);
                                    i21 = i3522;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    mrdVar2 = mrdVar;
                                    i18 = i4;
                                    i19 = b22;
                                    obj3 = obj2;
                                    sadVar4 = sadVar;
                                    break;
                                }
                                break;
                            case 4:
                            case 11:
                                unsafe3 = unsafe4;
                                i13 = i26;
                                sadVar2 = sadVar;
                                if (i28 == 0) {
                                    int d = pze.d(bArr, i13, sadVar2);
                                    unsafe3.putInt(obj3, j, sadVar2.a);
                                    int i38 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr;
                                    i20 = i38;
                                    i17 = i2;
                                    i19 = d;
                                    sadVar4 = sadVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    obj2 = obj3;
                                    i5 = i3;
                                    mrdVar = mrdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    vid vidVar222 = (vid) obj2;
                                    dydVar = vidVar222.zzjp;
                                    if (dydVar == dyd.e) {
                                    }
                                    int i35222 = i21;
                                    int b222 = pze.b(i35222, bArr, i9, i2, dydVar, sadVar);
                                    i21 = i35222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    mrdVar2 = mrdVar;
                                    i18 = i4;
                                    i19 = b222;
                                    obj3 = obj2;
                                    sadVar4 = sadVar;
                                    break;
                                }
                                break;
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i14 = i26;
                                unsafe2 = unsafe4;
                                sadVar2 = sadVar;
                                if (i28 == i10) {
                                    unsafe2.putLong(obj3, j, pze.h(i14, bArr2));
                                    i19 = i14 + 8;
                                    int i362 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr2;
                                    i20 = i362;
                                    i17 = i2;
                                    sadVar4 = sadVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i14;
                                    obj2 = obj3;
                                    i5 = i3;
                                    mrdVar = mrdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    vid vidVar2222 = (vid) obj2;
                                    dydVar = vidVar2222.zzjp;
                                    if (dydVar == dyd.e) {
                                    }
                                    int i352222 = i21;
                                    int b2222 = pze.b(i352222, bArr, i9, i2, dydVar, sadVar);
                                    i21 = i352222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    mrdVar2 = mrdVar;
                                    i18 = i4;
                                    i19 = b2222;
                                    obj3 = obj2;
                                    sadVar4 = sadVar;
                                    break;
                                }
                                break;
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i14 = i26;
                                unsafe2 = unsafe4;
                                sadVar2 = sadVar;
                                if (i28 == 5) {
                                    unsafe2.putInt(obj3, j, pze.f(i14, bArr2));
                                    i19 = i14 + 4;
                                    int i3622 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr2;
                                    i20 = i3622;
                                    i17 = i2;
                                    sadVar4 = sadVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i14;
                                    obj2 = obj3;
                                    i5 = i3;
                                    mrdVar = mrdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    vid vidVar22222 = (vid) obj2;
                                    dydVar = vidVar22222.zzjp;
                                    if (dydVar == dyd.e) {
                                    }
                                    int i3522222 = i21;
                                    int b22222 = pze.b(i3522222, bArr, i9, i2, dydVar, sadVar);
                                    i21 = i3522222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    mrdVar2 = mrdVar;
                                    i18 = i4;
                                    i19 = b22222;
                                    obj3 = obj2;
                                    sadVar4 = sadVar;
                                    break;
                                }
                                break;
                            case 7:
                                bArr2 = bArr;
                                i14 = i26;
                                unsafe2 = unsafe4;
                                sadVar2 = sadVar;
                                if (i28 == 0) {
                                    i19 = pze.e(bArr2, i14, sadVar2);
                                    uzd.d.o(obj3, j, sadVar2.b != 0 ? i10 : 0);
                                    int i36222 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr2;
                                    i20 = i36222;
                                    i17 = i2;
                                    sadVar4 = sadVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i14;
                                    obj2 = obj3;
                                    i5 = i3;
                                    mrdVar = mrdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    vid vidVar222222 = (vid) obj2;
                                    dydVar = vidVar222222.zzjp;
                                    if (dydVar == dyd.e) {
                                    }
                                    int i35222222 = i21;
                                    int b222222 = pze.b(i35222222, bArr, i9, i2, dydVar, sadVar);
                                    i21 = i35222222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    mrdVar2 = mrdVar;
                                    i18 = i4;
                                    i19 = b222222;
                                    obj3 = obj2;
                                    sadVar4 = sadVar;
                                    break;
                                }
                                break;
                            case 8:
                                bArr2 = bArr;
                                i14 = i26;
                                unsafe2 = unsafe4;
                                sadVar2 = sadVar;
                                if (i28 == 2) {
                                    if ((i29 & TLObject.FLAG_29) == 0) {
                                        g = pze.d(bArr2, i14, sadVar2);
                                        int i39 = sadVar2.a;
                                        if (i39 == 0) {
                                            sadVar2.c = "";
                                        } else {
                                            sadVar2.c = new String(bArr2, g, i39, ejd.a);
                                            g += i39;
                                        }
                                    } else {
                                        g = pze.g(bArr2, i14, sadVar2);
                                    }
                                    i19 = g;
                                    unsafe2.putObject(obj3, j, sadVar2.c);
                                    int i362222 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr2;
                                    i20 = i362222;
                                    i17 = i2;
                                    sadVar4 = sadVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i14;
                                    obj2 = obj3;
                                    i5 = i3;
                                    mrdVar = mrdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    vid vidVar2222222 = (vid) obj2;
                                    dydVar = vidVar2222222.zzjp;
                                    if (dydVar == dyd.e) {
                                    }
                                    int i352222222 = i21;
                                    int b2222222 = pze.b(i352222222, bArr, i9, i2, dydVar, sadVar);
                                    i21 = i352222222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    mrdVar2 = mrdVar;
                                    i18 = i4;
                                    i19 = b2222222;
                                    obj3 = obj2;
                                    sadVar4 = sadVar;
                                    break;
                                }
                            case 9:
                                bArr3 = bArr;
                                i14 = i26;
                                i15 = i2;
                                unsafe2 = unsafe4;
                                sadVar2 = sadVar;
                                if (i28 != 2) {
                                    i13 = i14;
                                    obj2 = obj3;
                                    i5 = i3;
                                    mrdVar = mrdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    vid vidVar22222222 = (vid) obj2;
                                    dydVar = vidVar22222222.zzjp;
                                    if (dydVar == dyd.e) {
                                    }
                                    int i3522222222 = i21;
                                    int b22222222 = pze.b(i3522222222, bArr, i9, i2, dydVar, sadVar);
                                    i21 = i3522222222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    mrdVar2 = mrdVar;
                                    i18 = i4;
                                    i19 = b22222222;
                                    obj3 = obj2;
                                    sadVar4 = sadVar;
                                    break;
                                } else {
                                    i19 = m(mrdVar2.s(w), bArr3, i14, i15, sadVar2);
                                    if ((i11 & i32) != 0) {
                                        a = ejd.a(unsafe2.getObject(obj3, j), sadVar2.c);
                                        unsafe2.putObject(obj3, j, a);
                                        int i40 = i12;
                                        i22 = i11 | i32;
                                        bArr5 = bArr3;
                                        i20 = i40;
                                        i17 = i15;
                                        sadVar4 = sadVar2;
                                        i18 = i4;
                                        i21 = i25;
                                        break;
                                    }
                                    a = sadVar2.c;
                                    unsafe2.putObject(obj3, j, a);
                                    int i402 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr3;
                                    i20 = i402;
                                    i17 = i15;
                                    sadVar4 = sadVar2;
                                    i18 = i4;
                                    i21 = i25;
                                }
                                break;
                            case 10:
                                bArr3 = bArr;
                                i14 = i26;
                                i15 = i2;
                                unsafe2 = unsafe4;
                                sadVar2 = sadVar;
                                if (i28 == 2) {
                                    i19 = pze.i(bArr3, i14, sadVar2);
                                    a = sadVar2.c;
                                    unsafe2.putObject(obj3, j, a);
                                    int i4022 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr3;
                                    i20 = i4022;
                                    i17 = i15;
                                    sadVar4 = sadVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i14;
                                    obj2 = obj3;
                                    i5 = i3;
                                    mrdVar = mrdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    vid vidVar222222222 = (vid) obj2;
                                    dydVar = vidVar222222222.zzjp;
                                    if (dydVar == dyd.e) {
                                    }
                                    int i35222222222 = i21;
                                    int b222222222 = pze.b(i35222222222, bArr, i9, i2, dydVar, sadVar);
                                    i21 = i35222222222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    mrdVar2 = mrdVar;
                                    i18 = i4;
                                    i19 = b222222222;
                                    obj3 = obj2;
                                    sadVar4 = sadVar;
                                    break;
                                }
                                break;
                            case 12:
                                bArr3 = bArr;
                                i14 = i26;
                                i15 = i2;
                                unsafe2 = unsafe4;
                                sadVar2 = sadVar;
                                if (i28 == 0) {
                                    i19 = pze.d(bArr3, i14, sadVar2);
                                    int i41 = sadVar2.a;
                                    mrdVar2.u(w);
                                    unsafe2.putInt(obj3, j, i41);
                                    int i40222 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr3;
                                    i20 = i40222;
                                    i17 = i15;
                                    sadVar4 = sadVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i14;
                                    obj2 = obj3;
                                    i5 = i3;
                                    mrdVar = mrdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    vid vidVar2222222222 = (vid) obj2;
                                    dydVar = vidVar2222222222.zzjp;
                                    if (dydVar == dyd.e) {
                                    }
                                    int i352222222222 = i21;
                                    int b2222222222 = pze.b(i352222222222, bArr, i9, i2, dydVar, sadVar);
                                    i21 = i352222222222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    mrdVar2 = mrdVar;
                                    i18 = i4;
                                    i19 = b2222222222;
                                    obj3 = obj2;
                                    sadVar4 = sadVar;
                                    break;
                                }
                                break;
                            case 15:
                                bArr4 = bArr;
                                i14 = i26;
                                i16 = i2;
                                sadVar3 = sadVar;
                                unsafe2 = unsafe4;
                                if (i28 == 0) {
                                    i19 = pze.d(bArr4, i14, sadVar3);
                                    int i42 = sadVar3.a;
                                    unsafe2.putInt(obj3, j, (i42 >>> 1) ^ (-(i42 & 1)));
                                    int i43 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr4;
                                    i20 = i43;
                                    i17 = i16;
                                    sadVar4 = sadVar3;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i14;
                                    obj2 = obj3;
                                    i5 = i3;
                                    mrdVar = mrdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    vid vidVar22222222222 = (vid) obj2;
                                    dydVar = vidVar22222222222.zzjp;
                                    if (dydVar == dyd.e) {
                                    }
                                    int i3522222222222 = i21;
                                    int b22222222222 = pze.b(i3522222222222, bArr, i9, i2, dydVar, sadVar);
                                    i21 = i3522222222222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    mrdVar2 = mrdVar;
                                    i18 = i4;
                                    i19 = b22222222222;
                                    obj3 = obj2;
                                    sadVar4 = sadVar;
                                    break;
                                }
                                break;
                            case 16:
                                i16 = i2;
                                sadVar3 = sadVar;
                                if (i28 == 0) {
                                    int e2 = pze.e(bArr, i26, sadVar3);
                                    long j2 = sadVar3.b;
                                    unsafe4.putLong(obj3, j, (j2 >>> i10) ^ (-(j2 & 1)));
                                    int i44 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr;
                                    i20 = i44;
                                    i19 = e2;
                                    i17 = i16;
                                    sadVar4 = sadVar3;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i26;
                                    obj2 = obj3;
                                    unsafe2 = unsafe4;
                                    i5 = i3;
                                    mrdVar = mrdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    vid vidVar222222222222 = (vid) obj2;
                                    dydVar = vidVar222222222222.zzjp;
                                    if (dydVar == dyd.e) {
                                    }
                                    int i35222222222222 = i21;
                                    int b222222222222 = pze.b(i35222222222222, bArr, i9, i2, dydVar, sadVar);
                                    i21 = i35222222222222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    mrdVar2 = mrdVar;
                                    i18 = i4;
                                    i19 = b222222222222;
                                    obj3 = obj2;
                                    sadVar4 = sadVar;
                                    break;
                                }
                                break;
                            case 17:
                                if (i28 == 3) {
                                    i19 = l(mrdVar2.s(w), bArr, i26, i2, (i27 << 3) | 4, sadVar);
                                    i16 = i2;
                                    sadVar3 = sadVar;
                                    bArr4 = bArr;
                                    unsafe4.putObject(obj3, j, (i11 & i32) == 0 ? sadVar3.c : ejd.a(unsafe4.getObject(obj3, j), sadVar3.c));
                                    int i432 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr4;
                                    i20 = i432;
                                    i17 = i16;
                                    sadVar4 = sadVar3;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i26;
                                    obj2 = obj3;
                                    unsafe2 = unsafe4;
                                    i5 = i3;
                                    mrdVar = mrdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    vid vidVar2222222222222 = (vid) obj2;
                                    dydVar = vidVar2222222222222.zzjp;
                                    if (dydVar == dyd.e) {
                                    }
                                    int i352222222222222 = i21;
                                    int b2222222222222 = pze.b(i352222222222222, bArr, i9, i2, dydVar, sadVar);
                                    i21 = i352222222222222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    mrdVar2 = mrdVar;
                                    i18 = i4;
                                    i19 = b2222222222222;
                                    obj3 = obj2;
                                    sadVar4 = sadVar;
                                    break;
                                }
                                break;
                            default:
                                i13 = i26;
                                obj2 = obj3;
                                unsafe2 = unsafe4;
                                i5 = i3;
                                mrdVar = mrdVar2;
                                unsafe = unsafe2;
                                i20 = i12;
                                i9 = i13;
                                i21 = i25;
                                i22 = i11;
                                if (i21 != i5) {
                                }
                                vid vidVar22222222222222 = (vid) obj2;
                                dydVar = vidVar22222222222222.zzjp;
                                if (dydVar == dyd.e) {
                                }
                                int i3522222222222222 = i21;
                                int b22222222222222 = pze.b(i3522222222222222, bArr, i9, i2, dydVar, sadVar);
                                i21 = i3522222222222222;
                                bArr5 = bArr;
                                i17 = i2;
                                mrdVar2 = mrdVar;
                                i18 = i4;
                                i19 = b22222222222222;
                                obj3 = obj2;
                                sadVar4 = sadVar;
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
                                h = mrdVar2.i(obj2, bArr, i8, i2, i21, i27, i28, w, i29, i30, j, sadVar);
                                obj3 = obj2;
                                if (h == i8) {
                                    i20 = i45;
                                    mrdVar = mrdVar2;
                                    obj2 = obj3;
                                } else {
                                    bArr5 = bArr;
                                    i20 = i45;
                                    i17 = i2;
                                    sadVar4 = sadVar;
                                    i19 = h;
                                    i18 = -1;
                                    i22 = i7;
                                }
                            } else {
                                unsafe = unsafe4;
                                i6 = i20;
                                i7 = i22;
                                if (i30 != 50) {
                                    h = mrdVar2.h(obj2, bArr, i8, i2, i21, i27, i28, i29, i30, j, w, sadVar);
                                    mrdVar = mrdVar2;
                                    obj2 = obj2;
                                    if (h == i8) {
                                        i20 = i6;
                                    } else {
                                        bArr5 = bArr;
                                        i20 = i6;
                                        i17 = i2;
                                        i19 = h;
                                        mrdVar2 = mrdVar;
                                        obj3 = obj2;
                                        i18 = -1;
                                        i22 = i7;
                                        sadVar4 = sadVar;
                                    }
                                } else {
                                    if (i28 == 2) {
                                        mrdVar2.o(obj2, w, j);
                                        throw null;
                                    }
                                    mrdVar = mrdVar2;
                                    obj2 = obj2;
                                }
                            }
                            i9 = h;
                            i22 = i7;
                            i5 = i3;
                            if (i21 != i5) {
                            }
                            vid vidVar222222222222222 = (vid) obj2;
                            dydVar = vidVar222222222222222.zzjp;
                            if (dydVar == dyd.e) {
                            }
                            int i35222222222222222 = i21;
                            int b222222222222222 = pze.b(i35222222222222222, bArr, i9, i2, dydVar, sadVar);
                            i21 = i35222222222222222;
                            bArr5 = bArr;
                            i17 = i2;
                            mrdVar2 = mrdVar;
                            i18 = i4;
                            i19 = b222222222222222;
                            obj3 = obj2;
                            sadVar4 = sadVar;
                        } else if (i28 == 2) {
                            mkd mkdVar = (mkd) unsafe4.getObject(obj2, j);
                            if (!((dad) mkdVar).a) {
                                int size = mkdVar.size();
                                mkdVar = mkdVar.f(size == 0 ? 10 : size << 1);
                                unsafe4.putObject(obj2, j, mkdVar);
                            }
                            i21 = i25;
                            i17 = i2;
                            i19 = k(mrdVar2.s(w), i25, bArr, i8, i2, mkdVar, sadVar);
                            obj3 = obj2;
                            i18 = -1;
                            bArr5 = bArr;
                            sadVar4 = sadVar;
                        } else {
                            mrdVar = mrdVar2;
                            unsafe = unsafe4;
                            i6 = i20;
                            i21 = i25;
                            i7 = i22;
                        }
                    }
                } else {
                    mrdVar = mrdVar2;
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
                vid vidVar2222222222222222 = (vid) obj2;
                dydVar = vidVar2222222222222222.zzjp;
                if (dydVar == dyd.e) {
                }
                int i352222222222222222 = i21;
                int b2222222222222222 = pze.b(i352222222222222222, bArr, i9, i2, dydVar, sadVar);
                i21 = i352222222222222222;
                bArr5 = bArr;
                i17 = i2;
                mrdVar2 = mrdVar;
                i18 = i4;
                i19 = b2222222222222222;
                obj3 = obj2;
                sadVar4 = sadVar;
            } else {
                mrdVar = mrdVar2;
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
        int[] iArr3 = mrdVar.i;
        if (iArr3 != null) {
            for (int i46 : iArr3) {
                int i47 = iArr[i46];
                if (uzd.l(obj2, mrdVar.v(i46) & 1048575) != null) {
                    mrdVar.u(i46);
                }
            }
        }
        if (i5 != 0 ? i19 > i17 || i21 != i5 : i19 != i17) {
            throw vkd.b();
        }
        return i19;
    }

    public final void o(Object obj, int i, long j) {
        lpd lpdVar;
        t(i);
        Unsafe unsafe = o;
        Object object = unsafe.getObject(obj, j);
        this.n.getClass();
        if (!((lpd) object).a) {
            lpd lpdVar2 = lpd.b;
            if (lpdVar2.isEmpty()) {
                lpdVar = new lpd();
            } else {
                lpd lpdVar3 = new lpd(lpdVar2);
                lpdVar3.a = true;
                lpdVar = lpdVar3;
            }
            ypd.a(lpdVar, object);
            unsafe.putObject(obj, j, lpdVar);
        }
        throw new NoSuchMethodError();
    }

    public final void p(vid vidVar, vid vidVar2, int i) {
        long v = v(i) & 1048575;
        if (r(i, vidVar2)) {
            Object l = uzd.l(vidVar, v);
            Object l2 = uzd.l(vidVar2, v);
            if (l != null && l2 != null) {
                l2 = ejd.a(l, l2);
            } else if (l2 == null) {
                return;
            }
            uzd.d(vidVar, v, l2);
            x(vidVar, i);
        }
    }

    public final boolean q(int i, int i2, Object obj) {
        return uzd.j(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
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
                    return uzd.d.A(obj, j) != 0.0d;
                case 1:
                    if (uzd.d.z(obj, j) != 0.0f) {
                    }
                    break;
                case 2:
                    if (uzd.k(obj, j) != 0) {
                    }
                    break;
                case 3:
                    if (uzd.k(obj, j) != 0) {
                    }
                    break;
                case 4:
                    if (uzd.j(obj, j) != 0) {
                    }
                    break;
                case 5:
                    if (uzd.k(obj, j) != 0) {
                    }
                    break;
                case 6:
                    if (uzd.j(obj, j) != 0) {
                    }
                    break;
                case 7:
                    return uzd.d.y(obj, j);
                case 8:
                    Object l = uzd.l(obj, j);
                    if (!(l instanceof String)) {
                        if (l instanceof cdd) {
                            if (!cdd.c.equals(l)) {
                            }
                        }
                        sc8.e();
                        return false;
                    }
                    if (!((String) l).isEmpty()) {
                    }
                    break;
                case 9:
                    if (uzd.l(obj, j) != null) {
                    }
                    break;
                case 10:
                    if (!cdd.c.equals(uzd.l(obj, j))) {
                    }
                    break;
                case 11:
                    if (uzd.j(obj, j) != 0) {
                    }
                    break;
                case 12:
                    if (uzd.j(obj, j) != 0) {
                    }
                    break;
                case 13:
                    if (uzd.j(obj, j) != 0) {
                    }
                    break;
                case 14:
                    if (uzd.k(obj, j) != 0) {
                    }
                    break;
                case 15:
                    if (uzd.j(obj, j) != 0) {
                    }
                    break;
                case 16:
                    if (uzd.k(obj, j) != 0) {
                    }
                    break;
                case 17:
                    if (uzd.l(obj, j) != null) {
                    }
                    break;
                default:
                    sc8.e();
                    return false;
            }
        } else {
            if ((uzd.j(obj, r6 & 1048575) & (1 << (this.a[i + 2] >>> 20))) != 0) {
            }
        }
    }

    public final vud s(int i) {
        int i2 = (i / 4) << 1;
        Object[] objArr = this.b;
        vud vudVar = (vud) objArr[i2];
        if (vudVar != null) {
            return vudVar;
        }
        vud a = ttd.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final Object t(int i) {
        return this.b[(i / 4) << 1];
    }

    public final y9e u(int i) {
        return (y9e) this.b[((i / 4) << 1) + 1];
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

    public final void x(vid vidVar, int i) {
        if (this.g) {
            return;
        }
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        uzd.c(vidVar, uzd.j(vidVar, j) | (1 << (i2 >>> 20)), j);
    }

    public final void y(vid vidVar, vid vidVar2, int i) {
        int i2;
        int v = v(i);
        int[] iArr = this.a;
        int i3 = iArr[i];
        long j = v & 1048575;
        if (q(i3, i, vidVar2)) {
            Object l = uzd.l(vidVar, j);
            Object l2 = uzd.l(vidVar2, j);
            if (l != null && l2 != null) {
                uzd.d(vidVar, j, ejd.a(l, l2));
                i2 = iArr[i + 2];
            } else {
                if (l2 == null) {
                    return;
                }
                uzd.d(vidVar, j, l2);
                i2 = iArr[i + 2];
            }
            uzd.c(vidVar, i3, i2 & 1048575);
        }
    }

    public final boolean z(vid vidVar, vid vidVar2, int i) {
        return r(i, vidVar) == r(i, vidVar2);
    }
}
