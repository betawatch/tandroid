package com.google.android.gms.internal.cast;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class v5 implements d6 {
    public static final int[] h = new int[0];
    public static final Unsafe i = o6.i();
    public final int[] a;
    public final Object[] b;
    public final q4 c;
    public final int[] d;
    public final int e;
    public final n5 f;
    public final g6 g;

    public v5(int[] iArr, Object[] objArr, q4 q4Var, int[] iArr2, int i7, n5 n5Var, g6 g6Var, w4 w4Var) {
        this.a = iArr;
        this.b = objArr;
        this.d = iArr2;
        this.e = i7;
        this.f = n5Var;
        this.g = g6Var;
        this.c = q4Var;
    }

    public static boolean h(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof b5) {
            return ((b5) obj).g();
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
    public static v5 j(c6 c6Var, n5 n5Var, g6 g6Var, w4 w4Var) {
        int i7;
        int charAt;
        int charAt2;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        char charAt3;
        int i14;
        char charAt4;
        int i15;
        char charAt5;
        int i16;
        char charAt6;
        int i17;
        int i18;
        int i19;
        char charAt7;
        int i20;
        char charAt8;
        int i21;
        int i22;
        int i23;
        Object[] objArr;
        int i24;
        int i25;
        int i26;
        int objectFieldOffset;
        int i27;
        String str;
        char c10;
        int i28;
        int i29;
        int i30;
        int i31;
        Field p10;
        char charAt9;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        Object obj;
        Field p11;
        Object obj2;
        Field p12;
        int i38;
        char charAt10;
        int i39;
        int i40;
        char charAt11;
        int i41;
        char charAt12;
        int i42;
        char charAt13;
        if (!(c6Var instanceof c6)) {
            c6Var.getClass();
            throw new ClassCastException();
        }
        String str2 = c6Var.b;
        int length = str2.length();
        char c11 = 55296;
        if (str2.charAt(0) >= 55296) {
            int i43 = 1;
            while (true) {
                i7 = i43 + 1;
                if (str2.charAt(i43) < 55296) {
                    break;
                }
                i43 = i7;
            }
        } else {
            i7 = 1;
        }
        int i44 = i7 + 1;
        int charAt14 = str2.charAt(i7);
        if (charAt14 >= 55296) {
            int i45 = charAt14 & 8191;
            int i46 = 13;
            while (true) {
                i42 = i44 + 1;
                charAt13 = str2.charAt(i44);
                if (charAt13 < 55296) {
                    break;
                }
                i45 |= (charAt13 & 8191) << i46;
                i46 += 13;
                i44 = i42;
            }
            charAt14 = i45 | (charAt13 << i46);
            i44 = i42;
        }
        if (charAt14 == 0) {
            charAt = 0;
            charAt2 = 0;
            i10 = 0;
            i12 = 0;
            iArr = h;
            i11 = 0;
        } else {
            int i47 = i44 + 1;
            int charAt15 = str2.charAt(i44);
            if (charAt15 >= 55296) {
                int i48 = charAt15 & 8191;
                int i49 = 13;
                while (true) {
                    i20 = i47 + 1;
                    charAt8 = str2.charAt(i47);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i48 |= (charAt8 & 8191) << i49;
                    i49 += 13;
                    i47 = i20;
                }
                charAt15 = i48 | (charAt8 << i49);
                i47 = i20;
            }
            int i50 = i47 + 1;
            int charAt16 = str2.charAt(i47);
            if (charAt16 >= 55296) {
                int i51 = charAt16 & 8191;
                int i52 = 13;
                while (true) {
                    i19 = i50 + 1;
                    charAt7 = str2.charAt(i50);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i51 |= (charAt7 & 8191) << i52;
                    i52 += 13;
                    i50 = i19;
                }
                charAt16 = i51 | (charAt7 << i52);
                i50 = i19;
            }
            int i53 = i50 + 1;
            if (str2.charAt(i50) >= 55296) {
                while (true) {
                    i18 = i53 + 1;
                    if (str2.charAt(i53) < 55296) {
                        break;
                    }
                    i53 = i18;
                }
                i53 = i18;
            }
            int i54 = i53 + 1;
            if (str2.charAt(i53) >= 55296) {
                while (true) {
                    i17 = i54 + 1;
                    if (str2.charAt(i54) < 55296) {
                        break;
                    }
                    i54 = i17;
                }
                i54 = i17;
            }
            int i55 = i54 + 1;
            charAt = str2.charAt(i54);
            if (charAt >= 55296) {
                int i56 = charAt & 8191;
                int i57 = 13;
                while (true) {
                    i16 = i55 + 1;
                    charAt6 = str2.charAt(i55);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i56 |= (charAt6 & 8191) << i57;
                    i57 += 13;
                    i55 = i16;
                }
                charAt = i56 | (charAt6 << i57);
                i55 = i16;
            }
            int i58 = i55 + 1;
            charAt2 = str2.charAt(i55);
            if (charAt2 >= 55296) {
                int i59 = charAt2 & 8191;
                int i60 = 13;
                while (true) {
                    i15 = i58 + 1;
                    charAt5 = str2.charAt(i58);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i59 |= (charAt5 & 8191) << i60;
                    i60 += 13;
                    i58 = i15;
                }
                charAt2 = i59 | (charAt5 << i60);
                i58 = i15;
            }
            int i61 = i58 + 1;
            int charAt17 = str2.charAt(i58);
            if (charAt17 >= 55296) {
                int i62 = charAt17 & 8191;
                int i63 = 13;
                while (true) {
                    i14 = i61 + 1;
                    charAt4 = str2.charAt(i61);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i62 |= (charAt4 & 8191) << i63;
                    i63 += 13;
                    i61 = i14;
                }
                charAt17 = i62 | (charAt4 << i63);
                i61 = i14;
            }
            int i64 = i61 + 1;
            int charAt18 = str2.charAt(i61);
            if (charAt18 >= 55296) {
                int i65 = charAt18 & 8191;
                int i66 = 13;
                while (true) {
                    i13 = i64 + 1;
                    charAt3 = str2.charAt(i64);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i65 |= (charAt3 & 8191) << i66;
                    i66 += 13;
                    i64 = i13;
                }
                charAt18 = i65 | (charAt3 << i66);
                i64 = i13;
            }
            int i67 = charAt18 + charAt2 + charAt17;
            i10 = charAt15 + charAt15 + charAt16;
            i11 = charAt15;
            i44 = i64;
            iArr = new int[i67];
            i12 = charAt18;
        }
        Unsafe unsafe = i;
        Object[] objArr2 = c6Var.c;
        Class<?> cls = c6Var.a.getClass();
        int i68 = charAt2 + i12;
        int i69 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr3 = new Object[i69];
        int i70 = i12;
        int i71 = 0;
        int i72 = 0;
        while (i44 < length) {
            int i73 = i44 + 1;
            int charAt19 = str2.charAt(i44);
            if (charAt19 >= c11) {
                int i74 = charAt19 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i41 = i75 + 1;
                    charAt12 = str2.charAt(i75);
                    if (charAt12 < c11) {
                        break;
                    }
                    i74 |= (charAt12 & 8191) << i76;
                    i76 += 13;
                    i75 = i41;
                }
                charAt19 = i74 | (charAt12 << i76);
                i21 = i41;
            } else {
                i21 = i73;
            }
            int i77 = i21 + 1;
            int charAt20 = str2.charAt(i21);
            if (charAt20 >= c11) {
                int i78 = charAt20 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i40 = i79 + 1;
                    charAt11 = str2.charAt(i79);
                    i22 = length;
                    if (charAt11 < 55296) {
                        break;
                    }
                    i78 |= (charAt11 & 8191) << i80;
                    i80 += 13;
                    i79 = i40;
                    length = i22;
                }
                charAt20 = i78 | (charAt11 << i80);
                i23 = i40;
            } else {
                i22 = length;
                i23 = i77;
            }
            if ((charAt20 & 1024) != 0) {
                iArr[i71] = i72;
                i71++;
            }
            int i81 = charAt20 & qs.e4;
            int i82 = charAt19;
            int i83 = charAt20 & 2048;
            if (i81 >= 51) {
                int i84 = i23 + 1;
                int charAt21 = str2.charAt(i23);
                if (charAt21 >= 55296) {
                    int i85 = charAt21 & 8191;
                    int i86 = i84;
                    int i87 = 13;
                    while (true) {
                        i38 = i86 + 1;
                        charAt10 = str2.charAt(i86);
                        i39 = i85;
                        if (charAt10 < 55296) {
                            break;
                        }
                        i85 = i39 | ((charAt10 & 8191) << i87);
                        i87 += 13;
                        i86 = i38;
                    }
                    charAt21 = i39 | (charAt10 << i87);
                    i35 = i38;
                } else {
                    i35 = i84;
                }
                int i88 = charAt21;
                int i89 = i81 - 51;
                int i90 = i35;
                if (i89 == 9 || i89 == 17) {
                    i36 = i10 + 1;
                    int i91 = i72 / 3;
                    objArr3[i91 + i91 + 1] = objArr2[i10];
                } else {
                    if (i89 == 12) {
                        if (c6Var.a() == 1 || i83 != 0) {
                            i36 = i10 + 1;
                            int i92 = i72 / 3;
                            objArr3[i92 + i92 + 1] = objArr2[i10];
                        } else {
                            i37 = 0;
                            int i93 = i88 + i88;
                            obj = objArr2[i93];
                            int i94 = i37;
                            if (obj instanceof Field) {
                                p11 = (Field) obj;
                            } else {
                                p11 = p(cls, (String) obj);
                                objArr2[i93] = p11;
                            }
                            int i95 = i11;
                            objArr = objArr3;
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(p11);
                            int i96 = i93 + 1;
                            obj2 = objArr2[i96];
                            if (obj2 instanceof Field) {
                                p12 = (Field) obj2;
                            } else {
                                p12 = p(cls, (String) obj2);
                                objArr2[i96] = p12;
                            }
                            i24 = i95;
                            i26 = i94;
                            str = str2;
                            i25 = i10;
                            i30 = 0;
                            c10 = 55296;
                            i27 = (int) unsafe.objectFieldOffset(p12);
                            i31 = objectFieldOffset2;
                            i28 = i90;
                        }
                    }
                    i37 = i83;
                    int i932 = i88 + i88;
                    obj = objArr2[i932];
                    int i942 = i37;
                    if (obj instanceof Field) {
                    }
                    int i952 = i11;
                    objArr = objArr3;
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(p11);
                    int i962 = i932 + 1;
                    obj2 = objArr2[i962];
                    if (obj2 instanceof Field) {
                    }
                    i24 = i952;
                    i26 = i942;
                    str = str2;
                    i25 = i10;
                    i30 = 0;
                    c10 = 55296;
                    i27 = (int) unsafe.objectFieldOffset(p12);
                    i31 = objectFieldOffset22;
                    i28 = i90;
                }
                i10 = i36;
                i37 = i83;
                int i9322 = i88 + i88;
                obj = objArr2[i9322];
                int i9422 = i37;
                if (obj instanceof Field) {
                }
                int i9522 = i11;
                objArr = objArr3;
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(p11);
                int i9622 = i9322 + 1;
                obj2 = objArr2[i9622];
                if (obj2 instanceof Field) {
                }
                i24 = i9522;
                i26 = i9422;
                str = str2;
                i25 = i10;
                i30 = 0;
                c10 = 55296;
                i27 = (int) unsafe.objectFieldOffset(p12);
                i31 = objectFieldOffset222;
                i28 = i90;
            } else {
                int i97 = i11;
                objArr = objArr3;
                int i98 = i10 + 1;
                Field p13 = p(cls, (String) objArr2[i10]);
                i24 = i97;
                if (i81 == 9 || i81 == 17) {
                    i25 = i98;
                    int i99 = i72 / 3;
                    objArr[i99 + i99 + 1] = p13.getType();
                } else {
                    if (i81 == 27) {
                        i32 = i98;
                        i33 = 1;
                        i34 = i10 + 2;
                    } else if (i81 == 49) {
                        i34 = i10 + 2;
                        i32 = i98;
                        i33 = 1;
                    } else {
                        if (i81 == 12 || i81 == 30 || i81 == 44) {
                            i25 = i98;
                            if (c6Var.a() == 1 || i83 != 0) {
                                i34 = i10 + 2;
                                int i100 = i72 / 3;
                                objArr[i100 + i100 + 1] = objArr2[i25];
                                i25 = i34;
                            }
                        } else if (i81 == 50) {
                            int i101 = i10 + 2;
                            int i102 = i70 + 1;
                            iArr[i70] = i72;
                            int i103 = i72 / 3;
                            int i104 = i103 + i103;
                            objArr[i104] = objArr2[i98];
                            if (i83 != 0) {
                                objArr[i104 + 1] = objArr2[i101];
                                i26 = i83;
                                i70 = i102;
                                i25 = i10 + 3;
                                objectFieldOffset = (int) unsafe.objectFieldOffset(p13);
                                i27 = 1048575;
                                if ((charAt20 & TLObject.FLAG_12) != 0 || i81 > 17) {
                                    str = str2;
                                    c10 = 55296;
                                    i28 = i23;
                                    i29 = 0;
                                } else {
                                    int i105 = i23 + 1;
                                    int charAt22 = str2.charAt(i23);
                                    if (charAt22 >= 55296) {
                                        int i106 = charAt22 & 8191;
                                        int i107 = 13;
                                        while (true) {
                                            i28 = i105 + 1;
                                            charAt9 = str2.charAt(i105);
                                            if (charAt9 < 55296) {
                                                break;
                                            }
                                            i106 |= (charAt9 & 8191) << i107;
                                            i107 += 13;
                                            i105 = i28;
                                        }
                                        charAt22 = i106 | (charAt9 << i107);
                                    } else {
                                        i28 = i105;
                                    }
                                    int i108 = (charAt22 / 32) + i24 + i24;
                                    Object obj3 = objArr2[i108];
                                    if (obj3 instanceof Field) {
                                        p10 = (Field) obj3;
                                    } else {
                                        p10 = p(cls, (String) obj3);
                                        objArr2[i108] = p10;
                                    }
                                    str = str2;
                                    i29 = charAt22 % 32;
                                    i27 = (int) unsafe.objectFieldOffset(p10);
                                    c10 = 55296;
                                }
                                if (i81 >= 18 && i81 <= 49) {
                                    iArr[i68] = objectFieldOffset;
                                    i68++;
                                }
                                i30 = i29;
                                i31 = objectFieldOffset;
                            } else {
                                i70 = i102;
                                i25 = i101;
                            }
                        } else {
                            i25 = i98;
                        }
                        i26 = 0;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(p13);
                        i27 = 1048575;
                        if ((charAt20 & TLObject.FLAG_12) != 0) {
                        }
                        str = str2;
                        c10 = 55296;
                        i28 = i23;
                        i29 = 0;
                        if (i81 >= 18) {
                            iArr[i68] = objectFieldOffset;
                            i68++;
                        }
                        i30 = i29;
                        i31 = objectFieldOffset;
                    }
                    int i109 = i72 / 3;
                    objArr[i109 + i109 + i33] = objArr2[i32];
                    i25 = i34;
                }
                i26 = i83;
                objectFieldOffset = (int) unsafe.objectFieldOffset(p13);
                i27 = 1048575;
                if ((charAt20 & TLObject.FLAG_12) != 0) {
                }
                str = str2;
                c10 = 55296;
                i28 = i23;
                i29 = 0;
                if (i81 >= 18) {
                }
                i30 = i29;
                i31 = objectFieldOffset;
            }
            int i110 = i72 + 1;
            iArr2[i72] = i82;
            int i111 = i72 + 2;
            int i112 = i30;
            iArr2[i110] = ((charAt20 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((charAt20 & 256) != 0 ? TLObject.FLAG_28 : 0) | (i26 != 0 ? TLObject.FLAG_31 : 0) | (i81 << 20) | i31;
            i72 += 3;
            iArr2[i111] = (i112 << 20) | i27;
            str2 = str;
            i44 = i28;
            length = i22;
            i11 = i24;
            i10 = i25;
            c11 = c10;
            objArr3 = objArr;
        }
        return new v5(iArr2, objArr3, c6Var.a, iArr, i12, n5Var, g6Var, w4Var);
    }

    public static int k(Object obj, long j3) {
        return ((Integer) o6.h(obj, j3)).intValue();
    }

    public static int l(int i7) {
        return (i7 >>> 20) & qs.e4;
    }

    public static long n(Object obj, long j3) {
        return ((Long) o6.h(obj, j3)).longValue();
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
            StringBuilder n10 = com.google.android.recaptcha.internal.a.n("Field ", str, " for ", name, " not found. Known fields are ");
            n10.append(arrays);
            throw new RuntimeException(n10.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        continue;
     */
    @Override // com.google.android.gms.internal.cast.d6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        if (!h(obj)) {
            return;
        }
        if (obj instanceof b5) {
            b5 b5Var = (b5) obj;
            b5Var.f();
            b5Var.zza = 0;
            b5Var.d();
        }
        int i7 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i7 >= iArr.length) {
                this.g.getClass();
                f6 f6Var = ((b5) obj).zzc;
                if (f6Var.d) {
                    f6Var.d = false;
                    return;
                }
                return;
            }
            int m10 = m(i7);
            int i10 = 1048575 & m10;
            int l10 = l(m10);
            long j3 = i10;
            if (l10 != 9) {
                if (l10 != 60 && l10 != 68) {
                    switch (l10) {
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
                            this.f.a(obj, j3);
                            break;
                        case 50:
                            if (i.getObject(obj, j3) != null) {
                                throw new ClassCastException();
                            }
                            break;
                    }
                } else if (i(iArr[i7], i7, obj)) {
                    o(i7).a(i.getObject(obj, j3));
                }
                i7 += 3;
            }
            if (u(i7, obj)) {
                o(i7).a(i.getObject(obj, j3));
            }
            i7 += 3;
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
    @Override // com.google.android.gms.internal.cast.d6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(b5 b5Var) {
        int i7;
        long doubleToLongBits;
        int i10;
        int floatToIntBits;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i13 >= iArr.length) {
                this.g.getClass();
                b5Var.zzc.getClass();
                return (i14 * 53) + 506991;
            }
            int m10 = m(i13);
            int i15 = 1048575 & m10;
            int l10 = l(m10);
            int i16 = iArr[i13];
            long j3 = i15;
            int i17 = 1237;
            int i18 = 37;
            switch (l10) {
                case 0:
                    i7 = i14 * 53;
                    doubleToLongBits = Double.doubleToLongBits(o6.c.a(b5Var, j3));
                    Charset charset = h5.a;
                    i14 = i7 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i10 = i14 * 53;
                    floatToIntBits = Float.floatToIntBits(o6.c.b(b5Var, j3));
                    i14 = floatToIntBits + i10;
                    break;
                case 2:
                    i7 = i14 * 53;
                    doubleToLongBits = o6.f(b5Var, j3);
                    Charset charset2 = h5.a;
                    i14 = i7 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i7 = i14 * 53;
                    doubleToLongBits = o6.f(b5Var, j3);
                    Charset charset3 = h5.a;
                    i14 = i7 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i10 = i14 * 53;
                    floatToIntBits = o6.e(b5Var, j3);
                    i14 = floatToIntBits + i10;
                    break;
                case 5:
                    i7 = i14 * 53;
                    doubleToLongBits = o6.f(b5Var, j3);
                    Charset charset4 = h5.a;
                    i14 = i7 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i10 = i14 * 53;
                    floatToIntBits = o6.e(b5Var, j3);
                    i14 = floatToIntBits + i10;
                    break;
                case 7:
                    i11 = i14 * 53;
                    boolean g10 = o6.c.g(b5Var, j3);
                    Charset charset5 = h5.a;
                    break;
                case 8:
                    i10 = i14 * 53;
                    floatToIntBits = ((String) o6.h(b5Var, j3)).hashCode();
                    i14 = floatToIntBits + i10;
                    break;
                case 9:
                    i12 = i14 * 53;
                    Object h7 = o6.h(b5Var, j3);
                    if (h7 != null) {
                        i18 = h7.hashCode();
                    }
                    i14 = i12 + i18;
                    break;
                case 10:
                    i10 = i14 * 53;
                    floatToIntBits = o6.h(b5Var, j3).hashCode();
                    i14 = floatToIntBits + i10;
                    break;
                case 11:
                    i10 = i14 * 53;
                    floatToIntBits = o6.e(b5Var, j3);
                    i14 = floatToIntBits + i10;
                    break;
                case 12:
                    i10 = i14 * 53;
                    floatToIntBits = o6.e(b5Var, j3);
                    i14 = floatToIntBits + i10;
                    break;
                case 13:
                    i10 = i14 * 53;
                    floatToIntBits = o6.e(b5Var, j3);
                    i14 = floatToIntBits + i10;
                    break;
                case 14:
                    i7 = i14 * 53;
                    doubleToLongBits = o6.f(b5Var, j3);
                    Charset charset6 = h5.a;
                    i14 = i7 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i10 = i14 * 53;
                    floatToIntBits = o6.e(b5Var, j3);
                    i14 = floatToIntBits + i10;
                    break;
                case 16:
                    i7 = i14 * 53;
                    doubleToLongBits = o6.f(b5Var, j3);
                    Charset charset7 = h5.a;
                    i14 = i7 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i12 = i14 * 53;
                    Object h10 = o6.h(b5Var, j3);
                    if (h10 != null) {
                        i18 = h10.hashCode();
                    }
                    i14 = i12 + i18;
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
                    i10 = i14 * 53;
                    floatToIntBits = o6.h(b5Var, j3).hashCode();
                    i14 = floatToIntBits + i10;
                    break;
                case 50:
                    i10 = i14 * 53;
                    floatToIntBits = o6.h(b5Var, j3).hashCode();
                    i14 = floatToIntBits + i10;
                    break;
                case qs.o0 /* 51 */:
                    if (!i(i16, i13, b5Var)) {
                        break;
                    } else {
                        i7 = i14 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) o6.h(b5Var, j3)).doubleValue());
                        Charset charset8 = h5.a;
                        i14 = i7 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case qs.p0 /* 52 */:
                    if (!i(i16, i13, b5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) o6.h(b5Var, j3)).floatValue());
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case qs.q0 /* 53 */:
                    if (!i(i16, i13, b5Var)) {
                        break;
                    } else {
                        i7 = i14 * 53;
                        doubleToLongBits = n(b5Var, j3);
                        Charset charset9 = h5.a;
                        i14 = i7 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case qs.r0 /* 54 */:
                    if (!i(i16, i13, b5Var)) {
                        break;
                    } else {
                        i7 = i14 * 53;
                        doubleToLongBits = n(b5Var, j3);
                        Charset charset10 = h5.a;
                        i14 = i7 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case qs.s0 /* 55 */:
                    if (!i(i16, i13, b5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = k(b5Var, j3);
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case qs.t0 /* 56 */:
                    if (!i(i16, i13, b5Var)) {
                        break;
                    } else {
                        i7 = i14 * 53;
                        doubleToLongBits = n(b5Var, j3);
                        Charset charset11 = h5.a;
                        i14 = i7 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case qs.u0 /* 57 */:
                    if (!i(i16, i13, b5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = k(b5Var, j3);
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case qs.v0 /* 58 */:
                    if (!i(i16, i13, b5Var)) {
                        break;
                    } else {
                        i11 = i14 * 53;
                        boolean booleanValue = ((Boolean) o6.h(b5Var, j3)).booleanValue();
                        Charset charset12 = h5.a;
                        break;
                    }
                case qs.w0 /* 59 */:
                    if (!i(i16, i13, b5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = ((String) o6.h(b5Var, j3)).hashCode();
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case qs.x0 /* 60 */:
                    if (!i(i16, i13, b5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = o6.h(b5Var, j3).hashCode();
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case qs.y0 /* 61 */:
                    if (!i(i16, i13, b5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = o6.h(b5Var, j3).hashCode();
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case qs.z0 /* 62 */:
                    if (!i(i16, i13, b5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = k(b5Var, j3);
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case qs.A0 /* 63 */:
                    if (!i(i16, i13, b5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = k(b5Var, j3);
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 64:
                    if (!i(i16, i13, b5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = k(b5Var, j3);
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 65:
                    if (!i(i16, i13, b5Var)) {
                        break;
                    } else {
                        i7 = i14 * 53;
                        doubleToLongBits = n(b5Var, j3);
                        Charset charset13 = h5.a;
                        i14 = i7 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case qs.D0 /* 66 */:
                    if (!i(i16, i13, b5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = k(b5Var, j3);
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case qs.E0 /* 67 */:
                    if (!i(i16, i13, b5Var)) {
                        break;
                    } else {
                        i7 = i14 * 53;
                        doubleToLongBits = n(b5Var, j3);
                        Charset charset14 = h5.a;
                        i14 = i7 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case qs.F0 /* 68 */:
                    if (!i(i16, i13, b5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = o6.h(b5Var, j3).hashCode();
                        i14 = floatToIntBits + i10;
                        break;
                    }
            }
            i13 += 3;
        }
    }

    @Override // com.google.android.gms.internal.cast.d6
    public final boolean c(b5 b5Var, b5 b5Var2) {
        boolean e10;
        int i7 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i7 < iArr.length) {
                int m10 = m(i7);
                long j3 = m10 & 1048575;
                switch (l(m10)) {
                    case 0:
                        if (!t(b5Var, b5Var2, i7)) {
                            break;
                        } else {
                            n6 n6Var = o6.c;
                            if (Double.doubleToLongBits(n6Var.a(b5Var, j3)) != Double.doubleToLongBits(n6Var.a(b5Var2, j3))) {
                                break;
                            } else {
                                continue;
                                i7 += 3;
                            }
                        }
                    case 1:
                        if (!t(b5Var, b5Var2, i7)) {
                            break;
                        } else {
                            n6 n6Var2 = o6.c;
                            if (Float.floatToIntBits(n6Var2.b(b5Var, j3)) != Float.floatToIntBits(n6Var2.b(b5Var2, j3))) {
                                break;
                            } else {
                                continue;
                                i7 += 3;
                            }
                        }
                    case 2:
                        if (t(b5Var, b5Var2, i7) && o6.f(b5Var, j3) == o6.f(b5Var2, j3)) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 3:
                        if (t(b5Var, b5Var2, i7) && o6.f(b5Var, j3) == o6.f(b5Var2, j3)) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 4:
                        if (t(b5Var, b5Var2, i7) && o6.e(b5Var, j3) == o6.e(b5Var2, j3)) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 5:
                        if (t(b5Var, b5Var2, i7) && o6.f(b5Var, j3) == o6.f(b5Var2, j3)) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 6:
                        if (t(b5Var, b5Var2, i7) && o6.e(b5Var, j3) == o6.e(b5Var2, j3)) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 7:
                        if (!t(b5Var, b5Var2, i7)) {
                            break;
                        } else {
                            n6 n6Var3 = o6.c;
                            if (n6Var3.g(b5Var, j3) != n6Var3.g(b5Var2, j3)) {
                                break;
                            } else {
                                continue;
                                i7 += 3;
                            }
                        }
                    case 8:
                        if (t(b5Var, b5Var2, i7) && e6.e(o6.h(b5Var, j3), o6.h(b5Var2, j3))) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 9:
                        if (t(b5Var, b5Var2, i7) && e6.e(o6.h(b5Var, j3), o6.h(b5Var2, j3))) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 10:
                        if (t(b5Var, b5Var2, i7) && e6.e(o6.h(b5Var, j3), o6.h(b5Var2, j3))) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 11:
                        if (t(b5Var, b5Var2, i7) && o6.e(b5Var, j3) == o6.e(b5Var2, j3)) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 12:
                        if (t(b5Var, b5Var2, i7) && o6.e(b5Var, j3) == o6.e(b5Var2, j3)) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 13:
                        if (t(b5Var, b5Var2, i7) && o6.e(b5Var, j3) == o6.e(b5Var2, j3)) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 14:
                        if (t(b5Var, b5Var2, i7) && o6.f(b5Var, j3) == o6.f(b5Var2, j3)) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 15:
                        if (t(b5Var, b5Var2, i7) && o6.e(b5Var, j3) == o6.e(b5Var2, j3)) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 16:
                        if (t(b5Var, b5Var2, i7) && o6.f(b5Var, j3) == o6.f(b5Var2, j3)) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 17:
                        if (t(b5Var, b5Var2, i7) && e6.e(o6.h(b5Var, j3), o6.h(b5Var2, j3))) {
                            continue;
                            i7 += 3;
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
                        e10 = e6.e(o6.h(b5Var, j3), o6.h(b5Var2, j3));
                        break;
                    case 50:
                        e10 = e6.e(o6.h(b5Var, j3), o6.h(b5Var2, j3));
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
                        if (o6.e(b5Var, j10) == o6.e(b5Var2, j10) && e6.e(o6.h(b5Var, j3), o6.h(b5Var2, j3))) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    default:
                        i7 += 3;
                }
                if (e10) {
                    i7 += 3;
                }
            } else {
                this.g.getClass();
                if (b5Var.zzc.equals(b5Var2.zzc)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.cast.d6
    public final void d(Object obj, Object obj2) {
        Object obj3;
        if (!h(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i7 >= iArr.length) {
                e6.o(this.g, obj, obj2);
                return;
            }
            int m10 = m(i7);
            int i10 = m10 & 1048575;
            int l10 = l(m10);
            int i11 = iArr[i7];
            long j3 = i10;
            switch (l10) {
                case 0:
                    if (u(i7, obj2)) {
                        n6 n6Var = o6.c;
                        obj3 = obj;
                        n6Var.e(obj3, j3, n6Var.a(obj2, j3));
                        s(i7, obj3);
                        i7 += 3;
                        obj = obj3;
                    }
                    obj3 = obj;
                    i7 += 3;
                    obj = obj3;
                case 1:
                    if (u(i7, obj2)) {
                        n6 n6Var2 = o6.c;
                        n6Var2.f(obj, j3, n6Var2.b(obj2, j3));
                        s(i7, obj);
                    }
                    obj3 = obj;
                    i7 += 3;
                    obj = obj3;
                case 2:
                    if (u(i7, obj2)) {
                        o6.k(obj, j3, o6.f(obj2, j3));
                        s(i7, obj);
                    }
                    obj3 = obj;
                    i7 += 3;
                    obj = obj3;
                case 3:
                    if (u(i7, obj2)) {
                        o6.k(obj, j3, o6.f(obj2, j3));
                        s(i7, obj);
                    }
                    obj3 = obj;
                    i7 += 3;
                    obj = obj3;
                case 4:
                    if (u(i7, obj2)) {
                        o6.j(obj, j3, o6.e(obj2, j3));
                        s(i7, obj);
                    }
                    obj3 = obj;
                    i7 += 3;
                    obj = obj3;
                case 5:
                    if (u(i7, obj2)) {
                        o6.k(obj, j3, o6.f(obj2, j3));
                        s(i7, obj);
                    }
                    obj3 = obj;
                    i7 += 3;
                    obj = obj3;
                case 6:
                    if (u(i7, obj2)) {
                        o6.j(obj, j3, o6.e(obj2, j3));
                        s(i7, obj);
                    }
                    obj3 = obj;
                    i7 += 3;
                    obj = obj3;
                case 7:
                    if (u(i7, obj2)) {
                        n6 n6Var3 = o6.c;
                        n6Var3.c(obj, j3, n6Var3.g(obj2, j3));
                        s(i7, obj);
                    }
                    obj3 = obj;
                    i7 += 3;
                    obj = obj3;
                case 8:
                    if (u(i7, obj2)) {
                        o6.l(obj, j3, o6.h(obj2, j3));
                        s(i7, obj);
                    }
                    obj3 = obj;
                    i7 += 3;
                    obj = obj3;
                case 9:
                    q(i7, obj, obj2);
                    obj3 = obj;
                    i7 += 3;
                    obj = obj3;
                case 10:
                    if (u(i7, obj2)) {
                        o6.l(obj, j3, o6.h(obj2, j3));
                        s(i7, obj);
                    }
                    obj3 = obj;
                    i7 += 3;
                    obj = obj3;
                case 11:
                    if (u(i7, obj2)) {
                        o6.j(obj, j3, o6.e(obj2, j3));
                        s(i7, obj);
                    }
                    obj3 = obj;
                    i7 += 3;
                    obj = obj3;
                case 12:
                    if (u(i7, obj2)) {
                        o6.j(obj, j3, o6.e(obj2, j3));
                        s(i7, obj);
                    }
                    obj3 = obj;
                    i7 += 3;
                    obj = obj3;
                case 13:
                    if (u(i7, obj2)) {
                        o6.j(obj, j3, o6.e(obj2, j3));
                        s(i7, obj);
                    }
                    obj3 = obj;
                    i7 += 3;
                    obj = obj3;
                case 14:
                    if (u(i7, obj2)) {
                        o6.k(obj, j3, o6.f(obj2, j3));
                        s(i7, obj);
                    }
                    obj3 = obj;
                    i7 += 3;
                    obj = obj3;
                case 15:
                    if (u(i7, obj2)) {
                        o6.j(obj, j3, o6.e(obj2, j3));
                        s(i7, obj);
                    }
                    obj3 = obj;
                    i7 += 3;
                    obj = obj3;
                case 16:
                    if (u(i7, obj2)) {
                        o6.k(obj, j3, o6.f(obj2, j3));
                        s(i7, obj);
                    }
                    obj3 = obj;
                    i7 += 3;
                    obj = obj3;
                case 17:
                    q(i7, obj, obj2);
                    obj3 = obj;
                    i7 += 3;
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
                    this.f.b(obj, j3, obj2);
                    obj3 = obj;
                    i7 += 3;
                    obj = obj3;
                case 50:
                    Class cls = e6.a;
                    Object h7 = o6.h(obj, j3);
                    Object h10 = o6.h(obj2, j3);
                    if (h7 != null) {
                        throw new ClassCastException();
                    }
                    h10.getClass();
                    throw new ClassCastException();
                case qs.o0 /* 51 */:
                case qs.p0 /* 52 */:
                case qs.q0 /* 53 */:
                case qs.r0 /* 54 */:
                case qs.s0 /* 55 */:
                case qs.t0 /* 56 */:
                case qs.u0 /* 57 */:
                case qs.v0 /* 58 */:
                case qs.w0 /* 59 */:
                    if (i(i11, i7, obj2)) {
                        o6.l(obj, j3, o6.h(obj2, j3));
                        o6.j(obj, iArr[i7 + 2] & 1048575, i11);
                    }
                    obj3 = obj;
                    i7 += 3;
                    obj = obj3;
                case qs.x0 /* 60 */:
                    r(i7, obj, obj2);
                    obj3 = obj;
                    i7 += 3;
                    obj = obj3;
                case qs.y0 /* 61 */:
                case qs.z0 /* 62 */:
                case qs.A0 /* 63 */:
                case 64:
                case 65:
                case qs.D0 /* 66 */:
                case qs.E0 /* 67 */:
                    if (i(i11, i7, obj2)) {
                        o6.l(obj, j3, o6.h(obj2, j3));
                        o6.j(obj, iArr[i7 + 2] & 1048575, i11);
                    }
                    obj3 = obj;
                    i7 += 3;
                    obj = obj3;
                case qs.F0 /* 68 */:
                    r(i7, obj, obj2);
                    obj3 = obj;
                    i7 += 3;
                    obj = obj3;
                default:
                    obj3 = obj;
                    i7 += 3;
                    obj = obj3;
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.d6
    public final void e(Object obj, q5 q5Var) {
        int i7;
        v5 v5Var = this;
        Unsafe unsafe = i;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        while (true) {
            int[] iArr = v5Var.a;
            if (i11 >= iArr.length) {
                v5Var.g.getClass();
                f6 f6Var = ((b5) obj).zzc;
                return;
            }
            int m10 = v5Var.m(i11);
            int l10 = l(m10);
            int i14 = iArr[i11];
            if (l10 <= 17) {
                int i15 = iArr[i11 + 2];
                int i16 = i15 & i10;
                if (i16 != i13) {
                    i12 = i16 == i10 ? 0 : unsafe.getInt(obj, i16);
                    i13 = i16;
                }
                i7 = 1 << (i15 >>> 20);
            } else {
                i7 = 0;
            }
            long j3 = m10 & i10;
            switch (l10) {
                case 0:
                    if (v5Var.v(obj, i11, i13, i12, i7)) {
                        ((v4) q5Var.a).f(i14, Double.doubleToRawLongBits(o6.c.a(obj, j3)));
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 1:
                    if (v5Var.v(obj, i11, i13, i12, i7)) {
                        ((v4) q5Var.a).d(i14, Float.floatToRawIntBits(o6.c.b(obj, j3)));
                        break;
                    }
                    break;
                case 2:
                    if (v5Var.v(obj, i11, i13, i12, i7)) {
                        ((v4) q5Var.a).k(i14, unsafe.getLong(obj, j3));
                        break;
                    }
                    break;
                case 3:
                    if (v5Var.v(obj, i11, i13, i12, i7)) {
                        ((v4) q5Var.a).k(i14, unsafe.getLong(obj, j3));
                        break;
                    }
                    break;
                case 4:
                    if (v5Var.v(obj, i11, i13, i12, i7)) {
                        int i17 = unsafe.getInt(obj, j3);
                        v4 v4Var = (v4) q5Var.a;
                        v4Var.j(i14 << 3);
                        if (i17 >= 0) {
                            v4Var.j(i17);
                            break;
                        } else {
                            v4Var.l(i17);
                            break;
                        }
                    }
                    break;
                case 5:
                    if (v5Var.v(obj, i11, i13, i12, i7)) {
                        ((v4) q5Var.a).f(i14, unsafe.getLong(obj, j3));
                        break;
                    }
                    break;
                case 6:
                    if (v5Var.v(obj, i11, i13, i12, i7)) {
                        ((v4) q5Var.a).d(i14, unsafe.getInt(obj, j3));
                        break;
                    }
                    break;
                case 7:
                    if (v5Var.v(obj, i11, i13, i12, i7)) {
                        boolean g10 = o6.c.g(obj, j3);
                        v4 v4Var2 = (v4) q5Var.a;
                        v4Var2.j(i14 << 3);
                        v4Var2.a(g10 ? (byte) 1 : (byte) 0);
                        break;
                    }
                    break;
                case 8:
                    if (v5Var.v(obj, i11, i13, i12, i7)) {
                        Object object = unsafe.getObject(obj, j3);
                        if (object instanceof String) {
                            ((v4) q5Var.a).h(i14, (String) object);
                            break;
                        } else {
                            ((v4) q5Var.a).c(i14, (u4) object);
                            break;
                        }
                    }
                    break;
                case 9:
                    if (v5Var.v(obj, i11, i13, i12, i7)) {
                        q5Var.d(i14, unsafe.getObject(obj, j3), v5Var.o(i11));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 10:
                    if (v5Var.v(obj, i11, i13, i12, i7)) {
                        ((v4) q5Var.a).c(i14, (u4) unsafe.getObject(obj, j3));
                        break;
                    }
                    break;
                case 11:
                    if (v5Var.v(obj, i11, i13, i12, i7)) {
                        int i18 = unsafe.getInt(obj, j3);
                        v4 v4Var3 = (v4) q5Var.a;
                        v4Var3.j(i14 << 3);
                        v4Var3.j(i18);
                        break;
                    }
                    break;
                case 12:
                    if (v5Var.v(obj, i11, i13, i12, i7)) {
                        int i19 = unsafe.getInt(obj, j3);
                        v4 v4Var4 = (v4) q5Var.a;
                        v4Var4.j(i14 << 3);
                        if (i19 >= 0) {
                            v4Var4.j(i19);
                            break;
                        } else {
                            v4Var4.l(i19);
                            break;
                        }
                    }
                    break;
                case 13:
                    if (v5Var.v(obj, i11, i13, i12, i7)) {
                        ((v4) q5Var.a).d(i14, unsafe.getInt(obj, j3));
                        break;
                    }
                    break;
                case 14:
                    if (v5Var.v(obj, i11, i13, i12, i7)) {
                        ((v4) q5Var.a).f(i14, unsafe.getLong(obj, j3));
                        break;
                    }
                    break;
                case 15:
                    if (v5Var.v(obj, i11, i13, i12, i7)) {
                        int i20 = unsafe.getInt(obj, j3);
                        v4 v4Var5 = (v4) q5Var.a;
                        v4Var5.j(i14 << 3);
                        v4Var5.j((i20 >> 31) ^ (i20 + i20));
                        break;
                    }
                    break;
                case 16:
                    if (v5Var.v(obj, i11, i13, i12, i7)) {
                        long j10 = unsafe.getLong(obj, j3);
                        ((v4) q5Var.a).k(i14, (j10 >> 63) ^ (j10 + j10));
                        break;
                    }
                    break;
                case 17:
                    if (v5Var.v(obj, i11, i13, i12, i7)) {
                        q5Var.a(i14, unsafe.getObject(obj, j3), v5Var.o(i11));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 18:
                    e6.q(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 19:
                    e6.u(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 20:
                    e6.w(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 21:
                    e6.d(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 22:
                    e6.v(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 23:
                    e6.t(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 24:
                    e6.s(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 25:
                    e6.p(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 26:
                    int i21 = iArr[i11];
                    List list = (List) unsafe.getObject(obj, j3);
                    Class cls = e6.a;
                    if (list == null) {
                        continue;
                    } else if (!list.isEmpty()) {
                        v4 v4Var6 = (v4) q5Var.a;
                        if (list instanceof k5) {
                            k5 k5Var = (k5) list;
                            for (int i22 = 0; i22 < list.size(); i22++) {
                                Object g11 = k5Var.g(i22);
                                if (g11 instanceof String) {
                                    v4Var6.h(i21, (String) g11);
                                } else {
                                    v4Var6.c(i21, (u4) g11);
                                }
                            }
                        } else {
                            for (int i23 = 0; i23 < list.size(); i23++) {
                                v4Var6.h(i21, (String) list.get(i23));
                            }
                        }
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 27:
                    int i24 = iArr[i11];
                    List list2 = (List) unsafe.getObject(obj, j3);
                    d6 o4 = v5Var.o(i11);
                    Class cls2 = e6.a;
                    if (list2 == null) {
                        continue;
                    } else if (!list2.isEmpty()) {
                        for (int i25 = 0; i25 < list2.size(); i25++) {
                            q5Var.d(i24, list2.get(i25), o4);
                        }
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 28:
                    int i26 = iArr[i11];
                    List list3 = (List) unsafe.getObject(obj, j3);
                    Class cls3 = e6.a;
                    if (list3 == null) {
                        continue;
                    } else if (!list3.isEmpty()) {
                        q5Var.getClass();
                        for (int i27 = 0; i27 < list3.size(); i27++) {
                            ((v4) q5Var.a).c(i26, (u4) list3.get(i27));
                        }
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 29:
                    e6.c(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case qs.T /* 30 */:
                    e6.r(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case qs.U /* 31 */:
                    e6.x(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 32:
                    e6.y(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 33:
                    e6.a(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 34:
                    e6.b(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 35:
                    e6.q(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 36:
                    e6.u(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 37:
                    e6.w(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 38:
                    e6.d(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 39:
                    e6.v(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 40:
                    e6.t(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 41:
                    e6.s(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 42:
                    e6.p(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 43:
                    e6.c(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 44:
                    e6.r(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 45:
                    e6.x(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 46:
                    e6.y(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 47:
                    e6.a(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 48:
                    e6.b(iArr[i11], (List) unsafe.getObject(obj, j3), q5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 49:
                    int i28 = iArr[i11];
                    List list4 = (List) unsafe.getObject(obj, j3);
                    d6 o10 = v5Var.o(i11);
                    Class cls4 = e6.a;
                    if (list4 == null) {
                        continue;
                    } else if (!list4.isEmpty()) {
                        for (int i29 = 0; i29 < list4.size(); i29++) {
                            q5Var.a(i28, list4.get(i29), o10);
                        }
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 50:
                    if (unsafe.getObject(obj, j3) != null) {
                        int i30 = i11 / 3;
                        v5Var.b[i30 + i30].getClass();
                        throw new ClassCastException();
                    }
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case qs.o0 /* 51 */:
                    if (v5Var.i(i14, i11, obj)) {
                        ((v4) q5Var.a).f(i14, Double.doubleToRawLongBits(((Double) o6.h(obj, j3)).doubleValue()));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case qs.p0 /* 52 */:
                    if (v5Var.i(i14, i11, obj)) {
                        ((v4) q5Var.a).d(i14, Float.floatToRawIntBits(((Float) o6.h(obj, j3)).floatValue()));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case qs.q0 /* 53 */:
                    if (v5Var.i(i14, i11, obj)) {
                        ((v4) q5Var.a).k(i14, n(obj, j3));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case qs.r0 /* 54 */:
                    if (v5Var.i(i14, i11, obj)) {
                        ((v4) q5Var.a).k(i14, n(obj, j3));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case qs.s0 /* 55 */:
                    if (v5Var.i(i14, i11, obj)) {
                        int k10 = k(obj, j3);
                        v4 v4Var7 = (v4) q5Var.a;
                        v4Var7.j(i14 << 3);
                        if (k10 >= 0) {
                            v4Var7.j(k10);
                        } else {
                            v4Var7.l(k10);
                        }
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case qs.t0 /* 56 */:
                    if (v5Var.i(i14, i11, obj)) {
                        ((v4) q5Var.a).f(i14, n(obj, j3));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case qs.u0 /* 57 */:
                    if (v5Var.i(i14, i11, obj)) {
                        ((v4) q5Var.a).d(i14, k(obj, j3));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case qs.v0 /* 58 */:
                    if (v5Var.i(i14, i11, obj)) {
                        boolean booleanValue = ((Boolean) o6.h(obj, j3)).booleanValue();
                        v4 v4Var8 = (v4) q5Var.a;
                        v4Var8.j(i14 << 3);
                        v4Var8.a(booleanValue ? (byte) 1 : (byte) 0);
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case qs.w0 /* 59 */:
                    if (v5Var.i(i14, i11, obj)) {
                        Object object2 = unsafe.getObject(obj, j3);
                        if (object2 instanceof String) {
                            ((v4) q5Var.a).h(i14, (String) object2);
                        } else {
                            ((v4) q5Var.a).c(i14, (u4) object2);
                        }
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case qs.x0 /* 60 */:
                    if (v5Var.i(i14, i11, obj)) {
                        q5Var.d(i14, unsafe.getObject(obj, j3), v5Var.o(i11));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case qs.y0 /* 61 */:
                    if (v5Var.i(i14, i11, obj)) {
                        ((v4) q5Var.a).c(i14, (u4) unsafe.getObject(obj, j3));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case qs.z0 /* 62 */:
                    if (v5Var.i(i14, i11, obj)) {
                        int k11 = k(obj, j3);
                        v4 v4Var9 = (v4) q5Var.a;
                        v4Var9.j(i14 << 3);
                        v4Var9.j(k11);
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case qs.A0 /* 63 */:
                    if (v5Var.i(i14, i11, obj)) {
                        int k12 = k(obj, j3);
                        v4 v4Var10 = (v4) q5Var.a;
                        v4Var10.j(i14 << 3);
                        if (k12 >= 0) {
                            v4Var10.j(k12);
                        } else {
                            v4Var10.l(k12);
                        }
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 64:
                    if (v5Var.i(i14, i11, obj)) {
                        ((v4) q5Var.a).d(i14, k(obj, j3));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 65:
                    if (v5Var.i(i14, i11, obj)) {
                        ((v4) q5Var.a).f(i14, n(obj, j3));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case qs.D0 /* 66 */:
                    if (v5Var.i(i14, i11, obj)) {
                        int k13 = k(obj, j3);
                        v4 v4Var11 = (v4) q5Var.a;
                        v4Var11.j(i14 << 3);
                        v4Var11.j((k13 >> 31) ^ (k13 + k13));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case qs.E0 /* 67 */:
                    if (v5Var.i(i14, i11, obj)) {
                        long n10 = n(obj, j3);
                        ((v4) q5Var.a).k(i14, (n10 >> 63) ^ (n10 + n10));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case qs.F0 /* 68 */:
                    if (v5Var.i(i14, i11, obj)) {
                        q5Var.a(i14, unsafe.getObject(obj, j3), v5Var.o(i11));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                default:
                    i11 += 3;
                    i10 = 1048575;
            }
            v5Var = this;
            i11 += 3;
            i10 = 1048575;
        }
    }

    @Override // com.google.android.gms.internal.cast.d6
    public final boolean f(Object obj) {
        int i7;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.e) {
            int i15 = this.d[i13];
            int[] iArr = this.a;
            int i16 = iArr[i15];
            int m10 = m(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = i.getInt(obj, i18);
                }
                i10 = i15;
                i11 = i12;
                i7 = i18;
            } else {
                int i20 = i12;
                i7 = i14;
                i10 = i15;
                i11 = i20;
            }
            if ((268435456 & m10) == 0 || v(obj, i10, i7, i11, i19)) {
                int l10 = l(m10);
                if (l10 == 9 || l10 == 17) {
                    if (v(obj, i10, i7, i11, i19) && !o(i10).f(o6.h(obj, m10 & 1048575))) {
                    }
                    i13++;
                    i14 = i7;
                    i12 = i11;
                } else {
                    if (l10 != 27) {
                        if (l10 == 60 || l10 == 68) {
                            if (i(i16, i10, obj) && !o(i10).f(o6.h(obj, m10 & 1048575))) {
                            }
                        } else if (l10 != 49) {
                            if (l10 == 50) {
                                o6.h(obj, m10 & 1048575).getClass();
                                throw new ClassCastException();
                            }
                        }
                        i13++;
                        i14 = i7;
                        i12 = i11;
                    }
                    List list = (List) o6.h(obj, m10 & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        d6 o4 = o(i10);
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            if (o4.f(list.get(i21))) {
                            }
                        }
                    }
                    i13++;
                    i14 = i7;
                    i12 = i11;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.cast.d6
    public final int g(q4 q4Var) {
        int i7;
        int i10;
        int a10;
        int o4;
        int h7;
        int o10;
        int size;
        int n10;
        int o11;
        int o12;
        int o13;
        int o14;
        int o15;
        int i11;
        int i12;
        v5 v5Var = this;
        q4 q4Var2 = q4Var;
        Unsafe unsafe = i;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int[] iArr = v5Var.a;
            if (i15 >= iArr.length) {
                v5Var.g.getClass();
                f6 f6Var = ((b5) q4Var).zzc;
                int i18 = f6Var.c;
                if (i18 == -1) {
                    f6Var.c = 0;
                    i7 = 0;
                } else {
                    i7 = i18;
                }
                return i7 + i17;
            }
            int m10 = v5Var.m(i15);
            int l10 = l(m10);
            int i19 = iArr[i15];
            int i20 = iArr[i15 + 2];
            int i21 = i20 & i13;
            if (l10 <= 17) {
                if (i21 != i14) {
                    i16 = i21 == i13 ? 0 : unsafe.getInt(q4Var2, i21);
                    i14 = i21;
                }
                i10 = 1 << (i20 >>> 20);
            } else {
                i10 = 0;
            }
            int i22 = m10 & i13;
            if (l10 >= y4.b.a) {
                y4.c.getClass();
            }
            long j3 = i22;
            switch (l10) {
                case 0:
                    if (v5Var.v(q4Var2, i15, i14, i16, i10)) {
                        i17 = a8.p0.g(i19 << 3, 8, i17);
                    }
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 1:
                    if (v5Var.v(q4Var2, i15, i14, i16, i10)) {
                        i17 = a8.p0.g(i19 << 3, 4, i17);
                    }
                    v5Var = this;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 2:
                    if (v5Var.v(q4Var2, i15, i14, i16, i10)) {
                        i17 = a8.p0.g(i19 << 3, v4.p(unsafe.getLong(q4Var2, j3)), i17);
                    }
                    v5Var = this;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 3:
                    if (v5Var.v(q4Var2, i15, i14, i16, i10)) {
                        i17 = a8.p0.g(i19 << 3, v4.p(unsafe.getLong(q4Var2, j3)), i17);
                    }
                    v5Var = this;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 4:
                    if (v5Var.v(q4Var2, i15, i14, i16, i10)) {
                        i17 = a8.p0.g(i19 << 3, v4.m(unsafe.getInt(q4Var2, j3)), i17);
                    }
                    v5Var = this;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 5:
                    if (v5Var.v(q4Var2, i15, i14, i16, i10)) {
                        i17 = a8.p0.g(i19 << 3, 8, i17);
                    }
                    v5Var = this;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 6:
                    if (v5Var.v(q4Var2, i15, i14, i16, i10)) {
                        i17 = a8.p0.g(i19 << 3, 4, i17);
                    }
                    v5Var = this;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 7:
                    if (v5Var.v(q4Var2, i15, i14, i16, i10)) {
                        i17 = a8.p0.g(i19 << 3, 1, i17);
                    }
                    v5Var = this;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 8:
                    if (v5Var.v(q4Var2, i15, i14, i16, i10)) {
                        int i23 = i19 << 3;
                        Object object = unsafe.getObject(q4Var2, j3);
                        if (object instanceof u4) {
                            Logger logger = v4.e;
                            int j10 = ((u4) object).j();
                            i17 = a8.p0.g(i23, v4.o(j10) + j10, i17);
                        } else {
                            i17 = a8.p0.g(i23, v4.n((String) object), i17);
                        }
                    }
                    v5Var = this;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 9:
                    if (v5Var.v(q4Var2, i15, i14, i16, i10)) {
                        Object object2 = unsafe.getObject(q4Var2, j3);
                        d6 o16 = v5Var.o(i15);
                        Class cls = e6.a;
                        Logger logger2 = v4.e;
                        int a11 = ((q4) object2).a(o16);
                        i17 = a8.p0.g(i19 << 3, v4.o(a11) + a11, i17);
                    }
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 10:
                    if (v5Var.v(q4Var2, i15, i14, i16, i10)) {
                        u4 u4Var = (u4) unsafe.getObject(q4Var2, j3);
                        Logger logger3 = v4.e;
                        int j11 = u4Var.j();
                        i17 = a8.p0.g(i19 << 3, v4.o(j11) + j11, i17);
                    }
                    v5Var = this;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 11:
                    if (v5Var.v(q4Var2, i15, i14, i16, i10)) {
                        i17 = a8.p0.g(i19 << 3, v4.o(unsafe.getInt(q4Var2, j3)), i17);
                    }
                    v5Var = this;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 12:
                    if (v5Var.v(q4Var2, i15, i14, i16, i10)) {
                        i17 = a8.p0.g(i19 << 3, v4.m(unsafe.getInt(q4Var2, j3)), i17);
                    }
                    v5Var = this;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 13:
                    if (v5Var.v(q4Var2, i15, i14, i16, i10)) {
                        i17 = a8.p0.g(i19 << 3, 4, i17);
                    }
                    v5Var = this;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 14:
                    if (v5Var.v(q4Var2, i15, i14, i16, i10)) {
                        i17 = a8.p0.g(i19 << 3, 8, i17);
                    }
                    v5Var = this;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 15:
                    if (v5Var.v(q4Var2, i15, i14, i16, i10)) {
                        int i24 = unsafe.getInt(q4Var2, j3);
                        i17 = a8.p0.g((i24 >> 31) ^ (i24 + i24), v4.o(i19 << 3), i17);
                    }
                    v5Var = this;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 16:
                    if (v5Var.v(q4Var2, i15, i14, i16, i10)) {
                        long j12 = unsafe.getLong(q4Var2, j3);
                        i17 += v4.p((j12 >> 63) ^ (j12 + j12)) + v4.o(i19 << 3);
                    }
                    v5Var = this;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 17:
                    if (v5Var.v(q4Var2, i15, i14, i16, i10)) {
                        q4 q4Var3 = (q4) unsafe.getObject(q4Var2, j3);
                        d6 o17 = v5Var.o(i15);
                        Logger logger4 = v4.e;
                        a10 = q4Var3.a(o17);
                        o4 = v4.o(i19 << 3);
                        i11 = o4 + o4;
                        i17 += i11 + a10;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                case 18:
                    h7 = e6.h(i19, (List) unsafe.getObject(q4Var2, j3));
                    i17 += h7;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 19:
                    h7 = e6.g(i19, (List) unsafe.getObject(q4Var2, j3));
                    i17 += h7;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(q4Var2, j3);
                    Class cls2 = e6.a;
                    if (list.size() != 0) {
                        o10 = (v4.o(i19 << 3) * list.size()) + e6.j(list);
                        i17 += o10;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                    o10 = 0;
                    i17 += o10;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(q4Var2, j3);
                    Class cls3 = e6.a;
                    size = list2.size();
                    if (size != 0) {
                        n10 = e6.n(list2);
                        o11 = v4.o(i19 << 3);
                        o12 = (o11 * size) + n10;
                        i17 += o12;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                    o12 = 0;
                    i17 += o12;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(q4Var2, j3);
                    Class cls4 = e6.a;
                    size = list3.size();
                    if (size != 0) {
                        n10 = e6.i(list3);
                        o11 = v4.o(i19 << 3);
                        o12 = (o11 * size) + n10;
                        i17 += o12;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                    o12 = 0;
                    i17 += o12;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 23:
                    h7 = e6.h(i19, (List) unsafe.getObject(q4Var2, j3));
                    i17 += h7;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 24:
                    h7 = e6.g(i19, (List) unsafe.getObject(q4Var2, j3));
                    i17 += h7;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(q4Var2, j3);
                    Class cls5 = e6.a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        o10 = (v4.o(i19 << 3) + 1) * size2;
                        i17 += o10;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                    o10 = 0;
                    i17 += o10;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(q4Var2, j3);
                    Class cls6 = e6.a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        boolean z9 = list5 instanceof k5;
                        o12 = v4.o(i19 << 3) * size3;
                        if (z9) {
                            k5 k5Var = (k5) list5;
                            for (int i25 = 0; i25 < size3; i25++) {
                                Object g10 = k5Var.g(i25);
                                if (g10 instanceof u4) {
                                    int j13 = ((u4) g10).j();
                                    o12 = a8.p0.g(j13, j13, o12);
                                } else {
                                    o12 = v4.n((String) g10) + o12;
                                }
                            }
                        } else {
                            for (int i26 = 0; i26 < size3; i26++) {
                                Object obj = list5.get(i26);
                                if (obj instanceof u4) {
                                    int j14 = ((u4) obj).j();
                                    o12 = a8.p0.g(j14, j14, o12);
                                } else {
                                    o12 = v4.n((String) obj) + o12;
                                }
                            }
                        }
                        i17 += o12;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                    o12 = 0;
                    i17 += o12;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(q4Var2, j3);
                    d6 o18 = v5Var.o(i15);
                    Class cls7 = e6.a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        o13 = 0;
                    } else {
                        o13 = v4.o(i19 << 3) * size4;
                        for (int i27 = 0; i27 < size4; i27++) {
                            int a12 = ((q4) list6.get(i27)).a(o18);
                            o13 = a8.p0.g(a12, a12, o13);
                        }
                    }
                    i17 += o13;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(q4Var2, j3);
                    Class cls8 = e6.a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        o12 = v4.o(i19 << 3) * size5;
                        for (int i28 = 0; i28 < list7.size(); i28++) {
                            int j15 = ((u4) list7.get(i28)).j();
                            o12 = a8.p0.g(j15, j15, o12);
                        }
                        i17 += o12;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                    o12 = 0;
                    i17 += o12;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(q4Var2, j3);
                    Class cls9 = e6.a;
                    size = list8.size();
                    if (size != 0) {
                        n10 = e6.m(list8);
                        o11 = v4.o(i19 << 3);
                        o12 = (o11 * size) + n10;
                        i17 += o12;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                    o12 = 0;
                    i17 += o12;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case qs.T /* 30 */:
                    List list9 = (List) unsafe.getObject(q4Var2, j3);
                    Class cls10 = e6.a;
                    size = list9.size();
                    if (size != 0) {
                        n10 = e6.f(list9);
                        o11 = v4.o(i19 << 3);
                        o12 = (o11 * size) + n10;
                        i17 += o12;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                    o12 = 0;
                    i17 += o12;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case qs.U /* 31 */:
                    h7 = e6.g(i19, (List) unsafe.getObject(q4Var2, j3));
                    i17 += h7;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 32:
                    h7 = e6.h(i19, (List) unsafe.getObject(q4Var2, j3));
                    i17 += h7;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(q4Var2, j3);
                    Class cls11 = e6.a;
                    size = list10.size();
                    if (size != 0) {
                        n10 = e6.k(list10);
                        o11 = v4.o(i19 << 3);
                        o12 = (o11 * size) + n10;
                        i17 += o12;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                    o12 = 0;
                    i17 += o12;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(q4Var2, j3);
                    Class cls12 = e6.a;
                    size = list11.size();
                    if (size != 0) {
                        n10 = e6.l(list11);
                        o11 = v4.o(i19 << 3);
                        o12 = (o11 * size) + n10;
                        i17 += o12;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                    o12 = 0;
                    i17 += o12;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 35:
                    List list12 = (List) unsafe.getObject(q4Var2, j3);
                    Class cls13 = e6.a;
                    a10 = list12.size() * 8;
                    if (a10 > 0) {
                        o14 = v4.o(a10);
                        o15 = v4.o(i19 << 3);
                        i11 = o15 + o14;
                        i17 += i11 + a10;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(q4Var2, j3);
                    Class cls14 = e6.a;
                    a10 = list13.size() * 4;
                    if (a10 > 0) {
                        o14 = v4.o(a10);
                        o15 = v4.o(i19 << 3);
                        i11 = o15 + o14;
                        i17 += i11 + a10;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                case 37:
                    a10 = e6.j((List) unsafe.getObject(q4Var2, j3));
                    if (a10 > 0) {
                        o14 = v4.o(a10);
                        o15 = v4.o(i19 << 3);
                        i11 = o15 + o14;
                        i17 += i11 + a10;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                case 38:
                    a10 = e6.n((List) unsafe.getObject(q4Var2, j3));
                    if (a10 > 0) {
                        o14 = v4.o(a10);
                        o15 = v4.o(i19 << 3);
                        i11 = o15 + o14;
                        i17 += i11 + a10;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                case 39:
                    a10 = e6.i((List) unsafe.getObject(q4Var2, j3));
                    if (a10 > 0) {
                        o14 = v4.o(a10);
                        o15 = v4.o(i19 << 3);
                        i11 = o15 + o14;
                        i17 += i11 + a10;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(q4Var2, j3);
                    Class cls15 = e6.a;
                    a10 = list14.size() * 8;
                    if (a10 > 0) {
                        o14 = v4.o(a10);
                        o15 = v4.o(i19 << 3);
                        i11 = o15 + o14;
                        i17 += i11 + a10;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(q4Var2, j3);
                    Class cls16 = e6.a;
                    a10 = list15.size() * 4;
                    if (a10 > 0) {
                        o14 = v4.o(a10);
                        o15 = v4.o(i19 << 3);
                        i11 = o15 + o14;
                        i17 += i11 + a10;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(q4Var2, j3);
                    Class cls17 = e6.a;
                    a10 = list16.size();
                    if (a10 > 0) {
                        o14 = v4.o(a10);
                        o15 = v4.o(i19 << 3);
                        i11 = o15 + o14;
                        i17 += i11 + a10;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                case 43:
                    a10 = e6.m((List) unsafe.getObject(q4Var2, j3));
                    if (a10 > 0) {
                        o14 = v4.o(a10);
                        o15 = v4.o(i19 << 3);
                        i11 = o15 + o14;
                        i17 += i11 + a10;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                case 44:
                    a10 = e6.f((List) unsafe.getObject(q4Var2, j3));
                    if (a10 > 0) {
                        o14 = v4.o(a10);
                        o15 = v4.o(i19 << 3);
                        i11 = o15 + o14;
                        i17 += i11 + a10;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(q4Var2, j3);
                    Class cls18 = e6.a;
                    a10 = list17.size() * 4;
                    if (a10 > 0) {
                        o14 = v4.o(a10);
                        o15 = v4.o(i19 << 3);
                        i11 = o15 + o14;
                        i17 += i11 + a10;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(q4Var2, j3);
                    Class cls19 = e6.a;
                    a10 = list18.size() * 8;
                    if (a10 > 0) {
                        o14 = v4.o(a10);
                        o15 = v4.o(i19 << 3);
                        i11 = o15 + o14;
                        i17 += i11 + a10;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                case 47:
                    a10 = e6.k((List) unsafe.getObject(q4Var2, j3));
                    if (a10 > 0) {
                        o14 = v4.o(a10);
                        o15 = v4.o(i19 << 3);
                        i11 = o15 + o14;
                        i17 += i11 + a10;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                case 48:
                    a10 = e6.l((List) unsafe.getObject(q4Var2, j3));
                    if (a10 > 0) {
                        o14 = v4.o(a10);
                        o15 = v4.o(i19 << 3);
                        i11 = o15 + o14;
                        i17 += i11 + a10;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(q4Var2, j3);
                    d6 o19 = v5Var.o(i15);
                    Class cls20 = e6.a;
                    int size6 = list19.size();
                    if (size6 == 0) {
                        i12 = 0;
                    } else {
                        i12 = 0;
                        for (int i29 = 0; i29 < size6; i29++) {
                            q4 q4Var4 = (q4) list19.get(i29);
                            Logger logger5 = v4.e;
                            int a13 = q4Var4.a(o19);
                            int o20 = v4.o(i19 << 3);
                            i12 += o20 + o20 + a13;
                        }
                    }
                    i17 += i12;
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 50:
                    Object object3 = unsafe.getObject(q4Var2, j3);
                    int i30 = i15 / 3;
                    Object obj2 = v5Var.b[i30 + i30];
                    if (object3 != null) {
                        throw new ClassCastException();
                    }
                    obj2.getClass();
                    throw new ClassCastException();
                case qs.o0 /* 51 */:
                    if (v5Var.i(i19, i15, q4Var2)) {
                        i17 = a8.p0.g(i19 << 3, 8, i17);
                    }
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case qs.p0 /* 52 */:
                    if (v5Var.i(i19, i15, q4Var2)) {
                        i17 = a8.p0.g(i19 << 3, 4, i17);
                    }
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case qs.q0 /* 53 */:
                    if (v5Var.i(i19, i15, q4Var2)) {
                        i17 = a8.p0.g(i19 << 3, v4.p(n(q4Var2, j3)), i17);
                    }
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case qs.r0 /* 54 */:
                    if (v5Var.i(i19, i15, q4Var2)) {
                        i17 = a8.p0.g(i19 << 3, v4.p(n(q4Var2, j3)), i17);
                    }
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case qs.s0 /* 55 */:
                    if (v5Var.i(i19, i15, q4Var2)) {
                        i17 = a8.p0.g(i19 << 3, v4.m(k(q4Var2, j3)), i17);
                    }
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case qs.t0 /* 56 */:
                    if (v5Var.i(i19, i15, q4Var2)) {
                        i17 = a8.p0.g(i19 << 3, 8, i17);
                    }
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case qs.u0 /* 57 */:
                    if (v5Var.i(i19, i15, q4Var2)) {
                        i17 = a8.p0.g(i19 << 3, 4, i17);
                    }
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case qs.v0 /* 58 */:
                    if (v5Var.i(i19, i15, q4Var2)) {
                        i17 = a8.p0.g(i19 << 3, 1, i17);
                    }
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case qs.w0 /* 59 */:
                    if (v5Var.i(i19, i15, q4Var2)) {
                        int i31 = i19 << 3;
                        Object object4 = unsafe.getObject(q4Var2, j3);
                        if (object4 instanceof u4) {
                            Logger logger6 = v4.e;
                            int j16 = ((u4) object4).j();
                            i17 = a8.p0.g(i31, v4.o(j16) + j16, i17);
                        } else {
                            i17 = a8.p0.g(i31, v4.n((String) object4), i17);
                        }
                    }
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case qs.x0 /* 60 */:
                    if (v5Var.i(i19, i15, q4Var2)) {
                        Object object5 = unsafe.getObject(q4Var2, j3);
                        d6 o21 = v5Var.o(i15);
                        Class cls21 = e6.a;
                        Logger logger7 = v4.e;
                        int a14 = ((q4) object5).a(o21);
                        i17 = a8.p0.g(i19 << 3, v4.o(a14) + a14, i17);
                    }
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case qs.y0 /* 61 */:
                    if (v5Var.i(i19, i15, q4Var2)) {
                        u4 u4Var2 = (u4) unsafe.getObject(q4Var2, j3);
                        Logger logger8 = v4.e;
                        int j17 = u4Var2.j();
                        i17 = a8.p0.g(i19 << 3, v4.o(j17) + j17, i17);
                    }
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case qs.z0 /* 62 */:
                    if (v5Var.i(i19, i15, q4Var2)) {
                        i17 = a8.p0.g(i19 << 3, v4.o(k(q4Var2, j3)), i17);
                    }
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case qs.A0 /* 63 */:
                    if (v5Var.i(i19, i15, q4Var2)) {
                        i17 = a8.p0.g(i19 << 3, v4.m(k(q4Var2, j3)), i17);
                    }
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 64:
                    if (v5Var.i(i19, i15, q4Var2)) {
                        i17 = a8.p0.g(i19 << 3, 4, i17);
                    }
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case 65:
                    if (v5Var.i(i19, i15, q4Var2)) {
                        i17 = a8.p0.g(i19 << 3, 8, i17);
                    }
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case qs.D0 /* 66 */:
                    if (v5Var.i(i19, i15, q4Var2)) {
                        int k10 = k(q4Var2, j3);
                        i17 = a8.p0.g((k10 >> 31) ^ (k10 + k10), v4.o(i19 << 3), i17);
                    }
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
                case qs.E0 /* 67 */:
                    if (v5Var.i(i19, i15, q4Var2)) {
                        long n11 = n(q4Var2, j3);
                        a10 = v4.o(i19 << 3);
                        i11 = v4.p((n11 >> 63) ^ (n11 + n11));
                        i17 += i11 + a10;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                case qs.F0 /* 68 */:
                    if (v5Var.i(i19, i15, q4Var2)) {
                        q4 q4Var5 = (q4) unsafe.getObject(q4Var2, j3);
                        d6 o22 = v5Var.o(i15);
                        Logger logger9 = v4.e;
                        a10 = q4Var5.a(o22);
                        o4 = v4.o(i19 << 3);
                        i11 = o4 + o4;
                        i17 += i11 + a10;
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        q4Var2 = q4Var;
                        i13 = 1048575;
                    }
                default:
                    i15 += 3;
                    q4Var2 = q4Var;
                    i13 = 1048575;
            }
        }
    }

    public final boolean i(int i7, int i10, Object obj) {
        return o6.e(obj, (long) (this.a[i10 + 2] & 1048575)) == i7;
    }

    public final int m(int i7) {
        return this.a[i7 + 1];
    }

    public final d6 o(int i7) {
        int i10 = i7 / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.b;
        d6 d6Var = (d6) objArr[i11];
        if (d6Var != null) {
            return d6Var;
        }
        d6 a10 = a6.c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a10;
        return a10;
    }

    public final void q(int i7, Object obj, Object obj2) {
        if (u(i7, obj2)) {
            int m10 = m(i7) & 1048575;
            Unsafe unsafe = i;
            long j3 = m10;
            Object object = unsafe.getObject(obj2, j3);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i7] + " is present but null: " + obj2.toString());
            }
            d6 o4 = o(i7);
            if (!u(i7, obj)) {
                if (h(object)) {
                    b5 zzc = o4.zzc();
                    o4.d(zzc, object);
                    unsafe.putObject(obj, j3, zzc);
                } else {
                    unsafe.putObject(obj, j3, object);
                }
                s(i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j3);
            if (!h(object2)) {
                b5 zzc2 = o4.zzc();
                o4.d(zzc2, object2);
                unsafe.putObject(obj, j3, zzc2);
                object2 = zzc2;
            }
            o4.d(object2, object);
        }
    }

    public final void r(int i7, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i10 = iArr[i7];
        if (i(i10, i7, obj2)) {
            int m10 = m(i7) & 1048575;
            Unsafe unsafe = i;
            long j3 = m10;
            Object object = unsafe.getObject(obj2, j3);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i7] + " is present but null: " + obj2.toString());
            }
            d6 o4 = o(i7);
            if (!i(i10, i7, obj)) {
                if (h(object)) {
                    b5 zzc = o4.zzc();
                    o4.d(zzc, object);
                    unsafe.putObject(obj, j3, zzc);
                } else {
                    unsafe.putObject(obj, j3, object);
                }
                o6.j(obj, iArr[i7 + 2] & 1048575, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j3);
            if (!h(object2)) {
                b5 zzc2 = o4.zzc();
                o4.d(zzc2, object2);
                unsafe.putObject(obj, j3, zzc2);
                object2 = zzc2;
            }
            o4.d(object2, object);
        }
    }

    public final void s(int i7, Object obj) {
        int i10 = this.a[i7 + 2];
        long j3 = 1048575 & i10;
        if (j3 == 1048575) {
            return;
        }
        o6.j(obj, j3, (1 << (i10 >>> 20)) | o6.e(obj, j3));
    }

    public final boolean t(b5 b5Var, b5 b5Var2, int i7) {
        return u(i7, b5Var) == u(i7, b5Var2);
    }

    public final boolean u(int i7, Object obj) {
        int i10 = this.a[i7 + 2];
        long j3 = i10 & 1048575;
        if (j3 == 1048575) {
            int m10 = m(i7);
            long j10 = m10 & 1048575;
            switch (l(m10)) {
                case 0:
                    if (Double.doubleToRawLongBits(o6.c.a(obj, j10)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(o6.c.b(obj, j10)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (o6.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (o6.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (o6.e(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (o6.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (o6.e(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return o6.c.g(obj, j10);
                case 8:
                    Object h7 = o6.h(obj, j10);
                    if (h7 instanceof String) {
                        if (((String) h7).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(h7 instanceof u4)) {
                            throw new IllegalArgumentException();
                        }
                        if (u4.c.equals(h7)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (o6.h(obj, j10) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (u4.c.equals(o6.h(obj, j10))) {
                        return false;
                    }
                    break;
                case 11:
                    if (o6.e(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (o6.e(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (o6.e(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (o6.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (o6.e(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (o6.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (o6.h(obj, j10) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & o6.e(obj, j3)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean v(Object obj, int i7, int i10, int i11, int i12) {
        return i10 == 1048575 ? u(i7, obj) : (i11 & i12) != 0;
    }

    @Override // com.google.android.gms.internal.cast.d6
    public final b5 zzc() {
        return (b5) ((b5) this.c).h(4, null);
    }
}
