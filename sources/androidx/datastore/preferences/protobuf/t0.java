package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class t0 implements b1 {
    public static final int[] n = new int[0];
    public static final Unsafe o = n1.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final a e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final v0 j;
    public final h0 k;
    public final i1 l;
    public final p0 m;

    public t0(int[] iArr, Object[] objArr, int i7, int i10, a aVar, int[] iArr2, int i11, int i12, v0 v0Var, h0 h0Var, i1 i1Var, q qVar, p0 p0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i7;
        this.d = i10;
        this.f = aVar instanceof z;
        this.g = iArr2;
        this.h = i11;
        this.i = i12;
        this.j = v0Var;
        this.k = h0Var;
        this.l = i1Var;
        this.e = aVar;
        this.m = p0Var;
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
            StringBuilder u10 = a8.p0.u("Field ", str, " for ");
            u10.append(cls.getName());
            u10.append(" not found. Known fields are ");
            u10.append(Arrays.toString(declaredFields));
            throw new RuntimeException(u10.toString());
        }
    }

    public static int K(int i7) {
        return (i7 & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof z) {
            return ((z) obj).g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static t0 w(a1 a1Var, v0 v0Var, h0 h0Var, i1 i1Var, q qVar, p0 p0Var) {
        int i7;
        int charAt;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        int i15;
        int i16;
        char charAt2;
        int i17;
        char charAt3;
        int i18;
        char charAt4;
        int i19;
        char charAt5;
        int i20;
        char charAt6;
        int i21;
        char charAt7;
        int i22;
        char charAt8;
        int i23;
        char charAt9;
        int i24;
        int i25;
        int i26;
        Class<?> cls;
        int i27;
        int objectFieldOffset;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        Field F;
        char charAt10;
        int i33;
        int i34;
        Object obj;
        Field F2;
        Object obj2;
        Field F3;
        int i35;
        char charAt11;
        int i36;
        char charAt12;
        int i37;
        char charAt13;
        int i38;
        char charAt14;
        String str = a1Var.b;
        int length = str.length();
        int i39 = 55296;
        if (str.charAt(0) >= 55296) {
            int i40 = 1;
            while (true) {
                i7 = i40 + 1;
                if (str.charAt(i40) < 55296) {
                    break;
                }
                i40 = i7;
            }
        } else {
            i7 = 1;
        }
        int i41 = i7 + 1;
        int charAt15 = str.charAt(i7);
        if (charAt15 >= 55296) {
            int i42 = charAt15 & 8191;
            int i43 = 13;
            while (true) {
                i38 = i41 + 1;
                charAt14 = str.charAt(i41);
                if (charAt14 < 55296) {
                    break;
                }
                i42 |= (charAt14 & 8191) << i43;
                i43 += 13;
                i41 = i38;
            }
            charAt15 = i42 | (charAt14 << i43);
            i41 = i38;
        }
        if (charAt15 == 0) {
            i11 = 0;
            i14 = 0;
            charAt = 0;
            i10 = 0;
            i13 = 0;
            i15 = 0;
            iArr = n;
            i12 = 0;
        } else {
            int i44 = i41 + 1;
            int charAt16 = str.charAt(i41);
            if (charAt16 >= 55296) {
                int i45 = charAt16 & 8191;
                int i46 = 13;
                while (true) {
                    i23 = i44 + 1;
                    charAt9 = str.charAt(i44);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i45 |= (charAt9 & 8191) << i46;
                    i46 += 13;
                    i44 = i23;
                }
                charAt16 = i45 | (charAt9 << i46);
                i44 = i23;
            }
            int i47 = i44 + 1;
            int charAt17 = str.charAt(i44);
            if (charAt17 >= 55296) {
                int i48 = charAt17 & 8191;
                int i49 = 13;
                while (true) {
                    i22 = i47 + 1;
                    charAt8 = str.charAt(i47);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i48 |= (charAt8 & 8191) << i49;
                    i49 += 13;
                    i47 = i22;
                }
                charAt17 = i48 | (charAt8 << i49);
                i47 = i22;
            }
            int i50 = i47 + 1;
            int charAt18 = str.charAt(i47);
            if (charAt18 >= 55296) {
                int i51 = charAt18 & 8191;
                int i52 = 13;
                while (true) {
                    i21 = i50 + 1;
                    charAt7 = str.charAt(i50);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i51 |= (charAt7 & 8191) << i52;
                    i52 += 13;
                    i50 = i21;
                }
                charAt18 = i51 | (charAt7 << i52);
                i50 = i21;
            }
            int i53 = i50 + 1;
            int charAt19 = str.charAt(i50);
            if (charAt19 >= 55296) {
                int i54 = charAt19 & 8191;
                int i55 = 13;
                while (true) {
                    i20 = i53 + 1;
                    charAt6 = str.charAt(i53);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i54 |= (charAt6 & 8191) << i55;
                    i55 += 13;
                    i53 = i20;
                }
                charAt19 = i54 | (charAt6 << i55);
                i53 = i20;
            }
            int i56 = i53 + 1;
            charAt = str.charAt(i53);
            if (charAt >= 55296) {
                int i57 = charAt & 8191;
                int i58 = 13;
                while (true) {
                    i19 = i56 + 1;
                    charAt5 = str.charAt(i56);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i57 |= (charAt5 & 8191) << i58;
                    i58 += 13;
                    i56 = i19;
                }
                charAt = i57 | (charAt5 << i58);
                i56 = i19;
            }
            int i59 = i56 + 1;
            int charAt20 = str.charAt(i56);
            if (charAt20 >= 55296) {
                int i60 = charAt20 & 8191;
                int i61 = 13;
                while (true) {
                    i18 = i59 + 1;
                    charAt4 = str.charAt(i59);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i60 |= (charAt4 & 8191) << i61;
                    i61 += 13;
                    i59 = i18;
                }
                charAt20 = i60 | (charAt4 << i61);
                i59 = i18;
            }
            int i62 = i59 + 1;
            int charAt21 = str.charAt(i59);
            if (charAt21 >= 55296) {
                int i63 = charAt21 & 8191;
                int i64 = 13;
                while (true) {
                    i17 = i62 + 1;
                    charAt3 = str.charAt(i62);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i63 |= (charAt3 & 8191) << i64;
                    i64 += 13;
                    i62 = i17;
                }
                charAt21 = i63 | (charAt3 << i64);
                i62 = i17;
            }
            int i65 = i62 + 1;
            int charAt22 = str.charAt(i62);
            if (charAt22 >= 55296) {
                int i66 = charAt22 & 8191;
                int i67 = 13;
                while (true) {
                    i16 = i65 + 1;
                    charAt2 = str.charAt(i65);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i66 |= (charAt2 & 8191) << i67;
                    i67 += 13;
                    i65 = i16;
                }
                charAt22 = i66 | (charAt2 << i67);
                i65 = i16;
            }
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i68 = (charAt16 * 2) + charAt17;
            int i69 = charAt20;
            i10 = charAt18;
            i11 = i69;
            i12 = charAt16;
            i41 = i65;
            iArr = iArr2;
            i13 = charAt19;
            i14 = i68;
            i15 = charAt22;
        }
        Unsafe unsafe = o;
        Object[] objArr = a1Var.c;
        Class<?> cls2 = a1Var.a.getClass();
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr2 = new Object[charAt * 2];
        int i70 = i15 + i11;
        int i71 = i70;
        int i72 = i15;
        int i73 = 0;
        int i74 = 0;
        while (i41 < length) {
            int i75 = i41 + 1;
            int charAt23 = str.charAt(i41);
            if (charAt23 >= i39) {
                int i76 = charAt23 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i37 = i77 + 1;
                    charAt13 = str.charAt(i77);
                    i24 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i76 |= (charAt13 & 8191) << i78;
                    i78 += 13;
                    i77 = i37;
                    length = i24;
                }
                charAt23 = i76 | (charAt13 << i78);
                i25 = i37;
            } else {
                i24 = length;
                i25 = i75;
            }
            int i79 = i25 + 1;
            int charAt24 = str.charAt(i25);
            Object[] objArr3 = objArr;
            char c10 = 55296;
            if (charAt24 >= 55296) {
                int i80 = charAt24 & 8191;
                int i81 = 13;
                while (true) {
                    i36 = i79 + 1;
                    charAt12 = str.charAt(i79);
                    if (charAt12 < c10) {
                        break;
                    }
                    i80 |= (charAt12 & 8191) << i81;
                    i81 += 13;
                    i79 = i36;
                    c10 = 55296;
                }
                charAt24 = i80 | (charAt12 << i81);
                i79 = i36;
            }
            int i82 = charAt24 & qs.e4;
            int i83 = charAt23;
            if ((charAt24 & 1024) != 0) {
                iArr[i73] = i74;
                i73++;
            }
            int[] iArr4 = iArr3;
            if (i82 >= 51) {
                int i84 = i79 + 1;
                int charAt25 = str.charAt(i79);
                char c11 = 55296;
                if (charAt25 >= 55296) {
                    int i85 = charAt25 & 8191;
                    int i86 = 13;
                    while (true) {
                        i35 = i84 + 1;
                        charAt11 = str.charAt(i84);
                        if (charAt11 < c11) {
                            break;
                        }
                        i85 |= (charAt11 & 8191) << i86;
                        i86 += 13;
                        i84 = i35;
                        c11 = 55296;
                    }
                    charAt25 = i85 | (charAt11 << i86);
                    i84 = i35;
                }
                int i87 = i82 - 51;
                int i88 = i84;
                if (i87 == 9 || i87 == 17) {
                    i34 = i14 + 1;
                    objArr2[((i74 / 3) * 2) + 1] = objArr3[i14];
                } else {
                    if (i87 == 12 && (p1.g.b(a1Var.a(), 1) || (charAt24 & 2048) != 0)) {
                        i34 = i14 + 1;
                        objArr2[((i74 / 3) * 2) + 1] = objArr3[i14];
                    }
                    int i89 = charAt25 * 2;
                    obj = objArr3[i89];
                    if (obj instanceof Field) {
                        F2 = F(cls2, (String) obj);
                        objArr3[i89] = F2;
                    } else {
                        F2 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(F2);
                    int i90 = i89 + 1;
                    obj2 = objArr3[i90];
                    if (obj2 instanceof Field) {
                        F3 = F(cls2, (String) obj2);
                        objArr3[i90] = F3;
                    } else {
                        F3 = (Field) obj2;
                    }
                    int objectFieldOffset3 = (int) unsafe.objectFieldOffset(F3);
                    int i91 = i12;
                    i28 = objectFieldOffset3;
                    i32 = objectFieldOffset2;
                    i26 = i91;
                    i31 = i14;
                    i29 = i88;
                    i30 = 0;
                    cls = cls2;
                }
                i14 = i34;
                int i892 = charAt25 * 2;
                obj = objArr3[i892];
                if (obj instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(F2);
                int i902 = i892 + 1;
                obj2 = objArr3[i902];
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset32 = (int) unsafe.objectFieldOffset(F3);
                int i912 = i12;
                i28 = objectFieldOffset32;
                i32 = objectFieldOffset22;
                i26 = i912;
                i31 = i14;
                i29 = i88;
                i30 = 0;
                cls = cls2;
            } else {
                int i92 = i14 + 1;
                Field F4 = F(cls2, (String) objArr3[i14]);
                if (i82 == 9 || i82 == 17) {
                    i26 = i12;
                    objArr2[((i74 / 3) * 2) + 1] = F4.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        i26 = i12;
                        i33 = i14 + 2;
                        objArr2[((i74 / 3) * 2) + 1] = objArr3[i92];
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        i26 = i12;
                        if (a1Var.a() == 1 || (charAt24 & 2048) != 0) {
                            i33 = i14 + 2;
                            objArr2[((i74 / 3) * 2) + 1] = objArr3[i92];
                        }
                    } else if (i82 == 50) {
                        int i93 = i72 + 1;
                        iArr[i72] = i74;
                        int i94 = (i74 / 3) * 2;
                        int i95 = i14 + 2;
                        objArr2[i94] = objArr3[i92];
                        if ((charAt24 & 2048) != 0) {
                            i27 = i14 + 3;
                            objArr2[i94 + 1] = objArr3[i95];
                            i26 = i12;
                            cls = cls2;
                            i72 = i93;
                        } else {
                            cls = cls2;
                            i27 = i95;
                            i72 = i93;
                            i26 = i12;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                        if ((charAt24 & TLObject.FLAG_12) != 0 || i82 > 17) {
                            i28 = 1048575;
                            i29 = i79;
                            i30 = 0;
                        } else {
                            int i96 = i79 + 1;
                            int charAt26 = str.charAt(i79);
                            if (charAt26 >= 55296) {
                                int i97 = charAt26 & 8191;
                                int i98 = 13;
                                while (true) {
                                    i29 = i96 + 1;
                                    charAt10 = str.charAt(i96);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i97 |= (charAt10 & 8191) << i98;
                                    i98 += 13;
                                    i96 = i29;
                                }
                                charAt26 = i97 | (charAt10 << i98);
                            } else {
                                i29 = i96;
                            }
                            int i99 = (charAt26 / 32) + (i26 * 2);
                            Object obj3 = objArr3[i99];
                            if (obj3 instanceof Field) {
                                F = (Field) obj3;
                            } else {
                                F = F(cls, (String) obj3);
                                objArr3[i99] = F;
                            }
                            i28 = (int) unsafe.objectFieldOffset(F);
                            i30 = charAt26 % 32;
                        }
                        if (i82 >= 18 || i82 > 49) {
                            i31 = i27;
                            i32 = objectFieldOffset;
                        } else {
                            iArr[i71] = objectFieldOffset;
                            i31 = i27;
                            i32 = objectFieldOffset;
                            i71++;
                        }
                    } else {
                        i26 = i12;
                    }
                    i27 = i33;
                    cls = cls2;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                    if ((charAt24 & TLObject.FLAG_12) != 0) {
                    }
                    i28 = 1048575;
                    i29 = i79;
                    i30 = 0;
                    if (i82 >= 18) {
                    }
                    i31 = i27;
                    i32 = objectFieldOffset;
                }
                cls = cls2;
                i27 = i92;
                objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                if ((charAt24 & TLObject.FLAG_12) != 0) {
                }
                i28 = 1048575;
                i29 = i79;
                i30 = 0;
                if (i82 >= 18) {
                }
                i31 = i27;
                i32 = objectFieldOffset;
            }
            int i100 = i74 + 1;
            iArr4[i74] = i83;
            int i101 = i74 + 2;
            String str2 = str;
            iArr4[i100] = ((charAt24 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((charAt24 & 256) != 0 ? TLObject.FLAG_28 : 0) | ((charAt24 & 2048) != 0 ? TLObject.FLAG_31 : 0) | (i82 << 20) | i32;
            i74 += 3;
            iArr4[i101] = (i30 << 20) | i28;
            cls2 = cls;
            objArr = objArr3;
            str = str2;
            length = i24;
            i12 = i26;
            i41 = i29;
            i39 = 55296;
            i14 = i31;
            iArr3 = iArr4;
        }
        return new t0(iArr3, objArr2, i10, i13, a1Var.a, iArr, i15, i70, v0Var, h0Var, i1Var, qVar, p0Var);
    }

    public static long x(int i7) {
        return i7 & 1048575;
    }

    public static int y(Object obj, long j3) {
        return ((Integer) n1.c.h(obj, j3)).intValue();
    }

    public static long z(Object obj, long j3) {
        return ((Long) n1.c.h(obj, j3)).longValue();
    }

    public final int A(int i7) {
        if (i7 >= this.c && i7 <= this.d) {
            int[] iArr = this.a;
            int length = (iArr.length / 3) - 1;
            int i10 = 0;
            while (i10 <= length) {
                int i11 = (length + i10) >>> 1;
                int i12 = i11 * 3;
                int i13 = iArr[i12];
                if (i7 == i13) {
                    return i12;
                }
                if (i7 < i13) {
                    length = i11 - 1;
                } else {
                    i10 = i11 + 1;
                }
            }
        }
        return -1;
    }

    public final void B(Object obj, long j3, d4.f fVar, b1 b1Var, p pVar) {
        int u10;
        this.k.getClass();
        b0 a10 = h0.a(obj, j3);
        k kVar = (k) fVar.b;
        int i7 = fVar.c;
        if ((i7 & 7) != 3) {
            throw e0.b();
        }
        do {
            z a11 = b1Var.a();
            fVar.g(a11, b1Var, pVar);
            b1Var.d(a11);
            a10.add(a11);
            if (kVar.c() || fVar.e != 0) {
                return;
            } else {
                u10 = kVar.u();
            }
        } while (u10 == i7);
        fVar.e = u10;
    }

    public final void C(Object obj, int i7, d4.f fVar, b1 b1Var, p pVar) {
        int u10;
        this.k.getClass();
        b0 a10 = h0.a(obj, i7 & 1048575);
        k kVar = (k) fVar.b;
        int i10 = fVar.c;
        if ((i10 & 7) != 2) {
            throw e0.b();
        }
        do {
            z a11 = b1Var.a();
            fVar.h(a11, b1Var, pVar);
            b1Var.d(a11);
            a10.add(a11);
            if (kVar.c() || fVar.e != 0) {
                return;
            } else {
                u10 = kVar.u();
            }
        } while (u10 == i10);
        fVar.e = u10;
    }

    public final void D(int i7, d4.f fVar, Object obj) {
        k kVar = (k) fVar.b;
        if ((536870912 & i7) != 0) {
            fVar.G(2);
            n1.o(obj, i7 & 1048575, kVar.t());
        } else if (!this.f) {
            n1.o(obj, i7 & 1048575, fVar.n());
        } else {
            fVar.G(2);
            n1.o(obj, i7 & 1048575, kVar.s());
        }
    }

    public final void E(int i7, d4.f fVar, Object obj) {
        int i10 = 536870912 & i7;
        h0 h0Var = this.k;
        if (i10 != 0) {
            h0Var.getClass();
            fVar.C(h0.a(obj, i7 & 1048575), true);
        } else {
            h0Var.getClass();
            fVar.C(h0.a(obj, i7 & 1048575), false);
        }
    }

    public final void G(int i7, Object obj) {
        int i10 = this.a[i7 + 2];
        long j3 = 1048575 & i10;
        if (j3 == 1048575) {
            return;
        }
        n1.m(j3, obj, (1 << (i10 >>> 20)) | n1.c.f(obj, j3));
    }

    public final void H(int i7, int i10, Object obj) {
        n1.m(this.a[i10 + 2] & 1048575, obj, i7);
    }

    public final void I(Object obj, int i7, a aVar) {
        o.putObject(obj, L(i7) & 1048575, aVar);
        G(i7, obj);
    }

    public final void J(Object obj, int i7, int i10, a aVar) {
        o.putObject(obj, L(i10) & 1048575, aVar);
        H(i7, i10, obj);
    }

    public final int L(int i7) {
        return this.a[i7 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void M(Object obj, l0 l0Var) {
        int i7;
        int i10;
        int i11;
        int i12;
        boolean z9;
        t0 t0Var = this;
        int[] iArr = t0Var.a;
        int length = iArr.length;
        Unsafe unsafe = o;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        while (i15 < length) {
            int L = t0Var.L(i15);
            int i17 = iArr[i15];
            int K = K(L);
            if (K <= 17) {
                int i18 = iArr[i15 + 2];
                int i19 = i18 & i13;
                if (i19 != i14) {
                    i16 = i19 == i13 ? 0 : unsafe.getInt(obj, i19);
                    i14 = i19;
                }
                i7 = L;
                i10 = 1 << (i18 >>> 20);
            } else {
                i7 = L;
                i10 = 0;
            }
            long j3 = i7 & i13;
            switch (K) {
                case 0:
                    if (t0Var.o(obj, i15, i14, i16, i10)) {
                        double d = n1.c.d(obj, j3);
                        m mVar = (m) l0Var.a;
                        mVar.getClass();
                        mVar.u(i17, Double.doubleToRawLongBits(d));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (t0Var.o(obj, i15, i14, i16, i10)) {
                        float e10 = n1.c.e(obj, j3);
                        m mVar2 = (m) l0Var.a;
                        mVar2.getClass();
                        mVar2.s(i17, Float.floatToRawIntBits(e10));
                    }
                    t0Var = this;
                    break;
                case 2:
                    if (t0Var.o(obj, i15, i14, i16, i10)) {
                        ((m) l0Var.a).E(i17, unsafe.getLong(obj, j3));
                    }
                    t0Var = this;
                    break;
                case 3:
                    if (t0Var.o(obj, i15, i14, i16, i10)) {
                        ((m) l0Var.a).E(i17, unsafe.getLong(obj, j3));
                    }
                    t0Var = this;
                    break;
                case 4:
                    if (t0Var.o(obj, i15, i14, i16, i10)) {
                        ((m) l0Var.a).w(i17, unsafe.getInt(obj, j3));
                    }
                    t0Var = this;
                    break;
                case 5:
                    if (t0Var.o(obj, i15, i14, i16, i10)) {
                        ((m) l0Var.a).u(i17, unsafe.getLong(obj, j3));
                    }
                    t0Var = this;
                    break;
                case 6:
                    if (t0Var.o(obj, i15, i14, i16, i10)) {
                        ((m) l0Var.a).s(i17, unsafe.getInt(obj, j3));
                    }
                    t0Var = this;
                    break;
                case 7:
                    if (t0Var.o(obj, i15, i14, i16, i10)) {
                        ((m) l0Var.a).p(i17, n1.c.c(obj, j3));
                    }
                    t0Var = this;
                    break;
                case 8:
                    if (t0Var.o(obj, i15, i14, i16, i10)) {
                        Object object = unsafe.getObject(obj, j3);
                        if (object instanceof String) {
                            ((m) l0Var.a).z(i17, (String) object);
                        } else {
                            ((m) l0Var.a).q(i17, (h) object);
                        }
                    }
                    t0Var = this;
                    break;
                case 9:
                    if (t0Var.o(obj, i15, i14, i16, i10)) {
                        ((m) l0Var.a).y(i17, (a) unsafe.getObject(obj, j3), t0Var.m(i15));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (t0Var.o(obj, i15, i14, i16, i10)) {
                        ((m) l0Var.a).q(i17, (h) unsafe.getObject(obj, j3));
                    }
                    t0Var = this;
                    break;
                case 11:
                    if (t0Var.o(obj, i15, i14, i16, i10)) {
                        ((m) l0Var.a).C(i17, unsafe.getInt(obj, j3));
                    }
                    t0Var = this;
                    break;
                case 12:
                    if (t0Var.o(obj, i15, i14, i16, i10)) {
                        ((m) l0Var.a).w(i17, unsafe.getInt(obj, j3));
                    }
                    t0Var = this;
                    break;
                case 13:
                    if (t0Var.o(obj, i15, i14, i16, i10)) {
                        ((m) l0Var.a).s(i17, unsafe.getInt(obj, j3));
                    }
                    t0Var = this;
                    break;
                case 14:
                    if (t0Var.o(obj, i15, i14, i16, i10)) {
                        ((m) l0Var.a).u(i17, unsafe.getLong(obj, j3));
                    }
                    t0Var = this;
                    break;
                case 15:
                    if (t0Var.o(obj, i15, i14, i16, i10)) {
                        int i20 = unsafe.getInt(obj, j3);
                        ((m) l0Var.a).C(i17, (i20 >> 31) ^ (i20 << 1));
                    }
                    t0Var = this;
                    break;
                case 16:
                    if (t0Var.o(obj, i15, i14, i16, i10)) {
                        long j10 = unsafe.getLong(obj, j3);
                        ((m) l0Var.a).E(i17, (j10 >> 63) ^ (j10 << 1));
                    }
                    t0Var = this;
                    break;
                case 17:
                    if (t0Var.o(obj, i15, i14, i16, i10)) {
                        l0Var.a(i17, unsafe.getObject(obj, j3), t0Var.m(i15));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i11 = i14;
                    c1.n(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, false);
                    i14 = i11;
                    break;
                case 19:
                    i11 = i14;
                    c1.r(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, false);
                    i14 = i11;
                    break;
                case 20:
                    i11 = i14;
                    c1.t(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, false);
                    i14 = i11;
                    break;
                case 21:
                    i11 = i14;
                    c1.z(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, false);
                    i14 = i11;
                    break;
                case 22:
                    i11 = i14;
                    c1.s(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, false);
                    i14 = i11;
                    break;
                case 23:
                    i11 = i14;
                    c1.q(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, false);
                    i14 = i11;
                    break;
                case 24:
                    i11 = i14;
                    c1.p(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, false);
                    i14 = i11;
                    break;
                case 25:
                    i11 = i14;
                    c1.m(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, false);
                    i14 = i11;
                    break;
                case 26:
                    i12 = i14;
                    int i21 = iArr[i15];
                    List list = (List) unsafe.getObject(obj, j3);
                    Class cls = c1.a;
                    if (list != null && !list.isEmpty()) {
                        m mVar3 = (m) l0Var.a;
                        if (list instanceof g0) {
                            g0 g0Var = (g0) list;
                            for (int i22 = 0; i22 < list.size(); i22++) {
                                Object b10 = g0Var.b();
                                if (b10 instanceof String) {
                                    mVar3.z(i21, (String) b10);
                                } else {
                                    mVar3.q(i21, (h) b10);
                                }
                            }
                        } else {
                            for (int i23 = 0; i23 < list.size(); i23++) {
                                mVar3.z(i21, (String) list.get(i23));
                            }
                        }
                    }
                    i14 = i12;
                    break;
                case 27:
                    i12 = i14;
                    int i24 = iArr[i15];
                    List list2 = (List) unsafe.getObject(obj, j3);
                    b1 m10 = t0Var.m(i15);
                    Class cls2 = c1.a;
                    if (list2 != null && !list2.isEmpty()) {
                        l0Var.getClass();
                        for (int i25 = 0; i25 < list2.size(); i25++) {
                            ((m) l0Var.a).y(i24, (a) list2.get(i25), m10);
                        }
                    }
                    i14 = i12;
                    break;
                case 28:
                    i12 = i14;
                    int i26 = iArr[i15];
                    List list3 = (List) unsafe.getObject(obj, j3);
                    Class cls3 = c1.a;
                    if (list3 != null && !list3.isEmpty()) {
                        l0Var.getClass();
                        for (int i27 = 0; i27 < list3.size(); i27++) {
                            ((m) l0Var.a).q(i26, (h) list3.get(i27));
                        }
                    }
                    i14 = i12;
                    break;
                case 29:
                    i11 = i14;
                    z9 = false;
                    c1.y(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, false);
                    i14 = i11;
                    break;
                case qs.T /* 30 */:
                    i11 = i14;
                    z9 = false;
                    c1.o(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, false);
                    i14 = i11;
                    break;
                case qs.U /* 31 */:
                    i11 = i14;
                    z9 = false;
                    c1.u(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, false);
                    i14 = i11;
                    break;
                case 32:
                    i11 = i14;
                    z9 = false;
                    c1.v(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, false);
                    i14 = i11;
                    break;
                case 33:
                    i11 = i14;
                    z9 = false;
                    c1.w(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, false);
                    i14 = i11;
                    break;
                case 34:
                    i11 = i14;
                    z9 = false;
                    c1.x(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, false);
                    i14 = i11;
                    break;
                case 35:
                    i12 = i14;
                    c1.n(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, true);
                    i14 = i12;
                    break;
                case 36:
                    i12 = i14;
                    c1.r(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, true);
                    i14 = i12;
                    break;
                case 37:
                    i12 = i14;
                    c1.t(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, true);
                    i14 = i12;
                    break;
                case 38:
                    i12 = i14;
                    c1.z(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, true);
                    i14 = i12;
                    break;
                case 39:
                    i12 = i14;
                    c1.s(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, true);
                    i14 = i12;
                    break;
                case 40:
                    i12 = i14;
                    c1.q(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, true);
                    i14 = i12;
                    break;
                case 41:
                    i12 = i14;
                    c1.p(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, true);
                    i14 = i12;
                    break;
                case 42:
                    i12 = i14;
                    c1.m(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, true);
                    i14 = i12;
                    break;
                case 43:
                    i12 = i14;
                    c1.y(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, true);
                    i14 = i12;
                    break;
                case 44:
                    i12 = i14;
                    c1.o(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, true);
                    i14 = i12;
                    break;
                case 45:
                    i12 = i14;
                    c1.u(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, true);
                    i14 = i12;
                    break;
                case 46:
                    i12 = i14;
                    c1.v(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, true);
                    i14 = i12;
                    break;
                case 47:
                    i12 = i14;
                    c1.w(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, true);
                    i14 = i12;
                    break;
                case 48:
                    i12 = i14;
                    c1.x(iArr[i15], (List) unsafe.getObject(obj, j3), l0Var, true);
                    i14 = i12;
                    break;
                case 49:
                    i12 = i14;
                    int i28 = iArr[i15];
                    List list4 = (List) unsafe.getObject(obj, j3);
                    b1 m11 = t0Var.m(i15);
                    Class cls4 = c1.a;
                    if (list4 != null && !list4.isEmpty()) {
                        l0Var.getClass();
                        for (int i29 = 0; i29 < list4.size(); i29++) {
                            l0Var.a(i28, list4.get(i29), m11);
                        }
                    }
                    i14 = i12;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j3);
                    if (object2 != null) {
                        int i30 = 2;
                        Object obj2 = t0Var.b[(i15 / 3) * 2];
                        t0Var.m.getClass();
                        m0 m0Var = ((n0) obj2).a;
                        m mVar4 = (m) l0Var.a;
                        mVar4.getClass();
                        for (Map.Entry entry : ((o0) object2).entrySet()) {
                            mVar4.B(i17, i30);
                            mVar4.D(n0.a(m0Var, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            s.b(mVar4, m0Var.a, 1, key);
                            i30 = 2;
                            s.b(mVar4, m0Var.b, 2, value);
                            i14 = i14;
                        }
                    }
                    i12 = i14;
                    i14 = i12;
                    break;
                case qs.o0 /* 51 */:
                    if (t0Var.q(i17, i15, obj)) {
                        double doubleValue = ((Double) n1.c.h(obj, j3)).doubleValue();
                        m mVar5 = (m) l0Var.a;
                        mVar5.getClass();
                        mVar5.u(i17, Double.doubleToRawLongBits(doubleValue));
                    }
                    break;
                case qs.p0 /* 52 */:
                    if (t0Var.q(i17, i15, obj)) {
                        float floatValue = ((Float) n1.c.h(obj, j3)).floatValue();
                        m mVar6 = (m) l0Var.a;
                        mVar6.getClass();
                        mVar6.s(i17, Float.floatToRawIntBits(floatValue));
                    }
                    break;
                case qs.q0 /* 53 */:
                    if (t0Var.q(i17, i15, obj)) {
                        ((m) l0Var.a).E(i17, z(obj, j3));
                    }
                    break;
                case qs.r0 /* 54 */:
                    if (t0Var.q(i17, i15, obj)) {
                        ((m) l0Var.a).E(i17, z(obj, j3));
                    }
                    break;
                case qs.s0 /* 55 */:
                    if (t0Var.q(i17, i15, obj)) {
                        ((m) l0Var.a).w(i17, y(obj, j3));
                    }
                    break;
                case qs.t0 /* 56 */:
                    if (t0Var.q(i17, i15, obj)) {
                        ((m) l0Var.a).u(i17, z(obj, j3));
                    }
                    break;
                case qs.u0 /* 57 */:
                    if (t0Var.q(i17, i15, obj)) {
                        ((m) l0Var.a).s(i17, y(obj, j3));
                    }
                    break;
                case qs.v0 /* 58 */:
                    if (t0Var.q(i17, i15, obj)) {
                        ((m) l0Var.a).p(i17, ((Boolean) n1.c.h(obj, j3)).booleanValue());
                    }
                    break;
                case qs.w0 /* 59 */:
                    if (t0Var.q(i17, i15, obj)) {
                        Object object3 = unsafe.getObject(obj, j3);
                        if (object3 instanceof String) {
                            ((m) l0Var.a).z(i17, (String) object3);
                        } else {
                            ((m) l0Var.a).q(i17, (h) object3);
                        }
                    }
                    break;
                case qs.x0 /* 60 */:
                    if (t0Var.q(i17, i15, obj)) {
                        ((m) l0Var.a).y(i17, (a) unsafe.getObject(obj, j3), t0Var.m(i15));
                    }
                    break;
                case qs.y0 /* 61 */:
                    if (t0Var.q(i17, i15, obj)) {
                        ((m) l0Var.a).q(i17, (h) unsafe.getObject(obj, j3));
                    }
                    break;
                case qs.z0 /* 62 */:
                    if (t0Var.q(i17, i15, obj)) {
                        ((m) l0Var.a).C(i17, y(obj, j3));
                    }
                    break;
                case qs.A0 /* 63 */:
                    if (t0Var.q(i17, i15, obj)) {
                        ((m) l0Var.a).w(i17, y(obj, j3));
                    }
                    break;
                case 64:
                    if (t0Var.q(i17, i15, obj)) {
                        ((m) l0Var.a).s(i17, y(obj, j3));
                    }
                    break;
                case 65:
                    if (t0Var.q(i17, i15, obj)) {
                        ((m) l0Var.a).u(i17, z(obj, j3));
                    }
                    break;
                case qs.D0 /* 66 */:
                    if (t0Var.q(i17, i15, obj)) {
                        int y10 = y(obj, j3);
                        ((m) l0Var.a).C(i17, (y10 >> 31) ^ (y10 << 1));
                    }
                    break;
                case qs.E0 /* 67 */:
                    if (t0Var.q(i17, i15, obj)) {
                        long z10 = z(obj, j3);
                        ((m) l0Var.a).E(i17, (z10 << 1) ^ (z10 >> 63));
                    }
                    break;
                case qs.F0 /* 68 */:
                    if (t0Var.q(i17, i15, obj)) {
                        l0Var.a(i17, unsafe.getObject(obj, j3), t0Var.m(i15));
                    }
                    break;
            }
            i15 += 3;
            i13 = 1048575;
        }
        t0Var.l.getClass();
        ((z) obj).unknownFields.d(l0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final z a() {
        this.j.getClass();
        return ((z) this.e).i();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.b1
    public final void b(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i7 >= iArr.length) {
                c1.k(this.l, obj, obj2);
                return;
            }
            int L = L(i7);
            long j3 = 1048575 & L;
            int i10 = iArr[i7];
            switch (K(L)) {
                case 0:
                    if (n(i7, obj2)) {
                        m1 m1Var = n1.c;
                        obj3 = obj;
                        m1Var.l(obj3, j3, m1Var.d(obj2, j3));
                        G(i7, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (n(i7, obj2)) {
                        m1 m1Var2 = n1.c;
                        m1Var2.m(obj, j3, m1Var2.e(obj2, j3));
                        G(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (n(i7, obj2)) {
                        n1.n(obj, j3, n1.c.g(obj2, j3));
                        G(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (n(i7, obj2)) {
                        n1.n(obj, j3, n1.c.g(obj2, j3));
                        G(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (n(i7, obj2)) {
                        n1.m(j3, obj, n1.c.f(obj2, j3));
                        G(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (n(i7, obj2)) {
                        n1.n(obj, j3, n1.c.g(obj2, j3));
                        G(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (n(i7, obj2)) {
                        n1.m(j3, obj, n1.c.f(obj2, j3));
                        G(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (n(i7, obj2)) {
                        m1 m1Var3 = n1.c;
                        m1Var3.j(obj, j3, m1Var3.c(obj2, j3));
                        G(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (n(i7, obj2)) {
                        n1.o(obj, j3, n1.c.h(obj2, j3));
                        G(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    s(i7, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (n(i7, obj2)) {
                        n1.o(obj, j3, n1.c.h(obj2, j3));
                        G(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (n(i7, obj2)) {
                        n1.m(j3, obj, n1.c.f(obj2, j3));
                        G(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (n(i7, obj2)) {
                        n1.m(j3, obj, n1.c.f(obj2, j3));
                        G(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (n(i7, obj2)) {
                        n1.m(j3, obj, n1.c.f(obj2, j3));
                        G(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (n(i7, obj2)) {
                        n1.n(obj, j3, n1.c.g(obj2, j3));
                        G(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (n(i7, obj2)) {
                        n1.m(j3, obj, n1.c.f(obj2, j3));
                        G(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (n(i7, obj2)) {
                        n1.n(obj, j3, n1.c.g(obj2, j3));
                        G(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    s(i7, obj, obj2);
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
                    this.k.getClass();
                    m1 m1Var4 = n1.c;
                    b0 b0Var = (b0) m1Var4.h(obj, j3);
                    b0 b0Var2 = (b0) m1Var4.h(obj2, j3);
                    int size = b0Var.size();
                    int size2 = b0Var2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((b) b0Var).a) {
                            b0Var = ((z0) b0Var).j(size2 + size);
                        }
                        b0Var.addAll(b0Var2);
                    }
                    if (size > 0) {
                        b0Var2 = b0Var;
                    }
                    n1.o(obj, j3, b0Var2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = c1.a;
                    m1 m1Var5 = n1.c;
                    Object h = m1Var5.h(obj, j3);
                    Object h7 = m1Var5.h(obj2, j3);
                    this.m.getClass();
                    n1.o(obj, j3, p0.a(h, h7));
                    obj3 = obj;
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
                    if (q(i10, i7, obj2)) {
                        n1.o(obj, j3, n1.c.h(obj2, j3));
                        H(i10, i7, obj);
                    }
                    obj3 = obj;
                    break;
                case qs.x0 /* 60 */:
                    t(i7, obj, obj2);
                    obj3 = obj;
                    break;
                case qs.y0 /* 61 */:
                case qs.z0 /* 62 */:
                case qs.A0 /* 63 */:
                case 64:
                case 65:
                case qs.D0 /* 66 */:
                case qs.E0 /* 67 */:
                    if (q(i10, i7, obj2)) {
                        n1.o(obj, j3, n1.c.h(obj2, j3));
                        H(i10, i7, obj);
                    }
                    obj3 = obj;
                    break;
                case qs.F0 /* 68 */:
                    t(i7, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i7 += 3;
            obj = obj3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void c(Object obj, l0 l0Var) {
        l0Var.getClass();
        M(obj, l0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void d(Object obj) {
        if (p(obj)) {
            if (obj instanceof z) {
                z zVar = (z) obj;
                zVar.k(ConnectionsManager.DEFAULT_DATACENTER_ID);
                zVar.memoizedHashCode = 0;
                zVar.h();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int L = L(i7);
                long j3 = 1048575 & L;
                int K = K(L);
                if (K != 9) {
                    if (K != 60 && K != 68) {
                        switch (K) {
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
                                this.k.getClass();
                                b bVar = (b) ((b0) n1.c.h(obj, j3));
                                if (bVar.a) {
                                    bVar.a = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Unsafe unsafe = o;
                                Object object = unsafe.getObject(obj, j3);
                                if (object != null) {
                                    this.m.getClass();
                                    ((o0) object).a = false;
                                    unsafe.putObject(obj, j3, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (q(iArr[i7], i7, obj)) {
                        m(i7).d(o.getObject(obj, j3));
                    }
                }
                if (n(i7, obj)) {
                    m(i7).d(o.getObject(obj, j3));
                }
            }
            this.l.getClass();
            h1 h1Var = ((z) obj).unknownFields;
            if (h1Var.e) {
                h1Var.e = false;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final boolean e(Object obj) {
        int i7;
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.h) {
            int i15 = this.g[i14];
            int[] iArr = this.a;
            int i16 = iArr[i15];
            int L = L(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = o.getInt(obj, i18);
                }
                i10 = i15;
                i11 = i13;
                i7 = i18;
            } else {
                int i20 = i13;
                i7 = i12;
                i10 = i15;
                i11 = i20;
            }
            if ((268435456 & L) == 0 || o(obj, i10, i7, i11, i19)) {
                int K = K(L);
                if (K == 9 || K == 17) {
                    if (o(obj, i10, i7, i11, i19)) {
                        if (!m(i10).e(n1.c.h(obj, L & 1048575))) {
                        }
                    } else {
                        continue;
                    }
                    i14++;
                    i12 = i7;
                    i13 = i11;
                } else {
                    if (K != 27) {
                        if (K == 60 || K == 68) {
                            if (q(i16, i10, obj)) {
                                if (!m(i10).e(n1.c.h(obj, L & 1048575))) {
                                }
                            } else {
                                continue;
                            }
                            i14++;
                            i12 = i7;
                            i13 = i11;
                        } else if (K != 49) {
                            if (K != 50) {
                                continue;
                            } else {
                                Object h = n1.c.h(obj, L & 1048575);
                                this.m.getClass();
                                o0 o0Var = (o0) h;
                                if (o0Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((n0) this.b[(i10 / 3) * 2]).a.b.a != w1.r) {
                                        continue;
                                    } else {
                                        b1 b1Var = null;
                                        for (Object obj2 : o0Var.values()) {
                                            if (b1Var == null) {
                                                b1Var = y0.c.a(obj2.getClass());
                                            }
                                            if (!b1Var.e(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i14++;
                            i12 = i7;
                            i13 = i11;
                        }
                    }
                    List list = (List) n1.c.h(obj, L & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        b1 m10 = m(i10);
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            if (m10.e(list.get(i21))) {
                            }
                        }
                    }
                    i14++;
                    i12 = i7;
                    i13 = i11;
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final int f(z zVar) {
        int i7;
        int i10;
        int i11;
        int i12;
        int k10;
        int i13;
        int k11;
        int i14;
        int i15;
        int g10;
        int i16;
        int a10;
        int c10;
        int i17;
        int size;
        int i18;
        int i19;
        int i20;
        int size2;
        int i21;
        int j3;
        int i22;
        int i23;
        int i24;
        int j10;
        t0 t0Var = this;
        z zVar2 = zVar;
        Unsafe unsafe = o;
        int i25 = 1048575;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (true) {
            int[] iArr = t0Var.a;
            if (i26 >= iArr.length) {
                t0Var.l.getClass();
                return zVar2.unknownFields.b() + i28;
            }
            int L = t0Var.L(i26);
            int K = K(L);
            int i29 = iArr[i26];
            int i30 = iArr[i26 + 2];
            int i31 = i30 & 1048575;
            if (K <= 17) {
                if (i31 != i25) {
                    i27 = i31 == 1048575 ? 0 : unsafe.getInt(zVar2, i31);
                    i25 = i31;
                }
                i7 = 1 << (i30 >>> 20);
            } else {
                i7 = 0;
            }
            long j11 = L & 1048575;
            if (K >= u.b.a) {
                int i32 = u.c.a;
            }
            switch (K) {
                case 0:
                    if (t0Var.o(zVar2, i26, i25, i27, i7)) {
                        i10 = m.i(i29);
                        c10 = i10 + 8;
                        i28 += c10;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (t0Var.o(zVar2, i26, i25, i27, i7)) {
                        i11 = m.i(i29);
                        i15 = i11 + 4;
                        i28 += i15;
                    }
                    t0Var = this;
                    zVar2 = zVar;
                    break;
                case 2:
                    if (t0Var.o(zVar2, i26, i25, i27, i7)) {
                        long j12 = unsafe.getLong(zVar2, j11);
                        i12 = m.i(i29);
                        k10 = m.k(j12);
                        i28 += k10 + i12;
                    }
                    t0Var = this;
                    break;
                case 3:
                    if (t0Var.o(zVar2, i26, i25, i27, i7)) {
                        long j13 = unsafe.getLong(zVar2, j11);
                        i12 = m.i(i29);
                        k10 = m.k(j13);
                        i28 += k10 + i12;
                    }
                    t0Var = this;
                    break;
                case 4:
                    if (t0Var.o(zVar2, i26, i25, i27, i7)) {
                        int i33 = unsafe.getInt(zVar2, j11);
                        i13 = m.i(i29);
                        k11 = m.k(i33);
                        g10 = k11 + i13;
                        i28 += g10;
                    }
                    t0Var = this;
                    break;
                case 5:
                    if (t0Var.o(zVar2, i26, i25, i27, i7)) {
                        i14 = m.i(i29);
                        i15 = i14 + 8;
                        i28 += i15;
                    }
                    t0Var = this;
                    zVar2 = zVar;
                    break;
                case 6:
                    if (t0Var.o(zVar2, i26, i25, i27, i7)) {
                        i11 = m.i(i29);
                        i15 = i11 + 4;
                        i28 += i15;
                    }
                    t0Var = this;
                    zVar2 = zVar;
                    break;
                case 7:
                    if (t0Var.o(zVar2, i26, i25, i27, i7)) {
                        i15 = m.i(i29) + 1;
                        i28 += i15;
                    }
                    t0Var = this;
                    zVar2 = zVar;
                    break;
                case 8:
                    if (t0Var.o(zVar2, i26, i25, i27, i7)) {
                        Object object = unsafe.getObject(zVar2, j11);
                        i28 = (object instanceof h ? m.g(i29, (h) object) : m.h((String) object) + m.i(i29)) + i28;
                    }
                    t0Var = this;
                    break;
                case 9:
                    if (t0Var.o(zVar2, i26, i25, i27, i7)) {
                        Object object2 = unsafe.getObject(zVar2, j11);
                        b1 m10 = t0Var.m(i26);
                        Class cls = c1.a;
                        int i34 = m.i(i29);
                        int a11 = ((a) object2).a(m10);
                        i28 += m.j(a11) + a11 + i34;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (t0Var.o(zVar2, i26, i25, i27, i7)) {
                        g10 = m.g(i29, (h) unsafe.getObject(zVar2, j11));
                        i28 += g10;
                    }
                    t0Var = this;
                    break;
                case 11:
                    if (t0Var.o(zVar2, i26, i25, i27, i7)) {
                        int i35 = unsafe.getInt(zVar2, j11);
                        i13 = m.i(i29);
                        k11 = m.j(i35);
                        g10 = k11 + i13;
                        i28 += g10;
                    }
                    t0Var = this;
                    break;
                case 12:
                    if (t0Var.o(zVar2, i26, i25, i27, i7)) {
                        int i36 = unsafe.getInt(zVar2, j11);
                        i13 = m.i(i29);
                        k11 = m.k(i36);
                        g10 = k11 + i13;
                        i28 += g10;
                    }
                    t0Var = this;
                    break;
                case 13:
                    if (t0Var.o(zVar2, i26, i25, i27, i7)) {
                        i11 = m.i(i29);
                        i15 = i11 + 4;
                        i28 += i15;
                    }
                    t0Var = this;
                    zVar2 = zVar;
                    break;
                case 14:
                    if (t0Var.o(zVar2, i26, i25, i27, i7)) {
                        i14 = m.i(i29);
                        i15 = i14 + 8;
                        i28 += i15;
                    }
                    t0Var = this;
                    zVar2 = zVar;
                    break;
                case 15:
                    if (t0Var.o(zVar2, i26, i25, i27, i7)) {
                        int i37 = unsafe.getInt(zVar2, j11);
                        i13 = m.i(i29);
                        k11 = m.j((i37 >> 31) ^ (i37 << 1));
                        g10 = k11 + i13;
                        i28 += g10;
                    }
                    t0Var = this;
                    break;
                case 16:
                    if (t0Var.o(zVar2, i26, i25, i27, i7)) {
                        long j14 = unsafe.getLong(zVar2, j11);
                        i12 = m.i(i29);
                        k10 = m.k((j14 << 1) ^ (j14 >> 63));
                        i28 += k10 + i12;
                    }
                    t0Var = this;
                    break;
                case 17:
                    if (t0Var.o(zVar2, i26, i25, i27, i7)) {
                        a aVar = (a) unsafe.getObject(zVar2, j11);
                        b1 m11 = t0Var.m(i26);
                        i16 = m.i(i29) * 2;
                        a10 = aVar.a(m11);
                        c10 = a10 + i16;
                        i28 += c10;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    c10 = c1.c(i29, (List) unsafe.getObject(zVar2, j11));
                    i28 += c10;
                    break;
                case 19:
                    c10 = c1.b(i29, (List) unsafe.getObject(zVar2, j11));
                    i28 += c10;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(zVar2, j11);
                    Class cls2 = c1.a;
                    if (list.size() != 0) {
                        i17 = (m.i(i29) * list.size()) + c1.e(list);
                        i28 += i17;
                        break;
                    }
                    i17 = 0;
                    i28 += i17;
                case 21:
                    List list2 = (List) unsafe.getObject(zVar2, j11);
                    Class cls3 = c1.a;
                    size = list2.size();
                    if (size != 0) {
                        i18 = c1.i(list2);
                        i19 = m.i(i29);
                        i17 = (i19 * size) + i18;
                        i28 += i17;
                        break;
                    }
                    i17 = 0;
                    i28 += i17;
                case 22:
                    List list3 = (List) unsafe.getObject(zVar2, j11);
                    Class cls4 = c1.a;
                    size = list3.size();
                    if (size != 0) {
                        i18 = c1.d(list3);
                        i19 = m.i(i29);
                        i17 = (i19 * size) + i18;
                        i28 += i17;
                        break;
                    }
                    i17 = 0;
                    i28 += i17;
                case 23:
                    c10 = c1.c(i29, (List) unsafe.getObject(zVar2, j11));
                    i28 += c10;
                    break;
                case 24:
                    c10 = c1.b(i29, (List) unsafe.getObject(zVar2, j11));
                    i28 += c10;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(zVar2, j11);
                    Class cls5 = c1.a;
                    int size3 = list4.size();
                    i28 += size3 == 0 ? 0 : (m.i(i29) + 1) * size3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(zVar2, j11);
                    Class cls6 = c1.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        i17 = m.i(i29) * size4;
                        if (list5 instanceof g0) {
                            g0 g0Var = (g0) list5;
                            for (int i38 = 0; i38 < size4; i38++) {
                                Object b10 = g0Var.b();
                                if (b10 instanceof h) {
                                    int size5 = ((h) b10).size();
                                    i17 = m.j(size5) + size5 + i17;
                                } else {
                                    i17 = m.h((String) b10) + i17;
                                }
                            }
                        } else {
                            for (int i39 = 0; i39 < size4; i39++) {
                                Object obj = list5.get(i39);
                                if (obj instanceof h) {
                                    int size6 = ((h) obj).size();
                                    i17 = m.j(size6) + size6 + i17;
                                } else {
                                    i17 = m.h((String) obj) + i17;
                                }
                            }
                        }
                        i28 += i17;
                        break;
                    }
                    i17 = 0;
                    i28 += i17;
                case 27:
                    List list6 = (List) unsafe.getObject(zVar2, j11);
                    b1 m12 = t0Var.m(i26);
                    Class cls7 = c1.a;
                    int size7 = list6.size();
                    if (size7 != 0) {
                        i20 = m.i(i29) * size7;
                        for (int i40 = 0; i40 < size7; i40++) {
                            int a12 = ((a) list6.get(i40)).a(m12);
                            i20 += m.j(a12) + a12;
                        }
                        i28 += i20;
                        break;
                    }
                    i20 = 0;
                    i28 += i20;
                case 28:
                    List list7 = (List) unsafe.getObject(zVar2, j11);
                    Class cls8 = c1.a;
                    int size8 = list7.size();
                    if (size8 != 0) {
                        i17 = m.i(i29) * size8;
                        for (int i41 = 0; i41 < list7.size(); i41++) {
                            int size9 = ((h) list7.get(i41)).size();
                            i17 += m.j(size9) + size9;
                        }
                        i28 += i17;
                        break;
                    }
                    i17 = 0;
                    i28 += i17;
                case 29:
                    List list8 = (List) unsafe.getObject(zVar2, j11);
                    Class cls9 = c1.a;
                    size = list8.size();
                    if (size != 0) {
                        i18 = c1.h(list8);
                        i19 = m.i(i29);
                        i17 = (i19 * size) + i18;
                        i28 += i17;
                        break;
                    }
                    i17 = 0;
                    i28 += i17;
                case qs.T /* 30 */:
                    List list9 = (List) unsafe.getObject(zVar2, j11);
                    Class cls10 = c1.a;
                    size = list9.size();
                    if (size != 0) {
                        i18 = c1.a(list9);
                        i19 = m.i(i29);
                        i17 = (i19 * size) + i18;
                        i28 += i17;
                        break;
                    }
                    i17 = 0;
                    i28 += i17;
                case qs.U /* 31 */:
                    c10 = c1.b(i29, (List) unsafe.getObject(zVar2, j11));
                    i28 += c10;
                    break;
                case 32:
                    c10 = c1.c(i29, (List) unsafe.getObject(zVar2, j11));
                    i28 += c10;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(zVar2, j11);
                    Class cls11 = c1.a;
                    size = list10.size();
                    if (size != 0) {
                        i18 = c1.f(list10);
                        i19 = m.i(i29);
                        i17 = (i19 * size) + i18;
                        i28 += i17;
                        break;
                    }
                    i17 = 0;
                    i28 += i17;
                case 34:
                    List list11 = (List) unsafe.getObject(zVar2, j11);
                    Class cls12 = c1.a;
                    size = list11.size();
                    if (size != 0) {
                        i18 = c1.g(list11);
                        i19 = m.i(i29);
                        i17 = (i19 * size) + i18;
                        i28 += i17;
                        break;
                    }
                    i17 = 0;
                    i28 += i17;
                case 35:
                    List list12 = (List) unsafe.getObject(zVar2, j11);
                    Class cls13 = c1.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        i21 = m.i(i29);
                        j3 = m.j(size2);
                        i22 = j3 + i21;
                        j10 = i22 + size2;
                        i28 += j10;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(zVar2, j11);
                    Class cls14 = c1.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        i21 = m.i(i29);
                        j3 = m.j(size2);
                        i22 = j3 + i21;
                        j10 = i22 + size2;
                        i28 += j10;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    size2 = c1.e((List) unsafe.getObject(zVar2, j11));
                    if (size2 > 0) {
                        i21 = m.i(i29);
                        j3 = m.j(size2);
                        i22 = j3 + i21;
                        j10 = i22 + size2;
                        i28 += j10;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    size2 = c1.i((List) unsafe.getObject(zVar2, j11));
                    if (size2 > 0) {
                        i21 = m.i(i29);
                        j3 = m.j(size2);
                        i22 = j3 + i21;
                        j10 = i22 + size2;
                        i28 += j10;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    size2 = c1.d((List) unsafe.getObject(zVar2, j11));
                    if (size2 > 0) {
                        i21 = m.i(i29);
                        j3 = m.j(size2);
                        i22 = j3 + i21;
                        j10 = i22 + size2;
                        i28 += j10;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(zVar2, j11);
                    Class cls15 = c1.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        i21 = m.i(i29);
                        j3 = m.j(size2);
                        i22 = j3 + i21;
                        j10 = i22 + size2;
                        i28 += j10;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(zVar2, j11);
                    Class cls16 = c1.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        i21 = m.i(i29);
                        j3 = m.j(size2);
                        i22 = j3 + i21;
                        j10 = i22 + size2;
                        i28 += j10;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(zVar2, j11);
                    Class cls17 = c1.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        i21 = m.i(i29);
                        j3 = m.j(size2);
                        i22 = j3 + i21;
                        j10 = i22 + size2;
                        i28 += j10;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    size2 = c1.h((List) unsafe.getObject(zVar2, j11));
                    if (size2 > 0) {
                        i21 = m.i(i29);
                        j3 = m.j(size2);
                        i22 = j3 + i21;
                        j10 = i22 + size2;
                        i28 += j10;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    size2 = c1.a((List) unsafe.getObject(zVar2, j11));
                    if (size2 > 0) {
                        i21 = m.i(i29);
                        j3 = m.j(size2);
                        i22 = j3 + i21;
                        j10 = i22 + size2;
                        i28 += j10;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(zVar2, j11);
                    Class cls18 = c1.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        i21 = m.i(i29);
                        j3 = m.j(size2);
                        i22 = j3 + i21;
                        j10 = i22 + size2;
                        i28 += j10;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(zVar2, j11);
                    Class cls19 = c1.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        i21 = m.i(i29);
                        j3 = m.j(size2);
                        i22 = j3 + i21;
                        j10 = i22 + size2;
                        i28 += j10;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    size2 = c1.f((List) unsafe.getObject(zVar2, j11));
                    if (size2 > 0) {
                        i21 = m.i(i29);
                        j3 = m.j(size2);
                        i22 = j3 + i21;
                        j10 = i22 + size2;
                        i28 += j10;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    size2 = c1.g((List) unsafe.getObject(zVar2, j11));
                    if (size2 > 0) {
                        i21 = m.i(i29);
                        j3 = m.j(size2);
                        i22 = j3 + i21;
                        j10 = i22 + size2;
                        i28 += j10;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(zVar2, j11);
                    b1 m13 = t0Var.m(i26);
                    Class cls20 = c1.a;
                    int size10 = list19.size();
                    if (size10 == 0) {
                        i23 = 0;
                    } else {
                        i23 = 0;
                        for (int i42 = 0; i42 < size10; i42++) {
                            i23 += ((a) list19.get(i42)).a(m13) + (m.i(i29) * 2);
                        }
                    }
                    i28 += i23;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(zVar2, j11);
                    Object obj2 = t0Var.b[(i26 / 3) * 2];
                    t0Var.m.getClass();
                    o0 o0Var = (o0) object3;
                    n0 n0Var = (n0) obj2;
                    if (!o0Var.isEmpty()) {
                        i20 = 0;
                        for (Map.Entry entry : o0Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            n0Var.getClass();
                            int i43 = m.i(i29);
                            int a13 = n0.a(n0Var.a, key, value);
                            i20 += m.j(a13) + a13 + i43;
                        }
                        i28 += i20;
                        break;
                    }
                    i20 = 0;
                    i28 += i20;
                case qs.o0 /* 51 */:
                    if (t0Var.q(i29, i26, zVar2)) {
                        i10 = m.i(i29);
                        c10 = i10 + 8;
                        i28 += c10;
                        break;
                    } else {
                        break;
                    }
                case qs.p0 /* 52 */:
                    if (t0Var.q(i29, i26, zVar2)) {
                        i24 = m.i(i29);
                        c10 = i24 + 4;
                        i28 += c10;
                        break;
                    } else {
                        break;
                    }
                case qs.q0 /* 53 */:
                    if (t0Var.q(i29, i26, zVar2)) {
                        long z9 = z(zVar2, j11);
                        size2 = m.i(i29);
                        i22 = m.k(z9);
                        j10 = i22 + size2;
                        i28 += j10;
                        break;
                    } else {
                        break;
                    }
                case qs.r0 /* 54 */:
                    if (t0Var.q(i29, i26, zVar2)) {
                        long z10 = z(zVar2, j11);
                        size2 = m.i(i29);
                        i22 = m.k(z10);
                        j10 = i22 + size2;
                        i28 += j10;
                        break;
                    } else {
                        break;
                    }
                case qs.s0 /* 55 */:
                    if (t0Var.q(i29, i26, zVar2)) {
                        int y10 = y(zVar2, j11);
                        i16 = m.i(i29);
                        a10 = m.k(y10);
                        c10 = a10 + i16;
                        i28 += c10;
                        break;
                    } else {
                        break;
                    }
                case qs.t0 /* 56 */:
                    if (t0Var.q(i29, i26, zVar2)) {
                        i10 = m.i(i29);
                        c10 = i10 + 8;
                        i28 += c10;
                        break;
                    } else {
                        break;
                    }
                case qs.u0 /* 57 */:
                    if (t0Var.q(i29, i26, zVar2)) {
                        i24 = m.i(i29);
                        c10 = i24 + 4;
                        i28 += c10;
                        break;
                    } else {
                        break;
                    }
                case qs.v0 /* 58 */:
                    if (t0Var.q(i29, i26, zVar2)) {
                        c10 = m.i(i29) + 1;
                        i28 += c10;
                        break;
                    } else {
                        break;
                    }
                case qs.w0 /* 59 */:
                    if (t0Var.q(i29, i26, zVar2)) {
                        Object object4 = unsafe.getObject(zVar2, j11);
                        i28 = (object4 instanceof h ? m.g(i29, (h) object4) : m.h((String) object4) + m.i(i29)) + i28;
                        break;
                    } else {
                        break;
                    }
                case qs.x0 /* 60 */:
                    if (t0Var.q(i29, i26, zVar2)) {
                        Object object5 = unsafe.getObject(zVar2, j11);
                        b1 m14 = t0Var.m(i26);
                        Class cls21 = c1.a;
                        int i44 = m.i(i29);
                        int a14 = ((a) object5).a(m14);
                        j10 = m.j(a14) + a14 + i44;
                        i28 += j10;
                        break;
                    } else {
                        break;
                    }
                case qs.y0 /* 61 */:
                    if (t0Var.q(i29, i26, zVar2)) {
                        c10 = m.g(i29, (h) unsafe.getObject(zVar2, j11));
                        i28 += c10;
                        break;
                    } else {
                        break;
                    }
                case qs.z0 /* 62 */:
                    if (t0Var.q(i29, i26, zVar2)) {
                        int y11 = y(zVar2, j11);
                        i16 = m.i(i29);
                        a10 = m.j(y11);
                        c10 = a10 + i16;
                        i28 += c10;
                        break;
                    } else {
                        break;
                    }
                case qs.A0 /* 63 */:
                    if (t0Var.q(i29, i26, zVar2)) {
                        int y12 = y(zVar2, j11);
                        i16 = m.i(i29);
                        a10 = m.k(y12);
                        c10 = a10 + i16;
                        i28 += c10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (t0Var.q(i29, i26, zVar2)) {
                        i24 = m.i(i29);
                        c10 = i24 + 4;
                        i28 += c10;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (t0Var.q(i29, i26, zVar2)) {
                        i10 = m.i(i29);
                        c10 = i10 + 8;
                        i28 += c10;
                        break;
                    } else {
                        break;
                    }
                case qs.D0 /* 66 */:
                    if (t0Var.q(i29, i26, zVar2)) {
                        int y13 = y(zVar2, j11);
                        i16 = m.i(i29);
                        a10 = m.j((y13 >> 31) ^ (y13 << 1));
                        c10 = a10 + i16;
                        i28 += c10;
                        break;
                    } else {
                        break;
                    }
                case qs.E0 /* 67 */:
                    if (t0Var.q(i29, i26, zVar2)) {
                        long z11 = z(zVar2, j11);
                        size2 = m.i(i29);
                        i22 = m.k((z11 << 1) ^ (z11 >> 63));
                        j10 = i22 + size2;
                        i28 += j10;
                        break;
                    } else {
                        break;
                    }
                case qs.F0 /* 68 */:
                    if (t0Var.q(i29, i26, zVar2)) {
                        c10 = ((a) unsafe.getObject(zVar2, j11)).a(t0Var.m(i26)) + (m.i(i29) * 2);
                        i28 += c10;
                        break;
                    } else {
                        break;
                    }
            }
            i26 += 3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r3 = r8 + r3;
     */
    @Override // androidx.datastore.preferences.protobuf.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(z zVar) {
        int i7;
        int b10;
        int i10;
        int[] iArr = this.a;
        int length = iArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int L = L(i12);
            int i13 = iArr[i12];
            long j3 = 1048575 & L;
            int i14 = 1237;
            int i15 = 37;
            switch (K(L)) {
                case 0:
                    i7 = i11 * 53;
                    b10 = c0.b(Double.doubleToLongBits(n1.c.d(zVar, j3)));
                    i11 = b10 + i7;
                    break;
                case 1:
                    i7 = i11 * 53;
                    b10 = Float.floatToIntBits(n1.c.e(zVar, j3));
                    i11 = b10 + i7;
                    break;
                case 2:
                    i7 = i11 * 53;
                    b10 = c0.b(n1.c.g(zVar, j3));
                    i11 = b10 + i7;
                    break;
                case 3:
                    i7 = i11 * 53;
                    b10 = c0.b(n1.c.g(zVar, j3));
                    i11 = b10 + i7;
                    break;
                case 4:
                    i7 = i11 * 53;
                    b10 = n1.c.f(zVar, j3);
                    i11 = b10 + i7;
                    break;
                case 5:
                    i7 = i11 * 53;
                    b10 = c0.b(n1.c.g(zVar, j3));
                    i11 = b10 + i7;
                    break;
                case 6:
                    i7 = i11 * 53;
                    b10 = n1.c.f(zVar, j3);
                    i11 = b10 + i7;
                    break;
                case 7:
                    i10 = i11 * 53;
                    boolean c10 = n1.c.c(zVar, j3);
                    Charset charset = c0.a;
                    break;
                case 8:
                    i7 = i11 * 53;
                    b10 = ((String) n1.c.h(zVar, j3)).hashCode();
                    i11 = b10 + i7;
                    break;
                case 9:
                    Object h = n1.c.h(zVar, j3);
                    if (h != null) {
                        i15 = h.hashCode();
                    }
                    i11 = (i11 * 53) + i15;
                    break;
                case 10:
                    i7 = i11 * 53;
                    b10 = n1.c.h(zVar, j3).hashCode();
                    i11 = b10 + i7;
                    break;
                case 11:
                    i7 = i11 * 53;
                    b10 = n1.c.f(zVar, j3);
                    i11 = b10 + i7;
                    break;
                case 12:
                    i7 = i11 * 53;
                    b10 = n1.c.f(zVar, j3);
                    i11 = b10 + i7;
                    break;
                case 13:
                    i7 = i11 * 53;
                    b10 = n1.c.f(zVar, j3);
                    i11 = b10 + i7;
                    break;
                case 14:
                    i7 = i11 * 53;
                    b10 = c0.b(n1.c.g(zVar, j3));
                    i11 = b10 + i7;
                    break;
                case 15:
                    i7 = i11 * 53;
                    b10 = n1.c.f(zVar, j3);
                    i11 = b10 + i7;
                    break;
                case 16:
                    i7 = i11 * 53;
                    b10 = c0.b(n1.c.g(zVar, j3));
                    i11 = b10 + i7;
                    break;
                case 17:
                    Object h7 = n1.c.h(zVar, j3);
                    if (h7 != null) {
                        i15 = h7.hashCode();
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
                    i7 = i11 * 53;
                    b10 = n1.c.h(zVar, j3).hashCode();
                    i11 = b10 + i7;
                    break;
                case 50:
                    i7 = i11 * 53;
                    b10 = n1.c.h(zVar, j3).hashCode();
                    i11 = b10 + i7;
                    break;
                case qs.o0 /* 51 */:
                    if (q(i13, i12, zVar)) {
                        i7 = i11 * 53;
                        b10 = c0.b(Double.doubleToLongBits(((Double) n1.c.h(zVar, j3)).doubleValue()));
                        i11 = b10 + i7;
                        break;
                    } else {
                        break;
                    }
                case qs.p0 /* 52 */:
                    if (q(i13, i12, zVar)) {
                        i7 = i11 * 53;
                        b10 = Float.floatToIntBits(((Float) n1.c.h(zVar, j3)).floatValue());
                        i11 = b10 + i7;
                        break;
                    } else {
                        break;
                    }
                case qs.q0 /* 53 */:
                    if (q(i13, i12, zVar)) {
                        i7 = i11 * 53;
                        b10 = c0.b(z(zVar, j3));
                        i11 = b10 + i7;
                        break;
                    } else {
                        break;
                    }
                case qs.r0 /* 54 */:
                    if (q(i13, i12, zVar)) {
                        i7 = i11 * 53;
                        b10 = c0.b(z(zVar, j3));
                        i11 = b10 + i7;
                        break;
                    } else {
                        break;
                    }
                case qs.s0 /* 55 */:
                    if (q(i13, i12, zVar)) {
                        i7 = i11 * 53;
                        b10 = y(zVar, j3);
                        i11 = b10 + i7;
                        break;
                    } else {
                        break;
                    }
                case qs.t0 /* 56 */:
                    if (q(i13, i12, zVar)) {
                        i7 = i11 * 53;
                        b10 = c0.b(z(zVar, j3));
                        i11 = b10 + i7;
                        break;
                    } else {
                        break;
                    }
                case qs.u0 /* 57 */:
                    if (q(i13, i12, zVar)) {
                        i7 = i11 * 53;
                        b10 = y(zVar, j3);
                        i11 = b10 + i7;
                        break;
                    } else {
                        break;
                    }
                case qs.v0 /* 58 */:
                    if (q(i13, i12, zVar)) {
                        i10 = i11 * 53;
                        boolean booleanValue = ((Boolean) n1.c.h(zVar, j3)).booleanValue();
                        Charset charset2 = c0.a;
                        break;
                    } else {
                        break;
                    }
                case qs.w0 /* 59 */:
                    if (q(i13, i12, zVar)) {
                        i7 = i11 * 53;
                        b10 = ((String) n1.c.h(zVar, j3)).hashCode();
                        i11 = b10 + i7;
                        break;
                    } else {
                        break;
                    }
                case qs.x0 /* 60 */:
                    if (q(i13, i12, zVar)) {
                        i7 = i11 * 53;
                        b10 = n1.c.h(zVar, j3).hashCode();
                        i11 = b10 + i7;
                        break;
                    } else {
                        break;
                    }
                case qs.y0 /* 61 */:
                    if (q(i13, i12, zVar)) {
                        i7 = i11 * 53;
                        b10 = n1.c.h(zVar, j3).hashCode();
                        i11 = b10 + i7;
                        break;
                    } else {
                        break;
                    }
                case qs.z0 /* 62 */:
                    if (q(i13, i12, zVar)) {
                        i7 = i11 * 53;
                        b10 = y(zVar, j3);
                        i11 = b10 + i7;
                        break;
                    } else {
                        break;
                    }
                case qs.A0 /* 63 */:
                    if (q(i13, i12, zVar)) {
                        i7 = i11 * 53;
                        b10 = y(zVar, j3);
                        i11 = b10 + i7;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i13, i12, zVar)) {
                        i7 = i11 * 53;
                        b10 = y(zVar, j3);
                        i11 = b10 + i7;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (q(i13, i12, zVar)) {
                        i7 = i11 * 53;
                        b10 = c0.b(z(zVar, j3));
                        i11 = b10 + i7;
                        break;
                    } else {
                        break;
                    }
                case qs.D0 /* 66 */:
                    if (q(i13, i12, zVar)) {
                        i7 = i11 * 53;
                        b10 = y(zVar, j3);
                        i11 = b10 + i7;
                        break;
                    } else {
                        break;
                    }
                case qs.E0 /* 67 */:
                    if (q(i13, i12, zVar)) {
                        i7 = i11 * 53;
                        b10 = c0.b(z(zVar, j3));
                        i11 = b10 + i7;
                        break;
                    } else {
                        break;
                    }
                case qs.F0 /* 68 */:
                    if (q(i13, i12, zVar)) {
                        i7 = i11 * 53;
                        b10 = n1.c.h(zVar, j3).hashCode();
                        i11 = b10 + i7;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.l.getClass();
        return zVar.unknownFields.hashCode() + (i11 * 53);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.c1.l(r5.h(r12, r7), r5.h(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.f(r12, r7) == r5.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.f(r12, r7) == r5.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.f(r12, r7) == r5.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.f(r12, r7) == r5.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (androidx.datastore.preferences.protobuf.c1.l(r5.h(r12, r7), r5.h(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.c1.l(r5.h(r12, r7), r5.h(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.c1.l(r5.h(r12, r7), r5.h(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.c(r12, r7) == r5.c(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.f(r12, r7) == r5.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.f(r12, r7) == r5.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.e(r12, r7)) == java.lang.Float.floatToIntBits(r5.e(r13, r7))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.d(r12, r7)) == java.lang.Double.doubleToLongBits(r5.d(r13, r7))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (androidx.datastore.preferences.protobuf.c1.l(r9.h(r12, r7), r9.h(r13, r7)) != false) goto L105;
     */
    @Override // androidx.datastore.preferences.protobuf.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(z zVar, z zVar2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i7 = 0;
        while (true) {
            boolean z9 = true;
            if (i7 < length) {
                int L = L(i7);
                long j3 = L & 1048575;
                switch (K(L)) {
                    case 0:
                        if (j(zVar, zVar2, i7)) {
                            m1 m1Var = n1.c;
                            break;
                        }
                        z9 = false;
                        break;
                    case 1:
                        if (j(zVar, zVar2, i7)) {
                            m1 m1Var2 = n1.c;
                            break;
                        }
                        z9 = false;
                        break;
                    case 2:
                        if (j(zVar, zVar2, i7)) {
                            m1 m1Var3 = n1.c;
                            break;
                        }
                        z9 = false;
                        break;
                    case 3:
                        if (j(zVar, zVar2, i7)) {
                            m1 m1Var4 = n1.c;
                            break;
                        }
                        z9 = false;
                        break;
                    case 4:
                        if (j(zVar, zVar2, i7)) {
                            m1 m1Var5 = n1.c;
                            break;
                        }
                        z9 = false;
                        break;
                    case 5:
                        if (j(zVar, zVar2, i7)) {
                            m1 m1Var6 = n1.c;
                            break;
                        }
                        z9 = false;
                        break;
                    case 6:
                        if (j(zVar, zVar2, i7)) {
                            m1 m1Var7 = n1.c;
                            break;
                        }
                        z9 = false;
                        break;
                    case 7:
                        if (j(zVar, zVar2, i7)) {
                            m1 m1Var8 = n1.c;
                            break;
                        }
                        z9 = false;
                        break;
                    case 8:
                        if (j(zVar, zVar2, i7)) {
                            m1 m1Var9 = n1.c;
                            break;
                        }
                        z9 = false;
                        break;
                    case 9:
                        if (j(zVar, zVar2, i7)) {
                            m1 m1Var10 = n1.c;
                            break;
                        }
                        z9 = false;
                        break;
                    case 10:
                        if (j(zVar, zVar2, i7)) {
                            m1 m1Var11 = n1.c;
                            break;
                        }
                        z9 = false;
                        break;
                    case 11:
                        if (j(zVar, zVar2, i7)) {
                            m1 m1Var12 = n1.c;
                            break;
                        }
                        z9 = false;
                        break;
                    case 12:
                        if (j(zVar, zVar2, i7)) {
                            m1 m1Var13 = n1.c;
                            break;
                        }
                        z9 = false;
                        break;
                    case 13:
                        if (j(zVar, zVar2, i7)) {
                            m1 m1Var14 = n1.c;
                            break;
                        }
                        z9 = false;
                        break;
                    case 14:
                        if (j(zVar, zVar2, i7)) {
                            m1 m1Var15 = n1.c;
                            break;
                        }
                        z9 = false;
                        break;
                    case 15:
                        if (j(zVar, zVar2, i7)) {
                            m1 m1Var16 = n1.c;
                            break;
                        }
                        z9 = false;
                        break;
                    case 16:
                        if (j(zVar, zVar2, i7)) {
                            m1 m1Var17 = n1.c;
                            break;
                        }
                        z9 = false;
                        break;
                    case 17:
                        if (j(zVar, zVar2, i7)) {
                            m1 m1Var18 = n1.c;
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
                        m1 m1Var19 = n1.c;
                        z9 = c1.l(m1Var19.h(zVar, j3), m1Var19.h(zVar2, j3));
                        break;
                    case 50:
                        m1 m1Var20 = n1.c;
                        z9 = c1.l(m1Var20.h(zVar, j3), m1Var20.h(zVar2, j3));
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
                        m1 m1Var21 = n1.c;
                        if (m1Var21.f(zVar, j10) == m1Var21.f(zVar2, j10)) {
                            break;
                        }
                        z9 = false;
                        break;
                }
                if (z9) {
                    i7 += 3;
                }
            } else {
                this.l.getClass();
                if (zVar.unknownFields.equals(zVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // androidx.datastore.preferences.protobuf.b1
    public final void i(java.lang.Object r19, d4.f r20, androidx.datastore.preferences.protobuf.p r21) {
        /*
            Method dump skipped, instructions count: 1940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.t0.i(java.lang.Object, d4.f, androidx.datastore.preferences.protobuf.p):void");
    }

    public final boolean j(z zVar, z zVar2, int i7) {
        return n(i7, zVar) == n(i7, zVar2);
    }

    public final void k(int i7, Object obj, Object obj2) {
        int i10 = this.a[i7];
        if (n1.c.h(obj, L(i7) & 1048575) == null) {
            return;
        }
        l(i7);
    }

    public final void l(int i7) {
        if (this.b[((i7 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final b1 m(int i7) {
        int i10 = (i7 / 3) * 2;
        Object[] objArr = this.b;
        b1 b1Var = (b1) objArr[i10];
        if (b1Var != null) {
            return b1Var;
        }
        b1 a10 = y0.c.a((Class) objArr[i10 + 1]);
        objArr[i10] = a10;
        return a10;
    }

    public final boolean n(int i7, Object obj) {
        int i10 = this.a[i7 + 2];
        long j3 = i10 & 1048575;
        if (j3 == 1048575) {
            int L = L(i7);
            long j10 = L & 1048575;
            switch (K(L)) {
                case 0:
                    if (Double.doubleToRawLongBits(n1.c.d(obj, j10)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(n1.c.e(obj, j10)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (n1.c.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (n1.c.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (n1.c.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (n1.c.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (n1.c.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return n1.c.c(obj, j10);
                case 8:
                    Object h = n1.c.h(obj, j10);
                    if (h instanceof String) {
                        return !((String) h).isEmpty();
                    }
                    if (h instanceof h) {
                        return !h.c.equals(h);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (n1.c.h(obj, j10) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !h.c.equals(n1.c.h(obj, j10));
                case 11:
                    if (n1.c.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (n1.c.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (n1.c.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (n1.c.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (n1.c.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (n1.c.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (n1.c.h(obj, j10) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & n1.c.f(obj, j3)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean o(Object obj, int i7, int i10, int i11, int i12) {
        return i10 == 1048575 ? n(i7, obj) : (i11 & i12) != 0;
    }

    public final boolean q(int i7, int i10, Object obj) {
        return n1.c.f(obj, (long) (this.a[i10 + 2] & 1048575)) == i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        r10.put(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        r0.d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(Object obj, int i7, Object obj2, p pVar, d4.f fVar) {
        long L = L(i7) & 1048575;
        Object h = n1.c.h(obj, L);
        p0 p0Var = this.m;
        if (h == null) {
            p0Var.getClass();
            h = o0.b.c();
            n1.o(obj, L, h);
        } else {
            p0Var.getClass();
            if (!((o0) h).a) {
                o0 c10 = o0.b.c();
                p0.a(c10, h);
                n1.o(obj, L, c10);
                h = c10;
            }
        }
        p0Var.getClass();
        o0 o0Var = (o0) h;
        m0 m0Var = ((n0) obj2).a;
        fVar.G(2);
        k kVar = (k) fVar.b;
        int e10 = kVar.e(kVar.v());
        Object obj3 = m0Var.c;
        Object obj4 = "";
        Object obj5 = obj3;
        while (true) {
            try {
                int e11 = fVar.e();
                if (e11 == Integer.MAX_VALUE || kVar.c()) {
                    break;
                }
                if (e11 == 1) {
                    obj4 = fVar.s(m0Var.a, null, null);
                } else if (e11 != 2) {
                    try {
                        if (!fVar.N()) {
                            throw new e0("Unable to parse map entry.");
                        }
                    } catch (d0 unused) {
                        if (!fVar.N()) {
                            throw new e0("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj5 = fVar.s(m0Var.b, obj3.getClass(), pVar);
                }
            } catch (Throwable th2) {
                kVar.d(e10);
                throw th2;
            }
        }
    }

    public final void s(int i7, Object obj, Object obj2) {
        if (n(i7, obj2)) {
            long L = L(i7) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, L);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i7] + " is present but null: " + obj2);
            }
            b1 m10 = m(i7);
            if (!n(i7, obj)) {
                if (p(object)) {
                    z a10 = m10.a();
                    m10.b(a10, object);
                    unsafe.putObject(obj, L, a10);
                } else {
                    unsafe.putObject(obj, L, object);
                }
                G(i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, L);
            if (!p(object2)) {
                z a11 = m10.a();
                m10.b(a11, object2);
                unsafe.putObject(obj, L, a11);
                object2 = a11;
            }
            m10.b(object2, object);
        }
    }

    public final void t(int i7, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i10 = iArr[i7];
        if (q(i10, i7, obj2)) {
            long L = L(i7) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, L);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i7] + " is present but null: " + obj2);
            }
            b1 m10 = m(i7);
            if (!q(i10, i7, obj)) {
                if (p(object)) {
                    z a10 = m10.a();
                    m10.b(a10, object);
                    unsafe.putObject(obj, L, a10);
                } else {
                    unsafe.putObject(obj, L, object);
                }
                H(i10, i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, L);
            if (!p(object2)) {
                z a11 = m10.a();
                m10.b(a11, object2);
                unsafe.putObject(obj, L, a11);
                object2 = a11;
            }
            m10.b(object2, object);
        }
    }

    public final Object u(int i7, Object obj) {
        b1 m10 = m(i7);
        long L = L(i7) & 1048575;
        if (!n(i7, obj)) {
            return m10.a();
        }
        Object object = o.getObject(obj, L);
        if (p(object)) {
            return object;
        }
        z a10 = m10.a();
        if (object != null) {
            m10.b(a10, object);
        }
        return a10;
    }

    public final Object v(int i7, int i10, Object obj) {
        b1 m10 = m(i10);
        if (!q(i7, i10, obj)) {
            return m10.a();
        }
        Object object = o.getObject(obj, L(i10) & 1048575);
        if (p(object)) {
            return object;
        }
        z a10 = m10.a();
        if (object != null) {
            m10.b(a10, object);
        }
        return a10;
    }
}
