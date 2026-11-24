// default package

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mif implements uif {
    public static final int[] h = new int[0];
    public static final Unsafe i;
    public final int[] a;
    public final Object[] b;
    public final kff c;
    public final int[] d;
    public final int e;
    public final zhf f;
    public final ejf g;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new q2((byte) 7));
        } catch (Throwable unused) {
            unsafe = null;
        }
        i = unsafe;
    }

    public mif(int[] iArr, Object[] objArr, kff kffVar, int[] iArr2, int i2, zhf zhfVar, ejf ejfVar, pgf pgfVar) {
        this.a = iArr;
        this.b = objArr;
        this.d = iArr2;
        this.e = i2;
        this.f = zhfVar;
        this.g = ejfVar;
        this.c = kffVar;
    }

    public static boolean h(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof wgf) {
            return ((wgf) obj).g();
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
    public static mif j(tif tifVar, zhf zhfVar, ejf ejfVar, pgf pgfVar) {
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
        if (!(tifVar instanceof tif)) {
            rjb.p();
            return null;
        }
        String str2 = tifVar.b;
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
        Object[] objArr = tifVar.c;
        Class<?> cls = tifVar.a.getClass();
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
            int i69 = charAt20 & nm7.d4;
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
                        if (tifVar.a() == 1 || i71 != 0) {
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
                        if (tifVar.a() == 1 || i71 != 0) {
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
        return new mif(iArr2, objArr2, tifVar.a, iArr, i5, zhfVar, ejfVar, pgfVar);
    }

    public static int k(Object obj, long j) {
        return ((Integer) hjf.g(obj, j)).intValue();
    }

    public static int l(int i2) {
        return (i2 >>> 20) & nm7.d4;
    }

    public static long n(Object obj, long j) {
        return ((Long) hjf.g(obj, j)).longValue();
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
            StringBuilder m = mlb.m("Field ", str, " for ", name, " not found. Known fields are ");
            m.append(arrays);
            throw new RuntimeException(m.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        continue;
     */
    @Override // uif
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        if (!h(obj)) {
            return;
        }
        if (obj instanceof wgf) {
            wgf wgfVar = (wgf) obj;
            wgfVar.f();
            wgfVar.zza = 0;
            wgfVar.d();
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                this.g.getClass();
                djf djfVar = ((wgf) obj).zzc;
                if (djfVar.d) {
                    djfVar.d = false;
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
                            this.f.a(obj, j);
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j) == null) {
                                break;
                            } else {
                                rjb.p();
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

    @Override // uif
    public final boolean b(wgf wgfVar, wgf wgfVar2) {
        boolean e;
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 < iArr.length) {
                int m = m(i2);
                long j = m & 1048575;
                switch (l(m)) {
                    case 0:
                        if (!t(wgfVar, wgfVar2, i2)) {
                            break;
                        } else {
                            c8c c8cVar = hjf.c;
                            if (Double.doubleToLongBits(c8cVar.k(wgfVar, j)) != Double.doubleToLongBits(c8cVar.k(wgfVar2, j))) {
                                break;
                            } else {
                                continue;
                                i2 += 3;
                            }
                        }
                    case 1:
                        if (!t(wgfVar, wgfVar2, i2)) {
                            break;
                        } else {
                            c8c c8cVar2 = hjf.c;
                            if (Float.floatToIntBits(c8cVar2.p(wgfVar, j)) != Float.floatToIntBits(c8cVar2.p(wgfVar2, j))) {
                                break;
                            } else {
                                continue;
                                i2 += 3;
                            }
                        }
                    case 2:
                        if (t(wgfVar, wgfVar2, i2) && hjf.f(wgfVar, j) == hjf.f(wgfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 3:
                        if (t(wgfVar, wgfVar2, i2) && hjf.f(wgfVar, j) == hjf.f(wgfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 4:
                        if (t(wgfVar, wgfVar2, i2) && hjf.e(wgfVar, j) == hjf.e(wgfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 5:
                        if (t(wgfVar, wgfVar2, i2) && hjf.f(wgfVar, j) == hjf.f(wgfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 6:
                        if (t(wgfVar, wgfVar2, i2) && hjf.e(wgfVar, j) == hjf.e(wgfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 7:
                        if (!t(wgfVar, wgfVar2, i2)) {
                            break;
                        } else {
                            c8c c8cVar3 = hjf.c;
                            if (c8cVar3.x(wgfVar, j) != c8cVar3.x(wgfVar2, j)) {
                                break;
                            } else {
                                continue;
                                i2 += 3;
                            }
                        }
                    case 8:
                        if (t(wgfVar, wgfVar2, i2) && vif.e(hjf.g(wgfVar, j), hjf.g(wgfVar2, j))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 9:
                        if (t(wgfVar, wgfVar2, i2) && vif.e(hjf.g(wgfVar, j), hjf.g(wgfVar2, j))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 10:
                        if (t(wgfVar, wgfVar2, i2) && vif.e(hjf.g(wgfVar, j), hjf.g(wgfVar2, j))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 11:
                        if (t(wgfVar, wgfVar2, i2) && hjf.e(wgfVar, j) == hjf.e(wgfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 12:
                        if (t(wgfVar, wgfVar2, i2) && hjf.e(wgfVar, j) == hjf.e(wgfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 13:
                        if (t(wgfVar, wgfVar2, i2) && hjf.e(wgfVar, j) == hjf.e(wgfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 14:
                        if (t(wgfVar, wgfVar2, i2) && hjf.f(wgfVar, j) == hjf.f(wgfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 15:
                        if (t(wgfVar, wgfVar2, i2) && hjf.e(wgfVar, j) == hjf.e(wgfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 16:
                        if (t(wgfVar, wgfVar2, i2) && hjf.f(wgfVar, j) == hjf.f(wgfVar2, j)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 17:
                        if (t(wgfVar, wgfVar2, i2) && vif.e(hjf.g(wgfVar, j), hjf.g(wgfVar2, j))) {
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
                        e = vif.e(hjf.g(wgfVar, j), hjf.g(wgfVar2, j));
                        break;
                    case 50:
                        e = vif.e(hjf.g(wgfVar, j), hjf.g(wgfVar2, j));
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
                        long j2 = iArr[i2 + 2] & 1048575;
                        if (hjf.e(wgfVar, j2) == hjf.e(wgfVar2, j2) && vif.e(hjf.g(wgfVar, j), hjf.g(wgfVar2, j))) {
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
                if (wgfVar.zzc.equals(wgfVar2.zzc)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // uif
    public final void c(Object obj, Object obj2) {
        Object obj3;
        if (!h(obj)) {
            u36.j("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                vif.o(this.g, obj, obj2);
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
                        c8c c8cVar = hjf.c;
                        c8cVar.v(obj3, j, c8cVar.k(obj2, j));
                        s(i2, obj3);
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 1:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        c8c c8cVar2 = hjf.c;
                        c8cVar2.w(obj3, j, c8cVar2.p(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 2:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        hjf.c.a.putLong(obj3, j, hjf.f(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 3:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        hjf.c.a.putLong(obj3, j, hjf.f(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 4:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        hjf.h(obj3, j, hjf.e(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 5:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        hjf.c.a.putLong(obj3, j, hjf.f(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 6:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        hjf.h(obj3, j, hjf.e(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 7:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        c8c c8cVar3 = hjf.c;
                        c8cVar3.s(obj3, j, c8cVar3.x(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 8:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        hjf.i(obj3, j, hjf.g(obj2, j));
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
                        hjf.i(obj3, j, hjf.g(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 11:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        hjf.h(obj3, j, hjf.e(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 12:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        hjf.h(obj3, j, hjf.e(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 13:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        hjf.h(obj3, j, hjf.e(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 14:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        hjf.c.a.putLong(obj3, j, hjf.f(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 15:
                    obj3 = obj;
                    if (u(i2, obj2)) {
                        hjf.h(obj3, j, hjf.e(obj2, j));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                case 16:
                    if (u(i2, obj2)) {
                        obj3 = obj;
                        hjf.c.a.putLong(obj3, j, hjf.f(obj2, j));
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
                    this.f.b(obj, j, obj2);
                    break;
                case 50:
                    Class cls = vif.a;
                    Object g = hjf.g(obj, j);
                    Object g2 = hjf.g(obj2, j);
                    if (g != null) {
                        rjb.p();
                        return;
                    } else {
                        g2.getClass();
                        rjb.p();
                        return;
                    }
                case nm7.n0 /* 51 */:
                case nm7.o0 /* 52 */:
                case nm7.p0 /* 53 */:
                case nm7.q0 /* 54 */:
                case nm7.r0 /* 55 */:
                case 56:
                case nm7.t0 /* 57 */:
                case nm7.u0 /* 58 */:
                case nm7.v0 /* 59 */:
                    if (i(i4, i2, obj2)) {
                        hjf.i(obj, j, hjf.g(obj2, j));
                        hjf.h(obj, iArr[i2 + 2] & 1048575, i4);
                        break;
                    }
                    break;
                case nm7.w0 /* 60 */:
                    r(i2, obj, obj2);
                    break;
                case nm7.x0 /* 61 */:
                case nm7.y0 /* 62 */:
                case nm7.z0 /* 63 */:
                case 64:
                case 65:
                case nm7.C0 /* 66 */:
                case nm7.D0 /* 67 */:
                    if (i(i4, i2, obj2)) {
                        hjf.i(obj, j, hjf.g(obj2, j));
                        hjf.h(obj, iArr[i2 + 2] & 1048575, i4);
                        break;
                    }
                    break;
                case nm7.E0 /* 68 */:
                    r(i2, obj, obj2);
                    break;
            }
            obj3 = obj;
            i2 += 3;
            obj = obj3;
        }
    }

    @Override // uif
    public final void d(Object obj, hoe hoeVar) {
        int i2;
        mif mifVar = this;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (true) {
            int[] iArr = mifVar.a;
            if (i4 >= iArr.length) {
                mifVar.g.getClass();
                djf djfVar = ((wgf) obj).zzc;
                return;
            }
            int m = mifVar.m(i4);
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
                    if (mifVar.v(obj, i4, i6, i5, i2)) {
                        ((igf) hoeVar.a).f(i7, Double.doubleToRawLongBits(hjf.c.k(obj, j)));
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 1:
                    if (mifVar.v(obj, i4, i6, i5, i2)) {
                        ((igf) hoeVar.a).d(i7, Float.floatToRawIntBits(hjf.c.p(obj, j)));
                        break;
                    }
                    break;
                case 2:
                    if (mifVar.v(obj, i4, i6, i5, i2)) {
                        ((igf) hoeVar.a).k(i7, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 3:
                    if (mifVar.v(obj, i4, i6, i5, i2)) {
                        ((igf) hoeVar.a).k(i7, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 4:
                    if (mifVar.v(obj, i4, i6, i5, i2)) {
                        int i10 = unsafe.getInt(obj, j);
                        igf igfVar = (igf) hoeVar.a;
                        igfVar.j(i7 << 3);
                        if (i10 >= 0) {
                            igfVar.j(i10);
                            break;
                        } else {
                            igfVar.l(i10);
                            break;
                        }
                    }
                    break;
                case 5:
                    if (mifVar.v(obj, i4, i6, i5, i2)) {
                        ((igf) hoeVar.a).f(i7, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 6:
                    if (mifVar.v(obj, i4, i6, i5, i2)) {
                        ((igf) hoeVar.a).d(i7, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 7:
                    if (mifVar.v(obj, i4, i6, i5, i2)) {
                        boolean x = hjf.c.x(obj, j);
                        igf igfVar2 = (igf) hoeVar.a;
                        igfVar2.j(i7 << 3);
                        igfVar2.a(x ? (byte) 1 : (byte) 0);
                        break;
                    }
                    break;
                case 8:
                    if (mifVar.v(obj, i4, i6, i5, i2)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((igf) hoeVar.a).h(i7, (String) object);
                            break;
                        } else {
                            ((igf) hoeVar.a).c(i7, (yff) object);
                            break;
                        }
                    }
                    break;
                case 9:
                    if (mifVar.v(obj, i4, i6, i5, i2)) {
                        hoeVar.b(i7, unsafe.getObject(obj, j), mifVar.o(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 10:
                    if (mifVar.v(obj, i4, i6, i5, i2)) {
                        ((igf) hoeVar.a).c(i7, (yff) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 11:
                    if (mifVar.v(obj, i4, i6, i5, i2)) {
                        int i11 = unsafe.getInt(obj, j);
                        igf igfVar3 = (igf) hoeVar.a;
                        igfVar3.j(i7 << 3);
                        igfVar3.j(i11);
                        break;
                    }
                    break;
                case 12:
                    if (mifVar.v(obj, i4, i6, i5, i2)) {
                        int i12 = unsafe.getInt(obj, j);
                        igf igfVar4 = (igf) hoeVar.a;
                        igfVar4.j(i7 << 3);
                        if (i12 >= 0) {
                            igfVar4.j(i12);
                            break;
                        } else {
                            igfVar4.l(i12);
                            break;
                        }
                    }
                    break;
                case 13:
                    if (mifVar.v(obj, i4, i6, i5, i2)) {
                        ((igf) hoeVar.a).d(i7, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 14:
                    if (mifVar.v(obj, i4, i6, i5, i2)) {
                        ((igf) hoeVar.a).f(i7, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 15:
                    if (mifVar.v(obj, i4, i6, i5, i2)) {
                        int i13 = unsafe.getInt(obj, j);
                        int i14 = (i13 << 1) ^ (i13 >> 31);
                        igf igfVar5 = (igf) hoeVar.a;
                        igfVar5.j(i7 << 3);
                        igfVar5.j(i14);
                        break;
                    }
                    break;
                case 16:
                    if (mifVar.v(obj, i4, i6, i5, i2)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((igf) hoeVar.a).k(i7, (j2 << 1) ^ (j2 >> 63));
                        break;
                    }
                    break;
                case 17:
                    if (mifVar.v(obj, i4, i6, i5, i2)) {
                        hoeVar.a(i7, unsafe.getObject(obj, j), mifVar.o(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 18:
                    vif.q(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 19:
                    vif.u(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 20:
                    vif.w(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 21:
                    vif.d(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 22:
                    vif.v(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 23:
                    vif.t(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 24:
                    vif.s(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 25:
                    vif.p(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 26:
                    int i15 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = vif.a;
                    if (list == null) {
                        continue;
                    } else if (!list.isEmpty()) {
                        igf igfVar6 = (igf) hoeVar.a;
                        if (list instanceof thf) {
                            thf thfVar = (thf) list;
                            for (int i16 = 0; i16 < list.size(); i16++) {
                                Object b = thfVar.b(i16);
                                if (b instanceof String) {
                                    igfVar6.h(i15, (String) b);
                                } else {
                                    igfVar6.c(i15, (yff) b);
                                }
                            }
                        } else {
                            for (int i17 = 0; i17 < list.size(); i17++) {
                                igfVar6.h(i15, (String) list.get(i17));
                            }
                        }
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 27:
                    int i18 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    uif o = mifVar.o(i4);
                    Class cls2 = vif.a;
                    if (list2 == null) {
                        continue;
                    } else if (!list2.isEmpty()) {
                        for (int i19 = 0; i19 < list2.size(); i19++) {
                            hoeVar.b(i18, list2.get(i19), o);
                        }
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 28:
                    int i20 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = vif.a;
                    if (list3 == null) {
                        continue;
                    } else if (!list3.isEmpty()) {
                        hoeVar.getClass();
                        for (int i21 = 0; i21 < list3.size(); i21++) {
                            ((igf) hoeVar.a).c(i20, (yff) list3.get(i21));
                        }
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 29:
                    vif.c(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case nm7.S /* 30 */:
                    vif.r(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 31:
                    vif.x(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 32:
                    vif.y(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 33:
                    vif.a(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 34:
                    vif.b(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 35:
                    vif.q(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 36:
                    vif.u(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 37:
                    vif.w(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 38:
                    vif.d(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 39:
                    vif.v(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 40:
                    vif.t(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 41:
                    vif.s(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 42:
                    vif.p(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 43:
                    vif.c(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 44:
                    vif.r(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 45:
                    vif.x(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 46:
                    vif.y(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 47:
                    vif.a(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 48:
                    vif.b(iArr[i4], (List) unsafe.getObject(obj, j), hoeVar, true);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 49:
                    int i22 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    uif o2 = mifVar.o(i4);
                    Class cls4 = vif.a;
                    if (list4 == null) {
                        continue;
                    } else if (!list4.isEmpty()) {
                        for (int i23 = 0; i23 < list4.size(); i23++) {
                            hoeVar.a(i22, list4.get(i23), o2);
                        }
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        mifVar.b[(i4 / 3) << 1].getClass();
                        rjb.p();
                        return;
                    } else {
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    }
                case nm7.n0 /* 51 */:
                    if (mifVar.i(i7, i4, obj)) {
                        ((igf) hoeVar.a).f(i7, Double.doubleToRawLongBits(((Double) hjf.g(obj, j)).doubleValue()));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case nm7.o0 /* 52 */:
                    if (mifVar.i(i7, i4, obj)) {
                        ((igf) hoeVar.a).d(i7, Float.floatToRawIntBits(((Float) hjf.g(obj, j)).floatValue()));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case nm7.p0 /* 53 */:
                    if (mifVar.i(i7, i4, obj)) {
                        ((igf) hoeVar.a).k(i7, n(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case nm7.q0 /* 54 */:
                    if (mifVar.i(i7, i4, obj)) {
                        ((igf) hoeVar.a).k(i7, n(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case nm7.r0 /* 55 */:
                    if (mifVar.i(i7, i4, obj)) {
                        int k = k(obj, j);
                        igf igfVar7 = (igf) hoeVar.a;
                        igfVar7.j(i7 << 3);
                        if (k >= 0) {
                            igfVar7.j(k);
                        } else {
                            igfVar7.l(k);
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 56:
                    if (mifVar.i(i7, i4, obj)) {
                        ((igf) hoeVar.a).f(i7, n(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case nm7.t0 /* 57 */:
                    if (mifVar.i(i7, i4, obj)) {
                        ((igf) hoeVar.a).d(i7, k(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case nm7.u0 /* 58 */:
                    if (mifVar.i(i7, i4, obj)) {
                        boolean booleanValue = ((Boolean) hjf.g(obj, j)).booleanValue();
                        igf igfVar8 = (igf) hoeVar.a;
                        igfVar8.j(i7 << 3);
                        igfVar8.a(booleanValue ? (byte) 1 : (byte) 0);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case nm7.v0 /* 59 */:
                    if (mifVar.i(i7, i4, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            ((igf) hoeVar.a).h(i7, (String) object2);
                        } else {
                            ((igf) hoeVar.a).c(i7, (yff) object2);
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case nm7.w0 /* 60 */:
                    if (mifVar.i(i7, i4, obj)) {
                        hoeVar.b(i7, unsafe.getObject(obj, j), mifVar.o(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case nm7.x0 /* 61 */:
                    if (mifVar.i(i7, i4, obj)) {
                        ((igf) hoeVar.a).c(i7, (yff) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case nm7.y0 /* 62 */:
                    if (mifVar.i(i7, i4, obj)) {
                        int k2 = k(obj, j);
                        igf igfVar9 = (igf) hoeVar.a;
                        igfVar9.j(i7 << 3);
                        igfVar9.j(k2);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case nm7.z0 /* 63 */:
                    if (mifVar.i(i7, i4, obj)) {
                        int k3 = k(obj, j);
                        igf igfVar10 = (igf) hoeVar.a;
                        igfVar10.j(i7 << 3);
                        if (k3 >= 0) {
                            igfVar10.j(k3);
                        } else {
                            igfVar10.l(k3);
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 64:
                    if (mifVar.i(i7, i4, obj)) {
                        ((igf) hoeVar.a).d(i7, k(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 65:
                    if (mifVar.i(i7, i4, obj)) {
                        ((igf) hoeVar.a).f(i7, n(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case nm7.C0 /* 66 */:
                    if (mifVar.i(i7, i4, obj)) {
                        int k4 = k(obj, j);
                        int i24 = (k4 << 1) ^ (k4 >> 31);
                        igf igfVar11 = (igf) hoeVar.a;
                        igfVar11.j(i7 << 3);
                        igfVar11.j(i24);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case nm7.D0 /* 67 */:
                    if (mifVar.i(i7, i4, obj)) {
                        long n = n(obj, j);
                        ((igf) hoeVar.a).k(i7, (n << 1) ^ (n >> 63));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case nm7.E0 /* 68 */:
                    if (mifVar.i(i7, i4, obj)) {
                        hoeVar.a(i7, unsafe.getObject(obj, j), mifVar.o(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                default:
                    i4 += 3;
                    i3 = 1048575;
            }
            mifVar = this;
            i4 += 3;
            i3 = 1048575;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:258:0x05a3, code lost:
    
        if (r0.v(r1, r2, r3, r4, r5) != false) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0655, code lost:
    
        r8 = mle.g(r12 << 3, 8, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x05ab, code lost:
    
        if (r0.v(r1, r2, r3, r4, r5) != false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0698, code lost:
    
        r8 = mle.g(r12 << 3, 4, r8);
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
    @Override // uif
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(wgf wgfVar) {
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
        mif mifVar = this;
        wgf wgfVar2 = wgfVar;
        int i7 = 1048575;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = mifVar.a;
            if (i9 >= iArr.length) {
                mifVar.g.getClass();
                djf djfVar = wgfVar2.zzc;
                int i12 = djfVar.c;
                if (i12 == -1) {
                    djfVar.c = 0;
                    i2 = 0;
                } else {
                    i2 = i12;
                }
                return i2 + i11;
            }
            int m = mifVar.m(i9);
            int l = l(m);
            int i13 = iArr[i9];
            int i14 = iArr[i9 + 2];
            int i15 = i14 & i7;
            Unsafe unsafe = i;
            if (l <= 17) {
                if (i15 != i8) {
                    i10 = i15 == i7 ? 0 : unsafe.getInt(wgfVar2, i15);
                    i8 = i15;
                }
                i3 = 1 << (i14 >>> 20);
            } else {
                i3 = 0;
            }
            int i16 = m & i7;
            if (l >= sgf.b.a) {
                byte b = sgf.c.a;
            }
            long j2 = i16;
            switch (l) {
                case 0:
                    if (!mifVar.v(wgfVar2, i9, i8, i10, i3)) {
                        i9 += 3;
                        i7 = 1048575;
                    }
                    i11 = mle.g(i13 << 3, 8, i11);
                    i9 += 3;
                    i7 = 1048575;
                case 1:
                    break;
                case 2:
                    if (mifVar.v(wgfVar2, i9, i8, i10, i3)) {
                        i4 = i13 << 3;
                        p = igf.p(unsafe.getLong(wgfVar2, j2));
                        i11 = mle.g(i4, p, i11);
                    }
                    mifVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 3:
                    if (mifVar.v(wgfVar2, i9, i8, i10, i3)) {
                        i4 = i13 << 3;
                        p = igf.p(unsafe.getLong(wgfVar2, j2));
                        i11 = mle.g(i4, p, i11);
                    }
                    mifVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 4:
                    if (mifVar.v(wgfVar2, i9, i8, i10, i3)) {
                        i4 = i13 << 3;
                        p = igf.m(unsafe.getInt(wgfVar2, j2));
                        i11 = mle.g(i4, p, i11);
                    }
                    mifVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    if (mifVar.v(wgfVar2, i9, i8, i10, i3)) {
                        i11 = mle.g(i13 << 3, 1, i11);
                    }
                    mifVar = this;
                    wgfVar2 = wgfVar;
                    i9 += 3;
                    i7 = 1048575;
                case 8:
                    if (mifVar.v(wgfVar2, i9, i8, i10, i3)) {
                        i4 = i13 << 3;
                        Object object = unsafe.getObject(wgfVar2, j2);
                        if (object instanceof yff) {
                            Logger logger = igf.e;
                            j = ((yff) object).j();
                            o = igf.o(j);
                            i11 = mle.g(i4, o + j, i11);
                        } else {
                            p = igf.n((String) object);
                            i11 = mle.g(i4, p, i11);
                        }
                    }
                    mifVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 9:
                    if (mifVar.v(wgfVar2, i9, i8, i10, i3)) {
                        Object object2 = unsafe.getObject(wgfVar2, j2);
                        uif o9 = mifVar.o(i9);
                        Class cls = vif.a;
                        i5 = i13 << 3;
                        Logger logger2 = igf.e;
                        a = ((kff) object2).a(o9);
                        o2 = igf.o(a);
                        i11 = mle.g(i5, o2 + a, i11);
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 10:
                    if (mifVar.v(wgfVar2, i9, i8, i10, i3)) {
                        i4 = i13 << 3;
                        yff yffVar = (yff) unsafe.getObject(wgfVar2, j2);
                        Logger logger3 = igf.e;
                        j = yffVar.j();
                        o = igf.o(j);
                        i11 = mle.g(i4, o + j, i11);
                    }
                    mifVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 11:
                    if (mifVar.v(wgfVar2, i9, i8, i10, i3)) {
                        i4 = i13 << 3;
                        p = igf.o(unsafe.getInt(wgfVar2, j2));
                        i11 = mle.g(i4, p, i11);
                    }
                    mifVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 12:
                    if (mifVar.v(wgfVar2, i9, i8, i10, i3)) {
                        i4 = i13 << 3;
                        p = igf.m(unsafe.getInt(wgfVar2, j2));
                        i11 = mle.g(i4, p, i11);
                    }
                    mifVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    if (mifVar.v(wgfVar2, i9, i8, i10, i3)) {
                        int i17 = unsafe.getInt(wgfVar2, j2);
                        i11 = mle.g((i17 << 1) ^ (i17 >> 31), igf.o(i13 << 3), i11);
                    }
                    mifVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 16:
                    if (mifVar.v(wgfVar2, i9, i8, i10, i3)) {
                        long j3 = unsafe.getLong(wgfVar2, j2);
                        i11 += igf.p((j3 << 1) ^ (j3 >> 63)) + igf.o(i13 << 3);
                    }
                    mifVar = this;
                    i9 += 3;
                    i7 = 1048575;
                case 17:
                    if (mifVar.v(wgfVar2, i9, i8, i10, i3)) {
                        kff kffVar = (kff) unsafe.getObject(wgfVar2, j2);
                        uif o10 = mifVar.o(i9);
                        Logger logger4 = igf.e;
                        a2 = kffVar.a(o10);
                        o3 = igf.o(i13 << 3);
                        i11 += (o3 << 1) + a2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 18:
                    h2 = vif.h(i13, (List) unsafe.getObject(wgfVar2, j2));
                    i11 += h2;
                    i9 += 3;
                    i7 = 1048575;
                case 19:
                    h2 = vif.g(i13, (List) unsafe.getObject(wgfVar2, j2));
                    i11 += h2;
                    i9 += 3;
                    i7 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(wgfVar2, j2);
                    Class cls2 = vif.a;
                    if (list.size() != 0) {
                        o4 = (igf.o(i13 << 3) * list.size()) + vif.j(list);
                        i11 += o4;
                        i9 += 3;
                        i7 = 1048575;
                    }
                    o4 = 0;
                    i11 += o4;
                    i9 += 3;
                    i7 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(wgfVar2, j2);
                    Class cls3 = vif.a;
                    size = list2.size();
                    if (size != 0) {
                        n = vif.n(list2);
                        o5 = igf.o(i13 << 3);
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
                    List list3 = (List) unsafe.getObject(wgfVar2, j2);
                    Class cls4 = vif.a;
                    size = list3.size();
                    if (size != 0) {
                        n = vif.i(list3);
                        o5 = igf.o(i13 << 3);
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
                    h2 = vif.h(i13, (List) unsafe.getObject(wgfVar2, j2));
                    i11 += h2;
                    i9 += 3;
                    i7 = 1048575;
                case 24:
                    h2 = vif.g(i13, (List) unsafe.getObject(wgfVar2, j2));
                    i11 += h2;
                    i9 += 3;
                    i7 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(wgfVar2, j2);
                    Class cls5 = vif.a;
                    int size3 = list4.size();
                    i11 += size3 == 0 ? 0 : (igf.o(i13 << 3) + 1) * size3;
                    i9 += 3;
                    i7 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(wgfVar2, j2);
                    Class cls6 = vif.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        boolean z = list5 instanceof thf;
                        o6 = igf.o(i13 << 3) * size4;
                        if (z) {
                            thf thfVar = (thf) list5;
                            for (int i18 = 0; i18 < size4; i18++) {
                                Object b2 = thfVar.b(i18);
                                if (b2 instanceof yff) {
                                    int j4 = ((yff) b2).j();
                                    o6 = mle.g(j4, j4, o6);
                                } else {
                                    o6 = igf.n((String) b2) + o6;
                                }
                            }
                        } else {
                            for (int i19 = 0; i19 < size4; i19++) {
                                Object obj = list5.get(i19);
                                if (obj instanceof yff) {
                                    int j5 = ((yff) obj).j();
                                    o6 = mle.g(j5, j5, o6);
                                } else {
                                    o6 = igf.n((String) obj) + o6;
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
                    List list6 = (List) unsafe.getObject(wgfVar2, j2);
                    uif o11 = mifVar.o(i9);
                    Class cls7 = vif.a;
                    int size5 = list6.size();
                    if (size5 != 0) {
                        o6 = igf.o(i13 << 3) * size5;
                        for (int i20 = 0; i20 < size5; i20++) {
                            int a3 = ((kff) list6.get(i20)).a(o11);
                            o6 = mle.g(a3, a3, o6);
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
                    List list7 = (List) unsafe.getObject(wgfVar2, j2);
                    Class cls8 = vif.a;
                    int size6 = list7.size();
                    if (size6 != 0) {
                        o4 = igf.o(i13 << 3) * size6;
                        for (int i21 = 0; i21 < list7.size(); i21++) {
                            int j6 = ((yff) list7.get(i21)).j();
                            o4 = mle.g(j6, j6, o4);
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
                    List list8 = (List) unsafe.getObject(wgfVar2, j2);
                    Class cls9 = vif.a;
                    size = list8.size();
                    if (size != 0) {
                        n = vif.m(list8);
                        o5 = igf.o(i13 << 3);
                        o4 = (o5 * size) + n;
                        i11 += o4;
                        i9 += 3;
                        i7 = 1048575;
                    }
                    o4 = 0;
                    i11 += o4;
                    i9 += 3;
                    i7 = 1048575;
                case nm7.S /* 30 */:
                    List list9 = (List) unsafe.getObject(wgfVar2, j2);
                    Class cls10 = vif.a;
                    size = list9.size();
                    if (size != 0) {
                        n = vif.f(list9);
                        o5 = igf.o(i13 << 3);
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
                    h2 = vif.g(i13, (List) unsafe.getObject(wgfVar2, j2));
                    i11 += h2;
                    i9 += 3;
                    i7 = 1048575;
                case 32:
                    h2 = vif.h(i13, (List) unsafe.getObject(wgfVar2, j2));
                    i11 += h2;
                    i9 += 3;
                    i7 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(wgfVar2, j2);
                    Class cls11 = vif.a;
                    size = list10.size();
                    if (size != 0) {
                        n = vif.k(list10);
                        o5 = igf.o(i13 << 3);
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
                    List list11 = (List) unsafe.getObject(wgfVar2, j2);
                    Class cls12 = vif.a;
                    size = list11.size();
                    if (size != 0) {
                        n = vif.l(list11);
                        o5 = igf.o(i13 << 3);
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
                    List list12 = (List) unsafe.getObject(wgfVar2, j2);
                    Class cls13 = vif.a;
                    size2 = list12.size() << 3;
                    if (size2 > 0) {
                        o7 = igf.o(size2);
                        o8 = igf.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(wgfVar2, j2);
                    Class cls14 = vif.a;
                    size2 = list13.size() << 2;
                    if (size2 > 0) {
                        o7 = igf.o(size2);
                        o8 = igf.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 37:
                    size2 = vif.j((List) unsafe.getObject(wgfVar2, j2));
                    if (size2 > 0) {
                        o7 = igf.o(size2);
                        o8 = igf.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 38:
                    size2 = vif.n((List) unsafe.getObject(wgfVar2, j2));
                    if (size2 > 0) {
                        o7 = igf.o(size2);
                        o8 = igf.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 39:
                    size2 = vif.i((List) unsafe.getObject(wgfVar2, j2));
                    if (size2 > 0) {
                        o7 = igf.o(size2);
                        o8 = igf.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(wgfVar2, j2);
                    Class cls15 = vif.a;
                    size2 = list14.size() << 3;
                    if (size2 > 0) {
                        o7 = igf.o(size2);
                        o8 = igf.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(wgfVar2, j2);
                    Class cls16 = vif.a;
                    size2 = list15.size() << 2;
                    if (size2 > 0) {
                        o7 = igf.o(size2);
                        o8 = igf.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(wgfVar2, j2);
                    Class cls17 = vif.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        o7 = igf.o(size2);
                        o8 = igf.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 43:
                    size2 = vif.m((List) unsafe.getObject(wgfVar2, j2));
                    if (size2 > 0) {
                        o7 = igf.o(size2);
                        o8 = igf.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 44:
                    size2 = vif.f((List) unsafe.getObject(wgfVar2, j2));
                    if (size2 > 0) {
                        o7 = igf.o(size2);
                        o8 = igf.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(wgfVar2, j2);
                    Class cls18 = vif.a;
                    size2 = list17.size() << 2;
                    if (size2 > 0) {
                        o7 = igf.o(size2);
                        o8 = igf.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(wgfVar2, j2);
                    Class cls19 = vif.a;
                    size2 = list18.size() << 3;
                    if (size2 > 0) {
                        o7 = igf.o(size2);
                        o8 = igf.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 47:
                    size2 = vif.k((List) unsafe.getObject(wgfVar2, j2));
                    if (size2 > 0) {
                        o7 = igf.o(size2);
                        o8 = igf.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 48:
                    size2 = vif.l((List) unsafe.getObject(wgfVar2, j2));
                    if (size2 > 0) {
                        o7 = igf.o(size2);
                        o8 = igf.o(i13 << 3);
                        i11 += o8 + o7 + size2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(wgfVar2, j2);
                    uif o12 = mifVar.o(i9);
                    Class cls20 = vif.a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        i6 = 0;
                    } else {
                        i6 = 0;
                        for (int i22 = 0; i22 < size7; i22++) {
                            kff kffVar2 = (kff) list19.get(i22);
                            Logger logger5 = igf.e;
                            i6 += (igf.o(i13 << 3) << 1) + kffVar2.a(o12);
                        }
                    }
                    i11 += i6;
                    i9 += 3;
                    i7 = 1048575;
                case 50:
                    Object object3 = unsafe.getObject(wgfVar2, j2);
                    Object obj2 = mifVar.b[(i9 / 3) << 1];
                    if (object3 == null) {
                        obj2.getClass();
                        rjb.p();
                        break;
                    } else {
                        rjb.p();
                        break;
                    }
                case nm7.n0 /* 51 */:
                    if (!mifVar.i(i13, i9, wgfVar2)) {
                        i9 += 3;
                        i7 = 1048575;
                    }
                    i11 = mle.g(i13 << 3, 8, i11);
                    i9 += 3;
                    i7 = 1048575;
                case nm7.o0 /* 52 */:
                    if (!mifVar.i(i13, i9, wgfVar2)) {
                        i9 += 3;
                        i7 = 1048575;
                    }
                    i11 = mle.g(i13 << 3, 4, i11);
                    i9 += 3;
                    i7 = 1048575;
                case nm7.p0 /* 53 */:
                    if (mifVar.i(i13, i9, wgfVar2)) {
                        i5 = i13 << 3;
                        p2 = igf.p(n(wgfVar2, j2));
                        i11 = mle.g(i5, p2, i11);
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case nm7.q0 /* 54 */:
                    if (mifVar.i(i13, i9, wgfVar2)) {
                        i5 = i13 << 3;
                        p2 = igf.p(n(wgfVar2, j2));
                        i11 = mle.g(i5, p2, i11);
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case nm7.r0 /* 55 */:
                    if (mifVar.i(i13, i9, wgfVar2)) {
                        i5 = i13 << 3;
                        p2 = igf.m(k(wgfVar2, j2));
                        i11 = mle.g(i5, p2, i11);
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 56:
                    if (!mifVar.i(i13, i9, wgfVar2)) {
                        i9 += 3;
                        i7 = 1048575;
                    }
                    i11 = mle.g(i13 << 3, 8, i11);
                    i9 += 3;
                    i7 = 1048575;
                case nm7.t0 /* 57 */:
                    if (!mifVar.i(i13, i9, wgfVar2)) {
                        i9 += 3;
                        i7 = 1048575;
                    }
                    i11 = mle.g(i13 << 3, 4, i11);
                    i9 += 3;
                    i7 = 1048575;
                case nm7.u0 /* 58 */:
                    if (mifVar.i(i13, i9, wgfVar2)) {
                        i11 = mle.g(i13 << 3, 1, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                case nm7.v0 /* 59 */:
                    if (mifVar.i(i13, i9, wgfVar2)) {
                        i5 = i13 << 3;
                        Object object4 = unsafe.getObject(wgfVar2, j2);
                        if (object4 instanceof yff) {
                            Logger logger6 = igf.e;
                            a = ((yff) object4).j();
                            o2 = igf.o(a);
                            i11 = mle.g(i5, o2 + a, i11);
                            i9 += 3;
                            i7 = 1048575;
                        } else {
                            p2 = igf.n((String) object4);
                            i11 = mle.g(i5, p2, i11);
                            i9 += 3;
                            i7 = 1048575;
                        }
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case nm7.w0 /* 60 */:
                    if (mifVar.i(i13, i9, wgfVar2)) {
                        Object object5 = unsafe.getObject(wgfVar2, j2);
                        uif o13 = mifVar.o(i9);
                        Class cls21 = vif.a;
                        i5 = i13 << 3;
                        Logger logger7 = igf.e;
                        a = ((kff) object5).a(o13);
                        o2 = igf.o(a);
                        i11 = mle.g(i5, o2 + a, i11);
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case nm7.x0 /* 61 */:
                    if (mifVar.i(i13, i9, wgfVar2)) {
                        i5 = i13 << 3;
                        yff yffVar2 = (yff) unsafe.getObject(wgfVar2, j2);
                        Logger logger8 = igf.e;
                        a = yffVar2.j();
                        o2 = igf.o(a);
                        i11 = mle.g(i5, o2 + a, i11);
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case nm7.y0 /* 62 */:
                    if (mifVar.i(i13, i9, wgfVar2)) {
                        i5 = i13 << 3;
                        p2 = igf.o(k(wgfVar2, j2));
                        i11 = mle.g(i5, p2, i11);
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case nm7.z0 /* 63 */:
                    if (mifVar.i(i13, i9, wgfVar2)) {
                        i5 = i13 << 3;
                        p2 = igf.m(k(wgfVar2, j2));
                        i11 = mle.g(i5, p2, i11);
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 64:
                    if (!mifVar.i(i13, i9, wgfVar2)) {
                        i9 += 3;
                        i7 = 1048575;
                    }
                    i11 = mle.g(i13 << 3, 4, i11);
                    i9 += 3;
                    i7 = 1048575;
                case 65:
                    if (!mifVar.i(i13, i9, wgfVar2)) {
                        i9 += 3;
                        i7 = 1048575;
                    }
                    i11 = mle.g(i13 << 3, 8, i11);
                    i9 += 3;
                    i7 = 1048575;
                case nm7.C0 /* 66 */:
                    if (mifVar.i(i13, i9, wgfVar2)) {
                        int k = k(wgfVar2, j2);
                        i11 = mle.g((k << 1) ^ (k >> 31), igf.o(i13 << 3), i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                case nm7.D0 /* 67 */:
                    if (mifVar.i(i13, i9, wgfVar2)) {
                        long n2 = n(wgfVar2, j2);
                        h2 = igf.p((n2 << 1) ^ (n2 >> 63)) + igf.o(i13 << 3);
                        i11 += h2;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case nm7.E0 /* 68 */:
                    if (mifVar.i(i13, i9, wgfVar2)) {
                        kff kffVar3 = (kff) unsafe.getObject(wgfVar2, j2);
                        uif o14 = mifVar.o(i9);
                        Logger logger9 = igf.e;
                        a2 = kffVar3.a(o14);
                        o3 = igf.o(i13 << 3);
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
    @Override // uif
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(wgf wgfVar) {
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
                wgfVar.zzc.getClass();
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
                    doubleToLongBits = Double.doubleToLongBits(hjf.c.k(wgfVar, j));
                    Charset charset = fhf.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i3 = i7 * 53;
                    floatToIntBits = Float.floatToIntBits(hjf.c.p(wgfVar, j));
                    i7 = floatToIntBits + i3;
                    break;
                case 2:
                    i2 = i7 * 53;
                    doubleToLongBits = hjf.f(wgfVar, j);
                    Charset charset2 = fhf.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i2 = i7 * 53;
                    doubleToLongBits = hjf.f(wgfVar, j);
                    Charset charset3 = fhf.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i3 = i7 * 53;
                    floatToIntBits = hjf.e(wgfVar, j);
                    i7 = floatToIntBits + i3;
                    break;
                case 5:
                    i2 = i7 * 53;
                    doubleToLongBits = hjf.f(wgfVar, j);
                    Charset charset4 = fhf.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i3 = i7 * 53;
                    floatToIntBits = hjf.e(wgfVar, j);
                    i7 = floatToIntBits + i3;
                    break;
                case 7:
                    i4 = i7 * 53;
                    boolean x = hjf.c.x(wgfVar, j);
                    Charset charset5 = fhf.a;
                    break;
                case 8:
                    i3 = i7 * 53;
                    floatToIntBits = ((String) hjf.g(wgfVar, j)).hashCode();
                    i7 = floatToIntBits + i3;
                    break;
                case 9:
                    i5 = i7 * 53;
                    Object g = hjf.g(wgfVar, j);
                    if (g != null) {
                        i11 = g.hashCode();
                    }
                    i7 = i5 + i11;
                    break;
                case 10:
                    i3 = i7 * 53;
                    floatToIntBits = hjf.g(wgfVar, j).hashCode();
                    i7 = floatToIntBits + i3;
                    break;
                case 11:
                    i3 = i7 * 53;
                    floatToIntBits = hjf.e(wgfVar, j);
                    i7 = floatToIntBits + i3;
                    break;
                case 12:
                    i3 = i7 * 53;
                    floatToIntBits = hjf.e(wgfVar, j);
                    i7 = floatToIntBits + i3;
                    break;
                case 13:
                    i3 = i7 * 53;
                    floatToIntBits = hjf.e(wgfVar, j);
                    i7 = floatToIntBits + i3;
                    break;
                case 14:
                    i2 = i7 * 53;
                    doubleToLongBits = hjf.f(wgfVar, j);
                    Charset charset6 = fhf.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i3 = i7 * 53;
                    floatToIntBits = hjf.e(wgfVar, j);
                    i7 = floatToIntBits + i3;
                    break;
                case 16:
                    i2 = i7 * 53;
                    doubleToLongBits = hjf.f(wgfVar, j);
                    Charset charset7 = fhf.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i5 = i7 * 53;
                    Object g2 = hjf.g(wgfVar, j);
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
                    i3 = i7 * 53;
                    floatToIntBits = hjf.g(wgfVar, j).hashCode();
                    i7 = floatToIntBits + i3;
                    break;
                case 50:
                    i3 = i7 * 53;
                    floatToIntBits = hjf.g(wgfVar, j).hashCode();
                    i7 = floatToIntBits + i3;
                    break;
                case nm7.n0 /* 51 */:
                    if (!i(i9, i6, wgfVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) hjf.g(wgfVar, j)).doubleValue());
                        Charset charset8 = fhf.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case nm7.o0 /* 52 */:
                    if (!i(i9, i6, wgfVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) hjf.g(wgfVar, j)).floatValue());
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case nm7.p0 /* 53 */:
                    if (!i(i9, i6, wgfVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = n(wgfVar, j);
                        Charset charset9 = fhf.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case nm7.q0 /* 54 */:
                    if (!i(i9, i6, wgfVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = n(wgfVar, j);
                        Charset charset10 = fhf.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case nm7.r0 /* 55 */:
                    if (!i(i9, i6, wgfVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = k(wgfVar, j);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 56:
                    if (!i(i9, i6, wgfVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = n(wgfVar, j);
                        Charset charset11 = fhf.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case nm7.t0 /* 57 */:
                    if (!i(i9, i6, wgfVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = k(wgfVar, j);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case nm7.u0 /* 58 */:
                    if (!i(i9, i6, wgfVar)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        boolean booleanValue = ((Boolean) hjf.g(wgfVar, j)).booleanValue();
                        Charset charset12 = fhf.a;
                        break;
                    }
                case nm7.v0 /* 59 */:
                    if (!i(i9, i6, wgfVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = ((String) hjf.g(wgfVar, j)).hashCode();
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case nm7.w0 /* 60 */:
                    if (!i(i9, i6, wgfVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = hjf.g(wgfVar, j).hashCode();
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case nm7.x0 /* 61 */:
                    if (!i(i9, i6, wgfVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = hjf.g(wgfVar, j).hashCode();
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case nm7.y0 /* 62 */:
                    if (!i(i9, i6, wgfVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = k(wgfVar, j);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case nm7.z0 /* 63 */:
                    if (!i(i9, i6, wgfVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = k(wgfVar, j);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 64:
                    if (!i(i9, i6, wgfVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = k(wgfVar, j);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 65:
                    if (!i(i9, i6, wgfVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = n(wgfVar, j);
                        Charset charset13 = fhf.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case nm7.C0 /* 66 */:
                    if (!i(i9, i6, wgfVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = k(wgfVar, j);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case nm7.D0 /* 67 */:
                    if (!i(i9, i6, wgfVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = n(wgfVar, j);
                        Charset charset14 = fhf.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case nm7.E0 /* 68 */:
                    if (!i(i9, i6, wgfVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = hjf.g(wgfVar, j).hashCode();
                        i7 = floatToIntBits + i3;
                        break;
                    }
            }
            i6 += 3;
        }
    }

    @Override // uif
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
                    if (v(obj, i3, i2, i4, i12) && !o(i3).g(hjf.g(obj, m & 1048575))) {
                    }
                    i6++;
                    i7 = i2;
                    i5 = i4;
                } else {
                    if (l != 27) {
                        if (l == 60 || l == 68) {
                            if (i(i9, i3, obj) && !o(i3).g(hjf.g(obj, m & 1048575))) {
                            }
                        } else if (l != 49) {
                            if (l == 50) {
                                hjf.g(obj, m & 1048575).getClass();
                                rjb.p();
                                return false;
                            }
                        }
                        i6++;
                        i7 = i2;
                        i5 = i4;
                    }
                    List list = (List) hjf.g(obj, m & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        uif o = o(i3);
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
        return hjf.e(obj, (long) (this.a[i3 + 2] & 1048575)) == i2;
    }

    public final int m(int i2) {
        return this.a[i2 + 1];
    }

    public final uif o(int i2) {
        int i3 = (i2 / 3) << 1;
        Object[] objArr = this.b;
        uif uifVar = (uif) objArr[i3];
        if (uifVar != null) {
            return uifVar;
        }
        uif a = rif.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a;
        return a;
    }

    public final void q(int i2, Object obj, Object obj2) {
        if (u(i2, obj2)) {
            long m = m(i2) & 1048575;
            Unsafe unsafe = i;
            Object object = unsafe.getObject(obj2, m);
            if (object == null) {
                dq9.m(mle.d("Source subfield ", this.a[i2], " is present but null: ", obj2.toString()));
                return;
            }
            uif o = o(i2);
            if (!u(i2, obj)) {
                if (h(object)) {
                    wgf zzc = o.zzc();
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
                wgf zzc2 = o.zzc();
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
                dq9.m(mle.d("Source subfield ", iArr[i2], " is present but null: ", obj2.toString()));
                return;
            }
            uif o = o(i2);
            if (!i(i3, i2, obj)) {
                if (h(object)) {
                    wgf zzc = o.zzc();
                    o.c(zzc, object);
                    unsafe.putObject(obj, m, zzc);
                } else {
                    unsafe.putObject(obj, m, object);
                }
                hjf.h(obj, iArr[i2 + 2] & 1048575, i3);
                return;
            }
            Object object2 = unsafe.getObject(obj, m);
            if (!h(object2)) {
                wgf zzc2 = o.zzc();
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
        hjf.h(obj, j, hjf.e(obj, j) | (1 << (i3 >>> 20)));
    }

    public final boolean t(wgf wgfVar, wgf wgfVar2, int i2) {
        return u(i2, wgfVar) == u(i2, wgfVar2);
    }

    public final boolean u(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j = i3 & 1048575;
        if (j != 1048575) {
            return (hjf.e(obj, j) & (1 << (i3 >>> 20))) != 0;
        }
        int m = m(i2);
        long j2 = 1048575 & m;
        switch (l(m)) {
            case 0:
                if (Double.doubleToRawLongBits(hjf.c.k(obj, j2)) != 0) {
                }
                break;
            case 1:
                if (Float.floatToRawIntBits(hjf.c.p(obj, j2)) != 0) {
                }
                break;
            case 2:
                if (hjf.f(obj, j2) != 0) {
                }
                break;
            case 3:
                if (hjf.f(obj, j2) != 0) {
                }
                break;
            case 4:
                if (hjf.e(obj, j2) != 0) {
                }
                break;
            case 5:
                if (hjf.f(obj, j2) != 0) {
                }
                break;
            case 6:
                if (hjf.e(obj, j2) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object g = hjf.g(obj, j2);
                if (!(g instanceof String)) {
                    if (!(g instanceof yff)) {
                        i98.g();
                        break;
                    } else if (!yff.c.equals(g)) {
                    }
                } else if (!((String) g).isEmpty()) {
                }
                break;
            case 9:
                if (hjf.g(obj, j2) != null) {
                }
                break;
            case 10:
                if (!yff.c.equals(hjf.g(obj, j2))) {
                }
                break;
            case 11:
                if (hjf.e(obj, j2) != 0) {
                }
                break;
            case 12:
                if (hjf.e(obj, j2) != 0) {
                }
                break;
            case 13:
                if (hjf.e(obj, j2) != 0) {
                }
                break;
            case 14:
                if (hjf.f(obj, j2) != 0) {
                }
                break;
            case 15:
                if (hjf.e(obj, j2) != 0) {
                }
                break;
            case 16:
                if (hjf.f(obj, j2) != 0) {
                }
                break;
            case 17:
                if (hjf.g(obj, j2) != null) {
                }
                break;
            default:
                i98.g();
                break;
        }
        return false;
    }

    public final boolean v(Object obj, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? u(i2, obj) : (i4 & i5) != 0;
    }

    @Override // uif
    public final wgf zzc() {
        return (wgf) ((wgf) this.c).h(4, null);
    }
}
