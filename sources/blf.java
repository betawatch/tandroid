// default package

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class blf implements jlf {
    public static final int[] h = new int[0];
    public static final Unsafe i;
    public final int[] a;
    public final Object[] b;
    public final zhf c;
    public final int[] d;
    public final int e;
    public final okf f;
    public final tlf g;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new r2((byte) 7));
        } catch (Throwable unused) {
            unsafe = null;
        }
        i = unsafe;
    }

    public blf(int[] iArr, Object[] objArr, zhf zhfVar, int[] iArr2, int i2, okf okfVar, tlf tlfVar, ejf ejfVar) {
        this.a = iArr;
        this.b = objArr;
        this.d = iArr2;
        this.e = i2;
        this.f = okfVar;
        this.g = tlfVar;
        this.c = zhfVar;
    }

    public static boolean h(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof ljf) {
            return ((ljf) obj).g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static blf j(ilf ilfVar, okf okfVar, tlf tlfVar, ejf ejfVar) {
        int i2;
        int charAt;
        int charAt2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        char charAt3;
        int i7;
        char charAt4;
        int i8;
        char charAt5;
        int i9;
        char charAt6;
        int i10;
        int i11;
        int i12;
        char charAt7;
        int i13;
        char charAt8;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int objectFieldOffset;
        String str;
        char c;
        int i19;
        int i20;
        Field p;
        int i21;
        char charAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field p2;
        Object obj2;
        Field p3;
        int i27;
        char charAt10;
        int i28;
        char charAt11;
        int i29;
        char charAt12;
        int i30;
        char charAt13;
        if (!(ilfVar instanceof ilf)) {
            grb.o();
            return null;
        }
        String str2 = ilfVar.b;
        int length = str2.length();
        char c2 = 55296;
        if (str2.charAt(0) >= 55296) {
            int i31 = 1;
            while (true) {
                i2 = i31 + 1;
                if (str2.charAt(i31) < 55296) {
                    break;
                }
                i31 = i2;
            }
        } else {
            i2 = 1;
        }
        int i32 = i2 + 1;
        int charAt14 = str2.charAt(i2);
        if (charAt14 >= 55296) {
            int i33 = charAt14 & 8191;
            int i34 = 13;
            while (true) {
                i30 = i32 + 1;
                charAt13 = str2.charAt(i32);
                if (charAt13 < 55296) {
                    break;
                }
                i33 |= (charAt13 & 8191) << i34;
                i34 += 13;
                i32 = i30;
            }
            charAt14 = i33 | (charAt13 << i34);
            i32 = i30;
        }
        if (charAt14 == 0) {
            charAt = 0;
            charAt2 = 0;
            i3 = 0;
            i5 = 0;
            iArr = h;
            i4 = 0;
        } else {
            int i35 = i32 + 1;
            int charAt15 = str2.charAt(i32);
            if (charAt15 >= 55296) {
                int i36 = charAt15 & 8191;
                int i37 = 13;
                while (true) {
                    i13 = i35 + 1;
                    charAt8 = str2.charAt(i35);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i36 |= (charAt8 & 8191) << i37;
                    i37 += 13;
                    i35 = i13;
                }
                charAt15 = i36 | (charAt8 << i37);
                i35 = i13;
            }
            int i38 = i35 + 1;
            int charAt16 = str2.charAt(i35);
            if (charAt16 >= 55296) {
                int i39 = charAt16 & 8191;
                int i40 = 13;
                while (true) {
                    i12 = i38 + 1;
                    charAt7 = str2.charAt(i38);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i39 |= (charAt7 & 8191) << i40;
                    i40 += 13;
                    i38 = i12;
                }
                charAt16 = i39 | (charAt7 << i40);
                i38 = i12;
            }
            int i41 = i38 + 1;
            if (str2.charAt(i38) >= 55296) {
                while (true) {
                    i11 = i41 + 1;
                    if (str2.charAt(i41) < 55296) {
                        break;
                    }
                    i41 = i11;
                }
                i41 = i11;
            }
            int i42 = i41 + 1;
            if (str2.charAt(i41) >= 55296) {
                while (true) {
                    i10 = i42 + 1;
                    if (str2.charAt(i42) < 55296) {
                        break;
                    }
                    i42 = i10;
                }
                i42 = i10;
            }
            int i43 = i42 + 1;
            charAt = str2.charAt(i42);
            if (charAt >= 55296) {
                int i44 = charAt & 8191;
                int i45 = 13;
                while (true) {
                    i9 = i43 + 1;
                    charAt6 = str2.charAt(i43);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i44 |= (charAt6 & 8191) << i45;
                    i45 += 13;
                    i43 = i9;
                }
                charAt = i44 | (charAt6 << i45);
                i43 = i9;
            }
            int i46 = i43 + 1;
            charAt2 = str2.charAt(i43);
            if (charAt2 >= 55296) {
                int i47 = charAt2 & 8191;
                int i48 = 13;
                while (true) {
                    i8 = i46 + 1;
                    charAt5 = str2.charAt(i46);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i47 |= (charAt5 & 8191) << i48;
                    i48 += 13;
                    i46 = i8;
                }
                charAt2 = i47 | (charAt5 << i48);
                i46 = i8;
            }
            int i49 = i46 + 1;
            int charAt17 = str2.charAt(i46);
            if (charAt17 >= 55296) {
                int i50 = charAt17 & 8191;
                int i51 = 13;
                while (true) {
                    i7 = i49 + 1;
                    charAt4 = str2.charAt(i49);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i50 |= (charAt4 & 8191) << i51;
                    i51 += 13;
                    i49 = i7;
                }
                charAt17 = i50 | (charAt4 << i51);
                i49 = i7;
            }
            int i52 = i49 + 1;
            int charAt18 = str2.charAt(i49);
            if (charAt18 >= 55296) {
                int i53 = charAt18 & 8191;
                int i54 = 13;
                while (true) {
                    i6 = i52 + 1;
                    charAt3 = str2.charAt(i52);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i53 |= (charAt3 & 8191) << i54;
                    i54 += 13;
                    i52 = i6;
                }
                charAt18 = i53 | (charAt3 << i54);
                i52 = i6;
            }
            int i55 = charAt18 + charAt2 + charAt17;
            i3 = (charAt15 << 1) + charAt16;
            i4 = charAt15;
            i32 = i52;
            iArr = new int[i55];
            i5 = charAt18;
        }
        Object[] objArr = ilfVar.c;
        Class<?> cls = ilfVar.a.getClass();
        int i56 = charAt2 + i5;
        int i57 = charAt << 1;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr2 = new Object[i57];
        int i58 = i5;
        int i59 = 0;
        int i60 = 0;
        while (i32 < length) {
            int i61 = i32 + 1;
            int charAt19 = str2.charAt(i32);
            if (charAt19 >= c2) {
                int i62 = charAt19 & 8191;
                int i63 = i61;
                int i64 = 13;
                while (true) {
                    i29 = i63 + 1;
                    charAt12 = str2.charAt(i63);
                    if (charAt12 < c2) {
                        break;
                    }
                    i62 |= (charAt12 & 8191) << i64;
                    i64 += 13;
                    i63 = i29;
                }
                charAt19 = i62 | (charAt12 << i64);
                i14 = i29;
            } else {
                i14 = i61;
            }
            int i65 = i14 + 1;
            int charAt20 = str2.charAt(i14);
            if (charAt20 >= c2) {
                int i66 = charAt20 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i28 = i67 + 1;
                    charAt11 = str2.charAt(i67);
                    if (charAt11 < c2) {
                        break;
                    }
                    i66 |= (charAt11 & 8191) << i68;
                    i68 += 13;
                    i67 = i28;
                }
                charAt20 = i66 | (charAt11 << i68);
                i15 = i28;
            } else {
                i15 = i65;
            }
            if ((charAt20 & 1024) != 0) {
                iArr[i59] = i60;
                i59++;
            }
            int i69 = charAt20 & jn7.d4;
            int i70 = length;
            int i71 = charAt20 & 2048;
            Unsafe unsafe = i;
            Object[] objArr3 = objArr2;
            if (i69 >= 51) {
                int i72 = i15 + 1;
                int charAt21 = str2.charAt(i15);
                char c3 = 55296;
                if (charAt21 >= 55296) {
                    int i73 = charAt21 & 8191;
                    int i74 = i72;
                    int i75 = 13;
                    while (true) {
                        i27 = i74 + 1;
                        charAt10 = str2.charAt(i74);
                        if (charAt10 < c3) {
                            break;
                        }
                        i73 |= (charAt10 & 8191) << i75;
                        i75 += 13;
                        i74 = i27;
                        c3 = 55296;
                    }
                    charAt21 = i73 | (charAt10 << i75);
                    i24 = i27;
                } else {
                    i24 = i72;
                }
                int i76 = i24;
                int i77 = i69 - 51;
                i16 = charAt19;
                if (i77 == 9 || i77 == 17) {
                    i25 = 1;
                    i26 = i3 + 1;
                    objArr3[((i60 / 3) << 1) + 1] = objArr[i3];
                } else {
                    if (i77 == 12) {
                        i25 = 1;
                        if (ilfVar.a() == 1 || i71 != 0) {
                            i26 = i3 + 1;
                            objArr3[((i60 / 3) << 1) + 1] = objArr[i3];
                        } else {
                            i71 = 0;
                        }
                    } else {
                        i25 = 1;
                    }
                    int i78 = charAt21 << i25;
                    obj = objArr[i78];
                    if (obj instanceof Field) {
                        p2 = p(cls, (String) obj);
                        objArr[i78] = p2;
                    } else {
                        p2 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(p2);
                    int i79 = i78 + 1;
                    obj2 = objArr[i79];
                    if (obj2 instanceof Field) {
                        p3 = p(cls, (String) obj2);
                        objArr[i79] = p3;
                    } else {
                        p3 = (Field) obj2;
                    }
                    i19 = (int) unsafe.objectFieldOffset(p3);
                    str = str2;
                    i32 = i76;
                    objectFieldOffset = objectFieldOffset2;
                    i20 = 0;
                    c = 55296;
                    i17 = i4;
                }
                i3 = i26;
                int i782 = charAt21 << i25;
                obj = objArr[i782];
                if (obj instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(p2);
                int i792 = i782 + 1;
                obj2 = objArr[i792];
                if (obj2 instanceof Field) {
                }
                i19 = (int) unsafe.objectFieldOffset(p3);
                str = str2;
                i32 = i76;
                objectFieldOffset = objectFieldOffset22;
                i20 = 0;
                c = 55296;
                i17 = i4;
            } else {
                i16 = charAt19;
                int i80 = i3 + 1;
                Field p4 = p(cls, (String) objArr[i3]);
                if (i69 == 9 || i69 == 17) {
                    i17 = i4;
                    objArr3[((i60 / 3) << 1) + 1] = p4.getType();
                } else {
                    if (i69 == 27) {
                        i17 = i4;
                        i22 = 1;
                        i23 = i3 + 2;
                    } else if (i69 == 49) {
                        i23 = i3 + 2;
                        i17 = i4;
                        i22 = 1;
                    } else if (i69 == 12 || i69 == 30 || i69 == 44) {
                        i17 = i4;
                        if (ilfVar.a() == 1 || i71 != 0) {
                            i23 = i3 + 2;
                            objArr3[((i60 / 3) << 1) + 1] = objArr[i80];
                            i18 = i23;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(p4);
                            if ((charAt20 & TLObject.FLAG_12) != 0 || i69 > 17) {
                                str = str2;
                                c = 55296;
                                i32 = i15;
                                i19 = 1048575;
                                i20 = 0;
                            } else {
                                i32 = i15 + 1;
                                int charAt22 = str2.charAt(i15);
                                if (charAt22 >= 55296) {
                                    int i81 = charAt22 & 8191;
                                    int i82 = 13;
                                    while (true) {
                                        i21 = i32 + 1;
                                        charAt9 = str2.charAt(i32);
                                        if (charAt9 < 55296) {
                                            break;
                                        }
                                        i81 |= (charAt9 & 8191) << i82;
                                        i82 += 13;
                                        i32 = i21;
                                    }
                                    charAt22 = i81 | (charAt9 << i82);
                                    i32 = i21;
                                }
                                int i83 = (charAt22 / 32) + (i17 << 1);
                                Object obj3 = objArr[i83];
                                str = str2;
                                if (obj3 instanceof Field) {
                                    p = (Field) obj3;
                                } else {
                                    p = p(cls, (String) obj3);
                                    objArr[i83] = p;
                                }
                                i20 = charAt22 % 32;
                                i19 = (int) unsafe.objectFieldOffset(p);
                                c = 55296;
                            }
                            if (i69 >= 18 && i69 <= 49) {
                                iArr[i56] = objectFieldOffset;
                                i56++;
                            }
                            i3 = i18;
                        } else {
                            i18 = i80;
                            i71 = 0;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(p4);
                            if ((charAt20 & TLObject.FLAG_12) != 0) {
                            }
                            str = str2;
                            c = 55296;
                            i32 = i15;
                            i19 = 1048575;
                            i20 = 0;
                            if (i69 >= 18) {
                                iArr[i56] = objectFieldOffset;
                                i56++;
                            }
                            i3 = i18;
                        }
                    } else if (i69 == 50) {
                        int i84 = i3 + 2;
                        int i85 = i58 + 1;
                        iArr[i58] = i60;
                        int i86 = (i60 / 3) << 1;
                        objArr3[i86] = objArr[i80];
                        if (i71 != 0) {
                            i23 = i3 + 3;
                            objArr3[i86 + 1] = objArr[i84];
                            i58 = i85;
                            i17 = i4;
                            i18 = i23;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(p4);
                            if ((charAt20 & TLObject.FLAG_12) != 0) {
                            }
                            str = str2;
                            c = 55296;
                            i32 = i15;
                            i19 = 1048575;
                            i20 = 0;
                            if (i69 >= 18) {
                            }
                            i3 = i18;
                        } else {
                            i58 = i85;
                            i71 = 0;
                            i17 = i4;
                            i18 = i84;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(p4);
                            if ((charAt20 & TLObject.FLAG_12) != 0) {
                            }
                            str = str2;
                            c = 55296;
                            i32 = i15;
                            i19 = 1048575;
                            i20 = 0;
                            if (i69 >= 18) {
                            }
                            i3 = i18;
                        }
                    } else {
                        i17 = i4;
                    }
                    objArr3[((i60 / 3) << i22) + i22] = objArr[i80];
                    i18 = i23;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(p4);
                    if ((charAt20 & TLObject.FLAG_12) != 0) {
                    }
                    str = str2;
                    c = 55296;
                    i32 = i15;
                    i19 = 1048575;
                    i20 = 0;
                    if (i69 >= 18) {
                    }
                    i3 = i18;
                }
                i18 = i80;
                objectFieldOffset = (int) unsafe.objectFieldOffset(p4);
                if ((charAt20 & TLObject.FLAG_12) != 0) {
                }
                str = str2;
                c = 55296;
                i32 = i15;
                i19 = 1048575;
                i20 = 0;
                if (i69 >= 18) {
                }
                i3 = i18;
            }
            int i87 = i60 + 1;
            iArr2[i60] = i16;
            int i88 = i60 + 2;
            iArr2[i87] = ((charAt20 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((charAt20 & 256) != 0 ? TLObject.FLAG_28 : 0) | (i71 != 0 ? TLObject.FLAG_31 : 0) | (i69 << 20) | objectFieldOffset;
            i60 += 3;
            iArr2[i88] = (i20 << 20) | i19;
            c2 = c;
            length = i70;
            i4 = i17;
            str2 = str;
            objArr2 = objArr3;
        }
        return new blf(iArr2, objArr2, ilfVar.a, iArr, i5, okfVar, tlfVar, ejfVar);
    }

    public static int k(long j, Object obj) {
        return ((Integer) wlf.g(obj, j)).intValue();
    }

    public static int l(int i2) {
        return (i2 >>> 20) & jn7.d4;
    }

    public static long n(long j, Object obj) {
        return ((Long) wlf.g(obj, j)).longValue();
    }

    public static Field p(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
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
            throw new RuntimeException(l.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        continue;
     */
    @Override // jlf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        if (!h(obj)) {
            return;
        }
        if (obj instanceof ljf) {
            ljf ljfVar = (ljf) obj;
            ljfVar.f();
            ljfVar.zza = 0;
            ljfVar.d();
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                this.g.getClass();
                slf slfVar = ((ljf) obj).zzc;
                if (slfVar.d) {
                    slfVar.d = false;
                    return;
                }
                return;
            }
            int m = m(i2);
            int i3 = 1048575 & m;
            int l = l(m);
            long j = i3;
            Unsafe unsafe = i;
            if (l != 9) {
                if (l != 60 && l != 68) {
                    switch (l) {
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
                            this.f.a(j, obj);
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j) == null) {
                                break;
                            } else {
                                grb.o();
                                return;
                            }
                    }
                } else if (i(iArr[i2], i2, obj)) {
                    o(i2).a(unsafe.getObject(obj, j));
                }
                i2 += 3;
            }
            if (u(i2, obj)) {
                o(i2).a(unsafe.getObject(obj, j));
            }
            i2 += 3;
        }
    }

    @Override // jlf
    public final boolean b(ljf ljfVar, ljf ljfVar2) {
        boolean e;
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 < iArr.length) {
                int m = m(i2);
                long j = m & 1048575;
                switch (l(m)) {
                    case 0:
                        if (!t(ljfVar, ljfVar2, i2)) {
                            break;
                        } else {
                            cac cacVar = wlf.c;
                            if (Double.doubleToLongBits(cacVar.k(ljfVar, j)) != Double.doubleToLongBits(cacVar.k(ljfVar2, j))) {
                                break;
                            } else {
                                continue;
                                i2 += 3;
                            }
                        }
                    case 1:
                        if (!t(ljfVar, ljfVar2, i2)) {
                            break;
                        } else {
                            cac cacVar2 = wlf.c;
                            if (Float.floatToIntBits(cacVar2.p(ljfVar, j)) != Float.floatToIntBits(cacVar2.p(ljfVar2, j))) {
                                break;
                            } else {
                                continue;
                                i2 += 3;
                            }
                        }
                    case 2:
                        if (t(ljfVar, ljfVar2, i2) && wlf.f(ljfVar, j) == wlf.f(ljfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 3:
                        if (t(ljfVar, ljfVar2, i2) && wlf.f(ljfVar, j) == wlf.f(ljfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 4:
                        if (t(ljfVar, ljfVar2, i2) && wlf.e(ljfVar, j) == wlf.e(ljfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 5:
                        if (t(ljfVar, ljfVar2, i2) && wlf.f(ljfVar, j) == wlf.f(ljfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 6:
                        if (t(ljfVar, ljfVar2, i2) && wlf.e(ljfVar, j) == wlf.e(ljfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 7:
                        if (!t(ljfVar, ljfVar2, i2)) {
                            break;
                        } else {
                            cac cacVar3 = wlf.c;
                            if (cacVar3.x(ljfVar, j) != cacVar3.x(ljfVar2, j)) {
                                break;
                            } else {
                                continue;
                                i2 += 3;
                            }
                        }
                    case 8:
                        if (t(ljfVar, ljfVar2, i2) && klf.e(wlf.g(ljfVar, j), wlf.g(ljfVar2, j))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 9:
                        if (t(ljfVar, ljfVar2, i2) && klf.e(wlf.g(ljfVar, j), wlf.g(ljfVar2, j))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 10:
                        if (t(ljfVar, ljfVar2, i2) && klf.e(wlf.g(ljfVar, j), wlf.g(ljfVar2, j))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 11:
                        if (t(ljfVar, ljfVar2, i2) && wlf.e(ljfVar, j) == wlf.e(ljfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 12:
                        if (t(ljfVar, ljfVar2, i2) && wlf.e(ljfVar, j) == wlf.e(ljfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 13:
                        if (t(ljfVar, ljfVar2, i2) && wlf.e(ljfVar, j) == wlf.e(ljfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 14:
                        if (t(ljfVar, ljfVar2, i2) && wlf.f(ljfVar, j) == wlf.f(ljfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 15:
                        if (t(ljfVar, ljfVar2, i2) && wlf.e(ljfVar, j) == wlf.e(ljfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 16:
                        if (t(ljfVar, ljfVar2, i2) && wlf.f(ljfVar, j) == wlf.f(ljfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 17:
                        if (t(ljfVar, ljfVar2, i2) && klf.e(wlf.g(ljfVar, j), wlf.g(ljfVar2, j))) {
                            continue;
                            i2 += 3;
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
                        e = klf.e(wlf.g(ljfVar, j), wlf.g(ljfVar2, j));
                        break;
                    case 50:
                        e = klf.e(wlf.g(ljfVar, j), wlf.g(ljfVar2, j));
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
                        long j2 = iArr[i2 + 2] & 1048575;
                        if (wlf.e(ljfVar, j2) == wlf.e(ljfVar2, j2) && klf.e(wlf.g(ljfVar, j), wlf.g(ljfVar2, j))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    default:
                        i2 += 3;
                }
                if (e) {
                    i2 += 3;
                }
            } else {
                this.g.getClass();
                if (ljfVar.zzc.equals(ljfVar2.zzc)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // jlf
    public final void c(Object obj, Object obj2) {
        Object obj3;
        if (!h(obj)) {
            lq5.j("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                klf.o(this.g, obj, obj2);
                return;
            }
            int m = m(i2);
            int i3 = m & 1048575;
            int l = l(m);
            int i4 = iArr[i2];
            long j = i3;
            switch (l) {
                case 0:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        cac cacVar = wlf.c;
                        cacVar.v(obj3, j, cacVar.k(obj2, j));
                        s(i2, obj3);
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 1:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        cac cacVar2 = wlf.c;
                        cacVar2.w(obj3, j, cacVar2.p(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 2:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        wlf.c.a.putLong(obj3, j, wlf.f(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 3:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        wlf.c.a.putLong(obj3, j, wlf.f(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 4:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        wlf.h(obj3, j, wlf.e(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 5:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        wlf.c.a.putLong(obj3, j, wlf.f(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 6:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        wlf.h(obj3, j, wlf.e(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 7:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        cac cacVar3 = wlf.c;
                        cacVar3.s(obj3, j, cacVar3.x(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 8:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        wlf.i(obj3, j, wlf.g(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 9:
                    obj3 = obj;
                    q(i2, obj3, obj2);
                    continue;
                    i2 += 3;
                    obj = obj3;
                case 10:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        wlf.i(obj3, j, wlf.g(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 11:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        wlf.h(obj3, j, wlf.e(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 12:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        wlf.h(obj3, j, wlf.e(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 13:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        wlf.h(obj3, j, wlf.e(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 14:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        wlf.c.a.putLong(obj3, j, wlf.f(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 15:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        wlf.h(obj3, j, wlf.e(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 16:
                    if (u(i2, obj2)) {
                        obj3 = obj;
                        wlf.c.a.putLong(obj3, j, wlf.f(obj2, j));
                        s(i2, obj3);
                        i2 += 3;
                        obj = obj3;
                    }
                    break;
                case 17:
                    q(i2, obj, obj2);
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
                    this.f.b(j, obj, obj2);
                    break;
                case 50:
                    Class cls = klf.a;
                    Object g = wlf.g(obj, j);
                    Object g2 = wlf.g(obj2, j);
                    if (g != null) {
                        grb.o();
                        return;
                    } else {
                        g2.getClass();
                        grb.o();
                        return;
                    }
                case jn7.n0 /* 51 */:
                case jn7.o0 /* 52 */:
                case jn7.p0 /* 53 */:
                case jn7.q0 /* 54 */:
                case jn7.r0 /* 55 */:
                case 56:
                case jn7.t0 /* 57 */:
                case jn7.u0 /* 58 */:
                case jn7.v0 /* 59 */:
                    if (i(i4, i2, obj2)) {
                        wlf.i(obj, j, wlf.g(obj2, j));
                        wlf.h(obj, iArr[i2 + 2] & 1048575, i4);
                        break;
                    }
                    break;
                case jn7.w0 /* 60 */:
                    r(i2, obj, obj2);
                    break;
                case jn7.x0 /* 61 */:
                case jn7.y0 /* 62 */:
                case jn7.z0 /* 63 */:
                case 64:
                case 65:
                case jn7.C0 /* 66 */:
                case jn7.D0 /* 67 */:
                    if (i(i4, i2, obj2)) {
                        wlf.i(obj, j, wlf.g(obj2, j));
                        wlf.h(obj, iArr[i2 + 2] & 1048575, i4);
                        break;
                    }
                    break;
                case jn7.E0 /* 68 */:
                    r(i2, obj, obj2);
                    break;
            }
            obj3 = obj;
            i2 += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:258:0x05a3, code lost:
    
        if (r0.v(r1, r2, r3, r4, r5) != false) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0655, code lost:
    
        r8 = dze.f(r12 << 3, 8, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x05ab, code lost:
    
        if (r0.v(r1, r2, r3, r4, r5) != false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0698, code lost:
    
        r8 = dze.f(r12 << 3, 4, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x064c, code lost:
    
        if (r0.v(r1, r2, r3, r4, r5) != false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0653, code lost:
    
        if (r0.v(r1, r2, r3, r4, r5) != false) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0696, code lost:
    
        if (r0.v(r1, r2, r3, r4, r5) != false) goto L260;
     */
    @Override // jlf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(ljf ljfVar) {
        int i2;
        int i3;
        int i4;
        int p;
        int j;
        int o;
        int i5;
        int a;
        int o2;
        int a2;
        int o3;
        int h2;
        int o4;
        int size;
        int n;
        int o5;
        int o6;
        int size2;
        int o7;
        int o8;
        int i6;
        int p2;
        blf blfVar = this;
        ljf ljfVar2 = ljfVar;
        int i7 = 1048575;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = blfVar.a;
            if (i9 >= iArr.length) {
                blfVar.g.getClass();
                slf slfVar = ljfVar2.zzc;
                int i12 = slfVar.c;
                if (i12 == -1) {
                    slfVar.c = 0;
                    i2 = 0;
                } else {
                    i2 = i12;
                }
                return i2 + i11;
            }
            int m = blfVar.m(i9);
            int l = l(m);
            int i13 = iArr[i9];
            int i14 = iArr[i9 + 2];
            int i15 = i14 & i7;
            Unsafe unsafe = i;
            if (l <= 17) {
                if (i15 != i8) {
                    i10 = i15 == i7 ? 0 : unsafe.getInt(ljfVar2, i15);
                    i8 = i15;
                }
                i3 = 1 << (i14 >>> 20);
            } else {
                i3 = 0;
            }
            int i16 = m & i7;
            if (l >= hjf.b.a) {
                byte b = hjf.c.a;
            }
            long j2 = i16;
            switch (l) {
                case 0:
                    if (!blfVar.v(ljfVar2, i9, i8, i10, i3)) {
                        i9 += 3;
                        i7 = 1048575;
                    }
                    i11 = dze.f(i13 << 3, 8, i11);
                    i9 += 3;
                    i7 = 1048575;
                case 1:
                    break;
                case 2:
                    if (blfVar.v(ljfVar2, i9, i8, i10, i3)) {
                        i4 = i13 << 3;
                        p = xif.p(unsafe.getLong(ljfVar2, j2));
                        i11 = dze.f(i4, p, i11);
                    }
                    blfVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 3:
                    if (blfVar.v(ljfVar2, i9, i8, i10, i3)) {
                        i4 = i13 << 3;
                        p = xif.p(unsafe.getLong(ljfVar2, j2));
                        i11 = dze.f(i4, p, i11);
                    }
                    blfVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 4:
                    if (blfVar.v(ljfVar2, i9, i8, i10, i3)) {
                        i4 = i13 << 3;
                        p = xif.m(unsafe.getInt(ljfVar2, j2));
                        i11 = dze.f(i4, p, i11);
                    }
                    blfVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    if (blfVar.v(ljfVar2, i9, i8, i10, i3)) {
                        i11 = dze.f(i13 << 3, 1, i11);
                    }
                    blfVar = this;
                    ljfVar2 = ljfVar;
                    i9 += 3;
                    i7 = 1048575;
                case 8:
                    if (blfVar.v(ljfVar2, i9, i8, i10, i3)) {
                        i4 = i13 << 3;
                        Object object = unsafe.getObject(ljfVar2, j2);
                        if (object instanceof nif) {
                            Logger logger = xif.e;
                            j = ((nif) object).j();
                            o = xif.o(j);
                            i11 = dze.f(i4, o + j, i11);
                        } else {
                            p = xif.n((String) object);
                            i11 = dze.f(i4, p, i11);
                        }
                    }
                    blfVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 9:
                    if (blfVar.v(ljfVar2, i9, i8, i10, i3)) {
                        Object object2 = unsafe.getObject(ljfVar2, j2);
                        jlf o9 = blfVar.o(i9);
                        Class cls = klf.a;
                        i5 = i13 << 3;
                        Logger logger2 = xif.e;
                        a = ((zhf) object2).a(o9);
                        o2 = xif.o(a);
                        i11 = dze.f(i5, o2 + a, i11);
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 10:
                    if (blfVar.v(ljfVar2, i9, i8, i10, i3)) {
                        i4 = i13 << 3;
                        nif nifVar = (nif) unsafe.getObject(ljfVar2, j2);
                        Logger logger3 = xif.e;
                        j = nifVar.j();
                        o = xif.o(j);
                        i11 = dze.f(i4, o + j, i11);
                    }
                    blfVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 11:
                    if (blfVar.v(ljfVar2, i9, i8, i10, i3)) {
                        i4 = i13 << 3;
                        p = xif.o(unsafe.getInt(ljfVar2, j2));
                        i11 = dze.f(i4, p, i11);
                    }
                    blfVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 12:
                    if (blfVar.v(ljfVar2, i9, i8, i10, i3)) {
                        i4 = i13 << 3;
                        p = xif.m(unsafe.getInt(ljfVar2, j2));
                        i11 = dze.f(i4, p, i11);
                    }
                    blfVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    if (blfVar.v(ljfVar2, i9, i8, i10, i3)) {
                        int i17 = unsafe.getInt(ljfVar2, j2);
                        i11 = dze.f((i17 << 1) ^ (i17 >> 31), xif.o(i13 << 3), i11);
                    }
                    blfVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 16:
                    if (blfVar.v(ljfVar2, i9, i8, i10, i3)) {
                        long j3 = unsafe.getLong(ljfVar2, j2);
                        i11 += xif.p((j3 << 1) ^ (j3 >> 63)) + xif.o(i13 << 3);
                    }
                    blfVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 17:
                    if (blfVar.v(ljfVar2, i9, i8, i10, i3)) {
                        zhf zhfVar = (zhf) unsafe.getObject(ljfVar2, j2);
                        jlf o10 = blfVar.o(i9);
                        Logger logger4 = xif.e;
                        a2 = zhfVar.a(o10);
                        o3 = xif.o(i13 << 3);
                        i11 += (o3 << 1) + a2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 18:
                    h2 = klf.h(i13, (List) unsafe.getObject(ljfVar2, j2));
                    i11 += h2;
                    i9 += 3;
                    i7 = 1048575;
                case 19:
                    h2 = klf.g(i13, (List) unsafe.getObject(ljfVar2, j2));
                    i11 += h2;
                    i9 += 3;
                    i7 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(ljfVar2, j2);
                    Class cls2 = klf.a;
                    if (list.size() != 0) {
                        o4 = (xif.o(i13 << 3) * list.size()) + klf.j(list);
                        i11 += o4;
                        i9 += 3;
                        i7 = 1048575;
                    }
                    o4 = 0;
                    i11 += o4;
                    i9 += 3;
                    i7 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(ljfVar2, j2);
                    Class cls3 = klf.a;
                    size = list2.size();
                    if (size != 0) {
                        n = klf.n(list2);
                        o5 = xif.o(i13 << 3);
                        o4 = (o5 * size) + n;
                        i11 += o4;
                        i9 += 3;
                        i7 = 1048575;
                    }
                    o4 = 0;
                    i11 += o4;
                    i9 += 3;
                    i7 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(ljfVar2, j2);
                    Class cls4 = klf.a;
                    size = list3.size();
                    if (size != 0) {
                        n = klf.i(list3);
                        o5 = xif.o(i13 << 3);
                        o4 = (o5 * size) + n;
                        i11 += o4;
                        i9 += 3;
                        i7 = 1048575;
                    }
                    o4 = 0;
                    i11 += o4;
                    i9 += 3;
                    i7 = 1048575;
                case 23:
                    h2 = klf.h(i13, (List) unsafe.getObject(ljfVar2, j2));
                    i11 += h2;
                    i9 += 3;
                    i7 = 1048575;
                case 24:
                    h2 = klf.g(i13, (List) unsafe.getObject(ljfVar2, j2));
                    i11 += h2;
                    i9 += 3;
                    i7 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(ljfVar2, j2);
                    Class cls5 = klf.a;
                    int size3 = list4.size();
                    i11 += size3 == 0 ? 0 : (xif.o(i13 << 3) + 1) * size3;
                    i9 += 3;
                    i7 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(ljfVar2, j2);
                    Class cls6 = klf.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        boolean z = list5 instanceof ikf;
                        o6 = xif.o(i13 << 3) * size4;
                        if (z) {
                            ikf ikfVar = (ikf) list5;
                            for (int i18 = 0; i18 < size4; i18++) {
                                Object b2 = ikfVar.b(i18);
                                if (b2 instanceof nif) {
                                    int j4 = ((nif) b2).j();
                                    o6 = dze.f(j4, j4, o6);
                                } else {
                                    o6 = xif.n((String) b2) + o6;
                                }
                            }
                        } else {
                            for (int i19 = 0; i19 < size4; i19++) {
                                Object obj = list5.get(i19);
                                if (obj instanceof nif) {
                                    int j5 = ((nif) obj).j();
                                    o6 = dze.f(j5, j5, o6);
                                } else {
                                    o6 = xif.n((String) obj) + o6;
                                }
                            }
                        }
                        i11 += o6;
                        i9 += 3;
                        i7 = 1048575;
                    }
                    o6 = 0;
                    i11 += o6;
                    i9 += 3;
                    i7 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(ljfVar2, j2);
                    jlf o11 = blfVar.o(i9);
                    Class cls7 = klf.a;
                    int size5 = list6.size();
                    if (size5 != 0) {
                        o6 = xif.o(i13 << 3) * size5;
                        for (int i20 = 0; i20 < size5; i20++) {
                            int a3 = ((zhf) list6.get(i20)).a(o11);
                            o6 = dze.f(a3, a3, o6);
                        }
                        i11 += o6;
                        i9 += 3;
                        i7 = 1048575;
                    }
                    o6 = 0;
                    i11 += o6;
                    i9 += 3;
                    i7 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(ljfVar2, j2);
                    Class cls8 = klf.a;
                    int size6 = list7.size();
                    if (size6 != 0) {
                        o4 = xif.o(i13 << 3) * size6;
                        for (int i21 = 0; i21 < list7.size(); i21++) {
                            int j6 = ((nif) list7.get(i21)).j();
                            o4 = dze.f(j6, j6, o4);
                        }
                        i11 += o4;
                        i9 += 3;
                        i7 = 1048575;
                    }
                    o4 = 0;
                    i11 += o4;
                    i9 += 3;
                    i7 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(ljfVar2, j2);
                    Class cls9 = klf.a;
                    size = list8.size();
                    if (size != 0) {
                        n = klf.m(list8);
                        o5 = xif.o(i13 << 3);
                        o4 = (o5 * size) + n;
                        i11 += o4;
                        i9 += 3;
                        i7 = 1048575;
                    }
                    o4 = 0;
                    i11 += o4;
                    i9 += 3;
                    i7 = 1048575;
                case jn7.S /* 30 */:
                    List list9 = (List) unsafe.getObject(ljfVar2, j2);
                    Class cls10 = klf.a;
                    size = list9.size();
                    if (size != 0) {
                        n = klf.f(list9);
                        o5 = xif.o(i13 << 3);
                        o4 = (o5 * size) + n;
                        i11 += o4;
                        i9 += 3;
                        i7 = 1048575;
                    }
                    o4 = 0;
                    i11 += o4;
                    i9 += 3;
                    i7 = 1048575;
                case 31:
                    h2 = klf.g(i13, (List) unsafe.getObject(ljfVar2, j2));
                    i11 += h2;
                    i9 += 3;
                    i7 = 1048575;
                case 32:
                    h2 = klf.h(i13, (List) unsafe.getObject(ljfVar2, j2));
                    i11 += h2;
                    i9 += 3;
                    i7 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(ljfVar2, j2);
                    Class cls11 = klf.a;
                    size = list10.size();
                    if (size != 0) {
                        n = klf.k(list10);
                        o5 = xif.o(i13 << 3);
                        o4 = (o5 * size) + n;
                        i11 += o4;
                        i9 += 3;
                        i7 = 1048575;
                    }
                    o4 = 0;
                    i11 += o4;
                    i9 += 3;
                    i7 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(ljfVar2, j2);
                    Class cls12 = klf.a;
                    size = list11.size();
                    if (size != 0) {
                        n = klf.l(list11);
                        o5 = xif.o(i13 << 3);
                        o4 = (o5 * size) + n;
                        i11 += o4;
                        i9 += 3;
                        i7 = 1048575;
                    }
                    o4 = 0;
                    i11 += o4;
                    i9 += 3;
                    i7 = 1048575;
                case 35:
                    List list12 = (List) unsafe.getObject(ljfVar2, j2);
                    Class cls13 = klf.a;
                    size2 = list12.size() << 3;
                    if (size2 > 0) {
                        o7 = xif.o(size2);
                        o8 = xif.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(ljfVar2, j2);
                    Class cls14 = klf.a;
                    size2 = list13.size() << 2;
                    if (size2 > 0) {
                        o7 = xif.o(size2);
                        o8 = xif.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 37:
                    size2 = klf.j((List) unsafe.getObject(ljfVar2, j2));
                    if (size2 > 0) {
                        o7 = xif.o(size2);
                        o8 = xif.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 38:
                    size2 = klf.n((List) unsafe.getObject(ljfVar2, j2));
                    if (size2 > 0) {
                        o7 = xif.o(size2);
                        o8 = xif.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 39:
                    size2 = klf.i((List) unsafe.getObject(ljfVar2, j2));
                    if (size2 > 0) {
                        o7 = xif.o(size2);
                        o8 = xif.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(ljfVar2, j2);
                    Class cls15 = klf.a;
                    size2 = list14.size() << 3;
                    if (size2 > 0) {
                        o7 = xif.o(size2);
                        o8 = xif.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(ljfVar2, j2);
                    Class cls16 = klf.a;
                    size2 = list15.size() << 2;
                    if (size2 > 0) {
                        o7 = xif.o(size2);
                        o8 = xif.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(ljfVar2, j2);
                    Class cls17 = klf.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        o7 = xif.o(size2);
                        o8 = xif.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 43:
                    size2 = klf.m((List) unsafe.getObject(ljfVar2, j2));
                    if (size2 > 0) {
                        o7 = xif.o(size2);
                        o8 = xif.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 44:
                    size2 = klf.f((List) unsafe.getObject(ljfVar2, j2));
                    if (size2 > 0) {
                        o7 = xif.o(size2);
                        o8 = xif.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(ljfVar2, j2);
                    Class cls18 = klf.a;
                    size2 = list17.size() << 2;
                    if (size2 > 0) {
                        o7 = xif.o(size2);
                        o8 = xif.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(ljfVar2, j2);
                    Class cls19 = klf.a;
                    size2 = list18.size() << 3;
                    if (size2 > 0) {
                        o7 = xif.o(size2);
                        o8 = xif.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 47:
                    size2 = klf.k((List) unsafe.getObject(ljfVar2, j2));
                    if (size2 > 0) {
                        o7 = xif.o(size2);
                        o8 = xif.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 48:
                    size2 = klf.l((List) unsafe.getObject(ljfVar2, j2));
                    if (size2 > 0) {
                        o7 = xif.o(size2);
                        o8 = xif.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(ljfVar2, j2);
                    jlf o12 = blfVar.o(i9);
                    Class cls20 = klf.a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        i6 = 0;
                    } else {
                        i6 = 0;
                        for (int i22 = 0; i22 < size7; i22++) {
                            zhf zhfVar2 = (zhf) list19.get(i22);
                            Logger logger5 = xif.e;
                            i6 += (xif.o(i13 << 3) << 1) + zhfVar2.a(o12);
                        }
                    }
                    i11 += i6;
                    i9 += 3;
                    i7 = 1048575;
                case 50:
                    Object object3 = unsafe.getObject(ljfVar2, j2);
                    Object obj2 = blfVar.b[(i9 / 3) << 1];
                    if (object3 == null) {
                        obj2.getClass();
                        grb.o();
                        break;
                    } else {
                        grb.o();
                        break;
                    }
                case jn7.n0 /* 51 */:
                    if (!blfVar.i(i13, i9, ljfVar2)) {
                        i9 += 3;
                        i7 = 1048575;
                    }
                    i11 = dze.f(i13 << 3, 8, i11);
                    i9 += 3;
                    i7 = 1048575;
                case jn7.o0 /* 52 */:
                    if (!blfVar.i(i13, i9, ljfVar2)) {
                        i9 += 3;
                        i7 = 1048575;
                    }
                    i11 = dze.f(i13 << 3, 4, i11);
                    i9 += 3;
                    i7 = 1048575;
                case jn7.p0 /* 53 */:
                    if (blfVar.i(i13, i9, ljfVar2)) {
                        i5 = i13 << 3;
                        p2 = xif.p(n(j2, ljfVar2));
                        i11 = dze.f(i5, p2, i11);
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case jn7.q0 /* 54 */:
                    if (blfVar.i(i13, i9, ljfVar2)) {
                        i5 = i13 << 3;
                        p2 = xif.p(n(j2, ljfVar2));
                        i11 = dze.f(i5, p2, i11);
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case jn7.r0 /* 55 */:
                    if (blfVar.i(i13, i9, ljfVar2)) {
                        i5 = i13 << 3;
                        p2 = xif.m(k(j2, ljfVar2));
                        i11 = dze.f(i5, p2, i11);
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 56:
                    if (!blfVar.i(i13, i9, ljfVar2)) {
                        i9 += 3;
                        i7 = 1048575;
                    }
                    i11 = dze.f(i13 << 3, 8, i11);
                    i9 += 3;
                    i7 = 1048575;
                case jn7.t0 /* 57 */:
                    if (!blfVar.i(i13, i9, ljfVar2)) {
                        i9 += 3;
                        i7 = 1048575;
                    }
                    i11 = dze.f(i13 << 3, 4, i11);
                    i9 += 3;
                    i7 = 1048575;
                case jn7.u0 /* 58 */:
                    if (blfVar.i(i13, i9, ljfVar2)) {
                        i11 = dze.f(i13 << 3, 1, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                case jn7.v0 /* 59 */:
                    if (blfVar.i(i13, i9, ljfVar2)) {
                        i5 = i13 << 3;
                        Object object4 = unsafe.getObject(ljfVar2, j2);
                        if (object4 instanceof nif) {
                            Logger logger6 = xif.e;
                            a = ((nif) object4).j();
                            o2 = xif.o(a);
                            i11 = dze.f(i5, o2 + a, i11);
                            i9 += 3;
                            i7 = 1048575;
                        } else {
                            p2 = xif.n((String) object4);
                            i11 = dze.f(i5, p2, i11);
                            i9 += 3;
                            i7 = 1048575;
                        }
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case jn7.w0 /* 60 */:
                    if (blfVar.i(i13, i9, ljfVar2)) {
                        Object object5 = unsafe.getObject(ljfVar2, j2);
                        jlf o13 = blfVar.o(i9);
                        Class cls21 = klf.a;
                        i5 = i13 << 3;
                        Logger logger7 = xif.e;
                        a = ((zhf) object5).a(o13);
                        o2 = xif.o(a);
                        i11 = dze.f(i5, o2 + a, i11);
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case jn7.x0 /* 61 */:
                    if (blfVar.i(i13, i9, ljfVar2)) {
                        i5 = i13 << 3;
                        nif nifVar2 = (nif) unsafe.getObject(ljfVar2, j2);
                        Logger logger8 = xif.e;
                        a = nifVar2.j();
                        o2 = xif.o(a);
                        i11 = dze.f(i5, o2 + a, i11);
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case jn7.y0 /* 62 */:
                    if (blfVar.i(i13, i9, ljfVar2)) {
                        i5 = i13 << 3;
                        p2 = xif.o(k(j2, ljfVar2));
                        i11 = dze.f(i5, p2, i11);
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case jn7.z0 /* 63 */:
                    if (blfVar.i(i13, i9, ljfVar2)) {
                        i5 = i13 << 3;
                        p2 = xif.m(k(j2, ljfVar2));
                        i11 = dze.f(i5, p2, i11);
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 64:
                    if (!blfVar.i(i13, i9, ljfVar2)) {
                        i9 += 3;
                        i7 = 1048575;
                    }
                    i11 = dze.f(i13 << 3, 4, i11);
                    i9 += 3;
                    i7 = 1048575;
                case 65:
                    if (!blfVar.i(i13, i9, ljfVar2)) {
                        i9 += 3;
                        i7 = 1048575;
                    }
                    i11 = dze.f(i13 << 3, 8, i11);
                    i9 += 3;
                    i7 = 1048575;
                case jn7.C0 /* 66 */:
                    if (blfVar.i(i13, i9, ljfVar2)) {
                        int k = k(j2, ljfVar2);
                        i11 = dze.f((k << 1) ^ (k >> 31), xif.o(i13 << 3), i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                case jn7.D0 /* 67 */:
                    if (blfVar.i(i13, i9, ljfVar2)) {
                        long n2 = n(j2, ljfVar2);
                        h2 = xif.p((n2 << 1) ^ (n2 >> 63)) + xif.o(i13 << 3);
                        i11 += h2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case jn7.E0 /* 68 */:
                    if (blfVar.i(i13, i9, ljfVar2)) {
                        zhf zhfVar3 = (zhf) unsafe.getObject(ljfVar2, j2);
                        jlf o14 = blfVar.o(i9);
                        Logger logger9 = xif.e;
                        a2 = zhfVar3.a(o14);
                        o3 = xif.o(i13 << 3);
                        i11 += (o3 << 1) + a2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                default:
                    i9 += 3;
                    i7 = 1048575;
            }
            return 0;
        }
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
    @Override // jlf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(ljf ljfVar) {
        int i2;
        long doubleToLongBits;
        int i3;
        int floatToIntBits;
        int i4;
        int i5;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i6 >= iArr.length) {
                this.g.getClass();
                ljfVar.zzc.getClass();
                return (i7 * 53) + 506991;
            }
            int m = m(i6);
            int i8 = 1048575 & m;
            int l = l(m);
            int i9 = iArr[i6];
            long j = i8;
            int i10 = 1237;
            int i11 = 37;
            switch (l) {
                case 0:
                    i2 = i7 * 53;
                    doubleToLongBits = Double.doubleToLongBits(wlf.c.k(ljfVar, j));
                    Charset charset = ujf.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i3 = i7 * 53;
                    floatToIntBits = Float.floatToIntBits(wlf.c.p(ljfVar, j));
                    i7 = floatToIntBits + i3;
                    break;
                case 2:
                    i2 = i7 * 53;
                    doubleToLongBits = wlf.f(ljfVar, j);
                    Charset charset2 = ujf.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i2 = i7 * 53;
                    doubleToLongBits = wlf.f(ljfVar, j);
                    Charset charset3 = ujf.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i3 = i7 * 53;
                    floatToIntBits = wlf.e(ljfVar, j);
                    i7 = floatToIntBits + i3;
                    break;
                case 5:
                    i2 = i7 * 53;
                    doubleToLongBits = wlf.f(ljfVar, j);
                    Charset charset4 = ujf.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i3 = i7 * 53;
                    floatToIntBits = wlf.e(ljfVar, j);
                    i7 = floatToIntBits + i3;
                    break;
                case 7:
                    i4 = i7 * 53;
                    boolean x = wlf.c.x(ljfVar, j);
                    Charset charset5 = ujf.a;
                    break;
                case 8:
                    i3 = i7 * 53;
                    floatToIntBits = ((String) wlf.g(ljfVar, j)).hashCode();
                    i7 = floatToIntBits + i3;
                    break;
                case 9:
                    i5 = i7 * 53;
                    Object g = wlf.g(ljfVar, j);
                    if (g != null) {
                        i11 = g.hashCode();
                    }
                    i7 = i5 + i11;
                    break;
                case 10:
                    i3 = i7 * 53;
                    floatToIntBits = wlf.g(ljfVar, j).hashCode();
                    i7 = floatToIntBits + i3;
                    break;
                case 11:
                    i3 = i7 * 53;
                    floatToIntBits = wlf.e(ljfVar, j);
                    i7 = floatToIntBits + i3;
                    break;
                case 12:
                    i3 = i7 * 53;
                    floatToIntBits = wlf.e(ljfVar, j);
                    i7 = floatToIntBits + i3;
                    break;
                case 13:
                    i3 = i7 * 53;
                    floatToIntBits = wlf.e(ljfVar, j);
                    i7 = floatToIntBits + i3;
                    break;
                case 14:
                    i2 = i7 * 53;
                    doubleToLongBits = wlf.f(ljfVar, j);
                    Charset charset6 = ujf.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i3 = i7 * 53;
                    floatToIntBits = wlf.e(ljfVar, j);
                    i7 = floatToIntBits + i3;
                    break;
                case 16:
                    i2 = i7 * 53;
                    doubleToLongBits = wlf.f(ljfVar, j);
                    Charset charset7 = ujf.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i5 = i7 * 53;
                    Object g2 = wlf.g(ljfVar, j);
                    if (g2 != null) {
                        i11 = g2.hashCode();
                    }
                    i7 = i5 + i11;
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
                    i3 = i7 * 53;
                    floatToIntBits = wlf.g(ljfVar, j).hashCode();
                    i7 = floatToIntBits + i3;
                    break;
                case 50:
                    i3 = i7 * 53;
                    floatToIntBits = wlf.g(ljfVar, j).hashCode();
                    i7 = floatToIntBits + i3;
                    break;
                case jn7.n0 /* 51 */:
                    if (!i(i9, i6, ljfVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) wlf.g(ljfVar, j)).doubleValue());
                        Charset charset8 = ujf.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case jn7.o0 /* 52 */:
                    if (!i(i9, i6, ljfVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) wlf.g(ljfVar, j)).floatValue());
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case jn7.p0 /* 53 */:
                    if (!i(i9, i6, ljfVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = n(j, ljfVar);
                        Charset charset9 = ujf.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case jn7.q0 /* 54 */:
                    if (!i(i9, i6, ljfVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = n(j, ljfVar);
                        Charset charset10 = ujf.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case jn7.r0 /* 55 */:
                    if (!i(i9, i6, ljfVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = k(j, ljfVar);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 56:
                    if (!i(i9, i6, ljfVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = n(j, ljfVar);
                        Charset charset11 = ujf.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case jn7.t0 /* 57 */:
                    if (!i(i9, i6, ljfVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = k(j, ljfVar);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case jn7.u0 /* 58 */:
                    if (!i(i9, i6, ljfVar)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        boolean booleanValue = ((Boolean) wlf.g(ljfVar, j)).booleanValue();
                        Charset charset12 = ujf.a;
                        break;
                    }
                case jn7.v0 /* 59 */:
                    if (!i(i9, i6, ljfVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = ((String) wlf.g(ljfVar, j)).hashCode();
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case jn7.w0 /* 60 */:
                    if (!i(i9, i6, ljfVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = wlf.g(ljfVar, j).hashCode();
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case jn7.x0 /* 61 */:
                    if (!i(i9, i6, ljfVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = wlf.g(ljfVar, j).hashCode();
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case jn7.y0 /* 62 */:
                    if (!i(i9, i6, ljfVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = k(j, ljfVar);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case jn7.z0 /* 63 */:
                    if (!i(i9, i6, ljfVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = k(j, ljfVar);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 64:
                    if (!i(i9, i6, ljfVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = k(j, ljfVar);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 65:
                    if (!i(i9, i6, ljfVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = n(j, ljfVar);
                        Charset charset13 = ujf.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case jn7.C0 /* 66 */:
                    if (!i(i9, i6, ljfVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = k(j, ljfVar);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case jn7.D0 /* 67 */:
                    if (!i(i9, i6, ljfVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = n(j, ljfVar);
                        Charset charset14 = ujf.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case jn7.E0 /* 68 */:
                    if (!i(i9, i6, ljfVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = wlf.g(ljfVar, j).hashCode();
                        i7 = floatToIntBits + i3;
                        break;
                    }
            }
            i6 += 3;
        }
    }

    @Override // jlf
    public final boolean f(Object obj) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (i6 < this.e) {
            int i8 = this.d[i6];
            int[] iArr = this.a;
            int i9 = iArr[i8];
            int m = m(i8);
            int i10 = iArr[i8 + 2];
            int i11 = i10 & 1048575;
            int i12 = 1 << (i10 >>> 20);
            if (i11 != i7) {
                if (i11 != 1048575) {
                    i5 = i.getInt(obj, i11);
                }
                i3 = i8;
                i4 = i5;
                i2 = i11;
            } else {
                int i13 = i5;
                i2 = i7;
                i3 = i8;
                i4 = i13;
            }
            if ((268435456 & m) == 0 || v(obj, i3, i2, i4, i12)) {
                int l = l(m);
                if (l == 9 || l == 17) {
                    if (v(obj, i3, i2, i4, i12) && !o(i3).f(wlf.g(obj, m & 1048575))) {
                    }
                    i6++;
                    i7 = i2;
                    i5 = i4;
                } else {
                    if (l != 27) {
                        if (l == 60 || l == 68) {
                            if (i(i9, i3, obj) && !o(i3).f(wlf.g(obj, m & 1048575))) {
                            }
                        } else if (l != 49) {
                            if (l == 50) {
                                wlf.g(obj, m & 1048575).getClass();
                                grb.o();
                                return false;
                            }
                        }
                        i6++;
                        i7 = i2;
                        i5 = i4;
                    }
                    List list = (List) wlf.g(obj, m & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        jlf o = o(i3);
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            if (o.f(list.get(i14))) {
                            }
                        }
                    }
                    i6++;
                    i7 = i2;
                    i5 = i4;
                }
            }
            return false;
        }
        return true;
    }

    @Override // jlf
    public final void g(Object obj, oqd oqdVar) {
        int i2;
        blf blfVar = this;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (true) {
            int[] iArr = blfVar.a;
            if (i4 >= iArr.length) {
                blfVar.g.getClass();
                slf slfVar = ((ljf) obj).zzc;
                return;
            }
            int m = blfVar.m(i4);
            int l = l(m);
            int i7 = iArr[i4];
            Unsafe unsafe = i;
            if (l <= 17) {
                int i8 = iArr[i4 + 2];
                int i9 = i8 & i3;
                if (i9 != i6) {
                    i5 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
                    i6 = i9;
                }
                i2 = 1 << (i8 >>> 20);
            } else {
                i2 = 0;
            }
            long j = m & i3;
            switch (l) {
                case 0:
                    if (blfVar.v(obj, i4, i6, i5, i2)) {
                        ((xif) oqdVar.a).f(i7, Double.doubleToRawLongBits(wlf.c.k(obj, j)));
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 1:
                    if (blfVar.v(obj, i4, i6, i5, i2)) {
                        ((xif) oqdVar.a).d(i7, Float.floatToRawIntBits(wlf.c.p(obj, j)));
                        break;
                    }
                    break;
                case 2:
                    if (blfVar.v(obj, i4, i6, i5, i2)) {
                        ((xif) oqdVar.a).k(i7, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 3:
                    if (blfVar.v(obj, i4, i6, i5, i2)) {
                        ((xif) oqdVar.a).k(i7, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 4:
                    if (blfVar.v(obj, i4, i6, i5, i2)) {
                        int i10 = unsafe.getInt(obj, j);
                        xif xifVar = (xif) oqdVar.a;
                        xifVar.j(i7 << 3);
                        if (i10 >= 0) {
                            xifVar.j(i10);
                            break;
                        } else {
                            xifVar.l(i10);
                            break;
                        }
                    }
                    break;
                case 5:
                    if (blfVar.v(obj, i4, i6, i5, i2)) {
                        ((xif) oqdVar.a).f(i7, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 6:
                    if (blfVar.v(obj, i4, i6, i5, i2)) {
                        ((xif) oqdVar.a).d(i7, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 7:
                    if (blfVar.v(obj, i4, i6, i5, i2)) {
                        boolean x = wlf.c.x(obj, j);
                        xif xifVar2 = (xif) oqdVar.a;
                        xifVar2.j(i7 << 3);
                        xifVar2.a(x ? (byte) 1 : (byte) 0);
                        break;
                    }
                    break;
                case 8:
                    if (blfVar.v(obj, i4, i6, i5, i2)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((xif) oqdVar.a).h(i7, (String) object);
                            break;
                        } else {
                            ((xif) oqdVar.a).c(i7, (nif) object);
                            break;
                        }
                    }
                    break;
                case 9:
                    if (blfVar.v(obj, i4, i6, i5, i2)) {
                        oqdVar.g(i7, unsafe.getObject(obj, j), blfVar.o(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 10:
                    if (blfVar.v(obj, i4, i6, i5, i2)) {
                        ((xif) oqdVar.a).c(i7, (nif) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 11:
                    if (blfVar.v(obj, i4, i6, i5, i2)) {
                        int i11 = unsafe.getInt(obj, j);
                        xif xifVar3 = (xif) oqdVar.a;
                        xifVar3.j(i7 << 3);
                        xifVar3.j(i11);
                        break;
                    }
                    break;
                case 12:
                    if (blfVar.v(obj, i4, i6, i5, i2)) {
                        int i12 = unsafe.getInt(obj, j);
                        xif xifVar4 = (xif) oqdVar.a;
                        xifVar4.j(i7 << 3);
                        if (i12 >= 0) {
                            xifVar4.j(i12);
                            break;
                        } else {
                            xifVar4.l(i12);
                            break;
                        }
                    }
                    break;
                case 13:
                    if (blfVar.v(obj, i4, i6, i5, i2)) {
                        ((xif) oqdVar.a).d(i7, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 14:
                    if (blfVar.v(obj, i4, i6, i5, i2)) {
                        ((xif) oqdVar.a).f(i7, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 15:
                    if (blfVar.v(obj, i4, i6, i5, i2)) {
                        int i13 = unsafe.getInt(obj, j);
                        int i14 = (i13 << 1) ^ (i13 >> 31);
                        xif xifVar5 = (xif) oqdVar.a;
                        xifVar5.j(i7 << 3);
                        xifVar5.j(i14);
                        break;
                    }
                    break;
                case 16:
                    if (blfVar.v(obj, i4, i6, i5, i2)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((xif) oqdVar.a).k(i7, (j2 << 1) ^ (j2 >> 63));
                        break;
                    }
                    break;
                case 17:
                    if (blfVar.v(obj, i4, i6, i5, i2)) {
                        oqdVar.e(i7, unsafe.getObject(obj, j), blfVar.o(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 18:
                    klf.q(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 19:
                    klf.u(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 20:
                    klf.w(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 21:
                    klf.d(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 22:
                    klf.v(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 23:
                    klf.t(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 24:
                    klf.s(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 25:
                    klf.p(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 26:
                    int i15 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = klf.a;
                    if (list == null) {
                        continue;
                    } else if (!list.isEmpty()) {
                        xif xifVar6 = (xif) oqdVar.a;
                        if (list instanceof ikf) {
                            ikf ikfVar = (ikf) list;
                            for (int i16 = 0; i16 < list.size(); i16++) {
                                Object b = ikfVar.b(i16);
                                if (b instanceof String) {
                                    xifVar6.h(i15, (String) b);
                                } else {
                                    xifVar6.c(i15, (nif) b);
                                }
                            }
                        } else {
                            for (int i17 = 0; i17 < list.size(); i17++) {
                                xifVar6.h(i15, (String) list.get(i17));
                            }
                        }
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 27:
                    int i18 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    jlf o = blfVar.o(i4);
                    Class cls2 = klf.a;
                    if (list2 == null) {
                        continue;
                    } else if (!list2.isEmpty()) {
                        for (int i19 = 0; i19 < list2.size(); i19++) {
                            oqdVar.g(i18, list2.get(i19), o);
                        }
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 28:
                    int i20 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = klf.a;
                    if (list3 == null) {
                        continue;
                    } else if (!list3.isEmpty()) {
                        oqdVar.getClass();
                        for (int i21 = 0; i21 < list3.size(); i21++) {
                            ((xif) oqdVar.a).c(i20, (nif) list3.get(i21));
                        }
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 29:
                    klf.c(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case jn7.S /* 30 */:
                    klf.r(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 31:
                    klf.x(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 32:
                    klf.y(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 33:
                    klf.a(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 34:
                    klf.b(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 35:
                    klf.q(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 36:
                    klf.u(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 37:
                    klf.w(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 38:
                    klf.d(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 39:
                    klf.v(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 40:
                    klf.t(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 41:
                    klf.s(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 42:
                    klf.p(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 43:
                    klf.c(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 44:
                    klf.r(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 45:
                    klf.x(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 46:
                    klf.y(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 47:
                    klf.a(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 48:
                    klf.b(iArr[i4], (List) unsafe.getObject(obj, j), oqdVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 49:
                    int i22 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    jlf o2 = blfVar.o(i4);
                    Class cls4 = klf.a;
                    if (list4 == null) {
                        continue;
                    } else if (!list4.isEmpty()) {
                        for (int i23 = 0; i23 < list4.size(); i23++) {
                            oqdVar.e(i22, list4.get(i23), o2);
                        }
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        blfVar.b[(i4 / 3) << 1].getClass();
                        grb.o();
                        return;
                    } else {
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    }
                case jn7.n0 /* 51 */:
                    if (blfVar.i(i7, i4, obj)) {
                        ((xif) oqdVar.a).f(i7, Double.doubleToRawLongBits(((Double) wlf.g(obj, j)).doubleValue()));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case jn7.o0 /* 52 */:
                    if (blfVar.i(i7, i4, obj)) {
                        ((xif) oqdVar.a).d(i7, Float.floatToRawIntBits(((Float) wlf.g(obj, j)).floatValue()));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case jn7.p0 /* 53 */:
                    if (blfVar.i(i7, i4, obj)) {
                        ((xif) oqdVar.a).k(i7, n(j, obj));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case jn7.q0 /* 54 */:
                    if (blfVar.i(i7, i4, obj)) {
                        ((xif) oqdVar.a).k(i7, n(j, obj));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case jn7.r0 /* 55 */:
                    if (blfVar.i(i7, i4, obj)) {
                        int k = k(j, obj);
                        xif xifVar7 = (xif) oqdVar.a;
                        xifVar7.j(i7 << 3);
                        if (k >= 0) {
                            xifVar7.j(k);
                        } else {
                            xifVar7.l(k);
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 56:
                    if (blfVar.i(i7, i4, obj)) {
                        ((xif) oqdVar.a).f(i7, n(j, obj));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case jn7.t0 /* 57 */:
                    if (blfVar.i(i7, i4, obj)) {
                        ((xif) oqdVar.a).d(i7, k(j, obj));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case jn7.u0 /* 58 */:
                    if (blfVar.i(i7, i4, obj)) {
                        boolean booleanValue = ((Boolean) wlf.g(obj, j)).booleanValue();
                        xif xifVar8 = (xif) oqdVar.a;
                        xifVar8.j(i7 << 3);
                        xifVar8.a(booleanValue ? (byte) 1 : (byte) 0);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case jn7.v0 /* 59 */:
                    if (blfVar.i(i7, i4, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            ((xif) oqdVar.a).h(i7, (String) object2);
                        } else {
                            ((xif) oqdVar.a).c(i7, (nif) object2);
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case jn7.w0 /* 60 */:
                    if (blfVar.i(i7, i4, obj)) {
                        oqdVar.g(i7, unsafe.getObject(obj, j), blfVar.o(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case jn7.x0 /* 61 */:
                    if (blfVar.i(i7, i4, obj)) {
                        ((xif) oqdVar.a).c(i7, (nif) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case jn7.y0 /* 62 */:
                    if (blfVar.i(i7, i4, obj)) {
                        int k2 = k(j, obj);
                        xif xifVar9 = (xif) oqdVar.a;
                        xifVar9.j(i7 << 3);
                        xifVar9.j(k2);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case jn7.z0 /* 63 */:
                    if (blfVar.i(i7, i4, obj)) {
                        int k3 = k(j, obj);
                        xif xifVar10 = (xif) oqdVar.a;
                        xifVar10.j(i7 << 3);
                        if (k3 >= 0) {
                            xifVar10.j(k3);
                        } else {
                            xifVar10.l(k3);
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 64:
                    if (blfVar.i(i7, i4, obj)) {
                        ((xif) oqdVar.a).d(i7, k(j, obj));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 65:
                    if (blfVar.i(i7, i4, obj)) {
                        ((xif) oqdVar.a).f(i7, n(j, obj));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case jn7.C0 /* 66 */:
                    if (blfVar.i(i7, i4, obj)) {
                        int k4 = k(j, obj);
                        int i24 = (k4 << 1) ^ (k4 >> 31);
                        xif xifVar11 = (xif) oqdVar.a;
                        xifVar11.j(i7 << 3);
                        xifVar11.j(i24);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case jn7.D0 /* 67 */:
                    if (blfVar.i(i7, i4, obj)) {
                        long n = n(j, obj);
                        ((xif) oqdVar.a).k(i7, (n << 1) ^ (n >> 63));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case jn7.E0 /* 68 */:
                    if (blfVar.i(i7, i4, obj)) {
                        oqdVar.e(i7, unsafe.getObject(obj, j), blfVar.o(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                default:
                    i4 += 3;
                    i3 = 1048575;
            }
            blfVar = this;
            i4 += 3;
            i3 = 1048575;
        }
    }

    public final boolean i(int i2, int i3, Object obj) {
        return wlf.e(obj, (long) (this.a[i3 + 2] & 1048575)) == i2;
    }

    public final int m(int i2) {
        return this.a[i2 + 1];
    }

    public final jlf o(int i2) {
        int i3 = (i2 / 3) << 1;
        Object[] objArr = this.b;
        jlf jlfVar = (jlf) objArr[i3];
        if (jlfVar != null) {
            return jlfVar;
        }
        jlf a = glf.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a;
        return a;
    }

    public final void q(int i2, Object obj, Object obj2) {
        if (u(i2, obj2)) {
            long m = m(i2) & 1048575;
            Unsafe unsafe = i;
            Object object = unsafe.getObject(obj2, m);
            if (object == null) {
                grb.i(dze.d("Source subfield ", this.a[i2], " is present but null: ", obj2.toString()));
                return;
            }
            jlf o = o(i2);
            if (!u(i2, obj)) {
                if (h(object)) {
                    ljf zzc = o.zzc();
                    o.c(zzc, object);
                    unsafe.putObject(obj, m, zzc);
                } else {
                    unsafe.putObject(obj, m, object);
                }
                s(i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, m);
            if (!h(object2)) {
                ljf zzc2 = o.zzc();
                o.c(zzc2, object2);
                unsafe.putObject(obj, m, zzc2);
                object2 = zzc2;
            }
            o.c(object2, object);
        }
    }

    public final void r(int i2, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i3 = iArr[i2];
        if (i(i3, i2, obj2)) {
            long m = m(i2) & 1048575;
            Unsafe unsafe = i;
            Object object = unsafe.getObject(obj2, m);
            if (object == null) {
                grb.i(dze.d("Source subfield ", iArr[i2], " is present but null: ", obj2.toString()));
                return;
            }
            jlf o = o(i2);
            if (!i(i3, i2, obj)) {
                if (h(object)) {
                    ljf zzc = o.zzc();
                    o.c(zzc, object);
                    unsafe.putObject(obj, m, zzc);
                } else {
                    unsafe.putObject(obj, m, object);
                }
                wlf.h(obj, iArr[i2 + 2] & 1048575, i3);
                return;
            }
            Object object2 = unsafe.getObject(obj, m);
            if (!h(object2)) {
                ljf zzc2 = o.zzc();
                o.c(zzc2, object2);
                unsafe.putObject(obj, m, zzc2);
                object2 = zzc2;
            }
            o.c(object2, object);
        }
    }

    public final void s(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j = 1048575 & i3;
        if (j == 1048575) {
            return;
        }
        wlf.h(obj, j, wlf.e(obj, j) | (1 << (i3 >>> 20)));
    }

    public final boolean t(ljf ljfVar, ljf ljfVar2, int i2) {
        return u(i2, ljfVar) == u(i2, ljfVar2);
    }

    public final boolean u(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j = i3 & 1048575;
        if (j != 1048575) {
            return (wlf.e(obj, j) & (1 << (i3 >>> 20))) != 0;
        }
        int m = m(i2);
        long j2 = 1048575 & m;
        switch (l(m)) {
            case 0:
                if (Double.doubleToRawLongBits(wlf.c.k(obj, j2)) != 0) {
                }
                break;
            case 1:
                if (Float.floatToRawIntBits(wlf.c.p(obj, j2)) != 0) {
                }
                break;
            case 2:
                if (wlf.f(obj, j2) != 0) {
                }
                break;
            case 3:
                if (wlf.f(obj, j2) != 0) {
                }
                break;
            case 4:
                if (wlf.e(obj, j2) != 0) {
                }
                break;
            case 5:
                if (wlf.f(obj, j2) != 0) {
                }
                break;
            case 6:
                if (wlf.e(obj, j2) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object g = wlf.g(obj, j2);
                if (!(g instanceof String)) {
                    if (!(g instanceof nif)) {
                        iy8.d();
                        break;
                    } else if (!nif.c.equals(g)) {
                    }
                } else if (!((String) g).isEmpty()) {
                }
                break;
            case 9:
                if (wlf.g(obj, j2) != null) {
                }
                break;
            case 10:
                if (!nif.c.equals(wlf.g(obj, j2))) {
                }
                break;
            case 11:
                if (wlf.e(obj, j2) != 0) {
                }
                break;
            case 12:
                if (wlf.e(obj, j2) != 0) {
                }
                break;
            case 13:
                if (wlf.e(obj, j2) != 0) {
                }
                break;
            case 14:
                if (wlf.f(obj, j2) != 0) {
                }
                break;
            case 15:
                if (wlf.e(obj, j2) != 0) {
                }
                break;
            case 16:
                if (wlf.f(obj, j2) != 0) {
                }
                break;
            case 17:
                if (wlf.g(obj, j2) != null) {
                }
                break;
            default:
                iy8.d();
                break;
        }
        return false;
    }

    public final boolean v(Object obj, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? u(i2, obj) : (i4 & i5) != 0;
    }

    @Override // jlf
    public final ljf zzc() {
        return (ljf) ((ljf) this.c).h(4, null);
    }
}
