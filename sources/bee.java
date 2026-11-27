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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class bee implements rfe {
    public static final int[] j = new int[0];
    public static final Unsafe k;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final hwd e;
    public final int[] f;
    public final int g;
    public final int h;
    public final rad i;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new r2((byte) 4));
        } catch (Throwable unused) {
            unsafe = null;
        }
        k = unsafe;
    }

    public bee(int[] iArr, Object[] objArr, int i, int i2, hwd hwdVar, int[] iArr2, int i3, int i4, rad radVar, zgd zgdVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = iArr2;
        this.g = i3;
        this.h = i4;
        this.i = radVar;
        this.e = hwdVar;
    }

    public static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof s6e) {
            return ((s6e) obj).m();
        }
        return true;
    }

    public static int p(long j2, Object obj) {
        return ((Integer) eke.g(obj, j2)).intValue();
    }

    public static int r(int i) {
        return (i >>> 20) & jn7.d4;
    }

    public static long t(long j2, Object obj) {
        return ((Long) eke.g(obj, j2)).longValue();
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
            StringBuilder l = xnb.l("Field ", str, " for ", name, " not found. Known fields are ");
            l.append(arrays);
            throw new RuntimeException(l.toString(), e);
        }
    }

    @Override // rfe
    public final void a(Object obj, byte[] bArr, int i, int i2, pl6 pl6Var) {
        o(obj, bArr, i, i2, 0, pl6Var);
    }

    @Override // rfe
    public final boolean b(s6e s6eVar, s6e s6eVar2) {
        boolean e;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int s = s(i);
                long j2 = s & 1048575;
                switch (r(s)) {
                    case 0:
                        if (!j(s6eVar, s6eVar2, i)) {
                            break;
                        } else {
                            cac cacVar = eke.c;
                            if (Double.doubleToLongBits(cacVar.k(s6eVar, j2)) != Double.doubleToLongBits(cacVar.k(s6eVar2, j2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 1:
                        if (!j(s6eVar, s6eVar2, i)) {
                            break;
                        } else {
                            cac cacVar2 = eke.c;
                            if (Float.floatToIntBits(cacVar2.p(s6eVar, j2)) != Float.floatToIntBits(cacVar2.p(s6eVar2, j2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 2:
                        if (j(s6eVar, s6eVar2, i) && eke.f(s6eVar, j2) == eke.f(s6eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (j(s6eVar, s6eVar2, i) && eke.f(s6eVar, j2) == eke.f(s6eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (j(s6eVar, s6eVar2, i) && eke.e(s6eVar, j2) == eke.e(s6eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (j(s6eVar, s6eVar2, i) && eke.f(s6eVar, j2) == eke.f(s6eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (j(s6eVar, s6eVar2, i) && eke.e(s6eVar, j2) == eke.e(s6eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (!j(s6eVar, s6eVar2, i)) {
                            break;
                        } else {
                            cac cacVar3 = eke.c;
                            if (cacVar3.x(s6eVar, j2) != cacVar3.x(s6eVar2, j2)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (j(s6eVar, s6eVar2, i) && fge.e(eke.g(s6eVar, j2), eke.g(s6eVar2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (j(s6eVar, s6eVar2, i) && fge.e(eke.g(s6eVar, j2), eke.g(s6eVar2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (j(s6eVar, s6eVar2, i) && fge.e(eke.g(s6eVar, j2), eke.g(s6eVar2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (j(s6eVar, s6eVar2, i) && eke.e(s6eVar, j2) == eke.e(s6eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (j(s6eVar, s6eVar2, i) && eke.e(s6eVar, j2) == eke.e(s6eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (j(s6eVar, s6eVar2, i) && eke.e(s6eVar, j2) == eke.e(s6eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (j(s6eVar, s6eVar2, i) && eke.f(s6eVar, j2) == eke.f(s6eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (j(s6eVar, s6eVar2, i) && eke.e(s6eVar, j2) == eke.e(s6eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (j(s6eVar, s6eVar2, i) && eke.f(s6eVar, j2) == eke.f(s6eVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (j(s6eVar, s6eVar2, i) && fge.e(eke.g(s6eVar, j2), eke.g(s6eVar2, j2))) {
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
                        e = fge.e(eke.g(s6eVar, j2), eke.g(s6eVar2, j2));
                        break;
                    case 50:
                        e = fge.e(eke.g(s6eVar, j2), eke.g(s6eVar2, j2));
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
                        long j3 = iArr[i + 2] & 1048575;
                        if (eke.e(s6eVar, j3) == eke.e(s6eVar2, j3) && fge.e(eke.g(s6eVar, j2), eke.g(s6eVar2, j2))) {
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
            } else if (s6eVar.zzc.equals(s6eVar2.zzc)) {
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
    @Override // rfe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(s6e s6eVar) {
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
                return s6eVar.zzc.hashCode() + (i6 * 53);
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
                    doubleToLongBits = Double.doubleToLongBits(eke.c.k(s6eVar, j2));
                    Charset charset = x7e.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i6 * 53;
                    floatToIntBits = Float.floatToIntBits(eke.c.p(s6eVar, j2));
                    i6 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i6 * 53;
                    doubleToLongBits = eke.f(s6eVar, j2);
                    Charset charset2 = x7e.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i6 * 53;
                    doubleToLongBits = eke.f(s6eVar, j2);
                    Charset charset3 = x7e.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i6 * 53;
                    floatToIntBits = eke.e(s6eVar, j2);
                    i6 = floatToIntBits + i2;
                    break;
                case 5:
                    i = i6 * 53;
                    doubleToLongBits = eke.f(s6eVar, j2);
                    Charset charset4 = x7e.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i6 * 53;
                    floatToIntBits = eke.e(s6eVar, j2);
                    i6 = floatToIntBits + i2;
                    break;
                case 7:
                    i3 = i6 * 53;
                    boolean x = eke.c.x(s6eVar, j2);
                    Charset charset5 = x7e.a;
                    break;
                case 8:
                    i2 = i6 * 53;
                    floatToIntBits = ((String) eke.g(s6eVar, j2)).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object g = eke.g(s6eVar, j2);
                    if (g != null) {
                        i10 = g.hashCode();
                    }
                    i6 = i4 + i10;
                    break;
                case 10:
                    i2 = i6 * 53;
                    floatToIntBits = eke.g(s6eVar, j2).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 11:
                    i2 = i6 * 53;
                    floatToIntBits = eke.e(s6eVar, j2);
                    i6 = floatToIntBits + i2;
                    break;
                case 12:
                    i2 = i6 * 53;
                    floatToIntBits = eke.e(s6eVar, j2);
                    i6 = floatToIntBits + i2;
                    break;
                case 13:
                    i2 = i6 * 53;
                    floatToIntBits = eke.e(s6eVar, j2);
                    i6 = floatToIntBits + i2;
                    break;
                case 14:
                    i = i6 * 53;
                    doubleToLongBits = eke.f(s6eVar, j2);
                    Charset charset6 = x7e.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i6 * 53;
                    floatToIntBits = eke.e(s6eVar, j2);
                    i6 = floatToIntBits + i2;
                    break;
                case 16:
                    i = i6 * 53;
                    doubleToLongBits = eke.f(s6eVar, j2);
                    Charset charset7 = x7e.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i4 = i6 * 53;
                    Object g2 = eke.g(s6eVar, j2);
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
                    i2 = i6 * 53;
                    floatToIntBits = eke.g(s6eVar, j2).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 50:
                    i2 = i6 * 53;
                    floatToIntBits = eke.g(s6eVar, j2).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case jn7.n0 /* 51 */:
                    if (!n(i8, i5, s6eVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) eke.g(s6eVar, j2)).doubleValue());
                        Charset charset8 = x7e.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case jn7.o0 /* 52 */:
                    if (!n(i8, i5, s6eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) eke.g(s6eVar, j2)).floatValue());
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case jn7.p0 /* 53 */:
                    if (!n(i8, i5, s6eVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = t(j2, s6eVar);
                        Charset charset9 = x7e.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case jn7.q0 /* 54 */:
                    if (!n(i8, i5, s6eVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = t(j2, s6eVar);
                        Charset charset10 = x7e.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case jn7.r0 /* 55 */:
                    if (!n(i8, i5, s6eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = p(j2, s6eVar);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 56:
                    if (!n(i8, i5, s6eVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = t(j2, s6eVar);
                        Charset charset11 = x7e.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case jn7.t0 /* 57 */:
                    if (!n(i8, i5, s6eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = p(j2, s6eVar);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case jn7.u0 /* 58 */:
                    if (!n(i8, i5, s6eVar)) {
                        break;
                    } else {
                        i3 = i6 * 53;
                        boolean booleanValue = ((Boolean) eke.g(s6eVar, j2)).booleanValue();
                        Charset charset12 = x7e.a;
                        break;
                    }
                case jn7.v0 /* 59 */:
                    if (!n(i8, i5, s6eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = ((String) eke.g(s6eVar, j2)).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case jn7.w0 /* 60 */:
                    if (!n(i8, i5, s6eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = eke.g(s6eVar, j2).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case jn7.x0 /* 61 */:
                    if (!n(i8, i5, s6eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = eke.g(s6eVar, j2).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case jn7.y0 /* 62 */:
                    if (!n(i8, i5, s6eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = p(j2, s6eVar);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case jn7.z0 /* 63 */:
                    if (!n(i8, i5, s6eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = p(j2, s6eVar);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 64:
                    if (!n(i8, i5, s6eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = p(j2, s6eVar);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 65:
                    if (!n(i8, i5, s6eVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = t(j2, s6eVar);
                        Charset charset13 = x7e.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case jn7.C0 /* 66 */:
                    if (!n(i8, i5, s6eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = p(j2, s6eVar);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case jn7.D0 /* 67 */:
                    if (!n(i8, i5, s6eVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = t(j2, s6eVar);
                        Charset charset14 = x7e.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case jn7.E0 /* 68 */:
                    if (!n(i8, i5, s6eVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = eke.g(s6eVar, j2).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
            }
            i5 += 3;
        }
    }

    @Override // rfe
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
                    if (l(obj, i2, i, i3, i11) && !v(i2).d(eke.g(obj, s & 1048575))) {
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                } else {
                    if (r != 27) {
                        if (r == 60 || r == 68) {
                            if (n(i8, i2, obj) && !v(i2).d(eke.g(obj, s & 1048575))) {
                            }
                        } else if (r != 49) {
                            if (r == 50 && !((hce) eke.g(obj, s & 1048575)).isEmpty()) {
                                w(i2).getClass();
                                grb.o();
                                return false;
                            }
                        }
                        i5++;
                        i6 = i;
                        i4 = i3;
                    }
                    List list = (List) eke.g(obj, s & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        rfe v = v(i2);
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
    
        r8 = xnb.g(r11 << 3, 8, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x057d, code lost:
    
        if (r0.l(r1, r2, r3, r4, r5) != false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x067d, code lost:
    
        r8 = xnb.g(r11 << 3, 4, r8);
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
    @Override // rfe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(s6e s6eVar) {
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
        bee beeVar = this;
        s6e s6eVar2 = s6eVar;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = beeVar.a;
            if (i7 >= iArr.length) {
                return s6eVar2.zzc.a() + i9;
            }
            int s = beeVar.s(i7);
            int r = r(s);
            int i10 = iArr[i7];
            int i11 = iArr[i7 + 2];
            int i12 = i11 & i5;
            Unsafe unsafe = k;
            if (r <= 17) {
                if (i12 != i6) {
                    i8 = i12 == i5 ? 0 : unsafe.getInt(s6eVar2, i12);
                    i6 = i12;
                }
                i = 1 << (i11 >>> 20);
            } else {
                i = 0;
            }
            int i13 = s & i5;
            if (r >= t3e.b.a) {
                byte b12 = t3e.c.a;
            }
            long j4 = i13;
            switch (r) {
                case 0:
                    if (!beeVar.l(s6eVar2, i7, i6, i8, i)) {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                    i9 = xnb.g(i10 << 3, 8, i9);
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case 1:
                    break;
                case 2:
                    if (beeVar.l(s6eVar2, i7, i6, i8, i)) {
                        long j5 = unsafe.getLong(s6eVar2, j4);
                        b = s0e.b(i10 << 3);
                        c = s0e.c(j5);
                        i3 = c + b;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case 3:
                    if (beeVar.l(s6eVar2, i7, i6, i8, i)) {
                        long j6 = unsafe.getLong(s6eVar2, j4);
                        b = s0e.b(i10 << 3);
                        c = s0e.c(j6);
                        i3 = c + b;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case 4:
                    if (beeVar.l(s6eVar2, i7, i6, i8, i)) {
                        long j7 = unsafe.getInt(s6eVar2, j4);
                        b = s0e.b(i10 << 3);
                        c = s0e.c(j7);
                        i3 = c + b;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    if (beeVar.l(s6eVar2, i7, i6, i8, i)) {
                        i9 = xnb.g(i10 << 3, 1, i9);
                    }
                    s6eVar2 = s6eVar;
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case 8:
                    if (beeVar.l(s6eVar2, i7, i6, i8, i)) {
                        int i14 = i10 << 3;
                        Object object = unsafe.getObject(s6eVar2, j4);
                        if (object instanceof pzd) {
                            b2 = s0e.b(i14);
                            j2 = ((pzd) object).j();
                            i9 = xnb.h(j2, j2, b2, i9);
                        } else {
                            i9 += s0e.a((String) object) + s0e.b(i14);
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case 9:
                    if (beeVar.l(s6eVar2, i7, i6, i8, i)) {
                        Object object2 = unsafe.getObject(s6eVar2, j4);
                        rfe v = beeVar.v(i7);
                        rad radVar = fge.a;
                        b3 = s0e.b(i10 << 3);
                        b4 = ((hwd) object2).b(v);
                        i9 = xnb.h(b4, b4, b3, i9);
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case 10:
                    if (beeVar.l(s6eVar2, i7, i6, i8, i)) {
                        pzd pzdVar = (pzd) unsafe.getObject(s6eVar2, j4);
                        b2 = s0e.b(i10 << 3);
                        j2 = pzdVar.j();
                        i9 = xnb.h(j2, j2, b2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case 11:
                    if (beeVar.l(s6eVar2, i7, i6, i8, i)) {
                        i9 = xnb.g(unsafe.getInt(s6eVar2, j4), s0e.b(i10 << 3), i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case 12:
                    if (beeVar.l(s6eVar2, i7, i6, i8, i)) {
                        long j8 = unsafe.getInt(s6eVar2, j4);
                        b = s0e.b(i10 << 3);
                        c = s0e.c(j8);
                        i3 = c + b;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    if (beeVar.l(s6eVar2, i7, i6, i8, i)) {
                        int i15 = unsafe.getInt(s6eVar2, j4);
                        b5 = s0e.b(i10 << 3);
                        i2 = (i15 << 1) ^ (i15 >> 31);
                        i9 = xnb.g(i2, b5, i9);
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case 16:
                    if (beeVar.l(s6eVar2, i7, i6, i8, i)) {
                        long j9 = unsafe.getLong(s6eVar2, j4);
                        b = s0e.b(i10 << 3);
                        c = s0e.c((j9 << 1) ^ (j9 >> 63));
                        i3 = c + b;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case 17:
                    if (beeVar.l(s6eVar2, i7, i6, i8, i)) {
                        i3 = s0e.r(i10, (hwd) unsafe.getObject(s6eVar2, j4), beeVar.v(i7));
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case 18:
                    i3 = fge.h(i10, (List) unsafe.getObject(s6eVar2, j4));
                    i9 += i3;
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case 19:
                    i3 = fge.g(i10, (List) unsafe.getObject(s6eVar2, j4));
                    i9 += i3;
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case 20:
                    List list = (List) unsafe.getObject(s6eVar2, j4);
                    rad radVar2 = fge.a;
                    if (list.size() != 0) {
                        b6 = (s0e.b(i10 << 3) * list.size()) + fge.j(list);
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case 21:
                    List list2 = (List) unsafe.getObject(s6eVar2, j4);
                    rad radVar3 = fge.a;
                    size = list2.size();
                    if (size != 0) {
                        n = fge.n(list2);
                        b7 = s0e.b(i10 << 3);
                        b6 = (b7 * size) + n;
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case 22:
                    List list3 = (List) unsafe.getObject(s6eVar2, j4);
                    rad radVar4 = fge.a;
                    size = list3.size();
                    if (size != 0) {
                        n = fge.i(list3);
                        b7 = s0e.b(i10 << 3);
                        b6 = (b7 * size) + n;
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case 23:
                    i3 = fge.h(i10, (List) unsafe.getObject(s6eVar2, j4));
                    i9 += i3;
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case 24:
                    i3 = fge.g(i10, (List) unsafe.getObject(s6eVar2, j4));
                    i9 += i3;
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case 25:
                    List list4 = (List) unsafe.getObject(s6eVar2, j4);
                    rad radVar5 = fge.a;
                    int size3 = list4.size();
                    i9 += size3 == 0 ? 0 : (s0e.b(i10 << 3) + 1) * size3;
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case 26:
                    List list5 = (List) unsafe.getObject(s6eVar2, j4);
                    rad radVar6 = fge.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        b6 = s0e.b(i10 << 3) * size4;
                        if (list5 instanceof w9e) {
                            w9e w9eVar = (w9e) list5;
                            for (int i16 = 0; i16 < size4; i16++) {
                                Object zza = w9eVar.zza();
                                if (zza instanceof pzd) {
                                    int j10 = ((pzd) zza).j();
                                    b6 = xnb.g(j10, j10, b6);
                                } else {
                                    b6 = s0e.a((String) zza) + b6;
                                }
                            }
                        } else {
                            for (int i17 = 0; i17 < size4; i17++) {
                                Object obj = list5.get(i17);
                                if (obj instanceof pzd) {
                                    int j11 = ((pzd) obj).j();
                                    b6 = xnb.g(j11, j11, b6);
                                } else {
                                    b6 = s0e.a((String) obj) + b6;
                                }
                            }
                        }
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case 27:
                    List list6 = (List) unsafe.getObject(s6eVar2, j4);
                    rfe v2 = beeVar.v(i7);
                    rad radVar7 = fge.a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        b8 = 0;
                    } else {
                        b8 = s0e.b(i10 << 3) * size5;
                        for (int i18 = 0; i18 < size5; i18++) {
                            int b13 = ((hwd) list6.get(i18)).b(v2);
                            b8 = xnb.g(b13, b13, b8);
                        }
                    }
                    i9 += b8;
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case 28:
                    List list7 = (List) unsafe.getObject(s6eVar2, j4);
                    rad radVar8 = fge.a;
                    int size6 = list7.size();
                    if (size6 != 0) {
                        b6 = s0e.b(i10 << 3) * size6;
                        for (int i19 = 0; i19 < list7.size(); i19++) {
                            int j12 = ((pzd) list7.get(i19)).j();
                            b6 = xnb.g(j12, j12, b6);
                        }
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case 29:
                    List list8 = (List) unsafe.getObject(s6eVar2, j4);
                    rad radVar9 = fge.a;
                    size = list8.size();
                    if (size != 0) {
                        n = fge.m(list8);
                        b7 = s0e.b(i10 << 3);
                        b6 = (b7 * size) + n;
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case jn7.S /* 30 */:
                    List list9 = (List) unsafe.getObject(s6eVar2, j4);
                    rad radVar10 = fge.a;
                    size = list9.size();
                    if (size != 0) {
                        n = fge.f(list9);
                        b7 = s0e.b(i10 << 3);
                        b6 = (b7 * size) + n;
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case 31:
                    i3 = fge.g(i10, (List) unsafe.getObject(s6eVar2, j4));
                    i9 += i3;
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case 32:
                    i3 = fge.h(i10, (List) unsafe.getObject(s6eVar2, j4));
                    i9 += i3;
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case 33:
                    List list10 = (List) unsafe.getObject(s6eVar2, j4);
                    rad radVar11 = fge.a;
                    size = list10.size();
                    if (size != 0) {
                        n = fge.k(list10);
                        b7 = s0e.b(i10 << 3);
                        b6 = (b7 * size) + n;
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case 34:
                    List list11 = (List) unsafe.getObject(s6eVar2, j4);
                    rad radVar12 = fge.a;
                    size = list11.size();
                    if (size != 0) {
                        n = fge.l(list11);
                        b7 = s0e.b(i10 << 3);
                        b6 = (b7 * size) + n;
                        i9 += b6;
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                    b6 = 0;
                    i9 += b6;
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case 35:
                    List list12 = (List) unsafe.getObject(s6eVar2, j4);
                    rad radVar13 = fge.a;
                    size2 = list12.size() << 3;
                    if (size2 > 0) {
                        b9 = s0e.b(i10 << 3);
                        i9 = xnb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(s6eVar2, j4);
                    rad radVar14 = fge.a;
                    size2 = list13.size() << 2;
                    if (size2 > 0) {
                        b9 = s0e.b(i10 << 3);
                        i9 = xnb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case 37:
                    size2 = fge.j((List) unsafe.getObject(s6eVar2, j4));
                    if (size2 > 0) {
                        b9 = s0e.b(i10 << 3);
                        i9 = xnb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case 38:
                    size2 = fge.n((List) unsafe.getObject(s6eVar2, j4));
                    if (size2 > 0) {
                        b9 = s0e.b(i10 << 3);
                        i9 = xnb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case 39:
                    size2 = fge.i((List) unsafe.getObject(s6eVar2, j4));
                    if (size2 > 0) {
                        b9 = s0e.b(i10 << 3);
                        i9 = xnb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(s6eVar2, j4);
                    rad radVar15 = fge.a;
                    size2 = list14.size() << 3;
                    if (size2 > 0) {
                        b9 = s0e.b(i10 << 3);
                        i9 = xnb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(s6eVar2, j4);
                    rad radVar16 = fge.a;
                    size2 = list15.size() << 2;
                    if (size2 > 0) {
                        b9 = s0e.b(i10 << 3);
                        i9 = xnb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(s6eVar2, j4);
                    rad radVar17 = fge.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        b9 = s0e.b(i10 << 3);
                        i9 = xnb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case 43:
                    size2 = fge.m((List) unsafe.getObject(s6eVar2, j4));
                    if (size2 > 0) {
                        b9 = s0e.b(i10 << 3);
                        i9 = xnb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case 44:
                    size2 = fge.f((List) unsafe.getObject(s6eVar2, j4));
                    if (size2 > 0) {
                        b9 = s0e.b(i10 << 3);
                        i9 = xnb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(s6eVar2, j4);
                    rad radVar18 = fge.a;
                    size2 = list17.size() << 2;
                    if (size2 > 0) {
                        b9 = s0e.b(i10 << 3);
                        i9 = xnb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(s6eVar2, j4);
                    rad radVar19 = fge.a;
                    size2 = list18.size() << 3;
                    if (size2 > 0) {
                        b9 = s0e.b(i10 << 3);
                        i9 = xnb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case 47:
                    size2 = fge.k((List) unsafe.getObject(s6eVar2, j4));
                    if (size2 > 0) {
                        b9 = s0e.b(i10 << 3);
                        i9 = xnb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case 48:
                    size2 = fge.l((List) unsafe.getObject(s6eVar2, j4));
                    if (size2 > 0) {
                        b9 = s0e.b(i10 << 3);
                        i9 = xnb.h(size2, b9, size2, i9);
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(s6eVar2, j4);
                    rfe v3 = beeVar.v(i7);
                    rad radVar20 = fge.a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i20 = 0; i20 < size7; i20++) {
                            i4 += s0e.r(i10, (hwd) list19.get(i20), v3);
                        }
                    }
                    i9 += i4;
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case 50:
                    hce hceVar = (hce) unsafe.getObject(s6eVar2, j4);
                    if (beeVar.w(i7) != null) {
                        grb.o();
                        return 0;
                    }
                    if (hceVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = hceVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case jn7.n0 /* 51 */:
                    if (!beeVar.n(i10, i7, s6eVar2)) {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                    i9 = xnb.g(i10 << 3, 8, i9);
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case jn7.o0 /* 52 */:
                    if (!beeVar.n(i10, i7, s6eVar2)) {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                    i9 = xnb.g(i10 << 3, 4, i9);
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case jn7.p0 /* 53 */:
                    if (beeVar.n(i10, i7, s6eVar2)) {
                        long t = t(j4, s6eVar2);
                        b10 = s0e.b(i10 << 3);
                        c2 = s0e.c(t);
                        i3 = c2 + b10;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case jn7.q0 /* 54 */:
                    if (beeVar.n(i10, i7, s6eVar2)) {
                        long t2 = t(j4, s6eVar2);
                        b10 = s0e.b(i10 << 3);
                        c2 = s0e.c(t2);
                        i3 = c2 + b10;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case jn7.r0 /* 55 */:
                    if (beeVar.n(i10, i7, s6eVar2)) {
                        long p = p(j4, s6eVar2);
                        b10 = s0e.b(i10 << 3);
                        c2 = s0e.c(p);
                        i3 = c2 + b10;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case 56:
                    if (!beeVar.n(i10, i7, s6eVar2)) {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                    i9 = xnb.g(i10 << 3, 8, i9);
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case jn7.t0 /* 57 */:
                    if (!beeVar.n(i10, i7, s6eVar2)) {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                    i9 = xnb.g(i10 << 3, 4, i9);
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case jn7.u0 /* 58 */:
                    if (beeVar.n(i10, i7, s6eVar2)) {
                        i9 = xnb.g(i10 << 3, 1, i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case jn7.v0 /* 59 */:
                    if (beeVar.n(i10, i7, s6eVar2)) {
                        int i21 = i10 << 3;
                        Object object3 = unsafe.getObject(s6eVar2, j4);
                        if (object3 instanceof pzd) {
                            b11 = s0e.b(i21);
                            j3 = ((pzd) object3).j();
                            i9 = xnb.h(j3, j3, b11, i9);
                            i7 += 3;
                            i5 = 1048575;
                            beeVar = this;
                        } else {
                            i3 = s0e.a((String) object3) + s0e.b(i21);
                            i9 += i3;
                            i7 += 3;
                            i5 = 1048575;
                            beeVar = this;
                        }
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case jn7.w0 /* 60 */:
                    if (beeVar.n(i10, i7, s6eVar2)) {
                        Object object4 = unsafe.getObject(s6eVar2, j4);
                        rfe v4 = beeVar.v(i7);
                        rad radVar21 = fge.a;
                        b3 = s0e.b(i10 << 3);
                        b4 = ((hwd) object4).b(v4);
                        i9 = xnb.h(b4, b4, b3, i9);
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case jn7.x0 /* 61 */:
                    if (beeVar.n(i10, i7, s6eVar2)) {
                        pzd pzdVar2 = (pzd) unsafe.getObject(s6eVar2, j4);
                        b11 = s0e.b(i10 << 3);
                        j3 = pzdVar2.j();
                        i9 = xnb.h(j3, j3, b11, i9);
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case jn7.y0 /* 62 */:
                    if (beeVar.n(i10, i7, s6eVar2)) {
                        i2 = p(j4, s6eVar2);
                        b5 = s0e.b(i10 << 3);
                        i9 = xnb.g(i2, b5, i9);
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case jn7.z0 /* 63 */:
                    if (beeVar.n(i10, i7, s6eVar2)) {
                        long p2 = p(j4, s6eVar2);
                        b10 = s0e.b(i10 << 3);
                        c2 = s0e.c(p2);
                        i3 = c2 + b10;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case 64:
                    if (!beeVar.n(i10, i7, s6eVar2)) {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                    i9 = xnb.g(i10 << 3, 4, i9);
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case 65:
                    if (!beeVar.n(i10, i7, s6eVar2)) {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                    i9 = xnb.g(i10 << 3, 8, i9);
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case jn7.C0 /* 66 */:
                    if (beeVar.n(i10, i7, s6eVar2)) {
                        int p3 = p(j4, s6eVar2);
                        i9 = xnb.g((p3 << 1) ^ (p3 >> 31), s0e.b(i10 << 3), i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
                case jn7.D0 /* 67 */:
                    if (beeVar.n(i10, i7, s6eVar2)) {
                        long t3 = t(j4, s6eVar2);
                        b10 = s0e.b(i10 << 3);
                        c2 = s0e.c((t3 << 1) ^ (t3 >> 63));
                        i3 = c2 + b10;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                case jn7.E0 /* 68 */:
                    if (beeVar.n(i10, i7, s6eVar2)) {
                        i3 = s0e.r(i10, (hwd) unsafe.getObject(s6eVar2, j4), beeVar.v(i7));
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                        beeVar = this;
                    }
                default:
                    i7 += 3;
                    i5 = 1048575;
                    beeVar = this;
            }
        }
    }

    @Override // rfe
    public final void f(Object obj, oqd oqdVar) {
        int i;
        int i2;
        bee beeVar = this;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (true) {
            int[] iArr = beeVar.a;
            if (i4 >= iArr.length) {
                ((s6e) obj).zzc.d(oqdVar);
                return;
            }
            int s = beeVar.s(i4);
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
                    if (beeVar.l(obj, i4, i6, i5, i)) {
                        ((s0e) oqdVar.a).h(i7, Double.doubleToRawLongBits(eke.c.k(obj, j2)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (beeVar.l(obj, i4, i6, i5, i)) {
                        ((s0e) oqdVar.a).f(i7, Float.floatToRawIntBits(eke.c.p(obj, j2)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (beeVar.l(obj, i4, i6, i5, i)) {
                        ((s0e) oqdVar.a).p(i7, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (beeVar.l(obj, i4, i6, i5, i)) {
                        ((s0e) oqdVar.a).p(i7, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (beeVar.l(obj, i4, i6, i5, i)) {
                        ((s0e) oqdVar.a).j(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (beeVar.l(obj, i4, i6, i5, i)) {
                        ((s0e) oqdVar.a).h(i7, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (beeVar.l(obj, i4, i6, i5, i)) {
                        ((s0e) oqdVar.a).f(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (beeVar.l(obj, i4, i6, i5, i)) {
                        byte x = eke.c.x(obj, j2);
                        s0e s0eVar = (s0e) oqdVar.a;
                        s0eVar.o(i7 << 3);
                        int i10 = s0eVar.d;
                        try {
                            int i11 = i10 + 1;
                            try {
                                s0eVar.b[i10] = x;
                                s0eVar.d = i11;
                                break;
                            } catch (IndexOutOfBoundsException e) {
                                e = e;
                                i10 = i11;
                                throw new wk2(i10, s0eVar.c, 1, e);
                            }
                        } catch (IndexOutOfBoundsException e2) {
                            e = e2;
                        }
                    } else {
                        continue;
                    }
                case 8:
                    if (beeVar.l(obj, i4, i6, i5, i)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            ((s0e) oqdVar.a).l(i7, (String) object);
                            break;
                        } else {
                            ((s0e) oqdVar.a).e(i7, (pzd) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (beeVar.l(obj, i4, i6, i5, i)) {
                        oqdVar.h(i7, unsafe.getObject(obj, j2), beeVar.v(i4));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (beeVar.l(obj, i4, i6, i5, i)) {
                        ((s0e) oqdVar.a).e(i7, (pzd) unsafe.getObject(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (beeVar.l(obj, i4, i6, i5, i)) {
                        ((s0e) oqdVar.a).n(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (beeVar.l(obj, i4, i6, i5, i)) {
                        ((s0e) oqdVar.a).j(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (beeVar.l(obj, i4, i6, i5, i)) {
                        ((s0e) oqdVar.a).f(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (beeVar.l(obj, i4, i6, i5, i)) {
                        ((s0e) oqdVar.a).h(i7, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (beeVar.l(obj, i4, i6, i5, i)) {
                        int i12 = unsafe.getInt(obj, j2);
                        ((s0e) oqdVar.a).n(i7, (i12 << 1) ^ (i12 >> 31));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (beeVar.l(obj, i4, i6, i5, i)) {
                        long j3 = unsafe.getLong(obj, j2);
                        ((s0e) oqdVar.a).p(i7, (j3 << 1) ^ (j3 >> 63));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (beeVar.l(obj, i4, i6, i5, i)) {
                        oqdVar.f(i7, unsafe.getObject(obj, j2), beeVar.v(i4));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    fge.q(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, false);
                    break;
                case 19:
                    fge.u(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, false);
                    break;
                case 20:
                    fge.w(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, false);
                    break;
                case 21:
                    fge.d(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, false);
                    break;
                case 22:
                    fge.v(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, false);
                    break;
                case 23:
                    fge.t(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, false);
                    break;
                case 24:
                    fge.s(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, false);
                    break;
                case 25:
                    fge.p(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, false);
                    break;
                case 26:
                    int i13 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j2);
                    rad radVar = fge.a;
                    if (list != null && !list.isEmpty()) {
                        s0e s0eVar2 = (s0e) oqdVar.a;
                        if (list instanceof w9e) {
                            w9e w9eVar = (w9e) list;
                            for (int i14 = 0; i14 < list.size(); i14++) {
                                Object zza = w9eVar.zza();
                                if (zza instanceof String) {
                                    s0eVar2.l(i13, (String) zza);
                                } else {
                                    s0eVar2.e(i13, (pzd) zza);
                                }
                            }
                            break;
                        } else {
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                s0eVar2.l(i13, (String) list.get(i15));
                            }
                            break;
                        }
                    }
                    break;
                case 27:
                    int i16 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    rfe v = beeVar.v(i4);
                    rad radVar2 = fge.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i17 = 0; i17 < list2.size(); i17++) {
                            oqdVar.h(i16, list2.get(i17), v);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i18 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    rad radVar3 = fge.a;
                    if (list3 != null && !list3.isEmpty()) {
                        oqdVar.getClass();
                        for (int i19 = 0; i19 < list3.size(); i19++) {
                            ((s0e) oqdVar.a).e(i18, (pzd) list3.get(i19));
                        }
                        break;
                    }
                    break;
                case 29:
                    fge.c(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, false);
                    break;
                case jn7.S /* 30 */:
                    fge.r(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, false);
                    break;
                case 31:
                    fge.x(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, false);
                    break;
                case 32:
                    fge.y(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, false);
                    break;
                case 33:
                    fge.a(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, false);
                    break;
                case 34:
                    fge.b(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, false);
                    break;
                case 35:
                    fge.q(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, true);
                    break;
                case 36:
                    fge.u(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, true);
                    break;
                case 37:
                    fge.w(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, true);
                    break;
                case 38:
                    fge.d(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, true);
                    break;
                case 39:
                    fge.v(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, true);
                    break;
                case 40:
                    fge.t(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, true);
                    break;
                case 41:
                    fge.s(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, true);
                    break;
                case 42:
                    fge.p(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, true);
                    break;
                case 43:
                    fge.c(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, true);
                    break;
                case 44:
                    fge.r(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, true);
                    break;
                case 45:
                    fge.x(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, true);
                    break;
                case 46:
                    fge.y(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, true);
                    break;
                case 47:
                    fge.a(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, true);
                    break;
                case 48:
                    fge.b(iArr[i4], (List) unsafe.getObject(obj, j2), oqdVar, true);
                    break;
                case 49:
                    int i20 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    rfe v2 = beeVar.v(i4);
                    rad radVar4 = fge.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            oqdVar.f(i20, list4.get(i21), v2);
                        }
                        break;
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j2) != null) {
                        beeVar.w(i4).getClass();
                        grb.o();
                        return;
                    }
                    break;
                case jn7.n0 /* 51 */:
                    if (beeVar.n(i7, i4, obj)) {
                        ((s0e) oqdVar.a).h(i7, Double.doubleToRawLongBits(((Double) eke.g(obj, j2)).doubleValue()));
                        break;
                    } else {
                        break;
                    }
                case jn7.o0 /* 52 */:
                    if (beeVar.n(i7, i4, obj)) {
                        ((s0e) oqdVar.a).f(i7, Float.floatToRawIntBits(((Float) eke.g(obj, j2)).floatValue()));
                        break;
                    } else {
                        break;
                    }
                case jn7.p0 /* 53 */:
                    if (beeVar.n(i7, i4, obj)) {
                        ((s0e) oqdVar.a).p(i7, t(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case jn7.q0 /* 54 */:
                    if (beeVar.n(i7, i4, obj)) {
                        ((s0e) oqdVar.a).p(i7, t(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case jn7.r0 /* 55 */:
                    if (beeVar.n(i7, i4, obj)) {
                        ((s0e) oqdVar.a).j(i7, p(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (beeVar.n(i7, i4, obj)) {
                        ((s0e) oqdVar.a).h(i7, t(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case jn7.t0 /* 57 */:
                    if (beeVar.n(i7, i4, obj)) {
                        ((s0e) oqdVar.a).f(i7, p(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case jn7.u0 /* 58 */:
                    if (beeVar.n(i7, i4, obj)) {
                        byte booleanValue = ((Boolean) eke.g(obj, j2)).booleanValue();
                        s0e s0eVar3 = (s0e) oqdVar.a;
                        s0eVar3.o(i7 << 3);
                        int i22 = s0eVar3.d;
                        try {
                            i2 = i22 + 1;
                        } catch (IndexOutOfBoundsException e3) {
                            e = e3;
                        }
                        try {
                            s0eVar3.b[i22] = booleanValue;
                            s0eVar3.d = i2;
                            break;
                        } catch (IndexOutOfBoundsException e4) {
                            e = e4;
                            i22 = i2;
                            throw new wk2(i22, s0eVar3.c, 1, e);
                        }
                    } else {
                        continue;
                    }
                case jn7.v0 /* 59 */:
                    if (beeVar.n(i7, i4, obj)) {
                        Object object2 = unsafe.getObject(obj, j2);
                        if (object2 instanceof String) {
                            ((s0e) oqdVar.a).l(i7, (String) object2);
                            break;
                        } else {
                            ((s0e) oqdVar.a).e(i7, (pzd) object2);
                            break;
                        }
                    } else {
                        break;
                    }
                case jn7.w0 /* 60 */:
                    if (beeVar.n(i7, i4, obj)) {
                        oqdVar.h(i7, unsafe.getObject(obj, j2), beeVar.v(i4));
                        break;
                    } else {
                        break;
                    }
                case jn7.x0 /* 61 */:
                    if (beeVar.n(i7, i4, obj)) {
                        ((s0e) oqdVar.a).e(i7, (pzd) unsafe.getObject(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case jn7.y0 /* 62 */:
                    if (beeVar.n(i7, i4, obj)) {
                        ((s0e) oqdVar.a).n(i7, p(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case jn7.z0 /* 63 */:
                    if (beeVar.n(i7, i4, obj)) {
                        ((s0e) oqdVar.a).j(i7, p(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (beeVar.n(i7, i4, obj)) {
                        ((s0e) oqdVar.a).f(i7, p(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (beeVar.n(i7, i4, obj)) {
                        ((s0e) oqdVar.a).h(i7, t(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case jn7.C0 /* 66 */:
                    if (beeVar.n(i7, i4, obj)) {
                        int p = p(j2, obj);
                        ((s0e) oqdVar.a).n(i7, (p << 1) ^ (p >> 31));
                        break;
                    } else {
                        break;
                    }
                case jn7.D0 /* 67 */:
                    if (beeVar.n(i7, i4, obj)) {
                        long t = t(j2, obj);
                        ((s0e) oqdVar.a).p(i7, (t << 1) ^ (t >> 63));
                        break;
                    } else {
                        break;
                    }
                case jn7.E0 /* 68 */:
                    if (beeVar.n(i7, i4, obj)) {
                        oqdVar.f(i7, unsafe.getObject(obj, j2), beeVar.v(i4));
                        break;
                    } else {
                        break;
                    }
            }
            i4 += 3;
            i3 = 1048575;
            beeVar = this;
        }
    }

    public final void g(int i, Object obj, Object obj2) {
        if (k(i, obj2)) {
            long s = s(i) & 1048575;
            Unsafe unsafe = k;
            Object object = unsafe.getObject(obj2, s);
            if (object == null) {
                grb.i(dze.d("Source subfield ", this.a[i], " is present but null: ", obj2.toString()));
                return;
            }
            rfe v = v(i);
            if (!k(i, obj)) {
                if (m(object)) {
                    s6e zze = v.zze();
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
                s6e zze2 = v.zze();
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
                grb.i(dze.d("Source subfield ", iArr[i], " is present but null: ", obj2.toString()));
                return;
            }
            rfe v = v(i);
            if (!n(i2, i, obj)) {
                if (m(object)) {
                    s6e zze = v.zze();
                    v.zzg(zze, object);
                    unsafe.putObject(obj, s, zze);
                } else {
                    unsafe.putObject(obj, s, object);
                }
                eke.h(obj, iArr[i + 2] & 1048575, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, s);
            if (!m(object2)) {
                s6e zze2 = v.zze();
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
        eke.h(obj, j2, eke.e(obj, j2) | (1 << (i2 >>> 20)));
    }

    public final boolean j(s6e s6eVar, s6e s6eVar2, int i) {
        return k(i, s6eVar) == k(i, s6eVar2);
    }

    public final boolean k(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = i2 & 1048575;
        if (j2 != 1048575) {
            return (eke.e(obj, j2) & (1 << (i2 >>> 20))) != 0;
        }
        int s = s(i);
        long j3 = 1048575 & s;
        switch (r(s)) {
            case 0:
                if (Double.doubleToRawLongBits(eke.c.k(obj, j3)) != 0) {
                }
                break;
            case 1:
                if (Float.floatToRawIntBits(eke.c.p(obj, j3)) != 0) {
                }
                break;
            case 2:
                if (eke.f(obj, j3) != 0) {
                }
                break;
            case 3:
                if (eke.f(obj, j3) != 0) {
                }
                break;
            case 4:
                if (eke.e(obj, j3) != 0) {
                }
                break;
            case 5:
                if (eke.f(obj, j3) != 0) {
                }
                break;
            case 6:
                if (eke.e(obj, j3) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object g = eke.g(obj, j3);
                if (!(g instanceof String)) {
                    if (!(g instanceof pzd)) {
                        iy8.d();
                        break;
                    } else if (!pzd.c.equals(g)) {
                    }
                } else if (!((String) g).isEmpty()) {
                }
                break;
            case 9:
                if (eke.g(obj, j3) != null) {
                }
                break;
            case 10:
                if (!pzd.c.equals(eke.g(obj, j3))) {
                }
                break;
            case 11:
                if (eke.e(obj, j3) != 0) {
                }
                break;
            case 12:
                if (eke.e(obj, j3) != 0) {
                }
                break;
            case 13:
                if (eke.e(obj, j3) != 0) {
                }
                break;
            case 14:
                if (eke.f(obj, j3) != 0) {
                }
                break;
            case 15:
                if (eke.e(obj, j3) != 0) {
                }
                break;
            case 16:
                if (eke.f(obj, j3) != 0) {
                }
                break;
            case 17:
                if (eke.g(obj, j3) != null) {
                }
                break;
            default:
                iy8.d();
                break;
        }
        return false;
    }

    public final boolean l(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? k(i, obj) : (i3 & i4) != 0;
    }

    public final boolean n(int i, int i2, Object obj) {
        return eke.e(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:529:0x030f, code lost:
    
        p3d.l("Protocol message had invalid UTF-8.");
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
    
        p3d.l("Protocol message had invalid UTF-8.");
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
        r6 = eke.g(r8, s(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0d8d, code lost:
    
        if (r6 == null) goto L684;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0d93, code lost:
    
        if (u(r4) != null) goto L682;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0d98, code lost:
    
        r6 = (hce) r6;
        w(r4).getClass();
        grb.o();
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
    
        p3d.l("Failed to parse the message.");
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
    
        p3d.l("Failed to parse the message.");
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
    public final int o(Object obj, byte[] bArr, int i, int i2, int i3, pl6 pl6Var) {
        int i4;
        Unsafe unsafe;
        int[] iArr;
        Object obj2;
        int i5;
        int q;
        int i6;
        int i7;
        zie zieVar;
        pl6 pl6Var2;
        int i8;
        byte[] bArr2;
        int i9;
        int i10;
        int i11;
        int i12;
        byte[] bArr3;
        pl6 pl6Var3;
        int i13;
        int i14;
        int i15;
        int i16;
        Unsafe unsafe2;
        pl6 pl6Var4;
        Object obj3;
        Unsafe unsafe3;
        int i17;
        byte[] bArr4;
        pl6 pl6Var5;
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
        hce hceVar;
        int i24;
        int i25;
        int i26;
        int i27;
        byte[] bArr5;
        pl6 pl6Var6;
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
        q7e q7eVar;
        int i32;
        int i33;
        ovd ovdVar;
        int i34;
        bee beeVar = this;
        Object obj5 = obj;
        byte[] bArr6 = bArr;
        int i35 = i2;
        pl6 pl6Var7 = pl6Var;
        if (!m(obj5)) {
            lq5.j("Mutating immutable message: ".concat(String.valueOf(obj5)));
            return 0;
        }
        int i36 = i;
        int i37 = -1;
        int i38 = 0;
        int i39 = 1048575;
        int i40 = 0;
        int i41 = 0;
        while (true) {
            int[] iArr2 = beeVar.a;
            Unsafe unsafe5 = k;
            if (i36 < i35) {
                int i42 = i36 + 1;
                int i43 = bArr6[i36];
                if (i43 < 0) {
                    i42 = d6f.g(i43, bArr6, i42, pl6Var7);
                    i43 = pl6Var7.b;
                }
                int i44 = i42;
                i41 = i43;
                int i45 = i41 >>> 3;
                int i46 = beeVar.d;
                int i47 = beeVar.c;
                if (i45 > i37) {
                    q = (i45 < i47 || i45 > i46) ? -1 : beeVar.q(i45, i38 / 3);
                } else {
                    q = (i45 < i47 || i45 > i46) ? -1 : beeVar.q(i45, 0);
                }
                zie zieVar2 = zie.f;
                if (q == -1) {
                    i4 = i3;
                    i6 = i39;
                    i7 = i40;
                    unsafe = unsafe5;
                    zieVar = zieVar2;
                    iArr = iArr2;
                    i38 = 0;
                    pl6Var2 = pl6Var;
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
                                pl6Var3 = pl6Var;
                                unsafe = unsafe5;
                                i13 = i44;
                                i14 = i41;
                                i15 = i45;
                                i16 = i40;
                                if (i11 != 1) {
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    zieVar = zieVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    pl6Var2 = pl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    eke.c.v(obj5, j2, Double.longBitsToDouble(d6f.l(i13, bArr3)));
                                    i35 = i2;
                                    pl6Var7 = pl6Var3;
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
                                pl6Var3 = pl6Var;
                                unsafe = unsafe5;
                                i13 = i44;
                                i14 = i41;
                                i15 = i45;
                                i16 = i40;
                                if (i11 != 5) {
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    zieVar = zieVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    pl6Var2 = pl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    i36 = i13 + 4;
                                    i40 = i16 | i51;
                                    eke.c.w(obj5, j2, Float.intBitsToFloat(d6f.b(bArr3, i13)));
                                    i35 = i2;
                                    pl6Var7 = pl6Var3;
                                    bArr6 = bArr3;
                                    i38 = q;
                                    i37 = i15;
                                    i41 = i14;
                                    i39 = i12;
                                }
                            case 2:
                            case 3:
                                bArr3 = bArr;
                                pl6Var3 = pl6Var;
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
                                    zieVar = zieVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    pl6Var2 = pl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    i40 = i16 | i51;
                                    int i54 = d6f.i(bArr3, i13, pl6Var3);
                                    unsafe2.putLong(obj5, j2, pl6Var3.a);
                                    i35 = i2;
                                    pl6Var7 = pl6Var3;
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
                                pl6Var3 = pl6Var;
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
                                    zieVar = zieVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    pl6Var2 = pl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    i40 = i16 | i51;
                                    int f5 = d6f.f(bArr3, i13, pl6Var3);
                                    unsafe2.putInt(obj5, j2, pl6Var3.b);
                                    i36 = f5;
                                    pl6Var7 = pl6Var3;
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
                                    pl6Var3 = pl6Var;
                                    unsafe2 = unsafe5;
                                    obj5 = obj6;
                                    unsafe = unsafe2;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    zieVar = zieVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    pl6Var2 = pl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    obj5 = obj6;
                                    unsafe5.putLong(obj5, j2, d6f.l(i13, bArr3));
                                    i35 = i2;
                                    pl6Var7 = pl6Var;
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
                                pl6Var4 = pl6Var;
                                obj3 = obj5;
                                unsafe3 = unsafe5;
                                i13 = i44;
                                i14 = i41;
                                i15 = i45;
                                i16 = i40;
                                if (i11 != 5) {
                                    unsafe = unsafe3;
                                    obj5 = obj3;
                                    pl6Var3 = pl6Var4;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    zieVar = zieVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    pl6Var2 = pl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    unsafe3.putInt(obj3, j2, d6f.b(bArr3, i13));
                                    i35 = i2;
                                    pl6Var7 = pl6Var4;
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
                                pl6Var4 = pl6Var;
                                obj3 = obj5;
                                unsafe3 = unsafe5;
                                i13 = i44;
                                i14 = i41;
                                i15 = i45;
                                i16 = i40;
                                if (i11 != 0) {
                                    unsafe = unsafe3;
                                    obj5 = obj3;
                                    pl6Var3 = pl6Var4;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    zieVar = zieVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    pl6Var2 = pl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    int i55 = i16 | i51;
                                    int i56 = d6f.i(bArr3, i13, pl6Var4);
                                    eke.c.s(obj3, j2, pl6Var4.a != 0);
                                    i35 = i2;
                                    pl6Var7 = pl6Var4;
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
                                pl6Var4 = pl6Var;
                                obj3 = obj5;
                                unsafe3 = unsafe5;
                                i13 = i44;
                                i14 = i41;
                                i15 = i45;
                                i16 = i40;
                                if (i11 != 2) {
                                    unsafe = unsafe3;
                                    obj5 = obj3;
                                    pl6Var3 = pl6Var4;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    zieVar = zieVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    pl6Var2 = pl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    if ((i49 & TLObject.FLAG_29) != 0) {
                                        int i57 = i16 | i51;
                                        int f6 = d6f.f(bArr3, i13, pl6Var4);
                                        int i58 = pl6Var4.b;
                                        if (i58 < 0) {
                                            p3d.l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            return 0;
                                        }
                                        if (i58 == 0) {
                                            pl6Var4.d = "";
                                            i21 = i57;
                                        } else {
                                            int i59 = tke.a;
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
                                                                        p3d.l("Protocol message had invalid UTF-8.");
                                                                        return 0;
                                                                    }
                                                                    int i65 = i61 + 1;
                                                                    int i66 = f6 + 2;
                                                                    byte b4 = bArr3[i62];
                                                                    f6 += 3;
                                                                    byte b5 = bArr3[i66];
                                                                    if (!b7f.a(b4)) {
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
                                                                        if (b7f.a(b5)) {
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
                                                                        p3d.l("Protocol message had invalid UTF-8.");
                                                                        return 0;
                                                                    }
                                                                    byte b6 = bArr3[i62];
                                                                    int i67 = f6 + 3;
                                                                    byte b7 = bArr3[f6 + 2];
                                                                    f6 += 4;
                                                                    byte b8 = bArr3[i67];
                                                                    if (!b7f.a(b6) && (((b6 + 112) + (b2 << 28)) >> 30) == 0 && !b7f.a(b7) && !b7f.a(b8)) {
                                                                        int i68 = ((b2 & 7) << 18) | ((b6 & 63) << 12) | ((b7 & 63) << 6) | (b8 & 63);
                                                                        cArr[i61] = (char) ((i68 >>> 10) + 55232);
                                                                        cArr[i61 + 1] = (char) ((i68 & 1023) + 56320);
                                                                        i61 += 2;
                                                                        i60 = i64;
                                                                    }
                                                                }
                                                            } else {
                                                                if (i62 >= i60) {
                                                                    p3d.l("Protocol message had invalid UTF-8.");
                                                                    return 0;
                                                                }
                                                                int i69 = i61 + 1;
                                                                f6 += 2;
                                                                byte b9 = bArr3[i62];
                                                                int i70 = i60;
                                                                if (b2 >= -62 && !b7f.a(b9)) {
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
                                                    pl6Var4.d = str;
                                                    f6 = i71;
                                                }
                                            }
                                            while (f6 < i60) {
                                            }
                                            int i712 = i60;
                                            i21 = i57;
                                            str = new String(cArr, 0, i61);
                                            pl6Var4.d = str;
                                            f6 = i712;
                                        }
                                        f = f6;
                                        i20 = i21;
                                    } else {
                                        f = d6f.f(bArr3, i13, pl6Var4);
                                        int i72 = pl6Var4.b;
                                        if (i72 < 0) {
                                            p3d.l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            return 0;
                                        }
                                        i20 = i16 | i51;
                                        if (i72 == 0) {
                                            pl6Var4.d = "";
                                        } else {
                                            str = new String(bArr3, f, i72, x7e.a);
                                            pl6Var4.d = str;
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
                                    pl6Var7 = pl6Var4;
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
                                    pl6Var3 = pl6Var;
                                    i16 = i17;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    zieVar = zieVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    pl6Var2 = pl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    i40 = i17 | i51;
                                    Object x = beeVar.x(q, obj7);
                                    pl6Var7 = pl6Var;
                                    int k2 = d6f.k(x, beeVar.v(q), bArr, i44, i2, pl6Var7);
                                    unsafe6.putObject(obj, beeVar.s(q) & 1048575, x);
                                    beeVar.i(q, obj);
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
                                pl6Var5 = pl6Var;
                                obj4 = obj5;
                                i17 = i40;
                                unsafe4 = unsafe5;
                                i18 = i44;
                                if (i11 != 2) {
                                    pl6 pl6Var8 = pl6Var5;
                                    bArr3 = bArr4;
                                    pl6Var3 = pl6Var8;
                                    unsafe = unsafe4;
                                    i13 = i18;
                                    i14 = i41;
                                    i15 = i45;
                                    obj5 = obj4;
                                    i16 = i17;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    zieVar = zieVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    pl6Var2 = pl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    i19 = i17 | i51;
                                    a = d6f.a(bArr4, i18, pl6Var5);
                                    unsafe4.putObject(obj4, j2, pl6Var5.d);
                                    i35 = i2;
                                    obj5 = obj4;
                                    i36 = a;
                                    i40 = i19;
                                    bArr6 = bArr4;
                                    pl6Var7 = pl6Var5;
                                    i38 = q;
                                    i37 = i45;
                                    i39 = i12;
                                }
                            case 12:
                                bArr4 = bArr;
                                pl6Var5 = pl6Var;
                                obj4 = obj5;
                                i17 = i40;
                                unsafe4 = unsafe5;
                                i18 = i44;
                                if (i11 != 0) {
                                    pl6 pl6Var82 = pl6Var5;
                                    bArr3 = bArr4;
                                    pl6Var3 = pl6Var82;
                                    unsafe = unsafe4;
                                    i13 = i18;
                                    i14 = i41;
                                    i15 = i45;
                                    obj5 = obj4;
                                    i16 = i17;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    zieVar = zieVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    pl6Var2 = pl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    a = d6f.f(bArr4, i18, pl6Var5);
                                    int i73 = pl6Var5.b;
                                    ovd u = beeVar.u(q);
                                    if ((i49 & TLObject.FLAG_31) == 0 || u == null || u.a(i73)) {
                                        i19 = i17 | i51;
                                        unsafe4.putInt(obj4, j2, i73);
                                        i35 = i2;
                                        obj5 = obj4;
                                        i36 = a;
                                        i40 = i19;
                                        bArr6 = bArr4;
                                        pl6Var7 = pl6Var5;
                                        i38 = q;
                                        i37 = i45;
                                        i39 = i12;
                                    } else {
                                        s6e s6eVar = (s6e) obj4;
                                        zie zieVar3 = s6eVar.zzc;
                                        if (zieVar3 == zieVar2) {
                                            zieVar3 = zie.b();
                                            s6eVar.zzc = zieVar3;
                                        }
                                        zieVar3.c(i41, Long.valueOf(i73));
                                        i35 = i2;
                                        obj5 = obj4;
                                        i36 = a;
                                        i40 = i17;
                                        bArr6 = bArr4;
                                        pl6Var7 = pl6Var5;
                                        i38 = q;
                                        i37 = i45;
                                        i39 = i12;
                                    }
                                }
                            case 15:
                                bArr4 = bArr;
                                pl6Var5 = pl6Var;
                                obj4 = obj5;
                                i17 = i40;
                                unsafe4 = unsafe5;
                                i18 = i44;
                                if (i11 != 0) {
                                    pl6 pl6Var822 = pl6Var5;
                                    bArr3 = bArr4;
                                    pl6Var3 = pl6Var822;
                                    unsafe = unsafe4;
                                    i13 = i18;
                                    i14 = i41;
                                    i15 = i45;
                                    obj5 = obj4;
                                    i16 = i17;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    zieVar = zieVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    pl6Var2 = pl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    i19 = i17 | i51;
                                    a = d6f.f(bArr4, i18, pl6Var5);
                                    int i74 = pl6Var5.b;
                                    unsafe4.putInt(obj4, j2, (i74 >>> 1) ^ (-(i74 & 1)));
                                    i35 = i2;
                                    obj5 = obj4;
                                    i36 = a;
                                    i40 = i19;
                                    bArr6 = bArr4;
                                    pl6Var7 = pl6Var5;
                                    i38 = q;
                                    i37 = i45;
                                    i39 = i12;
                                }
                            case 16:
                                if (i11 != 0) {
                                    bArr3 = bArr;
                                    pl6Var3 = pl6Var;
                                    obj5 = obj5;
                                    unsafe = unsafe5;
                                    i14 = i41;
                                    i15 = i45;
                                    i13 = i44;
                                    i16 = i40;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    zieVar = zieVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    pl6Var2 = pl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    i40 |= i51;
                                    int i75 = d6f.i(bArr, i44, pl6Var);
                                    long j3 = pl6Var.a;
                                    unsafe5.putLong(obj5, j2, (-(j3 & 1)) ^ (j3 >>> 1));
                                    i35 = i2;
                                    bArr6 = bArr;
                                    pl6Var7 = pl6Var;
                                    i38 = q;
                                    i36 = i75;
                                    i37 = i45;
                                    i39 = i12;
                                }
                            default:
                                if (i11 != 3) {
                                    bArr3 = bArr;
                                    pl6Var3 = pl6Var;
                                    unsafe = unsafe5;
                                    i13 = i44;
                                    i14 = i41;
                                    i15 = i45;
                                    i16 = i40;
                                    i4 = i3;
                                    bArr2 = bArr3;
                                    i9 = i13;
                                    zieVar = zieVar2;
                                    iArr = iArr2;
                                    i7 = i16;
                                    i10 = i14;
                                    i6 = i12;
                                    obj2 = obj5;
                                    pl6Var2 = pl6Var3;
                                    i38 = q;
                                    i8 = i15;
                                    break;
                                } else {
                                    Object x2 = beeVar.x(q, obj5);
                                    int j4 = d6f.j(x2, beeVar.v(q), bArr, i44, i2, (i45 << 3) | 4, pl6Var);
                                    bArr4 = bArr;
                                    pl6Var5 = pl6Var;
                                    unsafe6.putObject(obj5, beeVar.s(q) & 1048575, x2);
                                    beeVar.i(q, obj5);
                                    i35 = i2;
                                    i40 |= i51;
                                    i36 = j4;
                                    bArr6 = bArr4;
                                    pl6Var7 = pl6Var5;
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
                                        case jn7.n0 /* 51 */:
                                            bArr2 = bArr;
                                            pl6Var2 = pl6Var;
                                            zieVar = zieVar2;
                                            i8 = i23;
                                            i24 = i22;
                                            i25 = q;
                                            i26 = i41;
                                            if (i48 == 1) {
                                                i27 = i24 + 8;
                                                unsafe.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(d6f.l(i24, bArr2))));
                                                unsafe.putInt(obj2, j5, i8);
                                                i36 = i27;
                                                if (i36 == i24) {
                                                    i4 = i3;
                                                    i9 = i36;
                                                    i38 = i25;
                                                    i10 = i26;
                                                    break;
                                                } else {
                                                    beeVar = this;
                                                    i35 = i2;
                                                    obj5 = obj2;
                                                    bArr6 = bArr2;
                                                    pl6Var7 = pl6Var2;
                                                    i37 = i8;
                                                    i38 = i25;
                                                    i41 = i26;
                                                    break;
                                                }
                                            }
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                        case jn7.o0 /* 52 */:
                                            bArr2 = bArr;
                                            pl6Var2 = pl6Var;
                                            zieVar = zieVar2;
                                            i8 = i23;
                                            i24 = i22;
                                            i25 = q;
                                            i26 = i41;
                                            if (i48 == 5) {
                                                i27 = i24 + 4;
                                                unsafe.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(d6f.b(bArr2, i24))));
                                                unsafe.putInt(obj2, j5, i8);
                                                i36 = i27;
                                                if (i36 == i24) {
                                                }
                                            }
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case jn7.p0 /* 53 */:
                                        case jn7.q0 /* 54 */:
                                            bArr2 = bArr;
                                            pl6Var2 = pl6Var;
                                            zieVar = zieVar2;
                                            i8 = i23;
                                            i24 = i22;
                                            i25 = q;
                                            i26 = i41;
                                            if (i48 == 0) {
                                                i27 = d6f.i(bArr2, i24, pl6Var2);
                                                unsafe.putObject(obj2, j2, Long.valueOf(pl6Var2.a));
                                                unsafe.putInt(obj2, j5, i8);
                                                i36 = i27;
                                                if (i36 == i24) {
                                                }
                                            }
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case jn7.r0 /* 55 */:
                                        case jn7.y0 /* 62 */:
                                            bArr2 = bArr;
                                            pl6Var2 = pl6Var;
                                            zieVar = zieVar2;
                                            i8 = i23;
                                            i24 = i22;
                                            i25 = q;
                                            i26 = i41;
                                            if (i48 == 0) {
                                                i27 = d6f.f(bArr2, i24, pl6Var2);
                                                unsafe.putObject(obj2, j2, Integer.valueOf(pl6Var2.b));
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
                                            pl6Var2 = pl6Var;
                                            zieVar = zieVar2;
                                            i8 = i23;
                                            i24 = i22;
                                            i25 = q;
                                            i26 = i41;
                                            if (i48 == 1) {
                                                i27 = i24 + 8;
                                                unsafe.putObject(obj2, j2, Long.valueOf(d6f.l(i24, bArr2)));
                                                unsafe.putInt(obj2, j5, i8);
                                                i36 = i27;
                                                if (i36 == i24) {
                                                }
                                            }
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case jn7.t0 /* 57 */:
                                        case 64:
                                            bArr2 = bArr;
                                            pl6Var2 = pl6Var;
                                            zieVar = zieVar2;
                                            i8 = i23;
                                            i24 = i22;
                                            i25 = q;
                                            i26 = i41;
                                            if (i48 == 5) {
                                                i27 = i24 + 4;
                                                unsafe.putObject(obj2, j2, Integer.valueOf(d6f.b(bArr2, i24)));
                                                unsafe.putInt(obj2, j5, i8);
                                                i36 = i27;
                                                if (i36 == i24) {
                                                }
                                            }
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case jn7.u0 /* 58 */:
                                            bArr2 = bArr;
                                            pl6Var2 = pl6Var;
                                            i8 = i23;
                                            i24 = i22;
                                            i25 = q;
                                            if (i48 == 0) {
                                                i27 = d6f.i(bArr2, i24, pl6Var2);
                                                zieVar = zieVar2;
                                                i26 = i41;
                                                unsafe.putObject(obj2, j2, Boolean.valueOf(pl6Var2.a != 0));
                                                unsafe.putInt(obj2, j5, i8);
                                                i36 = i27;
                                                if (i36 == i24) {
                                                }
                                            }
                                            zieVar = zieVar2;
                                            i26 = i41;
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case jn7.v0 /* 59 */:
                                            bArr2 = bArr;
                                            pl6Var2 = pl6Var;
                                            i8 = i23;
                                            i24 = i22;
                                            i25 = q;
                                            if (i48 == 2) {
                                                int f7 = d6f.f(bArr2, i24, pl6Var2);
                                                int i76 = pl6Var2.b;
                                                if (i76 == 0) {
                                                    unsafe.putObject(obj2, j2, "");
                                                } else {
                                                    int i77 = f7 + i76;
                                                    if ((i49 & TLObject.FLAG_29) != 0 && !tke.d(f7, i77, bArr2)) {
                                                        p3d.l("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    unsafe.putObject(obj2, j2, new String(bArr2, f7, i76, x7e.a));
                                                    f7 = i77;
                                                }
                                                unsafe.putInt(obj2, j5, i8);
                                                i36 = f7;
                                                zieVar = zieVar2;
                                                i26 = i41;
                                                if (i36 == i24) {
                                                }
                                            }
                                            zieVar = zieVar2;
                                            i26 = i41;
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case jn7.w0 /* 60 */:
                                            i8 = i23;
                                            if (i48 == 2) {
                                                Object y = beeVar.y(i8, q, obj2);
                                                i24 = i22;
                                                int k3 = d6f.k(y, beeVar.v(q), bArr, i24, i2, pl6Var);
                                                unsafe6.putObject(obj2, beeVar.s(q) & 1048575, y);
                                                eke.h(obj2, iArr[r9] & 1048575, i8);
                                                bArr2 = bArr;
                                                pl6Var2 = pl6Var;
                                                i36 = k3;
                                                i25 = q;
                                                zieVar = zieVar2;
                                                i26 = i41;
                                                if (i36 == i24) {
                                                }
                                            } else {
                                                bArr2 = bArr;
                                                pl6Var2 = pl6Var;
                                                zieVar = zieVar2;
                                                i26 = i41;
                                                i24 = i22;
                                                i25 = q;
                                                i36 = i24;
                                                if (i36 == i24) {
                                                }
                                            }
                                            break;
                                        case jn7.x0 /* 61 */:
                                            bArr5 = bArr;
                                            pl6Var6 = pl6Var;
                                            i8 = i23;
                                            i28 = i22;
                                            if (i48 == 2) {
                                                a2 = d6f.a(bArr5, i28, pl6Var6);
                                                unsafe.putObject(obj2, j2, pl6Var6.d);
                                                unsafe.putInt(obj2, j5, i8);
                                                pl6Var2 = pl6Var6;
                                                i36 = a2;
                                                i24 = i28;
                                                i25 = q;
                                                zieVar = zieVar2;
                                                i26 = i41;
                                                bArr2 = bArr5;
                                                if (i36 == i24) {
                                                }
                                            }
                                            pl6Var2 = pl6Var6;
                                            i24 = i28;
                                            i25 = q;
                                            zieVar = zieVar2;
                                            i26 = i41;
                                            bArr2 = bArr5;
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case jn7.z0 /* 63 */:
                                            bArr5 = bArr;
                                            pl6Var6 = pl6Var;
                                            zieVar = zieVar2;
                                            i8 = i23;
                                            i28 = i22;
                                            if (i48 == 0) {
                                                a2 = d6f.f(bArr5, i28, pl6Var6);
                                                int i78 = pl6Var6.b;
                                                ovd u2 = beeVar.u(q);
                                                if (u2 == null || u2.a(i78)) {
                                                    zieVar2 = zieVar;
                                                    unsafe.putObject(obj2, j2, Integer.valueOf(i78));
                                                    unsafe.putInt(obj2, j5, i8);
                                                } else {
                                                    s6e s6eVar2 = (s6e) obj2;
                                                    zie zieVar4 = s6eVar2.zzc;
                                                    zieVar2 = zieVar;
                                                    if (zieVar4 == zieVar2) {
                                                        zieVar4 = zie.b();
                                                        s6eVar2.zzc = zieVar4;
                                                    }
                                                    zieVar4.c(i41, Long.valueOf(i78));
                                                }
                                                pl6Var2 = pl6Var6;
                                                i36 = a2;
                                                i24 = i28;
                                                i25 = q;
                                                zieVar = zieVar2;
                                                i26 = i41;
                                                bArr2 = bArr5;
                                                if (i36 == i24) {
                                                }
                                            }
                                            pl6Var2 = pl6Var6;
                                            i24 = i28;
                                            i25 = q;
                                            i26 = i41;
                                            bArr2 = bArr5;
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case jn7.C0 /* 66 */:
                                            bArr5 = bArr;
                                            pl6Var6 = pl6Var;
                                            zieVar = zieVar2;
                                            i8 = i23;
                                            i28 = i22;
                                            if (i48 == 0) {
                                                f2 = d6f.f(bArr5, i28, pl6Var6);
                                                int i79 = pl6Var6.b;
                                                unsafe.putObject(obj2, j2, Integer.valueOf((i79 >>> 1) ^ (-(i79 & 1))));
                                                unsafe.putInt(obj2, j5, i8);
                                                pl6Var2 = pl6Var6;
                                                i36 = f2;
                                                i24 = i28;
                                                i25 = q;
                                                i26 = i41;
                                                bArr2 = bArr5;
                                                if (i36 == i24) {
                                                }
                                            }
                                            pl6Var2 = pl6Var6;
                                            i24 = i28;
                                            i25 = q;
                                            i26 = i41;
                                            bArr2 = bArr5;
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case jn7.D0 /* 67 */:
                                            bArr5 = bArr;
                                            pl6Var6 = pl6Var;
                                            i8 = i23;
                                            i28 = i22;
                                            if (i48 == 0) {
                                                f2 = d6f.i(bArr5, i28, pl6Var6);
                                                zieVar = zieVar2;
                                                long j6 = pl6Var6.a;
                                                unsafe.putObject(obj2, j2, Long.valueOf((j6 >>> 1) ^ (-(j6 & 1))));
                                                unsafe.putInt(obj2, j5, i8);
                                                pl6Var2 = pl6Var6;
                                                i36 = f2;
                                                i24 = i28;
                                                i25 = q;
                                                i26 = i41;
                                                bArr2 = bArr5;
                                                if (i36 == i24) {
                                                }
                                            }
                                            pl6Var2 = pl6Var6;
                                            i24 = i28;
                                            i25 = q;
                                            zieVar = zieVar2;
                                            i26 = i41;
                                            bArr2 = bArr5;
                                            i36 = i24;
                                            if (i36 == i24) {
                                            }
                                            break;
                                        case jn7.E0 /* 68 */:
                                            if (i48 == 3) {
                                                i8 = i23;
                                                Object y2 = beeVar.y(i8, q, obj2);
                                                int j7 = d6f.j(y2, beeVar.v(q), bArr, i22, i2, (i41 & (-8)) | 4, pl6Var);
                                                unsafe6.putObject(obj2, beeVar.s(q) & 1048575, y2);
                                                eke.h(obj2, iArr[r9] & 1048575, i8);
                                                i36 = j7;
                                                bArr2 = bArr;
                                                pl6Var2 = pl6Var;
                                                zieVar = zieVar2;
                                                i26 = i41;
                                                i24 = i22;
                                                i25 = q;
                                                if (i36 == i24) {
                                                }
                                            } else {
                                                i8 = i23;
                                                bArr2 = bArr;
                                                pl6Var2 = pl6Var;
                                                i25 = q;
                                                zieVar = zieVar2;
                                                i24 = i22;
                                                i26 = i41;
                                                i36 = i24;
                                                if (i36 == i24) {
                                                }
                                            }
                                            break;
                                        default:
                                            bArr2 = bArr;
                                            pl6Var2 = pl6Var;
                                            zieVar = zieVar2;
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
                                        Object w = beeVar.w(q);
                                        Object object = unsafe.getObject(obj, j2);
                                        if (!((hce) object).a) {
                                            hce hceVar2 = hce.b;
                                            if (hceVar2.isEmpty()) {
                                                hceVar = new hce();
                                            } else {
                                                hce hceVar3 = new hce(hceVar2);
                                                hceVar3.a = true;
                                                hceVar = hceVar3;
                                            }
                                            zgd.a(hceVar, object);
                                            unsafe.putObject(obj, j2, hceVar);
                                        }
                                        w.getClass();
                                        grb.o();
                                        return 0;
                                    }
                                    obj2 = obj;
                                    bArr2 = bArr;
                                    i4 = i3;
                                    pl6Var2 = pl6Var;
                                    i9 = i22;
                                }
                            } else {
                                iArr = iArr2;
                                long j8 = i49;
                                q7e q7eVar2 = (q7e) unsafe.getObject(obj8, j2);
                                if (!((rwd) q7eVar2).a) {
                                    q7eVar2 = q7eVar2.zzd(q7eVar2.size() << 1);
                                    unsafe.putObject(obj8, j2, q7eVar2);
                                }
                                q7e q7eVar3 = q7eVar2;
                                switch (r) {
                                    case 18:
                                    case 35:
                                        i41 = i41;
                                        i29 = i44;
                                        i23 = i45;
                                        if (i48 == 2) {
                                            grb.o();
                                            return 0;
                                        }
                                        if (i48 == 1) {
                                            grb.o();
                                            return 0;
                                        }
                                        i36 = i29;
                                        if (i36 != i29) {
                                            obj2 = obj;
                                            bArr2 = bArr;
                                            i4 = i3;
                                            pl6Var2 = pl6Var;
                                            i9 = i36;
                                            break;
                                        } else {
                                            obj5 = obj;
                                            bArr6 = bArr;
                                            i35 = i2;
                                            pl6Var7 = pl6Var;
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
                                            grb.o();
                                            return 0;
                                        }
                                        if (i48 == 5) {
                                            grb.o();
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
                                            grb.o();
                                            return 0;
                                        }
                                        if (i48 == 0) {
                                            grb.o();
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
                                            d = d6f.d(bArr, i30, q7eVar3, pl6Var);
                                            i41 = i31;
                                            i36 = d;
                                            i29 = i30;
                                            if (i36 != i29) {
                                            }
                                        } else {
                                            if (i48 == 0) {
                                                i41 = i31;
                                                i29 = i30;
                                                i36 = d6f.h(i31, bArr, i30, i2, q7eVar3, pl6Var);
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
                                            grb.o();
                                            return 0;
                                        }
                                        if (i48 == 1) {
                                            grb.o();
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
                                            x6e x6eVar = (x6e) q7eVar3;
                                            f3 = d6f.f(bArr, i30, pl6Var);
                                            int i80 = pl6Var.b;
                                            int i81 = f3 + i80;
                                            if (i81 > bArr.length) {
                                                p3d.l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            int i82 = (i80 / 4) + x6eVar.c;
                                            int length2 = x6eVar.b.length;
                                            if (i82 > length2) {
                                                if (length2 != 0) {
                                                    while (length2 < i82) {
                                                        length2 = Math.max(((length2 * 3) / 2) + 1, 10);
                                                    }
                                                    x6eVar.b = Arrays.copyOf(x6eVar.b, length2);
                                                } else {
                                                    x6eVar.b = new int[Math.max(i82, 10)];
                                                }
                                            }
                                            while (f3 < i81) {
                                                x6eVar.j(d6f.b(bArr, f3));
                                                f3 += 4;
                                            }
                                            if (f3 != i81) {
                                                p3d.l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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
                                                x6e x6eVar2 = (x6e) q7eVar3;
                                                x6eVar2.j(d6f.b(bArr, i30));
                                                while (d < i2) {
                                                    int f8 = d6f.f(bArr, d, pl6Var);
                                                    if (i31 == pl6Var.b) {
                                                        x6eVar2.j(d6f.b(bArr, f8));
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
                                            grb.o();
                                            return 0;
                                        }
                                        if (i48 == 0) {
                                            grb.o();
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
                                                f4 = d6f.f(bArr, i30, pl6Var);
                                                int i83 = pl6Var.b;
                                                if (i83 < 0) {
                                                    p3d.l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return 0;
                                                }
                                                if (i83 == 0) {
                                                    q7eVar3.add("");
                                                } else {
                                                    q7eVar3.add(new String(bArr, f4, i83, x7e.a));
                                                    f4 += i83;
                                                }
                                                while (f4 < i2) {
                                                    int f9 = d6f.f(bArr, f4, pl6Var);
                                                    if (i31 == pl6Var.b) {
                                                        f4 = d6f.f(bArr, f9, pl6Var);
                                                        int i84 = pl6Var.b;
                                                        if (i84 < 0) {
                                                            p3d.l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            return 0;
                                                        }
                                                        if (i84 == 0) {
                                                            q7eVar3.add("");
                                                        } else {
                                                            q7eVar3.add(new String(bArr, f4, i84, x7e.a));
                                                            f4 += i84;
                                                        }
                                                    }
                                                }
                                            } else {
                                                f4 = d6f.f(bArr, i30, pl6Var);
                                                int i85 = pl6Var.b;
                                                if (i85 < 0) {
                                                    p3d.l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return 0;
                                                }
                                                if (i85 == 0) {
                                                    q7eVar3.add("");
                                                } else {
                                                    int i86 = f4 + i85;
                                                    if (!tke.d(f4, i86, bArr)) {
                                                        p3d.l("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    q7eVar3.add(new String(bArr, f4, i85, x7e.a));
                                                    f4 = i86;
                                                }
                                                while (f4 < i2) {
                                                    int f10 = d6f.f(bArr, f4, pl6Var);
                                                    if (i31 == pl6Var.b) {
                                                        f4 = d6f.f(bArr, f10, pl6Var);
                                                        int i87 = pl6Var.b;
                                                        if (i87 < 0) {
                                                            p3d.l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            return 0;
                                                        }
                                                        if (i87 == 0) {
                                                            q7eVar3.add("");
                                                        } else {
                                                            int i88 = f4 + i87;
                                                            if (!tke.d(f4, i88, bArr)) {
                                                                p3d.l("Protocol message had invalid UTF-8.");
                                                                return 0;
                                                            }
                                                            q7eVar3.add(new String(bArr, f4, i87, x7e.a));
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
                                            int c = d6f.c(beeVar.v(q), i41, bArr, i30, i2, q7eVar3, pl6Var);
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
                                            f3 = d6f.f(bArr, i30, pl6Var);
                                            int i89 = pl6Var.b;
                                            if (i89 < 0) {
                                                p3d.l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                return 0;
                                            }
                                            if (i89 > bArr.length - f3) {
                                                p3d.l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            if (i89 == 0) {
                                                q7eVar3.add(pzd.c);
                                            } else {
                                                q7eVar3.add(pzd.l(f3, i89, bArr));
                                                f3 += i89;
                                            }
                                            while (f3 < i2) {
                                                int f11 = d6f.f(bArr, f3, pl6Var);
                                                if (i41 == pl6Var.b) {
                                                    f3 = d6f.f(bArr, f11, pl6Var);
                                                    int i90 = pl6Var.b;
                                                    if (i90 < 0) {
                                                        p3d.l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        return 0;
                                                    }
                                                    if (i90 > bArr.length - f3) {
                                                        p3d.l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        return 0;
                                                    }
                                                    if (i90 == 0) {
                                                        q7eVar3.add(pzd.c);
                                                    } else {
                                                        q7eVar3.add(pzd.l(f3, i90, bArr));
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
                                    case jn7.S /* 30 */:
                                    case 44:
                                        i41 = i41;
                                        i29 = i44;
                                        if (i48 == 2) {
                                            h = d6f.d(bArr, i29, q7eVar3, pl6Var);
                                            i30 = i29;
                                            i32 = i41;
                                            q7eVar = q7eVar3;
                                        } else {
                                            if (i48 == 0) {
                                                h = d6f.h(i41, bArr, i29, i2, q7eVar3, pl6Var);
                                                i30 = i29;
                                                q7eVar = q7eVar3;
                                                i32 = i41;
                                            }
                                            i23 = i45;
                                            i36 = i29;
                                            if (i36 != i29) {
                                            }
                                        }
                                        ovd u3 = beeVar.u(q);
                                        rad radVar = fge.a;
                                        if (u3 != null) {
                                            int size = q7eVar.size();
                                            zie zieVar5 = null;
                                            i33 = h;
                                            i23 = i45;
                                            int i91 = 0;
                                            int i92 = 0;
                                            while (i91 < size) {
                                                zie zieVar6 = zieVar5;
                                                Integer num = (Integer) q7eVar.get(i91);
                                                int intValue = num.intValue();
                                                if (u3.a(intValue)) {
                                                    if (i91 != i92) {
                                                        q7eVar.set(i92, num);
                                                    }
                                                    i92++;
                                                    ovdVar = u3;
                                                    zieVar5 = zieVar6;
                                                    i34 = i91;
                                                } else {
                                                    if (zieVar6 == null) {
                                                        beeVar.i.getClass();
                                                        s6e s6eVar3 = (s6e) obj;
                                                        ovdVar = u3;
                                                        zie zieVar7 = s6eVar3.zzc;
                                                        if (zieVar7 == zieVar2) {
                                                            zieVar7 = zie.b();
                                                            s6eVar3.zzc = zieVar7;
                                                        }
                                                        zieVar5 = zieVar7;
                                                    } else {
                                                        ovdVar = u3;
                                                        zieVar5 = zieVar6;
                                                    }
                                                    i34 = i91;
                                                    zieVar5.c(i23 << 3, Long.valueOf(intValue));
                                                }
                                                i91 = i34 + 1;
                                                u3 = ovdVar;
                                            }
                                            if (i92 != size) {
                                                q7eVar.subList(i92, size).clear();
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
                                            x6e x6eVar3 = (x6e) q7eVar3;
                                            i36 = d6f.f(bArr, i29, pl6Var);
                                            int i93 = pl6Var.b + i36;
                                            while (i36 < i93) {
                                                int f12 = d6f.f(bArr, i36, pl6Var);
                                                int i94 = pl6Var.b;
                                                x6eVar3.j((i94 >>> 1) ^ (-(i94 & 1)));
                                                i36 = f12;
                                            }
                                            if (i36 != i93) {
                                                p3d.l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                        } else {
                                            if (i48 == 0) {
                                                x6e x6eVar4 = (x6e) q7eVar3;
                                                i36 = d6f.f(bArr, i29, pl6Var);
                                                int i95 = pl6Var.b;
                                                x6eVar4.j((i95 >>> 1) ^ (-(i95 & 1)));
                                                while (i36 < i2) {
                                                    int f13 = d6f.f(bArr, i36, pl6Var);
                                                    if (i41 == pl6Var.b) {
                                                        i36 = d6f.f(bArr, f13, pl6Var);
                                                        int i96 = pl6Var.b;
                                                        x6eVar4.j((i96 >>> 1) ^ (-(i96 & 1)));
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
                                            grb.o();
                                            return 0;
                                        }
                                        if (i48 == 0) {
                                            grb.o();
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
                                            rfe v = beeVar.v(q);
                                            s6e zze = v.zze();
                                            int i98 = i44;
                                            i41 = i41;
                                            int j9 = d6f.j(zze, v, bArr, i98, i2, i97, pl6Var);
                                            int i99 = i97;
                                            pl6 pl6Var9 = pl6Var;
                                            v.zzf(zze);
                                            pl6Var9.d = zze;
                                            q7eVar3.add(zze);
                                            while (true) {
                                                if (j9 < i2) {
                                                    int i100 = i98;
                                                    int f14 = d6f.f(bArr, j9, pl6Var9);
                                                    if (i41 == pl6Var9.b) {
                                                        int i101 = i99;
                                                        s6e zze2 = v.zze();
                                                        j9 = d6f.j(zze2, v, bArr, f14, i2, i101, pl6Var);
                                                        i99 = i101;
                                                        pl6Var9 = pl6Var;
                                                        v.zzf(zze2);
                                                        pl6Var9.d = zze2;
                                                        q7eVar3.add(zze2);
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
                            q7e q7eVar4 = (q7e) unsafe.getObject(obj5, j2);
                            if (!((rwd) q7eVar4).a) {
                                int size2 = q7eVar4.size();
                                q7eVar4 = q7eVar4.zzd(size2 == 0 ? 10 : size2 << 1);
                                unsafe.putObject(obj5, j2, q7eVar4);
                            }
                            bArr6 = bArr;
                            i35 = i2;
                            i36 = d6f.c(beeVar.v(q), i41, bArr6, i44, i35, q7eVar4, pl6Var);
                            pl6Var7 = pl6Var;
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
                            pl6Var2 = pl6Var;
                            i9 = i22;
                        }
                        i38 = q;
                        zieVar = zieVar2;
                        i10 = i41;
                        i8 = i23;
                    }
                }
                if (i10 != i4 || i4 == 0) {
                    s6e s6eVar4 = (s6e) obj2;
                    zie zieVar8 = s6eVar4.zzc;
                    if (zieVar8 == zieVar) {
                        zieVar8 = zie.b();
                        s6eVar4.zzc = zieVar8;
                    }
                    beeVar = this;
                    pl6Var7 = pl6Var;
                    i41 = i10;
                    i36 = d6f.e(i10, bArr2, i9, i2, zieVar8, pl6Var2);
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

    public final ovd u(int i) {
        return (ovd) this.b[((i / 3) << 1) + 1];
    }

    public final rfe v(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.b;
        rfe rfeVar = (rfe) objArr[i2];
        if (rfeVar != null) {
            return rfeVar;
        }
        rfe a = zee.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final Object w(int i) {
        return this.b[(i / 3) << 1];
    }

    public final Object x(int i, Object obj) {
        rfe v = v(i);
        int s = s(i) & 1048575;
        if (!k(i, obj)) {
            return v.zze();
        }
        Object object = k.getObject(obj, s);
        if (m(object)) {
            return object;
        }
        s6e zze = v.zze();
        if (object != null) {
            v.zzg(zze, object);
        }
        return zze;
    }

    public final Object y(int i, int i2, Object obj) {
        rfe v = v(i2);
        if (!n(i, i2, obj)) {
            return v.zze();
        }
        Object object = k.getObject(obj, s(i2) & 1048575);
        if (m(object)) {
            return object;
        }
        s6e zze = v.zze();
        if (object != null) {
            v.zzg(zze, object);
        }
        return zze;
    }

    @Override // rfe
    public final s6e zze() {
        return (s6e) ((s6e) this.e).d(4);
    }

    @Override // rfe
    public final void zzf(Object obj) {
        if (!m(obj)) {
            return;
        }
        if (obj instanceof s6e) {
            s6e s6eVar = (s6e) obj;
            s6eVar.l();
            s6eVar.zza = 0;
            s6eVar.j();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                this.i.getClass();
                zie zieVar = ((s6e) obj).zzc;
                if (zieVar.e) {
                    zieVar.e = false;
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
                            rwd rwdVar = (rwd) ((q7e) eke.g(obj, j2));
                            if (!rwdVar.a) {
                                break;
                            } else {
                                rwdVar.a = false;
                                break;
                            }
                        case 50:
                            Object object = unsafe.getObject(obj, j2);
                            if (object == null) {
                                break;
                            } else {
                                ((hce) object).a = false;
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

    @Override // rfe
    public final void zzg(Object obj, Object obj2) {
        Object obj3;
        if (!m(obj)) {
            lq5.j("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                fge.o(obj, obj2);
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
                        cac cacVar = eke.c;
                        cacVar.v(obj3, j2, cacVar.k(obj2, j2));
                        i(i, obj3);
                        continue;
                    }
                case 1:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        cac cacVar2 = eke.c;
                        cacVar2.w(obj3, j2, cacVar2.p(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        eke.c.a.putLong(obj3, j2, eke.f(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        eke.c.a.putLong(obj3, j2, eke.f(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        eke.h(obj3, j2, eke.e(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        eke.c.a.putLong(obj3, j2, eke.f(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        eke.h(obj3, j2, eke.e(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        cac cacVar3 = eke.c;
                        cacVar3.s(obj3, j2, cacVar3.x(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        eke.i(obj3, j2, eke.g(obj2, j2));
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
                        eke.i(obj3, j2, eke.g(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        eke.h(obj3, j2, eke.e(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        eke.h(obj3, j2, eke.e(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        eke.h(obj3, j2, eke.e(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        eke.c.a.putLong(obj3, j2, eke.f(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        eke.h(obj3, j2, eke.e(obj2, j2));
                        i(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (k(i, obj2)) {
                        obj3 = obj;
                        eke.c.a.putLong(obj3, j2, eke.f(obj2, j2));
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
                    q7e q7eVar = (q7e) eke.g(obj, j2);
                    q7e q7eVar2 = (q7e) eke.g(obj2, j2);
                    int size = q7eVar.size();
                    int size2 = q7eVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((rwd) q7eVar).a) {
                            q7eVar = q7eVar.zzd(size2 + size);
                        }
                        q7eVar.addAll(q7eVar2);
                    }
                    if (size > 0) {
                        q7eVar2 = q7eVar;
                    }
                    eke.i(obj, j2, q7eVar2);
                    break;
                case 50:
                    rad radVar = fge.a;
                    eke.i(obj, j2, zgd.a(eke.g(obj, j2), eke.g(obj2, j2)));
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
                    if (n(i3, i, obj2)) {
                        eke.i(obj, j2, eke.g(obj2, j2));
                        eke.h(obj, iArr[i + 2] & 1048575, i3);
                        break;
                    }
                    break;
                case jn7.w0 /* 60 */:
                    h(i, obj, obj2);
                    break;
                case jn7.x0 /* 61 */:
                case jn7.y0 /* 62 */:
                case jn7.z0 /* 63 */:
                case 64:
                case 65:
                case jn7.C0 /* 66 */:
                case jn7.D0 /* 67 */:
                    if (n(i3, i, obj2)) {
                        eke.i(obj, j2, eke.g(obj2, j2));
                        eke.h(obj, iArr[i + 2] & 1048575, i3);
                        break;
                    }
                    break;
                case jn7.E0 /* 68 */:
                    h(i, obj, obj2);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
    }
}
