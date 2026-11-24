// default package

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mbe implements cde {
    public static final int[] j = new int[0];
    public static final Unsafe k;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final utd e;
    public final int[] f;
    public final int g;
    public final int h;
    public final a8d i;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new q2((byte) 4));
        } catch (Throwable unused) {
            unsafe = null;
        }
        k = unsafe;
    }

    public mbe(int[] iArr, Object[] objArr, int i, int i2, utd utdVar, int[] iArr2, int i3, int i4, a8d a8dVar, ied iedVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = iArr2;
        this.g = i3;
        this.h = i4;
        this.i = a8dVar;
        this.e = utdVar;
    }

    public static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof f4e) {
            return ((f4e) obj).m();
        }
        return true;
    }

    public static int p(Object obj, long j2) {
        return ((Integer) ohe.g(obj, j2)).intValue();
    }

    public static int r(int i) {
        return (i >>> 20) & nm7.d4;
    }

    public static long t(Object obj, long j2) {
        return ((Long) ohe.g(obj, j2)).longValue();
    }

    public static Field z(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder m = mlb.m("Field ", str, " for ", name, " not found. Known fields are ");
            m.append(arrays);
            throw new RuntimeException(m.toString(), e);
        }
    }

    @Override // cde
    public final void a(Object obj, byte[] bArr, int i, int i2, nl6 nl6Var) {
        o(obj, bArr, i, i2, 0, nl6Var);
    }

    @Override // cde
    public final boolean b(f4e f4eVar, f4e f4eVar2) {
        boolean e;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int s = s(i);
                long j2 = s & 1048575;
                switch (r(s)) {
                    case 0:
                        if (!j(f4eVar, f4eVar2, i)) {
                            break;
                        } else {
                            c8c c8cVar = ohe.c;
                            if (Double.doubleToLongBits(c8cVar.k(f4eVar, j2)) != Double.doubleToLongBits(c8cVar.k(f4eVar2, j2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 1:
                        if (!j(f4eVar, f4eVar2, i)) {
                            break;
                        } else {
                            c8c c8cVar2 = ohe.c;
                            if (Float.floatToIntBits(c8cVar2.p(f4eVar, j2)) != Float.floatToIntBits(c8cVar2.p(f4eVar2, j2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 2:
                        if (j(f4eVar, f4eVar2, i) && ohe.f(f4eVar, j2) == ohe.f(f4eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (j(f4eVar, f4eVar2, i) && ohe.f(f4eVar, j2) == ohe.f(f4eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (j(f4eVar, f4eVar2, i) && ohe.e(f4eVar, j2) == ohe.e(f4eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (j(f4eVar, f4eVar2, i) && ohe.f(f4eVar, j2) == ohe.f(f4eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (j(f4eVar, f4eVar2, i) && ohe.e(f4eVar, j2) == ohe.e(f4eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (!j(f4eVar, f4eVar2, i)) {
                            break;
                        } else {
                            c8c c8cVar3 = ohe.c;
                            if (c8cVar3.x(f4eVar, j2) != c8cVar3.x(f4eVar2, j2)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (j(f4eVar, f4eVar2, i) && qde.e(ohe.g(f4eVar, j2), ohe.g(f4eVar2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (j(f4eVar, f4eVar2, i) && qde.e(ohe.g(f4eVar, j2), ohe.g(f4eVar2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (j(f4eVar, f4eVar2, i) && qde.e(ohe.g(f4eVar, j2), ohe.g(f4eVar2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (j(f4eVar, f4eVar2, i) && ohe.e(f4eVar, j2) == ohe.e(f4eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (j(f4eVar, f4eVar2, i) && ohe.e(f4eVar, j2) == ohe.e(f4eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (j(f4eVar, f4eVar2, i) && ohe.e(f4eVar, j2) == ohe.e(f4eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (j(f4eVar, f4eVar2, i) && ohe.f(f4eVar, j2) == ohe.f(f4eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (j(f4eVar, f4eVar2, i) && ohe.e(f4eVar, j2) == ohe.e(f4eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (j(f4eVar, f4eVar2, i) && ohe.f(f4eVar, j2) == ohe.f(f4eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (j(f4eVar, f4eVar2, i) && qde.e(ohe.g(f4eVar, j2), ohe.g(f4eVar2, j2))) {
                            continue;
                            i += 3;
                        }
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
                    case nm7.S /* 30 */:
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
                        e = qde.e(ohe.g(f4eVar, j2), ohe.g(f4eVar2, j2));
                        break;
                    case 50:
                        e = qde.e(ohe.g(f4eVar, j2), ohe.g(f4eVar2, j2));
                        break;
                    case nm7.n0 /* 51 */:
                    case nm7.o0 /* 52 */:
                    case nm7.p0 /* 53 */:
                    case nm7.q0 /* 54 */:
                    case nm7.r0 /* 55 */:
                    case 56:
                    case nm7.t0 /* 57 */:
                    case nm7.u0 /* 58 */:
                    case nm7.v0 /* 59 */:
                    case nm7.w0 /* 60 */:
                    case nm7.x0 /* 61 */:
                    case nm7.y0 /* 62 */:
                    case nm7.z0 /* 63 */:
                    case 64:
                    case 65:
                    case nm7.C0 /* 66 */:
                    case nm7.D0 /* 67 */:
                    case nm7.E0 /* 68 */:
                        long j3 = iArr[i + 2] & 1048575;
                        if (ohe.e(f4eVar, j3) == ohe.e(f4eVar2, j3) && qde.e(ohe.g(f4eVar, j2), ohe.g(f4eVar2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                }
                if (e) {
                    i += 3;
                }
            } else if (f4eVar.zzc.equals(f4eVar2.zzc)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e6, code lost:
    
        if (r2 != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r2 != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01e9, code lost:
    
        r1 = r6 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01e8, code lost:
    
        r6 = 1231;
     */
    @Override // cde
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(f4e f4eVar) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i5 >= iArr.length) {
                return f4eVar.zzc.hashCode() + (i6 * 53);
            }
            int s = s(i5);
            int i7 = 1048575 & s;
            int r = r(s);
            int i8 = iArr[i5];
            long j2 = i7;
            int i9 = 1237;
            int i10 = 37;
            switch (r) {
                case 0:
                    i = i6 * 53;
                    doubleToLongBits = Double.doubleToLongBits(ohe.c.k(f4eVar, j2));
                    Charset charset = k5e.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i6 * 53;
                    floatToIntBits = Float.floatToIntBits(ohe.c.p(f4eVar, j2));
                    i6 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i6 * 53;
                    doubleToLongBits = ohe.f(f4eVar, j2);
                    Charset charset2 = k5e.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i6 * 53;
                    doubleToLongBits = ohe.f(f4eVar, j2);
                    Charset charset3 = k5e.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i6 * 53;
                    floatToIntBits = ohe.e(f4eVar, j2);
                    i6 = floatToIntBits + i2;
                    break;
                case 5:
                    i = i6 * 53;
                    doubleToLongBits = ohe.f(f4eVar, j2);
                    Charset charset4 = k5e.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i6 * 53;
                    floatToIntBits = ohe.e(f4eVar, j2);
                    i6 = floatToIntBits + i2;
                    break;
                case 7:
                    i3 = i6 * 53;
                    boolean x = ohe.c.x(f4eVar, j2);
                    Charset charset5 = k5e.a;
                    break;
                case 8:
                    i2 = i6 * 53;
                    floatToIntBits = ((String) ohe.g(f4eVar, j2)).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object g = ohe.g(f4eVar, j2);
                    if (g != null) {
                        i10 = g.hashCode();
                    }
                    i6 = i4 + i10;
                    break;
                case 10:
                    i2 = i6 * 53;
                    floatToIntBits = ohe.g(f4eVar, j2).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 11:
                    i2 = i6 * 53;
                    floatToIntBits = ohe.e(f4eVar, j2);
                    i6 = floatToIntBits + i2;
                    break;
                case 12:
                    i2 = i6 * 53;
                    floatToIntBits = ohe.e(f4eVar, j2);
                    i6 = floatToIntBits + i2;
                    break;
                case 13:
                    i2 = i6 * 53;
                    floatToIntBits = ohe.e(f4eVar, j2);
                    i6 = floatToIntBits + i2;
                    break;
                case 14:
                    i = i6 * 53;
                    doubleToLongBits = ohe.f(f4eVar, j2);
                    Charset charset6 = k5e.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i6 * 53;
                    floatToIntBits = ohe.e(f4eVar, j2);
                    i6 = floatToIntBits + i2;
                    break;
                case 16:
                    i = i6 * 53;
                    doubleToLongBits = ohe.f(f4eVar, j2);
                    Charset charset7 = k5e.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i4 = i6 * 53;
                    Object g2 = ohe.g(f4eVar, j2);
                    if (g2 != null) {
                        i10 = g2.hashCode();
                    }
                    i6 = i4 + i10;
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
                case nm7.S /* 30 */:
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
                    i2 = i6 * 53;
                    floatToIntBits = ohe.g(f4eVar, j2).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 50:
                    i2 = i6 * 53;
                    floatToIntBits = ohe.g(f4eVar, j2).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case nm7.n0 /* 51 */:
                    if (!n(i8, i5, f4eVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) ohe.g(f4eVar, j2)).doubleValue());
                        Charset charset8 = k5e.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case nm7.o0 /* 52 */:
                    if (!n(i8, i5, f4eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) ohe.g(f4eVar, j2)).floatValue());
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case nm7.p0 /* 53 */:
                    if (!n(i8, i5, f4eVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = t(f4eVar, j2);
                        Charset charset9 = k5e.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case nm7.q0 /* 54 */:
                    if (!n(i8, i5, f4eVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = t(f4eVar, j2);
                        Charset charset10 = k5e.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case nm7.r0 /* 55 */:
                    if (!n(i8, i5, f4eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = p(f4eVar, j2);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 56:
                    if (!n(i8, i5, f4eVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = t(f4eVar, j2);
                        Charset charset11 = k5e.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case nm7.t0 /* 57 */:
                    if (!n(i8, i5, f4eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = p(f4eVar, j2);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case nm7.u0 /* 58 */:
                    if (!n(i8, i5, f4eVar)) {
                        break;
                    } else {
                        i3 = i6 * 53;
                        boolean booleanValue = ((Boolean) ohe.g(f4eVar, j2)).booleanValue();
                        Charset charset12 = k5e.a;
                        break;
                    }
                case nm7.v0 /* 59 */:
                    if (!n(i8, i5, f4eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = ((String) ohe.g(f4eVar, j2)).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case nm7.w0 /* 60 */:
                    if (!n(i8, i5, f4eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = ohe.g(f4eVar, j2).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case nm7.x0 /* 61 */:
                    if (!n(i8, i5, f4eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = ohe.g(f4eVar, j2).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case nm7.y0 /* 62 */:
                    if (!n(i8, i5, f4eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = p(f4eVar, j2);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case nm7.z0 /* 63 */:
                    if (!n(i8, i5, f4eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = p(f4eVar, j2);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 64:
                    if (!n(i8, i5, f4eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = p(f4eVar, j2);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 65:
                    if (!n(i8, i5, f4eVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = t(f4eVar, j2);
                        Charset charset13 = k5e.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case nm7.C0 /* 66 */:
                    if (!n(i8, i5, f4eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = p(f4eVar, j2);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case nm7.D0 /* 67 */:
                    if (!n(i8, i5, f4eVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = t(f4eVar, j2);
                        Charset charset14 = k5e.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case nm7.E0 /* 68 */:
                    if (!n(i8, i5, f4eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = ohe.g(f4eVar, j2).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
            }
            i5 += 3;
        }
    }

    @Override // cde
    public final void d(Object obj, cf9 cf9Var) {
        int i;
        int i2;
        mbe mbeVar = this;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (true) {
            int[] iArr = mbeVar.a;
            if (i4 >= iArr.length) {
                ((f4e) obj).zzc.d(cf9Var);
                return;
            }
            int s = mbeVar.s(i4);
            int r = r(s);
            int i7 = iArr[i4];
            Unsafe unsafe = k;
            if (r <= 17) {
                int i8 = iArr[i4 + 2];
                int i9 = i8 & i3;
                if (i9 != i6) {
                    i5 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
                    i6 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            long j2 = s & i3;
            switch (r) {
                case 0:
                    if (mbeVar.l(obj, i4, i6, i5, i)) {
                        ((fyd) cf9Var.b).h(i7, Double.doubleToRawLongBits(ohe.c.k(obj, j2)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (mbeVar.l(obj, i4, i6, i5, i)) {
                        ((fyd) cf9Var.b).f(i7, Float.floatToRawIntBits(ohe.c.p(obj, j2)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (mbeVar.l(obj, i4, i6, i5, i)) {
                        ((fyd) cf9Var.b).p(i7, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (mbeVar.l(obj, i4, i6, i5, i)) {
                        ((fyd) cf9Var.b).p(i7, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (mbeVar.l(obj, i4, i6, i5, i)) {
                        ((fyd) cf9Var.b).j(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (mbeVar.l(obj, i4, i6, i5, i)) {
                        ((fyd) cf9Var.b).h(i7, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (mbeVar.l(obj, i4, i6, i5, i)) {
                        ((fyd) cf9Var.b).f(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (mbeVar.l(obj, i4, i6, i5, i)) {
                        byte x = ohe.c.x(obj, j2);
                        fyd fydVar = (fyd) cf9Var.b;
                        fydVar.o(i7 << 3);
                        int i10 = fydVar.d;
                        try {
                            int i11 = i10 + 1;
                            try {
                                fydVar.b[i10] = x;
                                fydVar.d = i11;
                                break;
                            } catch (IndexOutOfBoundsException e) {
                                e = e;
                                i10 = i11;
                                throw new ol2(i10, fydVar.c, 1, e);
                            }
                        } catch (IndexOutOfBoundsException e2) {
                            e = e2;
                        }
                    } else {
                        continue;
                    }
                case 8:
                    if (mbeVar.l(obj, i4, i6, i5, i)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            ((fyd) cf9Var.b).l(i7, (String) object);
                            break;
                        } else {
                            ((fyd) cf9Var.b).e(i7, (cxd) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (mbeVar.l(obj, i4, i6, i5, i)) {
                        cf9Var.N(i7, unsafe.getObject(obj, j2), mbeVar.v(i4));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (mbeVar.l(obj, i4, i6, i5, i)) {
                        ((fyd) cf9Var.b).e(i7, (cxd) unsafe.getObject(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (mbeVar.l(obj, i4, i6, i5, i)) {
                        ((fyd) cf9Var.b).n(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (mbeVar.l(obj, i4, i6, i5, i)) {
                        ((fyd) cf9Var.b).j(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (mbeVar.l(obj, i4, i6, i5, i)) {
                        ((fyd) cf9Var.b).f(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (mbeVar.l(obj, i4, i6, i5, i)) {
                        ((fyd) cf9Var.b).h(i7, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (mbeVar.l(obj, i4, i6, i5, i)) {
                        int i12 = unsafe.getInt(obj, j2);
                        ((fyd) cf9Var.b).n(i7, (i12 << 1) ^ (i12 >> 31));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (mbeVar.l(obj, i4, i6, i5, i)) {
                        long j3 = unsafe.getLong(obj, j2);
                        ((fyd) cf9Var.b).p(i7, (j3 << 1) ^ (j3 >> 63));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (mbeVar.l(obj, i4, i6, i5, i)) {
                        cf9Var.K(i7, unsafe.getObject(obj, j2), mbeVar.v(i4));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    qde.q(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                    break;
                case 19:
                    qde.u(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                    break;
                case 20:
                    qde.w(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                    break;
                case 21:
                    qde.d(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                    break;
                case 22:
                    qde.v(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                    break;
                case 23:
                    qde.t(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                    break;
                case 24:
                    qde.s(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                    break;
                case 25:
                    qde.p(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                    break;
                case 26:
                    int i13 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j2);
                    a8d a8dVar = qde.a;
                    if (list != null && !list.isEmpty()) {
                        fyd fydVar2 = (fyd) cf9Var.b;
                        if (list instanceof j7e) {
                            j7e j7eVar = (j7e) list;
                            for (int i14 = 0; i14 < list.size(); i14++) {
                                Object zza = j7eVar.zza();
                                if (zza instanceof String) {
                                    fydVar2.l(i13, (String) zza);
                                } else {
                                    fydVar2.e(i13, (cxd) zza);
                                }
                            }
                            break;
                        } else {
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                fydVar2.l(i13, (String) list.get(i15));
                            }
                            break;
                        }
                    }
                    break;
                case 27:
                    int i16 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    cde v = mbeVar.v(i4);
                    a8d a8dVar2 = qde.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i17 = 0; i17 < list2.size(); i17++) {
                            cf9Var.N(i16, list2.get(i17), v);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i18 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    a8d a8dVar3 = qde.a;
                    if (list3 != null && !list3.isEmpty()) {
                        cf9Var.getClass();
                        for (int i19 = 0; i19 < list3.size(); i19++) {
                            ((fyd) cf9Var.b).e(i18, (cxd) list3.get(i19));
                        }
                        break;
                    }
                    break;
                case 29:
                    qde.c(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                    break;
                case nm7.S /* 30 */:
                    qde.r(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                    break;
                case 31:
                    qde.x(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                    break;
                case 32:
                    qde.y(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                    break;
                case 33:
                    qde.a(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                    break;
                case 34:
                    qde.b(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, false);
                    break;
                case 35:
                    qde.q(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                    break;
                case 36:
                    qde.u(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                    break;
                case 37:
                    qde.w(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                    break;
                case 38:
                    qde.d(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                    break;
                case 39:
                    qde.v(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                    break;
                case 40:
                    qde.t(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                    break;
                case 41:
                    qde.s(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                    break;
                case 42:
                    qde.p(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                    break;
                case 43:
                    qde.c(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                    break;
                case 44:
                    qde.r(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                    break;
                case 45:
                    qde.x(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                    break;
                case 46:
                    qde.y(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                    break;
                case 47:
                    qde.a(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                    break;
                case 48:
                    qde.b(iArr[i4], (List) unsafe.getObject(obj, j2), cf9Var, true);
                    break;
                case 49:
                    int i20 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    cde v2 = mbeVar.v(i4);
                    a8d a8dVar4 = qde.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            cf9Var.K(i20, list4.get(i21), v2);
                        }
                        break;
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j2) != null) {
                        mbeVar.w(i4).getClass();
                        rjb.p();
                        return;
                    }
                    break;
                case nm7.n0 /* 51 */:
                    if (mbeVar.n(i7, i4, obj)) {
                        ((fyd) cf9Var.b).h(i7, Double.doubleToRawLongBits(((Double) ohe.g(obj, j2)).doubleValue()));
                        break;
                    } else {
                        break;
                    }
                case nm7.o0 /* 52 */:
                    if (mbeVar.n(i7, i4, obj)) {
                        ((fyd) cf9Var.b).f(i7, Float.floatToRawIntBits(((Float) ohe.g(obj, j2)).floatValue()));
                        break;
                    } else {
                        break;
                    }
                case nm7.p0 /* 53 */:
                    if (mbeVar.n(i7, i4, obj)) {
                        ((fyd) cf9Var.b).p(i7, t(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case nm7.q0 /* 54 */:
                    if (mbeVar.n(i7, i4, obj)) {
                        ((fyd) cf9Var.b).p(i7, t(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case nm7.r0 /* 55 */:
                    if (mbeVar.n(i7, i4, obj)) {
                        ((fyd) cf9Var.b).j(i7, p(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (mbeVar.n(i7, i4, obj)) {
                        ((fyd) cf9Var.b).h(i7, t(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case nm7.t0 /* 57 */:
                    if (mbeVar.n(i7, i4, obj)) {
                        ((fyd) cf9Var.b).f(i7, p(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case nm7.u0 /* 58 */:
                    if (mbeVar.n(i7, i4, obj)) {
                        byte booleanValue = ((Boolean) ohe.g(obj, j2)).booleanValue();
                        fyd fydVar3 = (fyd) cf9Var.b;
                        fydVar3.o(i7 << 3);
                        int i22 = fydVar3.d;
                        try {
                            i2 = i22 + 1;
                        } catch (IndexOutOfBoundsException e3) {
                            e = e3;
                        }
                        try {
                            fydVar3.b[i22] = booleanValue;
                            fydVar3.d = i2;
                            break;
                        } catch (IndexOutOfBoundsException e4) {
                            e = e4;
                            i22 = i2;
                            throw new ol2(i22, fydVar3.c, 1, e);
                        }
                    } else {
                        continue;
                    }
                case nm7.v0 /* 59 */:
                    if (mbeVar.n(i7, i4, obj)) {
                        Object object2 = unsafe.getObject(obj, j2);
                        if (object2 instanceof String) {
                            ((fyd) cf9Var.b).l(i7, (String) object2);
                            break;
                        } else {
                            ((fyd) cf9Var.b).e(i7, (cxd) object2);
                            break;
                        }
                    } else {
                        break;
                    }
                case nm7.w0 /* 60 */:
                    if (mbeVar.n(i7, i4, obj)) {
                        cf9Var.N(i7, unsafe.getObject(obj, j2), mbeVar.v(i4));
                        break;
                    } else {
                        break;
                    }
                case nm7.x0 /* 61 */:
                    if (mbeVar.n(i7, i4, obj)) {
                        ((fyd) cf9Var.b).e(i7, (cxd) unsafe.getObject(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case nm7.y0 /* 62 */:
                    if (mbeVar.n(i7, i4, obj)) {
                        ((fyd) cf9Var.b).n(i7, p(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case nm7.z0 /* 63 */:
                    if (mbeVar.n(i7, i4, obj)) {
                        ((fyd) cf9Var.b).j(i7, p(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (mbeVar.n(i7, i4, obj)) {
                        ((fyd) cf9Var.b).f(i7, p(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (mbeVar.n(i7, i4, obj)) {
                        ((fyd) cf9Var.b).h(i7, t(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case nm7.C0 /* 66 */:
                    if (mbeVar.n(i7, i4, obj)) {
                        int p = p(obj, j2);
                        ((fyd) cf9Var.b).n(i7, (p << 1) ^ (p >> 31));
                        break;
                    } else {
                        break;
                    }
                case nm7.D0 /* 67 */:
                    if (mbeVar.n(i7, i4, obj)) {
                        long t = t(obj, j2);
                        ((fyd) cf9Var.b).p(i7, (t << 1) ^ (t >> 63));
                        break;
                    } else {
                        break;
                    }
                case nm7.E0 /* 68 */:
                    if (mbeVar.n(i7, i4, obj)) {
                        cf9Var.K(i7, unsafe.getObject(obj, j2), mbeVar.v(i4));
                        break;
                    } else {
                        break;
                    }
            }
            i4 += 3;
            i3 = 1048575;
            mbeVar = this;
        }
    }

    @Override // cde
    public final boolean e(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.g) {
            int i7 = this.f[i5];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int s = s(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = k.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i4;
                i = i10;
            } else {
                int i12 = i4;
                i = i6;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & s) == 0 || l(obj, i2, i, i3, i11)) {
                int r = r(s);
                if (r == 9 || r == 17) {
                    if (l(obj, i2, i, i3, i11) && !v(i2).e(ohe.g(obj, s & 1048575))) {
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                } else {
                    if (r != 27) {
                        if (r == 60 || r == 68) {
                            if (n(i8, i2, obj) && !v(i2).e(ohe.g(obj, s & 1048575))) {
                            }
                        } else if (r != 49) {
                            if (r == 50 && !((s9e) ohe.g(obj, s & 1048575)).isEmpty()) {
                                w(i2).getClass();
                                rjb.p();
                                return false;
                            }
                        }
                        i5++;
                        i6 = i;
                        i4 = i3;
                    }
                    List list = (List) ohe.g(obj, s & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        cde v = v(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (v.e(list.get(i13))) {
                            }
                        }
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:275:0x0575, code lost:
    
        if (r0.l(r1, r2, r3, r4, r5) != false) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x062d, code lost:
    
        r8 = mlb.g(r11 << 3, 8, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x057d, code lost:
    
        if (r0.l(r1, r2, r3, r4, r5) != false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x067d, code lost:
    
        r8 = mlb.g(r11 << 3, 4, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0624, code lost:
    
        if (r0.l(r1, r2, r3, r4, r5) != false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x062b, code lost:
    
        if (r0.l(r1, r2, r3, r4, r5) != false) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x067b, code lost:
    
        if (r0.l(r1, r2, r3, r4, r5) != false) goto L264;
     */
    @Override // cde
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(f4e f4eVar) {
        int i;
        int b;
        int c;
        int b2;
        int j2;
        int b3;
        int b4;
        int b5;
        int i2;
        int i3;
        int b6;
        int size;
        int n;
        int b7;
        int b8;
        int size2;
        int b9;
        int i4;
        int b10;
        int c2;
        int b11;
        int j3;
        mbe mbeVar = this;
        f4e f4eVar2 = f4eVar;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = mbeVar.a;
            if (i7 >= iArr.length) {
                return f4eVar2.zzc.a() + i9;
            }
            int s = mbeVar.s(i7);
            int r = r(s);
            int i10 = iArr[i7];
            int i11 = iArr[i7 + 2];
            int i12 = i11 & i5;
            Unsafe unsafe = k;
            if (r <= 17) {
                if (i12 != i6) {
                    i8 = i12 == i5 ? 0 : unsafe.getInt(f4eVar2, i12);
                    i6 = i12;
                }
                i = 1 << (i11 >>> 20);
            } else {
                i = 0;
            }
            int i13 = s & i5;
            if (r >= g1e.b.a) {
                byte b12 = g1e.c.a;
            }
            long j4 = i13;
            switch (r) {
                case 0:
                    if (!mbeVar.l(f4eVar2, i7, i6, i8, i)) {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                    i9 = mlb.g(i10 << 3, 8, i9);
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case 1:
                    break;
                case 2:
                    if (mbeVar.l(f4eVar2, i7, i6, i8, i)) {
                        long j5 = unsafe.getLong(f4eVar2, j4);
                        b = fyd.b(i10 << 3);
                        c = fyd.c(j5);
                        i3 = c + b;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case 3:
                    if (mbeVar.l(f4eVar2, i7, i6, i8, i)) {
                        long j6 = unsafe.getLong(f4eVar2, j4);
                        b = fyd.b(i10 << 3);
                        c = fyd.c(j6);
                        i3 = c + b;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case 4:
                    if (mbeVar.l(f4eVar2, i7, i6, i8, i)) {
                        long j7 = unsafe.getInt(f4eVar2, j4);
                        b = fyd.b(i10 << 3);
                        c = fyd.c(j7);
                        i3 = c + b;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    if (mbeVar.l(f4eVar2, i7, i6, i8, i)) {
                        i9 = mlb.g(i10 << 3, 1, i9);
                    }
                    f4eVar2 = f4eVar;
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case 8:
                    if (mbeVar.l(f4eVar2, i7, i6, i8, i)) {
                        int i14 = i10 << 3;
                        Object object = unsafe.getObject(f4eVar2, j4);
                        if (object instanceof cxd) {
                            b2 = fyd.b(i14);
                            j2 = ((cxd) object).j();
                            i9 = mlb.h(j2, j2, b2, i9);
                        } else {
                            i9 += fyd.a((String) object) + fyd.b(i14);
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case 9:
                    if (mbeVar.l(f4eVar2, i7, i6, i8, i)) {
                        Object object2 = unsafe.getObject(f4eVar2, j4);
                        cde v = mbeVar.v(i7);
                        a8d a8dVar = qde.a;
                        b3 = fyd.b(i10 << 3);
                        b4 = ((utd) object2).b(v);
                        i9 = mlb.h(b4, b4, b3, i9);
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case 10:
                    if (mbeVar.l(f4eVar2, i7, i6, i8, i)) {
                        cxd cxdVar = (cxd) unsafe.getObject(f4eVar2, j4);
                        b2 = fyd.b(i10 << 3);
                        j2 = cxdVar.j();
                        i9 = mlb.h(j2, j2, b2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case 11:
                    if (mbeVar.l(f4eVar2, i7, i6, i8, i)) {
                        i9 = mlb.g(unsafe.getInt(f4eVar2, j4), fyd.b(i10 << 3), i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case 12:
                    if (mbeVar.l(f4eVar2, i7, i6, i8, i)) {
                        long j8 = unsafe.getInt(f4eVar2, j4);
                        b = fyd.b(i10 << 3);
                        c = fyd.c(j8);
                        i3 = c + b;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    if (mbeVar.l(f4eVar2, i7, i6, i8, i)) {
                        int i15 = unsafe.getInt(f4eVar2, j4);
                        b5 = fyd.b(i10 << 3);
                        i2 = (i15 << 1) ^ (i15 >> 31);
                        i9 = mlb.g(i2, b5, i9);
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case 16:
                    if (mbeVar.l(f4eVar2, i7, i6, i8, i)) {
                        long j9 = unsafe.getLong(f4eVar2, j4);
                        b = fyd.b(i10 << 3);
                        c = fyd.c((j9 << 1) ^ (j9 >> 63));
                        i3 = c + b;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case 17:
                    if (mbeVar.l(f4eVar2, i7, i6, i8, i)) {
                        i3 = fyd.r(i10, (utd) unsafe.getObject(f4eVar2, j4), mbeVar.v(i7));
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case 18:
                    i3 = qde.h(i10, (List) unsafe.getObject(f4eVar2, j4));
                    i9 += i3;
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case 19:
                    i3 = qde.g(i10, (List) unsafe.getObject(f4eVar2, j4));
                    i9 += i3;
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case 20:
                    List list = (List) unsafe.getObject(f4eVar2, j4);
                    a8d a8dVar2 = qde.a;
                    if (list.size() != 0) {
                        b6 = (fyd.b(i10 << 3) * list.size()) + qde.j(list);
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case 21:
                    List list2 = (List) unsafe.getObject(f4eVar2, j4);
                    a8d a8dVar3 = qde.a;
                    size = list2.size();
                    if (size != 0) {
                        n = qde.n(list2);
                        b7 = fyd.b(i10 << 3);
                        b6 = (b7 * size) + n;
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case 22:
                    List list3 = (List) unsafe.getObject(f4eVar2, j4);
                    a8d a8dVar4 = qde.a;
                    size = list3.size();
                    if (size != 0) {
                        n = qde.i(list3);
                        b7 = fyd.b(i10 << 3);
                        b6 = (b7 * size) + n;
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case 23:
                    i3 = qde.h(i10, (List) unsafe.getObject(f4eVar2, j4));
                    i9 += i3;
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case 24:
                    i3 = qde.g(i10, (List) unsafe.getObject(f4eVar2, j4));
                    i9 += i3;
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case 25:
                    List list4 = (List) unsafe.getObject(f4eVar2, j4);
                    a8d a8dVar5 = qde.a;
                    int size3 = list4.size();
                    i9 += size3 == 0 ? 0 : (fyd.b(i10 << 3) + 1) * size3;
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case 26:
                    List list5 = (List) unsafe.getObject(f4eVar2, j4);
                    a8d a8dVar6 = qde.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        b6 = fyd.b(i10 << 3) * size4;
                        if (list5 instanceof j7e) {
                            j7e j7eVar = (j7e) list5;
                            for (int i16 = 0; i16 < size4; i16++) {
                                Object zza = j7eVar.zza();
                                if (zza instanceof cxd) {
                                    int j10 = ((cxd) zza).j();
                                    b6 = mlb.g(j10, j10, b6);
                                } else {
                                    b6 = fyd.a((String) zza) + b6;
                                }
                            }
                        } else {
                            for (int i17 = 0; i17 < size4; i17++) {
                                Object obj = list5.get(i17);
                                if (obj instanceof cxd) {
                                    int j11 = ((cxd) obj).j();
                                    b6 = mlb.g(j11, j11, b6);
                                } else {
                                    b6 = fyd.a((String) obj) + b6;
                                }
                            }
                        }
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case 27:
                    List list6 = (List) unsafe.getObject(f4eVar2, j4);
                    cde v2 = mbeVar.v(i7);
                    a8d a8dVar7 = qde.a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        b8 = 0;
                    } else {
                        b8 = fyd.b(i10 << 3) * size5;
                        for (int i18 = 0; i18 < size5; i18++) {
                            int b13 = ((utd) list6.get(i18)).b(v2);
                            b8 = mlb.g(b13, b13, b8);
                        }
                    }
                    i9 += b8;
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case 28:
                    List list7 = (List) unsafe.getObject(f4eVar2, j4);
                    a8d a8dVar8 = qde.a;
                    int size6 = list7.size();
                    if (size6 != 0) {
                        b6 = fyd.b(i10 << 3) * size6;
                        for (int i19 = 0; i19 < list7.size(); i19++) {
                            int j12 = ((cxd) list7.get(i19)).j();
                            b6 = mlb.g(j12, j12, b6);
                        }
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case 29:
                    List list8 = (List) unsafe.getObject(f4eVar2, j4);
                    a8d a8dVar9 = qde.a;
                    size = list8.size();
                    if (size != 0) {
                        n = qde.m(list8);
                        b7 = fyd.b(i10 << 3);
                        b6 = (b7 * size) + n;
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case nm7.S /* 30 */:
                    List list9 = (List) unsafe.getObject(f4eVar2, j4);
                    a8d a8dVar10 = qde.a;
                    size = list9.size();
                    if (size != 0) {
                        n = qde.f(list9);
                        b7 = fyd.b(i10 << 3);
                        b6 = (b7 * size) + n;
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case 31:
                    i3 = qde.g(i10, (List) unsafe.getObject(f4eVar2, j4));
                    i9 += i3;
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case 32:
                    i3 = qde.h(i10, (List) unsafe.getObject(f4eVar2, j4));
                    i9 += i3;
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case 33:
                    List list10 = (List) unsafe.getObject(f4eVar2, j4);
                    a8d a8dVar11 = qde.a;
                    size = list10.size();
                    if (size != 0) {
                        n = qde.k(list10);
                        b7 = fyd.b(i10 << 3);
                        b6 = (b7 * size) + n;
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case 34:
                    List list11 = (List) unsafe.getObject(f4eVar2, j4);
                    a8d a8dVar12 = qde.a;
                    size = list11.size();
                    if (size != 0) {
                        n = qde.l(list11);
                        b7 = fyd.b(i10 << 3);
                        b6 = (b7 * size) + n;
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case 35:
                    List list12 = (List) unsafe.getObject(f4eVar2, j4);
                    a8d a8dVar13 = qde.a;
                    size2 = list12.size() << 3;
                    if (size2 > 0) {
                        b9 = fyd.b(i10 << 3);
                        i9 = mlb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(f4eVar2, j4);
                    a8d a8dVar14 = qde.a;
                    size2 = list13.size() << 2;
                    if (size2 > 0) {
                        b9 = fyd.b(i10 << 3);
                        i9 = mlb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case 37:
                    size2 = qde.j((List) unsafe.getObject(f4eVar2, j4));
                    if (size2 > 0) {
                        b9 = fyd.b(i10 << 3);
                        i9 = mlb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case 38:
                    size2 = qde.n((List) unsafe.getObject(f4eVar2, j4));
                    if (size2 > 0) {
                        b9 = fyd.b(i10 << 3);
                        i9 = mlb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case 39:
                    size2 = qde.i((List) unsafe.getObject(f4eVar2, j4));
                    if (size2 > 0) {
                        b9 = fyd.b(i10 << 3);
                        i9 = mlb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(f4eVar2, j4);
                    a8d a8dVar15 = qde.a;
                    size2 = list14.size() << 3;
                    if (size2 > 0) {
                        b9 = fyd.b(i10 << 3);
                        i9 = mlb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(f4eVar2, j4);
                    a8d a8dVar16 = qde.a;
                    size2 = list15.size() << 2;
                    if (size2 > 0) {
                        b9 = fyd.b(i10 << 3);
                        i9 = mlb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(f4eVar2, j4);
                    a8d a8dVar17 = qde.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        b9 = fyd.b(i10 << 3);
                        i9 = mlb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case 43:
                    size2 = qde.m((List) unsafe.getObject(f4eVar2, j4));
                    if (size2 > 0) {
                        b9 = fyd.b(i10 << 3);
                        i9 = mlb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case 44:
                    size2 = qde.f((List) unsafe.getObject(f4eVar2, j4));
                    if (size2 > 0) {
                        b9 = fyd.b(i10 << 3);
                        i9 = mlb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(f4eVar2, j4);
                    a8d a8dVar18 = qde.a;
                    size2 = list17.size() << 2;
                    if (size2 > 0) {
                        b9 = fyd.b(i10 << 3);
                        i9 = mlb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(f4eVar2, j4);
                    a8d a8dVar19 = qde.a;
                    size2 = list18.size() << 3;
                    if (size2 > 0) {
                        b9 = fyd.b(i10 << 3);
                        i9 = mlb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case 47:
                    size2 = qde.k((List) unsafe.getObject(f4eVar2, j4));
                    if (size2 > 0) {
                        b9 = fyd.b(i10 << 3);
                        i9 = mlb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case 48:
                    size2 = qde.l((List) unsafe.getObject(f4eVar2, j4));
                    if (size2 > 0) {
                        b9 = fyd.b(i10 << 3);
                        i9 = mlb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(f4eVar2, j4);
                    cde v3 = mbeVar.v(i7);
                    a8d a8dVar20 = qde.a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i20 = 0; i20 < size7; i20++) {
                            i4 += fyd.r(i10, (utd) list19.get(i20), v3);
                        }
                    }
                    i9 += i4;
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case 50:
                    s9e s9eVar = (s9e) unsafe.getObject(f4eVar2, j4);
                    if (mbeVar.w(i7) != null) {
                        rjb.p();
                        return 0;
                    }
                    if (s9eVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = s9eVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case nm7.n0 /* 51 */:
                    if (!mbeVar.n(i10, i7, f4eVar2)) {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                    i9 = mlb.g(i10 << 3, 8, i9);
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case nm7.o0 /* 52 */:
                    if (!mbeVar.n(i10, i7, f4eVar2)) {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                    i9 = mlb.g(i10 << 3, 4, i9);
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case nm7.p0 /* 53 */:
                    if (mbeVar.n(i10, i7, f4eVar2)) {
                        long t = t(f4eVar2, j4);
                        b10 = fyd.b(i10 << 3);
                        c2 = fyd.c(t);
                        i3 = c2 + b10;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case nm7.q0 /* 54 */:
                    if (mbeVar.n(i10, i7, f4eVar2)) {
                        long t2 = t(f4eVar2, j4);
                        b10 = fyd.b(i10 << 3);
                        c2 = fyd.c(t2);
                        i3 = c2 + b10;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case nm7.r0 /* 55 */:
                    if (mbeVar.n(i10, i7, f4eVar2)) {
                        long p = p(f4eVar2, j4);
                        b10 = fyd.b(i10 << 3);
                        c2 = fyd.c(p);
                        i3 = c2 + b10;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case 56:
                    if (!mbeVar.n(i10, i7, f4eVar2)) {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                    i9 = mlb.g(i10 << 3, 8, i9);
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case nm7.t0 /* 57 */:
                    if (!mbeVar.n(i10, i7, f4eVar2)) {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                    i9 = mlb.g(i10 << 3, 4, i9);
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case nm7.u0 /* 58 */:
                    if (mbeVar.n(i10, i7, f4eVar2)) {
                        i9 = mlb.g(i10 << 3, 1, i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case nm7.v0 /* 59 */:
                    if (mbeVar.n(i10, i7, f4eVar2)) {
                        int i21 = i10 << 3;
                        Object object3 = unsafe.getObject(f4eVar2, j4);
                        if (object3 instanceof cxd) {
                            b11 = fyd.b(i21);
                            j3 = ((cxd) object3).j();
                            i9 = mlb.h(j3, j3, b11, i9);
                            i7 += 3;
                            i5 = 1048575;
                            mbeVar = this;
                        } else {
                            i3 = fyd.a((String) object3) + fyd.b(i21);
                            i9 += i3;
                            i7 += 3;
                            i5 = 1048575;
                            mbeVar = this;
                        }
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case nm7.w0 /* 60 */:
                    if (mbeVar.n(i10, i7, f4eVar2)) {
                        Object object4 = unsafe.getObject(f4eVar2, j4);
                        cde v4 = mbeVar.v(i7);
                        a8d a8dVar21 = qde.a;
                        b3 = fyd.b(i10 << 3);
                        b4 = ((utd) object4).b(v4);
                        i9 = mlb.h(b4, b4, b3, i9);
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case nm7.x0 /* 61 */:
                    if (mbeVar.n(i10, i7, f4eVar2)) {
                        cxd cxdVar2 = (cxd) unsafe.getObject(f4eVar2, j4);
                        b11 = fyd.b(i10 << 3);
                        j3 = cxdVar2.j();
                        i9 = mlb.h(j3, j3, b11, i9);
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case nm7.y0 /* 62 */:
                    if (mbeVar.n(i10, i7, f4eVar2)) {
                        i2 = p(f4eVar2, j4);
                        b5 = fyd.b(i10 << 3);
                        i9 = mlb.g(i2, b5, i9);
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case nm7.z0 /* 63 */:
                    if (mbeVar.n(i10, i7, f4eVar2)) {
                        long p2 = p(f4eVar2, j4);
                        b10 = fyd.b(i10 << 3);
                        c2 = fyd.c(p2);
                        i3 = c2 + b10;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case 64:
                    if (!mbeVar.n(i10, i7, f4eVar2)) {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                    i9 = mlb.g(i10 << 3, 4, i9);
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case 65:
                    if (!mbeVar.n(i10, i7, f4eVar2)) {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                    i9 = mlb.g(i10 << 3, 8, i9);
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case nm7.C0 /* 66 */:
                    if (mbeVar.n(i10, i7, f4eVar2)) {
                        int p3 = p(f4eVar2, j4);
                        i9 = mlb.g((p3 << 1) ^ (p3 >> 31), fyd.b(i10 << 3), i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
                case nm7.D0 /* 67 */:
                    if (mbeVar.n(i10, i7, f4eVar2)) {
                        long t3 = t(f4eVar2, j4);
                        b10 = fyd.b(i10 << 3);
                        c2 = fyd.c((t3 << 1) ^ (t3 >> 63));
                        i3 = c2 + b10;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                case nm7.E0 /* 68 */:
                    if (mbeVar.n(i10, i7, f4eVar2)) {
                        i3 = fyd.r(i10, (utd) unsafe.getObject(f4eVar2, j4), mbeVar.v(i7));
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        mbeVar = this;
                    }
                default:
                    i7 += 3;
                    i5 = 1048575;
                    mbeVar = this;
            }
        }
    }

    public final void g(int i, Object obj, Object obj2) {
        if (k(i, obj2)) {
            long s = s(i) & 1048575;
            Unsafe unsafe = k;
            Object object = unsafe.getObject(obj2, s);
            if (object == null) {
                dq9.m(mle.d("Source subfield ", this.a[i], " is present but null: ", obj2.toString()));
                return;
            }
            cde v = v(i);
            if (!k(i, obj)) {
                if (m(object)) {
                    f4e zze = v.zze();
                    v.zzg(zze, object);
                    unsafe.putObject(obj, s, zze);
                } else {
                    unsafe.putObject(obj, s, object);
                }
                i(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, s);
            if (!m(object2)) {
                f4e zze2 = v.zze();
                v.zzg(zze2, object2);
                unsafe.putObject(obj, s, zze2);
                object2 = zze2;
            }
            v.zzg(object2, object);
        }
    }

    public final void h(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (n(i2, i, obj2)) {
            long s = s(i) & 1048575;
            Unsafe unsafe = k;
            Object object = unsafe.getObject(obj2, s);
            if (object == null) {
                dq9.m(mle.d("Source subfield ", iArr[i], " is present but null: ", obj2.toString()));
                return;
            }
            cde v = v(i);
            if (!n(i2, i, obj)) {
                if (m(object)) {
                    f4e zze = v.zze();
                    v.zzg(zze, object);
                    unsafe.putObject(obj, s, zze);
                } else {
                    unsafe.putObject(obj, s, object);
                }
                ohe.h(obj, iArr[i + 2] & 1048575, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, s);
            if (!m(object2)) {
                f4e zze2 = v.zze();
                v.zzg(zze2, object2);
                unsafe.putObject(obj, s, zze2);
                object2 = zze2;
            }
            v.zzg(object2, object);
        }
    }

    public final void i(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = 1048575 & i2;
        if (j2 == 1048575) {
            return;
        }
        ohe.h(obj, j2, ohe.e(obj, j2) | (1 << (i2 >>> 20)));
    }

    public final boolean j(f4e f4eVar, f4e f4eVar2, int i) {
        return k(i, f4eVar) == k(i, f4eVar2);
    }

    public final boolean k(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = i2 & 1048575;
        if (j2 != 1048575) {
            return (ohe.e(obj, j2) & (1 << (i2 >>> 20))) != 0;
        }
        int s = s(i);
        long j3 = 1048575 & s;
        switch (r(s)) {
            case 0:
                if (Double.doubleToRawLongBits(ohe.c.k(obj, j3)) != 0) {
                }
                break;
            case 1:
                if (Float.floatToRawIntBits(ohe.c.p(obj, j3)) != 0) {
                }
                break;
            case 2:
                if (ohe.f(obj, j3) != 0) {
                }
                break;
            case 3:
                if (ohe.f(obj, j3) != 0) {
                }
                break;
            case 4:
                if (ohe.e(obj, j3) != 0) {
                }
                break;
            case 5:
                if (ohe.f(obj, j3) != 0) {
                }
                break;
            case 6:
                if (ohe.e(obj, j3) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object g = ohe.g(obj, j3);
                if (!(g instanceof String)) {
                    if (!(g instanceof cxd)) {
                        i98.g();
                        break;
                    } else if (!cxd.c.equals(g)) {
                    }
                } else if (!((String) g).isEmpty()) {
                }
                break;
            case 9:
                if (ohe.g(obj, j3) != null) {
                }
                break;
            case 10:
                if (!cxd.c.equals(ohe.g(obj, j3))) {
                }
                break;
            case 11:
                if (ohe.e(obj, j3) != 0) {
                }
                break;
            case 12:
                if (ohe.e(obj, j3) != 0) {
                }
                break;
            case 13:
                if (ohe.e(obj, j3) != 0) {
                }
                break;
            case 14:
                if (ohe.f(obj, j3) != 0) {
                }
                break;
            case 15:
                if (ohe.e(obj, j3) != 0) {
                }
                break;
            case 16:
                if (ohe.f(obj, j3) != 0) {
                }
                break;
            case 17:
                if (ohe.g(obj, j3) != null) {
                }
                break;
            default:
                i98.g();
                break;
        }
        return false;
    }

    public final boolean l(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? k(i, obj) : (i3 & i4) != 0;
    }

    public final boolean n(int i, int i2, Object obj) {
        return ohe.e(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:529:0x030f, code lost:
    
        i2d.g("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0314, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0d6b, code lost:
    
        if (r2 == 1048575) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0376, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0d6d, code lost:
    
        r10.putInt(r8, r2, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x02bb, code lost:
    
        i2d.g("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x02c0, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0d71, code lost:
    
        r3 = r37.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0d77, code lost:
    
        if (r3 >= r37.h) goto L683;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0d79, code lost:
    
        r4 = r37.f[r3];
        r6 = r30[r4];
        r6 = ohe.g(r8, s(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0d8d, code lost:
    
        if (r6 == null) goto L684;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0d93, code lost:
    
        if (u(r4) != null) goto L682;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0d98, code lost:
    
        r6 = (s9e) r6;
        w(r4).getClass();
        rjb.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0da6, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0d95, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0dab, code lost:
    
        if (r0 != 0) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0dad, code lost:
    
        if (r1 == r5) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0daf, code lost:
    
        i2d.g("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0db2, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0db7, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0db3, code lost:
    
        if (r1 > r5) goto L567;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0db5, code lost:
    
        if (r14 != r0) goto L567;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0db8, code lost:
    
        i2d.g("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0dbb, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0d12 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0d20 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x09c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x09d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0275  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o(Object obj, byte[] bArr, int i, int i2, int i3, nl6 nl6Var) {
        int i4;
        Unsafe unsafe;
        int[] iArr;
        Object obj2;
        int i5;
        int q;
        int i6;
        int i7;
        jge jgeVar;
        nl6 nl6Var2;
        int i8;
        byte[] bArr2;
        int i9;
        int i10;
        int i11;
        int i12;
        byte[] bArr3;
        nl6 nl6Var3;
        int i13;
        int i14;
        int i15;
        int i16;
        Unsafe unsafe2;
        nl6 nl6Var4;
        Object obj3;
        Unsafe unsafe3;
        int i17;
        byte[] bArr4;
        nl6 nl6Var5;
        Object obj4;
        Unsafe unsafe4;
        int i18;
        int i19;
        int a;
        int f;
        int i20;
        int i21;
        int i22;
        int i23;
        s9e s9eVar;
        int i24;
        int i25;
        int i26;
        int i27;
        byte[] bArr5;
        nl6 nl6Var6;
        int i28;
        int a2;
        int f2;
        int i29;
        int i30;
        int i31;
        int d;
        int f3;
        int f4;
        int h;
        d5e d5eVar;
        int i32;
        int i33;
        btd btdVar;
        int i34;
        mbe mbeVar = this;
        Object obj5 = obj;
        byte[] bArr6 = bArr;
        int i35 = i2;
        nl6 nl6Var7 = nl6Var;
        if (!m(obj5)) {
            u36.j("Mutating immutable message: ".concat(String.valueOf(obj5)));
            return 0;
        }
        int i36 = i;
        int i37 = -1;
        int i38 = 0;
        int i39 = 1048575;
        int i40 = 0;
        int i41 = 0;
        while (true) {
            int[] iArr2 = mbeVar.a;
            Unsafe unsafe5 = k;
            if (i36 < i35) {
                int i42 = i36 + 1;
                int i43 = bArr6[i36];
                if (i43 < 0) {
                    i42 = n3f.g(i43, bArr6, i42, nl6Var7);
                    i43 = nl6Var7.b;
                }
                int i44 = i42;
                i41 = i43;
                int i45 = i41 >>> 3;
                int i46 = mbeVar.d;
                int i47 = mbeVar.c;
                if (i45 > i37) {
                    q = (i45 < i47 || i45 > i46) ? -1 : mbeVar.q(i45, i38 / 3);
                } else {
                    q = (i45 < i47 || i45 > i46) ? -1 : mbeVar.q(i45, 0);
                }
                jge jgeVar2 = jge.f;
                if (q == -1) {
                    i4 = i3;
                    i6 = i39;
                    i7 = i40;
                    unsafe = unsafe5;
                    jgeVar = jgeVar2;
                    iArr = iArr2;
                    i38 = 0;
                    nl6Var2 = nl6Var;
                    i8 = i45;
                    obj2 = obj5;
                    bArr2 = bArr6;
                    i9 = i44;
                    i10 = i41;
                } else {
                    int i48 = i41 & 7;
                    int i49 = iArr2[q + 1];
                    int r = r(i49);
                    long j2 = i49 & 1048575;
                    Unsafe unsafe6 = k;
                    String str = "";
                    if (r <= 17) {
                        int i50 = iArr2[q + 2];
                        int i51 = 1 << (i50 >>> 20);
                        int i52 = i50 & 1048575;
                        if (i52 != i39) {
                            int i53 = 1048575;
                            i11 = i48;
                            if (i39 != 1048575) {
                                unsafe5.putInt(obj5, i39, i40);
                                i53 = 1048575;
                            }
                            i12 = i52;
                            i40 = i52 == i53 ? 0 : unsafe5.getInt(obj5, i52);
                        } else {
                            i11 = i48;
                            i12 = i39;
                        }
                        switch (r) {
                            case 0:
                                bArr3 = bArr;
                                nl6Var3 = nl6Var;
                                unsafe = unsafe5;
                                i13 = i44;
                                i14 = i41;
                                i15 = i45;
                                i16 = i40;
                                if (i11 != 1) {
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    jgeVar = jgeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    nl6Var2 = nl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    ohe.c.v(obj5, j2, Double.longBitsToDouble(n3f.l(i13, bArr3)));
                                    i35 = i2;
                                    nl6Var7 = nl6Var3;
                                    bArr6 = bArr3;
                                    i36 = i13 + 8;
                                    i40 = i16 | i51;
                                    i38 = q;
                                    i37 = i15;
                                    i41 = i14;
                                    i39 = i12;
                                }
                            case 1:
                                bArr3 = bArr;
                                nl6Var3 = nl6Var;
                                unsafe = unsafe5;
                                i13 = i44;
                                i14 = i41;
                                i15 = i45;
                                i16 = i40;
                                if (i11 != 5) {
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    jgeVar = jgeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    nl6Var2 = nl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    i36 = i13 + 4;
                                    i40 = i16 | i51;
                                    ohe.c.w(obj5, j2, Float.intBitsToFloat(n3f.b(bArr3, i13)));
                                    i35 = i2;
                                    nl6Var7 = nl6Var3;
                                    bArr6 = bArr3;
                                    i38 = q;
                                    i37 = i15;
                                    i41 = i14;
                                    i39 = i12;
                                }
                            case 2:
                            case 3:
                                bArr3 = bArr;
                                nl6Var3 = nl6Var;
                                unsafe2 = unsafe5;
                                i13 = i44;
                                i14 = i41;
                                i15 = i45;
                                i16 = i40;
                                if (i11 != 0) {
                                    unsafe = unsafe2;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    jgeVar = jgeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    nl6Var2 = nl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    i40 = i16 | i51;
                                    int i54 = n3f.i(bArr3, i13, nl6Var3);
                                    unsafe2.putLong(obj5, j2, nl6Var3.a);
                                    i35 = i2;
                                    nl6Var7 = nl6Var3;
                                    bArr6 = bArr3;
                                    i36 = i54;
                                    i38 = q;
                                    i37 = i15;
                                    i41 = i14;
                                    i39 = i12;
                                }
                            case 4:
                            case 11:
                                bArr3 = bArr;
                                nl6Var3 = nl6Var;
                                unsafe2 = unsafe5;
                                i13 = i44;
                                i14 = i41;
                                i15 = i45;
                                i16 = i40;
                                if (i11 != 0) {
                                    unsafe = unsafe2;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    jgeVar = jgeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    nl6Var2 = nl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    i40 = i16 | i51;
                                    int f5 = n3f.f(bArr3, i13, nl6Var3);
                                    unsafe2.putInt(obj5, j2, nl6Var3.b);
                                    i36 = f5;
                                    nl6Var7 = nl6Var3;
                                    bArr6 = bArr3;
                                    i38 = q;
                                    i37 = i15;
                                    i41 = i14;
                                    i39 = i12;
                                    i35 = i2;
                                }
                            case 5:
                            case 14:
                                bArr3 = bArr;
                                Object obj6 = obj5;
                                i13 = i44;
                                i14 = i41;
                                i15 = i45;
                                i16 = i40;
                                if (i11 != 1) {
                                    nl6Var3 = nl6Var;
                                    unsafe2 = unsafe5;
                                    obj5 = obj6;
                                    unsafe = unsafe2;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    jgeVar = jgeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    nl6Var2 = nl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    obj5 = obj6;
                                    unsafe5.putLong(obj5, j2, n3f.l(i13, bArr3));
                                    i35 = i2;
                                    nl6Var7 = nl6Var;
                                    bArr6 = bArr3;
                                    i38 = q;
                                    i36 = i13 + 8;
                                    i37 = i15;
                                    i40 = i16 | i51;
                                    i41 = i14;
                                    i39 = i12;
                                }
                            case 6:
                            case 13:
                                bArr3 = bArr;
                                nl6Var4 = nl6Var;
                                obj3 = obj5;
                                unsafe3 = unsafe5;
                                i13 = i44;
                                i14 = i41;
                                i15 = i45;
                                i16 = i40;
                                if (i11 != 5) {
                                    unsafe = unsafe3;
                                    obj5 = obj3;
                                    nl6Var3 = nl6Var4;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    jgeVar = jgeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    nl6Var2 = nl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    unsafe3.putInt(obj3, j2, n3f.b(bArr3, i13));
                                    i35 = i2;
                                    nl6Var7 = nl6Var4;
                                    i36 = i13 + 4;
                                    i40 = i16 | i51;
                                    obj5 = obj3;
                                    bArr6 = bArr3;
                                    i38 = q;
                                    i37 = i15;
                                    i41 = i14;
                                    i39 = i12;
                                }
                            case 7:
                                bArr3 = bArr;
                                nl6Var4 = nl6Var;
                                obj3 = obj5;
                                unsafe3 = unsafe5;
                                i13 = i44;
                                i14 = i41;
                                i15 = i45;
                                i16 = i40;
                                if (i11 != 0) {
                                    unsafe = unsafe3;
                                    obj5 = obj3;
                                    nl6Var3 = nl6Var4;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    jgeVar = jgeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    nl6Var2 = nl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    int i55 = i16 | i51;
                                    int i56 = n3f.i(bArr3, i13, nl6Var4);
                                    ohe.c.s(obj3, j2, nl6Var4.a != 0);
                                    i35 = i2;
                                    nl6Var7 = nl6Var4;
                                    i40 = i55;
                                    i36 = i56;
                                    obj5 = obj3;
                                    bArr6 = bArr3;
                                    i38 = q;
                                    i37 = i15;
                                    i41 = i14;
                                    i39 = i12;
                                }
                            case 8:
                                bArr3 = bArr;
                                nl6Var4 = nl6Var;
                                obj3 = obj5;
                                unsafe3 = unsafe5;
                                i13 = i44;
                                i14 = i41;
                                i15 = i45;
                                i16 = i40;
                                if (i11 != 2) {
                                    unsafe = unsafe3;
                                    obj5 = obj3;
                                    nl6Var3 = nl6Var4;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    jgeVar = jgeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    nl6Var2 = nl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    if ((i49 & TLObject.FLAG_29) != 0) {
                                        int i57 = i16 | i51;
                                        int f6 = n3f.f(bArr3, i13, nl6Var4);
                                        int i58 = nl6Var4.b;
                                        if (i58 < 0) {
                                            i2d.g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            return 0;
                                        }
                                        if (i58 == 0) {
                                            nl6Var4.d = "";
                                            i21 = i57;
                                        } else {
                                            int i59 = die.a;
                                            int length = bArr3.length;
                                            if ((f6 | i58 | ((length - f6) - i58)) < 0) {
                                                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(f6), Integer.valueOf(i58)));
                                            }
                                            int i60 = f6 + i58;
                                            char[] cArr = new char[i58];
                                            int i61 = 0;
                                            while (f6 < i60) {
                                                byte b = bArr3[f6];
                                                if (b >= 0) {
                                                    f6++;
                                                    cArr[i61] = (char) b;
                                                    i61++;
                                                } else {
                                                    while (f6 < i60) {
                                                        int i62 = f6 + 1;
                                                        byte b2 = bArr3[f6];
                                                        if (b2 >= 0) {
                                                            cArr[i61] = (char) b2;
                                                            i61++;
                                                            f6 = i62;
                                                            while (f6 < i60) {
                                                                byte b3 = bArr3[f6];
                                                                if (b3 >= 0) {
                                                                    f6++;
                                                                    cArr[i61] = (char) b3;
                                                                    i61++;
                                                                }
                                                            }
                                                        } else {
                                                            int i63 = i57;
                                                            if (b2 >= -32) {
                                                                int i64 = i60;
                                                                if (b2 < -16) {
                                                                    if (i62 >= i64 - 1) {
                                                                        i2d.g("Protocol message had invalid UTF-8.");
                                                                        return 0;
                                                                    }
                                                                    int i65 = i61 + 1;
                                                                    int i66 = f6 + 2;
                                                                    byte b4 = bArr3[i62];
                                                                    f6 += 3;
                                                                    byte b5 = bArr3[i66];
                                                                    if (!l4f.a(b4)) {
                                                                        if (b2 == -32) {
                                                                            if (b4 < -96) {
                                                                                break;
                                                                            } else {
                                                                                b2 = -32;
                                                                            }
                                                                        }
                                                                        if (b2 == -19) {
                                                                            if (b4 >= -96) {
                                                                                break;
                                                                            } else {
                                                                                b2 = -19;
                                                                            }
                                                                        }
                                                                        if (l4f.a(b5)) {
                                                                            break;
                                                                        } else {
                                                                            cArr[i61] = (char) (((b2 & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                            i60 = i64;
                                                                            i57 = i63;
                                                                            i61 = i65;
                                                                        }
                                                                    } else {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    if (i62 >= i64 - 2) {
                                                                        i2d.g("Protocol message had invalid UTF-8.");
                                                                        return 0;
                                                                    }
                                                                    byte b6 = bArr3[i62];
                                                                    int i67 = f6 + 3;
                                                                    byte b7 = bArr3[f6 + 2];
                                                                    f6 += 4;
                                                                    byte b8 = bArr3[i67];
                                                                    if (!l4f.a(b6) && (((b6 + 112) + (b2 << 28)) >> 30) == 0 && !l4f.a(b7) && !l4f.a(b8)) {
                                                                        int i68 = ((b2 & 7) << 18) | ((b6 & 63) << 12) | ((b7 & 63) << 6) | (b8 & 63);
                                                                        cArr[i61] = (char) ((i68 >>> 10) + 55232);
                                                                        cArr[i61 + 1] = (char) ((i68 & 1023) + 56320);
                                                                        i61 += 2;
                                                                        i60 = i64;
                                                                    }
                                                                }
                                                            } else {
                                                                if (i62 >= i60) {
                                                                    i2d.g("Protocol message had invalid UTF-8.");
                                                                    return 0;
                                                                }
                                                                int i69 = i61 + 1;
                                                                f6 += 2;
                                                                byte b9 = bArr3[i62];
                                                                int i70 = i60;
                                                                if (b2 >= -62 && !l4f.a(b9)) {
                                                                    cArr[i61] = (char) (((b2 & 31) << 6) | (b9 & 63));
                                                                    i60 = i70;
                                                                    i61 = i69;
                                                                }
                                                            }
                                                            i57 = i63;
                                                        }
                                                    }
                                                    int i71 = i60;
                                                    i21 = i57;
                                                    str = new String(cArr, 0, i61);
                                                    nl6Var4.d = str;
                                                    f6 = i71;
                                                }
                                            }
                                            while (f6 < i60) {
                                            }
                                            int i712 = i60;
                                            i21 = i57;
                                            str = new String(cArr, 0, i61);
                                            nl6Var4.d = str;
                                            f6 = i712;
                                        }
                                        f = f6;
                                        i20 = i21;
                                    } else {
                                        f = n3f.f(bArr3, i13, nl6Var4);
                                        int i72 = nl6Var4.b;
                                        if (i72 < 0) {
                                            i2d.g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            return 0;
                                        }
                                        i20 = i16 | i51;
                                        if (i72 == 0) {
                                            nl6Var4.d = "";
                                        } else {
                                            str = new String(bArr3, f, i72, k5e.a);
                                            nl6Var4.d = str;
                                            f += i72;
                                        }
                                    }
                                    unsafe3.putObject(obj3, j2, str);
                                    i35 = i2;
                                    i40 = i20;
                                    obj5 = obj3;
                                    bArr6 = bArr3;
                                    i38 = q;
                                    i39 = i12;
                                    nl6Var7 = nl6Var4;
                                    i36 = f;
                                    i37 = i15;
                                    i41 = i14;
                                }
                                break;
                            case 9:
                                Object obj7 = obj5;
                                i17 = i40;
                                if (i11 != 2) {
                                    bArr3 = bArr;
                                    i13 = i44;
                                    unsafe = unsafe5;
                                    obj5 = obj7;
                                    i14 = i41;
                                    i15 = i45;
                                    nl6Var3 = nl6Var;
                                    i16 = i17;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    jgeVar = jgeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    nl6Var2 = nl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    i40 = i17 | i51;
                                    Object x = mbeVar.x(q, obj7);
                                    nl6Var7 = nl6Var;
                                    int k2 = n3f.k(x, mbeVar.v(q), bArr, i44, i2, nl6Var7);
                                    unsafe6.putObject(obj, mbeVar.s(q) & 1048575, x);
                                    mbeVar.i(q, obj);
                                    i35 = i2;
                                    i36 = k2;
                                    obj5 = obj;
                                    bArr6 = bArr;
                                    i38 = q;
                                    i37 = i45;
                                    i39 = i12;
                                }
                            case 10:
                                bArr4 = bArr;
                                nl6Var5 = nl6Var;
                                obj4 = obj5;
                                i17 = i40;
                                unsafe4 = unsafe5;
                                i18 = i44;
                                if (i11 != 2) {
                                    nl6 nl6Var8 = nl6Var5;
                                    bArr3 = bArr4;
                                    nl6Var3 = nl6Var8;
                                    unsafe = unsafe4;
                                    i13 = i18;
                                    i14 = i41;
                                    i15 = i45;
                                    obj5 = obj4;
                                    i16 = i17;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    jgeVar = jgeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    nl6Var2 = nl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    i19 = i17 | i51;
                                    a = n3f.a(bArr4, i18, nl6Var5);
                                    unsafe4.putObject(obj4, j2, nl6Var5.d);
                                    i35 = i2;
                                    obj5 = obj4;
                                    i36 = a;
                                    i40 = i19;
                                    bArr6 = bArr4;
                                    nl6Var7 = nl6Var5;
                                    i38 = q;
                                    i37 = i45;
                                    i39 = i12;
                                }
                            case 12:
                                bArr4 = bArr;
                                nl6Var5 = nl6Var;
                                obj4 = obj5;
                                i17 = i40;
                                unsafe4 = unsafe5;
                                i18 = i44;
                                if (i11 != 0) {
                                    nl6 nl6Var82 = nl6Var5;
                                    bArr3 = bArr4;
                                    nl6Var3 = nl6Var82;
                                    unsafe = unsafe4;
                                    i13 = i18;
                                    i14 = i41;
                                    i15 = i45;
                                    obj5 = obj4;
                                    i16 = i17;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    jgeVar = jgeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    nl6Var2 = nl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    a = n3f.f(bArr4, i18, nl6Var5);
                                    int i73 = nl6Var5.b;
                                    btd u = mbeVar.u(q);
                                    if ((i49 & TLObject.FLAG_31) == 0 || u == null || u.a(i73)) {
                                        i19 = i17 | i51;
                                        unsafe4.putInt(obj4, j2, i73);
                                        i35 = i2;
                                        obj5 = obj4;
                                        i36 = a;
                                        i40 = i19;
                                        bArr6 = bArr4;
                                        nl6Var7 = nl6Var5;
                                        i38 = q;
                                        i37 = i45;
                                        i39 = i12;
                                    } else {
                                        f4e f4eVar = (f4e) obj4;
                                        jge jgeVar3 = f4eVar.zzc;
                                        if (jgeVar3 == jgeVar2) {
                                            jgeVar3 = jge.b();
                                            f4eVar.zzc = jgeVar3;
                                        }
                                        jgeVar3.c(i41, Long.valueOf(i73));
                                        i35 = i2;
                                        obj5 = obj4;
                                        i36 = a;
                                        i40 = i17;
                                        bArr6 = bArr4;
                                        nl6Var7 = nl6Var5;
                                        i38 = q;
                                        i37 = i45;
                                        i39 = i12;
                                    }
                                }
                            case 15:
                                bArr4 = bArr;
                                nl6Var5 = nl6Var;
                                obj4 = obj5;
                                i17 = i40;
                                unsafe4 = unsafe5;
                                i18 = i44;
                                if (i11 != 0) {
                                    nl6 nl6Var822 = nl6Var5;
                                    bArr3 = bArr4;
                                    nl6Var3 = nl6Var822;
                                    unsafe = unsafe4;
                                    i13 = i18;
                                    i14 = i41;
                                    i15 = i45;
                                    obj5 = obj4;
                                    i16 = i17;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    jgeVar = jgeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    nl6Var2 = nl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    i19 = i17 | i51;
                                    a = n3f.f(bArr4, i18, nl6Var5);
                                    int i74 = nl6Var5.b;
                                    unsafe4.putInt(obj4, j2, (i74 >>> 1) ^ (-(i74 & 1)));
                                    i35 = i2;
                                    obj5 = obj4;
                                    i36 = a;
                                    i40 = i19;
                                    bArr6 = bArr4;
                                    nl6Var7 = nl6Var5;
                                    i38 = q;
                                    i37 = i45;
                                    i39 = i12;
                                }
                            case 16:
                                if (i11 != 0) {
                                    bArr3 = bArr;
                                    nl6Var3 = nl6Var;
                                    obj5 = obj5;
                                    unsafe = unsafe5;
                                    i14 = i41;
                                    i15 = i45;
                                    i13 = i44;
                                    i16 = i40;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    jgeVar = jgeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    nl6Var2 = nl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    i40 |= i51;
                                    int i75 = n3f.i(bArr, i44, nl6Var);
                                    long j3 = nl6Var.a;
                                    unsafe5.putLong(obj5, j2, (-(j3 & 1)) ^ (j3 >>> 1));
                                    i35 = i2;
                                    bArr6 = bArr;
                                    nl6Var7 = nl6Var;
                                    i38 = q;
                                    i36 = i75;
                                    i37 = i45;
                                    i39 = i12;
                                }
                            default:
                                if (i11 != 3) {
                                    bArr3 = bArr;
                                    nl6Var3 = nl6Var;
                                    unsafe = unsafe5;
                                    i13 = i44;
                                    i14 = i41;
                                    i15 = i45;
                                    i16 = i40;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    jgeVar = jgeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    nl6Var2 = nl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    Object x2 = mbeVar.x(q, obj5);
                                    int j4 = n3f.j(x2, mbeVar.v(q), bArr, i44, i2, (i45 << 3) | 4, nl6Var);
                                    bArr4 = bArr;
                                    nl6Var5 = nl6Var;
                                    unsafe6.putObject(obj5, mbeVar.s(q) & 1048575, x2);
                                    mbeVar.i(q, obj5);
                                    i35 = i2;
                                    i40 |= i51;
                                    i36 = j4;
                                    bArr6 = bArr4;
                                    nl6Var7 = nl6Var5;
                                    i38 = q;
                                    i37 = i45;
                                    i39 = i12;
                                }
                        }
                    } else {
                        i6 = i39;
                        unsafe = unsafe5;
                        i7 = i40;
                        if (r != 27) {
                            Object obj8 = obj5;
                            if (r > 49) {
                                i41 = i41;
                                i22 = i44;
                                i23 = i45;
                                iArr = iArr2;
                                if (r != 50) {
                                    obj2 = obj;
                                    long j5 = iArr[q + 2] & 1048575;
                                    switch (r) {
                                        case nm7.n0 /* 51 */:
                                            bArr2 = bArr;
                                            nl6Var2 = nl6Var;
                                            jgeVar = jgeVar2;
                                            i8 = i23;
                                            i24 = i22;
                                            i25 = q;
                                            i26 = i41;
                                            if (i48 == 1) {
                                                i27 = i24 + 8;
                                                unsafe.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(n3f.l(i24, bArr2))));
                                                unsafe.putInt(obj2, j5, i8);
                                                i36 = i27;
                                                if (i36 == i24) {
                                                    i4 = i3;
                                                    i9 = i36;
                                                    i38 = i25;
                                                    i10 = i26;
                                                    break;
                                                } else {
                                                    mbeVar = this;
                                                    i35 = i2;
                                                    obj5 = obj2;
                                                    bArr6 = bArr2;
                                                    nl6Var7 = nl6Var2;
                                                    i37 = i8;
                                                    i38 = i25;
                                                    i41 = i26;
                                                    break;
                                                }
                                            }
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                        case nm7.o0 /* 52 */:
                                            bArr2 = bArr;
                                            nl6Var2 = nl6Var;
                                            jgeVar = jgeVar2;
                                            i8 = i23;
                                            i24 = i22;
                                            i25 = q;
                                            i26 = i41;
                                            if (i48 == 5) {
                                                i27 = i24 + 4;
                                                unsafe.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(n3f.b(bArr2, i24))));
                                                unsafe.putInt(obj2, j5, i8);
                                                i36 = i27;
                                                if (i36 == i24) {
                                                }
                                            }
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case nm7.p0 /* 53 */:
                                        case nm7.q0 /* 54 */:
                                            bArr2 = bArr;
                                            nl6Var2 = nl6Var;
                                            jgeVar = jgeVar2;
                                            i8 = i23;
                                            i24 = i22;
                                            i25 = q;
                                            i26 = i41;
                                            if (i48 == 0) {
                                                i27 = n3f.i(bArr2, i24, nl6Var2);
                                                unsafe.putObject(obj2, j2, Long.valueOf(nl6Var2.a));
                                                unsafe.putInt(obj2, j5, i8);
                                                i36 = i27;
                                                if (i36 == i24) {
                                                }
                                            }
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case nm7.r0 /* 55 */:
                                        case nm7.y0 /* 62 */:
                                            bArr2 = bArr;
                                            nl6Var2 = nl6Var;
                                            jgeVar = jgeVar2;
                                            i8 = i23;
                                            i24 = i22;
                                            i25 = q;
                                            i26 = i41;
                                            if (i48 == 0) {
                                                i27 = n3f.f(bArr2, i24, nl6Var2);
                                                unsafe.putObject(obj2, j2, Integer.valueOf(nl6Var2.b));
                                                unsafe.putInt(obj2, j5, i8);
                                                i36 = i27;
                                                if (i36 == i24) {
                                                }
                                            }
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            bArr2 = bArr;
                                            nl6Var2 = nl6Var;
                                            jgeVar = jgeVar2;
                                            i8 = i23;
                                            i24 = i22;
                                            i25 = q;
                                            i26 = i41;
                                            if (i48 == 1) {
                                                i27 = i24 + 8;
                                                unsafe.putObject(obj2, j2, Long.valueOf(n3f.l(i24, bArr2)));
                                                unsafe.putInt(obj2, j5, i8);
                                                i36 = i27;
                                                if (i36 == i24) {
                                                }
                                            }
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case nm7.t0 /* 57 */:
                                        case 64:
                                            bArr2 = bArr;
                                            nl6Var2 = nl6Var;
                                            jgeVar = jgeVar2;
                                            i8 = i23;
                                            i24 = i22;
                                            i25 = q;
                                            i26 = i41;
                                            if (i48 == 5) {
                                                i27 = i24 + 4;
                                                unsafe.putObject(obj2, j2, Integer.valueOf(n3f.b(bArr2, i24)));
                                                unsafe.putInt(obj2, j5, i8);
                                                i36 = i27;
                                                if (i36 == i24) {
                                                }
                                            }
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case nm7.u0 /* 58 */:
                                            bArr2 = bArr;
                                            nl6Var2 = nl6Var;
                                            i8 = i23;
                                            i24 = i22;
                                            i25 = q;
                                            if (i48 == 0) {
                                                i27 = n3f.i(bArr2, i24, nl6Var2);
                                                jgeVar = jgeVar2;
                                                i26 = i41;
                                                unsafe.putObject(obj2, j2, Boolean.valueOf(nl6Var2.a != 0));
                                                unsafe.putInt(obj2, j5, i8);
                                                i36 = i27;
                                                if (i36 == i24) {
                                                }
                                            }
                                            jgeVar = jgeVar2;
                                            i26 = i41;
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case nm7.v0 /* 59 */:
                                            bArr2 = bArr;
                                            nl6Var2 = nl6Var;
                                            i8 = i23;
                                            i24 = i22;
                                            i25 = q;
                                            if (i48 == 2) {
                                                int f7 = n3f.f(bArr2, i24, nl6Var2);
                                                int i76 = nl6Var2.b;
                                                if (i76 == 0) {
                                                    unsafe.putObject(obj2, j2, "");
                                                } else {
                                                    int i77 = f7 + i76;
                                                    if ((i49 & TLObject.FLAG_29) != 0 && !die.d(f7, i77, bArr2)) {
                                                        i2d.g("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    unsafe.putObject(obj2, j2, new String(bArr2, f7, i76, k5e.a));
                                                    f7 = i77;
                                                }
                                                unsafe.putInt(obj2, j5, i8);
                                                i36 = f7;
                                                jgeVar = jgeVar2;
                                                i26 = i41;
                                                if (i36 == i24) {
                                                }
                                            }
                                            jgeVar = jgeVar2;
                                            i26 = i41;
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case nm7.w0 /* 60 */:
                                            i8 = i23;
                                            if (i48 == 2) {
                                                Object y = mbeVar.y(i8, q, obj2);
                                                i24 = i22;
                                                int k3 = n3f.k(y, mbeVar.v(q), bArr, i24, i2, nl6Var);
                                                unsafe6.putObject(obj2, mbeVar.s(q) & 1048575, y);
                                                ohe.h(obj2, iArr[r9] & 1048575, i8);
                                                bArr2 = bArr;
                                                nl6Var2 = nl6Var;
                                                i36 = k3;
                                                i25 = q;
                                                jgeVar = jgeVar2;
                                                i26 = i41;
                                                if (i36 == i24) {
                                                }
                                            } else {
                                                bArr2 = bArr;
                                                nl6Var2 = nl6Var;
                                                jgeVar = jgeVar2;
                                                i26 = i41;
                                                i24 = i22;
                                                i25 = q;
                                                i36 = i24;
                                                if (i36 == i24) {
                                                }
                                            }
                                            break;
                                        case nm7.x0 /* 61 */:
                                            bArr5 = bArr;
                                            nl6Var6 = nl6Var;
                                            i8 = i23;
                                            i28 = i22;
                                            if (i48 == 2) {
                                                a2 = n3f.a(bArr5, i28, nl6Var6);
                                                unsafe.putObject(obj2, j2, nl6Var6.d);
                                                unsafe.putInt(obj2, j5, i8);
                                                nl6Var2 = nl6Var6;
                                                i36 = a2;
                                                i24 = i28;
                                                i25 = q;
                                                jgeVar = jgeVar2;
                                                i26 = i41;
                                                bArr2 = bArr5;
                                                if (i36 == i24) {
                                                }
                                            }
                                            nl6Var2 = nl6Var6;
                                            i24 = i28;
                                            i25 = q;
                                            jgeVar = jgeVar2;
                                            i26 = i41;
                                            bArr2 = bArr5;
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case nm7.z0 /* 63 */:
                                            bArr5 = bArr;
                                            nl6Var6 = nl6Var;
                                            jgeVar = jgeVar2;
                                            i8 = i23;
                                            i28 = i22;
                                            if (i48 == 0) {
                                                a2 = n3f.f(bArr5, i28, nl6Var6);
                                                int i78 = nl6Var6.b;
                                                btd u2 = mbeVar.u(q);
                                                if (u2 == null || u2.a(i78)) {
                                                    jgeVar2 = jgeVar;
                                                    unsafe.putObject(obj2, j2, Integer.valueOf(i78));
                                                    unsafe.putInt(obj2, j5, i8);
                                                } else {
                                                    f4e f4eVar2 = (f4e) obj2;
                                                    jge jgeVar4 = f4eVar2.zzc;
                                                    jgeVar2 = jgeVar;
                                                    if (jgeVar4 == jgeVar2) {
                                                        jgeVar4 = jge.b();
                                                        f4eVar2.zzc = jgeVar4;
                                                    }
                                                    jgeVar4.c(i41, Long.valueOf(i78));
                                                }
                                                nl6Var2 = nl6Var6;
                                                i36 = a2;
                                                i24 = i28;
                                                i25 = q;
                                                jgeVar = jgeVar2;
                                                i26 = i41;
                                                bArr2 = bArr5;
                                                if (i36 == i24) {
                                                }
                                            }
                                            nl6Var2 = nl6Var6;
                                            i24 = i28;
                                            i25 = q;
                                            i26 = i41;
                                            bArr2 = bArr5;
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case nm7.C0 /* 66 */:
                                            bArr5 = bArr;
                                            nl6Var6 = nl6Var;
                                            jgeVar = jgeVar2;
                                            i8 = i23;
                                            i28 = i22;
                                            if (i48 == 0) {
                                                f2 = n3f.f(bArr5, i28, nl6Var6);
                                                int i79 = nl6Var6.b;
                                                unsafe.putObject(obj2, j2, Integer.valueOf((i79 >>> 1) ^ (-(i79 & 1))));
                                                unsafe.putInt(obj2, j5, i8);
                                                nl6Var2 = nl6Var6;
                                                i36 = f2;
                                                i24 = i28;
                                                i25 = q;
                                                i26 = i41;
                                                bArr2 = bArr5;
                                                if (i36 == i24) {
                                                }
                                            }
                                            nl6Var2 = nl6Var6;
                                            i24 = i28;
                                            i25 = q;
                                            i26 = i41;
                                            bArr2 = bArr5;
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case nm7.D0 /* 67 */:
                                            bArr5 = bArr;
                                            nl6Var6 = nl6Var;
                                            i8 = i23;
                                            i28 = i22;
                                            if (i48 == 0) {
                                                f2 = n3f.i(bArr5, i28, nl6Var6);
                                                jgeVar = jgeVar2;
                                                long j6 = nl6Var6.a;
                                                unsafe.putObject(obj2, j2, Long.valueOf((j6 >>> 1) ^ (-(j6 & 1))));
                                                unsafe.putInt(obj2, j5, i8);
                                                nl6Var2 = nl6Var6;
                                                i36 = f2;
                                                i24 = i28;
                                                i25 = q;
                                                i26 = i41;
                                                bArr2 = bArr5;
                                                if (i36 == i24) {
                                                }
                                            }
                                            nl6Var2 = nl6Var6;
                                            i24 = i28;
                                            i25 = q;
                                            jgeVar = jgeVar2;
                                            i26 = i41;
                                            bArr2 = bArr5;
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case nm7.E0 /* 68 */:
                                            if (i48 == 3) {
                                                i8 = i23;
                                                Object y2 = mbeVar.y(i8, q, obj2);
                                                int j7 = n3f.j(y2, mbeVar.v(q), bArr, i22, i2, (i41 & (-8)) | 4, nl6Var);
                                                unsafe6.putObject(obj2, mbeVar.s(q) & 1048575, y2);
                                                ohe.h(obj2, iArr[r9] & 1048575, i8);
                                                i36 = j7;
                                                bArr2 = bArr;
                                                nl6Var2 = nl6Var;
                                                jgeVar = jgeVar2;
                                                i26 = i41;
                                                i24 = i22;
                                                i25 = q;
                                                if (i36 == i24) {
                                                }
                                            } else {
                                                i8 = i23;
                                                bArr2 = bArr;
                                                nl6Var2 = nl6Var;
                                                i25 = q;
                                                jgeVar = jgeVar2;
                                                i24 = i22;
                                                i26 = i41;
                                                i36 = i24;
                                                if (i36 == i24) {
                                                }
                                            }
                                            break;
                                        default:
                                            bArr2 = bArr;
                                            nl6Var2 = nl6Var;
                                            jgeVar = jgeVar2;
                                            i8 = i23;
                                            i24 = i22;
                                            i25 = q;
                                            i26 = i41;
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                    }
                                } else {
                                    if (i48 == 2) {
                                        Object w = mbeVar.w(q);
                                        Object object = unsafe.getObject(obj, j2);
                                        if (!((s9e) object).a) {
                                            s9e s9eVar2 = s9e.b;
                                            if (s9eVar2.isEmpty()) {
                                                s9eVar = new s9e();
                                            } else {
                                                s9e s9eVar3 = new s9e(s9eVar2);
                                                s9eVar3.a = true;
                                                s9eVar = s9eVar3;
                                            }
                                            ied.a(s9eVar, object);
                                            unsafe.putObject(obj, j2, s9eVar);
                                        }
                                        w.getClass();
                                        rjb.p();
                                        return 0;
                                    }
                                    obj2 = obj;
                                    bArr2 = bArr;
                                    i4 = i3;
                                    nl6Var2 = nl6Var;
                                    i9 = i22;
                                }
                            } else {
                                iArr = iArr2;
                                long j8 = i49;
                                d5e d5eVar2 = (d5e) unsafe.getObject(obj8, j2);
                                if (!((eud) d5eVar2).a) {
                                    d5eVar2 = d5eVar2.zzd(d5eVar2.size() << 1);
                                    unsafe.putObject(obj8, j2, d5eVar2);
                                }
                                d5e d5eVar3 = d5eVar2;
                                switch (r) {
                                    case 18:
                                    case 35:
                                        i41 = i41;
                                        i29 = i44;
                                        i23 = i45;
                                        if (i48 == 2) {
                                            rjb.p();
                                            return 0;
                                        }
                                        if (i48 == 1) {
                                            rjb.p();
                                            return 0;
                                        }
                                        i36 = i29;
                                        if (i36 != i29) {
                                            obj2 = obj;
                                            bArr2 = bArr;
                                            i4 = i3;
                                            nl6Var2 = nl6Var;
                                            i9 = i36;
                                            break;
                                        } else {
                                            obj5 = obj;
                                            bArr6 = bArr;
                                            i35 = i2;
                                            nl6Var7 = nl6Var;
                                            i38 = q;
                                            i37 = i23;
                                            break;
                                        }
                                    case 19:
                                    case 36:
                                        i41 = i41;
                                        i29 = i44;
                                        i23 = i45;
                                        if (i48 == 2) {
                                            rjb.p();
                                            return 0;
                                        }
                                        if (i48 == 5) {
                                            rjb.p();
                                            return 0;
                                        }
                                        i36 = i29;
                                        if (i36 != i29) {
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        i41 = i41;
                                        i29 = i44;
                                        i23 = i45;
                                        if (i48 == 2) {
                                            rjb.p();
                                            return 0;
                                        }
                                        if (i48 == 0) {
                                            rjb.p();
                                            return 0;
                                        }
                                        i36 = i29;
                                        if (i36 != i29) {
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        i23 = i45;
                                        i30 = i44;
                                        i31 = i41;
                                        if (i48 == 2) {
                                            d = n3f.d(bArr, i30, d5eVar3, nl6Var);
                                            i41 = i31;
                                            i36 = d;
                                            i29 = i30;
                                            if (i36 != i29) {
                                            }
                                        } else {
                                            if (i48 == 0) {
                                                i41 = i31;
                                                i29 = i30;
                                                i36 = n3f.h(i31, bArr, i30, i2, d5eVar3, nl6Var);
                                                if (i36 != i29) {
                                                }
                                            }
                                            i41 = i31;
                                            i29 = i30;
                                            i36 = i29;
                                            if (i36 != i29) {
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i31 = i41;
                                        i30 = i44;
                                        i23 = i45;
                                        if (i48 == 2) {
                                            rjb.p();
                                            return 0;
                                        }
                                        if (i48 == 1) {
                                            rjb.p();
                                            return 0;
                                        }
                                        i41 = i31;
                                        i29 = i30;
                                        i36 = i29;
                                        if (i36 != i29) {
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        i23 = i45;
                                        i30 = i44;
                                        i31 = i41;
                                        if (i48 == 2) {
                                            k4e k4eVar = (k4e) d5eVar3;
                                            f3 = n3f.f(bArr, i30, nl6Var);
                                            int i80 = nl6Var.b;
                                            int i81 = f3 + i80;
                                            if (i81 > bArr.length) {
                                                i2d.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            int i82 = (i80 / 4) + k4eVar.c;
                                            int length2 = k4eVar.b.length;
                                            if (i82 > length2) {
                                                if (length2 != 0) {
                                                    while (length2 < i82) {
                                                        length2 = Math.max(((length2 * 3) / 2) + 1, 10);
                                                    }
                                                    k4eVar.b = Arrays.copyOf(k4eVar.b, length2);
                                                } else {
                                                    k4eVar.b = new int[Math.max(i82, 10)];
                                                }
                                            }
                                            while (f3 < i81) {
                                                k4eVar.j(n3f.b(bArr, f3));
                                                f3 += 4;
                                            }
                                            if (f3 != i81) {
                                                i2d.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            i41 = i31;
                                            i36 = f3;
                                            i29 = i30;
                                            if (i36 != i29) {
                                            }
                                        } else {
                                            if (i48 == 5) {
                                                d = i30 + 4;
                                                k4e k4eVar2 = (k4e) d5eVar3;
                                                k4eVar2.j(n3f.b(bArr, i30));
                                                while (d < i2) {
                                                    int f8 = n3f.f(bArr, d, nl6Var);
                                                    if (i31 == nl6Var.b) {
                                                        k4eVar2.j(n3f.b(bArr, f8));
                                                        d = f8 + 4;
                                                    } else {
                                                        i41 = i31;
                                                        i36 = d;
                                                        i29 = i30;
                                                        if (i36 != i29) {
                                                        }
                                                    }
                                                }
                                                i41 = i31;
                                                i36 = d;
                                                i29 = i30;
                                                if (i36 != i29) {
                                                }
                                            }
                                            i41 = i31;
                                            i29 = i30;
                                            i36 = i29;
                                            if (i36 != i29) {
                                            }
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        i31 = i41;
                                        i30 = i44;
                                        i23 = i45;
                                        if (i48 == 2) {
                                            rjb.p();
                                            return 0;
                                        }
                                        if (i48 == 0) {
                                            rjb.p();
                                            return 0;
                                        }
                                        i41 = i31;
                                        i29 = i30;
                                        i36 = i29;
                                        if (i36 != i29) {
                                        }
                                        break;
                                    case 26:
                                        i23 = i45;
                                        i30 = i44;
                                        i31 = i41;
                                        if (i48 == 2) {
                                            if ((j8 & 536870912) == 0) {
                                                f4 = n3f.f(bArr, i30, nl6Var);
                                                int i83 = nl6Var.b;
                                                if (i83 < 0) {
                                                    i2d.g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return 0;
                                                }
                                                if (i83 == 0) {
                                                    d5eVar3.add("");
                                                } else {
                                                    d5eVar3.add(new String(bArr, f4, i83, k5e.a));
                                                    f4 += i83;
                                                }
                                                while (f4 < i2) {
                                                    int f9 = n3f.f(bArr, f4, nl6Var);
                                                    if (i31 == nl6Var.b) {
                                                        f4 = n3f.f(bArr, f9, nl6Var);
                                                        int i84 = nl6Var.b;
                                                        if (i84 < 0) {
                                                            i2d.g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            return 0;
                                                        }
                                                        if (i84 == 0) {
                                                            d5eVar3.add("");
                                                        } else {
                                                            d5eVar3.add(new String(bArr, f4, i84, k5e.a));
                                                            f4 += i84;
                                                        }
                                                    }
                                                }
                                            } else {
                                                f4 = n3f.f(bArr, i30, nl6Var);
                                                int i85 = nl6Var.b;
                                                if (i85 < 0) {
                                                    i2d.g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return 0;
                                                }
                                                if (i85 == 0) {
                                                    d5eVar3.add("");
                                                } else {
                                                    int i86 = f4 + i85;
                                                    if (!die.d(f4, i86, bArr)) {
                                                        i2d.g("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    d5eVar3.add(new String(bArr, f4, i85, k5e.a));
                                                    f4 = i86;
                                                }
                                                while (f4 < i2) {
                                                    int f10 = n3f.f(bArr, f4, nl6Var);
                                                    if (i31 == nl6Var.b) {
                                                        f4 = n3f.f(bArr, f10, nl6Var);
                                                        int i87 = nl6Var.b;
                                                        if (i87 < 0) {
                                                            i2d.g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            return 0;
                                                        }
                                                        if (i87 == 0) {
                                                            d5eVar3.add("");
                                                        } else {
                                                            int i88 = f4 + i87;
                                                            if (!die.d(f4, i88, bArr)) {
                                                                i2d.g("Protocol message had invalid UTF-8.");
                                                                return 0;
                                                            }
                                                            d5eVar3.add(new String(bArr, f4, i87, k5e.a));
                                                            f4 = i88;
                                                        }
                                                    }
                                                }
                                            }
                                            i41 = i31;
                                            i36 = f4;
                                            i29 = i30;
                                            if (i36 != i29) {
                                            }
                                        }
                                        i41 = i31;
                                        i29 = i30;
                                        i36 = i29;
                                        if (i36 != i29) {
                                        }
                                        break;
                                    case 27:
                                        i30 = i44;
                                        i23 = i45;
                                        if (i48 == 2) {
                                            int c = n3f.c(mbeVar.v(q), i41, bArr, i30, i2, d5eVar3, nl6Var);
                                            i41 = i41;
                                            i36 = c;
                                            i29 = i30;
                                            if (i36 != i29) {
                                            }
                                        } else {
                                            i31 = i41;
                                            i41 = i31;
                                            i29 = i30;
                                            i36 = i29;
                                            if (i36 != i29) {
                                            }
                                        }
                                        break;
                                    case 28:
                                        i30 = i44;
                                        i23 = i45;
                                        if (i48 == 2) {
                                            f3 = n3f.f(bArr, i30, nl6Var);
                                            int i89 = nl6Var.b;
                                            if (i89 < 0) {
                                                i2d.g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                return 0;
                                            }
                                            if (i89 > bArr.length - f3) {
                                                i2d.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            if (i89 == 0) {
                                                d5eVar3.add(cxd.c);
                                            } else {
                                                d5eVar3.add(cxd.l(f3, i89, bArr));
                                                f3 += i89;
                                            }
                                            while (f3 < i2) {
                                                int f11 = n3f.f(bArr, f3, nl6Var);
                                                if (i41 == nl6Var.b) {
                                                    f3 = n3f.f(bArr, f11, nl6Var);
                                                    int i90 = nl6Var.b;
                                                    if (i90 < 0) {
                                                        i2d.g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        return 0;
                                                    }
                                                    if (i90 > bArr.length - f3) {
                                                        i2d.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        return 0;
                                                    }
                                                    if (i90 == 0) {
                                                        d5eVar3.add(cxd.c);
                                                    } else {
                                                        d5eVar3.add(cxd.l(f3, i90, bArr));
                                                        f3 += i90;
                                                    }
                                                } else {
                                                    i41 = i41;
                                                    i36 = f3;
                                                    i29 = i30;
                                                    if (i36 != i29) {
                                                    }
                                                }
                                            }
                                            i41 = i41;
                                            i36 = f3;
                                            i29 = i30;
                                            if (i36 != i29) {
                                            }
                                        } else {
                                            i41 = i41;
                                            i29 = i30;
                                            i36 = i29;
                                            if (i36 != i29) {
                                            }
                                        }
                                        break;
                                    case nm7.S /* 30 */:
                                    case 44:
                                        i41 = i41;
                                        i29 = i44;
                                        if (i48 == 2) {
                                            h = n3f.d(bArr, i29, d5eVar3, nl6Var);
                                            i30 = i29;
                                            i32 = i41;
                                            d5eVar = d5eVar3;
                                        } else {
                                            if (i48 == 0) {
                                                h = n3f.h(i41, bArr, i29, i2, d5eVar3, nl6Var);
                                                i30 = i29;
                                                d5eVar = d5eVar3;
                                                i32 = i41;
                                            }
                                            i23 = i45;
                                            i36 = i29;
                                            if (i36 != i29) {
                                            }
                                        }
                                        btd u3 = mbeVar.u(q);
                                        a8d a8dVar = qde.a;
                                        if (u3 != null) {
                                            int size = d5eVar.size();
                                            jge jgeVar5 = null;
                                            i33 = h;
                                            i23 = i45;
                                            int i91 = 0;
                                            int i92 = 0;
                                            while (i91 < size) {
                                                jge jgeVar6 = jgeVar5;
                                                Integer num = (Integer) d5eVar.get(i91);
                                                int intValue = num.intValue();
                                                if (u3.a(intValue)) {
                                                    if (i91 != i92) {
                                                        d5eVar.set(i92, num);
                                                    }
                                                    i92++;
                                                    btdVar = u3;
                                                    jgeVar5 = jgeVar6;
                                                    i34 = i91;
                                                } else {
                                                    if (jgeVar6 == null) {
                                                        mbeVar.i.getClass();
                                                        f4e f4eVar3 = (f4e) obj;
                                                        btdVar = u3;
                                                        jge jgeVar7 = f4eVar3.zzc;
                                                        if (jgeVar7 == jgeVar2) {
                                                            jgeVar7 = jge.b();
                                                            f4eVar3.zzc = jgeVar7;
                                                        }
                                                        jgeVar5 = jgeVar7;
                                                    } else {
                                                        btdVar = u3;
                                                        jgeVar5 = jgeVar6;
                                                    }
                                                    i34 = i91;
                                                    jgeVar5.c(i23 << 3, Long.valueOf(intValue));
                                                }
                                                i91 = i34 + 1;
                                                u3 = btdVar;
                                            }
                                            if (i92 != size) {
                                                d5eVar.subList(i92, size).clear();
                                            }
                                        } else {
                                            i33 = h;
                                            i23 = i45;
                                        }
                                        i36 = i33;
                                        i41 = i32;
                                        i29 = i30;
                                        if (i36 != i29) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i41 = i41;
                                        i29 = i44;
                                        if (i48 == 2) {
                                            k4e k4eVar3 = (k4e) d5eVar3;
                                            i36 = n3f.f(bArr, i29, nl6Var);
                                            int i93 = nl6Var.b + i36;
                                            while (i36 < i93) {
                                                int f12 = n3f.f(bArr, i36, nl6Var);
                                                int i94 = nl6Var.b;
                                                k4eVar3.j((i94 >>> 1) ^ (-(i94 & 1)));
                                                i36 = f12;
                                            }
                                            if (i36 != i93) {
                                                i2d.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                        } else {
                                            if (i48 == 0) {
                                                k4e k4eVar4 = (k4e) d5eVar3;
                                                i36 = n3f.f(bArr, i29, nl6Var);
                                                int i95 = nl6Var.b;
                                                k4eVar4.j((i95 >>> 1) ^ (-(i95 & 1)));
                                                while (i36 < i2) {
                                                    int f13 = n3f.f(bArr, i36, nl6Var);
                                                    if (i41 == nl6Var.b) {
                                                        i36 = n3f.f(bArr, f13, nl6Var);
                                                        int i96 = nl6Var.b;
                                                        k4eVar4.j((i96 >>> 1) ^ (-(i96 & 1)));
                                                    }
                                                }
                                            }
                                            i23 = i45;
                                            i36 = i29;
                                            if (i36 != i29) {
                                            }
                                        }
                                        i23 = i45;
                                        if (i36 != i29) {
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        i41 = i41;
                                        if (i48 == 2) {
                                            rjb.p();
                                            return 0;
                                        }
                                        if (i48 == 0) {
                                            rjb.p();
                                            return 0;
                                        }
                                        i29 = i44;
                                        i23 = i45;
                                        i36 = i29;
                                        if (i36 != i29) {
                                        }
                                        break;
                                    default:
                                        if (i48 == 3) {
                                            int i97 = (i41 & (-8)) | 4;
                                            cde v = mbeVar.v(q);
                                            f4e zze = v.zze();
                                            int i98 = i44;
                                            i41 = i41;
                                            int j9 = n3f.j(zze, v, bArr, i98, i2, i97, nl6Var);
                                            int i99 = i97;
                                            nl6 nl6Var9 = nl6Var;
                                            v.zzf(zze);
                                            nl6Var9.d = zze;
                                            d5eVar3.add(zze);
                                            while (true) {
                                                if (j9 < i2) {
                                                    int i100 = i98;
                                                    int f14 = n3f.f(bArr, j9, nl6Var9);
                                                    if (i41 == nl6Var9.b) {
                                                        int i101 = i99;
                                                        f4e zze2 = v.zze();
                                                        j9 = n3f.j(zze2, v, bArr, f14, i2, i101, nl6Var);
                                                        i99 = i101;
                                                        nl6Var9 = nl6Var;
                                                        v.zzf(zze2);
                                                        nl6Var9.d = zze2;
                                                        d5eVar3.add(zze2);
                                                        i98 = i100;
                                                    } else {
                                                        i98 = i100;
                                                    }
                                                }
                                            }
                                            i29 = i98;
                                            i23 = i45;
                                            i36 = j9;
                                            if (i36 != i29) {
                                            }
                                        } else {
                                            i41 = i41;
                                            i29 = i44;
                                            i23 = i45;
                                            i36 = i29;
                                            if (i36 != i29) {
                                            }
                                        }
                                        break;
                                }
                            }
                            i39 = i6;
                            i40 = i7;
                        } else if (i48 == 2) {
                            d5e d5eVar4 = (d5e) unsafe.getObject(obj5, j2);
                            if (!((eud) d5eVar4).a) {
                                int size2 = d5eVar4.size();
                                d5eVar4 = d5eVar4.zzd(size2 == 0 ? 10 : size2 << 1);
                                unsafe.putObject(obj5, j2, d5eVar4);
                            }
                            bArr6 = bArr;
                            i35 = i2;
                            i36 = n3f.c(mbeVar.v(q), i41, bArr6, i44, i35, d5eVar4, nl6Var);
                            nl6Var7 = nl6Var;
                            i38 = q;
                            i37 = i45;
                            i40 = i7;
                            i41 = i41;
                            obj5 = obj5;
                            i39 = i6;
                        } else {
                            obj2 = obj5;
                            iArr = iArr2;
                            i22 = i44;
                            i23 = i45;
                            i41 = i41;
                            bArr2 = bArr;
                            i4 = i3;
                            nl6Var2 = nl6Var;
                            i9 = i22;
                        }
                        i38 = q;
                        jgeVar = jgeVar2;
                        i10 = i41;
                        i8 = i23;
                    }
                }
                if (i10 != i4 || i4 == 0) {
                    f4e f4eVar4 = (f4e) obj2;
                    jge jgeVar8 = f4eVar4.zzc;
                    if (jgeVar8 == jgeVar) {
                        jgeVar8 = jge.b();
                        f4eVar4.zzc = jgeVar8;
                    }
                    mbeVar = this;
                    nl6Var7 = nl6Var;
                    i41 = i10;
                    i36 = n3f.e(i10, bArr2, i9, i2, jgeVar8, nl6Var2);
                    i35 = i2;
                    obj5 = obj2;
                    i37 = i8;
                    i39 = i6;
                    i40 = i7;
                    bArr6 = bArr;
                } else {
                    i35 = i2;
                    i41 = i10;
                    i36 = i9;
                    i5 = i6;
                    i40 = i7;
                }
            } else {
                i4 = i3;
                int i102 = i39;
                unsafe = unsafe5;
                iArr = iArr2;
                obj2 = obj5;
                i5 = i102;
            }
        }
    }

    public final int q(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final int s(int i) {
        return this.a[i + 1];
    }

    public final btd u(int i) {
        return (btd) this.b[((i / 3) << 1) + 1];
    }

    public final cde v(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.b;
        cde cdeVar = (cde) objArr[i2];
        if (cdeVar != null) {
            return cdeVar;
        }
        cde a = kce.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final Object w(int i) {
        return this.b[(i / 3) << 1];
    }

    public final Object x(int i, Object obj) {
        cde v = v(i);
        int s = s(i) & 1048575;
        if (!k(i, obj)) {
            return v.zze();
        }
        Object object = k.getObject(obj, s);
        if (m(object)) {
            return object;
        }
        f4e zze = v.zze();
        if (object != null) {
            v.zzg(zze, object);
        }
        return zze;
    }

    public final Object y(int i, int i2, Object obj) {
        cde v = v(i2);
        if (!n(i, i2, obj)) {
            return v.zze();
        }
        Object object = k.getObject(obj, s(i2) & 1048575);
        if (m(object)) {
            return object;
        }
        f4e zze = v.zze();
        if (object != null) {
            v.zzg(zze, object);
        }
        return zze;
    }

    @Override // cde
    public final f4e zze() {
        return (f4e) ((f4e) this.e).d(4);
    }

    @Override // cde
    public final void zzf(Object obj) {
        if (!m(obj)) {
            return;
        }
        if (obj instanceof f4e) {
            f4e f4eVar = (f4e) obj;
            f4eVar.l();
            f4eVar.zza = 0;
            f4eVar.j();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                this.i.getClass();
                jge jgeVar = ((f4e) obj).zzc;
                if (jgeVar.e) {
                    jgeVar.e = false;
                    return;
                }
                return;
            }
            int s = s(i);
            int i2 = 1048575 & s;
            int r = r(s);
            long j2 = i2;
            Unsafe unsafe = k;
            if (r != 9) {
                if (r != 60 && r != 68) {
                    switch (r) {
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
                        case nm7.S /* 30 */:
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
                            eud eudVar = (eud) ((d5e) ohe.g(obj, j2));
                            if (!eudVar.a) {
                                break;
                            } else {
                                eudVar.a = false;
                                break;
                            }
                        case 50:
                            Object object = unsafe.getObject(obj, j2);
                            if (object == null) {
                                break;
                            } else {
                                ((s9e) object).a = false;
                                unsafe.putObject(obj, j2, object);
                                break;
                            }
                    }
                } else if (n(iArr[i], i, obj)) {
                    v(i).zzf(unsafe.getObject(obj, j2));
                }
                i += 3;
            }
            if (k(i, obj)) {
                v(i).zzf(unsafe.getObject(obj, j2));
            }
            i += 3;
        }
    }

    @Override // cde
    public final void zzg(Object obj, Object obj2) {
        Object obj3;
        if (!m(obj)) {
            u36.j("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                qde.o(obj, obj2);
                return;
            }
            int s = s(i);
            int i2 = s & 1048575;
            int r = r(s);
            int i3 = iArr[i];
            long j2 = i2;
            switch (r) {
                case 0:
                    obj3 = obj;
                    if (!k(i, obj2)) {
                        break;
                    } else {
                        c8c c8cVar = ohe.c;
                        c8cVar.v(obj3, j2, c8cVar.k(obj2, j2));
                        i(i, obj3);
                        continue;
                    }
                case 1:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        c8c c8cVar2 = ohe.c;
                        c8cVar2.w(obj3, j2, c8cVar2.p(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        ohe.c.a.putLong(obj3, j2, ohe.f(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        ohe.c.a.putLong(obj3, j2, ohe.f(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        ohe.h(obj3, j2, ohe.e(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        ohe.c.a.putLong(obj3, j2, ohe.f(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        ohe.h(obj3, j2, ohe.e(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        c8c c8cVar3 = ohe.c;
                        c8cVar3.s(obj3, j2, c8cVar3.x(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        ohe.i(obj3, j2, ohe.g(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    obj3 = obj;
                    g(i, obj3, obj2);
                    continue;
                case 10:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        ohe.i(obj3, j2, ohe.g(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        ohe.h(obj3, j2, ohe.e(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        ohe.h(obj3, j2, ohe.e(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        ohe.h(obj3, j2, ohe.e(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        ohe.c.a.putLong(obj3, j2, ohe.f(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        ohe.h(obj3, j2, ohe.e(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (k(i, obj2)) {
                        obj3 = obj;
                        ohe.c.a.putLong(obj3, j2, ohe.f(obj2, j2));
                        i(i, obj3);
                        break;
                    }
                    break;
                case 17:
                    g(i, obj, obj2);
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
                case nm7.S /* 30 */:
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
                    d5e d5eVar = (d5e) ohe.g(obj, j2);
                    d5e d5eVar2 = (d5e) ohe.g(obj2, j2);
                    int size = d5eVar.size();
                    int size2 = d5eVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((eud) d5eVar).a) {
                            d5eVar = d5eVar.zzd(size2 + size);
                        }
                        d5eVar.addAll(d5eVar2);
                    }
                    if (size > 0) {
                        d5eVar2 = d5eVar;
                    }
                    ohe.i(obj, j2, d5eVar2);
                    break;
                case 50:
                    a8d a8dVar = qde.a;
                    ohe.i(obj, j2, ied.a(ohe.g(obj, j2), ohe.g(obj2, j2)));
                    break;
                case nm7.n0 /* 51 */:
                case nm7.o0 /* 52 */:
                case nm7.p0 /* 53 */:
                case nm7.q0 /* 54 */:
                case nm7.r0 /* 55 */:
                case 56:
                case nm7.t0 /* 57 */:
                case nm7.u0 /* 58 */:
                case nm7.v0 /* 59 */:
                    if (n(i3, i, obj2)) {
                        ohe.i(obj, j2, ohe.g(obj2, j2));
                        ohe.h(obj, iArr[i + 2] & 1048575, i3);
                        break;
                    }
                    break;
                case nm7.w0 /* 60 */:
                    h(i, obj, obj2);
                    break;
                case nm7.x0 /* 61 */:
                case nm7.y0 /* 62 */:
                case nm7.z0 /* 63 */:
                case 64:
                case 65:
                case nm7.C0 /* 66 */:
                case nm7.D0 /* 67 */:
                    if (n(i3, i, obj2)) {
                        ohe.i(obj, j2, ohe.g(obj2, j2));
                        ohe.h(obj, iArr[i + 2] & 1048575, i3);
                        break;
                    }
                    break;
                case nm7.E0 /* 68 */:
                    h(i, obj, obj2);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
    }
}
