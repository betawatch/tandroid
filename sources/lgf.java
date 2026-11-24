// default package

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class lgf implements tgf {
    public static final int[] h = new int[0];
    public static final Unsafe i;
    public final int[] a;
    public final Object[] b;
    public final jdf c;
    public final int[] d;
    public final int e;
    public final yff f;
    public final dhf g;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new q2((byte) 7));
        } catch (Throwable unused) {
            unsafe = null;
        }
        i = unsafe;
    }

    public lgf(int[] iArr, Object[] objArr, jdf jdfVar, int[] iArr2, int i2, yff yffVar, dhf dhfVar, oef oefVar) {
        this.a = iArr;
        this.b = objArr;
        this.d = iArr2;
        this.e = i2;
        this.f = yffVar;
        this.g = dhfVar;
        this.c = jdfVar;
    }

    public static boolean h(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof vef) {
            return ((vef) obj).g();
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
    public static lgf j(sgf sgfVar, yff yffVar, dhf dhfVar, oef oefVar) {
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
        if (!(sgfVar instanceof sgf)) {
            fyb.g();
            return null;
        }
        String str2 = sgfVar.b;
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
        Object[] objArr = sgfVar.c;
        Class<?> cls = sgfVar.a.getClass();
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
            int i69 = charAt20 & kk7.d4;
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
                        if (sgfVar.a() == 1 || i71 != 0) {
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
                        if (sgfVar.a() == 1 || i71 != 0) {
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
        return new lgf(iArr2, objArr2, sgfVar.a, iArr, i5, yffVar, dhfVar, oefVar);
    }

    public static int k(Object obj, long j) {
        return ((Integer) ghf.g(obj, j)).intValue();
    }

    public static int l(int i2) {
        return (i2 >>> 20) & kk7.d4;
    }

    public static long n(Object obj, long j) {
        return ((Long) ghf.g(obj, j)).longValue();
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
            StringBuilder l = yjb.l("Field ", str, " for ", name, " not found. Known fields are ");
            l.append(arrays);
            throw new RuntimeException(l.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        continue;
     */
    @Override // tgf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        if (!h(obj)) {
            return;
        }
        if (obj instanceof vef) {
            vef vefVar = (vef) obj;
            vefVar.f();
            vefVar.zza = 0;
            vefVar.d();
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                this.g.getClass();
                chf chfVar = ((vef) obj).zzc;
                if (chfVar.d) {
                    chfVar.d = false;
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
                            this.f.a(obj, j);
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j) == null) {
                                break;
                            } else {
                                fyb.g();
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

    @Override // tgf
    public final boolean b(vef vefVar, vef vefVar2) {
        boolean e;
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 < iArr.length) {
                int m = m(i2);
                long j = m & 1048575;
                switch (l(m)) {
                    case 0:
                        if (!t(vefVar, vefVar2, i2)) {
                            break;
                        } else {
                            c6c c6cVar = ghf.c;
                            if (Double.doubleToLongBits(c6cVar.k(vefVar, j)) != Double.doubleToLongBits(c6cVar.k(vefVar2, j))) {
                                break;
                            } else {
                                continue;
                                i2 += 3;
                            }
                        }
                    case 1:
                        if (!t(vefVar, vefVar2, i2)) {
                            break;
                        } else {
                            c6c c6cVar2 = ghf.c;
                            if (Float.floatToIntBits(c6cVar2.p(vefVar, j)) != Float.floatToIntBits(c6cVar2.p(vefVar2, j))) {
                                break;
                            } else {
                                continue;
                                i2 += 3;
                            }
                        }
                    case 2:
                        if (t(vefVar, vefVar2, i2) && ghf.f(vefVar, j) == ghf.f(vefVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 3:
                        if (t(vefVar, vefVar2, i2) && ghf.f(vefVar, j) == ghf.f(vefVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 4:
                        if (t(vefVar, vefVar2, i2) && ghf.e(vefVar, j) == ghf.e(vefVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 5:
                        if (t(vefVar, vefVar2, i2) && ghf.f(vefVar, j) == ghf.f(vefVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 6:
                        if (t(vefVar, vefVar2, i2) && ghf.e(vefVar, j) == ghf.e(vefVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 7:
                        if (!t(vefVar, vefVar2, i2)) {
                            break;
                        } else {
                            c6c c6cVar3 = ghf.c;
                            if (c6cVar3.x(vefVar, j) != c6cVar3.x(vefVar2, j)) {
                                break;
                            } else {
                                continue;
                                i2 += 3;
                            }
                        }
                    case 8:
                        if (t(vefVar, vefVar2, i2) && ugf.e(ghf.g(vefVar, j), ghf.g(vefVar2, j))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 9:
                        if (t(vefVar, vefVar2, i2) && ugf.e(ghf.g(vefVar, j), ghf.g(vefVar2, j))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 10:
                        if (t(vefVar, vefVar2, i2) && ugf.e(ghf.g(vefVar, j), ghf.g(vefVar2, j))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 11:
                        if (t(vefVar, vefVar2, i2) && ghf.e(vefVar, j) == ghf.e(vefVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 12:
                        if (t(vefVar, vefVar2, i2) && ghf.e(vefVar, j) == ghf.e(vefVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 13:
                        if (t(vefVar, vefVar2, i2) && ghf.e(vefVar, j) == ghf.e(vefVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 14:
                        if (t(vefVar, vefVar2, i2) && ghf.f(vefVar, j) == ghf.f(vefVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 15:
                        if (t(vefVar, vefVar2, i2) && ghf.e(vefVar, j) == ghf.e(vefVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 16:
                        if (t(vefVar, vefVar2, i2) && ghf.f(vefVar, j) == ghf.f(vefVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 17:
                        if (t(vefVar, vefVar2, i2) && ugf.e(ghf.g(vefVar, j), ghf.g(vefVar2, j))) {
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
                        e = ugf.e(ghf.g(vefVar, j), ghf.g(vefVar2, j));
                        break;
                    case 50:
                        e = ugf.e(ghf.g(vefVar, j), ghf.g(vefVar2, j));
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
                        long j2 = iArr[i2 + 2] & 1048575;
                        if (ghf.e(vefVar, j2) == ghf.e(vefVar2, j2) && ugf.e(ghf.g(vefVar, j), ghf.g(vefVar2, j))) {
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
                if (vefVar.zzc.equals(vefVar2.zzc)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // tgf
    public final void c(Object obj, xdd xddVar) {
        int i2;
        lgf lgfVar = this;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (true) {
            int[] iArr = lgfVar.a;
            if (i4 >= iArr.length) {
                lgfVar.g.getClass();
                chf chfVar = ((vef) obj).zzc;
                return;
            }
            int m = lgfVar.m(i4);
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
                    if (lgfVar.v(obj, i4, i6, i5, i2)) {
                        ((hef) xddVar.a).f(i7, Double.doubleToRawLongBits(ghf.c.k(obj, j)));
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 1:
                    if (lgfVar.v(obj, i4, i6, i5, i2)) {
                        ((hef) xddVar.a).d(i7, Float.floatToRawIntBits(ghf.c.p(obj, j)));
                        break;
                    }
                    break;
                case 2:
                    if (lgfVar.v(obj, i4, i6, i5, i2)) {
                        ((hef) xddVar.a).k(i7, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 3:
                    if (lgfVar.v(obj, i4, i6, i5, i2)) {
                        ((hef) xddVar.a).k(i7, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 4:
                    if (lgfVar.v(obj, i4, i6, i5, i2)) {
                        int i10 = unsafe.getInt(obj, j);
                        hef hefVar = (hef) xddVar.a;
                        hefVar.j(i7 << 3);
                        if (i10 >= 0) {
                            hefVar.j(i10);
                            break;
                        } else {
                            hefVar.l(i10);
                            break;
                        }
                    }
                    break;
                case 5:
                    if (lgfVar.v(obj, i4, i6, i5, i2)) {
                        ((hef) xddVar.a).f(i7, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 6:
                    if (lgfVar.v(obj, i4, i6, i5, i2)) {
                        ((hef) xddVar.a).d(i7, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 7:
                    if (lgfVar.v(obj, i4, i6, i5, i2)) {
                        boolean x = ghf.c.x(obj, j);
                        hef hefVar2 = (hef) xddVar.a;
                        hefVar2.j(i7 << 3);
                        hefVar2.a(x ? (byte) 1 : (byte) 0);
                        break;
                    }
                    break;
                case 8:
                    if (lgfVar.v(obj, i4, i6, i5, i2)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((hef) xddVar.a).h(i7, (String) object);
                            break;
                        } else {
                            ((hef) xddVar.a).c(i7, (xdf) object);
                            break;
                        }
                    }
                    break;
                case 9:
                    if (lgfVar.v(obj, i4, i6, i5, i2)) {
                        xddVar.g(i7, unsafe.getObject(obj, j), lgfVar.o(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 10:
                    if (lgfVar.v(obj, i4, i6, i5, i2)) {
                        ((hef) xddVar.a).c(i7, (xdf) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 11:
                    if (lgfVar.v(obj, i4, i6, i5, i2)) {
                        int i11 = unsafe.getInt(obj, j);
                        hef hefVar3 = (hef) xddVar.a;
                        hefVar3.j(i7 << 3);
                        hefVar3.j(i11);
                        break;
                    }
                    break;
                case 12:
                    if (lgfVar.v(obj, i4, i6, i5, i2)) {
                        int i12 = unsafe.getInt(obj, j);
                        hef hefVar4 = (hef) xddVar.a;
                        hefVar4.j(i7 << 3);
                        if (i12 >= 0) {
                            hefVar4.j(i12);
                            break;
                        } else {
                            hefVar4.l(i12);
                            break;
                        }
                    }
                    break;
                case 13:
                    if (lgfVar.v(obj, i4, i6, i5, i2)) {
                        ((hef) xddVar.a).d(i7, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 14:
                    if (lgfVar.v(obj, i4, i6, i5, i2)) {
                        ((hef) xddVar.a).f(i7, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 15:
                    if (lgfVar.v(obj, i4, i6, i5, i2)) {
                        int i13 = unsafe.getInt(obj, j);
                        int i14 = (i13 << 1) ^ (i13 >> 31);
                        hef hefVar5 = (hef) xddVar.a;
                        hefVar5.j(i7 << 3);
                        hefVar5.j(i14);
                        break;
                    }
                    break;
                case 16:
                    if (lgfVar.v(obj, i4, i6, i5, i2)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((hef) xddVar.a).k(i7, (j2 << 1) ^ (j2 >> 63));
                        break;
                    }
                    break;
                case 17:
                    if (lgfVar.v(obj, i4, i6, i5, i2)) {
                        xddVar.e(i7, unsafe.getObject(obj, j), lgfVar.o(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 18:
                    ugf.q(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 19:
                    ugf.u(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 20:
                    ugf.w(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 21:
                    ugf.d(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 22:
                    ugf.v(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 23:
                    ugf.t(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 24:
                    ugf.s(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 25:
                    ugf.p(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 26:
                    int i15 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = ugf.a;
                    if (list == null) {
                        continue;
                    } else if (!list.isEmpty()) {
                        hef hefVar6 = (hef) xddVar.a;
                        if (list instanceof sff) {
                            sff sffVar = (sff) list;
                            for (int i16 = 0; i16 < list.size(); i16++) {
                                Object b = sffVar.b(i16);
                                if (b instanceof String) {
                                    hefVar6.h(i15, (String) b);
                                } else {
                                    hefVar6.c(i15, (xdf) b);
                                }
                            }
                        } else {
                            for (int i17 = 0; i17 < list.size(); i17++) {
                                hefVar6.h(i15, (String) list.get(i17));
                            }
                        }
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 27:
                    int i18 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    tgf o = lgfVar.o(i4);
                    Class cls2 = ugf.a;
                    if (list2 == null) {
                        continue;
                    } else if (!list2.isEmpty()) {
                        for (int i19 = 0; i19 < list2.size(); i19++) {
                            xddVar.g(i18, list2.get(i19), o);
                        }
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 28:
                    int i20 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = ugf.a;
                    if (list3 == null) {
                        continue;
                    } else if (!list3.isEmpty()) {
                        xddVar.getClass();
                        for (int i21 = 0; i21 < list3.size(); i21++) {
                            ((hef) xddVar.a).c(i20, (xdf) list3.get(i21));
                        }
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 29:
                    ugf.c(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case kk7.S /* 30 */:
                    ugf.r(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 31:
                    ugf.x(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 32:
                    ugf.y(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 33:
                    ugf.a(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 34:
                    ugf.b(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 35:
                    ugf.q(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 36:
                    ugf.u(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 37:
                    ugf.w(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 38:
                    ugf.d(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 39:
                    ugf.v(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 40:
                    ugf.t(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 41:
                    ugf.s(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 42:
                    ugf.p(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 43:
                    ugf.c(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 44:
                    ugf.r(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 45:
                    ugf.x(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 46:
                    ugf.y(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 47:
                    ugf.a(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 48:
                    ugf.b(iArr[i4], (List) unsafe.getObject(obj, j), xddVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 49:
                    int i22 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    tgf o2 = lgfVar.o(i4);
                    Class cls4 = ugf.a;
                    if (list4 == null) {
                        continue;
                    } else if (!list4.isEmpty()) {
                        for (int i23 = 0; i23 < list4.size(); i23++) {
                            xddVar.e(i22, list4.get(i23), o2);
                        }
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        lgfVar.b[(i4 / 3) << 1].getClass();
                        fyb.g();
                        return;
                    } else {
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    }
                case kk7.n0 /* 51 */:
                    if (lgfVar.i(i7, i4, obj)) {
                        ((hef) xddVar.a).f(i7, Double.doubleToRawLongBits(((Double) ghf.g(obj, j)).doubleValue()));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case kk7.o0 /* 52 */:
                    if (lgfVar.i(i7, i4, obj)) {
                        ((hef) xddVar.a).d(i7, Float.floatToRawIntBits(((Float) ghf.g(obj, j)).floatValue()));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case kk7.p0 /* 53 */:
                    if (lgfVar.i(i7, i4, obj)) {
                        ((hef) xddVar.a).k(i7, n(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case kk7.q0 /* 54 */:
                    if (lgfVar.i(i7, i4, obj)) {
                        ((hef) xddVar.a).k(i7, n(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case kk7.r0 /* 55 */:
                    if (lgfVar.i(i7, i4, obj)) {
                        int k = k(obj, j);
                        hef hefVar7 = (hef) xddVar.a;
                        hefVar7.j(i7 << 3);
                        if (k >= 0) {
                            hefVar7.j(k);
                        } else {
                            hefVar7.l(k);
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 56:
                    if (lgfVar.i(i7, i4, obj)) {
                        ((hef) xddVar.a).f(i7, n(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case kk7.t0 /* 57 */:
                    if (lgfVar.i(i7, i4, obj)) {
                        ((hef) xddVar.a).d(i7, k(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case kk7.u0 /* 58 */:
                    if (lgfVar.i(i7, i4, obj)) {
                        boolean booleanValue = ((Boolean) ghf.g(obj, j)).booleanValue();
                        hef hefVar8 = (hef) xddVar.a;
                        hefVar8.j(i7 << 3);
                        hefVar8.a(booleanValue ? (byte) 1 : (byte) 0);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case kk7.v0 /* 59 */:
                    if (lgfVar.i(i7, i4, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            ((hef) xddVar.a).h(i7, (String) object2);
                        } else {
                            ((hef) xddVar.a).c(i7, (xdf) object2);
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case kk7.w0 /* 60 */:
                    if (lgfVar.i(i7, i4, obj)) {
                        xddVar.g(i7, unsafe.getObject(obj, j), lgfVar.o(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case kk7.x0 /* 61 */:
                    if (lgfVar.i(i7, i4, obj)) {
                        ((hef) xddVar.a).c(i7, (xdf) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case kk7.y0 /* 62 */:
                    if (lgfVar.i(i7, i4, obj)) {
                        int k2 = k(obj, j);
                        hef hefVar9 = (hef) xddVar.a;
                        hefVar9.j(i7 << 3);
                        hefVar9.j(k2);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case kk7.z0 /* 63 */:
                    if (lgfVar.i(i7, i4, obj)) {
                        int k3 = k(obj, j);
                        hef hefVar10 = (hef) xddVar.a;
                        hefVar10.j(i7 << 3);
                        if (k3 >= 0) {
                            hefVar10.j(k3);
                        } else {
                            hefVar10.l(k3);
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 64:
                    if (lgfVar.i(i7, i4, obj)) {
                        ((hef) xddVar.a).d(i7, k(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 65:
                    if (lgfVar.i(i7, i4, obj)) {
                        ((hef) xddVar.a).f(i7, n(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case kk7.C0 /* 66 */:
                    if (lgfVar.i(i7, i4, obj)) {
                        int k4 = k(obj, j);
                        int i24 = (k4 << 1) ^ (k4 >> 31);
                        hef hefVar11 = (hef) xddVar.a;
                        hefVar11.j(i7 << 3);
                        hefVar11.j(i24);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case kk7.D0 /* 67 */:
                    if (lgfVar.i(i7, i4, obj)) {
                        long n = n(obj, j);
                        ((hef) xddVar.a).k(i7, (n << 1) ^ (n >> 63));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case kk7.E0 /* 68 */:
                    if (lgfVar.i(i7, i4, obj)) {
                        xddVar.e(i7, unsafe.getObject(obj, j), lgfVar.o(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                default:
                    i4 += 3;
                    i3 = 1048575;
            }
            lgfVar = this;
            i4 += 3;
            i3 = 1048575;
        }
    }

    @Override // tgf
    public final void d(Object obj, Object obj2) {
        Object obj3;
        if (!h(obj)) {
            w26.j("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                ugf.o(this.g, obj, obj2);
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
                        c6c c6cVar = ghf.c;
                        c6cVar.v(obj3, j, c6cVar.k(obj2, j));
                        s(i2, obj3);
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 1:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        c6c c6cVar2 = ghf.c;
                        c6cVar2.w(obj3, j, c6cVar2.p(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 2:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        ghf.c.a.putLong(obj3, j, ghf.f(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 3:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        ghf.c.a.putLong(obj3, j, ghf.f(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 4:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        ghf.h(obj3, j, ghf.e(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 5:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        ghf.c.a.putLong(obj3, j, ghf.f(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 6:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        ghf.h(obj3, j, ghf.e(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 7:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        c6c c6cVar3 = ghf.c;
                        c6cVar3.s(obj3, j, c6cVar3.x(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 8:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        ghf.i(obj3, j, ghf.g(obj2, j));
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
                        ghf.i(obj3, j, ghf.g(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 11:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        ghf.h(obj3, j, ghf.e(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 12:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        ghf.h(obj3, j, ghf.e(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 13:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        ghf.h(obj3, j, ghf.e(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 14:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        ghf.c.a.putLong(obj3, j, ghf.f(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 15:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        ghf.h(obj3, j, ghf.e(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 16:
                    if (u(i2, obj2)) {
                        obj3 = obj;
                        ghf.c.a.putLong(obj3, j, ghf.f(obj2, j));
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
                    this.f.b(obj, j, obj2);
                    break;
                case 50:
                    Class cls = ugf.a;
                    Object g = ghf.g(obj, j);
                    Object g2 = ghf.g(obj2, j);
                    if (g != null) {
                        fyb.g();
                        return;
                    } else {
                        g2.getClass();
                        fyb.g();
                        return;
                    }
                case kk7.n0 /* 51 */:
                case kk7.o0 /* 52 */:
                case kk7.p0 /* 53 */:
                case kk7.q0 /* 54 */:
                case kk7.r0 /* 55 */:
                case 56:
                case kk7.t0 /* 57 */:
                case kk7.u0 /* 58 */:
                case kk7.v0 /* 59 */:
                    if (i(i4, i2, obj2)) {
                        ghf.i(obj, j, ghf.g(obj2, j));
                        ghf.h(obj, iArr[i2 + 2] & 1048575, i4);
                        break;
                    }
                    break;
                case kk7.w0 /* 60 */:
                    r(i2, obj, obj2);
                    break;
                case kk7.x0 /* 61 */:
                case kk7.y0 /* 62 */:
                case kk7.z0 /* 63 */:
                case 64:
                case 65:
                case kk7.C0 /* 66 */:
                case kk7.D0 /* 67 */:
                    if (i(i4, i2, obj2)) {
                        ghf.i(obj, j, ghf.g(obj2, j));
                        ghf.h(obj, iArr[i2 + 2] & 1048575, i4);
                        break;
                    }
                    break;
                case kk7.E0 /* 68 */:
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
    
        r8 = mue.f(r12 << 3, 8, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x05ab, code lost:
    
        if (r0.v(r1, r2, r3, r4, r5) != false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0698, code lost:
    
        r8 = mue.f(r12 << 3, 4, r8);
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
    @Override // tgf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(vef vefVar) {
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
        lgf lgfVar = this;
        vef vefVar2 = vefVar;
        int i7 = 1048575;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = lgfVar.a;
            if (i9 >= iArr.length) {
                lgfVar.g.getClass();
                chf chfVar = vefVar2.zzc;
                int i12 = chfVar.c;
                if (i12 == -1) {
                    chfVar.c = 0;
                    i2 = 0;
                } else {
                    i2 = i12;
                }
                return i2 + i11;
            }
            int m = lgfVar.m(i9);
            int l = l(m);
            int i13 = iArr[i9];
            int i14 = iArr[i9 + 2];
            int i15 = i14 & i7;
            Unsafe unsafe = i;
            if (l <= 17) {
                if (i15 != i8) {
                    i10 = i15 == i7 ? 0 : unsafe.getInt(vefVar2, i15);
                    i8 = i15;
                }
                i3 = 1 << (i14 >>> 20);
            } else {
                i3 = 0;
            }
            int i16 = m & i7;
            if (l >= ref.b.a) {
                byte b = ref.c.a;
            }
            long j2 = i16;
            switch (l) {
                case 0:
                    if (!lgfVar.v(vefVar2, i9, i8, i10, i3)) {
                        i9 += 3;
                        i7 = 1048575;
                    }
                    i11 = mue.f(i13 << 3, 8, i11);
                    i9 += 3;
                    i7 = 1048575;
                case 1:
                    break;
                case 2:
                    if (lgfVar.v(vefVar2, i9, i8, i10, i3)) {
                        i4 = i13 << 3;
                        p = hef.p(unsafe.getLong(vefVar2, j2));
                        i11 = mue.f(i4, p, i11);
                    }
                    lgfVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 3:
                    if (lgfVar.v(vefVar2, i9, i8, i10, i3)) {
                        i4 = i13 << 3;
                        p = hef.p(unsafe.getLong(vefVar2, j2));
                        i11 = mue.f(i4, p, i11);
                    }
                    lgfVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 4:
                    if (lgfVar.v(vefVar2, i9, i8, i10, i3)) {
                        i4 = i13 << 3;
                        p = hef.m(unsafe.getInt(vefVar2, j2));
                        i11 = mue.f(i4, p, i11);
                    }
                    lgfVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    if (lgfVar.v(vefVar2, i9, i8, i10, i3)) {
                        i11 = mue.f(i13 << 3, 1, i11);
                    }
                    lgfVar = this;
                    vefVar2 = vefVar;
                    i9 += 3;
                    i7 = 1048575;
                case 8:
                    if (lgfVar.v(vefVar2, i9, i8, i10, i3)) {
                        i4 = i13 << 3;
                        Object object = unsafe.getObject(vefVar2, j2);
                        if (object instanceof xdf) {
                            Logger logger = hef.e;
                            j = ((xdf) object).j();
                            o = hef.o(j);
                            i11 = mue.f(i4, o + j, i11);
                        } else {
                            p = hef.n((String) object);
                            i11 = mue.f(i4, p, i11);
                        }
                    }
                    lgfVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 9:
                    if (lgfVar.v(vefVar2, i9, i8, i10, i3)) {
                        Object object2 = unsafe.getObject(vefVar2, j2);
                        tgf o9 = lgfVar.o(i9);
                        Class cls = ugf.a;
                        i5 = i13 << 3;
                        Logger logger2 = hef.e;
                        a = ((jdf) object2).a(o9);
                        o2 = hef.o(a);
                        i11 = mue.f(i5, o2 + a, i11);
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 10:
                    if (lgfVar.v(vefVar2, i9, i8, i10, i3)) {
                        i4 = i13 << 3;
                        xdf xdfVar = (xdf) unsafe.getObject(vefVar2, j2);
                        Logger logger3 = hef.e;
                        j = xdfVar.j();
                        o = hef.o(j);
                        i11 = mue.f(i4, o + j, i11);
                    }
                    lgfVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 11:
                    if (lgfVar.v(vefVar2, i9, i8, i10, i3)) {
                        i4 = i13 << 3;
                        p = hef.o(unsafe.getInt(vefVar2, j2));
                        i11 = mue.f(i4, p, i11);
                    }
                    lgfVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 12:
                    if (lgfVar.v(vefVar2, i9, i8, i10, i3)) {
                        i4 = i13 << 3;
                        p = hef.m(unsafe.getInt(vefVar2, j2));
                        i11 = mue.f(i4, p, i11);
                    }
                    lgfVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    if (lgfVar.v(vefVar2, i9, i8, i10, i3)) {
                        int i17 = unsafe.getInt(vefVar2, j2);
                        i11 = mue.f((i17 << 1) ^ (i17 >> 31), hef.o(i13 << 3), i11);
                    }
                    lgfVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 16:
                    if (lgfVar.v(vefVar2, i9, i8, i10, i3)) {
                        long j3 = unsafe.getLong(vefVar2, j2);
                        i11 += hef.p((j3 << 1) ^ (j3 >> 63)) + hef.o(i13 << 3);
                    }
                    lgfVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 17:
                    if (lgfVar.v(vefVar2, i9, i8, i10, i3)) {
                        jdf jdfVar = (jdf) unsafe.getObject(vefVar2, j2);
                        tgf o10 = lgfVar.o(i9);
                        Logger logger4 = hef.e;
                        a2 = jdfVar.a(o10);
                        o3 = hef.o(i13 << 3);
                        i11 += (o3 << 1) + a2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 18:
                    h2 = ugf.h(i13, (List) unsafe.getObject(vefVar2, j2));
                    i11 += h2;
                    i9 += 3;
                    i7 = 1048575;
                case 19:
                    h2 = ugf.g(i13, (List) unsafe.getObject(vefVar2, j2));
                    i11 += h2;
                    i9 += 3;
                    i7 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(vefVar2, j2);
                    Class cls2 = ugf.a;
                    if (list.size() != 0) {
                        o4 = (hef.o(i13 << 3) * list.size()) + ugf.j(list);
                        i11 += o4;
                        i9 += 3;
                        i7 = 1048575;
                    }
                    o4 = 0;
                    i11 += o4;
                    i9 += 3;
                    i7 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(vefVar2, j2);
                    Class cls3 = ugf.a;
                    size = list2.size();
                    if (size != 0) {
                        n = ugf.n(list2);
                        o5 = hef.o(i13 << 3);
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
                    List list3 = (List) unsafe.getObject(vefVar2, j2);
                    Class cls4 = ugf.a;
                    size = list3.size();
                    if (size != 0) {
                        n = ugf.i(list3);
                        o5 = hef.o(i13 << 3);
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
                    h2 = ugf.h(i13, (List) unsafe.getObject(vefVar2, j2));
                    i11 += h2;
                    i9 += 3;
                    i7 = 1048575;
                case 24:
                    h2 = ugf.g(i13, (List) unsafe.getObject(vefVar2, j2));
                    i11 += h2;
                    i9 += 3;
                    i7 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(vefVar2, j2);
                    Class cls5 = ugf.a;
                    int size3 = list4.size();
                    i11 += size3 == 0 ? 0 : (hef.o(i13 << 3) + 1) * size3;
                    i9 += 3;
                    i7 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(vefVar2, j2);
                    Class cls6 = ugf.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        boolean z = list5 instanceof sff;
                        o6 = hef.o(i13 << 3) * size4;
                        if (z) {
                            sff sffVar = (sff) list5;
                            for (int i18 = 0; i18 < size4; i18++) {
                                Object b2 = sffVar.b(i18);
                                if (b2 instanceof xdf) {
                                    int j4 = ((xdf) b2).j();
                                    o6 = mue.f(j4, j4, o6);
                                } else {
                                    o6 = hef.n((String) b2) + o6;
                                }
                            }
                        } else {
                            for (int i19 = 0; i19 < size4; i19++) {
                                Object obj = list5.get(i19);
                                if (obj instanceof xdf) {
                                    int j5 = ((xdf) obj).j();
                                    o6 = mue.f(j5, j5, o6);
                                } else {
                                    o6 = hef.n((String) obj) + o6;
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
                    List list6 = (List) unsafe.getObject(vefVar2, j2);
                    tgf o11 = lgfVar.o(i9);
                    Class cls7 = ugf.a;
                    int size5 = list6.size();
                    if (size5 != 0) {
                        o6 = hef.o(i13 << 3) * size5;
                        for (int i20 = 0; i20 < size5; i20++) {
                            int a3 = ((jdf) list6.get(i20)).a(o11);
                            o6 = mue.f(a3, a3, o6);
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
                    List list7 = (List) unsafe.getObject(vefVar2, j2);
                    Class cls8 = ugf.a;
                    int size6 = list7.size();
                    if (size6 != 0) {
                        o4 = hef.o(i13 << 3) * size6;
                        for (int i21 = 0; i21 < list7.size(); i21++) {
                            int j6 = ((xdf) list7.get(i21)).j();
                            o4 = mue.f(j6, j6, o4);
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
                    List list8 = (List) unsafe.getObject(vefVar2, j2);
                    Class cls9 = ugf.a;
                    size = list8.size();
                    if (size != 0) {
                        n = ugf.m(list8);
                        o5 = hef.o(i13 << 3);
                        o4 = (o5 * size) + n;
                        i11 += o4;
                        i9 += 3;
                        i7 = 1048575;
                    }
                    o4 = 0;
                    i11 += o4;
                    i9 += 3;
                    i7 = 1048575;
                case kk7.S /* 30 */:
                    List list9 = (List) unsafe.getObject(vefVar2, j2);
                    Class cls10 = ugf.a;
                    size = list9.size();
                    if (size != 0) {
                        n = ugf.f(list9);
                        o5 = hef.o(i13 << 3);
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
                    h2 = ugf.g(i13, (List) unsafe.getObject(vefVar2, j2));
                    i11 += h2;
                    i9 += 3;
                    i7 = 1048575;
                case 32:
                    h2 = ugf.h(i13, (List) unsafe.getObject(vefVar2, j2));
                    i11 += h2;
                    i9 += 3;
                    i7 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(vefVar2, j2);
                    Class cls11 = ugf.a;
                    size = list10.size();
                    if (size != 0) {
                        n = ugf.k(list10);
                        o5 = hef.o(i13 << 3);
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
                    List list11 = (List) unsafe.getObject(vefVar2, j2);
                    Class cls12 = ugf.a;
                    size = list11.size();
                    if (size != 0) {
                        n = ugf.l(list11);
                        o5 = hef.o(i13 << 3);
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
                    List list12 = (List) unsafe.getObject(vefVar2, j2);
                    Class cls13 = ugf.a;
                    size2 = list12.size() << 3;
                    if (size2 > 0) {
                        o7 = hef.o(size2);
                        o8 = hef.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(vefVar2, j2);
                    Class cls14 = ugf.a;
                    size2 = list13.size() << 2;
                    if (size2 > 0) {
                        o7 = hef.o(size2);
                        o8 = hef.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 37:
                    size2 = ugf.j((List) unsafe.getObject(vefVar2, j2));
                    if (size2 > 0) {
                        o7 = hef.o(size2);
                        o8 = hef.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 38:
                    size2 = ugf.n((List) unsafe.getObject(vefVar2, j2));
                    if (size2 > 0) {
                        o7 = hef.o(size2);
                        o8 = hef.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 39:
                    size2 = ugf.i((List) unsafe.getObject(vefVar2, j2));
                    if (size2 > 0) {
                        o7 = hef.o(size2);
                        o8 = hef.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(vefVar2, j2);
                    Class cls15 = ugf.a;
                    size2 = list14.size() << 3;
                    if (size2 > 0) {
                        o7 = hef.o(size2);
                        o8 = hef.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(vefVar2, j2);
                    Class cls16 = ugf.a;
                    size2 = list15.size() << 2;
                    if (size2 > 0) {
                        o7 = hef.o(size2);
                        o8 = hef.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(vefVar2, j2);
                    Class cls17 = ugf.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        o7 = hef.o(size2);
                        o8 = hef.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 43:
                    size2 = ugf.m((List) unsafe.getObject(vefVar2, j2));
                    if (size2 > 0) {
                        o7 = hef.o(size2);
                        o8 = hef.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 44:
                    size2 = ugf.f((List) unsafe.getObject(vefVar2, j2));
                    if (size2 > 0) {
                        o7 = hef.o(size2);
                        o8 = hef.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(vefVar2, j2);
                    Class cls18 = ugf.a;
                    size2 = list17.size() << 2;
                    if (size2 > 0) {
                        o7 = hef.o(size2);
                        o8 = hef.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(vefVar2, j2);
                    Class cls19 = ugf.a;
                    size2 = list18.size() << 3;
                    if (size2 > 0) {
                        o7 = hef.o(size2);
                        o8 = hef.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 47:
                    size2 = ugf.k((List) unsafe.getObject(vefVar2, j2));
                    if (size2 > 0) {
                        o7 = hef.o(size2);
                        o8 = hef.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 48:
                    size2 = ugf.l((List) unsafe.getObject(vefVar2, j2));
                    if (size2 > 0) {
                        o7 = hef.o(size2);
                        o8 = hef.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(vefVar2, j2);
                    tgf o12 = lgfVar.o(i9);
                    Class cls20 = ugf.a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        i6 = 0;
                    } else {
                        i6 = 0;
                        for (int i22 = 0; i22 < size7; i22++) {
                            jdf jdfVar2 = (jdf) list19.get(i22);
                            Logger logger5 = hef.e;
                            i6 += (hef.o(i13 << 3) << 1) + jdfVar2.a(o12);
                        }
                    }
                    i11 += i6;
                    i9 += 3;
                    i7 = 1048575;
                case 50:
                    Object object3 = unsafe.getObject(vefVar2, j2);
                    Object obj2 = lgfVar.b[(i9 / 3) << 1];
                    if (object3 == null) {
                        obj2.getClass();
                        fyb.g();
                        break;
                    } else {
                        fyb.g();
                        break;
                    }
                case kk7.n0 /* 51 */:
                    if (!lgfVar.i(i13, i9, vefVar2)) {
                        i9 += 3;
                        i7 = 1048575;
                    }
                    i11 = mue.f(i13 << 3, 8, i11);
                    i9 += 3;
                    i7 = 1048575;
                case kk7.o0 /* 52 */:
                    if (!lgfVar.i(i13, i9, vefVar2)) {
                        i9 += 3;
                        i7 = 1048575;
                    }
                    i11 = mue.f(i13 << 3, 4, i11);
                    i9 += 3;
                    i7 = 1048575;
                case kk7.p0 /* 53 */:
                    if (lgfVar.i(i13, i9, vefVar2)) {
                        i5 = i13 << 3;
                        p2 = hef.p(n(vefVar2, j2));
                        i11 = mue.f(i5, p2, i11);
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case kk7.q0 /* 54 */:
                    if (lgfVar.i(i13, i9, vefVar2)) {
                        i5 = i13 << 3;
                        p2 = hef.p(n(vefVar2, j2));
                        i11 = mue.f(i5, p2, i11);
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case kk7.r0 /* 55 */:
                    if (lgfVar.i(i13, i9, vefVar2)) {
                        i5 = i13 << 3;
                        p2 = hef.m(k(vefVar2, j2));
                        i11 = mue.f(i5, p2, i11);
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 56:
                    if (!lgfVar.i(i13, i9, vefVar2)) {
                        i9 += 3;
                        i7 = 1048575;
                    }
                    i11 = mue.f(i13 << 3, 8, i11);
                    i9 += 3;
                    i7 = 1048575;
                case kk7.t0 /* 57 */:
                    if (!lgfVar.i(i13, i9, vefVar2)) {
                        i9 += 3;
                        i7 = 1048575;
                    }
                    i11 = mue.f(i13 << 3, 4, i11);
                    i9 += 3;
                    i7 = 1048575;
                case kk7.u0 /* 58 */:
                    if (lgfVar.i(i13, i9, vefVar2)) {
                        i11 = mue.f(i13 << 3, 1, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                case kk7.v0 /* 59 */:
                    if (lgfVar.i(i13, i9, vefVar2)) {
                        i5 = i13 << 3;
                        Object object4 = unsafe.getObject(vefVar2, j2);
                        if (object4 instanceof xdf) {
                            Logger logger6 = hef.e;
                            a = ((xdf) object4).j();
                            o2 = hef.o(a);
                            i11 = mue.f(i5, o2 + a, i11);
                            i9 += 3;
                            i7 = 1048575;
                        } else {
                            p2 = hef.n((String) object4);
                            i11 = mue.f(i5, p2, i11);
                            i9 += 3;
                            i7 = 1048575;
                        }
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case kk7.w0 /* 60 */:
                    if (lgfVar.i(i13, i9, vefVar2)) {
                        Object object5 = unsafe.getObject(vefVar2, j2);
                        tgf o13 = lgfVar.o(i9);
                        Class cls21 = ugf.a;
                        i5 = i13 << 3;
                        Logger logger7 = hef.e;
                        a = ((jdf) object5).a(o13);
                        o2 = hef.o(a);
                        i11 = mue.f(i5, o2 + a, i11);
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case kk7.x0 /* 61 */:
                    if (lgfVar.i(i13, i9, vefVar2)) {
                        i5 = i13 << 3;
                        xdf xdfVar2 = (xdf) unsafe.getObject(vefVar2, j2);
                        Logger logger8 = hef.e;
                        a = xdfVar2.j();
                        o2 = hef.o(a);
                        i11 = mue.f(i5, o2 + a, i11);
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case kk7.y0 /* 62 */:
                    if (lgfVar.i(i13, i9, vefVar2)) {
                        i5 = i13 << 3;
                        p2 = hef.o(k(vefVar2, j2));
                        i11 = mue.f(i5, p2, i11);
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case kk7.z0 /* 63 */:
                    if (lgfVar.i(i13, i9, vefVar2)) {
                        i5 = i13 << 3;
                        p2 = hef.m(k(vefVar2, j2));
                        i11 = mue.f(i5, p2, i11);
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 64:
                    if (!lgfVar.i(i13, i9, vefVar2)) {
                        i9 += 3;
                        i7 = 1048575;
                    }
                    i11 = mue.f(i13 << 3, 4, i11);
                    i9 += 3;
                    i7 = 1048575;
                case 65:
                    if (!lgfVar.i(i13, i9, vefVar2)) {
                        i9 += 3;
                        i7 = 1048575;
                    }
                    i11 = mue.f(i13 << 3, 8, i11);
                    i9 += 3;
                    i7 = 1048575;
                case kk7.C0 /* 66 */:
                    if (lgfVar.i(i13, i9, vefVar2)) {
                        int k = k(vefVar2, j2);
                        i11 = mue.f((k << 1) ^ (k >> 31), hef.o(i13 << 3), i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                case kk7.D0 /* 67 */:
                    if (lgfVar.i(i13, i9, vefVar2)) {
                        long n2 = n(vefVar2, j2);
                        h2 = hef.p((n2 << 1) ^ (n2 >> 63)) + hef.o(i13 << 3);
                        i11 += h2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case kk7.E0 /* 68 */:
                    if (lgfVar.i(i13, i9, vefVar2)) {
                        jdf jdfVar3 = (jdf) unsafe.getObject(vefVar2, j2);
                        tgf o14 = lgfVar.o(i9);
                        Logger logger9 = hef.e;
                        a2 = jdfVar3.a(o14);
                        o3 = hef.o(i13 << 3);
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
    @Override // tgf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(vef vefVar) {
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
                vefVar.zzc.getClass();
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
                    doubleToLongBits = Double.doubleToLongBits(ghf.c.k(vefVar, j));
                    Charset charset = eff.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i3 = i7 * 53;
                    floatToIntBits = Float.floatToIntBits(ghf.c.p(vefVar, j));
                    i7 = floatToIntBits + i3;
                    break;
                case 2:
                    i2 = i7 * 53;
                    doubleToLongBits = ghf.f(vefVar, j);
                    Charset charset2 = eff.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i2 = i7 * 53;
                    doubleToLongBits = ghf.f(vefVar, j);
                    Charset charset3 = eff.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i3 = i7 * 53;
                    floatToIntBits = ghf.e(vefVar, j);
                    i7 = floatToIntBits + i3;
                    break;
                case 5:
                    i2 = i7 * 53;
                    doubleToLongBits = ghf.f(vefVar, j);
                    Charset charset4 = eff.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i3 = i7 * 53;
                    floatToIntBits = ghf.e(vefVar, j);
                    i7 = floatToIntBits + i3;
                    break;
                case 7:
                    i4 = i7 * 53;
                    boolean x = ghf.c.x(vefVar, j);
                    Charset charset5 = eff.a;
                    break;
                case 8:
                    i3 = i7 * 53;
                    floatToIntBits = ((String) ghf.g(vefVar, j)).hashCode();
                    i7 = floatToIntBits + i3;
                    break;
                case 9:
                    i5 = i7 * 53;
                    Object g = ghf.g(vefVar, j);
                    if (g != null) {
                        i11 = g.hashCode();
                    }
                    i7 = i5 + i11;
                    break;
                case 10:
                    i3 = i7 * 53;
                    floatToIntBits = ghf.g(vefVar, j).hashCode();
                    i7 = floatToIntBits + i3;
                    break;
                case 11:
                    i3 = i7 * 53;
                    floatToIntBits = ghf.e(vefVar, j);
                    i7 = floatToIntBits + i3;
                    break;
                case 12:
                    i3 = i7 * 53;
                    floatToIntBits = ghf.e(vefVar, j);
                    i7 = floatToIntBits + i3;
                    break;
                case 13:
                    i3 = i7 * 53;
                    floatToIntBits = ghf.e(vefVar, j);
                    i7 = floatToIntBits + i3;
                    break;
                case 14:
                    i2 = i7 * 53;
                    doubleToLongBits = ghf.f(vefVar, j);
                    Charset charset6 = eff.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i3 = i7 * 53;
                    floatToIntBits = ghf.e(vefVar, j);
                    i7 = floatToIntBits + i3;
                    break;
                case 16:
                    i2 = i7 * 53;
                    doubleToLongBits = ghf.f(vefVar, j);
                    Charset charset7 = eff.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i5 = i7 * 53;
                    Object g2 = ghf.g(vefVar, j);
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
                    i3 = i7 * 53;
                    floatToIntBits = ghf.g(vefVar, j).hashCode();
                    i7 = floatToIntBits + i3;
                    break;
                case 50:
                    i3 = i7 * 53;
                    floatToIntBits = ghf.g(vefVar, j).hashCode();
                    i7 = floatToIntBits + i3;
                    break;
                case kk7.n0 /* 51 */:
                    if (!i(i9, i6, vefVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) ghf.g(vefVar, j)).doubleValue());
                        Charset charset8 = eff.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case kk7.o0 /* 52 */:
                    if (!i(i9, i6, vefVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) ghf.g(vefVar, j)).floatValue());
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case kk7.p0 /* 53 */:
                    if (!i(i9, i6, vefVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = n(vefVar, j);
                        Charset charset9 = eff.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case kk7.q0 /* 54 */:
                    if (!i(i9, i6, vefVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = n(vefVar, j);
                        Charset charset10 = eff.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case kk7.r0 /* 55 */:
                    if (!i(i9, i6, vefVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = k(vefVar, j);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 56:
                    if (!i(i9, i6, vefVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = n(vefVar, j);
                        Charset charset11 = eff.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case kk7.t0 /* 57 */:
                    if (!i(i9, i6, vefVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = k(vefVar, j);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case kk7.u0 /* 58 */:
                    if (!i(i9, i6, vefVar)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        boolean booleanValue = ((Boolean) ghf.g(vefVar, j)).booleanValue();
                        Charset charset12 = eff.a;
                        break;
                    }
                case kk7.v0 /* 59 */:
                    if (!i(i9, i6, vefVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = ((String) ghf.g(vefVar, j)).hashCode();
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case kk7.w0 /* 60 */:
                    if (!i(i9, i6, vefVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = ghf.g(vefVar, j).hashCode();
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case kk7.x0 /* 61 */:
                    if (!i(i9, i6, vefVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = ghf.g(vefVar, j).hashCode();
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case kk7.y0 /* 62 */:
                    if (!i(i9, i6, vefVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = k(vefVar, j);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case kk7.z0 /* 63 */:
                    if (!i(i9, i6, vefVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = k(vefVar, j);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 64:
                    if (!i(i9, i6, vefVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = k(vefVar, j);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 65:
                    if (!i(i9, i6, vefVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = n(vefVar, j);
                        Charset charset13 = eff.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case kk7.C0 /* 66 */:
                    if (!i(i9, i6, vefVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = k(vefVar, j);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case kk7.D0 /* 67 */:
                    if (!i(i9, i6, vefVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = n(vefVar, j);
                        Charset charset14 = eff.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case kk7.E0 /* 68 */:
                    if (!i(i9, i6, vefVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = ghf.g(vefVar, j).hashCode();
                        i7 = floatToIntBits + i3;
                        break;
                    }
            }
            i6 += 3;
        }
    }

    @Override // tgf
    public final boolean g(Object obj) {
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
                    if (v(obj, i3, i2, i4, i12) && !o(i3).g(ghf.g(obj, m & 1048575))) {
                    }
                    i6++;
                    i7 = i2;
                    i5 = i4;
                } else {
                    if (l != 27) {
                        if (l == 60 || l == 68) {
                            if (i(i9, i3, obj) && !o(i3).g(ghf.g(obj, m & 1048575))) {
                            }
                        } else if (l != 49) {
                            if (l == 50) {
                                ghf.g(obj, m & 1048575).getClass();
                                fyb.g();
                                return false;
                            }
                        }
                        i6++;
                        i7 = i2;
                        i5 = i4;
                    }
                    List list = (List) ghf.g(obj, m & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        tgf o = o(i3);
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            if (o.g(list.get(i14))) {
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

    public final boolean i(int i2, int i3, Object obj) {
        return ghf.e(obj, (long) (this.a[i3 + 2] & 1048575)) == i2;
    }

    public final int m(int i2) {
        return this.a[i2 + 1];
    }

    public final tgf o(int i2) {
        int i3 = (i2 / 3) << 1;
        Object[] objArr = this.b;
        tgf tgfVar = (tgf) objArr[i3];
        if (tgfVar != null) {
            return tgfVar;
        }
        tgf a = qgf.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a;
        return a;
    }

    public final void q(int i2, Object obj, Object obj2) {
        if (u(i2, obj2)) {
            long m = m(i2) & 1048575;
            Unsafe unsafe = i;
            Object object = unsafe.getObject(obj2, m);
            if (object == null) {
                sc8.j(mue.d("Source subfield ", this.a[i2], " is present but null: ", obj2.toString()));
                return;
            }
            tgf o = o(i2);
            if (!u(i2, obj)) {
                if (h(object)) {
                    vef zzc = o.zzc();
                    o.d(zzc, object);
                    unsafe.putObject(obj, m, zzc);
                } else {
                    unsafe.putObject(obj, m, object);
                }
                s(i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, m);
            if (!h(object2)) {
                vef zzc2 = o.zzc();
                o.d(zzc2, object2);
                unsafe.putObject(obj, m, zzc2);
                object2 = zzc2;
            }
            o.d(object2, object);
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
                sc8.j(mue.d("Source subfield ", iArr[i2], " is present but null: ", obj2.toString()));
                return;
            }
            tgf o = o(i2);
            if (!i(i3, i2, obj)) {
                if (h(object)) {
                    vef zzc = o.zzc();
                    o.d(zzc, object);
                    unsafe.putObject(obj, m, zzc);
                } else {
                    unsafe.putObject(obj, m, object);
                }
                ghf.h(obj, iArr[i2 + 2] & 1048575, i3);
                return;
            }
            Object object2 = unsafe.getObject(obj, m);
            if (!h(object2)) {
                vef zzc2 = o.zzc();
                o.d(zzc2, object2);
                unsafe.putObject(obj, m, zzc2);
                object2 = zzc2;
            }
            o.d(object2, object);
        }
    }

    public final void s(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j = 1048575 & i3;
        if (j == 1048575) {
            return;
        }
        ghf.h(obj, j, ghf.e(obj, j) | (1 << (i3 >>> 20)));
    }

    public final boolean t(vef vefVar, vef vefVar2, int i2) {
        return u(i2, vefVar) == u(i2, vefVar2);
    }

    public final boolean u(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j = i3 & 1048575;
        if (j != 1048575) {
            return (ghf.e(obj, j) & (1 << (i3 >>> 20))) != 0;
        }
        int m = m(i2);
        long j2 = 1048575 & m;
        switch (l(m)) {
            case 0:
                if (Double.doubleToRawLongBits(ghf.c.k(obj, j2)) != 0) {
                }
                break;
            case 1:
                if (Float.floatToRawIntBits(ghf.c.p(obj, j2)) != 0) {
                }
                break;
            case 2:
                if (ghf.f(obj, j2) != 0) {
                }
                break;
            case 3:
                if (ghf.f(obj, j2) != 0) {
                }
                break;
            case 4:
                if (ghf.e(obj, j2) != 0) {
                }
                break;
            case 5:
                if (ghf.f(obj, j2) != 0) {
                }
                break;
            case 6:
                if (ghf.e(obj, j2) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object g = ghf.g(obj, j2);
                if (!(g instanceof String)) {
                    if (!(g instanceof xdf)) {
                        sc8.e();
                        break;
                    } else if (!xdf.c.equals(g)) {
                    }
                } else if (!((String) g).isEmpty()) {
                }
                break;
            case 9:
                if (ghf.g(obj, j2) != null) {
                }
                break;
            case 10:
                if (!xdf.c.equals(ghf.g(obj, j2))) {
                }
                break;
            case 11:
                if (ghf.e(obj, j2) != 0) {
                }
                break;
            case 12:
                if (ghf.e(obj, j2) != 0) {
                }
                break;
            case 13:
                if (ghf.e(obj, j2) != 0) {
                }
                break;
            case 14:
                if (ghf.f(obj, j2) != 0) {
                }
                break;
            case 15:
                if (ghf.e(obj, j2) != 0) {
                }
                break;
            case 16:
                if (ghf.f(obj, j2) != 0) {
                }
                break;
            case 17:
                if (ghf.g(obj, j2) != null) {
                }
                break;
            default:
                sc8.e();
                break;
        }
        return false;
    }

    public final boolean v(Object obj, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? u(i2, obj) : (i4 & i5) != 0;
    }

    @Override // tgf
    public final vef zzc() {
        return (vef) ((vef) this.c).h(4, null);
    }
}
