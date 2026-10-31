package com.google.android.gms.internal.cast;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class x5 implements f6 {
    public static final int[] h = new int[0];
    public static final Unsafe i = q6.i();
    public final int[] a;
    public final Object[] b;
    public final r4 c;
    public final int[] d;
    public final int e;
    public final p5 f;
    public final i6 g;

    public x5(int[] iArr, Object[] objArr, r4 r4Var, int[] iArr2, int i10, p5 p5Var, i6 i6Var, y4 y4Var) {
        this.a = iArr;
        this.b = objArr;
        this.d = iArr2;
        this.e = i10;
        this.f = p5Var;
        this.g = i6Var;
        this.c = r4Var;
    }

    public static boolean h(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof d5) {
            return ((d5) obj).g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static x5 j(e6 e6Var, p5 p5Var, i6 i6Var, y4 y4Var) {
        int i10;
        int charAt;
        int charAt2;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        char charAt3;
        int i15;
        char charAt4;
        int i16;
        char charAt5;
        int i17;
        char charAt6;
        int i18;
        int i19;
        int i20;
        char charAt7;
        int i21;
        char charAt8;
        int i22;
        int i23;
        int i24;
        Object[] objArr;
        int i25;
        int i26;
        int i27;
        int objectFieldOffset;
        int i28;
        String str;
        char c10;
        int i29;
        int i30;
        int i31;
        int i32;
        Field p5;
        char charAt9;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        Object obj;
        Field p9;
        Object obj2;
        Field p10;
        int i39;
        char charAt10;
        int i40;
        int i41;
        char charAt11;
        int i42;
        char charAt12;
        int i43;
        char charAt13;
        if (!(e6Var instanceof e6)) {
            e6Var.getClass();
            throw new ClassCastException();
        }
        String str2 = e6Var.b;
        int length = str2.length();
        char c11 = 55296;
        if (str2.charAt(0) >= 55296) {
            int i44 = 1;
            while (true) {
                i10 = i44 + 1;
                if (str2.charAt(i44) < 55296) {
                    break;
                }
                i44 = i10;
            }
        } else {
            i10 = 1;
        }
        int i45 = i10 + 1;
        int charAt14 = str2.charAt(i10);
        if (charAt14 >= 55296) {
            int i46 = charAt14 & 8191;
            int i47 = 13;
            while (true) {
                i43 = i45 + 1;
                charAt13 = str2.charAt(i45);
                if (charAt13 < 55296) {
                    break;
                }
                i46 |= (charAt13 & 8191) << i47;
                i47 += 13;
                i45 = i43;
            }
            charAt14 = i46 | (charAt13 << i47);
            i45 = i43;
        }
        if (charAt14 == 0) {
            charAt = 0;
            charAt2 = 0;
            i11 = 0;
            i13 = 0;
            iArr = h;
            i12 = 0;
        } else {
            int i48 = i45 + 1;
            int charAt15 = str2.charAt(i45);
            if (charAt15 >= 55296) {
                int i49 = charAt15 & 8191;
                int i50 = 13;
                while (true) {
                    i21 = i48 + 1;
                    charAt8 = str2.charAt(i48);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i49 |= (charAt8 & 8191) << i50;
                    i50 += 13;
                    i48 = i21;
                }
                charAt15 = i49 | (charAt8 << i50);
                i48 = i21;
            }
            int i51 = i48 + 1;
            int charAt16 = str2.charAt(i48);
            if (charAt16 >= 55296) {
                int i52 = charAt16 & 8191;
                int i53 = 13;
                while (true) {
                    i20 = i51 + 1;
                    charAt7 = str2.charAt(i51);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i52 |= (charAt7 & 8191) << i53;
                    i53 += 13;
                    i51 = i20;
                }
                charAt16 = i52 | (charAt7 << i53);
                i51 = i20;
            }
            int i54 = i51 + 1;
            if (str2.charAt(i51) >= 55296) {
                while (true) {
                    i19 = i54 + 1;
                    if (str2.charAt(i54) < 55296) {
                        break;
                    }
                    i54 = i19;
                }
                i54 = i19;
            }
            int i55 = i54 + 1;
            if (str2.charAt(i54) >= 55296) {
                while (true) {
                    i18 = i55 + 1;
                    if (str2.charAt(i55) < 55296) {
                        break;
                    }
                    i55 = i18;
                }
                i55 = i18;
            }
            int i56 = i55 + 1;
            charAt = str2.charAt(i55);
            if (charAt >= 55296) {
                int i57 = charAt & 8191;
                int i58 = 13;
                while (true) {
                    i17 = i56 + 1;
                    charAt6 = str2.charAt(i56);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i57 |= (charAt6 & 8191) << i58;
                    i58 += 13;
                    i56 = i17;
                }
                charAt = i57 | (charAt6 << i58);
                i56 = i17;
            }
            int i59 = i56 + 1;
            charAt2 = str2.charAt(i56);
            if (charAt2 >= 55296) {
                int i60 = charAt2 & 8191;
                int i61 = 13;
                while (true) {
                    i16 = i59 + 1;
                    charAt5 = str2.charAt(i59);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i60 |= (charAt5 & 8191) << i61;
                    i61 += 13;
                    i59 = i16;
                }
                charAt2 = i60 | (charAt5 << i61);
                i59 = i16;
            }
            int i62 = i59 + 1;
            int charAt17 = str2.charAt(i59);
            if (charAt17 >= 55296) {
                int i63 = charAt17 & 8191;
                int i64 = 13;
                while (true) {
                    i15 = i62 + 1;
                    charAt4 = str2.charAt(i62);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i63 |= (charAt4 & 8191) << i64;
                    i64 += 13;
                    i62 = i15;
                }
                charAt17 = i63 | (charAt4 << i64);
                i62 = i15;
            }
            int i65 = i62 + 1;
            int charAt18 = str2.charAt(i62);
            if (charAt18 >= 55296) {
                int i66 = charAt18 & 8191;
                int i67 = 13;
                while (true) {
                    i14 = i65 + 1;
                    charAt3 = str2.charAt(i65);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i66 |= (charAt3 & 8191) << i67;
                    i67 += 13;
                    i65 = i14;
                }
                charAt18 = i66 | (charAt3 << i67);
                i65 = i14;
            }
            int i68 = charAt18 + charAt2 + charAt17;
            i11 = charAt15 + charAt15 + charAt16;
            i12 = charAt15;
            i45 = i65;
            iArr = new int[i68];
            i13 = charAt18;
        }
        Unsafe unsafe = i;
        Object[] objArr2 = e6Var.c;
        Class<?> cls = e6Var.a.getClass();
        int i69 = charAt2 + i13;
        int i70 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr3 = new Object[i70];
        int i71 = i13;
        int i72 = 0;
        int i73 = 0;
        while (i45 < length) {
            int i74 = i45 + 1;
            int charAt19 = str2.charAt(i45);
            if (charAt19 >= c11) {
                int i75 = charAt19 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i42 = i76 + 1;
                    charAt12 = str2.charAt(i76);
                    if (charAt12 < c11) {
                        break;
                    }
                    i75 |= (charAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i42;
                }
                charAt19 = i75 | (charAt12 << i77);
                i22 = i42;
            } else {
                i22 = i74;
            }
            int i78 = i22 + 1;
            int charAt20 = str2.charAt(i22);
            if (charAt20 >= c11) {
                int i79 = charAt20 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i41 = i80 + 1;
                    charAt11 = str2.charAt(i80);
                    i23 = length;
                    if (charAt11 < 55296) {
                        break;
                    }
                    i79 |= (charAt11 & 8191) << i81;
                    i81 += 13;
                    i80 = i41;
                    length = i23;
                }
                charAt20 = i79 | (charAt11 << i81);
                i24 = i41;
            } else {
                i23 = length;
                i24 = i78;
            }
            if ((charAt20 & 1024) != 0) {
                iArr[i72] = i73;
                i72++;
            }
            int i82 = charAt20 & zs.e4;
            int i83 = charAt19;
            int i84 = charAt20 & 2048;
            if (i82 >= 51) {
                int i85 = i24 + 1;
                int charAt21 = str2.charAt(i24);
                if (charAt21 >= 55296) {
                    int i86 = charAt21 & 8191;
                    int i87 = i85;
                    int i88 = 13;
                    while (true) {
                        i39 = i87 + 1;
                        charAt10 = str2.charAt(i87);
                        i40 = i86;
                        if (charAt10 < 55296) {
                            break;
                        }
                        i86 = i40 | ((charAt10 & 8191) << i88);
                        i88 += 13;
                        i87 = i39;
                    }
                    charAt21 = i40 | (charAt10 << i88);
                    i36 = i39;
                } else {
                    i36 = i85;
                }
                int i89 = charAt21;
                int i90 = i82 - 51;
                int i91 = i36;
                if (i90 == 9 || i90 == 17) {
                    i37 = i11 + 1;
                    int i92 = i73 / 3;
                    objArr3[i92 + i92 + 1] = objArr2[i11];
                } else {
                    if (i90 == 12) {
                        if (e6Var.a() == 1 || i84 != 0) {
                            i37 = i11 + 1;
                            int i93 = i73 / 3;
                            objArr3[i93 + i93 + 1] = objArr2[i11];
                        } else {
                            i38 = 0;
                            int i94 = i89 + i89;
                            obj = objArr2[i94];
                            int i95 = i38;
                            if (obj instanceof Field) {
                                p9 = (Field) obj;
                            } else {
                                p9 = p(cls, (String) obj);
                                objArr2[i94] = p9;
                            }
                            int i96 = i12;
                            objArr = objArr3;
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(p9);
                            int i97 = i94 + 1;
                            obj2 = objArr2[i97];
                            if (obj2 instanceof Field) {
                                p10 = (Field) obj2;
                            } else {
                                p10 = p(cls, (String) obj2);
                                objArr2[i97] = p10;
                            }
                            i25 = i96;
                            i27 = i95;
                            str = str2;
                            i26 = i11;
                            i31 = 0;
                            c10 = 55296;
                            i28 = (int) unsafe.objectFieldOffset(p10);
                            i32 = objectFieldOffset2;
                            i29 = i91;
                        }
                    }
                    i38 = i84;
                    int i942 = i89 + i89;
                    obj = objArr2[i942];
                    int i952 = i38;
                    if (obj instanceof Field) {
                    }
                    int i962 = i12;
                    objArr = objArr3;
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(p9);
                    int i972 = i942 + 1;
                    obj2 = objArr2[i972];
                    if (obj2 instanceof Field) {
                    }
                    i25 = i962;
                    i27 = i952;
                    str = str2;
                    i26 = i11;
                    i31 = 0;
                    c10 = 55296;
                    i28 = (int) unsafe.objectFieldOffset(p10);
                    i32 = objectFieldOffset22;
                    i29 = i91;
                }
                i11 = i37;
                i38 = i84;
                int i9422 = i89 + i89;
                obj = objArr2[i9422];
                int i9522 = i38;
                if (obj instanceof Field) {
                }
                int i9622 = i12;
                objArr = objArr3;
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(p9);
                int i9722 = i9422 + 1;
                obj2 = objArr2[i9722];
                if (obj2 instanceof Field) {
                }
                i25 = i9622;
                i27 = i9522;
                str = str2;
                i26 = i11;
                i31 = 0;
                c10 = 55296;
                i28 = (int) unsafe.objectFieldOffset(p10);
                i32 = objectFieldOffset222;
                i29 = i91;
            } else {
                int i98 = i12;
                objArr = objArr3;
                int i99 = i11 + 1;
                Field p11 = p(cls, (String) objArr2[i11]);
                i25 = i98;
                if (i82 == 9 || i82 == 17) {
                    i26 = i99;
                    int i100 = i73 / 3;
                    objArr[i100 + i100 + 1] = p11.getType();
                } else {
                    if (i82 == 27) {
                        i33 = i99;
                        i34 = 1;
                        i35 = i11 + 2;
                    } else if (i82 == 49) {
                        i35 = i11 + 2;
                        i33 = i99;
                        i34 = 1;
                    } else {
                        if (i82 == 12 || i82 == 30 || i82 == 44) {
                            i26 = i99;
                            if (e6Var.a() == 1 || i84 != 0) {
                                i35 = i11 + 2;
                                int i101 = i73 / 3;
                                objArr[i101 + i101 + 1] = objArr2[i26];
                                i26 = i35;
                            }
                        } else if (i82 == 50) {
                            int i102 = i11 + 2;
                            int i103 = i71 + 1;
                            iArr[i71] = i73;
                            int i104 = i73 / 3;
                            int i105 = i104 + i104;
                            objArr[i105] = objArr2[i99];
                            if (i84 != 0) {
                                objArr[i105 + 1] = objArr2[i102];
                                i27 = i84;
                                i71 = i103;
                                i26 = i11 + 3;
                                objectFieldOffset = (int) unsafe.objectFieldOffset(p11);
                                i28 = 1048575;
                                if ((charAt20 & TLObject.FLAG_12) != 0 || i82 > 17) {
                                    str = str2;
                                    c10 = 55296;
                                    i29 = i24;
                                    i30 = 0;
                                } else {
                                    int i106 = i24 + 1;
                                    int charAt22 = str2.charAt(i24);
                                    if (charAt22 >= 55296) {
                                        int i107 = charAt22 & 8191;
                                        int i108 = 13;
                                        while (true) {
                                            i29 = i106 + 1;
                                            charAt9 = str2.charAt(i106);
                                            if (charAt9 < 55296) {
                                                break;
                                            }
                                            i107 |= (charAt9 & 8191) << i108;
                                            i108 += 13;
                                            i106 = i29;
                                        }
                                        charAt22 = i107 | (charAt9 << i108);
                                    } else {
                                        i29 = i106;
                                    }
                                    int i109 = (charAt22 / 32) + i25 + i25;
                                    Object obj3 = objArr2[i109];
                                    if (obj3 instanceof Field) {
                                        p5 = (Field) obj3;
                                    } else {
                                        p5 = p(cls, (String) obj3);
                                        objArr2[i109] = p5;
                                    }
                                    str = str2;
                                    i30 = charAt22 % 32;
                                    i28 = (int) unsafe.objectFieldOffset(p5);
                                    c10 = 55296;
                                }
                                if (i82 >= 18 && i82 <= 49) {
                                    iArr[i69] = objectFieldOffset;
                                    i69++;
                                }
                                i31 = i30;
                                i32 = objectFieldOffset;
                            } else {
                                i71 = i103;
                                i26 = i102;
                            }
                        } else {
                            i26 = i99;
                        }
                        i27 = 0;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(p11);
                        i28 = 1048575;
                        if ((charAt20 & TLObject.FLAG_12) != 0) {
                        }
                        str = str2;
                        c10 = 55296;
                        i29 = i24;
                        i30 = 0;
                        if (i82 >= 18) {
                            iArr[i69] = objectFieldOffset;
                            i69++;
                        }
                        i31 = i30;
                        i32 = objectFieldOffset;
                    }
                    int i110 = i73 / 3;
                    objArr[i110 + i110 + i34] = objArr2[i33];
                    i26 = i35;
                }
                i27 = i84;
                objectFieldOffset = (int) unsafe.objectFieldOffset(p11);
                i28 = 1048575;
                if ((charAt20 & TLObject.FLAG_12) != 0) {
                }
                str = str2;
                c10 = 55296;
                i29 = i24;
                i30 = 0;
                if (i82 >= 18) {
                }
                i31 = i30;
                i32 = objectFieldOffset;
            }
            int i111 = i73 + 1;
            iArr2[i73] = i83;
            int i112 = i73 + 2;
            int i113 = i31;
            iArr2[i111] = ((charAt20 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((charAt20 & 256) != 0 ? TLObject.FLAG_28 : 0) | (i27 != 0 ? TLObject.FLAG_31 : 0) | (i82 << 20) | i32;
            i73 += 3;
            iArr2[i112] = (i113 << 20) | i28;
            str2 = str;
            i45 = i29;
            length = i23;
            i12 = i25;
            i11 = i26;
            c11 = c10;
            objArr3 = objArr;
        }
        return new x5(iArr2, objArr3, e6Var.a, iArr, i13, p5Var, i6Var, y4Var);
    }

    public static int k(Object obj, long j10) {
        return ((Integer) q6.h(obj, j10)).intValue();
    }

    public static int l(int i10) {
        return (i10 >>> 20) & zs.e4;
    }

    public static long n(Object obj, long j10) {
        return ((Long) q6.h(obj, j10)).longValue();
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
            StringBuilder v = a1.g.v("Field ", str, " for ", name, " not found. Known fields are ");
            v.append(arrays);
            throw new RuntimeException(v.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        continue;
     */
    @Override // com.google.android.gms.internal.cast.f6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        if (!h(obj)) {
            return;
        }
        if (obj instanceof d5) {
            d5 d5Var = (d5) obj;
            d5Var.f();
            d5Var.zza = 0;
            d5Var.d();
        }
        int i10 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i10 >= iArr.length) {
                this.g.getClass();
                h6 h6Var = ((d5) obj).zzc;
                if (h6Var.d) {
                    h6Var.d = false;
                    return;
                }
                return;
            }
            int m10 = m(i10);
            int i11 = 1048575 & m10;
            int l4 = l(m10);
            long j10 = i11;
            if (l4 != 9) {
                if (l4 != 60 && l4 != 68) {
                    switch (l4) {
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
                        case zs.T /* 30 */:
                        case zs.U /* 31 */:
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
                            this.f.a(obj, j10);
                            break;
                        case 50:
                            if (i.getObject(obj, j10) != null) {
                                throw new ClassCastException();
                            }
                            break;
                    }
                } else if (i(iArr[i10], i10, obj)) {
                    o(i10).a(i.getObject(obj, j10));
                }
                i10 += 3;
            }
            if (u(i10, obj)) {
                o(i10).a(i.getObject(obj, j10));
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ea, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        r6 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
    
        r1 = r6 + r1;
     */
    @Override // com.google.android.gms.internal.cast.f6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(d5 d5Var) {
        int i10;
        long doubleToLongBits;
        int i11;
        int floatToIntBits;
        int i12;
        int i13;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i14 >= iArr.length) {
                this.g.getClass();
                d5Var.zzc.getClass();
                return (i15 * 53) + 506991;
            }
            int m10 = m(i14);
            int i16 = 1048575 & m10;
            int l4 = l(m10);
            int i17 = iArr[i14];
            long j10 = i16;
            int i18 = 1237;
            int i19 = 37;
            switch (l4) {
                case 0:
                    i10 = i15 * 53;
                    doubleToLongBits = Double.doubleToLongBits(q6.c.a(d5Var, j10));
                    Charset charset = j5.a;
                    i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i11 = i15 * 53;
                    floatToIntBits = Float.floatToIntBits(q6.c.b(d5Var, j10));
                    i15 = floatToIntBits + i11;
                    break;
                case 2:
                    i10 = i15 * 53;
                    doubleToLongBits = q6.f(d5Var, j10);
                    Charset charset2 = j5.a;
                    i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i10 = i15 * 53;
                    doubleToLongBits = q6.f(d5Var, j10);
                    Charset charset3 = j5.a;
                    i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i11 = i15 * 53;
                    floatToIntBits = q6.e(d5Var, j10);
                    i15 = floatToIntBits + i11;
                    break;
                case 5:
                    i10 = i15 * 53;
                    doubleToLongBits = q6.f(d5Var, j10);
                    Charset charset4 = j5.a;
                    i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i11 = i15 * 53;
                    floatToIntBits = q6.e(d5Var, j10);
                    i15 = floatToIntBits + i11;
                    break;
                case 7:
                    i12 = i15 * 53;
                    boolean g10 = q6.c.g(d5Var, j10);
                    Charset charset5 = j5.a;
                    break;
                case 8:
                    i11 = i15 * 53;
                    floatToIntBits = ((String) q6.h(d5Var, j10)).hashCode();
                    i15 = floatToIntBits + i11;
                    break;
                case 9:
                    i13 = i15 * 53;
                    Object h10 = q6.h(d5Var, j10);
                    if (h10 != null) {
                        i19 = h10.hashCode();
                    }
                    i15 = i13 + i19;
                    break;
                case 10:
                    i11 = i15 * 53;
                    floatToIntBits = q6.h(d5Var, j10).hashCode();
                    i15 = floatToIntBits + i11;
                    break;
                case 11:
                    i11 = i15 * 53;
                    floatToIntBits = q6.e(d5Var, j10);
                    i15 = floatToIntBits + i11;
                    break;
                case 12:
                    i11 = i15 * 53;
                    floatToIntBits = q6.e(d5Var, j10);
                    i15 = floatToIntBits + i11;
                    break;
                case 13:
                    i11 = i15 * 53;
                    floatToIntBits = q6.e(d5Var, j10);
                    i15 = floatToIntBits + i11;
                    break;
                case 14:
                    i10 = i15 * 53;
                    doubleToLongBits = q6.f(d5Var, j10);
                    Charset charset6 = j5.a;
                    i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i11 = i15 * 53;
                    floatToIntBits = q6.e(d5Var, j10);
                    i15 = floatToIntBits + i11;
                    break;
                case 16:
                    i10 = i15 * 53;
                    doubleToLongBits = q6.f(d5Var, j10);
                    Charset charset7 = j5.a;
                    i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i13 = i15 * 53;
                    Object h11 = q6.h(d5Var, j10);
                    if (h11 != null) {
                        i19 = h11.hashCode();
                    }
                    i15 = i13 + i19;
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
                case zs.T /* 30 */:
                case zs.U /* 31 */:
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
                    i11 = i15 * 53;
                    floatToIntBits = q6.h(d5Var, j10).hashCode();
                    i15 = floatToIntBits + i11;
                    break;
                case 50:
                    i11 = i15 * 53;
                    floatToIntBits = q6.h(d5Var, j10).hashCode();
                    i15 = floatToIntBits + i11;
                    break;
                case zs.o0 /* 51 */:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) q6.h(d5Var, j10)).doubleValue());
                        Charset charset8 = j5.a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case zs.p0 /* 52 */:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) q6.h(d5Var, j10)).floatValue());
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case zs.q0 /* 53 */:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = n(d5Var, j10);
                        Charset charset9 = j5.a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case zs.r0 /* 54 */:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = n(d5Var, j10);
                        Charset charset10 = j5.a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case zs.s0 /* 55 */:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = k(d5Var, j10);
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case zs.t0 /* 56 */:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = n(d5Var, j10);
                        Charset charset11 = j5.a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case zs.u0 /* 57 */:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = k(d5Var, j10);
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case zs.v0 /* 58 */:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i12 = i15 * 53;
                        boolean booleanValue = ((Boolean) q6.h(d5Var, j10)).booleanValue();
                        Charset charset12 = j5.a;
                        break;
                    }
                case zs.w0 /* 59 */:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = ((String) q6.h(d5Var, j10)).hashCode();
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case zs.x0 /* 60 */:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = q6.h(d5Var, j10).hashCode();
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case zs.y0 /* 61 */:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = q6.h(d5Var, j10).hashCode();
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case zs.z0 /* 62 */:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = k(d5Var, j10);
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case zs.A0 /* 63 */:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = k(d5Var, j10);
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 64:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = k(d5Var, j10);
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 65:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = n(d5Var, j10);
                        Charset charset13 = j5.a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case zs.D0 /* 66 */:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = k(d5Var, j10);
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case zs.E0 /* 67 */:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = n(d5Var, j10);
                        Charset charset14 = j5.a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case zs.F0 /* 68 */:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = q6.h(d5Var, j10).hashCode();
                        i15 = floatToIntBits + i11;
                        break;
                    }
            }
            i14 += 3;
        }
    }

    @Override // com.google.android.gms.internal.cast.f6
    public final boolean c(d5 d5Var, d5 d5Var2) {
        boolean e;
        int i10 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i10 < iArr.length) {
                int m10 = m(i10);
                long j10 = m10 & 1048575;
                switch (l(m10)) {
                    case 0:
                        if (!t(d5Var, d5Var2, i10)) {
                            break;
                        } else {
                            p6 p6Var = q6.c;
                            if (Double.doubleToLongBits(p6Var.a(d5Var, j10)) != Double.doubleToLongBits(p6Var.a(d5Var2, j10))) {
                                break;
                            } else {
                                continue;
                                i10 += 3;
                            }
                        }
                    case 1:
                        if (!t(d5Var, d5Var2, i10)) {
                            break;
                        } else {
                            p6 p6Var2 = q6.c;
                            if (Float.floatToIntBits(p6Var2.b(d5Var, j10)) != Float.floatToIntBits(p6Var2.b(d5Var2, j10))) {
                                break;
                            } else {
                                continue;
                                i10 += 3;
                            }
                        }
                    case 2:
                        if (t(d5Var, d5Var2, i10) && q6.f(d5Var, j10) == q6.f(d5Var2, j10)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 3:
                        if (t(d5Var, d5Var2, i10) && q6.f(d5Var, j10) == q6.f(d5Var2, j10)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 4:
                        if (t(d5Var, d5Var2, i10) && q6.e(d5Var, j10) == q6.e(d5Var2, j10)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 5:
                        if (t(d5Var, d5Var2, i10) && q6.f(d5Var, j10) == q6.f(d5Var2, j10)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 6:
                        if (t(d5Var, d5Var2, i10) && q6.e(d5Var, j10) == q6.e(d5Var2, j10)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 7:
                        if (!t(d5Var, d5Var2, i10)) {
                            break;
                        } else {
                            p6 p6Var3 = q6.c;
                            if (p6Var3.g(d5Var, j10) != p6Var3.g(d5Var2, j10)) {
                                break;
                            } else {
                                continue;
                                i10 += 3;
                            }
                        }
                    case 8:
                        if (t(d5Var, d5Var2, i10) && g6.e(q6.h(d5Var, j10), q6.h(d5Var2, j10))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 9:
                        if (t(d5Var, d5Var2, i10) && g6.e(q6.h(d5Var, j10), q6.h(d5Var2, j10))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 10:
                        if (t(d5Var, d5Var2, i10) && g6.e(q6.h(d5Var, j10), q6.h(d5Var2, j10))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 11:
                        if (t(d5Var, d5Var2, i10) && q6.e(d5Var, j10) == q6.e(d5Var2, j10)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 12:
                        if (t(d5Var, d5Var2, i10) && q6.e(d5Var, j10) == q6.e(d5Var2, j10)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 13:
                        if (t(d5Var, d5Var2, i10) && q6.e(d5Var, j10) == q6.e(d5Var2, j10)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 14:
                        if (t(d5Var, d5Var2, i10) && q6.f(d5Var, j10) == q6.f(d5Var2, j10)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 15:
                        if (t(d5Var, d5Var2, i10) && q6.e(d5Var, j10) == q6.e(d5Var2, j10)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 16:
                        if (t(d5Var, d5Var2, i10) && q6.f(d5Var, j10) == q6.f(d5Var2, j10)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 17:
                        if (t(d5Var, d5Var2, i10) && g6.e(q6.h(d5Var, j10), q6.h(d5Var2, j10))) {
                            continue;
                            i10 += 3;
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
                    case zs.T /* 30 */:
                    case zs.U /* 31 */:
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
                        e = g6.e(q6.h(d5Var, j10), q6.h(d5Var2, j10));
                        break;
                    case 50:
                        e = g6.e(q6.h(d5Var, j10), q6.h(d5Var2, j10));
                        break;
                    case zs.o0 /* 51 */:
                    case zs.p0 /* 52 */:
                    case zs.q0 /* 53 */:
                    case zs.r0 /* 54 */:
                    case zs.s0 /* 55 */:
                    case zs.t0 /* 56 */:
                    case zs.u0 /* 57 */:
                    case zs.v0 /* 58 */:
                    case zs.w0 /* 59 */:
                    case zs.x0 /* 60 */:
                    case zs.y0 /* 61 */:
                    case zs.z0 /* 62 */:
                    case zs.A0 /* 63 */:
                    case 64:
                    case 65:
                    case zs.D0 /* 66 */:
                    case zs.E0 /* 67 */:
                    case zs.F0 /* 68 */:
                        long j11 = iArr[i10 + 2] & 1048575;
                        if (q6.e(d5Var, j11) == q6.e(d5Var2, j11) && g6.e(q6.h(d5Var, j10), q6.h(d5Var2, j10))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    default:
                        i10 += 3;
                }
                if (e) {
                    i10 += 3;
                }
            } else {
                this.g.getClass();
                if (d5Var.zzc.equals(d5Var2.zzc)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.cast.f6
    public final void d(Object obj, Object obj2) {
        Object obj3;
        if (!h(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i10 >= iArr.length) {
                g6.o(this.g, obj, obj2);
                return;
            }
            int m10 = m(i10);
            int i11 = m10 & 1048575;
            int l4 = l(m10);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (l4) {
                case 0:
                    if (u(i10, obj2)) {
                        p6 p6Var = q6.c;
                        obj3 = obj;
                        p6Var.e(obj3, j10, p6Var.a(obj2, j10));
                        s(i10, obj3);
                        i10 += 3;
                        obj = obj3;
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 1:
                    if (u(i10, obj2)) {
                        p6 p6Var2 = q6.c;
                        p6Var2.f(obj, j10, p6Var2.b(obj2, j10));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 2:
                    if (u(i10, obj2)) {
                        q6.k(obj, j10, q6.f(obj2, j10));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 3:
                    if (u(i10, obj2)) {
                        q6.k(obj, j10, q6.f(obj2, j10));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 4:
                    if (u(i10, obj2)) {
                        q6.j(obj, j10, q6.e(obj2, j10));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 5:
                    if (u(i10, obj2)) {
                        q6.k(obj, j10, q6.f(obj2, j10));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 6:
                    if (u(i10, obj2)) {
                        q6.j(obj, j10, q6.e(obj2, j10));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 7:
                    if (u(i10, obj2)) {
                        p6 p6Var3 = q6.c;
                        p6Var3.c(obj, j10, p6Var3.g(obj2, j10));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 8:
                    if (u(i10, obj2)) {
                        q6.l(obj, j10, q6.h(obj2, j10));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 9:
                    q(i10, obj, obj2);
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 10:
                    if (u(i10, obj2)) {
                        q6.l(obj, j10, q6.h(obj2, j10));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 11:
                    if (u(i10, obj2)) {
                        q6.j(obj, j10, q6.e(obj2, j10));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 12:
                    if (u(i10, obj2)) {
                        q6.j(obj, j10, q6.e(obj2, j10));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 13:
                    if (u(i10, obj2)) {
                        q6.j(obj, j10, q6.e(obj2, j10));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 14:
                    if (u(i10, obj2)) {
                        q6.k(obj, j10, q6.f(obj2, j10));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 15:
                    if (u(i10, obj2)) {
                        q6.j(obj, j10, q6.e(obj2, j10));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 16:
                    if (u(i10, obj2)) {
                        q6.k(obj, j10, q6.f(obj2, j10));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 17:
                    q(i10, obj, obj2);
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
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
                case zs.T /* 30 */:
                case zs.U /* 31 */:
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
                    this.f.b(obj, j10, obj2);
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 50:
                    Class cls = g6.a;
                    Object h10 = q6.h(obj, j10);
                    Object h11 = q6.h(obj2, j10);
                    if (h10 != null) {
                        throw new ClassCastException();
                    }
                    throw c3.i0.l(h11);
                case zs.o0 /* 51 */:
                case zs.p0 /* 52 */:
                case zs.q0 /* 53 */:
                case zs.r0 /* 54 */:
                case zs.s0 /* 55 */:
                case zs.t0 /* 56 */:
                case zs.u0 /* 57 */:
                case zs.v0 /* 58 */:
                case zs.w0 /* 59 */:
                    if (i(i12, i10, obj2)) {
                        q6.l(obj, j10, q6.h(obj2, j10));
                        q6.j(obj, iArr[i10 + 2] & 1048575, i12);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case zs.x0 /* 60 */:
                    r(i10, obj, obj2);
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case zs.y0 /* 61 */:
                case zs.z0 /* 62 */:
                case zs.A0 /* 63 */:
                case 64:
                case 65:
                case zs.D0 /* 66 */:
                case zs.E0 /* 67 */:
                    if (i(i12, i10, obj2)) {
                        q6.l(obj, j10, q6.h(obj2, j10));
                        q6.j(obj, iArr[i10 + 2] & 1048575, i12);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case zs.F0 /* 68 */:
                    r(i10, obj, obj2);
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                default:
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.f6
    public final void e(Object obj, s5 s5Var) {
        int i10;
        x5 x5Var = this;
        Unsafe unsafe = i;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (true) {
            int[] iArr = x5Var.a;
            if (i12 >= iArr.length) {
                x5Var.g.getClass();
                h6 h6Var = ((d5) obj).zzc;
                return;
            }
            int m10 = x5Var.m(i12);
            int l4 = l(m10);
            int i15 = iArr[i12];
            if (l4 <= 17) {
                int i16 = iArr[i12 + 2];
                int i17 = i16 & i11;
                if (i17 != i14) {
                    i13 = i17 == i11 ? 0 : unsafe.getInt(obj, i17);
                    i14 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            long j10 = m10 & i11;
            switch (l4) {
                case 0:
                    if (x5Var.v(obj, i12, i14, i13, i10)) {
                        ((w4) s5Var.a).f(i15, Double.doubleToRawLongBits(q6.c.a(obj, j10)));
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 1:
                    if (x5Var.v(obj, i12, i14, i13, i10)) {
                        ((w4) s5Var.a).d(i15, Float.floatToRawIntBits(q6.c.b(obj, j10)));
                        break;
                    }
                    break;
                case 2:
                    if (x5Var.v(obj, i12, i14, i13, i10)) {
                        ((w4) s5Var.a).k(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                    break;
                case 3:
                    if (x5Var.v(obj, i12, i14, i13, i10)) {
                        ((w4) s5Var.a).k(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                    break;
                case 4:
                    if (x5Var.v(obj, i12, i14, i13, i10)) {
                        int i18 = unsafe.getInt(obj, j10);
                        w4 w4Var = (w4) s5Var.a;
                        w4Var.j(i15 << 3);
                        if (i18 >= 0) {
                            w4Var.j(i18);
                            break;
                        } else {
                            w4Var.l(i18);
                            break;
                        }
                    }
                    break;
                case 5:
                    if (x5Var.v(obj, i12, i14, i13, i10)) {
                        ((w4) s5Var.a).f(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                    break;
                case 6:
                    if (x5Var.v(obj, i12, i14, i13, i10)) {
                        ((w4) s5Var.a).d(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                    break;
                case 7:
                    if (x5Var.v(obj, i12, i14, i13, i10)) {
                        boolean g10 = q6.c.g(obj, j10);
                        w4 w4Var2 = (w4) s5Var.a;
                        w4Var2.j(i15 << 3);
                        w4Var2.a(g10 ? (byte) 1 : (byte) 0);
                        break;
                    }
                    break;
                case 8:
                    if (x5Var.v(obj, i12, i14, i13, i10)) {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof String) {
                            ((w4) s5Var.a).h(i15, (String) object);
                            break;
                        } else {
                            ((w4) s5Var.a).c(i15, (v4) object);
                            break;
                        }
                    }
                    break;
                case 9:
                    if (x5Var.v(obj, i12, i14, i13, i10)) {
                        s5Var.b(i15, unsafe.getObject(obj, j10), x5Var.o(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 10:
                    if (x5Var.v(obj, i12, i14, i13, i10)) {
                        ((w4) s5Var.a).c(i15, (v4) unsafe.getObject(obj, j10));
                        break;
                    }
                    break;
                case 11:
                    if (x5Var.v(obj, i12, i14, i13, i10)) {
                        int i19 = unsafe.getInt(obj, j10);
                        w4 w4Var3 = (w4) s5Var.a;
                        w4Var3.j(i15 << 3);
                        w4Var3.j(i19);
                        break;
                    }
                    break;
                case 12:
                    if (x5Var.v(obj, i12, i14, i13, i10)) {
                        int i20 = unsafe.getInt(obj, j10);
                        w4 w4Var4 = (w4) s5Var.a;
                        w4Var4.j(i15 << 3);
                        if (i20 >= 0) {
                            w4Var4.j(i20);
                            break;
                        } else {
                            w4Var4.l(i20);
                            break;
                        }
                    }
                    break;
                case 13:
                    if (x5Var.v(obj, i12, i14, i13, i10)) {
                        ((w4) s5Var.a).d(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                    break;
                case 14:
                    if (x5Var.v(obj, i12, i14, i13, i10)) {
                        ((w4) s5Var.a).f(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                    break;
                case 15:
                    if (x5Var.v(obj, i12, i14, i13, i10)) {
                        int i21 = unsafe.getInt(obj, j10);
                        w4 w4Var5 = (w4) s5Var.a;
                        w4Var5.j(i15 << 3);
                        w4Var5.j((i21 >> 31) ^ (i21 + i21));
                        break;
                    }
                    break;
                case 16:
                    if (x5Var.v(obj, i12, i14, i13, i10)) {
                        long j11 = unsafe.getLong(obj, j10);
                        ((w4) s5Var.a).k(i15, (j11 >> 63) ^ (j11 + j11));
                        break;
                    }
                    break;
                case 17:
                    if (x5Var.v(obj, i12, i14, i13, i10)) {
                        s5Var.a(i15, unsafe.getObject(obj, j10), x5Var.o(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 18:
                    g6.q(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 19:
                    g6.u(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 20:
                    g6.w(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 21:
                    g6.d(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 22:
                    g6.v(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 23:
                    g6.t(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 24:
                    g6.s(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 25:
                    g6.p(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 26:
                    int i22 = iArr[i12];
                    List list = (List) unsafe.getObject(obj, j10);
                    Class cls = g6.a;
                    if (list == null) {
                        continue;
                    } else if (!list.isEmpty()) {
                        w4 w4Var6 = (w4) s5Var.a;
                        if (list instanceof m5) {
                            m5 m5Var = (m5) list;
                            for (int i23 = 0; i23 < list.size(); i23++) {
                                Object d = m5Var.d(i23);
                                if (d instanceof String) {
                                    w4Var6.h(i22, (String) d);
                                } else {
                                    w4Var6.c(i22, (v4) d);
                                }
                            }
                        } else {
                            for (int i24 = 0; i24 < list.size(); i24++) {
                                w4Var6.h(i22, (String) list.get(i24));
                            }
                        }
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 27:
                    int i25 = iArr[i12];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    f6 o10 = x5Var.o(i12);
                    Class cls2 = g6.a;
                    if (list2 == null) {
                        continue;
                    } else if (!list2.isEmpty()) {
                        for (int i26 = 0; i26 < list2.size(); i26++) {
                            s5Var.b(i25, list2.get(i26), o10);
                        }
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 28:
                    int i27 = iArr[i12];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    Class cls3 = g6.a;
                    if (list3 == null) {
                        continue;
                    } else if (!list3.isEmpty()) {
                        s5Var.getClass();
                        for (int i28 = 0; i28 < list3.size(); i28++) {
                            ((w4) s5Var.a).c(i27, (v4) list3.get(i28));
                        }
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 29:
                    g6.c(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case zs.T /* 30 */:
                    g6.r(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case zs.U /* 31 */:
                    g6.x(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 32:
                    g6.y(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 33:
                    g6.a(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 34:
                    g6.b(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 35:
                    g6.q(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 36:
                    g6.u(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 37:
                    g6.w(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 38:
                    g6.d(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 39:
                    g6.v(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 40:
                    g6.t(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 41:
                    g6.s(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 42:
                    g6.p(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 43:
                    g6.c(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 44:
                    g6.r(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 45:
                    g6.x(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 46:
                    g6.y(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 47:
                    g6.a(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 48:
                    g6.b(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 49:
                    int i29 = iArr[i12];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    f6 o11 = x5Var.o(i12);
                    Class cls4 = g6.a;
                    if (list4 == null) {
                        continue;
                    } else if (!list4.isEmpty()) {
                        for (int i30 = 0; i30 < list4.size(); i30++) {
                            s5Var.a(i29, list4.get(i30), o11);
                        }
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 50:
                    if (unsafe.getObject(obj, j10) != null) {
                        int i31 = i12 / 3;
                        throw c3.i0.l(x5Var.b[i31 + i31]);
                    }
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case zs.o0 /* 51 */:
                    if (x5Var.i(i15, i12, obj)) {
                        ((w4) s5Var.a).f(i15, Double.doubleToRawLongBits(((Double) q6.h(obj, j10)).doubleValue()));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case zs.p0 /* 52 */:
                    if (x5Var.i(i15, i12, obj)) {
                        ((w4) s5Var.a).d(i15, Float.floatToRawIntBits(((Float) q6.h(obj, j10)).floatValue()));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case zs.q0 /* 53 */:
                    if (x5Var.i(i15, i12, obj)) {
                        ((w4) s5Var.a).k(i15, n(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case zs.r0 /* 54 */:
                    if (x5Var.i(i15, i12, obj)) {
                        ((w4) s5Var.a).k(i15, n(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case zs.s0 /* 55 */:
                    if (x5Var.i(i15, i12, obj)) {
                        int k10 = k(obj, j10);
                        w4 w4Var7 = (w4) s5Var.a;
                        w4Var7.j(i15 << 3);
                        if (k10 >= 0) {
                            w4Var7.j(k10);
                        } else {
                            w4Var7.l(k10);
                        }
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case zs.t0 /* 56 */:
                    if (x5Var.i(i15, i12, obj)) {
                        ((w4) s5Var.a).f(i15, n(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case zs.u0 /* 57 */:
                    if (x5Var.i(i15, i12, obj)) {
                        ((w4) s5Var.a).d(i15, k(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case zs.v0 /* 58 */:
                    if (x5Var.i(i15, i12, obj)) {
                        boolean booleanValue = ((Boolean) q6.h(obj, j10)).booleanValue();
                        w4 w4Var8 = (w4) s5Var.a;
                        w4Var8.j(i15 << 3);
                        w4Var8.a(booleanValue ? (byte) 1 : (byte) 0);
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case zs.w0 /* 59 */:
                    if (x5Var.i(i15, i12, obj)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof String) {
                            ((w4) s5Var.a).h(i15, (String) object2);
                        } else {
                            ((w4) s5Var.a).c(i15, (v4) object2);
                        }
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case zs.x0 /* 60 */:
                    if (x5Var.i(i15, i12, obj)) {
                        s5Var.b(i15, unsafe.getObject(obj, j10), x5Var.o(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case zs.y0 /* 61 */:
                    if (x5Var.i(i15, i12, obj)) {
                        ((w4) s5Var.a).c(i15, (v4) unsafe.getObject(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case zs.z0 /* 62 */:
                    if (x5Var.i(i15, i12, obj)) {
                        int k11 = k(obj, j10);
                        w4 w4Var9 = (w4) s5Var.a;
                        w4Var9.j(i15 << 3);
                        w4Var9.j(k11);
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case zs.A0 /* 63 */:
                    if (x5Var.i(i15, i12, obj)) {
                        int k12 = k(obj, j10);
                        w4 w4Var10 = (w4) s5Var.a;
                        w4Var10.j(i15 << 3);
                        if (k12 >= 0) {
                            w4Var10.j(k12);
                        } else {
                            w4Var10.l(k12);
                        }
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 64:
                    if (x5Var.i(i15, i12, obj)) {
                        ((w4) s5Var.a).d(i15, k(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 65:
                    if (x5Var.i(i15, i12, obj)) {
                        ((w4) s5Var.a).f(i15, n(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case zs.D0 /* 66 */:
                    if (x5Var.i(i15, i12, obj)) {
                        int k13 = k(obj, j10);
                        w4 w4Var11 = (w4) s5Var.a;
                        w4Var11.j(i15 << 3);
                        w4Var11.j((k13 >> 31) ^ (k13 + k13));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case zs.E0 /* 67 */:
                    if (x5Var.i(i15, i12, obj)) {
                        long n10 = n(obj, j10);
                        ((w4) s5Var.a).k(i15, (n10 >> 63) ^ (n10 + n10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case zs.F0 /* 68 */:
                    if (x5Var.i(i15, i12, obj)) {
                        s5Var.a(i15, unsafe.getObject(obj, j10), x5Var.o(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                default:
                    i12 += 3;
                    i11 = 1048575;
            }
            x5Var = this;
            i12 += 3;
            i11 = 1048575;
        }
    }

    @Override // com.google.android.gms.internal.cast.f6
    public final boolean f(Object obj) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i14 < this.e) {
            int i16 = this.d[i14];
            int[] iArr = this.a;
            int i17 = iArr[i16];
            int m10 = m(i16);
            int i18 = iArr[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i15) {
                if (i19 != 1048575) {
                    i13 = i.getInt(obj, i19);
                }
                i11 = i16;
                i12 = i13;
                i10 = i19;
            } else {
                int i21 = i13;
                i10 = i15;
                i11 = i16;
                i12 = i21;
            }
            if ((268435456 & m10) == 0 || v(obj, i11, i10, i12, i20)) {
                int l4 = l(m10);
                if (l4 == 9 || l4 == 17) {
                    if (v(obj, i11, i10, i12, i20) && !o(i11).f(q6.h(obj, m10 & 1048575))) {
                    }
                    i14++;
                    i15 = i10;
                    i13 = i12;
                } else {
                    if (l4 != 27) {
                        if (l4 == 60 || l4 == 68) {
                            if (i(i17, i11, obj) && !o(i11).f(q6.h(obj, m10 & 1048575))) {
                            }
                        } else if (l4 != 49) {
                            if (l4 == 50) {
                                q6.h(obj, m10 & 1048575).getClass();
                                throw new ClassCastException();
                            }
                        }
                        i14++;
                        i15 = i10;
                        i13 = i12;
                    }
                    List list = (List) q6.h(obj, m10 & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        f6 o10 = o(i11);
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            if (o10.f(list.get(i22))) {
                            }
                        }
                    }
                    i14++;
                    i15 = i10;
                    i13 = i12;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.cast.f6
    public final int g(r4 r4Var) {
        int i10;
        int i11;
        int a2;
        int o10;
        int h10;
        int o11;
        int size;
        int n10;
        int o12;
        int o13;
        int o14;
        int o15;
        int o16;
        int i12;
        int i13;
        x5 x5Var = this;
        r4 r4Var2 = r4Var;
        Unsafe unsafe = i;
        int i14 = 1048575;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int[] iArr = x5Var.a;
            if (i16 >= iArr.length) {
                x5Var.g.getClass();
                h6 h6Var = ((d5) r4Var).zzc;
                int i19 = h6Var.c;
                if (i19 == -1) {
                    h6Var.c = 0;
                    i10 = 0;
                } else {
                    i10 = i19;
                }
                return i10 + i18;
            }
            int m10 = x5Var.m(i16);
            int l4 = l(m10);
            int i20 = iArr[i16];
            int i21 = iArr[i16 + 2];
            int i22 = i21 & i14;
            if (l4 <= 17) {
                if (i22 != i15) {
                    i17 = i22 == i14 ? 0 : unsafe.getInt(r4Var2, i22);
                    i15 = i22;
                }
                i11 = 1 << (i21 >>> 20);
            } else {
                i11 = 0;
            }
            int i23 = m10 & i14;
            if (l4 >= a5.b.a) {
                a5.c.getClass();
            }
            long j10 = i23;
            switch (l4) {
                case 0:
                    if (x5Var.v(r4Var2, i16, i15, i17, i11)) {
                        i18 = c3.i0.h(i20 << 3, 8, i18);
                    }
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 1:
                    if (x5Var.v(r4Var2, i16, i15, i17, i11)) {
                        i18 = c3.i0.h(i20 << 3, 4, i18);
                    }
                    x5Var = this;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 2:
                    if (x5Var.v(r4Var2, i16, i15, i17, i11)) {
                        i18 = c3.i0.h(i20 << 3, w4.p(unsafe.getLong(r4Var2, j10)), i18);
                    }
                    x5Var = this;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 3:
                    if (x5Var.v(r4Var2, i16, i15, i17, i11)) {
                        i18 = c3.i0.h(i20 << 3, w4.p(unsafe.getLong(r4Var2, j10)), i18);
                    }
                    x5Var = this;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 4:
                    if (x5Var.v(r4Var2, i16, i15, i17, i11)) {
                        i18 = c3.i0.h(i20 << 3, w4.m(unsafe.getInt(r4Var2, j10)), i18);
                    }
                    x5Var = this;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 5:
                    if (x5Var.v(r4Var2, i16, i15, i17, i11)) {
                        i18 = c3.i0.h(i20 << 3, 8, i18);
                    }
                    x5Var = this;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 6:
                    if (x5Var.v(r4Var2, i16, i15, i17, i11)) {
                        i18 = c3.i0.h(i20 << 3, 4, i18);
                    }
                    x5Var = this;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 7:
                    if (x5Var.v(r4Var2, i16, i15, i17, i11)) {
                        i18 = c3.i0.h(i20 << 3, 1, i18);
                    }
                    x5Var = this;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 8:
                    if (x5Var.v(r4Var2, i16, i15, i17, i11)) {
                        int i24 = i20 << 3;
                        Object object = unsafe.getObject(r4Var2, j10);
                        if (object instanceof v4) {
                            Logger logger = w4.e;
                            int n11 = ((v4) object).n();
                            i18 = c3.i0.h(i24, w4.o(n11) + n11, i18);
                        } else {
                            i18 = c3.i0.h(i24, w4.n((String) object), i18);
                        }
                    }
                    x5Var = this;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 9:
                    if (x5Var.v(r4Var2, i16, i15, i17, i11)) {
                        Object object2 = unsafe.getObject(r4Var2, j10);
                        f6 o17 = x5Var.o(i16);
                        Class cls = g6.a;
                        Logger logger2 = w4.e;
                        int a10 = ((r4) object2).a(o17);
                        i18 = c3.i0.h(i20 << 3, w4.o(a10) + a10, i18);
                    }
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 10:
                    if (x5Var.v(r4Var2, i16, i15, i17, i11)) {
                        v4 v4Var = (v4) unsafe.getObject(r4Var2, j10);
                        Logger logger3 = w4.e;
                        int n12 = v4Var.n();
                        i18 = c3.i0.h(i20 << 3, w4.o(n12) + n12, i18);
                    }
                    x5Var = this;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 11:
                    if (x5Var.v(r4Var2, i16, i15, i17, i11)) {
                        i18 = c3.i0.h(i20 << 3, w4.o(unsafe.getInt(r4Var2, j10)), i18);
                    }
                    x5Var = this;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 12:
                    if (x5Var.v(r4Var2, i16, i15, i17, i11)) {
                        i18 = c3.i0.h(i20 << 3, w4.m(unsafe.getInt(r4Var2, j10)), i18);
                    }
                    x5Var = this;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 13:
                    if (x5Var.v(r4Var2, i16, i15, i17, i11)) {
                        i18 = c3.i0.h(i20 << 3, 4, i18);
                    }
                    x5Var = this;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 14:
                    if (x5Var.v(r4Var2, i16, i15, i17, i11)) {
                        i18 = c3.i0.h(i20 << 3, 8, i18);
                    }
                    x5Var = this;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 15:
                    if (x5Var.v(r4Var2, i16, i15, i17, i11)) {
                        int i25 = unsafe.getInt(r4Var2, j10);
                        i18 = c3.i0.h((i25 >> 31) ^ (i25 + i25), w4.o(i20 << 3), i18);
                    }
                    x5Var = this;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 16:
                    if (x5Var.v(r4Var2, i16, i15, i17, i11)) {
                        long j11 = unsafe.getLong(r4Var2, j10);
                        i18 += w4.p((j11 >> 63) ^ (j11 + j11)) + w4.o(i20 << 3);
                    }
                    x5Var = this;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 17:
                    if (x5Var.v(r4Var2, i16, i15, i17, i11)) {
                        r4 r4Var3 = (r4) unsafe.getObject(r4Var2, j10);
                        f6 o18 = x5Var.o(i16);
                        Logger logger4 = w4.e;
                        a2 = r4Var3.a(o18);
                        o10 = w4.o(i20 << 3);
                        i12 = o10 + o10;
                        i18 += i12 + a2;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                case 18:
                    h10 = g6.h(i20, (List) unsafe.getObject(r4Var2, j10));
                    i18 += h10;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 19:
                    h10 = g6.g(i20, (List) unsafe.getObject(r4Var2, j10));
                    i18 += h10;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(r4Var2, j10);
                    Class cls2 = g6.a;
                    if (list.size() != 0) {
                        o11 = (w4.o(i20 << 3) * list.size()) + g6.j(list);
                        i18 += o11;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                    o11 = 0;
                    i18 += o11;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(r4Var2, j10);
                    Class cls3 = g6.a;
                    size = list2.size();
                    if (size != 0) {
                        n10 = g6.n(list2);
                        o12 = w4.o(i20 << 3);
                        o13 = (o12 * size) + n10;
                        i18 += o13;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                    o13 = 0;
                    i18 += o13;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(r4Var2, j10);
                    Class cls4 = g6.a;
                    size = list3.size();
                    if (size != 0) {
                        n10 = g6.i(list3);
                        o12 = w4.o(i20 << 3);
                        o13 = (o12 * size) + n10;
                        i18 += o13;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                    o13 = 0;
                    i18 += o13;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 23:
                    h10 = g6.h(i20, (List) unsafe.getObject(r4Var2, j10));
                    i18 += h10;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 24:
                    h10 = g6.g(i20, (List) unsafe.getObject(r4Var2, j10));
                    i18 += h10;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(r4Var2, j10);
                    Class cls5 = g6.a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        o11 = (w4.o(i20 << 3) + 1) * size2;
                        i18 += o11;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                    o11 = 0;
                    i18 += o11;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(r4Var2, j10);
                    Class cls6 = g6.a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        boolean z10 = list5 instanceof m5;
                        o13 = w4.o(i20 << 3) * size3;
                        if (z10) {
                            m5 m5Var = (m5) list5;
                            for (int i26 = 0; i26 < size3; i26++) {
                                Object d = m5Var.d(i26);
                                if (d instanceof v4) {
                                    int n13 = ((v4) d).n();
                                    o13 = c3.i0.h(n13, n13, o13);
                                } else {
                                    o13 = w4.n((String) d) + o13;
                                }
                            }
                        } else {
                            for (int i27 = 0; i27 < size3; i27++) {
                                Object obj = list5.get(i27);
                                if (obj instanceof v4) {
                                    int n14 = ((v4) obj).n();
                                    o13 = c3.i0.h(n14, n14, o13);
                                } else {
                                    o13 = w4.n((String) obj) + o13;
                                }
                            }
                        }
                        i18 += o13;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                    o13 = 0;
                    i18 += o13;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(r4Var2, j10);
                    f6 o19 = x5Var.o(i16);
                    Class cls7 = g6.a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        o14 = 0;
                    } else {
                        o14 = w4.o(i20 << 3) * size4;
                        for (int i28 = 0; i28 < size4; i28++) {
                            int a11 = ((r4) list6.get(i28)).a(o19);
                            o14 = c3.i0.h(a11, a11, o14);
                        }
                    }
                    i18 += o14;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(r4Var2, j10);
                    Class cls8 = g6.a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        o13 = w4.o(i20 << 3) * size5;
                        for (int i29 = 0; i29 < list7.size(); i29++) {
                            int n15 = ((v4) list7.get(i29)).n();
                            o13 = c3.i0.h(n15, n15, o13);
                        }
                        i18 += o13;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                    o13 = 0;
                    i18 += o13;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(r4Var2, j10);
                    Class cls9 = g6.a;
                    size = list8.size();
                    if (size != 0) {
                        n10 = g6.m(list8);
                        o12 = w4.o(i20 << 3);
                        o13 = (o12 * size) + n10;
                        i18 += o13;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                    o13 = 0;
                    i18 += o13;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case zs.T /* 30 */:
                    List list9 = (List) unsafe.getObject(r4Var2, j10);
                    Class cls10 = g6.a;
                    size = list9.size();
                    if (size != 0) {
                        n10 = g6.f(list9);
                        o12 = w4.o(i20 << 3);
                        o13 = (o12 * size) + n10;
                        i18 += o13;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                    o13 = 0;
                    i18 += o13;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case zs.U /* 31 */:
                    h10 = g6.g(i20, (List) unsafe.getObject(r4Var2, j10));
                    i18 += h10;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 32:
                    h10 = g6.h(i20, (List) unsafe.getObject(r4Var2, j10));
                    i18 += h10;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(r4Var2, j10);
                    Class cls11 = g6.a;
                    size = list10.size();
                    if (size != 0) {
                        n10 = g6.k(list10);
                        o12 = w4.o(i20 << 3);
                        o13 = (o12 * size) + n10;
                        i18 += o13;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                    o13 = 0;
                    i18 += o13;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(r4Var2, j10);
                    Class cls12 = g6.a;
                    size = list11.size();
                    if (size != 0) {
                        n10 = g6.l(list11);
                        o12 = w4.o(i20 << 3);
                        o13 = (o12 * size) + n10;
                        i18 += o13;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                    o13 = 0;
                    i18 += o13;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 35:
                    List list12 = (List) unsafe.getObject(r4Var2, j10);
                    Class cls13 = g6.a;
                    a2 = list12.size() * 8;
                    if (a2 > 0) {
                        o15 = w4.o(a2);
                        o16 = w4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(r4Var2, j10);
                    Class cls14 = g6.a;
                    a2 = list13.size() * 4;
                    if (a2 > 0) {
                        o15 = w4.o(a2);
                        o16 = w4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                case 37:
                    a2 = g6.j((List) unsafe.getObject(r4Var2, j10));
                    if (a2 > 0) {
                        o15 = w4.o(a2);
                        o16 = w4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                case 38:
                    a2 = g6.n((List) unsafe.getObject(r4Var2, j10));
                    if (a2 > 0) {
                        o15 = w4.o(a2);
                        o16 = w4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                case 39:
                    a2 = g6.i((List) unsafe.getObject(r4Var2, j10));
                    if (a2 > 0) {
                        o15 = w4.o(a2);
                        o16 = w4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(r4Var2, j10);
                    Class cls15 = g6.a;
                    a2 = list14.size() * 8;
                    if (a2 > 0) {
                        o15 = w4.o(a2);
                        o16 = w4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(r4Var2, j10);
                    Class cls16 = g6.a;
                    a2 = list15.size() * 4;
                    if (a2 > 0) {
                        o15 = w4.o(a2);
                        o16 = w4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(r4Var2, j10);
                    Class cls17 = g6.a;
                    a2 = list16.size();
                    if (a2 > 0) {
                        o15 = w4.o(a2);
                        o16 = w4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                case 43:
                    a2 = g6.m((List) unsafe.getObject(r4Var2, j10));
                    if (a2 > 0) {
                        o15 = w4.o(a2);
                        o16 = w4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                case 44:
                    a2 = g6.f((List) unsafe.getObject(r4Var2, j10));
                    if (a2 > 0) {
                        o15 = w4.o(a2);
                        o16 = w4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(r4Var2, j10);
                    Class cls18 = g6.a;
                    a2 = list17.size() * 4;
                    if (a2 > 0) {
                        o15 = w4.o(a2);
                        o16 = w4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(r4Var2, j10);
                    Class cls19 = g6.a;
                    a2 = list18.size() * 8;
                    if (a2 > 0) {
                        o15 = w4.o(a2);
                        o16 = w4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                case 47:
                    a2 = g6.k((List) unsafe.getObject(r4Var2, j10));
                    if (a2 > 0) {
                        o15 = w4.o(a2);
                        o16 = w4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                case 48:
                    a2 = g6.l((List) unsafe.getObject(r4Var2, j10));
                    if (a2 > 0) {
                        o15 = w4.o(a2);
                        o16 = w4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(r4Var2, j10);
                    f6 o20 = x5Var.o(i16);
                    Class cls20 = g6.a;
                    int size6 = list19.size();
                    if (size6 == 0) {
                        i13 = 0;
                    } else {
                        i13 = 0;
                        for (int i30 = 0; i30 < size6; i30++) {
                            r4 r4Var4 = (r4) list19.get(i30);
                            Logger logger5 = w4.e;
                            int a12 = r4Var4.a(o20);
                            int o21 = w4.o(i20 << 3);
                            i13 += o21 + o21 + a12;
                        }
                    }
                    i18 += i13;
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 50:
                    Object object3 = unsafe.getObject(r4Var2, j10);
                    int i31 = i16 / 3;
                    Object obj2 = x5Var.b[i31 + i31];
                    if (object3 == null) {
                        throw c3.i0.l(obj2);
                    }
                    throw new ClassCastException();
                case zs.o0 /* 51 */:
                    if (x5Var.i(i20, i16, r4Var2)) {
                        i18 = c3.i0.h(i20 << 3, 8, i18);
                    }
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case zs.p0 /* 52 */:
                    if (x5Var.i(i20, i16, r4Var2)) {
                        i18 = c3.i0.h(i20 << 3, 4, i18);
                    }
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case zs.q0 /* 53 */:
                    if (x5Var.i(i20, i16, r4Var2)) {
                        i18 = c3.i0.h(i20 << 3, w4.p(n(r4Var2, j10)), i18);
                    }
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case zs.r0 /* 54 */:
                    if (x5Var.i(i20, i16, r4Var2)) {
                        i18 = c3.i0.h(i20 << 3, w4.p(n(r4Var2, j10)), i18);
                    }
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case zs.s0 /* 55 */:
                    if (x5Var.i(i20, i16, r4Var2)) {
                        i18 = c3.i0.h(i20 << 3, w4.m(k(r4Var2, j10)), i18);
                    }
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case zs.t0 /* 56 */:
                    if (x5Var.i(i20, i16, r4Var2)) {
                        i18 = c3.i0.h(i20 << 3, 8, i18);
                    }
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case zs.u0 /* 57 */:
                    if (x5Var.i(i20, i16, r4Var2)) {
                        i18 = c3.i0.h(i20 << 3, 4, i18);
                    }
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case zs.v0 /* 58 */:
                    if (x5Var.i(i20, i16, r4Var2)) {
                        i18 = c3.i0.h(i20 << 3, 1, i18);
                    }
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case zs.w0 /* 59 */:
                    if (x5Var.i(i20, i16, r4Var2)) {
                        int i32 = i20 << 3;
                        Object object4 = unsafe.getObject(r4Var2, j10);
                        if (object4 instanceof v4) {
                            Logger logger6 = w4.e;
                            int n16 = ((v4) object4).n();
                            i18 = c3.i0.h(i32, w4.o(n16) + n16, i18);
                        } else {
                            i18 = c3.i0.h(i32, w4.n((String) object4), i18);
                        }
                    }
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case zs.x0 /* 60 */:
                    if (x5Var.i(i20, i16, r4Var2)) {
                        Object object5 = unsafe.getObject(r4Var2, j10);
                        f6 o22 = x5Var.o(i16);
                        Class cls21 = g6.a;
                        Logger logger7 = w4.e;
                        int a13 = ((r4) object5).a(o22);
                        i18 = c3.i0.h(i20 << 3, w4.o(a13) + a13, i18);
                    }
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case zs.y0 /* 61 */:
                    if (x5Var.i(i20, i16, r4Var2)) {
                        v4 v4Var2 = (v4) unsafe.getObject(r4Var2, j10);
                        Logger logger8 = w4.e;
                        int n17 = v4Var2.n();
                        i18 = c3.i0.h(i20 << 3, w4.o(n17) + n17, i18);
                    }
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case zs.z0 /* 62 */:
                    if (x5Var.i(i20, i16, r4Var2)) {
                        i18 = c3.i0.h(i20 << 3, w4.o(k(r4Var2, j10)), i18);
                    }
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case zs.A0 /* 63 */:
                    if (x5Var.i(i20, i16, r4Var2)) {
                        i18 = c3.i0.h(i20 << 3, w4.m(k(r4Var2, j10)), i18);
                    }
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 64:
                    if (x5Var.i(i20, i16, r4Var2)) {
                        i18 = c3.i0.h(i20 << 3, 4, i18);
                    }
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case 65:
                    if (x5Var.i(i20, i16, r4Var2)) {
                        i18 = c3.i0.h(i20 << 3, 8, i18);
                    }
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case zs.D0 /* 66 */:
                    if (x5Var.i(i20, i16, r4Var2)) {
                        int k10 = k(r4Var2, j10);
                        i18 = c3.i0.h((k10 >> 31) ^ (k10 + k10), w4.o(i20 << 3), i18);
                    }
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
                case zs.E0 /* 67 */:
                    if (x5Var.i(i20, i16, r4Var2)) {
                        long n18 = n(r4Var2, j10);
                        a2 = w4.o(i20 << 3);
                        i12 = w4.p((n18 >> 63) ^ (n18 + n18));
                        i18 += i12 + a2;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                case zs.F0 /* 68 */:
                    if (x5Var.i(i20, i16, r4Var2)) {
                        r4 r4Var5 = (r4) unsafe.getObject(r4Var2, j10);
                        f6 o23 = x5Var.o(i16);
                        Logger logger9 = w4.e;
                        a2 = r4Var5.a(o23);
                        o10 = w4.o(i20 << 3);
                        i12 = o10 + o10;
                        i18 += i12 + a2;
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        r4Var2 = r4Var;
                        i14 = 1048575;
                    }
                default:
                    i16 += 3;
                    r4Var2 = r4Var;
                    i14 = 1048575;
            }
        }
    }

    public final boolean i(int i10, int i11, Object obj) {
        return q6.e(obj, (long) (this.a[i11 + 2] & 1048575)) == i10;
    }

    public final int m(int i10) {
        return this.a[i10 + 1];
    }

    public final f6 o(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        Object[] objArr = this.b;
        f6 f6Var = (f6) objArr[i12];
        if (f6Var != null) {
            return f6Var;
        }
        f6 a2 = c6.c.a((Class) objArr[i12 + 1]);
        objArr[i12] = a2;
        return a2;
    }

    public final void q(int i10, Object obj, Object obj2) {
        if (u(i10, obj2)) {
            int m10 = m(i10) & 1048575;
            Unsafe unsafe = i;
            long j10 = m10;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i10] + " is present but null: " + obj2.toString());
            }
            f6 o10 = o(i10);
            if (!u(i10, obj)) {
                if (h(object)) {
                    d5 zzc = o10.zzc();
                    o10.d(zzc, object);
                    unsafe.putObject(obj, j10, zzc);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                s(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!h(object2)) {
                d5 zzc2 = o10.zzc();
                o10.d(zzc2, object2);
                unsafe.putObject(obj, j10, zzc2);
                object2 = zzc2;
            }
            o10.d(object2, object);
        }
    }

    public final void r(int i10, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i11 = iArr[i10];
        if (i(i11, i10, obj2)) {
            int m10 = m(i10) & 1048575;
            Unsafe unsafe = i;
            long j10 = m10;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2.toString());
            }
            f6 o10 = o(i10);
            if (!i(i11, i10, obj)) {
                if (h(object)) {
                    d5 zzc = o10.zzc();
                    o10.d(zzc, object);
                    unsafe.putObject(obj, j10, zzc);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                q6.j(obj, iArr[i10 + 2] & 1048575, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!h(object2)) {
                d5 zzc2 = o10.zzc();
                o10.d(zzc2, object2);
                unsafe.putObject(obj, j10, zzc2);
                object2 = zzc2;
            }
            o10.d(object2, object);
        }
    }

    public final void s(int i10, Object obj) {
        int i11 = this.a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        q6.j(obj, j10, (1 << (i11 >>> 20)) | q6.e(obj, j10));
    }

    public final boolean t(d5 d5Var, d5 d5Var2, int i10) {
        return u(i10, d5Var) == u(i10, d5Var2);
    }

    public final boolean u(int i10, Object obj) {
        int i11 = this.a[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 == 1048575) {
            int m10 = m(i10);
            long j11 = m10 & 1048575;
            switch (l(m10)) {
                case 0:
                    if (Double.doubleToRawLongBits(q6.c.a(obj, j11)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(q6.c.b(obj, j11)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (q6.f(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (q6.f(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (q6.e(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (q6.f(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (q6.e(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return q6.c.g(obj, j11);
                case 8:
                    Object h10 = q6.h(obj, j11);
                    if (h10 instanceof String) {
                        if (((String) h10).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(h10 instanceof v4)) {
                            throw new IllegalArgumentException();
                        }
                        if (v4.c.equals(h10)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (q6.h(obj, j11) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (v4.c.equals(q6.h(obj, j11))) {
                        return false;
                    }
                    break;
                case 11:
                    if (q6.e(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (q6.e(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (q6.e(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (q6.f(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (q6.e(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (q6.f(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (q6.h(obj, j11) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & q6.e(obj, j10)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean v(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? u(i10, obj) : (i12 & i13) != 0;
    }

    @Override // com.google.android.gms.internal.cast.f6
    public final d5 zzc() {
        return (d5) ((d5) this.c).h(4, null);
    }
}
