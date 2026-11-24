// default package

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class o37 implements nq9 {
    public static final int[] n = new int[0];
    public static final Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final fs4 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final kj7 j;
    public final d56 k;
    public final t5c l;
    public final di6 m;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new q2((byte) 1));
        } catch (Throwable unused) {
            unsafe = null;
        }
        o = unsafe;
    }

    public o37(int[] iArr, Object[] objArr, int i, int i2, fs4 fs4Var, int[] iArr2, int i3, int i4, kj7 kj7Var, d56 d56Var, t5c t5cVar, c74 c74Var, di6 di6Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = ug8.A(fs4Var);
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = kj7Var;
        this.k = d56Var;
        this.l = t5cVar;
        this.e = fs4Var;
        this.m = di6Var;
    }

    public static Field F(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder p = ug8.p("Field ", str, " for ");
            p.append(cls.getName());
            p.append(" not found. Known fields are ");
            p.append(Arrays.toString(declaredFields));
            throw new RuntimeException(p.toString());
        }
    }

    public static int I(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof fs4) {
            return ((fs4) obj).g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static o37 w(iz8 iz8Var, kj7 kj7Var, d56 d56Var, t5c t5cVar, c74 c74Var, di6 di6Var) {
        int i;
        int charAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char charAt2;
        int i9;
        char charAt3;
        int i10;
        char charAt4;
        int i11;
        char charAt5;
        int i12;
        char charAt6;
        int i13;
        char charAt7;
        int i14;
        char charAt8;
        int i15;
        char charAt9;
        int i16;
        int i17;
        int i18;
        int[] iArr2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Field F;
        char charAt10;
        int i27;
        int i28;
        int i29;
        Object obj;
        Field F2;
        Object obj2;
        Field F3;
        int i30;
        char charAt11;
        int i31;
        int i32;
        char charAt12;
        int i33;
        char charAt13;
        int i34;
        char charAt14;
        if (!(iz8Var instanceof iz8)) {
            fyb.g();
            return null;
        }
        String str = iz8Var.b;
        int length = str.length();
        char c = 55296;
        if (str.charAt(0) >= 55296) {
            int i35 = 1;
            while (true) {
                i = i35 + 1;
                if (str.charAt(i35) < 55296) {
                    break;
                }
                i35 = i;
            }
        } else {
            i = 1;
        }
        int i36 = i + 1;
        int charAt15 = str.charAt(i);
        if (charAt15 >= 55296) {
            int i37 = charAt15 & 8191;
            int i38 = 13;
            while (true) {
                i34 = i36 + 1;
                charAt14 = str.charAt(i36);
                if (charAt14 < 55296) {
                    break;
                }
                i37 |= (charAt14 & 8191) << i38;
                i38 += 13;
                i36 = i34;
            }
            charAt15 = i37 | (charAt14 << i38);
            i36 = i34;
        }
        if (charAt15 == 0) {
            i3 = 0;
            i6 = 0;
            charAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = n;
            i4 = 0;
        } else {
            int i39 = i36 + 1;
            int charAt16 = str.charAt(i36);
            if (charAt16 >= 55296) {
                int i40 = charAt16 & 8191;
                int i41 = 13;
                while (true) {
                    i15 = i39 + 1;
                    charAt9 = str.charAt(i39);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i40 |= (charAt9 & 8191) << i41;
                    i41 += 13;
                    i39 = i15;
                }
                charAt16 = i40 | (charAt9 << i41);
                i39 = i15;
            }
            int i42 = i39 + 1;
            int charAt17 = str.charAt(i39);
            if (charAt17 >= 55296) {
                int i43 = charAt17 & 8191;
                int i44 = 13;
                while (true) {
                    i14 = i42 + 1;
                    charAt8 = str.charAt(i42);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i43 |= (charAt8 & 8191) << i44;
                    i44 += 13;
                    i42 = i14;
                }
                charAt17 = i43 | (charAt8 << i44);
                i42 = i14;
            }
            int i45 = i42 + 1;
            int charAt18 = str.charAt(i42);
            if (charAt18 >= 55296) {
                int i46 = charAt18 & 8191;
                int i47 = 13;
                while (true) {
                    i13 = i45 + 1;
                    charAt7 = str.charAt(i45);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i46 |= (charAt7 & 8191) << i47;
                    i47 += 13;
                    i45 = i13;
                }
                charAt18 = i46 | (charAt7 << i47);
                i45 = i13;
            }
            int i48 = i45 + 1;
            int charAt19 = str.charAt(i45);
            if (charAt19 >= 55296) {
                int i49 = charAt19 & 8191;
                int i50 = 13;
                while (true) {
                    i12 = i48 + 1;
                    charAt6 = str.charAt(i48);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i49 |= (charAt6 & 8191) << i50;
                    i50 += 13;
                    i48 = i12;
                }
                charAt19 = i49 | (charAt6 << i50);
                i48 = i12;
            }
            int i51 = i48 + 1;
            charAt = str.charAt(i48);
            if (charAt >= 55296) {
                int i52 = charAt & 8191;
                int i53 = 13;
                while (true) {
                    i11 = i51 + 1;
                    charAt5 = str.charAt(i51);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i52 |= (charAt5 & 8191) << i53;
                    i53 += 13;
                    i51 = i11;
                }
                charAt = i52 | (charAt5 << i53);
                i51 = i11;
            }
            int i54 = i51 + 1;
            int charAt20 = str.charAt(i51);
            if (charAt20 >= 55296) {
                int i55 = charAt20 & 8191;
                int i56 = 13;
                while (true) {
                    i10 = i54 + 1;
                    charAt4 = str.charAt(i54);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i55 |= (charAt4 & 8191) << i56;
                    i56 += 13;
                    i54 = i10;
                }
                charAt20 = i55 | (charAt4 << i56);
                i54 = i10;
            }
            int i57 = i54 + 1;
            int charAt21 = str.charAt(i54);
            if (charAt21 >= 55296) {
                int i58 = charAt21 & 8191;
                int i59 = 13;
                while (true) {
                    i9 = i57 + 1;
                    charAt3 = str.charAt(i57);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i58 |= (charAt3 & 8191) << i59;
                    i59 += 13;
                    i57 = i9;
                }
                charAt21 = i58 | (charAt3 << i59);
                i57 = i9;
            }
            int i60 = i57 + 1;
            int charAt22 = str.charAt(i57);
            if (charAt22 >= 55296) {
                int i61 = charAt22 & 8191;
                int i62 = 13;
                while (true) {
                    i8 = i60 + 1;
                    charAt2 = str.charAt(i60);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i61 |= (charAt2 & 8191) << i62;
                    i62 += 13;
                    i60 = i8;
                }
                charAt22 = i61 | (charAt2 << i62);
                i60 = i8;
            }
            int[] iArr3 = new int[charAt22 + charAt20 + charAt21];
            int i63 = (charAt16 << 1) + charAt17;
            int i64 = charAt20;
            i2 = charAt18;
            i3 = i64;
            i4 = charAt16;
            i36 = i60;
            iArr = iArr3;
            i5 = charAt19;
            i6 = i63;
            i7 = charAt22;
        }
        Object[] objArr = iz8Var.c;
        Class<?> cls = iz8Var.a.getClass();
        int[] iArr4 = new int[charAt * 3];
        Object[] objArr2 = new Object[charAt << 1];
        int i65 = i7 + i3;
        int i66 = i65;
        int i67 = i7;
        int i68 = 0;
        int i69 = 0;
        while (i36 < length) {
            int i70 = i36 + 1;
            int charAt23 = str.charAt(i36);
            if (charAt23 >= c) {
                int i71 = charAt23 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i33 = i72 + 1;
                    charAt13 = str.charAt(i72);
                    if (charAt13 < c) {
                        break;
                    }
                    i71 |= (charAt13 & 8191) << i73;
                    i73 += 13;
                    i72 = i33;
                }
                charAt23 = i71 | (charAt13 << i73);
                i16 = i33;
            } else {
                i16 = i70;
            }
            int i74 = i16 + 1;
            int charAt24 = str.charAt(i16);
            if (charAt24 >= c) {
                int i75 = charAt24 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i32 = i76 + 1;
                    charAt12 = str.charAt(i76);
                    i17 = length;
                    if (charAt12 < 55296) {
                        break;
                    }
                    i75 |= (charAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i32;
                    length = i17;
                }
                charAt24 = i75 | (charAt12 << i77);
                i18 = i32;
            } else {
                i17 = length;
                i18 = i74;
            }
            int i78 = charAt24 & kk7.d4;
            int i79 = charAt23;
            if ((charAt24 & 1024) != 0) {
                iArr[i68] = i69;
                i68++;
            }
            int i80 = i4;
            Unsafe unsafe = o;
            if (i78 >= 51) {
                int i81 = i18 + 1;
                int charAt25 = str.charAt(i18);
                if (charAt25 >= 55296) {
                    int i82 = charAt25 & 8191;
                    int i83 = i81;
                    int i84 = 13;
                    while (true) {
                        i30 = i83 + 1;
                        charAt11 = str.charAt(i83);
                        i31 = i82;
                        if (charAt11 < 55296) {
                            break;
                        }
                        i82 = i31 | ((charAt11 & 8191) << i84);
                        i84 += 13;
                        i83 = i30;
                    }
                    charAt25 = i31 | (charAt11 << i84);
                    i28 = i30;
                } else {
                    i28 = i81;
                }
                int i85 = charAt25;
                int i86 = i78 - 51;
                int i87 = i28;
                if (i86 == 9 || i86 == 17) {
                    i29 = i6 + 1;
                    objArr2[((i69 / 3) << 1) + 1] = objArr[i6];
                } else {
                    if (i86 == 12 && (ug8.c(iz8Var.a(), 1) || (charAt24 & 2048) != 0)) {
                        i29 = i6 + 1;
                        objArr2[((i69 / 3) << 1) + 1] = objArr[i6];
                    }
                    int i88 = i85 << 1;
                    obj = objArr[i88];
                    if (obj instanceof Field) {
                        F2 = F(cls, (String) obj);
                        objArr[i88] = F2;
                    } else {
                        F2 = (Field) obj;
                    }
                    iArr2 = iArr4;
                    i19 = i65;
                    i26 = (int) unsafe.objectFieldOffset(F2);
                    int i89 = i88 + 1;
                    obj2 = objArr[i89];
                    if (obj2 instanceof Field) {
                        F3 = F(cls, (String) obj2);
                        objArr[i89] = F3;
                    } else {
                        F3 = (Field) obj2;
                    }
                    i22 = (int) unsafe.objectFieldOffset(F3);
                    i23 = i87;
                    i25 = 0;
                }
                i6 = i29;
                int i882 = i85 << 1;
                obj = objArr[i882];
                if (obj instanceof Field) {
                }
                iArr2 = iArr4;
                i19 = i65;
                i26 = (int) unsafe.objectFieldOffset(F2);
                int i892 = i882 + 1;
                obj2 = objArr[i892];
                if (obj2 instanceof Field) {
                }
                i22 = (int) unsafe.objectFieldOffset(F3);
                i23 = i87;
                i25 = 0;
            } else {
                iArr2 = iArr4;
                i19 = i65;
                int i90 = i6 + 1;
                Field F4 = F(cls, (String) objArr[i6]);
                if (i78 == 9 || i78 == 17) {
                    i20 = i90;
                    objArr2[((i69 / 3) << 1) + 1] = F4.getType();
                } else {
                    if (i78 == 27 || i78 == 49) {
                        i27 = i6 + 2;
                        objArr2[((i69 / 3) << 1) + 1] = objArr[i90];
                    } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                        i20 = i90;
                        if (iz8Var.a() == 1 || (charAt24 & 2048) != 0) {
                            i27 = i6 + 2;
                            objArr2[((i69 / 3) << 1) + 1] = objArr[i20];
                        }
                    } else if (i78 == 50) {
                        int i91 = i67 + 1;
                        iArr[i67] = i69;
                        int i92 = (i69 / 3) << 1;
                        i20 = i6 + 2;
                        objArr2[i92] = objArr[i90];
                        if ((charAt24 & 2048) != 0) {
                            i21 = i6 + 3;
                            objArr2[i92 + 1] = objArr[i20];
                            i67 = i91;
                            int objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                            if ((charAt24 & TLObject.FLAG_12) != 0 || i78 > 17) {
                                i22 = 1048575;
                                i23 = i18;
                                i24 = 0;
                            } else {
                                int i93 = i18 + 1;
                                int charAt26 = str.charAt(i18);
                                if (charAt26 >= 55296) {
                                    int i94 = charAt26 & 8191;
                                    int i95 = 13;
                                    while (true) {
                                        i23 = i93 + 1;
                                        charAt10 = str.charAt(i93);
                                        if (charAt10 < 55296) {
                                            break;
                                        }
                                        i94 |= (charAt10 & 8191) << i95;
                                        i95 += 13;
                                        i93 = i23;
                                    }
                                    charAt26 = i94 | (charAt10 << i95);
                                } else {
                                    i23 = i93;
                                }
                                int i96 = (charAt26 / 32) + (i80 << 1);
                                Object obj3 = objArr[i96];
                                if (obj3 instanceof Field) {
                                    F = (Field) obj3;
                                } else {
                                    F = F(cls, (String) obj3);
                                    objArr[i96] = F;
                                }
                                i22 = (int) unsafe.objectFieldOffset(F);
                                i24 = charAt26 % 32;
                            }
                            if (i78 >= 18 || i78 > 49) {
                                i6 = i21;
                            } else {
                                iArr[i66] = objectFieldOffset;
                                i6 = i21;
                                i66++;
                            }
                            i25 = i24;
                            i26 = objectFieldOffset;
                        } else {
                            i67 = i91;
                        }
                    } else {
                        i20 = i90;
                    }
                    i21 = i27;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(F4);
                    if ((charAt24 & TLObject.FLAG_12) != 0) {
                    }
                    i22 = 1048575;
                    i23 = i18;
                    i24 = 0;
                    if (i78 >= 18) {
                    }
                    i6 = i21;
                    i25 = i24;
                    i26 = objectFieldOffset2;
                }
                i21 = i20;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(F4);
                if ((charAt24 & TLObject.FLAG_12) != 0) {
                }
                i22 = 1048575;
                i23 = i18;
                i24 = 0;
                if (i78 >= 18) {
                }
                i6 = i21;
                i25 = i24;
                i26 = objectFieldOffset22;
            }
            int i97 = i69 + 1;
            iArr2[i69] = i79;
            int i98 = i69 + 2;
            String str2 = str;
            iArr2[i97] = ((charAt24 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((charAt24 & 256) != 0 ? TLObject.FLAG_28 : 0) | ((charAt24 & 2048) != 0 ? TLObject.FLAG_31 : 0) | (i78 << 20) | i26;
            i69 += 3;
            iArr2[i98] = (i25 << 20) | i22;
            str = str2;
            i36 = i23;
            length = i17;
            i4 = i80;
            iArr4 = iArr2;
            i65 = i19;
            c = 55296;
        }
        return new o37(iArr4, objArr2, i2, i5, iz8Var.a, iArr, i7, i65, kj7Var, d56Var, t5cVar, c74Var, di6Var);
    }

    public static long x(int i) {
        return i & 1048575;
    }

    public static int y(Object obj, long j) {
        return ((Integer) d6c.h(obj, j)).intValue();
    }

    public static long z(Object obj, long j) {
        return ((Long) d6c.h(obj, j)).longValue();
    }

    public final int A(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
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

    public final void B(Object obj, long j, af0 af0Var, nq9 nq9Var, b74 b74Var) {
        int u;
        this.k.getClass();
        lp5 a = d56.a(obj, j);
        ak2 ak2Var = (ak2) af0Var.d;
        int i = af0Var.a;
        if ((i & 7) != 3) {
            throw zp5.b();
        }
        do {
            fs4 a2 = nq9Var.a();
            af0Var.e(a2, nq9Var, b74Var);
            nq9Var.c(a2);
            a.add(a2);
            if (ak2Var.c() || af0Var.c != 0) {
                return;
            } else {
                u = ak2Var.u();
            }
        } while (u == i);
        af0Var.c = u;
    }

    public final void C(Object obj, int i, af0 af0Var, nq9 nq9Var, b74 b74Var) {
        int u;
        this.k.getClass();
        lp5 a = d56.a(obj, i & 1048575);
        ak2 ak2Var = (ak2) af0Var.d;
        int i2 = af0Var.a;
        if ((i2 & 7) != 2) {
            throw zp5.b();
        }
        do {
            fs4 a2 = nq9Var.a();
            af0Var.f(a2, nq9Var, b74Var);
            nq9Var.c(a2);
            a.add(a2);
            if (ak2Var.c() || af0Var.c != 0) {
                return;
            } else {
                u = ak2Var.u();
            }
        } while (u == i2);
        af0Var.c = u;
    }

    public final void D(int i, af0 af0Var, Object obj) {
        ak2 ak2Var = (ak2) af0Var.d;
        if ((536870912 & i) != 0) {
            af0Var.B(2);
            d6c.o(obj, i & 1048575, ak2Var.t());
            return;
        }
        int i2 = i & 1048575;
        if (!this.f) {
            d6c.o(obj, i2, af0Var.h());
        } else {
            af0Var.B(2);
            d6c.o(obj, i2, ak2Var.s());
        }
    }

    public final void E(int i, af0 af0Var, Object obj) {
        boolean z = (536870912 & i) != 0;
        d56 d56Var = this.k;
        int i2 = i & 1048575;
        if (z) {
            d56Var.getClass();
            af0Var.v(d56.a(obj, i2), true);
        } else {
            d56Var.getClass();
            af0Var.v(d56.a(obj, i2), false);
        }
    }

    public final void G(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        d6c.m(obj, d6c.f(obj, j) | (1 << (i2 >>> 20)), j);
    }

    public final void H(int i, int i2, Object obj) {
        d6c.m(obj, i, this.a[i2 + 2] & 1048575);
    }

    public final int J(int i) {
        return this.a[i + 1];
    }

    @Override // nq9
    public final fs4 a() {
        this.j.getClass();
        return this.e.i();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // nq9
    public final void b(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            w26.i(obj, "Mutating immutable message: ");
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                qq9.k(this.l, obj, obj2);
                return;
            }
            int J = J(i);
            long j = 1048575 & J;
            int i2 = iArr[i];
            switch (I(J)) {
                case 0:
                    if (n(i, obj2)) {
                        c6c c6cVar = d6c.c;
                        obj3 = obj;
                        c6cVar.f(obj3, j, c6cVar.b(obj2, j));
                        G(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (n(i, obj2)) {
                        c6c c6cVar2 = d6c.c;
                        c6cVar2.g(obj, j, c6cVar2.c(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (n(i, obj2)) {
                        d6c.n(obj, j, d6c.g(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (n(i, obj2)) {
                        d6c.n(obj, j, d6c.g(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (n(i, obj2)) {
                        d6c.m(obj, d6c.f(obj2, j), j);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (n(i, obj2)) {
                        d6c.n(obj, j, d6c.g(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (n(i, obj2)) {
                        d6c.m(obj, d6c.f(obj2, j), j);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (n(i, obj2)) {
                        c6c c6cVar3 = d6c.c;
                        c6cVar3.d(obj, j, c6cVar3.a(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (n(i, obj2)) {
                        d6c.o(obj, j, d6c.h(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    s(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (n(i, obj2)) {
                        d6c.o(obj, j, d6c.h(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (n(i, obj2)) {
                        d6c.m(obj, d6c.f(obj2, j), j);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (n(i, obj2)) {
                        d6c.m(obj, d6c.f(obj2, j), j);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (n(i, obj2)) {
                        d6c.m(obj, d6c.f(obj2, j), j);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (n(i, obj2)) {
                        d6c.n(obj, j, d6c.g(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (n(i, obj2)) {
                        d6c.m(obj, d6c.f(obj2, j), j);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (n(i, obj2)) {
                        d6c.n(obj, j, d6c.g(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    s(i, obj, obj2);
                    obj3 = obj;
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
                    this.k.getClass();
                    lp5 lp5Var = (lp5) d6c.h(obj, j);
                    lp5 lp5Var2 = (lp5) d6c.h(obj2, j);
                    int size = lp5Var.size();
                    int size2 = lp5Var2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((s3) lp5Var).a) {
                            lp5Var = ((gt8) lp5Var).j(size2 + size);
                        }
                        lp5Var.addAll(lp5Var2);
                    }
                    if (size > 0) {
                        lp5Var2 = lp5Var;
                    }
                    d6c.o(obj, j, lp5Var2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = qq9.a;
                    Object h = d6c.h(obj, j);
                    Object h2 = d6c.h(obj2, j);
                    this.m.getClass();
                    d6c.o(obj, j, di6.a(h, h2));
                    obj3 = obj;
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
                    if (q(i2, i, obj2)) {
                        d6c.o(obj, j, d6c.h(obj2, j));
                        H(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case kk7.w0 /* 60 */:
                    t(i, obj, obj2);
                    obj3 = obj;
                    break;
                case kk7.x0 /* 61 */:
                case kk7.y0 /* 62 */:
                case kk7.z0 /* 63 */:
                case 64:
                case 65:
                case kk7.C0 /* 66 */:
                case kk7.D0 /* 67 */:
                    if (q(i2, i, obj2)) {
                        d6c.o(obj, j, d6c.h(obj2, j));
                        H(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case kk7.E0 /* 68 */:
                    t(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    @Override // nq9
    public final void c(Object obj) {
        if (p(obj)) {
            if (obj instanceof fs4) {
                fs4 fs4Var = (fs4) obj;
                fs4Var.k(ConnectionsManager.DEFAULT_DATACENTER_ID);
                fs4Var.memoizedHashCode = 0;
                fs4Var.h();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int J = J(i);
                long j = 1048575 & J;
                int I = I(J);
                Unsafe unsafe = o;
                if (I != 9) {
                    if (I != 60 && I != 68) {
                        switch (I) {
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
                                this.k.getClass();
                                s3 s3Var = (s3) ((lp5) d6c.h(obj, j));
                                if (s3Var.a) {
                                    s3Var.a = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.m.getClass();
                                    ((ci6) object).a = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (q(iArr[i], i, obj)) {
                        m(i).c(unsafe.getObject(obj, j));
                    }
                }
                if (n(i, obj)) {
                    m(i).c(unsafe.getObject(obj, j));
                }
            }
            this.l.getClass();
            s5c s5cVar = ((fs4) obj).unknownFields;
            if (s5cVar.e) {
                s5cVar.e = false;
            }
        }
    }

    @Override // nq9
    public final boolean d(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.h) {
            int i7 = this.g[i6];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int J = J(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = o.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i5;
                i = i10;
            } else {
                int i12 = i5;
                i = i4;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & J) == 0 || o(obj, i2, i, i3, i11)) {
                int I = I(J);
                if (I == 9 || I == 17) {
                    if (o(obj, i2, i, i3, i11) && !m(i2).d(d6c.h(obj, J & 1048575))) {
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (I != 27) {
                        if (I == 60 || I == 68) {
                            if (q(i8, i2, obj) && !m(i2).d(d6c.h(obj, J & 1048575))) {
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        } else if (I != 49) {
                            if (I == 50) {
                                Object h = d6c.h(obj, J & 1048575);
                                this.m.getClass();
                                ci6 ci6Var = (ci6) h;
                                if (ci6Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((iyc) ((bi6) this.b[(i2 / 3) << 1]).a.c).a == lyc.r) {
                                        nq9 nq9Var = null;
                                        for (Object obj2 : ci6Var.values()) {
                                            if (nq9Var == null) {
                                                nq9Var = ft8.c.a(obj2.getClass());
                                            }
                                            if (!nq9Var.d(obj2)) {
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                continue;
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        }
                    }
                    List list = (List) d6c.h(obj, J & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        nq9 m = m(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (m.d(list.get(i13))) {
                            }
                        }
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        if (qq9.l(d6c.h(r12, r7), d6c.h(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        if (d6c.g(r12, r7) == d6c.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (d6c.f(r12, r7) == d6c.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
    
        if (d6c.g(r12, r7) == d6c.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
    
        if (d6c.f(r12, r7) == d6c.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c7, code lost:
    
        if (d6c.f(r12, r7) == d6c.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d9, code lost:
    
        if (d6c.f(r12, r7) == d6c.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ef, code lost:
    
        if (qq9.l(d6c.h(r12, r7), d6c.h(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0105, code lost:
    
        if (qq9.l(d6c.h(r12, r7), d6c.h(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011b, code lost:
    
        if (qq9.l(d6c.h(r12, r7), d6c.h(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012f, code lost:
    
        if (r5.a(r12, r7) == r5.a(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0141, code lost:
    
        if (d6c.f(r12, r7) == d6c.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0155, code lost:
    
        if (d6c.g(r12, r7) == d6c.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0167, code lost:
    
        if (d6c.f(r12, r7) == d6c.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017a, code lost:
    
        if (d6c.g(r12, r7) == d6c.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018d, code lost:
    
        if (d6c.g(r12, r7) == d6c.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a8, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.c(r12, r7)) == java.lang.Float.floatToIntBits(r5.c(r13, r7))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c5, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.b(r12, r7)) != java.lang.Double.doubleToLongBits(r5.b(r13, r7))) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (qq9.l(d6c.h(r12, r7), d6c.h(r13, r7)) != false) goto L105;
     */
    @Override // nq9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(fs4 fs4Var, fs4 fs4Var2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int J = J(i);
                long j = J & 1048575;
                switch (I(J)) {
                    case 0:
                        if (j(fs4Var, fs4Var2, i)) {
                            c6c c6cVar = d6c.c;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (j(fs4Var, fs4Var2, i)) {
                            c6c c6cVar2 = d6c.c;
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (j(fs4Var, fs4Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (j(fs4Var, fs4Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (j(fs4Var, fs4Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (j(fs4Var, fs4Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (j(fs4Var, fs4Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (j(fs4Var, fs4Var2, i)) {
                            c6c c6cVar3 = d6c.c;
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (j(fs4Var, fs4Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (j(fs4Var, fs4Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (j(fs4Var, fs4Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (j(fs4Var, fs4Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (j(fs4Var, fs4Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (j(fs4Var, fs4Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (j(fs4Var, fs4Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (j(fs4Var, fs4Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (j(fs4Var, fs4Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (j(fs4Var, fs4Var2, i)) {
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
                        z = qq9.l(d6c.h(fs4Var, j), d6c.h(fs4Var2, j));
                        break;
                    case 50:
                        z = qq9.l(d6c.h(fs4Var, j), d6c.h(fs4Var2, j));
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
                        if (d6c.f(fs4Var, j2) == d6c.f(fs4Var2, j2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (z) {
                    i += 3;
                }
            } else {
                this.l.getClass();
                if (fs4Var.unknownFields.equals(fs4Var2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ed, code lost:
    
        if (r4 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d5, code lost:
    
        if (r4 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01f0, code lost:
    
        r3 = r8 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ef, code lost:
    
        r8 = 1231;
     */
    @Override // nq9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(fs4 fs4Var) {
        int i;
        int b;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int J = J(i4);
            int i5 = iArr[i4];
            long j = 1048575 & J;
            int i6 = 1237;
            int i7 = 37;
            switch (I(J)) {
                case 0:
                    i = i3 * 53;
                    b = mp5.b(Double.doubleToLongBits(d6c.c.b(fs4Var, j)));
                    i3 = b + i;
                    break;
                case 1:
                    i = i3 * 53;
                    b = Float.floatToIntBits(d6c.c.c(fs4Var, j));
                    i3 = b + i;
                    break;
                case 2:
                    i = i3 * 53;
                    b = mp5.b(d6c.g(fs4Var, j));
                    i3 = b + i;
                    break;
                case 3:
                    i = i3 * 53;
                    b = mp5.b(d6c.g(fs4Var, j));
                    i3 = b + i;
                    break;
                case 4:
                    i = i3 * 53;
                    b = d6c.f(fs4Var, j);
                    i3 = b + i;
                    break;
                case 5:
                    i = i3 * 53;
                    b = mp5.b(d6c.g(fs4Var, j));
                    i3 = b + i;
                    break;
                case 6:
                    i = i3 * 53;
                    b = d6c.f(fs4Var, j);
                    i3 = b + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean a = d6c.c.a(fs4Var, j);
                    Charset charset = mp5.a;
                    break;
                case 8:
                    i = i3 * 53;
                    b = ((String) d6c.h(fs4Var, j)).hashCode();
                    i3 = b + i;
                    break;
                case 9:
                    Object h = d6c.h(fs4Var, j);
                    if (h != null) {
                        i7 = h.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    b = d6c.h(fs4Var, j).hashCode();
                    i3 = b + i;
                    break;
                case 11:
                    i = i3 * 53;
                    b = d6c.f(fs4Var, j);
                    i3 = b + i;
                    break;
                case 12:
                    i = i3 * 53;
                    b = d6c.f(fs4Var, j);
                    i3 = b + i;
                    break;
                case 13:
                    i = i3 * 53;
                    b = d6c.f(fs4Var, j);
                    i3 = b + i;
                    break;
                case 14:
                    i = i3 * 53;
                    b = mp5.b(d6c.g(fs4Var, j));
                    i3 = b + i;
                    break;
                case 15:
                    i = i3 * 53;
                    b = d6c.f(fs4Var, j);
                    i3 = b + i;
                    break;
                case 16:
                    i = i3 * 53;
                    b = mp5.b(d6c.g(fs4Var, j));
                    i3 = b + i;
                    break;
                case 17:
                    Object h2 = d6c.h(fs4Var, j);
                    if (h2 != null) {
                        i7 = h2.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
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
                    i = i3 * 53;
                    b = d6c.h(fs4Var, j).hashCode();
                    i3 = b + i;
                    break;
                case 50:
                    i = i3 * 53;
                    b = d6c.h(fs4Var, j).hashCode();
                    i3 = b + i;
                    break;
                case kk7.n0 /* 51 */:
                    if (q(i5, i4, fs4Var)) {
                        i = i3 * 53;
                        b = mp5.b(Double.doubleToLongBits(((Double) d6c.h(fs4Var, j)).doubleValue()));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.o0 /* 52 */:
                    if (q(i5, i4, fs4Var)) {
                        i = i3 * 53;
                        b = Float.floatToIntBits(((Float) d6c.h(fs4Var, j)).floatValue());
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.p0 /* 53 */:
                    if (q(i5, i4, fs4Var)) {
                        i = i3 * 53;
                        b = mp5.b(z(fs4Var, j));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.q0 /* 54 */:
                    if (q(i5, i4, fs4Var)) {
                        i = i3 * 53;
                        b = mp5.b(z(fs4Var, j));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.r0 /* 55 */:
                    if (q(i5, i4, fs4Var)) {
                        i = i3 * 53;
                        b = y(fs4Var, j);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(i5, i4, fs4Var)) {
                        i = i3 * 53;
                        b = mp5.b(z(fs4Var, j));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.t0 /* 57 */:
                    if (q(i5, i4, fs4Var)) {
                        i = i3 * 53;
                        b = y(fs4Var, j);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.u0 /* 58 */:
                    if (q(i5, i4, fs4Var)) {
                        i2 = i3 * 53;
                        boolean booleanValue = ((Boolean) d6c.h(fs4Var, j)).booleanValue();
                        Charset charset2 = mp5.a;
                        break;
                    } else {
                        break;
                    }
                case kk7.v0 /* 59 */:
                    if (q(i5, i4, fs4Var)) {
                        i = i3 * 53;
                        b = ((String) d6c.h(fs4Var, j)).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.w0 /* 60 */:
                    if (q(i5, i4, fs4Var)) {
                        i = i3 * 53;
                        b = d6c.h(fs4Var, j).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.x0 /* 61 */:
                    if (q(i5, i4, fs4Var)) {
                        i = i3 * 53;
                        b = d6c.h(fs4Var, j).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.y0 /* 62 */:
                    if (q(i5, i4, fs4Var)) {
                        i = i3 * 53;
                        b = y(fs4Var, j);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.z0 /* 63 */:
                    if (q(i5, i4, fs4Var)) {
                        i = i3 * 53;
                        b = y(fs4Var, j);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i5, i4, fs4Var)) {
                        i = i3 * 53;
                        b = y(fs4Var, j);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (q(i5, i4, fs4Var)) {
                        i = i3 * 53;
                        b = mp5.b(z(fs4Var, j));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.C0 /* 66 */:
                    if (q(i5, i4, fs4Var)) {
                        i = i3 * 53;
                        b = y(fs4Var, j);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.D0 /* 67 */:
                    if (q(i5, i4, fs4Var)) {
                        i = i3 * 53;
                        b = mp5.b(z(fs4Var, j));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.E0 /* 68 */:
                    if (q(i5, i4, fs4Var)) {
                        i = i3 * 53;
                        b = d6c.h(fs4Var, j).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.l.getClass();
        return fs4Var.unknownFields.hashCode() + (i3 * 53);
    }

    @Override // nq9
    public final int g(fs4 fs4Var) {
        int i;
        int g;
        int g2;
        int g3;
        int i2;
        int g4;
        int i3;
        int g5;
        int g6;
        int f;
        int g7;
        int a;
        int g8;
        int a2;
        int c;
        int g9;
        int size;
        int i4;
        int g10;
        int g11;
        int size2;
        int g12;
        int i5;
        int g13;
        int g14;
        int i6;
        int g15;
        int i7;
        int f2;
        o37 o37Var = this;
        fs4 fs4Var2 = fs4Var;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (true) {
            int[] iArr = o37Var.a;
            if (i8 >= iArr.length) {
                o37Var.l.getClass();
                return fs4Var2.unknownFields.b() + i10;
            }
            int J = o37Var.J(i8);
            int I = I(J);
            int i12 = iArr[i8];
            int i13 = iArr[i8 + 2];
            int i14 = i13 & 1048575;
            Unsafe unsafe = o;
            if (I <= 17) {
                if (i14 != i11) {
                    i9 = i14 == 1048575 ? 0 : unsafe.getInt(fs4Var2, i14);
                    i11 = i14;
                }
                i = 1 << (i13 >>> 20);
            } else {
                i = 0;
            }
            long j = J & 1048575;
            if (I >= y84.b.a) {
                byte b = y84.c.a;
            }
            switch (I) {
                case 0:
                    if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                        g = ck2.g(i12);
                        c = g + 8;
                        i10 += c;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                        g2 = ck2.g(i12);
                        g6 = g2 + 4;
                        i10 += g6;
                    }
                    o37Var = this;
                    fs4Var2 = fs4Var;
                    break;
                case 2:
                    if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                        long j2 = unsafe.getLong(fs4Var2, j);
                        g3 = ck2.g(i12);
                        i2 = ck2.i(j2);
                        i10 += i2 + g3;
                    }
                    o37Var = this;
                    break;
                case 3:
                    if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                        long j3 = unsafe.getLong(fs4Var2, j);
                        g3 = ck2.g(i12);
                        i2 = ck2.i(j3);
                        i10 += i2 + g3;
                    }
                    o37Var = this;
                    break;
                case 4:
                    if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                        int i15 = unsafe.getInt(fs4Var2, j);
                        g4 = ck2.g(i12);
                        i3 = ck2.i(i15);
                        i10 += i3 + g4;
                    }
                    o37Var = this;
                    break;
                case 5:
                    if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                        g5 = ck2.g(i12);
                        g6 = g5 + 8;
                        i10 += g6;
                    }
                    o37Var = this;
                    fs4Var2 = fs4Var;
                    break;
                case 6:
                    if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                        g2 = ck2.g(i12);
                        g6 = g2 + 4;
                        i10 += g6;
                    }
                    o37Var = this;
                    fs4Var2 = fs4Var;
                    break;
                case 7:
                    if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                        g6 = ck2.g(i12) + 1;
                        i10 += g6;
                    }
                    o37Var = this;
                    fs4Var2 = fs4Var;
                    break;
                case 8:
                    if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                        Object object = unsafe.getObject(fs4Var2, j);
                        if (object instanceof f51) {
                            int g16 = ck2.g(i12);
                            int size3 = ((f51) object).size();
                            f = ls6.f(size3, size3, g16, i10);
                        } else {
                            f = ck2.f((String) object) + ck2.g(i12) + i10;
                        }
                        i10 = f;
                    }
                    o37Var = this;
                    break;
                case 9:
                    if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                        Object object2 = unsafe.getObject(fs4Var2, j);
                        nq9 m = o37Var.m(i8);
                        Class cls = qq9.a;
                        g7 = ck2.g(i12);
                        a = ((o3) object2).a(m);
                        i10 = ls6.f(a, a, g7, i10);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                        f51 f51Var = (f51) unsafe.getObject(fs4Var2, j);
                        int g17 = ck2.g(i12);
                        int size4 = f51Var.size();
                        i10 = ls6.f(size4, size4, g17, i10);
                    }
                    o37Var = this;
                    break;
                case 11:
                    if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                        int i16 = unsafe.getInt(fs4Var2, j);
                        g4 = ck2.g(i12);
                        i3 = ck2.h(i16);
                        i10 += i3 + g4;
                    }
                    o37Var = this;
                    break;
                case 12:
                    if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                        int i17 = unsafe.getInt(fs4Var2, j);
                        g4 = ck2.g(i12);
                        i3 = ck2.i(i17);
                        i10 += i3 + g4;
                    }
                    o37Var = this;
                    break;
                case 13:
                    if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                        g2 = ck2.g(i12);
                        g6 = g2 + 4;
                        i10 += g6;
                    }
                    o37Var = this;
                    fs4Var2 = fs4Var;
                    break;
                case 14:
                    if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                        g5 = ck2.g(i12);
                        g6 = g5 + 8;
                        i10 += g6;
                    }
                    o37Var = this;
                    fs4Var2 = fs4Var;
                    break;
                case 15:
                    if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                        int i18 = unsafe.getInt(fs4Var2, j);
                        g4 = ck2.g(i12);
                        i3 = ck2.h((i18 << 1) ^ (i18 >> 31));
                        i10 += i3 + g4;
                    }
                    o37Var = this;
                    break;
                case 16:
                    if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                        long j4 = unsafe.getLong(fs4Var2, j);
                        g3 = ck2.g(i12);
                        i2 = ck2.i((j4 << 1) ^ (j4 >> 63));
                        i10 += i2 + g3;
                    }
                    o37Var = this;
                    break;
                case 17:
                    if (o37Var.o(fs4Var2, i8, i11, i9, i)) {
                        o3 o3Var = (o3) unsafe.getObject(fs4Var2, j);
                        nq9 m2 = o37Var.m(i8);
                        g8 = ck2.g(i12) << 1;
                        a2 = o3Var.a(m2);
                        c = a2 + g8;
                        i10 += c;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    c = qq9.c(i12, (List) unsafe.getObject(fs4Var2, j));
                    i10 += c;
                    break;
                case 19:
                    c = qq9.b(i12, (List) unsafe.getObject(fs4Var2, j));
                    i10 += c;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(fs4Var2, j);
                    Class cls2 = qq9.a;
                    if (list.size() != 0) {
                        g9 = (ck2.g(i12) * list.size()) + qq9.e(list);
                        i10 += g9;
                        break;
                    }
                    g9 = 0;
                    i10 += g9;
                case 21:
                    List list2 = (List) unsafe.getObject(fs4Var2, j);
                    Class cls3 = qq9.a;
                    size = list2.size();
                    if (size != 0) {
                        i4 = qq9.i(list2);
                        g10 = ck2.g(i12);
                        g9 = (g10 * size) + i4;
                        i10 += g9;
                        break;
                    }
                    g9 = 0;
                    i10 += g9;
                case 22:
                    List list3 = (List) unsafe.getObject(fs4Var2, j);
                    Class cls4 = qq9.a;
                    size = list3.size();
                    if (size != 0) {
                        i4 = qq9.d(list3);
                        g10 = ck2.g(i12);
                        g9 = (g10 * size) + i4;
                        i10 += g9;
                        break;
                    }
                    g9 = 0;
                    i10 += g9;
                case 23:
                    c = qq9.c(i12, (List) unsafe.getObject(fs4Var2, j));
                    i10 += c;
                    break;
                case 24:
                    c = qq9.b(i12, (List) unsafe.getObject(fs4Var2, j));
                    i10 += c;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(fs4Var2, j);
                    Class cls5 = qq9.a;
                    int size5 = list4.size();
                    i10 += size5 == 0 ? 0 : (ck2.g(i12) + 1) * size5;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(fs4Var2, j);
                    Class cls6 = qq9.a;
                    int size6 = list5.size();
                    if (size6 != 0) {
                        g9 = ck2.g(i12) * size6;
                        if (list5 instanceof h06) {
                            h06 h06Var = (h06) list5;
                            for (int i19 = 0; i19 < size6; i19++) {
                                Object a3 = h06Var.a();
                                if (a3 instanceof f51) {
                                    int size7 = ((f51) a3).size();
                                    g9 = ck2.h(size7) + size7 + g9;
                                } else {
                                    g9 = ck2.f((String) a3) + g9;
                                }
                            }
                        } else {
                            for (int i20 = 0; i20 < size6; i20++) {
                                Object obj = list5.get(i20);
                                if (obj instanceof f51) {
                                    int size8 = ((f51) obj).size();
                                    g9 = ck2.h(size8) + size8 + g9;
                                } else {
                                    g9 = ck2.f((String) obj) + g9;
                                }
                            }
                        }
                        i10 += g9;
                        break;
                    }
                    g9 = 0;
                    i10 += g9;
                case 27:
                    List list6 = (List) unsafe.getObject(fs4Var2, j);
                    nq9 m3 = o37Var.m(i8);
                    Class cls7 = qq9.a;
                    int size9 = list6.size();
                    if (size9 == 0) {
                        g11 = 0;
                    } else {
                        g11 = ck2.g(i12) * size9;
                        for (int i21 = 0; i21 < size9; i21++) {
                            int a4 = ((o3) list6.get(i21)).a(m3);
                            g11 += ck2.h(a4) + a4;
                        }
                    }
                    i10 += g11;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(fs4Var2, j);
                    Class cls8 = qq9.a;
                    int size10 = list7.size();
                    if (size10 != 0) {
                        g9 = ck2.g(i12) * size10;
                        for (int i22 = 0; i22 < list7.size(); i22++) {
                            int size11 = ((f51) list7.get(i22)).size();
                            g9 += ck2.h(size11) + size11;
                        }
                        i10 += g9;
                        break;
                    }
                    g9 = 0;
                    i10 += g9;
                case 29:
                    List list8 = (List) unsafe.getObject(fs4Var2, j);
                    Class cls9 = qq9.a;
                    size = list8.size();
                    if (size != 0) {
                        i4 = qq9.h(list8);
                        g10 = ck2.g(i12);
                        g9 = (g10 * size) + i4;
                        i10 += g9;
                        break;
                    }
                    g9 = 0;
                    i10 += g9;
                case kk7.S /* 30 */:
                    List list9 = (List) unsafe.getObject(fs4Var2, j);
                    Class cls10 = qq9.a;
                    size = list9.size();
                    if (size != 0) {
                        i4 = qq9.a(list9);
                        g10 = ck2.g(i12);
                        g9 = (g10 * size) + i4;
                        i10 += g9;
                        break;
                    }
                    g9 = 0;
                    i10 += g9;
                case 31:
                    c = qq9.b(i12, (List) unsafe.getObject(fs4Var2, j));
                    i10 += c;
                    break;
                case 32:
                    c = qq9.c(i12, (List) unsafe.getObject(fs4Var2, j));
                    i10 += c;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(fs4Var2, j);
                    Class cls11 = qq9.a;
                    size = list10.size();
                    if (size != 0) {
                        i4 = qq9.f(list10);
                        g10 = ck2.g(i12);
                        g9 = (g10 * size) + i4;
                        i10 += g9;
                        break;
                    }
                    g9 = 0;
                    i10 += g9;
                case 34:
                    List list11 = (List) unsafe.getObject(fs4Var2, j);
                    Class cls12 = qq9.a;
                    size = list11.size();
                    if (size != 0) {
                        i4 = qq9.g(list11);
                        g10 = ck2.g(i12);
                        g9 = (g10 * size) + i4;
                        i10 += g9;
                        break;
                    }
                    g9 = 0;
                    i10 += g9;
                case 35:
                    List list12 = (List) unsafe.getObject(fs4Var2, j);
                    Class cls13 = qq9.a;
                    size2 = list12.size() << 3;
                    if (size2 > 0) {
                        g12 = ck2.g(i12);
                        i10 = ls6.f(size2, g12, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(fs4Var2, j);
                    Class cls14 = qq9.a;
                    size2 = list13.size() << 2;
                    if (size2 > 0) {
                        g12 = ck2.g(i12);
                        i10 = ls6.f(size2, g12, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    size2 = qq9.e((List) unsafe.getObject(fs4Var2, j));
                    if (size2 > 0) {
                        g12 = ck2.g(i12);
                        i10 = ls6.f(size2, g12, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    size2 = qq9.i((List) unsafe.getObject(fs4Var2, j));
                    if (size2 > 0) {
                        g12 = ck2.g(i12);
                        i10 = ls6.f(size2, g12, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    size2 = qq9.d((List) unsafe.getObject(fs4Var2, j));
                    if (size2 > 0) {
                        g12 = ck2.g(i12);
                        i10 = ls6.f(size2, g12, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(fs4Var2, j);
                    Class cls15 = qq9.a;
                    size2 = list14.size() << 3;
                    if (size2 > 0) {
                        g12 = ck2.g(i12);
                        i10 = ls6.f(size2, g12, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(fs4Var2, j);
                    Class cls16 = qq9.a;
                    size2 = list15.size() << 2;
                    if (size2 > 0) {
                        g12 = ck2.g(i12);
                        i10 = ls6.f(size2, g12, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(fs4Var2, j);
                    Class cls17 = qq9.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        g12 = ck2.g(i12);
                        i10 = ls6.f(size2, g12, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    size2 = qq9.h((List) unsafe.getObject(fs4Var2, j));
                    if (size2 > 0) {
                        g12 = ck2.g(i12);
                        i10 = ls6.f(size2, g12, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    size2 = qq9.a((List) unsafe.getObject(fs4Var2, j));
                    if (size2 > 0) {
                        g12 = ck2.g(i12);
                        i10 = ls6.f(size2, g12, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(fs4Var2, j);
                    Class cls18 = qq9.a;
                    size2 = list17.size() << 2;
                    if (size2 > 0) {
                        g12 = ck2.g(i12);
                        i10 = ls6.f(size2, g12, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(fs4Var2, j);
                    Class cls19 = qq9.a;
                    size2 = list18.size() << 3;
                    if (size2 > 0) {
                        g12 = ck2.g(i12);
                        i10 = ls6.f(size2, g12, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    size2 = qq9.f((List) unsafe.getObject(fs4Var2, j));
                    if (size2 > 0) {
                        g12 = ck2.g(i12);
                        i10 = ls6.f(size2, g12, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    size2 = qq9.g((List) unsafe.getObject(fs4Var2, j));
                    if (size2 > 0) {
                        g12 = ck2.g(i12);
                        i10 = ls6.f(size2, g12, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(fs4Var2, j);
                    nq9 m4 = o37Var.m(i8);
                    Class cls20 = qq9.a;
                    int size12 = list19.size();
                    if (size12 == 0) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        for (int i23 = 0; i23 < size12; i23++) {
                            i5 += ((o3) list19.get(i23)).a(m4) + (ck2.g(i12) << 1);
                        }
                    }
                    i10 += i5;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(fs4Var2, j);
                    Object obj2 = o37Var.b[(i8 / 3) << 1];
                    o37Var.m.getClass();
                    ci6 ci6Var = (ci6) object3;
                    bi6 bi6Var = (bi6) obj2;
                    if (!ci6Var.isEmpty()) {
                        g9 = 0;
                        for (Map.Entry entry : ci6Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            bi6Var.getClass();
                            int g18 = ck2.g(i12);
                            int a5 = bi6.a(bi6Var.a, key, value);
                            g9 = ls6.f(a5, a5, g18, g9);
                        }
                        i10 += g9;
                        break;
                    }
                    g9 = 0;
                    i10 += g9;
                case kk7.n0 /* 51 */:
                    if (o37Var.q(i12, i8, fs4Var2)) {
                        g = ck2.g(i12);
                        c = g + 8;
                        i10 += c;
                        break;
                    } else {
                        break;
                    }
                case kk7.o0 /* 52 */:
                    if (o37Var.q(i12, i8, fs4Var2)) {
                        g13 = ck2.g(i12);
                        c = g13 + 4;
                        i10 += c;
                        break;
                    } else {
                        break;
                    }
                case kk7.p0 /* 53 */:
                    if (o37Var.q(i12, i8, fs4Var2)) {
                        long z = z(fs4Var2, j);
                        g14 = ck2.g(i12);
                        i6 = ck2.i(z);
                        i10 += i6 + g14;
                        break;
                    } else {
                        break;
                    }
                case kk7.q0 /* 54 */:
                    if (o37Var.q(i12, i8, fs4Var2)) {
                        long z2 = z(fs4Var2, j);
                        g14 = ck2.g(i12);
                        i6 = ck2.i(z2);
                        i10 += i6 + g14;
                        break;
                    } else {
                        break;
                    }
                case kk7.r0 /* 55 */:
                    if (o37Var.q(i12, i8, fs4Var2)) {
                        int y = y(fs4Var2, j);
                        g15 = ck2.g(i12);
                        i7 = ck2.i(y);
                        c = i7 + g15;
                        i10 += c;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (o37Var.q(i12, i8, fs4Var2)) {
                        g = ck2.g(i12);
                        c = g + 8;
                        i10 += c;
                        break;
                    } else {
                        break;
                    }
                case kk7.t0 /* 57 */:
                    if (o37Var.q(i12, i8, fs4Var2)) {
                        g13 = ck2.g(i12);
                        c = g13 + 4;
                        i10 += c;
                        break;
                    } else {
                        break;
                    }
                case kk7.u0 /* 58 */:
                    if (o37Var.q(i12, i8, fs4Var2)) {
                        c = ck2.g(i12) + 1;
                        i10 += c;
                        break;
                    } else {
                        break;
                    }
                case kk7.v0 /* 59 */:
                    if (o37Var.q(i12, i8, fs4Var2)) {
                        Object object4 = unsafe.getObject(fs4Var2, j);
                        if (object4 instanceof f51) {
                            int g19 = ck2.g(i12);
                            int size13 = ((f51) object4).size();
                            f2 = ls6.f(size13, size13, g19, i10);
                        } else {
                            f2 = ck2.f((String) object4) + ck2.g(i12) + i10;
                        }
                        i10 = f2;
                        break;
                    } else {
                        break;
                    }
                case kk7.w0 /* 60 */:
                    if (o37Var.q(i12, i8, fs4Var2)) {
                        Object object5 = unsafe.getObject(fs4Var2, j);
                        nq9 m5 = o37Var.m(i8);
                        Class cls21 = qq9.a;
                        g7 = ck2.g(i12);
                        a = ((o3) object5).a(m5);
                        i10 = ls6.f(a, a, g7, i10);
                        break;
                    } else {
                        break;
                    }
                case kk7.x0 /* 61 */:
                    if (o37Var.q(i12, i8, fs4Var2)) {
                        f51 f51Var2 = (f51) unsafe.getObject(fs4Var2, j);
                        int g20 = ck2.g(i12);
                        int size14 = f51Var2.size();
                        i10 = ls6.f(size14, size14, g20, i10);
                        break;
                    } else {
                        break;
                    }
                case kk7.y0 /* 62 */:
                    if (o37Var.q(i12, i8, fs4Var2)) {
                        int y2 = y(fs4Var2, j);
                        g15 = ck2.g(i12);
                        i7 = ck2.h(y2);
                        c = i7 + g15;
                        i10 += c;
                        break;
                    } else {
                        break;
                    }
                case kk7.z0 /* 63 */:
                    if (o37Var.q(i12, i8, fs4Var2)) {
                        int y3 = y(fs4Var2, j);
                        g15 = ck2.g(i12);
                        i7 = ck2.i(y3);
                        c = i7 + g15;
                        i10 += c;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (o37Var.q(i12, i8, fs4Var2)) {
                        g13 = ck2.g(i12);
                        c = g13 + 4;
                        i10 += c;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (o37Var.q(i12, i8, fs4Var2)) {
                        g = ck2.g(i12);
                        c = g + 8;
                        i10 += c;
                        break;
                    } else {
                        break;
                    }
                case kk7.C0 /* 66 */:
                    if (o37Var.q(i12, i8, fs4Var2)) {
                        int y4 = y(fs4Var2, j);
                        g15 = ck2.g(i12);
                        i7 = ck2.h((y4 << 1) ^ (y4 >> 31));
                        c = i7 + g15;
                        i10 += c;
                        break;
                    } else {
                        break;
                    }
                case kk7.D0 /* 67 */:
                    if (o37Var.q(i12, i8, fs4Var2)) {
                        long z3 = z(fs4Var2, j);
                        g14 = ck2.g(i12);
                        i6 = ck2.i((z3 << 1) ^ (z3 >> 63));
                        i10 += i6 + g14;
                        break;
                    } else {
                        break;
                    }
                case kk7.E0 /* 68 */:
                    if (o37Var.q(i12, i8, fs4Var2)) {
                        o3 o3Var2 = (o3) unsafe.getObject(fs4Var2, j);
                        nq9 m6 = o37Var.m(i8);
                        g8 = ck2.g(i12) << 1;
                        a2 = o3Var2.a(m6);
                        c = a2 + g8;
                        i10 += c;
                        break;
                    } else {
                        break;
                    }
            }
            i8 += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x082c A[Catch: all -> 0x0852, TryCatch #11 {all -> 0x0852, blocks: (B:57:0x0827, B:59:0x082c, B:60:0x0831, B:124:0x04f9, B:127:0x04fe, B:128:0x0516, B:129:0x052e, B:130:0x0546, B:131:0x055e, B:132:0x0576, B:133:0x058e, B:134:0x05a6, B:135:0x05be, B:136:0x05e6, B:137:0x0606, B:138:0x0626, B:139:0x0647, B:140:0x0668, B:141:0x068b, B:142:0x06ab, B:143:0x06c4, B:144:0x06ec, B:145:0x06fd, B:146:0x071f, B:147:0x0740, B:148:0x0761, B:149:0x0781, B:150:0x07a1, B:151:0x07c1, B:152:0x07e4, B:160:0x0806), top: B:56:0x0827 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0837 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x085a A[LOOP:3: B:73:0x0858->B:74:0x085a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0864  */
    @Override // nq9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Object obj, af0 af0Var, b74 b74Var) {
        o37 o37Var;
        int[] iArr;
        int i;
        int i2;
        af0 af0Var2;
        b74 b74Var2;
        int I;
        Unsafe unsafe;
        d56 d56Var;
        o37 o37Var2 = this;
        Object obj2 = obj;
        af0 af0Var3 = af0Var;
        b74 b74Var3 = b74Var;
        b74Var3.getClass();
        if (!p(obj2)) {
            w26.i(obj2, "Mutating immutable message: ");
            return;
        }
        t5c t5cVar = o37Var2.l;
        int[] iArr2 = o37Var2.g;
        int i3 = o37Var2.i;
        int i4 = o37Var2.h;
        s5c s5cVar = null;
        while (true) {
            try {
                int c = af0Var3.c();
                int A = o37Var2.A(c);
                if (A >= 0) {
                    int J = o37Var2.J(A);
                    try {
                        try {
                            I = I(J);
                            unsafe = o;
                            d56Var = o37Var2.k;
                        } catch (Throwable th) {
                            th = th;
                            o37Var = o37Var2;
                            iArr = iArr2;
                            i2 = i3;
                        }
                    } catch (yp5 unused) {
                        o37Var = o37Var2;
                        iArr = iArr2;
                        i2 = i3;
                    }
                    switch (I) {
                        case 0:
                            iArr = iArr2;
                            i2 = i3;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            long x = x(J);
                            af0Var2.B(1);
                            try {
                            } catch (yp5 unused2) {
                                obj2 = obj;
                            } catch (Throwable th2) {
                                th = th2;
                                obj2 = obj;
                            }
                            try {
                                d6c.c.f(obj, x, ((ak2) af0Var2.d).h());
                                obj2 = obj;
                                o37Var.G(A, obj2);
                            } catch (yp5 unused3) {
                                obj2 = obj;
                                try {
                                    t5cVar.getClass();
                                    if (s5cVar == null) {
                                    }
                                    if (!t5c.b(0, af0Var2, s5cVar)) {
                                    }
                                    af0Var3 = af0Var2;
                                    b74Var3 = b74Var2;
                                    iArr2 = iArr;
                                    i3 = i2;
                                    o37Var2 = o37Var;
                                } catch (Throwable th3) {
                                    th = th3;
                                    i = i2;
                                    while (i4 < i) {
                                    }
                                    if (s5cVar != null) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                obj2 = obj;
                                i = i2;
                                while (i4 < i) {
                                }
                                if (s5cVar != null) {
                                }
                                throw th;
                            }
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                            break;
                        case 1:
                            iArr = iArr2;
                            i2 = i3;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            long x2 = x(J);
                            af0Var2.B(5);
                            d6c.c.g(obj2, x2, ((ak2) af0Var2.d).l());
                            o37Var.G(A, obj2);
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 2:
                            iArr = iArr2;
                            i2 = i3;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            long x3 = x(J);
                            af0Var2.B(0);
                            d6c.n(obj2, x3, ((ak2) af0Var2.d).n());
                            o37Var.G(A, obj2);
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 3:
                            iArr = iArr2;
                            i2 = i3;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            long x4 = x(J);
                            af0Var2.B(0);
                            d6c.n(obj2, x4, ((ak2) af0Var2.d).w());
                            o37Var.G(A, obj2);
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 4:
                            iArr = iArr2;
                            i2 = i3;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            long x5 = x(J);
                            af0Var2.B(0);
                            d6c.m(obj2, ((ak2) af0Var2.d).m(), x5);
                            o37Var.G(A, obj2);
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 5:
                            iArr = iArr2;
                            i2 = i3;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            long x6 = x(J);
                            af0Var2.B(1);
                            d6c.n(obj2, x6, ((ak2) af0Var2.d).k());
                            o37Var.G(A, obj2);
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 6:
                            iArr = iArr2;
                            i2 = i3;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            long x7 = x(J);
                            af0Var2.B(5);
                            d6c.m(obj2, ((ak2) af0Var2.d).j(), x7);
                            o37Var.G(A, obj2);
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 7:
                            iArr = iArr2;
                            i2 = i3;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            long x8 = x(J);
                            af0Var2.B(0);
                            d6c.c.d(obj2, x8, ((ak2) af0Var2.d).f());
                            o37Var.G(A, obj2);
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 8:
                            iArr = iArr2;
                            i2 = i3;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            o37Var.D(J, af0Var2, obj2);
                            o37Var.G(A, obj2);
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 9:
                            o37Var = o37Var2;
                            iArr = iArr2;
                            i2 = i3;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            o3 o3Var = (o3) o37Var.u(A, obj2);
                            nq9 m = o37Var.m(A);
                            af0Var2.B(2);
                            af0Var2.f(o3Var, m, b74Var2);
                            unsafe.putObject(obj2, o37Var.J(A) & 1048575, o3Var);
                            o37Var.G(A, obj2);
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 10:
                            iArr = iArr2;
                            i2 = i3;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            d6c.o(obj2, x(J), af0Var2.h());
                            o37Var.G(A, obj2);
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 11:
                            iArr = iArr2;
                            i2 = i3;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            long x9 = x(J);
                            af0Var2.B(0);
                            d6c.m(obj2, ((ak2) af0Var2.d).v(), x9);
                            o37Var.G(A, obj2);
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 12:
                            iArr = iArr2;
                            i2 = i3;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            af0Var2.B(0);
                            int i5 = ((ak2) af0Var2.d).i();
                            o37Var.l(A);
                            d6c.m(obj2, i5, x(J));
                            o37Var.G(A, obj2);
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 13:
                            iArr = iArr2;
                            i2 = i3;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            long x10 = x(J);
                            af0Var2.B(5);
                            d6c.m(obj2, ((ak2) af0Var2.d).o(), x10);
                            o37Var.G(A, obj2);
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 14:
                            iArr = iArr2;
                            i2 = i3;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            long x11 = x(J);
                            af0Var2.B(1);
                            d6c.n(obj2, x11, ((ak2) af0Var2.d).p());
                            o37Var.G(A, obj2);
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 15:
                            iArr = iArr2;
                            i2 = i3;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            long x12 = x(J);
                            af0Var2.B(0);
                            d6c.m(obj2, ((ak2) af0Var2.d).q(), x12);
                            o37Var.G(A, obj2);
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 16:
                            iArr = iArr2;
                            i2 = i3;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            long x13 = x(J);
                            af0Var2.B(0);
                            d6c.n(obj2, x13, ((ak2) af0Var2.d).r());
                            o37Var.G(A, obj2);
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 17:
                            o37Var = o37Var2;
                            iArr = iArr2;
                            i2 = i3;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            o3 o3Var2 = (o3) o37Var.u(A, obj2);
                            nq9 m2 = o37Var.m(A);
                            af0Var2.B(3);
                            af0Var2.e(o3Var2, m2, b74Var2);
                            unsafe.putObject(obj2, o37Var.J(A) & 1048575, o3Var2);
                            o37Var.G(A, obj2);
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 18:
                            iArr = iArr2;
                            i2 = i3;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            long x14 = x(J);
                            d56Var.getClass();
                            af0Var2.j(d56.a(obj2, x14));
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 19:
                            iArr = iArr2;
                            i2 = i3;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            long x15 = x(J);
                            d56Var.getClass();
                            af0Var2.o(d56.a(obj2, x15));
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 20:
                            iArr = iArr2;
                            i2 = i3;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            long x16 = x(J);
                            d56Var.getClass();
                            af0Var2.q(d56.a(obj2, x16));
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 21:
                            iArr = iArr2;
                            i2 = i3;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            long x17 = x(J);
                            d56Var.getClass();
                            af0Var2.x(d56.a(obj2, x17));
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 22:
                            iArr = iArr2;
                            i2 = i3;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            long x18 = x(J);
                            d56Var.getClass();
                            af0Var2.p(d56.a(obj2, x18));
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 23:
                            iArr = iArr2;
                            i2 = i3;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            long x19 = x(J);
                            d56Var.getClass();
                            af0Var2.n(d56.a(obj2, x19));
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 24:
                            iArr = iArr2;
                            i2 = i3;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            long x20 = x(J);
                            d56Var.getClass();
                            af0Var2.m(d56.a(obj2, x20));
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 25:
                            iArr = iArr2;
                            i2 = i3;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            long x21 = x(J);
                            d56Var.getClass();
                            af0Var2.g(d56.a(obj2, x21));
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 26:
                            iArr = iArr2;
                            i2 = i3;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            try {
                                o37Var.E(J, af0Var2, obj2);
                            } catch (yp5 unused4) {
                                t5cVar.getClass();
                                if (s5cVar == null) {
                                }
                                if (!t5c.b(0, af0Var2, s5cVar)) {
                                }
                                af0Var3 = af0Var2;
                                b74Var3 = b74Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                o37Var2 = o37Var;
                            }
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                            break;
                        case 27:
                            iArr = iArr2;
                            i2 = i3;
                            try {
                                o37Var2.C(obj2, J, af0Var3, o37Var2.m(A), b74Var);
                                af0Var2 = af0Var3;
                                b74Var2 = b74Var;
                                o37Var = o37Var2;
                            } catch (yp5 unused5) {
                                af0Var2 = af0Var3;
                                b74Var2 = b74Var;
                                o37Var = o37Var2;
                                t5cVar.getClass();
                                if (s5cVar == null) {
                                }
                                if (!t5c.b(0, af0Var2, s5cVar)) {
                                }
                                af0Var3 = af0Var2;
                                b74Var3 = b74Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                o37Var2 = o37Var;
                            }
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                            break;
                        case 28:
                            iArr = iArr2;
                            i2 = i3;
                            long x22 = x(J);
                            d56Var.getClass();
                            af0Var3.i(d56.a(obj2, x22));
                            b74Var2 = b74Var;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 29:
                            iArr = iArr2;
                            i2 = i3;
                            long x23 = x(J);
                            d56Var.getClass();
                            af0Var3.w(d56.a(obj2, x23));
                            b74Var2 = b74Var;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case kk7.S /* 30 */:
                            iArr = iArr2;
                            i2 = i3;
                            long x24 = x(J);
                            d56Var.getClass();
                            lp5 a = d56.a(obj2, x24);
                            af0Var3.k(a);
                            o37Var2.l(A);
                            qq9.j(obj2, c, a, s5cVar, t5cVar);
                            b74Var2 = b74Var;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 31:
                            iArr = iArr2;
                            i2 = i3;
                            long x25 = x(J);
                            d56Var.getClass();
                            af0Var3.r(d56.a(obj2, x25));
                            b74Var2 = b74Var;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 32:
                            iArr = iArr2;
                            i2 = i3;
                            long x26 = x(J);
                            d56Var.getClass();
                            af0Var3.s(d56.a(obj2, x26));
                            b74Var2 = b74Var;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 33:
                            iArr = iArr2;
                            i2 = i3;
                            long x27 = x(J);
                            d56Var.getClass();
                            af0Var3.t(d56.a(obj2, x27));
                            b74Var2 = b74Var;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 34:
                            iArr = iArr2;
                            i2 = i3;
                            long x28 = x(J);
                            d56Var.getClass();
                            af0Var3.u(d56.a(obj2, x28));
                            b74Var2 = b74Var;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 35:
                            iArr = iArr2;
                            i2 = i3;
                            long x29 = x(J);
                            d56Var.getClass();
                            af0Var3.j(d56.a(obj2, x29));
                            b74Var2 = b74Var;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 36:
                            iArr = iArr2;
                            i2 = i3;
                            long x30 = x(J);
                            d56Var.getClass();
                            af0Var3.o(d56.a(obj2, x30));
                            b74Var2 = b74Var;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 37:
                            iArr = iArr2;
                            i2 = i3;
                            long x31 = x(J);
                            d56Var.getClass();
                            af0Var3.q(d56.a(obj2, x31));
                            b74Var2 = b74Var;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 38:
                            iArr = iArr2;
                            i2 = i3;
                            long x32 = x(J);
                            d56Var.getClass();
                            af0Var3.x(d56.a(obj2, x32));
                            b74Var2 = b74Var;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 39:
                            iArr = iArr2;
                            i2 = i3;
                            long x33 = x(J);
                            d56Var.getClass();
                            af0Var3.p(d56.a(obj2, x33));
                            b74Var2 = b74Var;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 40:
                            iArr = iArr2;
                            i2 = i3;
                            long x34 = x(J);
                            d56Var.getClass();
                            af0Var3.n(d56.a(obj2, x34));
                            b74Var2 = b74Var;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 41:
                            iArr = iArr2;
                            i2 = i3;
                            long x35 = x(J);
                            d56Var.getClass();
                            af0Var3.m(d56.a(obj2, x35));
                            b74Var2 = b74Var;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 42:
                            iArr = iArr2;
                            i2 = i3;
                            long x36 = x(J);
                            d56Var.getClass();
                            af0Var3.g(d56.a(obj2, x36));
                            b74Var2 = b74Var;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 43:
                            iArr = iArr2;
                            i2 = i3;
                            long x37 = x(J);
                            d56Var.getClass();
                            af0Var3.w(d56.a(obj2, x37));
                            b74Var2 = b74Var;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 44:
                            iArr = iArr2;
                            i2 = i3;
                            long x38 = x(J);
                            d56Var.getClass();
                            lp5 a2 = d56.a(obj2, x38);
                            af0Var3.k(a2);
                            o37Var2.l(A);
                            qq9.j(obj2, c, a2, s5cVar, t5cVar);
                            b74Var2 = b74Var;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 45:
                            iArr = iArr2;
                            i2 = i3;
                            long x39 = x(J);
                            d56Var.getClass();
                            af0Var3.r(d56.a(obj2, x39));
                            b74Var2 = b74Var;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 46:
                            iArr = iArr2;
                            i2 = i3;
                            long x40 = x(J);
                            d56Var.getClass();
                            af0Var3.s(d56.a(obj2, x40));
                            b74Var2 = b74Var;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 47:
                            iArr = iArr2;
                            i2 = i3;
                            long x41 = x(J);
                            d56Var.getClass();
                            af0Var3.t(d56.a(obj2, x41));
                            b74Var2 = b74Var;
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 48:
                            iArr = iArr2;
                            i2 = i3;
                            try {
                                long x42 = x(J);
                                d56Var.getClass();
                                af0Var3.u(d56.a(obj2, x42));
                                b74Var2 = b74Var;
                                o37Var = o37Var2;
                                af0Var2 = af0Var3;
                            } catch (yp5 unused6) {
                                b74Var2 = b74Var;
                                o37Var = o37Var2;
                                af0Var2 = af0Var3;
                                t5cVar.getClass();
                                if (s5cVar == null) {
                                }
                                if (!t5c.b(0, af0Var2, s5cVar)) {
                                }
                                af0Var3 = af0Var2;
                                b74Var3 = b74Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                o37Var2 = o37Var;
                            }
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                            break;
                        case 49:
                            iArr = iArr2;
                            i2 = i3;
                            obj2 = obj;
                            try {
                                o37Var2.B(obj2, x(J), af0Var, o37Var2.m(A), b74Var);
                                af0Var3 = af0Var;
                                b74Var2 = b74Var;
                                o37Var = o37Var2;
                                af0Var2 = af0Var3;
                            } catch (yp5 unused7) {
                                b74Var2 = b74Var;
                                o37Var = o37Var2;
                                af0Var2 = af0Var;
                                t5cVar.getClass();
                                if (s5cVar == null) {
                                    s5cVar = t5c.a(obj2);
                                }
                                if (!t5c.b(0, af0Var2, s5cVar)) {
                                    int i6 = i2;
                                    while (i4 < i6) {
                                        o37Var.k(iArr[i4], obj2, s5cVar);
                                        i4++;
                                    }
                                    if (s5cVar == null) {
                                        return;
                                    }
                                    ((fs4) obj2).unknownFields = s5cVar;
                                    return;
                                }
                                af0Var3 = af0Var2;
                                b74Var3 = b74Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                o37Var2 = o37Var;
                            }
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 50:
                            iArr = iArr2;
                            i2 = i3;
                            try {
                                o37Var2.r(obj2, A, o37Var2.b[(A / 3) << 1], b74Var3, af0Var3);
                                obj2 = obj;
                                af0Var2 = af0Var;
                                b74Var2 = b74Var;
                                o37Var = o37Var2;
                            } catch (yp5 unused8) {
                                obj2 = obj;
                                af0Var2 = af0Var;
                                b74Var2 = b74Var;
                                o37Var = o37Var2;
                                t5cVar.getClass();
                                if (s5cVar == null) {
                                }
                                if (!t5c.b(0, af0Var2, s5cVar)) {
                                }
                                af0Var3 = af0Var2;
                                b74Var3 = b74Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                o37Var2 = o37Var;
                            } catch (Throwable th5) {
                                th = th5;
                                obj2 = obj;
                                o37Var = o37Var2;
                                i = i2;
                                while (i4 < i) {
                                }
                                if (s5cVar != null) {
                                }
                                throw th;
                            }
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                            break;
                        case kk7.n0 /* 51 */:
                            iArr = iArr2;
                            i2 = i3;
                            long x43 = x(J);
                            af0Var3.B(1);
                            d6c.o(obj2, x43, Double.valueOf(((ak2) af0Var3.d).h()));
                            o37Var2.H(c, A, obj2);
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case kk7.o0 /* 52 */:
                            iArr = iArr2;
                            i2 = i3;
                            long x44 = x(J);
                            af0Var3.B(5);
                            d6c.o(obj2, x44, Float.valueOf(((ak2) af0Var3.d).l()));
                            o37Var2.H(c, A, obj2);
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case kk7.p0 /* 53 */:
                            iArr = iArr2;
                            i2 = i3;
                            long x45 = x(J);
                            af0Var3.B(0);
                            d6c.o(obj2, x45, Long.valueOf(((ak2) af0Var3.d).n()));
                            o37Var2.H(c, A, obj2);
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case kk7.q0 /* 54 */:
                            iArr = iArr2;
                            i2 = i3;
                            long x46 = x(J);
                            af0Var3.B(0);
                            d6c.o(obj2, x46, Long.valueOf(((ak2) af0Var3.d).w()));
                            o37Var2.H(c, A, obj2);
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case kk7.r0 /* 55 */:
                            iArr = iArr2;
                            i2 = i3;
                            long x47 = x(J);
                            af0Var3.B(0);
                            d6c.o(obj2, x47, Integer.valueOf(((ak2) af0Var3.d).m()));
                            o37Var2.H(c, A, obj2);
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 56:
                            iArr = iArr2;
                            i2 = i3;
                            long x48 = x(J);
                            af0Var3.B(1);
                            d6c.o(obj2, x48, Long.valueOf(((ak2) af0Var3.d).k()));
                            o37Var2.H(c, A, obj2);
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case kk7.t0 /* 57 */:
                            iArr = iArr2;
                            i2 = i3;
                            long x49 = x(J);
                            af0Var3.B(5);
                            d6c.o(obj2, x49, Integer.valueOf(((ak2) af0Var3.d).j()));
                            o37Var2.H(c, A, obj2);
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case kk7.u0 /* 58 */:
                            iArr = iArr2;
                            i2 = i3;
                            long x50 = x(J);
                            af0Var3.B(0);
                            d6c.o(obj2, x50, Boolean.valueOf(((ak2) af0Var3.d).f()));
                            o37Var2.H(c, A, obj2);
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case kk7.v0 /* 59 */:
                            iArr = iArr2;
                            i2 = i3;
                            o37Var2.D(J, af0Var3, obj2);
                            o37Var2.H(c, A, obj2);
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case kk7.w0 /* 60 */:
                            iArr = iArr2;
                            i2 = i3;
                            o3 o3Var3 = (o3) o37Var2.v(c, A, obj2);
                            nq9 m3 = o37Var2.m(A);
                            af0Var3.B(2);
                            af0Var3.f(o3Var3, m3, b74Var3);
                            unsafe.putObject(obj2, o37Var2.J(A) & 1048575, o3Var3);
                            o37Var2.H(c, A, obj2);
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case kk7.x0 /* 61 */:
                            iArr = iArr2;
                            i2 = i3;
                            d6c.o(obj2, x(J), af0Var3.h());
                            o37Var2.H(c, A, obj2);
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case kk7.y0 /* 62 */:
                            iArr = iArr2;
                            i2 = i3;
                            long x51 = x(J);
                            af0Var3.B(0);
                            d6c.o(obj2, x51, Integer.valueOf(((ak2) af0Var3.d).v()));
                            o37Var2.H(c, A, obj2);
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case kk7.z0 /* 63 */:
                            iArr = iArr2;
                            i2 = i3;
                            af0Var3.B(0);
                            int i7 = ((ak2) af0Var3.d).i();
                            o37Var2.l(A);
                            d6c.o(obj2, x(J), Integer.valueOf(i7));
                            o37Var2.H(c, A, obj2);
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 64:
                            iArr = iArr2;
                            i2 = i3;
                            long x52 = x(J);
                            af0Var3.B(5);
                            d6c.o(obj2, x52, Integer.valueOf(((ak2) af0Var3.d).o()));
                            o37Var2.H(c, A, obj2);
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case 65:
                            iArr = iArr2;
                            i2 = i3;
                            long x53 = x(J);
                            af0Var3.B(1);
                            d6c.o(obj2, x53, Long.valueOf(((ak2) af0Var3.d).p()));
                            o37Var2.H(c, A, obj2);
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case kk7.C0 /* 66 */:
                            iArr = iArr2;
                            i2 = i3;
                            long x54 = x(J);
                            af0Var3.B(0);
                            d6c.o(obj2, x54, Integer.valueOf(((ak2) af0Var3.d).q()));
                            o37Var2.H(c, A, obj2);
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case kk7.D0 /* 67 */:
                            iArr = iArr2;
                            i2 = i3;
                            long x55 = x(J);
                            af0Var3.B(0);
                            d6c.o(obj2, x55, Long.valueOf(((ak2) af0Var3.d).r()));
                            o37Var2.H(c, A, obj2);
                            o37Var = o37Var2;
                            af0Var2 = af0Var3;
                            b74Var2 = b74Var3;
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                        case kk7.E0 /* 68 */:
                            try {
                                o3 o3Var4 = (o3) o37Var2.v(c, A, obj2);
                                nq9 m4 = o37Var2.m(A);
                                af0Var3.B(3);
                                af0Var3.e(o3Var4, m4, b74Var3);
                                iArr = iArr2;
                                i2 = i3;
                                try {
                                    try {
                                        unsafe.putObject(obj2, o37Var2.J(A) & 1048575, o3Var4);
                                        o37Var2.H(c, A, obj2);
                                        o37Var = o37Var2;
                                        af0Var2 = af0Var3;
                                        b74Var2 = b74Var3;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        o37Var = o37Var2;
                                        i = i2;
                                        while (i4 < i) {
                                            o37Var.k(iArr[i4], obj2, s5cVar);
                                            i4++;
                                        }
                                        if (s5cVar != null) {
                                            t5cVar.getClass();
                                            ((fs4) obj2).unknownFields = s5cVar;
                                        }
                                        throw th;
                                    }
                                } catch (yp5 unused9) {
                                    o37Var = o37Var2;
                                    af0Var2 = af0Var3;
                                    b74Var2 = b74Var3;
                                    t5cVar.getClass();
                                    if (s5cVar == null) {
                                    }
                                    if (!t5c.b(0, af0Var2, s5cVar)) {
                                    }
                                    af0Var3 = af0Var2;
                                    b74Var3 = b74Var2;
                                    iArr2 = iArr;
                                    i3 = i2;
                                    o37Var2 = o37Var;
                                }
                            } catch (yp5 unused10) {
                                iArr = iArr2;
                                i2 = i3;
                            } catch (Throwable th7) {
                                th = th7;
                                iArr = iArr2;
                                i2 = i3;
                            }
                            af0Var3 = af0Var2;
                            b74Var3 = b74Var2;
                            iArr2 = iArr;
                            i3 = i2;
                            o37Var2 = o37Var;
                            break;
                        default:
                            if (s5cVar == null) {
                                t5cVar.getClass();
                                s5cVar = t5c.a(obj2);
                            }
                            t5cVar.getClass();
                            if (t5c.b(0, af0Var3, s5cVar)) {
                                o37Var = o37Var2;
                                iArr = iArr2;
                                i2 = i3;
                                af0Var2 = af0Var3;
                                b74Var2 = b74Var3;
                                af0Var3 = af0Var2;
                                b74Var3 = b74Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                o37Var2 = o37Var;
                            } else {
                                while (i4 < i3) {
                                    o37Var2.k(iArr2[i4], obj2, s5cVar);
                                    i4++;
                                }
                                if (s5cVar == null) {
                                    return;
                                }
                            }
                            break;
                    }
                } else if (c == Integer.MAX_VALUE) {
                    while (i4 < i3) {
                        o37Var2.k(iArr2[i4], obj2, s5cVar);
                        i4++;
                    }
                    if (s5cVar == null) {
                        return;
                    } else {
                        t5cVar.getClass();
                    }
                } else {
                    t5cVar.getClass();
                    if (s5cVar == null) {
                        s5cVar = t5c.a(obj2);
                    }
                    if (!t5c.b(0, af0Var3, s5cVar)) {
                        while (i4 < i3) {
                            o37Var2.k(iArr2[i4], obj2, s5cVar);
                            i4++;
                        }
                        if (s5cVar == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                o37Var = o37Var2;
                iArr = iArr2;
                i = i3;
            }
        }
    }

    @Override // nq9
    public final void i(Object obj, l69 l69Var) {
        int i;
        int i2;
        int i3;
        o37 o37Var = this;
        l69Var.getClass();
        ck2 ck2Var = (ck2) l69Var.b;
        int[] iArr = o37Var.a;
        int length = iArr.length;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            int J = o37Var.J(i6);
            int i8 = iArr[i6];
            int I = I(J);
            Unsafe unsafe = o;
            if (I <= 17) {
                int i9 = iArr[i6 + 2];
                i = 1;
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i7 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                int i11 = 1 << (i9 >>> 20);
                i2 = J;
                i3 = i11;
            } else {
                i = 1;
                i2 = J;
                i3 = 0;
            }
            long j = i2 & i4;
            switch (I) {
                case 0:
                    if (!o37Var.o(obj, i6, i5, i7, i3)) {
                        break;
                    } else {
                        ck2Var.s(i8, Double.doubleToRawLongBits(d6c.c.b(obj, j)));
                        continue;
                    }
                case 1:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.q(i8, Float.floatToRawIntBits(d6c.c.c(obj, j)));
                        break;
                    }
                    break;
                case 2:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.D(i8, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 3:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.D(i8, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 4:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.u(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 5:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.s(i8, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 6:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.q(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 7:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.n(i8, d6c.c.a(obj, j));
                        break;
                    }
                    break;
                case 8:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ck2Var.y(i8, (String) object);
                            break;
                        } else {
                            ck2Var.o(i8, (f51) object);
                            break;
                        }
                    }
                    break;
                case 9:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.x(i8, (o3) unsafe.getObject(obj, j), o37Var.m(i6));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.o(i8, (f51) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 11:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.B(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 12:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.u(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 13:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.q(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 14:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        ck2Var.s(i8, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 15:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        int i12 = unsafe.getInt(obj, j);
                        ck2Var.B(i8, (i12 << 1) ^ (i12 >> 31));
                        break;
                    }
                    break;
                case 16:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        long j2 = unsafe.getLong(obj, j);
                        ck2Var.D(i8, (j2 << 1) ^ (j2 >> 63));
                        break;
                    }
                    break;
                case 17:
                    if (o37Var.o(obj, i6, i5, i7, i3)) {
                        l69Var.L(i8, unsafe.getObject(obj, j), o37Var.m(i6));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    qq9.n(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                case 19:
                    qq9.r(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                case 20:
                    qq9.t(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                case 21:
                    qq9.z(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                case 22:
                    qq9.s(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                case 23:
                    qq9.q(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                case 24:
                    qq9.p(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                case 25:
                    qq9.m(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                case 26:
                    int i13 = iArr[i6];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = qq9.a;
                    if (list != null) {
                        if (list.isEmpty()) {
                            break;
                        } else if (list instanceof h06) {
                            h06 h06Var = (h06) list;
                            for (int i14 = 0; i14 < list.size(); i14++) {
                                Object a = h06Var.a();
                                if (a instanceof String) {
                                    ck2Var.y(i13, (String) a);
                                } else {
                                    ck2Var.o(i13, (f51) a);
                                }
                            }
                            break;
                        } else {
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                ck2Var.y(i13, (String) list.get(i15));
                            }
                            break;
                        }
                    } else {
                        continue;
                    }
                case 27:
                    int i16 = iArr[i6];
                    List list2 = (List) unsafe.getObject(obj, j);
                    nq9 m = o37Var.m(i6);
                    Class cls2 = qq9.a;
                    if (list2 != null) {
                        if (list2.isEmpty()) {
                            break;
                        } else {
                            for (int i17 = 0; i17 < list2.size(); i17++) {
                                ck2Var.x(i16, (o3) list2.get(i17), m);
                            }
                            break;
                        }
                    } else {
                        continue;
                    }
                case 28:
                    int i18 = iArr[i6];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = qq9.a;
                    if (list3 != null) {
                        if (list3.isEmpty()) {
                            break;
                        } else {
                            for (int i19 = 0; i19 < list3.size(); i19++) {
                                ck2Var.o(i18, (f51) list3.get(i19));
                            }
                            break;
                        }
                    } else {
                        continue;
                    }
                case 29:
                    qq9.y(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                case kk7.S /* 30 */:
                    qq9.o(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                case 31:
                    qq9.u(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                case 32:
                    qq9.v(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                case 33:
                    qq9.w(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                case 34:
                    qq9.x(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, false);
                    continue;
                case 35:
                    qq9.n(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, i == true ? 1 : 0);
                    continue;
                case 36:
                    qq9.r(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, i == true ? 1 : 0);
                    continue;
                case 37:
                    qq9.t(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, i == true ? 1 : 0);
                    continue;
                case 38:
                    qq9.z(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, i == true ? 1 : 0);
                    continue;
                case 39:
                    qq9.s(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, i == true ? 1 : 0);
                    continue;
                case 40:
                    qq9.q(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, i == true ? 1 : 0);
                    continue;
                case 41:
                    qq9.p(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, i == true ? 1 : 0);
                    continue;
                case 42:
                    qq9.m(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, i == true ? 1 : 0);
                    continue;
                case 43:
                    qq9.y(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, i == true ? 1 : 0);
                    continue;
                case 44:
                    qq9.o(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, i == true ? 1 : 0);
                    continue;
                case 45:
                    qq9.u(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, i == true ? 1 : 0);
                    continue;
                case 46:
                    qq9.v(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, i == true ? 1 : 0);
                    continue;
                case 47:
                    qq9.w(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, i == true ? 1 : 0);
                    continue;
                case 48:
                    qq9.x(iArr[i6], (List) unsafe.getObject(obj, j), l69Var, true);
                    continue;
                case 49:
                    int i20 = iArr[i6];
                    List list4 = (List) unsafe.getObject(obj, j);
                    nq9 m2 = o37Var.m(i6);
                    Class cls4 = qq9.a;
                    if (list4 != null) {
                        if (list4.isEmpty()) {
                            break;
                        } else {
                            for (int i21 = 0; i21 < list4.size(); i21++) {
                                l69Var.L(i20, list4.get(i21), m2);
                            }
                            break;
                        }
                    } else {
                        continue;
                    }
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        Object obj2 = o37Var.b[(i6 / 3) << 1];
                        o37Var.m.getClass();
                        xl3 xl3Var = ((bi6) obj2).a;
                        for (Map.Entry entry : ((ci6) object2).entrySet()) {
                            ck2Var.A(i8, 2);
                            ck2Var.C(bi6.a(xl3Var, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            x84.b(ck2Var, (gyc) xl3Var.b, i, key);
                            x84.b(ck2Var, (iyc) xl3Var.c, 2, value);
                            i = 1;
                        }
                        break;
                    } else {
                        continue;
                    }
                case kk7.n0 /* 51 */:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.s(i8, Double.doubleToRawLongBits(((Double) d6c.h(obj, j)).doubleValue()));
                        break;
                    } else {
                        continue;
                    }
                case kk7.o0 /* 52 */:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.q(i8, Float.floatToRawIntBits(((Float) d6c.h(obj, j)).floatValue()));
                        break;
                    } else {
                        continue;
                    }
                case kk7.p0 /* 53 */:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.D(i8, z(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case kk7.q0 /* 54 */:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.D(i8, z(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case kk7.r0 /* 55 */:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.u(i8, y(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.s(i8, z(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case kk7.t0 /* 57 */:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.q(i8, y(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case kk7.u0 /* 58 */:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.n(i8, ((Boolean) d6c.h(obj, j)).booleanValue());
                        break;
                    } else {
                        continue;
                    }
                case kk7.v0 /* 59 */:
                    if (o37Var.q(i8, i6, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ck2Var.y(i8, (String) object3);
                            break;
                        } else {
                            ck2Var.o(i8, (f51) object3);
                            break;
                        }
                    } else {
                        continue;
                    }
                case kk7.w0 /* 60 */:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.x(i8, (o3) unsafe.getObject(obj, j), o37Var.m(i6));
                        break;
                    } else {
                        continue;
                    }
                case kk7.x0 /* 61 */:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.o(i8, (f51) unsafe.getObject(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case kk7.y0 /* 62 */:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.B(i8, y(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case kk7.z0 /* 63 */:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.u(i8, y(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.q(i8, y(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (o37Var.q(i8, i6, obj)) {
                        ck2Var.s(i8, z(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case kk7.C0 /* 66 */:
                    if (o37Var.q(i8, i6, obj)) {
                        int y = y(obj, j);
                        ck2Var.B(i8, (y << 1) ^ (y >> 31));
                        break;
                    } else {
                        continue;
                    }
                case kk7.D0 /* 67 */:
                    if (o37Var.q(i8, i6, obj)) {
                        long z = z(obj, j);
                        ck2Var.D(i8, (z << (i == true ? 1L : 0L)) ^ (z >> 63));
                        break;
                    } else {
                        continue;
                    }
                case kk7.E0 /* 68 */:
                    if (o37Var.q(i8, i6, obj)) {
                        l69Var.L(i8, unsafe.getObject(obj, j), o37Var.m(i6));
                        break;
                    } else {
                        continue;
                    }
            }
            o37Var = this;
            i6 += 3;
            i4 = 1048575;
        }
        o37Var.l.getClass();
        ((fs4) obj).unknownFields.d(l69Var);
    }

    public final boolean j(fs4 fs4Var, fs4 fs4Var2, int i) {
        return n(i, fs4Var) == n(i, fs4Var2);
    }

    public final void k(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (d6c.h(obj, J(i) & 1048575) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.b[((i / 3) << 1) + 1] == null) {
            return;
        }
        fyb.g();
    }

    public final nq9 m(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.b;
        nq9 nq9Var = (nq9) objArr[i2];
        if (nq9Var != null) {
            return nq9Var;
        }
        nq9 a = ft8.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00ef A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int J = J(i);
            long j2 = 1048575 & J;
            switch (I(J)) {
                case 0:
                    return Double.doubleToRawLongBits(d6c.c.b(obj, j2)) != 0;
                case 1:
                    if (Float.floatToRawIntBits(d6c.c.c(obj, j2)) != 0) {
                    }
                    break;
                case 2:
                    if (d6c.g(obj, j2) != 0) {
                    }
                    break;
                case 3:
                    if (d6c.g(obj, j2) != 0) {
                    }
                    break;
                case 4:
                    if (d6c.f(obj, j2) != 0) {
                    }
                    break;
                case 5:
                    if (d6c.g(obj, j2) != 0) {
                    }
                    break;
                case 6:
                    if (d6c.f(obj, j2) != 0) {
                    }
                    break;
                case 7:
                    return d6c.c.a(obj, j2);
                case 8:
                    Object h = d6c.h(obj, j2);
                    if (h instanceof String) {
                        return !((String) h).isEmpty();
                    }
                    if (h instanceof f51) {
                        return !f51.c.equals(h);
                    }
                    sc8.e();
                    return false;
                case 9:
                    if (d6c.h(obj, j2) != null) {
                    }
                    break;
                case 10:
                    return !f51.c.equals(d6c.h(obj, j2));
                case 11:
                    if (d6c.f(obj, j2) != 0) {
                    }
                    break;
                case 12:
                    if (d6c.f(obj, j2) != 0) {
                    }
                    break;
                case 13:
                    if (d6c.f(obj, j2) != 0) {
                    }
                    break;
                case 14:
                    if (d6c.g(obj, j2) != 0) {
                    }
                    break;
                case 15:
                    if (d6c.f(obj, j2) != 0) {
                    }
                    break;
                case 16:
                    if (d6c.g(obj, j2) != 0) {
                    }
                    break;
                case 17:
                    if (d6c.h(obj, j2) != null) {
                    }
                    break;
                default:
                    sc8.e();
                    return false;
            }
        } else {
            if ((d6c.f(obj, j) & (1 << (i2 >>> 20))) != 0) {
            }
        }
    }

    public final boolean o(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? n(i, obj) : (i3 & i4) != 0;
    }

    public final boolean q(int i, int i2, Object obj) {
        return d6c.f(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        r9.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(Object obj, int i, Object obj2, b74 b74Var, af0 af0Var) {
        long J = J(i) & 1048575;
        Object h = d6c.h(obj, J);
        di6 di6Var = this.m;
        if (h == null) {
            di6Var.getClass();
            h = ci6.b.c();
            d6c.o(obj, J, h);
        } else {
            di6Var.getClass();
            if (!((ci6) h).a) {
                Object c = ci6.b.c();
                di6.a(c, h);
                d6c.o(obj, J, c);
                h = c;
            }
        }
        di6Var.getClass();
        ci6 ci6Var = (ci6) h;
        xl3 xl3Var = ((bi6) obj2).a;
        af0Var.B(2);
        ak2 ak2Var = (ak2) af0Var.d;
        int e = ak2Var.e(ak2Var.v());
        vg8 vg8Var = (vg8) xl3Var.d;
        Object obj3 = "";
        Object obj4 = vg8Var;
        while (true) {
            try {
                int c2 = af0Var.c();
                if (c2 == Integer.MAX_VALUE || ak2Var.c()) {
                    break;
                }
                if (c2 == 1) {
                    obj3 = af0Var.l((gyc) xl3Var.b, null, null);
                } else if (c2 != 2) {
                    try {
                        if (!af0Var.D()) {
                            throw new zp5("Unable to parse map entry.");
                        }
                        continue;
                    } catch (yp5 unused) {
                        if (!af0Var.D()) {
                            throw new zp5("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj4 = af0Var.l((iyc) xl3Var.c, vg8Var.getClass(), b74Var);
                }
            } finally {
                ak2Var.d(e);
            }
        }
    }

    public final void s(int i, Object obj, Object obj2) {
        if (n(i, obj2)) {
            long J = J(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, J);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2);
            }
            nq9 m = m(i);
            if (!n(i, obj)) {
                if (p(object)) {
                    fs4 a = m.a();
                    m.b(a, object);
                    unsafe.putObject(obj, J, a);
                } else {
                    unsafe.putObject(obj, J, object);
                }
                G(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!p(object2)) {
                fs4 a2 = m.a();
                m.b(a2, object2);
                unsafe.putObject(obj, J, a2);
                object2 = a2;
            }
            m.b(object2, object);
        }
    }

    public final void t(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (q(i2, i, obj2)) {
            long J = J(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, J);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            nq9 m = m(i);
            if (!q(i2, i, obj)) {
                if (p(object)) {
                    fs4 a = m.a();
                    m.b(a, object);
                    unsafe.putObject(obj, J, a);
                } else {
                    unsafe.putObject(obj, J, object);
                }
                H(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!p(object2)) {
                fs4 a2 = m.a();
                m.b(a2, object2);
                unsafe.putObject(obj, J, a2);
                object2 = a2;
            }
            m.b(object2, object);
        }
    }

    public final Object u(int i, Object obj) {
        nq9 m = m(i);
        long J = J(i) & 1048575;
        if (!n(i, obj)) {
            return m.a();
        }
        Object object = o.getObject(obj, J);
        if (p(object)) {
            return object;
        }
        fs4 a = m.a();
        if (object != null) {
            m.b(a, object);
        }
        return a;
    }

    public final Object v(int i, int i2, Object obj) {
        nq9 m = m(i2);
        if (!q(i, i2, obj)) {
            return m.a();
        }
        Object object = o.getObject(obj, J(i2) & 1048575);
        if (p(object)) {
            return object;
        }
        fs4 a = m.a();
        if (object != null) {
            m.b(a, object);
        }
        return a;
    }
}
