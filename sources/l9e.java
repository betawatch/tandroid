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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class l9e implements bbe {
    public static final int[] j = new int[0];
    public static final Unsafe k;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final rrd e;
    public final int[] f;
    public final int g;
    public final int h;
    public final y5d i;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new q2((byte) 4));
        } catch (Throwable unused) {
            unsafe = null;
        }
        k = unsafe;
    }

    public l9e(int[] iArr, Object[] objArr, int i, int i2, rrd rrdVar, int[] iArr2, int i3, int i4, y5d y5dVar, gcd gcdVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = iArr2;
        this.g = i3;
        this.h = i4;
        this.i = y5dVar;
        this.e = rrdVar;
    }

    public static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof c2e) {
            return ((c2e) obj).m();
        }
        return true;
    }

    public static int p(Object obj, long j2) {
        return ((Integer) nfe.g(obj, j2)).intValue();
    }

    public static int r(int i) {
        return (i >>> 20) & kk7.d4;
    }

    public static long t(Object obj, long j2) {
        return ((Long) nfe.g(obj, j2)).longValue();
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
            StringBuilder l = yjb.l("Field ", str, " for ", name, " not found. Known fields are ");
            l.append(arrays);
            throw new RuntimeException(l.toString(), e);
        }
    }

    @Override // bbe
    public final void a(Object obj, byte[] bArr, int i, int i2, kj6 kj6Var) {
        o(obj, bArr, i, i2, 0, kj6Var);
    }

    @Override // bbe
    public final boolean b(c2e c2eVar, c2e c2eVar2) {
        boolean e;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int s = s(i);
                long j2 = s & 1048575;
                switch (r(s)) {
                    case 0:
                        if (!j(c2eVar, c2eVar2, i)) {
                            break;
                        } else {
                            c6c c6cVar = nfe.c;
                            if (Double.doubleToLongBits(c6cVar.k(c2eVar, j2)) != Double.doubleToLongBits(c6cVar.k(c2eVar2, j2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 1:
                        if (!j(c2eVar, c2eVar2, i)) {
                            break;
                        } else {
                            c6c c6cVar2 = nfe.c;
                            if (Float.floatToIntBits(c6cVar2.p(c2eVar, j2)) != Float.floatToIntBits(c6cVar2.p(c2eVar2, j2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 2:
                        if (j(c2eVar, c2eVar2, i) && nfe.f(c2eVar, j2) == nfe.f(c2eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (j(c2eVar, c2eVar2, i) && nfe.f(c2eVar, j2) == nfe.f(c2eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (j(c2eVar, c2eVar2, i) && nfe.e(c2eVar, j2) == nfe.e(c2eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (j(c2eVar, c2eVar2, i) && nfe.f(c2eVar, j2) == nfe.f(c2eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (j(c2eVar, c2eVar2, i) && nfe.e(c2eVar, j2) == nfe.e(c2eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (!j(c2eVar, c2eVar2, i)) {
                            break;
                        } else {
                            c6c c6cVar3 = nfe.c;
                            if (c6cVar3.x(c2eVar, j2) != c6cVar3.x(c2eVar2, j2)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (j(c2eVar, c2eVar2, i) && pbe.e(nfe.g(c2eVar, j2), nfe.g(c2eVar2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (j(c2eVar, c2eVar2, i) && pbe.e(nfe.g(c2eVar, j2), nfe.g(c2eVar2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (j(c2eVar, c2eVar2, i) && pbe.e(nfe.g(c2eVar, j2), nfe.g(c2eVar2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (j(c2eVar, c2eVar2, i) && nfe.e(c2eVar, j2) == nfe.e(c2eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (j(c2eVar, c2eVar2, i) && nfe.e(c2eVar, j2) == nfe.e(c2eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (j(c2eVar, c2eVar2, i) && nfe.e(c2eVar, j2) == nfe.e(c2eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (j(c2eVar, c2eVar2, i) && nfe.f(c2eVar, j2) == nfe.f(c2eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (j(c2eVar, c2eVar2, i) && nfe.e(c2eVar, j2) == nfe.e(c2eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (j(c2eVar, c2eVar2, i) && nfe.f(c2eVar, j2) == nfe.f(c2eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (j(c2eVar, c2eVar2, i) && pbe.e(nfe.g(c2eVar, j2), nfe.g(c2eVar2, j2))) {
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
                        e = pbe.e(nfe.g(c2eVar, j2), nfe.g(c2eVar2, j2));
                        break;
                    case 50:
                        e = pbe.e(nfe.g(c2eVar, j2), nfe.g(c2eVar2, j2));
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
                        long j3 = iArr[i + 2] & 1048575;
                        if (nfe.e(c2eVar, j3) == nfe.e(c2eVar2, j3) && pbe.e(nfe.g(c2eVar, j2), nfe.g(c2eVar2, j2))) {
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
            } else if (c2eVar.zzc.equals(c2eVar2.zzc)) {
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
    @Override // bbe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(c2e c2eVar) {
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
                return c2eVar.zzc.hashCode() + (i6 * 53);
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
                    doubleToLongBits = Double.doubleToLongBits(nfe.c.k(c2eVar, j2));
                    Charset charset = h3e.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i6 * 53;
                    floatToIntBits = Float.floatToIntBits(nfe.c.p(c2eVar, j2));
                    i6 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i6 * 53;
                    doubleToLongBits = nfe.f(c2eVar, j2);
                    Charset charset2 = h3e.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i6 * 53;
                    doubleToLongBits = nfe.f(c2eVar, j2);
                    Charset charset3 = h3e.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i6 * 53;
                    floatToIntBits = nfe.e(c2eVar, j2);
                    i6 = floatToIntBits + i2;
                    break;
                case 5:
                    i = i6 * 53;
                    doubleToLongBits = nfe.f(c2eVar, j2);
                    Charset charset4 = h3e.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i6 * 53;
                    floatToIntBits = nfe.e(c2eVar, j2);
                    i6 = floatToIntBits + i2;
                    break;
                case 7:
                    i3 = i6 * 53;
                    boolean x = nfe.c.x(c2eVar, j2);
                    Charset charset5 = h3e.a;
                    break;
                case 8:
                    i2 = i6 * 53;
                    floatToIntBits = ((String) nfe.g(c2eVar, j2)).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object g = nfe.g(c2eVar, j2);
                    if (g != null) {
                        i10 = g.hashCode();
                    }
                    i6 = i4 + i10;
                    break;
                case 10:
                    i2 = i6 * 53;
                    floatToIntBits = nfe.g(c2eVar, j2).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 11:
                    i2 = i6 * 53;
                    floatToIntBits = nfe.e(c2eVar, j2);
                    i6 = floatToIntBits + i2;
                    break;
                case 12:
                    i2 = i6 * 53;
                    floatToIntBits = nfe.e(c2eVar, j2);
                    i6 = floatToIntBits + i2;
                    break;
                case 13:
                    i2 = i6 * 53;
                    floatToIntBits = nfe.e(c2eVar, j2);
                    i6 = floatToIntBits + i2;
                    break;
                case 14:
                    i = i6 * 53;
                    doubleToLongBits = nfe.f(c2eVar, j2);
                    Charset charset6 = h3e.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i6 * 53;
                    floatToIntBits = nfe.e(c2eVar, j2);
                    i6 = floatToIntBits + i2;
                    break;
                case 16:
                    i = i6 * 53;
                    doubleToLongBits = nfe.f(c2eVar, j2);
                    Charset charset7 = h3e.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i4 = i6 * 53;
                    Object g2 = nfe.g(c2eVar, j2);
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
                    i2 = i6 * 53;
                    floatToIntBits = nfe.g(c2eVar, j2).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 50:
                    i2 = i6 * 53;
                    floatToIntBits = nfe.g(c2eVar, j2).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case kk7.n0 /* 51 */:
                    if (!n(i8, i5, c2eVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) nfe.g(c2eVar, j2)).doubleValue());
                        Charset charset8 = h3e.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case kk7.o0 /* 52 */:
                    if (!n(i8, i5, c2eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) nfe.g(c2eVar, j2)).floatValue());
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case kk7.p0 /* 53 */:
                    if (!n(i8, i5, c2eVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = t(c2eVar, j2);
                        Charset charset9 = h3e.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case kk7.q0 /* 54 */:
                    if (!n(i8, i5, c2eVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = t(c2eVar, j2);
                        Charset charset10 = h3e.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case kk7.r0 /* 55 */:
                    if (!n(i8, i5, c2eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = p(c2eVar, j2);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 56:
                    if (!n(i8, i5, c2eVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = t(c2eVar, j2);
                        Charset charset11 = h3e.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case kk7.t0 /* 57 */:
                    if (!n(i8, i5, c2eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = p(c2eVar, j2);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case kk7.u0 /* 58 */:
                    if (!n(i8, i5, c2eVar)) {
                        break;
                    } else {
                        i3 = i6 * 53;
                        boolean booleanValue = ((Boolean) nfe.g(c2eVar, j2)).booleanValue();
                        Charset charset12 = h3e.a;
                        break;
                    }
                case kk7.v0 /* 59 */:
                    if (!n(i8, i5, c2eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = ((String) nfe.g(c2eVar, j2)).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case kk7.w0 /* 60 */:
                    if (!n(i8, i5, c2eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = nfe.g(c2eVar, j2).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case kk7.x0 /* 61 */:
                    if (!n(i8, i5, c2eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = nfe.g(c2eVar, j2).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case kk7.y0 /* 62 */:
                    if (!n(i8, i5, c2eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = p(c2eVar, j2);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case kk7.z0 /* 63 */:
                    if (!n(i8, i5, c2eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = p(c2eVar, j2);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 64:
                    if (!n(i8, i5, c2eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = p(c2eVar, j2);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 65:
                    if (!n(i8, i5, c2eVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = t(c2eVar, j2);
                        Charset charset13 = h3e.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case kk7.C0 /* 66 */:
                    if (!n(i8, i5, c2eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = p(c2eVar, j2);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case kk7.D0 /* 67 */:
                    if (!n(i8, i5, c2eVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = t(c2eVar, j2);
                        Charset charset14 = h3e.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case kk7.E0 /* 68 */:
                    if (!n(i8, i5, c2eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = nfe.g(c2eVar, j2).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
            }
            i5 += 3;
        }
    }

    @Override // bbe
    public final boolean d(Object obj) {
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
                    if (l(obj, i2, i, i3, i11) && !v(i2).d(nfe.g(obj, s & 1048575))) {
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                } else {
                    if (r != 27) {
                        if (r == 60 || r == 68) {
                            if (n(i8, i2, obj) && !v(i2).d(nfe.g(obj, s & 1048575))) {
                            }
                        } else if (r != 49) {
                            if (r == 50 && !((r7e) nfe.g(obj, s & 1048575)).isEmpty()) {
                                w(i2).getClass();
                                fyb.g();
                                return false;
                            }
                        }
                        i5++;
                        i6 = i;
                        i4 = i3;
                    }
                    List list = (List) nfe.g(obj, s & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        bbe v = v(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (v.d(list.get(i13))) {
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
    
        r8 = yjb.g(r11 << 3, 8, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x057d, code lost:
    
        if (r0.l(r1, r2, r3, r4, r5) != false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x067d, code lost:
    
        r8 = yjb.g(r11 << 3, 4, r8);
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
    @Override // bbe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(c2e c2eVar) {
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
        l9e l9eVar = this;
        c2e c2eVar2 = c2eVar;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = l9eVar.a;
            if (i7 >= iArr.length) {
                return c2eVar2.zzc.a() + i9;
            }
            int s = l9eVar.s(i7);
            int r = r(s);
            int i10 = iArr[i7];
            int i11 = iArr[i7 + 2];
            int i12 = i11 & i5;
            Unsafe unsafe = k;
            if (r <= 17) {
                if (i12 != i6) {
                    i8 = i12 == i5 ? 0 : unsafe.getInt(c2eVar2, i12);
                    i6 = i12;
                }
                i = 1 << (i11 >>> 20);
            } else {
                i = 0;
            }
            int i13 = s & i5;
            if (r >= dzd.b.a) {
                byte b12 = dzd.c.a;
            }
            long j4 = i13;
            switch (r) {
                case 0:
                    if (!l9eVar.l(c2eVar2, i7, i6, i8, i)) {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                    i9 = yjb.g(i10 << 3, 8, i9);
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case 1:
                    break;
                case 2:
                    if (l9eVar.l(c2eVar2, i7, i6, i8, i)) {
                        long j5 = unsafe.getLong(c2eVar2, j4);
                        b = cwd.b(i10 << 3);
                        c = cwd.c(j5);
                        i3 = c + b;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case 3:
                    if (l9eVar.l(c2eVar2, i7, i6, i8, i)) {
                        long j6 = unsafe.getLong(c2eVar2, j4);
                        b = cwd.b(i10 << 3);
                        c = cwd.c(j6);
                        i3 = c + b;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case 4:
                    if (l9eVar.l(c2eVar2, i7, i6, i8, i)) {
                        long j7 = unsafe.getInt(c2eVar2, j4);
                        b = cwd.b(i10 << 3);
                        c = cwd.c(j7);
                        i3 = c + b;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    if (l9eVar.l(c2eVar2, i7, i6, i8, i)) {
                        i9 = yjb.g(i10 << 3, 1, i9);
                    }
                    c2eVar2 = c2eVar;
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case 8:
                    if (l9eVar.l(c2eVar2, i7, i6, i8, i)) {
                        int i14 = i10 << 3;
                        Object object = unsafe.getObject(c2eVar2, j4);
                        if (object instanceof zud) {
                            b2 = cwd.b(i14);
                            j2 = ((zud) object).j();
                            i9 = yjb.h(j2, j2, b2, i9);
                        } else {
                            i9 += cwd.a((String) object) + cwd.b(i14);
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case 9:
                    if (l9eVar.l(c2eVar2, i7, i6, i8, i)) {
                        Object object2 = unsafe.getObject(c2eVar2, j4);
                        bbe v = l9eVar.v(i7);
                        y5d y5dVar = pbe.a;
                        b3 = cwd.b(i10 << 3);
                        b4 = ((rrd) object2).b(v);
                        i9 = yjb.h(b4, b4, b3, i9);
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case 10:
                    if (l9eVar.l(c2eVar2, i7, i6, i8, i)) {
                        zud zudVar = (zud) unsafe.getObject(c2eVar2, j4);
                        b2 = cwd.b(i10 << 3);
                        j2 = zudVar.j();
                        i9 = yjb.h(j2, j2, b2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case 11:
                    if (l9eVar.l(c2eVar2, i7, i6, i8, i)) {
                        i9 = yjb.g(unsafe.getInt(c2eVar2, j4), cwd.b(i10 << 3), i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case 12:
                    if (l9eVar.l(c2eVar2, i7, i6, i8, i)) {
                        long j8 = unsafe.getInt(c2eVar2, j4);
                        b = cwd.b(i10 << 3);
                        c = cwd.c(j8);
                        i3 = c + b;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    if (l9eVar.l(c2eVar2, i7, i6, i8, i)) {
                        int i15 = unsafe.getInt(c2eVar2, j4);
                        b5 = cwd.b(i10 << 3);
                        i2 = (i15 << 1) ^ (i15 >> 31);
                        i9 = yjb.g(i2, b5, i9);
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case 16:
                    if (l9eVar.l(c2eVar2, i7, i6, i8, i)) {
                        long j9 = unsafe.getLong(c2eVar2, j4);
                        b = cwd.b(i10 << 3);
                        c = cwd.c((j9 << 1) ^ (j9 >> 63));
                        i3 = c + b;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case 17:
                    if (l9eVar.l(c2eVar2, i7, i6, i8, i)) {
                        i3 = cwd.r(i10, (rrd) unsafe.getObject(c2eVar2, j4), l9eVar.v(i7));
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case 18:
                    i3 = pbe.h(i10, (List) unsafe.getObject(c2eVar2, j4));
                    i9 += i3;
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case 19:
                    i3 = pbe.g(i10, (List) unsafe.getObject(c2eVar2, j4));
                    i9 += i3;
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case 20:
                    List list = (List) unsafe.getObject(c2eVar2, j4);
                    y5d y5dVar2 = pbe.a;
                    if (list.size() != 0) {
                        b6 = (cwd.b(i10 << 3) * list.size()) + pbe.j(list);
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case 21:
                    List list2 = (List) unsafe.getObject(c2eVar2, j4);
                    y5d y5dVar3 = pbe.a;
                    size = list2.size();
                    if (size != 0) {
                        n = pbe.n(list2);
                        b7 = cwd.b(i10 << 3);
                        b6 = (b7 * size) + n;
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case 22:
                    List list3 = (List) unsafe.getObject(c2eVar2, j4);
                    y5d y5dVar4 = pbe.a;
                    size = list3.size();
                    if (size != 0) {
                        n = pbe.i(list3);
                        b7 = cwd.b(i10 << 3);
                        b6 = (b7 * size) + n;
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case 23:
                    i3 = pbe.h(i10, (List) unsafe.getObject(c2eVar2, j4));
                    i9 += i3;
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case 24:
                    i3 = pbe.g(i10, (List) unsafe.getObject(c2eVar2, j4));
                    i9 += i3;
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case 25:
                    List list4 = (List) unsafe.getObject(c2eVar2, j4);
                    y5d y5dVar5 = pbe.a;
                    int size3 = list4.size();
                    i9 += size3 == 0 ? 0 : (cwd.b(i10 << 3) + 1) * size3;
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case 26:
                    List list5 = (List) unsafe.getObject(c2eVar2, j4);
                    y5d y5dVar6 = pbe.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        b6 = cwd.b(i10 << 3) * size4;
                        if (list5 instanceof g5e) {
                            g5e g5eVar = (g5e) list5;
                            for (int i16 = 0; i16 < size4; i16++) {
                                Object zza = g5eVar.zza();
                                if (zza instanceof zud) {
                                    int j10 = ((zud) zza).j();
                                    b6 = yjb.g(j10, j10, b6);
                                } else {
                                    b6 = cwd.a((String) zza) + b6;
                                }
                            }
                        } else {
                            for (int i17 = 0; i17 < size4; i17++) {
                                Object obj = list5.get(i17);
                                if (obj instanceof zud) {
                                    int j11 = ((zud) obj).j();
                                    b6 = yjb.g(j11, j11, b6);
                                } else {
                                    b6 = cwd.a((String) obj) + b6;
                                }
                            }
                        }
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case 27:
                    List list6 = (List) unsafe.getObject(c2eVar2, j4);
                    bbe v2 = l9eVar.v(i7);
                    y5d y5dVar7 = pbe.a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        b8 = 0;
                    } else {
                        b8 = cwd.b(i10 << 3) * size5;
                        for (int i18 = 0; i18 < size5; i18++) {
                            int b13 = ((rrd) list6.get(i18)).b(v2);
                            b8 = yjb.g(b13, b13, b8);
                        }
                    }
                    i9 += b8;
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case 28:
                    List list7 = (List) unsafe.getObject(c2eVar2, j4);
                    y5d y5dVar8 = pbe.a;
                    int size6 = list7.size();
                    if (size6 != 0) {
                        b6 = cwd.b(i10 << 3) * size6;
                        for (int i19 = 0; i19 < list7.size(); i19++) {
                            int j12 = ((zud) list7.get(i19)).j();
                            b6 = yjb.g(j12, j12, b6);
                        }
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case 29:
                    List list8 = (List) unsafe.getObject(c2eVar2, j4);
                    y5d y5dVar9 = pbe.a;
                    size = list8.size();
                    if (size != 0) {
                        n = pbe.m(list8);
                        b7 = cwd.b(i10 << 3);
                        b6 = (b7 * size) + n;
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case kk7.S /* 30 */:
                    List list9 = (List) unsafe.getObject(c2eVar2, j4);
                    y5d y5dVar10 = pbe.a;
                    size = list9.size();
                    if (size != 0) {
                        n = pbe.f(list9);
                        b7 = cwd.b(i10 << 3);
                        b6 = (b7 * size) + n;
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case 31:
                    i3 = pbe.g(i10, (List) unsafe.getObject(c2eVar2, j4));
                    i9 += i3;
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case 32:
                    i3 = pbe.h(i10, (List) unsafe.getObject(c2eVar2, j4));
                    i9 += i3;
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case 33:
                    List list10 = (List) unsafe.getObject(c2eVar2, j4);
                    y5d y5dVar11 = pbe.a;
                    size = list10.size();
                    if (size != 0) {
                        n = pbe.k(list10);
                        b7 = cwd.b(i10 << 3);
                        b6 = (b7 * size) + n;
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case 34:
                    List list11 = (List) unsafe.getObject(c2eVar2, j4);
                    y5d y5dVar12 = pbe.a;
                    size = list11.size();
                    if (size != 0) {
                        n = pbe.l(list11);
                        b7 = cwd.b(i10 << 3);
                        b6 = (b7 * size) + n;
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case 35:
                    List list12 = (List) unsafe.getObject(c2eVar2, j4);
                    y5d y5dVar13 = pbe.a;
                    size2 = list12.size() << 3;
                    if (size2 > 0) {
                        b9 = cwd.b(i10 << 3);
                        i9 = yjb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(c2eVar2, j4);
                    y5d y5dVar14 = pbe.a;
                    size2 = list13.size() << 2;
                    if (size2 > 0) {
                        b9 = cwd.b(i10 << 3);
                        i9 = yjb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case 37:
                    size2 = pbe.j((List) unsafe.getObject(c2eVar2, j4));
                    if (size2 > 0) {
                        b9 = cwd.b(i10 << 3);
                        i9 = yjb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case 38:
                    size2 = pbe.n((List) unsafe.getObject(c2eVar2, j4));
                    if (size2 > 0) {
                        b9 = cwd.b(i10 << 3);
                        i9 = yjb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case 39:
                    size2 = pbe.i((List) unsafe.getObject(c2eVar2, j4));
                    if (size2 > 0) {
                        b9 = cwd.b(i10 << 3);
                        i9 = yjb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(c2eVar2, j4);
                    y5d y5dVar15 = pbe.a;
                    size2 = list14.size() << 3;
                    if (size2 > 0) {
                        b9 = cwd.b(i10 << 3);
                        i9 = yjb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(c2eVar2, j4);
                    y5d y5dVar16 = pbe.a;
                    size2 = list15.size() << 2;
                    if (size2 > 0) {
                        b9 = cwd.b(i10 << 3);
                        i9 = yjb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(c2eVar2, j4);
                    y5d y5dVar17 = pbe.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        b9 = cwd.b(i10 << 3);
                        i9 = yjb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case 43:
                    size2 = pbe.m((List) unsafe.getObject(c2eVar2, j4));
                    if (size2 > 0) {
                        b9 = cwd.b(i10 << 3);
                        i9 = yjb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case 44:
                    size2 = pbe.f((List) unsafe.getObject(c2eVar2, j4));
                    if (size2 > 0) {
                        b9 = cwd.b(i10 << 3);
                        i9 = yjb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(c2eVar2, j4);
                    y5d y5dVar18 = pbe.a;
                    size2 = list17.size() << 2;
                    if (size2 > 0) {
                        b9 = cwd.b(i10 << 3);
                        i9 = yjb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(c2eVar2, j4);
                    y5d y5dVar19 = pbe.a;
                    size2 = list18.size() << 3;
                    if (size2 > 0) {
                        b9 = cwd.b(i10 << 3);
                        i9 = yjb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case 47:
                    size2 = pbe.k((List) unsafe.getObject(c2eVar2, j4));
                    if (size2 > 0) {
                        b9 = cwd.b(i10 << 3);
                        i9 = yjb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case 48:
                    size2 = pbe.l((List) unsafe.getObject(c2eVar2, j4));
                    if (size2 > 0) {
                        b9 = cwd.b(i10 << 3);
                        i9 = yjb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(c2eVar2, j4);
                    bbe v3 = l9eVar.v(i7);
                    y5d y5dVar20 = pbe.a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i20 = 0; i20 < size7; i20++) {
                            i4 += cwd.r(i10, (rrd) list19.get(i20), v3);
                        }
                    }
                    i9 += i4;
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case 50:
                    r7e r7eVar = (r7e) unsafe.getObject(c2eVar2, j4);
                    if (l9eVar.w(i7) != null) {
                        fyb.g();
                        return 0;
                    }
                    if (r7eVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = r7eVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case kk7.n0 /* 51 */:
                    if (!l9eVar.n(i10, i7, c2eVar2)) {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                    i9 = yjb.g(i10 << 3, 8, i9);
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case kk7.o0 /* 52 */:
                    if (!l9eVar.n(i10, i7, c2eVar2)) {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                    i9 = yjb.g(i10 << 3, 4, i9);
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case kk7.p0 /* 53 */:
                    if (l9eVar.n(i10, i7, c2eVar2)) {
                        long t = t(c2eVar2, j4);
                        b10 = cwd.b(i10 << 3);
                        c2 = cwd.c(t);
                        i3 = c2 + b10;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case kk7.q0 /* 54 */:
                    if (l9eVar.n(i10, i7, c2eVar2)) {
                        long t2 = t(c2eVar2, j4);
                        b10 = cwd.b(i10 << 3);
                        c2 = cwd.c(t2);
                        i3 = c2 + b10;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case kk7.r0 /* 55 */:
                    if (l9eVar.n(i10, i7, c2eVar2)) {
                        long p = p(c2eVar2, j4);
                        b10 = cwd.b(i10 << 3);
                        c2 = cwd.c(p);
                        i3 = c2 + b10;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case 56:
                    if (!l9eVar.n(i10, i7, c2eVar2)) {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                    i9 = yjb.g(i10 << 3, 8, i9);
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case kk7.t0 /* 57 */:
                    if (!l9eVar.n(i10, i7, c2eVar2)) {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                    i9 = yjb.g(i10 << 3, 4, i9);
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case kk7.u0 /* 58 */:
                    if (l9eVar.n(i10, i7, c2eVar2)) {
                        i9 = yjb.g(i10 << 3, 1, i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case kk7.v0 /* 59 */:
                    if (l9eVar.n(i10, i7, c2eVar2)) {
                        int i21 = i10 << 3;
                        Object object3 = unsafe.getObject(c2eVar2, j4);
                        if (object3 instanceof zud) {
                            b11 = cwd.b(i21);
                            j3 = ((zud) object3).j();
                            i9 = yjb.h(j3, j3, b11, i9);
                            i7 += 3;
                            i5 = 1048575;
                            l9eVar = this;
                        } else {
                            i3 = cwd.a((String) object3) + cwd.b(i21);
                            i9 += i3;
                            i7 += 3;
                            i5 = 1048575;
                            l9eVar = this;
                        }
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case kk7.w0 /* 60 */:
                    if (l9eVar.n(i10, i7, c2eVar2)) {
                        Object object4 = unsafe.getObject(c2eVar2, j4);
                        bbe v4 = l9eVar.v(i7);
                        y5d y5dVar21 = pbe.a;
                        b3 = cwd.b(i10 << 3);
                        b4 = ((rrd) object4).b(v4);
                        i9 = yjb.h(b4, b4, b3, i9);
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case kk7.x0 /* 61 */:
                    if (l9eVar.n(i10, i7, c2eVar2)) {
                        zud zudVar2 = (zud) unsafe.getObject(c2eVar2, j4);
                        b11 = cwd.b(i10 << 3);
                        j3 = zudVar2.j();
                        i9 = yjb.h(j3, j3, b11, i9);
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case kk7.y0 /* 62 */:
                    if (l9eVar.n(i10, i7, c2eVar2)) {
                        i2 = p(c2eVar2, j4);
                        b5 = cwd.b(i10 << 3);
                        i9 = yjb.g(i2, b5, i9);
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case kk7.z0 /* 63 */:
                    if (l9eVar.n(i10, i7, c2eVar2)) {
                        long p2 = p(c2eVar2, j4);
                        b10 = cwd.b(i10 << 3);
                        c2 = cwd.c(p2);
                        i3 = c2 + b10;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case 64:
                    if (!l9eVar.n(i10, i7, c2eVar2)) {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                    i9 = yjb.g(i10 << 3, 4, i9);
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case 65:
                    if (!l9eVar.n(i10, i7, c2eVar2)) {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                    i9 = yjb.g(i10 << 3, 8, i9);
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case kk7.C0 /* 66 */:
                    if (l9eVar.n(i10, i7, c2eVar2)) {
                        int p3 = p(c2eVar2, j4);
                        i9 = yjb.g((p3 << 1) ^ (p3 >> 31), cwd.b(i10 << 3), i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
                case kk7.D0 /* 67 */:
                    if (l9eVar.n(i10, i7, c2eVar2)) {
                        long t3 = t(c2eVar2, j4);
                        b10 = cwd.b(i10 << 3);
                        c2 = cwd.c((t3 << 1) ^ (t3 >> 63));
                        i3 = c2 + b10;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                case kk7.E0 /* 68 */:
                    if (l9eVar.n(i10, i7, c2eVar2)) {
                        i3 = cwd.r(i10, (rrd) unsafe.getObject(c2eVar2, j4), l9eVar.v(i7));
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        l9eVar = this;
                    }
                default:
                    i7 += 3;
                    i5 = 1048575;
                    l9eVar = this;
            }
        }
    }

    @Override // bbe
    public final void f(Object obj, xdd xddVar) {
        int i;
        int i2;
        l9e l9eVar = this;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (true) {
            int[] iArr = l9eVar.a;
            if (i4 >= iArr.length) {
                ((c2e) obj).zzc.d(xddVar);
                return;
            }
            int s = l9eVar.s(i4);
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
                    if (l9eVar.l(obj, i4, i6, i5, i)) {
                        ((cwd) xddVar.a).h(i7, Double.doubleToRawLongBits(nfe.c.k(obj, j2)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (l9eVar.l(obj, i4, i6, i5, i)) {
                        ((cwd) xddVar.a).f(i7, Float.floatToRawIntBits(nfe.c.p(obj, j2)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (l9eVar.l(obj, i4, i6, i5, i)) {
                        ((cwd) xddVar.a).p(i7, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (l9eVar.l(obj, i4, i6, i5, i)) {
                        ((cwd) xddVar.a).p(i7, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (l9eVar.l(obj, i4, i6, i5, i)) {
                        ((cwd) xddVar.a).j(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (l9eVar.l(obj, i4, i6, i5, i)) {
                        ((cwd) xddVar.a).h(i7, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (l9eVar.l(obj, i4, i6, i5, i)) {
                        ((cwd) xddVar.a).f(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (l9eVar.l(obj, i4, i6, i5, i)) {
                        byte x = nfe.c.x(obj, j2);
                        cwd cwdVar = (cwd) xddVar.a;
                        cwdVar.o(i7 << 3);
                        int i10 = cwdVar.d;
                        try {
                            int i11 = i10 + 1;
                            try {
                                cwdVar.b[i10] = x;
                                cwdVar.d = i11;
                                break;
                            } catch (IndexOutOfBoundsException e) {
                                e = e;
                                i10 = i11;
                                throw new bk2(i10, cwdVar.c, 1, e);
                            }
                        } catch (IndexOutOfBoundsException e2) {
                            e = e2;
                        }
                    } else {
                        continue;
                    }
                case 8:
                    if (l9eVar.l(obj, i4, i6, i5, i)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            ((cwd) xddVar.a).l(i7, (String) object);
                            break;
                        } else {
                            ((cwd) xddVar.a).e(i7, (zud) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (l9eVar.l(obj, i4, i6, i5, i)) {
                        xddVar.h(i7, unsafe.getObject(obj, j2), l9eVar.v(i4));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (l9eVar.l(obj, i4, i6, i5, i)) {
                        ((cwd) xddVar.a).e(i7, (zud) unsafe.getObject(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (l9eVar.l(obj, i4, i6, i5, i)) {
                        ((cwd) xddVar.a).n(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (l9eVar.l(obj, i4, i6, i5, i)) {
                        ((cwd) xddVar.a).j(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (l9eVar.l(obj, i4, i6, i5, i)) {
                        ((cwd) xddVar.a).f(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (l9eVar.l(obj, i4, i6, i5, i)) {
                        ((cwd) xddVar.a).h(i7, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (l9eVar.l(obj, i4, i6, i5, i)) {
                        int i12 = unsafe.getInt(obj, j2);
                        ((cwd) xddVar.a).n(i7, (i12 << 1) ^ (i12 >> 31));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (l9eVar.l(obj, i4, i6, i5, i)) {
                        long j3 = unsafe.getLong(obj, j2);
                        ((cwd) xddVar.a).p(i7, (j3 << 1) ^ (j3 >> 63));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (l9eVar.l(obj, i4, i6, i5, i)) {
                        xddVar.f(i7, unsafe.getObject(obj, j2), l9eVar.v(i4));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    pbe.q(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                    break;
                case 19:
                    pbe.u(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                    break;
                case 20:
                    pbe.w(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                    break;
                case 21:
                    pbe.d(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                    break;
                case 22:
                    pbe.v(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                    break;
                case 23:
                    pbe.t(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                    break;
                case 24:
                    pbe.s(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                    break;
                case 25:
                    pbe.p(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                    break;
                case 26:
                    int i13 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j2);
                    y5d y5dVar = pbe.a;
                    if (list != null && !list.isEmpty()) {
                        cwd cwdVar2 = (cwd) xddVar.a;
                        if (list instanceof g5e) {
                            g5e g5eVar = (g5e) list;
                            for (int i14 = 0; i14 < list.size(); i14++) {
                                Object zza = g5eVar.zza();
                                if (zza instanceof String) {
                                    cwdVar2.l(i13, (String) zza);
                                } else {
                                    cwdVar2.e(i13, (zud) zza);
                                }
                            }
                            break;
                        } else {
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                cwdVar2.l(i13, (String) list.get(i15));
                            }
                            break;
                        }
                    }
                    break;
                case 27:
                    int i16 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    bbe v = l9eVar.v(i4);
                    y5d y5dVar2 = pbe.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i17 = 0; i17 < list2.size(); i17++) {
                            xddVar.h(i16, list2.get(i17), v);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i18 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    y5d y5dVar3 = pbe.a;
                    if (list3 != null && !list3.isEmpty()) {
                        xddVar.getClass();
                        for (int i19 = 0; i19 < list3.size(); i19++) {
                            ((cwd) xddVar.a).e(i18, (zud) list3.get(i19));
                        }
                        break;
                    }
                    break;
                case 29:
                    pbe.c(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                    break;
                case kk7.S /* 30 */:
                    pbe.r(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                    break;
                case 31:
                    pbe.x(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                    break;
                case 32:
                    pbe.y(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                    break;
                case 33:
                    pbe.a(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                    break;
                case 34:
                    pbe.b(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, false);
                    break;
                case 35:
                    pbe.q(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                    break;
                case 36:
                    pbe.u(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                    break;
                case 37:
                    pbe.w(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                    break;
                case 38:
                    pbe.d(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                    break;
                case 39:
                    pbe.v(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                    break;
                case 40:
                    pbe.t(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                    break;
                case 41:
                    pbe.s(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                    break;
                case 42:
                    pbe.p(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                    break;
                case 43:
                    pbe.c(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                    break;
                case 44:
                    pbe.r(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                    break;
                case 45:
                    pbe.x(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                    break;
                case 46:
                    pbe.y(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                    break;
                case 47:
                    pbe.a(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                    break;
                case 48:
                    pbe.b(iArr[i4], (List) unsafe.getObject(obj, j2), xddVar, true);
                    break;
                case 49:
                    int i20 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    bbe v2 = l9eVar.v(i4);
                    y5d y5dVar4 = pbe.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            xddVar.f(i20, list4.get(i21), v2);
                        }
                        break;
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j2) != null) {
                        l9eVar.w(i4).getClass();
                        fyb.g();
                        return;
                    }
                    break;
                case kk7.n0 /* 51 */:
                    if (l9eVar.n(i7, i4, obj)) {
                        ((cwd) xddVar.a).h(i7, Double.doubleToRawLongBits(((Double) nfe.g(obj, j2)).doubleValue()));
                        break;
                    } else {
                        break;
                    }
                case kk7.o0 /* 52 */:
                    if (l9eVar.n(i7, i4, obj)) {
                        ((cwd) xddVar.a).f(i7, Float.floatToRawIntBits(((Float) nfe.g(obj, j2)).floatValue()));
                        break;
                    } else {
                        break;
                    }
                case kk7.p0 /* 53 */:
                    if (l9eVar.n(i7, i4, obj)) {
                        ((cwd) xddVar.a).p(i7, t(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case kk7.q0 /* 54 */:
                    if (l9eVar.n(i7, i4, obj)) {
                        ((cwd) xddVar.a).p(i7, t(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case kk7.r0 /* 55 */:
                    if (l9eVar.n(i7, i4, obj)) {
                        ((cwd) xddVar.a).j(i7, p(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (l9eVar.n(i7, i4, obj)) {
                        ((cwd) xddVar.a).h(i7, t(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case kk7.t0 /* 57 */:
                    if (l9eVar.n(i7, i4, obj)) {
                        ((cwd) xddVar.a).f(i7, p(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case kk7.u0 /* 58 */:
                    if (l9eVar.n(i7, i4, obj)) {
                        byte booleanValue = ((Boolean) nfe.g(obj, j2)).booleanValue();
                        cwd cwdVar3 = (cwd) xddVar.a;
                        cwdVar3.o(i7 << 3);
                        int i22 = cwdVar3.d;
                        try {
                            i2 = i22 + 1;
                        } catch (IndexOutOfBoundsException e3) {
                            e = e3;
                        }
                        try {
                            cwdVar3.b[i22] = booleanValue;
                            cwdVar3.d = i2;
                            break;
                        } catch (IndexOutOfBoundsException e4) {
                            e = e4;
                            i22 = i2;
                            throw new bk2(i22, cwdVar3.c, 1, e);
                        }
                    } else {
                        continue;
                    }
                case kk7.v0 /* 59 */:
                    if (l9eVar.n(i7, i4, obj)) {
                        Object object2 = unsafe.getObject(obj, j2);
                        if (object2 instanceof String) {
                            ((cwd) xddVar.a).l(i7, (String) object2);
                            break;
                        } else {
                            ((cwd) xddVar.a).e(i7, (zud) object2);
                            break;
                        }
                    } else {
                        break;
                    }
                case kk7.w0 /* 60 */:
                    if (l9eVar.n(i7, i4, obj)) {
                        xddVar.h(i7, unsafe.getObject(obj, j2), l9eVar.v(i4));
                        break;
                    } else {
                        break;
                    }
                case kk7.x0 /* 61 */:
                    if (l9eVar.n(i7, i4, obj)) {
                        ((cwd) xddVar.a).e(i7, (zud) unsafe.getObject(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case kk7.y0 /* 62 */:
                    if (l9eVar.n(i7, i4, obj)) {
                        ((cwd) xddVar.a).n(i7, p(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case kk7.z0 /* 63 */:
                    if (l9eVar.n(i7, i4, obj)) {
                        ((cwd) xddVar.a).j(i7, p(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (l9eVar.n(i7, i4, obj)) {
                        ((cwd) xddVar.a).f(i7, p(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (l9eVar.n(i7, i4, obj)) {
                        ((cwd) xddVar.a).h(i7, t(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case kk7.C0 /* 66 */:
                    if (l9eVar.n(i7, i4, obj)) {
                        int p = p(obj, j2);
                        ((cwd) xddVar.a).n(i7, (p << 1) ^ (p >> 31));
                        break;
                    } else {
                        break;
                    }
                case kk7.D0 /* 67 */:
                    if (l9eVar.n(i7, i4, obj)) {
                        long t = t(obj, j2);
                        ((cwd) xddVar.a).p(i7, (t << 1) ^ (t >> 63));
                        break;
                    } else {
                        break;
                    }
                case kk7.E0 /* 68 */:
                    if (l9eVar.n(i7, i4, obj)) {
                        xddVar.f(i7, unsafe.getObject(obj, j2), l9eVar.v(i4));
                        break;
                    } else {
                        break;
                    }
            }
            i4 += 3;
            i3 = 1048575;
            l9eVar = this;
        }
    }

    public final void g(int i, Object obj, Object obj2) {
        if (k(i, obj2)) {
            long s = s(i) & 1048575;
            Unsafe unsafe = k;
            Object object = unsafe.getObject(obj2, s);
            if (object == null) {
                sc8.j(mue.d("Source subfield ", this.a[i], " is present but null: ", obj2.toString()));
                return;
            }
            bbe v = v(i);
            if (!k(i, obj)) {
                if (m(object)) {
                    c2e zze = v.zze();
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
                c2e zze2 = v.zze();
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
                sc8.j(mue.d("Source subfield ", iArr[i], " is present but null: ", obj2.toString()));
                return;
            }
            bbe v = v(i);
            if (!n(i2, i, obj)) {
                if (m(object)) {
                    c2e zze = v.zze();
                    v.zzg(zze, object);
                    unsafe.putObject(obj, s, zze);
                } else {
                    unsafe.putObject(obj, s, object);
                }
                nfe.h(obj, iArr[i + 2] & 1048575, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, s);
            if (!m(object2)) {
                c2e zze2 = v.zze();
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
        nfe.h(obj, j2, nfe.e(obj, j2) | (1 << (i2 >>> 20)));
    }

    public final boolean j(c2e c2eVar, c2e c2eVar2, int i) {
        return k(i, c2eVar) == k(i, c2eVar2);
    }

    public final boolean k(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = i2 & 1048575;
        if (j2 != 1048575) {
            return (nfe.e(obj, j2) & (1 << (i2 >>> 20))) != 0;
        }
        int s = s(i);
        long j3 = 1048575 & s;
        switch (r(s)) {
            case 0:
                if (Double.doubleToRawLongBits(nfe.c.k(obj, j3)) != 0) {
                }
                break;
            case 1:
                if (Float.floatToRawIntBits(nfe.c.p(obj, j3)) != 0) {
                }
                break;
            case 2:
                if (nfe.f(obj, j3) != 0) {
                }
                break;
            case 3:
                if (nfe.f(obj, j3) != 0) {
                }
                break;
            case 4:
                if (nfe.e(obj, j3) != 0) {
                }
                break;
            case 5:
                if (nfe.f(obj, j3) != 0) {
                }
                break;
            case 6:
                if (nfe.e(obj, j3) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object g = nfe.g(obj, j3);
                if (!(g instanceof String)) {
                    if (!(g instanceof zud)) {
                        sc8.e();
                        break;
                    } else if (!zud.c.equals(g)) {
                    }
                } else if (!((String) g).isEmpty()) {
                }
                break;
            case 9:
                if (nfe.g(obj, j3) != null) {
                }
                break;
            case 10:
                if (!zud.c.equals(nfe.g(obj, j3))) {
                }
                break;
            case 11:
                if (nfe.e(obj, j3) != 0) {
                }
                break;
            case 12:
                if (nfe.e(obj, j3) != 0) {
                }
                break;
            case 13:
                if (nfe.e(obj, j3) != 0) {
                }
                break;
            case 14:
                if (nfe.f(obj, j3) != 0) {
                }
                break;
            case 15:
                if (nfe.e(obj, j3) != 0) {
                }
                break;
            case 16:
                if (nfe.f(obj, j3) != 0) {
                }
                break;
            case 17:
                if (nfe.g(obj, j3) != null) {
                }
                break;
            default:
                sc8.e();
                break;
        }
        return false;
    }

    public final boolean l(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? k(i, obj) : (i3 & i4) != 0;
    }

    public final boolean n(int i, int i2, Object obj) {
        return nfe.e(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:529:0x030f, code lost:
    
        fvc.h("Protocol message had invalid UTF-8.");
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
    
        fvc.h("Protocol message had invalid UTF-8.");
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
        r6 = nfe.g(r8, s(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0d8d, code lost:
    
        if (r6 == null) goto L684;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0d93, code lost:
    
        if (u(r4) != null) goto L682;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0d98, code lost:
    
        r6 = (r7e) r6;
        w(r4).getClass();
        fyb.g();
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
    
        fvc.h("Failed to parse the message.");
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
    
        fvc.h("Failed to parse the message.");
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
    public final int o(Object obj, byte[] bArr, int i, int i2, int i3, kj6 kj6Var) {
        int i4;
        Unsafe unsafe;
        int[] iArr;
        Object obj2;
        int i5;
        int q;
        int i6;
        int i7;
        iee ieeVar;
        kj6 kj6Var2;
        int i8;
        byte[] bArr2;
        int i9;
        int i10;
        int i11;
        int i12;
        byte[] bArr3;
        kj6 kj6Var3;
        int i13;
        int i14;
        int i15;
        int i16;
        Unsafe unsafe2;
        kj6 kj6Var4;
        Object obj3;
        Unsafe unsafe3;
        int i17;
        byte[] bArr4;
        kj6 kj6Var5;
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
        r7e r7eVar;
        int i24;
        int i25;
        int i26;
        int i27;
        byte[] bArr5;
        kj6 kj6Var6;
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
        a3e a3eVar;
        int i32;
        int i33;
        yqd yqdVar;
        int i34;
        l9e l9eVar = this;
        Object obj5 = obj;
        byte[] bArr6 = bArr;
        int i35 = i2;
        kj6 kj6Var7 = kj6Var;
        if (!m(obj5)) {
            w26.j("Mutating immutable message: ".concat(String.valueOf(obj5)));
            return 0;
        }
        int i36 = i;
        int i37 = -1;
        int i38 = 0;
        int i39 = 1048575;
        int i40 = 0;
        int i41 = 0;
        while (true) {
            int[] iArr2 = l9eVar.a;
            Unsafe unsafe5 = k;
            if (i36 < i35) {
                int i42 = i36 + 1;
                int i43 = bArr6[i36];
                if (i43 < 0) {
                    i42 = l1f.g(i43, bArr6, i42, kj6Var7);
                    i43 = kj6Var7.b;
                }
                int i44 = i42;
                i41 = i43;
                int i45 = i41 >>> 3;
                int i46 = l9eVar.d;
                int i47 = l9eVar.c;
                if (i45 > i37) {
                    q = (i45 < i47 || i45 > i46) ? -1 : l9eVar.q(i45, i38 / 3);
                } else {
                    q = (i45 < i47 || i45 > i46) ? -1 : l9eVar.q(i45, 0);
                }
                iee ieeVar2 = iee.f;
                if (q == -1) {
                    i4 = i3;
                    i6 = i39;
                    i7 = i40;
                    unsafe = unsafe5;
                    ieeVar = ieeVar2;
                    iArr = iArr2;
                    i38 = 0;
                    kj6Var2 = kj6Var;
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
                                kj6Var3 = kj6Var;
                                unsafe = unsafe5;
                                i13 = i44;
                                i14 = i41;
                                i15 = i45;
                                i16 = i40;
                                if (i11 != 1) {
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    ieeVar = ieeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    kj6Var2 = kj6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    nfe.c.v(obj5, j2, Double.longBitsToDouble(l1f.l(i13, bArr3)));
                                    i35 = i2;
                                    kj6Var7 = kj6Var3;
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
                                kj6Var3 = kj6Var;
                                unsafe = unsafe5;
                                i13 = i44;
                                i14 = i41;
                                i15 = i45;
                                i16 = i40;
                                if (i11 != 5) {
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    ieeVar = ieeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    kj6Var2 = kj6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    i36 = i13 + 4;
                                    i40 = i16 | i51;
                                    nfe.c.w(obj5, j2, Float.intBitsToFloat(l1f.b(bArr3, i13)));
                                    i35 = i2;
                                    kj6Var7 = kj6Var3;
                                    bArr6 = bArr3;
                                    i38 = q;
                                    i37 = i15;
                                    i41 = i14;
                                    i39 = i12;
                                }
                            case 2:
                            case 3:
                                bArr3 = bArr;
                                kj6Var3 = kj6Var;
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
                                    ieeVar = ieeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    kj6Var2 = kj6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    i40 = i16 | i51;
                                    int i54 = l1f.i(bArr3, i13, kj6Var3);
                                    unsafe2.putLong(obj5, j2, kj6Var3.a);
                                    i35 = i2;
                                    kj6Var7 = kj6Var3;
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
                                kj6Var3 = kj6Var;
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
                                    ieeVar = ieeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    kj6Var2 = kj6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    i40 = i16 | i51;
                                    int f5 = l1f.f(bArr3, i13, kj6Var3);
                                    unsafe2.putInt(obj5, j2, kj6Var3.b);
                                    i36 = f5;
                                    kj6Var7 = kj6Var3;
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
                                    kj6Var3 = kj6Var;
                                    unsafe2 = unsafe5;
                                    obj5 = obj6;
                                    unsafe = unsafe2;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    ieeVar = ieeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    kj6Var2 = kj6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    obj5 = obj6;
                                    unsafe5.putLong(obj5, j2, l1f.l(i13, bArr3));
                                    i35 = i2;
                                    kj6Var7 = kj6Var;
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
                                kj6Var4 = kj6Var;
                                obj3 = obj5;
                                unsafe3 = unsafe5;
                                i13 = i44;
                                i14 = i41;
                                i15 = i45;
                                i16 = i40;
                                if (i11 != 5) {
                                    unsafe = unsafe3;
                                    obj5 = obj3;
                                    kj6Var3 = kj6Var4;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    ieeVar = ieeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    kj6Var2 = kj6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    unsafe3.putInt(obj3, j2, l1f.b(bArr3, i13));
                                    i35 = i2;
                                    kj6Var7 = kj6Var4;
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
                                kj6Var4 = kj6Var;
                                obj3 = obj5;
                                unsafe3 = unsafe5;
                                i13 = i44;
                                i14 = i41;
                                i15 = i45;
                                i16 = i40;
                                if (i11 != 0) {
                                    unsafe = unsafe3;
                                    obj5 = obj3;
                                    kj6Var3 = kj6Var4;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    ieeVar = ieeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    kj6Var2 = kj6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    int i55 = i16 | i51;
                                    int i56 = l1f.i(bArr3, i13, kj6Var4);
                                    nfe.c.s(obj3, j2, kj6Var4.a != 0);
                                    i35 = i2;
                                    kj6Var7 = kj6Var4;
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
                                kj6Var4 = kj6Var;
                                obj3 = obj5;
                                unsafe3 = unsafe5;
                                i13 = i44;
                                i14 = i41;
                                i15 = i45;
                                i16 = i40;
                                if (i11 != 2) {
                                    unsafe = unsafe3;
                                    obj5 = obj3;
                                    kj6Var3 = kj6Var4;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    ieeVar = ieeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    kj6Var2 = kj6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    if ((i49 & TLObject.FLAG_29) != 0) {
                                        int i57 = i16 | i51;
                                        int f6 = l1f.f(bArr3, i13, kj6Var4);
                                        int i58 = kj6Var4.b;
                                        if (i58 < 0) {
                                            fvc.h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            return 0;
                                        }
                                        if (i58 == 0) {
                                            kj6Var4.d = "";
                                            i21 = i57;
                                        } else {
                                            int i59 = cge.a;
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
                                                                        fvc.h("Protocol message had invalid UTF-8.");
                                                                        return 0;
                                                                    }
                                                                    int i65 = i61 + 1;
                                                                    int i66 = f6 + 2;
                                                                    byte b4 = bArr3[i62];
                                                                    f6 += 3;
                                                                    byte b5 = bArr3[i66];
                                                                    if (!j2f.a(b4)) {
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
                                                                        if (j2f.a(b5)) {
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
                                                                        fvc.h("Protocol message had invalid UTF-8.");
                                                                        return 0;
                                                                    }
                                                                    byte b6 = bArr3[i62];
                                                                    int i67 = f6 + 3;
                                                                    byte b7 = bArr3[f6 + 2];
                                                                    f6 += 4;
                                                                    byte b8 = bArr3[i67];
                                                                    if (!j2f.a(b6) && (((b6 + 112) + (b2 << 28)) >> 30) == 0 && !j2f.a(b7) && !j2f.a(b8)) {
                                                                        int i68 = ((b2 & 7) << 18) | ((b6 & 63) << 12) | ((b7 & 63) << 6) | (b8 & 63);
                                                                        cArr[i61] = (char) ((i68 >>> 10) + 55232);
                                                                        cArr[i61 + 1] = (char) ((i68 & 1023) + 56320);
                                                                        i61 += 2;
                                                                        i60 = i64;
                                                                    }
                                                                }
                                                            } else {
                                                                if (i62 >= i60) {
                                                                    fvc.h("Protocol message had invalid UTF-8.");
                                                                    return 0;
                                                                }
                                                                int i69 = i61 + 1;
                                                                f6 += 2;
                                                                byte b9 = bArr3[i62];
                                                                int i70 = i60;
                                                                if (b2 >= -62 && !j2f.a(b9)) {
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
                                                    kj6Var4.d = str;
                                                    f6 = i71;
                                                }
                                            }
                                            while (f6 < i60) {
                                            }
                                            int i712 = i60;
                                            i21 = i57;
                                            str = new String(cArr, 0, i61);
                                            kj6Var4.d = str;
                                            f6 = i712;
                                        }
                                        f = f6;
                                        i20 = i21;
                                    } else {
                                        f = l1f.f(bArr3, i13, kj6Var4);
                                        int i72 = kj6Var4.b;
                                        if (i72 < 0) {
                                            fvc.h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            return 0;
                                        }
                                        i20 = i16 | i51;
                                        if (i72 == 0) {
                                            kj6Var4.d = "";
                                        } else {
                                            str = new String(bArr3, f, i72, h3e.a);
                                            kj6Var4.d = str;
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
                                    kj6Var7 = kj6Var4;
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
                                    kj6Var3 = kj6Var;
                                    i16 = i17;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    ieeVar = ieeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    kj6Var2 = kj6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    i40 = i17 | i51;
                                    Object x = l9eVar.x(q, obj7);
                                    kj6Var7 = kj6Var;
                                    int k2 = l1f.k(x, l9eVar.v(q), bArr, i44, i2, kj6Var7);
                                    unsafe6.putObject(obj, l9eVar.s(q) & 1048575, x);
                                    l9eVar.i(q, obj);
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
                                kj6Var5 = kj6Var;
                                obj4 = obj5;
                                i17 = i40;
                                unsafe4 = unsafe5;
                                i18 = i44;
                                if (i11 != 2) {
                                    kj6 kj6Var8 = kj6Var5;
                                    bArr3 = bArr4;
                                    kj6Var3 = kj6Var8;
                                    unsafe = unsafe4;
                                    i13 = i18;
                                    i14 = i41;
                                    i15 = i45;
                                    obj5 = obj4;
                                    i16 = i17;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    ieeVar = ieeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    kj6Var2 = kj6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    i19 = i17 | i51;
                                    a = l1f.a(bArr4, i18, kj6Var5);
                                    unsafe4.putObject(obj4, j2, kj6Var5.d);
                                    i35 = i2;
                                    obj5 = obj4;
                                    i36 = a;
                                    i40 = i19;
                                    bArr6 = bArr4;
                                    kj6Var7 = kj6Var5;
                                    i38 = q;
                                    i37 = i45;
                                    i39 = i12;
                                }
                            case 12:
                                bArr4 = bArr;
                                kj6Var5 = kj6Var;
                                obj4 = obj5;
                                i17 = i40;
                                unsafe4 = unsafe5;
                                i18 = i44;
                                if (i11 != 0) {
                                    kj6 kj6Var82 = kj6Var5;
                                    bArr3 = bArr4;
                                    kj6Var3 = kj6Var82;
                                    unsafe = unsafe4;
                                    i13 = i18;
                                    i14 = i41;
                                    i15 = i45;
                                    obj5 = obj4;
                                    i16 = i17;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    ieeVar = ieeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    kj6Var2 = kj6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    a = l1f.f(bArr4, i18, kj6Var5);
                                    int i73 = kj6Var5.b;
                                    yqd u = l9eVar.u(q);
                                    if ((i49 & TLObject.FLAG_31) == 0 || u == null || u.a(i73)) {
                                        i19 = i17 | i51;
                                        unsafe4.putInt(obj4, j2, i73);
                                        i35 = i2;
                                        obj5 = obj4;
                                        i36 = a;
                                        i40 = i19;
                                        bArr6 = bArr4;
                                        kj6Var7 = kj6Var5;
                                        i38 = q;
                                        i37 = i45;
                                        i39 = i12;
                                    } else {
                                        c2e c2eVar = (c2e) obj4;
                                        iee ieeVar3 = c2eVar.zzc;
                                        if (ieeVar3 == ieeVar2) {
                                            ieeVar3 = iee.b();
                                            c2eVar.zzc = ieeVar3;
                                        }
                                        ieeVar3.c(i41, Long.valueOf(i73));
                                        i35 = i2;
                                        obj5 = obj4;
                                        i36 = a;
                                        i40 = i17;
                                        bArr6 = bArr4;
                                        kj6Var7 = kj6Var5;
                                        i38 = q;
                                        i37 = i45;
                                        i39 = i12;
                                    }
                                }
                            case 15:
                                bArr4 = bArr;
                                kj6Var5 = kj6Var;
                                obj4 = obj5;
                                i17 = i40;
                                unsafe4 = unsafe5;
                                i18 = i44;
                                if (i11 != 0) {
                                    kj6 kj6Var822 = kj6Var5;
                                    bArr3 = bArr4;
                                    kj6Var3 = kj6Var822;
                                    unsafe = unsafe4;
                                    i13 = i18;
                                    i14 = i41;
                                    i15 = i45;
                                    obj5 = obj4;
                                    i16 = i17;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    ieeVar = ieeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    kj6Var2 = kj6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    i19 = i17 | i51;
                                    a = l1f.f(bArr4, i18, kj6Var5);
                                    int i74 = kj6Var5.b;
                                    unsafe4.putInt(obj4, j2, (i74 >>> 1) ^ (-(i74 & 1)));
                                    i35 = i2;
                                    obj5 = obj4;
                                    i36 = a;
                                    i40 = i19;
                                    bArr6 = bArr4;
                                    kj6Var7 = kj6Var5;
                                    i38 = q;
                                    i37 = i45;
                                    i39 = i12;
                                }
                            case 16:
                                if (i11 != 0) {
                                    bArr3 = bArr;
                                    kj6Var3 = kj6Var;
                                    obj5 = obj5;
                                    unsafe = unsafe5;
                                    i14 = i41;
                                    i15 = i45;
                                    i13 = i44;
                                    i16 = i40;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    ieeVar = ieeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    kj6Var2 = kj6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    i40 |= i51;
                                    int i75 = l1f.i(bArr, i44, kj6Var);
                                    long j3 = kj6Var.a;
                                    unsafe5.putLong(obj5, j2, (-(j3 & 1)) ^ (j3 >>> 1));
                                    i35 = i2;
                                    bArr6 = bArr;
                                    kj6Var7 = kj6Var;
                                    i38 = q;
                                    i36 = i75;
                                    i37 = i45;
                                    i39 = i12;
                                }
                            default:
                                if (i11 != 3) {
                                    bArr3 = bArr;
                                    kj6Var3 = kj6Var;
                                    unsafe = unsafe5;
                                    i13 = i44;
                                    i14 = i41;
                                    i15 = i45;
                                    i16 = i40;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    ieeVar = ieeVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    kj6Var2 = kj6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    Object x2 = l9eVar.x(q, obj5);
                                    int j4 = l1f.j(x2, l9eVar.v(q), bArr, i44, i2, (i45 << 3) | 4, kj6Var);
                                    bArr4 = bArr;
                                    kj6Var5 = kj6Var;
                                    unsafe6.putObject(obj5, l9eVar.s(q) & 1048575, x2);
                                    l9eVar.i(q, obj5);
                                    i35 = i2;
                                    i40 |= i51;
                                    i36 = j4;
                                    bArr6 = bArr4;
                                    kj6Var7 = kj6Var5;
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
                                        case kk7.n0 /* 51 */:
                                            bArr2 = bArr;
                                            kj6Var2 = kj6Var;
                                            ieeVar = ieeVar2;
                                            i8 = i23;
                                            i24 = i22;
                                            i25 = q;
                                            i26 = i41;
                                            if (i48 == 1) {
                                                i27 = i24 + 8;
                                                unsafe.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(l1f.l(i24, bArr2))));
                                                unsafe.putInt(obj2, j5, i8);
                                                i36 = i27;
                                                if (i36 == i24) {
                                                    i4 = i3;
                                                    i9 = i36;
                                                    i38 = i25;
                                                    i10 = i26;
                                                    break;
                                                } else {
                                                    l9eVar = this;
                                                    i35 = i2;
                                                    obj5 = obj2;
                                                    bArr6 = bArr2;
                                                    kj6Var7 = kj6Var2;
                                                    i37 = i8;
                                                    i38 = i25;
                                                    i41 = i26;
                                                    break;
                                                }
                                            }
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                        case kk7.o0 /* 52 */:
                                            bArr2 = bArr;
                                            kj6Var2 = kj6Var;
                                            ieeVar = ieeVar2;
                                            i8 = i23;
                                            i24 = i22;
                                            i25 = q;
                                            i26 = i41;
                                            if (i48 == 5) {
                                                i27 = i24 + 4;
                                                unsafe.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(l1f.b(bArr2, i24))));
                                                unsafe.putInt(obj2, j5, i8);
                                                i36 = i27;
                                                if (i36 == i24) {
                                                }
                                            }
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case kk7.p0 /* 53 */:
                                        case kk7.q0 /* 54 */:
                                            bArr2 = bArr;
                                            kj6Var2 = kj6Var;
                                            ieeVar = ieeVar2;
                                            i8 = i23;
                                            i24 = i22;
                                            i25 = q;
                                            i26 = i41;
                                            if (i48 == 0) {
                                                i27 = l1f.i(bArr2, i24, kj6Var2);
                                                unsafe.putObject(obj2, j2, Long.valueOf(kj6Var2.a));
                                                unsafe.putInt(obj2, j5, i8);
                                                i36 = i27;
                                                if (i36 == i24) {
                                                }
                                            }
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case kk7.r0 /* 55 */:
                                        case kk7.y0 /* 62 */:
                                            bArr2 = bArr;
                                            kj6Var2 = kj6Var;
                                            ieeVar = ieeVar2;
                                            i8 = i23;
                                            i24 = i22;
                                            i25 = q;
                                            i26 = i41;
                                            if (i48 == 0) {
                                                i27 = l1f.f(bArr2, i24, kj6Var2);
                                                unsafe.putObject(obj2, j2, Integer.valueOf(kj6Var2.b));
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
                                            kj6Var2 = kj6Var;
                                            ieeVar = ieeVar2;
                                            i8 = i23;
                                            i24 = i22;
                                            i25 = q;
                                            i26 = i41;
                                            if (i48 == 1) {
                                                i27 = i24 + 8;
                                                unsafe.putObject(obj2, j2, Long.valueOf(l1f.l(i24, bArr2)));
                                                unsafe.putInt(obj2, j5, i8);
                                                i36 = i27;
                                                if (i36 == i24) {
                                                }
                                            }
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case kk7.t0 /* 57 */:
                                        case 64:
                                            bArr2 = bArr;
                                            kj6Var2 = kj6Var;
                                            ieeVar = ieeVar2;
                                            i8 = i23;
                                            i24 = i22;
                                            i25 = q;
                                            i26 = i41;
                                            if (i48 == 5) {
                                                i27 = i24 + 4;
                                                unsafe.putObject(obj2, j2, Integer.valueOf(l1f.b(bArr2, i24)));
                                                unsafe.putInt(obj2, j5, i8);
                                                i36 = i27;
                                                if (i36 == i24) {
                                                }
                                            }
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case kk7.u0 /* 58 */:
                                            bArr2 = bArr;
                                            kj6Var2 = kj6Var;
                                            i8 = i23;
                                            i24 = i22;
                                            i25 = q;
                                            if (i48 == 0) {
                                                i27 = l1f.i(bArr2, i24, kj6Var2);
                                                ieeVar = ieeVar2;
                                                i26 = i41;
                                                unsafe.putObject(obj2, j2, Boolean.valueOf(kj6Var2.a != 0));
                                                unsafe.putInt(obj2, j5, i8);
                                                i36 = i27;
                                                if (i36 == i24) {
                                                }
                                            }
                                            ieeVar = ieeVar2;
                                            i26 = i41;
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case kk7.v0 /* 59 */:
                                            bArr2 = bArr;
                                            kj6Var2 = kj6Var;
                                            i8 = i23;
                                            i24 = i22;
                                            i25 = q;
                                            if (i48 == 2) {
                                                int f7 = l1f.f(bArr2, i24, kj6Var2);
                                                int i76 = kj6Var2.b;
                                                if (i76 == 0) {
                                                    unsafe.putObject(obj2, j2, "");
                                                } else {
                                                    int i77 = f7 + i76;
                                                    if ((i49 & TLObject.FLAG_29) != 0 && !cge.d(f7, i77, bArr2)) {
                                                        fvc.h("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    unsafe.putObject(obj2, j2, new String(bArr2, f7, i76, h3e.a));
                                                    f7 = i77;
                                                }
                                                unsafe.putInt(obj2, j5, i8);
                                                i36 = f7;
                                                ieeVar = ieeVar2;
                                                i26 = i41;
                                                if (i36 == i24) {
                                                }
                                            }
                                            ieeVar = ieeVar2;
                                            i26 = i41;
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case kk7.w0 /* 60 */:
                                            i8 = i23;
                                            if (i48 == 2) {
                                                Object y = l9eVar.y(i8, q, obj2);
                                                i24 = i22;
                                                int k3 = l1f.k(y, l9eVar.v(q), bArr, i24, i2, kj6Var);
                                                unsafe6.putObject(obj2, l9eVar.s(q) & 1048575, y);
                                                nfe.h(obj2, iArr[r9] & 1048575, i8);
                                                bArr2 = bArr;
                                                kj6Var2 = kj6Var;
                                                i36 = k3;
                                                i25 = q;
                                                ieeVar = ieeVar2;
                                                i26 = i41;
                                                if (i36 == i24) {
                                                }
                                            } else {
                                                bArr2 = bArr;
                                                kj6Var2 = kj6Var;
                                                ieeVar = ieeVar2;
                                                i26 = i41;
                                                i24 = i22;
                                                i25 = q;
                                                i36 = i24;
                                                if (i36 == i24) {
                                                }
                                            }
                                            break;
                                        case kk7.x0 /* 61 */:
                                            bArr5 = bArr;
                                            kj6Var6 = kj6Var;
                                            i8 = i23;
                                            i28 = i22;
                                            if (i48 == 2) {
                                                a2 = l1f.a(bArr5, i28, kj6Var6);
                                                unsafe.putObject(obj2, j2, kj6Var6.d);
                                                unsafe.putInt(obj2, j5, i8);
                                                kj6Var2 = kj6Var6;
                                                i36 = a2;
                                                i24 = i28;
                                                i25 = q;
                                                ieeVar = ieeVar2;
                                                i26 = i41;
                                                bArr2 = bArr5;
                                                if (i36 == i24) {
                                                }
                                            }
                                            kj6Var2 = kj6Var6;
                                            i24 = i28;
                                            i25 = q;
                                            ieeVar = ieeVar2;
                                            i26 = i41;
                                            bArr2 = bArr5;
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case kk7.z0 /* 63 */:
                                            bArr5 = bArr;
                                            kj6Var6 = kj6Var;
                                            ieeVar = ieeVar2;
                                            i8 = i23;
                                            i28 = i22;
                                            if (i48 == 0) {
                                                a2 = l1f.f(bArr5, i28, kj6Var6);
                                                int i78 = kj6Var6.b;
                                                yqd u2 = l9eVar.u(q);
                                                if (u2 == null || u2.a(i78)) {
                                                    ieeVar2 = ieeVar;
                                                    unsafe.putObject(obj2, j2, Integer.valueOf(i78));
                                                    unsafe.putInt(obj2, j5, i8);
                                                } else {
                                                    c2e c2eVar2 = (c2e) obj2;
                                                    iee ieeVar4 = c2eVar2.zzc;
                                                    ieeVar2 = ieeVar;
                                                    if (ieeVar4 == ieeVar2) {
                                                        ieeVar4 = iee.b();
                                                        c2eVar2.zzc = ieeVar4;
                                                    }
                                                    ieeVar4.c(i41, Long.valueOf(i78));
                                                }
                                                kj6Var2 = kj6Var6;
                                                i36 = a2;
                                                i24 = i28;
                                                i25 = q;
                                                ieeVar = ieeVar2;
                                                i26 = i41;
                                                bArr2 = bArr5;
                                                if (i36 == i24) {
                                                }
                                            }
                                            kj6Var2 = kj6Var6;
                                            i24 = i28;
                                            i25 = q;
                                            i26 = i41;
                                            bArr2 = bArr5;
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case kk7.C0 /* 66 */:
                                            bArr5 = bArr;
                                            kj6Var6 = kj6Var;
                                            ieeVar = ieeVar2;
                                            i8 = i23;
                                            i28 = i22;
                                            if (i48 == 0) {
                                                f2 = l1f.f(bArr5, i28, kj6Var6);
                                                int i79 = kj6Var6.b;
                                                unsafe.putObject(obj2, j2, Integer.valueOf((i79 >>> 1) ^ (-(i79 & 1))));
                                                unsafe.putInt(obj2, j5, i8);
                                                kj6Var2 = kj6Var6;
                                                i36 = f2;
                                                i24 = i28;
                                                i25 = q;
                                                i26 = i41;
                                                bArr2 = bArr5;
                                                if (i36 == i24) {
                                                }
                                            }
                                            kj6Var2 = kj6Var6;
                                            i24 = i28;
                                            i25 = q;
                                            i26 = i41;
                                            bArr2 = bArr5;
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case kk7.D0 /* 67 */:
                                            bArr5 = bArr;
                                            kj6Var6 = kj6Var;
                                            i8 = i23;
                                            i28 = i22;
                                            if (i48 == 0) {
                                                f2 = l1f.i(bArr5, i28, kj6Var6);
                                                ieeVar = ieeVar2;
                                                long j6 = kj6Var6.a;
                                                unsafe.putObject(obj2, j2, Long.valueOf((j6 >>> 1) ^ (-(j6 & 1))));
                                                unsafe.putInt(obj2, j5, i8);
                                                kj6Var2 = kj6Var6;
                                                i36 = f2;
                                                i24 = i28;
                                                i25 = q;
                                                i26 = i41;
                                                bArr2 = bArr5;
                                                if (i36 == i24) {
                                                }
                                            }
                                            kj6Var2 = kj6Var6;
                                            i24 = i28;
                                            i25 = q;
                                            ieeVar = ieeVar2;
                                            i26 = i41;
                                            bArr2 = bArr5;
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case kk7.E0 /* 68 */:
                                            if (i48 == 3) {
                                                i8 = i23;
                                                Object y2 = l9eVar.y(i8, q, obj2);
                                                int j7 = l1f.j(y2, l9eVar.v(q), bArr, i22, i2, (i41 & (-8)) | 4, kj6Var);
                                                unsafe6.putObject(obj2, l9eVar.s(q) & 1048575, y2);
                                                nfe.h(obj2, iArr[r9] & 1048575, i8);
                                                i36 = j7;
                                                bArr2 = bArr;
                                                kj6Var2 = kj6Var;
                                                ieeVar = ieeVar2;
                                                i26 = i41;
                                                i24 = i22;
                                                i25 = q;
                                                if (i36 == i24) {
                                                }
                                            } else {
                                                i8 = i23;
                                                bArr2 = bArr;
                                                kj6Var2 = kj6Var;
                                                i25 = q;
                                                ieeVar = ieeVar2;
                                                i24 = i22;
                                                i26 = i41;
                                                i36 = i24;
                                                if (i36 == i24) {
                                                }
                                            }
                                            break;
                                        default:
                                            bArr2 = bArr;
                                            kj6Var2 = kj6Var;
                                            ieeVar = ieeVar2;
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
                                        Object w = l9eVar.w(q);
                                        Object object = unsafe.getObject(obj, j2);
                                        if (!((r7e) object).a) {
                                            r7e r7eVar2 = r7e.b;
                                            if (r7eVar2.isEmpty()) {
                                                r7eVar = new r7e();
                                            } else {
                                                r7e r7eVar3 = new r7e(r7eVar2);
                                                r7eVar3.a = true;
                                                r7eVar = r7eVar3;
                                            }
                                            gcd.a(r7eVar, object);
                                            unsafe.putObject(obj, j2, r7eVar);
                                        }
                                        w.getClass();
                                        fyb.g();
                                        return 0;
                                    }
                                    obj2 = obj;
                                    bArr2 = bArr;
                                    i4 = i3;
                                    kj6Var2 = kj6Var;
                                    i9 = i22;
                                }
                            } else {
                                iArr = iArr2;
                                long j8 = i49;
                                a3e a3eVar2 = (a3e) unsafe.getObject(obj8, j2);
                                if (!((bsd) a3eVar2).a) {
                                    a3eVar2 = a3eVar2.zzd(a3eVar2.size() << 1);
                                    unsafe.putObject(obj8, j2, a3eVar2);
                                }
                                a3e a3eVar3 = a3eVar2;
                                switch (r) {
                                    case 18:
                                    case 35:
                                        i41 = i41;
                                        i29 = i44;
                                        i23 = i45;
                                        if (i48 == 2) {
                                            fyb.g();
                                            return 0;
                                        }
                                        if (i48 == 1) {
                                            fyb.g();
                                            return 0;
                                        }
                                        i36 = i29;
                                        if (i36 != i29) {
                                            obj2 = obj;
                                            bArr2 = bArr;
                                            i4 = i3;
                                            kj6Var2 = kj6Var;
                                            i9 = i36;
                                            break;
                                        } else {
                                            obj5 = obj;
                                            bArr6 = bArr;
                                            i35 = i2;
                                            kj6Var7 = kj6Var;
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
                                            fyb.g();
                                            return 0;
                                        }
                                        if (i48 == 5) {
                                            fyb.g();
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
                                            fyb.g();
                                            return 0;
                                        }
                                        if (i48 == 0) {
                                            fyb.g();
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
                                            d = l1f.d(bArr, i30, a3eVar3, kj6Var);
                                            i41 = i31;
                                            i36 = d;
                                            i29 = i30;
                                            if (i36 != i29) {
                                            }
                                        } else {
                                            if (i48 == 0) {
                                                i41 = i31;
                                                i29 = i30;
                                                i36 = l1f.h(i31, bArr, i30, i2, a3eVar3, kj6Var);
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
                                            fyb.g();
                                            return 0;
                                        }
                                        if (i48 == 1) {
                                            fyb.g();
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
                                            h2e h2eVar = (h2e) a3eVar3;
                                            f3 = l1f.f(bArr, i30, kj6Var);
                                            int i80 = kj6Var.b;
                                            int i81 = f3 + i80;
                                            if (i81 > bArr.length) {
                                                fvc.h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            int i82 = (i80 / 4) + h2eVar.c;
                                            int length2 = h2eVar.b.length;
                                            if (i82 > length2) {
                                                if (length2 != 0) {
                                                    while (length2 < i82) {
                                                        length2 = Math.max(((length2 * 3) / 2) + 1, 10);
                                                    }
                                                    h2eVar.b = Arrays.copyOf(h2eVar.b, length2);
                                                } else {
                                                    h2eVar.b = new int[Math.max(i82, 10)];
                                                }
                                            }
                                            while (f3 < i81) {
                                                h2eVar.j(l1f.b(bArr, f3));
                                                f3 += 4;
                                            }
                                            if (f3 != i81) {
                                                fvc.h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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
                                                h2e h2eVar2 = (h2e) a3eVar3;
                                                h2eVar2.j(l1f.b(bArr, i30));
                                                while (d < i2) {
                                                    int f8 = l1f.f(bArr, d, kj6Var);
                                                    if (i31 == kj6Var.b) {
                                                        h2eVar2.j(l1f.b(bArr, f8));
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
                                            fyb.g();
                                            return 0;
                                        }
                                        if (i48 == 0) {
                                            fyb.g();
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
                                                f4 = l1f.f(bArr, i30, kj6Var);
                                                int i83 = kj6Var.b;
                                                if (i83 < 0) {
                                                    fvc.h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return 0;
                                                }
                                                if (i83 == 0) {
                                                    a3eVar3.add("");
                                                } else {
                                                    a3eVar3.add(new String(bArr, f4, i83, h3e.a));
                                                    f4 += i83;
                                                }
                                                while (f4 < i2) {
                                                    int f9 = l1f.f(bArr, f4, kj6Var);
                                                    if (i31 == kj6Var.b) {
                                                        f4 = l1f.f(bArr, f9, kj6Var);
                                                        int i84 = kj6Var.b;
                                                        if (i84 < 0) {
                                                            fvc.h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            return 0;
                                                        }
                                                        if (i84 == 0) {
                                                            a3eVar3.add("");
                                                        } else {
                                                            a3eVar3.add(new String(bArr, f4, i84, h3e.a));
                                                            f4 += i84;
                                                        }
                                                    }
                                                }
                                            } else {
                                                f4 = l1f.f(bArr, i30, kj6Var);
                                                int i85 = kj6Var.b;
                                                if (i85 < 0) {
                                                    fvc.h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return 0;
                                                }
                                                if (i85 == 0) {
                                                    a3eVar3.add("");
                                                } else {
                                                    int i86 = f4 + i85;
                                                    if (!cge.d(f4, i86, bArr)) {
                                                        fvc.h("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    a3eVar3.add(new String(bArr, f4, i85, h3e.a));
                                                    f4 = i86;
                                                }
                                                while (f4 < i2) {
                                                    int f10 = l1f.f(bArr, f4, kj6Var);
                                                    if (i31 == kj6Var.b) {
                                                        f4 = l1f.f(bArr, f10, kj6Var);
                                                        int i87 = kj6Var.b;
                                                        if (i87 < 0) {
                                                            fvc.h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            return 0;
                                                        }
                                                        if (i87 == 0) {
                                                            a3eVar3.add("");
                                                        } else {
                                                            int i88 = f4 + i87;
                                                            if (!cge.d(f4, i88, bArr)) {
                                                                fvc.h("Protocol message had invalid UTF-8.");
                                                                return 0;
                                                            }
                                                            a3eVar3.add(new String(bArr, f4, i87, h3e.a));
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
                                            int c = l1f.c(l9eVar.v(q), i41, bArr, i30, i2, a3eVar3, kj6Var);
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
                                            f3 = l1f.f(bArr, i30, kj6Var);
                                            int i89 = kj6Var.b;
                                            if (i89 < 0) {
                                                fvc.h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                return 0;
                                            }
                                            if (i89 > bArr.length - f3) {
                                                fvc.h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            if (i89 == 0) {
                                                a3eVar3.add(zud.c);
                                            } else {
                                                a3eVar3.add(zud.l(f3, i89, bArr));
                                                f3 += i89;
                                            }
                                            while (f3 < i2) {
                                                int f11 = l1f.f(bArr, f3, kj6Var);
                                                if (i41 == kj6Var.b) {
                                                    f3 = l1f.f(bArr, f11, kj6Var);
                                                    int i90 = kj6Var.b;
                                                    if (i90 < 0) {
                                                        fvc.h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        return 0;
                                                    }
                                                    if (i90 > bArr.length - f3) {
                                                        fvc.h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        return 0;
                                                    }
                                                    if (i90 == 0) {
                                                        a3eVar3.add(zud.c);
                                                    } else {
                                                        a3eVar3.add(zud.l(f3, i90, bArr));
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
                                    case kk7.S /* 30 */:
                                    case 44:
                                        i41 = i41;
                                        i29 = i44;
                                        if (i48 == 2) {
                                            h = l1f.d(bArr, i29, a3eVar3, kj6Var);
                                            i30 = i29;
                                            i32 = i41;
                                            a3eVar = a3eVar3;
                                        } else {
                                            if (i48 == 0) {
                                                h = l1f.h(i41, bArr, i29, i2, a3eVar3, kj6Var);
                                                i30 = i29;
                                                a3eVar = a3eVar3;
                                                i32 = i41;
                                            }
                                            i23 = i45;
                                            i36 = i29;
                                            if (i36 != i29) {
                                            }
                                        }
                                        yqd u3 = l9eVar.u(q);
                                        y5d y5dVar = pbe.a;
                                        if (u3 != null) {
                                            int size = a3eVar.size();
                                            iee ieeVar5 = null;
                                            i33 = h;
                                            i23 = i45;
                                            int i91 = 0;
                                            int i92 = 0;
                                            while (i91 < size) {
                                                iee ieeVar6 = ieeVar5;
                                                Integer num = (Integer) a3eVar.get(i91);
                                                int intValue = num.intValue();
                                                if (u3.a(intValue)) {
                                                    if (i91 != i92) {
                                                        a3eVar.set(i92, num);
                                                    }
                                                    i92++;
                                                    yqdVar = u3;
                                                    ieeVar5 = ieeVar6;
                                                    i34 = i91;
                                                } else {
                                                    if (ieeVar6 == null) {
                                                        l9eVar.i.getClass();
                                                        c2e c2eVar3 = (c2e) obj;
                                                        yqdVar = u3;
                                                        iee ieeVar7 = c2eVar3.zzc;
                                                        if (ieeVar7 == ieeVar2) {
                                                            ieeVar7 = iee.b();
                                                            c2eVar3.zzc = ieeVar7;
                                                        }
                                                        ieeVar5 = ieeVar7;
                                                    } else {
                                                        yqdVar = u3;
                                                        ieeVar5 = ieeVar6;
                                                    }
                                                    i34 = i91;
                                                    ieeVar5.c(i23 << 3, Long.valueOf(intValue));
                                                }
                                                i91 = i34 + 1;
                                                u3 = yqdVar;
                                            }
                                            if (i92 != size) {
                                                a3eVar.subList(i92, size).clear();
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
                                            h2e h2eVar3 = (h2e) a3eVar3;
                                            i36 = l1f.f(bArr, i29, kj6Var);
                                            int i93 = kj6Var.b + i36;
                                            while (i36 < i93) {
                                                int f12 = l1f.f(bArr, i36, kj6Var);
                                                int i94 = kj6Var.b;
                                                h2eVar3.j((i94 >>> 1) ^ (-(i94 & 1)));
                                                i36 = f12;
                                            }
                                            if (i36 != i93) {
                                                fvc.h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                        } else {
                                            if (i48 == 0) {
                                                h2e h2eVar4 = (h2e) a3eVar3;
                                                i36 = l1f.f(bArr, i29, kj6Var);
                                                int i95 = kj6Var.b;
                                                h2eVar4.j((i95 >>> 1) ^ (-(i95 & 1)));
                                                while (i36 < i2) {
                                                    int f13 = l1f.f(bArr, i36, kj6Var);
                                                    if (i41 == kj6Var.b) {
                                                        i36 = l1f.f(bArr, f13, kj6Var);
                                                        int i96 = kj6Var.b;
                                                        h2eVar4.j((i96 >>> 1) ^ (-(i96 & 1)));
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
                                            fyb.g();
                                            return 0;
                                        }
                                        if (i48 == 0) {
                                            fyb.g();
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
                                            bbe v = l9eVar.v(q);
                                            c2e zze = v.zze();
                                            int i98 = i44;
                                            i41 = i41;
                                            int j9 = l1f.j(zze, v, bArr, i98, i2, i97, kj6Var);
                                            int i99 = i97;
                                            kj6 kj6Var9 = kj6Var;
                                            v.zzf(zze);
                                            kj6Var9.d = zze;
                                            a3eVar3.add(zze);
                                            while (true) {
                                                if (j9 < i2) {
                                                    int i100 = i98;
                                                    int f14 = l1f.f(bArr, j9, kj6Var9);
                                                    if (i41 == kj6Var9.b) {
                                                        int i101 = i99;
                                                        c2e zze2 = v.zze();
                                                        j9 = l1f.j(zze2, v, bArr, f14, i2, i101, kj6Var);
                                                        i99 = i101;
                                                        kj6Var9 = kj6Var;
                                                        v.zzf(zze2);
                                                        kj6Var9.d = zze2;
                                                        a3eVar3.add(zze2);
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
                            a3e a3eVar4 = (a3e) unsafe.getObject(obj5, j2);
                            if (!((bsd) a3eVar4).a) {
                                int size2 = a3eVar4.size();
                                a3eVar4 = a3eVar4.zzd(size2 == 0 ? 10 : size2 << 1);
                                unsafe.putObject(obj5, j2, a3eVar4);
                            }
                            bArr6 = bArr;
                            i35 = i2;
                            i36 = l1f.c(l9eVar.v(q), i41, bArr6, i44, i35, a3eVar4, kj6Var);
                            kj6Var7 = kj6Var;
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
                            kj6Var2 = kj6Var;
                            i9 = i22;
                        }
                        i38 = q;
                        ieeVar = ieeVar2;
                        i10 = i41;
                        i8 = i23;
                    }
                }
                if (i10 != i4 || i4 == 0) {
                    c2e c2eVar4 = (c2e) obj2;
                    iee ieeVar8 = c2eVar4.zzc;
                    if (ieeVar8 == ieeVar) {
                        ieeVar8 = iee.b();
                        c2eVar4.zzc = ieeVar8;
                    }
                    l9eVar = this;
                    kj6Var7 = kj6Var;
                    i41 = i10;
                    i36 = l1f.e(i10, bArr2, i9, i2, ieeVar8, kj6Var2);
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

    public final yqd u(int i) {
        return (yqd) this.b[((i / 3) << 1) + 1];
    }

    public final bbe v(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.b;
        bbe bbeVar = (bbe) objArr[i2];
        if (bbeVar != null) {
            return bbeVar;
        }
        bbe a = jae.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final Object w(int i) {
        return this.b[(i / 3) << 1];
    }

    public final Object x(int i, Object obj) {
        bbe v = v(i);
        int s = s(i) & 1048575;
        if (!k(i, obj)) {
            return v.zze();
        }
        Object object = k.getObject(obj, s);
        if (m(object)) {
            return object;
        }
        c2e zze = v.zze();
        if (object != null) {
            v.zzg(zze, object);
        }
        return zze;
    }

    public final Object y(int i, int i2, Object obj) {
        bbe v = v(i2);
        if (!n(i, i2, obj)) {
            return v.zze();
        }
        Object object = k.getObject(obj, s(i2) & 1048575);
        if (m(object)) {
            return object;
        }
        c2e zze = v.zze();
        if (object != null) {
            v.zzg(zze, object);
        }
        return zze;
    }

    @Override // bbe
    public final c2e zze() {
        return (c2e) ((c2e) this.e).d(4);
    }

    @Override // bbe
    public final void zzf(Object obj) {
        if (!m(obj)) {
            return;
        }
        if (obj instanceof c2e) {
            c2e c2eVar = (c2e) obj;
            c2eVar.l();
            c2eVar.zza = 0;
            c2eVar.j();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                this.i.getClass();
                iee ieeVar = ((c2e) obj).zzc;
                if (ieeVar.e) {
                    ieeVar.e = false;
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
                            bsd bsdVar = (bsd) ((a3e) nfe.g(obj, j2));
                            if (!bsdVar.a) {
                                break;
                            } else {
                                bsdVar.a = false;
                                break;
                            }
                        case 50:
                            Object object = unsafe.getObject(obj, j2);
                            if (object == null) {
                                break;
                            } else {
                                ((r7e) object).a = false;
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

    @Override // bbe
    public final void zzg(Object obj, Object obj2) {
        Object obj3;
        if (!m(obj)) {
            w26.j("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                pbe.o(obj, obj2);
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
                        c6c c6cVar = nfe.c;
                        c6cVar.v(obj3, j2, c6cVar.k(obj2, j2));
                        i(i, obj3);
                        continue;
                    }
                case 1:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        c6c c6cVar2 = nfe.c;
                        c6cVar2.w(obj3, j2, c6cVar2.p(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        nfe.c.a.putLong(obj3, j2, nfe.f(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        nfe.c.a.putLong(obj3, j2, nfe.f(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        nfe.h(obj3, j2, nfe.e(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        nfe.c.a.putLong(obj3, j2, nfe.f(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        nfe.h(obj3, j2, nfe.e(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        c6c c6cVar3 = nfe.c;
                        c6cVar3.s(obj3, j2, c6cVar3.x(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        nfe.i(obj3, j2, nfe.g(obj2, j2));
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
                        nfe.i(obj3, j2, nfe.g(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        nfe.h(obj3, j2, nfe.e(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        nfe.h(obj3, j2, nfe.e(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        nfe.h(obj3, j2, nfe.e(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        nfe.c.a.putLong(obj3, j2, nfe.f(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        nfe.h(obj3, j2, nfe.e(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (k(i, obj2)) {
                        obj3 = obj;
                        nfe.c.a.putLong(obj3, j2, nfe.f(obj2, j2));
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
                    a3e a3eVar = (a3e) nfe.g(obj, j2);
                    a3e a3eVar2 = (a3e) nfe.g(obj2, j2);
                    int size = a3eVar.size();
                    int size2 = a3eVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((bsd) a3eVar).a) {
                            a3eVar = a3eVar.zzd(size2 + size);
                        }
                        a3eVar.addAll(a3eVar2);
                    }
                    if (size > 0) {
                        a3eVar2 = a3eVar;
                    }
                    nfe.i(obj, j2, a3eVar2);
                    break;
                case 50:
                    y5d y5dVar = pbe.a;
                    nfe.i(obj, j2, gcd.a(nfe.g(obj, j2), nfe.g(obj2, j2)));
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
                    if (n(i3, i, obj2)) {
                        nfe.i(obj, j2, nfe.g(obj2, j2));
                        nfe.h(obj, iArr[i + 2] & 1048575, i3);
                        break;
                    }
                    break;
                case kk7.w0 /* 60 */:
                    h(i, obj, obj2);
                    break;
                case kk7.x0 /* 61 */:
                case kk7.y0 /* 62 */:
                case kk7.z0 /* 63 */:
                case 64:
                case 65:
                case kk7.C0 /* 66 */:
                case kk7.D0 /* 67 */:
                    if (n(i3, i, obj2)) {
                        nfe.i(obj, j2, nfe.g(obj2, j2));
                        nfe.h(obj, iArr[i + 2] & 1048575, i3);
                        break;
                    }
                    break;
                case kk7.E0 /* 68 */:
                    h(i, obj, obj2);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
    }
}
